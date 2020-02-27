package Com.qa.abi.Page;

import Com.qa.abi.Utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class LoginPage extends PageBase {

    private static final Logger LOGGER =Logger.getLogger(LoginPage.class);
    private static By loginImage =By.xpath("//img[@src='original.png']");
    private static By EnterArrow =By.xpath("//img[@src='enter.png']");
    private static By EnterEmail =By.xpath("//input[@type ='text']");
    private static By SignIn =By.xpath("//*[text()='Sign In']");
    private static By SkipSignIn =By.xpath(("//*[text()='Skip Sign In']"));

}
