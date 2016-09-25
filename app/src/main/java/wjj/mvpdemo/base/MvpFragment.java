package wjj.mvpdemo.base;

import android.os.Bundle;
import android.view.View;

/**
 * Mvp基础Fragment
 * Created by wjj on 2016/9/23 11:12.
 */

public abstract class MvpFragment<P extends BasePresenter> extends BaseFragment implements
        IBaseView {
    public P presenter;

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter = createPresenter();
    }

    public abstract P createPresenter();

    @Override
    public void onDetach() {
        super.onDetach();
        presenter.detachView();
    }
}
