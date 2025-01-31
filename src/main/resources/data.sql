-- Ensure the CUSTOMER table exists
CREATE TABLE IF NOT EXISTS CUSTOMER (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255)
);

-- Insert sample customer records into the customers table


INSERT INTO CUSTOMER (name, email) VALUES ('Alice Johnson1', 'alice@example.com');
INSERT INTO CUSTOMER (name, email) VALUES ('Bob Brown1', 'bob@example.com');
INSERT INTO CUSTOMER (name, email) VALUES ('John Doe1', 'john@example.com');
INSERT INTO CUSTOMER (name, email) VALUES ('Jane Smith1', 'jane@example.com');