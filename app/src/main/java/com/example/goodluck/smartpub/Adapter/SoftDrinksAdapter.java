package com.example.goodluck.smartpub.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.goodluck.smartpub.Model.AbstractModel;
import com.example.goodluck.smartpub.R;

import java.util.ArrayList;

public class SoftDrinksAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private Context context;
    private ArrayList<AbstractModel> itemList;

    public SoftDrinksAdapter(Context context, ArrayList<AbstractModel> itemList) {
        this.context = context;
        this.itemList = itemList;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.softdrinks_item_list,viewGroup,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        //Here you can fill your row view
        if (holder instanceof ViewHolder){
            final AbstractModel model = getItem(position);
            ViewHolder genericViewHolder = (ViewHolder) holder;

            genericViewHolder.mItemName.setText(model.getItemName());
            genericViewHolder.imageSrc.setImageResource(model.getImageResourceId());
        }

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    private AbstractModel getItem(int position) {
        return itemList.get(position);
    }

    /**
     * this class helps to find the right view to display
     */
    public  class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageSrc;
        TextView mItemName;

        public ViewHolder(View itemView) {
            super(itemView);

            //Find views to display in single list item
            this.imageSrc = itemView.findViewById(R.id.image_view);
            this.mItemName = itemView.findViewById(R.id.item_name);
        }
    }
}
