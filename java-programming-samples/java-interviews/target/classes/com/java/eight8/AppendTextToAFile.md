java.io.FileWriter class is used to write the characters to an existing text file. By default, it starts writing the characters from the beginning of a file by overwriting the existing content. You can change this by passing ‘true’ while constructing the FileWriter object. This opens the file in an append mode i.e it starts writing the characters at the end of a text file.


FileWriter fileWriter = new FileWriter(“Pass File Name Here”);     //Overwrites the text file

FileWriter fileWriter = new FileWriter(“Pass File Name Here”, false);     //Overwrites the text file

FileWriter fileWriter = new FileWriter(“Pass File Name Here”, true);     //Appends to the text file

Let’s see how to append text to a file in java using FileWriter class in detail.


How To Append Text To A File In Java Using FileWriter?

Step 1 : Open an existing text file in an append mode by passing ‘true’ while constructing the FileWriter object.

FileWriter fileWriter = new FileWriter(“Pass File Name Here”, true);

Step 2 : Bundle FileWriter object in BufferedWriter if you are writing lots of text.

BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

Step 3 : Use PrintWriter object if you are writing the text in multiple lines by wrapping BufferedWriter object in PrintWriter.

PrintWriter printWriter = new PrintWriter(bufferedWriter);

Step 4 : Use printWriter.println() method to write each line into a file.

printWriter.println(“Pass the string to be written here”);

Step 5 : Close the resources.