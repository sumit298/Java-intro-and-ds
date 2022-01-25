package HeapMemory;

import java.util.Scanner;

public class heapMemory {

    public static HeapNode createHeapMemory() {
        HeapNode readyhead = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the process values you want to insert: to stop type -1 ");
        int data = scan.nextInt();
        while (data != -1) {
            HeapNode newNode = new HeapNode();
            newNode.data = data;
            if (readyhead == null) {
                readyhead = newNode;
            } else {
                HeapNode readyTemp = readyhead;
                while (readyTemp.next != null) {
                    readyTemp = readyTemp.next;
                }
                readyTemp.next = newNode;
            }
            data = scan.nextInt();
        }
        return readyhead;
    }

    public static void Display(HeapNode readyHead, HeapNode runningHead, HeapNode blockHead) {
        System.out.println("Ready");
        HeapNode readyTemp = readyHead;
        if (readyHead != null) {
            while (readyTemp.next != null) {
                System.out.println(readyTemp.data);
                readyTemp = readyTemp.next;
            }
            System.out.println(readyTemp.data);
        }
        System.out.println("Running");
        HeapNode runningTemp = runningHead;
        if (runningTemp != null) {
            while (runningTemp.next != null) {
                System.out.println(runningTemp.data);
                runningTemp = runningTemp.next;
            }
            // System.out.println(runningTemp.data);
        }
        System.out.println("Blocked");
        HeapNode blockTemp = blockHead;
        if (blockTemp != null) {
            while (blockTemp.next != null) {

                System.out.println(blockTemp.data);
                blockTemp = blockTemp.next;
            }
        }

    }

    public static HeapNode ReadytoRunning(HeapNode readyHead, HeapNode runningHead) {
        if (readyHead == null) {
            System.out.println("No process is in the readyQueue!");
            return readyHead;
        }

        HeapNode runningTemp = runningHead;
        while (runningTemp.next != null) {
            runningTemp = runningTemp.next;
        }
        runningTemp.data = readyHead.data;
        runningTemp.next = new HeapNode();
        runningTemp = runningTemp.next;
        runningTemp.next = null;
        readyHead = readyHead.next;
        return readyHead;
    }

    public static HeapNode RunningToBlock(HeapNode runningHead, HeapNode blockHead) {
        if (runningHead == null) {
            System.out.println("No process in the running queue");
            return runningHead;
        }

        HeapNode blockTemp = blockHead;
        while (blockTemp.next != null) {
            blockTemp = blockTemp.next;
        }
        blockTemp.data = runningHead.data;
        blockTemp.next = new HeapNode();
        blockTemp = blockTemp.next;
        blockTemp.next = null;
        runningHead = runningHead.next;
        return runningHead;
    }

    public static HeapNode BlockToRun(HeapNode blockHead, HeapNode runningHead) {
        if (blockHead == null) {
            System.out.println("No process in block queue !");
            return blockHead;
        }
        HeapNode runningTemp = runningHead;
        while (runningTemp.next != null) {
            runningTemp = runningTemp.next;
        }
        runningTemp.data = blockHead.data;
        runningTemp.next = new HeapNode();
        runningTemp = runningTemp.next;
        runningTemp.next = null;

        blockHead = blockHead.next;
        return blockHead;

    }

    public static HeapNode ReadyToEnd(HeapNode readyHead) {
        readyHead = readyHead.next;
        return readyHead;
    }

    public static HeapNode BlockToEnd(HeapNode blockHead) {
        blockHead = blockHead.next;
        return blockHead;
    }

    public static void menu(HeapNode readyHead, HeapNode runningHead, HeapNode blockHead) {
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        while (choice != -1) {
            System.out.println("1. Ready to Running");
            System.out.println("2. Running to Block");
            System.out.println("3. Block to Running");
            System.out.println("4. Ready to End");
            System.out.println("5. Block to End");
            System.out.println("6. Display");
            System.out.println("-1. Exit");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    readyHead = ReadytoRunning(readyHead, runningHead);
                    break;
                case 2:
                    runningHead = RunningToBlock(runningHead, blockHead);
                    break;
                case 3:
                    blockHead = BlockToRun(blockHead, runningHead);
                    break;
                case 4:
                    readyHead = ReadyToEnd(readyHead);
                    break;
                case 5:
                    blockHead = BlockToEnd(blockHead);
                    break;
                case 6:
                    Display(readyHead, runningHead, blockHead);
                    break;
                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        HeapNode readyHead = createHeapMemory();
        HeapNode runningHead = new HeapNode();
        HeapNode blockHead = new HeapNode();
        menu(readyHead, runningHead, blockHead);
    }

}