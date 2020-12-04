package giusti.felipe.enums;

import java.util.Arrays;
import java.util.Optional;

public enum RacasEnum {
    NAO_DEFINIDO(-1) ,ANAO(1), ORC(2), CENTAURO(3), ELFO(4), HUMANO(5), FURRY(6),
    LIZARDMAN(7), HALFLING(8);


    // Implementacao int com enum
    //https://stackoverflow.com/questions/11047756/getting-enum-associated-with-int-value
    private int value;

    RacasEnum(int value){
        this.value = value;
    }

    public static Optional<RacasEnum> valueOf(int value) {
        return Arrays.stream(values())
                .filter(legNo -> legNo.value == value)
                .findFirst();
    }



}
