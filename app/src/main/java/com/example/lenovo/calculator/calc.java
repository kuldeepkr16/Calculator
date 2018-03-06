package com.example.lenovo.calculator;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
/**
 * Created by kuldeep on 10/21/2017.
 */

class calc {
    boolean chk(String str){
        char a= ' ';
        try{ a=str.charAt(str.length()-1); }catch (Exception e){return false;}
        if(a=='.' || a=='+'|| a=='-'|| a=='*'|| a=='/'|| a=='^'|| str.length()==0){
            return false;
        }
        else
            return true;
    }
    public String calculate(String exp) {
        double result=0.0;
        Expression expression=new ExpressionBuilder(exp).build();
        try{
            result=expression.evaluate();
        }catch (Exception e){}
        return result+"";
    }
}
