CREATE TABLE Company
(
    id                UUID PRIMARY KEY,
    name              VARCHAR(255) NOT NULL,
    description       TEXT,
    address           VARCHAR(255),
    type              VARCHAR(100),
    numberOfEmployees INT,
    createdAt         TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    updatedAt         TIMESTAMP WITHOUT TIME ZONE
);