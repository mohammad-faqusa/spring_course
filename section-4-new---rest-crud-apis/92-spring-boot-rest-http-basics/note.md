## 92. Spring Boot REST HTTP Basics

### REST over HTTP
* Most common use of REST is over HTTP
* Leverage HTTP methods for CRUD operations 

| HTTP Method |              CRUD Operation              |
|-------------|:----------------------------------------:|
| POST        |           create a new entity            |
| GET         | read a list of entities or single entity |
| PUT         |        update an existing entity         |
| DELETE      |        Delete an existing entity         |  

### HTTP Message 
#### what is in request message ? 
* request line 
  * http command
* header variables
  * request meta data
* Message body 
  * contents of message 
#### what is response messag e
* response line : server protocol and status code 
* Header variables : response metadata
* Message body: contents of message 

### HTTP Response - Status Codes 
| Cide range | Description   |
|------------|---------------|
| 100-199    | Informational |
| 200-299    | Successful     |
| 300-399    | Redirection   |
| 400-499    | Client error  |
| 500-599    | Server error  |

### MIME Content Types
* the message format is described by MIME content type 
  * Multipurpose Internet Main-Extentsion 
* Basic Syntax : type/sub-type 
* example:
  * text/html, text/plain
  * application/json, application/xml, ...

### Client tool
* we need a **client tool**
* Send HTTP request to the REST Web SErvice / API
* Plenty of tools available: curl, Postman, etc... 

### Postman 
* makes API development simple 
* very popular 
* [www.getpostman.com](www.getpostman.com)

#### Install postman 
