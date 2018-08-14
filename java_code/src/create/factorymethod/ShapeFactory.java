package create.factorymethod;

public class ShapeFactory {
	
	//使用 getShape 方法获取形状类型的对象,比较麻烦的就是如果形状太多，那么if判断就要一直添加下去
	public Shape getShape(String shapeType){
	      if(shapeType == null){
	         return null;
	      }        
	      if(shapeType.equalsIgnoreCase("CIRCLE")){
	         return new Circle();
	      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();
	      } else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }
	      return null;
	   }

}
