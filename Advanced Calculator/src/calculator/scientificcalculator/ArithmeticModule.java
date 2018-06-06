package calculator.scientificcalculator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * The class ArithmeticModule performs the arithmetic calculations of the scientific calculator
 * such as squaring, cubing, finding roots, factorial, powers, negation, inversion, etc.
 * 
 * @version     1.0
 * @author      Anay Kulkarni.
 */
public class ArithmeticModule {    
    /**
     * This method simply returns the square of the number x.
     * @param x The number whose square is required.
     * @return The square of x.
     */    
    public double xSquare(double x){
        return (x*x);
    }
    
    /**
     * This method simply returns the cube of the number x.
     * @param x The number whose cube is required.
     * @return The cube of x.
     */
    public double xCube(double x){
        return (x*x*x);
    }
    
    /**
     * This method simply returns the inverse of the number x.
     * @param x The number whose cube is required.
     * @return The cube of x.
     */
    public double xInverse(double x){
        return (1.0/x);
    }
    
    /**
     * This method returns the negated number.
     * @param x number to be negated.
     * @return negation of x.
     */
    public double negate(double x){
        return (-1.0*x);
    }
    
    /**
     * This method calculates the result of x to the power y.
     * @param x variable for base value.
     * @param y variable for index value.
     * @return returns the value x to the power( x^y )
     */
    public double xPowerY(double x, double y){
        return Math.pow(x, y);
    }
    
    /**
     * This method return the yth root of x.
     * The root returned is the principal branch of all roots. For instance, a square root has two roots,
     * cube root has three, fourth root has four and so on. This method returns the principal branch only.
     * even roots of negative numbers produce complex numbers and hence the output will be of the form
     * <b>a + ib</b>. There are nine possible cases in total for the positive, negative and zero values of x and y.
     * The <b>special cases</b> would be,
     * <ul>
     * <li> when x=0 and y=0, result is undefined(NaN). </li>
     * <li> when x=0 and y&gt;0, result is zero. </li>
     * <li> when x=0 and y&lt;0, result is infinity. </li>
     * <li> when x&gt;0 and y=0, result is infinity. </li>
     * <li> when x&lt;0 and y=0, result is undefined(NaN). </li>
     * </ul>
     * @param x variable for base
     * @param y variable for root
     * @return the yth root of x in form of a complex number.
     */
    public String yRootX(double x, double y){
        
        if(x==0){
            if(y==0){
                return "NaN";                                                   //when x=0 and y=0
            } else if(y<0){
                return "infinity";                                              //when x=0 and y<0
            } else if(y>0){
                return "0";                                                     //when x=0 and y>0
            }
        } 
        else if(x > 0){
            if(y!=0)
                return Double.toString(Math.pow(x, (1.0/y)));                   //when x>0 and y not 0
            else 
                return "infinity";                                              //when x> 0 and y=0    
        }        
        else if(x < 0){                                                         
            if(y == 0){
                return "NaN";                                                   //since limit does not exist for negatives raised infinity. 
                                                                                //Result oscillates between -infinity and +infinity  
            }
            else if(y>0){
                double real;
                double imag;
                if(y % 2.0 == 0){
                    real = Math.pow( Math.abs(x), (1.0/y))*Math.cos(Math.PI/y); //even roots of negative numbers produce complex numbers.
                    imag = Math.pow( Math.abs(x), (1.0/y))*Math.sin(Math.PI/y); //calculated using Euler's formula and De'Moivre's theorem.
                                                                                //returns only the principal branch of roots.
                    
                    if(imag>0)                                                  
                        return String.format("%.6f + i%.6f", real, imag);
                    else if(imag<0)
                        return String.format("%.6f - i%.6f", real, Math.abs(imag));
                    else
                        return String.format("%.6f", real);
                }
                else{
                    return Double.toString(-1*Math.pow(Math.abs(x), (1.0/y)));  //principal branch of odd roots is a real number.
                }
            }else {
                y = Math.abs(y);
                double real;
                double imag;
                if(y % 2.0 == 0){
                    real = Math.pow( Math.abs(x), (1.0/y))*Math.cos(Math.PI/y); //even roots of negative numbers produce complex numbers.
                    imag = Math.pow( Math.abs(x), (1.0/y))*Math.sin(Math.PI/y); //calculated using Euler's formula and De'Moivre's theorem.
                                                                                //returns only the principal branch of roots.
                    
                    /* negative root of a number is equivalent to reciprocal of the positive root. Since, here the root is even
                     we perform inverse of complex number using the conjugate.
                    */ 
                    double productOfConjugates = ((real*real)+(imag*imag));
                    real = real/productOfConjugates;
                    imag = (-imag)/productOfConjugates;
                    
                    if(imag>0)                                                  
                        return String.format("%.6f + i%.6f", real, imag);
                    else if(imag<0)
                        return String.format("%.6f - i%.6f", real, Math.abs(imag));
                    else
                        return String.format("%.6f", real);
                }
                else{
                    return Double.toString(this.xInverse( -1*Math.pow(Math.abs(x), (1.0/y)) )); //principal branch of odd roots is a real number.
                }
            }
        }
        return "Error. Something went wrong";                                                         
    }
    
    /**
     * This method returns the square root of the number.
     * This method only works for non-negative inputs. To obtain square roots of negative numbers
     * use the yRootX() method as yRootX(x, 2). This will produce a complex number as output.
     * @param x The number whose square root is required.
     * @return the square root of x.
     */
    public Double squareRoot(double x) {
            return Math.sqrt(x);
    }
    
    /**
     * This method returns the factorial of a number.
     * @param n number whose factorial is to be computed.
     * @return factorial of n
     */
    public long nFactorial(int n){
        long fact=1;
        if(n==0 || n==1)
            return 1;
        for(int i=n ; i>1; i--)
            fact *= i;
        return fact;
    }

}