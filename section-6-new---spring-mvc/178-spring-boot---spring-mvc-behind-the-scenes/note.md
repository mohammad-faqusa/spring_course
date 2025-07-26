## 178. Spring Boot - Spring MVC Behind the Scenes

### Componenet of MVC application 
* a set of web pages to layout UI components 
* a collection of spring beans (controller, services, etc ...  )
* spring configuration (/xML , annotaiotns or Java)

### How Spring MVC works behind the scences
![img.png](img.png)

#### Spring MVC fron end controller 
* front controller knwon as DispatcherSErvlet 
  * part of the spring framwork
  * already developed by spring dev team 
* you iwll create 
  * model ojbect (orange) : contain data 
  * view templates (dark green) : render the data
  * controller classes (yello) : business logic, processing logic 

##### controller 
* code creaeted by developer 
* contains your business logic 
  * handle the request 
  * store/retrieve data (db, web service....)
  * place data in model
* send to appropriate view template 

##### the model
* contains you data 
* store / retrieve data via backend systems 
  * database, web service, etc 
  * use a spring bean if you like 
* place your data in the model 
  * data can be any java object / collection 

##### View Template 
* Spring MVC is flexible 
  * supports many view templates 
* Recommended: thymeleaf 
* developer creates a page 
  * display data 

###### (more) 
* other view tempaltes supported
  * groovy, velocity, freemarker, etc... 
  www.luv2code.com/spring-mvc-views

