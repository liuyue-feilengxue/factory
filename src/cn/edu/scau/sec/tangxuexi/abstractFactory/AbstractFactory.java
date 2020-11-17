package cn.edu.scau.sec.tangxuexi.abstractFactory;

import cn.edu.scau.sec.tangxuexi.abstractFactory.AbstractFactory;
import cn.edu.scau.sec.tangxuexi.abstractFactory.AppleFactory;
import cn.edu.scau.sec.tangxuexi.abstractFactory.HuaweiFactory;
import cn.edu.scau.sec.tangxuexi.abstractFactory.MiFactory;
import cn.edu.scau.sec.tangxuexi.abstractFactory.abstractClass.ConsumerElectronics;

public class AbstractFactory {
	public static AbstractFactory getConsumerElectronicsFactory(String consumerElectronicsBrand) {
		AbstractFactory factory = null;
		switch(consumerElectronicsBrand) {
		case "huawei": factory = new HuaweiFactory();break;
		case "apple": factory = new AppleFactory();break;
		case "mi": factory = new MiFactory();break;
		}
		return factory;
	}
	
	
	public abstract ConsumerElectronics getPad();
	public abstract ConsumerElectronics getPhone();
	public abstract ConsumerElectronics getWatch();
	
}
