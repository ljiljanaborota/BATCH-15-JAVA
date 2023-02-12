package class24;

import java.util.concurrent.Callable;

public class Task1 {
    /*
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array. Loop through each object and execute available methods.
     */
    public static void main(String[] args) {
        //int a=(int)12.5;
        Computer[] computers = {new Apple(), new Lenovo()};

        for (Computer c : computers) {
            c.playVideo();
            c.browserInternet();
            if (c instanceof Apple) {
                Apple apple = (Apple) c;
                apple.installApp();
                apple.editVideo();

            }
        }
    }
}




    class Computer {
        int RAM;
        int storage;
        String OS;

        void playVideo() {
            System.out.println("video is playing");
        }

        void browserInternet() {
            System.out.println("browse the internet");
        }

        void editVideo() {
            System.out.println("movie is playing");
        }

        void installApp() {
            System.out.println("installing the app ");
        }
    }

    class Apple extends Computer{
        void playVideo(){
            System.out.println("playing the video on quick time player");
        }

        @Override
        void browserInternet() {
            System.out.println("browsing the internet using safari");
        }
        void editVideo(){
            System.out.println("editing on imovies");
        }
        void installApp(){
            System.out.println("installing the app from app store");
        }
    }
    class Lenovo extends Computer{
        @Override
        void browserInternet() {
            System.out.println("browsing using chrome");
        }
        void editVideo(){
            System.out.println("editing on movies");
        }
        void playVideo(){
            System.out.println("playing the video using vlc player");
        }
        void installApp() {
            System.out.println("installing the app from the google");
        }
    }














