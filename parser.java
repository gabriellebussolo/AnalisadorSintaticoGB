
//----------------------------------------------------
// The following code was generated by CUP v0.11b beta 20140226
//----------------------------------------------------

import java_cup.runtime.*;
import java.util.*;
import java.io.*;
import TACNode.java;
import java_cup.runtime.XMLElement;

/** CUP v0.11b beta 20140226 generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\054\000\002\002\010\000\002\002\004\000\002\006" +
    "\004\000\002\006\003\000\002\003\005\000\002\007\006" +
    "\000\002\007\004\000\002\010\003\000\002\010\003\000" +
    "\002\011\003\000\002\011\003\000\002\011\003\000\002" +
    "\005\004\000\002\005\003\000\002\004\012\000\002\012" +
    "\004\000\002\012\003\000\002\014\007\000\002\014\005" +
    "\000\002\013\003\000\002\013\005\000\002\013\010\000" +
    "\002\013\003\000\002\015\006\000\002\023\003\000\002" +
    "\023\003\000\002\023\003\000\002\024\003\000\002\024" +
    "\003\000\002\025\003\000\002\025\003\000\002\025\003" +
    "\000\002\022\003\000\002\022\003\000\002\022\003\000" +
    "\002\020\003\000\002\020\005\000\002\021\003\000\002" +
    "\021\005\000\002\021\005\000\002\016\003\000\002\016" +
    "\005\000\002\017\003\000\002\017\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\124\000\004\031\004\001\002\000\004\004\007\001" +
    "\002\000\004\002\006\001\002\000\004\002\000\001\002" +
    "\000\004\013\010\001\002\000\006\005\012\006\015\001" +
    "\002\000\010\005\023\006\026\007\024\001\002\000\004" +
    "\013\ufffa\001\002\000\010\005\012\006\015\007\ufffe\001" +
    "\002\000\004\013\016\001\002\000\004\013\ufff9\001\002" +
    "\000\004\033\017\001\002\000\010\005\ufffd\006\ufffd\007" +
    "\ufffd\001\002\000\010\005\uffff\006\uffff\007\uffff\001\002" +
    "\000\004\032\126\001\002\000\012\005\023\006\026\007" +
    "\024\032\ufff4\001\002\000\004\013\ufff8\001\002\000\004" +
    "\013\ufff6\001\002\000\004\013\027\001\002\000\004\013" +
    "\ufff7\001\002\000\004\027\030\001\002\000\006\005\012" +
    "\006\015\001\002\000\004\030\036\001\002\000\004\013" +
    "\033\001\002\000\006\030\ufffb\034\034\001\002\000\006" +
    "\005\012\006\015\001\002\000\004\030\ufffc\001\002\000" +
    "\004\031\037\001\002\000\012\010\047\013\040\015\041" +
    "\035\046\001\002\000\004\026\122\001\002\000\012\012" +
    "\051\013\060\014\056\027\052\001\002\000\020\010\uffee" +
    "\011\uffee\013\uffee\015\uffee\032\uffee\033\uffee\035\uffee\001" +
    "\002\000\020\010\uffeb\011\116\013\uffeb\015\uffeb\032\uffeb" +
    "\033\uffeb\035\uffeb\001\002\000\014\010\047\013\040\015" +
    "\041\032\115\035\046\001\002\000\020\010\ufff1\011\ufff1" +
    "\013\ufff1\015\ufff1\032\ufff1\033\ufff1\035\ufff1\001\002\000" +
    "\004\027\110\001\002\000\004\027\050\001\002\000\012" +
    "\012\051\013\060\014\056\027\052\001\002\000\026\016" +
    "\uffd7\017\uffd7\020\uffd7\021\uffd7\022\uffd7\023\uffd7\024\uffd7" +
    "\025\uffd7\030\uffd7\033\uffd7\001\002\000\012\012\051\013" +
    "\060\014\056\027\052\001\002\000\026\016\uffdf\017\uffdf" +
    "\020\uffdf\021\uffdf\022\uffdf\023\uffdf\024\uffdf\025\uffdf\030" +
    "\uffdf\033\uffdf\001\002\000\026\016\uffde\017\uffde\020\uffde" +
    "\021\uffde\022\uffde\023\uffde\024\uffde\025\uffde\030\uffde\033" +
    "\uffde\001\002\000\026\016\uffdc\017\uffdc\020\uffdc\021\uffdc" +
    "\022\uffdc\023\uffdc\024\uffdc\025\uffdc\030\uffdc\033\uffdc\001" +
    "\002\000\026\016\uffd9\017\uffd9\020\uffd9\021\uffd9\022\uffd9" +
    "\023\uffd9\024\uffd9\025\uffd9\030\uffd9\033\uffd9\001\002\000" +
    "\024\016\071\017\062\020\074\021\073\022\067\023\075" +
    "\024\065\025\066\030\064\001\002\000\026\016\uffe1\017" +
    "\uffe1\020\uffe1\021\uffe1\022\uffe1\023\uffe1\024\uffe1\025\uffe1" +
    "\030\uffe1\033\uffe1\001\002\000\026\016\uffe0\017\uffe0\020" +
    "\uffe0\021\uffe0\022\uffe0\023\uffe0\024\uffe0\025\uffe0\030\uffe0" +
    "\033\uffe0\001\002\000\012\012\uffe8\013\uffe8\014\uffe8\027" +
    "\uffe8\001\002\000\012\012\051\013\060\014\056\027\052" +
    "\001\002\000\012\010\047\013\040\015\041\035\046\001" +
    "\002\000\012\012\uffe3\013\uffe3\014\uffe3\027\uffe3\001\002" +
    "\000\012\012\uffe2\013\uffe2\014\uffe2\027\uffe2\001\002\000" +
    "\012\012\uffe5\013\uffe5\014\uffe5\027\uffe5\001\002\000\012" +
    "\012\051\013\060\014\056\027\052\001\002\000\012\012" +
    "\uffe9\013\uffe9\014\uffe9\027\uffe9\001\002\000\012\012\051" +
    "\013\060\014\056\027\052\001\002\000\012\012\uffe6\013" +
    "\uffe6\014\uffe6\027\uffe6\001\002\000\012\012\uffe7\013\uffe7" +
    "\014\uffe7\027\uffe7\001\002\000\012\012\uffe4\013\uffe4\014" +
    "\uffe4\027\uffe4\001\002\000\026\016\071\017\062\020\074" +
    "\021\073\022\067\023\075\024\065\025\066\030\uffdd\033" +
    "\uffdd\001\002\000\026\016\071\017\062\020\074\021\073" +
    "\022\067\023\075\024\065\025\066\030\uffda\033\uffda\001" +
    "\002\000\020\010\047\011\ufff0\013\040\015\041\032\ufff0" +
    "\033\ufff0\035\046\001\002\000\020\010\ufff2\011\ufff2\013" +
    "\ufff2\015\ufff2\032\ufff2\033\ufff2\035\ufff2\001\002\000\026" +
    "\016\071\017\062\020\074\021\073\022\067\023\075\024" +
    "\065\025\066\030\uffdb\033\uffdb\001\002\000\024\016\uffdf" +
    "\017\uffdf\020\uffdf\021\uffdf\022\uffdf\023\uffdf\024\uffdf\025" +
    "\uffdf\030\107\001\002\000\022\016\071\017\062\020\074" +
    "\021\073\022\067\023\075\024\065\025\066\001\002\000" +
    "\024\016\uffe0\017\uffe0\020\uffe0\021\uffe0\022\uffe0\023\uffe0" +
    "\024\uffe0\025\uffe0\030\106\001\002\000\026\016\uffd8\017" +
    "\uffd8\020\uffd8\021\uffd8\022\uffd8\023\uffd8\024\uffd8\025\uffd8" +
    "\030\uffd8\033\uffd8\001\002\000\026\016\uffd6\017\uffd6\020" +
    "\uffd6\021\uffd6\022\uffd6\023\uffd6\024\uffd6\025\uffd6\030\uffd6" +
    "\033\uffd6\001\002\000\012\012\051\013\060\014\056\027" +
    "\052\001\002\000\024\016\uffdf\017\uffdf\020\uffdf\021\uffdf" +
    "\022\uffdf\023\uffdf\024\uffdf\025\uffdf\030\112\001\002\000" +
    "\012\010\047\013\040\015\041\035\046\001\002\000\014" +
    "\010\047\013\040\015\041\033\114\035\046\001\002\000" +
    "\020\010\uffec\011\uffec\013\uffec\015\uffec\032\uffec\033\uffec" +
    "\035\uffec\001\002\000\012\005\ufff3\006\ufff3\007\ufff3\032" +
    "\ufff3\001\002\000\012\010\047\013\040\015\041\035\046" +
    "\001\002\000\020\010\uffef\011\uffef\013\uffef\015\uffef\032" +
    "\uffef\033\uffef\035\uffef\001\002\000\024\016\071\017\062" +
    "\020\074\021\073\022\067\023\075\024\065\025\066\033" +
    "\121\001\002\000\020\010\uffed\011\uffed\013\uffed\015\uffed" +
    "\032\uffed\033\uffed\035\uffed\001\002\000\012\012\051\013" +
    "\060\014\056\027\052\001\002\000\024\016\071\017\062" +
    "\020\074\021\073\022\067\023\075\024\065\025\066\033" +
    "\124\001\002\000\020\010\uffea\011\uffea\013\uffea\015\uffea" +
    "\032\uffea\033\uffea\035\uffea\001\002\000\004\032\ufff5\001" +
    "\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\124\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\010" +
    "\003\012\006\010\010\013\001\001\000\010\004\021\005" +
    "\020\011\024\001\001\000\002\001\001\000\010\003\012" +
    "\006\017\010\013\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\010\004\021\005\124\011\024\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\007\030\010" +
    "\031\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\007\034\010\031\001\001\000\002\001" +
    "\001\000\002\001\001\000\012\012\043\013\044\014\042" +
    "\015\041\001\001\000\002\001\001\000\014\016\053\017" +
    "\054\020\060\021\052\022\117\001\001\000\002\001\001" +
    "\000\002\001\001\000\010\013\100\014\042\015\041\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\014\016\053\017\054\020\060\021\052\022\056\001" +
    "\001\000\002\001\001\000\014\016\053\017\054\020\104" +
    "\021\102\022\103\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\010\023\067" +
    "\024\071\025\062\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\014\016\053\017\054\020\060" +
    "\021\052\022\101\001\001\000\012\012\077\013\044\014" +
    "\042\015\041\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\014\016\053\017\054\020\060\021" +
    "\052\022\076\001\001\000\002\001\001\000\014\016\053" +
    "\017\054\020\060\021\052\022\075\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\010\023\067" +
    "\024\071\025\062\001\001\000\010\023\067\024\071\025" +
    "\062\001\001\000\010\013\100\014\042\015\041\001\001" +
    "\000\002\001\001\000\010\023\067\024\071\025\062\001" +
    "\001\000\002\001\001\000\010\023\067\024\071\025\062" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\014\016\053\017\054\020\060\021\110\022\103" +
    "\001\001\000\002\001\001\000\012\012\112\013\044\014" +
    "\042\015\041\001\001\000\010\013\100\014\042\015\041" +
    "\001\001\000\002\001\001\000\002\001\001\000\012\012" +
    "\116\013\044\014\042\015\041\001\001\000\010\013\100" +
    "\014\042\015\041\001\001\000\010\023\067\024\071\025" +
    "\062\001\001\000\002\001\001\000\014\016\053\017\054" +
    "\020\060\021\052\022\122\001\001\000\010\023\067\024" +
    "\071\025\062\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {
 Tree = new DisegnaAlbero();   }public static DisegnaAlbero Tree;

  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 Symbol s=_scanner.next_token(); Tree.push(s.toString(), 0); return s;   }


    List<TACNode> TACList = new ArrayList<>(); // Lista para armazenar TACs


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // declaracaoClasse ::= CHAVEESQ CLASSE ID atributos metodos CHAVEDIR 
            { parser.Tree.reduce(6,"declaracaoClasse",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("declaracaoClasse",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= declaracaoClasse EOF 
            { 
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // atributos ::= declaracaoAtributo atributos 
            { parser.Tree.reduce(2,"atributos",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("atributos",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // atributos ::= declaracaoAtributo 
            { parser.Tree.reduce(1,"atributos",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("atributos",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // declaracaoAtributo ::= tipoAtributo ID PONTOEVIRGULA 
            { parser.Tree.reduce(3,"declaracaoAtributo",1);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("declaracaoAtributo",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // argumentos ::= tipoAtributo ID VIRGULA argumentos 
            { parser.Tree.reduce(4,"argumentos",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("argumentos",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // argumentos ::= tipoAtributo ID 
            { parser.Tree.reduce(2,"argumentos",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("argumentos",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // tipoAtributo ::= BOOL 
            { parser.Tree.reduce(1,"tipoAtributo",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipoAtributo",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // tipoAtributo ::= INT 
            { parser.Tree.reduce(1,"tipoAtributo",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipoAtributo",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // tipoMetodo ::= BOOL 
            { parser.Tree.reduce(1,"tipoMetodo",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipoMetodo",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // tipoMetodo ::= INT 
            { parser.Tree.reduce(1,"tipoMetodo",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipoMetodo",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // tipoMetodo ::= VOID 
            { parser.Tree.reduce(1,"tipoMetodo",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipoMetodo",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // metodos ::= declaracaoMetodo metodos 
            { parser.Tree.reduce(2,"metodos",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("metodos",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // metodos ::= declaracaoMetodo 
            { parser.Tree.reduce(1,"metodos",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("metodos",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // declaracaoMetodo ::= tipoMetodo ID PARESQ argumentos PARDIR CHAVEESQ comandos CHAVEDIR 
            { parser.Tree.reduce(8,"declaracaoMetodo",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("declaracaoMetodo",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // comandos ::= comandos comando 
            { parser.Tree.reduce(2,"comandos",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("comandos",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // comandos ::= comando 
            { parser.Tree.reduce(1,"comandos",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("comandos",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // ifSemElse ::= IF PARESQ termo PARDIR comandos 
            { parser.Tree.reduce(5,"ifSemElse",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ifSemElse",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // ifSemElse ::= ifSemElse ELSE comandos 
            { parser.Tree.reduce(3,"ifSemElse",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ifSemElse",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // comando ::= comandoAritmetico 
            { parser.Tree.reduce(1,"comando",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("comando",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // comando ::= RETORNO termo PONTOEVIRGULA 
            { parser.Tree.reduce(3,"comando",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("comando",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // comando ::= WHILE PARESQ expressaoBooleana PARDIR comandos PONTOEVIRGULA 
            { parser.Tree.reduce(6,"comando",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("comando",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // comando ::= ifSemElse 
            { parser.Tree.reduce(1,"comando",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("comando",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // comandoAritmetico ::= ID IGUAL termo PONTOEVIRGULA 
            { parser.Tree.reduce(4,"comandoAritmetico",0);
              Object RESULT =null;
		
    RESULT = new TACNode("=", $3.result, null, $1.result);
    TACList.add(RESULT);

              CUP$parser$result = parser.getSymbolFactory().newSymbol("comandoAritmetico",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // operadorLogico ::= NOT 
            { parser.Tree.reduce(1,"operadorLogico",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("operadorLogico",17, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // operadorLogico ::= AND 
            { parser.Tree.reduce(1,"operadorLogico",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("operadorLogico",17, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // operadorLogico ::= OR 
            { parser.Tree.reduce(1,"operadorLogico",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("operadorLogico",17, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // operadorAritmetico ::= SOMA 
            { parser.Tree.reduce(1,"operadorAritmetico",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("operadorAritmetico",18, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // operadorAritmetico ::= MULTIPLICACAO 
            { parser.Tree.reduce(1,"operadorAritmetico",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("operadorAritmetico",18, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // operadorRelacional ::= OPIGUAL 
            { parser.Tree.reduce(1,"operadorRelacional",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("operadorRelacional",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // operadorRelacional ::= OPMAIOR 
            { parser.Tree.reduce(1,"operadorRelacional",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("operadorRelacional",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // operadorRelacional ::= OPMENOR 
            { parser.Tree.reduce(1,"operadorRelacional",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("operadorRelacional",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // termo ::= ID 
            { parser.Tree.reduce(1,"termo",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("termo",16, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // termo ::= expressaoAritmetica 
            { parser.Tree.reduce(1,"termo",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("termo",16, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // termo ::= expressaoBooleana 
            { parser.Tree.reduce(1,"termo",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("termo",16, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // expressaoAritmetica ::= termoAritmetico 
            { parser.Tree.reduce(1,"expressaoAritmetica",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expressaoAritmetica",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // expressaoAritmetica ::= termo operadorAritmetico termo 
            { parser.Tree.reduce(3,"expressaoAritmetica",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expressaoAritmetica",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // expressaoBooleana ::= termoBooleano 
            { parser.Tree.reduce(1,"expressaoBooleana",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expressaoBooleana",15, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // expressaoBooleana ::= termo operadorRelacional termo 
            { parser.Tree.reduce(3,"expressaoBooleana",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expressaoBooleana",15, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // expressaoBooleana ::= termo operadorLogico termo 
            { parser.Tree.reduce(3,"expressaoBooleana",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expressaoBooleana",15, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // termoAritmetico ::= NUMERO 
            { parser.Tree.reduce(1,"termoAritmetico",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("termoAritmetico",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // termoAritmetico ::= PARESQ expressaoAritmetica PARDIR 
            { parser.Tree.reduce(3,"termoAritmetico",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("termoAritmetico",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // termoBooleano ::= CONSTANTE 
            { parser.Tree.reduce(1,"termoBooleano",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("termoBooleano",13, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // termoBooleano ::= PARESQ expressaoBooleana PARDIR 
            { parser.Tree.reduce(3,"termoBooleano",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("termoBooleano",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
