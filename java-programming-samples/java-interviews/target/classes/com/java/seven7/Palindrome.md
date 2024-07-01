Palindrome Program In Java

Palindrome program in java is one of the popular java interview question for freshers. There are many methods to check whether given string or number is a palindrome or not. In this post, we will discuss some of those. Before moving to palindrome program in java, let’s see the definition of palindrome.

What is palindrome?
Palindrome is a word or a number or a sequence of characters which remains same even after reversing. That means palindrome is a word or a number or a sequence of characters which read same forward and backward. For example,

Palindrome Words :

Level, Radar, Madam, Civic, Refer

Palindrome Numbers :


12321, 171, 45854, 8427248, 1441

Palindrome Phrases :

Never odd or even

Was it a car or a cat I saw?

Palindrome Program In Java : Iterative Method
In this method, we simultaneously iterate the given string from both the ends and check the characters for equality. If the characters are same, returns true. If the characters are not same, returns false.

import java.util.Scanner;
 
public class PalindromeProgram
{
    private static boolean isItPalindrome(String inputString)
    {
        //Clean inpuString by removing spaces and negating the case of the letters         
        String cleanInputString = inputString.replaceAll("\\s+", "").toLowerCase();         
        //Convert cleanInputString to char array         
        char[] charArray = cleanInputString.toCharArray();         
        //Let forward index point at first character         
        int forward = 0;         
        //And backward index point at last character         
        int backward = charArray.length - 1;         
        //start iterating charArray from both ends simultaneously         
        while (forward <= backward)
        {
            if(charArray[forward] != charArray[backward])
            {
                //If chars at both ends are not same, return false                 
                return false;
            }             
            //If chars at both ends are same, increment forward and decrement backward             
            forward++;             
            backward--;
        }         
        return true;
    }     
    public static void main(String[] args)
    {
        //Take the input string from the user         
        System.out.println("Enter the input String...");         
        Scanner sc = new Scanner(System.in);         
        String inputString = sc.nextLine();         
        if (isItPalindrome(inputString)) 
        {
            System.out.println(inputString+" is a palindrome");
        }
        else
        {
            System.out.println(inputString+" is not a palindrome");
        }         
        sc.close();
    }
}
Output 1 :

Enter the input String…
Rotator
Rotator is a palindrome

Output 2 :

Enter the input String…
Rotation
Rotation is not a palindrome

Palindrome program in java


Palindrome Program In Java : Recursive Method
This is the recursive method to check whether given string is palindrome or not. In the following program, we have defined isItPalindrome() method. What it does is, first checks the length of inputSring. If the length of inputSring is zero or one, returns true. If the length of inputSring is more than one then checks both ends of inputString for equality. If both ends are not equal, returns false. If both ends are equal, calls itself again with chars at both ends removed.

import java.util.Scanner;
 
public class RecursivePalindromeProgram 
{
    private static boolean isItPalindrome(String inputString)
    {
        //If inputString has only one or zero char, return true         
        if(inputString.length() < 2)
        {
            return true;
        }
        else
        {
            //Check both ends of inputString for equality             
            if(inputString.charAt(0) != inputString.charAt(inputString.length()-1))
            {
                //if both ends are not equal, return false                 
                return false;
            }
            else
            {
                //if both ends are same, call isItPalindrome() with chars at both ends removed                 
                return isItPalindrome(inputString.substring(1, inputString.length()-1));
            }
        }
    }     
    public static void main(String[] args) 
    {
        //Take input string from the user         
        Scanner sc = new Scanner(System.in);         
        System.out.println("Enter Input String :");         
        String inputString = sc.nextLine();         
        //Clean inputString by removing spaces and negating the case of the letters         
        String cleanInputString = inputString.replaceAll("\\s+", "").toLowerCase();         
        if(isItPalindrome(cleanInputString))
        {
            System.out.println(inputString+" is a palindrome");
        }
        else
        {
            System.out.println(inputString+" is not a palindrome");
        }         
        sc.close();
    }
}
Output 1 :

Enter Input String :
c++=++c
c++=++c is a palindrome

Output 2 :

Enter Input String :
++c=++c
++c=++c is not a palindrome

Palindrome Program In Java : Using StringBuffer
In this method, we use reverse() method of StringBuffer class to check whether given string is palindrome or not. The given inputString is reversed using reverse() method of StringBuffer class. If original string and reversed string are same, then given string is a palindrome.

Note : Instead of StringBuffer class, you can also use StringBuilder class.

import java.util.Scanner;
 
public class PalindromeProgramUsingStringBuffer
{   
    public static void main(String[] args) 
    {
        //Take input string from user         
        Scanner sc = new Scanner(System.in);         
        System.out.println("Enter input String :");         
        String inputString = sc.nextLine().replaceAll("\\s+", "");         
        //Reverse inputString using reverse() method of StringBuffer         
        String reverseString = new StringBuffer(inputString).reverse().toString();         
        //Check inputString and reverseString for equality         
        if (inputString.equalsIgnoreCase(reverseString))
        {
            System.out.println(inputString+" is a palindrome");
        }
        else
        {
            System.out.println(inputString+" is not a palindrome");
        }         
        sc.close();
    }
}
Output 1 :

Enter input String :
Level
Level is a palindrome

Output 2 :

Enter input String :
NotLevel
NotLevel is not a palindrome

Palindrome Program In Java : Using IntStream Of Java 8
In this method, we have used IntStream of Java 8 to check whether given string is a palindrome or not.

import java.util.Scanner;
import java.util.stream.IntStream;
 
public class PalindromeProgramInJava8 
{
    public static void main(String[] args) 
    {
        //Take input string from the user         
        Scanner sc = new Scanner(System.in);         
        System.out.println("Enter input string :");         
        String inputString = sc.nextLine().replaceAll("\\s+", "").toLowerCase();         
        //Java 8 code to check for palindrome         
        boolean isItPalindrome = IntStream.range(0, inputString.length()/2).
                noneMatch(i -> inputString.charAt(i) != inputString.charAt(inputString.length() - i -1));         
        if (isItPalindrome)
        {
            System.out.println(inputString+" is a palindrome");
        }
        else
        {
            System.out.println(inputString+" is not a palindrome");
        }         
        sc.close();
    }
}
Output 1 :

Enter input string :
Civic
civic is a palindrome

Output 2 :

Enter input string :
Civil
civil is not a palindrome

Palindrome Program In Java : Only For Numbers
This program checks whether given number is palindrome or not. This program works only for numbers.

import java.util.Scanner;
 
public class PalindromeProgramInJava 
{
    private static boolean isItPalindrome(int inputNumber) 
    {
        //Copy inputNumber into number         
        int number = inputNumber;         
        int reverse = 0;         
        int remainder = 0;         
        //Reverse the number         
        while (number != 0)
        {
            remainder = number % 10;             
            reverse = (reverse * 10) + remainder;             
            number = number / 10;
        }         
        //Check reverse and inputNumber for equality         
        if(reverse == inputNumber)
        {
            return true;
        }
        else
        {
            return false;
        }
    }     
    public static void main(String[] args) 
    {
        //Take input number from the user         
        Scanner sc = new Scanner(System.in);         
        System.out.println("Enter a number");         
        int inputNumber = sc.nextInt();         
        if (isItPalindrome(inputNumber)) 
        {
            System.out.println(inputNumber+" is a palindrome");
        }
        else
        {
            System.out.println(inputNumber+" is not a palindrome");
        }         
        sc.close();
    }
}
Output 1 :

Enter a number
45654
45654 is a palindrome

Output 2 :

Enter a number
12485
12485 is not a palindrome