package com.example.speakingjoy.sairler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by arafat on 25.07.2016.
 */
public class Siirler extends Activity {
    ListView lise;
    final String[][] Siir_liste = {
            {"0", "Hasretinden Prangalar Eskittim"},   //0:Ahmet Arif
            {"0", "Karanfil Sokağı"},                  //1:Cemal Süreya
            {"0", "Akşam Erken İner Mahpushaneye"},    //2:Turgut Uyar
            {"0", "Anadolu"},                          //3:Özdemir Asaf
            {"0", "OtuzÜç Kurşun"},                    //4:Arif Nihat Asya
            {"1", "Aşk"},                              //5:Cahit Sıtkı Tarancı
            {"1", "Afrika"},
            {"1", "Gül"},
            {"1", "Turgut Uyar"},
            {"2", "Acıyor"},
            {"2", "Akşam Üstü Rüyası"},
            {"2", "Arz-ı Hal"},
            {"2", "Binlerce"},
            {"2", "Kan Uyku"},
            {"3", "Bir Şeyin Adı"},
            {"3", "Düello"},
            {"3", "Kelimeler"},
            {"4", "Bayrak"},
            {"4", "Fetih Marşı"},
            {"5", "Abbas"},
            {"5", "Otuz Beş Yaş"},
            {"5", "Desem ki"},
            {"5", "Memleket İsterim"}
    };
    Button buton;
    protected void onCreate(Bundle savedInstanceState){
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.siirler);
            lise = (ListView) findViewById(R.id.liste_siirler);
            String gelenid = getIntent().getExtras().getString("id");
            int gelenn = Integer.valueOf(gelenid); //intentten gelen putextra alındı
            String butonbaslik=getIntent().getExtras().getString("isim");
            final ArrayList<String> asd=new ArrayList<>(); //ArrayList tanımlanarak yeni bir dizi oluşturuldu
            for (int i = 0; i < Siir_liste.length; i++) {
                int s = Integer.valueOf(Siir_liste[i][0]);  //String ifade integer a çevrilerek karşılaştırılma yapıldı
                if (s == gelenn) {
                    asd.add(Siir_liste[i][1]);   //ArrayList asd dizisine karşılaştırılan elemanlar eklendi
                    //// sonuc[i] = Siir_liste[i][1];
                }
            }
            buton=(Button)findViewById(R.id.butonust);
            buton.setText(butonbaslik);

            final ArrayAdapter<String> adapter1 = new ArrayAdapter<String>
                    (this, android.R.layout.simple_list_item_1, asd);//ArrayAdapter a asd ArrayList eklendi


            lise.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Intent intent;
                    switch (i) {
                        case 0:
                            intent = new Intent(Siirler.this, Siir.class); //Şiirler asd.get(i) olarak gönderildi
                            intent.putExtra("id", asd.get(i));
                            startActivity(intent);
                            break;
                        case 1:
                            intent = new Intent(Siirler.this, Siir.class);
                            intent.putExtra("id",asd.get(i));

                            startActivity(intent);
                            break;
                        case 2:
                            intent = new Intent(Siirler.this, Siir.class);
                            intent.putExtra("id",asd.get(i));

                            startActivity(intent);
                            break;
                        case 3:
                            intent = new Intent(Siirler.this, Siir.class);
                            intent.putExtra("id",asd.get(i));

                            startActivity(intent);
                            break;
                        case 4:
                            intent = new Intent(Siirler.this, Siir.class);
                            intent.putExtra("id",asd.get(i));

                            startActivity(intent);
                            break;
                        case 5:
                            intent = new Intent(Siirler.this, Siir.class);
                            intent.putExtra("id",asd.get(i));

                            startActivity(intent);
                            break;
                    }
                }
            });
            lise.setAdapter(adapter1); //Adapter set edilerek listelendi


        } catch (Exception e) {
            System.out.println(e);
        }
    }

}