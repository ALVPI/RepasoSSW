# Desafíos Avanzados: XML y DTD

### Ejercicio 6: Gestión de Inventario con Atributos
**Objetivo:** Implementar atributos y tipos de datos ID.
Crea un DTD y un XML para un `inventario`. 
- El inventario contiene varios elementos `producto`.
- Cada `producto` debe tener un atributo obligatorio `id` (de tipo ID) y un atributo opcional `categoria` (con valores predefinidos: "electronica", "hogar", "juguetes").
- El producto debe contener `nombre` y `stock` (número).

---

### Ejercicio 7: El Sistema de Préstamos (Relaciones ID/IDREF)
**Objetivo:** Vincular elementos mediante referencias.
Diseña un XML que represente una biblioteca con `libros` y `usuarios`. 
- Un `libro` debe tener un atributo `isbn` (tipo ID).
- Un `usuario` debe tener un atributo `dni` (tipo ID).
- Debe haber un elemento `prestamos` que contenga elementos `prestamo`.
- Cada `prestamo` debe tener atributos: `usuario_ref` (tipo IDREF para vincular al usuario) y `libro_ref` (tipo IDREF para vincular al libro).

---

### Ejercicio 8: Restricciones de contenido y cardinalidad
**Objetivo:** Dominar los cuantificadores (+, *, ?).
Modifica el sistema de usuarios y películas que hicimos anteriormente para que sea más estricto:
- Un `usuario` debe tener obligatoriamente un `correo`.
- Puede tener **cero o más** `series` favoritas.
- Debe tener **una o más** `peliculas`.
- Dentro de cada `pelicula`, el `director` es opcional (puede aparecer o no), pero los `generos` son obligatorios y debe haber al menos uno.
- Escribe el DTD que valide estas reglas exactas.