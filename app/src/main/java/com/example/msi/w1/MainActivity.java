package com.example.msi.w1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import static android.R.attr.id;
import static com.example.msi.w1.R.id.button1;
import static com.example.msi.w1.R.id.button2;
import static com.example.msi.w1.R.id.button3;

public class MainActivity extends AppCompatActivity {
    private Button addbutton;
    private Button profilevbutton;
    private Button settingsbutton;
    private ImageButton backbuttonone;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        addbutton = (Button) findViewById(R.id.button1);
        profilevbutton = (Button) findViewById(R.id.button2);
        settingsbutton = (Button) findViewById(R.id.button3);
        backbuttonone = (ImageButton).findViewById(R.id.backbutton1);

        View.OnClickListener listner1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setContentView(R.layout.add);
                getSupportActionBar().hide();

            }
        };

        View.OnClickListener listener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setContentView(R.layout.profile);
                getSupportActionBar().hide();

            }
        };
        View.OnClickListener listener3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setContentView(R.layout.settings);
                getSupportActionBar().hide();


            }
        };
        View.OnClickListener listener4 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {




            }
        };
        addbutton.setOnClickListener(listner1);
        profilevbutton.setOnClickListener(listener2);
        settingsbutton.setOnClickListener(listener3);
        backbuttonone.setOnClickListener(listener4); //NULL POINTER EXCEPTION
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
