#language: es
@AltaExpediente
Característica: Alta de Expediente
  Como usuario registrado en el sistema
  Quiero ingresar a la plataforma TeJA
  Para gestionar la bandeja de expedientes

  Antecedentes:
    Dado que el usuario ingresa a la plataforma TeJA
    Y selecciona la instalación
      | CHAP |
    Y selecciona el sistema
      | CHAP |
    Cuando ingresa Usuario
      | 53275060E |
    Y ingresa Contraseña
      | 53275060E |
    Y presiona el botón Aceptar las obligaciones del sistema
    Entonces selecciona el puesto
      | TÉCNICO/A (Consejería de Hacienda, Industria y Energía) |
    Y pulsa el botón Acceder
    Entonces me encuentro en la Bandeja de Expedientes

  Esquema del escenario: Alta de Expediente
    Dado presiono el botón Alta de expediente
    Cuando selecciono el tipo de expediente "<tipo expediente>"
    Y selecciono el procedimiento "<procedimiento>"
    Y ingresar el título del expediente "<título>"
    Y selecciono la fase de inicio "<fase>"
    Y selecciono la unidad orgánica "<unidad orgánica>"
    Y selecciono la unidad orgánica creadora "<unidad creadora>"
    Y pulsa el botón Continuar
    Y rellenar datos del formulario
    Y pulsa el botón guardar y terminar
    Y pulsa el botón Continuar de Datos específicos
    Y selecciono tipo de documento "<tipo documento>"
    Y adjunto documento
    Entonces pulsa el botón Continuar de Documentación
    Ejemplos:
      | tipo expediente                      | procedimiento                            | título | fase                            | unidad orgánica                             | unidad creadora                             | tipo documento                    |
      | Registro de Licitadores de Andalucía | Registro de Licitadores de Andalucía PRU | Prueba | INICIO DE PRESENTACION EN PAPEL | Consejería de Hacienda, Industria y Energía | Consejería de Hacienda, Industria y Energía| ANEXO I: SOLICITUD DE INSCRIPCIÓN |