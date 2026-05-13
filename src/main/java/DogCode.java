public class DogCode {

    public String getCode(String breed) {

        switch (breed.toLowerCase()) {

            case "labrador":
                return "SK01";

            case "bulldog":
                return "SK02";

            case "poodle":
                return "SK03";

            case "beagle":
                return "SK04";

            case "rottweiler":
                return "SK05";

            case "german shepherd":
                return "SK06";

            case "husky":
                return "SK07";

            case "dalmatian":
                return "SK08";

            default:
                return "UNKNOWN";
        }
    }

    public String getBreed(String code) {

        switch (code.toUpperCase()) {

            case "SK01":
                return "Labrador";

            case "SK02":
                return "Bulldog";

            case "SK03":
                return "Poodle";

            case "SK04":
                return "Beagle";

            case "SK05":
                return "Rottweiler";

            case "SK06":
                return "German Shepherd";

            case "SK07":
                return "Husky";

            case "SK08":
                return "Dalmatian";

            default:
                return "UNKNOWN";
        }
    }
}