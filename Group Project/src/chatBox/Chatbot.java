package chatBox;

public class Chatbot {
	
	private String username;
	private boolean chatting;
	private Topic achilles;
	
	public Chatbot() {
		achilles = new ChatbotAchilles();
		username = "Unknown User";
		chatting = true;
	}

	public String getUsername() {
		return username;
	}
	
	public Topic getAchilles() {
		return achilles;
	}
	
	public void startChatting() {
		ChatbotMain.print("Hi! I am an intelligent machine that can respond to your input. Tell me your name.");
		username = ChatbotMain.getInput();
		while(chatting) {
			ChatbotMain.print("What would you like to talk about?");
			String response = ChatbotMain.getInput();
			if(ben.isTriggered(response)) {
				chatting = false;//exits the while loop.
				achilles.talk(response);
			}else {
				ChatbotMain.print("I'm sorry. I don't understand. I never said I was perfect.");
			}
		}
	}
	
}
