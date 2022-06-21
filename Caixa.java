public class Caixa<T> {
    T objeto;

    public Caixa() {
    }

    public void guardar(T obj) {
        if (this.objeto == null ) {
            this.objeto = obj;
            System.out.println("Objeto adicionado do tipo: " + obj + " / " + this.objeto.getClass().getTypeName());
        } else {
            System.out.println("Já existe objeto na caixa");
        }
    }

    public void retirar(T obj) {
        if (this.objeto != null) {
            this.objeto = null;
            System.out.println("Objeto removido do tipo: " + obj + " / " + obj.getClass().getName() );
        }
    }

}