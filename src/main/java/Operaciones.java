
public class Operaciones<T>{

    public Operaciones() {
    }

    public static  <T extends Comparable<T>> T Array(T[] array) throws ArrayIndexOutOfBoundsException {
        if (array.length <= 0) {
            throw new ArrayIndexOutOfBoundsException("El array esta vacio!");
        }

        T agencia = array[0];

        return agencia;
    }



}