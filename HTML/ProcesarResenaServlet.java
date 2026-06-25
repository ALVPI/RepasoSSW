package HTML.CSS;
import HTML.CSS.model.Resena;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.*;
import javax.servlet.http.*;

public class ProcesarResenaServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // 1. Capturar los datos del formulario HTML
        // ¡CUIDADO! Tu HTML debe tener estos 'name' exactos
        String titulo = request.getParameter("titulo_obra");
        String tipoObra = request.getParameter("tipo_obra"); // Espera un select
        int nota = Integer.parseInt(request.getParameter("puntuacion")); // Espera botones de radio (1 al 5)
        String textoComentario = request.getParameter("comentario_texto"); // Espera un textarea
        
        // El checkbox: si no se marca, llega como null
        boolean laRecomienda = request.getParameter("recomendar_check") != null;

        // 2. Crear el objeto
        Resena nuevaResena = new Resena(titulo, tipoObra, nota, textoComentario, laRecomienda);

        // 3. Guardar en la sesión (simulando una base de datos)
        HttpSession session = request.getSession();
        List<Resena> listaResenas = (List<Resena>) session.getAttribute("historialResenas");
        
        if (listaResenas == null) {
            listaResenas = new ArrayList<>();
        }
        listaResenas.add(nuevaResena);
        session.setAttribute("historialResenas", listaResenas);

        // 4. Redirigir a una página que mostrará la tabla (que tú también debes diseñar)
        response.sendRedirect("mis_resenas.jsp");
    }
}