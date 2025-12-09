package com.demo.dao;

import com.demo.beans.MyRegisterUser;
import com.demo.beans.MyUser;

public interface LoginDao {

	MyUser AuthenticateUser(String uname, String passwd);

	void registerUsers(MyRegisterUser user);

}
