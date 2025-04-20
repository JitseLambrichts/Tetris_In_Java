package mino;

import java.awt.Color;

public class Mino_Z2 extends Mino{
    public Mino_Z2() {
        create(Color.green);
    }

    public void setXY(int x, int y) {
        // Nieuwe definitie: b[0] is nu het middelste linker blok (was b[1])
        //   o     <- b[1] (was b[0])
        //   o o   <- b[0], b[2] (was b[1], b[2])
        //     o   <- b[3] (was b[3])
        b[0].x = x; // Middelste linker blok (ons nieuwe centrum/referentie)
        b[0].y = y;
        b[1].x = x; // Blok erboven
        b[1].y = y - Block.SIZE;
        b[2].x = x + Block.SIZE; // Middelste rechter blok
        b[2].y = y;
        b[3].x = x + Block.SIZE; // Blok rechtsonder
        b[3].y = y + Block.SIZE;
    }

    public void getDirection1() {
        // Verticale oriëntatie (relatief aan nieuwe b[0])
        //   o  <- tempB[1]
        //   o o <- tempB[0], tempB[2]
        //     o <- tempB[3]
        tempB[0].x = b[0].x;
        tempB[0].y = b[0].y;
        tempB[1].x = b[0].x;
        tempB[1].y = b[0].y - Block.SIZE;
        tempB[2].x = b[0].x + Block.SIZE;
        tempB[2].y = b[0].y;
        tempB[3].x = b[0].x + Block.SIZE;
        tempB[3].y = b[0].y + Block.SIZE;

        updateXY(1);
    }
    public void getDirection2() {
        // Horizontale oriëntatie (relatief aan nieuwe b[0])
        //   o o   <- tempB[1], tempB[0]
        // o o     <- tempB[2], tempB[3]
        //
        tempB[0].x = b[0].x;
        tempB[0].y = b[0].y;
        tempB[1].x = b[0].x + Block.SIZE; // Blok rechtsboven
        tempB[1].y = b[0].y;
        tempB[2].x = b[0].x - Block.SIZE; // Blok linksonder
        tempB[2].y = b[0].y + Block.SIZE;
        tempB[3].x = b[0].x; // Blok rechtsonder
        tempB[3].y = b[0].y + Block.SIZE;

        updateXY(2);
    }
    public void getDirection3() {
        // Verticale oriëntatie
        getDirection1();
    }
    public void getDirection4() {
        // Horizontale oriëntatie
        getDirection2();
    }

}
