package fi.tuni.tiko;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.I18NBundle;

import java.util.Locale;


public class GasChaosMain extends Game {
	SpriteBatch batch;
	OrthographicCamera camera;

	GameData gameData;
	MenuScreen menuScreen;
	FarmScreen farmScreen;
	HomeScreen homeScreen;
	FieldScreen fieldScreen;
	BarnScreen barnScreen;
	GardenScreen gardenScreen;
	GasTankScreen gasTankScreen;
	GrandmotherScreen grandmotherScreen;
	ComputerScreen computerScreen;
	Locale locale;
	Locale defaultLocale;
	I18NBundle myBundle;


	@Override
	public void create () {
		locale = new Locale("fi", "Finland");
		defaultLocale = Locale.getDefault();
		myBundle = I18NBundle.createBundle(Gdx.files.internal("MyBundle"), defaultLocale);

		/*
		//Localization example
		String locTest1 = myBundle.get("buyCowComplete");
		String locTest2 = myBundle.format("turnInfoExample", gameData.getCurrentTurn());
		System.out.println(locTest1);
		System.out.println(locTest2);
		//End of example
		*/

		gameData = new GameData();
		batch = new SpriteBatch();
		camera = new OrthographicCamera();

		menuScreen = new MenuScreen();
		farmScreen = new FarmScreen(batch, camera, this);
		homeScreen = new HomeScreen(batch, camera, this);
		fieldScreen = new FieldScreen(batch, camera, this);
		barnScreen = new BarnScreen(batch, camera, this);
		gardenScreen = new GardenScreen(batch, camera, this);
		gasTankScreen = new GasTankScreen(batch, camera, this);
		grandmotherScreen = new GrandmotherScreen(batch, camera, this);
		computerScreen = new ComputerScreen(batch, camera, this);

		setFarmScreen();
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}

	public void setFarmScreen() {
		setScreen(farmScreen);
	}

	public void setHomeScreen() {
		setScreen(homeScreen);
	}

	public void setComputerScreen() {
		setScreen(computerScreen);
	}

	public void setMenuScreen () {
		setScreen(menuScreen);
	}

	public void setBarnScreen () {
		setScreen(barnScreen);
	}

	public void setGardenScreen () {
		setScreen(gardenScreen);
	}

	public void setGrandmotherScreen () {
		setScreen(grandmotherScreen);
	}

	public void setFieldScreen () {
		setScreen(fieldScreen);
	}

	public void setGasTankScreen () {
		setScreen(gasTankScreen);
	}
}
