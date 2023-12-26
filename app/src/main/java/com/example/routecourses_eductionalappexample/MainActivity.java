package com.example.routecourses_eductionalappexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_android_course ;

    Button btn_ios_course ;
    Button btn_full_stack_course ;
    final static public String Key_1 = "content";
    final static public String Key_2 = "img";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_android_course = findViewById(R.id.btn_android_course);
        btn_ios_course = findViewById(R.id.btn_ios);
        btn_full_stack_course = findViewById(R.id.btn_fullstack_course);

        String android_course_content = getResources().getString(R.string.android_content_text);
        String ios_course_content = getResources().getString(R.string.ios_content_text);
        String fullstack_course_content = getResources().getString(R.string.full_stack_content_text);

        btn_android_course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Course_Page_model.class);
                intent.putExtra(Key_1,new CoursesContent(R.drawable.android,android_course_content));
                startActivity(intent);
            }
        });
        btn_ios_course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Course_Page_model.class);
                intent.putExtra(Key_1,new CoursesContent(R.drawable.ios,ios_course_content));
                startActivity(intent);
            }
        });
        btn_full_stack_course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Course_Page_model.class);
                intent.putExtra(Key_1,new CoursesContent(R.drawable.fullstack,fullstack_course_content));
                startActivity(intent);
            }
        });




    }


}