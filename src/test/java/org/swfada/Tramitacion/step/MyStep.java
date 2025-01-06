package org.swfada.Tramitacion.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.Tramitacion.page.MyPage;

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
    public void generoUnDocumento() {
        myPage.generoUnDocumento();
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
}