## 270. Spring MVC Security - Display Content Based on Roles - Coding - Part 1

### The process 
1. modify `home.html`
```html

<div sec:authorize="hasRole('MANAGER')">
    <p>
        <a href="" th:href="@{/leaders}">Leaders</a>
        (This is for Managers)

    </p>
</div>

<div sec:authorize="hasRole('ADMIN')">
<p>
    <a href="" th:href="@{/systems}">Systems</a>
    (This is for Admins)

</p>
</div>

```