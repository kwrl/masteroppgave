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
    public static final int RULE_END=29;
    public static final int Or=16;
    public static final int RULE_BEGIN=28;
    public static final int Var=14;
    public static final int True=10;
    public static final int RULE_STRING=33;
    public static final int False=7;
    public static final int LessThanSign=25;
    public static final int RULE_SL_COMMENT=35;
    public static final int Comma=22;
    public static final int EqualsSign=26;
    public static final int HyphenMinus=23;
    public static final int Forever=5;
    public static final int LeftParenthesis=18;
    public static final int Solidus=24;
    public static final int EOF=-1;
    public static final int Asterisk=20;
    public static final int ExclamationMark=17;
    public static final int RULE_NUMERIC=30;
    public static final int GreaterThanSign=27;
    public static final int Sprite=6;
    public static final int RULE_ID=31;
    public static final int RULE_WS=36;
    public static final int RightParenthesis=19;
    public static final int While=8;
    public static final int RULE_ANY_OTHER=37;
    public static final int GAME_STARTED=4;
    public static final int Not=13;
    public static final int When=11;
    public static final int And=12;
    public static final int PlusSign=21;
    public static final int RULE_INT=32;
    public static final int RULE_ML_COMMENT=34;
    public static final int Yield=9;
    public static final int If=15;

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

    // $ANTLR start "GAME_STARTED"
    public final void mGAME_STARTED() throws RecognitionException {
        try {
            int _type = GAME_STARTED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:14:14: ( 'GAME_STARTED' )
            // InternalKlangLexer.g:14:16: 'GAME_STARTED'
            {
            match("GAME_STARTED"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GAME_STARTED"

    // $ANTLR start "Forever"
    public final void mForever() throws RecognitionException {
        try {
            int _type = Forever;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:16:9: ( 'forever' )
            // InternalKlangLexer.g:16:11: 'forever'
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

    // $ANTLR start "Sprite"
    public final void mSprite() throws RecognitionException {
        try {
            int _type = Sprite;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:18:8: ( 'sprite' )
            // InternalKlangLexer.g:18:10: 'sprite'
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

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:20:7: ( 'false' )
            // InternalKlangLexer.g:20:9: 'false'
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

    // $ANTLR start "While"
    public final void mWhile() throws RecognitionException {
        try {
            int _type = While;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:22:7: ( 'while' )
            // InternalKlangLexer.g:22:9: 'while'
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

    // $ANTLR start "Yield"
    public final void mYield() throws RecognitionException {
        try {
            int _type = Yield;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:24:7: ( 'yield' )
            // InternalKlangLexer.g:24:9: 'yield'
            {
            match("yield"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Yield"

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:26:6: ( 'true' )
            // InternalKlangLexer.g:26:8: 'true'
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
            // InternalKlangLexer.g:28:6: ( 'when' )
            // InternalKlangLexer.g:28:8: 'when'
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

    // $ANTLR start "And"
    public final void mAnd() throws RecognitionException {
        try {
            int _type = And;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:30:5: ( 'and' )
            // InternalKlangLexer.g:30:7: 'and'
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

    // $ANTLR start "Not"
    public final void mNot() throws RecognitionException {
        try {
            int _type = Not;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:32:5: ( 'not' )
            // InternalKlangLexer.g:32:7: 'not'
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
            // InternalKlangLexer.g:34:5: ( 'var' )
            // InternalKlangLexer.g:34:7: 'var'
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

    // $ANTLR start "If"
    public final void mIf() throws RecognitionException {
        try {
            int _type = If;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:36:4: ( 'if' )
            // InternalKlangLexer.g:36:6: 'if'
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
            // InternalKlangLexer.g:38:4: ( 'or' )
            // InternalKlangLexer.g:38:6: 'or'
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

    // $ANTLR start "ExclamationMark"
    public final void mExclamationMark() throws RecognitionException {
        try {
            int _type = ExclamationMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:40:17: ( '!' )
            // InternalKlangLexer.g:40:19: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMark"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:42:17: ( '(' )
            // InternalKlangLexer.g:42:19: '('
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
            // InternalKlangLexer.g:44:18: ( ')' )
            // InternalKlangLexer.g:44:20: ')'
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
            // InternalKlangLexer.g:46:10: ( '*' )
            // InternalKlangLexer.g:46:12: '*'
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
            // InternalKlangLexer.g:48:10: ( '+' )
            // InternalKlangLexer.g:48:12: '+'
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
            // InternalKlangLexer.g:50:7: ( ',' )
            // InternalKlangLexer.g:50:9: ','
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
            // InternalKlangLexer.g:52:13: ( '-' )
            // InternalKlangLexer.g:52:15: '-'
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
            // InternalKlangLexer.g:54:9: ( '/' )
            // InternalKlangLexer.g:54:11: '/'
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
            // InternalKlangLexer.g:56:14: ( '<' )
            // InternalKlangLexer.g:56:16: '<'
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
            // InternalKlangLexer.g:58:12: ( '=' )
            // InternalKlangLexer.g:58:14: '='
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
            // InternalKlangLexer.g:60:17: ( '>' )
            // InternalKlangLexer.g:60:19: '>'
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
            // InternalKlangLexer.g:64:21: ()
            // InternalKlangLexer.g:64:23: 
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
            // InternalKlangLexer.g:66:19: ()
            // InternalKlangLexer.g:66:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_NUMERIC"
    public final void mRULE_NUMERIC() throws RecognitionException {
        try {
            int _type = RULE_NUMERIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:68:14: ( ( '0' .. '9' )+ )
            // InternalKlangLexer.g:68:16: ( '0' .. '9' )+
            {
            // InternalKlangLexer.g:68:16: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKlangLexer.g:68:17: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMERIC"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKlangLexer.g:70:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalKlangLexer.g:70:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalKlangLexer.g:70:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalKlangLexer.g:70:11: '^'
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

            // InternalKlangLexer.g:70:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
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
            	    break loop3;
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
            // InternalKlangLexer.g:72:10: ( ( '0' .. '9' )+ )
            // InternalKlangLexer.g:72:12: ( '0' .. '9' )+
            {
            // InternalKlangLexer.g:72:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKlangLexer.g:72:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
            // InternalKlangLexer.g:74:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalKlangLexer.g:74:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalKlangLexer.g:74:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalKlangLexer.g:74:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalKlangLexer.g:74:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalKlangLexer.g:74:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKlangLexer.g:74:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalKlangLexer.g:74:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalKlangLexer.g:74:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalKlangLexer.g:74:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKlangLexer.g:74:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop6;
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
            // InternalKlangLexer.g:76:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalKlangLexer.g:76:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalKlangLexer.g:76:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKlangLexer.g:76:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // InternalKlangLexer.g:78:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalKlangLexer.g:78:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalKlangLexer.g:78:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalKlangLexer.g:78:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop9;
                }
            } while (true);

            // InternalKlangLexer.g:78:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalKlangLexer.g:78:41: ( '\\r' )? '\\n'
                    {
                    // InternalKlangLexer.g:78:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalKlangLexer.g:78:41: '\\r'
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
            // InternalKlangLexer.g:80:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalKlangLexer.g:80:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalKlangLexer.g:80:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // InternalKlangLexer.g:82:16: ( . )
            // InternalKlangLexer.g:82:18: .
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
        // InternalKlangLexer.g:1:8: ( GAME_STARTED | Forever | Sprite | False | While | Yield | True | When | And | Not | Var | If | Or | ExclamationMark | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | Solidus | LessThanSign | EqualsSign | GreaterThanSign | RULE_NUMERIC | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=32;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalKlangLexer.g:1:10: GAME_STARTED
                {
                mGAME_STARTED(); 

                }
                break;
            case 2 :
                // InternalKlangLexer.g:1:23: Forever
                {
                mForever(); 

                }
                break;
            case 3 :
                // InternalKlangLexer.g:1:31: Sprite
                {
                mSprite(); 

                }
                break;
            case 4 :
                // InternalKlangLexer.g:1:38: False
                {
                mFalse(); 

                }
                break;
            case 5 :
                // InternalKlangLexer.g:1:44: While
                {
                mWhile(); 

                }
                break;
            case 6 :
                // InternalKlangLexer.g:1:50: Yield
                {
                mYield(); 

                }
                break;
            case 7 :
                // InternalKlangLexer.g:1:56: True
                {
                mTrue(); 

                }
                break;
            case 8 :
                // InternalKlangLexer.g:1:61: When
                {
                mWhen(); 

                }
                break;
            case 9 :
                // InternalKlangLexer.g:1:66: And
                {
                mAnd(); 

                }
                break;
            case 10 :
                // InternalKlangLexer.g:1:70: Not
                {
                mNot(); 

                }
                break;
            case 11 :
                // InternalKlangLexer.g:1:74: Var
                {
                mVar(); 

                }
                break;
            case 12 :
                // InternalKlangLexer.g:1:78: If
                {
                mIf(); 

                }
                break;
            case 13 :
                // InternalKlangLexer.g:1:81: Or
                {
                mOr(); 

                }
                break;
            case 14 :
                // InternalKlangLexer.g:1:84: ExclamationMark
                {
                mExclamationMark(); 

                }
                break;
            case 15 :
                // InternalKlangLexer.g:1:100: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 16 :
                // InternalKlangLexer.g:1:116: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 17 :
                // InternalKlangLexer.g:1:133: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 18 :
                // InternalKlangLexer.g:1:142: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 19 :
                // InternalKlangLexer.g:1:151: Comma
                {
                mComma(); 

                }
                break;
            case 20 :
                // InternalKlangLexer.g:1:157: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 21 :
                // InternalKlangLexer.g:1:169: Solidus
                {
                mSolidus(); 

                }
                break;
            case 22 :
                // InternalKlangLexer.g:1:177: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 23 :
                // InternalKlangLexer.g:1:190: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 24 :
                // InternalKlangLexer.g:1:201: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 25 :
                // InternalKlangLexer.g:1:217: RULE_NUMERIC
                {
                mRULE_NUMERIC(); 

                }
                break;
            case 26 :
                // InternalKlangLexer.g:1:230: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 27 :
                // InternalKlangLexer.g:1:238: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 28 :
                // InternalKlangLexer.g:1:247: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 29 :
                // InternalKlangLexer.g:1:259: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 30 :
                // InternalKlangLexer.g:1:275: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 31 :
                // InternalKlangLexer.g:1:291: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 32 :
                // InternalKlangLexer.g:1:299: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\13\37\7\uffff\1\64\3\uffff\1\70\1\35\1\uffff\2\35\2\uffff\1\37\1\uffff\11\37\1\107\1\110\16\uffff\1\70\2\uffff\10\37\1\121\1\122\1\123\2\uffff\5\37\1\131\1\37\1\133\3\uffff\2\37\1\136\1\37\1\140\1\uffff\1\141\1\uffff\2\37\1\uffff\1\144\2\uffff\1\37\1\146\1\uffff\1\37\1\uffff\3\37\1\153\1\uffff";
    static final String DFA13_eofS =
        "\154\uffff";
    static final String DFA13_minS =
        "\1\0\1\101\1\141\1\160\1\150\1\151\1\162\1\156\1\157\1\141\1\146\1\162\7\uffff\1\52\3\uffff\1\60\1\101\1\uffff\2\0\2\uffff\1\115\1\uffff\1\162\1\154\1\162\2\145\1\165\1\144\1\164\1\162\2\60\16\uffff\1\60\2\uffff\1\105\1\145\1\163\1\151\1\154\1\156\1\154\1\145\3\60\2\uffff\1\137\1\166\1\145\1\164\1\145\1\60\1\144\1\60\3\uffff\1\123\1\145\1\60\1\145\1\60\1\uffff\1\60\1\uffff\1\124\1\162\1\uffff\1\60\2\uffff\1\101\1\60\1\uffff\1\122\1\uffff\1\124\1\105\1\104\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\101\1\157\1\160\1\150\1\151\1\162\1\156\1\157\1\141\1\146\1\162\7\uffff\1\57\3\uffff\1\71\1\172\1\uffff\2\uffff\2\uffff\1\115\1\uffff\1\162\1\154\1\162\1\151\1\145\1\165\1\144\1\164\1\162\2\172\16\uffff\1\71\2\uffff\1\105\1\145\1\163\1\151\1\154\1\156\1\154\1\145\3\172\2\uffff\1\137\1\166\1\145\1\164\1\145\1\172\1\144\1\172\3\uffff\1\123\1\145\1\172\1\145\1\172\1\uffff\1\172\1\uffff\1\124\1\162\1\uffff\1\172\2\uffff\1\101\1\172\1\uffff\1\122\1\uffff\1\124\1\105\1\104\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\14\uffff\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\uffff\1\26\1\27\1\30\2\uffff\1\32\2\uffff\1\37\1\40\1\uffff\1\32\13\uffff\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\35\1\36\1\25\1\26\1\27\1\30\1\31\1\uffff\1\34\1\37\13\uffff\1\14\1\15\10\uffff\1\11\1\12\1\13\5\uffff\1\10\1\uffff\1\7\2\uffff\1\4\1\uffff\1\5\1\6\2\uffff\1\3\1\uffff\1\2\4\uffff\1\1";
    static final String DFA13_specialS =
        "\1\2\31\uffff\1\1\1\0\120\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\35\2\34\2\35\1\34\22\35\1\34\1\14\1\32\4\35\1\33\1\15\1\16\1\17\1\20\1\21\1\22\1\35\1\23\12\27\2\35\1\24\1\25\1\26\2\35\6\31\1\1\23\31\3\35\1\30\1\31\1\35\1\7\4\31\1\2\2\31\1\12\4\31\1\10\1\13\3\31\1\3\1\6\1\31\1\11\1\4\1\31\1\5\1\31\uff85\35",
            "\1\36",
            "\1\41\15\uffff\1\40",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\62\4\uffff\1\63",
            "",
            "",
            "",
            "\12\71",
            "\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\0\72",
            "\0\72",
            "",
            "",
            "\1\74",
            "",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\101\3\uffff\1\100",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
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
            "\12\71",
            "",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\132",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "",
            "\1\134",
            "\1\135",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\137",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\142",
            "\1\143",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\1\145",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\147",
            "",
            "\1\150",
            "\1\151",
            "\1\152",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( GAME_STARTED | Forever | Sprite | False | While | Yield | True | When | And | Not | Var | If | Or | ExclamationMark | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | Solidus | LessThanSign | EqualsSign | GreaterThanSign | RULE_NUMERIC | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_27 = input.LA(1);

                        s = -1;
                        if ( ((LA13_27>='\u0000' && LA13_27<='\uFFFF')) ) {s = 58;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_26 = input.LA(1);

                        s = -1;
                        if ( ((LA13_26>='\u0000' && LA13_26<='\uFFFF')) ) {s = 58;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='G') ) {s = 1;}

                        else if ( (LA13_0=='f') ) {s = 2;}

                        else if ( (LA13_0=='s') ) {s = 3;}

                        else if ( (LA13_0=='w') ) {s = 4;}

                        else if ( (LA13_0=='y') ) {s = 5;}

                        else if ( (LA13_0=='t') ) {s = 6;}

                        else if ( (LA13_0=='a') ) {s = 7;}

                        else if ( (LA13_0=='n') ) {s = 8;}

                        else if ( (LA13_0=='v') ) {s = 9;}

                        else if ( (LA13_0=='i') ) {s = 10;}

                        else if ( (LA13_0=='o') ) {s = 11;}

                        else if ( (LA13_0=='!') ) {s = 12;}

                        else if ( (LA13_0=='(') ) {s = 13;}

                        else if ( (LA13_0==')') ) {s = 14;}

                        else if ( (LA13_0=='*') ) {s = 15;}

                        else if ( (LA13_0=='+') ) {s = 16;}

                        else if ( (LA13_0==',') ) {s = 17;}

                        else if ( (LA13_0=='-') ) {s = 18;}

                        else if ( (LA13_0=='/') ) {s = 19;}

                        else if ( (LA13_0=='<') ) {s = 20;}

                        else if ( (LA13_0=='=') ) {s = 21;}

                        else if ( (LA13_0=='>') ) {s = 22;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 23;}

                        else if ( (LA13_0=='^') ) {s = 24;}

                        else if ( ((LA13_0>='A' && LA13_0<='F')||(LA13_0>='H' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='b' && LA13_0<='e')||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='m')||(LA13_0>='p' && LA13_0<='r')||LA13_0=='u'||LA13_0=='x'||LA13_0=='z') ) {s = 25;}

                        else if ( (LA13_0=='\"') ) {s = 26;}

                        else if ( (LA13_0=='\'') ) {s = 27;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 28;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||(LA13_0>='#' && LA13_0<='&')||LA13_0=='.'||(LA13_0>=':' && LA13_0<=';')||(LA13_0>='?' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}