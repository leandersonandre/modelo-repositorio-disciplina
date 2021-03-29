class Exercicio08 {
  public static void main(String[] args) {

    // SOMATORIO
    double resultado = 0;
    for(int i = 0; i < 101; i++){
        // resultado += i;
        resultado = resultado + i;
    }
    System.out.println("Resultado: "+resultado);

    // PRODUTORIO
    resultado = 1;
    for(int i = 1; i < 101; i++){
        // resultado *= i;
        resultado = resultado * i;
    }
    System.out.println("Resultado: "+resultado);

    //  Função Gramacy & Lee
    double x = 0.2;
    double z = Math.sin(10.0*Math.PI*x) / (2.0 * x);
    double r = z + Math.pow( x-1.0,4.0);
    System.out.println("f(x) => "+r);

  }
}
