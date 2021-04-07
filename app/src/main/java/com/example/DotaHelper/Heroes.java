package com.example.DotaHelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Heroes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes);
        addListenerOnButtonSortAlf ();
        addListenerOnButtonSortAtr ();
        addListenerOnButtonUrsa ();
    }

    private Button btnHeroesSortAlf;

    public void addListenerOnButtonSortAlf () {
        btnHeroesSortAlf = (Button)findViewById(R.id.btnItemsSortAlf);

        btnHeroesSortAlf.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                }
        );
    }

    private Button btnHeroesSortAtr;
    public void addListenerOnButtonSortAtr () {
        btnHeroesSortAtr = (Button)findViewById(R.id.btnItemssSortAtr);

        btnHeroesSortAtr.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                }
        );
    }

    private ImageButton btnUrsa;
    public void addListenerOnButtonUrsa () {
        btnUrsa = (ImageButton)findViewById(R.id.btnUrsa);

        btnUrsa.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".pageUrsa");
                        startActivity(intent);
                    }
                }
        );
    }


}