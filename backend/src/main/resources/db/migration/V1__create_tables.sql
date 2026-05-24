CREATE TABLE users (
    id BIGSERIAL PRIMARY KEY,
    username VARCHAR (15) NOT NULL UNIQUE,
    name VARCHAR (100) NOT NULL,
    email VARCHAR (254) NOT NULL UNIQUE,
    password_hash TEXT NOT NULL 
);

CREATE TABLE shoes (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR (20) NOT NULL,
    brand VARCHAR (20) NOT NULL,
    price NUMERIC(10, 2) NOT NULL,
    color VARCHAR (20),
    release_date DATE
);

CREATE TABLE user_favorites (
    user_id BIGSERIAL PRIMARY KEY,
    shoe_id BIGSERIAL PRIMARY KEY,

    CONSTRAINT fk_user
        FOREIGN KEY (user_id)
        REFERENCES users(id),

    CONSTRAINT fk_shoe
        FOREIGN KEY (shoe_id)
        REFERENCES shoes(id),
);