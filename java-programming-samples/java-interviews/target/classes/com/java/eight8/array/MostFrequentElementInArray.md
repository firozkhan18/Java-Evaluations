How To Find The Most Frequent Element In Array In Java?

The Most Frequent Element Program In Java :
Write a java program or function to find the most frequent element in array. Your program should take an array of integers as input and find out the most frequently occurring element in that array.


How To Find The Most Frequent Element In Array In Java?
The problems like this can be easily solved by using HashMap. What we do is we create one HashMap object with elements of input array as keys and their occurrences as values. The key with maximum value will be the most frequent element in the input array. Let’s see how to find the most frequent element in array using HashMap step by step.

The most frequent element in array in java

Step 1 : Create one HashMap object called elementCountMap with elements of inputArray as keys and their occurrences as values.

HashMap<Integer, Integer> elementCountMap = new HashMap<Integer, Integer>()


Step 2 : Insert all the elements of inputArray into elementCountMap one by one. If an element is already present in elementCountMap, increment its count by 1. If an element is not present, put that element into elementCountMap with 1 as its value.

for (int i : inputArray)
{
        if (elementCountMap.containsKey(i))
        {
                elementCountMap.put(i, elementCountMap.get(i)+1);
        }
        else
        {
                elementCountMap.put(i, 1);
        }
}

Step 3 : Iterate through the elementCountMap to get the most frequent element in inputArray and its frequency.

Set<Entry<Integer, Integer>> entrySet = elementCountMap.entrySet();

for (Entry<Integer, Integer> entry : entrySet)
{
        if(entry.getValue() > frequency)
        {
                element = entry.getKey();
                frequency = entry.getValue();
        }
}

Java Program To Find The Most Frequent Element In Array :

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
 
public class MostFrequentElementProgram
{   
    static void getMostFrequentElement(int inputArray[])
    {
        //Creating HashMap object with elements as keys and their occurrences as values         
        HashMap<Integer, Integer> elementCountMap = new HashMap<Integer, Integer>();         
        //Inserting all the elements of inputArray into elementCountMap         
        for (int i : inputArray) 
        {
            if (elementCountMap.containsKey(i))
            {
                //If an element is present, incrementing its count by 1                 
                elementCountMap.put(i, elementCountMap.get(i)+1);
            }
            else
            {
                //If an element is not present, put that element with 1 as its value                 
                elementCountMap.put(i, 1);
            }
        }         
        int element = 0;         
        int frequency = 1;         
        //Iterating through elementCountMap to get the most frequent element and its frequency         
        Set<Entry<Integer, Integer>> entrySet = elementCountMap.entrySet();         
        for (Entry<Integer, Integer> entry : entrySet) 
        {
            if(entry.getValue() > frequency)
            {
                element = entry.getKey();                 
                frequency = entry.getValue();
            }
        }         
        //Printing the most frequent element in array and its frequency         
        if(frequency > 1)
        {
            System.out.println("Input Array : "+Arrays.toString(inputArray));             
            System.out.println("The most frequent element : "+element);             
            System.out.println("Its frequency : "+frequency);             
            System.out.println("========================");
        }
        else
        {
            System.out.println("Input Array : "+Arrays.toString(inputArray));             
            System.out.println("No frequent element. All elements are unique.");             
            System.out.println("=========================");
        }
    }     
    public static void main(String[] args)
    {
        getMostFrequentElement(new int[]{4, 5, 8, 7, 4, 7, 6,7});         
        getMostFrequentElement(new int[]{1, 2, 7, 5, 3, 6});
    }
}
Output :

Input Array : [4, 5, 8, 7, 4, 7, 6, 7]
The most frequent element : 7
Its frequency : 3
========================
Input Array : [1, 2, 7, 5, 3, 6]
No frequent element. All elements are unique.
=========================