package caricaimmagine;

import java.awt.*;
import javax.swing.*;

public class MainCaricaImmagine {

    public static void main(String[] args) {
//        variabile String 
//        contiene il messaggio mostrato all'utente
        String msg = "Nome del file dell'immagine";
//        varaibile int
        int ancora;
//        creaimo la finestra
        JFrame frame = new JFrame("Proviamo a caricare l'immagine");
//        chiudi quando schiacci sulla X
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        do {

            String scelta;
//            costruisco un dialogo con l'utente
//            usando JFileChooser
            JFileChooser fc = new JFileChooser();
            int result = fc.showOpenDialog(null);
//            aggiungiamo al frame la classe anonima CaricaImmagine
//            alla quale passo scelta
            if (result == JFileChooser.APPROVE_OPTION) {
                scelta = fc.getSelectedFile().getName();
                frame.add(new CaricaImmagine(scelta));
            } else {
//            costruisco un dialogo con l'utente
//            usando il JOptionPane contenuto nella libreria swing
//            acquisice una stringa tramite una finestra
                scelta = JOptionPane.showInputDialog(msg);
                frame.add(new CaricaImmagine(scelta + ".jpg"));
            }

//            aggiungiamo le componenti grafiche
            frame.pack();
//            setto la visibilità a true
            frame.setVisible(true);
//            chiedo all'utente una conferma (si, no, annulla)
            ancora = JOptionPane.showConfirmDialog(null, "Anocra?");
        } while (ancora == JOptionPane.YES_OPTION);
    }
}
