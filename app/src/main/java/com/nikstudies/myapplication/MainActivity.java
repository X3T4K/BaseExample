package com.nikstudies.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //dichiaro gli elementi che ho bisogno
    Button readNotification;
    TextView txtView;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        readNotification = findViewById( R.id.ReadNotification );
        txtView = (TextView) findViewById(R.id.textView1 );

        //imposto sull'evento onClick per il Button readNotification
        readNotification.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick( View view ) {
                //doSomething(..)
            }
        } );


    }

    //imposto sull'evento onClick per il Button readNotification, notare la somiglianza tra la riga 41 e la riga 33
    //controllare nel file activity_main.xml alla riga 28, l'attributo del Button.
    // l'aggancio tra interfaccia è dato dall'argomento del metodo: View view, come ogni metodo creato può essere chiamato come si vuole
    public void onClick(View view){
        //doSomething(..)
    }

    //vedete come il writeNotification sia agganciato lo stesso all'interfaccia (indicato dalla scritta color giallo)
    //andare a controllare l'attributo onClick nel activity_main.xml per questo Button
    public void writeNotification (View view){
        //doSomething(..)

    }

    public void declarAarray (int n){
        //dichiara un array di string di n elementi, essendo un metodo gli passo gli elementi nelle parentesi alla riga 57
        String[] array = new String[n];
        /*in generale
        Type[] name = new Type[n];
         il tipo è quello che serve, può essere qualsiasi oggetto: string, int, button, textview, switch, bool etc
         */
    }

    public void declareForcycleandWorkwithArray(int n){
        //dichiaro un array di n elementi
        String[] array = new String[n];
        //lo riempio con "ciao", dato che non ho esempi veri da poter portare
        Arrays.fill( array, "ciao" );
        // dichiaro un for che stampa gli elementi dell'array fino a che gli elementi non sono finiti,
        // ovvero fino a che ha letto l'indice max, in questo caso quando i = n
        for (int i=0; i<n; i++){
            //leggo
            System.out.println(array[i]);
            //scrivo, trattando ad ogni lettura una singola scatola, ovvero una singola variabile
            array[i] = "ciao";
        }
    }

    //fixare (correggere) l'errore in questo metodo se si vuole
    public void declareAnduseWhile(){
        //dichiaro una classe di sistema in grado di generare dati casuali
        Random random = new Random(); //notare la sintassi ricorrente Type name = new Type();
        //dichiaro una boolean ad hoc, senza assegnarle alcun valore
        boolean b;
        //ciclo while, ricordo che il ciclo while, si ripete fino a che la condizione interna
        //alle parentesi non è verificata.
        while (b){
            //ad ogni ciclo prelevo dalla classe random una bool casuale
            random.nextBoolean();
            //se sarà true (1), il ciclo finirà, altrimenti si ripeterà
        }
    }

    public void declareList (int n){
        //dichiara una lista di string di n elementi, essendo un metodo gli passo gli elementi nelle parentesi alla riga 96
        List<String> List = new ArrayList<String>(n);
        /*in generale
        List<Type> name = new ArrayList<Type>(NumeroDiElementi);
         il tipo è quello che serve, può essere qualsiasi oggetto: string, int, button, textview, switch, bool etc
         */
    }

    public void operatewithList(int n){
        //dichiara una lista di string di n elementi
        List<String> List = new ArrayList<String>(n);

        //leggo dalla lista e posiziono quel valore in una singola variabile di tipo string, creata ad hoc sul momento
        int i = 1; //in generale un indice qualsiasi
        String singleListElement = List.get( i );

        //scrivo nella lista
        List.add( "generalValue" );

        //scrivo in un indice preciso
        List.set( i, "value" );

        /*
        i metodi che operano sulle stringe necessitano generalmente di 2 argomenti per lavorare, il valore e l'indice: il cosa ed il dove.
         */
    }
 
}
