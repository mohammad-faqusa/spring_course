## 176. Spring Boot - Spring MVC with Thymeleaf and CSS - Overview

### How to use CSS sytels 

* you have the opoitn of using 
  * local CSS files as part of your project
  * referencing remote css files 
* we'll comver both options in this video


### development proces
1. create css file 
   * spring will look for `src/main/resources/static`
     * inside for example : `demo.css`
     * we can add any custom directories `css/demo.css`
```html
<head>
    <link rel="styelsheet" th:href="@{/css/demo.css}" />
</head>
```
2. reference css 
3. apply css 
   * apply the CSS style 
```html
<p th:text="'Time on the server is ' + ${theDate}" class="funny" />

```
4. spring wil lsearch following direcotries for static resources
* `src/main/resources` (search order : top to down)
  1. `/META-INF/resources`
  2. /resources
  3. /static
  4. /public

### 3rd party libraries - bootstrap 
* local installation 
* download bootsrap file(s) and add to /static/css directory 
```html
<link rel="stylesheet" th:href="@/css/bootstrap.min.css}" />

```

#### Access remotly 
<link rel="stylesheet" href="cdn.jsdelivr.net/npm...."}" />
