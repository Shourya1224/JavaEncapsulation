public class Temperature {
    
    private double celsius;

    
    public Temperature(double celsius) {
        this.celsius = celsius;
    }

  
    public double getFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }


    public double getCelsius() {
        return celsius;
    }
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
}
    

