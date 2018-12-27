package com.practise;

public class ChessBoard {

        public static void  DisplayChess()
        {
            String str="";
            for(int i=0;i<8;i++)
            {
                if(i%2==0)
                {
                    str+=  "WW|BB|WW|BB|WW|BB|WW|BB|"+"\n";

                }
                else {
                    str+="BB|WW|BB|WW|BB|WW|BB|WW|"+"\n";
                }
            }
            System.out.println(str);
        }
        public static void main(String [] args)
        {
            DisplayChess();
        }
    }
