/*
 * �ۼ��� : ������
 * 
 * */

import java.awt.Color;

public class Pawn
{
	Board_1vs1 chessBoard = new Board_1vs1();
	
	// ���� �̵��� �� �ִ��� �����ִ� �Լ�
	public void showCanMovePlace(int originalRow, int originalCol)
	{
		// WHITE TURN
		if (Board_1vs1.whoseTurn == 1)
		{
			// ü���� ������ �ʱ�ȭ�Ѵ�.
			for (int i = 0; i < 8; i++)
				for (int j = 0; j < 8; j++)
					if ((i+j) % 2 == 0)
						Board_1vs1.boardPiece[i][j].setBackground(Color.GRAY);
					else
						Board_1vs1.boardPiece[i][j].setBackground(Color.WHITE);
			
			// �� �� �ִ� ���� ������ ����� ĥ�Ѵ�.
			// ��� ����� ���� ��ø�ȴ�.
			// ��� 1 = ó�� ������ ��
			// ���� ��ĭ���� ������ �� �ִ�.
			if (originalRow == 6 && 								// ó�� ��ҿ� �־�� �Ѵ�.
				Board_1vs1.board[originalRow-2][originalCol] == 0)  // ������ ���� ���� ������ �ȵȴ�.
				Board_1vs1.boardPiece[originalRow-2][originalCol].setBackground(Color.ORANGE);
			
			// ��� 2 = ó���� �ƴ� ������ ������ ��
			// ���� ��ĭ���θ� ������ �� �ִ�.
			if (originalRow != 0 &&									// ü������ �� ��ܿ� ������ �� �ȴ�.
				Board_1vs1.board[originalRow-1][originalCol] == 0)  // ������ ���� ���� ������ �ȵȴ�.
				Board_1vs1.boardPiece[originalRow-1][originalCol].setBackground(Color.ORANGE);
			
			// ��� 3 = ���� ���Ļ�. �� �밢�� ���⿡ ���� ü������ ���� ��
			// ���� �밢������ ������ �� �ִ�.
			if (originalCol != 0 &&										// ���� ���� ���� �ʾƾ� �Ѵ�.
				Board_1vs1.board[originalRow-1][originalCol-1] != 0 &&  // ��ĭ�� �ƴ϶� ü������ �־�� �Ѵ�.
				Board_1vs1.board[originalRow-1][originalCol-1]%10 != 1) // �� ü������ �ڱ� ü������ �ƴϾ�� �Ѵ�.
			{
				Board_1vs1.boardPiece[originalRow-1][originalCol-1].setBackground(Color.ORANGE);
			}
			
			// ��� 4 = ������ ���Ļ�. �� �밢�� ���⿡ ���� ü������ ���� ��
			// ������ �밢������ ������ �� �ִ�.
			if (originalCol != 7 &&										// ������ ���� ���� �ʾƾ� �Ѵ�.
				Board_1vs1.board[originalRow-1][originalCol+1] != 0 &&  // ��ĭ�� �ƴ϶� ü������ �־�� �Ѵ�.
				Board_1vs1.board[originalRow-1][originalCol+1]%10 != 1) // �� ü������ �ڱ� ü������ �ƴϾ�� �Ѵ�.
			{
				Board_1vs1.boardPiece[originalRow-1][originalCol+1].setBackground(Color.ORANGE);
			}
			// Ȱ��ȭ�� ü������ ��ġ�� �̰����� �����Ѵ�.
			Board_1vs1.activatedChessPiece[0] = originalRow;
			Board_1vs1.activatedChessPiece[1] = originalCol;
		}
		
		// BLACK TURN
		if (Board_1vs1.whoseTurn == 3)
		{
			// ü���� ������ �ʱ�ȭ�Ѵ�.
			for (int i = 0; i < 8; i++)
				for (int j = 0; j < 8; j++)
					if ((i+j) % 2 == 0)
						Board_1vs1.boardPiece[i][j].setBackground(Color.GRAY);
					else
						Board_1vs1.boardPiece[i][j].setBackground(Color.WHITE);
			
			// �� �� �ִ� ���� ������ ����� ĥ�Ѵ�.
			// ��� ����� ���� ��ø�ȴ�.
			// ��� 1 = ó�� ������ ��
			// ���� ��ĭ���� ������ �� �ִ�.
			if (originalRow == 1 && 								// ó�� ��ҿ� �־�� �Ѵ�.
				Board_1vs1.board[originalRow+2][originalCol] == 0)  // ������ ���� ���� ������ �ȵȴ�.
				Board_1vs1.boardPiece[originalRow+2][originalCol].setBackground(Color.ORANGE);
			
			// ��� 2 = ó���� �ƴ� ������ ������ ��
			// ���� ��ĭ���θ� ������ �� �ִ�.
			if (originalRow != 0 &&									// ü������ �� ��ܿ� ������ �� �ȴ�.
				Board_1vs1.board[originalRow+1][originalCol] == 0)  // ������ ���� ���� ������ �ȵȴ�.
				Board_1vs1.boardPiece[originalRow+1][originalCol].setBackground(Color.ORANGE);
			
			// ��� 3 = ���� ���Ļ�. �� �밢�� ���⿡ ���� ü������ ���� ��
			// ���� �밢������ ������ �� �ִ�.
			if (originalCol != 0 &&										// ���� ���� ���� �ʾƾ� �Ѵ�.
				Board_1vs1.board[originalRow+1][originalCol-1] != 0 &&  // ��ĭ�� �ƴ϶� ü������ �־�� �Ѵ�.
				Board_1vs1.board[originalRow+1][originalCol-1]%10 != 1) // �� ü������ �ڱ� ü������ �ƴϾ�� �Ѵ�.
			{
				Board_1vs1.boardPiece[originalRow+1][originalCol-1].setBackground(Color.ORANGE);
			}
			
			// ��� 4 = ������ ���Ļ�. �� �밢�� ���⿡ ���� ü������ ���� ��
			// ������ �밢������ ������ �� �ִ�.
			if (originalCol != 7 &&										// ������ ���� ���� �ʾƾ� �Ѵ�.
				Board_1vs1.board[originalRow+1][originalCol+1] != 0 &&  // ��ĭ�� �ƴ϶� ü������ �־�� �Ѵ�.
				Board_1vs1.board[originalRow+1][originalCol+1]%10 != 1) // �� ü������ �ڱ� ü������ �ƴϾ�� �Ѵ�.
			{
				Board_1vs1.boardPiece[originalRow+1][originalCol+1].setBackground(Color.ORANGE);
			}
			// Ȱ��ȭ�� ü������ ��ġ�� �̰����� �����Ѵ�.
			Board_1vs1.activatedChessPiece[0] = originalRow;
			Board_1vs1.activatedChessPiece[1] = originalCol;
		}
	}
}
