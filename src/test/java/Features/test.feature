Feature: Categoria Contactenos
  Como usuario quiero ingresar al modulo de contactenos para enviar un mensaje para atencion al cliente.

  Scenario: Ingresar al modulo Contactenos desde la pantalla Home
    Given El usuario se encuentra en la pagina Home de mi tienda
    When Hace clic sobre la pensataña de contactenos
    Then Se debe redirigir a la pantalla Contactenos