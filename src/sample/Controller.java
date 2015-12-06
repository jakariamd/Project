package sample;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

import javax.swing.text.html.ImageView;


public class Controller {
    @FXML
    private Rectangle rec00 ;

    @FXML
    private Rectangle rec01 ;
    @FXML
    private Rectangle rec02 ;
    @FXML
    private Rectangle rec03 ;
    @FXML
    private Rectangle rec04 ;
    @FXML
    private Rectangle rec05 ;
    @FXML
    private Rectangle rec06 ;
    @FXML
    private Rectangle rec07 ;
    @FXML
    private Rectangle rec08 ;
    @FXML
    private Rectangle rec09 ;
    @FXML
    private Rectangle rec10 ;
    @FXML
    private Rectangle rec11 ;
    @FXML
    private Rectangle rec12 ;
    @FXML
    private Rectangle rec13 ;
    @FXML
    private Rectangle rec14 ;
    @FXML
    private Rectangle rec15 ;

    public Image image = new Image("sample/steel.jpg",true) ;
    @FXML
    private BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
            BackgroundSize.DEFAULT) ;



    String color[] = {"RED" , "BLACK" , "BLUE" , "GREEN"} ;

    int[] arr = new int[16];
    int i = 0 ;


    @FXML
    public void mouseClicked(MouseEvent e) {
        Rectangle rec = (Rectangle) e.getSource() ;
        int j = (int)rec.getId().charAt(3) * 10 + (int) rec.getId().charAt(4)-(480+48) ;
        //System.out.println((int)rec.getId().charAt(3) * 10 + (int) rec.getId().charAt(4)-(480+48)) ;
        if(arr[j] >= 1){}
        else {
            rec.setFill((Paint.valueOf(color[i++ % 4])));
            arr[j] += 1 ;
            System.out.println((int)rec.getId().charAt(3) * 10 + (int) rec.getId().charAt(4)-(480+48)) ;
        }
    }
}
