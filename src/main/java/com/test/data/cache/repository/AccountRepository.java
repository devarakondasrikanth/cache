package com.test.data.cache.repository;

import com.test.data.cache.model.AccountInfo;

public interface AccountRepository {
	
	AccountInfo getAccountInfoById(String id);

}
