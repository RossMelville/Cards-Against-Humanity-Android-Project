package com.example.cardsagainsthumanity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);



    }



    public void onButtonClicked(View button) {
        Intent intent = new Intent(this, PlayerSetActivity.class);
        intent.putExtra("game", game);
        Log.d("game:", game.toString());
        startActivity(intent);
    }

}
