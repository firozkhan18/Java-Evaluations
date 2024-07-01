How To Make Collection Read Only In Java?

What Is Read Only Collection In Java?
Read only collection or unmodifiable collection is a collection which can not be modified once created. You will not be able to add an element or remove an element or edit an element once you make the collection read only. If you try to perform these operations on read only collection, you will get java.lang.UnsupportedOperationException. In this post, we will see how to make collection read only in java.


How To Make Collection Read Only In Java?
java.util.Collections class provides some unmodifiable wrapper methods to create read only collections in java. These methods take the Collection type as an argument and returns read only view of the specified collection. Any modification operations (like add, delete or edit an element) on the returned collection, direct or via its iterators, will result in UnsupportedOperationException. But, you can perform any modification operations on original collection and those modifications are reflected in the returned collection.

That means, what these unmodifiable wrapper methods do is, any query or read operations you perform on the returned collection, will actually read through the original collection and any modification operations you perform on the returned  collection, direct or via its iterators, will result in UnsupportedOperationException.

Below table shows complete list of all unmodifiable wrapper methods of Collections class which are used to create read only collections.

How to make collection read only in java


Let’s see how to make some of the important Collection types like ArrayList, HashSet and HashMap read only in java using methods of Collections class.

How To Make ArrayList Read Only In Java?
Collections.unmodifiableList() method is used to create read only ArrayList in java. Below program demonstrates that modifications to read only list are not allowed and modifications to original list are reflected in read only list also.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
public class ReadOnlyList 
{
    public static void main(String[] args) 
    {
        //Creating an ArrayList
         
        List&lt;String&gt; originalList = new ArrayList&lt;String&gt;();
         
        //Adding elements to originalList
         
        originalList.add("John");
         
        originalList.add("Carlos");
         
        originalList.add("David");
         
        originalList.add("Ian");
         
        originalList.add("Daniel");
         
        //Printing originalList
         
        System.out.println("=========== Original List ===========");
         
        System.out.println(originalList);
         
        //Creating read only view of the originalList
         
        List readOnlyList = Collections.unmodifiableList(originalList);
         
        //Printing readOnlyList
         
        System.out.println("=========== Read Only List ===========");
         
        System.out.println(readOnlyList);
         
        //Modification operations on readOnlyList throws UnsupportedOperationException
         
        try
        {
            readOnlyList.add("AnyName");
             
            readOnlyList.remove("John");
             
            readOnlyList.set(1, "NameChanged");
        }
        catch (UnsupportedOperationException e) 
        {
            System.out.println("====== Modification operations on read only list not allowed ======");
        }
         
        //Modification operations on originalList are reflected in readOnlyList also
         
        originalList.add("AnyName");
         
        originalList.remove("John");
         
        originalList.set(1, "NameChanged");
         
        //Printing readOnlyList
         
        System.out.println("====== Modifications to original list are reflected in read only list ======");
         
        System.out.println("=========== Read Only List ===========");
                 
        System.out.println(readOnlyList);
    }
}
Output :
=========== Original List ===========
[John, Carlos, David, Ian, Daniel]
=========== Read Only List ===========
[John, Carlos, David, Ian, Daniel]
====== Modification operations on read only list not allowed ======
====== Modifications to original list are reflected in read only list ======
=========== Read Only List ===========
[Carlos, NameChanged, Ian, Daniel, AnyName]

How To Make HashSet Read Only In Java?
Collections.unmodifiableSet() method is used to create read only HashSet in java. Below program demonstrates that you will not be able to perform modification operations on read only set and modifications to original set are reflected in read only set also.


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
 
public class ReadOnlySet 
{
    public static void main(String[] args) 
    {
        //Creating an HashSet
         
        Set&lt;String&gt; originalSet = new HashSet&lt;String&gt;();
         
        //Adding elements to originalSet
         
        originalSet.add("John");
         
        originalSet.add("Carlos");
         
        originalSet.add("David");
         
        originalSet.add("Ian");
         
        originalSet.add("Daniel");
         
        //Printing originalSet
         
        System.out.println("=========== Original Set ===========");
         
        System.out.println(originalSet);
         
        //Creating read only view of the originalSet
         
        Set&lt;String&gt; readOnlySet = Collections.unmodifiableSet(originalSet);
         
        //Printing readOnlySet
         
        System.out.println("=========== Read Only Set ===========");
         
        System.out.println(readOnlySet);
         
        //Modification operations on readOnlySet throws UnsupportedOperationException
         
        try
        {
            readOnlySet.add("AnyName");
             
            readOnlySet.remove("John");
        }
        catch (UnsupportedOperationException e) 
        {
            System.out.println("====== Modifications to read only set not allowed ======");
        }
         
        //Modification operations on originalSet are reflected in readOnlySet also
         
        originalSet.add("AnyName");
         
        originalSet.remove("John");
         
        //Printing readOnlySet
         
        System.out.println("====== Modifications to original set are reflected in read only set ======");
         
        System.out.println("=========== Read Only set ===========");
                 
        System.out.println(readOnlySet);
    }
}
Output :
=========== Original Set ===========
[Ian, John, David, Daniel, Carlos]
=========== Read Only Set ===========
[Ian, John, David, Daniel, Carlos]
====== Modifications to read only set not allowed ======
====== Modifications to original set are reflected in read only set ======
=========== Read Only set ===========
[Ian, David, Daniel, Carlos, AnyName]

How To Make HashMap Read Only In Java?
Collections.unmodifiableMap() method is used to create read only HashMap in java. The following program demonstrates that we will not be able to perform modification operations on read only map and any modifications to original map are reflected in read only map.

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
 
public class ReadOnlyMap 
{
    public static void main(String[] args) 
    {
        //Creating an HashMap
         
        Map&lt;Integer, String&gt; originalMap = new HashMap&lt;Integer, String&gt;();
         
        //Adding elements to originalMap
         
        originalMap.put(1, "John");
         
        originalMap.put(2, "Carlos");
         
        originalMap.put(3, "David");
         
        originalMap.put(4, "Ian");
         
        originalMap.put(5, "Daniel");
         
        //Printing originalMap
         
        System.out.println("=========== Original Map ===========");
         
        Set&lt;Entry&lt;Integer, String&gt;&gt; entrySet = originalMap.entrySet();
         
        for (Entry&lt;Integer, String&gt; entry : entrySet) 
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
         
        //Creating read only view of the originalMap
         
        Map&lt;Integer, String&gt; readOnlyMap = Collections.unmodifiableMap(originalMap);
         
        //Printing readOnlyMap
         
        System.out.println("=========== Read Only Map ===========");
         
        entrySet = readOnlyMap.entrySet();
         
        for (Entry&lt;Integer, String&gt; entry : entrySet) 
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
         
        //Modification operations on readOnlyMap throws UnsupportedOperationException
         
        try
        {
            readOnlyMap.put(6, "AnyName");
             
            readOnlyMap.remove(2);
        }
        catch (UnsupportedOperationException e) 
        {
            System.out.println("====== Modifications to read only map are not allowed ======");
        }
         
        //Modification operations on originalMap are reflected in readOnlyMap also
         
        originalMap.put(6, "AnyName");
         
        originalMap.remove(2);
         
        //Printing readOnlyMap
         
        System.out.println("====== Modifications to original map are reflected in read only map also ======");
         
        System.out.println("=========== Read Only Map ===========");
                 
        entrySet = readOnlyMap.entrySet();
         
        for (Entry&lt;Integer, String&gt; entry : entrySet) 
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
Output :

=========== Original Map ===========
1 : John
2 : Carlos
3 : David
4 : Ian
5 : Daniel
=========== Read Only Map ===========
1 : John
2 : Carlos
3 : David
4 : Ian
5 : Daniel
====== Modifications to read only map are not allowed ======
====== Modifications to original map are reflected in read only map also ======
=========== Read Only Map ===========
1 : John
3 : David
4 : Ian
5 : Daniel
6 : AnyName