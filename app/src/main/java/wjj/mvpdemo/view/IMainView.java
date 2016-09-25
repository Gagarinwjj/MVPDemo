package wjj.mvpdemo.view;

import wjj.mvpdemo.model.User;

/**
 * Main界面方法
 * Created by wjj on 2016/9/23 11:16.
 */

public interface IMainView {
    void showMainInfo();

    void hideMainInfo();

    void saveUser(User user);
}
