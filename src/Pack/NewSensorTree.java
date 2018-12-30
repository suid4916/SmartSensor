package Pack;

public class NewSensorTree {
	public static void add(NewSensorNode parent, NewSensorNode child) {
        // �θ� ����� �ڽ� ��尡 ���ٸ�
        if(parent.getLeftChild() == null)
            parent.setLeftChild(child);
        // �θ� ����� �ڽ� ��尡 �ִٸ�
        else {
            // �ڽ� ����� ������ ���� �߰�
            NewSensorNode temp = parent.getLeftChild();
            while(temp.getRightChild() != null)
                temp = temp.getRightChild();
             
            temp.setRightChild(child);
        }
    }
}
