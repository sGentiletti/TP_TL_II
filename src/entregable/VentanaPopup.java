package entregable;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class VentanaPopup {
	private JFrame frame;
	private Dimension dmVentana = new Dimension(600, 200);
	private JButton boton = new JButton("OK");

	public VentanaPopup(String msj) {
		Dimension dmPantalla = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (dmPantalla.width - dmVentana.width) / 2;
		int y = (dmPantalla.height - dmVentana.height) / 2;

		frame = new JFrame("Resultado");
		frame.setSize(dmVentana);
		frame.setLocation(x, y);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		Image icon = new ImageIcon(getClass().getResource("/imagens/pokebola.png")).getImage();
		frame.setIconImage(icon);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(panel);
		panel.setLayout(null);

		JLabel lblLabel = new JLabel(msj);
		lblLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblLabel.setBounds(42, 30, 555, 49);
		panel.add(lblLabel);

		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		boton.setBounds(240, 110, 105, 27);
		panel.add(boton);

		frame.setResizable(false);
		frame.setVisible(true);
	}
}
