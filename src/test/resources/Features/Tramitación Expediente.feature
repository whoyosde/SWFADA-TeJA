#language: es
@Tramitación
Característica: Tramitación de Expediente
  Como usuario registrado en el sistema
  Quiero ingresar a la plataforma TeJA
  Para tramitar un expediente

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

  Esquema del escenario: Escritorio de Expediente
    Dado presiono el botón Tramitar del expediente
    Cuando transito a la fase Estudiar expediente
    Y valido que me encuentro en la fase Estudiar expediente
    Y transito a la fase Resolver
    Entonces valido que me encuentro en la fase Resolver
    Y deshago la fase
    Y genero un documento
    Y termino un documento
    Y envio el documento a portafirma
    Entonces valido que se encuentra en pendiente de firma
    Y adjunto otra documentación
    Y elimino documento
    Y descargo documento generado
    Entonces valido que se descargó el documento
    Y descargo todos los documentos del expediente
    Y valido que se descargó todos los documentos del expediente
    Y accedo a Interesados
    Y asocio interesado al expediente "<Nif>"
    Entonces valido que el interesado se añadió correctamente
    Y edito interesado
    Y elimino interesado del expediente
    Y iniciar Evento "<Evento>"
    Entonces valido que se inicia el evento
    Y asigno usuario "<usuario>"
    Entonces valido la asignacion del usuario
    Y desasigno usuario "<usuario>"

    Ejemplos:
      | Nif       | usuario             | Evento                      |
      | 99999999R | ADRIAN JIMENEZ VIVA | Aportación de Documentación |