package src.carShop;

public interface Describable {

      default String describe(String details) {
          return details;
    }


}
