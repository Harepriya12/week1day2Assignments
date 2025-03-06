package week1.day2;

public class Browser {

	public static void main(String[] args) {
		Browser browser = new Browser();
		browser.launchBrowser("Google chrome");
		browser.loadUrl();
		
		
	}
	
	public String launchBrowser(String browserName){
		System.out.println("Browser name is" + " "+ browserName);
		System.out.println("Browser launched successfully");
		return browserName;
		
		
		
	}
	
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
		
	}

}
