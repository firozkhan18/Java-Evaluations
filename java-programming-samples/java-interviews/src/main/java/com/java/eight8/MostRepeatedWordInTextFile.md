How To Find The Most Repeated Word In Text File In Java?

Problem :

Write a java program to find the most repeated word in text file. 
Your program should take one text file as input and find out the most repeated word in that file.

How To Find The Most Repeated Word In Text File In Java?

Step 1 : Create one HashMap object called wordCountMap which will hold words of the input file as keys and their occurrences as values.

HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();

Step 2 : Create BufferedReader object to read the input text file.

BufferedReader reader = new BufferedReader(new FileReader(“Pass The File Location Here”));

Step 3 : Read all the lines of input text file one by one into currentLine using reader.readLine() method.

String currentLine = reader.readLine();

Step 4 : Split the currentLine into words by using space as delimiter. 
Use toLowerCase() method here if you don’t want case sensitiveness.

String[] words = currentLine.toLowerCase().split(” “);

Step 5 : Iterate through each word of words array and check whether the word is present in wordCountMap. 
If word is already present in wordCountMap, update its count. Otherwise insert the word as a key and 1 as its value.

if(wordCountMap.containsKey(word)){
         wordCountMap.put(word, wordCountMap.get(word)+1);
}
else{
         wordCountMap.put(word, 1);
}

Step 6 : Get the mostRepeatedWord and its count by iterating through each entry of the wordCountMap.

Step 7 : Close the resources.