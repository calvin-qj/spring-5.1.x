package org.springframework.bootstart.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class FactoryBeanTestService implements FactoryBean<MyFactoryBean> {
	@Override
	public MyFactoryBean getObject() throws Exception {
		return new MyFactoryBean();
	}

	@Override
	public Class<?> getObjectType() {
		return MyFactoryBean.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
