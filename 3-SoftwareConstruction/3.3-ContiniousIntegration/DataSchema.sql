CREATE TABLE "User" (
    id SERIAL PRIMARY KEY,
    name VARCHAR(25),
    dateofbirth DATE,
    email VARCHAR(50) UNIQUE,
    login VARCHAR(50),
    password VARCHAR(50),
    status VARCHAR(15) CHECK (status IN ('Active', 'Inactive', 'Blocked'))
);

CREATE TABLE friend (
    id SERIAL PRIMARY KEY,
    name VARCHAR(25),
    dateofbirth DATE,
    email VARCHAR(50),
    status VARCHAR(15) CHECK (status IN ('Friend', 'Pending', 'Blocked')),
    userid INTEGER REFERENCES "User" (id)
);

CREATE TABLE settings (
    id SERIAL PRIMARY KEY,
    background INTEGER,
    font INTEGER,
    userid INTEGER REFERENCES "User" (id)
);

CREATE TABLE chat (
    firstuser INTEGER REFERENCES "User" (id),
    seconduser INTEGER REFERENCES "User" (id)
);

ALTER TABLE "User" ADD CONSTRAINT unique_email UNIQUE (email);
ALTER TABLE "User" ADD CONSTRAINT check_name_characters CHECK (
    name ~ '^[A-Za-z]+$'
);
ALTER TABLE "User" ADD CONSTRAINT check_email_format CHECK (
    email ~ '^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$'
);

ALTER TABLE friend ADD CONSTRAINT unique_user_email UNIQUE (userid, email);
ALTER TABLE friend ADD CONSTRAINT check_name_characters CHECK (
    name ~ '^[A-Za-z]+$'
);
ALTER TABLE friend ADD CONSTRAINT check_email_format CHECK (
    email ~ '^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$'
);
