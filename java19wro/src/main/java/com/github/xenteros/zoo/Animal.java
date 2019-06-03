package com.github.xenteros.zoo;

abstract class Animal {

    protected String name;
    protected boolean boughtExternaly;


    /**
     *
     * @return Noise given by the animal
     */
    public abstract String makeSomeNoise();
}
