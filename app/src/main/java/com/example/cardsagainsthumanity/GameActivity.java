package com.example.cardsagainsthumanity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class GameActivity extends AppCompatActivity {

    ListView listView;
    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        game = (Game) getIntent().getSerializableExtra("game");

        TextView statement = (TextView) findViewById(R.id.statement);
        statement.setText(game.getBlackStatementCards().get(0).getStatement());


        listView = (ListView) findViewById(R.id.list);

        final int position = game.getDealer();

        ArrayList<Card> playerAnswers = game.players.get(position).getHand();

        String[] values = new String[10];
        for (int i = 0; i < playerAnswers.size(); i++) {
            values[i] = playerAnswers.get(i).getStatement();
        }

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String item = (String) listView.getItemAtPosition(i);
                Card card = game.players.get(position).findByStatement(item);
                game.addWhiteAnswerCard(card);
                game.players.get(position).removeCard(card);
                Card newCard = game.whiteDeck.getRandomCard();
                game.players.get(position).addCard(newCard);
                game.whiteDeck.removeCard(newCard);
                int deal = position + 1;
                game.setDealer(deal);

                if (game.getDealer() < game.points.length) {

                    String nextPlayer = game.players.get(position + 1).getName();

                    Toast.makeText(GameActivity.this, "Pass to " + nextPlayer, Toast.LENGTH_LONG).show();

                    Handler toastHandler = new Handler();
                    toastHandler.postDelayed(new Runnable() {

                        @Override
                        public void run() {
                            Intent intent = new Intent(GameActivity.this, GameActivity.class);
                            intent.putExtra("game", game);
                            startActivity(intent);
                        }
                    }, 5000L);




                } else {

                    Intent intent = new Intent(GameActivity.this, DealerActivity.class);
                    intent.putExtra("game", game);
                    startActivity(intent);

                }
            }
        });

    }

}
