CREATE TABLE Company
(
    id                  UUID PRIMARY KEY,
    name                VARCHAR(255) NOT NULL UNIQUE,
    description         TEXT,
    address             VARCHAR(255),
    type                VARCHAR(100),
    number_of_employees INTEGER DEFAULT 1,
    company_size        VARCHAR(50)  NOT NULL,
    created_at          TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    updated_at          TIMESTAMP WITHOUT TIME ZONE
);