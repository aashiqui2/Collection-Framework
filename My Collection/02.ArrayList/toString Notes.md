# toString

Returns a string representation of the object

`public String toString()`

When ever we print the object the toString method is invoked.

java.lang.Object.toString()

In general, the toString method returns a string that "textually represents" this object.

`getClass().getName() + '@' + Integer.toHexString(hashCode())`

0-9
10 a
11 b
12 c
13 d
14 e
15 f

Laptop@5305068a

Parent class

````java
public String toString(){
    return getClass().getName() + '@' + Integer.toHexString(hashCode());
}
```

we have override method
 Child class
 ```java
 @Override
public String toString(){
    return " "+ this.gb+" "+this.price+" "+this.touch;
}
````
