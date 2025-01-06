package org.swfada.AccesoInformA.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.AccesoInformA.page.MyPage;

public class MyStep extends ScenarioSteps {
    private MyPage myPage;

    @net.thucydides.core.annotations.Step
    public void QueElUsuarioIngresaALaPlataformaTeJA() {
        myPage.open();
    }

    @net.thucydides.core.annotations.Step
    public void SeleccionaLaInstalación(String instalacion) {
        myPage.SeleccionarInstalación(instalacion);
    }

    @net.thucydides.core.annotations.Step
    public void SeleccionaElSistema(String sistema) {
        myPage.SeleccionarSistema(sistema);
    }

    @net.thucydides.core.annotations.Step
    public void IngresaUsuario(String usuario) {
        myPage.IngresarCredenciales(usuario);
    }

    @net.thucydides.core.annotations.Step
    public void IngresaContraseña(String contraseña) {
        myPage.IngresarContraseña(contraseña);
    }

    @net.thucydides.core.annotations.Step
    public void PresionaElBotónAceptarLasObligacionesDelSistema() {
        myPage.PulsarAceptarObligaciones();
    }

    @net.thucydides.core.annotations.Step
    public void SeleccionaElPuesto(String puesto) {
        myPage.SeleccionarPuesto(puesto);
    }

    @net.thucydides.core.annotations.Step
    public void PulsaElBotónAcceder() {
        myPage.PulsarAcceder();
    }

    @net.thucydides.core.annotations.Step
    public void QueMeEncuentroEnLaBandejaDeExpdientes() {
        myPage.ValidarQueEncuentoEnBandejaDeExpedientes();
    }
}
