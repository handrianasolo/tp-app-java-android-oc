package com.topquizz.controllers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.topquizz.R;

public class GameActivity extends AppCompatActivity {

    private TextView mGameQuestionText;
    private Button mGameAnswer1Button;
    private Button mGameAnswer2Button;
    private Button mGameAnswer3Button;
    private Button mGameAnswer4Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        mGameQuestionText = (TextView) findViewById(R.id.activity_game_question_text);
        mGameAnswer1Button = (Button) findViewById(R.id.activity_game_answer1_btn);
        mGameAnswer2Button = (Button) findViewById(R.id.activity_game_answer2_btn);
        mGameAnswer3Button = (Button) findViewById(R.id.activity_game_answer3_btn);
        mGameAnswer4Button = (Button) findViewById(R.id.activity_game_answer4_btn);
    }
}