package cokrodev.com.simplegridview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;

import com.etsy.android.grid.StaggeredGridView;

public class StaggeredGridActivity extends AppCompatActivity {

    private StaggeredGridView staggeredGridView;
    private String[] items = new String[]{
            "http://1.bp.blogspot.com/-9LmMzr2gKhA/ViBcbOBTWJI/AAAAAAAADY0/FP3lKfO8u5s/s1600/Gambar-Meme-Komik-Lucu-bikin-Ngakak-15.jpg",
            "http://2.bp.blogspot.com/-B3kVQx9NWKo/ViBccF7UwXI/AAAAAAAADZU/zDeiMzktPww/s1600/Gambar-Meme-Komik-Lucu-bikin-Ngakak-19.jpg",
            "http://1.bp.blogspot.com/-lGS04O8l0e0/VWUsTO4ZyeI/AAAAAAAAA9o/wNS4LT791w4/s1600/Gambar%2BMeme%2BKomik%2BLucu%2B6.jpg",
            "http://tutorialaplikasi.com/wp-content/uploads/2016/08/Kumpulan-meme-komik-paling-kocak-300x300.jpg",
            "http://1.bp.blogspot.com/-FlAAu3WTU8g/ViBcd6_vRfI/AAAAAAAADaA/TouDMqsM5L4/s1600/Gambar-Meme-Komik-Lucu-bikin-Ngakak-24.jpg",
            "http://1.bp.blogspot.com/-KM8m_-6E8v0/UYohSpV_30I/AAAAAAAAAaY/l2Clz_W8Sq0/s1600/tumblr_mm2dbyOfQ51rid89jo1_500.jpg",
            "http://tutorialaplikasi.com/wp-content/uploads/2016/08/Dp-bbm-meme-komik-300x300.jpg",
            "http://www.memecomicindonesia.net/wp-content/uploads/2016/05/meme-comic-teletubbies-12-1.jpg",
            "https://4.bp.blogspot.com/-iKgXnEuG8cI/Vr1DqsbiNTI/AAAAAAAABcU/F6wRUckfZew/s1600/Gambar-Meme-Komik-Jomblo-Ngenes-Lucu-5.jpg",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRj4qXb6R2VMt38-aiqalWBv9S1FRv2NH3qGEMMCNBKtfDD_YsJ"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staggered_grid);

        getSupportActionBar().setTitle("Meme");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        staggeredGridView = (StaggeredGridView)findViewById(R.id.gv_staggered);
        ItemGridAdapter itemGridAdapter = new ItemGridAdapter(StaggeredGridActivity.this, items);
        staggeredGridView.setAdapter(itemGridAdapter);
        staggeredGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                DetailImageActivity.toDetailImageActivity(StaggeredGridActivity.this, items[position]);
            }
        });
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == android.R.id.home) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public static void toStaggeredGridActivity(Context context){
        context.startActivity(new Intent(context, StaggeredGridActivity.class));
    }
}
