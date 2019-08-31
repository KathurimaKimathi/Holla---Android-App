package com.oreonent.hollaholla;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class ChatActivity extends AppCompatActivity {

    private String messageReceiverID, getMessageReceiverName;

    // NEXT 47

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);


        messageReceiverID = getIntent().getExtras().get("visit_user_id").toString();
        getMessageReceiverName = getIntent().getExtras().get("visit_username").toString();

        //Testing for reception of IDs
        Toast.makeText(ChatActivity.this, messageReceiverID, Toast.LENGTH_LONG).show();
        Toast.makeText(ChatActivity.this, getMessageReceiverName, Toast.LENGTH_LONG).show();

    }
}
