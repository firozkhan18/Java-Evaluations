1. Write a Java program to print 'Hello' on screen and your name on a separate line.

Pictorial Presentation:

Java: Print hello and your name on a separate lines
Sample Solution:

Java Code:
```java
public class Exercise1 { 
    public static void main(String[] args) {
        // Print a greeting message to the console
        System.out.println("Hello\nAlexandra Abramov!");
    } 
}
```
Explanation:

In the exercise above

- The "main()" method is the program entry point.
- It uses System.out.println to print the message.
- The message consists of two lines: "Hello" and "Alexandra Abramov!" separated by a newline character (\n).
- When we run this Java program, we'll see this message displayed in the console or terminal.

Sample Output:

Hello                                                                                                      
Alexandra Abramov!
Flowchart:

Flowchart: Print hello and your name on a separate lines
Sample solution using input from the user:

Java Code:
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);
        // Prompt the user to input their first name
        System.out.print("Input your first name: ");
        String fname = input.next();
        // Prompt the user to input their last name
        System.out.print("Input your last name: ");
        String lname = input.next();
        // Output a greeting message with the user's full name
        System.out.println();
        System.out.println("Hello \n" + fname + " " + lname);
    }
}
```
Explanation:

In the exercise above -

- import java.util.Scanner;: This code imports the "Scanner" class, which allows the program to read input from the user.
- public class Main {: This code declares a class named "Main," and it contains the main method, which is the entry point of the program.
- public static void main(String[] args) {: This line defines the main method. Here's what each part means:
- public: This keyword indicates that the method can be accessed from outside the class.
- static: This keyword means that the method belongs to the class itself, not to a specific instance of the class.
- void: This specifies that the main method doesn't return any value.
- main: This is the name of the method.
- (String[] args): This is the method's parameter list, which accepts an array of strings. In this case, it's not used.
- Scanner input = new Scanner(System.in);: This code creates a Scanner object named input to read input from the console (user's keyboard).
- System.out.print("Input your first name: ");: This code prints a message to the console, asking the user to input their first name.
- String fname = input.next();: This code reads the user's input for their first name and stores it in the variable fname.
- System.out.print("Input your last name: ");: This code prints a message to the console, asking the user to input their last name.
- String lname = input.next();: This code reads the user's input for their last name and stores it in the variable lname.
- System.out.println();: This code prints a blank line to separate the output.
- System.out.println("Hello \n" + fname + " " + lname);: This code prints a greeting message to the console. It combines the user's full name with the text "Hello" and a newline character (\n) to create a formatted greeting message.

Sample Output:

Input your first name:  James 
Input your last name:  Smith

Hello 
James Smith

Expected Output :
Hello
Alexandra Abramov

Click me to see the solution

2. Write a Java program to print the sum of two numbers.
Test Data:
74 + 36
Expected Output :
110

Click me to see the solution

3. Write a Java program to divide two numbers and print them on the screen.
Test Data :
50/3
Expected Output :
16

Click me to see the solution

4. Write a Java program to print the results of the following operations.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
Expected Output :
43
1
19
13

Click me to see the solution

5. Write a Java program that takes two numbers as input and displays the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125

Click me to see the solution

6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5

Click me to see the solution

7. Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80

Click me to see the solution

8. Write a Java program to display the following pattern.
Sample Pattern :


   J    a   v     v  a                                                  
   J   a a   v   v  a a                                                 
J  J  aaaaa   V V  aaaaa                                                
 JJ  a     a   V  a     a
 
Click me to see the solution

9. Write a Java program to compute the specified expressions and print the output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output
2.138888888888889

Click me to see the solution

10. Write a Java program to compute a specified formula.
Specified Formula :
4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
Expected Output
2.9760461760461765

Click me to see the solution

11. Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586

Click me to see the solution

12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
Click me to see the solution

13. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5


Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20

Click me to see the solution

14. Write a Java program to print an American flag on the screen.
Expected Output

* * * * * * ==================================                          
 * * * * *  ==================================                          
* * * * * * ==================================                          
 * * * * *  ==================================                          
* * * * * * ==================================                          
 * * * * *  ==================================                          
* * * * * * ==================================                          
 * * * * *  ==================================                          
* * * * * * ==================================                          
==============================================                          
==============================================                          
==============================================                          
==============================================                          
==============================================                          
==============================================
 
Click me to see the solution

15. Write a Java program to swap two variables.
Click me to see the solution

16. Write a Java program to print a face.
Expected Output

 +"""""+                                                 
[| o o |]                                                
 |  ^  |                                                 
 | '-' |                                                 
 +-----+
Click me to see the solution

17. Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output

Sum of two binary numbers: 101
Click me to see the solution

18. Write a Java program to multiply two binary numbers.
Input Data:
Input the first binary number: 10
Input the second binary number: 11
Expected Output

Product of two binary numbers: 110 
Click me to see the solution

19. Write a Java program to convert an integer number to a binary number.
Input Data:
Input a Decimal Number : 5
Expected Output

Binary number is: 101 
Click me to see the solution

20. Write a Java program to convert a decimal number to a hexadecimal number.
Input Data:
Input a decimal number: 15
Expected Output

Hexadecimal number is : F 
Click me to see the solution

21. Write a Java program to convert a decimal number to an octal number.
Input Data:
Input a Decimal Number: 15
Expected Output

Octal number is: 17  
Click me to see the solution

22. Write a Java program to convert a binary number to a decimal number.
Input Data:
Input a binary number: 100
Expected Output

Decimal Number: 4 
Click me to see the solution

23. Write a Java program to convert a binary number to a hexadecimal number.
Input Data:
Input a Binary Number: 1101
Expected Output

HexaDecimal value: D
Click me to see the solution

24. Write a Java program to convert a binary number to an octal number.
Input Data:
Input a Binary Number: 111
Expected Output

Octal number: 7 
Click me to see the solution

25. Write a Java program to convert a octal number to a decimal number.
Input Data:
Input any octal number: 10
Expected Output

Equivalent decimal number: 8
Click me to see the solution

26. Write a Java program to convert a octal number to a binary number.
Input Data:
Input any octal number: 7
Expected Output

Equivalent binary number: 111 
Click me to see the solution

27. Write a Java program to convert a octal number to a hexadecimal number.
Input Data:
Input a octal number : 100
Expected Output

Equivalent hexadecimal number: 40
Click me to see the solution

28. Write a Java program to convert a hexadecimal value into a decimal number.
Input Data:
Input a hexadecimal number: 25
Expected Output

Equivalent decimal number is: 37
Click me to see the solution

29. Write a Java program to convert a hexadecimal number into a binary number.
Input Data:
Enter Hexadecimal Number : 37
Expected Output

Equivalent Binary Number is: 110111
Click me to see the solution

30. Write a Java program to convert a hexadecimal value into an octal number.
Input Data:
Input a hexadecimal number: 40
Expected Output

Equivalent of octal number is: 100 
Click me to see the solution

31. Write a Java program to check whether Java is installed on your computer.
Expected Output

Java Version: 1.8.0_71                                                            
Java Runtime Version: 1.8.0_71-b15                                                
Java Home: /opt/jdk/jdk1.8.0_71/jre                                               
Java Vendor: Oracle Corporation                                                   
Java Vendor URL: http://Java.oracle.com/                                          
Java Class Path: .
Click me to see the solution

32. Write a Java program to compare two numbers.
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output

25 != 39                                                                          
25 < 39                                                                           
25 <= 39
Click me to see the solution

33. Write a Java program and compute the sum of an integer's digits.
Input Data:
Input an integer: 25
Expected Output

The sum of the digits is: 7
Click me to see the solution

34. Write a Java program to compute hexagon area.
Area of a hexagon = (6 * s^2)/(4*tan(π/6))
where s is the length of a side
Input Data:
Input the length of a side of the hexagon: 6
Expected Output

The area of the hexagon is: 93.53074360871938
Click me to see the solution

35. Write a Java program to compute the area of a polygon.
Area of a polygon = (n*s^2)/(4*tan(π/n))
where n is n-sided polygon and s is the length of a side
Input Data:
Input the number of sides on the polygon: 7
Input the length of one of the sides: 6
Expected Output

The area is: 130.82084798405722
Click me to see the solution

36. Write a Java program to compute the distance between two points on the earth's surface.
Distance between the two points [ (x1,y1) & (x2,y2)]
d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
Radius of the earth r = 6371.01 Kilometers
Input Data:
Input the latitude of coordinate 1: 25
Input the longitude of coordinate 1: 35
Input the latitude of coordinate 2: 35.5
Input the longitude of coordinate 2: 25.5
Expected Output

The distance between those points is: 1480.0848451069087 km 
Click me to see the solution

37. Write a Java program to reverse a string.
Input Data:
Input a string: The quick brown fox
Expected Output

Reverse string: xof nworb kciuq ehT
Click me to see the solution

38. Write a Java program to count letters, spaces, numbers and other characters in an input string.
Expected Output

The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
letter: 23                                               
space: 9                                                 
number: 10                                               
other: 6
Click me to see the solution

39. Write a Java program to create and display a unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there.
Expected Output

123                                                      
124                                                      
...                                            
                                                   
431                                                      
432                                                      
Total number of the three-digit-number is 24
Click me to see the solution

40. Write a Java program to list the available character sets in charset objects.
Expected Output

List of available character sets:                                       
Big5                                                                    
Big5-HKSCS                                                              
CESU-8                                                                  
EUC-JP                                                                  
EUC-KR                                                                  
GB18030                                                                 
GB2312                                                                  
GBK                                                                     
                                                     
...                                            
                                                   
x-SJIS_0213                                                             
x-UTF-16LE-BOM                                                          
X-UTF-32BE-BOM                                                          
X-UTF-32LE-BOM                                                          
x-windows-50220                                                         
x-windows-50221                                                         
x-windows-874                                                           
x-windows-949                                                           
x-windows-950                                                           
x-windows-iso2022jp
Click me to see the solution

41. Write a Java program to print the ASCII value of a given character.
Expected Output

The ASCII value of Z is :90
Click me to see the solution

42. Write a Java program to input and display your password.
Expected Output

Input your Password:                                                    
Your password was: abc@123
Click me to see the solution

43. Write a Java program to print the following string in a specific format (see output).
Sample Output

Twinkle, twinkle, little star,
	How I wonder what you are! 
		Up above the world so high,   		
		Like a diamond in the sky. 
Twinkle, twinkle, little star, 
	How I wonder what you are
Click me to see the solution

44. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
Sample Output:

Input number: 5                                                        
5 + 55  + 555
Click me to see the solution

45. Write a Java program to find the size of a specified file.
Sample Output:

/home/students/abc.txt  : 0 bytes                                      
/home/students/test.txt : 0 bytes 
Click me to see the solution

46. Write a Java program to display system time.
Sample Output:

Current Date time: Fri Jun 16 14:17:40 IST 2017 
Click me to see the solution

47. Write a Java program to display the current date and time in a specific format.
Sample Output:

Now: 2017/06/16 08:52:03.066 
Click me to see the solution

48. Write a Java program to print odd numbers from 1 to 99. Prints one number per line.
Sample Output:

1                                                                      
3                                                                      
5                                                                      
7                                                                      
9                                                                      
11                                                                     
....                                                                     
                                                                    
91                                                                     
93                                                                     
95                                                                     
97                                                                     
99 
Click me to see the solution

49. Write a Java program to accept a number and check whether the number is even or not. Prints 1 if the number is even or 0 if odd.
Sample Output:

Input a number: 20                                                     
1
Click me to see the solution

50. Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both.
Sample Output:

Divided by 3:                                                          
3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57
, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,              
                                                                       
Divided by 5:                                                          
5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 
95,                                                                    
                                                                       
Divided by 3 & 5:                                                      
15, 30, 45, 60, 75, 90,
Click me to see the solution

51. Write a Java program to convert a string to an integer.
Sample Output:

Input a number(string): 25                                             
The integer value is: 25
Click me to see the solution

52. Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
Sample Output:

Input the first number : 5                                             
Input the second number: 10                                            
Input the third number : 15                                            
The result is: true
Click me to see the solution

53. Write a Java program that accepts three integers from the user. It returns true if the second number is higher than the first number and the third number is larger than the second number. If "abc" is true, the second number does not need to be larger than the first number.
Sample Output:

Input the first number : 5                                             
Input the second number: 10                                            
Input the third number : 15                                            
The result is: true
Click me to see the solution

54. Write a Java program that accepts three integers from the user and returns true if two or more of them (integers) have the same rightmost digit. The integers are non-negative.
Sample Output:

Input the first number : 5                                             
Input the second number: 10                                            
Input the third number : 15                                            
The result is: true
Click me to see the solution

55. Write a Java program to convert seconds to hours, minutes and seconds.
Sample Output:

Input seconds: 86399                                                   
23:59:59
Click me to see the solution

56. Write a Java program to find the number of values in a given range divisible by a given value.
For example x = 5, y=20 and p =3, find the number of integers within the range x..y and that are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }
Sample Output:

5
Click me to see the solution

57. Write a Java program to accept an integer and count the factors of the number.
Sample Output:

Input an integer: 25                                                   
3
Click me to see the solution

58. Write a Java program to capitalize the first letter of each word in a sentence.
Sample Output:

Input a Sentence: the quick brown fox jumps over the lazy dog.         
The Quick Brown Fox Jumps Over The Lazy Dog.
Click me to see the solution

59. Write a Java program to convert a string into lowercase.
Sample Output:

Input a String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.           
the quick brown fox jumps over the lazy dog.
Click me to see the solution

60. Write a Java program to find the penultimate (next to the last) word in a sentence.
Sample Output:

Input a String: The quick brown fox jumps over the lazy dog.
Penultimate word: lazy
Click me to see the solution

61. Write a Java program to reverse a word.
Sample Output:

Input a word: dsaf
Reverse word: fasd
Click me to see the solution

62. Write a Java program that accepts three integer values and returns true if one is 20 or more less than the others' subtractions.
Sample Output:

Input the first number : 15                                            
Input the second number: 20                                            
Input the third number : 25                                            
false
Click me to see the solution

63. Write a Java program that accepts two integer values from the user and returns the largest value. However if the two values are the same, return 0 and find the smallest value if the two values have the same remainder when divided by 6.
Sample Output:

Input the first number : 12                                            
Input the second number: 13                                            
Result: 13
Click me to see the solution

64. Write a Java program that accepts two integer values between 25 and 75 and returns true if there is a common digit in both numbers.
Sample Output:

Input the first number : 35                                            
Input the second number: 45                                            
Result: true
Click me to see the solution

65. Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator.
Sample Output:

Input the first number : 19                                            
Input the second number: 7                                             
5   
Click me to see the solution

66. Write a Java program to compute the sum of the first 100 prime numbers.
Sample Output:

Sum of the first 100 prime numbers: 24133 
Click me to see the solution

67. Write a Java program to insert a word in the middle of another string.
Insert "Tutorial" in the middle of "Python 3.0", so the result will be Python Tutorial 3.0.
Sample Output:

Python Tutorial 3.0
Click me to see the solution

68. Write a Java program to create another string of 4 copies of the last 3 characters of the original string. The original string length must be 3 and above.
Sample Output:

3.03.03.03.0 
Click me to see the solution

69. Write a Java program to extract the first half of a even string.
Test Data: Python
Sample Output:
Pyt
Click me to see the solution

70. Write a Java program to create a string in the form of short_string + long_string + short_string from two strings. The strings must not have the same length.
Test Data: Str1 = Python
Str2 = Tutorial
Sample Output:

PythonTutorialPython
Click me to see the solution

71. Write a Java program to create the concatenation of the two strings except removing the first character of each string. The length of the strings must be 1 and above.
Test Data: Str1 = Python
Str2 = Tutorial
Sample Output:

ythonutorial
Click me to see the solution

72. Write a Java program to create a string taking the first three characters from a given string. If the string length is less than 3 use "#" as substitute characters.
Test Data: Str1 = " "
Sample Output:

###
Click me to see the solution

73. Write a Java program to create a string taking the first and last characters from two given strings. If the length of each string is 0 use "#" for missing characters.
Test Data: str1 = "Python"
str2 = " "
Sample Output:

P#
Click me to see the solution

74. Write a Java program to test if 10 appears as the first or last element of an array of integers. The array length must be broader than or equal to 2.
Sample Output:
Test Data: array = 10, -20, 0, 30, 40, 60, 10

true
Click me to see the solution

75. Write a Java program to test if the first and last elements of an array of integers are the same. The array length must be broader than or equal to 2.
Test Data: array = 50, -20, 0, 30, 40, 60, 10
Sample Output:

false
Click me to see the solution

76. Write a Java program to test if the first and last element of two integer arrays are the same. The array length must be greater than or equal to 2.
Test Data: array1 = 50, -20, 0, 30, 40, 60, 12
array2 = 45, 20, 10, 20, 30, 50, 11
Sample Output:

false
Click me to see the solution

77. Write a Java program to create an array of length 2 from two integer arrays with three elements. The newly created array will contain the first and last elements from the two arrays.
Test Data: array1 = 50, -20, 0
array2 = 5, -50, 10
Sample Output:

Array1: [50, -20, 0]                                                   
Array2: [5, -50, 10]                                                   
New Array: [50, 10]
Click me to see the solution

78. Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7.
Sample Output:

Original Array: [5, 7]                                                 
true 
Click me to see the solution

79. Write a Java program to rotate an array (length 3) of integers in the left direction.
Sample Output:

Original Array: [20, 30, 40]                                           
Rotated Array: [30, 40, 20]
Click me to see the solution

80. Write a Java program to get the largest value between the first and last elements of an array (length 3) of integers.
Sample Output:

Original Array: [20, 30, 40]                                           
Larger value between first and last element: 40 
Click me to see the solution

81. Write a Java program to swap the first and last elements of an array (length must be at least 1) and create another array.
Sample Output:

Original Array: [20, 30, 40]                                           
New array after swaping the first and last elements: [40, 30, 20] 
Click me to see the solution

82. Write a Java program to find the largest element between the first, last, and middle values in an array of integers (even length).
Sample Output:

Original Array: [20, 30, 40, 50, 67]                                   
Largest element between first, last, and middle values: 67 
Click me to see the solution

83. Write a Java program to multiply the corresponding elements of two integer arrays.
Sample Output:

Array1: [1, 3, -5, 4]                                                  
                                                                       
Array2: [1, 4, -5, -2]                                                 
                                                                       
Result: 1 12 25 -8
Click me to see the solution

84. Write a Java program to take the last three characters from a given string. It will add the three characters at both the front and back of the string. String length must be greater than three and more.
Test data: "Python" will be "honPythonhon"
Sample Output:

honPythonhon
Click me to see the solution

85. Write a Java program to check if a string starts with a specified word.
Sample Data: string1 = "Hello how are you?"
Sample Output:

true
Click me to see the solution

86. Write a Java program starting with an integer n, divide it by 2 if it is even, or multiply it by 3 and add 1 if it is odd. Repeat the process until n = 1.
Click me to see the solution

87. Write a Java program that then reads an integer and calculates the sum of its digits and writes the number of each digit of the sum in English.
Click me to see the solution

88. Write a Java program to get the current system environment and system properties.
Click me to see the solution

89. Write a Java program to check whether a security manager has already been established for the current application or not.
Click me to see the solution


90. Write a Java program to get the value of environment variables PATH, TEMP, USERNAME.
Click me to see the solution

91. Write a Java program to measure how long code executes in nanoseconds.
Click me to see the solution

92. Write a Java program to count the number of even and odd elements in a given array of integers.
Click me to see the solution

93. Write a Java program to test if an array of integers contains an element 10 next to 10 or an element 20 next to 20, but not both.
Click me to see the solution

94. Write a Java program to rearrange all the elements of a given array of integers so that all the odd numbers come before all the even numbers.
Click me to see the solution

95. Write a Java program to create an array (length # 0) of string values. The elements will contain "0", "1", "2" … through ... n-1.
Click me to see the solution

96. Write a Java program to check if there is a 10 in an array of integers with a 20 somewhere later on.
Click me to see the solution

97. Write a Java program to check if an array of integers contains a specified number next to each other or two same numbers separated by one element.
Click me to see the solution

98. Write a Java program to check if the value 20 appears three times and no 20's are next to each other in the array of integers.
Click me to see the solution

99. Write a Java program that checks if a specified number appears in every pair of adjacent integers of a given array of integers.
Click me to see the solution

100. Write a Java program to count the elements that differ by 1 or less between two given arrays of integers with the same length.
Click me to see the solution


101. Write a Java program to determine whether the number 10 in a given array of integers exceeds 20.
Click me to see the solution

102. Write a Java program to check if a specified array of integers contains 10 or 30.
Click me to see the solution

103. Write a Java program to create an array from a given array of integers. The newly created array will contain elements from the given array after the last element value is 10.
Click me to see the solution

104. Write a Java program to create an array from a given array of integers. The newly created array will contain the elements from the given array before the last element value of 10.
Click me to see the solution

105. Write a Java program to check if a group of numbers (l) at the start and end of a given array are the same.
Click me to see the solution

106. Write a Java program to create an array left shifted from a given array of integers.
Click me to see the solution

107. Write a Java program to check if an array of integers contains three increasing adjacent numbers.
Click me to see the solution

108. Write a Java program to add all the digits of a given positive integer until the result has a single digit.
Click me to see the solution

109. Write a Java program to form a staircase shape of n coins where every k-th row must have exactly k coins.
Click me to see the solution

110. Write a Java program to check whether the given integer is a power of 4 or not.
Given num = 64, return true. Given num = 6, return false.
Click me to see the solution

111. Write a Java program to add two numbers without arithmetic operators.
Given x = 10 and y = 12; result = 22
Click me to see the solution


112. Write a Java program to compute the number of trailing zeros in a factorial.
7! = 5040, therefore the output should be 1
Click me to see the solution

113. Write a Java program to merge two given sorted arrays of integers and create another sorted array.
array1 = [1,2,3,4]
array2 = [2,5,7, 8]
result = [1,2,2,3,4,5,7,8]
Click me to see the solution

114. Write a Java program that rotates a string by an offset (rotate from left to right.
Click me to see the solution

115. Write a Java program to check if a positive number is a palindrome or not.
Input a positive integer: 151
Is 151 is a palindrome number?
true
Click me to see the solution

116. Write a Java program that iterates integers from 1 to 100. For multiples of three print "Fizz" instead of the number and print "Buzz" for five. When the number is divided by three and five, print "fizz buzz".
Click me to see the solution

117. Write a Java program to compute the square root of a given number.
Input a positive integer: 25
Square root of 25 is: 5
Click me to see the solution

118. Write a Java program to get the first occurrence (Position starts from 0.) of a string within a given string.
Click me to see the solution

119. Write a Java program to get the first occurrence (Position starts from 0.) of an element of a given array.
Click me to see the solution

120. Write a Java program that searches for a value in an m x n matrix.
Click me to see the solution

121. Write a Java program to reverse a linked list.
Example: For linked list 20->40->60->80, the reversed linked list is 80->60->40->20
Click me to see the solution

122. Write a Java program to find a contiguous subarray with the largest sum from a given array of integers.
Note: In computer science, the maximum subarray problem is the task of finding the contiguous subarray within a one-dimensional array of numbers which has the largest sum. For example, for the sequence of values −2, 1, −3, 4, −1, 2, 1, −5, 4; the contiguous subarray with the largest sum is 4, −1, 2, 1, with sum 6. The subarray should contain one integer at least. Click me to see the solution

123. Write a Java program to find the subarray with smallest sum from a given array of integers.
Click me to see the solution

124. Write a Java program to find the index of a value in a sorted array. If the value does not find return the index where it would be if it were inserted in order.
Example:
[1, 2, 4, 5, 6] 5(target) -> 3(index)
[1, 2, 4, 5, 6] 0(target) -> 0(index)
[1, 2, 4, 5, 6] 7(target) -> 5(index)
Click me to see the solution

125. Write a Java program to get the preorder traversal of the values of the nodes in a binary tree.
Example:
    10
   / \
  20   30
 / \
40   50
Expected output: 10 20 40 50 30
Click me to see the solution
126. Write a Java program to get the in-order traversal of its nodes' values in a binary tree.
    10
   / \
  20   30
 / \
40   50
Example:{10, 20, 30, 40, 50}
Output: 40 20 50 10 30
Click me to see the solution
127. Write a Java program to get the Postorder traversal of its nodes' values in a binary tree.
    10
   / \
  20   30
 / \
40   50
Click me to see the solution
128. Write a Java program to calculate the median of a non-sorted array of integers.
Original array: [10, 2, 38, 22, 38, 23]
Median of the said array of integers: 30
Original array: [10, 2, 38, 23, 38, 23, 21]
Median of the said array of integers: 23
Click me to see the solution

129. Write a Java program to find a number that appears only once in a given array of integers. All numbers occur twice.
Source Array : [10, 20, 10, 20, 30, 40, 40, 30, 50] 50 appears only once
Click me to see the solution

130. Write a Java program to find the maximum depth of a given binary tree.
Sample Output: The Maximum depth of the binary tree is: 3
Click me to see the solution

131. Write a Java program to find the updated length of a sorted array where each element appears only once (remove duplicates).
Original array: [1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7] The length of the original array is: 11 After removing duplicates, the new length of the array is: 7
Click me to see the solution

132. Write a Java program to find the updated length of a given sorted array where duplicate elements appear at most twice.
Original array: [1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7]
The length of the original array is: 13
After removing duplicates, the new length of the array is: 10
Click me to see the solution

133. Write a Java program to find a path from top left to bottom in the right direction which minimizes the sum of all numbers along its path.
Note: Move either down or right at any point in time.
Sample Output: Sum of all numbers along its path: 13
Click me to see the solution

134. Write a Java program to find distinct ways to climb to the top (n steps to reach the top) of stairs. Each time you climb, you can climb 1 or 2 steps.
Example: n = 5
a) 1+1+1+1+1 = 5 b) 1+1+1+2 = 5 c) 1+2+2 = 5 d) 2+2+1 = 5 e) 2+1+1+1 = 5 f) 2+1+2 = 5 g) 1+2+1+1 = 5 h) 1+1+2+1 = 5
Sample Output: Distinct ways can you climb to the top: 8
Click me to see the solution

135. Write a Java program to remove duplicates from a sorted linked list.
Original List with duplicate elements:
12->12->13->14->15->15->16->17->17
After removing duplicates from the said list:
12->13->14->15->16->17
Click me to see the solution

136. Write a Java program to find possible distinct paths from the top-left corner to the bottom-right corner of a given grid (m x n).
Note: You can move either down or right at any point in time.
Sample Output: Unique paths from top-left corner to bottom-right corner of the said grid: 3
Click me to see the solution

137. Write a Java program to find possible unique paths considering some obstacles, from top-left corner to bottom-right corner of a given grid (m x n).
Note: You can move either down or right at any point in time and an obstacle and empty space is marked as 1 and 0 respectively in the grid.
Sample grid:
int[][] obstacle_Grid ={
{0, 0, 0},
{0, 1, 0},
{0, 0, 0},
};
Sample Output: Unique paths from top-left corner to bottom-right corner of the said grid (considering some obstacles): 2
Click me to see the solution

138. Write a Java program to find the longest words in a dictionary.
Example-1:
{
"cat",
"flag",
"green",
"country",
"w3resource"
}
Result: "w3resource"
Example-2:
{
"cat",
"dog",
"red",
"is",
"am"
}
Result: "cat", "dog", "red"
Click me to see the solution

139. Write a Java program to get the index of the first and the last number of a subarray where the sum of numbers is zero. This is from a given array of integers.
Original Array : [1, 2, 3, -6, 5, 4]
Index of the subarray of the said array where the sum of numbers is zero: [0, 3]
Click me to see the solution

140. Write a Java program to merge all overlapping intervals from a given collection of intervals.
Sample Output: 1 6
8 10
15 20
Click me to see the solution

141. Write a Java program to check if a given string has all distinct characters.
Sample Output: Original String : xyyz
String has all unique characters: false
Click me to see the solution

142. Write a Java program to check if two strings are anagrams or not.
According to Wikipedia "An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once. For example, the word anagram can be rearranged into nag a ram, or the word binary into brainy."
Sample Output: String-1 : wxyz
String-2 : zyxw
Check if two given strings are anagrams or not?: true
Click me to see the solution

143. Write a Java program to merge the two sorted linked lists.
Sample Output:
Merge Two Sorted ListsT:
1 2 3 7 9 13 40
Click me to see the solution

144. Write a Java program to remove all occurrences of a specified value in a given array of integers. Return the updated array length.
Sample Output:
Original array: [1, 4, 6, 7, 6, 2]
The length of the new array is: 4
Click me to see the solution

145. Write a Java program to remove the nth element from the end of a given list.
Sample Output:
Original node:
1 2 3 4 5
After removing 2nd element from end:
1 2 3 5
Click me to see the solution

146. Write a Java program to convert an array of sorted items into a binary search tree. Maintain the minimal height of the tree.
Sample Output:
2
1
4
6
5
3
Click me to see the solution

147. Write a Java program to find the number of bits required to flip to convert two given integers.
Sample Output:
2
Click me to see the solution

148. Write a Java program to find the index of the first unique character in a given string. Assume that there is at least one unique character in the string.
Sample Output:
Original String: wresource
First unique character of the above: 0
Click me to see the solution

149. Write a Java program to check if a given string is a permutation of another given string.
Sample Output:
Original strings: xxyz yxzx
true
Click me to see the solution

150. Write a Java program to test if a binary tree is a subtree of another binary tree.
Sample Output:
Original strings: xxyz yxzx
true
Click me to see the solution

151. Write a Java program to find the value of a specified expression.
a) 101 + 0) / 3
b) 3.0e-6 * 10000000.1
c) true && true
d) false && true
e) (false && false) || (true && true)
f) (false || false) && (true && true)

Expected Output :
(101 + 0) / 3)-> 33
(3.0e-6 * 10000000.1)-> 30.0000003
(true && true)-> true
(false && true)-> false
((false && false) || (true && true))-> true
(false || false) && (true && true)-> false
Click me to see the solution

152. Write a Java program that accepts four integers from the user and prints equal if all four are equal, and not equal otherwise.


Sample Output:
Input first number: 25
Input second number: 37
Input third number: 45
Input fourth number: 23
Numbers are not equal!

Click me to see the solution

153. Write a Java program that accepts two double variables and test if both strictly between 0 and 1 and false otherwise.

Sample Output:
Input first number: 5
Input second number: 1
false

Click me to see the solution

154. Write a Java program to print the contents of a two-dimensional Boolean array where t represents true and f represents false.

Sample array:
array = {{true, false, true},
{false, true, false}};
Expected Output :
t f t
f t f

Click me to see the solution

155. Write a Java program to print an array after changing the rows and columns of a two-dimensional array.

Original Array:
10 20 30
40 50 60
After changing the rows and columns of the said array:10 40
20 50
30 60

Click me to see the solution

156. Write a Java program that returns the largest integer but not larger than the base-2 logarithm of a specified integer.

Original Number: 2350
Result: 115

Click me to see the solution

157. Write a Java program to prove that Euclid’s algorithm computes the greatest common divisor of two integers that have positive values.

According to Wikipedia "The Euclidean algorithm is based on the principle that the greatest common divisor of two numbers does not change if the larger number is replaced by its difference with the smaller number. For example, 21 is the GCD of 252 and 105 (as 252 = 21 × 12 and 105 = 21 × 5), and the same number 21 is also the GCD of 105 and 252 − 105 = 147. Since this replacement reduces the larger of the two numbers, repeating this process gives successively smaller pairs of numbers until the two numbers become equal. When that occurs, they are the GCD of the original two numbers. By reversing the steps, the GCD can be expressed as a sum of the two original numbers each multiplied by a positive or negative integer, e.g., 21 = 5 × 105 + (−2) × 252. The fact that the GCD can always be expressed in this way is known as Bézout's identity."

Expected Output:
result: 24
result: 1

Click me to see the solution

158. Write a Java program to create a two-dimensional array (m x m) A[][] such that A[i][j] is false if I and j are prime otherwise A[i][j] becomes true.

Sample Output:
true true true
true true true
true true false

Click me to see the solution

159. Write a Java program to find the k largest elements in a given array. Elements in the array can be in any order.

Expected Output:
Original Array:
[1, 4, 17, 7, 25, 3, 100]
3 largest elements of the said array are:
100 25 17

Click me to see the solution

160. Write a Java program to find the k smallest elements in a given array. Elements in the array can be in any order.

Expected Output:
Original Array:
[1, 4, 17, 7, 25, 3, 100]
3 largest elements of the said array are:
100 25 17

Click me to see the solution

161. Write a Java program to find the kth smallest and largest element in a given array. Elements in the array can be in any order.

Expected Output:
Original Array:
[1, 4, 17, 7, 25, 3, 100]
K'th smallest element of the said array:
3
K'th largest element of the said array:
25

Click me to see the solution

162. Write a Java program that finds numbers greater than the average of an array.

Expected Output:
Original Array:
[1, 4, 17, 7, 25, 3, 100]
The average of the said array is: 22.0
The numbers in the said array that are greater than the average are:
25
100

Click me to see the solution

163. Write a Java program that will accept an integer and convert it into a binary representation. Now count the number of bits equal to zero in this representation.

Expected Output:
Input first number: 25
Binary representation of 25 is: 11001
Number of zero bits: 2

Click me to see the solution

164. Write a Java program to divide the two given integers using the subtraction operator.

Expected Output:
Input the dividend: 625
Input the divider: 25
Result: 25.0

Click me to see the solution

165. Write a Java program to move every positive number to the right and every negative number to the left of a given array of integers.

Expected Output:
Original array: [-2, 3, 4, -1, -3, 1, 2, -4, 0]
Result: [-4, -3, -2, -1, 0, 1, 2, 3, 4]

Click me to see the solution

166. Write a Java program to transform a given integer into String format.

Expected Output:
Input an integer: 35
String format of the said integer: 35

Click me to see the solution

167. Write a Java program to move every zero to the right side of a given array of integers.

Original array: [0, 3, 4, 0, 1, 2, 5, 0]
Result: [3, 4, 1, 2, 5, 0, 0, 0]

Click me to see the solution

168. Write a Java program to multiply two given integers without using the multiply operator (*).

Input the first number: 25
Input the second number: 5
Result: 125

Click me to see the solution

169. Write a Java program to reverse a sentence (assume a single space between two words) without reverse every word.

Input a string: The quick brown fox jumps over the lazy dog
Result: dog lazy the over jumps fox brown quick The

Click me to see the solution

170. Write a Java program to find the length of the longest consecutive sequence in a given array of integers.

Original array: [1, 1, 2, 3, 3, 4, 5, 2, 4, 5, 6, 7, 8, 9, 6, -1, -2]
7

Click me to see the solution

171. Write a Java program to accept two strings and test if the second string contains the first one.

Input first string: Once in a blue moon
Input second string: See eye to eye
If the second string contains the first one? false

Click me to see the solution

172. Write a Java program to get the number of elements in a given array of integers that are smaller than the integer in another given array of integers.

Expected Output:
0
3
7

Click me to see the solution

173. Write a Java program to find the median of the numbers inside the window (size k) at each step in a given array of integers with duplicate numbers. Move the window to the array start.

Sample Output:
{|1, 2, 3|, 4, 5, 6, 7, 8, 8} -> Return median 2
{1, |2, 3, 4|, 5, 6, 7, 8, 8} -> Return median 3
{1, 2, |3, 4, 5|, 6, 7, 8, 8} -> Return median 4
{1, 2, 3, |4, 5, 6|, 7, 8, 8} -> Return median 5
{1, 2, 3, 4, |5, 6, 7|, 8, 8} -> Return median 6
{1, 2, 3, 4, 5, |6, 7, 8|, 8} -> Return median 7
{1, 2, 3, 4, 5, 6, |7, 8, 8|} -> Return median 8
Result array {2, 3, 4, 5, 6, 7, 8}

Expected Output:

Original array: [1, 2, 3, 4, 5, 6, 7, 8, 8]

Value of k: 3

Result: 
2
3
4
5
6
7
8
Click me to see the solution

174. Write a Java program to find the maximum number inside the number in the window (size k) at each step in a given array of integers with duplicate numbers. Move the window to the top of the array.

Sample output:
{|1, 2, 3|, 4, 5, 6, 7, 8, 8} -> Return maximum 3
{1, |2, 3, 4|, 5, 6, 7, 8, 8} -> Return maximum 4
{1, 2, |3, 4, 5|, 6, 7, 8, 8} -> Return maximum 5
{1, 2, 3, |4, 5, 6|, 7, 8, 8} -> Return maximum 6
{1, 2, 3, 4, |5, 6, 7|, 8, 8} -> Return maximum 7
{1, 2, 3, 4, 5, |6, 7, 8|, 8} -> Return maximum 8
{1, 2, 3, 4, 5, 6, |7, 8, 8|} -> Return maximum 8
Result array {3, 4, 5, 6, 7, 8, 8}

Expected Output:

Original array: [1, 2, 3, 4, 5, 6, 7, 8, 8]

Value of k: 3

Result: 
2
3
4
5
6
7
8
Click me to see the solution

175. Write a Java program to delete a specified node in the middle of a singly linked list.

Sample Singly linked list: 10->20->30->40->50
Delete the fourth node i.e. 40
Result: 10->20->30->50
Expected Output:


Original Linked list:
10->20->30->40->50
After deleting the fourth node, Linked list becomes:
10->20->30->50
Click me to see the solution

176. Write a Java program that partitions an array of integers into even and odd numbers.

Expected Output

Original array: [7, 2, 4, 1, 3, 5, 6, 8, 2, 10]
After partition the said array becomes: [10, 2, 4, 2, 8, 6, 5, 3, 1, 7]
Click me to see the solution

177. Write a Java program to get an updated binary tree with the same structure and value as a given binary tree.

Expected Output:

Original Treenode:
4
5
2
3
1

Clone of the said Treenode:
4
5
2
3
1
Click me to see the solution

178. Write a Java program to find the longest increasing continuous subsequence in a given array of integers.

Expected Output:

Original array: [10, 11, 12, 13, 14, 7, 8, 9, 1, 2, 3]
Size of longest increasing continuous subsequence: 5
Click me to see the solution

179. Write a Java program to add one to a positive number represented as an array of digits.

Sample array: [9, 9, 9, 9] which represents 9999
Output: [1, 0, 0, 0, 0].

Expected Output:

Original array: [9, 9, 9, 9]
Array of digits: [1, 0, 0, 0, 0]
Click me to see the solution

180. Write a Java program to swap two adjacent nodes in a linked list.

Expected Output:

Original Linked list:
10->20->30->40->50

After swiping Linked list becomes:
20->10->40->30->50
Click me to see the solution

181. Write a Java program to find the length of the last word in a given string. The string contains upper/lower-case alphabets and empty space characters like ' '.

Sample Output:

Original String: The length of last word
Length of the last word of the above string: 4
Click me to see the solution

182. Write a Java program to check if two binary trees are identical. Assume that two binary trees have the same structure and every identical position has the same value.

Sample Output:

Comparing TreeNode a and TreeNode b:
false

Comparing TreeNode b and TreeNode c:
true
Click me to see the solution

183. Write a Java program to accept a positive number and repeatedly add all its digits until the result has only one digit.

Expected Output:

Input a positive integer:  25
7
Click me to see the solution

184. Write a Java program to find the length of the longest consecutive sequence path in a given binary tree.
Note: The longest consecutive path need to be from parent to child.

Java Basic Exercises: Find the length of the longest consecutive sequence path of a given binary tree.
Expected Output:

Length of the longest consecutive sequence path:  4
Click me to see the solution

185. Write a Java program to check if two strings are isomorphic or not.
Expected Output:

Is abca and zbxz are Isomorphic? true
Click me to see the solution

186. Write a Java program to check if a number is a strobogrammatic number. The number is represented as a string.

According to Wikipedia "A strobogrammatic number is a number whose numeral is rotationally symmetric, so that it appears the same when rotated 180 degrees. In other words, the numeral looks the same right-side up and upside down (e.g., 69, 96, 1001). A strobogrammatic prime is a strobogrammatic number that is also a prime number, i.e., a number that is only divisible by one and itself (e.g., 11). It is a type of ambigram, words and numbers that retain their meaning when viewed from a different perspective, such as palindromes."
The first few strobogrammatic numbers are:
0, 1, 8, 11, 69, 88, 96, 101, 111, 181, 609, 619, 689, 808, 818, 888, 906, 916, 986, 1001, 1111, 1691, 1881, 1961, 6009, 6119, 6699, 6889, 6969, 8008, 8118, 8698, 8888, 8968, 9006, 9116, 9696, 9886, 9966, ...

Expected Output:

Is 9006 is Strobogrammatic? true
Click me to see the solution

187. Write a Java program to find the index of the first non-repeating character in a given string.

Expected Output:

Index of first non-repeating character in 'google' is: 4
Click me to see the solution

188. Write a Java program to find all the start indices of a given string's anagrams in another given string.

Expected Output:

Original String: zyxwyxyxzwxyz
Starting anagram indices of xyz: [0, 6, 10]
Click me to see the solution

189. Write a Java program to two non-negative integers num1 and num2 represented as strings, return the sum of num1 and num2.

Expected Output:

'123' + '456' = 579
Click me to see the solution

190. Write a Java program to find the missing string from two given strings.

Expected Output:

Missing string: [Solution]
Click me to see the solution

191. Write a Java program to test whether there are two integers x and y such that x^2 + y^2 is equal to a given positive number.

Expected Output:

Input a positive integer:  25
Is 25 sum of two square numbers? true
Click me to see the solution

192. Write a Java program to rearrange the alphabets in the order followed by the sum of digits in a given string containing uppercase alphabets and integer digits (from 0 to 9).

Expected Output:

ADEHNS23
Click me to see the solution

193. Write a Java program that accepts an integer and sums the elements from all possible subsets of a set formed by the first n natural numbers.

Expected Output:

Input a positive integer:  25
Sum of subsets of n is : 1157627904
Click me to see the solution

194. Write a Java program to determine the all positions of a given number in a given matrix. If the number is not found print ("Number not found!").

Expected Output:

(0,2)

(1,0)

(2,1)
Click me to see the solution

195. Write a Java program to check if three given side lengths (integers) can make a triangle or not.

Expected Output:

Input side1:  5
Input side2:  6
Input side3:  8
Is the said sides form a triangle: true 
Click me to see the solution

196. rite a Java program to create a spiral array of n * n sizes from a given integer n.

Expected Output:

 Input a number:  5
Spiral array becomes:
1 2 3 4 5
16 17 18 19 6
15 24 25 20 7
14 23 22 21 8
13 12 11 10 9
Click me to see the solution

197. Write a Java program to test if a given number (positive integer) is a perfect square or not.

Expected Output:

Input a positive integer:  6
Is the said number perfect square? false 
Click me to see the solution

198. Write a Java program to calculate the position of a given prime number.

Expected Output:

Input a positive integer:  15
Position of the said Prime number: 6
Click me to see the solution

199. Write a Java program to check if a string follows a given pattern.

Example pattern:
Given pattern = "xyyx", str = "red black black red", return true.
Given pattern = "xyyx", str = "red black black green", return false.
Given pattern = "xxxx", str = "red black black red", return false.
Given pattern = "xxxx", str = "red red red red", return true.

Expected Output:

Is the string and pattern matched? false
Click me to see the solution

200. Write a Java program to remove duplicate letters and arrange them in lexicographical order from a given string containing only lowercase letters.

Note: In mathematics, the lexicographic or lexicographical order (also known as lexical order, dictionary order, alphabetical order or lexicographic(al) product) is a generalization of the way words are alphabetically ordered based on the alphabetical order of their component letters.

Expected Output:

Original string: zxywooxz
After removing duplicate characters: xywoz
Click me to see the solution

201. Write a Java program to divide a given array of integers into given k non-empty subsets whose sums are all equal. Return true if all sums are equal otherwise return false.

Example:
nums = {1,3,3,5,6,6}, k = 4;
4 subsets (5,1), (3, 3), (6), (6) with equal sums.

Expected Output:

Original Array: [1, 3, 3, 5, 6, 6]
Target of subsets: 4
After removing duplicate characters: true
Click me to see the solution

202. Write a Java program to find the total number of continuous subarrays in a given array of integers whose sum equals an integer.

Expected Output:

Original Array: [4, 2, 3, 3, 7, 2, 4]
Value of k: 6
Total number of continuous subarrays: 3
Click me to see the solution

203. Write a Java program to find the contiguous subarray of given length k which has the maximum average value of a given array of integers. Display the maximum average value.

Expected Output:

Original Array: [4, 2, 3, 3, 7, 2, 4]
Value of k: 3
Maximum average value: 4.333333333333333
Click me to see the solution

204. Write a Java program to compute xn % y where x, y and n are all 32-bit integers.

Expected Output:

Input x :  25
Input n :  35
Input y :  45
x^n % y = 5.0
Click me to see the solution

205. Write a Java program to check whether an integer is a power of 2 or not using O(1) time.

Note: O(1) means that it takes a constant time, like 12 nanoseconds, or two minutes no matter the amount of data in the set.
O(n) means it takes an amount of time linear with the size of the set, so a set twice the size will take twice the time. You probably don't want to put a million objects into one of these.

Expected Output:

Input a number :  25
false
Click me to see the solution

206. From Wikipedia,
A cyclic redundancy check (CRC) is an error-detecting code commonly used in digital networks and storage devices to detect accidental changes to raw data. Blocks of data entering these systems get a short check value attached, based on the remainder of a polynomial division of their contents. On retrieval, the calculation is repeated and, in the event the check values do not match, corrective action can be taken against data corruption. CRCs can be used for error correction.
Example:

Write a Java program to generate a CRC32 checksum of a given string or byte array.
Input:
Input a string:  The quick brown fox
crc32 checksum of the string: b74574de
Click me to see the solution

207. Write a Java program to merge two sorted (ascending) linked lists in ascending order.

Expected Output:

How many elements do you want to add in 1st linked list?:  3
Input numbers of 1st linked list in ascending order:  1 2 3

How many elements do you want to add in 2nd linked list?:  3
Input numbers of 2nd linked list in ascending order:  4 5 6

Merged list: 1 2 3 4 5 6 
Click me to see the solution

208. Write a Java program to create a basic string compression method using repeated character counts.

Input string: aaaabbbbcccccddddeeee

Expected Output:

Enter a string (you can include space as well)
 aaaabbbbcccccddddeeee
The compressed string along with the counts of repeated characters is:
a4b4c5d4e4
Click me to see the solution

209. Write a Java program to find all unique combinations from a collection of candidate numbers. The sum of the numbers will equal a given target number.

Input number of elements of the array:
3
Input number format: 2 3 4 5:

Expected Output:

Enter elements:
 6 7 8
Enter target sum:
 21
A solution set is:
{ 6 7 8 }
Click me to see the solution

210. Write a Java program to match any single character (use ?) or any sequence of characters (use *) including empty. The matching should cover the entire input string.

Expected Output:

Enter a string
 bb
Enter a pattern
 b*
Yes
Click me to see the solution

211. Write a Java program to find the heights of the top three buildings in descending order from eight given buildings.

Input:

0 ≤ height of building (integer) ≤ 10,000

Expected Output:

Input the heights of eight buildings:
 25 19 23 45 18 23 24 19

Heights of the top three buildings:
45
25
24
Click me to see the solution

212. Write a Java program to compute the digit number of the sum of two given integers.

Input:

Each test case consists of two non-negative integers a and b which are separated by a space in a line. 0 ≤ a, b ≤ 1,000,000

Expected Output:

Input two integers(a b):
 13 25
Digit number of sum of said two integers:
2
Click me to see the solution

213. Write a Java program to check whether three given lengths (integers) of three sides form a right triangle. Print "Yes" if the given sides form a right triangle otherwise print "No".

Input:

Each test case consists of two non-negative integers a and b which are separated by a space in a line. 0 ≤ a, b ≤ 1,000,000

Expected Output:

Input three integers(sides of a triangle)
 6 9 12
If the given sides form a right triangle?
No
Click me to see the solution

214. Write a Java program which solve the equation:
ax+by=c
dx+ey=f
Print the values of x, y where a, b, c, d, e and f are given.

Input:

a,b,c,d,e,f separated by a single space.
(-1,000 ≤ a,b,c,d,e,f ≤ 1,000)

Expected Output:

Input the value of a, b, c, d, e, f:
 5 6 8 9 7 4
-1.684 2.737
Click me to see the solution

215. Write a Java program to compute the debt amount in n months. Monthly, the loan adds 4% interest to the $100,000 borrowed and rounds it to the nearest 1,000.

Input:

An integer n (0 ≤ n ≤ 100)

Expected Output:

Input number of months:
 6

Amount of debt: 
129000
Click me to see the solution

216. Write a Java program which reads an integer n and finds the number of combinations of a,b,c and d (0 ≤ a,b,c,d ≤ 9) where (a + b + c + d) equals n.

Input:

a,b,c,d,e,f separated by a single space.
(-1,000 ≤ a,b,c,d,e,f ≤ 1,000)

Expected Output:

Input the number(n):
 5 
Number of combinations of a, b, c and d :
56
Click me to see the solution

217. Write a Java program to print the number of prime numbers less than or equal to a given integer.

Input:

n (1 ≤ n ≤ 999,999)

Expected Output:

Input the number(n):
 1235
Number of prime numbers which are less than or equal to n.:
202
Click me to see the solution

218. Write a Java program to compute the radius and central coordinates (x, y) of a circle constructed from three given points on the plane surface.

Input:

x1, y1, x2, y2, x3, y3 separated by a single space.

Expected Output:

Input x1, y1, x2, y2, x3, y3 separated by a single space:
 5 6 4 8 7 9

Radius and the central coordinate:
1.821 (5.786 7.643)                     
Click me to see the solution

219. Write a Java program to check if a point (x, y) is in a triangle or not. A triangle is formed by three points.

Input:

x1, y1, x2, y2, x3, y3 separated by a single space.

Expected Output:

Input (x1, y1)
2
6
Input (x2, y2)
3
5
Input (x3, y3)
4
6
Input (xp, yp)
5
6
The point is outside the triangle.                    
Click me to see the solution

220. Write a Java program to compute and print the sum of two given integers (more than or equal to zero). If the given integers or the sum have more than 80 digits, print "overflow".

Input:

Expected Output:

Input two integers:
25
46

Sum of the said two integers:
71                   
Click me to see the solution

221. Write a Java program that accepts six numbers as input and sorts them in descending order.

Input:

Input consists of six numbers n1, n2, n3, n4, n5, n6 (-100000 ≤ n1, n2, n3, n4, n5, n6 ≤ 100000). The six numbers are separated by a space.

Expected Output:

  Input six integers:
 4 6 8 2 7 9
After sorting the said integers:
9 8 7 6 4 2                   
Click me to see the solution

222. Write a Java program to test whether two lines PQ and RS are parallel. The four points are P(x1, y1), Q(x2, y2), R(x3, y3), and S(x4, y4).

Input:

−100 ≤ x1, y1, x2, y2, x3, y3, x4, y4 ≤ 100
Each value is a real number with at most 5 digits after the decimal point.

Expected Output:

Input P(x1,y1),separated by a space.
 5 6
Input Q(x2,y2),separated by a space.
 4 2
Input R(x3,y3),separated by a space.
 5 3
Input S(x4,y4),separated by a space.
 5 6
Two lines are not parallel.             
Click me to see the solution

223. Write a Java program to find the maximum sum of a contiguous subsequence from a given sequence of numbers a1, a2, a3, ... an. A subsequence of one element is also a continuous subsequence.

Input:

You can assume that 1 ≤ n ≤ 5000 and -100000 ≤ ai ≤ 100000.
Input numbers are separated by a space.
Input 0 to exit.

Expected Output:

How many integers would you like to input?
 5
Input the integers:
 25 61 35 42 66
Maximum sum of the said contiguous subsequence:
229             
Click me to see the solution

224. There are two circles C1 with radius r1, central coordinate (x1, y1) and C2 with radius r2 and central coordinate (x2, y2).
Write a Java program to test the followings -
"C2 is in C1" if C2 is in C1
"C1 is in C2" if C1 is in C2
"Circumference of C1 and C2 intersect" if circumference of C1 and C2 intersect, and
"C1 and C2 do not overlap" if C1 and C2 do not overlap.

Input:

Input numbers (real numbers) are separated by a space.

Expected Output:

Input x1, y1, r1: (numbers are separated by a space)
 5 6 8 7
Input x2, y2, r2: (numbers are separated by a space)
 8 9 5 4
C1 and C2  do not overlap      
Click me to see the solution

225. Write a Java program that reads a date (from 2004/1/1 to 2004/12/31) and prints the day of the date. Jan. 1, 2004, was Thursday. Note that 2004 is a leap year.

Expected Output:

Input the month(1-12)
 9
Input date (1-31)
 15
Name of the date: 
Wednesday
Click me to see the solution

226. Write a Java program to print mode values from a given sequence of integers. The mode value is the element that occurs most frequently. If there are several mode values, print them in ascending order.

Input:

A sequence of integer’s ai (1 ≤ ai ≤ 100). The number of integers is less than or equals to 100.

Expected Output:

How many integers would you like to input(Max.100?)
5
Input the integers:
25
35
15
5
45
Mode value(s)in ascending order:
5
15
25
35
45
Click me to see the solution

227. Write a Java program that reads a text (only alphabetical characters and spaces) and prints two words. The first one is the word which is frequently used in the text. The second one is the word with the most letters.
Note: A word is a sequence of letters which is separated by the spaces.

Input:

A sequence of integer’s ai (1 ≤ ai ≤ 100). The number of integers is less than or equals to 100.

Expected Output:

Thank you for your comment and your participation.
Input a text in a line:
Most frequent text and the word which has the maximum number of letters:
your participation.
Click me to see the solution

228. Write a Java program that reads n digits (given) chosen from 0 to 9 and prints the number of combinations where the sum of the digits equals another given number (s). Do not use the same digits in a combination.
For example, the combinations where n = 3 and s = 6 are as follows:
1 + 2 + 3 = 6
0 + 1 + 5 = 6
0 + 2 + 4 = 6

Input:

Two integers as number of combinations and their sum by a single space in a line. Input 0 0 to exit.

Expected Output:

Input number of combinations and sum (separated by a space in a line):
3 6
Number of combinations:
3
Click me to see the solution

229. Write a Java program that reads the two adjoining sides and the diagonal of a parallelogram. It will check whether the parallelogram is a rectangle or a rhombus.
According to Wikipedia-
parallelograms: In Euclidean geometry, a parallelogram is a simple (non-self-intersecting) quadrilateral with two pairs of parallel sides. The opposite or facing sides of a parallelogram are of equal length and the opposite angles of a parallelogram are of equal measure.
rectangles: In Euclidean plane geometry, a rectangle is a quadrilateral with four right angles. It can also be defined as an equiangular quadrilateral, since equiangular means that all of its angles are equal (360°/4 = 90°). It can also be defined as a parallelogram containing a right angle.
rhombus: In plane Euclidean geometry, a rhombus (plural rhombi or rhombuses) is a simple (non-self-intersecting) quadrilateral whose four sides all have the same length. Another name is equilateral quadrilateral, since equilateral means that all of its sides are equal in length. The rhombus is often called a diamond, after the diamonds suit in playing cards which resembles the projection of an octahedral diamond, or a lozenge, though the former sometimes refers specifically to a rhombus with a 60° angle (see Polyiamond), and the latter sometimes refers specifically to a rhombus with a 45° angle.

Input:

Two adjoined sides and the diagonal.
1 ≤ ai, bi, ci ≤ 1000, ai + bi > ci

Expected Output:

Input two adjoined sides and the diagonal of a parallelogram (comma separated):
8,8,8
This is a rhombus.
Click me to see the solution

230. Write a Java program to replace a string "python" with "java" and "java" with "python" in a given string.

Input:

English letters (including single byte alphanumeric characters, blanks, symbols) are given on one line. The length of the input character string is 1000 or less.
Output:
Exchanged character string of python and java on one line.

Expected Output:

Input the string:
python is more propular than java
New string:
java is more propular than python
Click me to see the solution

231. Write a Java program to find the difference between the largest integer and the smallest integer. These integers are created by 8 numbers from 0 to 9. The number that can be rearranged starts with 0 as in 00135668.

Input:

Data is a sequence of 8 numbers (numbers from 0 to 9).
Output:
The difference between the largest integer and the smallest integer.

Sample Output:

Input an integer created by 8 numbers from 0 to 9:
567894321
Difference between the largest and the smallest integer from the given integer:
75308643
Click me to see the solution

232. Write a Java program to compute the sum of the first n prime numbers.

Input:

n ( n ≤ 10000). Input 0 to exit the program.

Sample Output:

Input a number (n<=10000) to compute the sum:
100
Sum of first 100 prime numbers:
24133
Click me to see the solution

233. Write a Java program that accepts an even number (n should be greater than or equal to 4 and less than or equal to 50,000, a Goldbach number) from the user and creates combinations that express the given number as a sum of two prime numbers. Print the number of combinations.

Goldbach number: A Goldbach number is a positive even integer that can be expressed as the sum of two odd primes.[4] Since four is the only even number greater than two that requires the even prime 2 in order to be written as the sum of two primes, another form of the statement of Goldbach's conjecture is that all even integers greater than 4 are Goldbach numbers.
The expression of a given even number as a sum of two primes is called a Goldbach partition of that number. The following are examples of Goldbach partitions for some even numbers:
6 = 3 + 3
8 = 3 + 5
10 = 3 + 7 = 5 + 5
12 = 7 + 5
...
100 = 3 + 97 = 11 + 89 = 17 + 83 = 29 + 71 = 41 + 59 = 47 + 53

Sample Output:

Input an even number: 100

Number of combinations: 6
Click me to see the solution

234. If you draw a straight line on a plane, the plane is divided into two regions. For example, if you draw two straight lines in parallel, you get three areas. If you draw vertically from one to the other you get 4 areas.

Write a Java program to create the maximum number of regions obtained by drawing n given straight lines.
Input:
xp,yp, xq, yq, xr, yr, xs and ys are -100 to 100 respectively and each value can be up to 5 digits after the decimal point It is given as a real number including the number of.
Output: Yes or No.

Sample Output:

Input number of straight lines:
5
Number of regions:
16
Click me to see the solution

235. There are four different points on a plane: P(xp, yp), Q(xq, yq), R(xr, yr) and S(xs, ys). Write a Java program to test whether AB and CD are orthogonal or not.

Input:
xp,yp, xq, yq, xr, yr, xs and ys are -100 to 100 respectively and each value can be up to 5 digits after the decimal point It is given as a real number including the number of.
Output: Yes or No.
Sample Output:

Input xp, yp, xq, yq, xr, yr, xs, ys:
3.5 4.5 2.5 -1.5 3.5 1.0 0.0 4.5
Two lines are not orthogonal.
Click me to see the solution

236. Write a Java program to sum all numerical values (positive integers) embedded in a sentence.

Input:
Sentences with positive integers are given over multiple lines. Each line is a character string containing one-byte alphanumeric characters, symbols, spaces, or an empty line. However the input is 80 characters or less per line and the sum is 10,000 or less.

Sample Output:

Input some text and numeric values:
5 apple and 10 orange are rotten in the basket

Sum of the numeric values:
15
Click me to see the solution

237. There are 10 vertical and horizontal squares on a plane. Each square is painted in blue and green. Blue represents the sea, and green represents the land. When two green squares are in contact with the top and bottom, or right and left, they are ground. The area created by only one green square is called an "island". For example, the figure below shows five islands.
Write a Java program to read the mass data and find the number of islands. .

Input:
A single data set is represented by 10 rows of 10 numbers representing green squares as 1 and blue squares as zeros.
Output: For each data set, output the number of islands.

Sample Output:

Input 10 rows of 10 numbers representing green squares (island) as 1 and blue squares (sea) as zeros
1100000111
1000000111
0000000111
0010001000
0000011100
0000111110
0001111111
1000111110
1100011100
1110001000
Number of islands:
5
Click me to see the solution

238. When characters are consecutive in a string, it is possible to shorten it by replacing them with a certain rule. For example, the character string YYYYY, if it is expressed as # 5 Y, it is compressed by one character.
Write a Java program to restore the original string by entering the compressed string with this rule. However, the # character does not appear in the restored character string.
Note: The original sentences are uppercase letters, lowercase letters, numbers, symbols, less than 100 letters, and consecutive letters are not more than 9 letters.

Input:
Multiple character strings are given. One string is given per line.
Output: The restored character string for each character on one line.

Sample Output:

Input the text:
XY#6Z1#4023
XYZZZZZZ1000023
Click me to see the solution

239. A search engine giant such as Google accepts thousands of web pages from around the world and categorizes them, creating a huge database of information. Search engines also analyze search keywords entered by the user and create database queries based on those keywords. In both cases, complicated processing is carried out to realize efficient retrieval, but the basics are all about cutting out words from sentences.
Write a Java program to cut out words of 3 to 6 characters length from a given sentence not more than 1024 characters.

Input:
English sentences consisting of delimiters and alphanumeric characters are given on one line.
Output: Output a word delimited by one space character on one line.

Sample Output:

Input a sentence (1024 characters. max.)
The quick brown fox

3 to 6 characters length of words:
The quick brown fox
Click me to see the solution

240. As shown in Figure 1, arrange integers (0 to 99) as narrow hilltops. When reading such data from top to bottom, following the next rule represents a huge amount of data.
Write a Java program that computes the maximum value of the sum of the passing integers.

Input:
A series of integers separated by commas are given in diamonds. No spaces are included in each line. The input example corresponds to Figure 1. The number of lines of data is less than 100 lines.
Output: The maximum value of the sum of integers passing according to the rule on one line.

Sample Output:

Input the numbers (ctrl+c to exit):
8
4,9
9,2,1
3,8,5,5
5,6,3,7,6
3,8,5,5
9,2,1
4,9
8
Maximum value of the sum of integers passing according to the rule on one line.
64
Click me to see the solution

241. Write a Java program to find the number of combinations that satisfy p + q + r + s = n where n is a given number <= 4000 and p, q, r, s range from 0 to 1000.

Sample Output:

Input a positive integer:
252
Number of combinations of a,b,c,d:
2731135
Click me to see the solution

242. Your task is to develop a small piece of spreadsheet software. Write a Java program that adds up the columns and rows of a given table as shown in the specified figure:

Input number of rows/columns (0 to exit)
4
25 69 51 26
68 35 29 54
54 57 45 63
61 68 47 59
Result:
   25   69   51   26  171
   68   35   29   54  186
   54   57   45   63  219
   61   68   47   59  235
  208  229  172  202  811
Click me to see the solution

243. Write a Java program that reads a list of pairs of a word and a page number. It prints the words and a list of page numbers.

Input:
Input pairs of a word and a page number:
apple 5
banana 6

Word and page number in alphabetical order:
apple
5
banana
6
Click me to see the solution

244. Write a Java program that accepts a string from the user and checks whether it is correct or not.

The conditions for getting the "correct answer" are:
a) There must be only three characters X, Y, and Z in the string, and no other characters.
b) Any string of any form such as aXYZa can get the "correct answer", where a is either an empty string or a string consisting only of the letter X;
c) If aXbZc is true, aXbYZca is also valid, where a, b, c are either empty strings or a string consisting only of the letter X.

Input:
Input a string:
 XYZ
Correct format..
Click me to see the solution

245. Write a Java program that accepts students' names, ids, and marks and displays their highest and lowest scores.

The student name and id are all strings of no more than 10 characters. The score is an integer between 0 and 100.

Input:
Input number of students:
3
Input Student Name, ID, Score:
Devid v1 72
Peter v2 68
Johnson v3 85
name, ID of the highest score and the lowest score:
Johnson v3
Peter v2
Click me to see the solution

246. Let us use the letter H to mean "hundred", the letter T to mean "ten" and “1, 2, . . . n” to represent the one digit n (<10). Using the given format, write a Java program that converts 3 digits positive numbers. For example, 234 should be output as BBSSS1234 because it has 2 "hundreds", 3 "ten", and 4 ones.

The student name and id are all strings of no more than 10 characters. The score is an integer between 0 and 100.

Input:
235
230
Output:
HHTTT12345
HHTTT

Input a positive number(max three digits):
235
Result:
HHTTT12345
Click me to see the solution

247. Write a Java program that accepts three integers and checks whether the sum of the first two integers is greater than the third integer. Three integers are in the interval [-231, 231 ].

Input:
Input three integers (a,b,c):
5 8 9
Check whether (a + b) is greater than c?
true
Click me to see the solution

248. From Wikipedia, An abecedarium (or abecedary) is an inscription consisting of the letters of an alphabet, almost always listed in order. Typically, abecedaria (or abecedaries) are practice exercises.
Write a Java program to check if each letter of a given word (Abecadrian word) is less than the one before it.

Input:
Input a word:  ABCD
Is Abecadrian word? true
Click me to see the solution

249. From Wikipedia,
The Hamming weight of a string is the number of symbols that are different from the zero-symbol of the alphabet used. It is thus equivalent to the Hamming distance from the all-zero string of the same length. For the most typical case, a string of bits, this is the number of 1's in the string, or the digit sum of the binary representation of a given number and the ℓ₁ norm of a bit vector. In this binary case, it is also called the population count, popcount, sideways sum, or bit summation.
Example:

String	Hamming weight
11101	4
11101000	4
00000000	0
789012340567	10
Write a Java program to count the number of set bits in a 32-bit integer.
Input:
Input a number:  1427
6
Click me to see the solution
