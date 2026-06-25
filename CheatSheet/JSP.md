```markdown
# Cheatsheet de Programación en JSP

## 1. Conceptos Básicos
* Una página JSP es esencialmente una página HTML a la que se le añade código Java.
* Cuando se solicita por primera vez, el contenedor la convierte en un *Servlet*, la compila y la ejecuta.
* En la arquitectura Modelo-Vista-Controlador (MVC), las páginas JSP implementan la **Vista**, encargándose de presentar la información.

## 2. Etiquetas JSP (Tags) Principales
* **Scriptlet (Código Java):** `<% ... %>` Se utiliza para introducir bloques de código Java.
* **Expresión:** `<%= ... %>` Evalúa la expresión, la convierte a cadena de texto llamando a `toString` y la muestra en la página.
* **Directiva:** `<%@ ... %>` Instrucciones especiales para el contenedor JSP.
* **Declaración:** `<%! ... %>` Se usa para declarar variables de instancia y métodos.
* **Comentario:** `<%-- ... --%>` Comentario propio de JSP que no se envía al cliente.

## 3. Directivas de Página más Comunes
* **Importar clases:** `<%@ page import="java.util.Date, data.*" %>`.
* **Incluir ficheros:** Ideal para cabeceras o pies de página `<%@ include file="/includes/header.html" %>`.
* **Codificación (evitar problemas de caracteres):** `<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>`.
* **Manejo de errores:** `<%@ page isErrorPage="true" %>` (permite usar el objeto implícito `exception` en esa vista).

## 4. Peticiones y Parámetros (`request`)
El objeto `request` existe de forma implícita y no es necesario crearlo:
* **Obtener un valor único de un formulario:** `request.getParameter("firstName");`.
* **Obtener múltiples valores:** `request.getParameterValues("firstName");`.
* **Obtener los nombres de todos los parámetros:** `request.getParameterNames();`.
* **Leer un atributo enviado por el controlador (MVC):** `request.getAttribute("nombre");`.

## 5. JavaBeans
Sirven para modularizar el uso de datos y reducir al máximo el código Java insertado en la página JSP.
* **Instanciar o usar un Bean:** `<jsp:useBean id="beanName" scope="scopeValue" class="package.Class"/>`.
  * *Los scopes (alcances) pueden ser:* `page` (por defecto), `request`, `session` o `application`.
* **Obtener una propiedad:** `<jsp:getProperty name="beanName" property="propertyName"/>`.
* **Modificar una propiedad:** `<jsp:setProperty name="beanName" property="propertyName" value="value"/>` (también se puede usar `param` para enlazarlo a un formulario). *(Nota: Modificar beans en la vista no es una buena práctica en MVC)*

## 6. Expression Language (EL) y JSTL
Se introdujeron para simplificar la sintaxis y sustituir el código Java por etiquetas estilo HTML.
* **JSP Expression Language (EL):** Acceso directo y simplificado a las propiedades de un Bean. Ejemplo: `${user.firstName}`.
* **JSP Standard Tag Library (JSTL):** Requiere los ficheros `jstl.jar` y `standard.jar`.
  * *Condicionales:* `<c:if test="${cart.count == 1}"> ... </c:if>`.
  * *Bucles:* `<c:forEach var="item" items="${cart.items}"> ... </c:forEach>`.
```