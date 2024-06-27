import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> toneRow = defineToneRow();
        ArrayList <Integer> inverseRow = defineInverseRow(toneRow);
        ArrayList <ArrayList<Integer>> matrix = new ArrayList <>();

        for (int i = 0; i < 12; i++) {
            matrix.add(new ArrayList<>());
            matrix.set(i, defineTransponsedRow(toneRow, inverseRow.get(i)));
            System.out.println(matrix.get(i));
        }
        }

    public static ArrayList <Integer> defineToneRow(){
        ArrayList <Integer> toneRow= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11));
        Collections.shuffle(toneRow);
        toneRow.addFirst(0);
    return toneRow;
    }

    public static ArrayList <Integer> defineInverseRow(ArrayList <Integer> toneRow){
        ArrayList <Integer> inverseRow = new ArrayList<>(toneRow);
        for (int i = 0; i < inverseRow.size(); i++){
            if (i!=0){
                inverseRow.set(i,12-inverseRow.get(i));
            }
        }
        return inverseRow;
    }

    public static ArrayList <Integer> defineTransponsedRow(ArrayList <Integer> toneRow, int transposition){
        ArrayList <Integer> transposedRow = new ArrayList<>(toneRow);
        for (int i = 0; i < transposedRow.size(); i++){
                transposedRow.set(i,transposition+transposedRow.get(i));
                if (transposedRow.get(i)>=12){
                    transposedRow.set(i,transposedRow.get(i)-12);
                }
        }
        return transposedRow;
    }
}

