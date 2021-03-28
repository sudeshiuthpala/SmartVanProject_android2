package com.example.smartvanproject;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapterFees extends RecyclerView.Adapter <RecyclerAdapterFees.FeesRecyclerViewHolder> {
    private static final int TYPE_HEAD = 0;
    private static final int TYPE_LIST = 1;
    //private RecyclerViewClickListener listener;
    ArrayList<FeePayment> arrayList;
    Context context;

    public RecyclerAdapterFees(ArrayList<FeePayment> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
        //this.listener=listener;
    }

    @NonNull
    @Override
    public RecyclerAdapterFees.FeesRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fees_row_layout, parent, false);
        RecyclerAdapterFees.FeesRecyclerViewHolder feesrecycleHolder = new RecyclerAdapterFees.FeesRecyclerViewHolder(view);
        return feesrecycleHolder;
        //return null;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapterFees.FeesRecyclerViewHolder holder, final int position) {
        //if(holder.viewType==TYPE_LIST){
        final FeePayment fee = arrayList.get(position);
        holder.paymentId.setText(Integer.toString(fee.getPaymentId()));
        holder.childId.setText(Integer.toString(fee.getChildId()));
        holder.fname.setText(fee.getChildfname());
        holder.lname.setText(fee.getChildlname());
        holder.amount.setText(fee.getAmount());
        holder.paymentdate.setText(fee.getPayment_date());

//        holder.reject.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i7=new Intent(context,RequestRejectAction.class);
//                i7.putExtra("requestId",Integer.toString(request.getRequestId()));
//                context.startActivity(i7);
//            }
//        });


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }





//    @NonNull
//    @Override
//    public RecycleHolder onCreateViewHolder(@NonNull ViewGroup parent) {
////        if(viewType==TYPE_HEAD){
////            View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.request_header_layout,parent,false);
////            RecycleHolder recycleHolder=new RecycleHolder(view,viewType);
////            return recycleHolder;
////        }
//        // context=parent.getContext();
////        if (viewType==TYPE_LIST){
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.request_row_layout, parent, false);
//        RecycleHolder recycleHolder = new RecycleHolder(view);
//        return recycleHolder;
//        //}
//        // return null;
//    }








    //meka api hadanna ona
    public class FeesRecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView paymentId,childId,fname,lname,amount,paymentdate;
        int viewType;
        //Button delete;

        // private RecycleAdapter.RecyclerViewClickListener listener;
        //private RecycleHolder listener;
        //constructor
        public FeesRecyclerViewHolder(View view) {
            super(view);

            //if(viewType==TYPE_LIST){
            //
            paymentId = view.findViewById(R.id.paymentid2);
            childId=view.findViewById(R.id.childid3);
            fname = view.findViewById(R.id.childfname3);
            lname = view.findViewById(R.id.childlname3);
            amount=view.findViewById(R.id.amount2);
            paymentdate=view.findViewById(R.id.paymentdate);
            // this.viewType=viewType;
            //view.setOnClickListener(this);
//                accept.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Intent i=new Intent(v.getContext(),RequestAcceptAction.class);
//                        i.putExtra("requestId",RecycleAdapter.arrayList.get(getAdapterPosition()));
//                    }
//                });
        }
//            else if (viewType==TYPE_HEAD){
//                this.viewType=TYPE_HEAD;
//
//            }


//           view.setOnClickListener(new View.OnClickListener() {
//               @Override
//               public void onClick(View v) {
//                   RecyclerViewClickListener.select()
//               }
//           });
    }
}
