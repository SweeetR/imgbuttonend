package com.example.roy.imgbuttonend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rnd=new Random();
    ImageView iv1;
    ImageButton ib1;
    int o;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv1=(ImageView) findViewById(R.id.iv1);
        ib1=(ImageButton) findViewById(R.id.ib1);
    }

    public void click(View view) {

        o=rnd.nextInt(3)+1;
        switch(o){
            case 1:ib1.setImageResource(R.drawable.one);
                iv1.setImageResource(R.drawable.meme);break;
            case 2:ib1.setImageResource(R.drawable.two);
                iv1.setImageResource(R.drawable.lol);break;
            case 3:ib1.setImageResource(R.drawable.three);
                iv1.setImageResource(R.drawable.smile);break;

        }
    }
}
