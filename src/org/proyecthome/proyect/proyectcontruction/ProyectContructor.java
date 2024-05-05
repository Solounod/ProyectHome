package org.proyecthome.proyect.proyectcontruction;

public abstract class ProyectContructor {
    private float width_space;
    private float long_space;
    private float performance;

    public ProyectContructor(float width_space, float long_space) {
        this.width_space = width_space;
        this.long_space = long_space;
    }

    public float getWidth_space() {
        return width_space;
    }

    public void setWidth_space(float width_space) {
        this.width_space = width_space;
    }

    public void setLong_space(float long_space) {
        this.long_space = long_space;
    }

    public float getLong_space() {
        return long_space;
    }

    public ProyectContructor(float width_space, float long_space, float performance) {
        this.width_space = width_space;
        this.long_space = long_space;
        this.performance = performance;
    }
}
