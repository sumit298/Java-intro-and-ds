import java.util.Scanner;

public class HammingCode {
	// TODO: Do hamming code of any size.
	public static void SenderSide() {
		try (Scanner scan = new Scanner(System.in)) {
			int codeword[] = new int[10];
			System.out.println("Enter bits of data: ");
			codeword[3] = scan.nextInt();
			codeword[5] = scan.nextInt();
			codeword[6] = scan.nextInt();
			codeword[7] = scan.nextInt();

			// parity bits operations
			codeword[1] = codeword[3] ^ codeword[5] ^ codeword[7];
			// p1 = D3 D5 D7
			codeword[2] = codeword[3] ^ codeword[6] ^ codeword[7];
			// p2 = D3 D6 D7
			codeword[4] = codeword[5] ^ codeword[6] ^ codeword[7];
			// p4 = D5 D6 D7

			System.out.println("Encoded data");
			System.out.println("D7\tD6\tD5\tP4\tD3\tP2\tP1");
			for (int index = 7; index > 0; index--) {
				System.out.print(codeword[index] + "\t");
			}
		}
		System.out.println();

	}

	public static void ReceiverSide() {
		Scanner scan = new Scanner(System.in);
		int receivedCodeword[] = new int[10];
		int parity1, parity2, parity4, decimal;
		System.out.println("Enter Received bits one by one");
		for (int index = 0; index < 7; index++) {
			receivedCodeword[index] = scan.nextInt();
		}
		parity1 = receivedCodeword[0] ^ receivedCodeword[2] ^ receivedCodeword[4] ^ receivedCodeword[6];
		parity2 = receivedCodeword[0] ^ receivedCodeword[1] ^ receivedCodeword[4] ^ receivedCodeword[5];
		parity4 = receivedCodeword[0] ^ receivedCodeword[1] ^ receivedCodeword[2] ^ receivedCodeword[3];

		decimal = parity4 * 4 + parity2 * 2 + parity1;

		if (decimal == 0) {
			System.out.println("No error while transmission of data");

		} else {
			System.out.println("Error at position: " + decimal);

			System.out.println("Codeword Received");
			System.out.println("D7\tD6\tD5\tP4\tD3\tP2\tP1");
			for (int index = 0; index < 7; index++) {

				System.out.print(receivedCodeword[index] + "\t");
			}
			System.out.println();

			// Correcting error
			System.out.println("Corrected Message is: ");
			if (receivedCodeword[7 - decimal] == 0) {
				receivedCodeword[7 - decimal] = 1;
			} else {
				receivedCodeword[7 - decimal] = 0;

			}
			// Correct codeword
			System.out.println("D7\tD6\tD5\tP4\tD3\tP2\tP1");

			for (int index = 0; index < 7; index++) {
				System.out.print(receivedCodeword[index] + "\t");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		SenderSide();
		ReceiverSide();
	}

}