package com.co.practica.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FormPage {
    public static final Target TXT_INPUT = Target.the("Ingresar texto").locatedBy("//input[@id='my-text-id']");
    public static final Target TXT_PASSWORD = Target.the("Ingresar la contraseña").locatedBy("//input[@name='my-password']");
    public static final Target TXT_TAREA = Target.the("Ingrese otro texto").locatedBy("//textarea[@name='my-textarea']");
    public static final Target SELECT_DROPDOWN = Target.the("Seleccione un numero").locatedBy("//select[@name='my-select']");
    public static final Target SELECT_DROPDOWN_LIST = Target.the("Seleccione un pais").locatedBy("//input[@name='my-datalist']");
    public static final Target IMG_INPUT = Target.the("Cargar imagen").locatedBy("//input[@name='my-file']");
    public static final Target RANGE = Target.the("Cargar imagen").locatedBy("//input[@name='my-range']");
    public static final Target SELECT_CHECKEDBOX = Target.the("Seleccione").locatedBy("//input[@id='my-check-2']");
    public static final Target SELECT_CHECKEDRADIO = Target.the("Seleccione").locatedBy("//input[@id='my-radio-1']");
    public static final Target BUTTON_ENVIAR = Target.the("Enviar").locatedBy("//button[@type='submit']");
}
