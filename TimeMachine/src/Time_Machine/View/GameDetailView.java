/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.View;

import Time_Machine.Model.Player;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Group 7
 */
public class GameDetailView {
    
    private static void pause() {
        System.out.println("\n\n\t****  Press enter to continue... ****");
        Scanner key = new Scanner(System.in);
        key.nextLine();
    }
    
    
    
    public static String displayGameBanner(){
        String banner = 
            "\t████████╗██╗███╗     ███╗███████╗     ███╗   ███╗ █████╗  ██████╗██╗   ██╗██╗███╗     ██╗███████╗\n"+
            "\t╚══██╔══╝██║████╗  ████║██╔════╝    ████╗ ████║██╔══██╗██╔═══╝██║  ██║██║████╗    ██║██╔════╝\n" +
            "\t     ██║     ██║██╔████╔██║█████╗       ██╔████╔██║███████║██║     ███████║██║██╔██╗  ██║█████╗  \n" +
            "\t     ██║     ██║██║╚██╔╝██║██╔══╝       ██║╚██╔╝██║██╔══██║██║     ██╔══██║██║██║╚██╗██║██╔══╝  \n"+ 
            "\t     ██║     ██║██║ ╚═╝  ██║███████╗    ██║ ╚═╝  ██║██║  ██║╚██████╗██║  ██║██║██║ ╚████║███████╗\n" +
            "\t     ╚═╝     ╚═╝╚═╝       ╚═╝╚══════╝     ╚═╝        ╚═╝╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝╚═╝╚═╝   ╚═══╝╚══════╝ \n" +
            "\n\t\t\t\t\t\t\t AN ADVENTURE IN TIME"+
        GameDetailView.displayTitleDetail() +
        "\nWelcome to a new adventure!" +
                "\n*******************************************************"
              + "\n*                                                     *"
              + "\n*           This is the Time Machine Game!            *"
              + "\n*                                                     *"
              + "\n* In this game you will travel twenty years to the    *"
              + "\n* past with your friend John. Your purpose is to      *"
              + "\n* fix the time machine collecting elements in the     *"
              + "\n* city and then travel to the future.                 *"
              + "\n* Remeber to be careful talking with people in the    *"
              + "\n* city. Any interference in the past can change your  *"
              + "\n* future!                                             *"
              + "\n*      Good luck and have fun in this adventure!      *"
              + "\n*******************************************************";
        return banner;
    }
    public static String displayTitleDetail (){
        String detail = 
            "\t\t\t\t ___    _          ___               ___                 ___            \n" +
            "\t\t\t\t|===|  (_)   __   |===|        __   |===|        __     |===|           __   \n" +
            "\t\t\t\t|= =|__    _|==|_ |= =|__    _|==|_ |= =|__    _|==|_   |= =|__       _|==|_ \n" +
            "\t\t\t\t|= =|::|  |.|:|==||= =|::|  |.|:|==||= =|::|  |.|:|==|  |= =|::|     |.|:|==|\n" +
            "\t\t\t\t|=|=|::|__|.|:|==||=|=|::|__|.|:|==||=|=|::|__|.|:|==|__|=|=|::|_____|.|:|==|\n";
        return detail;
    
    }
    public static void displayCity (){
        System.out.println(
            "      ,      ;   , ' ;'   .   :     / ' /_______|_`-..-'_|________________/x'\n" +
            "   ;     ;   ,  ;  ;'     . . .    / '  - - - -_.`-.__.-'._ - - - - - - -   x\n" +
            " ;'     ,   ;    ;'  . /\\  : . .  / 'x/~~~~~~.(  `..__..'  ).~~~~~~~~~~~/ 'x/\n" +
            "'  __________________ /\\/ .  .   / ' /   @ @ |.~-..____..-~.| @ @ @ @  /x' /\n" +
            " ,T~T~T~T~T~T~T~T~T~T\\~~  .   . /x' /   @`@`@|.. . .  . .:. |@'@'@'@' / ' / _\n" +
            "   ;    ;   ;'.:  /~~~~~\\      / ' /   @`@`@`|. : .  : . . :|'@'@'@' / 'x/_/\n" +
            "  '    ;   ;  .  |\\\\___//|___ /x' /    ` `@`@`.  . :  . .. .'@'@' ' / ' //|\n" +
            " ;  ,      ; . /~~~~~\\-|'|  // ' / __//\\__` `@ ~-.._/\\_..-~ @' '   / 'x// /\\_\n" +
            "   ;      ;.  |\\\\___//||'| // 'x/ /%/^\\'%/l  `     ~~~~   _ ' |%| / ' // ___/\n" +
            "       ; ;' /~~~~~\\-|'||,|//x' /  la_A_al/~~~~~~~~~~~~~~~~/|   l / ' // /\\  ~\n" +
            "   ;     ; |\\\\___//|| ||/// ' `---------/ c==o  _C-__    /'|----'x' / \\/  |\n" +
            "  ;   , ;/~~~~~\\-|'||'|'// '  \"x\" \" \"x\"/ c==o' //|\\ /|  /''|\"x\"  ' /  /   /\\\n" +
            "     ; ;|\\\\___//|| ||'|// ' /~~~~~/ /~/  .--. /  ` /|/ / ''|~~/ 'x/  / / / /|\n" +
            ";   ;  ;|`|-- |'||'||///x' /xx___x _ /  //-//|~~~~||/ /'' '| /x' /  / / /__/~\n" +
            " '    ;'| | - |'||'|'//   / x xx/ /x/  /__ / |____|/ /' '''|/ ' /  / / //\\_/~\n" +
            ", ;  ;  |`| --|'||'|//x' / xx x/ /x/________________/''' '// 'x/   \\/ // //|\n" +
            " ;   ;  |`|---| ||/// ' /  ___  __|-- - -- ---- - - |' ''//x' /    _|//_// /\\\n" +
            "'   ;' /|`|-- |'|'// ' / xx  / /x | - -- - -- --- --|''/i/ 'x/  __/\\~~~ / / /\n" +
            "   ;' / | | --|'|// ' /x xx / / xx|-- -  -- - -- - -|'(i/ ' /  /\\/  \\  / / /\n" +
            "  ;' / /\\\\|-n-|///x'x/x ___  ____ |- - --  - --  -- |'//x' /  | /  /\\_ \\/_/_/\n" +
            " ;  / //\\\\ ~~~ //x' /xxxxx/ /x xxx|_ii__ii_n_ii__ii_|//x' /  / /  / / \\____\n" +
            "'' /S_C_E_S_W_//x'x/_____/x/_________________________/ 'x/   \\//   /  /   /\\\n" +
            ".  . .    .  ./ '      x     x            x    x    x ' /   /~/   /  /   /  \\\n" +
            " :.  . : . : / '  \"x\" \" \" \"x\" \" \" \" \"x\" \" \" \" \"x\"x\"x ' /    \\/   /  /   /   /\n" +
            "   :      . /x' /~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~/ 'x/      \\__/__/   /   /");
    }

    public static void displayBozemanMap() {
        System.out.println(
                
" ,____________________________________________________________________\n"+                
" |                            BOZEMAN MAP                             |\n"+                
" |____________________________________________________________________|\n"+                                                                                
"                             ,-.^._                 _\n" +
"                           .'      `-.            ,' ;\n" +
"                /`-.  ,----'         `-.   _  ,-.,'  `\n" +
"             _.'   `--'                 `-' '-'      ;\n" +
"            :                         o             ;    __,-.\n" +
"            ,'    o            Police Department    ;_,-',.__'--.\n" +
"           :    CityHall                           ,--```    `--'\n" +
"           :                                      ;\n" +
"           :               o                       :\n" +
"           ;           Fire Station                :\n" +
"          (                                       ;\n" +
"           `-.                           *      ,'\n" +
"             ;                         Barn    :\n" +
"           .'                             .-._,'\n" +
"         .'             o                 `.\n" +
"      _.'       Your Parent's House      .__;\n" +
"      `._                  o            ;\n" +
"         `.             Bakery         :    ,------------------------.\n" +
"           `.               ,..__,---._;    |      BOZEMAN CITY      |\n" +
"             `-.__         :                | State: Montana         |\n" +
"                  `.--.____;                | Pop: 250,000 (1968 )   |\n" +
"                                            | Area: 1,772 sq.mi.     |\n" +
"                                            |      (5,086 sq.km.)    |\n" +
"                                            `------------------------'");
    GameDetailView.pause();
    }

    static void displayIntroduction(Player player) {
        String title =
"  ____   ___ __________ __  __    _    _   _           _  ___   ___   ___  \n" +
" | __ ) / _ \\__  / ____|  \\/  |  / \\  | \\ | |         / |/ _ \\ ( _ ) ( _ ) \n" +
" |  _ \\| | | |/ /|  _| | |\\/| | / _ \\ |  \\| |  _____  | | (_) |/ _ \\ / _ \\ \n" +
" | |_) | |_| / /_| |___| |  | |/ ___ \\| |\\  | |_____| | |\\__, | (_) | (_) |\n" +
" |____/ \\___/____|_____|_|  |_/_/   \\_\\_| \\_|         |_|  /_/ \\___/ \\___/ \n" +
"                                                                           ";
       String[] titles = title.split("\n");
       for(String line : titles){
            System.out.println(line);
            //try {
            //Thread.sleep(300);
            //} catch (InterruptedException ex) {
            //    Logger.getLogger(GameDetailView.class.getName()).log(Level.SEVERE, null, ex);
            //}
       }      
          
        
        String text =
                "\n-------------------------------------------\n" +
                "   Welcome " + player.getName().substring(0, 1).toUpperCase() + player.getName().substring(1).toLowerCase()+ " to 1988! \n" +               
                "-------------------------------------------\n" +
                "You live in the small city Bozeman, Montana, US.\n" +
                "You're  a  sixteen-year  old  boy  that  love a \n "
              + "adventure. You have 4 friends Arnold, Bob, Stela\n"
              + "and John. John is the main caracter of this game.\n"
              + "In the Summer of 1988,  after  the  city festival\n"
              + "called “Festival of lights” you and the group 4 \n"
              + "friends were returning together to your neighborhood\n"
              + " riding your bikes when Arnold suggest a shortcut\n "
              + "in the way home. The shortcut passed through a  \n"
              + "dense forest. In the middle of the forests you found\n"
              + " an old barn and driven by curiosity all the group\n"
              + " get in the barn and find a strange machine that \n"
              + "looks like a carriage. John and you that were \n"
              + "playing inside the machine thinking that it would\n"
              + " be a kind of old vehicle. Accidentally John turns\n"
              + " the machine on and both travel in time 20 years back.\n \n \n"
              + "                 ____\n" +
"                /___.`--.____ .--. ____.--(\n" +
"                       .'_.- (    ) -._'.\n" +
"                     .'.'    |'..'|    '.'.\n" +
"              .-.  .' /'--.__|____|__.--'\\ '.  .-.\n" +
"             (O).)-| |  \\    |    |    /  | |-(.(O)\n" +
"              `-'  '-'-._'-./      \\.-'_.-'-'  `-'\n" +
"                 _ | |   '-.________.-'   | | _\n" +
"              .' _ | |     |   __   |     | | _ '.\n" +
"             / .' ''.|     | /    \\ |     |.'' '. \\\n" +
"             | |( )| '.    ||      ||    .' |( )| |\n" +
"             \\ '._.'   '.  | \\    / |  .'   '._.' /\n" +
"              '.__ ______'.|__'--'__|.'______ __.'\n" +
"             .'_.-|         |------|         |-._'.\n" +
"            //\\\\  |         |--::--|         |  //\\\\\n" +
"           //  \\\\ |         |--::--|         | //  \\\\\n" +
"          //    \\\\|        /|--::--|\\        |//    \\\\\n" +
"         / '._.-'/|_______/ |--::--| \\_______|\\`-._.' \\\n" +
"        / __..--'        /__|--::--|__\\        `--..__ \\\n" +
"       / /               '-.|--::--|.-'               \\ \\\n" +
"      / /                   |--::--|                   \\ \\\n" +
"     / /                    |--::--|                    \\ \\\n" +
" _.-'  `-._                 _..||.._                  _.-` '-._\n" +
"'--..__..--'           '-.____.-'                '--..__..-' "+ "\n \n \n ... \n";
       String[] textDivided = text.split("\n");
       //for(String line : textDivided){
       //     try {
       //         System.out.println(line);
       //         Thread.sleep(600);
       //     } catch (InterruptedException ex) {
       //         Logger.getLogger(GameDetailView.class.getName()).log(Level.SEVERE, null, ex);
       //     }
       // }
       
        System.out.println(
"  _____                      __    _______             ______  ____ ___ \n" +
" / ___/_ _____________ ___  / /_  /_  __(_)_ _  ___   <  / _ \\/ __/( _ )\n" +
"/ /__/ // / __/ __/ -_) _ \\/ __/   / / / /  ' \\/ -_)  / /\\_, / _ \\/ _  |\n" +
"\\___/\\_,_/_/ /_/  \\__/_//_/\\__/   /_/ /_/_/_/_/\\__/  /_//___/\\___/\\___/ \n" +
"                                                                        ");
        String text2 ="Now you're in 1968 and your goal is to try to travel\n"
                + "20 years in the future without ruin your future!\n\n"
                + "The time machine broke during the travel. You must fix it!\n";       
        
    String[] textDivided2 = text2.split("\n");
       for(String line : textDivided2){
            try {
                System.out.println(line);
                Thread.sleep(700);
            } catch (InterruptedException ex) {
                Logger.getLogger(GameDetailView.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
    GameDetailView.pause();   
    }
    public static void TimeMachineItemDetail(){
        System.out.println("\n\tPieces that catch fire during the the travel:\n");
        System.out.println(
"       =======\n" +
"        =====  Flux Capacitor\n" +
"         ===\n" +
"          =\n" +
"          |\n" +
"          |          Air Core Wire\n" +
"          |          coil w/tuning lug\n" +
"          |    .----.     \n" +
"          |   (.-') |\n" +
"          |   (.-') |\n" +
"          |   (.-') |      Capacitor\n" +
"          |   (.-'  |    ___  (1500uf 25V)\n" +
"          |   |     |   |___|\n" +
"TM   ->  .----'-----'---'---'\n" +
"Board    `-------------------\n" +
"         ground plane ");
    }    
    
    public static void explosionDetail(){
        System.out.println("                            ________________\n" +
"                          ____/ (  (    )   )  \\___\n" +
"                         /( (  (  )   _    ))  )   )\\\n" +
"                       ((     (   )(    )  )   (   )  )\n" +
"                     ((/  ( _(   )   (   _) ) (  () )  )\n" +
"                    ( (  ( (_)   ((    (   )  .((_ ) .  )_\n" +
"                   ( (  )    (      (  )    )   ) . ) (   )\n" +
"                  (  (   (  (   ) (  _  ( _) ).  ) . ) ) ( )\n" +
"                  ( (  (   ) (  )   (  ))     ) _)(   )  )  )\n" +
"                 ( (  ( \\ ) (    (_  ( ) ( )  )   ) )  )) ( )\n" +
"                  (  (   (  (   (_ ( ) ( _    )  ) (  )  )   )\n" +
"                 ( (  ( (  (  )     (_  )  ) )  _)   ) _( ( )\n" +
"                  ((  (   )(    (     _    )   _) _(_ (  (_ )\n" +
"                   (_((__(_(__(( ( ( |  ) ) ) )_))__))_)___)\n" +
"                   ((__)        \\\\||lll|l||///          \\_))\n" +
"                            (   /(/ (  )  ) )\\   )\n" +
"                          (    ( ( ( | | ) ) )\\   )\n" +
"                           (   /(| / ( )) ) ) )) )\n" +
"                         (     ( ((((_(|)_)))))     )\n" +
"                          (      ||\\(|(|)|/||     )\n" +
"                        (        |(||(||)||||        )\n" +
"                          (     //|/l|||)|\\\\ \\     )\n" +
"                        (/ / //  /|//||||\\\\  \\ \\  \\ _)\n" +
"-------------------------------------------------------------------------------");
    }
    public static void endView(){
        System.out.println(
" ___                      _          _                       \n" +
"  | |_   _. ._  |   _   _|_ _  ._   |_) |  _.    o ._   _  | \n" +
"  | | | (_| | | |< _>    | (_) |    |   | (_| \\/ | | | (_| o \n" +
"                                              /         _|   ");
    }

    private void getInputValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private static void timeMachine(){
        System.out.println(
"                 ____\n" +
"                /___.`--.____ .--. ____.--(\n" +
"                       .'_.- (    ) -._'.\n" +
"                     .'.'    |'..'|    '.'.\n" +
"              .-.  .' /'--.__|____|__.--'\\ '.  .-.\n" +
"             (O).)-| |  \\    |    |    /  | |-(.(O)\n" +
"              `-'  '-'-._'-./      \\.-'_.-'-'  `-'\n" +
"                 _ | |   '-.________.-'   | | _\n" +
"              .' _ | |     |   __   |     | | _ '.\n" +
"             / .' ''.|     | /    \\ |     |.'' '. \\\n" +
"             | |( )| '.    ||      ||    .' |( )| |\n" +
"             \\ '._.'   '.  | \\    / |  .'   '._.' /\n" +
"              '.__ ______'.|__'--'__|.'______ __.'\n" +
"             .'_.-|         |------|         |-._'.\n" +
"            //\\\\  |         |--::--|         |  //\\\\\n" +
"           //  \\\\ |         |--::--|         | //  \\\\\n" +
"          //    \\\\|        /|--::--|\\        |//    \\\\\n" +
"         / '._.-'/|_______/ |--::--| \\_______|\\`-._.' \\\n" +
"        / __..--'        /__|--::--|__\\        `--..__ \\\n" +
"       / /               '-.|--::--|.-'               \\ \\\n" +
"      / /                   |--::--|                   \\ \\\n" +
"     / /                    |--::--|                    \\ \\\n" +
" _.-'  `-._                 _..||.._                  _.-` '-._\n" +
"'--..__..--'               '-.____.-'                '--..__..-'");
    
    }
}
