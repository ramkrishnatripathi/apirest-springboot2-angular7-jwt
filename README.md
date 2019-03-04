# Apirest (Springboot2+angular7+jwt)

Hecho para gestionar Sorting

## Configuraciones

### General

1. Clonar el repositorio
   `git clone https://github.com/mjavint/apirest-springboot2-angular7-jwt.git`

### Spring Boot 2

1. Acceder al proyecto
   cd apirest-springboot2-angular7-jwt/backend

2. Agregar las configuraciones iniciales para el servidor
   Localizar en la carpeta backend/src/main/resources el fichero application.properties

- Crear la base de datos `db_sorting` en el servidor

- Modificar el Datasource `application.properties`

```
spring.datasource.url=jdbc:postgresql://ip_server:5432/db_sorting
spring.datasource.driver-class-name=org.postgresql.Driver
spring.datasource.username=usuario_a_definir
spring.datasource.password=password_a_definir
```

3. Iniciar el servidor
   En Mac/Linux
   `./gradlew bootRun`

En Windows
gradlew.bat bootRun

4. La dirección de la api es:
   `http://ip_servidor:8080`
   Si no se registran no se ve o sea que por defecto está protegida

### Angular 7

1. Iniciar la app
   `ng serve` o `npm start`

2. Ir a la dirección (Registro inicial):
   `http://ip_servidor:4200/register`

3. Luego este salta al Login del usuario
   se registra con el correo y por supuesto el password

4. La app está Internacionalizada
   Se le puede agregar otros ideomas

## Tecnologías empleadas

- Spring Boot versión 2.1.3

- Angular versión 7.2

- Angular Material 2 versión 7.2

- Flex Layout

## Observaciones

- Está internacionalizada

- La app no está estable se continúa trabajando

- La app es responsiva y usa una interfaz estilo Android con Material Design
