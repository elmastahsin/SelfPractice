package day26_statics.restaurantTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String owner;
    public String location;
    public int numberOfStars;
    public ArrayList<Server> servers;
    public ArrayList<Chef> chefs;

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
        servers = new ArrayList<>();
        chefs = new ArrayList<>();
    }

    public void hireServer(Server server) {
        servers.add(server);
    }

    public void hireServer(Server[] server) {
        this.servers.addAll(Arrays.asList(server));
    }

    public void hireChef(Chef chef) {
        chefs.add(chef);
    }

    public void hireChef(Chef[] chef) {
        this.chefs.addAll(Arrays.asList(chef));
    }

    public void terminateChef(int employeeID) {
        chefs.removeIf(p -> p.employeeID == employeeID);
    }

    public void terminateServer(int employeeID) {
        servers.removeIf(p -> p.employeeID == employeeID);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ",number of servers=" + servers.size()+
                ", number of chefs=" + chefs.size() +
                '}';
    }
}
/*	4.3 Create a class called Restaurant

	            Attributes:
	                Owner (String), Location (String), numberOfStars (int)
	                Servers (ArrayList of Server objects)
	                Chefs (ArrayList of Chef objects)

                Add a constructor that sets the owner, location, and number of stars.

	            Actions: (all void methods)

	                hireServer(Server server): accepts a server object and adds it to the Servers ArrayList
	                hireServer(Server [] servers): accepts an array of Server objects and adds all of them
	                 to the Servers ArrayList

	                hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList

	                hireChef(Chef [] chefs): accepts an array of Chef objects and adds all of them to the
	                Chef ArrayList

	                terminateChef(int employeeID): removes the chef with the matching ID from the arraylist
	                 of chef

	                terminateServer(int employeeID) removes the server with the matching ID from the arraylist

	                 of server

	                toString(): Return (String) of all the information of a Restaurant object. No need to
	                print the whole list of Servers or Chefs. Print the number of Servers and Chefs
	                along side the other information
*/
