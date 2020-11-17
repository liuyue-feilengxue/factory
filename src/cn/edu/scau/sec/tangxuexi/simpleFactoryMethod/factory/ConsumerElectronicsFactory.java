package cn.edu.scau.sec.tangxuexi.simpleFactoryMethod.factory;

import cn.edu.scau.sec.tangxuexi.factory.bean.ConsumerElectronics;
import cn.edu.scau.sec.tangxuexi.factory.bean.Pad;
import cn.edu.scau.sec.tangxuexi.factory.bean.Phone;
import cn.edu.scau.sec.tangxuexi.factory.bean.Watch;

public class ConsumerElectronicsFactory {
	public static ConsumerElectronics getConsumerElectronics(String consumerElectronicsType) {
		ConsumerElectronics consumerElectronics = null;
		switch(consumerElectronicsType) {
		case "pad": consumerElectronics = new Pad();break;
		case "phone": consumerElectronics = new Phone();break;
		case "watch": consumerElectronics = new Watch();break;
		}
		return consumerElectronics;
	}
}
