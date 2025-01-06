package org.swfada.AltaExpediente.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.AltaExpediente.step.MyStep;

import java.io.IOException;


public class MyStepdefinition {

    @Steps
    private MyStep myStep;


    @Dado("presiono el botón Alta de expediente")
    public void presionoElBotónAltaDeExpediente() {
        myStep.PresionoElBotonAltaDeExpediente();
    }

    @Cuando("selecciono el tipo de expediente {string}")
    public void seleccionarElTipoDeExpediente(String tipoExpediente) {
        myStep.SeleccionoElTipoDeExpediente(tipoExpediente);
    }

    @Y("selecciono el procedimiento {string}")
    public void seleccionoElProcedimiento(String procedimiento) {
        myStep.seleccionoElProcedimiento(procedimiento);
    }


    @Y("ingresar el título del expediente {string}")
    public void ingresarElTítuloDelExpediente(String título) {
        myStep.ingresarElTítuloDelExpediente(título);
    }

    @Y("selecciono la fase de inicio {string}")
    public void seleccionoLaFaseDeInicio(String fase) {
        myStep.seleccionoLaFaseDeInicio(fase);
    }

    @Y("selecciono la unidad orgánica {string}")
    public void seleccionoLaUnidadOrgánica(String unidad) {
        myStep.seleccionoLaUnidadOrgánica(unidad);

    }

    @Y("selecciono la unidad orgánica creadora {string}")
    public void seleccionoLaUnidadOrgánicaCreadora(String unidadcreadora) {
        myStep.seleccionoLaUnidadOrgánicaCreadora(unidadcreadora);

    }

    @Y("pulsa el botón Continuar")
    public void pulsaElBotónContinuar() {
        myStep.pulsaElBotónContinuar();
    }

    @Y("rellenar datos del formulario")
    public void rellenarDatosDelFormulario() {
        myStep.rellenarDatosDelFormulario();

    }

    @Y("pulsa el botón guardar y terminar")
    public void pulsaElBotónGuardarYTerminar() {
        myStep.pulsaElBotónGuardarYTerminar();
    }

    @Y("pulsa el botón Continuar de Datos específicos")
    public void pulsaElBotónContinuarDeDatosEspecíficos() {
        myStep.pulsaElBotónContinuarDeDatosEspecíficos();
    }

    @Y("selecciono tipo de documento {string}")
    public void seleccionoTipoDeDocumento(String tipodoc) {
        myStep.seleccionoTipoDeDocumento(tipodoc);
    }

    @Y("adjunto documento")
    public void adjuntoDocumento() throws IOException {
        myStep.adjuntoDocumento();
    }

    @Entonces("pulsa el botón Continuar de Documentación")
    public void pulsaElBotónContinuarDeDocumentación() {
        myStep.pulsaElBotónContinuarDeDocumentación();
    }
}
