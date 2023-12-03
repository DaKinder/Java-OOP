package SOLID.HW6.Documents;

public abstract class Document {
    private int id;
    private String number;
    public Document(int id, String number){
        this.id = id;
        this.number = number;
    }
    public int getId(){return id;}
    public String getNumber(){return number;}
}