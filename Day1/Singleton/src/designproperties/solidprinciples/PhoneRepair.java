package designproperties.solidprinciples;

public class PhoneRepair implements IRepair {

	@Override
	public void ProcessPhoneRepair(String modelName) {
		// TODO Auto-generated method stub
		System.out.println(modelName + "Repair accepted!");
	}

	@Override
	public void ProcessAccessoryRepair(String accessoryType) {
		// TODO Auto-generated method stub
		System.out.println(accessoryType + "accessory accepted!");
	}

}
