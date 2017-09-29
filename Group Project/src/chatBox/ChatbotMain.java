package chatbox;

import java.util.Scanner;

public class ChatbotAchilles implements Topic {
	public static final Chatbot chatbot = new Chatbot();
	private static Scanner inputSource = new Scanner(System.in);
	
	public static void main(String[] args) {
		chatbot.startChatting();
	}
}

//Copied from class notes Utility class
/**
 * 
 * @param seachString
 * @param keyword
 * @param startPsn
 * @return the index of the keyword after startPsn that is isolated and has no negations or -1 otherwise
 */
public static int findKeyword(String seachString, String keyword, int startPsn) {
	//make lowercase
	searchString = searchString.toLowerCase();
	keyword = keyword.toLowerCase();
	
	int psn = searchString.indexOf(keyword, startPsn);
	
	while(psn >= 0) {
		if(keywordIsIsolated(psn, keyword, searchString) && noNegations(searchString, psn)) {
			return psn;
		}else {
			psn = searchString.indexOf(keyword, psn+1);//returns the index of the NEXT keyword
		}
	}
	return -1;
}


public static boolean keywordIsIsolated(int psn, String keyword, String s) {
	return true;
}

public static boolean noNegations(String s, int psn) {
	return true;
}

public static String getInput() {
	return inputSource.nextLine();
}

public static void print(String s) {
	multiLinePrint(s);
}


@Override
public void talk(String response) {
	// TODO Auto-generated method stub
	
}


@Override
public boolean isTriggered(string repsonse) {
	// TODO Auto-generated method stub
	return false;
}