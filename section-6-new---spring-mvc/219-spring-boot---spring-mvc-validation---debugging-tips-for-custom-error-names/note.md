## 219. Spring Boot - Spring MVC Validation - Debugging Tips for Custom Error Names

### Break it down 

1. inspect the binding result object in **CustomerController** 
2. add `sout` and print `thebindingResutl`

```java
System.out.println("Binding result : " + theBindingResult.toString()); 
System.out.println("\n\n\n\n")
```

we suppose will have some errors : 
* `customer` on field 'freePasses' 
  * rejected value : [asdfasdfekk]
  * the error codes : `typeMismatch.customer.freePasses`,  we override the deufalt one, to our custome message
  * typeMismatch.java.lang.Integer, TypeMismatch 

