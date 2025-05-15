package com.websarva.wings.android.a0514;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getSupportActionBar().setTitle("アクションバーだよ＾＾");
        /*
        基本的にこれはMainActivityのコピペでよさげ。
        setContentViewで表示する画面を設定することぐらいは理解しといたほうがいいかも。
        */

        ActionBar actionbar = getSupportActionBar();
        if(actionbar != null){
            actionbar.setDisplayHomeAsUpEnabled(true);
        }

    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
    /*
    onSupportNavigateUp()はイベントリスナみたいなもん。
    でもメニューバーはイベントリスナを自作しなくても、Android側で自動で備わってる。
    ちなみにboolean型なのは、
    Android側に「処理が終わったよ！」って知らせるため。
    trueを返す＝自分でいろいろ設定終わったよ(あとは表示させるだけよ！)
    …って伝えるため。
    */
}
