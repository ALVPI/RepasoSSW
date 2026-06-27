
```markdown
# Resumen de "Operadores" y Sintaxis en HTML, CSS y JavaScript

**Aclaración importante:** HTML y CSS **no son lenguajes de programación** (son lenguajes de marcado y de presentación, respectivamente), por lo que estrictamente no tienen operadores lógicos o aritméticos. Su funcionamiento se basa en etiquetas y selectores. El lenguaje web que sí posee operadores clásicos es **JavaScript**.

---

## 1. Sintaxis y "Operadores" de estructura en HTML
HTML sirve para estructurar el contenido. En lugar de operadores, utiliza los siguientes símbolos clave:
* **Etiquetas (Tags):** Se delimitan con los símbolos `<` (apertura) y `>` (cierre) para definir los elementos (ej. `<h1>`, `<p>`).
* **Atributos:** Se colocan dentro de la etiqueta de apertura e igualan un nombre a un valor mediante el signo `=` y comillas (ej. `<a href="http://www.uva.es">`).

---

## 2. Sintaxis y Selectores en CSS
CSS se utiliza para describir la apariencia y formato de los documentos. Utiliza reglas compuestas por un **selector** y una **declaración** encerrada entre llaves `{ }`. Sus símbolos clave son:
* **Coma `,` (Agrupación):** Sirve para agrupar varios elementos a los que se les aplicará el mismo estilo (ej. `H1, P, B {color: blue;}`).
* **Punto `.` (Clases):** Define o selecciona una clase que puede aplicarse a múltiples elementos (ej. `.texto_etiqueta { background-color: blue; }`).
* **Almohadilla `#` (Identificadores):** Selecciona el identificador (`ID`) único de un elemento concreto (ej. `#par1 { color: blue; }`).
* **Dos puntos `:` y Punto y coma `;`:** El `:` separa el nombre de la propiedad de su valor asignado, y el `;` marca el final de esa declaración.

---

## 3. Operadores reales en JavaScript
Al ser un lenguaje de programación con tipos de datos variables, bucles y condicionales, JavaScript sí dispone de operadores reales:
* **Operadores Aritméticos:** 
  * Suma, resta, multiplicación, división: `+`, `-`, `*`, `/`.
  * Módulo (resto): `%`.
  * Incremento y decremento: `++`, `--`.
* **Operadores de Comparación:** (Devuelven `true` o `false` y se usan en condicionales `if`)
  * Igual a: `==`.
  * Distinto de: `!=`.
  * Menor / Menor o igual: `<`, `<=`.
  * Mayor / Mayor o igual: `>`, `>=`.
* **Operadores Lógicos:** 
  * AND lógico: `&&`.
  * OR lógico: `||`.
  * NOT (negación): `!`.
* **Operador de Asignación:**
  * El signo `=` se usa para asignar valores a variables (ej. `var candyBarPrice = 2.50;`).
* **Operador de Concatenación:**
  * El símbolo `+` se usa también para unir cadenas de texto (ej. `"<td>"+i+","+j+"</td>"`).
```
