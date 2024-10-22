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
      | TÉCNICO |
    Y pulsa el botón Acceder

  Esquema del escenario: Alta de Expediente
    Dado que me encuentro en la Bandeja de Expedientes
    Cuando presiono el botón Alta de expediente
    Y selecciono el tipo de expediente "<tipo expediente>"
Ejemplos:
    |tipo expediente|
    |Licitadores    |