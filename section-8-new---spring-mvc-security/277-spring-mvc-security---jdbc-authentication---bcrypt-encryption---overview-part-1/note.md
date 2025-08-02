## 277. Spring MVC Security - JDBC Authentication - BCrypt Encryption - Overview Part 1

#### Password storage 
* so far we have stored password in plaintext !
* best practice: store it in encrypted format 

#### Spring Security Team recommendation 
* recommends using **bcrypt** algorithm 
* bcrypt : 
  * perform one-way encrypted hashing 
  * adds a random salt to the password for additional protection 
  * includes support to defeat burte force attacks 

#### Bcrypt additional information 
* why you should use bcrypt to hash passwords 
  * [www.luv2code.com/why-bcrypt](https://www.luv2code.com/why-bcrypt)
* Detailed bcrypt algorithm analysis 
  * [www.luv2code.com/bcrypte-wiki-page](https://www.luv2code.com/bcrypte-wiki-page)
* Passwrod hashing - Best Practice 
  * [www.luv2code.com/password-hashing-best-practice](https://www.luv2code.com/password-hashing-best-practice)


#### How to get a bcrypt password 
* option 1 : use a website utility to perform the encryption 
* option 2 : write java code to perform the encryption 

#### Getting bcrypt password - Website 
* visit :  [www.luv2code.com/generate-bcrypt-password](https://www.luv2code.com/generate-bcrypt-password)
* enter the plain text password 
* the website will generate the bcrypt password 

