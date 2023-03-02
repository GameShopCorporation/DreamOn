package com.gameshopllc.dreamon;

import com.jme3.app.SimpleApplication;
import com.jme3.app.state.VideoRecorderAppState;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;
import com.jme3.scene.Node;
import com.jme3.scene.VertexBuffer.Type;
import com.jme3.scene.shape.Box;
import com.jme3.system.AppSettings;
import com.jme3.util.BufferUtils;

import java.io.File;
import java.util.ArrayList;

/**
 * @author lyndenjayevans
 */
public class AppMain extends SimpleApplication {

   /**
    * This Is For Girls
    * */

    @Override
    public void simpleInitApp() {

        settings.setBitsPerPixel(32);
        settings.setSamples(32);
        settings.setFrameRate(60);
        settings.setVSync(true);
        settings.setStencilBits(8);
        settings.setDepthBits(32);
        viewPort.setBackgroundColor(ColorRGBA.White);

        LyndenJayEvansJr lyndenJayEvansJr = new LyndenJayEvansJr(this);

        
    }


    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code

    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code



    }
}