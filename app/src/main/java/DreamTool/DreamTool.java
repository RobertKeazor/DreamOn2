package dreamtool;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.androidsummit2016.dreamon.R;
import com.hookedonplay.decoviewlib.DecoView;

import butterknife.BindView;

public class DreamTool extends AppCompatActivity implements DreamToolView, DreamToolAdapter.OnDreamToolViewItemClick {
    DreamToolPresenter mPresenter = new DreamToolPresenter();

    @BindView(R.id.dreamChart) DecoView mDreamChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dream_tool);
        mPresenter.setView(this);
    }

    @Override
    public void renderDreamTool() {

    }

    @Override
    public void onClick() {

    }
}
