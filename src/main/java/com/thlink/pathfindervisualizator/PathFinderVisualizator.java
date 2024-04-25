
package com.thlink.pathfindervisualizator;

import com.thlink.pathfindervisualizator.graph.GraphFrame;

public class PathFinderVisualizator 
{
    public static void main(String[] args) 
    {
        /*System.out.println("PathFinderVisualizator:");
        PathFinder pf = new PathFinder();
        
        if (!pf.createFinder(5))
        {
            System.out.println("Erro");
        }*/
        
        System.out.println("PathFinderVisualizator:");
        GraphFrame gf = new GraphFrame();
        
        gf.go();
    }
}
