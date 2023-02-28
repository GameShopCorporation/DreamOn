package com.gameshopllc.dreamon;

import com.jme3.app.SimpleApplication;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;

public class DreamPoly extends CurrencyMesh{

    public DreamPoly(SimpleApplication app, ColorRGBA color, Rectangle rectangle) {
        super(app);


        poly = new Poly(app, rectangle.vertices, rectangle.texCoord, rectangle.indexes, color);

    }
    @Override
    public void updateRender(){

        //for (Poly poly: polys){
        poly.updateRender();
        //  }
    }
}
