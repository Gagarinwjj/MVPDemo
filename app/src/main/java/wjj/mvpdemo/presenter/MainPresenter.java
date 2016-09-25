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
        //这里会默认调用super(),即调用父类默认的无参构造函数,但是父类是没有的
        //this.view=view;//mind5:封装为detachView对称的方法attachView
        //attachView(view);
        super(view);//mind6: 父类直接实现构造方法,子类match一下就可以
    }

    @Override
    public void getUserInfo() {
        view.showMainInfo();
        User user = new User("wjj", 28);
        view.saveUser(user);
        view.hideMainInfo();
    }
}
