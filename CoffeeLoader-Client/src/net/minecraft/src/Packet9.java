package net.minecraft.src;
// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class Packet9 extends Packet
{

    public Packet9()
    {
    }

    public void processPacket(NetHandler nethandler)
    {
        nethandler.func_9448_a(this);
    }

    public void readPacketData(DataInputStream datainputstream)
    {
    }

    public void writePacketData(DataOutputStream dataoutputstream)
    {
    }

    public int getPacketSize()
    {
        return 0;
    }
}
