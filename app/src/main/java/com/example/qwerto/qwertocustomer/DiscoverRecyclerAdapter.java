package com.example.qwerto.qwertocustomer;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DiscoverRecyclerAdapter extends RecyclerView.Adapter<DiscoverRecyclerAdapter.ContactViewHolder> {

    private List<DiscoverItem> itemList;
    static Context c;

    public DiscoverRecyclerAdapter(List<DiscoverItem> itemList, Context c) {
        this.itemList = itemList;
        this.c = c;
    }


    @Override
    public int getItemCount() {
        return itemList.size();
    }

    @Override
    public void onBindViewHolder(ContactViewHolder contactViewHolder, int i) {
        DiscoverItem ci = itemList.get(i);
        contactViewHolder.vDesc.setText(ci.description);
        contactViewHolder.vHashtags.setText(ci.hashtags);
        contactViewHolder.vLikes.setText(ci.likes);
        contactViewHolder.vRecommendations.setText(ci.recommendations);
        contactViewHolder.vTitle.setText(ci.name);
        contactViewHolder.vProductName.setText(ci.productname);
        contactViewHolder.vPrice.setText(ci.price);
        Typeface ralewaybold = Typeface.createFromAsset(c.getAssets(), "fonts/Raleway-Bold.ttf");
        Typeface quicksand = Typeface.createFromAsset(c.getAssets(), "fonts/Quicksand-Regular.ttf");
        contactViewHolder.vTitle.setTypeface(ralewaybold);
        contactViewHolder.vDesc.setTypeface(quicksand);
        contactViewHolder.vHashtags.setTypeface(quicksand);
        contactViewHolder.vProductName.setTypeface(quicksand);
        contactViewHolder.vPrice.setTypeface(quicksand);
        contactViewHolder.vLikes.setTypeface(quicksand);
        contactViewHolder.vRecommendations.setTypeface(quicksand);
        contactViewHolder.vProfilePic.setImageResource(ci.profilepic);
        contactViewHolder.vItemPic.setImageResource(ci.itempic);
        contactViewHolder.vItemPic.setScaleType(ImageView.ScaleType.FIT_XY);
        contactViewHolder.vFieldImage1.setImageResource(ci.fieldimage1);
        contactViewHolder.vFieldImage2.setImageResource(ci.fieldimage2);
        contactViewHolder.chattxt.setTypeface(quicksand);
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.discover_card, viewGroup, false);

        return new ContactViewHolder(itemView);
    }

    public static class ContactViewHolder extends RecyclerView.ViewHolder {

        protected TextView vDesc;
        protected TextView vHashtags;
        protected TextView vTitle;
        protected TextView vProductName;
        protected TextView vPrice;
        protected TextView vLikes;
        protected TextView vRecommendations;
        protected TextView chattxt;
        protected ImageView vProfilePic;
        protected ImageView vItemPic;
        protected ImageView vFieldImage1;
        protected ImageView vFieldImage2;

        public ContactViewHolder(View v) {
            super(v);
            vDesc =  (TextView) v.findViewById(R.id.txtDesc);
            vHashtags = (TextView)  v.findViewById(R.id.txtHashtags);
            vTitle = (TextView) v.findViewById(R.id.title);
            vProductName = (TextView) v.findViewById(R.id.productname);
            vPrice = (TextView) v.findViewById(R.id.price);
            vLikes = (TextView) v.findViewById(R.id.likesText);
            vRecommendations = (TextView) v.findViewById(R.id.recommendationText);
            vProfilePic = (ImageView) v.findViewById(R.id.shop_profile_pic);
            vItemPic = (ImageView) v.findViewById(R.id.item_pic);
            vFieldImage1 = (ImageView) v.findViewById(R.id.fieldimage1);
            vFieldImage2 = (ImageView) v.findViewById(R.id.fieldimage2);
            chattxt = (TextView) v.findViewById(R.id.chattxt);
        }
    }
}