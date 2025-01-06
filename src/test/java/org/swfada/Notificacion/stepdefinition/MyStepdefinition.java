package org.swfada.Notificacion.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.Notificacion.step.MyStep;

public class MyStepdefinition {

 @Steps
    private MyStep myStep;

    @Dado("que busco el expediente {string}")
    public void queBuscoElExpediente(String expediente) {
        myStep.BuscarExpediente(expediente);
    }

    @Cuando("pulsa la pestaña Notificaciones")
    public void PulsaLaPestañaNotificaciones() {
        myStep.PulsaLaPestañaNotificaciones();
    }

    @Y("pulsa el botón Nueva Remesa")
    public void PulsaElBotónNuevaRemesa() {
        myStep.PulsaElBotónNuevaRemesa();
    }

    @Y("selecciona el documento firmado")
    public void SeleccionaElDocumentoFirmado() {
        myStep.SeleccionaElDocumentoFirmado();
    }

    @Y("pulsa el botón Siguiente")
    public void PulsaElBotónSiguiente() {
        myStep.PulsaElBotónSiguiente();
    }

    @Entonces("selecciona el interesado")
    public void SeleccionaElInteresado() {
        myStep.SeleccionaElInteresado();
    }

    @Y("pulsa el botón Siguiente interesados")
    public void PulsaElBotónSiguienteInteresados() {
        myStep.PulsaElBotónSiguienteInteresados();
    }

    @Y("ingresa el asunto de notificación {string}")
    public void IngresaElAsuntoDeNotificación(String asunto) {
        myStep.IngresaElAsuntoDeNotificación(asunto);
    }

    @Y("pulsa el botón Enviar Notificación")
    public void PulsaElBotónEnviarNotificación() {
        myStep.PulsaElBotónEnviarNotificación();
    }

    @Entonces("se muestra el resumen de la notificación")
    public void SeMuestraElResumenDeLaNotificación() {
        myStep.MostrarResumenDeNotificación();
    }

    @Y("pulsa el botón Cerrar")
    public void PulsaElBotónCerrar() {
        myStep.PulsaElBotónCerrar();
    }

    @Entonces("validar que se muestra la notificación")
    public void ValidarQueSeMuestraLaNotificación() {
        myStep.ValidarNotificación();
    }


}
