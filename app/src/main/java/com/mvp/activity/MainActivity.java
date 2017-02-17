package com.mvp.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import presenter.MainPresenter;

public class MainActivity extends BaseActivity<MainView, MainPresenter> implements MainView, View.OnClickListener {
	private Button loginBtn;
	private Button regionBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		loginBtn = (Button) findViewById(R.id.login_btn);
		regionBtn = (Button) findViewById(R.id.region_btn);

		loginBtn.setOnClickListener(this);
		regionBtn.setOnClickListener(this);

	}

	@Override
	public MainPresenter initPresenter() {
		return new MainPresenter();
	}


	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.login_btn:
				presenter.login("Admin", "123456");
				break;
			case R.id.region_btn:
				break;
		}
	}

	@Override
	public void region() {

	}

	@Override
	public void login(boolean isSuccessful) {
		Toast.makeText(this, "恭喜登录成功了", Toast.LENGTH_SHORT).show();
	}

	@Override
	public void showLoading() {

	}

	@Override
	public void hideLoading() {

	}
}
