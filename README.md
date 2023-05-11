# Challenge_week_1

This repository is intended to complete the following tasks:

Question 1.
Write a Java program that aims to validate whether a given employee is entitled
to a bonus. The program needs to receive the number of employees that will be
registered and after that, the program must store the name and salary of each
employee.
If the user receives up to R$ 1000.00 real, he will receive a 20% bonus. If you
receive more than 1000 and up to 2000, you receive 10%. If it is above 2000, instead
of a bonus, the employee will have a 10% discount. At the end of the program, there
should be an output with the names of the employees, salary, bonus or deduction and
net salary.
Obs.: Use array to store the data.

Question 2 (OBI-2020)
Emoticons are symbols used to express the feeling of the person writing a
message. Scott Fahlman, a professor at an American university, was the first to
propose the use of the character sequences :-) and :-(, which 2 respectively became
symbols for “amused” and “annoyed”.
Let's define the sentiment expressed in a message as:
• neutral: if the number of “fun” symbols is equal to the number of “upset” symbols
• fun: if the number of “fun” symbols is greater than the number of “annoying”
symbols
• upset: if the number of “upset” symbols is greater than the number of “fun”
symbols.
Given a message consisting of a string of characters, write a program to
determine the sentiment expressed in the message.
Your program must use the Scanner class to read an input line and return the
expressed sentiment from that line.
Attention: Input validations is a point to pay close attention to

Question 3.
Write a Java program that aims to be a question and answer quiz. On the
screen you will ask the user and he will answer.
If the user is right or wrong, you need to inform whether he was right or wrong
and move on to the next question (while there is a next one).
Use array to store questions and answers.
The screen will ask the user the name, and at the same time the questions, if
the user gets it right, it will demonstrate the errors and successes (as in the example
below):
User XPTO
right: 6
wrong:4

Question 4. Script Postgres
Create an SQL script that creates two Person and Address tables.
The Person table must contain the following fields: person_id, name, age,
phone, height, email, CPF, date of birth and id_address.
The Address table must contain the following fields: address_id, zip code,
address, complement, neighborhood, city, state and country.
When the person is registered, he must be registered associated with an
Address that already exists in the bank, which will have a foreign key id from the
address table.

Question 5. Script MongoDB
Create a script for MongoDB that contains a Person Document, it must contain
the following fields: object, name, age, phone, height, e-mail, CPF, date of birth and
address that will be an object that must have the fields: zip code, street, neighborhood,
complement, city, state and country.
