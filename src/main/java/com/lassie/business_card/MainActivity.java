package com.lassie.business_card;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonAbout;
    private Button buttonContacts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAbout = (Button) findViewById(R.id.button);
        buttonAbout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivityAbout();
            }
        });

        buttonContacts = (Button) findViewById(R.id.button2);
        buttonContacts.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivityContacts();
            }
        });
    }

    private void openActivityAbout() {
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }

    private void openActivityContacts() {
        Intent intent = new Intent(this, ContactsActivity.class);
        startActivity(intent);
    }
}
