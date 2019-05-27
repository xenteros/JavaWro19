package com.github.xenteros.dzien6;

class CardboardBox<E> {
    //grammarly
    //deeply.com

    private E content;

    public CardboardBox(E content) {
        this.content = content;
    }

    public boolean isEmpty() {
        return content == null;
    }

    public E getContent() {
        return content;
    }
}
