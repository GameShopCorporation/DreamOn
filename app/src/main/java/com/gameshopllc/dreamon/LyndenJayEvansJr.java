package com.gameshopllc.dreamon;

import com.jme3.app.SimpleApplication;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;

/**
 * This Is For Women :D
 * */
public class LyndenJayEvansJr extends CurrencyMesh {


    public LyndenJayEvansJr(SimpleApplication app) {
        super(app);

        vertices.add(new Vector3f(0,0,0));
        vertices.add(new Vector3f(1,0,0));
        vertices.add(new Vector3f(0,1,0));
        vertices.add(new Vector3f(1,1,0));

        indexes.add(2);
        indexes.add(0);
        indexes.add(1);
        indexes.add(1);
        indexes.add(3);
        indexes.add(2);

        poly = new Poly(app, vertices, texCoord, indexes, ColorRGBA.Black);

    }

    public void updateRender(){

        poly.updateRender();

    }
}
