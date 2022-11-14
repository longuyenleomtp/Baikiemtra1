package com.example.firebase;

import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.firebase.ui.database.FirebaseRecycleAdapter;
import de.hdodenhof.circleimageview.CircleImageView;


public class MainAdapter extends FireBaseRecycleAdapter<InfoSinger, MainAdapter.myViewHolder> {

    public MainAdapter(FirebaseRecycleOption<InfoSinger> options) {
        super(options);
    }

    public void onBindViewHolder(ViewGroup parent, int viewType) {
        return;
    }


    class myViewerHolder extends RecyclerView.ViewHolder {
        CircleImageView img;
        TextView name, nickname, nationality, star;

        public myViewerHolder(View itemView) {
            super(itemView);
            name = (TextView)itemView.findViewById(R.id.name);
            nickname = (TextView)itemView.findViewById(R.id.nickname);
            nationality = (TextView)itemView.findViewById(R.id.nationality);
            star = (TextView)itemView.findViewById(R.id.star);

        }

    }
}
