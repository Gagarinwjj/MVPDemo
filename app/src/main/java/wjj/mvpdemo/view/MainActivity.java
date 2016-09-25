package wjj.mvpdemo.view;

import android.os.Bundle;

import wjj.mvpdemo.R;
import wjj.mvpdemo.base.MvpActivity;
import wjj.mvpdemo.model.User;
import wjj.mvpdemo.presenter.MainPresenter;

public class MainActivity extends MvpActivity<MainPresenter> implements IMainView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter.getUserInfo();
    }

    @Override
    public MainPresenter createPresenter() {
        return new MainPresenter(this);
    }

    @Override
    public void showMainInfo() {

    }

    @Override
    public void hideMainInfo() {

    }

    @Override
    public void saveUser(User user) {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //mind1:此处需要实现Presenter的解耦,既然所有Activity都要实现,所以放到父类
    }
}
