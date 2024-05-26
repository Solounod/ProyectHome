import org.proyecthome.proyect.ceiling.SurfaceConcrete;

public class Main {
    public static void main(String[] args) {

        SurfaceConcrete proyect1 = new SurfaceConcrete(2, 4,8.5f);
        proyect1.setHeight_space(proyect1.getHeight_space());
        System.out.println(proyect1.perfonmanceSurface());
    }
}