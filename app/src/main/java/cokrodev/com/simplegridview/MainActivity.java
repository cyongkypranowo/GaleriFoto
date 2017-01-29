package cokrodev.com.simplegridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    private String[] images = new String[]{
            "http://www.pediaku.com/wp-content/uploads/2015/11/wanita-cantik.jpg",
            "https://i.ytimg.com/vi/rq6VQm-o7wM/maxresdefault.jpg",
            "http://media.infospesial.net/image/p/2015/09/nikahi-wanita-cantik-memperpendek-usia-pria-d11b.jpg",
            "http://cdn2.tstatic.net/bangka/foto/bank/images/wanita-cantik-turki_20160304_101535.jpg",
            "https://i.ytimg.com/vi/vR3uGo0B7Ow/maxresdefault.jpg",
            "http://2.bp.blogspot.com/-BBYDbrCe2ys/U33CRPlsHkI/AAAAAAAAABQ/JW2yZBJQSb8/s1600/bagaimana+wanita+cantik+itu+menurut+islam.jpg",
            "http://sidomi.com/wp-content/uploads/2015/06/hijab-turki-1-640x320.jpg",
            "http://boombastis.com/wp-content/uploads/2016/02/Wanita-Turki.jpg",
            "http://www.doktercantik.com/wp-content/uploads/2015/11/kecantikan-wanita-turki.jpg",
            "http://7uplagi.com/wp-content/uploads/2016/07/Tuba-Buyukustun.jpg"
    };
    private GridView gvItem;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Para Mantan wkwkwk");
        gvItem = (GridView)findViewById(R.id.gv_item);
        ItemGridAdapter itemGridAdapter = new ItemGridAdapter(MainActivity.this, images);
        gvItem.setAdapter(itemGridAdapter);
        gvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override

            public void onItemClick(AdapterView parent, View view,
                                    int position, long id) {
                DetailImageActivity.toDetailImageActivity(MainActivity.this,

                        images[position]);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_staggered) {
            StaggeredGridActivity.toStaggeredGridActivity(MainActivity.this);
            return true;

        }
        return super.onOptionsItemSelected(item);
    }
}