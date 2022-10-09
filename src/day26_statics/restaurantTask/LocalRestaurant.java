package day26_statics.restaurantTask;

import java.time.LocalDate;

public class LocalRestaurant {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Mahdi", "Mclean", 4);
        Server[] servers = {
                new Server("Yasin", 29, 15, false, LocalDate.of(2021, 3, 4)),
                new Server("Sabryne", 28, 10, false, LocalDate.of(2021, 3, 4)),
                new Server("Karim", 27, 12, false, LocalDate.of(2021, 3, 4)),
                new Server("Aysel", 26, 20, true, LocalDate.of(2021, 3, 4)),
                new Server("Kamal", 25, 23, true, LocalDate.of(2021, 3, 4)),
        };

        Chef[] chefs = {
                new Chef("Halim", 23, 35, true),
                new Chef("Habib", 22, 26, false),
                new Chef("Bojan", 21, 27, true),
        };

        restaurant.hireServer(servers);
        restaurant.hireChef(chefs);

        System.out.println(restaurant);

    }
}

/*	4.4. Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set.
	        	Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set.
	             Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information
	            */