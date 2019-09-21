package com.hk.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView display;
private Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bPlus,bminus,bMultiply,bDevide,bEqual,bPoint,bReset;
public double n1,n2,ans;
boolean addition,subtraction,multiplication,devition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //calculating function
        calculate();
    }

    public void calculate(){
        display=findViewById(R.id.DisplayID);
        b0=findViewById(R.id.btn0ID);
        b1=findViewById(R.id.btn1ID);
        b2=findViewById(R.id.btn2ID);
        b3=findViewById(R.id.btn3ID);
        b4=findViewById(R.id.btn4ID);
        b5=findViewById(R.id.btn5ID);
        b6=findViewById(R.id.btn6ID);
        b7=findViewById(R.id.btn7ID);
        b8=findViewById(R.id.btn8ID);
        b9=findViewById(R.id.btn9ID);
        bPlus=findViewById(R.id.btnPlusID);
        bminus=findViewById(R.id.btnMinusID);
        bMultiply=findViewById(R.id.btnMultiplyID);
        bDevide=findViewById(R.id.btnDevideID);
        bPoint=findViewById(R.id.btnPointID);
        bEqual=findViewById(R.id.btnEqualID);
        bReset=findViewById(R.id.btnResetID);


        bReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=n2=0;
                display.setText("");

            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString()+"0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString()+"1");

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString()+"2");

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString()+"3");

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString()+"4");

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString()+"5");

            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString()+"6");

            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString()+"7");

            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString()+"8");

            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString()+"9");

            }
        });
        bPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString()+".");

            }
        });


        bPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().toString().isEmpty()){
                    display.setText("");
                }
                else {
                    n1=Double.parseDouble(display.getText().toString());
                    addition=true;
                    display.setText("");
                }

            }
        });

        bDevide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().toString().isEmpty()){
                    display.setText("");
                }
                else{
                    n1=Double.parseDouble(display.getText().toString());
                    devition=true;
                    display.setText("");
                }

            }
        });

        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().toString().isEmpty()){
                    display.setText("");
                }
                else{
                    n1=Double.parseDouble(display.getText().toString());
                    subtraction=true;
                    display.setText("");
                }

            }
        });

        bMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().toString().isEmpty()){
                    display.setText("");
                }
                else{
                    n1=Double.parseDouble(display.getText().toString());
                    multiplication=true;
                    display.setText("");
                }

            }
        });

        bEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().toString().isEmpty()){
                    if(n1>=0){
                        display.setText(""+n1);
                    }
                    else{
                        display.setText("");
                    }
                }
                else {
                    if (addition) {
                        n2 = Double.parseDouble(display.getText().toString());
                        ans = n1 + n2;
                        display.setText("" + ans);
                        addition = false;
                    }
                    else if (subtraction) {
                        n2 = Double.parseDouble(display.getText().toString());
                        ans = n1 - n2;
                        display.setText("" + ans);
                        subtraction = false;
                    }
                    else if (multiplication) {
                        n2 = Double.parseDouble(display.getText().toString());
                        ans = n1 * n2;
                        display.setText("" + ans);
                        multiplication = false;
                    }
                    else if (devition) {
                        n2 = Double.parseDouble(display.getText().toString());
                        ans = n1 / n2;
                        display.setText("" + ans);
                        devition = false;
                    }
                }
                }

        });
    }
}
