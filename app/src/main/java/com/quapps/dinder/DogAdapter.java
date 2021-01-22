package com.quapps.dinder;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Random;

public class DogAdapter extends RecyclerView.Adapter<DogAdapter.MyViewHolder> {
    private final Context context;
    private final ArrayList<String> headings;
    private final ArrayList<String> body;
    DogAdapter(Context context, ArrayList<String> headings, ArrayList<String> body){
        this.context=context;
        this.headings=headings;
        this.body=body;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater mInf=LayoutInflater.from(context);
        View myOwnView=mInf.inflate(R.layout.activity_like_layout,parent,false);
        return new MyViewHolder(myOwnView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.headings.setText(headings.get(position));
        holder.bodies.setText(body.get(position));
    }

    @Override
    public int getItemCount() {
        return headings.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView headings,bodies;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            //headings=itemView.findViewById(R.id.newsHeadingTextView);
            //bodies=itemView.findViewById(R.id.newsBodyTextView);
            //headings.setTextColor(randomColorGenerator());
            //bodies.setTextColor(randomColorGenerator());

        }
        private static int randomColorGenerator(){
            Random rnd = new Random();
            return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        }
    }
}
