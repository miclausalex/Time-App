import java.util.*;
import java.util.Random;


// System.currentTimeMillis
//adauga nre de la 1 la 100.000 intr-o lista, si apoi intr-un set (as zice hash set),
//genereaza pe rand 100 de nre random intre 1 si 100.000, si cauta-le in lista si in set
//(separat), masoara timpul in care au fost gasite (toate 100 in total)
//
public class Main {
    public static void main(String[] args) {

    Random rand= new Random();
    int upperbound=100000;

    List <Integer> numList = numberGenerator();
    Set <Integer> numSet = new HashSet<>(numList);

    int numPresList=0, numPresSet=0;

    long starting= System.currentTimeMillis();

    for (int i=0;i<=100;i++){
        int randomNumber=rand.nextInt(upperbound);
        if(numList.contains(randomNumber))
            numPresList++;

    }
    long ending=System.currentTimeMillis();
    System.out.println("Elapsed time: "+(ending-starting));

    starting= System.currentTimeMillis();
    for (int i=0;i<=100;i++){
        int randomNumber=rand.nextInt(upperbound);
        if(numSet.contains(randomNumber))
            numPresSet++;
    }
    ending=System.currentTimeMillis();
    System.out.println("Elapsed time: "+(ending-starting));

    }
    public static List<Integer> numberGenerator()
    {
        int start =1;
        int end=100000;
        List<Integer> numbers = new ArrayList<>();
        for (int i =start; i<=end; i++)
            numbers.add(i);
        return numbers;
    }


}