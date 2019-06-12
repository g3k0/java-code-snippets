public class ApplicationPolymorphism {

    public static void main(String[] args) {
        Plant plant1 = new Plant();
        Tree tree = new Tree();

        // 2 references to the same object
        Plant plant2 = tree; // tree is a plant

        plant2.grow(); // pointing to tree

        tree.shedLeaves();

        // plant 2 has not shedLeaves because is not in plant
        // plant2.shedLeaves

        doGrow(tree); // I can pass the child class
    }

    public static void doGrow(Plant plant) {
        plant.grow();
    }
}
