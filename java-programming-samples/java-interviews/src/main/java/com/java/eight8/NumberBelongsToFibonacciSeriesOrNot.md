What Is Fibonacci Series?
Fibonacci series is the series of numbers where each number is obtained by adding two previous numbers. The first two numbers in the Fibonacci series are either 1 and 1 or 0 and 1.


Fibonacci Series : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89……..

Problem :
Write a java program to check whether given number belongs to Fibonacci series or not. For example, 34 belongs to Fibonacci series where as 51 doesn’t belongs to Fibonacci series.

How To Check If Number Belongs To Fibonacci Series Or Not?
Step 1 : Declare one variable called inputNumber and store the user entered number in it.

Step 2 : initialize firstTerm = 0, secondTerm = 1 and thirdTerm = 0 where firstTerm and secondTerm are the first two numbers of the series.


Step 3 : Run the while loop which generates Fibonacci numbers until they are less than inputNumber.

Step 4 : If the last generated number is equal to inputNumber then given number belongs to Fibonacci series. Otherwise number doesn’t belongs to Fibonacci series.

Java Program To Check If Number Belongs To Fibonacci Series Or Not?

import java.util.Scanner;
 
public class FibonacciSeries 
{    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);         
        System.out.println("Enter positive number :");         
        int inputNumber = sc.nextInt();         
        int firstTerm = 0;         
        int secondTerm = 1;         
        int thirdTerm = 0;         
        while (thirdTerm < inputNumber)
        {
            thirdTerm = firstTerm + secondTerm;             
            firstTerm = secondTerm;             
            secondTerm = thirdTerm;
        }         
        if(thirdTerm == inputNumber)
        {
            System.out.println("Number belongs to Fibonacci series");
        }
        else
        {
            System.out.println("Number doesn't belongs to Fibonacci series");
        }
    }   
}
Output :

1)

Enter positive number :
4123
Number doesn’t belongs to Fibonacci series

2)

Enter positive number :
17711
Number belongs to Fibonacci series

How It Works?
Let inputNumber = 34.

Initialization : firstTerm = 0, secondTerm = 1, thirdTerm = 0.

(Inside the while loop)


1st Iteration :

As thirdTerm < inputNumber (0 < 34)

thirdTerm = firstTerm + secondTerm  –>  thirdTerm = 0 + 1 = 1

firstTerm = secondTerm  –>  firstTerm = 1

secondTerm = thirdTerm  –>  secondTerm = 1

2nd Iteration :

As thirdTerm < inputNumber (1 < 34)

thirdTerm = firstTerm + secondTerm  –>  thirdTerm = 1 + 1 = 2

firstTerm = secondTerm  –>  firstTerm = 1

secondTerm = thirdTerm  –>  secondTerm = 2

3rd Iteration :

As thirdTerm < inputNumber (2 < 34)

thirdTerm = firstTerm + secondTerm  –>  thirdTerm = 1 + 2 = 3

firstTerm = secondTerm  –>  firstTerm = 2

secondTerm = thirdTerm  –>  secondTerm = 3

4th Iteration :

As thirdTerm < inputNumber (3 < 34)

thirdTerm = firstTerm + secondTerm  –>  thirdTerm = 2 + 3 = 5

firstTerm = secondTerm  –>  firstTerm = 3

secondTerm = thirdTerm  –>  secondTerm = 5

5th Iteration :

As thirdTerm < inputNumber (5 < 34)

thirdTerm = firstTerm + secondTerm  –>  thirdTerm = 3 + 5 = 8

firstTerm = secondTerm  –>  firstTerm = 5

secondTerm = thirdTerm  –>  secondTerm = 8

6th Iteration :

As thirdTerm < inputNumber (8 < 34)

thirdTerm = firstTerm + secondTerm  –>  thirdTerm = 5 + 8 = 13

firstTerm = secondTerm  –>  firstTerm = 8

secondTerm = thirdTerm  –>  secondTerm = 13

7th Iteration :

As thirdTerm < inputNumber (13 < 34)

thirdTerm = firstTerm + secondTerm  –>  thirdTerm = 8 + 13 = 21

firstTerm = secondTerm  –>  firstTerm = 13

secondTerm = thirdTerm  –>  secondTerm = 21

8th Iteration :

As thirdTerm < inputNumber (21 < 34)

thirdTerm = firstTerm + secondTerm  –>  thirdTerm = 13 + 21 = 34

firstTerm = secondTerm  –>  firstTerm = 21

secondTerm = thirdTerm  –>  secondTerm = 34

9th Iteration :

As thirdTerm == inputNumber (34 = 34)

Exit while loop

As thirdTerm == inputNumber

Print “Number belongs to Fibonacci series”