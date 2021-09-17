package com.example.week3_demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    int i=0;
    TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.tv1);
        mTextView.setOnClickListener(view -> {
            ((TextView)view).setText(45);
    });

        findViewByID(R.id.btn3).setOnClickListener(this::toShowToastMSG);

        private void toShowToastMSG(View view) {
            Toast.makeText(context:MainACtivity.this, text:"Gerrato, Tino",
            Toast.LENGTH_LONG).show();
        }

    public void toShowSBMSG(View view) {
        Snackbar sb= Snackbar.make(view, "Gerrato, Tino",
                Snackbar.LENGTH_LONG);
        sb.show();
    }

    class MyLsntr implements View.OnClickListener{

        @Override
        public void onClick(View view) {

           // Toast.makeText(context:MainActivity.this, text: "Tino",
          //  Toast.LENGTH_LONG).show();

            Snackbar sb= Snackbar.make(view, "Tino, Gerrato",
            Snackbar.LENGTH_LONG);
            sb.show();
        }
    }

    @Override
    protected void onStart(){
        super.onStart();
    }
}