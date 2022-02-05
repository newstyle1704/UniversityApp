package com.example.dip;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CoursePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_page);

        ConstraintLayout courseBg = findViewById(R.id.CoursePageBg);
        ImageView courseImage = findViewById(R.id.CoursePageImage);
        TextView courseTitle = findViewById(R.id.CoursePageTitle);
        TextView courseLevel = findViewById(R.id.coursePageLevel);
        TextView courseFak = findViewById(R.id.coursePageFak);

        courseBg.setBackgroundColor(getIntent().getIntExtra("courseBg",0 ));
        courseImage.setImageResource(getIntent().getIntExtra("courseImage",0));
        courseTitle.setText(getIntent().getStringExtra("courseTitle"));
        courseLevel.setText(getIntent().getStringExtra("courseLevel"));
        courseFak.setText(getIntent().getStringExtra("courseFak"));

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CoursePage.this, PdfActivity.class );
                startActivity(intent);
            }
        });
    }
}