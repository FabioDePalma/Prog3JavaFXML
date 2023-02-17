> Ricordarsi di configurare per ogni main il **run configuration**
> - Se non è mai stato configurato configurare una nuova applicazione
> - andare nella sezione Build and Run, fare click su modify options(a destra)
> - nella scheda Java fare click su add VM options e inserire questo:\
 --module-path "C:\Program Files\Java\javafx-sdk-19.0.2.1\lib" --add-modules javafx.controls,javafx.fxml
# 
# Appunti
## Uso di java Beans e Properties
Usiamo le properties dei java beans per caratterizzare i dati del model in modo standard.\
Impariamo a usare le properties dei JavaBeans, e ad associare Listeners alle properties, per reagire ai cambiamenti di valore delle properties in modo automatico.

L'obiettivo è evitare di scrivere codice dettagliato per visualizzare nella GUI i valori delle property mentre cambiano, e/o per inizializzare i valori delle property a partire dai dati acquisiti in input (form) nella GUI

## JavaBeans
I Java Beans sono classi java che rispettano uno standard di definizione dei metodi e delle loro variabili di istanza (o di stato)

- Per ogni variabile _xxx_ di istanza che vogliamo esporre come **property** del javabean, noi dobbiamo definire il metodo
`
public Type getXxx()
`
, per leggere valore della property
- Se vogliamo permettere di modificare il valore della property, dobbiamo definire anche il metodo 
`
public void setXxx()
`
, per assegnare un valore alla property
### Il concetto di property è slegato dall'esistenza di variabili di istanza nel java bean:

- Il java bean può avere **variabili di istanza private
  che non sono property** (in quanto prive di
  metodo getXxx()) e servono internamente per le
  computazioni
- **Il nome di una property è determinato dai
  metodi getXxx() e setXxx()**, NON dal nome della
  variabile di istanza ad essa associata

### Una property potrebbe derivare dall'esecuzione di un metodo getXxx() del java bean

- Noi possiamo definire metodi getYyy() (e quindi
properties) utili per eseguire codice applicativo
che utilizza lo stato del bean e fa riferimento a più
variabili del bean per restituire risultati
- esempio: se un java bean memorizza due valori
  numerici in variabili di istanza private, noi
  possiamo definire una property "prodotto", basata
  sulla definizione del metodo getProdotto(), che
  restituisce il prodotto dei due valori
