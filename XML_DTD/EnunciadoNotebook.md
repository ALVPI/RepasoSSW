```markdown
# Ejercicios de Modelado en XML y DTD

## Ejercicio 1: Libros de una biblioteca
Se desea crear documentos XML sobre libros de una biblioteca. Cada libro tendrá un título, cero o más autores, un ISBN, una editorial y un año. Escriba un documento DTD para este formato y un documento XML usando este DTD para representar la siguiente información:

* **Título:** Murach's Java Servlets and JSP.
* **Autores:** Andrea Steelman y Joel Murach.
* **ISBN:** 978-1890774448.
* **Editorial:** Mike Murach Associates.
* **Año:** 2008.

* **Título:** Web Services: Concepts, Architectures and Applications.
* **Autores:** Gustavo Alonso, Fabio Casati, Harumi Kuno y Vijay Machiraju.
* **ISBN:** 978-3642078880.
* **Editorial:** Springer.
* **Año:** 2010.

---

## Ejercicio 2: Factura comercial
Escriba un documento XML que permita modelar la siguiente factura y construya también el DTD correspondiente:

* **Encabezado:** FACTURA nº 999, Fecha: 12-01-2005.
* **Datos de la empresa:** Equipos Digitales S.L., Av. Manzano s/n, Madrid 28015, C.I.F.: Q-9876543.
* **Datos del cliente:** Darío Bueno Gutiérrez, Av. Oporto nº7 4ºd, Madrid 28043.
* **Líneas de la factura**:
  1. `Referencia`: MI93 | `Descripción`: PENTIUM IV | `Cantidad`: 1 | `Precio`: 230 | `I.V.A.`: 16 | `Importe`: 266,80
  2. `Referencia`: MB84 | `Descripción`: PLACA BASE P4 | `Cantidad`: 1 | `Precio`: 180 | `I.V.A.`: 16 | `Importe`: 208,80
  3. `Referencia`: ME32 | `Descripción`: DIMM DDR 512MB | `Cantidad`: 2 | `Precio`: 40 | `I.V.A.`: 16 | `Importe`: 92,80
  4. `Referencia`: HDA7 | `Descripción`: DISCO DURO 250GB | `Cantidad`: 4 | `Precio`: 120 | `I.V.A.`: 16 | `Importe`: 556,80
* **Totales:** Base imponible: 970,00 | % I.V.A.: 16 | Cuota I.V.A.: 155,20 | TOTAL FACTURA: 1125,20.

---

## Ejercicio 3: Torneo de fútbol
Se desea crear documentos XML para representar la información de los partidos de un torneo de fútbol. En cada partido hay que modelar dos equipos (uno de ellos juega en casa), el resultado, los goles, las tarjetas y el árbitro del partido. Para cada gol hay que indicar el jugador que ha marcado, si ha sido de penalti o en propia puerta y el minuto del gol. Para cada tarjeta hay que indicar el jugador, el minuto y tipo de tarjeta (amarilla o roja). Escriba el documento DTD para este formato y el documento XML usando este DTD para representar la siguiente información:

### Partido 1
* **Encuentro:** Athletic – Real Madrid.
* **Resultado:** 1-0.
* **Goles:** 1-0 Aduriz minuto 26.
* **Árbitro:** Undiano Mallenco.
* **Tarjetas amarillas:** Kross (minuto 12), Aduriz (minuto 24), Etxeita (minuto 36), Illaramendi (minuto 72), Isco (minuto 80), Gurpegui (minuto 85) y Marcelo (minuto 89).

### Partido 2
* **Encuentro:** Deportivo – Sevilla.
* **Resultado:** 3-4.
* **Goles:** 1-0 Oriol Riera minuto 28; 1-1 Vitolo minuto 32; 1-2 Vitolo minuto 51; 1-3 Gameiro de penalti minuto 64; 2-3 Oriol Riera minuto 73; 2-4 Sidnei en propia puerta minuto 82; 3-4 Lucas Pérez de penalti minuto 90.
* **Árbitro:** Teixeira.
* **Tarjetas amarillas:** Iborra (minuto 24), Krychowiak (minuto 48), Banega (minuto 70) y Figueiras (minuto 84).

---

## Ejercicio 4: Películas y actores con referencias (ID e IDREF)
Se desea crear documentos XML para representar la información de películas y actores de cine. Para cada película es necesario guardar la siguiente información: título, año, director, guionistas (uno o más), actores (uno o más) y premios (para cada premio nombre, categoría y año). Para cada actor es necesario guardar la siguiente información: nombre, año de nacimiento, país. 

**Condición clave:** Actores y películas se modelarán por separado, puesto que un actor puede aparecer en varias películas. Cada actor tiene un identificador único. Las películas hacen referencia a los actores empleando ese identificador único, para lo cual puedes utilizar atributos de tipo `ID` e `IDREF`. Escriba el documento DTD para este formato y el documento XML usando este DTD para representar la siguiente información:

### Películas
1. *Ocho apellidos vascos*. Año: 2014. Director: Emilio Martínez Lázaro. Guionistas: Borja Cobeaga y Diego San José. Actores: Clara Lago, Dani Rovira, Carmen Machi y Karra Elejalde. Premios: Goya a mejor actriz de reparto 2015; Goya a mejor actor de reparto 2015; Goya a mejor actor revelación 2015.
2. *Ahora o nunca*. Año: 2015. Director: María Ripoll. Guionistas: Jorge Lara y Francisco Roncal. Actores: María Valverde, Clara Lago, Alicia Rubio y Dani Rovira.

### Actores
* **Clara Lago:** Año de nacimiento: 1990. País: España.
* **Dani Rovira:** Año de nacimiento: 1980. País: España.
* **Carmen Machi:** Año de nacimiento: 1963. País: España.
* **Karra Elejalde:** Año de nacimiento: 1960. País: España.
* **María Valverde:** Año de nacimiento: 1987. País: España.
* **Alicia Rubio:** Año de nacimiento: 1983. País: España.
```