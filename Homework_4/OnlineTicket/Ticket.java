package Homework_4.OnlineTicket;

import java.util.Date;

// Абстрактный класс и наследование
abstract class Ticket implements TicketActions {
    String routeId;
    Date departureTime;
    double price;
}
