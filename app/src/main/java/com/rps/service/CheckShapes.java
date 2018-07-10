package com.rps.service;

import com.rps.shapes.RandomShapes;
import com.rps.shapes.Shapes;

import java.util.ArrayList;
import java.util.HashMap;

public class CheckShapes {

    public String checkShapes(String option) {

        Shapes shapes = new Shapes();
        HashMap<String, ArrayList<String>> listOfShapes = shapes.setShapes();

        String shapeOneName = option;
        String shapeTwoName = new RandomShapes().generateRandomShape();

        if (shapeOneName.equals(shapeTwoName)) {
            return "Draw !";
        } else if (listOfShapes.get(shapeOneName).contains(shapeTwoName)) {
            WinCounter.getInstance().addWin();
            return shapeOneName;
        } else {
            WinCounter.getInstance().addLost();
            return shapeTwoName;
        }
    }
}
