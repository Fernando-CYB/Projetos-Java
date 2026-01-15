public class Droid{
    int batteryLevel;
    String name;

    public String toString(){
        return "Hello, I'm the droid: " + name + ". Battery level: " + batteryLevel + "%";
    }

    public Droid(String droidName){
        name = droidName;
        batteryLevel = 100;
    }

    public void performTask(String task){
        System.out.println(name + " is performing task: " + task);
        batteryLevel = batteryLevel - 10;
    }

    public void energyReport(){
        System.out.println(name + "'s battery level: " + batteryLevel + "%");
    }

    public void energyTransfer(Droid receiver, int energyAmount){
        // Verifica se há bateria suficiente para transferir
        if(this.batteryLevel >= energyAmount){
            this.batteryLevel -= energyAmount;
            receiver.batteryLevel += energyAmount;
            
            // Garante que não exceda 100%
            if(receiver.batteryLevel > 100){
                receiver.batteryLevel = 100;
            }
            
            System.out.println(name + " transferred " + energyAmount + 
                             "% energy to " + receiver.name);
        } else {
            System.out.println(name + " doesn't have enough energy to transfer " + 
                             energyAmount + "%");
        }
    }

    // Método para recarregar
    public void recharge(){
        batteryLevel = 100;
        System.out.println(name + " has been fully recharged!");
    }

    public static void main(String [] args){
        Droid Codey = new Droid("Codey");
        Droid R2D2 = new Droid("R2-D2");
        Droid C3PO = new Droid("C-3PO");

        System.out.println("=== Primeira parte: Tarefas ===");
        System.out.println(Codey);
        Codey.performTask("dancing");
        Codey.performTask("running");
        
        System.out.println("\n=== Segunda parte: Relatórios de energia ===");
        Codey.energyReport();
        R2D2.energyReport();
        
        System.out.println("\n=== Terceira parte: Transferência de energia ===");
        Codey.performTask("studying");
        Codey.performTask("calculating");
        Codey.energyReport();
        
        Codey.energyTransfer(R2D2, 30);
        Codey.energyReport();
        R2D2.energyReport();
        
        System.out.println("\n=== Quarta parte: Criando um terceiro droid ===");
        System.out.println(C3PO);
        C3PO.performTask("translating");
        C3PO.performTask("diplomacy");
        C3PO.energyReport();
        
        System.out.println("\n=== Quinta parte: Transferência entre múltiplos droids ===");
        R2D2.energyTransfer(C3PO, 20);
        R2D2.energyReport();
        C3PO.energyReport();
        
        System.out.println("\n=== Sexta parte: Recarga ===");
        Codey.recharge();
        Codey.energyReport();
        
        System.out.println("\n=== Sétima parte: Transferência com energia insuficiente ===");
        Codey.performTask("heavy lifting");
        Codey.performTask("heavy lifting");
        Codey.performTask("heavy lifting");
        Codey.performTask("heavy lifting");
        Codey.performTask("heavy lifting");
        Codey.energyReport();
        Codey.energyTransfer(R2D2, 30); // Tentativa falha
    }
}
