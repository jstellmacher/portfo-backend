# Java and Spring Boot Overview

## Java Basics

### What is Java?
Java is a widely-used, object-oriented programming language that is platform-independent. It is compiled into bytecode that runs on the Java Virtual Machine (JVM).

### Core Concepts
- **Classes and Objects:** Classes are blueprints for creating objects. Objects are instances of classes.
- **Methods:** Functions defined inside a class that describe the behavior of objects.
- **Inheritance:** Allows one class to inherit fields and methods from another.
- **Polymorphism:** Methods can be overridden or overloaded, enabling different implementations of the same method name.

### Example Java Class
```java
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void celebrateBirthday() {
        this.age++;
    }
}
```

## Spring Boot Basics

### What is Spring Boot?
Spring Boot is an extension of the Spring framework that simplifies the setup and development of new Spring applications. It provides auto-configuration, embedded servers, and production-ready features.

### Core Components
- **Application Class:** The entry point of a Spring Boot application, containing the `main` method.
    ```java
    @SpringBootApplication
    public class PortfolioApplication {
        public static void main(String[] args) {
            SpringApplication.run(PortfolioApplication.class, args);
        }
    }
    ```
- **Controller:** Handles HTTP requests and responses.
    ```java
    @RestController
    @RequestMapping("/api")
    public class PortfolioController {
        @GetMapping("/welcome")
        public String welcome() {
            return "Welcome to the Portfolio API!";
        }
    }
    ```
- **Service:** Contains business logic.
- **Repository:** Responsible for data access.

### `application.properties` File
This file is used to configure various settings for your Spring Boot application, such as server ports, database configurations, and logging levels.

#### Example Configurations
- **Server Port:**
    ```properties
    server.port=8080
    ```
- **Database Configuration:**
    ```properties
    spring.datasource.url=jdbc:h2:mem:testdb
    spring.datasource.username=sa
    spring.datasource.password=password
    spring.jpa.hibernate.ddl-auto=update
    ```
- **Logging Level:**
    ```properties
    logging.level.org.springframework=INFO
    ```

## Database Schema

### Choosing a Schema
- **Relational Database:** Use SQL databases like PostgreSQL, MySQL, or H2. Design your schema using tables and relationships to manage data effectively.
- **Schema Design:** Define tables with appropriate columns, primary keys, and relationships. For a modern application, consider using normalized tables and indexing for performance.

### Example Schema
- **User Table:**
    ```sql
    CREATE TABLE User (
        id SERIAL PRIMARY KEY,
        username VARCHAR(50) UNIQUE NOT NULL,
        password VARCHAR(255) NOT NULL,
        email VARCHAR(100),
        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );
    ```
- **Post Table:**
    ```sql
    CREATE TABLE Post (
        id SERIAL PRIMARY KEY,
        user_id INTEGER REFERENCES User(id),
        title VARCHAR(255) NOT NULL,
        content TEXT NOT NULL,
        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );
    ```

## SQL Types
- **PostgreSQL:** An advanced SQL database with strong data integrity features.
- **MySQL:** A popular open-source SQL database known for its performance and reliability.
- **H2:** An in-memory SQL database useful for development and testing.

## Technologies Used
- **Java:** Programming language for developing the backend.
- **Spring Boot:** Framework for building and running the Java application.
- **Gradle/Maven:** Build tools for managing dependencies and building the project.
- **JPA/Hibernate:** ORM tools for database interaction.
- **SQL:** Language for managing and querying relational databases.
- **PostgreSQL/MySQL/H2:** SQL databases for storing application data.

## How to Run

1. **Run the Application:**
   ```bash
   ./gradlew bootRun
   ```
2. **Access the API:**
   - Navigate to `http://localhost:8080/api/welcome` to see the welcome message.

3. **Test Endpoints:**
   - Use tools like Postman or your frontend to interact with the API endpoints.

## Additional Resources
- [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
- [Java Documentation](https://docs.oracle.com/javase/8/docs/)


```

```
portfo-backend
├─ .DS_Store
├─ .git
│  ├─ COMMIT_EDITMSG
│  ├─ HEAD
│  ├─ config
│  ├─ description
│  ├─ hooks
│  │  ├─ applypatch-msg.sample
│  │  ├─ commit-msg.sample
│  │  ├─ fsmonitor-watchman.sample
│  │  ├─ post-update.sample
│  │  ├─ pre-applypatch.sample
│  │  ├─ pre-commit.sample
│  │  ├─ pre-merge-commit.sample
│  │  ├─ pre-push.sample
│  │  ├─ pre-rebase.sample
│  │  ├─ pre-receive.sample
│  │  ├─ prepare-commit-msg.sample
│  │  ├─ push-to-checkout.sample
│  │  └─ update.sample
│  ├─ index
│  ├─ info
│  │  └─ exclude
│  ├─ logs
│  │  ├─ HEAD
│  │  └─ refs
│  │     ├─ heads
│  │     │  └─ main
│  │     └─ remotes
│  │        └─ origin
│  │           └─ main
│  ├─ objects
│  │  ├─ 0a
│  │  │  ├─ 00d5e34243d9e70312a7a628e6651e2115cc46
│  │  │  └─ 52e0f6f3e19c580c365d4192487ad3ffc81ded
│  │  ├─ 20
│  │  │  └─ 39ca0420cefeaab3ed57c477cca8be26decb4e
│  │  ├─ 22
│  │  │  └─ fd8eb8b48405473d1e84abc471fd9c9c1eb98c
│  │  ├─ 28
│  │  │  └─ 67c020ea11d17c2c4b9ab8c39800d7a99748a6
│  │  ├─ 30
│  │  │  └─ 514b69d4abee337620f37fc3602364222da448
│  │  ├─ 32
│  │  │  └─ b059f75ebe7f08e91564bb69f0b2e16c9ccb2b
│  │  ├─ 38
│  │  │  └─ 50def7e6c08818f89145c8dbaceec178681aae
│  │  ├─ 3b
│  │  │  └─ 191e41f424d6f150d0339c44cb05d5327bef11
│  │  ├─ 3e
│  │  │  └─ 5c2f8a38224f9438d26c32dc6dfff05ba600ee
│  │  ├─ 47
│  │  │  ├─ 37fddb860a62292b592424319d4cc29e8a85e1
│  │  │  └─ 62bdf9d0ec5193dfa6bb901f9cd54e91e2706e
│  │  ├─ 4a
│  │  │  └─ 8dd47503dd32d671c961aa7b609f7784738ef1
│  │  ├─ 4d
│  │  │  └─ 698cf037d5c1d5c954f6e2251253fc2dac797e
│  │  ├─ 5c
│  │  │  ├─ 8f227af9aa323cee8707ed400b0310975efd1a
│  │  │  └─ fd49ad615d02595a97530ed147da62be828b93
│  │  ├─ 64
│  │  │  └─ 033994460f07faa63f58bb17fc85b9c7aee797
│  │  ├─ 69
│  │  │  └─ 2efe18cd99ccf4a4fa7c3c7bff7a2bc9386629
│  │  ├─ 6a
│  │  │  └─ 1294b894b7ae2bb060a835d366ad9ef2c1008f
│  │  ├─ 6e
│  │  │  └─ e1c25b3b5e7748904a076542ffe0a0537583a4
│  │  ├─ 71
│  │  │  └─ 01f8e4676fcad8adc961e929ea3bcb37b5262f
│  │  ├─ 79
│  │  │  └─ 9496a936b88db1459e07a469c98314be2d47cd
│  │  ├─ 7c
│  │  │  └─ b085f26ae543f72d36e45f438107ffe3c1dffd
│  │  ├─ 85
│  │  │  └─ 8b93cb00e92a5339be456dd0b1bd06aa446003
│  │  ├─ 8c
│  │  │  └─ 89268a7e1f97b7aa0b86644987f85004961906
│  │  ├─ 8e
│  │  │  ├─ 11618fdcb0aad1391800fb9b4d1607d938f064
│  │  │  └─ de2f611f4bfaad1baf386c1730073a6d4151ac
│  │  ├─ 91
│  │  │  └─ e1cbf65615d74bd481b4fcb86e11ce14fa4c27
│  │  ├─ 97
│  │  │  └─ cad0a61520c53f26af4052904a73841aa31078
│  │  ├─ 9c
│  │  │  ├─ 7bc9027af977953f1ef0f7b89a5109ba5fbee8
│  │  │  └─ ce4d7c43177230ca5b3b73d2d6e82ea0fac084
│  │  ├─ 9d
│  │  │  └─ 284660352e86f2e8f84c935e9857754fc7ad5b
│  │  ├─ a4
│  │  │  └─ 413138c96c6ed29b6e2f5e147cd77426ae4409
│  │  ├─ b0
│  │  │  └─ 69e585f7d20f4ddd98a59bf0395c9adf24e2f4
│  │  ├─ b7
│  │  │  ├─ 40cf13397ab16efc23cba3d6234ff8433403b1
│  │  │  └─ 7859766624a679e86ac93126a08d9a723ad52f
│  │  ├─ b8
│  │  │  └─ 741daa1e8f2be864aaa281382b2e2cf86f011e
│  │  ├─ ba
│  │  │  └─ 4c4db1a1e1fc68b095bd3cd6ef646e284cd9f6
│  │  ├─ bb
│  │  │  └─ 34b1bfc079c9d19183617086be0aa4ffe26268
│  │  ├─ c2
│  │  │  └─ 065bc26202b2d072aca3efc3d1c2efad3afcbf
│  │  ├─ c3
│  │  │  └─ 76f516371ffc16ed28063c18f7e64b2012fd17
│  │  ├─ c5
│  │  │  └─ 4c78d8044510de0a8a4ebd4ac01f2986f33e5b
│  │  ├─ c6
│  │  │  └─ 314ac0d974102e7df455d43e7c76fedd3ec7a3
│  │  ├─ c8
│  │  │  └─ 44eee69895eec44cb5ecdf3792b79a47df2a01
│  │  ├─ cf
│  │  │  └─ efad7c732c864cb91a191a482e665dccc230da
│  │  ├─ d8
│  │  │  └─ 35618c4086abc47d8de5525d08117375a74c81
│  │  ├─ d9
│  │  │  └─ d474fc5863e7b5669169dd5c83b70acf45594f
│  │  ├─ e6
│  │  │  └─ 441136f3d4ba8a0da8d277868979cfbc8ad796
│  │  ├─ ee
│  │  │  ├─ 7dcb5f7e2ab4bdcc248549dc2dc112579a370f
│  │  │  └─ f3734dc25ef5df36a215815496cdbb591c1739
│  │  ├─ ef
│  │  │  └─ 28bc9c7bc55636c148a73ce31c95e24da9e386
│  │  ├─ f1
│  │  │  └─ 8cfe36ce24e452060f6033feadd77b21398736
│  │  ├─ f4
│  │  │  └─ 5110a78b30adfe62442b6380f124069d5460ae
│  │  ├─ f8
│  │  │  └─ 15d88d3f8b31cf136951ebd918d0ef2ab9dbdc
│  │  ├─ info
│  │  └─ pack
│  └─ refs
│     ├─ heads
│     │  └─ main
│     ├─ remotes
│     │  └─ origin
│     │     └─ main
│     └─ tags
├─ .gitignore
├─ README.md
├─ gradle
│  └─ wrapper
│     ├─ gradle-wrapper.jar
│     └─ gradle-wrapper.properties
├─ gradlew
├─ gradlew.bat
└─ src
   ├─ main
   │  ├─ java
   │  │  └─ com
   │  │     └─ portfo
   │  │        └─ portfolio
   │  │           ├─ PortfolioApplication.java
   │  │           ├─ controller
   │  │           │  ├─ BlogPostController.java
   │  │           │  └─ ProjectController.java
   │  │           ├─ model
   │  │           │  ├─ BlogPost.java
   │  │           │  └─ Project.java
   │  │           ├─ repository
   │  │           │  ├─ BlogPostRepository.java
   │  │           │  └─ ProjectRepository.java
   │  │           └─ service
   │  │              ├─ DataLoader.java
   │  │              └─ ProjectService.java
   │  └─ resources
   │     ├─ application.properties
   │     ├─ data.sql
   │     ├─ static
   │     └─ templates
   └─ test
      └─ java
         └─ com
            └─ portfo
               └─ portfolio
                  └─ PortfolioApplicationTests.java

```