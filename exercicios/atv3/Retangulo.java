package exercicios.atv3;

public class Retangulo {
    private Double base;
    private Double baseAntiga;
    private Double altura;
    private Double alturaAntiga;

    public Retangulo(Double base, Double altura) {
        this.altura = altura;
        this.alturaAntiga = altura;
        this.base = base;
        this.baseAntiga = base;
    }

    public Double getAltura() {
        return altura;
    }

    public Double getBase() {
        return base;
    }

    public void setAltura(Double altura) {
        this.alturaAntiga = this.altura;
        this.altura = altura;
        System.out.println(validaAltura()+"\n");
    }
    public void setBase(Double base) {
        this.baseAntiga = this.base;
        this.base = base;
        System.out.println(validaBase()+"\n");
    }

    public void userSetAltura() {
        this.alturaAntiga = this.altura;
        this.altura = Double.parseDouble(System.console().readLine("Nova altura: "));
        System.out.println(validaAltura());
    }

    public void userSetBase() {
        this.baseAntiga = this.base;
        this.base = Double.parseDouble(System.console().readLine("Nova base: "));
        System.out.println(validaBase());
    }

    public String getAll() {
        return String.format("Base: %.2f\nAltura: %.2f", base, altura);
    }

    public String validaBase() {
        return String.format("Dados antigos: Base= %.2f\nDados novos: Base= %.2f\n", baseAntiga, base);
    }

    public String validaAltura() {
        return String.format("Dados antigos: Altura= %.2f\nDados novos: Altura= %.2f\n", alturaAntiga, altura);
    }

    public void incrementaBase(){
        this.baseAntiga = this.base;
        this.base++;
        System.out.println(validaBase()+"\n");
    }
    public void decrementaBase(){
        this.baseAntiga = this.base;
        this.base--;
        System.out.println(validaBase()+"\n");
    }
    public void incrementaAltura(){
        this.alturaAntiga = this.altura;
        this.altura++;
        System.out.println(validaAltura()+"\n");
    }
    public void decrementaAltura(){
        this.alturaAntiga = this.altura;
        this.altura--;
        System.out.println(validaAltura()+"\n");
    }

    public String perimetro(){
        return String.format("Perimetro: %.2f", 2.0*(this.base+this.altura));
    }
    public String area(){
        return String.format("Area: %.2f", this.base*this.altura);
    }
    
    public String isQuadrado(){
        if(this.base.equals(this.altura)){
            return "É um quadrado!";
        }else{
            return "Não é um quadrado!";
        }
    }
}
