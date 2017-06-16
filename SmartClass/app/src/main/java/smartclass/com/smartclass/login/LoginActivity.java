package smartclass.com.smartclass.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.Profile;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import smartclass.com.smartclass.courseList.CourseListActivity;
import smartclass.com.smartclass.R;

public class LoginActivity extends Activity implements LoginContract.View {

    private LoginButton mLoginButton;
    private Profile mProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);
        CallbackManager callbackManger = CallbackManager.Factory.create();

        mLoginButton = (LoginButton) findViewById(R.id.login_button);
        mLoginButton.setReadPermissions("email");
        mLoginButton.registerCallback(callbackManger, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {

            }

            @Override
            public void onCancel() {

            }

            @Override
            public void onError(FacebookException error) {

            }
        });

        Intent intent = new Intent(this, CourseListActivity.class);
        startActivity(intent);
    }
}