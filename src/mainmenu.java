import java.util.Scanner;

public class mainmenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("���ϸ� �ӵ���ӿ� ���� ���� ȯ���մϴ�!");
        System.out.println("1. ���� ����");
        System.out.println("2. ���� ����");
        System.out.print("����> ");

        int choice = scanner.nextInt();
        while (choice != 3) {
            if (choice == 1) {
                startGame();
            } 
            if (choice ==2) {
            	lordGame();
            }
            else {
                System.out.println("�߸��� �Է��Դϴ�. �ٽ� �������ּ���.");
            }
            System.out.println();
            System.out.println("1. ���� ����");
            System.out.println("2. �ҷ�����");
            System.out.println("3. ���� ����");
            System.out.print("����> ");
            choice = scanner.nextInt();
        }
        System.out.println("������ �����մϴ�.");
    }

    private static void startGame() {
        // ���� ���� �ڵ� �ۼ�
    	System.out.println("���ϸ� ������ �����մϴ�!");
    	
    }
    private static void lordGame() {
    	// ������ �ε�
    }
}