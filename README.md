<!-- PROJECT PRESENTATION -->
<div align="center">
  <a href="https://github.com/misicode/Globant-Backend_with_Java">
    <img src="https://github.com/misicode/Globant-Backend_with_Java/assets/88341114/598ac926-f1c3-4869-85c3-8347fc0fc42f" alt="Logo Icon" width="80" height="80">
  </a>

  <h1 align="center">Backend con Java</h1>

  <p align="center">
    <span>Resolución de temario de bootcamp</span><br>
    <a href="https://github.com/misicode/Globant-Backend_with_Java/issues">Reportar Bug</a>
    |
    <a href="https://github.com/misicode/Globant-Backend_with_Java/issues">Solicitar Feature</a>
  </p>
</div><br>


<!-- ABOUT THE PROJECT -->
## 📖 Acerca del repositorio

Repositorio con las soluciones a los ejercicios de aprendizaje del material teórico del bootcamp "Back-end con Java" edición 2023, de [Globant][globantuniversity-url] y [Egg Cooperation][eggcooperation-url].

### Temario

| N°  | Tema                                   | Guía                 | Ejercicios               |
| :-: | -------------------------------------- | :------------------: | :----------------------: |
| 01  | POO (Programación Orientada a Objetos) | [Abrir][guide01-url] | [Ver][guide01-exercises] |
| 02  | JUnit                                  | [Abrir][guide02-url] | [Ver][guide01-exercises] |
| 03  | Colecciones                            | [Abrir][guide03-url] | [Ver][guide01-exercises] |
| 04  | Relaciones entre Clases                | [Abrir][guide04-url] | [Ver][guide01-exercises] |
| 05  | Herencia                               | [Abrir][guide05-url] | [Ver][guide01-exercises] |
| 06  | JDBC (Java Database Connectivity)      | [Abrir][guide06-url] | [Ver][guide01-exercises] |
| 07  | JPA (Java Persistence API)             | [Abrir][guide07-url] | [Ver][guide01-exercises] |

### Desarrollado con

| Herramienta                                              | Descripción                                              | Versión                 |
| -------------------------------------------------------- | -------------------------------------------------------- | ----------------------- |
| [![Java][java-badge]][java-url]                          | Lenguaje de programación utilizado                       | 17.0.1                  |
| [![Apache Maven][maven-badge]][maven-url]                | Herramienta para la gestión de dependencias              | 3.9.2                   |
| [![JUnit 5][junit-badge]][junit-url]                     | Framework para realizar pruebas unitarias                | 5.9.1                   |
| [![MySQL][mysql-badge]][mysql-url]                       | Gestor para el manejo de bases de datos relacional       | 8.0.34 Community        |
| [![Hibernate][hibernate-badge]][hibernate-url]           | ORM para persistir los objetos en base de datos          | 5.6.15.Final            |
| [![IntelliJ IDEA][intellijidea-badge]][intellijidea-url] | Entorno de desarrollo donde se realizaron los ejercicios | 2023.2 Ultimate Edition |


<!-- GETTING STARTED -->
## 🚀 Ejecutando el proyecto

Para poner en funcionamiento una copia local de los ejercicios de este repositorio, siga los siguientes pasos.

### Requisitos previos

Obligatorio
```txt
Java >= 8.X
Maven >= 3.X
```

Opcional
```txt
IntelliJ IDEA
```

### Configuración

1. Cree un proyecto de Java con Maven en su IDE de preferencia.

2. Descargue o clone este repositorio dentro de dicho proyecto.

   ```sh
   git clone https://github.com/misicode/Globant-Backend_with_Java.git
   ```
   
3. Edite el archivo `pom.xml` y agregué la siguiente lista de dependencias en la sección de `<dependencies>`.
    
    ```xml
    <dependencies>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.9.1</version>
        </dependency>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-core-jakarta</artifactId>
            <version>5.6.15.Final</version>
        </dependency>
    </dependencies>
    ```

4. Cree el archivo `persistence.xml` dentro de la carpeta `META-INF` y agregué el siguiente fragmento de código.
    
    ```xml
    <?xml version="1.0" encoding="UTF-8" ?>
    <persistence xmlns="https://jakarta.ee/xml/ns/persistence" version="3.0">
        <persistence-unit name="libraryJPA" transaction-type="RESOURCE_LOCAL">
            <provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>
            <class>com.misicode._07JPA.Exercise.entity.Author</class>
            <class>com.misicode._07JPA.Exercise.entity.Editorial</class>
            <class>com.misicode._07JPA.Exercise.entity.Book</class>
            <properties>
                <!-- Database connection properties -->
                <property name="jakarta.persistence.jdbc.url" value="your_url"/>
                <property name="jakarta.persistence.jdbc.user" value="your_user"/>
                <property name="jakarta.persistence.jdbc.password" value="your_password"/>
                <property name="jakarta.persistence.jdbc.driver" value="com.mysql.cj.jdbc.Driver"/>
                <!-- Action to take with the generation of schemas -->
                <property name="javax.persistence.schema-generation.database.action" value="create"/>
                <!-- Specifies the database dialect -->
                <property name="hibernate.dialect" value="org.hibernate.dialect.MySQL8Dialect"/>
                <!-- Outputs the SQL queries, should be disabled in Production -->
                <property name="hibernate.show_sql" value="true"/>
            </properties>
        </persistence-unit>
    </persistence>
    ```

5. Modifiqué el contenido del campo `value=""` de las siguientes propiedades con los valores de conexión de su propia base de datos.
    
    ```xml
    <property name="jakarta.persistence.jdbc.url" value="your_url"/>
    <property name="jakarta.persistence.jdbc.user" value="your_user"/>
    <property name="jakarta.persistence.jdbc.password" value="your_password"/>
    ```


<!-- CONTACT -->
## 👩‍💻 Contacto

Desarrollado por **Alessandra Mincia**

[![Website][website-badge]][website-url]
[![GitHub][github-badge]][github-url]
[![LinkedIn][linkedin-badge]][linkedin-url]


<!-- ACKNOWLEDGMENTS -->
## 📝 Agradecimientos
Este repositorio surgió como parte del bootcamp "Back-end con Java" a través del programa de becas "Code your Future", de [Globant University][globantuniversity-url]. Para más información y estar al tanto de próximas convocatorias visite el siguiente [enlace][code-your-future-scholarship].


<!-- MARKDOWN LINKS -->
[globantuniversity-url]: https://university.globant.com
[eggcooperation-url]: https://egg.live/es-ar/
[guide01-url]: https://github.com/misicode/Globant-JavaBootcamp/blob/main/_01POO/Guide/POO.pdf
[guide01-exercises]: https://github.com/misicode/Globant-JavaBootcamp/blob/main/_01POO/Exercises/
[guide02-url]: https://github.com/misicode/Globant-JavaBootcamp/blob/main/_02JUnit/Guide/JUnit.pdf
[guide02-exercises]: https://github.com/misicode/Globant-JavaBootcamp/blob/main/_02JUnit/Exercises/
[guide03-url]: https://github.com/misicode/Globant-JavaBootcamp/blob/main/_03Collections/Guide/Collections.pdf
[guide03-exercises]: https://github.com/misicode/Globant-JavaBootcamp/blob/main/_03Collections/Exercises/
[guide04-url]: https://github.com/misicode/Globant-JavaBootcamp/blob/main/_04Relationships/Guide/Relationships.pdf
[guide04-exercises]: https://github.com/misicode/Globant-JavaBootcamp/blob/main/_04Relationships/Exercises/
[guide05-url]: https://github.com/misicode/Globant-JavaBootcamp/blob/main/_05Inheritance/Guide/Inheritance.pdf
[guide05-exercises]: https://github.com/misicode/Globant-JavaBootcamp/blob/main/_05Inheritance/Exercises/
[guide06-url]: https://github.com/misicode/Globant-JavaBootcamp/blob/main/_06JDBC/Guide/JDBC.pdf
[guide06-exercises]: https://github.com/misicode/Globant-JavaBootcamp/blob/main/_06JDBC/Exercise/
[guide07-url]: https://github.com/misicode/Globant-JavaBootcamp/blob/main/_07JPA/Guide/JPA.pdf
[guide07-exercises]: https://github.com/misicode/Globant-JavaBootcamp/blob/main/_07JPA/Exercise/
[java-badge]: https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white
[java-url]: https://dev.java
[maven-badge]: https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white
[maven-url]: https://maven.apache.org
[junit-badge]: https://img.shields.io/badge/Junit5-25A162?style=for-the-badge&logo=junit5&logoColor=white
[junit-url]: https://junit.org/junit5/docs/current/user-guide/
[mysql-badge]: https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white
[mysql-url]: https://dev.mysql.com/doc/
[hibernate-badge]: https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white
[hibernate-url]: https://hibernate.org/orm/documentation/6.3/
[intellijidea-badge]: https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white
[intellijidea-url]: https://www.jetbrains.com/idea/download/
[website-badge]: https://img.shields.io/badge/Website-000000?logo=About.me&logoColor=white&colorB=555
[website-url]: https://misicode.netlify.app/
[github-badge]: https://img.shields.io/badge/Github-%23121011.svg?logo=github&logoColor=white&colorB=555
[github-url]: https://github.com/misicode
[linkedin-badge]: https://img.shields.io/badge/-LinkedIn-black.svg?logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/misicode
[code-your-future-scholarship]: https://more.globant.com/becas-cyf-globant-university
