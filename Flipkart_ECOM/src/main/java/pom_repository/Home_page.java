package pom_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class Home_page {
 @FindAll({@FindBy(xpath="//div[@class='eFQ30H']"),@FindBy(xpath="//img[@loading='lazy']"),@FindBy(xpath="//div[text()='Top Offers']")})
 private WebElement Users;
 @FindAll({@FindBy(xpath="(//div[@class='_1mkliO'])[2]"),@FindBy(xpath="(//div[@class='xtXmba'])[2]"),@FindBy(xpath = "//div[text()='Mobiles & Tablets']")})
 private WebElement mobiles_tabs; 
}
