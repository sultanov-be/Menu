package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        TextView Item1 = (TextView) findViewById(R.id.menu_item_1);
        String menuItem1 = Item1.getText().toString();
        Log.v("MainActivity", menuItem1);

        TextView Item2 = (TextView) findViewById(R.id.menu_item_2);
        String menuItem2 = Item2.getText().toString();
        Log.v("MainActivity", menuItem2);

        TextView Item3 = (TextView) findViewById(R.id.menu_item_3);
        String menuItem3 = Item3.getText().toString();
        Log.v("MainActivity", menuItem3);
    }
}