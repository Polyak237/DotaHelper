package com.example.DotaHelper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Heroes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes);
        addListenerOnButtonSortAlf ();
        addListenerOnButtonSortAtr ();
    }

    private Button btnHeroesSortAlf;
    private Button btnHeroesSortAtr;

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
}