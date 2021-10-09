package edu.ags.shoppinglist;

public class Item {
    public int Id;
    public String Name;

    public Item (int id, String name)
    {
        Id = id;
        Name = name;
    }

    public String toString()
    {
        return Id + "|" + Name + "|" ;
    }

}
