## 269. Spring MVC Security - Display Content Based on Roles - Overview

### Why show these links  ? 
![img.png](img.png)

#### Display Content Based on Roles 
![img_1.png](img_1.png)

#### Spring Security 
```html
<div sec:authorize="hasRole('MANAGER')">
    <p>
        <a th:href="@{/leaders}">
            Leadership Meeting
        </a>
        (Only for Manager peeps)
    </p>
</div>
```