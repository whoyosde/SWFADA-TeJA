package org.swfada.AltaExpediente.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.AltaExpediente.page.MyPage;

import java.io.IOException;

public class MyStep extends ScenarioSteps {

    private MyPage myPage;


    @net.thucydides.core.annotations.Step
    public void PresionoElBotonAltaDeExpediente() {
        myPage.PulsarAltaExpediente();
    }

    @net.thucydides.core.annotations.Step
    public void SeleccionoElTipoDeExpediente(String tipoExpediente) {
        myPage.SeleccionarTipoDeExpediente(tipoExpediente);
    }
    @net.thucydides.core.annotations.Step
    public void seleccionoElProcedimiento(String procedimiento) {
        myPage.seleccionoElProcedimiento(procedimiento);
    }

    @net.thucydides.core.annotations.Step
    public void ingresarElTítuloDelExpediente(String título) {
        myPage.ingresarElTítuloDelExpediente(título);
    }
    @net.thucydides.core.annotations.Step
    public void seleccionoLaFaseDeInicio(String fase) {
        myPage.seleccionoLaFaseDeInicio(fase);
    }
    @net.thucydides.core.annotations.Step
    public void seleccionoLaUnidadOrgánica(String unidad) {
        myPage.seleccionoLaUnidadOrgánica(unidad);
    }
    @net.thucydides.core.annotations.Step
    public void seleccionoLaUnidadOrgánicaCreadora(String unidadcreadora) {
        myPage.seleccionoLaUnidadOrgánicaCreadora(unidadcreadora);
    }
    @net.thucydides.core.annotations.Step
    public void pulsaElBotónContinuar() {
        myPage.pulsaElBotónContinuar();
    }
    @net.thucydides.core.annotations.Step
    public void rellenarDatosDelFormulario() {
        myPage.rellenarDatosDelFormulario();
    }
    @net.thucydides.core.annotations.Step
    public void pulsaElBotónGuardarYTerminar() {
        myPage.pulsaElBotónGuardarYTerminar();
    }

    @net.thucydides.core.annotations.Step
    public void pulsaElBotónContinuarDeDatosEspecíficos() {
        myPage.pulsaElBotónContinuarDeDatosEspecíficos();
    }
    @net.thucydides.core.annotations.Step
    public void seleccionoTipoDeDocumento(String tipodoc) {
        myPage.seleccionoTipoDeDocumento(tipodoc);
    }
    @net.thucydides.core.annotations.Step
    public void adjuntoDocumento() throws IOException {
        myPage.adjuntoDocumento();
    }
    @net.thucydides.core.annotations.Step
    public void pulsaElBotónContinuarDeDocumentación() {
        myPage.pulsaElBotónContinuarDeDocumentación();
    }
}
