package com.co.practica.tasks;

import com.co.practica.userinterfaces.FormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Upload;

import java.io.File;

public class FormFill implements Task {
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Enter.theValue("Practica Yeison").into(FormPage.TXT_INPUT));
        actor.attemptsTo(Enter.theValue("PRACTICA").into(FormPage.TXT_PASSWORD));
        actor.attemptsTo(Enter.theValue("Automatización").into(FormPage.TXT_TAREA));
        actor.attemptsTo(SelectFromOptions.byValue("1").from(FormPage.SELECT_DROPDOWN));
        actor.attemptsTo(Enter.theValue("New York").into(FormPage.SELECT_DROPDOWN_LIST));
        actor.attemptsTo(Upload.theFile(new File("C:\\Users\\Yeison Danuil Ascani\\Downloads\\672540d4776e128da2f501eba0d23a3c.jpg").toPath()).to(FormPage.IMG_INPUT));
        actor.attemptsTo(Click.on(FormPage.SELECT_CHECKEDBOX));
        actor.attemptsTo(Click.on(FormPage.SELECT_CHECKEDRADIO));
        actor.attemptsTo(Click.on(FormPage.BUTTON_ENVIAR));
    }
    public static FormFill enter(){
        return Tasks.instrumented(FormFill.class);
    }
}
