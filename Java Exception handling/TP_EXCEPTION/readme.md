#### Java Exception Handling
<p>In Java, an exception is an event that occurs during the execution of a program that disrupts the normal flow of instructions. Exception handling allows you to catch and respond to these events in a controlled manner.</p>
<p>There are two types of exceptions in Java: checked and unchecked. Checked exceptions are checked at compile-time,
  while unchecked exceptions are not. Some examples of checked exceptions include IOException, SQLException, and ClassNotFoundException, 
  while examples of unchecked exceptions include NullPointerException, ArrayIndexOutOfBoundsException, and ClassCastException.</p>
  
<p>To handle exceptions in Java, you can use a try-catch block. Here's an example:</p>

```java
try {
  // code that may throw an exception
} catch (ExceptionType1 e1) {
  // code to handle ExceptionType1
} catch (ExceptionType2 e2) {
  // code to handle ExceptionType2
} finally {
  // code that will always run, regardless of whether an exception was thrown or not
}
```
