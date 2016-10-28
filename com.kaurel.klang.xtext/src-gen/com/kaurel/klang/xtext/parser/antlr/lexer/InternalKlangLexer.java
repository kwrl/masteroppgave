package com.kaurel.klang.xtext.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKlangLexer extends Lexer {
    public static final int Or=32;
    public static final int RULE_BEGIN=70;
    public static final int Clicked=7;
    public static final int Var=27;
    public static final int True=21;
    public static final int False=15;
    public static final int LessThanSign=41;
    public static final int Forever=8;
    public static final int LeftParenthesis=33;
    public static final int SendMessage=4;
    public static final int GreaterThanSign=43;
    public static final int RULE_ID=72;
    public static final int Collides=5;
    public static final int Received=6;
    public static final int RightParenthesis=34;
    public static final int Scene=16;
    public static final int Double=10;
    public static final int GreaterThanSignEqualsSign=30;
    public static final int EqualsSignEqualsSign=29;
    public static final int Not=26;
    public static final int Game=20;
    public static final int And=24;
    public static final int PlusSign=36;
    public static final int RULE_INT=73;
    public static final int RULE_ML_COMMENT=75;
    public static final int If=31;
    public static final int A=44;
    public static final int Pressed=9;
    public static final int B=45;
    public static final int RULE_END=71;
    public static final int Starts=12;
    public static final int C=46;
    public static final int D=47;
    public static final int E=48;
    public static final int F=49;
    public static final int G=50;
    public static final int H=51;
    public static final int ENTER=13;
    public static final int I=52;
    public static final int J=53;
    public static final int RULE_STRING=74;
    public static final int K=54;
    public static final int L=55;
    public static final int M=56;
    public static final int Int=25;
    public static final int N=57;
    public static final int With=23;
    public static final int O=58;
    public static final int RULE_SL_COMMENT=76;
    public static final int SPACE=14;
    public static final int P=59;
    public static final int Comma=37;
    public static final int EqualsSign=42;
    public static final int Q=60;
    public static final int HyphenMinus=38;
    public static final int R=61;
    public static final int S=62;
    public static final int T=63;
    public static final int U=64;
    public static final int V=65;
    public static final int W=66;
    public static final int X=67;
    public static final int Y=68;
    public static final int Z=69;
    public static final int LessThanSignEqualsSign=28;
    public static final int Solidus=40;
    public static final int EOF=-1;
    public static final int Asterisk=35;
    public static final int FullStop=39;
    public static final int Sprite=11;
    public static final int RULE_WS=77;
    public static final int While=18;
    public static final int RULE_ANY_OTHER=78;
    public static final int Sleep=17;
    public static final int When=22;
    public static final int Else=19;

    // delegates
    // delegators

    public InternalKlangLexer() {;} 
    public InternalKlangLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalKlangLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalKlangLexer.g"; }

    // $ANTLR start "SendMessage"
    public final void mSendMessage() throws RecognitionException {
        try {
            int _type = SendMessage;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:14:13: ( 'sendMessage' )
            // InternalKlangLexer.g:14:15: 'sendMessage'
            {
            match("sendMessage"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SendMessage"

    // $ANTLR start "Collides"
    public final void mCollides() throws RecognitionException {
        try {
            int _type = Collides;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:16:10: ( 'collides' )
            // InternalKlangLexer.g:16:12: 'collides'
            {
            match("collides"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Collides"

    // $ANTLR start "Received"
    public final void mReceived() throws RecognitionException {
        try {
            int _type = Received;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:18:10: ( 'received' )
            // InternalKlangLexer.g:18:12: 'received'
            {
            match("received"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Received"

    // $ANTLR start "Clicked"
    public final void mClicked() throws RecognitionException {
        try {
            int _type = Clicked;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:20:9: ( 'clicked' )
            // InternalKlangLexer.g:20:11: 'clicked'
            {
            match("clicked"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Clicked"

    // $ANTLR start "Forever"
    public final void mForever() throws RecognitionException {
        try {
            int _type = Forever;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:22:9: ( 'forever' )
            // InternalKlangLexer.g:22:11: 'forever'
            {
            match("forever"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Forever"

    // $ANTLR start "Pressed"
    public final void mPressed() throws RecognitionException {
        try {
            int _type = Pressed;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:24:9: ( 'pressed' )
            // InternalKlangLexer.g:24:11: 'pressed'
            {
            match("pressed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Pressed"

    // $ANTLR start "Double"
    public final void mDouble() throws RecognitionException {
        try {
            int _type = Double;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:26:8: ( 'double' )
            // InternalKlangLexer.g:26:10: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Double"

    // $ANTLR start "Sprite"
    public final void mSprite() throws RecognitionException {
        try {
            int _type = Sprite;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:28:8: ( 'sprite' )
            // InternalKlangLexer.g:28:10: 'sprite'
            {
            match("sprite"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Sprite"

    // $ANTLR start "Starts"
    public final void mStarts() throws RecognitionException {
        try {
            int _type = Starts;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:30:8: ( 'starts' )
            // InternalKlangLexer.g:30:10: 'starts'
            {
            match("starts"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Starts"

    // $ANTLR start "ENTER"
    public final void mENTER() throws RecognitionException {
        try {
            int _type = ENTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:32:7: ( 'ENTER' )
            // InternalKlangLexer.g:32:9: 'ENTER'
            {
            match("ENTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENTER"

    // $ANTLR start "SPACE"
    public final void mSPACE() throws RecognitionException {
        try {
            int _type = SPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:34:7: ( 'SPACE' )
            // InternalKlangLexer.g:34:9: 'SPACE'
            {
            match("SPACE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SPACE"

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:36:7: ( 'false' )
            // InternalKlangLexer.g:36:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "False"

    // $ANTLR start "Scene"
    public final void mScene() throws RecognitionException {
        try {
            int _type = Scene;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:38:7: ( 'scene' )
            // InternalKlangLexer.g:38:9: 'scene'
            {
            match("scene"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Scene"

    // $ANTLR start "Sleep"
    public final void mSleep() throws RecognitionException {
        try {
            int _type = Sleep;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:40:7: ( 'sleep' )
            // InternalKlangLexer.g:40:9: 'sleep'
            {
            match("sleep"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Sleep"

    // $ANTLR start "While"
    public final void mWhile() throws RecognitionException {
        try {
            int _type = While;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:42:7: ( 'while' )
            // InternalKlangLexer.g:42:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "While"

    // $ANTLR start "Else"
    public final void mElse() throws RecognitionException {
        try {
            int _type = Else;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:44:6: ( 'else' )
            // InternalKlangLexer.g:44:8: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Else"

    // $ANTLR start "Game"
    public final void mGame() throws RecognitionException {
        try {
            int _type = Game;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:46:6: ( 'game' )
            // InternalKlangLexer.g:46:8: 'game'
            {
            match("game"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Game"

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:48:6: ( 'true' )
            // InternalKlangLexer.g:48:8: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "True"

    // $ANTLR start "When"
    public final void mWhen() throws RecognitionException {
        try {
            int _type = When;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:50:6: ( 'when' )
            // InternalKlangLexer.g:50:8: 'when'
            {
            match("when"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "When"

    // $ANTLR start "With"
    public final void mWith() throws RecognitionException {
        try {
            int _type = With;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:52:6: ( 'with' )
            // InternalKlangLexer.g:52:8: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "With"

    // $ANTLR start "And"
    public final void mAnd() throws RecognitionException {
        try {
            int _type = And;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:54:5: ( 'and' )
            // InternalKlangLexer.g:54:7: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "And"

    // $ANTLR start "Int"
    public final void mInt() throws RecognitionException {
        try {
            int _type = Int;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:56:5: ( 'int' )
            // InternalKlangLexer.g:56:7: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int"

    // $ANTLR start "Not"
    public final void mNot() throws RecognitionException {
        try {
            int _type = Not;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:58:5: ( 'not' )
            // InternalKlangLexer.g:58:7: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Not"

    // $ANTLR start "Var"
    public final void mVar() throws RecognitionException {
        try {
            int _type = Var;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:60:5: ( 'var' )
            // InternalKlangLexer.g:60:7: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Var"

    // $ANTLR start "LessThanSignEqualsSign"
    public final void mLessThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = LessThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:62:24: ( '<=' )
            // InternalKlangLexer.g:62:26: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSignEqualsSign"

    // $ANTLR start "EqualsSignEqualsSign"
    public final void mEqualsSignEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:64:22: ( '==' )
            // InternalKlangLexer.g:64:24: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSignEqualsSign"

    // $ANTLR start "GreaterThanSignEqualsSign"
    public final void mGreaterThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = GreaterThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:66:27: ( '>=' )
            // InternalKlangLexer.g:66:29: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSignEqualsSign"

    // $ANTLR start "If"
    public final void mIf() throws RecognitionException {
        try {
            int _type = If;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:68:4: ( 'if' )
            // InternalKlangLexer.g:68:6: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "If"

    // $ANTLR start "Or"
    public final void mOr() throws RecognitionException {
        try {
            int _type = Or;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:70:4: ( 'or' )
            // InternalKlangLexer.g:70:6: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Or"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:72:17: ( '(' )
            // InternalKlangLexer.g:72:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:74:18: ( ')' )
            // InternalKlangLexer.g:74:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Asterisk"
    public final void mAsterisk() throws RecognitionException {
        try {
            int _type = Asterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:76:10: ( '*' )
            // InternalKlangLexer.g:76:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Asterisk"

    // $ANTLR start "PlusSign"
    public final void mPlusSign() throws RecognitionException {
        try {
            int _type = PlusSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:78:10: ( '+' )
            // InternalKlangLexer.g:78:12: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSign"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:80:7: ( ',' )
            // InternalKlangLexer.g:80:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "HyphenMinus"
    public final void mHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:82:13: ( '-' )
            // InternalKlangLexer.g:82:15: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinus"

    // $ANTLR start "FullStop"
    public final void mFullStop() throws RecognitionException {
        try {
            int _type = FullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:84:10: ( '.' )
            // InternalKlangLexer.g:84:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStop"

    // $ANTLR start "Solidus"
    public final void mSolidus() throws RecognitionException {
        try {
            int _type = Solidus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:86:9: ( '/' )
            // InternalKlangLexer.g:86:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Solidus"

    // $ANTLR start "LessThanSign"
    public final void mLessThanSign() throws RecognitionException {
        try {
            int _type = LessThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:88:14: ( '<' )
            // InternalKlangLexer.g:88:16: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSign"

    // $ANTLR start "EqualsSign"
    public final void mEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:90:12: ( '=' )
            // InternalKlangLexer.g:90:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSign"

    // $ANTLR start "GreaterThanSign"
    public final void mGreaterThanSign() throws RecognitionException {
        try {
            int _type = GreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:92:17: ( '>' )
            // InternalKlangLexer.g:92:19: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSign"

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            int _type = A;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:94:3: ( 'A' )
            // InternalKlangLexer.g:94:5: 'A'
            {
            match('A'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "A"

    // $ANTLR start "B"
    public final void mB() throws RecognitionException {
        try {
            int _type = B;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:96:3: ( 'B' )
            // InternalKlangLexer.g:96:5: 'B'
            {
            match('B'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "B"

    // $ANTLR start "C"
    public final void mC() throws RecognitionException {
        try {
            int _type = C;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:98:3: ( 'C' )
            // InternalKlangLexer.g:98:5: 'C'
            {
            match('C'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "C"

    // $ANTLR start "D"
    public final void mD() throws RecognitionException {
        try {
            int _type = D;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:100:3: ( 'D' )
            // InternalKlangLexer.g:100:5: 'D'
            {
            match('D'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "D"

    // $ANTLR start "E"
    public final void mE() throws RecognitionException {
        try {
            int _type = E;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:102:3: ( 'E' )
            // InternalKlangLexer.g:102:5: 'E'
            {
            match('E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "E"

    // $ANTLR start "F"
    public final void mF() throws RecognitionException {
        try {
            int _type = F;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:104:3: ( 'F' )
            // InternalKlangLexer.g:104:5: 'F'
            {
            match('F'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "F"

    // $ANTLR start "G"
    public final void mG() throws RecognitionException {
        try {
            int _type = G;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:106:3: ( 'G' )
            // InternalKlangLexer.g:106:5: 'G'
            {
            match('G'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "G"

    // $ANTLR start "H"
    public final void mH() throws RecognitionException {
        try {
            int _type = H;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:108:3: ( 'H' )
            // InternalKlangLexer.g:108:5: 'H'
            {
            match('H'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "H"

    // $ANTLR start "I"
    public final void mI() throws RecognitionException {
        try {
            int _type = I;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:110:3: ( 'I' )
            // InternalKlangLexer.g:110:5: 'I'
            {
            match('I'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "I"

    // $ANTLR start "J"
    public final void mJ() throws RecognitionException {
        try {
            int _type = J;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:112:3: ( 'J' )
            // InternalKlangLexer.g:112:5: 'J'
            {
            match('J'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "J"

    // $ANTLR start "K"
    public final void mK() throws RecognitionException {
        try {
            int _type = K;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:114:3: ( 'K' )
            // InternalKlangLexer.g:114:5: 'K'
            {
            match('K'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K"

    // $ANTLR start "L"
    public final void mL() throws RecognitionException {
        try {
            int _type = L;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:116:3: ( 'L' )
            // InternalKlangLexer.g:116:5: 'L'
            {
            match('L'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L"

    // $ANTLR start "M"
    public final void mM() throws RecognitionException {
        try {
            int _type = M;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:118:3: ( 'M' )
            // InternalKlangLexer.g:118:5: 'M'
            {
            match('M'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "M"

    // $ANTLR start "N"
    public final void mN() throws RecognitionException {
        try {
            int _type = N;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:120:3: ( 'N' )
            // InternalKlangLexer.g:120:5: 'N'
            {
            match('N'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "N"

    // $ANTLR start "O"
    public final void mO() throws RecognitionException {
        try {
            int _type = O;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:122:3: ( 'O' )
            // InternalKlangLexer.g:122:5: 'O'
            {
            match('O'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "O"

    // $ANTLR start "P"
    public final void mP() throws RecognitionException {
        try {
            int _type = P;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:124:3: ( 'P' )
            // InternalKlangLexer.g:124:5: 'P'
            {
            match('P'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "P"

    // $ANTLR start "Q"
    public final void mQ() throws RecognitionException {
        try {
            int _type = Q;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:126:3: ( 'Q' )
            // InternalKlangLexer.g:126:5: 'Q'
            {
            match('Q'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Q"

    // $ANTLR start "R"
    public final void mR() throws RecognitionException {
        try {
            int _type = R;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:128:3: ( 'R' )
            // InternalKlangLexer.g:128:5: 'R'
            {
            match('R'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "R"

    // $ANTLR start "S"
    public final void mS() throws RecognitionException {
        try {
            int _type = S;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:130:3: ( 'S' )
            // InternalKlangLexer.g:130:5: 'S'
            {
            match('S'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "S"

    // $ANTLR start "T"
    public final void mT() throws RecognitionException {
        try {
            int _type = T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:132:3: ( 'T' )
            // InternalKlangLexer.g:132:5: 'T'
            {
            match('T'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T"

    // $ANTLR start "U"
    public final void mU() throws RecognitionException {
        try {
            int _type = U;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:134:3: ( 'U' )
            // InternalKlangLexer.g:134:5: 'U'
            {
            match('U'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "U"

    // $ANTLR start "V"
    public final void mV() throws RecognitionException {
        try {
            int _type = V;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:136:3: ( 'V' )
            // InternalKlangLexer.g:136:5: 'V'
            {
            match('V'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "V"

    // $ANTLR start "W"
    public final void mW() throws RecognitionException {
        try {
            int _type = W;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:138:3: ( 'W' )
            // InternalKlangLexer.g:138:5: 'W'
            {
            match('W'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "W"

    // $ANTLR start "X"
    public final void mX() throws RecognitionException {
        try {
            int _type = X;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:140:3: ( 'X' )
            // InternalKlangLexer.g:140:5: 'X'
            {
            match('X'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "X"

    // $ANTLR start "Y"
    public final void mY() throws RecognitionException {
        try {
            int _type = Y;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:142:3: ( 'Y' )
            // InternalKlangLexer.g:142:5: 'Y'
            {
            match('Y'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Y"

    // $ANTLR start "Z"
    public final void mZ() throws RecognitionException {
        try {
            int _type = Z;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:144:3: ( 'Z' )
            // InternalKlangLexer.g:144:5: 'Z'
            {
            match('Z'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Z"

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalKlangLexer.g:148:21: ()
            // InternalKlangLexer.g:148:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BEGIN"

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            // InternalKlangLexer.g:150:19: ()
            // InternalKlangLexer.g:150:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:152:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalKlangLexer.g:152:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalKlangLexer.g:152:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalKlangLexer.g:152:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalKlangLexer.g:152:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalKlangLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:154:10: ( ( '0' .. '9' )+ )
            // InternalKlangLexer.g:154:12: ( '0' .. '9' )+
            {
            // InternalKlangLexer.g:154:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalKlangLexer.g:154:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:156:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalKlangLexer.g:156:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalKlangLexer.g:156:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalKlangLexer.g:156:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalKlangLexer.g:156:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalKlangLexer.g:156:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKlangLexer.g:156:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalKlangLexer.g:156:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalKlangLexer.g:156:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalKlangLexer.g:156:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKlangLexer.g:156:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:158:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalKlangLexer.g:158:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalKlangLexer.g:158:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalKlangLexer.g:158:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:160:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalKlangLexer.g:160:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalKlangLexer.g:160:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKlangLexer.g:160:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalKlangLexer.g:160:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalKlangLexer.g:160:41: ( '\\r' )? '\\n'
                    {
                    // InternalKlangLexer.g:160:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalKlangLexer.g:160:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:162:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalKlangLexer.g:162:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalKlangLexer.g:162:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalKlangLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:164:16: ( . )
            // InternalKlangLexer.g:164:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalKlangLexer.g:1:8: ( SendMessage | Collides | Received | Clicked | Forever | Pressed | Double | Sprite | Starts | ENTER | SPACE | False | Scene | Sleep | While | Else | Game | True | When | With | And | Int | Not | Var | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | If | Or | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | LessThanSign | EqualsSign | GreaterThanSign | A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q | R | S | T | U | V | W | X | Y | Z | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=73;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalKlangLexer.g:1:10: SendMessage
                {
                mSendMessage(); 

                }
                break;
            case 2 :
                // InternalKlangLexer.g:1:22: Collides
                {
                mCollides(); 

                }
                break;
            case 3 :
                // InternalKlangLexer.g:1:31: Received
                {
                mReceived(); 

                }
                break;
            case 4 :
                // InternalKlangLexer.g:1:40: Clicked
                {
                mClicked(); 

                }
                break;
            case 5 :
                // InternalKlangLexer.g:1:48: Forever
                {
                mForever(); 

                }
                break;
            case 6 :
                // InternalKlangLexer.g:1:56: Pressed
                {
                mPressed(); 

                }
                break;
            case 7 :
                // InternalKlangLexer.g:1:64: Double
                {
                mDouble(); 

                }
                break;
            case 8 :
                // InternalKlangLexer.g:1:71: Sprite
                {
                mSprite(); 

                }
                break;
            case 9 :
                // InternalKlangLexer.g:1:78: Starts
                {
                mStarts(); 

                }
                break;
            case 10 :
                // InternalKlangLexer.g:1:85: ENTER
                {
                mENTER(); 

                }
                break;
            case 11 :
                // InternalKlangLexer.g:1:91: SPACE
                {
                mSPACE(); 

                }
                break;
            case 12 :
                // InternalKlangLexer.g:1:97: False
                {
                mFalse(); 

                }
                break;
            case 13 :
                // InternalKlangLexer.g:1:103: Scene
                {
                mScene(); 

                }
                break;
            case 14 :
                // InternalKlangLexer.g:1:109: Sleep
                {
                mSleep(); 

                }
                break;
            case 15 :
                // InternalKlangLexer.g:1:115: While
                {
                mWhile(); 

                }
                break;
            case 16 :
                // InternalKlangLexer.g:1:121: Else
                {
                mElse(); 

                }
                break;
            case 17 :
                // InternalKlangLexer.g:1:126: Game
                {
                mGame(); 

                }
                break;
            case 18 :
                // InternalKlangLexer.g:1:131: True
                {
                mTrue(); 

                }
                break;
            case 19 :
                // InternalKlangLexer.g:1:136: When
                {
                mWhen(); 

                }
                break;
            case 20 :
                // InternalKlangLexer.g:1:141: With
                {
                mWith(); 

                }
                break;
            case 21 :
                // InternalKlangLexer.g:1:146: And
                {
                mAnd(); 

                }
                break;
            case 22 :
                // InternalKlangLexer.g:1:150: Int
                {
                mInt(); 

                }
                break;
            case 23 :
                // InternalKlangLexer.g:1:154: Not
                {
                mNot(); 

                }
                break;
            case 24 :
                // InternalKlangLexer.g:1:158: Var
                {
                mVar(); 

                }
                break;
            case 25 :
                // InternalKlangLexer.g:1:162: LessThanSignEqualsSign
                {
                mLessThanSignEqualsSign(); 

                }
                break;
            case 26 :
                // InternalKlangLexer.g:1:185: EqualsSignEqualsSign
                {
                mEqualsSignEqualsSign(); 

                }
                break;
            case 27 :
                // InternalKlangLexer.g:1:206: GreaterThanSignEqualsSign
                {
                mGreaterThanSignEqualsSign(); 

                }
                break;
            case 28 :
                // InternalKlangLexer.g:1:232: If
                {
                mIf(); 

                }
                break;
            case 29 :
                // InternalKlangLexer.g:1:235: Or
                {
                mOr(); 

                }
                break;
            case 30 :
                // InternalKlangLexer.g:1:238: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 31 :
                // InternalKlangLexer.g:1:254: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 32 :
                // InternalKlangLexer.g:1:271: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 33 :
                // InternalKlangLexer.g:1:280: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 34 :
                // InternalKlangLexer.g:1:289: Comma
                {
                mComma(); 

                }
                break;
            case 35 :
                // InternalKlangLexer.g:1:295: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 36 :
                // InternalKlangLexer.g:1:307: FullStop
                {
                mFullStop(); 

                }
                break;
            case 37 :
                // InternalKlangLexer.g:1:316: Solidus
                {
                mSolidus(); 

                }
                break;
            case 38 :
                // InternalKlangLexer.g:1:324: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 39 :
                // InternalKlangLexer.g:1:337: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 40 :
                // InternalKlangLexer.g:1:348: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 41 :
                // InternalKlangLexer.g:1:364: A
                {
                mA(); 

                }
                break;
            case 42 :
                // InternalKlangLexer.g:1:366: B
                {
                mB(); 

                }
                break;
            case 43 :
                // InternalKlangLexer.g:1:368: C
                {
                mC(); 

                }
                break;
            case 44 :
                // InternalKlangLexer.g:1:370: D
                {
                mD(); 

                }
                break;
            case 45 :
                // InternalKlangLexer.g:1:372: E
                {
                mE(); 

                }
                break;
            case 46 :
                // InternalKlangLexer.g:1:374: F
                {
                mF(); 

                }
                break;
            case 47 :
                // InternalKlangLexer.g:1:376: G
                {
                mG(); 

                }
                break;
            case 48 :
                // InternalKlangLexer.g:1:378: H
                {
                mH(); 

                }
                break;
            case 49 :
                // InternalKlangLexer.g:1:380: I
                {
                mI(); 

                }
                break;
            case 50 :
                // InternalKlangLexer.g:1:382: J
                {
                mJ(); 

                }
                break;
            case 51 :
                // InternalKlangLexer.g:1:384: K
                {
                mK(); 

                }
                break;
            case 52 :
                // InternalKlangLexer.g:1:386: L
                {
                mL(); 

                }
                break;
            case 53 :
                // InternalKlangLexer.g:1:388: M
                {
                mM(); 

                }
                break;
            case 54 :
                // InternalKlangLexer.g:1:390: N
                {
                mN(); 

                }
                break;
            case 55 :
                // InternalKlangLexer.g:1:392: O
                {
                mO(); 

                }
                break;
            case 56 :
                // InternalKlangLexer.g:1:394: P
                {
                mP(); 

                }
                break;
            case 57 :
                // InternalKlangLexer.g:1:396: Q
                {
                mQ(); 

                }
                break;
            case 58 :
                // InternalKlangLexer.g:1:398: R
                {
                mR(); 

                }
                break;
            case 59 :
                // InternalKlangLexer.g:1:400: S
                {
                mS(); 

                }
                break;
            case 60 :
                // InternalKlangLexer.g:1:402: T
                {
                mT(); 

                }
                break;
            case 61 :
                // InternalKlangLexer.g:1:404: U
                {
                mU(); 

                }
                break;
            case 62 :
                // InternalKlangLexer.g:1:406: V
                {
                mV(); 

                }
                break;
            case 63 :
                // InternalKlangLexer.g:1:408: W
                {
                mW(); 

                }
                break;
            case 64 :
                // InternalKlangLexer.g:1:410: X
                {
                mX(); 

                }
                break;
            case 65 :
                // InternalKlangLexer.g:1:412: Y
                {
                mY(); 

                }
                break;
            case 66 :
                // InternalKlangLexer.g:1:414: Z
                {
                mZ(); 

                }
                break;
            case 67 :
                // InternalKlangLexer.g:1:416: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 68 :
                // InternalKlangLexer.g:1:424: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 69 :
                // InternalKlangLexer.g:1:433: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 70 :
                // InternalKlangLexer.g:1:445: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 71 :
                // InternalKlangLexer.g:1:461: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 72 :
                // InternalKlangLexer.g:1:477: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 73 :
                // InternalKlangLexer.g:1:485: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\6\101\1\112\1\114\10\101\1\130\1\132\1\134\1\101\7\uffff\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\175\1\176\1\177\1\73\2\uffff\2\73\2\uffff\5\101\1\uffff\10\101\1\uffff\1\101\1\uffff\7\101\1\u0099\2\101\6\uffff\1\u009c\45\uffff\24\101\1\u00b1\1\u00b2\1\uffff\1\u00b3\1\u00b4\1\uffff\17\101\1\u00c4\1\u00c5\1\u00c6\1\u00c7\1\u00c8\4\uffff\3\101\1\u00cc\1\u00cd\4\101\1\u00d2\2\101\1\u00d5\1\u00d6\1\u00d7\5\uffff\1\101\1\u00d9\1\u00da\2\uffff\4\101\1\uffff\1\101\1\u00e0\3\uffff\1\101\2\uffff\1\101\1\u00e3\1\101\1\u00e5\1\u00e6\1\uffff\1\101\1\u00e8\1\uffff\1\u00e9\2\uffff\1\101\2\uffff\1\101\1\u00ec\1\uffff";
    static final String DFA12_eofS =
        "\u00ed\uffff";
    static final String DFA12_minS =
        "\1\0\1\143\1\154\1\145\1\141\1\162\1\157\2\60\1\150\1\154\1\141\1\162\1\156\1\146\1\157\1\141\3\75\1\162\7\uffff\1\52\30\60\1\101\2\uffff\2\0\2\uffff\1\156\1\162\1\141\2\145\1\uffff\1\154\1\151\1\143\1\162\1\154\1\145\1\165\1\124\1\uffff\1\101\1\uffff\1\145\1\164\1\163\1\155\1\165\1\144\1\164\1\60\1\164\1\162\6\uffff\1\60\45\uffff\1\144\1\151\1\162\1\156\1\145\1\154\1\143\2\145\2\163\1\142\1\105\1\103\1\154\1\156\1\150\3\145\2\60\1\uffff\2\60\1\uffff\1\115\2\164\1\145\1\160\1\151\1\153\1\151\1\166\1\145\1\163\1\154\1\122\1\105\1\145\5\60\4\uffff\2\145\1\163\2\60\1\144\1\145\1\166\1\145\1\60\2\145\3\60\5\uffff\1\163\2\60\2\uffff\1\145\1\144\1\145\1\162\1\uffff\1\144\1\60\3\uffff\1\163\2\uffff\1\163\1\60\1\144\2\60\1\uffff\1\141\1\60\1\uffff\1\60\2\uffff\1\147\2\uffff\1\145\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\164\1\157\1\145\1\157\1\162\1\157\2\172\1\151\1\154\1\141\1\162\2\156\1\157\1\141\3\75\1\162\7\uffff\1\57\31\172\2\uffff\2\uffff\2\uffff\1\156\1\162\1\141\2\145\1\uffff\1\154\1\151\1\143\1\162\1\154\1\145\1\165\1\124\1\uffff\1\101\1\uffff\1\151\1\164\1\163\1\155\1\165\1\144\1\164\1\172\1\164\1\162\6\uffff\1\172\45\uffff\1\144\1\151\1\162\1\156\1\145\1\154\1\143\2\145\2\163\1\142\1\105\1\103\1\154\1\156\1\150\3\145\2\172\1\uffff\2\172\1\uffff\1\115\2\164\1\145\1\160\1\151\1\153\1\151\1\166\1\145\1\163\1\154\1\122\1\105\1\145\5\172\4\uffff\2\145\1\163\2\172\1\144\1\145\1\166\1\145\1\172\2\145\3\172\5\uffff\1\163\2\172\2\uffff\1\145\1\144\1\145\1\162\1\uffff\1\144\1\172\3\uffff\1\163\2\uffff\1\163\1\172\1\144\2\172\1\uffff\1\141\1\172\1\uffff\1\172\2\uffff\1\147\2\uffff\1\145\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\25\uffff\1\36\1\37\1\40\1\41\1\42\1\43\1\44\32\uffff\1\103\1\104\2\uffff\1\110\1\111\5\uffff\1\103\10\uffff\1\55\1\uffff\1\73\12\uffff\1\31\1\46\1\32\1\47\1\33\1\50\1\uffff\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\106\1\107\1\45\1\51\1\52\1\53\1\54\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\104\1\105\1\110\26\uffff\1\34\2\uffff\1\35\24\uffff\1\25\1\26\1\27\1\30\17\uffff\1\23\1\24\1\20\1\21\1\22\3\uffff\1\15\1\16\4\uffff\1\14\2\uffff\1\12\1\13\1\17\1\uffff\1\10\1\11\5\uffff\1\7\2\uffff\1\4\1\uffff\1\5\1\6\1\uffff\1\2\1\3\2\uffff\1\1";
    static final String DFA12_specialS =
        "\1\2\67\uffff\1\0\1\1\u00b3\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\73\2\72\2\73\1\72\22\73\1\72\1\73\1\70\4\73\1\71\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\12\67\2\73\1\21\1\22\1\23\2\73\1\35\1\36\1\37\1\40\1\7\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\10\1\56\1\57\1\60\1\61\1\62\1\63\1\64\3\73\1\65\1\66\1\73\1\15\1\66\1\2\1\6\1\12\1\4\1\13\1\66\1\16\4\66\1\17\1\24\1\5\1\66\1\3\1\1\1\14\1\66\1\20\1\11\3\66\uff85\73",
            "\1\77\1\uffff\1\74\6\uffff\1\100\3\uffff\1\75\3\uffff\1\76",
            "\1\103\2\uffff\1\102",
            "\1\104",
            "\1\106\15\uffff\1\105",
            "\1\107",
            "\1\110",
            "\12\101\7\uffff\15\101\1\111\14\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\17\101\1\113\12\101\4\uffff\1\101\1\uffff\32\101",
            "\1\115\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\124\7\uffff\1\123",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\131",
            "\1\133",
            "\1\135",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\145\4\uffff\1\146",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\32\101\4\uffff\1\101\1\uffff\32\101",
            "",
            "",
            "\0\u0081",
            "\0\u0081",
            "",
            "",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "",
            "\1\u0090",
            "",
            "\1\u0092\3\uffff\1\u0091",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u009a",
            "\1\u009b",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "",
            "",
            "",
            "",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u00d3",
            "\1\u00d4",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d8",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "",
            "",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "",
            "\1\u00df",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "",
            "",
            "",
            "\1\u00e1",
            "",
            "",
            "\1\u00e2",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\u00e4",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "",
            "\1\u00e7",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "",
            "",
            "\1\u00ea",
            "",
            "",
            "\1\u00eb",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( SendMessage | Collides | Received | Clicked | Forever | Pressed | Double | Sprite | Starts | ENTER | SPACE | False | Scene | Sleep | While | Else | Game | True | When | With | And | Int | Not | Var | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | If | Or | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | LessThanSign | EqualsSign | GreaterThanSign | A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q | R | S | T | U | V | W | X | Y | Z | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_56 = input.LA(1);

                        s = -1;
                        if ( ((LA12_56>='\u0000' && LA12_56<='\uFFFF')) ) {s = 129;}

                        else s = 59;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_57 = input.LA(1);

                        s = -1;
                        if ( ((LA12_57>='\u0000' && LA12_57<='\uFFFF')) ) {s = 129;}

                        else s = 59;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='s') ) {s = 1;}

                        else if ( (LA12_0=='c') ) {s = 2;}

                        else if ( (LA12_0=='r') ) {s = 3;}

                        else if ( (LA12_0=='f') ) {s = 4;}

                        else if ( (LA12_0=='p') ) {s = 5;}

                        else if ( (LA12_0=='d') ) {s = 6;}

                        else if ( (LA12_0=='E') ) {s = 7;}

                        else if ( (LA12_0=='S') ) {s = 8;}

                        else if ( (LA12_0=='w') ) {s = 9;}

                        else if ( (LA12_0=='e') ) {s = 10;}

                        else if ( (LA12_0=='g') ) {s = 11;}

                        else if ( (LA12_0=='t') ) {s = 12;}

                        else if ( (LA12_0=='a') ) {s = 13;}

                        else if ( (LA12_0=='i') ) {s = 14;}

                        else if ( (LA12_0=='n') ) {s = 15;}

                        else if ( (LA12_0=='v') ) {s = 16;}

                        else if ( (LA12_0=='<') ) {s = 17;}

                        else if ( (LA12_0=='=') ) {s = 18;}

                        else if ( (LA12_0=='>') ) {s = 19;}

                        else if ( (LA12_0=='o') ) {s = 20;}

                        else if ( (LA12_0=='(') ) {s = 21;}

                        else if ( (LA12_0==')') ) {s = 22;}

                        else if ( (LA12_0=='*') ) {s = 23;}

                        else if ( (LA12_0=='+') ) {s = 24;}

                        else if ( (LA12_0==',') ) {s = 25;}

                        else if ( (LA12_0=='-') ) {s = 26;}

                        else if ( (LA12_0=='.') ) {s = 27;}

                        else if ( (LA12_0=='/') ) {s = 28;}

                        else if ( (LA12_0=='A') ) {s = 29;}

                        else if ( (LA12_0=='B') ) {s = 30;}

                        else if ( (LA12_0=='C') ) {s = 31;}

                        else if ( (LA12_0=='D') ) {s = 32;}

                        else if ( (LA12_0=='F') ) {s = 33;}

                        else if ( (LA12_0=='G') ) {s = 34;}

                        else if ( (LA12_0=='H') ) {s = 35;}

                        else if ( (LA12_0=='I') ) {s = 36;}

                        else if ( (LA12_0=='J') ) {s = 37;}

                        else if ( (LA12_0=='K') ) {s = 38;}

                        else if ( (LA12_0=='L') ) {s = 39;}

                        else if ( (LA12_0=='M') ) {s = 40;}

                        else if ( (LA12_0=='N') ) {s = 41;}

                        else if ( (LA12_0=='O') ) {s = 42;}

                        else if ( (LA12_0=='P') ) {s = 43;}

                        else if ( (LA12_0=='Q') ) {s = 44;}

                        else if ( (LA12_0=='R') ) {s = 45;}

                        else if ( (LA12_0=='T') ) {s = 46;}

                        else if ( (LA12_0=='U') ) {s = 47;}

                        else if ( (LA12_0=='V') ) {s = 48;}

                        else if ( (LA12_0=='W') ) {s = 49;}

                        else if ( (LA12_0=='X') ) {s = 50;}

                        else if ( (LA12_0=='Y') ) {s = 51;}

                        else if ( (LA12_0=='Z') ) {s = 52;}

                        else if ( (LA12_0=='^') ) {s = 53;}

                        else if ( (LA12_0=='_'||LA12_0=='b'||LA12_0=='h'||(LA12_0>='j' && LA12_0<='m')||LA12_0=='q'||LA12_0=='u'||(LA12_0>='x' && LA12_0<='z')) ) {s = 54;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 55;}

                        else if ( (LA12_0=='\"') ) {s = 56;}

                        else if ( (LA12_0=='\'') ) {s = 57;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 58;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>=':' && LA12_0<=';')||(LA12_0>='?' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 59;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}