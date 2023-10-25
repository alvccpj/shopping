import java.util.ArrayList;
import java.util.List;

public class Compras {
    private double limite;
    private double saldo;
    private List<Compras> compras;

    public Compras(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }


}
