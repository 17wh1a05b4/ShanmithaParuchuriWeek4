package Epam;

//declaring public class
public class costCalc {
    private int option;
    private int area;
    public costCalc(int option, int area) {
    	//"this" keyword to differentiate variables
        this.option = option;
        this.area = area;
    }
    //
    public int cost(int option) {
    	//if-else
        if(option == 1) {
            return 1200;
        } else if(option == 2) {
            return 1500;
        } else if(option == 3) {
            return 1800;
        } else {
            System.out.format("Invalid Choice!\n");
            return 0;
        }
    }
    public void finalPrice()
    {
        double tPrice= this.area * cost(this.option);
        System.out.format("Price for Construction: " + tPrice);
    }
}