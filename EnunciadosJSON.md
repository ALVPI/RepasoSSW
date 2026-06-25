#Examen Ordinario 2026 (datos no exactos)
Se desea realizar un JSON para almacenar la información de unos usuarios de una página de películas y series, de cada uno de ellos se almacena nombre, apellidos, correo, lista de sus películas favoritas y de sus series favoritas.

De cada serie se desea almacenar, título, año de estreno, número de temporadas, y lista de géneros, de cada película se desea almacenar título, año de estreno, director y listado de géneros.

Almacenar la información del usuario Pepe Botella, con correo test@mail.com cuyas series favoritas son The Mandalorian y The Last Of Us y sus películas favoritas son Lalaland y Whiplass.

De The Mandalorian se sabe que se estreno en 2019, tiene 3 temporadas y sus géneros son acción drama aventura, de la serie The Last Of Us se conoce que se estreno en 2020, tiene 2 temporadas y sus generos son drama, acción y postApocaliptico.

De Lalaland se sabe que se estreno en 2016 su director es James Wan, y sus géneros son musical, drama, romance.

Por último de Whiplash se sabe que es una película del 2014 dirigida por Las hermanas Damien Chazelle, cuyos géneros son drama 

#Enunciados de la hoja
### Ejercicio 1: La Biblioteca Básica
**Objetivo:** Crear un objeto simple.
Crea un archivo JSON que represente un libro con las siguientes características:
- Título: "El nombre del viento"
- Autor: "Patrick Rothfuss"
- Año: 2007
- ¿Está disponible?: `true`
- Géneros: "Fantasía", "Aventura"

---

### Ejercicio 2: La Tienda de Videojuegos
**Objetivo:** Crear una lista (Array) de objetos.
Representa una tienda que tiene una lista llamada `videojuegos`. Cada videojuego debe tener:
- Nombre
- Plataformas (una lista como `["PC", "PS5"]`)
- Precio (un número)
Añade al menos **dos** juegos diferentes a la lista.

---

### Ejercicio 3: El objeto anidado
**Objetivo:** Crear un objeto dentro de otro objeto.
Crea un JSON para un `empleado`. Debe contener:
- Nombre y Apellidos.
- Un objeto llamado `direccion` que contenga: `calle`, `ciudad` y `codigo_postal`.
- Una lista llamada `habilidades` (ej: `["JavaScript", "HTML", "CSS"]`).