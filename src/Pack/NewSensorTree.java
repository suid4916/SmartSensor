package Pack;

public class NewSensorTree {
	public static void add(NewSensorNode parent, NewSensorNode child) {
        // 부모 노드의 자식 노드가 없다면
        if(parent.getLeftChild() == null)
            parent.setLeftChild(child);
        // 부모 노드의 자식 노드가 있다면
        else {
            // 자식 노드의 형제로 노드로 추가
            NewSensorNode temp = parent.getLeftChild();
            while(temp.getRightChild() != null)
                temp = temp.getRightChild();
             
            temp.setRightChild(child);
        }
    }
}
