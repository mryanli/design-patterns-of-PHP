package structure.iterator;

//运转的机器
public class IteratorPatternDemo {

	public static void main(String[] args) {
		
		NameReposity nameReposity = new NameReposity();
		
		for (Iterator iter = nameReposity.getIterator(); iter.hasNext();) {
			String name = (String)iter.next();
			System.out.println("name:"+name);
		}
	}
}


//迭代器图纸
interface Iterator{
	public boolean hasNext();
	public Object next();
}


//容器图纸
interface Container{
	public Iterator getIterator();
}


//被迭代的对象
class NameReposity implements Container{
	public String names[]= {"robert","john","julie","lora"}; 
							//0         1      2       3       length=4
	
	
	@Override   //这里取得内部类，作为类闭包，他是保存了外部类 的变量 作为迭代器 的迭代内容
	public Iterator getIterator() {
		return new NameIterator();
	}
	
	//被迭代对象的内部定义一个照着迭代器图纸做的迭代器类，用来迭代被迭代对象的名字列表
	class NameIterator implements Iterator{
		int index;//作为数组的指针
		
		@Override
		public boolean hasNext() {  //指针只能是比长度小的值。
			if (index < names.length) {
				return true;
			}
			return false;
		}
		
		@Override
		public Object next() {
			if (this.hasNext()) {
				return names[index++];  //这里是后++操作，会先把当前index取到，再加加操作；
			}
			return null;  //当指针判断为等于长度之前，还是会迭代一次，所以为了避免报错，这里要返回null，以便程序继续运行。
		}
		
	}
}


