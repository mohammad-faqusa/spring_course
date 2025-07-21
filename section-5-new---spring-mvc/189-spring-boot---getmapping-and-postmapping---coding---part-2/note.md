## 189. Spring Boot - GetMapping and PostMapping - Coding - Part 2

### The porcess
1. go to template form `helloworld-form`, change the request mapping to `GET`
```html
<form action="@{/processFrom}" method="GET"></form>
```
2. in the controller, change the request mapping to `@GetMapping`
3. in the template , chagne from `@GET` to `@POST`
4. change to `@PostMapping` in the controller 
5. the submitted data are not in `URL` in POST method, it is in the acutal `Body`
6. you can view `web browswer developer tools`
    * select the network tab 
    * fill up the form and submit 
    * you can see the packet in Network 
    * select to view the information of URL


