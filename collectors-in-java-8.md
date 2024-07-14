# Java 8 Collectors Tutorial

Java 8 Collectors tutorial mainly consist of three things – Stream.collect() method, Collector interface and Collectors class. 

collect() method is a terminal operation in Stream interface.

Collector is an interface in java.util.stream package. 

Collectors class, also a member of java.util.stream package, is an utility class containing many static methods which perform some common reduction operations. 

Let’s discuss them one by one.

### 1) Stream.collect() Method
collect() method is a terminal operation in Stream interface.

It is a special case of reduction operation called mutable reduction operation because it returns mutable result container such as List, Set or Map according to supplied Collector.
```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
 
public class CollectorsExamples 
{
    public static void main(String[] args) 
    {
        List<Integer> numbers = Arrays.asList(8, 2, 5, 7, 3, 6);
         
        //collect() method returning List of OddNumbers
         
        List<Integer> oddNumbers = numbers.stream().filter(i -> i%2 != 0).collect(Collectors.toList());
         
        System.out.println(oddNumbers);
         
        //OUTPUT : [5, 7, 3]
    }
}
```
### 2) java.util.stream.Collector Interface

java.util.stream.Collector interface contains four functions that work together to accumulate input elements into a mutable result container and optionally performs a final transformation on the result. 

Those four functions are,

a) Supplier() : A function that creates and returns a new mutable result container.
b) accumulator() : A function that accumulates a value into a mutable result container.
c) combiner() : A function that accepts two partial results and merges them.
d) finisher() : A function that performs final transformation from the intermediate accumulation type to the final result type.

### 3) java.util.stream.Collectors Class

java.util.stream.Collectors class contains static factory methods which perform some common reduction operations such as accumulating elements into Collection, 
finding min, max, average, sum of elements etc. 
All the methods of Collectors class return Collector type which will be supplied to collect() method as an argument.

# Java 8 Collectors

Let’s see Collectors class methods one by one.

In the below coding examples, we will be using following Student class and studentList.

Student Class :

```java
class Student
{
    String name;
     
    int id;
     
    String subject;
     
    double percentage;
     
    public Student(String name, int id, String subject, double percentage) 
    {
        this.name = name;
        this.id = id;
        this.subject = subject;
        this.percentage = percentage;
    }
     
    public String getName() 
    {
        return name;
    }
     
    public int getId() 
    {
        return id;
    }
     
    public String getSubject() 
    {
        return subject;
    }
     
    public double getPercentage() 
    {
        return percentage;
    }
     
    @Override
    public String toString() 
    {
        return name+"-"+id+"-"+subject+"-"+percentage;
    }
}
```
studentList :
```java
List<Student> studentList = new ArrayList<Student>();
         
studentList.add(new Student("Paul", 11, "Economics", 78.9));
studentList.add(new Student("Zevin", 12, "Computer Science", 91.2));
studentList.add(new Student("Harish", 13, "History", 83.7));
studentList.add(new Student("Xiano", 14, "Literature", 71.5));
studentList.add(new Student("Soumya", 15, "Economics", 77.5));
studentList.add(new Student("Asif", 16, "Mathematics", 89.4));
studentList.add(new Student("Nihira", 17, "Computer Science", 84.6));
studentList.add(new Student("Mitshu", 18, "History", 73.5));
studentList.add(new Student("Vijay", 19, "Mathematics", 92.8));
studentList.add(new Student("Harry", 20, "History", 71.9));
```
### 3.1) Collectors.toList() :

It returns a Collector which collects all input elements into a new List.

Example : Collecting top 3 performing students into List
```java
List<Student> top3Students = studentList.stream().sorted(Comparator.comparingDouble(Student::getPercentage).reversed()).limit(3).collect(Collectors.toList());
         
System.out.println(top3Students);
```         
//Output :
         
//[Vijay-19-Mathematics-92.8, Zevin-12-Computer Science-91.2, Asif-16-Mathematics-89.4]

### 3.2) Collectors.toSet() :

It returns a Collector which collects all input elements into a new Set.

Example : Collecting subjects offered into Set.
```java
Set<String> subjects = studentList.stream().map(Student::getSubject).collect(Collectors.toSet());
         
System.out.println(subjects);
```         
//Output :
         
> //[Economics, Literature, Computer Science, Mathematics, History]

### 3.3) Collectors.toMap() :

This method returns a Collector which collects input elements into a Map whose keys and values are the result of applying mapping functions to input elements.

Example : Collecting name and percentage of each student into a Map
```java
Map<String, Double> namePercentageMap = studentList.stream().collect(Collectors.toMap(Student::getName, Student::getPercentage));
         
System.out.println(namePercentageMap);
```         
//Output :
         
//{Asif=89.4, Vijay=92.8, Zevin=91.2, Harry=71.9, Xiano=71.5, Nihira=84.6, Soumya=77.5, Mitshu=73.5, Harish=83.7, Paul=78.9}

### 3.4) Collectors.toCollection() :

This method returns a Collector which collects all input elements into a new Collection.

Example : Collecting first 3 students into LinkedList
```java
LinkedList<Student> studentLinkedList = studentList.stream().limit(3).collect(Collectors.toCollection(LinkedList::new));
         
System.out.println(studentLinkedList);
```         
//Output :
         
//[Paul-11-Economics-78.9, Zevin-12-Computer Science-91.2, Harish-13-History-83.7]

### 3.5) Collectors.joining() :

This method returns a Collector which concatenates input elements separated by the specified delimiter.

Example : Collecting the names of all students joined as a string
```java
String namesJoined = studentList.stream().map(Student::getName).collect(Collectors.joining(", "));
         
System.out.println(namesJoined);
```         
//Output :
         
//Paul, Zevin, Harish, Xiano, Soumya, Asif, Nihira, Mitshu, Vijay, Harry

### 3.6) Collectors.counting() :

It returns a Collector that counts number of input elements.

Example : Counting number of students.
```java
Long studentCount = studentList.stream().collect(Collectors.counting());
         
System.out.println(studentCount);
```         
//Output : 10

### 3.7) Collectors.maxBy() :

This method returns a Collector that collects largest element in a stream according to supplied Comparator.

Example : Collecting highest percentage.
```java
Optional<Double> highPercentage = studentList.stream().map(Student::getPercentage).collect(Collectors.maxBy(Comparator.naturalOrder()));
         
System.out.println(highPercentage);
```         
//Output : Optional[92.8]

### 3.8) Collectors.minBy() :

This method returns a Collector which collects smallest element in a stream according to supplied Comparator.

Example : Collecting lowest percentage.
```java
Optional<Double> lowPercentage = studentList.stream().map(Student::getPercentage).collect(Collectors.minBy(Comparator.naturalOrder()));
         
System.out.println(lowPercentage);
```         
//Output : Optional[71.5]

### 3.9) summingInt(), summingLong(), summingDouble()

These methods returns a Collector which collects sum of all input elements.

Example : Collecting sum of percentages
```java
Double sumOfPercentages = studentList.stream().collect(Collectors.summingDouble(Student::getPercentage));
         
System.out.println(sumOfPercentages);
```         
//Output : 815.0

### 3.10) averagingInt(), averagingLong(), averagingDouble()

These methods return a Collector which collects average of input elements.

Example : Collecting average percentage
```java
Double averagePercentage = studentList.stream().collect(Collectors.averagingDouble(Student::getPercentage));
         
System.out.println(averagePercentage);
```         
//Output : 81.5

### 3.11) summarizingInt(), summarizingLong(), summarizingDouble()

These methods return a special class called Int/Long/ DoubleSummaryStatistics which contain statistical information like sum, max, min, average etc of input elements.

Example : Extracting highest, lowest and average of percentage of students
```java
DoubleSummaryStatistics studentStats = studentList.stream().collect(Collectors.summarizingDouble(Student::getPercentage));
         
System.out.println("Highest Percentage : "+studentStats.getMax());
         
System.out.println("Lowest Percentage : "+studentStats.getMin());
         
System.out.println("Average Percentage : "+studentStats.getAverage());
```         
//Output :
         
//Highest Percentage : 92.8
//Lowest Percentage : 71.5
//Average Percentage : 81.5

### 3.12) Collectors.groupingBy() :

This method groups the input elements according supplied classifier and returns the results in a Map.

Example : Grouping the students by subject
```java
Map<String, List<Student>> studentsGroupedBySubject = studentList.stream().collect(Collectors.groupingBy(Student::getSubject));
         
System.out.println(studentsGroupedBySubject);
```         
//Output :
         
//{Economics=[Paul-11-Economics-78.9, Soumya-15-Economics-77.5], 
// Literature=[Xiano-14-Literature-71.5], 
// Computer Science=[Zevin-12-Computer Science-91.2, Nihira-17-Computer Science-84.6], 
// Mathematics=[Asif-16-Mathematics-89.4, Vijay-19-Mathematics-92.8], 
// History=[Harish-13-History-83.7, Mitshu-18-History-73.5, Harry-20-History-71.9]}

### 3.13) Collectors.partitioningBy() :

This method partitions the input elements according to supplied Predicate and returns a Map<Boolean, List<T>>. Under the true key, you will find elements which match given Predicate and under the false key, you will find the elements which doesn’t match given Predicate.

Example : Partitioning the students who got above 80.0% from who don’t.
```java
Map<Boolean, List<Student>> studentspartionedByPercentage = studentList.stream().collect(Collectors.partitioningBy(student -> student.getPercentage() > 80.0));
         
System.out.println(studentspartionedByPercentage);
```         
//Output :
         
// {false=[Paul-11-Economics-78.9, Xiano-14-Literature-71.5, Soumya-15-Economics-77.5, Mitshu-18-History-73.5, Harry-20-History-71.9], 
//  true=[Zevin-12-Computer Science-91.2, Harish-13-History-83.7, Asif-16-Mathematics-89.4, Nihira-17-Computer Science-84.6, Vijay-19-Mathematics-92.8]}

### 3.14) Collectors.collectingAndThen() :

This is a special method which lets you to perform one more action on the result after collecting the result.

Example : Collecting first three students into List and making it unmodifiable
```java
List<Student> first3Students = studentList.stream().limit(3).collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
         
System.out.println(first3Students);
```         
//Output :
         
//[Paul-11-Economics-78.9, Zevin-12-Computer Science-91.2, Harish-13-History-83.7]
