Problem :
Write a java program to find number of characters, number of words and number of lines in a text file.

How To Find Number Of Characters, Words And Lines In File In Java?

Step 1 : Create BufferedReader object to read the text file.

BufferedReader reader = new BufferedReader(new FileReader(“Pass The File Location Here”));

Step 2 : Initialize charCount, wordCount and lineCount to 0.

int charCount = 0;
int wordCount = 0;
int lineCount = 0;


Step 3 : Read all the lines of the text file one by one into currentLine using reader.readLine() method.

String currentLine = reader.readLine();

Step 4 : Update lineCount each time we read the line into currentLine.

lineCount++;

Step 5 : We get the number of words in a line by splitting the currentLine by space.

String[] words = currentLine.split(” “);

Step 6 : Update the wordCount by adding the number of words in a line.

wordCount = wordCount + words.length;

Step 7 : Update charCount by iterating through words array as below,

for (String word : words)
{
       charCount = charCount + word.length();
}

Step 8 : Close BufferedReader object.

Java Program To Find Number Of Characters, Words And Lines In A File :
Input File : sample.txt

Java JDBC JSP Servlets
Struts Hibernate Web Services
Spring JSF
Java Threads Concurrent Programming