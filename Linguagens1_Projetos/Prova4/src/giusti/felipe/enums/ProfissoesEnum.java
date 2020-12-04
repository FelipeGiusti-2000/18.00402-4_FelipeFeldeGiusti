package giusti.felipe.enums;

import java.util.Arrays;
import java.util.Optional;

public enum ProfissoesEnum {
    NAO_DEFINIDO(-1) ,ALQUIMISTA(1), ARQUEIRO(2), FERREIRO(3), MINERADOR(4),
    VENDEDOR(5), ESPADACHIM(6), MAGO(7), SACERDOTE(8), CAVALEIRO(9), LADRAO(10);

    private int value;

    ProfissoesEnum(int value){
        this.value = value;
    }

    public static Optional<ProfissoesEnum> valueOf(int value) {
        return Arrays.stream(values())
                .filter(legNo -> legNo.value == value)
                .findFirst();
    }
}
