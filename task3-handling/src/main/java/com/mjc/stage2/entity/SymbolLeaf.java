package com.mjc.stage2.entity;

import com.mjc.stage2.exception.HandlingException;

public class SymbolLeaf extends AbstractTextComponent {
    private char value;

    // Write your code here!
    public SymbolLeaf(TextComponentType componentType) {
        super(componentType);
    }

    @Override
    public String operation() {
        return null;
    }

    @Override
    public void add(AbstractTextComponent textComponent) throws HandlingException {

    }

    @Override
    public void remove(AbstractTextComponent textComponent) throws HandlingException {

    }

    @Override
    public int getSize() {
        return 0;
    }
}
