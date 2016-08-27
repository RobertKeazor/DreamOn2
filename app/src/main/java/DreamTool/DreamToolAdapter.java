package dreamtool;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class DreamToolAdapter extends RecyclerView.Adapter<DreamToolAdapter.DreamViewHolder> {
    private OnDreamToolViewItemClick mOnDreamToolViewItemClick;

    @Override
    public DreamViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(DreamViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public void OnDreamToolViewItemClick (OnDreamToolViewItemClick onDreamToolViewItemClick) {
        mOnDreamToolViewItemClick = onDreamToolViewItemClick;
    }

    public boolean hasDreamToolClickListener() {
        return mOnDreamToolViewItemClick != null;
    }

    public class DreamViewHolder extends RecyclerView.ViewHolder {
        public DreamViewHolder(View itemView) {
            super(itemView);
        }
    }

    public interface OnDreamToolViewItemClick {
        void onClick();
    }
}
