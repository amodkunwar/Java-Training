package com.example.excep;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.transaction.ChainedTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class TransactionalManagement {

	@Bean("chainedTransactionManager")
	public ChainedTransactionManager transaction(
			@Qualifier("transactionManager1") PlatformTransactionManager transaction1,
			@Qualifier("transactionManager1") PlatformTransactionManager transaction2) {
		return new ChainedTransactionManager(transaction1, transaction2);
	}
}
