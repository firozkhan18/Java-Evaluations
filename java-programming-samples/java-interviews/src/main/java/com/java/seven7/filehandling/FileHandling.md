How To Find Type, Total Space, Free Space And Usable Space Of All Drives In Java?
pramodbabladPRAMODBABLADOCTOBER 2, 2018FILE HANDLING1 COMMENT
We have seen some of the file handling programs like setting file permissions, sorting a text file, listing all files in a directory, comparing two text files, reading and writing images in java. Continuing from there, in this post we will see how to find type, total space, free space, usable space of all drives in java. First let’s see how to list all drives of a computer in java.


How to list all drives in java?
File.listRoots() method gives the list of all drives of your system. The following code snippet demonstrates how to list all drives of a computer using File.listRoots() method.

1
2
3
4
5
6
7
8
9
File[] drives = File.listRoots();
         
if(drives.length > 0 && drives != null)
{
    for (File drive : drives) 
    {
        System.out.println("Drive Name : "+drive);
    }
}
How To Find Type of A Drive In Java?
To find the type of a drive (Local disk or CD Drive or Floppy Disk), we use getFileSystemView() method of javax.swing.filechooser.FileSystemView. Below is the code snippet to find type of a drive in java.

1
2
3
FileSystemView fsv = FileSystemView.getFileSystemView();
 
System.out.println("Type Of Drive : "+fsv.getSystemTypeDescription(drive));
How To Find Total Space, Free Space And Usable Space In A Drive In Java?
There are three methods introduced in JDK 1.6 related to disk usage. They are getTotalSpace(), getFreeSpace() and getUsableSpace(). All these three methods are members of java.io.File class. Let’s see brief description about these methods.

1) long java.io.File.getTotalSpace() :


This method returns total size of a drive in bytes.

2) long java.io.File.getFreeSpace() :

This method returns free space available in a drive in bytes.

3) long java.io.File.getUsableSpace() :

This method returns number of bytes available to this virtual machine in a drive. This method checks write permissions and other operating system restrictions on a drive. Hence gives more accurate information on free space available in a drive than getFreeSpace() method.

getFreeSpace() Vs getUsableSpace() : getFreeSpace() returns total free space available in a drive to all the users. But, getUsableSpace() returns free space available in a drive to the current user. In some operating systems, some space is reserved to admin user. In such systems, getUsableSpace() gives more accurate information on free space available in a drive.

The following code snippet gives total space, free space and usable space in a drive in bytes.

long totalSpace = drive.getTotalSpace();
                 
long freeSpace = drive.getFreeSpace();
                 
long usableSpace = drive.getUsableSpace();
Type, Total Space, Free Space And Usable Space Of All Drives In Java

The following program demonstrates how to find type, total space, free space and usable space of all drives in java.

How To Find Type, Total Space, Free Space And Usable Space Of All Drives In Java?

import java.io.File;
import javax.swing.filechooser.FileSystemView;
 
public class FileHandlingProgram 
{
    public static void main(String[] args) 
    {
        FileSystemView fsv = FileSystemView.getFileSystemView();         
        File[] drives = File.listRoots();          
        if(drives.length > 0 && drives != null)
        {
            for (File drive : drives) 
            {   
                System.out.println("====================");                 
                System.out.println("Drive Name : "+drive);                 
                System.out.println("Type Of Drive : "+fsv.getSystemTypeDescription(drive));                 
                System.out.println("Total Space : "+drive.getTotalSpace()/(1024*1024*1024)+" GB");                 
                System.out.println("Free Space : "+drive.getFreeSpace()/(1024*1024*1024)+" GB");                 
                System.out.println("Usable Space : "+drive.getUsableSpace()/(1024*1024*1024)+" GB");
            }
        }
    }
}