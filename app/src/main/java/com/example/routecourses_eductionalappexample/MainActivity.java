package com.example.routecourses_eductionalappexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_android_course ;
    final static public String Key_1 = "content";
    final static public String Key_2 = "img";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_android_course = findViewById(R.id.btn_android_course);
        String android_course_content = getResources().getString(R.string.android_content_text);
        btn_android_course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Course_Page_model.class);
                intent.putExtra(Key_1,new CoursesContent(R.drawable.android,android_course_content));
            }
        });
    }


}