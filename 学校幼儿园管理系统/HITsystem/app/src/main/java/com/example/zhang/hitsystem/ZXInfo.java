package com.example.zhang.hitsystem;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

/**
 * 园区管理
 */
public class ZXInfo extends AppCompatActivity{
    private int[] imgId=new int[]{ R.drawable.zx1};
    private int option=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zx_info);
        final ImageSwitcher myswitch=(ImageSwitcher) findViewById(R.id.myImgswitch);
        myswitch.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView=new ImageView(ZXInfo.this);
                return imageView;
            }
        });
        myswitch.setImageResource(imgId[0]);
       /* myswitch.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                option++;
                myswitch.setImageResource(imgId[option%imgId.length]);

            }
        }); 这个是直接点击图片就可以切换，没有和画廊关联*/


        @SuppressWarnings("deprecation")
        Gallery myGalley=(Gallery) findViewById(R.id.myGallery);
        BaseAdapter baseAdp=new BaseAdapter() {

            @SuppressWarnings("deprecation")
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                ImageView imageView=new ImageView(ZXInfo.this);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setLayoutParams(new Gallery.LayoutParams(100, 100));
                imageView.setImageResource(imgId[position%imgId.length]);
                return imageView;
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public Object getItem(int position) {
                return imgId[position];
            }

            @Override
            public int getCount() {
                return imgId.length*3;
                /*return Integer.MAX_VALUE;这里可以设置控制循环次数*/
            }
        };
        myGalley.setAdapter(baseAdp);
        myGalley.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                myswitch.setImageResource(imgId[position%imgId.length]);


            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
