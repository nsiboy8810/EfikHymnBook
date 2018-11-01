package com.example.nyongnsikak.efikhymnbook;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class HymnListAdapter extends RecyclerView.Adapter<HymnListAdapter.HymnListAdapterViewHolder> {
    List<HymnItem> hymnItemList = new ArrayList<>();

    @Override
    public HymnListAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int hymnXml = R.layout.hymn_list;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(hymnXml, parent,false);
        return new HymnListAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HymnListAdapterViewHolder holder, int position) {
        holder.imageView.setImageResource(hymnItemList.get(position).getImage());
        holder.titleTextView.setText(hymnItemList.get(position).getTitle());


    }

    @Override
    public int getItemCount() {
        if (hymnItemList != null){
            return hymnItemList.size();
        }
        return 0;
    }

    class HymnListAdapterViewHolder extends RecyclerView.ViewHolder{

        TextView titleTextView;
        ImageView imageView;
        HymnListAdapterViewHolder(View itemView) {
            super(itemView);
            titleTextView = (TextView) itemView.findViewById(R.id.tv_title);
            imageView = (ImageView) itemView.findViewById(R.id.iv_image);

        }
    }
}
