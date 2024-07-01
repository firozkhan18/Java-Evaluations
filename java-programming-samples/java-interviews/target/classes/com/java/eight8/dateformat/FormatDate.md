How To Format Date In Java?

SimpleDateFormat class of java.text package is used to format the given Date object in the desired pattern. This class has two important methods – parse() and format(). parse() method is used to convert the string to Date in java and format() method is used to format the Date object in desired patterns like dd-MM-yyyy, yyyy/MM/dd hh:mm:ss etc. This post concentrates only on how to format date in java in the various patterns using format() method.


How To Format Date In Java Using SimpleDateFormat Class?
Formatting the given Date object using SimpleDateFormat class involves two steps.

Step 1 : Instantiate SimpleDateFormat class by passing the desired pattern.

SimpleDateFormat formatter = new SimpleDateFormat(“dd-MM-yyyy”);

Step 2 : Call format() method by passing the Date object.

formatter.format(date);

Let’s see some examples to format date in java in various patterns. Before that go through the below image to know the valid patterns.

How To Format Date In Java

Pattern 1 : dd/MM/yyyy (Ex : 10/09/2016)

import java.text.SimpleDateFormat;
import java.util.Date;
 
public class MainClass
{
    public static void main(String[] args) 
    {
        //Getting today's date         
        Date today = new Date();         
        //Printing today's date in the default format         
        System.out.println("Today is : "+today);         
        //Formatting today's date in dd/MM/yyyy format         
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");         
        System.out.println("Today in dd/MM/yyyy format : "+formatter.format(today));
    }
}
Output :

Today is : Sat Sep 10 18:19:39 IST 2016
Today in dd/MM/yyyy format : 10/09/2016

Pattern 2 : yyyy-MM-dd (Ex : 2016-09-10)

import java.text.SimpleDateFormat;
import java.util.Date;
 
public class MainClass
{
    public static void main(String[] args) 
    {
        //Getting today's date         
        Date today = new Date();         
        //Printing today's date in the default format         
        System.out.println("Today is : "+today);         
        //Formatting today's date in yyyy-MM-dd format         
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");         
        System.out.println("Today in yyyy-MM-dd format : "+formatter.format(today));
    }
}
Output :

Today is : Sat Sep 10 18:22:57 IST 2016
Today in yyyy-MM-dd format : 2016-09-10

Pattern 3 : dd MMMM yyyy (Ex : 10 September 2016)

import java.text.SimpleDateFormat;
import java.util.Date;
 
public class MainClass
{
    public static void main(String[] args) 
    {
        //Getting today's date         
        Date today = new Date();         
        //Printing today's date in the default format         
        System.out.println("Today is : "+today);         
        //Formatting today's date in dd MMMM yyyy format         
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");         
        System.out.println("Today in dd MMMM yyyy format : "+formatter.format(today));
    }
}
Output :

Today is : Sat Sep 10 18:27:21 IST 2016
Today in dd MMMM yyyy format : 10 September 2016

Pattern 4 : E, dd MMM yyyy (Ex : Sat, 10 Sep 2016)

import java.text.SimpleDateFormat;
import java.util.Date;
 
public class MainClass
{
    public static void main(String[] args) 
    {
        //Getting today's date         
        Date today = new Date();         
        //Printing today's date in the default format         
        System.out.println("Today is : "+today);         
        //Formatting today's date in E, dd MMM yyyy format         
        SimpleDateFormat formatter = new SimpleDateFormat("E, dd MMM yyyy");         
        System.out.println("Today in E, dd MMM yyyy format : "+formatter.format(today));
    }
}
Output :


Today is : Sat Sep 10 18:34:05 IST 2016
Today in E, dd MMM yyyy format : Sat, 10 Sep 2016

Pattern 5 : dd-MMM-yyyy HH:mm:ss (Ex : 10-Sep-2016 18:40:47)

import java.text.SimpleDateFormat;
import java.util.Date;
 
public class MainClass
{
    public static void main(String[] args) 
    {
        //Getting today's date         
        Date today = new Date();         
        //Printing today's date in the default format         
        System.out.println("Today is : "+today);         
        //Formatting today's date in dd-MMM-yyyy HH:mm:ss format         
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");         
        System.out.println("Today in dd-MMM-yyyy HH:mm:ss format : "+formatter.format(today));
    }
}
Output :

Today is : Sat Sep 10 18:40:47 IST 2016
Today in dd-MMM-yyyy HH:mm:ss format : 10-Sep-2016 18:40:47

Pattern 6 : EEEE, MMM dd yyyy, hh:mm:ss a (Ex : Saturday, Sep 10 2016, 06:45:51 PM)

import java.text.SimpleDateFormat;
import java.util.Date;
 
public class MainClass
{
    public static void main(String[] args) 
    {
        //Getting today's date         
        Date today = new Date();         
        //Printing today's date in the default format         
        System.out.println("Today is : "+today);         
        //Formatting today's date in EEEE, MMM dd yyyy, hh:mm:ss a format         
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, MMM dd yyyy, hh:mm:ss a");         
        System.out.println("Today in EEEE, MMM dd yyyy, hh:mm:ss a format : "+formatter.format(today));
    }
}
Output :

Today is : Sat Sep 10 18:45:51 IST 2016
Today in EEEE, MMM dd yyyy, hh:mm:ss a format : Saturday, Sep 10 2016, 06:45:51 PM

Pattern 7 : dd-MMM-yyyy HH:mm:ss z (Ex : 10-Sep-2016 18:49:53 IST)

import java.text.SimpleDateFormat;
import java.util.Date;
 
public class MainClass
{
    public static void main(String[] args) 
    {
        //Getting today's date         
        Date today = new Date();         
        //Printing today's date in the default format         
        System.out.println("Today is : "+today);         
        //Formatting today's date in dd-MMM-yyyy HH:mm:ss z format         
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss z");         
        System.out.println("Today in dd-MMM-yyyy HH:mm:ss z format : "+formatter.format(today));
    }
}
Output :

Today is : Sat Sep 10 18:49:53 IST 2016
Today in dd-MMM-yyyy HH:mm:ss z format : 10-Sep-2016 18:49:53 IST

Pattern 8 : dd-MMM-yyyy HH:mm:ss Z (Ex : 10-Sep-2016 19:01:39 +0530)

import java.text.SimpleDateFormat;
import java.util.Date;
 
public class MainClass
{
    public static void main(String[] args) 
    {
        //Getting today's date         
        Date today = new Date();         
        //Printing today's date in the default format         
        System.out.println("Today is : "+today);         
        //Formatting today's date in dd-MMM-yyyy HH:mm:ss Z format         
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss Z");         
        System.out.println("Today in dd-MMM-yyyy HH:mm:ss Z format : "+formatter.format(today));
    }
}
Output :

Today is : Sat Sep 10 19:01:39 IST 2016
Today in dd-MMM-yyyy HH:mm:ss Z format : 10-Sep-2016 19:01:39 +0530