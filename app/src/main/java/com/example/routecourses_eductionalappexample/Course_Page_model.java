package com.example.routecourses_eductionalappexample;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Course_Page_model extends AppCompatActivity {
    private ImageView course_image;
    private TextView content_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_page_model);
        course_image = findViewById(R.id.img_android_course);
        content_tv = findViewById(R.id.tv_course_content);


        if (getIntent() != null && getIntent().getExtras() != null && getIntent().hasExtra(MainActivity.Key_1)){
            CoursesContent coursesContent= getIntent().getParcelableExtra(MainActivity.Key_1);
            assert coursesContent != null;
            content_tv.setText(coursesContent.content);
            course_image.setImageResource(coursesContent.img_id);
        }


    }
}