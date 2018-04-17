package canvas.com.accordiandemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.List;

import canvas.com.accordiandemo.R;
import canvas.com.accordiandemo.model.Category;


public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.MyViewHolder> {
    private Context mContext;
    private List<Category> Categories;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView from;
        public TextView txt_pcat_name;
        public RadioGroup rg_main;

        public MyViewHolder(View view) {
            super(view);
            from = (TextView) view.findViewById(R.id.from);
            rg_main = (RadioGroup) view.findViewById(R.id.rg_main);
        }

    }

    public CategoryAdapter(Context mContext, List<Category> Categories) {
        this.mContext = mContext;
        this.Categories = Categories;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.message_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final Category category = Categories.get(position);
        // displaying text view data

        // holder.txt_pcat_name.setText(category.getMainCatname());
        holder.from.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                category.setOpen(!category.isOpen());
                notifyItemChanged(position);
            }
        });


        if (category.isOpen()) {
            holder.rg_main.setVisibility(View.VISIBLE);
        } else {
            holder.rg_main.setVisibility(View.GONE);
        }
    }


    @Override
    public int getItemCount() {
        return Categories.size();
    }


}