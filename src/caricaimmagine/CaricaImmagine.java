package caricaimmagine;

//importo tutti gli oggetti 
//contenuti nella libreria awt
import java.awt.*;
//importo tutti gli oggetti della libreria io
import java.io.*;

//importo la classe ImageIO
import javax.imageio.ImageIO;
//imporo tutti gli ogetti 
//contenuti nella libreria swing
import javax.swing.*;

//creo una classe 
//che derivi da un oggetto qualsi della libreria swing
//creo il pannello nel quale carico un'immagine
public class CaricaImmagine extends JPanel {

//    creo un puntatore alla classe Image
    Image img;

//    COSTRUTTORE
    public CaricaImmagine(String s) {
//        leggo e memorizzo l'immagine da un file
//        la inserisco in Image
//        creando una classe anonima File
//        devo gestire l'eccezione altrimenti non va in esecuzione
//        perchè non sa che file prendere
        try {
            img = ImageIO.read(new File("Images/" + s + ".jpg"));
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
//        setta il colore di sfondo
        setBackground(Color.black);
//        setto le dimensioni preferite (in pixel)
//        creando una classe Dimension anonima
//        imposto le dimensioni a null
//        in modo che prenda la grandezza dell'immagine
        setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
    }

//    creo un metodo che sovrescriva il metodo già esistente
//    passandoli la componente grafica
    @Override
    public void paintComponent(Graphics g) {
//        chiamo il metodo paintComponent già esistente
        super.paintComponent(g);
//        disegno l'immagine dandoli la posizione
        g.drawImage(img, 0, 0, this);
    }
}
