package ua.artcode.console_controller;

import java.io.*;
import java.util.Scanner;

/**
 * Created by admin on 22.11.2014.
 */
public class CMDController {

    private File root = new File("/"); //e:\dev\IDEA_Projects\ACO2
    private InputStream is;
    private OutputStream os;
    private DataOutputStream dos;
    private LineNumberReader lineNumberReader;

    public CMDController() {
        try {
            openConsole();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void openConsole() throws IOException, InterruptedException {

    }

    private String executeCommand(String command) {

        StringBuffer output = new StringBuffer();

        if(command.contains("cd")){

        }

        Process p = null;
        try {

            p = Runtime.getRuntime().exec("cmd /c cd /d "+ getCurrentLocation() + " & "+ command);


            //p.waitFor();
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line = "";
            while ((line = reader.readLine()) != null) {
                output.append(line + "\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return output.toString();

    }

    public String getCurrentLocation(){

            return root.getAbsolutePath() + ">";

    }

    public static void main(String[] args) {
        CMDController cmd = new CMDController();

        Scanner fromConsole = new Scanner(System.in);


        String command = "help";

        while (!"exit".equals(command)) {
            System.out.print(cmd.getCurrentLocation());
            command = fromConsole.nextLine();
            String res = cmd.executeCommand(command);
            System.out.println(res);
        }
    }


}
