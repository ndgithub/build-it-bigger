package com.example.android.androidjokelibrary;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Nicky on 3/27/17.
 */

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        TextView jokeView = (TextView) findViewById(R.id.joke_view);

        String joke = getIntent().getStringExtra("joke");
        jokeView.setText(joke);
    }
}
