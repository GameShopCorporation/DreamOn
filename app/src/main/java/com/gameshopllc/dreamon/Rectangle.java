package com.gameshopllc.dreamon;

import com.jme3.app.SimpleApplication;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;

import java.util.ArrayList;
import java.util.Vector;

public class Rectangle extends CurrencyMesh{

    //ArrayList<Vector3f> rectangle;

    public Rectangle(SimpleApplication app, ColorRGBA color, ArrayList<Vector3f> coordinates) {
        super(app);
        //ArrayList<Vector3f> rectangle = new ArrayList<Vector3f>();
        this.vertices.clear();

        for(Vector3f thisRectangle : coordinates){
            //rectangle.add(thisRectangle);

            vertices.add(thisRectangle);

        }



    }
    @Override
    public void updateRender(){

        //for (Poly poly: polys){
        //poly.updateRender();
        //  }
    }
}
