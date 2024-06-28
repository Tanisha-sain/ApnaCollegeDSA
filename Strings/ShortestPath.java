package Strings;

public class ShortestPath {
    static float shortestPath(String path){
        int x = 0, y = 0;
        for(int i = 0; i<path.length(); i++){
            if(path.charAt(i) == 'W') x--;
            else if(path.charAt(i) == 'E') x++;
            else if(path.charAt(i) == 'S') y--;
            else y++;
        }
        float dist = (float)Math.sqrt(x*x + y*y);
        return dist;
    }
    public static void main(String[] args) {
        String path = "NS";
        float shortDist = shortestPath(path);
        System.out.println(shortDist);
    }
}
