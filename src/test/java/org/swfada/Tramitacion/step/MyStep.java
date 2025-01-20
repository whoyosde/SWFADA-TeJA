package org.swfada.Tramitacion.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.Tramitacion.page.MyPage;

import java.awt.*;
import java.io.IOException;

public class MyStep extends ScenarioSteps {
    private MyPage myPage;


    @net.thucydides.core.annotations.Step
    public void presionoElBotónTramitarDelExpediente() {
        myPage.presionoElBotónTramitarDelExpediente();
    }

    @net.thucydides.core.annotations.Step
    public void transitoALaFaseEstudiarExpediente() {
        myPage.transitoALaFaseEstudiarExpediente();
    }

    @net.thucydides.core.annotations.Step
    public void validarFaseTramitación() {
        myPage.validarFaseTramitación();
    }

    @net.thucydides.core.annotations.Step
    public void transitoALaFaseResolver() {
        myPage.transitoALaFaseResolver();
    }
    @net.thucydides.core.annotations.Step
    public void validarFaseResolver() {
        myPage.validarFaseResolver();
    }

    @net.thucydides.core.annotations.Step
    public void deshacerFase() {
        myPage.deshacerFase();
    }

    @net.thucydides.core.annotations.Step
    public void generoUnDocumento(String documento) {
        myPage.generoUnDocumento(documento);
    }
    @net.thucydides.core.annotations.Step
    public void seleccionarFirmante(String firmante) {
        myPage.seleccionarFirmante(firmante);
    }

    @net.thucydides.core.annotations.Step
    public void terminoUnDocumento() {
        myPage.terminoUnDocumento();
    }

    @net.thucydides.core.annotations.Step
    public void envioElDocumentoAPortafirma() {
        myPage.envioElDocumentoAPortafirma();
    }

    @net.thucydides.core.annotations.Step
    public void validoEstadoPendienteDeFirma() {
        myPage.validoEstadoPendienteDeFirma();
    }

    @net.thucydides.core.annotations.Step
    public void adjuntoOtraDocumentación() {
        myPage.adjuntarDocumento();
    }

    @net.thucydides.core.annotations.Step
    public void eliminoDocumento() {
        myPage.eliminoDocumento();
    }

    @net.thucydides.core.annotations.Step
    public void accedoAInteresados() {
        myPage.accedoAInteresados();
    }

    @net.thucydides.core.annotations.Step
    public void asocioInteresadoAlExpediente(String nif) {
        myPage.asocioInteresadoAlExpediente(nif);
    }

    @net.thucydides.core.annotations.Step
    public void validoQueElInteresadoSeAñadióCorrectamente() {
        myPage.validoQueElInteresadoSeAñadióCorrectamente();
    }

    @net.thucydides.core.annotations.Step
    public void eliminoInteresadoDelExpediente() {
        myPage.eliminoInteresadoDelExpediente();
    }

    @net.thucydides.core.annotations.Step
    public void asignoUsuario(String usuario) {
        myPage.asignoUsuario(usuario);
    }

    @net.thucydides.core.annotations.Step
    public void validoLaAsignacionDelUsuario() {
        myPage.validoLaAsignacionDelUsuario();
    }

    @net.thucydides.core.annotations.Step

    public void descargoDocumentoGenerado() throws InterruptedException, AWTException { myPage.descargoDocumentoGenerado(); }

    @net.thucydides.core.annotations.Step
    public void validoQueSeDescargoElDocumento() throws IOException { myPage.validoQueSeDescargoElDocumento(); }

    @net.thucydides.core.annotations.Step
    public void descargoTodosLosDocumentosDelExpediente() throws InterruptedException, AWTException { myPage.descargoTodosLosDocumentosDelExpediente(); }

    @net.thucydides.core.annotations.Step
    public void validoQueSeDescargoTodosLosDocumentosDelExpediente() throws IOException { myPage.validoQueSeDescargoElDocumento(); }

    public void editoInteresado() { myPage.editoInteresado(); }

    public void iniciarEvento(String Evento) { myPage.iniciarEvento(Evento); }

    public void validoQueSeIniciaElEvento() { myPage.validoQueSeIniciaElEvento(); }

    public void desasignarUsuario(String usuario) {
        myPage.desasignarUsuario(usuario);
    }
}
