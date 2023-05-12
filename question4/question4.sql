CREATE TABLE Address(
    address_id INT PRIMARY KEY,
    zip INT(8),
    street VARCHAR(100),
    complement VARCHAR(250),
	neighborhood VARCHAR(250),
    city VARCHAR(50),
	state VARCHAR(50),
	country VARCHAR(50)
);

CREATE TABLE Person (
    person_id INT PRIMARY KEY,
	name VARCHAR(50),
	age INT,
	phone INT,
	height INT,
	email VARCHAR(250),
	cfp INT,
	birthday INT,
	address_id INT,
	FOREIGN KEY (address_id) REFERENCES Address(address_id)
);