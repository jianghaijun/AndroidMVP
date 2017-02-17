package presenter;

import com.mvp.activity.MainView;

/**
 * @author JiangHaiJun
 * @time 2017/2/17 11:07
 */

public class MainPresenter extends BasePresenter<MainView> {

	public void region() {

	}

	public void login(String userName, String passWord) {
		mView.login(true);
	}
}
