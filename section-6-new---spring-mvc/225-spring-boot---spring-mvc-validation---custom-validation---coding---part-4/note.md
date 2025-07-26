## 225. Spring Boot - Spring MVC Validation - Custom Validation - Coding - Part 4

### Development Process
1. Create Custom validation rule 
2. Add validation rule to Customer class 
3. Display error message on HTML form 
4. Update confirmation page 


#### Step 2: Add validation rule to Customer class 
* open the `Customer` class 
```java
package com.luv2code.springdemo.mvc.model;

import jakarta.validation.constraints.*;

public class Customer {
    
    
    private String firstName;
    
    @NotNull(message="is required")
    @Size(min=1, message="is required")
    private String lastName;

    @NotNull(message="is required")
    @Min(value=0, message="the number should be greater than or equal to 0")
    @Max(value=10, message="the number should be less than or equal to 10")
    private Integer freePasses;

    @Pattern(regexp="^[a-zA-Z0-9]{5}", message="must be a word of 5 letters/digits")
    private String postalCode;
    
    @CourseCode // no need to pass in parameters, it is written in default parameters 
    private String courseCode;
    // generate getters/setters 

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}


```

* now go `Customer Form`, and add `Course Code` field 
  * just copy and paste from previous fields 
* add the field `Course Code` in `Customer Confirmation` page 

