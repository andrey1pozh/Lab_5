
import java.util.Scanner;

public class app {
    public static final String PS1 = "$ ";
    public static final String PS2 = "> ";

    public static void main(String[] args) {
        try (Scanner userScanner = new Scanner(System.in)) {
            final String envVariable = "C:\\Users\\andre\\IdeaProjects\\Lab_5\\src\\marinesCollection.json";
            MarineAsker marineAsker = new MarineAsker(userScanner);
            FileManager fileManager = new FileManager(envVariable);
            CollectionManager collectionManager = new CollectionManager(fileManager);
            CommandManager commandManager = new CommandManager(
                new HelpCommand(),
                new InfoCommand(collectionManager),
                new ShowCommand(collectionManager),
                new AddCommand(collectionManager, marineAsker),
                new UpdateCommand(collectionManager, marineAsker),
                new RemoveByIdCommand(collectionManager),
                new ClearCommand(collectionManager),
                new SaveCommand(collectionManager),
                new ExitCommand(),
                new ExecuteScriptCommand(),
                new AddIfMinCommand(collectionManager, marineAsker),
                new RemoveGreaterCommand(collectionManager, marineAsker),
                new HistoryCommand(),
                new SumOfHealthCommand(collectionManager),
                new FilterByWeaponTypeCommand(collectionManager)
            );
            Console console = new Console(commandManager, userScanner, marineAsker);

            console.interactiveMode();
        }
    }
}
