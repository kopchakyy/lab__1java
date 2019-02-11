public class main {
    public static void main (String args[]) {

        Puzzle bikeVM = new Puzzle();
        Puzzle Sphericalcube = new Puzzle(30, 10000, 5, "woode", "plywood board");
        Puzzle Postaldealings = new Puzzle(50, 20000, 10,"woode", "plywood board");

        System.out.println(bikeVM.toString());
        System.out.println(Sphericalcube.toString());
        System.out.println(Postaldealings .toString());

        bikeVM.resetValues(70, 15000, 5, "woode", "plywood board");

        bikeVM.printSum();
        Sphericalcube.printSum();
        Postaldealings.printSum();

        Sphericalcube.setVolum(23000);

        Puzzle.printStaticSum();
    }
}

