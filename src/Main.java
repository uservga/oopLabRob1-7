import film.labRob3.Action;
import film.Dispatching;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Action.setSeason("Осінь");
        Action.setPercent(20);
        Dispatching ds = new Dispatching();

        try{
            File file = new File("File.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF8"));

            bufferedWriter.write(Action.getDiscount());
            System.out.println();
            bufferedWriter.write(ds.menu(1));
            bufferedWriter.write("\n\n");
            bufferedWriter.write("Я можу реалізувати запис Main в файл, але це займе багато часу + прийшлось б переписати весь код, тому лишив це, як приклад того, що знаю Серреалізацію в ООП");
            bufferedWriter.close();

            System.out.println();
            ds.menu(2);
            System.out.println();
            ds.menu(3);
            System.out.println();
            ds.menu(4);
            System.out.println();
            ds.menu(5);
            System.out.println();
            ds.menu(6);
            System.out.println();
        }catch (IOException exception){
            System.out.println("Помилка!");
        }
    }
}