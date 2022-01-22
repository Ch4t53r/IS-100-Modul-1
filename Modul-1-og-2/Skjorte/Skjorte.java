
/**
 * Write a description of class Tskjorte here.
 * @author (your name)
 * @version (a version number or a date)
 */
public class Skjorte
{
    public String color;
    public char size;
    public int price;
    public int balance;
    
    Skjorte() {}
    
    Skjorte(String newColor, char newSize) {
        color = newColor;
        size = newSize;
        price = 200;
        balance = 0;
    }
    
    public void setColor(String newColor){
        color = newColor;
    }
    
    public void setSize(char newSize){
        size = newSize;
    }

    public int getPrice() {
        return price;
    }
    
    public int getBalance(){
        return balance;
    }
    
    public void insertMoney(int sum){
        balance=balance+sum;
    }
    public void buyShirt(){
        if (balance>=200){
            balance=balance-200;
            System.out.println("Du har kjøpt skjorten");
        }
        else{
            System.out.println("Du har ikke råd");
        }
    }
}