/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.alice;

import java.util.Scanner;
import org.alicebot.ab.*;


/**
 *
 * @author arora
 */
public class ProjectAlice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String botname="test";
        Bot bot = new Bot(botname);
        Scanner sc = new Scanner(System.in);
        
        Chat chatSession = new Chat(bot);
        
        while(true) {
            String request = sc.nextLine();
            String response = chatSession.multisentenceRespond(request);
            System.err.println(response);
        }
    }
    
}
