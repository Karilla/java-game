package io.github.some_example_name;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class GameObject {

    public Transform transform;
    private String name;

    public GameObject(String name, float x, float y) {
        this.name = name;
        this.transform = new Transform(x, y);
    }

    public String getName() {
        return name;
    }

    abstract void update(float deltatime);
    abstract  void render(SpriteBatch batch);
}
