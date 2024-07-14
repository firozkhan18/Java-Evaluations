# Java Programming Question Answer

<details>
<summary><b>1. Program to find the sum of all elements in an array</b></summary>

```java
public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Sum of array elements: " + sum);
    }
}
```
</details>
<details>
<summary><b>2. Program to check if a given number is prime or not</b></summary>

```java
public class CheckPrimeNumber {
    public static void main(String[] args) {
        int num = 29;
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
```
</details>
<details>
<summary><b>3. Program to reverse a string</b></summary>

```java
public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder reversedString = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString.append(str.charAt(i));
        }
        System.out.println("Reversed string: " + reversedString.toString());
    }
}
```
</details>
<details>
<summary><b>4. Program to find the factorial of a number</b></summary>

```java
public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + ": " + factorial);
    }
}
```
</details>
<details>
<summary><b>5. Program to implement a stack in Java</b></summary>

```java
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
```
</details>
<details>
<summary><b>6. Program to sort an array in ascending order</b></summary>

```java
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 7};
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
```
</details>
<details>
<summary><b>7. Program to check if a string is a palindrome</b></summary>

```java
public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";
        String reverse = new StringBuilder(str).reverse().toString();
        if (str.equals(reverse)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
```
</details>
<details>
<summary><b>8. Program to find the largest element in an array</b></summary>

```java
public class LargestElement {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 6, 2};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Largest element in the array: " + max);
    }
}
```
</details>
<details>
<summary><b>9. Program to implement a queue in Java</b></summary>

```java
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
```
</details>
<details>
<summary><b>10. Program to count the number of vowels in a string</b></summary>

```java
public class VowelCount {
    public static void main(String[] args) {
        String str = "Hello World";
        int count = 0;
        for (char c : str.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) >= 0) {
                count++;
            }
        }
        System.out.println("Number of vowels in the string: " + count);
    }
}
```
</details>
<details>
<summary><b>11. Program to find the second largest element in an array</b></summary>

```java
import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 6, 2};
        Arrays.sort(array);
        System.out.println("Second largest element in the array: " + array[array.length - 2]);
    }
}
```
</details>
<details>
<summary><b>12. Program to check if two strings are anagrams of each other</b></summary>

```java
import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        boolean isAnagram = Arrays.equals(charArray1, charArray2);
        if (isAnagram) {
            System.out.println("Strings are anagrams.");
        } else {
            System.out.println("Strings are not anagrams.");
        }
    }
}
```
</details>
<details>
<summary><b>13. Program to find the Fibonacci series up to a given number</b></summary>

```java
public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;
        System.out.print("Fibonacci series up to " + n + ": ");
        while (a <= n) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
```
</details>
<details>
<summary><b>14. Program to find the number of words in a string</b></summary>

```java
public class WordCount {
    public static void main(String[] args) {
        String str = "Hello World";
        String[] words = str.trim().split("\\s+");
        System.out.println("Number of words in the string: " + words.length);
    }
}
```
</details>
<details>
<summary><b>15. Program to find the sum of digits of a number</b></summary>

```java
public class SumOfDigits {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
```
</details>
<details>
<summary><b>16. Program to concatenate two strings</b></summary>

```java
public class StringConcatenation {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String concatenated = str1 + " " + str2;
        System.out.println("Concatenated string: " + concatenated);
    }
}
```
</details>
<details>
<summary><b>17. Program to find the index of a given element in an array</b></summary>

```java
public class ElementIndex {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 6, 2};
        int elementToFind = 6;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToFind) {
                index = i;
                break;
            }
        }
        System.out.println("Index of " + elementToFind + ": " + index);
    }
}
```
</details>
<details>
<summary><b>18. Program to find the GCD of two numbers</b></summary>

```java
public class GCD {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;
        int gcd = findGCD(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + ": " + gcd);
    }

    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
```
</details>
<details>
<summary><b>19. Program to find the intersection of two arrays</b></summary>

```java
import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
        Set<Integer> set = new HashSet<>();
        for (int num : array1) {
            set.add(num);
        }
        for (int num : array2) {
            if (set.contains(num)) {
                System.out.println("Intersection: " + num);
            }
        }
    }
}
```
</details>
<details>
<summary><b>20. Program to find the power of a number using recursion</b></summary>

```java
public class PowerOfNumber {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 3;
        System.out.println("Power of " + base + " raised to " + exponent + ": " + power(base, exponent));
    }

    private static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }
}
```
</details>
<details>
<summary><b>21. Remove duplicate elements from an array:</b></summary>

```java
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8};

        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (!list.contains(num)) {
                list.add(num);
            }
        }

        int[] uniqueArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            uniqueArr[i] = list.get(i);
        }

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueArr));
    }
}
```
</details>
<details>
<summary><b>22. Find the smallest element in an array</b></summary>

```java
public class SmallestElementInArray {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 1, 9, 2};
        int smallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("Smallest element in the array: " + smallest);
    }
}
```
</details>
<details>
<summary><b>23 Check if a given string is a valid palindrome or not</b></summary>

```java
public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The string is a valid palindrome.");
        } else {
            System.out.println("The string is not a valid palindrome.");
        }
    }
}
```
</details>
<details>
<summary><b>24 Find the product of two matrices</b></summary>

```java
public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{5, 6}, {7, 8}};
        int[][] product = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Product of the two matrices:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```
</details>
<details>
<summary><b>25 Reverse a linked list</b></summary>

```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {
    public static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        return prev;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Original linked list:");
        printList(head);

        head = reverseList(head);

        System.out.println("Reversed linked list:");
        printList(head);
    }
}
```
</details>
<details>
<summary><b>26. Find the missing number in an array of consecutive numbers</b></summary>

```java
public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = arr.length + 1;
        int totalSum = (n * (n + 1)) / 2;
        int arrSum = 0;

        for (int num : arr) {
            arrSum += num;
        }

        int missingNumber = totalSum - arrSum;
        System.out.println("Missing number in the array: " + missingNumber);
    }
}
```
</details>
<details>
<summary><b>27. Check if a number is a perfect number</b></summary>

```java
public class PerfectNumber {
    public static void main(String[] args) {
        int num = 28;
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (sum == num) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }
}
```
</details>
<details>
<summary><b>28. Find the median of an array</b></summary>

```java
import java.util.Arrays;

public class MedianOfArray {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 7, 2};
        Arrays.sort(arr);

        double median;
        if (arr.length % 2 == 0) {
            median = (double) (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2;
        } else {
            median = arr[arr.length / 2];
        }

        System.out.println("Median of the array: " + median);
    }
}
```
</details>
<details>
<summary><b>29. Check if a string contains only digits</b></summary>

```java
public class OnlyDigitsInString {
    public static void main(String[] args) {
        String str = "12345";
        boolean onlyDigits = true;

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                onlyDigits = false;
                break;
            }
        }

        if (onlyDigits) {
            System.out.println("The string contains only digits.");
        } else {
            System.out.println("The string does not contain only digits.");
        }
    }
}
```
</details>
<details>
<summary><b>30. Find the LCM of two numbers</b></summary>

```java
public class LCM {
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;

        int lcm = findLCM(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);
    }
}
```
</details>

<details>
<summary><b>31. Maximum Subarray Sum Program:</b></summary>

```java
public class MaxSubarraySum {
    public static int maxSubArraySum(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
    
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + maxSubArraySum(nums));
    }
}
```
</details>
<details>
<summary><b>32. Binary Search Algorithm Program:</b></summary>

```java
public class BinarySearch {
    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 7;
        int result = binarySearch(nums, target);
        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
```
</details>
<details>
<summary><b>33. Factorial using Recursion Program:</b></summary>


```java
public class Factorial {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }
}
```
</details>
<details>
<summary><b>34. Remove Element from Array Program:</b></summary>


```java
import java.util.Arrays;

public class RemoveElementFromArray {
    public static int[] removeElement(int[] arr, int element) {
        return Arrays.stream(arr).filter(num -> num != element).toArray();
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int element = 3;
        
        int[] newArr = removeElement(arr, element);
        System.out.println("Array after removing element: " + Arrays.toString(newArr));
    }
}
```
</details>
<details>
<summary><b>35. Sum of Series Program:</b></summary>

```java
public class SumOfSeries {
    public static int sumOfSeries(int n) {
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Sum of series up to " + n + " is: " + sumOfSeries(n));
    }
}
```
</details>
<details>
<summary><b>36. Count Occurrences of Character in a String Program:</b></summary>

```java
public class CountCharacterOccurrences {
    public static int countCharacterOccurrences(String str, char c) {
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        String str = "hello world";
        char c = 'o';
        System.out.println("Number of occurrences of '" + c + "': " + countCharacterOccurrences(str, c));
    }
}
```
</details>
<details>
<summary><b>37. Count Words in a Sentence Program:</b></summary>

```java
public class CountWordsInSentence {
    public static int countWords(String sentence) {
        String[] words = sentence.split("\\s+");
        return words.length;
    }
    
    public static void main(String[] args) {
        String sentence = "This is a sample sentence.";
        System.out.println("Number of words in the sentence: " + countWords(sentence));
    }
}
```
</details>
<details>
<summary><b>38. Area of Circle Program:</b></summary>

```java
public class AreaOfCircle {
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    public static void main(String[] args) {
        double radius = 5.0;
        System.out.println("Area of circle with radius " + radius + " is: " + calculateArea(radius));
    }
}
```
</details>
<details>
<summary><b>39. Bubble Sort Program:</b></summary>

```java
import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] nums) {
        int n = nums.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 1, 5, 9, 2, 6};
        
        bubbleSort(nums);
        System.out.println("Sorted array: " + Arrays.toString(nums));
    }
}
```
</details>
<details>
<summary><b>40. Decimal to Binary Conversion Program:</b></summary>

```java
public class DecimalToBinary {
    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }
    
    public static void main(String[] args) {
        int decimal = 15;
        System.out.println("Binary representation of " + decimal + " is: " + decimalToBinary(decimal));
    }
}
```
</details>
<details>
<summary><b>41. Write a program to find the first non-repeated character in a string.</b></summary>

```java
public class FindFirstNonRepeatedChar {
    public static char findFirstNonRepeatedChar(String str) {
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }
        
        return ' ';
    }
    
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("The first non-repeated character is: " + findFirstNonRepeatedChar(str));
    }
}
```
</details>
<details>
<summary><b>42. Write a program to implement a linked list.</b></summary>

```java
class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ImplementLinkedList {
    Node head;
    
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        ImplementLinkedList list = new ImplementLinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        
        list.display();
    }
}
```
</details>
<details>
<summary><b>43. Write a program to find the transpose of a matrix.</summary>

```java
public class FindMatrixTranspose {
    public static void transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        transposeMatrix(matrix);
    }
}
```
</details>
<details>
<summary><b>44. Write a program to find the average of an array.</b></summary>

```java
public class FindAverageOfArray {
    public static double findAverage(int[] arr) {
        int sum = 0;
        
        for (int num : arr) {
            sum += num;
        }
        
        return sum / (double) arr.length;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("The average of the array is: " + findAverage(arr));
    }
}
```
</details>
<details>
<summary><b>45. Write a program to find the sum of odd numbers in an array.</b></summary>

```java
public class FindSumOfOddNumbers {
    public static int findSumOfOddNumbers(int[] arr) {
        int sum = 0;
        
        for (int num : arr) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("The sum of odd numbers in the array is: " + findSumOfOddNumbers(arr));
    }
}
```
</details>
<details>
<summary><b>46. Write a program to find the number of occurrences of a word in a string.</b></summary>

```java
public class WordOccurrencesInString {
    public static int countOccurrences(String str, String word) {
        String[] words = str.split("\\s+");
        int count = 0;
        
        for (String w : words) {
            if (w.equalsIgnoreCase(word)) {
                count++;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        String str = "hello world hello";
        String word = "hello";
        System.out.println("Number of occurrences of the word '" + word + "': " + countOccurrences(str, word));
    }
}
```
</details>
<details>
<summary><b>47. Write a program to check if a number is an Armstrong number.</b></summary>

```java
public class ArmstrongNumberCheck {
    public static boolean isArmstrongNumber(int num) {
        int originalNum, remainder, result = 0;
        originalNum = num;
        
        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, String.valueOf(num).length());
            originalNum /= 10;
        }
        
        return result == num;
    }
    
    public static void main(String[] args) {
        int num = 153;
        if (isArmstrongNumber(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
```
</details>
<details>
<summary><b>48. Write a program to implement a selection sort algorithm.</b></summary>

```java
public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        selectionSort(arr);
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
```
</details>
<details>
<summary><b>49. Write a program to find the maximum and minimum element in an array.</b></summary>

```java
public class FindMaxMinInArray {
    public static void findMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        System.out.println("Maximum element in the array: " + max);
        System.out.println("Minimum element in the array: " + min);
    }
    
    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 5, 9, 2};
        findMaxMin(arr);
    }
}
```
</details>
<details>
<summary><b>50. Write a program to implement a merge sort algorithm.</b></summary>

```java
public class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        
        int mid = arr.length / 2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[arr.length - mid];
        
        for (int i = 0; i < mid; i++) {
            leftArr[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            rightArr[i - mid] = arr[i];
        }
        
        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(leftArr, rightArr, arr);
    }
    
    public static void merge(int[] leftArr, int[] rightArr, int[] arr) {
        int i = 0, j = 0, k = 0;
        
        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }
        
        while (i < leftArr.length) {
            arr[k++] = leftArr[i++];
        }
        while (j < rightArr.length) {
            arr[k++] = rightArr[j++];
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        mergeSort(arr);
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
```
</details>
<details>
<summary><b>51. Count the number of prime numbers in a given range:</b></summary>

```java
public class PrimeNumberCount {
    
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static int countPrimes(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        
        System.out.println("Number of prime numbers between " + start + " and " + end + " is: " + countPrimes(start, end));
    }
}
```
</details>
<details>
<summary><b>52. Find the reverse of a linked list:</b></summary>

```java
class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {
    
    public Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
    
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        
        ReverseLinkedList obj = new ReverseLinkedList();
        System.out.println("Original Linked List:");
        obj.printList(head);
        
        head = obj.reverseList(head);
        System.out.println("\nReversed Linked List:");
        obj.printList(head);
    }
}
```
</details>
<details>
<summary><b>53. Convert a decimal number to hexadecimal:</b></summary>

```java
import java.util.Scanner;

public class DecimalToHexadecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        String hexadecimal = Integer.toHexString(decimal);
        
        System.out.println("Hexadecimal equivalent: " + hexadecimal);
    }
}
```
</details>
<details>
<summary><b>54. Find the largest palindrome made from the product of two 3-digit numbers:</b></summary>

```java
public class LargestPalindromeProduct {
    
    public static boolean isPalindrome(int num) {
        int reversedNum = 0, remainder, originalNum;
        
        originalNum = num;
        
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }
        
        return originalNum == reversedNum;
    }
    
    public static void main(String[] args) {
        int palindrome = 0;
        for (int i = 999; i > 100; i--) {
            for (int j = i; j > 100; j--) {
                int product = i * j;
                if (product < palindrome) {
                    break;
                }
                if (isPalindrome(product) && product > palindrome) {
                    palindrome = product;
                }
            }
        }
        
        System.out.println("Largest palindrome made from the product of two 3-digit numbers is: " + palindrome);
    }
}
```
</details>
<details>
<summary><b>55. Implement a quick sort algorithm:</b></summary>

```java
public class QuickSort {
    
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
    }
    
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        
        quickSort(arr, 0, n - 1);
        
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
```
</details>
<details>
<summary><b>56. Find the sum of prime numbers up to a given number:</b></summary>

```java
public class SumOfPrimes {
    
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static int sumOfPrimes(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Sum of prime numbers up to " + n + " is: " + sumOfPrimes(n));
    }
}
```
</details>
<details>
<summary><b>57. Generate a random number between a given range:</b></summary>

```java
import java.util.Random;

public class RandomNumberGenerator {
    
    public static void main(String[] args) {
        Random rand = new Random();
        int lowerbound = 10;
        int upperbound = 99;
        
        int randomNum = rand.nextInt(upperbound - lowerbound) + lowerbound;
        
        System.out.println("Random number between " + lowerbound + " and " + upperbound + " is: " + randomNum);
    }
}
```
</details>
<details>
<summary><b>58. Implement a binary tree:</b></summary>

```java
class Node {
    int data;
    Node left, right;
    
    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;
    
    public void insert(int key) {
        root = insertRec(root, key);
    }
    
    public Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        
        if (key < root.data) {
            root.left = insertRec(root.left, key);
        } else if (key > root.data) {
            root.right = insertRec(root.right, key);
        }
        
        return root;
    }
    
    public void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }
    
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        
        tree.inorderTraversal(tree.root);
    }
}
```
</details>
<details>
<summary><b>59. Find the longest common prefix in an array of strings:</b></summary>

```java
public class LongestCommonPrefix {
    
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        String prefix = strs[0];
        
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        
        return prefix;
    }
    
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(strs));
    }
}
```
</details>
<details>
<summary><b>60. Find the number of trailing zeroes in a factorial:</b></summary>

```java
import java.util.Scanner;

public class FactorialTrailingZeroes {
    
    public static int trailingZeroes(int n) {
        int count = 0;
        
        while (n > 0) {
            n = n/5;
            count += n;
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        System.out.println("Number of trailing zeroes in factorial of " + num + " is: " + trailingZeroes(num));
    }
}
```
</details>
<details>
<summary><b>61. Heap sort algorithm implementation:</b></summary>

```java
public class HeapSort {
    public void sort(int arr[]) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7};

        HeapSort hs = new HeapSort();
        hs.sort(arr);

        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
```
</details>
<details>
<summary><b>62. Longest palindrome substring in a string:</b></summary>

```java
public class LongestPalindromeSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    public int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }

    public static void main(String args[]) {
        LongestPalindromeSubstring lps = new LongestPalindromeSubstring();
        String s = "babad";
        System.out.println("Longest palindrome substring: " + lps.longestPalindrome(s));
    }
}
```
</details>
<details>
<summary><b>63. Sum of all even numbers in an array:</b></summary>

```java
public class SumOfEvenNumbers {
    public int sumOfEven(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        SumOfEvenNumbers s = new SumOfEvenNumbers();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Sum of even numbers: " + s.sumOfEven(arr));
    }
}
```
</details>
<details>
<summary><b>64. Depth-First Search Algorithm:</b></summary>

```java
import java.util.*;

public class DFS {
    private boolean[] visited;
    private List<List<Integer>> graph;

    public DFS(int vertices) {
        visited = new boolean[vertices];
        graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        graph.get(u).add(v);
    }

    public void dfs(int vertex) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int neighbor : graph.get(vertex)) {
            if (!visited[neighbor]) {
                dfs(neighbor);
            }
        }
    }

    public static void main(String[] args) {
        DFS dfs = new DFS(4);
        dfs.addEdge(0, 1);
        dfs.addEdge(0, 2);
        dfs.addEdge(1, 2);
        dfs.addEdge(2, 0);
        dfs.addEdge(2, 3);
        dfs.addEdge(3, 3);

        System.out.println("Depth First Search starting from vertex 2:");
        dfs.dfs(2);
    }
}
```
</details>
<details>
<summary><b>65. Find Kth Largest Element in an Array:</b></summary>

```java
import java.util.Arrays;

public class KthLargestElement {

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        KthLargestElement kthLargestElement = new KthLargestElement();
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println(k + "th largest element: " + kthLargestElement.findKthLargest(arr, k));
    }
}
```
</details>
<details>
<summary><b>66. Number of Ways to Climb Stairs:</b></summary>

```java
public class Staircase {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        
        return dp[n];
    }

    public static void main(String[] args) {
        Staircase staircase = new Staircase();
        int n = 4;
        System.out.println("Number of ways to climb " + n + " stairs: " + staircase.climbStairs(n));
    }
}
```
</details>
<details>
<summary><b>67. Breadth-First Search Algorithm:</b></summary>

```java
import java.util.*;

public class BFS {
    private boolean[] visited;
    private List<List<Integer>> graph;
    
    public BFS(int vertices) {
        visited = new boolean[vertices];
        graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
    }
    
    public void addEdge(int u, int v) {
        graph.get(u).add(v);
    }
    
    public void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");
            
            for (int neighbor : graph.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        BFS bfs = new BFS(4);
        bfs.addEdge(0, 1);
        bfs.addEdge(0, 2);
        bfs.addEdge(1, 2);
        bfs.addEdge(2, 0);
        bfs.addEdge(2, 3);
        bfs.addEdge(3, 3);

        System.out.println("Breadth First Search starting from vertex 2:");
        bfs.bfs(2);
    }
}
```
</details>
<details>
<summary><b>68. Find Missing Element in Arithmetic Progression:</b></summary>

```java
public class MissingElement {
    public int findMissing(int[] arr) {
        int n = arr.length;
        int d = (arr[n-1] - arr[0]) / n;
        int missing = searchMissing(arr, d, 0, n - 1);
        return missing;
    }

    public int searchMissing(int[] arr, int d, int low, int high) {
        if (low >= high) return -1;

        int mid = low + (high - low) / 2;
        if (arr[mid+1] - arr[mid] != d) {
            return arr[mid] + d;
        }

        int left = searchMissing(arr, d, low, mid);
        int right = searchMissing(arr, d, mid + 1, high);

        return Math.max(left, right);
    }

    public static void main(String[] args) {
        MissingElement missingElement = new MissingElement();
        int[] arr = {2, 4, 6, 10, 12};
        System.out.println("Missing element in arithmetic progression: " + missingElement.findMissing(arr));
    }
}
```
</details>
<details>
<summary><b>69. Dijkstra's Algorithm:</b></summary>

```java
import java.util.*;

public class Dijkstra {
    
    private static final int V = 9;

    public void dijkstra(int[][] graph, int src) {
        int[] dist = new int[V];
        boolean[] visited = new boolean[V];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        for (int count = 0; count < V - 1; count++) {
            int u = minDistance(dist, visited);
            visited[u] = true;

            for (int v = 0; v < V; v++) {
                if (!visited[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }
        
        printSolution(dist);
    }

    public int minDistance(int[] dist, boolean[] visited) {
        int min = Integer.MAX_VALUE, minIndex = -1;

        for (int v = 0; v < V; v++) {
            if (!visited[v] && dist[v] <= min) {
                min = dist[v];
                minIndex = v;
            }
        }

        return minIndex;
    }

    public void printSolution(int[] dist) {
        System.out.println("Vertex \t Distance from Source");
        for (int i = 0; i < V; i++) {
            System.out.println(i + " \t\t " + dist[i]);
        }
    }

    public static void main(String[] args) {
        int[][] graph = {{0, 4, 0, 0, 0, 0, 0, 8, 0},
                        {4, 0, 8, 0, 0, 0, 0, 11, 0},
                        {0, 8, 0, 7, 0, 4, 0, 0, 2},
                        {0, 0, 7, 0, 9, 14, 0, 0, 0},
                        {0, 0, 0, 9, 0, 10, 0, 0, 0},
                        {0, 0, 4, 14, 10, 0, 2, 0, 0},
                        {0, 0, 0, 0, 0, 2, 0, 1, 6},
                        {8, 11, 0, 0, 0, 0, 1, 0, 7},
                        {0, 0, 2, 0, 0, 0, 6, 7, 0}};

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.dijkstra(graph, 0);
    }
}
```
</details>
<details>
<summary><b>70. Maximum Path Sum in Binary Tree:</b></summary>

```java
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class MaxPathSum {

    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        if (root == null) return 0;
        
        maxPath(root);
        return maxSum;
    }

    public int maxPath(TreeNode node) {
        if (node == null) return 0;
        
        int left = Math.max(maxPath(node.left), 0);
        int right = Math.max(maxPath(node.right), 0);
        
        maxSum = Math.max(maxSum, node.val + left + right);
        
        return node.val + Math.max(left, right);
    }

    public static void main(String[] args) {
        MaxPathSum maxPathSum = new MaxPathSum();
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(2);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(-25);
        root.right.right.left = new TreeNode(3);
        root.right.right.right = new TreeNode(4);

        System.out.println("Maximum path sum in binary tree: " + maxPathSum.maxPathSum(root));
    }
}
```
</details>

