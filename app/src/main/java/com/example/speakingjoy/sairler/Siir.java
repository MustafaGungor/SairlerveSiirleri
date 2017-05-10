package com.example.speakingjoy.sairler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by speakingJoy on 25.07.2016.
 */
public class Siir extends Activity{
    final String[][] Siir={
            {"Hasretinden Prangalar Eskittim",
                    "\n   Seni, anlatabilmek seni.\n" +
                            "   İyi çocuklara, kahramanlara.\n" +
                            "   Seni anlatabilmek seni,\n" +
                            "   Namussuza, halden bilmeze,\n" +
                            "   Kahpe yalana.\n" +
                            "\n" +
                            "   Ard- arda kaç zemheri,\n" +
                            "   Kurt uyur, kuş uyur, zindan uyurdu.\n" +
                            "   Dışarda gürül- gürül akan bir dünya...           \n" +
                            "   Bir ben uyumadım,\n" +
                            "   Kaç leylim bahar,\n" +
                            "   Hasretinden prangalar eskittim.\n" +
                            "   Saçlarına kan gülleri takayım,\n" +
                            "   Bir o yana \n" +
                            "   Bir bu yana...\n" +
                            "\n" +
                            "   Seni bağırabilsem seni,\n" +
                            "   Dipsiz kuyulara,\n" +
                            "   Akan yıldıza,\n" +
                            "   Bir kibrit çöpüne varana,\n" +
                            "   Okyanusun en ıssız dalgasına\n" +
                            "   Düşmüş bir kibrit çöpüne.\n" +
                            "\n" +
                            "   Yitirmiş tılsımını ilk sevmelerin,\n" +
                            "   Yitirmiş öpücükleri,\n" +
                            "   Payı yok, apansız inen akşamlardan,\n" +
                            "   Bir kadeh, bir cıgara, dalıp gidene,\n" +
                            "   Seni anlatabilsem seni...\n" +
                            "   Yokluğun, Cehennemin öbür adıdır\n" +
                            "   Üşüyorum, kapama gözlerini...\n"},
            {"Karanfil Sokağı",
                    "\n   Tekmil ufuklar kışladı\n" +
                            "   Dört yön,onaltı rüzgar\n" +
                            "   Ve yedi iklim beş kıta\n" +
                            "   Kar altındadır.\n" +
                            "\n" +
                            "   Kavuşmak ilmindeyiz bütün fasıllar\n" +
                            "   Ray, asfalt, şose, makadam\n" +
                            "   Benim sarp yolum, patikam\n" +
                            "   Toros, Anti-toros ve asi Fırat\n" +
                            "   Tütün, pamuk, buğday ovaları,çeltikler \n" +
                            "   Vatanım boylu boyunca\n" +
                            "   Kar altındadır.\n" +
                            "\n" +
                            "   Döğüşenler de var bu havalarda\n" +
                            "   El, ayak buz kesmiş, yürek cehennem\n" +
                            "   Ümit, öfkeli ve mahzun\n" +
                            "   Ümit, sapına kadar namuslu\n" +
                            "   Dağlara çekilmiş\n" +
                            "   Kar altındadır.\n" +
                            "\n" +
                            "   Şarkılar bilirim çığ tutmuş\n" +
                            "   Resimler, heykeller, destanlar\n" +
                            "   Usta ellerin yapısı\n" +
                            "   Kolsuz,yarı çıplak Venüs\n" +
                            "   Trans-nonain sokağı\n" +
                            "   Garcia Lorca'nın mezarı,\n" +
                            "   Ve gözbebekleri Pierre Curie'nin\n" +
                            "   Kar altındadır.\n" +
                            "\n" +
                            "   Duvarları katı sabır taşından\n" +
                            "   Kar altındadır varoşlar,\n" +
                            "   Hasretim nazlıdır Ankara.\n" +
                            "   Dumanlı havayı kurt sevsin\n" +
                            "   Asfalttan yürüsün Aralık,\n" +
                            "   Sevmem, netameli aydır.\n" +
                            "   Bir başka ama bilemem\n" +
                            "   Bir kaçıncı bahara kalmıştır vuslat\n" +
                            "   Kalbim, bu zulümlü sevda,\n" +
                            "   Kar altındadır.\n" +
                            "\n" +
                            "   Gecekondularda hava bulanık puslu\n" +
                            "   Altındağ gökleri kümülüslü\n" +
                            "   Ekmeğe, aşka ve ömre\n" +
                            "   Küfeleriyle hükmeden\n" +
                            "   Ciğerleri küçük, elleri büyük\n" +
                            "   Nefesleri yetmez avuçlarına\n" +
                            "   -İlkokul çağında hepsi-\n" +
                            "   Kenar çocukları\n" +
                            "   Kar altındadır.\n" +
                            "\n" +
                            "   Hatıp Çay'ın öte yüzü ılıman\n" +
                            "   Bulvarlar çakırkeyf Yenişehir'de\n" +
                            "   Karanfil Sokağında gün açmış\n" +
                            "   Hikmetinden sual olunmaz değil\n" +
                            "   \"mucip sebebin\" bilirim\n" +
                            "   Ve \"kafi delil\" ortada...\n" +
                            "\n" +
                            "   Karanfil sokağında bir camlı bahçe\n" +
                            "   Camlı bahçe içre bir çini saksı\n" +
                            "   Bir dal süzülür mavide\n" +
                            "   Al - al bir yangın şarkısı,\n" +
                            "   Bakmayın saksıda boy verdiğine\n" +
                            "   Kökü Altındağ'da, İncesu'dadır.\n"},
            {"Akşam Erken İner Mahpushaneye",
                    "\n  Akşam erken iner mahpushaneye.\n" +
                            "  Ejderha olsan kar etmez.\n" +
                            "  Ne kavgada ustalığın,\n" +
                            "  Ne de çatal yürek civan oluşun.\n" +
                            "  Kar etmez, inceden içine dolan,\n" +
                            "  Alıp götüren hasrete.\n" +
                            "\n" +
                            "  Akşam erken iner mahpushaneye.\n" +
                            "  İner, yedi kol demiri,\n" +
                            "  Yedi kapıya.\n" +
                            "  Birden, ağlamaklı olur bahçe.\n" +
                            "  Karşıda, duvar dibinde,\n" +
                            "  Üç dal gece sefası,\n" +
                            "  Üç kök hercai menekşe...\n" +
                            "\n" +
                            "  Aynı korkunç sevdadadır\n" +
                            "  Gökte bulut, dalda kaysı.\n" +
                            "  Başlar  koymağa hapislik.\n" +
                            "  Karanlık can sıkıntısı...\n" +
                            "  \"Kürdün Gelini\"ni söyler maltada biri,\n" +
                            "  Bense volta'dayım ranza dibinde\n" +
                            "  Ve hep olmayacak şeyler kurarım,\n" +
                            "  Gülünç, acemi, çocuksu...\n" +
                            "\n" +
                            "  Vurulsam kaybolsam derim,\n" +
                            "  Çırılçıplak, bir kavgada,\n" +
                            "  Erkekçe olsun isterim,\n" +
                            "  Dostluk da, düşmanlık da.\n" +
                            "  Hiçbiri olmaz halbuki,\n" +
                            "  Geçer süngüler namluya.\n" +
                            "  Başlar gece devriyesi jandarmaların...\n" +
                            "\n" +
                            "  Hırsla çakarım kibriti,\n" +
                            "  İlk nefeste yarılanır cıgaram,\n" +
                            "  Bir duman alırım, dolu,\n" +
                            "  Bir duman, kendimi öldüresiye,\n" +
                            "  Biliyorum, \"sen de mi?\" diyeceksin,\n" +
                            "  Ama akşam erken  iniyor mahpushaneye.            \n" +
                            "  Ve dışarda delikanlı bir bahar,\n" +
                            "  Seviyorum seni,\n" +
                            "  Çıldırasıya...\n"},
            {"Anadolu",
                    "\n   Beşikler vermişim Nuh'a\n" +
                            "   Salıncaklar, hamaklar,\n" +
                            "   Havva Ana'n dünkü çocuk sayılır,\n" +
                            "   Anadoluyum ben,\n" +
                            "   Tanıyor musun ?\n" +
                            "\n" +
                            "   Utanırım,\n" +
                            "   Utanırım fıkaralıktan,\n" +
                            "   Ele, güne karşı çıplak...\n" +
                            "   Üşür fidelerim,\n" +
                            "   Harmanım kesat.\n" +
                            "   Kardeşliğin, çalışmanın,\n" +
                            "   Beraberliğin,\n" +
                            "   Atom güllerinin katmer açtığı,\n" +
                            "   Şairlerin, bilginlerin dünyalarında,          \n" +
                            "   Kalmışım bir başıma,\n" +
                            "   Bir başıma ve uzak.\n" +
                            "   Biliyor musun ?\n" +
                            "\n" +
                            "   Binlerce yıl sağılmışım,\n" +
                            "   Korkunç atlılarıyla parçalamışlar\n" +
                            "   Nazlı, seher-sabah uykularımı\n" +
                            "   Hükümdarlar, saldırganlar, haydutlar,\n" +
                            "   Haraç salmışlar üstüme.\n" +
                            "   Ne İskender takmışım,\n" +
                            "   Ne şah ne sultan\n" +
                            "   Göçüp gitmişler, gölgesiz!\n" +
                            "   Selam etmişim dostuma\n" +
                            "   Ve dayatmışım...\n" +
                            "   Görüyor musun ?\n" +
                            "\n" +
                            "   Nasıl severim bir bilsen.\n" +
                            "   Köroğlu'yu,\n" +
                            "   Karayılanı,\n" +
                            "   Meçhul Askeri...\n" +
                            "   Sonra Pir Sultanı ve Bedrettini.\n" +
                            "   Sonra kalem yazmaz,\n" +
                            "   Bir nice sevda...\n" +
                            "   Bir bilsen,\n" +
                            "   Onlar beni nasıl severdi.\n" +
                            "   Bir bilsen, Urfa'da kurşun atanı\n" +
                            "   Minareden, barikattan,\n" +
                            "   Selvi dalından,\n" +
                            "   Ölüme nasıl gülerdi.\n" +
                            "   Bilmeni mutlak isterim,\n" +
                            "   Duyuyor musun ?\n" +
                            " \n" +
                            "   Öyle yıkma kendini,\n" +
                            "   Öyle mahzun, öyle garip...\n" +
                            "   Nerede olursan ol,\n" +
                            "   İçerde, dışarda, derste, sırada,\n" +
                            "   Yürü üstüne - üstüne,\n" +
                            "   Tükür yüzüne celladın,\n" +
                            "   Fırsatçının, fesatçının, hayının...\n" +
                            "   Dayan kitap ile\n" +
                            "   Dayan iş ile.\n" +
                            "   Tırnak ile, diş ile,\n" +
                            "   Umut ile, sevda ile, düş ile\n" +
                            "   Dayan rüsva etme beni.\n" +
                            "\n" +
                            "   Gör, nasıl yeniden yaratılırım,\n" +
                            "   Namuslu, genç ellerinle.\n" +
                            "   Kızlarım,\n" +
                            "   Oğullarım var gelecekte,\n" +
                            "   Herbiri vazgeçilmez cihan parçası.\n" +
                            "   Kaç bin yıllık hasretimin koncası,\n" +
                            "   Gözlerinden,\n" +
                            "   Gözlerinden öperim,\n" +
                            "   Bir umudum sende,\n" +
                            "   Anlıyor musun ?\n"},
            {"OtuzÜç Kurşun","\n1. \n" +
                    "\n" +
                    "   Bu dağ Mengene dağıdır\n" +
                    "   Tanyeri atanda Van'da \n" +
                    "   Bu dağ Nemrut yavrusudur \n" +
                    "   Tanyeri atanda Nemruda karşı \n" +
                    "   Bir yanın çığ tutar, Kafkas ufkudur     \n" +
                    "   Bir yanın seccade Acem mülküdür \n" +
                    "   Doruklarda buzulların salkımı\n" +
                    "   Firari guvercinler su başlarında \n" +
                    "   Ve karaca sürüsü, \n" +
                    "   Keklik takımı...\n" +
                    "   \n" +
                    "   Yiğitlik inkar gelinmez \n" +
                    "   Tek'e - tek döğüşte yenilmediler \n" +
                    "   Bin yıllardan bu yan, bura uşağı\n" +
                    "   Gel haberi nerden verek \n" +
                    "   Turna sürüsü değil bu \n" +
                    "   Gökte yıldız burcu değil \n" +
                    "   Otuzüç kurşunlu yürek \n" +
                    "   Otuzuç kan pınarı \n" +
                    "   Akmaz, \n" +
                    "   Göl olmuş bu dağda... \n" +
                    "\n" +
                    "   2. \n" +
                    "\n" +
                    "   Yokuşun dibinden bir tavşan kalktı \n" +
                    "   Sırtı alaçakır \n" +
                    "   Karnı sütbeyaz\n" +
                    "   Garip, ikicanlı, bir dağ tavşanı \n" +
                    "   Yüreği ağzında öyle zavallı \n" +
                    "   Tövbeye getirir insanı \n" +
                    "   Tenhaydı, tenhaydı vakitler \n" +
                    "   Kusursuz, çırılçıplak bir şafaktı\n" +
                    "   \n" +
                    "   Baktı otuzüçten biri \n" +
                    "   Karnında açlığın ağır boşluğu \n" +
                    "   Saç, sakal bir karış \n" +
                    "   Yakasında bit, \n" +
                    "   Baktı kolları vurulu, \n" +
                    "   Cehennem yürekli bir yiğit, \n" +
                    "   Bir garip tavşana, \n" +
                    "   Bir gerilere. \n" +
                    "\n" +
                    "   Düştü nazlı filintası aklına, \n" +
                    "   Yastığı altında küsmüş, \n" +
                    "   Düştü, Harran ovasından getirdiği tay \n" +
                    "   Perçemi mavi boncuklu, \n" +
                    "   Alnında akıtma \n" +
                    "   Üç topuğu ak, \n" +
                    "   Eşkini hovarda, kıvrak, \n" +
                    "   Doru, seglavi kısrağı. \n" +
                    "   Nasıl uçmuşlardı Hozat önünde!\n" +
                    "\n" +
                    "   Şimdi, böyle çaresiz ve bağlı, \n" +
                    "   Böyle arkasında bir soğuk namlu \n" +
                    "   Bulunmayaydı, \n" +
                    "   Sığınabilirdi yüceltilere... \n" +
                    "   Bu dağlar, kardeş dağlar, kadrini bilir,      \n" +
                    "   Evvel Allah bu eller utandırmaz adamı, \n" +
                    "   Yanan cıgaranın külünü, \n" +
                    "   Güneşlerde çatal kıvılcımlanan \n" +
                    "   Engereğin dilini, \n" +
                    "   İlk atımda uçuran \n" +
                    "   Usta elleri... \n" +
                    "\n" +
                    "   Bu gözler, bir kere bile faka basmadı \n" +
                    "   Çığ bekleyen boğazların kıyametini \n" +
                    "   Karlı, yumuşacık hıyanetini \n" +
                    "   Uçurumların, \n" +
                    "   Önceden bilen gözleri... \n" +
                    "   Çaresiz\n" +
                    "   Vurulacaktı, \n" +
                    "   Buyruk kesindi, \n" +
                    "   Gayrı gözlerini kör sürüngenler \n" +
                    "   Yüreğini leş kuşları yesindi...\n" +
                    "\n" +
                    "   3. \n" +
                    "\n" +
                    "   Vurulmuşum \n" +
                    "   Dağların kuytuluk bir boğazında \n" +
                    "   Vakitlerden bir sabah namazında \n" +
                    "   Yatarım         \n" +
                    "   Kanlı, upuzun... \n" +
                    "\n" +
                    "   Vurulmuşum \n" +
                    "   Düşüm, gecelerden kara \n" +
                    "   Bir hayra yoranım çıkmaz \n" +
                    "   Canım alırlar ecelsiz \n" +
                    "   Sığdıramam kitaplara \n" +
                    "   Şifre buyurmuş bir paşa \n" +
                    "   Vurulmuşum hiç sorgusuz, yargısız \n" +
                    "\n" +
                    "   Kirvem, hallarımı aynı böyle yaz \n" +
                    "   Rivayet sanılır belki \n" +
                    "   Gül memeler değil \n" +
                    "   Domdom kurşunu \n" +
                    "   Paramparça ağzımdaki... \n" +
                    "\n" +
                    "\n" +
                    "   4.\n" +
                    "\n" +
                    "   Ölüm buyruğunu uyguladılar, \n" +
                    "   Mavi dağ dumanını \n" +
                    "   ve uyur-uyanık seher yelini \n" +
                    "   Kanlara buladılar. \n" +
                    "   Sonra oracıkta tüfek çattılar \n" +
                    "   Koynumuzu usul-usul yoklayıp \n" +
                    "   Aradılar. \n" +
                    "   Didik-didik ettiler \n" +
                    "   Kirmanşah dokuması al kuşağımı \n" +
                    "   Tespihimi, tabakamı alıp gittiler \n" +
                    "   Hepsi de armağandı Acemelinden... \n" +
                    "\n" +
                    "   Kirveyiz, kardeşiz, kanla bağlıyız \n" +
                    "   Karşıyaka köyleri, obalarıyla \n" +
                    "   Kız alıp vermişiz yüzyıllar boyu, \n" +
                    "   Komşuyuz yaka yakaya \n" +
                    "   Birbirine karışır tavuklarımız \n" +
                    "   Bilmezlikten değil, \n" +
                    "   Fıkaralıktan \n" +
                    "   Pasaporta ısınmamış içimiz \n" +
                    "   Budur katlimize sebep suçumuz, \n" +
                    "   Gayrı eşkiyaya çıkar adımız \n" +
                    "   Kaçakçıya \n" +
                    "   Soyguncuya \n" +
                    "   Hayına... \n" +
                    "\n" +
                    "   Kirvem hallarımı aynı böyle yaz \n" +
                    "   Rivayet sanılır belki \n" +
                    "   Gül memeler değil \n" +
                    "   Domdom kurşunu \n" +
                    "   Paramparça ağzımdaki... \n" +
                    "\n" +
                    "  \n" +
                    "   5.\n" +
                    " \n" +
                    "   Vurun ulan, \n" +
                    "   Vurun, \n" +
                    "   Ben kolay ölmem. \n" +
                    "   Ocakta küllenmiş közüm, \n" +
                    "   Karnımda sözüm var \n" +
                    "   Haldan bilene. \n" +
                    "   Babam gözlerini verdi Urfa önünde \n" +
                    "   Üç de kardaşını \n" +
                    "   Üç nazlı selvi, \n" +
                    "   Ömrüne doymamış üç dağ parçası. \n" +
                    "   Burçlardan, tepelerden, minarelerden \n" +
                    "   Kirve, hısım, dağların çocukları \n" +
                    "   Fransız Kuşatmasına karşı koyanda\n" +
                    "\n" +
                    "   Bıyıkları yeni terlemiş daha \n" +
                    "   Benim küçük dayım Nazif \n" +
                    "   Yakışıklı, \n" +
                    "   Hafif,    \n" +
                    "   İyi süvari \n" +
                    "   Vurun kardaş demiş\n" +
                    "   Namus günüdür \n" +
                    "   Ve şaha kaldırmış atını. \n" +
                    "\n" +
                    "   Kirvem hallarımı aynı böyle yaz \n" +
                    "   Rivayet sanılır belki \n" +
                    "   Gül memeler değil \n" +
                    "   Domdom kurşunu \n" +
                    "   Paramparça ağzımdaki... \n "},
            {"Aşk",
                    "\nŞimdi sen kalkıp gidiyorsun. Git \n" +
                            "Gözlerin durur mu onlar da gidiyorlar. Gitsinler.\n" +
                            "Oysa ben senin gözlerinsiz edemem bilirsin \n" +
                            "Oysa Allah bilir bugün iyi uyanmıştık \n" +
                            "Sevgideydi ilk açılışı gözlerimizin sırf onaydı \n" +
                            "Bir kuş konmuş parmaklarıma uzun uzun ötmüştü \n" +
                            "Bir sevişmek gelmiş bir daha gitmemişti \n" +
                            "Yoktu dünlerde evelsi günlerdeki yoksulluğumuz \n" +
                            "Sanki hiç olmamıştı\n" +
                            "\n" +
                            "Oysa kalbim işte şuracıkta çarpıyordu\n" +
                            "Şurda senin gözlerindeki bakımsız mavi, güzel laflı \n" +
                            "                                                            İstanbullar\n" +
                            "Şurda da etin çoğalıyordu dokundukça lafların\n" +
                            "                                                            dünyaların\n" +
                            "Öyle düzeltici öyle yerine getiriciydi sevmek\n" +
                            "Ki Karaköy köprüsüne yağmur yağarken\n" +
                            "Bıraksalar gökyüzü kendini ikiye bölecekti\n" +
                            "Çünkü iki kişiydik\n" +
                            "\n" +
                            "Oysa bir bardak su yetiyordu saçlarını ıslatmaya\n" +
                            "Bir dilim ekmeğin bir iki zeytinin başınaydı doymamız\n" +
                            "Seni bir kere öpsem ikinin hatırı kalıyordu\n" +
                            "İki kere öpeyim desem üçün boynu bükük\n" +
                            "Yüzünün bitip vücudunun başladığı yerde\n" +
                            "Memelerin vardı memelerin kahramandı sonra \n" +
                            "Sonrası iyilik güzellik.\n"},
            {"Afrika",
                    "\nAfrika dediğin bir garip kıta\n" +
                            "El bilir âlem bilir\n" +
                            "Ki şekli bozulmasın diye Akdeniz'in\n" +
                            "Hâlâ eskisi gibi çizilir\n" +
                            "Haritalarda\n"},
            {"Gül",
                    "\nGülün tam ortasında ağlıyorum\n" +
                            "Her akşam sokak ortasında öldükçe\n" +
                            "Önümü arkamı bilmiyorum\n" +
                            "Azaldığını duyup duyup karanlıkta\n" +
                            "Beni ayakta tutan gözlerinin\n" +
                            "\n" +
                            "Ellerini alıyorum sabaha kadar seviyorum\n" +
                            "Ellerin beyaz tekrar beyaz tekrar beyaz\n" +
                            "Ellerinin bu kadar beyaz olmasından korkuyorum\n" +
                            "İstasyonda tiren oluyor biraz\n" +
                            "Ben bazan istasyonu bulamayan bir adamım\n" +
                            "\n" +
                            "Gülü alıyorum yüzüme sürüyorum\n" +
                            "Her nasılsa sokağa düşmüş\n" +
                            "Kolumu kanadımı kırıyorum\n" +
                            "Bir kan oluyor bir kıyamet bir çalgı\n" +
                            "Ve zurnanın ucunda yepyeni bir çingene\n"},
            {"Turgut Uyar",
                    "\nAk odada oturur\n" +
                            "Kapısı penceresinden çok\n" +
                            "\n" +
                            "Gözlerinde yıldızlar\n" +
                            "Serin yerde durur\n" +
                            "\n" +
                            "Bir elinde kadeh\n" +
                            "Öbürünü yarasına bastırır\n" +
                            "\n" +
                            "İnşaattan ses gelir\n" +
                            "Bir şeyi okşar gibidir\n" +
                            "\n" +
                            "Uzanıp durmuş mahçup\n" +
                            "Işığagöçerin şarkısı\n" +
                            "\n" +
                            "Dönülmez dizeler içinde\n" +
                            "Onunkiler gülaçılır\n" +
                            "\n" +
                            "Öldüğü gün\n" +
                            "Hepimizi işten attılar\n"},
            {"Acıyor",
                    "\nMutsuzlukdan söz etmek istiyorum\n" +
                            "Dikey ve yatay mutsuzluktan\n" +
                            "Mükemmel mutsuzluğundan insansoyunun\n" +
                            "Sevgim acıyor\n" +
                            "\n" +
                            "Biz giz dolu bir şey yaşadık\n" +
                            "Onlarda orada yaşadılar\n" +
                            "Bir dağın çarpıklığını\n" +
                            "bir sevinç sanarak\n" +
                            "\n" +
                            "En başta mutsuzluk elbet\n" +
                            "Kasaba meyhanesi gibi \n" +
                            "Kahkahası gün ışığına vurup da\n" +
                            "öteden beri yansımayan\n" +
                            "Yani birinin solgun bir gülden kaptığı frengi\n" +
                            "Öbürünün bir kadından aldığı verem\n" +
                            "Bütün işhanlarının tarihçesi\n" +
                            "sevgim acıyor\n" +
                            "\n" +
                            "Yazık sevgime diyor birisi \n" +
                            "Güzel gözlü bir çocuğun bile \n" +
                            "O kadar korunmuş bir yazı yoktu\n" +
                            "Ne denmelidir bilemiyorum\n" +
                            "sevgim acıyor\n" +
                            "Gemiler gene gelip gidiyor\n" +
                            "Dağlar kararıp aydınlanacaklar\n" +
                            "Ve o kadar\n" +
                            "\n" +
                            "Tavrım bir çok şeyi bulup coşmaktır\n" +
                            "Sonbahar geldi hüzün\n" +
                            "İlkbahar geldi kara hüzün\n" +
                            "Ey en akıllı kişisi dünyanın\n" +
                            "Bazen yaz ortasında gündüzün\n" +
                            "sevgim acıyor\n" +
                            "Kimi sevsem\n" +
                            "Kim beni sevse \n" +
                            "\n" +
                            "Eylül toparlandı gitti işte \n" +
                            "Ekim filanda gider bu gidişle \n" +
                            "Tarihe gömülen koca koca atlar\n" +
                            "Tarihe gömülür o kadar \n"},
            {"Akşam Üstü Rüyası",
                    "\nŞimdi gemiler geçer uzaklardan\n" +
                            "Gönlüm güvertede sereserpedir.\n" +
                            "Işıklı geceler,saz sesleri, peynir ekmek\n" +
                            "Ne biletim ne param ne dostum var\n" +
                            "Pır pır eder yüreğim bakındıkça...\n" +
                            "-Uyan Turgut um, garibim, uyan\n" +
                            "Bura Terme'dir.\n" +
                            "\n" +
                            "Terme köprüsünden kamyonlar geçer,\n" +
                            "Irgatlar üç orada beş burada konuşurlar\n" +
                            "Bir gece başlar, yarı siyah, yarı kırmızı\n" +
                            "Cigaramı yakar evime dönerim...\n" +
                            "-Gidin gemiler, gidin\n" +
                            "Vardığınız yerlere selam edin\n" +
                            "Gün olur bütün kaygılardan uzak\n" +
                            "Ben de gelirim...\n"},
            {"Arz-ı Hal",
                    "\nBen de günahkar kullarındanım Allahım...\n" +
                            "Bir \"Kulhuvallahi\" bilirim dualardan,\n" +
                            "Bir de \"Yarabbi şükür\" demeyi doyunca,\n" +
                            "Bir kere oruç tutmam ramazan boyunca,\n" +
                            "Ama çekmediğim kalmadı sevdalardan.\n" +
                            "Ben de günahkar kullarındanım Allahım!...\n" +
                            "\n" +
                            "Benim gibi kulun çok dünyada, Allahım!...\n" +
                            "Eğer bilmiyorsan işte, haberin olsun.\n" +
                            "Ekmek derdi, aşk derdi unutturdu seni.\n" +
                            "İnsan hatırlamıyor dün ne yediğini.\n" +
                            "Zaten yediğimiz ne ki hatırda dursun.\n" +
                            "Benim gibi kulun çok dünyada, Allahım!...\n" +
                            "\n" +
                            "Yazdıklarıma sakın darılma Allahım!...\n" +
                            "Meleklerin sana bunları söylemezler.\n" +
                            "Artık, pek yarattığın gibi değil dünya\n" +
                            "İnsanlar hem sabuna karıştı, hem suya:\n" +
                            "Ne olursun hoşuna gitmediyse eğer,\n" +
                            "Yazdıklarıma sakın darılma Allahım!...\n" +
                            "\n" +
                            "Sana bir şey soracağım, affet, Allahım!...\n" +
                            "Beş vakit kızlar doluyor camilerine,\n" +
                            "Beyaz yaşmaklı, beyaz tenli masum kızlar...\n" +
                            "Benim bir defa görüşte yüreğim sızlar;\n" +
                            "Sen tutulmadın mı, içlerinden birine?\n" +
                            "Sana bir şey soracağım, affet, Allahım!...\n" +
                            "\n" +
                            "İşte insanlar bu minval üzre, Allahım!...\n" +
                            "Kıt kanaat sere serpe yollar boyunca\n" +
                            "Sen, bizim için hala o ezeli sırsın.\n" +
                            "Sen de, bizi bilmiş olsan, başkalaşırsın...\n" +
                            "Herkesin kederi, gailesi boyunca.\n" +
                            "İşte insanlar bu minval üzre, Allahım!...\n"},
            {"Binlerce",
                    "\nbinlerce pazartesi geçti ömrümde\n" +
                            "hangisiydi o çıkaramıyorum\n" +
                            "bir kiraz yediğimi hatırlıyorum kurtluydu\n" +
                            "demek oldukça eski\n" +
                            "\n" +
                            "bir de saçmasapan şeyler\n" +
                            "bir kızın dizaltını örneğin\n" +
                            "bir adamın çirkin sigara içişini\n" +
                            "\n" +
                            "nasıl yaşanıyor bu vesayetli dünyada\n" +
                            "hangi çılgınlar nasıl dayanıyor buna\n" +
                            "kimsenin soyunu sopunu bulmak görevim değil\n" +
                            "kendi öykümü düzenlemek yetiyor bana\n" +
                            "güzel bir öğle vakti\n" +
                            "eski güzel bir akşamı hatırlayarak\n" +
                            "sonra dopdolu şeyler\n" +
                            "damacanalar gibi\n" +
                            "içim kabarıyor\n" +
                            "\n" +
                            "sonu olsun diyorum\n" +
                            "neyin sonu ama\n" +
                            "hiç değilse bu taş basamakların\n"},
            {"Kan Uyku",
                    "\nBir biz varız güzel öbürleri hep çirkin\n" +
                            "Birde bu terli karanlık\n" +
                            "Sonra bir şey daha var muhakkak ama adını bilmiyorum\n" +
                            "Nereden başlasam sonunda o ışıkla karşılaşıyorum\n" +
                            "Yarı çıplak utanmaz bir kadın resmini aydınlatıyor\n" +
                            "Akşam oluyor ya bir türlü inanamıyorum\n" +
                            "Oturmuş iri yapılı adamlar esrar çekiyorlar\n" +
                            "Daha bir aydınlık olsun diye içtikleri su\n" +
                            "Sarı toprakdan testileri güneşte pişiriyorlar\n" +
                            "\n" +
                            "Bir korkuyorum yanlız kalmaktan bir korkuyorum\n" +
                            "Gündüzleri delice çalışıyorum geceleri kadınlarla yatıyorum\n" +
                            "\n" +
                            "Sonra birden büyümüş görüyorum ağaçları\n" +
                            "Kısrakları birden yavrulamış\n" +
                            "Havaları birden güneşli\n" +
                            "\n" +
                            "Kadınlarla yattığım yetse ya\n" +
                            "Birde kadınlarla yattığıma inanmam gerekiyor\n" +
                            "\n" +
                            "Hoşlanmıyorum\n"},
            {"Bir Şeyin Adı",
                    "\n, büyük büyük düşündüm;\n" +
                            "Sonra büyük büyük yaşadım.\n" +
                            "Ne varsa, onlar aldı.\n" +
                            "Şimdi bana küçük bir ölüm kaldı.\n"},
            {"Düello",
                    "\n  Her tomurcuk bir çiçeğin uykusuna,\n" +
                            "  Her çiçek bir yemişin kuşkusuna,\n" +
                            "  Her yemiş bir böceğin korkusuna,\n" +
                            "  Uykusuzca, kuşkusuzca, korkusuzca yürür.\n"},
            {"Kelimeler",
                    "\nYarıda kalmış aşklarının hesapları içinde\n" +
                            "Denizlere açıldı içimizden biri\n" +
                            "Niçin gittiğini söylemeden.\n" +
                            "Doyulmamış arzularla doluydu yelkenleri.\n" +
                            "Yıpranmış kelimelerin verdiği güvenden.\n" +
                            "Bulacak sanıyordu yenilikleri.\n" +
                            "Her an bir yeni su vardı,\n" +
                            "Her yeni suda bir yeni an.\n" +
                            "Deniz, dalgalarıyla gösteriyordu dışından\n" +
                            "Yaşananla düşünülenler arasındaki farkı.\n" +
                            "Bitmiyordu köpüklerle renkler\t\n" +
                            "Bir başka damlada, bir başka ışıkta başlamadan.\n" +
                            "Gözlerinin önünde bir oyun, ardında bir oyun.\n" +
                            "Dışında ne varsa yeni, ne varsa gerçek.\n" +
                            "Yeni manzaralarla gelen yeni duygular\n" +
                            "Hani, eski kelimelerle olmasa\n" +
                            "İnsanın ömrünce devam edecek.\n" +
                            "Gözlerinin önünde bir oyun, ardında bir oyun.\n" +
                            "Anladı,ölmekle yaşamanın birleştiği noktada\n" +
                            "Yeni rüzgarlarla esen yeni korkulara\n" +
                            "Yeniliklerini bağışlamayan kelimelerin\n" +
                            "Nasıl düşman sığınaklar halinde direndiğini.\n" +
                            "Anladı, bütün olmuşlarla olanların\n" +
                            "Ve bütün olacakların\n" +
                            "O kelimelerin içinde\n" +
                            "Kendisine varmadan eskidiğini.\n"},
            {"Bayrak",
                    "\nEy mavi göklerin beyaz ve kızıl süsü,\n" +
                            "Kız kardeşimin gelinliği, şehidimin son örtüsü,\n" +
                            "Işık ışık, dalga dalga bayrağım!\n" +
                            "Senin destanını okudum, senin destanını yazacağım.\n" +
                            "\n" +
                            "Sana benim gözümle bakmayanın\n" +
                            "Mezarını kazacağım.\n" +
                            "Seni selâmlamadan uçan kuşun\n" +
                            "Yuvasını bozacağım.\n" +
                            "\n" +
                            "Dalgalandığın yerde ne korku, ne keder...\n" +
                            "Gölgende bana da, bana da yer ver.\n" +
                            "Sabah olmasın, günler doğmasın ne çıkar:\n" +
                            "Yurda ay yıldızının ışığı yeter.\n" +
                            "\n" +
                            "Savaş bizi karlı dağlara götürdüğü gün\n" +
                            "Kızıllığında ısındık;\n" +
                            "Dağlardan çöllere düştüğümüz gün\n" +
                            "Gölgene sığındık.\n" +
                            "\n" +
                            "Ey şimdi süzgün, rüzgârlarda dalgalı;\n" +
                            "Barışın güvercini, savaşın kartalı\n" +
                            "Yüksek yerlerde açan çiçeğim.\n" +
                            "Senin altında doğdum.\n" +
                            "Senin altında öleceğim.\n" +
                            "\n" +
                            "Tarihim, şerefim, şiirim, her şeyim:\n" +
                            "Yer yüzünde yer beğen!\n" +
                            "Nereye dikilmek istersen,\n" +
                            "Söyle, seni oraya dikeyim!\n"},
            {"Fetih Marşı",
                    "\nYelkenler biçilecek, yelkenler dikilecek;\n" +
                            "Dağlardan çektiriler, kalyonlar çekilecek;\n" +
                            "Kerpetenlerle surun dişleri sökülecek\n" +
                            "\n" +
                            "Yürü, hâlâ ne diye oyunda oynaştasın ?\n" +
                            "Fatih'in İstanbul'u fethettiği yaştasın.!\n" +
                            "\n" +
                            "Sen ne geçebilirsin yardan, anadan, serden....\n" +
                            "Senin de destanını okuyalım ezberden...\n" +
                            "Haberin yok gibidir taşıdığın değerden...\n" +
                            "\n" +
                            "Elde sensin, dilde sen, gönüldesin baştasın...\n" +
                            "Fatih'in İstanbul'u fethettiği yaştasın.!\n" +
                            "\n" +
                            "Yüzüne çarpmak gerek zamanenin fendini...\n" +
                            "Göster : Kabaran sular nasıl yıkar bendini ?\n" +
                            "Küçük görme, hor görme, delikanlım kendini\n" +
                            "\n" +
                            "Şu kırık abideyi yükseltecek taştasın;\n" +
                            "Fatih'in İstanbul'u fethettiği yaştasın.!\n" +
                            "\n" +
                            "Bu kitaplar Fatihtir, Selimdir, Süleymandır.\n" +
                            "Şu mihrap Sinanüddin, şu minare Sinandır.\n" +
                            "Haydi artık uyuyan destanını uyandır.!\n" +
                            "\n" +
                            "Bilmem, neden gündelik işlerle telaştasın\n" +
                            "Kızım, sen de Fatihler doğuracak yaştasın.!\n" +
                            "\n" +
                            "Delikanlım, işaret aldığın gün atandan\n" +
                            "Yürüyeceksin... Millet yürüyecek arkandan !\n" +
                            "Sana selam getirdim Ulubatlı Hasandan ....\n" +
                            "\n" +
                            "Sen ki burçlara bayrak olacak kumaştasın;\n" +
                            "Fatih'in İstanbul'u fethettiği yaştasın.!\n" +
                            "\n" +
                            "Bırak, bozuk saatler yalan yanlış işlesin !\n" +
                            "Çelebiler çekilip haremlerde kışlasın!\n" +
                            "Yürü aslanım, fetih hazırlığı başlasın...\n" +
                            "\n" +
                            "Yürü, hâlâ ne diye kendinle savaştasın ?\n" +
                            "Fatih'in İstanbul'u fethettiği yaştasın.!\n"},
            {"Abbas","\n" +
                    "Haydi Abbas, vakit tamam;\n" +
                    "Akşam diyordun işte oldu akşam.\n" +
                    "Kur bakalım çilingir soframızı;\n" +
                    "Dinsin artık bu kalb ağrısı.\n" +
                    "Şu ağacın gölgesinde olsun;\n" +
                    "Tam kenarında havuzun.\n" +
                    "Aya haber sal çıksın bu gece;\n" +
                    "Görünsün şöyle gönlümce.\n" +
                    "Bas kırbacı sihirli seccadeye,\n" +
                    "Göster hükmettiğini mesafeye\n" +
                    "Ve zamana.\n" +
                    "Katıp tozu dumana,\n" +
                    "Var git,\n" +
                    "Böyle ferman etti Cahit,\n" +
                    "Al getir ilk sevgiliyi Beşiktaş'tan;\n" +
                    "Yaşamak istiyorum gençliğimi yeni baştan.\n"},
            {"Otuz Beş Yaş",
                    "\nYaş otuz beş! yolun yarısı eder.\n" +
                            "Dante gibi ortasındayız ömrün.\n" +
                            "Delikanlı çağımızdaki cevher,\n" +
                            "Yalvarmak, yakarmak nafile bugün,\n" +
                            "Gözünün yaşına bakmadan gider.\n" +
                            "Şakaklarıma kar mı yağdı ne var?\n" +
                            "Benim mi Allahım bu çizgili yüz?\n" +
                            "Ya gözler altındaki mor halkalar?\n" +
                            "Neden böyle düşman görünürsünüz,\n" +
                            "Yıllar yılı dost bildiğim aynalar?\n" +
                            "Zamanla nasıl değişiyor insan!\n" +
                            "Hangi resmime baksam ben değilim.\n" +
                            "Nerde o günler, o şevk, o heyecan?\n" +
                            "Bu güler yüzlü adam ben değilim;\n" +
                            "Yalandır kaygısız olduğum yalan.\n" +
                            "Hayal meyal şeylerden ilk aşkımız;\n" +
                            "Hatırası bile yabancı gelir.\n" +
                            "Hayata beraber başladığımız,\n" +
                            "Dostlarla da yollar ayrıldı bir bir;\n" +
                            "Gittikçe artıyor yalnızlığımız.\n" +
                            "Gökyüzünün başka rengi de varmış!\n" +
                            "Geç farkettim taşın sert olduğunu.\n" +
                            "Su insanı boğar, ateş yakarmış!\n" +
                            "Her doğan günün bir dert olduğunu,\n" +
                            "İnsan bu yaşa gelince anlarmış.\n" +
                            "Ayva sarı nar kırmızı sonbahar!\n" +
                            "Her yıl biraz daha benimsediğim.\n" +
                            "Ne dönüp duruyor havada kuşlar?\n" +
                            "Nerden çıktı bu cenaze? ölen kim?\n" +
                            "Bu kaçıncı bahçe gördüm tarumar?\n" +
                            "Neylersin ölüm herkesin başında.\n" +
                            "Uyudun uyanamadın olacak.\n" +
                            "Kimbilir nerde, nasıl, kaç yaşında?\n" +
                            "Bir namazlık saltanatın olacak,\n" +
                            "Taht misali o musalla taşında.\n"},
            {"Desem ki",
                    "\nDesem ki vakitlerden bir Nisan akşamıdır,\n" +
                            "Rüzgârların en ferahlatıcısı senden esiyor,\n" +
                            "Sende seyrediyorum denizlerin en mavisini,\n" +
                            "Ormanların en kuytusunu sende gezmekteyim,\n" +
                            "Senden kopardım çiçeklerin en solmazını,\n" +
                            "Toprakların en bereketlisini sende sürdüm,\n" +
                            "Sende tattım yemişlerin cümlesini.\n" +
                            "\n" +
                            "Desem ki sen benim için,\n" +
                            "Hava kadar lazım,\n" +
                            "Ekmek kadar mübarek,\n" +
                            "Su gibi aziz bir şeysin;\n" +
                            "Nimettensin, nimettensin!\n" +
                            "Desem  ki...\n" +
                            "İnan bana sevgilim inan,\n" +
                            "Evimde şenliksin, bahçemde bahar;\n" +
                            "Ve soframda en eski şarap.\n" +
                            "Ben sende yaşıyorum,\n" +
                            "Sen bende hüküm sürmektesin.\n" +
                            "Bırak ben söyleyeyim güzelliğini, \n" +
                            "Rüzgârlarla, nehirlerle, kuşlarla beraber.\n" +
                            "Günlerden sonra bir gün,\n" +
                            "Şayet sesimi farkedemezsen,\n" +
                            "Rüzgârların, nehirlerin, kuşların sesinden,\n" +
                            "Bil ki ölmüşüm.\n" +
                            "Fakat yine üzülme, müsterih ol;\n" +
                            "Kabirde böceklere ezberletirim güzelliğini,\n" +
                            "Ve neden sonra\n" +
                            "Tekrar duyduğun gün sesimi gökkubbede,\n" +
                            "Hatırla ki mahşer günüdür\n" +
                            "Ortalığa düşmüşüm seni arıyorum.\n"},
            {"Memleket İsterim",
                    "\nMemleket isterim\n" +
                            "Gök mavi, dal yeşil, tarla sarı olsun;\n" +
                            "Kuşların çiçeklerin diyarı olsun.\n" +
                            "\n" +
                            "Memleket isterim\n" +
                            "Ne başta dert, ne gönülde hasret olsun;\n" +
                            "Kardeş kavgasına bir nihayet olsun.\n" +
                            "\n" +
                            "Memleket isterim\n" +
                            "Ne zengin fakir, ne sen ben farkı olsun;\n" +
                            "Kış günü herkesin evi barkı olsun.\n" +
                            "\n" +
                            "Memleket isterim\n" +
                            "Yaşamak, sevmek gibi gönülden olsun;\n" +
                            "Olursa bir şikâyet ölümden olsun.\n"}
    };
    TextView tvbaslik,tvicerik;
    Button btn;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.siir_goster);
        tvicerik=(TextView)findViewById(R.id.siiricerik);
        Intent i=getIntent();
        String gelendeger = i.getExtras().getString("id");

        final ArrayList<String> arrayList=new ArrayList<>();
        btn=(Button)findViewById(R.id.siirbaslik);
        btn.setText(gelendeger);
        for(int j=0;j<Siir.length;j++) {
            if(gelendeger.equals(Siir[j][0])){
                arrayList.add(Siir[j][1]);
            }
            else{
                System.out.print("Hatalı girdi");
            }
        }
        Toast.makeText(getApplicationContext(),gelendeger,Toast.LENGTH_SHORT).show();
        tvicerik.setVerticalScrollBarEnabled(true);
        tvicerik.setMovementMethod(ScrollingMovementMethod.getInstance());//kaydırma özellikleri atandı
        tvicerik.setText(arrayList.set(0,""));

    }
}
