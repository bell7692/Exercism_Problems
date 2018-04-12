import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    //& (bitwise and)
    // Binary AND Operator copies a bit to the result if it exists in both operands.

    List<Signal> calculateHandshake(int number) {
       ArrayList<Signal> signals = new ArrayList<Signal>();;
        if ((number & 1) > 0) signals.add(Signal.WINK);
        if ((number & 2) > 0) signals.add(Signal.DOUBLE_BLINK);
        if ((number & 4) > 0) signals.add(Signal.CLOSE_YOUR_EYES);
        if ((number & 8) > 0) signals.add(Signal.JUMP);
        if ((number & 16) > 0) Collections.reverse(signals);
        return signals;
    }


}
