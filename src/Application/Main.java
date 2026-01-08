package Application;

import entities.Task;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Task task = new Task();
        List<Task> listTasks = new ArrayList<>();
        boolean systemRunning = true;
        while (systemRunning) {
            try {
                System.out.println(task.Menu());
                System.out.println();
                System.out.print("Digite uma opção: ");
                int option = sc.nextInt();
                System.out.println();
                sc.nextLine();
                switch (option) {
                    case 1:
                        System.out.print("Digite a descrição da tarefa: ");
                        String taskDescription = sc.nextLine();
                        System.out.print("Digite um numero de identificaçao para esta tarefa: ");
                        int identificationNumber = sc.nextInt();
                        sc.nextLine();
                        listTasks.add(new Task(taskDescription, identificationNumber));
                        break;
                    case 2:
                        System.out.println("Lista completa das tarefas:");
                        for (Task ts : listTasks) {
                            System.out.println(ts.toString());
                        }
                        System.out.println();
                        System.out.print("Digite o numero de identificaçao da tarefa que voce deseja remover: ");
                        int removeTask = sc.nextInt();
                        System.out.println("Lista completa das tarefas:");
                        listTasks.removeIf(t -> t.getIdentificationNumber().equals(removeTask));
                        break;
                    case 3:
                        System.out.println("Lista completa das tarefas:");
                        for (Task ts : listTasks) {
                            System.out.println(ts.toString());
                        }
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("Lista completa das tarefas:");
                        for (Task ts : listTasks) {
                            System.out.println(ts.toString());
                        }
                        System.out.println();
                        System.out.print("Digite o numero de identificação da tarefa que voce deseja marcar como conluída: ");
                        int numberTaskComplete = sc.nextInt();
                        boolean found = false;
                        for (Task ts : listTasks) {
                            if (ts.getIdentificationNumber().equals(numberTaskComplete)) {
                                ts.taskCompleted(numberTaskComplete);
                                found = true;
                                System.out.println("Tarefa marcada como conluída!");
                            }
                        }
                        if (!found){
                            System.out.println("Aviso! tarefa não encontrada!");
                        }
                        break;
                    case 5:
                        System.out.print("Saindo...");
                        systemRunning = false;
                        break;
                    default:
                        System.out.println("ERRO! DIGITE UM NUMERO VALIDO!");
                        break;
                }
            }
            catch (InputMismatchException e){
                System.out.println("ERRO! Digite um numero! ");
                sc.nextLine();
            }
            catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
