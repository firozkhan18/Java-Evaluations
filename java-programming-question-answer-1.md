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

