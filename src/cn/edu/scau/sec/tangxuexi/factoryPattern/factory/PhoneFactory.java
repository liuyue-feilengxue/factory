package cn.edu.scau.sec.tangxuexi.factoryPattern.factory;

import cn.edu.scau.sec.tangxuexi.factory.bean.ConsumerElectronics;
import cn.edu.scau.sec.tangxuexi.factory.bean.Phone;

public class PhoneFactory extends ConsumerElectronicsFactory {

	public ConsumerElectronics getConsumerElectronics() {
		return new Phone();
	};

}
