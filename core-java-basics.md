![image](https://github.com/firozkhan18/Java-Evaluations/assets/173276873/b6c5a6af-7e97-48af-81ca-e86c6800c1d8)#### What is String literal pool?
How to create a String
There are two ways to create a String object in Java:
•	Using the new operator. For example, 
String str = new String("Hello");.
•	Using a string literal or constant expression). For example,
String str="Hello"; (string literal) or
String str="Hel" + "lo"; (string constant expression).

#### What is difference between these String's creations? 

In Java, the equals method can be considered to perform a deep comparison of the value of an object, whereas the == operator performs a shallow comparison. The equals method compares the content of two objects rather than two objects' references. The == operator with reference types (i.e., Objects) evaluates as true if the references are identical - point to the same object. With value types (i.e., primitives) it evaluates as true if the value is identical. The equals method is to returntrue if two objects have identical content - however, the equals method in the java.lang.Object class - the default equals method if a class does not override it - returns trueonly if both references point to the same object.

Let's use the following example to see what difference between these creations of string:
```java
public class DemoStringCreation {

  public static void main (String args[]) {
    String str1 = "Hello";  
    String str2 = "Hello"; 
    System.out.println("str1 and str2 are created by using string literal.");    
    System.out.println("    str1 == str2 is " + (str1 == str2));  
    System.out.println("    str1.equals(str2) is " + str1.equals(str2));  

    
    String str3 = new String("Hello");  
    String str4 = new String("Hello"); 
    System.out.println("str3 and str4 are created by using new operator.");    
    System.out.println("    str3 == str4 is " + (str3 == str4));  
    System.out.println("    str3.equals(str4) is " + str3.equals(str4));  
    
    String str5 = "Hel"+ "lo";  
    String str6 = "He" + "llo"; 
    System.out.println("str5 and str6 are created by using string 
constant expression.");    
    System.out.println("    str5 == str6 is " + (str5 == str6));  
    System.out.println("    str5.equals(str6) is " + str5.equals(str6));

    String s = "lo";
    String str7 = "Hel"+ s;  
    String str8 = "He" + "llo"; 
    System.out.println("str7 is computed at runtime.");		
    System.out.println("str8 is created by using string constant 
expression.");    
    System.out.println("    str7 == str8 is " + (str7 == str8));  
    System.out.println("    str7.equals(str8) is " + str7.equals(str8));
    
  }
}
```
The output result is:
```
str1 and str2 are created by using string literal.
    str1 == str2 is true
    str1.equals(str2) is true
str3 and str4 are created by using new operator.
    str3 == str4 is false
    str3.equals(str4) is true
str5 and str6 are created by using string constant expression.
    str5 == str6 is true
    str5.equals(str6) is true
str7 is computed at runtime.
str8 is created by using string constant expression.
    str7 == str8 is false
    str7.equals(str8) is true
```
The creation of two strings with the same sequence of letters without the use of the newkeyword will create pointers to the same String in the Java String literal pool. The String literal pool is a way Java conserves resources.
 
#### String Literal Pool
String allocation, like all object allocation, proves costly in both time and memory. The JVM performs some trickery while instantiating string literals to increase performance and decrease memory overhead. To cut down the number of String objects created in the JVM, the String class keeps a pool of strings. Each time your code create a string literal, the JVM checks the string literal pool first. If the string already exists in the pool, a reference to the pooled instance returns. If the string does not exist in the pool, a new String object instantiates, then is placed in the pool. Java can make this optimization since strings are immutable and can be shared without fear of data corruption. For example
```java
public class Program
{
    public static void main(String[] args)
    {
       String str1 = "Hello";  
       String str2 = "Hello"; 
       System.out.print(str1 == str2);
    }
}
```
The result is
true
 
Unfortunately, when you use
String a=new String("Hello");
a String object is created out of the String literal pool, even if an equal string already exists in the pool. Considering all that, avoid new String unless you specifically know that you need it! For example
```java
public class Program
{
    public static void main(String[] args)
    {
       String str1 = "Hello";  
       String str2 = new String("Hello");
       System.out.print(str1 == str2 + " ");
       System.out.print(str1.equals(str2));
    }
}
```
The result is
false true
 
A JVM has a string pool where it keeps at most one object of any String. String literals always refer to an object in the string pool. String objects created with the new operator do not refer to objects in the string pool but can be made to using String's intern() method. Thejava.lang.String.intern() returns an interned String, that is, one that has an entry in the global String pool. If the String is not already in the global String pool, then it will be added. For example
```java
public class Program
{
    public static void main(String[] args)
    {
        // Create three strings in three different ways.
        String s1 = "Hello";
        String s2 = new StringBuffer("He").append("llo").toString();
        String s3 = s2.intern();

        // Determine which strings are equivalent using the ==
        // operator
        System.out.println("s1 == s2? " + (s1 == s2));
        System.out.println("s1 == s3? " + (s1 == s3));
    }
}
```
The output is
s1 == s2? false
s1 == s3? true
There is a table always maintaining a single reference to each unique String object in the global string literal pool ever created by an instance of the runtime in order to optimize space. That means that they always have a reference to String objects in string literal pool, therefore, the string objects in the string literal pool not eligible for garbage collection.
 
String Literals in the Java Language Specification Third Edition
 
Each string literal is a reference to an instance of class String. String objects have a constant value. String literals-or, more generally, strings that are the values of constant expressions-are "interned" so as to share unique instances, using the method String.intern.
Thus, the test program consisting of the compilation unit:
```java
package testPackage;
class Test {
        public static void main(String[] args) {
                String hello = "Hello", lo = "lo";
                System.out.print((hello == "Hello") + " ");
                System.out.print((Other.hello == hello) + " ");
                System.out.print((other.Other.hello == hello) + " ");
                System.out.print((hello == ("Hel"+"lo")) + " ");
                System.out.print((hello == ("Hel"+lo)) + " ");
                System.out.println(hello == ("Hel"+lo).intern());
        }
}
class Other { static String hello = "Hello"; }
and the compilation unit:
package other;
public class Other { static String hello = "Hello"; }
```
produces the output:
true true true true false true
This example illustrates six points:
•	Literal strings within the same class in the same package represent references to the same String object.
•	Literal strings within different classes in the same package represent references to the same String object.
•	Literal strings within different classes in different packages likewise represent references to the same String object.
•	Strings computed by constant expressions are computed at compile time and then treated as if they were literals.
•	Strings computed by concatenation at run time are newly created and therefore distinct.
The result of explicitly interning a computed string is the same string as any pre-existing literal string with the same contents.

#### Why String is Immutable in Java ?

This is an old yet still popular question. There are multiple reasons that String is designed to be immutable in Java. A good answer depends on good understanding of memory, synchronization, data structures, etc. In the following, I will summarize some answers.
- 1. Requirement of String Pool
String pool (String intern pool) is a special storage area in Java heap. When a string is created and if the string already exists in the pool, the reference of the existing string will be returned, instead of creating a new object and returning its reference.
The following code will create only one string object in the heap.
view source
print?
1.String string1 = "abcd";
2.String string2 = "abcd";
Here is how it looks:
 
If string is not immutable, changing the string with one reference will lead to the wrong value for the other references.
- 2. Allow String to Cache its Hashcode
The hashcode of string is frequently used in Java. For example, in a HashMap. Being immutable guarantees that hashcode will always the same, so that it can be cashed without worrying the changes.That means, there is no need to calculate hashcode every time it is used. This is more efficient.
- 3. Security
String is widely used as parameter for many java classes, e.g. network connection, opening files, etc. Were String not immutable, a connection or file would be changed and lead to serious security threat. The method thought it was connecting to one machine, but was not. Mutable strings could cause security problem in Reflection too, as the parameters are strings.
Here is a code example:
view source
print?
1.boolean connect(string s){
2.if (!isSecure(s)) {
3.throw new SecurityException();
4.}
5.//here will cause problem, if s is changed before this by using other references.   
6.causeProblem(s);
7.}
In summary, the reasons include design, efficiency, and security

#### STRING LITERAL POOL

There are slight differences between the various methods of creating a String object. String allocation, like all object allocation, proves costly in both time and memory. The JVM performs some trickery while instantiating string literals/objects to increase performance and decrease memory overhead. To cut down the number of String objects created, JVM maintains a special memory called“String literal pool” or “String constant pool”.
Each time your code creates a string literal, the JVM checks the string literal pool first. If the string already exists in the pool, a reference to the pooled instance is returned. If the string does not exist in the pool, a new String object is created and placed in the pool. JVM keeps at most one object of any String in this pool. String literals always refer to an object in the string pool.
For example,
Direct Method of creating String object
1	String s1 = "iByteCode";
#### How this works?
	JVM checks the String constant pool first and if the string does not exist, it creates a new String object “iByteCode” and a reference is maintained in the pool. The variable ‘s1′ also refers the same object.
	This statement creates one String object “iByteCode”.
	Now, let’s see what happens if we have a statement like this:
1	String s2 = "iByteCode";
	JVM checks the String constant pool first and since the string already exists, a reference to the pooled instance is returned to s2.
	This statement does not create any String object in the memory and ‘s2′ refers the same object as ‘s1′.
	To check this, you can compare two String references using == operator to check whether two references are referring to the same String object in the memory.
String s1 = "iByteCode";
String s2 = "iByteCode";
if(s1 == s2)
    System.out.println("s1 and s2 referring to the same object.");
s1 and s2 referring to the same object.
 
Java can make this optimization since strings are immutable and can be shared without fear of data corruption. For example, if several reference variables refer to the same String object then it would be bad if any of them changes the String’s value. This is the reason for making String objects as immutable.
- Creating String using constructor
1	String s = new String("iByteCode");
In this case, because we used ‘new’ keyword a String object is created in the heap memory even if an equal string object already exists in the pool and ‘s’ will refer to the newly created one.

String str1 = "iByteCode";
String str2 = new String("iByteCode");
System.out.println(str1 == str2);
false
String objects created with the new operator do not refer to objects in the string pool but can be made to using String’s intern() method. The java.lang.String.intern() returns an interned String, that is, one that has an entry in the global String literal pool. If the String is not already in the global String literal pool, then it will be added. For example,

String s1 = new String("iByteCode");
String s2 = s1.intern();
String s3 = "iByteCode";
System.out.println(s2 == s3);
true
In the above example, if the change the statement 2 as,
1	String s2 = s1;
Reference variable ‘s2′ will refer to the string object in the heap instead of string literal pool and s1 == s2 will print true.
An object is eligible for garbage collection when it is no longer referenced from an active part of the application. In the case of String literals, they always have a reference to them from the String Literal Pool and are, therefore, not eligible for garbage collection.
All the string literals are created and their references are placed in the pool while JVM loads the class. So, even before a statement like this String s1 = new String(“iByteCode”); is executed, the string literal pool contains a reference to “iByteCode”.

#### Immutable String in Java
In java, string objects are immutable. Immutable simply means unmodifiable or unchangeable.
Once string object is created its data or state can't be changed but a new string object is created.
Let's try to understand the immutability concept by the example given below:
```java
1.	class Simple{  
2.	 public static void main(String args[]){  
3.	   String s="Sachin";  
4.	   s.concat(" Tendulkar");//concat() method appends the string at the end  
5.	   System.out.println(s);//will print Sachin because strings are immutable objects  
6.	 }  
7.	}  
```
Now it can be understood by the diagram given below. Here Sachin is not changed but a new object is created with sachintendulkar. That is why string is known as immutable.
 
As you can see in the above figure that two objects are created but s reference variable still refers to "Sachin" not to "Sachin Tendulkar".
But if we explicitely assign it to the reference variable, it will refer to "Sachin Tendulkar" object.For example:
```java
1.	class Simple{  
2.	 public static void main(String args[]){  
3.	   String s="Sachin";  
4.	   s=s.concat(" Tendulkar");  
5.	   System.out.println(s);  
6.	 }  
7.	}  
```
In such case, s points to the "Sachin Tendulkar". Please notice that still sachin object is not modified.
________________________________________
#### Why string objects are immutable in java?
Because java uses the concept of string literal.Suppose there are 5 reference variables,all referes to one object "sachin".If one reference variable changes the value of the object, it will be affected to all the reference variables. That is why string objects are immutable in java.
#### String comparison in Java
 
We can compare two given strings on the basis of content and reference.
It is used in authentication (by equals() method),sorting (by compareTo() method), reference matching (by == operator) etc.
There are three ways to compare String objects:
1.	By equals() method
2.	By = = operator
3.	By compareTo() method
1) By equals() method
- equals() method compares the original content of the string.It compares values of string for equality.String class provides two methods:
•	public boolean equals(Object another){} compares this string to the specified object.
•	public boolean equalsIgnoreCase(String another){} compares this String to another String, ignoring case.
1.	class Simple{  
2.	 public static void main(String args[]){  
3.	   
4.	   String s1="Sachin";  
5.	   String s2="Sachin";  
6.	   String s3=new String("Sachin");  
7.	   String s4="Saurav";  
8.	  
9.	   System.out.println(s1.equals(s2));//true  
10.	   System.out.println(s1.equals(s3));//true  
11.	   System.out.println(s1.equals(s4));//false  
12.	 }  
13.	}  
 
1.	//Example of equalsIgnoreCase(String) method  
2.	class Simple{  
3.	 public static void main(String args[]){  
4.	   
5.	   String s1="Sachin";  
6.	   String s2="SACHIN";  
7.	  
8.	   System.out.println(s1.equals(s2));//false  
9.	   System.out.println(s1.equalsIgnoreCase(s3));//true  
10.	 }  
11.	}  
 
________________________________________
- 2) By == operator
The = = operator compares references not values.
1.	//<b><i>Example of == operator</i></b>  
2.	  
3.	class Simple{  
4.	 public static void main(String args[]){  
5.	   
6.	   String s1="Sachin";  
7.	   String s2="Sachin";  
8.	   String s3=new String("Sachin");  
9.	  
10.	   System.out.println(s1==s2);//true (because both refer to same instance)  
11.	   System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)  
12.	 }  
13.	}  
 
________________________________________
- 3) By compareTo() method:
compareTo() method compares values and returns an int which tells if the values compare less than, equal, or greater than.
Suppose s1 and s2 are two string variables.If:
•	s1 == s2 :0
•	s1 > s2   :positive value
•	s1 < s2   :negative value
1.	//<b><i>Example of compareTo() method:</i></b>  
2.	  
3.	class Simple{  
4.	 public static void main(String args[]){  
5.	   
6.	   String s1="Sachin";  
7.	   String s2="Sachin";  
8.	   String s3="Ratan";  
9.	  
10.	   System.out.println(s1.compareTo(s2));//0  
11.	   System.out.println(s1.compareTo(s3));//1(because s1>s3)  
12.	   System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  
13.	 }  
14.	}  
 
#### How to create Immutable class?
There are many immutable classes like String, Boolean, Byte, Short, Integer, Long, Float, Double etc. In short, all the wrapper classes and String class is immutable. We can also create immutable class by creating final class that have final data members as the example given below:
Example to create Immutable class
In this example, we have created a final class named Employee. It have one final datamember, a parameterized constructor and getter method.
1.	public final class Employee{  
2.	final String pancardNumber;  
3.	  
4.	public Employee(String pancardNumber){  
5.	this.pancardNumber=pancardNumber;  
6.	}  
7.	  
8.	public String getPancardNumber(){  
9.	return pancardNumber;  
10.	}  
11.	  
12.	}  
________________________________________
The above class is immutable because:
•	The instance variable of the class is final i.e. we cannot change the value of it after creating an object.
•	The class is final so we cannot create the subclass.
•	There is no setter methods i.e. we have no option to change the value of the instance variable.
These points makes this class as immutable.
Java Reflection API
Reflection is the process of examining or modifying the runtime behaviour of a class at runtime.
The java.lang.Class class provides many methods that can be used to get metadata, examine and change the runtime behaviour of a class.
Where is it used?
The Reflection API is mainly used in:
•	IDE (Integreted Development Environment) e.g. Eclipse, MyEclipse, NetBeans etc.
•	Debugger
•	Test Tools etc.



Do You Know ?
•	How many ways we can get the instance of Class class ?
•	How to create the javap tool ?
•	How to create the appletviewer tool ?
•	How to access the private method from outside the class ?
________________________________________
java.lang.Class class
The java.lang.Class class performs mainly two tasks:
•	provides methods to get the metadata of a class at runtime.
•	provides methods to examine and change the runtime behaviour of a class.
________________________________________
Commonly used methods of Class class:
Method	Description
1) public String getName()	returns the class name
2) public static Class forName(String className)throws ClassNotFoundException	loads the class and returns the reference of Class class.
3) public Object newInstance()throws InstantiationException,IllegalAccessException	creates new instance.
4) public boolean isInterface()	checks if it is interface.
5) public boolean isArray()	checks if it is array.
6) public boolean isPrimitive()	checks if it is primitive.
7) public Class getSuperclass()	returns the superclass class reference.
8) public Field[] getDeclaredFields()throws SecurityException	returns the total number of fields of this class.
9) public Method[] getDeclaredMethods()throws SecurityException	returns the total number of methods of this class.
10) public Constructor[] getDeclaredConstructors()throws SecurityException	returns the total number of constructors of this class.
11) public Method getDeclaredMethod(String name,Class[] parameterTypes)throws NoSuchMethodException,SecurityException	returns the method class instance.
________________________________________
#### How to get the object of Class class?
There are 3 ways to get the instance of Class class. They are as follows:
•	forName() method of Class class
•	getClass() method of Object class
•	the .class syntax
- 1) forName() method of Class class
•	is used to load the class dynamically.
•	returns the instance of Class class.
•	It should be used if you know the fully qualified name of class.This cannot be used for primitive types.
Let's see the simple example of forName() method.
1.	class Simple{}  
2.	  
3.	class Test{  
4.	 public static void main(String args[]){  
5.	  Class c=Class.forName("Simple");  
6.	  System.out.println(c.getName());  
7.	 }  
8.	}  
Output:Simple
________________________________________
- 2) getClass() method of Object class
It returns the instance of Class class. It should be used if you know the type. Moreover, it can be used with primitives.
1.	class Simple{}  
2.	  
3.	class Test{  
4.	  void printName(Object obj){  
5.	  Class c=obj.getClass();    
6.	  System.out.println(c.getName());  
7.	  }  
8.	  public static void main(String args[]){  
9.	   Simple s=new Simple();  
10.	   
11.	   Test t=new Test();  
12.	   t.printName(s);  
13.	 }  
14.	}  
15.	   
Output:Simple
________________________________________
- 3) The .class syntax
If a type is available but there is no instance then it is possible to obtain a Class by appending ".class" to the name of the type.It can be used for primitive data type also.
1.	class Test{  
2.	  public static void main(String args[]){  
3.	   Class c = boolean.class;   
4.	   System.out.println(c.getName());  
5.	  
6.	   Class c2 = Test.class;   
7.	   System.out.println(c2.getName());  
8.	 }  
9.	}  
Output:boolean
       Test
________________________________________
#### Determining the class object
Following methods of Class class is used to determine the class object:
1) public boolean isInterface(): determines if the specified Class object represents an interface type.
2) public boolean isArray(): determines if this Class object represents an array class.
3) public boolean isPrimitive(): determines if the specified Class object represents a primitive type.
Let's see the simple example of reflection api to determine the object type.
1.	class Simple{}  
2.	interface My{}  
3.	  
4.	class Test{  
5.	 public static void main(String args[]){  
6.	  try{  
7.	   Class c=Class.forName("Simple");  
8.	   System.out.println(c.isInterface());  
9.	     
10.	   Class c2=Class.forName("My");  
11.	   System.out.println(c2.isInterface());  
12.	    
13.	  }catch(Exception e){System.out.println(e);}  
14.	  
15.	 }  
16.	}  
Output:false
       true
#### Comparable interface
Comparable interface is used to order the objects of user-defined class.This interface is found in java.lang package and contains only one method named compareTo(Object).It provide only single sorting sequence i.e. you can sort the elements on based on single datamember only.For instance it may be either rollno,name,age or anything else.
Syntax:
public int compareTo(Object obj): is used to compare the current object with the specified object.
________________________________________
We can sort the elements of:
1.	String objects
2.	Wrapper class objects
3.	User-defined class objects
Collections class provides static methods for sorting the elements of collection.If collection elements are of Set type, we can use TreeSet.But We cannot sort the elements of List.Collections class provides methods for sorting the elements of List type elements.
Method of Collections class for sorting List elements
public void sort(List list): is used to sort the elements of List.List elements must be of Comparable type.
Note: String class and Wrapper classes implements the Comparable interface.So if you store the objects of string or wrapper classes, it will be Comparable.
________________________________________
Example of Sorting the elements of List that contains user-defined class objects on age basis
Student.java
1.	class Student implements Comparable{  
2.	int rollno;  
3.	String name;  
4.	int age;  
5.	Student(int rollno,String name,int age){  
6.	this.rollno=rollno;  
7.	this.name=name;  
8.	this.age=age;  
9.	}  
10.	  
11.	public int compareTo(Object obj){  
12.	Student st=(Student)obj;  
13.	if(age==st.age)  
14.	return 0;  
15.	else if(age>st.age)  
16.	return 1;  
17.	else  
18.	return -1;  
19.	}  
20.	  
21.	}  
Simple.java
1.	import java.util.*;  
2.	import java.io.*;  
3.	  
4.	class Simple{  
5.	public static void main(String args[]){  
6.	  
7.	ArrayList al=new ArrayList();  
8.	al.add(new Student(101,"Vijay",23));  
9.	al.add(new Student(106,"Ajay",27));  
10.	al.add(new Student(105,"Jai",21));  
11.	  
12.	Collections.sort(al);  
13.	Iterator itr=al.iterator();  
14.	while(itr.hasNext()){  
15.	Student st=(Student)itr.next();  
16.	System.out.println(st.rollno+""+st.name+""+st.age);  
17.	  }  
18.	}  
19.	}  
Output:105 Jai 21
       101 Vijay 23
       106 Ajay 27
#### Comparator interface
Comparator interface is used to order the objects of user-defined class.
This interface is found in java.util package and contains 2 methods compare(Object obj1,Object obj2) and equals(Object element).
It provides multiple sorting sequence i.e. you can sort the elements based on any data member. For instance it may be on rollno, name, age or anything else.
Syntax of compare method
public int compare(Object obj1,Object obj2): compares the first object with second object.
________________________________________
Collections class provides static methods for sorting the elements of collection. If collection elements are of Set type, we can use TreeSet. But We cannot sort the elements of List. Collections class provides methods for sorting the elements of List type elements.
Method of Collections class for sorting List elements
public void sort(List list,Comparator c): is used to sort the elements of List by the given comparator.
________________________________________
Example of sorting the elements of List that contains user-defined class objects on the basis of age and name
In this example, we have created 4 java classes:
•  Student.java
•  AgeComparator.java
•  NameComparator.java
•  Simple.java
Student.java
This class contains three fields rollno, name and age and a parameterized constructor.
1.	class Student{  
2.	int rollno;  
3.	String name;  
4.	int age;  
5.	Student(int rollno,String name,int age){  
6.	this.rollno=rollno;  
7.	this.name=name;  
8.	this.age=age;  
9.	}  
10.	}  
AgeComparator.java
This class defines comparison logic based on the age. If age of first object is greater than the second, we are returning positive value, it can be any one such as 1, 2 , 10 etc. If age of first object is less than the second object, we are returning negative value, it can be any negative value and if age of both objects are equal, we are returning 0.
1.	import java.util.*;  
2.	class AgeComparator implements Comparator{  
3.	public int Compare(Object o1,Object o2){  
4.	Student s1=(Student)o1;  
5.	Student s2=(Student)o2;  
6.	  
7.	if(s1.age==s2.age)  
8.	return 0;  
9.	else if(s1.age>s2.age)  
10.	return 1;  
11.	else  
12.	return -1;  
13.	}  
14.	}  
NameComparator.java
This class provides comparison logic based on the name. In such case, we are using the compareTo() method of String class, which internally provides the comparison logic.
1.	import java.util.*;  
2.	class NameComparator implements Comparator{  
3.	public int Compare(Object o1,Object o2){  
4.	Student s1=(Student)o1;  
5.	Student s2=(Student)o2;  
6.	  
7.	return s1.name.compareTo(s2.name);  
8.	}  
9.	}  
Simple.java
In this class, we are printing the objects values by sorting on the basis of name and age.
1.	import java.util.*;  
2.	import java.io.*;  
3.	  
4.	class Simple{  
5.	public static void main(String args[]){  
6.	  
7.	ArrayList al=new ArrayList();  
8.	al.add(new Student(101,"Vijay",23));  
9.	al.add(new Student(106,"Ajay",27));  
10.	al.add(new Student(105,"Jai",21));  
11.	  
12.	System.out.println("Sorting by Name...");  
13.	  
14.	Collections.sort(al,new NameComparator());  
15.	Iterator itr=al.iterator();  
16.	while(itr.hasNext()){  
17.	Student st=(Student)itr.next();  
18.	System.out.println(st.rollno+" "+st.name+" "+st.age);  
19.	}  
20.	  
21.	System.out.println("sorting by age...");  
22.	  
23.	Collections.sort(al,new AgeComparator());  
24.	Iterator itr2=al.iterator();  
25.	while(itr2.hasNext()){  
26.	Student st=(Student)itr2.next();  
27.	System.out.println(st.rollno+" "+st.name+" "+st.age);  
28.	}  
29.	  
30.	  
31.	}  
32.	}  
Output:Sorting by Name...
       106 Ajay 27
       105 Jai 21
       101 Vijay 23
       Sorting by age...       
       105 Jai 21
       101 Vijay 23
       106 Ajay 27
#### Serialization
1.	Serialization
2.	Serializable Interface
3.	ObjectOutputStream class
4.	Example of Serialization
5.	Deserialization
6.	ObjectInputStream class
7.	Example of Deserialization
8.	Serialization with Inheritance
9.	Externalizable interface
10.	Serialization and static datamember
11.	Serializing the array or collection objects
12.	Serializing the object of a class that has non-serialzable object
13.	Deserializing the class object that have parameterized constructor only
Serialization is a machanism of writing the state of an object into a byte stream. It is mainly used in Hibernate, JPA, EJB etc. The reverse operation of the serialization is called deserialization. The String class and all the wrapper classes implements Serializable interface bydefault.
#### Advantage of Serialization
It is mainly used to travel object's state on the network.
________________________________________
#### About Serializable interface
Serializable is a marker interface(have no body). It is just used to "mark" Java classes which support a certain capability. It must be implemented by the class whose object you want to persist. Let's see the example given below:
1.	import java.io.Serializable;  
2.	  
3.	public class Student implements Serializable{  
4.	 int id;  
5.	 String name;  
6.	 public Student(int id, String name) {  
7.	  this.id = id;  
8.	  this.name = name;  
9.	 }  
10.	}  
________________________________________
ObjectOutputStream class:
An ObjectOutputStream is used to write primitive data types and Java objects to an OutputStream.Only objects that support the java.io.Serializable interface can be written to streams.
- Commonly used Constructors:
1) public ObjectOutputStream(OutputStream out) throws IOException {}creates an ObjectOutputStream that writes to the specified OutputStream.
- Commonly used Methods:
1) public final void writeObject(Object obj) throws IOException {}write the specified object to the ObjectOutputStream.
2) public void flush() throws IOException {}flushes the current output stream.
________________________________________
- Example of Serialization
In this example, we are going to serialize the object of Student class. The writeObject() method of ObjectOutputStream class provides the functionality to serialize the object. We are saving the state of the object in the file named f.txt.
 
1.	import java.io.*;  
2.	class Persist{  
3.	 public static void main(String args[])throws Exception{  
4.	  Student s1 =new Student(211,"ravi");  
5.	  
6.	  FileOutputStream fout=new FileOutputStream("f.txt");  
7.	  ObjectOutputStream out=new ObjectOutputStream(fout);  
8.	  
9.	  out.writeObject(s1);  
10.	  out.flush();  
11.	  
12.	  System.out.println("success");  
13.	 }  
14.	}  
1.	<strong>Output:</strong>success  
download this example of serialization
________________________________________
#### Deserilization:
Deserialization is the process of reconstructing the object from the serialized state.It is the reverse operation of serialization.
ObjectInputStream class:
An ObjectInputStream deserializes objects and primitive data written using an ObjectOutputStream.
- Commonly used Constructors:
1) public ObjectInputStream(InputStream in) throws IOException {}creates an ObjectInputStream that reads from the specified InputStream.
- Commonly used Methods:
1) public final Object readObject() throws IOException, ClassNotFoundException{}reads an object from the input stream.
________________________________________
- Example of Deserialization:
1.	import java.io.*;  
2.	class Depersist{  
3.	 public static void main(String args[])throws Exception{  
4.	    
5.	  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
6.	  Student s=(Student)in.readObject();  
7.	  System.out.println(s.id+" "+s.name);  
8.	  
9.	  in.close();  
10.	 }  
11.	}  
1.	<strong>Output:</strong>211 ravi  
download this example of deserialization
________________________________________
#### Serialization with Inheritance
If a class implements Serilizable then all its subclasses will also be serilizable. Let's see the example given below:
1.	import java.io.Serializable;  
2.	  
3.	class Person implements Serializable{  
4.	 int id;  
5.	 String name;  
6.	 Person(int id, String name) {  
7.	  this.id = id;  
8.	  this.name = name;  
9.	 }  
10.	}  
1.	class Student extends Person{  
2.	 String course;  
3.	 int fee;  
4.	 public Student(int id, String name, String course, int fee) {  
5.	  super(id,name);  
6.	  this.course=course;  
7.	  this.fee=fee;  
8.	 }  
9.	}  
Now you can serialize the Student class object that extends the Person class which is Serializable.Parent class properties are inherited to subclasses so if parent class is Serializable, subclass would also be.
________________________________________
#### Externalizable interface:
The Externalizable interface provides the facility of writing the state of an object into a byte stream in compress format. It is not a marker interface.
The Externalizable interface provides two methods:
•	public void writeExternal(ObjectOutput out) throws IOException
•	public void readExternal(ObjectInput in) throws IOException
________________________________________
#### Serialization with Static datamember
Note: If there is any static data member in a class, it will not be serialized because static is related to class not to instance.
1.	class Employee implements Serializable{  
2.	 int id;  
3.	 String name;  
4.	 static String companyName="IBM";//it won't be serialized  
5.	 public Student(int id, String name) {  
6.	  this.id = id;  
7.	  this.name = name;  
8.	 }  
9.	}  
________________________________________
Rule: In case of array or collection, all the objects of array or collection must be serializable,if any object is not serialiizable then serialization will be failed.
#### The transient keyword
The transient keyword is used in serialization. If you define any data member as transient, it will not be serialized. Let's take an example, I have declared a class as Student, it has three data members id, name and age. If you serialize the object, all the values will be serialized but I don't want to serialize one value, e.g. age then we can declare the age datamember as transient.
- Example of transient keyword
In this example, we have created the two classes Student and Persist. One data member of the Student class is declared as transient, it value will not be serialized. If you deserialize the object, it will return the default value for transient variable.
1.	import java.io.Serializable;  
2.	  
3.	public class Student implements Serializable{  
4.	 int id;  
5.	 String name;  
6.	 transient int age;//Now it will not be serialized  
7.	 public Student(int id, String name,int age) {  
8.	  this.id = id;  
9.	  this.name = name;  
10.	  this.age=age;  
11.	 }  
12.	}  
1.	import java.io.*;  
2.	class Persist{  
3.	 public static void main(String args[])throws Exception{  
4.	  Student s1 =new Student(211,"ravi",22);  
5.	  
6.	  FileOutputStream f=new FileOutputStream("f.txt");  
7.	  ObjectOutputStream out=new ObjectOutputStream(f);  
8.	  
9.	  out.writeObject(s1);  
10.	  out.flush();  
11.	  
12.	  System.out.println("success");  
13.	 }  
14.	}  
1.	<strong>Output:</strong>succss  
#### Synchronization
Synchronization is the capabilility of control the access of multiple threads to any shared resource. Synchronization is better in case we want only one thread can access the shared resource at a time.
#### Why use Synchronization?
The synchronization is mainly used to
1.	To prevent thread interference.
2.	To prevent consistency problem.
________________________________________
#### Types of Synchronization
There are two types of synchronization
1.	Process Synchronization
2.	Thread Synchronization
Here, we will discuss only thread synchronization.
#### Thread Synchronization
There are two types of thread synchronization mutual exclusive and inter-thread communication.
•	Mutual Exclusive
1.	Synchronized method.
2.	Synchronized block.
3.	static synchronization.
•	Cooperation (Inter-thread communication)
________________________________________
#### Mutual Exclusive
Mutual Exclusive helps keep threads from interfering with one another while sharing data. This can be done by three ways in java:
1.	by synchronized method
2.	by synchronized block
3.	by static synchronization
#### Understanding the concept of Lock
Synchronization is built around an internal entity known as the lock or monitor.Every object has an lock associated with it. By convention, a thread that needs consistent access to an object's fields has to acquire the object's lock before accessing them, and then release the lock when it's done with them.
From Java 5 the package java.util.concurrent.locks contains several lock implementations.
#### Understanding the problem without Synchronization
In this example, there is no synchronization, so output is inconsistent. Let's see the example:
1.	Class Table{  
2.	  
3.	void printTable(int n){//method not synchronized  
4.	   for(int i=1;i<=5;i++){  
5.	     System.out.println(n*i);  
6.	     try{  
7.	      Thread.sleep(400);  
8.	     }catch(Exception e){System.out.println(e);}  
9.	   }  
10.	  
11.	 }  
12.	}  
13.	  
14.	class MyThread1 extends Thread{  
15.	Table t;  
16.	MyThread1(Table t){  
17.	this.t=t;  
18.	}  
19.	public void run(){  
20.	t.printTable(5);  
21.	}  
22.	  
23.	}  
24.	class MyThread2 extends Thread{  
25.	Table t;  
26.	MyThread2(Table t){  
27.	this.t=t;  
28.	}  
29.	public void run(){  
30.	t.printTable(100);  
31.	}  
32.	}  
33.	  
34.	class Use{  
35.	public static void main(String args[]){  
36.	Table obj = new Table();//only one object  
37.	MyThread1 t1=new MyThread1(obj);  
38.	MyThread2 t2=new MyThread2(obj);  
39.	t1.start();  
40.	t2.start();  
41.	}  
42.	}  
________________________________________
#### Solution by synchronized method
•	If you declare any method as synchronized, it is known as synchronized method.
•	Synchronized method is used to lock an object for any shared resource.
•	When a thread invokes a synchronized method, it automatically acquires the lock for that object and releases it when the method returns.
1.	<b><i>//Program of synchronized method</i></b>  
2.	  
3.	Class Table{  
4.	  
5.	 synchronized void printTable(int n){//synchronized method  
6.	   for(int i=1;i<=5;i++){  
7.	     System.out.println(n*i);  
8.	     try{  
9.	      Thread.sleep(400);  
10.	     }catch(Exception e){System.out.println(e);}  
11.	   }  
12.	  
13.	 }  
14.	}  
15.	  
16.	class MyThread1 extends Thread{  
17.	Table t;  
18.	MyThread1(Table t){  
19.	this.t=t;  
20.	}  
21.	public void run(){  
22.	t.printTable(5);  
23.	}  
24.	  
25.	}  
26.	class MyThread2 extends Thread{  
27.	Table t;  
28.	MyThread2(Table t){  
29.	this.t=t;  
30.	}  
31.	public void run(){  
32.	t.printTable(100);  
33.	}  
34.	}  
35.	  
36.	class Use{  
37.	public static void main(String args[]){  
38.	Table obj = new Table();//only one object  
39.	MyThread1 t1=new MyThread1(obj);  
40.	MyThread2 t2=new MyThread2(obj);  
41.	t1.start();  
42.	t2.start();  
43.	}  
}
________________________________________
#### Same Example of synchronized method by using annonymous class
In this program, we have created the two threads by annonymous class, so less coding is required.
1.	<b><i>//Program of synchronized method by using annonymous class</i></b>  
2.	  
3.	Class Table{  
4.	  
5.	 synchronized void printTable(int n){//synchronized method  
6.	   for(int i=1;i<=5;i++){  
7.	     System.out.println(n*i);  
8.	     try{  
9.	      Thread.sleep(400);  
10.	     }catch(Exception e){System.out.println(e);}  
11.	   }  
12.	  
13.	 }  
14.	}  
15.	  
16.	class Use{  
17.	public static void main(String args[]){  
18.	final Table obj = new Table();//only one object  
19.	  
20.	MyThread1 t1=new MyThread1(){  
21.	public void run(){  
22.	obj.printTable(5);  
23.	}  
24.	};  
25.	MyThread1 t2=new MyThread1(){  
26.	public void run(){  
27.	obj.printTable(100);  
28.	}  
29.	};  
30.	  
31.	t1.start();  
32.	t2.start();  
33.	}  
}
#### Synchronized block
Synchronized block can be used to perform synchronization on any specific resouce of the method.
Suppose you have 50 lines of code in your method, but you want to synchronize only 5 lines, you can use synchronized block.
If you put all the codes of the method in the synchronized block, it will work same as the synchronized method.
Points to remember for Synchronized block
•	Synchronized block is used to lock an object for any shared resource.
•	Scope of synchronized block is smaller than the method.
Syntax to use synchronized block
1.	synchronized (object reference expression) {   
2.	  //code block   
3.	}  
#### Example of synchronized block
Let's see the simple example of synchronized block.
1.	<b><i>//Program of synchronized block</i></b>  
2.	  
3.	class Table{  
4.	  
5.	 void printTable(int n){  
6.	   synchronized(this){//synchronized block  
7.	     for(int i=1;i<=5;i++){  
8.	      System.out.println(n*i);  
9.	      try{  
10.	       Thread.sleep(400);  
11.	      }catch(Exception e){System.out.println(e);}  
12.	     }  
13.	   }  
14.	 }//end of the method  
15.	}  
16.	  
17.	class MyThread1 extends Thread{  
18.	Table t;  
19.	MyThread1(Table t){  
20.	this.t=t;  
21.	}  
22.	public void run(){  
23.	t.printTable(5);  
24.	}  
25.	  
26.	}  
27.	class MyThread2 extends Thread{  
28.	Table t;  
29.	MyThread2(Table t){  
30.	this.t=t;  
31.	}  
32.	public void run(){  
33.	t.printTable(100);  
34.	}  
35.	}  
36.	  
37.	class Use{  
38.	public static void main(String args[]){  
39.	Table obj = new Table();//only one object  
40.	MyThread1 t1=new MyThread1(obj);  
41.	MyThread2 t2=new MyThread2(obj);  
42.	t1.start();  
43.	t2.start();  
44.	}  
45.	}  ________________________________________
#### Same Example of synchronized block by using annonymous class:
1.	<b><i>//Program of synchronized block by using annonymous class</i></b>  
2.	  
3.	class Table{  
4.	  
5.	void printTable(int n){  
6.	   synchronized(this){//synchronized block  
7.	     for(int i=1;i<=5;i++){  
8.	      System.out.println(n*i);  
9.	      try{  
10.	       Thread.sleep(400);  
11.	      }catch(Exception e){System.out.println(e);}  
12.	     }  
13.	   }  
14.	}//end of the method  
15.	}  
16.	  
17.	class Use{  
18.	public static void main(String args[]){  
19.	final Table obj = new Table();//only one object  
20.	  
21.	Thread t1=new Thread(){  
22.	public void run(){  
23.	obj.printTable(5);  
24.	}  
25.	};  
26.	Thread t2=new Thread(){  
27.	public void run(){  
28.	obj.printTable(100);  
29.	}  
30.	};  
31.	  
32.	t1.start();  
33.	t2.start();  
34.	}  
35.	}  
#### Static synchronization
If you make any static method as synchronized, the lock will be on the class not on object.
 
#### Problem without static synchronization
Suppose there are two objects of a shared class(e.g. Table) named object1 and object2.In case of synchonized method and synchronized block there cannot be inteference between t1 and t2 or t3 and t4 because t1 and t2 both refers to a common object that have a single lock.But there can be interference between t1 and t3 or t2 and t4 because t1 acquires another lock and t3 acquires another lock.I want no interference between t1 and t3 or t2 and t4.Static synchronization solves this problem.
Example of static synchronization
In this example we are applying synchronized keyword on the static method to perform statis synchrnization.
1.	class Table{  
2.	  
3.	 synchronized static void printTable(int n){  
4.	   for(int i=1;i<=10;i++){  
5.	     System.out.println(n*i);  
6.	     try{  
7.	       Thread.sleep(400);  
8.	     }catch(Exception e){}  
9.	   }  
10.	 }  
11.	}  
12.	  
13.	class MyThread1 extends Thread{  
14.	public void run(){  
15.	Table.printTable(1);  
16.	}  
17.	}  
18.	  
19.	class MyThread2 extends Thread{  
20.	public void run(){  
21.	Table.printTable(10);  
22.	}  
23.	}  
24.	  
25.	class MyThread3 extends Thread{  
26.	public void run(){  
27.	Table.printTable(100);  
28.	}  
29.	}  
30.	  
31.	  
32.	  
33.	  
34.	class MyThread4 extends Thread{  
35.	public void run(){  
36.	Table.printTable(1000);  
37.	}  
38.	}  
39.	  
40.	class Use{  
41.	public static void main(String t[]){  
42.	MyThread1 t1=new MyThread1();  
43.	MyThread2 t2=new MyThread2();  
44.	MyThread3 t3=new MyThread3();  
45.	MyThread4 t4=new MyThread4();  
46.	t1.start();  
47.	t2.start();  
48.	t3.start();  
49.	t4.start();  
50.	}  
51.	}  
 
________________________________________
#### Same example of static synchronization by annonymous class
In this example, we are using annonymous class to create the threads.
1.	class Table{  
2.	  
3.	 synchronized static  void printTable(int n){  
4.	   for(int i=1;i<=10;i++){  
5.	     System.out.println(n*i);  
6.	     try{  
7.	       Thread.sleep(400);  
8.	     }catch(Exception e){}  
9.	   }  
10.	 }  
11.	}  
12.	  
13.	public class Test {  
14.	public static void main(String[] args) {  
15.	      
16.	    Thread t1=new Thread(){  
17.	        public void run(){  
18.	            Table.printTable(1);  
19.	        }  
20.	    };  
21.	      
22.	    Thread t2=new Thread(){  
23.	        public void run(){  
24.	            Table.printTable(10);  
25.	        }  
26.	    };  
27.	      
28.	    Thread t3=new Thread(){  
29.	        public void run(){  
30.	            Table.printTable(100);  
31.	        }  
32.	    };  
33.	      
34.	    Thread t4=new Thread(){  
35.	        public void run(){  
36.	            Table.printTable(1000);  
37.	        }  
38.	    };  
39.	    t1.start();  
40.	    t2.start();  
41.	    t3.start();  
42.	    t4.start();  
43.	      
44.	}  
45.	}  
 
________________________________________
#### Synchronized block on a class lock:
The block synchronizes on the lock of the object denoted by the reference .class name .class. A static synchronized method printTable(int n) in class Table is equivalent to the following declaration:
1.	static void printTable(int n) {  
2.	    synchronized (Table.class) {       // Synchronized block on class A  
3.	        // ...  
4.	    }  
5.	}  
#### Deadlock:
Deadlock can occur in a situation when a thread is waiting for an object lock, that is acquired by another thread and second thread is waiting for an object lock that is acquired by first thread. Since, both threads are waiting for each other to release the lock, the condition is called daedlock.
 
Example of Deadlock in java:
1.	public class DeadlockExample {  
2.	  public static void main(String[] args) {  
3.	    final String resource1 = "ratan jaiswal";  
4.	    final String resource2 = "vimal jaiswal";  
5.	    // t1 tries to lock resource1 then resource2  
6.	    Thread t1 = new Thread() {  
7.	      public void run() {  
8.	          synchronized (resource1) {  
9.	           System.out.println("Thread 1: locked resource 1");  
10.	  
11.	           try { Thread.sleep(100);} catch (Exception e) {}  
12.	  
13.	           synchronized (resource2) {  
14.	            System.out.println("Thread 1: locked resource 2");  
15.	           }  
16.	         }  
17.	      }  
18.	    };  
19.	  
20.	    // t2 tries to lock resource2 then resource1  
21.	    Thread t2 = new Thread() {  
22.	      public void run() {  
23.	        synchronized (resource2) {  
24.	          System.out.println("Thread 2: locked resource 2");  
25.	  
26.	          try { Thread.sleep(100);} catch (Exception e) {}  
27.	  
28.	          synchronized (resource1) {  
29.	            System.out.println("Thread 2: locked resource 1");  
30.	          }  
31.	        }  
32.	      }  
33.	    };  
34.	  
35.	      
36.	    t1.start();  
37.	    t2.start();  
38.	  }  
39.	}  
40.	          
#### Inter-thread communication in Java
Inter-thread communication or Co-operation is all about allowing synchronized threads to communicate with each other.
Cooperation (Inter-thread communication) is a mechanism in which a thread is paused running in its critical section and another thread is allowed to enter (or lock) in the same critical section to be executed.It is implemented by following methods of Object class:
•	wait()
•	notify()
•	notifyAll()
________________________________________
- 1) wait() method
Causes current thread to release the lock and wait until either another thread invokes the notify() method or the notifyAll() method for this object, or a specified amount of time has elapsed.
The current thread must own this object's monitor, so it must be called from the synchronized method only otherwise it will throw exception.
Method	Description
public final void wait()throws InterruptedException	waits until object is notified.
public final void wait(long timeout)throws InterruptedException	waits for the specified amount of time.
________________________________________
- 2) notify() method
Wakes up a single thread that is waiting on this object's monitor. If any threads are waiting on this object, one of them is chosen to be awakened. The choice is arbitrary and occurs at the discretion of the implementation. Syntax:
public final void notify()
________________________________________
3) notifyAll() method
Wakes up all threads that are waiting on this object's monitor. Syntax:
public final void notifyAll()
________________________________________
#### Understanding the process of inter-thread communication
 
The point to point explanation of the above diagram is as follows:
1.	Threads enter to acquire lock.
2.	Lock is acquired by on thread.
3.	Now thread goes to waiting state if you call wait() method on the object. Otherwise it releases the lock and exits.
4.	If you call notify() or notifyAll() method, thread moves to the notified state (runnable state).
5.	Now thread is available to acquire lock.
6.	After completion of the task, thread releases the lock and exits the monitor state of the object.
________________________________________
#### Why wait(), notify() and notifyAll() methods are defined in Object class not Thread class?
It is because they are related to lock and object has a lock.
________________________________________
#### Difference between wait and sleep?
Let's see the important differences between wait and sleep methods.
wait()	sleep()
wait() method releases the lock	sleep() method doesn't release the lock.
is the method of Object class	is the method of Thread class
is the non-static method	is the static method
is the non-static method	is the static method
should be notified by notify() or notifyAll() methods	after the specified amount of time, sleep is completed.
________________________________________
#### Example of inter thread communication in java
Let's see the simple example of inter thread communication.
1.	class Customer{  
2.	int amount=10000;  
3.	  
4.	synchronized void withdraw(int amount){  
5.	System.out.println("going to withdraw...");  
6.	  
7.	if(this.amount<amount){  
8.	System.out.println("Less balance; waiting for deposit...");  
9.	try{wait();}catch(Exception e){}  
10.	}  
11.	this.amount-=amount;  
12.	System.out.println("withdraw completed...");  
13.	}  
14.	  
15.	synchronized void deposit(int amount){  
16.	System.out.println("going to deposit...");  
17.	this.amount+=amount;  
18.	System.out.println("deposit completed... ");  
19.	notify();  
20.	}  
21.	}  
22.	  
23.	class Test{  
24.	public static void main(String args[]){  
25.	final Customer c=new Customer();  
26.	new Thread(){  
27.	public void run(){c.withdraw(15000);}  
28.	}.start();  
29.	new Thread(){  
30.	public void run(){c.deposit(10000);}  
31.	}.start();  
32.	  
33.	}}  
 
#### Interrupting a Thread:
If any thread is in sleeping or waiting state (i.e. sleep() or wait() is invoked), calling the interrupt() method on the thread, breaks out the sleeping or waiting state throwing InterruptedException. If the thread is not in the sleeping or waiting state, calling the interrupt() method performs normal behaviour and doesn't interrupt the thread but sets the interrupt flag to true. Let's first see the methods provided by the Thread class for thread interruption.
________________________________________
#### The 3 methods provided by the Thread class for interrupting a thread
•	public void interrupt()
•	public static boolean interrupted()
•	public boolean isInterrupted()
________________________________________
#### Example of interrupting a thread that stops working
In this example, after interrupting the thread, we are propagating it, so it will stop working. If we don't want to stop the thread, we can handle it where sleep() or wait() method is invoked. Let's first see the example where we are propagating the exception.
1.	class A extends Thread{  
2.	public void run(){  
3.	try{  
4.	Thread.sleep(1000);  
5.	System.out.println("task");  
6.	}catch(InterruptedException e){  
7.	throw new RuntimeException("Thread interrupted..."+e);  
8.	}  
9.	  
10.	}  
11.	  
12.	public static void main(String args[]){  
13.	A t1=new A();  
14.	t1.start();  
15.	try{  
16.	t1.interrupt();  
17.	}catch(Exception e){System.out.println("Exception handled "+e);}  
18.	  
19.	}  
20.	}  
download this example
1.	<strong>Output:</strong>Exception in thread-0    
2.	       java.lang.RuntimeException: Thread interrupted...  
3.	       java.lang.InterruptedException: sleep interrupted  
4.	       at A.run(A.java:7)  
________________________________________
#### Example of interrupting a thread that doesn't stop working
In this example, after interrupting the thread, we handle the exception, so it will break out the sleeping but will not stop working.
1.	class A extends Thread{  
2.	public void run(){  
3.	try{  
4.	Thread.sleep(1000);  
5.	System.out.println("task");  
6.	}catch(InterruptedException e){  
7.	System.out.println("Exception handled "+e);  
8.	}  
9.	System.out.println("thread is running...");  
10.	}  
11.	  
12.	public static void main(String args[]){  
13.	A t1=new A();  
14.	t1.start();  
15.	  
16.	t1.interrupt();  
17.	  
18.	}  
19.	}  
download this example
1.	<strong>Output:</strong>Exception handled    
2.	       java.lang.InterruptedException: sleep interrupted  
3.	       thread is running...  
________________________________________
#### Example of interrupting thread that behaves normally
If thread is not in sleeping or waiting state, calling the interrupt() method sets the interrupted flag to true that can be used to stop the thread by the java programmer later.
1.	class A extends Thread{  
2.	  
3.	public void run(){  
4.	for(int i=1;i<=5;i++)  
5.	System.out.println(i);  
6.	}  
7.	  
8.	public static void main(String args[]){  
9.	A t1=new A();  
10.	t1.start();  
11.	  
12.	t1.interrupt();  
13.	  
14.	}  
15.	}  
1.	<strong>Output:</strong>1  
2.	       2  
3.	       3  
4.	       4   
5.	       5  
________________________________________
#### What about isInterrupted and interrupted method?
The isInterrupted() method returns the interrupted flag either true or false. The static interrupted() method returns the interrupted flag afterthat it sets the flag to false if it is true.
1.	class InterruptedDemo extends Thread{  
2.	  
3.	public void run(){  
4.	for(int i=1;i<=2;i++){  
5.	if(Thread.interrupted()){  
6.	System.out.println("code for interrupted thread");  
7.	}  
8.	else{  
9.	System.out.println("code for normal thread");  
10.	}  
11.	  
12.	}//end of for loop  
13.	}  
14.	  
15.	public static void main(String args[]){  
16.	  
17.	InterruptedDemo t1=new InterruptedDemo();  
18.	InterruptedDemo t2=new InterruptedDemo();  
19.	  
20.	t1.start();  
21.	t1.interrupt();  
22.	  
23.	t2.start();  
24.	  
25.	}  
26.	}  
1.	<strong>Output:</strong>Code for interrupted thread  
2.	       code for normal thread  
3.	       code for normal thread  
4.	       code for normal thread  
5.	         
#### Reentrant Monitor in Java
According to Sun Microsystems, Java monitors are reentrant means java thread can reuse the same monitor for different synchronized methods if method is called from the method.
________________________________________
#### Advantage of Reentrant Monitor
It eliminates the possibility of single thread deadlocking
________________________________________
Let's understand the java reentrant monitor by the example given below:
1.	class Reentrant {  
2.	    public synchronized void m() {  
3.	    n();  
4.	    System.out.println("this is m() method");  
5.	    }  
6.	    public synchronized void n() {  
7.	    System.out.println("this is n() method");  
8.	    }  
9.	}  
In this class, m and n are the synchronized methods. The m() method internally calls the n() method.
Now let's call the m() method on a thread. In the class given below, we are creating thread using annonymous class.
1.	class ReentrantExample{  
2.	public static void main(String args[]){  
3.	final Reentrant re=new Reentrant();  
4.	  
5.	Thread t1=new Thread(){  
6.	public void run(){  
7.	re.m();//calling method of Reentrant class  
8.	}  
9.	};  
10.	t1.start();  
11.	}}  
 
#### Thread Pooling in Java
Thread pool represents a group of worker threads that are waiting for the job. Here, threads are executed whenever they get the job.
In case of thread pool, a group of fixed size threads are created. A thread from the thread pool is pulled out and assigned a job by the service provider. After completion of the job, thread is contained in the thread pool again.
#### Advantage of Thread Pool
Better performance It saves time because there is no need to create new thread.
Where is it used?
It is used in Servlet and JSP where container creates a thread pool to process the request.
#### Example of Java Thread Pool
Let's see a simple example of java thread pool using executors and ThreadPoolExecutor.
1.	import java.util.concurrent.ExecutorService;  
2.	import java.util.concurrent.Executors;  
3.	class WorkerThread implements Runnable {  
4.	    private String message;  
5.	    public WorkerThread(String s){  
6.	        this.message=s;  
7.	    }  
8.	   
9.	    public void run() {  
10.	        System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);  
11.	        processmessage();  
12.	        System.out.println(Thread.currentThread().getName()+" (End)");  
13.	    }  
14.	  
15.	    private void processmessage() {  
16.	        try {  Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }  
17.	    }  
18.	}  
19.	  
20.	public class SimpleThreadPool {  
21.	     public static void main(String[] args) {  
22.	        ExecutorService executor = Executors.newFixedThreadPool(5);  
23.	        for (int i = 0; i < 10; i++) {  
24.	            Runnable worker = new WorkerThread("" + i);  
25.	            executor.execute(worker);  
26.	          }  
27.	        executor.shutdown();  
28.	        while (!executor.isTerminated()) {   }  
29.	  
30.	        System.out.println("Finished all threads");  
31.	    }  
32.	   
33.	}  
download this example
Output:
1.	pool-1-thread-1 (Start) message = 0  
2.	pool-1-thread-2 (Start) message = 1  
3.	pool-1-thread-3 (Start) message = 2  
4.	pool-1-thread-5 (Start) message = 4  
5.	pool-1-thread-4 (Start) message = 3  
6.	pool-1-thread-2 (End)  
7.	pool-1-thread-2 (Start) message = 5  
8.	pool-1-thread-1 (End)  
9.	pool-1-thread-1 (Start) message = 6  
10.	pool-1-thread-3 (End)  
11.	pool-1-thread-3 (Start) message = 7  
12.	pool-1-thread-4 (End)  
13.	pool-1-thread-4 (Start) message = 8  
14.	pool-1-thread-5 (End)  
15.	pool-1-thread-5 (Start) message = 9  
16.	pool-1-thread-2 (End)  
17.	pool-1-thread-1 (End)  
18.	pool-1-thread-4 (End)  
19.	pool-1-thread-3 (End)  
20.	pool-1-thread-5 (End)  
21.	Finished all threads  
#### Can we start a thread twice?
No. After staring a thread, it can never be started again. If you does so, an IllegalThreadStateException is thrown. For Example:
1.	class Multi extends Thread{  
2.	 public void run(){  
3.	   System.out.println("running...");  
4.	 }  
5.	 public static void main(String args[]){  
6.	  Multi t1=new Multi();  
7.	  t1.start();  
8.	  t1.start();  
9.	 }  
10.	}  
1.	<strong>Output:</strong>running  
2.	       Exception in thread "main" java.lang.IllegalThreadStateException  
#### What if we call run() method directly instead start() method?
•	Each thread starts in a separate call stack.
•	Invoking the run() method from main thread, the run() method goes onto the current call stack rather than at the beginning of a new call stack.
1.	class Multi extends Thread{  
2.	 public void run(){  
3.	   System.out.println("running...");  
4.	 }  
5.	 public static void main(String args[]){  
6.	  Multi t1=new Multi();  
7.	  t1.run();//fine, but does not start a separate call stack  
8.	 }  
9.	}  
1.	<strong>Output:</strong>running... 
#### The join() method:
The join() method waits for a thread to die. In other words, it causes the currently running threads to stop executing until the thread it joins with completes its task.
Syntax:
public void join()throws InterruptedException
public void join(long miliseconds)throws InterruptedException
1.	//<b><i>Example of join() method</i></b>  
2.	  
3.	class Multi extends Thread{  
4.	 public void run(){  
5.	  for(int i=1;i<=5;i++){  
6.	   try{  
7.	    Thread.sleep(500);  
8.	   }catch(Exception e){System.out.println(e);}  
9.	  System.out.println(i);  
10.	  }  
11.	 }  
12.	public static void main(String args[]){  
13.	 Multi t1=new Multi();  
14.	 Multi t2=new Multi();  
15.	 Multi t3=new Multi();  
16.	 t1.start();  
17.	 try{  
18.	  t1.join();  
19.	 }catch(Exception e){System.out.println(e);}  
20.	  
21.	 t2.start();  
22.	 t3.start();  
23.	 }  
24.	}  
 
As you can see in the above example,when t1 completes its task then t2 and t3 starts executing.
1.	//<b><i>Example of join(long miliseconds) method</i></b>  
2.	  
3.	class Multi extends Thread{  
4.	 public void run(){  
5.	  for(int i=1;i<=5;i++){  
6.	   try{  
7.	    Thread.sleep(500);  
8.	   }catch(Exception e){System.out.println(e);}  
9.	  System.out.println(i);  
10.	  }  
11.	 }  
12.	public static void main(String args[]){  
13.	 Multi t1=new Multi();  
14.	 Multi t2=new Multi();  
15.	 Multi t3=new Multi();  
16.	 t1.start();  
17.	 try{  
18.	  t1.join(1500);  
19.	 }catch(Exception e){System.out.println(e);}  
20.	  
21.	 t2.start();  
22.	 t3.start();  
23.	 }  
24.	}  
 
In the above example,when t1 is completes its task for 1500 miliseconds(3 times) then t2 and t3 starts executing.
________________________________________
#### getName(),setName(String) and getId() method:
public String getName()
public void setName(String name)
public long getId()
1.	class Multi6 extends Thread{  
2.	  public void run(){  
3.	   System.out.println("running...");  
4.	  }  
5.	 public static void main(String args[]){  
6.	  Multi6 t1=new Multi6();  
7.	  Multi6 t2=new Multi6();  
8.	  System.out.println("Name of t1:"+t1.getName());  
9.	  System.out.println("Name of t2:"+t2.getName());  
10.	  System.out.println("id of t1:"+t1.getId());  
11.	  
12.	  t1.start();  
13.	  t2.start();  
14.	  
15.	  t1.setName("Sonoo Jaiswal");  
16.	  System.out.println("After changing name of t1:"+t1.getName());  
17.	 }  
18.	}  
 
________________________________________
#### The currentThread() method:
The currentThread() method returns a reference to the currently executing thread object.
Syntax:
public static Thread currentThread()
1.	//<b><i>Example of currentThread() method</i></b>  
2.	  
3.	class Multi6 extends Thread{  
4.	 public void run(){  
5.	  System.out.println(Thread.currentThread().getName());  
6.	 }  
7.	 }  
8.	 public static void main(String args[]){  
9.	  Multi6 t1=new Multi6();  
10.	  Multi6 t2=new Multi6();  
11.	  
12.	  t1.start();  
13.	  t2.start();  
14.	 }  
15.	}  
 
#### Garbage Collection:
In java, garbage means unreferenced objects.
Garbage Collection is process of reclaiming the runtime unused memory automatically.
Advantage of Garbage Collection:
•	It makes java memory efficient because garbage collector removes the unreferenced objects from heap memory.
•	It is automatically done by the garbage collector so we don't need to make extra efforts.
________________________________________
#### How can an object be unreferenced?
There are many ways:
•	By nulling the reference
•	By assigning a reference to another
•	By annonymous object etc.
1) By nulling a reference:
1.	Employee e=new Employee();  
2.	e=null;  
2) By assigning a reference to another:
1.	Employee e1=new Employee();  
2.	Employee e2=new Employee();  
3.	  
4.	e1=e2;//now the first object refered by e1 is available for garbage collection  
3) By annonymous object:
1.	new Employee();  
________________________________________
#### finalize() method:
The finalize() method is invoked each time before the object is garbage collected. This method can be used to perform cleanup processing. This method is defined in System class as:
1.	protected void finalize(){}  
Note: The Garbage collector of JVM collects only those objects that are created by new keyword. So if you have created any object without new, you can use finalize method to perform cleanup processing (destroying remaining objects).
________________________________________
#### gc() method:
The gc() method is used to invoke the garbage collector to perform cleanup processing. The gc() is found in System and Runtime classes.
1.	public static void gc(){}  
Note: Garbage collection is performed by a daemon thread called Garbage Collector(GC). This thread calls the finalize() method before object is garbage collected.
________________________________________
#### Simple Example of garbage collection:
1.	class Simple{  
2.	  
3.	 public void finalize(){System.out.println("object is garbage collected");}  
4.	  
5.	 public static void main(String args[]){  
6.	  Simple s1=new Simple();  
7.	  Simple s2=new Simple();  
8.	  s1=null;  
9.	  s2=null;  
10.	  System.gc();  
11.	 }  
12.	}  
 
Note: Neither finalization nor garbage collection is guaranteed.
#### Aggregation in Java
If a class have an entity reference, it is known as Aggregation. Aggregation represents HAS-A relationship.
Consider a situation, Employee object contains many informations such as id, name, emailId etc. It contains one more object named address, which contains its own informations such as city, state, country, zipcode etc. as given below.
1.	class Employee{  
2.	int id;  
3.	String name;  
4.	Address address;//Address is a class  
5.	...  
6.	}  
In such case, Employee has an entity reference address, so relationship is Employee HAS-A address.
Why use Aggregation?
•	For Code Reusability.
________________________________________
#### Simple Example of Aggregation
 
In this example, we have created the reference of Operation class in the Circle class.
1.	class Operation{  
2.	 int square(int n){  
3.	  return n*n;  
4.	 }  
5.	}  
6.	  
7.	class Circle{  
8.	 Operation op;//aggregation  
9.	 double pi=3.14;  
10.	    
11.	 double area(int radius){  
12.	   op=new Operation();  
13.	   int rsquare=op.square(radius);//code reusability (i.e. delegates the method call).  
14.	   return pi*rsquare;  
15.	 }  
16.	  
17.	     
18.	    
19.	 public static void main(String args[]){  
20.	   Circle c=new Circle();  
21.	   double result=c.area(5);  
22.	   System.out.println(result);  
23.	 }  
24.	}  
Output:78.5
      
#### When use Aggregation?
•	Code reuse is also best achieved by aggregation when there is no is-a relationship.
•	Inheritance should be used only if the relationship is-a is maintained throughout the lifetime of the objects involved; otherwise, aggregation is the best choice.
________________________________________
#### Understanding meaningful example of Aggregation
In this example, Employee has an object of Address, address object contains its own informations such as city, state, country etc. In such case relationship is Employee HAS-A address.
Address.java
1.	public class Address {  
2.	String city,state,country;  
3.	  
4.	public Address(String city, String state, String country) {  
5.	    this.city = city;  
6.	    this.state = state;  
7.	    this.country = country;  
8.	}  
9.	  
10.	}  
Emp.java
1.	public class Emp {  
2.	int id;  
3.	String name;  
4.	Address address;  
5.	  
6.	public Emp(int id, String name,Address address) {  
7.	    this.id = id;  
8.	    this.name = name;  
9.	    this.address=address;  
10.	}  
11.	  
12.	void display(){  
13.	System.out.println(id+" "+name);  
14.	System.out.println(address.city+" "+address.state+" "+address.country);  
15.	}  
16.	  
17.	public static void main(String[] args) {  
18.	Address address1=new Address("gzb","UP","india");  
19.	Address address2=new Address("gno","UP","india");  
20.	  
21.	Emp e=new Emp(111,"varun",address1);  
22.	Emp e2=new Emp(112,"arun",address2);  
23.	      
24.	e.display();  
25.	e2.display();  
26.	      
27.	}  
28.	}  
Output:111 varun
       gzb UP india
       112 arun
       gno UP india      
#### Inheritance in Java
1.	Inheritance
2.	Types of Inheritance
3.	Why multiple inheritance is not possible in java in case of class?
Inheritance is a mechanism in which one object acquires all the properties and behaviours of parent object.
The idea behind inheritance is that you can create new classes that are built upon existing classes. When you inherit from an existing class, you reuse (or inherit) methods and fields, and you add new methods and fields to adapt your new class to new situations.
Inheritance represents the IS-A relationship.
#### Why use Inheritance?
•	For Method Overriding (So Runtime Polymorphism).
•	For Code Reusability.
Syntax of Inheritance
1.	class Subclass-name extends Superclass-name  
2.	{  
3.	   //methods and fields  
4.	}  
The keyword extends indicates that you are making a new class that derives from an existing class. In the terminology of Java, a class that is inherited is called a superclass. The new class is called a subclass.
________________________________________
#### Understanding the simple example of inheritance
 
As displayed in the above figure, Programmer is the subclass and Employee is the superclass. Relationship between two classes is Programmer IS-A Employee.It means that Programmer is a type of Employee.
1.	class Employee{  
2.	 float salary=40000;  
3.	}  
4.	  
5.	class Programmer extends Employee{  
6.	 int bonus=10000;  
7.	    
8.	 public static void main(String args[]){  
9.	   Programmer p=new Programmer();  
10.	   System.out.println("Programmer salary is:"+p.salary);  
11.	   System.out.println("Bonus of Programmer is:"+p.bonus);  
12.	}  
13.	}  
Output:Programmer salary is:40000.0
       Bonus of programmer is:10000
      
In the above example,Programmer object can access the field of own class as well as of Employee class i.e. code reusability.
#### Types of Inheritance
On the basis of class, there can be three types of inheritance: single, multilevel and hierarchical.
Multiple and Hybrid is supported through interface only. We will learn about interfaces later.
 
Multiple inheritance is not supported in java in case of class.
When a class extends multiple classes i.e. known as multiple inheritance. For Example:
 
#### Que) Why multiple inheritance is not supported in java?
•	To reduce the complexity and simplify the language, multiple inheritance is not supported in java. For example:
1.	class A{  
2.	void msg(){System.out.println("Hello");}  
3.	}  
4.	  
5.	class B{  
6.	void msg(){System.out.println("Welcome");}  
7.	}  
8.	  
9.	class C extends A,B{//suppose if it were  
10.	   
11.	 Public Static void main(String args[]){  
12.	   C obj=new C();  
13.	   obj.msg();//Now which msg() method would be invoked?  
14.	}  
15.	}  
#### Object class in Java
The Object class is the parent class of all the classes in java bydefault. In other words, it is the topmost class of java.
The Object class is beneficial if you want to refer any object whose type you don't know. Notice that parent class reference variable can refer the child class object, know as upcasting.
Let's take an example, there is getObject() method that returns an object but it can be of any type like Employee,Student etc, we can use Object class reference to refer that object. For example:
1.	Object obj=getObject();//we don't what object would be returned from this method  
The Object class provides some common behaviours to all the objects such as object can be compared, object can be cloned, object can be notified etc.
 
#### Methods of Object class
The Object class provides many methods. They are as follows:
Method	Description
public final Class getClass()	returns the Class class object of this object. The Class class can further be used to get the metadata of this class.
public int hashCode()	returns the hashcode number for this object.
public boolean equals(Object obj)	compares the given object to this object.
protected Object clone() throws CloneNotSupportedException	creates and returns the exact copy (clone) of this object.
public String toString()	returns the string representation of this object.
public final void notify()	wakes up single thread, waiting on this object's monitor.
public final void notifyAll()	wakes up all the threads, waiting on this object's monitor.
public final void wait(long timeout)throws InterruptedException	causes the current thread to wait for the specified milliseconds, until another thread notifies (invokes notify() or notifyAll() method).
public final void wait(long timeout,int nanos)throws InterruptedException	causes the current thread to wait for the specified miliseconds and nanoseconds, until another thread notifies (invokes notify() or notifyAll() method).
public final void wait()throws InterruptedException	causes the current thread to wait, until another thread notifies (invokes notify() or notifyAll() method).
protected void finalize()throws Throwable	is invoked by the garbage collector before object is being garbage collected.

#### Object Cloning in Java
 The object cloning is a way to create exact copy of an object. For this purpose, clone() method of Object class is used to clone an object.
The java.lang.Cloneable interface must be implemented by the class whose object clone we want to create. If we don't implement Cloneable interface, clone() method generatesCloneNotSupportedException.
The clone() method is defined in the Object class. Syntax of the clone() method is as follows:
1.	protected Object clone() throws CloneNotSupportedException  
Why use clone() method ?
The clone() method saves the extra processing task for creating the exact copy of an object. If we perform it by using the new keyword, it will take a lot of processing to be performed that is why we use object cloning.
#### Advantage of Object cloning
Less processing task.
Example of clone() method (Object cloning)
Let's see the simple example of object cloning
1.	class Student implements Cloneable{  
2.	int rollno;  
3.	String name;  
4.	  
5.	Student(int rollno,String name){  
6.	this.rollno=rollno;  
7.	this.name=name;  
8.	}  
9.	  
10.	public Object clone()throws CloneNotSupportedException{  
11.	return super.clone();  
12.	}  
13.	  
14.	public static void main(String args[]){  
15.	try{  
16.	Student s1=new Student(101,"amit");  
17.	  
18.	Student s2=(Student)s1.clone();  
19.	  
20.	System.out.println(s1.rollno+" "+s1.name);  
21.	System.out.println(s2.rollno+" "+s2.name);  
22.	  
23.	}catch(CloneNotSupportedException c){}  
24.	  
25.	}  
26.	}  
Output:101 amit
       101 amit
#### download the example of object cloning
As you can see in the above example, both reference variables have the same value. Thus, the clone() copies the values of an object to another. So we don't need to write explicit code to copy the value of an object to another.
If we create another object by new keyword and assign the values of another object to this one, it will require a lot of processing on this object. So to save the extra processing task we use clone() method.
#### Exception Handling in Java
1.	Exception Handling
2.	Advantage of Exception Handling
3.	Hierarchy of Exception classes
4.	Types of Exception
1.	Checked Exception
2.	Unchecked Exception
3.	Error
5.	Scenarios where exception may occur
The exception handling is one of the powerful mechanism provided in java. It provides the mechanism to handle the runtime errors so that normal flow of the application can be maintained.
In this page, we will know about exception, its type and the difference between checked and unchecked exceptions.



#### Exception
•	Dictionary Meaning:Exception is an abnormal condition.
•	In java, exception is an event that disrupts the normal flow of the program. It is an object which is thrown at runtime.
#### Exception Handling
Exception Handling is a mechanism to handle runtime errors.
#### Advantage of Exception Handling
The core advantage of exception handling is that normal flow of the application is maintained. Exception normally disrupts the normal flow of the application that is why we use exception handling. Let's take a scenario:
1.	statement 1;  
2.	statement 2;  
3.	statement 3;  
4.	statement 4;  
5.	statement 5;  
6.	statement 6;  
7.	statement 7;  
8.	statement 8;  
9.	statement 9;  
10.	statement 10;  
Suppose there is 10 statements in your program and there occurs an exception at statement 5, rest of the code will not be executed i.e. statement 6 to 10 will not run. If we perform exception handling, rest of the exception will be executed. That is why we use exception handling.


#### Do You Know ?
•	What is the difference between checked and unchecked exceptions ?
•	What happens behind the code int data=50/0; ?
•	Why use multiple catch block ?
•	Is there any possibility when finally block is not executed ?
•	What is exception propagation ?
•	What is the difference between throw and throws keyword ?
•	What are the 4 rules for using exception handling with method overriding ?
Hierarchy of Exception classes
 
________________________________________
#### Types of Exception:
There are mainly two types of exceptions: checked and unchecked where error is considered as unchecked exception. The sun microsystem says there are three types of exceptions:
1.	Checked Exception
2.	Unchecked Exception
3.	Error
________________________________________
#### What is the difference between checked and unchecked exceptions ?
- 1)Checked Exception
The classes that extend Throwable class except RuntimeException and Error are known as checked exceptions e.g.IOException, SQLException etc. Checked exceptions are checked at compile-time.
- 2)Unchecked Exception
The classes that extend RuntimeException are known as unchecked exceptions e.g. ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException etc. Unchecked exceptions are not checked at compile-time rather they are checked at runtime.
- 3)Error
Error is irrecoverable e.g. OutOfMemoryError, VirtualMachineError, AssertionError etc.
________________________________________
#### Common scenarios of Exception Handling where exceptions may occur
There are given some scenarios where unchecked exceptions can occur. They are as follows:
- 1) Scenario where ArithmeticException occurs
If we divide any number by zero, there occurs an ArithmeticException.
1.	int a=50/0;//ArithmeticException  
________________________________________
- 2) Scenario where NullPointerException occurs
If we have null value in any variable, performing any operation by the variable occurs an NullPointerException.
1.	String s=null;  
2.	System.out.println(s.length());//NullPointerException  
________________________________________
- 3) Scenario where NumberFormatException occurs
The wrong formatting of any value, may occur NumberFormatException. Suppose I have a string variable that have characters, converting this variable into digit will occur NumberFormatException.
1.	String s="abc";  
2.	int i=Integer.parseInt(s);//NumberFormatException  
________________________________________
- 4) Scenario where ArrayIndexOutOfBoundsException occurs
If you are inserting any value in the wrong index, it would result ArrayIndexOutOfBoundsException as shown below:
1.	int a[]=new int[5];  
2.	a[10]=50; //ArrayIndexOutOfBoundsException

#### Nested classes in Java
1.	Nested classes
2.	Advantage of Nested classes
3.	Difference between nested class and inner class
4.	Types of Nested classes
A class declared inside a class is known as nested class. We use nested classes to logically group classes in one place so that it can be more readable and maintainable code. Moreover, it can access all the members of outer class including private members.
Syntax of Nested class
1.	class Outer_class_Name{  
2.	 ...  
3.	 class Nested_class_Name{  
4.	  ...  
5.	 }  
6.	 ...  
7.	}  
#### Advantage of nested classes
There are basically three advantages of nested classes. They are
•	Nested classes represent a special type of relationship that is it can access all the members (data members and methods) of outer class including private.
•	Nested classes can lead to more readable and maintainable code because it logically group classes in one place only.
•	Code Optimization as we need less code to write.
#### Do You Know ?
•	What is the internal code generated by the compiler for member inner class ?
•	What are the two ways to create annonymous inner class ?
•	Can we access the non-final local variable inside the local inner class ?
•	How to access the static nested class ?
•	Can we define an interface within the class ?
•	Can we define a class within the interface ?
Que) What is the difference between nested class and inner class?
Inner class is a part of nested class. Non-static nested classes are known as nested classes.
________________________________________
#### Types of Nested class:
There are two types of nested classes non-static and static nested classes.The non-static nested classes are also known as inner classes.
1.	non-static nested class(inner class)
o	a)Member inner class
o	b)Annomynous inner class
o	c)Local inner class
2.	static nested class
  

#### What we will learn in Nested classes ?
•	Nested class
•	Member inner class
•	Annonymous inner class
•	Local Inner class
•	static nested class
•	Nested interface
- 1)Member inner class
A class that is declared inside a class but outside a method is known as member inner class.
Invocation of Member Inner class
1.	From within the class
2.	From outside the class
Example of member inner class that is invoked inside a class
In this example, we are invoking the method of member inner class from the display method of Outer class.
1.	class Outer{  
2.	 private int data=30;  
3.	 class Inner{  
4.	  void msg(){System.out.println("data is "+data);}  
5.	 }  
6.	   
7.	 void display(){  
8.	  Inner in=new Inner();  
9.	  in.msg();  
10.	 }  
11.	 public static void main(String args[]){  
12.	  Outer obj=new Outer();  
13.	  obj.display();  
14.	 }  
15.	}  
 
________________________________________
#### Internal code generated by the compiler for member inner class:
The java compiler creates a class file named Outer$Inner in this case. The Member inner class have the reference of Outer class that is why it can access all the data members of Outer class including private.
1.	import java.io.PrintStream;  
2.	  
3.	class Outer$Inner  
4.	{  
5.	    final Outer this$0;  
6.	    Outer$Inner()  
7.	    {   super();  
8.	        this$0 = Outer.this;  
9.	    }  
10.	  
11.	    void msg()  
12.	    {  
13.	        System.out.println((new StringBuilder()).append("data is ")  
14.	                    .append(Outer.access$000(Outer.this)).toString());  
15.	    }  
16.	  
17.	 }  
 
________________________________________
#### Example of member inner class that is invoked outside a class
In this example, we are invoking the msg() method of Inner class from outside the outer class i.e. Test class.
1.	<b><i>//Program of member inner class that is invoked outside a class</i></b>  
2.	  
3.	class Outer{  
4.	  private int data=30;  
5.	  class Inner{  
6.	   void msg(){System.out.println("data is"+data);}  
7.	  }  
8.	}  
9.	  
10.	class Test{  
11.	 public static void main(String args[]){  
12.	  Outer obj=new Outer();  
13.	  Outer.Inner in=obj.new Inner();  
14.	  in.msg();  
15.	  }  
16.	}  
 
- 2)Annonymous inner class
A class that have no name is known as annomymous inner class.
#### Annonymous class can be created by:
1.	Class (may be abstract class also).
2.	Interface
Program of annonymous inner class by abstract class
1.	abstract class Person{  
2.	  abstract void eat();  
3.	}  
4.	  
5.	class Emp{  
6.	 public static void main(String args[]){  
7.	  Person p=new Person(){  
8.	  void eat(){System.out.println("nice fruits");}  
9.	  };  
10.	  
11.	  p.eat();  
12.	 }  
13.	}  
 
________________________________________
#### What happens behind this code?
1.	  Person p=new Person(){  
2.	  void eat(){System.out.println("nice fruits");}  
3.	  };  
4.	  
5.	 }  
6.	}  
1.	A class is created but its name is decided by the compiler which extends the Person class and provides the implementation of the eat() method.
2.	An object of Annonymous class is created that is reffered by p reference variable of Person type. As you know well that Parent class reference variable can refer the object of Child class.

The internal code generated by the compiler for annonymous inner class
1.	import java.io.PrintStream;  
2.	static class Emp$1 extends Person  
3.	{  
4.	   Emp$1(){}  
5.	  
6.	   void eat()  
7.	    {  
8.	        System.out.println("nice fruits");  
9.	    }  
10.	}  
________________________________________
#### Program of annonymous inner class by interface
1.	interface Eatable{  
2.	 void eat();  
3.	}  
4.	  
5.	class Emp{  
6.	 public static void main(String args[]){  
7.	   
8.	 Eatable e=new Eatable(){  
9.	  public void eat(){System.out.println("nice fruits");}  
10.	 };  
11.	 e.eat();  
12.	 }  
13.	}  
 
#### What does the compiler for annonymous inner class created by interface
It performs two main tasks behind this code:
1.	  Eatable p=new Eatable(){  
2.	  void eat(){System.out.println("nice fruits");}  
3.	  };  
4.	  
5.	 }  
6.	}  
1.	A class is created but its name is decided by the compiler which implements the Eatable interface and provides the implementation of the eat() method.
2.	An object of Annonymous class is created that is reffered by p reference variable of Eatable type. As you know well that Parent class reference variable can refer the object of Child class.
The internal code generated by the compiler for annonymous inner class created by interface
1.	import java.io.PrintStream;  
2.	static class Emp$1 implements Eatable  
3.	{  
4.	Emp$1(){}  
5.	  
6.	void eat(){System.out.println("nice fruits");}  
7.	}  
- 3)Local inner class
A class that is created inside a method is known as local inner class. If you want to invoke the methods of local inner class, you must instantiate this class inside the method.
Program of local inner class
1.	class Simple{  
2.	 private int data=30;//instance variable  
3.	 void display(){  
4.	  class Local{  
5.	   void msg(){System.out.println(data);}  
6.	  }  
7.	  Local l=new Local();  
8.	  l.msg();  
9.	 }  
10.	 public static void main(String args[]){  
11.	  Simple obj=new Simple();  
12.	  obj.display();  
13.	 }  
14.	}  
 
________________________________________
#### Internal code generated by the compiler for local inner class
In such case, compiler creates a class named Simple$1Local that have the reference of the outer class.
1.	import java.io.PrintStream;  
2.	class Simple$1Local  
3.	{  
4.	    final Simple this$0;  
5.	  
6.	    Simple$1Local()  
7.	    {     
8.	        super();  
9.	        this$0 = Simple.this;  
10.	    }  
11.	    void msg()  
12.	    {  
13.	        System.out.println(Simple.access$000(Simple.this));  
14.	    }  
15.	   
16.	}  
Rule: Local variable can't be private, public or protected.
________________________________________
#### Rules for Local Inner class
1) Local inner class cannot be invoked from outside the method.
2) Local inner class cannot access non-final local variable.
Program of accessing non-final local variable in local inner class
1.	class Simple{  
2.	 private int data=30;//instance variable  
3.	 void display(){  
4.	  int value=50;//local variable must be final  
5.	  class Local{  
6.	   void msg(){System.out.println(value);}//C.T.Error  
7.	  }  
8.	  Local l=new Local();  
9.	  l.msg();  
10.	 }  
11.	 public static void main(String args[]){  
12.	  Simple obj=new Simple();  
13.	  obj.display();  
14.	 }  
15.	}  
 
#### Program of accessing final local variable in local inner class
1.	class Simple{  
2.	 private int data=30;//instance variable  
3.	 void display(){  
4.	  final int value=50;//local variable must be final  
5.	  class Local{  
6.	   void msg(){System.out.println(data+" "+value);}//ok  
7.	  }  
8.	  Local l=new Local();  
9.	  l.msg();  
10.	 }  
11.	 public static void main(String args[]){  
12.	  Simple obj=new Simple();  
13.	  obj.display();  
14.	 }  
15.	}  
- 4)static nested class
A static class that is created inside a class is known as static nested class. It cannot access the non-static members.
•	It can access static data members of outer class including private.
•	static nested class cannot access non-static (instance) data member or method.
Program of static nested class that have instance method
1.	class Outer{  
2.	  static int data=30;  
3.	  
4.	  static class Inner{  
5.	   void msg(){System.out.println("data is "+data);}  
6.	  }  
7.	   
8.	  public static void main(String args[]){  
9.	  Outer.Inner obj=new Outer.Inner();  
10.	  obj.msg();  
11.	  }  
12.	}  
 
In this example, you need to create the instance of static nested class because it has instance method msg(). But you don't need to create the object of Outer class because nested class is static and static properties, methods or classes can be accessed without object.
________________________________________
#### Internal code generated by the compiler for static nested class
1.	import java.io.PrintStream;  
2.	  
3.	static class Outer$Inner  
4.	{  
5.	Outer$Inner(){}  
6.	  
7.	void msg(){  
8.	System.out.println((new StringBuilder()).append("data is ")  
9.	.append(Outer.data).toString());  
10.	}  
11.	      
12.	}  
________________________________________
#### Program of static nested class that have static method
1.	class Outer{  
2.	  static int data=30;  
3.	  
4.	  static class Inner{  
5.	   static void msg(){System.out.println("data is "+data);}  
6.	  }  
7.	   
8.	  public static void main(String args[]){  
9.	  Outer.Inner.msg();//no need to create the instance of static nested class  
10.	  }  
11.	}  
 
#### Nested Interface
An interface which is declared within another interface or class is known as nested interface. The nested interfaces are used to group related interfaces so that they can be easy to maintain. The nested interface must be referred by the outer interface or class. It can't be accessed directly.
Points to remember for nested interfaces
There are given some points that should be remembered by the java programmer.
•	Nested interface must be public if it is declared inside the interface but it can have any access modifier if declared within the class.
•	Nested interfaces are declared static implicitely.
Syntax of nested interface which is declared within the interface
1.	interface interface_name{  
2.	 ...  
3.	 interface nested_interface_name{  
4.	  ...  
5.	 }  
6.	}  
7.	   
Syntax of nested interface which is declared within the class
1.	class class_name{  
2.	 ...  
3.	 interface nested_interface_name{  
4.	  ...  
5.	 }  
6.	}  
7.	   
________________________________________
#### Example of nested interface which is declared within the interface
In this example, we are going to learn how to declare the nested interface and how we can access it.
1.	interface Showable{  
2.	  void show();  
3.	  interface Message{  
4.	   void msg();  
5.	  }  
6.	}  
7.	  
8.	class Test implements Showable.Message{  
9.	 public void msg(){System.out.println("Hello nested interface");}  
10.	  
11.	 public static void main(String args[]){  
12.	  Showable.Message message=new Test();//upcasting here  
13.	  message.msg();  
14.	 }  
15.	}  
download the example of nested interface
 
As you can see in the above example, we are acessing the Message interface by its outer interface Showable because it cannot be accessed directly. It is just like almirah inside the room, we cannot access the almirah directly because we must enter the room first. In collection frameword, sun microsystem has provided a nested interface Entry. Entry is the subinterface of Map i.e. accessed by Map.Entry.
________________________________________
#### Internal code generated by the java compiler for nested interface Message
The java compiler internally creates public and static interface as displayed below:.
1.	public static interface Showable$Message  
2.	{  
3.	  public abstract void msg();  
4.	}  
________________________________________
#### Example of nested interface which is declared within the class
Let's see how can we define an interface inside the class and how can we access it.
1.	class A{  
2.	  interface Message{  
3.	   void msg();  
4.	  }  
5.	}  
6.	  
7.	class Test implements A.Message{  
8.	 public void msg(){System.out.println("Hello nested interface");}  
9.	  
10.	 public static void main(String args[]){  
11.	  A.Message message=new Test();//upcasting here  
12.	  message.msg();  
13.	 }  
14.	}  
 
________________________________________
#### Can we define a class inside the interface ?
Yes, Ofcourse! If we define a class inside the interface, java compiler creates a static nested class. Let's see how can we define a class within the interface:
1.	interface M{  
2.	  class A{}  
3.	}  
How to call private method from another class in java
You can call the private method from outside the class by changing the runtime behaviour of the class.
By the help of java.lang.Class class and java.lang.reflect.Method class, we can call private method from any other class.
________________________________________
#### Required methods of Method class
1) public void setAccessible(boolean status) throws SecurityException sets the accessibility of the method.
2) public Object invoke(Object method, Object... args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException is used to invoke the method.
________________________________________
#### Required method of Class class
1) public Method getDeclaredMethod(String name,Class[] parameterTypes)throws NoSuchMethodException,SecurityException: returns a Method object that reflects the specified declared method of the class or interface represented by this Class object.
________________________________________
#### Example of calling private method from another class
Let's see the simple example to call private method from another class.
File: A.java
1.	public class A {  
2.	  private void message(){System.out.println("hello java"); }  
3.	}  
File: MethodCall.java
1.	import java.lang.reflect.Method;  
2.	public class MethodCall{  
3.	public static void main(String[] args)throws Exception{  
4.	  
5.	    Class c = Class.forName("A");  
6.	    Object o= c.newInstance();  
7.	    Method m =c.getDeclaredMethod("message", null);  
8.	    m.setAccessible(true);  
9.	    m.invoke(o, null);  
10.	}  
11.	}  
Output:hello java
Another example to call parameterized private method from another class
Let's see the example to call parameterized private method from another class
File: A.java
1.	class A{  
2.	private void cube(int n){System.out.println(n*n*n);}  
3.	}  
File: M.java
1.	import java.lang.reflect.*;  
2.	class M{  
3.	public static void main(String args[])throws Exception{  
4.	Class c=A.class;  
5.	Object obj=c.newInstance();  
6.	  
7.	Method m=c.getDeclaredMethod("cube",new Class[]{int.class});  
8.	m.setAccessible(true);  
9.	m.invoke(obj,4);  
10.	}}  
Output:64


#### 1) Strings are not null terminated in Java.
Unlike C and C++, String in Java doesn't terminate with null character. Instead String are Object in Java and backed by character array. You can get the character array used to represent String in Java by calling toCharArray() method of java.lang.String class of JDK.

#### 2) Strings are immutable and final in Java
Strings are immutable in Java it means once created you cannot modify content of String. If you modify it by using toLowerCase(), toUpperCase() or any other method,  It always result in new String. Since String is final there is no way anyone can extend String or override any of String functionality. Now if you are puzzled why String is immutable or final in Java. checkout the link.

#### 3) Strings are maintained in String Pool
As I Said earlier String is special class in Java and all String literal e.g. "abc"  (anything which is inside double quotes are String literal in Java) are maintained in a separate String pool, special memory location inside Java memory, more precisely inside PermGen Space. Any time you create a new String object using String literal, JVM first checks String pool and if an object with similar content available, than it returns that and doesn't create a new object. JVM doesn't perform String pool check if you create object using new operator.

You may face subtle issues if you are not aware of this String behaviour , here is an example

String name = "Scala"; //1st String object
String name_1 = "Scala"; //same object referenced by name variable
String name_2 = new String("Scala") //different String object

//this will return true
if(name==name_1){
System.out.println("both name and name_1 is pointing to same string object");
}

//this will return false
if(name==name_2){
System.out.println("both name and name_2 is pointing to same string object");
}

if you compare name and name_1 using equality operator "==" it will return true because both are pointing to same object. While name==name_2 will return false because they are pointing to different string object. It's worth remembering that equality "==" operator compares object memory location and not characters of String. By default Java puts all string literal into string pool, but you can also put any string into pool by calling intern()method of java.lang.String class, like string created using new() operator.

#### 4) Use Equals methods for comparing String in Java
String class overrides equals method and provides a content equality, which is based on characters, case and order. So if you want to compare two String object, to check whether they are same or not, always use equals() method instead of equality operator. Like in earlier example if  we use equals method to compare objects, they will be equal to each other because they all contains same contents. Here is example of comparing String using equals method.
String name = "Java"; //1st String object
String name_1 = "Java"; //same object referenced by name variable
String name_2 = new String("Java") //different String object

if(name.equals(name_1)){
System.out.println("name and name_1 are equal String by equals method");
}

//this will return false
if(name==name_2){
System.out.println("name_1 and name_2 are equal String by equals method");
}

You can also check my earlier post difference between equals() method and == operator for more detail discussion on consequences of comparing two string using == operator in Java.

#### 5) Use indexOf() and lastIndexOf() or matches(String regex) method to search inside String
String class in Java provides convenient method to see if a character or sub-string or a pattern exists in current String object. You can use indexOf() which will return position of character or String, if that exist in current String object or -1 if character doesn't exists in String. lastIndexOf is similar but it searches from end. String.match(String regex) is even more powerful, which allows you to search for a regular expression patterninside String. here is examples of indexOf, lastIndexOf and matches method from java.lang.String class.

String str = "Java is best programming language";

if(str.indexOf("Java") != -1){
     System.out.println("String contains Java at index :" + str.indexOf("Java"));
}

if(str.matches("J.*")){
     System.out.println("String Starts with J");
}

str ="Do you like Java ME or Java EE";

if(str.lastIndexOf("Java") != -1){
      System.out.println("String contains Java lastly at: " + str.lastIndexOf("Java"));
}

As expected indexOf will return 0 because characters in String are indexed from zero. lastIndexOf returns index of second “Java”, which starts at 23 and matches will return true because J.* pattern is any String starting with character J followed by any character because of dot(.) and any number of time due to asterick (*).

Remember matches() is tricky and some time non-intuitive. If you just put "Java" in matches it will return false because String is not equals to "Java" i.e. in case of plain text it behaves like equals method. See here for more examples of String matches() method.

Apart from indexOf(), lastIndexOf() and matches(String regex) String also has methods like startsWith() and endsWidth(), which can be used to check an String if it starting or ending with certain character or String.

#### 6) Use SubString to get part of String in Java
Java String provides another useful method called substring(), which can be used to get parts of String. basically you specify start and end index and substring() method returns character from that range. Index starts from 0 and goes till String.length()-1. By the way String.length() returns you number of characters in String, including white spaces like tab, space. One point which is worth remembering here is that substring is also backed up by character array, which is used by original String. This can be dangerous if original string object is very large and substring is very small, because even a small fraction can hold reference of complete array and prevents it from being garbage collected even if there is no other reference for that particular String. Read How Substring works in Java for more details. Here is an example of using SubString in Java:

String str = "Java is best programming language";
    
//this will return part of String str from index 0 to 12
String subString = str.substring(0,12);
    
System.out.println("Substring: " + subString);

#### 7) "+" is overloaded for String concatenation
Java doesn't support Operator overloading but String is special and + operator can be used to concatenate two Strings. It can even used to convert int, char, long or double to convert into String by simply concatenating with empty string "". internally + is implemented using StringBuffer prior to Java 5 and StringBuilder from Java 5 onwards. This also brings point of using StringBuffer or StringBuilder for manipulating String. Since both represent mutable object they can be used to reduce string garbage created because of temporary String. Read more about StringBuffer vs StringBuilder here.

     
#### 8) Use trim() to remove white spaces from String
String in Java provides trim() method to remove white space from both end of String. If trim() removes white spaces it returns a new String otherwise it returns same String. Along with trim() String also provides replace() and replaceAll() method for replacing characters from String. replaceAll method even support regular expression. Read more about How to replace String in Java here.

#### 9) Use split() for splitting String using Regular expression
String in Java is feature rich. it has methods like split(regex) which can take any String in form of regular expression and split the String based on that. particularly useful if you dealing with comma separated file (CSV) and wanted to have individual part in a String array. There are other methods also available related to splitting String, see this Java tutorial to split string for more details.

#### 10) Don't store sensitive data in String
String pose security threat if used for storing sensitive data like passwords, SSN or any other sensitive information. Since String is immutable in Java there is no way you can erase contents of String and since they are kept in String pool (in case of String literal) they stay longer on Java heap ,which exposes risk of being seen by anyone who has access to Java memory, like reading from memory dump. Instead char[] should be used to store password or sensitive information. See Why char[] is more secure than String for storing passwords in Java for more details.


#### 11) Character Encoding and String
Apart from all these 10 facts about String in Java, the most critical thing to know is what encoding your String is using. It does not make sense to have a String without knowing what encoding it uses. There is no way to interpret an String if you don't know the encoding it used. You can not assume that "plain" text is ASCII. If you have a String, in memory or stored in file, you must know what encoding it is in, or you cannot display it correctly. By default Java uses platform encoding i.e. character encoding of your server, and believe me this can cause huge trouble if you are handling Unicode data, especially if you are converting byte array to XML String. I have faced instances where our program fail to interpret Strings from European language e.g. German, French etc. because our server was not using Unicode encodings like UTF-8 or UTF-16. Thankfully, Java allows you to specify default character encoding for your application using system property file.encoding. See here to read more about character encoding in Java

#### What is Marker interfaces in Java and why required
Marker interface in Java is interfaces with no field or methods or in simple word empty interface in java is called marker interface. Example of market interface is Serializable, Clonnable and Remote interface. Now if marker interface doesn't have any field or method or behavior they why would Java needs it? This was asked to my friend in one of hiscore java interview and then I thought to touch based on it. In this article we will see couple of reason on what marker interface do in Java and what is use of marker interface in Java. Marker interface are also called tag interface in Java.

#### What is Marker interfaces in Java and why required
Why Marker or Tag interface do in Java
1) Looking carefully on marker interface in Java e.g. Serializable, Clonnable and Remote it looks they are used to indicate something to compiler or JVM. So if JVM sees a Class is Serializable it done some special operation on it, similar way if JVM sees one Class is implement Clonnable it performs some operation to support cloning. Same is true for RMI and Remote interface. So in short Marker interface indicate, signal or a command to Compiler or JVM.

This is pretty standard answer of question about marker interface and once you give this answer most of the time interviewee definitely asked "Why this indication can not be done using a flag inside a class?” this make sense right? Yes this can be done by using a boolean flag or a String but doesn't marking a class like Serializable or Clonnable makes it more readable and it also allows to take advantage of Polymorphism in Java.

#### Where Should I use Marker interface in Java
Apart from using built in marker interface for making a class Serializable or Clonnable. One can also develop his own marker interface. Marker interface is a good way to classify code. You can create marker interface to logically divide your code and if you have your own tool than you can perform some pre-processing operation on those classes. Particularly useful for developing API and framework likeSpring or Struts.
After introduction of Annotation on Java5, Annotation is better choice than marker interface and JUnit is a perfect example of using Annotation e.g. @Test for specifying a Test Class. Same can also be achieved by using Test marker interface.

#### Another use of marker interface in Java

One more use of marker interface in Java can be commenting. a marker interface called Thread Safe can be used to communicate other developers that classes implementing this marker interface gives thread-safe guarantee and any modification should not violate that. Marker interface can also help code coverage or code review tool to find bugs based on specified behavior of marker interfaces.
Again Annotations are better choice @ThreadSafe looks lot better than implementing ThraedSafe marker interface.

#### what is Marker interface in java with example

          One of the useful technique in java is marker interface. What is Marker interface? Why and when it is required?. Can you create your  custom (own)  marker interface?  These are  some of the questions about marker interface  asked in core java interviews.  Before start with  marker interface , let us brief about interface.  As we know, an interface is a named set of  method definitions  (and/or constant data elements) for which an implementer must provide code.  Methods defined in an inlterface have no method body. The  implementer of the interface is responsible for providing the method body.
                   Marker interface is  an interface that does not contain any method declarations and constants at all (i.e. interface with no members) but  to mark a class that implements the interface as legal to do special operation on that object OR to indicate a class  as having certain desirable properties.  As marker interface has no method declarations  , no need to write any extra methods in a class that implements the  empty interface. 

#### marker  interface is defined as given below

public interface  interfaceName {
}
                You can understand very well by going through some of the below examples of the application of marker interfaces from the Java programming language.
1. Serializable
2. java.util.RandomAccess
3. Cloneable
4. EventListner
5. SingleThreadModel
6. Remote

#### Before going to the examples  , let us answer the following questions?
1. Can you  serialize the state of an object  for its particular class which is not Serializable using writeObject() method  of  ObjectOutputStream class ?
2. Can you clone (shallow copy)  a  object which is not marked as Cloneable  using the clone() method of object?

The answer is no. The concerned classes are need to be marked or indicated  as legal for those methods to do the specified operation.  How to mark those objects as legal?. The best way is to  implement the class  with the special interface called marker  interface . The methods (for e.g. clone() and writeObject() )  that do the special operations (cloning , serialization)  will do  the check whether the object of the class is marked as legal (i.e. whether the object is  instance of marker Interface type or  instance of the class that implements the marker interface) .  If it is not marked as legal , then the method throws errors.   for eg.   NotSerializableException is thrown by writeObject()  method,  CloneNotSupportedException is thrown by the clone() method.

- 1. Let us take the Serializable interface  

    public interface Serializable {}
         One of the example of the application of marker interfaces from the Java programming language  is  Serializable interface.  By implementing this interface, a class indicates that its non-transient data members can be written to an ObjectOutputStream .    The  method writeObject() of ObjectOutputStream class will do  many instanceof  checks  as given below  to determine writabilty, one of which checks  for the Serializable interface. If any of  these tests fails, the method throws a NotSerializableException. That means an attempt to call ObjectOutputStream.writeObject()  on an object that doesn’t implement Serializable will fail  at runtime,

  


        ............

        else if (obj instanceof Enum) {     writeEnum((Enum) obj, desc, unshared);  }

        else if (obj instanceof Serializable) {   writeOrdinaryObject(obj, desc, unshared); }

         else          throw  NotSerializableException exception 


  - 2.    Cloneable - a Marker interface
       public interface Cloneable {}
                    A class implements the Cloneable interface to indicate to the Object.clone() method that it is legal for shallow copy  ( to make a field-for-field copy of instances of that class) and  CloneNotSupportedException  is thrown to indicate that the clone() method has been called to clone an object, but that the object's class does not implement the Cloneable interface

Many classes in  Java (such as  Date and Calendar)   implement Cloneable as given below
                          public abstract class Calendar extends Object implements Serializable, Cloneable
               Thus, the instances of these classes can be cloned. For example, the following code clones a calender object.
          Calendar rightNow = Calendar.getInstance();  //    getInstance method returns a Calendar object whose time fields have been initialized with the current date and time:
         Calendar calender_Clone1 = (Calendar)rightNow.clone();
        

- 3.  java.util.RandomAccess is also a Marker interface
public interface RandomAccess { }
           RandomAccess Marker interface is implemented by  Lists (For e.g. ArrayList) to indicate that they support  random access. Java provides many Lists that  may be either random  or sequential access lists.  Both requires different algorithms  to provide good performance for manipulating  the lists.  The best algorithms for manipulating random access lists (such as ArrayList) may give poor performance when applied to sequential access lists (such as LinkedList).
                 So to write generic algorithms , it is required to check whether the given list supports  fast random access  or sequential access .  For this purpose, RandomAccess marker interface is created and  it is assumed that a List that implements this interface supports  random access.  Now the generic algorithms can be written  by checking the given list is an instanceof RandomAccess interface before  applying an algorithm.

- 4.  EventListner :
                        All event listener types are interfaces that extend the java.util.EventListener interface. This tagging / marker  interface  does not declare any methods but you can use the instanceof operator to distinguish event listeners from other object types.

- 5.  SingleThreadModel :
                     The marker interface, meaning  does not declare any methods but  it  indicates to the servlet container that the servlet is not thread-safe, and to  handle only one request at a time in its service( ) method.

#### Create  marker interface for your application :
                     You can create your own marker interface which is suitable for your application.  Let us create our own very simple marker interface as given below


 interface Allowable{ }  //marker interface


class CheckAndAllow

{

 void allow(Object obj) throws NotAllowableException

{

     if(obj instanceof Allowable)

          {

      System.out.println(obj.getClass() + "  that implements Allowable interface  is allowed to do the operation" );

           //do specific operation

           }

      else

         {

              throw new NotAllowableException();

          }
}

}



 class  Test implements Allowable {

           int uid;

          String name;  }


  class NotAllowableException extends Exception {

     public NotAllowableException() {     }

     public NotAllowableException(String msg) { super(msg);  }

      }





public class MITest

{

    public static void main(String args[])

      {

         CheckAndAllow ca=new CheckAndAllow();

        try

          {

 Test test=new Test();

         ca.allow(test);

         System.out.println("Success");

           }catch( NotAllowableException na){System.out.println(na);}

 }

} 
In the above example code ,  allow method of CheckAndAllow class accepts only  the object of the class that implements the Allowable interface. If you send the object's class does not implement the Allowable interface, NotAllowableException  exception is thrown.

#### Is Marker interface  obsolete? 
     You may heard that marker annotation is the replacement for marker interface. There is no reason  to say that marker interface is obsolete. Both have merits and demerits. Although java annotation is a useful and powerful feature introduced in java 5.0 , marker interfaces are still used by still frameworks such as Spring , Struts.  For eg. Spring framework provides many marker interfaces  to change the behavior of your bean in the BeanFactory.  Some of the below good reasons make marker interface still alive. 

1. Marker interface  makes the code more readablilty and understandability where as so many annotations may lead to poor code readability and understandability.

2. If you define a reference variable whose type is an interface / marker interface , any object you assign to it must be an instance of a class / marked class that implements the interface. Assigning other objects of class that does not implement the interface , throws compile time errors. 

3. With marker interface , a simple  "instanceof"  check is required to check the class is marked by  interface as we seen in the code of own marker interface.   But with annotation , you need  to use reflection or  similar  mechanism to check the class has the desired @annotation. 

#### What is Marker interface? How is it used in Java?
The marker interface is a design pattern, used with languages that provide run-time type information about objects. It provides a way to associate metadata with a class where the language does not have explicit support for such metadata. To use this pattern, a class implements a marker interface, and code that interact with instances of that class test for the existence of the interface. Whereas a typical interface specifies functionality (in the form of method declarations) that an implementing class must support, a marker interface need not do so. The mere presence of such an interface indicates specific behavior on the part of the implementing class. There can be some hybrid interfaces, which both act as markers and specify required methods, are possible but may prove confusing if improperly used. Java utilizes this pattern very well and the example interfaces are

- java.io.Serializable - Serializability of a class is enabled by the class implementing the java.io.Serializable interface. Classes that do not implement this interface will not have any of their state serialized or deserialized. All subtypes of a serializable class are themselves serializable. The serialization interface has no methods or fields and serves only to identify the semantics of being serializable.
- java.rmi.Remote - The Remote interface serves to identify interfaces whose methods may be invoked from a non-local virtual machine. Any object that is a remote object must directly or indirectly implement this interface. Only those methods specified in a "remote interface", an interface that extends java.rmi.Remote are available remotely.
- java.lang.Cloneable - A class implements the Cloneable interface to indicate to the Object.clone() method that it is legal for that method to make a field-for-field copy of instances of that class. Invoking Object's clone method on an instance that does not implement the Cloneable interface results in the exception CloneNotSupportedException being thrown.
- javax.servlet.SingleThreadModel - Ensures that servlets handle only one request at a time. This interface has no methods.
- java.util.EvenListener - A tagging interface that all event listener interfaces must extend.

- The "instanceof" keyword in java can be used to test if an object is of a specified type. So this keyword in combination with Marker interface can be used to take different actions based on type of interface an object implements.

Marker Interface in Java: what, why, uses, etc.

#### What are Marker Interfaces in Java?
An empty interface having no methods or fields/constants is called a marker interface or a tag interface. This of course means if the interface is extending other interfaces (directly or indirectly) then the super interfaces must not have any inheritable member (method or field/constant) as otherwise the definition of the marker interface (an entirely empty interface) would not be met. Since members of any interface are by default ‘public’ so all members will be inheritable and hence we can say for an interface to be a marker interface, all of its direct or indirect super interfaces should also be marker. (Thanks marco for raising the point. I thought it was obvious, but mentioning all this explicitly would probably help our readers.)
There are few Java supplied marker interfaces like Cloneable, Serializable, etc. One can create their own marker interfaces the same way as they create any other interface in Java.
#### Purpose of having marker interfaces in Java i.e., why to have marker interfaces?
The main purpose to have marker interfaces is to create special types in those cases where the types themselves have no behavior particular to them. If there is no behavior then why to have an interface? Because the implementor of the class might only need to flag that it belongs to that particular type and everything else is handled/done by some other unit – either internal to Java (as in the case of Java supplied standard marker interfaces) or an app specific external unit.
Let’s understand this by two examples – one in which we will discuss the purpose of a standard Java interface (Cloneable) and then another user-created marker interface.

#### What purpose does the Cloneable interface serve?
When JVM sees a clone() method being invoked on an object, it first verifies if the underlying class has implemented the ‘Cloneable’ interface or not. If not, then it throws the exception CloneNotSupportedException. Assuming the underlying class has implemented the ‘Cloneable’ interface, JVM does some internal work (maybe by calling some method) to facilitate the cloning operation. Cloneable is a marker interface and having no behavior declared in it for the implementing class to define because the behavior is to be supported by JVM and not the implementing classes (maybe because it’s too tricky, generic, or low-level at the implementing class level). So, effectively marker interfaces kind of send out a signal to the corresponding external/internal entity (JVM in case of Cloneable) for them to arrange for the necessary functionality.
How does JVM support the ‘cloning’ functionality – probably by using a native method call as cloning mechanism involves some low-level tasks which are probably not possible with using a direct Java method. So, a possible ‘Object.clone’ implementation would be something like this:-
public Object clone() throws CloneNotSupportedException {

 if (this implements Cloneable)

 return nativeCloneImpl();

 else

 throw new CloneNotSupportedException();

}
 
Anyone wondered as to why and when do we get ‘CloneNotSupportedException’ exception at compile-time itself? Well… that’s no trick. If you see the signature of the ‘Object.clone()’ method carefully, you will see a throws clause associated with it. I’m sure how can you get rid of it: (i) by wrapping the clone-invocation code within appropriate try-catch (ii) throwing the CloneNotSupportedException from the calling method.
What purpose does a user-defined marker interface serve? It can well serve the same purpose as by any standard marker interface, but in that case the container (the module controlling the execution of the app) has to take the onus of making sure that whenever a class implements that interface it does the required work to support the underlying behavior – the way JVM does for Cloneable or any other standard marker interface for that matter.

#### Defining an user-defined marker interface in Java

Let’s define a user-defined marker interface. Let’s say there is an app suporting a medical store inventory and suppose you need a reporting showing the sale, revenue, profit, etc. of three types of medicines – allopathic, homeopathic, and ayurvedic separately. Now all you need is to define three marker interfaces and make your products (medicines) implement the corresponding ones.
public interface Allopathic{}
public interface Homeopathic{}
public interface Ayurvedic{}
In your reporting modules, you can probably get the segregation using something similar to below:-
for (Medicine medicine : allMedicines) {
if (medicine instanceof Allopathic) {
//... update stats accordingly
}
else if (medicine instanceof Homeopathic) {
//... update stats accordingly
}
else if (medicine instanceof Ayurvedic) {
//... update stats accordingly
}
else {
//... handle stats for general items
}
}
As you can see the medicines themselves don’t need to implement any specific behavior based on whether they are allopathic, homeopathic, or ayurvedic. All they need is to have a way of reflecting which category they belong to, which will in turn help the reporting modules to prepare the stats accordingly.
Now this can be done by having a flag as well… yeah, sure it can be. But, don’t you think tagging a class makes it more readable than having a flag indicating the same. You kind of make it an implementation-independent stuff for the consumers of your classes. If your class implements an interface, it becomes part of the class signature of the published API. Otherwise, you would probably handle the situation by having a public final field having the flag set up at the time of instantiation – final because you would not like others to change it. I guess going the marker interface way would probably make more sense in many such situations.
Another advantage of going via marker interface way is that at any point of time you can easily cast the objects of the implementing classes. Again it’s not that if you go via public final approach, you can’t do that. You can very well do, but casting might look a cleaner approach in many situations.
The bottom-line is there will hardly be any enforced need for a designer/developer to go via that way as there can be possible alternatives, but marker interfaces can surely be a preferred choice for some in some cases.

#### How do I find duplicate values in a table in Oracle?

select column_name, count(column_name)
from table
group by column_name
having count (column_name) > 1;

Simplest I can think of:
select job_number, count(*)
from jobs
group by job_number
having count(*) > 1;

Another way:
SELECT *
FROM TABLE A
WHERE EXISTS (
  SELECT 1 FROM TABLE
  WHERE COLUMN_NAME = A.COLUMN_NAME
  AND ROWID < A.ROWID
)
Works fine (quick enough) when there is index on column_name. And it's better way to delete or update duplicate rows.

You don't need to even have the count in the returned columns if you don't need to know the actual number of duplicates. e.g.
SELECT column_name
FROM table
GROUP BY column_name
HAVING COUNT(*) > 1

How about:
SELECT <column>, count(*)
FROM <table>
GROUP BY <column> HAVING COUNT(*) > 1;
To answer the example above, it would look like:
SELECT job_number, count(*)
FROM jobs
GROUP BY job_number HAVING COUNT(*) > 1;

Doing
select count(j1.job_number), j1.job_number, j1.id, j2.id
from   jobs j1 join jobs j2 on (j1.job_numer = j2.job_number)
where  j1.id != j2.id
group by j1.job_number
will give you the duplicated rows' ids.
In case where multiple columns identify unique row (e.g relations table ) there you can use following
Use row id e.g. emp_dept(empid, deptid, startdate, enddate) suppose empid and deptid are unique and identify row in that case
select oed.empid, count(oed.empid) 
from emp_dept oed 
where exists ( select * 
               from  emp_dept ied 
                where oed.rowid <> ied.rowid and 
                       ied.empid = oed.empid and 
                      ied.deptid = oed.deptid )  
        group by oed.empid having count(oed.empid) > 1 order by count(oed.empid);
and if such table has primary key then use primary key instead of rowid, e.g id is pk then
select oed.empid, count(oed.empid) 
from emp_dept oed 
where exists ( select * 
               from  emp_dept ied 
                where oed.id <> ied.id and 
                       ied.empid = oed.empid and 
                      ied.deptid = oed.deptid )  
        group by oed.empid having count(oed.empid) > 1 order by count(oed.empid);




#### Find duplicate rows in Oracle table

You are an Oracle DBA or developer and want to determine the location of duplicate rows in an Oracle table. You need it for example before attempting to place a unique index on the table. See below how can this be done.

Oracle tables always have one guaranteed unique column, the rowid column. If you use a min/max function against your rowid and then select against the proposed primary key you can squeeze out the rowids of the duplicate rows pretty quick. For example:
SELECT * FROM customers o
WHERE rowid > (SELECT min(rowid) FROM customers i
WHERE o.city = i.city and o.rating = i.rating)
In the situation where multiple columns make up the proposed key,
they must all be used in the WHERE clause.
Here is another simple and dirty way to accomplish the same:
SELECT city, rating, count(*)
FROM customers
GROUP BY city, rating
HAVING count(*) > 1


SELECT * FROM emp a
WHERE rowid = (SELECT max(rowid) FROM emp
WHERE empno = a.empno 
GROUP BY empno
HAVING count(*) >1)

#### Delete and truncate command in SQL
Truncate and delete in SQL are two commands which is used to remove or delete data from table. Though quite basic in nature both sql commands can create lot of trouble until you are familiar with details before using it. Difference between Truncate and delete are not just important to understand perspective but also a very popular SQL interview topic which in my opinion a definite worthy topic. What makes them tricky is amount of data. Since most of Electronic trading system stores large amount of transactional data and some even maintain historical data, good understanding of delete and truncate command is required to effectively work on those environment.I have still seen people firing delete command just to empty a table with millions of records which eventually lock the whole table for doing anything and take ages to complete or Simply blew log segment or hang the machine.

 
Most of enterprise stock trading system maintains two kind of database one transactional and other static. Transactional data is for day by day records which need to be purge at end of data or moved to historical data so that application can make a fresh start another day. If you need to work on such large set of data, my advice is to get clear andcomplete knowledge of delete and truncate command, along with there differences and when to use which command to remove data or purge tables.

In this article we will see where to use truncate in SQL and where to use delete in SQL, How to use truncate or delete and what danger or harm they can create if not used carefully along with difference between truncate and delete in SQL.

#### What is Truncate command in SQL
Use truncate table if you need to delete all rows, since truncate doesn't allow you to specify WHERE clause. truncate removes data by deallocating space used by table which removes lot of overhead in terms of logging and locking and that's why truncate is faster than delete.What you need to take care is rollback, data deleted by truncate can not be rolled back until data server specifically supports it e.g. MSSQL Server which allows to commit or rollback truncate table statement transactional. Another caveat with truncate table statement is that it doesn't fire a trigger and you can not truncate a table when a foreign key references any column to the table to be truncated. Only situation I see which is perfect for using truncate is purging tables with huge data, though there is another solution exists to drop table and recreated it if that make sense.

#### Example of truncate command in SQL

truncate table Orders;  //Order table shouldn't have a column which is foreign key on other table

#### What is Delete command in SQL
Delete is another sql command available for removing records from table. Delete is even more flexible than truncate like it provides support to WHERE Clause which can be use to remove selective data. It logs each row which allows operation to be rolled back and it also fires triggers. One disadvantage of using delete is speed and locking. Delete acquires lock on table and its also very slow operation because of logging, which makes it unsuitable for removing records from large tables. One workaround for this is batch-delete in which you remove batch of records instead on one record at a time. Delete is most suitable fore removing selective data and use it where you want to rollback transaction in database. It’s not useful to purge large amount of data from tables and should not be used, otherwise it could lock the table for very long time, blew log segment and can take ages to complete.

#### Example of delete command in SQL

delete  * from Orders; //delete all row from Orders, should not be used if Orders is large
delete  * from Orders where Symbol="MSFT.NQ" //delete all orders where symbol is MSFT.NQ


#### Difference between truncate and delete command in SQL
This is an important point to understand before using truncate or delete on production environment, or writing any script which purges data from tables.

1. truncate is fast delete is slow.
2. truncate doesn't do logging delete logs on per row basis.
3. rollback is possible with delete not with truncate until specifically supported by vendor.
4. truncate doesn't fire trigger, delete does.
5. Don't delete, truncate it when it comes to purge tables.
6. truncate reset identity column in table if any, delete doesn't.
7. truncate is DDL while delete is DML (use this when you are writing exam)
8. truncate doesn't support where clause, delete does.

So finally if you have table with huge data and want to empty it don’t Delete, truncate it

#### Interview questions on truncate and delete in SQL
Truncate and delete both are popular interview topics and there is always some question on these commands in SQL interview. Here I am listing some of SQL interview questions based on delete and truncate command in SQL, you can find answer in this article itself or by google.

1) If you have table which contains large amount of data which command will you use for removing data, truncate or delete?

2) What are differences between truncate and delete?

3) Which one is fast truncate or delete?

4) What is disadvantage of using truncate in sql?

5) How will you delete data if truncate is not supported and log segment is also not big enough to support complete delete?

6) Is there any way to remove data other than truncate and delete in SQL?

#### Database Transaction Tutorial in SQL with Example for Beginners
Database transaction is an important concept to understand while working in database and SQL. Transaction in database is required to protect data and keep it consistent when multiple users access the database at same time.  In this database transaction tutorial we will learn what is transaction in database, why do you need transaction in database, ACID properties of database transaction and an example of database transaction along with commit and rollback.   Almost all vendors like Oracle, MySQL, SQL Server or Sybase provide transaction facility though MySQL only provide it for certain storage engine like InnoDB and BDB and not for MyISAM.
#### What is transaction in database?
 Database transaction is collection of SQL queries which forms a logical one task. For transaction to be completed successfully all SQL queries has to run successfully. Database transaction executes either all or none, so for example if your database transaction contains 4 SQL queries and one of them fails then change made by other 3 queries will be rolled back. This way your database always remain consistent whether transaction succeeded or failed. Transaction is implemented in database using SQL keyword transaction, commit and rollback. Commit writes the changes made by transaction into database and rollback removes temporary changes logged in transaction log by database transaction.

#### Database Transaction tutorial
Why transaction is required in database
Database is used to store data required by real life application e.g. Banking, Healthcare, Finance etc. All your money stored in banks is stored in database, all your shares of DMAT account is stored in database and many application constantly work on these data. In order to protect data and keep it consistent any changes in this data needs to be done in transaction so that even in case of failure data remain in previous state before start of transaction. Consider a Classical example of ATM (Automated Tailor Machine); we all use to withdraw and transfer money by using ATM. If you break withdrawal operation into individual steps you will find:

1) Verify account details.
2) Accept withdrawal request
3) Check balance
4) Update balance
4) Dispense money

Suppose your account balance is 1000$ and you make a withdrawal request of 900$. At fourth step your balance is updated to 900$ and ATM machine stops working due to power outage
Once power comes back and you again tried to withdraw money you surprised by seeing your balance just 100$ instead of 1000$. This is not acceptable by any person in the world :) so we need transaction to perform such task. If SQL statements would have been executed inside transaction in database balance would be either 100$ until money has been dispensed or 1000$ if money has not been dispensed.

#### ACID Properties of database transaction
There are four important properties of database transactions these are represented by acronym ACID and also called ACID properties or database transaction where:

- A stands for Atomicity, Atom is considered to be smallest particle which can not be broken into further pieces.database transaction has to be atomic means either all steps of transaction completes or none of them.

- C stands for Consistency, transaction must leave database in consistent state even if it succeed or rollback.

- I is for Isolation
Two database transactions happening at same time should not affect each other and has consistent view of database. This is achieved by using isolation levels in database.

- D stands for Durability
Data has to be persisted successfully in database once transaction completed successfully and it has to be saved from power outage or other threats. This is achieved by saving data related to transaction in more than one places along with database.

#### When to use database transaction
Whenever any operation falls under ACID criteria you should use transactions. Many real world scenarios require transaction mostly in banking, finance and trading domain.

#### How to implement transaction in SQL
Database transaction is implemented in SQL using three keywords start transaction, commit and rollback.once you type start transaction, database starts a transaction and execute all subsequent SQL statements in transaction and keep track of all of them to either commit or rollback changes. Commit keywords saves then changes made by transaction into database and after commit change is normally visible to other transaction though is subject to isolation level. In case you encountered any error while executing individual sql statements inside database transaction, you can rollback all your changes by executing "rollback" command.

#### Database Transaction Example
To understand database transaction better let's see a real life example of transaction in database. For this example we will assume we have an Account table which represent a Bank Account and we will transfer money from one account to another account

Request: transfer 900$ from Account 9001 to 9002

start transaction
select balance from Account where Account_Number='9001';
select balance from Account where Account_Number='9002';
update Account set balance=balance-900 here Account_Number='9001' ;
update Account set balance=balance+900 here Account_Number='9002' ;
commit; //if all sql queries succed
rollback; //if any of Sql queries failed or error


#### Database transaction in MySQL
In my previous mysql command tutorials I have talked aobut different databse storage engines available in mysql e.g. myISAM or InnoDB. Not all mysql engines supports transaction in order to make transaction works in mysql you either need to use InnoDB or BDB Engine. You can specify engige while creating table in mysql or you can also change your engine in mysql by using ALTER keyword. For example "ALTER TABLE tablename TYPE=InnoDB;

#### Important point about database transaction
1. Database transaction is nothing but a set of SQL statement.

2. Transaction in database is either all or none means either all SQL statement success or none.

3. Its good practice to execute sql query inside transaction and commit or rollback based on result but you need to be little careful with transaction log. To faciliate rollback and commit every sql query which executed inside database transaction is written into transaction log and size of transaction log can grow significantly if don't commit or rollback for longtime.

4. Effect of two simulteneous database transaction into data is controlled by using Isolation level. Isolation level is used to separate one database transaction with other and currently there are four databse isolation levels:
- 1) Read Uncommited
This is lowest level of databse isolation level in this one database transaction can see changes made by other databse transaction which is not yet commited. This can allow you dirty read so quite dangerous.
- 2) Read Commited
This is sligltly better where one database transaction only sees commited changes by other database transaction. But this is also not safe and can lead you to non-repeatable reads problem.
- 3) Repeatable Reads
- 4) Serializable
Highest level of database isolation level. In this all database transactions are totally isolated with other database transaction.though this is safe but this safety can cause significant performance hit.

- 5. MyISAM storage engine in MySQL doesn't support transaction. In order to make transaction works in MySQL use InnoDB.

- 6. Databse transaction should follow ACID properties.

That’s all for now on database transaction tutorial, I will add more useful points about transaction in databse as I come across or recall, you can also provide your input and issues face during transaction in database on different RDBMS e.g. Oracle, MySQL, MSSQL Server or Sybase etc.


Read more: http://javarevisited.blogspot.com/2011/11/database-transaction-tutorial-example.html#ixzz2q09FQdbf
