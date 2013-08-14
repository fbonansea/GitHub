package modelo;



	import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.WindowConstants;
import java.util.Iterator;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import ui.VentanaPrincipalUI;

	public class Jtree {
	    
		private ArrayList<DefaultMutableTreeNode> dmtnLista= new ArrayList<>();
		private DefaultTreeModel modelo;
		private JTree tree;
		
		public Jtree(ArrayList<Nodo> ListaNodo){
			
//			Nodo nodoH = ListaNodo.get(0);
			DefaultMutableTreeNode articulo = new DefaultMutableTreeNode("Articulos");
//			dmtnLista.add(Particulo);
//			modelo =new DefaultTreeModel(Particulo);
			
			modelo =new DefaultTreeModel(articulo);
			int i=0;
			for(Nodo nodo: ListaNodo)
		      {
				DefaultMutableTreeNode padre = new DefaultMutableTreeNode (nodo.GetValor().toString());
				modelo.insertNodeInto(padre, articulo,i);
				modelo= ArmaJtree(padre,modelo,nodo);
				i++;
		      }
		    
		    this.tree = new JTree(modelo);
			MostrarArbol();
		}
		
		public DefaultTreeModel ArmaJtree(DefaultMutableTreeNode articulo, DefaultTreeModel modelo, Nodo padre)
		{
			int j=0;
			DefaultMutableTreeNode vector[]= new DefaultMutableTreeNode[100];
			//System.out.println("m:"+j);
			if (padre.GetHijos()!= null)
			{Iterator<Nodo> ListaHijos = padre.GetHijos().iterator();
			
			while (ListaHijos.hasNext())
			{
			    Nodo nodoH = (Nodo)ListaHijos.next();
				Integer a= nodoH.GetValor();
				Integer b= padre.GetValor();
				
				System.out.println("NODO PADRE: "+ padre.GetValor());
				//System.out.println("NODO PADRE COMO TREENODE"+ nodo.toString() );
				System.out.println("NODOH: "+ nodoH.GetValor());
				//System.out.println("nodoP: "+padre.GetValor());
				System.out.println("nodoH   A: "+a);
				vector[j]=new DefaultMutableTreeNode(a);
				System.out.println("vector j: "+vector[0]);
				//System.out.println("NODO: " + nodo);
				DefaultMutableTreeNode x= new DefaultMutableTreeNode(b);
				modelo.insertNodeInto(vector[j], articulo,j);
				//if (dmtnLista.get(j)!=null)
				  //  dmtnLista.set(j, new DefaultMutableTreeNode (a));
				//else
				//	dmtnLista.add(new DefaultMutableTreeNode (a));
				//modelo.insertNodeInto(dmtnLista.get(j), nodo,j);
				
//				System.out.println(modelo.);
				System.out.println("nodo: "+ a);
				ArmaJtree(vector[j],modelo,nodoH);
				j++;
				//m++;
				System.out.println("m: "+j);
			}
			}	
				
			//return;	
		return modelo;
			
		}
		
		public void MostrarArbol ()
		{
			VentanaPrincipalUI v = new VentanaPrincipalUI((DefaultTreeModel)this.tree.getModel());
//	        JScrollPane scroll = new JScrollPane(this.tree);
//	        v.getContentPane().setSize(100, 100);
//	        v.getContentPane().add(scroll);
//	        v.pack();
	        v.setVisible(true);
	        v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		}
		
	}
