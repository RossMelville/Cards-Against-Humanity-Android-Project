package com.example.cardsagainsthumanity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class DealerChooseActivity extends AppCompatActivity {

    ListView listView;
    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dealer_choose);

        game = (Game) getIntent().getSerializableExtra("game");

        game.populateBlackStatementCards();

        String name = game.players.get(game.dealerIndex).getName();

        TextView playerName = (TextView)findViewById(R.id.dealer_name);
        playerName.setText(name);



    }
}
