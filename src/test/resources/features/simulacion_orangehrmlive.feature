#language: es

Característica: Como usuario requiero navegar por la página orangehrmlive

  Antecedentes:  abrir pagina
    Dado el usuario ingresa a la pagina

  @Prueba
  Esquema del escenario: 001 Iniciar sesión
    Cuando el usuario ingrese las credenciales correctas
      | userName   | password   |
      | <userName> | <password> |
    Entonces el usuario ingresa a la página principal "Time at Work"

    Ejemplos:
      | userName | password |
      | Admin    | admin123 |

  @Prueba
  Esquema del escenario: 002 proceso de contratacion
    Cuando el usuario ingrese las credenciales correctas
      | userName   | password   |
      | <userName> | <password> |

    Y el usuario ingrese los datos correctas
      | firtsName   | lastName   | email   | palabra   |
      | <firtsName> | <lastName> | <email> | <palabra> |

    Entonces el usuario culmina el proceso de contratacion "Application Stage"


    Ejemplos:
      | userName | password | firtsName | lastName | email             | palabra |
      | Admin    | admin123 | Marcela   | Arango   | marcela@gmail.com | Hired   |

  @Prueba
  Esquema del escenario: 003 verificacion de datos
    Cuando el usuario ingrese las credenciales correctas
      | userName   | password   |
      | <userName> | <password> |

    Y el usuario verifique la información
      | palabra   |
      | <palabra> |
    Entonces los datos de la persona deben corresponder a los diligenciados en los formularios
      | firtsName   | lastName   | email   |
      | <firtsName> | <lastName> | <email> |

    Y el estado debe ser contratado "Hired"

    Ejemplos:
      | userName | password | palabra | firtsName | lastName | email             |
      | Admin    | admin123 | Hired   | Marcela   | Arango   | marcela@gmail.com |


