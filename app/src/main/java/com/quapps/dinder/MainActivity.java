package com.quapps.dinder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ImageView dogImageView;
    ImageButton likeImageButton;
    ImageButton dislikeImageButton;
    RecyclerView recyclerView;
    List<String> imageList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dogImageView=findViewById(R.id.dogImageView);
        likeImageButton=findViewById(R.id.likeImageButton);
        dislikeImageButton=findViewById(R.id.dislikeImageButton);
        findViewById(R.id.recyclerView);
        likeImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Like */
            }
        });
        dislikeImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Dislike*/
            }
        });
    }
}