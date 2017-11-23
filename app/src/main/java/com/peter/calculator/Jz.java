package com.peter.calculator;

import android.app.Activity;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.lang.String;
/**
 * Created by jingmianshitai on 2017/11/16.
 */

public class Jz extends Activity {
    private TextView textView;
    private EditText input;
    private Button btn2;
    private Button btn8;
    private Button btn16;

    private String string = "";
    private String result2 = "";
    private String result8 = "";
    private String result16 = "";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jz);
        processExtraData();

        input = (EditText) findViewById(R.id.input);
        textView = (TextView) findViewById(R.id.textView);
        btn2 = (Button) findViewById(R.id.btn2);
        btn8 = (Button) findViewById(R.id.btn8);
        btn16 = (Button) findViewById(R.id.btn16);

        //十转二
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = input.getText().toString();
                String b2 = Integer.toBinaryString(Integer.parseInt(a, 10));
                textView.setText(b2);
            }
        });

        //十转八
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = input.getText().toString();
                String b8 = Integer.toBinaryString(Integer.parseInt(a, 10));
                textView.setText(b8);
            }
        });
        //十转十六
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = input.getText().toString();
                String b16 = Integer.toBinaryString(Integer.parseInt(a, 10));
                textView.setText(b16);
            }
        });

    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        processExtraData();
    }

    private void processExtraData() {
        Intent intent = getIntent();
    }
}

