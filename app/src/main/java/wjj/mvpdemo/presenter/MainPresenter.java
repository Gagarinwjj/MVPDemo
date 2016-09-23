package wjj.mvpdemo.presenter;

import wjj.mvpdemo.base.BasePresenter;
import wjj.mvpdemo.model.User;
import wjj.mvpdemo.view.IMainView;

/**
 * Main业务实现
 * Created by wjj on 2016/9/23 11:19.
 */

public class MainPresenter extends BasePresenter<IMainView> implements IMainPresenter {


    public MainPresenter(IMainView view) {
        attachView(view);
    }

    @Override
    public void getUserInfo() {
        view.showMainInfo();
        User user = new User("wjj", 28);
        view.saveUser(user);
        view.hideMainInfo();
    }
}
