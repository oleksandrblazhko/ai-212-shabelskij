CREATE TABLE User(
id BIGSERIAL PRIMARY KEY,
name VARCHAR(25),
dateOfBirth VARCHAR(25),
email VARCHAR(50),
login VARCHAR(50),
password VARCHAR(50),
status VARCHAR(15)
);

CREATE TABLE Friend(
id BIGSERIAL PRIMARY KEY,
name VARCHAR(25),
dateOfBirth VARCHAR(25),
email VARCHAR(50),
status VARCHAR(15),
userId INTEGER FOREIGN KEY (userId) REFERENCES User (id)
);

CREATE TABLE Settings(
id BIGSERIAL PRIMARY KEY,
background INTEGER,
font INTEGER,
userId INTEGER FOREIGN KEY (User) REFERENCES User (id)
);

CREATE TABLE Chat(
firstUser INTEGER FOREIGN KEY (User) REFERENCES User (id),
secondUser INTEGER FOREIGN KEY (User) REFERENCES User (id)
);

ALTER TABLE User ADD CONSTRAINT unique_email UNIQUE (email);
ALTER TABLE User ADD CONSTRAINT check_status CHECK (status IN ('Active', 'Inactive', 'Blocked'));
ALTER TABLE Friend ADD CONSTRAINT unique_user_email UNIQUE (userId, email);
ALTER TABLE Friend ADD CONSTRAINT check_status CHECK (status IN ('Friend', 'Pending', 'Blocked'));
