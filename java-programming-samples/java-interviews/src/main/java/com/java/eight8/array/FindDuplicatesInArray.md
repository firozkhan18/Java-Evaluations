How To Find Duplicates In Array In Java?

There are many methods through which you can find duplicates in array in java. In this post, we will learn to find duplicate elements in array in java using Brute Force method, using Sorting method, using HashSet, using HashMap and using Java 8 Streams. Let’s see them one by one.

How To Find Duplicates In Array In Java Using Brute Force method?
In this method, we compare each element of an array with other elements. If any two elements are found equal, we declare them as duplicates. The time complexity of this method is O(n^2).

private static void findDuplicatesUsingBruteForce(int[] inputArray)
{
    for (int i = 0; i < inputArray.length; i++) 
    {
        for (int j = i+1; j < inputArray.length; j++) 
        {
            if(inputArray&#91;i&#93; == inputArray&#91;j&#93;)
            {
                System.out.println("Duplicate Element : "+inputArray&#91;i&#93;);
            }
        }
    }
}
&#91;/java&#93;
<!-- /wp:shortcode -->
 
<!-- wp:heading {"level":4} -->
<h4>How To Find Duplicate Elements In Array In Java Using Sorting?</h4>
<!-- /wp:heading -->
 
<!-- wp:paragraph -->
<p>In this method, first we sort the given array in ascending or descending order and then traverse the sorted array. The duplicate elements will be next to each other. The time complexity of this solution is  <br><em>O(nlogn)+O(n)</em> i.e <em>O(nlogn)</em> for sorting and <em>O(n)</em> for traversing the sorted array.</p>
<!-- /wp:paragraph -->
 
<!-- wp:shortcode -->
[java]
private static void findDuplicatesUsingSorting(int[] inputArray)
{
    Arrays.sort(inputArray);         
    for (int i = 0; i < inputArray.length-1; i++)
    {
        if(inputArray&#91;i&#93; == inputArray&#91;i+1&#93;)
        {
            System.out.println("Duplicate Element :" + inputArray&#91;i&#93;);
        }
    }
}
&#91;/java&#93;
<!-- /wp:shortcode -->
 
<!-- wp:heading {"level":4} -->
<h4>How To Find Duplicates In Array In Java Using HashSet?</h4>
<!-- /wp:heading -->
 
<!-- wp:paragraph -->
<p>You know that <em>HashSet</em> holds only unique elements. It never allows duplicate elements. We use this property of <em>HashSet</em> to find duplicate elements in array in java. What we do is we try to add each element of an array into <em>HashSet</em> using <em>add()</em> method. This method adds only unique elements into <em>HashSet</em>. If you try to add duplicate element, it will return <em>false</em>. The time complexity of this solution is <em>O(n)</em> and space complexity is also <em>O(n)</em> as you need to store the unique elements in <em>HashSet</em>.</p>
<!-- /wp:paragraph -->
 
<!-- wp:shortcode -->
[java]
private static void findDuplicatesUsingHashSet(int[] inputArray)
{
    HashSet<Integer> set = new HashSet<Integer>();         
    for (int element : inputArray) 
    {
        if( ! set.add(element))
        {
            System.out.println("Duplicate Element : "+element);
        }
    }
}
How To Find Duplicate Elements In Array In Java Using HashMap?
In this method, We use HashMap to find duplicates in array in java. We store the elements of input array as keys of the HashMap and their occurrences as values of the HashMap. If the value of any key is more than one (>1) then that key is duplicate element. Using this method, you can also find the number of occurrences of duplicates. The time and space complexity of this solution is O(n).

private static void findDuplicatesUsingHashMap(int[] inputArray)
{
    HashMap<Integer, Integer> map = new HashMap<>();         
    for (int element : inputArray) 
    {   
        if(map.get(element) == null)
        {
            map.put(element, 1);
        }
        else
        {
            map.put(element, map.get(element)+1);
        }
    }         
    Set<Entry<Integer, Integer>> entrySet = map.entrySet();         
    for (Entry<Integer, Integer> entry : entrySet) 
    {               
        if(entry.getValue() > 1)
        {
            System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
        }
    }
}
How To Find Duplicates In Array Using Java 8 Streams?
The following method uses Java 8 Streams to find duplicates in array.


private static void findDuplicatesUsingJava8(int[] inputArray) 
{   
    Set<Integer> uniqueElements = new HashSet<>();         
    Set<Integer> duplicateElements =  Arrays.stream(inputArray)
                                            .filter(i -> !uniqueElements.add(i))
                                            .boxed()
                                            .collect(Collectors.toSet());         
    System.out.println(duplicateElements);
}
5 Methods To Find Duplicates In Array In Java :

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
 
public class DuplicatesInArray 
{
    //Method 1 : Brute Force Method     
    private static void findDuplicatesUsingBruteForce(int[] inputArray)
    {
        for (int i = 0; i < inputArray.length; i++) 
        {
            for (int j = i+1; j < inputArray.length; j++) 
            {
                if(inputArray&#91;i&#93; == inputArray&#91;j&#93;)
                {
                    System.out.println("Duplicate Element : "+inputArray&#91;i&#93;);
                }
            }
        }
    }     
    //Method 2 : Sorting Method     
    private static void findDuplicatesUsingSorting(int&#91;&#93; inputArray)
    {
        Arrays.sort(inputArray);         
        for (int i = 0; i < inputArray.length-1; i++)
        {
            if(inputArray&#91;i&#93; == inputArray&#91;i+1&#93;)
            {
                System.out.println("Duplicate Element : " + inputArray&#91;i&#93;);
            }
        }
    }     
    //Method 3 : Using HashSet     
    private static void findDuplicatesUsingHashSet(int&#91;&#93; inputArray)
    {
        HashSet<Integer> set = new HashSet<Integer>();         
        for (int element : inputArray) 
        {
            if( ! set.add(element))
            {
                System.out.println("Duplicate Element : "+element);
            }
        }
    }     
    //Method 4 : Using HashMap     
    private static void findDuplicatesUsingHashMap(int[] inputArray)
    {
        HashMap<Integer, Integer> map = new HashMap<>();         
        for (int element : inputArray) 
        {   
            if(map.get(element) == null)
            {
                map.put(element, 1);
            }
            else
            {
                map.put(element, map.get(element)+1);
            }
        }         
        Set<Entry<Integer, Integer>> entrySet = map.entrySet();         
        for (Entry<Integer, Integer> entry : entrySet) 
        {               
            if(entry.getValue() > 1)
            {
                System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
            }
        }
    }     
    //Method 5 : Using Java 8 Streams     
    private static void findDuplicatesUsingJava8(int[] inputArray) 
    {   
        Set<Integer> uniqueElements = new HashSet<>();         
        Set<Integer> duplicateElements =  Arrays.stream(inputArray)
                                                .filter(i -> !uniqueElements.add(i))
                                                .boxed()
                                                .collect(Collectors.toSet());         
        System.out.println(duplicateElements);
    }     
    public static void main(String[] args) 
    {
        int[] inputArray = new int[] {111, 333, 555, 777, 333, 444, 555};     
        System.out.println("======Duplicates Using Brute Force======");         
        findDuplicatesUsingBruteForce(inputArray);         
        System.out.println("======Duplicates Using Sorting======");         
        findDuplicatesUsingSorting(inputArray);         
        System.out.println("======Duplicates Using HashSet======");         
        findDuplicatesUsingHashSet(inputArray); 
        System.out.println("======Duplicates Using HashMap======");         
        findDuplicatesUsingHashMap(inputArray);         
        System.out.println("======Duplicates Using Java 8 Streams======");         
        findDuplicatesUsingJava8(inputArray);
    }
}
Output :


======Duplicates Using Brute Force======
Duplicate Element : 333
Duplicate Element : 555
======Duplicates Using Sorting======
Duplicate Element : 333
Duplicate Element : 555
======Duplicates Using HashSet======
Duplicate Element : 333
Duplicate Element : 555
======Duplicates Using HashMap======
Duplicate Element : 555 – found 2 times.
Duplicate Element : 333 – found 2 times.
======Duplicates Using Java 8 Streams======
[555, 333]