## 329. @OneToMany - Uni-Directional - Coding - Refactor Course Entity

### Step 3: update course class

1. move to `Course` entity 

```java

@OneToMany
@JoinColumn(name = "course_id")
private List<Review> reviews; 


// getters / setters 

```

2. addReview method in `Course`
```java
public void addReview(Review review) {
    if(reviews == null) {
        reviews = new ArrayList<>();
    }
    
    reviews.add(review);
}
```

3. fetch type, cascade type

```java

@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
@JoinColumn(name = "course_id")
private List<Review> reviews; 


// getters / setters 

```
