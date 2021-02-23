package com.example.calendar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_mark1,et_mark2,et_mark3;
    TextView tv_mark,tv_calnd,tv_image;
    ImageView img_smile;
    Button btn_calender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_mark1 = findViewById(R.id.et_mark1);
        et_mark2 = findViewById(R.id.et_mark2);
        et_mark3 = findViewById(R.id.et_mark3);
        tv_mark = findViewById(R.id.tv_mark);
        tv_calnd = findViewById(R.id.tv_calend);
        tv_image = findViewById(R.id.tv_levle_mark);
        btn_calender = findViewById(R.id.btn_calender);
        img_smile = findViewById(R.id.img_smile);


        btn_calender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_mark1.getText().toString().length() == 0) {
                    et_mark1.setText("0");
                }
                if (et_mark2.getText().toString().length() == 0) {
                    et_mark2.setText("0");
                }
                if (et_mark3.getText().toString().length() == 0) {
                    et_mark3.setText("0");
                }
                int num1 = Integer.parseInt(et_mark1.getText().toString());
                int num2 = Integer.parseInt(et_mark2.getText().toString());
                int num3 = Integer.parseInt(et_mark3.getText().toString());
                int sum = num1 + num2 + num3;
                double avg = sum / 3 ;
                tv_mark.setText(String.valueOf(avg)+"%");

                if (avg>=90 && avg <100){
                   tv_calnd.setText("ممتاز");
                   tv_image.setText("A");
                   img_smile.setImageResource(R.drawable.ic_baseline_sentiment_very_satisfied_24);
                }
                else if(avg >= 80 && avg<90){
                    tv_calnd.setText("جيدجدا");
                    tv_image.setText("B");
                    img_smile.setImageResource(R.drawable.ic_baseline_sentiment_satisfied_alt_24);
                }
                else if(avg >= 70 && avg<80){
                    tv_calnd.setText("جيد");
                    tv_image.setText("C");
                    img_smile.setImageResource(R.drawable.ic_baseline_sentiment_satisfied_24);
                }
                else if(avg >= 60 && avg<70){
                    tv_calnd.setText("ضعيف");
                    tv_image.setText("D");
                    img_smile.setImageResource(R.drawable.ic_baseline_sentiment_dissatisfied_24);
                }
                else if(avg <= 60  ){
                    tv_calnd.setText("راسب");
                    tv_image.setText("F");
                    img_smile.setImageResource(R.drawable.ic_baseline_sentiment_very_dissatisfied_24);
                }
                else {
                    Toast.makeText(MainActivity.this, "القيمة خطا", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}