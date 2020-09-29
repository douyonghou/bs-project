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

public class ScoreAdapter_kc extends RecyclerView.Adapter <ScoreAdapter_kc.ViewHolder>{

    private List<Score> mScoreList;

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

    public ScoreAdapter_kc(List<Score> scoreList){
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
        Score score = mScoreList.get(position);
        holder.name.setText(score.getName());
        holder.stunum.setText(score.getStunum());
//        holder.score.setText(score.getScore());
    }

    @Override
    public int getItemCount() {
        return mScoreList.size();
    }
}
