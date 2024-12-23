package io.github.some_example_name;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Player extends GameObject {

    private Texture texture;
    private Direction direction;

    public Player(String name, float x, float y) {
        super(name, x, y);
        this.texture = new Texture("poulet.png");
        this.direction = Direction.NONE;
    }

    @Override
    void update(float deltatime) {
        float dx = getVerticalValue();
        float dy = getHorizontalValue();
        this.transform.x += dx * 100f * deltatime;
        this.transform.y += dy * 100f * deltatime;
        System.out.println(deltatime);
    }

    @Override
    void render(SpriteBatch batch) {
        System.out.println("rendering");
        batch.draw(texture, transform.x, transform.y);
    }

    private float getHorizontalValue(){
        if(Gdx.input.isKeyPressed(Input.Keys.UP)){
            return 1;
        } else if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
            return -1;
        }else {
            return 0;
        }
    }

    private float getVerticalValue(){
        if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
            return -1;
        } else if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            return 1;
        } else {
            return 0;
        }
    }
}
