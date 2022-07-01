package com.palyground.java17;

/**
 * Thus, the main motivation behind sealed classes is to have the possibility
 * for a superclass to be widely accessible but not widely extensible.
 * 
 * @author Amrut
 *
 */
public class SealedClass {

}

sealed class Vehicle permits PetrolVehicle,DieselVehicle{
	/**
	 * Allows to be extended only for two classes and also they have to be marked final
	 */
}

final class PetrolVehicle extends  Vehicle{//final is mandatory
	
}

final  class DieselVehicle extends Vehicle{
	
}
