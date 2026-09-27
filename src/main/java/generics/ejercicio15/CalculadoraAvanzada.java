package generics.ejercicio15;

public class CalculadoraAvanzada<T extends Number & Comparable<T>> {

    public double sumar(T a, T b) {

        return a.doubleValue() + b.doubleValue();
    }

    public double restar(T a, T b) {

        return a.doubleValue() - b.doubleValue();
    }

    public T maximo(T a, T b) {

        if (a.compareTo(b) > 0) {
            return a;
        }

        return b;
    }

    public T minimo(T a, T b) {

        if (a.compareTo(b) < 0) {
            return a;
        }

        return b;
    }
}