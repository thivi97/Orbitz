package com.example.mybooking;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
  //  private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /*  button =  (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choocar();
            }
        });*/

        /*public void choocar(){
            Intent intent = new Intent(this,choocar.class);
            startActivity(intent);
        }*/
    }
}
