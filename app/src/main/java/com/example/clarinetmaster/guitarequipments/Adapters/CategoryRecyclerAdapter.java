package com.example.clarinetmaster.guitarequipments.Adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.clarinetmaster.guitarequipments.Model.appCategory;
import com.example.clarinetmaster.guitarequipments.R;
import com.example.clarinetmaster.guitarequipments.Utilities.Utils;

import java.util.ArrayList;

public class CategoryRecyclerAdapter extends RecyclerView.Adapter<CategoryRecyclerAdapter.ViewHolder> {

    private ArrayList<appCategory> mDataset;
    private Context context;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public ImageView mImageView;
        public TextView mTextView;
        public CardView mCardView;
        public ViewHolder(final View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.category_name_text_view);
            mImageView = (ImageView) itemView.findViewById(R.id.category_image_view);
            mCardView = (CardView) itemView.findViewById(R.id.card_view);
        }
    }

    public CategoryRecyclerAdapter(Context context, ArrayList<appCategory> myDataset) {
        this.context = context;
        mDataset = myDataset;
    }

    @Override
    public CategoryRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_cardview, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.mTextView.setText(mDataset.get(position).getName());
        Drawable drawable = Utils.getDrawableFromAssets(context, mDataset.get(position).getImage());
        holder.mImageView.setImageDrawable(drawable);

        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appCategory selected = mDataset.get(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

}
