# Advanced-Calculator
### A calculator with features of a scientific calculator, programmer's calculator and date related calculations. The Advanced calculator is a Java Swing application developed using [JDK 1.8.0](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) and [NetBeans 8.2](https://netbeans.org/downloads/?pagelang=pt_BR)  

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
  
  
