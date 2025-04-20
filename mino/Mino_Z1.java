package mino;

import java.awt.Color;

public class Mino_Z1 extends Mino{
    public Mino_Z1() {
        create(Color.red);
    }

    public void setXY(int x, int y) {
        //     o  <- b[1]
        //  o  o  <- b[2], b[0] (center)
        //  o     <- b[3]
        b[0].x = x; // Center block
        b[0].y = y;
        b[1].x = x; // Top block
        b[1].y = y - Block.SIZE;
        b[2].x = x - Block.SIZE; // Left block
        b[2].y = y;
        b[3].x = x - Block.SIZE; // Bottom-left block
        b[3].y = y + Block.SIZE;
    }

    public void getDirection1() {
        //     o  <- tempB[1]
        //  o  o  <- tempB[2], tempB[0] (center)
        //  o     <- tempB[3]
        tempB[0].x = b[0].x; // Center block
        tempB[0].y = b[0].y;
        tempB[1].x = b[0].x; // Top block
        tempB[1].y = b[0].y - Block.SIZE;
        tempB[2].x = b[0].x - Block.SIZE; // Left block
        tempB[2].y = b[0].y;
        tempB[3].x = b[0].x - Block.SIZE; // Bottom-left block
        tempB[3].y = b[0].y + Block.SIZE;

        updateXY(1);
    }
    public void getDirection2() {
        //  o  o  <- tempB[1], tempB[0] (center)
        //     o  o <- tempB[2], tempB[3]
        //
        tempB[0].x = b[0].x; // Center block
        tempB[0].y = b[0].y;
        tempB[1].x = b[0].x - Block.SIZE; // Top-left block
        tempB[1].y = b[0].y;
        tempB[2].x = b[0].x; // Bottom block
        tempB[2].y = b[0].y + Block.SIZE;
        tempB[3].x = b[0].x + Block.SIZE; // Bottom-right block
        tempB[3].y = b[0].y + Block.SIZE;

        updateXY(2);
    }
    public void getDirection3() {
        //     o
        //  o  o
        //  o
        getDirection1();
    }
    public void getDirection4() {
        //  o  o
        //     o  o
        //
        getDirection2();
    }

}
