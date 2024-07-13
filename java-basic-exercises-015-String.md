# Java Exercises String

https://www.w3resource.com/java-exercises/string/index.php
### 1. Write a Java program to get the character at the given index within the string.

Sample Output:

Original String = Java Exercises!                                                                             
The character at position 0 is J                                                                              
The character at position 10 is i 
```java
// Define a public class named Exercise1.
public class Exercise1 {
    // Define the main method.
    public static void main(String[] args) {
        // Declare and initialize a string variable "str" with the value "Java Exercises!".
        String str = "Java Exercises!";
        // Print the original string.
        System.out.println("Original String = " + str);

        // Get the character at positions 0 and 10.
        int index1 = str.charAt(0); // Get the ASCII value of the character at position 0.
        int index2 = str.charAt(10); // Get the ASCII value of the character at position 10.

        // Print out the results.
        System.out.println("The character at position 0 is " +
                (char)index1); // Print the character at position 0 by converting ASCII value to char.
        System.out.println("The character at position 10 is " +
                (char)index2); // Print the character at position 10 by converting ASCII value to char.
    }
}
```
Sample Output:

Original String = Java Exercises!                                                                             
The character at position 0 is J                                                                              
The character at position 10 is i 
### 2. Write a Java program to get the character (Unicode code point) at the given index within the string.

Sample Output:

Original String : w3resource.com                                                                              
Character(unicode point) = 51                                                                                 
Character(unicode point) = 101 
```java
// Define a public class named Exercise2.
public class Exercise2 {
    // Define the main method.
    public static void main(String[] args) {
  
        // Declare and initialize a string variable "str" with the value "w3resource.com".
        String str = "w3resource.com";
        // Print the original string.
        System.out.println("Original String : " + str);
        
        // Retrieve the Unicode code point at index 1 in the string.
        int val1 = str.codePointAt(1);
    
        // Retrieve the Unicode code point at index 9 in the string.
        int val2 = str.codePointAt(9);
        
        // Print the Unicode code point representing the character at index 1 in the string.
        System.out.println("Character(unicode point) = " + val1);
        // Print the Unicode code point representing the character at index 9 in the string.
        System.out.println("Character(unicode point) = " + val2);
    }
}
```
Sample Output:

Original String : w3resource.com                                                                              
Character(unicode point) = 51                                                                                 
Character(unicode point) = 101 
### 3. Write a Java program to get the character (Unicode code point) before the specified index within the string.

Sample Output:

Original String : w3resource.com                                                                              
Character(unicode point) = 119                                                                                
Character(unicode point) = 99
```java
// Define a public class named Exercise3.
public class Exercise3 {
    // Define the main method.
    public static void main(String[] args) {
  
        // Declare and initialize a string variable "str" with the value "w3resource.com".
        String str = "w3resource.com";
        // Print the original string.
        System.out.println("Original String : " + str);
        
        // Retrieve the Unicode code point before the character at index 1 in the string.
        int val1 = str.codePointBefore(1);
    
        // Retrieve the Unicode code point before the character at index 9 in the string.
        int val2 = str.codePointBefore(9);
        
        // Print the Unicode code point representing the character before index 1 in the string.
        System.out.println("Character(unicode point) = " + val1);
        // Print the Unicode code point representing the character before index 9 in the string.
        System.out.println("Character(unicode point) = " + val2);
    }
}
```
Sample Output:

Original String : w3resource.com                                                                              
Character(unicode point) = 119                                                                                
Character(unicode point) = 99
### 4. Write a Java program to count Unicode code points in the specified text range of a string.

Sample Output:

Original String : w3rsource.com                                                                               
Codepoint count = 9
```java
// Define a public class named Exercise4.
public class Exercise4 {
    // Define the main method.
    public static void main(String[] args) {
  
        // Declare and initialize a string variable "str" with the value "w3rsource.com".
        String str = "w3rsource.com";
        // Print the original string.
        System.out.println("Original String : " + str);
        
        // Count the number of Unicode code points from index 1 to index 10 in the string.
        int ctr = str.codePointCount(1, 10);
        
        // Print the count of Unicode code points from index 1 to index 10 in the string.
        System.out.println("Codepoint count = " + ctr);
    }
}
```
Sample Output:

Original String : w3rsource.com                                                                               
Codepoint count = 9
### 5. Write a Java program to compare two strings lexicographically.
Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.

Sample Output:

String 1: This is Exercise 1                                                                                  
String 2: This is Exercise 2                                                                                  
"This is Exercise 1" is less than "This is Exercise 2" 
```java
// Define a public class named Exercise5.
public class Exercise5 {
    // Define the main method.
    public static void main(String[] args) {
        // Declare and initialize two string variables.
        String str1 = "This is Exercise 1";
        String str2 = "This is Exercise 2";
        
        // Print the first string.
        System.out.println("String 1: " + str1);
        // Print the second string.
        System.out.println("String 2: " + str2); 
       
        // Compare the two strings and get the comparison result.
        int result = str1.compareTo(str2);

        // Display the results of the comparison.
        if (result < 0) {
            // If the result is less than 0, print that the first string is less than the second.
            System.out.println("\"" + str1 + "\"" +
                " is less than " +
                "\"" + str2 + "\"");
        } else if (result == 0) {
            // If the result is 0, print that the first string is equal to the second.
            System.out.println("\"" + str1 + "\"" +
                " is equal to " +
                "\"" + str2 + "\"");
        } else { // if (result > 0)
            // If the result is greater than 0, print that the first string is greater than the second.
            System.out.println("\"" + str1 + "\"" +
                " is greater than " +
                "\"" + str2 + "\"");
        }
    }
}
```
Sample Output:

String 1: This is Exercise 1                                                                                  
String 2: This is Exercise 2                                                                                  
"This is Exercise 1" is less than "This is Exercise 2"
### 6. Write a Java program to compare two strings lexicographically, ignoring case differences.

Sample Output:

String 1: This is exercise 1                                                                                  
String 2: This is Exercise 1                                                                                  
"This is exercise 1" is equal to "This is Exercise 1"
```java
// Define a public class named Exercise6.
public class Exercise6 {
    // Define the main method.
    public static void main(String[] args) {
        // Declare and initialize two string variables, str1 and str2.
        String str1 = "This is exercise 1";
        String str2 = "This is Exercise 1";
        
        // Print the first string.
        System.out.println("String 1: " + str1);
        // Print the second string.
        System.out.println("String 2: " + str2); 
       
        // Compare the two strings ignoring case sensitivity and get the result of the comparison.
        int result = str1.compareToIgnoreCase(str2);

        // Display the results of the comparison.
        if (result < 0) {
            // If str1 (ignoring case) is less than str2 (ignoring case).
            System.out.println("\"" + str1 + "\"" +
                " is less than " +
                "\"" + str2 + "\"");
        } else if (result == 0) {
            // If str1 (ignoring case) is equal to str2 (ignoring case).
            System.out.println("\"" + str1 + "\"" +
                " is equal to " +
                "\"" + str2 + "\"");
        } else { // if (result > 0)
            // If str1 (ignoring case) is greater than str2 (ignoring case).
            System.out.println("\"" + str1 + "\"" +
                " is greater than " +
                "\"" + str2 + "\"");
        }
    }
}
```
Sample Output:

String 1: This is exercise 1                                                                                  
String 2: This is Exercise 1                                                                                  
"This is exercise 1" is equal to "This is Exercise 1"
### 7. Write a Java program to concatenate a given string to the end of another string.

Sample Output:

String 1: PHP Exercises and                                                                                   
String 2: Python Exercises                                                                                    
The concatenated string: PHP Exercises and Python Exercises

```java
// Define a public class named Exercise7.
public class Exercise7 {
    // Define the main method.
    public static void main(String[] args) {
        // Declare and initialize two string variables, str1 and str2.
        String str1 = "PHP Exercises and ";
        String str2 = "Python Exercises";
        
        // Print the first string.
        System.out.println("String 1: " + str1);
        // Print the second string.
        System.out.println("String 2: " + str2); 
       
        // Concatenate the two strings together and store the result in str3.
        String str3 = str1.concat(str2);

        // Display the newly concatenated string.
        System.out.println("The concatenated string: " + str3);
    }
}
```
Sample Output:

String 1: PHP Exercises and                                                                                   
String 2: Python Exercises                                                                                    
The concatenated string: PHP Exercises and Python Exercises
### 8. Write a Java program to test if a given string contains the specified sequence of char values.

Sample Output:

Original String: PHP Exercises and Python Exercises                                                           
Specified sequence of char values: and                                                                        
true 
```java
// Define a public class named Exercise8.
public class Exercise8 {
    // Define the main method.
    public static void main(String[] args) {
        // Declare and initialize two string variables, str1 and str2.
        String str1 = "PHP Exercises and Python Exercises";
        String str2 = "and";
        
        // Print the original string.
        System.out.println("Original String: " + str1);
        // Print the specified sequence of char values.
        System.out.println("Specified sequence of char values: " + str2);
        
        // Check if str1 contains the sequence specified in str2 and print the result.
        System.out.println(str1.contains(str2));
    }
}
```
Sample Output:

Original String: PHP Exercises and Python Exercises                                                           
Specified sequence of char values: and                                                                        
true 
### 9. Write a Java program to compare a given string to the specified character sequence.

Sample Output:

Comparing example.com and example.com: true                                                                   
Comparing Example.com and example.com: false
```java
// Define a public class named Exercise9.
public class Exercise9 {
    // Define the main method.
    public static void main(String[] args) {
        // Declare and initialize two string variables, str1 and str2.
        String str1 = "example.com", str2 = "Example.com";
        
        // Create a CharSequence object named cs with value "example.com".
        CharSequence cs = "example.com";
        
        // Compare str1 and cs for content equality and print the result.
        System.out.println("Comparing " + str1 + " and " + cs + ": " + str1.contentEquals(cs));
        
        // Compare str2 and cs for content equality and print the result.
        System.out.println("Comparing " + str2 + " and " + cs + ": " + str2.contentEquals(cs));
    }
}
```  
Sample Output:

Comparing example.com and example.com: true                                                                   
Comparing Example.com and example.com: false
### 10. Write a Java program to compare a given string to a specified string buffer.

Sample Output:

Comparing example.com and example.com: true                                                                   
Comparing Example.com and example.com: false 
```java
// Define a public class named Exercise10.
public class Exercise10 {
    // Define the main method.
    public static void main(String[] args) {
        // Declare and initialize two string variables, str1 and str2.
        String str1 = "example.com", str2 = "Example.com";
        
        // Create a StringBuffer object strbuf initialized with the value of str1.
        StringBuffer strbuf = new StringBuffer(str1);
    
        // Compare str1 and strbuf for content equality and print the result.
        System.out.println("Comparing " + str1 + " and " + strbuf + ": " + str1.contentEquals(strbuf));
    
        // Compare str2 and strbuf for content equality and print the result.
        System.out.println("Comparing " + str2 + " and " + strbuf + ": " + str2.contentEquals(strbuf));
    }
}
```
Sample Output:

Comparing example.com and example.com: true                                                                   
Comparing Example.com and example.com: false 
### 11. Write a Java program to create a String object with a character array.

Sample Output:

The book contains 234 pages.
```java
// Define a public class named Exercise11.
public class Exercise11 {
    // Define the main method.
    public static void main(String[] args) {
        // Character array with data.
        char[] arr_num = new char[] { '1', '2', '3', '4' };

        // Create a String containing the contents of arr_num
        // starting at index 1 for length 3.
        String str = String.copyValueOf(arr_num, 1, 3);

        // Display the results of the new String.
        System.out.println("\nThe book contains " + str + " pages.\n");
    }
}
```
Sample Output:

The book contains 234 pages.
### 12. Write a Java program to check whether a given string ends with another string.

Sample Output:

"Python Exercises" ends with "se"? false                                                                      
"Python Exercise" ends with "se"? true
```java
// Define a public class named Exercise12.
public class Exercise12 {
    // Define the main method.
    public static void main(String[] args) {
        // Declare and initialize two string variables, str1 and str2.
        String str1 = "Python Exercises";
        String str2 = "Python Exercise";

        // The String to check the above two Strings to see
        // if they end with this value (se).
        String end_str = "se";

        // Check if the first string ends with end_str.
        boolean ends1 = str1.endsWith(end_str);
        
        // Check if the second string ends with end_str.
        boolean ends2 = str2.endsWith(end_str);

        // Display the results of the endsWith calls.
        System.out.println("\"" + str1 + "\" ends with " +
            "\"" + end_str + "\"? " + ends1);
        System.out.println("\"" + str2 + "\" ends with " +
            "\"" + end_str + "\"? " + ends2);
    }
}
```
Sample Output:

"Python Exercises" ends with "se"? false                                                                      
"Python Exercise" ends with "se"? true
### 13. Write a Java program to check whether two String objects contain the same data.

Sample Output:

"Stephen Edwin King" equals "Walter Winchell"? false                                                          
"Stephen Edwin King" equals "Mike Royko"? false
```java
// Define a public class named Exercise13.
public class Exercise13 {
    // Define the main method.
    public static void main(String[] args) {
        // Declare and initialize three string variables.
        String columnist1 = "Stephen Edwin King";
        String columnist2 = "Walter Winchell";
        String columnist3 = "Mike Royko";

        // Check if columnist1 is equal to columnist2.
        boolean equals1 = columnist1.equals(columnist2);
        
        // Check if columnist1 is equal to columnist3.
        boolean equals2 = columnist1.equals(columnist3);

        // Display the results of the equality checks.
        System.out.println("\"" + columnist1 + "\" equals \"" +
            columnist2 + "\"? " + equals1);
        System.out.println("\"" + columnist1 + "\" equals \"" +
            columnist3 + "\"? " + equals2);
    }
}
```
Sample Output:

"Stephen Edwin King" equals "Walter Winchell"? false                                                          
"Stephen Edwin King" equals "Mike Royko"? false
### 14. Write a Java program to compare a given string to another string, ignoring case considerations.

Sample Output:

"Stephen Edwin King" equals "Walter Winchell"? false                                                          
"Stephen Edwin King" equals "stephen edwin king"? true 
```java
// Define a public class named Exercise14.
public class Exercise14 {
    // Define the main method.
    public static void main(String[] args) {
        // Declare and initialize three string variables.
        String columnist1 = "Stephen Edwin King";
        String columnist2 = "Walter Winchell";
        String columnist3 = "stephen edwin king";

        // Test if columnist1 is equal to columnist2 ignoring case.
        boolean equals1 = columnist1.equalsIgnoreCase(columnist2);
        
        // Test if columnist1 is equal to columnist3 ignoring case.
        boolean equals2 = columnist1.equalsIgnoreCase(columnist3);

        // Display the results of the equality checks.
        System.out.println("\"" + columnist1 + "\" equals \"" +
            columnist2 + "\"? " + equals1);
        System.out.println("\"" + columnist1 + "\" equals \"" +
            columnist3 + "\"? " + equals2);
    }
}
```
Sample Output:

"Stephen Edwin King" equals "Walter Winchell"? false                                                          
"Stephen Edwin King" equals "stephen edwin king"? true 
### 15. Write a Java program to print the current date and time in the specified format.

Sample Output:

Current Date and Time :                                                                                       
June 19, 2017                                                                                                 
3:13 pm 
N.B. : The current date and time will change according to your system date and time.
```java
// Import the Calendar class from the java.util package.
import java.util.Calendar;

// Define a public class named Exercise15.
public class Exercise15 {
    // Define the main method.
    public static void main(String[] args) {
        // Get an instance of the Calendar class representing the current date and time.
        Calendar c = Calendar.getInstance();
        
        // Print the message indicating current date and time.
        System.out.println("Current Date and Time :");

        // Print the formatted date (month day, year) using the specified format.
        System.out.format("%tB %te, %tY%n", c, c, c);
        
        // Print the formatted time (hour:minute am/pm) using the specified format.
        System.out.format("%tl:%tM %tp%n", c, c, c); 
    }
}
```
Sample Output:

Current Date and Time :                                                                                       
June 19, 2017                                                                                                 
3:13 pm 

### 16. Write a Java program to get the contents of a given string as a byte array.

Sample Output:

The new String equals This is a sample String.
```java
// Import the Calendar class from the java.util package.
import java.util.Calendar;

// Define a public class named Exercise16.
public class Exercise16 {
    // Define the main method.
    public static void main(String[] args) {
        // Declare and initialize a string variable.
        String str = "This is a sample String.";

        // Copy the contents of the string to a byte array.
        byte[] byte_arr = str.getBytes();

        // Create a new string using the contents of the byte array.
        String new_str = new String(byte_arr);

        // Display the contents of the byte array.
        System.out.println("\nThe new String equals " +
            new_str + "\n");
    }
}
```
Sample Output:

The new String equals This is a sample String.
### 17. Write a Java program to get the contents of a given string as a character array.

Sample Output:

The char array equals "[C@2a139a55"
```java
// Define a public class named Exercise17.
public class Exercise17 {
    // Define the main method.
    public static void main(String[] args) {
        // Declare and initialize a string variable.
        String str = "This is a sample string.";

        // Create a character array to hold copied characters.
        // Copy characters 4 through 10 from the 'str' string to the 'arr' array.
        // Start filling the 'arr' array from position 2.
        char[] arr = new char[] { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };
        str.getChars(4, 10, arr, 2);

        // Display the contents of the character array.
        System.out.println("The char array equals \"" +
            arr + "\"");
    }
}
```
Sample Output:

The char array equals "[C@2a139a55"
### 18. Write a Java program to create a distinct identifier for a given string.

Sample Output:
```java
The hash for Python Exercises. is 863132599 
// Define a public class named Exercise18.
public class Exercise18 {
    // Define the main method.
    public static void main(String[] args) {
        // Declare and initialize a string variable.
        String str = "Python Exercises.";

        // Get the hash code for the string.
        int hash_code = str.hashCode();

        // Display the hash code.
        System.out.println("The hash for " + str +
            " is " + hash_code);
    }
}
```
Sample Output:

The hash for Python Exercises. is 863132599 

### 19. Write a Java program to get the index of all the characters of the alphabet.

Sample Output:

a  b c  d e  f  g h i  j                                                                                     
=========================                                                                                     
36 10 7 40 2 16 42 1 6 20                                                                                     
                                                                                                   
k  l  m  n  o  p q  r  s  t                                                                                   
===========================                                                                                   
8 35 22 14 12 23 4 11 24 31                                                                                   

u  v  w  x  y  z                                                                                              
================                                                                                              
5 27 13 18 38 37

Sample string of all alphabet: "The quick brown fox jumps over the lazy dog."
```java
// Define a public class named Exercise19.
public class Exercise19 {
    // Define the main method.
    public static void main(String[] args) {
        // Declare and initialize a string variable.
        String str = "The quick brown fox jumps over the lazy dog.";

        // Get the index of all the characters of the alphabet
        // starting from the beginning of the String.
        int a = str.indexOf("a", 0);
        int b = str.indexOf("b", 0);
        int c = str.indexOf("c", 0);
        int d = str.indexOf("d", 0);
        int e = str.indexOf("e", 0);
        int f = str.indexOf("f", 0);
        int g = str.indexOf("g", 0);
        int h = str.indexOf("h", 0);
        int i = str.indexOf("i", 0);
        int j = str.indexOf("j", 0);
        int k = str.indexOf("k", 0);
        int l = str.indexOf("l", 0);
        int m = str.indexOf("m", 0);
        int n = str.indexOf("n", 0);
        int o = str.indexOf("o", 0);
        int p = str.indexOf("p", 0);
        int q = str.indexOf("q", 0);
        int r = str.indexOf("r", 0);
        int s = str.indexOf("s", 0);
        int t = str.indexOf("t", 0);
        int u = str.indexOf("u", 0);
        int v = str.indexOf("v", 0);
        int w = str.indexOf("w", 0);
        int x = str.indexOf("x", 0);
        int y = str.indexOf("y", 0);
        int z = str.indexOf("z", 0);

        // Display the results of all the indexOf method calls.
        System.out.println(" a  b c  d e  f  g h i  j");
        System.out.println("=========================");
        System.out.println(a + " " + b + " " + c + " " + d + " " +
                           e + " " + f + " " + g + " " + h + " " +
                           i + " " + j + "\n");

        System.out.println("k  l  m  n  o  p q  r  s  t");
        System.out.println("===========================");
        System.out.println(k + " " + l + " " + m + " " + n + " " +
                           o + " " + p + " " + q + " " + r + " " +
                           s + " " + t + "\n");

        System.out.println("u  v  w  x  y  z");
        System.out.println("================");
        System.out.println(u + " " + v + " " + w + " " + x + " " +
                           y + " " + z);
    }
}
```
Sample Output:

a  b c  d e  f  g h i  j                                                                                     
=========================                                                                                     
36 10 7 40 2 16 42 1 6 20                                                                                     
                                                                                                   
k  l  m  n  o  p q  r  s  t                                                                                   
===========================                                                                                   
8 35 22 14 12 23 4 11 24 31                                                                                   

u  v  w  x  y  z                                                                                              
================                                                                                              
5 27 13 18 38 37

### 20. Write a Java program to get the Canonical representation of the string object.

Sample Output:

str1 == str2? false                                                                                           
str1 == str3? true
```java
// Define a public class named Exercise20.
public class Exercise20 {
    // Define the main method.
    public static void main(String[] args) {
        // Create three strings in three different ways.
        String str1 = "Java Exercises"; // Creating a string using string literal
        String str2 = new StringBuffer("Java").append(" Exercises").toString(); // Creating a string using StringBuffer and converting it to string
        String str3 = str2.intern(); // Creating a string by interning str2

        // Determine which strings are equivalent using the ==
        // operator (as compared to calling equals(), which is
        // a more expensive operation.
        System.out.println("str1 == str2? " + (str1 == str2)); // Checking if str1 and str2 reference the same object
        System.out.println("str1 == str3? " + (str1 == str3)); // Checking if str1 and str3 reference the same object
    }
}
```
Sample Output:

str1 == str2? false                                                                                           
str1 == str3? true
### 21. Write a Java program to get the last index of a string within a string.

Sample Output:

 a  b c  d  e  f  g  h i  j                                                                                   
===========================                                                                                   
36 10 7 40 33 16 42 32 6 20                                                                                   
                                                                                                              
k  l  m  n  o  p q  r  s  t                                                                                   
===========================                                                                                   
8 35 22 14 41 23 4 29 24 31                                                                                   
                                                                                                              
 u  v  w  x  y  z                                                                                             
=================                                                                                             
21 27 13 18 38 37
Sample string of all alphabet: "The quick brown fox jumps over the lazy dog."
```java
// Define a public class named Exercise21.
public class Exercise21 {
    // Define the main method.
    public static void main(String[] args) {
        // Declare and initialize a string variable.
        String str = "The quick brown fox jumps over the lazy dog.";

        // Get the index of all the characters of the alphabet
        // starting from the end of the String towards the beginning.
        int a = str.lastIndexOf("a", str.length() - 1);
        int b = str.lastIndexOf("b", str.length() - 1);
        int c = str.lastIndexOf("c", str.length() - 1);
        int d = str.lastIndexOf("d", str.length() - 1);
        int e = str.lastIndexOf("e", str.length() - 1);
        int f = str.lastIndexOf("f", str.length() - 1);
        int g = str.lastIndexOf("g", str.length() - 1);
        int h = str.lastIndexOf("h", str.length() - 1);
        int i = str.lastIndexOf("i", str.length() - 1);
        int j = str.lastIndexOf("j", str.length() - 1);
        int k = str.lastIndexOf("k", str.length() - 1);
        int l = str.lastIndexOf("l", str.length() - 1);
        int m = str.lastIndexOf("m", str.length() - 1);
        int n = str.lastIndexOf("n", str.length() - 1);
        int o = str.lastIndexOf("o", str.length() - 1);
        int p = str.lastIndexOf("p", str.length() - 1);
        int q = str.lastIndexOf("q", str.length() - 1);
        int r = str.lastIndexOf("r", str.length() - 1);
        int s = str.lastIndexOf("s", str.length() - 1);
        int t = str.lastIndexOf("t", str.length() - 1);
        int u = str.lastIndexOf("u", str.length() - 1);
        int v = str.lastIndexOf("v", str.length() - 1);
        int w = str.lastIndexOf("w", str.length() - 1);
        int x = str.lastIndexOf("x", str.length() - 1);
        int y = str.lastIndexOf("y", str.length() - 1);
        int z = str.lastIndexOf("z", str.length() - 1);

        // Display the results of all the lastIndexOf method calls.
        System.out.println(" a  b c  d  e  f  g  h i  j");
        System.out.println("===========================");
        System.out.println(a + " " + b + " " + c + " " + d + " " +
                           e + " " + f + " " + g + " " + h + " " +
                           i + " " + j + "\n");

        System.out.println("k  l  m  n  o  p q  r  s  t");
        System.out.println("===========================");
        System.out.println(k + " " + l + " " + m + " " + n + " " +
                           o + " " + p + " " + q + " " + r + " " +
                           s + " " + t + "\n");

        System.out.println(" u  v  w  x  y  z");
        System.out.println("=================");
        System.out.println(u + " " + v + " " + w + " " + x + " " +
                           y + " " + z);
    }
}
```
Sample Output:

 a  b c  d  e  f  g  h i  j                                                                                   
===========================                                                                                   
36 10 7 40 33 16 42 32 6 20                                                                                   
                                                                                                              
k  l  m  n  o  p q  r  s  t                                                                                   
===========================                                                                                   
8 35 22 14 41 23 4 29 24 31                                                                                   
                                                                                                              
 u  v  w  x  y  z                                                                                             
=================                                                                                             
21 27 13 18 38 37

### 22. Write a Java program to get the length of a given string.

Sample Output:

The string length of 'example.com' is: 11
```java
// Define a public class named Exercise22.
public class Exercise22 {
    // Define the main method.
    public static void main(String[] args) {
        // Declare and initialize a string variable.
        String str = "example.com";
        
        // Get the length of the string 'str'.
        int len = str.length();
        
        // Display the length of the string.
        System.out.println("The string length of '" + str + "' is: " + len);
    }
}
```
Sample Output:

The string length of 'example.com' is: 11
### 23. Write a Java program to find out whether a region in the current string matches a region in another string.

Sample Output:

str1[0 - 7] == str2[28 - 35]? true                                                                            
str1[9 - 15] == str2[9 - 15]? false 
```java
// Define a public class named Exercise23.
public class Exercise23 {
  
    // Define the main method.
    public static void main(String[] args) {
        
        // Define two string variables.
        String str1 = "Shanghai Houston Colorado Alexandria";
        String str2 = "Alexandria Colorado Houston Shanghai";

        // Determine whether characters 0 through 7 in str1 
        // match characters 28 through 35 in str2.
        boolean match1 = str1.regionMatches(0, str2, 28, 8);

        // Determine whether characters 9 through 15 in str1 
        // match characters 9 through 15 in str2.
        boolean match2 = str1.regionMatches(9, str2, 9, 8);

        // Display the results of the regionMatches method calls.
        System.out.println("str1[0 - 7] == str2[28 - 35]? " + match1);
        System.out.println("str1[9 - 15] == str2[9 - 15]? " + match2);
    }
}
```
Sample Output:

str1[0 - 7] == str2[28 - 35]? true                                                                            
str1[9 - 15] == str2[9 - 15]? false 
### 24. Write a Java program to replace a specified character with another character.

Sample Output:

Original string: The quick brown fox jumps over the lazy dog.                                                 
New String: The quick brown fox jumps over the lazy fog.
```java
// Define a public class named Exercise24.
public class Exercise24 {
    
    // Define the main method.
    public static void main(String[] args) {
        // Declare and initialize a string variable.
        String str = "The quick brown fox jumps over the lazy dog.";

        // Replace all the 'd' characters with 'f' characters.
        String new_str = str.replace('d', 'f');

        // Display the original and modified strings for comparison.
        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str);
    }
}
```
Sample Output:

Original string: The quick brown fox jumps over the lazy dog.                                                 
New String: The quick brown fox jumps over the lazy fog.
### 25. Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement.

Sample string : "The quick brown fox jumps over the lazy dog."

In the above string replace all the fox with cat.

Sample Output:

Original string: The quick brown fox jumps over the lazy dog.                                                 
New String: The quick brown cat jumps over the lazy dog.         
```java
// Define a public class named Exercise25.
public class Exercise25 {
    
    // Define the main method.
    public static void main(String[] args) {
        // Declare and initialize a string variable.
        String str = "The quick brown fox jumps over the lazy dog.";

        // Replace all occurrences of 'fox' with 'cat'.
        String new_str = str.replaceAll("fox", "cat");
       
        // Display the original and modified strings for comparison.
        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str);
    }
}
```
Sample Output:

Original string: The quick brown fox jumps over the lazy dog.                                                 
New String: The quick brown cat jumps over the lazy dog.
### 26. Write a Java program to check whether a given string starts with another string.

Sample Output:

Red is favorite color. starts with Red? true                                                                  
Orange is also my favorite color. starts with Red? false
```java
// Define a public class named Exercise26.
public class Exercise26 {
    
    // Define the main method.
    public static void main(String[] args) {
        // Declare and initialize two string variables.
        String str1 = "Red is favorite color.";
        String str2 = "Orange is also my favorite color.";

        // The String to check the above two Strings to see
        // if they start with this value (Red).
        String startStr = "Red";

        // Check if the first two Strings start with startStr.
        boolean starts1 = str1.startsWith(startStr);
        boolean starts2 = str2.startsWith(startStr);

        // Display the results of the startsWith calls.
        System.out.println(str1 + " starts with " +
             startStr + "? " + starts1);
        System.out.println(str2 + " starts with " +
             startStr + "? " + starts2);
    }
}
```
Sample Output:

Red is favorite color. starts with Red? true                                                                  
Orange is also my favorite color. starts with Red? false
### 27. Write a Java program to get a substring of a given string at two specified positions.

Sample Output:

old = The quick brown fox jumps over the lazy dog.                                                            
new = brown fox jumps
```java
// Define a public class named Exercise27.
public class Exercise27 {
    
    // Define the main method.
    public static void main(String[] args) {
        // Declare and initialize a string variable.
        String str = "The quick brown fox jumps over the lazy dog.";

        // Get a substring of the above string starting from
        // index 10 and ending at index 26.
        String new_str = str.substring(10, 26);

        // Display the original and the extracted substring for comparison.
        System.out.println("old = " + str);
        System.out.println("new = " + new_str);
    }
}
```
Sample Output:

old = The quick brown fox jumps over the lazy dog.                                                            
new = brown fox jumps
### 28. Write a Java program to create a character array containing a string.

Sample Output:

Java Exercises.
```java
// Define a public class named Exercise28.
public class Exercise28 {
    
    // Define the main method.
    public static void main(String[] args) {
        // Declare and initialize a string variable.
        String str = "Java Exercises.";

        // Convert the above string to a char array.
        char[] arr = str.toCharArray();

        // Display the contents of the char array.
        System.out.println(arr);
    }
}
```
Sample Output:

Java Exercises.
### 29. Write a Java program to convert all characters in a string to lowercase.

Sample Output:

Original String: The Quick BroWn FoX!                                                                         
String in lowercase: the quick brown fox!
```java
// Define a public class named Exercise29.
public class Exercise29 {
    
    // Define the main method.
    public static void main(String[] args) {
        // Declare and initialize a string variable.
        String str = "The Quick BroWn FoX!";

        // Convert the above string to all lowercase.
        String lowerStr = str.toLowerCase();

        // Display the original and lowercase strings for comparison.
        System.out.println("Original String: " + str);
        System.out.println("String in lowercase: " + lowerStr);
    }
}
```
Sample Output:

Original String: The Quick BroWn FoX!                                                                         
String in lowercase: the quick brown fox!
### 30. Write a Java program to convert all characters in a string to uppercase.

Sample Output:

Original String: The Quick BroWn FoX!                                                                         
String in uppercase: THE QUICK BROWN FOX!  
```java
// Define a public class named Exercise30.
public class Exercise30 {
    
    // Define the main method.
    public static void main(String[] args) {
        // Declare and initialize a string variable.
        String str = "The Quick BroWn FoX!";

        // Convert the above string to all uppercase.
        String upper_str = str.toUpperCase();

        // Display the original and uppercase strings for comparison.
        System.out.println("Original String: " + str);
        System.out.println("String in uppercase: " + upper_str);
    }
}
```
Sample Output:

Original String: The Quick BroWn FoX!                                                                         
String in uppercase: THE QUICK BROWN FOX! 
### 31. Write a Java program to trim leading or trailing whitespace from a given string.

Sample Output:

Original String:  Java Exercises                                                                              
New String: Java Exercises
```java
// Define a public class named Exercise31.
public class Exercise31 {

    // Define the main method.
    public static void main(String[] args) {
        // Declare and initialize a string variable.
        String str = " Java Exercises ";

        // Trim the whitespace from the front and back of the String.
        String new_str = str.trim();

        // Display the original and trimmed strings for comparison.
        System.out.println("Original String: " + str);
        System.out.println("New String: " + new_str);
    }
}
```
Sample Output:

Original String:  Java Exercises                                                                              
New String: Java Exercises
### 32. Write a Java program to find the longest Palindromic Substring within a string.

Sample Output:

The given string is: thequickbrownfoxxofnworbquickthe
The longest palindrome substring in the giv
en string is; brownfoxxofnworb
The length of the palindromic substring is: 16
```java
// Import the necessary Java utilities.
import java.util.*;

// Define a public class named Main.
public class Main {

    // Define a method to print the substring given start and end indices.
    static void printSubStr(String str1, int l, int h) {
        System.out.println(str1.substring(l, h + 1));
    }

    // Define a method to find the longest palindromic substring.
    static int longPalSubstr(String str1) {
        int n = str1.length();
        boolean table[][] = new boolean[n][n];
        int mLength = 1;

        // Fill the diagonal elements as true.
        for (int i = 0; i < n; ++i)
            table[i][i] = true;

        int strt = 0;

        // Check for palindromes of length 2.
        for (int i = 0; i < n - 1; ++i) {
            if (str1.charAt(i) == str1.charAt(i + 1)) {
                table[i][i + 1] = true;
                strt = i;
                mLength = 2;
            }
        }

        // Check for palindromes of length greater than 2.
        for (int k = 3; k <= n; ++k) {
            for (int i = 0; i < n - k + 1; ++i) {
                int j = i + k - 1;
                if (table[i + 1][j - 1] && str1.charAt(i) == str1.charAt(j)) {
                    table[i][j] = true;

                    if (k > mLength) {
                        strt = i;
                        mLength = k;
                    }
                }
            }
        }

        // Print the longest palindromic substring.
        System.out.print("The longest palindrome substring in the given string is: ");
        printSubStr(str1, strt, strt + mLength - 1);
        return mLength;
    }

    // The main method to execute the code.
    public static void main(String[] args) {
        // Define the input string.
        String str1 = "thequickbrownfoxxofnworbquickthe";

        // Print the given string.
        System.out.println("The given string is: " + str1);

        // Find and print the length of the longest palindromic substring.
        System.out.println("The length of the palindromic substring is: " + longPalSubstr(str1));
    }
}
```
Sample Output:

The given string is: thequickbrownfoxxofnworbquickthe
The longest palindrome substring in the giv
en string is; brownfoxxofnworb
The length of the palindromic substring is: 16
### 33. Write a Java program to find all interleavings of given strings.

Sample Output:

The given strings are: WX  YZ
The interleavings strings are: 
YWZX
WYZX
YWXZ
WXYZ
YZWX
WYXZ
```java
// Import necessary Java utilities.
import java.util.HashSet;
import java.util.Set;

// Define a class named Main.
class Main {
    
    // Define a method to find all interleavings of two strings.
    public static void allInterleavings(String res, String P, String Q, Set out) {
        // If both strings are empty, add the result to the output set.
        if (P.length() == 0 && Q.length() == 0) {
            out.add(res);
            return;
        }
        
        // If string P is not empty, recursively call allInterleavings with the first character of P removed.
        if (P.length() > 0) {
            allInterleavings(res + P.charAt(0), P.substring(1), Q, out);
        }
        
        // If string Q is not empty, recursively call allInterleavings with the first character of Q removed.
        if (Q.length() > 0) {
            allInterleavings(res + Q.charAt(0), P, Q.substring(1), out);
        }
    }

    // The main method to execute the code.
    public static void main(String[] args) {
        // Define the input strings.
        String P = "WX";
        String Q = "YZ";

        // Print the given strings.
        System.out.println("The given strings are: " + P + "  " + Q);
        System.out.println("The interleavings strings are: ");

        // Create a HashSet to store unique interleavings.
        Set<String> out = new HashSet<>();

        // Call the allInterleavings method to generate interleavings of the input strings.
        allInterleavings("", P, Q, out);

        // Print all the generated interleavings using streams.
        out.stream().forEach(System.out::println);
    }
}
```
Sample Output:

The given strings are: WX  YZ
The interleavings strings are: 
YWZX
WYZX
YWXZ
WXYZ
YZWX
WYXZ
### 34. Write a Java program to find the second most frequent character in a given string.

Sample Output:

The given string is: successes
The second most frequent char in the string is: c
```java
// Import necessary Java utilities.
import java.util.*;

// Define a class named Main.
public class Main {
    // Define a constant representing the number of characters (ASCII).
    static final int NOOFCHARS = 256;

    // Define a method to find the second most frequent character in a string.
    static char get2ndMostFreq(String str1) {
        // Create an array to count occurrences of each character in the string.
        int[] ctr = new int[NOOFCHARS];
        int i;

        // Count occurrences of each character in the string.
        for (i = 0; i < str1.length(); i++) {
            (ctr[str1.charAt(i)])++;
        }

        // Variables to store indices of the first and second most frequent characters.
        int ctr_first = 0, ctr_second = 0;
        for (i = 0; i < NOOFCHARS; i++) {
            if (ctr[i] > ctr[ctr_first]) {
                ctr_second = ctr_first;
                ctr_first = i;
            } else if (ctr[i] > ctr[ctr_second] && ctr[i] != ctr[ctr_first]) {
                ctr_second = i;
            }
        }

        // Return the second most frequent character.
        return (char) ctr_second;
    }

    // The main method to execute the code.
    public static void main(String args[]) {
        // Define the input string.
        String str1 = "successes";
        System.out.println("The given string is: " + str1);

        // Get the second most frequent character from the input string.
        char res = get2ndMostFreq(str1);

        // Display the result.
        if (res != '\0') {
            System.out.println("The second most frequent char in the string is: " + res);
        } else {
            System.out.println("No second most frequent character found in the string.");
        }
    }
}
```
Sample Output:

The given string is: successes
The second most frequent char in the string is: c
### 35. Write a Java program to print all permutations of a given string with repetition.

Sample Output:

The given string is: PQR
The permuted strings are:
PPP
PPQ
PPR
...
RRP
RRQ
RRR
```java
// Import necessary Java utilities.
import java.util.*;

// Define a class named Main.
public class Main {

    // The main method to start the execution of the program.
    public static void main(String[] args) {
        // Call the permutationWithRepeation method with the given string "PQR".
        permutationWithRepeation("PQR");
    }

    // Method to find permutations with repetition of characters.
    private static void permutationWithRepeation(String str1) {
        // Print the given string.
        System.out.println("The given string is: PQR");
        // Print the message for the permuted strings.
        System.out.println("The permuted strings are:");
        // Call the showPermutation method to display the permutations.
        showPermutation(str1, "");
    }

    // Recursive method to generate and display permutations.
    private static void showPermutation(String str1, String newStringToPrint) {
        // If the length of the new string equals the length of the original string, print the new string.
        if (newStringToPrint.length() == str1.length()) {
            System.out.println(newStringToPrint);
            return;
        }

        // Iterate through the characters of the original string.
        for (int i = 0; i < str1.length(); i++) {
            // Recursively call showPermutation to append characters and generate permutations.
            showPermutation(str1, newStringToPrint + str1.charAt(i));
        }
    }
}
```
Sample Output:

The given string is: PQR
The permuted strings are:
PPP
PPQ
PPR
PQP
PQQ
PQR
PRP
PRQ
PRR
QPP
QPQ
QPR
QQP
QQQ
QQR
QRP
QRQ
QRR
RPP
RPQ
RPR
RQP
RQQ
RQR
RRP
RRQ
RRR
### 36. Write a Java program to check whether two strings interlive of a given string. Assuming that unique characters are present in both strings.

Sample Output:

The given string is: PMQNO
The interleaving strings are MNO and PQ
The given string is interleaving: true

The given string is: PNQMO
The interleaving strings are MNO and PQ
The given string is interleaving: false
```java
// Import necessary Java utilities.
import java.util.*;

// Define a class named Main.
public class Main {
    
    // The main method to start the execution of the program.
    public static void main(String args[]) {
        // Define three strings.
        String str1 = "MNO";
        String str2 = "PQ";
        String str3 = "PMQNO";
        
        // Print the given string and interleaving strings.
        System.out.println("The given string is: " + str3);
        System.out.println("The interleaving strings are " + str1 + " and " + str2);
        
        // Check if the given string is interleaving of str1 and str2, then print the result.
        System.out.println("The given string is interleaving: " + checkInterleaved(str1, str2, str3));
    }
    
    // Method to check if a string is interleaving of two other strings.
    private static boolean checkInterleaved(String str1, String str2, String CheckInString) {
        int i = 0, j = 0, k = 0;
        
        // If the length of concatenated str1 and str2 doesn't match the length of the checked string, return false.
        if (str1.length() + str2.length() != CheckInString.length()) {
            return false;
        }
        
        // Loop through the checked string.
        while (k < CheckInString.length()) {
            // Check if character at index i in str1 matches with character at index k in CheckInString.
            if (i < str1.length() && str1.charAt(i) == CheckInString.charAt(k)) {
                i++;
            }
            // Check if character at index j in str2 matches with character at index k in CheckInString.
            else if (j < str2.length() && str2.charAt(j) == CheckInString.charAt(k)) {
                j++;
            } else {
                return false;
            }
            k++;
        }
        
        // If lengths of str1, str2, and CheckInString don't match, return false.
        if (!(i == str1.length() && j == str2.length() && k == CheckInString.length())) {
            return false;
        }
        
        return true;
    }
}
```
Sample Output:

The given string is: PMQNO
The interleaving strings are MNO and PQ
The given string is interleaving: true

The given string is: PNQMO
The interleaving strings are MNO and PQ
The given string is interleaving: false
### 37. Write a Java program to find the length of the longest substring of a given string without repeating characters.

Sample Output:

Input String : pickoutthelongestsubstring
The longest substring : [u, b, s, t, r, i, n, g]
The longest Substring Length : 8
```java
import java.util.LinkedHashMap;
public class Main {
    // Method to find the longest substring with non-repeating characters
    static void longestSubstring(String inputString) {
        // Convert the inputString to a character array
        char[] arr1 = inputString.toCharArray();
        // Initialize variables to store the longest substring and its length
        String longestSubstring = "";
        int maxLength = 0;
        // Create a LinkedHashMap to store characters and their positions
        LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<>();
        // Loop through the character array
        for (int i = 0; i < arr1.length; i++) {
            char ch = arr1[i];
            // Check if the character is not already present in the charPosMap
            if (!charPosMap.containsKey(ch)) {
                // If not present, add the character and its position to the map
                charPosMap.put(ch, i);
            } else {
                // If the character is present, update the start position of the substring
                // to the position after the repeated character
                i = charPosMap.get(ch);
                // Clear the map to start anew for the next non-repeating substring
                charPosMap.clear();
            }
            // Check if the current substring length is greater than the stored length
            if (charPosMap.size() > maxLength) {
                // If yes, update the longest substring and its length
                maxLength = charPosMap.size();
                // Extract the substring from the inputString using start and end indices
                longestSubstring = inputString.substring(i - maxLength + 1, i + 1);
            }
        }
        // Print the original inputString, the longest substring found, and its length
        System.out.println("Input String: " + inputString);
        System.out.println("The longest substring: " + longestSubstring);
        System.out.println("The longest Substring Length: " + maxLength);
    }
    // Main method to execute the program
    public static void main(String[] args) {
        // Call the longestSubstring method with different input strings
        longestSubstring("pickoutthelongestsubstring");
        longestSubstring("ppppppppppppp");
        longestSubstring("Microsoft");
    }
}
```
Sample Output:

Input String: pickoutthelongestsubstring
The longest substring: ubstring
The longest Substring Length: 8
Input String: ppppppppppppp
The longest substring: p
The longest Substring Length: 1
Input String: Microsoft
The longest substring: Micros
The longest Substring Length: 6
### 38. Write a Java program to print the result of removing duplicates from a given string.

Sample Output:

The given string is: w3resource
After removing duplicates characters the new string is: w3resouc
```java
// Importing necessary Java utilities.
import java.util.*;

// Define a class named Main.
public class Main {
    
    // Main method to execute the program.
    public static void main(String[] args) {
        // Declare and initialize a string variable.
        String str1 = "w3resource";
        
        // Print the original string.
        System.out.println("The given string is: " + str1);
        
        // Print the new string after removing duplicate characters.
        System.out.println("After removing duplicates characters the new string is: " + removeDuplicateChars(str1));
    }
    
    // Method to remove duplicate characters from a string.
    private static String removeDuplicateChars(String sourceStr) {
        // Convert the input string to a character array.
        char[] arr1 = sourceStr.toCharArray();
        
        // Initialize an empty string to store the resulting string without duplicates.
        String targetStr = "";
        
        // Loop through each character in the character array.
        for (char value: arr1) {
            // Check if the character doesn't exist in the targetStr.
            if (targetStr.indexOf(value) == -1) {
                // If the character doesn't exist, add it to the targetStr.
                targetStr += value;
            }
        }
        
        // Return the resulting string without duplicates.
        return targetStr;
    }
}
```
Sample Output:

The given string is: w3resource
After removing duplicates characters the new string is: w3resouc
### 39. Write a Java program to find the first non-repeating character in a string.

Sample Output:

The given string is: gibblegabbler
The first non repeated character in String is: i
```java
// Importing necessary Java utilities.
import java.util.*;

// Define a class named Main.
public class Main {
    
    // Main method to execute the program.
    public static void main(String[] args) {
        // Declare and initialize a string variable.
        String str1 = "gibblegabbler";
        
        // Print the original string.
        System.out.println("The given string is: " + str1);
        
        // Loop through each character of the string.
        for (int i = 0; i < str1.length(); i++) {
            // Assume the character at index 'i' is unique initially.
            boolean unique = true;
            
            // Loop through the string again to compare characters.
            for (int j = 0; j < str1.length(); j++) {
                // Check if the characters at positions 'i' and 'j' are the same but not at the same index.
                if (i != j && str1.charAt(i) == str1.charAt(j)) {
                    // If found, set unique to false and break the loop.
                    unique = false;
                    break;
                }
            }
            
            // If the character at index 'i' is unique, print it and exit the loop.
            if (unique) {
                System.out.println("The first non-repeated character in the String is: " + str1.charAt(i));
                break;
            }
        }
    }
}
```
Sample Output:

The given string is: gibblegabbler
The first non repeated character in String is: i
### 40. Write a Java program to divide a string into n equal parts.

Sample Output:

The given string is: abcdefghijklmnopqrstuvwxy
The string divided into 5 parts and they are: 

abcde
fghij
klmno
pqrst
uvwxy
```java
// Importing necessary Java utilities.
import java.util.*;

// Define a class named Main.
class Main {
    
    // Method to split the string into 'n' parts.
    static void splitString(String str1, int n) {
        // Get the length of the string.
        int str_size = str1.length();
        int part_size;
        
        // Check if the size of the string is divisible by 'n'.
        if (str_size % n != 0) {
            // If not divisible, print a message and return.
            System.out.println("The size of the given string is not divisible by " + n);
            return;
        } else {
            // If divisible, proceed to split the string.
            System.out.println("The given string is: " + str1);
            System.out.println("The string divided into " + n + " parts and they are: ");
            
            // Calculate the size of each part.
            part_size = str_size / n;
            
            // Loop through the string characters.
            for (int i = 0; i < str_size; i++) {
                // If the current index is a multiple of 'part_size', start a new line.
                if (i % part_size == 0)
                    System.out.println();
                // Print the character at the current index.
                System.out.print(str1.charAt(i));
            }
        }
    }
    
    // Main method to execute the program.
    public static void main(String[] args) {
        // Define a string and the number of parts to split.
        String str1 = "abcdefghijklmnopqrstuvwxy";
        int split_number = 5;
        
        // Call the method to split the string.
        splitString(str1, split_number);
    }
}
```
Sample Output:

The given string is: abcdefghijklmnopqrstuvwxy
The string divided into 5 parts and they are: 

abcde
fghij
klmno
pqrst
uvwxy
### 41. Write a Java program to remove duplicate characters from a given string that appear in another given string.

Sample Output:

The given string is: the quick brown fox
The given mask string is: queen

The new string is: 
th ick brow fox
```java
// Importing necessary Java utilities.
import java.util.*;

// Define a class named Main.
public class Main {
    
    // Main method to execute the program.
    public static void main(String[] args) {
        // Define two strings.
        String str1 = "the quick brown fox";
        String str2 = "queen";
        
        // Print the given strings.
        System.out.println("The given string is: " + str1);
        System.out.println("The given mask string is: " + str2);
        
        // Create a character array of the length of the first string.
        char arr[] = new char[str1.length()];
        
        // Create a character array to represent a mask of size 256 (ASCII characters).
        char[] mask = new char[256];
        
        // Loop through the characters of the mask string and count occurrences of each character.
        for (int i = 0; i < str2.length(); i++)
            mask[str2.charAt(i)]++;
        
        // Print a header for the new string.
        System.out.println("\nThe new string is: ");
        
        // Loop through the characters of the first string.
        for (int i = 0; i < str1.length(); i++) {
            // If the character at the current index in str1 is not found in str2 (mask is 0), print it.
            if (mask[str1.charAt(i)] == 0)
                System.out.print(str1.charAt(i));
        }
    }
}
```
Sample Output:

The given string is: the quick brown fox
The given mask string is: queen

The new string is: 
th ick brow fox
### 42. Write a Java program to print a list of items containing all characters of a given word.

Sample Output:

The given strings are: rabbit   bribe   dog   
The given word is: bib 

The strings containing all the letters of the given word are: 
rabbit
bribe
```java
// Importing necessary Java utilities.
import java.util.*;

// Define a class named Main.
class Main {
    
    // Define a method to check if a given string contains all the letters of another string.
    static void checkExistance(String str1, String str_to_search) {
        int chk = 0; // Variable to check existence.
        char chhr = ' '; // Character variable.
        int[] a = new int[Character.MAX_VALUE + 1]; // Array to store character counts.

        // Loop through each character of the first string and count occurrences.
        for (int i = 0; i < str1.length(); i++) {
            chhr = str1.charAt(i);
            ++a[chhr];
        }
        
        // Loop through each character of the string to search.
        for (int i = 0; i < str_to_search.length(); i++) {
            chhr = str_to_search.charAt(i);
            if (a[chhr] >= 1)
                chk = 1; // Set check flag if character exists in the first string.
        }
        
        // If check flag is set, print the first string.
        if (chk == 1)
            System.out.println(str1);
    }

    // Main method to execute the program.
    public static void main(String[] args) {
        // Create a list of strings.
        List < String > list = new ArrayList < String > ();
        list.add("rabbit");
        list.add("bribe");
        list.add("dog");

        // Print the given strings.
        System.out.print("The given strings are: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "   ");
        }
        
        // Print the given word.
        System.out.println("\nThe given word is: bib ");
        System.out.println("\nThe strings containing all the letters of the given word are: ");
        
        // Check each string in the list for the existence of letters from the given word.
        for (int j = 0; j < list.size(); j++) {
            checkExistance(list.get(j), "bib");
        }
    }
}
```
Sample Output:

The given strings are: rabbit   bribe   dog   
The given word is: bib 

The strings containing all the letters of the given word are: 
rabbit
bribe
### 43. Write a Java program to find the character in a string that occurs the most frequently.

Sample Output:

The given string is: test string
Max occurring character in the given string is: t
```java
// Importing necessary Java utilities.
import java.util.*;

// Define a class named Main.
public class Main {
    
    // Define a constant for the size of the character set.
    static final int N = 256;
    
    // Method to find the character with the maximum occurrence in the string.
    static char MaxOccuringChar(String str1) {
        int ctr[] = new int[N]; // Array to count occurrences of each character.
        int l = str1.length(); // Length of the given string.
        
        // Loop through the string to count occurrences of each character.
        for (int i = 0; i < l; i++)
            ctr[str1.charAt(i)]++;
        
        int max = -1; // Variable to store maximum occurrence.
        char result = ' '; // Variable to store the character with the maximum occurrence.

        // Loop through the string to find the character with the maximum occurrence.
        for (int i = 0; i < l; i++) {
            if (max < ctr[str1.charAt(i)]) {
                max = ctr[str1.charAt(i)];
                result = str1.charAt(i);
            }
        }

        return result; // Return the character with the maximum occurrence.
    }

    // Main method to execute the program.
    public static void main(String[] args) {
        String str1 = "test string"; // Given input string.
        
        // Display the given string.
        System.out.println("The given string is: " + str1);
        
        // Display the character with the maximum occurrence in the given string.
        System.out.println("Max occurring character in the given string is: " + MaxOccuringChar(str1));
    }
}
```
Sample Output:

The given string is: test string
Max occurring character in the given string is: t
### 44. Write a Java program to reverse a string using recursion.

Sample Output:

The given string is: The quick brown fox jumps
The string in reverse order is:
spmuj xof nworb kciuq ehT
```java
// Importing necessary Java utilities.
import java.util.*;

// Define a class named Main.
class Main {
    
    // Method to reverse a string recursively.
    void reverseString(String str1) {
        // Base case: if the string is null or has a length less than or equal to 1, print the string.
        if ((str1 == null) || (str1.length() <= 1))
            System.out.println(str1);
        else {
            // Print the last character of the string.
            System.out.print(str1.charAt(str1.length() - 1));
            
            // Recursive call to reverseString method by excluding the last character.
            reverseString(str1.substring(0, str1.length() - 1));
        }
    }
    
    // Main method to execute the program.
    public static void main(String[] args) {
        String str1 = "The quick brown fox jumps"; // Given input string.
        
        // Display the given string.
        System.out.println("The given string is: " + str1);
        
        // Display the string in reverse order.
        System.out.println("The string in reverse order is:");
        
        // Create an object of Main class to call the reverseString method.
        Main obj = new Main();
        obj.reverseString(str1);
    }
}
```
Sample Output:

The given string is: The quick brown fox jumps
The string in reverse order is:
spmuj xof nworb kciuq ehT
### 45. Write a Java program to reverse words in a given string.

Sample Output:

The given string is: Reverse words in a given string
The new string after reversed the words: string given a in words Reverse
```java
// Importing necessary Java utilities.
import java.util.*;

// Define a class named Main.
public class Main {
    
    // Method to reverse words in a given string.
    public static String WordsInReverse(String str1) {
        // Create a StringBuilder object and reverse the entire string.
        StringBuilder sb = new StringBuilder(str1);
        String StrRev = sb.reverse().toString();

        // Split the reversed string into words.
        String[] words = StrRev.split(" ");
        
        // Create a StringBuilder to store the reversed words.
        StringBuilder reverse = new StringBuilder();
        
        // Iterate through each word, reverse it, and append it to the result string.
        for (String tmp: words) {
            sb = new StringBuilder(tmp);
            reverse.append(sb.reverse() + " ");
        }
        
        // Remove the trailing space and return the reversed words string.
        reverse.deleteCharAt(reverse.length() - 1);
        return reverse.toString();
    }

    // Main method to execute the program.
    public static void main(String[] args) {
        String str1 = "Reverse words in a given string"; // Given input string.
        
        // Display the given string.
        System.out.println("The given string is: " + str1);
        
        // Display the string after reversing the words.
        System.out.println("The new string after reversing the words: " + WordsInReverse(str1));
    }
}
```
Sample Output:

The given string is: Reverse words in a given string
The new string after reversed the words: string given a in words Reverse
### 46. Write a Java program to reverse every word in a string using methods.

Sample Output:

The given string is: This is a test string
The string reversed word by word is: 
sihT si a tset gnirts
```java
// Importing necessary Java utilities.
import java.util.*;

// Define a class named Main.
public class Main {
    
    // Method to reverse each word in a given string.
    public void reverseEachWordInString(String str1) {
        // Split the input string into individual words.
        String[] each_words = str1.split(" ");
        String revString = "";
        
        // Iterate through each word in the array.
        for (int i = 0; i < each_words.length; i++) {
            String word = each_words[i];
            String reverseWord = "";
            
            // Reverse each word character by character.
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            
            // Build the reversed string by appending the reversed word.
            revString = revString + reverseWord + " ";
        }
        
        // Display the string with reversed words.
        System.out.println(revString);
    }
    
    // Main method to execute the program.
    public static void main(String[] args) {
        // Create an object of the Main class.
        Main obj = new Main();
        String StrGiven = "This is a test string"; // Given input string.
        
        // Display the given input string.
        System.out.println("The given string is: " + StrGiven);
        System.out.println("The string reversed word by word is: ");
        
        // Call the method to reverse each word in the string.
        obj.reverseEachWordInString(StrGiven);
    }
}
```
Sample Output:

The given string is: This is a test string
The string reversed word by word is: 
sihT si a tset gnirts
### 47. Write a Java program to rearrange a string so that the same characters are positioned a distance away.

Sample Output:

The given string is: accessories
The string after arrange newly is: 
secrsecisao
```java
// Importing necessary Java utilities.
import java.util.*;

// Define a class named Main.
public class Main {

    // Define a constant value for character count.
    public static int MX = 26;

    // Define a class to store character frequency.
    static class freqOfChar {
        char c;
        int f;

        // Constructor for freqOfChar class.
        public freqOfChar(char c, int f) {
            this.c = c;
            this.f = f;
        }
    }

    // Main method to execute the program.
    public static void main(String[] args) {
        String strr = "accessories";
        System.out.println("The given string is: " + strr);
        System.out.println("The string after arranging newly is: ");
        String strg = charRearrange(strr, 4);
        if (strg != null)
            System.out.println(strg);
    }

    // Method to rearrange characters in a string based on frequency and distance k.
    public static String charRearrange(String strg, int k) {
        if (strg.length() <= 1) return strg;

        // Create an array of frequency of characters.
        freqOfChar[] chr_fre = new freqOfChar[MX];
        int ctr = 0;

        // Initialize the frequency array.
        for (int i = 0; i < MX; i++) {
            chr_fre[i] = new freqOfChar((char)('a' + i), 0);
        }

        // Calculate frequency of each character in the string.
        for (int i = 0; i < strg.length(); i++) {
            char ch = strg.charAt(i);
            chr_fre[ch - 'a'].f++;
            if (chr_fre[ch - 'a'].f == 1) ctr++;
        }

        // Build a max heap based on character frequencies.
        bldOfHeap(chr_fre, MX);

        // Create arrays to store rearranged characters and their occurrences.
        char[] str1 = new char[strg.length()];
        boolean[] occu = new boolean[strg.length()];

        // Rearrange characters according to frequency and distance k.
        for (int i = 0; i < ctr; i++) {
            freqOfChar chfreq = extractMax(chr_fre, MX - i);
            int ptr = i;
            while (occu[ptr]) ptr++;

            for (int j = 0; j < chfreq.f; j++) {
                if (ptr >= str1.length)
                    return null;
                str1[ptr] = chfreq.c;
                occu[ptr] = true;
                ptr += k;
            }
        }
        return new String(str1);
    }

    // Method to build a max heap.
    private static void bldOfHeap(freqOfChar[] chr_fre, int size) {
        int i = (size - 1) / 2;
        while (i >= 0) {
            maxHeapify(chr_fre, i, size);
            i--;
        }
    }

    // Method to swap two elements in the frequency array.
    private static void swap(freqOfChar cf1, freqOfChar cf2) {
        char c = cf1.c;
        int f = cf1.f;
        cf1.c = cf2.c;
        cf1.f = cf2.f;
        cf2.c = c;
        cf2.f = f;
    }

    // Method to maintain the max heap property.
    private static void maxHeapify(freqOfChar[] chr_fre, int node, int size) {
        int l = node * 2 + 1;
        int r = node * 2 + 2;
        int largest = node;
        if (l < size && chr_fre[l].f > chr_fre[node].f) {
            largest = l;
        }
        if (r < size && chr_fre[r].f > chr_fre[largest].f) {
            largest = r;
        }
        if (largest != node) {
            swap(chr_fre[node], chr_fre[largest]);
            maxHeapify(chr_fre, largest, size);
        }
    }

    // Method to extract the maximum frequency element from the heap.
    private static freqOfChar extractMax(freqOfChar[] chr_fre, int size) {
        freqOfChar max = chr_fre[0];
        chr_fre[0] = chr_fre[size - 1];
        chr_fre[size - 1] = null;
        maxHeapify(chr_fre, 0, size - 1);
        return max;
    }
}
```
Sample Output:

The given string is: accessories
The string after arrange newly is: 
secrsecisao
### 48. Write a Java program to remove "b" and "ac" from a given string.

Sample Output:

The given string is: abrambabasc
After removing the new string is: aramaasc
```java
// Importing necessary Java utilities.
import java.util.*;

// Define a class named Main.
public class Main {

    // Main method to execute the program.
    public static void main(String[] args) {
        // Define the input string.
        String strg = "abrambabasc";
        System.out.println("The given string is: " + strg);
        System.out.print("After removing the specified characters, the new string is: ");
        // Call the method to remove specific characters from the string.
        removeSetofCharacters(strg, "ac", "b");
    }

    // Method to remove specified characters from the given string.
    public static void removeSetofCharacters(String str, String ptn1, String ptn2) {
        // Get the length of the string and initialize variables.
        int n = str.length(), i;
        int ptr = 0;
        // Convert the string to a character array.
        char[] arr1 = str.toCharArray();

        // Loop through each character in the string.
        for (i = 0; i < n; ++i) {
            // Check conditions to remove characters based on the specified patterns.
            if (arr1[i] == 'b') {
                continue; // Skip 'b'.
            } else if (i + 1 < n && arr1[i] == 'a' && arr1[i + 1] == 'c') {
                ++i; // Skip 'ac'.
            } else {
                arr1[ptr++] = arr1[i]; // Copy character to the new position.
            }
        }

        // Create a new character array with the modified string.
        char[] ret = Arrays.copyOfRange(arr1, 0, ptr);
        // Convert the character array to a string and print the result.
        System.out.println(new String(ret));
    }
}
```
Sample Output:

The given string is: abrambabasc
After removing the new string is: aramaasc
### 49. Write a Java program to find the first non-repeating character from a stream of characters.

Sample Output:

String: godisgood
Reading: g
The first non-repeating character so far is:  g
Reading: o
The first non-repeating character so far is:  g
Reading: d
The first non-repeating character so far is:  g
Reading: i
The first non-repeating character so far is:  g
Reading: s
The first non-repeating character so far is:  g
Reading: g
The first non-repeating character so far is:  o
Reading: o
The first non-repeating character so far is:  d
Reading: o
The first non-repeating character so far is:  d
Reading: d
The first non-repeating character so far is:  i
```java
// Importing necessary Java utilities.
import java.util.*;

// Define a class named Main.
public class Main {

    // Main method to execute the program.
    public static void main(String[] args) {

        // Define the maximum number of characters.
        int MXCHAR = 256;

        // Create a list to store characters in a doubly linked list.
        List inDLL = new ArrayList();

        // Create a boolean array to check if a character is repeated.
        boolean[] repeatyn = new boolean[MXCHAR];

        // Define the input string.
        String chrstream = "godisgood";
        System.out.println("String: " + chrstream);

        // Loop through each character in the input string.
        for (int i = 0; i < chrstream.length(); i++) {

            // Get the character at the current index.
            char x = chrstream.charAt(i);
            System.out.println("Reading: " + x);

            // Check if the character is non-repeating.
            if (!repeatyn[x]) {
                // If the character is not repeated yet.
                if (!(inDLL.contains(x))) {
                    inDLL.add(x); // Add the character to the list.
                } else {
                    // If the character is already in the list, remove it and mark it as repeated.
                    inDLL.remove((Character) x);
                    repeatyn[x] = true;
                }
            }

            // Display the first non-repeating character encountered so far.
            if (inDLL.size() != 0) {
                System.out.print("The first non-repeating character so far is:  ");
                System.out.println(inDLL.get(0));
            }
        }
    }
}
```
Sample Output:

String: godisgood
Reading: g
The first non-repeating character so far is:  g
Reading: o
The first non-repeating character so far is:  g
Reading: d
The first non-repeating character so far is:  g
Reading: i
The first non-repeating character so far is:  g
Reading: s
The first non-repeating character so far is:  g
Reading: g
The first non-repeating character so far is:  o
Reading: o
The first non-repeating character so far is:  d
Reading: o
The first non-repeating character so far is:  d
Reading: d
The first non-repeating character so far is:  i
### 50. Write a Java program to find the lexicographic rank of a given string.

Sample Output:

The Given String is: BDCA
The Lexicographic rank of the given string is: 12
N.B.: Total possible permutations of BDCA are(lexicographic order) :
ABCD ABDC ACBD ACDB ADBC ADCB BACD BADC BCAD BCDA BDAC BDCA
1   2   3   4   5   6   7   8   9   10   11   12
The BDCA appear in 12 position of permutation (lexicographic order).
```java
// Importing necessary Java utilities.
import java.util.*;

// Define a class named Main.
class Main {
  
  // Method to calculate factorial of a number recursively.
  public static int makefactorial(int n) {
    // If n is less than or equal to 2, return n. Otherwise, calculate n * factorial of (n - 1).
    return (n <= 2) ? n : n * makefactorial(n - 1);
  }

  // Method to calculate the lexicographic rank of a given string.
  public static int calcuLexicoRank(String str, int n) {
    // Counter for the rank initialized to 1.
    int ctrOfRank = 1;
    
    // Loop through each character in the string.
    for (int i = 0; i < n; i++) {
      int ctr = 0;
      
      // Compare the character at index i with subsequent characters.
      for (int j = i + 1; j <= n; j++) {
        // If the character at index i is greater than the character at index j, increment the counter.
        if (str.charAt(i) > str.charAt(j))
          ctr++;
      }
      
      // Calculate the lexicographic rank using the formula.
      ctrOfRank += ctr * makefactorial(n - i);
    }
    return ctrOfRank; // Return the calculated rank.
  }
  
  // Main method to execute the program.
  public static void main(String[] args) {
    String str = "BDCA";
    System.out.println("The Given String is: " + str);
    int n = str.length(); // Get the length of the string.
    // Display the lexicographic rank of the given string.
    System.out.print("The Lexicographic rank of the given string is: " + calcuLexicoRank(str, n - 1));
  }
}
```
Sample Output:

The Given String is: BDCA
The Lexicographic rank of the given string is: 12

### 51. Write a Java program to count and print all duplicates in the input string.

Sample Output:

The given string is: w3resource
The duplicate characters and counts are: 
e  appears  2  times
r  appears  2  times


### 52. Write a Java program to check if two given strings are rotations of each other.

Sample Output:

The given strings are: ABACD  and  CDABA

The concatination of 1st string twice is: ABACDABACD
The 2nd string CDABA  exists in the new string.

Strings are rotations of each other


### 53. Write a Java program to match two strings where one string contains wildcard characters.

Sample Output:

The given string is: abcdhgh
The given pattern string is: abc*d?*
The given pattern is matching.


### 54. Write a Java program to find the smallest window in a string containing all characters in another string.

Sample Output:

The given string is: welcome to w3resource
Characters to find in the main sring are: tower
The smallest window which contains the finding characters is : to w3re


### 55. Write a Java program to remove all adjacent duplicates recursively from a given string.

Sample Output:

The given string is: aabaarbarccrabmq
The new string after removing all adjacent duplicates is:
brmq


### 56. Write a Java program that appends two strings, omitting one character if the concatenation creates double characters.

Sample Output:

The given strings are: food  and  door
The string after concatination are: foodoor


### 57. Write a Java program to create a string from a given string by swapping the last two characters of the given string. The string length must be two or more.

Sample Output:

The given strings is: string
The string after swap last two characters are: strign


### 58. Write a Java program to read a string and return true if it ends with a specified string of length 2.

Sample Output:

The given strings is: string
The string containing ng at last: true

The given strings is: strign
The string containing ng at last: false


### 59. Write a Java program to read a string. If the string begins with "red" or "black" return that color string, otherwise return the empty string.

Sample Output:

The given strings is: blacksea
The string begins with the color: black


### 60. Write a Java program to read two strings append them together and return the result. If the strings are different lengths, remove characters from the beginning of the longer string and make them equal lengths.

Sample Output:

The given strings is: Welcome and home
The new string is: comehome


### 61. Write a Java program to create a new string taking specified number of characters from first and last position of a given string.

Sample Output:

The given strings is: Welcome
The given numbers is: 3
The new string is: Welome


### 62. Write a Java program to read a string and return true if "good" appears starting at index 0 or 1 in the given string.

Sample Output:

The given strings is: goodboy
The 'good' appear in the string is: true


### 63. Write a Java program to check whether the first two characters appear at the end of a given string.

Sample Output:

The given strings is: educated
The first two characters appear in the last is: true


### 64. Write a Java program to read a string. If a substring of length two appears at both its beginning and end, return a string without the substring at the beginning; otherwise, return the original string unchanged.

Sample Output:

The given strings is: educated
The new string is: ucated


### 65. Write a Java program to read a given string and return the string without the first or last characters if they are the same, otherwise return the string without the characters.

Sample Output:

The given strings is: testcricket
The new string is: estcricke


### 66. Write a Java program to read a string and return it without the first two characters. Keep the first character if it is 'g' and keep the second character if it is 'h'.

Sample Output:

The given strings is: goat
The new string is: gat

he given strings is: photo
The new string is: hoto

The given strings is: ghost
The new string is: ghost


### 67. Write a Java program to read a string and remove the first two characters if one or both are equal to a specified character, otherwise leave them unchanged.

Sample Output:

The given strings is: oocyte
The new string is: cyte

The given strings is: boat
The new string is: bat

The given strings is: own
The new string is: wn


### 68. Write Java program to read a string and return after removing specified characters and their immediate left and right adjacent characters.

Sample Output:

The given strings is: test#string
The new string is: testring

The given strings is: test##string
The new string is: testring

The given strings is: test#the#string
The new string is: teshtring


### 69. Write a Java program to return the substring that is between the first and last appearance of the substring 'toast' in the given string, or return an empty string if the substring 'toast' does not exist.

Sample Output:

The given strings is: sweettoastbuttertoast
The new string is: butter


### 70. Write a Java program that checks if a string has pq-balance if it contains at least one 'q' directly after each ‘p’. But a 'q' before the 'p' invalidates pq-balance.

Sample Output:

The given strings is: gfpmpnppqab
The string is pq-balanced? true

The given strings is: gfpmpnpqpab
The string is pq-balanced? false


### 71. Write a Java program to check two given strings whether any of them appears at the end of the other string (ignore case sensitivity).

Sample Output:

The given strings are: xyz  and pqrxyz
Is one string appears at the end of other? true

The given strings are: pqrxyz  and xyz
Is one string appears at the end of other? true


### 72. Write a Java program to return true if a given string contains the string 'pop', but the middle 'o' also may contain another character.

Sample Output:

The given string is: dikchapop
Is p?p appear in the given string? true

The given string is: dikp$pdik
Is p?p appear in the given string? true


### 73. Write a Java program to check whether a substring appears before a period(.) within a given string.

Sample Output:

The given strings is: testabc.test
Is 'abc' appear before period? true

The given string is: test.abctest
Is 'abc' appear before period? false


### 74. Write a Java program to check whether a prefix string created using the first specific character in a given string appears somewhere else in the string.

Sample Output:

The given strings is: MrsJemsmrsam
The prefix string length is: 3
Is 'Mrs' appear else where in the string? false

The given string is: MrsJemsMrsam
The prefix string length is: 3
Is 'Mrs' appear else where in the string? true


### 75. Write a Java program to check whether a given substring appears in the middle of another string. Here middle means the difference between the number of characters to the left and right of the given substring is not more than 1.

Sample Output:

The given string is: xxxabcxxxxx
Is abc appear in middle? false

The given string is: xxabcxxx
Is abc appear in middle? true


### 76. Write a Java program to count how many times the substring 'life' appears anywhere in a given string. Counting can also happen with the substring 'li?e', any character instead of 'f'.

Sample Output:

The given string is: liveonwildlife
The substring life or li?e appear number of times: 2


### 77. Write a Java program to add a string with a specific number of times separated by a substring.

Sample Output:

The given strings are: try  and  best
Number to times to be repeat: 3
The new string is: trybesttrybesttry


### 78. Write a Java program to repeat a specific number of characters for a specific number of times from the last part of a given string.

Sample Output:

The given string is: string
The new string after repetition: inginging


### 79. Write a Java program to create a string from a given string. This is done after removing the 2nd character from the substring of length three starting with 'z' and ending with 'g' presents in the said string.

Sample Output:

The given string is: zzgkitandkatcaketoket
The new string is: zgkitandkatcaketoket


### 80. Write a Java program to check whether the character immediately before and after a specified character is the same in a given string.

Sample Output:

The given string is: moon#night
The before and after character are same: true

The given string is: bat##ball
The before and after character are same: false

The given string is: #moon#night
The before and after character are same: true


### 81. Write a Java program to check whether two strings of length 3 and 4 appear the same number of times in a given string.

Sample Output:

The given string is: redcapmanwithbluecar
The appearance of red and blue are same: true


### 82. Write a Java program to create a string containing every character twice of a given string.

Sample Output:

The given string is: welcome
The new string is: wweellccoommee


### 83. Write a Java program to create a string from two given strings. This is so that each character of the two strings appears individually in the created string.

Sample Output:

The given strings  are: welcome  and  w3resource
The new string is: wwe3lrceosmoeurce


### 84. Write a Java program to make an original string made of p number of characters from the first character in a given string. This is followed by p-1 number of characters till p is greater than zero.

Sample Output:

The given string is: welcome
Number of repetition characters and repetition: 4
The new string is: welcwelwew


### 85. Write a Java program to make up a string with each character before and after a non-empty substring whichever it appears in a non-empty given string.

Sample Output:

The given string are: weablcoabmeab  and ab
The new string is: elome


### 86. Write a Java program to count the number of triples (characters appearing three times in a row) in a given string.

Sample Output:

The given string is: welllcommmmeee
The number of triples in the string is: 4


### 87. Write a Java program to check whether a specified character is happy or not. A character is happy when the same character appears to its left or right in a string.

Sample Output:

The given string is: azzlea
Is z happy in the string: true

The given string is: azmzlea
Is z happy in the string: falses


### 88. Write a Java program to return a string where every appearance of the lowercase word 'is' has been replaced with 'is not'.

Sample Output:

The given string is: it is a string
The new string is: it is not a string


### 89. Write a Java program to calculate the sum of the numbers that appear in a given string.

Sample Output:

The given string is: it 15 is25 a 20string
The sum of numbers in the string is: 60


### 90. Write a Java program to check the number of times the two substrings appearing anywhere in a string.

Sample Output:

The given string is: Thisisthethesis
Are the appearance of 'the' and 'is' equal? false


### 91. Write a Java program to count the number of words ending in 'm' or 'n' (not case sensitive) in a given text.

Sample Output:

The given string is: mam is in the room
The number of words ends eith m or n is: 3


### 92. Write a Java program that returns a substring after removing all instances of remove string as given from the given main string.

Sample Output:

The main string is: This is the test string
The removable string is: st
The new string is: This is the te ring


### 93. Write a Java program to find the longest substring that appears at both ends of a given string.

Sample Output:

The given string is: playersplay
The longest substring in the string is: play


### 94. Write a Java program to find the longest mirror image string at both ends of a given string.

Sample Output:

The given string is: rotavator
The longest mirror image string in the string is: rotavator


### 95. Write a Java program to return the sum of the digits present in the given string. In the absence of digits, the sum is 0.

Sample Output:

The given string is: ab5c2d4ef12s
The sum of the digits in the string is: 14


### 96. Write a Java program to create a new string after removing a specified character from a given string. This is except the first and last position.

Sample Output:

The given string is: zebrazone
The new string is: zebraone


### 97. Write a Java program to return a string with characters at index positions 0,1,2,5,6,7, ... from a given string.

Sample Output:

The given string is: w3resource.com
The new string is: w3rour.co


### 98. Write a Java program to check whether the first instance of a given character is immediately followed by the same character in a given string.

Sample Output:

The given string is: fizzez
Is 'z' appear twice respectively? true


### 99. Write a Java program to return an updated string using every character of even position from a given string.

Sample Output:

The given string is: w3resource.com
The new string is: wrsuc.o


### 100. Write a Java program to check if a given string contains another string. Returns true or false.

Sample Output:

Original string:
Java is the foundation for virtually every type of networked application and is the global standard for developing and  delivering embedded and mobile applications, games, Web-based content,  and enterprise software. With more than 9 million developers worldwide, Java enables you to efficiently develop, deploy and use exciting applications and services.

Is 'million' present in the said text?
true

Is 'millions' present in the said text?
false


### 101. Write a Java program to test if a string contains only digits. Returns true or false.

Sample Output:

First string:
131231231231231231231231231212312312
true

Second string:
13123123123Z1231231231231231212312312
false


### 102. Write a Java program to convert a given string to int, long, floating and double.

Sample Output:

Convert String to int/Integer:
"1323" as int is 1323 and as Integer is 1323

Convert String to long/Long:
"13625478965325" as long is 13625478965325 and as Long is 13625478965325

Convert String to float/Float:
"25.135F" as float is 25.135 and as Float is 25.135

Convert String to double/Double:
"21.25478254D" as double is 21.25478254 and as Double is 21.25478254
false


### 103. Write a Java program to remove a specified character from a given string.

Sample Output:

Original string:
abcdefabcdeabcdaaa

Second string:
bcdefbcdebcd


### 104. Write a Java program to sort in ascending and descending order by the length of the given array of strings.

Sample Output:

Original unsorted colors: [Green, White, Black, Pink, Orange, Blue, Champagne, Indigo, Ivory]

Sorted color (descending order): [Champagne, Orange, Indigo, Green, White, Black, Ivory, Pink, Blue]

Sorted color (ascending order): [Pink, Blue, Green, White, Black, Ivory, Orange, Indigo, Champagne]


### 105. Write a Java program to count the occurrences of a given string in another given string.

Sample Output:

aa' has occured 3 times in 'abcd abc aabc baa abcaa'


### 106. Write a Java program to concatenate a given string with itself a given number of times.

Sample Output:

Original string: PHP

After repeating 7 times: PHPPHPPHPPHPPHPPHPPHP


### 107. Write a Java program to count occurrences of a certain character in a given string.



### 108. Write a Java program to check whether there are two consecutive (following each other continuously), identical letters in a given string.

Sample Output:

Original word: Follow
If there are two consecutive identical letters in the said string: true
Original word: Java
If there are two consecutive identical letters in the said string: false
Original word: Yellow
If there are two consecutive identical letters in the said string: true


### 109. Write a Java program that reverses all odd-length words in a string.

Sample Output:

Original text: Check two consecutive identical letters in a given string

Reverses the words in the string that have odd lengths:
Check two consecutive identical letters ni a given gnirts

Original text: Create a Date object using the Calendar class

Reverses the words in the string that have odd lengths:
etaerC a etaD tcejbo using the radnelaC class


### 110. Write a Java program to count the number of characters (alphanumeric only) that occur more than twice in a given string.

Sample Output:

Original String: abcdaa
Number of duplicate characters in the said String (Occurs more than twice.): 1

Original String: Create a Date Calendar.
Number of duplicate characters in the said String (Occurs more than twice.): 3


### 111. Write a Java program that removes a specified word from given text. Return the updated string..

Sample Output:

Input a string: 
 Exercises Practice Solution
Input a word to remove: 
 Solution
New string, after removing the said word:
Exercises Practice 


### 112. A string is created by using another string's letters. Letters are case sensitive. Write a Java program that checks the letters of the second string are present in the first string. Return true otherwise false.

Sample Output:

Input the first string: 
 Java
Input the second string: 
 Ja
Check first string contains letters from the second string:
true
