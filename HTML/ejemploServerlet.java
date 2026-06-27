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

@WebServlet("/ReservaViajesServlet")
public class ReservaViajesServlet extends HttpServlet {

    // Clase interna (POJO) para modelar la reserva
    public class Reserva {
        String cliente;
        String destino;
        int pasajeros;
        String alojamiento;
        
        public Reserva(String cliente, String destino, int pasajeros, String alojamiento) {
            this.cliente = cliente;
            this.destino = destino;
            this.pasajeros = pasajeros;
            this.alojamiento = alojamiento;
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Configurar codificación
        request.setCharacterEncoding("UTF-8");
        
        // ¡ATENCIÓN A ESTOS NOMBRES! Estos son los 'name' que tu HTML debe tener
        String cliente = request.getParameter("nombre_cliente");
        String destino = request.getParameter("destino_elegido");
        String numPasajerosStr = request.getParameter("numero_pasajeros");
        String alojamiento = request.getParameter("tipo_alojamiento");
        String terminos = request.getParameter("acepta_politica");

        // Validación básica
        if (terminos == null) {
            response.setContentType("text/html;charset=UTF-8");
            response.getWriter().println("<h3>Error: Debes aceptar la política de cancelación.</h3>");
            response.getWriter().println("<a href='index.html'>Volver</a>");
            return;
        }

        int pasajeros = 1; // Valor por defecto
        if (numPasajerosStr != null && !numPasajerosStr.isEmpty()) {
            pasajeros = Integer.parseInt(numPasajerosStr);
        }

        HttpSession session = request.getSession();
        List<Reserva> listaReservas = (List<Reserva>) session.getAttribute("reservas_agencia");
        
        if (listaReservas == null) {
            listaReservas = new ArrayList<>();
        }
        
        listaReservas.add(new Reserva(cliente, destino, pasajeros, alojamiento));
        session.setAttribute("reservas_agencia", listaReservas);

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html lang='es'><head><meta charset='UTF-8'><title>Reserva Confirmada</title>");
        out.println("<style>body { font-family: sans-serif; padding: 20px; } table { border-collapse: collapse; width: 100%; } th, td { border: 1px solid #ccc; padding: 10px; text-align: left; } th { background-color: #f4a261; color: white; }</style>");
        out.println("</head><body>");
        
        out.println("<h2>¡Reserva confirmada, " + cliente + "!</h2>");
        out.println("<p>Aquí está el listado de todas las reservas actuales de la agencia:</p>");
        
        out.println("<table>");
        out.println("<tr><th>Cliente</th><th>Destino</th><th>Pasajeros</th><th>Alojamiento</th></tr>");
        for (Reserva r : listaReservas) {
            out.println("<tr>");
            out.println("<td>" + r.cliente + "</td>");
            out.println("<td>" + r.destino + "</td>");
            out.println("<td>" + r.pasajeros + "</td>");
            out.println("<td>" + r.alojamiento + "</td>");
            out.println("</tr>");
        }
        out.println("</table>");
        
        out.println("<br><a href='index.html'>Hacer otra reserva</a>");
        out.println("</body></html>");
    }
}
