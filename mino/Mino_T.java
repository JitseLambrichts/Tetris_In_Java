package mino;

import java.awt.Color;

public class Mino_T extends Mino {
    public Mino_T() {
        create(Color.magenta);
    }

    public void setXY(int x, int y) {
        //    o
        // o  o  o
        //
        b[0].x = x; // Center block
        b[0].y = y;
        b[1].x = x; // Top block
        b[1].y = y - Block.SIZE;
        b[2].x = x - Block.SIZE; // Left block
        b[2].y = y;
        b[3].x = x + Block.SIZE; // Right block
        b[3].y = y;
    }

    public void getDirection1() {
        //    o
        // o  o  o
        //
        tempB[0].x = b[0].x; // Center block
        tempB[0].y = b[0].y;
        tempB[1].x = b[0].x; // Top block
        tempB[1].y = b[0].y - Block.SIZE;
        tempB[2].x = b[0].x - Block.SIZE; // Left block
        tempB[2].y = b[0].y;
        tempB[3].x = b[0].x + Block.SIZE; // Right block
        tempB[3].y = b[0].y;

        updateXY(1); // Direction 1 is the initial state
    }

    public void getDirection2() {
        //   o
        //   o o
        //   o
        tempB[0].x = b[0].x; // Center block
        tempB[0].y = b[0].y;
        tempB[1].x = b[0].x + Block.SIZE; // Right block
        tempB[1].y = b[0].y;
        tempB[2].x = b[0].x; // Top block
        tempB[2].y = b[0].y - Block.SIZE;
        tempB[3].x = b[0].x; // Bottom block
        tempB[3].y = b[0].y + Block.SIZE;

        updateXY(2);
    }

    public void getDirection3() {
        // o o o
        //   o
        //
        tempB[0].x = b[0].x; // Center block
        tempB[0].y = b[0].y;
        tempB[1].x = b[0].x; // Bottom block
        tempB[1].y = b[0].y + Block.SIZE;
        tempB[2].x = b[0].x + Block.SIZE; // Right block
        tempB[2].y = b[0].y;
        tempB[3].x = b[0].x - Block.SIZE; // Left block
        tempB[3].y = b[0].y;

        updateXY(3);
    }

    public void getDirection4() {
        //   o
        // o o
        //   o
        tempB[0].x = b[0].x; // Center block
        tempB[0].y = b[0].y;
        tempB[1].x = b[0].x - Block.SIZE; // Left block
        tempB[1].y = b[0].y;
        tempB[2].x = b[0].x; // Top block
        tempB[2].y = b[0].y - Block.SIZE;
        tempB[3].x = b[0].x; // Bottom block
        tempB[3].y = b[0].y + Block.SIZE;

        updateXY(4);
    }
}

