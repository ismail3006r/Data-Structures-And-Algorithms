public class ShortestPath {
    public static double Shortestpath(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='E'){
                x++;
            }
            else if(str.charAt(i)=='N'){
                y++;
            }
            else if(str.charAt(i)=='W'){
                x--;
            }
            else if(str.charAt(i)=='S'){
                y--;
            }
        }
        double path = Math.sqrt((x*x)+(y*y));
        return path;
    }
    public static void main(String args[]){
        String str="WNEENESENNN";
        double shortestPath=Shortestpath(str);
        System.out.printf("the shortest path to cover is %.2f ",shortestPath);
    }
    
}
