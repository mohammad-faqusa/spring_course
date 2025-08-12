## 332. @OneToMany - Uni-Directional - Coding - Delete Course and Reviews

### The process 

#### Delete a Course and Reviews 
1. go to main application 
```java

CommandLineRunner commandLineRunner(AppDAO appDAO) {
    
    runner -> {
        deleteCourseAndReviews(AppDAO appDAO); 
    }
}

private void deleteCourseAndReviews(AppDAO appDAO) {
    int theId = 10;
    
    System.out.println("Delete course id: " + theId);
    appDAO.deleteCourseById(theId);

    System.out.println("Done!");
}
```
2. run the application 
3. check the data in db 
