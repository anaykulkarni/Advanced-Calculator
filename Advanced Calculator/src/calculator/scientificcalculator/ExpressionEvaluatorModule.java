/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.scientificcalculator;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * The class Expression evaluator contains a JavaScript engine to evaluate expressions as scripts.
 * The evaluate(exp) method evaluates the expression.
 * 
 * @version     1.0
 * @author      Anay Kulkarni
 */
public class ExpressionEvaluatorModule {
    
    //A JavaScript Engine to evaluate expressions.
    public static ScriptEngine jsEngine = new ScriptEngineManager().getEngineByExtension("js");
       
    /**
     * This method returns the result of a mathematical expression as a String.
     * @param expression the expression to be evaluated.
     * @return the value of the computed expression.
     */
    public String evaluate( String expression ){
        String result="";
        try{
            result = jsEngine.eval(expression).toString();
        }catch(ScriptException ex){
            ex.printStackTrace();
        }
        return result;
    }
}
