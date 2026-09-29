import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\"WAKE UP, WE ARE UNDER ATTACK!\" \nYou sit up in your  quarters and see the wall is completely destroyed and half of the platoon is dead. you look up to see your men has been desimated by cannon fire.");
        
        System.out.println("What do you do:\n [1] get ready for battle. \n [2] Go back to bed.");
        int choice = scanner.nextInt();

        if(choice == 2){
            System.out.println(" You die from a boulder shot from a Trebuchet landing directly on your bed\n  ██████╗  █████╗ ███╗   ███╗███████╗     ██████╗ ██╗   ██╗███████╗██████╗ \n" + //
                                " ██╔════╝ ██╔══██╗████╗ ████║██╔════╝    ██╔═══██╗██║   ██║██╔════╝██╔══██╗\n" + //
                                " ██║  ███╗███████║██╔████╔██║█████╗      ██║   ██║██║   ██║█████╗  ██████╔╝\n" + //
                                " ██║   ██║██╔══██║██║╚▀▀╔╝██║██╔══╝      ██║   ██║╚██╗ ██╔╝██╔══╝  ██╔══██╗\n" + //
                                " ╚██████╔╝██║  ██║██║    ██║███████╗    ╚██████╔╝ ╚████╔╝ ███████╗██║  ██║\n" + //
                                "  ╚═════╝ ╚═╝  ╚═╝╚═╝    ╚═╝╚══════╝     ╚═════╝   ╚═══╝  ╚══════╝╚═╝  ╚═╝");
        }else{
            System.out.println("You get up and get ready for battle.");
        }

        System.out.println("As you get out of bed a boulder flung from a trubecet smashed through the wall crushing your bed where you just were and flinging you conviently near your equipment chest.");
        System.out.println("You grab your dual blades and run through the giant hole in the wall where your bed used to be, towards the fighting.");

        System.out.println("you see a archer taking aim at your new recruits.\nWhat do you do?\n[1] Yell to distract the archer.\n[2] Sneak up behind the archer.");
        int choice2 = scanner.nextInt();

        if(choice2 == 1){
            System.out.println("you yell at the archer and he turns and fires at you, you dodge by rolling to your side and run towards the archer and in one swift motion you disarm him with your left blade and put your right blade to his neck.");
        }else{
            System.out.println("you sneak up behind the archer stick your left blade in his back and place your right blade on his neck.");
        }

        System.out.println("\n\"Who are you and why are you doing this?\" you ask.\n\"I am a soldier of the king\" that is when you notice the archer is wearing the same crest you swore to protect since you joined the kinds gaurd.\"");

    }

}