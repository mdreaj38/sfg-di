package com.springframework.pets;

/**
 * @author rejaul.reaj
 * @since 11/18/21
 */
public class PetServicesFactory {

    public PetService getPetService(String option) {
        switch (option) {
            case "cat":
                return new CatPetService();
            case "dog":
                return new DogPetService();
            default:
                return new DogPetService();
        }
    }
}