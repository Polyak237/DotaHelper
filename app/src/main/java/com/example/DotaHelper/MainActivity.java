package com.example.DotaHelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonHeroesMenu ();
        addListenerOnButtonItemsMenu ();

    }

    private Button btnHeroesMenu;

    public void addListenerOnButtonHeroesMenu () {
        btnHeroesMenu = (Button)findViewById(R.id.btnHeroesMenu);

        btnHeroesMenu.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".Heroes");
                        startActivity(intent);
                    }
                }
        );
    }

    private Button btnItemsMenu;

    public void addListenerOnButtonItemsMenu () {
        btnItemsMenu = (Button)findViewById(R.id.btnItemsMenu);

        btnItemsMenu.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".Items");
                        startActivity(intent);
                    }
                }
        );
    }


}