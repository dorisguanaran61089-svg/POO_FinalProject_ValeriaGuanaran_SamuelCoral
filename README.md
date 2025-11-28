# Event Ticketing System
es un istema de gestión de venta de entradas para eventos, desarrollado como proyecto final de Programación Orientada a Objetos.  
Permite registrar eventos, clientes, sitios, vender tickets, generar reportes y administrar la información mediante una interfaz por consola.
##  Integrantes
Nombres:Codigos 
Valeria Guanarán :61089.
Samuel Coral :52975
## Descripción General del Sistema
El **Event Ticketing System** es una aplicación de consola que gestiona la venta de entradas para diferentes eventos.  
Permite:
- Registrar eventos con fecha, hora, capacidad, tipo y precio.
- Registrar clientes (normales o VIP).
- Registrar sitios donde se realizan los eventos.
- Vender tickets asegurando disponibilidad y controlando el aforo.
- Listar eventos, clientes y tickets.
- Buscar información por nombre o ID.
- Modificar y eliminar eventos y clientes.
- Guardar y cargar datos mediante serialización.
- Generar reportes del estado del sistema.

###  Arquitectura del sistema (POO)
Se implementaron las siguientes clases principales:

- **Event:** representa un evento con fecha, capacidad, precio y tipo.
- **Customer / VipCustomer:** clientes normales y VIP (herencia).
- **Site:** lugar donde se realiza un evento.
- **TicketOffice:** clase central que administra registro, ventas y reportes.
- **Ticket:** representa las entradas vendidas.
- **TicketOfficeData:** gestiona la persistencia con archivos `.dat`.
- **Console:** utilidad para entrada y salida en la consola.
- **TicketOfficeUI:** interfaz que maneja menús y la interacción del usuario.

El sistema utiliza:
- **Encapsulamiento**
- **Herencia**
- **Composición**
- **Polimorfismo**
- **Listas y manejo de colecciones**
- **Serialización**

## Instrucciones para ejecutar el programa

1. Abrir el proyecto en **Visual Studio Code**.
2. Asegurar que las clases estén en sus respectivos paquetes (domain, ui,data).
3. Ubicar la clase que contiene el main (por ejemplo Main.java):java
public class Main {
    public static void main(String[] args) {
        new TicketOfficeUI().start();
    }
}

4. Ejecutar con:Botón Run de VS Code O desde terminal: java Main
# Ejemplos de entrada y salida 
TICKET SYSTEM:
1. Register event
2. Register customer
3. Sell ticket
4. Register site
...
Choose an option: 1

Register Event:
ID: 101
Name: Rock Night
Date (YYYY-MM-DD): 2025-12-24
Time (HH:MM): 19:30
Ticket price: 50
Total capacity: 200
Event type (SEATED / FREE / OPEN_AIR): SEATED
Event registered.

Sell Ticket
Event ID: 101
Customer ID: 12
Ticket sold.
Event name: Rock Night

Event{id=101, name='Rock Night', capacity=200, price=50.0}

 # Notas finales:
- El archivo newData.dat se genera automáticamente al guardar la información del sistema.

-Todas las interacciones se realizan desde la consola usando la clase TicketOfficeUI.

-Los datos se cargan automáticamente al iniciar si el archivo existe.



