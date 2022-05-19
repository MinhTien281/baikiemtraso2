package com.example.baikiemtraso2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    EditText duonglich;
    TextView amlich;
    Button nutnhanchuyendoi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        duonglich=findViewById(R.id.duonglich);
        nutnhanchuyendoi=findViewById(R.id.nutnhanchuyendoi);
        amlich=findViewById(R.id.amlich);

        nutnhanchuyendoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View a) {
                String can[]={"Canh","Tân","Nhâm","Quý","Giáp","Ất","Bỉnh","Đinh","Mậu","kỷ"};
                String chi[]={"Thân","Dậu","Tuất","Hợi","Tý","sửu","Dần","Mẹo","Thìn","Tỵ","Ngọ","Mùi"};
                String di = duonglich.getText().toString();
                int m = Integer.parseInt(di);
                String am= can[m%10] + " " +chi[m%10];
                amlich.setText(am);
            }
        });
    }

    }

