package configuration_via_reflection;

/**
 * @author Alpi
 * @since 13.11.16
 */
public interface Service {
  default void serve() {
    System.out.println("Base serve()");
  }
}
