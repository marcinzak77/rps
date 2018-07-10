package com.kodilla.rps.shapes;

import java.util.*;

public class Shapes {

    public HashMap<String, ArrayList<String>> setShapes() {
        Map<String, ArrayList<String>> shapeList = new HashMap<>();
        shapeList.put("rock", new ArrayList<>(Arrays.asList("scissors")));
        shapeList.put("scissors", new ArrayList<>(Arrays.asList("paper")));
        shapeList.put("paper", new ArrayList<>(Arrays.asList("rock")));

        return (HashMap)shapeList;
    }

}
