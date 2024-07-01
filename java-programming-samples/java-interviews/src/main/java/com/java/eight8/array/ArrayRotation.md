Array Rotation Program In Java

Array Rotation Program In Java :
Array rotation means you need to rotate the elements of an array in the right or left direction by given number of positions. For example, if {1, 2, 3, 4, 5, 6, 7} is an input array then rotating this array in the left direction by two positions will give {3, 4, 5, 6, 7, 1, 2} and rotating in the right direction by two positions will give {6, 7, 1, 2, 3, 4, 5}. Let’s discuss array rotation program in java in detail.


How To Rotate An Array In The Left Direction In Java?
Step 1 : Let inputArray be an array to be rotated left by n positions.

Step 2 : Print inputArray before rotation.

System.out.println(Arrays.toString(inputArray));

Step 3 : Define one temporary variable temp which will hold the first element of inputArray.


int temp;

Step 4 : First copy the first element of inputArray into temp and then shift all elements one position left. After shifting, copy back temp into inputArray as last element. Repeat this step n times.

for (int i = 0; i < n; i++)
{
        temp = inputArray[0];
        for (int j = 0; j < inputArray.length-1; j++)
        {
                inputArray[j] = inputArray[j+1];
        }
        inputArray[inputArray.length – 1] = temp;
}

Step 5 : Print the rotated inputArray.

System.out.println(Arrays.toString(inputArray));

Java Program To Left Rotate An Array :

import java.util.Arrays;
 
public class ArrayRotationProgram 
{
    private static void leftRotate(int[] inputArray, int n) 
    {
        System.out.println("Input Array Before Rotation :");         
        System.out.println(Arrays.toString(inputArray));         
        int temp;         
        for (int i = 0; i < n; i++)
        {
            temp = inputArray[0];             
            for (int j = 0; j < inputArray.length-1; j++) 
            {
                inputArray[j] = inputArray[j+1];
            }             
            inputArray[inputArray.length - 1] = temp;
        }         
        System.out.println("Input Array After Left Rotation By "+n+" Positions :");         
        System.out.println(Arrays.toString(inputArray));
    }     
    public static void main(String[] args) 
    {
        leftRotate(new int[] {1,2,3,4,5,6,7}, 2);
    }
}
Output :

Input Array Before Rotation :
[1, 2, 3, 4, 5, 6, 7]
Input Array After Left Rotation By 2 Positions :
[3, 4, 5, 6, 7, 1, 2]

Array Rotation Program In Java


How To Rotate An Array In The Right Direction In Java?
Step 1 : Let inputArray be an array to be rotated right by n positions.

Step 2 : Print inputArray before rotation.

System.out.println(Arrays.toString(inputArray));

Step 3 : Define one temporary variable temp which will hold the last element of inputArray.

int temp;

Step 4 : First copy the last element of inputArray into temp and then shift all elements one position right. After shifting, copy back temp as first element of inputArray. Repeat this step n times.

for (int i = 1; i <= n; i++)
{
        temp = inputArray[inputArray.length-1];
        for (int j = inputArray.length-1; j > 0; j–)
       {
                inputArray[j] = inputArray[j-1];
       }
       inputArray[0] = temp;
}

Step 5 : Print the rotated inputArray.

System.out.println(Arrays.toString(inputArray));

Java Program To Right Rotate An Array :

import java.util.Arrays;
 
public class ArrayRotationProgram 
{
    private static void rightRotate(int[] inputArray, int n)
    {
        System.out.println("Input Array Before Rotation :");         
        System.out.println(Arrays.toString(inputArray));         
        int temp;         
        for (int i = 1; i <= n; i++) 
        { 
            temp = inputArray[inputArray.length-1];              
            for (int j = inputArray.length-1; j > 0; j--) 
            {
                inputArray[j] = inputArray[j-1];
            }             
            inputArray[0] = temp;
        }         
        System.out.println("Input Array After Right Rotation By "+n+" Positions :");         
        System.out.println(Arrays.toString(inputArray));
    }     
    public static void main(String[] args) 
    {
        rightRotate(new int[] {1,2,3,4,5,6,7}, 2);
    }
}
Output :

Input Array Before Rotation :
[1, 2, 3, 4, 5, 6, 7]
Input Array After Right Rotation By 2 Positions :
[6, 7, 1, 2, 3, 4, 5]