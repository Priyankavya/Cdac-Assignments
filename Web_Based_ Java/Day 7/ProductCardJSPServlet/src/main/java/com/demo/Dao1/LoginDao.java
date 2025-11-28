package com.demo.Dao1;

import com.demo.beans.MyUser;

public interface LoginDao {

	MyUser checkuser(String uname, String pass);

}
