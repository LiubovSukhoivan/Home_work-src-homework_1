package sample;

    public class View {
        public static final String INPUT_INT_DATA = "Input INT value = ";
        public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
        public static final String OUR_INT = "INT value = ";

        public void printMessage(String message){
            System.out.println(message);
        }

        public void printMessageAndInt(String message, int value){
            System.out.println(message + value);
        }
    }
