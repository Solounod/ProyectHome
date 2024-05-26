package org.proyecthome.proyect.ceiling;

import org.materials_contruction.surfaces.CoatMortar;
import org.proyecthome.proyect.proyectcontruction.ProyectContructor;

public class SurfaceConcrete extends ProyectContructor {

    private float height_space;
    private CoatMortar coat = new CoatMortar();

    public SurfaceConcrete(float width_space, float long_space, float height_space) {
        super(width_space, long_space);
        this.height_space = height_space;
    }

    public float getHeight_space() {
        return height_space;
    }

    public void setHeight_space(float height_space) {
        this.height_space = height_space / 1000;
    }

    public float perfonmanceSurface(){
        /* accede a atributos de clases de proyecto y crea logica para devolver cantidad de sacos necesarios
         con variable perfonmance*/
        float perfonmance;
        float volume;

        volume = getHeight_space() * getLong_space() * getWidth_space();
        perfonmance = volume / this.coat.getPerfonmance();

        return perfonmance;
    }
}
