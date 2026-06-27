import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/InscripcionServlet")
public class InscripcionServlet extends HttpServlet {

    // Clase interna (POJO) para modelar al jugador
    public class Jugador {
        String alias;
        String juego;
        String equipo;
        
        public Jugador(String alias, String juego, String equipo) {
            this.alias = alias;
            this.juego = juego;
            this.equipo = equipo;
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // 1. Configurar la codificación para caracteres especiales (tildes, ñ)
        request.setCharacterEncoding("UTF-8");
        
        // 2. Capturar los parámetros exactos del formulario HTML
        String alias = request.getParameter("alias_jugador");
        String juego = request.getParameter("juego_seleccionado");
        String equipo = request.getParameter("nombre_equipo");
        String terminos = request.getParameter("acepta_terminos");

        // 3. Validación: Si no acepta los términos, mostramos un error
        if (terminos == null) {
            response.setContentType("text/html;charset=UTF-8");
            response.getWriter().println("<h3>Error: Debes aceptar las reglas del torneo.</h3>");
            response.getWriter().println("<a href='index.html'>Volver</a>");
            return;
        }

        // 4. Guardar en Sesión simulando una base de datos
        HttpSession session = request.getSession();
        List<Jugador> listaJugadores = (List<Jugador>) session.getAttribute("jugadores_torneo");
        
        if (listaJugadores == null) {
            listaJugadores = new ArrayList<>();
        }
        
        listaJugadores.add(new Jugador(alias, juego, equipo));
        session.setAttribute("jugadores_torneo", listaJugadores);

        // 5. Generar la respuesta HTML con la tabla de inscritos
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html lang='es'><head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Inscripción Completada</title>");
        out.println("<style>");
        out.println("body { font-family: 'Inter', sans-serif; background-color: #f0f4f9; padding: 20px; }");
        out.println("table { width: 100%; max-width: 600px; border-collapse: collapse; margin-top: 20px; background: white; border-radius: 8px; overflow: hidden; box-shadow: 0 4px 6px rgba(0,0,0,0.1); }");
        out.println("th, td { padding: 12px; text-align: left; border-bottom: 1px solid #ddd; }");
        out.println("th { background-color: #0b57d0; color: white; }");
        out.println("tr:nth-child(even) { background-color: #f8f9fa; }");
        out.println("a { display: inline-block; margin-top: 20px; padding: 10px 20px; background: #146c2e; color: white; text-decoration: none; border-radius: 6px; }");
        out.println("</style></head><body>");
        
        out.println("<h2>¡Inscripción exitosa, " + alias + "!</h2>");
        out.println("<p>Aquí está la lista actualizada de participantes:</p>");
        
        // Generar la tabla de inscritos iterando sobre la sesión
        out.println("<table>");
        out.println("<tr><th>Alias</th><th>Juego</th><th>Equipo</th></tr>");
        for (Jugador j : listaJugadores) {
            out.println("<tr>");
            out.println("<td>" + j.alias + "</td>");
            out.println("<td>" + j.juego + "</td>");
            out.println("<td>" + (j.equipo.isEmpty() ? "Agente Libre" : j.equipo) + "</td>");
            out.println("</tr>");
        }
        out.println("</table>");
        
        out.println("<a href='index.html'>Inscribir a otro jugador</a>");
        out.println("</body></html>");
    }
}
