/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author LAVANYA
 */
public class Calculator {
    public static void main(String[] args)
    {
        
        Operation one = new Add();
        Operation two = new Subtract();
        Operation three = new Multiply();
        Calculator c = new Calculator();
        c.doOperator(one);
        c.doOperator(two);
        c.doOperator(three);
    }
    void doOperator(Operation opr)
    {
        int num1=10, num2=20;
        System.out.println("Input:" +num1 +", "+ num2);
       System.out.println(+ opr.getperformOperation(num1,num2));
    }
            
}
