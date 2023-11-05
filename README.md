<h1 align="center">Bootcamp: Java Backend</h1>


## 📚 Acerca del repositorio
Repositorio con la guía teórica y las soluciones a los ejercicios de aprendizaje que se encuentran al final de cada una de estas. Material teórico perteneciente al bootcamp "Back-end con Java" de Globant y Egg Cooperation.


## 📋 Temario

| N°  | Tema                                   | Guía                                                                                                         | Ejercicios |
| :-: | -------------------------------------- | :----------------------------------------------------------------------------------------------------------: | :--------: |
| 01  | POO (Programación Orientada a Objetos) | [Abrir](https://github.com/misicode/Globant-JavaBootcamp/blob/main/_01POO/Guide/POO.pdf)                     | [Ver](https://github.com/misicode/Globant-JavaBootcamp/blob/main/_01POO/Guide/Exercises) |
| 02  | JUnit                                  | [Abrir](https://github.com/misicode/Globant-JavaBootcamp/blob/main/_02JUnit/Guide/JUnit.pdf)                 | [Ver](https://github.com/misicode/Globant-JavaBootcamp/blob/main/_02JUnit/Guide/Exercises) |
| 03  | Colecciones                            | [Abrir](https://github.com/misicode/Globant-JavaBootcamp/blob/main/_03Collections/Guide/Collections.pdf)     | [Ver](https://github.com/misicode/Globant-JavaBootcamp/blob/main/_03Collections/Guide/Exercises) |
| 04  | Relaciones entre Clases                | [Abrir](https://github.com/misicode/Globant-JavaBootcamp/blob/main/_04Relationships/Guide/Relationships.pdf) | [Ver](https://github.com/misicode/Globant-JavaBootcamp/blob/main/_04Relationships/Guide/Exercises/) |
| 05  | Herencia                               | [Abrir](https://github.com/misicode/Globant-JavaBootcamp/blob/main/_05Inheritance/Guide/Inheritance.pdf)     | [Ver](https://github.com/misicode/Globant-JavaBootcamp/blob/main/_05Inheritance/Guide/Exercises/) |
| 06  | JDBC (Java Database Connectivity)      | [Abrir](https://github.com/misicode/Globant-JavaBootcamp/blob/main/_06JDBC/Guide/JDBC.pdf)                   | [Ver](https://github.com/misicode/Globant-JavaBootcamp/blob/main/_06JDBC/Guide/Exercises/) |
| 07  | JPA (Java Persistence API)             | [Abrir](https://github.com/misicode/Globant-JavaBootcamp/blob/main/_07JPA/Guide/JPA.pdf)                     | [Ver](https://github.com/misicode/Globant-JavaBootcamp/blob/main/_07JPA/Exercises/) |


## 💻 Configuración
Se utilizaron las siguientes dependencias para la resolución de algunos ejercicios. Dentro del archivo `pom.xml` de su proyecto, busqué la etiqueta `<dependencies>` y agregue la siguiente lista de dependencias.

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

A su vez, se realizó la siguiente configuración para la persistencia de datos con Hibernate y el conector de la base de datos de MySQL para la resolución del ejercicio de la sección 07 JPA.

Dentro del archivo `persistence.xml` que se ubica en la carpeta `META-INF` de su proyecto, agregue todo el siguiente fragmento de código.

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<persistence xmlns="https://jakarta.ee/xml/ns/persistence" version="3.0">
    <persistence-unit name="libraryJPA" transaction-type="RESOURCE_LOCAL">
        <provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>
        <class>org.amincia._07JPA.entity.Author</class>
        <class>org.amincia._07JPA.entity.Editorial</class>
        <class>org.amincia._07JPA.entity.Book</class>
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

Y dentro de este mismo archivo `persistence.xml`, debe modificar el contenido del campo `value=""` de las siguientes propiedades, con los valores de conexión a su base de datos personal.

```xml
<property name="jakarta.persistence.jdbc.url" value="your_url"/>
<property name="jakarta.persistence.jdbc.user" value="your_user"/>
<property name="jakarta.persistence.jdbc.password" value="your_password"/>
```


## 🛠️ Herramientas utilizadas

| Herramienta    | Uso                                                                                                                  | Versión |
| -------------- | -------------------------------------------------------------------------------------------------------------------- | ------- |
| [![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)](https://www.jetbrains.com/idea/download/) | Entorno de desarrollo donde se realizaron los ejercicios | 2023.2 Ultimate Edition
| [![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)](https://dev.java)                                              | Lenguaje de programación orientado a objetos | 17.0.1
| [![Apache Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)](https://maven.apache.org)                             | Herramienta para la gestión de dependencias | 3.9.2
| [![JUnit 5](https://img.shields.io/badge/Junit5-25A162?style=for-the-badge&logo=junit5&logoColor=white)](https://junit.org/junit5/docs/current/user-guide/)                | Framework para realizar pruebas unitarias | 5.9.1
| [![MySQL](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white)](https://dev.mysql.com/doc/)                                           | Gestor para el manejo de bases de datos relacional con SQL | 8.0.34 Community
| [![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)](https://hibernate.org/orm/documentation/6.3/)             | ORM para persistir los objetos en la base de datos | 5.6.15.Final


## 📝 Créditos
Este repositorio surgió como parte del bootcamp "Back-end con Java" gracias a la convocatoria de becas "Code your Future", organizado por Globant University. Para obtener más información y estar atento a próximas convocatorias visite el siguiente [enlace](https://more.globant.com/becas-cyf-globant-university).
