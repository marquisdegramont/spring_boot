package in.ac.jntuh.TransactionManagementAcrossMultiDBVendors.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.transaction.ChainedTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class MultiDBTransactionManager {

	@Bean(name = "chainedTransactionManager")
	public ChainedTransactionManager transactionManager(@Qualifier("db1TransactionMgr") PlatformTransactionManager ds1,
			@Qualifier("db2TransactionMgr") PlatformTransactionManager ds2) {
		return new ChainedTransactionManager(ds1, ds2);
	}

}
