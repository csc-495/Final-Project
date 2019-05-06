package com.csc495.backend.utils;

import java.net.DatagramPacket;

public class ErrorPacket extends Packet {

    private final String errorMessage;

    public ErrorPacket(String errorMessage) {
        super(Type.ERROR);
        this.errorMessage = errorMessage;
    }

    @Override
    public void parseSocketData(DatagramPacket packet) {

    }

    @Override
    protected void createPacketData() {
        addData(getType().getValue());

        for (byte b : errorMessage.getBytes()) {
            addData(b);
        }
    }
}
