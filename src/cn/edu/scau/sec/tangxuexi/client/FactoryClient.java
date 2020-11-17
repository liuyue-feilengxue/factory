package cn.edu.scau.sec.tangxuexi.client;

//import cn.edu.scau.sec.tangxuexi.abstractFactory.AbstractFactory;
import cn.edu.scau.sec.tangxuexi.factory.bean.ConsumerElectronics;
import cn.edu.scau.sec.tangxuexi.factoryPattern.factory.*;

public class FactoryClient {
	public static void main(String[] args) {
//		System.out.println("--�򵥹�����������");
//		testSimpleFactory();
		System.out.println("--����ģʽ");
		testFactoryMethod();
		
//		System.out.println("--���󹤳�ģʽ");
//		testAbstractFactory();

	}

//	private static void testAbstractFactory() {
////		(1) ����ѡ��Ʒ�ƣ���ͬ��Ʒ���в�ͬ�Ĺ���������
////		(2) ��ѡ���Ʒ���ͣ�
////		(3) ���ô����ľ����Ʒ
//		AbstractFactory huaweiFactory = AbstractFactory.getConsumerElectronicsFactory("huawei");
//		cn.edu.scau.sec.zhangsan.abstractFactory.abstractClass.ConsumerElectronics huaweiPad = huaweiFactory.getPad();
//		huaweiPad.recreation();
//		
//		
//		cn.edu.scau.sec.zhangsan.abstractFactory.abstractClass.ConsumerElectronics huaweiPhone = huaweiFactory.getPhone();
//		huaweiPhone.recreation();
//		
//		
//		cn.edu.scau.sec.zhangsan.abstractFactory.abstractClass.ConsumerElectronics huaweiWatch = huaweiFactory.getWatch();
//		huaweiWatch.recreation();
//		
//		AbstractFactory appleFactory = AbstractFactory.getConsumerElectronicsFactory("apple");
//		cn.edu.scau.sec.zhangsan.abstractFactory.abstractClass.ConsumerElectronics applePad = appleFactory.getPad();
//		applePad.recreation();
//		
//		
//		cn.edu.scau.sec.zhangsan.abstractFactory.abstractClass.ConsumerElectronics applePhone = appleFactory.getPhone();
//		applePhone.recreation();
//		
//		
//		cn.edu.scau.sec.zhangsan.abstractFactory.abstractClass.ConsumerElectronics appleWatch = appleFactory.getWatch();
//		appleWatch.recreation();
//		
//		AbstractFactory miFactory = AbstractFactory.getConsumerElectronicsFactory("mi");
//		cn.edu.scau.sec.zhangsan.abstractFactory.abstractClass.ConsumerElectronics miPad = miFactory.getPad();
//		miPad.recreation();
//		
//		
//		cn.edu.scau.sec.zhangsan.abstractFactory.abstractClass.ConsumerElectronics miPhone = miFactory.getPhone();
//		miPhone.recreation();
//		
//		
//		cn.edu.scau.sec.zhangsan.abstractFactory.abstractClass.ConsumerElectronics miWatch = miFactory.getWatch();
//		miWatch.recreation();
//		
//		
//		
//		
//		
//		
//	}

	private static void testSimpleFactory() {
//		�򵥹���ģʽ
		ConsumerElectronics pad = cn.edu.scau.sec.tangxuexi.simpleFactoryMethod.factory.ConsumerElectronicsFactory.getConsumerElectronics("pad");
		pad.recreation();
		
		ConsumerElectronics phone = cn.edu.scau.sec.tangxuexi.simpleFactoryMethod.factory.ConsumerElectronicsFactory.getConsumerElectronics("phone");
		phone.recreation();
		
		ConsumerElectronics watch = cn.edu.scau.sec.tangxuexi.simpleFactoryMethod.factory.ConsumerElectronicsFactory.getConsumerElectronics("watch");
		watch.recreation();
		
	}
	
	private static void testFactoryMethod() {
//		����ģʽ
		
		ConsumerElectronicsFactory padFactory = new PadFactory();
		ConsumerElectronics pad = padFactory.getConsumerElectronics();
		pad.recreation();
		
		ConsumerElectronicsFactory phoneFactory = new PhoneFactory();
		ConsumerElectronics phone = phoneFactory.getConsumerElectronics();
		phone.recreation();
		
		ConsumerElectronicsFactory watchFactory = new WatchFactory();
		ConsumerElectronics watch = watchFactory.getConsumerElectronics();
		watch.recreation();
		
	}
}
