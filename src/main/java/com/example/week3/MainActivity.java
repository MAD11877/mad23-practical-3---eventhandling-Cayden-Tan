package com.example.week3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        int randomnumber = intent.getIntExtra("random_integer",0);
        TextView tv = findViewById(R.id.editTextText2);
        tv.setText("MAD " + randomnumber);

        Button followButton = findViewById(R.id.followButton);
        Button messageButton = findViewById(R.id.messageButton);
        followButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttonTextString = followButton.getText().toString();
                if (buttonTextString.equals("Follow")) {
                    followButton.setText("Unfollow");
                    Toast.makeText(MainActivity.this, "Followed!", Toast.LENGTH_SHORT).show();
                }
                else{
                    followButton.setText("Follow");
                    Toast.makeText(MainActivity.this, "Unfollowed...", Toast.LENGTH_SHORT).show();

                }
            }
        });

        messageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent2 = new Intent(MainActivity.this, MessageGroup.class);
                startActivity(intent2);
            }
        });
    }
}