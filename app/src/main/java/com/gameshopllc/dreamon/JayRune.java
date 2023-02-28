package com.gameshopllc.dreamon;

import com.jme3.app.SimpleApplication;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;

public class JayRune extends CurrencyMesh{

    Rectangle rectangle;
    DreamPoly dreamPoly;
    public JayRune(SimpleApplication app) {
        super(app);

        vertices.add(new Vector3f(0,0,0));
        vertices.add(new Vector3f(8,0,0));
        vertices.add(new Vector3f(0,2,0));
        vertices.add(new Vector3f(8,2,0));

         rectangle = new Rectangle(app, ColorRGBA.Black, vertices);
         dreamPoly = new DreamPoly(app, ColorRGBA.Black, rectangle);
    }
    @Override
    public void updateRender(){

        //for (Poly poly: polys){
       // rectangle.updateRender();
        dreamPoly.updateRender();
        //poly.updateRender();
        //  }
    }
}
