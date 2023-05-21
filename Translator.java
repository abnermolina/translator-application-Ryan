// PROGRAMMERS: Abner Molina and Ryan Barrios

public class Translator
{
    public static String translateWord(String word) {
        String translation;
        switch (word) {
            case "Hello":
                translation = "Hola";
                break;
            case "Yes":
                translation = "Sí";
                break;
            case "No":
                translation = "No";
                break;
            case "Please":
                translation = "Por favor";
                break;
            case "Airport":
                translation = "Aeropuerto";
                break;
            case "Taxi":
                translation = "Taxi";
                break;
            case "One":
                translation = "Uno";
                break;
            case "Two":
                translation = "Dos";
                break;
            case "Three":
                translation = "Tres";
                break;
            case "Four":
                translation = "Cuatro";
                break;
            case "Five":
                translation = "Cinco";
                break;
            case "Six":
                translation = "Seis";
                break;
            case "Seven":
                translation = "Siete";
                break;
            case "Eight":
                translation = "Ocho";
                break;
            case "Nine":
                translation = "Nueve";
                break;
            case "Ten":
                translation = "Diez";
                break;
            case "Goodbye":
                translation = "Adios";
                break;
            case "Food":
                translation = "Comida";
                break;
            case "Hotel":
                translation = "Hotel";
                break;
            case "Shopping":
                translation = "Compras";
                break;
            case "Bus":
                translation = "Bus";
                break;
            case "Doctor":
                translation = "Doctor";
                break;
            case "Police":
                translation = "Policia";
                break;
            case "Careful":
                translation = "Cuidado";
                break;
            case "Visit":
                translation = "Visita";
                break;
            case "Today":
                translation = "Hoy";
                break;
            case "Tomorrow":
                translation = "Mañana";
                break;
            case "Yesterday":
                translation = "Ayer";
                break;
            default:
                translation = "Translation not available";
                break;
        }
        return translation;
    }

    public static String translatePhrase(String phrase) {
        String translation;
        if (phrase.equals("Where is the bathroom")) {
            translation = "¿Dónde está el baño?";
        } else if (phrase.equals("Table for 2")) {
            translation = "Mesa para dos";
        } else if (phrase.equals("Thank you")) {
            translation = "Gracias";
        } else if (phrase.equals("Your welcome")) {
            translation = "De nada";
        } else if (phrase.equals("Can you take a photo of us")) {
            translation = "¿Puedes sacarnos una foto?";
        } else if (phrase.equals("Let's go")) {
            translation = "¿Nos vamos?";
        } else if (phrase.equals("What do you want to eat")) {
            translation = "¿Que quieres comer?";
        } else if (phrase.equals("What is the internet's password")) {
            translation = "¿Cual es la contraseña del internet?";
        } else if (phrase.equals("I'll see you there")) {
            translation = "Te veo alla";
        } else if (phrase.equals("I love you")) {
            translation = "Te amo";
        } else if (phrase.equals("How is the weather")) {
            translation = "¿Como esta el clima hoy?";
        } else if (phrase.equals("What's new")) {
            translation = "¿Que hay de nuevo?";
        } else if (phrase.equals("We had a good time")) {
            translation = "La pasamos bien";
        } else if (phrase.equals("Please help us")) {
            translation = "Ayudanos porfavor";
        } else if (phrase.equals("Where is the closest restaurant")) {
            translation = "¿Donde esta el restaurante mas cercano?";
        } else {
            translation = "Translation not available";
        }
        return translation;
    }
}
