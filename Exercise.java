package ʵ��2;


public class Exercise {
	public static final short OPERATION_number = 50;
	private static final short COLUMN_number = 5;
	public BinaryOperation operationList[] = new BinaryOperation[OPERATION_number];

	// ����������������������ǰ�ȼ���Ƿ��Ѿ��������У������ظ�
	public void generateBinaryExercise() {
		BinaryOperation anOperation, opCreator = new BinaryOperation();
		for (int i = 0; i < OPERATION_number; i++) {
			anOperation = opCreator.generateBinaryOperation();
			while (contains(anOperation, i - 1)) {
				anOperation = opCreator.generateBinaryOperation();
			}
			operationList[i] = anOperation;
		}
	}

	public void generateAdditionExercise() {
		BinaryOperation anoOperation, opCreator = new BinaryOperation();
		for (int i = 0; i < OPERATION_number; i++) {
			anoOperation = opCreator.generateAdditionOperation();
			while (contains(anoOperation, i - 1)) {
				anoOperation = opCreator.generateAdditionOperation();
			}
			operationList[i] = anoOperation;
		}
	}

	public void generateSubstractExercise() {
		BinaryOperation anoOperation, opCreator = new BinaryOperation();
		for (int i = 0; i < OPERATION_number; i++) {
			anoOperation = opCreator.generateSubstractOperation();
			while (contains(anoOperation, i - 1)) {
				anoOperation = opCreator.generateSubstractOperation();
			}
			operationList[i] = anoOperation;
		}
	}

	// ֻҪ��������ʽδ�ڵ�ǰ��ϰ���оͼ���β��
	private boolean contains(BinaryOperation anoOperation, int length) {
		boolean found = false;
		for (int i = 0; i <= length; i++) {
			if (anoOperation.equals(operationList[i])) {
				found = true;
				break;
			}
		}
		return found;
	}

	public void formateAndDisplay() {
		for (int i = 0; i < OPERATION_number;) {
			System.out.print("��" + (i + 1) + "��:" + operationList[i].asString());
			i++;
			if (i % 5 == 0) {
				System.out.println();
			}

		}
	}
}
