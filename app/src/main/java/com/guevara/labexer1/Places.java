package com.guevara.labexer1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Places extends AppCompatActivity {
    private Button c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places2);
        Button c=(Button) findViewById(R.id.button5);
        c.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String url="https://en.wikipedia.org/wiki/University_of_Santo_Tomas_Field";
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(url));
                startActivity(intent);
            }
        });
        Button d=(Button) findViewById(R.id.button6);
        d.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String url="https://en.wikipedia.org/wiki/Arch_of_the_Centuries";
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(url));
                startActivity(intent);
            }
        });
        Button f=(Button) findViewById(R.id.button7);
        f.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String url="https://en.wikipedia.org/wiki/University_of_Santo_Tomas_Main_Building";
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(url));
                startActivity(intent);
            }
        });
        Button g=(Button) findViewById(R.id.button8);
        g.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String url="https://en.wikipedia.org/wiki/Miguel_de_Benavides_Library";
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}