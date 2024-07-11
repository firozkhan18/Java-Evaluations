#Java 8 Functional Interfaces – When & How To Use Them?

Functional interfaces, lambda expressions and Stream API – these three features of Java 8 has turned Java programming into new style of programming called functional-style programming. Java is still an object-oriented programming language, but from Java 8, with the introduction of new features, most of the programming is done keeping functions in mind rather than objects. In this article, we will see Java 8 functional interfaces, @FunctionalInterface annotation, java.util.function package and how to use new Java 8 functional interfaces to compose lambda expressions with some simple examples.

##Java 8 Functional Interfaces
1) Definition
Functional interfaces are the interfaces which has exactly one abstract method. They may have any number of default methods but must have only one abstract method. Functional interfaces provide only one functionality to implement.

There were functional interfaces exist before Java 8. It is not like that they are the whole new concept introduced only in Java 8. Runnable, ActionListener, Callable and Comaprator are some old functional interfaces which exist even before Java 8.

The new set of functional interfaces are introduced in Java 8 to make programmer’s job easy while writing lambda expressions. Your lambda expression must implement any one of these functional interfaces. These new functional interfaces are organised under java.util.function package.

2) @FunctionalInterface Annotation
@FunctionalInterface annotation is introduced in Java 8 to represent functional interfaces. Although, it is not compulsory to write functional interface using this annotation. But, if you are using @FunctionalInterface annotation then your interface should contain only one abstract method. If you try to write more than one abstract method, compiler will show the error.


3) java.util.function package
All Java 8 functional interfaces are organised in java.util.function package. Each functional interface in this package represents an operation that can be performed by the lambda expression.

Below table shows the list of all Java 8 functional interfaces along with their abstract method, which operation they represent and when to use them?

###Java 8 functional interfaces
4) How To Use Java 8 Functional Interfaces In Real Time?
Let’s define Student class like below. We will be using this class in the subsequent examples.

class Student
{
    int id;
     
    String name;
     
    double percentage;
     
    String specialization;
     
    public Student(int id, String name, double percentage, String specialization) 
    {
        this.id = id;
         
        this.name = name;
         
        this.percentage = percentage;
         
        this.specialization = specialization;
    }
     
    public int getId() {
        return id;
    }
 
    public String getName() {
        return name;
    }
 
    public double getPercentage() {
        return percentage;
    }
 
    public String getSpecialization() {
        return specialization;
    }
 
    @Override
    public String toString()
    {
        return id+"-"+name+"-"+percentage+"-"+specialization;
    }
}
Let listOfStudents be the list of 10 students.

List<Student> listOfStudents = new ArrayList<Student>();
         
listOfStudents.add(new Student(111, "John", 81.0, "Mathematics"));         
listOfStudents.add(new Student(222, "Harsha", 79.5, "History"));         
listOfStudents.add(new Student(333, "Ruth", 87.2, "Computers"));         
listOfStudents.add(new Student(444, "Aroma", 63.2, "Mathematics"));         
listOfStudents.add(new Student(555, "Zade", 83.5, "Computers"));         
listOfStudents.add(new Student(666, "Xing", 58.5, "Geography"));         
listOfStudents.add(new Student(777, "Richards", 72.6, "Banking"));         
listOfStudents.add(new Student(888, "Sunil", 86.7, "History"));         
listOfStudents.add(new Student(999, "Jordan", 58.6, "Finance"));         
listOfStudents.add(new Student(101010, "Chris", 89.8, "Computers"));

Let’s see how to use 4 important functional interfaces – Predicate, Consumer, Function and Supplier using above listOfStudents.

a) Predicate – Tests an object

Predicate represents an operation which takes an argument T and returns a boolean. Use this functional interface, if you want to define a lambda expression which performs some test on an argument and returns true or false depending upon outcome of the test.

For example,

Imagine an operation where you want only a list of “Mathematics” students from the above listOfStudents. Let’s see how to do it using Predicate.

Lambda expression implementing Predicate : Checking specialization of a Student

Predicate<Student> mathematicsPredicate = (Student student) -> student.getSpecialization().equals("Mathematics");
         
List<Student> mathematicsStudents = new ArrayList<Student>();
         
for (Student student : listOfStudents) 
{
    if (mathematicsPredicate.test(student)) 
    {
        mathematicsStudents.add(student);
    }
}
b) Consumer – Consumes an object

Consumer represents an operation which takes an argument and returns nothing. Use this functional interface If you want to compose a lambda expression which performs some operations on an object.

For example, displaying all students with their percentage.

Lambda expression implementing Consumer : Displaying all students with their percentage

Consumer<Student> percentageConsumer = (Student student) -> {
        System.out.println(student.getName()+" : "+student.getPercentage());
    };
         
for (Student student : listOfStudents) 
{
    percentageConsumer.accept(student);
}
c) Function – Applies to an object

Function represents an operation which takes an argument of type T and returns a result of type R. Use this functional interface if you want to extract some data from an existing data.

For example, extracting only the names from listOfStudents.

Lambda expression implementing Function : Extracting only the names of all students

Function<Student, String> nameFunction = (Student Student) -> Student.getName();
         
List<String> studentNames = new ArrayList<String>();
         
for (Student student : listOfStudents) 
{
    studentNames.add(nameFunction.apply(student));
}
d) Supplier – Supplies the objects

Supplier represents an operation which takes no argument and returns the results of type R. Use this functional interface when you want to create new objects.

###Lambda expression implementing Supplier : Creating a new Student


Supplier<Student> studentSupplier = () -> new Student(111111, "New Student", 92.9, "Java 8");
         
listOfStudents.add(studentSupplier.get());
5) Functional Interfaces Supporting Primitive Type
Java 8 has also introduced functional interfaces which support primitive types. For example IntPredicate, DoublePredicate, LongConsumer etc… (See above table).

If an input or output is a primitive type then using these functional interfaces will enhance the performance of your code. For example, if input to a Predicate is primitive type int then using intPredicate instead of Predicate will remove unnecessary boxing of input.


|-----------------------|---------------------|-------------------------------------------------------------------------|
| Functional interface  | Function descriptor | Primitive specializations 												| |-----------------------|---------------------|-------------------------------------------------------------------------| 
| Predicate<T> 			| T -> boolean 		  | IntPredicate, LongPredicate, DoublePredicate 							|
|-----------------------|---------------------|-------------------------------------------------------------------------| 
| Consumer<T> 			| T -> void 		  | IntConsumer, LongConsumer, DoubleConsumer 								|
|-----------------------|---------------------|-------------------------------------------------------------------------| 
| Function<T, R> 		| T -> R 			  | IntFunction<R>, IntToDoubleFunction, IntToLongFunction,					| 
|						|					  | LongFunction<R>, LongToDoubleFunction, LongToIntFunction, 				|
|						|					  | DoubleFunction<R>, ToIntFunction<T>, ToDoubleFunction<T>, 				|
|						|					  | ToLongFunction<T> 														|
|-----------------------|---------------------|-------------------------------------------------------------------------| 
| Supplier<T> 			| () -> T 			  | BooleanSupplier, IntSupplier, LongSupplier, DoubleSupplier 				|
|-----------------------|---------------------|-------------------------------------------------------------------------| 
| UnaryOperator<T> 		| T -> T 			  | IntUnaryOperator, LongUnaryOperator, DoubleUnaryOperator 				|
|-----------------------|---------------------|-------------------------------------------------------------------------| 
| BinaryOperator<T> 	| (T, T) -> T 		  | IntBinaryOperator, LongBinaryOperator, DoubleBinaryOperator 			|
|-----------------------|---------------------|-------------------------------------------------------------------------| 
| BiPredicate<L, R> 	| (L, R) -> boolean   | 															  			|
|-----------------------|---------------------|-------------------------------------------------------------------------|
| BiConsumer<T, U> 		| (T, U) -> void 	  | ObjIntConsumer<T>, ObjLongConsumer<T>, ObjDoubleConsumer<T> 			|
|-----------------------|---------------------|-------------------------------------------------------------------------| 
| BiFunction<T, U, R> 	| (T, U) -> R 		  | ToIntBiFunction<T, U>, ToLongBiFunction<T, U>, ToDoubleBiFunction<T, U> |
|-----------------------|---------------------|-------------------------------------------------------------------------|

|||||<p>IntToLongFunction</p><p>IntToDoubleFunction</p><p>LongToDoubleFunction</p><p>LongTolIntFunction</p><p>DoubleToIntFunction</p><p>DoubleToLongFunction</p>|
| :- | :- | :- | :- | :- |
|<p>Supplier</p><p>T get()</p>|<p>Represents</p><p>operation</p><p>nothing but</p><p>result of type</p>|<p>an Use this interface</p><p>which takes\_ || you want to</p><p>returnsa objects.</p><p>T.</p>|<p>when</p><p>create new</p>|<p>BooleanSupplier</p><p>IntSupplier</p><p>LongSupplier</p><p>DoubleSupplier</p>|
|<p>BiPredicate</p><p>boolean test(T t, U</p><p>u)</p>|<p>Represents</p><p>of two</p>|<p>a predicate || Use this interface</p><p>arguments. you want to</p><p>boolean</p><p>two arguments.</p>|<p>when</p><p>evaluate a</p><p>expression of</p>||
|BiConsumer|Represents|an Use this interface|when|ObjlntConsumer|
||operation|that accepts || you want to|perform|ObjLongConsumer|
|void accept(T t, U u) |||<p>two arguments</p><p>returns</p>|<p>and some</p><p>nothing. objects.</p>|operationsontwo\_ |||ObjDoubleConsumer|
|<p>BiFunction</p><p>R apply(T t, U u)</p>|<p>Represents</p><p>operation</p><p>two arguments</p><p>produces a</p>|<p>an Use this interface</p><p>which takes || you want to</p><p>and data from two</p><p>result. objects.</p>|<p>when</p><p>extract result</p><p>existing</p>|<p>TolntBiFunction</p><p>|| ToLongBiFunction</p><p>ToDoubleBiFunction</p>|
|<p>UnaryOperator</p><p>(extends Function)</p>|<p>Same as</p><p>argument</p><p>should be</p><p>type.</p>|<p>Function but Same as</p><p>and result</p><p>of same</p>|Function.|<p>IntUnaryOperator</p><p>LongUnaryOperatot</p><p>DoubleUnaryOperator</p>|
|<p>Binary Operator</p><p>(extends BiFunction) ||</p>|<p>Same as</p><p>argument</p><p>should be</p>|<p>BiFunction but || Same as</p><p>and result</p><p>of same</p>|BiFunction.|<p>IntBinaryOperator</p><p>LongBinaryOperator</p><p>DoubleBinaryOperator</p>|
type.


#Using functional interfaces:
A functional interface specifies exactly one abstract method.
Functional interfaces are useful because the signature of the abstract method can describe the signature of a lambda expression. 
The signature of the abstract method of a functional interface is called a function descriptor. 
So in order to use different lambda expressions, you need a set of functional interfaces that can describe common function descriptors. 
There are several functional interfaces already available in the Java API such as Comparable, Runnable, and Callable, ActionaListner.

The Java library designers for Java 8 have helped you by introducing several new functional interfaces inside the java.util.function package. 
We describe the interfaces Predicate, Consumer, and Function.

#Predicate
The java.util.function.Predicate<T> interface defines an abstract method named test that accepts an object of generic type T and returns a boolean. 
It’s exactly the same one that you created earlier, but is available out of the box! You might want to use this interface when you need to represent a boolean expression that uses an object of type T. 

For example, you can define a lambda that accepts String objects, as shown in the following listing.


###Working with a Predicate

@FunctionalInterface
public interface Predicate<T>{
	boolean test(T t);
}
public static <T> List<T> filter(List<T> list, Predicate<T> p) {
	List<T> results = new ArrayList<>();
	for(T s: list){
		if(p.test(s)){
			results.add(s);
		}
	}
	return results;
}

Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();

List<String> nonEmpty = filter(listOfStrings, nonEmptyStringPredicate);

If you look up the Javadoc specification of the Predicate interface, you may notice additional methods such as and and or.

###What about @FunctionalInterface?

If you explore the new Java API, you’ll notice that functional interfaces are annotated with @FunctionalInterface This annotation is used to indicate that the interface is intended to be a functional interface. The compiler will return a meaningful error if you define an interface using the @FunctionalInterface annotation and it isn’t a functional interface. 

For example, an error message could be “Multiple non-overriding abstract methods found in interface Foo” to indicate that more than one abstract method is available. 

Note that the @FunctionalInterface annotation isn’t mandatory, but it’s good practice to use it when an interface is designed for that purpose.

You can think of it like the @Override notation to indicate that a method is overridden.

#Consumer

The java.util.function.Consumer<T> interface defines an abstract method named accept that takes an object of generic type T and returns no result (void). 
You might use this interface when you need to access an object of type T and perform some operations on it. 

For example, you can use it to create a method forEach, which takes a list of Integers and applies an operation on each element of that list. 
In the following listing you use this forEach method combined with a lambda to print all the elements of the list.

###Working with a Consumer

@FunctionalInterface
public interface Consumer<T>{
	void accept(T t);
}

public static <T> void forEach(List<T> list, Consumer<T> c) {
	for(T i: list){
		c.accept(i);
	}
}

forEach(
		Arrays.asList(1,2,3,4,5), 
		(Integer i) -> System.out.println(i)
	   );

#Function
The java.util.function.Function<T, R> interface defines an abstract method named apply that takes an object of generic type T as input and returns an object of generic type R. 

You might use this interface when you need to define a lambda that maps information from an input object to an output (for example, extracting the weight of an apple or mapping a string to its length). 

In the listing that follows we show how you can use it to create a method map to transform a list of Strings into a list of Integers containing the length of each String.

###Working with a Function

@FunctionalInterface
public interface Function<T, R>{
	R apply(T t);
}
public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
	List<R> results = new ArrayList<>();
	for(T s: list){
			results.add(f.apply(s));
	}
	return results;
}

List<Integer> l = map(
						Arrays.asList("lambdas","in","action"), (String s) -> s.length()
					 );
