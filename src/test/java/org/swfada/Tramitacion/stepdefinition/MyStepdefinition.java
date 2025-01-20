package org.swfada.Tramitacion.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.Tramitacion.step.MyStep;

import java.awt.*;
import java.io.IOException;

public class MyStepdefinition {
    @Steps
    private MyStep myStep;


    @Dado("presiono el botón Tramitar del expediente")
    public void presionoElBotónTramitarDelExpediente() {
        myStep.presionoElBotónTramitarDelExpediente();
    }

    @Cuando("transito a la fase Estudiar expediente")
    public void transitoALaFaseEstudiarExpediente() {
        myStep.transitoALaFaseEstudiarExpediente();
    }

    @Y("valido que me encuentro en la fase Estudiar expediente")
    public void validoQueMeEncuentroEnLaFaseEstudiarExpediente() {
        myStep.validarFaseTramitación();
    }

    @Y("transito a la fase Resolver")
    public void transitoALaFaseResolver() {
        myStep.transitoALaFaseResolver();
    }

    @Entonces("valido que me encuentro en la fase Resolver")
    public void validoQueMeEncuentroEnLaFaseResolver() {
        myStep.validarFaseResolver();
    }

    @Y("deshago la fase")
    public void deshagoLaFase() {
        myStep.deshacerFase();
    }

    @Y("genero un documento {string}")
    public void generoUnDocumento(String documento) {
        myStep.generoUnDocumento(documento);
    }

    @Y("seleccionar firmante {string}")
    public void seleccionarFirmante(String firmante) {
        myStep.seleccionarFirmante(firmante);
    }

    @Y("termino un documento")
    public void terminoUnDocumento() {
        myStep.terminoUnDocumento();
    }

    @Y("envio el documento a portafirma")
    public void envioElDocumentoAPortafirma() {
        myStep.envioElDocumentoAPortafirma();
    }

    @Entonces("valido que se encuentra en pendiente de firma")
    public void validoQueSeEncuentraEnPendienteDeFirma() {
        myStep.validoEstadoPendienteDeFirma();
    }

    @Y("adjunto otra documentación")
    public void adjuntoOtraDocumentación() {
        myStep.adjuntoOtraDocumentación();
    }

    @Y("elimino documento")
    public void eliminoDocumento() {
        myStep.eliminoDocumento();
    }

    @Y("accedo a Interesados")
    public void accedoAInteresados() {
        myStep.accedoAInteresados();
    }

    @Y("asocio interesado al expediente {string}")
    public void asocioInteresadoAlExpediente(String Nif) {
        myStep.asocioInteresadoAlExpediente(Nif);
    }

    @Entonces("valido que el interesado se añadió correctamente")
    public void validoQueElInteresadoSeAñadióCorrectamente() {
        myStep.validoQueElInteresadoSeAñadióCorrectamente();
    }

    @Y("elimino interesado del expediente")
    public void eliminoInteresadoDelExpediente() {
        myStep.eliminoInteresadoDelExpediente();
    }

    @Y("asigno usuario {string}")
    public void asignoUsuario(String usuario) {
        myStep.asignoUsuario(usuario);
    }

    @Entonces("valido la asignacion del usuario")
    public void validoLaAsignacionDelUsuario() {
        myStep.validoLaAsignacionDelUsuario();
    }

    @Y("descargo documento generado")
    public void descargoDocumentoGenerado() throws InterruptedException, AWTException { myStep.descargoDocumentoGenerado(); }

    @Entonces("valido que se descargó el documento")
    public void validoQueSeDescargoElDocumento() throws IOException  { myStep.validoQueSeDescargoElDocumento(); }

    @Y("descargo todos los documentos del expediente")
    public void descargoTodosLosDocumentosDelExpediente() throws InterruptedException, AWTException { myStep.descargoTodosLosDocumentosDelExpediente(); }

    @Y("valido que se descargó todos los documentos del expediente")
    public void validoQueSeDescargoTodosLosDocumentosDelExpediente() throws IOException { myStep.validoQueSeDescargoTodosLosDocumentosDelExpediente(); }

    @Y("edito interesado")
    public void editoInteresado() { myStep.editoInteresado(); }

    @Y("iniciar Evento {string}")
    public void iniciarEvento(String Evento) { myStep.iniciarEvento(Evento); }

    @Entonces("valido que se inicia el evento")
    public void validoQueSeIniciaElEvento() { myStep.validoQueSeIniciaElEvento(); }

    @Y("desasigno usuario {string}")
    public void desasignoUsuario(String usuario) {
        myStep.desasignarUsuario(usuario);
    }

}
