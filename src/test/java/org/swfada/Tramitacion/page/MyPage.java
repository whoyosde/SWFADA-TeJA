package org.swfada.Tramitacion.page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MyPage extends PageObject {

    @FindBy(xpath = "//div[@id=\"pendienteTramitar\"]")
    private WebElementFacade btnExpPendiente;

    @FindBy(xpath = "//*[@id=\"btn-tramitar\"]")
    private WebElementFacade btnTransitarFaseEstudio;

    @FindBy(xpath = "//*[@id=\"tr_documentos_expediente\"]/div/button")
    private WebElementFacade btnIncorporar;

    @FindBy(xpath = "//span[contains(text(),'GENERAR OFICIO DE ACUERDO DE INICIO DE EXPEDIENTE')]")
    private WebElementFacade enlaceDocumento;

    @FindBy(xpath = "//a[contains(text(),'Firmantes')]")
    private WebElementFacade pestañaFirmantes;

    @FindBy(xpath = "//ul[@class=\"select2-selection__rendered\"]")
    private WebElementFacade campoFirmantes;

    @FindBy(xpath = "//button[@id=\"btn-generar\"]")
    private WebElementFacade btnGenerar;

    @FindBy(xpath = "//div[@id=\"firmantes\"]")
    private WebElementFacade espacio;

    @FindBy(xpath = "//td[contains(text(),'OFICIO DE ACUERDO DE INICIO DE EXPEDIENTE')]/../td[8]//button")
    private WebElementFacade btnopcion;

    @FindBy(xpath = "//td//a[6]")
    private WebElementFacade opcionTerminar;

    @FindBy(xpath = "//td//a[6]")
    private WebElementFacade opcionEnviarPorta;

    @FindBy(xpath = "//input[@id=\"enviarPortafirmas_0\"]")
    private WebElementFacade btnEnviarPorta;

    @FindBy(xpath = "//div[@id=\"utilidadExtraLargeModal\"]//button[@id=\"cerrarModalAcciones\"]")
    private WebElementFacade btnCerrar;

    @FindBy(xpath = "//div[@id=\"pills-profile-tab\"]/a[contains(text(),'Documentos')]")
    private WebElementFacade pestañaDocumentos;

    @FindBy(xpath = "//span[contains(text(),'Otra documentación')]")
    private WebElementFacade enlaceOtraDoc;

    @FindBy(xpath = "//button[@id=\"btn-adjuntar\"]")
    private WebElementFacade btnAdjuntarDoc;

    @FindBy(xpath = "//td[contains(text(),'DOC0234')]/../td[8]//button")
    private WebElementFacade btnopcionEliminar;

    @FindBy(xpath = "//td[contains(text(),'DOC0234')]//..//a[2]")
    private WebElementFacade opcionEliminar;

    @FindBy(xpath = "//a[contains(text(),'Interesados')]")
    private WebElementFacade pestañaInteresado;

    @FindBy(xpath = "//input[@id=\"agregarInteresado\"]")
    private WebElementFacade btnAgregarInteresado;

    @FindBy(xpath = "//input[@id=\"numIdentificacion\"]")
    private WebElementFacade campoNifInteresado;

    @FindBy(xpath = "//input[@id=\"formBusqueda_0\"]")
    private WebElementFacade btnBuscarInteresado;

    @FindBy(xpath = "//input[@title=\"Añadir\"]")
    private WebElementFacade iconoAñadir;

    @FindBy(xpath = "//button[@id=\"insert1\"]")
    private WebElementFacade btnContinuarInteresado;

    @FindBy(xpath = "//td[contains(text(),'99999999R')]/../td[7]//button")
    private WebElementFacade btnOpcionEliminarInte;

    @FindBy(xpath = "//td[contains(text(),'99999999R')]//..//a[2]")
    private WebElementFacade opcionEliminarInte;

    @FindBy(xpath = "//a[@onclick=\"btnAsignar()\"]")
    private WebElementFacade btnAsignarUsuario;

    @FindBy(xpath = "//select[@id=\"selectUsuarios\"]")
    private WebElementFacade selectUsuario;

    @FindBy(xpath = "//select[@id=\"tipo\"]")
    private WebElementFacade selectTipo;

    @FindBy(xpath = "//input[@id=\"razonAsignacion\"]")
    private WebElementFacade campoRazon;

    @FindBy(xpath = "//input[@id=\"btn-asignar\"]")
    private WebElementFacade btnAsignar;

    @FindBy(xpath = "//h4[@id=\"tituloModalUtilidadXL\"]/../button[@id=\"cerrarModalAcciones\"]")
    private WebElementFacade btnCerrarAsig;

    @FindBy(xpath = "//button[contains(text(),'RESOLVER')]/i[@title=\"Ocultar\"]")
    private WebElementFacade btnMostrarFase;

    @FindBy(xpath = "(//button[@id=\"btn-tramitar\"])[5]")
    private WebElementFacade btnTransitarFaseResolver;



    public void presionoElBotónTramitarDelExpediente() {
        WebElement iframe = getDriver().findElement(By.xpath("//div[@id=\"frameModuloHome\"]/iframe"));
        getDriver().switchTo().frame(iframe);
        btnExpPendiente.click();

        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id=\"filtroForm\"]")));
        btnExpPendiente.waitUntilClickable();

        WebElement fila = getDriver().findElement(By.xpath("(//tr[@class=\"odd\"])[1]"));

        Actions actions = new Actions(getDriver());
        actions.moveToElement(fila)
                .perform();
        WebElement tramitar = getDriver().findElement(By.xpath("//div[@style=\"display: flex; align-items: center; justify-content: center; min-width: 105px; min-height: 80px;\"]/button"));
        actions.moveToElement(tramitar)
                .perform();
        tramitar.click();


        getDriver().switchTo().defaultContent();
    }

    public void transitoALaFaseEstudiarExpediente() {

        WebElement iframe = getDriver().findElement(By.xpath("//div[@id=\"contenidoPestana-31\"]/iframe"));
        getDriver().switchTo().frame(iframe);
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id=\"documentos\"]")));
        getDriver().switchTo().defaultContent();

        btnTransitarFaseEstudio.waitUntilClickable();
        Actions action = new Actions(getDriver());
        action.moveToElement(btnTransitarFaseEstudio).click().perform();
        btnTransitarFaseEstudio.click();
    }

    public void validarFaseTramitación() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'TRAMITACIÓN')]")));
        WebElement fase = getDriver().findElement(By.id("50"));
        assertEquals("TRAMITACIÓN", fase.getText());
    }

    public void transitoALaFaseResolver() {
        WebElement iframe = getDriver().findElement(By.xpath("//div[@id=\"contenidoPestana-50\"]/iframe"));
        getDriver().switchTo().frame(iframe);
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id=\"documentos\"]")));
        getDriver().switchTo().defaultContent();
        btnMostrarFase.waitUntilClickable();
        btnMostrarFase.click();
        btnTransitarFaseResolver.waitUntilClickable();
        Actions action = new Actions(getDriver());
        action.moveToElement(btnTransitarFaseResolver).click().perform();
        btnTransitarFaseResolver.click();
    }


    public void validarFaseResolver() {

        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'GESTION RESOLUCION')]")));
        WebElement fase = getDriver().findElement(By.id("35"));
        assertEquals("GESTION RESOLUCION", fase.getText());
    }

    public void generoUnDocumento() {
        WebElement iframe = getDriver().findElement(By.xpath("//div[@id=\"contenidoPestana-50\"]/iframe"));
        getDriver().switchTo().frame(iframe);
        btnIncorporar.waitUntilClickable();
        btnIncorporar.click();
        getDriver().switchTo().defaultContent();

        WebElement iframe2 = getDriver().findElement(By.xpath("//div[@id=\"contenidoModalUtilidadM\"]/iframe"));
        getDriver().switchTo().frame(iframe2);

        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"tareasDocumentos\"]")));
        waitFor(3).second();
        enlaceDocumento.click();
        getDriver().switchTo().defaultContent();

        WebElement espera = getDriver().findElement(By.id("DIV_ESPERA_ESCRITORIO"));
        // Esperar hasta que el elemento desaparezca
        WebDriverWait waits = new WebDriverWait(getDriver(), 60);
        waits.until(ExpectedConditions.invisibilityOf(espera));

        WebElement iframe4 = getDriver().findElement(By.xpath("//div[@id=\"contenidoModalUtilidadXL\"]/iframe"));
        getDriver().switchTo().frame(iframe4);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"interesados\"]")));
        pestañaFirmantes.waitUntilClickable();
        pestañaFirmantes.click();
        campoFirmantes.click();
        WebElement selectOptions = getDriver().findElement(By.xpath("//option[contains(text(),'David Recio Dominguez')]"));
        clickOn(selectOptions);
        espacio.click();
        btnGenerar.click();
        getDriver().switchTo().defaultContent();
    }

    public void terminoUnDocumento() {
        WebElement espera = getDriver().findElement(By.id("DIV_ESPERA_ESCRITORIO"));
        // Esperar hasta que el elemento desaparezca
        WebDriverWait waits = new WebDriverWait(getDriver(), 60);
        waits.until(ExpectedConditions.invisibilityOf(espera));
        WebElement iframe = getDriver().findElement(By.xpath("//div[@id=\"contenidoPestana-50\"]/iframe"));
        getDriver().switchTo().frame(iframe);
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(text(),'OFICIO DE ACUERDO DE INICIO DE EXPEDIENTE')]")));
        btnopcion.waitUntilClickable();
        btnopcion.click();
        opcionTerminar.waitUntilClickable();
        opcionTerminar.click();
        getDriver().switchTo().defaultContent();
    }

    public void envioElDocumentoAPortafirma() {
        WebElement espera = getDriver().findElement(By.id("DIV_ESPERA_ESCRITORIO"));
        // Esperar hasta que el elemento desaparezca
        WebDriverWait waits = new WebDriverWait(getDriver(), 60);
        waits.until(ExpectedConditions.invisibilityOf(espera));
        WebElement iframe = getDriver().findElement(By.xpath("//div[@id=\"contenidoPestana-50\"]/iframe"));
        getDriver().switchTo().frame(iframe);
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(text(),'OFICIO DE ACUERDO DE INICIO DE EXPEDIENTE')]//../td[7]/span[contains(text(),'TERMINADO')]")));
        btnopcion.waitUntilClickable();
        btnopcion.click();
        opcionEnviarPorta.waitUntilClickable();
        opcionEnviarPorta.click();
        getDriver().switchTo().defaultContent();

        WebElement iframe2 = getDriver().findElement(By.xpath("//div[@id=\"contenidoModalUtilidadXL\"]/iframe"));
        getDriver().switchTo().frame(iframe2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"contenido-nuevo-datosExpediente-firma\"]")));
        btnEnviarPorta.waitUntilClickable();
        btnEnviarPorta.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Se ha enviado correctamente el documento seleccionado a port@firmas.')]")));
        getDriver().switchTo().defaultContent();
        btnCerrar.click();
        pestañaDocumentos.waitUntilClickable();
        pestañaDocumentos.click();
        waits.until(ExpectedConditions.invisibilityOf(espera));
        WebElement iframe3 = getDriver().findElement(By.xpath("//div[@id=\"contenidoPestana-50\"]/iframe"));
        getDriver().switchTo().frame(iframe3);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(text(),'OFICIO DE ACUERDO DE INICIO DE EXPEDIENTE')]//../td[7]/span[contains(text(),'PENDIENTE DE FIRMA')]")));
    }

    public void adjuntarDocumento() {
        // WebElement iframe = getDriver().findElement(By.xpath("//div[@id=\"contenidoPestana-50\"]/iframe"));
        // getDriver().switchTo().frame(iframe);
        btnIncorporar.waitUntilClickable();
        btnIncorporar.click();
        getDriver().switchTo().defaultContent();

        WebElement espera = getDriver().findElement(By.id("DIV_ESPERA_ESCRITORIO"));
        // Esperar hasta que el elemento desaparezca
        WebDriverWait waits = new WebDriverWait(getDriver(), 60);
        waits.until(ExpectedConditions.invisibilityOf(espera));

        WebElement iframe2 = getDriver().findElement(By.xpath("//div[@id=\"contenidoModalUtilidadM\"]/iframe"));
        getDriver().switchTo().frame(iframe2);

        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"tareasDocumentos\"]")));
        enlaceOtraDoc.waitUntilClickable();
        enlaceOtraDoc.click();
        getDriver().switchTo().defaultContent();

        waits.until(ExpectedConditions.invisibilityOf(espera));
        WebElement iframe4 = getDriver().findElement(By.xpath("//div[@id=\"contenidoModalUtilidadXL\"]/iframe"));
        getDriver().switchTo().frame(iframe4);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"subirDocumento\"]")));

        String relativePath = "src/test/resources/DOC0234.pdf";
        String absolutePath = Paths.get(relativePath).toAbsolutePath().toString();

        // Localizar el elemento de entrada de archivo
        WebElement fileInput = getDriver().findElement(By.id("file"));

        // Adjuntar el archivo
        fileInput.sendKeys(absolutePath);

        System.out.println("Archivo adjuntado correctamente.");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"fileDOC0234pdf\"]")));
        btnAdjuntarDoc.waitUntilClickable();
        btnAdjuntarDoc.click();
        getDriver().switchTo().defaultContent();

    }

    public void eliminoDocumento() {
        WebElement espera = getDriver().findElement(By.id("DIV_ESPERA_ESCRITORIO"));
        // Esperar hasta que el elemento desaparezca
        WebDriverWait waits = new WebDriverWait(getDriver(), 60);
        waits.until(ExpectedConditions.invisibilityOf(espera));
        WebElement iframe = getDriver().findElement(By.xpath("//div[@id=\"contenidoPestana-50\"]/iframe"));
        getDriver().switchTo().frame(iframe);
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(text(),'DOC0234')]")));
        btnopcionEliminar.waitUntilClickable();
        btnopcionEliminar.click();
        opcionEliminar.waitUntilClickable();
        opcionEliminar.click();
        Alert alert = getDriver().switchTo().alert();
        alert.accept();
        getDriver().switchTo().defaultContent();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Operación realizada con éxito')]")));
        WebElement espera2 = getDriver().findElement(By.id("DIV_ESPERA_ESCRITORIO"));
        // Esperar hasta que el elemento desaparezca
        WebDriverWait waits2 = new WebDriverWait(getDriver(), 60);
        waits2.until(ExpectedConditions.invisibilityOf(espera2));
        WebElement iframe2 = getDriver().findElement(By.xpath("//div[@id=\"contenidoPestana-50\"]/iframe"));
        getDriver().switchTo().frame(iframe2);
        List<WebElement> lista = getDriver().findElements(By.xpath(".//td[contains(text(),'DOC0234')]"));
        if (lista.size() == 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("Existe en la Lista");
        }
        getDriver().switchTo().defaultContent();
    }

    public void accedoAInteresados() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Documentos')]")));
        pestañaInteresado.waitUntilClickable();
        pestañaInteresado.click();
        WebElement espera = getDriver().findElement(By.id("DIV_ESPERA_ESCRITORIO"));
        // Esperar hasta que el elemento desaparezca
        WebDriverWait waits = new WebDriverWait(getDriver(), 60);
        waits.until(ExpectedConditions.invisibilityOf(espera));

        WebElement iframe = getDriver().findElement(By.xpath("//div[@id=\"contenidoPestana-50\"]/iframe"));
        getDriver().switchTo().frame(iframe);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"tablaInteresados_wrapper\"]")));
    }

    public void asocioInteresadoAlExpediente(String nif) {
        btnAgregarInteresado.waitUntilClickable();
        btnAgregarInteresado.click();
        getDriver().switchTo().defaultContent();

        WebElement espera = getDriver().findElement(By.id("DIV_ESPERA_ESCRITORIO"));
        // Esperar hasta que el elemento desaparezca
        WebDriverWait waits = new WebDriverWait(getDriver(), 60);
        waits.until(ExpectedConditions.invisibilityOf(espera));
        WebElement iframe = getDriver().findElement(By.xpath("//div[@id=\"contenidoModalUtilidadL\"]/iframe"));
        getDriver().switchTo().frame(iframe);
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id=\"formBusqueda\"]")));
        campoNifInteresado.sendKeys(nif);
        btnBuscarInteresado.waitUntilClickable();
        btnBuscarInteresado.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(text(),'99999999R')]")));
        iconoAñadir.waitUntilClickable();
        iconoAñadir.click();
        getDriver().switchTo().defaultContent();

        waits.until(ExpectedConditions.invisibilityOf(espera));
        WebElement iframe2 = getDriver().findElement(By.xpath("//div[@id=\"contenidoModalUtilidadXL\"]/iframe"));
        getDriver().switchTo().frame(iframe2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id=\"formularioEspecifico\"]")));
        btnContinuarInteresado.waitUntilClickable();
        btnContinuarInteresado.click();
        getDriver().switchTo().defaultContent();
    }

    public void validoQueElInteresadoSeAñadióCorrectamente() {
        WebElement espera = getDriver().findElement(By.id("DIV_ESPERA_ESCRITORIO"));
        // Esperar hasta que el elemento desaparezca
        WebDriverWait waits = new WebDriverWait(getDriver(), 60);
        waits.until(ExpectedConditions.invisibilityOf(espera));
        WebElement iframe = getDriver().findElement(By.xpath("//div[@id=\"contenidoPestana-50\"]/iframe"));
        getDriver().switchTo().frame(iframe);
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"tablaInteresados_wrapper\"]")));
        List<WebElement> lista = getDriver().findElements(By.xpath(".//td[contains(text(),'99999999R')]"));
        if (lista.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe en la Lista");
        }
    }

    public void eliminoInteresadoDelExpediente() {
        btnOpcionEliminarInte.waitUntilClickable();
        btnOpcionEliminarInte.click();
        opcionEliminarInte.waitUntilClickable();
        opcionEliminarInte.click();
        getDriver().switchTo().defaultContent();
        waitFor(2).second();
        Alert alert = getDriver().switchTo().alert();
        alert.accept();
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Interesado eliminado correctamente')]")));

        WebElement espera = getDriver().findElement(By.id("DIV_ESPERA_ESCRITORIO"));
        // Esperar hasta que el elemento desaparezca
        WebDriverWait waits = new WebDriverWait(getDriver(), 60);
        waits.until(ExpectedConditions.invisibilityOf(espera));

        WebElement iframe = getDriver().findElement(By.xpath("//div[@id=\"contenidoPestana-50\"]/iframe"));
        getDriver().switchTo().frame(iframe);
        List<WebElement> lista = getDriver().findElements(By.xpath(".//td[contains(text(),'99999999R')]"));
        if (lista.size() == 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("Existe en la Lista");
        }

        getDriver().switchTo().defaultContent();
    }

    public void asignoUsuario(String usuario) {
        btnAsignarUsuario.waitUntilClickable();
        btnAsignarUsuario.click();
        WebElement espera = getDriver().findElement(By.id("DIV_ESPERA_ESCRITORIO"));
        // Esperar hasta que el elemento desaparezca
        WebDriverWait waits = new WebDriverWait(getDriver(), 120);
        waits.until(ExpectedConditions.invisibilityOf(espera));
        WebElement iframe = getDriver().findElement(By.xpath("//div[@id=\"contenidoModalUtilidadXL\"]/iframe"));
        getDriver().switchTo().frame(iframe);
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"usuariosAsig\"]")));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("selectUsuarios")));
        waitFor(2).second();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        WebElement element = getDriver().findElement(By.id("selectUsuarios"));
        js.executeScript("arguments[0].click();", element);
        WebElement selectOptions = getDriver().findElement(By.xpath("//option[contains(text(),'Abraham Fernandez Eguren')]"));
        clickOn(selectOptions);

        selectTipo.waitUntilClickable();
        selectTipo.click();
        WebElement selectOptions2 = getDriver().findElement(By.xpath("//option[contains(text(),'Principal')]"));
        clickOn(selectOptions2);
        campoRazon.sendKeys("Prueba");
        btnAsignar.waitUntilClickable();
        btnAsignar.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(normalize-space(),'Abraham Fernandez Eguren')]")));
        getDriver().switchTo().defaultContent();
        btnCerrarAsig.click();
    }

    public void validoLaAsignacionDelUsuario() {
        WebElement espera = getDriver().findElement(By.id("DIV_ESPERA_ESCRITORIO"));
        // Esperar hasta que el elemento desaparezca
        WebDriverWait waits = new WebDriverWait(getDriver(), 60);
        waits.until(ExpectedConditions.invisibilityOf(espera));
        List<WebElement> lista = getDriver().findElements(By.xpath("//div[@id=\"usuarios\"]/p[contains(text(),'Abraham Fernandez Eguren')]"));
        if (lista.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("Usuario no asignado");
        }

    }

}
