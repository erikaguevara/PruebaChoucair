package co.com.choucair.certification.PruebaErikaGuevara.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
    /*public static final Target LOGIN_BUTTON = Target.the("Button Join Today")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__dropdown-menu-sign-up']"));*/
    public static final Target INPUT_BUTTON = Target.the("button to confirm login")
            .located(By.xpath("//a[@class,'btn btn-blue']"));
    public static final Target INPUT_NAME =Target.the("where do we write the user")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME =Target.the("where do we write the user")
            .located(By.id("lastName"));
    public static final Target INPUT_E_MAIL =Target.the("where do we write the user")
            .located(By.id("email"));
    /*public static final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.id("password"));*/

}
