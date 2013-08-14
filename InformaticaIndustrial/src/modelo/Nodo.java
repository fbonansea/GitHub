package modelo;

import java.util.ArrayList;

public class Nodo {


		private Integer valor;
		private Nodo padre;
		private  ArrayList<Nodo> hijo;
		private Integer cont=0;
		private Nodo proxPadre;
		private Integer cuentaHijo=0;
//		public Nodo(Integer p, Integer[] h)
//		{
//			valor=p;
//			hijo=h;
//		}
		public Nodo(Integer p)
		{
			valor=p;
			hijo = new ArrayList<>();
		}

		public Integer GetValor ()
		{
			return valor;
		}
		
//		public Integer GetPadre ()
//		{
//			return padre;
//		}

		public void setPadre (Nodo p)
		{
			padre=p;
		}
		public ArrayList<Nodo> GetHijos()
		{
			return hijo;
		}
		
//		public Integer GetProxHijo()
//		{
//			cont++;
//			return hijo[cont--];
//		}
		
		public void SetProxPadre (Nodo proximo)
		{
			proxPadre=proximo;
		}
		
		public void AgregarHijo(Nodo h)
		{
			hijo.add(h);

		}

}
