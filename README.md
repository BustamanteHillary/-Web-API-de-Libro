# -Web-API-de-Libro
Utilicé Spring Initializr para generar un nuevo proyecto Spring Boot con la dependencia Web. Esto proporciona un punto de partida para desarrollar aplicaciones web utilizando el framework Spring Boot.
Se creó una clase llamada Libro en el paquete com.tuuniversidad.models. Esta clase representa la entidad de un libro con los campos especificados: id, título, autor, editorial y año de publicación.
En el paquete com.tuuniversidad.repository, se creó un repositorio para contener objetos quemados de los libros. Este repositorio proporciona métodos para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en los libros.
 En el paquete com.tuuniversidad.service, se creó un servicio que llama a una instancia del repositorio para realizar operaciones en los libros. Este servicio encapsula la lógica de negocio relacionada con los libros.
 En el paquete com.tuuniversidad.controllers, se creó una clase LibroController que contiene los endpoints para la API REST. Los endpoints definidos son:
GET /libros: Retorna una lista de todos los libros.
GET /libros/{id_libro}: Retorna un libro por su id.
POST /libros: Crea un nuevo libro.
Utilicé herramientas como Postman o CURL para probar todos los endpoints de la API. Cada endpoint se probó para asegurarse de que funcionara correctamente y devolviera los resultados esperados.
![WhatsApp Image 2024-05-19 at 9 02 50 PM](https://github.com/BustamanteHillary/-Web-API-de-Libro/assets/170289017/78818c0d-980b-47b1-b056-f2a4544d5690)
![WhatsApp Image 2024-05-19 at 9 02 51 PM](https://github.com/BustamanteHillary/-Web-API-de-Libro/assets/170289017/5630190a-a5bd-45b1-a393-4c9e4232e780)
![WhatsApp Image 2024-05-19 at 9 02 51 PM (2)](https://github.com/BustamanteHillary/-Web-API-de-Libro/assets/170289017/19ff053d-547c-4cdc-8dac-2825311a2875)
![WhatsApp Image 2024-05-19 at 9 02 51 PM (1)](https://github.com/BustamanteHillary/-Web-API-de-Libro/assets/170289017/2dc266f7-1007-45ba-bf01-39b552bcf3fc)
