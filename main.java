import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class possibleMoves {
    static String col = "abcdefgh";
    static String row = "87654321";
    String moves = "";
    String key, antikey;

    String king(String[][] chess, int turn, int i, int j) {
        if (turn==1)
            key="B";
        else
            key="W";
            
        try{if(chess[i+1][j].startsWith(key)){
            moves+="*"+col.charAt(j) + "" + row.charAt(i + 1)+" ";
        }}catch(Exception e){}
        try{if(chess[i-1][j].startsWith(key)){
            moves+="*"+ col.charAt(j) + "" + row.charAt(i - 1)+" ";
        }}catch(Exception e){}
        try{if(chess[i][j+1].startsWith(key)){
            moves+="*"+col.charAt(j + 1) + "" + row.charAt(i)+" ";
        }}catch(Exception e){}
        try{if(chess[i][j-1].startsWith(key)){
            moves+="*"+col.charAt(j - 1) + "" + row.charAt(i)+" ";
        }}catch(Exception e){}
        try{if(chess[i+1][j+1].startsWith(key)){
            moves+="*"+col.charAt(j + 1) + "" + row.charAt(i+1)+" ";
        }}catch(Exception e){}
        try{if(chess[i-1][j-1].startsWith(key)) {
            moves += "*"+col.charAt(j - 1) + "" + row.charAt(i - 1)+" ";
        }}catch(Exception e){}
        try{if(chess[i+1][j-1].startsWith(key)){
            moves+="*"+col.charAt(j - 1) + "" + row.charAt(i+1)+" ";
        }}catch(Exception e){}
        try{if(chess[i-1][j+1].startsWith(key)){
            moves+="*"+col.charAt(j + 1) + "" + row.charAt(i-1)+" ";
        }}catch(Exception e){}

        try{if(chess[i+1][j].startsWith(" ")){
            moves+=col.charAt(j) + "" + row.charAt(i + 1)+" ";
        }}catch(Exception e){}
        try{if(chess[i-1][j].startsWith(" ")){
            moves+= col.charAt(j) + "" + row.charAt(i - 1)+" ";
        }}catch(Exception e){}
        try{if(chess[i][j+1].startsWith(" ")){
            moves+=col.charAt(j + 1) + "" + row.charAt(i)+" ";
        }}catch(Exception e){}
        try{if(chess[i][j-1].startsWith(" ")){
            moves+=col.charAt(j - 1) + "" + row.charAt(i)+" ";
        }}catch(Exception e){}
        try{if(chess[i+1][j+1].startsWith(" ")){
            moves+=col.charAt(j + 1) + "" + row.charAt(i+1)+" ";
        }}catch(Exception e){}
        try{if(chess[i-1][j-1].startsWith(" ")) {
            moves +=col.charAt(j - 1) + "" + row.charAt(i - 1)+" ";
        }}catch(Exception e){}
        try{if(chess[i+1][j-1].startsWith(" ")){
            moves+=col.charAt(j - 1) + "" + row.charAt(i+1)+" ";
        }}catch(Exception e){}
        try{if(chess[i-1][j+1].startsWith(" ")){
            moves+=col.charAt(j + 1) + "" + row.charAt(i-1)+" ";
        }}catch(Exception e){}

        return moves;
    }

    String pond(String[][] chess, int turn, int i, int j) {
        if (turn == 1) {
            try {
                if (chess[i - 1][j - 1].startsWith("B"))
                    moves += ("*" + col.charAt(j - 1) + "" + row.charAt(i - 1)) + " ";
            } catch (Exception e) {
            }
            try {
                if (chess[i - 1][j + 1].startsWith("B"))
                    moves += ("*" + col.charAt(j + 1) + "" + row.charAt(i - 1)) + " ";
            } catch (Exception e) {
            }
            try {
                if ((i == 6) && (chess[i - 2][j].startsWith("   "))&& (chess[i - 1][j].startsWith("   ")))
                    moves += (col.charAt(j) + "" + row.charAt(i - 1) + " " + col.charAt(j) + "" + row.charAt(i - 2));
                else if (chess[i - 1][j].startsWith("   "))
                    moves += (col.charAt(j) + "" + row.charAt(i - 1));
            } catch (Exception e) {
            }
        }
        else{
            try {
                if (chess[i + 1][j - 1].startsWith("W"))
                    moves += ("*" + col.charAt(j - 1) + "" + row.charAt(i - 1)) + " ";
            } catch (Exception e) {
            }
            try {
                if (chess[i + 1][j + 1].startsWith("W"))
                    moves += ("*" + col.charAt(j + 1) + "" + row.charAt(i - 1)) + " ";
            } catch (Exception e) {
            }
            try {
                if ((i == 1) && (chess[i + 2][j].startsWith("   "))&&(chess[i + 1][j].startsWith("   ")))
                    moves += (col.charAt(j) + "" + row.charAt(i + 1) + " " + col.charAt(j) + "" + row.charAt(i + 2));
                else if (chess[i + 1][j].startsWith("   "))
                    moves += (col.charAt(j) + "" + row.charAt(i + 1));
            } catch (Exception e) {
            }
        }
        return moves;
    }

    String knight(String[][] chess, int turn, int i, int j) {
        if (turn == 1)
            key = "B";
        else
            key = "W";
        try {
            if (chess[i + 1][j + 2].equalsIgnoreCase("   ")) {
                moves += (col.charAt(j + 2) + "" + row.charAt(i + 1)) + " ";
            }
        } catch (Exception e) {
        }try {
            if (chess[i + 1][j + 2].startsWith(key)) {
                moves +="*"+ (col.charAt(j + 2) + "" + row.charAt(i + 1)) + " ";
            }
        } catch (Exception e) {
        }
        try {
            if (chess[i + 2][j + 1].equalsIgnoreCase("   ")) {
                moves += (col.charAt(j + 1) + "" + row.charAt(i + 2)) + " ";
            }
        } catch (Exception e) {
        }try {
            if ( chess[i + 2][j + 1].startsWith(key)) {
                moves += "*"+(col.charAt(j + 1) + "" + row.charAt(i + 2)) + " ";
            }
        } catch (Exception e) {
        }

        try {
            if (chess[i - 1][j - 2].equalsIgnoreCase("   ")) {
                moves += (col.charAt(j - 2) + "" + row.charAt(i - 1)) + " ";
            }
        } catch (Exception e) {
        }
        try {
            if ( chess[i - 1][j - 2].startsWith(key)) {
                moves += "*"+ (col.charAt(j - 2) + "" + row.charAt(i - 1)) + " ";
            }
        } catch (Exception e) {
        }
        try {
            if (chess[i - 2][j - 1].equalsIgnoreCase("   ")) {
                moves += (col.charAt(j - 1) + "" + row.charAt(i - 2)) + " ";
            }
        } catch (Exception e) {
        }
        try {
            if (chess[i - 2][j - 1].startsWith(key)) {
                moves += ("*"+col.charAt(j - 1) + "" + row.charAt(i - 2)) + " ";
            }
        } catch (Exception e) {
        }

        try {
            if (chess[i + 1][j - 2].equalsIgnoreCase("   ")) {
                moves += (col.charAt(j - 2) + "" + row.charAt(i + 1)) + " ";
            }
        } catch (Exception e) {
        }
        try {
            if (chess[i + 1][j - 2].startsWith(key)) {
                moves +="*"+ (col.charAt(j - 2) + "" + row.charAt(i + 1)) + " ";
            }
        } catch (Exception e) {
        }
        try {
            if (chess[i - 1][j + 2].equalsIgnoreCase("   ")) {
                moves += (col.charAt(j + 2) + "" + row.charAt(i - 1)) + " ";
            }
        } catch (Exception e) {
        }
        try {
            if (chess[i - 1][j + 2].startsWith(key)) {
                moves +="*"+ (col.charAt(j + 2) + "" + row.charAt(i - 1)) + " ";
            }
        } catch (Exception e) {
        }

        try {
            if (chess[i - 2][j + 1].equalsIgnoreCase("   ")) {
                moves += (col.charAt(j + 1) + "" + row.charAt(i - 2)) + " ";
            }
        } catch (Exception e) {
        }try {
            if ( chess[i - 2][j + 1].startsWith(key)) {
                moves +="*"+ (col.charAt(j + 1) + "" + row.charAt(i - 2)) + " ";
            }
        } catch (Exception e) {
        }
        try {
            if (chess[i + 2][j - 1].equalsIgnoreCase("   ")) {
                moves += (col.charAt(j - 1) + "" + row.charAt(i + 2)) + " ";
            }
        } catch (Exception e) {
        }try {
            if (chess[i + 2][j - 1].startsWith(key)) {
                moves += ("*"+col.charAt(j - 1) + "" + row.charAt(i + 2)) + " ";
            }
        } catch (Exception e) {
        }
        return moves;
    }

    String rook(String[][] chess, int turn, int i, int j) {
        if (turn == 1) {
            key = "B";
            antikey = "W";
        } else {
            key = "W";
            antikey = "B";
        }
        for (int ii = i + 1; ii < 8; ii++) {
            if (chess[ii][j].equalsIgnoreCase("   "))
                moves += col.charAt(j) + "" + row.charAt(ii) + " ";
            else if (chess[ii][j].startsWith(key)) {
                moves += "*"+col.charAt(j) + "" + row.charAt(ii) + " ";
                break;
            } else if (chess[ii][j].startsWith(antikey)) {
                break;
            }
        }
        for (int ii = i - 1; ii >= 0; ii--) {
            if (chess[ii][j].equalsIgnoreCase("   "))
                moves += col.charAt(j) + "" + row.charAt(ii) + " ";
            else if (chess[ii][j].startsWith(key)) {
                moves += "*"+col.charAt(j) + "" + row.charAt(ii) + " ";
                break;
            } else if (chess[ii][j].startsWith(antikey)) {
                break;
            }
        }
        for (int jj = j + 1; jj < 8; jj++) {
            if (chess[i][jj].equalsIgnoreCase("   "))
                moves += col.charAt(jj) + "" + row.charAt(i) + " ";
            else if (chess[i][jj].startsWith(key)) {
                moves += "*"+col.charAt(jj) + "" + row.charAt(i) + " ";
                break;
            } else if (chess[i][jj].startsWith(antikey)) {
                break;
            }
        }
        for (int jj = j - 1; jj >= 0; jj--) {
            if (chess[i][jj].equalsIgnoreCase("   "))
                moves += col.charAt(jj) + "" + row.charAt(i) + " ";
            else if (chess[i][jj].startsWith(key)) {
                moves += "*"+col.charAt(jj) + "" + row.charAt(i) + " ";
                break;
            } else if (chess[i][jj].startsWith(antikey)) {
                break;
            }
        }
        return moves;
    }

    String bishop(String[][] chess, int turn, int i, int j) {
        if (turn == 1) {
            key = "B";
            antikey = "W";
        } else {
            key = "W";
            antikey = "B";
        }
        for (int ii = i + 1, jj = j + 1; ii < 8 && jj < 8; ii++, jj++) {
            if (chess[ii][jj].equalsIgnoreCase("   "))
                moves += col.charAt(jj) + "" + row.charAt(ii) + " ";
            else if (chess[ii][jj].startsWith(key)) {
                moves += "*"+col.charAt(jj) + "" + row.charAt(ii) + " ";
                break;
            } else if (chess[ii][jj].startsWith(antikey)) {
                break;
            }
        }
        for (int ii = i - 1, jj = j - 1; ii >= 0 && jj >= 0; ii--, jj--) {
            if (chess[ii][jj].equalsIgnoreCase("   "))
                moves += col.charAt(jj) + "" + row.charAt(ii) + " ";
            else if (chess[ii][jj].startsWith(key)) {
                moves +="*"+ col.charAt(jj) + "" + row.charAt(ii) + " ";
                break;
            } else if (chess[ii][jj].startsWith(antikey)) {
                break;
            }
        }
        for (int ii = i - 1, jj = j + 1; jj < 8 && ii >= 0; ii--, jj++) {
            if (chess[ii][jj].equalsIgnoreCase("   "))
                moves += col.charAt(jj) + "" + row.charAt(ii) + " ";
            else if (chess[ii][jj].startsWith(key)) {
                moves += "*"+col.charAt(jj) + "" + row.charAt(ii) + " ";
                break;
            } else if (chess[ii][jj].startsWith(antikey)) {
                break;
            }
        }
        for (int ii = i + 1, jj = j - 1; jj >= 0 && ii < 8; ii++, jj--) {
            if (chess[ii][jj].equalsIgnoreCase("   "))
                moves += col.charAt(jj) + "" + row.charAt(ii) + " ";
            else if (chess[ii][jj].startsWith(key)) {
                moves += "*"+col.charAt(jj) + "" + row.charAt(ii) + " ";
                break;
            } else if (chess[ii][jj].startsWith(antikey)) {
                break;
            }
        }
        return moves;
    }

    String queen(String[][] chess, int turn, int i, int j) {
        bishop(chess, turn, i, j);
        rook(chess, turn, i, j);
        return moves;
    }
}
public class main {

    static Scanner scanner = new Scanner(System.in);
    static String[][] chess = new String[8][8];
    static String col="abcdefgh";
    static String row="87654321";
    static String killed="";


    static void initials(){
        for(int i =0;i<8;i++)
            for(int j =0;j<8;j++)
                if(i==1)
                    chess[i][j]="B_P";
                else if(i==6)
                    chess[i][j]="W_P";
                else if(i==0)
                    chess[i][j] ="B_";
                else if(i==7)
                    chess[i][j] ="W_";
                else
                    chess[i][j] ="   ";
        for(int i=0; i<8; i++){
            if(i==0 || i==7) {
                chess[0][i] += "R";
                chess[7][i] += "R";
            }
            else if(i==1 || i==6) {
                chess[0][i] += "N";
                chess[7][i] += "N";
            }
            else if(i==2 || i==5) {
                chess[0][i] += "B";
                chess[7][i] += "B";
            }
            else if(i==3) {
                chess[0][i] += "Q";
                chess[7][i] += "Q";
            }
            else{
                chess[0][i] += "K";
                chess[7][i] += "K";
            }
        }
    }

    static void printBoard(){
        int count=8;
        System.out.println("     a ,  b ,  c ,  d ,  e ,  f ,  g ,  h ");
        for(String[] i:chess){
            System.out.print(count-- +"  ");
            System.out.println(Arrays.toString(i));
        }
    }

    static void startGame() throws IOException {
        int count=0;
        while (true) {
            int turn = ((count % 2) + 1);
            if (!killed.contains("K")) {
                System.out.print("player " + ((count % 2) + 1) + " turn select coin:");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Thank you");
                    break;
                } else if (input.equalsIgnoreCase("print")) {
                    printBoard();
                    continue;
                } else {
                    String coin = getSelectedCoin(input);
                    records(coin + " : " + input + " --> ");
                    String key;
                    if (turn == 1)
                        key = "W";
                    else
                        key = "B";
                    if (coin.startsWith(key)) {
                        System.out.println("Selected coin is " + coin);
                        String mov = printAllPossibleMoves(turn, input);
                        if (mov.length() > 1)
                            System.out.println("All possible moves: " + mov);
                        else {
                            System.out.println("no possible moves");
                            continue;
                        }
                        String temp = movement(mov, input);
                        if (input.equalsIgnoreCase("Game over")) {
                            System.out.println("Thank you");
                            break;
                        }
                    } else {
                        System.out.println("Invalid selection\nselect again");
                        continue;
                    }
                }
                count++;
            }
            else{
                if (turn==2){
                    System.out.println("Player 1 won");
                    records("Player 1 won");
                }
                else{
                    System.out.println("Player 2 won");
                    records("Player 2 won");
                }                
                System.out.println("game over");
                System.out.println("Thank you");
                break;
            }
        }
    }

    static String printAllPossibleMoves(int turn,String input){
        int i=row.indexOf(input.charAt(1));
        int j=col.indexOf(input.charAt(0));
        possibleMoves move = new possibleMoves();
        String out="";
        switch(chess[i][j].charAt(2)){
            case 'P':
                out= (move.pond(chess, turn, i, j));
                break;

            case 'R':
                out=(move.rook(chess,turn,i,j));
                break;

            case 'N':
                out=move.knight(chess,turn,i,j);
                break;
            case 'B':
                out=move.bishop(chess,turn,i,j);
                break;
            case 'Q':
                out=move.queen(chess,turn,i,j);
                break;
            case 'K':
                out=move.king(chess,turn,i,j);
                break;
        }
        return out;
    }
    static String movement(String mov,String input) throws IOException {
        int i=row.indexOf(input.charAt(1));
        int j=col.indexOf(input.charAt(0));
        System.out.print("Enter new location: ");
        String newLoc = scanner.nextLine();
        if (mov.contains(newLoc)) {
            int ii = row.indexOf(newLoc.charAt(1));
            int jj = col.indexOf(newLoc.charAt(0));
            killed+=chess[ii][jj]+" ";
            chess[ii][jj] = chess[i][j];
            chess[i][j] = "   ";
            records(newLoc+"\n");


        }else{
            System.out.println("Invalid destination try again");
            movement(mov,input);
        }
        return"";
    }
    static String getSelectedCoin(String select){
        try{
            return chess[row.indexOf(select.charAt(1))][col.indexOf(select.charAt(0))];
        }
        catch(Exception e){
            return "invalid";
        }
    }
    static void records(String rec) throws IOException {
        FileWriter myWriter = new FileWriter("records.txt",true);
        myWriter.append(rec);
        myWriter.close();
    }
    public static void main(String[] args) throws IOException {
        records("\nStart of new game:\n------------------\n");
        initials();
        printBoard();
        startGame();
        records("\n------------------\nEnd of this game\n");
        records("-------------------------------------------------------------------------------");
    }
}
