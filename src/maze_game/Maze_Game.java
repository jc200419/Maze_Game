package maze_game;
//CheckList -
//1. Create the Maze through a random algorithem

import javax.imageio.ImageIO;

//2. Make a character that can move within the map
//3. figure out a start and end to the map
//4. create monsters and chests 
//5. crate a way for the monsters to move around randomly 
//6. add a health bar and time limit 
//7. add a pause menu and main menu 
//8. make 3 difficulties (blocked vision) 
//9. create 5 levels all with different atmospheres 
//10. add sound and touch up any code. 
public class Maze_Game {

    
    public static void main(String[] args) {
        openMainMenu();
    }
    public static void openMainMenu(){
        MainMenu menu = new MainMenu();
        try{
            menu.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("put code in here")))));
        }catch (Exception e){
            System.out.println("error");
        }menu.setVisible(true);
        
    }
    
        
}
