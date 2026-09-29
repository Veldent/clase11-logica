import java.util.Scanner;

public class rendimiento {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el nombre del producto: ");
        String producto = teclado.nextLine();

        System.out.print("Ingrese el precio: ");
        double precio = teclado.nextDouble();

        // Variables
        double descuento;
        double iva = 19;

        // Condicional múltiple
        if (precio >= 500000) {
            descuento = 20;
        } else if (precio >= 300000) {
            descuento = 15;
        } else if (precio >= 100000) {
            descuento = 10;
        } else {
            descuento = 0;
        }

        // Cálculos
        double valorDescuento = precio * descuento / 100;
        double subtotal = precio - valorDescuento;
        double valorIVA = subtotal * iva / 100;
        double total = subtotal + valorIVA;

        // Salida
        System.out.println("\n========== RESUMEN DE COMPRA ==========\n");
        System.out.println("Producto: " + producto);
        System.out.println("Precio: $" + precio);
        System.out.println("Descuento aplicado: " + descuento + "%");
        System.out.println("Valor descuento: $" + valorDescuento);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("IVA: $" + valorIVA);
        System.out.println("TOTAL: $" + total);

        teclado.close();
    }
}