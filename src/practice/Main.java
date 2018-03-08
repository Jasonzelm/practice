
package practice;

class Main{

    public static void main(String[] args){
//        Hamburger hamburger = new Hamburger("Basic" , "Sausage", 3.56, "White");
//        hamburger.itemizeHamburger();
//        hamburger.addHamburgerAddition1("Lettuce", 0.27);
//        hamburger.addHamburgerAddition2("Tonmato", 0.43);
//        hamburger.addHamburgerAddition3("Cheese", 1.12);
//        System.out.println("Total burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyburger = new HealthyBurger("Bacon", 5.67);
        healthyburger.addHealthAddition1("Lentils", 0.50 );
        System.out.println("Total Healthy Burger price is " + healthyburger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.itemizeHamburger();
        db.addHamburgerAddition1("lettuce", 1.50);
        System.out.println("Your total Deluxe Burger price is " + db.itemizeHamburger()) ;
    }
}