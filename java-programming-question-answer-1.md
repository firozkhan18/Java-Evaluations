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
<summary><b>33. Find the smallest element in an array</b></summary>

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
<summary><b>34. Check if a given string is a valid palindrome or not</b></summary>

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
<summary><b>35. Find the product of two matrices</b></summary>

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
<summary><b>36. Reverse a linked list</b></summary>

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
<summary><b>37. Find the missing number in an array of consecutive numbers</b></summary>

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
<summary><b>38. Check if a number is a perfect number</b></summary>

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
<summary><b>39. Find the median of an array</b></summary>

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
