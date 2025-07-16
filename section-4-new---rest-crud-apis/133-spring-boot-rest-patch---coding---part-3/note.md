## 133. Spring Boot REST: PATCH - Coding - Part 3

### development process 
1. in pgAdmin, refresh the database 
2. use `postman`, edit the employee of id `5`, or any existed id 
3. PATCH request 
`employees/5`
```json
{
  "email": "vega.juan@demo.com"
}
```
4. send the request, and the response, is the full entity 
5. try to send with `id` in boyd 
   * error exception 

