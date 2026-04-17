# chatApp

A minimal real-time chat app built on Spring Boot 3 with WebSockets and a Thymeleaf-rendered UI.

## Stack

- Java 17, Spring Boot 3.1
- `spring-boot-starter-websocket` for bidirectional messaging
- `spring-boot-starter-thymeleaf` for server-rendered views
- Gradle build

## Run

```bash
./gradlew bootRun
```

The app starts on `http://localhost:8080`. Open the page in two browser tabs to chat between them.

## Build

```bash
./gradlew build
java -jar build/libs/chatApp-0.0.1-SNAPSHOT.jar
```

## Project structure

```
src/
├── main/
│   ├── java/        # Controllers, WebSocket config, message handlers
│   └── resources/   # Thymeleaf templates and application.properties
└── test/
```

## Why this exists

A small reference for wiring up STOMP-over-WebSocket in Spring Boot with a server-rendered UI — useful as a starting point before adopting a heavier frontend stack.

## License

MIT
