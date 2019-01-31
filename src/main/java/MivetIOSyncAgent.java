import org.apache.commons.cli.*;

public class MivetIOSyncAgent {

    private static void printHelp(Options options) {
        HelpFormatter formater = new HelpFormatter();
        formater.printHelp("mivet.io dbsync", options);
    }

    private static CommandLine parseOptions(String[] args) {
        Options  options = new Options();

        options.addOption("d", "database", true, "Database filepath");
        options.addOption("g", "gui", false, "UI mode");
        options.addOption("h", false, "Print help");

        CommandLineParser parser = new DefaultParser();

        CommandLine cmd = null;

        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            printHelp(options);
            e.printStackTrace();
        }

        if (cmd.hasOption('h')) {
            printHelp(options);
        }

        return cmd;
    }

    public static void main(String[] args) {

        CommandLine cmd = parseOptions(args);

        
    }
}
