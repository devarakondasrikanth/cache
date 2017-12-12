package com.test.data.cache.repository;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.test.data.cache.model.AccountInfo;

@Component
public class AccountRepositoryImpl implements AccountRepository {
	
	 @Override
	 @Cacheable("accountInfo")
	public AccountInfo getAccountInfoById(String id) {
		simulateSlowService();
		return new AccountInfo(id,"test account description");
	}
	
	private void simulateSlowService() {
        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

}
