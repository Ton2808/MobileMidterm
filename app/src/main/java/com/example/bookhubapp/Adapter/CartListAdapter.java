package com.example.bookhubapp.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookhubapp.Interface.ChangeNumberItemsListener;
import com.example.bookhubapp.R;


//public class CartListAdapter extends RecyclerView.Adapter<CartListAdapter.ViewHolder>{
//    private ArrayList<FoodDomain> foodDomains;
//    private ManagementCart managementCart;
//    private ChangeNumberItemsListener changeNumberItemsListener;
//
//    public CartListAdapter(ArrayList<FoodDomain> foodDomains, ManagementCart managementCart, ChangeNumberItemsListener changeNumberItemsListener){
//        this.foodDomains = foodDomains;
//        this.managementCart = managementCart;
//        this.changeNumberItemsListener = changeNumberItemsListener;
//    }
//
//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_cart,parent,false);
//        return new ViewHolder(inflate);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        holder.title.setText(foodDomains.get(position).getTitle());
//        holder.feeEachItem.setText((String.valueOf(foodDomains.get(position).getFee())));
//        holder.totalEachItem.setText(String.valueOf(Math.round((foodDomains.get(position).getNumberInCart() * foodDomains.get(position).getFee()) * 100 ) / 100));
//        holder.num.setText(String.valueOf(foodDomains.get(position).getNumberInCart()));
//
//        int drawableResourceId = holder.itemView.getContext().getResources().getIdentifier(foodDomains.get(position).getPic(),
//                "drawable",holder.itemView.getContext().getPackageName());
//
//        Glide.with(holder.itemView.getContext()).load(drawableResourceId).into(holder.pic);
//
//        holder.plusItem.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//    }
//
//    @Override
//    public int getItemCount() {
//        return foodDomains.size();
//    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder{
//        TextView title, feeEachItem;
//        ImageView pic, plusItem, minusItem;
//        TextView totalEachItem, num;
//
//        public ViewHolder(@NonNull View itemView) {
//            super(itemView);
//            title = itemView.findViewById(R.id.titleTxt);
//            feeEachItem=itemView.findViewById(R.id.FeeEachItem);
//            pic=itemView.findViewById(R.id.picCart);
//            totalEachItem=itemView.findViewById(R.id.TotalEachItem);
//            num = itemView.findViewById(R.id.numberItem);
//            plusItem = itemView.findViewById(R.id.plusbutton);
//            minusItem = itemView.findViewById(R.id.minusbutton);
//        }
//    }
//}