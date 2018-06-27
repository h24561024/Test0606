package com.example.cjcu.test0531;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cjcu.test0531.R;
import com.example.cjcu.test0531.person;

import java.util.List;

/**
 * Created by CJCU on 2018/6/13.
 */

public class transactionAdapter extends RecyclerView.Adapter<transactionAdapter.ViewHolder>{
    private List<person> trans;

    public transactionAdapter(List<person> trans) {
        this.trans = trans;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_row,parent,false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        person person = trans.get(position);
        holder.item_cdate.setText(person.getCdate());
        holder.item_info.setText(person.getIngo());
        holder.item_amount.setText(person.getAmount());
    }

    @Override
    public int getItemCount() {
        return trans.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView item_cdate;
        private final TextView item_info;
        private final TextView item_amount;

        public ViewHolder(View itemView) {
            super(itemView);
            item_cdate = itemView.findViewById(R.id.tv_cdate);
            item_info = itemView.findViewById(R.id.tv_info);
            item_amount = itemView.findViewById(R.id.tv_amount);
        }
    }
}