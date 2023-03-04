#### File Manipulation Using Java
This repository contains code examples and explanations for file manipulation using Java.
##### Introduction
<p>Java provides built-in classes and methods for file manipulation. These classes and methods make it easy to read, write, delete, and rename files.</p>
<p>In this repository, you will find code examples and explanations for various file manipulation tasks. The examples are written in Java and should be easy to follow, even if you are new to Java programming.</p>

##### Reading Files
Reading files is a common task in programming. Java provides several classes and methods for reading files. The most commonly used classes are <b>FileReader</b> and <b>BufferedReader</b>.
Here is an example of how to read a file using <b>BufferedReader</b>:
```java
try (BufferedReader br = new BufferedReader(new FileReader("filename.txt"))) {
    String line;
    while ((line = br.readLine()) != null) {
        System.out.println(line);
    }
} catch (IOException e) {
    System.err.println("Error reading file: " + e.getMessage());
}
```
<p>In this example, we are using a <b>BufferedReader</b> to read a file called <b>'filename.txt'</b>. We are then printing each line of the file to the console.</p>



