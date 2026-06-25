Aquí tienes una *cheatsheet* (hoja de referencia rápida) completa en formato Markdown con todos los tipos de formularios, elementos de entrada y atributos en HTML, basada en los documentos proporcionados:

```markdown
# Cheatsheet: Formularios en HTML

Los formularios sirven para recopilar información del usuario y enviarla al servidor para que sea procesada por un programa (como CGI, PHP, o Java Servlet).

## 1. Etiqueta Principal: `<form>`
Todo formulario debe estar encapsulado dentro de la etiqueta `<form>`.
*   **`action`**: Indica la URL del script o programa en el servidor que procesará la información.
*   **`method`**: Indica cómo se envía la información al servidor.
    *   `method="get"`: Añade los datos directamente a la URL (es visible en el navegador y tiene límite de caracteres).
    *   `method="post"`: Envía los datos de forma oculta en el cuerpo de la petición HTTP.

---

## 2. Tipos de Entrada de Texto (`<input>` y `<textarea>`)
El elemento principal para introducir datos es `<input>`, cuyo comportamiento cambia según su atributo `type`. También se usa el atributo `name` para identificar el dato al enviarlo al servidor.

*   **Texto normal:** `<input type="text">`
    *   *Atributos útiles:* `size` (caracteres visibles) y `maxlength` (máximo de caracteres permitidos).
*   **Contraseñas:** `<input type="password">`
    *   Oculta la información tecleada sustituyendo los caracteres por asteriscos para información sensible.
*   **Texto multilinea:** `<textarea>`
    *   A diferencia de `<input>`, requiere etiqueta de cierre (`</textarea>`).
    *   *Atributos útiles:* `rows` (número de líneas/filas) y `cols` (número de caracteres por línea).

---

## 3. Elementos de Selección
Permiten al usuario elegir entre varias opciones predefinidas.

*   **Casillas de verificación:** `<input type="checkbox">`
    *   Permite seleccionar una o varias opciones independientes. Se pueden agrupar dándoles el mismo `name`.
*   **Botones de opción:** `<input type="radio">`
    *   Son grupos de opciones mutuamente excluyentes (solo se puede elegir una). Todos los botones del mismo grupo deben tener el mismo `name` pero distinto `value`.
*   **Listas desplegables:** `<select>` y `<option>`
    *   Crea un menú desplegable.
    *   La etiqueta `<select>` define el menú y cada `<option>` añade un elemento a la lista.
    *   Se puede usar el atributo `selected` en un `<option>` para marcarlo por defecto.

---

## 4. Botones
Sirven para ejecutar acciones sobre el propio formulario.

*   **Botón de Envío:** `<input type="submit" value="Texto">`
    *   Al pulsarlo, envía la información recopilada en el formulario a la URL indicada en el `action`.
*   **Botón de Limpiar:** `<input type="reset" value="Texto">`
    *   Restaura todos los campos del formulario a sus valores por defecto.
*   **Botón Genérico:** `<input type="button">`
    *   Botón estándar que suele utilizarse junto con eventos de JavaScript (ej. `onclick`) para desencadenar acciones personalizadas.

---

## 5. Elementos Especiales y Archivos
*   **Campo oculto:** `<input type="hidden">`
    *   No se muestra en la pantalla del navegador. Se utiliza para almacenar información oculta necesaria para el diseño de la aplicación y mantener el estado debido a las limitaciones del protocolo HTTP.
*   **Carga de archivos:** `<input type="file">`
    *   Permite al usuario seleccionar y adjuntar un archivo desde su dispositivo.

---

## 6. Etiquetas de Accesibilidad
*   **`<label>`**: 
    *   Asocia un texto descriptivo a un campo del formulario, mejorando la calidad y usabilidad de la página (especialmente útil para lectores de pantalla).
    *   Se asocia usando el atributo `for` en el `<label>`, el cual debe coincidir exactamente con el atributo `id` del elemento `<input>` correspondiente.

---

## 7. Formularios HTML5 (Tipos y Atributos Avanzados)
HTML5 incorporó nuevos atributos y tipos específicos para los elementos `<input>` que facilitan la validación y mejoran la experiencia de usuario.

### Atributos de Validación y Usabilidad HTML5:
*   **`placeholder="texto"`**: Muestra un texto atenuado por defecto cuando el campo está vacío.
*   **`autocomplete="off"`**: Evita que el navegador sugiera valores introducidos previamente.
*   **`required`**: Hace que el campo sea obligatorio antes de poder enviar el formulario.
*   **`pattern="expresión"`**: Permite usar expresiones regulares para validar el contenido. (Ej: `pattern="{13,16}"` para una tarjeta).

### Nuevos Tipos de `<input>` en HTML5:
Los navegadores modernos aplican teclados o interfaces nativas dependiendo de estos tipos:
*   **`search`**: Campo de búsqueda.
*   **`tel`**: Número de teléfono.
*   **`url`**: Direcciones web.
*   **`email`**: Direcciones de correo electrónico.
*   **`number`**: Entrada estrictamente numérica.
*   **`range`**: Selector de rango (normalmente un control deslizante).
*   **`color`**: Selector de color nativo.
*   **Fechas y tiempos**:
    *   `date`: Fecha (año, mes, día).
    *   `month`: Mes y año.
    *   `week`: Semana y año.
    *   `time`: Hora.
    *   `datetime`: Fecha y hora combinadas.
```