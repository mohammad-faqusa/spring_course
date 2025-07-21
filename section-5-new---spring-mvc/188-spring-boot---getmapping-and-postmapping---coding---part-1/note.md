## 188. Spring Boot - GetMapping and PostMapping - Coding - Part 1

### Demo @GetMapping and @PostMapping 

### The process :
1. move to `HelloWorldController`
2. replace @`RequestMapping` to @`GetMapping`
```java
@GetMpaping("/showForm") 
pbulic string showForm() {
    return "helloworld-form"; 
}
```
2. run and test 
3. change the @`GetMapping` to `@PostMapping`
4. the error generated when request : `REquest methdo 'GET' is not supported`

