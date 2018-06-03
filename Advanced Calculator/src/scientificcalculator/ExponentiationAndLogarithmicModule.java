/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator;

/**
 * The class ExponentiationAndLogarithmicModule contains the methods to perform operations
 * such as e<sup>x</sup>, log<sub>10</sub>(x), log<sub>e</sub>(x) i.e., ln(x), 10<sup>x</sup>
 * ,etc.
 * 
 * @version     1.0
 * @author      Anay Kulkarni
 */
public class ExponentiationAndLogarithmicModule {
    
    /**
     * This method simply returns the value of e<sup>x</sup>
     * @param x the power of e.
     * @return returns the value of e<sup>x</sup>
     */
    public double ePowerX(double x){
        return Math.pow(Math.E, x);
    }
    
    /**
     * This method simply returns the value of log<sub>10</sub>(x).
     * @param x input for log function.
     * @return returns the value of log<sub>10</sub>(x)
     */
    public double logX(double x){
        return Math.log10(x);
    }
    
    /**
     * This method simply returns the value of log<sub>e</sub>(x).
     * @param x input for log function.
     * @return returns the value of log<sub>e</sub>(x)
     */
    public double lnX(double x){
        return Math.log(x);
    }
    
    /**
     * This method simply returns the value of log<sub>10</sub>(x).
     * @param x input for log function.
     * @return returns the value of 10<sup>x</sup>
     */
    public double tenPowerX( int x ){
        return Math.pow(10, x);        
    }
}
