package opengl;

import org.joml.Vector3f;

import org.lwjgl.opengl.GL11;

import core.IOHandler;
import entity.Entity;


public class Camera {

	private IOHandler keyboardHandler;
	private Vector3f position;
	private float roll;
	private float pitch;
	private float yaw;
	Entity object;
	float deltaX;
	float deltaY;
	float deltaZ;
	private float MAX_ZOOM = 2;
	private float MIN_ZOOM = -2;
	private float camZoom = 0;
	private float theta;
	boolean debug = false;
	public boolean closeProgram = false;




	public Camera(Entity object, Display display) {
		this.object = object;
		position = new Vector3f(0,0,0);
		roll = 0;
		pitch = 0;
		yaw = 0;
		this.keyboardHandler = display.getKeyboardHandler();
	}

	public void update(Display display) {
		if(debug) {
			GL11.glPolygonMode(GL11.GL_FRONT_AND_BACK, GL11.GL_LINE);
		}

		//deltaX = object.getPosition().x ;
		yaw = -object.getRotY();
		roll = -object.getRotZ();
		pitch = -object.getRotX();
		move();


	}

	public void move() {
		position.x = object.getPosition().x;
		position.y = object.getPosition().y;
		position.z = object.getPosition().z;

	}



	public IOHandler getKeyboardHandler() {
		return keyboardHandler;
	}

	public Vector3f getPosition() {
		return position;
	}

	public void setPosition(Vector3f position) {
		this.position = position;
	}

	public float getRoll() {
		return roll;
	}

	public float getPitch() {
		return pitch;
	}

	public float getYaw() {
		return yaw;
	}

	public Entity getObject() {
		return object;
	}

	public float getDeltaX() {
		return deltaX;
	}

	public float getDeltaY() {
		return deltaY;
	}

	public float getDeltaZ() {
		return deltaZ;
	}

	public float getMAX_ZOOM() {
		return MAX_ZOOM;
	}

	public float getMIN_ZOOM() {
		return MIN_ZOOM;
	}

	public float getCamZoom() {
		return camZoom;
	}

	public float getTheta() {
		return theta;
	}

	public boolean isDebug() {
		return debug;
	}

	public boolean shouldCloseProgram() {
		return closeProgram;
	}

















}
