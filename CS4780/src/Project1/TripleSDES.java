package Project1;

public class TripleSDES {
	
	public static void main(String[] args) {
		        final long startTime = System.currentTimeMillis();
		        System.out.println("Encrypt Cases:-");
		        byte encryptkey1[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		        byte encryptkey2[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		        byte rawplain1[] = {0, 0, 0, 0, 0, 0, 0, 0};
		        System.out.print("Key 1: ");
		        for (int i = 0; i < 10; i++) {
		            System.out.print(encryptkey1[i] + " ");
		        }
		        System.out.print("Key 2: ");
		        for (int i = 0; i < 10; i++) {
		            System.out.print(encryptkey2[i] + " ");
		        }
		        System.out.print("Plaintext: ");
		        for (int i = 0; i < 8; i++) {
		            System.out.print(rawplain1[i] + " ");
		        }
		        byte[] encryptresult = Encrypt(encryptkey1, encryptkey2, rawplain1);
		        System.out.print("Ciphertext: " + setBoldText);
		        for (int i = 0; i < 8; i++) {
		            System.out.print(encryptresult[i] + " ");
		        }
		        System.out.println(setPlainText + "\n ");
		        byte encryptkey3[] = {1, 0, 0, 0, 1, 0, 1, 1, 1, 0};
		        byte encryptkey4[] = {0, 1, 1, 0, 1, 0, 1, 1, 1, 0};
		        byte rawplain2[] = {1, 1, 0, 1, 0, 1, 1, 1};
		        System.out.print("Key 1: ");
		        for (int i = 0; i < 10; i++) {
		            System.out.print(encryptkey3[i] + " ");
		        }
		        System.out.print("Key 2: ");
		        for (int i = 0; i < 10; i++) {
		            System.out.print(encryptkey4[i] + " ");
		        }
		        System.out.print("Plaintext: ");
		        for (int i = 0; i < 8; i++) {
		            System.out.print(rawplain2[i] + " ");
		        }
		        byte[] encryptresult1 = Encrypt(encryptkey3, encryptkey4, rawplain2);
		        System.out.print("Ciphertext: " + setBoldText);
		        for (int i = 0; i < 8; i++) {
		            System.out.print(encryptresult1[i] + " ");
		        }
		        System.out.println(setPlainText + "\n ");
		        byte encryptkey5[] = {1, 0, 0, 0, 1, 0, 1, 1, 1, 0};
		        byte encryptkey6[] = {0, 1, 1, 0, 1, 0, 1, 1, 1, 0};
		        byte rawplain3[] = {1, 0, 1, 0, 1, 0, 1, 0};
		        System.out.print("Key 1: ");
		        for (int i = 0; i < 10; i++) {
		            System.out.print(encryptkey5[i] + " ");
		        }
		        System.out.print("Key 2: ");
		        for (int i = 0; i < 10; i++) {
		            System.out.print(encryptkey6[i] + " ");
		        }
		        System.out.print("Plaintext: ");
		        for (int i = 0; i < 8; i++) {
		            System.out.print(rawplain3[i] + " ");
		        }
		        byte[] encryptresult2 = Encrypt(encryptkey5, encryptkey6, rawplain3);
		        System.out.print("Ciphertext: " + setBoldText);
		        for (int i = 0; i < 8; i++) {
		            System.out.print(encryptresult2[i] + " ");
		        }
		        System.out.println(setPlainText + "\n ");
		        byte encryptkey7[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		        byte encryptkey8[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		        byte rawplain4[] = {1, 0, 1, 0, 1, 0, 1, 0};
		        System.out.print("Key 1: ");
		        for (int i = 0; i < 10; i++) {
		            System.out.print(encryptkey7[i] + " ");
		        }
		        System.out.print("Key 2: ");
		        for (int i = 0; i < 10; i++) {
		            System.out.print(encryptkey8[i] + " ");
		        }
		        System.out.print("Plaintext: ");
		        for (int i = 0; i < 8; i++) {
		            System.out.print(rawplain4[i] + " ");
		        }
		        byte[] encryptresult3 = Encrypt(encryptkey7, encryptkey8, rawplain4);
		        System.out.print("Ciphertext: " + setBoldText);
		        for (int i = 0; i < 8; i++) {
		            System.out.print(encryptresult3[i] + " ");
		        }
		        System.out.println(setPlainText + "\n\nDecrypt Cases:-");
		        byte decryptkey1[] = {1, 0, 0, 0, 1, 0, 1, 1, 1, 0};
		        byte decryptkey2[] = {0, 1, 1, 0, 1, 0, 1, 1, 1, 0};
		        byte rawcipher1[] = {1, 1, 1, 0, 0, 1, 1, 0};
		        System.out.print("Key 1: ");
		        for (int i = 0; i < 10; i++) {
		            System.out.print(decryptkey1[i] + " ");
		        }
		        System.out.print("Key 2: ");
		        for (int i = 0; i < 10; i++) {
		            System.out.print(decryptkey2[i] + " ");
		        }
		        byte[] decryptresult1 = Decrypt(decryptkey1, decryptkey2, rawcipher1);
		        System.out.print("Plaintext: " + setBoldText);
		        for (int i = 0; i < 8; i++) {
		            System.out.print(decryptresult1[i] + " ");
		        }
		        System.out.print(setPlainText);
		        System.out.print("Ciphertext: ");
		        for (int i = 0; i < 8; i++) {
		            System.out.print(rawcipher1[i] + " ");
		        }
		        System.out.println("\n ");
		        byte decryptkey3[] = {1, 0, 1, 1, 1, 0, 1, 1, 1, 1};
		        byte decryptkey4[] = {0, 1, 1, 0, 1, 0, 1, 1, 1, 0};
		        byte rawcipher2[] = {0, 1, 0, 1, 0, 0, 0, 0};
		        System.out.print("Key 1: ");
		        for (int i = 0; i < 10; i++) {
		            System.out.print(decryptkey3[i] + " ");
		        }
		        System.out.print("Key 2: ");
		        for (int i = 0; i < 10; i++) {
		            System.out.print(decryptkey4[i] + " ");
		        }
		        byte[] decryptresult2 = Decrypt(decryptkey3, decryptkey4, rawcipher2);
		        System.out.print("Plaintext: " + setBoldText);
		        for (int i = 0; i < 8; i++) {
		            System.out.print(decryptresult2[i] + " ");
		        }
		        System.out.print(setPlainText);
		        System.out.print("Ciphertext: ");
		        for (int i = 0; i < 8; i++) {
		            System.out.print(rawcipher2[i] + " ");
		        }
		        System.out.println("\n ");
		        byte decryptkey5[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		        byte decryptkey6[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		        byte rawcipher3[] = {1, 0, 0, 0, 0, 0, 0, 0};
		        System.out.print("Key 1: ");
		        for (int i = 0; i < 10; i++) {
		            System.out.print(decryptkey5[i] + " ");
		        }
		        System.out.print("Key 2: ");
		        for (int i = 0; i < 10; i++) {
		            System.out.print(decryptkey6[i] + " ");
		        }
		        byte[] decryptresult3 = Decrypt(decryptkey5, decryptkey6, rawcipher3);
		        System.out.print("Plaintext: " + setBoldText);
		        for (int i = 0; i < 8; i++) {
		            System.out.print(decryptresult3[i] + " ");
		        }
		        System.out.print(setPlainText);
		        System.out.print("Ciphertext: ");
		        for (int i = 0; i < 8; i++) {
		            System.out.print(rawcipher3[i] + " ");
		        }
		        System.out.println("\n ");
		        byte decryptkey7[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		        byte decryptkey8[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		        byte rawcipher4[] = {1, 0, 0, 1, 0, 0, 1, 0};
		        System.out.print("Key 1: ");
		        for (int i = 0; i < 10; i++) {
		            System.out.print(decryptkey7[i] + " ");
		        }
		        System.out.print("Key 2: ");
		        for (int i = 0; i < 10; i++) {
		            System.out.print(decryptkey8[i] + " ");
		        }
		        byte[] decryptresult4 = Decrypt(decryptkey7, decryptkey8, rawcipher4);
		        System.out.print("Plaintext: " + setBoldText);
		        for (int i = 0; i < 8; i++) {
		            System.out.print(decryptresult4[i] + " ");
		        }
		        System.out.print(setPlainText);
		        System.out.print("Ciphertext: ");
		        for (int i = 0; i < 8; i++) {
		            System.out.print(rawcipher4[i] + " ");
		        }
		        final long endTime = System.currentTimeMillis();
		        System.out.print("\n\nTotal execution time: " + (endTime - startTime) + " milliseconds");
		        //End Test Cases
		    }
		    static byte s0[][] = {{1, 0, 3, 2}, {3, 2, 1, 0}, {0, 2, 1, 3}, {3, 1, 3, 2}};
		    static byte s1[][] = {{0, 1, 2, 3}, {2, 0, 1, 3}, {3, 0, 1, 0}, {2, 1, 0, 3}};
		    private static final String setPlainText = " ";
		    private static final String setBoldText = " ";
		    public static byte[] PTen(byte[] key) {
		        byte[] ptenkey = new byte[10];
		        int[] order = {2, 4, 1, 6, 3, 9, 0, 8, 7, 5};
		        for (int i = 0; i < 10; i++) {
		            ptenkey[i] = key[order[i]];
		        }
		        return ptenkey;
		        }
		    
		    public static byte[] PEight(byte[] key) {
		        byte[] peightkey = new byte[8];
		        int[] order = {5, 2, 6, 3, 7, 4, 9, 8};
		        for (int i = 0; i < 8; i++) {
		            peightkey[i] = key[order[i]];
		        }
		        return peightkey;
		    }
		    
		    public static byte[] OneCircularLeftShift(byte[] key) {
		        byte[] shiftoneleft = new byte[10];
		        int[] order = {1, 2, 3, 4, 0, 6, 7, 8, 9, 5};
		        for (int i = 0; i < 10; i++) {
		            shiftoneleft[i] = key[order[i]];
		        }
		        return shiftoneleft;
		    }
		    public static byte[] TwoCircularLeftShift(byte[] key) {
		        byte[] shifttwoleft = new byte[10];
		        int[] order = {2, 3, 4, 0, 1, 7, 8, 9, 5, 6};
		        for (int i = 0; i < 10; i++) {
		            shifttwoleft[i] = key[order[i]];
		        }
		        return shifttwoleft;
		    }
		    public static byte[] IPOperation(byte[] plaintext) {
		        byte[] ipedtext = new byte[8];
		        int[] order = {1, 5, 2, 0, 3, 7, 4, 6};
		        for (int i = 0; i < 8; i++) {
		            ipedtext[i] = plaintext[order[i]];
		        }
		        return ipedtext;
		    }
		    public static byte[] IPInverse(byte[] plaintext) {
		        byte[] ipinvedtext = new byte[8];
		        int[] order = {3, 0, 2, 4, 6, 1, 7, 5};
		        for (int i = 0; i < 8; i++) {
		            ipinvedtext[i] = plaintext[order[i]];
		        }
		        return ipinvedtext;
		    }
		    public static byte[] EPOperation(byte[] rightmost) {
		        byte[] output = new byte[8];
		        // numbers refer to right-nibble
		        int[] order = {7, 4, 5, 6, 5, 6, 7, 4};
		        for (int i = 0; i < 8; i++) {
		            output[i] = rightmost[order[i]];
		        }
		        return output;
		    }

		    public static byte[] Add4Key(byte[] EP, byte[] key) {
		        byte[] output = new byte[4];
		        for (int i = 0; i < 4; i++) {
		            byte L = EP[i];
		            byte R = key[i];
		            int LR = L ^ R;
		            output[i] = (byte) LR;
		        }
		        return output;
		    }
		    public static byte[] Add8Key(byte[] EP, byte[] key) {
		        byte[] output = new byte[8];
		        for (int i = 0; i < 8; i++) {
		            byte L = EP[i];
		            byte R = key[i];
		            int LR = L ^ R;
		            output[i] = (byte) LR;
		        }
		        return output;
		    }
		    public static byte[] SBoxOperation(byte[] EPKey) {
		        byte[] output = new byte[4];
		        int a, b, x, y;
		        int col1 = EPKey[0], col2 = EPKey[3], row1 = EPKey[1], row2 = EPKey[2];
		        int col3 = EPKey[4], col4 = EPKey[7], row3 = EPKey[5], row4 = EPKey[6];

		        if (col1 == 1 && col2 == 1) {
		            x = 3;
		        } else if (col1 == 1 && col2 == 0) {
		            x = 2;
		        } else if (col1 == 0 && col2 == 1) {
		            x = 1;
		        } else {
		            x = 0;
		        }
		        
		        if (row1 == 1 && row2 == 1) {
		            y = 3;
		        } else if (row1 == 1 && row2 == 0) {
		            y = 2;
		        } else if (row1 == 0 && row2 == 1) {
		            y = 1;
		        } else {
		            y = 0;
		        }
		        if (s0[x][y] == 3) {
		            output[0] = 1;
		            output[1] = 1;
		        } else if (s0[x][y] == 2) {
		            output[0] = 1;
		            output[1] = 0;
		        } else if (s0[x][y] == 1) {
		            output[0] = 0;
		            output[1] = 1;
		        } else {
		            output[0] = 0;
		            output[1] = 0;
		        }
		        if (col3 == 1 && col4 == 1) {
		            a = 3;
		        } else if (col3 == 1 && col4 == 0) {
		            a = 2;
		        } else if (col3 == 0 && col4 == 1) {
		            a = 1;
		        } else {
		            a = 0;
		        }
		        if (row3 == 1 && row4 == 1) {
		            b = 3;
		        } else if (row3 == 1 && row4 == 0) {
		            b = 2;
		        } else if (row3 == 0 && row4 == 1) {
		            b = 1;
		        } else {
		            b = 0;
		        }
		        if (s1[a][b] == 3) {
		            output[2] = 1;
		            output[3] = 1;
		        } else if (s1[a][b] == 2) {
		            output[2] = 1;
		            output[3] = 0;
		        } else if (s1[a][b] == 1) {
		            output[2] = 0;
		            output[3] = 1;
		        } else {
		            output[2] = 0;
		            output[3] = 0;
		        }
		        return output;
		    }
		    public static byte[] PFour(byte[] sboxfour) {
		        byte[] output = new byte[4];
		        int[] order = {1, 3, 2, 0};
		        for (int i = 0; i < 4; i++) {
		            output[i] = sboxfour[order[i]];
		        }
		        return output;
		    }
		    
		    public static byte[] EncryptDES(byte[] rawkey, byte[] plaintext) {
		        byte[] Fkey1Result = new byte[8];
		        byte[] SWResult = new byte[8];
		        byte[] rightbyteside = new byte[4];
		        byte[] leftbyteside = new byte[4];
		        int[] rightside = {4, 5, 6, 7};

		        byte[] PTenKey = PTen(rawkey);
		        byte[] LSTenKey = OneCircularLeftShift(PTenKey);
		        byte[] Key1 = PEight(LSTenKey);
		        byte[] TwoLSTenKey = TwoCircularLeftShift(LSTenKey);
		        byte[] Key2 = PEight(TwoLSTenKey);
		        byte[] IPplaintext = IPOperation(plaintext);
		        byte[] EPResult = EPOperation(IPplaintext);
		        byte[] EPplusKey = Add8Key(EPResult, Key1);
		        byte[] P4Result = PFour(SBoxOperation(EPplusKey));
		        for (int i = 0; i < 4; i++) {
		            rightbyteside[i] = IPplaintext[i];
		            leftbyteside[i] = IPplaintext[rightside[i]];
		        }
		        byte[] addfourkey = Add4Key(P4Result, rightbyteside);
		        for (int i = 0; i < 4; i++) {
		            Fkey1Result[i] = addfourkey[i];
		            Fkey1Result[rightside[i]] = leftbyteside[i];
		            SWResult[i] = leftbyteside[i];
		            SWResult[rightside[i]] = addfourkey[i];
		        }
		        byte[] EP2Result = EPOperation(SWResult);
		        byte[] EP2plusKey = Add8Key(EP2Result, Key2);
		        byte[] Fkey2Result = new byte[8];
		        byte[] SW2Result = new byte[8];
		        byte[] right2byteside = new byte[4];
		        byte[] left2byteside = new byte[4];
		        byte[] P42Result = PFour(SBoxOperation(EP2plusKey));
		        for (int i = 0; i < 4; i++) {
		            right2byteside[i] = SWResult[i];
		            left2byteside[i] = SWResult[rightside[i]];
		        }
		        byte[] addfour2key = Add4Key(P42Result, right2byteside);
		        for (int i = 0; i < 4; i++) {
		            Fkey2Result[i] = addfour2key[i];
		            Fkey2Result[rightside[i]] = left2byteside[i];
		            SW2Result[i] = left2byteside[i];
		            SW2Result[rightside[i]] = addfour2key[i];
		        }
		        byte[] fin = IPInverse(Fkey2Result);
		        return fin;
		    }
		    public static byte[] DecryptDES(byte[] rawkey, byte[] ciphertext) {
		        byte[] finplain;
		        byte[] rightbyte = new byte[8];
		        byte[] leftbyte = new byte[8];
		        int[] leftmost = {0, 1, 2, 3};
		        int[] rightmost = {4, 5, 6, 7};
		        byte[] PTenKey = PTen(rawkey);
		        byte[] LSTenKey = OneCircularLeftShift(PTenKey);
		        byte[] Key1 = PEight(LSTenKey);
		        byte[] TwoLSTenKey = TwoCircularLeftShift(LSTenKey);
		        byte[] Key2 = PEight(TwoLSTenKey);
		        byte[] finIPop = IPOperation(ciphertext);
		        for (int i = 0; i < 4; i++) {
		            leftbyte[i] = finIPop[i];
		            rightbyte[i] = finIPop[rightmost[i]];
		        }
		        byte[] finEPIPop = EPOperation(finIPop);

		        byte[] finXORkey2 = Add8Key(finEPIPop, Key2);
		        byte[] P4Result = PFour(SBoxOperation(finXORkey2));
		        byte[] p4XORleftbyte = Add4Key(P4Result, leftbyte);
		        byte[] updatedIPop = new byte[8];
		        for (int i = 0; i < 4; i++) {
		            updatedIPop[rightmost[i]] = p4XORleftbyte[i];
		            updatedIPop[i] = rightbyte[i];
		        }
		        byte[] EPupdatedIPop = EPOperation(updatedIPop);
		        byte[] epupdatedXORkey1 = Add8Key(EPupdatedIPop, Key1);
		        byte[] P4tworesult = PFour(SBoxOperation(epupdatedXORkey1));
		        byte[] p4twoXORleftbyte = Add4Key(P4tworesult, rightbyte);
		        byte[] finUpdate = new byte[8];
		        for (int i = 0; i < 4; i++) {
		            finUpdate[i] = p4twoXORleftbyte[i];
		            finUpdate[rightmost[i]] = p4XORleftbyte[i];
		        }
		        finplain = IPInverse(finUpdate);
		        return finplain;
		    }
		    public static byte[] Encrypt(byte[] rawkey1, byte[] rawkey2, byte[] plaintext) {
		        byte[] result;
		        result = EncryptDES(rawkey1, DecryptDES(rawkey2, EncryptDES(rawkey1, plaintext)));
		        return result;
		    }
		    public static byte[] Decrypt(byte[] rawkey1, byte[] rawkey2, byte[] ciphertext) {
		        byte[] result;
		        result = DecryptDES(rawkey1, EncryptDES(rawkey2, DecryptDES(rawkey1, ciphertext)));
		        return result;
		    }
		   
		}