package wjj.mvpdemo.base;

/**
 * 业务方法基类,目的是解耦,一下子让理解变得复杂
 * Created by wjj on 2016/9/23 16:40.
 */

public class BasePresenter<V> {
    public V view;//Activity or Fragment

    //mind4:为了定义View直接泛型V就可以了,不需要再 V extends IBaseView,
    //否则所有的Activity or Fragment 在 implements V接口时, 都要实现IBaseView中的方法,
    //虽然MvpActivity中实现了IBaseView接口中的方法,
    //导致MvpActivity的子类Activity都不需要再次重写IBaseView中的方法,似乎"屏蔽"而不用关心。
    //但是在定义ISomeView时都要extends IBaseView,这是额外的多余的约束。
    //简洁起见,IBaseView中的基础方法交给MvpActivity基类实现就好了,逻辑也更加清晰。
    public BasePresenter(V view) {
        this.view = view;
    }

    public void attachView(V view) {
        this.view = view;//适当的时候回调界面方法
    }

    public void detachView() {
        //mind3:这里对View进行解耦
        this.view = null;//解除依赖
    }
}
