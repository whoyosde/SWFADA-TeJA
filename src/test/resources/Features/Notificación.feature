#language: es
@Notificación
Característica: Nueva Remesa
  Como usuario registrado en el sistema
  Quiero ingresar a la plataforma TeJA
  Para registrar una remesa

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

  Esquema del escenario: Notificación
    Dado que busco el expediente "<expediente>"
    Cuando pulsa la pestaña Notificaciones
    Y pulsa el botón Nueva Remesa
    Y selecciona el documento firmado
    Y pulsa el botón Siguiente
    Entonces selecciona el interesado
    Y pulsa el botón Siguiente interesados
    Y ingresa el asunto de notificación "<asunto>"
    Y pulsa el botón Enviar Notificación
    Entonces se muestra el resumen de la notificación
    Y pulsa el botón Cerrar
    Entonces validar que se muestra la notificación

    Ejemplos:
      | expediente | asunto |
      | RLCAA6232214 | Prueba |