package org.springframework.metadata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository("repositoryName")
@Service("serviceName")
@EnableAsync
public class MetaDemo {
	private static class InnerClass {
	}

	@Autowired
	private String getName() {
		return "demo";
	}
}
