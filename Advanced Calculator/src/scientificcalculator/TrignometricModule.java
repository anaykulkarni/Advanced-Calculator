/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator;

/**
 * The class TrignometricModule contains methods to perform the trignometric calculations
 * of the scientific calculator such as Sine, Cosine and Tan ratios and their inverses.
 * 
 * @version     1.0
 * @author      Anay Kulkarni
 */
public class TrignometricModule {
    
    /**
     * This method returns the sine of the angle.
     * @param x an angle in radians
     * @return the value of sin(x).
     */
    public double sineX(double x){
        return Math.sin(x);
    }
    
    /**
     * This method returns the hyperbolic sine of the angle.
     * @param x an angle in radians
     * @return the value of sinh(x).
     */
    public double sinehX(double x){
        return Math.sinh(x);
    }
    
    /**
     * This method returns the cosine of the angle.
     * @param x an angle in radians
     * @return the value of cos(x).
     */
    public double cosX(double x){
        return Math.cos(x);
    }
    
    /**
     * This method returns the hyperbolic cosine of the angle.
     * @param x an angle in radians
     * @return the value of cosh(x).
     */
    public double coshX(double x){
        return Math.cosh(x);
    }
    
    /**
     * This method returns the tangent of the angle.
     * @param x an angle in radians
     * @return the value of tan(x).
     */
    public double tanX(double x){
        return Math.tan(x);
    }
    
    /**
     * This method returns the hyperbolic tangent of the angle.
     * @param x an angle in radians
     * @return the value of tanh(x).
     */
    public double tanhX(double x){
        return Math.tanh(x);
    }
    
    /**
     * This method returns the inverse of the sine ratio.
     * @param x a ratio between -1.0 to 1.0
     * @return the arc sine of the angle.
     */
    public double sineInverseX(double x){
        return Math.asin(x);
    }
    
    /**
     * This method returns the inverse of the cosine ratio.
     * @param x a ratio between -1.0 to 1.0
     * @return the arc cosine of the angle.
     */
    public double cosInverseX(double x){
        return Math.acos(x);
    }
    
    /**
     * This method returns the inverse of the tan ratio.
     * @param x a double value
     * @return the arc tan of the angle.
     */
    public double tanInverseX(double x){
        return Math.atan(x);
    }
    
    /**
     * This method returns the hyperbolic sine inverse of a ratio.
     * @param x a double value.
     * @return the value of sinh<sup>-1</sup>(x).
     */
    public double sinhInverseX(double x){
        return Math.log(x + Math.sqrt(x*x + 1));
    }
    
    /**
     * This method returns the hyperbolic cosine inverse of a ratio.
     * @param x a double value.
     * @return the value of cosh<sup>-1</sup>(x).
     */
    public double coshInverseX(double x){
        return Math.log(x + Math.sqrt(x*x - 1));
    }
    
    /**
     * This method returns the hyperbolic tan inverse of a ratio.
     * @param x a double value.
     * @return the value of tanh<sup>-1</sup>(x).
     */
    public double tanhInverseX(double x){
        return (0.5*Math.log((1+x)/(1-x)));
    }

}
