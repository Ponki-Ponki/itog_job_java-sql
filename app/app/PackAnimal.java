package app;

import java.time.LocalDate;
import java.util.ArrayList;

public class PackAnimal extends Animals {

    private ArrayList<Command> commands = new ArrayList<>();



    public PackAnimal(String name, LocalDate birth_date) {
        super(name, birth_date);

    }



    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public LocalDate getBirthDate() {
        return super.getBirthDate();
    }

    @Override
    public void getCommands() {
        for (Command com :commands) {
            System.out.println(com.getComandName());
        }
    }

    public void addCommand (Command command) {
        commands.add(command);
    }
}
