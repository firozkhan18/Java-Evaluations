https://www.w3resource.com/java-exercises/basic/index1.php

### 151. Write a Java program to find the value of a specified expression.
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


### 152. Write a Java program that accepts four integers from the user and prints equal if all four are equal, and not equal otherwise.


Sample Output:
Input first number: 25
Input second number: 37
Input third number: 45
Input fourth number: 23
Numbers are not equal!



### 153. Write a Java program that accepts two double variables and test if both strictly between 0 and 1 and false otherwise.

Sample Output:
Input first number: 5
Input second number: 1
false



### 154. Write a Java program to print the contents of a two-dimensional Boolean array where t represents true and f represents false.

Sample array:
array = {{true, false, true},
{false, true, false}};
Expected Output :
t f t
f t f



### 155. Write a Java program to print an array after changing the rows and columns of a two-dimensional array.

Original Array:
10 20 30
40 50 60
After changing the rows and columns of the said array:10 40
20 50
30 60



### 156. Write a Java program that returns the largest integer but not larger than the base-2 logarithm of a specified integer.

Original Number: 2350
Result: 115



### 157. Write a Java program to prove that Euclid’s algorithm computes the greatest common divisor of two integers that have positive values.

According to Wikipedia "The Euclidean algorithm is based on the principle that the greatest common divisor of two numbers does not change if the larger number is replaced by its difference with the smaller number. For example, 21 is the GCD of 252 and 105 (as 252 = 21 × 12 and 105 = 21 × 5), and the same number 21 is also the GCD of 105 and 252 − 105 = 147. Since this replacement reduces the larger of the two numbers, repeating this process gives successively smaller pairs of numbers until the two numbers become equal. When that occurs, they are the GCD of the original two numbers. By reversing the steps, the GCD can be expressed as a sum of the two original numbers each multiplied by a positive or negative integer, e.g., 21 = 5 × 105 + (−2) × 252. The fact that the GCD can always be expressed in this way is known as Bézout's identity."

Expected Output:
result: 24
result: 1



### 158. Write a Java program to create a two-dimensional array (m x m) A[][] such that A[i][j] is false if I and j are prime otherwise A[i][j] becomes true.

Sample Output:
true true true
true true true
true true false



### 159. Write a Java program to find the k largest elements in a given array. Elements in the array can be in any order.

Expected Output:
Original Array:
[1, 4, 17, 7, 25, 3, 100]
3 largest elements of the said array are:
100 25 17



### 160. Write a Java program to find the k smallest elements in a given array. Elements in the array can be in any order.

Expected Output:
Original Array:
[1, 4, 17, 7, 25, 3, 100]
3 largest elements of the said array are:
100 25 17



### 161. Write a Java program to find the kth smallest and largest element in a given array. Elements in the array can be in any order.

Expected Output:
Original Array:
[1, 4, 17, 7, 25, 3, 100]
K'th smallest element of the said array:
3
K'th largest element of the said array:
25



### 162. Write a Java program that finds numbers greater than the average of an array.

Expected Output:
Original Array:
[1, 4, 17, 7, 25, 3, 100]
The average of the said array is: 22.0
The numbers in the said array that are greater than the average are:
25
100



### 163. Write a Java program that will accept an integer and convert it into a binary representation. Now count the number of bits equal to zero in this representation.

Expected Output:
Input first number: 25
Binary representation of 25 is: 11001
Number of zero bits: 2



### 164. Write a Java program to divide the two given integers using the subtraction operator.

Expected Output:
Input the dividend: 625
Input the divider: 25
Result: 25.0



### 165. Write a Java program to move every positive number to the right and every negative number to the left of a given array of integers.

Expected Output:
Original array: [-2, 3, 4, -1, -3, 1, 2, -4, 0]
Result: [-4, -3, -2, -1, 0, 1, 2, 3, 4]



### 166. Write a Java program to transform a given integer into String format.

Expected Output:
Input an integer: 35
String format of the said integer: 35



### 167. Write a Java program to move every zero to the right side of a given array of integers.

Original array: [0, 3, 4, 0, 1, 2, 5, 0]
Result: [3, 4, 1, 2, 5, 0, 0, 0]



### 168. Write a Java program to multiply two given integers without using the multiply operator (*).

Input the first number: 25
Input the second number: 5
Result: 125



### 169. Write a Java program to reverse a sentence (assume a single space between two words) without reverse every word.

Input a string: The quick brown fox jumps over the lazy dog
Result: dog lazy the over jumps fox brown quick The



### 170. Write a Java program to find the length of the longest consecutive sequence in a given array of integers.

Original array: [1, 1, 2, 3, 3, 4, 5, 2, 4, 5, 6, 7, 8, 9, 6, -1, -2]
7



### 171. Write a Java program to accept two strings and test if the second string contains the first one.

Input first string: Once in a blue moon
Input second string: See eye to eye
If the second string contains the first one? false



### 172. Write a Java program to get the number of elements in a given array of integers that are smaller than the integer in another given array of integers.

Expected Output:
0
3
7



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


### 174. Write a Java program to find the maximum number inside the number in the window (size k) at each step in a given array of integers with duplicate numbers. Move the window to the top of the array.

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


### 175. Write a Java program to delete a specified node in the middle of a singly linked list.

Sample Singly linked list: 10->20->30->40->50
Delete the fourth node i.e. 40
Result: 10->20->30->50
Expected Output:


Original Linked list:
10->20->30->40->50
After deleting the fourth node, Linked list becomes:
10->20->30->50


### 176. Write a Java program that partitions an array of integers into even and odd numbers.

Expected Output

Original array: [7, 2, 4, 1, 3, 5, 6, 8, 2, 10]
After partition the said array becomes: [10, 2, 4, 2, 8, 6, 5, 3, 1, 7]


### 177. Write a Java program to get an updated binary tree with the same structure and value as a given binary tree.

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


### 178. Write a Java program to find the longest increasing continuous subsequence in a given array of integers.

Expected Output:

Original array: [10, 11, 12, 13, 14, 7, 8, 9, 1, 2, 3]
Size of longest increasing continuous subsequence: 5


### 179. Write a Java program to add one to a positive number represented as an array of digits.

Sample array: [9, 9, 9, 9] which represents 9999
Output: [1, 0, 0, 0, 0].

Expected Output:

Original array: [9, 9, 9, 9]
Array of digits: [1, 0, 0, 0, 0]


### 180. Write a Java program to swap two adjacent nodes in a linked list.

Expected Output:

Original Linked list:
10->20->30->40->50

After swiping Linked list becomes:
20->10->40->30->50


### 181. Write a Java program to find the length of the last word in a given string. The string contains upper/lower-case alphabets and empty space characters like ' '.

Sample Output:

Original String: The length of last word
Length of the last word of the above string: 4


### 182. Write a Java program to check if two binary trees are identical. Assume that two binary trees have the same structure and every identical position has the same value.

Sample Output:

Comparing TreeNode a and TreeNode b:
false

Comparing TreeNode b and TreeNode c:
true


### 183. Write a Java program to accept a positive number and repeatedly add all its digits until the result has only one digit.

Expected Output:

Input a positive integer:  25
7


### 184. Write a Java program to find the length of the longest consecutive sequence path in a given binary tree.
Note: The longest consecutive path need to be from parent to child.

Java Basic Exercises: Find the length of the longest consecutive sequence path of a given binary tree.
Expected Output:

Length of the longest consecutive sequence path:  4


### 185. Write a Java program to check if two strings are isomorphic or not.
Expected Output:

Is abca and zbxz are Isomorphic? true


### 186. Write a Java program to check if a number is a strobogrammatic number. The number is represented as a string.

According to Wikipedia "A strobogrammatic number is a number whose numeral is rotationally symmetric, so that it appears the same when rotated 180 degrees. In other words, the numeral looks the same right-side up and upside down (e.g., 69, 96, 1001). A strobogrammatic prime is a strobogrammatic number that is also a prime number, i.e., a number that is only divisible by one and itself (e.g., 11). It is a type of ambigram, words and numbers that retain their meaning when viewed from a different perspective, such as palindromes."
The first few strobogrammatic numbers are:
0, 1, 8, 11, 69, 88, 96, 101, 111, 181, 609, 619, 689, 808, 818, 888, 906, 916, 986, 1001, 1111, 1691, 1881, 1961, 6009, 6119, 6699, 6889, 6969, 8008, 8118, 8698, 8888, 8968, 9006, 9116, 9696, 9886, 9966, ...

Expected Output:

Is 9006 is Strobogrammatic? true


### 187. Write a Java program to find the index of the first non-repeating character in a given string.

Expected Output:

Index of first non-repeating character in 'google' is: 4


### 188. Write a Java program to find all the start indices of a given string's anagrams in another given string.

Expected Output:

Original String: zyxwyxyxzwxyz
Starting anagram indices of xyz: [0, 6, 10]


### 189. Write a Java program to two non-negative integers num1 and num2 represented as strings, return the sum of num1 and num2.

Expected Output:

'123' + '456' = 579


### 190. Write a Java program to find the missing string from two given strings.

Expected Output:

Missing string: [Solution]


### 191. Write a Java program to test whether there are two integers x and y such that x^2 + y^2 is equal to a given positive number.

Expected Output:

Input a positive integer:  25
Is 25 sum of two square numbers? true


### 192. Write a Java program to rearrange the alphabets in the order followed by the sum of digits in a given string containing uppercase alphabets and integer digits (from 0 to 9).

Expected Output:

ADEHNS23


### 193. Write a Java program that accepts an integer and sums the elements from all possible subsets of a set formed by the first n natural numbers.

Expected Output:

Input a positive integer:  25
Sum of subsets of n is : 1157627904


### 194. Write a Java program to determine the all positions of a given number in a given matrix. If the number is not found print ("Number not found!").

Expected Output:

(0,2)

(1,0)

(2,1)


### 195. Write a Java program to check if three given side lengths (integers) can make a triangle or not.

Expected Output:

Input side1:  5
Input side2:  6
Input side3:  8
Is the said sides form a triangle: true 


### 196. rite a Java program to create a spiral array of n * n sizes from a given integer n.

Expected Output:

 Input a number:  5
Spiral array becomes:
1 2 3 4 5
16 17 18 19 6
15 24 25 20 7
14 23 22 21 8
13 12 11 10 9


### 197. Write a Java program to test if a given number (positive integer) is a perfect square or not.

Expected Output:

Input a positive integer:  6
Is the said number perfect square? false 


### 198. Write a Java program to calculate the position of a given prime number.

Expected Output:

Input a positive integer:  15
Position of the said Prime number: 6


### 199. Write a Java program to check if a string follows a given pattern.

Example pattern:
Given pattern = "xyyx", str = "red black black red", return true.
Given pattern = "xyyx", str = "red black black green", return false.
Given pattern = "xxxx", str = "red black black red", return false.
Given pattern = "xxxx", str = "red red red red", return true.

Expected Output:

Is the string and pattern matched? false


### 200. Write a Java program to remove duplicate letters and arrange them in lexicographical order from a given string containing only lowercase letters.

Note: In mathematics, the lexicographic or lexicographical order (also known as lexical order, dictionary order, alphabetical order or lexicographic(al) product) is a generalization of the way words are alphabetically ordered based on the alphabetical order of their component letters.

Expected Output:

Original string: zxywooxz
After removing duplicate characters: xywoz


### 201. Write a Java program to divide a given array of integers into given k non-empty subsets whose sums are all equal. Return true if all sums are equal otherwise return false.

Example:
nums = {1,3,3,5,6,6}, k = 4;
4 subsets (5,1), (3, 3), (6), (6) with equal sums.

Expected Output:

Original Array: [1, 3, 3, 5, 6, 6]
Target of subsets: 4
After removing duplicate characters: true


### 202. Write a Java program to find the total number of continuous subarrays in a given array of integers whose sum equals an integer.

Expected Output:

Original Array: [4, 2, 3, 3, 7, 2, 4]
Value of k: 6
Total number of continuous subarrays: 3


### 203. Write a Java program to find the contiguous subarray of given length k which has the maximum average value of a given array of integers. Display the maximum average value.

Expected Output:

Original Array: [4, 2, 3, 3, 7, 2, 4]
Value of k: 3
Maximum average value: 4.333333333333333


### 204. Write a Java program to compute xn % y where x, y and n are all 32-bit integers.

Expected Output:

Input x :  25
Input n :  35
Input y :  45
x^n % y = 5.0


### 205. Write a Java program to check whether an integer is a power of 2 or not using O(1) time.

Note: O(1) means that it takes a constant time, like 12 nanoseconds, or two minutes no matter the amount of data in the set.
O(n) means it takes an amount of time linear with the size of the set, so a set twice the size will take twice the time. You probably don't want to put a million objects into one of these.

Expected Output:

Input a number :  25
false


### 206. From Wikipedia,
A cyclic redundancy check (CRC) is an error-detecting code commonly used in digital networks and storage devices to detect accidental changes to raw data. Blocks of data entering these systems get a short check value attached, based on the remainder of a polynomial division of their contents. On retrieval, the calculation is repeated and, in the event the check values do not match, corrective action can be taken against data corruption. CRCs can be used for error correction.
Example:

Write a Java program to generate a CRC32 checksum of a given string or byte array.
Input:
Input a string:  The quick brown fox
crc32 checksum of the string: b74574de


### 207. Write a Java program to merge two sorted (ascending) linked lists in ascending order.

Expected Output:

How many elements do you want to add in 1st linked list?:  3
Input numbers of 1st linked list in ascending order:  1 2 3

How many elements do you want to add in 2nd linked list?:  3
Input numbers of 2nd linked list in ascending order:  4 5 6

Merged list: 1 2 3 4 5 6 


### 208. Write a Java program to create a basic string compression method using repeated character counts.

Input string: aaaabbbbcccccddddeeee

Expected Output:

Enter a string (you can include space as well)
 aaaabbbbcccccddddeeee
The compressed string along with the counts of repeated characters is:
a4b4c5d4e4


### 209. Write a Java program to find all unique combinations from a collection of candidate numbers. The sum of the numbers will equal a given target number.

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


### 210. Write a Java program to match any single character (use ?) or any sequence of characters (use *) including empty. The matching should cover the entire input string.

Expected Output:

Enter a string
 bb
Enter a pattern
 b*
Yes


### 211. Write a Java program to find the heights of the top three buildings in descending order from eight given buildings.

Input:

0 ≤ height of building (integer) ≤ 10,000

Expected Output:

Input the heights of eight buildings:
 25 19 23 45 18 23 24 19

Heights of the top three buildings:
45
25
24


### 212. Write a Java program to compute the digit number of the sum of two given integers.

Input:

Each test case consists of two non-negative integers a and b which are separated by a space in a line. 0 ≤ a, b ≤ 1,000,000

Expected Output:

Input two integers(a b):
 13 25
Digit number of sum of said two integers:
2


### 213. Write a Java program to check whether three given lengths (integers) of three sides form a right triangle. Print "Yes" if the given sides form a right triangle otherwise print "No".

Input:

Each test case consists of two non-negative integers a and b which are separated by a space in a line. 0 ≤ a, b ≤ 1,000,000

Expected Output:

Input three integers(sides of a triangle)
 6 9 12
If the given sides form a right triangle?
No


### 214. Write a Java program which solve the equation:
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


### 215. Write a Java program to compute the debt amount in n months. Monthly, the loan adds 4% interest to the $100,000 borrowed and rounds it to the nearest 1,000.

Input:

An integer n (0 ≤ n ≤ 100)

Expected Output:

Input number of months:
 6

Amount of debt: 
129000


### 216. Write a Java program which reads an integer n and finds the number of combinations of a,b,c and d (0 ≤ a,b,c,d ≤ 9) where (a + b + c + d) equals n.

Input:

a,b,c,d,e,f separated by a single space.
(-1,000 ≤ a,b,c,d,e,f ≤ 1,000)

Expected Output:

Input the number(n):
 5 
Number of combinations of a, b, c and d :
56


### 217. Write a Java program to print the number of prime numbers less than or equal to a given integer.

Input:

n (1 ≤ n ≤ 999,999)

Expected Output:

Input the number(n):
 1235
Number of prime numbers which are less than or equal to n.:
202


### 218. Write a Java program to compute the radius and central coordinates (x, y) of a circle constructed from three given points on the plane surface.

Input:

x1, y1, x2, y2, x3, y3 separated by a single space.

Expected Output:

Input x1, y1, x2, y2, x3, y3 separated by a single space:
 5 6 4 8 7 9

Radius and the central coordinate:
1.821 (5.786 7.643)                     


### 219. Write a Java program to check if a point (x, y) is in a triangle or not. A triangle is formed by three points.

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


### 220. Write a Java program to compute and print the sum of two given integers (more than or equal to zero). If the given integers or the sum have more than 80 digits, print "overflow".

Input:

Expected Output:

Input two integers:
25
46

Sum of the said two integers:
71                   


### 221. Write a Java program that accepts six numbers as input and sorts them in descending order.

Input:

Input consists of six numbers n1, n2, n3, n4, n5, n6 (-100000 ≤ n1, n2, n3, n4, n5, n6 ≤ 100000). The six numbers are separated by a space.

Expected Output:

  Input six integers:
 4 6 8 2 7 9
After sorting the said integers:
9 8 7 6 4 2                   


### 222. Write a Java program to test whether two lines PQ and RS are parallel. The four points are P(x1, y1), Q(x2, y2), R(x3, y3), and S(x4, y4).

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


### 223. Write a Java program to find the maximum sum of a contiguous subsequence from a given sequence of numbers a1, a2, a3, ... an. A subsequence of one element is also a continuous subsequence.

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


### 224. There are two circles C1 with radius r1, central coordinate (x1, y1) and C2 with radius r2 and central coordinate (x2, y2).
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


### 225. Write a Java program that reads a date (from 2004/1/1 to 2004/12/31) and prints the day of the date. Jan. 1, 2004, was Thursday. Note that 2004 is a leap year.

Expected Output:

Input the month(1-12)
 9
Input date (1-31)
 15
Name of the date: 
Wednesday


### 226. Write a Java program to print mode values from a given sequence of integers. The mode value is the element that occurs most frequently. If there are several mode values, print them in ascending order.

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


### 227. Write a Java program that reads a text (only alphabetical characters and spaces) and prints two words. The first one is the word which is frequently used in the text. The second one is the word with the most letters.
Note: A word is a sequence of letters which is separated by the spaces.

Input:

A sequence of integer’s ai (1 ≤ ai ≤ 100). The number of integers is less than or equals to 100.

Expected Output:

Thank you for your comment and your participation.
Input a text in a line:
Most frequent text and the word which has the maximum number of letters:
your participation.


### 228. Write a Java program that reads n digits (given) chosen from 0 to 9 and prints the number of combinations where the sum of the digits equals another given number (s). Do not use the same digits in a combination.
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


### 229. Write a Java program that reads the two adjoining sides and the diagonal of a parallelogram. It will check whether the parallelogram is a rectangle or a rhombus.
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


### 230. Write a Java program to replace a string "python" with "java" and "java" with "python" in a given string.

Input:

English letters (including single byte alphanumeric characters, blanks, symbols) are given on one line. The length of the input character string is 1000 or less.
Output:
Exchanged character string of python and java on one line.

Expected Output:

Input the string:
python is more propular than java
New string:
java is more propular than python


### 231. Write a Java program to find the difference between the largest integer and the smallest integer. These integers are created by 8 numbers from 0 to 9. The number that can be rearranged starts with 0 as in 00135668.

Input:

Data is a sequence of 8 numbers (numbers from 0 to 9).
Output:
The difference between the largest integer and the smallest integer.

Sample Output:

Input an integer created by 8 numbers from 0 to 9:
567894321
Difference between the largest and the smallest integer from the given integer:
75308643


### 232. Write a Java program to compute the sum of the first n prime numbers.

Input:

n ( n ≤ 10000). Input 0 to exit the program.

Sample Output:

Input a number (n<=10000) to compute the sum:
100
Sum of first 100 prime numbers:
24133


### 233. Write a Java program that accepts an even number (n should be greater than or equal to 4 and less than or equal to 50,000, a Goldbach number) from the user and creates combinations that express the given number as a sum of two prime numbers. Print the number of combinations.

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


### 234. If you draw a straight line on a plane, the plane is divided into two regions. For example, if you draw two straight lines in parallel, you get three areas. If you draw vertically from one to the other you get 4 areas.

Write a Java program to create the maximum number of regions obtained by drawing n given straight lines.
Input:
xp,yp, xq, yq, xr, yr, xs and ys are -100 to 100 respectively and each value can be up to 5 digits after the decimal point It is given as a real number including the number of.
Output: Yes or No.

Sample Output:

Input number of straight lines:
5
Number of regions:
16


### 235. There are four different points on a plane: P(xp, yp), Q(xq, yq), R(xr, yr) and S(xs, ys). Write a Java program to test whether AB and CD are orthogonal or not.

Input:
xp,yp, xq, yq, xr, yr, xs and ys are -100 to 100 respectively and each value can be up to 5 digits after the decimal point It is given as a real number including the number of.
Output: Yes or No.
Sample Output:

Input xp, yp, xq, yq, xr, yr, xs, ys:
3.5 4.5 2.5 -1.5 3.5 1.0 0.0 4.5
Two lines are not orthogonal.


### 236. Write a Java program to sum all numerical values (positive integers) embedded in a sentence.

Input:
Sentences with positive integers are given over multiple lines. Each line is a character string containing one-byte alphanumeric characters, symbols, spaces, or an empty line. However the input is 80 characters or less per line and the sum is 10,000 or less.

Sample Output:

Input some text and numeric values:
5 apple and 10 orange are rotten in the basket

Sum of the numeric values:
15


### 237. There are 10 vertical and horizontal squares on a plane. Each square is painted in blue and green. Blue represents the sea, and green represents the land. When two green squares are in contact with the top and bottom, or right and left, they are ground. The area created by only one green square is called an "island". For example, the figure below shows five islands.
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


### 238. When characters are consecutive in a string, it is possible to shorten it by replacing them with a certain rule. For example, the character string YYYYY, if it is expressed as # 5 Y, it is compressed by one character.
Write a Java program to restore the original string by entering the compressed string with this rule. However, the # character does not appear in the restored character string.
Note: The original sentences are uppercase letters, lowercase letters, numbers, symbols, less than 100 letters, and consecutive letters are not more than 9 letters.

Input:
Multiple character strings are given. One string is given per line.
Output: The restored character string for each character on one line.

Sample Output:

Input the text:
XY#6Z1#4023
XYZZZZZZ1000023


### 239. A search engine giant such as Google accepts thousands of web pages from around the world and categorizes them, creating a huge database of information. Search engines also analyze search keywords entered by the user and create database queries based on those keywords. In both cases, complicated processing is carried out to realize efficient retrieval, but the basics are all about cutting out words from sentences.
Write a Java program to cut out words of 3 to 6 characters length from a given sentence not more than 1024 characters.

Input:
English sentences consisting of delimiters and alphanumeric characters are given on one line.
Output: Output a word delimited by one space character on one line.

Sample Output:

Input a sentence (1024 characters. max.)
The quick brown fox

3 to 6 characters length of words:
The quick brown fox


### 240. As shown in Figure 1, arrange integers (0 to 99) as narrow hilltops. When reading such data from top to bottom, following the next rule represents a huge amount of data.
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


### 241. Write a Java program to find the number of combinations that satisfy p + q + r + s = n where n is a given number <= 4000 and p, q, r, s range from 0 to 1000.

Sample Output:

Input a positive integer:
252
Number of combinations of a,b,c,d:
2731135


### 242. Your task is to develop a small piece of spreadsheet software. Write a Java program that adds up the columns and rows of a given table as shown in the specified figure:

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


### 243. Write a Java program that reads a list of pairs of a word and a page number. It prints the words and a list of page numbers.

Input:
Input pairs of a word and a page number:
apple 5
banana 6

Word and page number in alphabetical order:
apple
5
banana
6


### 244. Write a Java program that accepts a string from the user and checks whether it is correct or not.

The conditions for getting the "correct answer" are:
a) There must be only three characters X, Y, and Z in the string, and no other characters.
b) Any string of any form such as aXYZa can get the "correct answer", where a is either an empty string or a string consisting only of the letter X;
c) If aXbZc is true, aXbYZca is also valid, where a, b, c are either empty strings or a string consisting only of the letter X.

Input:
Input a string:
 XYZ
Correct format..


### 245. Write a Java program that accepts students' names, ids, and marks and displays their highest and lowest scores.

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


### 246. Let us use the letter H to mean "hundred", the letter T to mean "ten" and “1, 2, . . . n” to represent the one digit n (<10). Using the given format, write a Java program that converts 3 digits positive numbers. For example, 234 should be output as BBSSS1234 because it has 2 "hundreds", 3 "ten", and 4 ones.

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


### 247. Write a Java program that accepts three integers and checks whether the sum of the first two integers is greater than the third integer. Three integers are in the interval [-231, 231 ].

Input:
Input three integers (a,b,c):
5 8 9
Check whether (a + b) is greater than c?
true


### 248. From Wikipedia, An abecedarium (or abecedary) is an inscription consisting of the letters of an alphabet, almost always listed in order. Typically, abecedaria (or abecedaries) are practice exercises.
Write a Java program to check if each letter of a given word (Abecadrian word) is less than the one before it.

Input:
Input a word:  ABCD
Is Abecadrian word? true


### 249. From Wikipedia,
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

# Java Exercises Recursive

https://www.w3resource.com/java-exercises/recursive/index.php
### 1. Write a Java recursive method to calculate the factorial of a given positive integer.



### 2. Write a Java recursive method to calculate the sum of all numbers from 1 to n.



### 3. Write a Java recursive method to calculate the nth Fibonacci number.



### 4. Write a Java recursive method to check if a given string is a palindrome.



### 5. Write a Java recursive method to calculate the exponentiation of a number (base) raised to a power (exponent).



### 6. Write a Java recursive method to reverse a given string.



### 7. Write a Java recursive method to find the greatest common divisor (GCD) of two numbers.



### 8. Write a Java recursive method to count the number of occurrences of a specific element in an array.



### 9. Write a Java recursive method to find the sum of all odd numbers in an array.



### 10. Write a Java recursive method to find the length of a given string.



### 11. Write a Java recursive method to generate all possible permutations of a given string.



### 12. Write a Java recursive method to find the maximum element in an array.



### 13. Write a Java recursive method to calculate the product of all numbers in an array.



### 14. Write a Java recursive method to find the sum of the digits of a given integer.



### 15. Write a Java recursive method to check if a given array is sorted in ascending order.

# Java Exercises Exception

https://www.w3resource.com/java-exercises/exception/index.php
Java Exceptions to handle errors:

Java programming language uses exceptions to handle errors and other exceptional events. An exception is an event that occurs during the execution of a program that disrupts the normal flow of instructions.

This section covers how to catch and handle exceptions. It includes try, catch, and finally block, as well as chained exceptions and logging exercises.


### 1. Write a Java program that throws an exception and catch it using a try-catch block.



### 2. Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.



### 3. Write a Java program to create a method that reads a file and throws an exception if the file is not found.



### 4. Write a Java program that reads a list of numbers from a file and throws an exception if any of the numbers are positive.



### 5. Write a Java program that reads a file and throws an exception if the file is empty.



### 6. Write a Java program that reads a list of integers from the user and throws an exception if any numbers are duplicates.



### 7. Write a Java program to create a method that takes a string as input and throws an exception if the string does not contain vowels.

# Java Exercises Array

https://www.w3resource.com/java-exercises/array/index.php
### 1. Write a Java program to sort a numeric array and a string array.



### 2. Write a Java program to sum values of an array.



### 3. Write a Java program to print the following grid.

Expected Output :

- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -  


### 4. Write a Java program to calculate the average value of array elements.



### 5. Write a Java program to test if an array contains a specific value.



### 6. Write a Java program to find the index of an array element.



### 7. Write a Java program to remove a specific element from an array.



### 8. Write a Java program to copy an array by iterating the array.



### 9. Write a Java program to insert an element (specific position) into an array.



### 10. Write a Java program to find the maximum and minimum value of an array.



### 11. Write a Java program to reverse an array of integer values.



### 12. Write a Java program to find duplicate values in an array of integer values.



### 13. Write a Java program to find duplicate values in an array of string values.



### 14. Write a Java program to find common elements between two arrays (string values).



### 15. Write a Java program to find common elements between two integer arrays.



### 16. Write a Java program to remove duplicate elements from an array.



### 17. Write a Java program to find the second largest element in an array.



### 18. Write a Java program to find the second smallest element in an array.



### 19. Write a Java program to add two matrices of the same size.



### 20. Write a Java program to convert an array to an ArrayList.



### 21. Write a Java program to convert an ArrayList to an array.



### 22. Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.



### 23. Write a Java program to test two arrays' equality.



### 24. Write a Java program to find a missing number in an array.



### 25. Write a Java program to find common elements in three sorted (in non-decreasing order) arrays.



### 26. Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements.



### 27. Write a Java program to find the number of even and odd integers in a given array of integers.



### 28. Write a Java program to get the difference between the largest and smallest values in an array of integers. The array must have a length of at least 1.



### 29. Write a Java program to compute the average value of an array of integers except the largest and smallest values.



### 30. Write a Java program to check if an array of integers is without 0 and -1.



### 31. Write a Java program to check if the sum of all the 10's in the array is exactly 30. Return false if the condition does not satisfy, otherwise true.



### 32. Write a Java program to check if an array of integers contains two specified elements 65 and 77.



### 33. Write a Java program to remove duplicate elements from a given array and return the updated array length.
Sample array: [20, 20, 30, 40, 50, 50, 50]
After removing the duplicate elements the program should return 4 as the new length of the array. 



### 34. Write a Java program to find the length of the longest consecutive elements sequence from an unsorted array of integers.
Sample array: [49, 1, 3, 200, 2, 4, 70, 5]
The longest consecutive elements sequence is [1, 2, 3, 4, 5], therefore the program will return its length 5. 



### 35. Write a Java program to find the sum of the two elements of a given array equal to a given integer.
Sample array: [1,2,4,5,6]
Target value: 6. 



### 36. Write a Java program to find all the distinct triplets such that the sum of all the three elements [x, y, z (x ≤ y ≤ z)] equal to a specified number.
Sample array: [1, -2, 0, 5, -1, -4]
Target value: 2. 



### 37. Write a Java program to create an array of its anti-diagonals from a given square matrix. 


Example:
Input :
1 2
3 4
Output:
[
[1],
[2, 3],
[4]
]



### 38. Write a Java program to get the majority element from an array of integers containing duplicates.  

Majority element: A majority element is an element that appears more than n/2 times where n is the array size.



### 39. Write a Java program to print all the LEADERS in the array.  
Note: An element is leader if it is greater than all the elements to its right side.



### 40. Write a Java program to find the two elements in a given array of positive and negative numbers such that their sum is close to zero.  



### 41. Write a Java program to find the smallest and second smallest elements of a given array.  



### 42. Write a Java program to separate 0s and 1s in an array of 0s and 1s into left and right sides.  



### 43. Write a Java program to find all combinations of four elements of an array whose sum is equal to a given value.  



### 44. Write a Java program to count the number of possible triangles from a given unsorted array of positive integers.  
Note: The triangle inequality states that the sum of the lengths of any two sides of a triangle must be greater than or equal to the length of the third side.



### 45. Write a Java program to cyclically rotate a given array clockwise by one.  



### 46. Write a Java program to check whether there is a pair with a specified sum in a given sorted and rotated array.  



### 47. Write a Java program to find the rotation count in a given rotated sorted array of integers.  



### 48. Write a Java program to arrange the elements of an array of integers so that all negative integers appear before all positive integers.  



### 49. Write a Java program to arrange the elements of an array of integers so that all positive integers appear before all negative integers.  



### 50. Write a Java program to sort an array of positive integers from an array. In the sorted array the value of the first element should be maximum, the second value should be a minimum, third should be the second maximum, the fourth should be the second minimum and so on.  



### 51. Write a Java program that separates 0s on the left hand side and 1s on the right hand side from a random array of 0s and 1.  



### 52. Write a Java program to separate even and odd numbers from a given array of integers. Put all even numbers first, and then odd numbers.  



### 53. Write a Java program to replace every element with the next greatest element (from the right side) in a given array of integers.
There is no element next to the last element, therefore replace it with -1. 



### 54. Write a Java program to check if a given array contains a subarray with 0 sum.  

Example:
Input :
nums1= { 1, 2, -2, 3, 4, 5, 6 }
nums2 = { 1, 2, 3, 4, 5, 6 }
nums3 = { 1, 2, -3, 4, 5, 6 }
Output:
Does the said array contain a subarray with 0 sum: true
Does the said array contain a subarray with 0 sum: false
Does the said array contain a subarray with 0 sum: true



### 55. Write a Java program to print all sub-arrays with 0 sum present in a given array of integers.  

Example:
Input :
nums1 = { 1, 3, -7, 3, 2, 3, 1, -3, -2, -2 }
nums2 = { 1, 2, -3, 4, 5, 6 }
nums3= { 1, 2, -2, 3, 4, 5, 6 }
Output:
Sub-arrays with 0 sum : [1, 3, -7, 3]
Sub-arrays with 0 sum : [3, -7, 3, 2, 3, 1, -3, -2]

Sub-arrays with 0 sum : [1, 2, -3]
Sub-arrays with 0 sum : [2, -2]



### 56. Write a Java program to sort a binary array in linear time.  
From Wikipedia,
Linear time: An algorithm is said to take linear time, or O(n) time, if its time complexity is O(n). Informally, this means that the running time increases at most linearly with the size of the input. More precisely, this means that there is a constant c such that the running time is at most cn for every input of size n. For example, a procedure that adds up all elements of a list requires time proportional to the length of the list, if the adding time is constant, or, at least, bounded by a constant.
Linear time is the best possible time complexity in situations where the algorithm has to sequentially read its entire input. Therefore, much research has been invested into discovering algorithms exhibiting linear time or, at least, nearly linear time. This research includes both software and hardware methods. There are several hardware technologies which exploit parallelism to provide this. An example is content-addressable memory. This concept of linear time is used in string matching algorithms such as the Boyer–Moore algorithm and Ukkonen's algorithm.

Example:
Input :
b_nums[] = { 0, 1, 1, 0, 1, 1, 0, 1, 0, 0 }
Output:
After sorting: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]



### 57. Write a Java program to check if a sub-array is formed by consecutive integers from a given array of integers.  

Example:
Input :
nums = { 2, 5, 0, 2, 1, 4, 3, 6, 1, 0 }
Output:
The largest sub-array is [1, 7]
Elements of the sub-array: 5 0 2 1 4 3 6



### 58. Given two sorted arrays A and B of size p and q, write a Java program to merge elements of A with B by maintaining the sorted order i.e. fill A with first p smallest elements and fill B with remaining elements.  

Example:
Input :
int[] A = { 1, 5, 6, 7, 8, 10 }
int[] B = { 2, 4, 9 }
Output:
Sorted Arrays:
A: [1, 2, 4, 5, 6, 7]
B: [8, 9, 10]



### 59. Write a Java program to find the maximum product of two integers in a given array of integers.  

Example:
Input :
nums = { 2, 3, 5, 7, -7, 5, 8, -5 }
Output:
Pair is (7, 8), Maximum Product: 56



### 60. Write a Java program to shuffle a given array of integers.  

Example:
Input :
nums = { 1, 2, 3, 4, 5, 6 }
Output:
Shuffle Array: [4, 2, 6, 5, 1, 3]



### 61. Write a Java program to rearrange a given array of unique elements such that every second element of the array is greater than its left and right elements.  

Example:
Input :
nums= { 1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14 }
Output:
Array with every second element is greater than its left and right elements:
[1, 4, 2, 9, 3, 8, 5, 10, 7, 14, 12]



### 62. Write a Java program to find equilibrium indices in a given array of integers.  

Example:
Input :
nums = {-7, 1, 5, 2, -4, 3, 0}
Output:
Equilibrium indices found at : 3
Equilibrium indices found at : 6



### 63. Write a Java program to replace each element of the array with the product of every other element in a given array of integers.  

Example:
Input :
nums1 = { 1, 2, 3, 4, 5, 6, 7}
nums2 = {0, 1, 2, 3, 4, 5, 6, 7}
Output:
Array with product of every other element:
[5040, 2520, 1680, 1260, 1008, 840, 720]
Array with product of every other element:
[5040, 0, 0, 0, 0, 0, 0, 0]



### 64. Write a Java program to find the Longest Bitonic Subarray in a given array.  

A bitonic subarray is a subarray of a given array where elements are first sorted in increasing order, then in decreasing order. A strictly increasing or strictly decreasing subarray is also accepted as bitonic subarray.


Example:
Input :
nums = { 4, 5, 9, 5, 6, 10, 11, 9, 6, 4, 5 }
Output:
The longest bitonic subarray is [3,9]
Elements of the said sub-array: 5 6 10 11 9 6 4
The length of longest bitonic subarray is 7



### 65. Write a Java program to find the maximum difference between two elements in a given array of integers such that the smaller element appears before the larger element.  

Example:
Input :
nums = { 2, 3, 1, 7, 9, 5, 11, 3, 5 }
Output:
The maximum difference between two elements of the said array elements
10



### 66. Write a Java program to find a contiguous subarray within a given array of integers with the largest sum.  

In computer science, the maximum sum subarray problem is the task of finding a contiguous subarray with the largest sum, within a given one-dimensional array A[1...n] of numbers. Formally, the task is to find indices and with, such that the sum is as large as possible.


Example:
Input :
int[] A = {1, 2, -3, -4, 0, 6, 7, 8, 9}
Output:
The largest sum of contiguous sub-array: 30



### 67. Write a Java program to find the subarray with the largest sum in a given circular array of integers.  

Example:
Input :
nums1 = { 2, 1, -5, 4, -3, 1, -3, 4, -1 }
nums2 = { 1, -2, 3, 0, 7, 8, 1, 2, -3 }
Output:
The sum of subarray with the largest sum is 6
The sum of subarray with the largest sum is 21



### 68. Write a Java program to create all possible permutations of a given array of distinct integers.  

Example:
Input :
nums1 = {1, 2, 3, 4}
nums2 = {1, 2, 3}
Output:
Possible permutations of the said array:
[1, 2, 3, 4]
[1, 2, 4, 3]
....
[4, 1, 3, 2]
[4, 1, 2, 3]
Possible permutations of the said array:
[1, 2, 3]
[1, 3, 2]
...
[3, 2, 1]
[3, 1, 2]



### 69. Write a Java program to find the minimum subarray sum of specified size in a given array of integers.  

Example:
Input :
nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10}
Output:
Sub-array size: 4
Sub-array from 0 to 3 and sum is: 10



### 70. Write a Java program to find the smallest length of a contiguous subarray of which the sum is greater than or equal to a specified value. Return 0 instead.  

Example:
Input :
nums = {1, 2, 3, 4, 6}
Output:
Minimum length of a contiguous subarray of which the sum is 8, 2



### 71. Write a Java program to find the largest number from a given list of non-negative integers.  

Example:
Input :
nums = {1, 2, 3, 0, 4, 6}
Output:
Largest number using the said array numbers: 643210



### 72. Write a Java program to find and print one continuous subarray (from a given array of integers) that if you only sort the said subarray in ascending order then the entire array will be sorted in ascending order.  

Example:
Input :
nums1 = {1, 2, 3, 0, 4, 6}
nums2 = { 1, 3, 2, 7, 5, 6, 4, 8}
Output:
Continuous subarray:
1 2 3 0
Continuous subarray:
3 2 7 5 6 4



### 73. Write a Java program to sort a given array of distinct integers where all its numbers are sorted except two numbers.  

Example:
Input :
nums1 = { 3, 5, 6, 9, 8, 7 }
nums2 = { 5, 0, 1, 2, 3, 4, -2 }
Output:
After sorting new array becomes: [3, 5, 6, 7, 8, 9]
After sorting new array becomes: [-2, 0, 1, 2, 3, 4, 5]



### 74. Write a Java program to find all triplets equal to a given sum in an unsorted array of integers.  

Example:
Input :
nums = { 1, 6, 3, 0, 8, 4, 1, 7 }
Output:
Triplets of sum 7
(0 1 6)
(0 3 4)



### 75. Write a Java program to calculate the largest gap between sorted elements of an array of integers.  

Example:
Original array: [23, -2, 45, 38, 12, 4, 6]
Largest gap between sorted elements of the said array: 15



### 76. Write a Java program to determine whether numbers in an array can be rearranged so that each number appears exactly once in a consecutive list of numbers. Return true otherwise false.  

Example:
Original array: [1, 2, 5, 0, 4, 3, 6]
Check consecutive numbers in the said array!true



### 77. Write a Java program that checks whether an array of integers alternates between positive and negative values.  

Example:
Original array: [1, -2, 5, -4, 3, -6]
Check the said array of integers alternates between positive and negative values!true



### 78. Write a Java program that checks whether an array is negative dominant or not. If the array is negative dominant return true otherwise false.  

Example:
Original array of numbers:
[1, -2, -5, -4, 3, -6]
Check Negative Dominance in the said array!true



### 79. Write a Java program that returns the missing letter from an array of increasing letters (upper or lower). Assume there will always be one omission from the array.  

Example:
Original array of elements:
[p, r, s, t]
Missing letter in the said array: q

# Java Exercises Inheritance

https://www.w3resource.com/java-exercises/index-inheritance.php
Java Inheritance: In the Java language, classes can be derived from other classes, thereby inheriting fields and methods from those classes.

Definitions: A class that is derived from another class is called a subclass (also a derived class, extended class, or child class). The class from which the subclass is derived is called a superclass (also a base class or a parent class).

Excepting Object, which has no superclass, every class has one and only one direct superclass (single inheritance). In the absence of any other explicit superclass, every class is implicitly a subclass of Object.

Classes can be derived from classes that are derived from classes that are derived from classes, and so on, and ultimately derived from the topmost class, Object. Such a class is said to be descended from all the classes in the inheritance chain stretching back to Object.


[An  editor is available at the bottom of the page to write and execute the scripts. Go to the editor]

### 1. Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.


### 2. Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that overrides the drive() method to print "Repairing a car".


### 3. Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.


### 4. Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().


### 5. Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.


### 6. Write a Java program to create a class called Animal with a method named move(). Create a subclass called Cheetah that overrides the move() method to run.


### 7. Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title.


### 8. Write a Java program to create a class called Shape with methods called getPerimeter() and getArea(). Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the area and perimeter of a circle.


### 9. Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have properties such as make, model, year, and fuel type. Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.


### 10. Write a Java program that creates a class hierarchy for employees of a company. The base class should be Employee, with subclasses Manager, Developer, and  Programmer. Each subclass should have properties such as name, address, salary, and job title. Implement methods for calculating bonuses, generating performance reports, and managing projects.

# Java Exercises Abstract

https://www.w3resource.com/java-exercises/index-abstract.php
All  programming languages provide abstractions. It can be argued that the complexity of the problems you’re able to solve is directly related to the kind and quality of abstraction. An essential element of object-oriented programming is an abstraction. For more information read this article.

### 1. Write a Java program to create an abstract class Animal with an abstract method called sound(). Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method to make a specific sound for each animal.


### 2. Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter of each shape.


### 3. Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw(). Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the respective methods to handle deposits and withdrawals for each account type.


### 4. Write a Java program to create an abstract class Animal with abstract methods eat() and sleep(). Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and sleep() methods differently based on their specific behavior.


### 5. Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo(). Create subclasses Manager and Programmer that extend the Employee class and implement the respective methods to calculate salary and display information for each role.


### 6. Write a Java program to create an abstract class Shape3D with abstract methods calculateVolume() and calculateSurfaceArea(). Create subclasses Sphere and Cube that extend the Shape3D class and implement the respective methods to calculate the volume and surface area of each shape.


### 7. Write a Java program to create an abstract class Vehicle with abstract methods startEngine() and stopEngine(). Create subclasses Car and Motorcycle that extend the Vehicle class and implement the respective methods to start and stop the engines for each vehicle type.


### 8. Write a Java program to create an abstract class Person with abstract methods eat() and exercise(). Create subclasses Athlete and LazyPerson that extend the Person class and implement the respective methods to describe how each person eats and exercises.


### 9. Write a Java program to create an abstract class Instrument with abstract methods play() and tune(). Create subclasses for Glockenspiel and Violin that extend the Instrument class and implement the respective methods to play and tune each instrument.


### 10. Write a Java program to create an abstract class Shape2D with abstract methods draw() and resize(). Create subclasses Rectangle and Circle that extend the Shape2D class and implement the respective methods to draw and resize each shape.


### 11. Write a Java program to create an abstract class Bird with abstract methods fly() and makeSound(). Create subclasses Eagle and Hawk that extend the Bird class and implement the respective methods to describe how each bird flies and makes a sound.


### 12. Write a Java program to create an abstract class GeometricShape with abstract methods area() and perimeter(). Create subclasses Triangle and Square that extend the GeometricShape class and implement the respective methods to calculate the area and perimeter of each shape.

# Java Exercises Thread

https://www.w3resource.com/java-exercises/thread/index.php
In computer science, a thread of execution is the smallest sequence of programmed instructions that can be managed independently by a scheduler, which is typically a part of the  operating system. The implementation of threads and  processes differs between  operating systems.

A thread is a thread of execution in a program. The  Java Virtual Machine allows an application to have multiple threads of execution running concurrently.

Every thread has a priority. Threads with higher priority are executed in preference to threads with lower priority. Each thread may or may not also be marked as a daemon. When code running in some thread creates a new Thread object, the new thread has its priority initially set equal to the priority of the creating thread, and is a daemon thread if and only if the creating thread is a daemon.


### 1. Write a Java program to create a basic Java thread that prints " Hello, World!" when executed.



### 2. Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20.



### 3. Write a Java program that sorts an array of integers using multiple threads.



### 4. Write a Java program that performs matrix multiplication using multiple threads.



### 5. Write a Java program that calculates the sum of all prime numbers up to a given limit using multiple threads.



### 6. Write a Java program to implement a concurrent web crawler that crawls multiple websites simultaneously using threads.



### 7. Write a Java program that creates a bank account with concurrent deposits and withdrawals using threads.

# Java Exercises Multithreading

https://www.w3resource.com/java-exercises/multithreading/index.php
### 1. Write a Java program to create and start multiple threads that increment a shared counter variable concurrently.



### 2. Write a Java program to create a producer-consumer scenario using the wait() and notify() methods for thread synchronization.



### 3. Write a Java program that uses the ReentrantLock class to synchronize access to a shared resource among multiple threads.



### 4. Write a Java program to demonstrate Semaphore usage for thread synchronization.



### 5. Write a Java program to showcase the usage of the CyclicBarrier class for thread synchronization.



### 6. Write a Java program that uses the CountDownLatch class to synchronize the start and finish of multiple threads.



### 7. Write a Java program to illustrate the usage of the ReadWriteLock interface for concurrent read-write access to a shared resource.



### 8. Write a Java program demonstrating how to access a map concurrently using the ConcurrentHashMap class.



### 9. Write a Java program that utilizes the ConcurrentLinkedQueue class to implement a thread-safe queue.



### 10. Write a Java program to showcase the usage of the Phaser class for coordination and synchronization of multiple threads.



### 11. Write a Java program that utilizes the Exchanger class for exchanging data between two threads.



### 12. Write a Java program to demonstrate the usage of the Callable and Future interfaces for executing tasks asynchronously and obtaining their results.



### 13. Write a Java program that uses the ScheduledExecutorService interface to schedule tasks for execution at a specified time or with a fixed delay.



### 14. Write a Java program to demonstrate the usage of the ForkJoinPool class for parallel execution of recursive tasks.



### 15. Write a Java program that utilizes the StampedLock class for optimizing concurrent read-write access to a shared resource.

# Java Exercises Generic

https://www.w3resource.com/java-exercises/generic/index.php
Generic Methods:

Generic methods are methods that introduce their own type parameters. This is similar to declaring a generic type, but the type parameter's scope is limited to the method where it is declared. Static and non-static generic methods are allowed, as well as generic class constructors.

The syntax for a generic method includes a list of type parameters, inside angle brackets, which appears before the method's return type. For static generic methods, the type parameter section must appear before the method's return type

### 1. Write a Java program to create a generic method that takes two arrays of the same type and checks if they have the same elements in the same order.



### 2. Write a Java program to create a generic method that takes a list of numbers and returns the sum of all the even and odd numbers.



### 3. Write a Java program to create a generic method that takes a list of any type and a target element. It returns the index of the first occurrence of the target element in the list. Return -1 if the target element cannot be found.



### 4. Write a Java program to create a generic method that takes a list of any type and returns it as a new list with the elements in reverse order.



### 5. Write a Java program to create a generic method that takes two lists of the same type and merges them into a single list. This method alternates the elements of each list.



### 6. Write a Java program to create a generic method that takes a list of any type and a predicate. It returns an array list containing only elements that satisfy the predicate.



### 7. Write a Java program to create a generic method that takes a map of any type and prints each key-value pair.

# Java Exercises OOP

https://www.w3resource.com/java-exercises/oop/index.php
Object-oriented  programming: Object-oriented  programming (OOP) is a programming paradigm based on the concept of "objects", which can contain data and code. The data is in the form of fields (often known as attributes or properties), and the code is in the form of procedures (often known as methods).

A Java class file is a file (with the .class filename extension) containing Java bytecode that can be executed on the  Java Virtual Machine (JVM JVM). A Java class file is usually produced by a Java  compiler from Java programming language source files (.java files) containing Java classes (alternatively, other JVM languages can also be used to create class files).
If a source file has more than one class, each class is  compiled into a separate class file.



### 1. Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.



### 2. Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.



### 3. Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.



### 4. Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. Calculate the area and circumference of the circle.



### 5. Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection.



### 6. Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.



### 7. Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove accounts, and to deposit and withdraw money. Also define a class called "Account" to maintain account details of a particular customer.



### 8. Write a Java program to create class called "TrafficLight" with attributes for color and duration, and methods to change the color and check for red or green.



### 9. Write a Java program to create a class called "Employee" with a name, salary, and hire date attributes, and a method to calculate years of service.



### 10. Write a Java program to create a class called "Student" with a name, grade, and courses attributes, and methods to add and remove courses.



### 11. Write a Java program to create a class called "Library" with a collection of books and methods to add and remove books.



### 12. Write a Java program to create a class called "Airplane" with a flight number, destination, and departure time attributes, and methods to check flight status and delay.



### 13. Write a Java program to create a class called "Inventory" with a collection of products and methods to add and remove products, and to check for low inventory.



### 14. Write a Java program to create a class called "School" with attributes for students, teachers, and classes, and methods to add and remove students and teachers, and to create classes.



### 15. Write a Java program to create a class called "MusicLibrary" with a collection of songs and methods to add and remove songs, and to play a random song.



### 16. Write a Java program to create a class called "Shape" with abstract methods for calculating area and perimeter, and subclasses for "Rectangle", "Circle", and "Triangle".



### 17. Write a Java program to create a class called "Movie" with attributes for title, director, actors, and reviews, and methods for adding and retrieving reviews.



### 18. Write a Java program to create a class called "Restaurant" with attributes for menu items, prices, and ratings, and methods to add and remove items, and to calculate average rating.



### 19. Write a Java program to create a class with methods to search for flights and hotels, and to book and cancel reservations.



### 20. Write a Java program to create a class called "BankAccount" with attributes for account number, account holder's name, and balance. Include methods for depositing and withdrawing money, as well as checking the balance. Create a subclass called "SavingsAccount" that adds an interest rate attribute and a method to apply interest.



### 21. Write a Java program to create a class called "Vehicle" with attributes for make, model, and year. Create subclasses "Car" and "Truck" that add specific attributes like trunk size for cars and payload capacity for trucks. Implement a method to display vehicle details in each subclass.



### 22. Write a Java program to create a class called "Customer" with attributes for name, email, and purchase history. Implement methods to add purchases to the history and calculate total expenditure. Create a subclass "LoyalCustomer" that adds a discount rate attribute and a method to apply the discount.



### 23. Write a Java program to create a class called "Course" with attributes for course name, instructor, and credits. Create a subclass "OnlineCourse" that adds attributes for platform and duration. Implement methods to display course details and check if the course is eligible for a certificate based on duration.



### 24. Write a Java program to create a class called "ElectronicsProduct" with attributes for product ID, name, and price. Implement methods to apply a discount and calculate the final price. Create a subclass " WashingMachine" that adds a warranty period attribute and a method to extend the warranty.



### 25. Write a Java program to create a class called "Building" with attributes for address, number of floors, and total area. Create subclasses "ResidentialBuilding" and "CommercialBuilding" that add specific attributes like number of apartments for residential and office space for commercial buildings. Implement a method to calculate the total rent for each subclass.



### 26. Write a Java program to create a class called "Event" with attributes for event name, date, and location. Create subclasses "Seminar" and "MusicalPerformance" that add specific attributes like number of speakers for seminars and performer list for concerts. Implement methods to display event details and check for conflicts in the event schedule.



### 27. Write a Java program to create a class called "CustomerOrder" with attributes for order ID, customer, and order date. Create a subclass "OnlineOrder" that adds attributes for delivery address and tracking number. Implement methods to calculate delivery time based on the address and update the tracking status.



### 28. Write a Java program to create a class called "Reservation" with attributes for reservation ID, customer name, and date. Create subclasses "ResortReservation" and "RailwayReservation" that add specific attributes like room number for hotels and seat number for flights. Implement methods to check reservation status and modify reservation details.



### 29. Write a Java program to create a class called "Pet" with attributes for name, species, and age. Create subclasses "Dog" and "Bird" that add specific attributes like favorite toy for dogs and wing span for birds. Implement methods to display pet details and calculate the pet's age in human years.



### 30. Write a Java program to create a class called "GymMembership" with attributes for member name, membership type, and duration. Create a subclass "PremiumMembership" that adds attributes for personal trainer availability and spa access. Implement methods to calculate membership fees and check for special offers based on membership type.

# Java Exercises Interface

https://www.w3resource.com/java-exercises/index-interface.php
### 1. Write a Java program to create an interface Shape with the getArea() method. Create three classes Rectangle, Circle, and Triangle that implement the Shape interface. Implement the getArea() method for each of the three classes.


### 2. Write a Java program to create a Animal interface with a method called bark() that takes no arguments and returns void. Create a Dog class that implements Animal and overrides speak() to print "Dog is barking".


### 3. Write a Java program to create an interface Flyable with a method called fly_obj(). Create three classes Spacecraft, Airplane, and Helicopter that implement the Flyable interface. Implement the fly_obj() method for each of the three classes.


### 4. Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount, and CurrentAccount. The bank should have a list of accounts and methods for adding them. Accounts should be an interface with methods to deposit, withdraw, calculate interest, and view balances. SavingsAccount and CurrentAccount should implement the Account interface and have their own unique methods.


### 5. Write a Java program to create an interface Resizable with methods resizeWidth(int width) and resizeHeight(int height) that allow an object to be resized. Create a class Rectangle that implements the Resizable interface and implements the resize methods.


### 6. Write a Java program to create an interface Drawable with a method draw() that takes no arguments and returns void. Create three classes Circle, Rectangle, and Triangle that implement the Drawable interface and override the draw() method to draw their respective shapes.


### 7. Write a Java program to create an interface Sortable with a method sort() that sorts an array of integers in ascending order. Create two classes BubbleSort and SelectionSort that implement the Sortable interface and provide their own implementations of the sort() method.


### 8. Write a Java program to create an interface Playable with a method play() that takes no arguments and returns void. Create three classes Football, Volleyball, and Basketball that implement the Playable interface and override the play() method to play the respective sports.


### 9. Write a Java program to create an interface Searchable with a method search(String keyword) that searches for a given keyword in a text document. Create two classes Document and WebPage that implement the Searchable interface and provide their own implementations of the search() method.


### 10. Write a Java program to create an interface Encryptable with methods encrypt (String data) and decrypt (String encryptedData) that define encryption and decryption operations. Create two classes AES and RSA that implement the Encryptable interface and provide their own encryption and decryption algorithms.


### 11. Write a Java program to create an interface Sortable with a method sort (int[] array) that sorts an array of integers in descending order. Create two classes QuickSort and MergeSort that implement the Sortable interface and provide their own implementations of the sort() method.

# Java Exercises Encapsulation

https://www.w3resource.com/java-exercises/encapsulation/index.php
Java Encapsulation:

An object's encapsulation allows it to hide its data and methods. It is one of the fundamental principles of object-oriented programming. Java classes encapsulate the fields and methods that define an object's state and actions. Encapsulation enables you to write reusable programs. It also enables you to restrict access only to public features of an object. Other fields and methods are private and can be used internally.

### 1. Write a Java program to create a class called Person with private instance variables name, age. and country. Provide public getter and setter methods to access and modify these variables.



### 2. Write a Java program to create a class called BankAccount with private instance variables accountNumber and balance. Provide public getter and setter methods to access and modify these variables.



### 3. Write a Java program to create a class called Rectangle with private instance variables length and width. Provide public getter and setter methods to access and modify these variables.



### 4. Write a Java program to create a class called Employee with private instance variables employee_id, employee_name, and employee_salary. Provide public getter and setter methods to access and modify the id and name variables, but provide a getter method for the salary variable that returns a formatted string.



### 5. Write a Java program to create a class called Circle with a private instance variable radius. Provide public getter and setter methods to access and modify the radius variable. However, provide two methods called calculateArea() and calculatePerimeter() that return the calculated area and perimeter based on the current radius value.



### 6. Write a Java program to create a class called Car with private instance variables company_name, model_name, year, and mileage. Provide public getter and setter methods to access and modify the company_name, model_name, and year variables. However, only provide a getter method for the mileage variable.



### 7. Write a Java program to create a class called Student with private instance variables student_id, student_name, and grades. Provide public getter and setter methods to access and modify the student_id and student_name variables. However, provide a method called addGrade() that allows adding a grade to the grades variable while performing additional validation.

# Java Exercises Polymorphism

https://www.w3resource.com/java-exercises/index-polymorphism.php
Polymorphism

In Core, Java Polymorphism is one of easy concept to understand. Polymorphism definition is that Poly means many and morphos means forms. It describes the feature of languages that allows the same word or symbol to be interpreted correctly in different situations based on the context. There are two types of Polymorphism available in Java. For example, in English, the verb “run” means different things if you use it with “a footrace,” a “business,” or “a computer.” You understand the meaning of “run” based on the other words used with it. Check out this article for more information.

### 1. Write a Java program to create a base class Animal (Animal Family) with a method called Sound(). Create two subclasses Bird and Cat. Override the Sound() method in each subclass to make a specific sound for each animal.


### 2. Write a Java program to create a class Vehicle with a method called speedUp(). Create two subclasses Car and Bicycle. Override the speedUp() method in each subclass to increase the vehicle's speed differently.


### 3. Write a Java program to create a base class Shape with a method called calculateArea(). Create three subclasses: Circle, Rectangle, and Triangle. Override the calculateArea() method in each subclass to calculate and return the shape's area.


### 4. Write a Java program to create a class Employee with a method called calculateSalary(). Create two subclasses Manager and Programmer. In each subclass, override the calculateSalary() method to calculate and return the salary based on their specific roles.


### 5. Write a Java program to create a base class Sports with a method called play(). Create three subclasses: Football, Basketball, and Rugby. Override the play() method in each subclass to play a specific statement for each sport.


### 6. Write a Java program to create a class Shape with methods getArea() and getPerimeter(). Create three subclasses: Circle, Rectangle, and Triangle. Override the getArea() and getPerimeter() methods in each subclass to calculate and return the area and perimeter of the respective shapes.


### 7. Write a Java program to create a base class Animal with methods move() and makeSound(). Create two subclasses Bird and Panthera. Override the move() method in each subclass to describe how each animal moves. Also, override the makeSound() method in each subclass to make a specific sound for each animal.


### 8. Write a Java program to create a base class Shape with methods draw() and calculateArea(). Create three subclasses: Circle, Square, and Triangle. Override the draw() method in each subclass to draw the respective shape, and override the calculateArea() method to calculate and return the area of each shape.


### 9. Write a Java program to create a base class BankAccount with methods deposit() and withdraw(). Create two subclasses SavingsAccount and CheckingAccount. Override the withdraw() method in each subclass to impose different withdrawal limits and fees.


### 10. Write a Java program to create a base class Animal with methods eat() and sound(). Create three subclasses: Lion, Tiger, and Panther. Override the eat() method in each subclass to describe what each animal eats. In addition, override the sound() method to make a specific sound for each animal.


### 11. Write a Java program to create a base class Vehicle with methods startEngine() and stopEngine(). Create two subclasses Car and Motorcycle. Override the startEngine() and stopEngine() methods in each subclass to start and stop the engines differently.


### 12. Write a Java program to create a base class Shape with methods draw() and calculateArea(). Create two subclasses Circle and Cylinder. Override the draw() method in each subclass to draw the respective shape. In addition, override the calculateArea() method in the Cylinder subclass to calculate and return the total surface area of the cylinder.

# Java Exercises String

https://www.w3resource.com/java-exercises/string/index.php
### 1. Write a Java program to get the character at the given index within the string.

Sample Output:

Original String = Java Exercises!                                                                             
The character at position 0 is J                                                                              
The character at position 10 is i 


### 2. Write a Java program to get the character (Unicode code point) at the given index within the string.

Sample Output:

Original String : w3resource.com                                                                              
Character(unicode point) = 51                                                                                 
Character(unicode point) = 101 


### 3. Write a Java program to get the character (Unicode code point) before the specified index within the string.

Sample Output:

Original String : w3resource.com                                                                              
Character(unicode point) = 119                                                                                
Character(unicode point) = 99


### 4. Write a Java program to count Unicode code points in the specified text range of a string.

Sample Output:

Original String : w3rsource.com                                                                               
Codepoint count = 9


### 5. Write a Java program to compare two strings lexicographically.
Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.

Sample Output:

String 1: This is Exercise 1                                                                                  
String 2: This is Exercise 2                                                                                  
"This is Exercise 1" is less than "This is Exercise 2" 


### 6. Write a Java program to compare two strings lexicographically, ignoring case differences.

Sample Output:

String 1: This is exercise 1                                                                                  
String 2: This is Exercise 1                                                                                  
"This is exercise 1" is equal to "This is Exercise 1"


### 7. Write a Java program to concatenate a given string to the end of another string.

Sample Output:

String 1: PHP Exercises and                                                                                   
String 2: Python Exercises                                                                                    
The concatenated string: PHP Exercises and Python Exercises


### 8. Write a Java program to test if a given string contains the specified sequence of char values.

Sample Output:

Original String: PHP Exercises and Python Exercises                                                           
Specified sequence of char values: and                                                                        
true 


### 9. Write a Java program to compare a given string to the specified character sequence.

Sample Output:

Comparing example.com and example.com: true                                                                   
Comparing Example.com and example.com: false


### 10. Write a Java program to compare a given string to a specified string buffer.

Sample Output:

Comparing example.com and example.com: true                                                                   
Comparing Example.com and example.com: false 


### 11. Write a Java program to create a String object with a character array.

Sample Output:

The book contains 234 pages.


### 12. Write a Java program to check whether a given string ends with another string.

Sample Output:

"Python Exercises" ends with "se"? false                                                                      
"Python Exercise" ends with "se"? true


### 13. Write a Java program to check whether two String objects contain the same data.

Sample Output:

"Stephen Edwin King" equals "Walter Winchell"? false                                                          
"Stephen Edwin King" equals "Mike Royko"? false


### 14. Write a Java program to compare a given string to another string, ignoring case considerations.

Sample Output:

"Stephen Edwin King" equals "Walter Winchell"? false                                                          
"Stephen Edwin King" equals "stephen edwin king"? true 


### 15. Write a Java program to print the current date and time in the specified format.

Sample Output:

Current Date and Time :                                                                                       
June 19, 2017                                                                                                 
3:13 pm 
N.B. : The current date and time will change according to your system date and time.


### 16. Write a Java program to get the contents of a given string as a byte array.

Sample Output:

The new String equals This is a sample String.


### 17. Write a Java program to get the contents of a given string as a character array.

Sample Output:

The char array equals "[C@2a139a55"


### 18. Write a Java program to create a distinct identifier for a given string.

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



### 20. Write a Java program to get the Canonical representation of the string object.

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



### 22. Write a Java program to get the length of a given string.

Sample Output:

The string length of 'example.com' is: 11


### 23. Write a Java program to find out whether a region in the current string matches a region in another string.

Sample Output:

str1[0 - 7] == str2[28 - 35]? true                                                                            
str1[9 - 15] == str2[9 - 15]? false 


### 24. Write a Java program to replace a specified character with another character.

Sample Output:

Original string: The quick brown fox jumps over the lazy dog.                                                 
New String: The quick brown fox jumps over the lazy fog.


### 25. Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement.

Sample string : "The quick brown fox jumps over the lazy dog."

In the above string replace all the fox with cat.

Sample Output:

Original string: The quick brown fox jumps over the lazy dog.                                                 
New String: The quick brown cat jumps over the lazy dog.         


### 26. Write a Java program to check whether a given string starts with another string.

Sample Output:

Red is favorite color. starts with Red? true                                                                  
Orange is also my favorite color. starts with Red? false


### 27. Write a Java program to get a substring of a given string at two specified positions.

Sample Output:

old = The quick brown fox jumps over the lazy dog.                                                            
new = brown fox jumps


### 28. Write a Java program to create a character array containing a string.

Sample Output:

Java Exercises.


### 29. Write a Java program to convert all characters in a string to lowercase.

Sample Output:

Original String: The Quick BroWn FoX!                                                                         
String in lowercase: the quick brown fox!


### 30. Write a Java program to convert all characters in a string to uppercase.

Sample Output:

Original String: The Quick BroWn FoX!                                                                         
String in uppercase: THE QUICK BROWN FOX!  


### 31. Write a Java program to trim leading or trailing whitespace from a given string.

Sample Output:

Original String:  Java Exercises                                                                              
New String: Java Exercises


### 32. Write a Java program to find the longest Palindromic Substring within a string.

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


### 34. Write a Java program to find the second most frequent character in a given string.

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


### 36. Write a Java program to check whether two strings interlive of a given string. Assuming that unique characters are present in both strings.

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


### 38. Write a Java program to print the result of removing duplicates from a given string.

Sample Output:

The given string is: w3resource
After removing duplicates characters the new string is: w3resouc


### 39. Write a Java program to find the first non-repeating character in a string.

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


### 41. Write a Java program to remove duplicate characters from a given string that appear in another given string.

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


### 43. Write a Java program to find the character in a string that occurs the most frequently.

Sample Output:

The given string is: test string
Max occurring character in the given string is: t


### 44. Write a Java program to reverse a string using recursion.

Sample Output:

The given string is: The quick brown fox jumps
The string in reverse order is:
spmuj xof nworb kciuq ehT


### 45. Write a Java program to reverse words in a given string.

Sample Output:

The given string is: Reverse words in a given string
The new string after reversed the words: string given a in words Reverse


### 46. Write a Java program to reverse every word in a string using methods.

Sample Output:

The given string is: This is a test string
The string reversed word by word is: 
sihT si a tset gnirts


### 47. Write a Java program to rearrange a string so that the same characters are positioned a distance away.

Sample Output:

The given string is: accessories
The string after arrange newly is: 
secrsecisao


### 48. Write a Java program to remove "b" and "ac" from a given string.

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


### 50. Write a Java program to find the lexicographic rank of a given string.

Sample Output:

The Given String is: BDCA
The Lexicographic rank of the given string is: 12
N.B.: Total possible permutations of BDCA are(lexicographic order) :
ABCD ABDC ACBD ACDB ADBC ADCB BACD BADC BCAD BCDA BDAC BDCA
1   2   3   4   5   6   7   8   9   10   11   12
The BDCA appear in 12 position of permutation (lexicographic order).



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

# Java Exercises Lambda

https://www.w3resource.com/java-exercises/lambda/index.php
ava 8 introduces several new language features designed to make it easier to write such blocks of code-the key feature being lambda expressions, also colloquially referred to as closures or anonymous methods. A lambda expression is just a shorter way of writing an implementation of a method for later execution.

### 1. Write a Java program to implement a lambda expression to find the sum of two integers.



### 2. Write a Java program to implement a lambda expression to check if a given string is empty.



### 3. Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.



### 4. Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.



### 5. Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.



### 6. Write a Java program to implement a lambda expression to find the average of a list of doubles.



### 7. Write a Java program to implement a lambda expression to remove duplicates from a list of integers.



### 8. Write a lambda expression to implement a lambda expression to calculate the factorial of a given number.



### 9. Write a Java program to implement a lambda expression to create a lambda expression to check if a number is prime.



### 10. Write a Java program to implement a lambda expression to concatenate two strings.



### 11. Write a Java program to implement a lambda expression to find the maximum and minimum values in a list of integers.



### 12. Write a Java program to create a lambda expression to multiply and sum all elements in a list of integers.



### 13. Write a Java program to implement a lambda expression to count words in a sentence.



### 14. Write a Java program to implement a lambda expression to check if a given string is a palindrome.



### 15. Write a Java program to implement a lambda expression to calculate the sum of squares of all odd and even numbers in a list.



### 16. Write a Java program to implement a lambda expression to check if a list of strings contains a specific word.



### 17. Write a Java program to implement a lambda expression to find the length of the longest and smallest string in a list.



### 18. Write a Java program to implement a lambda expression to check if a given number is a perfect square.



### 19. Write a Java program to implement a lambda expression to find the second largest and smallest element in an array.



### 20. Write a Java program to implement a lambda expression to sort a list of objects based on a specific attribute.



### 21. Write a Java program to implement a lambda expression to calculate the sum of all prime numbers in a given range.



### 22. Write a Java program to implement a lambda expression to check if a list of strings are all uppercase or all lowercase or mixedcase.



### 23. Write a Java program to implement a lambda expression to find the average length of strings in a list.



### 24. Write a Java program to implement a lambda expression to find the largest prime factor of a given number.



### 25. Write a Java program to implement a lambda expression to convert an integer to their corresponding binary representation.

# Java Exercises Stream

https://www.w3resource.com/java-exercises/stream/index.php
Processing Data with  Java SE 8 Streams:

Stream is a sequence of elements from a source that supports aggregate operations. Let’s break it down:

Sequence of elements: A stream provides an interface to a sequenced set of values of a specific element type. However, streams don’t actually store elements; they are computed on demand.
Source: Streams consume from a data-providing source such as collections, arrays, or I/O resources.
Aggregate operations: Streams support SQL-like operations and common operations from functional  programing languages, such as filter, map, reduce, find, match, sorted, and so on.
### 1. Write a Java program to calculate the average of a list of integers using streams.



### 2. Write a Java program to convert a list of strings to uppercase or lowercase using streams.



### 3. Write a Java program to calculate the sum of all even, odd numbers in a list using streams.



### 4. Write a Java program to remove all duplicate elements from a list using streams.



### 5. Write a Java program to count the number of strings in a list that start with a specific letter using streams.



### 6. Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.



### 7. Write a Java program to find the maximum and minimum values in a list of integers using streams.



### 8. Write a Java program to find the second smallest and largest elements in a list of integers using streams.

# Java Exercises Method

https://www.w3resource.com/java-exercises/method/index.php
### 1. Write a Java method to find the smallest number among three numbers.
Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29
Expected Output:

The smallest value is 25.0


### 2. Write a Java method to compute the average of three numbers.
Test Data:
Input the first number: 25
Input the second number: 45
Input the third number: 65
Expected Output:

The average value is 45.0


### 3. Write a Java method to display the middle character of a string.
Note: a) If the length of the string is odd there will be two middle characters.
b) If the length of the string is even there will be one middle character.
Test Data:
Input a string: 350
Expected Output:

                                                                          
The middle character in the string: 5


### 4. Write a Java method to count all vowels in a string.
Test Data:
Input the string: w3resource
Expected Output:

Number of  Vowels in the string: 4


### 5. Write a Java method to count all the words in a string.
Test Data:
Input the string: The quick brown fox jumps over the lazy dog.
Expected Output:

Number of words in the string: 9


### 6. Write a Java method to compute the sum of digits in an integer.
Test Data:
Input an integer: 25
Expected Output:

The sum is 7 


### 7. Write a Java method to display the first 50 pentagonal numbers.
Note: A pentagonal number is a figurate number that extends the concept of triangular and square numbers to the pentagon, but, unlike the first two, the patterns involved in the construction of pentagonal numbers are not rotationally symmetrical.
Expected Output:


1     5     12    22    35    51    70    92    117   145
176   210   247   287   330   376   425   477   532   590
651   715   782   852   925   1001  1080  1162  1247  1335
1426  1520  1617  1717  1820  1926  2035  2147  2262  2380
2501  2625  2752  2882  3015  3151  3290  3432  3577  3725 


### 8. Write a Java method to compute the future investment value at a given interest rate for a specified number of years.
Sample data (Monthly compounded) and Output:
Input the investment amount: 1000
Input the rate of interest: 10
Input number of years: 5

Expected Output:

Years    FutureValue                                     
1            1104.71                                     
2            1220.39                                     
3            1348.18                                     
4            1489.35                                     
5            1645.31


### 9. Write a Java method to print characters between two characters (i.e. A to P).
Note: Prints 20 characters per line

Expected Output:

( ) * + , - . / 0 1 2 3 4 5 6 7 8 9 : ;                  
< = > ? @ A B C D E F G H I J K L M N O                  
P Q R S T U V W X Y Z [ \ ] ^ _ ` a b c                  
d e f g h i j k l m n o p q r s t u v w                  
x y z


### 10. Write a Java method to check whether a year (integer) entered by the user is a leap year or not.

Expected Output:

Input a year: 2017                                                                        
false


### 11. Write a Java method to check whether a string is a valid password.
Password rules:
A password must have at least ten characters.
A password consists of only letters and digits.
A password must contain at least two digits.

Expected Output:

1. A password must have at least eight characters.                                             
2. A password consists of only letters and digits.                                         
3. A password must contain at least two digits                                        
Input a password (You are agreeing to the above Terms and Conditions.): abcd1234           
Password is valid: abcd1234 


### 12. Write a Java method (takes n as input) to display an n-by-n matrix.

Expected Output:

Input a number: 10                                                                         
1 0 0 1 1 0 0 0 1 1                                                                       
0 0 1 0 1 0 1 0 0 0                                                                        
0 1 0 1 0 0 0 0 0 1                                                                       
1 1 1 0 0 0 0 1 1 1                                                                        
1 1 0 1 1 1 0 1 0 0                                                                      
1 0 0 0 1 1 0 0 0 0                                                                       
0 0 1 0 0 0 0 1 1 1                                                                      
1 1 0 1 0 1 0 0 1 0                                                                       
0 0 1 0 0 0 0 1 1 0                                                        
1 1 1 0 0 1 1 1 1 0


### 13. Write Java methods to calculate triangle area.

Expected Output:

Input Side-1: 10                                                                               
Input Side-2: 15                                                                               
Input Side-3: 20                                                                              
The area of the triangle is 72.6184377413890


### 14. Write a Java method to create a pentagon's area.

Expected Output:

Input the number of sides: 5                             
Input the side: 6                                        
The area of the pentagon is 61.93718642120281


### 15. Write a Java method to display the current date and time.

Expected Output:

Current date and time: Wednesday January 25, 2017 7:47:43


### 16. Write a Java method to find all twin prime numbers less than 100.

Expected Output:

(3, 5)                                                   
(5, 7)                                                   
(11, 13)                                                 
(17, 19)                                                 
(29, 31)                                                 
(41, 43)                                                 
(59, 61)                                                 
(71, 73) 


### 17. Write a Java method to count the number of digits in an integer with the value 2. The integer may be assumed to be non-negative.

Expected Output:

Input a number:  12541
1


### 18. Write a Java method that accepts three integers and checks whether they are consecutive or not. Returns true or false.

Expected Output:

Input the first number:  15
Input the second number:  16
Input the third number:  17
Check whether the three said numbers are consecutive or not!true


### 19. Write a Java method that accepts three integers and returns true if one is the middle point between the other two integers, otherwise false.

Expected Output:

Input the first number:  2
Input the second number:  4
Input the third number:  6
Check whether the three said numbers has a midpoint!
true


### 20. Write a Java method for extracting the first digit from a positive or negative integer.

Expected Output:

Input an integer(positive/negative): 1234
Extract the first digit from the said integer:
1


### 21. Write a Java method to display the factors of 3 in a given integer.

Expected Output:

Input an integer(positive/negative): 81

Factors of 3 of the said integer:
81 = 3 * 3 * 3 * 3 * 1


### 22. Write a Java method to check whether every digit of a given integer is even. Return true if every digit is odd otherwise false.

Expected Output:

Input an integer: 8642
Check whether every digit of the said integer is even or not!
true


### 23. Write a Java method that checks whether all the characters in a given string are vowels (a, e,i,o,u) or not. Return true if each character in the string is a vowel, otherwise return false.

Expected Output:

Input a string:  AIEEE
Check all the characters of the said string are vowels or not!
true

# Java Exercises Numbers

https://www.w3resource.com/java-exercises/numbers/index.php
### 1. Write a Java program to check whether a given number is ugly.
In number system, ugly numbers are positive numbers whose only prime factors are 2, 3 or 5. First 10 ugly numbers are 1, 2, 3, 4, 5, 6, 8, 9, 10, 12. By convention, 1 is included.
Test Date:Input an integer number: 235
Expected Output :
It is not an ugly number.



### 2. Write a Java program that categorizes integers between 1 and 10,000 as Abundant, Deficient, and Perfect.
In number theory, an abundant number is a number for which the sum of its proper divisors is greater than the number itself.
Example :
The first few abundant numbers are:
12, 18, 20, 24, 30, 36, 40, 42, 48, 54, 56, 60, 66, 70, 72, 78, 80, 84, 88, 90, 96, 100, 102,…
The integer 12 is the first abundant number. Its proper divisors are 1, 2, 3, 4 and 6 for a total of 16.
Deficient number: In number theory, a deficient number is a number n for which the sum of divisors σ(n)<2n, or, equivalently, the sum of proper divisors (or aliquot sum) s(n)<n. The value 2n − σ(n) (or n − s(n)) is called the number's deficiency.
As an example, divisors of 21 are 1, 3 and 7, and their sum is 11. Because 11 is less than 21, the number 21 is deficient. Its deficiency is 2 × 21 − 32 = 10.
The first few deficient numbers are:
1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 19, 21, 22, 23, 25, 26, 27, 29, 31, 32, 33, …….
Perfect number: In number system, a perfect number is a positive integer that is equal to the sum of its proper positive divisors, that is, the sum of its positive divisors excluding the number itself.
Equivalently, a perfect number is a number that is half the sum of all of its positive divisors (including itself) i.e. σ1(n) = 2n.
The first perfect number is 6. Its proper divisors are 1, 2, and 3, and 1 + 2 + 3 = 6. Equivalently, the number 6 is equal to half the sum of all its positive divisors: ( 1 + 2 + 3 + 6 ) / 2 = 6. The next perfect number is 28 = 1 + 2 + 4 + 7 + 14. This is followed by the perfect numbers 496 and 8128.
Expected Output :
Number Counting [(integers) between 1 to 10,000]:
Deficient number: 7508
Perfect number: 4
Abundant number: 2488



### 3. Write a Java program to generate random integers in a specific range.



### 4. Write a Java program to generate and show all Kaprekar numbers less than 1000.
Expected Output :


1       1         0 + 1                                  
9       81        8 + 1                                  
45      2025      20 + 25                                
55      3025      30 + 25                                
99      9801      98 + 01                                
297     88209     88 + 209                               
703     494209    494 + 209                              
999     998001    998 + 001                              
8 Kaprekar numbers.  


### 5. Write a Java program to find the number of seed Lychrel number candidates and related numbers for n in the range 1..10000 inclusive. (With a 500-iteration limit).
A Lychrel number is a natural number that cannot form a palindrome through the iterative process of repeatedly reversing its digits and adding the resulting numbers. This process is sometimes called the 196-algorithm, after the most famous number associated with the process.
The first few Lychrel numbers are 196, 295, 394, 493, 592, 689, 691, 788, 790, 879, 887, ... .
Expected Output :
5 Lychrel seeds: [196, 879, 1997, 7059, 9999]
244 Lychrel related
5 Lychrel palindromes: [196, 879, 1997, 7059, 9999]



### 6. Write a Java program to generate and show the first 15 narcissistic decimal numbers.
Expected Output :

0 1 2 3 4 5 6 7 8 9 153 370 371 407 1634


### 7. Write a Java program to display the first 10 lucus numbers.
The Lucas numbers or series are an integer sequence named after the mathematician François Édouard Anatole Lucas, who studied both that sequence and the closely related Fibonacci numbers. Lucas numbers and Fibonacci numbers form complementary instances of Lucas sequences.


The sequence of Lucas numbers is: 2, 1, 3, 4, 7, 11, 18, 29, ….
Expected Output :

   First ten Lucas a numbers:                                              
2                                                                       
1                                                                       
3                                                                       
4                                                                       
7                                                                       
11                                                                      
18                                                                      
29                                                                      
47                                                                      
76


### 8.Write a Java program to print out the first 10 Catalan numbers by extracting them from Pascal's triangle.
In combinatorial  mathematics, the Catalan numbers form a sequence of natural numbers that occur in various counting problems, often involving recursively-defined objects. They are named after the Belgian mathematician Eugène Charles Catalan.
The first Catalan numbers for n = 0, 1, 2, 3, … are 1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, 16796, 58786, 208012, 742900, 2674440, 9694845, 35357670, 129644790, 477638700, 1767263190, 6564120420, 24466267020, 91482563640, 343059613650, 1289904147324, 4861946401452,

List 10 Catalan numbers:-                                               
                                                                        
1                                                                       
2                                                                       
5                                                                       
14                                                                      
42                                                                      
132                                                                     
429                                                                     
1430                                                                    
4862                                                                    
16796  


### 9. Write a Java program to find and print the first 10 happy numbers.
Happy number: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1, or it loops endlessly in a cycle which does not include 1.
Example: 19 is a happy number
12 + 92=82
82 + 22=68
62 + 82=100
12 + 02 + 02=1

Expected Output

First 10 Happy numbers:                                                 
1                                                                       
7                                                                       
10                                                                      
13                                                                      
19                                                                      
23                                                                      
28                                                                      
31   


### 10. Write a Java program to check whether a given number is a happy number or unhappy number.
Happy number: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1, or it loops endlessly in a cycle which does not include 1.
An unhappy number is a number that is not happy.
The first few unhappy numbers are 2, 3, 4, 5, 6, 8, 9, 11, 12, 14, 15, 16, 17, 18, 20.

Expected Output

Input a number: 5                                                       
Unhappy Number


### 11. Write a Java program to check whether a given number is a Disarium number or an unhappy number.
A Disarium number is a number defined by the following process :
Sum of its digits powered with their respective position is equal to the original number.
For example 175 is a Disarium number :
As 11+32+53 = 135
Some other DISARIUM are 89, 175, 518 etc.
A number will be called Disarium if the sum of its digits powered with their respective position is equal with the number itself. Sample Input: 135.
Expected Output

Input a number : 25                                                     
Not a Disarium Number.


### 12. Write a Java program to check whether a number is a Harshad Number or not.
In recreational  mathematics, a harshad number in a given number base, is an integer that is divisible by the sum of its digits when written in that base.
Example: Number 200 is a Harshad Number because the sum of digits 2 and 0 and 0 is 2(2+0+0) and 200 is divisible by 2. Number 171 is a Harshad Number because the sum of digits 1 and 7 and 1 is 9(1+7+1) and 171 is divisible by 9.
Expected Output

Input a number : 353  
                                                  
353 is not a Harshad Number.


### 13. Write a Java program to check whether a number is a Pronic or Heteromecic Number or not.
A pronic number is a number which is the product of two consecutive integers, that is, a number of the form n(n + 1).
The first few pronic numbers are:
0, 2, 6, 12, 20, 30, 42, 56, 72, 90, 110, 132, 156, 182, 210, 240, 272, 306, 342, 380, 420, 462 … etc.

Expected Output
Input a number : 110
Pronic Number.



### 14. Write a Java program to check whether a number is an automorphic number or not.
In  mathematics, an automorphic number is a number whose square "ends" in the same digits as the number itself. For example, 52 = 25, 62 = 36, 762 = 5776, and 8906252 = 793212890625, so 5, 6, 76 and 890625 are all automorphic numbers.
Expected Output

Input a number : 76                                                   
Automorphic Number.


### 15. Write a Java program to check whether a number is a Duck Number or not.
Note: A Duck number is a number which has zeroes present in it, but there should be no zero present in the beginning of the number. For example 3210, 7056, 8430709 are all duck numbers whereas 08237, 04309 are not.
Expected Output

Input a number : 3210                                                   
Duck number
 


### 16. Write a Java program to check two numbers are Amicable numbers or not.
Amicable numbers are two different numbers so related that the sum of the proper divisors of each is equal to the other number.
The first ten amicable pairs are: (220, 284), (1184, 1210), (2620, 2924), (5020, 5564), (6232, 6368), (10744, 10856), (12285, 14595), (17296, 18416), (63020, 76084), and (66928, 66992).
Expected Output

Input the first number: 220                                             
Input the second number: 284                                            
These numbers are amicable.


### 17. Write a Java program to check if a given number is a circular prime or not.
Circular Prime : A circular prime is a prime number with the property that the number generated at each intermediate step when cyclically permuting its (base 10) digits will be prime.
For example, 1193 is a circular prime, since 1931, 9311 and 3119 all are also prime. A circular prime with at least two digits can only consist of combinations of the digits 1, 3, 7 or 9, because having 0, 2, 4, 6 or 8 as the last digit makes the number divisible by 2, and having 0 or 5 as the last digit makes it divisible by 5.
Input Data:
Input a number: 35
Expected Output

It is not a Circular Prime number.


### 18. Write a Java program to check if a number is a cube or not.
In arithmetic and algebra, the cube of a number n is its third power: the result of the number multiplied by itself twice:
n3 = n × n × n.
Input Data:
Input a number: 8
Expected Output

Number is a cube.


### 19. Write a Java program to check if a number is cyclic or not.
A cyclic number is an integer in which cyclic permutations of the digits are successive multiples of the number. The most widely known are 142857:
142857 × 1 = 142857
142857 × 2 = 285714
142857 × 3 = 428571
142857 × 4 = 571428
142857 × 5 = 714285
142857 × 6 = 857142
Input Data:
Input a number: 142857
Expected Output

It is a cyclic number.


### 20. Write a Java program to display the first 10 Fermat numbers.
In  mathematics, a Fermat number is a positive integer of the form
Fermat Number
where n is a nonnegative integer.
The first few Fermat numbers are:
3, 5, 17, 257, 65537, 4294967297, 18446744073709551617, …
Expected Output

3.0                                                                     
5.0                                                                     
17.0                                                                    
257.0                                                                   
65537.0                                                                 
4.294967297E9                                                           
1.8446744073709552E19                                                   
3.4028236692093846E38                                                   
1.157920892373162E77                                                    
1.3407807929942597E154                                                  
Infinity   


### 21. Write a Java program to find any number between 1 and n that can be expressed as the sum of two cubes in two (or more) different ways.
//http://introcs.cs.princeton.edu/java/13flow/Ramanujan.java.html
Here are some examples of Ramanujan numbers :
1729 = 1^3 + 12^3 = 9^3 + 10^3
* 10000
1729 = 1^3 + 12^3 = 9^3 + 10^3
4104 = 2^3 + 16^3 = 9^3 + 15^3
* 100000
1729 = 1^3 + 12^3 = 9^3 + 10^3
4104 = 2^3 + 16^3 = 9^3 + 15^3
13832 = 2^3 + 24^3 = 18^3 + 20^3
39312 = 2^3 + 34^3 = 15^3 + 33^3
46683 = 3^3 + 36^3 = 27^3 + 30^3
32832 = 4^3 + 32^3 = 18^3 + 30^3
40033 = 9^3 + 34^3 = 16^3 + 33^3
20683 = 10^3 + 27^3 = 19^3 + 24^3
65728 = 12^3 + 40^3 = 31^3 + 33^3
64232 = 17^3 + 39^3 = 26^3 + 36^3

Expected Output
1729 = 1^3 + 12^3 = 9^3 + 10^3                                          
4104 = 2^3 + 16^3 = 9^3 + 15^3                                          
13832 = 2^3 + 24^3 = 18^3 + 20^3                                        
39312 = 2^3 + 34^3 = 15^3 + 33^3                                        
46683 = 3^3 + 36^3 = 27^3 + 30^3                                        
32832 = 4^3 + 32^3 = 18^3 + 30^3                                        
40033 = 9^3 + 34^3 = 16^3 + 33^3                                        
20683 = 10^3 + 27^3 = 19^3 + 24^3                                       
65728 = 12^3 + 40^3 = 31^3 + 33^3                                       
64232 = 17^3 + 39^3 = 26^3 + 36^3


### 22. Write a program to check if a number is a Mersenne number or not.
In  mathematics, a Mersenne number is a number that can be written in the form M(n) = 2n − 1 for some integer n.
The first four Mersenne primes are 3, 7, 31, and 127

Expected Output

Input a number: 127                                                     
127 is a Mersenne number.


### 23. Write a Java program to find all narcissistic numbers between 1 and 1000.
In number theory, a narcissistic number is a number that is the sum of its own digits each raised to the power of the number of digits.
For example:
153 = 13 + 53 + 33

Expected Output
1                                                      
2                                                      
3                                                      
4                                                      
5                                                      
6                                                      
7                                                      
8                                                      
9                                                      
153                                                    
370                                                    
371                                                    
407


### 24. Write a Java program to check if a number is a palindrome or not.
In number system a palindromic number is a number that is the same when written forwards or backwards, i.e., of the form .
The first few palindromic numbers are therefore are 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, …

Expected Output
Input a number: 5                                                       
It is a Palindrome number. 


### 25. Write a Java program to print the first 15 numbers of the Pell series.
In  mathematics, the Pell numbers are an infinite sequence of integers. The sequence of Pell numbers starts with 0 and 1, and then each Pell number is the sum of twice the previous Pell number and the Pell number before that.:
thus, 70 is the companion to 29, and 70 = 2 × 29 + 12 = 58 + 12.
The first few terms of the sequence are :
0, 1, 2, 5, 12, 29, 70, 169, 408, 985, 2378, 5741, 13860,…

Expected Output
First 20 Pell numbers:                                                  
1 2 5 12 29 70 169 408 985 2378 5741 13860 33461 80782 195025 470832 113
6689 2744210 6625109 15994428


### 26. Write a Java program to check whether a number is a Keith Number or not.
In recreational  mathematics, a Keith number or repfigit number (short for repetitive Fibonacci-like digit) is a number in the following integer sequence:
14, 19, 28, 47, 61, 75, 197, 742, 1104, 1537, 2208, 2580, 3684, 4788, 7385, 7647, 7909, 31331, 34285, 34348, 55604, 62662, 86935, 93993, 120284, 129106, 147640, 156146, 174680, 183186, 298320, 355419, 694280, 925993,

Expected Output
Input a number: 75                                                         
Keith Number


### 27. Write a Java program to create the first twenty Hamming numbers.
In  computer science, regular numbers are often called Hamming numbers, Hamming Numbers are numbers whose only prime factors are 2, 3 and 5.
The first few hamming numbers are :
1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, 16, 18, 20, 24, 25, 27, 30, 32

Expected Output
First Twenty Hamming numbers: 1 2 3 4 5 6 8 9 10 12 15 16 18 20 24 25 27
 30 32 36


### 28. Write a Java program to check whether a number is an Armstrong Number or not.
Armstrong (Michael F. Armstrong) number is a number that is equal to the sum of cubes of its digits. For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers
Expected Output

Input an integer:  153
Is Armstrong number? true


### 29. Write a Java program to check whether a number is a Luck number or not.
Expected Output

Input an integer:  25
Is Lucky number? true

# Java Exercises Collection

https://www.w3resource.com/java-exercises/collection/index.php
Java Collection Exercises [126 exercises with solution]
Java Collection refers to a  framework provided by Java to store and manipulate groups of objects. It offers a set of interfaces (like List, Set, Queue, etc.) and classes (like ArrayList, HashSet, PriorityQueue, etc.) that provide different ways to organize and work with collections of elements. This  framework simplifies common operations such as adding, removing, and accessing elements. It offers a wide range of data structures to suit various programming needs.

List of Java Collection Exercises :

ArrayList Exercises [22 exercises with solution]
LinkedList Exercises [26 exercises with solution]
HashSet Exercises [12 exercises with solution]
TreeSet Exercises [16 exercises with solution]
PriorityQueue Exercises [12 exercises with solution]
HashMap Exercises [12 exercises with solution]
TreeMap Exercises [26 exercises with solution]
ArrayList:

In Java, an ArrayList is a resizable array implementation of the List interface provided by the Java Collections  Framework. It's part of the java.util package. Unlike arrays, which have a fixed size, ArrayList can dynamically grow and shrink in size as elements are added or removed. This makes it a more flexible data structure for handling collections of objects.

Key features and characteristics of ArrayList:

Dynamic Size: As mentioned, an ArrayList can dynamically increase or decrease its size based on the number of elements it contains.
Random Access: Elements within an ArrayList can be accessed using their index position. This allows for fast retrieval of elements based on their position in the list.
Generics: ArrayList supports generics, which means it can hold elements of a specified type. This ensures type safety and avoids explicit type casting when retrieving elements from the list.
Iterable: ArrayList implements the Iterable interface, which means it can be easily traversed using iterators or enhanced for loops.
Not Synchronized: This class is roughly equivalent to Vector, except it is unsynchronized.
LinkedList:

In Java, LinkedList is another implementation of the List interface provided by the Java Collections  Framework. It's part of the java.util package. Unlike ArrayList, which is backed by an array, LinkedList is implemented as a doubly-linked list.

Key features and characteristics of LinkedList:

Internal Structure: LinkedList utilizes a doubly linked list internally for element storage, facilitating efficient insertion and deletion operations.
Data Manipulation: LinkedList excels in data manipulation tasks due to its efficient insertion and removal operations.
List and Queue Operations: The LinkedList class can serve as both a list and a queue, as it implements both the List and Deque interfaces.
Performance Advantage: Manipulating elements in a LinkedList tends to be faster compared to ArrayList due to its employment of a doubly linked list structure, eliminating the need for bit shifting in memory operations.
Optimal Use Cases: LinkedList is ideal for scenarios where frequent addition and removal of items occurs at the beginning or middle of the list, and where random access to elements is not essential.
HashSet:

In Java, HashSet is an implementation of the Set interface provided by the Java Collections  Framework. It's part of the java.util package.

Key features and characteristics of HashSet:

Support for Null Values: HashSet permits null values within its collection.
Hashing Mechanism: Elements in a HashSet are organized and stored based on a hashing mechanism, optimizing insertion, deletion, and search operations.
Non-Synchronized Implementation: HashSet is a non-synchronized class, meaning it's not inherently thread-safe and requires external synchronization for concurrent access.
Hash Code-based Element Management: Elements within a HashSet are inserted and identified using their respective hash codes, facilitating efficient retrieval and manipulation.
Unique Element Constraint: HashSet enforces uniqueness among its elements, ensuring no duplicate elements within the collection.
Primarily Suited for Search Operations: HashSet is particularly advantageous for search operations due to its constant-time complexity for basic operations, such as retrieval and verification of element existence.
Default Capacity and Load Factor: By default, HashSet initializes with a capacity of 16 and a load factor of 0.75, which can be adjusted as needed to optimize performance and memory usage.
Hash Table Data Structure: HashSet utilizes the hash table data structure internally to manage its elements efficiently, supporting rapid access and modification operations.
TreeSet:

In Java, TreeSet is an implementation of the SortedSet interface provided by the Java Collections  Framework. It's part of the java.util package.


Here are the key features and characteristics of TreeSet:

Uniqueness of Elements: TreeSet ensures that only unique elements are stored within its collection, discarding duplicate elements.
Absence of Insertion Order Preservation: Unlike certain collection types, such as lists, TreeSet does not maintain the order in which elements are inserted.
Ascending Order Sorting: Elements within a TreeSet are automatically sorted in ascending order according to their natural ordering or a custom comparator.
Lack of Thread Safety: TreeSet is not inherently thread-safe, meaning it does not provide built-in mechanisms to handle concurrent access by multiple threads. External synchronization is required for thread safety.
PriorityQueue:

In Java, PriorityQueue is an implementation of the Queue interface provided by the Java Collections  Framework. It's part of the java.util package.

Here are the key features and characteristics of PriorityQueue:

Priority-Based Ordering: Elements are dequeued based on their priority, not in the order they were inserted.
Heap-Based Data Structure: Internally uses a binary heap for efficient element management.
No Guaranteed Order: Order of elements with equal priority is not guaranteed.
Element Priority: Determined by natural ordering or a specified comparator.
Not Synchronized: Requires external synchronization for thread safety.
Performance: Offers logarithmic time complexity for insertion and removal operations.
Usage: Commonly used in algorithms requiring prioritized element processing, like graph algorithms and scheduling.
HashMap:

In Java, HashMap is an implementation of the Map interface provided by the Java Collections  Framework. It's part of the java.util package.

Here are the key features and characteristics of HashMap:

Key-Value Storage: Stores data in key-value pairs for efficient retrieval.
Unordered Collection: Does not maintain the order of elements.
Unique Keys: Each key must be unique; duplicate keys are not allowed.
Null Keys and Values: Allows null keys and multiple null values.
Hash Table Structure: Uses a hash table internally for fast retrieval, insertion, and deletion.
Not Synchronized: Not inherently thread-safe; external synchronization is needed for concurrent access.
Good Performance: Offers constant-time performance for most operations.
Iteration Order: The order of iteration is not guaranteed.
TreeMap:

In Java, TreeMap is an implementation of the SortedMap interface provided by the Java Collections  Framework. It's part of the java.util package.

Here are the key features and characteristics of TreeMap:

Key-Value Storage: Stores data in key-value pairs for efficient retrieval.
Sorted Collection: Maintains elements in sorted order based on keys.
Balanced Binary Search Tree: Uses a Red-Black Tree internally for efficient organization.
Unique Keys: Each key must be unique; duplicates are prohibited.
Null Keys: Does not allow null keys.
Null Values: Allows null values to be associated with keys.
Not Synchronized: Not inherently thread-safe; external synchronization needed for concurrent access.
Performance: Offers guaranteed logarithmic time complexity for most operations.
Navigable Map Operations: Provides additional operations for navigating elements based on their order.

# Java Exercises Sorting

https://www.w3resource.com/java-exercises/sorting/index.php

### 1. Write a Java program to sort an array of given integers using the Quick sort algorithm.
Quick sort is a comparison sort, meaning it can sort items of any type for which a "less-than" relation (formally, a total order) is defined.


### 2. Write a Java program to sort an array of given integers using the Bubble Sorting Algorithm.
According to Wikipedia "Bubble sort, sometimes called sinking sort, is a simple sorting algorithm that repeatedly steps through the list to be sorted. It compares each pair of adjacent items and swaps them if they are in the wrong order. The pass through the list is repeated until no swaps are needed, which indicates the list is in order. The algorithm, which is a comparison sort, is named for the way smaller elements "bubble" to the top of the list. Although the algorithm is simple, it is too slow and impractical for most problems even compared to an insertion sort. It can be practical if the input is usually in sort order but occasionally has some out-of-order elements nearly in position."




### 3. Write a Java program to sort an array of given integers using the Radix sort algorithm.
According to Wikipedia "In computer science, radix sort is a non-comparative integer sorting algorithm that sorts data with integer keys by grouping keys by the individual digits that share the same significant position and value".



### 4. Write a Java program to sort an array of given integers using the Merge Sort Algorithm.
According to Wikipedia "Merge sort (also commonly spelled mergesort) is an O (n log n) comparison-based sorting algorithm. Most implementations produce a stable sort, which means that the implementation preserves the input order of equal elements in the sorted output."


### 5. Write a Java program to sort an array of given integers using the Heap sort algorithm.

In computer science heapsort (invented by J. W. J. Williams in 1964) is a comparison-based sorting algorithm. Heapsort can be thought of as an improved selection sort: like that algorithm, it divides its input into a sorted and an unsorted region, and it interactively shrinks the unsorted region by extracting the largest element and moving that to the sorted region. The improvement consists of the use of a heap data structure rather than a linear-time search to find the maximum. Although somewhat slower in practice on most machines than a well-implemented quicksort, it has the advantage of a more favorable worst-case O(n log n) runtime. Heapsort is an in-place algorithm, but not a stable sort.


### 6. Write a Java program to sort an array of given integers using the Selection Sort Algorithm.

Wikipedia says "In computer science, selection sort is a sorting algorithm, specifically an in-place comparison sort. It has O(n2) time complexity, making it inefficient on large lists, and generally performs less efficiently than the similar insertion sort".


### 7. Write a Java program to sort an array of given integers using the Insertion sort algorithm.

Insertion sort is a simple sorting algorithm that builds the final sorted array (or list) one item at a time. It is much less efficient on large lists than other algorithms such as quicksort, heapsort, or merge sort.


### 8. Write a Java program to sort an array of positive integers using the Bead Sort Algorithm.
According to Wikipedia "Bead sort, also called gravity sort, is a natural sorting algorithm, developed by Joshua J. Arulanandham, Cristian S. Calude and Michael J. Dinneen in 2002, and published in The Bulletin of the European Association for Theoretical Computer Science. Both digital and analog hardware implementations of bead sort can achieve a sorting time of O(n); however, the implementation of this algorithm tends to be significantly slower in software and can only be used to sort lists of positive integers. Also, it seems that even in the best case, the algorithm requires O(n2) space".


### 9. Write a Java program to sort an array of positive integers using the BogoSort Sort Algorithm.

In computer science, Bogosort is a particularly ineffective sorting algorithm based on the generate and test paradigm. The algorithm successively generates permutations of its input until it finds one that is sorted. It is not useful for sorting but may be used for educational purposes, to contrast it with other more realistic algorithms.


### 10. Write a Java program to sort an array of positive integers using the Cocktail sort algorithm.

Cocktail shaker sort (also known as bidirectional bubble sort, cocktail sort, shaker sort, ripple sort, shuffle sort, or shuttle sort ) is a variation of bubble sort that is both a stable sorting algorithm and a comparison sort. The algorithm differs from a bubble sort in that it sorts in both directions on each pass through the list. This sorting algorithm is only marginally more difficult to implement than a bubble sort and solves the problem of turtles in bubble sorts. It provides only marginal performance improvements, and does not improve asymptotic performance; like the bubble sort, it is not of practical interest, though it finds some use in education.


### 11. Write a Java program to sort an array of given integers using the CombSort algorithm.

The Comb Sort is a variant of the Bubble Sort. Like the Shell sort, the Comb Sort increases the gap used in comparisons and exchanges. Some implementations use the insertion sort once the gap is less than a certain amount. The basic idea is to eliminate turtles, or small values near the end of the list, since in a bubble sort these slow the sorting down tremendously. Rabbits, large values around the beginning of the list do not pose a problem in a bubble sort.


### 12. Write a Java program to sort an array of given integers using the CountingSort algorithm.

According to Wikipedia "In computer science, counting sort is an algorithm for sorting a collection of objects according to keys that are small integers; that is, it is an integer sorting algorithm. It operates by counting the number of objects that have each distinct key value. It uses arithmetic on those counts to determine the positions of each key value in the output sequence. Its running time is linear based on the number of items and the difference between the maximum and minimum key values, so it is only suitable for direct use in situations where the variation in keys is not significantly wider than the number of items. However, it is often used as a subroutine in another sorting algorithm, radix sort, which handles larger keys more efficiently".


### 13. Write a Java program to sort an array of given integers using the Gnome sort algorithm.

Gnome sort is a sorting algorithm originally proposed by Dr. Hamid Sarbazi-Azad (Professor of Computer Engineering at Sharif University of Technology) in 2000 and called "stupid sort" (not to be confused with bogosort), and then later described by Dick Grune and named "gnome sort".
The algorithm always finds the first place where two adjacent elements are in the wrong order, and swaps them. It takes advantage of the fact that swapping can introduce a new out-of-order adjacent pair only next to the two swapped elements.


### 14. Write a Java program to sort an array of given integers using the Pancake sort algorithm.

Pancake sorting is the colloquial term for the mathematical problem of sorting a disordered stack of pancakes in order of size. This is when a spatula can be inserted at any point in the stack and used to flip all pancakes above it. Pancake numbers are the minimum number of flips required for a given number of pancakes. The problem was first discussed by American geometer Jacob E. Goodman. It is a variation of the sorting problem in which the only allowed operation is to reverse the elements of some prefix of the sequence.


### 15. Write a Java program to sort an array of given integers using the Permutation sort algorithm.

Implement a permutation sort, which generates the possible permutations of the input array/list until discovering the sorted one.


### 16. Write a Java program to sort an array of given integers Shell Sort Algorithm.

According to Wikipedia "Shell sort or Shell's method, is an in-place comparison sort. It can be seen as either a generalization of sorting by exchange (bubble sort) or sorting by insertion (insertion sort). The method starts by sorting pairs of elements far apart from each other, then progressively reducing the gap between elements to be compared. Starting with far apart elements can move some out-of-place elements into position faster than a simple nearest neighbor exchange."


### 17. Write a Java program to sort an array of given non-negative integers using the Sleep Sort Algorithm.

Sleep sort works by starting a separate task for each item to be sorted. Each task sleeps for an interval corresponding to the item's sort key, then emits the item. Items are then collected sequentially in time.


### 18. Write a Java program to sort an array of given non-negative integers using the Stooge Sort Algorithm.

Stooge sort is a recursive sorting algorithm with a time complexity of O(nlog 3 / log 1.5 ) = O(n2.7095...). The running time of the algorithm is thus slower than efficient sorting algorithms, such as Merge sort, and is even slower than Bubble sort.


### 19. Write a Java program to sort an array of given integers using the Bucket Sort Algorithm.

Bucket sort is a sorting algorithm that distributes the elements of an array into a number of buckets. Each bucket is then sorted individually, either using a different sorting algorithm, or by recursively applying the bucket sorting algorithm. It is a distribution sort, a generalization of pigeonhole sort, and a cousin of radix sort in the most-to-least significant digit flavor.

# Java Exercises Search

https://www.w3resource.com/java-exercises/search/index.php
### 1. Write a Java program to find a specified element in a given array of elements using Binary Search.


### 2. Write a Java program to find a specified element in a given array of elements using Linear Search.


### 3. Write a Java program to find a specified element in a given sorted array of elements using Jump Search.
From Wikipedia, in  computer science, a jump search or block search refers to a search algorithm for ordered lists. It works by first checking all items Lkm, where ℜ ∈ ℵ and m is the block size, until an item is found that is larger than the search key. To find the exact position of the search key in the list a linear search is performed on the sublist L[(k-1)m, km].



### 4. Write a Java program to find a specified element in a given array of elements using Interpolation Search.
From Wikipedia, Interpolation search is an algorithm for searching for a key in an array that has been ordered by numerical values assigned to the keys (key values). It was first described by W. W. Peterson in 1957. Interpolation search resembles the method by which people search a telephone directory for a name (the key value by which the book's entries are ordered): in each step the algorithm calculates where in the remaining search space the sought item might be, based on the key values at the bounds of the search space and the value of the sought key, usually via a linear interpolation. The key value actually found at this estimated position is then compared to the key value being sought. If it is not equal, then depending on the comparison, the remaining search space is reduced to the part before or after the estimated position. This method will only work if calculations on the size of differences between key values are sensible.


### 5. Write a Java program to find a specified element in a given sorted array of elements using Exponential search.

From Wikipedia, in  computer science, an exponential search (also called doubling search or galloping search or Struzik search) is an algorithm, created by Jon Bentley and Andrew Chi-Chih Yao in 1976, for searching sorted, unbounded/infinite lists. There are numerous ways to implement this with the most common being to determine a range that the search key resides in and performing a binary search within that range. This takes O(log i) where i is the position of the search key in the list, if the search key is in the list, or the position where the search key should be, if the search key is not in the list.


### 6. Write a Java program to find a specified element in a given array of elements using Ternary search.

From Wikipedia, a ternary search algorithm is a technique in  computer science for finding the minimum or maximum of a unimodal function. A ternary search determines either that the minimum or maximum cannot be in the first third of the domain or that it cannot be in the last third of the domain, then repeats on the remaining two thirds. A ternary search is an example of a divide and conquer algorithm.


### 7. Given is a 2-dimensional integer array [0..m-1, 0..n-1], each row and column of which is in ascending order (see example)
Find the row, column position of a specified number in a given 2-dimensional array
Write a Java program to find the row, column position of a specified number (row, column position) in a given 2-dimensional array.
