📖 Guía de Estudio: Explicación del Frontend (HTML y CSS)Esta guía detalla el razonamiento detrás del código de la "Agencia de Viajes", enfocándose en lo que los profesores evalúan en los exámenes de integración con Java Servlets.🏗️ PARTE 1: HTML (Estructura y Semántica)El HTML (index.html) no solo muestra cosas en pantalla, sino que es el contrato de comunicación con el servidor Java.1. Etiquetas de Agrupación Semántica<section class="contenedor-tabla">
    <h2>Tarifas Base</h2>...
</section>
¿Por qué <section>? Evita el uso excesivo de <div> (mala práctica conocida como divititis). Indica a los navegadores y lectores de pantalla que el contenido tiene un significado propio y estructurado.2. La Regla de Oro del Formulario<form action="ReservaViajesServlet" method="POST">
action: Es la URL o el nombre exacto de tu Servlet en Java (anotado con @WebServlet).method="POST": Obligatorio para enviar datos sensibles (como reservas o registros). Oculta los datos en el cuerpo de la petición, a diferencia de GET que los expone en la URL.3. La Conexión con Java (Atributo name)<input type="text" id="nombre" name="nombre_cliente" required>
name="...": Es la clave más importante del examen. El valor que pongas aquí (ej. nombre_cliente) debe ser exactamente el que uses en el backend (request.getParameter("nombre_cliente")).id="..." y <label for="...">: Mejoran la usabilidad. Al hacer clic en el texto del label, se activa automáticamente el input asociado.required: Delega la primera validación al navegador, impidiendo enviar campos vacíos sin cargar al servidor.🎨 PARTE 2: CSS (Diseño y Maquetación)El CSS (estilos.css) hace que la aplicación pase de ser un documento de texto plano a una interfaz profesional y usable.1. El Reset Básico (El Salvavidas)* {
    box-sizing: border-box;
    margin: 0;
    padding: 0;
}
box-sizing: border-box: Es el truco de CSS más crucial. Asegura que el padding o los borders no aumenten el tamaño total de un elemento, evitando que el diseño se rompa o se desborde de la pantalla.2. Imágenes en Paralelo (Flexbox).galeria-destinos {
    display: flex;
    justify-content: center;
    gap: 20px;
}
¿Por qué Flexbox? Atrás quedaron los días de usar float o tablas para maquetar. display: flex pone las imágenes en fila automáticamente. gap añade el espaciado sin complicados márgenes, y justify-content lo centra todo.3. Microinteracciones (El toque profesional).galeria-destinos img { transition: transform 0.3s ease; }
.galeria-destinos img:hover { transform: scale(1.05); }
transition y :hover: Proveen feedback visual. Cuando el usuario pasa el ratón por encima, la imagen crece un 5% de forma suave (0.3s). Esto le indica al usuario que el elemento es interactivo.4. Estilos de Formularios Actualesinput[type="text"], select {
    width: 100%;
    padding: 10px;
}
Selector de Atributo [type="text"]: Permite dar estilo a los campos de texto sin afectar a los checkboxes o radio buttons, los cuales se romperían si les pones width: 100%.Usabilidad: El padding amplio hace que los campos sean fáciles de tocar en pantallas de móviles (dedos gruesos).📝 Resumen del Mapa de ConexiónAtributo HTMLFunción PrincipalEquivalente en Java Servletaction="..."Define a qué clase enviar los datos@WebServlet("...")method="POST"Define cómo se envían los datosdoPost(...)name="..."Identificador de la variablerequest.getParameter("...")
