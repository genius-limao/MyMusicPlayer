package com.genius.smallmusic.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.genius.smallmusic.R;
import com.genius.smallmusic.ui.activity.AlbumListActivity;
import com.genius.smallmusic.ui.activity.PlayMusicActivity;

public class MusicListAdapter extends RecyclerView.Adapter<MusicListAdapter.ViewHolder> {

    private Context context;
    private View mItemView;
    private RecyclerView mRecyclerView;
    private boolean isCalculationRecyclerView;


    public MusicListAdapter(Context context, RecyclerView recyclerView) {
        this.context = context;
        mRecyclerView = recyclerView;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mItemView = LayoutInflater.from(context).inflate(R.layout.item_list_music, parent, false);
        return new ViewHolder(mItemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //使用Glide加载网络图片
        setRecyclerViewHeight();
        Glide.with(context).load("http://res.lgdsunday.club/poster-1.png")
                .into(holder.ivIcon);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, PlayMusicActivity.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return 8;
    }

    /**
     * 1.获取ItemView的高度
     * 2.item的数量
     * 3.使用itemViewHeight * itemViewNum = RecyclerVIew的高度
     */
    private void setRecyclerViewHeight() {
        if (isCalculationRecyclerView || mRecyclerView == null) {
            return;
        }
        //获取ItemView的高度
        RecyclerView.LayoutParams iteViewLp = (RecyclerView.LayoutParams) mItemView.getLayoutParams();
        //获取数量
        int itemCount = getItemCount();
        int recyclerViewHeight = iteViewLp.height * itemCount;
        LinearLayout.LayoutParams recyclerViewLp = (LinearLayout.LayoutParams) mRecyclerView.getLayoutParams();
        recyclerViewLp.height = recyclerViewHeight;
        mRecyclerView.setLayoutParams(recyclerViewLp);
        isCalculationRecyclerView = true;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivIcon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivIcon = itemView.findViewById(R.id.iv_icon);
        }
    }
}
