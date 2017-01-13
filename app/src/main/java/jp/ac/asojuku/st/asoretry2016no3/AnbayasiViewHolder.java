package jp.ac.asojuku.st.asoretry2016no3;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Garudo24 on 2017/01/13.
 */

public class AnbayasiViewHolder extends RecyclerView.ViewHolder {

    View base;
    TextView textViewNumber;
    TextView textViewComment;

    public AnbayasiViewHolder(View v){
        super(v);
        this.base = v;
        this.textViewNumber = (TextView) v.findViewById(R.id.number);
        this.textViewComment = (TextView) v.findViewById(R.id.comment);
    }
}
