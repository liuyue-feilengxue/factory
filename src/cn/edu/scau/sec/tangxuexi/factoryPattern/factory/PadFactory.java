package cn.edu.scau.sec.tangxuexi.factoryPattern.factory;

import cn.edu.scau.sec.tangxuexi.factory.bean.ConsumerElectronics;
import cn.edu.scau.sec.tangxuexi.factory.bean.Pad;

public class PadFactory extends ConsumerElectronicsFactory{
	
	public ConsumerElectronics getConsumerElectronics() {
		return new Pad();
	};
}
