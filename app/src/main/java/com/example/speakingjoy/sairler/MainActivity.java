package com.example.speakingjoy.sairler;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.content.Intent;

import java.util.List;

public class MainActivity extends Activity {
    ListView list;
    final String[] Sairler={"Ahmet Arif","Cemal Süreya","Turgut Uyar","Özdemir Asaf","Arif Nihat Asya","Cahit Sıtkı Tarancı"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list =(ListView)findViewById(R.id.liste);


        ArrayAdapter<String> adapter= new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,Sairler);
        Intent intent;
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent;
                switch (i){
                    case 0:
                        intent = new Intent(MainActivity.this, Siirler.class);//Ahmet Arif
                        intent.putExtra("id","0");
                        intent.putExtra("isim","Ahmet Arif");
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(MainActivity.this, Siirler.class);//Cemal Süreya
                        intent.putExtra("id","1");
                        intent.putExtra("isim","Cemal Süreya");
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(MainActivity.this, Siirler.class);//Turgut Uyar
                        intent.putExtra("id","1");
                        intent.putExtra("isim","Turgut Uyar");
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(MainActivity.this, Siirler.class);//Özdemir Asaf
                        intent.putExtra("id","3");
                        intent.putExtra("isim","Özdemir Asaf");
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(MainActivity.this, Siirler.class);//Arif Nihat Asya
                        intent.putExtra("id","4");
                        intent.putExtra("isim","Arif Nihat Asya");
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(MainActivity.this, Siirler.class);//Cahit Sıtkı Tarancı
                        intent.putExtra("id","5");
                        intent.putExtra("isim","Cahit Sıtkı Tarancı");
                        startActivity(intent);
                        break;
                }
            }
        });
        list.setAdapter(adapter);



    }
}
