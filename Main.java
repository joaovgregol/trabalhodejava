class Main {
    public static void main(String[] args) {
        Caixa<String> caixaS = new Caixa<>();
        caixaS.guardar("Livro");
        caixaS.guardar("Livro");
        caixaS.retirar("Livro");

        Caixa<Integer> caixaI = new Caixa<>();
        caixaI.guardar(666);
        caixaI.retirar(666);

        Caixa<Number> caixaN = new Caixa<>();
        caixaN.guardar(777);
        caixaN.retirar(777);

    }
}
