Design and develop a context for given case study and implement an interface for Vehicles 
Consider the example of vehicles like bicycle, car and bike. All Vehicles have common 
functionalities such as Gear Change, Speed up and apply breaks. Make an interface and put all 
these common functionalities. Bicycle, Bike, Car classes should be implemented for all these 
functionalities in their own class in their own way.


package Interface;

import java.util.Scanner;

interface Vehicle {
    void changeGear(int newGear);
    void speedUp(int increment);
    void applyBrakes(int decrement);
    void displayStatus();
    void updateGear();
}
class Bicycle implements Vehicle {
    int speed;
    int gear;
    static final int MAX_SPEED = 50;

    public Bicycle(int speed, int gear) {
        this.speed = Math.min(speed, MAX_SPEED);
        this.gear = gear;
        updateGear();
    }

public void changeGear(int newGear) {
        if (newGear >= 1 && newGear <= 5) {
            if (newGear > gear) {
                System.out.println("Increasing gear and increasing speed");
                speed += 10 * (newGear - gear);
            } else if (newGear < gear) {
                System.out.println("Decreasing gear and decreasing speed");
                speed -= 10 * (gear - newGear);
                if (speed < 0) {
                    speed = 0;
                }
            }
            gear = newGear;
            System.out.println("Speed adjusted to " + speed + " km/h based on gear change.");
        } else {
            System.out.println("Invalid gear. Please select a gear between 1 and 5.");
        }
    }

public void speedUp(int increment) {
        if (speed + increment > MAX_SPEED) {
            speed = MAX_SPEED;
            System.out.println("Speed limit reached for Bicycle. Setting speed to " + MAX_SPEED + " km/h.");
        } else {
            speed += increment;
        }
        updateGear();
    }
 public void applyBrakes(int decrement) {
        if (speed == 0) {
            System.out.println("The Bicycle is already at rest.");
        } else {
            speed -= decrement;
            if (speed < 0) {
                speed = 0;
            }
        }
        updateGear();
    }
public void displayStatus() {
        System.out.println("Bicycle -> Speed: " + speed + " km/h, Gear: " + gear);
    }
public void updateGear() {
    	if(speed==0) {
    		gear=0;
    	}else if (speed <= 10) {
            gear = 1;
        } else if (speed <= 20) {
            gear = 2;
        } else if (speed <= 30) {
            gear = 3;
        } else if (speed <= 40) {
            gear = 4;
        } else {
            gear = 5;
        }
        System.out.println(" Gear set to " + gear);
    }
}

class Bike implements Vehicle {
    private int speed;
    private int gear;
    private static final int MAX_SPEED = 100;

public Bike(int speed, int gear) {
        this.speed = Math.min(speed, MAX_SPEED);
        this.gear = gear;
        updateGear(); 
    }
public void changeGear(int newGear) {
        if (newGear >= 1 && newGear <= 5) {
            if (newGear > gear) {
                System.out.println("Increasing gear and increasing speed");
                speed += 20 * (newGear - gear);
            } else if (newGear < gear) {
                System.out.println("Decreasing gear and decreasing speed");
                speed -= 20 * (gear - newGear);
                if (speed < 0) {
                    speed = 0;
                }
            }
            gear = newGear;
            System.out.println("Speed adjusted to " + speed + " km/h based on gear change.");
        } else {
            System.out.println("Invalid gear. Please select a gear between 1 and 5.");
        }
    }
public void speedUp(int increment) {
        if (speed + increment > MAX_SPEED) {
            speed = MAX_SPEED;
            System.out.println("Speed limit reached for Bike. Setting speed to " + MAX_SPEED + " km/h.");
        } else {
            speed += increment;
        }
        updateGear(); 
    }

public void applyBrakes(int decrement) {
        if (speed == 0) {
            System.out.println("The Bike is already at rest.");
        } else {
            speed -= decrement;
            if (speed < 0) {
                speed = 0;
            }
        }
        updateGear();
    }
 public void displayStatus() {
        System.out.println("Bike -> Speed: " + speed + " km/h, Gear: " + gear);
    }

public void updateGear() {
        if (speed <= 20) {
            gear = 1;
        } else if (speed <= 40) {
            gear = 2;
        } else if (speed <= 60) {
            gear = 3;
        } else if (speed <= 80) {
            gear = 4;
        } else {
            gear = 5;
        }
        System.out.println(" Gear set to " + gear);
    }
}

class Car implements Vehicle {
    private int speed;
    private int gear;
    private static final int MAX_SPEED = 200;

    public Car(int speed, int gear) {
        this.speed = Math.min(speed, MAX_SPEED);
        this.gear = gear;
        updateGear(); 
    }
public void changeGear(int newGear) {
        if (newGear >= 1 && newGear <= 5) {
            if (newGear > gear) {
                System.out.println("Increasing gear and increasing speed");
                speed += 40 * (newGear - gear);
            } else if (newGear < gear) {
                System.out.println("Decreasing gear and decreasing speed");
                speed -= 40 * (gear - newGear);
                if (speed < 0) {
                    speed = 0;
                }
            }
            gear = newGear;
            System.out.println("Speed adjusted to " + speed + " km/h based on gear change.");
        } else {
            System.out.println("Invalid gear. Please select a gear between 1 and 5.");
        }
    }
public void speedUp(int increment) {
        if (speed + increment > MAX_SPEED) {
            speed = MAX_SPEED;
            System.out.println("Speed limit reached for Car. Setting speed to " + MAX_SPEED + " km/h.");
        } else {
            speed += increment;
        }
        updateGear(); 
    }
public void applyBrakes(int decrement) {
        if (speed == 0) {
            System.out.println("The Car is already at rest.");
        } else {
            speed -= decrement;
            if (speed < 0) {
                speed = 0;
            }
        }
        updateGear();
    }
public void displayStatus() {
        System.out.println("Car -> Speed: " + speed + " km/h, Gear: " + gear);
    }
public void updateGear() {
        if (speed <= 40) {
            gear = 1;
        } else if (speed <= 80) {
            gear = 2;
        } else if (speed <= 120) {
            gear = 3;
        } else if (speed <= 160) {
            gear = 4;
        } else {
            gear = 5;
        }
        System.out.println(" Gear set to " + gear);
    }
}

public class Interface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle vehicle = null;

        System.out.println("Choose a vehicle: 1. Bicycle 2. Bike 3. Car");
        int choice = scanner.nextInt();

        System.out.print("Enter current speed: ");
        int speed = scanner.nextInt();
        System.out.print("Enter current gear: ");
        int gear = scanner.nextInt();

        switch (choice) {
            case 1:
                vehicle = new Bicycle(speed, gear);
                break;
            case 2:
                vehicle = new Bike(speed, gear);
                break;
            case 3:
                vehicle = new Car(speed, gear);
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(0);
        }

        while (true) {
            System.out.println("Choose an action: 1. Speed Up 2. Change Gear 3. Apply Brakes 4. Display Status 5. Exit");
            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    System.out.print("Enter speed increment: ");
                    int increment = scanner.nextInt();
                    vehicle.speedUp(increment);
                    break;
                case 2:
                    System.out.print("Enter new gear: ");
                    int newGear = scanner.nextInt();
                    vehicle.changeGear(newGear);
                    break;
                case 3:
                    System.out.print("Enter speed decrement: ");
                    int decrement = scanner.nextInt();
                    vehicle.applyBrakes(decrement);
                    break;
                case 4:
                    vehicle.displayStatus();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid action.");
                    break;
            }
        }
    }
}
