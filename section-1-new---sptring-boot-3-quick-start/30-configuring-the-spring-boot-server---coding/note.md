
## Process 

### Step 1: configure the server port
* in applicatoin properties  
`server.port=7070`
* you can investigate in console 
* verify on browser

### Step 2: Configure the application context path
* in application properties, type  
    ```python
    # Set the context path of hte application
    #
    # All request should be prefixed iwth /mycoolapp
    #
    server.servlet.context-path=/mycoolapp
    
    ```
* go to browser , and check the path  
`local:7070/mycoolapp/teaminfo`

