package com.example.kemuniggroup.Home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.kemuniggroup.R;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    private ArrayList<String> fotoData = new ArrayList<>();
    private ArrayList<String> namaData = new ArrayList<>();
    private ArrayList<String> infoData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getData();
    }

    private void prosesRecycleViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoData,namaData,infoData,this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getData(){

        namaData.add(" Ikan Lele ");
        fotoData.add("https://cdnwpseller.gramedia.net/wp-content/uploads/2021/07/16105035/ikan-lele-min.jpg");
        infoData.add("Baru-baru ini, ikan lele menjadi salah satu jenis ikan yang paling banyak dibudidayakan. Selain memiliki banyak penggemar, budidaya ikan lele juga tidak membutuhkan persiapan yang banyak. Bahkan, selama pandemi, banyak masyarakat yang mulai melakukan budidaya ikan lele di dalam ember. Tentu hal ini menjadi sebuah inovasi baru yang patut ditiru.\n" +
                "\n" +
                "Budidaya ikan lele kini menjadi suatu bisnis yang menguntungkan. Sebab, permintaan pasar terhadap ikan lele tergolong tinggi. Hal ini tentu tak mengherankan mengingat rasa ikan lele yang gurih dan lezat. Pun dengan kemunculan warung pecel lele yang semakin banyak, membuat ikan lele sangat diincar sebagian besar pemilik tempat makan.\n" +
                "\n" +
                "Permintaan pasar terhadap ikan lele pun cenderung terus meningkat dan berbagai restoran ikan lele telah tersebar di berbagai kota besar dan menjadi komoditas ekspor ke seluruh dunia.");

        namaData.add(" Ikan Gurame ");
        fotoData.add("https://cdnwpseller.gramedia.net/wp-content/uploads/2021/07/16105032/ikan-gurame-min.jpg");
        infoData.add("Ikan gurame merupakan salah satu menu makanan yang digemari banyak kalangan. Hal ini tentu menjadi peluang menjanjikan jika kita memilih ikan gurame untuk dibudidayakan. Untuk memulai budidaya ikan konsumsi jenis ini, kita memerlukan modal sekitar 10 juta hingga 11 juta.\n" +
                "\n" +
                "Modal tersebut nantinya akan digunakan untuk membuat kolam ikan, membeli bibit ikan gurame, makanan ikan, obat-obatan, dan lainnya. Modal yang Anda keluarkan nantinya akan sebanding dengan penghasilan yang Anda peroleh. Jika dilihat dari harga ikan gurame di pasaran, harganya relatif tinggi dan juga stabil. Jadi, Anda tidak perlu khawatir harga gurame akan anjlok.\n" +
                "\n" +
                "Untuk media yang digunakan untuk membudidayakan ikan gurame tidaklah sulit. Anda cukup membuat kolam dengan terpal ataupun plastik. Dengan menggunakan material tersebut, tentu Anda akan lebih menghemat biaya");

        namaData.add(" Ikan Mas ");
        fotoData.add("https://cdnwpseller.gramedia.net/wp-content/uploads/2021/07/16105038/ikan-mas-min.jpg");
        infoData.add("Ikan Mas adalah satu ikan konsumsi yang mudah dibudidaya dan tidak kalah populer dengan ikan air tawar lain. Ikan ini banyak disukai karena memiliki daging yang lembut dan juga mudah dimasak menjadi berbagai menu hidangan.\n" +
                "\n" +
                "Seperti ikan air tawar lain, Ikan Mas sangat mudah dibudidayakan. Harga di pasaran pun tergolong cukup terjangkau. Banyak orang yang tertarik untuk budidaya ikan konsumsi jenis ini karena perawatannya yang tidak sulit.\n" +
                "\n" +
                "Selain dikonsumsi, ikan ini juga bisa Anda gunakan untuk dijadikan ikan hias/peliharaan. Pasti Anda sering menemukan orang-orang yang memelihara ikan mas di halaman depan rumah mereka bukan? Nah, oleh sebab itu, ikan jenis ini berpotensi untuk dijadikan peluang bisnis yang menjanjikan.\n" +
                "\n" +
                "Ikan Tawar jenis ini biasanya di habitat air tawar dan tidak terlalu dalam. Ikan mas dapat hidup di ketinggian 150 sampai 600 meter di atas permukaan air laut. Sama seperti ikan nila, ikan ini juga bisa Anda temui di perairan payau.\n" +
                "\n" +
                "Ikan mas termasuk golongan ikan omnivora yaitu pemakan segala. Akan tetapi, makan utama dari ikan ini adalah tumbuhan dan juga binatang yang berada di dasar perairan tempat tinggalnya.");

        namaData.add(" Ikan Mujair ");
        fotoData.add("https://cdnwpseller.gramedia.net/wp-content/uploads/2021/07/16105041/ikan-mujaer-min.jpg");
        infoData.add("Seperti ikan air tawar jenis lain, ikan mujair juga tak kalah enak untuk dikonsumsi. Maka tak heran jika banyak orang yang gemar mengonsumsi dan mengolah ikan ini untuk dijadikan hidangan favorit. Selain mempunyai tekstur daging yang lezat dan lembut. Ikan Mujair juga mengandung banyak protein hewani yang baik untuk pertumbuhan anak-anak.\n" +
                "\n" +
                "Oleh karena itu, banyak orang yang tergiur untuk membudidayakan ikan jenis ini dan membuatnya sebagai ladang bisnis. Waktu panen ikan mujair tergolong cepat dengan hanya membutuhkan modal yang cukup kecil.\n" +
                "\n" +
                "Tidak ada teknik khusus untuk membudidayakan ikan mujair. Cukup gunakan kolam biasa dan jangan terlalu sering memberikan pakan. Mengapa? karena jika Anda sering memberikan pakan, maka berpotensi untuk membuat kualitas air kolam menjadi tidak bagus.");

        namaData.add(" Ikan Nila ");
        fotoData.add("https://cdnwpseller.gramedia.net/wp-content/uploads/2021/07/16105044/ikan-nila-min.jpg");
        infoData.add("Seperti yang kita ketahui bahwa ikan nila merupakan salah satu jenis ikan yang banyak tersedia di berbagai tempat makan ataupun restoran. Bukan tanpa alasan, karena ikan jenis ini memiliki cita rasa yang lezat. Oleh karena itu, banyak restoran yang menyajikan ikan nila sebagai hidangan unggulan.\n" +
                "\n" +
                "Ikan nila menjadi salah satu ikan yang mempunyai banyak penggemar. Jadi, tak salah jika Anda berniat untuk mencoba bisnis budidaya ikan nila. Proses budidaya ikan ini pun tidak memerlukan teknik khusus dan juga tidak sulit untuk memeliharanya. Ikan ini merupakan kerabat dari ikan mujair. Sebab, kedua ikan tersebut memiliki sifat yang hampir sama.\n" +
                "\n" +
                "Sifat yang dimaksud adalah kedua ikan tersebut mudah untuk beradaptasi dengan lingkungan sekitar kolam. Selain itu, proses pengembangbiakannya tergolong cepat dan mudah. Untuk harganya sendiri, ikan nila merupakan ikan air tawar yang mempunyai harga pasar yang tergolong mahal.");

        namaData.add(" Ikan Gabus ");
        fotoData.add("https://cdnwpseller.gramedia.net/wp-content/uploads/2021/07/16105541/ikan-gabus2-531x324.jpg");
        infoData.add("Ada yang sudah pernah mengonsumsi ikan gabus? meski tidak terlalu familiar di menu restoran atau tempat makan, ikan ini ternyata sudah mempunyai penggemarnya sendiri. Hal ini terbukti dengan adanya permintaan pasar yang cukup tinggi terhadap ikan gabus. Namun, ketersediaan ikan gabus tidak sebanding dengan permintaan pasar. Oleh karena itu, bisnis budidaya ikan konsumsi jenis ini sangat potensial. Sebab, masih jarang orang yang memiliki bisnis budidaya ikan gabus.\n" +
                "\n" +
                "Selain menjadi ikan konsumsi, ikan gabus juga dikenal sebagai ikan hias. Selain itu kandungan protein serta albumin di dalam ikan gabus sangatlah tinggi, yaitu 70% protein dan 21% albumin yang secara detail dijelaskan pada Panduan Lengkap Bisnis dan Budi Daya Ikan Gabus.");


        prosesRecycleViewAdapter();
    }

}