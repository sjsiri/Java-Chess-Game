package com.chess.engine.board;


import com.chess.engine.pieces.Piece;

public class OccupiedTile extends Tile {

    private Piece pieceOnTile;

    public OccupiedTile(int tileCoordinate) {
        super(tileCoordinate);
    }

    @Override
    public boolean isTileOccupied() {
        return true;
    }

    @Override
    public Piece getPiece() {
        return null;
    }
}
