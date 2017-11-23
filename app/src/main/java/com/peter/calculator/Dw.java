package com.peter.calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class Dw extends Activity {
    /*输入文本框*/
    private EditText numEditText;
    /*显示结果*/
    private TextView showResultTextView;
    /*数字按钮*/
    private Button oneButton;
    private Button twoButton;
    private Button threeButton;
    private Button fourButton;
    private Button fiveButton;
    private Button sixButton;
    private Button sevenButton;
    private Button eightButton;
    private Button nineButton;
    private Button zeroButton;
    private Button pointButton;
    /*操作按钮*/
    private Button equalButton;//id.equal
    private Button ceButton;//id.delete
    private Button delButton;//id.clean
    private Button Button4;//KM
    private Button Button5;//M
    private Button Button6;//DM

    /*显示输入框中的文本*/
    private String numString="";

    /*设置小数点是否已经使用的标志*/
    private boolean isPoint=false;

    /*为了保存精度，需要记录输入的小数位数*/
    private int count=0;

    //保存计算结果
    private String resultString="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dw);

        init();
        OnListener();



    }

    private void init(){
        /*初始化组件*/
        numEditText=(EditText)findViewById(R.id.numEdit);

        showResultTextView=(TextView)findViewById(R.id.showResult);

        oneButton=(Button)findViewById(R.id.one);
        twoButton=(Button)findViewById(R.id.two);
        threeButton=(Button)findViewById(R.id.three);
        fourButton=(Button)findViewById(R.id.four);
        fiveButton=(Button)findViewById(R.id.five);
        sixButton=(Button)findViewById(R.id.six);
        sevenButton=(Button)findViewById(R.id.seven);
        eightButton=(Button)findViewById(R.id.eight);
        nineButton=(Button)findViewById(R.id.nine);
        zeroButton=(Button)findViewById(R.id.zero);

        pointButton=(Button)findViewById(R.id.point);
        ceButton=(Button)findViewById(R.id.delete);
        delButton=(Button)findViewById(R.id.clean);
        Button4=(Button)findViewById(R.id.button4);
        Button5=(Button)findViewById(R.id.button5);
        Button6=(Button)findViewById(R.id.button6);

    }

    private String D1000(double num){

        String resultString="";
        double a;
        a=num/1000000;

        resultString=""+a+"km";
        return resultString;
    }

    private String D100(double num){

        String resultString="";
        double a;
        a=num/1000;

        resultString=""+a+"m";
        return resultString;
    }
    private String D10(double num){

        String resultString="";
        double a;
        a=num*1000;

        resultString=""+a+"mm";
        return resultString;
    }





    private void OnListener(){
        /*设置监听*/

        /*等号的处理*/
        Button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                double result;
                if(numString!=""){
                    result=Double.parseDouble(numString);
                    resultString=D1000(result);
                }

                showResultTextView.setText(resultString);
            }
        });
       /* Button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                double result;
                if(numString!=""){
                    result=Double.parseDouble(numString);
                    resultString=D1000(result);
                }

                showResultTextView.setText(resultString);
            }
        });
*/



        Button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                double result;
                if(numString!=""){
                    result=Double.parseDouble(numString);
                    resultString=D100(result);
                }

                showResultTextView.setText(resultString);
            }
        });


        Button6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                double result;
                if(numString!=""){
                    result=Double.parseDouble(numString);
                    resultString=D10(result);
                }

                showResultTextView.setText(resultString);
            }
        });



        /*设置对CE的监听*/
        ceButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String s="";
                if(numString.length()!=0){

                    /*获取将要被删除的字符*/
                    s=numString.substring(numString.length()-1);

                    /*判断是否为.,若是则将小数点标志位置否，且将小数位数指0*/
                    if(s.equals(".")){
                        isPoint=false;
                        count=0;
                    }
                    //如果是在小数部分删除，计数减一
                    if(isPoint){
                        --count;
                    }

                    numString=numString.substring(0, numString.length()-1);
                }
                numEditText.setText(numString);
            }
        });

        /*设置对 清除按钮 的监听*/
        delButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                numString="";
                resultString="";
                numEditText.setText(numString);
                showResultTextView.setText(resultString);
                isPoint=false;
                count=0;
            }
        });

        /*对数字按钮的监听*/
        oneButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(isPoint){
                    ++count;
                }
                numString+="1";
                numEditText.setText(numString);
            }
        });

        twoButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(isPoint){
                    ++count;
                }
                numString+="2";
                numEditText.setText(numString);
            }
        });

        threeButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(isPoint){
                    ++count;
                }
                numString+="3";
                numEditText.setText(numString);
            }
        });

        fourButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(isPoint){
                    ++count;
                }
                numString+="4";
                numEditText.setText(numString);
            }
        });

        fiveButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(isPoint){
                    ++count;
                }
                numString+="5";
                numEditText.setText(numString);
            }
        });

        sixButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(isPoint){
                    ++count;
                }
                numString+="6";
                numEditText.setText(numString);
            }
        });

        sevenButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(isPoint){
                    ++count;
                }
                numString+="7";
                numEditText.setText(numString);
            }
        });

        eightButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(isPoint){
                    ++count;
                }
                numString+="8";
                numEditText.setText(numString);
            }
        });

        nineButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(isPoint){
                    ++count;
                }
                numString+="9";
                numEditText.setText(numString);
            }
        });

        zeroButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(isPoint){
                    ++count;
                }
                numString+="0";
                numEditText.setText(numString);
            }
        });

        pointButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(isPoint==false){
                    numString+=".";
                    numEditText.setText(numString);
                    isPoint=true;
                }
            }
        });
    }




}

