public class StenSaksPapir {

    /** Hvis den første haand vinder retuneres 1
     * Hvis den anden haand vinder retuneres 2
     * Hvis den er uafgjort retuneres 0
     * Hvis fejl retuneres -1*/

    int slaa(Haand a,Haand b) {

    int resultat = -1;
        /** Første hånd sten */
        if (a == Haand.Sten) {
            if (b == Haand.Sten) { resultat = 0; }
            if (b == Haand.Saks){ resultat = 2; }
            if (b == Haand.Papir) { resultat = 1; }
               }
        /** Første hånd saks */
        if (a == Haand.Saks) {
            if (b == Haand.Sten) { resultat = 1; }
            if (b == Haand.Saks){ resultat = 0; }
            if (b == Haand.Papir) { resultat = 2; }
              }
        /** Første hånd papir */
        if (a == Haand.Papir) {
            if (b == Haand.Sten) { resultat = 2; }
            if (b == Haand.Saks){ resultat = 1; }
            if (b == Haand.Papir) { resultat = 0; }
             }
        return resultat;
    }

}


