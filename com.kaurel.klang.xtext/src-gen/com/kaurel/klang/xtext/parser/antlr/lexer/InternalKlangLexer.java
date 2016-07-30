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
    public static final int Or=24;
    public static final int RULE_BEGIN=35;
    public static final int Clicked=5;
    public static final int Var=21;
    public static final int True=15;
    public static final int False=10;
    public static final int LessThanSign=32;
    public static final int Forever=6;
    public static final int LeftParenthesis=25;
    public static final int GreaterThanSign=34;
    public static final int RULE_ID=40;
    public static final int Collides=4;
    public static final int RightParenthesis=26;
    public static final int Scene=11;
    public static final int RULE_DECIMAL=39;
    public static final int EqualsSignEqualsSign=22;
    public static final int Not=20;
    public static final int Game=14;
    public static final int And=18;
    public static final int PlusSign=28;
    public static final int RULE_INT=38;
    public static final int RULE_UPPERCASE=37;
    public static final int RULE_ML_COMMENT=42;
    public static final int If=23;
    public static final int Key=19;
    public static final int Pressed=7;
    public static final int RULE_END=36;
    public static final int Starts=9;
    public static final int RULE_STRING=41;
    public static final int With=17;
    public static final int RULE_SL_COMMENT=43;
    public static final int Comma=29;
    public static final int EqualsSign=33;
    public static final int HyphenMinus=30;
    public static final int Solidus=31;
    public static final int EOF=-1;
    public static final int Asterisk=27;
    public static final int Sprite=8;
    public static final int RULE_WS=44;
    public static final int While=13;
    public static final int RULE_ANY_OTHER=45;
    public static final int Sleep=12;
    public static final int When=16;

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

    // $ANTLR start "Collides"
    public final void mCollides() throws RecognitionException {
        try {
            int _type = Collides;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:14:10: ( 'collides' )
            // InternalKlangLexer.g:14:12: 'collides'
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

    // $ANTLR start "Clicked"
    public final void mClicked() throws RecognitionException {
        try {
            int _type = Clicked;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:16:9: ( 'clicked' )
            // InternalKlangLexer.g:16:11: 'clicked'
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
            // InternalKlangLexer.g:18:9: ( 'forever' )
            // InternalKlangLexer.g:18:11: 'forever'
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
            // InternalKlangLexer.g:20:9: ( 'pressed' )
            // InternalKlangLexer.g:20:11: 'pressed'
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

    // $ANTLR start "Sprite"
    public final void mSprite() throws RecognitionException {
        try {
            int _type = Sprite;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:22:8: ( 'sprite' )
            // InternalKlangLexer.g:22:10: 'sprite'
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
            // InternalKlangLexer.g:24:8: ( 'starts' )
            // InternalKlangLexer.g:24:10: 'starts'
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

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:26:7: ( 'false' )
            // InternalKlangLexer.g:26:9: 'false'
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
            // InternalKlangLexer.g:28:7: ( 'scene' )
            // InternalKlangLexer.g:28:9: 'scene'
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
            // InternalKlangLexer.g:30:7: ( 'sleep' )
            // InternalKlangLexer.g:30:9: 'sleep'
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
            // InternalKlangLexer.g:32:7: ( 'while' )
            // InternalKlangLexer.g:32:9: 'while'
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

    // $ANTLR start "Game"
    public final void mGame() throws RecognitionException {
        try {
            int _type = Game;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:34:6: ( 'game' )
            // InternalKlangLexer.g:34:8: 'game'
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
            // InternalKlangLexer.g:36:6: ( 'true' )
            // InternalKlangLexer.g:36:8: 'true'
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
            // InternalKlangLexer.g:38:6: ( 'when' )
            // InternalKlangLexer.g:38:8: 'when'
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
            // InternalKlangLexer.g:40:6: ( 'with' )
            // InternalKlangLexer.g:40:8: 'with'
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
            // InternalKlangLexer.g:42:5: ( 'and' )
            // InternalKlangLexer.g:42:7: 'and'
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

    // $ANTLR start "Key"
    public final void mKey() throws RecognitionException {
        try {
            int _type = Key;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:44:5: ( 'key' )
            // InternalKlangLexer.g:44:7: 'key'
            {
            match("key"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Key"

    // $ANTLR start "Not"
    public final void mNot() throws RecognitionException {
        try {
            int _type = Not;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:46:5: ( 'not' )
            // InternalKlangLexer.g:46:7: 'not'
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
            // InternalKlangLexer.g:48:5: ( 'var' )
            // InternalKlangLexer.g:48:7: 'var'
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

    // $ANTLR start "EqualsSignEqualsSign"
    public final void mEqualsSignEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:50:22: ( '==' )
            // InternalKlangLexer.g:50:24: '=='
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

    // $ANTLR start "If"
    public final void mIf() throws RecognitionException {
        try {
            int _type = If;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:52:4: ( 'if' )
            // InternalKlangLexer.g:52:6: 'if'
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
            // InternalKlangLexer.g:54:4: ( 'or' )
            // InternalKlangLexer.g:54:6: 'or'
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
            // InternalKlangLexer.g:56:17: ( '(' )
            // InternalKlangLexer.g:56:19: '('
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
            // InternalKlangLexer.g:58:18: ( ')' )
            // InternalKlangLexer.g:58:20: ')'
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
            // InternalKlangLexer.g:60:10: ( '*' )
            // InternalKlangLexer.g:60:12: '*'
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
            // InternalKlangLexer.g:62:10: ( '+' )
            // InternalKlangLexer.g:62:12: '+'
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
            // InternalKlangLexer.g:64:7: ( ',' )
            // InternalKlangLexer.g:64:9: ','
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
            // InternalKlangLexer.g:66:13: ( '-' )
            // InternalKlangLexer.g:66:15: '-'
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

    // $ANTLR start "Solidus"
    public final void mSolidus() throws RecognitionException {
        try {
            int _type = Solidus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:68:9: ( '/' )
            // InternalKlangLexer.g:68:11: '/'
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
            // InternalKlangLexer.g:70:14: ( '<' )
            // InternalKlangLexer.g:70:16: '<'
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
            // InternalKlangLexer.g:72:12: ( '=' )
            // InternalKlangLexer.g:72:14: '='
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
            // InternalKlangLexer.g:74:17: ( '>' )
            // InternalKlangLexer.g:74:19: '>'
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

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalKlangLexer.g:78:21: ()
            // InternalKlangLexer.g:78:23: 
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
            // InternalKlangLexer.g:80:19: ()
            // InternalKlangLexer.g:80:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_UPPERCASE"
    public final void mRULE_UPPERCASE() throws RecognitionException {
        try {
            int _type = RULE_UPPERCASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:82:16: ( ( 'A' .. 'Z' | '0' .. '9' )* )
            // InternalKlangLexer.g:82:18: ( 'A' .. 'Z' | '0' .. '9' )*
            {
            // InternalKlangLexer.g:82:18: ( 'A' .. 'Z' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKlangLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UPPERCASE"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:84:14: ( RULE_INT ( '.' RULE_INT )? )
            // InternalKlangLexer.g:84:16: RULE_INT ( '.' RULE_INT )?
            {
            mRULE_INT(); 
            // InternalKlangLexer.g:84:25: ( '.' RULE_INT )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='.') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalKlangLexer.g:84:26: '.' RULE_INT
                    {
                    match('.'); 
                    mRULE_INT(); 

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
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:86:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalKlangLexer.g:86:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalKlangLexer.g:86:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalKlangLexer.g:86:11: '^'
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

            // InternalKlangLexer.g:86:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
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
            	    break loop4;
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
            // InternalKlangLexer.g:88:19: ( ( '0' .. '9' )+ )
            // InternalKlangLexer.g:88:21: ( '0' .. '9' )+
            {
            // InternalKlangLexer.g:88:21: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalKlangLexer.g:88:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

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
            // InternalKlangLexer.g:90:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalKlangLexer.g:90:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalKlangLexer.g:90:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalKlangLexer.g:90:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalKlangLexer.g:90:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalKlangLexer.g:90:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKlangLexer.g:90:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalKlangLexer.g:90:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalKlangLexer.g:90:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalKlangLexer.g:90:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKlangLexer.g:90:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
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
            // InternalKlangLexer.g:92:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalKlangLexer.g:92:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalKlangLexer.g:92:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalKlangLexer.g:92:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // InternalKlangLexer.g:94:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalKlangLexer.g:94:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalKlangLexer.g:94:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalKlangLexer.g:94:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // InternalKlangLexer.g:94:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalKlangLexer.g:94:41: ( '\\r' )? '\\n'
                    {
                    // InternalKlangLexer.g:94:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalKlangLexer.g:94:41: '\\r'
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
            // InternalKlangLexer.g:96:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalKlangLexer.g:96:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalKlangLexer.g:96:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // InternalKlangLexer.g:98:16: ( . )
            // InternalKlangLexer.g:98:18: .
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
        // InternalKlangLexer.g:1:8: ( Collides | Clicked | Forever | Pressed | Sprite | Starts | False | Scene | Sleep | While | Game | True | When | With | And | Key | Not | Var | EqualsSignEqualsSign | If | Or | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | Solidus | LessThanSign | EqualsSign | GreaterThanSign | RULE_UPPERCASE | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=39;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalKlangLexer.g:1:10: Collides
                {
                mCollides(); 

                }
                break;
            case 2 :
                // InternalKlangLexer.g:1:19: Clicked
                {
                mClicked(); 

                }
                break;
            case 3 :
                // InternalKlangLexer.g:1:27: Forever
                {
                mForever(); 

                }
                break;
            case 4 :
                // InternalKlangLexer.g:1:35: Pressed
                {
                mPressed(); 

                }
                break;
            case 5 :
                // InternalKlangLexer.g:1:43: Sprite
                {
                mSprite(); 

                }
                break;
            case 6 :
                // InternalKlangLexer.g:1:50: Starts
                {
                mStarts(); 

                }
                break;
            case 7 :
                // InternalKlangLexer.g:1:57: False
                {
                mFalse(); 

                }
                break;
            case 8 :
                // InternalKlangLexer.g:1:63: Scene
                {
                mScene(); 

                }
                break;
            case 9 :
                // InternalKlangLexer.g:1:69: Sleep
                {
                mSleep(); 

                }
                break;
            case 10 :
                // InternalKlangLexer.g:1:75: While
                {
                mWhile(); 

                }
                break;
            case 11 :
                // InternalKlangLexer.g:1:81: Game
                {
                mGame(); 

                }
                break;
            case 12 :
                // InternalKlangLexer.g:1:86: True
                {
                mTrue(); 

                }
                break;
            case 13 :
                // InternalKlangLexer.g:1:91: When
                {
                mWhen(); 

                }
                break;
            case 14 :
                // InternalKlangLexer.g:1:96: With
                {
                mWith(); 

                }
                break;
            case 15 :
                // InternalKlangLexer.g:1:101: And
                {
                mAnd(); 

                }
                break;
            case 16 :
                // InternalKlangLexer.g:1:105: Key
                {
                mKey(); 

                }
                break;
            case 17 :
                // InternalKlangLexer.g:1:109: Not
                {
                mNot(); 

                }
                break;
            case 18 :
                // InternalKlangLexer.g:1:113: Var
                {
                mVar(); 

                }
                break;
            case 19 :
                // InternalKlangLexer.g:1:117: EqualsSignEqualsSign
                {
                mEqualsSignEqualsSign(); 

                }
                break;
            case 20 :
                // InternalKlangLexer.g:1:138: If
                {
                mIf(); 

                }
                break;
            case 21 :
                // InternalKlangLexer.g:1:141: Or
                {
                mOr(); 

                }
                break;
            case 22 :
                // InternalKlangLexer.g:1:144: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 23 :
                // InternalKlangLexer.g:1:160: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 24 :
                // InternalKlangLexer.g:1:177: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 25 :
                // InternalKlangLexer.g:1:186: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 26 :
                // InternalKlangLexer.g:1:195: Comma
                {
                mComma(); 

                }
                break;
            case 27 :
                // InternalKlangLexer.g:1:201: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 28 :
                // InternalKlangLexer.g:1:213: Solidus
                {
                mSolidus(); 

                }
                break;
            case 29 :
                // InternalKlangLexer.g:1:221: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 30 :
                // InternalKlangLexer.g:1:234: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 31 :
                // InternalKlangLexer.g:1:245: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 32 :
                // InternalKlangLexer.g:1:261: RULE_UPPERCASE
                {
                mRULE_UPPERCASE(); 

                }
                break;
            case 33 :
                // InternalKlangLexer.g:1:276: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 34 :
                // InternalKlangLexer.g:1:289: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 35 :
                // InternalKlangLexer.g:1:297: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 36 :
                // InternalKlangLexer.g:1:309: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 37 :
                // InternalKlangLexer.g:1:325: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 38 :
                // InternalKlangLexer.g:1:341: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 39 :
                // InternalKlangLexer.g:1:349: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\31\13\43\1\64\2\43\6\uffff\1\77\2\uffff\1\31\1\uffff\1\31\1\40\1\uffff\2\40\2\uffff\2\43\1\uffff\17\43\2\uffff\1\131\1\132\14\uffff\2\31\2\uffff\16\43\1\151\1\152\1\153\1\154\2\uffff\12\43\1\167\1\170\1\171\1\172\4\uffff\3\43\1\176\3\43\1\u0082\1\u0083\1\u0084\4\uffff\3\43\1\uffff\1\43\1\u0089\1\u008a\3\uffff\1\43\1\u008c\1\u008d\1\u008e\2\uffff\1\u008f\4\uffff";
    static final String DFA14_eofS =
        "\u0090\uffff";
    static final String DFA14_minS =
        "\1\0\1\154\1\141\1\162\1\143\1\150\1\141\1\162\1\156\1\145\1\157\1\141\1\75\1\146\1\162\6\uffff\1\52\2\uffff\1\56\1\uffff\1\60\1\101\1\uffff\2\0\2\uffff\1\154\1\151\1\uffff\1\162\1\154\1\145\1\162\1\141\3\145\1\164\1\155\1\165\1\144\1\171\1\164\1\162\2\uffff\2\60\14\uffff\1\56\1\60\2\uffff\1\154\1\143\1\145\2\163\1\151\1\162\1\156\1\145\1\154\1\156\1\150\2\145\4\60\2\uffff\1\151\1\153\1\166\1\145\1\163\2\164\1\145\1\160\1\145\4\60\4\uffff\1\144\2\145\1\60\2\145\1\163\3\60\4\uffff\1\145\1\144\1\162\1\uffff\1\144\2\60\3\uffff\1\163\3\60\2\uffff\1\60\4\uffff";
    static final String DFA14_maxS =
        "\1\uffff\2\157\1\162\1\164\1\151\1\141\1\162\1\156\1\145\1\157\1\141\1\75\1\146\1\162\6\uffff\1\57\2\uffff\1\71\1\uffff\2\172\1\uffff\2\uffff\2\uffff\1\154\1\151\1\uffff\1\162\1\154\1\145\1\162\1\141\2\145\1\151\1\164\1\155\1\165\1\144\1\171\1\164\1\162\2\uffff\2\172\14\uffff\1\71\1\172\2\uffff\1\154\1\143\1\145\2\163\1\151\1\162\1\156\1\145\1\154\1\156\1\150\2\145\4\172\2\uffff\1\151\1\153\1\166\1\145\1\163\2\164\1\145\1\160\1\145\4\172\4\uffff\1\144\2\145\1\172\2\145\1\163\3\172\4\uffff\1\145\1\144\1\162\1\uffff\1\144\2\172\3\uffff\1\163\3\172\2\uffff\1\172\4\uffff";
    static final String DFA14_acceptS =
        "\17\uffff\1\26\1\27\1\30\1\31\1\32\1\33\1\uffff\1\35\1\37\1\uffff\1\40\2\uffff\1\42\2\uffff\1\46\1\47\2\uffff\1\42\17\uffff\1\23\1\36\2\uffff\1\26\1\27\1\30\1\31\1\32\1\33\1\44\1\45\1\34\1\35\1\37\1\41\2\uffff\1\43\1\46\22\uffff\1\24\1\25\16\uffff\1\17\1\20\1\21\1\22\12\uffff\1\15\1\16\1\13\1\14\3\uffff\1\7\3\uffff\1\10\1\11\1\12\4\uffff\1\5\1\6\1\uffff\1\2\1\3\1\4\1\1";
    static final String DFA14_specialS =
        "\1\1\34\uffff\1\0\1\2\161\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\40\2\37\2\40\1\37\22\40\1\37\1\40\1\35\4\40\1\36\1\17\1\20\1\21\1\22\1\23\1\24\1\40\1\25\12\30\2\40\1\26\1\14\1\27\2\40\32\32\3\40\1\33\1\34\1\40\1\10\1\34\1\1\2\34\1\2\1\6\1\34\1\15\1\34\1\11\2\34\1\12\1\16\1\3\2\34\1\4\1\7\1\34\1\13\1\5\3\34\uff85\40",
            "\1\42\2\uffff\1\41",
            "\1\45\15\uffff\1\44",
            "\1\46",
            "\1\51\10\uffff\1\52\3\uffff\1\47\3\uffff\1\50",
            "\1\53\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\65",
            "\1\66",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\75\4\uffff\1\76",
            "",
            "",
            "\1\102\1\uffff\12\103",
            "",
            "\12\104\7\uffff\32\104\4\uffff\1\43\1\uffff\32\43",
            "\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\0\105",
            "\0\105",
            "",
            "",
            "\1\107",
            "\1\110",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\121\3\uffff\1\120",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
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
            "\1\102\1\uffff\12\103",
            "\12\104\7\uffff\32\104\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "",
            "\1\173",
            "\1\174",
            "\1\175",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "",
            "\1\u0088",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "\1\u008b",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Collides | Clicked | Forever | Pressed | Sprite | Starts | False | Scene | Sleep | While | Game | True | When | With | And | Key | Not | Var | EqualsSignEqualsSign | If | Or | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | Solidus | LessThanSign | EqualsSign | GreaterThanSign | RULE_UPPERCASE | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_29 = input.LA(1);

                        s = -1;
                        if ( ((LA14_29>='\u0000' && LA14_29<='\uFFFF')) ) {s = 69;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='c') ) {s = 1;}

                        else if ( (LA14_0=='f') ) {s = 2;}

                        else if ( (LA14_0=='p') ) {s = 3;}

                        else if ( (LA14_0=='s') ) {s = 4;}

                        else if ( (LA14_0=='w') ) {s = 5;}

                        else if ( (LA14_0=='g') ) {s = 6;}

                        else if ( (LA14_0=='t') ) {s = 7;}

                        else if ( (LA14_0=='a') ) {s = 8;}

                        else if ( (LA14_0=='k') ) {s = 9;}

                        else if ( (LA14_0=='n') ) {s = 10;}

                        else if ( (LA14_0=='v') ) {s = 11;}

                        else if ( (LA14_0=='=') ) {s = 12;}

                        else if ( (LA14_0=='i') ) {s = 13;}

                        else if ( (LA14_0=='o') ) {s = 14;}

                        else if ( (LA14_0=='(') ) {s = 15;}

                        else if ( (LA14_0==')') ) {s = 16;}

                        else if ( (LA14_0=='*') ) {s = 17;}

                        else if ( (LA14_0=='+') ) {s = 18;}

                        else if ( (LA14_0==',') ) {s = 19;}

                        else if ( (LA14_0=='-') ) {s = 20;}

                        else if ( (LA14_0=='/') ) {s = 21;}

                        else if ( (LA14_0=='<') ) {s = 22;}

                        else if ( (LA14_0=='>') ) {s = 23;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 24;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')) ) {s = 26;}

                        else if ( (LA14_0=='^') ) {s = 27;}

                        else if ( (LA14_0=='_'||LA14_0=='b'||(LA14_0>='d' && LA14_0<='e')||LA14_0=='h'||LA14_0=='j'||(LA14_0>='l' && LA14_0<='m')||(LA14_0>='q' && LA14_0<='r')||LA14_0=='u'||(LA14_0>='x' && LA14_0<='z')) ) {s = 28;}

                        else if ( (LA14_0=='\"') ) {s = 29;}

                        else if ( (LA14_0=='\'') ) {s = 30;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 31;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||LA14_0=='.'||(LA14_0>=':' && LA14_0<=';')||(LA14_0>='?' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 32;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_30 = input.LA(1);

                        s = -1;
                        if ( ((LA14_30>='\u0000' && LA14_30<='\uFFFF')) ) {s = 69;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}