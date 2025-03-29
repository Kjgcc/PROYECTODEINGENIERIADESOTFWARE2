package co.edu.poli.modelo;

public class Proveedor {
    private String nombre;
    private String direccion;

    private Proveedor(ProveedorBuilder builder) {
        this.nombre = builder.nombre;
        this.direccion = builder.direccion;
    }

    public static class ProveedorBuilder {
        private String nombre;
        private String direccion;

        public ProveedorBuilder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public ProveedorBuilder setDireccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public Proveedor build() {
            return new Proveedor(this);
        }
    }
}
