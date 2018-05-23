package com.example.user.mathgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LastActivity extends AppCompatActivity implements View.OnClickListener {
    Button refresh;
    TextView point;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
        int count;
        int defaultValue = 0;


        refresh = (Button) findViewById(R.id.refresh);
        refresh.setOnClickListener(this);
        point = (TextView) findViewById(R.id.point);



        Intent intent = getIntent();
        count = intent.getIntExtra("count", defaultValue);
        point.setText(count);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.refresh:
                Intent intent = new Intent(LastActivity.this, ActivityTwo.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
