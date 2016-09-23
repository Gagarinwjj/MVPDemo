package wjj.mvpdemo.view;

import android.os.Bundle;

import wjj.mvpdemo.R;
import wjj.mvpdemo.base.MvpActivity;
import wjj.mvpdemo.model.User;
import wjj.mvpdemo.presenter.IMainPresenter;
import wjj.mvpdemo.presenter.MainPresenter;

public class MainActivity extends MvpActivity implements IMainView {

    IMainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter(this);
        presenter.getUserInfo();
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
}
