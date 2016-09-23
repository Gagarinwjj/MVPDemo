package wjj.mvpdemo.base;

/**
 * 业务方法基类,为了解构
 * Created by wjj on 2016/9/23 16:40.
 */

public class BasePresenter<V> {
    public V view;//Activity or Fragment

    public void attachView(V view) {
        this.view = view;//适当的时候回调界面方法
    }

    public void detachView() {
        this.view = null;//解除依赖

    }
}
