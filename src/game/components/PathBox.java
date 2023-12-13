package game.components;

import javax.swing.*;
import java.awt.*;

public class PathBox {
	private Monster monster;
	private PathBox southBox;
	private PathBox northBox;
	private String name;
	private JLabel labelUI;

	public PathBox(JLabel labelUI, String name) {
		this.labelUI = labelUI;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Monster getMonster() {
		return monster;
	}

	public void setMonster(Monster monster) {
		this.monster = monster;
	}

	public JLabel getLabelUI() {
		return labelUI;
	}

	public void setButtonUI(JLabel labelUI) {
		this.labelUI = labelUI;
	}

	public PathBox getSouthBox() {
		return southBox;
	}

	public void setSouthBox(PathBox southBox) {
		this.southBox = southBox;
	}

	public PathBox getNorthBox() {
		return northBox;
	}

	public void setNorthBox(PathBox northBox) {
		this.northBox = northBox;
	}

	public void update() {
		if (this.monster != null) {
			labelUI.setVisible(true);    
			//labelUI.setText(monster.toString());  
			if(monster.getSerialMonster() == 300L) {
				labelUI.setIcon(new ImageIcon(getClass().getResource("/imagens/pescado.png")));
			}else if(monster.getSerialMonster() == 302L){
				labelUI.setIcon(new ImageIcon(getClass().getResource("/imagens/zapdos.png")));
			}else {
				labelUI.setIcon(new ImageIcon(getClass().getResource("/imagens/prueba.png")));
			}
			if (monster.getPlayer().getId().equals(1L)) {
				labelUI.setBackground(new Color(123, 179, 252));
			} else {
				labelUI.setBackground(new Color(231, 123, 123));
			}
		} else {
			labelUI.setVisible(false);
			labelUI.setText("");
			labelUI.setBackground(Color.WHITE);
		}
	}

}
