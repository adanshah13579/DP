/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interpreter;

/**
 *
 * @author skytech laptop store
 */
public class SonExpression implements Expression{
    private Expression fatherExpression = null;
    private Expression sonExpression = null;

    public SonExpression(Expression fatherExpression, Expression sonExpression) {
        this.fatherExpression = fatherExpression;
        this.sonExpression = sonExpression;
    }

    @Override
    public boolean interpret(String context) {
        return fatherExpression.interpret(context) && sonExpression.interpret(context);
    }
}