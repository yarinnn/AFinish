package com.example.user.alpha3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Credits extends AppCompatActivity {
    TextView credit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

        credit=findViewById(R.id.credit);

        credit.setText("All rights reserved to my classmate Hadar Elimelech for thinking about the project's theme, and to Yarin Cohen for applying it in Android Studio");
    }
}
