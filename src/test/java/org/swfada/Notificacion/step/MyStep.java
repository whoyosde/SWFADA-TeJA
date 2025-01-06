package org.swfada.Notificacion.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.Notificacion.page.MyPage;

public class MyStep extends ScenarioSteps {
    private MyPage myPage;

    @net.thucydides.core.annotations.Step
    public void BuscarExpediente(String expediente){
        myPage.BuscarExpediente(expediente);
        myPage.TramitarExpediente();
    }

    @net.thucydides.core.annotations.Step
    public void PulsaLaPestañaNotificaciones(){
        myPage.PulsaLaPestañaNotificaciones();
    }

    @net.thucydides.core.annotations.Step
    public void PulsaElBotónNuevaRemesa(){
        myPage.PulsaElBotónNuevaRemesa();
    }

    @net.thucydides.core.annotations.Step
    public void SeleccionaElDocumentoFirmado(){
        myPage.SeleccionaElDocumentoFirmado();
    }

    @net.thucydides.core.annotations.Step
    public void PulsaElBotónSiguiente(){
        myPage.PulsaElBotónSiguiente();
    }

    @net.thucydides.core.annotations.Step
    public void SeleccionaElInteresado(){
        myPage.SeleccionaElInteresado();
    }

    @net.thucydides.core.annotations.Step
    public void PulsaElBotónSiguienteInteresados(){
        myPage.PulsaElBotónSiguienteInteresados();
    }

    @net.thucydides.core.annotations.Step
    public void IngresaElAsuntoDeNotificación(String asunto){
        myPage.IngresaElAsuntoDeNotificación(asunto);
    }

    @net.thucydides.core.annotations.Step
    public void PulsaElBotónEnviarNotificación(){
        myPage.PulsaElBotónEnviarNotificación();
    }

    @net.thucydides.core.annotations.Step
    public void MostrarResumenDeNotificación(){
        myPage.MostrarResumenDeNotificación();
    }

    @net.thucydides.core.annotations.Step
    public void PulsaElBotónCerrar(){
        myPage.PulsaElBotónCerrar();
    }

    @net.thucydides.core.annotations.Step
    public void ValidarNotificación(){
        myPage.ValidarNotificación();
    }

}
