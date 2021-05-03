package com.fabio.snake;

import java.awt.Rectangle;
import java.util.ArrayList;

public class Snake {
    
    private ArrayList<Rectangle> body;
    private int w = Game.width;
    private int h = Game.heigth;
    private int d = Game.dimension;
    
    public Snake(){
        body = new ArrayList<>();
        Rectangle temp = new Rectangle(Game.dimension, Game.dimension);
        temp.setLocation(Game.width / 2 * Game.dimension, Game.heigth / 2 * Game.dimension);
        body.add(temp);
        
        temp = new Rectangle(d, d);
        temp.setLocation((w / 2 - 1) * d, (h / 2 - 1) * d);
        body.add(temp);
        
        temp = new Rectangle(d, d);
        temp.setLocation((w / 2 - 2) * d, (h / 2 - 2) * d);
        body.add(temp);
    }

    public ArrayList<Rectangle> getBody() {
        return body;
    }

    public void setBody(ArrayList<Rectangle> body) {
        this.body = body;
    }
    
    
}
