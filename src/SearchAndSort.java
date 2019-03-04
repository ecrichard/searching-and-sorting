import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SearchAndSort {
	public static String svalue = null;
	/**
	 * Program execution starts here.
	 * 
	 * @param args
	 */
	public static int[] bubble(int[] data){
		int n = data.length; 
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
            	if (data[j] > data[j+1]) { 
                    int temp = data[j]; 
                    data[j] = data[j+1]; 
                    data[j+1] = temp; 
                } 
            }
		}
		return data;
	}
	
	public static String[] bubble(String[] data) { 
		for(int j = 0; j < data.length; j++){
			for(int i  = j + 1; i < data.length; i++){
				if(((String) data[i]).compareToIgnoreCase((String) data[j]) < 0){
					String t = (String) data[j];
					data[j] = data[i];
					data[i] = t;
			     }
			}
		}
		return data;
	}
	
	public static List<Object> bubble(List<Object> data) {
		if (data != null && !data.isEmpty()) {
			if (data.get(0) instanceof String) {
				for(int j = 0; j < data.size(); j++){
					for(int i  = j + 1; i < data.size(); i++){
						if(((String) data.get(i)).compareToIgnoreCase((String) data.get(j)) < 0){
							String t = (String) data.get(j);
							data.set(j, data.get(i));
							data.set(i, t);
					     }
					}
				}
			} 
			else if (data.get(0) instanceof Integer) {
				int temp;
				if (data.size() > 1) {
		            for (int x = 0; x < data.size(); x++) {
		                for (int i = x + 1; i < data.size(); i++) {
		                	int one = (int) data.get(i);
		                	int two = (int) data.get(x);
		                    if (one < two) {
		                        temp = (int) data.get(i);
		                        data.set(i,data.get(x) );
		                        data.set(x, temp);
		                    }
		                }
		            }
		        }
			}
		}
		return data;
	}
	
	public static int[] selection(int[] data) {
		int n = data.length;
        for (int i = 0; i < n - 1; i++) {  
            int min = i; 
            for (int j = i + 1; j < n; j++) {
                if (data[j] < data[min]) {
                    min = j; 
                }
            }
            int temp = data[min]; 
            data[min] = data[i]; 
            data[i] = temp; 
        } 
		return data;
	}
	
	public static String[] selection(String[] data) {
		for ( int j=0; j < data.length-1; j++ )
	    {
	      int min = j;
	      for ( int i=j+1; i < data.length; i++ )
	        if (data[i].compareToIgnoreCase(data[min] ) < 0) min = i;
	      String temp = data[j];
	      data[j] = data[min];
	      data[min] = temp;
	    }
		return data;
	}
	
	public static List<Object> selection(List<Object> data){
		if(data != null && !data.isEmpty()) {
			if(data.get(0) instanceof String) {
				int n = data.size();
		        for (int i = 0; i < n - 1; i++) {  
		            int min = i; 
		            for (int j = i + 1; j < n; j++) {
		            	String one = (String) data.get(j);
		            	String two = (String) data.get(min);
		                if (one.compareToIgnoreCase(two) < 0) {
		                    min = j; 
		                }
		            }
		            String temp = (String) data.get(min); 
		            data.set(min, data.get(i)); 
		            data.set(i, temp); 
		        }
			}
			else if(data.get(0) instanceof Integer) {
				int n = data.size();
		        for (int i = 0; i < n - 1; i++) {  
		            int min = i; 
		            for (int j = i + 1; j < n; j++) {
		            	int one = (int) data.get(j);
		            	int two = (int) data.get(min);
		                if (one < two) {
		                    min = j; 
		                }
		            }
		            int temp = (int) data.get(min); 
		            data.set(min, data.get(i)); 
		            data.set(i, temp); 
		        } 
			}
		}
		return data;
	}
	
	public static int[] insertion(int[] data) {
		int n = data.length; 
        for (int i = 1; i < n; ++i) { 
            int key = data[i]; 
            int j = i - 1; 
            while (j >= 0 && data[j] > key) { 
                data[j + 1] = data[j]; 
                j = j - 1; 
            } 
            data[j + 1] = key; 
        }
		return data;
	}
	
	public static String[] insertion(String[] data) {
		for (int j = 1; j < data.length; j++) {
	        String key = data[j];
	        int i = j - 1;
	        while (i >= 0) {
	            if (key.compareToIgnoreCase(data[i]) > 0) {
	                break;
	            }
	            data[i + 1] = data[i];
	            i--;
	        }
	        data[i + 1] = key;
	    }
		return data;
	}
	
	public static List<Object> insertion(List<Object> data){
		if(data != null && !data.isEmpty()) {
			if(data.get(0) instanceof String) {
				for (int j = 1; j < data.size(); j++) {
			        String key = (String) data.get(j);
			        int i = j - 1;
			        while (i >= 0) {
			            if (key.compareToIgnoreCase((String) data.get(i)) > 0) {
			                break;
			            }
			            data.set(i + 1, data.get(i));
			            i--;
			        }
			        data.set(i + 1, key);
			    }  
			}
			else if(data.get(0) instanceof Integer) {
				int n = data.size(); 
		        for (int i = 1; i < n; ++i) { 
		            int key = (int) data.get(i); 
		            int j = i - 1; 
		            while (j >= 0 && (int) data.get(j) > key) { 
		                data.set(j + 1, data.get(j)); 
		                j = j - 1; 
		            } 
		            data.set(j + 1, key); 
		        }
			}
		}
		return data;
	}
	
	public static int[] merges(int[] data) {
		int n = data.length;
		if (n < 2) {
	        return data;
	    }
	    int mid = n / 2;
	    int[] l = new int[mid];
	    int[] r = new int[n - mid];
	 
	    for (int i = 0; i < mid; i++) {
	        l[i] = data[i];
	    }
	    for (int i = mid; i < n; i++) {
	        r[i - mid] = data[i];
	    }
	    merges(l);
	    merges(r);
	 
	    mergehelp(data, l, r, mid, n - mid);
		return data;
	}
	public static void mergehelp(int[] data, int[] left, int[] right, int leftLen, int rightLen) {	  
		int i = 0, j = 0, k = 0;
		while (i < leftLen && j < rightLen) {
			if (left[i] <= right[j]) {
				data[k++] = left[i++];
			}
			else {
				data[k++] = right[j++];
			}
		}
		while (i < leftLen) {
			data[k++] = left[i++];
		}
		while (j < rightLen) {
			data[k++] = right[j++];
		}
	}
	
	public static String[] merges(String[] data) {
		int n = data.length;
		if (n < 2) {
	        return data;
	    }
	    int mid = n / 2;
	    String[] l = new String[mid];
	    String[] r = new String[n - mid];
	 
	    for (int i = 0; i < mid; i++) {
	        l[i] = data[i];
	    }
	    for (int i = mid; i < n; i++) {
	        r[i - mid] = data[i];
	    }
	    merges(l);
	    merges(r);
	 
	    mergehelp(data, l, r, mid, n - mid);
		return data;
	}
	
	public static void mergehelp(String[] data, String[] left, String[] right, int leftLen, int rightLen) {
		int i = 0, j = 0, k = 0;
		while (i < leftLen && j < rightLen) {
			if (left[i].compareToIgnoreCase(right[j]) < 0) {
				data[k++] = left[i++];
			}
			else {
				data[k++] = right[j++];
			}
		}
		while (i < leftLen) {
			data[k++] = left[i++];
		}
		while (j < rightLen) {
			data[k++] = right[j++];
		}
	}
	
	public static List<Object> merges(List<Object> data){
		if(data != null && !data.isEmpty()) {
			if(data.get(0) instanceof String) {
				int n = data.size();
				if (n < 2) {
			        return data;
			    }
			    int mid = n / 2;
			    String[] l = new String[mid];
			    String[] r = new String[n - mid];
			 
			    for (int i = 0; i < mid; i++) {
			        l[i] = (String) data.get(i);
			    }
			    for (int i = mid; i < n; i++) {
			        r[i - mid] = (String) data.get(i);
			    }
			    merges(l);
			    merges(r);
			 
			    List<String> llist = new ArrayList<String>();
			    for(String i : l) {
			    	llist.add(i);
			    }
			    
			    List<String> rlist = new ArrayList<String>();
			    for(String i : r) {
			    	rlist.add(i);
			    }
			    
			    mergehelp(data, llist, rlist, mid, n - mid);
				return data;
			}
			else if(data.get(0) instanceof Integer) {
				int n = data.size();
				if (n < 2) {
			        return data;
			    }
			    int mid = n / 2;
			    String[] l = new String[mid];
			    String[] r = new String[n - mid];
			 
			    for (int i = 0; i < mid; i++) {
			        l[i] = String.valueOf(data.get(i));
			    }
			    for (int i = mid; i < n; i++) {
			        r[i - mid] = String.valueOf(data.get(i));
			    }
			    merges(l);
			    merges(r);
			    
			    List<String> llist = new ArrayList<String>();
			    for(String i : l) {
			    	llist.add(i);
			    }
			    
			    List<String> rlist = new ArrayList<String>();
			    for(String i : r) {
			    	rlist.add(i);
			    }
			 
			    mergehelp(data, llist, rlist, mid, n - mid);
				return data;
			}
		}
		return data;
	}
	
	public static void mergehelp(List<Object> data, List<String> left, List<String> right, int leftLen, int rightLen) {
		int i = 0, j = 0, k = 0;
		while (i < leftLen && j < rightLen) {
			if (((String)left.get(i)).compareToIgnoreCase((String)right.get(j)) < 0) {
				data.set(k++, left.get(i++));
			}
			else {
				data.set(k++, right.get(j++));
			}
		}
		while (i < leftLen) {
			data.set(k++, left.get(i++));
		}
		while (j < rightLen) {
			data.set(k++, right.get(j++));
		}
	}
	
	public static int linear(int[] data, String value) {
		int val = Integer.valueOf(value);
		for(int i = 0; i < data.length; i++) {
			if (data[i] == val) {
				return i;
			}
		}
		return -1;
	}
	
	public static int linear(String[] data, String value) {
		for(int i = 0; i < data.length; i++) {
			if(data[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}
	
	public static int linear(List<Object> data, String value) {
		if(data != null && !data.isEmpty()) {
			if(data.get(0) instanceof String) {
				for(int i = 0; i < data.size(); i++) {
					if(data.get(i).equals(value)) {
						return i;
					}
				}
				return -1;
			}
			else if(data.get(0) instanceof Integer) {
				for(int i = 0; i < data.size(); i++) {
					int indexval = Integer.valueOf(String.valueOf(data.get(i)));
					int valuev = Integer.valueOf(value);
					if (indexval == valuev) {
						return i;
					}
				}
				return -1;
			}
		}
		return -1;
	}
	
	public static int binary(int[] data, String value) {
		int val = Integer.valueOf(value);
		selection(data);
		System.out.print("Sorted List: ");
		for(int i = 0; i < data.length; i++) {
			if(i < data.length - 1) {
				System.out.print(data[i] + ", ");
			}
			else {
				System.out.println(data[i]);
			}
		}
		int left = 0;
		int right = data.length - 1; 
        while (left <= right) { 
            int mid = left + (right - left) / 2; 
            if (data[mid] == val) {
            	return mid;
            }
            else if (data[mid] < val) {
            	left = mid + 1;
            }    
            else {
            	right = mid - 1; 
            }    
        } 
        return -1;
	}
	
	public static int binary(String[] data, String value) {
		selection(data);
		System.out.print("Sorted List: ");
		for(int i = 0; i < data.length; i++) {
			if(i < data.length - 1) {
				System.out.print(data[i] + ", ");
			}
			else {
				System.out.println(data[i]);
			}
		}
		int left = 0;
		int right = data.length - 1; 
        while (left <= right) { 
            int mid = left + (right - left) / 2; 
            if (data[mid].equals(value)) {
            	return mid;
            }
            else if (data[mid].compareToIgnoreCase(value) < 0) {
            	left = mid + 1;
            }    
            else {
            	right = mid - 1; 
            }    
        } 
		return -1;
	}
	
	public static int binary(List<Object> data, String value) {
		if(data != null && !data.isEmpty()) {
			if(data.get(0) instanceof String) {
				selection(data);
				System.out.print("Sorted List: ");
				for(int i = 0; i < data.size(); i++) {
					if(i < data.size() - 1) {
						System.out.print(data.get(i) + ", ");
					}
					else {
						System.out.println(data.get(i));
					}
				}
				int left = 0;
				int right = data.size() - 1; 
		        while (left <= right) { 
		            int mid = left + (right - left) / 2; 
		            if (((String)data.get(mid)).equals(value)) {
		            	return mid;
		            }
		            else if (((String)data.get(mid)).compareToIgnoreCase(value) < 0) {
		            	left = mid + 1;
		            }    
		            else {
		            	right = mid - 1; 
		            }    
		        } 
				
			}
			else if(data.get(0) instanceof Integer) {
				int val = Integer.valueOf(value);
				selection(data);
				System.out.print("Sorted List: ");
				for(int i = 0; i < data.size(); i++) {
					if(i < data.size() - 1) {
						System.out.print(data.get(i) + ", ");
					}
					else {
						System.out.println(data.get(i));
					}
				}
				int left = 0;
				int right = data.size() - 1; 
		        while (left <= right) { 
		            int mid = left + (right - left) / 2; 
		            if ((int)data.get(mid) == val) {
		            	return mid;
		            }
		            else if ((int)data.get(mid) < val) {
		            	left = mid + 1;
		            }    
		            else {
		            	right = mid - 1; 
		            }    
		        }
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		String algorithm = "";
		while (!(algorithm.equals("quit"))){
			Scanner in = new Scanner(System.in);
			System.out.println("What algorithm would you like to execute?");
			algorithm = in.nextLine();
			//algorithm = in.nextLine();
			while (!(algorithm.equals("bubble")|| algorithm.equals("selection")|| algorithm.equals("insertion") || algorithm.equals("merge") || algorithm.equals("binary") || algorithm.equals("quit") || algorithm.equals("linear"))){
				System.out.println("Please enter a valid algorithm.");
				algorithm = in.nextLine();
			}
			if(algorithm.equals("quit")) {
				break;
			}
			System.out.println("What type of data?");
			String datatype = in.nextLine();
			while (!(datatype.equals("integers") || datatype.equals("strings"))) {
				System.out.println("Please enter a valid datatype.");
				datatype = in.nextLine();
			}
			System.out.println("How is it stored?");
			String stored = in.nextLine();
			while(!((stored.equals("array")) || stored.equals("list"))) {
				System.out.println("Please enter a valid store type.");
				stored = in.nextLine();
			}
			System.out.println("Enter the data.");
			String input = in.nextLine();
			if(algorithm.equals("linear") || algorithm.equals("binary")) {
				System.out.println("Enter the value you are searching for.");
				svalue = in.nextLine();
			}
			if (stored.equals("list")) {
				if (datatype.equals("strings")) {
					String[] data = input.split(",");
					List<String> copy = Arrays.asList(data);
					List<Object> dataList = new ArrayList<Object>(copy);
					if(algorithm.equals("bubble")) {
						bubble(dataList);
						System.out.print("Bubble sort: [");
						for(int i = 0; i < dataList.size(); i++) {
							if(i != dataList.size()-1) {
								System.out.print(dataList.get(i) + ", ");
							}
							else {
								System.out.print(dataList.get(i));
							}
						}
						System.out.println("]");
					}
					else if(algorithm.equals("selection")) {
						selection(dataList);
						System.out.print("Selection sort: [");
						for(int i = 0; i < dataList.size(); i++) {
							if(i != dataList.size()-1) {
								System.out.print(dataList.get(i) + ", ");
							}
							else {
								System.out.print(dataList.get(i));
							}
						}
						System.out.println("]");

					}
					else if(algorithm.equals("insertion")) {
						insertion(dataList);
						System.out.print("Insertion sort: [");
						for(int i = 0; i < dataList.size(); i++) {
							if(i != dataList.size()-1) {
								System.out.print(dataList.get(i) + ", ");
							}
							else {
								System.out.print(dataList.get(i));
							}
						}
						System.out.println("]");

					}
					else if(algorithm.equals("merge")) {
						merges(dataList);
						System.out.print("Merge sort: [");
						for(int i = 0; i < dataList.size(); i++) {
							if(i != dataList.size()-1) {
								System.out.print(dataList.get(i) + ", ");
							}
							else {
								System.out.print(dataList.get(i));
							}
						}
						System.out.println("]");

					}
					else if(algorithm.equals("linear")) {
						int index = linear(data, svalue);
						if(index != -1) {
							System.out.println("Value can be found at: " + index);
						}
						else {
							System.out.println("Value not found.");
						}
					}
					else if(algorithm.equals("binary")) {
						int index = binary(data, svalue);
						if(index != -1) {
							System.out.println("Value can be found at: " + index);
						}
						else {
							System.out.println("Value not found.");
						}
					}
				}
				else {
					String[] data = input.split(",");
					Integer numbers[] = new Integer[data.length];
					for(int i = 0; i < data.length; i++) {
						numbers[i]=Integer.parseInt(data[i]);
					}
					List<Integer> copy = Arrays.asList(numbers);
					List<Object> dataList = new ArrayList<Object>(copy);
					if(algorithm.equals("bubble")) {
						bubble(dataList);
						System.out.print("Bubble sort: [");
						for(int i = 0; i < dataList.size(); i++) {
							if(i != dataList.size()-1) {
								System.out.print(dataList.get(i) + ", ");
							}
							else {
								System.out.print(dataList.get(i));
							}
						}
						System.out.println("]");
					}
					else if(algorithm.equals("selection")) {
						selection(dataList);
						System.out.print("Selection sort: [");
						for(int i = 0; i < dataList.size(); i++) {
							if(i != dataList.size()-1) {
								System.out.print(dataList.get(i) + ", ");
							}
							else {
								System.out.print(dataList.get(i));
							}
						}
						System.out.println("]");

					}
					else if(algorithm.equals("insertion")) {
						insertion(dataList);
						System.out.print("Insertion sort: [");
						for(int i = 0; i < dataList.size(); i++) {
							if(i != dataList.size()-1) {
								System.out.print(dataList.get(i) + ", ");
							}
							else {
								System.out.print(dataList.get(i));
							}
						}
						System.out.println("]");

					}
					else if(algorithm.equals("merge")) {
						merges(dataList);
						System.out.print("Merge sort: [");
						for(int i = 0; i < dataList.size(); i++) {
							if(i != dataList.size()-1) {
								System.out.print(dataList.get(i) + ", ");
							}
							else {
								System.out.print(dataList.get(i));
							}
						}
						System.out.println("]");

					}
					else if(algorithm.equals("linear")) {
						int index = linear(dataList, svalue);
						if(index != -1) {
							System.out.println("Value can be found at: " + index);
						}
						else {
							System.out.println("Value not found.");
						}
					}
					else if(algorithm.equals("binary")) {
						int index = binary(dataList, svalue);
						if(index != -1) {
							System.out.println("Value can be found at: " + index);
						}
						else {
							System.out.println("Value not found.");
						}
					}
				}
			}
			else {
				if(datatype.equals("strings")){
					String[] data = input.split(",");
					if(algorithm.equals("bubble")) {
						bubble(data);
						System.out.print("Bubble sort: [");
						for(int i = 0; i < data.length; i++) {
							if(i != data.length-1) {
								System.out.print(data[i] + ", ");
							}
							else {
								System.out.print(data[i]);
							}
						}
						System.out.println("]");
					}
					else if(algorithm.equals("selection")) {
						selection(data);
						System.out.print("Selection sort: [");
						for(int i = 0; i < data.length; i++) {
							if(i != data.length-1) {
								System.out.print(data[i] + ", ");
							}
							else {
								System.out.print(data[i]);
							}
						}
						System.out.println("]");
					}
					else if(algorithm.equals("insertion")) {
						insertion(data);
						System.out.print("Insertion sort: [");
						for(int i = 0; i < data.length; i++) {
							if(i != data.length-1) {
								System.out.print(data[i] + ", ");
							}
							else {
								System.out.print(data[i]);
							}
						}
						System.out.println("]");
					}
					else if(algorithm.equals("merge")) {
						merges(data);
						System.out.print("Merge sort: [");
						for(int i = 0; i < data.length; i++) {
							if(i != data.length-1) {
								System.out.print(data[i] + ", ");
							}
							else {
								System.out.print(data[i]);
							}
						}
						System.out.println("]");
					}
					else if(algorithm.equals("linear")) {
						int index = linear(data, svalue);
						if(index != -1) {
							System.out.println("Value can be found at: " + index);
						}
						else {
							System.out.println("Value not found.");
						}
					}
					else if(algorithm.equals("binary")) {
						int index = binary(data, svalue);
						if(index != -1) {
							System.out.println("Value can be found at: " + index);
						}
						else {
							System.out.println("Value not found.");
						}
					}
				}
				else {
					String[] copy = input.split(",");
					int[] data = new int[copy.length];
					for(int i = 0; i < copy.length; i++) {
						data[i]= Integer.parseInt(copy[i]);
					}
					if(algorithm.equals("bubble")) {
						bubble(data);
						System.out.print("Bubble sort: [");
						for(int i = 0; i < data.length; i++) {
							if(i != data.length-1) {
								System.out.print(data[i] + ", ");
							}
							else {
								System.out.print(data[i]);
							}
						}
						System.out.println("]");
					}
					else if(algorithm.equals("selection")) {
						selection(data);
						System.out.print("Selection sort: [");
						for(int i = 0; i < data.length; i++) {
							if(i != data.length-1) {
								System.out.print(data[i] + ", ");
							}
							else {
								System.out.print(data[i]);
							}
						}
						System.out.println("]");
					}
					else if(algorithm.equals("insertion")) {
						insertion(data);
						System.out.print("Insertion sort: [");
						for(int i = 0; i < data.length; i++) {
							if(i != data.length-1) {
								System.out.print(data[i] + ", ");
							}
							else {
								System.out.print(data[i]);
							}
						}
						System.out.println("]");
					}
					else if(algorithm.equals("merge")) {
						merges(data);
						System.out.print("Merge sort: [");
						for(int i = 0; i < data.length; i++) {
							if(i != data.length-1) {
								System.out.print(data[i] + ", ");
							}
							else {
								System.out.print(data[i]);
							}
						}
						System.out.println("]");
					}
					else if(algorithm.equals("linear")) {
						int index = linear(data, svalue);
						if(index != -1) {
							System.out.println("Value can be found at: " + index);
						}
						else {
							System.out.println("Value not found.");
						}
					}
					else if(algorithm.equals("binary")) {
						int index = binary(data, svalue);
						if(index != -1) {
							System.out.println("Value can be found at: " + index);
						}
						else {
							System.out.println("Value not found.");
						}
					}
				}
			}
		}
	}
}