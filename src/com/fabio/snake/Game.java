package com.fabio.snake;

import javax.swing.JFrame;

public class Game {
    
    private Snake player;
    private Food food;
    
    private JFrame window;
    
    public static final int width = 30;
    public static final int heigth = 30;
    public static final int dimension = 20;
    
    public Game(){
        window = new JFrame();
        
        window.setTitle("Snake");
        window.setSize(width * dimension, heigth * dimension);
    }
    
}
