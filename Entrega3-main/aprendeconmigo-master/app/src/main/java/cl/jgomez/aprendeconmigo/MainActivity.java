package cl.jgomez.aprendeconmigo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void iropciones(View view){
        Intent intent = new Intent(MainActivity.this,activityopciones.class);
        startActivity(intent);
    }

    public void irjuegos(View view){
        Intent intent2 = new Intent(MainActivity.this,activityinicio.class);
        startActivity(intent2);
    }

}