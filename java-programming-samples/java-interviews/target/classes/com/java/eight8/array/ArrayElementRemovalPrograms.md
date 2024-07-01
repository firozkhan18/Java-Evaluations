Array Element Removal Programs In Java

Many a times, you may have come across the requirement of removing one or more elements from an array. Arrays in java don’t have in-built methods. 
java.util.Arrays class provides some utility methods which can be used to perform some operations like sort, search, copy etc on arrays in java. 
But, there are no methods to remove elements from an array in java.util.Arrays class. 
There are some third party libraries which can be used to remove elements from arrays in java. 
In this post, I have demonstrated how to remove one or more elements from an existing array using third party library org.apache.commons.lang3.ArrayUtils class. 
Let’s see some array element removal programs in java using org.apache.commons.lang3.ArrayUtils class.


As you know, arrays in java are of fixed in size. You can’t add or remove elements dynamically. 
If you want to add an element or remove an element, you have to create new array with the updated elements. 
The same principle applies to org.apache.commons.lang3.ArrayUtils class also. 
Each time you remove element or elements from an existing array using org.apache.commons.lang3.ArrayUtils class, a new array will be returned with the updated elements.

Array Element Removal Programs In Java :
In this post, we will see following array element removal programs in java using org.apache.commons.lang3.ArrayUtils class.

How to remove an element at specific index from an array?
How to remove specific element from an array?
How to remove multiple elements at different indices from an array?
How to remove multiple specific elements from an array?
How to remove all occurrences of an element in an array?
Let’s see them one by one.

How To Remove An Element At Specific Index From An Array?

ArrayUtils.remove(T[] inputArray, int index) is used to remove an element at specific index from an array. The following program demonstrates the same.

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;
 
public class ArrayElementRemovalProgram 
{
    public static void main(String[] args)
    {
        //Define an array with elements         
        String[] arrayBeforeRemoval = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six"};         
        System.out.println("Array Before Removal");         
        System.out.println("=========================");         
        System.out.println(Arrays.toString(arrayBeforeRemoval));         
        System.out.println("========================");         
        //Removing an element at index 2         
        String[] arrayAfterRemoval = ArrayUtils.remove(arrayBeforeRemoval, 2);         
        System.out.println("Array After Removal");         
        System.out.println("========================");         
        System.out.println(Arrays.toString(arrayAfterRemoval));
    }
}
Output :

Array Before Removal
=========================
[Zero, One, Two, Three, Four, Five, Six]
========================
Array After Removal
========================
[Zero, One, Three, Four, Five, Six]

How To Remove Specific Element From An Array?
ArrayUtils.removeElement(T[] inputArray, T element) method removes a specific element from an array. The following program removes an element “Two” from arrayBeforeRemoval.

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;
 
public class ArrayElementRemovalProgram 
{
    public static void main(String[] args)
    {
        //Define an array with elements         
        String[] arrayBeforeRemoval = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six"};         
        System.out.println("Array Before Removal");         
        System.out.println("========================");         
        System.out.println(Arrays.toString(arrayBeforeRemoval));         
        System.out.println("========================");         
        //Removing an element "Two" from arrayBeforeRemoval         
        String[] arrayAfterRemoval = ArrayUtils.removeElement(arrayBeforeRemoval, "Two");         
        System.out.println("Array After Removal");         
        System.out.println("========================");         
        System.out.println(Arrays.toString(arrayAfterRemoval));
    }
}
Output :

Array Before Removal
========================
[Zero, One, Two, Three, Four, Five, Six]
========================
Array After Removal
========================
[Zero, One, Three, Four, Five, Six]

How To Remove Multiple Elements At Different Indices From An Array?
ArrayUtils.removeAll(T[] inputArray, int … indices) method removes multiple elements at different indices from an array. The below program removes elements at index 1, 3 and 5 from arrayBeforeRemoval.

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;
 
public class ArrayElementRemovalProgram 
{
    public static void main(String[] args)
    {
        //Define an array with elements         
        String[] arrayBeforeRemoval = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six"};         
        System.out.println("Array Before Removal");         
        System.out.println("========================");         
        System.out.println(Arrays.toString(arrayBeforeRemoval));         
        System.out.println("========================");         
        //Removing elements at index 1, 3, 5         
        String[] arrayAfterRemoval = ArrayUtils.removeAll(arrayBeforeRemoval, 1, 3, 5);         
        System.out.println("Array After Removal");         
        System.out.println("========================");         
        System.out.println(Arrays.toString(arrayAfterRemoval));
    }
}
Output :

Array Before Removal
========================
[Zero, One, Two, Three, Four, Five, Six]
========================
Array After Removal
========================
[Zero, Two, Four, Six]

How To Remove Multiple Specific Elements From An Array?
ArrayUtils.removeElements(T[] inputArray, T … elements) method is used to remove multiple given elements from an array. The following program demonstrates the same.

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;
 
public class ArrayElementRemovalProgram 
{
    public static void main(String[] args)
    {
        //Define an array with elements         
        String[] arrayBeforeRemoval = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six"};         
        System.out.println("Array Before Removal");         
        System.out.println("========================");         
        System.out.println(Arrays.toString(arrayBeforeRemoval));         
        System.out.println("========================");         
        //Removing the elements "Two", "Four" and "Six"         
        String[] arrayAfterRemoval = ArrayUtils.removeElements(arrayBeforeRemoval, "Two", "Four", "Six");         
        System.out.println("Array After Removal");         
        System.out.println("========================");         
        System.out.println(Arrays.toString(arrayAfterRemoval));
    }
}
Output :


Array Before Removal
========================
[Zero, One, Two, Three, Four, Five, Six]
========================
Array After Removal
========================
[Zero, One, Three, Five]

How To Remove All Occurrences Of An Element From An Array?
ArrayUtils.removeAllOccurences(T[] inputArray, T element) method removes all occurrences of a given element from an array.

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;
 
public class ArrayElementRemovalProgram 
{
    public static void main(String[] args)
    {
        //Define an array with elements         
        String[] arrayBeforeRemoval = new String[] {"Zero", "One", "Two", "Three", "Two", "Five", "Six"};         
        System.out.println("Array Before Removal");         
        System.out.println("========================");         
        System.out.println(Arrays.toString(arrayBeforeRemoval));         
        System.out.println("========================");         
        //Removing all occurrences of an element "Two"         
        String[] arrayAfterRemoval = ArrayUtils.removeAllOccurences(arrayBeforeRemoval, "Two");         
        System.out.println("Array After Removal");         
        System.out.println("========================");         
        System.out.println(Arrays.toString(arrayAfterRemoval));
    }
}
Output :

Array Before Removal
========================
[Zero, One, Two, Three, Two, Five, Six]
========================
Array After Removal
========================
[Zero, One, Three, Five, Six]

The below image summarizes the methods used in this post.