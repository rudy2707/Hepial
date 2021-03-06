/* The following code was generated by JFlex 1.5.0-SNAPSHOT */

/*
 * =====================================================================================
 *
 *       Filename:  TCPIA_Flex.flex
 *
 *    Description:  Flex file for the TCPIA compilator.
 *
 *        Version:  1.0
 *        Created:  03/23/2015 11:03:20 AM
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  Axel Fahy, Rudolf Höhn 
 *   Organization:  HES-SO hepia section ITI
 *
 * =====================================================================================
 */
import java_cup.runtime.*;
import java.util.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.5.0-SNAPSHOT
 * from the specification file <tt>TCPIA_Flex.flex</tt>
 */
class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\0\1\4\1\6\1\6\1\5\22\0\1\17\1\0\1\7"+
    "\5\0\1\37\1\40\1\34\1\32\1\46\1\33\1\47\1\3\12\2"+
    "\1\0\1\50\1\35\1\31\1\36\2\0\32\1\1\41\1\0\1\42"+
    "\3\0\1\14\1\21\1\27\1\20\1\16\1\24\1\13\1\1\1\25"+
    "\2\1\1\30\1\15\1\26\1\12\1\10\1\52\1\11\1\43\1\23"+
    "\1\22\1\44\1\1\1\45\2\1\1\0\1\0\1\0\1\51\6\0"+
    "\1\6\u1fa2\0\1\6\1\6\udfd6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\1\3\2\1\5"+
    "\10\2\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\2\2\1\20\1\1\1\21\1\22"+
    "\2\0\1\23\3\2\1\24\1\2\1\25\12\2\1\26"+
    "\1\27\1\30\1\31\1\32\1\2\1\33\1\34\15\2"+
    "\1\35\5\2\1\36\10\2\1\37\6\2\1\40\1\2"+
    "\1\41\2\2\1\42\6\2\1\43\4\2\1\44\1\2"+
    "\1\45\4\2\1\46\4\2\1\47\7\2\1\50\3\2"+
    "\1\51\1\52\1\2\1\53\2\2\1\54\1\55\1\56"+
    "\1\2\1\57\3\2\1\60\1\2\1\61\1\62\1\63";

  private static int [] zzUnpackAction() {
    int [] result = new int[156];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\53\0\126\0\201\0\254\0\327\0\u0102\0\u012d"+
    "\0\u0158\0\u0183\0\u01ae\0\u01d9\0\u0204\0\u022f\0\u025a\0\u0285"+
    "\0\u02b0\0\u02db\0\u0306\0\53\0\53\0\53\0\u0331\0\u035c"+
    "\0\53\0\53\0\53\0\53\0\u0387\0\u03b2\0\53\0\u03dd"+
    "\0\53\0\53\0\u0408\0\327\0\u0433\0\u045e\0\u0489\0\u04b4"+
    "\0\126\0\u04df\0\126\0\u050a\0\u0535\0\u0560\0\u058b\0\u05b6"+
    "\0\u05e1\0\u060c\0\u0637\0\u0662\0\u068d\0\53\0\53\0\53"+
    "\0\53\0\u06b8\0\u06e3\0\53\0\53\0\u070e\0\u0739\0\u0764"+
    "\0\u078f\0\u07ba\0\u07e5\0\u0810\0\u083b\0\u0866\0\u0891\0\u08bc"+
    "\0\u08e7\0\u0912\0\126\0\u093d\0\u0968\0\u0993\0\u09be\0\u09e9"+
    "\0\126\0\u0a14\0\u0a3f\0\u0a6a\0\u0a95\0\u0ac0\0\u0aeb\0\u0b16"+
    "\0\u0b41\0\126\0\u0b6c\0\u0b97\0\u0bc2\0\u0bed\0\u0c18\0\u0c43"+
    "\0\126\0\u0c6e\0\126\0\u0c99\0\u0cc4\0\126\0\u0cef\0\u0d1a"+
    "\0\u0d45\0\u0d70\0\u0d9b\0\u0dc6\0\126\0\u0df1\0\u0e1c\0\u0e47"+
    "\0\u0e72\0\126\0\u0e9d\0\126\0\u0ec8\0\u0ef3\0\u0f1e\0\u0f49"+
    "\0\126\0\u0f74\0\u0f9f\0\u0fca\0\u0ff5\0\126\0\u1020\0\u104b"+
    "\0\u1076\0\u10a1\0\u10cc\0\u10f7\0\u1122\0\53\0\u114d\0\u1178"+
    "\0\u11a3\0\126\0\126\0\u11ce\0\126\0\u11f9\0\u1224\0\126"+
    "\0\126\0\126\0\u124f\0\53\0\u127a\0\u12a5\0\u12d0\0\126"+
    "\0\u12fb\0\126\0\53\0\126";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[156];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\2\2\1\0\1\6\1\7"+
    "\1\10\1\11\1\3\1\12\1\3\1\13\1\2\1\14"+
    "\1\15\1\3\1\16\1\17\1\3\1\20\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\3\1\37\1\40\1\41"+
    "\1\42\1\3\54\0\2\3\5\0\7\3\1\0\11\3"+
    "\12\0\3\3\4\0\1\3\2\0\1\4\53\0\1\43"+
    "\47\0\7\44\1\45\43\44\1\0\2\3\5\0\1\3"+
    "\1\46\1\47\4\3\1\0\11\3\12\0\3\3\4\0"+
    "\1\3\1\0\2\3\5\0\6\3\1\50\1\0\11\3"+
    "\12\0\3\3\4\0\1\3\1\0\2\3\5\0\7\3"+
    "\1\0\2\3\1\51\6\3\12\0\3\3\4\0\1\3"+
    "\1\0\2\3\5\0\7\3\1\0\10\3\1\52\12\0"+
    "\3\3\4\0\1\3\1\0\2\3\5\0\7\3\1\0"+
    "\3\3\1\53\2\3\1\54\1\55\1\3\12\0\3\3"+
    "\4\0\1\3\1\0\2\3\5\0\6\3\1\56\1\0"+
    "\11\3\12\0\3\3\4\0\1\3\1\0\2\3\5\0"+
    "\2\3\1\57\4\3\1\0\11\3\12\0\3\3\4\0"+
    "\1\3\1\0\2\3\5\0\4\3\1\60\2\3\1\0"+
    "\11\3\12\0\3\3\4\0\1\3\1\0\2\3\5\0"+
    "\4\3\1\61\2\3\1\0\5\3\1\62\3\3\12\0"+
    "\3\3\4\0\1\3\1\0\2\3\5\0\2\3\1\63"+
    "\4\3\1\0\11\3\12\0\3\3\4\0\1\3\1\0"+
    "\2\3\5\0\2\3\1\64\4\3\1\0\11\3\12\0"+
    "\3\3\4\0\1\3\1\0\2\3\5\0\7\3\1\0"+
    "\5\3\1\65\3\3\12\0\3\3\4\0\1\3\31\0"+
    "\1\66\52\0\1\67\4\0\1\70\45\0\1\71\22\0"+
    "\2\3\5\0\7\3\1\0\5\3\1\72\3\3\12\0"+
    "\3\3\4\0\1\3\1\0\2\3\5\0\1\3\1\73"+
    "\5\3\1\0\11\3\12\0\3\3\4\0\1\3\47\0"+
    "\1\74\3\0\4\43\1\75\2\0\44\43\7\0\1\44"+
    "\44\0\2\3\5\0\2\3\1\76\4\3\1\0\11\3"+
    "\12\0\3\3\4\0\1\3\1\0\2\3\5\0\7\3"+
    "\1\0\2\3\1\77\6\3\12\0\3\3\4\0\1\3"+
    "\1\0\2\3\5\0\7\3\1\0\3\3\1\100\5\3"+
    "\12\0\3\3\4\0\1\3\1\0\2\3\5\0\2\3"+
    "\1\101\4\3\1\0\10\3\1\102\12\0\3\3\4\0"+
    "\1\3\1\0\2\3\5\0\7\3\1\0\3\3\1\103"+
    "\5\3\12\0\3\3\4\0\1\3\1\0\2\3\5\0"+
    "\1\3\1\104\5\3\1\0\11\3\12\0\3\3\4\0"+
    "\1\3\1\0\2\3\5\0\7\3\1\0\1\3\1\105"+
    "\7\3\12\0\3\3\4\0\1\3\1\0\2\3\5\0"+
    "\2\3\1\106\4\3\1\0\11\3\12\0\3\3\4\0"+
    "\1\3\1\0\2\3\5\0\7\3\1\0\6\3\1\107"+
    "\2\3\12\0\3\3\4\0\1\3\1\0\2\3\5\0"+
    "\7\3\1\0\2\3\1\110\2\3\1\111\3\3\12\0"+
    "\3\3\4\0\1\3\1\0\2\3\5\0\7\3\1\0"+
    "\6\3\1\112\2\3\12\0\3\3\4\0\1\3\1\0"+
    "\2\3\5\0\7\3\1\0\6\3\1\113\2\3\12\0"+
    "\3\3\4\0\1\3\1\0\2\3\5\0\7\3\1\0"+
    "\6\3\1\114\2\3\12\0\3\3\4\0\1\3\1\0"+
    "\2\3\5\0\1\3\1\115\5\3\1\0\11\3\12\0"+
    "\3\3\4\0\1\3\1\0\2\3\5\0\7\3\1\0"+
    "\6\3\1\116\2\3\12\0\3\3\4\0\1\3\1\0"+
    "\2\3\5\0\4\3\1\117\2\3\1\0\11\3\12\0"+
    "\3\3\4\0\1\3\1\0\2\3\5\0\3\3\1\120"+
    "\3\3\1\0\11\3\12\0\3\3\4\0\1\3\1\0"+
    "\2\3\5\0\1\3\1\121\5\3\1\0\11\3\12\0"+
    "\3\3\4\0\1\3\1\0\2\3\5\0\2\3\1\122"+
    "\4\3\1\0\11\3\12\0\3\3\4\0\1\3\1\0"+
    "\2\3\5\0\1\3\1\123\5\3\1\0\11\3\12\0"+
    "\3\3\4\0\1\3\1\0\2\3\5\0\4\3\1\124"+
    "\2\3\1\0\11\3\12\0\3\3\4\0\1\3\1\0"+
    "\2\3\5\0\7\3\1\0\5\3\1\125\3\3\12\0"+
    "\3\3\4\0\1\3\1\0\2\3\5\0\7\3\1\0"+
    "\5\3\1\126\3\3\12\0\3\3\4\0\1\3\1\0"+
    "\2\3\5\0\7\3\1\0\2\3\1\127\6\3\12\0"+
    "\3\3\4\0\1\3\1\0\2\3\5\0\7\3\1\0"+
    "\10\3\1\130\12\0\3\3\4\0\1\3\1\0\2\3"+
    "\5\0\7\3\1\0\3\3\1\131\5\3\12\0\3\3"+
    "\4\0\1\3\1\0\2\3\5\0\7\3\1\0\11\3"+
    "\12\0\2\3\1\132\4\0\1\3\1\0\2\3\5\0"+
    "\1\3\1\133\5\3\1\0\11\3\12\0\3\3\4\0"+
    "\1\3\1\0\2\3\5\0\1\134\6\3\1\0\3\3"+
    "\1\135\1\136\4\3\12\0\1\137\2\3\4\0\1\3"+
    "\1\0\2\3\5\0\7\3\1\0\11\3\12\0\1\140"+
    "\2\3\4\0\1\3\1\0\2\3\5\0\6\3\1\141"+
    "\1\0\11\3\12\0\3\3\4\0\1\3\1\0\2\3"+
    "\5\0\2\3\1\142\4\3\1\0\11\3\12\0\3\3"+
    "\4\0\1\3\1\0\2\3\5\0\7\3\1\0\5\3"+
    "\1\143\3\3\12\0\3\3\4\0\1\3\1\0\2\3"+
    "\5\0\1\3\1\144\5\3\1\0\11\3\12\0\3\3"+
    "\4\0\1\3\1\0\2\3\5\0\7\3\1\0\2\3"+
    "\1\145\6\3\12\0\3\3\4\0\1\3\1\0\2\3"+
    "\5\0\7\3\1\0\11\3\12\0\1\146\2\3\4\0"+
    "\1\3\1\0\2\3\5\0\7\3\1\0\6\3\1\147"+
    "\2\3\12\0\3\3\4\0\1\3\1\0\2\3\5\0"+
    "\6\3\1\150\1\0\11\3\12\0\3\3\4\0\1\3"+
    "\1\0\2\3\5\0\1\3\1\151\5\3\1\0\11\3"+
    "\12\0\3\3\4\0\1\3\1\0\2\3\5\0\7\3"+
    "\1\0\3\3\1\152\5\3\12\0\3\3\4\0\1\3"+
    "\1\0\2\3\5\0\6\3\1\153\1\0\11\3\12\0"+
    "\3\3\4\0\1\3\1\0\2\3\5\0\7\3\1\0"+
    "\11\3\12\0\3\3\4\0\1\154\1\0\2\3\5\0"+
    "\6\3\1\155\1\0\11\3\12\0\3\3\4\0\1\3"+
    "\1\0\2\3\5\0\1\3\1\156\1\157\4\3\1\0"+
    "\11\3\12\0\3\3\4\0\1\3\1\0\2\3\5\0"+
    "\4\3\1\160\2\3\1\0\11\3\12\0\3\3\4\0"+
    "\1\3\1\0\2\3\5\0\2\3\1\161\4\3\1\0"+
    "\11\3\12\0\3\3\4\0\1\3\1\0\2\3\5\0"+
    "\7\3\1\0\5\3\1\162\3\3\12\0\3\3\4\0"+
    "\1\3\1\0\2\3\5\0\7\3\1\0\3\3\1\163"+
    "\5\3\12\0\3\3\4\0\1\3\1\0\2\3\5\0"+
    "\7\3\1\0\6\3\1\164\2\3\12\0\3\3\4\0"+
    "\1\3\1\0\2\3\5\0\4\3\1\165\2\3\1\0"+
    "\11\3\12\0\3\3\4\0\1\3\1\0\2\3\5\0"+
    "\1\3\1\166\5\3\1\0\11\3\12\0\3\3\4\0"+
    "\1\3\1\0\2\3\5\0\7\3\1\0\3\3\1\167"+
    "\5\3\12\0\3\3\4\0\1\3\1\0\2\3\5\0"+
    "\1\3\1\170\5\3\1\0\11\3\12\0\3\3\4\0"+
    "\1\3\1\0\2\3\5\0\6\3\1\171\1\0\11\3"+
    "\12\0\3\3\4\0\1\3\1\0\2\3\5\0\1\172"+
    "\6\3\1\0\4\3\1\173\4\3\12\0\3\3\4\0"+
    "\1\3\1\0\2\3\5\0\6\3\1\174\1\0\11\3"+
    "\12\0\3\3\4\0\1\3\1\0\2\3\5\0\7\3"+
    "\1\0\2\3\1\175\6\3\12\0\3\3\4\0\1\3"+
    "\1\0\2\3\5\0\3\3\1\176\3\3\1\0\11\3"+
    "\12\0\3\3\4\0\1\3\1\0\2\3\5\0\7\3"+
    "\1\0\2\3\1\177\6\3\12\0\3\3\4\0\1\3"+
    "\1\0\2\3\5\0\7\3\1\0\6\3\1\200\2\3"+
    "\12\0\3\3\4\0\1\3\1\0\2\3\5\0\7\3"+
    "\1\0\6\3\1\201\2\3\12\0\3\3\4\0\1\3"+
    "\1\0\2\3\5\0\4\3\1\202\2\3\1\0\11\3"+
    "\12\0\3\3\4\0\1\3\1\0\2\3\5\0\5\3"+
    "\1\203\1\3\1\0\11\3\12\0\3\3\4\0\1\3"+
    "\1\0\2\3\5\0\7\3\1\0\6\3\1\204\2\3"+
    "\12\0\3\3\4\0\1\3\1\0\2\3\5\0\7\3"+
    "\1\0\1\205\10\3\12\0\3\3\4\0\1\3\1\0"+
    "\2\3\5\0\7\3\1\206\11\3\12\0\3\3\4\0"+
    "\1\3\1\0\2\3\5\0\1\3\1\207\5\3\1\0"+
    "\11\3\12\0\3\3\4\0\1\3\1\0\2\3\5\0"+
    "\2\3\1\210\4\3\1\0\11\3\12\0\3\3\4\0"+
    "\1\3\1\0\2\3\5\0\7\3\1\0\6\3\1\211"+
    "\2\3\12\0\3\3\4\0\1\3\1\0\2\3\5\0"+
    "\6\3\1\212\1\0\11\3\12\0\3\3\4\0\1\3"+
    "\1\0\2\3\5\0\1\3\1\213\5\3\1\0\11\3"+
    "\12\0\3\3\4\0\1\3\1\0\2\3\5\0\7\3"+
    "\1\0\3\3\1\214\5\3\12\0\3\3\4\0\1\3"+
    "\1\0\2\3\5\0\7\3\1\0\7\3\1\215\1\3"+
    "\12\0\3\3\4\0\1\3\1\0\2\3\5\0\7\3"+
    "\1\0\6\3\1\216\2\3\12\0\3\3\4\0\1\3"+
    "\1\0\2\3\5\0\5\3\1\217\1\3\1\0\11\3"+
    "\12\0\3\3\4\0\1\3\1\0\2\3\5\0\6\3"+
    "\1\220\1\0\11\3\12\0\3\3\4\0\1\3\1\0"+
    "\2\3\5\0\6\3\1\221\1\0\11\3\12\0\3\3"+
    "\4\0\1\3\1\0\2\3\5\0\3\3\1\222\3\3"+
    "\1\0\11\3\12\0\3\3\4\0\1\3\1\0\2\3"+
    "\5\0\7\3\1\0\6\3\1\223\2\3\12\0\3\3"+
    "\4\0\1\3\1\0\2\3\5\0\7\3\1\224\11\3"+
    "\12\0\3\3\4\0\1\3\1\0\2\3\5\0\7\3"+
    "\1\0\11\3\12\0\3\3\4\0\1\225\1\0\2\3"+
    "\5\0\7\3\1\0\3\3\1\226\5\3\12\0\3\3"+
    "\4\0\1\3\1\0\2\3\5\0\6\3\1\227\1\0"+
    "\11\3\12\0\3\3\4\0\1\3\1\0\2\3\5\0"+
    "\7\3\1\0\7\3\1\230\1\3\12\0\3\3\4\0"+
    "\1\3\1\0\2\3\5\0\7\3\1\0\2\3\1\231"+
    "\6\3\12\0\3\3\4\0\1\3\1\0\2\3\5\0"+
    "\6\3\1\232\1\0\11\3\12\0\3\3\4\0\1\3"+
    "\1\0\2\3\5\0\7\3\1\233\11\3\12\0\3\3"+
    "\4\0\1\3\1\0\2\3\5\0\6\3\1\234\1\0"+
    "\11\3\12\0\3\3\4\0\1\3";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4902];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\21\1\3\11\2\1\4\11\2\1\1\11"+
    "\1\1\2\11\2\0\21\1\4\11\2\1\2\11\110\1"+
    "\1\11\15\1\1\11\6\1\1\11\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[156];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
// Error code
//public void yyerror() {
//    System.out.println("error line " +yyline + " column " +yycolumn
//    + " " +yytext());
//}



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader
             (in, java.nio.charset.Charset.forName("UTF-8")));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 130) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

    // numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 1: 
          { 
          }
        case 52: break;
        case 2: 
          { return new Symbol(sym.ident, new String(yytext()));
          }
        case 53: break;
        case 3: 
          { return new Symbol(sym.constanteent, new String(yytext()));
          }
        case 54: break;
        case 4: 
          { return new Symbol(sym.div);
          }
        case 55: break;
        case 5: 
          { return new Symbol(sym.a);
          }
        case 56: break;
        case 6: 
          { return new Symbol(sym.affectation);
          }
        case 57: break;
        case 7: 
          { return new Symbol(sym.plus);
          }
        case 58: break;
        case 8: 
          { return new Symbol(sym.moins);
          }
        case 59: break;
        case 9: 
          { return new Symbol(sym.mult);
          }
        case 60: break;
        case 10: 
          { return new Symbol(sym.pluspetit);
          }
        case 61: break;
        case 11: 
          { return new Symbol(sym.plusgrand);
          }
        case 62: break;
        case 12: 
          { return new Symbol(sym.parentouvrante);
          }
        case 63: break;
        case 13: 
          { return new Symbol(sym.parentfermante);
          }
        case 64: break;
        case 14: 
          { return new Symbol(sym.crochetouvrant);
          }
        case 65: break;
        case 15: 
          { return new Symbol(sym.crochetfermant);
          }
        case 66: break;
        case 16: 
          { return new Symbol(sym.virgule);
          }
        case 67: break;
        case 17: 
          { return new Symbol(sym.pointvirgule);
          }
        case 68: break;
        case 18: 
          { return new Symbol(sym.moinsunaire);
          }
        case 69: break;
        case 19: 
          { return new Symbol(sym.constantechaine);
          }
        case 70: break;
        case 20: 
          { return new Symbol(sym.ou);
          }
        case 71: break;
        case 21: 
          { return new Symbol(sym.et);
          }
        case 72: break;
        case 22: 
          { return new Symbol(sym.doubleegal);
          }
        case 73: break;
        case 23: 
          { return new Symbol(sym.pluspetitegal);
          }
        case 74: break;
        case 24: 
          { return new Symbol(sym.different);
          }
        case 75: break;
        case 25: 
          { return new Symbol(sym.plusgrandegal);
          }
        case 76: break;
        case 26: 
          { return new Symbol(sym.si);
          }
        case 77: break;
        case 27: 
          { return new Symbol(sym.deuxpoints);
          }
        case 78: break;
        case 28: 
          { return new Symbol(sym.comment, new String(yytext()));
          }
        case 79: break;
        case 29: 
          { return new Symbol(sym.no);
          }
        case 80: break;
        case 30: 
          { return new Symbol(sym.pour);
          }
        case 81: break;
        case 31: 
          { return new Symbol(sym.faux);
          }
        case 82: break;
        case 32: 
          { return new Symbol(sym.lire);
          }
        case 83: break;
        case 33: 
          { return new Symbol(sym.vrai);
          }
        case 84: break;
        case 34: 
          { return new Symbol(sym.alors);
          }
        case 85: break;
        case 35: 
          { return new Symbol(sym.faire);
          }
        case 86: break;
        case 36: 
          { return new Symbol(sym.finsi);
          }
        case 87: break;
        case 37: 
          { return new Symbol(sym.sinon);
          }
        case 88: break;
        case 38: 
          { return new Symbol(sym.ecrire);
          }
        case 89: break;
        case 39: 
          { return new Symbol(sym.finprg);
          }
        case 90: break;
        case 40: 
          { return new Symbol(sym.entier);
          }
        case 91: break;
        case 41: 
          { return new Symbol(sym.tantque);
          }
        case 92: break;
        case 42: 
          { return new Symbol(sym.finpour);
          }
        case 93: break;
        case 43: 
          { return new Symbol(sym.finfonc);
          }
        case 94: break;
        case 44: 
          { return new Symbol(sym.retourne);
          }
        case 95: break;
        case 45: 
          { return new Symbol(sym.allantde);
          }
        case 96: break;
        case 46: 
          { return new Symbol(sym.debutprg);
          }
        case 97: break;
        case 47: 
          { return new Symbol(sym.bool);
          }
        case 98: break;
        case 48: 
          { return new Symbol(sym.debutfonc);
          }
        case 99: break;
        case 49: 
          { return new Symbol(sym.constante);
          }
        case 100: break;
        case 50: 
          { return new Symbol(sym.programme);
          }
        case 101: break;
        case 51: 
          { return new Symbol(sym.fintantque);
          }
        case 102: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
