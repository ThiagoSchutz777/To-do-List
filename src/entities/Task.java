package entities;

import java.util.Objects;

public class Task  {
    private String task;
    private boolean taskCompleted;
    private Integer identificationNumber;

    public Task() {
    }

    public Task(String task, Integer identificationNumber) {
        this.task = task;
        this.identificationNumber = identificationNumber;
    }

    public Integer getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(Integer identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Boolean getTaskCompleted() {
        return taskCompleted;
    }

    public void setTaskCompleted(Boolean taskCompleted) {
        this.taskCompleted = taskCompleted;
    }

    public void taskCompleted(int identificationNumber) {
        if (getIdentificationNumber().equals(identificationNumber)) {
            setTaskCompleted(true);
        }
    }

    public String Menu(){
        return """
                -----------------------------------------
                [1] Adicionar uma nova tarefa na lista!
                [2] Remover uma tarefa da lista!
                [3] Ver todas as tarefas da lista!
                [4] Marcar uma tarefa como concluída!
                [5] Sair
                ------------------------------------------""";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(identificationNumber, task.identificationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(identificationNumber);
    }

    @Override
    public String toString(){
       if (!taskCompleted) {
           return identificationNumber + ": " + task;
       }
       else {
           return identificationNumber + ": " + task + ", tarefa concluída!";
       }
    }

}