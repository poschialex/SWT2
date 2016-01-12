member(X,[X|_]).
member(X,[_|L]) :- member(X,L).

eingeschriebenBAInf(studi). %Fact
forall(Fach,pruefung(studi,Fach,3,1)). %Fact
pruefung(studi, 1569691, 2, 1).
inRegelstudienZeit(studi).
abgegebeneErklärung(studi).

inRegelstudienZeitPlusVier(Person) :- inRegelStudienZeit(Person).

requires(1569726, 1569706). %SWT
requires(1569889, 1569891). %TGI
requires(1569889, 1569890).
requires(1569756, 1569757). /*Datenbanken und Rechnernetze*/
requires(1569756, 1569758).
requires(1569847, 1569849). /*Mathe 1*/
requires(1569848, 1569850). 
requires(1569846, 1569847). %usw

zugelassenZuPruefung(Person, Fach) :- requires(Fach, X), bestanden(Person, X).
bestanden(Person,Fach) :- pruefung(Person, Fach, Note, Versuche), Versuche <= 3, Note <4.1.
nichtBestanden(Person,Fach) :- pruefung(Person, Fach, Note, Versuche), Versuche > 3.0.
nichtBestanden(Person,Fach) :- pruefung(Person, Fach, Note, Versuche), Note >= 4.1.

accZuVieleDrittversuche(Person,[H|Faecher],Zahl) :- pruefung(Person,H,Note,Versuche>=3.0), accZuVieleDrittversuche(Person,Faecher],Zahl - 1.0).
accZuVieleDrittversuche(Person,[H|Faecher],Zahl) :- pruefung(Person,H,Note,Versuche<=3.0), accZuVieleDrittversuche(Person,Faecher,Zahl).
accZuVieleDrittversuche(Person,[H|_],0).

bachelorZugelassen(Person) :- forall(Fach,bestanden(Person,Fach)), eingeschriebenBAInf(Person), fachlicheErklärung(Person), not(accZuVieleDrittversuche(Person,liste,2)).
bachelorGeprueft(Person) :- bachlorZugelassen(Person), inRegelstudienZeitPlusVier(Person).
bsc(Person) :- bachelorGeprueft(Person).

me(1569691,"INF-B-210 Algorithmen und Datenstrukturen").
me(1569696,"INF-B-240 Programmierung").
me(1569701,"INF-B-270 Formale Systeme").
me(1569706,"INF-B-310 Softwaretechnologie").
me(1569711,"INF-B-260 Informations- und Kodierungstheorie").
me(1569716,"INF-B-330 Rechnerarchitektur").
me(1569721,"INF-B-380 Betriebssysteme und Sicherheit").
me(1569726,"INF-B-320 Softwaretechnologie-Projekt").
me(1569731,"INF-B-410 Einführung in die Medieninformatik").
me(1569736,"INF-B-420 Einführung in die Computergraphik").
me(1569746,"INF-B-3A0 Systemorientierte Informatik/ Hardware Software-Codesign").
me(1569756,"INF-B-370 Datenbanken und Rechnernetze").
me(1569757,"INF-B-370-1 Datenbanken").
me(1569758,"INF-B-370-2 Rechnernetze").
me(1569775,"INF-B-3B0 Intelligente Systeme").
me(1569798,"INF-B-290 Theoretische Informatik und Logik").
me(1569803,"INF-B-610 Allgemeine Qualifikation").
me(1569808,"INF-BA Bachelorarbeit").
me(1569813,"INF-B-230 Einführungspraktikum").
me(1569846,"INF-B-110 Einführung in die Mathematik für Informatiker").
me(1569847,"INF-B-110-1 Einführung in die Mathematik 1").
me(1569848,"INF-B-110-2 Einführung in die Mathematik 2").
me(1569849,"INF-B-110-1-VL Mathematik Vorleistung").
me(1569850,"INF-B-110-2-VL Mathematik Vorleistung").
me(1569862,"INF-B-420-1 Einführung in die Computergraphik").
me(1569864,"INF-B-420-2 Computergraphik Praktikum").
me(1569872,"INF-B-120 Mathematische Methoden für Informatiker").
me(1569873,"INF-B-120-1 Mathematische Methoden 1").
me(1569874,"INF-B-120-2 Mathematische Methoden 2").
me(1569875,"INF-B-120-1-VL Mathematik Vorleistung").
me(1569876,"INF-B-120-2-VL Mathematik Vorleistung").
me(1569889,"INF-B-390 Technische Grundlagen und Hardware-Praktikum").
me(1569890,"INF-B-390-1 Technische Grundlagen").
me(1569891,"INF-B-390-2 Hardware-Praktikum").
me(1569900,"Bachelor Informatik 2009").
me(2066555,"INF-B-510 Vertiefung").
me(2066560,"INF-B-520 Vertiefung zur Bachelorarbeit").
 
liste = [1569691,
1569696,
1569701,
1569706,
1569711,
1569716,
1569721,
1569726,
1569731,
1569736,
1569746,
1569756,
1569757,
1569758,
1569775,
1569798,
1569803,
1569808,
1569813,
1569846,
1569847,
1569848,
1569849,
1569850,
1569862,
1569864,
1569872,
1569873,
1569874,
1569875,
1569876,
1569889,
1569890,
1569891,
1569900,
2066555,
2066560]

