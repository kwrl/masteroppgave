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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Collides", "Clicked", "Forever", "Pressed", "Double", "Sprite", "Starts", "False", "Scene", "Sleep", "While", "Else", "Game", "True", "When", "With", "And", "Int", "Key", "Not", "Var", "EqualsSignEqualsSign", "If", "Or", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "LessThanSign", "EqualsSign", "GreaterThanSign", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
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
        	return "Program";
       	}

       	@Override
       	protected KlangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalKlangParser.g:57:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalKlangParser.g:57:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalKlangParser.g:58:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalKlangParser.g:64:1: ruleProgram returns [EObject current=null] : ( ( (lv_sceneActor_0_0= ruleSceneActor ) ) ( (lv_spriteActors_1_0= ruleSpriteActor ) )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_sceneActor_0_0 = null;

        EObject lv_spriteActors_1_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:70:2: ( ( ( (lv_sceneActor_0_0= ruleSceneActor ) ) ( (lv_spriteActors_1_0= ruleSpriteActor ) )* ) )
            // InternalKlangParser.g:71:2: ( ( (lv_sceneActor_0_0= ruleSceneActor ) ) ( (lv_spriteActors_1_0= ruleSpriteActor ) )* )
            {
            // InternalKlangParser.g:71:2: ( ( (lv_sceneActor_0_0= ruleSceneActor ) ) ( (lv_spriteActors_1_0= ruleSpriteActor ) )* )
            // InternalKlangParser.g:72:3: ( (lv_sceneActor_0_0= ruleSceneActor ) ) ( (lv_spriteActors_1_0= ruleSpriteActor ) )*
            {
            // InternalKlangParser.g:72:3: ( (lv_sceneActor_0_0= ruleSceneActor ) )
            // InternalKlangParser.g:73:4: (lv_sceneActor_0_0= ruleSceneActor )
            {
            // InternalKlangParser.g:73:4: (lv_sceneActor_0_0= ruleSceneActor )
            // InternalKlangParser.g:74:5: lv_sceneActor_0_0= ruleSceneActor
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getSceneActorSceneActorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_sceneActor_0_0=ruleSceneActor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"sceneActor",
            						lv_sceneActor_0_0,
            						"com.kaurel.klang.xtext.Klang.SceneActor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKlangParser.g:91:3: ( (lv_spriteActors_1_0= ruleSpriteActor ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Sprite) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKlangParser.g:92:4: (lv_spriteActors_1_0= ruleSpriteActor )
            	    {
            	    // InternalKlangParser.g:92:4: (lv_spriteActors_1_0= ruleSpriteActor )
            	    // InternalKlangParser.g:93:5: lv_spriteActors_1_0= ruleSpriteActor
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getSpriteActorsSpriteActorParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_spriteActors_1_0=ruleSpriteActor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"spriteActors",
            	    						lv_spriteActors_1_0,
            	    						"com.kaurel.klang.xtext.Klang.SpriteActor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleSceneActor"
    // InternalKlangParser.g:114:1: entryRuleSceneActor returns [EObject current=null] : iv_ruleSceneActor= ruleSceneActor EOF ;
    public final EObject entryRuleSceneActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSceneActor = null;


        try {
            // InternalKlangParser.g:114:51: (iv_ruleSceneActor= ruleSceneActor EOF )
            // InternalKlangParser.g:115:2: iv_ruleSceneActor= ruleSceneActor EOF
            {
             newCompositeNode(grammarAccess.getSceneActorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSceneActor=ruleSceneActor();

            state._fsp--;

             current =iv_ruleSceneActor; 
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
    // $ANTLR end "entryRuleSceneActor"


    // $ANTLR start "ruleSceneActor"
    // InternalKlangParser.g:121:1: ruleSceneActor returns [EObject current=null] : ( () otherlv_1= Scene ( (lv_name_2_0= RULE_ID ) ) this_BEGIN_3= RULE_BEGIN ( (lv_localVariables_4_0= ruleVariableDeclaration ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* this_END_6= RULE_END ) ;
    public final EObject ruleSceneActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_BEGIN_3=null;
        Token this_END_6=null;
        EObject lv_localVariables_4_0 = null;

        EObject lv_eventHandlers_5_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:127:2: ( ( () otherlv_1= Scene ( (lv_name_2_0= RULE_ID ) ) this_BEGIN_3= RULE_BEGIN ( (lv_localVariables_4_0= ruleVariableDeclaration ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* this_END_6= RULE_END ) )
            // InternalKlangParser.g:128:2: ( () otherlv_1= Scene ( (lv_name_2_0= RULE_ID ) ) this_BEGIN_3= RULE_BEGIN ( (lv_localVariables_4_0= ruleVariableDeclaration ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* this_END_6= RULE_END )
            {
            // InternalKlangParser.g:128:2: ( () otherlv_1= Scene ( (lv_name_2_0= RULE_ID ) ) this_BEGIN_3= RULE_BEGIN ( (lv_localVariables_4_0= ruleVariableDeclaration ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* this_END_6= RULE_END )
            // InternalKlangParser.g:129:3: () otherlv_1= Scene ( (lv_name_2_0= RULE_ID ) ) this_BEGIN_3= RULE_BEGIN ( (lv_localVariables_4_0= ruleVariableDeclaration ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* this_END_6= RULE_END
            {
            // InternalKlangParser.g:129:3: ()
            // InternalKlangParser.g:130:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSceneActorAccess().getSceneActorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Scene,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSceneActorAccess().getSceneKeyword_1());
            		
            // InternalKlangParser.g:140:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalKlangParser.g:141:4: (lv_name_2_0= RULE_ID )
            {
            // InternalKlangParser.g:141:4: (lv_name_2_0= RULE_ID )
            // InternalKlangParser.g:142:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSceneActorAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSceneActorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_6); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getSceneActorAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalKlangParser.g:162:3: ( (lv_localVariables_4_0= ruleVariableDeclaration ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Var) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalKlangParser.g:163:4: (lv_localVariables_4_0= ruleVariableDeclaration )
            	    {
            	    // InternalKlangParser.g:163:4: (lv_localVariables_4_0= ruleVariableDeclaration )
            	    // InternalKlangParser.g:164:5: lv_localVariables_4_0= ruleVariableDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getSceneActorAccess().getLocalVariablesVariableDeclarationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_localVariables_4_0=ruleVariableDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSceneActorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"localVariables",
            	    						lv_localVariables_4_0,
            	    						"com.kaurel.klang.xtext.Klang.VariableDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalKlangParser.g:181:3: ( (lv_eventHandlers_5_0= ruleEventHandler ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==When) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalKlangParser.g:182:4: (lv_eventHandlers_5_0= ruleEventHandler )
            	    {
            	    // InternalKlangParser.g:182:4: (lv_eventHandlers_5_0= ruleEventHandler )
            	    // InternalKlangParser.g:183:5: lv_eventHandlers_5_0= ruleEventHandler
            	    {

            	    					newCompositeNode(grammarAccess.getSceneActorAccess().getEventHandlersEventHandlerParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_eventHandlers_5_0=ruleEventHandler();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSceneActorRule());
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
            	    break loop3;
                }
            } while (true);

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_6, grammarAccess.getSceneActorAccess().getENDTerminalRuleCall_6());
            		

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
    // $ANTLR end "ruleSceneActor"


    // $ANTLR start "entryRuleSpriteActor"
    // InternalKlangParser.g:208:1: entryRuleSpriteActor returns [EObject current=null] : iv_ruleSpriteActor= ruleSpriteActor EOF ;
    public final EObject entryRuleSpriteActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpriteActor = null;


        try {
            // InternalKlangParser.g:208:52: (iv_ruleSpriteActor= ruleSpriteActor EOF )
            // InternalKlangParser.g:209:2: iv_ruleSpriteActor= ruleSpriteActor EOF
            {
             newCompositeNode(grammarAccess.getSpriteActorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpriteActor=ruleSpriteActor();

            state._fsp--;

             current =iv_ruleSpriteActor; 
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
    // $ANTLR end "entryRuleSpriteActor"


    // $ANTLR start "ruleSpriteActor"
    // InternalKlangParser.g:215:1: ruleSpriteActor returns [EObject current=null] : ( () otherlv_1= Sprite ( (lv_name_2_0= RULE_ID ) ) this_BEGIN_3= RULE_BEGIN ( (lv_localVariables_4_0= ruleVariableDeclaration ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* this_END_6= RULE_END ) ;
    public final EObject ruleSpriteActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_BEGIN_3=null;
        Token this_END_6=null;
        EObject lv_localVariables_4_0 = null;

        EObject lv_eventHandlers_5_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:221:2: ( ( () otherlv_1= Sprite ( (lv_name_2_0= RULE_ID ) ) this_BEGIN_3= RULE_BEGIN ( (lv_localVariables_4_0= ruleVariableDeclaration ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* this_END_6= RULE_END ) )
            // InternalKlangParser.g:222:2: ( () otherlv_1= Sprite ( (lv_name_2_0= RULE_ID ) ) this_BEGIN_3= RULE_BEGIN ( (lv_localVariables_4_0= ruleVariableDeclaration ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* this_END_6= RULE_END )
            {
            // InternalKlangParser.g:222:2: ( () otherlv_1= Sprite ( (lv_name_2_0= RULE_ID ) ) this_BEGIN_3= RULE_BEGIN ( (lv_localVariables_4_0= ruleVariableDeclaration ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* this_END_6= RULE_END )
            // InternalKlangParser.g:223:3: () otherlv_1= Sprite ( (lv_name_2_0= RULE_ID ) ) this_BEGIN_3= RULE_BEGIN ( (lv_localVariables_4_0= ruleVariableDeclaration ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* this_END_6= RULE_END
            {
            // InternalKlangParser.g:223:3: ()
            // InternalKlangParser.g:224:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSpriteActorAccess().getSpriteActorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Sprite,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSpriteActorAccess().getSpriteKeyword_1());
            		
            // InternalKlangParser.g:234:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalKlangParser.g:235:4: (lv_name_2_0= RULE_ID )
            {
            // InternalKlangParser.g:235:4: (lv_name_2_0= RULE_ID )
            // InternalKlangParser.g:236:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSpriteActorAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpriteActorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_6); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getSpriteActorAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalKlangParser.g:256:3: ( (lv_localVariables_4_0= ruleVariableDeclaration ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==Var) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKlangParser.g:257:4: (lv_localVariables_4_0= ruleVariableDeclaration )
            	    {
            	    // InternalKlangParser.g:257:4: (lv_localVariables_4_0= ruleVariableDeclaration )
            	    // InternalKlangParser.g:258:5: lv_localVariables_4_0= ruleVariableDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getSpriteActorAccess().getLocalVariablesVariableDeclarationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_localVariables_4_0=ruleVariableDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpriteActorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"localVariables",
            	    						lv_localVariables_4_0,
            	    						"com.kaurel.klang.xtext.Klang.VariableDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalKlangParser.g:275:3: ( (lv_eventHandlers_5_0= ruleEventHandler ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==When) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalKlangParser.g:276:4: (lv_eventHandlers_5_0= ruleEventHandler )
            	    {
            	    // InternalKlangParser.g:276:4: (lv_eventHandlers_5_0= ruleEventHandler )
            	    // InternalKlangParser.g:277:5: lv_eventHandlers_5_0= ruleEventHandler
            	    {

            	    					newCompositeNode(grammarAccess.getSpriteActorAccess().getEventHandlersEventHandlerParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_eventHandlers_5_0=ruleEventHandler();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpriteActorRule());
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
            	    break loop5;
                }
            } while (true);

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_6, grammarAccess.getSpriteActorAccess().getENDTerminalRuleCall_6());
            		

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
    // $ANTLR end "ruleSpriteActor"


    // $ANTLR start "entryRuleEventHandler"
    // InternalKlangParser.g:302:1: entryRuleEventHandler returns [EObject current=null] : iv_ruleEventHandler= ruleEventHandler EOF ;
    public final EObject entryRuleEventHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventHandler = null;


        try {
            // InternalKlangParser.g:302:53: (iv_ruleEventHandler= ruleEventHandler EOF )
            // InternalKlangParser.g:303:2: iv_ruleEventHandler= ruleEventHandler EOF
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
    // InternalKlangParser.g:309:1: ruleEventHandler returns [EObject current=null] : (this_GameStart_0= ruleGameStart | this_SpriteClicked_1= ruleSpriteClicked | this_KeyPressed_2= ruleKeyPressed | this_CollidesWith_3= ruleCollidesWith ) ;
    public final EObject ruleEventHandler() throws RecognitionException {
        EObject current = null;

        EObject this_GameStart_0 = null;

        EObject this_SpriteClicked_1 = null;

        EObject this_KeyPressed_2 = null;

        EObject this_CollidesWith_3 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:315:2: ( (this_GameStart_0= ruleGameStart | this_SpriteClicked_1= ruleSpriteClicked | this_KeyPressed_2= ruleKeyPressed | this_CollidesWith_3= ruleCollidesWith ) )
            // InternalKlangParser.g:316:2: (this_GameStart_0= ruleGameStart | this_SpriteClicked_1= ruleSpriteClicked | this_KeyPressed_2= ruleKeyPressed | this_CollidesWith_3= ruleCollidesWith )
            {
            // InternalKlangParser.g:316:2: (this_GameStart_0= ruleGameStart | this_SpriteClicked_1= ruleSpriteClicked | this_KeyPressed_2= ruleKeyPressed | this_CollidesWith_3= ruleCollidesWith )
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
                case RULE_ID:
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
                    // InternalKlangParser.g:317:3: this_GameStart_0= ruleGameStart
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
                    // InternalKlangParser.g:326:3: this_SpriteClicked_1= ruleSpriteClicked
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
                    // InternalKlangParser.g:335:3: this_KeyPressed_2= ruleKeyPressed
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
                    // InternalKlangParser.g:344:3: this_CollidesWith_3= ruleCollidesWith
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
    // InternalKlangParser.g:356:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalKlangParser.g:356:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalKlangParser.g:357:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalKlangParser.g:363:1: ruleStatement returns [EObject current=null] : (this_WhileLoop_0= ruleWhileLoop | this_If_1= ruleIf | this_VariableAssignment_2= ruleVariableAssignment | this_ForeverLoop_3= ruleForeverLoop | this_FunctionCall_4= ruleFunctionCall | this_Sleep_5= ruleSleep ) ;
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
            // InternalKlangParser.g:369:2: ( (this_WhileLoop_0= ruleWhileLoop | this_If_1= ruleIf | this_VariableAssignment_2= ruleVariableAssignment | this_ForeverLoop_3= ruleForeverLoop | this_FunctionCall_4= ruleFunctionCall | this_Sleep_5= ruleSleep ) )
            // InternalKlangParser.g:370:2: (this_WhileLoop_0= ruleWhileLoop | this_If_1= ruleIf | this_VariableAssignment_2= ruleVariableAssignment | this_ForeverLoop_3= ruleForeverLoop | this_FunctionCall_4= ruleFunctionCall | this_Sleep_5= ruleSleep )
            {
            // InternalKlangParser.g:370:2: (this_WhileLoop_0= ruleWhileLoop | this_If_1= ruleIf | this_VariableAssignment_2= ruleVariableAssignment | this_ForeverLoop_3= ruleForeverLoop | this_FunctionCall_4= ruleFunctionCall | this_Sleep_5= ruleSleep )
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
                    // InternalKlangParser.g:371:3: this_WhileLoop_0= ruleWhileLoop
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
                    // InternalKlangParser.g:380:3: this_If_1= ruleIf
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
                    // InternalKlangParser.g:389:3: this_VariableAssignment_2= ruleVariableAssignment
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
                    // InternalKlangParser.g:398:3: this_ForeverLoop_3= ruleForeverLoop
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
                    // InternalKlangParser.g:407:3: this_FunctionCall_4= ruleFunctionCall
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
                    // InternalKlangParser.g:416:3: this_Sleep_5= ruleSleep
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
    // InternalKlangParser.g:428:1: entryRuleGameStart returns [EObject current=null] : iv_ruleGameStart= ruleGameStart EOF ;
    public final EObject entryRuleGameStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGameStart = null;


        try {
            // InternalKlangParser.g:428:50: (iv_ruleGameStart= ruleGameStart EOF )
            // InternalKlangParser.g:429:2: iv_ruleGameStart= ruleGameStart EOF
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
    // InternalKlangParser.g:435:1: ruleGameStart returns [EObject current=null] : ( () otherlv_1= When otherlv_2= Game otherlv_3= Starts this_BEGIN_4= RULE_BEGIN ( (lv_statements_5_0= ruleStatement ) )* this_END_6= RULE_END ) ;
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
            // InternalKlangParser.g:441:2: ( ( () otherlv_1= When otherlv_2= Game otherlv_3= Starts this_BEGIN_4= RULE_BEGIN ( (lv_statements_5_0= ruleStatement ) )* this_END_6= RULE_END ) )
            // InternalKlangParser.g:442:2: ( () otherlv_1= When otherlv_2= Game otherlv_3= Starts this_BEGIN_4= RULE_BEGIN ( (lv_statements_5_0= ruleStatement ) )* this_END_6= RULE_END )
            {
            // InternalKlangParser.g:442:2: ( () otherlv_1= When otherlv_2= Game otherlv_3= Starts this_BEGIN_4= RULE_BEGIN ( (lv_statements_5_0= ruleStatement ) )* this_END_6= RULE_END )
            // InternalKlangParser.g:443:3: () otherlv_1= When otherlv_2= Game otherlv_3= Starts this_BEGIN_4= RULE_BEGIN ( (lv_statements_5_0= ruleStatement ) )* this_END_6= RULE_END
            {
            // InternalKlangParser.g:443:3: ()
            // InternalKlangParser.g:444:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGameStartAccess().getGameStartAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,When,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getGameStartAccess().getWhenKeyword_1());
            		
            otherlv_2=(Token)match(input,Game,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getGameStartAccess().getGameKeyword_2());
            		
            otherlv_3=(Token)match(input,Starts,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getGameStartAccess().getStartsKeyword_3());
            		
            this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_10); 

            			newLeafNode(this_BEGIN_4, grammarAccess.getGameStartAccess().getBEGINTerminalRuleCall_4());
            		
            // InternalKlangParser.g:466:3: ( (lv_statements_5_0= ruleStatement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Forever||(LA8_0>=Sleep && LA8_0<=While)||LA8_0==If||LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKlangParser.g:467:4: (lv_statements_5_0= ruleStatement )
            	    {
            	    // InternalKlangParser.g:467:4: (lv_statements_5_0= ruleStatement )
            	    // InternalKlangParser.g:468:5: lv_statements_5_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getGameStartAccess().getStatementsStatementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_10);
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
    // InternalKlangParser.g:493:1: entryRuleSpriteClicked returns [EObject current=null] : iv_ruleSpriteClicked= ruleSpriteClicked EOF ;
    public final EObject entryRuleSpriteClicked() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpriteClicked = null;


        try {
            // InternalKlangParser.g:493:54: (iv_ruleSpriteClicked= ruleSpriteClicked EOF )
            // InternalKlangParser.g:494:2: iv_ruleSpriteClicked= ruleSpriteClicked EOF
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
    // InternalKlangParser.g:500:1: ruleSpriteClicked returns [EObject current=null] : ( () otherlv_1= When otherlv_2= Clicked this_BEGIN_3= RULE_BEGIN ( (lv_statements_4_0= ruleStatement ) )* this_END_5= RULE_END ) ;
    public final EObject ruleSpriteClicked() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        EObject lv_statements_4_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:506:2: ( ( () otherlv_1= When otherlv_2= Clicked this_BEGIN_3= RULE_BEGIN ( (lv_statements_4_0= ruleStatement ) )* this_END_5= RULE_END ) )
            // InternalKlangParser.g:507:2: ( () otherlv_1= When otherlv_2= Clicked this_BEGIN_3= RULE_BEGIN ( (lv_statements_4_0= ruleStatement ) )* this_END_5= RULE_END )
            {
            // InternalKlangParser.g:507:2: ( () otherlv_1= When otherlv_2= Clicked this_BEGIN_3= RULE_BEGIN ( (lv_statements_4_0= ruleStatement ) )* this_END_5= RULE_END )
            // InternalKlangParser.g:508:3: () otherlv_1= When otherlv_2= Clicked this_BEGIN_3= RULE_BEGIN ( (lv_statements_4_0= ruleStatement ) )* this_END_5= RULE_END
            {
            // InternalKlangParser.g:508:3: ()
            // InternalKlangParser.g:509:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSpriteClickedAccess().getSpriteClickedAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,When,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getSpriteClickedAccess().getWhenKeyword_1());
            		
            otherlv_2=(Token)match(input,Clicked,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSpriteClickedAccess().getClickedKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_10); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getSpriteClickedAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalKlangParser.g:527:3: ( (lv_statements_4_0= ruleStatement ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Forever||(LA9_0>=Sleep && LA9_0<=While)||LA9_0==If||LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalKlangParser.g:528:4: (lv_statements_4_0= ruleStatement )
            	    {
            	    // InternalKlangParser.g:528:4: (lv_statements_4_0= ruleStatement )
            	    // InternalKlangParser.g:529:5: lv_statements_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getSpriteClickedAccess().getStatementsStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_10);
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
    // InternalKlangParser.g:554:1: entryRuleKeyPressed returns [EObject current=null] : iv_ruleKeyPressed= ruleKeyPressed EOF ;
    public final EObject entryRuleKeyPressed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyPressed = null;


        try {
            // InternalKlangParser.g:554:51: (iv_ruleKeyPressed= ruleKeyPressed EOF )
            // InternalKlangParser.g:555:2: iv_ruleKeyPressed= ruleKeyPressed EOF
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
    // InternalKlangParser.g:561:1: ruleKeyPressed returns [EObject current=null] : ( () otherlv_1= When ( (lv_key_2_0= RULE_ID ) ) otherlv_3= Key otherlv_4= Pressed this_BEGIN_5= RULE_BEGIN ( (lv_statements_6_0= ruleStatement ) )* this_END_7= RULE_END ) ;
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
            // InternalKlangParser.g:567:2: ( ( () otherlv_1= When ( (lv_key_2_0= RULE_ID ) ) otherlv_3= Key otherlv_4= Pressed this_BEGIN_5= RULE_BEGIN ( (lv_statements_6_0= ruleStatement ) )* this_END_7= RULE_END ) )
            // InternalKlangParser.g:568:2: ( () otherlv_1= When ( (lv_key_2_0= RULE_ID ) ) otherlv_3= Key otherlv_4= Pressed this_BEGIN_5= RULE_BEGIN ( (lv_statements_6_0= ruleStatement ) )* this_END_7= RULE_END )
            {
            // InternalKlangParser.g:568:2: ( () otherlv_1= When ( (lv_key_2_0= RULE_ID ) ) otherlv_3= Key otherlv_4= Pressed this_BEGIN_5= RULE_BEGIN ( (lv_statements_6_0= ruleStatement ) )* this_END_7= RULE_END )
            // InternalKlangParser.g:569:3: () otherlv_1= When ( (lv_key_2_0= RULE_ID ) ) otherlv_3= Key otherlv_4= Pressed this_BEGIN_5= RULE_BEGIN ( (lv_statements_6_0= ruleStatement ) )* this_END_7= RULE_END
            {
            // InternalKlangParser.g:569:3: ()
            // InternalKlangParser.g:570:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKeyPressedAccess().getKeyPressedAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,When,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getKeyPressedAccess().getWhenKeyword_1());
            		
            // InternalKlangParser.g:580:3: ( (lv_key_2_0= RULE_ID ) )
            // InternalKlangParser.g:581:4: (lv_key_2_0= RULE_ID )
            {
            // InternalKlangParser.g:581:4: (lv_key_2_0= RULE_ID )
            // InternalKlangParser.g:582:5: lv_key_2_0= RULE_ID
            {
            lv_key_2_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_key_2_0, grammarAccess.getKeyPressedAccess().getKeyIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKeyPressedRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,Key,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getKeyPressedAccess().getKeyKeyword_3());
            		
            otherlv_4=(Token)match(input,Pressed,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getKeyPressedAccess().getPressedKeyword_4());
            		
            this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_10); 

            			newLeafNode(this_BEGIN_5, grammarAccess.getKeyPressedAccess().getBEGINTerminalRuleCall_5());
            		
            // InternalKlangParser.g:610:3: ( (lv_statements_6_0= ruleStatement ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Forever||(LA10_0>=Sleep && LA10_0<=While)||LA10_0==If||LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalKlangParser.g:611:4: (lv_statements_6_0= ruleStatement )
            	    {
            	    // InternalKlangParser.g:611:4: (lv_statements_6_0= ruleStatement )
            	    // InternalKlangParser.g:612:5: lv_statements_6_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getKeyPressedAccess().getStatementsStatementParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_10);
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
    // InternalKlangParser.g:637:1: entryRuleCollidesWith returns [EObject current=null] : iv_ruleCollidesWith= ruleCollidesWith EOF ;
    public final EObject entryRuleCollidesWith() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollidesWith = null;


        try {
            // InternalKlangParser.g:637:53: (iv_ruleCollidesWith= ruleCollidesWith EOF )
            // InternalKlangParser.g:638:2: iv_ruleCollidesWith= ruleCollidesWith EOF
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
    // InternalKlangParser.g:644:1: ruleCollidesWith returns [EObject current=null] : ( () otherlv_1= When otherlv_2= Collides otherlv_3= With ( (otherlv_4= RULE_ID ) ) this_BEGIN_5= RULE_BEGIN ( (lv_statements_6_0= ruleStatement ) )* this_END_7= RULE_END ) ;
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
            // InternalKlangParser.g:650:2: ( ( () otherlv_1= When otherlv_2= Collides otherlv_3= With ( (otherlv_4= RULE_ID ) ) this_BEGIN_5= RULE_BEGIN ( (lv_statements_6_0= ruleStatement ) )* this_END_7= RULE_END ) )
            // InternalKlangParser.g:651:2: ( () otherlv_1= When otherlv_2= Collides otherlv_3= With ( (otherlv_4= RULE_ID ) ) this_BEGIN_5= RULE_BEGIN ( (lv_statements_6_0= ruleStatement ) )* this_END_7= RULE_END )
            {
            // InternalKlangParser.g:651:2: ( () otherlv_1= When otherlv_2= Collides otherlv_3= With ( (otherlv_4= RULE_ID ) ) this_BEGIN_5= RULE_BEGIN ( (lv_statements_6_0= ruleStatement ) )* this_END_7= RULE_END )
            // InternalKlangParser.g:652:3: () otherlv_1= When otherlv_2= Collides otherlv_3= With ( (otherlv_4= RULE_ID ) ) this_BEGIN_5= RULE_BEGIN ( (lv_statements_6_0= ruleStatement ) )* this_END_7= RULE_END
            {
            // InternalKlangParser.g:652:3: ()
            // InternalKlangParser.g:653:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCollidesWithAccess().getCollidesWithAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,When,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getCollidesWithAccess().getWhenKeyword_1());
            		
            otherlv_2=(Token)match(input,Collides,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getCollidesWithAccess().getCollidesKeyword_2());
            		
            otherlv_3=(Token)match(input,With,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getCollidesWithAccess().getWithKeyword_3());
            		
            // InternalKlangParser.g:671:3: ( (otherlv_4= RULE_ID ) )
            // InternalKlangParser.g:672:4: (otherlv_4= RULE_ID )
            {
            // InternalKlangParser.g:672:4: (otherlv_4= RULE_ID )
            // InternalKlangParser.g:673:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollidesWithRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_4, grammarAccess.getCollidesWithAccess().getTargetSpriteActorCrossReference_4_0());
            				

            }


            }

            this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_10); 

            			newLeafNode(this_BEGIN_5, grammarAccess.getCollidesWithAccess().getBEGINTerminalRuleCall_5());
            		
            // InternalKlangParser.g:688:3: ( (lv_statements_6_0= ruleStatement ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==Forever||(LA11_0>=Sleep && LA11_0<=While)||LA11_0==If||LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalKlangParser.g:689:4: (lv_statements_6_0= ruleStatement )
            	    {
            	    // InternalKlangParser.g:689:4: (lv_statements_6_0= ruleStatement )
            	    // InternalKlangParser.g:690:5: lv_statements_6_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getCollidesWithAccess().getStatementsStatementParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_10);
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
    // InternalKlangParser.g:715:1: entryRuleWhileLoop returns [EObject current=null] : iv_ruleWhileLoop= ruleWhileLoop EOF ;
    public final EObject entryRuleWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileLoop = null;


        try {
            // InternalKlangParser.g:715:50: (iv_ruleWhileLoop= ruleWhileLoop EOF )
            // InternalKlangParser.g:716:2: iv_ruleWhileLoop= ruleWhileLoop EOF
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
    // InternalKlangParser.g:722:1: ruleWhileLoop returns [EObject current=null] : ( () otherlv_1= While ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_loopBlock_4_0= ruleStatement ) )* this_END_5= RULE_END ) ;
    public final EObject ruleWhileLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        EObject lv_predicate_2_0 = null;

        EObject lv_loopBlock_4_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:728:2: ( ( () otherlv_1= While ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_loopBlock_4_0= ruleStatement ) )* this_END_5= RULE_END ) )
            // InternalKlangParser.g:729:2: ( () otherlv_1= While ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_loopBlock_4_0= ruleStatement ) )* this_END_5= RULE_END )
            {
            // InternalKlangParser.g:729:2: ( () otherlv_1= While ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_loopBlock_4_0= ruleStatement ) )* this_END_5= RULE_END )
            // InternalKlangParser.g:730:3: () otherlv_1= While ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_loopBlock_4_0= ruleStatement ) )* this_END_5= RULE_END
            {
            // InternalKlangParser.g:730:3: ()
            // InternalKlangParser.g:731:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWhileLoopAccess().getWhileLoopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,While,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getWhileLoopAccess().getWhileKeyword_1());
            		
            // InternalKlangParser.g:741:3: ( (lv_predicate_2_0= ruleExpression ) )
            // InternalKlangParser.g:742:4: (lv_predicate_2_0= ruleExpression )
            {
            // InternalKlangParser.g:742:4: (lv_predicate_2_0= ruleExpression )
            // InternalKlangParser.g:743:5: lv_predicate_2_0= ruleExpression
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

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_10); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getWhileLoopAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalKlangParser.g:764:3: ( (lv_loopBlock_4_0= ruleStatement ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Forever||(LA12_0>=Sleep && LA12_0<=While)||LA12_0==If||LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalKlangParser.g:765:4: (lv_loopBlock_4_0= ruleStatement )
            	    {
            	    // InternalKlangParser.g:765:4: (lv_loopBlock_4_0= ruleStatement )
            	    // InternalKlangParser.g:766:5: lv_loopBlock_4_0= ruleStatement
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
    // InternalKlangParser.g:791:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalKlangParser.g:791:43: (iv_ruleIf= ruleIf EOF )
            // InternalKlangParser.g:792:2: iv_ruleIf= ruleIf EOF
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
    // InternalKlangParser.g:798:1: ruleIf returns [EObject current=null] : ( () otherlv_1= If ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_ifBlock_4_0= ruleStatement ) )* this_END_5= RULE_END (otherlv_6= Else this_BEGIN_7= RULE_BEGIN ( (lv_elseBlock_8_0= ruleStatement ) )* this_END_9= RULE_END )? ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token this_END_9=null;
        EObject lv_predicate_2_0 = null;

        EObject lv_ifBlock_4_0 = null;

        EObject lv_elseBlock_8_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:804:2: ( ( () otherlv_1= If ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_ifBlock_4_0= ruleStatement ) )* this_END_5= RULE_END (otherlv_6= Else this_BEGIN_7= RULE_BEGIN ( (lv_elseBlock_8_0= ruleStatement ) )* this_END_9= RULE_END )? ) )
            // InternalKlangParser.g:805:2: ( () otherlv_1= If ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_ifBlock_4_0= ruleStatement ) )* this_END_5= RULE_END (otherlv_6= Else this_BEGIN_7= RULE_BEGIN ( (lv_elseBlock_8_0= ruleStatement ) )* this_END_9= RULE_END )? )
            {
            // InternalKlangParser.g:805:2: ( () otherlv_1= If ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_ifBlock_4_0= ruleStatement ) )* this_END_5= RULE_END (otherlv_6= Else this_BEGIN_7= RULE_BEGIN ( (lv_elseBlock_8_0= ruleStatement ) )* this_END_9= RULE_END )? )
            // InternalKlangParser.g:806:3: () otherlv_1= If ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_ifBlock_4_0= ruleStatement ) )* this_END_5= RULE_END (otherlv_6= Else this_BEGIN_7= RULE_BEGIN ( (lv_elseBlock_8_0= ruleStatement ) )* this_END_9= RULE_END )?
            {
            // InternalKlangParser.g:806:3: ()
            // InternalKlangParser.g:807:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIfAccess().getIfAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,If,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getIfAccess().getIfKeyword_1());
            		
            // InternalKlangParser.g:817:3: ( (lv_predicate_2_0= ruleExpression ) )
            // InternalKlangParser.g:818:4: (lv_predicate_2_0= ruleExpression )
            {
            // InternalKlangParser.g:818:4: (lv_predicate_2_0= ruleExpression )
            // InternalKlangParser.g:819:5: lv_predicate_2_0= ruleExpression
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

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_10); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getIfAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalKlangParser.g:840:3: ( (lv_ifBlock_4_0= ruleStatement ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Forever||(LA13_0>=Sleep && LA13_0<=While)||LA13_0==If||LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalKlangParser.g:841:4: (lv_ifBlock_4_0= ruleStatement )
            	    {
            	    // InternalKlangParser.g:841:4: (lv_ifBlock_4_0= ruleStatement )
            	    // InternalKlangParser.g:842:5: lv_ifBlock_4_0= ruleStatement
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
            	    break loop13;
                }
            } while (true);

            this_END_5=(Token)match(input,RULE_END,FOLLOW_17); 

            			newLeafNode(this_END_5, grammarAccess.getIfAccess().getENDTerminalRuleCall_5());
            		
            // InternalKlangParser.g:863:3: (otherlv_6= Else this_BEGIN_7= RULE_BEGIN ( (lv_elseBlock_8_0= ruleStatement ) )* this_END_9= RULE_END )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Else) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalKlangParser.g:864:4: otherlv_6= Else this_BEGIN_7= RULE_BEGIN ( (lv_elseBlock_8_0= ruleStatement ) )* this_END_9= RULE_END
                    {
                    otherlv_6=(Token)match(input,Else,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getIfAccess().getElseKeyword_6_0());
                    			
                    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_10); 

                    				newLeafNode(this_BEGIN_7, grammarAccess.getIfAccess().getBEGINTerminalRuleCall_6_1());
                    			
                    // InternalKlangParser.g:872:4: ( (lv_elseBlock_8_0= ruleStatement ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==Forever||(LA14_0>=Sleep && LA14_0<=While)||LA14_0==If||LA14_0==RULE_ID) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalKlangParser.g:873:5: (lv_elseBlock_8_0= ruleStatement )
                    	    {
                    	    // InternalKlangParser.g:873:5: (lv_elseBlock_8_0= ruleStatement )
                    	    // InternalKlangParser.g:874:6: lv_elseBlock_8_0= ruleStatement
                    	    {

                    	    						newCompositeNode(grammarAccess.getIfAccess().getElseBlockStatementParserRuleCall_6_2_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_elseBlock_8_0=ruleStatement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getIfRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"elseBlock",
                    	    							lv_elseBlock_8_0,
                    	    							"com.kaurel.klang.xtext.Klang.Statement");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    this_END_9=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_9, grammarAccess.getIfAccess().getENDTerminalRuleCall_6_3());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleForeverLoop"
    // InternalKlangParser.g:900:1: entryRuleForeverLoop returns [EObject current=null] : iv_ruleForeverLoop= ruleForeverLoop EOF ;
    public final EObject entryRuleForeverLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeverLoop = null;


        try {
            // InternalKlangParser.g:900:52: (iv_ruleForeverLoop= ruleForeverLoop EOF )
            // InternalKlangParser.g:901:2: iv_ruleForeverLoop= ruleForeverLoop EOF
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
    // InternalKlangParser.g:907:1: ruleForeverLoop returns [EObject current=null] : ( () otherlv_1= Forever this_BEGIN_2= RULE_BEGIN ( (lv_loopStatements_3_0= ruleStatement ) )* this_END_4= RULE_END ) ;
    public final EObject ruleForeverLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_loopStatements_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:913:2: ( ( () otherlv_1= Forever this_BEGIN_2= RULE_BEGIN ( (lv_loopStatements_3_0= ruleStatement ) )* this_END_4= RULE_END ) )
            // InternalKlangParser.g:914:2: ( () otherlv_1= Forever this_BEGIN_2= RULE_BEGIN ( (lv_loopStatements_3_0= ruleStatement ) )* this_END_4= RULE_END )
            {
            // InternalKlangParser.g:914:2: ( () otherlv_1= Forever this_BEGIN_2= RULE_BEGIN ( (lv_loopStatements_3_0= ruleStatement ) )* this_END_4= RULE_END )
            // InternalKlangParser.g:915:3: () otherlv_1= Forever this_BEGIN_2= RULE_BEGIN ( (lv_loopStatements_3_0= ruleStatement ) )* this_END_4= RULE_END
            {
            // InternalKlangParser.g:915:3: ()
            // InternalKlangParser.g:916:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getForeverLoopAccess().getForeverLoopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Forever,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getForeverLoopAccess().getForeverKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_10); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getForeverLoopAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalKlangParser.g:930:3: ( (lv_loopStatements_3_0= ruleStatement ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==Forever||(LA16_0>=Sleep && LA16_0<=While)||LA16_0==If||LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalKlangParser.g:931:4: (lv_loopStatements_3_0= ruleStatement )
            	    {
            	    // InternalKlangParser.g:931:4: (lv_loopStatements_3_0= ruleStatement )
            	    // InternalKlangParser.g:932:5: lv_loopStatements_3_0= ruleStatement
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
            	    break loop16;
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


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalKlangParser.g:957:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalKlangParser.g:957:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalKlangParser.g:958:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalKlangParser.g:964:1: ruleVariableDeclaration returns [EObject current=null] : (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_expression_3_0= ruleExpression ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:970:2: ( (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_expression_3_0= ruleExpression ) ) ) )
            // InternalKlangParser.g:971:2: (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_expression_3_0= ruleExpression ) ) )
            {
            // InternalKlangParser.g:971:2: (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_expression_3_0= ruleExpression ) ) )
            // InternalKlangParser.g:972:3: otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_expression_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,Var,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getVarKeyword_0());
            		
            // InternalKlangParser.g:976:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalKlangParser.g:977:4: (lv_name_1_0= RULE_ID )
            {
            // InternalKlangParser.g:977:4: (lv_name_1_0= RULE_ID )
            // InternalKlangParser.g:978:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,EqualsSign,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2());
            		
            // InternalKlangParser.g:998:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalKlangParser.g:999:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalKlangParser.g:999:4: (lv_expression_3_0= ruleExpression )
            // InternalKlangParser.g:1000:5: lv_expression_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getVariableDeclarationAccess().getExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleVariableAssignment"
    // InternalKlangParser.g:1021:1: entryRuleVariableAssignment returns [EObject current=null] : iv_ruleVariableAssignment= ruleVariableAssignment EOF ;
    public final EObject entryRuleVariableAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssignment = null;


        try {
            // InternalKlangParser.g:1021:59: (iv_ruleVariableAssignment= ruleVariableAssignment EOF )
            // InternalKlangParser.g:1022:2: iv_ruleVariableAssignment= ruleVariableAssignment EOF
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
    // InternalKlangParser.g:1028:1: ruleVariableAssignment returns [EObject current=null] : ( ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleVariableAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_variableName_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1034:2: ( ( ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalKlangParser.g:1035:2: ( ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalKlangParser.g:1035:2: ( ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalKlangParser.g:1036:3: ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalKlangParser.g:1036:3: ( (lv_variableName_0_0= RULE_ID ) )
            // InternalKlangParser.g:1037:4: (lv_variableName_0_0= RULE_ID )
            {
            // InternalKlangParser.g:1037:4: (lv_variableName_0_0= RULE_ID )
            // InternalKlangParser.g:1038:5: lv_variableName_0_0= RULE_ID
            {
            lv_variableName_0_0=(Token)match(input,RULE_ID,FOLLOW_18); 

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

            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_1());
            		
            // InternalKlangParser.g:1058:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalKlangParser.g:1059:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalKlangParser.g:1059:4: (lv_expression_2_0= ruleExpression )
            // InternalKlangParser.g:1060:5: lv_expression_2_0= ruleExpression
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
    // InternalKlangParser.g:1081:1: entryRuleSleep returns [EObject current=null] : iv_ruleSleep= ruleSleep EOF ;
    public final EObject entryRuleSleep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSleep = null;


        try {
            // InternalKlangParser.g:1081:46: (iv_ruleSleep= ruleSleep EOF )
            // InternalKlangParser.g:1082:2: iv_ruleSleep= ruleSleep EOF
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
    // InternalKlangParser.g:1088:1: ruleSleep returns [EObject current=null] : ( () otherlv_1= Sleep otherlv_2= LeftParenthesis ( (lv_duration_3_0= ruleDECIMAL ) ) otherlv_4= RightParenthesis ) ;
    public final EObject ruleSleep() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_duration_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1094:2: ( ( () otherlv_1= Sleep otherlv_2= LeftParenthesis ( (lv_duration_3_0= ruleDECIMAL ) ) otherlv_4= RightParenthesis ) )
            // InternalKlangParser.g:1095:2: ( () otherlv_1= Sleep otherlv_2= LeftParenthesis ( (lv_duration_3_0= ruleDECIMAL ) ) otherlv_4= RightParenthesis )
            {
            // InternalKlangParser.g:1095:2: ( () otherlv_1= Sleep otherlv_2= LeftParenthesis ( (lv_duration_3_0= ruleDECIMAL ) ) otherlv_4= RightParenthesis )
            // InternalKlangParser.g:1096:3: () otherlv_1= Sleep otherlv_2= LeftParenthesis ( (lv_duration_3_0= ruleDECIMAL ) ) otherlv_4= RightParenthesis
            {
            // InternalKlangParser.g:1096:3: ()
            // InternalKlangParser.g:1097:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSleepAccess().getSleepAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Sleep,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getSleepAccess().getSleepKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getSleepAccess().getLeftParenthesisKeyword_2());
            		
            // InternalKlangParser.g:1111:3: ( (lv_duration_3_0= ruleDECIMAL ) )
            // InternalKlangParser.g:1112:4: (lv_duration_3_0= ruleDECIMAL )
            {
            // InternalKlangParser.g:1112:4: (lv_duration_3_0= ruleDECIMAL )
            // InternalKlangParser.g:1113:5: lv_duration_3_0= ruleDECIMAL
            {

            					newCompositeNode(grammarAccess.getSleepAccess().getDurationDECIMALParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_duration_3_0=ruleDECIMAL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSleepRule());
            					}
            					set(
            						current,
            						"duration",
            						lv_duration_3_0,
            						"com.kaurel.klang.xtext.Klang.DECIMAL");
            					afterParserOrEnumRuleCall();
            				

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
    // InternalKlangParser.g:1138:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalKlangParser.g:1138:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalKlangParser.g:1139:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalKlangParser.g:1145:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1151:2: (this_Or_0= ruleOr )
            // InternalKlangParser.g:1152:2: this_Or_0= ruleOr
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
    // InternalKlangParser.g:1163:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalKlangParser.g:1163:43: (iv_ruleOr= ruleOr EOF )
            // InternalKlangParser.g:1164:2: iv_ruleOr= ruleOr EOF
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
    // InternalKlangParser.g:1170:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= Or ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1176:2: ( (this_And_0= ruleAnd ( () otherlv_2= Or ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalKlangParser.g:1177:2: (this_And_0= ruleAnd ( () otherlv_2= Or ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalKlangParser.g:1177:2: (this_And_0= ruleAnd ( () otherlv_2= Or ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalKlangParser.g:1178:3: this_And_0= ruleAnd ( () otherlv_2= Or ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKlangParser.g:1186:3: ( () otherlv_2= Or ( (lv_right_3_0= ruleAnd ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Or) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalKlangParser.g:1187:4: () otherlv_2= Or ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalKlangParser.g:1187:4: ()
            	    // InternalKlangParser.g:1188:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,Or,FOLLOW_16); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getOrKeyword_1_1());
            	    			
            	    // InternalKlangParser.g:1198:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalKlangParser.g:1199:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalKlangParser.g:1199:5: (lv_right_3_0= ruleAnd )
            	    // InternalKlangParser.g:1200:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_22);
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalKlangParser.g:1222:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalKlangParser.g:1222:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalKlangParser.g:1223:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalKlangParser.g:1229:1: ruleAnd returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () otherlv_2= And ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1235:2: ( (this_Comparison_0= ruleComparison ( () otherlv_2= And ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalKlangParser.g:1236:2: (this_Comparison_0= ruleComparison ( () otherlv_2= And ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalKlangParser.g:1236:2: (this_Comparison_0= ruleComparison ( () otherlv_2= And ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalKlangParser.g:1237:3: this_Comparison_0= ruleComparison ( () otherlv_2= And ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKlangParser.g:1245:3: ( () otherlv_2= And ( (lv_right_3_0= ruleComparison ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==And) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalKlangParser.g:1246:4: () otherlv_2= And ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalKlangParser.g:1246:4: ()
            	    // InternalKlangParser.g:1247:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,And,FOLLOW_16); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAndKeyword_1_1());
            	    			
            	    // InternalKlangParser.g:1257:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalKlangParser.g:1258:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalKlangParser.g:1258:5: (lv_right_3_0= ruleComparison )
            	    // InternalKlangParser.g:1259:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRulePlus"
    // InternalKlangParser.g:1281:1: entryRulePlus returns [EObject current=null] : iv_rulePlus= rulePlus EOF ;
    public final EObject entryRulePlus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlus = null;


        try {
            // InternalKlangParser.g:1281:45: (iv_rulePlus= rulePlus EOF )
            // InternalKlangParser.g:1282:2: iv_rulePlus= rulePlus EOF
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
    // InternalKlangParser.g:1288:1: rulePlus returns [EObject current=null] : (this_Minus_0= ruleMinus ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMinus ) ) )* ) ;
    public final EObject rulePlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Minus_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1294:2: ( (this_Minus_0= ruleMinus ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMinus ) ) )* ) )
            // InternalKlangParser.g:1295:2: (this_Minus_0= ruleMinus ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMinus ) ) )* )
            {
            // InternalKlangParser.g:1295:2: (this_Minus_0= ruleMinus ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMinus ) ) )* )
            // InternalKlangParser.g:1296:3: this_Minus_0= ruleMinus ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMinus ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusAccess().getMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_Minus_0=ruleMinus();

            state._fsp--;


            			current = this_Minus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKlangParser.g:1304:3: ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMinus ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==PlusSign) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalKlangParser.g:1305:4: () otherlv_2= PlusSign ( (lv_right_3_0= ruleMinus ) )
            	    {
            	    // InternalKlangParser.g:1305:4: ()
            	    // InternalKlangParser.g:1306:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPlusAccess().getPlusLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,PlusSign,FOLLOW_16); 

            	    				newLeafNode(otherlv_2, grammarAccess.getPlusAccess().getPlusSignKeyword_1_1());
            	    			
            	    // InternalKlangParser.g:1316:4: ( (lv_right_3_0= ruleMinus ) )
            	    // InternalKlangParser.g:1317:5: (lv_right_3_0= ruleMinus )
            	    {
            	    // InternalKlangParser.g:1317:5: (lv_right_3_0= ruleMinus )
            	    // InternalKlangParser.g:1318:6: lv_right_3_0= ruleMinus
            	    {

            	    						newCompositeNode(grammarAccess.getPlusAccess().getRightMinusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
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
    // $ANTLR end "rulePlus"


    // $ANTLR start "entryRuleMinus"
    // InternalKlangParser.g:1340:1: entryRuleMinus returns [EObject current=null] : iv_ruleMinus= ruleMinus EOF ;
    public final EObject entryRuleMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinus = null;


        try {
            // InternalKlangParser.g:1340:46: (iv_ruleMinus= ruleMinus EOF )
            // InternalKlangParser.g:1341:2: iv_ruleMinus= ruleMinus EOF
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
    // InternalKlangParser.g:1347:1: ruleMinus returns [EObject current=null] : (this_Multiply_0= ruleMultiply ( () otherlv_2= HyphenMinus ( (lv_right_3_0= ruleMultiply ) ) )* ) ;
    public final EObject ruleMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Multiply_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1353:2: ( (this_Multiply_0= ruleMultiply ( () otherlv_2= HyphenMinus ( (lv_right_3_0= ruleMultiply ) ) )* ) )
            // InternalKlangParser.g:1354:2: (this_Multiply_0= ruleMultiply ( () otherlv_2= HyphenMinus ( (lv_right_3_0= ruleMultiply ) ) )* )
            {
            // InternalKlangParser.g:1354:2: (this_Multiply_0= ruleMultiply ( () otherlv_2= HyphenMinus ( (lv_right_3_0= ruleMultiply ) ) )* )
            // InternalKlangParser.g:1355:3: this_Multiply_0= ruleMultiply ( () otherlv_2= HyphenMinus ( (lv_right_3_0= ruleMultiply ) ) )*
            {

            			newCompositeNode(grammarAccess.getMinusAccess().getMultiplyParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_Multiply_0=ruleMultiply();

            state._fsp--;


            			current = this_Multiply_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKlangParser.g:1363:3: ( () otherlv_2= HyphenMinus ( (lv_right_3_0= ruleMultiply ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==HyphenMinus) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalKlangParser.g:1364:4: () otherlv_2= HyphenMinus ( (lv_right_3_0= ruleMultiply ) )
            	    {
            	    // InternalKlangParser.g:1364:4: ()
            	    // InternalKlangParser.g:1365:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMinusAccess().getMinusLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,HyphenMinus,FOLLOW_16); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMinusAccess().getHyphenMinusKeyword_1_1());
            	    			
            	    // InternalKlangParser.g:1375:4: ( (lv_right_3_0= ruleMultiply ) )
            	    // InternalKlangParser.g:1376:5: (lv_right_3_0= ruleMultiply )
            	    {
            	    // InternalKlangParser.g:1376:5: (lv_right_3_0= ruleMultiply )
            	    // InternalKlangParser.g:1377:6: lv_right_3_0= ruleMultiply
            	    {

            	    						newCompositeNode(grammarAccess.getMinusAccess().getRightMultiplyParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
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
    // $ANTLR end "ruleMinus"


    // $ANTLR start "entryRuleMultiply"
    // InternalKlangParser.g:1399:1: entryRuleMultiply returns [EObject current=null] : iv_ruleMultiply= ruleMultiply EOF ;
    public final EObject entryRuleMultiply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiply = null;


        try {
            // InternalKlangParser.g:1399:49: (iv_ruleMultiply= ruleMultiply EOF )
            // InternalKlangParser.g:1400:2: iv_ruleMultiply= ruleMultiply EOF
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
    // InternalKlangParser.g:1406:1: ruleMultiply returns [EObject current=null] : (this_Divide_0= ruleDivide ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleDivide ) ) )* ) ;
    public final EObject ruleMultiply() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Divide_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1412:2: ( (this_Divide_0= ruleDivide ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleDivide ) ) )* ) )
            // InternalKlangParser.g:1413:2: (this_Divide_0= ruleDivide ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleDivide ) ) )* )
            {
            // InternalKlangParser.g:1413:2: (this_Divide_0= ruleDivide ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleDivide ) ) )* )
            // InternalKlangParser.g:1414:3: this_Divide_0= ruleDivide ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleDivide ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplyAccess().getDivideParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_Divide_0=ruleDivide();

            state._fsp--;


            			current = this_Divide_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKlangParser.g:1422:3: ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleDivide ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Asterisk) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalKlangParser.g:1423:4: () otherlv_2= Asterisk ( (lv_right_3_0= ruleDivide ) )
            	    {
            	    // InternalKlangParser.g:1423:4: ()
            	    // InternalKlangParser.g:1424:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplyAccess().getMultiplyLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,Asterisk,FOLLOW_16); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMultiplyAccess().getAsteriskKeyword_1_1());
            	    			
            	    // InternalKlangParser.g:1434:4: ( (lv_right_3_0= ruleDivide ) )
            	    // InternalKlangParser.g:1435:5: (lv_right_3_0= ruleDivide )
            	    {
            	    // InternalKlangParser.g:1435:5: (lv_right_3_0= ruleDivide )
            	    // InternalKlangParser.g:1436:6: lv_right_3_0= ruleDivide
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplyAccess().getRightDivideParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_26);
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
            	    break loop21;
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
    // InternalKlangParser.g:1458:1: entryRuleDivide returns [EObject current=null] : iv_ruleDivide= ruleDivide EOF ;
    public final EObject entryRuleDivide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivide = null;


        try {
            // InternalKlangParser.g:1458:47: (iv_ruleDivide= ruleDivide EOF )
            // InternalKlangParser.g:1459:2: iv_ruleDivide= ruleDivide EOF
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
    // InternalKlangParser.g:1465:1: ruleDivide returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= Solidus ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleDivide() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1471:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= Solidus ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) )
            // InternalKlangParser.g:1472:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= Solidus ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            {
            // InternalKlangParser.g:1472:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= Solidus ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            // InternalKlangParser.g:1473:3: this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= Solidus ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getDivideAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKlangParser.g:1481:3: ( () otherlv_2= Solidus ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==Solidus) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalKlangParser.g:1482:4: () otherlv_2= Solidus ( (lv_right_3_0= rulePrimaryExpression ) )
            	    {
            	    // InternalKlangParser.g:1482:4: ()
            	    // InternalKlangParser.g:1483:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getDivideAccess().getDivideLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,Solidus,FOLLOW_16); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDivideAccess().getSolidusKeyword_1_1());
            	    			
            	    // InternalKlangParser.g:1493:4: ( (lv_right_3_0= rulePrimaryExpression ) )
            	    // InternalKlangParser.g:1494:5: (lv_right_3_0= rulePrimaryExpression )
            	    {
            	    // InternalKlangParser.g:1494:5: (lv_right_3_0= rulePrimaryExpression )
            	    // InternalKlangParser.g:1495:6: lv_right_3_0= rulePrimaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getDivideAccess().getRightPrimaryExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_27);
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
    // $ANTLR end "ruleDivide"


    // $ANTLR start "entryRuleComparison"
    // InternalKlangParser.g:1517:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalKlangParser.g:1517:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalKlangParser.g:1518:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalKlangParser.g:1524:1: ruleComparison returns [EObject current=null] : (this_Plus_0= rulePlus ( ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSignEqualsSign () ) | (otherlv_5= GreaterThanSign () ) ) ( (lv_right_7_0= rulePlus ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_Plus_0 = null;

        EObject lv_right_7_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1530:2: ( (this_Plus_0= rulePlus ( ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSignEqualsSign () ) | (otherlv_5= GreaterThanSign () ) ) ( (lv_right_7_0= rulePlus ) ) )* ) )
            // InternalKlangParser.g:1531:2: (this_Plus_0= rulePlus ( ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSignEqualsSign () ) | (otherlv_5= GreaterThanSign () ) ) ( (lv_right_7_0= rulePlus ) ) )* )
            {
            // InternalKlangParser.g:1531:2: (this_Plus_0= rulePlus ( ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSignEqualsSign () ) | (otherlv_5= GreaterThanSign () ) ) ( (lv_right_7_0= rulePlus ) ) )* )
            // InternalKlangParser.g:1532:3: this_Plus_0= rulePlus ( ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSignEqualsSign () ) | (otherlv_5= GreaterThanSign () ) ) ( (lv_right_7_0= rulePlus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_Plus_0=rulePlus();

            state._fsp--;


            			current = this_Plus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKlangParser.g:1540:3: ( ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSignEqualsSign () ) | (otherlv_5= GreaterThanSign () ) ) ( (lv_right_7_0= rulePlus ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==EqualsSignEqualsSign||LA24_0==LessThanSign||LA24_0==GreaterThanSign) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalKlangParser.g:1541:4: ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSignEqualsSign () ) | (otherlv_5= GreaterThanSign () ) ) ( (lv_right_7_0= rulePlus ) )
            	    {
            	    // InternalKlangParser.g:1541:4: ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSignEqualsSign () ) | (otherlv_5= GreaterThanSign () ) )
            	    int alt23=3;
            	    switch ( input.LA(1) ) {
            	    case LessThanSign:
            	        {
            	        alt23=1;
            	        }
            	        break;
            	    case EqualsSignEqualsSign:
            	        {
            	        alt23=2;
            	        }
            	        break;
            	    case GreaterThanSign:
            	        {
            	        alt23=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt23) {
            	        case 1 :
            	            // InternalKlangParser.g:1542:5: (otherlv_1= LessThanSign () )
            	            {
            	            // InternalKlangParser.g:1542:5: (otherlv_1= LessThanSign () )
            	            // InternalKlangParser.g:1543:6: otherlv_1= LessThanSign ()
            	            {
            	            otherlv_1=(Token)match(input,LessThanSign,FOLLOW_16); 

            	            						newLeafNode(otherlv_1, grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_0_0());
            	            					
            	            // InternalKlangParser.g:1547:6: ()
            	            // InternalKlangParser.g:1548:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getComparisonAccess().getLessThanLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalKlangParser.g:1556:5: (otherlv_3= EqualsSignEqualsSign () )
            	            {
            	            // InternalKlangParser.g:1556:5: (otherlv_3= EqualsSignEqualsSign () )
            	            // InternalKlangParser.g:1557:6: otherlv_3= EqualsSignEqualsSign ()
            	            {
            	            otherlv_3=(Token)match(input,EqualsSignEqualsSign,FOLLOW_16); 

            	            						newLeafNode(otherlv_3, grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_1_0_1_0());
            	            					
            	            // InternalKlangParser.g:1561:6: ()
            	            // InternalKlangParser.g:1562:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getComparisonAccess().getEqualLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalKlangParser.g:1570:5: (otherlv_5= GreaterThanSign () )
            	            {
            	            // InternalKlangParser.g:1570:5: (otherlv_5= GreaterThanSign () )
            	            // InternalKlangParser.g:1571:6: otherlv_5= GreaterThanSign ()
            	            {
            	            otherlv_5=(Token)match(input,GreaterThanSign,FOLLOW_16); 

            	            						newLeafNode(otherlv_5, grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_2_0());
            	            					
            	            // InternalKlangParser.g:1575:6: ()
            	            // InternalKlangParser.g:1576:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getComparisonAccess().getGreaterThanLeftAction_1_0_2_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalKlangParser.g:1584:4: ( (lv_right_7_0= rulePlus ) )
            	    // InternalKlangParser.g:1585:5: (lv_right_7_0= rulePlus )
            	    {
            	    // InternalKlangParser.g:1585:5: (lv_right_7_0= rulePlus )
            	    // InternalKlangParser.g:1586:6: lv_right_7_0= rulePlus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
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
            	    break loop24;
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
    // InternalKlangParser.g:1608:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalKlangParser.g:1608:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalKlangParser.g:1609:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalKlangParser.g:1615:1: ruleFunctionCall returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= RightParenthesis ) ;
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
            // InternalKlangParser.g:1621:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= RightParenthesis ) )
            // InternalKlangParser.g:1622:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= RightParenthesis )
            {
            // InternalKlangParser.g:1622:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= RightParenthesis )
            // InternalKlangParser.g:1623:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= RightParenthesis
            {
            // InternalKlangParser.g:1623:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalKlangParser.g:1624:4: (lv_name_0_0= RULE_ID )
            {
            // InternalKlangParser.g:1624:4: (lv_name_0_0= RULE_ID )
            // InternalKlangParser.g:1625:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalKlangParser.g:1645:3: ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==False||LA26_0==True||LA26_0==Not||LA26_0==LeftParenthesis||LA26_0==HyphenMinus||(LA26_0>=RULE_ID && LA26_0<=RULE_STRING)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalKlangParser.g:1646:4: ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )*
                    {
                    // InternalKlangParser.g:1646:4: ( (lv_parameters_2_0= ruleExpression ) )
                    // InternalKlangParser.g:1647:5: (lv_parameters_2_0= ruleExpression )
                    {
                    // InternalKlangParser.g:1647:5: (lv_parameters_2_0= ruleExpression )
                    // InternalKlangParser.g:1648:6: lv_parameters_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    // InternalKlangParser.g:1665:4: (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==Comma) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalKlangParser.g:1666:5: otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_16); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalKlangParser.g:1670:5: ( (lv_parameters_4_0= ruleExpression ) )
                    	    // InternalKlangParser.g:1671:6: (lv_parameters_4_0= ruleExpression )
                    	    {
                    	    // InternalKlangParser.g:1671:6: (lv_parameters_4_0= ruleExpression )
                    	    // InternalKlangParser.g:1672:7: lv_parameters_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_30);
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
                    	    break loop25;
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
    // InternalKlangParser.g:1699:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalKlangParser.g:1699:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalKlangParser.g:1700:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalKlangParser.g:1706:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | ( () otherlv_4= Not ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | ( () otherlv_7= HyphenMinus ( (lv_expression_8_0= rulePrimaryExpression ) ) ) | ( () otherlv_10= LeftParenthesis otherlv_11= Double otherlv_12= RightParenthesis ( (lv_expression_13_0= rulePrimaryExpression ) ) ) | ( () otherlv_15= LeftParenthesis otherlv_16= Int otherlv_17= RightParenthesis ( (lv_expression_18_0= rulePrimaryExpression ) ) ) | this_FunctionCall_19= ruleFunctionCall | this_AtomicExpression_20= ruleAtomicExpression ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject this_Expression_1 = null;

        EObject lv_expression_5_0 = null;

        EObject lv_expression_8_0 = null;

        EObject lv_expression_13_0 = null;

        EObject lv_expression_18_0 = null;

        EObject this_FunctionCall_19 = null;

        EObject this_AtomicExpression_20 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1712:2: ( ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | ( () otherlv_4= Not ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | ( () otherlv_7= HyphenMinus ( (lv_expression_8_0= rulePrimaryExpression ) ) ) | ( () otherlv_10= LeftParenthesis otherlv_11= Double otherlv_12= RightParenthesis ( (lv_expression_13_0= rulePrimaryExpression ) ) ) | ( () otherlv_15= LeftParenthesis otherlv_16= Int otherlv_17= RightParenthesis ( (lv_expression_18_0= rulePrimaryExpression ) ) ) | this_FunctionCall_19= ruleFunctionCall | this_AtomicExpression_20= ruleAtomicExpression ) )
            // InternalKlangParser.g:1713:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | ( () otherlv_4= Not ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | ( () otherlv_7= HyphenMinus ( (lv_expression_8_0= rulePrimaryExpression ) ) ) | ( () otherlv_10= LeftParenthesis otherlv_11= Double otherlv_12= RightParenthesis ( (lv_expression_13_0= rulePrimaryExpression ) ) ) | ( () otherlv_15= LeftParenthesis otherlv_16= Int otherlv_17= RightParenthesis ( (lv_expression_18_0= rulePrimaryExpression ) ) ) | this_FunctionCall_19= ruleFunctionCall | this_AtomicExpression_20= ruleAtomicExpression )
            {
            // InternalKlangParser.g:1713:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | ( () otherlv_4= Not ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | ( () otherlv_7= HyphenMinus ( (lv_expression_8_0= rulePrimaryExpression ) ) ) | ( () otherlv_10= LeftParenthesis otherlv_11= Double otherlv_12= RightParenthesis ( (lv_expression_13_0= rulePrimaryExpression ) ) ) | ( () otherlv_15= LeftParenthesis otherlv_16= Int otherlv_17= RightParenthesis ( (lv_expression_18_0= rulePrimaryExpression ) ) ) | this_FunctionCall_19= ruleFunctionCall | this_AtomicExpression_20= ruleAtomicExpression )
            int alt27=7;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // InternalKlangParser.g:1714:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    {
                    // InternalKlangParser.g:1714:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    // InternalKlangParser.g:1715:4: otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis
                    {
                    otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_16); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_21);
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
                    // InternalKlangParser.g:1733:3: ( () otherlv_4= Not ( (lv_expression_5_0= rulePrimaryExpression ) ) )
                    {
                    // InternalKlangParser.g:1733:3: ( () otherlv_4= Not ( (lv_expression_5_0= rulePrimaryExpression ) ) )
                    // InternalKlangParser.g:1734:4: () otherlv_4= Not ( (lv_expression_5_0= rulePrimaryExpression ) )
                    {
                    // InternalKlangParser.g:1734:4: ()
                    // InternalKlangParser.g:1735:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getNotAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,Not,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getNotKeyword_1_1());
                    			
                    // InternalKlangParser.g:1745:4: ( (lv_expression_5_0= rulePrimaryExpression ) )
                    // InternalKlangParser.g:1746:5: (lv_expression_5_0= rulePrimaryExpression )
                    {
                    // InternalKlangParser.g:1746:5: (lv_expression_5_0= rulePrimaryExpression )
                    // InternalKlangParser.g:1747:6: lv_expression_5_0= rulePrimaryExpression
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
                    // InternalKlangParser.g:1766:3: ( () otherlv_7= HyphenMinus ( (lv_expression_8_0= rulePrimaryExpression ) ) )
                    {
                    // InternalKlangParser.g:1766:3: ( () otherlv_7= HyphenMinus ( (lv_expression_8_0= rulePrimaryExpression ) ) )
                    // InternalKlangParser.g:1767:4: () otherlv_7= HyphenMinus ( (lv_expression_8_0= rulePrimaryExpression ) )
                    {
                    // InternalKlangParser.g:1767:4: ()
                    // InternalKlangParser.g:1768:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getUnaryMinusAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,HyphenMinus,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getPrimaryExpressionAccess().getHyphenMinusKeyword_2_1());
                    			
                    // InternalKlangParser.g:1778:4: ( (lv_expression_8_0= rulePrimaryExpression ) )
                    // InternalKlangParser.g:1779:5: (lv_expression_8_0= rulePrimaryExpression )
                    {
                    // InternalKlangParser.g:1779:5: (lv_expression_8_0= rulePrimaryExpression )
                    // InternalKlangParser.g:1780:6: lv_expression_8_0= rulePrimaryExpression
                    {

                    						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_8_0=rulePrimaryExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_8_0,
                    							"com.kaurel.klang.xtext.Klang.PrimaryExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalKlangParser.g:1799:3: ( () otherlv_10= LeftParenthesis otherlv_11= Double otherlv_12= RightParenthesis ( (lv_expression_13_0= rulePrimaryExpression ) ) )
                    {
                    // InternalKlangParser.g:1799:3: ( () otherlv_10= LeftParenthesis otherlv_11= Double otherlv_12= RightParenthesis ( (lv_expression_13_0= rulePrimaryExpression ) ) )
                    // InternalKlangParser.g:1800:4: () otherlv_10= LeftParenthesis otherlv_11= Double otherlv_12= RightParenthesis ( (lv_expression_13_0= rulePrimaryExpression ) )
                    {
                    // InternalKlangParser.g:1800:4: ()
                    // InternalKlangParser.g:1801:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getToDoubleAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_10=(Token)match(input,LeftParenthesis,FOLLOW_31); 

                    				newLeafNode(otherlv_10, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_3_1());
                    			
                    otherlv_11=(Token)match(input,Double,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getPrimaryExpressionAccess().getDoubleKeyword_3_2());
                    			
                    otherlv_12=(Token)match(input,RightParenthesis,FOLLOW_16); 

                    				newLeafNode(otherlv_12, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_3_3());
                    			
                    // InternalKlangParser.g:1819:4: ( (lv_expression_13_0= rulePrimaryExpression ) )
                    // InternalKlangParser.g:1820:5: (lv_expression_13_0= rulePrimaryExpression )
                    {
                    // InternalKlangParser.g:1820:5: (lv_expression_13_0= rulePrimaryExpression )
                    // InternalKlangParser.g:1821:6: lv_expression_13_0= rulePrimaryExpression
                    {

                    						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_3_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_13_0=rulePrimaryExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_13_0,
                    							"com.kaurel.klang.xtext.Klang.PrimaryExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalKlangParser.g:1840:3: ( () otherlv_15= LeftParenthesis otherlv_16= Int otherlv_17= RightParenthesis ( (lv_expression_18_0= rulePrimaryExpression ) ) )
                    {
                    // InternalKlangParser.g:1840:3: ( () otherlv_15= LeftParenthesis otherlv_16= Int otherlv_17= RightParenthesis ( (lv_expression_18_0= rulePrimaryExpression ) ) )
                    // InternalKlangParser.g:1841:4: () otherlv_15= LeftParenthesis otherlv_16= Int otherlv_17= RightParenthesis ( (lv_expression_18_0= rulePrimaryExpression ) )
                    {
                    // InternalKlangParser.g:1841:4: ()
                    // InternalKlangParser.g:1842:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getToIntAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_15=(Token)match(input,LeftParenthesis,FOLLOW_32); 

                    				newLeafNode(otherlv_15, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_1());
                    			
                    otherlv_16=(Token)match(input,Int,FOLLOW_21); 

                    				newLeafNode(otherlv_16, grammarAccess.getPrimaryExpressionAccess().getIntKeyword_4_2());
                    			
                    otherlv_17=(Token)match(input,RightParenthesis,FOLLOW_16); 

                    				newLeafNode(otherlv_17, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_3());
                    			
                    // InternalKlangParser.g:1860:4: ( (lv_expression_18_0= rulePrimaryExpression ) )
                    // InternalKlangParser.g:1861:5: (lv_expression_18_0= rulePrimaryExpression )
                    {
                    // InternalKlangParser.g:1861:5: (lv_expression_18_0= rulePrimaryExpression )
                    // InternalKlangParser.g:1862:6: lv_expression_18_0= rulePrimaryExpression
                    {

                    						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_4_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_18_0=rulePrimaryExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_18_0,
                    							"com.kaurel.klang.xtext.Klang.PrimaryExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalKlangParser.g:1881:3: this_FunctionCall_19= ruleFunctionCall
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFunctionCallParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionCall_19=ruleFunctionCall();

                    state._fsp--;


                    			current = this_FunctionCall_19;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalKlangParser.g:1890:3: this_AtomicExpression_20= ruleAtomicExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getAtomicExpressionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_AtomicExpression_20=ruleAtomicExpression();

                    state._fsp--;


                    			current = this_AtomicExpression_20;
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
    // InternalKlangParser.g:1902:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalKlangParser.g:1902:57: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalKlangParser.g:1903:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
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
    // InternalKlangParser.g:1909:1: ruleAtomicExpression returns [EObject current=null] : ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) | ( () ( (lv_value_4_0= ruleDECIMAL ) ) ) | ( () ( (lv_value_6_0= RULE_INT ) ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( () ( (lv_variableName_10_0= RULE_ID ) ) ) ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token lv_value_6_0=null;
        Token lv_value_8_0=null;
        Token lv_variableName_10_0=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1915:2: ( ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) | ( () ( (lv_value_4_0= ruleDECIMAL ) ) ) | ( () ( (lv_value_6_0= RULE_INT ) ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( () ( (lv_variableName_10_0= RULE_ID ) ) ) ) )
            // InternalKlangParser.g:1916:2: ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) | ( () ( (lv_value_4_0= ruleDECIMAL ) ) ) | ( () ( (lv_value_6_0= RULE_INT ) ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( () ( (lv_variableName_10_0= RULE_ID ) ) ) )
            {
            // InternalKlangParser.g:1916:2: ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) | ( () ( (lv_value_4_0= ruleDECIMAL ) ) ) | ( () ( (lv_value_6_0= RULE_INT ) ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( () ( (lv_variableName_10_0= RULE_ID ) ) ) )
            int alt29=5;
            switch ( input.LA(1) ) {
            case False:
            case True:
                {
                alt29=1;
                }
                break;
            case RULE_INT:
                {
                int LA29_2 = input.LA(2);

                if ( (LA29_2==FullStop) ) {
                    alt29=2;
                }
                else if ( (LA29_2==EOF||LA29_2==Forever||(LA29_2>=Sleep && LA29_2<=While)||LA29_2==When||LA29_2==And||(LA29_2>=Var && LA29_2<=Or)||(LA29_2>=RightParenthesis && LA29_2<=HyphenMinus)||(LA29_2>=Solidus && LA29_2<=LessThanSign)||(LA29_2>=GreaterThanSign && LA29_2<=RULE_ID)) ) {
                    alt29=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt29=4;
                }
                break;
            case RULE_ID:
                {
                alt29=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalKlangParser.g:1917:3: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
                    {
                    // InternalKlangParser.g:1917:3: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
                    // InternalKlangParser.g:1918:4: () ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
                    {
                    // InternalKlangParser.g:1918:4: ()
                    // InternalKlangParser.g:1919:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicExpressionAccess().getBooleanLiteralAction_0_0(),
                    						current);
                    				

                    }

                    // InternalKlangParser.g:1925:4: ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==True) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==False) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalKlangParser.g:1926:5: ( (lv_value_1_0= True ) )
                            {
                            // InternalKlangParser.g:1926:5: ( (lv_value_1_0= True ) )
                            // InternalKlangParser.g:1927:6: (lv_value_1_0= True )
                            {
                            // InternalKlangParser.g:1927:6: (lv_value_1_0= True )
                            // InternalKlangParser.g:1928:7: lv_value_1_0= True
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
                            // InternalKlangParser.g:1941:5: otherlv_2= False
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
                    // InternalKlangParser.g:1948:3: ( () ( (lv_value_4_0= ruleDECIMAL ) ) )
                    {
                    // InternalKlangParser.g:1948:3: ( () ( (lv_value_4_0= ruleDECIMAL ) ) )
                    // InternalKlangParser.g:1949:4: () ( (lv_value_4_0= ruleDECIMAL ) )
                    {
                    // InternalKlangParser.g:1949:4: ()
                    // InternalKlangParser.g:1950:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicExpressionAccess().getDoubleLiteralAction_1_0(),
                    						current);
                    				

                    }

                    // InternalKlangParser.g:1956:4: ( (lv_value_4_0= ruleDECIMAL ) )
                    // InternalKlangParser.g:1957:5: (lv_value_4_0= ruleDECIMAL )
                    {
                    // InternalKlangParser.g:1957:5: (lv_value_4_0= ruleDECIMAL )
                    // InternalKlangParser.g:1958:6: lv_value_4_0= ruleDECIMAL
                    {

                    						newCompositeNode(grammarAccess.getAtomicExpressionAccess().getValueDECIMALParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_4_0=ruleDECIMAL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomicExpressionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"com.kaurel.klang.xtext.Klang.DECIMAL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalKlangParser.g:1977:3: ( () ( (lv_value_6_0= RULE_INT ) ) )
                    {
                    // InternalKlangParser.g:1977:3: ( () ( (lv_value_6_0= RULE_INT ) ) )
                    // InternalKlangParser.g:1978:4: () ( (lv_value_6_0= RULE_INT ) )
                    {
                    // InternalKlangParser.g:1978:4: ()
                    // InternalKlangParser.g:1979:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicExpressionAccess().getIntegerLiteralAction_2_0(),
                    						current);
                    				

                    }

                    // InternalKlangParser.g:1985:4: ( (lv_value_6_0= RULE_INT ) )
                    // InternalKlangParser.g:1986:5: (lv_value_6_0= RULE_INT )
                    {
                    // InternalKlangParser.g:1986:5: (lv_value_6_0= RULE_INT )
                    // InternalKlangParser.g:1987:6: lv_value_6_0= RULE_INT
                    {
                    lv_value_6_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_6_0, grammarAccess.getAtomicExpressionAccess().getValueINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_6_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalKlangParser.g:2005:3: ( () ( (lv_value_8_0= RULE_STRING ) ) )
                    {
                    // InternalKlangParser.g:2005:3: ( () ( (lv_value_8_0= RULE_STRING ) ) )
                    // InternalKlangParser.g:2006:4: () ( (lv_value_8_0= RULE_STRING ) )
                    {
                    // InternalKlangParser.g:2006:4: ()
                    // InternalKlangParser.g:2007:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicExpressionAccess().getStringLiteralAction_3_0(),
                    						current);
                    				

                    }

                    // InternalKlangParser.g:2013:4: ( (lv_value_8_0= RULE_STRING ) )
                    // InternalKlangParser.g:2014:5: (lv_value_8_0= RULE_STRING )
                    {
                    // InternalKlangParser.g:2014:5: (lv_value_8_0= RULE_STRING )
                    // InternalKlangParser.g:2015:6: lv_value_8_0= RULE_STRING
                    {
                    lv_value_8_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_8_0, grammarAccess.getAtomicExpressionAccess().getValueSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalKlangParser.g:2033:3: ( () ( (lv_variableName_10_0= RULE_ID ) ) )
                    {
                    // InternalKlangParser.g:2033:3: ( () ( (lv_variableName_10_0= RULE_ID ) ) )
                    // InternalKlangParser.g:2034:4: () ( (lv_variableName_10_0= RULE_ID ) )
                    {
                    // InternalKlangParser.g:2034:4: ()
                    // InternalKlangParser.g:2035:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicExpressionAccess().getVariableReferenceAction_4_0(),
                    						current);
                    				

                    }

                    // InternalKlangParser.g:2041:4: ( (lv_variableName_10_0= RULE_ID ) )
                    // InternalKlangParser.g:2042:5: (lv_variableName_10_0= RULE_ID )
                    {
                    // InternalKlangParser.g:2042:5: (lv_variableName_10_0= RULE_ID )
                    // InternalKlangParser.g:2043:6: lv_variableName_10_0= RULE_ID
                    {
                    lv_variableName_10_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_variableName_10_0, grammarAccess.getAtomicExpressionAccess().getVariableNameIDTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"variableName",
                    							lv_variableName_10_0,
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


    // $ANTLR start "entryRuleDECIMAL"
    // InternalKlangParser.g:2064:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalKlangParser.g:2064:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalKlangParser.g:2065:2: iv_ruleDECIMAL= ruleDECIMAL EOF
            {
             newCompositeNode(grammarAccess.getDECIMALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDECIMAL=ruleDECIMAL();

            state._fsp--;

             current =iv_ruleDECIMAL.getText(); 
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
    // $ANTLR end "entryRuleDECIMAL"


    // $ANTLR start "ruleDECIMAL"
    // InternalKlangParser.g:2071:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= FullStop this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalKlangParser.g:2077:2: ( (this_INT_0= RULE_INT kw= FullStop this_INT_2= RULE_INT ) )
            // InternalKlangParser.g:2078:2: (this_INT_0= RULE_INT kw= FullStop this_INT_2= RULE_INT )
            {
            // InternalKlangParser.g:2078:2: (this_INT_0= RULE_INT kw= FullStop this_INT_2= RULE_INT )
            // InternalKlangParser.g:2079:3: this_INT_0= RULE_INT kw= FullStop this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_33); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,FullStop,FOLLOW_20); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDECIMALAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleDECIMAL"

    // Delegated rules


    protected DFA27 dfa27 = new DFA27(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\4\uffff\1\5\5\uffff";
    static final String dfa_3s = "\1\13\1\10\2\uffff\1\6\5\uffff";
    static final String dfa_4s = "\2\53\2\uffff\1\51\5\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\uffff\1\7\1\1\1\5\1\4\1\6";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\5\5\uffff\1\5\5\uffff\1\2\4\uffff\1\1\4\uffff\1\3\7\uffff\1\4\2\5",
            "\1\10\2\uffff\1\6\5\uffff\1\6\3\uffff\1\7\1\uffff\1\6\4\uffff\1\6\4\uffff\1\6\7\uffff\3\6",
            "",
            "",
            "\1\5\6\uffff\2\5\3\uffff\1\5\1\uffff\1\5\3\uffff\4\5\1\11\5\5\1\uffff\2\5\1\uffff\4\5",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1713:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | ( () otherlv_4= Not ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | ( () otherlv_7= HyphenMinus ( (lv_expression_8_0= rulePrimaryExpression ) ) ) | ( () otherlv_10= LeftParenthesis otherlv_11= Double otherlv_12= RightParenthesis ( (lv_expression_13_0= rulePrimaryExpression ) ) ) | ( () otherlv_15= LeftParenthesis otherlv_16= Int otherlv_17= RightParenthesis ( (lv_expression_18_0= rulePrimaryExpression ) ) ) | this_FunctionCall_19= ruleFunctionCall | this_AtomicExpression_20= ruleAtomicExpression )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000010001040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000010000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000030004006040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000E0210820800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000005002000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000E0230820800L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000000L});

}