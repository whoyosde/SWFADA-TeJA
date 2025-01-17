package org.swfada.Tramitacion.page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;
import java.awt.*;
import java.util.List;
import java.util.Properties;

public class MyPage extends PageObject {

    String relativePath = "src/test/resources/Download/";
    @FindBy(xpath = "//div[@id=\"pendienteTramitar\"]")
    private WebElementFacade btnExpPendiente;

    @FindBy(xpath = "//*[@id=\"btn-tramitar\"]")
    private WebElementFacade btnTransitarFase;

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

    @FindBy(xpath = "//td[contains(text(),'OFICIO DE ACUERDO DE INICIO DE EXPEDIENTE')]/../td[8]//a[2]")
    private WebElementFacade opcionDescargar;

    @FindBy(xpath = "//table[@id=\"documentos\"]/thead/tr/th[1]/input")
    private WebElementFacade opcionSeleccionarTodosLosDocumentos;

    @FindBy(xpath = "//a[contains(text(), 'Descargar documentos')]")
    private WebElementFacade opcionDescargarTodosLosDocumentos;

    @FindBy(xpath = "//td[contains(text(),'99999999R')]/../td[7]//button")
    private WebElementFacade btnOpcionEditarInteresado;
    @FindBy(xpath = "//td[contains(text(),'99999999R')]//..//a[1]")//"//td[7]//a[1]"
    private WebElementFacade opcionEditarInteresado;

    @FindBy(xpath = "//form[@id=\"formularioAltaInteresado\"]//button[@id=\"submitModificarInteresado\"]")
    private WebElementFacade btnOpcionModificarInteresado;

    @FindBy(xpath = "//ul[@id=\"myTab\"]/li[3]/a")
    private WebElementFacade opcionEvento;

    @FindBy(xpath = "//input[@id=\"iniciarEvento\"]")
    private WebElementFacade btnIniciarEvento;

    public void presionoElBotónTramitarDelExpediente() {
        WebElement iframe = getDriver().findElement(By.xpath("//div[@id=\"frameModuloHome\"]/iframe"));
        getDriver().switchTo().frame(iframe);
        btnExpPendiente.click();

        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id=\"filtroForm\"]")));
        btnExpPendiente.waitUntilClickable();
        String estado = "Registro de Licitadores de Andalucía PRU";
        // Encontrar todas las filas de la tabla
        List<WebElement> filas = getDriver().findElements(By.tagName("tr"));
        // Bandera para indicar si se encontró el elemento
        boolean encontrado = false;

        for (int i = 0; i < filas.size(); i++) {
            WebElement fila = filas.get(i);
            // Buscar el elemento en la fila por su texto
            if (fila.getText().contains(estado)) {

                Actions actions = new Actions(getDriver());
                actions.moveToElement(fila)
                        .perform();
                WebElement tramitar = getDriver().findElement(By.xpath("//div[@style=\"display: flex; align-items: center; justify-content: center; min-width: 105px; min-height: 80px;\"]/button"));
                actions.moveToElement(tramitar)
                        .perform();
                tramitar.click();

                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró el elemento buscado.");
        }
        getDriver().switchTo().defaultContent();
    }

    public void transitoALaFaseEstudiarExpediente() {

        WebElement iframe = getDriver().findElement(By.xpath("//div[@id=\"contenidoPestana-31\"]/iframe"));
        getDriver().switchTo().frame(iframe);
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id=\"documentos\"]")));
        getDriver().switchTo().defaultContent();

        btnTransitarFase.waitUntilClickable();
        Actions action = new Actions(getDriver());
        action.moveToElement(btnTransitarFase).click().perform();
        btnTransitarFase.click();
        //quitar al desbloquearprimera linea
      //  WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'TRAMITACIÓN')]")));
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

    public void descargoDocumentoGenerado() throws InterruptedException, AWTException {

        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(text(),'OFICIO DE ACUERDO DE INICIO DE EXPEDIENTE')]")));

        btnopcion.waitUntilClickable();
        btnopcion.click();
        opcionDescargar.waitUntilClickable();
        opcionDescargar.click();
        getDriver().switchTo().defaultContent();

        Robot robot = new Robot();
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_S);
        Thread.sleep(4000);

        String absolutePath = Paths.get(relativePath + "documento.pdf").toAbsolutePath().toString();
        StringSelection stringSelection = new StringSelection(absolutePath);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, stringSelection);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(4000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_ENTER);

        if (!absolutePath.isEmpty()) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.delay(20);
            robot.keyRelease(KeyEvent.VK_ENTER);
        }

        Thread.sleep(5000);
        String base = getDriver().getWindowHandle();
        Set<String> set = getDriver().getWindowHandles();
        set.remove(base);
        assert set.size() == 1 : "verificar ventana nueva";

        String newWindowHandle = set.iterator().next();
        getDriver().switchTo().window(newWindowHandle);

        getDriver().close(); // Cerrar ventana actual
        getDriver().switchTo().window(base);

    }

    public void validoQueSeDescargoElDocumento()  throws IOException {

        File dir = new File(relativePath);
        File[] files = dir.listFiles();
        Arrays.sort(files, Comparator.comparingLong(File::lastModified).reversed());
        if(files.length > 0) {
            File archivoDescargado = files[0];
            System.out.println("El archivo más reciente descargado es: " + archivoDescargado.getName());
        } else {
            System.out.println("No se descargaron archivos");
        }
    }

    public void descargoTodosLosDocumentosDelExpediente() throws InterruptedException, AWTException {

        WebElement iframe = getDriver().findElement(By.xpath("//div[@id=\"contenidoPestana-50\"]/iframe"));
        getDriver().switchTo().frame(iframe);
        opcionSeleccionarTodosLosDocumentos.waitUntilClickable();
        opcionSeleccionarTodosLosDocumentos.click();

        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id=\"documentos\"]/thead/tr/th[1]/input")));

        opcionDescargarTodosLosDocumentos.waitUntilClickable();
        opcionDescargarTodosLosDocumentos.click();

        Robot robot = new Robot();
        Thread.sleep(4000);
        String absolutePath = Paths.get(relativePath+"documentos.zip").toAbsolutePath().toString();
        StringSelection stringSelection = new StringSelection(absolutePath);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, stringSelection);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(4000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(20);
        robot.keyRelease(KeyEvent.VK_ENTER);

        if (!absolutePath.isEmpty()) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.delay(20);
            robot.keyRelease(KeyEvent.VK_ENTER);
        }

        getDriver().switchTo().defaultContent();
    }

    public void editoInteresado() {

        btnOpcionEditarInteresado.waitUntilClickable();
        btnOpcionEditarInteresado.click();
        opcionEditarInteresado.waitUntilClickable();
        opcionEditarInteresado.click();
        getDriver().switchTo().defaultContent();
        waitFor(15).second();
        WebElement iframe = getDriver().findElement(By.xpath("//div[@id=\"contenidoModalUtilidadL\"]/iframe"));
        getDriver().switchTo().frame(iframe);

        btnOpcionModificarInteresado.waitUntilClickable();
        btnOpcionModificarInteresado.click();
        getDriver().switchTo().defaultContent();
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Operación realizada con éxito')]")));
    }

    public void iniciarEvento(String Evento) {
        opcionEvento.waitUntilClickable();
        opcionEvento.click();
        waitFor(15).second();
        WebElement iframe = getDriver().findElement(By.xpath("//div[@id=\"contenidoModalUtilidadM\"]/iframe"));
        getDriver().switchTo().frame(iframe);
        WebElement selectElement = getDriver().findElement(By.xpath("//select[@id=\"selectEventos\"]"));
        selectElement.sendKeys(Evento);

        btnIniciarEvento.waitUntilClickable();
        btnIniciarEvento.click();
        getDriver().switchTo().defaultContent();
    }

    public void validoQueSeIniciaElEvento() {
        WebElement espera = getDriver().findElement(By.id("DIV_ESPERA_ESCRITORIO"));
        // Esperar hasta que el elemento desaparezca
        WebDriverWait waits = new WebDriverWait(getDriver(), 60);
        waits.until(ExpectedConditions.invisibilityOf(espera));
        WebElement evento = getDriver().findElement(By.xpath("//ul[@id=\"myTab\"]//a[contains(text(),'APORTACIÓN DE DOCUMENTACIÓN')]"));
        if (evento.getText().contains("APORTACIÓN DE DOCUMENTACIÓN")) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("Evento no iniciado");
        }
    }
}
