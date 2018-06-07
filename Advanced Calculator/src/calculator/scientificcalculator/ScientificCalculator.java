/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.scientificcalculator;

/**
 * The ScientificCalculator Class contains various modules that together provide
 * the functionality of a scientific calculator.
 * 
 * @version     1.0
 * @author      Anay Kulkarni
 */
public class ScientificCalculator {
    
    /*
     * The modules of the scientific calculator.
     */
    public ArithmeticModule arihtmeticModule;
    public ExponentiationAndLogarithmicModule exponentialAndLogarithmicModule;
    public TrignometricModule trignometricModule;
    public ExpressionEvaluatorModule evaluator;
    
    /**
     * This method sets up the calculator by initializing the modules.
     */
    public void setUp(){
        arihtmeticModule = new ArithmeticModule();
        exponentialAndLogarithmicModule = new ExponentiationAndLogarithmicModule();
        trignometricModule = new TrignometricModule();
        evaluator = new ExpressionEvaluatorModule();
    }
    
}
