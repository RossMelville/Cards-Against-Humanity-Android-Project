package com.example.cardsagainsthumanity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PlayerSetActivity extends AppCompatActivity {

    Game game;
    Button button;
    EditText enteredName;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_set);

        game = (Game) getIntent().getSerializableExtra("game");

        enteredName = (EditText)findViewById(R.id.name_input);
        name = enteredName.getText().toString();
        
        button = (Button)findViewById(R.id.submit);
    }

    public void onButtonClicked(View button) {


            Player player = new Player(name);
            player.populateHand(game.whiteDeck);
            game.addPlayer(player);
            game.playerTracker += 1;
            Log.d("Button Clicked:", "Test");

        if(game.playerTracker < game.points.length) {

            Intent intent = new Intent(PlayerSetActivity.this, PlayerSetActivity.class);
            intent.putExtra("game", game);
            startActivity(intent);

        } else {

            game.playerTracker += 1;
            Card card1 = game.blackDeck.getRandomCard();
            game.addBlackStatementCard(card1);
            game.blackDeck.removeCard(card1);

            Intent intent = new Intent(PlayerSetActivity.this, GameActivity.class);
            intent.putExtra("game", game);
            startActivity(intent);

        }

    }

}
