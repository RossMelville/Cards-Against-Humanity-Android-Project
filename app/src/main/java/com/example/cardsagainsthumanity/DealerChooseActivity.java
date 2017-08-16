package com.example.cardsagainsthumanity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

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

        listView = (ListView) findViewById(R.id.list);

        String[] values = new String[game.getBlackStatementCards().size()];

        for(int i = 0; i < game.getBlackStatementCards().size(); i++) {
            values[i] = game.getBlackStatementCards().get(i).getStatement();
        }

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int cardPosition = i;
                Card selectedCard = game.blackStatementCards.get(cardPosition);
                game.blackStatementCards.clear();
                game.addBlackStatementCard(selectedCard);

                if (game.getDealerIndex() == 0) {
                    Toast.makeText(DealerChooseActivity.this, "Pass to " + game.players.get(1).getName(), Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(DealerChooseActivity.this, "Pass to " + game.players.get(0).getName(), Toast.LENGTH_LONG).show();
                }
                Handler toastHandler = new Handler();
                toastHandler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        Intent intent = new Intent(DealerChooseActivity.this, GameActivity.class);
                        intent.putExtra("game", game);
                        startActivity(intent);
                    }
                }, 2000L);
            }
        });
    }
}
