package com.mjc.stage2.entity;

import com.mjc.stage2.exception.HandlingException;

import java.util.ArrayList;
import java.util.List;

public class TextComponent extends AbstractTextComponent {
    protected List<AbstractTextComponent> componentList = new ArrayList<>();
    private int size = 0;

    // Write your code here!
    public TextComponent(TextComponentType componentType) {
        super(componentType);
    }

    @Override
    public String operation() {
        // return component type

        size = componentList.size();

        for (AbstractTextComponent component : componentList) {
            component.operation();
        }

        return null;
    }

    @Override
    public void add(AbstractTextComponent textComponent) throws HandlingException {
        componentList.add(textComponent);
    }

    @Override
    public void remove(AbstractTextComponent textComponent) throws HandlingException {
        componentList.remove(textComponent);
    }

    @Override
    public int getSize() {
        return size;
    }
}
