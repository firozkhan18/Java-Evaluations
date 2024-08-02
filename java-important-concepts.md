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
```java
Map<String, List<String>> employeeRecords =  new HashMap<String, List<String>>();
List<Integer> primes = new ArrayList<Integer>();
```
In JDK 7
```java
Map<String, List<String>> employeeRecords =  new HashMap<>();
List<Integer> primes = new ArrayList<>();
```
So you have to type less in Java 7, while working with Collections, where we heavily use Generics. See here for more detailed information on diamond operator in Java.


### 2) String in Switch
Before JDK 7, only integral types can be used as selector for switch-case statement. In JDK 7, you can use a String object as the selector. For example,
```java
String state = "NEW";

switch (day) {
   case "NEW": System.out.println("Order is in NEW state"); break;
   case "CANCELED": System.out.println("Order is Cancelled"); break;
   case "REPLACE": System.out.println("Order is replaced successfully"); break;
   case "FILLED": System.out.println("Order is filled"); break;
   default: System.out.println("Invalid");

}
```
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
- `read()` - to read a single character, this method returns an int, so you need to cast that to a character
- `read(char[] cbuf)` - to read characters into an array. This method will block until some input is available, an I/O error occurs, or the end of the stream is reached. This method either returns the number of characters read or -1 if the end of the file has been reached. The method comes from the Reader class.
- `read(CharBuffer cbuffer)` - to read characters into a CharBuffer, this is similar to the previous method except that it reads characters into a CharBuffer object instead of the array. This method also returns a total number of characters read or -1 if the end of the file has been reached. This method also belongs to java.io.Reader class.
- `read(char[] cbuf, int off, int len)` - to read characters into an array but gives you control where to store the characters read from a file. You can specify offset i.e. the indices to start and length, how many characters to store.
- `readLine()` - to read a line of text. You can use this method to read a file line by line in Java. A line is considered to be terminated by any one of a line feed ('\n'), a carriage return ('\r'), or a carriage return followed immediately by a line feed. This method returns a string containing the contents of the line, not including any line-termination characters, or null if the end of the stream has been reached. Many Java developer uses BufferedReader class just for this method.

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
```
Output
[first line] hello
[second line] bye
[first line] hello
[second line] bye
```
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

## How to read file in Java using Scanner Example - text files

### Reading a file with Scanner
From Java 5 onwards java.util.Scanner class can be used to read file in Java. Earlier we have seen examples of reading file in Java using FileInputStream and reading file line by line using BufferedInputStream and in this Java tutorial, we will See How can we use Scanner to read files in Java. Scanner is a utility class in java.util package and provides several convenient methods to read int, long, String, double etc from a source which can be an InputStream, a file, or a String itself.

 As noted on How to get input from User, Scanner is also an easy way to read user input using System.in (InputStream) as the source. The main advantage of using Scanner for reading files is that it allows you to change delimiter using the useDelimiter() method, So you can use any other delimiter like comma, pipe instead of white space.

### How to Read File in Java - Scanner Example
How to read file in Java 5 using Scanner with ExampleIn this Java program, we have used java.util.Scanner to read file line by line in Java. We have first created a File instance to represent a text file in Java and then we passed this File instance to java.util.Scanner for scanning. 

The scanner provides methods like hasNextLine() and readNextLine() which can be used to read file line by line. It's advised to check for next line before reading next the line to avoid NoSuchElementException in Java.  

Here is the complete code example of using Scanner to read text files in Java :

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * Java program to read files using Scanner class in Java.
 * java.util.Scanner is added on Java 5 and offers a convenient method to read data
 *
 * @author
 */
public class ScannerExample {

    public static void main(String args[]) throws FileNotFoundException {
 
        //creating File instance to reference text file in Java
        File text = new File("C:/temp/test.txt");
     
        //Creating Scanner instance to read File in Java
        Scanner scnr = new Scanner(text);
     
        //Reading each line of the file using Scanner class
        int lineNumber = 1;
        while(scnr.hasNextLine()){
            String line = scnr.nextLine();
            System.out.println("line " + lineNumber + " :" + line);
            lineNumber++;
        }      
   
    }  
 
}
```
```
Output:
line 1 :--------------------- START------
-----------------------------------------------
line 2 :Java provides several way to read files.
line 3 :You can read file using Scanner, FileReader,
FileInputStream and BufferedReader.
line 4 :This Java program shows How to read file using java.util.Scanner class.
line 5 :--------------------- END-----------------------
---------------------------------
```
This is the content of test.txt file exception line numbers. You see it doesn't require much coding to read file in Java using Scanner. You just need to create an instance of Scanner and you are ready to read file.

Other Java IO tutorials you may like
What is memory mapped file in Java
How to parse XML File using DOM parser
How to read properties file in Java
How to read XML file in Java using JDOM library
How to find hidden files in Java with Example
How to set File permissions in Java

Read more: https://www.java67.com/2012/11/how-to-read-file-in-java-using-scanner-example.html#ixzz8hiR70n7z

## Why use Memory Mapped File or MapppedByteBuffer in Java? Example

Memory Mapped Files in Java is a rather new java concept for many programmers and developers, though it’s been there from JDK 1.4 along with java.nio package. Java IO has been considerably fast after the introduction of NIO and memory-mapped file offers the fastest IO operation possible in Java, that's the main reason of Why high-performance Java application should use Memory Mapped files for persisting data. It's already quite popular in the high-frequency trading space, where the electronic trading system needs to be super fast and one-way latency to exchange has to be on the sub-microsecond level.

IO has always been a concern for performance-sensitive applications and memory-mapped file allows you to directly read from memory and write into memory by using direct and non-direct byte buffers. 

The key advantage of  Memory Mapped File is that the operating system takes care of reading and writing and even if your program crashed just after writing into memory. OS will take care of writing content to File. 

One more notable advantage is shared memory, memory-mapped files can be accessed by more than one process and can act as shared memory with extremely low latency. See Peter's comment also in the comment section.

Earlier we have seen how to read xml files in Java and how to read a text file in java and in this Java IO tutorial we gonna look at what is a memory-mapped file, how to read and write from a memory-mapped file, and important points related to Memory Mapped Files.

And, If you are new to the Java world then I also recommend you go through these advanced core Java courses to learn Java in a better and more structured way. This is one of the best and up-to-date courses to learn Java online.

### What is Memory Mapped File and IO in Java
memory mapped file and io in java read write exampleMemory mapped files are special files in Java which allows Java program to access contents  directly from memory, this is achieved by mapping whole file or portion of file into memory and operating system takes care of loading page requested and writing into file while application only deals with memory which results in very fast IO operations. Memory used to load Memory mapped file is outside of Java heap Space. Java programming language supports memory mapped file with java.nio package and has MappedByteBuffer to read and write from memory.

### Advantage and Disadvantage of Memory Mapped file
Possibly main advantage of Memory Mapped IO is performance, which is important to build high frequency electronic trading system. Memory Mapped Files are way faster than standard file access via normal IO. Another big advantage of memory mapped IO is that it allows you to load potentially larger file which is not otherwise accessible. Experiments shows that memory mapped IO performs better with large files. 

Though it has disadvantage in terms of increasing number of page faults. Since operating system only loads a portion of file into memory if a page requested is not present in memory than it would result in page fault Most of major operating system like Windows platform, UNIX, Solaris and other UNIX like operating system supports memory mapped IO and with 64 bit architecture you can map almost any file into memory and access it directly using Java programming language. 

Another advantages is that the file can be shared, giving you shared memory between processes and can be more than 10x lower latency than using a Socket over loopback.

MappedByteBuffer Read Write Example in Java
Below example will show you how to read and write from memory mapped file in Java. We have used RandomAccesFile to open a File and then mapped it to memory using FileChannel's map() method, map method takes three parameter modes, start, and length of the region to be mapped. It returns MapppedByteBuffer which is a ByteBuffer for dealing with memory mapped file.

```java
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

  public class MemoryMappedFileInJava {

    private static int count = 10485760; //10 MB

    public static void main(String[] args) throws Exception {

        RandomAccessFile memoryMappedFile = new RandomAccessFile("largeFile.txt", "rw");

        //Mapping a file into memory

        MappedByteBuffer out = memoryMappedFile.getChannel().map(FileChannel.MapMode.READ_WRITE, 0, count);

        //Writing into Memory Mapped File
        for (int i = 0; i < count; i++) {
            out.put((byte) 'A');
        }

        System.out.println("Writing to Memory Mapped File is completed");     

        //reading from memory file in Java
        for (int i = 0; i < 10 ; i++) {
            System.out.print((char) out.get(i));
        }

        System.out.println("Reading from Memory Mapped File is completed");

    }

}
```

### Important Points about Memory Mapped File and IO in Java
To summarize the post here is quick summary of memory mapped files and IO in Java:

- 1. Java supports Memory mapped IO with java.nio package.
- 2. Memory mapped files is used in performance sensitive application e.g. high frequency electronic trading platforms.
- 3. By using memory mapped IO you can load portion of large files in memory.
- 4. Memory mapped file can result in page fault if requested page is not in memory.
- 5. Ability to map a region of file in memory depends on addressable size of memory. In a 32 bit machine you can not access beyond 4GB or 2^32.
- 6. Memory mapped IO is much faster than Stream IO in Java.
- 7. Memory used to load File is outside of Java heap and reside on shared memory which allow two different process to access File. By the way this depends upon, whether you are using direct or non-direct byte buffer.
- 8. Reading and writing on memory mapped file are done by operating system, so even if your Java Program crash after putting content into memory it will make to disk, until OS is fine.
- 9. Prefer Direct Byte buffer over Non Direct Buffer for higher performance.
- 10. Don't call MappedByteBuffer.force() method to often, this method is meant to force operating system to write content of memory into disk, So if you call force() method each time you write into memory mapped file, you will not see true benefit of using mapped byte buffer, instead it will be similar to disk IO.
- 11. In case of power failure or host failure, there is a slim chance that the content of the memory mapped file is not written into the disk, which means you could lose critical data.
- 12. MappedByteBuffer and file mapping remain valid until buffer is garbage collected. sun.misc.Cleaner is probably the only option available to clear memory mapped file.

That’s all on memory mapped file and memory mapped IO in Java. Its pretty useful concept and I encourage you to learn more about it. If you are working on high frequency trading space than memory mapped file is quite common there.

Read more: https://javarevisited.blogspot.com/2012/01/memorymapped-file-and-io-in-java.html#ixzz8hiS3BzuX

How to read Properties File in Java – XML and Text Example Tutorial

Reading and writing properties file in Java is a little different than reading or writing text file in Java or reading xml files in Java using xml parsers like DOM because Java provides the special provision to the properties file. For those who are not familiar with Properties files in java, It is used to represent configuration values like JDBC connectivity parameter or user preference settings and has been a primary source of injecting configuration on Java applications.  Properties file in Java is a text file that stores data in the form of key and value, key being known as property. Java allows you to read the value of the property by providing its name which makes it easy to access configuration settings. Many application like Spring and Spring Boot also uses property file for configurations for example application.properties is commonly used to setup Spring boot. 



Two more popular examples of properties file are jdbc.properties often used to store database connection settings like URL, username, and password, and log4j.properties file which settings for java logging using log4j. 

There are also many frameworks that use Java properties files like Struts, Spring, Displaytag, etc. Another advantage of using properties files is that you can represent data either in xml format or in properties format. xml format will be particularly useful if you are sharing configuration or settings with some external tool that understands only XML. 



In this article, we will see how to read and write into Properties files in Java in both xml and text format.

And, If you are new to Java Programming then I also recommend you go through these Java online courses on Udemy to learn Java in a better and more structured way. This is one of the best and up-to-date courses to learn Java online.

How to read Properties File in Java – XML and Text Example Tutorial




Reading values from Java Properties File
example of How to read Properties File in Java – XML and Text formatHere is a sample code example of reading a properties file in Java. In this example, we will read a property from jdbc.properties file which contains database connection settings, you might have already used that.

Anyway, it contains username, password, and jdbc driver class name as a key-value format. We will read these values from the Java program using java.util.Properties class which represents properties file in Java program.



jdbc.username=test
jdbc.password=unknown
jdbc.driver=com.mysql.jdbc.Driver

Code Examples of Reading Properties File in Java

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {

    public static void main(String args[]) throws FileNotFoundException, IOException {

        //Reading properties file in Java example
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("c:/jdbc.properties");
     
        //loading properties from a property file
        props.load(fis);

        //reading property
        String username = props.getProperty("jdbc.username");
        String driver = props.getProperty("jdbc.driver");
        System.out.println("jdbc.username: " + username);
        System.out.println("jdbc.driver: " + driver);

    }
}

Output:
jdbc.username: test
jdbc.driver: com.mysql.jdbc.Driver


If you read any property which is not specified in the properties file then you will props.getProperty() will return null. 

Now let's see another example of reading property files from xml format. as you know properties file in java can be represented in xml format and Java provides a convenient method called loadFromXML() to load properties from xml file. here is a quick example of parsing xml properties file and reading data.


How to Read Property file in XML format – Java
In the earlier section, we have seen a sample working code example of reading properties file (.properties) but as I said earlier you can also define property in xml format this method is also very popular among various Java logging frameworks e.g. log4j, and also among others. 

In this section, we will see how to read property file which is written in xml format. If you see the code not many changes instead of  Properties. load() we are using Properties.loadFromXML() and then the rest of the stuff of getting property and printing its value is the same as in the last example.

By the way here is our sample java properties file in xml format, which defined two entries with key jdbc.username and jdbc.password.


<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<!DOCTYPE properties SYSTEM "http://java.sun.com/dtd/properties.dtd">
   <properties> <entry key="jdbc.username">root</entry>
        <entry key="jdbc.password">mysql</entry>
   </properties>

And here is a Java program that will read XML properties file in Java:

public static void main(String args[]) throws FileNotFoundException, IOException {

        //Reading properties file in Java example
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("c:/properties.xml");
     
        //loading properties from properties file
        props.loadFromXML(fis);

        //reading property
        String username = props.getProperty("jdbc.username");
        System.out.println("jdbc.username: " + username);
     
}

output:
jdbc.username: root


We have seen how to read properties files in java, In both text and xml format. Properties file are immensely helpful for providing settings and configuration data to any Java program. Text properties file can only represent linear values but xml properties file can also represent hierarchical values which makes Properties file preferred choice in logging frameworks.


Read more: https://javarevisited.blogspot.com/2012/03/how-to-read-properties-file-in-java-xml.html#ixzz8hiXZ7BL5

How to Parse or Read XML File in Java >> XML Tutorial Example

How to parse xml files in Java or how to read xml files in java is one of common need of a Java Developer working with an enterprise Java application which uses XML for data representation, messaging, and data transfer. Java has good support to handle XML files and XML Documents and you can read XML Files in Java, create or write to XML file in Java by using various XML parsers available. Reading XML file is a little bit different than reading text or binary files in Java but it uses the same concept of File class.



Universal acceptability of XML and Java has helped them to grow together and they have a lot of things common in between just like Java is platform independence, XML provides data that is also platform-independent. You can use XML to transfer data between a legacy application written in C or C++ and Java.


What is important to work with XML in Java is the correct understanding of XML Parser, Basic knowledge of XML documents, etc. In this Java XML Tutorial, we will see how to parse an XML File by using both DOM  XML Parser. 

We will also see the difference between DOM and SAX parser in XML and other basics related to XML parsing in Java. I thought about this article after sharing my XPath notes in Java.






How to read XML File in Java
Here are a couple of ways to parse an XML file in Java. You will learn how to use JAXP and DOM parser to load the XML file in Java

1. JAXP - Java API for XML Parsing
Java provides extensive support for reading XML file, writing XML file and accessing any element from XML file. All XML parsing related classes and methods are inside JAXP. Though DOM related code comes from org.w3c.dom package. All XML parsers are in javax.xml.parsers package.we will see example of parsing xml files using JAXP API in next section.



2. Parse XML File in Java using DOM Parser
In this section, we will see how to parse xml files or how to read xml file using DOM XML Parser.DOM is a quick and easy way to parse xml files in Java and if you are doing it for testing its way to go. 

The only thing to concern is that XML files that need to be parsed must not be too large. You can also create xml file by using DOM parser and DocumentFactory Class in Java.

XML file for parsing in Java
Here is xml file Stocks.xml which contains some stocks and there price, quantity we will use this in our xml parsing example in Java.

<?xml version="1.0" encoding="UTF-8"?>
<stocks>
       <stock>
              <symbol>Citibank</symbol>
              <price>100</price>
              <quantity>1000</quantity>
       </stock>
       <stock>
              <symbol>Axis bank</symbol>
              <price>90</price>
              <quantity>2000</quantity>
       </stock>
</stocks>


3. Code Example of Parsing XML File in Java using DOM Parser
how to read or parse xml file in javaHere is a code example of parsing above xml file in Java using DOM parser:


import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMExampleJava {

public static void main(String args[]) {
try {

File stocks = new File("Stocks.xml");
DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
Document doc = dBuilder.parse(stocks);
doc.getDocumentElement().normalize();

System.out.println("root of xml file" + doc.getDocumentElement().getNodeName());
NodeList nodes = doc.getElementsByTagName("stock");
System.out.println("==========================");

for (int i = 0; i < nodes.getLength(); i++) {
Node node = nodes.item(i);

if (node.getNodeType() == Node.ELEMENT_NODE) {
Element element = (Element) node;
System.out.println("Stock Symbol: " + getValue("symbol", element));
System.out.println("Stock Price: " + getValue("price", element));
System.out.println("Stock Quantity: " + getValue("quantity", element));
}
}
} catch (Exception ex) {
ex.printStackTrace();
}
}

private static String getValue(String tag, Element element) {
NodeList nodes = element.getElementsByTagName(tag).item(0).getChildNodes();
Node node = (Node) nodes.item(0);
return node.getNodeValue();
}
}

Output:

root of xml file stocks
==========================
Stock Symbol: Citibank
Stock Price: 100
Stock Quantity: 1000
Stock Symbol: Axis bank
Stock Price: 90
Stock Quantity: 2000


That’s all on xml parsing in java for now. We have seen how to read and write xml files in Java and are now familiar with both DOM and SAX Parser in java. We will see more on xml in the coming days like reading xml elements via XPath and using xml beans etc. let me know if you have any doubt on xml parsing examples or in general with xml and Java.


Read more: https://javarevisited.blogspot.com/2011/12/parse-xml-file-in-java-example-tutorial.html#ixzz8hiY4ilia

How to read from and write to a text file in Java - Example Tutorial

Java has excellent support for reading from file and writing to file in Java. In the last post, we have seen how to create files and directories in Java and now we will see how to read content from files in java and how we will write text into file in Java. File provides a persistent solution to Java developers; in almost every Java application you need to store some of the data in persistent may be its user configuration, system configuration or related to state of the application but without persistence, no enterprise Java application can buildup. 


Normally Database is the preferred choice for storing data persistently but in high-frequency trading one doesn’t have the liberty to afford network latency to travel database and latency introduced by the database itself.

Though databases still offer the best choice for historical data, transactional details related to orders and trades are commonly stored in In-Memory files provided by Java.nio API.

Java NIO API also provides a faster way to read and write from a file in Java using FileChannel, after looking this way you can also try reading file using NIO API and FileChannel by following that example. 




How to read and write from a text file in Java
Though in this java file tutorial we are not talking about In Memory files, we will discuss plain old File classes and how to read and write into File in Java by using java.io package classes.

If we are working on a Standalone application then we have access to local file system and we can easily using the java API read and write on files, but we if we our application is running on browser based system then this will not work. If we are using input and output stream for reading and writing it’s very easy to understand. We have to follow three simple steps to achieve this task.

Ø       First get the File object
Ø       Create the File Stream from File object
Ø       Use this File Stream for reading or writing the data to the file in the file system.



Apart from this we need to remember some points which should be taken care at the time of reading and writing to the file in Java.

Ø       Always try to use reference of abstract classes or interfaces in place of implemented class or we can say concrete class it is a one of the good java practice also.
Ø       If needed use buffering  it’s a good practice because calling a read() method for single byte JVM will call the native operating system method and  calling a operating system method is expensive so Buffering will reduce this overhead from some extent.
Ø       If using buffer then mentions the buffer size also it will affect the read time and CPU time also.
Ø       Always Handle the Exceptions (IOException and FileNotFoundException)
Ø       Don’t forget to call close() method for resource which we are using such as File or Directory in Java. You can also use automatic resource management in JDK7 to automatically close any open resource in Java.


How to read from and write to a text file in Java - Example Tutorial



File read and write Example in Java
read and writ from text file in JavaNow we see a simple example of reading and writing binary data to a file in Java.


class FileStreamsReadnWrite {
public static void main(String[] args) {
try {
File stockInputFile = new File("C://stock/stockIn.txt");
File StockOutputFile = new File("C://stock/StockOut.txt");

                     /*
                      * Constructor of FileInputStream throws FileNotFoundException if
                      * the argument File does not exist.
                      */

FileInputStream fis = new FileInputStream(stockInputFile);
FileOutputStream fos = new FileOutputStream(StockOutputFile);
                     int count;

                     while ((count = fis.read()) != -1) {
                           fos.write(count);
                     }
                     fis.close();
                     fos.close();
              } catch (FileNotFoundException e) {
                     System.err.println("FileStreamsReadnWrite: " + e);
              } catch (IOException e) {
                     System.err.println("FileStreamsReadnWrite: " + e);
              }
       }
}



This is a very simple example where we are reading from stockInputfile and whatever contents are there we are writing that to stockoutput file one important point here is that FileInputStream should not be used to read character data file. It is meant for reading binary data such as an image file.

That’s all on how to read from a file in Java and writing data into a file in Java. It’s very important to understand the java.io package to get mastery in java and the best way is to write examples and simple programs and understand concepts.


Read more: https://javarevisited.blogspot.com/2011/12/read-and-write-text-file-java.html#ixzz8hiYNpsde

How to Change File Permissions in Java – Example Tutorial

Hello guys, In the last article, we saw how to check whether an application can access the file and perform any read-write or execute an operation on that file by using the inbuilt method provided by File Object. Now we deal with some more methods of file class which will use to provide some privileges to users so that they can perform read, write, and execute operations on the particular file. There are few more methods added with the new File API in Java 7, but in this tutorial, we will only learn about traditional ways to change the permission of a file from the Java program, which should work on all versions of JDK.
PlayUnmute
Fullscreen


How to set Execute Permission on File in Java
 boolean setExecutable(boolean exe, boolean owneronly) : This method is used to set the execute permission for the owner  of the file and also we can provide every user execute permission using this method, if the operation is successful then this method returns true.

This method is overloaded in this class if we want to provide execute permission only to the owner we can also use method  boolean setExecutable(boolean exe).

Here is a code example of setting or changing execute permission on File in Java. you can also change execute permission on directory similarly. In Unix, if a directory doesn't have to execute permission means you can not go inside that directory.









import java.io.File;
public class SetExecuteTest{

       public static void main(String[] args)throws SecurityException {

        File file = new File("C:/setExecuteTest.txt");

        if (file.exists()) {
            boolean bval = file.setExecutable(true);
            System.out.println("set the owner's execute permission: "+ bval);
        } else {
            System.out.println("File cannot exists: ");
        }

       if (file.exists()) {
            boolean bval = file.setExecutable(true,false);
            System.out.println("set the everybody execute permission: "+ bval);
        } else {
            System.out.println("File cannot exists: ");
        }
    }
}




Btw, if you don't remember all the file permission or forgot how to make a file read only or only group access, here is a nice diagram to recap what are different file permissions in UNIX or Linux environment:

How to Change File Permissions in Java – Example Tutorial





How to set Write Permission on File in Java
how to change or set file permissions in java code exampleboolean setWriteable(boolean write,boolean owneronly) : This method is used to set the write permission for the owner of the file, and also we can provide every user write permission using this method ,if the operation is successful then this method returns true. 

This method is overloaded and if we want to provide write permission only to the owner of the file we can use instead boolean setWritable(boolean write).

here is a code example of setting write permission to a file in Java. same code can also be used to change write permission from a Java File.

import java.io.File;


public class SetWritableTest{

       public static void main(String[] args)throws SecurityException {

        File file = new File("C:/setWriteableTest.txt");
        
        //set write permission on file only for owner
        if (file.exists()) {
            boolean bval = file.setWritable(true);
             System.out.println("set the owner's write permission: "+ bval);
        } else {
             System.out.println("File cannot exists: ");
        }

        //Set write permission on File for all.
        if (file.exists()) {
            boolean bval = file.setWritable(true,false);
            System.out.println("set the every user write permission: "+ bval);
        } else {
            System.out.println("File cannot exists: ");
        }


    }
}

How to set Read Permission on File in Java
boolean setReadable(boolean read,boolean owneronly) : This method is used to set the read permission for the owner of the file and also we can provide every user read permission using this method,if the operation is successful then this method returns true. This method is overloaded and if we want to provide read permission only to the owner we can use instead boolean setReadable(boolean read).

here is a complete code example to set write permission on File in Java. this code can also be used change write permission of a file in Java.

import java.io.File;
public class SetReadableTest{

       public static void main(String[] args)throws SecurityException {

        File file = new File("C:/setReadableTest.txt");
        if (file.exists()) {

            boolean bval = file.setReadable(true);
            System.out.println("set the Owner Read permission: "+ bval);
        } else {
            System.out.println("File cannot exists: ");
        }

       if (file.exists()) {
            boolean bval = file.setReadable(true,false);
            System.out.println("set the every user Read permission: "+ bval);
        } else {
            System.out.println("File cannot exists: ");
        }
    }
}


How to make a directory read-only in Java
boolean setReadOnly() : This method is used to make the file or directory read-only if we call this method on any file then no write operation can not be performed on that file.

import java.io.*;

public class SetReadOnlyTest{
      public static void main(String[] args)throws SecurityException {
           
        File file = new File("C:/setReadOnlyTest.txt");
        if (file.exists()) {
            boolean bval = file.setReadOnly();
            System.out.println("Read opearation is permitted: "+bval);
        } else {
            System.out.println("File cannot exists: ");
        }

    }
}


Read more: https://javarevisited.blogspot.com/2012/01/change-file-permissions-java-change.html#ixzz8hiYlA9OJ

Why character array is better than String for Storing password in Java? Example

Why character array is better than String for storing a password in Java was a recent question asked to one of my friends in a java interview. he was interviewing for a Technical lead position and has over 6 years of experience. Both Character array and String can be used to store text data but choosing one over the other is a difficult question if you haven't faced the situation already. But as my friend said any question related to String must have a clue on a special property of Strings like immutability and he used that to convince the interviewer. here we will explore some reasons why should you use char[] for storing passwords than String.




character array over string storing password javaThis article is in continuation of my earlier interview question post on String e.g. Why String is immutable in Java or How Substring can cause a memory leak in Java if you haven't read those you may find them interesting.


Here are a few reasons which make sense to believe that character array is a better choice for storing the password in Java than String:

1) Since Strings are immutable in Java if you store the password as plain text it will be available in memory until the Garbage collector clears it and since String is used in the String pool for reusability there is a pretty high chance that it will remain in memory for a long duration, which poses a security threat. 

Since anyone who has access to memory dump can find the password in clear text and that's another reason you should always use an encrypted password than plain text. Since Strings are immutable there is no way the contents of Strings can be changed because any change will produce new String, while if you char[] you can still set all his elements as blank or zero. So Storing the password in a character array clearly mitigates security risk of stealing passwords.

2) Java itself recommends using getPassword() method of JPasswordField which returns a char[] and deprecated getText() method which returns password in clear text stating security reason. Its good to follow advice from Java team and adhering to a standard rather than going against it.



3) With String there is always a risk of printing plain text in a log file or console but if use Array you won't print contents of the array instead its memory location gets printed. though not a real reason still makes sense.

String strPassword="Unknown";
char[] charPassword= new char[]{'U','n','k','w','o','n'};
System.out.println("String password: " + strPassword);
System.out.println("Character password: " + charPassword);

String password: Unknown
Character password: [C@110b053


That's all on why character array is a better choice than String for storing passwords in Java.  Though using char[] is not just enough you need to erase content to be more secure. I also suggest working with hash'd or encrypted password instead of plain text and clearing it from memory as soon as authentication is completed.


Read more: https://javarevisited.blogspot.com/2012/03/why-character-array-is-better-than.html#ixzz8hiYz9MLH

How to replace Anonymous Class to Lambda Expression in Java 8? Example Tutorial

Hello guys, you may be thinking why I am talking about Anonymous class now when many Java programmers have already switched to Java 8 and many have already moved on from Anonymous class to Lambda expression in? Well, I am doing it because I am seeing many Java programmers who find it difficult to write and read code using lambda expression in new Java 8 way. It's also my own experience that if you know the problem first, you can better understand the solution (lambda expression). Some of you might remember, the opening scene of MI 2 (Mission Impossible 2), when Nekhorovich says to Dimitri that "Every search for a hero must begin with something that every hero requires, a villain. Therefore, in our search for a hero, Belairiform, we created the monster, Chimera". 

Well, Anonymous class is not that sort of monster but it is one of the reason which makes lambda expression hero of Java 8.  Though Anonymous class is not the only reason lambda expression was introduced in Java, it provides you a nice problem solution analogue to understand the use of lambda expression in Java and how it can help in writing cleaner, more readable code.


If you know the purpose of Anonymous class in Java, which is a way to pass a block of dynamic code to a function, you will understand the purpose of lambda expression too and this is what you will learn here. In this article, I'll show you three very common Java examples using Anonymous class which will help you to learn and understand lambda expression better.



PlayUnmute
Fullscreen

3 Examples of Anonymous Class which can be replaced with Lambda Expression
Here are three common examples where I have used Anonymous class in past and which can be better written using Lambda expression and method reference in Java:



1. Sorting a List using Comparator
One of the most common place where you might have seen Anonymous class in Java is while sorting list of objects. Suppose you have a list of Books and you want to sort them on price. You use Collections.sort() method which requires code to compare object because it does know sorting but doesn't know how to compare objects. 


Now, how do you pass a block of code to a function in Java? You just can't. Java is an object-oriented language, so you must wrap the code inside a method and then wrap the method inside a class, and then create an object and pass that object to the function. This is painful isn't it?

Anonymous class solved that problem by doing all that on the fly as shown in following example, but it has its own problems which is why Lambda expression was introduced and we will see it in this article:

import java.util.*;

class Book {
    int price;
    String title;

    public Book(int price, String title) {
        this.price = price;
        this.title = title;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book(100, "Building Microservices"),
            new Book(200, "Microservices in Action"),
            new Book(50, "Effective Java")
        );

        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.price - b2.price;
            }
        });

        for (Book b : books) {
            System.out.println(b.title + " - $" + b.price);
        }
    }
}

The above Java program creates a Book class with two properties: price and title. Then, it creates a list of Book objects, sorts it using a custom Comparator object defined as an anonymous class, and prints the sorted books.

If you look at the code of Anonymous class, you will find that only useful code which method needed was the comparison logic e.g. book1.getPrice()-> book2.getPrice() but you write a lot more code to facilitate that. 


This boiler code makes your code ugly and less readable. Lambda expression solves this problem by removing all that boiler plat and only passing the crux of the code which matter, as shown below.
Other important examples of using Anonymous class in Java are running code on separate thread and handling Events on GUI which I will explain later when I will update this article. 

3 Examples of Anonymous Class to Learn Lambda Expression better in Java 8




Important points about Anonymous class and Lambda expression in Java
Now, let's revise important points about both Anonymous class and Lambda Expression in Java:

1. Like it says, Anonymous class is a class without name i.e. Anonymous, hence it cannot be reused.

2. Anonymous class was one of the way to pass code to a method e.g. Collections.sort() which requires code for comparison, Runnable.run() which requires code to be run on separate thread, and Button.actionPerformed() which requires code to be executed when a button is clicked.



3. Lambda expression makes it easy to pass a block of code to a function by removing all the boiler plate surrounding it due to object-oriented nature of Java programming language. This block of code is also refer as Anonymous function, similar to what JavaScript has.

4. You can also view lambda expression as method e.g. (int x, int y) ->> x + y is a method where left hand side is argument passed to method and right hand side is the code method execute and return the result of computation. 

Since Java is strongly typed language, you can further take out type definition e.g. int, which reduces this lambda expression to x, y->> x + y. The return statement is also omitted as lambda expression implicitly return value.


5. You can use lambda expression instead of Anonymous class in Java 8. This will make your code more expressive, clear and concise. It will also reduce memory footprint of compiled code because a new class will not be created for Anonymous class every time you use them.


That's all about common example of Anonymous class in Java which can be used to learn Lambda expression better. Once you understand what Anonymous class do and why we used it Java e.g. for passing some code to a function, you will immediately realize what lambda expression is doing. This is way better than understanding lambda expression by reading tutorials on syntax and trying to write lambdas. 

Once you understand purpose, syntax will flow naturally to you. Though, Anonymous class was not the only reason lambda expression was introduced, it also help to write functional style code in Java 8. I suggest you to read Java 8 in Action to learn more about motivation behind lambda expression and what it offer to Java world apart from solving the problem of Anonymous class.



Read more: https://www.java67.com/2023/01/3-examples-of-anonymous-class-to-lambda.html#ixzz8hiZL1cke

How to sort a Map by keys in Java 8 - Example Tutorial

Hello Java friends, In the last article, I have shown you how to sort a Map by values in Java 8, and in this tutorial, you will learn how to sort a Map by keys like a HashMap, ConcurrentHashMap, LinkedHashMap, or even Hashtable. Theoretically, you cannot sort a Map because it doesn't provide any ordering guarantee. For example, when you iterate over a HashMap, you don't know in which order entries will be traversed because HashMap doesn't provide any ordering. Then, how can you sort a Map which doesn't support order? Well, you can't and that's why you only sort entries of HashMap but you don't store the result back into HasMap or any other Map which doesn't support ordering. If you do so, then sorting will be lost.



Here is an example of incorrect sorting.

 Here even after sorting the Map, we are doing the mistake of storing the result back into a Map that doesn't provide any ordering guarantee, hence the result is an unordered map even after sorting.

Map sorted = budget
.entrySet()
.stream()
.sorted(comparingByKey())
.collect(toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2));

Here is the output to confirm what I said:
map before sorting: {grocery=150, utility=130, miscellaneous=90,
 rent=1150, clothes=120, transportation=100}
map after sorting by keys: {grocery=150, utility=130, miscellaneous=90,
 rent=1150, clothes=120, transportation=100}

If Map was sorted then the "clothes" should have come first ahead of "grocery". The mistake was blindly relying on toMap() method of the Collectors class. This class provides no guarantee of what kind of Map will be used to collect those elements. 

Since Map interface doesn't guarantee order, they are also not bound to store elements in any order. The same goes true for Set also, they also doesn't guarantee any order and only List is the collection which guarantees order. In fact, this is the most important difference between List, Set, and Map in Java. 



However, it's easy to solve this problem because the Collectors class also provides an overloaded version of toMap() class which allows you to instruct which kind of Map should be used to store those entries. 

You can use a LinkedHashMap to store mappings to preserve the sorting order because LinkedHashMap keeps keys in the order they were added. 

Here is the modified code which sorts a Map in the order of keys:

Map sorted = budget
.entrySet()
.stream()
.sorted(comparingByKey())
.collect(toMap(e -> e.getKey(), e -> e.getValue(),
(e1, e2) -> e2), LinkedHashMap::new));

The code passed into to toMap() method is interesting, the first parameter is used as a key, the second is used as a value and the third is used to break ties i.e. if two entries are equal then which entries will be chosen is decided by the third parameter, here we are using the second entry. 

The fourth parameter is the important one, which uses a constructor reference to tell Collector that copying a LinkedHashMap should be used. 






6 Steps to sort a Map by keys in Java 8
Here are the high-level steps you can take to sort a Map e.g. HashMap, Hashtable, ConcurentHashMap, or LinkedHashMap to sort them in the ascending and descending order of their keys:

1) Get all entries by calling the Map.entrySet() method

2) Get a stream of entries by calling the stream() method, which Set inherit from the Collection interface.

3) Sort all entries of Stream by calling the sorted() method.

4) In order to sort them by keys, provide a Comparator to a sorted() method that sorts entries by keys. This can be done by calling Map.Entry.comparingKey() method returns a Comparator which compares keys in their natural order.

5) Store the result of sorting in a LinkedHashMap by using the collect() method of Stream class.

6) Use Collectors.toMap() method to collect sorted entries into LinkedHashMap

Here is a block diagram which shows all the steps to sort a Map by key in Java:

6 Steps to sort a Map by keys in Java 8







Java Program to sort a Map by keys in JDK 8
Here is the complete Java program to sort Map e.g. HashMap by keys in JDK 8. In this example, you will learn to sort Map by both lambda expression and method reference. 

We'll also use new classes e.g. Stream and new methods added into Map.Entry class to sort all entries by their Map and store the result into a LinkedHashMap.

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.stream.Collectors.*;
import static java.util.Map.Entry.*;

/*
* Java Program to sort a Map by keys in Java 8
* 
*/
public class Java8Demo{

public static void main(String[] args) throws Exception {

// a Map with string keys and integer values
Map<String, Integer> budget = new HashMap<>();
budget.put("clothes", 120);
budget.put("grocery", 150);
budget.put("transportation", 100);
budget.put("utility", 130);
budget.put("rent", 1150);
budget.put("miscellneous", 90);

System.out.println("map before sorting: " + budget);

// let's sort this map by keys first
Map<String, Integer> sorted = budget
.entrySet()
.stream()
.sorted(comparingByKey())
.collect(
toMap(e -> e.getKey(), e -> e.getValue(),
(e1, e2) -> e2, LinkedHashMap::new));

System.out.println("map after sorting by keys: " + sorted);

// above code can be cleaned a bit by using method reference
sorted = budget
.entrySet()
.stream()
.sorted(comparingByKey())
.collect(
toMap(Map.Entry::getKey, Map.Entry::getValue,
(e1, e2) -> e2, LinkedHashMap::new));


// now let's sort the map in decreasing order of keys
sorted = budget
.entrySet()
.stream()
.sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
.collect(
toMap(Map.Entry::getKey, Map.Entry::getValue,
(e1, e2) -> e2, LinkedHashMap::new));

System.out.println("map after sorting by keys in descending order: " + sorted);
}

}

Output
map before sorting: {grocery=150, utility=130, miscellneous=90, 
       rent=1150, clothes=120, transportation=100}
map after sorting by keys: {clothes=120, grocery=150, miscellaneous=90, 
       rent=1150, transportation=100, utility=130}
map after sorting by keys in descending order: {utility=130, 
       transportation=100, rent=1150, miscellaneous=90, grocery=150, clothes=120}


You can see that initially map was not sorted but it is later sorted in the order of keys, which are a string and that's why clothes come ahead of the grocery. 

Similarly, when we sorted the map in descending order, clothes come last.

This proves that our sorting code is working fine.


If you want more sophistication and customization you can do that at the Comparator level and you can provide additional Comparator to comparingKey() method, which by default compare keys in their natural order.

For example, if a key were not String but a user object e.g. a Book, then you could have sorted the book by title, author, or price by providing the corresponding comparator to comparingKey() method of java.util.Map.Entry class. Both comparingKey() and comparingValue() are overloaded to accept a Comparator. 

Here is a nice diagram which shows both unsorted map and two sorted map which are sorted by key in ascending and descending order in Java:

How to sort a Map by keys in Java 8 - Example Tutorial




That's all about how to sort a Map by keys in Java 8. The simplest way to achieve this is by using the sorted() method of Stream and the newly added comparingKey() method of Map.Entry class. The stream sorts all elements and then depending upon your need, you can either print entries in sorted order or store them in an ordered map.

For example, LinkedHashMap, or a sorted map like TreeMap. You can also sort entries in their reverse order by just reversing the Comparator using the Collections.reverseOrder() method or Comparator.reversed() method of Java 8.


Read more: https://javarevisited.blogspot.com/2017/07/how-to-sort-map-by-keys-in-java-8.html#ixzz8hiZiGx1u

Top 21 Java HashMap Interview Questions and Answers

The java.util.HashMap is one of the workhorses of JDK. Along with ArrayList, it is one of the most used classes from Java's collection framework. There is hardly a real-world Java project, where I haven't seen the use of HashMap. It is an implementation of hash table data structure, and it's not a surprise that HashMap is so useful, as someone has rightly said, "if you could have just one data structure, make it a hash table". The hash table data structure allows you to search for a value in O(1) time if you have a key. In Java, several implementations of hash table data structures exist like Hashtable, ConcurrentHashMap, LinkedHashMap, etc. but HashMap is your general-purpose map.


Though, if you have a special need, you can use other hash table implementations available in JDK. For example, if you want to preserve the order of mapping, then you can consider using LinkedHashMap. If you wish to keep mappings sorted, then you can use TreeMap, which is a sorted map implementation.

Similarly, if you need a hash table implementation that is thread-safe and can be used in a concurrent application without compromising the Scalability, then consider using a ConcurrentHashMap from JDK 5.

Btw, if you are new to the Java world and JDK API in particular, I suggest you first go through an online Java course like the ones I have recommended in my list of best free core Java courses.  That will not only help you to do well on interviews but also help you to understand the fundamentals better.






Java HashMap Interview Questions
Here is my list of HashMap questions from Java Interviews. This list includes questions based on the internal implementation of HashMap, the Map API, how you use HashMap, and standard best practices while using HashMap in a Java application.


1. How does the put() method of HashMap works in Java? (answer)
The put() method of HashMap works in the principle of hashing. It is responsible for storing an object into the backend array. The hashcode() method is used in conjunction with a hash function to find the correct location for the object into the bucket. If a collision occurs, then the entry object which contains both key and value is added to a linked list, and that linked list is stored into the bucket location.


2. What is the requirement for an object to be used as a key or value in HashMap? (answer)
The key or value object must implement the equals() and hashcode() method. The hash code is used when you insert the key object into the map while equals are used when you try to retrieve a value from the map.



3. What will happen if you try to store a key that is already present in HashMap? (answer)
If you store an existing key in the HashMap, then it will override the old value with the new value, and put() will return the old value. There will not be any exception or error.


4. Can you store a null key in Java HashMap? (answer)
Yes, HashMap allows one null key, which is stored at the first location of bucket array e.g., bucket[0] = value. The HashMap doesn't call hashCode() on the null key because it will throw NullPointerException, hence when a user call the get() method with null, then the value of the first index is returned.



5. Can you store a null value inside HashMap in Java? (answer)
Yes, HashMap also allows null value; you can store as many null values as you want, as shown in the hashmap example post in this blog.



6. How does HashMap handle collisions in Java? (answer)

The java.util.HashMap uses chaining to handle collisions, which means new entries, an object which contains both key and values, are stored in a linked list along with the existing value, and then that linked list is stored in the bucket location.

In the worst case, where all key has the same hashcode, your hash table will be turned into a linked list, and searching a value will take O(n) time as opposed to O(1) time.



If you want to learn more about hash table data structure, I suggest you consult a good data structure and algorithm course like these best data structures and algorithms courses, which not only cover basic data structure like an array, linked list, binary tree, and hash table but also advanced concepts like O(n) sorting algorithms, Radix sort, Counting sort, etc.

Top 21 Java HashMap Interview Questions and Answers



7. Which data structure HashMap represents? (answer)
The HashMap is an implementation of hash table data structure, which is idle for mapping one value to other like id to name as you can search for value in O(1) time if you have the key.



8. Which data structure is used to implement HashMap in Java? (answer)
Even though HashMap represents a hash table, it is internally implemented by using an array and linked list data structure in JDK.  The array data structure is used as a bucket, while a linked list is used to store all mappings which land in the same bucket. From Java 8 onwards, the linked list is dynamically replaced by binary search tree, once a number of elements in the linked list cross a certain threshold to improve performance.



9. Can you store a duplicate key in HashMap? (answer)
No, you cannot insert duplicate keys in HashMap, it doesn't allow duplicate keys. If you try to insert an existing key with the new or same value, then it will override the old value, but the size of HashMap will not change i.e., it will remain the same. This is one of the reasons when you get all keys from the HashMap by calling keySet(). It returns a Set, not a Collection because Set doesn't allow duplicates.



10. Can you store the duplicate value in Java HashMap? (answer)
Yes, you can put duplicate values in HashMap of Java. It allows duplicate values; that's why when you retrieve all values from the Hashmap by calling the values() method, it returns a Collection and not a Set. Worth noting is that it doesn't return List because HashMap doesn't provide any ordering guarantee for key or value.



If you want to explore, you can also see these online Java Collections courses to learn more about fundamental properties of different collections in Java, like List, Set, and Map.

Java HashMap Interview Questions and Answers


11. Is HashMap thread-safe in Java? (answer)
No, HashMap is not a thread-safe in Java. You should not share a HashMap with multiple threads if one or more thread is modifying the HashMap e.g., inserting or removing a map. Though, you can easily share a read-only HashMap.


12. What will happen if you use HashMap in a multithreaded Java application? (answer)
If you use HashMap in a multithreaded environment in such a way that multiple threads structurally modify the map like add, remove or modify mapping, then the internal data structure of HashMap may get corrupt like some links may go missing, some may point to incorrect entries, and the map itself may become completely useless. Hence, it is advised not to use HashMap in the concurrent application; instead, you should use a thread-safe map e.g., ConcurrentHashMap or Hashtable.


13. What are the different ways to iterate over HashMap in Java? (answer)
Here are some of the ways to iterate over HashMap in Java:
by using keySet and iterator
by using entrySet and iterator
by using entrySet and enhanced for loop
by using keySet and get() method

You can see this article for an example of each of these ways to traverse a HashMap in Java.


14. How do you remove a mapping while iterating over HashMap in Java? (answer)
Even though HashMap provides a remove() method to remove a key and a key/value pair, you cannot use them to remove a mapping while traversing a HashMap. Instead, you need to use the Iterator's remove method to remove a mapping as shown in the following example:

Iterator itr = map.entrySet().iterator();

while(itr.hasNext()){
  Map.Entry current = itr.next();

  if(current.getKey().equals("matching"){
     itr.remove(); // this will remove the current entry.
  }
}

You can see that we have used Iterator.remove() method to remove the current entry while traversing the map. See this article to learn more about it.


15. In which order mappings are stored in HashMap? (answer)
Random order because HashMap doesn't provide any ordering guarantee for keys, values, or entries. When you iterate over a HashMap, you may get a different order every time you iterate over it.





16. Can you sort HashMap in Java? (answer)
No, you cannot sort a HashMap because, unlike List, it is not an ordered collection. Albeit, you can sort contents of HashMap by keys, values, or by entries by sorting and then storing the result into an ordered map like LinkedHashMap or a sorted map e.g., TreeMap.


17. What is the load factor in HashMap? (answer)
A load factor is a number that controls the resizing of HashMap when a number of elements in the HashMap cross the load factor as if the load factor is 0.75 and when becoming more than 75% full then resizing trigger which involves array copy.


18. How does resize happens in HashMap? (answer)
The resizing happens when the map becomes full or when the size of the map crosses the load factor. For example, if the load factor is 0.75 and then becomes more than 75% full, then resizing trigger, which involves an array copy. First, the size of the bucket is doubled, and then old entries are copied into a new bucket.


19. How many entries you can store in HashMap? What is the maximum limit? (answer)
There is no maximum limit for HashMap, you can store as many entries as you want because when you run out of the bucket, entries will be added to a linked list which can support an infinite number of entries, of course until you exhaust all the memory you have.

Btw, the size() method of HashMap return an int, which has a limit, once a number of entries cross the limit, size() will overflow, and if your program relies on that, then it will break.



This issue has been addressed in JDK 8 by introducing a new method called mappingCount(), which returns a long value. So, you should use mappingCount() for large maps. See Java SE 8 for Really Impatient to learn more about new methods introduced in existing interfaces in JDK 8.

Top 10 Java HashMap Interview Questions and Answers



21. What is the difference between the capacity and size of HashMap in Java? (answer)

The capacity denotes how many entries HashMap can store, and size denotes how many mappings or key/value pair is currently present.


21. What will happen if two different keys of HashMap return the same hashcode()? (answer)
If two keys of HashMap return the same hash code, then they will end up in the same bucket; hence collision will occur. They will be stored in a linked list together.


Read more: https://www.java67.com/2017/08/top-10-java-hashmap-interview-questions.html#ixzz8hia1tgIG

Top 50 Java Programs from Coding Interviews
Here is a big list of Java programs for Job Interviews. As I said, it includes questions from problem-solving, linked list, array, string, matrix, bitwise operators and other miscellaneous parts of programming. Once you are gone through these questions, you can handle a good number of questions on real Job interviews.

1. Fibonacci series (solution)
Write a simple Java program which will print Fibonacci series, e.g. 1 1 2 3 5 8 13 ... . up to a given number. We prepare for cross questions like using iteration over recursion and how to optimize the solution using caching and memoization.

2. A prime number (solution)
Write a Java program to check if a given number is prime or not. Remember, a prime number is a number which is not divisible by any other number, e.g. 3, 5, 7, 11, 13, 17, etc. Be prepared for cross, e.g. checking till the square root of a number, etc.

3. String Palindrome (solution)
You need to write a simple Java program to check if a given String is palindrome or not. A Palindrome is a String which is equal to the reverse of itself, e.g., "Bob" is a palindrome because of the reverse of "Bob" is also "Bob."  

Though be prepared with both recursive and iterative solution of this problem. The interviewer may ask you to solve without using any library method, e.g. indexOf() or subString() so be prepared for that.



4. Integer Palindrome (solution)
This is generally asked as follow-up or alternative of the previous program. This time you need to check if given Integer is palindrome or not. An integer is called palindrome if it's equal to its reverse, e.g. 1001 is a palindrome, but 1234 is not because the reverse of 1234 is 4321 which is not equal to 1234. You can use divide by 10 to reduce the number and modulus 10 to get the last digit. This trick is used to solve this problem.

5. Armstrong number (solution)
A number is called an Armstrong number if it is equal to the cube of its every digit. For example, 153 is an Armstrong number because of 153= 1+ 125+27, which is equal to 1^3+5^3+3^3. You need to write a program to check if the given number is Armstrong number or not.


6. Avoiding deadlock in Java (solution)
This is one of the interesting programs from Java Interviews, mostly asked to 2 to 3 years of experienced programmers or higher. The interviewer simply asked you to write code where a resource is accessed by multiple threads. 

You need to write code in such a way that no deadlock should occur. The trick to solving this problem is acquiring resources in order and release them in reverse order, e.g. first acquire resource R1 and only if you have got R1 to go for R2. This way, you can avoid deadlock.


7. Factorial (solution)
This is one of the simplest programs you can expect in interviews. It is generally asked to see if you can code or not. Sometimes interviewer may also ask about changing a recursive solution to iterative one or vice-versa.

8. Reverse a String (solution)
This problem is similar to the String Palindrome problem we have discussed above. If you can solve that problem, you can solve this as well. You can use indexOf() or substring() to reverse a String or alternatively, convert the problem to reverse an array by operating on character array instead of String. 


9. Remove duplicates from an array (solution)
Write a program to remove duplicates from an array in Java without using the Java Collection API. The array can be an array of String, Integer or Character, your solution should be independent of the type of array. If you want to practice more array-based questions, then see this list of top 30 array interview questions from Java interviews.


10. Printing patterns (solutions)
In this exercise you will be asked to print various kind of patterns like printing star patterns or printing pyramid patterns. Another common coding problem is printing left and right triangle of stars or numbers which require use of nested loops in Java. 


11. Print repeated characters of String? (solution)
This is another common coding interview questions where you need to print repeated characters like AAABBCCCC. You can solve this coding problem to learn about how to use loops and how to use break and continue to control the loop in Java. 


12. GCD of two numbers (solution)
GCD also known as Greatest Common divisor is a number which can fully divide the given two numbers. You can solve this problem either with brute force algorithms or you can also use Euclid's algorithm to find the GCD of two given numbers. 


13. The square root of a number (solution)
You need to write a program to calculate the square root of a number without using the Math.sqrt() function of JDK. You need to write your logic and method to calculate the square root. You can though use the popular algorithm, like Newton's method.


14. Reverse array in place (solution)
This one is my favorite coding exercise and I have asked this question multiple time on coding interviews. In place algorithms are quite useful while dealing with large data sets, for example if you have to reverse an array with 1 million objects then its very expensive to create another array of same size, at that time, this in place algorithm is a better choice. 

15. Reverse words of a sentence (solution)

16. Leap year (solution)

17. Binary search (solution)

18. String Anagram (solution)
Write a program to check if two given String is Anagram of each other. Your function should return true if two Strings are Anagram, false otherwise. A string is said to be an anagram if it contains the same characters and same length, but in a different order, e.g. army and Mary are anagrams. You can ignore cases for this problem, but you should clarify that from your interview.



19. Design a Vending Machine (solution)
This one of the popular OOAD (object-oriented analysis and design) question from Java Interviews. You will be given 3 hours to design and code a vending machine satisfying some of the business requirements. You also need to write unit tests to prove your code satisfy those requirements. You can see this article for more object-oriented analysis questions.

20. Reverse a number (solution)

21. The first non-repeated character of String (solution)

22. Finding Middle element of linked list in one pass (solution)

23. Pre-order traversal (solution)

24. Pre-order traversal without recursion (solution)

25. In order traversal (solution)

26. In order traversal without recursion (solution)

27. Post-order traversal (solution)

28. Postorder traversal without recursion (solution)

29. Print all leaves of a binary tree (solution)


30. Sort array using quicksort (solution)
You need to write a Java program to sort an array of integers using a quick sort algorithm. You cannot use any library method, e.g. JDK or a third party library, which means, you need to first implement the quicksort algorithm and then sort the array.


31. Insertion sort (solution)
Write a program to implement the insertion sort algorithm in Java. The program should take an unsorted array and sort it using insertion sort algorithm Also explain the best case and worst case time and space complexity of the Insertion sort algorithm.

32. Bubble sort (solution)
Write a program to implement the bubble sort algorithm in Java. You can use basic operators and functions, but sorting functions from Java API is not allowed.

33. Transpose a matrix (solution)

34. Print all permutations of String (solution)
Write a Java program to print all permutations of a given String. For example, if given String is "GOD" then your program should print all 6 permutations of this string, e.g. "GOD," "OGD," "DOG," "GDO," "ODG," and "DGO."

Java Programming Interview Questions for 2 to 3 years


35. Reverse a String in place (solution)

36. Adding two matrices in Java (solution)

37. Matrix multiplication (solution)

38. Removal all white space from String (solution)

39. Reverse a linked list (solution)
Write a program to reverse a singly linked list in Java. You can use iteration and recursion to solve this problem, but you should reverse a linked list in place.

Java Programming Interview Questions for experienced


40. Find the length of the linked list (solution)
Just write a program in Java to find the length of a singly linked list in one pass, i.e. in just one iteration of a singly linked list.


41. Check if a linked list has a loop (solution)
Write a program to check if given linked list has a loop or not. Sometimes a linked list get corrupt, and two nodes point to the same node, which forms the loop or cycle in the linked list.

42. Find the start of loop in a linked list (solution)
This is the extension of previous problem, once you are able to detect a loop in the linked list, the node where you deduct the loop becomes the starting point. 

43. Find the middle element of a linked list (solution)
You can find the middle element of a linked list by using two pointer coding interview patterns or slow and fast pointer approach where one pointer will be slow and move one step at a time and other will be fast and move two steps at a time. This way when first pointer will reach the end of the list, the second pointer will be at the middle element of the linked list. 

44. Find the 3rd element from the tail linked list (solution)
You need to write a program to find the 3rd element from the tail of a singly linked list. You need to solve this problem without iterating twice. If you want more linked list questions, you can see the article about frequently asked linked list interview questions.

Java Coding Interview Questions



44. Convert a linked list to a binary tree (solution)
It's possible to convert a doubly-linked list to a binary tree, you need to write a Java program which takes a doubly-linked list and returns a binary tree.


45. Sort a linked list (solution)
You need to given an unsorted linked list, and you need to write a program in Java to sort them in ascending order of the values in each node.


46. Iterative Quicksort (solution)
You need to write a Java program to implement quicksort sorting algorithm without recursion. You can use essential JDK classes and programming constructs, but recursion is not allowed.


46. Bucket sort (solution)
This program is increasingly getting popular on Java interview because it sorts a given array in linear time. Though there is a lot of prerequisites, e.g. you must know the maximum value present in the array, it is a very interesting problem from interview point of view. 

You need to write a program to implement a bucket sort algorithm in Java.



47. Counting sort (solution)
This is another problem which is similar to the previous one because counting sort is also a linear sorting algorithm. Just remember that bucket sort, and counting sort are different algorithms, so it's also good to state how they are different.


48. Check if two string rotation of each other
Write a program which accepts two given String and checks if they are the rotation of each. If they then return true otherwise return false. A String is said to be a rotation of other string if they contain same characters and the sequence is rotated across any character, e.g. "dabc" is a rotation of "abcd" but "dbac" is not.  If you want to practice more string-based questions, you can also see my list of 20 String-based algorithm questions from Java interviews.


49. LRU cache in Java (solution)
Write a program to implement an LRU cache in Java.  An LRU cache means Least Recently Used Cache which removes the least recently used element if the cache is full. You can use the  LinkedHashMap to implement LRU cache in Java.

Java Programming Interview Questions



50. Merge sort (solution)
Implement the merge sort algorithm in Java. You can write a recursive or iterative solution, whichever you like. You also need to explain the time and space complexity for the best, worst, and average case. If you need hint, Merge sort is based on divide and conquer technique, where you divide a big array or list into small parts and then sort them individually and then merge it. 

Java Programs from Programming Interviews


Now, let's see a couple of System deign questions which you can also prepare for programming interviews:

1. Difference between JWT, OAuth, and SAML? (answer)

2. Reverse Proxy and Forward Proxy? (answer)

3. Horizontal scaling and vertical scaling? (answer)

4. Microservices and Monolithic architecture? (Answer)

5. What is Rate Limiter? How does it work? (answer)

6. API Gateway vs Load Balancer? [solution] 

7. How does Single Sign On (SSO) works? (answer)

8. How does Apache Kafka works? why it so fast? (answer)

9. Difference between Kafka, ActiveMQ, and RabbitMQ? (answer)


That's all about top 50 programs from Java interviews. You can practice these Java programs even if you are not preparing for any Job interview. They not only help you to do well on your programming job interviews but also on learning how to code and developing your programming skill and coding sense.

These small programs touch several important areas, e.g. popular data structures like an array, linked list, binary tree, binary search tree, string, etc., popular algorithms, e.g. sieve of the Eratosthenes algorithm for generating primes, the Euclidean algorithm for calculating LCM, and GCF, Fibonacci sequence, printing patterns and so on.


Read more: https://javarevisited.blogspot.com/2017/07/top-50-java-programs-from-coding-Interviews.html#ixzz8hiankN5z

Java and OOP Overloading and Overriding Interview Questions
Ok, let's start with questions. Here is my list of 17 method overloading and overriding interview question which covers basics as well as some tricky parts of overloading and overriding. You can also write some code to test the concept and see when the compiler gives an error and which method is get called at run-time.




1) What is method overloading in Java?
If you have two methods which do the same thing it's better they have the same name, but two methods cannot have the same name until you overload them. 

So overloading is a process of declaring two methods with the same name but different method signature like System.out which is object of PrintStream class has several println() method to print different data types e.g. byte, short, int, char, float and double. All of them are called the overloaded method. 

Overloaded method calls are resolved during compile time in Java and they must have different method signatures. See here to learn more about method overloading in Java.


2) What is method overriding in Java?
Method overriding is another way to define a method with same name but different code but it must be in subclass. Overriding is based upon run-time Polymorphism as method calls are resolved at run-time depending upon actual object.  

For example if a variable of type Parent holds an object of Child class then method invoked will be from child class and not parent class, provides its overridden. 

In order to override a method, you must follow rules of method overriding which means declaring method with same signature in sub class. See here to learn more about method overriding in Java.


3) What is method hiding in Java?
static method cannot be overriding in Java because their method calls are resolved at compile time but it didn't prevent you from declaring method with same name in sub class. In this case we say that method in sub class has hidden static method from parent class. 


If you have a case where variable of Parent class is pointing to object of Child class then also static method from Parent class is called because overloading is resolved at compile time. See here to learn more about method hiding in Java.


4) What are the rules of overloading a method in Java?
One and only rule of method overloading in Java is that the method signature of all overloaded method must be different. 

Method signature is changed by changing either number of method arguments, or type of method arguments e.g. System.out.println() method is overloaded to accept different primitive types like int, short, byte, float etc.

They all accept just one argument but their type is different. You can also change method signature by changing order of method argument but that often leads to ambiguous code so better to be avoided. See here for full list of rules.


5) Difference between method overloading and overriding?
The fundamental difference between overloading and overriding is that formerly took place during compile time while later took place during run-time. 

Due to this reason, its only possible to overload virtual methods in Java. You cannot overload methods which are resolved during compile time e.g. private, static and final method cannot be overridden in Java. 



Also, rules of method overloading and overriding are different, for example in order to overload a method its method signature must be different but for the overriding method, it must be the same. See this image to learn more difference between overriding and overloading in Java.

Method overloading and overriding interview questions and answers


6) Can we overload static method in Java?
Yes, its possible to overload static method in Java. You can declare as many static method with same name as you want until all of them have different method signature. Remember, return type is not part of method signature, so they must have either different number of arguments, or different type of argument. 

There is a third option also which changes order of argument but I suggest not to do that because it often result in the ambiguous method call. It's very important to follow these best practices while overloading a static method in Java.


7) Can we override static method in Java?
No, you cannot override static method in Java because they are resolved and bonded during compile time. Since overriding is a run-time activity and if a method call is already resolved at compile time then it will not take place and that's why it's not possible to override static method in Java. 

But, you can define another static method of same signature in sub class, this is known as method hiding. Actual method called will depends upon the type of class and not on type of object as its the case with overriding. See here to learn more about why you cannot override static method in Java.


8) Can you prevent overriding a method without using final modifier?
Yes, there are some funky ways to prevent method overriding in Java. Though final modifier is only for that purpose you can use private keyword to prevent method overriding. How? If you remember correctly, in order to override a method, the class must be extensible. 


If you make the constructor of parent class private then its not possible to extend that class because its constructor will not be accessible in sub class, which is automatically invoked by sub class constructor, hence its not possible to override any method from that class. 

This technique is used in Singleton design pattern, where constructor is purposefully made private and a static getInstance() method is provided to access singleton instance. See here to learn more techniques to prevent method overriding in Java.


9) Can we override a private method in Java?
No, you cannot override private method in Java. Since private methods are not visible outside the class, they are not available in sub-class hence they cannot be overridden. By the way, how about overriding a private method inside an Inner class? Is it possible? See here to learn more why you cannot override private method in Java.


10) What is covariant method overriding?
One of the rule of method overriding is that return type of overriding method must be same as overridden method but this restriction is relaxed little bit from Java 1.5 and now overridden method can return sub class of return type of original method. 

This relaxation is known as co-variant method overriding and it allows you to remove casting at client end. 

One of the best examples of this comes when you override clone() method. Original Object.clone() method returns Object which needs to cast, but with co-variant method overriding you can directly return relevant type e.g. Date class returns object of java.util.Date instead of java.lang.Object. See here to learn more about co-variant method overriding in Java.


11) Can we change argument list of overridden method?
No, you cannot change the argument list of overridden method in Java. An overriding method must have same signature as original method. Only return type can be changed that to only to sub type of return type of original method.


12) Can we change return type of method in subclass while overriding?
No, you cannot change the return type of method during overriding. It would be violation of rules of overriding. Though from Java 5 onward you can replace the return type with sub type e.g. if original method has return type as java.lang.Object then you can change return type of overridden method as any type e.g. clone() method. This is also known as co-variant method overriding in Java.


13) Can we override a method which throws run-time exception without throws clause?
Yes, you can. There is no restriction on throwing RuntimeException from overriding method. So if your original method throws NullPointerException than its not necessary to throw NPE from overriding method as well.


14) How do you call super class version of an overriding method in sub class?
You can call it using super keyword. For example if you have a method calculate() in both parent and child class then from child class you can invoke parent class method calculate() as super.calculate(). It's very similar to calling super class constructor from sub class as shown here.


15) What are rules of method overriding in Java?
Some rules of method overriding are following :
Overriding method cannot throw higher exception than overridden one, but that's only true for checked exception.
Overriding method cannot restrict access of overridden method e.g. if original method is public then overriding method must be public, but it can expand access e.g. if original method is protected than overriding method can be protected or public.
See here for full list of rules of method overriding in Java.


16) Can we override a non-static method as static in Java?
No, its not possible to define a non-static method of same name as static method in parent class, its compile time error in Java. See here to learn more about the overriding static method in Java.


17) Can we override the constructor in Java?
No, you cannot override constructors in Java because they are not inherited. Remember, we are talking about overriding here not overloading, you can overload construct but you cannot override them.


Overriding always happens in child class and since constructors are not inherited and their name is always the same as the class name it's not possible to override them in Java, to learn more about constructors see here


18) Can we override a final method in Java?
No, you cannot override a final method in Java. Trying to override a final method in a subclass will result in a compile-time error. Actually making a method final is signal to all developer that this method is not for inheritance and it should be used in its present form. You generally make a method final due to security reasons, to learn more see here.


19) Can you overload or override the main method in Java?
Since main() is a static method in Java, it follows rules associated with the static method, which means you can overload the main method but you cannot override it. 

By the way, even if you overload the main method, JVM will always call the standard public static void main(String args[]) method to start your program, if you want to call your overloaded method you need to do it explicitly in your code as shown here.


That's all about some Java interview questions from method overloading and overriding concept. I must admit it a tricky concept to master. I have seen even experienced developers struggling to solve quiz and multiple-choice questions based upon overloading and overriding. 


Read more: https://www.java67.com/2015/08/top-10-method-overloading-overriding-interview-questions-answers-java.html#ixzz8hib6hutt


1. What is the difference between Hashtable and HashMap in Java?
This Java collection interview question is I guess the most popular one. Most of Java programmer who has at least 2 years of experience has seen this question on core Java interview. Well, there is much difference between them but most important is thread-safety, HashMap is not thread-safe while Hashtable is a thread-safe collection.

Btw, If you want to learn more about essential Collection classes like HashMap and Hashtable then I highly recommend you check Java Fundamentals: Collections course by Richard Warburton on Pluralsight. It's a great course to learn about the Java Collection Framework in general. 

Top 10 Java Collection interview Questions Answers for Beginners


2. What is the difference between Hashtable and ConcurrentHashMap in Java?
Another frequently asked Java collection interview question post-Java 5 world which introduced Concurrent Collection classes like ConcurrentHashMap and CopyOnWriteArrayList along with Concurrency utilities like CyclicBarrier and CountDownLatch.

Well, both Hashtable and ConcurrentHashMap are thread-safe here but later provide more scalability than the former. You can further see the Difference between ConcurrentHashMap and Hashtable in Java for the answer to this Java collection interview question.


3. What is the difference between Iterator and Enumeration in Java?
One of the classic interview Questions asked on the Java collection framework, Which is pretty old and a programmer who has been working in Java for 4 to 6 years must have seen this question before. Well, Iterator and ListIterator in Java is a new way to iterator collection in Java and provides the ability to remove an object while traversing while Enumeration doesn't allow you to remove the object.  You can further see Iterator vs Enumeration in Java for more differences between both of them.


4. What is the Difference between fail-safe and fail-fast Iterator in Java?
This is a relatively new Java collection interview question because the concept of a fail-safe iterator is come along with ConcurrentHashMap and CopyOnWriteArrayList. See the Difference between fail-safe and fail-fast Iterator in Java for the answer to this Java collection question.


5. How HashMap works internally in Java?
One of the most frequently asked Java interview questions to experience Java programmer with 4 to 5 years of experience. I have seen this question on big companies like Morgan Stanley, JP Morgan, Nomura, and other banks like Barclays Capital. See How HashMap works internally in Java for a detailed answer to this Java collection interview question.


6. Can you write code to traverse Map in Java in 4 ways?
Another Java collection question appears as part of the Java Coding interview question and appeared in many interviews. As you know there are multiple ways to traverse or iterate Map in Java e.g. for loop, while loop using Iterator etc. 4 ways to iterator Map in Java has detailed explanation and sample code which is sufficient to answer this Java collection framework interview question.


7. What is the difference between Vector and ArrayList in Java?
Java Collection Interview Questions Answers | Java Collection FAQAlong with the Difference between HashMap and Hashtable, this Java collection interview question is probably second in the list of frequently asked questions on the Java collection framework. Both ArrayList and Vector implement List interface from Java 4 but they have differences including synchronization, See the difference between Vector and ArrayList in Java for the complete answer of this collection interview question in Java.


8. What is the difference between ArrayList and LinkedList in Java?
A follow-up question is asked in response to the previous Java collection interview question. Here also both LinkedList and ArrayList are List implementations but their internal data structure is different, one is derived from Array while the other is derived from LinkedList. See LinkedList vs ArrayList in Java to answer this Java Collection interview question.


9. What is the difference between List and Set in Java?
List vs Set is one of the most important concepts to understand in the Java Collection framework and this Java collection interview question focuses on that. The most important difference between them is that List allows duplicates and maintain insertion order while Set doesn't allow duplicates and doesn't maintain any order. See the Difference between Set and List in Java to see more differences between them.

Here is also a nice summary of different collection classes in Java:

Java Collection interview Questions Answers



10. How do you find if ArrayList contains duplicates or not?
Since List allows duplicates this becomes a follow-up question of earlier Java collection framework interview question. See How to check if ArrayList contains duplicates or not for the answer of this Java collection question.


Read more: https://www.java67.com/2012/09/java-collection-interview-questions.html#ixzz8hibewzag

1. What is the difference between the start and run method in Java Thread? (answer)
This thread interview question is also asked as if the start() method eventually calls the run() method then why do you need to call the start() method, why not call the run() method directly. well, the reason is that because start method creates a new thread and calls the code written inside the run method on a new thread while calling the run method executes that code on the same thread. You can also see the article start vs run method in Java for more details.




2. Write code to avoid deadlock in Java where N threads are accessing N shared resources? (answer)
This is a classic Java multithreading interview question, which appears on almost every list of Java thread questions. This question is based on risks and issues faced by parallel programs without proper synchronization or incorrect synchronization.

This question explores the concept of looking and best practices on acquiring and releasing the lock on shared resources. By the way, it's been covered in many places as well and I suggest reading  How to prevent deadlock in Java, not only for a detailed answer to this Java multithreading question but also to learn how to prevent deadlock in Java.

thread interview questions for experience Java programmers





3. Which one is better to implement thread in Java? extending Thread class or implementing Runnable? (answer)
Well, this is another frequently asked question on any Java thread interview. Essentially these are two ways to implement Thread in Java, by extending the java.lang.Thread class or by implementing the java. lang.Runnable interface.

By extending the class you are using your chance to extend one any only one class as Java does not support multiple inheritances, by implementing a Runnable interface you can still extend another class. So extending Runnable or even Callable is a better choice. You can also see the Runnable vs Thread class in Java for more answers to these questions.

Given its simplicity and fact-based nature, this question mostly appears on either telephonic rounds or initial screening rounds. Key points to mention, while answering this question includes multiple Inheritance at the class level and separation of defining a task and execution of a task. Runnable only represents a task, while Thread represents both tasks and their execution.




4. What is Busy Spinning? Why will you use Busy Spinning as a wait strategy? (answer)
This is one of the advanced concurrency interview questions in Java and only asked to experienced and senior Java developers, with lots of concurrent coding experience under the belt. By the way, the concept of busy spinning is not new, but its usage with multi-core processors has risen recently.

The busy waiting is a wait strategy, where one thread waits for a condition to become true, but instead of calling the wait or sleep method and releasing the CPU, it just spins. This is particularly useful if the condition is going to be true quite quickly i.e. in a millisecond or microsecond.

The advantage of not releasing CPU is that all cached data and instruction remain unaffected, which may be lost, had this thread is suspended on one core and brought back to another thread. If you can answer this question, that rest assured of a good impression.


5. What is the difference between CountDownLatch and CyclicBarrier in Java? (answer)
CountDownLatch and CyclicBarrier in Java are two important concurrency utility which is added on Java 5 Concurrency API. Both are used to implement scenarios, where one thread has to wait for another thread before starting processing but there is a difference between them.

The key point to mention, while answering this question is that CountDownLatch is not reusable once the count reaches zero, while CyclicBarrier can be reused even after the barrier is broken.

You can also see my previous article difference between CyclicBarrier and CountDownLatch in Java for a more detailed answer to this concurrency interview question and a real-life example of where to use these concurrency utilities.




6. What is the difference between wait and sleep in Java? (method)
One more classic Java multithreading question from the telephonic round of interviews. The key point to mention while answering this question is to mention that wait will release the lock and must be called from the synchronized context, while sleep will only pause the thread for some time and keep the lock.

By the way, both methods throw IntrupptedException and can be interrupted, which can lead to some follow-up questions like, can we awake a sleeping or waiting for a thread in Java? You can also read a detailed answer on my post of the same title here.

thread interview questions with answers



7. How do you solve the producer-consumer problem in Java? (solution)
One of my favorite questions during any Java multithreading interview, Almost half of the concurrency problems can be categorized in the producer-consumer pattern. There are basically two ways to solve this problem in Java, One by using the wait and notify method and the other by using BlockingQueue in Java.  later is easy to implement and a good choice if you are coding in Java 5.

The key points to mention, while answering this question is the thread-safety and blocking nature of BlockingQueue and how that helps, while writing concurrent code.

You can also expect lots of follow-up questions including, what happens if you have multiple Producer threads or multiple consumers, what will happen if a producer is faster than a consumer thread, or vice-versa. You can also see this link for an example of how to code producer-consumer design in Java using a blocking queue



8. Why is ConcurrentHashMap faster than Hashtable in Java? (answer)
ConcurrentHashMap is introduced as an alternative to Hashtable in Java 5, it is faster because of its design. ConcurrentHashMap divides the whole map into different segments and only locks a particular segment during the update operation, instead of Hashtable, which locks the whole Map.

The ConcurrentHashMap also provides a lock-free read, which is not possible in Hashtable, because of this and lock striping, ConcurrentHashMap is faster than Hashtable, especially when the number of the reader is more than the number of writers.

In order to better answer this popular Java concurrency interview question, I suggest reading my post about the internal working of ConcurrentHashMap in Java.






9. What is the difference between the submit() and execute() method of Executor and ExecutorService in Java? (answer)
The main difference between submitting and execute methods from the ExecutorService interface is that the former returns a result in the form of a Future object, while the latter doesn't return a result. 


By the way, both are used to submit a task to thread pool in Java but one is defined in the Executor interface, while the other is added into the ExecutorService interface. This multithreading interview question is also asked in the first round of Java interviews.


10. How do you share data between two threads in Java? (answer)
One more Java multithreading question from the telephonic round of interviews. You can share data between threads by using shared objects or shared data structures like Queue. Depending upon, what you are using, you need to provide the thread-safety guarantee, and one way of providing thread-safety is using a synchronized keyword.

If you use concurrent collection classes from Java 5 e.g. BlockingQueue, you can easily share data without being bothered about thread safety and inter-thread communication. I like this thread question, because of its simplicity and effectiveness. This also leads further follow-up questions on issues that arise due to sharing data between threads e.g. race conditions.



11. What is ReentrantLock in Java? Have you used it before? (answer)
ReentrantLock is an alternative to the synchronized keyword in Java, it is introduced to handle some of the limitations of synchronized keywords. Many concurrency utility classes and concurrent collection classes from Java 5, including ConcurrentHashMap use ReentrantLock, to leverage optimization.

The ReentrantLock mostly uses an atomic variable and faster CAS operation to provide better performance. Key points to mention are the difference between ReentrantLock and synchronized keywords in Java, which includes the ability to acquire lock interruptibly, timeout feature while waiting for a lock, etc.



 ReentrantLock also gives the option to create a fair lock in Java. Once again a very good Java concurrency interview question for experienced Java programmers. Courses like Java Multithreading for Senior Engineering Interviews course from Educative. also help you to prepare better and answer to the point.

thread, concurrency and multi-threading questions for experienced Java programmers



12. What is ReadWriteLock in Java? What is the benefit of using ReadWriteLock in Java? (answer)
This is usually a follow-up question of previous Java concurrency questions. The  ReadWriteLock is again based upon the concept of lock striping, one of the advanced thread-safety mechanisms that advocates separating locks for reading and writing operations (see Java Concurrency in Practice Bundle by Heinz Kabutz for more details).

If you have noticed before, reading operation can be done without locking if there is no writer and that can hugely improve the performance of any application. The ReadWriteLock leverages this idea and provides policies to allow maximum concurrency level. Java Concurrency API also provides an implementation of this concept as ReentrantReadWriteLock.

Depending upon the Interviewer and experience of the candidate, you can even expect to provide your own implementation of ReadWriteLock, so be prepared for that as well.

Here is a nice diagram that clearly explains the working of read-write lock in Java:

Java Multithreading and Concurrency Interview Questions with Answers


Read more: https://www.java67.com/2012/08/5-thread-interview-questions-answers-in.html#ixzz8hibztSYl

How to avoid deadlock in Java? Example Tutorial and Tips

How to avoid deadlock in Java? Is one of the popular Java interview question and flavor of the season for multi-threading, asked mostly at a senior level with lots of follow up questions. Even though the problem looks very basic but most of the Java developers get stuck once you start going deep. Interview questions start with, "What is a deadlock?" The answer is simple when two or more threads are waiting for each other to release the resource they need (lock) and get stuck for infinite time, the situation is called deadlock. It will only happen in the case of multitasking or multi-threading.



Btw, if you are serious about mastering Java multi-threading and concurrency then I also suggest you take a look at the Java Multithreading, Concurrency, and Performance Optimization course by Michael Pogrebinsky on Udemy. It's an advanced course to become an expert in Multithreading, concurrency, and Parallel programming in Java with a strong emphasis on high performance


How do you detect deadlock in Java?
Though this could have many answers, my version is; first I would look at the code if I see a nested synchronized block or calling one synchronized method from other, or trying to get a lock on a different object then there is a good chance of deadlock if a developer is not very careful.

Another way is to find it when you actually get dead-locked while running the application, try to take a thread dump, in Linux you can do this by the command "kill -3", this will print status of all threads in an application log file, and you can see which thread is locked on which object.

You can analyze that thread dump with using tools like fastthread.io which allows you to upload your thread dump and analyze it.

Another way is to use the jConsole/VisualVM, it will show you exactly which threads are getting locked and on which object.

If you are interested to learn about troubleshooting tools and processes to analyze your thread dump, I suggest you take a look at Analyzing Java Thread Dumps course on Pluralsight by Uriah Levy. An advanced practical course to learn more about Java thread dumps, and familiarize you with other popular advanced troubleshooting tools.




I also suggest you join the Java Concurrency in Practice Bundle by Heinz Kabutz, one of the most advanced course material to master concurrency and multi-threading in Java. It's based on the classic Java Concurrency in Practice book by Brian Goetz, which is a recommended reading for every Java developer.


Write a Java program that will result in deadlock?
Once you answer the earlier question, they may ask you to write code which will result in a deadlock in Java?

here is one of my version

/**
 * Java program to create a deadlock by imposing circular wait.
 * 
 * @author WINDOWS 8
 *
 */
public class DeadLockDemo {

    /*
     * This method request two locks, first String and then Integer
     */
    public void method1() {
        synchronized (String.class) {
            System.out.println("Aquired lock on String.class object");

            synchronized (Integer.class) {
                System.out.println("Aquired lock on Integer.class object");
            }
        }
    }

    /*
     * This method also requests same two lock but in exactly
     * Opposite order i.e. first Integer and then String. 
     * This creates potential deadlock, if one thread holds String lock
     * and other holds Integer lock and they wait for each other, forever.
     */
    public void method2() {
        synchronized (Integer.class) {
            System.out.println("Aquired lock on Integer.class object");

            synchronized (String.class) {
                System.out.println("Aquired lock on String.class object");
            }
        }
    }
}


If method1() and method2() both will be called by two or many threads, there is a good chance of deadlock because if thread 1 acquires lock on String object while executing method1() and thread 2 acquires lock on Integer object while running method2() both will be waiting for each other to release the lock on Integer and String to proceed further which will never happen.

This diagram precisely demonstrates our program, where one thread holds a lock on one object and waiting for other object locks which are owned by other thread.

How do you avoid deadlock in Java?


You can see that Thread 1 wants the lock on object 2 which is held by Thread 2, and Thread 2 wants a lock on Object 1 which is held by Thread 1. Since no thread is willing to give up, there is a deadlock, and the Java program is stuck.

The idea is that you should know the right way to use common concurrent patterns, and if you are not familiar with them then Applying Concurrency and Multi-threading to Common Java Patterns by Jose Paumard is a good starting point to learn.



How to avoid deadlock in Java?
Now the interviewer comes to the final part, one of the most important in my view; How do you fix a deadlock in code? Or How to avoid deadlock in Java?



If you have looked above code carefully, then you may have figured out that real reason for the deadlock is not multiple threads but the way they are requesting a lock, if you provide ordered access then the problem will be resolved.



Here is my fixed version, which avoids deadlock by avoiding circular wait with no preemption, one of the four conditions which need for deadlock.

public class DeadLockFixed {

    /**
     * Both method are now requesting lock in same order, 
     * first Integer and then String.
     * You could have also done reverse e.g. first String and then Integer,
     * both will solve the problem, as long as both method are requesting lock
     * in consistent order.
     */
    public void method1() {
        synchronized (Integer.class) {
            System.out.println("Aquired lock on Integer.class object");

            synchronized (String.class) {
                System.out.println("Aquired lock on String.class object");
            }
        }
    }

    public void method2() {
        synchronized (Integer.class) {
            System.out.println("Aquired lock on Integer.class object");

            synchronized (String.class) {
                System.out.println("Aquired lock on String.class object");
            }
        }
    }
}


Now there would not be any deadlock because both methods are accessing lock on Integer and String class literal in the same order. So, if thread A acquires a lock on Integer object, thread B will not proceed until thread A releases Integer lock, same way thread A will not be blocked even if thread B holds String lock because now thread B will not expect thread A to release Integer lock to proceed further.


Read more: https://javarevisited.blogspot.com/2018/08/how-to-avoid-deadlock-in-java-threads.html#ixzz8hicQQTML

How to use ConcurrentHashMap in Java - Example Tutorial and Working

ConcurrentHashMap in Java is introduced as an alternative of Hashtable in Java 1.5 as part of the Java concurrency package. Prior to Java 1.5 if you need a Map implementation, which can be safely used in a concurrent and multi-threaded Java program, then, you only have Hashtable or synchronized Map because HashMap is not thread-safe. With ConcurrentHashMap, now you have a better choice; because not only it can be safely used in the concurrent multi-threaded environment but also provides better performance over Hashtable and synchronizedMap.



ConcurrentHashMap performs better than the earlier two because it only locks a portion of Map, instead of the whole Map, which is the case with Hashtable and synchronized Map. CHM allows concurred to read operations and at the same time maintains integrity by synchronizing write operations.

 We have seen the basics of ConcurrentHashMap on Top 5 Java Concurrent Collections from JDK 5 and 6 and in this Java tutorial, we will learn:

Ø       How ConcurrentHashMap works in Java or how it is implemented in Java.
Ø       When to use ConcurrentHashMap in Java
Ø       ConcurrentHashMap examples in Java
Ø       And some important properties of CHM.


And, If you are new to the Java world then I also recommend you go through these free online Java courses from Udemy to learn Java in a better and more structured way. This is one of the best and up-to-date courses to learn Java online.

How ConcurrentHashMap is implemented in Java
ConcurrentHashMap is introduced as an alternative of Hashtable and provided all functions supported by Hashtable with an additional feature called "concurrency level", which allows ConcurrentHashMap to partition Map. ConcurrentHashMap allows multiple readers to read concurrently without any blocking. 

This is achieved by partitioning Map into different parts based on concurrency level and locking only a portion of Map during updates. The default concurrency level is 16, and accordingly, Map is divided into 16 part and each part is governed with a different lock. 

This means, 16 threads can operate on Map simultaneously until they are operating on a different part of Map. This makes ConcurrentHashMap high performance despite keeping thread-safety intact.  Though, it comes with a caveat. Since update operations like put(), remove(), putAll() or clear() is not synchronized, concurrent retrieval may not reflect most recent change on Map.





In the case of putAll() or clear(), which operates on the whole Map, the concurrent read may reflect insertion and removal of only some entries. Another important point to remember is iteration over CHM, Iterator returned by keySet of ConcurrentHashMap are weekly consistent and they only reflect the state of ConcurrentHashMap and certain point and may not reflect any recent change. Iterator of ConcurrentHashMap's keySet area also fail-safe and doesn’t throw ConcurrentModificationExceptoin..

Default concurrency level is 16 and can be changed, by providing a number that makes sense and works for you while creating ConcurrentHashMap. Since concurrency level is used for internal sizing and indicates a number of concurrent update without contention, so, if you just have few writers or thread to update Map keeping it low is much better. ConcurrentHashMap also uses ReentrantLock to internally lock its segments.

Internal implementation of ConcurrentHashMap in Java

And, If you are new to the Java world then I also recommend you go through these best Java online courses from Udemy and Coursera to learn Java in a better and more structured way. This is one of the best and up-to-date courses to learn Java online.



ConcurrentHashMap putifAbsent example in Java
ConcurrentHashMap examples are similar to Hashtable examples, we have seen earlier,  but worth knowing is the use of putIfAbsent() method. Many times we need to insert entry into Map if it's not present already, and we wrote following kind of code:

synchronized(map){
  if (map.get(key) == null){
      return map.put(key, value);
  } else{
      return map.get(key);
  }
}

Though this code will work fine in HashMap and Hashtable, This won't work in ConcurrentHashMap; because, during put operation whole map is not locked, and while one thread is putting value, other thread's get() call can still return null which results in one thread overriding value inserted by other thread. 

Of course, you can wrap the whole code in the synchronized block and make it thread-safe but that will only make your code single-threaded. ConcurrentHashMap provides putIfAbsent(key, value) which does the same thing but atomically and thus eliminates the above race condition. 


See Core Java for Inpatients for more details about how to use this method effectively:


ConcurrentHashMap putIfAbsent() example in Java



When to use ConcurrentHashMap in Java
Java ConcurrentHashMap Example Tutorial and internal working
ConcurrentHashMap is best suited when you have multiple readers and a few writers. If writers outnumber the reader, or the writer is equal to the reader, then the performance of ConcurrentHashMap effectively reduces to synchronized map or Hashtable. Performance of CHM drops, because you got to lock all portions of Map, and effectively each reader will wait for another writer, operating on that portion of Map. ConcurrentHashMap is a good choice for caches, which can be initialized during application startup and later accessed by many request processing threads. 

As JavaDoc states, CHM is also a good replacement of Hashtable and should be used whenever possible, keeping in mind, that CHM provides a slightly weaker form of synchronization than Hashtable.




Summary
Now we know What is ConcurrentHashMap in Java and when to use ConcurrentHashMap, it’s time to know and revise some important points about CHM in Java.

1. ConcurrentHashMap allows concurrent read and thread-safe update operation.

2. During the update operation, ConcurrentHashMap only locks a portion of Map instead of whole Map.

3. The concurrent update is achieved by internally dividing Map into the small portion which is defined by concurrency level.

4. Choose concurrency level carefully as a significantly higher number can be a waste of time and space and the lower number may introduce thread contention in case writers over number concurrency level.

5. All operations of ConcurrentHashMap are thread-safe.

6. Since ConcurrentHashMap implementation doesn't lock the whole Map, there is chance of read overlapping with update operations like put() and remove(). In that case, result returned by get() method will reflect the most recently completed operation from there start.

7. Iterator returned by ConcurrentHashMap is weekly consistent, fail-safe and never throw ConcurrentModificationException. In Java.

8. ConcurrentHashMap doesn't allow null as key or value.

9. You can use ConcurrentHashMap in place of Hashtable but with caution as CHM doesn't lock the whole Map.

10. During putAll() and clear() operations, the concurrent read may only reflect the insertion or deletion of some entries.


Read more: https://javarevisited.blogspot.com/2013/02/concurrenthashmap-in-java-example-tutorial-working.html#ixzz8hicitcPl

1. What is difference between TCP and UDP protocol? 
There are many differences between TCP (Transmission Control Protocol) and UDP (User Datagram Protocol), but the main is TCP is connection-oriented, while UDP is connectionless. This means TCP provides guaranteed delivery of messages in the order they are sent, while UDP doesn't provide any delivery guarantee.

Because of this guarantee, TCP is slower than UDP, as it needs to perform more work. TCP is best suited for the message, which you can't afford to lose, like. order and trade messages in electronic trading, wire transfer in banking and finance, etc. UDP is more suited for media transmission, where the loss of one packet, known as datagrams is affordable and doesn't affect the quality of service.

This answer is enough for most of the interviews, but you need to be more detailed when you are interviewing as Java developer for a high-frequency trading desk. Some of the points which many candidates forget to mention is about order and data boundary.

In TCP, messages are guaranteed to be delivered in the same order as they are sent but data boundary is not preserved, which means multiple messages can be combined and sent together, or receiver may receive one part of the message in one packet and other parts of the message in next packet.

Though the application will receive the full message and in the same order. TCP protocol will do the assembling of message for you. On the other hand, UDP sends a full message in a datagram packet, if clients receive the packet it is guaranteed that it will get the full message, but there is no guarantee that the packet will come in the same order they are sent.

In short, you must mention the following differences between TCP and UDP protocol while answering during the interview :
TCP is guaranteed delivery, UDP is not guaranteed.
TCP guarantees order of messages, UDP doesn't.
Data boundary is not preserved in TCP, but UDP preserves it.
TCP is slower compared to UDP.
for a more detailed answer, see my post 9 differences between TCP and UDP protocol.



2. How does TCP handshake works? 
Three messages are exchanged as part of TCP head-shake e.g. Initiator sends SYN,  upon receiving this Listener sends SYN-ACK, and finally, initiator replied with ACK, at this point TCP connection is moved to ESTABLISHED state. This process is easily understandable by looking at the following diagram.

Java Networking Interview Questions and Answers





3. How do you implement reliable transmission in UDP protocol? 
This is usually a follow-up to the previous interview question. Though UDP doesn't provide a delivery guarantee at the protocol level, you can introduce your own logic to maintain reliable messaging e.g. by introducing sequence numbers and retransmission.

If the receiver finds that it has missed a sequence number, it can ask for a replay of that message from the Server. TRDP protocol, which is used Tibco Rendezvous (a popular high speed messaging middle-ware) uses UDP for faster messaging and provides reliability guarantee by using sequence number and retransmission.


4. What is Network Byte Order? How do two hosts communicate if they have different byte-ordering? There are two ways to store two bytes in memory, little-endian (least significant byte at the starting address) and big-endian (most significant byte at the starting address). They are collectively known as host byte order. 

For example, an Intel processor stores the 32-bit integer as four consecutive bytes in memory in the order 1-2-3-4, where 1 is the most significant byte.

IBM PowerPC processors would store the integer in the byte order 4-3-2-1. Networking protocols such as TCP are based on a specific network byte order, which uses big-endian byte ordering. If two machines are communicating with each other and they have different byte ordering, they are converted to network byte order before sending or after receiving.

Therefore, a little-endian micro-controller sending to a UDP/IP network must swap the order in which bytes appear within multi-byte values before the values are sent onto the network, and just swap the order in which bytes appear in multi-byte values received from the network before the values are used. In short, you can also say network byte order is the standard of storing bytes during transmission, and it uses a big-endian byte ordering mechanism.

What is Network Byte Order?




5. What is Nagle's algorithm?
If the interviewer is testing your knowledge of TCP/IP protocol then it's very rare for him not to ask this question. Nagle's algorithm is a way of improving the performance of TCP/IP protocol and networks by reducing the number of TCP packets that need to be sent over the network. It works by buffering small packets until the buffer reaches Maximum Segment Size.

Since small packets, which contain only 1 or 2 bytes of data, has more overhead in terms of TCP header, which is 40 bytes. These small packets can also lead to congestion in a slow network. Nagle's algorithm tries to improve the efficiency of TCP protocol by buffering them, to send a larger packet.

Also, Nagle's algorithm has a negative effect on non-small writes, so if you are writing large data on packets then it's better to disable Nagle's algorithm. 

In general, Nagle's algorithm is a defense against the careless application, which sends lots of small packets to the network, but it will not benefit or have a negative effect on well-written applications, which properly takes care of buffering.

Here is also a nice diagram which explains the network traffic with and without Nagle's algorithm:


What is Nagle's algorithm?




6. What is TCP_NODELAY? 
TCP_NODELAY is an option to disable Nagle's algorithm, provided by various TCP implementations. Since Nagle's algorithm performs badly with the TCP delayed acknowledgment algorithm, it's better to disable Nagle's when you are doing the write-write-read operation.

Where a read after two successive writes on the socket may get delayed up to 500 milliseconds until the second write has reached the destination. 

If latency is more concerned over bandwidth usage like in a network-based multi-player game, the user wants to see action from other players immediately, it's better to bypass Nagle's delay by using the TCP_NODELAY flag.


7. What is multicasting or multicast transmission? Which Protocol is generally used for multicast? TCP or UDP? 
Multi-casting or multicast transmission is one too many distributions, where the message is delivered to a group of subscribers simultaneously in a single transmission from the publisher. Copies of messages are automatically created in other network elements e.g. Routers, but only when the topology of a network requires it.

Tibco Rendezvous supports multicast transmission. Multi-casting can only be implemented using UDP because it sends full data as a datagram package, which can be replicated and delivered to other subscribers. Since TCP is a point-to-point protocol, it can not deliver messages to multiple subscribers, until it has the link between each of them.

Though UDP is not reliable, and messages may be lost or delivered out of order. Reliable multicast protocols such as Pragmatic General Multicast (PGM) have been developed to add loss detection and retransmission on top of IP multicast. 

IP multicast is widely deployed in enterprises, commercial stock exchanges, and multimedia content delivery networks. Common enterprise use of IP multicast is for IPTV applications 

Here is a nice diagram which explains how multicasting works:

What is multicasting or multicast transmission?




8. What is the difference between Topic and Queue in JMS? 
The main difference between Topic and Queue in Java Messaging Service is that Queue is used for point to point communication  which is generally one to one, while publisher is used for publish and subscribe communication which is one to many. 

You should use Topic to send messages when we have multiple consumers to consumer messages. If we set up multiple listener threads to consume messages from Queue, each message will be dispatched to only one thread and not all threads. On the other hand in the case of Topic, each subscriber gets its own copy of the message.

What is the difference between Topic and Queue in JMS?





9. What is the difference between IO and NIO in Java?
The main difference between NIO and IO is that NIO provides asynchronous, non-blocking IO, which is critical to write faster and scalable networking systems. While most of the utility from IO classes are blocking and slow. 

NIO takes advantage of asynchronous system calls in UNIX systems such as select() system call for network sockets. Using select(), an application can monitor several resources at the same time and can also poll for network activity without blocking. 

The select() system call identifies if data is pending or not, then read() or write() may be used knowing that they will complete immediately.

What is the difference between IO and NIO in Java?




10. How do you write a multi-threaded server in Java?
A multi-threaded server is one that can serve multiple clients without blocking. Java provides excellent support to developers such as servers. Prior to Java 1.4,  you can write a multi-threaded server using traditional socket IO and threads. 

This had a severe limitation on scalability because it creates a new thread for each connection and you can only create a fixed number of threads, depending upon the machine's and platform's capability.

Though this design can be improved by using thread pools and worker threads, it is still a resource-intensive design. After JDK 1.4 and NIO's introduction, writing scalable and multi-threaded servers become a bit easier. You can easily create it in a single thread by using Selector, which takes advantage of the asynchronous and non-blocking IO model of Java NIO.

How do you write a multi-threaded server in Java?




11. What is the ephemeral port?
In TCP/IP connection usually contains four things, Server IP, Server port, Client IP, and Client Port. Out of these four, 3 are well known most of the time, what is not known is client port, this is where ephemeral ports come into the picture.

Ephemeral ports are dynamic ports assigned by your machine's IP stack, from a specified range, known as the ephemeral port range, when a client connection explicitly doesn't specify a port number.

These are short-lived, temporary ports, which can be reused once the connection is closed, but most of IP software doesn't reuse ephemeral port until the whole range is exhausted. Similar to TCP, UDP protocol also uses an ephemeral port, while sending datagram. 

In Linux ephemeral port range is from 32768 to 61000, while in windows default ephemeral port range is 1025 to 5000. The similarly different operating system has different ephemeral port ranges



12. What is the sliding window protocol? 
Sliding window protocol is a technique for controlling transmitted data packets between two network computers where reliable and sequential delivery of data packets is required, such as provided by the Transmission Control Protocol (TCP). 

In the sliding window technique, each packet includes a unique consecutive sequence number, which is used by the receiving computer to place data in the correct order. The objective of the sliding window technique is to use the sequence numbers to avoid duplicate data and to request missing data

What is the sliding window protocol?




13. When do you get the "too many files open" error? 
Just like File connection, Socket Connection also needs file descriptors, Since every machine has a limited number of file descriptors, it's possible that they may run out of file descriptors. When it happens, you will see a "too many files open" error. You can check how many file descriptor per process is allowed on UNIX based system by executing ulimit -n command or simply count entries on /proc//fd/


14. What is TIME_WAIT state in TCP protocol? When does a socket connection go to TIME_WAIT state? 
When one end of TCP Connection closes it by making a system call, it goes into TIME_WAIT state. Since TCP packets can arrive in the wrong order, the port must not be closed immediately to allow late packets to arrive. That's why that end of TCP connection goes into TIME_WAIT state. 

For example, if a client closes a socket connection then it will go to TIME_WAIT state, similarly, if the server closes the connection then you will see TIME_WAIT there. You can check the status of your TCP and UDP sockets by using these networking commands in UNIX.


15. What will happen if you have too many socket connections in the TIME_WAIT state on the Server? 
When a socket connection or port goes into the TIME_WAIT state, it doesn't release the file descriptor associated with it. The file descriptor is only released when the TIME_WAIT state is gone i.e. after some specified configured time. If too many connections are in the TIME_WAIT state then your Server may ran out of file descriptors and start throwing "too many files open" error, and stop accepting new connections.


That's all about in this list of networking and socket programming interview questions and answers. Though I have originally intended this list for Java programmers it is equally useful for any programmer.

In fact, this is the bare minimum knowledge of sockets and protocols every programmer should have. I have found that C and C++ programmers are better at answering these questions than the average Java programmers.

One reason for this may be because Java programmers have got so many useful libraries like Apache MINA, which does all the low-level work for them. Anyway, knowledge of fundamentals is very important and everything else is just an excuse, but at some point, I also recommend using tried and tested libraries like Apache MINA for production code.


Read more: https://javarevisited.blogspot.com/2014/08/socket-programming-networking-interview-questions-answers-Java.html#ixzz8hid0eVOe



20 Kubernetes Interview Questions with Answers
For easy access, I have divided this article into three sections. The first section consists of basic Kubernetes interview questions. In this section, you will learn about topics like Autoscaling, Load Balancing, and Data Volumes. 

The second section consists of  interview questions related to the architecture of Kubernetes. This section covers topics like Kube-proxy and master node.


The third section deals with some multiple-choice questions. Here, you will get some practical exposure as well as enhance your quick thinking.  I have also tried to cover to basic kubectl command you can use to interact with pods and services

I have no doubt that the interview questions in this article will help you to land your dream job. 


1. Basic Kubernetes Interview Questions
This section focus on essential Kubernetes concepts and interview questions based upon that. 

1. What is Kubernetes?
Kubernetes is basically a container-management tool that is open-source and can scale, descale, and deploy containers. It is similar to Docker and was introduced by Google. This means that it has an interactive community and works well with all the cloud providers. We can say that Kubernetes is not just a containerization platform, but a platform that provides multi-container management solutions.




2. How is Kubernetes similar to Docker?
A Docker image can be used to build runtime containers and it also provides lifecycle management of containers. Kubernetes come in when these individual containers need to communicate with each other. What this essentially means is that Docker can be used to build individual containers and Kubernetes can be used to allow these individual containers to communicate with each other. Another important thing to note here is that containers running on multiple hosts can be connected to each other and linked using Kubernetes. 

3. What is Container Orchestration?
Container Orchestration effectively means that all the services inside the individual containers are working together seamlessly to meet the needs of the server. There are many microservices inside each container, and it is impossible for these microservices to communicate with each other without Container Orchestration. Container Orchestration creates harmony among containers by seamlessly allowing individual containers to work together and met the goal of a single server. 




4. Why do you need Container Orchestration?
When you have 4 or 5 microservices that perform various tasks for a single application, you can put these microservices inside separate containers. But you need to make sure that these containers interact with each other. So Container Orchestration becomes useful in such cases.

Basically, Container Orchestration is essential for making sure that containers communicate effortlessly with each other. There are also many challenges that can crop up if you do not use Container Orchestration. So Container Orchestration can be used to overcome these challenges.

5. What are some features of Kubernetes?
Kubernetes offer some amazing features like Automated Scheduling, Self-Healing Capabilities, Automated Rollouts and Rollbacks, Horizontal Scaling, and Load Balancing.
The automated scheduler can be used for launching containers on cluster nodes.
Self-Healing Capabilities allow rescheduling, restarting, and replacing of dead containers.
Kubernetes also supports automated rollouts and rollbacks for containers.
Kubernetes can also scale up and scale down applications according to your requirements. 

6. What is the Containerized Deployment process in Kubernetes?
Kubernetes is basically cloud-agnostic. What this means is that it can run on basically any cloud provider. This effectively simplifies the process of Containerized Deployment since the is no need for anything big like multiple hosts for load balancing.
 
Kubernetes can also run on any cloud platform since it is cloud-agnostic. For example, if you have a number of containers running on multiple hosts, all of these containers may have to communicate with each other. For this, you need something big that can be used for load balancing, scaling, and monitoring the containers.
7. What is Google Container Engine?
Google Container Engine is a managing platform for Docker Containers and clusters. It is open-source and supports only those containers that run inside Google's own cloud services. 
Google Container Engine is also known as GKE. One important thing to note here is that the Google Container Engine supports only those containers that run on its own public cloud platforms. 
Kubernetes questions for DevOps Engineers and DEvelopers

Bonus Questions
1. What is Heapster?
Heapster is basically a data aggregator that is present cluster-wide. It is provided by Kubelet running on each node. It can also be seen as a container management tool that Kubernetes supports natively. It runs just like any other pod on the cluster. What this means is that it discovers all the nodes in a cluster and queries usage information from the Kubernetes cluster present on every node. 

2. What is Kubectl?
Kubectl can be seen as a platform that can be used for passing commands to the cluster. It also provides the CLI command for running Kubernetes commands against the Kubernetes cluster. It also has various ways and means for creating and managing the Kubernetes component.   

3. What is Minikube?
Minikube can be seen as a tool that makes it easier to run Kubernetes locally. It runs a single-node Kubernetes cluster inside a virtual machine.

4. What is Kubelet?
Kubelet is basically an agent service that runs on each and every node and also allows communication between the slave and the master. It essentially works on the description of containers that are provided to it in the PodSpec. It also makes sure that the containers that are described in the PodSpec are healthy and running.  

5. What can you tell us about a node in Kubernetes?
A node in the Kubernetes cluster can be seen as the main worker machine. Nodes are also known as minions. Nodes can run on physical machines or virtual machines. It provides all the necessary services for running pods. Nodes in the Kubernetes system are managed by masters. 


2. Kubernetes Architecture Interview Questions
8. What can you tell us about Kube-proxy?
Kube-proxy is basically a network proxy that is made up of configured services in Kubernetes API. It runs on each and every node and can do packet forwarding across multiple services. 
Kube-proxy can also run on each and every node. It can do simple TCP/UDP packet forwarding all across the backend network service. A Docker-linkable compatible environment can also provide the various IPs and ports that can be opened using a proxy.
9. What can you tell us about the different components of Kubernetes Architecture?
Kubernetes architecture is made up of 2 main components - the master node and the worker node. The master node is made up of the Kube-controller-manager, Kube-apiserver, and the Kube-scheduler. The worker node has kubelet and Kube proxy.

10. How does the master node work in Kubernetes?
The nodes are made up of containers and the Kubernetes master controls these nodes. The individual containers are housed inside pods and each pod can have a number of these containers. The Kube-apiserver makes sure that there is communication between the pods and the master node.
The Kubernetes master controls all the nodes and the containers that are present inside the nodes. The individual containers are housed inside pods. Inside each pod, you can have a large number of containers depending on your requirements. These pods can be deployed using the user interface or the command-line interface. 
The pods are allocated to different nodes based on the resource requirements. The Kube-apiserver can be used for making sure that there is always communication between the Kubernetes node and the master component. 


11. What do you know about the Kubernetes controller manager?
The controller manager is basically a daemon that embeds controllers and works in namespace creation and garbage collection. It is also responsible for communicating with the API server and managing the end-points. 
The master node runs multiple control processes. But all these processes are compiled together to run as a single process. This process is known as the Kubernetes controller manager. The Kubernetes controller manager is responsible for communicating with the API server and making sure that the end-points are managed. 
There are different types of controller managers running on the master node.
The node controller manages the status of a node like creation, updating, or deletion. 
The replication controller maintains the number of pods for each and every replication object. 
The service account and token controller can be used for creating default accounts as well as API access tokens for creating new namespaces. 
The endpoints controller takes care of all the endpoint objects like services and pods.  
12. What is ETCD?
ETCD is a distributed key-value store that coordinates distributed work. It is written in the Go programming language. It stores the configuration data of the Kubernetes cluster. ETCD can also be used for storing the configuration data of the Kubernetes cluster that represents the state of a cluster at any point in time. 

13. How does the Load Balancer work in Kubernetes?
A load balancer is a common and standard way of exposing service. Kubernetes offer customers two types of load balancer - the internal load balancer and the external load balancer. The internal load balancer allocates pods with the necessary configuration while the external load balancer directs the traffic from the external load. 

14. What is Ingress Network?
Ingress Network is basically a collection of rules that is an entry point to any Kubernetes cluster. It is an API object that manages access to the services inside a cluster. It is the most powerful way of exposing service. 

Bonus Questions
1. What are the different types of services Kubernetes offer?
The Cluster IP can be used for exposing the service on a cluster-internal IP. It means that the service will only be reachable from within the cluster. This is the default service type. 
The Node Port can be used for exposing the service on each node's IP at a static port. A Cluster IP service to which a Node Port service will route is automatically created.
The Load Balancer exposes the service externally by making use of a cloud provider's load balancer. Services to which the external load balancer will route are automatically created. 
The External Name maps the service to all the contents of the external name. There is no proxying of any kind during this setup. 

3. Multiple-Choice Questions
15. Where is the Kubernetes Cluster data stored?
A. Kube-apiserver
B. Kubelet
C. ETCD (Correct)
D. None of the above

16. Which of the following is a Kubernetes Controller?
A. Replicaset
B. Deployment
C. Rolling Updates
D. Both A and B (Correct)

Top 20 Kubernetes Interview Questions with Answers


17. Which of the following are core Kubernetes objects?
A. Pods
B. Services
C. Volumes
D. All of the above (Correct)

18. On which node does the Kube-proxy run?
A. Master Node
B. Worker Node
C. Both A and B (Correct)
D. None of the above

19. Which of the following was introduced in Kubernetes version 1.8?
A. Taints and Tolerations (Correct)
B. Cluster Level Logging
C. Secrets
D. Federated Clusters
20. Which handler is invoked by Kubelet to check if a container's IP address is open or not?
A. HTTPGetAction
B. ExecAction
C. TCPSocketAction (Correct)
D. None of the ABove


Read more: https://javarevisited.blogspot.com/2022/05/kubernetes-interview-questions-answers.html#ixzz8hidMukt0

30 OOPS Interview Questions in Java with Answers
In this article, I am going to share with you some OOPS concept-based Java interview questions that I have collected from friends and colleagues and they have seen in various Java interviews on different companies. They are mostly asked at first a few rounds like on screening round or on the telephonic round.



If you are a senior Java developer then you already know the answers to this question and I suggest you practice more on object-oriented analysis and design skills i.e. how to do code against a specification. If you are a fresher and junior Java developer with 2 to 3 years of experience then you must revise these questions, learn if you don't know to do well on your Java Job interviews.



1. What is method overloading in OOP or Java? (answer)
It's one of the oldest OOPS concept questions, I have seen it 10 years ago and still see it now. When we have multiple methods with the same name but different functionality then it's called method overloading. For example. System.out.println() is overloaded as we have a 6 or 7 println() method each accepting a different type of parameter.


2. What is the method overriding in OOP or Java? (answer)
It's one of the magic of object-oriented programming where the method is chosen based upon an object at runtime. In order for method overriding, we need Inheritance and Polymorphism, as we need a method with the same signature in both superclass and subclass. A call to such a method is resolved at runtime depending upon the actual object and not the type o variable. See the answer for a more detailed discussion.


3. What is the method of hiding in Java? (answer)
When you declare two static methods with the same name and signature in both superclass and subclass then they hide each other i.e. a call to the method in the subclass will call the static method declared in that class and a call to the same method is superclass is resolved to the static method declared in the super-class.


4. Is Java a pure object-oriented language? if not why? (answer)
Java is not a pure object-oriented programming language e.g. there are many things you can do without objects e.g. static methods. Also, primitive variables are not objects in Java. See the answer for a more detailed explanation.




5. What are the rules of method overloading and overriding in Java? (answer)
One of the most important rules of method overloading in Java is that the method signature should be different i.e. either the number of arguments or the type of arguments. Simply changing the return type of two methods will not result in overloading, instead, the compiler will throw an error. 

On the other hand, method overriding has more rules e.g. name and return type must be the same, method signature should also be the same, the overloaded method cannot throw a higher exception, etc. See the answer for a full list of rules related to method overloading and overriding in Java.


6. The difference between method overloading and overriding? (answer)
Several differences but the most important one is that method overloading is resolved at compile-time and method overriding is resolved at runtime. The compiler only used the class information for method overloading, but it needs to know the object to resolved overridden method calls. This diagram explains the difference quite well, though:

Object Oriented Programming Interview Questions and Answers


7. Can we overload a static method in Java? (answer)
Yes, you can overload a static method in Java. You can declare as many static methods of the same name as you wish provided all of them have different method signatures. See the answer for a more detailed explanation and code example.



8. Can we override the static method in Java? (answer)
No, you cannot override a static method because it's not bounded to an object. Instead, static methods belong to a class and are resolved at compile time using the type of reference variable. But, Yes, you can declare the same static method in a subclass, which will result in method hiding i.e. if you use the reference variable of type subclass then the new method will be called, but if you use the reference variable of superclass then the old method will be called.


9. Can we prevent overriding a method without using the final modifier? (answer)
Yes, you can prevent the method overriding in Java without using the final modifier. In fact, there are several ways to accomplish it e.g. you can mark the method as private or static, those cannot be overridden.


10. Can we override a private method in Java? (answer)
No, you cannot. Since the private method is only accessible and visible inside the class they are declared, it's not possible to override them in subclasses. Though, you can override them inside the inner class as they are accessible there.


11. What is the covariant method overriding in Java? (answer)
In the covariant method overriding, the overriding method can return the subclass of the object returned by the original or overridden method. This concept was introduced in Java 1.5 (Tiger) version and it's very helpful in case the original method is returning a general type like Object class, because, then by using the covariant method overriding you can return a more suitable object and prevent client-side typecasting. One of the practical use of this concept is when you override the clone() method in Java.




12. Can we change the return type of method to subclass while overriding? (answer)
Yes, you can, but only from Java 5 onward. This feature is known as covariant method overriding and it was introduced in JDK 5 release. This is immensely helpful if the original method return super-class like the clone() method returns a java.lang.Object. By using this, you can directly return the actual type, preventing client-side type-casting of the result.


13. Can we change the argument list of an overriding method? (answer)
No, you cannot. The argument list is part of the method signature and both overriding and overridden methods must have the same signature.


14. Can we override a method that throws runtime exception without throws clause? (answer)
Yes, there is no restriction on unchecked exceptions while overriding. On the other hand, in the case of a checked exception, an overriding exception cannot throw a checked exception which comes higher in type hierarchy e.g. if the original method is throwing IOException then the overriding method cannot throw java.lang.Exception or java. lang.Throwable.


15. How do you call a superclass version of an overriding method in a subclass? (answer)
You can call a superclass version of an overriding method in the subclass by using the super keyword. For example to call the toString() method from java.lang.Object class, you can call super.toString().


16. Can we override a non-static method as static in Java? (answer)
Yes, you can override the non-static method in Java, no problem on them but it should not be private or final :)


17. Can we override the final method in Java? (answer)
No, you cannot override a final method in Java, the final keyword with the method is to prevent method overriding. You use the final when you don't want subclass changing the logic of your method by overriding it due to security reasons. This is why the String class is final in Java. This concept is also used in the template design patterns where the template method is made final to prevent overriding.




18. Can we have a non-abstract method inside an interface? (answer)
From Java 8 onward you can have a non-abstract method inside the interface, prior to that it was not allowed as all method was implicitly public abstract. From JDK 8, you can add static and default methods inside an interface.


19. What is the default method of Java 8? (answer)
The default method, also known as the extension method is a new type of method which you can add to the interface now. These methods have implementation and are intended to be used by default. By using this method, JDK 8 managed to provide common functionality related to lambda expression and stream API without breaking all the clients who implement their interfaces. If you look at Java 8 API documentation you will find several useful default methods on key Java interfaces like Iterator, Map, etc.


20. What is an abstract class in Java? (answer)
An abstract class is a class that is incomplete. You cannot create an instance of an abstract class in Java. They are provided to define default behavior and ensured that client of that class should adore to those contract which is defined inside the abstract class. In order to use it, you must extend and implement their abstract methods. BTW, in Java, a class can be abstract without specifying any abstract method.


21. What is an interface in Java? What is the real use of an interface? (answer)
As an abstract class, the interface is also there to specify the contract of an API. It supports the OOP abstraction concept as it defines only abstract behavior. It will tell that your program will give output but how is left to implementers. The real use of the interface to define types to leverage Polymorphism. See the answer for a more detailed explanation and discussion.


22. The difference between Abstract class and interface? (answer)
In Java, the key difference is that the abstract class can contain a non-abstract method but the interface cannot, but from Java 8 onward interface can also contain static and default methods that are non-abstract. See the answer for a more detailed discussion as I have described a lot of points there.

Java Object Oriented Programming questions for experienced


23. Can we make a class abstract without an abstract method? (answer)
Yes, just add abstract keyword on the class definition and your class will become abstract.


24. Can we make a class both final and abstract at the same time? (answer)
No, you cannot apply both final and abstract keywords to the class at the same time because they are exactly the opposite of each other. A final class in Java cannot be extended and you cannot use an abstract class without extending and making it a concrete class. As per Java specification, the compiler will throw an error if you try to make a class abstract and final at the same time.


25. Can we overload or override the main method in Java? (answer)
No, since main() is a static method, you can only overload it, you cannot override it because the static method is resolved at compile time without needing object information hence we cannot override the main method in Java.




26. What is the difference between Polymorphism, Overloading, and Overriding? (answer)
This is a slightly tricky OOP concept question because Polymorphism is the real concept behind both Overloading and Overriding. Overloading is compiled time Polymorphism and Overriding is Runtime Polymorphism.


27. Can an interface extend more than one interface in Java?
Yes, an interface can extend more than one interface in Java, it's perfectly valid.


28. Can a class extend more than one class in Java?
No, a class can only extend another class because Java doesn't support multiple inheritances but yes, it can implement multiple interfaces.


29. What is the difference between abstraction and polymorphism in Java? (answer)
Abstraction generalizes the concept and Polymorphism allows you to use different implementations without changing your code. This diagram explains the abstraction quite well, though:

Java OOP Concepts Interview Questions and Answers



8 Object-Oriented Design Principle and pattern Interview Questions
Now let's see some OOPS concept questions based on the SOLID design principles and GOF design patterns that take advantage of the OOPS concept discussed here.

1. What problem is solved by the Strategy pattern in Java? (answer)
Strategy pattern allows you to introduce a new algorithm or new strategy without changing the code which uses that algorithm. For example, the Collections.sort() method which sorts the list of the object uses the Strategy pattern to compare objects. Since every object uses a different comparison strategy you can compare various objects differently without changing the sort method.


2. Which OOP concept Decorator design Pattern is based upon? (answer)
The decorator pattern takes advantage of Composition to provide new features without modifying the original class. A very good to-the-point question for the telephonic round. This is quite clear from the UML diagram of the Decorator pattern, as you can see the Component is associated with a Decorator.

OOP design pattern interview questions answers


3. When to use the Singleton design pattern in Java? (answer)
When you need just one instance of a class and want that to be globally available then you can use the Singleton pattern. It's not free of cost though because it increases the coupling between classes and makes them hard to test. This is one of the oldest design pattern questions from Java interviews. Please see the answer for a more detailed discussion.


4. What is the difference between State and Strategy Patterns? (answer)
Though the structure or class diagram of the State and Strategy pattern is the same, their intent is completely different. The state pattern is used to do something specific depending upon the state while Strategy allows you to switch between algorithms without changing the code which uses it.


5. What is the difference between Association, Aggregation, and Composition in OOP? (answer)
When an object is related to another object is called association. It has two forms, aggregation, and composition. the former is the loose form of association where the related object can survive individually while later is a stronger form of association where a related object cannot survive individually. For example, the city is an aggregation of people but is the composition of body parts.





6. What is the difference between Decorator, Proxy, and Adapter patterns in Java? (answer)
Again they look similar because their structure or class diagram is very similar but their intent is quite different. The Decorator adds additional functionality without touching the class, Proxy provides access control, and an Adapter is used to make two incompatible interfaces work together. 


7. What is the 5 objects oriented design principle from SOLID? (answer)
SOLID is the term given by Uncle Bob in his classic book, the Clean Code, one of the must-read books for programmers. In SOLID each character stands for one design principle:
S for Single Responsibility Principle
O for Open closed design principle
L for Liskov substitution principle
I for Interface segregation principle
D for Dependency inversion principle

OOP Java Interview Questions for 2 years experienced


8. What is the difference between Composition and Inheritance in OOP? (answer)
This is another great OOPS concept question because it tests what matters, both of them are very important from a class design perspective. Though both Composition and Inheritance allow you to reuse code, formerly is more flexible than later.

Composition allows the class to get an additional feature at runtime, but Inheritance is static. You can not change the feature at runtime by substitution of a new implementation. See the answer for a more detailed discussion.


Read more: https://www.java67.com/2015/12/top-30-oops-concept-interview-questions-answers-java.html#ixzz8hidtifSz

10 Object-Oriented and SOLID Desing Principles for Programmers
Though the best way of learning any design principle or pattern is a real-world example and understanding the consequences of violating that design principle, the subject of this article is Introducing Object-oriented design principles for Java Programmers, who are either not exposed to it or in the learning phase. 

Object Oriented Design Principles in Java Programming


I personally think each of these OOP and SOLID design principle needs an article to explain them clearly, and I will definitely try to do that here, but for now, just get yourself ready for a quick bike ride on design principle town :)


1. DRY (Don't repeat yourself)
Our first object-oriented design principle is DRY, as the name suggests DRY (don't repeat yourself) means don't write duplicate code, instead use Abstraction to abstract common things in one place. If you have a block of code in more than two places, consider making it a separate method, or if you use a hard-coded value more than one time, make them public final constant.

The benefit of this Object-oriented design principle is in maintenance. It's important not to abuse it, duplication is not for code, but for functionality. It means if you used standard code to validate OrderID and SSN, it doesn’t mean they are the same, or they will remain the same in the future.

By using standard code for two different functionality or thing, you tightly couple them forever, and when your OrderId changes its format, your SSN validation code will break.

So beware of such coupling and just don’t combine anything which uses similar code but is not related. You can further check out the Basics of Software Architecture & Design Patterns in Java course on Udemy to learn more about writing the right code and best practices to follow while designing a system. 

Object Oriented Design Principles Java Programmer should know





2. Encapsulate What Changes
Only one thing is constant in the software field, and that is "Change," So encapsulate the code you expect or suspect to be changed in the future. The benefit of this OOP Design principle is that It's easy to test and maintain proper encapsulated code.

If you are coding in Java, then follow the principle of making variables and methods private by default and increasing access step by step, like from private to protected and not public.

Several of the design patterns in Java uses Encapsulation, the Factory design pattern is one example of Encapsulation that encapsulates object creation code and provides flexibility to introduce a new product later with no impact on existing code.

Btw, if you are interested in learning more about design patterns in Java and Object-Oriented Programming, then you must check this Design Pattern Library course Pluralsight. It's one of the best collections of design patterns and advice on how to use them in the real world.

SOLID design principles for programmers





3. Open Closed Design Principle
Classes, methods, or functions should be Open for extension (new functionality) and Closed for modification. This is another beautiful SOLID design principle, which prevents someone from changing already tried and tested code.


Ideally, if you are adding new functionality only, then your code should be tested, and that's the goal of the Open Closed Design principle. By the way, the Open-Closed principle is "O" from the SOLID acronym.

Open Closed Design Principle



4. Single Responsibility Principle (SRP)
Single Responsibility Principle is another SOLID design principle, and represent  "S" on the SOLID acronym. As per SRP, there should not be more than one reason for a class to change, or a class should always handle single functionality.

If you put more than one functionality in one Class in Java, it introduces coupling between two functionality, and even if you change one feature, there is a chance you broke coupled functionality,  which requires another round of testing to avoid any surprise on the production environment.

You can further see the SOLID Principles of Object-Oriented Design and Architecture course on Udemy for more real-world examples and to learn about patterns that are based on this principle.

Single Responsibility Principle (SRP)




5. Dependency Injection or Inversion principle
Don't ask for dependency; it will be provided to you by the framework. This has been very well implemented in the Spring framework, the beauty of this design principle is that any class which is injected by the DI framework is easy to test with the mock object and more comfortable to maintain because object creation code is centralized in the framework and the client code is not littered with that.

Dependency Injection or Inversion principle


There are multiple ways to implemented Dependency injection like using bytecode instrumentation, which some AOP (Aspect Oriented Programming) framework like AspectJ does, or by using proxies just like used in Spring. See this example of the IOC and DI design pattern to learn more about this SOLID design principle. It represents "D" on the SOLID acronym.



6. Favor Composition over Inheritance
Always favor composition over inheritance, if possible. Some of you may argue this, but I found that Composition is a lot more flexible than Inheritance.

Composition allows changing the behavior of a class at run-time by setting property during run-time, and by using Interfaces to compose a class, we use polymorphism, which provides flexibility to replace with better implementation at any time.

Favor Composition over Inheritance



Even the classic book Effective Java advises favoring composition over inheritance. See here to learn more about why your Composition is better than Inheritance for reusing code and functionality. 


7. Liskov Substitution Principle (LSP)
According to the Liskov Substitution Principle, Subtypes must be substitutable for supertype, i.e. methods or functions which use superclass type must be able to work with the object of subclass without any issue".

 LSP is closely related to the Single responsibility principle and Interface Segregation Principle. If a class has more functionality, then the subclass might not support some of the functionality and does violate LSP.

Liskov Substitution Principle (LSP)


In order to follow LSP SOLID design principle, derived class or subclass must enhance functionality, but not reduce them. LSP represents "L" on the SOLID acronym.  If you are interested in a more real-world example, then the SOLID Principles of Object-Oriented Design course on Pluralsight is an excellent course to start with. 

Btw, you would need a Pluralsight membership to get access to this course, which costs around $29 per month or $299 annually (14% discount).

If you don't have Pluralsight membership, I encourage you to get one because it allows you to access their 5000+ online courses on all the latest topics like front-end and back-end development, machine learning, etc. It also includes interactive quizzes, exercises, and the most recent certification material.

It's more like Netflix for Software Developers, and Since learning is an integral part of our job, Pluralsight membership is a great way to stay ahead of your competition.

They also provide a 10-day free trial without any commitment, which is a great way to not just access this course for free but also to check the quality of courses before joining Pluralsight.


8. Interface Segregation Principle (ISP)
The Interface Segregation Principle states that a client should not implement an interface if it doesn't use that. This happens mostly when one interface contains more than one functionality, and the client only needs one functionality and no other.

Interface design is a tricky job because once you release your interface, you can not change it without breaking all implementation.

Interface Segregation Principle (ISP)


Another benefit of this design principle in Java is, the interface has the disadvantage of implementing all methods before any class can use it, so having single functionality means less method to implement. If you don't get the benefit of the interface in coding, then I suggest you read my blog post, the real usage of an interface in Java to learn more. 


9. Programming for Interface not implementation
Always program for the interface and not for application; this will lead to flexible code that can work with any new implementation of the interface.

So use interface type on variables, return types of method, or argument type of methods in Java.


This has been advised in many Java books, including in Effective Java and Head First design pattern book.

Programming for Interface not implementation code example




10. Delegation principles
Don't do all stuff by yourself,  delegate it to the respective class. Classical example of delegation design principle is equals() and hashCode() method in Java. In order to compare two objects for equality, we ask the class itself to make a comparison instead of the Client class doing that check.

The key benefit of this design principle is no duplication of code and pretty easy to modify behavior. Event delegation is another example of this principle, where an event is delegated to handlers for handling. 

Delegation principle in Java example


Summary
All these object-oriented design principles help you write flexible and better code by striving for high cohesion and low coupling. The theory is the first step, but what is most important is to develop the ability to find out when to apply these design principles.


Read more: https://javarevisited.blogspot.com/2018/07/10-object-oriented-design-principles.html#ixzz8hiePSPN7


50 Essential Topics for SQL and Database Interview Questions
Here is a list of essential topics programmers should prepare for SQL and Database interview questions. The list includes most essential SQL and database concepts like normalization, index, aggregation, joins stored procedure, and constraints. 

Interviewer normally asks 20 to 25 questions to get a feel of overall skill of candidate, sometimes they purposefully include a tough question, couple of tricky one but mostly questions based upon fundamentals. You will usually see questions from the following topics in any SQL phone interview:
Database fundamental like Normalization, Referential Integrity
Database Relationship like one to one, one to many, and many to many
Different types of keys like Primary key, Unique key, Candidate key, etc
Database indexes like how they work, benefits, disadvantages, etc
The SQL query to extract records from tables
SQL Join
Database indexes
Question about a particular database like Oracle, SQL Server, MySQL, or PostgreSQL
Triggers
Temporary table
Stored procedures
Views
Query Optimization
Group By clause and aggregate function
CRUD operation like INSERT, UPDATE, DELETE
SQL clause based questions like TRUNCATE, DROP, etc
CONSTRAINTS like CHECK constraint, PRIMARY key constraints
I have tried to include as many good questions as possible from the above topics, to make them useful resources for all levels of SQL developers and DBA like beginners to experienced programmers having 2 to 5 years of experience.

Top 50 SQL and Database Phone Interview Questions Answers

As I mentioned, on phone interviews, Interviewers are usually in hurry, they want to hear the correct and concise answer, and not blah blah blah answers, because of that I have kept answers short and sweet. One more reason for keeping your answer short and specific is to avoid getting shot by providing additional information which is not accurate.

At the same time, It's also hard for any SQL developer to go through five-page articles to revise some 30 most frequently asked SQL questions, keep answers to the point helps them a lot.

So, let's start our journey with these beautiful databases and SQL interview questions, I am sure you will also learn new things as well. 

1. Difference between UNION and UNION ALL in SQL?  (answer)
hint  - UNION doesn't include duplicate records, UNION ALL does. Both can be used to combine results from multiple queries. 

2. Difference between WHERE and HAVING clause in SQL?  (answer)
hint - in case of WHERE filtering applies before aggregation while in case of HAVING, filtering applies after aggregation

3. Describe the difference between clustered and non-clustered indexes in a database?  (answer)
hint - clustered index defined the order in which data is physically stored in the table. Since data can be sorted in only one way physically, there is only one clustered index per table and that's usually the primary key. You can have multiple non-clustered indexes to speed up your queries. 

4. Write an SQL query to find the second highest salary of an employee without using TOP or LIMIT?  (answer)
You can use correlated queries to solve this problem.

5. How to find duplicate rows in the database?  (answer)

6. Difference between correlated and non-correlated subquery in SQL?  (answer)

7. How many clustered indexes you can have in a table?  (answer)
This is a tricky question, you can only have one clustered index per table. 

8. Difference between the PRIMARY key and the UNIQUE key constraint in SQL?  (answer)

9. Difference between view and materialized view in SQL?  (answer)

10. Difference between TRUNCATE, DELETE and DROP in SQL?  (answer)
delete removes record but also put an entry into log segment so you can roll back, truncate removes all rows of a table without logging each record on log segment, DROP removes table itself. 

11. What is Referential Integrity in a relational database?  (answer)
It's a rule which ensures that when a record is deleted from the primary table, all associated records are deleted from the related table. It ensures data integrity.

12. What is Normalization?  (answer)
A way to avoid duplication of data in tables. 

13. When a table is said to be in 1NF, 2nd NF, and 3rd NF?  (answer)

14. Describe the difference between ISNULL() and COALESCE() in SQL Server?  (answer)

15. How do you ensure that only values between 1 to 5 are allowed in an integer column?  (answer)

16. Difference between CHAR and VARCHAR data types in SQL?  (answer)
CHAR is fixed length, VARCHAR is variable length

17. Difference between VARCHAR and NVARCHAR in SQL Server?  (answer)
NVARCHAR supports Unicode 

18. How do you get Day, Month, and Year from a date in SQL Server?  (answer)
By using the DATEPART() function

19. How to check if a date is valid in SQL?  (answer)

20. Difference between LEFT OUTER JOIN and INNER JOIN in SQL?  (answer)

21. What is SELF JOIN in SQL?  (answer)
When we join two instances of tables it's called self-join. For example, if the table contains employee name and role then you can use self join to find all employees who are managers.

22. In a classical Employee and Department relationship, write SQL query to print all departments and number of employees on each department.   (answer)

23. Difference between COUNT(*), COUNT(1), and COUNT(column_name) in SQL? 
COUNT(*) includes null values while counting but  COUNT(1), and COUNT(column_name) doesn't take null values into consideration during counting. 

24. What is Database statistics? How it affects the performance of your Query?

25. Suppose you have to create a compound index in a table, involving two columns like book_id and active. Now you can create them as either (book_id, active) or (active, book_id), do you think the order of columns in an index matter? How it will affect your SQL queries?  


26. What do _ and  % are used in the SQL query?
They are used in the LIKE operators while writing SQL queries. The underscore is used to match one character, while % is used for any number of characters. 

27. How do you ensure that a particular SQL query will use a particular Index?  (answer)
You can use SQL hints for that purpose. 


28. In SQL Server, which one is fastest and slowest between an index seek, an index scan, and table scan?  (answer)
In a general, the table scan is slower than the index scan and index seek. Your goal should be to write queries that can take advantage of the index by using index scan and index seek for faster retrieval. You can use the SQL EXPLAIN command to retrieve the query plans and find out whether indexes are used for your query or not. 


29. What does NULL = NULL will return in SQL?  (answer)
This is another tricky question to check your knowledge about NULLs in SQL. I think it will return unknown in SQL Server. But different Databases may return different values, it will not be true though. You can try running this query on SQL Server, MySQL, PostgreSQL, and Oracle to see if you get the same response or different response. 


30. Write SQL query to find all rows where EMP_NAME, a VARCHAR column is NULL?  
This is a simple question often asked beginners to check whether they know how to check for NULL in SQL or not. The trick here is to use "IS NULL" instead of the "=" operator to find all rows where EMP_NAME is NULL.

Here is the SQL query for this question:

$ SELECT EMP_NAME FROM Employee where EMP_NAME IS NULL


31. What is the temp table?  (answer)
A temp table or a temporary table is a base table that is not stored in the database and only exists while the current database session is active. Once the database connection is closed, all temp tables are lost. They may look similar to view but they are not. A view exists only for a single query but you can use a temporary table as a regular table until your session is active. 


32. What is the fastest way to empty or clear a table?  (answer)
You can use the truncate command to empty or clear the table. It's faster than delete because it doesn't log each deleted entry on a log, that's why you cannot roll back it. So be careful while using truncate to clear or empty a table. 

33. What is an identity column in SQL Server? How do you return an identity value from a table?  (answer)

34. How do you return an identity value from a table with a trigger? 
In SQL Server, you can use a function like @@IDENTITY  to generate identity values. 

Example - SELECT @@IDENTITY AS 'Identity';  

35. How do you return a value from a stored procedure? 
In SQL Server, you can either use the OUTPUT parameter or use the return statement to return a value from a stored procedure. 

36. How do you return a VARCHAR value from a stored procedure?  
hint - using OUTPUT parameter return clause 

37. If you have a column that will only have values between 1 and 250 what data type will you use? 
If you are using SQL Server database then you can use the TINYINT datatype which can accommodate numbers between 0 and 255 and it needs 1 byte for storage. 

This question is asked to test your knowledge of SQL data type and whether you can choose the right data type for a given requirement or not. Your goal should be to use a data type that can accommodate a given range. You can also ask questions that whether it's fixed or it can change in the future. 


38. Difference between LEFT and RIGHT OUTER JOIN in SQL?  (answer)
Both are outer joins, in LEFT outer join, all rows from the left side table will be included, and only matching rows from the other side of the table are included. In case of  RIGHT outer join, all rows of the right side of the table on join condition are included. 

39. Can you write an SQL query to select all last names that start with 'T'?  (answer)

40. How would you select all rows where the date is 20211002?  (answer)

41. What is the difference between a local and global temporary table in SQL Server?  (answer)

42. How do you create a copy of a table in SQL Server?  (answer)

43. How do you change the data type of a column in a table in SQL?  (answer)

44. What data type should you use to store monetary values in a table?  (answer)

45. What does SELECT 3/2 will return? 1 or 1.5?  (answer)

46. What is the maximum value that Decimal(6, 5) can hold in SQL Server?  (answer)

47. If you have a table with one integer column ID, and it has three values 101, 201, and NULL? What will the following SQL query SELECT * FROM TestTable where ID !=101 will return?  (answer)

48. What is your favorite SQL book?  (answer)
This one is an easy question and the interviewer just wants to know whether you have read any book or not. You can name the SQL book you have read, if you haven't read any SQL book so far then I highly recommend you to read Head First SQL if you are learning SQL from scratch and Joe Celko's SQL Puzzles if you already know SQL and looking for some SQL puzzles to test your SQL query skills. 

best book to improve SQL query skills



49. Tell me two SQL best practices you follow?  (answer)
hint - creating indexes and using them on SQL queries, normalization, and updating statistics regularly. 

50. What is the different ISOLATION level in the Microsoft SQL Server database?  (answer)

51. If you create a local temp table and then call a proc is the temp table available inside the proc?  (answer)

52. Which date format is the only safe one to use when passing dates as strings?  (answer)

53. How do you suppress rows affected messages when executing an insert statement in SQL Server?  (answer)

54. Difference between ANSI-89 and ANSI-92 syntax of writing SQL Join?  (answer)

55.  Differences between IN and EXISTS (and NOT IN, and NOT EXISTS) in SQL? (answer)


Read more: https://javarevisited.blogspot.com/2021/05/sql-and-database-phone-interview-questions.html#ixzz8hig3CRWH

12 SQL Query Problems with Solutions for Technical Interview 
It's time to write SQL queries now. This section contains 6 SQL query Interview questions that will test many of your SQL skills like joins, grouping, and aggregating data, how you handle nulls in SQL etc. It doesn't test all skills e.g. correlated subqueries, but you can take a look at questions like how to find Nth highest salary of employees to learn that.

This section contains 12 data problems for which you need to write SQL queries, the solution is provided in the next section but I suggest you try to solve these problems first before looking at the solution. 

Also we will use classic Employee and Department data model as shown in following ERD Diagram

Employee department table ERD diagram SQL


And, here are the SQL query problems which you need to solve based upon above schema:

1. Can you write an SQL query to show Employee (names) who have a bigger salary than their manager?

2. Write an SQL query to find Employees who have the biggest salary in their Department?

3. Write an SQL query to list Departments that have less than 3 people in it?

4. Write an SQL query to show all Departments along with the number of people there?

5. Can you write an SQL query to show all Employees that don't have a manager in the same department?

6. Can you write SQL query to list all Departments along with the total salary there?

7. Can you write an SQL query to find the second highest salary of Employee? (solution)

8. How to find all duplicate records from a table? (solution)

9. How do you copy all rows of a table using SQL query? (solution)

10. How do you join more than two tables in SQL query? (solution)

11. How to find 2nd highest salary without using a co-related subquery? (solution)

12. There exists an Order table and a Customer table, find all Customers who have never ordered (solution)

Don't scroll down to look at the solution until you try solving all the problems by yourself. Some of the questions are tricky, so please pay special attention to them. 

It's not a real interview you can take your time because all the hard work your mind will put now to find answers by its own will always remain there and that's the real learning you will get by doing this exercise.


Top 12 SQL Query Questions from Interviews for Practice with Solutions





SQL Script to create a table and Populate data
In this section, we'll see our SQL script for creating and populating the sample table required for running SQL queries. 

I have chosen Employee and Department tables to teach you how to write SQL queries because it is one of the most popular SQL query examples and most of the developers, data scientists, students, and technical guys are familiar with Employee and Department data model.

This is also the example many of you have used in your academics so it's quite easy to understand and correlate. 

Remember, understanding schema and data is very important not only to write correct SQL queries but also to verify that your SQL query is correct by looking at the output.

The SQL queries are written for Microsoft SQL Server database and tested on the same, but you can easily run on Oracle, MySQL, or any other database of your choice by removing T-SQL code e.g. the one which checks if a table already exists, and then drop and re-create it.

Most of the code is standard ANSI SQL, hence it will run as it is on any other database. If you still face any problems then you can also check this guide to migrate SQL Server queries to Oracle.




SQL scripts to create tables 
USE Test
GO

-- drop Employee table if already exists
IF OBJECT_ID('dbo.Employee', 'U') IS NOT NULL
BEGIN
  PRINT 'Employee Table Exists, dropping it now'
 DROP TABLE Employee;
END

-- drop Department table if already exists
IF OBJECT_ID('dbo.Department', 'U') IS NOT NULL
BEGIN
  PRINT 'Department Table Exists, dropping it now'
  DROP TABLE Department;
END

-- create table ddl statments
CREATE TABLE Employee(emp_id INTEGER PRIMARY KEY, dept_id INTEGER,
 mngr_id INTEGER, emp_name VARCHAR(20), salary INTEGER);
CREATE TABLE Department(dept_id INTEGER PRIMARY KEY, dept_name VARCHAR(20));

-- alter table to add foreign keys
ALTER TABLE Employee ADD FOREIGN KEY (mngr_id)
 REFERENCES Employee(emp_id);
ALTER TABLE Employee ADD FOREIGN KEY (dept_id) 
REFERENCES Department(dept_id);

-- populating department table with sample data
INSERT INTO Department (dept_id, dept_name) 
VALUES
(1, 'Finance'),
(2, 'Legal'),
(3, 'IT'),
(4, 'Admin'),
(5, 'Empty Department');

-- populating employee table with sample data
INSERT INTO Employee(emp_id, dept_id, mngr_id, emp_name, salary)
VALUES( 1, 1, 1, 'CEO', 100),
( 2, 3, 1, 'CTO', 95),
( 3, 2, 1, 'CFO', 100),
( 4, 3, 2, 'Java Developer', 90),
( 5, 3, 2, 'DBA', 90),
( 6, 4, 1, 'Adm 1', 20),
( 7, 4, 1, 'Adm 2', 110),
( 8, 3, 2, 'Web Developer', 50),
( 9, 3, 1, 'Middleware', 60),
( 10, 2, 3, 'Legal 1', 110),
( 11, 3, 3, 'Network', 80),
( 12, 3, 1, 'UNIX', 200);

This query runs on the Test database, if you don't have the Test database in your SQL Server instance then either create it or remove the "USE Test" to run on any database of your choice, you can also change the name of the database and keep the "USE".

When you run this script, it will create and populate the data the first time. When you run it again, it will drop and recreate the tables again, as shown in the following output:

Employee Table Exists, dropping it now
Department Table Exists, dropping it now

(5 row(s) affected)

(12 row(s) affected)
And, here is how our data looks like after setting up:


SQL query Practice Questions online


And, here is how our Department data will look like:

SQL query examples online



In this script, I have followed the naming convention and tricks which I discussed earlier in my article, a better way to write SQL queries.  All the keyword is on the capital case while table names and column names are in small and camel case. 

This improves the readability of SQL queries by clearing highlight which ones are keywords and which ones are object names even if syntax highlight is not available.

This example shows that just following some simple SQL best practices can seriously improve the queries you write. 




Solution of SQL Query Practice Interview Questions
Here is the solution of all SQL query problems discussed in the last section

1. SQL query to show Employee (names) who have a bigger salary than their manager?
In this problem, you need to compare employees' salaries to their manager's salary. To achieve this, you need two instances of the same table. Also in order to find a Manager you need to compare employee id with manager id, this is achieved by using the self-join in SQL, where two instances of the same table are compared.

-- Employees (names) who have a bigger salary than their manager
SELECT a.emp_name FROM Employee a JOIN Employee b
ON a.mngr_id = b.emp_id
WHERE a.salary > b.salary;
You can see that Admin 2, and UNIX has higher salary than their boss, CEO who just earn $100. They key here is use of self join, if you have to compare data from the same table then you can create two instance of same table and join them together using self join. An interesting technique to solve this kind of SQL query problem.

SQL Query questions for Tech Interviews




2. SQL query to find Employees who have the biggest salary in their Department?
This is a little bit complex problem to solve, you first need to find the maximum salary of each department, but the department doesn't have the salary, it is the employee who has the salary. 

So we need to create a virtual or temp table where we should have both department and salary. 

This can be achieved by joining both Employee and Department table on dept_id and then using GROUP by clause to group salary on dept_id.  Now, someone can question why we didn't use the self join?

Since we need to print the name of the employee who has the highest salary, we need to compare each employee's salary with the department's highest salary which we have just calculated. 

This can be done by keeping the result of the previous query in a temp table and then joining it again with the Employee table. 

-- Employees who have the biggest salary in their Department
SELECT a.emp_name, a.dept_id
FROM Employee a JOIN
(SELECT a.dept_id, MAX(salary) as max_salary
FROM Employee a JOIN Department b ON a.dept_id = b.dept_id
GROUP BY a.dept_id) b
ON a.salary = b.max_salary AND a.dept_id = b.dept_id;


SQL Query Problems for Tech Interviews


You can see that CEO, Adm 2, Legal 1, and UNIX has highest salary in their 
respective department. You can also print department name as an additional 
exercise. 


3.SQL query to list Departments that have less than 3 people in it?
This is a rather simple SQL query interview question to solve.
You just need to know how to use the COUNT() function and GROUP BY clause.
-- Departments that have less than 3 people in it
SELECT dept_id, COUNT(emp_name) as 'Number of Employee'
FROM Employee
GROUP BY dept_id
HAVING COUNT(emp_name) < 3;

Output:

SQL query GROUP BY and COUNT Example


4. SQL query to show all Departments along with the number of people there?
This is a tricky problem, candidates often use inner join to solve the problem, leaving out empty departments.
-- All Department along with the number of people there
SELECT b.dept_name, COUNT(a.dept_id) as 'Number of Employee'
FROM Employee a FULL OUTER JOIN Department b ON a.dept_id=b.dept_id
GROUP BY b.dept_name;

Output
SQL JOIN Query Examples


5.SQL query to show all Employees that don't have a manager
in the same department?
This is similar to the first SQL query interview question, where we have used self-join to solve the problem. There we compared the salary of employee and here we have compared their department.
-- Employees that don't have a manager in the same department
SELECT a.emp_name FROM Employee a JOIN Employee b
ON a.mngr_id = b.emp_id
WHERE a.dept_id != b.dept_id;

Output
SQL query for Practice



6.Can you write SQL query to list all Departments along with
the total salary of that department?
This problem is similar to the 4th question in this list. Here also you need to use OUTER JOIN instead of INNER join to include empty departments which should have no salaries.
-- All Department along with the total salary there
SELECT b.dept_name, SUM(a.salary) as 'Total Salary'
FROM Employee a FULL OUTER JOIN Department b ON a.dept_id = b.dept_id
GROUP BY b.dept_name;

Output:

SQL query examples for beginners



And, Here is the output of all these SQL queries when running from SQL Server Management Studio:

SQL Query  Interview Questions and Answers


Read more: https://javarevisited.blogspot.com/2017/02/top-6-sql-query-interview-questions-and-answers.html#ixzz8hih5ctlR

I'll show you 4 ways to solve this problem e.g. by using the correlated subquery, using ROW_NUMBER(), using TOP in SQL SERVER, and using LIMIT keyword in MySQL.

By the way, if you are new to Microsoft SQL Server and T-SQL then I also suggest you join a comprehensive course to learn SQL Server fundamentals and how to work with T-SQL. If you need a recommendation then I suggest you go through the Microsoft SQL for Beginners online course by Brewster Knowlton on Udemy. It's a great course to start with T-SQL and SQL queries in SQL Server.









Sample table and data for Nth Highest Salary Problem
Before solving this problem we need some sample data to visualize the problem better, let's create an employee table with some data.



Use below query to create a table and build schema:

-- creating Employee table in Oracle
CREATE TABLE Employee (name varchar(10), salary int);

-- inserting sample data into Employee table
INSERT INTO Employee VALUES ('Rick', 3000);
INSERT INTO Employee VALUES ('John', 4000);
INSERT INTO Employee VALUES ('Shane', 3000);
INSERT INTO Employee VALUES ('Peter', 5000);
INSERT INTO Employee VALUES ('Jackob', 7000);



Nth highest salary using a correlated subquery
How to find Nth Highest Salary in SQL
One of the most common ways to solve this problem of finding the Nth maximum salary from the Employee table is by using the correlated subquery. 

This is a special type of subquery where the subquery depends upon the main query and execute for every row returned by the main query.  It's slow but it can solve problems which are difficult to solve otherwise. Let's see the SQL query to find the Nth highest salary using the Correlated subquery.

SQL Query:
Here is the SQL query you can use to calculate the Nth salary :
SELECT name, salary 
FROM #Employee e1
WHERE N-1 = (SELECT COUNT(DISTINCT salary) FROM #Employee e2
WHERE e2.salary > e1.salary)

for the 2nd maximum you can replace N with 2, and for 3rd maximum replace N with 3, here is the output:

2nd highest salary:
And, here is an example to print second highest salary:
SELECT name, salary 
FROM #Employee e1
WHERE N-1 = (SELECT COUNT(DISTINCT salary) FROM #Employee e2
WHERE e2.salary > e1.salary)SELECT name, salary 
FROM #Employee e1
WHERE 2-1 = (SELECT COUNT(DISTINCT salary) FROM #Employee e2
WHERE e2.salary > e1.salary)

Result:
name salary
Peter 5000


3rd highest salary:
Here is an example to retrieve third highest salary: 
SELECT name, salary 
FROM #Employee e1
WHERE 3-1 = (SELECT COUNT(DISTINCT salary) FROM #Employee e2
WHERE e2.salary > e1.salary)

Result:
name salary
John 4000

Explanation :
The distinct keyword is there to deal with duplicate salaries in the table. In order to find the Nth highest salary, we are only considering unique salaries. The highest salary means no salary is higher than it, the Second highest means only one salary is higher than it, 3rd highest means two salaries are higher than it, similarly Nth highest salary means N-1 salaries are higher than it.

Pros :
1) The generic solution works in all databases including Oracle, MySQL, SQL SERVER, and PostgreSQL.

Cons :
1) Slow, because the inner query will run for every row processed by the outer query.

See SQL Puzzles and Answers book for more of such SQL queries for practicing and improving your SQL query skill.





The nth highest salary in SQL SERVER using TOP keyword
You can use the TOP keyword to find the Nth highest salary in SQL SERVER. This is also faster than the previous solution because here we are calculating Nth maximum salary without a subquery.

SELECT TOP 1 salary
FROM (
SELECT DISTINCT TOP N salary
FROM #Employee
ORDER BY salary DESC
) AS temp
ORDER BY salary

Explanation: 
By default ORDER BY clause print rows in ascending order, since we need the highest salary at the top, we have used ORDER BY DESC, which will display salaries in descending order. 

Again DISTINCT is used to remove duplicates. The outer query will then pick the topmost salary, which would be your Nth highest salary.

And, if you like books and just learning these queries from the interview's sake then I suggest you first read a good book on SQL like Head First SQL. It will help you to build your fundamentals.

3rd highest salary in SQL SERVER

SELECT TOP 1 salary
FROM (
SELECT DISTINCT TOP 3 salary
FROM #Employee
ORDER BY salary DESC
) AS temp
ORDER BY salary

Result:
salary
4000


Here is another example where we have used the TOP keyword to find the second highest salary in Microsoft SQL SERVER 2008.


Nth maximum salary in MySQL using LIMIT keyword
Similar to TOP, MySQL also supports a LIMIT keyword, which provides pagination capability. You can find the nth highest salary in MySQL without using subquery as shown below:

SELECT salary FROM Employee ORDER BY salary DESC LIMIT N-1, 1


2nd highest salary in MySQL without subquery:

SELECT salary FROM Employee ORDER BY salary DESC LIMIT 1,1
salary
5000

3rd highest salary in MySQL using LIMIT clause:

SELECT salary FROM Employee ORDER BY salary DESC LIMIT 2,1
salary
4000

Nth highest salary in MySQL using LIMIT clause:

SELECT salary FROM Employee  ORDER BY Salary DESC LIMIT n-1,1

Explanation :
The benefit of this approach is that it's faster than a correlated query approach but its vendor dependent. This solution will only work in a MySQL database.



Nth highest salary in Oracle using ROW_NUMBER() function

SELECT * FROM (
SELECT e.*, 
ROW_NUMBER() OVER (ORDER BY salary DESC) rn 
FROM Employee e
)
WHERE rn = N; /*N is the nth highest salary*/


Here is the 2nd highest salary in Oracle using ROW_NUMBER() window function:

SELECT * FROM (
SELECT e.*, 
ROW_NUMBER() OVER (ORDER BY salary DESC) rn 
FROM Employee e
)
WHERE rn = 2; 

Output
NAME   SALARY  RN
Peter   5000   2

and here is 3rd highest salary in Oracle:

SELECT * FROM (
SELECT e.*, 
ROW_NUMBER() OVER (ORDER BY salary DESC) rn 
FROM Employee e
)
WHERE rn = 3; 


By the above code has a problem. It is not handling duplicate salaries properly. For example, in our table we have two employees with salary 3000, that's our 4th highest salary, but above code will print the same salary, albeit different employee for both 4th and 5th maximum as shown below:

SELECT * FROM (
SELECT e.*, 
ROW_NUMBER() OVER (ORDER BY salary DESC) rn 
FROM Employee e
)
WHERE rn = 5;

Result: 
NAME    SALARY  RN
Shane   3000    5

In oracle, you can also use SQL statements to build schema and run sample SQL.

You can also do the same thing by using the RANK() window function in Oracle, but that's for another day. This is more than enough to answer the SQL interview question, the print nth highest salary of an employee in the Oracle.


That's all about how to find the nth highest salary in SQL. The easiest way to find nth maximum/minimum salary is by using the correlated subquery, but it's not the fastest way. Better ways are database dependent e.g. you cause TOP keyword in SQL SERVER, LIMIT keyword in MySQL, and ROW_NUMBER() window function in Oracle to calculate the nth highest salary. The normal subquery way is good for the second maximum but after that, it becomes really nested and cluttered.


Read more: https://javarevisited.blogspot.com/2016/01/4-ways-to-find-nth-highest-salary-in.html#ixzz8hiiJFWyl

Difference between row_number(), rank() and dense_rank() window functions in SQL

Though all three are ranking functions in SQL, also known as a window function in Microsoft SQL Server, the difference between rank(), dense_rank(), and row_number() comes when you have ties on ranking i.e. duplicate records. For example, if you are ranking employees by their salaries then what would be the rank of two employees of the same salaries? It depends on which ranking function you are using like row_number, rank, or dense_rank.
PauseUnmute
Fullscreen


The row_number() function always generates a unique ranking even with duplicate records i.e. if the ORDER BY clause cannot distinguish between two rows, it will still give them different rankings, though which record will come earlier or later is decided randomly like in our example two employees Shane and Rick have the same salary and has row number 4 and 5, this is random, if you run again, Shane might come 5th.



The rank() and dense_rank() will give the same ranking to rows that cannot be distinguished by the order by clause, but dense_rank will always generate a contiguous sequence of ranks like (1,2,3,...), whereas rank() will leave gaps after two or more rows with the same rank (think "Olympic Games": if two athletes win the gold medal, there is no second place, only third).  You can also see the  Querying Microsoft SQL Server course on Udemy to learn more about how to rank and dense_rank break ties.

Surprisingly all these functions behave similarly in Microsoft SQL Server and Oracle, at least at the high level, so if you have used them in MSSQL, you can also use it on Oracle 11g or other versions.



By the way, if you are new to Microsoft SQL Server and T-SQL then I also suggest you join a comprehensive course to learn SQL Server fundamentals and how to work with T-SQL. If you need a recommendation then I suggest you go through the Microsoft SQL for Beginners online course by Brewster Knowlton on Udemy. It's a great course to start with T-SQL and SQL queries in SQL Server.





SQL to build schema
Here is the SQL to create a table and insert some data into it for demonstration purpose:

IF OBJECT_ID( 'tempdb..#Employee' ) IS NOT NULL
DROP TABLE #Employee;

CREATE TABLE #Employee (name varchar(10), salary int);

INSERT INTO #Employee VALUES ('Rick', 3000);
INSERT INTO #Employee VALUES ('John', 4000);
INSERT INTO #Employee VALUES ('Shane', 3000);
INSERT INTO #Employee VALUES ('Peter', 5000);
INSERT INTO #Employee VALUES ('Jackob', 7000);
INSERT INTO #Employee VALUES ('Sid', 1000);

You can see that we have included two employees with the same salaries i.e. Shane and Rick, just to demonstrate the difference between row_number, rank, and dense_rank window function in the SQL server, which is obvious when there are ties in the ranking.

If you want to learn more about ranking function in SQL Server, I highly recommend this 70-461, 761: Querying Microsoft SQL Server with Transact-SQL course on Udemy. It's a great course to learn SQL Server in-depth and also become a certified SQL Server DBA.

Difference between row_number(), rank() and dense_rank() in SQL Server, Oracle.



ROW_NUMBER() Example
It always generates a unique value for each row, even if they are the same and the ORDER BY clause cannot distinguish between them. That's why it is used to solve problems like the second-highest salary or nth highest salary, we have seen earlier.

In the following example, we have two employees with the same salary and even though we have generated row numbers over the salary column it produces different row numbers for those two employees with the same salary.

select e.*, row_number() over (order by salary desc) row_number from #Employee e
result:
name    salary  row_number
Jackob  7000    1
Peter   5000    2
John    4000    3
Shane   3000    4
Rick    3000    5
Sid     1000    6

You can see in this example that we have ranked employees based upon their salaries and each of them has a unique rank even if their salaries are the same e.g. Shane and Rick have the same salary of 3000 but they got the unique rank 4th and 5th. It's worth knowing that in the case of a tie, ranks are assigned on a random basis, see Oracle Analytic Functions In-Depth & Advanced Oracle SQL course on Udemy to learn more about when to use the row_number() function in Oracle database.

Difference between row_number(), rank() and dense_rank() in SQL Server



RANK() Example
The rank() function will assign the same rank to the same values i.e. which are not distinguishable by ORDER BY. Also, the next different rank will not start from immediately next number but there will be a gap i.e. if 4th and 5th employees have the same salary then they will have the same rank 4, and 6th employee which has a different salary will have a new rank 6.

Here is the example to clarify the point:

select e.*, rank() over (order by salary desc) rank from #Employee e
result:
name    salary  rank
Jackob  7000    1
Peter   5000    2
John    4000    3
Shane   3000    4
Rick    3000    4
Sid     1000    6

You can see that both Shane and Rick have got the same rank 4th, but the Sid got the rank 6th, instead of 5 because it keeps the original ordering. If you want to learn more about Window Functions you can also check out The Complete SQL + Databases Bootcamp: Zero to Mastery [2020] course by ZTM Academy and Andrei, one of my favorite instructor. This is a comprehensive course to cover everything in SQL you need to know.

best SQL Courses for Beginners

Btw, you would need a ZTM membership to watch this course which costs around $29 per month but also provides access to many super engaging and useful courses like his Python course and JavaScript interview course.  

If you are a constant learner like me then I suggest you go for membership than buying a single course, you will not only save money but also it makes learning easy, as you don't need to buy courses every time you want to learn something new.


DENSE_RANK() Example
The dense_rank function is similar to the rank() window function i.e. same values will be assigned the same rank, but the next different value will have a rank which is just one more than the previous rank, i.e. if 4th and 5th employee has the same salary then they will have the same rank but 6th employee, which has different salary will have rank 5, unlike rank 6 as is the case with rank() function. 

There will be no gap in ranking in the case of dense_rank() as shown in the following example:

select e.*, dense_rank() over (order by salary desc) dense_rank from #Employee e
name    salary  dense_rank
Jackob  7000    1
Peter   5000    2
John    4000    3
Shane   3000    4
Rick    3000    4
Sid     1000    5

You can see that both Shane and Rick have the same ranking 4th, but Sid now has 5th rank which is different than 6th in the earlier example when we used the rank() function. Btw, if you are serious about master SQL, I strongly suggest reading Joe Celko's SQL for Smarties, one of the more advanced books in SQL.

rank vs dense_rank vs row_number in SQL Server and Oracle



Difference between row_number vs rank vs dense_rank
As I told, the difference between rank, row_number, and dense_rank is visible when there are duplicate records. Since in all our example we are ranking records on salary, if two records will have the same salary then you will notice the difference between these three ranking functions.

The row_number gives continuous numbers, while rank and dense_rank give the same rank for duplicates, but the next number in rank is as per continuous order so you will see a jump but in dense_rank doesn't have any gap in rankings.

-- difference between row_number(), rank(), and dense_rank()
-- will only visible when there were duplicates.
-- row_number gives consecutive ranking even with duplicate
-- rank and dense_rank give the same ranking but rank has a jump
-- while dense_rank doesn't have jump

select e.*,
row_number() over (order by salary desc) row_number, 
rank() over (order by salary desc) rank,
dense_rank() over (order by salary desc) as dense_rank 
from #Employee e

and here is the output which clearly shows the difference in the ranking generated by rank() and dense_rank() function. This will clear your doubt about rank, desnse_rank, and row_nubmer function, but if you want to learn more check out 70-461, 761: Querying Microsoft SQL Server with Transact-SQL course on Udemy.

Difference between rank and dense_rank and row_number in Java

You can see the employees Shane and Rick have the same salary 3000 hence their ranking is the same when you use the rank() and dense_rank() but the next ranking is 6 which is as per continuous ranking using rank() and 5 when you use dense_rank(). 

The row_number() doesn't break ties and always gives a unique number to each record.

Btw, I ran all three SQL queries on Oracle 11g R2 and, Oracle 12c and it gave me the same result. So, it seems both Oracle and SQL Server support these functions and they behave identically.


That's all about the difference between ROW_NUMBER(), RANK(), and DENSE_RANK() function in SQL SERVER. As I told, the difference boils down to the fact when ties happen. In the case of the tie, ROW_NUMBER() will give unique row numbers, the rank will give the same rank, but the next different rank will not be in sequence, there will be a gap.

In the case of dense_rank, both rows in the tie will have the same rank and there will be no gap. The next different rank will be in sequence.


Read more: https://javarevisited.blogspot.com/2016/07/difference-between-rownumber-rank-and-denserank-sql-server.html#ixzz8hiiVrVXa

Difference between Truncate and Delete in SQL? Example

Truncate and delete in SQL are two commands which are used to remove or delete data from a table. Though quite basic in nature both SQL commands can create a lot of trouble until you are familiar with details before using it. The difference between Truncate and delete are not just important to understand perspective but also a very popular SQL interview topic which in my opinion a definite worthy topic. What makes them tricky is the amount of data. Since most Electronic trading system stores, large amounts of transactional data, and some even maintain historical data, a good understanding of delete and the truncate command is required to effectively work in that environment.
PlayUnmute
Fullscreen



I have still seen people firing delete commands just to empty a table with millions of records which eventually lock the whole table for doing anything and take ages to complete or Simply blew log segment or hang the machine.

Most of the enterprise stock trading system maintains two kinds of database one transactional and other static. Transactional data is a day by day records that need to be purged at the end of data or moved to historical data so that the application can make a fresh start another day. 

If you need to work on such a large set of data, my advice is to get clear and complete knowledge of delete and truncate command, along with their differences and when to use which command to remove data or purge tables.

In this article, we will see where to use truncate in SQL and where to use delete in SQL, How to use truncate or delete and what danger or harm they can create if not used carefully along with the difference between truncate and delete in SQL.



What is the Truncate command in SQL?
Use the truncate table if you need to delete all rows since truncate doesn't allow you to specify the WHERE clause. truncate removes data by deallocating space used by a table which removes a lot of overhead in terms of logging and locking and that's why to truncate is faster than delete.

What you need to take care is a rollback, data deleted by truncate can not be rolled back until data server specifically supports it e.g. MSSQL Server which allows to commit or rollback truncate table statement transactionally. 

Another caveat with truncate table statement is that it doesn't fire a trigger and you can not truncate a table when a foreign key references any column to the table to be truncated. 

The only situation I see which is perfect for using truncate is purging tables with huge data, though there is another solution exists to drop table and recreated it if that makes sense.

And, if you like to understand difference in tabular format, here is a nice table which highlights difference not just truncate and delete but also drop command in SQL. 
Difference between truncate, drop, and delete in SQL



Example of truncate command in SQL
truncate table Orders;  //Order table shouldn't have a column which is foreign key on another table

Difference between truncate and delete command in sql


What is Delete command in SQL?
Delete is another SQL command available for removing records from the table. Delete is even more flexible than truncate like it provides support to WHERE Clause which can be used to remove selective data. 

It logs each row which allows an operation to be rolled back and it also fires triggers. One disadvantage of using delete is speed and locking. Delete acquires a lock on the table and its also very slow operation because of logging, which makes it unsuitable for removing records from large tables. 

One workaround for this is batch-delete in which you remove a batch of records instead on one record at a time. 

Delete is most suitable for removing selective data and use it where you want to roll back the transaction in the database. It’s not useful to purge a large amount of data from tables and should not be used, otherwise, it could lock the table for a very long time, blew log segment, and can take ages to complete.

Example of delete commands in SQL

delete  * from Orders; //delete all row from Orders, should not be used if Orders is large
delete  * from Orders where Symbol="MSFT.NQ" //delete all orders where symbol is MSFT.NQ


Difference between truncate and delete command in SQL
This is an important point to understand before using truncate or delete on the production environment, or writing any script which purges data from tables.

1. truncate is fast delete is slow.
2. truncate doesn't do logging delete logs on per row basis.
3. rollback is possible with delete not with truncate until specifically supported by the vendor.
4. truncate doesn't fire trigger, delete does.
5. Don't delete, truncate it when it comes to purge tables.
6. truncate reset identity column in table if any, delete doesn't.

7. truncate is DDL while delete is DML (use this when you are writing exam)
8. truncate doesn't support where clause, delete does.

So finally if you have table with huge data and want to empty it don’t Delete, truncate it


Interview questions on truncate and delete in SQL
Truncate and delete both are popular interview topics and there is always some question on these commands in SQL interview. Here I am listing some of SQL interview questions based on delete and truncate command in SQL, you can find the answer in this article itself or by google.

1) If you have a table which contains a large amount of data which command will you use for removing data, truncate or delete?

2) What are differences between truncate and delete?

3) Which one is fast truncate or delete?

4) What is the disadvantage of using truncate in SQL?

5) How will you delete data if truncate is not supported and log segment is also not big enough to support complete delete?

6) Is there any way to remove data other than truncate and delete in SQL?


Read more: https://javarevisited.blogspot.com/2011/10/how-to-use-truncate-and-delete-command.html#ixzz8hiipktYE

These queries test your SQL skill on Joins, both INNER and OUTER join, filtering records by using WHERE and HAVING clause, grouping records using GROUP BY clause, calculating the sum, average, and counting records using an aggregate function like AVG(), SUM(), and COUNT(), searching records using wildcards in LIKE operator, searching records in a bound using BETWEEN and IN clause, DATE and TIME queries, etc. 

If you have faced any interesting SQL query or you have any problem and searching for a solution, you can post it here for everyone's benefit.





20 Most Popular SQL Query Interview Questions and Answers
Without any further ado, here is a list of the most common SQL query Interview questions and answers from Programming Job interviews:


Question 1: SQL Query to find the second highest salary of Employee
Answer: There are many ways to find the second highest salary of an Employee in SQL, you can either use SQL Join or Subquery to solve this problem. Here is an SQL query using Subquery:

SELECT MAX(Salary) 
FROM Employee 
WHERE Salary NOT IN (select MAX(Salary) from Employee ); 

See How to find the second highest salary in SQL for more ways to solve this problem.


Question 2: SQL Query to find Max Salary from each department.
Answer: You can find the maximum salary for each department by grouping all records by DeptId and then using MAX() function to calculate the maximum salary in each group or each department.

SELECT DeptID, MAX(Salary) 
FROM Employee 
GROUP BY DeptID. 

These questions become more interesting if the Interviewer will ask you to print the department name instead of the department id, in that case, you need to join the Employee table with Department using the foreign key DeptID, make sure you do LEFT or RIGHT OUTER JOIN to include departments without any employee as well.  

Here is the query
SELECT DeptName, MAX(Salary) 
FROM Employee e RIGHT JOIN Department d 
ON e.DeptId = d.DeptID 
GROUP BY DeptName;

In this query, we have used RIGHT OUTER JOIN because we need the name of the department from the Department table which is on the right side of the JOIN clause, even if there is no reference of dept_id on the Employee table. 


10 Frequently asked SQL Query Interview Questions




Question 3: Write SQL Query to display the current date?
Answer: SQL has built-in function called GetDate() which returns the current timestamp. This will work in Microsoft SQL Server, other vendors like Oracle and MySQL also have equivalent functions.
SELECT GetDate(); 


Question 4: Write an SQL Query to check whether the date passed to Query is the date of the given format or not?
Answer: SQL has IsDate() function which is used to check passed value is a date or not of specified format, it returns 1(true) or 0(false) accordingly. Remember the ISDATE() is an MSSQL function and it may not work on Oracle, MySQL, or any other database but there would be something similar.

SELECT  ISDATE('1/08/13') AS "MM/DD/YY"; 

It will return 0 because the passed date is not in the correct format.


Question 5: Write an SQL Query to print the name of the distinct employee whose DOB is between 01/01/1960 to 31/12/1975.
Answer: This SQL query is tricky, but you can use BETWEEN clause to get all records whose dates fall between two dates.
SELECT DISTINCT EmpName 
FROM Employees 
WHERE DOB BETWEEN ‘01/01/1960’ AND ‘31/12/1975’;




Question 6: Write an SQL Query to find the number of employees according to gender whose DOB is between 01/01/1960 to 31/12/1975.
Answer : Here is teh sql query to find the number of employees according to gender and whose date of birth is between two given dates
SELECT COUNT(*), sex 
FROM Employees  
WHERE DOB BETWEEN '01/01/1960' AND '31/12/1975' 
GROUP BY sex;

Question 7: Write an SQL Query to find an employee whose salary is equal to or greater than 10000.
Answer : You can use WHERE clause with less than and equal to operator to solve this problem. Here is the sql query to find employees whose salary is equal to or greater than a given number
SELECT EmpName FROM  Employees WHERE  Salary>=10000;


Question 8: Write an SQL Query to find the name of an employee whose name Start with ‘M’
Answer :  You can use the Llike operator to find the name of all employees whose name start with letter "M", here is an exmaple:
SELECT * FROM Employees WHERE EmpName like 'M%';


Question 9: find all Employee records containing the word "Joe", regardless of whether it was stored as JOE, Joe, or joe.

Answer :You can use SQL function like UPPER()  and like operator to find all employees whose name contains a given word like "Joe" as shown in following example:
SELECT * from Employees  WHERE  UPPER(EmpName) like '%JOE%';


Question 10: Write an SQL Query to find the year from date.
Answer:  You can use the GETDATE() function to get the current date and then you can use the YEAR() function to extract the year from the date in SQL server. 

Here is how you can find Year from a Date in Microsoft SQL Server database 
SELECT YEAR(GETDATE()) as "Year";




Question 11: Write SQL Query to find duplicate rows in a database? and then write SQL query to delete them?
Answer: You can use the following query to select distinct records:
SELECT * FROM emp a 
WHERE rowid = (SELECT MAX(rowid) 
FROM EMP b 
WHERE a.empno=b.empno)

to Delete:
DELETE FROM emp a 
WHERE rowid != (SELECT MAX(rowid) FROM emp b WHERE a.empno=b.empno);


Question 12: There is a table which contains two columns Student and Marks, you need to find all the students, whose marks are greater than average marks i.e. list of above-average students.

Answer: This query can be written using subquery as shown below:
SELECT student, marks 
FROM table 
WHERE marks > SELECT AVG(marks) from table)

SQL Query Interview Questions and Answers



Question 13: How do you find all employees who are also managers?
You have given a standard employee table with an additional column mgr_id, which contains the employee id of the manager.

Employee department SQL Query question

Answer: You need to know about self-join to solve this problem. In Self Join, you can join two instances of the same table to find out additional details as shown below

SELECT e.name, m.name 
FROM Employee e, Employee m 
WHERE e.mgr_id = m.emp_id;

this will show employee name and manager name in two columns like

name  manager_name
John   David

One follow-up is to modify this query to include employees which don't have a manager. To solve that, instead of using the inner join, just use the left outer join, this will also include employees without managers. 

Another interesting problem which is based upon Self join is to find all employees who earn more than their managers, which is also asked as follow up question after this one. 



Question 14: You have a composite index of three columns, and you only provide the value of two columns in the WHERE clause of a select query? Will Index be used for this operation? 

For example, if Index is on EmpId, EmpFirstName, and EmpSecondName and you write a query like

SELECT * FROM Employee WHERE EmpId=2 and EmpFirstName='Radhe'

If the given two columns are secondary index columns then the index will not invoke, but if the given 2 columns contain the primary index(first column while creating index) then the index will invoke. In this case, the Index will be used because EmpId and EmpFirstName are primary columns.


Read more: https://www.java67.com/2013/04/10-frequently-asked-sql-query-interview-questions-answers-database.html#ixzz8hijJILmt

**How to use EXISTS and NOT Exists in SQL? Example Query and Tutorial

Hello Guys, you might have heard about how useful the EXISTS clause is helpful in writing sophisticated queries. Still, at the same time, I have also seen that many programmers struggle to understand and use EXISTS and NOT EXISTS clauses while writing SQL queries.  If you are one of them, then you have come to the right place. Today you will learn how to use the EXISTS clause in SQL by picking up a real-world example and an excellent SQL exercise from the LeetCode. Suppose that a website contains two tables, the Customers table, and the Orders table. Can you write an SQL query to find all customers who have never ordered anything?
PauseUnmute
Fullscreen


To solve this problem, you need to first think about data. For example, if a customer has never ordered anything means there won't be any record for him on the Orders table. Good job, half of the task is done.

Now the second half is how do you check if there is a record or not for a particular customer?  That's where EXISTS and NOT EXISTS clause will help you, and that's what you will learn in this article.

This is actually also a popular SQL Interview question, and you might have seen it already, but if you are not, that's fine. This question is not as popular as the second-largest salary query, but it is also one of the frequently asked SQL queries from a programming interview; you can see the full list here.

While I agree that this problem can be solved in a different way, but it is also a perfect example of how you can use the SQL EXISTS clause.

But, if you are new to the SQL world, it's better to start with a comprehensive SQL course like The Complete SQL Bootcamp course by Jose Portilla on Udemy. That will help you to learn SQL better and quicker, and these kinds of articles will also make more sense once you have some SQL knowledge under your belt.





SQL tables and Data for Query Example
Before looking at the query, let's see the schema, tables, and data to understand the problem better. We have two tables Customers and Orders. Customers contain two columns, Id and Name. The id is a numeric column while the Name is a text column, let's assume of type VARCHAR.

If any customer has ordered anything, then their CustomerId will exist in the Orders table, we will take advantage of this knowledge to solve this problem.

We have four customers with Id ranging from 1 to 4. Our second table, Orders, contains Id, which is a unique id for order, and CustomerId, which is the Id of the Customer who makes that order. If any Customer will place an order, then their Id will exist in the Orders table.


Table: Customers.

+----+-------+
| Id | Name  |
+----+-------+
| 1  | Joe   |
| 2  | Henry |
| 3  | Sam   |
| 4  | Max   |
+----+-------+

Table: Orders.

+----+------------+
| Id | CustomerId |
+----+------------+
| 1  | 3          |
| 2  | 1          |
+----+------------+

Using the above tables as an example, return the following:

+-----------+
| Customers |
+-----------+
| Henry     |
| Max       |
+-----------+


If you looking for some more SQL challenges, then you can try solving problems given in Joe Celko's classic book, SQL Puzzles, and Answers, the 2nd Edition. One of the best books to improve your SQL query skills.




How to Find Customers Who Never Order using EXISTS in SQL
One of the most common solutions to this problem is by using the SQL JOIN clause. You can use the LEFT OUTER JOIN to solve this problem, as shown below:

SELECT C.Name FROM Customers C
LEFT JOIN Orders O ON  C.Id = O.CustomerId
WHERE O.CustomerId is NULL

When you join two tables in SQL using a LEFT OUTER JOIN, then a big table will be created with NULL values in the column which don't exist in another table.

For example, the big table will have four columns C.Id, C.Name, O.Id, and O.CustomerId, for Customers who have never ordered anything, the O.CustomerId will be NULL.

Many programmers make the mistake of using != in the JOIN condition to solve this problem, with the assumption that if = returns matching rows, then != will return those ids which are not present in another table. So beware of that.

If you struggle to understand join, then I suggest you take a look at Jose Portilla's excellent SQL course The Complete SQL Bootcamp on Udemy. His teaching style is amazing and you will understand joins in no time.

Anyway, this problem is actually an excellent example of how and when to use EXISTS clause:

SELECT C.Name FROM Customers C 
WHERE NOT EXISTS (SELECT 1 FROM Orders O WHERE C.Id = O.CustomerId)

This is a correlated subquery, where the inner query will execute for each row of the outer query, and only those customers will be returned who have not ordered anything.

Btw, the most simple solution is by using the NOT IN Clause.

SELECT A.Name FROM Customers A
WHERE A.Id NOT IN (SELECT B.CustomerId FROMs Orders B)
And, here is a nice screenshot to remember how and when to use the EXISTS clause in SQL query:

How to use EXISTS Clause in SQL? A Real World SQL Query Example using EXISTS


That's all about how to use the EXISTS clause in SQL to find all customers who have never ordered. If you like to improve your SQL query skills, then you can also problems given in Joe Celko's classical book SQL Puzzles and Answers, the 2nd Edition. One of the best books with lots of challenging questions to test your SQL skill, and if you need some online courses to learn SQL in-depth or fill the gaps in your SQL knowledge, the following courses are a good place to start with.


Read more: https://javarevisited.blogspot.com/2016/01/sql-exists-example-customers-who-never-ordered.html#ixzz8hijkETZH

Difference between Self and Equi Join in SQL - INNER Join example MySQL

The main difference between Self Join and Equi Join is that In Self Join we join one table to itself rather than joining two tables. Both Self Join and Equi Join are types of INNER Join in SQL, but there is a subtle difference between the two. Any INNER Join with equal as join predicate is known as Equi Join. SQL Joins are the fundamental concept of SQL similar to correlated and noncorrelated subqueries or using group by clause and a good understanding of various types of SQL join is a must for any programmer.

PlayUnmute
Fullscreen
By the way, If you have written INNER join using where clause then using a comparison operator as = will be known as an equijoin. Equi joins or Self-join is not a formal JOIN or part of the syntax, instead, they are a just popular way to refer to certain join examples.

One of the best examples of Self Join, I have seen in an SQL query Interview questions is "How do you find all Employees who are Managers in Employee table", which is commonly asked along with another popular question how to find the second highest salary of employee or questions related to joining three tables in one SQL query.

In this SQL tutorial, we will learn to self-join by example while solving this SQL query. Btw, If you are new to SQL and don't understand fundamentals like JOINs or co-related sub-queries then I highly recommend you go through a comprehensive SQL course like The Complete SQL Bootcamp by Jose Portilla on Udemy. It's one of the best and also most affordable courses to learn SQL online.





Self Join Example in MySQL
In order to solve this query let's first see schema and data of the Employee table.

mysql> select * from employee;
+--------+----------+---------+--------+--------+
| emp_id | emp_name | dept_id | salary | mgr_id |
+--------+----------+---------+--------+--------+
|    103 | Jack     |       2 |   1400 |    104 |
|    104 | John     |       2 |   1450 |    104 |
|    105 | Johnny   |       3 |   1050 |    104 |
|    108 | Alan     |       3 |   1150 |    104 |
|    106 | Virat    |       4 |    850 |    105 |
|    107 | Vina     |       4 |    700 |    105 |
|    109 | joya     |       4 |    700 |    105 |
+--------+----------+---------+--------+--------+
7 rows in set (0.00 sec)


In above  table all employees who are managers has there emp_id as mgr_id in other employees and by using SELF JOIN  i.e. join two instances of employee table and comparing, we can find all employees who are managers. Here is the SELECT query example using self-join:

mysql> select distinct e.emp_id, e.emp_name from employee e join employee m on e.emp_id=m.mgr_id;
+--------+----------+
| emp_id | emp_name |
+--------+----------+
|    104 | John     |
|    105 | Johnny   |
+--------+----------+
2 rows in set (0.00 sec)


In this example of self join, we have joined employee table to itself by using two table aliases e and m. We have also used distinct keyword to remove duplicates here.

 You can also say this is an example of EQUI JOIN because in join predicate we have used = or equal condition. In fact, this one is an example of INNER Join, SELF Join, and EQUI Join at the same time.

If you are confused about syntax of all possible join in SQL, here is a handy diagram:

Difference between self join and equi join in SQL





Self Join vs Equi Join in SQL and MySQL
In the short major difference between Self Join and Equi Join in SQL is that Self Join requires only one table while most of Equi join is a condition used in join predicate. Since Equi Join is based on the condition for comparison, it can occur in any INNER, OUTER, or SELF join in SQL.


Read more: https://www.java67.com/2013/01/difference-between-self-and-equi-join-sql-example-inner-mysql.html#ixzz8hijzAeFw

Difference between Primary key vs Candidate Key in SQL Database? Example

Primary key vs Candidate Key
What is the difference between primary key and candidate key is another popular SQL and database interview question which appears in various programming interviews now and then? The concept of primary key and candidate key is not just important from the interview point of view but also in designing databases and normalization. By the way, this is my second post about primary keys, In the last one, we have seen a comparison of primary key vs unique key, which also happens to be one of the frequently asked database questions. 

By definition primary key is a column or collection of columns, which uniquely defines a row in a table. Candidate keys are keys that can be a primary key and also able to uniquely identify any row in the table.
PlayUnmute
Fullscreen

In simple terms, you may have a couple of Candidate keys and you have chosen one of them as a primary key.

This selection part is the most important skill in database design. Since only the primary key can have a clustered index in a table while unique keys can have a Nonclustered index, it's important to choose the right column or collection of columns as a primary key.

Often I select a column that is most frequently used in the Where clause of the SELECT query.

Btw, If you are new to SQL and don't understand fundamentals like primary key, normalization, and basic SQL queries then you can also join these free SQL courses to learn those SQL fundamentals. It's one of the best resources to learn SQL online.






Difference between Candidate Key vs Primary Key
 Before seeing the difference between a Candidate key and a Primary key let's see some similarities between them in bullets points.

1. Unique indentification
Both Primary and Candidate keys can uniquely identify records in a table on the database.

2. Constraints
Both Primary and Candidate keys have constraints UNIQUE and NOT NULL.

3. Structure
Primary key or Candidate keys can be either a single column or a combination of multiple columns in a table.

If you preparing for an SQL interview or looking for some good SQL interview questions then you can also check the difference between Correlated and Noncorrelated subqueries and  When to use truncate vs delete in SQL.


Now from the interview point of view here is the difference between a Candidate key and primary key in SQL table on point format for easy to remember :

1. Number of Keys
There can be multiple Candidate keys in a table in relation to the database e.g. Oracle, MySQL, Sybase, or MSSQL but only one primary key is permitted.

2. Example
An example of Primary key and Candidate key can be ID and SSN number in an Employee table, Since both can identify each employee uniquely they are candidate key and anyone can become the primary key.

Now if you have to choose between them as the primary key, I will go ID as a primary key because SSN is sensitive information and may not be allowed/not safe to use as String in queries as frequently as ID.

The second reason for choosing ID over SSN as a primary key can be the use of ID as a primary tracking ID within the organization and its frequent use all over the place.

Once you choose a primary key, All candidate keys are like unique keys.

Here is a nice table that explains a couple of candidate keys (columns that are eligible to become primary keys) and how other keys become alternate keys once a primary key is chosen. 

In this table Roll_No, Name, and Branch are candidate keys because they have unique values but in reality, Name can be duplicate and Branch can also become duplicate, but Roll_No will be unique, hence it is chosen as a primary key.   If you want to learn more about database design, I suggest you go through these Database and SQL courses. 

Difference between Primary key vs Candidate Key in SQL Database? Example


Read more: https://www.java67.com/2012/10/difference-between-primary-key-vs-candidate-keys-sql-database.html#ixzz8hikBO4u2

Difference between Primary key vs Unique key in SQL Database? Answer

primary key vs unique key in SQL
The primary key and unique key are two important concepts in a relational database and are used to uniquely identify a row in a table. Both primary key and unique keys can identify a row uniquely but there is some subtle difference between them which we will see in this article. In fact, primary key vs unique is a popular SQL interview question along with classics like truncate vs delete and  How to manage transactions in a database, mostly asked to fresher and 2 to 3 years experience guys in any programming language. SQL is not just limited to any DBA or PLSQL developer but it's an important skill even for Java programmers and you can expect SQL interview questions even in many Java interviews.
PlayUnmute
Fullscreen

Some time programmer also confuses between a unique key and a foreign key, which is the primary key of other tables in relation, hence questions like the difference between a primary and foreign key or a primary and unique key, or foreign and unique keys are asked to check their understanding.

The key thing to remember is that they help to keep data integrity in check. The unique key ensures that no duplicate values are inserted in the database, while a primary and foreign key is responsible for maintaining referential integrity.

They are also used to link two tables when you are joining them. Btw, there is a slight difference in unique key and unique key constraint, former is a concept while the latter is an implementation that ensures that no duplicate key is inserted into your tables.

Btw, If you are new to these concepts, I suggest you joining these free SQL and Database courses to get a full understanding of essential SQL and database concepts.




Difference between primary key and unique key in SQL
As I said both primary and unique key uniquely identifies each row in the table but there is some subtle difference between them. here are some of them :

1. Unique key in a table can be null, at least one but the primary key cannot be null in any table in a relational database like MySQL, Oracle, etc.

2. The unique key is represented using a unique constraint while a primary key is created using a primary key constraint in any table and it's automatically got a unique constraint. You can also see these Database and SQL courses from Udemy and from Pluralsight for more details on how unique key constraint works.

Difference between Primary key and Unique key in SQL



3. The primary key can be a combination of more than one unique key in the same table.

4. There can be only one primary key per table in relation to databases like MySQL, Oracle, PostgreSQL, SQLServer, or Sybase but there can be more than one unique key per table.

5. Many database engines automatically put a clustered index on the primary key and since you can only have one clustered index per table, it's not available to any other unique key at the same time. This is true for both Oracle and MySQL Server

Here is a nice summary of the difference between a primary key and a unique key in a table. These differences are valid on most of the relational databases like Oracle, MySQL, and SQL Server:

Difference between primary and unique key in table SQL


These were some of the differences between the primary key and the unique key in SQL or any table. It's's one of those SQL interview questions which you don't like to miss before going for any programming interview or any database, SQL interview.


Read more: https://www.java67.com/2012/10/difference-between-primary-vs-unique-key-table-sql.html#ixzz8hikKyRTZ

Difference between Primary and Foreign keys in SQL [Answer]

The database is a collection of tables and a table is the collection of rows or records. A primary key is the data to uniquely identify a row in the table. For example, if an Employee table has millions of rows and emp_id is a primary key then it can uniquely identify that row. You can use this primary key to retrieve (SELECT) the row, update the row, and delete the row. In SQL, a table can have only one primary key but it can contain more than one column. There are two types of primary key, a simple primary key, and a composite primary key.

PlayUnmute
Fullscreen
A simple primary key is made of just one column while a composite primary key is made of more than one column. The primary key also enforces some constraints like UNIQUE and NOT NULL, which means if you try to enter another record with the primary key already existing in the database then DBMS will reject it.

Similarly, a primary key cannot be NULL, it must have some value. On the other hand, the foreign key is just the primary key of another table. In a relational database, two tables can be related to each other like Employee and Department, in those cases, the primary key of one table becomes the foreign key of another table.

In this article, you will learn some key differences between the Primary and foreign keys in a table. This is also one of the most common SQL Interview questions for 1 to 2 years of experienced programmers.






Difference between Primary and Foreign key in a table
As I said, if two tables are in relation to each other than the primary key of one table becomes the foreign key of another table. Let's see some more differences between Primary and Foreign keys in SQL:

1. One of the major differences between these two keys is that the primary key enforces clustered index, which is the actual physical order of how data is stored in the disc. On the other hand, the Foreign key doesn't create a clustered index in the table.


2. The primary key is unique in the table. So a table cannot contain more than one row with the same primary key, but that's not required for a foreign key. You can have more than one row in a table with the same foreign key e.g. all employees will have a unique id but many of them working for the same department will have the same dept_id. This is one of the main differences between a unique key and a primary key.


3. Foreign key helps to maintain the integrity of related tables in the database. For example, it's not possible to delete a department, unless a single employee is referring that. So, an accidental delete of such a department will be prevented by database management systems like Oracle, MySQL, or SQL Server.  

You can further set up cascade actions with foreign keys like when a department is deleted, update the dept_id of all employees in the Employee table referring to this department. You can set up such an arrangement using the ON CASCADE clause.

Similarly, you cannot insert the data in the secondary table if a row with the primary key doesn't exist in the Primary key e.g. adding a non-existent department to an employee's profile. This is also known as referential integrity in the database.


4. Another key difference between the primary and foreign keys in a table is that the primary key cannot accept null, but the foreign key can accept multiple values.


5. The Primary key uniquely identifies a record in the table, but the foreign key can not be used for that purpose, it's just the primary key of the related table.

Here is a nice table of some key differences between the Primary and Foreign keys in the table:

Difference between Primary and foreign key in table


Read more: https://www.java67.com/2015/12/difference-between-primary-and-foreign.html#ixzz8hikcfvSO

Difference between Primary key vs Foreign key in table – SQL Tutorial Example

The main difference between the Primary key and the Foreign key in a table is that it’s the same column that behaves as the primary key in the parent table and as a foreign key in a child table. For example in the Customer and Order relationship, customer_id is the primary key in the Customer table but a foreign key in the Order table. By the way, what is a foreign key in a table and the difference between Primary and Foreign key are some of the popular SQL interview questions, much like truncate vs delete in SQL or difference between correlated and noncorrelated subquery? We have been learning key SQL concepts along with these frequently asked SQL questions and in this SQL tutorial, we will discuss what is a foreign key in SQL and the purpose of the foreign key in any table. 




By the way, this is the third article related to a primary key in SQL, the other being the difference between primary and unique key and How to find the second highest salary in SQL. If you are preparing for any technical job interview where you expect some SQL questions, check out these questions, they are worth preparing.

Difference between Primary key vs Foreign key in table – SQL Tutorial Example




What is the Foreign key in a table in the Database?
What is foreign key and difference between primary vs foreign key in SQLA Foreign key is a column in one table which is the primary key on another table. A foreign key and a Primary key are used to define the relationship between two tables in a relational database. For example in Employee and Department relationship, we have two tables Department(dept_id, dept_name) and  Employee (emp_id, emp_name, dept_id). dept_id is the primary key in the Department table and the foreign key in the Employee table. 

Though it’s not required that name of a foreign key must be the same with primary key, we have kept it the same as per standard SQL best practices. Foreign key in a table enforce Referential Integrity constraint, which can be used to implement business rules e.g. referential integrity can stop you from creating an Employee with a non existent department. 



This kind of check maintains integrity of data in a relationship. As discussed in our post What is referential integrity in MySQL database, we have seen that it's implemented as foreign key constraint and can allow CASCADE UPDATE and DELETE. These referential action delete or update matching column in child table ( foreign key table) when corresponding row from parent table (primary key table ) is deleted or updated to maintain integrity of data.




Difference between Primary key and Foreign key in SQL
Here is some important difference between primary and foreign keys in a table which is worth remembering both on SQL interview point of view and knowledge point of view.

1) Name of foreign key can be different than the name of primary key it represent in other table. For example in our Employee and Department relationship, Primary key in Department table is dept_id  and we have used same name in Employee table to create foreign key. It could have been different e.g. departmentId or departmentID t etc.

2) Another difference between primary and foreign key is that unlike primary key, a foreign key can be null e.g. in our example you can have an Employee record for which dept_id can be null, this shows that no corresponding record in Department table.


3) One more difference between primary key and foreign key is that foreign key can be duplicate opposite to primary key which is always unique.

4) By using foreign key constraints, we can introduce referential integrity in multiple table relationship in SQL. Referential integrity guarantees data integrity, see benefits of Referential Integrity in SQL to know more.

5) Foreign key mostly works as a link between two table when we join tables using INNER JOIN and OUTER JOIN. For example, when we INNER JOIN both Employee with Department table, we can use dept_id as joining column. See How to join three tables in SQL for more details.

6) Table on which a column is declared as a primary key is known as parent table in the relationship and foreign key table is known as child table in a relationship. For example in Employee and Department relationship, Department is parent table because dept_id is primary key there and Employee is child table because dept_id is a foreign key in this table.



Primary key and Foreign key Example in SQL
One of the best examples to understand the Primary key and Foreign key in a table is Employee and Department relationship or the Customer and Order relationship. You can create an Order and Customer table in MySQL as following to create primary and foreign keys :

CREATE TABLE Customer (cust_id   INT NOT NULL,
                       cust_name VARCHAR(256),                      
                       PRIMARY KEY (cust_id)) ENGINE=INNODB;

CREATE TABLE ORDER (order_id INT NOT NULL,
                    amount INT NOT NULL,
                    cust_id INT,
                    FOREIGN KEY (cust_id) REFERENCES Customer(cust_id)
                    ON DELETE CASCADE) ENGINE=INNODB;

Now, cust_id is primary key in Customer table and the foreign key in Order table. If we try to insert an Order for which cust_id is something that is invalid in Customer table, MySQL database will reject such INSERT or UPDATE. This is one of the benefit of using Referential Integrity. 

It also allow to CASCADE UPDATE and DELETE operation which first delete or update a row in parent table e.g. Customer and then delete or update all matching rows in child table e.g. Order table.

That's all on what is a foreign key in a table and the difference between primary and foreign key in SQL. I suggest to create some table by yourself and try to test foreign key constraint by violating it and see how database e.g. Oracle, MySQL or SQL Server  behaves. To understand more try ON DELETE CASCADE and ON DELETE UPDATE to see how database maintains foreign key constraint. You can also see my post on Referential Integrity example on MySQL database


Read more: https://javarevisited.blogspot.com/2012/12/foreign-key-vs-primary-key-table-sql-database-difference.html#ixzz8hikpDRYr

What is Referential Integrity in Database or SQL - MySQL Example Tutorial

Referential Integrity is a set of constraints applied to foreign keys which prevents entering a row in the child table (where you have the foreign key) for which you don't have any corresponding row in the parent table i.e. entering NULL or invalid foreign keys. Referential Integrity prevents your table from having incorrect or incomplete relationships e.g. If you have two tables Order and Customer where Customer is parent table with primary key customer_id and Order is child table with foreign key customer_id. Since as per business rules you can not have an Order without a Customer and this business rule can be implemented using referential integrity in SQL on a relational database.




Referential Integrity will cause failure on any INSERT or UPDATE SQL statement changing the value of customer_id in the child table If the value of customer_id is not present in the Customer table. 

By the way, What is Referential Integrity in SQL is also an important SQL question similar to finding the second highest salary in SQL or the difference between truncate and delete and should be prepared well before going for any job interview, where knowledge of SQL is one of the requirements.

But, if you are new to the SQL world, it's better to start with a comprehensive SQL course like The Complete SQL Bootcamp course by Jose Portilla on Udemy. That will help you to learn SQL better and quicker, and these kinds of articles will also make more sense once you have some SQL knowledge under your belt.

Referential Integrity example in MySQL tables
What is Refrential Integrity in SQL database with MySQL example
Another example of Referential Integrity is Employee and Department relationship. If we have dept_id as a foreign key in the Employee table then by using referential integrity constraints we can avoid creating  Employee without department or non-existing department. 

In short Referential Integrity makes primary key foreign key relationships viable. Let's first create Employee and Department table with a primary key, foreign key, and referential integrity constraints.



CREATE TABLE Department (dept_id INT NOT NULL,
                         dept_name VARCHAR(256),                      
                         PRIMARY KEY (dept_id)) ENGINE=INNODB;

CREATE TABLE Employee (emp_id INT NOT NULL,
                       emp_name VARCHAR(256),
                       dept_id INT,
                       FOREIGN KEY (dept_id) REFERENCES Department(dept_id)
                       ON DELETE CASCADE) ENGINE=INNODB;

Above SQL statements will create both Department and Employee tables. dept_id is now a foreign key in the Employee table. 

In this SQL, while creating a foreign key we have specified ON DELETE clause which tells, what needs to do when a record from the parent table is deleted. CASCADE referential action allows to delete or update all matching rows from the child table, after deleting a record in the parent table. This way Referential Integrity preserves data integrity of the relationship.

Let's see How Referential Integrity disallows INSERT and UPDATE for a record in the child table for which there is no matching record in the parent table. To check this Referential Integrity example execute the following MySQL queries :

INSERT INTO Department VALUES (1, "Sales");
INSERT INTO Employee VALUES (101, "Rajeev", 2)

mysql> INSERT INTO Employee VALUES (101, "Rajeev", 2)
    -> ;
ERROR 1452 (23000): Cannot ADD OR UPDATE a child row: a FOREIGN KEY constraint fails (`test`.`employee`, CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`dept_id`) REFERENCES `department` (`dept_id`) ON DELETE CASCADE)

When we inserted first record in Department table it ran fine but when we insert a record in Employee table with dept_id = 2 which is not present in Department i.e. parent table, failed to Referential integrity or foreign key constraint check.

If you modify your query and correct dept_id to 1, query will run fine, as shown below

mysql> INSERT INTO Employee VALUES (101, "Rajeev", 1);
Query OK, 1 row affected (0.05 sec)

Now let's delete our only record from Department table and see if matching records on child table is automatically deleted or not.

mysql> DELETE FROM Department;
Query OK, 1 row affected (0.05 sec)

mysql> SELECT * FROM Employee;
Empty SET (0.00 sec)
You see there is no record in the Employee table because of ON DELETE CASCADE, matching records in the child table are deleted. Similarly, you can use ON UPDATE CASCADE to automatically propagate UPDATE from the parent table to child tables.

Advantage of Referential Integrity in RDBMS and SQL
There are several benefit of Referential Integrity in relational database and maintaining integrity of data among parent and child tables. Here are some of the most noticed advantages of Referential Integrity in SQL:

1) Referential Integrity prevents inserting records with incorrect details in table. Any insert or update operation will fail if it doesn't satisfy referential integrity rule.


2) If a records from parent table is deleted, referential integrity allows to delete all related records from child table using cascade-delete functionality.

3) Similar to second advantage if a record i.e. customer_id of a customer is updated on parent table (Customer table) , Referential Integrity helps to update customer_id in child table (Order) using cascade-update.


Read more: https://javarevisited.blogspot.com/2012/12/what-is-referential-integrity-in-database-sql-mysql-example-tutorial.html#ixzz8hil5zIkv

Three tables JOIN Example SQL


Joining three tables in a single SQL query can be very tricky if you are not good with the concept of SQL Join. SQL Joins have always been tricky not only for new programmers but for many others,  who are in programming and SQL for more than 2 to 3 years. There are enough to confuse someone on SQL JOIN ranging from various types of SQL JOIN like INNER and OUTER join, LEFT and RIGHT outer join, CROSS join, etc. Between all of these fundamentals, What is most important about Join is, combining multiple tables. If you need data from multiple tables in one SELECT query you need to use either subquery or JOIN.

Most of the time we only join two tables like Employee and Department but sometimes you may require joining more than two tables and a popular case is joining three tables in SQL.

In the case of joining three tables table, 1 relates to table 2 and then table 2 relates to table 3. If you look it closely you find that table 2 is a joining table that contains the primary key from both table 1 and table 2. As I said it can be extremely confusing to understand the join of three or more tables.

I have found that understanding table relationships as the primary key and foreign key helps to alleviate confusion than the classical matching row paradigm.

SQL Join is also a very popular topic in SQL interviews and there are always been some questions from Joins, like the difference between INNER and OUTER JOIN,  SQL query with JOIN like Employee Department relationship and  Difference between LEFT and RIGHT OUTER JOIN, etc. In short, this is one of the most important topics in SQL both from experience and interview points of view.




Three table JOIN syntax in SQL
Here is a general SQL query syntax to join three or more tables. This SQL query should work in all major relational databases like MySQL, Oracle, Microsoft SQLServer, Sybase, and PostgreSQL:

SELECT t1.col, t3.col
FROM table1
JOIN table2 ON table1.primarykey = table2.foreignkey
JOIN table3 ON table2.primarykey = table3.foreignkey



We first join table 1 and table 2 which produce a temporary table with combined data from table1 and table2,  which is then joined to table3. This formula can be extended to more than 3 tables to N tables, You just need to make sure that the SQL query should have N-1 join statement in order to join N tables. for joining two tables, we require 1 join statement and for joining 3 tables we need 2 join statements.

Here is a nice diagram that also shows how does different types of JOINs e.g. inner, left outer, right outer and cross joins works in SQL:

How to join three tables in SQL with MySQL database example



SQL Query to JOIN three tables in MySQL
How to join three tables in SQL with Example - MySQL Oracle SQL ServerIn order to better understand the joining of 3 tables in the SQL query let's see an example.  Consider the popular example of Employee and Department schema. In our case, we have used a link table called Register which links or relates both Employee to Department. 

The primary key of the Employee table (emp_id) is a foreign key in Register and similarly, the primary key of the Department table (dept_id) is a foreign key in Register table.

Btw, the only way to master SQL join is doing as much exercise as possible. If you could solve most of SQL puzzles from Joe Celko's classic book, SQL Puzzles, and Answers, 2nd edition, you will more confident about dealing with SQL joins, whether it could be two, three or four tables.


In order to write an SQL query to print employee name and department name alongside we need to join 3 tables. First JOIN statement will join Employee and Register and create a temporary table which will have dept_id as another column. Now second JOIN statement will join this temp table with Department table on dept_id to get the desired result.

Here is the complete SELECT SQL query example to join 3 tables and it can be extended to join more than 3 or N tables.




mysql> SELECT * FROM Employee;
+--------+----------+--------+
| emp_id | emp_name | salary |
+--------+----------+--------+
| 1      | James    |   2000 |
| 2      | Jack     |   4000 |
| 3      | Henry    |   6000 |
| 4      | Tom      |   8000 |
+--------+----------+--------+
4 rows IN SET (0.00 sec)

mysql> SELECT * FROM Department;
+---------+-----------+
| dept_id | dept_name |
+---------+-----------+
| 101     | Sales     |
| 102     | Marketing |
| 103     | Finance   |
+---------+-----------+
3 rows IN SET (0.00 sec)

mysql> SELECT * FROM Register;
+--------+---------+
| emp_id | dept_id |
+--------+---------+
|      1 |     101 |
|      2 |     102 |
|      3 |     103 |
|      4 |     102 |
+--------+---------+
4 rows IN SET (0.00 sec)

mysql> SELECT emp_name, dept_name
       FROM Employee e
       JOIN Register r ON e.emp_id=r.emp_id
       JOIN Department d ON r.dept_id=d.dept_id;
+----------+-----------+
| emp_name | dept_name |
+----------+-----------+
| James    | Sales     |
| Jack     | Marketing |
| Henry    | Finance   |
| Tom      | Marketing |
+----------+-----------+
4 rows IN SET (0.01 sec)


If you want to understand it even better then try joining tables step by step. So instead of joining 3 tables in one go, first join 2 tables and see how the result table will look like. That’s all on How to join three tables in one SQL query in the relational database.

By the way, in this SQL JOIN Example, we have used ANSI SQL and it will work in another relational database as well like Oracle, SQL Server, Sybase, PostgreSQL, etc. Let us know if you face any issues while running this 3 table JOIN query in any other database.


Read more: https://javarevisited.blogspot.com/2012/11/how-to-join-three-tables-in-sql-query-mysql-sqlserver.html#ixzz8hilI6mVl

Difference between WHERE and HAVING clause in SQL? Example

The main difference between the WHERE and HAVING clauses comes when used together with the GROUP BY clause. In that case, WHERE is used to filter rows before grouping, and HAVING is used to exclude records after grouping. This is the most important difference, and if you remember this, it will help you write better SQL queries. This is also one of the important SQL concepts to understand, not just from an interview perspective but also from a day-to-day use perspective. I am sure you have used the WHERE clause because it's one of the most common clauses in SQL along with SELECT and used to specify filtering criteria or conditions.

You can even use the WHERE clause without HAVING or GROUP BY, as you have seen many times. On the other hand, HAVING can only be used if grouping has been performed using the GROUP BY clause in the SQL query. 

PlayUnmute
Fullscreen
Another worth noting thing about the WHERE and HAVING clause is that the WHERE clause cannot contain aggregate functions like COUNT(), SUM(), MAX(), MIN(), etc but the HAVING clause may contain aggregate functions.

Another worth noting the difference between WHERE and HAVING clause is that WHERE is used to impose filtering criterion on a SELECT, UPDATE, DELETE statement as well as single row function and used before group by clause but HAVING is always used after group by clause.

If you are starting with SQL, then these are some of the fundamentals you need to learn, and a good course can help you a lot. If you need a recommendation, I suggest you join any of these best SQL and database courses online. This list contains the best courses from Udmey, Coursera, Pluralsight, and other websites. 





Difference between WHERE vs. HAVING in SQL
1. WHERE clause is processed right after FROM clause in the logical order of query processing, which means it is processed before GROUP BY clause while HAVING clause is executed after groups are created.

2. If used in GROUP BY, You can refer to any column from a table in the WHERE clause, but you can only use columns that are not grouped or aggregated.

3. If you use the HAVING clause without group by, it can also refer to any column, but the index will not be used as opposed to the WHERE clause. For example, the following have the same result set, however "where" will use the id index and having will do a table scan
select * from table where id = 1
select * from the table having id = 1


4. You can use an aggregate function to filter rows with the HAVING clause. Because the HAVING clause is processed after the rows have been grouped, you can refer to an aggregate function in the logical expression. For example, the following query will display only courses which have more than 10 students :
SELECT Course, COUNT(Course) as NumOfStudent 
FROM Training 
GROUP BY Course 
HAVING COUNT(Course)> 10

5. Another key difference between WHERE and HAVING clause is that WHERE will use Index and HAVING will not; for example following two queries will produce an identical result, but WHERE will use Index and HAVING will do a table scan
SELECT * FROM Course WHERE Id = 101;
SELECT * FROM Course HAVING Id = 102;

6. Since the WHERE clause is evaluated before groups are formed, it evaluates for per row. On the other hand, the HAVING clause is evaluated after groups are formed; hence it evaluates per group. You can further see these free SQL online courses to learn more about it.

Difference between WHERE and HAVING clause in SQL?




When to use WHERE and HAVING clauses?
Though both are used to exclude rows from the result set, you should use the WHERE clause to filter rows before grouping and use the HAVING clause to filter rows after grouping. In other words, WHERE can be used to filter on table columns while HAVING can be used to filter on aggregate functions like count, sum, avg, min, and max.

If filtering can be done without aggregate function then you must do it on the WHERE clause because it improves performance because counting and sorting will be done on a much smaller set. If you filter the same rows after grouping, you unnecessarily bear the cost of sorting, which is not used.

For example, the following statement is syntactically correct and produce the same result, but the second one is more efficient than the first one because it filters rows before grouping :

SELECT Job, City, State, Count(Employee) from ... HAVING...
SELECT ..... from .. WHERE ..


Read more: https://www.java67.com/2019/06/difference-between-where-and-having-in-sql.html#ixzz8hilPgYQh

SQL is standard for querying, inserting, and modifying data in a relational database. It is categorized into DDL and DML and is powerful enough to create database objects e.g. table, view, stored procedure, and can perform CRUD operation (SELECT, INSERT, UPDATE, and DELETE) query.

On the other hand, T-SQL (Transact-SQL) is a dialect used by Microsoft SQL Server and Sybase. It is an extension of SQL and provides more functionality than SQL but at the same time confirming ANSI SQL standard as well. For example, you can use conditionals and loops in T-SQL to create a more sophisticated stored procedure that is not available in standard SQL.

Similarly, PL/SQL (Procedural language SEQUEL) is a dialect for Oracle database, which provides T-SQL like functionality e.g. conditionals, loops, and other elements for procedural programming. Both T-SQL and PL/SQL are the supersets of SQL because they not just confirm ANSI SQL standard but also provide additional functionality that is not available in the ANSI standard but helps a lot in database programming.

In this article, you will learn  a couple of more differences between SQL, T-SQL, and PL/SQL to understand them better.





Why do you need T-SQL or PL/SQL?
Though standard SQL is enough for inserting, retrieving, and modifying data from the database, they only provide set-based operations, which means there are a lot of tasks that you cannot do using plain SQL.

In order to make SQL more powerful and to expand its usage from simple querying to create complex stored procedures for report generation, XSLT transformation, and many other functionalities, various database vendors started adding proprietary features on SQL supported by their platform. 

These efforts created different SQL dialects e.g. T-SQL, which is a SQL dialect for Microsoft SQL Server, and Sybase, PL/SQL which is a SQL dialect for Oracle.

In fact, every database has its own SQL dialect, which comprises features and keywords only supported in their database e.g. MySQL has the LIMIT keyword which can be used for pagination or solving problems like second highest salary, but it will not work on Oracle or Microsoft SQL Server database. Similarly, PostgreSQL has some features which are not available to other databases.

It's always recommended to use standard ANSI SQL if it serves your purpose because query written in ANSI SQL is portable across different database vendors but if you use a proprietary keyword e.g. TOP in Microsoft SQL Server, LIMIT in MySQL then you need to change your query when your application migrate from one database to another.




Differences between SQL, T-SQL and PL/SQL
Here are a couple of more differences between SQL, PL/SQL, and T-SQL for interviews:

1. Full form
SQL stands for Structured Query language, T-SQL stands for Transact-SQL and PL/SQL stands for Procedural Language/SQL.

2. Supported Database
SQL is supported across all database vendors like Oracle, SQL Server, MySQL, PostgreSQL, IBM DB2, and even lightweight databases like SQLLite, but T-SQL is only supported in Microsoft SQL Server and Sybase, and PL/SQL is supported only in Oracle.


3. Performance
Another key difference between SQL and PL/SQL, T-SQL is the performance improvement by saving database roundtrip. Both PL/SQL and T-SQL allow grouping of SQL statements which means if your code has 4 SELECT SQL queries then instead of making four round trips to the database, they can be sent as one single unit to the database and their result will also come back as one unit. 

I suggest joining these best Oracle and PL/SQL online courses to learn more about PL/SQL programming. It covers versions through Oracle Database 12c.

difference between SQL vs T-SQL vs PL/SQL?

4. SQL Query Requirement
There is an interesting difference between SQL and T-SQL in terms of minimum SELECT query requirements. According to standard SQL, a SELECT query must have at minimum FROM and SELECT clauses, but you can create a SELECT query in T-SQL with just a SELECT clause, without FROM clause. 

For example, the following SQL query is invalid according to SQL standard but it works fine in T-SQL supported databases like Sybase and MSSQL:

SELECT 'Java' AS Language, 1 AS RANK;

The output of the query is a single row with attributes resulting from the expression with names assigned using the aliases e.g.

Language Rank
Java     1

If you want to learn more about T-SQL, I suggest joining these Microsoft SQL Server and T-SQL Fundamentals courses, a great reference to T-SQL but at the same time a very readable and clear explanation of key SQL concepts.



5. Data Types and Keyword
There are some data types which are supported only by PL/SQL and T-SQL e.g. TINYINT data type is only available in T-SQL and VARCHAR2 and NUMBER is only available in PL/SQL or Oracle database. Similarly, there are keywords which are only available in a particular SQL dialect like the LIMIT keyword which is only available in MySQL.

If you want to learn more about features, keyword, and data types supported by different vendors I strongly suggest joining these best SQL courses, it provides a great cross-platform syntax for SQL. Absolutely must-read for those programmers who work with multiple databases


Read more: https://javarevisited.blogspot.com/2017/03/difference-between-sql-tsql-and-plsql.html#ixzz8hilico1X

Difference between UNION vs UNION ALL in SQL? Example

Hello guys, what is the difference between UNION vs UNION ALL is one of the most popular SQL interview questions and often asked programmers during a telephonic round of interviews. Though both UNION and UNION ALL is used to combine results of two SELECT queries, the main difference between them is that UNION doesn't include duplicate record but UNION ALL does. Another difference between them is that UNION ALL is faster than UNION but may look slow because it returns more data which takes more time to travel via the network. The difference between UNION and UNION ALL can be a tricky SQL question, especially for developers, who have not used this useful keyword ever. 

Since the UNION clause is not as common as a SELECT clause in SQL, it's usually asked in a telephonic round of programming interviews to check whether the candidate is comfortable with SQL or not. It's in the same league of questions like clustered vs non-clustered index or primary vs unique key. UNION is very different than other SQL commands because it operates on data rather than columns.
PlayUnmute
Fullscreen

Anyway, the answer to this question is simple, though both UNION and UNION ALL are used to combine the result of two separate SQL queries on the same or different table,  UNION does not keep a duplicate record (a row is considered duplicate if the value of all columns is same), while UNION ALL does.



Since you mostly don't want duplicate rows,  UNION is preferred over UNION ALL in reporting and application development. By the way, you should keep in mind that UNION ALL performance better than UNION because it doesn't have to remove duplicates, so no extra work.

This keyword is very well supported by all major databases like Oracle, Microsoft SQL Server, MySQL, and PostgreSQL. Another thing to keep in mind is the amount of data returned by UNION ALL; if your database server is quite far away and you have limited bandwidth, UNION ALL may appear slower than UNION because of the number of duplicates it returned.

The cost of transferring duplicate rows can exceed the query execution benefits in many cases. We will see a couple of examples UNION and UNION ALL in SQL, but before that few things to keep in mind. In order to combine the results of two queries, they must contain the same number of columns.

For example, if one query contains 3 columns and the other contains 4 columns then you can not use UNION or UNION ALL. This is because a row will only be considered duplicated when all columns will have the same value, irrespective of the name of the columns themselves.

By the way, if you are just starting with SQL and not familiar with essential SQL concepts and commands then I highly recommend you to join an online SLQ course like SQL for Newbs: Data Analysis for Beginners on Udemy to start with. One of the highest-rated beginner SQL courses on Udemy and you can get it for just $10 on sales. 





UNION and UNION ALL Example in Microsoft SQL Server
Let's see one simple example of UNION and UNION ALL, this will not only show you how they work but also where you can use them. This example is from my sample database and the following screenshot is from SQL Server Management Studio.

 We have two tables, Employee and Customer. In order to use UNION and UNION ALL, I have kept the same persons as employee and customer, so you will see the same id on emp_id and customer_id, and the same name as well. 

If you look at the result of the first two select queries, you will see that the first query returns two rows and the second query returns three rows, where two rows have exactly the same data as the first query. 

Key things to note is that column names are different in both result sets, first one has emp_id and emp_name, while second data set has customer_id and customer_name, but most important both dataset has only two columns. This is a must in order to combine them using UNION and UNION ALL keywords. 

The third query is an example of how to use the UNION clause in SQL, you can see that the combined result has just three columns, all are unique. Duplicate columns from the second result set were not included. This is more like how you do UNION in Set theory, where the final result contains data from both sets. 

The fourth query is how you should use UNION ALL, it contains five rows, two from the first query and three from the second query. It has not removed duplicate rows from the second query, that's why you see Ken and Bob repeating twice. 

This example teaches us the core concept that the UNION doesn't depend upon the column name but the data. You can combine the result of as many queries as possible until the number of columns in all of them is the same and the data is from the same set.


Regarding performance, you need to run UNION and UNION ALL with a large database, containing millions of rows. There you can monitor how much time both takes and compare them. 

Theoretically, UNION ALL should take less time to execute but more time to transfer data to the client. By the way, if are new to SQL Server then I recommend you to go through an introductory course like Microsoft SQL for Beginners on Udemy. It's a great course to start learning SQL using MSSQL and tools. 


Difference between UNION ALL and UNION in SQL SERVER



Difference between UNION and UNION ALL command in SQL
Now we know how union and union all works and has some background by following the above examples, let's summarise the similarities and difference between them for quick revision :

1. Combining Results

Both UNION and UNION ALL are used to combine the results of two separate SQL queries, it could be on the same table or a different table but the data should be the same. For example, if product_id is used in two tables like Product and Order, then two SQL queries which pulls product_id from these two tables can be combined using UNION or UNION ALL.

2. Duplicates
The key difference between UNION and UNION ALL is that the former will remove duplicates but later will keep them. In other words, UNION is equal to running distinct on the output of UNION ALL. For example, if product_id 10 is returned by both SQL query then it will only appear once if you use UNION and appear twice if you use UNION ALL.

3. Execution time
Due to the above difference query execution time of UNION ALL is smaller than UNION, which means the former runs faster than the latter. So if you want faster output and don't care about duplicates use UNION ALL. 

This is something you can deduce from your existing SQL knowledge and that's where working on fundamentals pays off. If you want to improve your SQL skill or just want to revise SQL concepts then An Introductory Guide to SQL course on Educative, an interactive learning platform is a good place to start with. 

best interactive course to learn SQL

And, if you find the Educative platform and their interview courses like Grokking the System design useful then consider getting an Educative Subscription which provides access to their 100+ courses for just $14 per month. It's very cost-effective and great for preparing for coding interviews. 



4. Speed and Bandwith Usage
You should keep in mind that benefits gained by not removing duplicates can be easily wiped out by transferring more data over a poor bandwidth network connection. That's why in practice some time UNION ALL appears slower than UNION because it returns a lot of data with duplicates which require more time to travel from database server to client machine. To evaluate the performance of UNION and UNION ALL case by case.




5. Number of Columsn on ResultSet
Another worth noting thing while using UNION and UNION ALL is that all queries combined using a UNION, INTERSECT, or EXCEPT operator must have an equal number of expressions in their target lists. For example, if the result of query 1 has three columns and the result of query 2 has two columns then you cannot combine them using the UNION command.


That's all on the difference between the UNION and UNION ALL command in SQL. It's one of the useful commands to combine the result of two SELECT queries when they contain the same data. There are many practical scenarios where UNION is very useful, for example when you need to create a list out of different tables containing data from the same set. 

The main difference between UNION and UNION ALL is about duplicates, the former removes it while later keeps it, other differences between them on performance and networking bandwidth usage can be easily derived by knowing this difference. Also keep in mind that it is well supported big three databases like MySQL, Oracle, and SQL Server. Let us know if you have been asked this question in your SQL interview.


Read more: https://www.java67.com/2014/09/difference-between-union-vs-union-all-in-SQL.html#ixzz8hilvY4ue

Difference between WHERE vs HAVING clause in SQL - GROUP BY Comparison with Example

What is the difference between WHERE and  HAVING clause in SQL is one of the most popular questions asked on SQL and database interviews, especially to beginners? Since programming jobs, required more than one skill, it’s quite common to see a couple of SQL Interview questions in Java and .NET interviews. By the way unlike any other question, not many Java programmers or dot net developers, who are supposed to have knowledge of basic SQL, fail to answer this question. Though almost half of the programmer says that WHERE is used in any SELECT query, while HAVING clause is only used in SELECT queries, which contains aggregate function or group by clause, which is correct.
PauseUnmute
Fullscreen


Though both WHERE and HAVING clause is used to specify filtering condition in SQL, there is subtle difference between them. Real twist comes into interview, when they are asked to explain result of a SELECT query, which contains both WHERE and HAVING clause, I have seen many people getting confused there. 

Key point, which is also the main difference between WHERE and HAVING clause in SQL is that, condition specified in WHERE clause is used while fetching data (rows) from table, and data which doesn't pass the condition will not be fetched into result set, on the other hand HAVING clause is later used to filter summarized data or grouped data. 

In short if both WHERE and HAVING clause is used in a SELECT query with aggregate function or GROUP BY clause, it will execute before HAVING clause. This will be more clear, when we will see an example of WHERE, HAVING, JOIN and GROUP BY clause together.





WHERE vs HAVING Clause Example in SQL
Difference betwen WHERE and HAVING clause in SQL - Interview QuestionIn this example of the WHERE and HAVING clause, we have two tables Employee and Department. Employee contains details of employees e.g. id, name, age, salary and department id, while Department contains id and department name. In order to show, which employee works for which department we need to join two tables on DEPT_ID to get the department name. 

Our requirement is to find how many employees are working in each department and the average salary of the department. In order to use the WHERE clause, we will only include employees who are earning more than 5000. Before executing our query which contains WHERE HAVING, and GROUP BY clause, let see data from Employee and Department table:

SELECT * FROM Employee;
EMP_ID
EMP_NAME
EMP_AGE
EMP_SALARY
DEPT_ID
1
Virat
23
10000
1
2
Rohit
24
7000
2
3
Suresh
25
8000
3
4
Shikhar
27
6000
1
5
Vijay
28
5000
2


SELECT * FROM Department;
DEPT_ID
DEPT_NAME
1
Accounting
2
Marketing
3
Sales


SELECT d.DEPT_NAME, count(e.EMP_NAME) as NUM_EMPLOYEE, avg(e.EMP_SALARY) as AVG_SALARY FROM Employee e,
Department d WHERE e.DEPT_ID=d.DEPT_ID AND EMP_SALARY > 5000 GROUP BY d.DEPT_NAME;
DEPT_NAME
NUM_EMPLOYEE
AVG_SALARY
Accounting
1
8000
Marketing
1
7000
Sales
2
8000


From the number of employees (NUM_EMPLOYEE) column you can see that only Vijay who work for Marketing department is not included in result set because his earning 5000. This example shows that, condition in WHERE clause is used to filter rows before you aggregate them and then HAVING clause comes in picture for final filtering, which is clear from following query, now Marketing department is excluded because it doesn't pass condition in HAVING clause I mean AVG_SALARY > 7000

SELECT d.DEPT_NAME, count(e.EMP_NAME) as NUM_EMPLOYEE, avg(e.EMP_SALARY) as AVG_SALARY FROM Employee e,
Department d WHERE e.DEPT_ID=d.DEPT_ID AND EMP_SALARY > 5000 GROUP BY d.DEPT_NAME HAVING AVG_SALARY > 7000;
DEPT_NAME
NUM_EMPLOYEE
AVG_SALARY
Accounting
1
8000
Sales
2
8000




Difference between WHERE and HAVING in SQL
Apart from this key difference we have seen in this article, here are few more differences between WHERE and HAVING clause, which is worth remembering and can be used to compare both of them :

1) Apart from SELECT queries, you can use the WHERE clause with UPDATE and DELETE clause but the HAVING clause can only be used with SELECT query. For example following query, which involves WHERE clause will work but others which uses HAVING clause will not work :

update DEPARTMENT set DEPT_NAME="NewSales" WHERE DEPT_ID=1 ;  // works fine

update DEPARTMENT set DEPT_NAME="NewSales" HAVING DEPT_ID=1 ; // error
Incorrect syntax near the keyword 'HAVING'.: update DEPARTMENT set DEPT_NAME='NewSales' HAVING DEPT_ID=1

2) WHERE clause is used for filtering rows and it applies on each and every row, while HAVING clause is used to filter groups in SQL.

3) One syntax level difference between WHERE and HAVING clause is that, former is used before GROUP BY clause, while later is used after GROUP BY clause.

4) When WHERE and HAVING clause are used together in a SELECT query with aggregate function,  WHERE clause is applied first on individual rows and only rows which pass the condition is included for creating groups. Once group is created, HAVING clause is used to filter groups based upon condition specified.


Here is a list of difference between WHERE and HAVING clause in point format:

ifference between WHERE vs HAVING clause in SQL


That's all on the difference between WHERE and HAVING clause in SQL. As I said this is very popular question and you can't afford not to prepare it. Always remember key difference between WHERE and HAVING clause in SQL, if WHERE and HAVING clause is used together, first WHERE clause is applied to filter rows and only after grouping HAVING clause is applied.


Read more: https://javarevisited.blogspot.com/2013/08/difference-between-where-vs-having-clause-SQL-databse-group-by-comparision.html#ixzz8himKSi32

20+ ArrayList Questions with Answers from Java Interviews
So without wasting any more time, let's start with the questions. The questions are mainly divided into two categories, one is a fact-based question, which checks how much you know about ArrayList, and the other is the task-based question, which evaluates how good you are at doing things with ArrayList. In my list, I have combined both of them.


1. How to remove duplicates from ArrayList in Java?  (Answer)
This is a task-based question. Since the List interface allows duplicates, ArrayList also allowed it but if you remember Set interface doesn't allow duplicates, which means you can remove duplicates from ArrayList by converting it into a Set and then back to ArrayList, but how will you keep the order intact? See the answer for a more detailed explanation.


2. How to reverse ArrayList in Java? (Answer)
You can reverse ArrayList by using the Collections.reverse() method.  There are a couple of more ways like iterating through the list and copying elements into a new list. See the answer for more ways to do this task.


And if you want to learn more about ArrayList and other collection classes, you can also check out Java Fundamentals: Collections course by Richard Warburton on Pluralsight. Richard is a Java champion and this course is the best online course to learn the Collection framework in depth. 







3. Difference between an array and an ArrayList in Java? (Answer)
This is a fresher-level interview question, the main difference between array and ArrayList is that the former is static and the latter is dynamic. You cannot change the size of the array once created, but ArrayList can grow and increase its size automatically.


4. How to synchronize ArrayList in Java? (Answer)
This is a very good task-based question. If you remember, ArrayList is not thread-safe, its not synchronized either, which means you cannot share it between multiple threads if one of them modifies it. Don't worry, you can synchronize ArrayList by using Collections.synchronizedList() method. Check the answer to understand the steps.


5. When to use ArrayList and LinkedList in Java? (Answer)
This is by far the most popular ArrayList based question from Java Interviews and you can answer it very easily if you are familiar with two key data structures, array, and linked list. 


Since array provides constant-time search operation, it's better to use ArrayList if search outnumbers add and remove operation, otherwise use LinkedList which provides constant time add and remove operation. See the answer for a more detailed discussion on this topic.


Java ArrayList Interview Questions and Answers


6. Difference between ArrayList and HashSet in Java? (Answer)
One of the simplest questions you will ever see on a Java interview. The main difference is the former is List while the later is Set which means ArrayList allowed duplicates, keeps elements in order while HashSet doesn't allow duplicates and provides no ordering guarantee.


7. How to loop over ArrayList in Java? (Answer)
There are many ways to traverse over ArrayList, you can use classic for loop with index, or you can take iterator from ArrayList and can use while loop in conjunction with Iterator.hasNext() method, Or you can use the new foreach loop introduced in Java 5, which doesn't require an index. See the answer to live examples.


8. Difference between Vector and ArrayList in Java? (Answer)
This is the second most popular question based on ArrayList in Java. Though both Vector and ArrayList implement List interface, Vector is synchronized while ArrayList is not synchronized, which means the former is thread-safe and fast while the latter is not thread-safe and slow.


9. How to create and initialize ArrayList in one line? (Answer)
There is a nice little trick to do this by using the Arrays.asList() method, but remember the List returned by this class has some differences with ArrayList, please check the answer to understand what are those differences.


10. How to sort ArrayList in Java? (Answer)
Another task-based ArrayList interview question. You can easily sort the ArrayList by using Collections.sort() method, all you need to make sure is that elements implement either the Comparable or Comparator interface. The former is used to sort on natural order while the latter is used while sorting in the custom order.


11. Difference between HashMap and ArrayList in Java? (Answer)
There is a huge difference between HashMap and ArrayList, fundamental is former is a Map data structure that stores key-value pairs while the latter stores just an object. HashMap access object using key while ArrayList access elements using an index. Though both provide O(1) search performance, ArrayList's performance is guaranteed but HashMap can vary depending upon collision level.


12. How to use ArrayList in Java? (Answer)
Just see the article to learn different ways of using this popular class in Java.


13. How to convert ArrayList to String in Java? (Answer)
Simple, just call toString()  right? unfortunately, the String representation is not very helpful. If you are looking for a comma-separated String containing all elements of ArrayList then you can either use Java 8 String joiner or some older library method as shown in the answer page.


14. How to get a sublist from ArrayList in Java? (Answer)
This is another task-based question, but you can easily do it if you remember API. You can get a list of elements in a range by using the subList() method from the ArrayList class. This would be very helpful in case of a sorted list.


15. Difference between length() of array and size() of ArrayList in Java? (Answer)
This is one of the tricky questions, if you get the backed array and call the length() it will return how many elements you can store in this array, also known as capacity, but if you call the size() function of ArrayList class then it will return a total number of elements currently stored in ArrayList, which is always less than or equal to capacity.


16, What is CopyOnWriteArrayList in Java? (Answer)
It's a concurrent collection class that is introduced as an alternative to synchronized List in Java. This class takes advantage of the advanced thread-safety technique instead of locking. It's very efficient if ArrayList is mostly used for reading purposes because it allows multiple threads to read data without locking, which was not possible with synchronized ArrayList. See the answer to learn more about the CopyOnWriteArrayList class.


17. How to remove objects from ArrayList in Java? (Answer)
There are two ways to remove elements from ArrayList, first, you can call the remove(int index) method and pass on the index of the element you want to remove, and second, you can call the remove(Object obj) method and pass the element you want to remove. By the way, just be careful while working with ArrayList of integers because autoboxing can cause issues by creating an ambiguity between two remove methods. See the answer for a more detailed discussion on the topic.


18. How to make ArrayList read-only in Java? (Answer)
Another task and API-based interview question. You can answer it easily if you are about the Collections utility class, which provides several wrappers of the standard ArrayList class e.g. you can use Collections to create a synchronized version or read-only version of ArrayList in Java.


19. How to sort ArrayList in descending order in Java? (Answer)
This is the follow-up question of one of the previous questions related to sorting. By default, elements are sorted in increasing order as this is how their compareTo() or compare() method compares them. If you want to sort into descending order, just reverse the comparison logic using the Collections.reverseComparator() method.

And, if you need more ArrayList questions for practice then here is a list of new ArrayList questions to answer:

How do you add multiple string values to an Arraylist in Java?
How to convert Arraylist to XML in Java?
How to print string array list in java?
How do you create an Arraylist in Excel in Java?
How to write an Arraylist of objects to a text file in Java?
How to remove special characters from Arraylist in Java?
How do you make a generic Arraylist in Java?
How to iterate an Arraylist inside a Hashmap using Java?
How to get key and value from Arraylist in Java?
How to find even numbers in an Arraylist in Java?
How to convert Arraynode to Arraylist in Java?
How do you initialize a two dimensional Arraylist in Java?
How to parse JSON Arraylist in Java?
How to retrieve object values from Arraylist in Java 8?
How to check if an Arraylist is sorted in Java?
How to find the difference between two Arraylists in Java?
How to convert Arraylist to CSV in Java?
How to sort 2 Arraylist in Java?
How do you add two values to an Arraylist in Java?
How to get key from Arraylist in Java?
How do you write a loop for an Arraylist in Java?
How do you declare an Arraylist variable in Java?
What is the size of empty Arraylist in Java?
How do you add a unique element to an Arraylist in Java?
How do you remove blank spaces from an Arraylist in Java?
How to print duplicate values in Arraylist in Java?
How to get an Arraylist from another method in Java?
How do you implement an Arraylist in Java?
How do you remove duplicate employee objects from Arraylist in Java?
How do you write an Arraylist to a text file in Java?
How do you remove one element from an Arraylist in Java?
How do you add an Arraylist to a string array in Java?
How do you create an Arraylist of a class object in Java?
How to inherit Arraylist in Java?
How do you fill an array list in java?
How do you make an Arraylist an array in Java?
How to compare two Arraylists of different size in Java?
How to validate Arraylist in Java?
How to compare two Arraylist of objects in Java and find difference?
Can Arraylist be static in Java?
How do you remove square brackets from an Arraylist in Java?
How to get specific object from Arraylist in Java 8?
How do you create an Arraylist list in Java?
How do you initialize an Arraylist of objects in Java?
How to iterate Arraylist of Linkedhashmap in Java?
How to add elements to an Arraylist in Java using for loop?
How do you fill an Arraylist in Java?
How to write an Arraylist to a CSV file in Java?
What is the initial size of Arraylist in Java?
How do you add elements to an Arraylist for a loop in Java?
How do you pass an Arraylist as an argument in Java?
How to assign values to an Arraylist in Java?
How do you assign a value to an Arraylist in Java?
How do you add an Arraylist to an array in Java?
How many elements can an Arraylist hold Java?
How do you return an Arraylist to a string in Java?
How do you add different objects to an Arraylist in Java?
How to store array list in java?
How do you add a key value pair to an Arraylist in Java?
How to Add Employee object to Arraylist in Java?
How do you make an Arraylist anonymous in Java?
How to get user input in Arraylist in Java?
How do I change the order of an arraylist in Java?
How to get value from Arraylist of objects in Java?
How do you process an Arraylist in Java?
How do you make an Arraylist immutable in Java?
How to store Arraylist data into Excel in Java?
How do you add an int to an Arraylist in Java?
How to process Arraylist in Java?
How to add object array to Arraylist in Java?
How do you assign a string value to an Arraylist in Java?
How to get input from user in Arraylist in Java?
What does Arraylist mean in Java?
How to create a float Arraylist in Java?
How to add employee objects to Arraylist in Java?
How to override equals method in Arraylist Java?

Here’s a comprehensive guide to addressing each of the tasks and questions related to `ArrayList` in Java:

### 1. **Add Multiple String Values to an ArrayList**

You can use the `addAll()` method to add multiple elements to an `ArrayList`.

```java
import java.util.ArrayList;
import java.util.Arrays;

public class AddMultipleStrings {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Apple", "Banana", "Cherry"));
        System.out.println(list);
    }
}
```

### 2. **Convert ArrayList to XML**

To convert an `ArrayList` to XML, you can use a library like JAXB or manually construct the XML using string manipulation.

**Using JAXB:**

```java
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.util.ArrayList;

public class ArrayListToXML {
    public static void main(String[] args) throws JAXBException {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        
        JAXBContext context = JAXBContext.newInstance(ArrayList.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(list, System.out);
    }
}
```

### 3. **Print String ArrayList**

```java
import java.util.ArrayList;

public class PrintArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.forEach(System.out::println);
    }
}
```

### 4. **Create an ArrayList in Excel**

To create an `ArrayList` in Excel, you generally use libraries like Apache POI.

```java
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToExcel {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Sheet1");
        
        int rowNum = 0;
        for (String item : list) {
            Row row = sheet.createRow(rowNum++);
            Cell cell = row.createCell(0);
            cell.setCellValue(item);
        }

        try (FileOutputStream fileOut = new FileOutputStream("list.xlsx")) {
            workbook.write(fileOut);
        }
        workbook.close();
    }
}
```

### 5. **Write ArrayList of Objects to a Text File**

```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteArrayListToFile {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("list.txt"))) {
            for (String item : list) {
                writer.write(item);
                writer.newLine();
            }
        }
    }
}
```

### 6. **Remove Special Characters from ArrayList**

```java
import java.util.ArrayList;
import java.util.regex.Pattern;

public class RemoveSpecialCharacters {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ap!ple");
        list.add("Ba@na-na");

        Pattern pattern = Pattern.compile("[^a-zA-Z0-9 ]");
        for (int i = 0; i < list.size(); i++) {
            list.set(i, pattern.matcher(list.get(i)).replaceAll(""));
        }

        System.out.println(list);
    }
}
```

### 7. **Create a Generic ArrayList**

```java
import java.util.ArrayList;

public class GenericArrayList {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Integer> integerList = new ArrayList<>();
        
        stringList.add("Hello");
        integerList.add(123);
        
        System.out.println(stringList);
        System.out.println(integerList);
    }
}
```

### 8. **Iterate an ArrayList Inside a HashMap**

```java
import java.util.ArrayList;
import java.util.HashMap;

public class IterateArrayListInHashMap {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        map.put("Numbers", values);

        for (ArrayList<Integer> list : map.values()) {
            for (Integer num : list) {
                System.out.println(num);
            }
        }
    }
}
```

### 9. **Get Key and Value from ArrayList**

You generally access keys and values in `Map` objects rather than `ArrayList`. If you meant to get elements from a list:

```java
import java.util.ArrayList;

public class GetKeyValueFromArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index: " + i + ", Value: " + list.get(i));
        }
    }
}
```

### 10. **Find Even Numbers in an ArrayList**

```java
import java.util.ArrayList;

public class FindEvenNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.stream()
            .filter(num -> num % 2 == 0)
            .forEach(System.out::println);
    }
}
```

### 11. **Convert ArrayNode to ArrayList**

Assuming you're using Jackson for JSON processing:

```java
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayNodeToArrayList {
    public static void main(String[] args) throws IOException {
        String json = "[\"Apple\", \"Banana\", \"Cherry\"]";
        ObjectMapper mapper = new ObjectMapper();
        ArrayNode arrayNode = (ArrayNode) mapper.readTree(json);

        List<String> list = new ArrayList<>();
        Iterator<JsonNode> elements = arrayNode.elements();
        while (elements.hasNext()) {
            list.add(elements.next().asText());
        }

        System.out.println(list);
    }
}
```

### 12. **Initialize a Two-Dimensional ArrayList**

```java
import java.util.ArrayList;

public class TwoDimensionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> twoDList = new ArrayList<>();
        
        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                row.add(i * j);
            }
            twoDList.add(row);
        }

        System.out.println(twoDList);
    }
}
```

### 13. **Parse JSON ArrayList**

Using Jackson library:

```java
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParseJSONArrayList {
    public static void main(String[] args) throws IOException {
        String json = "[\"Apple\", \"Banana\", \"Cherry\"]";
        ObjectMapper mapper = new ObjectMapper();

        List<String> list = mapper.readValue(json, new TypeReference<ArrayList<String>>() {});
        System.out.println(list);
    }
}
```

### 14. **Retrieve Object Values from ArrayList in Java 8**

Using streams:

```java
import java.util.ArrayList;
import java.util.List;

public class RetrieveValues {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        
        list.forEach(System.out::println);
    }
}
```

### 15. **Check if an ArrayList is Sorted**

```java
import java.util.ArrayList;
import java.util.Collections;

public class CheckIfSorted {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        
        boolean isSorted = list.stream()
                               .sorted()
                               .toList()
                               .equals(list);
        System.out.println("Is sorted: " + isSorted);
    }
}
```

### 16. **Find the Difference Between Two ArrayLists**

```java
import java.util.ArrayList;
import java.util.List;

public class DifferenceBetweenLists {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        
        List<String> list2 = new ArrayList<>();
        list2.add("Banana");
        list2.add("Cherry");
        
       

 List<String> diff = new ArrayList<>(list1);
        diff.removeAll(list2);
        System.out.println("Difference: " + diff);
    }
}
```

### 17. **Convert ArrayList to CSV**

```java
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArrayListToCSV {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        try (FileWriter writer = new FileWriter("list.csv")) {
            for (String item : list) {
                writer.write(item + "\n");
            }
        }
    }
}
```

### 18. **Sort Two ArrayLists**

```java
import java.util.ArrayList;
import java.util.Collections;

public class SortTwoArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(1);
        
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        
        Collections.sort(list1);
        Collections.sort(list2);
        
        System.out.println("Sorted list1: " + list1);
        System.out.println("Sorted list2: " + list2);
    }
}
```

### 19. **Add Two Values to an ArrayList**

```java
import java.util.ArrayList;

public class AddTwoValues {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
    }
}
```

### 20. **Get Key from ArrayList**

If you meant elements or index:

```java
import java.util.ArrayList;

public class GetElementFromArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        System.out.println("Element at index 1: " + list.get(1));
    }
}
```

### 21. **Write a Loop for an ArrayList**

```java
import java.util.ArrayList;

public class LoopArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        
        for (String item : list) {
            System.out.println(item);
        }
    }
}
```

### 22. **Declare an ArrayList Variable**

```java
import java.util.ArrayList;

public class DeclareArrayListVariable {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
    }
}
```

### 23. **Size of Empty ArrayList**

```java
import java.util.ArrayList;

public class SizeOfEmptyArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Size: " + list.size()); // Output: 0
    }
}
```

### 24. **Add a Unique Element to an ArrayList**

Use a `Set` to ensure uniqueness before adding to the `ArrayList`.

```java
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AddUniqueElement {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        
        String newElement = "Apple";
        if (set.add(newElement)) { // Only add if it's not already present
            list.add(newElement);
        }
        System.out.println(list);
    }
}
```

### 25. **Remove Blank Spaces from an ArrayList**

```java
import java.util.ArrayList;
import java.util.List;

public class RemoveBlankSpaces {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple ");
        list.add(" Banana");
        list.add(" Cherry ");

        list.replaceAll(String::trim);
        System.out.println(list);
    }
}
```

### 26. **Print Duplicate Values in ArrayList**

```java
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicates {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");

        Set<String> duplicates = new HashSet<>();
        Set<String> unique = new HashSet<>();
        for (String item : list) {
            if (!unique.add(item)) {
                duplicates.add(item);
            }
        }

        System.out.println("Duplicates: " + duplicates);
    }
}
```

### 27. **Get an ArrayList from Another Method**

```java
import java.util.ArrayList;

public class ArrayListFromMethod {
    public static void main(String[] args) {
        ArrayList<String> list = getList();
        System.out.println(list);
    }

    public static ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        return list;
    }
}
```

### 28. **Implement an ArrayList**

`ArrayList` is a part of Java Collections Framework, and you typically use it directly without implementing it. 

### 29. **Remove Duplicate Employee Objects from ArrayList**

Assuming `Employee` class properly overrides `equals` and `hashCode`:

```java
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Employee {
    String name;
    // Constructor, equals, hashCode omitted

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return name;
    }
}

public class RemoveDuplicateEmployees {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Alice"));
        list.add(new Employee("Bob"));
        list.add(new Employee("Alice"));

        Set<Employee> unique = new HashSet<>(list);
        list = new ArrayList<>(unique);

        System.out.println(list);
    }
}
```

### 30. **Write an ArrayList to a Text File**

```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteArrayListToTextFile {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("list.txt"))) {
            for (String item : list) {
                writer.write(item);
                writer.newLine();
            }
        }
    }
}
```

### 31. **Remove One Element from ArrayList**

```java
import java.util.ArrayList;

public class RemoveElementFromArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.remove("Banana");
        System.out.println(list);
    }
}
```

### 32. **Add an ArrayList to a String Array**

```java
import java.util.ArrayList;

public class AddArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        String[] array = list.toArray(new String[0]);
        for (String s : array) {
            System.out.println(s);
        }
    }
}
```

### 33. **Create an ArrayList of a Class Object**

```java
import java.util.ArrayList;

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class ArrayListOfClass {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Alice"));
        list.add(new Person("Bob"));
        System.out.println(list);
    }
}
```

### 34. **Inherit ArrayList in Java**

You typically extend `ArrayList` if you need additional behavior.

```java
import java.util.ArrayList;

public class CustomArrayList<E> extends ArrayList<E> {
    // Add custom methods or override existing methods
}

public class InheritArrayList {
    public static void main(String[] args) {
        CustomArrayList<String> list = new CustomArrayList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println(list);
    }
}
```

### 35. **Fill an ArrayList**

```java
import java.util.ArrayList;

public class FillArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("

Item " + i);
        }
        System.out.println(list);
    }
}
```

### 36. **Make an ArrayList an Array**

```java
import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        String[] array = list.toArray(new String[0]);
        for (String s : array) {
            System.out.println(s);
        }
    }
}
```

### 37. **Compare Two ArrayLists of Different Sizes**

```java
import java.util.ArrayList;
import java.util.List;

public class CompareArrayLists {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        
        List<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Banana");

        boolean isEqual = list1.size() == list2.size() && list1.containsAll(list2);
        System.out.println("Lists are equal: " + isEqual);
    }
}
```

### 38. **Validate ArrayList**

Validation typically involves checking contents or properties.

```java
import java.util.ArrayList;

public class ValidateArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        boolean isValid = !list.isEmpty();
        System.out.println("List is valid: " + isValid);
    }
}
```

### 39. **Compare Two ArrayLists of Objects and Find Difference**

```java
import java.util.ArrayList;
import java.util.List;

public class CompareArrayListsOfObjects {
    public static void main(String[] args) {
        List<Person> list1 = new ArrayList<>();
        list1.add(new Person("Alice"));
        list1.add(new Person("Bob"));

        List<Person> list2 = new ArrayList<>();
        list2.add(new Person("Bob"));
        list2.add(new Person("Charlie"));

        List<Person> diff = new ArrayList<>(list1);
        diff.removeAll(list2);
        System.out.println("Difference: " + diff);
    }
}
```

### 40. **Can ArrayList be Static in Java?**

Yes, an `ArrayList` can be static if it is defined within a static context (e.g., inside a static method or a static class).

```java
import java.util.ArrayList;

public class StaticArrayList {
    static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        list.add("Apple");
        list.add("Banana");
        System.out.println(list);
    }
}
```

### 41. **Remove Square Brackets from ArrayList**

```java
import java.util.ArrayList;

public class RemoveBrackets {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        String result = list.toString();
        result = result.replaceAll("\\[|\\]", "");
        System.out.println(result);
    }
}
```

### 42. **Get Specific Object from ArrayList in Java 8**

```java
import java.util.ArrayList;
import java.util.Optional;

public class GetSpecificObject {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        Optional<String> result = list.stream()
                                      .filter(item -> item.equals("Banana"))
                                      .findFirst();
        result.ifPresent(System.out::println);
    }
}
```

### 43. **Create an ArrayList List in Java**

```java
import java.util.ArrayList;
import java.util.List;

public class CreateArrayListList {
    public static void main(String[] args) {
        List<ArrayList<String>> listOfLists = new ArrayList<>();
        
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Banana");
        
        listOfLists.add(list1);
        listOfLists.add(list2);
        
        System.out.println(listOfLists);
    }
}
```

### 44. **Initialize an ArrayList of Objects**

```java
import java.util.ArrayList;

public class InitializeArrayListOfObjects {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Alice"));
        list.add(new Person("Bob"));
        System.out.println(list);
    }
}
```

### 45. **Iterate ArrayList of LinkedHashMap**

```java
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class IterateArrayListOfLinkedHashMap {
    public static void main(String[] args) {
        ArrayList<LinkedHashMap<String, String>> list = new ArrayList<>();
        
        LinkedHashMap<String, String> map1 = new LinkedHashMap<>();
        map1.put("Key1", "Value1");
        list.add(map1);

        LinkedHashMap<String, String> map2 = new LinkedHashMap<>();
        map2.put("Key2", "Value2");
        list.add(map2);

        for (LinkedHashMap<String, String> map : list) {
            map.forEach((key, value) -> System.out.println(key + ": " + value));
        }
    }
}
```

### 46. **Add Elements to ArrayList Using For Loop**

```java
import java.util.ArrayList;

public class AddElementsUsingForLoop {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
    }
}
```

### 47. **Fill an ArrayList in Java**

```java
import java.util.ArrayList;

public class FillArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println(list);
    }
}
```

### 48. **Write an ArrayList to a CSV File**

```java
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteArrayListToCSVFile {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        try (FileWriter writer = new FileWriter("list.csv")) {
            for (String item : list) {
                writer.append(item).append("\n");
            }
        }
    }
}
```

### 49. **Initial Size of ArrayList**

The initial size of an `ArrayList` is 10 by default.

```java
import java.util.ArrayList;

public class InitialSizeOfArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Initial size: " + list.size()); // Output: 0
    }
}
```

### 50. **Add Elements to ArrayList for a Loop**

```java
import java.util.ArrayList;

public class AddElementsForLoop {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add("Item " + i);
        }
        System.out.println(list);
    }
}
```

### 51. **Pass an ArrayList as an Argument**

```java
import java.util.ArrayList;

public class PassArrayListAsArgument {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        printList(list);
    }

    public static void printList(ArrayList<String> list) {
        list.forEach(System.out::println);
    }
}
```

### 52. **Assign Values to an ArrayList**

```java
import java.util.ArrayList;

public class AssignValuesToArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println(list);
    }
}
```

### 53. **Assign a Value to an ArrayList**

```java
import java.util.ArrayList;

public class AssignValueToArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.set(0, "Orange"); // Update the first element
        System.out.println(list);
    }
}
```

### 54. **Add an ArrayList to an Array**

```java
import java.util.ArrayList;

public class AddArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        String[] array = list.toArray(new String[0]);
        for (String s : array) {
            System.out.println(s);
        }
    }
}
```

### 55. **How Many Elements Can an ArrayList Hold**

An `ArrayList` can hold a very large number of elements, limited by memory constraints.

### 56. **Return an ArrayList to a String**

```java
import java.util.ArrayList;
import java

.util.StringJoiner;

public class ArrayListToString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        String result = String.join(", ", list);
        System.out.println(result);
    }
}
```

### 57. **Remove Elements from an ArrayList by Index**

```java
import java.util.ArrayList;

public class RemoveElementsByIndex {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.remove(0); // Removes "Apple"
        System.out.println(list);
    }
}
```

### 58. **Replace an Element in ArrayList**

```java
import java.util.ArrayList;

public class ReplaceElementInArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.set(1, "Cherry"); // Replace "Banana" with "Cherry"
        System.out.println(list);
    }
}
```

### 59. **Add Value to ArrayList**

```java
import java.util.ArrayList;

public class AddValueToArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        System.out.println(list);
    }
}
```

### 60. **ArrayList with Default Value**

```java
import java.util.ArrayList;

public class ArrayListWithDefaultValue {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Default");
        System.out.println(list);
    }
}
```

### 61. **Create an Empty ArrayList**

```java
import java.util.ArrayList;

public class CreateEmptyArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
    }
}
```

### 62. **Count Values in an ArrayList**

```java
import java.util.ArrayList;

public class CountValuesInArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        System.out.println("Count: " + list.size());
    }
}
```

### 63. **ArrayList to a String Array**

```java
import java.util.ArrayList;

public class ArrayListToStringArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        String[] array = list.toArray(new String[0]);
        for (String s : array) {
            System.out.println(s);
        }
    }
}
```

### 64. **Get Value from ArrayList**

```java
import java.util.ArrayList;

public class GetValueFromArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        System.out.println("Value at index 1: " + list.get(1));
    }
}
```

### 65. **Copy ArrayList to Another ArrayList**

```java
import java.util.ArrayList;

public class CopyArrayList {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");

        ArrayList<String> list2 = new ArrayList<>(list1);
        System.out.println(list2);
    }
}
```

### 66. **Clear ArrayList**

```java
import java.util.ArrayList;

public class ClearArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        list.clear();
        System.out.println("List after clear: " + list);
    }
}
```

### 67. **Add an Element to the End of ArrayList**

```java
import java.util.ArrayList;

public class AddElementToEnd {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println(list);
    }
}
```

### 68. **Print ArrayList Elements**

```java
import java.util.ArrayList;

public class PrintArrayListElements {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        for (String item : list) {
            System.out.println(item);
        }
    }
}
```

### 69. **Initialize ArrayList with Values**

```java
import java.util.ArrayList;

public class InitializeArrayListWithValues {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println(list);
    }
}
```

### 70. **Combine Two ArrayLists**

```java
import java.util.ArrayList;

public class CombineArrayLists {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Banana");

        list1.addAll(list2);
        System.out.println(list1);
    }
}
```

### 71. **Find Largest Value in ArrayList**

```java
import java.util.ArrayList;

public class FindLargestValue {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);

        int max = list.stream().max(Integer::compareTo).orElseThrow();
        System.out.println("Largest value: " + max);
    }
}
```

### 72. **Find Smallest Value in ArrayList**

```java
import java.util.ArrayList;

public class FindSmallestValue {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);

        int min = list.stream().min(Integer::compareTo).orElseThrow();
        System.out.println("Smallest value: " + min);
    }
}
```

### 73. **Sort an ArrayList**

```java
import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");

        Collections.sort(list);
        System.out.println(list);
    }
}
```

### 74. **Find Index of Element in ArrayList**

```java
import java.util.ArrayList;

public class FindIndexInArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        int index = list.indexOf("Banana");
        System.out.println("Index of Banana: " + index);
    }
}
```

### 75. **Check if ArrayList Contains an Element**

```java
import java.util.ArrayList;

public class CheckIfArrayListContains {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        boolean contains = list.contains("Banana");
        System.out.println("Contains Banana: " + contains);
    }
}
```

### 76. **Replace All Occurrences of an Element**

```java
import java.util.ArrayList;

public class ReplaceAllOccurrences {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");

        list.replaceAll(s -> s.equals("Apple") ? "Orange" : s);
        System.out.println(list);
    }
}
```

### 77. **ArrayList Methods**

Common `ArrayList` methods include `add()`, `remove()`, `get()`, `set()`, `clear()`, `size()`, `isEmpty()`, `contains()`, `indexOf()`, and `toArray()`.

### 78. **ArrayList to JSON**

Using a library like Jackson or Gson is the common approach.

Using Gson:

```java
import com.google.gson.Gson;
import java.util.ArrayList;

public class ArrayListToJson {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        Gson gson = new Gson();
        String json = gson.toJson(list);
        System.out.println(json);
    }
}
```

### 79. **Find Common Elements in Two ArrayLists**

```java
import java.util.ArrayList;
import java.util.List;

public class FindCommonElements {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");

        List<String> list2 = new ArrayList<>();
        list2.add("Banana");
        list2.add("Cherry");

        list1.retainAll(list2);
        System

.out.println("Common elements: " + list1);
    }
}
```

### 80. **Remove Duplicates from ArrayList**

```java
import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");

        HashSet<String> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);

        System.out.println(list);
    }
}
```

### 81. **Check if ArrayList is Empty**

```java
import java.util.ArrayList;

public class CheckIfEmpty {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Is empty: " + list.isEmpty());
    }
}
```

### 82. **ArrayList to LinkedList**

```java
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListToLinkedList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");

        LinkedList<String> linkedList = new LinkedList<>(arrayList);
        System.out.println(linkedList);
    }
}
```

### 83. **Convert ArrayList to a HashSet**

```java
import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListToHashSet {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        HashSet<String> set = new HashSet<>(list);
        System.out.println(set);
    }
}
```

### 84. **Initialize ArrayList in Constructor**

```java
import java.util.ArrayList;

public class InitializeArrayListInConstructor {
    ArrayList<String> list;

    public InitializeArrayListInConstructor() {
        list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
    }

    public static void main(String[] args) {
        InitializeArrayListInConstructor obj = new InitializeArrayListInConstructor();
        System.out.println(obj.list);
    }
}
```

### 85. **Check Size of ArrayList**

```java
import java.util.ArrayList;

public class CheckSizeOfArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        System.out.println("Size of list: " + list.size());
    }
}
```

### 86. **Print ArrayList Using Streams**

```java
import java.util.ArrayList;

public class PrintArrayListUsingStreams {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        list.stream().forEach(System.out::println);
    }
}
```

### 87. **Create ArrayList from Array**

```java
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
    public static void main(String[] args) {
        String[] array = {"Apple", "Banana"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(list);
    }
}
```

### 88. **ArrayList Initialization with Size**

```java
import java.util.ArrayList;

public class ArrayListInitializationWithSize {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(10);
        list.add("Apple");
        list.add("Banana");
        System.out.println(list);
    }
}
```

### 89. **Add Multiple Elements to ArrayList**

```java
import java.util.ArrayList;

public class AddMultipleElements {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        ArrayList<String> moreItems = new ArrayList<>();
        moreItems.add("Date");
        moreItems.add("Elderberry");

        list.addAll(moreItems);
        System.out.println(list);
    }
}
```

### 90. **Print ArrayList in a Single Line**

```java
import java.util.ArrayList;

public class PrintArrayListSingleLine {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        System.out.println(list);
    }
}
```

### 91. **Iterate ArrayList Using Iterator**

```java
import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayListUsingIterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
```

### 92. **Find First Occurrence of an Element**

```java
import java.util.ArrayList;

public class FindFirstOccurrence {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");

        int index = list.indexOf("Apple");
        System.out.println("First occurrence of Apple: " + index);
    }
}
```

### 93. **Find Last Occurrence of an Element**

```java
import java.util.ArrayList;

public class FindLastOccurrence {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");

        int index = list.lastIndexOf("Apple");
        System.out.println("Last occurrence of Apple: " + index);
    }
}
```

### 94. **Convert ArrayList to Object Array**

```java
import java.util.ArrayList;

public class ArrayListToObjectArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        Object[] array = list.toArray();
        for (Object obj : array) {
            System.out.println(obj);
        }
    }
}
```

### 95. **ArrayList Contains Element**

```java
import java.util.ArrayList;

public class ArrayListContainsElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        boolean contains = list.contains("Apple");
        System.out.println("List contains Apple: " + contains);
    }
}
```

### 96. **Print ArrayList Elements with Index**

```java
import java.util.ArrayList;

public class PrintArrayListWithIndex {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index " + i + ": " + list.get(i));
        }
    }
}
```

### 97. **Create a Thread-safe ArrayList**

Use `Collections.synchronizedList()` to create a thread-safe version of `ArrayList`.

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreadSafeArrayList {
    public static void main(String[] args) {
        List<String> list = Collections.synchronizedList(new ArrayList<>());
        list.add("Apple");
        list.add("Banana");

        synchronized (list) {
            for (String item : list) {
                System.out.println(item);
            }
        }
    }
}
```

### 98. **Remove All Elements from ArrayList**

```java
import java.util.ArrayList;

public class RemoveAllElements {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        list.clear();
        System.out.println("List after removing all elements: " + list);
    }
}
```

### 99. **Initialize ArrayList with Default Values**

```java
import java.util.ArrayList;

public class InitializeArrayListWithDefaults {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add("Default");
        }
        System.out.println(list);
    }
}
```

### 100. **Find Elements in ArrayList that Start with a Specific Letter**

```java
import java.util.ArrayList;

public class FindElementsStartingWith {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Avocado");

        list.stream()
            .filter(s -> s.startsWith("A"))
            .forEach(System.out::println);
    }
}
```
Read more: https://www.java67.com/2015/06/20-java-arraylist-interview-questions.html#ixzz8himTFcWz
