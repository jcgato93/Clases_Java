package Manejo_Excepciones;

import java.awt.*;

import javax.swing.*;

import javax.imageio.*;

import java.io.*;

public class try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoImagen mimarco=new MarcoImagen();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

class MarcoImagen extends JFrame{
	
	
	public MarcoImagen(){
		
		setTitle("Marco Con Imagen");
		
		setBounds(750,300,300,200);
		
		LaminaConImagen milamina=new LaminaConImagen();
		
		add(milamina);
                
	}
	
}

class LaminaConImagen extends JPanel{
	
	
	public LaminaConImagen(){
		
		try{
		
		imagen=ImageIO.read(new File("src/Recursos/database.png"));//aqu� pon tu propia ruta e imagen
		
		}catch(IOException e){//en caso de que muevan la imagen , seguira al "catch"
			
			System.out.println("La imagen no se encuentra");
			
		}
		
	
	}
	
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		if(imagen==null){//si no encuentra la imagen , que dibuje en las coordenadas 10,10 el mensaje
			
			g.drawString("no podemos cargar la imagen", 10, 10);
		}else{
		
		int anchuraImagen=imagen.getWidth(this);//captura el ancho de la imagen
		
		int alturaImagen=imagen.getHeight(this);//captura el alto de la imagen
		
		g.drawImage(imagen, 0, 0, null);
		
		for(int i=0;i<300;i++){
			
			for(int j=0;j<200;j++){
				
				if(i+j>0){
				
				g.copyArea(0, 0, anchuraImagen, alturaImagen,anchuraImagen*i, alturaImagen*j);//copia la imagen
				
				}
			}
		}
		
		}
						
	}
	
	private Image imagen;
}



