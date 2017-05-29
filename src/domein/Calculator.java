/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domein;

/**
 *
 * @author jasper
 */
public class Calculator {

    private int x;
    private int y;
    CalculatorAdapter adapter;
    
    public Calculator(int x, int y){
        this.x = x;
        this.y = y;
        adapter = new CalculatorAdapter();
    }
    
    
    public long add() {
        return (long) adapter.add(x,y);
    }
    
}
