# Java Exercises OOP

https://www.w3resource.com/java-exercises/oop/index.php
Object-oriented  programming: Object-oriented  programming (OOP) is a programming paradigm based on the concept of "objects", which can contain data and code. The data is in the form of fields (often known as attributes or properties), and the code is in the form of procedures (often known as methods).

A Java class file is a file (with the .class filename extension) containing Java bytecode that can be executed on the  Java Virtual Machine (JVM JVM). A Java class file is usually produced by a Java  compiler from Java programming language source files (.java files) containing Java classes (alternatively, other JVM languages can also be used to create class files).
If a source file has more than one class, each class is  compiled into a separate class file.



### 1. Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.

Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.

Sample Solution:

Java Code:

 // Define the Person class
public class Person {
    // Declare a private variable to store the name of the person
    private String name;
    // Declare a private variable to store the age of the person
    private int age;

    // Constructor for the Person class that initializes the name and age variables
    public Person(String name, int age) {
        // Set the name variable to the provided name parameter
        this.name = name;
        // Set the age variable to the provided age parameter
        this.age = age;
    }

    // Method to retrieve the name of the person
    public String getName() {
        // Return the value of the name variable
        return name;
    }

    // Method to retrieve the age of the person
    public int getAge() {
        // Return the value of the age variable
        return age;
    }

    // Method to set the name of the person
    public void setName(String name) {
        // Set the name variable to the provided name parameter
        this.name = name;
    }

    // Method to set the age of the person
    public void setAge(int age) {
        // Set the age variable to the provided age parameter
        this.age = age;
    }
}

The above class has two private attributes: name and age, and a constructor that initializes these attributes with the values passed as arguments. It also has a getter method to access the attributes.

// Define the Main class
public class Main {
    // Define the main method which is the entry point of the program
    public static void main(String[] args) {
        // Create an instance of the Person class with the name "Ean Craig" and age 11
        Person person1 = new Person("Ean Craig", 11);
        // Create another instance of the Person class with the name "Evan Ross" and age 12
        Person person2 = new Person("Evan Ross", 12);

        // Print the name and age of person1 to the console
        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
        // Print the name and age of person2 to the console
        System.out.println(person2.getName() + " is " + person2.getAge() + " years old.\n");

        // Modify the age of person1 using the setter methods
        person1.setAge(14);
        // Modify the name and age of person2 using the setter methods
        person2.setName("Lewis Jordan");
        person2.setAge(12);
        System.out.println("Set new age and name:");
        // Print the updated name and age of person1 to the console
        System.out.println(person1.getName() + " is now " + person1.getAge() + " years old.");
        // Print the updated name and age of person2 to the console
        System.out.println(person2.getName() + " is now " + person2.getAge() + " years old.");
    }
} 
In the above example, we create two instances of the "Person" class, set their attributes with the constructor, and print their name and age using the getter methods. We also modify the attributes using the setter methods and print the updated values.

Sample Output:

Ean Craig is 11 years old.
Evan Ross is 12 years old.

Set new age and name:
Ean Craig is now 14 years old.
Lewis Jordan is now 12 years old.

### 2. Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.

Write a Java program to create a class called " Dog" with a name and breed attribute. Create two instances of the " Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.

Sample Solution:

Java Code:

// Define the Dog class
public class Dog {
    // Declare a private variable to store the name of the dog
    private String name;
    // Declare a private variable to store the breed of the dog
    private String breed;

    // Constructor for the Dog class that initializes the name and breed variables
    public Dog(String name, String breed) {
        // Set the name variable to the provided name parameter
        this.name = name;
        // Set the breed variable to the provided breed parameter
        this.breed = breed;
    }

    // Method to retrieve the name of the dog
    public String getName() {
        // Return the value of the name variable
        return name;
    }

    // Method to set the name of the dog
    public void setName(String name) {
        // Set the name variable to the provided name parameter
        this.name = name;
    }

    // Method to retrieve the breed of the dog
    public String getBreed() {
        // Return the value of the breed variable
        return breed;
    }

    // Method to set the breed of the dog
    public void setBreed(String breed) {
        // Set the breed variable to the provided breed parameter
        this.breed = breed;
    }
} 

The above class has two private attributes: ‘name’ and ‘breed’, and a constructor that initializes these attributes with the values passed as arguments. It also has getter and setter methods to access and modify these attributes.

// Define the Main class
public class Main {
    // Define the main method which is the entry point of the program
    public static void main(String[] args) {
        // Create an instance of the Dog class with the name "Buddy" and breed "Golden Retriever"
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        // Create another instance of the Dog class with the name "Charlie" and breed "Bulldog"
        Dog dog2 = new Dog("Charlie", "Bulldog");

        // Print the name and breed of dog1 to the console
        System.out.println(dog1.getName() + " is a " + dog1.getBreed() + ".");
        // Print the name and breed of dog2 to the console
        System.out.println(dog2.getName() + " is a " + dog2.getBreed() + ".");

        // Print a message indicating that the breed of dog1 and the name of dog2 will be changed
        System.out.println("\nSet the new Breed of dog1 and new name of dog2:");
        // Change the breed of dog1 to "Labrador Retriever"
        dog1.setBreed("Labrador Retriever");
        // Change the name of dog2 to "Daisy"
        dog2.setName("Daisy");

        // Print the updated name and breed of dog1 to the console
        System.out.println(dog1.getName() + " is now a " + dog1.getBreed() + ".");
        // Print the updated name and breed of dog2 to the console
        System.out.println(dog2.getName() + " is now a " + dog2.getBreed() + ".");
    }
} 
In the above example code, we create two instances of the " Dog" class, set their attributes through the constructor, and print their name and breed using the getter methods. We also modify the attributes using the setter methods and print the updated values.

Sample Output:

Buddy is a Golden Retriever.
Charlie is a Bulldog.

Set the new Breed of dog1 and new name of dog2:
Buddy is now a Labrador Retriever.
Daisy is now a Bulldog.

### 3. Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.

Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.

Sample Solution:

Java Code:

// Define the Rectangle class
public class Rectangle {
    // Declare a private variable to store the width of the rectangle
    private double width;
    // Declare a private variable to store the height of the rectangle
    private double height;

    // Constructor for the Rectangle class that initializes the width and height variables
    public Rectangle(double width, double height) {
        // Set the width variable to the provided width parameter
        this.width = width;
        // Set the height variable to the provided height parameter
        this.height = height;
    }

    // Method to retrieve the width of the rectangle
    public double getWidth() {
        // Return the value of the width variable
        return width;
    }

    // Method to set the width of the rectangle
    public void setWidth(double width) {
        // Set the width variable to the provided width parameter
        this.width = width;
    }

    // Method to retrieve the height of the rectangle
    public double getHeight() {
        // Return the value of the height variable
        return height;
    }

    // Method to set the height of the rectangle
    public void setHeight(double height) {
        // Set the height variable to the provided height parameter
        this.height = height;
    }

    // Method to calculate and return the area of the rectangle
    public double getArea() {
        // Calculate the area by multiplying width and height, and return the result
        return width * height;
    }

    // Method to calculate and return the perimeter of the rectangle
    public double getPerimeter() {
        // Calculate the perimeter by adding width and height, multiplying by 2, and return the result
        return 2 * (width + height);
    }
}

The above class has two private attributes: 'width' and 'height', a constructor that initializes these attributes with the values passed as arguments, and getter and setter methods to access and modify these attributes. It also has two methods 'getArea()' and 'getPerimeter() ' to calculate the area and perimeter of the rectangle.

// Define the Main class
public class Main {
    // Define the main method which is the entry point of the program
    public static void main(String[] args) {
        // Create an instance of the Rectangle class with the width 7 and height 12
        Rectangle rectangle = new Rectangle(7, 12);

        // Print the area of the rectangle to the console
        System.out.println("The area of the rectangle is " + rectangle.getArea());
        // Print the perimeter of the rectangle to the console
        System.out.println("The perimeter of the rectangle is " + rectangle.getPerimeter());

        // Set a new width for the rectangle
        rectangle.setWidth(6);
        // Set a new height for the rectangle
        rectangle.setHeight(12);

        // Print the updated area of the rectangle to the console
        System.out.println("\nThe area of the rectangle is now " + rectangle.getArea());
        // Print the updated perimeter of the rectangle to the console
        System.out.println("The perimeter of the rectangle is now " + rectangle.getPerimeter());
    }
} 
In the Main() function we create an instance of the "Rectangle" class with a width of 7 and a height of 12, and call its methods to calculate the area and perimeter. We then modify the width and height using the setter methods and print the updated rectangle area and perimeter.

Sample Output:

The area of the rectangle is 84.0
The perimeter of the rectangle is 38.0

The area of the rectangle is now 72.0
The perimeter of the rectangle is now 36.0

### 4. Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. Calculate the area and circumference of the circle.

Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. Calculate the area and circumference of the circle.

Sample Solution:

Java Code:

// Define the Circle class
public class Circle {
    // Declare a private variable to store the radius of the circle
    private double radius;

    // Constructor for the Circle class that initializes the radius variable
    public Circle(double radius) {
        // Set the radius variable to the provided radius parameter
        this.radius = radius;
    }

    // Method to retrieve the radius of the circle
    public double getRadius() {
        // Return the value of the radius variable
        return radius;
    }

    // Method to set the radius of the circle
    public void setRadius(double radius) {
        // Set the radius variable to the provided radius parameter
        this.radius = radius;
    }

    // Method to calculate and return the area of the circle
    public double getArea() {
        // Calculate the area using the formula π * radius^2 and return the result
        return Math.PI * radius * radius;
    }

    // Method to calculate and return the circumference of the circle
    public double getCircumference() {
        // Calculate the circumference using the formula 2 * π * radius and return the result
        return 2 * Math.PI * radius;
    }
} 

The above "Circle" class has a private attribute 'radius', a constructor that initializes this attribute with the value passed as an argument, and getter and setter methods to access and modify this attribute. It also calculates circle area and circumference using methods.

// Define the Main class
public class Main {
    // Define the main method which is the entry point of the program
    public static void main(String[] args) {
        // Declare an integer variable r and initialize it with the value 5
        int r = 5;
        // Create an instance of the Circle class with the radius r
        Circle circle = new Circle(r);
        // Print the radius of the circle to the console
        System.out.println("Radius of the circle is " + r);
        // Print the area of the circle to the console
        System.out.println("The area of the circle is " + circle.getArea());
        // Print the circumference of the circle to the console
        System.out.println("The circumference of the circle is " + circle.getCircumference());
        // Update the radius variable r to 8
        r = 8;
        // Set the radius of the circle to the new value of r
        circle.setRadius(r);
        // Print the updated radius of the circle to the console
        System.out.println("\nRadius of the circle is " + r);
        // Print the updated area of the circle to the console
        System.out.println("The area of the circle is now " + circle.getArea());
        // Print the updated circumference of the circle to the console
        System.out.println("The circumference of the circle is now " + circle.getCircumference());
    }
}
In the above main() function, we create an instance of the "Circle" class with a radius of 5, and call its methods to calculate the area and circumference. We then modify the radius using the setter method and print the updated area and circumference.

Sample Output:

Radius of the circle is 5
The area of the circle is 78.53981633974483
The circumference of the circle is 31.41592653589793

Radius of the circle is 8
The area of the circle is now 201.06192982974676
The circumference of the circle is now 50.26548245743669

### 5. Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection.

Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection.

Sample Solution:

Java Code:

//Book.java
// Import the ArrayList class from the java.util package
import java.util.ArrayList;

// Define the Book class
public class Book {
    // Declare a private variable to store the title of the book
    private String title;
    // Declare a private variable to store the author of the book
    private String author;
    // Declare a private variable to store the ISBN of the book
    private String ISBN;
    // Declare a static ArrayList to store the collection of Book objects
    private static ArrayList<Book> bookCollection = new ArrayList<Book>();

    // Constructor for the Book class that initializes the title, author, and ISBN variables
    public Book(String title, String author, String ISBN) {
        // Set the title variable to the provided title parameter
        this.title = title;
        // Set the author variable to the provided author parameter
        this.author = author;
        // Set the ISBN variable to the provided ISBN parameter
        this.ISBN = ISBN;
    }

    // Method to retrieve the title of the book
    public String get_Title() {
        // Return the value of the title variable
        return title;
    }

    // Method to set the title of the book
    public void set_Title(String title) {
        // Set the title variable to the provided title parameter
        this.title = title;
    }

    // Method to retrieve the author of the book
    public String get_Author() {
        // Return the value of the author variable
        return author;
    }

    // Method to set the author of the book
    public void set_Author(String author) {
        // Set the author variable to the provided author parameter
        this.author = author;
    }

    // Method to retrieve the ISBN of the book
    public String get_ISBN() {
        // Return the value of the ISBN variable
        return ISBN;
    }

    // Method to set the ISBN of the book
    public void set_ISBN(String ISBN) {
        // Set the ISBN variable to the provided ISBN parameter
        this.ISBN = ISBN;
    }

    // Static method to add a book to the book collection
    public static void add_Book(Book book) {
        // Add the provided book object to the bookCollection ArrayList
        bookCollection.add(book);
    }

    // Static method to remove a book from the book collection
    public static void remove_Book(Book book) {
        // Remove the provided book object from the bookCollection ArrayList
        bookCollection.remove(book);
    }

    // Static method to retrieve the entire book collection
    public static ArrayList<Book> get_BookCollection() {
        // Return the bookCollection ArrayList
        return bookCollection;
    }
}

The above class has three private attributes: title, author and ISBN. It has a constructor that initializes these attributes with the values passed as arguments, and getter and setter methods to access and modify these attributes. It also has static methods to add and remove books from a collection, and a static method to get the book collection.

//Main.java
// Import the ArrayList class from the java.util package
import java.util.ArrayList;

// Define the Main class
public class Main {
    // Define the main method which is the entry point of the program
    public static void main(String[] args) {
        // Create an instance of the Book class with the title "The C Programming Language", author "Dennis Ritchie, Brian Kernighan", and ISBN "9780131101630"
        Book book1 = new Book("The C Programming Language", "Dennis Ritchie, Brian Kernighan", "9780131101630");
        // Create another instance of the Book class with the title "An Introduction to Python", author "Guido van Rossum", and ISBN "9355423489"
        Book book2 = new Book("An Introduction to Python", "Guido van Rossum", "9355423489");
        
        // Add book1 to the book collection
        Book.add_Book(book1);
        // Add book2 to the book collection
        Book.add_Book(book2);
        
        // Retrieve the book collection and store it in an ArrayList named bookCollection
        ArrayList<Book> bookCollection = Book.get_BookCollection();
        
        // Print a heading for the list of books
        System.out.println("List of books:");
        
        // Iterate over each book in the bookCollection
        for (Book book : bookCollection) {
            // Print the title, author, and ISBN of each book
            System.out.println(book.get_Title() + " by " + book.get_Author() + ", ISBN: " + book.get_ISBN());
        }
        
        // Remove book1 from the book collection
        Book.remove_Book(book1);
        
        // Print a message indicating that book1 has been removed
        System.out.println("\nAfter removing " + book1.get_Title() + ":");
        
        // Print a heading for the updated list of books
        System.out.println("List of books:");
        
        // Iterate over each book in the bookCollection
        for (Book book : bookCollection) {
            // Print the title, author, and ISBN of each book
            System.out.println(book.get_Title() + " by " + book.get_Author() + ", ISBN: " + book.get_ISBN());
        }
    }
}
In this example code, we create two instances of the "Book" class and add them to the collection with the ‘addBook’ method. We then print the title, author, and ISBN of each book in the collection using a for loop. We also remove book1 from the collection using the ‘removeBook’ method and print the updated collection.

Sample Output:

List of books:
The C Programming Language by Dennis Ritchie, Brian Kernighan, ISBN: 9780131101630
An Introduction to Python by Guido van Rossum, ISBN: 9355423489

After removing The C Programming Language:
List of books:
An Introduction to Python by Guido van Rossum, ISBN: 9355423489

### 6. Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.

Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.

Sample Solution:

Java Code:

//Employee.java
// Define the Employee class
public class Employee {
    // Declare a private variable to store the name of the employee
    private String name;
    // Declare a private variable to store the job title of the employee
    private String jobTitle;
    // Declare a private variable to store the salary of the employee
    private double salary;

    // Constructor for the Employee class that initializes the name, job title, and salary variables
    public Employee(String name, String jobTitle, double salary) {
        // Set the name variable to the provided name parameter
        this.name = name;
        // Set the jobTitle variable to the provided jobTitle parameter
        this.jobTitle = jobTitle;
        // Set the salary variable to the provided salary parameter
        this.salary = salary;
    }

    // Method to retrieve the name of the employee
    public String getName() {
        // Return the value of the name variable
        return name;
    }

    // Method to set the name of the employee
    public void setName(String name) {
        // Set the name variable to the provided name parameter
        this.name = name;
    }

    // Method to retrieve the job title of the employee
    public String getJobTitle() {
        // Return the value of the jobTitle variable
        return jobTitle;
    }

    // Method to set the job title of the employee
    public void setJobTitle(String jobTitle) {
        // Set the jobTitle variable to the provided jobTitle parameter
        this.jobTitle = jobTitle;
    }

    // Method to retrieve the salary of the employee
    public double getSalary() {
        // Return the value of the salary variable
        return salary;
    }

    // Method to set the salary of the employee
    public void setSalary(double salary) {
        // Set the salary variable to the provided salary parameter
        this.salary = salary;
    }

    // Method to raise the salary of the employee by a given percentage
    public void raiseSalary(double percentage) {
        // Calculate the new salary by increasing the current salary by the given percentage
        salary = salary + salary * percentage / 100;
    }

    // Method to print the details of the employee
    public void printEmployeeDetails() {
        // Print the name of the employee
        System.out.println("Name: " + name);
        // Print the job title of the employee
        System.out.println("Job Title: " + jobTitle);
        // Print the salary of the employee
        System.out.println("Salary: " + salary);
    }
}

The above class has three private attributes: name, jobTitle, and salary. It has a constructor that initializes these attributes with the values passed as arguments. It also has getter and setter methods to access and modify these attributes. In addition, it provides methods for raising salaries by a certain percentage and printing employee information.

// Main.java
// Define the Main class
public class Main {
    // Define the main method which is the entry point of the program
    public static void main(String[] args) {

        // Create an instance of the Employee class with the name "Franziska Waltraud", job title "HR Manager", and salary 40000
        Employee employee1 = new Employee("Franziska Waltraud", "HR Manager", 40000);
        // Create another instance of the Employee class with the name "Hubertus Andrea", job title "Software Engineer", and salary 60000
        Employee employee2 = new Employee("Hubertus Andrea", "Software Engineer", 60000);

        // Print a heading for the employee details section
        System.out.println("\nEmployee Details:");
        // Print the details of employee1
        employee1.printEmployeeDetails();
        // Print the details of employee2
        employee2.printEmployeeDetails();

        // Raise the salary of employee1 by 8%
        employee1.raiseSalary(8);
        // Raise the salary of employee2 by 12%
        employee2.raiseSalary(12);

        // Print a heading indicating that the salaries have been raised
        System.out.println("\nAfter raising salary:");
        // Print a heading for the salary raise details of employee1
        System.out.println("\n8% for 'Franziska Waltraud':");
        // Print the updated details of employee1
        employee1.printEmployeeDetails();
        // Print a heading for the salary raise details of employee2
        System.out.println("\n12% for 'Hubertus Andrea':");
        // Print the updated details of employee2
        employee2.printEmployeeDetails();
    }
}
In the above example code, we create two instances of the "Employee" class and print their details using the ’printEmployeeDetails()’ method. We then raise their salary using the ‘raiseSalary()’ method and print the updated details of the employees.

Sample Output:

Employee Details:
Name: Franziska Waltraud
Job Title: HR Manager
Salary: 40000.0
Name: Hubertus Andrea
Job Title: Software Engineer
Salary: 60000.0

After raising salary:

8% for 'Franziska Waltraud':
Name: Franziska Waltraud
Job Title: HR Manager
Salary: 43200.0

12% for 'Hubertus Andrea':
Name: Hubertus Andrea
Job Title: Software Engineer
Salary: 67200.0

### 7. Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove accounts, and to deposit and withdraw money. Also define a class called "Account" to maintain account details of a particular customer.

Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove accounts, and to deposit and withdraw money. Also define a class called "Account" to maintain account details of a particular customer.

Sample Solution:

Java Code:

// Account.java
// Define the Account class
public class Account {
    // Declare a private variable to store the name of the account holder
    private String name;
    // Declare a private variable to store the account number
    private String accountNumber;
    // Declare a private variable to store the balance of the account
    private double balance;

    // Constructor for the Account class that initializes the name, account number, and balance variables
    public Account(String name, String accountNumber, double balance) {
        // Set the name variable to the provided name parameter
        this.name = name;
        // Set the accountNumber variable to the provided accountNumber parameter
        this.accountNumber = accountNumber;
        // Set the balance variable to the provided balance parameter
        this.balance = balance;
    }

    // Method to retrieve the name of the account holder
    public String getName() {
        // Return the value of the name variable
        return name;
    }

    // Method to set the name of the account holder
    public void setName(String name) {
        // Set the name variable to the provided name parameter
        this.name = name;
    }

    // Method to retrieve the account number
    public String getAccountNumber() {
        // Return the value of the accountNumber variable
        return accountNumber;
    }

    // Method to set the account number
    public void setAccountNumber(String accountNumber) {
        // Set the accountNumber variable to the provided accountNumber parameter
        this.accountNumber = accountNumber;
    }

    // Method to retrieve the balance of the account
    public double getBalance() {
        // Return the value of the balance variable
        return balance;
    }

    // Method to set the balance of the account
    public void setBalance(double balance) {
        // Set the balance variable to the provided balance parameter
        this.balance = balance;
    }

    // Method to deposit a specified amount into the account
    public void deposit(double amount) {
        // Increase the balance by the specified amount
        balance += amount;
    }

    // Method to withdraw a specified amount from the account
    public void withdraw(double amount) {
        // Decrease the balance by the specified amount
        balance -= amount;
    }

    // Method to retrieve the account information
    public String getAccountInfo() {
        // Return a string containing the name, account number, and balance
        return "Name: " + name + ", Account Number: " + accountNumber + ", Balance: " + balance;
    }
}

The above class has three private attributes: name, accountNumber and balance. There are several methods to deposit, withdraw, maintain balance in an individual account, print account details and more.

// Bank.java
// Import the ArrayList class from the Java Collections Framework
import java.util.ArrayList;

// Define the Bank class
public class Bank {

  // Declare an ArrayList to store Account objects
  private ArrayList<Account> accounts;

  // Constructor for the Bank class
  public Bank() {
    // Initialize the accounts ArrayList
    accounts = new ArrayList<Account>();
  }

  // Method to add an Account to the accounts list
  public void addAccount(Account account) {
    // Add the given account to the accounts ArrayList
    accounts.add(account);
  }

  // Method to remove an Account from the accounts list
  public void removeAccount(Account account) {
    // Remove the given account from the accounts ArrayList
    accounts.remove(account);
  }

  // Method to deposit money into a specific Account
  public void depositMoney(Account account, double amount) {
    // Call the deposit method on the given account with the specified amount
    account.deposit(amount);
  }

  // Method to withdraw money from a specific Account
  public void withdrawMoney(Account account, double amount) {
    // Call the withdraw method on the given account with the specified amount
    account.withdraw(amount);
  }

  // Method to get the list of all accounts
  public ArrayList<Account> getAccounts() {
    // Return the accounts ArrayList
    return accounts;
  }
} 
The above class has a private accounts attribute, a constructor that initializes this attribute as an empty array list. It also has methods to add and remove accounts from the collection, and to deposit and withdraw money from an account.

// Main.java
// Import the ArrayList class from the Java Collections Framework
import java.util.ArrayList;

// Define the Main class
public class Main {
  
  // Main method, the entry point of the Java application
  public static void main(String[] args) {
    
    // Create a new Bank object
    Bank bank = new Bank();

    // Create three new Account objects with initial details
    Account account1 = new Account("Peter Irmgard", "C0011", 5000);
    Account account2 = new Account("Katja Ruedi", "C0121", 4500);
    Account account3 = new Account("Marcella Gebhard", "C0222", 20000);

    // Add the three accounts to the bank
    bank.addAccount(account1);
    bank.addAccount(account2);
    bank.addAccount(account3);

    // Retrieve the list of accounts from the bank
    ArrayList<Account> accounts = bank.getAccounts();

    // Loop through each account in the accounts list
    for (Account account: accounts) {
      // Print the account information for each account
      System.out.println(account.getAccountInfo());
    }

    // Print a message indicating the start of a deposit transaction
    System.out.println("\nAfter depositing 1000 into account1:");
    // Deposit 1000 into account1
    bank.depositMoney(account1, 1000);
    // Print the updated account information for account1
    System.out.println(account1.getAccountInfo());

    // Print a message indicating no transaction for account2
    System.out.println("No transaction in account2:");
    // Print the account information for account2
    System.out.println(account2.getAccountInfo());

    // Print a message indicating the start of a withdrawal transaction
    System.out.println("After withdrawing 5000 from account3:");
    // Withdraw 5000 from account3
    bank.withdrawMoney(account3, 5000);
    // Print the updated account information for account3
    System.out.println(account3.getAccountInfo());
  }
} 
In the above example code, we create an instance of the "Bank" class and three instances of the "Account" class, and add them to the collection through the ‘addAccount’ method. We then print the account information for each account in the collection using a for loop. We also deposit 1000 into account1 using the ‘depositMoney’ method, and withdraw 5000 from account3 using the ‘withdrawMoney’ method. We also print the updated account information. Account2 has no transaction.

Sample Output:

Name: Peter Irmgard, Account Number: C0011, Balance: 5000.0
Name: Katja Ruedi, Account Number: C0121, Balance: 4500.0
Name: Marcella Gebhard, Account Number: C0222, Balance: 20000.0

After depositing 1000 into account1:
Name: Peter Irmgard, Account Number: C0011, Balance: 6000.0
No transaction in account2:
Name: Katja Ruedi, Account Number: C0121, Balance: 4500.0
After withdrawing 5000 from account3:
Name: Marcella Gebhard, Account Number: C0222, Balance: 15000.0

### 8. Write a Java program to create class called "TrafficLight" with attributes for color and duration, and methods to change the color and check for red or green.

Write a Java program to create class called "TrafficLight" with attributes for color and duration, and methods to change the color and check for red or green.

Sample Solution:

Java Code:

//TrafficLight.java
// Define the TrafficLight class
public class TrafficLight {
  
  // Declare a private variable to store the color of the traffic light
  private String color;
  
  // Declare a private variable to store the duration of the traffic light in seconds
  private int duration;

  // Constructor for the TrafficLight class
  public TrafficLight(String color, int duration) {
    // Initialize the color of the traffic light
    this.color = color;
    
    // Initialize the duration of the traffic light
    this.duration = duration;
  }

  // Method to change the color of the traffic light
  public void changeColor(String newColor) {
    // Update the color variable to the new color
    color = newColor;
  }

  // Method to check if the traffic light is red
  public boolean isRed() {
    // Return true if the color is red, otherwise return false
    return color.equals("red");
  }

  // Method to check if the traffic light is green
  public boolean isGreen() {
    // Return true if the color is green, otherwise return false
    return color.equals("green");
  }

  // Method to get the duration of the traffic light
  public int getDuration() {
    // Return the duration value
    return duration;
  }

  // Method to set the duration of the traffic light
  public void setDuration(int duration) {
    // Update the duration variable to the new value
    this.duration = duration;
  }
}

The above class has two private attributes: ‘color’ and ‘duration’. A constructor initializes these attributes with the values passed as arguments, and getter and setter methods to access and modify these attributes. It also has methods to change the ‘color’, and to check if the  light is red or green.

//Main.java
// Define the Main class
public class Main {
  
  // Main method, the entry point of the Java application
  public static void main(String[] args) {
    
    // Create a new TrafficLight object with initial color "red" and duration 30 seconds
    TrafficLight light = new TrafficLight("red", 30);

    // Print whether the traffic light is red
    System.out.println("The light is red: " + light.isRed());
    
    // Print whether the traffic light is green
    System.out.println("The light is green: " + light.isGreen());

    // Change the color of the traffic light to "green"
    light.changeColor("green");

    // Print whether the traffic light is now green
    System.out.println("The light is now green: " + light.isGreen());
    
    // Print the duration of the traffic light
    System.out.println("The light duration is: " + light.getDuration());
    
    // Set a new duration for the traffic light to 20 seconds
    light.setDuration(20);
    
    // Print the updated duration of the traffic light
    System.out.println("The light duration is now: " + light.getDuration());
  }
}
In the above example code, we create an instance of the "TrafficLight" class with the color "red" and a duration of 30 seconds. We then print whether the  light is red or green using the “isRed” and “isGreen” methods. We change the  light color to "green" through the “changeColor” method, and display whether the light is now green. We also print the light duration using the “getDuration” method, and change the duration to 60 seconds with the “setDuration” method.

Sample Output:

The light is red: true
The light is green: false
The light is now green: true
The light duration is: 30
The light duration is now: 20

### 9. Write a Java program to create a class called "Employee" with a name, salary, and hire date attributes, and a method to calculate years of service.

Write a Java program to create a class called "Employee" with a name, salary, and hire date attributes, and a method to calculate years of service.

Sample Solution:

Java Code:

// Employee.java
// Import the LocalDate class from the java.time package
import java.time.LocalDate;

// Import the Period class from the java.time package
import java.time.Period;

// Define the Employee class
public class Employee {
  
  // Declare a private variable to store the name of the employee
  private String name;
  
  // Declare a private variable to store the salary of the employee
  private double salary;
  
  // Declare a private variable to store the hire date of the employee
  private LocalDate hireDate;

  // Constructor for the Employee class
  public Employee(String name, double salary, LocalDate hireDate) {
    // Initialize the name of the employee
    this.name = name;
    
    // Initialize the salary of the employee
    this.salary = salary;
    
    // Initialize the hire date of the employee
    this.hireDate = hireDate;
  }

  // Method to get the name of the employee
  public String getName() {
    // Return the name of the employee
    return name;
  }

  // Method to set the name of the employee
  public void setName(String name) {
    // Update the name variable to the new value
    this.name = name;
  }

  // Method to get the salary of the employee
  public double getSalary() {
    // Return the salary of the employee
    return salary;
  }

  // Method to set the salary of the employee
  public void setSalary(double salary) {
    // Update the salary variable to the new value
    this.salary = salary;
  }

  // Method to get the hire date of the employee
  public LocalDate getHireDate() {
    // Return the hire date of the employee
    return hireDate;
  }

  // Method to set the hire date of the employee
  public void setHireDate(LocalDate hireDate) {
    // Update the hire date variable to the new value
    this.hireDate = hireDate;
  }

  // Method to calculate the years of service of the employee
  public int getYearsOfService() {
    // Calculate the period between the hire date and the current date, and return the number of years
    return Period.between(hireDate, LocalDate.now()).getYears();
  }

  // Method to print the details of the employee
  public void printEmployeeDetails() {
    // Print the name of the employee
    System.out.println("\nName: " + name);
    
    // Print the salary of the employee
    System.out.println("Salary: " + salary);
    
    // Print the hire date of the employee
    System.out.println("Hire Date: " + hireDate);
  }
}

In the above Employee class, there are three private attributes: name, salary, and hireDate, a constructor that initializes these attributes with the values passed as arguments, and getter and setter methods to access and modify these attributes.


There is a method “getYearsOfService()” to calculate years of service between the hire date and the current date, and returns the number of years as an integer value.

// Main.java
// Import the LocalDate class from the java.time package
import java.time.LocalDate;

// Define the Main class
public class Main {
  
  // Main method, the entry point of the Java application
  public static void main(String[] args) {
    
    // Create a new Employee object named employee1 with name "Roberta Petrus", salary 50000, and hire date "2021-04-01"
    Employee employee1 = new Employee("Roberta Petrus", 50000, LocalDate.parse("2021-04-01"));
    
    // Create a new Employee object named employee2 with name "Loyd Blair", salary 70000, and hire date "2015-04-01"
    Employee employee2 = new Employee("Loyd Blair", 70000, LocalDate.parse("2015-04-01"));
    
    // Create a new Employee object named employee3 with name "Magdalena Artemon", salary 50000, and hire date "2011-01-15"
    Employee employee3 = new Employee("Magdalena Artemon", 50000, LocalDate.parse("2011-01-15"));

    // Print the details of employee1
    employee1.printEmployeeDetails();
    
    // Print the years of service of employee1
    System.out.println("Years of Service: " + employee1.getYearsOfService());
    
    // Print the details of employee2
    employee2.printEmployeeDetails();
    
    // Print the years of service of employee2
    System.out.println("Years of Service: " + employee2.getYearsOfService());
    
    // Print the details of employee3
    employee3.printEmployeeDetails();
    
    // Print the years of service of employee3
    System.out.println("Years of Service: " + employee3.getYearsOfService());
  }
}
In the above main() function, we create three instances of the "Employee" class, and print their name, salary, hire date, and years of service using the appropriate methods.

Sample Output:

Name: Roberta Petrus
Salary: 50000.0
HireDate: 2021-04-01
Years of Service: 2

Name: Loyd Blair
Salary: 70000.0
HireDate: 2015-04-01
Years of Service: 8

Name: Magdalena Artemon
Salary: 50000.0
HireDate: 2011-01-15
Years of Service: 12

### 10. Write a Java program to create a class called "Student" with a name, grade, and courses attributes, and methods to add and remove courses.

Write a Java program to create a class called "Student" with a name, grade, and courses attributes, and methods to add and remove courses.

Sample Solution:

Java Code:

 // Student.java
// Import the ArrayList class from the Java Collections Framework
import java.util.ArrayList;

// Define the Student class
public class Student {
  
  // Declare a private variable to store the name of the student
  private String name;
  
  // Declare a private variable to store the grade of the student
  private int grade;
  
  // Declare a private ArrayList to store the courses of the student
  private ArrayList courses;

  // Constructor for the Student class
  public Student(String name, int grade) {
    // Initialize the name of the student
    this.name = name;
    
    // Initialize the grade of the student
    this.grade = grade;
    
    // Initialize the courses ArrayList
    this.courses = new ArrayList();
  }

  // Method to get the name of the student
  public String getName() {
    // Return the name of the student
    return name;
  }

  // Method to get the grade of the student
  public int getGrade() {
    // Return the grade of the student
    return grade;
  }

  // Method to get the courses of the student
  public ArrayList getCourses() {
    // Return the courses ArrayList
    return courses;
  }

  // Method to add a course to the student's course list
  public void addCourse(String course) {
    // Add the given course to the courses ArrayList
    courses.add(course);
  }

  // Method to remove a course from the student's course list
  public void removeCourse(String course) {
    // Remove the given course from the courses ArrayList
    courses.remove(course);
  }

  // Method to print the details of the student
  public void printStudentDetails() {
    // Print the name of the student
    System.out.println("Name: " + name);
    
    // Print the grade of the student
    System.out.println("Grade: " + grade);
  }
}

The above "Student" class has three private attributes: 'name', 'grade', and 'courses'. The 'name' and 'grade' attributes are initialized in the constructor with the values passed as arguments. The 'courses' attribute is initialized as an empty array list. There are getter methods for the 'name', 'grade', and 'courses' attributes. There are also methods to add and remove courses from the 'courses' attribute.

// Main.java

// Define the Main class
public class Main {
  
  // Main method, the entry point of the Java application
  public static void main(String[] args) {
    
    // Create a new Student object named student1 with name "Carolus Vitali" and grade 11
    Student student1 = new Student("Carolus Vitali", 11);
    
    // Create a new Student object named student2 with name "Nakeisha Uhuru" and grade 10
    Student student2 = new Student("Nakeisha Uhuru", 10);
    
    // Create a new Student object named student3 with name "Gabriella Cherice" and grade 10
    Student student3 = new Student("Gabriella Cherice", 10);
    
    // Print a header for student details
    System.out.println("Student Details:");
    
    // Print the details of student1
    student1.printStudentDetails();
    
    // Print the details of student2
    student2.printStudentDetails();
    
    // Print the details of student3
    student3.printStudentDetails();
    
    // Print a message indicating courses are being added for student1
    System.out.println("Adding courses for " + student1.getName());
    
    // Add the course "Math" to student1's courses
    student1.addCourse("Math");
    
    // Add the course "Science" to student1's courses
    student1.addCourse("Science");
    
    // Add the course "English" to student1's courses
    student1.addCourse("English");
    
    // Print student1's name and their list of courses
    System.out.println(student1.getName() + "'s courses: " + student1.getCourses());

    // Print a message indicating courses are being added for student2
    System.out.println("\nAdding courses for " + student2.getName());
    
    // Add the course "History" to student2's courses
    student2.addCourse("History");
    
    // Add the course "Geography" to student2's courses
    student2.addCourse("Geography");
    
    // Add the course "English" to student2's courses
    student2.addCourse("English");
    
    // Print student2's name and their list of courses
    System.out.println(student2.getName() + "'s courses: " + student2.getCourses());
    
    // Print a message indicating the course "Science" is being removed for student1
    System.out.println("\nRemoving 'Science' course for " + student1.getName());
    
    // Remove the course "Science" from student1's courses
    student1.removeCourse("Science");
    
    // Print student1's name and their updated list of courses
    System.out.println(student1.getName() + "'s courses: " + student1.getCourses());
  }
}
The above Main class creates three instances of the Student class, adds courses to their courses list using the “addCourse()” method, and prints out the list of courses for each student using the “getCourses()” method. It then removes a course for student1 using the ‘removeCourse()’ method, and prints out the updated list of courses for student1.

Sample Output:

Student Details:
Name: Carolus Vitali
Grade: 11
Name: Nakeisha Uhuru
Grade: 10
Name: Gabriella Cherice
Grade: 10
Adding courses for Carolus Vitali
Carolus Vitali's courses: [Math, Science, English]

Adding courses for Nakeisha Uhuru
Nakeisha Uhuru's courses: [History, Geography, English]

Removing 'Science' course for Carolus Vitali
Carolus Vitali's courses: [Math, English]

### 11. Write a Java program to create a class called "Library" with a collection of books and methods to add and remove books.

Write a Java program to create a class called " Library" with a collection of books and methods to add and remove books.

Sample Solution:

Java Code:

// Book.java
// Define the Book class
public class Book {
  // Private field to store the title of the book
  private String title;
  // Private field to store the author of the book
  private String author;

  // Constructor to initialize the title and author fields
  public Book(String title, String author) {
    // Assign the title parameter to the title field
    this.title = title;
    // Assign the author parameter to the author field
    this.author = author;
  }

  // Getter method for the title field
  public String getTitle() {
    // Return the value of the title field
    return title;
  }

  // Setter method for the title field
  public void setTitle(String title) {
    // Assign the title parameter to the title field
    this.title = title;
  }

  // Getter method for the author field
  public String getAuthor() {
    // Return the value of the author field
    return author;
  }

  // Setter method for the author field
  public void setAuthor(String author) {
    // Assign the author parameter to the author field
    this.author = author;
  }
} 

The above class has two private attributes, "title" and "author". It has a constructor that takes two arguments, the title and author of the book, and initializes the corresponding attributes. It also has getter and setter methods to access and modify the title and author attributes.

// Library.java
// Import the ArrayList class from the java.util package
import java.util.ArrayList;

// Define the Library class
public class Library {
  // Private field to store a list of Book objects
  private ArrayList<Book> books;

  // Constructor to initialize the books field
  public Library() {
    // Create a new ArrayList to hold Book objects
    books = new ArrayList<Book>();
  }

  // Method to add a Book to the books list
  public void addBook(Book book) {
    // Add the specified book to the books list
    books.add(book);
  }

  // Method to remove a Book from the books list
  public void removeBook(Book book) {
    // Remove the specified book from the books list
    books.remove(book);
  }

  // Method to get the list of books
  public ArrayList<Book> getBooks() {
    // Return the list of books
    return books;
  }
}

The above " Library" class has a private books attribute, which is an ArrayList of Book objects. The  Library constructor initializes this attribute as an empty list. The "addBook()" method adds a Book object to the books list, while the “removeBook()” method removes a Book object from the list. The “getBooks()” method returns the books list.

// Main.java

// Define the Main class
public class Main {
  // Main method, entry point of the program
  public static void main(String[] args) {
    // Create a new instance of the Library class
    Library library = new Library();

    // Create new Book objects with title and author
    Book book1 = new Book("Adventures of Tom Sawyer", "Mark Twain");
    Book book2 = new Book("Ben Hur", "Lewis Wallace");
    Book book3 = new Book("Time Machine", "H.G. Wells");
    Book book4 = new Book("Anna Karenina", "Leo Tolstoy");

    // Add the books to the library
    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);
    library.addBook(book4);

    // Print a message to indicate the books in the library
    System.out.println("Books in the library:");
    // Iterate through the list of books in the library
    for (Book book : library.getBooks()) {
      // Print the title and author of each book
      System.out.println(book.getTitle() + " by " + book.getAuthor());
    }

    // Remove a book from the library
    library.removeBook(book2);
    // Print a message to indicate the books in the library after removal
    System.out.println("\nBooks in the library after removing " + book2.getTitle() + ":");
    // Iterate through the updated list of books in the library
    for (Book book : library.getBooks()) {
      // Print the title and author of each book
      System.out.println(book.getTitle() + " by " + book.getAuthor());
    }
  }
} 
In the above class, we create an instance of the  Library class and add two Book objects to the collection using the “addBook()” method. We then display the books in the  library using the “displayBooks()” method. We remove one of the books using the “removeBook()” method and display the updated collection of books in the  library.

Sample Output:

Books in the library:
Adventures of Tom Sawyer by Mark Twain
Ben Hur by Lewis Wallace
Time Machine by H.G. Wells
Anna Karenina by Leo Tolstoy

Books in the library after removing Ben Hur:
Adventures of Tom Sawyer by Mark Twain
Time Machine by H.G. Wells
Anna Karenina by Leo Tolstoy

### 12. Write a Java program to create a class called "Airplane" with a flight number, destination, and departure time attributes, and methods to check flight status and delay.

Write a Java program to create a class called "Airplane" with a flight number, destination, and departure time attributes, and methods to check flight status and delay.

Sample Solution:

Java Code:

// Airplane.java
// Import the LocalTime class from the java.time package
import java.time.LocalTime;

// Define the Airplane class
public class Airplane {
  // Private field to store the flight number
  private String flightNumber;
  // Private field to store the destination
  private String destination;
  // Private field to store the scheduled departure time
  private LocalTime scheduledDeparture;
  // Private field to store the delay time in minutes
  private int delayTime;

  // Constructor to initialize the flight number, destination, and scheduled departure time
  public Airplane(String flightNumber, String destination, LocalTime scheduledDeparture) {
    // Assign the flight number parameter to the flightNumber field
    this.flightNumber = flightNumber;
    // Assign the destination parameter to the destination field
    this.destination = destination;
    // Assign the scheduled departure time parameter to the scheduledDeparture field
    this.scheduledDeparture = scheduledDeparture;
    // Initialize the delay time to 0
    this.delayTime = 0;
  }

  // Getter method for the flight number
  public String getFlightNumber() {
    // Return the value of the flightNumber field
    return flightNumber;
  }

  // Setter method for the flight number
  public void setFlightNumber(String flightNumber) {
    // Assign the flight number parameter to the flightNumber field
    this.flightNumber = flightNumber;
  }

  // Getter method for the destination
  public String getDestination() {
    // Return the value of the destination field
    return destination;
  }

  // Setter method for the destination
  public void setDestination(String destination) {
    // Assign the destination parameter to the destination field
    this.destination = destination;
  }

  // Getter method for the scheduled departure time
  public LocalTime getScheduledDeparture() {
    // Return the value of the scheduledDeparture field
    return scheduledDeparture;
  }

  // Setter method for the scheduled departure time
  public void setScheduledDeparture(LocalTime scheduledDeparture) {
    // Assign the scheduled departure time parameter to the scheduledDeparture field
    this.scheduledDeparture = scheduledDeparture;
  }

  // Getter method for the delay time
  public int getDelayTime() {
    // Return the value of the delayTime field
    return delayTime;
  }

  // Method to set a delay and update the scheduled departure time
  public void delay(int minutes) {
    // Assign the delay time parameter to the delayTime field
    this.delayTime = minutes;
    // Update the scheduled departure time by adding the delay time
    this.scheduledDeparture = this.scheduledDeparture.plusMinutes(minutes);
  }

  // Method to check the status of the flight
  public void checkStatus() {
    // Check if there is no delay
    if (delayTime == 0) {
      // Print a message indicating the flight is on time
      System.out.println("Flight " + flightNumber + " is on time.");
    } else {
      // Print a message indicating the flight is delayed
      System.out.println("Flight " + flightNumber + " is delayed by " + delayTime + " minutes.");
    }
  }
} 

The above class represents an airplane with a flight number, destination, and scheduled departure time. It has getter and setter methods for these attributes. The class also two methods "delay()" and "checkStatus()" to delay the flight and check its status. The "delay()" method takes an integer value representing the number of minutes the flight will be delayed and updates the scheduled departure time accordingly. By using “checkStatus()” method, you can determine whether the flight has been delayed or is on time.

// Import the LocalTime class from the java.time package
import java.time.LocalTime;

// Define the Main class
public class Main {
  // Main method, entry point of the program
  public static void main(String[] args) {
    // Create a new Airplane object with flight number "CDE345", destination "London", and departure time 10:30
    Airplane flight1 = new Airplane("CDE345", "London", LocalTime.of(10, 30));
    // Create a new Airplane object with flight number "KUI765", destination "New York", and departure time 14:00
    Airplane flight2 = new Airplane("KUI765", "New York", LocalTime.of(14, 0));
    // Create a new Airplane object with flight number "JUY456", destination "Paris", and departure time 14:00
    Airplane flight3 = new Airplane("JUY456", "Paris", LocalTime.of(14, 0));
    // Print the initial flight status
    System.out.println("Flight Status:");
    // Check and print the status of flight1
    flight1.checkStatus();
    // Check and print the status of flight2
    flight2.checkStatus();
    // Check and print the status of flight3
    flight3.checkStatus();
    // Delay flight1 by 40 minutes
    flight1.delay(40);
    // Delay flight2 by 110 minutes
    flight2.delay(110);
    // Print the current flight status after delays
    System.out.println("\nCurrent Flight Status:");
    // Check and print the status of flight1
    flight1.checkStatus();
    // Check and print the status of flight2
    flight2.checkStatus();
    // Check and print the status of flight3
    flight3.checkStatus();
  }
}
In the main() function, we create three "Airplane" objects and set flight numbers, destinations and scheduled departure times. It then calls the "checkStatus()" method to display the initial flight status of each flight. The program then delays flight1 and flight2 by calling the "delay()" method on these objects, and then calls the "checkStatus()" method again to display the updated flight status of each flight.

Sample Output:

Flight Status:
Flight CDE345 is on time.
Flight KUI765 is on time.
Flight JUY456 is on time.

Current Flight Status:
Flight CDE345 is delayed by 40 minutes.
Flight KUI765 is delayed by 110 minutes.
Flight JUY456 is on time.

### 13. Write a Java program to create a class called "Inventory" with a collection of products and methods to add and remove products, and to check for low inventory.

Write a Java program to create a class called "Inventory" with a collection of products and methods to add and remove products, and to check for low inventory.

Sample Solution:

Java Code:

// Product.java
// Define the Product class
public class Product {
  // Private field to store the name of the product
  private String name;
  // Private field to store the quantity of the product
  private int quantity;

  // Constructor to initialize the name and quantity of the product
  public Product(String name, int quantity) {
    // Assign the name parameter to the name field
    this.name = name;
    // Assign the quantity parameter to the quantity field
    this.quantity = quantity;
  }

  // Getter method for the name field
  public String getName() {
    // Return the value of the name field
    return name;
  }

  // Setter method for the name field
  public void setName(String name) {
    // Assign the name parameter to the name field
    this.name = name;
  }

  // Getter method for the quantity field
  public int getQuantity() {
    // Return the value of the quantity field
    return quantity;
  }

  // Setter method for the quantity field
  public void setQuantity(int quantity) {
    // Assign the quantity parameter to the quantity field
    this.quantity = quantity;
  }
}

In the above code, we create a class called "Product" with two private attributes, "name" and "quantity". We also create a constructor to initialize these attributes and getter and setter methods to access and modify them.

// Inventory.java
// Import the ArrayList class from the java.util package
import java.util.ArrayList;

// Define the Inventory class
public class Inventory {
  // Private field to store a list of Product objects
  private ArrayList<Product> products;

  // Constructor to initialize the products field
  public Inventory() {
    // Create a new ArrayList to hold Product objects
    products = new ArrayList<Product>();
  }

  // Method to add a Product to the products list
  public void addProduct(Product product) {
    // Add the specified product to the products list
    products.add(product);
  }

  // Method to remove a Product from the products list
  public void removeProduct(Product product) {
    // Remove the specified product from the products list
    products.remove(product);
  }

  // Method to check for low inventory products
  public void checkLowInventory() {
    // Iterate through the list of products
    for (Product product : products) {
      // Check if the product quantity is less than or equal to 100
      if (product.getQuantity() <= 100) {
        // Print a message indicating the product is running low on inventory
        System.out.println(product.getName() + " is running low on inventory. Current quantity: " + product.getQuantity());
      }
    }
  }
}
Here we create a class called "Inventory" with a private attribute "products", which is an ArrayList of Product objects. We also create a constructor to initialize this attribute as an empty list and methods to add and remove products from the list. Additionally, we create a method called "checkLowInventory()" to check for low inventory levels in the products list.

// Main.java
// Define the Main class
public class Main {
  // Main method, entry point of the program
  public static void main(String[] args) {
    // Create a new instance of the Inventory class
    Inventory inventory = new Inventory();
    
    // Create new Product objects with name and quantity
    Product product1 = new Product("LED TV", 200);
    Product product2 = new Product("Mobile", 80);
    Product product3 = new Product("Tablet", 50);
    
    // Print a message indicating products are being added to the inventory
    System.out.println("Add three products in inventory:");
    
    // Add the products to the inventory
    inventory.addProduct(product1);
    inventory.addProduct(product2);
    inventory.addProduct(product3);
    
    // Print a message indicating low inventory check
    System.out.println("\nCheck low inventory:");
    
    // Check and print products with low inventory
    inventory.checkLowInventory();
    
    // Print a message indicating a product is being removed from the inventory
    System.out.println("\nRemove Tablet from the inventory!");
    
    // Remove the Tablet product from the inventory
    inventory.removeProduct(product3);
    
    // Print a message indicating another low inventory check
    System.out.println("\nAgain check low inventory:");
    
    // Check and print products with low inventory again
    inventory.checkLowInventory();
  }
}
In the "Main" class, we create an instance of the Inventory class and add three Product objects to the list. We then call the "checkLowInventory()" method to check for low inventory levels. Next, we remove one of the products from the list and call the "checkLowInventory()" method again to see if there are any other low inventory levels.

Sample Output:

Add three products in inventory:

Check low inventory:
Mobile is running low on inventory. Current quantity: 80
Tablet is running low on inventory. Current quantity: 50

Remove Tablet from the inventory!

Again check low inventory:
Mobile is running low on inventory. Current quantity: 80

### 14. Write a Java program to create a class called "School" with attributes for students, teachers, and classes, and methods to add and remove students and teachers, and to create classes.

Write a Java program to create a class called "School" with attributes for students, teachers, and classes, and methods to add and remove students and teachers, and to create classes.

Sample Solution:

Java Code:

// School.java
// Import the ArrayList class from the java.util package
import java.util.ArrayList;

// Define the School class
public class School {
  // Private field to store a list of Student objects
  private ArrayList<Student> students;
  // Private field to store a list of Teacher objects
  private ArrayList<Teacher> teachers;
  // Private field to store a list of SchoolClass objects
  private ArrayList<SchoolClass> classes;

  // Constructor to initialize the students, teachers, and classes fields
  public School() {
    // Create a new ArrayList to hold Student objects
    this.students = new ArrayList<Student>();
    // Create a new ArrayList to hold Teacher objects
    this.teachers = new ArrayList<Teacher>();
    // Create a new ArrayList to hold SchoolClass objects
    this.classes = new ArrayList<SchoolClass>();
  }

  // Method to add a Student to the students list
  public void addStudent(Student student) {
    // Add the specified student to the students list
    students.add(student);
  }

  // Method to remove a Student from the students list
  public void removeStudent(Student student) {
    // Remove the specified student from the students list
    students.remove(student);
  }

  // Method to add a Teacher to the teachers list
  public void addTeacher(Teacher teacher) {
    // Add the specified teacher to the teachers list
    teachers.add(teacher);
  }

  // Method to remove a Teacher from the teachers list
  public void removeTeacher(Teacher teacher) {
    // Remove the specified teacher from the teachers list
    teachers.remove(teacher);
  }

  // Method to add a SchoolClass to the classes list
  public void addClass(SchoolClass schoolClass) {
    // Add the specified school class to the classes list
    classes.add(schoolClass);
  }

  // Method to remove a SchoolClass from the classes list
  public void removeClass(SchoolClass schoolClass) {
    // Remove the specified school class from the classes list
    classes.remove(schoolClass);
  }

  // Method to get the list of students
  public ArrayList<Student> getStudents() {
    // Return the list of students
    return students;
  }

  // Method to get the list of teachers
  public ArrayList<Teacher> getTeachers() {
    // Return the list of teachers
    return teachers;
  }

  // Method to get the list of classes
  public ArrayList<SchoolClass> getClasses() {
    // Return the list of classes
    return classes;
  }
}

The above "School" class represents a school with students, teachers, and classes. It has three ArrayList attributes to store Student, Teacher, and SchoolClass objects. The constructor initializes these ArrayLists as empty lists. It has methods to add and remove students, teachers, and classes from their respective ArrayLists. It also has getter methods to access ArrayLists of students, teachers, and classes.

// Student.java
// Define the Student class
public class Student {
  // Private field to store the name of the student
  private String name;
  // Private field to store the age of the student
  private int age;

  // Constructor to initialize the name and age of the student
  public Student(String name, int age) {
    // Assign the name parameter to the name field
    this.name = name;
    // Assign the age parameter to the age field
    this.age = age;
  }

  // Getter method for the name field
  public String getName() {
    // Return the value of the name field
    return name;
  }

  // Setter method for the name field
  public void setName(String name) {
    // Assign the name parameter to the name field
    this.name = name;
  }

  // Getter method for the age field
  public int getAge() {
    // Return the value of the age field
    return age;
  }

  // Setter method for the age field
  public void setAge(int age) {
    // Assign the age parameter to the age field
    this.age = age;
  }
} 
The "Student" class represents a student with a name and an age. It has a constructor that takes two arguments, name and age, and initializes the corresponding attributes. It also has getter and setter methods to access and modify name and age attributes.

// Teacher.class
// Define the Teacher class
public class Teacher {
  // Private field to store the name of the teacher
  private String name;
  // Private field to store the subject of the teacher
  private String subject;

  // Constructor to initialize the name and subject of the teacher
  public Teacher(String name, String subject) {
    // Assign the name parameter to the name field
    this.name = name;
    // Assign the subject parameter to the subject field
    this.subject = subject;
  }

  // Getter method for the name field
  public String getName() {
    // Return the value of the name field
    return name;
  }

  // Setter method for the name field
  public void setName(String name) {
    // Assign the name parameter to the name field
    this.name = name;
  }

  // Getter method for the subject field
  public String getSubject() {
    // Return the value of the subject field
    return subject;
  }

  // Setter method for the subject field
  public void setSubject(String subject) {
    // Assign the subject parameter to the subject field
    this.subject = subject;
  }
}
The Teacher class represents a teacher in a school. It has two private attributes: name (teacher's name) and subject (Subject the teacher teaches). The class has a constructor that takes two arguments, the teacher's name and subject, and initializes the corresponding attributes. It also has getter and setter methods to access and modify the name and subject attributes.

// SchoolClass.java
// Import the ArrayList class from the java.util package
import java.util.ArrayList;

// Define the SchoolClass class
public class SchoolClass {
  // Private field to store the name of the class
  private String className;
  // Private field to store the teacher of the class
  private Teacher teacher;
  // Private field to store a list of Student objects
  private ArrayList<Student> students;

  // Constructor to initialize the className, teacher, and students fields
  public SchoolClass(String className, Teacher teacher) {
    // Assign the className parameter to the className field
    this.className = className;
    // Assign the teacher parameter to the teacher field
    this.teacher = teacher;
    // Create a new ArrayList to hold Student objects
    this.students = new ArrayList<Student>();
  }

  // Getter method for the className field
  public String getClassName() {
    // Return the value of the className field
    return className;
  }

  // Setter method for the className field
  public void setClassName(String className) {
    // Assign the className parameter to the className field
    this.className = className;
  }

  // Getter method for the teacher field
  public Teacher getTeacher() {
    // Return the value of the teacher field
    return teacher;
  }

  // Setter method for the teacher field
  public void setTeacher(Teacher teacher) {
    // Assign the teacher parameter to the teacher field
    this.teacher = teacher;
  }

  // Getter method for the students field
  public ArrayList<Student> getStudents() {
    // Return the list of students
    return students;
  }

  // Method to add a Student to the students list
  public void addStudent(Student student) {
    // Add the specified student to the students list
    students.add(student);
  }

  // Method to remove a Student from the students list
  public void removeStudent(Student student) {
    // Remove the specified student from the students list
    students.remove(student);
  }
}
The SchoolClass class represents a class in a school. It has a private attribute className to store the name of the class and another private attribute teacher of type Teacher to store the teacher of the class. It also has a private attribute students of type ArrayList to store the students enrolled in the class. The constructor takes two arguments: className and teacher, and initializes these attributes.


The class has getter and setter methods for className and teacher. It also has methods addStudent and removeStudent to add and remove a student from the students list. The getStudents method returns the list of students in the class.

//Main.java
// Import the ArrayList class from the java.util package
import java.util.ArrayList;

// Define the Main class
public class Main {
  // Main method, entry point of the program
  public static void main(String[] args) {
    // Create a new instance of the School class
    School school = new School();
    
    // Create new Student objects with name and age
    Student student1 = new Student("Mats Yatzil", 15);
    Student student2 = new Student("Karolina Ralf", 16);
    Student student3 = new Student("Felicie Anuschka", 16);
    Student student4 = new Student("Norbert Micha", 15);
    
    // Add the students to the school
    school.addStudent(student1);
    school.addStudent(student2);
    school.addStudent(student3);
    school.addStudent(student4);
    
    // Create new Teacher objects with name and subject
    Teacher teacher1 = new Teacher("Jens Amalia", "Math");
    Teacher teacher2 = new Teacher("Elise Giiwedin", "English");
    Teacher teacher3 = new Teacher("Angelika Lotta", "Science");
    
    // Add the teachers to the school
    school.addTeacher(teacher1);
    school.addTeacher(teacher2);
    school.addTeacher(teacher3);

    // Create new SchoolClass objects with class name and teacher
    SchoolClass mathClass = new SchoolClass("Mathematics", teacher1);
    // Add students to the math class
    mathClass.addStudent(student1);
    mathClass.addStudent(student2);
    mathClass.addStudent(student3);
    mathClass.addStudent(student4);

    SchoolClass englishClass = new SchoolClass("English", teacher2);
    // Add students to the English class
    englishClass.addStudent(student1);
    englishClass.addStudent(student2);
    englishClass.addStudent(student3);

    SchoolClass scienceClass = new SchoolClass("Science", teacher3);
    // Add students to the Science class
    scienceClass.addStudent(student1);
    scienceClass.addStudent(student2);
    scienceClass.addStudent(student3);
    scienceClass.addStudent(student4);

    // Add the classes to the school
    school.addClass(mathClass);
    school.addClass(englishClass);
    school.addClass(scienceClass);

    // Print general school information
    System.out.println("School information:");
    System.out.println("Number of students: " + school.getStudents().size());
    System.out.println("Number of teachers: " + school.getTeachers().size());
    System.out.println("Number of classes: " + school.getClasses().size());
    System.out.println();

    // Print math class information
    System.out.println("Math class information:");
    System.out.println("Class name: " + mathClass.getClassName());
    System.out.println("Teacher: " + mathClass.getTeacher().getName());
    System.out.println("Number of students: " + mathClass.getStudents().size());
    System.out.println();

    // Print English class information
    System.out.println("English class information:");
    System.out.println("Class name: " + englishClass.getClassName());
    System.out.println("Teacher: " + englishClass.getTeacher().getName());
    System.out.println("Number of students: " + englishClass.getStudents().size());
    System.out.println();
    
    // Print Science class information
    System.out.println("Science class information:");
    System.out.println("Class name: " + scienceClass.getClassName());
    System.out.println("Teacher: " + scienceClass.getTeacher().getName());
    System.out.println("Number of students: " + scienceClass.getStudents().size());
    System.out.println();

    // Remove a student, a teacher, and a class from the school
    school.removeStudent(student1);
    school.removeTeacher(teacher2);
    school.removeClass(mathClass);

    // Print updated school information after removal
    System.out.println("School information after removing one student, teacher and class:");
    System.out.println("Number of students: " + school.getStudents().size());
    System.out.println("Number of teachers: " + school.getTeachers().size());
    System.out.println("Number of classes: " + school.getClasses().size());
  }
}
The "Main" class is the program entry point. It creates objects of the "School", "Student", "Teacher", and "SchoolClass" classes to demonstrate the school system's functionality. It adds students, teachers, and classes to the school object using its respective methods. It then retrieves and prints information about the number of students, teachers, and classes in the school. It also prints the details of each class, including the name of the class, the teacher's name, and the number of students in each class. Finally, it removes one student, one teacher, and one class from the school and prints updated information about the school.

Sample Output:

School information:
Number of students: 4
Number of teachers: 3
Number of classes: 3

Math class information:
Class name: Mathematics
Teacher: Jens Amalia
Number of students: 4

English class information:
Class name: English
Teacher: Elise Giiwedin
Number of students: 3

Science class information:
Class name: Science
Teacher: Angelika Lotta
Number of students: 4

School information after removing one student, teacher and Class:
Number of students: 3
Number of teachers: 2
Number of classes: 2

### 15. Write a Java program to create a class called "MusicLibrary" with a collection of songs and methods to add and remove songs, and to play a random song.

Write a Java program to create a class called "MusicLibrary" with a collection of songs and methods to add and remove songs, and to play a random song.

Sample Solution:

Java Code:

// MusicLibrary.java
// Import the ArrayList class from the Java utility package
import java.util.ArrayList;
// Import the Random class from the Java utility package
import java.util.Random;

// Define the MusicLibrary class
public class MusicLibrary {

    // Declare a private field to store a list of Song objects
    private ArrayList<Song> songs;

    // Constructor to initialize the songs list
    public MusicLibrary() {
        // Create a new ArrayList to hold Song objects
        songs = new ArrayList<Song>();
    }

    // Method to add a song to the library
    public void addSong(Song song) {
        // Add the provided song to the songs list
        songs.add(song);
    }

    // Method to remove a song from the library
    public void removeSong(Song song) {
        // Remove the provided song from the songs list
        songs.remove(song);
    }

    // Method to get the list of all songs in the library
    public ArrayList<Song> getSongs() {
        // Return the list of songs
        return songs;
    }

    // Method to play a random song from the library
    public void playRandomSong() {
        // Get the number of songs in the library
        int size = songs.size();

        // Check if the library is empty
        if (size == 0) {
            // Print a message if there are no songs to play
            System.out.println("No songs in the library.");
            return; // Exit the method
        }

        // Create a new Random object to generate a random number
        Random rand = new Random();

        // Generate a random index within the range of the songs list
        int index = rand.nextInt(size);

        // Print the title and artist of the randomly selected song
        System.out.println("Now playing: " + songs.get(index).getTitle() + " by " + songs.get(index).getArtist());
    }
}

The above “MusicLibrary” class represents a  library of songs. It uses an ArrayList to store the songs, and provides methods to add and remove songs from the  library. It also has a method to get a list of all the songs in the library, and a method to play a random song from the library.

// Song.java
// Define the Song class
public class Song {

    // Private fields to store the title and artist of the song
    private String title;
    private String artist;

    // Constructor to initialize the title and artist fields
    public Song(String title, String artist) {
        this.title = title;  // Set the title field to the provided title
        this.artist = artist;  // Set the artist field to the provided artist
    }

    // Getter method to retrieve the title of the song
    public String getTitle() {
        return title;  // Return the value of the title field
    }

    // Setter method to update the title of the song
    public void setTitle(String title) {
        this.title = title;  // Set the title field to the provided title
    }

    // Getter method to retrieve the artist of the song
    public String getArtist() {
        return artist;  // Return the value of the artist field
    }

    // Setter method to update the artist of the song
    public void setArtist(String artist) {
        this.artist = artist;  // Set the artist field to the provided artist
    }
}
The “Song” class represents a song in a  music  library. It has two private instance variables, the title and the artist, and a constructor that takes these two variables as parameters. The class also provides getters and setters for the title and artist variables, allowing the client code to access and modify the song information.

// Main.java
// Import the ArrayList class from the Java utility package
import java.util.ArrayList;

// Define the Main class
public class Main {

    // The main method - the entry point of the Java application
    public static void main(String[] args) {

        // Create a new instance of the MusicLibrary class
        MusicLibrary library = new MusicLibrary();

        // Add songs to the music library
        library.addSong(new Song("Midnight Train to Georgia", "Gladys Knight & the Pips"));
        library.addSong(new Song("Stairway to Heaven", "Led Zeppelin"));
        library.addSong(new Song("Imagine", "John Lennon"));
        library.addSong(new Song("All by Myself", "Eric Carmen"));
        library.addSong(new Song("What'd I Say", "Ray Charles"));
        library.addSong(new Song("Walking in Memphis", "Marc Cohn"));
        library.addSong(new Song("In the Air Tonight", "Phil Collins"));

        // Print all songs in the music library
        System.out.println("All songs:");

        // Iterate through each song in the library and print its title and artist
        for (Song song : library.getSongs()) {
            System.out.println(song.getTitle() + " by " + song.getArtist());
        }

        // Print a message indicating a random song will be played
        System.out.println("\n**Playing Random Song**");

        // Play and print a random song from the library three times
        library.playRandomSong();
        System.out.println();
        library.playRandomSong();
        System.out.println();
        library.playRandomSong();
    }
}
The Main class creates an instance of MusicLibrary and adds several Song objects to it. It then retrieves and prints out the list of all songs in the  library. Finally, it calls the playRandomSong() method of the MusicLibrary object three times to play a random song each time, printing out the details of the played song.

Sample Output:

All songs:
Midnight Train to Georgia by Gladys Knight & the Pips
Stairway to Heaven by Led Zeppelin
Imagine by John Lennon
All by Myself by Eric Carmen
What'd I Say by Ray Charles
Walking in Memphis by Marc Cohn
In the Air Tonight by Phil Collins

**Playing Random Song**
Now playing: Imagine by John Lennon

Now playing: Midnight Train to Georgia by Gladys Knight & the Pips

Now playing: What'd I Say by Ray Charles

### 16. Write a Java program to create a class called "Shape" with abstract methods for calculating area and perimeter, and subclasses for "Rectangle", "Circle", and "Triangle".

Write a Java program to create a class called "Shape" with abstract methods for calculating area and perimeter, and subclasses for "Rectangle", "Circle", and "Triangle".

Note: An abstract class is a class that is declared abstract—it may or may not include abstract methods. Abstract classes cannot be instantiated, but they can be subclassed.

An abstract method is a method that is declared without an implementation (without braces, and followed by a semicolon).

Sample Solution:

Java Code:

//Shape.java
// Define the Shape class as an abstract class
public abstract class Shape {

    // Abstract method to get the area of the shape
    // This method must be implemented by any subclass of Shape
    public abstract double getArea();

    // Abstract method to get the perimeter of the shape
    // This method must be implemented by any subclass of Shape
    public abstract double getPerimeter();
} 

The above "Shape" class is an abstract class that defines the basic properties and behaviours of a geometric shape. It contains two abstract methods, "getArea()" and "getPerimeter()", which are to be implemented by its subclasses. Since the class is abstract, it cannot be instantiated on its own, but it provides a framework for other classes to extend and implement its methods.

//Rectangle.java
// Define the Rectangle class, which extends the Shape class
public class Rectangle extends Shape {

    // Private fields to store the length and width of the rectangle
    private double length;
    private double width;

    // Constructor to initialize the length and width of the rectangle
    public Rectangle(double length, double width) {
        this.length = length; // Set the length field to the provided length
        this.width = width; // Set the width field to the provided width
    }

    // Method to calculate and return the area of the rectangle
    public double getArea() {
        return length * width; // Calculate the area by multiplying length and width
    }

    // Method to calculate and return the perimeter of the rectangle
    public double getPerimeter() {
        return 2 * (length + width); // Calculate the perimeter using the formula 2 * (length + width)
    }
}
The above code represents a class called ‘Rectangle’ that extends the ‘Shape’ abstract class. The ‘Rectangle’ class has two instance variables, ‘length’ and ‘width’, and a constructor that initializes these variables. It also has methods to calculate the area and perimeter of a rectangle using the ‘getArea()’ and ‘getPerimeter()’ methods respectively. The ‘getArea()’ method returns the product of the length and width variables while the ‘getPerimeter()’ method returns twice the sum of the length and width variables.

// Circle.java

// Define the Circle class, which extends the Shape class
public class Circle extends Shape {

    // Private field to store the radius of the circle
    private double radius;

    // Constructor to initialize the radius of the circle
    public Circle(double radius) {
        this.radius = radius; // Set the radius field to the provided radius
    }

    // Method to calculate and return the area of the circle
    public double getArea() {
        return Math.PI * radius * radius; // Calculate the area using the formula π * radius^2
    }

    // Method to calculate and return the perimeter (circumference) of the circle
    public double getPerimeter() {
        return 2 * Math.PI * radius; // Calculate the perimeter using the formula 2 * π * radius
    }
}
The "Circle" class is a subclass of the abstract "Shape" class. It has a private instance variable for the radius of the circle. It implements abstract methods for calculating the area and perimeter of the circle. The area is calculated by multiplying the square of the radius by pi. The perimeter is calculated by multiplying the radius by twice pi value.

// Triangle.java

// Define the Triangle class, which extends the Shape class
public class Triangle extends Shape {

    // Private fields to store the sides of the triangle
    private double side1;
    private double side2;
    private double side3;

    // Constructor to initialize the sides of the triangle
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1; // Set the side1 field to the provided side1
        this.side2 = side2; // Set the side2 field to the provided side2
        this.side3 = side3; // Set the side3 field to the provided side3
    }

    // Method to calculate and return the area of the triangle
    public double getArea() {
        double s = (side1 + side2 + side3) / 2; // Calculate the semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)); // Calculate the area using Heron's formula
    }

    // Method to calculate and return the perimeter of the triangle
    public double getPerimeter() {
        return side1 + side2 + side3; // Calculate the perimeter by summing the sides
    }
}
The "Triangle" class is a subclass of the "Shape" abstract class that represents a triangle shape. It has three instance variables to store the length of its three sides. It has a constructor that takes these three sides as parameters. The class provides implementations of the abstract methods "getArea()" and "getPerimeter()" to calculate the area and perimeter of the triangle based on its three sides using standard formulas.

// Define the Main class
public class Main {
    
    // The main method - the entry point of the Java application
    public static void main(String[] args) {
        
        // Create a rectangle shape with length 10 and width 12
        Shape rectangle = new Rectangle(10, 12);
        
        // Create a circle shape with radius 5
        Shape circle = new Circle(5);
        
        // Create a triangle shape with sides 7, 8, and 6
        Shape triangle = new Triangle(7, 8, 6);

        // Print the header for the area and perimeter calculations
        System.out.println("\nArea and perimeter of various shapes:");
        
        // Print the details and calculations for the rectangle
        System.out.println("\nRectangle: Length-10, Width-12");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        // Print the details and calculations for the circle
        System.out.println("\nCircle: Radius-5");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        // Print the details and calculations for the triangle
        System.out.println("\nTriangle: Side1-7, Side2-8, Side3-6");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
}
The Main class creates instances of different shape objects including a rectangle, circle, and triangle. It then calls methods to calculate the area and perimeter of each shape and displays the results in the console.

Sample Output:

Area and perimeter of various shapes:

Rectangle: Length-10, Width-12
Area: 120.0
Perimeter: 44.0

Circle: Radius-5
Area: 78.53981633974483
Perimeter: 31.41592653589793

Triangle: Side1-7, Side2-8, Side3-6
Area: 20.33316256758894
Perimeter: 21.0

### 17. Write a Java program to create a class called "Movie" with attributes for title, director, actors, and reviews, and methods for adding and retrieving reviews.

Write a Java program to create a class called "Movie" with attributes for title, director, actors, and reviews, and methods for adding and retrieving reviews.

Sample Solution:

Java Code:

// Movie.java

// Import the ArrayList class from the Java utility package
import java.util.ArrayList;

// Define the Movie class
public class Movie {

    // Private fields to store the title, director, actors, and reviews of the movie
    private String title;
    private String director;
    private ArrayList<String> actors;
    private ArrayList<Review> reviews;

    // Constructor to initialize the title, director, and actors of the movie
    public Movie(String title, String director, ArrayList<String> actors) {
        this.title = title; // Set the title field to the provided title
        this.director = director; // Set the director field to the provided director
        this.actors = actors; // Set the actors field to the provided list of actors
        this.reviews = new ArrayList<Review>(); // Initialize the reviews list as an empty ArrayList
    }

    // Method to add a review to the movie
    public void addReview(Review review) {
        this.reviews.add(review); // Add the provided review to the reviews list
    }

    // Method to get the list of all reviews for the movie
    public ArrayList<Review> getReviews() {
        return this.reviews; // Return the list of reviews
    }

    // Method to get the title of the movie
    public String getTitle() {
        return this.title; // Return the value of the title field
    }

    // Method to get the director of the movie
    public String getDirector() {
        return this.director; // Return the value of the director field
    }

    // Method to get the list of actors in the movie
    public ArrayList<String> getActors() {
        return this.actors; // Return the list of actors
    }
}

The above Java class has instance variables for the movie's title, director, actors, and reviews. The class constructor takes in the movie's title, director, and actors as parameters, and initializes the instance variables. The class also has methods to add a review to the movie's reviews list. It can retrieve the reviews list, and the movie's title, director, and actors. The reviews list is an ArrayList of Review objects, created outside of this class. These objects are added to the reviews list using the addReview() method.

// Review.java

// Define the Review class
class Review {

    // Private fields to store the review text, reviewer name, and rating
    private String reviewText;
    private String reviewerName;
    private double rating;

    // Constructor to initialize the review text, reviewer name, and rating
    public Review(String reviewText, String reviewerName, double rating) {
        this.reviewText = reviewText; // Set the reviewText field to the provided review text
        this.reviewerName = reviewerName; // Set the reviewerName field to the provided reviewer name
        this.rating = rating; // Set the rating field to the provided rating
    }

    // Method to get the review text
    public String getReviewText() {
        return reviewText; // Return the value of the reviewText field
    }

    // Method to get the reviewer name
    public String getReviewerName() {
        return reviewerName; // Return the value of the reviewerName field
    }

    // Method to get the rating
    public double getRating() {
        return rating; // Return the value of the rating field
    }
} 
The Review class represents a movie review, with attributes such as the review text, the reviewer's name, and the rating given to the movie. It has a constructor that takes these attributes as parameters and sets them as instance variables. The class also has three getter methods to retrieve review text, reviewer name, and rating.

// Main.java
// Import the ArrayList and Arrays classes from the Java utility package
import java.util.ArrayList;
import java.util.Arrays;

// Define the Main class
public class Main {
  
  // The main method - the entry point of the Java application
  public static void main(String[] args) {
    
    // Create a movie object for "Titanic"
    Movie movie1 = new Movie("Titanic", "James Cameron",
      new ArrayList(Arrays.asList("Leonardo DiCaprio", "Kate Winslet")));

    // Create review objects
    Review review1 = new Review("Great movie!", "Irvine Rolf", 4.5);
    Review review2 = new Review("Highly recommended!", "Ashkii Karlheinz", 4.5);
    Review review3 = new Review("A classic that never gets old.", "Nele Athol", 4.0);
    Review review4 = new Review("Great movie!", "Cipactli Anselma", 4.0);
    Review review5 = new Review("Highly recommended!", "Martin Nadine", 4.0);

    // Add reviews to movie1
    movie1.addReview(review1);
    movie1.addReview(review2);
    movie1.addReview(review3);
    movie1.addReview(review4);

    // Create a movie object for "The Godfather"
    Movie movie2 = new Movie("The Godfather", "Francis Ford Coppola",
      new ArrayList(Arrays.asList("Marlon Brando", "Al Pacino", "James Caan")));

    // Display all the reviews for "Titanic"
    System.out.println("\nReviews for '" + movie1.getTitle() + "':");
    for (Review review : movie1.getReviews()) {
      System.out.println(review.getReviewText() + " by " + review.getReviewerName() + " - " + review.getRating());
    }

    // Add reviews to movie2
    movie2.addReview(review1);
    movie2.addReview(review4);
    movie2.addReview(review5);

    // Display all the reviews for "The Godfather"
    System.out.println("\nReviews for '" + movie2.getTitle() + "':");
    for (Review review : movie2.getReviews()) {
      System.out.println(review.getReviewText() + " by " + review.getReviewerName() + " - " + review.getRating());
    }
  }
}
The Main class is the entry point for the program. It creates two Movie objects: movie1 and movie2. It also creates five Review objects: review1, review2, review3, review4, and review5.


movie1 represents the movie "Titanic" directed by James Cameron and starring Leonardo DiCaprio and Kate Winslet. It adds four reviews to its reviews ArrayList.


movie2 represents the movie "The Godfather" directed by Francis Ford Coppola and starring Marlon Brando, Al Pacino, and James Caan. It adds three reviews to its reviews ArrayList.

The Main class then displays all the reviews for movie1 and movie2 by iterating over their reviews ArrayList and printing out the review text, reviewer name, and rating.

Sample Output:

Reviews for 'Titanic':
Great movie! by Irvine Rolf - 4.5
Highly recommended! by Ashkii Karlheinz - 4.5
A classic that never gets old. by Nele Athol - 4.0
Great movie! by Cipactli Anselma - 4.0

Reviews for 'The Godfather':
Great movie! by Irvine Rolf - 4.5
Great movie! by Cipactli Anselma - 4.0
Highly recommended! by Martin Nadine - 4.0

### 18. Write a Java program to create a class called "Restaurant" with attributes for menu items, prices, and ratings, and methods to add and remove items, and to calculate average rating.

Write a Java program to create a class called "Restaurant" with attributes for menu items, prices, and ratings, and methods to add and remove items, and to calculate average rating.

Sample Solution:

Java Code:

// Restaurant.java
// Import the ArrayList class
import java.util.ArrayList;

// Define the Restaurant class
public class Restaurant {
  // Declare ArrayLists to store menu items, prices, ratings, and item counts
  private ArrayList menuItems;
  private ArrayList prices;
  private ArrayList ratings;
  private ArrayList itemCounts;

  // Constructor to initialize the ArrayLists
  public Restaurant() {
    // Initialize the menuItems ArrayList
    this.menuItems = new ArrayList();
    // Initialize the prices ArrayList
    this.prices = new ArrayList();
    // Initialize the ratings ArrayList
    this.ratings = new ArrayList();
    // Initialize the itemCounts ArrayList
    this.itemCounts = new ArrayList();
  }

  // Method to add an item to the menu
  public void addItem(String item, double price) {
    // Add the item to the menuItems ArrayList
    this.menuItems.add(item);
    // Add the price to the prices ArrayList
    this.prices.add(price);
    // Initialize the rating for the item to 0
    this.ratings.add(0);
    // Initialize the item count for the item to 0
    this.itemCounts.add(0);
  }

  // Method to remove an item from the menu
  public void removeItem(String item) {
    // Get the index of the item in the menuItems ArrayList
    int index = this.menuItems.indexOf(item);
    // If the item exists in the menu
    if (index >= 0) {
      // Remove the item from the menuItems ArrayList
      this.menuItems.remove(index);
      // Remove the corresponding price from the prices ArrayList
      this.prices.remove(index);
      // Remove the corresponding rating from the ratings ArrayList
      this.ratings.remove(index);
      // Remove the corresponding item count from the itemCounts ArrayList
      this.itemCounts.remove(index);
    }
  }

  // Method to add a rating to an item
  public void addRating(String item, int rating) {
    // Get the index of the item in the menuItems ArrayList
    int index = this.menuItems.indexOf(item);
    // If the item exists in the menu
    if (index >= 0) {
      // Get the current rating of the item
      int currentRating = this.ratings.get(index);
      // Get the current item count of the item
      int totalCount = this.itemCounts.get(index);
      // Update the rating of the item
      this.ratings.set(index, currentRating + rating);
      // Update the item count of the item
      this.itemCounts.set(index, totalCount + 1);
    }
  }

  // Method to get the average rating of an item
  public double getAverageRating(String item) {
    // Get the index of the item in the menuItems ArrayList
    int index = this.menuItems.indexOf(item);
    // If the item exists in the menu
    if (index >= 0) {
      // Get the total rating of the item
      int totalRating = this.ratings.get(index);
      // Get the item count of the item
      int itemCount = this.itemCounts.get(index);
      // Calculate and return the average rating of the item
      return itemCount > 0 ? (double) totalRating / itemCount : 0.0;
    } else {
      // Return 0.0 if the item does not exist in the menu
      return 0.0;
    }
  }

  // Method to display the menu
  public void displayMenu() {
    // Loop through the menuItems ArrayList
    for (int i = 0; i < menuItems.size(); i++) {
      // Print the item and its price
      System.out.println(menuItems.get(i) + ": $" + prices.get(i));
    }
  }

  // Method to calculate the average rating of all items
  public double calculateAverageRating() {
    // Initialize totalRating to 0
    double totalRating = 0;
    // Initialize numRatings to 0
    int numRatings = 0;
    // Loop through the ratings ArrayList
    for (int i = 0; i < ratings.size(); i++) {
      // Add the rating to totalRating
      totalRating += ratings.get(i);
      // Increment numRatings
      numRatings++;
    }
    // Calculate and return the average rating
    return numRatings > 0 ? totalRating / numRatings : 0.0;
  }
}

The above Java class defines a restaurant with menu items, prices, and ratings. It has a constructor that initializes three ArrayLists for the menu items, prices, and ratings. It also has methods to add and remove items from the menu and add ratings for each item. The class also includes a method to calculate the average rating for a given menu item. It also includes a method to display the current menu.

// Main.java
// Define the Main class
public class Main {
  // Main method, the entry point of the application
  public static void main(String[] args) {
    // Create a new Restaurant object
    Restaurant restaurant = new Restaurant();
    // Add a Burger item with a price of $8.99 to the menu
    restaurant.addItem("Burger", 8.99);
    // Add a Pizza item with a price of $10.99 to the menu
    restaurant.addItem("Pizza", 10.99);
    // Add a Salad item with a price of $6.00 to the menu
    restaurant.addItem("Salad", 6.00);

    // Print the menu header
    System.out.println("Menu: Item & Price");
    // Display the menu items and their prices
    restaurant.displayMenu();

    // Add a rating of 4 to the Burger item
    restaurant.addRating("Burger", 4);
    // Add a rating of 5 to the Burger item
    restaurant.addRating("Burger", 5);
    // Add a rating of 3 to the Pizza item
    restaurant.addRating("Pizza", 3);
    // Add a rating of 4 to the Pizza item
    restaurant.addRating("Pizza", 4);
    // Add a rating of 2 to the Salad item
    restaurant.addRating("Salad", 2);

    // Get the average rating for the Burger item
    double averageRating = restaurant.getAverageRating("Burger");
    // Print the average rating for the Burger item
    System.out.println("\nAverage rating for Burger: " + averageRating);
    // Get the average rating for the Pizza item
    averageRating = restaurant.getAverageRating("Pizza");
    // Print the average rating for the Pizza item
    System.out.println("Average rating for Pizza: " + averageRating);
    // Get the average rating for the Salad item
    averageRating = restaurant.getAverageRating("Salad");
    // Print the average rating for the Salad item
    System.out.println("Average rating for Salad: " + averageRating);
    // Print the overall average rating for all items
    System.out.println("Average rating: " + restaurant.calculateAverageRating());

    // Print a message indicating that the Pizza item will be removed
    System.out.println("\nRemove 'Pizza' from the above menu.");
    // Remove the Pizza item from the menu
    restaurant.removeItem("Pizza");
    // Print the updated menu header
    System.out.println("\nUpdated menu:");
    // Display the updated menu items and their prices
    restaurant.displayMenu();
  }
}
The Main class contains the main function that creates an object of the Restaurant class and calls its methods to add, remove, and display menu items, as well as add ratings and calculate average ratings for those items.

Sample Output:

Menu:
Burger: $8.99
Pizza: $10.99
Salad: $6.0
Average rating: 4.666666666666667
Remove 'Pizza' from the above menu.

Updated menu:
Burger: $8.99
Salad: $6.0

### 19. Write a Java program to create a class with methods to search for flights and hotels, and to book and cancel reservations.

Write a Java program to create a class with methods to search for flights and hotels, and to book and cancel reservations.

Sample Solution:

Java Code:

// TravelApp.java
// Import the ArrayList class
import java.util.ArrayList;
// Import the Random class
import java.util.Random;

// Define the TravelApp class
public class TravelApp {
  // Declare an ArrayList to store flights
  private ArrayList flights;
  // Declare an ArrayList to store hotels
  private ArrayList hotels;

  // Constructor to initialize the ArrayLists
  public TravelApp() {
    // Initialize the flights ArrayList
    this.flights = new ArrayList();
    // Initialize the hotels ArrayList
    this.hotels = new ArrayList();
  }

  // Method to search for flights
  public void searchFlights(String origin, String destination, String date, int numPassengers) {
    // Print the search details for flights
    System.out.println("Searching for flights from " + origin + " to " + destination + " on " + date + " for " + numPassengers + " passengers.");
  }

  // Method to search for hotels
  public void searchHotels(String location, String checkIn, String checkOut, int numGuests) {
    // Print the search details for hotels
    System.out.println("Searching for hotels in " + location + " from " + checkIn + " to " + checkOut + " for " + numGuests + " guests.");
  }

  // Method to book a flight
  public void bookFlight(int flightNumber, String passengerName, String origin, String destination, String date, int numPassengers, double price) {
    // Create a new Flight object with the provided details
    Flight flight = new Flight(flightNumber, passengerName, origin, destination, date, numPassengers, price);
    // Generate a confirmation number
    int confirmationNumber = generateConfirmationNumber();
    // Set the confirmation number for the flight
    flight.setConfirmationNumber(confirmationNumber);
    // Add the flight to the flights ArrayList
    this.flights.add(flight);
    // Print the confirmation number for the booked flight
    System.out.println("Flight booked! Confirmation number: " + confirmationNumber);
  }

  // Method to book a hotel
  public void bookHotel(int hotelId, String guestName, String location, String checkIn, String checkOut, int numGuests, double price) {
    // Create a new Hotel object with the provided details
    Hotel hotel = new Hotel(hotelId, guestName, location, checkIn, checkOut, numGuests, price);
    // Generate a confirmation number
    int confirmationNumber = generateConfirmationNumber();
    // Set the confirmation number for the hotel
    hotel.setConfirmationNumber(confirmationNumber);
    // Add the hotel to the hotels ArrayList
    this.hotels.add(hotel);
    // Print the confirmation number for the booked hotel
    System.out.println("Hotel booked! Confirmation number: " + confirmationNumber);
  }

  // Method to cancel a reservation
  public void cancelReservation(int confirmationNumber) {
    // Loop through the flights ArrayList to find the reservation
    for (Flight flight : this.flights) {
      // If the confirmation number matches, remove the flight reservation
      if (flight.getConfirmationNumber() == confirmationNumber) {
        this.flights.remove(flight);
        // Print the cancellation message for the flight
        System.out.println("Flight reservation with confirmation number " + confirmationNumber + " cancelled.");
        return;
      }
    }
    // Loop through the hotels ArrayList to find the reservation
    for (Hotel hotel : this.hotels) {
      // If the confirmation number matches, remove the hotel reservation
      if (hotel.getConfirmationNumber() == confirmationNumber) {
        this.hotels.remove(hotel);
        // Print the cancellation message for the hotel
        System.out.println("Hotel reservation with confirmation number " + confirmationNumber + " cancelled.");
        return;
      }
    }
    // Print a message if no reservation is found with the provided confirmation number
    System.out.println("No reservation found with confirmation number " + confirmationNumber + ".");
  }

  // Method to generate a random 6-digit confirmation number
  private int generateConfirmationNumber() {
    // Create a Random object
    Random rand = new Random();
    // Generate and return a random 6-digit number
    return rand.nextInt(900000) + 100000;
  }
} 

The above Java class is used for searching and booking flights and hotels, as well as cancelling reservations. It contains methods to search for flights and hotels based on specific criteria, book flights and hotels by creating new Flight and Hotel objects, cancel reservations by confirmation number, and generate a random confirmation number using the Random class in Java. It also contains private instance variables to store ArrayLists of Flight and Hotel objects that represent the current reservations.

// Flight.java
// Define the Flight class
public class Flight {
    // Declare an integer variable to store the flight number
    private int flightNumber;
    // Declare a string variable to store the passenger name
    private String passengerName;
    // Declare a string variable to store the origin of the flight
    private String origin;
    // Declare a string variable to store the destination of the flight
    private String destination;
    // Declare a string variable to store the date of the flight
    private String date;
    // Declare an integer variable to store the number of passengers
    private int numPassengers;
    // Declare a double variable to store the price of the flight
    private double price;
    // Declare an integer variable to store the confirmation number
    private int confirmationNumber;

    // Constructor to initialize the Flight object with provided details
    public Flight(int flightNumber, String passengerName, String origin, String destination, String date, int numPassengers, double price) {
        // Initialize the flight number
        this.flightNumber = flightNumber;
        // Initialize the passenger name
        this.passengerName = passengerName;
        // Initialize the origin of the flight
        this.origin = origin;
        // Initialize the destination of the flight
        this.destination = destination;
        // Initialize the date of the flight
        this.date = date;
        // Initialize the number of passengers
        this.numPassengers = numPassengers;
        // Initialize the price of the flight
        this.price = price;
    }

    // Method to get the flight number
    public int getFlightNumber() {
        return flightNumber;
    }

    // Method to get the passenger name
    public String getPassengerName() {
        return passengerName;
    }

    // Method to get the origin of the flight
    public String getOrigin() {
        return origin;
    }

    // Method to get the destination of the flight
    public String getDestination() {
        return destination;
    }

    // Method to get the date of the flight
    public String getDate() {
        return date;
    }

    // Method to get the number of passengers
    public int getNumPassengers() {
        return numPassengers;
    }

    // Method to get the price of the flight
    public double getPrice() {
        return price;
    }

    // Method to get the confirmation number
    public int getConfirmationNumber() {
        return confirmationNumber;
    }

    // Method to set the confirmation number
    public void setConfirmationNumber(int confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }
} 
The above “Flight” class represents a flight. It has flight number, passenger name, origin, destination, date, number of passengers, price, and confirmation number. It has a constructor to create a Flight object and getters and setters to access and modify the object's properties. The confirmation number is set after a flight is booked to identify a reservation.

// Hotel.java
// Define the Hotel class
public class Hotel {
  // Declare an integer variable to store the hotel ID
  private int hotelId;
  // Declare a string variable to store the guest name
  private String name;
  // Declare a string variable to store the location of the hotel
  private String location;
  // Declare a string variable to store the check-in date
  private String checkIn;
  // Declare a string variable to store the check-out date
  private String checkOut;
  // Declare an integer variable to store the number of guests
  private int numGuests;
  // Declare a double variable to store the price of the stay
  private double price;
  // Declare an integer variable to store the confirmation number
  private int confirmationNumber;

  // Constructor to initialize the Hotel object with provided details
  public Hotel(int hotelId, String name, String location, String checkIn, String checkOut, int numGuests, double price) {
    // Initialize the hotel ID
    this.hotelId = hotelId;
    // Initialize the guest name
    this.name = name;
    // Initialize the location of the hotel
    this.location = location;
    // Initialize the check-in date
    this.checkIn = checkIn;
    // Initialize the check-out date
    this.checkOut = checkOut;
    // Initialize the number of guests
    this.numGuests = numGuests;
    // Initialize the price of the stay
    this.price = price;
  }

  // Method to get the hotel ID
  public int getHotelId() {
    return hotelId;
  }

  // Method to get the guest name
  public String getName() {
    return name;
  }

  // Method to get the location of the hotel
  public String getLocation() {
    return location;
  }

  // Method to get the check-in date
  public String getCheckIn() {
    return checkIn;
  }

  // Method to get the check-out date
  public String getCheckOut() {
    return checkOut;
  }

  // Method to get the price of the stay
  public double getPrice() {
    return price;
  }

  // Method to get the number of guests
  public int getNumGuests() {
    return numGuests;
  }

  // Method to get the confirmation number
  public int getConfirmationNumber() {
    return confirmationNumber;
  }

  // Method to set the confirmation number
  public void setConfirmationNumber(int confirmationNumber) {
    this.confirmationNumber = confirmationNumber;
  }
}
The above “Hotel” class represents a hotel, with an ID, a name, a location, a check-in date, a check-out date, a number of guests, a price, and a confirmation number. It contains a constructor that initializes these properties, as well as getter and setter methods for each property. The confirmation number is randomly generated and set through the setter method.

// Main.java
// Define the Main class
public class Main {
  // Main method, the entry point of the application
  public static void main(String[] args) {
    // Create a new TravelApp object
    TravelApp app = new TravelApp();
    // Search for flights from New York to London on 2022-09-01 for 1 passenger
    app.searchFlights("New York", "London", "2022-09-01", 1);
    // Search for hotels in London from 2022-08-01 to 2022-09-05 for 2 guests
    app.searchHotels("London", "2022-08-01", "2022-09-05", 2);
    // Book a flight with flight number 12345670 for Martin Nadine from New York to London on 2022-08-01 for 1 passenger with a price of $700.00
    app.bookFlight(12345670, "Martin Nadine", "New York", "London", "2022-08-01", 1, 700.00);
    // Book a flight with flight number 67843513 for Jennifer Ulrike from New York to London on 2022-08-01 for 1 passenger with a price of $655.00
    app.bookFlight(67843513, "Jennifer Ulrike", "New York", "London", "2022-08-01", 1, 655.00);
    // Book a hotel with hotel ID 98765432 for Martin Nadine in London from 2022-09-01 to 2022-09-05 for 1 guest with a price of $100.00
    app.bookHotel(98765432, "Martin Nadine", "London", "2022-09-01", "2022-09-05", 1, 100.00);
    // Cancel the reservation with confirmation number 12345670
    app.cancelReservation(12345670);
  }
} 
In the main() method of the above class, an instance of the “TravelApp” class is created. Several methods of the “TravelApp” class are called to perform various tasks related to travel. These tasks include searching for flights and hotels, booking flights and hotels, and cancelling reservations.


In particular, the “searchFlights()” method is called with the arguments "New York", "London", "2022-09-01", and 1, to search for flights from New York to London on September 1, 2022 for one passenger. Similarly, the “searchHotels()” method is called with the arguments "London", "2022-08-01", "2022-09-05", and 2, to search for hotels in London from August 1, 2022 to September 5, 2022 for two guests.


Then, two flights and one hotel are booked using the “bookFlight()” and “bookHotel()” methods respectively, with different arguments. Finally, a reservation for one of the flights is cancelled using the “cancelReservation()” method with the argument 12345670.

Sample Output:

Searching for flights from New York to London on 2022-09-01 for 1 passengers.
Searching for hotels in London from 2022-08-01 to 2022-09-05 for 2 guests.
Flight booked! Confirmation number: 528140
Flight booked! Confirmation number: 664315
Hotel booked! Confirmation number: 392396
No reservation found with confirmation number 12345670.

### 20. Write a Java program to create a class called "BankAccount" with attributes for account number, account holder's name, and balance. Include methods for depositing and withdrawing money, as well as checking the balance. Create a subclass called "SavingsAccount" that adds an interest rate attribute and a method to apply interest.

Write a Java program to create a class called "BankAccount" with attributes for account number, account holder's name, and balance. Include methods for depositing and withdrawing money, as well as checking the balance. Create a subclass called "SavingsAccount" that adds an interest rate attribute and a method to apply interest.

Sample Solution:

Java Code:

BankAccount.java

// Define the BankAccount class
public class BankAccount {

    // Attribute for account number
    private String accountNumber;
    
    // Attribute for account holder's name
    private String accountHolderName;
    
    // Attribute for account balance
    private double balance;

    // Constructor to initialize BankAccount object
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to check the account balance
    public double checkBalance() {
        return balance;
    }

    // Getter method for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter method for account holder's name
    public String getAccountHolderName() {
        return accountHolderName;
    }
}

The above Java code defines a BankAccount class with three attributes: accountNumber, accountHolderName, and balance. It includes a constructor to initialize these attributes when an object of this class is created. The class also provides methods to:

Deposit money (deposit): Adds a specified amount to the balance if the amount is positive.
Withdraw money (withdraw): Subtracts a specified amount from the balance if the amount is positive and does not exceed the current balance.
Check balance (checkBalance): Returns the current balance.
Get account number (getAccountNumber): Returns the account number.
Get the account holder's name (getAccountHolderName): Returns the account holder's name.
SavingsAccount.java

// Define the SavingsAccount subclass that extends BankAccount
class SavingsAccount extends BankAccount {

    // Attribute for interest rate
    private double interestRate;

    // Constructor to initialize SavingsAccount object
    public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance, double interestRate) {
        super(accountNumber, accountHolderName, initialBalance); // Call the constructor of the superclass
        this.interestRate = interestRate;
    }

    // Method to apply interest to the balance
    public void applyInterest() {
        double interest = checkBalance() * interestRate / 100; // Calculate interest
        deposit(interest); // Add interest to the balance
        System.out.println("Interest applied: " + interest + ". New balance: " + checkBalance());
    }

    // Getter method for interest rate
    public double getInterestRate() {
        return interestRate;
    }

    // Setter method for interest rate
    public void setInterestRate(double interestRate) {
        if (interestRate > 0) {
            this.interestRate = interestRate;
        } else {
            System.out.println("Interest rate must be positive.");
        }
    }
}
The above Java code defines a SavingsAccount class that extends the BankAccount class, inheriting its attributes and methods. The SavingsAccount class adds a new attribute, interestRate, which represents the interest rate for the savings account. The class includes:

Constructor: Initializes the SavingsAccount object with the account number, account holder's name, initial balance, and interest rate by calling the superclass (BankAccount) constructor for the common attributes.
Method to apply interest (applyInterest): Calculates interest based on the current balance and interest rate, then deposits interest into the account.
Getter method for interest rate (getInterestRate): Returns the current interest rate.
Setter method for interest rate (setInterestRate): Updates the interest rate if the provided rate is positive, ensuring it is a valid interest rate.
Main.java

// Main class to test the BankAccount and SavingsAccount classes
public class Main {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount("123456789", "Henri Lionel", 1000.0);
		System.out.println("Current balance: " + account.checkBalance()); // Check balance
        account.deposit(4000.0); // Deposit money
        account.withdraw(3000.0); // Withdraw money
        System.out.println("Current balance: " + account.checkBalance()); // Check balance

        // Create a SavingsAccount object
        SavingsAccount savings = new SavingsAccount("888888888", "Amphitrite Jun", 2000.0, 5.0);
        savings.applyInterest(); // Apply interest
        System.out.println("Savings account balance: " + savings.checkBalance()); // Check balance
    }
}
The above Java code defines a Main class with a main method to test the BankAccount and SavingsAccount classes. The main method demonstrates the creation and usage of these classes:

Create a BankAccount object: An instance of BankAccount is created with the account number "123456789", account holder's name "Henri Lionel", and an initial balance of 1000.0. The current balance is printed.
Deposit money: 4000.0 is deposited into the BankAccount.
Withdraw money: 3000.0 is withdrawn from the BankAccount.
Check balance: The current balance is printed again.
Create a SavingsAccount object: An instance of SavingsAccount is created with the account number "888888888", account holder's name "Amphitrite Jun", an initial balance of 2000.0, and an interest rate of 5.0.
Apply interest: Interest is applied to the SavingsAccount, and the new balance is printed.
This code tests the functionality of depositing, withdrawing, and applying interest in bank accounts.

Sample Output:

Current balance: 1000.0
Deposited: 4000.0. New balance: 5000.0
Withdrew: 3000.0. New balance: 2000.0
Current balance: 2000.0
Deposited: 100.0. New balance: 2100.0
Interest applied: 100.0. New balance: 2100.0
Savings account balance: 2100.0

### 21. Write a Java program to create a class called "Vehicle" with attributes for make, model, and year. Create subclasses "Car" and "Truck" that add specific attributes like trunk size for cars and payload capacity for trucks. Implement a method to display vehicle details in each subclass.



### 22. Write a Java program to create a class called "Customer" with attributes for name, email, and purchase history. Implement methods to add purchases to the history and calculate total expenditure. Create a subclass "LoyalCustomer" that adds a discount rate attribute and a method to apply the discount.



### 23. Write a Java program to create a class called "Course" with attributes for course name, instructor, and credits. Create a subclass "OnlineCourse" that adds attributes for platform and duration. Implement methods to display course details and check if the course is eligible for a certificate based on duration.



### 24. Write a Java program to create a class called "ElectronicsProduct" with attributes for product ID, name, and price. Implement methods to apply a discount and calculate the final price. Create a subclass " WashingMachine" that adds a warranty period attribute and a method to extend the warranty.



### 25. Write a Java program to create a class called "Building" with attributes for address, number of floors, and total area. Create subclasses "ResidentialBuilding" and "CommercialBuilding" that add specific attributes like number of apartments for residential and office space for commercial buildings. Implement a method to calculate the total rent for each subclass.



### 26. Write a Java program to create a class called "Event" with attributes for event name, date, and location. Create subclasses "Seminar" and "MusicalPerformance" that add specific attributes like number of speakers for seminars and performer list for concerts. Implement methods to display event details and check for conflicts in the event schedule.



### 27. Write a Java program to create a class called "CustomerOrder" with attributes for order ID, customer, and order date. Create a subclass "OnlineOrder" that adds attributes for delivery address and tracking number. Implement methods to calculate delivery time based on the address and update the tracking status.



### 28. Write a Java program to create a class called "Reservation" with attributes for reservation ID, customer name, and date. Create subclasses "ResortReservation" and "RailwayReservation" that add specific attributes like room number for hotels and seat number for flights. Implement methods to check reservation status and modify reservation details.



### 29. Write a Java program to create a class called "Pet" with attributes for name, species, and age. Create subclasses "Dog" and "Bird" that add specific attributes like favorite toy for dogs and wing span for birds. Implement methods to display pet details and calculate the pet's age in human years.



### 30. Write a Java program to create a class called "GymMembership" with attributes for member name, membership type, and duration. Create a subclass "PremiumMembership" that adds attributes for personal trainer availability and spa access. Implement methods to calculate membership fees and check for special offers based on membership type.

