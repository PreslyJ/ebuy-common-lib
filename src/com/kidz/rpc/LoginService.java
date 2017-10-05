package com.kidz.rpc;

import com.kidz.login.model.Account;

public interface LoginService {

	public boolean authenticateUser(Account account);
	
}
