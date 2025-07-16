## 132. Spring Boot REST: PATCH - Coding - Part 2

```java
private Employee apply(Map<String, Object> pathPaylaod, Employee tempEmployee) {
    
    // convert employee object to a JSON object node 
    ObjectNode employeeNode = objectMapper.convertValue(tempEmployee, ObjectNode.class); 
    
    // Convert the patchPayload map to a JSON object node
    ObjectNode patchNode = objectMapper.convertValue(patchPayload, ObjectNode.class); 
    
    // Merge the patch updates into the employee node
    employeeNode.setAll(patchNode); 
    
    return objectMapper.convertValue(employeeNode, Employee.class); 
}
```