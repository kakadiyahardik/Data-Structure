package graph.dfs_bfs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {
	
	private HashMap<Integer,LinkedList<Integer>> adj;
	private boolean visited[]=new boolean[5];
	
	Graph(){
		adj=new HashMap<>();
	}
	
	void addEdge(int src,int dst){
		
		LinkedList<Integer> tmp;
		if(adj.containsKey(src)){
			tmp=adj.get(src);
			tmp.add(dst);
			adj.put(src, tmp);
		}
		else{
			tmp=new LinkedList<>();
			tmp.add(dst);
			adj.put(src, tmp);
		}
		
//		if(adj.containsKey(dst)){
//			tmp=adj.get(dst);
//			tmp.add(src);
//			adj.put(dst, tmp);
//		}
//		else{
//			tmp=new LinkedList<>();
//			tmp.add(src);
//			adj.put(dst, tmp);
//		}
	}
	
	public void bfs(int start){
		
		boolean visited[]=new boolean[5];
		LinkedList<Integer> queue=new LinkedList<>();
		
		queue.add(start);
		visited[start]=true;
		
		while(!queue.isEmpty()){
			int tmp=queue.poll();
			
			System.out.print(tmp+" ");
			Iterator<Integer> i=adj.get(tmp).iterator();
			
			while(i.hasNext()){
				int value= i.next();
				
				if(!visited[value]){
					queue.add(value);
					visited[value]=true;
				}
			}
		}
	}
	
	public void dfs(int start){
		
		visited[start]=true;
		System.out.print(start+" ");
		
		Iterator<Integer> i=adj.get(start).iterator();
			
			while(i.hasNext()){
				int value=i.next();
				
				if(!visited[value]){
					dfs(value);
					visited[value]=true;
				}
			}
	}
	
	void print(){
		
		for(int i=0;i<5;i++){
			System.out.println(adj.get(i));
		}
	}
}
