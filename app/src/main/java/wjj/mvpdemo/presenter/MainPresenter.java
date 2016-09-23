package wjj.mvpdemo.presenter;

import wjj.mvpdemo.view.IMainView;
import wjj.mvpdemo.model.User;

/**
 * Main业务实现
 * Created by wjj on 2016/9/23 11:19.
 */

public class MainPresenter implements IMainPresenter {
    private IMainView view;

    public MainPresenter(IMainView view) {
        this.view = view;
    }

    @Override
    public void getUserInfo() {
        view.showMainInfo();
        User user = new User("wjj", 28);
        view.saveUser(user);
        view.hideMainInfo();
    }
}
