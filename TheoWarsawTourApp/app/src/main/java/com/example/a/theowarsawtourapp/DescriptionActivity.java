package com.example.a.theowarsawtourapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        //Catch the data passed in the fragment. The Image
        int preImage = getIntent().getIntExtra("Image", 0);
        //and the description that was in the constructor
        int description = getIntent().getIntExtra("Desc", 0);
        //create the vies to fill them
        ImageView headerImage = (ImageView) findViewById(R.id.header_image);
        TextView placeDesc = (TextView) findViewById(R.id.description_text);
        headerImage.setImageResource(preImage);
        placeDesc.setText(description);


    }
}
