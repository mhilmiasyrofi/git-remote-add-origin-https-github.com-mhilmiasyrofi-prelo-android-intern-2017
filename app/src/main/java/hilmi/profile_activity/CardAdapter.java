package hilmi.profile_activity;

/**
 * Created by hilmi on 14/04/2017.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;

import hilmi.login_activity.R;
import model.Datum;
import model.LoveListResponse;

class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {

    private Context context;

    //List of Love
    LoveListResponse loveList;

    public CardAdapter(LoveListResponse loveList, Context context){
        super();
        this.loveList = loveList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.love_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Datum data =  loveList.getData().get(position);

        Glide.with(context).load(data.getDisplayPicts().get(0)).into(holder.imageView);
        holder.textViewName.setText(data.getName());
        holder.textViewRank.setText("Rp " + data.getPrice());
    }

    @Override
    public int getItemCount() {
        return loveList.getData().size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageView;
        public TextView textViewName;
        public TextView textViewRank;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageViewProfile);
            textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            textViewRank= (TextView) itemView.findViewById(R.id.textViewRank);
        }
    }
}