List All Files In Directory – With Java 8 Examples

File handling is an important topic in java. You will face many questions on this topic in your interview. I have covered some of the questions asked in interview on File Handling – how to sort a text file, how to find most repeated word in a text file, count chars, words & lines in a text file,  append text to a file, comparing two text files, setting file permissions etc… You can go through more file handling programs here. Continuing from there, in this post, we will learn how to list all files in directory in java with some simple examples along with java 8 code.

java.io.File class has 5 different methods to get list of all files and directories in a directory. The below image describes those methods and when to use them. In Java 8, two more methods are introduced in java.nio.file.Files class. We will also see them at the end.


How To List All Files In Directory In Java
Note : FileNameFilter uses just names of the files to filter them. If you want to filter the files using other properties like size of the file, use FileFilter.

Let’s see some of the examples on how to get list of all files and folders in a folder using above methods.

File.list() Method Example :

import java.io.File;
 
public class MainClass
{
    public static void main(String[] args)
    {
        File folder = new File("F:/Path"); 
        String[] files = folder.list(); 
        for (String file : files)
        {
            System.out.println(file);
        }
    }
}
File.listFiles() Method Example :

import java.io.File;
 
public class MainClass
{
    public static void main(String[] args)
    {
        File folder = new File("F:/Path"); 
        File[] files = folder.listFiles(); 
        for (File file : files)
        {
            System.out.println(file.getName());
        }
    }
}
File.listFiles(FilenameFilter filter) Method Example :

import java.io.File;
import java.io.FilenameFilter;
 
public class MainClass
{
    public static void main(String[] args)
    {
        File folder = new File("C:/Path"); 
        //Implementing FilenameFilter to retrieve only txt files 
        FilenameFilter txtFileFilter = new FilenameFilter()
        {
            @Override
            public boolean accept(File dir, String name)
            {
                if(name.endsWith(".txt"))
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }; 
        //Passing txtFileFilter to listFiles() method to retrieve only txt files 
        File[] files = folder.listFiles(txtFileFilter); 
        for (File file : files)
        {
            System.out.println(file.getName());
        }
    }
}
File.listFiles(FileFilter filter) Method Example :

import java.io.File;
import java.io.FileFilter;
 
public class MainClass
{
    public static void main(String[] args)
    {
        File folder = new File("C:/Path"); 
        //Implementing FileFilter to retrieve the files smaller than 10MB 
        FileFilter sizeFilter = new FileFilter()
        {
            @Override
            public boolean accept(File file)
            {
                if(file.length() < 10*1024*1024)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }; 
        //Passing sizeFilter to listFiles() method 
        File&#91;&#93; files = folder.listFiles(sizeFilter); 
        for (File file : files)
        {
            System.out.println(file.getName());
        }
    }
}
&#91;/java&#93;
<!-- /wp:shortcode -->
 
<!-- wp:paragraph -->
<p>Some other examples.....</p>
<!-- /wp:paragraph -->
 
<!-- wp:heading {"level":4} -->
<h4>How To List Only The Files In A Directory?</h4>
<!-- /wp:heading -->
 
<!-- wp:shortcode -->
[java]
import java.io.File;
 
public class MainClass
{
    public static void main(String[] args)
    {
        File folder = new File("F:/Path"); 
        File[] files = folder.listFiles(); 
        for (File file : files)
        {
            if (file.isFile())
            {
                System.out.println(file.getName());
            }
        }
    }
}
How to list only the sub directories in a directory?

import java.io.File;
 
public class MainClass
{
    public static void main(String[] args)
    {
        File folder = new File("F:/Path"); 
        File[] files = folder.listFiles(); 
        for (File file : files)
        {
            if (file.isDirectory())
            {
                System.out.println(file.getName());
            }
        }
    }
}
How to list all files in directory and its sub directories recursively?

import java.io.File;
 
public class MainClass
{
    private static void listFiles(String path)
    {
        File folder = new File(path);
         File[] files = folder.listFiles(); 
        for (File file : files)
        {
            if (file.isFile())
            {
                System.out.println(file.getName());
            }
            else if (file.isDirectory())
            {
                listFiles(file.getAbsolutePath());
            }
        }
    } 
    public static void main(String[] args)
    {
        listFiles("F:/Path");
    }
}
Java 8 Methods :
In Java 8, two more methods are introduced in java.nio.file.Files class to iterate over a file hierarchy and get list of all files and directory in it. They are – Files.walk() and Files.list(). The main difference between these two methods is, Files.walk() recursively traverses the given directory and it’s sub-directories to get list of all the files and folders in the hierarchy. Files.list() traverses only the current directory. Let’s see them in detail.


1) Stream<Path> Files.list(Path dir) throws IOException

This method returns a lazy Stream of Path objects where each object represents an entry in the directory. The listing is not recursive.

2) Stream<Path> Files.walk(Path start, FileVisitOption… options) throws IOException

This method returns a lazy Stream of Path objects by walking the file tree rooted at a given starting file start. The listing is recursive. That means this method recursively traverses the given directory and its sub-directories to get list of all the files.

Let’s see how to list files in directory using above java 8 methods.

Files.list() Java 8 Method Example : List All Files And Directories

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
 
public class Java8ListFilesInDirectory 
{
    public static void main(String[] args) throws IOException
    {
        Stream<Path> files = Files.list(Paths.get("F:\\Games"));         
        files.forEach(System.out::println);         
        files.close();
    }
}
Files.walk() Java 8 Method Example : List All Files And Directories

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
 
public class Java8ListFilesInDirectory 
{
    public static void main(String[] args) throws IOException
    {
        Stream<Path> files = Files.walk(Paths.get("F:\\Games"));         
        files.forEach(System.out::println);         
        files.close();
    }
}
Java 8 Coding Examples :
1 ) List Only Files


//Using Files.list() method
         
Files.list(Paths.get("F:\\Games")).filter(Files::isRegularFile).forEach(System.out::println);
                 
//using Files.walk() method
                 
Files.walk(Paths.get("F:\\Games")).filter(Files::isRegularFile).forEach(System.out::println);
2) List Only Directories


//Using Files.list() method
         
Files.list(Paths.get("F:\\Games")).filter(Files::isDirectory).forEach(System.out::println);
                 
//using Files.walk() method
                 
Files.walk(Paths.get("F:\\Games")).filter(Files::isDirectory).forEach(System.out::println);
3) List Only Text Files

//Using Files.list() method
         
Files.list(Paths.get("F:\\Games")).filter(path -> path.toString().endsWith(".txt")).forEach(System.out::println);
                 
//using Files.walk() method
                 
Files.walk(Paths.get("F:\\Games")).filter(path -> path.toString().endsWith(".txt")).forEach(System.out::println);
4) List Only Hidden Files


//Using Files.list() method
         
Files.list(Paths.get("F:\\Games")).filter(file -> {
    try {
        return Files.isHidden(file);
    } catch (IOException e) {
        e.printStackTrace();
    }
    return false;
}).forEach(System.out::println);
                 
//using Files.walk() method
                 
Files.walk(Paths.get("F:\\Games")).filter(file -> {
    try {
        return Files.isHidden(file);
    } catch (IOException e) {
        e.printStackTrace();
    }
    return false;
}).forEach(System.out::println);