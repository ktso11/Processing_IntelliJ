package com.company;
import processing.core.PApplet;

public class MainApp extends PApplet {

    public static void main(String... args) {
        MainApp mainapp = new MainApp();
        PApplet.runSketch(new String[]{"MainApp"}, mainapp);
    }

    public void setup(){
        strokeWeight(2);
    }

    public void draw(){
        fill(255,0,0);
        int x = 10;
        background(255);
        if(keyPressed == true){
            x+=10;
        }
        ellipse(width/2, height/2, x-100,x-100);
    }
    public void settings(){
        size(200,200);
    }

}
