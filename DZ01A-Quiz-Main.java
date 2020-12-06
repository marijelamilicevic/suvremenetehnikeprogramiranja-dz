package hr.unipu.java; //Jedinstveno ime paketa

/** Main klasa sluzi za pokretanje samog programa
 * @author Milicevic Marijela
 */

public class Main {
    //main je ulazak u svaki program koji je komandno linijski i ona se tako mora zvati
        public static void main (String[]args) {
            //sluzi za kreniranje question objekta i reference zapisivanja u varijablu

            ShortAnswerQuestion question = new ShortAnswerQuestion (

                    /** za question objekt unose se vrijednosti za sami tekst i correctAnswer
                     * @author Milicevic Marijela
                     */

                    "U kojem jeziku se programira za Android?", "Java");

            System.out.print ( question.getText() ); //ovo je poziv getText metode nad objektom

            System.out.println("C:" + question.isCorrectAnswer("C"));  //ovo je poziv isCorrectAnswer metode nad question objektom
            System.out.println("java: " + question.isCorrectAnswer("Java")); //ovo je poziv isCorrectAnswer metode nad question objektom
        }
}

/** ShortAnswerQuestion je klasa koja se sastoji od atributa text i correctAnswer
 * @author Milicevic Marijela
 */

class ShortAnswerQuestion {
    private String text;
    private String correctAnswer;
    public ShortAnswerQuestion (String text, String correctAnswer) //ovo je objektni konstruktor

    { this.text = text;
    this.correctAnswer = correctAnswer;
    }

    /** ShortAnswerQuestion klasa ima javne metode poput getText i isCorrectAnswer te njihova vrijednost ovisi o stanju koje je trenutno
     * @author Milicevic Marijela
     */

    //ovdje se vidi kreiranje metode getText() i isCorrectAnswer kao (String answer)

    public  String getText() {
        return text;                //vraca text
    }

    public boolean isCorrectAnswer(String answer) {
        return correctAnswer.equalsIgnoreCase(answer);      //vraca false ili true
    }

    }
}

// Domaca zadaca 1.B
// Marijela Milicevic
// FIPU - nastavni smjer
