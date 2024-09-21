package com.example.eduworldskillsdxx;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Button;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject2;
import androidx.test.uiautomator.Until;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    final  static String Basic = "com.example.eduworldskillsdxx";
    Context appContext;
    UiDevice uiDevice;
    @Before
    public void start(){
        uiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        Intent intent = appContext.getPackageManager().getLaunchIntentForPackage(Basic);
        appContext.startActivity(intent);
    }
    @Test
    public void useAppContext() throws InterruptedException {
        // Context of the app under test.
       UiObject2 name =  uiDevice.wait(Until.findObject(By.res(Basic,"yonghuming")),10000);

        Log.i("log","Step No.1 步骤描述：打开APP");
name.setText("admin");
        Log.i("log","Step No.2 步骤描述：输入用户名");
Thread.sleep(2000);
uiDevice.findObject(By.res(Basic,"youxiang")).setText("123@neu.com");
        Log.i("log","Step No.3 步骤描述：输入邮箱");
        Thread.sleep(2000);
        uiDevice.findObject(By.res(Basic,"shoujihao")).setText("12345678");
        Log.i("log","Step No.4 步骤描述：输入电话");
        Thread.sleep(2000);
        uiDevice.findObject(By.res(Basic,"mima")).setText("123456");
        Log.i("log","Step No.5 步骤描述：输入密码");
        Thread.sleep(2000);
        uiDevice.findObject(By.res(Basic,"mimaagain")).setText("123456");
        Log.i("log","Step No.6 步骤描述：输入密码");
        Thread.sleep(2000);
        uiDevice.findObject(By.res(Basic,"btn").clazz(Button.class)).click();
        Log.i("log","Step No.7 步骤描述：点击注册");
        Thread.sleep(10000);



    }
}