package Prepare_for_Controlwork.Task1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();
        try{
            FileReader fileReader = new FileReader("C:\\Users\\User\\IdeaProjects\\my\\src\\Prepare_for_Controlwork\\Task1\\employees.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            while (reader.ready()){
                EmployeeFixed employee = new EmployeeFixed();
                employee.setId(Integer.parseInt(reader.readLine()));
                employee.setName(reader.readLine());
                employee.setFixedMonthlyPay(Integer.parseInt(reader.readLine()));
                list.add(employee);
            }
            FileReader fileReader1 = new FileReader("C:\\Users\\User\\IdeaProjects\\my\\src\\Prepare_for_Controlwork\\Task1\\employees1.txt");
            BufferedReader reader1 = new BufferedReader(fileReader1);
            while (reader1.ready()){
                EmployeeHourly employee1 = new EmployeeHourly();
                employee1.setId(Integer.parseInt(reader1.readLine()));
                employee1.setName(reader1.readLine());
                employee1.setRatePerHour(Integer.parseInt(reader.readLine()));
                list.add(employee1);
            }

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        Collections.sort(list,new Sorting());
        for (int i = 0; i < list.size();i++){
            System.out.println("Id работника"+list.get(i).getId());
            System.out.println("Имя нашего работника"+list.get(i).getName());
            System.out.println("ЗП работника"+list.get(i).calculationSalary());
            System.out.println("/n");
        }
        for (int i = 0; i < 3; i++){
            System.out.println("Имя работника"+list.get(i).getName());
        }


    }
}
