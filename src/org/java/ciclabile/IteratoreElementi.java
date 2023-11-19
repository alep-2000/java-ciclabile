package org.java.ciclabile;

	public class IteratoreElementi {
	    private int[] elencoInteri;
		private int indice;

	    public IteratoreElementi(int[] elencoInteri) {
	       
	        setElencoInteri(elencoInteri);
	        setIndice(0);
	    }
	    


	    public IteratoreElementi() {

	   			setElencoInteri(new int[0]);
	   			setIndice(0);
	   		}
	   
	    public int[] getElencoInteri() {
			return elencoInteri;
		}

		public void setElencoInteri(int[] elencoInteri) {
			this.elencoInteri = elencoInteri;
		}

		public int getIndice() {
			return indice;
		}

		public void setIndice(int indice) {
			this.indice = indice;
		}
	    

//		METODO CHE RESTITUISCE IL PROSSIMO ELEMENTO RISPETTO ALL'ULTIMA VOLTA CHE E' STATO INVOCATO
	    public int getElementoSuccessivo() {

	        int[] elementoSuccessivo = getElencoInteri();
	        setIndice(indice + 1);
	        return elencoInteri[getIndice() - 1];
	    }

//	    METODO CHE RESTITUISCE TRUE SE CI SONO ANCORA ELEMENTI DA RESTITUIRE ALTRIMENTI FALSE
	    public boolean hasAncoraElementi() {
	        return indice < elencoInteri.length;
	    }
	    
//		METODO CHE PERMETTE DI AGGIUNGERE UN NUOVO ELEMENTO
	    public void addElemento(int elemento) {
	   			
	   			int[] nuovoElenco = new int[getElencoInteri().length + 1];
	   			
	   			System.arraycopy(getElencoInteri(), 0, nuovoElenco, 0, getElencoInteri().length);
	   			
	   			nuovoElenco[getElencoInteri().length] = elemento;
	   			
	   			setElencoInteri(nuovoElenco);
	   	}
	}

