# Advanced-Calculator
### A calculator with features of a scientific calculator, programmer's calculator and date related calculations. The Advanced calculator is a Java Swing application developed using [JDK 1.8.0](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) and [NetBeans 8.2](https://netbeans.org/downloads/?pagelang=pt_BR).  
#### The project implements the SOLID design principles and Best Coding practices. The application development was Test-Driven and test cases for the code model have been implemented using JUnit classes. Also, the Java Documentation is available for the code model. 

#### Running the project:
- Clone the project in NetBeans and Run on JRE 1.8.0.

The advanced calculator application consists of three functional units,
1. Scientific Calculator 
2. Programmer’s Calculator
3. Date Calculator.

#### The scientific calculator -
  - It can perform arithmetic operations and solve simple arithmetic expressions such as ( (1+2) X 3/(23-1))% 3. _**NOTE**: When using brackets the following input is invalid 2(3+4). This should be written as 2 X (3+4). The multiplication should be specified explicitly. Same goes for the other arithmetic operators._    
  
  - Two operand arithmetic operations such as x<sup>y</sup> or <sup>y</sup>&radic;x , can be computed as follows,
  First give the x input and then click the operation followed by providing y input.  
  - Trigonometric operations such sine, cosine, tan, their hyperbolic counterparts and inverses can be performed. To calculate sin(45), first   input the angle, 45, and then click on the sin function button. Similarly for other functions.  
  - Exponential and logarithmic operations are also performed. They steps to compute are same as that for the trigonometric functions – first   the input is given and then the operation is specified.  
  - For calculating the trigonometric ratios with angles in degrees select the radio button 'Degrees'. Now all the input angles will taken in degrees.
  
  _**NOTE**: All arithmetic operations, except yth root of x, are computed extensively using the java.lang.Math class methods. Hence the Capabilities are limited to the those provided by that class. Only the yth root of x method is custom coded and works for all possible cases. The special cases have been mentioned in the java documentation. Complicated Expressions involving trigonometric, exponential, logarithmic and arithmetic computations combinedly cannot be evaluated._  
  
  #### The Programmer calculator -
  -It can perform basic arithmetic operation and some bitwise operations such as "1 or 2", " not 2 ",etc.
  
  _**NOTE** : After a operation is select the display becomes blank, please enter second value then and hit "=". No result will be show if "=" is not hit._
  
  - For Operations involing two input, like or, and , xor ,rsh , etc. please give the first input ,then hit on the operation to be performed ,then give second input and hit Equal to Button"=" for results.
  
  - For Operations involving one input, like not ,RoR ,RoL .First give the input, then select the operation to be performed and then hit equal to button ( = ).Else no result will be shown.
  
 - To Convert a decimal number into other base value systems. just enter the number and press Equal to sign ( = ).

#### Date and Time Calculation.

- This date and calculation involves two types like Finding the difference between two dates and for the current date or todays date , it adds the date or subtracts the date 
-Difference between two dates module takes two input dates with date month and year and it will show thw differnce between two dates in day ,month and year
-this  add or subtract module take input as date to either add or subtract. For the current date it will add the date or subtract the date and give result in date as day ,month and year 
