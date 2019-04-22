package com.example.lenovo.app;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.lenovo.app.model.Item;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.myViewHolder> {

    Context nContext;
    List<Item> nData;
    Item item2;

    ;
    public Adapter(Context nContext, List<Item> nData ) {
        this.nContext = nContext;
        this.nData = nData;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(nContext);
        View v = inflater.inflate(R.layout.cardview, parent, false);
        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final myViewHolder holder, int position) {
        holder.res_photo.setImageResource(nData.get(position).getResPhoto());
        holder.res_name.setText(nData.get(position).getResName());
        holder.res_place.setText(nData.get(position).getResPlace());
        holder.res_about.setText(nData.get(position).getResAbout());
        item2 = nData.get(position);
    }
    @Override
    public int getItemCount() {
        return nData.size();
    }
    public class myViewHolder extends RecyclerView.ViewHolder  {

        ImageView res_photo;
        TextView res_name, res_place, res_about;

        public myViewHolder(View itemView) {
            super(itemView);
            res_photo = itemView.findViewById(R.id.imageView);
            res_name = itemView.findViewById(R.id.name);
            res_place = itemView.findViewById(R.id.place);
            res_about = itemView.findViewById(R.id.about);
        }
    }
}