public enum Categoria {
    BRONCE(0.05),
    PLATA(0.10),
    ORO(0.15);

    private double porcentajeDescuento;

    Categoria(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }
}
