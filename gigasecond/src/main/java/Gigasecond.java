import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;

public class Gigasecond {
    private final LocalDateTime _now;

    public Gigasecond(LocalDate moment) {
        this(moment.atTime(0,0));
    }

    public Gigasecond(LocalDateTime moment) {
        _now = moment.plus(Duration.ofSeconds(1000000000));
    }

    public LocalDateTime getDateTime() {
        return _now;
    }
}
