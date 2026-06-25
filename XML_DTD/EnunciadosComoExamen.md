# Examen Práctico: Programación XML y DTD

## Reto 1: Atributos y Estructuras (2.5 puntos)
Crea un archivo `tienda.dtd` y un `tienda.xml` siguiendo estas especificaciones:
- **Reglas:** La raíz es `<tienda>`. Debe contener elementos `<producto>`.
- **Atributos:** El `<producto>` debe tener un atributo `id` de tipo `ID` y un atributo `stock` de tipo `CDATA`.
- **Contenido:** El `<producto>` debe contener `<nombre>` y `<precio>`.
- **Ejercicio:** Crea el XML con dos productos, incluyendo al menos uno con `stock="0"`.

---

## Reto 2: Relaciones mediante ID y IDREF (2.5 puntos)
Simula una pequeña base de datos relacional para una escuela.
- **Estructura:** La raíz es `<escuela>`. Contiene los elementos `<profesores>` y `<asignaturas>`.
- **Reglas:** - Cada `<profesor>` tiene un atributo `id` (tipo `ID`).
    - Cada `<asignatura>` tiene un elemento `<nombre>` y un atributo `tutor` (tipo `IDREF` que apunta al `id` del profesor).
- **Ejercicio:** Crea el XML donde el profesor `p1` (César) sea el tutor de las asignaturas "Programación" y "Sistemas".

---

## Reto 3: Restricciones de Cardinalidad (2.5 puntos)
Define un DTD para un `<informe>`.
- **Reglas:** - Un `<informe>` debe tener obligatoriamente un `<titulo>`.
    - Debe contener uno o más `<autor>` (al menos uno).
    - Cero o más `<seccion>`.
    - Opcionalmente un `<anexo>`.
- **Ejercicio:** Escribe el DTD y un XML que contenga un informe con 2 autores, ninguna sección y sin anexo.

---

## Reto 4: Depuración de Código (2.5 puntos)
Analiza el siguiente código, encuentra los **4 errores** (de sintaxis DTD o lógica XML) y entrega la versión corregida:

**Archivo `tienda.dtd`:**
```dtd
<!ELEMENT tienda (producto*)>
<!ELEMENT producto (nombre, precio)>
<!ATTLIST producto id ID #REQUIRED>
<!ELEMENT nombre #PCDATA>
<!ELEMENT precio (#PCDATA>