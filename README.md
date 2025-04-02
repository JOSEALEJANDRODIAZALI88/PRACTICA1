# 📌 CRUD de Estudiantes en Spring Boot

Este proyecto es una API REST desarrollada con **Spring Boot**, que permite gestionar estudiantes mediante operaciones CRUD (**Crear, Leer, Actualizar y Eliminar**).

## 🚀 Tecnologías Utilizadas

- **Java 23**
- **Spring Boot 3**
- **Spring Web** (para crear la API REST)
- **Spring Data JPA** (para la gestión de datos)
- **H2 Database** (base de datos en memoria para pruebas)
- **Lombok** (para reducir código repetitivo)

## 📁 Estructura del Proyecto

```
📦 src/main/java/com/PRACTICA1
 ┣ 📂 controller    # Controlador con los endpoints REST
 ┣ 📂 service       # Lógica de negocio
 ┣ 📂 repository    # Acceso a datos (simulado en memoria)
 ┣ 📂 dto           # Data Transfer Objects (DTOs)
 ┣ 📂 model         # Entidades del proyecto
 ┣ 📜 EstudiantesApplication.java  # Clase principal
```

## 📌 Endpoints Disponibles

| Método | Endpoint              | Descripción                        |
|--------|----------------------|------------------------------------|
| `POST` | `/estudiantes`        | Crear un nuevo estudiante         |
| `GET`  | `/estudiantes`        | Obtener todos los estudiantes     |
| `GET`  | `/estudiantes/{id}`   | Obtener un estudiante por su ID   |
| `PUT`  | `/estudiantes/{id}`   | Actualizar un estudiante existente |
| `DELETE` | `/estudiantes/{id}` | Eliminar un estudiante por ID     |

## 🛠️ Instalación y Ejecución

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/TU-USUARIO/CRUD-Estudiantes.git
   cd CRUD-Estudiantes
   ```
2. Ejecutar el proyecto con **Maven**:
   ```bash
   mvn spring-boot:run
   ```
3. La aplicación se ejecutará en:
   ```
   http://localhost:8080
   ```

## 🔥 Pruebas con Postman

1. **Crear un estudiante** (`POST` a `/estudiantes`):
   ```json
   {
       "nombre": "Ana",
       "edad": 22
   }
   ```
2. **Obtener todos los estudiantes** (`GET` a `/estudiantes`).
3. **Actualizar un estudiante** (`PUT` a `/estudiantes/{id}`).
4. **Eliminar un estudiante** (`DELETE` a `/estudiantes/{id}`).
