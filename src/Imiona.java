enum Imiona {
    Ala(new String[]{"Ala", "Ali", "Alę", "Alą"}),
    Adrian(new String[]{"Adrian", "Adriana", "Adrianowi", "Adrianem", "Adrianie"}),
    Dominik(new String[]{"Dominik", "Dominika", "Dominikowi", "Dominikiem", "Dominiku"}),
    Ola(new String[]{"Ola", "Oli", "Olę", "Olą"});

    private final String[] odmiany;

    Imiona(String[] odmiany) {
        this.odmiany = odmiany;
    }

    public boolean matches(String slowo) {
        for (String odmiana : odmiany) {
            if (odmiana.equals(slowo)) {
                return true;
            }
        }
        return false;
    }

    public String getNieodmienione() {
        return odmiany[0];
    }
}
