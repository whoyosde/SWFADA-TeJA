package org.swfada.AccesoInformA.stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.AccesoInformA.step.MyStep;

import java.util.List;

public class MyStepdefinition {
    @Steps
   private MyStep myStep;

    @Dado("que el usuario ingresa a la plataforma TeJA")
    public void QueElUsuarioIngresaALaPlataformaTeJA() {
            myStep.QueElUsuarioIngresaALaPlataformaTeJA();
    }

    @Y("selecciona la instalación")
    public void SeleccionaLaInstalación(List<String> instalacion) {
            myStep.SeleccionaLaInstalación(instalacion.get(0));
    }

    @Y("selecciona el sistema")
    public void SeleccionaElSistema(List<String> sistema) {
            myStep.SeleccionaElSistema(sistema.get(0));
    }

    @Cuando("ingresa Usuario")
    public void IngresaUsuario(List<String> usuario) {
            myStep.IngresaUsuario(usuario.get(0));

    }

    @Y("ingresa Contraseña")
    public void IngresaContraseña(List<String> contraseña) {
            myStep.IngresaContraseña(contraseña.get(0));
    }

    @Y("presiona el botón Aceptar las obligaciones del sistema")
    public void PresionaElBotónAceptarLasObligacionesDelSistema() {
            myStep.PresionaElBotónAceptarLasObligacionesDelSistema();

    }

    @Entonces("selecciona el puesto")
    public void SeleccionaElPuesto(List<String> puesto) {
            myStep.SeleccionaElPuesto(puesto.get(0));

    }

    @Y("pulsa el botón Acceder")
    public void PulsaElBotónAcceder() {
            myStep.PulsaElBotónAcceder();

    }

    @Entonces("me encuentro en la Bandeja de Expedientes")
    public void queMeEncuentroEnLaBandejaDeExpedientes() {
        myStep.QueMeEncuentroEnLaBandejaDeExpdientes();
    }
}
