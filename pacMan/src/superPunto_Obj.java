
/* CLASE superPunto_Obj derivada de la clase padre objetosJuego
  * Creado por:Carlos Gustavo Valladares y Raziel Oswaldo prado
 * 26/11/2023
 */
import javax.swing.ImageIcon;

public class superPunto_Obj extends objetosJuego {

	public superPunto_Obj(int x, int y) {
		ImageIcon ii = new ImageIcon(this.getClass().getResource("/superpill.png"));
		imagen = ii.getImage();
		this.x = x;
		this.y = y;
		width = imagen.getWidth(null);
		height = imagen.getHeight(null);
		clase = 3;
		activo = true;

		// TODO Auto-generated constructor stub
	}

}
