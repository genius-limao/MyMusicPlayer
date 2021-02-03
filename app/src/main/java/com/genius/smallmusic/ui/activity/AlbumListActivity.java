package com.genius.smallmusic.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.genius.smallmusic.R;
import com.genius.smallmusic.ui.adapter.MusicListAdapter;

public class AlbumListActivity extends BaseActivity {
    private RecyclerView rcvList;
    private MusicListAdapter mMusicListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_list);
        initView();
    }

    private void initView() {
        initNavBar(true, getString(R.string.album_list), false);
        rcvList = findViewById(R.id.rcv_list);
        rcvList.setLayoutManager(new LinearLayoutManager(this));
        rcvList.setNestedScrollingEnabled(false);
        rcvList.addItemDecoration(new DividerItemDecoration(this,  DividerItemDecoration.VERTICAL));
        mMusicListAdapter = new MusicListAdapter(this, null);
        rcvList.setAdapter(mMusicListAdapter);
    }
}