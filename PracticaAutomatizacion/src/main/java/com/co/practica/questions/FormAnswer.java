package com.co.practica.questions;

import com.co.practica.userinterfaces.AnswerPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class FormAnswer implements Question {
    @Override
    public Object answeredBy(Actor actor){
        return Text.of(AnswerPage.LBL_ANSWER).viewedBy(actor).asString();
    }

    public static FormAnswer compare(){
        return new FormAnswer();
    }
}
