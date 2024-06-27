import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> toneRow = defineToneRow();
        System.out.println(toneRow);
        }

    public static ArrayList <Integer> defineToneRow(){
        ArrayList <Integer> toneRow= new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9,10,11));
        Collections.shuffle(toneRow);
    return toneRow;
    }
}

