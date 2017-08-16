package com.example.cardsagainsthumanity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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


        TextView playerNumber = (TextView)findViewById(R.id.player_no);
        String playerNo = Integer.toString(game.playerTracker + 1);
        playerNumber.setText("Player " + playerNo);

        button = (Button)findViewById(R.id.submit);
    }

    public void onButtonClicked(View button) {

            name = enteredName.getText().toString();

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

            Toast.makeText(this, "Pass to " + game.players.get(game.dealerIndex).getName(), Toast.LENGTH_LONG).show();

            Intent intent = new Intent(PlayerSetActivity.this, DealerChooseActivity.class);
            intent.putExtra("game", game);
            startActivity(intent);

        }

    }

}
