package com.nikstudies.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String username, psw;
    Button readNotification;
    private TextView txtView;
    private NotificationReceiver nReceiver;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        readNotification = findViewById( R.id.ReadNotification );
        txtView = (TextView) findViewById(R.id.textView);
        nReceiver = new NotificationReceiver();
        IntentFilter filter = new IntentFilter();
        filter.addAction("com.nikstudies.MainActivity");
        registerReceiver(nReceiver,filter);

    }

    public void onClick ( View view){
        Intent i = new Intent("com.nikstudies.NLService");
        i.putExtra( "command", "list" );
        sendBroadcast( i );
    }


    class NotificationReceiver extends BroadcastReceiver {

        @Override
        public void onReceive( Context context, Intent intent) {
            String temp = intent.getStringExtra("notification_event") + "\n" + txtView.getText();
            txtView.setText(temp);
        }
    }


}