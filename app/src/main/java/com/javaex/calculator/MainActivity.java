package com.javaex.calculator;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // 필드
    private TextView text_display;
    private Button num_0;
    private Button num_1;
    private Button num_2;
    private Button num_3;
    private Button num_4;
    private Button num_5;
    private Button num_6;
    private Button num_7;
    private Button num_8;
    private Button num_9;
    private Button btn_add;
    private Button btn_sub;
    private Button btn_mul;
    private Button btn_div;
    private Button btn_ce;
    private Button btn_eq;
    private int btnType;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (view.getId()) {

                    case R.id.num_0:
                        Log.d("study", "0");
                        text_display.setText(text_display.getText().toString() + "0");

                        break;

                    case R.id.num_1:
                        Log.d("study", "1");
                        text_display.setText(text_display.getText().toString() + "1");

                        break;

                    case R.id.num_2:
                        Log.d("study", "2");
                        text_display.setText(text_display.getText().toString() + "2");

                        break;

                    case R.id.num_3:
                        Log.d("study", "3");
                        text_display.setText(text_display.getText().toString() + "3");

                        break;

                    case R.id.num_4:
                        Log.d("study", "4");
                        text_display.setText(text_display.getText().toString() + "4");

                        break;

                    case R.id.num_5:
                        Log.d("study", "5");
                        text_display.setText(text_display.getText().toString() + "5");

                        break;

                    case R.id.num_6:
                        Log.d("study", "6");
                        text_display.setText(text_display.getText().toString() + "6");

                        break;
                    case R.id.num_7:
                        Log.d("study", "7");
                        text_display.setText(text_display.getText().toString() + "7");

                        break;

                    case R.id.num_8:
                        Log.d("study", "8");
                        text_display.setText(text_display.getText().toString() + "8");

                        break;

                    case R.id.num_9:
                        Log.d("study", "9");
                        text_display.setText(text_display.getText().toString() + "9");

                        break;

                    case R.id.btn_add:
                        Log.d("study", "+");
                        text_display.setText(text_display.getText().toString() + "+");
                        btnType = 1;

                        break;
                    case R.id.btn_sub:
                        Log.d("study", "-");
                        text_display.setText(text_display.getText().toString() + "-");
                        btnType = 2;

                        break;

                    case R.id.btn_mul:
                        Log.d("study", "*");
                        text_display.setText(text_display.getText().toString() + "*");
                        btnType = 3;

                        break;

                    case R.id.btn_div:
                        Log.d("study", "/");
                        text_display.setText(text_display.getText().toString() + "/");
                        btnType = 4;

                        break;

                    case R.id.btn_ce:
                        Log.d("study", "ce");
                        text_display.setText("");

                        break;

                    case R.id.btn_eq:
                        Log.d("study", "=");

                        String result = "";

                        if (btnType == 1) {
                            String[] addArray = text_display.getText().toString().split("\\+");
                            int add = Integer.parseInt(addArray[0]) + Integer.parseInt(addArray[1]);
                            result = add + "";

                        } else if (btnType == 2) {
                            String[] subArray = text_display.getText().toString().split("-");
                            int sub = Integer.parseInt(subArray[0]) - Integer.parseInt(subArray[1]);
                            result = sub + "";

                        } else if (btnType == 3) {
                            String[] mulArray = text_display.getText().toString().split("\\*");
                            int mul = Integer.parseInt(mulArray[0]) * Integer.parseInt(mulArray[1]);
                            result = mul + "";

                        } else if (btnType == 4) {
                            String[] divArray = text_display.getText().toString().split("/");
                            double div = (double) Integer.parseInt(divArray[0]) / (double) Integer.parseInt(divArray[1]);
                            result = div + "";

                        }

                        text_display.setText(result);
                        break;
                }

            }
        };

        text_display = (TextView) findViewById(R.id.text_display);

        num_0 = (Button) findViewById(R.id.num_0);
        num_0.setOnClickListener(listener);

        num_1 = (Button) findViewById(R.id.num_1);
        num_1.setOnClickListener(listener);

        num_2 = (Button) findViewById(R.id.num_2);
        num_2.setOnClickListener(listener);

        num_3 = (Button) findViewById(R.id.num_3);
        num_3.setOnClickListener(listener);

        num_4 = (Button) findViewById(R.id.num_4);
        num_4.setOnClickListener(listener);

        num_5 = (Button) findViewById(R.id.num_5);
        num_5.setOnClickListener(listener);

        num_6 = (Button) findViewById(R.id.num_6);
        num_6.setOnClickListener(listener);

        num_7 = (Button) findViewById(R.id.num_7);
        num_7.setOnClickListener(listener);

        num_8 = (Button) findViewById(R.id.num_8);
        num_8.setOnClickListener(listener);

        num_9 = (Button) findViewById(R.id.num_9);
        num_9.setOnClickListener(listener);

        btn_add = (Button) findViewById(R.id.btn_add);
        btn_add.setOnClickListener(listener);

        btn_sub = (Button) findViewById(R.id.btn_sub);
        btn_sub.setOnClickListener(listener);

        btn_mul = (Button) findViewById(R.id.btn_mul);
        btn_mul.setOnClickListener(listener);

        btn_div = (Button) findViewById(R.id.btn_div);
        btn_div.setOnClickListener(listener);

        btn_ce = (Button) findViewById(R.id.btn_ce);
        btn_ce.setOnClickListener(listener);

        btn_eq = (Button) findViewById(R.id.btn_eq);
        btn_eq.setOnClickListener(listener);
    }
}