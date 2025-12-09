package com.demo.service;

import com.demo.beans.MyUser;

public interface loginService {

	MyUser validateUser(String uname, String passwd);

}
