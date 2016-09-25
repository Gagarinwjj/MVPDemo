package wjj.mvpdemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Mvp基础Activity
 * Created by wjj on 2016/9/23 11:11.
 */

public abstract class MvpActivity<P extends BasePresenter> extends BaseActivity implements
        IBaseView {
    public P presenter;


    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = createPresenter();

    }

    public abstract P createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //mind2:此处需要实现Presenter的解耦,但是具体的Presenter在子类中,这里没有Presenter的引用,
        //为了把子类的Presenter写到这里,需要一个BasePresenter以及一个泛型。
        if (presenter != null) {
            presenter.detachView();
        }
    }
}
