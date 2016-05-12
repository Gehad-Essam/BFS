import java.util.ArrayList;

/**
 * Created by gehad on 4/2/2016.
 */
public class shortPath {

    public void GetShortPath(paths begin){
        ArrayList visited = new ArrayList();
        visited.add(begin);

//      System.out.println("gigi");
        paths[] shortpath = new paths[20];
        shortpath[0] = begin;
        paths nodeAt = begin;
        int j =1;
        do {
            paths p = null;
            int min = 99999;
            System.out.println(nodeAt.getName());
//            System.out.println("gig");
            for(int i = 0; i < nodeAt.availablePaths.length;i++){
                if(nodeAt.availablePaths[i].getHeur() < min && visited.indexOf(nodeAt.availablePaths[i])== -1){
                    System.out.println("----------------------");
                    System.out.println(nodeAt.availablePaths[i].getHeur());
                    System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
                    min = nodeAt.availablePaths[i].getHeur();
                    p = nodeAt.availablePaths[i];
                }
            }
            visited.add(p);
            System.out.println(p.getHeur());
            shortpath[j] = p;
            j++;
            nodeAt = p;
            System.out.println(p.getName());
            System.out.println("#######################");
        }
        while (nodeAt.getHeur() != 0);



        for(int i = 0;i< shortpath.length;i++){
            if(shortpath[i] == null)
                break;
            System.out.println(shortpath[i].getName()+"--->"+shortpath[i].getHeur());
        }
}
}
