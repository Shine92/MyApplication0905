package com.example.shaoming.myapplication0905;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.tv);
    }
    public void bt1(View view){
        Log.i("ming","ok");
        textView.setText(createLottery());
    }
    private String createLottery(){
        TreeSet<Integer> set = new TreeSet<>();
        while (set.size()<6){
            set.add((int)(Math.random()*49+1));
        }
        return set.toString();
    }
}
