package com.mohammad.shareimagewithtext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_share(View view) {
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.setType("image/*");
        Uri uri=Uri.parse("android.resourse://"+getPackageName()+"/drawable/"+(R.drawable.m));
        intent.putExtra(Intent.EXTRA_STREAM,uri);
        intent.putExtra(Intent.EXTRA_TEXT,"مشاركة صورة من التطبيق");
        Intent chooser=Intent.createChooser(intent,"مشاركة صورة");
        if (intent.resolveActivity(getPackageManager())!= null)
            startActivity(intent);
    }
}
