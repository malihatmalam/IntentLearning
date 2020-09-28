package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {
    private int count = 0;
    private TextView showCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCount = (TextView) findViewById(R.id.Show_Count);
    }

    public void ShowCount(View view) {
        count++;
        if(showCount != null){
            showCount.setText( count + "");

        }
    }

    public void ShowToast(View view) {
        Toast toast = Toast.makeText(this, R.string.Button_Toast, LENGTH_LONG);
        toast.show();
    }
}
