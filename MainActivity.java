package com.example.basketballscore;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int scorea=0;
    int ns=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void tp(View view) {
        scorea+=3;displaya(scorea);
    }
    public void fp(View view) {
        scorea+=5;displaya(scorea);
    }
    public void ft(View view) {
        scorea+=1;displaya(scorea);
    }
    private void displaya(int n) {
        TextView quantityTextView = (TextView) findViewById(R.id.team_a_score);
        quantityTextView.setText(""+n);
    }
    public void tpb(View view) {
        ns+=3;displayb(ns);
    }
    public void fpb(View view) {
        ns+=5;displayb(ns);
    }
    public void ftb(View view) {
        ns+=1;displayb(ns);
    }
    public void res(View v) {
        ns=0;
        scorea=0;
        displaya(scorea);
        displayb(ns);
    }
    private void displayb(int n) {
        TextView quantityTextView = (TextView) findViewById(R.id.team_b_score);
        quantityTextView.setText(""+n);
    }
}