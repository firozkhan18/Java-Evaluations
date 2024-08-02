## 10 JDK 7 Features to Revisit, Before You Welcome Java 8 - Examples

It's been almost a month since Java 8 is released and I am sure all of you are exploring new features of JDK 8. But, before you completely delve into Java 8, it’s time to revisit some of the cool features introduced on Java 7. If you remember, Java 6 was nothing on the feature, it was all about JVM changes and performance, but JDK 7 did introduce some cool features which improved the developer's day to day task. Why I am writing this post now? Why I am talking about Java 1. 7, when everybody is talking about Java 8? Well I think, not all Java developers are familiar with changes introduced in JDK 7, and what time can be better to revisit an earlier version than before welcoming a new version.

I don't see automatic resource management used by developers in daily life, even after IDE's has got the content assist for that. Though I see programmers using String in Switch and Diamond operator for type inference, again there is very little known about the fork-join framework,  catching multiple exceptions in one catch block or using underscore on numeric literals.

So I took this opportunity to write a summary sort of post to revise these convenient changes and adopt them into our daily programming life. There are a couple of good changes on NIO and new File API, and lots of other at the API level, which is also worth looking at. I am sure combined with Java 8 lambda expression, these features will result in a much better and cleaner code.


### 10 Best JDK 7 Features Every Java developer should learn 
Here are my favorite features from Java 7 release which every Java developer should learn:
### 1) Type inference
Before JDK 1.7 introduce a new operator <<, known as diamond operator to making type inference available for constructors as well. Prior to Java 7, type inference is only available for methods, and Joshua Bloch has rightly predicted in Effective Java 2nd Edition, it’s now available for constructor as well.



Prior JDK 7, you type more to specify types on both left and right hand side of object creation expression, but now it only needed on left hand side, as shown in below example.

Prior JDK 7
Map<String, List<String>> employeeRecords =  new HashMap<String, List<String>>();
List<Integer> primes = new ArrayList<Integer>();

In JDK 7
Map<String, List<String>> employeeRecords =  new HashMap<>();
List<Integer> primes = new ArrayList<>();

So you have to type less in Java 7, while working with Collections, where we heavily use Generics. See here for more detailed information on diamond operator in Java.


### 2) String in Switch
Before JDK 7, only integral types can be used as selector for switch-case statement. In JDK 7, you can use a String object as the selector. For example,
String state = "NEW";

switch (day) {
   case "NEW": System.out.println("Order is in NEW state"); break;
   case "CANCELED": System.out.println("Order is Cancelled"); break;
   case "REPLACE": System.out.println("Order is replaced successfully"); break;
   case "FILLED": System.out.println("Order is filled"); break;
   default: System.out.println("Invalid");

}
equals() and hashcode() method from java.lang.String is used in comparison, which is case-sensitive. Benefit of using String in switch is that, Java compiler can generate more efficient code than using nested if-then-else statement. See here for more detailed information of how to use String on Switch case statement.


### 3) Automatic Resource Management
Before JDK 7, we need to use a finally block, to ensure that a resource is closed regardless of whether the try statement completes normally or abruptly, for example while reading files and streams, we need to close them into finally block, which result in lots of boiler plate and messy code, as shown below :
```java
public static void main(String args[]) {
        FileInputStream fin = null;
        BufferedReader br = null;
        try {
            fin = new FileInputStream("info.xml");
            br = new BufferedReader(new InputStreamReader(fin));
            if (br.ready()) {
                String line1 = br.readLine();
                System.out.println(line1);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Info.xml is not found");
        } catch (IOException ex) {
            System.out.println("Can't read the file");
        } finally {
            try {
                if (fin != null) fin.close();
                if (br != null) br.close();
            } catch (IOException ie) {
                System.out.println("Failed to close files");
            }
        }
    }
```
Look at this code, how many lines of boiler codes?

Now in Java 7, you can use try-with-resources feature to automatically close resources, which implements AutoClosable and Closeable interface e.g. Streams, Files, Socket handles database connections, etc.

JDK 7 introduces a try-with-resources statement, which ensures that each of the resources in try(resources) is closed at the end of the statement by calling close() method of AutoClosable. Now same example in Java 7 will look like below, a much concise and cleaner code :
```java
public static void main(String args[]) {
       try (FileInputStream fin = new FileInputStream("info.xml");
  BufferedReader br = new BufferedReader(new InputStreamReader(fin));) {
  if (br.ready()) {
   String line1 = br.readLine();
   System.out.println(line1);
  }
 } catch (FileNotFoundException ex) {
  System.out.println("Info.xml is not found");
 } catch (IOException ex) {
  System.out.println("Can't read the file");
 }
}
```
Since Java is taking care of closing opened resources including files and streams, may be no more leaking of file descriptors and probably an end to file descriptor error. Even JDBC 4.1 is retrofitted as AutoClosable too.

### 4) Fork Join Framework
The fork/join framework is an implementation of the ExecutorService interface that allows you to take advantage of multiple processors available in modern servers. It is designed for work that can be broken into smaller pieces recursively.

The goal is to use all the available processing power to enhance the performance of your application. As with any ExecutorService implementation, the fork/join framework distributes tasks to worker threads in a thread pool.

The fork-join framework is distinct because it uses a work-stealing algorithm, which is very different than producer consumer algorithm. Worker threads that run out of things to do can steal tasks from other threads that are still busy.

The centre of the fork/join framework is the ForkJoinPool class, an extension of the AbstractExecutorService class. ForkJoinPool implements the core work-stealing algorithm and can execute ForkJoinTask processes.

You can wrap code in a ForkJoinTask subclass like RecursiveTask (which can return a result) or RecursiveAction. See here for some more information on fork join framework in Java.


### 5) Underscore in Numeric literals
In JDK 7, you could insert underscore(s) '_' in between the digits in an numeric literals (integral and floating-point literals) to improve readability. This is especially valuable for people who uses large numbers in source files, may be useful in finance and computing domains. For example,
```java
int billion = 1_000_000_000;  // 10^9
long creditCardNumber =  1234_4567_8901_2345L; //16 digit number
long ssn = 777_99_8888L;
double pi = 3.1415_9265;
float  pif = 3.14_15_92_65f;
```
You can put underscore at convenient points to make it more readable, for examples for large amounts putting underscore between three digits make sense, and for credit card numbers, which are 16 digit long, putting underscore after 4th digit make sense, as they are printed in cards. By the way remember that you cannot put underscore, just after decimal number or at the beginning or at the end of number. For example, following numeric literals are invalid, because of wrong placement of underscore:
```java
double pi = 3._1415_9265; // underscore just after decimal point
long creditcardNum = 1234_4567_8901_2345_L; //underscore at the end of number
long ssn = _777_99_8888L; //undersocre at the beginning
```
See my post about how to use underscore on numeric literals for more information and use case.

### 6) Catching Multiple Exception Type in Single Catch Block
In JDK 7, a single catch block can handle more than one exception types.

For example, before JDK 7, you need two catch blocks to catch two exception types although both perform identical task:
```java
try {

   ......

} catch(ClassNotFoundException ex) {
   ex.printStackTrace();
} catch(SQLException ex) {
   ex.printStackTrace();
}
```
In JDK 7, you could use one single catch block, with exception types separated by '|'.
```java
try {

   ......

} catch(ClassNotFoundException|SQLException ex) {

   ex.printStackTrace();

}
```
By the way, just remember that Alternatives in a multi-catch statement cannot be related by subclassing. For example, a multi-catch statement like below will throw compile time error :
```java
try {

   ......

} catch (FileNotFoundException | IOException ex) {

   ex.printStackTrace();

}
```
Alternatives in a multi-catch statement cannot be related by sub classing, it will throw an error at compile time :
java.io.FileNotFoundException is a subclass of alternative java.io.IOException
        at Test.main(Test.java:18)

see here to learn more about improved exception handling in Java SE 7.


### 7) Binary Literals with prefix "0b"
In JDK 7, you can express literal values in binary with prefix '0b' (or '0B') for integral types (byte, short, int and long), similar to C/C++ language. Before JDK 7, you can only use octal values (with prefix '0') or hexadecimal values (with prefix '0x' or '0X').
```java
int mask = 0b01010000101;
```

or even better
```java
int binary = 0B0101_0000_1010_0010_1101_0000_1010_0010;
```

### 8) Java NIO 2.0
Java SE 7 introduced java.nio.file package and its related package, java.nio.file.attribute, provide comprehensive support for file I/O, and for accessing the default file system. It also introduced the Path class which allows you to represent any path in the operating system.

New File system API complements the older one and provides several useful method checking, deleting copying, and moving files. for example, now you can check if a file is hidden in Java. You can also create symbolic and hard links from Java code.

The JDK 7 new file API is also capable of searching for files using wild cards. You also get support to watch a directory for changes. I would recommend checking the Java doc of a new file package to learn more about this interesting useful feature.


### 9) G1 Garbage Collector
JDK 7 introduced a new Garbage Collector known as G1 Garbage Collection, which is a short form of garbage first. G1 garbage collector performs clean-up where there is most garbage. To achieve this it split Java heap memory into multiple regions as opposed to 3 regions in the prior to Java 7 version (new, old and permgen space). It's said that G1 is quite predictable and provides greater throughput for memory-intensive applications.


### 10) More Precise Rethrowing of Exception
The Java SE 7 compiler performs more precise analysis of re-thrown exceptions than earlier releases of Java SE. This enables you to specify more specific exception types in the throws clause of a method declaration. before JDK 7, re-throwing an exception was treated as throwing the type of the catch parameter. For example, if your try block can throw ParseException as well as IOException.

In order to catch all exceptions and rethrow them, you would have to catch Exception and declare your method as throwing an Exception. This is sort of obscure non-precise throw, because you are throwing a general Exception type (instead of specific ones) and statements calling your method need to catch this general Exception. This will be more clear by seeing the following example of exception handling in code prior to Java 1.7
```java
public void obscure() throws Exception{
    try {
        new FileInputStream("abc.txt").read();
        new SimpleDateFormat("ddMMyyyy").parse("12-03-2014");        
    } catch (Exception ex) {
        System.out.println("Caught exception: " + ex.getMessage());
        throw ex;
    }
}
```
From JDK 7 onwards you can be more precise while declaring the type of Exception in throws clause of any method. This precision in determining which Exception is thrown from the fact that, If you re-throw an exception from a catch block, you are actually throwing an exception type which:

   1) your try block can throw,
   2) has not handled by any previous catch block, and
   3) is a subtype of one of the Exception declared as catch parameter

This leads to improved checking for re-thrown exceptions. You can be more precise about the exceptions being thrown from the method and you can handle them a lot better at client-side, as shown in the following example :
```java
public void precise() throws ParseException, IOException {
    try {
        new FileInputStream("abc.txt").read();
        new SimpleDateFormat("ddMMyyyy").parse("12-03-2014");        
    } catch (Exception ex) {
        System.out.println("Caught exception: " + ex.getMessage());
        throw ex;
    }
}
```
The Java SE 7 compiler allows you to specify the exception types ParseException and IOException in the throws clause in the preciese() method declaration because you can re-throw an exception that is a super-type of any of the types declared in the throws, we are throwing java.lang.Exception, which is super class of all checked Exception. Also in some places you will see final keyword with catch parameter, but that is not mandatory any more.

That's all about what you can revise in JDK 7. All these new features of Java 7 are very helpful in your goal towards clean code and developer productivity. With lambda expression introduced in Java 8, this goal to cleaner code in Java has reached another milestone. Let me know, if you think I have left out any useful feature of Java 1.7, which you think should be here.


Related Java 8 Tutorials
If you are interested in learning more about new features of Java 8,here are my earlier articles covering some of the important concepts of Java 8:
20 Examples of Date and Time in Java 8 (tutorial)
How to use Stream class in Java 8 (tutorial)
How to use filter() method in Java 8 (tutorial)
How to use forEach() method in Java 8 (example)
How to join String in Java 8 (example)
How to convert List to Map in Java 8 (solution)
How to use peek() method in Java 8 (example)
5 Books to Learn Java 8 from Scratch (books)
How to convert stream to array in Java 8 (tutorial)
Java 8 Certification FAQ (guide)
Java 8 Mock Exams and Practice Test (test)


Read more: https://javarevisited.blogspot.com/2014/04/10-jdk-7-features-to-revisit-before-you.html#ixzz8hiOboANb

## Java FileReader + BufferedReader Example

There are multiple ways to read a file in Java e.g. you can use a Scanner as we have seen in the last example, or you can use the BufferedReader class. The advantage of using a BufferedReader to read a text file is speed. It allows faster reading because of internal buffering provided by BufferedReader. Other Reader classes like FileReader access the file or disk every time you call the read() method but BufferedReader keeps 8KB worth of data in its internal buffer which you can read it without accessing the file multiple times. It's loaded when you access the file the first time for a subsequent read.

 The BufferedReader class is also a good example of a Decorator design pattern because it decorates existing readers e.g. FileReader to provide buffering, remember, the reading from file functionality still comes from the FileReader class.
PauseUnmute
Fullscreen

One more advantage of using the BufferedReader for reading a text file is its ability to read the file line by line. It provides a readLine() method which can be used to read a text file line by line in Java.


The java.io.BufferedReader class provides 4 versions of the read() method to read data from a text file
read() - to read a single character, this method returns an int, so you need to cast that to a character
read(char[] cbuf) - to read characters into an array. This method will block until some input is available, an I/O error occurs, or the end of the stream is reached. This method either returns the number of characters read or -1 if the end of the file has been reached. The method comes from the Reader class.
read(CharBuffer cbuffer) - to read characters into a CharBuffer, this is similar to the previous method except that it reads characters into a CharBuffer object instead of the array. This method also returns a total number of characters read or -1 if the end of the file has been reached. This method also belongs to java.io.Reader class.
read(char[] cbuf, int off, int len) - to read characters into an array but gives you control where to store the characters read from a file. You can specify offset i.e. the indices to start and length, how many characters to store.
readLine() - to read a line of text. You can use this method to read a file line by line in Java. A line is considered to be terminated by any one of a line feed ('\n'), a carriage return ('\r'), or a carriage return followed immediately by a line feed. This method returns a string containing the contents of the line, not including any line-termination characters, or null if the end of the stream has been reached. Many Java developer uses BufferedReader class just for this method.

Btw, from Java 8 onwards there are many ways to read a file line by line in Java e.g. you can use Files.lines() method to get all lines as Stream in Java and then you cannot only read them line by line but also you can also use Stream operations e.g. map(), flatMap(), filter(), etc to perform useful operations.

If you are not familiar with functional programming and Java 8 see these Java 8 tutorials to learn more about the basics of functional programming with Java 8 syntax.





How to read a text file using FileReader and BufferedReader
Here is our sample Java program to read a plain text file using BufferedReader. In this program, I have shown two examples of BufferedReader class, the first one reads file content into a character array and the second one reads the text file line by line.

If you notice carefully, while converting the character array to String, we have correctly used the offset and length because it might be possible that the array which you are using for storing content, may content dirty data from the previous read, as we are not cleaning it up after every read. 

That's the advantage of using offset and length, you don't need to clear or clean the array.  You can further see these free Java courses to learn more about file reading in Java.





```java
Java BufferedReader Example
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * Java Program read a text file using BufferedReader.
 * It allows you to read file line by line or directly
 * into a character array. 
 */
public class BufferedReaderDemo {

  public static void main(String[] args) throws Exception {
    String filename = "newfile.txt";

    // reading text file into array
    try {
      FileReader textFileReader = new FileReader(filename);
      BufferedReader bufReader = new BufferedReader(textFileReader);

      char[] buffer = new char[8096];

      int numberOfCharsRead = bufReader.read(buffer); // read will be from
      // memory
      while (numberOfCharsRead != -1) {
        System.out.println(String.valueOf(buffer, 0, numberOfCharsRead));
        numberOfCharsRead = textFileReader.read(buffer);
      }

      bufReader.close();

    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    // reading file line by line using BufferedReader
    try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
      String line = br.readLine();
      while (line != null) {
        System.out.println(line);
        line = br.readLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
```
Output
[first line] hello
[second line] bye
[first line] hello
[second line] bye

You can see from the output that we have successfully read the text file. In the second example, since we have used the try-with-resource construct, you don't need to manually call the close() method of BufferedReader, it will automatically be called by Java. The catch clause is there to catch the IOException thrown by the close() method.


That's all about how to read a text file using BufferedReader in Java. As I said, there are two main reasons to use the BufferedReader class, first the buffering it provides which makes reading efficient, and second the readLine() method it gives, which allows you to read the text file line by line. 


Related Java File tutorials you may like
How to write to a file using BufferedWriter in Java? (solution)
How to append text to a file in Java? (solution)
2 ways to read a text file in Java? (solution)
How to read InputStream as Stream in Java? (example)
How to load data from a CSV file in Java? (example)
How to find the highest occurring word from a file in Java? (solution)
How to read/write an XLSX file in Java? (solution)

P. S. - If you running in Java 8, you can also use streams to lazily read the file content by using the Files.lines() method which returns a Stream of String from a text file. You can then perform operations like map() and filter() on file content.


Read more: https://www.java67.com/2016/08/BufferedReader-Example-how-to-read-text-file-in-java.html#ixzz8hiOC3UAG
