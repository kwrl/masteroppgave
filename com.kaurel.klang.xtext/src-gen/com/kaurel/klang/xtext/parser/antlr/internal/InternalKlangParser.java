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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SendMessage", "Collides", "Received", "Clicked", "Forever", "Pressed", "Double", "Sprite", "Starts", "ENTER", "SPACE", "False", "Scene", "Sleep", "While", "Else", "Game", "True", "When", "With", "And", "Int", "Not", "Var", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "GreaterThanSignEqualsSign", "If", "Or", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "LessThanSign", "EqualsSign", "GreaterThanSign", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
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
    // InternalKlangParser.g:58:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalKlangParser.g:58:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalKlangParser.g:59:2: iv_ruleProgram= ruleProgram EOF
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
    // InternalKlangParser.g:65:1: ruleProgram returns [EObject current=null] : ( ( (lv_sceneActor_0_0= ruleSceneActor ) ) ( (lv_spriteActors_1_0= ruleSpriteActor ) )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_sceneActor_0_0 = null;

        EObject lv_spriteActors_1_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:71:2: ( ( ( (lv_sceneActor_0_0= ruleSceneActor ) ) ( (lv_spriteActors_1_0= ruleSpriteActor ) )* ) )
            // InternalKlangParser.g:72:2: ( ( (lv_sceneActor_0_0= ruleSceneActor ) ) ( (lv_spriteActors_1_0= ruleSpriteActor ) )* )
            {
            // InternalKlangParser.g:72:2: ( ( (lv_sceneActor_0_0= ruleSceneActor ) ) ( (lv_spriteActors_1_0= ruleSpriteActor ) )* )
            // InternalKlangParser.g:73:3: ( (lv_sceneActor_0_0= ruleSceneActor ) ) ( (lv_spriteActors_1_0= ruleSpriteActor ) )*
            {
            // InternalKlangParser.g:73:3: ( (lv_sceneActor_0_0= ruleSceneActor ) )
            // InternalKlangParser.g:74:4: (lv_sceneActor_0_0= ruleSceneActor )
            {
            // InternalKlangParser.g:74:4: (lv_sceneActor_0_0= ruleSceneActor )
            // InternalKlangParser.g:75:5: lv_sceneActor_0_0= ruleSceneActor
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

            // InternalKlangParser.g:92:3: ( (lv_spriteActors_1_0= ruleSpriteActor ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Sprite) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKlangParser.g:93:4: (lv_spriteActors_1_0= ruleSpriteActor )
            	    {
            	    // InternalKlangParser.g:93:4: (lv_spriteActors_1_0= ruleSpriteActor )
            	    // InternalKlangParser.g:94:5: lv_spriteActors_1_0= ruleSpriteActor
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
    // InternalKlangParser.g:115:1: entryRuleSceneActor returns [EObject current=null] : iv_ruleSceneActor= ruleSceneActor EOF ;
    public final EObject entryRuleSceneActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSceneActor = null;


        try {
            // InternalKlangParser.g:115:51: (iv_ruleSceneActor= ruleSceneActor EOF )
            // InternalKlangParser.g:116:2: iv_ruleSceneActor= ruleSceneActor EOF
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
    // InternalKlangParser.g:122:1: ruleSceneActor returns [EObject current=null] : ( () otherlv_1= Scene ( (lv_name_2_0= RULE_ID ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_localVariables_4_0= ruleVariableDeclaration ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* this_END_6= RULE_END )? ) ;
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
            // InternalKlangParser.g:128:2: ( ( () otherlv_1= Scene ( (lv_name_2_0= RULE_ID ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_localVariables_4_0= ruleVariableDeclaration ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* this_END_6= RULE_END )? ) )
            // InternalKlangParser.g:129:2: ( () otherlv_1= Scene ( (lv_name_2_0= RULE_ID ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_localVariables_4_0= ruleVariableDeclaration ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* this_END_6= RULE_END )? )
            {
            // InternalKlangParser.g:129:2: ( () otherlv_1= Scene ( (lv_name_2_0= RULE_ID ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_localVariables_4_0= ruleVariableDeclaration ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* this_END_6= RULE_END )? )
            // InternalKlangParser.g:130:3: () otherlv_1= Scene ( (lv_name_2_0= RULE_ID ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_localVariables_4_0= ruleVariableDeclaration ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* this_END_6= RULE_END )?
            {
            // InternalKlangParser.g:130:3: ()
            // InternalKlangParser.g:131:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSceneActorAccess().getSceneActorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Scene,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSceneActorAccess().getSceneKeyword_1());
            		
            // InternalKlangParser.g:141:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalKlangParser.g:142:4: (lv_name_2_0= RULE_ID )
            {
            // InternalKlangParser.g:142:4: (lv_name_2_0= RULE_ID )
            // InternalKlangParser.g:143:5: lv_name_2_0= RULE_ID
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

            // InternalKlangParser.g:159:3: (this_BEGIN_3= RULE_BEGIN ( (lv_localVariables_4_0= ruleVariableDeclaration ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* this_END_6= RULE_END )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_BEGIN) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalKlangParser.g:160:4: this_BEGIN_3= RULE_BEGIN ( (lv_localVariables_4_0= ruleVariableDeclaration ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* this_END_6= RULE_END
                    {
                    this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_6); 

                    				newLeafNode(this_BEGIN_3, grammarAccess.getSceneActorAccess().getBEGINTerminalRuleCall_3_0());
                    			
                    // InternalKlangParser.g:164:4: ( (lv_localVariables_4_0= ruleVariableDeclaration ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==Var) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalKlangParser.g:165:5: (lv_localVariables_4_0= ruleVariableDeclaration )
                    	    {
                    	    // InternalKlangParser.g:165:5: (lv_localVariables_4_0= ruleVariableDeclaration )
                    	    // InternalKlangParser.g:166:6: lv_localVariables_4_0= ruleVariableDeclaration
                    	    {

                    	    						newCompositeNode(grammarAccess.getSceneActorAccess().getLocalVariablesVariableDeclarationParserRuleCall_3_1_0());
                    	    					
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

                    // InternalKlangParser.g:183:4: ( (lv_eventHandlers_5_0= ruleEventHandler ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==When) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalKlangParser.g:184:5: (lv_eventHandlers_5_0= ruleEventHandler )
                    	    {
                    	    // InternalKlangParser.g:184:5: (lv_eventHandlers_5_0= ruleEventHandler )
                    	    // InternalKlangParser.g:185:6: lv_eventHandlers_5_0= ruleEventHandler
                    	    {

                    	    						newCompositeNode(grammarAccess.getSceneActorAccess().getEventHandlersEventHandlerParserRuleCall_3_2_0());
                    	    					
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

                    				newLeafNode(this_END_6, grammarAccess.getSceneActorAccess().getENDTerminalRuleCall_3_3());
                    			

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
    // $ANTLR end "ruleSceneActor"


    // $ANTLR start "entryRuleSpriteActor"
    // InternalKlangParser.g:211:1: entryRuleSpriteActor returns [EObject current=null] : iv_ruleSpriteActor= ruleSpriteActor EOF ;
    public final EObject entryRuleSpriteActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpriteActor = null;


        try {
            // InternalKlangParser.g:211:52: (iv_ruleSpriteActor= ruleSpriteActor EOF )
            // InternalKlangParser.g:212:2: iv_ruleSpriteActor= ruleSpriteActor EOF
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
    // InternalKlangParser.g:218:1: ruleSpriteActor returns [EObject current=null] : ( () otherlv_1= Sprite ( (lv_name_2_0= RULE_ID ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_localVariables_4_0= ruleVariableDeclaration ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* this_END_6= RULE_END )? ) ;
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
            // InternalKlangParser.g:224:2: ( ( () otherlv_1= Sprite ( (lv_name_2_0= RULE_ID ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_localVariables_4_0= ruleVariableDeclaration ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* this_END_6= RULE_END )? ) )
            // InternalKlangParser.g:225:2: ( () otherlv_1= Sprite ( (lv_name_2_0= RULE_ID ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_localVariables_4_0= ruleVariableDeclaration ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* this_END_6= RULE_END )? )
            {
            // InternalKlangParser.g:225:2: ( () otherlv_1= Sprite ( (lv_name_2_0= RULE_ID ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_localVariables_4_0= ruleVariableDeclaration ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* this_END_6= RULE_END )? )
            // InternalKlangParser.g:226:3: () otherlv_1= Sprite ( (lv_name_2_0= RULE_ID ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_localVariables_4_0= ruleVariableDeclaration ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* this_END_6= RULE_END )?
            {
            // InternalKlangParser.g:226:3: ()
            // InternalKlangParser.g:227:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSpriteActorAccess().getSpriteActorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Sprite,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSpriteActorAccess().getSpriteKeyword_1());
            		
            // InternalKlangParser.g:237:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalKlangParser.g:238:4: (lv_name_2_0= RULE_ID )
            {
            // InternalKlangParser.g:238:4: (lv_name_2_0= RULE_ID )
            // InternalKlangParser.g:239:5: lv_name_2_0= RULE_ID
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

            // InternalKlangParser.g:255:3: (this_BEGIN_3= RULE_BEGIN ( (lv_localVariables_4_0= ruleVariableDeclaration ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* this_END_6= RULE_END )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_BEGIN) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalKlangParser.g:256:4: this_BEGIN_3= RULE_BEGIN ( (lv_localVariables_4_0= ruleVariableDeclaration ) )* ( (lv_eventHandlers_5_0= ruleEventHandler ) )* this_END_6= RULE_END
                    {
                    this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_6); 

                    				newLeafNode(this_BEGIN_3, grammarAccess.getSpriteActorAccess().getBEGINTerminalRuleCall_3_0());
                    			
                    // InternalKlangParser.g:260:4: ( (lv_localVariables_4_0= ruleVariableDeclaration ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==Var) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalKlangParser.g:261:5: (lv_localVariables_4_0= ruleVariableDeclaration )
                    	    {
                    	    // InternalKlangParser.g:261:5: (lv_localVariables_4_0= ruleVariableDeclaration )
                    	    // InternalKlangParser.g:262:6: lv_localVariables_4_0= ruleVariableDeclaration
                    	    {

                    	    						newCompositeNode(grammarAccess.getSpriteActorAccess().getLocalVariablesVariableDeclarationParserRuleCall_3_1_0());
                    	    					
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
                    	    break loop5;
                        }
                    } while (true);

                    // InternalKlangParser.g:279:4: ( (lv_eventHandlers_5_0= ruleEventHandler ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==When) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalKlangParser.g:280:5: (lv_eventHandlers_5_0= ruleEventHandler )
                    	    {
                    	    // InternalKlangParser.g:280:5: (lv_eventHandlers_5_0= ruleEventHandler )
                    	    // InternalKlangParser.g:281:6: lv_eventHandlers_5_0= ruleEventHandler
                    	    {

                    	    						newCompositeNode(grammarAccess.getSpriteActorAccess().getEventHandlersEventHandlerParserRuleCall_3_2_0());
                    	    					
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
                    	    break loop6;
                        }
                    } while (true);

                    this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_6, grammarAccess.getSpriteActorAccess().getENDTerminalRuleCall_3_3());
                    			

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
    // $ANTLR end "ruleSpriteActor"


    // $ANTLR start "entryRuleEventHandler"
    // InternalKlangParser.g:307:1: entryRuleEventHandler returns [EObject current=null] : iv_ruleEventHandler= ruleEventHandler EOF ;
    public final EObject entryRuleEventHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventHandler = null;


        try {
            // InternalKlangParser.g:307:53: (iv_ruleEventHandler= ruleEventHandler EOF )
            // InternalKlangParser.g:308:2: iv_ruleEventHandler= ruleEventHandler EOF
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
    // InternalKlangParser.g:314:1: ruleEventHandler returns [EObject current=null] : (otherlv_0= When ( (lv_referenceEvent_1_0= ruleEvent ) ) this_BEGIN_2= RULE_BEGIN ( (lv_statements_3_0= ruleStatement ) )* this_END_4= RULE_END ) ;
    public final EObject ruleEventHandler() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_referenceEvent_1_0 = null;

        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:320:2: ( (otherlv_0= When ( (lv_referenceEvent_1_0= ruleEvent ) ) this_BEGIN_2= RULE_BEGIN ( (lv_statements_3_0= ruleStatement ) )* this_END_4= RULE_END ) )
            // InternalKlangParser.g:321:2: (otherlv_0= When ( (lv_referenceEvent_1_0= ruleEvent ) ) this_BEGIN_2= RULE_BEGIN ( (lv_statements_3_0= ruleStatement ) )* this_END_4= RULE_END )
            {
            // InternalKlangParser.g:321:2: (otherlv_0= When ( (lv_referenceEvent_1_0= ruleEvent ) ) this_BEGIN_2= RULE_BEGIN ( (lv_statements_3_0= ruleStatement ) )* this_END_4= RULE_END )
            // InternalKlangParser.g:322:3: otherlv_0= When ( (lv_referenceEvent_1_0= ruleEvent ) ) this_BEGIN_2= RULE_BEGIN ( (lv_statements_3_0= ruleStatement ) )* this_END_4= RULE_END
            {
            otherlv_0=(Token)match(input,When,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getEventHandlerAccess().getWhenKeyword_0());
            		
            // InternalKlangParser.g:326:3: ( (lv_referenceEvent_1_0= ruleEvent ) )
            // InternalKlangParser.g:327:4: (lv_referenceEvent_1_0= ruleEvent )
            {
            // InternalKlangParser.g:327:4: (lv_referenceEvent_1_0= ruleEvent )
            // InternalKlangParser.g:328:5: lv_referenceEvent_1_0= ruleEvent
            {

            					newCompositeNode(grammarAccess.getEventHandlerAccess().getReferenceEventEventParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_referenceEvent_1_0=ruleEvent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventHandlerRule());
            					}
            					set(
            						current,
            						"referenceEvent",
            						lv_referenceEvent_1_0,
            						"com.kaurel.klang.xtext.Klang.Event");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_10); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getEventHandlerAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalKlangParser.g:349:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==SendMessage||LA8_0==Forever||(LA8_0>=Sleep && LA8_0<=While)||LA8_0==If||LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKlangParser.g:350:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalKlangParser.g:350:4: (lv_statements_3_0= ruleStatement )
            	    // InternalKlangParser.g:351:5: lv_statements_3_0= ruleStatement
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
            	    break loop8;
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


    // $ANTLR start "entryRuleEvent"
    // InternalKlangParser.g:376:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalKlangParser.g:376:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalKlangParser.g:377:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalKlangParser.g:383:1: ruleEvent returns [EObject current=null] : (this_CollisionEvent_0= ruleCollisionEvent | this_KeyPressedEvent_1= ruleKeyPressedEvent | this_MessageReceivedEvent_2= ruleMessageReceivedEvent | this_GameStartEvent_3= ruleGameStartEvent | this_ClickEvent_4= ruleClickEvent ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        EObject this_CollisionEvent_0 = null;

        EObject this_KeyPressedEvent_1 = null;

        EObject this_MessageReceivedEvent_2 = null;

        EObject this_GameStartEvent_3 = null;

        EObject this_ClickEvent_4 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:389:2: ( (this_CollisionEvent_0= ruleCollisionEvent | this_KeyPressedEvent_1= ruleKeyPressedEvent | this_MessageReceivedEvent_2= ruleMessageReceivedEvent | this_GameStartEvent_3= ruleGameStartEvent | this_ClickEvent_4= ruleClickEvent ) )
            // InternalKlangParser.g:390:2: (this_CollisionEvent_0= ruleCollisionEvent | this_KeyPressedEvent_1= ruleKeyPressedEvent | this_MessageReceivedEvent_2= ruleMessageReceivedEvent | this_GameStartEvent_3= ruleGameStartEvent | this_ClickEvent_4= ruleClickEvent )
            {
            // InternalKlangParser.g:390:2: (this_CollisionEvent_0= ruleCollisionEvent | this_KeyPressedEvent_1= ruleKeyPressedEvent | this_MessageReceivedEvent_2= ruleMessageReceivedEvent | this_GameStartEvent_3= ruleGameStartEvent | this_ClickEvent_4= ruleClickEvent )
            int alt9=5;
            switch ( input.LA(1) ) {
            case Collides:
                {
                alt9=1;
                }
                break;
            case ENTER:
            case SPACE:
            case A:
            case B:
            case C:
            case D:
            case E:
            case F:
            case G:
            case H:
            case I:
            case J:
            case K:
            case L:
            case M:
            case N:
            case O:
            case P:
            case Q:
            case R:
            case S:
            case T:
            case U:
            case V:
            case W:
            case X:
            case Y:
            case Z:
                {
                alt9=2;
                }
                break;
            case RULE_STRING:
                {
                alt9=3;
                }
                break;
            case Game:
                {
                alt9=4;
                }
                break;
            case Clicked:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalKlangParser.g:391:3: this_CollisionEvent_0= ruleCollisionEvent
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getCollisionEventParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CollisionEvent_0=ruleCollisionEvent();

                    state._fsp--;


                    			current = this_CollisionEvent_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKlangParser.g:400:3: this_KeyPressedEvent_1= ruleKeyPressedEvent
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getKeyPressedEventParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_KeyPressedEvent_1=ruleKeyPressedEvent();

                    state._fsp--;


                    			current = this_KeyPressedEvent_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalKlangParser.g:409:3: this_MessageReceivedEvent_2= ruleMessageReceivedEvent
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getMessageReceivedEventParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MessageReceivedEvent_2=ruleMessageReceivedEvent();

                    state._fsp--;


                    			current = this_MessageReceivedEvent_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalKlangParser.g:418:3: this_GameStartEvent_3= ruleGameStartEvent
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getGameStartEventParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_GameStartEvent_3=ruleGameStartEvent();

                    state._fsp--;


                    			current = this_GameStartEvent_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalKlangParser.g:427:3: this_ClickEvent_4= ruleClickEvent
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getClickEventParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClickEvent_4=ruleClickEvent();

                    state._fsp--;


                    			current = this_ClickEvent_4;
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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleMessageReceivedEvent"
    // InternalKlangParser.g:439:1: entryRuleMessageReceivedEvent returns [EObject current=null] : iv_ruleMessageReceivedEvent= ruleMessageReceivedEvent EOF ;
    public final EObject entryRuleMessageReceivedEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageReceivedEvent = null;


        try {
            // InternalKlangParser.g:439:61: (iv_ruleMessageReceivedEvent= ruleMessageReceivedEvent EOF )
            // InternalKlangParser.g:440:2: iv_ruleMessageReceivedEvent= ruleMessageReceivedEvent EOF
            {
             newCompositeNode(grammarAccess.getMessageReceivedEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageReceivedEvent=ruleMessageReceivedEvent();

            state._fsp--;

             current =iv_ruleMessageReceivedEvent; 
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
    // $ANTLR end "entryRuleMessageReceivedEvent"


    // $ANTLR start "ruleMessageReceivedEvent"
    // InternalKlangParser.g:446:1: ruleMessageReceivedEvent returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= Received ) ;
    public final EObject ruleMessageReceivedEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalKlangParser.g:452:2: ( ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= Received ) )
            // InternalKlangParser.g:453:2: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= Received )
            {
            // InternalKlangParser.g:453:2: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= Received )
            // InternalKlangParser.g:454:3: () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= Received
            {
            // InternalKlangParser.g:454:3: ()
            // InternalKlangParser.g:455:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMessageReceivedEventAccess().getMessageReceivedEventAction_0(),
            					current);
            			

            }

            // InternalKlangParser.g:461:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalKlangParser.g:462:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalKlangParser.g:462:4: (lv_name_1_0= RULE_STRING )
            // InternalKlangParser.g:463:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMessageReceivedEventAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageReceivedEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,Received,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getMessageReceivedEventAccess().getReceivedKeyword_2());
            		

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
    // $ANTLR end "ruleMessageReceivedEvent"


    // $ANTLR start "entryRuleGameStartEvent"
    // InternalKlangParser.g:487:1: entryRuleGameStartEvent returns [EObject current=null] : iv_ruleGameStartEvent= ruleGameStartEvent EOF ;
    public final EObject entryRuleGameStartEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGameStartEvent = null;


        try {
            // InternalKlangParser.g:487:55: (iv_ruleGameStartEvent= ruleGameStartEvent EOF )
            // InternalKlangParser.g:488:2: iv_ruleGameStartEvent= ruleGameStartEvent EOF
            {
             newCompositeNode(grammarAccess.getGameStartEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGameStartEvent=ruleGameStartEvent();

            state._fsp--;

             current =iv_ruleGameStartEvent; 
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
    // $ANTLR end "entryRuleGameStartEvent"


    // $ANTLR start "ruleGameStartEvent"
    // InternalKlangParser.g:494:1: ruleGameStartEvent returns [EObject current=null] : ( () otherlv_1= Game otherlv_2= Starts ) ;
    public final EObject ruleGameStartEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalKlangParser.g:500:2: ( ( () otherlv_1= Game otherlv_2= Starts ) )
            // InternalKlangParser.g:501:2: ( () otherlv_1= Game otherlv_2= Starts )
            {
            // InternalKlangParser.g:501:2: ( () otherlv_1= Game otherlv_2= Starts )
            // InternalKlangParser.g:502:3: () otherlv_1= Game otherlv_2= Starts
            {
            // InternalKlangParser.g:502:3: ()
            // InternalKlangParser.g:503:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGameStartEventAccess().getGameStartEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Game,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getGameStartEventAccess().getGameKeyword_1());
            		
            otherlv_2=(Token)match(input,Starts,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getGameStartEventAccess().getStartsKeyword_2());
            		

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
    // $ANTLR end "ruleGameStartEvent"


    // $ANTLR start "entryRuleClickEvent"
    // InternalKlangParser.g:521:1: entryRuleClickEvent returns [EObject current=null] : iv_ruleClickEvent= ruleClickEvent EOF ;
    public final EObject entryRuleClickEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClickEvent = null;


        try {
            // InternalKlangParser.g:521:51: (iv_ruleClickEvent= ruleClickEvent EOF )
            // InternalKlangParser.g:522:2: iv_ruleClickEvent= ruleClickEvent EOF
            {
             newCompositeNode(grammarAccess.getClickEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClickEvent=ruleClickEvent();

            state._fsp--;

             current =iv_ruleClickEvent; 
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
    // $ANTLR end "entryRuleClickEvent"


    // $ANTLR start "ruleClickEvent"
    // InternalKlangParser.g:528:1: ruleClickEvent returns [EObject current=null] : ( () otherlv_1= Clicked ) ;
    public final EObject ruleClickEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKlangParser.g:534:2: ( ( () otherlv_1= Clicked ) )
            // InternalKlangParser.g:535:2: ( () otherlv_1= Clicked )
            {
            // InternalKlangParser.g:535:2: ( () otherlv_1= Clicked )
            // InternalKlangParser.g:536:3: () otherlv_1= Clicked
            {
            // InternalKlangParser.g:536:3: ()
            // InternalKlangParser.g:537:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClickEventAccess().getClickEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Clicked,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getClickEventAccess().getClickedKeyword_1());
            		

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
    // $ANTLR end "ruleClickEvent"


    // $ANTLR start "entryRuleKeyPressedEvent"
    // InternalKlangParser.g:551:1: entryRuleKeyPressedEvent returns [EObject current=null] : iv_ruleKeyPressedEvent= ruleKeyPressedEvent EOF ;
    public final EObject entryRuleKeyPressedEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyPressedEvent = null;


        try {
            // InternalKlangParser.g:551:56: (iv_ruleKeyPressedEvent= ruleKeyPressedEvent EOF )
            // InternalKlangParser.g:552:2: iv_ruleKeyPressedEvent= ruleKeyPressedEvent EOF
            {
             newCompositeNode(grammarAccess.getKeyPressedEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeyPressedEvent=ruleKeyPressedEvent();

            state._fsp--;

             current =iv_ruleKeyPressedEvent; 
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
    // $ANTLR end "entryRuleKeyPressedEvent"


    // $ANTLR start "ruleKeyPressedEvent"
    // InternalKlangParser.g:558:1: ruleKeyPressedEvent returns [EObject current=null] : ( () ( (lv_key_1_0= ruleKeys ) ) otherlv_2= Pressed ) ;
    public final EObject ruleKeyPressedEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_key_1_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:564:2: ( ( () ( (lv_key_1_0= ruleKeys ) ) otherlv_2= Pressed ) )
            // InternalKlangParser.g:565:2: ( () ( (lv_key_1_0= ruleKeys ) ) otherlv_2= Pressed )
            {
            // InternalKlangParser.g:565:2: ( () ( (lv_key_1_0= ruleKeys ) ) otherlv_2= Pressed )
            // InternalKlangParser.g:566:3: () ( (lv_key_1_0= ruleKeys ) ) otherlv_2= Pressed
            {
            // InternalKlangParser.g:566:3: ()
            // InternalKlangParser.g:567:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKeyPressedEventAccess().getKeyPressEventAction_0(),
            					current);
            			

            }

            // InternalKlangParser.g:573:3: ( (lv_key_1_0= ruleKeys ) )
            // InternalKlangParser.g:574:4: (lv_key_1_0= ruleKeys )
            {
            // InternalKlangParser.g:574:4: (lv_key_1_0= ruleKeys )
            // InternalKlangParser.g:575:5: lv_key_1_0= ruleKeys
            {

            					newCompositeNode(grammarAccess.getKeyPressedEventAccess().getKeyKeysEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_key_1_0=ruleKeys();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeyPressedEventRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_1_0,
            						"com.kaurel.klang.xtext.Klang.Keys");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Pressed,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getKeyPressedEventAccess().getPressedKeyword_2());
            		

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
    // $ANTLR end "ruleKeyPressedEvent"


    // $ANTLR start "entryRuleCollisionEvent"
    // InternalKlangParser.g:600:1: entryRuleCollisionEvent returns [EObject current=null] : iv_ruleCollisionEvent= ruleCollisionEvent EOF ;
    public final EObject entryRuleCollisionEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollisionEvent = null;


        try {
            // InternalKlangParser.g:600:55: (iv_ruleCollisionEvent= ruleCollisionEvent EOF )
            // InternalKlangParser.g:601:2: iv_ruleCollisionEvent= ruleCollisionEvent EOF
            {
             newCompositeNode(grammarAccess.getCollisionEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollisionEvent=ruleCollisionEvent();

            state._fsp--;

             current =iv_ruleCollisionEvent; 
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
    // $ANTLR end "entryRuleCollisionEvent"


    // $ANTLR start "ruleCollisionEvent"
    // InternalKlangParser.g:607:1: ruleCollisionEvent returns [EObject current=null] : ( () otherlv_1= Collides otherlv_2= With ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleCollisionEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalKlangParser.g:613:2: ( ( () otherlv_1= Collides otherlv_2= With ( (otherlv_3= RULE_ID ) ) ) )
            // InternalKlangParser.g:614:2: ( () otherlv_1= Collides otherlv_2= With ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalKlangParser.g:614:2: ( () otherlv_1= Collides otherlv_2= With ( (otherlv_3= RULE_ID ) ) )
            // InternalKlangParser.g:615:3: () otherlv_1= Collides otherlv_2= With ( (otherlv_3= RULE_ID ) )
            {
            // InternalKlangParser.g:615:3: ()
            // InternalKlangParser.g:616:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCollisionEventAccess().getCollisionEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Collides,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getCollisionEventAccess().getCollidesKeyword_1());
            		
            otherlv_2=(Token)match(input,With,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getCollisionEventAccess().getWithKeyword_2());
            		
            // InternalKlangParser.g:630:3: ( (otherlv_3= RULE_ID ) )
            // InternalKlangParser.g:631:4: (otherlv_3= RULE_ID )
            {
            // InternalKlangParser.g:631:4: (otherlv_3= RULE_ID )
            // InternalKlangParser.g:632:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollisionEventRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getCollisionEventAccess().getTargetSpriteActorCrossReference_3_0());
            				

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
    // $ANTLR end "ruleCollisionEvent"


    // $ANTLR start "entryRuleStatement"
    // InternalKlangParser.g:647:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalKlangParser.g:647:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalKlangParser.g:648:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalKlangParser.g:654:1: ruleStatement returns [EObject current=null] : (this_WhileLoop_0= ruleWhileLoop | this_If_1= ruleIf | this_VariableAssignment_2= ruleVariableAssignment | this_ForeverLoop_3= ruleForeverLoop | this_FunctionCall_4= ruleFunctionCall | this_Sleep_5= ruleSleep | this_SendMessage_6= ruleSendMessage ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_WhileLoop_0 = null;

        EObject this_If_1 = null;

        EObject this_VariableAssignment_2 = null;

        EObject this_ForeverLoop_3 = null;

        EObject this_FunctionCall_4 = null;

        EObject this_Sleep_5 = null;

        EObject this_SendMessage_6 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:660:2: ( (this_WhileLoop_0= ruleWhileLoop | this_If_1= ruleIf | this_VariableAssignment_2= ruleVariableAssignment | this_ForeverLoop_3= ruleForeverLoop | this_FunctionCall_4= ruleFunctionCall | this_Sleep_5= ruleSleep | this_SendMessage_6= ruleSendMessage ) )
            // InternalKlangParser.g:661:2: (this_WhileLoop_0= ruleWhileLoop | this_If_1= ruleIf | this_VariableAssignment_2= ruleVariableAssignment | this_ForeverLoop_3= ruleForeverLoop | this_FunctionCall_4= ruleFunctionCall | this_Sleep_5= ruleSleep | this_SendMessage_6= ruleSendMessage )
            {
            // InternalKlangParser.g:661:2: (this_WhileLoop_0= ruleWhileLoop | this_If_1= ruleIf | this_VariableAssignment_2= ruleVariableAssignment | this_ForeverLoop_3= ruleForeverLoop | this_FunctionCall_4= ruleFunctionCall | this_Sleep_5= ruleSleep | this_SendMessage_6= ruleSendMessage )
            int alt10=7;
            switch ( input.LA(1) ) {
            case While:
                {
                alt10=1;
                }
                break;
            case If:
                {
                alt10=2;
                }
                break;
            case RULE_ID:
                {
                int LA10_3 = input.LA(2);

                if ( (LA10_3==EqualsSign) ) {
                    alt10=3;
                }
                else if ( (LA10_3==LeftParenthesis) ) {
                    alt10=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

                    throw nvae;
                }
                }
                break;
            case Forever:
                {
                alt10=4;
                }
                break;
            case Sleep:
                {
                alt10=6;
                }
                break;
            case SendMessage:
                {
                alt10=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalKlangParser.g:662:3: this_WhileLoop_0= ruleWhileLoop
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
                    // InternalKlangParser.g:671:3: this_If_1= ruleIf
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
                    // InternalKlangParser.g:680:3: this_VariableAssignment_2= ruleVariableAssignment
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
                    // InternalKlangParser.g:689:3: this_ForeverLoop_3= ruleForeverLoop
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
                    // InternalKlangParser.g:698:3: this_FunctionCall_4= ruleFunctionCall
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
                    // InternalKlangParser.g:707:3: this_Sleep_5= ruleSleep
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSleepParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sleep_5=ruleSleep();

                    state._fsp--;


                    			current = this_Sleep_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalKlangParser.g:716:3: this_SendMessage_6= ruleSendMessage
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSendMessageParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_SendMessage_6=ruleSendMessage();

                    state._fsp--;


                    			current = this_SendMessage_6;
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


    // $ANTLR start "entryRuleSendMessage"
    // InternalKlangParser.g:728:1: entryRuleSendMessage returns [EObject current=null] : iv_ruleSendMessage= ruleSendMessage EOF ;
    public final EObject entryRuleSendMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendMessage = null;


        try {
            // InternalKlangParser.g:728:52: (iv_ruleSendMessage= ruleSendMessage EOF )
            // InternalKlangParser.g:729:2: iv_ruleSendMessage= ruleSendMessage EOF
            {
             newCompositeNode(grammarAccess.getSendMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSendMessage=ruleSendMessage();

            state._fsp--;

             current =iv_ruleSendMessage; 
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
    // $ANTLR end "entryRuleSendMessage"


    // $ANTLR start "ruleSendMessage"
    // InternalKlangParser.g:735:1: ruleSendMessage returns [EObject current=null] : ( () otherlv_1= SendMessage otherlv_2= LeftParenthesis ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= RightParenthesis ) ;
    public final EObject ruleSendMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalKlangParser.g:741:2: ( ( () otherlv_1= SendMessage otherlv_2= LeftParenthesis ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= RightParenthesis ) )
            // InternalKlangParser.g:742:2: ( () otherlv_1= SendMessage otherlv_2= LeftParenthesis ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= RightParenthesis )
            {
            // InternalKlangParser.g:742:2: ( () otherlv_1= SendMessage otherlv_2= LeftParenthesis ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= RightParenthesis )
            // InternalKlangParser.g:743:3: () otherlv_1= SendMessage otherlv_2= LeftParenthesis ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= RightParenthesis
            {
            // InternalKlangParser.g:743:3: ()
            // InternalKlangParser.g:744:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSendMessageAccess().getSendMessageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,SendMessage,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getSendMessageAccess().getSendMessageKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getSendMessageAccess().getLeftParenthesisKeyword_2());
            		
            // InternalKlangParser.g:758:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalKlangParser.g:759:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalKlangParser.g:759:4: (lv_name_3_0= RULE_STRING )
            // InternalKlangParser.g:760:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_name_3_0, grammarAccess.getSendMessageAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSendMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSendMessageAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleSendMessage"


    // $ANTLR start "entryRuleWhileLoop"
    // InternalKlangParser.g:784:1: entryRuleWhileLoop returns [EObject current=null] : iv_ruleWhileLoop= ruleWhileLoop EOF ;
    public final EObject entryRuleWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileLoop = null;


        try {
            // InternalKlangParser.g:784:50: (iv_ruleWhileLoop= ruleWhileLoop EOF )
            // InternalKlangParser.g:785:2: iv_ruleWhileLoop= ruleWhileLoop EOF
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
    // InternalKlangParser.g:791:1: ruleWhileLoop returns [EObject current=null] : ( () otherlv_1= While ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_statements_4_0= ruleStatement ) )* this_END_5= RULE_END ) ;
    public final EObject ruleWhileLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        EObject lv_predicate_2_0 = null;

        EObject lv_statements_4_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:797:2: ( ( () otherlv_1= While ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_statements_4_0= ruleStatement ) )* this_END_5= RULE_END ) )
            // InternalKlangParser.g:798:2: ( () otherlv_1= While ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_statements_4_0= ruleStatement ) )* this_END_5= RULE_END )
            {
            // InternalKlangParser.g:798:2: ( () otherlv_1= While ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_statements_4_0= ruleStatement ) )* this_END_5= RULE_END )
            // InternalKlangParser.g:799:3: () otherlv_1= While ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_statements_4_0= ruleStatement ) )* this_END_5= RULE_END
            {
            // InternalKlangParser.g:799:3: ()
            // InternalKlangParser.g:800:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWhileLoopAccess().getWhileLoopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,While,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getWhileLoopAccess().getWhileKeyword_1());
            		
            // InternalKlangParser.g:810:3: ( (lv_predicate_2_0= ruleExpression ) )
            // InternalKlangParser.g:811:4: (lv_predicate_2_0= ruleExpression )
            {
            // InternalKlangParser.g:811:4: (lv_predicate_2_0= ruleExpression )
            // InternalKlangParser.g:812:5: lv_predicate_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhileLoopAccess().getPredicateExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
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
            		
            // InternalKlangParser.g:833:3: ( (lv_statements_4_0= ruleStatement ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==SendMessage||LA11_0==Forever||(LA11_0>=Sleep && LA11_0<=While)||LA11_0==If||LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalKlangParser.g:834:4: (lv_statements_4_0= ruleStatement )
            	    {
            	    // InternalKlangParser.g:834:4: (lv_statements_4_0= ruleStatement )
            	    // InternalKlangParser.g:835:5: lv_statements_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getWhileLoopAccess().getStatementsStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_statements_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWhileLoopRule());
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
            	    break loop11;
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
    // InternalKlangParser.g:860:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalKlangParser.g:860:43: (iv_ruleIf= ruleIf EOF )
            // InternalKlangParser.g:861:2: iv_ruleIf= ruleIf EOF
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
    // InternalKlangParser.g:867:1: ruleIf returns [EObject current=null] : ( () otherlv_1= If ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_ifBlock_4_0= ruleStatement ) )* this_END_5= RULE_END (otherlv_6= Else this_BEGIN_7= RULE_BEGIN ( (lv_elseBlock_8_0= ruleStatement ) )* this_END_9= RULE_END )? ) ;
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
            // InternalKlangParser.g:873:2: ( ( () otherlv_1= If ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_ifBlock_4_0= ruleStatement ) )* this_END_5= RULE_END (otherlv_6= Else this_BEGIN_7= RULE_BEGIN ( (lv_elseBlock_8_0= ruleStatement ) )* this_END_9= RULE_END )? ) )
            // InternalKlangParser.g:874:2: ( () otherlv_1= If ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_ifBlock_4_0= ruleStatement ) )* this_END_5= RULE_END (otherlv_6= Else this_BEGIN_7= RULE_BEGIN ( (lv_elseBlock_8_0= ruleStatement ) )* this_END_9= RULE_END )? )
            {
            // InternalKlangParser.g:874:2: ( () otherlv_1= If ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_ifBlock_4_0= ruleStatement ) )* this_END_5= RULE_END (otherlv_6= Else this_BEGIN_7= RULE_BEGIN ( (lv_elseBlock_8_0= ruleStatement ) )* this_END_9= RULE_END )? )
            // InternalKlangParser.g:875:3: () otherlv_1= If ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_ifBlock_4_0= ruleStatement ) )* this_END_5= RULE_END (otherlv_6= Else this_BEGIN_7= RULE_BEGIN ( (lv_elseBlock_8_0= ruleStatement ) )* this_END_9= RULE_END )?
            {
            // InternalKlangParser.g:875:3: ()
            // InternalKlangParser.g:876:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIfAccess().getIfAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,If,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getIfAccess().getIfKeyword_1());
            		
            // InternalKlangParser.g:886:3: ( (lv_predicate_2_0= ruleExpression ) )
            // InternalKlangParser.g:887:4: (lv_predicate_2_0= ruleExpression )
            {
            // InternalKlangParser.g:887:4: (lv_predicate_2_0= ruleExpression )
            // InternalKlangParser.g:888:5: lv_predicate_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfAccess().getPredicateExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
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
            		
            // InternalKlangParser.g:909:3: ( (lv_ifBlock_4_0= ruleStatement ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==SendMessage||LA12_0==Forever||(LA12_0>=Sleep && LA12_0<=While)||LA12_0==If||LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalKlangParser.g:910:4: (lv_ifBlock_4_0= ruleStatement )
            	    {
            	    // InternalKlangParser.g:910:4: (lv_ifBlock_4_0= ruleStatement )
            	    // InternalKlangParser.g:911:5: lv_ifBlock_4_0= ruleStatement
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
            	    break loop12;
                }
            } while (true);

            this_END_5=(Token)match(input,RULE_END,FOLLOW_19); 

            			newLeafNode(this_END_5, grammarAccess.getIfAccess().getENDTerminalRuleCall_5());
            		
            // InternalKlangParser.g:932:3: (otherlv_6= Else this_BEGIN_7= RULE_BEGIN ( (lv_elseBlock_8_0= ruleStatement ) )* this_END_9= RULE_END )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Else) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalKlangParser.g:933:4: otherlv_6= Else this_BEGIN_7= RULE_BEGIN ( (lv_elseBlock_8_0= ruleStatement ) )* this_END_9= RULE_END
                    {
                    otherlv_6=(Token)match(input,Else,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getIfAccess().getElseKeyword_6_0());
                    			
                    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_10); 

                    				newLeafNode(this_BEGIN_7, grammarAccess.getIfAccess().getBEGINTerminalRuleCall_6_1());
                    			
                    // InternalKlangParser.g:941:4: ( (lv_elseBlock_8_0= ruleStatement ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==SendMessage||LA13_0==Forever||(LA13_0>=Sleep && LA13_0<=While)||LA13_0==If||LA13_0==RULE_ID) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalKlangParser.g:942:5: (lv_elseBlock_8_0= ruleStatement )
                    	    {
                    	    // InternalKlangParser.g:942:5: (lv_elseBlock_8_0= ruleStatement )
                    	    // InternalKlangParser.g:943:6: lv_elseBlock_8_0= ruleStatement
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
                    	    break loop13;
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
    // InternalKlangParser.g:969:1: entryRuleForeverLoop returns [EObject current=null] : iv_ruleForeverLoop= ruleForeverLoop EOF ;
    public final EObject entryRuleForeverLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeverLoop = null;


        try {
            // InternalKlangParser.g:969:52: (iv_ruleForeverLoop= ruleForeverLoop EOF )
            // InternalKlangParser.g:970:2: iv_ruleForeverLoop= ruleForeverLoop EOF
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
    // InternalKlangParser.g:976:1: ruleForeverLoop returns [EObject current=null] : ( () otherlv_1= Forever this_BEGIN_2= RULE_BEGIN ( (lv_statements_3_0= ruleStatement ) )* this_END_4= RULE_END ) ;
    public final EObject ruleForeverLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:982:2: ( ( () otherlv_1= Forever this_BEGIN_2= RULE_BEGIN ( (lv_statements_3_0= ruleStatement ) )* this_END_4= RULE_END ) )
            // InternalKlangParser.g:983:2: ( () otherlv_1= Forever this_BEGIN_2= RULE_BEGIN ( (lv_statements_3_0= ruleStatement ) )* this_END_4= RULE_END )
            {
            // InternalKlangParser.g:983:2: ( () otherlv_1= Forever this_BEGIN_2= RULE_BEGIN ( (lv_statements_3_0= ruleStatement ) )* this_END_4= RULE_END )
            // InternalKlangParser.g:984:3: () otherlv_1= Forever this_BEGIN_2= RULE_BEGIN ( (lv_statements_3_0= ruleStatement ) )* this_END_4= RULE_END
            {
            // InternalKlangParser.g:984:3: ()
            // InternalKlangParser.g:985:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getForeverLoopAccess().getForeverLoopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Forever,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getForeverLoopAccess().getForeverKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_10); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getForeverLoopAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalKlangParser.g:999:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==SendMessage||LA15_0==Forever||(LA15_0>=Sleep && LA15_0<=While)||LA15_0==If||LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalKlangParser.g:1000:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalKlangParser.g:1000:4: (lv_statements_3_0= ruleStatement )
            	    // InternalKlangParser.g:1001:5: lv_statements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getForeverLoopAccess().getStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_statements_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getForeverLoopRule());
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
            	    break loop15;
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
    // InternalKlangParser.g:1026:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalKlangParser.g:1026:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalKlangParser.g:1027:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
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
    // InternalKlangParser.g:1033:1: ruleVariableDeclaration returns [EObject current=null] : (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_expression_3_0= ruleExpression ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1039:2: ( (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_expression_3_0= ruleExpression ) ) ) )
            // InternalKlangParser.g:1040:2: (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_expression_3_0= ruleExpression ) ) )
            {
            // InternalKlangParser.g:1040:2: (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_expression_3_0= ruleExpression ) ) )
            // InternalKlangParser.g:1041:3: otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_expression_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,Var,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getVarKeyword_0());
            		
            // InternalKlangParser.g:1045:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalKlangParser.g:1046:4: (lv_name_1_0= RULE_ID )
            {
            // InternalKlangParser.g:1046:4: (lv_name_1_0= RULE_ID )
            // InternalKlangParser.g:1047:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            otherlv_2=(Token)match(input,EqualsSign,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2());
            		
            // InternalKlangParser.g:1067:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalKlangParser.g:1068:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalKlangParser.g:1068:4: (lv_expression_3_0= ruleExpression )
            // InternalKlangParser.g:1069:5: lv_expression_3_0= ruleExpression
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
    // InternalKlangParser.g:1090:1: entryRuleVariableAssignment returns [EObject current=null] : iv_ruleVariableAssignment= ruleVariableAssignment EOF ;
    public final EObject entryRuleVariableAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssignment = null;


        try {
            // InternalKlangParser.g:1090:59: (iv_ruleVariableAssignment= ruleVariableAssignment EOF )
            // InternalKlangParser.g:1091:2: iv_ruleVariableAssignment= ruleVariableAssignment EOF
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
    // InternalKlangParser.g:1097:1: ruleVariableAssignment returns [EObject current=null] : ( ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleVariableAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_variableName_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1103:2: ( ( ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalKlangParser.g:1104:2: ( ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalKlangParser.g:1104:2: ( ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalKlangParser.g:1105:3: ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalKlangParser.g:1105:3: ( (lv_variableName_0_0= RULE_ID ) )
            // InternalKlangParser.g:1106:4: (lv_variableName_0_0= RULE_ID )
            {
            // InternalKlangParser.g:1106:4: (lv_variableName_0_0= RULE_ID )
            // InternalKlangParser.g:1107:5: lv_variableName_0_0= RULE_ID
            {
            lv_variableName_0_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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
            		
            // InternalKlangParser.g:1127:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalKlangParser.g:1128:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalKlangParser.g:1128:4: (lv_expression_2_0= ruleExpression )
            // InternalKlangParser.g:1129:5: lv_expression_2_0= ruleExpression
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
    // InternalKlangParser.g:1150:1: entryRuleSleep returns [EObject current=null] : iv_ruleSleep= ruleSleep EOF ;
    public final EObject entryRuleSleep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSleep = null;


        try {
            // InternalKlangParser.g:1150:46: (iv_ruleSleep= ruleSleep EOF )
            // InternalKlangParser.g:1151:2: iv_ruleSleep= ruleSleep EOF
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
    // InternalKlangParser.g:1157:1: ruleSleep returns [EObject current=null] : ( () otherlv_1= Sleep otherlv_2= LeftParenthesis ( (lv_duration_3_0= ruleExpression ) ) otherlv_4= RightParenthesis ) ;
    public final EObject ruleSleep() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duration_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1163:2: ( ( () otherlv_1= Sleep otherlv_2= LeftParenthesis ( (lv_duration_3_0= ruleExpression ) ) otherlv_4= RightParenthesis ) )
            // InternalKlangParser.g:1164:2: ( () otherlv_1= Sleep otherlv_2= LeftParenthesis ( (lv_duration_3_0= ruleExpression ) ) otherlv_4= RightParenthesis )
            {
            // InternalKlangParser.g:1164:2: ( () otherlv_1= Sleep otherlv_2= LeftParenthesis ( (lv_duration_3_0= ruleExpression ) ) otherlv_4= RightParenthesis )
            // InternalKlangParser.g:1165:3: () otherlv_1= Sleep otherlv_2= LeftParenthesis ( (lv_duration_3_0= ruleExpression ) ) otherlv_4= RightParenthesis
            {
            // InternalKlangParser.g:1165:3: ()
            // InternalKlangParser.g:1166:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSleepAccess().getSleepAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Sleep,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getSleepAccess().getSleepKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getSleepAccess().getLeftParenthesisKeyword_2());
            		
            // InternalKlangParser.g:1180:3: ( (lv_duration_3_0= ruleExpression ) )
            // InternalKlangParser.g:1181:4: (lv_duration_3_0= ruleExpression )
            {
            // InternalKlangParser.g:1181:4: (lv_duration_3_0= ruleExpression )
            // InternalKlangParser.g:1182:5: lv_duration_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSleepAccess().getDurationExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_duration_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSleepRule());
            					}
            					set(
            						current,
            						"duration",
            						lv_duration_3_0,
            						"com.kaurel.klang.xtext.Klang.Expression");
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
    // InternalKlangParser.g:1207:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalKlangParser.g:1207:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalKlangParser.g:1208:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalKlangParser.g:1214:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1220:2: (this_Or_0= ruleOr )
            // InternalKlangParser.g:1221:2: this_Or_0= ruleOr
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
    // InternalKlangParser.g:1232:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalKlangParser.g:1232:43: (iv_ruleOr= ruleOr EOF )
            // InternalKlangParser.g:1233:2: iv_ruleOr= ruleOr EOF
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
    // InternalKlangParser.g:1239:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= Or ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1245:2: ( (this_And_0= ruleAnd ( () otherlv_2= Or ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalKlangParser.g:1246:2: (this_And_0= ruleAnd ( () otherlv_2= Or ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalKlangParser.g:1246:2: (this_And_0= ruleAnd ( () otherlv_2= Or ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalKlangParser.g:1247:3: this_And_0= ruleAnd ( () otherlv_2= Or ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKlangParser.g:1255:3: ( () otherlv_2= Or ( (lv_right_3_0= ruleAnd ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==Or) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalKlangParser.g:1256:4: () otherlv_2= Or ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalKlangParser.g:1256:4: ()
            	    // InternalKlangParser.g:1257:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,Or,FOLLOW_18); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getOrKeyword_1_1());
            	    			
            	    // InternalKlangParser.g:1267:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalKlangParser.g:1268:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalKlangParser.g:1268:5: (lv_right_3_0= ruleAnd )
            	    // InternalKlangParser.g:1269:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_21);
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalKlangParser.g:1291:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalKlangParser.g:1291:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalKlangParser.g:1292:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalKlangParser.g:1298:1: ruleAnd returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () otherlv_2= And ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1304:2: ( (this_Comparison_0= ruleComparison ( () otherlv_2= And ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalKlangParser.g:1305:2: (this_Comparison_0= ruleComparison ( () otherlv_2= And ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalKlangParser.g:1305:2: (this_Comparison_0= ruleComparison ( () otherlv_2= And ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalKlangParser.g:1306:3: this_Comparison_0= ruleComparison ( () otherlv_2= And ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKlangParser.g:1314:3: ( () otherlv_2= And ( (lv_right_3_0= ruleComparison ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==And) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalKlangParser.g:1315:4: () otherlv_2= And ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalKlangParser.g:1315:4: ()
            	    // InternalKlangParser.g:1316:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,And,FOLLOW_18); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAndKeyword_1_1());
            	    			
            	    // InternalKlangParser.g:1326:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalKlangParser.g:1327:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalKlangParser.g:1327:5: (lv_right_3_0= ruleComparison )
            	    // InternalKlangParser.g:1328:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_22);
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRulePlus"
    // InternalKlangParser.g:1350:1: entryRulePlus returns [EObject current=null] : iv_rulePlus= rulePlus EOF ;
    public final EObject entryRulePlus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlus = null;


        try {
            // InternalKlangParser.g:1350:45: (iv_rulePlus= rulePlus EOF )
            // InternalKlangParser.g:1351:2: iv_rulePlus= rulePlus EOF
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
    // InternalKlangParser.g:1357:1: rulePlus returns [EObject current=null] : (this_Minus_0= ruleMinus ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMinus ) ) )* ) ;
    public final EObject rulePlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Minus_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1363:2: ( (this_Minus_0= ruleMinus ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMinus ) ) )* ) )
            // InternalKlangParser.g:1364:2: (this_Minus_0= ruleMinus ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMinus ) ) )* )
            {
            // InternalKlangParser.g:1364:2: (this_Minus_0= ruleMinus ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMinus ) ) )* )
            // InternalKlangParser.g:1365:3: this_Minus_0= ruleMinus ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMinus ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusAccess().getMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_Minus_0=ruleMinus();

            state._fsp--;


            			current = this_Minus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKlangParser.g:1373:3: ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMinus ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==PlusSign) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalKlangParser.g:1374:4: () otherlv_2= PlusSign ( (lv_right_3_0= ruleMinus ) )
            	    {
            	    // InternalKlangParser.g:1374:4: ()
            	    // InternalKlangParser.g:1375:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPlusAccess().getPlusLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,PlusSign,FOLLOW_18); 

            	    				newLeafNode(otherlv_2, grammarAccess.getPlusAccess().getPlusSignKeyword_1_1());
            	    			
            	    // InternalKlangParser.g:1385:4: ( (lv_right_3_0= ruleMinus ) )
            	    // InternalKlangParser.g:1386:5: (lv_right_3_0= ruleMinus )
            	    {
            	    // InternalKlangParser.g:1386:5: (lv_right_3_0= ruleMinus )
            	    // InternalKlangParser.g:1387:6: lv_right_3_0= ruleMinus
            	    {

            	    						newCompositeNode(grammarAccess.getPlusAccess().getRightMinusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
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
    // $ANTLR end "rulePlus"


    // $ANTLR start "entryRuleMinus"
    // InternalKlangParser.g:1409:1: entryRuleMinus returns [EObject current=null] : iv_ruleMinus= ruleMinus EOF ;
    public final EObject entryRuleMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinus = null;


        try {
            // InternalKlangParser.g:1409:46: (iv_ruleMinus= ruleMinus EOF )
            // InternalKlangParser.g:1410:2: iv_ruleMinus= ruleMinus EOF
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
    // InternalKlangParser.g:1416:1: ruleMinus returns [EObject current=null] : (this_Multiply_0= ruleMultiply ( () otherlv_2= HyphenMinus ( (lv_right_3_0= ruleMultiply ) ) )* ) ;
    public final EObject ruleMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Multiply_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1422:2: ( (this_Multiply_0= ruleMultiply ( () otherlv_2= HyphenMinus ( (lv_right_3_0= ruleMultiply ) ) )* ) )
            // InternalKlangParser.g:1423:2: (this_Multiply_0= ruleMultiply ( () otherlv_2= HyphenMinus ( (lv_right_3_0= ruleMultiply ) ) )* )
            {
            // InternalKlangParser.g:1423:2: (this_Multiply_0= ruleMultiply ( () otherlv_2= HyphenMinus ( (lv_right_3_0= ruleMultiply ) ) )* )
            // InternalKlangParser.g:1424:3: this_Multiply_0= ruleMultiply ( () otherlv_2= HyphenMinus ( (lv_right_3_0= ruleMultiply ) ) )*
            {

            			newCompositeNode(grammarAccess.getMinusAccess().getMultiplyParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_Multiply_0=ruleMultiply();

            state._fsp--;


            			current = this_Multiply_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKlangParser.g:1432:3: ( () otherlv_2= HyphenMinus ( (lv_right_3_0= ruleMultiply ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==HyphenMinus) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalKlangParser.g:1433:4: () otherlv_2= HyphenMinus ( (lv_right_3_0= ruleMultiply ) )
            	    {
            	    // InternalKlangParser.g:1433:4: ()
            	    // InternalKlangParser.g:1434:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMinusAccess().getMinusLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,HyphenMinus,FOLLOW_18); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMinusAccess().getHyphenMinusKeyword_1_1());
            	    			
            	    // InternalKlangParser.g:1444:4: ( (lv_right_3_0= ruleMultiply ) )
            	    // InternalKlangParser.g:1445:5: (lv_right_3_0= ruleMultiply )
            	    {
            	    // InternalKlangParser.g:1445:5: (lv_right_3_0= ruleMultiply )
            	    // InternalKlangParser.g:1446:6: lv_right_3_0= ruleMultiply
            	    {

            	    						newCompositeNode(grammarAccess.getMinusAccess().getRightMultiplyParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
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
    // $ANTLR end "ruleMinus"


    // $ANTLR start "entryRuleMultiply"
    // InternalKlangParser.g:1468:1: entryRuleMultiply returns [EObject current=null] : iv_ruleMultiply= ruleMultiply EOF ;
    public final EObject entryRuleMultiply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiply = null;


        try {
            // InternalKlangParser.g:1468:49: (iv_ruleMultiply= ruleMultiply EOF )
            // InternalKlangParser.g:1469:2: iv_ruleMultiply= ruleMultiply EOF
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
    // InternalKlangParser.g:1475:1: ruleMultiply returns [EObject current=null] : (this_Divide_0= ruleDivide ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleDivide ) ) )* ) ;
    public final EObject ruleMultiply() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Divide_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1481:2: ( (this_Divide_0= ruleDivide ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleDivide ) ) )* ) )
            // InternalKlangParser.g:1482:2: (this_Divide_0= ruleDivide ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleDivide ) ) )* )
            {
            // InternalKlangParser.g:1482:2: (this_Divide_0= ruleDivide ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleDivide ) ) )* )
            // InternalKlangParser.g:1483:3: this_Divide_0= ruleDivide ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleDivide ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplyAccess().getDivideParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_Divide_0=ruleDivide();

            state._fsp--;


            			current = this_Divide_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKlangParser.g:1491:3: ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleDivide ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==Asterisk) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalKlangParser.g:1492:4: () otherlv_2= Asterisk ( (lv_right_3_0= ruleDivide ) )
            	    {
            	    // InternalKlangParser.g:1492:4: ()
            	    // InternalKlangParser.g:1493:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplyAccess().getMultiplyLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,Asterisk,FOLLOW_18); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMultiplyAccess().getAsteriskKeyword_1_1());
            	    			
            	    // InternalKlangParser.g:1503:4: ( (lv_right_3_0= ruleDivide ) )
            	    // InternalKlangParser.g:1504:5: (lv_right_3_0= ruleDivide )
            	    {
            	    // InternalKlangParser.g:1504:5: (lv_right_3_0= ruleDivide )
            	    // InternalKlangParser.g:1505:6: lv_right_3_0= ruleDivide
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplyAccess().getRightDivideParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
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
    // $ANTLR end "ruleMultiply"


    // $ANTLR start "entryRuleDivide"
    // InternalKlangParser.g:1527:1: entryRuleDivide returns [EObject current=null] : iv_ruleDivide= ruleDivide EOF ;
    public final EObject entryRuleDivide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivide = null;


        try {
            // InternalKlangParser.g:1527:47: (iv_ruleDivide= ruleDivide EOF )
            // InternalKlangParser.g:1528:2: iv_ruleDivide= ruleDivide EOF
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
    // InternalKlangParser.g:1534:1: ruleDivide returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= Solidus ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleDivide() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1540:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= Solidus ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) )
            // InternalKlangParser.g:1541:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= Solidus ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            {
            // InternalKlangParser.g:1541:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= Solidus ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            // InternalKlangParser.g:1542:3: this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= Solidus ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getDivideAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKlangParser.g:1550:3: ( () otherlv_2= Solidus ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Solidus) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalKlangParser.g:1551:4: () otherlv_2= Solidus ( (lv_right_3_0= rulePrimaryExpression ) )
            	    {
            	    // InternalKlangParser.g:1551:4: ()
            	    // InternalKlangParser.g:1552:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getDivideAccess().getDivideLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,Solidus,FOLLOW_18); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDivideAccess().getSolidusKeyword_1_1());
            	    			
            	    // InternalKlangParser.g:1562:4: ( (lv_right_3_0= rulePrimaryExpression ) )
            	    // InternalKlangParser.g:1563:5: (lv_right_3_0= rulePrimaryExpression )
            	    {
            	    // InternalKlangParser.g:1563:5: (lv_right_3_0= rulePrimaryExpression )
            	    // InternalKlangParser.g:1564:6: lv_right_3_0= rulePrimaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getDivideAccess().getRightPrimaryExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_26);
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
    // $ANTLR end "ruleDivide"


    // $ANTLR start "entryRuleComparison"
    // InternalKlangParser.g:1586:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalKlangParser.g:1586:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalKlangParser.g:1587:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalKlangParser.g:1593:1: ruleComparison returns [EObject current=null] : (this_Plus_0= rulePlus ( ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSignEqualsSign () ) | (otherlv_5= GreaterThanSign () ) | (otherlv_7= LessThanSignEqualsSign () ) | (otherlv_9= GreaterThanSignEqualsSign () ) ) ( (lv_right_11_0= rulePlus ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject this_Plus_0 = null;

        EObject lv_right_11_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1599:2: ( (this_Plus_0= rulePlus ( ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSignEqualsSign () ) | (otherlv_5= GreaterThanSign () ) | (otherlv_7= LessThanSignEqualsSign () ) | (otherlv_9= GreaterThanSignEqualsSign () ) ) ( (lv_right_11_0= rulePlus ) ) )* ) )
            // InternalKlangParser.g:1600:2: (this_Plus_0= rulePlus ( ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSignEqualsSign () ) | (otherlv_5= GreaterThanSign () ) | (otherlv_7= LessThanSignEqualsSign () ) | (otherlv_9= GreaterThanSignEqualsSign () ) ) ( (lv_right_11_0= rulePlus ) ) )* )
            {
            // InternalKlangParser.g:1600:2: (this_Plus_0= rulePlus ( ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSignEqualsSign () ) | (otherlv_5= GreaterThanSign () ) | (otherlv_7= LessThanSignEqualsSign () ) | (otherlv_9= GreaterThanSignEqualsSign () ) ) ( (lv_right_11_0= rulePlus ) ) )* )
            // InternalKlangParser.g:1601:3: this_Plus_0= rulePlus ( ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSignEqualsSign () ) | (otherlv_5= GreaterThanSign () ) | (otherlv_7= LessThanSignEqualsSign () ) | (otherlv_9= GreaterThanSignEqualsSign () ) ) ( (lv_right_11_0= rulePlus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_Plus_0=rulePlus();

            state._fsp--;


            			current = this_Plus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKlangParser.g:1609:3: ( ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSignEqualsSign () ) | (otherlv_5= GreaterThanSign () ) | (otherlv_7= LessThanSignEqualsSign () ) | (otherlv_9= GreaterThanSignEqualsSign () ) ) ( (lv_right_11_0= rulePlus ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=LessThanSignEqualsSign && LA23_0<=GreaterThanSignEqualsSign)||LA23_0==LessThanSign||LA23_0==GreaterThanSign) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalKlangParser.g:1610:4: ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSignEqualsSign () ) | (otherlv_5= GreaterThanSign () ) | (otherlv_7= LessThanSignEqualsSign () ) | (otherlv_9= GreaterThanSignEqualsSign () ) ) ( (lv_right_11_0= rulePlus ) )
            	    {
            	    // InternalKlangParser.g:1610:4: ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSignEqualsSign () ) | (otherlv_5= GreaterThanSign () ) | (otherlv_7= LessThanSignEqualsSign () ) | (otherlv_9= GreaterThanSignEqualsSign () ) )
            	    int alt22=5;
            	    switch ( input.LA(1) ) {
            	    case LessThanSign:
            	        {
            	        alt22=1;
            	        }
            	        break;
            	    case EqualsSignEqualsSign:
            	        {
            	        alt22=2;
            	        }
            	        break;
            	    case GreaterThanSign:
            	        {
            	        alt22=3;
            	        }
            	        break;
            	    case LessThanSignEqualsSign:
            	        {
            	        alt22=4;
            	        }
            	        break;
            	    case GreaterThanSignEqualsSign:
            	        {
            	        alt22=5;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt22) {
            	        case 1 :
            	            // InternalKlangParser.g:1611:5: (otherlv_1= LessThanSign () )
            	            {
            	            // InternalKlangParser.g:1611:5: (otherlv_1= LessThanSign () )
            	            // InternalKlangParser.g:1612:6: otherlv_1= LessThanSign ()
            	            {
            	            otherlv_1=(Token)match(input,LessThanSign,FOLLOW_18); 

            	            						newLeafNode(otherlv_1, grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_0_0());
            	            					
            	            // InternalKlangParser.g:1616:6: ()
            	            // InternalKlangParser.g:1617:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getComparisonAccess().getLessThanLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalKlangParser.g:1625:5: (otherlv_3= EqualsSignEqualsSign () )
            	            {
            	            // InternalKlangParser.g:1625:5: (otherlv_3= EqualsSignEqualsSign () )
            	            // InternalKlangParser.g:1626:6: otherlv_3= EqualsSignEqualsSign ()
            	            {
            	            otherlv_3=(Token)match(input,EqualsSignEqualsSign,FOLLOW_18); 

            	            						newLeafNode(otherlv_3, grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_1_0_1_0());
            	            					
            	            // InternalKlangParser.g:1630:6: ()
            	            // InternalKlangParser.g:1631:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getComparisonAccess().getEqualLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalKlangParser.g:1639:5: (otherlv_5= GreaterThanSign () )
            	            {
            	            // InternalKlangParser.g:1639:5: (otherlv_5= GreaterThanSign () )
            	            // InternalKlangParser.g:1640:6: otherlv_5= GreaterThanSign ()
            	            {
            	            otherlv_5=(Token)match(input,GreaterThanSign,FOLLOW_18); 

            	            						newLeafNode(otherlv_5, grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_2_0());
            	            					
            	            // InternalKlangParser.g:1644:6: ()
            	            // InternalKlangParser.g:1645:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getComparisonAccess().getGreaterThanLeftAction_1_0_2_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalKlangParser.g:1653:5: (otherlv_7= LessThanSignEqualsSign () )
            	            {
            	            // InternalKlangParser.g:1653:5: (otherlv_7= LessThanSignEqualsSign () )
            	            // InternalKlangParser.g:1654:6: otherlv_7= LessThanSignEqualsSign ()
            	            {
            	            otherlv_7=(Token)match(input,LessThanSignEqualsSign,FOLLOW_18); 

            	            						newLeafNode(otherlv_7, grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_3_0());
            	            					
            	            // InternalKlangParser.g:1658:6: ()
            	            // InternalKlangParser.g:1659:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getComparisonAccess().getLessThanOrEqualLeftAction_1_0_3_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 5 :
            	            // InternalKlangParser.g:1667:5: (otherlv_9= GreaterThanSignEqualsSign () )
            	            {
            	            // InternalKlangParser.g:1667:5: (otherlv_9= GreaterThanSignEqualsSign () )
            	            // InternalKlangParser.g:1668:6: otherlv_9= GreaterThanSignEqualsSign ()
            	            {
            	            otherlv_9=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_18); 

            	            						newLeafNode(otherlv_9, grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_0_4_0());
            	            					
            	            // InternalKlangParser.g:1672:6: ()
            	            // InternalKlangParser.g:1673:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getComparisonAccess().getGreaterThanOrEqualLeftAction_1_0_4_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalKlangParser.g:1681:4: ( (lv_right_11_0= rulePlus ) )
            	    // InternalKlangParser.g:1682:5: (lv_right_11_0= rulePlus )
            	    {
            	    // InternalKlangParser.g:1682:5: (lv_right_11_0= rulePlus )
            	    // InternalKlangParser.g:1683:6: lv_right_11_0= rulePlus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_right_11_0=rulePlus();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_11_0,
            	    							"com.kaurel.klang.xtext.Klang.Plus");
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
    // InternalKlangParser.g:1705:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalKlangParser.g:1705:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalKlangParser.g:1706:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalKlangParser.g:1712:1: ruleFunctionCall returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= RightParenthesis ) ;
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
            // InternalKlangParser.g:1718:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= RightParenthesis ) )
            // InternalKlangParser.g:1719:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= RightParenthesis )
            {
            // InternalKlangParser.g:1719:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= RightParenthesis )
            // InternalKlangParser.g:1720:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= RightParenthesis
            {
            // InternalKlangParser.g:1720:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalKlangParser.g:1721:4: (lv_name_0_0= RULE_ID )
            {
            // InternalKlangParser.g:1721:4: (lv_name_0_0= RULE_ID )
            // InternalKlangParser.g:1722:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalKlangParser.g:1742:3: ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Double||LA25_0==False||LA25_0==True||(LA25_0>=Int && LA25_0<=Not)||LA25_0==LeftParenthesis||LA25_0==HyphenMinus||(LA25_0>=RULE_ID && LA25_0<=RULE_STRING)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalKlangParser.g:1743:4: ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )*
                    {
                    // InternalKlangParser.g:1743:4: ( (lv_parameters_2_0= ruleExpression ) )
                    // InternalKlangParser.g:1744:5: (lv_parameters_2_0= ruleExpression )
                    {
                    // InternalKlangParser.g:1744:5: (lv_parameters_2_0= ruleExpression )
                    // InternalKlangParser.g:1745:6: lv_parameters_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    // InternalKlangParser.g:1762:4: (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==Comma) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalKlangParser.g:1763:5: otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_18); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalKlangParser.g:1767:5: ( (lv_parameters_4_0= ruleExpression ) )
                    	    // InternalKlangParser.g:1768:6: (lv_parameters_4_0= ruleExpression )
                    	    {
                    	    // InternalKlangParser.g:1768:6: (lv_parameters_4_0= ruleExpression )
                    	    // InternalKlangParser.g:1769:7: lv_parameters_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
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
                    	    break loop24;
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
    // InternalKlangParser.g:1796:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalKlangParser.g:1796:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalKlangParser.g:1797:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalKlangParser.g:1803:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | ( () otherlv_4= Not ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | ( () otherlv_7= HyphenMinus ( (lv_expression_8_0= rulePrimaryExpression ) ) ) | ( () otherlv_10= Double otherlv_11= LeftParenthesis ( (lv_expression_12_0= rulePrimaryExpression ) ) otherlv_13= RightParenthesis ) | ( () otherlv_15= Int otherlv_16= LeftParenthesis ( (lv_expression_17_0= rulePrimaryExpression ) ) otherlv_18= RightParenthesis ) | this_FunctionCall_19= ruleFunctionCall | this_AtomicExpression_20= ruleAtomicExpression ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject this_Expression_1 = null;

        EObject lv_expression_5_0 = null;

        EObject lv_expression_8_0 = null;

        EObject lv_expression_12_0 = null;

        EObject lv_expression_17_0 = null;

        EObject this_FunctionCall_19 = null;

        EObject this_AtomicExpression_20 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1809:2: ( ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | ( () otherlv_4= Not ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | ( () otherlv_7= HyphenMinus ( (lv_expression_8_0= rulePrimaryExpression ) ) ) | ( () otherlv_10= Double otherlv_11= LeftParenthesis ( (lv_expression_12_0= rulePrimaryExpression ) ) otherlv_13= RightParenthesis ) | ( () otherlv_15= Int otherlv_16= LeftParenthesis ( (lv_expression_17_0= rulePrimaryExpression ) ) otherlv_18= RightParenthesis ) | this_FunctionCall_19= ruleFunctionCall | this_AtomicExpression_20= ruleAtomicExpression ) )
            // InternalKlangParser.g:1810:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | ( () otherlv_4= Not ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | ( () otherlv_7= HyphenMinus ( (lv_expression_8_0= rulePrimaryExpression ) ) ) | ( () otherlv_10= Double otherlv_11= LeftParenthesis ( (lv_expression_12_0= rulePrimaryExpression ) ) otherlv_13= RightParenthesis ) | ( () otherlv_15= Int otherlv_16= LeftParenthesis ( (lv_expression_17_0= rulePrimaryExpression ) ) otherlv_18= RightParenthesis ) | this_FunctionCall_19= ruleFunctionCall | this_AtomicExpression_20= ruleAtomicExpression )
            {
            // InternalKlangParser.g:1810:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | ( () otherlv_4= Not ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | ( () otherlv_7= HyphenMinus ( (lv_expression_8_0= rulePrimaryExpression ) ) ) | ( () otherlv_10= Double otherlv_11= LeftParenthesis ( (lv_expression_12_0= rulePrimaryExpression ) ) otherlv_13= RightParenthesis ) | ( () otherlv_15= Int otherlv_16= LeftParenthesis ( (lv_expression_17_0= rulePrimaryExpression ) ) otherlv_18= RightParenthesis ) | this_FunctionCall_19= ruleFunctionCall | this_AtomicExpression_20= ruleAtomicExpression )
            int alt26=7;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt26=1;
                }
                break;
            case Not:
                {
                alt26=2;
                }
                break;
            case HyphenMinus:
                {
                alt26=3;
                }
                break;
            case Double:
                {
                alt26=4;
                }
                break;
            case Int:
                {
                alt26=5;
                }
                break;
            case RULE_ID:
                {
                int LA26_6 = input.LA(2);

                if ( (LA26_6==EOF||LA26_6==SendMessage||LA26_6==Forever||(LA26_6>=Sleep && LA26_6<=While)||LA26_6==When||LA26_6==And||(LA26_6>=Var && LA26_6<=Or)||(LA26_6>=RightParenthesis && LA26_6<=HyphenMinus)||(LA26_6>=Solidus && LA26_6<=LessThanSign)||LA26_6==GreaterThanSign||(LA26_6>=RULE_BEGIN && LA26_6<=RULE_ID)) ) {
                    alt26=7;
                }
                else if ( (LA26_6==LeftParenthesis) ) {
                    alt26=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 6, input);

                    throw nvae;
                }
                }
                break;
            case False:
            case True:
            case RULE_INT:
            case RULE_STRING:
                {
                alt26=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalKlangParser.g:1811:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    {
                    // InternalKlangParser.g:1811:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    // InternalKlangParser.g:1812:4: otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis
                    {
                    otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_18); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_17);
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
                    // InternalKlangParser.g:1830:3: ( () otherlv_4= Not ( (lv_expression_5_0= rulePrimaryExpression ) ) )
                    {
                    // InternalKlangParser.g:1830:3: ( () otherlv_4= Not ( (lv_expression_5_0= rulePrimaryExpression ) ) )
                    // InternalKlangParser.g:1831:4: () otherlv_4= Not ( (lv_expression_5_0= rulePrimaryExpression ) )
                    {
                    // InternalKlangParser.g:1831:4: ()
                    // InternalKlangParser.g:1832:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getNotAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,Not,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getNotKeyword_1_1());
                    			
                    // InternalKlangParser.g:1842:4: ( (lv_expression_5_0= rulePrimaryExpression ) )
                    // InternalKlangParser.g:1843:5: (lv_expression_5_0= rulePrimaryExpression )
                    {
                    // InternalKlangParser.g:1843:5: (lv_expression_5_0= rulePrimaryExpression )
                    // InternalKlangParser.g:1844:6: lv_expression_5_0= rulePrimaryExpression
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
                    // InternalKlangParser.g:1863:3: ( () otherlv_7= HyphenMinus ( (lv_expression_8_0= rulePrimaryExpression ) ) )
                    {
                    // InternalKlangParser.g:1863:3: ( () otherlv_7= HyphenMinus ( (lv_expression_8_0= rulePrimaryExpression ) ) )
                    // InternalKlangParser.g:1864:4: () otherlv_7= HyphenMinus ( (lv_expression_8_0= rulePrimaryExpression ) )
                    {
                    // InternalKlangParser.g:1864:4: ()
                    // InternalKlangParser.g:1865:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getUnaryMinusAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,HyphenMinus,FOLLOW_18); 

                    				newLeafNode(otherlv_7, grammarAccess.getPrimaryExpressionAccess().getHyphenMinusKeyword_2_1());
                    			
                    // InternalKlangParser.g:1875:4: ( (lv_expression_8_0= rulePrimaryExpression ) )
                    // InternalKlangParser.g:1876:5: (lv_expression_8_0= rulePrimaryExpression )
                    {
                    // InternalKlangParser.g:1876:5: (lv_expression_8_0= rulePrimaryExpression )
                    // InternalKlangParser.g:1877:6: lv_expression_8_0= rulePrimaryExpression
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
                    // InternalKlangParser.g:1896:3: ( () otherlv_10= Double otherlv_11= LeftParenthesis ( (lv_expression_12_0= rulePrimaryExpression ) ) otherlv_13= RightParenthesis )
                    {
                    // InternalKlangParser.g:1896:3: ( () otherlv_10= Double otherlv_11= LeftParenthesis ( (lv_expression_12_0= rulePrimaryExpression ) ) otherlv_13= RightParenthesis )
                    // InternalKlangParser.g:1897:4: () otherlv_10= Double otherlv_11= LeftParenthesis ( (lv_expression_12_0= rulePrimaryExpression ) ) otherlv_13= RightParenthesis
                    {
                    // InternalKlangParser.g:1897:4: ()
                    // InternalKlangParser.g:1898:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getToDoubleAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_10=(Token)match(input,Double,FOLLOW_15); 

                    				newLeafNode(otherlv_10, grammarAccess.getPrimaryExpressionAccess().getDoubleKeyword_3_1());
                    			
                    otherlv_11=(Token)match(input,LeftParenthesis,FOLLOW_18); 

                    				newLeafNode(otherlv_11, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_3_2());
                    			
                    // InternalKlangParser.g:1912:4: ( (lv_expression_12_0= rulePrimaryExpression ) )
                    // InternalKlangParser.g:1913:5: (lv_expression_12_0= rulePrimaryExpression )
                    {
                    // InternalKlangParser.g:1913:5: (lv_expression_12_0= rulePrimaryExpression )
                    // InternalKlangParser.g:1914:6: lv_expression_12_0= rulePrimaryExpression
                    {

                    						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_expression_12_0=rulePrimaryExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_12_0,
                    							"com.kaurel.klang.xtext.Klang.PrimaryExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,RightParenthesis,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_3_4());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalKlangParser.g:1937:3: ( () otherlv_15= Int otherlv_16= LeftParenthesis ( (lv_expression_17_0= rulePrimaryExpression ) ) otherlv_18= RightParenthesis )
                    {
                    // InternalKlangParser.g:1937:3: ( () otherlv_15= Int otherlv_16= LeftParenthesis ( (lv_expression_17_0= rulePrimaryExpression ) ) otherlv_18= RightParenthesis )
                    // InternalKlangParser.g:1938:4: () otherlv_15= Int otherlv_16= LeftParenthesis ( (lv_expression_17_0= rulePrimaryExpression ) ) otherlv_18= RightParenthesis
                    {
                    // InternalKlangParser.g:1938:4: ()
                    // InternalKlangParser.g:1939:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getToIntAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_15=(Token)match(input,Int,FOLLOW_15); 

                    				newLeafNode(otherlv_15, grammarAccess.getPrimaryExpressionAccess().getIntKeyword_4_1());
                    			
                    otherlv_16=(Token)match(input,LeftParenthesis,FOLLOW_18); 

                    				newLeafNode(otherlv_16, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_2());
                    			
                    // InternalKlangParser.g:1953:4: ( (lv_expression_17_0= rulePrimaryExpression ) )
                    // InternalKlangParser.g:1954:5: (lv_expression_17_0= rulePrimaryExpression )
                    {
                    // InternalKlangParser.g:1954:5: (lv_expression_17_0= rulePrimaryExpression )
                    // InternalKlangParser.g:1955:6: lv_expression_17_0= rulePrimaryExpression
                    {

                    						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_expression_17_0=rulePrimaryExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_17_0,
                    							"com.kaurel.klang.xtext.Klang.PrimaryExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_18=(Token)match(input,RightParenthesis,FOLLOW_2); 

                    				newLeafNode(otherlv_18, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalKlangParser.g:1978:3: this_FunctionCall_19= ruleFunctionCall
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
                    // InternalKlangParser.g:1987:3: this_AtomicExpression_20= ruleAtomicExpression
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
    // InternalKlangParser.g:1999:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalKlangParser.g:1999:57: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalKlangParser.g:2000:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
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
    // InternalKlangParser.g:2006:1: ruleAtomicExpression returns [EObject current=null] : ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) | ( () ( (lv_value_4_0= ruleDECIMAL ) ) ) | ( () ( (lv_value_6_0= RULE_INT ) ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( () ( (lv_variableName_10_0= RULE_ID ) ) ) ) ;
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
            // InternalKlangParser.g:2012:2: ( ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) | ( () ( (lv_value_4_0= ruleDECIMAL ) ) ) | ( () ( (lv_value_6_0= RULE_INT ) ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( () ( (lv_variableName_10_0= RULE_ID ) ) ) ) )
            // InternalKlangParser.g:2013:2: ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) | ( () ( (lv_value_4_0= ruleDECIMAL ) ) ) | ( () ( (lv_value_6_0= RULE_INT ) ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( () ( (lv_variableName_10_0= RULE_ID ) ) ) )
            {
            // InternalKlangParser.g:2013:2: ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) | ( () ( (lv_value_4_0= ruleDECIMAL ) ) ) | ( () ( (lv_value_6_0= RULE_INT ) ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( () ( (lv_variableName_10_0= RULE_ID ) ) ) )
            int alt28=5;
            switch ( input.LA(1) ) {
            case False:
            case True:
                {
                alt28=1;
                }
                break;
            case RULE_INT:
                {
                int LA28_2 = input.LA(2);

                if ( (LA28_2==EOF||LA28_2==SendMessage||LA28_2==Forever||(LA28_2>=Sleep && LA28_2<=While)||LA28_2==When||LA28_2==And||(LA28_2>=Var && LA28_2<=Or)||(LA28_2>=RightParenthesis && LA28_2<=HyphenMinus)||(LA28_2>=Solidus && LA28_2<=LessThanSign)||LA28_2==GreaterThanSign||(LA28_2>=RULE_BEGIN && LA28_2<=RULE_ID)) ) {
                    alt28=3;
                }
                else if ( (LA28_2==FullStop) ) {
                    alt28=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt28=4;
                }
                break;
            case RULE_ID:
                {
                alt28=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalKlangParser.g:2014:3: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
                    {
                    // InternalKlangParser.g:2014:3: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
                    // InternalKlangParser.g:2015:4: () ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
                    {
                    // InternalKlangParser.g:2015:4: ()
                    // InternalKlangParser.g:2016:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicExpressionAccess().getBooleanLiteralAction_0_0(),
                    						current);
                    				

                    }

                    // InternalKlangParser.g:2022:4: ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==True) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==False) ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalKlangParser.g:2023:5: ( (lv_value_1_0= True ) )
                            {
                            // InternalKlangParser.g:2023:5: ( (lv_value_1_0= True ) )
                            // InternalKlangParser.g:2024:6: (lv_value_1_0= True )
                            {
                            // InternalKlangParser.g:2024:6: (lv_value_1_0= True )
                            // InternalKlangParser.g:2025:7: lv_value_1_0= True
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
                            // InternalKlangParser.g:2038:5: otherlv_2= False
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
                    // InternalKlangParser.g:2045:3: ( () ( (lv_value_4_0= ruleDECIMAL ) ) )
                    {
                    // InternalKlangParser.g:2045:3: ( () ( (lv_value_4_0= ruleDECIMAL ) ) )
                    // InternalKlangParser.g:2046:4: () ( (lv_value_4_0= ruleDECIMAL ) )
                    {
                    // InternalKlangParser.g:2046:4: ()
                    // InternalKlangParser.g:2047:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicExpressionAccess().getDoubleLiteralAction_1_0(),
                    						current);
                    				

                    }

                    // InternalKlangParser.g:2053:4: ( (lv_value_4_0= ruleDECIMAL ) )
                    // InternalKlangParser.g:2054:5: (lv_value_4_0= ruleDECIMAL )
                    {
                    // InternalKlangParser.g:2054:5: (lv_value_4_0= ruleDECIMAL )
                    // InternalKlangParser.g:2055:6: lv_value_4_0= ruleDECIMAL
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
                    // InternalKlangParser.g:2074:3: ( () ( (lv_value_6_0= RULE_INT ) ) )
                    {
                    // InternalKlangParser.g:2074:3: ( () ( (lv_value_6_0= RULE_INT ) ) )
                    // InternalKlangParser.g:2075:4: () ( (lv_value_6_0= RULE_INT ) )
                    {
                    // InternalKlangParser.g:2075:4: ()
                    // InternalKlangParser.g:2076:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicExpressionAccess().getIntegerLiteralAction_2_0(),
                    						current);
                    				

                    }

                    // InternalKlangParser.g:2082:4: ( (lv_value_6_0= RULE_INT ) )
                    // InternalKlangParser.g:2083:5: (lv_value_6_0= RULE_INT )
                    {
                    // InternalKlangParser.g:2083:5: (lv_value_6_0= RULE_INT )
                    // InternalKlangParser.g:2084:6: lv_value_6_0= RULE_INT
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
                    // InternalKlangParser.g:2102:3: ( () ( (lv_value_8_0= RULE_STRING ) ) )
                    {
                    // InternalKlangParser.g:2102:3: ( () ( (lv_value_8_0= RULE_STRING ) ) )
                    // InternalKlangParser.g:2103:4: () ( (lv_value_8_0= RULE_STRING ) )
                    {
                    // InternalKlangParser.g:2103:4: ()
                    // InternalKlangParser.g:2104:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicExpressionAccess().getStringLiteralAction_3_0(),
                    						current);
                    				

                    }

                    // InternalKlangParser.g:2110:4: ( (lv_value_8_0= RULE_STRING ) )
                    // InternalKlangParser.g:2111:5: (lv_value_8_0= RULE_STRING )
                    {
                    // InternalKlangParser.g:2111:5: (lv_value_8_0= RULE_STRING )
                    // InternalKlangParser.g:2112:6: lv_value_8_0= RULE_STRING
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
                    // InternalKlangParser.g:2130:3: ( () ( (lv_variableName_10_0= RULE_ID ) ) )
                    {
                    // InternalKlangParser.g:2130:3: ( () ( (lv_variableName_10_0= RULE_ID ) ) )
                    // InternalKlangParser.g:2131:4: () ( (lv_variableName_10_0= RULE_ID ) )
                    {
                    // InternalKlangParser.g:2131:4: ()
                    // InternalKlangParser.g:2132:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicExpressionAccess().getVariableReferenceAction_4_0(),
                    						current);
                    				

                    }

                    // InternalKlangParser.g:2138:4: ( (lv_variableName_10_0= RULE_ID ) )
                    // InternalKlangParser.g:2139:5: (lv_variableName_10_0= RULE_ID )
                    {
                    // InternalKlangParser.g:2139:5: (lv_variableName_10_0= RULE_ID )
                    // InternalKlangParser.g:2140:6: lv_variableName_10_0= RULE_ID
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
    // InternalKlangParser.g:2161:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalKlangParser.g:2161:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalKlangParser.g:2162:2: iv_ruleDECIMAL= ruleDECIMAL EOF
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
    // InternalKlangParser.g:2168:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= FullStop this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalKlangParser.g:2174:2: ( (this_INT_0= RULE_INT kw= FullStop this_INT_2= RULE_INT ) )
            // InternalKlangParser.g:2175:2: (this_INT_0= RULE_INT kw= FullStop this_INT_2= RULE_INT )
            {
            // InternalKlangParser.g:2175:2: (this_INT_0= RULE_INT kw= FullStop this_INT_2= RULE_INT )
            // InternalKlangParser.g:2176:3: this_INT_0= RULE_INT kw= FullStop this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_30); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,FullStop,FOLLOW_31); 

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


    // $ANTLR start "ruleKeys"
    // InternalKlangParser.g:2199:1: ruleKeys returns [Enumerator current=null] : ( (enumLiteral_0= A ) | (enumLiteral_1= B ) | (enumLiteral_2= C ) | (enumLiteral_3= D ) | (enumLiteral_4= E ) | (enumLiteral_5= F ) | (enumLiteral_6= G ) | (enumLiteral_7= H ) | (enumLiteral_8= I ) | (enumLiteral_9= J ) | (enumLiteral_10= K ) | (enumLiteral_11= L ) | (enumLiteral_12= M ) | (enumLiteral_13= N ) | (enumLiteral_14= O ) | (enumLiteral_15= P ) | (enumLiteral_16= Q ) | (enumLiteral_17= R ) | (enumLiteral_18= S ) | (enumLiteral_19= T ) | (enumLiteral_20= U ) | (enumLiteral_21= V ) | (enumLiteral_22= W ) | (enumLiteral_23= X ) | (enumLiteral_24= Y ) | (enumLiteral_25= Z ) | (enumLiteral_26= SPACE ) | (enumLiteral_27= ENTER ) ) ;
    public final Enumerator ruleKeys() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;
        Token enumLiteral_17=null;
        Token enumLiteral_18=null;
        Token enumLiteral_19=null;
        Token enumLiteral_20=null;
        Token enumLiteral_21=null;
        Token enumLiteral_22=null;
        Token enumLiteral_23=null;
        Token enumLiteral_24=null;
        Token enumLiteral_25=null;
        Token enumLiteral_26=null;
        Token enumLiteral_27=null;


        	enterRule();

        try {
            // InternalKlangParser.g:2205:2: ( ( (enumLiteral_0= A ) | (enumLiteral_1= B ) | (enumLiteral_2= C ) | (enumLiteral_3= D ) | (enumLiteral_4= E ) | (enumLiteral_5= F ) | (enumLiteral_6= G ) | (enumLiteral_7= H ) | (enumLiteral_8= I ) | (enumLiteral_9= J ) | (enumLiteral_10= K ) | (enumLiteral_11= L ) | (enumLiteral_12= M ) | (enumLiteral_13= N ) | (enumLiteral_14= O ) | (enumLiteral_15= P ) | (enumLiteral_16= Q ) | (enumLiteral_17= R ) | (enumLiteral_18= S ) | (enumLiteral_19= T ) | (enumLiteral_20= U ) | (enumLiteral_21= V ) | (enumLiteral_22= W ) | (enumLiteral_23= X ) | (enumLiteral_24= Y ) | (enumLiteral_25= Z ) | (enumLiteral_26= SPACE ) | (enumLiteral_27= ENTER ) ) )
            // InternalKlangParser.g:2206:2: ( (enumLiteral_0= A ) | (enumLiteral_1= B ) | (enumLiteral_2= C ) | (enumLiteral_3= D ) | (enumLiteral_4= E ) | (enumLiteral_5= F ) | (enumLiteral_6= G ) | (enumLiteral_7= H ) | (enumLiteral_8= I ) | (enumLiteral_9= J ) | (enumLiteral_10= K ) | (enumLiteral_11= L ) | (enumLiteral_12= M ) | (enumLiteral_13= N ) | (enumLiteral_14= O ) | (enumLiteral_15= P ) | (enumLiteral_16= Q ) | (enumLiteral_17= R ) | (enumLiteral_18= S ) | (enumLiteral_19= T ) | (enumLiteral_20= U ) | (enumLiteral_21= V ) | (enumLiteral_22= W ) | (enumLiteral_23= X ) | (enumLiteral_24= Y ) | (enumLiteral_25= Z ) | (enumLiteral_26= SPACE ) | (enumLiteral_27= ENTER ) )
            {
            // InternalKlangParser.g:2206:2: ( (enumLiteral_0= A ) | (enumLiteral_1= B ) | (enumLiteral_2= C ) | (enumLiteral_3= D ) | (enumLiteral_4= E ) | (enumLiteral_5= F ) | (enumLiteral_6= G ) | (enumLiteral_7= H ) | (enumLiteral_8= I ) | (enumLiteral_9= J ) | (enumLiteral_10= K ) | (enumLiteral_11= L ) | (enumLiteral_12= M ) | (enumLiteral_13= N ) | (enumLiteral_14= O ) | (enumLiteral_15= P ) | (enumLiteral_16= Q ) | (enumLiteral_17= R ) | (enumLiteral_18= S ) | (enumLiteral_19= T ) | (enumLiteral_20= U ) | (enumLiteral_21= V ) | (enumLiteral_22= W ) | (enumLiteral_23= X ) | (enumLiteral_24= Y ) | (enumLiteral_25= Z ) | (enumLiteral_26= SPACE ) | (enumLiteral_27= ENTER ) )
            int alt29=28;
            switch ( input.LA(1) ) {
            case A:
                {
                alt29=1;
                }
                break;
            case B:
                {
                alt29=2;
                }
                break;
            case C:
                {
                alt29=3;
                }
                break;
            case D:
                {
                alt29=4;
                }
                break;
            case E:
                {
                alt29=5;
                }
                break;
            case F:
                {
                alt29=6;
                }
                break;
            case G:
                {
                alt29=7;
                }
                break;
            case H:
                {
                alt29=8;
                }
                break;
            case I:
                {
                alt29=9;
                }
                break;
            case J:
                {
                alt29=10;
                }
                break;
            case K:
                {
                alt29=11;
                }
                break;
            case L:
                {
                alt29=12;
                }
                break;
            case M:
                {
                alt29=13;
                }
                break;
            case N:
                {
                alt29=14;
                }
                break;
            case O:
                {
                alt29=15;
                }
                break;
            case P:
                {
                alt29=16;
                }
                break;
            case Q:
                {
                alt29=17;
                }
                break;
            case R:
                {
                alt29=18;
                }
                break;
            case S:
                {
                alt29=19;
                }
                break;
            case T:
                {
                alt29=20;
                }
                break;
            case U:
                {
                alt29=21;
                }
                break;
            case V:
                {
                alt29=22;
                }
                break;
            case W:
                {
                alt29=23;
                }
                break;
            case X:
                {
                alt29=24;
                }
                break;
            case Y:
                {
                alt29=25;
                }
                break;
            case Z:
                {
                alt29=26;
                }
                break;
            case SPACE:
                {
                alt29=27;
                }
                break;
            case ENTER:
                {
                alt29=28;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalKlangParser.g:2207:3: (enumLiteral_0= A )
                    {
                    // InternalKlangParser.g:2207:3: (enumLiteral_0= A )
                    // InternalKlangParser.g:2208:4: enumLiteral_0= A
                    {
                    enumLiteral_0=(Token)match(input,A,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getKeysAccess().getAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalKlangParser.g:2215:3: (enumLiteral_1= B )
                    {
                    // InternalKlangParser.g:2215:3: (enumLiteral_1= B )
                    // InternalKlangParser.g:2216:4: enumLiteral_1= B
                    {
                    enumLiteral_1=(Token)match(input,B,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getKeysAccess().getBEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalKlangParser.g:2223:3: (enumLiteral_2= C )
                    {
                    // InternalKlangParser.g:2223:3: (enumLiteral_2= C )
                    // InternalKlangParser.g:2224:4: enumLiteral_2= C
                    {
                    enumLiteral_2=(Token)match(input,C,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getCEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getKeysAccess().getCEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalKlangParser.g:2231:3: (enumLiteral_3= D )
                    {
                    // InternalKlangParser.g:2231:3: (enumLiteral_3= D )
                    // InternalKlangParser.g:2232:4: enumLiteral_3= D
                    {
                    enumLiteral_3=(Token)match(input,D,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getKeysAccess().getDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalKlangParser.g:2239:3: (enumLiteral_4= E )
                    {
                    // InternalKlangParser.g:2239:3: (enumLiteral_4= E )
                    // InternalKlangParser.g:2240:4: enumLiteral_4= E
                    {
                    enumLiteral_4=(Token)match(input,E,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getKeysAccess().getEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalKlangParser.g:2247:3: (enumLiteral_5= F )
                    {
                    // InternalKlangParser.g:2247:3: (enumLiteral_5= F )
                    // InternalKlangParser.g:2248:4: enumLiteral_5= F
                    {
                    enumLiteral_5=(Token)match(input,F,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getFEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getKeysAccess().getFEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalKlangParser.g:2255:3: (enumLiteral_6= G )
                    {
                    // InternalKlangParser.g:2255:3: (enumLiteral_6= G )
                    // InternalKlangParser.g:2256:4: enumLiteral_6= G
                    {
                    enumLiteral_6=(Token)match(input,G,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getGEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getKeysAccess().getGEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalKlangParser.g:2263:3: (enumLiteral_7= H )
                    {
                    // InternalKlangParser.g:2263:3: (enumLiteral_7= H )
                    // InternalKlangParser.g:2264:4: enumLiteral_7= H
                    {
                    enumLiteral_7=(Token)match(input,H,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getHEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getKeysAccess().getHEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalKlangParser.g:2271:3: (enumLiteral_8= I )
                    {
                    // InternalKlangParser.g:2271:3: (enumLiteral_8= I )
                    // InternalKlangParser.g:2272:4: enumLiteral_8= I
                    {
                    enumLiteral_8=(Token)match(input,I,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getIEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getKeysAccess().getIEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalKlangParser.g:2279:3: (enumLiteral_9= J )
                    {
                    // InternalKlangParser.g:2279:3: (enumLiteral_9= J )
                    // InternalKlangParser.g:2280:4: enumLiteral_9= J
                    {
                    enumLiteral_9=(Token)match(input,J,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getJEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getKeysAccess().getJEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalKlangParser.g:2287:3: (enumLiteral_10= K )
                    {
                    // InternalKlangParser.g:2287:3: (enumLiteral_10= K )
                    // InternalKlangParser.g:2288:4: enumLiteral_10= K
                    {
                    enumLiteral_10=(Token)match(input,K,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getKEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getKeysAccess().getKEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalKlangParser.g:2295:3: (enumLiteral_11= L )
                    {
                    // InternalKlangParser.g:2295:3: (enumLiteral_11= L )
                    // InternalKlangParser.g:2296:4: enumLiteral_11= L
                    {
                    enumLiteral_11=(Token)match(input,L,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getLEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getKeysAccess().getLEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalKlangParser.g:2303:3: (enumLiteral_12= M )
                    {
                    // InternalKlangParser.g:2303:3: (enumLiteral_12= M )
                    // InternalKlangParser.g:2304:4: enumLiteral_12= M
                    {
                    enumLiteral_12=(Token)match(input,M,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getMEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getKeysAccess().getMEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalKlangParser.g:2311:3: (enumLiteral_13= N )
                    {
                    // InternalKlangParser.g:2311:3: (enumLiteral_13= N )
                    // InternalKlangParser.g:2312:4: enumLiteral_13= N
                    {
                    enumLiteral_13=(Token)match(input,N,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getNEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getKeysAccess().getNEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalKlangParser.g:2319:3: (enumLiteral_14= O )
                    {
                    // InternalKlangParser.g:2319:3: (enumLiteral_14= O )
                    // InternalKlangParser.g:2320:4: enumLiteral_14= O
                    {
                    enumLiteral_14=(Token)match(input,O,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getOEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getKeysAccess().getOEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalKlangParser.g:2327:3: (enumLiteral_15= P )
                    {
                    // InternalKlangParser.g:2327:3: (enumLiteral_15= P )
                    // InternalKlangParser.g:2328:4: enumLiteral_15= P
                    {
                    enumLiteral_15=(Token)match(input,P,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getPEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getKeysAccess().getPEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalKlangParser.g:2335:3: (enumLiteral_16= Q )
                    {
                    // InternalKlangParser.g:2335:3: (enumLiteral_16= Q )
                    // InternalKlangParser.g:2336:4: enumLiteral_16= Q
                    {
                    enumLiteral_16=(Token)match(input,Q,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getQEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getKeysAccess().getQEnumLiteralDeclaration_16());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalKlangParser.g:2343:3: (enumLiteral_17= R )
                    {
                    // InternalKlangParser.g:2343:3: (enumLiteral_17= R )
                    // InternalKlangParser.g:2344:4: enumLiteral_17= R
                    {
                    enumLiteral_17=(Token)match(input,R,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getREnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_17, grammarAccess.getKeysAccess().getREnumLiteralDeclaration_17());
                    			

                    }


                    }
                    break;
                case 19 :
                    // InternalKlangParser.g:2351:3: (enumLiteral_18= S )
                    {
                    // InternalKlangParser.g:2351:3: (enumLiteral_18= S )
                    // InternalKlangParser.g:2352:4: enumLiteral_18= S
                    {
                    enumLiteral_18=(Token)match(input,S,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getSEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_18, grammarAccess.getKeysAccess().getSEnumLiteralDeclaration_18());
                    			

                    }


                    }
                    break;
                case 20 :
                    // InternalKlangParser.g:2359:3: (enumLiteral_19= T )
                    {
                    // InternalKlangParser.g:2359:3: (enumLiteral_19= T )
                    // InternalKlangParser.g:2360:4: enumLiteral_19= T
                    {
                    enumLiteral_19=(Token)match(input,T,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getTEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_19, grammarAccess.getKeysAccess().getTEnumLiteralDeclaration_19());
                    			

                    }


                    }
                    break;
                case 21 :
                    // InternalKlangParser.g:2367:3: (enumLiteral_20= U )
                    {
                    // InternalKlangParser.g:2367:3: (enumLiteral_20= U )
                    // InternalKlangParser.g:2368:4: enumLiteral_20= U
                    {
                    enumLiteral_20=(Token)match(input,U,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getUEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_20, grammarAccess.getKeysAccess().getUEnumLiteralDeclaration_20());
                    			

                    }


                    }
                    break;
                case 22 :
                    // InternalKlangParser.g:2375:3: (enumLiteral_21= V )
                    {
                    // InternalKlangParser.g:2375:3: (enumLiteral_21= V )
                    // InternalKlangParser.g:2376:4: enumLiteral_21= V
                    {
                    enumLiteral_21=(Token)match(input,V,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getVEnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_21, grammarAccess.getKeysAccess().getVEnumLiteralDeclaration_21());
                    			

                    }


                    }
                    break;
                case 23 :
                    // InternalKlangParser.g:2383:3: (enumLiteral_22= W )
                    {
                    // InternalKlangParser.g:2383:3: (enumLiteral_22= W )
                    // InternalKlangParser.g:2384:4: enumLiteral_22= W
                    {
                    enumLiteral_22=(Token)match(input,W,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getWEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_22, grammarAccess.getKeysAccess().getWEnumLiteralDeclaration_22());
                    			

                    }


                    }
                    break;
                case 24 :
                    // InternalKlangParser.g:2391:3: (enumLiteral_23= X )
                    {
                    // InternalKlangParser.g:2391:3: (enumLiteral_23= X )
                    // InternalKlangParser.g:2392:4: enumLiteral_23= X
                    {
                    enumLiteral_23=(Token)match(input,X,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getXEnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_23, grammarAccess.getKeysAccess().getXEnumLiteralDeclaration_23());
                    			

                    }


                    }
                    break;
                case 25 :
                    // InternalKlangParser.g:2399:3: (enumLiteral_24= Y )
                    {
                    // InternalKlangParser.g:2399:3: (enumLiteral_24= Y )
                    // InternalKlangParser.g:2400:4: enumLiteral_24= Y
                    {
                    enumLiteral_24=(Token)match(input,Y,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getYEnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_24, grammarAccess.getKeysAccess().getYEnumLiteralDeclaration_24());
                    			

                    }


                    }
                    break;
                case 26 :
                    // InternalKlangParser.g:2407:3: (enumLiteral_25= Z )
                    {
                    // InternalKlangParser.g:2407:3: (enumLiteral_25= Z )
                    // InternalKlangParser.g:2408:4: enumLiteral_25= Z
                    {
                    enumLiteral_25=(Token)match(input,Z,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getZEnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_25, grammarAccess.getKeysAccess().getZEnumLiteralDeclaration_25());
                    			

                    }


                    }
                    break;
                case 27 :
                    // InternalKlangParser.g:2415:3: (enumLiteral_26= SPACE )
                    {
                    // InternalKlangParser.g:2415:3: (enumLiteral_26= SPACE )
                    // InternalKlangParser.g:2416:4: enumLiteral_26= SPACE
                    {
                    enumLiteral_26=(Token)match(input,SPACE,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getSPACEEnumLiteralDeclaration_26().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_26, grammarAccess.getKeysAccess().getSPACEEnumLiteralDeclaration_26());
                    			

                    }


                    }
                    break;
                case 28 :
                    // InternalKlangParser.g:2423:3: (enumLiteral_27= ENTER )
                    {
                    // InternalKlangParser.g:2423:3: (enumLiteral_27= ENTER )
                    // InternalKlangParser.g:2424:4: enumLiteral_27= ENTER
                    {
                    enumLiteral_27=(Token)match(input,ENTER,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getENTEREnumLiteralDeclaration_27().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_27, grammarAccess.getKeysAccess().getENTEREnumLiteralDeclaration_27());
                    			

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
    // $ANTLR end "ruleKeys"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008400000L,0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0xFFFFF000001060A0L,0x000000000000043FL});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080060110L,0x0000000000000180L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004206208400L,0x0000000000000700L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000A0070000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004606208400L,0x0000000000000700L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});

}