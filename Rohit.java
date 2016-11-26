import java.util.ArrayList;
import java.util.List;
public class Rohit{
  public static void main(String[] args){
      String[] mListVertices = {"Hisar","Hansi","Tohana","Gurgaon","Delhi"};
      System.out.println("Main program started");
      Vertex<String>[] vertices = new Vertex[mListVertices.length];

      for(int j=0;j<5;j++){
        vertices[j] = new Vertex(mListVertices[j]);
      }

      for(int i=0;i<5;i++){
        System.out.println("Vertex number "+i+" is : "+vertices[i].toString());
      }
      Edge edge = new Edge(vertices[0],vertices[3],3);
      //edges.add(vertices[0],vertices[1],5);
      System.out.println(edge.toString());
      //Graph graph = new Graph(edges);
      List<Edge> e = new ArrayList<Edge>();
      e.add(new Edge(vertices[3],vertices[0],2));
      e.add(new Edge(vertices[2],vertices[1],5));
      for(int x=0;x<e.size();x++){
        System.out.println("edges are "+e.get(x).toString());
      }

      Graph graph = new Graph(e);
  }
}
