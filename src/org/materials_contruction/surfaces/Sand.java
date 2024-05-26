package org.materials_contruction.surfaces;

public class Sand {
    private float perfonmance_cuvette;
    private float perfonmance_cuve;

    public float getPerfonmance_cuvette() {
        this.perfonmance_cuvette = 0.018F;
        return perfonmance_cuvette;
    }

    public float getPerfonmance_cuve() {
        this.perfonmance_cuve = 53 * getPerfonmance_cuvette();
        return perfonmance_cuve;
    }
}
