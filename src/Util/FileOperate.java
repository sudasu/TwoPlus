package Util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import Customer.Customer;

public class FileOperate {
	
	//追加文件
	public static void appendFile(String fileName, String content) throws Exception{ 
		//打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件 
		FileWriter writer = new FileWriter(fileName, true); 
		writer.write(content); 
		writer.close(); 
	} 
	
	//读文件
	public static ArrayList<String> readFile(String name) {
		// 使用ArrayList来存储每行读取到的字符串
		ArrayList<String> arrayList = new ArrayList<>();
		try {
			FileReader fr = new FileReader(name);
			BufferedReader bf = new BufferedReader(fr);
			String str;
			// 按行读取字符串
			while ((str = bf.readLine()) != null) {
				arrayList.add(str);
			}
			bf.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 返回数组
		return arrayList;
	}
	
	
	//name是存储customer信息的txt文件路径
	public static Customer[] readCustomer(String name) {
		// 使用ArrayList来存储每行读取到的字符串
		ArrayList<String> arrayList = readFile(name);
		// 对ArrayList中存储的字符串进行处理
		int length = arrayList.size();
		Customer[] array = new Customer[length];
		for (int i = 0; i < length; i++) {
			String[] s = arrayList.get(i).split("-");
			Customer customer = new Customer(Integer.parseInt(s[0]), s[1], s[2], s[3], s[4], s[5]);
			array[i] = customer;
		}
		// 返回数组
		return array;
	}
	
	public static int insertCustomer(String path, Customer customer) {
		String str = customer.getCusID() + "-" + customer.getPassword() + "-" + customer.getName() +"-" + customer.getPhone() + "-" +customer.getEmail() + "-" + customer.getType() + "\n";
		int i = 1;
		try{
			appendFile(path, str);
		}catch(Exception e) {
			i = 0;
		}
		return i;
	}
	
}
