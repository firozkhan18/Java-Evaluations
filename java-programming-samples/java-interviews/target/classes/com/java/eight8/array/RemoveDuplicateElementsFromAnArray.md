How To Remove Duplicate Elements From An Array In Java?

Problem :
Write a java program to remove duplicate elements from the given array. 
Your program or method should take an array of integers as input and should return another array which should contain only unique elements from the input array. For example, if {4, 3, 2, 4, 9, 2} is the input array then your program or method should return {4, 3, 2, 9} as output.

How To Remove Duplicate Elements From An Array In Java?
There are two methods through which you can remove duplicates from an array. 
One method is using the Collection API (HashSet or LinkedHashSet) and another one is without using Collection API. 
First method is easy and gives better performance than the second method. 
It is recommended to use first method if you need to remove duplicates from an array in your project or your array contains lots of elements. 
But, in the interview they will ask you to remove duplicates from an array without using any Collection classes. 
That time you must be able to write your own code. That’s why, in this post we will discuss both the methods.

How To Remove Duplicate Elements From An Array In Java Without Using Collection API?

import java.util.Arrays;
 
public class RemoveDuplicatesJavaExample 
{   
    static void removeDuplicates(int[] arrayWithDuplicates)
    {
        System.out.println("Array With Duplicates : ");         
        for (int i = 0; i < arrayWithDuplicates.length; i++)
        {
            System.out.print(arrayWithDuplicates[i]+"\t");
        }         
        //Assuming all elements in input array are unique         
        int noOfUniqueElements = arrayWithDuplicates.length;         
        //Comparing each element with all other elements         
        for (int i = 0; i < noOfUniqueElements; i++) 
        {
            for (int j = i+1; j < noOfUniqueElements; j++)
            {
                //If any two elements are found equal                 
                if(arrayWithDuplicates[i] == arrayWithDuplicates[j])
                {
                    //Replace duplicate element with last unique element                     
                    arrayWithDuplicates[j] = arrayWithDuplicates[noOfUniqueElements-1];                     
                    //Decrementing noOfUniqueElements                     
                    noOfUniqueElements--;                     
                    //Decrementing j                     
                    j--;
                }
            }
        }         
        //Copying only unique elements of arrayWithDuplicates into arrayWithoutDuplicates         
        int[] arrayWithoutDuplicates = Arrays.copyOf(arrayWithDuplicates, noOfUniqueElements);         
        //Printing arrayWithoutDuplicates         
        System.out.println();         
        System.out.println("Array Without Duplicates : ");         
        for (int i = 0; i < arrayWithoutDuplicates.length; i++)
        {
            System.out.print(arrayWithoutDuplicates[i]+"\t");
        }         
        System.out.println();         
        System.out.println("==============================");
    }     
    public static void main(String[] args) 
    {       
        removeDuplicates(new int[] {4, 3, 2, 4, 9, 2});         
        removeDuplicates(new int[] {1, 2, 1, 2, 1, 2});         
        removeDuplicates(new int[] {15, 21, 11, 21, 51, 21, 11});         
        removeDuplicates(new int[] {7, 3, 21, 7, 34, 18, 3, 21});
    }   
}
Output :

Array With Duplicates :
4 3 2 4 9 2
Array Without Duplicates :
4 3 2 9
==============================
Array With Duplicates :
1 2 1 2 1 2
Array Without Duplicates :
1 2
==============================
Array With Duplicates :
15 21 11 21 51 21 11
Array Without Duplicates :
15 21 11 51
==============================
Array With Duplicates :
7 3 21 7 34 18 3 21
Array Without Duplicates :
7 3 21 18 34
==============================

[quads id=5]


How It Works?
Let arrayWithDuplicates = {7, 3, 21, 7, 34, 18, 3, 21}

then noOfUniqueElements = arrayWithDuplicates.length = 8

1st Iteration : for i = 0

for j = i+1 = 0+1 = 1

As arrayWithDuplicates[i] != arrayWithDuplicates[j]

–> arrayWithDuplicates[0] != arrayWithDuplicates[1]

–> 7 != 3

j++  –>  j = 2

for j = 2

As arrayWithDuplicates[i] != arrayWithDuplicates[j]


–> arrayWithDuplicates[0] != arrayWithDuplicates[2]

–> 7 != 21

j++  –>  j = 3

for j = 3

As arrayWithDuplicates[i] == arrayWithDuplicates[j]

–> arrayWithDuplicates[0] == arrayWithDuplicates[3]

–> 7 == 7

(Enter if block)

arrayWithDuplicates[j] = arrayWithDuplicates[noOfUniqueElements-1]

–> arrayWithDuplicates[3] = arrayWithDuplicates[8-1]

–> arrayWithDuplicates[3] = arrayWithDuplicates[7]

i.e arrayWithDuplicates[3] (7) is replaced by arrayWithDuplicates[7] (21)

noOfUniqueElements—  –>  noOfUniqueElements = 7

j–  –>  j = 2

Now arrayWithDuplicates = {7, 3, 21, 21, 34, 18, 3, 21}

j++  –>  j = 3

for j = 3

As arrayWithDuplicates[i] != arrayWithDuplicates[j]

–> arrayWithDuplicates[0] != arrayWithDuplicates[3]

–> 7 != 21

j++  –>  j = 4

for j = 4

As arrayWithDuplicates[i] != arrayWithDuplicates[j]

–> arrayWithDuplicates[0] != arrayWithDuplicates[4]

–> 7 != 34

j++  –>  j = 5

for j = 5

As arrayWithDuplicates[i] != arrayWithDuplicates[j]

–> arrayWithDuplicates[0] != arrayWithDuplicates[5]

–> 7 != 18

j++  –>  j = 6

for j = 6

As arrayWithDuplicates[i] != arrayWithDuplicates[j]

–> arrayWithDuplicates[0] != arrayWithDuplicates[6]

–> 7 != 3

j++  –>  j = 7

As j == noOfUniqueElements

Break inner for loop

2nd Iteration : for i = 1

for j = i+1 = 1+1 = 2

As arrayWithDuplicates[i] != arrayWithDuplicates[j]

–> arrayWithDuplicates[1] != arrayWithDuplicates[2]

–> 3 != 21

j++  –>  j = 3

for j = 3

As arrayWithDuplicates[i] != arrayWithDuplicates[j]

–> arrayWithDuplicates[1] != arrayWithDuplicates[3]

–> 3 != 21

j++  –>  j = 4

for j = 4

As arrayWithDuplicates[i] != arrayWithDuplicates[j]

–> arrayWithDuplicates[1] != arrayWithDuplicates[4]

–> 3 != 34

j++  –>  j = 5

for j = 5

As arrayWithDuplicates[i] != arrayWithDuplicates[j]

–> arrayWithDuplicates[1] != arrayWithDuplicates[5]

–> 3 != 18

j++  –>  j = 6

for j = 6

As arrayWithDuplicates[i] == arrayWithDuplicates[j]

–> arrayWithDuplicates[1] == arrayWithDuplicates[6]

–> 3 == 3

(Enter if block)

arrayWithDuplicates[j] = arrayWithDuplicates[noOfUniqueElements-1]

–> arrayWithDuplicates[6] = arrayWithDuplicates[7-1]

–> arrayWithDuplicates[6] = arrayWithDuplicates[6]

i.e arrayWithDuplicates will be unchanged but noOfUniqueElements will be decremented by 1.

noOfUniqueElements—  –>  noOfUniqueElements = 6

j–  –>  j = 5

Now arrayWithDuplicates = {7, 3, 21, 21, 34, 18, 3, 21}

j++  –>  j = 6

As j == noOfUniqueElements

Break inner for loop

3rd Iteration : for i = 2

for j = i+1 = 2+1 = 3

As arrayWithDuplicates[i] == arrayWithDuplicates[j]

–> arrayWithDuplicates[2] == arrayWithDuplicates[3]

–> 21 == 21

(Enter if block)

arrayWithDuplicates[j] = arrayWithDuplicates[noOfUniqueElements-1]

–> arrayWithDuplicates[3] = arrayWithDuplicates[6-1]

–> arrayWithDuplicates[3] = arrayWithDuplicates[5]

i.e arrayWithDuplicates[3] (21) is replaced by arrayWithDuplicates[5] (18)

noOfUniqueElements—  –>  noOfUniqueElements = 5

j–  –>  j = 2

Now arrayWithDuplicates = {7, 3, 21, 18, 34, 18, 3, 21}

j++  –>  j = 3

for j = 3

As arrayWithDuplicates[i] != arrayWithDuplicates[j]

–> arrayWithDuplicates[2] != arrayWithDuplicates[3]

–> 21 != 18

j++  –>  j = 4

for j = 4

As arrayWithDuplicates[i] != arrayWithDuplicates[j]

–> arrayWithDuplicates[2] != arrayWithDuplicates[4]

–> 21 != 34

j++  –>  j = 5

As j == noOfUniqueElements

Break inner for loop

4th Iteration : for i = 3

for j = i+1 = 3+1 = 4

As arrayWithDuplicates[i] != arrayWithDuplicates[j]

–> arrayWithDuplicates[3] != arrayWithDuplicates[4]

–> 18 != 34

j++  –>  j = 5

As j == noOfUniqueElements

Break inner for loop

5th Iteration : for i = 4

for j = i+1 = 4+1 = 5

As j == noOfUniqueElements

Break inner for loop

6th Iteration : for i = 5

As i == noOfUniqueElements

Break outer for loop

After all iterations, arrayWithDuplicates = {7, 3, 21, 18, 34, 18, 3, 21}

Now, copy only unique elements of arrayWithDuplicates into arrayWithoutDuplicates i.e from index 0 to 4.

arrayWithoutDuplicates = Arrays.copyOf(arrayWithDuplicates, noOfUniqueElements) = Arrays.copyOf(arrayWithDuplicates, 5)

This copies first 5 elements of arrayWithDuplicates into arrayWithoutDuplicates.

So, arrayWithoutDuplicates = {7, 3, 21, 18, 34}

remove duplicate elements

How To Remove Duplicate Elements From An Array In Java Using Collection API?

In this method, we use HashSet (If you don’t want insertion order of elements) or LinkedHashSet (If you want insertion order of elements). 
As you know, HashSet and LinkedHashset maintain only unique elements. 
We put all elements of the input array into HashSet or LinkedHashSet resulting a Set which contains only unique elements.

import java.util.LinkedHashSet;
import java.util.Set;
 
public class RemoveDuplicatesJavaExample 
{   
    static void removeDuplicates(int[] arrayWithDuplicates)
    {
        System.out.println("Array With Duplicates : ");         
        for (int i = 0; i < arrayWithDuplicates.length; i++)
        {
            System.out.print(arrayWithDuplicates[i]+"\t");
        }         
        Set<Integer> set = new LinkedHashSet<Integer>();      //Use HashSet if you don't want insertion order         
        for (int i = 0; i < arrayWithDuplicates.length; i++) 
        {
            set.add(arrayWithDuplicates[i]);
        }         
        //Converting set into an array         
        Object[] arrayWithoutDuplicates = set.toArray(); 
        //Printing arrayWithoutDuplicates                 
        System.out.println();                 
        System.out.println("Array Without Duplicates : ");                 
        for (int i = 0; i < arrayWithoutDuplicates.length; i++)
        {
            System.out.print(arrayWithoutDuplicates[i]+"\t");
        }                 
        System.out.println();                 
        System.out.println("==============================");
    }     
    public static void main(String[] args) 
    {       
        removeDuplicates(new int[] {4, 3, 2, 4, 9, 2});         
        removeDuplicates(new int[] {1, 2, 1, 2, 1, 2});         
        removeDuplicates(new int[] {15, 21, 11, 21, 51, 21, 11});         
        removeDuplicates(new int[] {7, 3, 21, 7, 34, 18, 3, 21});
    }   
}