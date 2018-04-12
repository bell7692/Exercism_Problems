import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    LocalDate birthDate;
    LocalDateTime birthDateTime;


    Gigasecond(LocalDate birthDate) {
        this.birthDateTime = birthDate.atTime(0,0);
    }

    Gigasecond(LocalDateTime birthDateTime) {
        this.birthDateTime = birthDateTime;
    }

    LocalDateTime getDate() {
        return this.birthDateTime.plus(Duration.ofSeconds(1000000000));

    }

}
