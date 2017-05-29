/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domein;

import calcLibrary.CalculatorLibrary;
import calcLibrary.TargetDouble;

/**
 *
 * @author jasper
 */
public class CalculatorAdapter {

    
    private CalculatorLibrary calc;
    
    public CalculatorAdapter(){
        
    }
    
    public double add(int x, int y) {
        this.calc = new CalculatorLibrary((double) x, (double) y);
        return this.calc.add();
        
    }
    
}
