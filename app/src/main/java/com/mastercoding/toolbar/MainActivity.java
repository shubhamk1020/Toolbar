package com.mastercoding.toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId()){
            case
                    R.id.newGroup:

                Toast.makeText(this, "New Group", Toast.LENGTH_SHORT).show();
                break;
            case
                    R.id.broadcast:
                Toast.makeText(this, "New broadcast", Toast.LENGTH_SHORT).show();
                break;
            case
                    R.id.msg:
                Toast.makeText(this, "Starred messages", Toast.LENGTH_SHORT).show();
                break;
            case
                    R.id.payments:
                Toast.makeText(this, "Payments", Toast.LENGTH_SHORT).show();
                break;
            case
                    R.id.setting:
                Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return true;

           }
}