package com.example.intentlearning;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String EXTRA_REPLY="com.example.intentlearning.REPLY";
    private EditText mReply;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        mReply = findViewById(R.id.edit_text_reply);

        Intent intent = getIntent();
        if(intent.hasExtra(MainActivity.EXTRA_MESSAGE)){
            String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
            TextView textView = findViewById(R.id.text_message_receiver);
            textView.setText(message);

        }

    }

    public void return_reply(View view) {
        Log.d(LOG_TAG,"Reply button ");

        String reply = mReply.getText().toString();

        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();


    }
}
