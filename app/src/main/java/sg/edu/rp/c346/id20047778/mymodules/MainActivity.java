package sg.edu.rp.c346.id20047778.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvMod1;
    TextView tvMod2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMod1 = findViewById(R.id.textViewMod1);
        tvMod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , SecondActivity.class);
                intent.putExtra("value","C346");
                intent.putExtra("value","Android Programming");
                intent.putExtra("value",2020);
                intent.putExtra("value",1);
                intent.putExtra("value",4);
                intent.putExtra("value","W66M");

                startActivity(intent);
            }
        });

        tvMod2 = findViewById(R.id.textViewMod2);
        tvMod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , SecondActivity.class);
                intent.putExtra("value","C349");
                intent.putExtra("value","iPad Programming");
                intent.putExtra("value",2020);
                intent.putExtra("value",1);
                intent.putExtra("value",4);
                intent.putExtra("value","W65G");
                startActivity(intent);
            }
        });
    }
}