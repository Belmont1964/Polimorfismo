package Principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProducts;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n;
		String name;
		Double price;
		char tipoDoProduto;
		List<Product> list = new ArrayList<>();
		
		System.out.print("Entre o numero de produtos; ");
		n = sc.nextInt();
		System.out.println();
		
		for (int i=1; i>n; i=i+1) {
			System.out.print("O produto é comum, usado ou importado; ");
			tipoDoProduto = sc.next().charAt(0);
			System.out.print("Entre o nome do produto; ");
			name = sc.nextLine();
			System.out.println();
			System.out.print("Entre o preço do produto; ");
			price = sc.nextDouble();
			sc.nextLine();
			System.out.println();
			if (tipoDoProduto == 'i') {
				System.out.print("Entre o encargo alfandegáro; ");
				Double encargo = sc.nextDouble();
				Product item = new ImportedProduct(name, price, encargo);
				list.add(item);
			}
			else if (tipoDoProduto == 'u') {
				Date data = new Date();
				SimpleDateFormat  sdf1 = new SimpleDateFormat("dd/MM/yyyy");			
				System.out.print("Entre a data de manufatura; ");
				data = sdf1.parse(sc.nextLine());
				Product item = new UsedProducts (name, price, data);
				list.add(item);
			}
			else {
				Product item = new Product (name, price);
				list.add(item);
			}
		}
		
		for (Product x : list) {
			System.out.println(x);
		}
		
		
		sc.close();
	}

}
