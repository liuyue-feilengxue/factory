package cn.edu.scau.sec.tangxuexi.factoryPattern.factory;

import cn.edu.scau.sec.tangxuexi.factory.bean.ConsumerElectronics;
import cn.edu.scau.sec.tangxuexi.factory.bean.Watch;

public class WatchFactory extends ConsumerElectronicsFactory{
	
	public ConsumerElectronics getConsumerElectronics() {
		return new Watch();
	};
}
