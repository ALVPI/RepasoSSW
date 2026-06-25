```markdown
# Ejercicios de Formularios en HTML

## Ejercicio 1: Formulario de registro básico
Diseña un formulario HTML para el registro de un usuario. El formulario debe enviar los datos al servidor mediante el método `POST` al script llamado `procesarUsuario`. El formulario debe incluir:

* Un campo de entrada de **texto** de una sola línea para el `Nombre`. El tamaño visible debe ser de 25 caracteres y su longitud máxima permitida de 30 caracteres.
* Un campo para la **contraseña** (`password`) en el que los caracteres introducidos sean sustituidos por asteriscos.
* Utiliza la etiqueta `<label>` para asociar cada texto descriptivo con su campo de entrada correspondiente, haciendo uso del atributo `for` y del `id` del elemento.
* Dos botones en la parte inferior: uno para **Enviar** (`submit`) la información al servidor y otro para **Limpiar** (`reset`) y restaurar los valores por defecto del formulario.

---

## Ejercicio 2: Encuesta de opinión (Listas, Checkboxes y Radios)
Crea un formulario HTML para recopilar opiniones de los usuarios sobre un sitio web. El formulario debe enviarse al script `procesarEncuesta` y contener los siguientes componentes:

* Un **campo oculto** (`hidden`) con el nombre `origen` y el valor `web`.
* **Comentarios:** Un área de entrada de texto de múltiples líneas (`textarea`) que tenga un tamaño de 4 filas y 36 caracteres por línea.
* **Aspectos favorables:** Una serie de casillas de verificación (`checkbox`) para que el usuario pueda elegir varias opciones. Las opciones serán: *Diseño del sitio*, *Enlaces*, *Facilidad de uso* e *Imágenes*. Todas deben tener el mismo atributo `name`.
* **¿Cómo llegaste a este sitio web?:** Un grupo de botones de selección única (`radio`), donde solo se puede elegir uno a la vez. Las opciones serán: *Buscador*, *Enlace desde otro sitio web*, *Referencia en un libro* y *Otro*. Haz que la opción "Buscador" esté seleccionada por defecto.
* **Valore el sitio web:** Una lista desplegable (`select`) con las opciones 1, 2, 3, 4 y 5. La opción 5 debe estar seleccionada por defecto.

---

## Ejercicio 3: Formulario moderno con validaciones (HTML5)
Escribe el código de un formulario que haga uso de los nuevos tipos de atributos y elementos de entrada incorporados en las últimas versiones de HTML para recolectar información avanzada. Debe contar con:

* Un campo para indicar un número de **teléfono** (`tel`).
* Un campo para introducir una **dirección web** (`url`).
* Un campo para solicitar una **fecha** de reserva (`date`).
* Un campo de texto normal para introducir un identificador, el cual debe mostrar un **texto por defecto** (atenuado) que diga *"Escriba su identificador"* cuando esté vacío (`placeholder`).
* Un campo de entrada de texto para introducir un número de tarjeta. Este campo debe ser **obligatorio** (`required`) y debe incluir una **validación con expresiones regulares** (`pattern`) que obligue al usuario a introducir un patrón estricto de entre 13 y 16 números (utiliza el patrón `{13,16}`).
* Para este último campo de la tarjeta, asegúrate de **evitar el autocompletado** automático del navegador (`autocomplete="off"`).

---

## Ejercicio 4: Carga de archivos y envío por GET
Construye un formulario HTML diseñado para adjuntar archivos y realizar búsquedas. 

* El formulario debe utilizar el método de envío `GET` hacia la URL `buscadorArchivos`.
* Incluye un campo de texto para que el usuario introduzca un término de búsqueda (empleando el tipo `search`).
* Incluye un campo de carga de archivos para que el usuario pueda seleccionar un fichero de su disco duro (`file`).
* Finaliza el formulario con un botón de tipo `submit` que muestre el texto *"Subir y Buscar"*.
```