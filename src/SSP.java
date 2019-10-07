public class SSP {


//hvis den førse hånd vinder returneres 1
//hvis den anden hånd vinder returneres 2
//hvis uafgjort, returneres 0
//hvis der er fejl skal den returnere -1
int slaa(Haand a, Haand b){
    int resultat = -1;

    //første hånd papir
    if (a == Haand.PAPIR){
        //anden hånd være papir
        if (b==Haand.STEN){resultat = 1; }
        //anden hånd være sten
        if (b==Haand.SAKS){resultat = 2; }
        //anden hånd være saks
        if (b==Haand.PAPIR){resultat = 0; }
    }

    if (a == Haand.SAKS){
        //anden hånd være papir
        if (b==Haand.STEN){resultat = 2; }
        //anden hånd være sten
        if (b==Haand.SAKS){resultat = 0; }
        //anden hånd være saks
        if (b==Haand.PAPIR){resultat = 1; }
    }

    if (a == Haand.STEN){
        //anden hånd være papir
        if (b==Haand.STEN){resultat = 0; }
        //anden hånd være sten
        if (b==Haand.SAKS){resultat = 1; }
        //anden hånd være saks
        if (b==Haand.PAPIR){resultat = 2; }
    }

    return resultat;
}
//TODO flereKampe() {}

}
