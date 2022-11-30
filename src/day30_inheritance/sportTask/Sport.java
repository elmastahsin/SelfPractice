package day30_inheritance.sportTask;

public class Sport {
    private String name, rules;
    private int numberOfPlayers;
    private int numberOfReferre;

    public Sport(String name, String rules, int numberOfPlayers, int numberOfReferre) {
        setName(name);
        setRules(rules);
        setNumberOfPlayers(numberOfPlayers);
        setNumberOfReferre(numberOfReferre);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public int getNumberOfPlayer() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {//	1. numberOfPlayers can not be set to zero or negative
        if (numberOfPlayers <= 0) {
            System.err.println("Invalid number for players " + numberOfPlayers);
            System.exit(1);
        }
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumberOfReferre() {
        return numberOfReferre;
    }

    public void setNumberOfReferre(int numberOfReferre) {//	2. numberOfReferre can not be set to zero or negative

        if (numberOfReferre <= 0) {
            System.err.println("Invalid number for referees " + numberOfReferre);
            System.exit(1);
        }
        this.numberOfReferre = numberOfReferre;
    }

    public void play() {
        System.out.println("Everyone is playing " + name);
    }

    @Override
    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", rules='" + rules + '\'' +
                ", numberOfPlayer=" + numberOfPlayers +
                ", numberOfReferre=" + numberOfReferre +
                '}';
    }
}
/*sportTask:
	1. Create a class named Sport
			variables:
				name, numberOfPlayers, numberOfReferre, rules

			Encapsulate all the fields
					Conditions:
						1. numberOfPlayers can not be set to zero or negative
						2. numberOfReferre can not be set to zero or negative

			Add a constructor that can set all the fields

			methods:
				play()
				toString()

		2. create the following sub classes of Sport:
				1. Basketball
				2. Baseball
				3. Football
				4. AmericanFootball

			Add any missing variables or methods

			Note: you can search them on google


planetTask:
	1. create a class called Planet
			variables:
					name, mass, radius, surfaceGravity, surfaceArea, volume, population

			Encapsulate all the fields

			Add a constructor that can set all the fields

			methods:
				toString()

	2. create the following subclasses of Planet
			1. Earth
			2. Moon
			3. Mercury
			4. Venus

			Note: you can search them on google
*/
