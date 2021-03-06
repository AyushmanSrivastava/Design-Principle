package chat;

public class BasicUser implements IUser {

	private ChatMediator chatMediator;
	private String name;
	
	@Override
	public void receiveMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println(name + " received " + message);
	}

	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		chatMediator.sendMessage(message);
	}
	
	public BasicUser(String name) {
		chatMediator = new ChatMediator();
		this.name = name;
	}

}
