package com.test.data.cache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import com.test.data.cache.repository.*;

@SpringBootApplication
@EnableCaching
public class DataApplication {
	private static final Logger logger = LoggerFactory.getLogger(DataApplication.class);
	@Autowired
    private static AccountRepository accountRepository = null;

    public DataApplication(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    
	public static void main(String[] args) {
		 SpringApplication.run(DataApplication.class, args);
		 logger.info(".....Fetching Accounts");
			logger.info(accountRepository.getAccountInfoById("account01").toString());
			logger.info(accountRepository.getAccountInfoById("account02").toString());
			logger.info(accountRepository.getAccountInfoById("account03").toString());
			logger.info(accountRepository.getAccountInfoById("account04").toString());
			logger.info(accountRepository.getAccountInfoById("account01").toString());
			logger.info(accountRepository.getAccountInfoById("account02").toString());
			logger.info(accountRepository.getAccountInfoById("account03").toString());
			logger.info(accountRepository.getAccountInfoById("account04").toString());

	}
    public void run(String... args) throws Exception {
		
	}

}
