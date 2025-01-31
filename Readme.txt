

1. open project terminal
2.mvn spring-boot:run

http://localhost:8080/h2-console

CREATE TABLE IF NOT EXISTS customer (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255)
);


INSERT INTO customer (name, email) VALUES ('John Doe', 'john@example.com');
INSERT INTO customer (name, email) VALUES ('Jane Smith', 'jane@example.com');