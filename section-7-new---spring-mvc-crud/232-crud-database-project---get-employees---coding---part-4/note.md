## 232. CRUD Database Project - Get Employees - Coding - Part 4

### The process
1. we need small improvements 
   * when navigating to `:8080/`, it gives error 
   * we need to add `index.html` to redirect to "employees/list"
2. in **resoruce/static** 
   * craete new file `index.html`

```html
<meta http-equiv="refresh"
    content="0; URL='employees/list'">
```
3. run the application, and automatically will redirect 
4. houseKeeping the work 
   * rename the package 
   * refactor/rename 
   * choose **for all directories**
   * name : `thymeleafdemo`
   * rename the main application `ThymeleafdemoApplication`
   * refacotr, select all , submit 
   * 