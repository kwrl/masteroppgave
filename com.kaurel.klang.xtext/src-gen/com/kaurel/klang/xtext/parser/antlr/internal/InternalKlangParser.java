package com.kaurel.klang.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Collides", "Clicked", "Forever", "Pressed", "Sprite", "Starts", "False", "Scene", "Sleep", "While", "Game", "True", "When", "With", "And", "Key", "Not", "Var", "EqualsSignEqualsSign", "If", "Or", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "Solidus", "LessThanSign", "EqualsSign", "GreaterThanSign", "RULE_BEGIN", "RULE_END", "RULE_UPPERCASE", "RULE_INT", "RULE_DECIMAL", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
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
        	return "Game";
       	}

       	@Override
       	protected KlangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGame"
    // InternalKlangParser.g:57:1: entryRuleGame returns [EObject current=null] : iv_ruleGame= ruleGame EOF ;
    public final EObject entryRuleGame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGame = null;


        try {
            // InternalKlangParser.g:57:45: (iv_ruleGame= ruleGame EOF )
            // InternalKlangParser.g:58:2: iv_ruleGame= ruleGame EOF
            {
             newCompositeNode(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGame=ruleGame();

            state._fsp--;

             current =iv_ruleGame; 
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
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // InternalKlangParser.g:64:1: ruleGame returns [EObject current=null] : ( () ( (lv_variableDeclarations_1_0= ruleVariable ) )* ( (lv_actorDefs_2_0= ruleActor ) )* ) ;
    public final EObject ruleGame() throws RecognitionException {
        EObject current = null;

        EObject lv_variableDeclarations_1_0 = null;

        EObject lv_actorDefs_2_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:70:2: ( ( () ( (lv_variableDeclarations_1_0= ruleVariable ) )* ( (lv_actorDefs_2_0= ruleActor ) )* ) )
            // InternalKlangParser.g:71:2: ( () ( (lv_variableDeclarations_1_0= ruleVariable ) )* ( (lv_actorDefs_2_0= ruleActor ) )* )
            {
            // InternalKlangParser.g:71:2: ( () ( (lv_variableDeclarations_1_0= ruleVariable ) )* ( (lv_actorDefs_2_0= ruleActor ) )* )
            // InternalKlangParser.g:72:3: () ( (lv_variableDeclarations_1_0= ruleVariable ) )* ( (lv_actorDefs_2_0= ruleActor ) )*
            {
            // InternalKlangParser.g:72:3: ()
            // InternalKlangParser.g:73:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGameAccess().getGameAction_0(),
            					current);
            			

            }

            // InternalKlangParser.g:79:3: ( (lv_variableDeclarations_1_0= ruleVariable ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Var) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKlangParser.g:80:4: (lv_variableDeclarations_1_0= ruleVariable )
            	    {
            	    // InternalKlangParser.g:80:4: (lv_variableDeclarations_1_0= ruleVariable )
            	    // InternalKlangParser.g:81:5: lv_variableDeclarations_1_0= ruleVariable
            	    {

            	    					newCompositeNode(grammarAccess.getGameAccess().getVariableDeclarationsVariableParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_variableDeclarations_1_0=ruleVariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variableDeclarations",
            	    						lv_variableDeclarations_1_0,
            	    						"com.kaurel.klang.xtext.Klang.Variable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalKlangParser.g:98:3: ( (lv_actorDefs_2_0= ruleActor ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Sprite||LA2_0==Scene) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalKlangParser.g:99:4: (lv_actorDefs_2_0= ruleActor )
            	    {
            	    // InternalKlangParser.g:99:4: (lv_actorDefs_2_0= ruleActor )
            	    // InternalKlangParser.g:100:5: lv_actorDefs_2_0= ruleActor
            	    {

            	    					newCompositeNode(grammarAccess.getGameAccess().getActorDefsActorParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_actorDefs_2_0=ruleActor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actorDefs",
            	    						lv_actorDefs_2_0,
            	    						"com.kaurel.klang.xtext.Klang.Actor");
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
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRuleActor"
    // InternalKlangParser.g:121:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // InternalKlangParser.g:121:46: (iv_ruleActor= ruleActor EOF )
            // InternalKlangParser.g:122:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
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
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalKlangParser.g:128:1: ruleActor returns [EObject current=null] : ( () ( (lv_entity_1_0= ruleEntity ) ) this_BEGIN_2= RULE_BEGIN ( (lv_variableDeclarations_3_0= ruleVariable ) )* ( (lv_eventHandlers_4_0= ruleEventHandler ) )* this_END_5= RULE_END ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_2=null;
        Token this_END_5=null;
        EObject lv_entity_1_0 = null;

        EObject lv_variableDeclarations_3_0 = null;

        EObject lv_eventHandlers_4_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:134:2: ( ( () ( (lv_entity_1_0= ruleEntity ) ) this_BEGIN_2= RULE_BEGIN ( (lv_variableDeclarations_3_0= ruleVariable ) )* ( (lv_eventHandlers_4_0= ruleEventHandler ) )* this_END_5= RULE_END ) )
            // InternalKlangParser.g:135:2: ( () ( (lv_entity_1_0= ruleEntity ) ) this_BEGIN_2= RULE_BEGIN ( (lv_variableDeclarations_3_0= ruleVariable ) )* ( (lv_eventHandlers_4_0= ruleEventHandler ) )* this_END_5= RULE_END )
            {
            // InternalKlangParser.g:135:2: ( () ( (lv_entity_1_0= ruleEntity ) ) this_BEGIN_2= RULE_BEGIN ( (lv_variableDeclarations_3_0= ruleVariable ) )* ( (lv_eventHandlers_4_0= ruleEventHandler ) )* this_END_5= RULE_END )
            // InternalKlangParser.g:136:3: () ( (lv_entity_1_0= ruleEntity ) ) this_BEGIN_2= RULE_BEGIN ( (lv_variableDeclarations_3_0= ruleVariable ) )* ( (lv_eventHandlers_4_0= ruleEventHandler ) )* this_END_5= RULE_END
            {
            // InternalKlangParser.g:136:3: ()
            // InternalKlangParser.g:137:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActorAccess().getActorAction_0(),
            					current);
            			

            }

            // InternalKlangParser.g:143:3: ( (lv_entity_1_0= ruleEntity ) )
            // InternalKlangParser.g:144:4: (lv_entity_1_0= ruleEntity )
            {
            // InternalKlangParser.g:144:4: (lv_entity_1_0= ruleEntity )
            // InternalKlangParser.g:145:5: lv_entity_1_0= ruleEntity
            {

            					newCompositeNode(grammarAccess.getActorAccess().getEntityEntityParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_entity_1_0=ruleEntity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActorRule());
            					}
            					set(
            						current,
            						"entity",
            						lv_entity_1_0,
            						"com.kaurel.klang.xtext.Klang.Entity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_6); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getActorAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalKlangParser.g:166:3: ( (lv_variableDeclarations_3_0= ruleVariable ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==Var) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalKlangParser.g:167:4: (lv_variableDeclarations_3_0= ruleVariable )
            	    {
            	    // InternalKlangParser.g:167:4: (lv_variableDeclarations_3_0= ruleVariable )
            	    // InternalKlangParser.g:168:5: lv_variableDeclarations_3_0= ruleVariable
            	    {

            	    					newCompositeNode(grammarAccess.getActorAccess().getVariableDeclarationsVariableParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_variableDeclarations_3_0=ruleVariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variableDeclarations",
            	    						lv_variableDeclarations_3_0,
            	    						"com.kaurel.klang.xtext.Klang.Variable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalKlangParser.g:185:3: ( (lv_eventHandlers_4_0= ruleEventHandler ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==When) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKlangParser.g:186:4: (lv_eventHandlers_4_0= ruleEventHandler )
            	    {
            	    // InternalKlangParser.g:186:4: (lv_eventHandlers_4_0= ruleEventHandler )
            	    // InternalKlangParser.g:187:5: lv_eventHandlers_4_0= ruleEventHandler
            	    {

            	    					newCompositeNode(grammarAccess.getActorAccess().getEventHandlersEventHandlerParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_eventHandlers_4_0=ruleEventHandler();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"eventHandlers",
            	    						lv_eventHandlers_4_0,
            	    						"com.kaurel.klang.xtext.Klang.EventHandler");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_5, grammarAccess.getActorAccess().getENDTerminalRuleCall_5());
            		

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
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleEntity"
    // InternalKlangParser.g:212:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalKlangParser.g:212:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalKlangParser.g:213:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalKlangParser.g:219:1: ruleEntity returns [EObject current=null] : ( (otherlv_0= Sprite () ( (lv_name_2_0= RULE_ID ) ) ) | (otherlv_3= Scene () ) ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalKlangParser.g:225:2: ( ( (otherlv_0= Sprite () ( (lv_name_2_0= RULE_ID ) ) ) | (otherlv_3= Scene () ) ) )
            // InternalKlangParser.g:226:2: ( (otherlv_0= Sprite () ( (lv_name_2_0= RULE_ID ) ) ) | (otherlv_3= Scene () ) )
            {
            // InternalKlangParser.g:226:2: ( (otherlv_0= Sprite () ( (lv_name_2_0= RULE_ID ) ) ) | (otherlv_3= Scene () ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Sprite) ) {
                alt5=1;
            }
            else if ( (LA5_0==Scene) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalKlangParser.g:227:3: (otherlv_0= Sprite () ( (lv_name_2_0= RULE_ID ) ) )
                    {
                    // InternalKlangParser.g:227:3: (otherlv_0= Sprite () ( (lv_name_2_0= RULE_ID ) ) )
                    // InternalKlangParser.g:228:4: otherlv_0= Sprite () ( (lv_name_2_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,Sprite,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getSpriteKeyword_0_0());
                    			
                    // InternalKlangParser.g:232:4: ()
                    // InternalKlangParser.g:233:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEntityAccess().getSpriteEntityAction_0_1(),
                    						current);
                    				

                    }

                    // InternalKlangParser.g:239:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalKlangParser.g:240:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalKlangParser.g:240:5: (lv_name_2_0= RULE_ID )
                    // InternalKlangParser.g:241:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKlangParser.g:259:3: (otherlv_3= Scene () )
                    {
                    // InternalKlangParser.g:259:3: (otherlv_3= Scene () )
                    // InternalKlangParser.g:260:4: otherlv_3= Scene ()
                    {
                    otherlv_3=(Token)match(input,Scene,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getSceneKeyword_1_0());
                    			
                    // InternalKlangParser.g:264:4: ()
                    // InternalKlangParser.g:265:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEntityAccess().getSceneEntityAction_1_1(),
                    						current);
                    				

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleEventHandler"
    // InternalKlangParser.g:276:1: entryRuleEventHandler returns [EObject current=null] : iv_ruleEventHandler= ruleEventHandler EOF ;
    public final EObject entryRuleEventHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventHandler = null;


        try {
            // InternalKlangParser.g:276:53: (iv_ruleEventHandler= ruleEventHandler EOF )
            // InternalKlangParser.g:277:2: iv_ruleEventHandler= ruleEventHandler EOF
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
    // InternalKlangParser.g:283:1: ruleEventHandler returns [EObject current=null] : (this_GameStart_0= ruleGameStart | this_SpriteClicked_1= ruleSpriteClicked | this_KeyPressed_2= ruleKeyPressed | this_CollidesWith_3= ruleCollidesWith ) ;
    public final EObject ruleEventHandler() throws RecognitionException {
        EObject current = null;

        EObject this_GameStart_0 = null;

        EObject this_SpriteClicked_1 = null;

        EObject this_KeyPressed_2 = null;

        EObject this_CollidesWith_3 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:289:2: ( (this_GameStart_0= ruleGameStart | this_SpriteClicked_1= ruleSpriteClicked | this_KeyPressed_2= ruleKeyPressed | this_CollidesWith_3= ruleCollidesWith ) )
            // InternalKlangParser.g:290:2: (this_GameStart_0= ruleGameStart | this_SpriteClicked_1= ruleSpriteClicked | this_KeyPressed_2= ruleKeyPressed | this_CollidesWith_3= ruleCollidesWith )
            {
            // InternalKlangParser.g:290:2: (this_GameStart_0= ruleGameStart | this_SpriteClicked_1= ruleSpriteClicked | this_KeyPressed_2= ruleKeyPressed | this_CollidesWith_3= ruleCollidesWith )
            int alt6=4;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==When) ) {
                switch ( input.LA(2) ) {
                case Game:
                    {
                    alt6=1;
                    }
                    break;
                case Clicked:
                    {
                    alt6=2;
                    }
                    break;
                case Collides:
                    {
                    alt6=4;
                    }
                    break;
                case RULE_UPPERCASE:
                    {
                    alt6=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalKlangParser.g:291:3: this_GameStart_0= ruleGameStart
                    {

                    			newCompositeNode(grammarAccess.getEventHandlerAccess().getGameStartParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GameStart_0=ruleGameStart();

                    state._fsp--;


                    			current = this_GameStart_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKlangParser.g:300:3: this_SpriteClicked_1= ruleSpriteClicked
                    {

                    			newCompositeNode(grammarAccess.getEventHandlerAccess().getSpriteClickedParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SpriteClicked_1=ruleSpriteClicked();

                    state._fsp--;


                    			current = this_SpriteClicked_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalKlangParser.g:309:3: this_KeyPressed_2= ruleKeyPressed
                    {

                    			newCompositeNode(grammarAccess.getEventHandlerAccess().getKeyPressedParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_KeyPressed_2=ruleKeyPressed();

                    state._fsp--;


                    			current = this_KeyPressed_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalKlangParser.g:318:3: this_CollidesWith_3= ruleCollidesWith
                    {

                    			newCompositeNode(grammarAccess.getEventHandlerAccess().getCollidesWithParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CollidesWith_3=ruleCollidesWith();

                    state._fsp--;


                    			current = this_CollidesWith_3;
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
    // $ANTLR end "ruleEventHandler"


    // $ANTLR start "entryRuleStatement"
    // InternalKlangParser.g:330:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalKlangParser.g:330:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalKlangParser.g:331:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalKlangParser.g:337:1: ruleStatement returns [EObject current=null] : (this_WhileLoop_0= ruleWhileLoop | this_If_1= ruleIf | this_VariableAssignment_2= ruleVariableAssignment | this_ForeverLoop_3= ruleForeverLoop | this_FunctionCall_4= ruleFunctionCall | this_Sleep_5= ruleSleep ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_WhileLoop_0 = null;

        EObject this_If_1 = null;

        EObject this_VariableAssignment_2 = null;

        EObject this_ForeverLoop_3 = null;

        EObject this_FunctionCall_4 = null;

        EObject this_Sleep_5 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:343:2: ( (this_WhileLoop_0= ruleWhileLoop | this_If_1= ruleIf | this_VariableAssignment_2= ruleVariableAssignment | this_ForeverLoop_3= ruleForeverLoop | this_FunctionCall_4= ruleFunctionCall | this_Sleep_5= ruleSleep ) )
            // InternalKlangParser.g:344:2: (this_WhileLoop_0= ruleWhileLoop | this_If_1= ruleIf | this_VariableAssignment_2= ruleVariableAssignment | this_ForeverLoop_3= ruleForeverLoop | this_FunctionCall_4= ruleFunctionCall | this_Sleep_5= ruleSleep )
            {
            // InternalKlangParser.g:344:2: (this_WhileLoop_0= ruleWhileLoop | this_If_1= ruleIf | this_VariableAssignment_2= ruleVariableAssignment | this_ForeverLoop_3= ruleForeverLoop | this_FunctionCall_4= ruleFunctionCall | this_Sleep_5= ruleSleep )
            int alt7=6;
            switch ( input.LA(1) ) {
            case While:
                {
                alt7=1;
                }
                break;
            case If:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
                {
                int LA7_3 = input.LA(2);

                if ( (LA7_3==EqualsSign) ) {
                    alt7=3;
                }
                else if ( (LA7_3==LeftParenthesis) ) {
                    alt7=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 3, input);

                    throw nvae;
                }
                }
                break;
            case Forever:
                {
                alt7=4;
                }
                break;
            case Sleep:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalKlangParser.g:345:3: this_WhileLoop_0= ruleWhileLoop
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getWhileLoopParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_WhileLoop_0=ruleWhileLoop();

                    state._fsp--;


                    			current = this_WhileLoop_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKlangParser.g:354:3: this_If_1= ruleIf
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getIfParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_If_1=ruleIf();

                    state._fsp--;


                    			current = this_If_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalKlangParser.g:363:3: this_VariableAssignment_2= ruleVariableAssignment
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getVariableAssignmentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableAssignment_2=ruleVariableAssignment();

                    state._fsp--;


                    			current = this_VariableAssignment_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalKlangParser.g:372:3: this_ForeverLoop_3= ruleForeverLoop
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getForeverLoopParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForeverLoop_3=ruleForeverLoop();

                    state._fsp--;


                    			current = this_ForeverLoop_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalKlangParser.g:381:3: this_FunctionCall_4= ruleFunctionCall
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getFunctionCallParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionCall_4=ruleFunctionCall();

                    state._fsp--;


                    			current = this_FunctionCall_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalKlangParser.g:390:3: this_Sleep_5= ruleSleep
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSleepParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sleep_5=ruleSleep();

                    state._fsp--;


                    			current = this_Sleep_5;
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


    // $ANTLR start "entryRuleGameStart"
    // InternalKlangParser.g:402:1: entryRuleGameStart returns [EObject current=null] : iv_ruleGameStart= ruleGameStart EOF ;
    public final EObject entryRuleGameStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGameStart = null;


        try {
            // InternalKlangParser.g:402:50: (iv_ruleGameStart= ruleGameStart EOF )
            // InternalKlangParser.g:403:2: iv_ruleGameStart= ruleGameStart EOF
            {
             newCompositeNode(grammarAccess.getGameStartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGameStart=ruleGameStart();

            state._fsp--;

             current =iv_ruleGameStart; 
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
    // $ANTLR end "entryRuleGameStart"


    // $ANTLR start "ruleGameStart"
    // InternalKlangParser.g:409:1: ruleGameStart returns [EObject current=null] : ( () otherlv_1= When otherlv_2= Game otherlv_3= Starts this_BEGIN_4= RULE_BEGIN ( (lv_statements_5_0= ruleStatement ) )* this_END_6= RULE_END ) ;
    public final EObject ruleGameStart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_BEGIN_4=null;
        Token this_END_6=null;
        EObject lv_statements_5_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:415:2: ( ( () otherlv_1= When otherlv_2= Game otherlv_3= Starts this_BEGIN_4= RULE_BEGIN ( (lv_statements_5_0= ruleStatement ) )* this_END_6= RULE_END ) )
            // InternalKlangParser.g:416:2: ( () otherlv_1= When otherlv_2= Game otherlv_3= Starts this_BEGIN_4= RULE_BEGIN ( (lv_statements_5_0= ruleStatement ) )* this_END_6= RULE_END )
            {
            // InternalKlangParser.g:416:2: ( () otherlv_1= When otherlv_2= Game otherlv_3= Starts this_BEGIN_4= RULE_BEGIN ( (lv_statements_5_0= ruleStatement ) )* this_END_6= RULE_END )
            // InternalKlangParser.g:417:3: () otherlv_1= When otherlv_2= Game otherlv_3= Starts this_BEGIN_4= RULE_BEGIN ( (lv_statements_5_0= ruleStatement ) )* this_END_6= RULE_END
            {
            // InternalKlangParser.g:417:3: ()
            // InternalKlangParser.g:418:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGameStartAccess().getGameStartAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,When,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getGameStartAccess().getWhenKeyword_1());
            		
            otherlv_2=(Token)match(input,Game,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getGameStartAccess().getGameKeyword_2());
            		
            otherlv_3=(Token)match(input,Starts,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getGameStartAccess().getStartsKeyword_3());
            		
            this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_11); 

            			newLeafNode(this_BEGIN_4, grammarAccess.getGameStartAccess().getBEGINTerminalRuleCall_4());
            		
            // InternalKlangParser.g:440:3: ( (lv_statements_5_0= ruleStatement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Forever||(LA8_0>=Sleep && LA8_0<=While)||LA8_0==If||LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKlangParser.g:441:4: (lv_statements_5_0= ruleStatement )
            	    {
            	    // InternalKlangParser.g:441:4: (lv_statements_5_0= ruleStatement )
            	    // InternalKlangParser.g:442:5: lv_statements_5_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getGameStartAccess().getStatementsStatementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_statements_5_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGameStartRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_5_0,
            	    						"com.kaurel.klang.xtext.Klang.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_6, grammarAccess.getGameStartAccess().getENDTerminalRuleCall_6());
            		

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
    // $ANTLR end "ruleGameStart"


    // $ANTLR start "entryRuleSpriteClicked"
    // InternalKlangParser.g:467:1: entryRuleSpriteClicked returns [EObject current=null] : iv_ruleSpriteClicked= ruleSpriteClicked EOF ;
    public final EObject entryRuleSpriteClicked() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpriteClicked = null;


        try {
            // InternalKlangParser.g:467:54: (iv_ruleSpriteClicked= ruleSpriteClicked EOF )
            // InternalKlangParser.g:468:2: iv_ruleSpriteClicked= ruleSpriteClicked EOF
            {
             newCompositeNode(grammarAccess.getSpriteClickedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpriteClicked=ruleSpriteClicked();

            state._fsp--;

             current =iv_ruleSpriteClicked; 
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
    // $ANTLR end "entryRuleSpriteClicked"


    // $ANTLR start "ruleSpriteClicked"
    // InternalKlangParser.g:474:1: ruleSpriteClicked returns [EObject current=null] : ( () otherlv_1= When otherlv_2= Clicked this_BEGIN_3= RULE_BEGIN ( (lv_statements_4_0= ruleStatement ) )* this_END_5= RULE_END ) ;
    public final EObject ruleSpriteClicked() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        EObject lv_statements_4_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:480:2: ( ( () otherlv_1= When otherlv_2= Clicked this_BEGIN_3= RULE_BEGIN ( (lv_statements_4_0= ruleStatement ) )* this_END_5= RULE_END ) )
            // InternalKlangParser.g:481:2: ( () otherlv_1= When otherlv_2= Clicked this_BEGIN_3= RULE_BEGIN ( (lv_statements_4_0= ruleStatement ) )* this_END_5= RULE_END )
            {
            // InternalKlangParser.g:481:2: ( () otherlv_1= When otherlv_2= Clicked this_BEGIN_3= RULE_BEGIN ( (lv_statements_4_0= ruleStatement ) )* this_END_5= RULE_END )
            // InternalKlangParser.g:482:3: () otherlv_1= When otherlv_2= Clicked this_BEGIN_3= RULE_BEGIN ( (lv_statements_4_0= ruleStatement ) )* this_END_5= RULE_END
            {
            // InternalKlangParser.g:482:3: ()
            // InternalKlangParser.g:483:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSpriteClickedAccess().getSpriteClickedAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,When,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getSpriteClickedAccess().getWhenKeyword_1());
            		
            otherlv_2=(Token)match(input,Clicked,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSpriteClickedAccess().getClickedKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_11); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getSpriteClickedAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalKlangParser.g:501:3: ( (lv_statements_4_0= ruleStatement ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Forever||(LA9_0>=Sleep && LA9_0<=While)||LA9_0==If||LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalKlangParser.g:502:4: (lv_statements_4_0= ruleStatement )
            	    {
            	    // InternalKlangParser.g:502:4: (lv_statements_4_0= ruleStatement )
            	    // InternalKlangParser.g:503:5: lv_statements_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getSpriteClickedAccess().getStatementsStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_statements_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpriteClickedRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_4_0,
            	    						"com.kaurel.klang.xtext.Klang.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_5, grammarAccess.getSpriteClickedAccess().getENDTerminalRuleCall_5());
            		

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
    // $ANTLR end "ruleSpriteClicked"


    // $ANTLR start "entryRuleKeyPressed"
    // InternalKlangParser.g:528:1: entryRuleKeyPressed returns [EObject current=null] : iv_ruleKeyPressed= ruleKeyPressed EOF ;
    public final EObject entryRuleKeyPressed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyPressed = null;


        try {
            // InternalKlangParser.g:528:51: (iv_ruleKeyPressed= ruleKeyPressed EOF )
            // InternalKlangParser.g:529:2: iv_ruleKeyPressed= ruleKeyPressed EOF
            {
             newCompositeNode(grammarAccess.getKeyPressedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeyPressed=ruleKeyPressed();

            state._fsp--;

             current =iv_ruleKeyPressed; 
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
    // $ANTLR end "entryRuleKeyPressed"


    // $ANTLR start "ruleKeyPressed"
    // InternalKlangParser.g:535:1: ruleKeyPressed returns [EObject current=null] : ( () otherlv_1= When ( (lv_key_2_0= RULE_UPPERCASE ) ) otherlv_3= Key otherlv_4= Pressed this_BEGIN_5= RULE_BEGIN ( (lv_statements_6_0= ruleStatement ) )* this_END_7= RULE_END ) ;
    public final EObject ruleKeyPressed() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_key_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_BEGIN_5=null;
        Token this_END_7=null;
        EObject lv_statements_6_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:541:2: ( ( () otherlv_1= When ( (lv_key_2_0= RULE_UPPERCASE ) ) otherlv_3= Key otherlv_4= Pressed this_BEGIN_5= RULE_BEGIN ( (lv_statements_6_0= ruleStatement ) )* this_END_7= RULE_END ) )
            // InternalKlangParser.g:542:2: ( () otherlv_1= When ( (lv_key_2_0= RULE_UPPERCASE ) ) otherlv_3= Key otherlv_4= Pressed this_BEGIN_5= RULE_BEGIN ( (lv_statements_6_0= ruleStatement ) )* this_END_7= RULE_END )
            {
            // InternalKlangParser.g:542:2: ( () otherlv_1= When ( (lv_key_2_0= RULE_UPPERCASE ) ) otherlv_3= Key otherlv_4= Pressed this_BEGIN_5= RULE_BEGIN ( (lv_statements_6_0= ruleStatement ) )* this_END_7= RULE_END )
            // InternalKlangParser.g:543:3: () otherlv_1= When ( (lv_key_2_0= RULE_UPPERCASE ) ) otherlv_3= Key otherlv_4= Pressed this_BEGIN_5= RULE_BEGIN ( (lv_statements_6_0= ruleStatement ) )* this_END_7= RULE_END
            {
            // InternalKlangParser.g:543:3: ()
            // InternalKlangParser.g:544:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKeyPressedAccess().getKeyPressedAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,When,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getKeyPressedAccess().getWhenKeyword_1());
            		
            // InternalKlangParser.g:554:3: ( (lv_key_2_0= RULE_UPPERCASE ) )
            // InternalKlangParser.g:555:4: (lv_key_2_0= RULE_UPPERCASE )
            {
            // InternalKlangParser.g:555:4: (lv_key_2_0= RULE_UPPERCASE )
            // InternalKlangParser.g:556:5: lv_key_2_0= RULE_UPPERCASE
            {
            lv_key_2_0=(Token)match(input,RULE_UPPERCASE,FOLLOW_14); 

            					newLeafNode(lv_key_2_0, grammarAccess.getKeyPressedAccess().getKeyUPPERCASETerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKeyPressedRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_2_0,
            						"com.kaurel.klang.xtext.Klang.UPPERCASE");
            				

            }


            }

            otherlv_3=(Token)match(input,Key,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getKeyPressedAccess().getKeyKeyword_3());
            		
            otherlv_4=(Token)match(input,Pressed,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getKeyPressedAccess().getPressedKeyword_4());
            		
            this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_11); 

            			newLeafNode(this_BEGIN_5, grammarAccess.getKeyPressedAccess().getBEGINTerminalRuleCall_5());
            		
            // InternalKlangParser.g:584:3: ( (lv_statements_6_0= ruleStatement ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Forever||(LA10_0>=Sleep && LA10_0<=While)||LA10_0==If||LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalKlangParser.g:585:4: (lv_statements_6_0= ruleStatement )
            	    {
            	    // InternalKlangParser.g:585:4: (lv_statements_6_0= ruleStatement )
            	    // InternalKlangParser.g:586:5: lv_statements_6_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getKeyPressedAccess().getStatementsStatementParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_statements_6_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getKeyPressedRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_6_0,
            	    						"com.kaurel.klang.xtext.Klang.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            this_END_7=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_7, grammarAccess.getKeyPressedAccess().getENDTerminalRuleCall_7());
            		

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
    // $ANTLR end "ruleKeyPressed"


    // $ANTLR start "entryRuleCollidesWith"
    // InternalKlangParser.g:611:1: entryRuleCollidesWith returns [EObject current=null] : iv_ruleCollidesWith= ruleCollidesWith EOF ;
    public final EObject entryRuleCollidesWith() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollidesWith = null;


        try {
            // InternalKlangParser.g:611:53: (iv_ruleCollidesWith= ruleCollidesWith EOF )
            // InternalKlangParser.g:612:2: iv_ruleCollidesWith= ruleCollidesWith EOF
            {
             newCompositeNode(grammarAccess.getCollidesWithRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollidesWith=ruleCollidesWith();

            state._fsp--;

             current =iv_ruleCollidesWith; 
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
    // $ANTLR end "entryRuleCollidesWith"


    // $ANTLR start "ruleCollidesWith"
    // InternalKlangParser.g:618:1: ruleCollidesWith returns [EObject current=null] : ( () otherlv_1= When otherlv_2= Collides otherlv_3= With ( (otherlv_4= RULE_ID ) ) this_BEGIN_5= RULE_BEGIN ( (lv_statements_6_0= ruleStatement ) )* this_END_7= RULE_END ) ;
    public final EObject ruleCollidesWith() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_BEGIN_5=null;
        Token this_END_7=null;
        EObject lv_statements_6_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:624:2: ( ( () otherlv_1= When otherlv_2= Collides otherlv_3= With ( (otherlv_4= RULE_ID ) ) this_BEGIN_5= RULE_BEGIN ( (lv_statements_6_0= ruleStatement ) )* this_END_7= RULE_END ) )
            // InternalKlangParser.g:625:2: ( () otherlv_1= When otherlv_2= Collides otherlv_3= With ( (otherlv_4= RULE_ID ) ) this_BEGIN_5= RULE_BEGIN ( (lv_statements_6_0= ruleStatement ) )* this_END_7= RULE_END )
            {
            // InternalKlangParser.g:625:2: ( () otherlv_1= When otherlv_2= Collides otherlv_3= With ( (otherlv_4= RULE_ID ) ) this_BEGIN_5= RULE_BEGIN ( (lv_statements_6_0= ruleStatement ) )* this_END_7= RULE_END )
            // InternalKlangParser.g:626:3: () otherlv_1= When otherlv_2= Collides otherlv_3= With ( (otherlv_4= RULE_ID ) ) this_BEGIN_5= RULE_BEGIN ( (lv_statements_6_0= ruleStatement ) )* this_END_7= RULE_END
            {
            // InternalKlangParser.g:626:3: ()
            // InternalKlangParser.g:627:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCollidesWithAccess().getCollidesWithAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,When,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getCollidesWithAccess().getWhenKeyword_1());
            		
            otherlv_2=(Token)match(input,Collides,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getCollidesWithAccess().getCollidesKeyword_2());
            		
            otherlv_3=(Token)match(input,With,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getCollidesWithAccess().getWithKeyword_3());
            		
            // InternalKlangParser.g:645:3: ( (otherlv_4= RULE_ID ) )
            // InternalKlangParser.g:646:4: (otherlv_4= RULE_ID )
            {
            // InternalKlangParser.g:646:4: (otherlv_4= RULE_ID )
            // InternalKlangParser.g:647:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollidesWithRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_4, grammarAccess.getCollidesWithAccess().getTargetSpriteEntityCrossReference_4_0());
            				

            }


            }

            this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_11); 

            			newLeafNode(this_BEGIN_5, grammarAccess.getCollidesWithAccess().getBEGINTerminalRuleCall_5());
            		
            // InternalKlangParser.g:662:3: ( (lv_statements_6_0= ruleStatement ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==Forever||(LA11_0>=Sleep && LA11_0<=While)||LA11_0==If||LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalKlangParser.g:663:4: (lv_statements_6_0= ruleStatement )
            	    {
            	    // InternalKlangParser.g:663:4: (lv_statements_6_0= ruleStatement )
            	    // InternalKlangParser.g:664:5: lv_statements_6_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getCollidesWithAccess().getStatementsStatementParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_statements_6_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCollidesWithRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_6_0,
            	    						"com.kaurel.klang.xtext.Klang.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            this_END_7=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_7, grammarAccess.getCollidesWithAccess().getENDTerminalRuleCall_7());
            		

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
    // $ANTLR end "ruleCollidesWith"


    // $ANTLR start "entryRuleWhileLoop"
    // InternalKlangParser.g:689:1: entryRuleWhileLoop returns [EObject current=null] : iv_ruleWhileLoop= ruleWhileLoop EOF ;
    public final EObject entryRuleWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileLoop = null;


        try {
            // InternalKlangParser.g:689:50: (iv_ruleWhileLoop= ruleWhileLoop EOF )
            // InternalKlangParser.g:690:2: iv_ruleWhileLoop= ruleWhileLoop EOF
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
    // InternalKlangParser.g:696:1: ruleWhileLoop returns [EObject current=null] : ( () otherlv_1= While ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_loopBlock_4_0= ruleStatement ) )* this_END_5= RULE_END ) ;
    public final EObject ruleWhileLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        EObject lv_predicate_2_0 = null;

        EObject lv_loopBlock_4_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:702:2: ( ( () otherlv_1= While ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_loopBlock_4_0= ruleStatement ) )* this_END_5= RULE_END ) )
            // InternalKlangParser.g:703:2: ( () otherlv_1= While ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_loopBlock_4_0= ruleStatement ) )* this_END_5= RULE_END )
            {
            // InternalKlangParser.g:703:2: ( () otherlv_1= While ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_loopBlock_4_0= ruleStatement ) )* this_END_5= RULE_END )
            // InternalKlangParser.g:704:3: () otherlv_1= While ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_loopBlock_4_0= ruleStatement ) )* this_END_5= RULE_END
            {
            // InternalKlangParser.g:704:3: ()
            // InternalKlangParser.g:705:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWhileLoopAccess().getWhileLoopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,While,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getWhileLoopAccess().getWhileKeyword_1());
            		
            // InternalKlangParser.g:715:3: ( (lv_predicate_2_0= ruleExpression ) )
            // InternalKlangParser.g:716:4: (lv_predicate_2_0= ruleExpression )
            {
            // InternalKlangParser.g:716:4: (lv_predicate_2_0= ruleExpression )
            // InternalKlangParser.g:717:5: lv_predicate_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhileLoopAccess().getPredicateExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_11); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getWhileLoopAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalKlangParser.g:738:3: ( (lv_loopBlock_4_0= ruleStatement ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Forever||(LA12_0>=Sleep && LA12_0<=While)||LA12_0==If||LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalKlangParser.g:739:4: (lv_loopBlock_4_0= ruleStatement )
            	    {
            	    // InternalKlangParser.g:739:4: (lv_loopBlock_4_0= ruleStatement )
            	    // InternalKlangParser.g:740:5: lv_loopBlock_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getWhileLoopAccess().getLoopBlockStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_11);
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
            	    break loop12;
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
    // InternalKlangParser.g:765:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalKlangParser.g:765:43: (iv_ruleIf= ruleIf EOF )
            // InternalKlangParser.g:766:2: iv_ruleIf= ruleIf EOF
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
    // InternalKlangParser.g:772:1: ruleIf returns [EObject current=null] : ( () otherlv_1= If ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_ifBlock_4_0= ruleStatement ) )* this_END_5= RULE_END ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        EObject lv_predicate_2_0 = null;

        EObject lv_ifBlock_4_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:778:2: ( ( () otherlv_1= If ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_ifBlock_4_0= ruleStatement ) )* this_END_5= RULE_END ) )
            // InternalKlangParser.g:779:2: ( () otherlv_1= If ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_ifBlock_4_0= ruleStatement ) )* this_END_5= RULE_END )
            {
            // InternalKlangParser.g:779:2: ( () otherlv_1= If ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_ifBlock_4_0= ruleStatement ) )* this_END_5= RULE_END )
            // InternalKlangParser.g:780:3: () otherlv_1= If ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_ifBlock_4_0= ruleStatement ) )* this_END_5= RULE_END
            {
            // InternalKlangParser.g:780:3: ()
            // InternalKlangParser.g:781:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIfAccess().getIfAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,If,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getIfAccess().getIfKeyword_1());
            		
            // InternalKlangParser.g:791:3: ( (lv_predicate_2_0= ruleExpression ) )
            // InternalKlangParser.g:792:4: (lv_predicate_2_0= ruleExpression )
            {
            // InternalKlangParser.g:792:4: (lv_predicate_2_0= ruleExpression )
            // InternalKlangParser.g:793:5: lv_predicate_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfAccess().getPredicateExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_11); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getIfAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalKlangParser.g:814:3: ( (lv_ifBlock_4_0= ruleStatement ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Forever||(LA13_0>=Sleep && LA13_0<=While)||LA13_0==If||LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalKlangParser.g:815:4: (lv_ifBlock_4_0= ruleStatement )
            	    {
            	    // InternalKlangParser.g:815:4: (lv_ifBlock_4_0= ruleStatement )
            	    // InternalKlangParser.g:816:5: lv_ifBlock_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getIfAccess().getIfBlockStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_11);
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
            	    break loop13;
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
    // InternalKlangParser.g:841:1: entryRuleForeverLoop returns [EObject current=null] : iv_ruleForeverLoop= ruleForeverLoop EOF ;
    public final EObject entryRuleForeverLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeverLoop = null;


        try {
            // InternalKlangParser.g:841:52: (iv_ruleForeverLoop= ruleForeverLoop EOF )
            // InternalKlangParser.g:842:2: iv_ruleForeverLoop= ruleForeverLoop EOF
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
    // InternalKlangParser.g:848:1: ruleForeverLoop returns [EObject current=null] : ( () otherlv_1= Forever this_BEGIN_2= RULE_BEGIN ( (lv_loopStatements_3_0= ruleStatement ) )* this_END_4= RULE_END ) ;
    public final EObject ruleForeverLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_loopStatements_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:854:2: ( ( () otherlv_1= Forever this_BEGIN_2= RULE_BEGIN ( (lv_loopStatements_3_0= ruleStatement ) )* this_END_4= RULE_END ) )
            // InternalKlangParser.g:855:2: ( () otherlv_1= Forever this_BEGIN_2= RULE_BEGIN ( (lv_loopStatements_3_0= ruleStatement ) )* this_END_4= RULE_END )
            {
            // InternalKlangParser.g:855:2: ( () otherlv_1= Forever this_BEGIN_2= RULE_BEGIN ( (lv_loopStatements_3_0= ruleStatement ) )* this_END_4= RULE_END )
            // InternalKlangParser.g:856:3: () otherlv_1= Forever this_BEGIN_2= RULE_BEGIN ( (lv_loopStatements_3_0= ruleStatement ) )* this_END_4= RULE_END
            {
            // InternalKlangParser.g:856:3: ()
            // InternalKlangParser.g:857:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getForeverLoopAccess().getForeverLoopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Forever,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getForeverLoopAccess().getForeverKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_11); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getForeverLoopAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalKlangParser.g:871:3: ( (lv_loopStatements_3_0= ruleStatement ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Forever||(LA14_0>=Sleep && LA14_0<=While)||LA14_0==If||LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalKlangParser.g:872:4: (lv_loopStatements_3_0= ruleStatement )
            	    {
            	    // InternalKlangParser.g:872:4: (lv_loopStatements_3_0= ruleStatement )
            	    // InternalKlangParser.g:873:5: lv_loopStatements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getForeverLoopAccess().getLoopStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
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
            	    break loop14;
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


    // $ANTLR start "entryRuleVariable"
    // InternalKlangParser.g:898:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalKlangParser.g:898:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalKlangParser.g:899:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalKlangParser.g:905:1: ruleVariable returns [EObject current=null] : (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_expression_3_0= ruleExpression ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:911:2: ( (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_expression_3_0= ruleExpression ) ) ) )
            // InternalKlangParser.g:912:2: (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_expression_3_0= ruleExpression ) ) )
            {
            // InternalKlangParser.g:912:2: (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_expression_3_0= ruleExpression ) ) )
            // InternalKlangParser.g:913:3: otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_expression_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,Var,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVarKeyword_0());
            		
            // InternalKlangParser.g:917:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalKlangParser.g:918:4: (lv_name_1_0= RULE_ID )
            {
            // InternalKlangParser.g:918:4: (lv_name_1_0= RULE_ID )
            // InternalKlangParser.g:919:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            otherlv_2=(Token)match(input,EqualsSign,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getEqualsSignKeyword_2());
            		
            // InternalKlangParser.g:939:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalKlangParser.g:940:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalKlangParser.g:940:4: (lv_expression_3_0= ruleExpression )
            // InternalKlangParser.g:941:5: lv_expression_3_0= ruleExpression
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


    // $ANTLR start "entryRuleVariableAssignment"
    // InternalKlangParser.g:962:1: entryRuleVariableAssignment returns [EObject current=null] : iv_ruleVariableAssignment= ruleVariableAssignment EOF ;
    public final EObject entryRuleVariableAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssignment = null;


        try {
            // InternalKlangParser.g:962:59: (iv_ruleVariableAssignment= ruleVariableAssignment EOF )
            // InternalKlangParser.g:963:2: iv_ruleVariableAssignment= ruleVariableAssignment EOF
            {
             newCompositeNode(grammarAccess.getVariableAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableAssignment=ruleVariableAssignment();

            state._fsp--;

             current =iv_ruleVariableAssignment; 
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
    // $ANTLR end "entryRuleVariableAssignment"


    // $ANTLR start "ruleVariableAssignment"
    // InternalKlangParser.g:969:1: ruleVariableAssignment returns [EObject current=null] : ( ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleVariableAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_variableName_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:975:2: ( ( ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalKlangParser.g:976:2: ( ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalKlangParser.g:976:2: ( ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalKlangParser.g:977:3: ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalKlangParser.g:977:3: ( (lv_variableName_0_0= RULE_ID ) )
            // InternalKlangParser.g:978:4: (lv_variableName_0_0= RULE_ID )
            {
            // InternalKlangParser.g:978:4: (lv_variableName_0_0= RULE_ID )
            // InternalKlangParser.g:979:5: lv_variableName_0_0= RULE_ID
            {
            lv_variableName_0_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_variableName_0_0, grammarAccess.getVariableAssignmentAccess().getVariableNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableAssignmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"variableName",
            						lv_variableName_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_1());
            		
            // InternalKlangParser.g:999:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalKlangParser.g:1000:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalKlangParser.g:1000:4: (lv_expression_2_0= ruleExpression )
            // InternalKlangParser.g:1001:5: lv_expression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getVariableAssignmentAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableAssignmentRule());
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
    // $ANTLR end "ruleVariableAssignment"


    // $ANTLR start "entryRuleSleep"
    // InternalKlangParser.g:1022:1: entryRuleSleep returns [EObject current=null] : iv_ruleSleep= ruleSleep EOF ;
    public final EObject entryRuleSleep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSleep = null;


        try {
            // InternalKlangParser.g:1022:46: (iv_ruleSleep= ruleSleep EOF )
            // InternalKlangParser.g:1023:2: iv_ruleSleep= ruleSleep EOF
            {
             newCompositeNode(grammarAccess.getSleepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSleep=ruleSleep();

            state._fsp--;

             current =iv_ruleSleep; 
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
    // $ANTLR end "entryRuleSleep"


    // $ANTLR start "ruleSleep"
    // InternalKlangParser.g:1029:1: ruleSleep returns [EObject current=null] : ( () otherlv_1= Sleep otherlv_2= LeftParenthesis ( (lv_duration_3_0= RULE_DECIMAL ) ) otherlv_4= RightParenthesis ) ;
    public final EObject ruleSleep() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_duration_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalKlangParser.g:1035:2: ( ( () otherlv_1= Sleep otherlv_2= LeftParenthesis ( (lv_duration_3_0= RULE_DECIMAL ) ) otherlv_4= RightParenthesis ) )
            // InternalKlangParser.g:1036:2: ( () otherlv_1= Sleep otherlv_2= LeftParenthesis ( (lv_duration_3_0= RULE_DECIMAL ) ) otherlv_4= RightParenthesis )
            {
            // InternalKlangParser.g:1036:2: ( () otherlv_1= Sleep otherlv_2= LeftParenthesis ( (lv_duration_3_0= RULE_DECIMAL ) ) otherlv_4= RightParenthesis )
            // InternalKlangParser.g:1037:3: () otherlv_1= Sleep otherlv_2= LeftParenthesis ( (lv_duration_3_0= RULE_DECIMAL ) ) otherlv_4= RightParenthesis
            {
            // InternalKlangParser.g:1037:3: ()
            // InternalKlangParser.g:1038:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSleepAccess().getSleepAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Sleep,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getSleepAccess().getSleepKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getSleepAccess().getLeftParenthesisKeyword_2());
            		
            // InternalKlangParser.g:1052:3: ( (lv_duration_3_0= RULE_DECIMAL ) )
            // InternalKlangParser.g:1053:4: (lv_duration_3_0= RULE_DECIMAL )
            {
            // InternalKlangParser.g:1053:4: (lv_duration_3_0= RULE_DECIMAL )
            // InternalKlangParser.g:1054:5: lv_duration_3_0= RULE_DECIMAL
            {
            lv_duration_3_0=(Token)match(input,RULE_DECIMAL,FOLLOW_22); 

            					newLeafNode(lv_duration_3_0, grammarAccess.getSleepAccess().getDurationDECIMALTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSleepRule());
            					}
            					setWithLastConsumed(
            						current,
            						"duration",
            						lv_duration_3_0,
            						"com.kaurel.klang.xtext.Klang.DECIMAL");
            				

            }


            }

            otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSleepAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleSleep"


    // $ANTLR start "entryRuleExpression"
    // InternalKlangParser.g:1078:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalKlangParser.g:1078:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalKlangParser.g:1079:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalKlangParser.g:1085:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1091:2: (this_Or_0= ruleOr )
            // InternalKlangParser.g:1092:2: this_Or_0= ruleOr
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
    // InternalKlangParser.g:1103:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalKlangParser.g:1103:43: (iv_ruleOr= ruleOr EOF )
            // InternalKlangParser.g:1104:2: iv_ruleOr= ruleOr EOF
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
    // InternalKlangParser.g:1110:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= Or ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1116:2: ( (this_And_0= ruleAnd ( () otherlv_2= Or ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalKlangParser.g:1117:2: (this_And_0= ruleAnd ( () otherlv_2= Or ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalKlangParser.g:1117:2: (this_And_0= ruleAnd ( () otherlv_2= Or ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalKlangParser.g:1118:3: this_And_0= ruleAnd ( () otherlv_2= Or ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKlangParser.g:1126:3: ( () otherlv_2= Or ( (lv_right_3_0= ruleAnd ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Or) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalKlangParser.g:1127:4: () otherlv_2= Or ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalKlangParser.g:1127:4: ()
            	    // InternalKlangParser.g:1128:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,Or,FOLLOW_18); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getOrKeyword_1_1());
            	    			
            	    // InternalKlangParser.g:1138:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalKlangParser.g:1139:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalKlangParser.g:1139:5: (lv_right_3_0= ruleAnd )
            	    // InternalKlangParser.g:1140:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalKlangParser.g:1162:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalKlangParser.g:1162:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalKlangParser.g:1163:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalKlangParser.g:1169:1: ruleAnd returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () otherlv_2= And ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1175:2: ( (this_Comparison_0= ruleComparison ( () otherlv_2= And ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalKlangParser.g:1176:2: (this_Comparison_0= ruleComparison ( () otherlv_2= And ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalKlangParser.g:1176:2: (this_Comparison_0= ruleComparison ( () otherlv_2= And ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalKlangParser.g:1177:3: this_Comparison_0= ruleComparison ( () otherlv_2= And ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKlangParser.g:1185:3: ( () otherlv_2= And ( (lv_right_3_0= ruleComparison ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==And) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalKlangParser.g:1186:4: () otherlv_2= And ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalKlangParser.g:1186:4: ()
            	    // InternalKlangParser.g:1187:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,And,FOLLOW_18); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAndKeyword_1_1());
            	    			
            	    // InternalKlangParser.g:1197:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalKlangParser.g:1198:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalKlangParser.g:1198:5: (lv_right_3_0= ruleComparison )
            	    // InternalKlangParser.g:1199:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRulePlus"
    // InternalKlangParser.g:1221:1: entryRulePlus returns [EObject current=null] : iv_rulePlus= rulePlus EOF ;
    public final EObject entryRulePlus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlus = null;


        try {
            // InternalKlangParser.g:1221:45: (iv_rulePlus= rulePlus EOF )
            // InternalKlangParser.g:1222:2: iv_rulePlus= rulePlus EOF
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
    // InternalKlangParser.g:1228:1: rulePlus returns [EObject current=null] : (this_Minus_0= ruleMinus ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMinus ) ) )* ) ;
    public final EObject rulePlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Minus_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1234:2: ( (this_Minus_0= ruleMinus ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMinus ) ) )* ) )
            // InternalKlangParser.g:1235:2: (this_Minus_0= ruleMinus ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMinus ) ) )* )
            {
            // InternalKlangParser.g:1235:2: (this_Minus_0= ruleMinus ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMinus ) ) )* )
            // InternalKlangParser.g:1236:3: this_Minus_0= ruleMinus ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMinus ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusAccess().getMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_Minus_0=ruleMinus();

            state._fsp--;


            			current = this_Minus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKlangParser.g:1244:3: ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMinus ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==PlusSign) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalKlangParser.g:1245:4: () otherlv_2= PlusSign ( (lv_right_3_0= ruleMinus ) )
            	    {
            	    // InternalKlangParser.g:1245:4: ()
            	    // InternalKlangParser.g:1246:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPlusAccess().getPlusLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,PlusSign,FOLLOW_18); 

            	    				newLeafNode(otherlv_2, grammarAccess.getPlusAccess().getPlusSignKeyword_1_1());
            	    			
            	    // InternalKlangParser.g:1256:4: ( (lv_right_3_0= ruleMinus ) )
            	    // InternalKlangParser.g:1257:5: (lv_right_3_0= ruleMinus )
            	    {
            	    // InternalKlangParser.g:1257:5: (lv_right_3_0= ruleMinus )
            	    // InternalKlangParser.g:1258:6: lv_right_3_0= ruleMinus
            	    {

            	    						newCompositeNode(grammarAccess.getPlusAccess().getRightMinusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
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
    // $ANTLR end "rulePlus"


    // $ANTLR start "entryRuleMinus"
    // InternalKlangParser.g:1280:1: entryRuleMinus returns [EObject current=null] : iv_ruleMinus= ruleMinus EOF ;
    public final EObject entryRuleMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinus = null;


        try {
            // InternalKlangParser.g:1280:46: (iv_ruleMinus= ruleMinus EOF )
            // InternalKlangParser.g:1281:2: iv_ruleMinus= ruleMinus EOF
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
    // InternalKlangParser.g:1287:1: ruleMinus returns [EObject current=null] : (this_Multiply_0= ruleMultiply ( () otherlv_2= HyphenMinus ( (lv_right_3_0= ruleMultiply ) ) )* ) ;
    public final EObject ruleMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Multiply_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1293:2: ( (this_Multiply_0= ruleMultiply ( () otherlv_2= HyphenMinus ( (lv_right_3_0= ruleMultiply ) ) )* ) )
            // InternalKlangParser.g:1294:2: (this_Multiply_0= ruleMultiply ( () otherlv_2= HyphenMinus ( (lv_right_3_0= ruleMultiply ) ) )* )
            {
            // InternalKlangParser.g:1294:2: (this_Multiply_0= ruleMultiply ( () otherlv_2= HyphenMinus ( (lv_right_3_0= ruleMultiply ) ) )* )
            // InternalKlangParser.g:1295:3: this_Multiply_0= ruleMultiply ( () otherlv_2= HyphenMinus ( (lv_right_3_0= ruleMultiply ) ) )*
            {

            			newCompositeNode(grammarAccess.getMinusAccess().getMultiplyParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_Multiply_0=ruleMultiply();

            state._fsp--;


            			current = this_Multiply_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKlangParser.g:1303:3: ( () otherlv_2= HyphenMinus ( (lv_right_3_0= ruleMultiply ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==HyphenMinus) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalKlangParser.g:1304:4: () otherlv_2= HyphenMinus ( (lv_right_3_0= ruleMultiply ) )
            	    {
            	    // InternalKlangParser.g:1304:4: ()
            	    // InternalKlangParser.g:1305:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMinusAccess().getMinusLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,HyphenMinus,FOLLOW_18); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMinusAccess().getHyphenMinusKeyword_1_1());
            	    			
            	    // InternalKlangParser.g:1315:4: ( (lv_right_3_0= ruleMultiply ) )
            	    // InternalKlangParser.g:1316:5: (lv_right_3_0= ruleMultiply )
            	    {
            	    // InternalKlangParser.g:1316:5: (lv_right_3_0= ruleMultiply )
            	    // InternalKlangParser.g:1317:6: lv_right_3_0= ruleMultiply
            	    {

            	    						newCompositeNode(grammarAccess.getMinusAccess().getRightMultiplyParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_26);
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
    // $ANTLR end "ruleMinus"


    // $ANTLR start "entryRuleMultiply"
    // InternalKlangParser.g:1339:1: entryRuleMultiply returns [EObject current=null] : iv_ruleMultiply= ruleMultiply EOF ;
    public final EObject entryRuleMultiply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiply = null;


        try {
            // InternalKlangParser.g:1339:49: (iv_ruleMultiply= ruleMultiply EOF )
            // InternalKlangParser.g:1340:2: iv_ruleMultiply= ruleMultiply EOF
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
    // InternalKlangParser.g:1346:1: ruleMultiply returns [EObject current=null] : (this_Divide_0= ruleDivide ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleDivide ) ) )* ) ;
    public final EObject ruleMultiply() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Divide_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1352:2: ( (this_Divide_0= ruleDivide ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleDivide ) ) )* ) )
            // InternalKlangParser.g:1353:2: (this_Divide_0= ruleDivide ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleDivide ) ) )* )
            {
            // InternalKlangParser.g:1353:2: (this_Divide_0= ruleDivide ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleDivide ) ) )* )
            // InternalKlangParser.g:1354:3: this_Divide_0= ruleDivide ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleDivide ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplyAccess().getDivideParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_Divide_0=ruleDivide();

            state._fsp--;


            			current = this_Divide_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKlangParser.g:1362:3: ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleDivide ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==Asterisk) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalKlangParser.g:1363:4: () otherlv_2= Asterisk ( (lv_right_3_0= ruleDivide ) )
            	    {
            	    // InternalKlangParser.g:1363:4: ()
            	    // InternalKlangParser.g:1364:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplyAccess().getMultiplyLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,Asterisk,FOLLOW_18); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMultiplyAccess().getAsteriskKeyword_1_1());
            	    			
            	    // InternalKlangParser.g:1374:4: ( (lv_right_3_0= ruleDivide ) )
            	    // InternalKlangParser.g:1375:5: (lv_right_3_0= ruleDivide )
            	    {
            	    // InternalKlangParser.g:1375:5: (lv_right_3_0= ruleDivide )
            	    // InternalKlangParser.g:1376:6: lv_right_3_0= ruleDivide
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplyAccess().getRightDivideParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_27);
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
            	    break loop19;
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
    // InternalKlangParser.g:1398:1: entryRuleDivide returns [EObject current=null] : iv_ruleDivide= ruleDivide EOF ;
    public final EObject entryRuleDivide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivide = null;


        try {
            // InternalKlangParser.g:1398:47: (iv_ruleDivide= ruleDivide EOF )
            // InternalKlangParser.g:1399:2: iv_ruleDivide= ruleDivide EOF
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
    // InternalKlangParser.g:1405:1: ruleDivide returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= Solidus ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleDivide() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1411:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= Solidus ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) )
            // InternalKlangParser.g:1412:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= Solidus ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            {
            // InternalKlangParser.g:1412:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= Solidus ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            // InternalKlangParser.g:1413:3: this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= Solidus ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getDivideAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKlangParser.g:1421:3: ( () otherlv_2= Solidus ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==Solidus) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalKlangParser.g:1422:4: () otherlv_2= Solidus ( (lv_right_3_0= rulePrimaryExpression ) )
            	    {
            	    // InternalKlangParser.g:1422:4: ()
            	    // InternalKlangParser.g:1423:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getDivideAccess().getDivideLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,Solidus,FOLLOW_18); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDivideAccess().getSolidusKeyword_1_1());
            	    			
            	    // InternalKlangParser.g:1433:4: ( (lv_right_3_0= rulePrimaryExpression ) )
            	    // InternalKlangParser.g:1434:5: (lv_right_3_0= rulePrimaryExpression )
            	    {
            	    // InternalKlangParser.g:1434:5: (lv_right_3_0= rulePrimaryExpression )
            	    // InternalKlangParser.g:1435:6: lv_right_3_0= rulePrimaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getDivideAccess().getRightPrimaryExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_28);
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
    // $ANTLR end "ruleDivide"


    // $ANTLR start "entryRuleComparison"
    // InternalKlangParser.g:1457:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalKlangParser.g:1457:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalKlangParser.g:1458:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalKlangParser.g:1464:1: ruleComparison returns [EObject current=null] : (this_Plus_0= rulePlus ( ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSignEqualsSign () ) | (otherlv_5= GreaterThanSign () ) ) ( (lv_right_7_0= rulePlus ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_Plus_0 = null;

        EObject lv_right_7_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1470:2: ( (this_Plus_0= rulePlus ( ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSignEqualsSign () ) | (otherlv_5= GreaterThanSign () ) ) ( (lv_right_7_0= rulePlus ) ) )* ) )
            // InternalKlangParser.g:1471:2: (this_Plus_0= rulePlus ( ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSignEqualsSign () ) | (otherlv_5= GreaterThanSign () ) ) ( (lv_right_7_0= rulePlus ) ) )* )
            {
            // InternalKlangParser.g:1471:2: (this_Plus_0= rulePlus ( ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSignEqualsSign () ) | (otherlv_5= GreaterThanSign () ) ) ( (lv_right_7_0= rulePlus ) ) )* )
            // InternalKlangParser.g:1472:3: this_Plus_0= rulePlus ( ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSignEqualsSign () ) | (otherlv_5= GreaterThanSign () ) ) ( (lv_right_7_0= rulePlus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_Plus_0=rulePlus();

            state._fsp--;


            			current = this_Plus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKlangParser.g:1480:3: ( ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSignEqualsSign () ) | (otherlv_5= GreaterThanSign () ) ) ( (lv_right_7_0= rulePlus ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==EqualsSignEqualsSign||LA22_0==LessThanSign||LA22_0==GreaterThanSign) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalKlangParser.g:1481:4: ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSignEqualsSign () ) | (otherlv_5= GreaterThanSign () ) ) ( (lv_right_7_0= rulePlus ) )
            	    {
            	    // InternalKlangParser.g:1481:4: ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSignEqualsSign () ) | (otherlv_5= GreaterThanSign () ) )
            	    int alt21=3;
            	    switch ( input.LA(1) ) {
            	    case LessThanSign:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case EqualsSignEqualsSign:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case GreaterThanSign:
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
            	            // InternalKlangParser.g:1482:5: (otherlv_1= LessThanSign () )
            	            {
            	            // InternalKlangParser.g:1482:5: (otherlv_1= LessThanSign () )
            	            // InternalKlangParser.g:1483:6: otherlv_1= LessThanSign ()
            	            {
            	            otherlv_1=(Token)match(input,LessThanSign,FOLLOW_18); 

            	            						newLeafNode(otherlv_1, grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_0_0());
            	            					
            	            // InternalKlangParser.g:1487:6: ()
            	            // InternalKlangParser.g:1488:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getComparisonAccess().getLessThanLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalKlangParser.g:1496:5: (otherlv_3= EqualsSignEqualsSign () )
            	            {
            	            // InternalKlangParser.g:1496:5: (otherlv_3= EqualsSignEqualsSign () )
            	            // InternalKlangParser.g:1497:6: otherlv_3= EqualsSignEqualsSign ()
            	            {
            	            otherlv_3=(Token)match(input,EqualsSignEqualsSign,FOLLOW_18); 

            	            						newLeafNode(otherlv_3, grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_1_0_1_0());
            	            					
            	            // InternalKlangParser.g:1501:6: ()
            	            // InternalKlangParser.g:1502:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getComparisonAccess().getEqualLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalKlangParser.g:1510:5: (otherlv_5= GreaterThanSign () )
            	            {
            	            // InternalKlangParser.g:1510:5: (otherlv_5= GreaterThanSign () )
            	            // InternalKlangParser.g:1511:6: otherlv_5= GreaterThanSign ()
            	            {
            	            otherlv_5=(Token)match(input,GreaterThanSign,FOLLOW_18); 

            	            						newLeafNode(otherlv_5, grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_2_0());
            	            					
            	            // InternalKlangParser.g:1515:6: ()
            	            // InternalKlangParser.g:1516:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getComparisonAccess().getGreaterThanLeftAction_1_0_2_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalKlangParser.g:1524:4: ( (lv_right_7_0= rulePlus ) )
            	    // InternalKlangParser.g:1525:5: (lv_right_7_0= rulePlus )
            	    {
            	    // InternalKlangParser.g:1525:5: (lv_right_7_0= rulePlus )
            	    // InternalKlangParser.g:1526:6: lv_right_7_0= rulePlus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_29);
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
            	    break loop22;
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


    // $ANTLR start "entryRuleFunctionCall"
    // InternalKlangParser.g:1548:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalKlangParser.g:1548:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalKlangParser.g:1549:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;

             current =iv_ruleFunctionCall; 
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
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalKlangParser.g:1555:1: ruleFunctionCall returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= RightParenthesis ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1561:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= RightParenthesis ) )
            // InternalKlangParser.g:1562:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= RightParenthesis )
            {
            // InternalKlangParser.g:1562:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= RightParenthesis )
            // InternalKlangParser.g:1563:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= RightParenthesis
            {
            // InternalKlangParser.g:1563:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalKlangParser.g:1564:4: (lv_name_0_0= RULE_ID )
            {
            // InternalKlangParser.g:1564:4: (lv_name_0_0= RULE_ID )
            // InternalKlangParser.g:1565:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFunctionCallAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionCallRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalKlangParser.g:1585:3: ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==False||LA24_0==True||LA24_0==Not||LA24_0==LeftParenthesis||(LA24_0>=RULE_DECIMAL && LA24_0<=RULE_STRING)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalKlangParser.g:1586:4: ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )*
                    {
                    // InternalKlangParser.g:1586:4: ( (lv_parameters_2_0= ruleExpression ) )
                    // InternalKlangParser.g:1587:5: (lv_parameters_2_0= ruleExpression )
                    {
                    // InternalKlangParser.g:1587:5: (lv_parameters_2_0= ruleExpression )
                    // InternalKlangParser.g:1588:6: lv_parameters_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_parameters_2_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_2_0,
                    							"com.kaurel.klang.xtext.Klang.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKlangParser.g:1605:4: (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==Comma) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalKlangParser.g:1606:5: otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_18); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalKlangParser.g:1610:5: ( (lv_parameters_4_0= ruleExpression ) )
                    	    // InternalKlangParser.g:1611:6: (lv_parameters_4_0= ruleExpression )
                    	    {
                    	    // InternalKlangParser.g:1611:6: (lv_parameters_4_0= ruleExpression )
                    	    // InternalKlangParser.g:1612:7: lv_parameters_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    lv_parameters_4_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionCallRule());
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
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalKlangParser.g:1639:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalKlangParser.g:1639:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalKlangParser.g:1640:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalKlangParser.g:1646:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | ( () otherlv_4= Not ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | this_FunctionCall_6= ruleFunctionCall | this_AtomicExpression_7= ruleAtomicExpression ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Expression_1 = null;

        EObject lv_expression_5_0 = null;

        EObject this_FunctionCall_6 = null;

        EObject this_AtomicExpression_7 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1652:2: ( ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | ( () otherlv_4= Not ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | this_FunctionCall_6= ruleFunctionCall | this_AtomicExpression_7= ruleAtomicExpression ) )
            // InternalKlangParser.g:1653:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | ( () otherlv_4= Not ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | this_FunctionCall_6= ruleFunctionCall | this_AtomicExpression_7= ruleAtomicExpression )
            {
            // InternalKlangParser.g:1653:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | ( () otherlv_4= Not ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | this_FunctionCall_6= ruleFunctionCall | this_AtomicExpression_7= ruleAtomicExpression )
            int alt25=4;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt25=1;
                }
                break;
            case Not:
                {
                alt25=2;
                }
                break;
            case RULE_ID:
                {
                int LA25_3 = input.LA(2);

                if ( (LA25_3==EOF||LA25_3==Forever||LA25_3==Sprite||(LA25_3>=Scene && LA25_3<=While)||LA25_3==When||LA25_3==And||(LA25_3>=Var && LA25_3<=Or)||(LA25_3>=RightParenthesis && LA25_3<=LessThanSign)||(LA25_3>=GreaterThanSign && LA25_3<=RULE_END)||LA25_3==RULE_ID) ) {
                    alt25=4;
                }
                else if ( (LA25_3==LeftParenthesis) ) {
                    alt25=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 3, input);

                    throw nvae;
                }
                }
                break;
            case False:
            case True:
            case RULE_DECIMAL:
            case RULE_STRING:
                {
                alt25=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalKlangParser.g:1654:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    {
                    // InternalKlangParser.g:1654:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    // InternalKlangParser.g:1655:4: otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis
                    {
                    otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_18); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_22);
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
                    // InternalKlangParser.g:1673:3: ( () otherlv_4= Not ( (lv_expression_5_0= rulePrimaryExpression ) ) )
                    {
                    // InternalKlangParser.g:1673:3: ( () otherlv_4= Not ( (lv_expression_5_0= rulePrimaryExpression ) ) )
                    // InternalKlangParser.g:1674:4: () otherlv_4= Not ( (lv_expression_5_0= rulePrimaryExpression ) )
                    {
                    // InternalKlangParser.g:1674:4: ()
                    // InternalKlangParser.g:1675:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getNotAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,Not,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getNotKeyword_1_1());
                    			
                    // InternalKlangParser.g:1685:4: ( (lv_expression_5_0= rulePrimaryExpression ) )
                    // InternalKlangParser.g:1686:5: (lv_expression_5_0= rulePrimaryExpression )
                    {
                    // InternalKlangParser.g:1686:5: (lv_expression_5_0= rulePrimaryExpression )
                    // InternalKlangParser.g:1687:6: lv_expression_5_0= rulePrimaryExpression
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
                    // InternalKlangParser.g:1706:3: this_FunctionCall_6= ruleFunctionCall
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFunctionCallParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionCall_6=ruleFunctionCall();

                    state._fsp--;


                    			current = this_FunctionCall_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalKlangParser.g:1715:3: this_AtomicExpression_7= ruleAtomicExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getAtomicExpressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_AtomicExpression_7=ruleAtomicExpression();

                    state._fsp--;


                    			current = this_AtomicExpression_7;
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


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalKlangParser.g:1727:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalKlangParser.g:1727:57: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalKlangParser.g:1728:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
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
    // InternalKlangParser.g:1734:1: ruleAtomicExpression returns [EObject current=null] : ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) | ( () ( (lv_value_4_0= RULE_DECIMAL ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( (lv_variableName_8_0= RULE_ID ) ) ) ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token lv_value_4_0=null;
        Token lv_value_6_0=null;
        Token lv_variableName_8_0=null;


        	enterRule();

        try {
            // InternalKlangParser.g:1740:2: ( ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) | ( () ( (lv_value_4_0= RULE_DECIMAL ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( (lv_variableName_8_0= RULE_ID ) ) ) ) )
            // InternalKlangParser.g:1741:2: ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) | ( () ( (lv_value_4_0= RULE_DECIMAL ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( (lv_variableName_8_0= RULE_ID ) ) ) )
            {
            // InternalKlangParser.g:1741:2: ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) | ( () ( (lv_value_4_0= RULE_DECIMAL ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( (lv_variableName_8_0= RULE_ID ) ) ) )
            int alt27=4;
            switch ( input.LA(1) ) {
            case False:
            case True:
                {
                alt27=1;
                }
                break;
            case RULE_DECIMAL:
                {
                alt27=2;
                }
                break;
            case RULE_STRING:
                {
                alt27=3;
                }
                break;
            case RULE_ID:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalKlangParser.g:1742:3: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
                    {
                    // InternalKlangParser.g:1742:3: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
                    // InternalKlangParser.g:1743:4: () ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
                    {
                    // InternalKlangParser.g:1743:4: ()
                    // InternalKlangParser.g:1744:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicExpressionAccess().getBooleanLiteralAction_0_0(),
                    						current);
                    				

                    }

                    // InternalKlangParser.g:1750:4: ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==True) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==False) ) {
                        alt26=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalKlangParser.g:1751:5: ( (lv_value_1_0= True ) )
                            {
                            // InternalKlangParser.g:1751:5: ( (lv_value_1_0= True ) )
                            // InternalKlangParser.g:1752:6: (lv_value_1_0= True )
                            {
                            // InternalKlangParser.g:1752:6: (lv_value_1_0= True )
                            // InternalKlangParser.g:1753:7: lv_value_1_0= True
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
                            // InternalKlangParser.g:1766:5: otherlv_2= False
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
                    // InternalKlangParser.g:1773:3: ( () ( (lv_value_4_0= RULE_DECIMAL ) ) )
                    {
                    // InternalKlangParser.g:1773:3: ( () ( (lv_value_4_0= RULE_DECIMAL ) ) )
                    // InternalKlangParser.g:1774:4: () ( (lv_value_4_0= RULE_DECIMAL ) )
                    {
                    // InternalKlangParser.g:1774:4: ()
                    // InternalKlangParser.g:1775:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicExpressionAccess().getDoubleLiteralAction_1_0(),
                    						current);
                    				

                    }

                    // InternalKlangParser.g:1781:4: ( (lv_value_4_0= RULE_DECIMAL ) )
                    // InternalKlangParser.g:1782:5: (lv_value_4_0= RULE_DECIMAL )
                    {
                    // InternalKlangParser.g:1782:5: (lv_value_4_0= RULE_DECIMAL )
                    // InternalKlangParser.g:1783:6: lv_value_4_0= RULE_DECIMAL
                    {
                    lv_value_4_0=(Token)match(input,RULE_DECIMAL,FOLLOW_2); 

                    						newLeafNode(lv_value_4_0, grammarAccess.getAtomicExpressionAccess().getValueDECIMALTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"com.kaurel.klang.xtext.Klang.DECIMAL");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalKlangParser.g:1801:3: ( () ( (lv_value_6_0= RULE_STRING ) ) )
                    {
                    // InternalKlangParser.g:1801:3: ( () ( (lv_value_6_0= RULE_STRING ) ) )
                    // InternalKlangParser.g:1802:4: () ( (lv_value_6_0= RULE_STRING ) )
                    {
                    // InternalKlangParser.g:1802:4: ()
                    // InternalKlangParser.g:1803:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicExpressionAccess().getStringLiteralAction_2_0(),
                    						current);
                    				

                    }

                    // InternalKlangParser.g:1809:4: ( (lv_value_6_0= RULE_STRING ) )
                    // InternalKlangParser.g:1810:5: (lv_value_6_0= RULE_STRING )
                    {
                    // InternalKlangParser.g:1810:5: (lv_value_6_0= RULE_STRING )
                    // InternalKlangParser.g:1811:6: lv_value_6_0= RULE_STRING
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
                    // InternalKlangParser.g:1829:3: ( () ( (lv_variableName_8_0= RULE_ID ) ) )
                    {
                    // InternalKlangParser.g:1829:3: ( () ( (lv_variableName_8_0= RULE_ID ) ) )
                    // InternalKlangParser.g:1830:4: () ( (lv_variableName_8_0= RULE_ID ) )
                    {
                    // InternalKlangParser.g:1830:4: ()
                    // InternalKlangParser.g:1831:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicExpressionAccess().getVariableRefAction_3_0(),
                    						current);
                    				

                    }

                    // InternalKlangParser.g:1837:4: ( (lv_variableName_8_0= RULE_ID ) )
                    // InternalKlangParser.g:1838:5: (lv_variableName_8_0= RULE_ID )
                    {
                    // InternalKlangParser.g:1838:5: (lv_variableName_8_0= RULE_ID )
                    // InternalKlangParser.g:1839:6: lv_variableName_8_0= RULE_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200902L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000902L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000001000210900L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000011000803040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000038002108400L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000500400002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000038006108400L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000024000000L});

}