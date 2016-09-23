package wjj.mvpdemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Mvp基础Activity
 * Created by wjj on 2016/9/23 11:11.
 */

public abstract class MvpActivity<P extends BasePresenter> extends BaseActivity {
    public P presenter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = createPresenter();

    }

    public abstract P createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter != null) {
            presenter.detachView();
        }
    }
}
