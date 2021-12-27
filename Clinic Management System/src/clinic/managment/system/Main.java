package clinic.managment.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Practitioners lizzy = new Practitioners(1,"Lizzy","Behavioural Disorders",500);
        Practitioners mellisa = new Practitioners(2,"Mellisa","Personality Disorders",700);
        Practitioners vanderhorn = new Practitioners(3,"Vanderhorn","Psychiatric",600);


        List<Practitioners> practitioners = new ArrayList<>();
        practitioners.add(lizzy);
        practitioners.add(mellisa);
        practitioners.add(vanderhorn);

        Client tamasha = new Client(1,"Tamasha","Depression",4);
        Client rakshith = new Client(2,"Rakshith Vasudev","Bipolar",12);
        Client rabbi = new Client(3,"Rabbi","Autism",5);

        List<Client> clientList = new ArrayList<>();
        clientList.add(tamasha);
        clientList.add(rakshith);
        clientList.add(rabbi);

        Clinic ghs = new Clinic(practitioners,clientList);


        tamasha.payFees(300);
        rakshith.payFees(600);
        System.out.println("GHS has earned £"+ ghs.getTotalMoneyEarned());

        System.out.println("--------Making GHS PAY SALARY-------");
        lizzy.recieveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName() +" and now has "+ ghs.getTotalMoneyEarned());

        vanderhorn.recieveSalary(vanderhorn.getSalary());
        System.out.println("GHS has spent for salary to " + vanderhorn.getName() +" and now has "+ ghs.getTotalMoneyEarned());

        mellisa.recieveSalary(mellisa.getSalary());
        System.out.println(mellisa );

    }

}
