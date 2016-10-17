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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SendMessage", "Collides", "Received", "Clicked", "Forever", "Pressed", "Double", "Sprite", "Starts", "ENTER", "SPACE", "False", "Scene", "Sleep", "While", "Else", "Game", "True", "When", "With", "And", "Int", "Not", "Var", "EqualsSignEqualsSign", "If", "Or", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "LessThanSign", "EqualsSign", "GreaterThanSign", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "LeftSquareBracket", "RightSquareBracket", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Or=30;
    public static final int RULE_BEGIN=70;
    public static final int Clicked=7;
    public static final int Var=27;
    public static final int True=21;
    public static final int False=15;
    public static final int LessThanSign=39;
    public static final int Forever=8;
    public static final int LeftParenthesis=31;
    public static final int RightSquareBracket=69;
    public static final int SendMessage=4;
    public static final int GreaterThanSign=41;
    public static final int RULE_ID=72;
    public static final int Collides=5;
    public static final int Received=6;
    public static final int RightParenthesis=32;
    public static final int Scene=16;
    public static final int Double=10;
    public static final int EqualsSignEqualsSign=28;
    public static final int Not=26;
    public static final int Game=20;
    public static final int And=24;
    public static final int PlusSign=34;
    public static final int RULE_INT=73;
    public static final int RULE_ML_COMMENT=75;
    public static final int LeftSquareBracket=68;
    public static final int If=29;
    public static final int A=42;
    public static final int Pressed=9;
    public static final int B=43;
    public static final int RULE_END=71;
    public static final int Starts=12;
    public static final int C=44;
    public static final int D=45;
    public static final int E=46;
    public static final int F=47;
    public static final int G=48;
    public static final int H=49;
    public static final int ENTER=13;
    public static final int I=50;
    public static final int J=51;
    public static final int RULE_STRING=74;
    public static final int K=52;
    public static final int L=53;
    public static final int M=54;
    public static final int Int=25;
    public static final int N=55;
    public static final int With=23;
    public static final int O=56;
    public static final int RULE_SL_COMMENT=76;
    public static final int SPACE=14;
    public static final int P=57;
    public static final int Comma=35;
    public static final int EqualsSign=40;
    public static final int Q=58;
    public static final int HyphenMinus=36;
    public static final int R=59;
    public static final int S=60;
    public static final int T=61;
    public static final int U=62;
    public static final int V=63;
    public static final int W=64;
    public static final int X=65;
    public static final int Y=66;
    public static final int Z=67;
    public static final int Solidus=38;
    public static final int EOF=-1;
    public static final int Asterisk=33;
    public static final int FullStop=37;
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
    // InternalKlangParser.g:314:1: ruleEventHandler returns [EObject current=null] : (this_GameStart_0= ruleGameStart | this_SpriteClicked_1= ruleSpriteClicked | this_KeyPressed_2= ruleKeyPressed | this_CollidesWith_3= ruleCollidesWith | this_MessageReceived_4= ruleMessageReceived ) ;
    public final EObject ruleEventHandler() throws RecognitionException {
        EObject current = null;

        EObject this_GameStart_0 = null;

        EObject this_SpriteClicked_1 = null;

        EObject this_KeyPressed_2 = null;

        EObject this_CollidesWith_3 = null;

        EObject this_MessageReceived_4 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:320:2: ( (this_GameStart_0= ruleGameStart | this_SpriteClicked_1= ruleSpriteClicked | this_KeyPressed_2= ruleKeyPressed | this_CollidesWith_3= ruleCollidesWith | this_MessageReceived_4= ruleMessageReceived ) )
            // InternalKlangParser.g:321:2: (this_GameStart_0= ruleGameStart | this_SpriteClicked_1= ruleSpriteClicked | this_KeyPressed_2= ruleKeyPressed | this_CollidesWith_3= ruleCollidesWith | this_MessageReceived_4= ruleMessageReceived )
            {
            // InternalKlangParser.g:321:2: (this_GameStart_0= ruleGameStart | this_SpriteClicked_1= ruleSpriteClicked | this_KeyPressed_2= ruleKeyPressed | this_CollidesWith_3= ruleCollidesWith | this_MessageReceived_4= ruleMessageReceived )
            int alt8=5;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==When) ) {
                switch ( input.LA(2) ) {
                case LeftSquareBracket:
                    {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2==RULE_STRING) ) {
                        alt8=5;
                    }
                    else if ( ((LA8_2>=ENTER && LA8_2<=SPACE)||(LA8_2>=A && LA8_2<=Z)) ) {
                        alt8=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case Clicked:
                    {
                    alt8=2;
                    }
                    break;
                case Collides:
                    {
                    alt8=4;
                    }
                    break;
                case Game:
                    {
                    alt8=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalKlangParser.g:322:3: this_GameStart_0= ruleGameStart
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
                    // InternalKlangParser.g:331:3: this_SpriteClicked_1= ruleSpriteClicked
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
                    // InternalKlangParser.g:340:3: this_KeyPressed_2= ruleKeyPressed
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
                    // InternalKlangParser.g:349:3: this_CollidesWith_3= ruleCollidesWith
                    {

                    			newCompositeNode(grammarAccess.getEventHandlerAccess().getCollidesWithParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CollidesWith_3=ruleCollidesWith();

                    state._fsp--;


                    			current = this_CollidesWith_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalKlangParser.g:358:3: this_MessageReceived_4= ruleMessageReceived
                    {

                    			newCompositeNode(grammarAccess.getEventHandlerAccess().getMessageReceivedParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_MessageReceived_4=ruleMessageReceived();

                    state._fsp--;


                    			current = this_MessageReceived_4;
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


    // $ANTLR start "entryRuleMessageReceived"
    // InternalKlangParser.g:370:1: entryRuleMessageReceived returns [EObject current=null] : iv_ruleMessageReceived= ruleMessageReceived EOF ;
    public final EObject entryRuleMessageReceived() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageReceived = null;


        try {
            // InternalKlangParser.g:370:56: (iv_ruleMessageReceived= ruleMessageReceived EOF )
            // InternalKlangParser.g:371:2: iv_ruleMessageReceived= ruleMessageReceived EOF
            {
             newCompositeNode(grammarAccess.getMessageReceivedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageReceived=ruleMessageReceived();

            state._fsp--;

             current =iv_ruleMessageReceived; 
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
    // $ANTLR end "entryRuleMessageReceived"


    // $ANTLR start "ruleMessageReceived"
    // InternalKlangParser.g:377:1: ruleMessageReceived returns [EObject current=null] : ( () otherlv_1= When otherlv_2= LeftSquareBracket ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= RightSquareBracket otherlv_5= Received this_BEGIN_6= RULE_BEGIN ( (lv_statements_7_0= ruleStatement ) )* this_END_8= RULE_END ) ;
    public final EObject ruleMessageReceived() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token this_BEGIN_6=null;
        Token this_END_8=null;
        EObject lv_statements_7_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:383:2: ( ( () otherlv_1= When otherlv_2= LeftSquareBracket ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= RightSquareBracket otherlv_5= Received this_BEGIN_6= RULE_BEGIN ( (lv_statements_7_0= ruleStatement ) )* this_END_8= RULE_END ) )
            // InternalKlangParser.g:384:2: ( () otherlv_1= When otherlv_2= LeftSquareBracket ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= RightSquareBracket otherlv_5= Received this_BEGIN_6= RULE_BEGIN ( (lv_statements_7_0= ruleStatement ) )* this_END_8= RULE_END )
            {
            // InternalKlangParser.g:384:2: ( () otherlv_1= When otherlv_2= LeftSquareBracket ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= RightSquareBracket otherlv_5= Received this_BEGIN_6= RULE_BEGIN ( (lv_statements_7_0= ruleStatement ) )* this_END_8= RULE_END )
            // InternalKlangParser.g:385:3: () otherlv_1= When otherlv_2= LeftSquareBracket ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= RightSquareBracket otherlv_5= Received this_BEGIN_6= RULE_BEGIN ( (lv_statements_7_0= ruleStatement ) )* this_END_8= RULE_END
            {
            // InternalKlangParser.g:385:3: ()
            // InternalKlangParser.g:386:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMessageReceivedAccess().getMessageReceivedAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,When,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageReceivedAccess().getWhenKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getMessageReceivedAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalKlangParser.g:400:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalKlangParser.g:401:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalKlangParser.g:401:4: (lv_name_3_0= RULE_STRING )
            // InternalKlangParser.g:402:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_name_3_0, grammarAccess.getMessageReceivedAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageReceivedRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getMessageReceivedAccess().getRightSquareBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,Received,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getMessageReceivedAccess().getReceivedKeyword_5());
            		
            this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_13); 

            			newLeafNode(this_BEGIN_6, grammarAccess.getMessageReceivedAccess().getBEGINTerminalRuleCall_6());
            		
            // InternalKlangParser.g:430:3: ( (lv_statements_7_0= ruleStatement ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==SendMessage||LA9_0==Forever||(LA9_0>=Sleep && LA9_0<=While)||LA9_0==If||LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalKlangParser.g:431:4: (lv_statements_7_0= ruleStatement )
            	    {
            	    // InternalKlangParser.g:431:4: (lv_statements_7_0= ruleStatement )
            	    // InternalKlangParser.g:432:5: lv_statements_7_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getMessageReceivedAccess().getStatementsStatementParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_statements_7_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMessageReceivedRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_7_0,
            	    						"com.kaurel.klang.xtext.Klang.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_8, grammarAccess.getMessageReceivedAccess().getENDTerminalRuleCall_8());
            		

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
    // $ANTLR end "ruleMessageReceived"


    // $ANTLR start "entryRuleStatement"
    // InternalKlangParser.g:457:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalKlangParser.g:457:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalKlangParser.g:458:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalKlangParser.g:464:1: ruleStatement returns [EObject current=null] : (this_WhileLoop_0= ruleWhileLoop | this_If_1= ruleIf | this_VariableAssignment_2= ruleVariableAssignment | this_ForeverLoop_3= ruleForeverLoop | this_FunctionCall_4= ruleFunctionCall | this_Sleep_5= ruleSleep | this_SendMessage_6= ruleSendMessage ) ;
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
            // InternalKlangParser.g:470:2: ( (this_WhileLoop_0= ruleWhileLoop | this_If_1= ruleIf | this_VariableAssignment_2= ruleVariableAssignment | this_ForeverLoop_3= ruleForeverLoop | this_FunctionCall_4= ruleFunctionCall | this_Sleep_5= ruleSleep | this_SendMessage_6= ruleSendMessage ) )
            // InternalKlangParser.g:471:2: (this_WhileLoop_0= ruleWhileLoop | this_If_1= ruleIf | this_VariableAssignment_2= ruleVariableAssignment | this_ForeverLoop_3= ruleForeverLoop | this_FunctionCall_4= ruleFunctionCall | this_Sleep_5= ruleSleep | this_SendMessage_6= ruleSendMessage )
            {
            // InternalKlangParser.g:471:2: (this_WhileLoop_0= ruleWhileLoop | this_If_1= ruleIf | this_VariableAssignment_2= ruleVariableAssignment | this_ForeverLoop_3= ruleForeverLoop | this_FunctionCall_4= ruleFunctionCall | this_Sleep_5= ruleSleep | this_SendMessage_6= ruleSendMessage )
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
                    // InternalKlangParser.g:472:3: this_WhileLoop_0= ruleWhileLoop
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
                    // InternalKlangParser.g:481:3: this_If_1= ruleIf
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
                    // InternalKlangParser.g:490:3: this_VariableAssignment_2= ruleVariableAssignment
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
                    // InternalKlangParser.g:499:3: this_ForeverLoop_3= ruleForeverLoop
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
                    // InternalKlangParser.g:508:3: this_FunctionCall_4= ruleFunctionCall
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
                    // InternalKlangParser.g:517:3: this_Sleep_5= ruleSleep
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
                    // InternalKlangParser.g:526:3: this_SendMessage_6= ruleSendMessage
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
    // InternalKlangParser.g:538:1: entryRuleSendMessage returns [EObject current=null] : iv_ruleSendMessage= ruleSendMessage EOF ;
    public final EObject entryRuleSendMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendMessage = null;


        try {
            // InternalKlangParser.g:538:52: (iv_ruleSendMessage= ruleSendMessage EOF )
            // InternalKlangParser.g:539:2: iv_ruleSendMessage= ruleSendMessage EOF
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
    // InternalKlangParser.g:545:1: ruleSendMessage returns [EObject current=null] : ( () otherlv_1= SendMessage otherlv_2= LeftParenthesis ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= RightParenthesis ) ;
    public final EObject ruleSendMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalKlangParser.g:551:2: ( ( () otherlv_1= SendMessage otherlv_2= LeftParenthesis ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= RightParenthesis ) )
            // InternalKlangParser.g:552:2: ( () otherlv_1= SendMessage otherlv_2= LeftParenthesis ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= RightParenthesis )
            {
            // InternalKlangParser.g:552:2: ( () otherlv_1= SendMessage otherlv_2= LeftParenthesis ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= RightParenthesis )
            // InternalKlangParser.g:553:3: () otherlv_1= SendMessage otherlv_2= LeftParenthesis ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= RightParenthesis
            {
            // InternalKlangParser.g:553:3: ()
            // InternalKlangParser.g:554:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSendMessageAccess().getSendMessageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,SendMessage,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getSendMessageAccess().getSendMessageKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getSendMessageAccess().getLeftParenthesisKeyword_2());
            		
            // InternalKlangParser.g:568:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalKlangParser.g:569:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalKlangParser.g:569:4: (lv_name_3_0= RULE_STRING )
            // InternalKlangParser.g:570:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

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


    // $ANTLR start "entryRuleGameStart"
    // InternalKlangParser.g:594:1: entryRuleGameStart returns [EObject current=null] : iv_ruleGameStart= ruleGameStart EOF ;
    public final EObject entryRuleGameStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGameStart = null;


        try {
            // InternalKlangParser.g:594:50: (iv_ruleGameStart= ruleGameStart EOF )
            // InternalKlangParser.g:595:2: iv_ruleGameStart= ruleGameStart EOF
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
    // InternalKlangParser.g:601:1: ruleGameStart returns [EObject current=null] : ( () otherlv_1= When otherlv_2= Game otherlv_3= Starts this_BEGIN_4= RULE_BEGIN ( (lv_statements_5_0= ruleStatement ) )* this_END_6= RULE_END ) ;
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
            // InternalKlangParser.g:607:2: ( ( () otherlv_1= When otherlv_2= Game otherlv_3= Starts this_BEGIN_4= RULE_BEGIN ( (lv_statements_5_0= ruleStatement ) )* this_END_6= RULE_END ) )
            // InternalKlangParser.g:608:2: ( () otherlv_1= When otherlv_2= Game otherlv_3= Starts this_BEGIN_4= RULE_BEGIN ( (lv_statements_5_0= ruleStatement ) )* this_END_6= RULE_END )
            {
            // InternalKlangParser.g:608:2: ( () otherlv_1= When otherlv_2= Game otherlv_3= Starts this_BEGIN_4= RULE_BEGIN ( (lv_statements_5_0= ruleStatement ) )* this_END_6= RULE_END )
            // InternalKlangParser.g:609:3: () otherlv_1= When otherlv_2= Game otherlv_3= Starts this_BEGIN_4= RULE_BEGIN ( (lv_statements_5_0= ruleStatement ) )* this_END_6= RULE_END
            {
            // InternalKlangParser.g:609:3: ()
            // InternalKlangParser.g:610:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGameStartAccess().getGameStartAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,When,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getGameStartAccess().getWhenKeyword_1());
            		
            otherlv_2=(Token)match(input,Game,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getGameStartAccess().getGameKeyword_2());
            		
            otherlv_3=(Token)match(input,Starts,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getGameStartAccess().getStartsKeyword_3());
            		
            this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_13); 

            			newLeafNode(this_BEGIN_4, grammarAccess.getGameStartAccess().getBEGINTerminalRuleCall_4());
            		
            // InternalKlangParser.g:632:3: ( (lv_statements_5_0= ruleStatement ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==SendMessage||LA11_0==Forever||(LA11_0>=Sleep && LA11_0<=While)||LA11_0==If||LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalKlangParser.g:633:4: (lv_statements_5_0= ruleStatement )
            	    {
            	    // InternalKlangParser.g:633:4: (lv_statements_5_0= ruleStatement )
            	    // InternalKlangParser.g:634:5: lv_statements_5_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getGameStartAccess().getStatementsStatementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_13);
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
            	    break loop11;
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
    // InternalKlangParser.g:659:1: entryRuleSpriteClicked returns [EObject current=null] : iv_ruleSpriteClicked= ruleSpriteClicked EOF ;
    public final EObject entryRuleSpriteClicked() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpriteClicked = null;


        try {
            // InternalKlangParser.g:659:54: (iv_ruleSpriteClicked= ruleSpriteClicked EOF )
            // InternalKlangParser.g:660:2: iv_ruleSpriteClicked= ruleSpriteClicked EOF
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
    // InternalKlangParser.g:666:1: ruleSpriteClicked returns [EObject current=null] : ( () otherlv_1= When otherlv_2= Clicked this_BEGIN_3= RULE_BEGIN ( (lv_statements_4_0= ruleStatement ) )* this_END_5= RULE_END ) ;
    public final EObject ruleSpriteClicked() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        EObject lv_statements_4_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:672:2: ( ( () otherlv_1= When otherlv_2= Clicked this_BEGIN_3= RULE_BEGIN ( (lv_statements_4_0= ruleStatement ) )* this_END_5= RULE_END ) )
            // InternalKlangParser.g:673:2: ( () otherlv_1= When otherlv_2= Clicked this_BEGIN_3= RULE_BEGIN ( (lv_statements_4_0= ruleStatement ) )* this_END_5= RULE_END )
            {
            // InternalKlangParser.g:673:2: ( () otherlv_1= When otherlv_2= Clicked this_BEGIN_3= RULE_BEGIN ( (lv_statements_4_0= ruleStatement ) )* this_END_5= RULE_END )
            // InternalKlangParser.g:674:3: () otherlv_1= When otherlv_2= Clicked this_BEGIN_3= RULE_BEGIN ( (lv_statements_4_0= ruleStatement ) )* this_END_5= RULE_END
            {
            // InternalKlangParser.g:674:3: ()
            // InternalKlangParser.g:675:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSpriteClickedAccess().getSpriteClickedAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,When,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getSpriteClickedAccess().getWhenKeyword_1());
            		
            otherlv_2=(Token)match(input,Clicked,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getSpriteClickedAccess().getClickedKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_13); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getSpriteClickedAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalKlangParser.g:693:3: ( (lv_statements_4_0= ruleStatement ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==SendMessage||LA12_0==Forever||(LA12_0>=Sleep && LA12_0<=While)||LA12_0==If||LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalKlangParser.g:694:4: (lv_statements_4_0= ruleStatement )
            	    {
            	    // InternalKlangParser.g:694:4: (lv_statements_4_0= ruleStatement )
            	    // InternalKlangParser.g:695:5: lv_statements_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getSpriteClickedAccess().getStatementsStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_13);
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
            	    break loop12;
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
    // InternalKlangParser.g:720:1: entryRuleKeyPressed returns [EObject current=null] : iv_ruleKeyPressed= ruleKeyPressed EOF ;
    public final EObject entryRuleKeyPressed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyPressed = null;


        try {
            // InternalKlangParser.g:720:51: (iv_ruleKeyPressed= ruleKeyPressed EOF )
            // InternalKlangParser.g:721:2: iv_ruleKeyPressed= ruleKeyPressed EOF
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
    // InternalKlangParser.g:727:1: ruleKeyPressed returns [EObject current=null] : ( () otherlv_1= When otherlv_2= LeftSquareBracket ( (lv_key_3_0= ruleKeys ) ) otherlv_4= RightSquareBracket otherlv_5= Pressed this_BEGIN_6= RULE_BEGIN ( (lv_statements_7_0= ruleStatement ) )* this_END_8= RULE_END ) ;
    public final EObject ruleKeyPressed() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token this_BEGIN_6=null;
        Token this_END_8=null;
        Enumerator lv_key_3_0 = null;

        EObject lv_statements_7_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:733:2: ( ( () otherlv_1= When otherlv_2= LeftSquareBracket ( (lv_key_3_0= ruleKeys ) ) otherlv_4= RightSquareBracket otherlv_5= Pressed this_BEGIN_6= RULE_BEGIN ( (lv_statements_7_0= ruleStatement ) )* this_END_8= RULE_END ) )
            // InternalKlangParser.g:734:2: ( () otherlv_1= When otherlv_2= LeftSquareBracket ( (lv_key_3_0= ruleKeys ) ) otherlv_4= RightSquareBracket otherlv_5= Pressed this_BEGIN_6= RULE_BEGIN ( (lv_statements_7_0= ruleStatement ) )* this_END_8= RULE_END )
            {
            // InternalKlangParser.g:734:2: ( () otherlv_1= When otherlv_2= LeftSquareBracket ( (lv_key_3_0= ruleKeys ) ) otherlv_4= RightSquareBracket otherlv_5= Pressed this_BEGIN_6= RULE_BEGIN ( (lv_statements_7_0= ruleStatement ) )* this_END_8= RULE_END )
            // InternalKlangParser.g:735:3: () otherlv_1= When otherlv_2= LeftSquareBracket ( (lv_key_3_0= ruleKeys ) ) otherlv_4= RightSquareBracket otherlv_5= Pressed this_BEGIN_6= RULE_BEGIN ( (lv_statements_7_0= ruleStatement ) )* this_END_8= RULE_END
            {
            // InternalKlangParser.g:735:3: ()
            // InternalKlangParser.g:736:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKeyPressedAccess().getKeyPressedAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,When,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getKeyPressedAccess().getWhenKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getKeyPressedAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalKlangParser.g:750:3: ( (lv_key_3_0= ruleKeys ) )
            // InternalKlangParser.g:751:4: (lv_key_3_0= ruleKeys )
            {
            // InternalKlangParser.g:751:4: (lv_key_3_0= ruleKeys )
            // InternalKlangParser.g:752:5: lv_key_3_0= ruleKeys
            {

            					newCompositeNode(grammarAccess.getKeyPressedAccess().getKeyKeysEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_key_3_0=ruleKeys();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeyPressedRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_3_0,
            						"com.kaurel.klang.xtext.Klang.Keys");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getKeyPressedAccess().getRightSquareBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,Pressed,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getKeyPressedAccess().getPressedKeyword_5());
            		
            this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_13); 

            			newLeafNode(this_BEGIN_6, grammarAccess.getKeyPressedAccess().getBEGINTerminalRuleCall_6());
            		
            // InternalKlangParser.g:781:3: ( (lv_statements_7_0= ruleStatement ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==SendMessage||LA13_0==Forever||(LA13_0>=Sleep && LA13_0<=While)||LA13_0==If||LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalKlangParser.g:782:4: (lv_statements_7_0= ruleStatement )
            	    {
            	    // InternalKlangParser.g:782:4: (lv_statements_7_0= ruleStatement )
            	    // InternalKlangParser.g:783:5: lv_statements_7_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getKeyPressedAccess().getStatementsStatementParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_statements_7_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getKeyPressedRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_7_0,
            	    						"com.kaurel.klang.xtext.Klang.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_8, grammarAccess.getKeyPressedAccess().getENDTerminalRuleCall_8());
            		

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
    // InternalKlangParser.g:808:1: entryRuleCollidesWith returns [EObject current=null] : iv_ruleCollidesWith= ruleCollidesWith EOF ;
    public final EObject entryRuleCollidesWith() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollidesWith = null;


        try {
            // InternalKlangParser.g:808:53: (iv_ruleCollidesWith= ruleCollidesWith EOF )
            // InternalKlangParser.g:809:2: iv_ruleCollidesWith= ruleCollidesWith EOF
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
    // InternalKlangParser.g:815:1: ruleCollidesWith returns [EObject current=null] : ( () otherlv_1= When otherlv_2= Collides otherlv_3= With ( (otherlv_4= RULE_ID ) ) this_BEGIN_5= RULE_BEGIN ( (lv_statements_6_0= ruleStatement ) )* this_END_7= RULE_END ) ;
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
            // InternalKlangParser.g:821:2: ( ( () otherlv_1= When otherlv_2= Collides otherlv_3= With ( (otherlv_4= RULE_ID ) ) this_BEGIN_5= RULE_BEGIN ( (lv_statements_6_0= ruleStatement ) )* this_END_7= RULE_END ) )
            // InternalKlangParser.g:822:2: ( () otherlv_1= When otherlv_2= Collides otherlv_3= With ( (otherlv_4= RULE_ID ) ) this_BEGIN_5= RULE_BEGIN ( (lv_statements_6_0= ruleStatement ) )* this_END_7= RULE_END )
            {
            // InternalKlangParser.g:822:2: ( () otherlv_1= When otherlv_2= Collides otherlv_3= With ( (otherlv_4= RULE_ID ) ) this_BEGIN_5= RULE_BEGIN ( (lv_statements_6_0= ruleStatement ) )* this_END_7= RULE_END )
            // InternalKlangParser.g:823:3: () otherlv_1= When otherlv_2= Collides otherlv_3= With ( (otherlv_4= RULE_ID ) ) this_BEGIN_5= RULE_BEGIN ( (lv_statements_6_0= ruleStatement ) )* this_END_7= RULE_END
            {
            // InternalKlangParser.g:823:3: ()
            // InternalKlangParser.g:824:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCollidesWithAccess().getCollidesWithAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,When,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getCollidesWithAccess().getWhenKeyword_1());
            		
            otherlv_2=(Token)match(input,Collides,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getCollidesWithAccess().getCollidesKeyword_2());
            		
            otherlv_3=(Token)match(input,With,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getCollidesWithAccess().getWithKeyword_3());
            		
            // InternalKlangParser.g:842:3: ( (otherlv_4= RULE_ID ) )
            // InternalKlangParser.g:843:4: (otherlv_4= RULE_ID )
            {
            // InternalKlangParser.g:843:4: (otherlv_4= RULE_ID )
            // InternalKlangParser.g:844:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollidesWithRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_4, grammarAccess.getCollidesWithAccess().getTargetSpriteActorCrossReference_4_0());
            				

            }


            }

            this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_13); 

            			newLeafNode(this_BEGIN_5, grammarAccess.getCollidesWithAccess().getBEGINTerminalRuleCall_5());
            		
            // InternalKlangParser.g:859:3: ( (lv_statements_6_0= ruleStatement ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==SendMessage||LA14_0==Forever||(LA14_0>=Sleep && LA14_0<=While)||LA14_0==If||LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalKlangParser.g:860:4: (lv_statements_6_0= ruleStatement )
            	    {
            	    // InternalKlangParser.g:860:4: (lv_statements_6_0= ruleStatement )
            	    // InternalKlangParser.g:861:5: lv_statements_6_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getCollidesWithAccess().getStatementsStatementParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_13);
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
            	    break loop14;
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
    // InternalKlangParser.g:886:1: entryRuleWhileLoop returns [EObject current=null] : iv_ruleWhileLoop= ruleWhileLoop EOF ;
    public final EObject entryRuleWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileLoop = null;


        try {
            // InternalKlangParser.g:886:50: (iv_ruleWhileLoop= ruleWhileLoop EOF )
            // InternalKlangParser.g:887:2: iv_ruleWhileLoop= ruleWhileLoop EOF
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
    // InternalKlangParser.g:893:1: ruleWhileLoop returns [EObject current=null] : ( () otherlv_1= While ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_statements_4_0= ruleStatement ) )* this_END_5= RULE_END ) ;
    public final EObject ruleWhileLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        EObject lv_predicate_2_0 = null;

        EObject lv_statements_4_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:899:2: ( ( () otherlv_1= While ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_statements_4_0= ruleStatement ) )* this_END_5= RULE_END ) )
            // InternalKlangParser.g:900:2: ( () otherlv_1= While ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_statements_4_0= ruleStatement ) )* this_END_5= RULE_END )
            {
            // InternalKlangParser.g:900:2: ( () otherlv_1= While ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_statements_4_0= ruleStatement ) )* this_END_5= RULE_END )
            // InternalKlangParser.g:901:3: () otherlv_1= While ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_statements_4_0= ruleStatement ) )* this_END_5= RULE_END
            {
            // InternalKlangParser.g:901:3: ()
            // InternalKlangParser.g:902:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWhileLoopAccess().getWhileLoopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,While,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getWhileLoopAccess().getWhileKeyword_1());
            		
            // InternalKlangParser.g:912:3: ( (lv_predicate_2_0= ruleExpression ) )
            // InternalKlangParser.g:913:4: (lv_predicate_2_0= ruleExpression )
            {
            // InternalKlangParser.g:913:4: (lv_predicate_2_0= ruleExpression )
            // InternalKlangParser.g:914:5: lv_predicate_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhileLoopAccess().getPredicateExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
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

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_13); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getWhileLoopAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalKlangParser.g:935:3: ( (lv_statements_4_0= ruleStatement ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==SendMessage||LA15_0==Forever||(LA15_0>=Sleep && LA15_0<=While)||LA15_0==If||LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalKlangParser.g:936:4: (lv_statements_4_0= ruleStatement )
            	    {
            	    // InternalKlangParser.g:936:4: (lv_statements_4_0= ruleStatement )
            	    // InternalKlangParser.g:937:5: lv_statements_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getWhileLoopAccess().getStatementsStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_13);
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
            	    break loop15;
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
    // InternalKlangParser.g:962:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalKlangParser.g:962:43: (iv_ruleIf= ruleIf EOF )
            // InternalKlangParser.g:963:2: iv_ruleIf= ruleIf EOF
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
    // InternalKlangParser.g:969:1: ruleIf returns [EObject current=null] : ( () otherlv_1= If ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_ifBlock_4_0= ruleStatement ) )* this_END_5= RULE_END (otherlv_6= Else this_BEGIN_7= RULE_BEGIN ( (lv_elseBlock_8_0= ruleStatement ) )* this_END_9= RULE_END )? ) ;
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
            // InternalKlangParser.g:975:2: ( ( () otherlv_1= If ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_ifBlock_4_0= ruleStatement ) )* this_END_5= RULE_END (otherlv_6= Else this_BEGIN_7= RULE_BEGIN ( (lv_elseBlock_8_0= ruleStatement ) )* this_END_9= RULE_END )? ) )
            // InternalKlangParser.g:976:2: ( () otherlv_1= If ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_ifBlock_4_0= ruleStatement ) )* this_END_5= RULE_END (otherlv_6= Else this_BEGIN_7= RULE_BEGIN ( (lv_elseBlock_8_0= ruleStatement ) )* this_END_9= RULE_END )? )
            {
            // InternalKlangParser.g:976:2: ( () otherlv_1= If ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_ifBlock_4_0= ruleStatement ) )* this_END_5= RULE_END (otherlv_6= Else this_BEGIN_7= RULE_BEGIN ( (lv_elseBlock_8_0= ruleStatement ) )* this_END_9= RULE_END )? )
            // InternalKlangParser.g:977:3: () otherlv_1= If ( (lv_predicate_2_0= ruleExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_ifBlock_4_0= ruleStatement ) )* this_END_5= RULE_END (otherlv_6= Else this_BEGIN_7= RULE_BEGIN ( (lv_elseBlock_8_0= ruleStatement ) )* this_END_9= RULE_END )?
            {
            // InternalKlangParser.g:977:3: ()
            // InternalKlangParser.g:978:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIfAccess().getIfAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,If,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getIfAccess().getIfKeyword_1());
            		
            // InternalKlangParser.g:988:3: ( (lv_predicate_2_0= ruleExpression ) )
            // InternalKlangParser.g:989:4: (lv_predicate_2_0= ruleExpression )
            {
            // InternalKlangParser.g:989:4: (lv_predicate_2_0= ruleExpression )
            // InternalKlangParser.g:990:5: lv_predicate_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfAccess().getPredicateExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
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

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_13); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getIfAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalKlangParser.g:1011:3: ( (lv_ifBlock_4_0= ruleStatement ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==SendMessage||LA16_0==Forever||(LA16_0>=Sleep && LA16_0<=While)||LA16_0==If||LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalKlangParser.g:1012:4: (lv_ifBlock_4_0= ruleStatement )
            	    {
            	    // InternalKlangParser.g:1012:4: (lv_ifBlock_4_0= ruleStatement )
            	    // InternalKlangParser.g:1013:5: lv_ifBlock_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getIfAccess().getIfBlockStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_13);
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
            	    break loop16;
                }
            } while (true);

            this_END_5=(Token)match(input,RULE_END,FOLLOW_24); 

            			newLeafNode(this_END_5, grammarAccess.getIfAccess().getENDTerminalRuleCall_5());
            		
            // InternalKlangParser.g:1034:3: (otherlv_6= Else this_BEGIN_7= RULE_BEGIN ( (lv_elseBlock_8_0= ruleStatement ) )* this_END_9= RULE_END )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Else) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalKlangParser.g:1035:4: otherlv_6= Else this_BEGIN_7= RULE_BEGIN ( (lv_elseBlock_8_0= ruleStatement ) )* this_END_9= RULE_END
                    {
                    otherlv_6=(Token)match(input,Else,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getIfAccess().getElseKeyword_6_0());
                    			
                    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_13); 

                    				newLeafNode(this_BEGIN_7, grammarAccess.getIfAccess().getBEGINTerminalRuleCall_6_1());
                    			
                    // InternalKlangParser.g:1043:4: ( (lv_elseBlock_8_0= ruleStatement ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==SendMessage||LA17_0==Forever||(LA17_0>=Sleep && LA17_0<=While)||LA17_0==If||LA17_0==RULE_ID) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalKlangParser.g:1044:5: (lv_elseBlock_8_0= ruleStatement )
                    	    {
                    	    // InternalKlangParser.g:1044:5: (lv_elseBlock_8_0= ruleStatement )
                    	    // InternalKlangParser.g:1045:6: lv_elseBlock_8_0= ruleStatement
                    	    {

                    	    						newCompositeNode(grammarAccess.getIfAccess().getElseBlockStatementParserRuleCall_6_2_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
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
                    	    break loop17;
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
    // InternalKlangParser.g:1071:1: entryRuleForeverLoop returns [EObject current=null] : iv_ruleForeverLoop= ruleForeverLoop EOF ;
    public final EObject entryRuleForeverLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeverLoop = null;


        try {
            // InternalKlangParser.g:1071:52: (iv_ruleForeverLoop= ruleForeverLoop EOF )
            // InternalKlangParser.g:1072:2: iv_ruleForeverLoop= ruleForeverLoop EOF
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
    // InternalKlangParser.g:1078:1: ruleForeverLoop returns [EObject current=null] : ( () otherlv_1= Forever this_BEGIN_2= RULE_BEGIN ( (lv_statements_3_0= ruleStatement ) )* this_END_4= RULE_END ) ;
    public final EObject ruleForeverLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1084:2: ( ( () otherlv_1= Forever this_BEGIN_2= RULE_BEGIN ( (lv_statements_3_0= ruleStatement ) )* this_END_4= RULE_END ) )
            // InternalKlangParser.g:1085:2: ( () otherlv_1= Forever this_BEGIN_2= RULE_BEGIN ( (lv_statements_3_0= ruleStatement ) )* this_END_4= RULE_END )
            {
            // InternalKlangParser.g:1085:2: ( () otherlv_1= Forever this_BEGIN_2= RULE_BEGIN ( (lv_statements_3_0= ruleStatement ) )* this_END_4= RULE_END )
            // InternalKlangParser.g:1086:3: () otherlv_1= Forever this_BEGIN_2= RULE_BEGIN ( (lv_statements_3_0= ruleStatement ) )* this_END_4= RULE_END
            {
            // InternalKlangParser.g:1086:3: ()
            // InternalKlangParser.g:1087:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getForeverLoopAccess().getForeverLoopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Forever,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getForeverLoopAccess().getForeverKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_13); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getForeverLoopAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalKlangParser.g:1101:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==SendMessage||LA19_0==Forever||(LA19_0>=Sleep && LA19_0<=While)||LA19_0==If||LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalKlangParser.g:1102:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalKlangParser.g:1102:4: (lv_statements_3_0= ruleStatement )
            	    // InternalKlangParser.g:1103:5: lv_statements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getForeverLoopAccess().getStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
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
            	    break loop19;
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
    // InternalKlangParser.g:1128:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalKlangParser.g:1128:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalKlangParser.g:1129:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
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
    // InternalKlangParser.g:1135:1: ruleVariableDeclaration returns [EObject current=null] : (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_expression_3_0= ruleExpression ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1141:2: ( (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_expression_3_0= ruleExpression ) ) ) )
            // InternalKlangParser.g:1142:2: (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_expression_3_0= ruleExpression ) ) )
            {
            // InternalKlangParser.g:1142:2: (otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_expression_3_0= ruleExpression ) ) )
            // InternalKlangParser.g:1143:3: otherlv_0= Var ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_expression_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,Var,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getVarKeyword_0());
            		
            // InternalKlangParser.g:1147:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalKlangParser.g:1148:4: (lv_name_1_0= RULE_ID )
            {
            // InternalKlangParser.g:1148:4: (lv_name_1_0= RULE_ID )
            // InternalKlangParser.g:1149:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

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

            otherlv_2=(Token)match(input,EqualsSign,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2());
            		
            // InternalKlangParser.g:1169:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalKlangParser.g:1170:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalKlangParser.g:1170:4: (lv_expression_3_0= ruleExpression )
            // InternalKlangParser.g:1171:5: lv_expression_3_0= ruleExpression
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
    // InternalKlangParser.g:1192:1: entryRuleVariableAssignment returns [EObject current=null] : iv_ruleVariableAssignment= ruleVariableAssignment EOF ;
    public final EObject entryRuleVariableAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssignment = null;


        try {
            // InternalKlangParser.g:1192:59: (iv_ruleVariableAssignment= ruleVariableAssignment EOF )
            // InternalKlangParser.g:1193:2: iv_ruleVariableAssignment= ruleVariableAssignment EOF
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
    // InternalKlangParser.g:1199:1: ruleVariableAssignment returns [EObject current=null] : ( ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleVariableAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_variableName_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1205:2: ( ( ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalKlangParser.g:1206:2: ( ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalKlangParser.g:1206:2: ( ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalKlangParser.g:1207:3: ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalKlangParser.g:1207:3: ( (lv_variableName_0_0= RULE_ID ) )
            // InternalKlangParser.g:1208:4: (lv_variableName_0_0= RULE_ID )
            {
            // InternalKlangParser.g:1208:4: (lv_variableName_0_0= RULE_ID )
            // InternalKlangParser.g:1209:5: lv_variableName_0_0= RULE_ID
            {
            lv_variableName_0_0=(Token)match(input,RULE_ID,FOLLOW_25); 

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

            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_1());
            		
            // InternalKlangParser.g:1229:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalKlangParser.g:1230:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalKlangParser.g:1230:4: (lv_expression_2_0= ruleExpression )
            // InternalKlangParser.g:1231:5: lv_expression_2_0= ruleExpression
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
    // InternalKlangParser.g:1252:1: entryRuleSleep returns [EObject current=null] : iv_ruleSleep= ruleSleep EOF ;
    public final EObject entryRuleSleep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSleep = null;


        try {
            // InternalKlangParser.g:1252:46: (iv_ruleSleep= ruleSleep EOF )
            // InternalKlangParser.g:1253:2: iv_ruleSleep= ruleSleep EOF
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
    // InternalKlangParser.g:1259:1: ruleSleep returns [EObject current=null] : ( () otherlv_1= Sleep otherlv_2= LeftParenthesis ( (lv_duration_3_0= ruleExpression ) ) otherlv_4= RightParenthesis ) ;
    public final EObject ruleSleep() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duration_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1265:2: ( ( () otherlv_1= Sleep otherlv_2= LeftParenthesis ( (lv_duration_3_0= ruleExpression ) ) otherlv_4= RightParenthesis ) )
            // InternalKlangParser.g:1266:2: ( () otherlv_1= Sleep otherlv_2= LeftParenthesis ( (lv_duration_3_0= ruleExpression ) ) otherlv_4= RightParenthesis )
            {
            // InternalKlangParser.g:1266:2: ( () otherlv_1= Sleep otherlv_2= LeftParenthesis ( (lv_duration_3_0= ruleExpression ) ) otherlv_4= RightParenthesis )
            // InternalKlangParser.g:1267:3: () otherlv_1= Sleep otherlv_2= LeftParenthesis ( (lv_duration_3_0= ruleExpression ) ) otherlv_4= RightParenthesis
            {
            // InternalKlangParser.g:1267:3: ()
            // InternalKlangParser.g:1268:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSleepAccess().getSleepAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Sleep,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getSleepAccess().getSleepKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getSleepAccess().getLeftParenthesisKeyword_2());
            		
            // InternalKlangParser.g:1282:3: ( (lv_duration_3_0= ruleExpression ) )
            // InternalKlangParser.g:1283:4: (lv_duration_3_0= ruleExpression )
            {
            // InternalKlangParser.g:1283:4: (lv_duration_3_0= ruleExpression )
            // InternalKlangParser.g:1284:5: lv_duration_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSleepAccess().getDurationExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
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
    // InternalKlangParser.g:1309:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalKlangParser.g:1309:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalKlangParser.g:1310:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalKlangParser.g:1316:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1322:2: (this_Or_0= ruleOr )
            // InternalKlangParser.g:1323:2: this_Or_0= ruleOr
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
    // InternalKlangParser.g:1334:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalKlangParser.g:1334:43: (iv_ruleOr= ruleOr EOF )
            // InternalKlangParser.g:1335:2: iv_ruleOr= ruleOr EOF
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
    // InternalKlangParser.g:1341:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= Or ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1347:2: ( (this_And_0= ruleAnd ( () otherlv_2= Or ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalKlangParser.g:1348:2: (this_And_0= ruleAnd ( () otherlv_2= Or ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalKlangParser.g:1348:2: (this_And_0= ruleAnd ( () otherlv_2= Or ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalKlangParser.g:1349:3: this_And_0= ruleAnd ( () otherlv_2= Or ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKlangParser.g:1357:3: ( () otherlv_2= Or ( (lv_right_3_0= ruleAnd ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==Or) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalKlangParser.g:1358:4: () otherlv_2= Or ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalKlangParser.g:1358:4: ()
            	    // InternalKlangParser.g:1359:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,Or,FOLLOW_23); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getOrKeyword_1_1());
            	    			
            	    // InternalKlangParser.g:1369:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalKlangParser.g:1370:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalKlangParser.g:1370:5: (lv_right_3_0= ruleAnd )
            	    // InternalKlangParser.g:1371:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_26);
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalKlangParser.g:1393:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalKlangParser.g:1393:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalKlangParser.g:1394:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalKlangParser.g:1400:1: ruleAnd returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () otherlv_2= And ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1406:2: ( (this_Comparison_0= ruleComparison ( () otherlv_2= And ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalKlangParser.g:1407:2: (this_Comparison_0= ruleComparison ( () otherlv_2= And ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalKlangParser.g:1407:2: (this_Comparison_0= ruleComparison ( () otherlv_2= And ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalKlangParser.g:1408:3: this_Comparison_0= ruleComparison ( () otherlv_2= And ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKlangParser.g:1416:3: ( () otherlv_2= And ( (lv_right_3_0= ruleComparison ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==And) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalKlangParser.g:1417:4: () otherlv_2= And ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalKlangParser.g:1417:4: ()
            	    // InternalKlangParser.g:1418:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,And,FOLLOW_23); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAndKeyword_1_1());
            	    			
            	    // InternalKlangParser.g:1428:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalKlangParser.g:1429:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalKlangParser.g:1429:5: (lv_right_3_0= ruleComparison )
            	    // InternalKlangParser.g:1430:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_27);
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRulePlus"
    // InternalKlangParser.g:1452:1: entryRulePlus returns [EObject current=null] : iv_rulePlus= rulePlus EOF ;
    public final EObject entryRulePlus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlus = null;


        try {
            // InternalKlangParser.g:1452:45: (iv_rulePlus= rulePlus EOF )
            // InternalKlangParser.g:1453:2: iv_rulePlus= rulePlus EOF
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
    // InternalKlangParser.g:1459:1: rulePlus returns [EObject current=null] : (this_Minus_0= ruleMinus ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMinus ) ) )* ) ;
    public final EObject rulePlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Minus_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1465:2: ( (this_Minus_0= ruleMinus ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMinus ) ) )* ) )
            // InternalKlangParser.g:1466:2: (this_Minus_0= ruleMinus ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMinus ) ) )* )
            {
            // InternalKlangParser.g:1466:2: (this_Minus_0= ruleMinus ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMinus ) ) )* )
            // InternalKlangParser.g:1467:3: this_Minus_0= ruleMinus ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMinus ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusAccess().getMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_Minus_0=ruleMinus();

            state._fsp--;


            			current = this_Minus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKlangParser.g:1475:3: ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMinus ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==PlusSign) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalKlangParser.g:1476:4: () otherlv_2= PlusSign ( (lv_right_3_0= ruleMinus ) )
            	    {
            	    // InternalKlangParser.g:1476:4: ()
            	    // InternalKlangParser.g:1477:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPlusAccess().getPlusLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,PlusSign,FOLLOW_23); 

            	    				newLeafNode(otherlv_2, grammarAccess.getPlusAccess().getPlusSignKeyword_1_1());
            	    			
            	    // InternalKlangParser.g:1487:4: ( (lv_right_3_0= ruleMinus ) )
            	    // InternalKlangParser.g:1488:5: (lv_right_3_0= ruleMinus )
            	    {
            	    // InternalKlangParser.g:1488:5: (lv_right_3_0= ruleMinus )
            	    // InternalKlangParser.g:1489:6: lv_right_3_0= ruleMinus
            	    {

            	    						newCompositeNode(grammarAccess.getPlusAccess().getRightMinusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_28);
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
    // $ANTLR end "rulePlus"


    // $ANTLR start "entryRuleMinus"
    // InternalKlangParser.g:1511:1: entryRuleMinus returns [EObject current=null] : iv_ruleMinus= ruleMinus EOF ;
    public final EObject entryRuleMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinus = null;


        try {
            // InternalKlangParser.g:1511:46: (iv_ruleMinus= ruleMinus EOF )
            // InternalKlangParser.g:1512:2: iv_ruleMinus= ruleMinus EOF
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
    // InternalKlangParser.g:1518:1: ruleMinus returns [EObject current=null] : (this_Multiply_0= ruleMultiply ( () otherlv_2= HyphenMinus ( (lv_right_3_0= ruleMultiply ) ) )* ) ;
    public final EObject ruleMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Multiply_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1524:2: ( (this_Multiply_0= ruleMultiply ( () otherlv_2= HyphenMinus ( (lv_right_3_0= ruleMultiply ) ) )* ) )
            // InternalKlangParser.g:1525:2: (this_Multiply_0= ruleMultiply ( () otherlv_2= HyphenMinus ( (lv_right_3_0= ruleMultiply ) ) )* )
            {
            // InternalKlangParser.g:1525:2: (this_Multiply_0= ruleMultiply ( () otherlv_2= HyphenMinus ( (lv_right_3_0= ruleMultiply ) ) )* )
            // InternalKlangParser.g:1526:3: this_Multiply_0= ruleMultiply ( () otherlv_2= HyphenMinus ( (lv_right_3_0= ruleMultiply ) ) )*
            {

            			newCompositeNode(grammarAccess.getMinusAccess().getMultiplyParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_Multiply_0=ruleMultiply();

            state._fsp--;


            			current = this_Multiply_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKlangParser.g:1534:3: ( () otherlv_2= HyphenMinus ( (lv_right_3_0= ruleMultiply ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==HyphenMinus) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalKlangParser.g:1535:4: () otherlv_2= HyphenMinus ( (lv_right_3_0= ruleMultiply ) )
            	    {
            	    // InternalKlangParser.g:1535:4: ()
            	    // InternalKlangParser.g:1536:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMinusAccess().getMinusLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,HyphenMinus,FOLLOW_23); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMinusAccess().getHyphenMinusKeyword_1_1());
            	    			
            	    // InternalKlangParser.g:1546:4: ( (lv_right_3_0= ruleMultiply ) )
            	    // InternalKlangParser.g:1547:5: (lv_right_3_0= ruleMultiply )
            	    {
            	    // InternalKlangParser.g:1547:5: (lv_right_3_0= ruleMultiply )
            	    // InternalKlangParser.g:1548:6: lv_right_3_0= ruleMultiply
            	    {

            	    						newCompositeNode(grammarAccess.getMinusAccess().getRightMultiplyParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_29);
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
    // $ANTLR end "ruleMinus"


    // $ANTLR start "entryRuleMultiply"
    // InternalKlangParser.g:1570:1: entryRuleMultiply returns [EObject current=null] : iv_ruleMultiply= ruleMultiply EOF ;
    public final EObject entryRuleMultiply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiply = null;


        try {
            // InternalKlangParser.g:1570:49: (iv_ruleMultiply= ruleMultiply EOF )
            // InternalKlangParser.g:1571:2: iv_ruleMultiply= ruleMultiply EOF
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
    // InternalKlangParser.g:1577:1: ruleMultiply returns [EObject current=null] : (this_Divide_0= ruleDivide ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleDivide ) ) )* ) ;
    public final EObject ruleMultiply() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Divide_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1583:2: ( (this_Divide_0= ruleDivide ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleDivide ) ) )* ) )
            // InternalKlangParser.g:1584:2: (this_Divide_0= ruleDivide ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleDivide ) ) )* )
            {
            // InternalKlangParser.g:1584:2: (this_Divide_0= ruleDivide ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleDivide ) ) )* )
            // InternalKlangParser.g:1585:3: this_Divide_0= ruleDivide ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleDivide ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplyAccess().getDivideParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_Divide_0=ruleDivide();

            state._fsp--;


            			current = this_Divide_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKlangParser.g:1593:3: ( () otherlv_2= Asterisk ( (lv_right_3_0= ruleDivide ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==Asterisk) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalKlangParser.g:1594:4: () otherlv_2= Asterisk ( (lv_right_3_0= ruleDivide ) )
            	    {
            	    // InternalKlangParser.g:1594:4: ()
            	    // InternalKlangParser.g:1595:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplyAccess().getMultiplyLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,Asterisk,FOLLOW_23); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMultiplyAccess().getAsteriskKeyword_1_1());
            	    			
            	    // InternalKlangParser.g:1605:4: ( (lv_right_3_0= ruleDivide ) )
            	    // InternalKlangParser.g:1606:5: (lv_right_3_0= ruleDivide )
            	    {
            	    // InternalKlangParser.g:1606:5: (lv_right_3_0= ruleDivide )
            	    // InternalKlangParser.g:1607:6: lv_right_3_0= ruleDivide
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplyAccess().getRightDivideParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_30);
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
    // $ANTLR end "ruleMultiply"


    // $ANTLR start "entryRuleDivide"
    // InternalKlangParser.g:1629:1: entryRuleDivide returns [EObject current=null] : iv_ruleDivide= ruleDivide EOF ;
    public final EObject entryRuleDivide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivide = null;


        try {
            // InternalKlangParser.g:1629:47: (iv_ruleDivide= ruleDivide EOF )
            // InternalKlangParser.g:1630:2: iv_ruleDivide= ruleDivide EOF
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
    // InternalKlangParser.g:1636:1: ruleDivide returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= Solidus ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleDivide() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1642:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= Solidus ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) )
            // InternalKlangParser.g:1643:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= Solidus ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            {
            // InternalKlangParser.g:1643:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= Solidus ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            // InternalKlangParser.g:1644:3: this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= Solidus ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getDivideAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKlangParser.g:1652:3: ( () otherlv_2= Solidus ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==Solidus) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalKlangParser.g:1653:4: () otherlv_2= Solidus ( (lv_right_3_0= rulePrimaryExpression ) )
            	    {
            	    // InternalKlangParser.g:1653:4: ()
            	    // InternalKlangParser.g:1654:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getDivideAccess().getDivideLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,Solidus,FOLLOW_23); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDivideAccess().getSolidusKeyword_1_1());
            	    			
            	    // InternalKlangParser.g:1664:4: ( (lv_right_3_0= rulePrimaryExpression ) )
            	    // InternalKlangParser.g:1665:5: (lv_right_3_0= rulePrimaryExpression )
            	    {
            	    // InternalKlangParser.g:1665:5: (lv_right_3_0= rulePrimaryExpression )
            	    // InternalKlangParser.g:1666:6: lv_right_3_0= rulePrimaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getDivideAccess().getRightPrimaryExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_31);
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
            	    break loop25;
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
    // InternalKlangParser.g:1688:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalKlangParser.g:1688:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalKlangParser.g:1689:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalKlangParser.g:1695:1: ruleComparison returns [EObject current=null] : (this_Plus_0= rulePlus ( ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSignEqualsSign () ) | (otherlv_5= GreaterThanSign () ) ) ( (lv_right_7_0= rulePlus ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_Plus_0 = null;

        EObject lv_right_7_0 = null;



        	enterRule();

        try {
            // InternalKlangParser.g:1701:2: ( (this_Plus_0= rulePlus ( ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSignEqualsSign () ) | (otherlv_5= GreaterThanSign () ) ) ( (lv_right_7_0= rulePlus ) ) )* ) )
            // InternalKlangParser.g:1702:2: (this_Plus_0= rulePlus ( ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSignEqualsSign () ) | (otherlv_5= GreaterThanSign () ) ) ( (lv_right_7_0= rulePlus ) ) )* )
            {
            // InternalKlangParser.g:1702:2: (this_Plus_0= rulePlus ( ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSignEqualsSign () ) | (otherlv_5= GreaterThanSign () ) ) ( (lv_right_7_0= rulePlus ) ) )* )
            // InternalKlangParser.g:1703:3: this_Plus_0= rulePlus ( ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSignEqualsSign () ) | (otherlv_5= GreaterThanSign () ) ) ( (lv_right_7_0= rulePlus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_Plus_0=rulePlus();

            state._fsp--;


            			current = this_Plus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKlangParser.g:1711:3: ( ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSignEqualsSign () ) | (otherlv_5= GreaterThanSign () ) ) ( (lv_right_7_0= rulePlus ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==EqualsSignEqualsSign||LA27_0==LessThanSign||LA27_0==GreaterThanSign) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalKlangParser.g:1712:4: ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSignEqualsSign () ) | (otherlv_5= GreaterThanSign () ) ) ( (lv_right_7_0= rulePlus ) )
            	    {
            	    // InternalKlangParser.g:1712:4: ( (otherlv_1= LessThanSign () ) | (otherlv_3= EqualsSignEqualsSign () ) | (otherlv_5= GreaterThanSign () ) )
            	    int alt26=3;
            	    switch ( input.LA(1) ) {
            	    case LessThanSign:
            	        {
            	        alt26=1;
            	        }
            	        break;
            	    case EqualsSignEqualsSign:
            	        {
            	        alt26=2;
            	        }
            	        break;
            	    case GreaterThanSign:
            	        {
            	        alt26=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt26) {
            	        case 1 :
            	            // InternalKlangParser.g:1713:5: (otherlv_1= LessThanSign () )
            	            {
            	            // InternalKlangParser.g:1713:5: (otherlv_1= LessThanSign () )
            	            // InternalKlangParser.g:1714:6: otherlv_1= LessThanSign ()
            	            {
            	            otherlv_1=(Token)match(input,LessThanSign,FOLLOW_23); 

            	            						newLeafNode(otherlv_1, grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_0_0());
            	            					
            	            // InternalKlangParser.g:1718:6: ()
            	            // InternalKlangParser.g:1719:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getComparisonAccess().getLessThanLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalKlangParser.g:1727:5: (otherlv_3= EqualsSignEqualsSign () )
            	            {
            	            // InternalKlangParser.g:1727:5: (otherlv_3= EqualsSignEqualsSign () )
            	            // InternalKlangParser.g:1728:6: otherlv_3= EqualsSignEqualsSign ()
            	            {
            	            otherlv_3=(Token)match(input,EqualsSignEqualsSign,FOLLOW_23); 

            	            						newLeafNode(otherlv_3, grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_1_0_1_0());
            	            					
            	            // InternalKlangParser.g:1732:6: ()
            	            // InternalKlangParser.g:1733:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getComparisonAccess().getEqualLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalKlangParser.g:1741:5: (otherlv_5= GreaterThanSign () )
            	            {
            	            // InternalKlangParser.g:1741:5: (otherlv_5= GreaterThanSign () )
            	            // InternalKlangParser.g:1742:6: otherlv_5= GreaterThanSign ()
            	            {
            	            otherlv_5=(Token)match(input,GreaterThanSign,FOLLOW_23); 

            	            						newLeafNode(otherlv_5, grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_2_0());
            	            					
            	            // InternalKlangParser.g:1746:6: ()
            	            // InternalKlangParser.g:1747:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getComparisonAccess().getGreaterThanLeftAction_1_0_2_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalKlangParser.g:1755:4: ( (lv_right_7_0= rulePlus ) )
            	    // InternalKlangParser.g:1756:5: (lv_right_7_0= rulePlus )
            	    {
            	    // InternalKlangParser.g:1756:5: (lv_right_7_0= rulePlus )
            	    // InternalKlangParser.g:1757:6: lv_right_7_0= rulePlus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
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
            	    break loop27;
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
    // InternalKlangParser.g:1779:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalKlangParser.g:1779:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalKlangParser.g:1780:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalKlangParser.g:1786:1: ruleFunctionCall returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= RightParenthesis ) ;
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
            // InternalKlangParser.g:1792:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= RightParenthesis ) )
            // InternalKlangParser.g:1793:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= RightParenthesis )
            {
            // InternalKlangParser.g:1793:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= RightParenthesis )
            // InternalKlangParser.g:1794:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )* )? otherlv_5= RightParenthesis
            {
            // InternalKlangParser.g:1794:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalKlangParser.g:1795:4: (lv_name_0_0= RULE_ID )
            {
            // InternalKlangParser.g:1795:4: (lv_name_0_0= RULE_ID )
            // InternalKlangParser.g:1796:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalKlangParser.g:1816:3: ( ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==False||LA29_0==True||LA29_0==Not||LA29_0==LeftParenthesis||LA29_0==HyphenMinus||(LA29_0>=RULE_ID && LA29_0<=RULE_STRING)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalKlangParser.g:1817:4: ( (lv_parameters_2_0= ruleExpression ) ) (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )*
                    {
                    // InternalKlangParser.g:1817:4: ( (lv_parameters_2_0= ruleExpression ) )
                    // InternalKlangParser.g:1818:5: (lv_parameters_2_0= ruleExpression )
                    {
                    // InternalKlangParser.g:1818:5: (lv_parameters_2_0= ruleExpression )
                    // InternalKlangParser.g:1819:6: lv_parameters_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_34);
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

                    // InternalKlangParser.g:1836:4: (otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==Comma) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalKlangParser.g:1837:5: otherlv_3= Comma ( (lv_parameters_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_23); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalKlangParser.g:1841:5: ( (lv_parameters_4_0= ruleExpression ) )
                    	    // InternalKlangParser.g:1842:6: (lv_parameters_4_0= ruleExpression )
                    	    {
                    	    // InternalKlangParser.g:1842:6: (lv_parameters_4_0= ruleExpression )
                    	    // InternalKlangParser.g:1843:7: lv_parameters_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_34);
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
                    	    break loop28;
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
    // InternalKlangParser.g:1870:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalKlangParser.g:1870:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalKlangParser.g:1871:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalKlangParser.g:1877:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | ( () otherlv_4= Not ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | ( () otherlv_7= HyphenMinus ( (lv_expression_8_0= rulePrimaryExpression ) ) ) | ( () otherlv_10= LeftParenthesis otherlv_11= Double otherlv_12= RightParenthesis ( (lv_expression_13_0= rulePrimaryExpression ) ) ) | ( () otherlv_15= LeftParenthesis otherlv_16= Int otherlv_17= RightParenthesis ( (lv_expression_18_0= rulePrimaryExpression ) ) ) | this_FunctionCall_19= ruleFunctionCall | this_AtomicExpression_20= ruleAtomicExpression ) ;
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
            // InternalKlangParser.g:1883:2: ( ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | ( () otherlv_4= Not ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | ( () otherlv_7= HyphenMinus ( (lv_expression_8_0= rulePrimaryExpression ) ) ) | ( () otherlv_10= LeftParenthesis otherlv_11= Double otherlv_12= RightParenthesis ( (lv_expression_13_0= rulePrimaryExpression ) ) ) | ( () otherlv_15= LeftParenthesis otherlv_16= Int otherlv_17= RightParenthesis ( (lv_expression_18_0= rulePrimaryExpression ) ) ) | this_FunctionCall_19= ruleFunctionCall | this_AtomicExpression_20= ruleAtomicExpression ) )
            // InternalKlangParser.g:1884:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | ( () otherlv_4= Not ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | ( () otherlv_7= HyphenMinus ( (lv_expression_8_0= rulePrimaryExpression ) ) ) | ( () otherlv_10= LeftParenthesis otherlv_11= Double otherlv_12= RightParenthesis ( (lv_expression_13_0= rulePrimaryExpression ) ) ) | ( () otherlv_15= LeftParenthesis otherlv_16= Int otherlv_17= RightParenthesis ( (lv_expression_18_0= rulePrimaryExpression ) ) ) | this_FunctionCall_19= ruleFunctionCall | this_AtomicExpression_20= ruleAtomicExpression )
            {
            // InternalKlangParser.g:1884:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | ( () otherlv_4= Not ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | ( () otherlv_7= HyphenMinus ( (lv_expression_8_0= rulePrimaryExpression ) ) ) | ( () otherlv_10= LeftParenthesis otherlv_11= Double otherlv_12= RightParenthesis ( (lv_expression_13_0= rulePrimaryExpression ) ) ) | ( () otherlv_15= LeftParenthesis otherlv_16= Int otherlv_17= RightParenthesis ( (lv_expression_18_0= rulePrimaryExpression ) ) ) | this_FunctionCall_19= ruleFunctionCall | this_AtomicExpression_20= ruleAtomicExpression )
            int alt30=7;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // InternalKlangParser.g:1885:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    {
                    // InternalKlangParser.g:1885:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    // InternalKlangParser.g:1886:4: otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis
                    {
                    otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_23); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_15);
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
                    // InternalKlangParser.g:1904:3: ( () otherlv_4= Not ( (lv_expression_5_0= rulePrimaryExpression ) ) )
                    {
                    // InternalKlangParser.g:1904:3: ( () otherlv_4= Not ( (lv_expression_5_0= rulePrimaryExpression ) ) )
                    // InternalKlangParser.g:1905:4: () otherlv_4= Not ( (lv_expression_5_0= rulePrimaryExpression ) )
                    {
                    // InternalKlangParser.g:1905:4: ()
                    // InternalKlangParser.g:1906:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getNotAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,Not,FOLLOW_23); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getNotKeyword_1_1());
                    			
                    // InternalKlangParser.g:1916:4: ( (lv_expression_5_0= rulePrimaryExpression ) )
                    // InternalKlangParser.g:1917:5: (lv_expression_5_0= rulePrimaryExpression )
                    {
                    // InternalKlangParser.g:1917:5: (lv_expression_5_0= rulePrimaryExpression )
                    // InternalKlangParser.g:1918:6: lv_expression_5_0= rulePrimaryExpression
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
                    // InternalKlangParser.g:1937:3: ( () otherlv_7= HyphenMinus ( (lv_expression_8_0= rulePrimaryExpression ) ) )
                    {
                    // InternalKlangParser.g:1937:3: ( () otherlv_7= HyphenMinus ( (lv_expression_8_0= rulePrimaryExpression ) ) )
                    // InternalKlangParser.g:1938:4: () otherlv_7= HyphenMinus ( (lv_expression_8_0= rulePrimaryExpression ) )
                    {
                    // InternalKlangParser.g:1938:4: ()
                    // InternalKlangParser.g:1939:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getUnaryMinusAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,HyphenMinus,FOLLOW_23); 

                    				newLeafNode(otherlv_7, grammarAccess.getPrimaryExpressionAccess().getHyphenMinusKeyword_2_1());
                    			
                    // InternalKlangParser.g:1949:4: ( (lv_expression_8_0= rulePrimaryExpression ) )
                    // InternalKlangParser.g:1950:5: (lv_expression_8_0= rulePrimaryExpression )
                    {
                    // InternalKlangParser.g:1950:5: (lv_expression_8_0= rulePrimaryExpression )
                    // InternalKlangParser.g:1951:6: lv_expression_8_0= rulePrimaryExpression
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
                    // InternalKlangParser.g:1970:3: ( () otherlv_10= LeftParenthesis otherlv_11= Double otherlv_12= RightParenthesis ( (lv_expression_13_0= rulePrimaryExpression ) ) )
                    {
                    // InternalKlangParser.g:1970:3: ( () otherlv_10= LeftParenthesis otherlv_11= Double otherlv_12= RightParenthesis ( (lv_expression_13_0= rulePrimaryExpression ) ) )
                    // InternalKlangParser.g:1971:4: () otherlv_10= LeftParenthesis otherlv_11= Double otherlv_12= RightParenthesis ( (lv_expression_13_0= rulePrimaryExpression ) )
                    {
                    // InternalKlangParser.g:1971:4: ()
                    // InternalKlangParser.g:1972:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getToDoubleAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_10=(Token)match(input,LeftParenthesis,FOLLOW_35); 

                    				newLeafNode(otherlv_10, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_3_1());
                    			
                    otherlv_11=(Token)match(input,Double,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getPrimaryExpressionAccess().getDoubleKeyword_3_2());
                    			
                    otherlv_12=(Token)match(input,RightParenthesis,FOLLOW_23); 

                    				newLeafNode(otherlv_12, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_3_3());
                    			
                    // InternalKlangParser.g:1990:4: ( (lv_expression_13_0= rulePrimaryExpression ) )
                    // InternalKlangParser.g:1991:5: (lv_expression_13_0= rulePrimaryExpression )
                    {
                    // InternalKlangParser.g:1991:5: (lv_expression_13_0= rulePrimaryExpression )
                    // InternalKlangParser.g:1992:6: lv_expression_13_0= rulePrimaryExpression
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
                    // InternalKlangParser.g:2011:3: ( () otherlv_15= LeftParenthesis otherlv_16= Int otherlv_17= RightParenthesis ( (lv_expression_18_0= rulePrimaryExpression ) ) )
                    {
                    // InternalKlangParser.g:2011:3: ( () otherlv_15= LeftParenthesis otherlv_16= Int otherlv_17= RightParenthesis ( (lv_expression_18_0= rulePrimaryExpression ) ) )
                    // InternalKlangParser.g:2012:4: () otherlv_15= LeftParenthesis otherlv_16= Int otherlv_17= RightParenthesis ( (lv_expression_18_0= rulePrimaryExpression ) )
                    {
                    // InternalKlangParser.g:2012:4: ()
                    // InternalKlangParser.g:2013:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getToIntAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_15=(Token)match(input,LeftParenthesis,FOLLOW_36); 

                    				newLeafNode(otherlv_15, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_1());
                    			
                    otherlv_16=(Token)match(input,Int,FOLLOW_15); 

                    				newLeafNode(otherlv_16, grammarAccess.getPrimaryExpressionAccess().getIntKeyword_4_2());
                    			
                    otherlv_17=(Token)match(input,RightParenthesis,FOLLOW_23); 

                    				newLeafNode(otherlv_17, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_3());
                    			
                    // InternalKlangParser.g:2031:4: ( (lv_expression_18_0= rulePrimaryExpression ) )
                    // InternalKlangParser.g:2032:5: (lv_expression_18_0= rulePrimaryExpression )
                    {
                    // InternalKlangParser.g:2032:5: (lv_expression_18_0= rulePrimaryExpression )
                    // InternalKlangParser.g:2033:6: lv_expression_18_0= rulePrimaryExpression
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
                    // InternalKlangParser.g:2052:3: this_FunctionCall_19= ruleFunctionCall
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
                    // InternalKlangParser.g:2061:3: this_AtomicExpression_20= ruleAtomicExpression
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
    // InternalKlangParser.g:2073:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalKlangParser.g:2073:57: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalKlangParser.g:2074:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
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
    // InternalKlangParser.g:2080:1: ruleAtomicExpression returns [EObject current=null] : ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) | ( () ( (lv_value_4_0= ruleDECIMAL ) ) ) | ( () ( (lv_value_6_0= RULE_INT ) ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( () ( (lv_variableName_10_0= RULE_ID ) ) ) ) ;
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
            // InternalKlangParser.g:2086:2: ( ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) | ( () ( (lv_value_4_0= ruleDECIMAL ) ) ) | ( () ( (lv_value_6_0= RULE_INT ) ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( () ( (lv_variableName_10_0= RULE_ID ) ) ) ) )
            // InternalKlangParser.g:2087:2: ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) | ( () ( (lv_value_4_0= ruleDECIMAL ) ) ) | ( () ( (lv_value_6_0= RULE_INT ) ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( () ( (lv_variableName_10_0= RULE_ID ) ) ) )
            {
            // InternalKlangParser.g:2087:2: ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) | ( () ( (lv_value_4_0= ruleDECIMAL ) ) ) | ( () ( (lv_value_6_0= RULE_INT ) ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( () ( (lv_variableName_10_0= RULE_ID ) ) ) )
            int alt32=5;
            switch ( input.LA(1) ) {
            case False:
            case True:
                {
                alt32=1;
                }
                break;
            case RULE_INT:
                {
                int LA32_2 = input.LA(2);

                if ( (LA32_2==FullStop) ) {
                    alt32=2;
                }
                else if ( (LA32_2==EOF||LA32_2==SendMessage||LA32_2==Forever||(LA32_2>=Sleep && LA32_2<=While)||LA32_2==When||LA32_2==And||(LA32_2>=Var && LA32_2<=Or)||(LA32_2>=RightParenthesis && LA32_2<=HyphenMinus)||(LA32_2>=Solidus && LA32_2<=LessThanSign)||LA32_2==GreaterThanSign||(LA32_2>=RULE_BEGIN && LA32_2<=RULE_ID)) ) {
                    alt32=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt32=4;
                }
                break;
            case RULE_ID:
                {
                alt32=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalKlangParser.g:2088:3: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
                    {
                    // InternalKlangParser.g:2088:3: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
                    // InternalKlangParser.g:2089:4: () ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
                    {
                    // InternalKlangParser.g:2089:4: ()
                    // InternalKlangParser.g:2090:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicExpressionAccess().getBooleanLiteralAction_0_0(),
                    						current);
                    				

                    }

                    // InternalKlangParser.g:2096:4: ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==True) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==False) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalKlangParser.g:2097:5: ( (lv_value_1_0= True ) )
                            {
                            // InternalKlangParser.g:2097:5: ( (lv_value_1_0= True ) )
                            // InternalKlangParser.g:2098:6: (lv_value_1_0= True )
                            {
                            // InternalKlangParser.g:2098:6: (lv_value_1_0= True )
                            // InternalKlangParser.g:2099:7: lv_value_1_0= True
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
                            // InternalKlangParser.g:2112:5: otherlv_2= False
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
                    // InternalKlangParser.g:2119:3: ( () ( (lv_value_4_0= ruleDECIMAL ) ) )
                    {
                    // InternalKlangParser.g:2119:3: ( () ( (lv_value_4_0= ruleDECIMAL ) ) )
                    // InternalKlangParser.g:2120:4: () ( (lv_value_4_0= ruleDECIMAL ) )
                    {
                    // InternalKlangParser.g:2120:4: ()
                    // InternalKlangParser.g:2121:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicExpressionAccess().getDoubleLiteralAction_1_0(),
                    						current);
                    				

                    }

                    // InternalKlangParser.g:2127:4: ( (lv_value_4_0= ruleDECIMAL ) )
                    // InternalKlangParser.g:2128:5: (lv_value_4_0= ruleDECIMAL )
                    {
                    // InternalKlangParser.g:2128:5: (lv_value_4_0= ruleDECIMAL )
                    // InternalKlangParser.g:2129:6: lv_value_4_0= ruleDECIMAL
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
                    // InternalKlangParser.g:2148:3: ( () ( (lv_value_6_0= RULE_INT ) ) )
                    {
                    // InternalKlangParser.g:2148:3: ( () ( (lv_value_6_0= RULE_INT ) ) )
                    // InternalKlangParser.g:2149:4: () ( (lv_value_6_0= RULE_INT ) )
                    {
                    // InternalKlangParser.g:2149:4: ()
                    // InternalKlangParser.g:2150:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicExpressionAccess().getIntegerLiteralAction_2_0(),
                    						current);
                    				

                    }

                    // InternalKlangParser.g:2156:4: ( (lv_value_6_0= RULE_INT ) )
                    // InternalKlangParser.g:2157:5: (lv_value_6_0= RULE_INT )
                    {
                    // InternalKlangParser.g:2157:5: (lv_value_6_0= RULE_INT )
                    // InternalKlangParser.g:2158:6: lv_value_6_0= RULE_INT
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
                    // InternalKlangParser.g:2176:3: ( () ( (lv_value_8_0= RULE_STRING ) ) )
                    {
                    // InternalKlangParser.g:2176:3: ( () ( (lv_value_8_0= RULE_STRING ) ) )
                    // InternalKlangParser.g:2177:4: () ( (lv_value_8_0= RULE_STRING ) )
                    {
                    // InternalKlangParser.g:2177:4: ()
                    // InternalKlangParser.g:2178:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicExpressionAccess().getStringLiteralAction_3_0(),
                    						current);
                    				

                    }

                    // InternalKlangParser.g:2184:4: ( (lv_value_8_0= RULE_STRING ) )
                    // InternalKlangParser.g:2185:5: (lv_value_8_0= RULE_STRING )
                    {
                    // InternalKlangParser.g:2185:5: (lv_value_8_0= RULE_STRING )
                    // InternalKlangParser.g:2186:6: lv_value_8_0= RULE_STRING
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
                    // InternalKlangParser.g:2204:3: ( () ( (lv_variableName_10_0= RULE_ID ) ) )
                    {
                    // InternalKlangParser.g:2204:3: ( () ( (lv_variableName_10_0= RULE_ID ) ) )
                    // InternalKlangParser.g:2205:4: () ( (lv_variableName_10_0= RULE_ID ) )
                    {
                    // InternalKlangParser.g:2205:4: ()
                    // InternalKlangParser.g:2206:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicExpressionAccess().getVariableReferenceAction_4_0(),
                    						current);
                    				

                    }

                    // InternalKlangParser.g:2212:4: ( (lv_variableName_10_0= RULE_ID ) )
                    // InternalKlangParser.g:2213:5: (lv_variableName_10_0= RULE_ID )
                    {
                    // InternalKlangParser.g:2213:5: (lv_variableName_10_0= RULE_ID )
                    // InternalKlangParser.g:2214:6: lv_variableName_10_0= RULE_ID
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
    // InternalKlangParser.g:2235:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalKlangParser.g:2235:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalKlangParser.g:2236:2: iv_ruleDECIMAL= ruleDECIMAL EOF
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
    // InternalKlangParser.g:2242:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= FullStop this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalKlangParser.g:2248:2: ( (this_INT_0= RULE_INT kw= FullStop this_INT_2= RULE_INT ) )
            // InternalKlangParser.g:2249:2: (this_INT_0= RULE_INT kw= FullStop this_INT_2= RULE_INT )
            {
            // InternalKlangParser.g:2249:2: (this_INT_0= RULE_INT kw= FullStop this_INT_2= RULE_INT )
            // InternalKlangParser.g:2250:3: this_INT_0= RULE_INT kw= FullStop this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_37); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,FullStop,FOLLOW_38); 

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
    // InternalKlangParser.g:2273:1: ruleKeys returns [Enumerator current=null] : ( (enumLiteral_0= A ) | (enumLiteral_1= B ) | (enumLiteral_2= C ) | (enumLiteral_3= D ) | (enumLiteral_4= E ) | (enumLiteral_5= F ) | (enumLiteral_6= G ) | (enumLiteral_7= H ) | (enumLiteral_8= I ) | (enumLiteral_9= J ) | (enumLiteral_10= K ) | (enumLiteral_11= L ) | (enumLiteral_12= M ) | (enumLiteral_13= N ) | (enumLiteral_14= O ) | (enumLiteral_15= P ) | (enumLiteral_16= Q ) | (enumLiteral_17= R ) | (enumLiteral_18= S ) | (enumLiteral_19= T ) | (enumLiteral_20= U ) | (enumLiteral_21= V ) | (enumLiteral_22= W ) | (enumLiteral_23= X ) | (enumLiteral_24= Y ) | (enumLiteral_25= Z ) | (enumLiteral_26= SPACE ) | (enumLiteral_27= ENTER ) ) ;
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
            // InternalKlangParser.g:2279:2: ( ( (enumLiteral_0= A ) | (enumLiteral_1= B ) | (enumLiteral_2= C ) | (enumLiteral_3= D ) | (enumLiteral_4= E ) | (enumLiteral_5= F ) | (enumLiteral_6= G ) | (enumLiteral_7= H ) | (enumLiteral_8= I ) | (enumLiteral_9= J ) | (enumLiteral_10= K ) | (enumLiteral_11= L ) | (enumLiteral_12= M ) | (enumLiteral_13= N ) | (enumLiteral_14= O ) | (enumLiteral_15= P ) | (enumLiteral_16= Q ) | (enumLiteral_17= R ) | (enumLiteral_18= S ) | (enumLiteral_19= T ) | (enumLiteral_20= U ) | (enumLiteral_21= V ) | (enumLiteral_22= W ) | (enumLiteral_23= X ) | (enumLiteral_24= Y ) | (enumLiteral_25= Z ) | (enumLiteral_26= SPACE ) | (enumLiteral_27= ENTER ) ) )
            // InternalKlangParser.g:2280:2: ( (enumLiteral_0= A ) | (enumLiteral_1= B ) | (enumLiteral_2= C ) | (enumLiteral_3= D ) | (enumLiteral_4= E ) | (enumLiteral_5= F ) | (enumLiteral_6= G ) | (enumLiteral_7= H ) | (enumLiteral_8= I ) | (enumLiteral_9= J ) | (enumLiteral_10= K ) | (enumLiteral_11= L ) | (enumLiteral_12= M ) | (enumLiteral_13= N ) | (enumLiteral_14= O ) | (enumLiteral_15= P ) | (enumLiteral_16= Q ) | (enumLiteral_17= R ) | (enumLiteral_18= S ) | (enumLiteral_19= T ) | (enumLiteral_20= U ) | (enumLiteral_21= V ) | (enumLiteral_22= W ) | (enumLiteral_23= X ) | (enumLiteral_24= Y ) | (enumLiteral_25= Z ) | (enumLiteral_26= SPACE ) | (enumLiteral_27= ENTER ) )
            {
            // InternalKlangParser.g:2280:2: ( (enumLiteral_0= A ) | (enumLiteral_1= B ) | (enumLiteral_2= C ) | (enumLiteral_3= D ) | (enumLiteral_4= E ) | (enumLiteral_5= F ) | (enumLiteral_6= G ) | (enumLiteral_7= H ) | (enumLiteral_8= I ) | (enumLiteral_9= J ) | (enumLiteral_10= K ) | (enumLiteral_11= L ) | (enumLiteral_12= M ) | (enumLiteral_13= N ) | (enumLiteral_14= O ) | (enumLiteral_15= P ) | (enumLiteral_16= Q ) | (enumLiteral_17= R ) | (enumLiteral_18= S ) | (enumLiteral_19= T ) | (enumLiteral_20= U ) | (enumLiteral_21= V ) | (enumLiteral_22= W ) | (enumLiteral_23= X ) | (enumLiteral_24= Y ) | (enumLiteral_25= Z ) | (enumLiteral_26= SPACE ) | (enumLiteral_27= ENTER ) )
            int alt33=28;
            switch ( input.LA(1) ) {
            case A:
                {
                alt33=1;
                }
                break;
            case B:
                {
                alt33=2;
                }
                break;
            case C:
                {
                alt33=3;
                }
                break;
            case D:
                {
                alt33=4;
                }
                break;
            case E:
                {
                alt33=5;
                }
                break;
            case F:
                {
                alt33=6;
                }
                break;
            case G:
                {
                alt33=7;
                }
                break;
            case H:
                {
                alt33=8;
                }
                break;
            case I:
                {
                alt33=9;
                }
                break;
            case J:
                {
                alt33=10;
                }
                break;
            case K:
                {
                alt33=11;
                }
                break;
            case L:
                {
                alt33=12;
                }
                break;
            case M:
                {
                alt33=13;
                }
                break;
            case N:
                {
                alt33=14;
                }
                break;
            case O:
                {
                alt33=15;
                }
                break;
            case P:
                {
                alt33=16;
                }
                break;
            case Q:
                {
                alt33=17;
                }
                break;
            case R:
                {
                alt33=18;
                }
                break;
            case S:
                {
                alt33=19;
                }
                break;
            case T:
                {
                alt33=20;
                }
                break;
            case U:
                {
                alt33=21;
                }
                break;
            case V:
                {
                alt33=22;
                }
                break;
            case W:
                {
                alt33=23;
                }
                break;
            case X:
                {
                alt33=24;
                }
                break;
            case Y:
                {
                alt33=25;
                }
                break;
            case Z:
                {
                alt33=26;
                }
                break;
            case SPACE:
                {
                alt33=27;
                }
                break;
            case ENTER:
                {
                alt33=28;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalKlangParser.g:2281:3: (enumLiteral_0= A )
                    {
                    // InternalKlangParser.g:2281:3: (enumLiteral_0= A )
                    // InternalKlangParser.g:2282:4: enumLiteral_0= A
                    {
                    enumLiteral_0=(Token)match(input,A,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getKeysAccess().getAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalKlangParser.g:2289:3: (enumLiteral_1= B )
                    {
                    // InternalKlangParser.g:2289:3: (enumLiteral_1= B )
                    // InternalKlangParser.g:2290:4: enumLiteral_1= B
                    {
                    enumLiteral_1=(Token)match(input,B,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getKeysAccess().getBEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalKlangParser.g:2297:3: (enumLiteral_2= C )
                    {
                    // InternalKlangParser.g:2297:3: (enumLiteral_2= C )
                    // InternalKlangParser.g:2298:4: enumLiteral_2= C
                    {
                    enumLiteral_2=(Token)match(input,C,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getCEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getKeysAccess().getCEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalKlangParser.g:2305:3: (enumLiteral_3= D )
                    {
                    // InternalKlangParser.g:2305:3: (enumLiteral_3= D )
                    // InternalKlangParser.g:2306:4: enumLiteral_3= D
                    {
                    enumLiteral_3=(Token)match(input,D,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getKeysAccess().getDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalKlangParser.g:2313:3: (enumLiteral_4= E )
                    {
                    // InternalKlangParser.g:2313:3: (enumLiteral_4= E )
                    // InternalKlangParser.g:2314:4: enumLiteral_4= E
                    {
                    enumLiteral_4=(Token)match(input,E,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getKeysAccess().getEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalKlangParser.g:2321:3: (enumLiteral_5= F )
                    {
                    // InternalKlangParser.g:2321:3: (enumLiteral_5= F )
                    // InternalKlangParser.g:2322:4: enumLiteral_5= F
                    {
                    enumLiteral_5=(Token)match(input,F,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getFEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getKeysAccess().getFEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalKlangParser.g:2329:3: (enumLiteral_6= G )
                    {
                    // InternalKlangParser.g:2329:3: (enumLiteral_6= G )
                    // InternalKlangParser.g:2330:4: enumLiteral_6= G
                    {
                    enumLiteral_6=(Token)match(input,G,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getGEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getKeysAccess().getGEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalKlangParser.g:2337:3: (enumLiteral_7= H )
                    {
                    // InternalKlangParser.g:2337:3: (enumLiteral_7= H )
                    // InternalKlangParser.g:2338:4: enumLiteral_7= H
                    {
                    enumLiteral_7=(Token)match(input,H,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getHEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getKeysAccess().getHEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalKlangParser.g:2345:3: (enumLiteral_8= I )
                    {
                    // InternalKlangParser.g:2345:3: (enumLiteral_8= I )
                    // InternalKlangParser.g:2346:4: enumLiteral_8= I
                    {
                    enumLiteral_8=(Token)match(input,I,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getIEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getKeysAccess().getIEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalKlangParser.g:2353:3: (enumLiteral_9= J )
                    {
                    // InternalKlangParser.g:2353:3: (enumLiteral_9= J )
                    // InternalKlangParser.g:2354:4: enumLiteral_9= J
                    {
                    enumLiteral_9=(Token)match(input,J,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getJEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getKeysAccess().getJEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalKlangParser.g:2361:3: (enumLiteral_10= K )
                    {
                    // InternalKlangParser.g:2361:3: (enumLiteral_10= K )
                    // InternalKlangParser.g:2362:4: enumLiteral_10= K
                    {
                    enumLiteral_10=(Token)match(input,K,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getKEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getKeysAccess().getKEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalKlangParser.g:2369:3: (enumLiteral_11= L )
                    {
                    // InternalKlangParser.g:2369:3: (enumLiteral_11= L )
                    // InternalKlangParser.g:2370:4: enumLiteral_11= L
                    {
                    enumLiteral_11=(Token)match(input,L,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getLEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getKeysAccess().getLEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalKlangParser.g:2377:3: (enumLiteral_12= M )
                    {
                    // InternalKlangParser.g:2377:3: (enumLiteral_12= M )
                    // InternalKlangParser.g:2378:4: enumLiteral_12= M
                    {
                    enumLiteral_12=(Token)match(input,M,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getMEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getKeysAccess().getMEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalKlangParser.g:2385:3: (enumLiteral_13= N )
                    {
                    // InternalKlangParser.g:2385:3: (enumLiteral_13= N )
                    // InternalKlangParser.g:2386:4: enumLiteral_13= N
                    {
                    enumLiteral_13=(Token)match(input,N,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getNEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getKeysAccess().getNEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalKlangParser.g:2393:3: (enumLiteral_14= O )
                    {
                    // InternalKlangParser.g:2393:3: (enumLiteral_14= O )
                    // InternalKlangParser.g:2394:4: enumLiteral_14= O
                    {
                    enumLiteral_14=(Token)match(input,O,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getOEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getKeysAccess().getOEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalKlangParser.g:2401:3: (enumLiteral_15= P )
                    {
                    // InternalKlangParser.g:2401:3: (enumLiteral_15= P )
                    // InternalKlangParser.g:2402:4: enumLiteral_15= P
                    {
                    enumLiteral_15=(Token)match(input,P,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getPEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getKeysAccess().getPEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalKlangParser.g:2409:3: (enumLiteral_16= Q )
                    {
                    // InternalKlangParser.g:2409:3: (enumLiteral_16= Q )
                    // InternalKlangParser.g:2410:4: enumLiteral_16= Q
                    {
                    enumLiteral_16=(Token)match(input,Q,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getQEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getKeysAccess().getQEnumLiteralDeclaration_16());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalKlangParser.g:2417:3: (enumLiteral_17= R )
                    {
                    // InternalKlangParser.g:2417:3: (enumLiteral_17= R )
                    // InternalKlangParser.g:2418:4: enumLiteral_17= R
                    {
                    enumLiteral_17=(Token)match(input,R,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getREnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_17, grammarAccess.getKeysAccess().getREnumLiteralDeclaration_17());
                    			

                    }


                    }
                    break;
                case 19 :
                    // InternalKlangParser.g:2425:3: (enumLiteral_18= S )
                    {
                    // InternalKlangParser.g:2425:3: (enumLiteral_18= S )
                    // InternalKlangParser.g:2426:4: enumLiteral_18= S
                    {
                    enumLiteral_18=(Token)match(input,S,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getSEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_18, grammarAccess.getKeysAccess().getSEnumLiteralDeclaration_18());
                    			

                    }


                    }
                    break;
                case 20 :
                    // InternalKlangParser.g:2433:3: (enumLiteral_19= T )
                    {
                    // InternalKlangParser.g:2433:3: (enumLiteral_19= T )
                    // InternalKlangParser.g:2434:4: enumLiteral_19= T
                    {
                    enumLiteral_19=(Token)match(input,T,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getTEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_19, grammarAccess.getKeysAccess().getTEnumLiteralDeclaration_19());
                    			

                    }


                    }
                    break;
                case 21 :
                    // InternalKlangParser.g:2441:3: (enumLiteral_20= U )
                    {
                    // InternalKlangParser.g:2441:3: (enumLiteral_20= U )
                    // InternalKlangParser.g:2442:4: enumLiteral_20= U
                    {
                    enumLiteral_20=(Token)match(input,U,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getUEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_20, grammarAccess.getKeysAccess().getUEnumLiteralDeclaration_20());
                    			

                    }


                    }
                    break;
                case 22 :
                    // InternalKlangParser.g:2449:3: (enumLiteral_21= V )
                    {
                    // InternalKlangParser.g:2449:3: (enumLiteral_21= V )
                    // InternalKlangParser.g:2450:4: enumLiteral_21= V
                    {
                    enumLiteral_21=(Token)match(input,V,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getVEnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_21, grammarAccess.getKeysAccess().getVEnumLiteralDeclaration_21());
                    			

                    }


                    }
                    break;
                case 23 :
                    // InternalKlangParser.g:2457:3: (enumLiteral_22= W )
                    {
                    // InternalKlangParser.g:2457:3: (enumLiteral_22= W )
                    // InternalKlangParser.g:2458:4: enumLiteral_22= W
                    {
                    enumLiteral_22=(Token)match(input,W,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getWEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_22, grammarAccess.getKeysAccess().getWEnumLiteralDeclaration_22());
                    			

                    }


                    }
                    break;
                case 24 :
                    // InternalKlangParser.g:2465:3: (enumLiteral_23= X )
                    {
                    // InternalKlangParser.g:2465:3: (enumLiteral_23= X )
                    // InternalKlangParser.g:2466:4: enumLiteral_23= X
                    {
                    enumLiteral_23=(Token)match(input,X,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getXEnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_23, grammarAccess.getKeysAccess().getXEnumLiteralDeclaration_23());
                    			

                    }


                    }
                    break;
                case 25 :
                    // InternalKlangParser.g:2473:3: (enumLiteral_24= Y )
                    {
                    // InternalKlangParser.g:2473:3: (enumLiteral_24= Y )
                    // InternalKlangParser.g:2474:4: enumLiteral_24= Y
                    {
                    enumLiteral_24=(Token)match(input,Y,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getYEnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_24, grammarAccess.getKeysAccess().getYEnumLiteralDeclaration_24());
                    			

                    }


                    }
                    break;
                case 26 :
                    // InternalKlangParser.g:2481:3: (enumLiteral_25= Z )
                    {
                    // InternalKlangParser.g:2481:3: (enumLiteral_25= Z )
                    // InternalKlangParser.g:2482:4: enumLiteral_25= Z
                    {
                    enumLiteral_25=(Token)match(input,Z,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getZEnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_25, grammarAccess.getKeysAccess().getZEnumLiteralDeclaration_25());
                    			

                    }


                    }
                    break;
                case 27 :
                    // InternalKlangParser.g:2489:3: (enumLiteral_26= SPACE )
                    {
                    // InternalKlangParser.g:2489:3: (enumLiteral_26= SPACE )
                    // InternalKlangParser.g:2490:4: enumLiteral_26= SPACE
                    {
                    enumLiteral_26=(Token)match(input,SPACE,FOLLOW_2); 

                    				current = grammarAccess.getKeysAccess().getSPACEEnumLiteralDeclaration_26().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_26, grammarAccess.getKeysAccess().getSPACEEnumLiteralDeclaration_26());
                    			

                    }


                    }
                    break;
                case 28 :
                    // InternalKlangParser.g:2497:3: (enumLiteral_27= ENTER )
                    {
                    // InternalKlangParser.g:2497:3: (enumLiteral_27= ENTER )
                    // InternalKlangParser.g:2498:4: enumLiteral_27= ENTER
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


    protected DFA30 dfa30 = new DFA30(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\4\uffff\1\5\5\uffff";
    static final String dfa_3s = "\1\17\1\12\2\uffff\1\4\5\uffff";
    static final String dfa_4s = "\2\112\2\uffff\1\110\5\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\uffff\1\7\1\1\1\5\1\4\1\6";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\5\5\uffff\1\5\4\uffff\1\2\4\uffff\1\1\4\uffff\1\3\43\uffff\1\4\2\5",
            "\1\10\4\uffff\1\6\5\uffff\1\6\3\uffff\1\7\1\6\4\uffff\1\6\4\uffff\1\6\43\uffff\3\6",
            "",
            "",
            "\1\5\3\uffff\1\5\10\uffff\2\5\3\uffff\1\5\1\uffff\1\5\2\uffff\4\5\1\11\5\5\1\uffff\2\5\1\uffff\1\5\34\uffff\3\5",
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

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1884:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | ( () otherlv_4= Not ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | ( () otherlv_7= HyphenMinus ( (lv_expression_8_0= rulePrimaryExpression ) ) ) | ( () otherlv_10= LeftParenthesis otherlv_11= Double otherlv_12= RightParenthesis ( (lv_expression_13_0= rulePrimaryExpression ) ) ) | ( () otherlv_15= LeftParenthesis otherlv_16= Int otherlv_17= RightParenthesis ( (lv_expression_18_0= rulePrimaryExpression ) ) ) | this_FunctionCall_19= ruleFunctionCall | this_AtomicExpression_20= ruleAtomicExpression )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008400000L,0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020060110L,0x0000000000000180L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0xFFFFFC0000006000L,0x000000000000000FL});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001084208000L,0x0000000000000700L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000028010000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001184208000L,0x0000000000000700L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});

}