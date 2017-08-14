package com.example.cardsagainsthumanity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.cardsagainsthumanity.R.id.parent;

public class GameActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Game game = new Game(4);

        game.blackDeck.addCard(new Card("What ended my last relationship?"));
        game.blackDeck.addCard(new Card("Instead of coal, Father Christmas now gives bad children ______."));
        game.blackDeck.addCard(new Card("What will always get you laid?"));
        game.blackDeck.addCard(new Card("Today on the Jeremy Kyle show: Help my son is ______."));
        game.blackDeck.addCard(new Card("Why do I hurt all over?"));
        game.blackDeck.addCard(new Card("Whats that sound?"));
        game.blackDeck.addCard(new Card("I got 99 problems but ______ ain't one."));
        game.blackDeck.addCard(new Card("What gives me uncontrollable gas?"));
        game.blackDeck.addCard(new Card("Whats the next Happy Meal toy?"));
        game.blackDeck.addCard(new Card("Whats there a ton of in heaven"));
        game.blackDeck.addCard(new Card("Next on Sky Sports: The world Championship of ______."));
        game.blackDeck.addCard(new Card("War! What is it good for?"));
        game.blackDeck.addCard(new Card("What don't you want to find in your Kung Pao chicken?"));
        game.blackDeck.addCard(new Card("Now at the Natural History Museum: an interactive exhibit on ______."));
        game.blackDeck.addCard(new Card("What never fails to liven up the party?"));
        game.blackDeck.addCard(new Card("Daddy, why is mummy crying?"));

        game.whiteDeck.addCard(new Card("Being a dick to children."));
        game.whiteDeck.addCard(new Card("Passive-aggressive post-it notes."));
        game.whiteDeck.addCard(new Card("The placenta."));
        game.whiteDeck.addCard(new Card("Incest."));
        game.whiteDeck.addCard(new Card("Homeless people."));
        game.whiteDeck.addCard(new Card("My balls on your face."));
        game.whiteDeck.addCard(new Card("Chunks of dead hitchhiker."));
        game.whiteDeck.addCard(new Card("The morbidly obese."));
        game.whiteDeck.addCard(new Card("Gary Glitter."));
        game.whiteDeck.addCard(new Card("Doing the right thing."));
        game.whiteDeck.addCard(new Card("Cottaging."));
        game.whiteDeck.addCard(new Card("Necrophilia."));
        game.whiteDeck.addCard(new Card("LYNX body spray."));
        game.whiteDeck.addCard(new Card("Black people."));
        game.whiteDeck.addCard(new Card("Madeleine McCann."));
        game.whiteDeck.addCard(new Card("Maureen of Blackpool, Readers wife of the year 1988."));
        game.whiteDeck.addCard(new Card("Bitches."));
        game.whiteDeck.addCard(new Card("Heartwarming orphans."));
        game.whiteDeck.addCard(new Card("Drinking out the toilet and eating rubbish."));
        game.whiteDeck.addCard(new Card("Saying I love you."));
        game.whiteDeck.addCard(new Card("The true meaning of Christmas."));
        game.whiteDeck.addCard(new Card("Mining accidents."));
        game.whiteDeck.addCard(new Card("Holding down a child and farting all over them."));
        game.whiteDeck.addCard(new Card("The rhythms of Africa."));
        game.whiteDeck.addCard(new Card("Sniffing glue."));
        game.whiteDeck.addCard(new Card("William Shatner."));
        game.whiteDeck.addCard(new Card("Funky fresh rhymes."));
        game.whiteDeck.addCard(new Card("Crumbs all over the bloody carpet."));
        game.whiteDeck.addCard(new Card("Inappropriate yodeling."));
        game.whiteDeck.addCard(new Card("The BNP."));
        game.whiteDeck.addCard(new Card("Dying."));
        game.whiteDeck.addCard(new Card("Drowning the kids in the bathtub."));
        game.whiteDeck.addCard(new Card("The way James Bond treats women."));
        game.whiteDeck.addCard(new Card("Wet dreams."));
        game.whiteDeck.addCard(new Card("The French."));
        game.whiteDeck.addCard(new Card("Powerful thighs."));
        game.whiteDeck.addCard(new Card("Lady Gaga."));
        game.whiteDeck.addCard(new Card("An ugly face."));
        game.whiteDeck.addCard(new Card("Sean Connery."));
        game.whiteDeck.addCard(new Card("Poor people."));
        game.whiteDeck.addCard(new Card("The Chinese gymnastics team."));
        game.whiteDeck.addCard(new Card("My sex life."));
        game.whiteDeck.addCard(new Card("Pictures of boobs."));
        game.whiteDeck.addCard(new Card("My collection of high-tech sex toys."));
        game.whiteDeck.addCard(new Card("Morgan Freeman's voice."));
        game.whiteDeck.addCard(new Card("A sea of troubles."));
        game.whiteDeck.addCard(new Card("Lockjaw."));
        game.whiteDeck.addCard(new Card("Poverty."));
        game.whiteDeck.addCard(new Card("German dungeon porn."));

        Card card1 = game.blackDeck.getRandomCard();
        game.addBlackStatementCard(card1);
        game.blackDeck.removeCard(card1);

        Player player1 = new Player("player 1");
        player1.populateHand(game.whiteDeck);
        game.addPlayer(player1);

        Player player2 = new Player("player 2");
        player2.populateHand(game.whiteDeck);
        game.addPlayer(player2);

        Player player3 = new Player("player 3");
        player3.populateHand(game.whiteDeck);
        game.addPlayer(player3);

        Player player4 = new Player("player 4");
        player4.populateHand(game.whiteDeck);
        game.addPlayer(player4);

        TextView statement = (TextView)findViewById(R.id.statement);
        statement.setText(game.getBlackStatementCards().get(0).getStatement());

        ListView listView = (ListView)findViewById(R.id.list);

        ArrayList<Card> player1Answers = player1.getHand();

        String[] values = new String[10];
        for(int i = 0; i < player1Answers.size(); i++) {
            values[i] = player1Answers.get(i).getStatement();
        }

        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
    }



}
