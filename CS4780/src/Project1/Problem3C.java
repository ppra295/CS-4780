package Project1;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Problem3C {
	
	 public static void main(String[] args) throws IOException {
	       
		 final long startTime = System.currentTimeMillis();
	       
	        int parts = 46;
	        byte[][] messageholder = new byte[parts][8];
	        int currentint;
	       
	        String currentstring;
	        String megastringforwards = " ABCDEFGHIJKLMNOPQRSTUVWXYZ?\':,.";
	        String megastringbackwards = ".,:\'?ZYXWVUTSRQPONMLKJIHGFEDCBA ";
	        
	        // Split strings megastring forwards/backwards to help in the key generation nested for loop
	         
	        String[] stringforwards = megastringforwards.split("");
	        String[] stringbackwards = megastringbackwards.split("");
	        
	        int line = 0;
	        byte[] firstarray, secondarray;
	        byte[][] allkeysforone = new byte[1024][10];
	        byte[][] allkeysfortwo = new byte[1024][10];

	        
	         // Split message up and put it in the messageholder[][] for use later
	         
	        System.out.println("Breaking up message...");
	        for (int j = 0; j < parts; j++) {
	            int jint = j * 8;
	           
	            currentstring = message.substring(jint, jint + 8);
	            
	            String[] currentstringarray = currentstring.split("");
	           
	            for (int k = 0; k < 8; k++) {
	                currentint = Integer.parseInt(currentstringarray[k]);
	                messageholder[j][k] = (byte) currentint;
	            }
	        }
	        System.out.println("Key 1 generating...");

	        byte[][] allkeys = new byte[1024][10];
	        
	        for (int i = 0; i < stringforwards.length; i++) {
	            for (int j = 0; j < stringbackwards.length; j++) {
	                firstarray = CASCII.Convert(stringforwards[i]);
	                secondarray = CASCII.Convert(stringbackwards[j]);
	                byte[] completearray = new byte[10];

	                System.arraycopy(firstarray, 0, completearray, 0, 5);
	                System.arraycopy(secondarray, 0, completearray, 5, 5);
	                for (int k = 0; k < completearray.length; k++) {
	                    allkeysforone[line][k] = completearray[k];

	                }
	               
	                line++;
	            }
	        }
	        
	        int line2 = 0;
	        
	        System.out.println("Key 2 generating...");

	        for (int i = 0; i < stringforwards.length; i++) {
	            for (int j = 0; j < stringbackwards.length; j++) {
	                secondarray = CASCII.Convert(stringforwards[i]);
	                firstarray = CASCII.Convert(stringbackwards[j]);
	                byte[] completearray = new byte[10];

	                System.arraycopy(firstarray, 0, completearray, 0, 5);
	                System.arraycopy(secondarray, 0, completearray, 5, 5);
	                for (int k = 0; k < completearray.length; k++) {
	                    allkeysfortwo[line2][k] = completearray[k];
	                }
	                line2++;
	            }
	        }
	        
	        byte[] currentkey1 = new byte[10];
	        byte[] currentkey2 = new byte[10];
	        byte[] currentCiphertext1 = new byte[10];
	        byte[] currentDecrypt;
	        byte[] messageout = new byte[368];
	        byte[] finalmessageout = new byte[368];
	        byte[][] finalmessageholder = new byte[1024 * 1024][368];
	        
	        int totalrowcount = 0;
	        byte[][] key1holder = new byte[1024*1024][10];
	        byte[][] key2holder = new byte[1024*1024][10];
	        
	        System.out.print("Bruteforce beginning...");

	        for (int row = 0; row < 1024; row++) {
	           
	            for (int key1col = 0; key1col < 10; key1col++) {
	                currentkey1[key1col] = allkeysforone[row][key1col];
	               
	            }
	            for (int key2row = 0; key2row < 1024; key2row++){
	                for (int key2col = 0; key2col < 10; key2col++){
	                    currentkey2[key2col] = allkeysfortwo[key2row][key2col];
	                }

	                for (int messagerow = 0; messagerow < parts; messagerow++) {
	                    for (int messagecol = 0; messagecol < 8; messagecol++) {
	                        currentCiphertext1[messagecol] = messageholder[messagerow][messagecol];
	                    }
	                
	               // Triple Decryption here, with current key1, key2, and entire message
	                
	                    currentDecrypt = TripleDecrypt(currentkey1, currentkey2, currentCiphertext1);
	                    System.arraycopy(currentDecrypt, 0, messageout, 8 * messagerow, 8);

	                }

	            
	               // Add all the message output into finalmessageholder
	             
	                for (int i = 0; i < 368; i++) {
	                    finalmessageholder[totalrowcount][i] = messageout[i];
	                }
	                    for (int i = 0; i < 10; i++) {
	                        key1holder[totalrowcount][i] = currentkey1[i];
	                        key2holder[totalrowcount][i] = currentkey2[i];

	                   
	                    }
	                if(totalrowcount % 10000 == 0) {
	                    System.out.print(".");
	                }
	                totalrowcount++;
	            }

	        }

	        
	           // Output all converted text here
	         
	        byte[] toconvert = new byte[368];
	        System.out.println("\nDone, outputting converted text...");

	        for (int row = 0; row < 1024*1024; row++){
	            for (int col = 0; col < 368; col++){
	                toconvert[col] = finalmessageholder[row][col];
	            }
	            String currentstringconverted = CASCII.toString(toconvert);
	            int ecount = currentstringconverted.length() - currentstringconverted.replace("E","").length();

	            if (ecount > 10){               
	                System.out.print("Key Pair: " + row + " Key 1: [ " + setBoldText);
	                for (int i = 0; i < 10; i++) {
	                    System.out.print(key1holder[row][i] + " ");
	                }
	                System.out.print(setPlainText +"] Key 2: [ " + setBoldText);
	                for (int i = 0; i < 10; i++) {
	                    System.out.print(key2holder[row][i] + " ");
	                }
	                System.out.println(setPlainText + "] Converted: " + setBoldText + CASCII.toString(toconvert) + setPlainText);

	            }

	        }
	        final long endTime = System.currentTimeMillis();
	        System.out.println("\nTotal execution time: " + (endTime - startTime) + " milliseconds");
	    }

	
	    public static String message = "00011111100111111110011111101100111000000011001011110010101010110001011101001101000000110011010111111110000000001010111111000001010010111001111001010101100000110111100011111101011100100100010101000011001100101000000101111011000010011010111100010001001000100001111100100000001000000001101101000000001010111010000001000010011100101111001101111011001001010001100010100000";
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

	    public static byte[] Encrypt(byte[] rawkey, byte[] plaintext) {
	        byte[] Fkey1Result = new byte[8];
	        byte[] SWResult = new byte[8];
	        int[] rightside = {4, 5, 6, 7};

	        byte[] rightbyteside = new byte[4];
	        byte[] leftbyteside = new byte[4];
	        byte[] Fkey2Result = new byte[8];
	        byte[] SW2Result = new byte[8];

	        byte[] right2byteside = new byte[4];
	        byte[] left2byteside = new byte[4];


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

	    public static byte[] Decrypt(byte[] rawkey, byte[] ciphertext) {
	        byte[] finplain;
	        byte[] rightbyte = new byte[8];
	        byte[] leftbyte = new byte[8];
	        byte[] updatedIPop = new byte[8];
	        byte[] finUpdate = new byte[8];
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
	        for (int i = 0; i < 4; i++) {
	            updatedIPop[rightmost[i]] = p4XORleftbyte[i];
	            updatedIPop[i] = rightbyte[i];
	        }
	        byte[] EPupdatedIPop = EPOperation(updatedIPop);
	        byte[] epupdatedXORkey1 = Add8Key(EPupdatedIPop, Key1);
	        byte[] P4tworesult = PFour(SBoxOperation(epupdatedXORkey1));
	        byte[] p4twoXORleftbyte = Add4Key(P4tworesult, rightbyte);
	        for (int i = 0; i < 4; i++) {
	            finUpdate[i] = p4twoXORleftbyte[i];
	            finUpdate[rightmost[i]] = p4XORleftbyte[i];
	        }
	        finplain = IPInverse(finUpdate);
	        return finplain;
	    }

	    public static byte[] TripleDecrypt(byte[] rawkey1, byte[] rawkey2, byte[] ciphertext) {
	        byte[] result;
	        result = Decrypt(rawkey1, Encrypt(rawkey2, Decrypt(rawkey1, ciphertext)));
	        return result;
	    }

	   	}


