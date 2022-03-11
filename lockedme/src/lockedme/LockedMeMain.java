package lockedme;

public class LockedMeMain {

	public static void main(String[] args) {
FileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("LockedMe", "Sourabh (Mail_Id:-sourabhpatila98@gmail.com)");
				
				HandleOptions.handleWelcomeScreenInput();
		// TODO Auto-generated method stub

	}

}
