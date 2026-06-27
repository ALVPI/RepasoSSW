Aquí tienes el resumen detallado por temas con las preguntas tipo examen, envuelto en un bloque de código Markdown puro para que puedas copiarlo y guardarlo directamente en tu archivo `.md`:

```markdown
# Resumen Temático: Servicios y Sistemas Web

## Tema 1: Arquitectura de Aplicaciones Web y Entorno J2EE

### Contenidos Clave
* **Protocolo HTTP:** El protocolo HTTP funciona mediante peticiones y respuestas, y se caracteriza por no guardar el estado (es "stateless"), por lo que cada vez que se carga una página no se conservan los datos previos automáticamente.
* **Arquitectura de 3 capas:** Las aplicaciones web dividen su funcionalidad en la Capa de Presentación (interfaz del usuario), la Capa de Aplicación o lógica de negocio (procesamiento) y la Capa de Datos (almacenamiento).
* **Patrón MVC (Modelo-Vista-Controlador):** Separa la aplicación en tres componentes para facilitar el mantenimiento: el Modelo gestiona los datos de la aplicación, la Vista presenta los datos (interfaz) y el Controlador responde a las acciones del usuario y dirige el flujo.
* **Entorno J2EE:** Especificación estándar no propietaria para servidores de aplicaciones Java (como Tomcat) que ejecutan Servlets, JSP y Enterprise Java Beans dentro de contenedores.

### 📝 Preguntas tipo examen
1. **Pregunta:** ¿Cuál es la función principal de cada uno de los componentes del patrón MVC en una aplicación web Java?
   * *Respuesta esperada:* El **Modelo** (Clases Java/JavaBeans) gestiona los datos y lógica de negocio. La **Vista** (Páginas HTML/JSP) presenta la información al usuario. El **Controlador** (Servlets) recibe las peticiones HTTP, interactúa con el modelo y decide qué vista devolver.
2. **Pregunta:** ¿Cuáles son las tres capas principales de la arquitectura de aplicaciones web?
   * *Respuesta esperada:* Capa de Presentación, Capa de Aplicación (lógica de negocio) y Capa de Datos.

---

## Tema 2: Tecnologías Frontend (HTML y CSS)

### Contenidos Clave
* **Estructura HTML:** Lenguaje de marcado (`<etiquetas>`) que especifica el contenido y la estructura web. Un documento consta de `<!DOCTYPE html>`, `<head>` (información declarativa, scripts y estilos) y `<body>` (el contenido real).
* **Formularios (`<form>`):** Permiten obtener información del usuario. Poseen atributos como `action` (para indicar a dónde se envían los datos) y emplean inputs como `text`, `password`, `checkbox`, `radio` y `hidden` (este último muy útil para superar las limitaciones de estado de HTTP).
* **CSS:** Permite separar el contenido de la presentación visual. Una regla CSS consta de un selector y una declaración compuesta de propiedades y valores (ej. `h1 {color: blue;}`).

### 📝 Preguntas tipo examen
1. **Pregunta:** ¿Para qué sirve el elemento `<input type="hidden">` si no es visible para el usuario?
   * *Respuesta esperada:* Sirve para almacenar y enviar información oculta al servidor, lo cual es útil como mecanismo para comunicar datos entre páginas superando las limitaciones del protocolo HTTP que carece de estado.
2. **Pregunta:** Indique la principal ventaja de utilizar hojas de estilo CSS frente a las etiquetas de presentación en HTML.
   * *Respuesta esperada:* La separación total entre el contenido y la presentación, lo que aporta la flexibilidad de cambiar el aspecto completo de una web simplemente modificando el archivo de estilo asociado.

---

## Tema 3: Intercambio de Datos (XML y JSON)

### Contenidos Clave
* **XML (Extensible Markup Language):** Lenguaje estricto derivado de SGML que separa contenido de presentación y utiliza etiquetas que se autodefinen. 
  * Un documento debe seguir una estructura jerárquica de árbol y estar correctamente anidado.
* **DTD (Document Type Definition):** Describe la estructura de un documento XML especificando qué elementos son válidos y cuántas veces pueden aparecer mediante símbolos como `*` (cualquier número de veces), `+` (al menos una vez), `?` (una o ninguna) o `|` (alternativas).
* **JSON (JavaScript Object Notation):** Formato de texto más sencillo, compacto y rápido de procesar que XML. Encierra los objetos entre llaves `{}` con propiedades en pares de "nombre":"valor", y los arrays entre corchetes `[]`. En JavaScript, la función `JSON.stringify()` convierte un objeto a texto JSON.

### 📝 Preguntas tipo examen
1. **Pregunta:** Explique la diferencia entre los atributos `ID` e `IDREF` en un documento XML o DTD.
   * *Respuesta esperada:* `ID` establece un identificador único para un elemento en el documento, mientras que `IDREF` o `IDREFS` se utiliza para referenciar uno o varios identificadores `ID` que ya existen en el documento.
2. **Pregunta:** Enumere al menos tres ventajas que ofrece JSON en comparación con XML.
   * *Respuesta esperada:* Es más sencillo y rápido de escribir, resulta en un formato más compacto y es más rápido de procesar.

---

## Tema 4: Backend con Java (Servlets, JSP y JavaBeans)

### Contenidos Clave
* **Servlets:** Clases Java que controlan el flujo de la aplicación. Su configuración y mapeo se suele hacer en el descriptor de despliegue `web.xml`.
* **JSP (JavaServer Pages):** Implementan la Vista del patrón MVC y admiten código incrustado mediante etiquetas como `<% ... %>` (código Java) y `<%= ... %>` (expresiones).
* **JavaBeans:** Objetos Java modulares y reutilizables que deben tener un constructor sin argumentos y métodos estandarizados `get` y `set` para acceder a sus propiedades.
* **Contexto y Ámbitos:** Como HTTP no guarda estado, J2EE permite compartir información en diferentes ámbitos. Por ejemplo, el `ServletContext` (contexto de aplicación) comparte datos entre todos los componentes de la aplicación web globalmente.

### 📝 Preguntas tipo examen
1. **Pregunta:** ¿Cuáles son las dos reglas de diseño obligatorias que debe cumplir una clase Java para ser considerada un JavaBean?
   * *Respuesta esperada:* Debe tener un constructor sin argumentos y sus propiedades deben ser accesibles mediante métodos estandarizados `get` y `set`.
2. **Pregunta:** ¿Para qué sirve el objeto `ServletContext` en una aplicación web Java?
   * *Respuesta esperada:* Permite compartir información de forma global entre todos los componentes (Servlets, JSP) que forman una aplicación web.

---

## Tema 5: Tecnologías Asíncronas (AJAX y REST)

### Contenidos Clave
* **AJAX (Asynchronous JavaScript and XML):** Permite cargar datos del servidor de manera asíncrona, modificando fragmentos de la página sin recargarla por completo.
* **REST (Representational State Transfer):** Filosofía arquitectónica que expone recursos mediante URLs y utiliza de forma semántica los métodos HTTP (GET para leer, POST para añadir, PUT para modificar, DELETE para borrar) para realizar operaciones CRUD.
* Las APIs REST frecuentemente se implementan usando el patrón **Front Controller**, que interpreta rutas y redirige al manejador adecuado, y envían los datos utilizando formatos estructurados como JSON o XML.

### 📝 Preguntas tipo examen
1. **Pregunta:** En una arquitectura RESTful, ¿cómo se mapean los métodos HTTP con las operaciones CRUD?
   * *Respuesta esperada:* Se utiliza `GET` para leer datos, `POST` para añadir o insertar datos, `PUT` para modificar o actualizar, y `DELETE` para borrar datos.
2. **Pregunta:** ¿Qué ventaja principal aporta la tecnología AJAX a una aplicación web?
   * *Respuesta esperada:* Permite realizar peticiones asíncronas en segundo plano, logrando una experiencia rica y sin esperas al modificar dinámicamente partes de la interfaz del usuario sin recargar toda la página web.

---

## Tema 6: Frameworks Web Modernos

### Contenidos Clave
* **Principios y Patrones:** Los frameworks modernos simplifican el desarrollo utilizando MVC y patrones como **Convention over Configuration (CoC)**, que reduce las decisiones a tomar fijando normas por defecto, y **Don't Repeat Yourself (DRY)**, que evita código duplicado.
* **Frameworks Backend:** Se ejecutan en el servidor (ej. Spring y Struts para Java, Django para Python, Laravel para PHP, Ruby on Rails) y aportan herramientas potentes como inyección de dependencias y Mapeo Objeto-Relacional (ORM) como Hibernate.
* **Frameworks Frontend:** Se ejecutan en el cliente para el diseño y comportamiento de la vista (ej. AngularJS, ReactJS con su DOM virtual unidireccional, Bootstrap para diseño responsivo, o la biblioteca jQuery).

### 📝 Preguntas tipo examen
1. **Pregunta:** ¿En qué consiste el principio "Convention over Configuration" utilizado por frameworks modernos?
   * *Respuesta esperada:* Es un paradigma que busca reducir el número de decisiones que debe tomar el desarrollador, estableciendo comportamientos predeterminados (por convención, como que una clase asuma el nombre de su tabla en la BD). Sólo se requiere configuración manual si se necesita cambiar ese comportamiento por defecto.
2. **Pregunta:** ¿Cuál es la diferencia principal, de cara a la ubicación de ejecución, entre los frameworks Spring y AngularJS?
   * *Respuesta esperada:* Spring es un framework backend que se ejecuta en el servidor, mientras que AngularJS es un framework frontend que se ejecuta en el cliente (navegador web).
```
