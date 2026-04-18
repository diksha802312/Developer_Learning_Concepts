package org.example.LLDTicTacToe.Model;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.misc.Pair;

public class Board {
    public int size;
    public PlayingPiece[][] board;

    public Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public void addPiece(PlayingPiece playingPiece){
        for(int i=0 ; i<size; i++){
            for(int j=0; j<size; j++){
                if(board[i][j] == null){
                    board[i][j] = playingPiece;
                }
            }
        }
    }

    public List<Pair<Integer, Integer>> getFreeCells(){
        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();
        for(int i=0 ; i<size; i++){
            for(int j=0 ; j<size; j++){
                if(board[i][j] == null){
                    Pair<Integer, Integer> rowColumn = new Pair<Integer, Integer>(i, j);
                    freeCells.add(rowColumn);
                }
            }
        }
        return freeCells;
    }

    public void printBoard(){
        for(int i=0 ; i<size; i++){
            for(int j=0 ; j<size; j++){
                if(board[i][j] != null){
                    System.out.println(board[i][j].type.name());
                }
                else {
                    System.out.println(" ");
                }

            }
            System.out.println("|");
        }
    }
}
