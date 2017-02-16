/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.View;

import Time_Machine.Control.GetInput;

/*
 * @author Group 7
 */
public class GameMenu {
    
    public String MainMenu (){
        System.out.println(
            "████████╗██╗███╗     ███╗███████╗    ███╗   ███╗ █████╗  ██████╗██╗   ██╗██╗███╗     ██╗███████╗\n" +
            "╚══██╔══╝██║████╗  ████║██╔════╝    ████╗ ████║██╔══██╗██╔═══╝██║  ██║██║████╗    ██║██╔════╝\n" +
            "     ██║     ██║██╔████╔██║█████╗       ██╔████╔██║███████║██║     ███████║██║██╔██╗  ██║█████╗  \n" +
            "     ██║     ██║██║╚██╔╝██║██╔══╝       ██║╚██╔╝██║██╔══██║██║     ██╔══██║██║██║╚██╗██║██╔══╝  \n" +
            "     ██║     ██║██║ ╚═╝  ██║███████╗    ██║ ╚═╝  ██║██║  ██║╚██████╗██║  ██║██║██║ ╚████║███████╗\n" +
            "     ╚═╝     ╚═╝╚═╝       ╚═╝╚══════╝    ╚═╝        ╚═╝╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝╚═╝╚═╝   ╚═══╝╚══════╝ ");
            GameMenu.displayTitleDetail();
            System.out.println(
            "\tWelcome to a new adventure!\n" +
            "-------------------------------------------\n"+        
            "Select an option below:\n\n" +        
            "N - Start the a New Game\n" +
            "G - Saved Games\n" +
            "S - Save Current cGame\n" +
            "H - Get Help on How to Play the Game\n" +
            "E - Exit\n\n" + 
            "-------------------------------------------\n"+
            "\tEnter your option:");
        String option = GetInput.getString();
        return option;
    }
    public String playerOptions(){
        System.out.println("Choose a action:"
                + "\n\t S - Save Game"
                + "\n\t M - Move to another location on the map"
                + "\n\t L - See current Location"
                + "\n\t I - See inventory items"
                + "\n\t T - Time Machine Options"
                + "\n\t E - Main Menu");
        String option = GetInput.getString();
        return option;
    } 
    public String TimeMachineOptions(){
        System.out.println("Choose a Time Machine option:"
                + "\n\t F - Try to fix the Time Machine"
                + "\n\t I - Try to combine items with the Time Machine"
                + "\n\t R - Try to turn the Time Machine on"
                + "\n\t B - Back to Game Manu ");
        String option = GetInput.getString();
        return option;
    }
    public static void displayTitleDetail (){
        System.out.println(
            "\t\t\t ___    _          ___               ___                 ___            \n" +
            "\t\t\t|===|  (_)   __   |===|        __   |===|        __     |===|           __   \n" +
            "\t\t\t|= =|__    _|==|_ |= =|__    _|==|_ |= =|__    _|==|_   |= =|__       _|==|_ \n" +
            "\t\t\t|= =|::|  |.|:|==||= =|::|  |.|:|==||= =|::|  |.|:|==|  |= =|::|     |.|:|==|\n" +
            "\t\t\t|=|=|::|__|.|:|==||=|=|::|__|.|:|==||=|=|::|__|.|:|==|__|=|=|::|_____|.|:|==|\n");
    
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
        
}

