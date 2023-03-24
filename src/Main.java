import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        String title = " Сообщение";
//        String text = "Продолжаем изучать JAVA";
//
//        JOptionPane.showMessageDialog(null,text,title,JOptionPane.QUESTION_MESSAGE);


//        String text;
//        text = JOptionPane.showInputDialog("Введите текс:");
//        JOptionPane.showMessageDialog(null,"Вы ввели такой текст : \n" + text);

//        String title;
//        String text;
//        title = JOptionPane.showInputDialog(null,"Text message","Name",JOptionPane.WARNING_MESSAGE);
//        text = JOptionPane.showInputDialog(null,"text message","Soderganie",JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null,text,title,JOptionPane.INFORMATION_MESSAGE);



//        Scanner in = new Scanner(System.in);
//        String day,month;
//        System.out.println("Какой сегодня день ?");
//        day = in.nextLine();
//        System.out.println("Какой сегодня month?");
//        month = in.nextLine();
//        String text = "Сегодня: " + day + "\n Месяц: " + month;
//        System.out.println(text);

//        int age,year,berth;
//        String result;
//        result = JOptionPane.showInputDialog("Какой сейчас год ? ");
//        year = Integer.parseInt(result);
//        result = JOptionPane.showInputDialog("Сколько вам лет ? ");
//        age = Integer.parseInt(result);
//        berth = year -age;
//        JOptionPane.showMessageDialog(null,"Вы родились в " +berth+"Году!");

//        double mass,height,bmi;
//        String resultat;
//        resultat = JOptionPane.showInputDialog("Ваш рост в метрах ?");
//        height = Double.parseDouble(resultat);
//        System.out.println(height);
//        resultat = JOptionPane.showInputDialog("Ваш вес в кг ?");
//        mass = Double.parseDouble(resultat);
//        System.out.println(mass);
//        bmi = mass / height / height;
//        System.out.println(bmi);
//        bmi = Math.round(bmi*100)/100;
//        JOptionPane.showMessageDialog(null,"Индекс массы тела = " + bmi);

        Scanner input = new Scanner(System.in);
        int now = 2015;
        String name;
        int age;
        double height;
        double mass;
        System.out.println(" Ваше имя:");
        name = input.nextLine();
        System.out.println(" Ваш возраст: ");
        age = input.nextInt();
        System.out.println(" Ваш рост: ");
        height= input.nextDouble();
        System.out.println(" Ваш вес: ");
        mass = input.nextDouble();
        double bmi = mass / height / height;
        System.out.println(bmi);
        System.out.println("Здравствуй " + name + " !");
        System.out.println("Вы родились :" + (now - age)+ "году");
        System.out.printf("Ваш индекс  %5.2f\n",bmi);









    }
}