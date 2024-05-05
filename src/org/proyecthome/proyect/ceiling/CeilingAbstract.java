package org.proyecthome.proyect.ceiling;

import org.proyecthome.proyect.proyectcontruction.ProyectContructor;

abstract class CeilingAbstract extends ProyectContructor {

    private int nails;
    public CeilingAbstract(float width_space, float long_space) {
        super(width_space, long_space);
    }

    public void setNails(int nails) {
        this.nails = nails;
    }
    public int getNails() {
        return nails;
    }


}
