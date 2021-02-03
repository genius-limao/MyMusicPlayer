package com.genius.smallmusic.ui.activity;

import android.os.Bundle;
import android.view.View;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.genius.smallmusic.R;
import com.genius.smallmusic.ui.adapter.MusicGridAdapter;
import com.genius.smallmusic.ui.adapter.MusicListAdapter;
import com.genius.smallmusic.ui.views.GridSpaceItemDecoration;

public class MainActivity extends BaseActivity {
    private RecyclerView rcvGrid;
    private RecyclerView rcvList;
    private MusicGridAdapter mMusicGridAdapter;
    private MusicListAdapter mMusicListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        initNavBar(false, getString(R.string.app_name), true);

        rcvGrid = findViewById(R.id.rcv_grid);
        rcvList = findViewById(R.id.rcv_list);
        //创建一个网格布局，每行展示3列
        rcvGrid.setLayoutManager(new GridLayoutManager(this, 3));
        rcvGrid.addItemDecoration(new GridSpaceItemDecoration(getResources().getDimensionPixelSize(R.dimen.albumMarginSize), rcvGrid));
        rcvGrid.setNestedScrollingEnabled(false);
        mMusicGridAdapter = new MusicGridAdapter(this);
        rcvGrid.setAdapter(mMusicGridAdapter);
        //创建一个线性布局
        /**
         * 1.假如已经知道列表高度，
         */
        rcvList.setLayoutManager(new LinearLayoutManager(this));
        rcvList.setNestedScrollingEnabled(false);
        rcvList.addItemDecoration(new DividerItemDecoration(this,  DividerItemDecoration.VERTICAL));
        mMusicListAdapter = new MusicListAdapter(this, rcvList);
        rcvList.setAdapter(mMusicListAdapter);
    }
}