package org.swfada.AltaExpediente.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.AltaExpediente.page.MyPage;

public class MyStep extends ScenarioSteps {

    private MyPage myPage;

    @net.thucydides.core.annotations.Step
    public void QueMeEncuentroEnLaBandejaDeExpdientes() {
        myPage.ValidarQueEncuentoEnBandejaDeExpedientes();
    }

    @net.thucydides.core.annotations.Step
    public void PresionoElBotonAltaDeExpediente() {
        myPage.PulsarAltaExpediente();
    }

    @net.thucydides.core.annotations.Step
    public void SeleccionoElTipoDeExpediente(String tipoExpediente) {
        myPage.SeleccionarTipoDeExpediente(tipoExpediente);
    }

    @net.thucydides.core.annotations.Step
    public void SeleccionoElProcedimiento(String procedimiento) {
        myPage.SeleccionarProcedimiento(procedimiento);
    }

    @net.thucydides.core.annotations.Step
    public void IngresoTítuloDelExpediente(String títuloExpe) {
        myPage.IngresarTítuloDeExpediente(títuloExpe);
    }

    @net.thucydides.core.annotations.Step
    public void PresionoElBotónCrearExpediente() {
        myPage.PulsarCrearExpediente();
    }

    @net.thucydides.core.annotations.Step
    public void BuscoInteresado(String interesado) {
        myPage.BuscarInteresado(interesado);
        myPage.PulsarBuscar();
    }

    @net.thucydides.core.annotations.Step
    public void AñadoInteresado() {
        myPage.AñadirInteresado();
    }

    @net.thucydides.core.annotations.Step
    public void SeMuestraLaPantallaDeInformaciónEspecifica() {
        myPage.ValidarPantallaDeInformaciónEspecifica();
    }

    @net.thucydides.core.annotations.Step
    public void SeleccionoLaRazónDeInteres(String razón) {
        myPage.SeleccionarRazónDeInteres(razón);
    }

    @net.thucydides.core.annotations.Step
    public void SeleccionoElMedioDeNotificación(String medioNoti) {
        myPage.SeleccionarMedioDeNotificación(medioNoti);
    }

    @net.thucydides.core.annotations.Step
    public void RespondoLaPreguntaUtilizarDomicilioDistinto(String respuesta) {
        myPage.ResponderSiUtilizaDomicilioDistinto(respuesta);
    }

    @net.thucydides.core.annotations.Step
    public void PresionoElBotónContinuar() {
        myPage.PulsarContinuar();
    }

    @net.thucydides.core.annotations.Step
    public void SeMuestraElInteresadoAñadido() {
        myPage.ValidarInteresadoAñadido();
    }

    @net.thucydides.core.annotations.Step
    public void PresionoElBotónContinuarInteresado() {
        myPage.PulsarContinuarInteresado();
    }

    @net.thucydides.core.annotations.Step
    public void ValidoQueElExpedienteSeHayaCreadoCorrectamente() {
        myPage.ValidarExpedienteCreado();
    }
}
