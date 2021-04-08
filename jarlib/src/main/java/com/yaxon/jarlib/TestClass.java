package com.yaxon.jarlib;

import com.yaxon.mylibrary.bean.LoginProtocol;

public class TestClass {
    /**
     * 登录
     *
     * @param username  用户名
     * @param password  密码
     */
    public static Observable<LoginBean> login( String username, String password) {

           return LoginProtocol.getInstance().login(username, password);

    }
}
