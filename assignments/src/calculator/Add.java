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
public class Add implements Operation {

    @Override
    public int getperformOperation(int num1, int num2) {
       int num3= num1+num2;
       return num3;
    }
    
}
