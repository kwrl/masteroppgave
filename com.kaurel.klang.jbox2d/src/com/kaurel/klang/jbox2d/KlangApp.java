package com.kaurel.klang.jbox2d;

import fxmlbox2d.GeometryHelper;
import javafx.scene.Parent;
import javafx.scene.Scene;

public interface KlangApp {
	public Parent getRoot();
	public Scene getScene();
	public Double getMouseX();
	public Double getMouseY();
	
	public GeometryHelper getGeometryHelper();
}
