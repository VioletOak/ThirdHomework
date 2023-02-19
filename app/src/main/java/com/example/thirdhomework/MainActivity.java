package com.example.thirdhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

   /** Необходимо купить билеты на экскурсионную группу на автобус из Горно-
    Алтайска в Артыбаш
    Группа состоит из 9 молодых взрослых, 5 пенсионеров и 11 детей
    Автобус отправляется в 7.00 1 июня (время пути 4 часа 30 минут)
    Стоимость взрослого билета 70 монет, детский билет с 50% скидкой,
    пенсионерский билет с 30% скидкой

    Исходя из имеющихся данных нужно создать сущности билета с необходимыми
    полями для молодого взрослого, пенсионера и для ребёнка
    Затем нужно вывести общую стоимость билетов на экран приложения **/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Ticket ticket = new Ticket( 70, 9);
        Ticket childTicket = new ChildTicket( 70, 11);
        Ticket oldTicket = new OldTicket(70, 5);



    }
}