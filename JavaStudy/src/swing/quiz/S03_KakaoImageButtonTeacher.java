package swing.quiz;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class S03_KakaoImageButtonTeacher extends JButton{

	public static final int RYON = 0;
	public static final int APEACH = 1;
	public static final int MUJI = 2;
	public static final int TUBE = 3;
	
	private static HashMap<Integer, Image> btn_images = new HashMap<>();
	
	static {
		try {
			BufferedImage src = ImageIO.read(new File("./image/kakao.jpg"));

			int crop_width = src.getWidth() / 2 -44;
			int crop_height = src.getHeight() / 2 - 43;
			
			
			//BufferedImage의 getSubimage(x,y,width,height);
			btn_images.put(RYON, src.getSubimage(41, 41, src.getWidth()/2 -41, src.getHeight()/2 -41));
			btn_images.put(APEACH, src.getSubimage(src.getWidth()/2, 0, src.getHeight()/2, src.getHeight()/2));
			btn_images.put(MUJI, src.getSubimage(0, 100, 100, 100));
			btn_images.put(TUBE, src.getSubimage(100, 100, 100, 100));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public S03_KakaoImageButtonTeacher(int picture, int x, int y, int width, int height) {
		
		//이해해볼것(MAP의 키값이용하여 이미지를 꺼내는것
		setIcon(new ImageIcon(btn_images.get(picture).getScaledInstance(width, height, Image.SCALE_SMOOTH)));
		setBounds(x,y,width,height);
		
	}
}
