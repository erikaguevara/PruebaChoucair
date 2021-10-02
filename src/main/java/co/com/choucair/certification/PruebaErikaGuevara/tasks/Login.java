package co.com.choucair.certification.PruebaErikaGuevara.tasks;

import co.com.choucair.certification.PruebaErikaGuevara.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    private String strName;
    private String strLastName;
    private String strEMail;

    public Login(String strName, String strLastName, String strEMail) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEMail = strEMail;
    }

    public static Login onThePage(String strName, String strLastName, String strEMail){
        return Tasks.instrumented(Login.class,strName,strLastName, strEMail);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
                Enter.theValue(strName).into(ChoucairLoginPage.INPUT_NAME),
                Enter.theValue(strLastName).into(ChoucairLoginPage.INPUT_LAST_NAME),
                        Enter.theValue(strEMail).into(ChoucairLoginPage.INPUT_E_MAIL),
                        Click.on(ChoucairLoginPage.INPUT_BUTTON)
        );
    }
}
