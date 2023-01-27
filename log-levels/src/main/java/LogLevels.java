import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class LogLevels {
    private LogLevels() {
    }

    private static final Pattern _pattern = Pattern.compile("^\\[(.+?)]:\\s*(.+?)\\s*$");

    public static LogEvent parse(String line) throws InvalidLogException {
        Matcher m = _pattern.matcher(line);
        if (!m.find()) {
            throw new InvalidLogException();
        }
        return new LogEvent(m.group(1).toLowerCase(), m.group(2));
    }

    public static class InvalidLogException extends IllegalArgumentException {
        public InvalidLogException() {
            super("line is not a valid log message");
        }
    }

    public static String message(String line) throws InvalidLogException {
        return parse(line).message();
    }

    public static String logLevel(String line) throws InvalidLogException {
        return parse(line).level();
    }

    public static String reformat(String line) throws InvalidLogException {
        LogEvent ev = parse(line);
        return ev.message() + " (" + ev.level() + ")";
    }
}
