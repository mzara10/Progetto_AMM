/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook.Classi;

import java.util.ArrayList;

/**
 *
 * @author INFORMATICA
 */
public class UtenteFactory {
    
    //Pattern Design Singleton
    private static UtenteFactory singleton;

    public static UtenteFactory getInstance() {
        if (singleton == null) {
            singleton = new UtenteFactory();
        }
        return singleton;
    }
    
    private ArrayList<Utente> listaUtenti = new ArrayList<Utente>();
    
    private UtenteFactory(){
        //Creazione
        
        //Giuca Liurato
        Utente utente1 = new Utente();
        utente1.setId(0);
        utente1.setNome("Giuca");
        utente1.setCognome("Liurato");
        utente1.setFrasePresentazione("...chiedo scudo!");
        utente1.setPassword("123");
        utente1.setUrlFotoProfilo("foto/profiloGiurato.png");
        
        //Micele Liria
        Utente utente2 = new Utente();
        utente2.setId(1);
        utente2.setNome("Micele");
        utente2.setCognome("Liria");
        utente2.setFrasePresentazione("Arrivo in ritardo, ma ci sono!");
        utente2.setPassword("123");
        utente2.setUrlFotoProfilo("foto/Roby_Facchinetti.jpg");
        
        //Andrea Marzotto
        Utente utente3 = new Utente();
        utente3.setId(2);
        utente3.setNome("Andrea");
        utente3.setCognome("Marzotto");
        utente3.setFrasePresentazione("oh, a me il budino piace!");
        utente3.setPassword("123");
        utente3.setUrlFotoProfilo("foto/marzotto.png");
        
        listaUtenti.add(utente1);
        listaUtenti.add(utente2);
        listaUtenti.add(utente3);
        
    }
    
    public Utente getUtenteById(int id) {
        for (Utente utente : this.listaUtenti) {
            if (utente.getId() == id) {
                return utente;
            }
        }
        return null;
    }
    
    public int getIdByUserAndPassword(String user, String password){
        for(Utente utente : this.listaUtenti){
            if(utente.getNome().equals(user) && utente.getPassword().equals(password)){
                return utente.getId();
            }
        }
        return -1;
    }
    
}
