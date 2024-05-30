package hw08;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.scene.shape.*;
import javafx.scene.text.*;


/**
 * This is a class to display a collection of objects that form an image.
 * 
 * @author Michael Salazar, 401146782, CS2012, Sections 01/02
 * https://calstatela.instructuremedia.com/embed/0fb0d951-9f79-4aee-b424-f98b9b6bc732
 */
public class JavaFXArt extends Application {
	
	@Override
	public void start(Stage primaryStage) { 
		
		Polyline cape = new Polyline(340,220, 450, 160, 650, 240, 800, 250, 900,400, 930,430, 850,400, 840, 520, 720, 440, 690, 500,  600, 420, 550,560);
		cape.setFill(Color.BLACK);
		cape.setStroke(Color.WHITESMOKE);
		
		Text name = new Text(850,580, "Michael Salazar");
		name.setScaleX(2);
		name.setScaleY(2);
		
		Scene scene = new Scene(new Pane(mark(), sword(),cape,legs(),torso(), head(), name), 1000, 600); 
		scene.setFill(Color.RED);
		primaryStage.setScene(scene); 
		primaryStage.setTitle("Berserk");
		primaryStage.setResizable(false);
		primaryStage.show(); 
	} 
	
	public static void main(String[] args) { 
		Application.launch(); 
	} 
	
	/**
	 * A method that creates shapes and puts them into a group to form the sword.
	 * @return The group of shapes that form the sword.
	 */
	public Group sword() {
		Polygon blade = new Polygon(250, 200, 250, 75, 900, 75,1000, 130, 900, 200);
		blade.setFill(Color.BLACK);
		blade.setStroke(Color.SILVER);
		blade.setRotate(-2);
		blade.setStrokeWidth(20);
		
		Rectangle hilt = new Rectangle(40,162,20,25);
		hilt.setFill(Color.DARKGREY);
		hilt.setStroke(Color.BLACK);
		hilt.setRotate(-2);
	
		Rectangle hilt2 = new Rectangle(50,160,200,20);
		hilt2.setFill(Color.BROWN);
		hilt2.setStroke(Color.BLACK);
		hilt2.setRotate(-2);
		
		Circle handL = new Circle(220,160,30);
		handL.setFill(Color.BLACK);
		handL.setStroke(Color.WHITESMOKE);
		
		Rectangle forearmL = new Rectangle(200, 160, 50, 80); 
		forearmL.setFill(Color.BLACK);
		forearmL.setStroke(Color.WHITESMOKE);
		forearmL.setRotate(3);
		forearmL.setArcHeight(10);
		forearmL.setArcWidth(10);
		
		Arc elbowL = new Arc(270, 220, 80, 80, 180, 50);
		elbowL.setFill(Color.BLACK);
		elbowL.setStroke(Color.WHITESMOKE);
		elbowL.setType(ArcType.ROUND);
		
		Rectangle bicepR = new Rectangle(210, 215, 130, 60); 
		bicepR.setFill(Color.BLACK);
		bicepR.setStroke(Color.WHITESMOKE);
		bicepR.setArcHeight(10);
		bicepR.setArcWidth(10);
		
		Group sword = new Group();
		sword.getChildren().addAll(hilt2,hilt,bicepR,forearmL,handL, elbowL, blade);
		
		return sword;
	}
	
	/**
	 * A method that creates shapes and puts them into a group to form the mark.
	 * @return A group of shapes that form the mark.
	 */
	public Group mark() {
		
		Line mark1 = new Line(125,575, 25, 475);
		mark1.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
		mark1.setStrokeWidth(20);
		
		Line mark2 = new Line (125,575, 225, 475);
		mark2.setStroke(mark1.getStroke());
		mark2.setStrokeWidth(20);
		
		Line mark3 = new Line(25,475, 225, 275);
		mark3.setStroke(mark1.getStroke());
		mark3.setStrokeWidth(20);
		
		Line mark4 = new Line(225, 475, 25, 275);
		mark4.setStroke(mark1.getStroke());
		mark4.setStrokeWidth(20);
		
		Line mark5 = new Line(125, 250, 125, 570);
		mark5.setStroke(mark1.getStroke());
		mark5.setStrokeWidth(20);
		
		Polyline mark6 = new Polyline (12,275, 70, 200, 30, 270);
		mark6.setFill(mark1.getStroke());
		mark6.setStroke(mark1.getStroke());
		
		Polyline mark7 = new Polyline(115,240,105, 220, 115, 225, 125, 200, 135, 225,145, 220, 135, 240);
		mark7.setFill(mark1.getStroke());
		mark7.setStroke(mark1.getStroke());
		
		Group mark = new Group();
		mark.getChildren().addAll(mark1, mark2, mark3, mark4, mark5, mark6, mark7);
		
		return mark;
	}
	
	/**
	 * A method that creates shapes and puts them into a group to form the torso.
	 * @return A group of shapes that form the torso.
	 */
	public Group torso() {
		Rectangle abdomen = new Rectangle(380,220, 110, 200);
		abdomen.setFill(Color.BLACK);
		abdomen.setStroke(Color.WHITESMOKE);
		abdomen.setRotate(0);
		abdomen.setArcHeight(10);
		abdomen.setArcWidth(10);
		
		Arc chest = new Arc(500, 200, 200, 200, 180, 50);
		chest.setFill(Color.BLACK);
		chest.setStroke(Color.WHITESMOKE);
		chest.setType(ArcType.ROUND);
		
		Arc groin = new Arc(420, 480, 100,100, 50,80);
		groin.setFill(Color.BLACK);
		groin.setStroke(Color.WHITESMOKE);
		groin.setType(ArcType.ROUND);
		
		Rectangle bicepL =  new Rectangle(470, 250, 50, 120);
		bicepL.setFill(Color.BLACK);
		bicepL.setStroke(Color.WHITESMOKE);
		bicepL.setRotate(-8);
		
		Arc shoulder = new Arc(420,270, 120,120, 10, 40);
		shoulder.setFill(Color.BLACK);
		shoulder.setStroke(Color.WHITESMOKE);
		shoulder.setType(ArcType.ROUND);
		
		Circle elbowR = new Circle(500,380, 30);
		elbowR.setFill(Color.BLACK);
		elbowR.setStroke(Color.WHITESMOKE);
				
		Polygon forearmR = new Polygon(470, 380, 450, 510, 470, 520, 530, 390);
		forearmR.setFill(Color.BLACK);
		forearmR.setStroke(Color.WHITESMOKE);
		
		Circle handR = new Circle(460,525,25);
		handR.setFill(Color.BLACK);
		handR.setStroke(Color.WHITESMOKE);
		
		Group torso = new Group();
		torso.getChildren().addAll(abdomen,chest,groin,bicepL,shoulder,forearmR,elbowR,handR);
		
		return torso;
	}
	
	/**
	 * A method that creates shapes and puts them into a group to form the head.
	 * @return A group of shapes that form the head.
	 */
	public Group head() {
		Polygon head = new Polygon(360, 270, 300, 170, 310, 160, 300, 150, 310, 120, 360, 80, 410, 120, 420, 150, 410,160, 420, 170);
		head.setFill(Color.BLACK);
		head.setStroke(Color.WHITESMOKE);
		head.setRotate(-2);
		
		Polyline earL = new Polyline(300, 130, 320, 50, 325, 110);
		earL.setFill(Color.BLACK);
		earL.setStroke(Color.WHITESMOKE);
		earL.setRotate(-10);
		
		
		Polyline earR = new Polyline(420, 130, 400, 50, 395, 110);
		earR.setFill(Color.BLACK);
		earR.setStroke(Color.WHITESMOKE);
		earR.setRotate(8);
		
		Line eyeL = new Line(320,160, 350, 200);
		eyeL.setFill(Color.RED);
		eyeL.setStroke(Color.RED);
		eyeL.setStrokeWidth(5);
		
		Line eyeR = new Line(400,160, 370, 200);
		eyeR.setFill(Color.RED);
		eyeR.setStroke(Color.RED);
		eyeR.setStrokeWidth(5);
		
		Group face = new Group();
		face.getChildren().addAll(head, earL, earR, eyeL, eyeR);
		
		return face;
	}
	
	/**
	 * A method that creates shapes and puts them into a group to form the legs.
	 * @return A group of shapes that form the legs
	 */
	public Group legs() {
		
		Ellipse quadL = new Ellipse(320,480, 30,100);
		quadL.setFill(Color.BLACK);
		quadL.setStroke(Color.WHITESMOKE);
		quadL.setRotate(60);
		
		Ellipse quadR = new Ellipse(500,480, 30,100);
		quadR.setFill(Color.BLACK);
		quadR.setStroke(Color.WHITESMOKE);
		quadR.setRotate(-30);
		
		Arc kneeL = new Arc(280, 550, 80, 80, 120, 50);
		kneeL.setFill(Color.BLACK);
		kneeL.setStroke(Color.WHITESMOKE);
		kneeL.setType(ArcType.ROUND);
		
		
		Circle kneeR = new Circle(550,560, 30);
		kneeR.setFill(Color.BLACK);
		kneeR.setStroke(Color.WHITESMOKE);
		
		Ellipse calfL = new Ellipse(215,600, 30,100);
		calfL.setFill(Color.BLACK);
		calfL.setStroke(Color.WHITESMOKE);
		calfL.setRotate(20);
		
		Ellipse calfR = new Ellipse(580,650, 30,100);
		calfR.setFill(Color.BLACK);
		calfR.setStroke(Color.WHITESMOKE);
		calfR.setRotate(-20);
		
		Group legs = new Group();
		legs.getChildren().addAll(quadL, quadR, calfL, calfR,kneeL,kneeR);
		return legs;
	}
	
}
