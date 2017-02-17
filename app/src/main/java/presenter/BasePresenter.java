package presenter;

/**
 * @author JiangHaiJun
 * @time 2017/2/17 16:40
 */

public abstract class BasePresenter<T> {
	public T mView;

	public void attach(T mView) {
		this.mView = mView;
	}

	public void dettach() {
		mView = null;
	}
}
