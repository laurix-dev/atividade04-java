package Kingdom.implementations.Elf;

import Kingdom.interfaces.King;

public class ElfKing implements King {
    static final String DESCRIPTION = "This is the elven king!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
