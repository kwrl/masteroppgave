package com.kaurel.klang.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.kaurel.klang.xtext.services.KlangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKlangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "GAME_STARTED", "Forever", "Sprite", "False", "While", "Yield", "True", "When", "And", "Not", "Var", "If", "Or", "ExclamationMark", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "Solidus", "LessThanSign", "EqualsSign", "GreaterThanSign", "RULE_BEGIN", "RULE_END", "RULE_NUMERIC", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
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


        public InternalKlangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKlangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKlangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalKlangParser.g"; }



     	private KlangGrammarAccess grammarAccess;

        public InternalKlangParser(TokenStream input, KlangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GameDef";
       	}

       	@Override
       	protected KlangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGameDef"
    // InternalKlangParser.g:58:1: entryRuleGameDef returns [EObject current=null] : iv_ruleGameDef= ruleGameDef EOF ;
    public final EObject entryRuleGameDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGameDef = null;


        try {
            // InternalKlangParser.g:58:48: (iv_ruleGameDef= ruleGameDef EOF )
            // InternalKlangParser.g:59:2: iv_ruleGameDef= ruleGameDef EOF
            {
             newCompositeNode(grammarAccess.getGameDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGameDef=ruleGameDef();

            state._fsp--;

             current =iv_ruleGameDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGameDef"


    // $ANTLR start "ruleGameDef"
    // InternalKlangParser.g:65:1: ruleGameDef returns [EObject current=null] : ( () ( (lv_variables_1_0= ruleVariable ) )* ( (lv_actorDefs_2_0= ruleSpriteDef ) )* ) ;
    public final EObject ruleGameDef() throws RecognitionException {
        EObject current = null;

        EObject lv_variables_1_0 = null;

        EObject lv_actorDefs_2_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:71:2: ( ( () ( (lv_variables_1_0= ruleVariable ) )* ( (lv_actorDefs_2_0= ruleSpriteDef ) )* ) )
            // InternalKlangParser.g:72:2: ( () ( (lv_variables_1_0= ruleVariable ) )* ( (lv_actorDefs_2_0= ruleSpriteDef ) )* )
            {
            // InternalKlangParser.g:72:2: ( () ( (lv_variables_1_0= ruleVariable ) )* ( (lv_actorDefs_2_0= ruleSpriteDef ) )* )
            // InternalKlangParser.g:73:3: () ( (lv_variables_1_0= ruleVariable ) )* ( (lv_actorDefs_2_0= ruleSpriteDef ) )*
            {
            // InternalKlangParser.g:73:3: ()
            // InternalKlangParser.g:74:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGameDefAccess().getGameDefAction_0(),
            					current);
            			

            }

            // InternalKlangParser.g:80:3: ( (lv_variables_1_0= ruleVariable ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Var) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKlangParser.g:81:4: (lv_variables_1_0= ruleVariable )
            	    {
            	    // InternalKlangParser.g:81:4: (lv_variables_1_0= ruleVariable )
            	    // InternalKlangParser.g:82:5: lv_variables_1_0= ruleVariable
            	    {

            	    					newCompositeNode(grammarAccess.getGameDefAccess().getVariablesVariableParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_variables_1_0=ruleVariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGameDefRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variables",
            	    						lv_variables_1_0,
            	    						"com.kaurel.klang.xtext.Klang.Variable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalKlangParser.g:99:3: ( (lv_actorDefs_2_0= ruleSpriteDef ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Sprite) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalKlangParser.g:100:4: (lv_actorDefs_2_0= ruleSpriteDef )
            	    {
            	    // InternalKlangParser.g:100:4: (lv_actorDefs_2_0= ruleSpriteDef )
            	    // InternalKlangParser.g:101:5: lv_actorDefs_2_0= ruleSpriteDef
            	    {

            	    					newCompositeNode(grammarAccess.getGameDefAccess().getActorDefsSpriteDefParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_actorDefs_2_0=ruleSpriteDef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGameDefRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actorDefs",
            	    						lv_actorDefs_2_0,
            	    						"com.kaurel.klang.xtext.Klang.SpriteDef");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGameDef"


    // $ANTLR start "entryRuleSpriteDef"
    // InternalKlangParser.g:122:1: entryRuleSpriteDef returns [EObject current=null] : iv_ruleSpriteDef= ruleSpriteDef EOF ;
    public final EObject entryRuleSpriteDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpriteDef = null;


        try {
            // InternalKlangParser.g:122:50: (iv_ruleSpriteDef= ruleSpriteDef EOF )
            // InternalKlangParser.g:123:2: iv_ruleSpriteDef= ruleSpriteDef EOF
            {
             newCompositeNode(grammarAccess.getSpriteDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpriteDef=ruleSpriteDef();

            state._fsp--;

             current =iv_ruleSpriteDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpriteDef"


    // $ANTLR start "ruleSpriteDef"
    // InternalKlangParser.g:129:1: ruleSpriteDef returns [EObject current=null] : ( () otherlv_1= Sprite ( (lv_name_2_0= RULE_ID ) ) this_BEGIN_3= RULE_BEGIN ( (lv_variables_4_0= ruleVariable ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* this_END_6= RULE_END ) ;
    public final EObject ruleSpriteDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_BEGIN_3=null;
        Token this_END_6=null;
        EObject lv_variables_4_0 = null;

        EObject lv_eventHandlers_5_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:135:2: ( ( () otherlv_1= Sprite ( (lv_name_2_0= RULE_ID ) ) this_BEGIN_3= RULE_BEGIN ( (lv_variables_4_0= ruleVariable ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* this_END_6= RULE_END ) )
            // InternalKlangParser.g:136:2: ( () otherlv_1= Sprite ( (lv_name_2_0= RULE_ID ) ) this_BEGIN_3= RULE_BEGIN ( (lv_variables_4_0= ruleVariable ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* this_END_6= RULE_END )
            {
            // InternalKlangParser.g:136:2: ( () otherlv_1= Sprite ( (lv_name_2_0= RULE_ID ) ) this_BEGIN_3= RULE_BEGIN ( (lv_variables_4_0= ruleVariable ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* this_END_6= RULE_END )
            // InternalKlangParser.g:137:3: () otherlv_1= Sprite ( (lv_name_2_0= RULE_ID ) ) this_BEGIN_3= RULE_BEGIN ( (lv_variables_4_0= ruleVariable ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* this_END_6= RULE_END
            {
            // InternalKlangParser.g:137:3: ()
            // InternalKlangParser.g:138:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSpriteDefAccess().getSpriteDefAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Sprite,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSpriteDefAccess().getSpriteKeyword_1());
            		
            // InternalKlangParser.g:148:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalKlangParser.g:149:4: (lv_name_2_0= RULE_ID )
            {
            // InternalKlangParser.g:149:4: (lv_name_2_0= RULE_ID )
            // InternalKlangParser.g:150:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSpriteDefAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpriteDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_7); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getSpriteDefAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalKlangParser.g:170:3: ( (lv_variables_4_0= ruleVariable ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==Var) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalKlangParser.g:171:4: (lv_variables_4_0= ruleVariable )
            	    {
            	    // InternalKlangParser.g:171:4: (lv_variables_4_0= ruleVariable )
            	    // InternalKlangParser.g:172:5: lv_variables_4_0= ruleVariable
            	    {

            	    					newCompositeNode(grammarAccess.getSpriteDefAccess().getVariablesVariableParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_variables_4_0=ruleVariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpriteDefRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variables",
            	    						lv_variables_4_0,
            	    						"com.kaurel.klang.xtext.Klang.Variable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalKlangParser.g:189:3: ( (lv_eventHandlers_5_0= ruleEventHandler ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==When) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKlangParser.g:190:4: (lv_eventHandlers_5_0= ruleEventHandler )
            	    {
            	    // InternalKlangParser.g:190:4: (lv_eventHandlers_5_0= ruleEventHandler )
            	    // InternalKlangParser.g:191:5: lv_eventHandlers_5_0= ruleEventHandler
            	    {

            	    					newCompositeNode(grammarAccess.getSpriteDefAccess().getEventHandlersEventHandlerParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_eventHandlers_5_0=ruleEventHandler();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpriteDefRule());
            	    					}
            	    					add(
            	    						current,
            	    						"eventHandlers",
            	    						lv_eventHandlers_5_0,
            	    						"com.kaurel.klang.xtext.Klang.EventHandler");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_6, grammarAccess.getSpriteDefAccess().getENDTerminalRuleCall_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpriteDef"


    // $ANTLR start "entryRuleEventHandler"
    // InternalKlangParser.g:216:1: entryRuleEventHandler returns [EObject current=null] : iv_ruleEventHandler= ruleEventHandler EOF ;
    public final EObject entryRuleEventHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventHandler = null;


        try {
            // InternalKlangParser.g:216:53: (iv_ruleEventHandler= ruleEventHandler EOF )
            // InternalKlangParser.g:217:2: iv_ruleEventHandler= ruleEventHandler EOF
            {
             newCompositeNode(grammarAccess.getEventHandlerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventHandler=ruleEventHandler();

            state._fsp--;

             current =iv_ruleEventHandler; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventHandler"


    // $ANTLR start "ruleEventHandler"
    // InternalKlangParser.g:223:1: ruleEventHandler returns [EObject current=null] : (otherlv_0= When ( (lv_eventType_1_0= ruleEventType ) ) this_BEGIN_2= RULE_BEGIN ( (lv_statements_3_0= ruleStatement ) )* this_END_4= RULE_END ) ;
    public final EObject ruleEventHandler() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        Enumerator lv_eventType_1_0 = null;

        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:229:2: ( (otherlv_0= When ( (lv_eventType_1_0= ruleEventType ) ) this_BEGIN_2= RULE_BEGIN ( (lv_statements_3_0= ruleStatement ) )* this_END_4= RULE_END ) )
            // InternalKlangParser.g:230:2: (otherlv_0= When ( (lv_eventType_1_0= ruleEventType ) ) this_BEGIN_2= RULE_BEGIN ( (lv_statements_3_0= ruleStatement ) )* this_END_4= RULE_END )
            {
            // InternalKlangParser.g:230:2: (otherlv_0= When ( (lv_eventType_1_0= ruleEventType ) ) this_BEGIN_2= RULE_BEGIN ( (lv_statements_3_0= ruleStatement ) )* this_END_4= RULE_END )
            // InternalKlangParser.g:231:3: otherlv_0= When ( (lv_eventType_1_0= ruleEventType ) ) this_BEGIN_2= RULE_BEGIN ( (lv_statements_3_0= ruleStatement ) )* this_END_4= RULE_END
            {
            otherlv_0=(Token)match(input,When,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getEventHandlerAccess().getWhenKeyword_0());
            		
            // InternalKlangParser.g:235:3: ( (lv_eventType_1_0= ruleEventType ) )
            // InternalKlangParser.g:236:4: (lv_eventType_1_0= ruleEventType )
            {
            // InternalKlangParser.g:236:4: (lv_eventType_1_0= ruleEventType )
            // InternalKlangParser.g:237:5: lv_eventType_1_0= ruleEventType
            {

            					newCompositeNode(grammarAccess.getEventHandlerAccess().getEventTypeEventTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_eventType_1_0=ruleEventType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventHandlerRule());
            					}
            					set(
            						current,
            						"eventType",
            						lv_eventType_1_0,
            						"com.kaurel.klang.xtext.Klang.EventType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_10); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getEventHandlerAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalKlangParser.g:258:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==Forever||(LA5_0>=While && LA5_0<=Yield)||(LA5_0>=Var && LA5_0<=If)||LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalKlangParser.g:259:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalKlangParser.g:259:4: (lv_statements_3_0= ruleStatement )
            	    // InternalKlangParser.g:260:5: lv_statements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getEventHandlerAccess().getStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_statements_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEventHandlerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_3_0,
            	    						"com.kaurel.klang.xtext.Klang.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getEventHandlerAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventHandler"


    // $ANTLR start "entryRuleWhileLoop"
    // InternalKlangParser.g:285:1: entryRuleWhileLoop returns [EObject current=null] : iv_ruleWhileLoop= ruleWhileLoop EOF ;
    public final EObject entryRuleWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileLoop = null;


        try {
            // InternalKlangParser.g:285:50: (iv_ruleWhileLoop= ruleWhileLoop EOF )
            // InternalKlangParser.g:286:2: iv_ruleWhileLoop= ruleWhileLoop EOF
            {
             newCompositeNode(grammarAccess.getWhileLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhileLoop=ruleWhileLoop();

            state._fsp--;

             current =iv_ruleWhileLoop; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhileLoop"


    // $ANTLR start "ruleWhileLoop"
    // InternalKlangParser.g:292:1: ruleWhileLoop returns [EObject current=null] : ( () otherlv_1= While ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_loopBlock_4_0= ruleStatement ) )* this_END_5= RULE_END ) ;
    public final EObject ruleWhileLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        EObject lv_predicate_2_0 = null;

        EObject lv_loopBlock_4_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:298:2: ( ( () otherlv_1= While ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_loopBlock_4_0= ruleStatement ) )* this_END_5= RULE_END ) )
            // InternalKlangParser.g:299:2: ( () otherlv_1= While ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_loopBlock_4_0= ruleStatement ) )* this_END_5= RULE_END )
            {
            // InternalKlangParser.g:299:2: ( () otherlv_1= While ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_loopBlock_4_0= ruleStatement ) )* this_END_5= RULE_END )
            // InternalKlangParser.g:300:3: () otherlv_1= While ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_loopBlock_4_0= ruleStatement ) )* this_END_5= RULE_END
            {
            // InternalKlangParser.g:300:3: ()
            // InternalKlangParser.g:301:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWhileLoopAccess().getWhileLoopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,While,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getWhileLoopAccess().getWhileKeyword_1());
            		
            // InternalKlangParser.g:311:3: ( (lv_predicate_2_0= ruleExpression ) )
            // InternalKlangParser.g:312:4: (lv_predicate_2_0= ruleExpression )
            {
            // InternalKlangParser.g:312:4: (lv_predicate_2_0= ruleExpression )
            // InternalKlangParser.g:313:5: lv_predicate_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhileLoopAccess().getPredicateExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_predicate_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileLoopRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_2_0,
            						"com.kaurel.klang.xtext.Klang.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_10); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getWhileLoopAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalKlangParser.g:334:3: ( (lv_loopBlock_4_0= ruleStatement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==Forever||(LA6_0>=While && LA6_0<=Yield)||(LA6_0>=Var && LA6_0<=If)||LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalKlangParser.g:335:4: (lv_loopBlock_4_0= ruleStatement )
            	    {
            	    // InternalKlangParser.g:335:4: (lv_loopBlock_4_0= ruleStatement )
            	    // InternalKlangParser.g:336:5: lv_loopBlock_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getWhileLoopAccess().getLoopBlockStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_loopBlock_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWhileLoopRule());
            	    					}
            	    					add(
            	    						current,
            	    						"loopBlock",
            	    						lv_loopBlock_4_0,
            	    						"com.kaurel.klang.xtext.Klang.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_5, grammarAccess.getWhileLoopAccess().getENDTerminalRuleCall_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhileLoop"


    // $ANTLR start "entryRuleIf"
    // InternalKlangParser.g:361:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalKlangParser.g:361:43: (iv_ruleIf= ruleIf EOF )
            // InternalKlangParser.g:362:2: iv_ruleIf= ruleIf EOF
            {
             newCompositeNode(grammarAccess.getIfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIf=ruleIf();

            state._fsp--;

             current =iv_ruleIf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalKlangParser.g:368:1: ruleIf returns [EObject current=null] : ( () otherlv_1= If ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_ifBlock_4_0= ruleStatement ) )* this_END_5= RULE_END ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        EObject lv_predicate_2_0 = null;

        EObject lv_ifBlock_4_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:374:2: ( ( () otherlv_1= If ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_ifBlock_4_0= ruleStatement ) )* this_END_5= RULE_END ) )
            // InternalKlangParser.g:375:2: ( () otherlv_1= If ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_ifBlock_4_0= ruleStatement ) )* this_END_5= RULE_END )
            {
            // InternalKlangParser.g:375:2: ( () otherlv_1= If ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_ifBlock_4_0= ruleStatement ) )* this_END_5= RULE_END )
            // InternalKlangParser.g:376:3: () otherlv_1= If ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_ifBlock_4_0= ruleStatement ) )* this_END_5= RULE_END
            {
            // InternalKlangParser.g:376:3: ()
            // InternalKlangParser.g:377:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIfAccess().getIfAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,If,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getIfAccess().getIfKeyword_1());
            		
            // InternalKlangParser.g:387:3: ( (lv_predicate_2_0= ruleExpression ) )
            // InternalKlangParser.g:388:4: (lv_predicate_2_0= ruleExpression )
            {
            // InternalKlangParser.g:388:4: (lv_predicate_2_0= ruleExpression )
            // InternalKlangParser.g:389:5: lv_predicate_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfAccess().getPredicateExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_predicate_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_2_0,
            						"com.kaurel.klang.xtext.Klang.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_10); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getIfAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalKlangParser.g:410:3: ( (lv_ifBlock_4_0= ruleStatement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Forever||(LA7_0>=While && LA7_0<=Yield)||(LA7_0>=Var && LA7_0<=If)||LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalKlangParser.g:411:4: (lv_ifBlock_4_0= ruleStatement )
            	    {
            	    // InternalKlangParser.g:411:4: (lv_ifBlock_4_0= ruleStatement )
            	    // InternalKlangParser.g:412:5: lv_ifBlock_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getIfAccess().getIfBlockStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_ifBlock_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIfRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ifBlock",
            	    						lv_ifBlock_4_0,
            	    						"com.kaurel.klang.xtext.Klang.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_5, grammarAccess.getIfAccess().getENDTerminalRuleCall_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleForeverLoop"
    // InternalKlangParser.g:437:1: entryRuleForeverLoop returns [EObject current=null] : iv_ruleForeverLoop= ruleForeverLoop EOF ;
    public final EObject entryRuleForeverLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeverLoop = null;


        try {
            // InternalKlangParser.g:437:52: (iv_ruleForeverLoop= ruleForeverLoop EOF )
            // InternalKlangParser.g:438:2: iv_ruleForeverLoop= ruleForeverLoop EOF
            {
             newCompositeNode(grammarAccess.getForeverLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForeverLoop=ruleForeverLoop();

            state._fsp--;

             current =iv_ruleForeverLoop; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForeverLoop"


    // $ANTLR start "ruleForeverLoop"
    // InternalKlangParser.g:444:1: ruleForeverLoop returns [EObject current=null] : ( () otherlv_1= Forever this_BEGIN_2= RULE_BEGIN ( (lv_loopStatements_3_0= ruleStatement ) )* this_END_4= RULE_END ) ;
    public final EObject ruleForeverLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_loopStatements_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:450:2: ( ( () otherlv_1= Forever this_BEGIN_2= RULE_BEGIN ( (lv_loopStatements_3_0= ruleStatement ) )* this_END_4= RULE_END ) )
            // InternalKlangParser.g:451:2: ( () otherlv_1= Forever this_BEGIN_2= RULE_BEGIN ( (lv_loopStatements_3_0= ruleStatement ) )* this_END_4= RULE_END )
            {
            // InternalKlangParser.g:451:2: ( () otherlv_1= Forever this_BEGIN_2= RULE_BEGIN ( (lv_loopStatements_3_0= ruleStatement ) )* this_END_4= RULE_END )
            // InternalKlangParser.g:452:3: () otherlv_1= Forever this_BEGIN_2= RULE_BEGIN ( (lv_loopStatements_3_0= ruleStatement ) )* this_END_4= RULE_END
            {
            // InternalKlangParser.g:452:3: ()
            // InternalKlangParser.g:453:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getForeverLoopAccess().getForeverLoopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Forever,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getForeverLoopAccess().getForeverKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_10); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getForeverLoopAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalKlangParser.g:467:3: ( (lv_loopStatements_3_0= ruleStatement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Forever||(LA8_0>=While && LA8_0<=Yield)||(LA8_0>=Var && LA8_0<=If)||LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKlangParser.g:468:4: (lv_loopStatements_3_0= ruleStatement )
            	    {
            	    // InternalKlangParser.g:468:4: (lv_loopStatements_3_0= ruleStatement )
            	    // InternalKlangParser.g:469:5: lv_loopStatements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getForeverLoopAccess().getLoopStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_loopStatements_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getForeverLoopRule());
            	    					}
            	    					add(
            	    						current,
            	    						"loopStatements",
            	    						lv_loopStatements_3_0,
            	    						"com.kaurel.klang.xtext.Klang.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getForeverLoopAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForeverLoop"


    // $ANTLR start "entryRuleStatement"
    // InternalKlangParser.g:494:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalKlangParser.g:494:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalKlangParser.g:495:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalKlangParser.g:501:1: ruleStatement returns [EObject current=null] : (this_ControlStatement_0= ruleControlStatement | this_Variable_1= ruleVariable | this_Assignment_2= ruleAssignment | this_SubroutineCall_3= ruleSubroutineCall ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_ControlStatement_0 = null;

        EObject this_Variable_1 = null;

        EObject this_Assignment_2 = null;

        EObject this_SubroutineCall_3 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:507:2: ( (this_ControlStatement_0= ruleControlStatement | this_Variable_1= ruleVariable | this_Assignment_2= ruleAssignment | this_SubroutineCall_3= ruleSubroutineCall ) )
            // InternalKlangParser.g:508:2: (this_ControlStatement_0= ruleControlStatement | this_Variable_1= ruleVariable | this_Assignment_2= ruleAssignment | this_SubroutineCall_3= ruleSubroutineCall )
            {
            // InternalKlangParser.g:508:2: (this_ControlStatement_0= ruleControlStatement | this_Variable_1= ruleVariable | this_Assignment_2= ruleAssignment | this_SubroutineCall_3= ruleSubroutineCall )
            int alt9=4;
            switch ( input.LA(1) ) {
            case Forever:
            case While:
            case Yield:
            case If:
                {
                alt9=1;
                }
                break;
            case Var:
                {
                alt9=2;
                }
                break;
            case RULE_ID:
                {
                int LA9_3 = input.LA(2);

                if ( (LA9_3==EqualsSign) ) {
                    alt9=3;
                }
                else if ( (LA9_3==LeftParenthesis) ) {
                    alt9=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalKlangParser.g:509:3: this_ControlStatement_0= ruleControlStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getControlStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ControlStatement_0=ruleControlStatement();

                    state._fsp--;


                    			current = this_ControlStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKlangParser.g:518:3: this_Variable_1= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_1=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalKlangParser.g:527:3: this_Assignment_2= ruleAssignment
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Assignment_2=ruleAssignment();

                    state._fsp--;


                    			current = this_Assignment_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalKlangParser.g:536:3: this_SubroutineCall_3= ruleSubroutineCall
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSubroutineCallParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SubroutineCall_3=ruleSubroutineCall();

                    state._fsp--;


                    			current = this_SubroutineCall_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleSubroutineCall"
    // InternalKlangParser.g:548:1: entryRuleSubroutineCall returns [EObject current=null] : iv_ruleSubroutineCall= ruleSubroutineCall EOF ;
    public final EObject entryRuleSubroutineCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubroutineCall = null;


        try {
            // InternalKlangParser.g:548:55: (iv_ruleSubroutineCall= ruleSubroutineCall EOF )
            // InternalKlangParser.g:549:2: iv_ruleSubroutineCall= ruleSubroutineCall EOF
            {
             newCompositeNode(grammarAccess.getSubroutineCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubroutineCall=ruleSubroutineCall();

            state._fsp--;

             current =iv_ruleSubroutineCall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubroutineCall"


    // $ANTLR start "ruleSubroutineCall"
    // InternalKlangParser.g:555:1: ruleSubroutineCall returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_parameters_2_0= ruleExpression ) )? (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )* otherlv_5= RightParenthesis ) ;
    public final EObject ruleSubroutineCall() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:561:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_parameters_2_0= ruleExpression ) )? (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )* otherlv_5= RightParenthesis ) )
            // InternalKlangParser.g:562:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_parameters_2_0= ruleExpression ) )? (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )* otherlv_5= RightParenthesis )
            {
            // InternalKlangParser.g:562:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_parameters_2_0= ruleExpression ) )? (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )* otherlv_5= RightParenthesis )
            // InternalKlangParser.g:563:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_parameters_2_0= ruleExpression ) )? (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )* otherlv_5= RightParenthesis
            {
            // InternalKlangParser.g:563:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalKlangParser.g:564:4: (lv_name_0_0= RULE_ID )
            {
            // InternalKlangParser.g:564:4: (lv_name_0_0= RULE_ID )
            // InternalKlangParser.g:565:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSubroutineCallAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubroutineCallRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getSubroutineCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalKlangParser.g:585:3: ( (lv_parameters_2_0= ruleExpression ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==False||LA10_0==True||LA10_0==Not||(LA10_0>=ExclamationMark && LA10_0<=LeftParenthesis)||(LA10_0>=RULE_NUMERIC && LA10_0<=RULE_ID)||LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalKlangParser.g:586:4: (lv_parameters_2_0= ruleExpression )
                    {
                    // InternalKlangParser.g:586:4: (lv_parameters_2_0= ruleExpression )
                    // InternalKlangParser.g:587:5: lv_parameters_2_0= ruleExpression
                    {

                    					newCompositeNode(grammarAccess.getSubroutineCallAccess().getParametersExpressionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_parameters_2_0=ruleExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSubroutineCallRule());
                    					}
                    					add(
                    						current,
                    						"parameters",
                    						lv_parameters_2_0,
                    						"com.kaurel.klang.xtext.Klang.Expression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalKlangParser.g:604:3: (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==Comma) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalKlangParser.g:605:4: otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_11); 

            	    				newLeafNode(otherlv_3, grammarAccess.getSubroutineCallAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalKlangParser.g:609:4: ( (lv_parameters_4_0= ruleExpression ) )
            	    // InternalKlangParser.g:610:5: (lv_parameters_4_0= ruleExpression )
            	    {
            	    // InternalKlangParser.g:610:5: (lv_parameters_4_0= ruleExpression )
            	    // InternalKlangParser.g:611:6: lv_parameters_4_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getSubroutineCallAccess().getParametersExpressionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_parameters_4_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubroutineCallRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_4_0,
            	    							"com.kaurel.klang.xtext.Klang.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSubroutineCallAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubroutineCall"


    // $ANTLR start "entryRuleControlStatement"
    // InternalKlangParser.g:637:1: entryRuleControlStatement returns [EObject current=null] : iv_ruleControlStatement= ruleControlStatement EOF ;
    public final EObject entryRuleControlStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlStatement = null;


        try {
            // InternalKlangParser.g:637:57: (iv_ruleControlStatement= ruleControlStatement EOF )
            // InternalKlangParser.g:638:2: iv_ruleControlStatement= ruleControlStatement EOF
            {
             newCompositeNode(grammarAccess.getControlStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleControlStatement=ruleControlStatement();

            state._fsp--;

             current =iv_ruleControlStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleControlStatement"


    // $ANTLR start "ruleControlStatement"
    // InternalKlangParser.g:644:1: ruleControlStatement returns [EObject current=null] : (this_ForeverLoop_0= ruleForeverLoop | this_WhileLoop_1= ruleWhileLoop | this_Yield_2= ruleYield | this_If_3= ruleIf ) ;
    public final EObject ruleControlStatement() throws RecognitionException {
        EObject current = null;

        EObject this_ForeverLoop_0 = null;

        EObject this_WhileLoop_1 = null;

        EObject this_Yield_2 = null;

        EObject this_If_3 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:650:2: ( (this_ForeverLoop_0= ruleForeverLoop | this_WhileLoop_1= ruleWhileLoop | this_Yield_2= ruleYield | this_If_3= ruleIf ) )
            // InternalKlangParser.g:651:2: (this_ForeverLoop_0= ruleForeverLoop | this_WhileLoop_1= ruleWhileLoop | this_Yield_2= ruleYield | this_If_3= ruleIf )
            {
            // InternalKlangParser.g:651:2: (this_ForeverLoop_0= ruleForeverLoop | this_WhileLoop_1= ruleWhileLoop | this_Yield_2= ruleYield | this_If_3= ruleIf )
            int alt12=4;
            switch ( input.LA(1) ) {
            case Forever:
                {
                alt12=1;
                }
                break;
            case While:
                {
                alt12=2;
                }
                break;
            case Yield:
                {
                alt12=3;
                }
                break;
            case If:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalKlangParser.g:652:3: this_ForeverLoop_0= ruleForeverLoop
                    {

                    			newCompositeNode(grammarAccess.getControlStatementAccess().getForeverLoopParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForeverLoop_0=ruleForeverLoop();

                    state._fsp--;


                    			current = this_ForeverLoop_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKlangParser.g:661:3: this_WhileLoop_1= ruleWhileLoop
                    {

                    			newCompositeNode(grammarAccess.getControlStatementAccess().getWhileLoopParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WhileLoop_1=ruleWhileLoop();

                    state._fsp--;


                    			current = this_WhileLoop_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalKlangParser.g:670:3: this_Yield_2= ruleYield
                    {

                    			newCompositeNode(grammarAccess.getControlStatementAccess().getYieldParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Yield_2=ruleYield();

                    state._fsp--;


                    			current = this_Yield_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalKlangParser.g:679:3: this_If_3= ruleIf
                    {

                    			newCompositeNode(grammarAccess.getControlStatementAccess().getIfParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_If_3=ruleIf();

                    state._fsp--;


                    			current = this_If_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleControlStatement"


    // $ANTLR start "entryRuleYield"
    // InternalKlangParser.g:691:1: entryRuleYield returns [EObject current=null] : iv_ruleYield= ruleYield EOF ;
    public final EObject entryRuleYield() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYield = null;


        try {
            // InternalKlangParser.g:691:46: (iv_ruleYield= ruleYield EOF )
            // InternalKlangParser.g:692:2: iv_ruleYield= ruleYield EOF
            {
             newCompositeNode(grammarAccess.getYieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleYield=ruleYield();

            state._fsp--;

             current =iv_ruleYield; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleYield"


    // $ANTLR start "ruleYield"
    // InternalKlangParser.g:698:1: ruleYield returns [EObject current=null] : ( () otherlv_1= Yield ) ;
    public final EObject ruleYield() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKlangParser.g:704:2: ( ( () otherlv_1= Yield ) )
            // InternalKlangParser.g:705:2: ( () otherlv_1= Yield )
            {
            // InternalKlangParser.g:705:2: ( () otherlv_1= Yield )
            // InternalKlangParser.g:706:3: () otherlv_1= Yield
            {
            // InternalKlangParser.g:706:3: ()
            // InternalKlangParser.g:707:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getYieldAccess().getYieldAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Yield,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getYieldAccess().getYieldKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleYield"


    // $ANTLR start "entryRuleVariable"
    // InternalKlangParser.g:721:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalKlangParser.g:721:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalKlangParser.g:722:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalKlangParser.g:728:1: ruleVariable returns [EObject current=null] : (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_expression_3_0= ruleExpression ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:734:2: ( (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_expression_3_0= ruleExpression ) ) ) )
            // InternalKlangParser.g:735:2: (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_expression_3_0= ruleExpression ) ) )
            {
            // InternalKlangParser.g:735:2: (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_expression_3_0= ruleExpression ) ) )
            // InternalKlangParser.g:736:3: otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_expression_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,Var,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVarKeyword_0());
            		
            // InternalKlangParser.g:740:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalKlangParser.g:741:4: (lv_name_1_0= RULE_ID )
            {
            // InternalKlangParser.g:741:4: (lv_name_1_0= RULE_ID )
            // InternalKlangParser.g:742:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,EqualsSign,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getEqualsSignKeyword_2());
            		
            // InternalKlangParser.g:762:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalKlangParser.g:763:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalKlangParser.g:763:4: (lv_expression_3_0= ruleExpression )
            // InternalKlangParser.g:764:5: lv_expression_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"com.kaurel.klang.xtext.Klang.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleAssignment"
    // InternalKlangParser.g:785:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalKlangParser.g:785:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalKlangParser.g:786:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalKlangParser.g:792:1: ruleAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:798:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalKlangParser.g:799:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalKlangParser.g:799:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalKlangParser.g:800:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalKlangParser.g:800:3: ( (otherlv_0= RULE_ID ) )
            // InternalKlangParser.g:801:4: (otherlv_0= RULE_ID )
            {
            // InternalKlangParser.g:801:4: (otherlv_0= RULE_ID )
            // InternalKlangParser.g:802:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignmentRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
            		
            // InternalKlangParser.g:817:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalKlangParser.g:818:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalKlangParser.g:818:4: (lv_expression_2_0= ruleExpression )
            // InternalKlangParser.g:819:5: lv_expression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"com.kaurel.klang.xtext.Klang.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleExpression"
    // InternalKlangParser.g:840:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalKlangParser.g:840:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalKlangParser.g:841:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalKlangParser.g:847:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:853:2: (this_Or_0= ruleOr )
            // InternalKlangParser.g:854:2: this_Or_0= ruleOr
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Or_0=ruleOr();

            state._fsp--;


            		current = this_Or_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // InternalKlangParser.g:865:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalKlangParser.g:865:43: (iv_ruleOr= ruleOr EOF )
            // InternalKlangParser.g:866:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalKlangParser.g:872:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= Or ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:878:2: ( (this_And_0= ruleAnd ( () otherlv_2= Or ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalKlangParser.g:879:2: (this_And_0= ruleAnd ( () otherlv_2= Or ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalKlangParser.g:879:2: (this_And_0= ruleAnd ( () otherlv_2= Or ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalKlangParser.g:880:3: this_And_0= ruleAnd ( () otherlv_2= Or ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKlangParser.g:888:3: ( () otherlv_2= Or ( (lv_right_3_0= ruleAnd ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Or) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalKlangParser.g:889:4: () otherlv_2= Or ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalKlangParser.g:889:4: ()
            	    // InternalKlangParser.g:890:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,Or,FOLLOW_11); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getOrKeyword_1_1());
            	    			
            	    // InternalKlangParser.g:900:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalKlangParser.g:901:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalKlangParser.g:901:5: (lv_right_3_0= ruleAnd )
            	    // InternalKlangParser.g:902:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.kaurel.klang.xtext.Klang.And");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalKlangParser.g:924:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalKlangParser.g:924:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalKlangParser.g:925:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalKlangParser.g:931:1: ruleAnd returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () otherlv_2= And ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:937:2: ( (this_Comparison_0= ruleComparison ( () otherlv_2= And ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalKlangParser.g:938:2: (this_Comparison_0= ruleComparison ( () otherlv_2= And ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalKlangParser.g:938:2: (this_Comparison_0= ruleComparison ( () otherlv_2= And ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalKlangParser.g:939:3: this_Comparison_0= ruleComparison ( () otherlv_2= And ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKlangParser.g:947:3: ( () otherlv_2= And ( (lv_right_3_0= ruleComparison ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==And) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalKlangParser.g:948:4: () otherlv_2= And ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalKlangParser.g:948:4: ()
            	    // InternalKlangParser.g:949:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,And,FOLLOW_11); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAndKeyword_1_1());
            	    			
            	    // InternalKlangParser.g:959:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalKlangParser.g:960:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalKlangParser.g:960:5: (lv_right_3_0= ruleComparison )
            	    // InternalKlangParser.g:961:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.kaurel.klang.xtext.Klang.Comparison");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRulePlus"
    // InternalKlangParser.g:983:1: entryRulePlus returns [EObject current=null] : iv_rulePlus= rulePlus EOF ;
    public final EObject entryRulePlus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlus = null;


        try {
            // InternalKlangParser.g:983:45: (iv_rulePlus= rulePlus EOF )
            // InternalKlangParser.g:984:2: iv_rulePlus= rulePlus EOF
            {
             newCompositeNode(grammarAccess.getPlusRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlus=rulePlus();

            state._fsp--;

             current =iv_rulePlus; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlus"


    // $ANTLR start "rulePlus"
    // InternalKlangParser.g:990:1: rulePlus returns [EObject current=null] : (this_Minus_0= ruleMinus ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMinus ) ) )* ) ;
    public final EObject rulePlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Minus_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:996:2: ( (this_Minus_0= ruleMinus ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMinus ) ) )* ) )
            // InternalKlangParser.g:997:2: (this_Minus_0= ruleMinus ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMinus ) ) )* )
            {
            // InternalKlangParser.g:997:2: (this_Minus_0= ruleMinus ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMinus ) ) )* )
            // InternalKlangParser.g:998:3: this_Minus_0= ruleMinus ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMinus ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusAccess().getMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_Minus_0=ruleMinus();

            state._fsp--;


            			current = this_Minus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKlangParser.g:1006:3: ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMinus ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==PlusSign) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalKlangParser.g:1007:4: () otherlv_2= PlusSign ( (lv_right_3_0= ruleMinus ) )
            	    {
            	    // InternalKlangParser.g:1007:4: ()
            	    // InternalKlangParser.g:1008:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPlusAccess().getPlusLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,PlusSign,FOLLOW_11); 

            	    				newLeafNode(otherlv_2, grammarAccess.getPlusAccess().getPlusSignKeyword_1_1());
            	    			
            	    // InternalKlangParser.g:1018:4: ( (lv_right_3_0= ruleMinus ) )
            	    // InternalKlangParser.g:1019:5: (lv_right_3_0= ruleMinus )
            	    {
            	    // InternalKlangParser.g:1019:5: (lv_right_3_0= ruleMinus )
            	    // InternalKlangParser.g:1020:6: lv_right_3_0= ruleMinus
            	    {

            	    						newCompositeNode(grammarAccess.getPlusAccess().getRightMinusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_right_3_0=ruleMinus();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.kaurel.klang.xtext.Klang.Minus");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlus"


    // $ANTLR start "entryRuleMinus"
    // InternalKlangParser.g:1042:1: entryRuleMinus returns [EObject current=null] : iv_ruleMinus= ruleMinus EOF ;
    public final EObject entryRuleMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinus = null;


        try {
            // InternalKlangParser.g:1042:46: (iv_ruleMinus= ruleMinus EOF )
            // InternalKlangParser.g:1043:2: iv_ruleMinus= ruleMinus EOF
            {
             newCompositeNode(grammarAccess.getMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinus=ruleMinus();

            state._fsp--;

             current =iv_ruleMinus; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMinus"


    // $ANTLR start "ruleMinus"
    // InternalKlangParser.g:1049:1: ruleMinus returns [EObject current=null] : (this_Multiply_0= ruleMultiply ( () otherlv_2= HyphenMinus ( (lv_right_3_0= ruleMultiply ) ) )* ) ;
    public final EObject ruleMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Multiply_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1055:2: ( (this_Multiply_0= ruleMultiply ( () otherlv_2= HyphenMinus ( (lv_right_3_0= ruleMultiply ) ) )* ) )
            // InternalKlangParser.g:1056:2: (this_Multiply_0= ruleMultiply ( () otherlv_2= HyphenMinus ( (lv_right_3_0= ruleMultiply ) ) )* )
            {
            // InternalKlangParser.g:1056:2: (this_Multiply_0= ruleMultiply ( () otherlv_2= HyphenMinus ( (lv_right_3_0= ruleMultiply ) ) )* )
            // InternalKlangParser.g:1057:3: this_Multiply_0= ruleMultiply ( () otherlv_2= HyphenMinus ( (lv_right_3_0= ruleMultiply ) ) )*
            {

            			newCompositeNode(grammarAccess.getMinusAccess().getMultiplyParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_Multiply_0=ruleMultiply();

            state._fsp--;


            			current = this_Multiply_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKlangParser.g:1065:3: ( () otherlv_2= HyphenMinus ( (lv_right_3_0= ruleMultiply ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==HyphenMinus) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalKlangParser.g:1066:4: () otherlv_2= HyphenMinus ( (lv_right_3_0= ruleMultiply ) )
            	    {
            	    // InternalKlangParser.g:1066:4: ()
            	    // InternalKlangParser.g:1067:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMinusAccess().getMinusLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,HyphenMinus,FOLLOW_11); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMinusAccess().getHyphenMinusKeyword_1_1());
            	    			
            	    // InternalKlangParser.g:1077:4: ( (lv_right_3_0= ruleMultiply ) )
            	    // InternalKlangParser.g:1078:5: (lv_right_3_0= ruleMultiply )
            	    {
            	    // InternalKlangParser.g:1078:5: (lv_right_3_0= ruleMultiply )
            	    // InternalKlangParser.g:1079:6: lv_right_3_0= ruleMultiply
            	    {

            	    						newCompositeNode(grammarAccess.getMinusAccess().getRightMultiplyParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_right_3_0=ruleMultiply();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMinusRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.kaurel.klang.xtext.Klang.Multiply");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinus"


    // $ANTLR start "entryRuleMultiply"
    // InternalKlangParser.g:1101:1: entryRuleMultiply returns [EObject current=null] : iv_ruleMultiply= ruleMultiply EOF ;
    public final EObject entryRuleMultiply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiply = null;


        try {
            // InternalKlangParser.g:1101:49: (iv_ruleMultiply= ruleMultiply EOF )
            // InternalKlangParser.g:1102:2: iv_ruleMultiply= ruleMultiply EOF
            {
             newCompositeNode(grammarAccess.getMultiplyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiply=ruleMultiply();

            state._fsp--;

             current =iv_ruleMultiply; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiply"


    // $ANTLR start "ruleMultiply"
    // InternalKlangParser.g:1108:1: ruleMultiply returns [EObject current=null] : (this_Divide_0= ruleDivide ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleDivide ) ) )* ) ;
    public final EObject ruleMultiply() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Divide_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1114:2: ( (this_Divide_0= ruleDivide ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleDivide ) ) )* ) )
            // InternalKlangParser.g:1115:2: (this_Divide_0= ruleDivide ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleDivide ) ) )* )
            {
            // InternalKlangParser.g:1115:2: (this_Divide_0= ruleDivide ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleDivide ) ) )* )
            // InternalKlangParser.g:1116:3: this_Divide_0= ruleDivide ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleDivide ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplyAccess().getDivideParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_Divide_0=ruleDivide();

            state._fsp--;


            			current = this_Divide_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKlangParser.g:1124:3: ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleDivide ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Asterisk) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalKlangParser.g:1125:4: () otherlv_2= Asterisk ( (lv_right_3_0= ruleDivide ) )
            	    {
            	    // InternalKlangParser.g:1125:4: ()
            	    // InternalKlangParser.g:1126:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplyAccess().getMultiplyLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,Asterisk,FOLLOW_11); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMultiplyAccess().getAsteriskKeyword_1_1());
            	    			
            	    // InternalKlangParser.g:1136:4: ( (lv_right_3_0= ruleDivide ) )
            	    // InternalKlangParser.g:1137:5: (lv_right_3_0= ruleDivide )
            	    {
            	    // InternalKlangParser.g:1137:5: (lv_right_3_0= ruleDivide )
            	    // InternalKlangParser.g:1138:6: lv_right_3_0= ruleDivide
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplyAccess().getRightDivideParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_right_3_0=ruleDivide();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplyRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.kaurel.klang.xtext.Klang.Divide");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiply"


    // $ANTLR start "entryRuleDivide"
    // InternalKlangParser.g:1160:1: entryRuleDivide returns [EObject current=null] : iv_ruleDivide= ruleDivide EOF ;
    public final EObject entryRuleDivide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivide = null;


        try {
            // InternalKlangParser.g:1160:47: (iv_ruleDivide= ruleDivide EOF )
            // InternalKlangParser.g:1161:2: iv_ruleDivide= ruleDivide EOF
            {
             newCompositeNode(grammarAccess.getDivideRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDivide=ruleDivide();

            state._fsp--;

             current =iv_ruleDivide; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivide"


    // $ANTLR start "ruleDivide"
    // InternalKlangParser.g:1167:1: ruleDivide returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= Solidus ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleDivide() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1173:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= Solidus ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) )
            // InternalKlangParser.g:1174:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= Solidus ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            {
            // InternalKlangParser.g:1174:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= Solidus ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            // InternalKlangParser.g:1175:3: this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= Solidus ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getDivideAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKlangParser.g:1183:3: ( () otherlv_2= Solidus ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==Solidus) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalKlangParser.g:1184:4: () otherlv_2= Solidus ( (lv_right_3_0= rulePrimaryExpression ) )
            	    {
            	    // InternalKlangParser.g:1184:4: ()
            	    // InternalKlangParser.g:1185:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getDivideAccess().getDivideLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,Solidus,FOLLOW_11); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDivideAccess().getSolidusKeyword_1_1());
            	    			
            	    // InternalKlangParser.g:1195:4: ( (lv_right_3_0= rulePrimaryExpression ) )
            	    // InternalKlangParser.g:1196:5: (lv_right_3_0= rulePrimaryExpression )
            	    {
            	    // InternalKlangParser.g:1196:5: (lv_right_3_0= rulePrimaryExpression )
            	    // InternalKlangParser.g:1197:6: lv_right_3_0= rulePrimaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getDivideAccess().getRightPrimaryExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_right_3_0=rulePrimaryExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDivideRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.kaurel.klang.xtext.Klang.PrimaryExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDivide"


    // $ANTLR start "entryRuleComparison"
    // InternalKlangParser.g:1219:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalKlangParser.g:1219:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalKlangParser.g:1220:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalKlangParser.g:1226:1: ruleComparison returns [EObject current=null] : (this_Plus_0= rulePlus ( ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSign () ) | (otherlv_5= GreaterThanSign () ) ) ( (lv_right_7_0= rulePlus ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_Plus_0 = null;

        EObject lv_right_7_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1232:2: ( (this_Plus_0= rulePlus ( ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSign () ) | (otherlv_5= GreaterThanSign () ) ) ( (lv_right_7_0= rulePlus ) ) )* ) )
            // InternalKlangParser.g:1233:2: (this_Plus_0= rulePlus ( ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSign () ) | (otherlv_5= GreaterThanSign () ) ) ( (lv_right_7_0= rulePlus ) ) )* )
            {
            // InternalKlangParser.g:1233:2: (this_Plus_0= rulePlus ( ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSign () ) | (otherlv_5= GreaterThanSign () ) ) ( (lv_right_7_0= rulePlus ) ) )* )
            // InternalKlangParser.g:1234:3: this_Plus_0= rulePlus ( ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSign () ) | (otherlv_5= GreaterThanSign () ) ) ( (lv_right_7_0= rulePlus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_Plus_0=rulePlus();

            state._fsp--;


            			current = this_Plus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKlangParser.g:1242:3: ( ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSign () ) | (otherlv_5= GreaterThanSign () ) ) ( (lv_right_7_0= rulePlus ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=LessThanSign && LA20_0<=GreaterThanSign)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalKlangParser.g:1243:4: ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSign () ) | (otherlv_5= GreaterThanSign () ) ) ( (lv_right_7_0= rulePlus ) )
            	    {
            	    // InternalKlangParser.g:1243:4: ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSign () ) | (otherlv_5= GreaterThanSign () ) )
            	    int alt19=3;
            	    switch ( input.LA(1) ) {
            	    case LessThanSign:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case EqualsSign:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case GreaterThanSign:
            	        {
            	        alt19=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt19) {
            	        case 1 :
            	            // InternalKlangParser.g:1244:5: (otherlv_1= LessThanSign () )
            	            {
            	            // InternalKlangParser.g:1244:5: (otherlv_1= LessThanSign () )
            	            // InternalKlangParser.g:1245:6: otherlv_1= LessThanSign ()
            	            {
            	            otherlv_1=(Token)match(input,LessThanSign,FOLLOW_11); 

            	            						newLeafNode(otherlv_1, grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_0_0());
            	            					
            	            // InternalKlangParser.g:1249:6: ()
            	            // InternalKlangParser.g:1250:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getComparisonAccess().getLessThanLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalKlangParser.g:1258:5: (otherlv_3= EqualsSign () )
            	            {
            	            // InternalKlangParser.g:1258:5: (otherlv_3= EqualsSign () )
            	            // InternalKlangParser.g:1259:6: otherlv_3= EqualsSign ()
            	            {
            	            otherlv_3=(Token)match(input,EqualsSign,FOLLOW_11); 

            	            						newLeafNode(otherlv_3, grammarAccess.getComparisonAccess().getEqualsSignKeyword_1_0_1_0());
            	            					
            	            // InternalKlangParser.g:1263:6: ()
            	            // InternalKlangParser.g:1264:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getComparisonAccess().getEqualLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalKlangParser.g:1272:5: (otherlv_5= GreaterThanSign () )
            	            {
            	            // InternalKlangParser.g:1272:5: (otherlv_5= GreaterThanSign () )
            	            // InternalKlangParser.g:1273:6: otherlv_5= GreaterThanSign ()
            	            {
            	            otherlv_5=(Token)match(input,GreaterThanSign,FOLLOW_11); 

            	            						newLeafNode(otherlv_5, grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_2_0());
            	            					
            	            // InternalKlangParser.g:1277:6: ()
            	            // InternalKlangParser.g:1278:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getComparisonAccess().getGreaterThanLeftAction_1_0_2_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalKlangParser.g:1286:4: ( (lv_right_7_0= rulePlus ) )
            	    // InternalKlangParser.g:1287:5: (lv_right_7_0= rulePlus )
            	    {
            	    // InternalKlangParser.g:1287:5: (lv_right_7_0= rulePlus )
            	    // InternalKlangParser.g:1288:6: lv_right_7_0= rulePlus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_right_7_0=rulePlus();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_7_0,
            	    							"com.kaurel.klang.xtext.Klang.Plus");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalKlangParser.g:1310:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalKlangParser.g:1310:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalKlangParser.g:1311:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalKlangParser.g:1317:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | ( () ruleNotOp ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | this_AtomicExpression_6= ruleAtomicExpression ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        EObject lv_expression_5_0 = null;

        EObject this_AtomicExpression_6 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1323:2: ( ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | ( () ruleNotOp ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | this_AtomicExpression_6= ruleAtomicExpression ) )
            // InternalKlangParser.g:1324:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | ( () ruleNotOp ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | this_AtomicExpression_6= ruleAtomicExpression )
            {
            // InternalKlangParser.g:1324:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | ( () ruleNotOp ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | this_AtomicExpression_6= ruleAtomicExpression )
            int alt21=3;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt21=1;
                }
                break;
            case Not:
            case ExclamationMark:
                {
                alt21=2;
                }
                break;
            case False:
            case True:
            case RULE_NUMERIC:
            case RULE_ID:
            case RULE_STRING:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalKlangParser.g:1325:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    {
                    // InternalKlangParser.g:1325:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    // InternalKlangParser.g:1326:4: otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis
                    {
                    otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_11); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_23);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,RightParenthesis,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalKlangParser.g:1344:3: ( () ruleNotOp ( (lv_expression_5_0= rulePrimaryExpression ) ) )
                    {
                    // InternalKlangParser.g:1344:3: ( () ruleNotOp ( (lv_expression_5_0= rulePrimaryExpression ) ) )
                    // InternalKlangParser.g:1345:4: () ruleNotOp ( (lv_expression_5_0= rulePrimaryExpression ) )
                    {
                    // InternalKlangParser.g:1345:4: ()
                    // InternalKlangParser.g:1346:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getNotAction_1_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getNotOpParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_11);
                    ruleNotOp();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalKlangParser.g:1359:4: ( (lv_expression_5_0= rulePrimaryExpression ) )
                    // InternalKlangParser.g:1360:5: (lv_expression_5_0= rulePrimaryExpression )
                    {
                    // InternalKlangParser.g:1360:5: (lv_expression_5_0= rulePrimaryExpression )
                    // InternalKlangParser.g:1361:6: lv_expression_5_0= rulePrimaryExpression
                    {

                    						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_5_0=rulePrimaryExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_5_0,
                    							"com.kaurel.klang.xtext.Klang.PrimaryExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalKlangParser.g:1380:3: this_AtomicExpression_6= ruleAtomicExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getAtomicExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AtomicExpression_6=ruleAtomicExpression();

                    state._fsp--;


                    			current = this_AtomicExpression_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleNotOp"
    // InternalKlangParser.g:1392:1: entryRuleNotOp returns [String current=null] : iv_ruleNotOp= ruleNotOp EOF ;
    public final String entryRuleNotOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNotOp = null;


        try {
            // InternalKlangParser.g:1392:45: (iv_ruleNotOp= ruleNotOp EOF )
            // InternalKlangParser.g:1393:2: iv_ruleNotOp= ruleNotOp EOF
            {
             newCompositeNode(grammarAccess.getNotOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotOp=ruleNotOp();

            state._fsp--;

             current =iv_ruleNotOp.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNotOp"


    // $ANTLR start "ruleNotOp"
    // InternalKlangParser.g:1399:1: ruleNotOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ExclamationMark | kw= Not ) ;
    public final AntlrDatatypeRuleToken ruleNotOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKlangParser.g:1405:2: ( (kw= ExclamationMark | kw= Not ) )
            // InternalKlangParser.g:1406:2: (kw= ExclamationMark | kw= Not )
            {
            // InternalKlangParser.g:1406:2: (kw= ExclamationMark | kw= Not )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ExclamationMark) ) {
                alt22=1;
            }
            else if ( (LA22_0==Not) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalKlangParser.g:1407:3: kw= ExclamationMark
                    {
                    kw=(Token)match(input,ExclamationMark,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNotOpAccess().getExclamationMarkKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKlangParser.g:1413:3: kw= Not
                    {
                    kw=(Token)match(input,Not,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNotOpAccess().getNotKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNotOp"


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalKlangParser.g:1422:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalKlangParser.g:1422:57: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalKlangParser.g:1423:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
             newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;

             current =iv_ruleAtomicExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicExpression"


    // $ANTLR start "ruleAtomicExpression"
    // InternalKlangParser.g:1429:1: ruleAtomicExpression returns [EObject current=null] : ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) | ( () ( (lv_value_4_0= RULE_NUMERIC ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( (lv_variableName_8_0= RULE_ID ) ) ) ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token lv_value_4_0=null;
        Token lv_value_6_0=null;
        Token lv_variableName_8_0=null;


        	enterRule();

        try {
            // InternalKlangParser.g:1435:2: ( ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) | ( () ( (lv_value_4_0= RULE_NUMERIC ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( (lv_variableName_8_0= RULE_ID ) ) ) ) )
            // InternalKlangParser.g:1436:2: ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) | ( () ( (lv_value_4_0= RULE_NUMERIC ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( (lv_variableName_8_0= RULE_ID ) ) ) )
            {
            // InternalKlangParser.g:1436:2: ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) | ( () ( (lv_value_4_0= RULE_NUMERIC ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( (lv_variableName_8_0= RULE_ID ) ) ) )
            int alt24=4;
            switch ( input.LA(1) ) {
            case False:
            case True:
                {
                alt24=1;
                }
                break;
            case RULE_NUMERIC:
                {
                alt24=2;
                }
                break;
            case RULE_STRING:
                {
                alt24=3;
                }
                break;
            case RULE_ID:
                {
                alt24=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalKlangParser.g:1437:3: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
                    {
                    // InternalKlangParser.g:1437:3: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
                    // InternalKlangParser.g:1438:4: () ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
                    {
                    // InternalKlangParser.g:1438:4: ()
                    // InternalKlangParser.g:1439:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicExpressionAccess().getBooleanLiteralAction_0_0(),
                    						current);
                    				

                    }

                    // InternalKlangParser.g:1445:4: ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==True) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==False) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalKlangParser.g:1446:5: ( (lv_value_1_0= True ) )
                            {
                            // InternalKlangParser.g:1446:5: ( (lv_value_1_0= True ) )
                            // InternalKlangParser.g:1447:6: (lv_value_1_0= True )
                            {
                            // InternalKlangParser.g:1447:6: (lv_value_1_0= True )
                            // InternalKlangParser.g:1448:7: lv_value_1_0= True
                            {
                            lv_value_1_0=(Token)match(input,True,FOLLOW_2); 

                            							newLeafNode(lv_value_1_0, grammarAccess.getAtomicExpressionAccess().getValueTrueKeyword_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicExpressionRule());
                            							}
                            							setWithLastConsumed(current, "value", true, "true");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalKlangParser.g:1461:5: otherlv_2= False
                            {
                            otherlv_2=(Token)match(input,False,FOLLOW_2); 

                            					newLeafNode(otherlv_2, grammarAccess.getAtomicExpressionAccess().getFalseKeyword_0_1_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKlangParser.g:1468:3: ( () ( (lv_value_4_0= RULE_NUMERIC ) ) )
                    {
                    // InternalKlangParser.g:1468:3: ( () ( (lv_value_4_0= RULE_NUMERIC ) ) )
                    // InternalKlangParser.g:1469:4: () ( (lv_value_4_0= RULE_NUMERIC ) )
                    {
                    // InternalKlangParser.g:1469:4: ()
                    // InternalKlangParser.g:1470:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicExpressionAccess().getNumericLiteralAction_1_0(),
                    						current);
                    				

                    }

                    // InternalKlangParser.g:1476:4: ( (lv_value_4_0= RULE_NUMERIC ) )
                    // InternalKlangParser.g:1477:5: (lv_value_4_0= RULE_NUMERIC )
                    {
                    // InternalKlangParser.g:1477:5: (lv_value_4_0= RULE_NUMERIC )
                    // InternalKlangParser.g:1478:6: lv_value_4_0= RULE_NUMERIC
                    {
                    lv_value_4_0=(Token)match(input,RULE_NUMERIC,FOLLOW_2); 

                    						newLeafNode(lv_value_4_0, grammarAccess.getAtomicExpressionAccess().getValueNUMERICTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"com.kaurel.klang.xtext.Klang.NUMERIC");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalKlangParser.g:1496:3: ( () ( (lv_value_6_0= RULE_STRING ) ) )
                    {
                    // InternalKlangParser.g:1496:3: ( () ( (lv_value_6_0= RULE_STRING ) ) )
                    // InternalKlangParser.g:1497:4: () ( (lv_value_6_0= RULE_STRING ) )
                    {
                    // InternalKlangParser.g:1497:4: ()
                    // InternalKlangParser.g:1498:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicExpressionAccess().getStringLiteralAction_2_0(),
                    						current);
                    				

                    }

                    // InternalKlangParser.g:1504:4: ( (lv_value_6_0= RULE_STRING ) )
                    // InternalKlangParser.g:1505:5: (lv_value_6_0= RULE_STRING )
                    {
                    // InternalKlangParser.g:1505:5: (lv_value_6_0= RULE_STRING )
                    // InternalKlangParser.g:1506:6: lv_value_6_0= RULE_STRING
                    {
                    lv_value_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_6_0, grammarAccess.getAtomicExpressionAccess().getValueSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalKlangParser.g:1524:3: ( () ( (lv_variableName_8_0= RULE_ID ) ) )
                    {
                    // InternalKlangParser.g:1524:3: ( () ( (lv_variableName_8_0= RULE_ID ) ) )
                    // InternalKlangParser.g:1525:4: () ( (lv_variableName_8_0= RULE_ID ) )
                    {
                    // InternalKlangParser.g:1525:4: ()
                    // InternalKlangParser.g:1526:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicExpressionAccess().getVariableRefAction_3_0(),
                    						current);
                    				

                    }

                    // InternalKlangParser.g:1532:4: ( (lv_variableName_8_0= RULE_ID ) )
                    // InternalKlangParser.g:1533:5: (lv_variableName_8_0= RULE_ID )
                    {
                    // InternalKlangParser.g:1533:5: (lv_variableName_8_0= RULE_ID )
                    // InternalKlangParser.g:1534:6: lv_variableName_8_0= RULE_ID
                    {
                    lv_variableName_8_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_variableName_8_0, grammarAccess.getAtomicExpressionAccess().getVariableNameIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"variableName",
                    							lv_variableName_8_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomicExpression"


    // $ANTLR start "ruleEventType"
    // InternalKlangParser.g:1555:1: ruleEventType returns [Enumerator current=null] : (enumLiteral_0= GAME_STARTED ) ;
    public final Enumerator ruleEventType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKlangParser.g:1561:2: ( (enumLiteral_0= GAME_STARTED ) )
            // InternalKlangParser.g:1562:2: (enumLiteral_0= GAME_STARTED )
            {
            // InternalKlangParser.g:1562:2: (enumLiteral_0= GAME_STARTED )
            // InternalKlangParser.g:1563:3: enumLiteral_0= GAME_STARTED
            {
            enumLiteral_0=(Token)match(input,GAME_STARTED,FOLLOW_2); 

            			current = grammarAccess.getEventTypeAccess().getGAME_STARTEDEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getEventTypeAccess().getGAME_STARTEDEnumLiteralDeclaration());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004042L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020004840L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000A000C360L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000002C0062480L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000002C04E2480L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000080000L});

}