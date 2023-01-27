# Java-Lab-003

Objectives

* Write a program that reads text typed by a person.
* Understand Precedence and Parentheses as well as when to use integers or floating point numbers in calculations.
* See why using formatting for console output is preferable to concatenation.
 
### Part 1 - Reading Input - MrRoboto.java - [Mr. Roboto Official Video](https://www.youtube.com/watch?v=uc6f_2nPSX8)

* Input is text typed by a person and read by a program.
* Input is always read as a string
* Java provides the Scanner class to aid reading input, but it must be imported into your program to use it.
* Library imports belong at the top of your java/class files before the class definition. The Scanner import is shown below.
```
import java.util.Scanner;
```
* You must create an *instance* of the Scanner class to use it.
* An instantiation statement for an instance of the Scanner class is below.
```
Scanner scanner = new Scanner(System.in);.
```
* System.in refers to the *console* input or *stdin* (Standard Input).

* Modify MrRoboto.java to do the following:
    * Where the comment *// Write your program here* exists, use the scanner instance to read standard in and wait for the user to press *Enter*.
    * After the enter key is pressed, your program should print the string typed by the user, initially you, concatenated to the String variable *domo*.
    * See [Oracle's Scanner Javadoc](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html) to read all the data types Scanner can read (You want to read a String)
        * Hint: you're looking for a method -> *nextLine*
    * Output should look something like this:
    ```
    My name is Mr. Roboto, are you Kilroy? no, I'm stan
    Domo arigato no, I'm stan
    ```

### Part 2 - Temperature Conversion 

* In this lab implement a program that asks the user for the temperature in °F and converts it to °C.
    * The function for conversion is: Y°C = (X°F - 32) x (5/9)
    * Pay attention to integer division!
* After you've converted the temperature, print out the following:
    * The *X°F*  the user typed
    * The *Y°C* you converted as a floating point number
    * The *Y°C* as an integer
    * The *String* "If it were 2°C warmer it would be: 2 + Y°C" (Do the calculation and concatenation)
* Output should like something like below for 50°F
```
What is the temperature in °F: 50
50°F
10.000000°C
10°C
If it were 2°C warmer it would be: 12.000000°C
```

### Part 3 - Submission
* Make sure you've commented your code.
* Make sure you've created your Spring2023 feature branch.
* Commit your locally functional code.
* Push it to your Remote/origin branch (i.e. GitHub).
* Then issue a Pull request to the instructor branch that your forked from.
    * Make sure to save the Pull request URL and submit it for the lab in Canvas.
