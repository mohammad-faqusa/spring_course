## 91. JSON Basics

### What is JSON? 
* JavaScrip Object Noatioant 
* Lightweight data fromat for storing and exhanging data ... plain text
* Language independent ... not just for **JavaScript**
* Can use with any programming language : **Java, C#, Python etc...**

Simply JSON example : 
* Curley braces define objects in JSON
* Ojbect memember are / value pairs 
  * delimited by colons 
* Name is **always** in double quotes
```json
{
  "id": 14,
  "firstName": "Mohammad",
  "lastName": "Faqusa",
  "active": true
}
```

### JSON Values 
```json
{
  "id": 14,
  "firstName": "Mohammad",
  "lastName": "Faqusa",
  "active": true
}
```
* Numbers: no quotes
* String: in double quotes
* Boolean: **true, false** 
* Nested JSON object 
* Array 
* **null**

#### Nested JSON Obejcts 
```json
{
  "id": 14,
  "firstName": "Mohammad",
  "lastName": "Faqusa",
  "active": true,
  "address": {
    "street": "babel street",
    "city": "hebron",
    "state": "west bank"
  }
}
```

#### JSON Arrays 
```json
{
  "id": 14,
  "firstName": "Mohammad",
  "lastName": "Faqusa",
  "active": true,
  "languages": ["Java", "C", "Python", "JavaScript"]
}
```