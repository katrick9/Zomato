package com.example.krishna.zomato;

/**
 * Created by krishna on 3/2/18.
 */

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by krishna on 3/2/18.
 */

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProudctViewHolder>{

    private Context mCtx;
    private List<Product>  productList;

    public ProductAdapter(Context mCtx, List<Product> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    @Override
    public ProudctViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_layout, null);
        return  new ProudctViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProudctViewHolder holder, int position) {

        //getting the product of the specified position
        Product product = productList.get(position);

        //binding the data with the viewholder views
        holder.textViewTitle.setText(product.getTitle());
        holder.textViewDesc.setText(product.getShortdesc());
        holder.textViewRating.setText(String.valueOf(product.getRating()));
        holder.textViewPrice.setText(String.valueOf(product.getPrice()));

        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));


    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProudctViewHolder extends RecyclerView.ViewHolder{

        TextView textViewTitle, textViewDesc, textViewRating, textViewPrice;
        ImageView imageView;

        public ProudctViewHolder(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            textViewTitle = (TextView) itemView.findViewById(R.id.textViewTitle);
            textViewDesc = (TextView) itemView.findViewById(R.id.textViewShortDesc);
            textViewRating = (TextView) itemView.findViewById(R.id.textViewRating);
            textViewPrice = (TextView) itemView.findViewById(R.id.textViewPrice);
        }
    }

}
