package application;

import entities.Iphone;

public class Main {

    public static void main(String[] args) {


        Iphone iphone = new Iphone();

        iphone.ligar("19999407960");

        iphone.ajustarVolume(20);

        iphone.reproduzirVideo("MODELANDO IPHONE DIO");

        iphone.pausarVideo();

        iphone.adicionarNovaAba();




    }
}
