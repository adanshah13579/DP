/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator_tv;

/**
 *
 * @author fa20-bse-036
 */
public class Demo {

	public static void main(String[] args) {
		TV tv = new ConcreteTV();
		
		Iterator it = tv.getIterator();
		
		while(it.hasMore()){
			System.out.println("My TV is playing "+it.getNext()+" now");
		}

	}

}
