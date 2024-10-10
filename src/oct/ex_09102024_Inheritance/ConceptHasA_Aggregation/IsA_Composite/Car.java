package oct.ex_09102024_Inheritance.ConceptHasA_Aggregation.IsA_Composite;

public class Car {
    // Car Has-A Engine, Tyre
    protected void startCar() {
        new Engine().start();
        new Tyre().rolling();
    }
}
