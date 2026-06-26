import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

// Anotación para mapear el servlet a una URL específica sin necesidad de web.xml [3]
@WebServlet(name = "PerfilServlet", urlPatterns = {"/crearPerfil"})
public class PerfilServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Obtener los parámetros enviados desde el formulario HTML [2, 4]
        String nombre = request.getParameter("nombre");
        String color = request.getParameter("color");
        
        // Validación básica: si el color está vacío, usar blanco por defecto
        if(color == null || color.trim().isEmpty()) {
            color = "#FFFFFF"; 
        }

        // Establecer el tipo de contenido que vamos a devolver al navegador [5]
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter(); // [5]
        
        // Generar la respuesta HTML y el CSS inyectado [6, 7]
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("  <title>Tu Perfil Generado</title>");
        
        // Inyección dinámica del CSS [8, 9]
        out.println("  <style type=\"text/css\">");
        out.println("    body {");
        out.println("      background-color: " + color + ";");
        out.println("      font-family: Arial, sans-serif;");
        out.println("      text-align: center;");
        out.println("      margin-top: 50px;");
        out.println("    }");
        out.println("    .tarjeta {");
        out.println("      background-color: white;");
        out.println("      border: 2px solid #333;");
        out.println("      padding: 20px;");
        out.println("      display: inline-block;");
        out.println("      border-radius: 10px;");
        out.println("    }");
        out.println("  </style>");
        out.println("</head>");
        
        // Cuerpo del documento HTML generado
        out.println("<body>");
        out.println("  <div class=\"tarjeta\">");
        out.println("    <h1>¡Hola, " + nombre + "!</h1>");
        out.println("    <p>Este es tu perfil generado dinámicamente.</p>");
        out.println("  </div>");
        out.println("</body>");
        out.println("</html>");
        
        out.close();
    }
}
