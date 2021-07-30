# WaterOverflow

Find the next highest number with the same set of digits as given in the input.

A Maven project is created with all the dependencies included in the pom.xml file.

Solution.java - Java class with the main method and helper methods to find the total water capacity and filter inputs.  
WaterOverflowTest.java - Junit class which has a list of test cases to run the program against.

Prerequisite: Maven installed

# Assumptions
1. The amount of water added as input is in litres and glass capacity value will be returned in litres. If required to convert to ml, multiply the result by 1000 (Although this would still be displayed in the program output).
2. The row number and column number follow human readable inputs. For example: row 0 and column 0 does not exist in human world as it shoud start with 1. Please enter any value above 0.
3. There is some additional code written to demonstrate an OOP concept to show the extensibility of the system and not used for logic purpose.

# Steps to run the program: 

Prerequisite: Clone the above repository using git clone command. 
To run the program as a maven project using the command line please follow these steps:

Open cmd on the root folder "WaterOverflow".
To check tests run "mvn test"
Run "mvn package" to generate the application jar file.
Go to the target folder from root using "cd target" command and run "java -jar WaterOverflow-1.0-SNAPSHOT.jar".

# To run the program using any Java IDE

Import the project as a Maven project.
Run Solution.java to get the output in the IDE console. No command-line argument is needed.
Run WaterOverflowTest.java to run the Junit test cases.
