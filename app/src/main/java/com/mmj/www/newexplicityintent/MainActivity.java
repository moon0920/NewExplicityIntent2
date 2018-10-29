package com.mmj.www.newexplicityintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnSymple = findViewById(R.id.btnSymple);
        btnSymple.setOnClickListener(this);
        Button btnResult = findViewById(R.id.btnResult);
        btnResult.setOnClickListener(this);
        Button btnListView = findViewById(R.id.btnListView);
        btnListView.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnSymple:
               Intent intentSimple = new Intent(this,SimpleActivity.class);
               startActivity(intentSimple);
               break;
            case R.id.btnResult:
               Intent intentResult = new Intent(this,resultActivity.class);
               startActivity(intentResult);
               break;
            case R.id.btnListView:
               Intent intentListView = new Intent(this,ListViewActivity.class);
               startActivity(intentListView);
               break;
        }
    }
}
