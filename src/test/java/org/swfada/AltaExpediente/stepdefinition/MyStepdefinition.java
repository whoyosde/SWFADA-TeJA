package org.swfada.AltaExpediente.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.AltaExpediente.step.MyStep;


public class MyStepdefinition {

    @Steps
    private MyStep myStep;

 /**   @Dado("CP03001 - que me encuentro en la Bandeja de Informes")
    public void QueMeEncuentroEnLaBandejaDeInformes() {
        myStep.QueMeEncuentroEnLaBandejaDeInformes();
    }

    @Cuando("CP03001 - presiono la pestaña Alta de expediente")
    public void PresionoLaPestañaAltaDeExpediente() {
        myStep.PresionoLaPestañaAltaDeExpediente();
    }

    @Y("CP03001 - selecciono el tipo de expediente {string}")
    public void SeleccionoElTipoDeExpediente(String tipoExpediente) {
        myStep.SeleccionoElTipoDeExpediente(tipoExpediente);
    }

    @Y("CP03001 - selecciono el procedimiento {string}")
    public void SeleccionoElProcedimiento(String procedimiento) {
        myStep.SeleccionoElProcedimiento(procedimiento);
    }

    @Y("CP03001 - ingreso título del expediente {string}")
    public void IngresoTítuloDelExpediente(String títuloExpe) {
        myStep.IngresoTítuloDelExpediente(títuloExpe);
    }

    @Cuando("CP03001 - presiono el botón Crear expediente")
    public void PresionoElBotónCrearExpediente() {
        myStep.PresionoElBotónCrearExpediente();
    }

    @Y("CP03001 - busco interesado {string}")
    public void BuscoInteresado(String interesado) {
        myStep.BuscoInteresado(interesado);
    }

    @Y("CP03001 - añado interesado")
    public void AñadoInteresado() {
        myStep.AñadoInteresado();
    }

    @Entonces("CP03001 - se muestra la pantalla de información especifica")
    public void SeMuestraLaPantallaDeInformaciónEspecifica() {
        myStep.SeMuestraLaPantallaDeInformaciónEspecifica();
    }

    @Y("CP03001 - selecciono la razón de interes {string}")
    public void SeleccionoLaRazónDeInteres(String razón) {
        myStep.SeleccionoLaRazónDeInteres(razón);
    }

    @Y("CP03001 - selecciono el medio de notificación {string}")
    public void SeleccionoElMedioDeNotificación(String medioNoti) {
        myStep.SeleccionoElMedioDeNotificación(medioNoti);
    }

    @Y("CP03001 - respondo la pregunta Utilizar domicilio distinto {string}")
    public void RespondoLaPreguntaUtilizarDomicilioDistinto(String respuesta) {
        myStep.RespondoLaPreguntaUtilizarDomicilioDistinto(respuesta);
    }

    @Cuando("CP03001 - presiono el botón Continuar")
    public void PresionoElBotónContinuar() {
        myStep.PresionoElBotónContinuar();
    }

    @Entonces("CP03001 - se muestra el interesado añadido")
    public void SeMuestraElInteresadoAñadido() {
        myStep.SeMuestraElInteresadoAñadido();
    }

    @Cuando("CP03001 - presiono el botón Continuar interesado")
    public void PresionoElBotónContinuarInteresado() {
        myStep.PresionoElBotónContinuarInteresado();
    }

    @Entonces("CP03001 - valido que el expediente se haya creado correctamente")
    public void ValidoQueElExpedienteSeHayaCreadoCorrectamente() {
        myStep.ValidoQueElExpedienteSeHayaCreadoCorrectamente();
    }**/

    @Dado("que me encuentro en la Bandeja de Expedientes")
    public void queMeEncuentroEnLaBandejaDeExpedientes() {
        myStep.QueMeEncuentroEnLaBandejaDeExpdientes();
    }

    @Cuando("presiono el botón Alta de expediente")
    public void presionoElBotónAltaDeExpediente() {
        myStep.PresionoElBotonAltaDeExpediente();
    }

    @Y("selecciono el tipo de expediente {string}")
    public void seleccionoElTipoDeExpediente(String tipoExpediente) {
        myStep.SeleccionoElTipoDeExpediente(tipoExpediente);
    }
}
