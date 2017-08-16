package com.example.cardsagainsthumanity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.cardsagainsthumanity.R.id.player_text;

public class WelcomeActivity extends AppCompatActivity {

    Game game;
    Button button;
    EditText playerEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        playerEditText = (EditText)findViewById(R.id.player_text);
        button = (Button)findViewById(R.id.button);

    }

    public void onButtonClicked(View button) {

        String players = playerEditText.getText().toString();
        int numberOfPlayers = Integer.parseInt(players);

        game = new Game(numberOfPlayers);

        Intent intent = new Intent(this, PlayerSetActivity.class);
        intent.putExtra("game", game);
        startActivity(intent);
    }

}
