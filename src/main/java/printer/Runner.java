package printer;

public class Runner {
    public static void main(String[] args) {
        Printer printer = new Printer(100,200);
        System.out.println(printer.getPapersLeft());
        // print 3 ages and 2 copies
        System.out.println(printer.print(22,4));
        // if requires more than
        System.out.println(printer.print(22,5));

        System.out.println("after print Toner volume "+printer.getToner());
    }
}



//    Create a Printer class that has a property for number of sheets of paper left.
//        Add a method to print that takes in a number of pages and number of copies.
//        The print method will only run if the printer has enough paper. If it runs it will reduce the value of the paper left by number of copies * number of pages.
//        Add a toner volume property to the class.
//        Modify the printer so that it reduces the toner by 1 for each page printed.