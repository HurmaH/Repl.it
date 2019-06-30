package _226_OOP_19_TableGenerator2;

/**
 * When we say Prime, that meaning can be used
 * in different ways, thus it is an interface,
 * part of abstraction in Java.
 * There is multiple ways if some number is
 * prime, so any class that implements Primes
 * will provide implementation for the isPrime abstract
 * method
 */
public interface Primes {

    public abstract boolean isPrime(int n);
}
