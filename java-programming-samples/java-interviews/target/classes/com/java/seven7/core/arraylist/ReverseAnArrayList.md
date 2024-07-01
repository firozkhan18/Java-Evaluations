How To Reverse An ArrayList In Java?

The given ArrayList can be reversed using Collections.reverse() method. Collections class is an utility class in java.util package which provides many useful methods to operate on Collection classes. Collections.reverse() method reverses the elements of the given ArrayList in linear time i.e it has the time complexity of O(n). Collections.reverse() method takes List type as an argument. So you can use this method to reverse any List type like ArrayList, LinkedList or Vector. Below is the program to reverse an ArrayList in Java.


Also Read :

How to reverse an array in java?

How to sort an arraylist in java?

How to remove duplicate elements from an ArrayList?

Java Program To Reverse An ArrayList :

import java.util.ArrayList;
import java.util.Collections;
 
public class ReverseArrayListExample
{
    public static void main(String[] args) 
    {
        //Constructing an ArrayList         
        ArrayList<String> list = new ArrayList<String>();                 
        list.add("Gold");         
        list.add("Iron");         
        list.add("Copper");         
        list.add("Silver");         
        list.add("Nickel");         
        list.add("Cobalt");         
        list.add("Zinc");         
        //Printing list before reverse         
        System.out.println("ArrayList Before Reverse :");         
        System.out.println(list);         
        //Reversing the list using Collections.reverse() method         
        Collections.reverse(list);         
        //Printing list after reverse         
        System.out.println("ArrayList After Reverse :");         
        System.out.println(list);
    }
}
Output :

ArrayList Before Reverse :
[Gold, Iron, Copper, Silver, Nickel, Cobalt, Zinc]
ArrayList After Reverse :
[Zinc, Cobalt, Nickel, Silver, Copper, Iron, Gold]

Java Program To Reverse LinkedList :

import java.util.Collections;
import java.util.LinkedList;
 
public class ReverseLinkedListExample
{
    public static void main(String[] args) 
    {
        //Constructing a LinkedList         
        LinkedList<Integer> list = new LinkedList<Integer>();         
        list.add(56);         
        list.add(67);         
        list.add(81);         
        list.add(41);         
        list.add(63);         
        list.add(21);         
        list.add(96);         
        //Printing list before reverse         
        System.out.println("LinkedList Before Reverse :");         
        System.out.println(list);         
        //Reversing the list using Collections.reverse() method         
        Collections.reverse(list);         
        //Printing list after reverse         
        System.out.println("LinkedList After Reverse :");         
        System.out.println(list);
    }
}
Output :

LinkedList Before Reverse :
[56, 67, 81, 41, 63, 21, 96]
LinkedList After Reverse :
[96, 21, 63, 41, 81, 67, 56]

Some Useful Methods Of java.Util.Collections :
Method	Description
Collections.copy()	This method is used to copy all elements from one list to another list.
Collections.frequency()	This method checks the number of occurrences of a specified element in the given Collection.
Collections.max()	It returns the maximum element in the given Collection.
Collections.min()	It returns the minimum element in the given Collection.
Collections.replaceAll()	It replaces all occurrences of old value with new value in the given list.
Collections.sort()	This method sorts the specified list in the ascending order.
Collections.synchronizedCollection()	This method returns the synchronized version of the specified Collection.
Collections.synchronizedList()	This method returns the synchronized i.e thread safe list backed by the specified list.
Collections.synchronizedMap()	This method returns the synchronized map backed by the specified map.
Collections.synchronizedSet()	This method returns the synchronized Set backed by the specified Set.