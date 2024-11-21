# API Spring

## Descripción
Este proyecto es una API RESTful creada con **Spring Boot**. Permite la gestión de recursos relacionados con libros, incluyendo la creación, lectura, actualización y eliminación (CRUD).

## Funcionalidades
- **Listar todos los libros**: Recupera todos los libros disponibles en la base de datos.
- **Buscar libro por ISBN**: Obtén los detalles de un libro específico usando su ISBN.
- **Crear un libro**: Agrega un nuevo libro a la base de datos.
- **Actualizar un libro**: Modifica los detalles de un libro existente.
- **Eliminar un libro**: Elimina un libro usando su ISBN.

## Requisitos previos
Asegúrate de tener instalados los siguientes programas:
- [Java 17+](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/)
- [Git](https://git-scm.com/)
- [Postman](https://www.postman.com/) (opcional, para probar la API)

## Instalación
Sigue estos pasos para configurar el proyecto en tu máquina local:

1. Clona este repositorio:
   ```bash
   git clone git@github.com:evymari/api-spring.git
   cd api-spring
Configura el proyecto con Maven:

bash
Copiar código
mvn clean install
Ejecuta la aplicación:

bash
Copiar código
mvn spring-boot:run
La API estará disponible en http://localhost:8080.

Endpoints
Libros
Método	Endpoint	Descripción	Ejemplo de Request Body
GET	/books	Obtiene todos los libros	-
GET	/books/{isbn}	Obtiene un libro por su ISBN	-
POST	/books	Crea un nuevo libro	{ "title": "Nuevo Título", "author": "Nuevo Autor", "isbn": "A125" }
PUT	/books/{isbn}	Actualiza los datos de un libro por ISBN	{ "title": "Título actualizado", "author": "Autor actualizado" }
DELETE	/books/{isbn}	Elimina un libro por su ISBN	-
Tecnologías utilizadas
Java: Lenguaje de programación principal.
Spring Boot: Framework para el desarrollo de la API.
Maven: Herramienta de gestión de dependencias.
In-Memory Database: Base de datos en memoria para pruebas (por ejemplo, H2)
