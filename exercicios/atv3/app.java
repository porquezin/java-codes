package exercicios.atv3;

public class app {
    public static void main(String[] args) {
        Retangulo rect = new Retangulo(24.0, 12.0);
    
        rect.userSetBase();
        rect.userSetAltura();
        
        System.out.println(rect.getAll()+"\n");

        rect.setBase(16.0);
        rect.setAltura(9.3);

        System.out.println(rect.getBase()+"\n");
        System.out.println(rect.getAltura()+"\n");

        rect.incrementaAltura();
        rect.incrementaBase();
        rect.decrementaAltura();
        rect.decrementaBase();

        System.out.println(rect.perimetro()+"\n");
        System.out.println(rect.area()+"\n");
        System.out.println(rect.isQuadrado()+"\n");

        rect.setAltura(5.0);
        rect.setBase(5.0);
        System.out.println(rect.isQuadrado()+"\n");
    }
}
