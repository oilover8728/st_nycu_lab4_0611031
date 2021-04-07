import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    //case 1
    @Test
    void test_All_Win() throws InterruptedException {
        Game game = new Game();
        String input1,input2;
        //test1
        input1="rock";
        input2="scissors";
        assertEquals(game.WinOrLoss(input1,input2),"Player1 Win!");
        //test2
        input1="paper";
        input2="rock";
        assertEquals(game.WinOrLoss(input1,input2),"Player1 Win!");
        //test3
        input1="scissors";
        input2="paper";
        assertEquals(game.WinOrLoss(input1,input2),"Player1 Win!");
    }
    //case 2
    @Test
    void test_All_Loss() throws InterruptedException {
        Game game = new Game();
        String input1,input2;
        //test1
        input2="rock";
        input1="scissors";
        assertEquals(game.WinOrLoss(input1,input2),"Player2 Win!");
        //test2
        input2="paper";
        input1="rock";
        assertEquals(game.WinOrLoss(input1,input2),"Player2 Win!");
        //test3
        input2="scissors";
        input1="paper";
        assertEquals(game.WinOrLoss(input1,input2),"Player2 Win!");
    }
    //case3
    @Test
    void test_All_Draw() throws InterruptedException {
        Game game = new Game();
        String input1,input2;
        //test1
        input2="rock";
        input1="rock";
        assertEquals(game.WinOrLoss(input1,input2),"Draw!");
        //test2
        input2="paper";
        input1="paper";
        assertEquals(game.WinOrLoss(input1,input2),"Draw!");
        //test3
        input2="scissors";
        input1="scissors";
        assertEquals(game.WinOrLoss(input1,input2),"Draw!");
    }
    //case4
    @Test
    public void Invalid_input1_thenAssertionSucceeds(){
        assertThrows(IllegalArgumentException.class, () ->{
            Game game=new Game();
            String input="peko";
            game.Invalid_validation(input);
        });
    }
    //case5
    @Test
    public void Invalid_input2_thenAssertionSucceeds(){
        assertThrows(IllegalArgumentException.class, () ->{
            Game game=new Game();
            String input="1";
            game.Invalid_validation(input);
        });
    }
    //case6
    @Test
    public void Invalid_input3_thenAssertionSucceeds(){
        assertThrows(IllegalArgumentException.class, () ->{
            Game game=new Game();
            String input="rocks";
            game.Invalid_validation(input);
        });
    }
    //case7
    @Test
    public void Valid_input_thenAssertionSucceeds(){
        Game game=new Game();
        String string_valid="rock";
        assertDoesNotThrow(()->{game.Invalid_validation(string_valid);});
    }
}