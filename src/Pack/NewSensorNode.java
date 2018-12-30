package Pack;

public class NewSensorNode {
	private String data;
	private NewSensorNode leftChild;
	private NewSensorNode rightChild;
	public NewSensorNode(String data){
		this.data = data;
	}
	public void setData(String data){
		this.data = data;
	}
	public String getData(){
		return data;
	}
	public void setLeftChild(NewSensorNode leftChild){
		this.leftChild = leftChild;
	}
	public NewSensorNode getLeftChild(){
		return leftChild;
	}
	public void setRightChild(NewSensorNode rightChild){
		this.rightChild = rightChild;
	}
	public NewSensorNode getRightChild(){
		return rightChild;
	}
}
