package adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.zhang.hitsystem.R;

import java.util.List;

import bean.Score;
import bean.TodayReci;

public class TodayReciAdapter extends RecyclerView.Adapter <TodayReciAdapter.ViewHolder>{

    private List<TodayReci> mScoreList;

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        TextView stunum;
//        TextView score;

        public ViewHolder(View view){
            super(view);
            name = (TextView) view.findViewById(R.id.student_name_kc);
            stunum = (TextView) view.findViewById(R.id.student_stunum_kc);
//            score = (TextView) view.findViewById(R.id.student_score);
        }
    }

    public TodayReciAdapter(List<TodayReci> scoreList){
        mScoreList = scoreList;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.student_item_kc, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TodayReci todayReci = mScoreList.get(position);
        holder.name.setText(todayReci.getReci_time());
        holder.stunum.setText(todayReci.getReci_name());
//        holder.score.setText(score.getScore());
    }

    @Override
    public int getItemCount() {
        return mScoreList.size();
    }
}
