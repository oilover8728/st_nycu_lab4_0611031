public class Game {
    public String WinOrLoss(String input1,String input2){
        if(input1.equals(input2)) {
            return ("Draw!");
        }
        else if((input1.equals("rock")&&input2.equals("scissors"))||(input1.equals("paper")&&input2.equals("rock"))||(input1.equals("scissors")&&input2.equals("paper"))){
            return ("Player1 Win!");
        }
        else{
            return ("Player2 Win!");
        }

    }
    public void Invalid_validation(String user_input){
        if(user_input.equals("rock")){

        }
        else if(user_input.equals("paper")){

        }
        else if(user_input.equals("scissors")){

        }
        else{
            throw new IllegalArgumentException("Invalid input");
        }
    }
}
