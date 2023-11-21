public class Principal {
    String nombre;
    String descripción;
    double precio;
    int cantidad;
    public void Producto(String nombre, String descripción, double precio, int cantidad){
        this.nombre = nombre;
        this.descripción = descripción;
        this.precio = precio;
        this.cantidad = cantidad;

    }
    @Override
    public String toString(){
        return  String.format("%s - %s - Precio: $%.2f - Inventario: %d", nombre, descripción, precio, cantidad);

    }

}
