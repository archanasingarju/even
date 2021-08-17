package pages1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signpage {
	
	WebDriver driver= null;
	public Signpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(linkText="Sign in")
private WebElement signInLink;

@FindBy(xpath="//input[@id='email']")
private WebElement email;

@FindBy(xpath="//input[@id='passwd']")
private WebElement Pass;

@FindBy(name= "SubmitLogin")
private WebElement login;


@FindBy(linkText="Sign out")
private WebElement Signout;


@FindBy(xpath = "//input[@id='search_query_top']")
private WebElement searchTextBox;

@FindBy(linkText = "Contact us")
private WebElement contactUs;

@FindBy(xpath="//h1[@class='page-heading']")
private WebElement pageheading;

public WebElement getLogin() {
	return login;
}

public WebElement getSignInLink() {
	return signInLink;
}

public WebElement getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email.sendKeys(email);
}

public WebElement getPass() {
	return Pass;
}

public void setPass(String pass) {
	this.Pass.sendKeys(pass);
}

public WebElement getSignout() {
	return Signout;
}

public WebElement getPageheading() {
	return pageheading;
}

public WebElement getSearchTextBox() {
	return searchTextBox;
}

public void setSearchTextBox(String searchTextBox) {
	this.searchTextBox.sendKeys(searchTextBox);
}

public WebElement getContactUs() {
	return contactUs;
}
}


