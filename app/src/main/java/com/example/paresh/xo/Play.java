package com.example.paresh.xo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class Play extends AppCompatActivity {
   int activePlayer=0;
   int[] gamestate ={2,2,2,2,2,2,2,2,2};
   int[] [] CheckWin ={{0,1,2},{0,3,6},{0,4,8},{1,4,7},{2,4,6},{3,4,5},{6,7,8},{2,5,8}};


    public void dropIn(View view){

        ImageView X =(ImageView)view;

        X.getTag().toString();
        int clicked =Integer.parseInt(X.getTag().toString());
        if (gamestate[clicked]==2) {

            gamestate[clicked]=activePlayer;
            X.setTranslationY(-1000f);

            if (activePlayer == 0) {

                X.setImageResource(R.drawable.cross);
                X.animate().translationYBy(1000f).setDuration(30);
                activePlayer = 1;

            } else {

                X.setImageResource(R.drawable.o);
                X.animate().translationYBy(1000f).setDuration(30);
                activePlayer = 0;
            }

            for (int [] c :CheckWin
                 ) {

               if (gamestate[c[0]]==1 && gamestate[c[1]]==1 && gamestate[c[2]]==1 ){

                   // o is a winner
                   Intent w = new Intent(getApplicationContext(),win.class);
                   w.putExtra("message","X won");
                   startActivity(w);



               }

               else if (gamestate[c[0]]==0 && gamestate[c[1]]==0 && gamestate[c[2]]==0 ){


                   // x is a winner
                   Intent w = new Intent(getApplicationContext(),win.class);
                   w.putExtra("message","O won");
                   startActivity(w);



               }
            }
            
        }
        else{

            Toast.makeText(this, "already Played", Toast.LENGTH_SHORT).show();
        }



    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
    }
}
