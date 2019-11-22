package ru.cmtscience.Helpers.BotHelper;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class BotManager {
    final String FILE_PATH = System.getProperty("user.dir") + "\\src\\test\\java\\ru\\cmtscience\\Helpers\\BotHelper\\";
    final String FILE_NAME = "accounts.config";
    ArrayList<Bot> botList;
    public BotManager() {
        botList = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH+FILE_NAME))){
            while(true){
                String name, email, password;
                if ((name=reader.readLine()) == null){
                    break;
                }
                name = getValue(name);
                email = getValue(reader.readLine());
                password = getValue(reader.readLine());
                botList.add(new Bot(email, password, name));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Bot getBot(String name){
        for(Bot bot : botList){
            if (name.equals(bot.getName())){
                return bot;
            }
        }
        return null;
    }

    private String getValue(String line){
        return line.split(": ")[1];
    }
}
