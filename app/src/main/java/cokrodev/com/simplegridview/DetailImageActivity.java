package cokrodev.com.simplegridview;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import uk.co.senab.photoview.PhotoViewAttacher;

public class DetailImageActivity extends AppCompatActivity {

    private ImageView imgDetail;
    public static String KEY_IMAGE = "image";
    private String imageUrl;
    private PhotoViewAttacher photoViewAttacher = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_image);

        getSupportActionBar().hide();

        imgDetail = (ImageView)findViewById(R.id.img_detail);
        imageUrl = getIntent().getStringExtra(KEY_IMAGE);
        photoViewAttacher = new PhotoViewAttacher(imgDetail);

        Picasso.with(DetailImageActivity.this).load(imageUrl).into(imgDetail);
    }

    public static void toDetailImageActivity(Activity activity, String imageUrl){
        Intent intent = new Intent(activity, DetailImageActivity.class);
        intent.putExtra(KEY_IMAGE, imageUrl);
        activity.startActivityForResult(intent, 0);
    }
}