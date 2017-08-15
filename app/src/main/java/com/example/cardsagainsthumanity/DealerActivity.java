package com.example.cardsagainsthumanity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class DealerActivity extends AppCompatActivity {

    ListView listView;
    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dealer);

        game = (Game) getIntent().getSerializableExtra("game");

        TextView statement = (TextView) findViewById(R.id.statement);
        statement.setText(game.getBlackStatementCards().get(0).getStatement());



    }
}
