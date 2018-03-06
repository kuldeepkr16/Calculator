package com.example.lenovo.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView= (TextView) findViewById(R.id.textView);
        final Button btn1 = (Button) findViewById(R.id.btn1);
        final Button btn0 = (Button) findViewById(R.id.btn0);
        final Button btn2 = (Button) findViewById(R.id.btn2);
        final Button btn3 = (Button) findViewById(R.id.btn3);
        final Button btn4 = (Button) findViewById(R.id.btn4);
        final Button btn5 = (Button) findViewById(R.id.btn5);
        final Button btn6 = (Button) findViewById(R.id.btn6);
        final Button btn7 = (Button) findViewById(R.id.btn7);
        final Button btn8 = (Button) findViewById(R.id.btn8);
        final Button btn9 = (Button) findViewById(R.id.btn9);
        final Button btnplus = (Button) findViewById(R.id.btnplus);
        final Button btnminus = (Button) findViewById(R.id.btnminus);
        final Button btndot = (Button) findViewById(R.id.btndot);
        final Button btndivide = (Button) findViewById(R.id.btndivide);
        final Button btnmultiply = (Button) findViewById(R.id.btnmultiply);
        final Button btnclear = (Button) findViewById(R.id.btnclear);
        final Button btndelete = (Button) findViewById(R.id.btndelete);
        final Button btnequal = (Button) findViewById(R.id.btnequal);
        final Button btnpow = (Button) findViewById(R.id.btnpow);
        final Button btnsqrt = (Button) findViewById(R.id.btnsqrt);
        btn1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String text= textView.getText().toString();
                text= text + "1";
                textView.setText(text);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String text= textView.getText().toString();
                text= text + "2";
                textView.setText(text);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String text= (String) textView.getText();
                text= text + "3";
                textView.setText(text);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String text= (String) textView.getText();
                text= text + "4";
                textView.setText(text);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String text= (String) textView.getText();
                text= text + "5";
                textView.setText(text);
            }
        });
        btn0.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String text= textView.getText().toString();
                text= text + "0";
                textView.setText(text);            }
        });

        btn6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String text= textView.getText().toString();
                text= text + "6";
                textView.setText(text);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String text= (String) textView.getText();
                text= text + "7";
                textView.setText(text);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String text= (String) textView.getText();
                text= text + "8";
                textView.setText(text);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String text= (String) textView.getText();
                text= text + "9";
                textView.setText(text);
            }
        });
        btndot.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String text= (String) textView.getText();
                calc c=new calc();
                boolean chk=c.chk(text);
                if(chk) {
                    text = text + ".";
                    textView.setText(text);
                }
            }
        });
        btnplus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String text= (String) textView.getText();
                    calc c=new calc();
                    boolean chk=c.chk(text);
                    if(chk) {
                        text = text + "+";
                        textView.setText(text);
                        }
                }
        });
        btnminus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String text= (String) textView.getText();
                calc c=new calc();
                boolean chk=c.chk(text);
                if(chk) {
                    text = text + "-";
                    textView.setText(text);
                }
            }
        });
        btnmultiply.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String text= (String) textView.getText();
                calc c=new calc();
                boolean chk=c.chk(text);
                if(chk) {
                    text = text + "*";
                    textView.setText(text);
                }
            }
        });
        btndivide.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String text= (String) textView.getText();
                calc c=new calc();
                boolean chk=c.chk(text);
                if(chk) {
                    text = text + "/";
                    textView.setText(text);
                }
            }
        });
        btnpow.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String text= (String) textView.getText();
                calc c=new calc();
                boolean chk=c.chk(text);
                if(chk) {
                    text = text + "^";
                    textView.setText(text);
                }
            }
        });
        btnsqrt.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String text= (String) textView.getText();
                calc c=new calc();
                boolean chk=c.chk(text);
                if(chk){
                    try{
                        double d=Math.sqrt(Double.parseDouble(text));
                    text=""+d;
                    textView.setText(text);
                    }
                    catch (Exception e){
                        textView.setText("ERROR");
                    }
            }}
        });
        btnclear.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                textView.setText("");
            }
        });
        btndelete.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String text= (String) textView.getText();
                if(text!= null && text.length()>0) {
                    textView.setText(text.substring(0, text.length() - 1));
                }
            }
        });

        btnequal.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String text= (String) textView.getText();
                calc c=new calc();
                boolean chk=c.chk(text);
                if(chk) {
                    String text1 = c.calculate(text);
                    textView.setText(text1);
                }
            }
        });
    }
}
