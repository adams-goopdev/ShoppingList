package edu.ags.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "myDebug";
    Item item;
    ArrayList<Item> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ReadFromTextFile();

    }

    private void ReadFromTextFile()
    {
        //Write out the teams to a file
        FileIO fileIO = new FileIO();

        Integer counter = 0;
        String[] data;// = new String [teams.size()];
        //for(Team t : teams) data[counter++] = t.toString();

        // fileIO.writeFile(this, data);


        //Read the data out of the file
        ArrayList<String> strData = fileIO.readFile(this);
        items = new ArrayList<Item>();

        for(String s : strData)
        {
            data = s.split("\\|");
            items.add(new Item(Integer.parseInt(data[0]),data[1]));
        }
    }

    private void WriteToTextFile() {
        FileIO fileIO = new FileIO();
        Integer counter = 0;
        String[] data = new String [items.size()];
        for (Item t : items) data[counter++] = t.toString();
        fileIO.writeFile(this,data);
    }


}