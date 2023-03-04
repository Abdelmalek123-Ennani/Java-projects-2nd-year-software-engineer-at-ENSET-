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
<p>In this example, we are using a <b>BufferedReader</b> to read a file called <b>filename.txt</b>. We are then printing each line of the file to the console.</p>

##### Writing Files
Writing files is another common task in programming. Java provides several classes and methods for writing files. The most commonly used classes are <b>FileWriter</b> and <b>BufferedWriter</b>.
<p>Here is an example of how to write to a file using <b>BufferedWriter</b>:</p>

```java
try (BufferedWriter bw = new BufferedWriter(new FileWriter("filename.txt"))) {
    bw.write("Hello, world!");
} catch (IOException e) {
    System.err.println("Error writing to file: " + e.getMessage());
}
```
<p>In this example, we are using a <b>BufferedWriter</b> to write the string "Hello, world!" to a file called <b>filename.txt</b></p>

##### Deleting Files
<p>Deleting files is a simple task in Java. The File class provides a delete() method that can be used to delete a file.</p>
<p>Here is an example of how to delete a file:</p>

```java
File file = new File("filename.txt");
if (file.delete()) {
    System.out.println("File deleted successfully.");
} else {
    System.out.println("Failed to delete file.");
}
```
<p>In this example, we are using the <b>delete()</b> method of the <b>File</b> class to delete a file called <b>filename.txt</b> If the file is deleted successfully, we print a success message. If the file cannot be deleted, we print a failure message.</p>

##### Renaming Files
<p>Renaming files is another common task in programming. Java provides a <b>renameTo()</b> method that can be used to rename a file.</p>
<p>Here is an example of how to rename a file:</p>

```java
File oldFile = new File("oldFilename.txt");
File newFile = new File("newFilename.txt");
if (oldFile.renameTo(newFile)) {
    System.out.println("File renamed successfully.");
} else {
    System.out.println("Failed to rename file.");
}
```
<p>In this example, we are using the <b>renameTo()</b> method of the <b>File</b> class to rename a file called <b>oldFilename.txt</b> to <b>newFilename.txt</b>. If the file is renamed successfully, we print a success message. If the file cannot be renamed, we print a failure message.</p>

##### Conclusion
<p>In conclusion, file manipulation is an important part of programming. Java provides several classes</p>
