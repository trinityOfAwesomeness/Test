package edu.tacoma.uw.tslinard.aboutme;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* Hello world */
        /* Hello world */
        /*Tat*/
        /*Tat test*/
        /*Tat test again*/
        
    }

    public void onClick(View view) {
        Intent intent = null;
        switch(view.getId()) {
            case R.id.button_text:
                intent = new Intent(this, AboutMeActivity.class);
                startActivity(intent);
                break;
            case R.id.button_image:
                intent = new Intent(this, ImageActivity.class);
                startActivity(intent);
                break;
            case R.id.button_web:
                String url = "http://developer.android.com/index.html";
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
                break;
            case R.id.button_toast:
                Toast.makeText(this, "Live long and prosper!", Toast.LENGTH_SHORT)
                        .show();
                break;
            case R.id.button_dialog:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Hack the World!")
                        .setTitle("Creative Title")
                        .create()
                        .show();
                break;

        }
    }
}