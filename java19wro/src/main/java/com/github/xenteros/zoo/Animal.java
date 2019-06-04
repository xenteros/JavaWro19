package com.github.xenteros.zoo;

import java.util.UUID;

public abstract class Animal {

    protected String name;
    protected boolean boughtExternaly;

    public Animal() {
        this.name = UUID.randomUUID().toString().substring(0,6);
        this.boughtExternaly = true;
    }

    /**
     *
     * @return Noise given by the animal
     */

    public void setBoughtExternaly(boolean boughtExternaly) {
        this.boughtExternaly = boughtExternaly;
    }
    public abstract String makeSomeNoise();

}
