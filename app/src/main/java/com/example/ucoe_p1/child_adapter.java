package com.example.ucoe_p1;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class child_adapter extends RecyclerView.Adapter<child_adapter.ViewHolder>
{
    List<child_model> child_modelList;
    Context context;

    public child_adapter(List<child_model> child_modelList, Context context)
    {
        this.child_modelList = child_modelList;
        this.context = context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.child_rv,null,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        int k=child_modelList.get(position).change_size;

        if (k==3)
        {
            LinearLayout.LayoutParams lp= new LinearLayout.LayoutParams(580,335);
            holder.btn1.setLayoutParams(lp);
        }
        else if(k==10)
        {
            LinearLayout.LayoutParams lp= new LinearLayout.LayoutParams(1050,400);
            holder.btn1.setLayoutParams(lp);
            holder.btn1.setPadding(0,0,0,200);
            holder.btn1.setEnabled(false);
            holder.btn1.setBackgroundResource(R.color.white);
        }
        holder.btn1.setText(child_modelList.get(position).btn);
        String send=(String) child_modelList.get(position).btn;
        holder.btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
//                Toast.makeText(context, "s = "+send, Toast.LENGTH_SHORT).show();
                Intent ieven=new Intent(context,download.class);
                ieven.putExtra("paper",send);
                view.getContext().startActivity(ieven);
//                view.getContext().startActivity(new Intent(context,download.class));
            }
        });
    }
    @Override
    public int getItemCount() {
        return child_modelList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder
    {
        Button btn1;
        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            btn1=itemView.findViewById(R.id.btn1);
        }
    }
}