package Observer;

// This declares the interface 'Observer'. Interface classes cannot be instantiated but 
// can be implemented by other classes or extended by other interfaces.
public interface Observer {

    // This declares the method 'update' and the keyword 'void' meaning this
    // method has no return value, whilst also declaring 3 'double'
    // variables 'nvidiageforcertx3090Price', 'nvidiageforcertx4080Price' and
    // 'nvidiageforcertx4090Price'.
    public void update(double nvidiageforcertx3090mPrice, double nvidiageforcertx4080Price,
            double nvidiageforcertx4090Price);

}