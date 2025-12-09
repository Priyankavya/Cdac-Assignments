package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.MyUser;
import com.demo.dao.loginDao;

@Service
public class loginServiceImpl implements loginService {

	@Autowired
	private loginDao ldao;
	@Override
	public MyUser validateUser(String uname, String passwd) {
	
		return ldao.authenticateuser(uname,passwd);
	}

}
