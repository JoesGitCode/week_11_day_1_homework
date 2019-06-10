public class Printer {

    private int sheetsOfPaper;
    private int toner;

    public Printer(int sheetsOfPaper, int toner){
        this.sheetsOfPaper = sheetsOfPaper;
        this.toner = toner;
    }

    public String print(int numberOfPages, int numberOfCopies){
        int total = numberOfPages * numberOfCopies;
        if (this.sheetsOfPaper >= total){
          int paperRemaining = this.sheetsOfPaper -= total;
          int tonerRemaining = this.toner -= total;
          return "You have " + paperRemaining + " paper remaining and " + tonerRemaining + " toner remaining";
        } else {
           return "Not enough paper!";
        }
    }
}


//    Create a Printer class that has a property for number of sheets of paper left.
//        Add a method to print that takes in a number of pages and number of copies.
//        The print method will only run if the printer has enough paper. If it runs it will reduce the value of the paper left by number of copies * number of pages.
//        Add a toner volume property to the class.
//        Modify the printer so that it reduces the toner by 1 for each page printed.