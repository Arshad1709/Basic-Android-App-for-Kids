package com.example.labca;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton imgButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton imgButton1 = (ImageButton)findViewById(R.id.imageButton1);
        ImageButton imgButton2 = (ImageButton)findViewById(R.id.imageButton2);
        ImageButton imgButton3 = (ImageButton)findViewById(R.id.imageButton3);
        ImageButton imgButton4= (ImageButton)findViewById(R.id.imageButton4);
        ImageButton imgButton5 = (ImageButton)findViewById(R.id.imageButton5);
        imgButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, secondActivity.class);
                intent.putExtra("USE_A_CONSTANT_HERE_AS_KEY", R.drawable.vid1);
                MainActivity.this.startActivity(intent);
            }
        });

        imgButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, thirdActivity.class);
                intent.putExtra("USE_A_CONSTANT_HERE_AS_KEY", R.drawable.vid2);
                MainActivity.this.startActivity(intent);
            }
        });

        imgButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, fourthActivity.class);
                intent.putExtra("USE_A_CONSTANT_HERE_AS_KEY", R.drawable.vid3);
                MainActivity.this.startActivity(intent);
            }
        });

        imgButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, fourthActivity.class);
                intent.putExtra("USE_A_CONSTANT_HERE_AS_KEY", R.drawable.vid4);
                MainActivity.this.startActivity(intent);
            }
        });
    }
}