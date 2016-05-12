import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        if (JOptionPane.showConfirmDialog(null,"scan or not")==1) {
            paths A = new paths(1, 3, "a");
            paths B = new paths(0, 4, "b");
            paths C = new paths(160, 3, "c");
            paths D = new paths(242, 2, "d");
            paths E = new paths(161, 1, "e");
            paths F = new paths(178, 3, "f");
            paths G = new paths(77, 1, "g");
            paths H = new paths(151, 2, "h");
            paths I = new paths(226, 2, "i");
            paths L = new paths(244, 2, "l");
            paths M = new paths(241, 2, "m");
            paths N = new paths(234, 1, "n");
            paths O = new paths(380, 2, "o");
            paths P = new paths(98, 3, "p");
            paths R = new paths(193, 3, "r");
            paths S = new paths(253, 4, "s");
            paths T = new paths(329, 2, "t");
            paths U = new paths(80, 3, "u");
            paths V = new paths(199, 2, "v");
            paths Z = new paths(374, 2, "z");

            A.availablePaths[0] = S;
            A.availablePaths[1] = T;
            A.availablePaths[2] = Z;
            B.availablePaths[0] = F;
            B.availablePaths[1] = P;
            B.availablePaths[2] = G;
            B.availablePaths[3] = U;
            C.availablePaths[0] = D;
            C.availablePaths[1] = P;
            C.availablePaths[2] = R;
            D.availablePaths[0] = C;
            D.availablePaths[1] = M;
            E.availablePaths[0] = H;
            F.availablePaths[0] = B;
            F.availablePaths[1] = S;
            F.availablePaths[2] = A;
            G.availablePaths[0] = B;
            H.availablePaths[0] = E;
            H.availablePaths[1] = U;
            I.availablePaths[0] = M;
            I.availablePaths[1] = N;
            L.availablePaths[0] = T;
            L.availablePaths[1] = V;
            M.availablePaths[0] = D;
            M.availablePaths[1] = L;
            N.availablePaths[0] = I;
            O.availablePaths[0] = S;
            O.availablePaths[0] = Z;
            P.availablePaths[2] = B;
            P.availablePaths[1] = C;
            P.availablePaths[0] = R;
            R.availablePaths[2] = C;
            R.availablePaths[0] = P;
            R.availablePaths[1] = S;
            S.availablePaths[1] = A;
            S.availablePaths[0] = F;
            S.availablePaths[2] = O;
            S.availablePaths[3] = R;
            T.availablePaths[1] = A;
            T.availablePaths[0] = L;
            U.availablePaths[0] = B;
            U.availablePaths[2] = H;
            U.availablePaths[1] = V;
            V.availablePaths[1] = I;
            V.availablePaths[0] = U;
            Z.availablePaths[1] = A;
            Z.availablePaths[0] = O;
            int [] quiz =new int[5];
            quiz [0]=5 ;
            quiz [1]=8;
            quiz [2]=2;
            quiz [3]=8;
            quiz [4]=45;
            for (int i = 0; i <4 ; i++) {
               int min = 10;
                if (quiz[i]<min){

                    System.out.println(quiz[i]);
                }

            }


            shortPath shrt = new shortPath();
            shrt.GetShortPath(A);
        }else {
//            Scanner scan = new Scanner(System.in);
//            int n = scan.nextInt();
//            ArrayList<paths> pp = new ArrayList<>();
//            scan.nextInt();
//
//            for (int i = 0; i < n; i++) {
//                String q = scan.nextLine();
//                String[] qq = q.split(",");
//                pp.add(new paths(Integer.parseInt(qq[0]), Integer.parseInt(qq[1]), qq[2]));
//            }
//
//            for (int i = 0; i < pp.size(); i++) {
//                String q = scan.nextLine();
//                String[] qq = q.split(",");
//                for (int j = 0; j < pp.get(i).availablePaths.length; j++) {
//                    paths wew = null;
//                    for (int k = 0; k < pp.size(); k++) {
//                        if (pp.get(k).getName().equals(qq[j]))
//                            wew = pp.get(k);
//                    }
//
//                    pp.get(i).availablePaths[j] = wew;
//                }
//            }
//
//            shortPath shrttt = new shortPath();
//            shrttt.GetShortPath(pp.get(0));
        }
    }

}
