package com.example.foodorder.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.asksira.loopingviewpager.LoopingPagerAdapter;
import com.bumptech.glide.Glide;
import com.example.foodorder.EventBus.BestDealItemClick;
import com.example.foodorder.Model.BestDealModel;
import com.example.foodorder.R;

import org.greenrobot.eventbus.EventBus;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MyBestDealsAdapter extends LoopingPagerAdapter<BestDealModel> {

    @BindView(R.id.img_best_deal)
    ImageView img_best__deal;
    @BindView(R.id.txt_best_deal)
    TextView txt_best_deal;

    Unbinder unbinder;


    public MyBestDealsAdapter(Context context, List<BestDealModel> itemList, boolean isInfinite) {
        super(context, itemList, isInfinite);
    }

    @Override
    protected View inflateView(int viewType, ViewGroup container, int listPosition) {
        return LayoutInflater.from(context).inflate(R.layout.layout_best_deal_items, container,false);
    }

    @Override
    protected void bindView(View convertView, int listPosition, int viewType) {
//        ImageView imageView = (ImageView)convertView.findViewById(R.id.img_best_deal);

        unbinder = ButterKnife.bind(this, convertView);
        //Set data
        Glide.with(convertView).load(itemList.get(listPosition).getImage()).into(img_best__deal);
        txt_best_deal.setText(itemList.get(listPosition).getName());

        convertView.setOnClickListener(view -> {
            EventBus.getDefault().postSticky(new BestDealItemClick(itemList.get(listPosition)));
        });
    }
}
