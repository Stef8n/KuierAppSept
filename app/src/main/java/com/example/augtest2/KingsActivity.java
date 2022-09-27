package com.example.augtest2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.ArrayList;

import java.util.Collections;

public class KingsActivity extends AppCompatActivity {

    private ArrayList<Integer> cards;
    private ImageView Card;
    private Button nextCard;
    private Integer kingAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kings);

        Card = (ImageView) findViewById(R.id.Card);

        ArrayList<Integer> cards = new ArrayList<Integer>();

        cards.add(R.drawable.a);
        cards.add(R.drawable.aa);
        cards.add(R.drawable.ab);
        cards.add(R.drawable.ac);
        cards.add(R.drawable.b);
        cards.add(R.drawable.bb);
        cards.add(R.drawable.c);
        cards.add(R.drawable.cc);
        cards.add(R.drawable.ad);
        cards.add(R.drawable.d);
        cards.add(R.drawable.dd);
        cards.add(R.drawable.e);
        cards.add(R.drawable.ee);
        cards.add(R.drawable.f);
        cards.add(R.drawable.ff);
        cards.add(R.drawable.g);
        cards.add(R.drawable.gg);
        cards.add(R.drawable.h);
        cards.add(R.drawable.hh);
        cards.add(R.drawable.i);
        cards.add(R.drawable.ii);
        cards.add(R.drawable.j);
        cards.add(R.drawable.k);
        cards.add(R.drawable.kk);
        cards.add(R.drawable.l);
        cards.add(R.drawable.ll);
        cards.add(R.drawable.m);
        cards.add(R.drawable.mm);
        cards.add(R.drawable.n);
        cards.add(R.drawable.nn);
        cards.add(R.drawable.o);
        cards.add(R.drawable.oo);
        cards.add(R.drawable.p);
        cards.add(R.drawable.pp);
        cards.add(R.drawable.q);
        cards.add(R.drawable.qq);
        cards.add(R.drawable.r);
        cards.add(R.drawable.rr);
        cards.add(R.drawable.s);
        cards.add(R.drawable.ss);
        cards.add(R.drawable.t);
        cards.add(R.drawable.tt);
        cards.add(R.drawable.u);
        cards.add(R.drawable.uu);
        cards.add(R.drawable.v);
        cards.add(R.drawable.vv);
        cards.add(R.drawable.w);
        cards.add(R.drawable.ww);
        cards.add(R.drawable.x);
        cards.add(R.drawable.xx);
        cards.add(R.drawable.y);
        cards.add(R.drawable.yy);
        cards.add(R.drawable.z);
        cards.add(R.drawable.zz);


        kingAmount = 0;



            nextCard = findViewById(R.id.nextCard);
            nextCard.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {




                        int index = (int) (Math.random() * cards.size());


                        Card.setImageResource(cards.get(index));



                        if (cards.get(index) == R.drawable.uu || cards.get(index)== R.drawable.vv || cards.get(index)== R.drawable.ww || cards.get(index)== R.drawable.xx) {
                            kingAmount += 1;

                            if (kingAmount==4){
                                nextCard.setEnabled(false);
                            }
                        }


                        cards.remove(index);
                        //pop cards..remove(x)

                    }


            });




    }







}





