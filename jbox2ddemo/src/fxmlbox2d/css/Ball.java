package fxmlbox2d.css;

import java.util.List;

import javafx.beans.value.ObservableValue;
import javafx.css.CssMetaData;
import javafx.css.Styleable;
import javafx.css.StyleablePropertyFactory;
import javafx.scene.shape.Circle;

public class Ball extends Circle implements FixtureDefBeanOwner {

	private static final StyleablePropertyFactory<Ball> SPF = new StyleablePropertyFactory<>(Circle.getClassCssMetaData());

	public static  List<CssMetaData<? extends Styleable, ?>> getClassCssMetaData() {
        return SPF.getCssMetaData();
    }

	private FixtureDefBean<Ball> fixtureDefBean;
	
	public Ball() {
		getStyleClass().add("ball");
		this.fixtureDefBean = new FixtureDefBean<Ball>(this, SPF);
	}

	@Override
	public FixtureDefBean<? extends Styleable> getFixtureDefBean() {
		return fixtureDefBean;
	}
	
	@Override
	public List<CssMetaData<? extends Styleable, ?>> getCssMetaData() {
		return getClassCssMetaData();
	}

	@SuppressWarnings("unchecked")
	public ObservableValue<Number> densityProperty() {
		return (ObservableValue<Number>) fixtureDefBean.densityProperty();
	}
	public final Float getDensity() {
		return this.fixtureDefBean.densityProperty().getValue().floatValue();
	}
	public final void setDensity(Float density) {
		this.fixtureDefBean.densityProperty().setValue(density);
	}

	@SuppressWarnings("unchecked")
	public ObservableValue<Number> frictionProperty() {
		return (ObservableValue<Number>) fixtureDefBean.frictionProperty();
	}
	public final Float getFriction() {
		return this.fixtureDefBean.getFriction();
	}
	public final void setFriction(Float friction) {
		this.fixtureDefBean.setFriction(friction);
	}
	
	@SuppressWarnings("unchecked")
	public ObservableValue<Number> restitutionProperty() {
		return (ObservableValue<Number>) fixtureDefBean.restitutionProperty();
	}
	public final Float getRestitution() {
		return this.fixtureDefBean.getRestitution();
	}
	public final void setRestitution(Float restitution) {
		this.fixtureDefBean.setRestitution(restitution);
	}

	@SuppressWarnings("unchecked")
	public ObservableValue<Boolean> sensorProperty() {
		return (ObservableValue<Boolean>) this.fixtureDefBean.sensorProperty();
	}
	public final boolean isSensor() {
		return this.fixtureDefBean.isSensor();
	}
	public final void setSensor(boolean sensor) {
		this.fixtureDefBean.setSensor(sensor);
	}
}
