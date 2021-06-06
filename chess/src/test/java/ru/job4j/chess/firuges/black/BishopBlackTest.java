package ru.job4j.chess.firuges.black;


import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;


public class BishopBlackTest {
    @Test
    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        assertThat(bishopBlack.position(), is(Cell.A1));
    }

    @Test
    public void testCopy() {
        BishopBlack bishopBlack1 = new BishopBlack(Cell.A1);
        BishopBlack bishopBlack2 = new BishopBlack(Cell.A2);
        assertThat(bishopBlack1.copy(Cell.A2).position(), is(bishopBlack2.position()));
    }

    @Test
    public void testWay() {
        BishopBlack bishopBlack1 = new BishopBlack(Cell.C1);
        Cell[] way = new Cell[4];
        way[0] = Cell.D2;
        way[1] = Cell.E3;
        way[2] = Cell.F4;
        way[3] = Cell.G5;
        assertThat(bishopBlack1.way(Cell.G5), is(way));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void testImpossibleWay() {
        BishopBlack bishopBlack1 = new BishopBlack(Cell.C1);
        bishopBlack1.way(Cell.G1);
    }

}