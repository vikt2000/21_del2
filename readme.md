# CDIO delopgave 2 

Spil Loop

  Start Spil

    do
      vælg spiller1 ved at indtaste kontoNummer
      find konto2 i kontoListe udfra kontoNummer
    while konto2 ikke fundet 

    spiller[1]=konto1

    do
      vælg spiller2 ved at indtaste kontoNummer
      find konto2 i kontoListe udfra kontoNummer
    while konto2 ikke fundet 

    spiller[2]=konto2

  Eksekver Spil 
  
    tur = Vælg tilfældigt tal, enten 1 eller 2

    while( spiller1.getBalance() < 3000 && spiller2.balance() <3000)
      slag1 = kast terning 1
      slag2 = kast terning 2

      sum = slag1 + slag 2
 
      felt=feltListe.get(sum);     
  
    if(spiller1.getBalance() > spiller2.getBalance())
      Spiller1 Vinder
    else
      Spiller2 Vinder

  Spil Færdig
    
while Spil igen?  


Data Model

Terning
  antalSider: 1..6

kontoListe : List<Konto>
  konto1
  konto2
  konto3

Konto
  kontoNummer  : 1
  fornavn      : William
  efternavn    : Kofoed
  balance      : 1000
  
  indsæt ( 1000)
  hæv (1000)

Spiller
  Konto

Felt
  navn
  beløb
  ekstratur

feltliste List<Felt> List.of()
  null
  new Felt("EN",Tower",250,false)
  new Felt("EN","Crater",-100,false);
  new Felt("EN","Palace gates",100,false);
  new Felt("EN","Cold Desert,-20, false);
  new Felt("EN","Walled city", 180, false);
  new Felt("EN","Monastery",0,false);
  new Felt("EN","Black cave",-70,false);
  new Felt("EN","Huts in the mountain",60,false);
  new Felt("EN","The Werewall (werewolf-wall),-80,true);
  new Felt("EN","The pit", -50,false);
  new Felt("EN","Goldmine",+650,false);
)