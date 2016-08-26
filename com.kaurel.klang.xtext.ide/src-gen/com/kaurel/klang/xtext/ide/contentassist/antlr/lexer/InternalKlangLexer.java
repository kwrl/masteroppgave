package com.kaurel.klang.xtext.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKlangLexer extends Lexer {
    public static final int Or=27;
    public static final int RULE_BEGIN=39;
    public static final int Clicked=5;
    public static final int Var=24;
    public static final int True=17;
    public static final int False=11;
    public static final int LessThanSign=36;
    public static final int Forever=6;
    public static final int LeftParenthesis=28;
    public static final int GreaterThanSign=38;
    public static final int RULE_ID=41;
    public static final int Collides=4;
    public static final int RightParenthesis=29;
    public static final int Scene=12;
    public static final int Double=8;
    public static final int EqualsSignEqualsSign=25;
    public static final int Not=23;
    public static final int Game=16;
    public static final int And=20;
    public static final int PlusSign=31;
    public static final int RULE_INT=42;
    public static final int RULE_ML_COMMENT=44;
    public static final int If=26;
    public static final int Key=22;
    public static final int Pressed=7;
    public static final int RULE_END=40;
    public static final int Starts=10;
    public static final int RULE_STRING=43;
    public static final int Int=21;
    public static final int With=19;
    public static final int RULE_SL_COMMENT=45;
    public static final int Comma=32;
    public static final int EqualsSign=37;
    public static final int HyphenMinus=33;
    public static final int Solidus=35;
    public static final int EOF=-1;
    public static final int Asterisk=30;
    public static final int FullStop=34;
    public static final int Sprite=9;
    public static final int RULE_WS=46;
    public static final int While=14;
    public static final int RULE_ANY_OTHER=47;
    public static final int Sleep=13;
    public static final int When=18;
    public static final int Else=15;

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

    // $ANTLR start "Double"
    public final void mDouble() throws RecognitionException {
        try {
            int _type = Double;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:22:8: ( 'double' )
            // InternalKlangLexer.g:22:10: 'double'
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
            // InternalKlangLexer.g:24:8: ( 'sprite' )
            // InternalKlangLexer.g:24:10: 'sprite'
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
            // InternalKlangLexer.g:26:8: ( 'starts' )
            // InternalKlangLexer.g:26:10: 'starts'
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
            // InternalKlangLexer.g:28:7: ( 'false' )
            // InternalKlangLexer.g:28:9: 'false'
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
            // InternalKlangLexer.g:30:7: ( 'scene' )
            // InternalKlangLexer.g:30:9: 'scene'
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
            // InternalKlangLexer.g:32:7: ( 'sleep' )
            // InternalKlangLexer.g:32:9: 'sleep'
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
            // InternalKlangLexer.g:34:7: ( 'while' )
            // InternalKlangLexer.g:34:9: 'while'
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
            // InternalKlangLexer.g:36:6: ( 'else' )
            // InternalKlangLexer.g:36:8: 'else'
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
            // InternalKlangLexer.g:38:6: ( 'game' )
            // InternalKlangLexer.g:38:8: 'game'
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
            // InternalKlangLexer.g:40:6: ( 'true' )
            // InternalKlangLexer.g:40:8: 'true'
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
            // InternalKlangLexer.g:42:6: ( 'when' )
            // InternalKlangLexer.g:42:8: 'when'
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
            // InternalKlangLexer.g:44:6: ( 'with' )
            // InternalKlangLexer.g:44:8: 'with'
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
            // InternalKlangLexer.g:46:5: ( 'and' )
            // InternalKlangLexer.g:46:7: 'and'
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
            // InternalKlangLexer.g:48:5: ( 'int' )
            // InternalKlangLexer.g:48:7: 'int'
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

    // $ANTLR start "Key"
    public final void mKey() throws RecognitionException {
        try {
            int _type = Key;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:50:5: ( 'key' )
            // InternalKlangLexer.g:50:7: 'key'
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
            // InternalKlangLexer.g:52:5: ( 'not' )
            // InternalKlangLexer.g:52:7: 'not'
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
            // InternalKlangLexer.g:54:5: ( 'var' )
            // InternalKlangLexer.g:54:7: 'var'
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
            // InternalKlangLexer.g:56:22: ( '==' )
            // InternalKlangLexer.g:56:24: '=='
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
            // InternalKlangLexer.g:58:4: ( 'if' )
            // InternalKlangLexer.g:58:6: 'if'
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
            // InternalKlangLexer.g:60:4: ( 'or' )
            // InternalKlangLexer.g:60:6: 'or'
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
            // InternalKlangLexer.g:62:17: ( '(' )
            // InternalKlangLexer.g:62:19: '('
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
            // InternalKlangLexer.g:64:18: ( ')' )
            // InternalKlangLexer.g:64:20: ')'
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
            // InternalKlangLexer.g:66:10: ( '*' )
            // InternalKlangLexer.g:66:12: '*'
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
            // InternalKlangLexer.g:68:10: ( '+' )
            // InternalKlangLexer.g:68:12: '+'
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
            // InternalKlangLexer.g:70:7: ( ',' )
            // InternalKlangLexer.g:70:9: ','
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
            // InternalKlangLexer.g:72:13: ( '-' )
            // InternalKlangLexer.g:72:15: '-'
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
            // InternalKlangLexer.g:74:10: ( '.' )
            // InternalKlangLexer.g:74:12: '.'
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
            // InternalKlangLexer.g:76:9: ( '/' )
            // InternalKlangLexer.g:76:11: '/'
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
            // InternalKlangLexer.g:78:14: ( '<' )
            // InternalKlangLexer.g:78:16: '<'
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
            // InternalKlangLexer.g:80:12: ( '=' )
            // InternalKlangLexer.g:80:14: '='
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
            // InternalKlangLexer.g:82:17: ( '>' )
            // InternalKlangLexer.g:82:19: '>'
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
            // InternalKlangLexer.g:86:21: ()
            // InternalKlangLexer.g:86:23: 
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
            // InternalKlangLexer.g:88:19: ()
            // InternalKlangLexer.g:88:21: 
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
            // InternalKlangLexer.g:90:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalKlangLexer.g:90:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalKlangLexer.g:90:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalKlangLexer.g:90:11: '^'
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

            // InternalKlangLexer.g:90:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalKlangLexer.g:92:10: ( ( '0' .. '9' )+ )
            // InternalKlangLexer.g:92:12: ( '0' .. '9' )+
            {
            // InternalKlangLexer.g:92:12: ( '0' .. '9' )+
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
            	    // InternalKlangLexer.g:92:13: '0' .. '9'
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
            // InternalKlangLexer.g:94:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalKlangLexer.g:94:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalKlangLexer.g:94:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalKlangLexer.g:94:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalKlangLexer.g:94:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalKlangLexer.g:94:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKlangLexer.g:94:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalKlangLexer.g:94:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalKlangLexer.g:94:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalKlangLexer.g:94:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKlangLexer.g:94:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalKlangLexer.g:96:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalKlangLexer.g:96:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalKlangLexer.g:96:24: ( options {greedy=false; } : . )*
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
            	    // InternalKlangLexer.g:96:52: .
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
            // InternalKlangLexer.g:98:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalKlangLexer.g:98:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalKlangLexer.g:98:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKlangLexer.g:98:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalKlangLexer.g:98:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalKlangLexer.g:98:41: ( '\\r' )? '\\n'
                    {
                    // InternalKlangLexer.g:98:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalKlangLexer.g:98:41: '\\r'
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
            // InternalKlangLexer.g:100:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalKlangLexer.g:100:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalKlangLexer.g:100:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalKlangLexer.g:102:16: ( . )
            // InternalKlangLexer.g:102:18: .
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
        // InternalKlangLexer.g:1:8: ( Collides | Clicked | Forever | Pressed | Double | Sprite | Starts | False | Scene | Sleep | While | Else | Game | True | When | With | And | Int | Key | Not | Var | EqualsSignEqualsSign | If | Or | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | LessThanSign | EqualsSign | GreaterThanSign | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=42;
        alt12 = dfa12.predict(input);
        switch (alt12) {
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
                // InternalKlangLexer.g:1:43: Double
                {
                mDouble(); 

                }
                break;
            case 6 :
                // InternalKlangLexer.g:1:50: Sprite
                {
                mSprite(); 

                }
                break;
            case 7 :
                // InternalKlangLexer.g:1:57: Starts
                {
                mStarts(); 

                }
                break;
            case 8 :
                // InternalKlangLexer.g:1:64: False
                {
                mFalse(); 

                }
                break;
            case 9 :
                // InternalKlangLexer.g:1:70: Scene
                {
                mScene(); 

                }
                break;
            case 10 :
                // InternalKlangLexer.g:1:76: Sleep
                {
                mSleep(); 

                }
                break;
            case 11 :
                // InternalKlangLexer.g:1:82: While
                {
                mWhile(); 

                }
                break;
            case 12 :
                // InternalKlangLexer.g:1:88: Else
                {
                mElse(); 

                }
                break;
            case 13 :
                // InternalKlangLexer.g:1:93: Game
                {
                mGame(); 

                }
                break;
            case 14 :
                // InternalKlangLexer.g:1:98: True
                {
                mTrue(); 

                }
                break;
            case 15 :
                // InternalKlangLexer.g:1:103: When
                {
                mWhen(); 

                }
                break;
            case 16 :
                // InternalKlangLexer.g:1:108: With
                {
                mWith(); 

                }
                break;
            case 17 :
                // InternalKlangLexer.g:1:113: And
                {
                mAnd(); 

                }
                break;
            case 18 :
                // InternalKlangLexer.g:1:117: Int
                {
                mInt(); 

                }
                break;
            case 19 :
                // InternalKlangLexer.g:1:121: Key
                {
                mKey(); 

                }
                break;
            case 20 :
                // InternalKlangLexer.g:1:125: Not
                {
                mNot(); 

                }
                break;
            case 21 :
                // InternalKlangLexer.g:1:129: Var
                {
                mVar(); 

                }
                break;
            case 22 :
                // InternalKlangLexer.g:1:133: EqualsSignEqualsSign
                {
                mEqualsSignEqualsSign(); 

                }
                break;
            case 23 :
                // InternalKlangLexer.g:1:154: If
                {
                mIf(); 

                }
                break;
            case 24 :
                // InternalKlangLexer.g:1:157: Or
                {
                mOr(); 

                }
                break;
            case 25 :
                // InternalKlangLexer.g:1:160: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 26 :
                // InternalKlangLexer.g:1:176: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 27 :
                // InternalKlangLexer.g:1:193: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 28 :
                // InternalKlangLexer.g:1:202: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 29 :
                // InternalKlangLexer.g:1:211: Comma
                {
                mComma(); 

                }
                break;
            case 30 :
                // InternalKlangLexer.g:1:217: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 31 :
                // InternalKlangLexer.g:1:229: FullStop
                {
                mFullStop(); 

                }
                break;
            case 32 :
                // InternalKlangLexer.g:1:238: Solidus
                {
                mSolidus(); 

                }
                break;
            case 33 :
                // InternalKlangLexer.g:1:246: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 34 :
                // InternalKlangLexer.g:1:259: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 35 :
                // InternalKlangLexer.g:1:270: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 36 :
                // InternalKlangLexer.g:1:286: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 37 :
                // InternalKlangLexer.g:1:294: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 38 :
                // InternalKlangLexer.g:1:303: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 39 :
                // InternalKlangLexer.g:1:315: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 40 :
                // InternalKlangLexer.g:1:331: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 41 :
                // InternalKlangLexer.g:1:347: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 42 :
                // InternalKlangLexer.g:1:355: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\16\44\1\71\1\44\7\uffff\1\104\2\uffff\1\41\2\uffff\2\41\2\uffff\2\44\1\uffff\17\44\1\134\3\44\2\uffff\1\140\17\uffff\20\44\1\161\1\162\1\uffff\1\163\1\164\1\165\1\uffff\13\44\1\u0081\1\u0082\1\u0083\1\u0084\1\u0085\5\uffff\3\44\1\u0089\4\44\1\u008e\1\u008f\1\u0090\5\uffff\3\44\1\uffff\1\44\1\u0095\1\u0096\1\u0097\3\uffff\1\44\1\u0099\1\u009a\1\u009b\3\uffff\1\u009c\4\uffff";
    static final String DFA12_eofS =
        "\u009d\uffff";
    static final String DFA12_minS =
        "\1\0\1\154\1\141\1\162\1\157\1\143\1\150\1\154\1\141\1\162\1\156\1\146\1\145\1\157\1\141\1\75\1\162\7\uffff\1\52\2\uffff\1\101\2\uffff\2\0\2\uffff\1\154\1\151\1\uffff\1\162\1\154\1\145\1\165\1\162\1\141\3\145\1\164\1\163\1\155\1\165\1\144\1\164\1\60\1\171\1\164\1\162\2\uffff\1\60\17\uffff\1\154\1\143\1\145\2\163\1\142\1\151\1\162\1\156\1\145\1\154\1\156\1\150\3\145\2\60\1\uffff\3\60\1\uffff\1\151\1\153\1\166\1\145\1\163\1\154\2\164\1\145\1\160\1\145\5\60\5\uffff\1\144\2\145\1\60\3\145\1\163\3\60\5\uffff\1\145\1\144\1\162\1\uffff\1\144\3\60\3\uffff\1\163\3\60\3\uffff\1\60\4\uffff";
    static final String DFA12_maxS =
        "\1\uffff\2\157\1\162\1\157\1\164\1\151\1\154\1\141\1\162\2\156\1\145\1\157\1\141\1\75\1\162\7\uffff\1\57\2\uffff\1\172\2\uffff\2\uffff\2\uffff\1\154\1\151\1\uffff\1\162\1\154\1\145\1\165\1\162\1\141\2\145\1\151\1\164\1\163\1\155\1\165\1\144\1\164\1\172\1\171\1\164\1\162\2\uffff\1\172\17\uffff\1\154\1\143\1\145\2\163\1\142\1\151\1\162\1\156\1\145\1\154\1\156\1\150\3\145\2\172\1\uffff\3\172\1\uffff\1\151\1\153\1\166\1\145\1\163\1\154\2\164\1\145\1\160\1\145\5\172\5\uffff\1\144\2\145\1\172\3\145\1\163\3\172\5\uffff\1\145\1\144\1\162\1\uffff\1\144\3\172\3\uffff\1\163\3\172\3\uffff\1\172\4\uffff";
    static final String DFA12_acceptS =
        "\21\uffff\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\uffff\1\41\1\43\1\uffff\1\44\1\45\2\uffff\1\51\1\52\2\uffff\1\44\23\uffff\1\26\1\42\1\uffff\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\47\1\50\1\40\1\41\1\43\1\45\1\46\1\51\22\uffff\1\27\3\uffff\1\30\20\uffff\1\21\1\22\1\23\1\24\1\25\13\uffff\1\17\1\20\1\14\1\15\1\16\3\uffff\1\10\4\uffff\1\11\1\12\1\13\4\uffff\1\5\1\6\1\7\1\uffff\1\2\1\3\1\4\1\1";
    static final String DFA12_specialS =
        "\1\1\35\uffff\1\2\1\0\175\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\41\2\40\2\41\1\40\22\41\1\40\1\41\1\36\4\41\1\37\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\12\35\2\41\1\31\1\17\1\32\2\41\32\34\3\41\1\33\1\34\1\41\1\12\1\34\1\1\1\4\1\7\1\2\1\10\1\34\1\13\1\34\1\14\2\34\1\15\1\20\1\3\2\34\1\5\1\11\1\34\1\16\1\6\3\34\uff85\41",
            "\1\43\2\uffff\1\42",
            "\1\46\15\uffff\1\45",
            "\1\47",
            "\1\50",
            "\1\53\10\uffff\1\54\3\uffff\1\51\3\uffff\1\52",
            "\1\55\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\64\7\uffff\1\63",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\72",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\102\4\uffff\1\103",
            "",
            "",
            "\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\0\110",
            "\0\110",
            "",
            "",
            "\1\112",
            "\1\113",
            "",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\125\3\uffff\1\124",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\135",
            "\1\136",
            "\1\137",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
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
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            "",
            "",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            "",
            "",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "",
            "\1\u0094",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            "\1\u0098",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
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
            return "1:1: Tokens : ( Collides | Clicked | Forever | Pressed | Double | Sprite | Starts | False | Scene | Sleep | While | Else | Game | True | When | With | And | Int | Key | Not | Var | EqualsSignEqualsSign | If | Or | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | LessThanSign | EqualsSign | GreaterThanSign | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_31 = input.LA(1);

                        s = -1;
                        if ( ((LA12_31>='\u0000' && LA12_31<='\uFFFF')) ) {s = 72;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='c') ) {s = 1;}

                        else if ( (LA12_0=='f') ) {s = 2;}

                        else if ( (LA12_0=='p') ) {s = 3;}

                        else if ( (LA12_0=='d') ) {s = 4;}

                        else if ( (LA12_0=='s') ) {s = 5;}

                        else if ( (LA12_0=='w') ) {s = 6;}

                        else if ( (LA12_0=='e') ) {s = 7;}

                        else if ( (LA12_0=='g') ) {s = 8;}

                        else if ( (LA12_0=='t') ) {s = 9;}

                        else if ( (LA12_0=='a') ) {s = 10;}

                        else if ( (LA12_0=='i') ) {s = 11;}

                        else if ( (LA12_0=='k') ) {s = 12;}

                        else if ( (LA12_0=='n') ) {s = 13;}

                        else if ( (LA12_0=='v') ) {s = 14;}

                        else if ( (LA12_0=='=') ) {s = 15;}

                        else if ( (LA12_0=='o') ) {s = 16;}

                        else if ( (LA12_0=='(') ) {s = 17;}

                        else if ( (LA12_0==')') ) {s = 18;}

                        else if ( (LA12_0=='*') ) {s = 19;}

                        else if ( (LA12_0=='+') ) {s = 20;}

                        else if ( (LA12_0==',') ) {s = 21;}

                        else if ( (LA12_0=='-') ) {s = 22;}

                        else if ( (LA12_0=='.') ) {s = 23;}

                        else if ( (LA12_0=='/') ) {s = 24;}

                        else if ( (LA12_0=='<') ) {s = 25;}

                        else if ( (LA12_0=='>') ) {s = 26;}

                        else if ( (LA12_0=='^') ) {s = 27;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||LA12_0=='h'||LA12_0=='j'||(LA12_0>='l' && LA12_0<='m')||(LA12_0>='q' && LA12_0<='r')||LA12_0=='u'||(LA12_0>='x' && LA12_0<='z')) ) {s = 28;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 29;}

                        else if ( (LA12_0=='\"') ) {s = 30;}

                        else if ( (LA12_0=='\'') ) {s = 31;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 32;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>=':' && LA12_0<=';')||(LA12_0>='?' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_30 = input.LA(1);

                        s = -1;
                        if ( ((LA12_30>='\u0000' && LA12_30<='\uFFFF')) ) {s = 72;}

                        else s = 33;

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