## 226. Spring Boot - Spring MVC Validation - Custom Validation - Coding - Part 5

### The Process 
1. Running the application 
2. input with some empty fields 
   * 500 error 
   * the cause `theCode` null exception 
   * add the logic in `isValid` to check if null, before check the value
3. you can customize the parameter of the notation `@CourseCode(value="PAL", message="The value must start with PAL")` for example 