package com.kaurel.klang.xtext.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.kaurel.klang.xtext.services.KlangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKlangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Collides", "Clicked", "Forever", "Pressed", "Sprite", "Starts", "False", "Scene", "Sleep", "While", "Else", "Game", "True", "When", "With", "And", "Key", "Not", "Var", "EqualsSignEqualsSign", "If", "Or", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "Solidus", "LessThanSign", "EqualsSign", "GreaterThanSign", "RULE_BEGIN", "RULE_END", "RULE_UPPERCASE", "RULE_INT", "RULE_DECIMAL", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Or=25;
    public static final int RULE_BEGIN=36;
    public static final int Clicked=5;
    public static final int Var=22;
    public static final int True=16;
    public static final int False=10;
    public static final int LessThanSign=33;
    public static final int Forever=6;
    public static final int LeftParenthesis=26;
    public static final int GreaterThanSign=35;
    public static final int RULE_ID=41;
    public static final int Collides=4;
    public static final int RightParenthesis=27;
    public static final int Scene=11;
    public static final int RULE_DECIMAL=40;
    public static final int EqualsSignEqualsSign=23;
    public static final int Not=21;
    public static final int Game=15;
    public static final int And=19;
    public static final int PlusSign=29;
    public static final int RULE_INT=39;
    public static final int RULE_UPPERCASE=38;
    public static final int RULE_ML_COMMENT=43;
    public static final int If=24;
    public static final int Key=20;
    public static final int Pressed=7;
    public static final int RULE_END=37;
    public static final int Starts=9;
    public static final int RULE_STRING=42;
    public static final int With=18;
    public static final int RULE_SL_COMMENT=44;
    public static final int Comma=30;
    public static final int EqualsSign=34;
    public static final int HyphenMinus=31;
    public static final int Solidus=32;
    public static final int EOF=-1;
    public static final int Asterisk=28;
    public static final int Sprite=8;
    public static final int RULE_WS=45;
    public static final int While=13;
    public static final int RULE_ANY_OTHER=46;
    public static final int Sleep=12;
    public static final int When=17;
    public static final int Else=14;

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
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("LeftParenthesis", "'('");
    		tokenNameToValue.put("RightParenthesis", "')'");
    		tokenNameToValue.put("Asterisk", "'*'");
    		tokenNameToValue.put("PlusSign", "'+'");
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("HyphenMinus", "'-'");
    		tokenNameToValue.put("Solidus", "'/'");
    		tokenNameToValue.put("LessThanSign", "'<'");
    		tokenNameToValue.put("EqualsSign", "'='");
    		tokenNameToValue.put("GreaterThanSign", "'>'");
    		tokenNameToValue.put("EqualsSignEqualsSign", "'=='");
    		tokenNameToValue.put("If", "'if'");
    		tokenNameToValue.put("Or", "'or'");
    		tokenNameToValue.put("And", "'and'");
    		tokenNameToValue.put("Key", "'key'");
    		tokenNameToValue.put("Not", "'not'");
    		tokenNameToValue.put("Var", "'var'");
    		tokenNameToValue.put("Else", "'else'");
    		tokenNameToValue.put("Game", "'game'");
    		tokenNameToValue.put("True", "'true'");
    		tokenNameToValue.put("When", "'when'");
    		tokenNameToValue.put("With", "'with'");
    		tokenNameToValue.put("False", "'false'");
    		tokenNameToValue.put("Scene", "'scene'");
    		tokenNameToValue.put("Sleep", "'sleep'");
    		tokenNameToValue.put("While", "'while'");
    		tokenNameToValue.put("Sprite", "'sprite'");
    		tokenNameToValue.put("Starts", "'starts'");
    		tokenNameToValue.put("Clicked", "'clicked'");
    		tokenNameToValue.put("Forever", "'forever'");
    		tokenNameToValue.put("Pressed", "'pressed'");
    		tokenNameToValue.put("Collides", "'collides'");
    	}

    	public void setGrammarAccess(KlangGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleGame"
    // InternalKlangParser.g:87:1: entryRuleGame : ruleGame EOF ;
    public final void entryRuleGame() throws RecognitionException {
        try {
            // InternalKlangParser.g:88:1: ( ruleGame EOF )
            // InternalKlangParser.g:89:1: ruleGame EOF
            {
             before(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_1);
            ruleGame();

            state._fsp--;

             after(grammarAccess.getGameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // InternalKlangParser.g:96:1: ruleGame : ( ( rule__Game__Group__0 ) ) ;
    public final void ruleGame() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:100:2: ( ( ( rule__Game__Group__0 ) ) )
            // InternalKlangParser.g:101:2: ( ( rule__Game__Group__0 ) )
            {
            // InternalKlangParser.g:101:2: ( ( rule__Game__Group__0 ) )
            // InternalKlangParser.g:102:3: ( rule__Game__Group__0 )
            {
             before(grammarAccess.getGameAccess().getGroup()); 
            // InternalKlangParser.g:103:3: ( rule__Game__Group__0 )
            // InternalKlangParser.g:103:4: rule__Game__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRuleActor"
    // InternalKlangParser.g:112:1: entryRuleActor : ruleActor EOF ;
    public final void entryRuleActor() throws RecognitionException {
        try {
            // InternalKlangParser.g:113:1: ( ruleActor EOF )
            // InternalKlangParser.g:114:1: ruleActor EOF
            {
             before(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_1);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getActorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalKlangParser.g:121:1: ruleActor : ( ( rule__Actor__Group__0 ) ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:125:2: ( ( ( rule__Actor__Group__0 ) ) )
            // InternalKlangParser.g:126:2: ( ( rule__Actor__Group__0 ) )
            {
            // InternalKlangParser.g:126:2: ( ( rule__Actor__Group__0 ) )
            // InternalKlangParser.g:127:3: ( rule__Actor__Group__0 )
            {
             before(grammarAccess.getActorAccess().getGroup()); 
            // InternalKlangParser.g:128:3: ( rule__Actor__Group__0 )
            // InternalKlangParser.g:128:4: rule__Actor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleEntity"
    // InternalKlangParser.g:137:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalKlangParser.g:138:1: ( ruleEntity EOF )
            // InternalKlangParser.g:139:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalKlangParser.g:146:1: ruleEntity : ( ( rule__Entity__Alternatives ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:150:2: ( ( ( rule__Entity__Alternatives ) ) )
            // InternalKlangParser.g:151:2: ( ( rule__Entity__Alternatives ) )
            {
            // InternalKlangParser.g:151:2: ( ( rule__Entity__Alternatives ) )
            // InternalKlangParser.g:152:3: ( rule__Entity__Alternatives )
            {
             before(grammarAccess.getEntityAccess().getAlternatives()); 
            // InternalKlangParser.g:153:3: ( rule__Entity__Alternatives )
            // InternalKlangParser.g:153:4: rule__Entity__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleEventHandler"
    // InternalKlangParser.g:162:1: entryRuleEventHandler : ruleEventHandler EOF ;
    public final void entryRuleEventHandler() throws RecognitionException {
        try {
            // InternalKlangParser.g:163:1: ( ruleEventHandler EOF )
            // InternalKlangParser.g:164:1: ruleEventHandler EOF
            {
             before(grammarAccess.getEventHandlerRule()); 
            pushFollow(FOLLOW_1);
            ruleEventHandler();

            state._fsp--;

             after(grammarAccess.getEventHandlerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEventHandler"


    // $ANTLR start "ruleEventHandler"
    // InternalKlangParser.g:171:1: ruleEventHandler : ( ( rule__EventHandler__Alternatives ) ) ;
    public final void ruleEventHandler() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:175:2: ( ( ( rule__EventHandler__Alternatives ) ) )
            // InternalKlangParser.g:176:2: ( ( rule__EventHandler__Alternatives ) )
            {
            // InternalKlangParser.g:176:2: ( ( rule__EventHandler__Alternatives ) )
            // InternalKlangParser.g:177:3: ( rule__EventHandler__Alternatives )
            {
             before(grammarAccess.getEventHandlerAccess().getAlternatives()); 
            // InternalKlangParser.g:178:3: ( rule__EventHandler__Alternatives )
            // InternalKlangParser.g:178:4: rule__EventHandler__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EventHandler__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEventHandlerAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventHandler"


    // $ANTLR start "entryRuleStatement"
    // InternalKlangParser.g:187:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalKlangParser.g:188:1: ( ruleStatement EOF )
            // InternalKlangParser.g:189:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalKlangParser.g:196:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:200:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalKlangParser.g:201:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalKlangParser.g:201:2: ( ( rule__Statement__Alternatives ) )
            // InternalKlangParser.g:202:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalKlangParser.g:203:3: ( rule__Statement__Alternatives )
            // InternalKlangParser.g:203:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleGameStart"
    // InternalKlangParser.g:212:1: entryRuleGameStart : ruleGameStart EOF ;
    public final void entryRuleGameStart() throws RecognitionException {
        try {
            // InternalKlangParser.g:213:1: ( ruleGameStart EOF )
            // InternalKlangParser.g:214:1: ruleGameStart EOF
            {
             before(grammarAccess.getGameStartRule()); 
            pushFollow(FOLLOW_1);
            ruleGameStart();

            state._fsp--;

             after(grammarAccess.getGameStartRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGameStart"


    // $ANTLR start "ruleGameStart"
    // InternalKlangParser.g:221:1: ruleGameStart : ( ( rule__GameStart__Group__0 ) ) ;
    public final void ruleGameStart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:225:2: ( ( ( rule__GameStart__Group__0 ) ) )
            // InternalKlangParser.g:226:2: ( ( rule__GameStart__Group__0 ) )
            {
            // InternalKlangParser.g:226:2: ( ( rule__GameStart__Group__0 ) )
            // InternalKlangParser.g:227:3: ( rule__GameStart__Group__0 )
            {
             before(grammarAccess.getGameStartAccess().getGroup()); 
            // InternalKlangParser.g:228:3: ( rule__GameStart__Group__0 )
            // InternalKlangParser.g:228:4: rule__GameStart__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GameStart__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGameStartAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGameStart"


    // $ANTLR start "entryRuleSpriteClicked"
    // InternalKlangParser.g:237:1: entryRuleSpriteClicked : ruleSpriteClicked EOF ;
    public final void entryRuleSpriteClicked() throws RecognitionException {
        try {
            // InternalKlangParser.g:238:1: ( ruleSpriteClicked EOF )
            // InternalKlangParser.g:239:1: ruleSpriteClicked EOF
            {
             before(grammarAccess.getSpriteClickedRule()); 
            pushFollow(FOLLOW_1);
            ruleSpriteClicked();

            state._fsp--;

             after(grammarAccess.getSpriteClickedRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpriteClicked"


    // $ANTLR start "ruleSpriteClicked"
    // InternalKlangParser.g:246:1: ruleSpriteClicked : ( ( rule__SpriteClicked__Group__0 ) ) ;
    public final void ruleSpriteClicked() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:250:2: ( ( ( rule__SpriteClicked__Group__0 ) ) )
            // InternalKlangParser.g:251:2: ( ( rule__SpriteClicked__Group__0 ) )
            {
            // InternalKlangParser.g:251:2: ( ( rule__SpriteClicked__Group__0 ) )
            // InternalKlangParser.g:252:3: ( rule__SpriteClicked__Group__0 )
            {
             before(grammarAccess.getSpriteClickedAccess().getGroup()); 
            // InternalKlangParser.g:253:3: ( rule__SpriteClicked__Group__0 )
            // InternalKlangParser.g:253:4: rule__SpriteClicked__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SpriteClicked__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpriteClickedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpriteClicked"


    // $ANTLR start "entryRuleKeyPressed"
    // InternalKlangParser.g:262:1: entryRuleKeyPressed : ruleKeyPressed EOF ;
    public final void entryRuleKeyPressed() throws RecognitionException {
        try {
            // InternalKlangParser.g:263:1: ( ruleKeyPressed EOF )
            // InternalKlangParser.g:264:1: ruleKeyPressed EOF
            {
             before(grammarAccess.getKeyPressedRule()); 
            pushFollow(FOLLOW_1);
            ruleKeyPressed();

            state._fsp--;

             after(grammarAccess.getKeyPressedRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKeyPressed"


    // $ANTLR start "ruleKeyPressed"
    // InternalKlangParser.g:271:1: ruleKeyPressed : ( ( rule__KeyPressed__Group__0 ) ) ;
    public final void ruleKeyPressed() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:275:2: ( ( ( rule__KeyPressed__Group__0 ) ) )
            // InternalKlangParser.g:276:2: ( ( rule__KeyPressed__Group__0 ) )
            {
            // InternalKlangParser.g:276:2: ( ( rule__KeyPressed__Group__0 ) )
            // InternalKlangParser.g:277:3: ( rule__KeyPressed__Group__0 )
            {
             before(grammarAccess.getKeyPressedAccess().getGroup()); 
            // InternalKlangParser.g:278:3: ( rule__KeyPressed__Group__0 )
            // InternalKlangParser.g:278:4: rule__KeyPressed__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KeyPressed__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKeyPressedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeyPressed"


    // $ANTLR start "entryRuleCollidesWith"
    // InternalKlangParser.g:287:1: entryRuleCollidesWith : ruleCollidesWith EOF ;
    public final void entryRuleCollidesWith() throws RecognitionException {
        try {
            // InternalKlangParser.g:288:1: ( ruleCollidesWith EOF )
            // InternalKlangParser.g:289:1: ruleCollidesWith EOF
            {
             before(grammarAccess.getCollidesWithRule()); 
            pushFollow(FOLLOW_1);
            ruleCollidesWith();

            state._fsp--;

             after(grammarAccess.getCollidesWithRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCollidesWith"


    // $ANTLR start "ruleCollidesWith"
    // InternalKlangParser.g:296:1: ruleCollidesWith : ( ( rule__CollidesWith__Group__0 ) ) ;
    public final void ruleCollidesWith() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:300:2: ( ( ( rule__CollidesWith__Group__0 ) ) )
            // InternalKlangParser.g:301:2: ( ( rule__CollidesWith__Group__0 ) )
            {
            // InternalKlangParser.g:301:2: ( ( rule__CollidesWith__Group__0 ) )
            // InternalKlangParser.g:302:3: ( rule__CollidesWith__Group__0 )
            {
             before(grammarAccess.getCollidesWithAccess().getGroup()); 
            // InternalKlangParser.g:303:3: ( rule__CollidesWith__Group__0 )
            // InternalKlangParser.g:303:4: rule__CollidesWith__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CollidesWith__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCollidesWithAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCollidesWith"


    // $ANTLR start "entryRuleWhileLoop"
    // InternalKlangParser.g:312:1: entryRuleWhileLoop : ruleWhileLoop EOF ;
    public final void entryRuleWhileLoop() throws RecognitionException {
        try {
            // InternalKlangParser.g:313:1: ( ruleWhileLoop EOF )
            // InternalKlangParser.g:314:1: ruleWhileLoop EOF
            {
             before(grammarAccess.getWhileLoopRule()); 
            pushFollow(FOLLOW_1);
            ruleWhileLoop();

            state._fsp--;

             after(grammarAccess.getWhileLoopRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWhileLoop"


    // $ANTLR start "ruleWhileLoop"
    // InternalKlangParser.g:321:1: ruleWhileLoop : ( ( rule__WhileLoop__Group__0 ) ) ;
    public final void ruleWhileLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:325:2: ( ( ( rule__WhileLoop__Group__0 ) ) )
            // InternalKlangParser.g:326:2: ( ( rule__WhileLoop__Group__0 ) )
            {
            // InternalKlangParser.g:326:2: ( ( rule__WhileLoop__Group__0 ) )
            // InternalKlangParser.g:327:3: ( rule__WhileLoop__Group__0 )
            {
             before(grammarAccess.getWhileLoopAccess().getGroup()); 
            // InternalKlangParser.g:328:3: ( rule__WhileLoop__Group__0 )
            // InternalKlangParser.g:328:4: rule__WhileLoop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhileLoopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhileLoop"


    // $ANTLR start "entryRuleIf"
    // InternalKlangParser.g:337:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // InternalKlangParser.g:338:1: ( ruleIf EOF )
            // InternalKlangParser.g:339:1: ruleIf EOF
            {
             before(grammarAccess.getIfRule()); 
            pushFollow(FOLLOW_1);
            ruleIf();

            state._fsp--;

             after(grammarAccess.getIfRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalKlangParser.g:346:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:350:2: ( ( ( rule__If__Group__0 ) ) )
            // InternalKlangParser.g:351:2: ( ( rule__If__Group__0 ) )
            {
            // InternalKlangParser.g:351:2: ( ( rule__If__Group__0 ) )
            // InternalKlangParser.g:352:3: ( rule__If__Group__0 )
            {
             before(grammarAccess.getIfAccess().getGroup()); 
            // InternalKlangParser.g:353:3: ( rule__If__Group__0 )
            // InternalKlangParser.g:353:4: rule__If__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleForeverLoop"
    // InternalKlangParser.g:362:1: entryRuleForeverLoop : ruleForeverLoop EOF ;
    public final void entryRuleForeverLoop() throws RecognitionException {
        try {
            // InternalKlangParser.g:363:1: ( ruleForeverLoop EOF )
            // InternalKlangParser.g:364:1: ruleForeverLoop EOF
            {
             before(grammarAccess.getForeverLoopRule()); 
            pushFollow(FOLLOW_1);
            ruleForeverLoop();

            state._fsp--;

             after(grammarAccess.getForeverLoopRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForeverLoop"


    // $ANTLR start "ruleForeverLoop"
    // InternalKlangParser.g:371:1: ruleForeverLoop : ( ( rule__ForeverLoop__Group__0 ) ) ;
    public final void ruleForeverLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:375:2: ( ( ( rule__ForeverLoop__Group__0 ) ) )
            // InternalKlangParser.g:376:2: ( ( rule__ForeverLoop__Group__0 ) )
            {
            // InternalKlangParser.g:376:2: ( ( rule__ForeverLoop__Group__0 ) )
            // InternalKlangParser.g:377:3: ( rule__ForeverLoop__Group__0 )
            {
             before(grammarAccess.getForeverLoopAccess().getGroup()); 
            // InternalKlangParser.g:378:3: ( rule__ForeverLoop__Group__0 )
            // InternalKlangParser.g:378:4: rule__ForeverLoop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForeverLoop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForeverLoopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForeverLoop"


    // $ANTLR start "entryRuleVariable"
    // InternalKlangParser.g:387:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalKlangParser.g:388:1: ( ruleVariable EOF )
            // InternalKlangParser.g:389:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalKlangParser.g:396:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:400:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalKlangParser.g:401:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalKlangParser.g:401:2: ( ( rule__Variable__Group__0 ) )
            // InternalKlangParser.g:402:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalKlangParser.g:403:3: ( rule__Variable__Group__0 )
            // InternalKlangParser.g:403:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleVariableAssignment"
    // InternalKlangParser.g:412:1: entryRuleVariableAssignment : ruleVariableAssignment EOF ;
    public final void entryRuleVariableAssignment() throws RecognitionException {
        try {
            // InternalKlangParser.g:413:1: ( ruleVariableAssignment EOF )
            // InternalKlangParser.g:414:1: ruleVariableAssignment EOF
            {
             before(grammarAccess.getVariableAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableAssignment();

            state._fsp--;

             after(grammarAccess.getVariableAssignmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableAssignment"


    // $ANTLR start "ruleVariableAssignment"
    // InternalKlangParser.g:421:1: ruleVariableAssignment : ( ( rule__VariableAssignment__Group__0 ) ) ;
    public final void ruleVariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:425:2: ( ( ( rule__VariableAssignment__Group__0 ) ) )
            // InternalKlangParser.g:426:2: ( ( rule__VariableAssignment__Group__0 ) )
            {
            // InternalKlangParser.g:426:2: ( ( rule__VariableAssignment__Group__0 ) )
            // InternalKlangParser.g:427:3: ( rule__VariableAssignment__Group__0 )
            {
             before(grammarAccess.getVariableAssignmentAccess().getGroup()); 
            // InternalKlangParser.g:428:3: ( rule__VariableAssignment__Group__0 )
            // InternalKlangParser.g:428:4: rule__VariableAssignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableAssignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableAssignment"


    // $ANTLR start "entryRuleSleep"
    // InternalKlangParser.g:437:1: entryRuleSleep : ruleSleep EOF ;
    public final void entryRuleSleep() throws RecognitionException {
        try {
            // InternalKlangParser.g:438:1: ( ruleSleep EOF )
            // InternalKlangParser.g:439:1: ruleSleep EOF
            {
             before(grammarAccess.getSleepRule()); 
            pushFollow(FOLLOW_1);
            ruleSleep();

            state._fsp--;

             after(grammarAccess.getSleepRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSleep"


    // $ANTLR start "ruleSleep"
    // InternalKlangParser.g:446:1: ruleSleep : ( ( rule__Sleep__Group__0 ) ) ;
    public final void ruleSleep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:450:2: ( ( ( rule__Sleep__Group__0 ) ) )
            // InternalKlangParser.g:451:2: ( ( rule__Sleep__Group__0 ) )
            {
            // InternalKlangParser.g:451:2: ( ( rule__Sleep__Group__0 ) )
            // InternalKlangParser.g:452:3: ( rule__Sleep__Group__0 )
            {
             before(grammarAccess.getSleepAccess().getGroup()); 
            // InternalKlangParser.g:453:3: ( rule__Sleep__Group__0 )
            // InternalKlangParser.g:453:4: rule__Sleep__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sleep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSleepAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSleep"


    // $ANTLR start "entryRuleExpression"
    // InternalKlangParser.g:462:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalKlangParser.g:463:1: ( ruleExpression EOF )
            // InternalKlangParser.g:464:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalKlangParser.g:471:1: ruleExpression : ( ruleOr ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:475:2: ( ( ruleOr ) )
            // InternalKlangParser.g:476:2: ( ruleOr )
            {
            // InternalKlangParser.g:476:2: ( ruleOr )
            // InternalKlangParser.g:477:3: ruleOr
            {
             before(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // InternalKlangParser.g:487:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalKlangParser.g:488:1: ( ruleOr EOF )
            // InternalKlangParser.g:489:1: ruleOr EOF
            {
             before(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getOrRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalKlangParser.g:496:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:500:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalKlangParser.g:501:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalKlangParser.g:501:2: ( ( rule__Or__Group__0 ) )
            // InternalKlangParser.g:502:3: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // InternalKlangParser.g:503:3: ( rule__Or__Group__0 )
            // InternalKlangParser.g:503:4: rule__Or__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalKlangParser.g:512:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalKlangParser.g:513:1: ( ruleAnd EOF )
            // InternalKlangParser.g:514:1: ruleAnd EOF
            {
             before(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getAndRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalKlangParser.g:521:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:525:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalKlangParser.g:526:2: ( ( rule__And__Group__0 ) )
            {
            // InternalKlangParser.g:526:2: ( ( rule__And__Group__0 ) )
            // InternalKlangParser.g:527:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalKlangParser.g:528:3: ( rule__And__Group__0 )
            // InternalKlangParser.g:528:4: rule__And__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRulePlus"
    // InternalKlangParser.g:537:1: entryRulePlus : rulePlus EOF ;
    public final void entryRulePlus() throws RecognitionException {
        try {
            // InternalKlangParser.g:538:1: ( rulePlus EOF )
            // InternalKlangParser.g:539:1: rulePlus EOF
            {
             before(grammarAccess.getPlusRule()); 
            pushFollow(FOLLOW_1);
            rulePlus();

            state._fsp--;

             after(grammarAccess.getPlusRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlus"


    // $ANTLR start "rulePlus"
    // InternalKlangParser.g:546:1: rulePlus : ( ( rule__Plus__Group__0 ) ) ;
    public final void rulePlus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:550:2: ( ( ( rule__Plus__Group__0 ) ) )
            // InternalKlangParser.g:551:2: ( ( rule__Plus__Group__0 ) )
            {
            // InternalKlangParser.g:551:2: ( ( rule__Plus__Group__0 ) )
            // InternalKlangParser.g:552:3: ( rule__Plus__Group__0 )
            {
             before(grammarAccess.getPlusAccess().getGroup()); 
            // InternalKlangParser.g:553:3: ( rule__Plus__Group__0 )
            // InternalKlangParser.g:553:4: rule__Plus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Plus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlusAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlus"


    // $ANTLR start "entryRuleMinus"
    // InternalKlangParser.g:562:1: entryRuleMinus : ruleMinus EOF ;
    public final void entryRuleMinus() throws RecognitionException {
        try {
            // InternalKlangParser.g:563:1: ( ruleMinus EOF )
            // InternalKlangParser.g:564:1: ruleMinus EOF
            {
             before(grammarAccess.getMinusRule()); 
            pushFollow(FOLLOW_1);
            ruleMinus();

            state._fsp--;

             after(grammarAccess.getMinusRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMinus"


    // $ANTLR start "ruleMinus"
    // InternalKlangParser.g:571:1: ruleMinus : ( ( rule__Minus__Group__0 ) ) ;
    public final void ruleMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:575:2: ( ( ( rule__Minus__Group__0 ) ) )
            // InternalKlangParser.g:576:2: ( ( rule__Minus__Group__0 ) )
            {
            // InternalKlangParser.g:576:2: ( ( rule__Minus__Group__0 ) )
            // InternalKlangParser.g:577:3: ( rule__Minus__Group__0 )
            {
             before(grammarAccess.getMinusAccess().getGroup()); 
            // InternalKlangParser.g:578:3: ( rule__Minus__Group__0 )
            // InternalKlangParser.g:578:4: rule__Minus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Minus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMinusAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMinus"


    // $ANTLR start "entryRuleMultiply"
    // InternalKlangParser.g:587:1: entryRuleMultiply : ruleMultiply EOF ;
    public final void entryRuleMultiply() throws RecognitionException {
        try {
            // InternalKlangParser.g:588:1: ( ruleMultiply EOF )
            // InternalKlangParser.g:589:1: ruleMultiply EOF
            {
             before(grammarAccess.getMultiplyRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiply();

            state._fsp--;

             after(grammarAccess.getMultiplyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiply"


    // $ANTLR start "ruleMultiply"
    // InternalKlangParser.g:596:1: ruleMultiply : ( ( rule__Multiply__Group__0 ) ) ;
    public final void ruleMultiply() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:600:2: ( ( ( rule__Multiply__Group__0 ) ) )
            // InternalKlangParser.g:601:2: ( ( rule__Multiply__Group__0 ) )
            {
            // InternalKlangParser.g:601:2: ( ( rule__Multiply__Group__0 ) )
            // InternalKlangParser.g:602:3: ( rule__Multiply__Group__0 )
            {
             before(grammarAccess.getMultiplyAccess().getGroup()); 
            // InternalKlangParser.g:603:3: ( rule__Multiply__Group__0 )
            // InternalKlangParser.g:603:4: rule__Multiply__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiply__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiply"


    // $ANTLR start "entryRuleDivide"
    // InternalKlangParser.g:612:1: entryRuleDivide : ruleDivide EOF ;
    public final void entryRuleDivide() throws RecognitionException {
        try {
            // InternalKlangParser.g:613:1: ( ruleDivide EOF )
            // InternalKlangParser.g:614:1: ruleDivide EOF
            {
             before(grammarAccess.getDivideRule()); 
            pushFollow(FOLLOW_1);
            ruleDivide();

            state._fsp--;

             after(grammarAccess.getDivideRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDivide"


    // $ANTLR start "ruleDivide"
    // InternalKlangParser.g:621:1: ruleDivide : ( ( rule__Divide__Group__0 ) ) ;
    public final void ruleDivide() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:625:2: ( ( ( rule__Divide__Group__0 ) ) )
            // InternalKlangParser.g:626:2: ( ( rule__Divide__Group__0 ) )
            {
            // InternalKlangParser.g:626:2: ( ( rule__Divide__Group__0 ) )
            // InternalKlangParser.g:627:3: ( rule__Divide__Group__0 )
            {
             before(grammarAccess.getDivideAccess().getGroup()); 
            // InternalKlangParser.g:628:3: ( rule__Divide__Group__0 )
            // InternalKlangParser.g:628:4: rule__Divide__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Divide__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDivideAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDivide"


    // $ANTLR start "entryRuleComparison"
    // InternalKlangParser.g:637:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalKlangParser.g:638:1: ( ruleComparison EOF )
            // InternalKlangParser.g:639:1: ruleComparison EOF
            {
             before(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getComparisonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalKlangParser.g:646:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:650:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalKlangParser.g:651:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalKlangParser.g:651:2: ( ( rule__Comparison__Group__0 ) )
            // InternalKlangParser.g:652:3: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // InternalKlangParser.g:653:3: ( rule__Comparison__Group__0 )
            // InternalKlangParser.g:653:4: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalKlangParser.g:662:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // InternalKlangParser.g:663:1: ( ruleFunctionCall EOF )
            // InternalKlangParser.g:664:1: ruleFunctionCall EOF
            {
             before(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionCall();

            state._fsp--;

             after(grammarAccess.getFunctionCallRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalKlangParser.g:671:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:675:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // InternalKlangParser.g:676:2: ( ( rule__FunctionCall__Group__0 ) )
            {
            // InternalKlangParser.g:676:2: ( ( rule__FunctionCall__Group__0 ) )
            // InternalKlangParser.g:677:3: ( rule__FunctionCall__Group__0 )
            {
             before(grammarAccess.getFunctionCallAccess().getGroup()); 
            // InternalKlangParser.g:678:3: ( rule__FunctionCall__Group__0 )
            // InternalKlangParser.g:678:4: rule__FunctionCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalKlangParser.g:687:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalKlangParser.g:688:1: ( rulePrimaryExpression EOF )
            // InternalKlangParser.g:689:1: rulePrimaryExpression EOF
            {
             before(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalKlangParser.g:696:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:700:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalKlangParser.g:701:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalKlangParser.g:701:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalKlangParser.g:702:3: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // InternalKlangParser.g:703:3: ( rule__PrimaryExpression__Alternatives )
            // InternalKlangParser.g:703:4: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalKlangParser.g:712:1: entryRuleAtomicExpression : ruleAtomicExpression EOF ;
    public final void entryRuleAtomicExpression() throws RecognitionException {
        try {
            // InternalKlangParser.g:713:1: ( ruleAtomicExpression EOF )
            // InternalKlangParser.g:714:1: ruleAtomicExpression EOF
            {
             before(grammarAccess.getAtomicExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAtomicExpression();

            state._fsp--;

             after(grammarAccess.getAtomicExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtomicExpression"


    // $ANTLR start "ruleAtomicExpression"
    // InternalKlangParser.g:721:1: ruleAtomicExpression : ( ( rule__AtomicExpression__Alternatives ) ) ;
    public final void ruleAtomicExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:725:2: ( ( ( rule__AtomicExpression__Alternatives ) ) )
            // InternalKlangParser.g:726:2: ( ( rule__AtomicExpression__Alternatives ) )
            {
            // InternalKlangParser.g:726:2: ( ( rule__AtomicExpression__Alternatives ) )
            // InternalKlangParser.g:727:3: ( rule__AtomicExpression__Alternatives )
            {
             before(grammarAccess.getAtomicExpressionAccess().getAlternatives()); 
            // InternalKlangParser.g:728:3: ( rule__AtomicExpression__Alternatives )
            // InternalKlangParser.g:728:4: rule__AtomicExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AtomicExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomicExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomicExpression"


    // $ANTLR start "rule__Entity__Alternatives"
    // InternalKlangParser.g:736:1: rule__Entity__Alternatives : ( ( ( rule__Entity__Group_0__0 ) ) | ( ( rule__Entity__Group_1__0 ) ) );
    public final void rule__Entity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:740:1: ( ( ( rule__Entity__Group_0__0 ) ) | ( ( rule__Entity__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Sprite) ) {
                alt1=1;
            }
            else if ( (LA1_0==Scene) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalKlangParser.g:741:2: ( ( rule__Entity__Group_0__0 ) )
                    {
                    // InternalKlangParser.g:741:2: ( ( rule__Entity__Group_0__0 ) )
                    // InternalKlangParser.g:742:3: ( rule__Entity__Group_0__0 )
                    {
                     before(grammarAccess.getEntityAccess().getGroup_0()); 
                    // InternalKlangParser.g:743:3: ( rule__Entity__Group_0__0 )
                    // InternalKlangParser.g:743:4: rule__Entity__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntityAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKlangParser.g:747:2: ( ( rule__Entity__Group_1__0 ) )
                    {
                    // InternalKlangParser.g:747:2: ( ( rule__Entity__Group_1__0 ) )
                    // InternalKlangParser.g:748:3: ( rule__Entity__Group_1__0 )
                    {
                     before(grammarAccess.getEntityAccess().getGroup_1()); 
                    // InternalKlangParser.g:749:3: ( rule__Entity__Group_1__0 )
                    // InternalKlangParser.g:749:4: rule__Entity__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntityAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Alternatives"


    // $ANTLR start "rule__EventHandler__Alternatives"
    // InternalKlangParser.g:757:1: rule__EventHandler__Alternatives : ( ( ruleGameStart ) | ( ruleSpriteClicked ) | ( ruleKeyPressed ) | ( ruleCollidesWith ) );
    public final void rule__EventHandler__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:761:1: ( ( ruleGameStart ) | ( ruleSpriteClicked ) | ( ruleKeyPressed ) | ( ruleCollidesWith ) )
            int alt2=4;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==When) ) {
                switch ( input.LA(2) ) {
                case Game:
                    {
                    alt2=1;
                    }
                    break;
                case Collides:
                    {
                    alt2=4;
                    }
                    break;
                case RULE_UPPERCASE:
                    {
                    alt2=3;
                    }
                    break;
                case Clicked:
                    {
                    alt2=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalKlangParser.g:762:2: ( ruleGameStart )
                    {
                    // InternalKlangParser.g:762:2: ( ruleGameStart )
                    // InternalKlangParser.g:763:3: ruleGameStart
                    {
                     before(grammarAccess.getEventHandlerAccess().getGameStartParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGameStart();

                    state._fsp--;

                     after(grammarAccess.getEventHandlerAccess().getGameStartParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKlangParser.g:768:2: ( ruleSpriteClicked )
                    {
                    // InternalKlangParser.g:768:2: ( ruleSpriteClicked )
                    // InternalKlangParser.g:769:3: ruleSpriteClicked
                    {
                     before(grammarAccess.getEventHandlerAccess().getSpriteClickedParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSpriteClicked();

                    state._fsp--;

                     after(grammarAccess.getEventHandlerAccess().getSpriteClickedParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKlangParser.g:774:2: ( ruleKeyPressed )
                    {
                    // InternalKlangParser.g:774:2: ( ruleKeyPressed )
                    // InternalKlangParser.g:775:3: ruleKeyPressed
                    {
                     before(grammarAccess.getEventHandlerAccess().getKeyPressedParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleKeyPressed();

                    state._fsp--;

                     after(grammarAccess.getEventHandlerAccess().getKeyPressedParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalKlangParser.g:780:2: ( ruleCollidesWith )
                    {
                    // InternalKlangParser.g:780:2: ( ruleCollidesWith )
                    // InternalKlangParser.g:781:3: ruleCollidesWith
                    {
                     before(grammarAccess.getEventHandlerAccess().getCollidesWithParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCollidesWith();

                    state._fsp--;

                     after(grammarAccess.getEventHandlerAccess().getCollidesWithParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventHandler__Alternatives"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalKlangParser.g:790:1: rule__Statement__Alternatives : ( ( ruleWhileLoop ) | ( ruleIf ) | ( ruleVariableAssignment ) | ( ruleForeverLoop ) | ( ruleFunctionCall ) | ( ruleSleep ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:794:1: ( ( ruleWhileLoop ) | ( ruleIf ) | ( ruleVariableAssignment ) | ( ruleForeverLoop ) | ( ruleFunctionCall ) | ( ruleSleep ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case While:
                {
                alt3=1;
                }
                break;
            case If:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==EqualsSign) ) {
                    alt3=3;
                }
                else if ( (LA3_3==LeftParenthesis) ) {
                    alt3=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case Forever:
                {
                alt3=4;
                }
                break;
            case Sleep:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalKlangParser.g:795:2: ( ruleWhileLoop )
                    {
                    // InternalKlangParser.g:795:2: ( ruleWhileLoop )
                    // InternalKlangParser.g:796:3: ruleWhileLoop
                    {
                     before(grammarAccess.getStatementAccess().getWhileLoopParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWhileLoop();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getWhileLoopParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKlangParser.g:801:2: ( ruleIf )
                    {
                    // InternalKlangParser.g:801:2: ( ruleIf )
                    // InternalKlangParser.g:802:3: ruleIf
                    {
                     before(grammarAccess.getStatementAccess().getIfParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIf();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getIfParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKlangParser.g:807:2: ( ruleVariableAssignment )
                    {
                    // InternalKlangParser.g:807:2: ( ruleVariableAssignment )
                    // InternalKlangParser.g:808:3: ruleVariableAssignment
                    {
                     before(grammarAccess.getStatementAccess().getVariableAssignmentParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableAssignment();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getVariableAssignmentParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalKlangParser.g:813:2: ( ruleForeverLoop )
                    {
                    // InternalKlangParser.g:813:2: ( ruleForeverLoop )
                    // InternalKlangParser.g:814:3: ruleForeverLoop
                    {
                     before(grammarAccess.getStatementAccess().getForeverLoopParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleForeverLoop();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getForeverLoopParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalKlangParser.g:819:2: ( ruleFunctionCall )
                    {
                    // InternalKlangParser.g:819:2: ( ruleFunctionCall )
                    // InternalKlangParser.g:820:3: ruleFunctionCall
                    {
                     before(grammarAccess.getStatementAccess().getFunctionCallParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleFunctionCall();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getFunctionCallParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalKlangParser.g:825:2: ( ruleSleep )
                    {
                    // InternalKlangParser.g:825:2: ( ruleSleep )
                    // InternalKlangParser.g:826:3: ruleSleep
                    {
                     before(grammarAccess.getStatementAccess().getSleepParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleSleep();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSleepParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Comparison__Alternatives_1_0"
    // InternalKlangParser.g:835:1: rule__Comparison__Alternatives_1_0 : ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) | ( ( rule__Comparison__Group_1_0_2__0 ) ) );
    public final void rule__Comparison__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:839:1: ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) | ( ( rule__Comparison__Group_1_0_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case LessThanSign:
                {
                alt4=1;
                }
                break;
            case EqualsSignEqualsSign:
                {
                alt4=2;
                }
                break;
            case GreaterThanSign:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalKlangParser.g:840:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    {
                    // InternalKlangParser.g:840:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    // InternalKlangParser.g:841:3: ( rule__Comparison__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0_0()); 
                    // InternalKlangParser.g:842:3: ( rule__Comparison__Group_1_0_0__0 )
                    // InternalKlangParser.g:842:4: rule__Comparison__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKlangParser.g:846:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    {
                    // InternalKlangParser.g:846:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    // InternalKlangParser.g:847:3: ( rule__Comparison__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0_1()); 
                    // InternalKlangParser.g:848:3: ( rule__Comparison__Group_1_0_1__0 )
                    // InternalKlangParser.g:848:4: rule__Comparison__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKlangParser.g:852:2: ( ( rule__Comparison__Group_1_0_2__0 ) )
                    {
                    // InternalKlangParser.g:852:2: ( ( rule__Comparison__Group_1_0_2__0 ) )
                    // InternalKlangParser.g:853:3: ( rule__Comparison__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0_2()); 
                    // InternalKlangParser.g:854:3: ( rule__Comparison__Group_1_0_2__0 )
                    // InternalKlangParser.g:854:4: rule__Comparison__Group_1_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonAccess().getGroup_1_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Alternatives_1_0"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // InternalKlangParser.g:862:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ruleFunctionCall ) | ( ruleAtomicExpression ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:866:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ruleFunctionCall ) | ( ruleAtomicExpression ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt5=1;
                }
                break;
            case Not:
                {
                alt5=2;
                }
                break;
            case RULE_ID:
                {
                int LA5_3 = input.LA(2);

                if ( (LA5_3==LeftParenthesis) ) {
                    alt5=3;
                }
                else if ( (LA5_3==EOF||LA5_3==Forever||LA5_3==Sprite||(LA5_3>=Scene && LA5_3<=While)||LA5_3==When||LA5_3==And||(LA5_3>=Var && LA5_3<=Or)||(LA5_3>=RightParenthesis && LA5_3<=LessThanSign)||(LA5_3>=GreaterThanSign && LA5_3<=RULE_END)||LA5_3==RULE_ID) ) {
                    alt5=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;
                }
                }
                break;
            case False:
            case True:
            case RULE_DECIMAL:
            case RULE_STRING:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalKlangParser.g:867:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // InternalKlangParser.g:867:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // InternalKlangParser.g:868:3: ( rule__PrimaryExpression__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    // InternalKlangParser.g:869:3: ( rule__PrimaryExpression__Group_0__0 )
                    // InternalKlangParser.g:869:4: rule__PrimaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKlangParser.g:873:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    {
                    // InternalKlangParser.g:873:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    // InternalKlangParser.g:874:3: ( rule__PrimaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
                    // InternalKlangParser.g:875:3: ( rule__PrimaryExpression__Group_1__0 )
                    // InternalKlangParser.g:875:4: rule__PrimaryExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKlangParser.g:879:2: ( ruleFunctionCall )
                    {
                    // InternalKlangParser.g:879:2: ( ruleFunctionCall )
                    // InternalKlangParser.g:880:3: ruleFunctionCall
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getFunctionCallParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFunctionCall();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getFunctionCallParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalKlangParser.g:885:2: ( ruleAtomicExpression )
                    {
                    // InternalKlangParser.g:885:2: ( ruleAtomicExpression )
                    // InternalKlangParser.g:886:3: ruleAtomicExpression
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getAtomicExpressionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleAtomicExpression();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getAtomicExpressionParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__AtomicExpression__Alternatives"
    // InternalKlangParser.g:895:1: rule__AtomicExpression__Alternatives : ( ( ( rule__AtomicExpression__Group_0__0 ) ) | ( ( rule__AtomicExpression__Group_1__0 ) ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:899:1: ( ( ( rule__AtomicExpression__Group_0__0 ) ) | ( ( rule__AtomicExpression__Group_1__0 ) ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case False:
            case True:
                {
                alt6=1;
                }
                break;
            case RULE_DECIMAL:
                {
                alt6=2;
                }
                break;
            case RULE_STRING:
                {
                alt6=3;
                }
                break;
            case RULE_ID:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalKlangParser.g:900:2: ( ( rule__AtomicExpression__Group_0__0 ) )
                    {
                    // InternalKlangParser.g:900:2: ( ( rule__AtomicExpression__Group_0__0 ) )
                    // InternalKlangParser.g:901:3: ( rule__AtomicExpression__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getGroup_0()); 
                    // InternalKlangParser.g:902:3: ( rule__AtomicExpression__Group_0__0 )
                    // InternalKlangParser.g:902:4: rule__AtomicExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKlangParser.g:906:2: ( ( rule__AtomicExpression__Group_1__0 ) )
                    {
                    // InternalKlangParser.g:906:2: ( ( rule__AtomicExpression__Group_1__0 ) )
                    // InternalKlangParser.g:907:3: ( rule__AtomicExpression__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getGroup_1()); 
                    // InternalKlangParser.g:908:3: ( rule__AtomicExpression__Group_1__0 )
                    // InternalKlangParser.g:908:4: rule__AtomicExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKlangParser.g:912:2: ( ( rule__AtomicExpression__Group_2__0 ) )
                    {
                    // InternalKlangParser.g:912:2: ( ( rule__AtomicExpression__Group_2__0 ) )
                    // InternalKlangParser.g:913:3: ( rule__AtomicExpression__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getGroup_2()); 
                    // InternalKlangParser.g:914:3: ( rule__AtomicExpression__Group_2__0 )
                    // InternalKlangParser.g:914:4: rule__AtomicExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicExpression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalKlangParser.g:918:2: ( ( rule__AtomicExpression__Group_3__0 ) )
                    {
                    // InternalKlangParser.g:918:2: ( ( rule__AtomicExpression__Group_3__0 ) )
                    // InternalKlangParser.g:919:3: ( rule__AtomicExpression__Group_3__0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getGroup_3()); 
                    // InternalKlangParser.g:920:3: ( rule__AtomicExpression__Group_3__0 )
                    // InternalKlangParser.g:920:4: rule__AtomicExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicExpression__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicExpressionAccess().getGroup_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Alternatives"


    // $ANTLR start "rule__AtomicExpression__Alternatives_0_1"
    // InternalKlangParser.g:928:1: rule__AtomicExpression__Alternatives_0_1 : ( ( ( rule__AtomicExpression__ValueAssignment_0_1_0 ) ) | ( False ) );
    public final void rule__AtomicExpression__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:932:1: ( ( ( rule__AtomicExpression__ValueAssignment_0_1_0 ) ) | ( False ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==True) ) {
                alt7=1;
            }
            else if ( (LA7_0==False) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalKlangParser.g:933:2: ( ( rule__AtomicExpression__ValueAssignment_0_1_0 ) )
                    {
                    // InternalKlangParser.g:933:2: ( ( rule__AtomicExpression__ValueAssignment_0_1_0 ) )
                    // InternalKlangParser.g:934:3: ( rule__AtomicExpression__ValueAssignment_0_1_0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getValueAssignment_0_1_0()); 
                    // InternalKlangParser.g:935:3: ( rule__AtomicExpression__ValueAssignment_0_1_0 )
                    // InternalKlangParser.g:935:4: rule__AtomicExpression__ValueAssignment_0_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicExpression__ValueAssignment_0_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicExpressionAccess().getValueAssignment_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKlangParser.g:939:2: ( False )
                    {
                    // InternalKlangParser.g:939:2: ( False )
                    // InternalKlangParser.g:940:3: False
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getFalseKeyword_0_1_1()); 
                    match(input,False,FOLLOW_2); 
                     after(grammarAccess.getAtomicExpressionAccess().getFalseKeyword_0_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Alternatives_0_1"


    // $ANTLR start "rule__Game__Group__0"
    // InternalKlangParser.g:949:1: rule__Game__Group__0 : rule__Game__Group__0__Impl rule__Game__Group__1 ;
    public final void rule__Game__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:953:1: ( rule__Game__Group__0__Impl rule__Game__Group__1 )
            // InternalKlangParser.g:954:2: rule__Game__Group__0__Impl rule__Game__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Game__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__0"


    // $ANTLR start "rule__Game__Group__0__Impl"
    // InternalKlangParser.g:961:1: rule__Game__Group__0__Impl : ( () ) ;
    public final void rule__Game__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:965:1: ( ( () ) )
            // InternalKlangParser.g:966:1: ( () )
            {
            // InternalKlangParser.g:966:1: ( () )
            // InternalKlangParser.g:967:2: ()
            {
             before(grammarAccess.getGameAccess().getGameAction_0()); 
            // InternalKlangParser.g:968:2: ()
            // InternalKlangParser.g:968:3: 
            {
            }

             after(grammarAccess.getGameAccess().getGameAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__0__Impl"


    // $ANTLR start "rule__Game__Group__1"
    // InternalKlangParser.g:976:1: rule__Game__Group__1 : rule__Game__Group__1__Impl rule__Game__Group__2 ;
    public final void rule__Game__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:980:1: ( rule__Game__Group__1__Impl rule__Game__Group__2 )
            // InternalKlangParser.g:981:2: rule__Game__Group__1__Impl rule__Game__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Game__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__1"


    // $ANTLR start "rule__Game__Group__1__Impl"
    // InternalKlangParser.g:988:1: rule__Game__Group__1__Impl : ( ( rule__Game__GlobalVariablesAssignment_1 )* ) ;
    public final void rule__Game__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:992:1: ( ( ( rule__Game__GlobalVariablesAssignment_1 )* ) )
            // InternalKlangParser.g:993:1: ( ( rule__Game__GlobalVariablesAssignment_1 )* )
            {
            // InternalKlangParser.g:993:1: ( ( rule__Game__GlobalVariablesAssignment_1 )* )
            // InternalKlangParser.g:994:2: ( rule__Game__GlobalVariablesAssignment_1 )*
            {
             before(grammarAccess.getGameAccess().getGlobalVariablesAssignment_1()); 
            // InternalKlangParser.g:995:2: ( rule__Game__GlobalVariablesAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Var) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKlangParser.g:995:3: rule__Game__GlobalVariablesAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Game__GlobalVariablesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getGameAccess().getGlobalVariablesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__1__Impl"


    // $ANTLR start "rule__Game__Group__2"
    // InternalKlangParser.g:1003:1: rule__Game__Group__2 : rule__Game__Group__2__Impl ;
    public final void rule__Game__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1007:1: ( rule__Game__Group__2__Impl )
            // InternalKlangParser.g:1008:2: rule__Game__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__2"


    // $ANTLR start "rule__Game__Group__2__Impl"
    // InternalKlangParser.g:1014:1: rule__Game__Group__2__Impl : ( ( rule__Game__ActorsAssignment_2 )* ) ;
    public final void rule__Game__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1018:1: ( ( ( rule__Game__ActorsAssignment_2 )* ) )
            // InternalKlangParser.g:1019:1: ( ( rule__Game__ActorsAssignment_2 )* )
            {
            // InternalKlangParser.g:1019:1: ( ( rule__Game__ActorsAssignment_2 )* )
            // InternalKlangParser.g:1020:2: ( rule__Game__ActorsAssignment_2 )*
            {
             before(grammarAccess.getGameAccess().getActorsAssignment_2()); 
            // InternalKlangParser.g:1021:2: ( rule__Game__ActorsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Sprite||LA9_0==Scene) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalKlangParser.g:1021:3: rule__Game__ActorsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Game__ActorsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getGameAccess().getActorsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__2__Impl"


    // $ANTLR start "rule__Actor__Group__0"
    // InternalKlangParser.g:1030:1: rule__Actor__Group__0 : rule__Actor__Group__0__Impl rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1034:1: ( rule__Actor__Group__0__Impl rule__Actor__Group__1 )
            // InternalKlangParser.g:1035:2: rule__Actor__Group__0__Impl rule__Actor__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Actor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__0"


    // $ANTLR start "rule__Actor__Group__0__Impl"
    // InternalKlangParser.g:1042:1: rule__Actor__Group__0__Impl : ( () ) ;
    public final void rule__Actor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1046:1: ( ( () ) )
            // InternalKlangParser.g:1047:1: ( () )
            {
            // InternalKlangParser.g:1047:1: ( () )
            // InternalKlangParser.g:1048:2: ()
            {
             before(grammarAccess.getActorAccess().getActorAction_0()); 
            // InternalKlangParser.g:1049:2: ()
            // InternalKlangParser.g:1049:3: 
            {
            }

             after(grammarAccess.getActorAccess().getActorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__0__Impl"


    // $ANTLR start "rule__Actor__Group__1"
    // InternalKlangParser.g:1057:1: rule__Actor__Group__1 : rule__Actor__Group__1__Impl rule__Actor__Group__2 ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1061:1: ( rule__Actor__Group__1__Impl rule__Actor__Group__2 )
            // InternalKlangParser.g:1062:2: rule__Actor__Group__1__Impl rule__Actor__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Actor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__1"


    // $ANTLR start "rule__Actor__Group__1__Impl"
    // InternalKlangParser.g:1069:1: rule__Actor__Group__1__Impl : ( ( rule__Actor__EntityAssignment_1 ) ) ;
    public final void rule__Actor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1073:1: ( ( ( rule__Actor__EntityAssignment_1 ) ) )
            // InternalKlangParser.g:1074:1: ( ( rule__Actor__EntityAssignment_1 ) )
            {
            // InternalKlangParser.g:1074:1: ( ( rule__Actor__EntityAssignment_1 ) )
            // InternalKlangParser.g:1075:2: ( rule__Actor__EntityAssignment_1 )
            {
             before(grammarAccess.getActorAccess().getEntityAssignment_1()); 
            // InternalKlangParser.g:1076:2: ( rule__Actor__EntityAssignment_1 )
            // InternalKlangParser.g:1076:3: rule__Actor__EntityAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Actor__EntityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getEntityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__1__Impl"


    // $ANTLR start "rule__Actor__Group__2"
    // InternalKlangParser.g:1084:1: rule__Actor__Group__2 : rule__Actor__Group__2__Impl rule__Actor__Group__3 ;
    public final void rule__Actor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1088:1: ( rule__Actor__Group__2__Impl rule__Actor__Group__3 )
            // InternalKlangParser.g:1089:2: rule__Actor__Group__2__Impl rule__Actor__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Actor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__2"


    // $ANTLR start "rule__Actor__Group__2__Impl"
    // InternalKlangParser.g:1096:1: rule__Actor__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__Actor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1100:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:1101:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:1101:1: ( RULE_BEGIN )
            // InternalKlangParser.g:1102:2: RULE_BEGIN
            {
             before(grammarAccess.getActorAccess().getBEGINTerminalRuleCall_2()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getBEGINTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__2__Impl"


    // $ANTLR start "rule__Actor__Group__3"
    // InternalKlangParser.g:1111:1: rule__Actor__Group__3 : rule__Actor__Group__3__Impl rule__Actor__Group__4 ;
    public final void rule__Actor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1115:1: ( rule__Actor__Group__3__Impl rule__Actor__Group__4 )
            // InternalKlangParser.g:1116:2: rule__Actor__Group__3__Impl rule__Actor__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Actor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__3"


    // $ANTLR start "rule__Actor__Group__3__Impl"
    // InternalKlangParser.g:1123:1: rule__Actor__Group__3__Impl : ( ( rule__Actor__VariableDeclarationsAssignment_3 )* ) ;
    public final void rule__Actor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1127:1: ( ( ( rule__Actor__VariableDeclarationsAssignment_3 )* ) )
            // InternalKlangParser.g:1128:1: ( ( rule__Actor__VariableDeclarationsAssignment_3 )* )
            {
            // InternalKlangParser.g:1128:1: ( ( rule__Actor__VariableDeclarationsAssignment_3 )* )
            // InternalKlangParser.g:1129:2: ( rule__Actor__VariableDeclarationsAssignment_3 )*
            {
             before(grammarAccess.getActorAccess().getVariableDeclarationsAssignment_3()); 
            // InternalKlangParser.g:1130:2: ( rule__Actor__VariableDeclarationsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Var) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalKlangParser.g:1130:3: rule__Actor__VariableDeclarationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Actor__VariableDeclarationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getActorAccess().getVariableDeclarationsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__3__Impl"


    // $ANTLR start "rule__Actor__Group__4"
    // InternalKlangParser.g:1138:1: rule__Actor__Group__4 : rule__Actor__Group__4__Impl rule__Actor__Group__5 ;
    public final void rule__Actor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1142:1: ( rule__Actor__Group__4__Impl rule__Actor__Group__5 )
            // InternalKlangParser.g:1143:2: rule__Actor__Group__4__Impl rule__Actor__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Actor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__4"


    // $ANTLR start "rule__Actor__Group__4__Impl"
    // InternalKlangParser.g:1150:1: rule__Actor__Group__4__Impl : ( ( rule__Actor__EventHandlersAssignment_4 )* ) ;
    public final void rule__Actor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1154:1: ( ( ( rule__Actor__EventHandlersAssignment_4 )* ) )
            // InternalKlangParser.g:1155:1: ( ( rule__Actor__EventHandlersAssignment_4 )* )
            {
            // InternalKlangParser.g:1155:1: ( ( rule__Actor__EventHandlersAssignment_4 )* )
            // InternalKlangParser.g:1156:2: ( rule__Actor__EventHandlersAssignment_4 )*
            {
             before(grammarAccess.getActorAccess().getEventHandlersAssignment_4()); 
            // InternalKlangParser.g:1157:2: ( rule__Actor__EventHandlersAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==When) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalKlangParser.g:1157:3: rule__Actor__EventHandlersAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Actor__EventHandlersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getActorAccess().getEventHandlersAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__4__Impl"


    // $ANTLR start "rule__Actor__Group__5"
    // InternalKlangParser.g:1165:1: rule__Actor__Group__5 : rule__Actor__Group__5__Impl ;
    public final void rule__Actor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1169:1: ( rule__Actor__Group__5__Impl )
            // InternalKlangParser.g:1170:2: rule__Actor__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__5"


    // $ANTLR start "rule__Actor__Group__5__Impl"
    // InternalKlangParser.g:1176:1: rule__Actor__Group__5__Impl : ( RULE_END ) ;
    public final void rule__Actor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1180:1: ( ( RULE_END ) )
            // InternalKlangParser.g:1181:1: ( RULE_END )
            {
            // InternalKlangParser.g:1181:1: ( RULE_END )
            // InternalKlangParser.g:1182:2: RULE_END
            {
             before(grammarAccess.getActorAccess().getENDTerminalRuleCall_5()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getENDTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group_0__0"
    // InternalKlangParser.g:1192:1: rule__Entity__Group_0__0 : rule__Entity__Group_0__0__Impl rule__Entity__Group_0__1 ;
    public final void rule__Entity__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1196:1: ( rule__Entity__Group_0__0__Impl rule__Entity__Group_0__1 )
            // InternalKlangParser.g:1197:2: rule__Entity__Group_0__0__Impl rule__Entity__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__Entity__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_0__0"


    // $ANTLR start "rule__Entity__Group_0__0__Impl"
    // InternalKlangParser.g:1204:1: rule__Entity__Group_0__0__Impl : ( Sprite ) ;
    public final void rule__Entity__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1208:1: ( ( Sprite ) )
            // InternalKlangParser.g:1209:1: ( Sprite )
            {
            // InternalKlangParser.g:1209:1: ( Sprite )
            // InternalKlangParser.g:1210:2: Sprite
            {
             before(grammarAccess.getEntityAccess().getSpriteKeyword_0_0()); 
            match(input,Sprite,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getSpriteKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_0__0__Impl"


    // $ANTLR start "rule__Entity__Group_0__1"
    // InternalKlangParser.g:1219:1: rule__Entity__Group_0__1 : rule__Entity__Group_0__1__Impl rule__Entity__Group_0__2 ;
    public final void rule__Entity__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1223:1: ( rule__Entity__Group_0__1__Impl rule__Entity__Group_0__2 )
            // InternalKlangParser.g:1224:2: rule__Entity__Group_0__1__Impl rule__Entity__Group_0__2
            {
            pushFollow(FOLLOW_10);
            rule__Entity__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_0__1"


    // $ANTLR start "rule__Entity__Group_0__1__Impl"
    // InternalKlangParser.g:1231:1: rule__Entity__Group_0__1__Impl : ( () ) ;
    public final void rule__Entity__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1235:1: ( ( () ) )
            // InternalKlangParser.g:1236:1: ( () )
            {
            // InternalKlangParser.g:1236:1: ( () )
            // InternalKlangParser.g:1237:2: ()
            {
             before(grammarAccess.getEntityAccess().getSpriteEntityAction_0_1()); 
            // InternalKlangParser.g:1238:2: ()
            // InternalKlangParser.g:1238:3: 
            {
            }

             after(grammarAccess.getEntityAccess().getSpriteEntityAction_0_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_0__1__Impl"


    // $ANTLR start "rule__Entity__Group_0__2"
    // InternalKlangParser.g:1246:1: rule__Entity__Group_0__2 : rule__Entity__Group_0__2__Impl ;
    public final void rule__Entity__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1250:1: ( rule__Entity__Group_0__2__Impl )
            // InternalKlangParser.g:1251:2: rule__Entity__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_0__2"


    // $ANTLR start "rule__Entity__Group_0__2__Impl"
    // InternalKlangParser.g:1257:1: rule__Entity__Group_0__2__Impl : ( ( rule__Entity__NameAssignment_0_2 ) ) ;
    public final void rule__Entity__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1261:1: ( ( ( rule__Entity__NameAssignment_0_2 ) ) )
            // InternalKlangParser.g:1262:1: ( ( rule__Entity__NameAssignment_0_2 ) )
            {
            // InternalKlangParser.g:1262:1: ( ( rule__Entity__NameAssignment_0_2 ) )
            // InternalKlangParser.g:1263:2: ( rule__Entity__NameAssignment_0_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_0_2()); 
            // InternalKlangParser.g:1264:2: ( rule__Entity__NameAssignment_0_2 )
            // InternalKlangParser.g:1264:3: rule__Entity__NameAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_0__2__Impl"


    // $ANTLR start "rule__Entity__Group_1__0"
    // InternalKlangParser.g:1273:1: rule__Entity__Group_1__0 : rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1 ;
    public final void rule__Entity__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1277:1: ( rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1 )
            // InternalKlangParser.g:1278:2: rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1
            {
            pushFollow(FOLLOW_1);
            rule__Entity__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_1__0"


    // $ANTLR start "rule__Entity__Group_1__0__Impl"
    // InternalKlangParser.g:1285:1: rule__Entity__Group_1__0__Impl : ( Scene ) ;
    public final void rule__Entity__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1289:1: ( ( Scene ) )
            // InternalKlangParser.g:1290:1: ( Scene )
            {
            // InternalKlangParser.g:1290:1: ( Scene )
            // InternalKlangParser.g:1291:2: Scene
            {
             before(grammarAccess.getEntityAccess().getSceneKeyword_1_0()); 
            match(input,Scene,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getSceneKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_1__0__Impl"


    // $ANTLR start "rule__Entity__Group_1__1"
    // InternalKlangParser.g:1300:1: rule__Entity__Group_1__1 : rule__Entity__Group_1__1__Impl ;
    public final void rule__Entity__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1304:1: ( rule__Entity__Group_1__1__Impl )
            // InternalKlangParser.g:1305:2: rule__Entity__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_1__1"


    // $ANTLR start "rule__Entity__Group_1__1__Impl"
    // InternalKlangParser.g:1311:1: rule__Entity__Group_1__1__Impl : ( () ) ;
    public final void rule__Entity__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1315:1: ( ( () ) )
            // InternalKlangParser.g:1316:1: ( () )
            {
            // InternalKlangParser.g:1316:1: ( () )
            // InternalKlangParser.g:1317:2: ()
            {
             before(grammarAccess.getEntityAccess().getSceneEntityAction_1_1()); 
            // InternalKlangParser.g:1318:2: ()
            // InternalKlangParser.g:1318:3: 
            {
            }

             after(grammarAccess.getEntityAccess().getSceneEntityAction_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_1__1__Impl"


    // $ANTLR start "rule__GameStart__Group__0"
    // InternalKlangParser.g:1327:1: rule__GameStart__Group__0 : rule__GameStart__Group__0__Impl rule__GameStart__Group__1 ;
    public final void rule__GameStart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1331:1: ( rule__GameStart__Group__0__Impl rule__GameStart__Group__1 )
            // InternalKlangParser.g:1332:2: rule__GameStart__Group__0__Impl rule__GameStart__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__GameStart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameStart__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameStart__Group__0"


    // $ANTLR start "rule__GameStart__Group__0__Impl"
    // InternalKlangParser.g:1339:1: rule__GameStart__Group__0__Impl : ( () ) ;
    public final void rule__GameStart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1343:1: ( ( () ) )
            // InternalKlangParser.g:1344:1: ( () )
            {
            // InternalKlangParser.g:1344:1: ( () )
            // InternalKlangParser.g:1345:2: ()
            {
             before(grammarAccess.getGameStartAccess().getGameStartAction_0()); 
            // InternalKlangParser.g:1346:2: ()
            // InternalKlangParser.g:1346:3: 
            {
            }

             after(grammarAccess.getGameStartAccess().getGameStartAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameStart__Group__0__Impl"


    // $ANTLR start "rule__GameStart__Group__1"
    // InternalKlangParser.g:1354:1: rule__GameStart__Group__1 : rule__GameStart__Group__1__Impl rule__GameStart__Group__2 ;
    public final void rule__GameStart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1358:1: ( rule__GameStart__Group__1__Impl rule__GameStart__Group__2 )
            // InternalKlangParser.g:1359:2: rule__GameStart__Group__1__Impl rule__GameStart__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__GameStart__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameStart__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameStart__Group__1"


    // $ANTLR start "rule__GameStart__Group__1__Impl"
    // InternalKlangParser.g:1366:1: rule__GameStart__Group__1__Impl : ( When ) ;
    public final void rule__GameStart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1370:1: ( ( When ) )
            // InternalKlangParser.g:1371:1: ( When )
            {
            // InternalKlangParser.g:1371:1: ( When )
            // InternalKlangParser.g:1372:2: When
            {
             before(grammarAccess.getGameStartAccess().getWhenKeyword_1()); 
            match(input,When,FOLLOW_2); 
             after(grammarAccess.getGameStartAccess().getWhenKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameStart__Group__1__Impl"


    // $ANTLR start "rule__GameStart__Group__2"
    // InternalKlangParser.g:1381:1: rule__GameStart__Group__2 : rule__GameStart__Group__2__Impl rule__GameStart__Group__3 ;
    public final void rule__GameStart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1385:1: ( rule__GameStart__Group__2__Impl rule__GameStart__Group__3 )
            // InternalKlangParser.g:1386:2: rule__GameStart__Group__2__Impl rule__GameStart__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__GameStart__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameStart__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameStart__Group__2"


    // $ANTLR start "rule__GameStart__Group__2__Impl"
    // InternalKlangParser.g:1393:1: rule__GameStart__Group__2__Impl : ( Game ) ;
    public final void rule__GameStart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1397:1: ( ( Game ) )
            // InternalKlangParser.g:1398:1: ( Game )
            {
            // InternalKlangParser.g:1398:1: ( Game )
            // InternalKlangParser.g:1399:2: Game
            {
             before(grammarAccess.getGameStartAccess().getGameKeyword_2()); 
            match(input,Game,FOLLOW_2); 
             after(grammarAccess.getGameStartAccess().getGameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameStart__Group__2__Impl"


    // $ANTLR start "rule__GameStart__Group__3"
    // InternalKlangParser.g:1408:1: rule__GameStart__Group__3 : rule__GameStart__Group__3__Impl rule__GameStart__Group__4 ;
    public final void rule__GameStart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1412:1: ( rule__GameStart__Group__3__Impl rule__GameStart__Group__4 )
            // InternalKlangParser.g:1413:2: rule__GameStart__Group__3__Impl rule__GameStart__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__GameStart__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameStart__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameStart__Group__3"


    // $ANTLR start "rule__GameStart__Group__3__Impl"
    // InternalKlangParser.g:1420:1: rule__GameStart__Group__3__Impl : ( Starts ) ;
    public final void rule__GameStart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1424:1: ( ( Starts ) )
            // InternalKlangParser.g:1425:1: ( Starts )
            {
            // InternalKlangParser.g:1425:1: ( Starts )
            // InternalKlangParser.g:1426:2: Starts
            {
             before(grammarAccess.getGameStartAccess().getStartsKeyword_3()); 
            match(input,Starts,FOLLOW_2); 
             after(grammarAccess.getGameStartAccess().getStartsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameStart__Group__3__Impl"


    // $ANTLR start "rule__GameStart__Group__4"
    // InternalKlangParser.g:1435:1: rule__GameStart__Group__4 : rule__GameStart__Group__4__Impl rule__GameStart__Group__5 ;
    public final void rule__GameStart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1439:1: ( rule__GameStart__Group__4__Impl rule__GameStart__Group__5 )
            // InternalKlangParser.g:1440:2: rule__GameStart__Group__4__Impl rule__GameStart__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__GameStart__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameStart__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameStart__Group__4"


    // $ANTLR start "rule__GameStart__Group__4__Impl"
    // InternalKlangParser.g:1447:1: rule__GameStart__Group__4__Impl : ( RULE_BEGIN ) ;
    public final void rule__GameStart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1451:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:1452:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:1452:1: ( RULE_BEGIN )
            // InternalKlangParser.g:1453:2: RULE_BEGIN
            {
             before(grammarAccess.getGameStartAccess().getBEGINTerminalRuleCall_4()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getGameStartAccess().getBEGINTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameStart__Group__4__Impl"


    // $ANTLR start "rule__GameStart__Group__5"
    // InternalKlangParser.g:1462:1: rule__GameStart__Group__5 : rule__GameStart__Group__5__Impl rule__GameStart__Group__6 ;
    public final void rule__GameStart__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1466:1: ( rule__GameStart__Group__5__Impl rule__GameStart__Group__6 )
            // InternalKlangParser.g:1467:2: rule__GameStart__Group__5__Impl rule__GameStart__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__GameStart__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameStart__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameStart__Group__5"


    // $ANTLR start "rule__GameStart__Group__5__Impl"
    // InternalKlangParser.g:1474:1: rule__GameStart__Group__5__Impl : ( ( rule__GameStart__StatementsAssignment_5 )* ) ;
    public final void rule__GameStart__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1478:1: ( ( ( rule__GameStart__StatementsAssignment_5 )* ) )
            // InternalKlangParser.g:1479:1: ( ( rule__GameStart__StatementsAssignment_5 )* )
            {
            // InternalKlangParser.g:1479:1: ( ( rule__GameStart__StatementsAssignment_5 )* )
            // InternalKlangParser.g:1480:2: ( rule__GameStart__StatementsAssignment_5 )*
            {
             before(grammarAccess.getGameStartAccess().getStatementsAssignment_5()); 
            // InternalKlangParser.g:1481:2: ( rule__GameStart__StatementsAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Forever||(LA12_0>=Sleep && LA12_0<=While)||LA12_0==If||LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalKlangParser.g:1481:3: rule__GameStart__StatementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__GameStart__StatementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getGameStartAccess().getStatementsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameStart__Group__5__Impl"


    // $ANTLR start "rule__GameStart__Group__6"
    // InternalKlangParser.g:1489:1: rule__GameStart__Group__6 : rule__GameStart__Group__6__Impl ;
    public final void rule__GameStart__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1493:1: ( rule__GameStart__Group__6__Impl )
            // InternalKlangParser.g:1494:2: rule__GameStart__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GameStart__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameStart__Group__6"


    // $ANTLR start "rule__GameStart__Group__6__Impl"
    // InternalKlangParser.g:1500:1: rule__GameStart__Group__6__Impl : ( RULE_END ) ;
    public final void rule__GameStart__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1504:1: ( ( RULE_END ) )
            // InternalKlangParser.g:1505:1: ( RULE_END )
            {
            // InternalKlangParser.g:1505:1: ( RULE_END )
            // InternalKlangParser.g:1506:2: RULE_END
            {
             before(grammarAccess.getGameStartAccess().getENDTerminalRuleCall_6()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getGameStartAccess().getENDTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameStart__Group__6__Impl"


    // $ANTLR start "rule__SpriteClicked__Group__0"
    // InternalKlangParser.g:1516:1: rule__SpriteClicked__Group__0 : rule__SpriteClicked__Group__0__Impl rule__SpriteClicked__Group__1 ;
    public final void rule__SpriteClicked__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1520:1: ( rule__SpriteClicked__Group__0__Impl rule__SpriteClicked__Group__1 )
            // InternalKlangParser.g:1521:2: rule__SpriteClicked__Group__0__Impl rule__SpriteClicked__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__SpriteClicked__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpriteClicked__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteClicked__Group__0"


    // $ANTLR start "rule__SpriteClicked__Group__0__Impl"
    // InternalKlangParser.g:1528:1: rule__SpriteClicked__Group__0__Impl : ( () ) ;
    public final void rule__SpriteClicked__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1532:1: ( ( () ) )
            // InternalKlangParser.g:1533:1: ( () )
            {
            // InternalKlangParser.g:1533:1: ( () )
            // InternalKlangParser.g:1534:2: ()
            {
             before(grammarAccess.getSpriteClickedAccess().getSpriteClickedAction_0()); 
            // InternalKlangParser.g:1535:2: ()
            // InternalKlangParser.g:1535:3: 
            {
            }

             after(grammarAccess.getSpriteClickedAccess().getSpriteClickedAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteClicked__Group__0__Impl"


    // $ANTLR start "rule__SpriteClicked__Group__1"
    // InternalKlangParser.g:1543:1: rule__SpriteClicked__Group__1 : rule__SpriteClicked__Group__1__Impl rule__SpriteClicked__Group__2 ;
    public final void rule__SpriteClicked__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1547:1: ( rule__SpriteClicked__Group__1__Impl rule__SpriteClicked__Group__2 )
            // InternalKlangParser.g:1548:2: rule__SpriteClicked__Group__1__Impl rule__SpriteClicked__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__SpriteClicked__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpriteClicked__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteClicked__Group__1"


    // $ANTLR start "rule__SpriteClicked__Group__1__Impl"
    // InternalKlangParser.g:1555:1: rule__SpriteClicked__Group__1__Impl : ( When ) ;
    public final void rule__SpriteClicked__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1559:1: ( ( When ) )
            // InternalKlangParser.g:1560:1: ( When )
            {
            // InternalKlangParser.g:1560:1: ( When )
            // InternalKlangParser.g:1561:2: When
            {
             before(grammarAccess.getSpriteClickedAccess().getWhenKeyword_1()); 
            match(input,When,FOLLOW_2); 
             after(grammarAccess.getSpriteClickedAccess().getWhenKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteClicked__Group__1__Impl"


    // $ANTLR start "rule__SpriteClicked__Group__2"
    // InternalKlangParser.g:1570:1: rule__SpriteClicked__Group__2 : rule__SpriteClicked__Group__2__Impl rule__SpriteClicked__Group__3 ;
    public final void rule__SpriteClicked__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1574:1: ( rule__SpriteClicked__Group__2__Impl rule__SpriteClicked__Group__3 )
            // InternalKlangParser.g:1575:2: rule__SpriteClicked__Group__2__Impl rule__SpriteClicked__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__SpriteClicked__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpriteClicked__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteClicked__Group__2"


    // $ANTLR start "rule__SpriteClicked__Group__2__Impl"
    // InternalKlangParser.g:1582:1: rule__SpriteClicked__Group__2__Impl : ( Clicked ) ;
    public final void rule__SpriteClicked__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1586:1: ( ( Clicked ) )
            // InternalKlangParser.g:1587:1: ( Clicked )
            {
            // InternalKlangParser.g:1587:1: ( Clicked )
            // InternalKlangParser.g:1588:2: Clicked
            {
             before(grammarAccess.getSpriteClickedAccess().getClickedKeyword_2()); 
            match(input,Clicked,FOLLOW_2); 
             after(grammarAccess.getSpriteClickedAccess().getClickedKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteClicked__Group__2__Impl"


    // $ANTLR start "rule__SpriteClicked__Group__3"
    // InternalKlangParser.g:1597:1: rule__SpriteClicked__Group__3 : rule__SpriteClicked__Group__3__Impl rule__SpriteClicked__Group__4 ;
    public final void rule__SpriteClicked__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1601:1: ( rule__SpriteClicked__Group__3__Impl rule__SpriteClicked__Group__4 )
            // InternalKlangParser.g:1602:2: rule__SpriteClicked__Group__3__Impl rule__SpriteClicked__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__SpriteClicked__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpriteClicked__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteClicked__Group__3"


    // $ANTLR start "rule__SpriteClicked__Group__3__Impl"
    // InternalKlangParser.g:1609:1: rule__SpriteClicked__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__SpriteClicked__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1613:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:1614:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:1614:1: ( RULE_BEGIN )
            // InternalKlangParser.g:1615:2: RULE_BEGIN
            {
             before(grammarAccess.getSpriteClickedAccess().getBEGINTerminalRuleCall_3()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getSpriteClickedAccess().getBEGINTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteClicked__Group__3__Impl"


    // $ANTLR start "rule__SpriteClicked__Group__4"
    // InternalKlangParser.g:1624:1: rule__SpriteClicked__Group__4 : rule__SpriteClicked__Group__4__Impl rule__SpriteClicked__Group__5 ;
    public final void rule__SpriteClicked__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1628:1: ( rule__SpriteClicked__Group__4__Impl rule__SpriteClicked__Group__5 )
            // InternalKlangParser.g:1629:2: rule__SpriteClicked__Group__4__Impl rule__SpriteClicked__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__SpriteClicked__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpriteClicked__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteClicked__Group__4"


    // $ANTLR start "rule__SpriteClicked__Group__4__Impl"
    // InternalKlangParser.g:1636:1: rule__SpriteClicked__Group__4__Impl : ( ( rule__SpriteClicked__StatementsAssignment_4 )* ) ;
    public final void rule__SpriteClicked__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1640:1: ( ( ( rule__SpriteClicked__StatementsAssignment_4 )* ) )
            // InternalKlangParser.g:1641:1: ( ( rule__SpriteClicked__StatementsAssignment_4 )* )
            {
            // InternalKlangParser.g:1641:1: ( ( rule__SpriteClicked__StatementsAssignment_4 )* )
            // InternalKlangParser.g:1642:2: ( rule__SpriteClicked__StatementsAssignment_4 )*
            {
             before(grammarAccess.getSpriteClickedAccess().getStatementsAssignment_4()); 
            // InternalKlangParser.g:1643:2: ( rule__SpriteClicked__StatementsAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Forever||(LA13_0>=Sleep && LA13_0<=While)||LA13_0==If||LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalKlangParser.g:1643:3: rule__SpriteClicked__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__SpriteClicked__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getSpriteClickedAccess().getStatementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteClicked__Group__4__Impl"


    // $ANTLR start "rule__SpriteClicked__Group__5"
    // InternalKlangParser.g:1651:1: rule__SpriteClicked__Group__5 : rule__SpriteClicked__Group__5__Impl ;
    public final void rule__SpriteClicked__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1655:1: ( rule__SpriteClicked__Group__5__Impl )
            // InternalKlangParser.g:1656:2: rule__SpriteClicked__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpriteClicked__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteClicked__Group__5"


    // $ANTLR start "rule__SpriteClicked__Group__5__Impl"
    // InternalKlangParser.g:1662:1: rule__SpriteClicked__Group__5__Impl : ( RULE_END ) ;
    public final void rule__SpriteClicked__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1666:1: ( ( RULE_END ) )
            // InternalKlangParser.g:1667:1: ( RULE_END )
            {
            // InternalKlangParser.g:1667:1: ( RULE_END )
            // InternalKlangParser.g:1668:2: RULE_END
            {
             before(grammarAccess.getSpriteClickedAccess().getENDTerminalRuleCall_5()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getSpriteClickedAccess().getENDTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteClicked__Group__5__Impl"


    // $ANTLR start "rule__KeyPressed__Group__0"
    // InternalKlangParser.g:1678:1: rule__KeyPressed__Group__0 : rule__KeyPressed__Group__0__Impl rule__KeyPressed__Group__1 ;
    public final void rule__KeyPressed__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1682:1: ( rule__KeyPressed__Group__0__Impl rule__KeyPressed__Group__1 )
            // InternalKlangParser.g:1683:2: rule__KeyPressed__Group__0__Impl rule__KeyPressed__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__KeyPressed__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeyPressed__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyPressed__Group__0"


    // $ANTLR start "rule__KeyPressed__Group__0__Impl"
    // InternalKlangParser.g:1690:1: rule__KeyPressed__Group__0__Impl : ( () ) ;
    public final void rule__KeyPressed__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1694:1: ( ( () ) )
            // InternalKlangParser.g:1695:1: ( () )
            {
            // InternalKlangParser.g:1695:1: ( () )
            // InternalKlangParser.g:1696:2: ()
            {
             before(grammarAccess.getKeyPressedAccess().getKeyPressedAction_0()); 
            // InternalKlangParser.g:1697:2: ()
            // InternalKlangParser.g:1697:3: 
            {
            }

             after(grammarAccess.getKeyPressedAccess().getKeyPressedAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyPressed__Group__0__Impl"


    // $ANTLR start "rule__KeyPressed__Group__1"
    // InternalKlangParser.g:1705:1: rule__KeyPressed__Group__1 : rule__KeyPressed__Group__1__Impl rule__KeyPressed__Group__2 ;
    public final void rule__KeyPressed__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1709:1: ( rule__KeyPressed__Group__1__Impl rule__KeyPressed__Group__2 )
            // InternalKlangParser.g:1710:2: rule__KeyPressed__Group__1__Impl rule__KeyPressed__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__KeyPressed__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeyPressed__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyPressed__Group__1"


    // $ANTLR start "rule__KeyPressed__Group__1__Impl"
    // InternalKlangParser.g:1717:1: rule__KeyPressed__Group__1__Impl : ( When ) ;
    public final void rule__KeyPressed__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1721:1: ( ( When ) )
            // InternalKlangParser.g:1722:1: ( When )
            {
            // InternalKlangParser.g:1722:1: ( When )
            // InternalKlangParser.g:1723:2: When
            {
             before(grammarAccess.getKeyPressedAccess().getWhenKeyword_1()); 
            match(input,When,FOLLOW_2); 
             after(grammarAccess.getKeyPressedAccess().getWhenKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyPressed__Group__1__Impl"


    // $ANTLR start "rule__KeyPressed__Group__2"
    // InternalKlangParser.g:1732:1: rule__KeyPressed__Group__2 : rule__KeyPressed__Group__2__Impl rule__KeyPressed__Group__3 ;
    public final void rule__KeyPressed__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1736:1: ( rule__KeyPressed__Group__2__Impl rule__KeyPressed__Group__3 )
            // InternalKlangParser.g:1737:2: rule__KeyPressed__Group__2__Impl rule__KeyPressed__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__KeyPressed__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeyPressed__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyPressed__Group__2"


    // $ANTLR start "rule__KeyPressed__Group__2__Impl"
    // InternalKlangParser.g:1744:1: rule__KeyPressed__Group__2__Impl : ( ( rule__KeyPressed__KeyAssignment_2 ) ) ;
    public final void rule__KeyPressed__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1748:1: ( ( ( rule__KeyPressed__KeyAssignment_2 ) ) )
            // InternalKlangParser.g:1749:1: ( ( rule__KeyPressed__KeyAssignment_2 ) )
            {
            // InternalKlangParser.g:1749:1: ( ( rule__KeyPressed__KeyAssignment_2 ) )
            // InternalKlangParser.g:1750:2: ( rule__KeyPressed__KeyAssignment_2 )
            {
             before(grammarAccess.getKeyPressedAccess().getKeyAssignment_2()); 
            // InternalKlangParser.g:1751:2: ( rule__KeyPressed__KeyAssignment_2 )
            // InternalKlangParser.g:1751:3: rule__KeyPressed__KeyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__KeyPressed__KeyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getKeyPressedAccess().getKeyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyPressed__Group__2__Impl"


    // $ANTLR start "rule__KeyPressed__Group__3"
    // InternalKlangParser.g:1759:1: rule__KeyPressed__Group__3 : rule__KeyPressed__Group__3__Impl rule__KeyPressed__Group__4 ;
    public final void rule__KeyPressed__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1763:1: ( rule__KeyPressed__Group__3__Impl rule__KeyPressed__Group__4 )
            // InternalKlangParser.g:1764:2: rule__KeyPressed__Group__3__Impl rule__KeyPressed__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__KeyPressed__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeyPressed__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyPressed__Group__3"


    // $ANTLR start "rule__KeyPressed__Group__3__Impl"
    // InternalKlangParser.g:1771:1: rule__KeyPressed__Group__3__Impl : ( Key ) ;
    public final void rule__KeyPressed__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1775:1: ( ( Key ) )
            // InternalKlangParser.g:1776:1: ( Key )
            {
            // InternalKlangParser.g:1776:1: ( Key )
            // InternalKlangParser.g:1777:2: Key
            {
             before(grammarAccess.getKeyPressedAccess().getKeyKeyword_3()); 
            match(input,Key,FOLLOW_2); 
             after(grammarAccess.getKeyPressedAccess().getKeyKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyPressed__Group__3__Impl"


    // $ANTLR start "rule__KeyPressed__Group__4"
    // InternalKlangParser.g:1786:1: rule__KeyPressed__Group__4 : rule__KeyPressed__Group__4__Impl rule__KeyPressed__Group__5 ;
    public final void rule__KeyPressed__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1790:1: ( rule__KeyPressed__Group__4__Impl rule__KeyPressed__Group__5 )
            // InternalKlangParser.g:1791:2: rule__KeyPressed__Group__4__Impl rule__KeyPressed__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__KeyPressed__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeyPressed__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyPressed__Group__4"


    // $ANTLR start "rule__KeyPressed__Group__4__Impl"
    // InternalKlangParser.g:1798:1: rule__KeyPressed__Group__4__Impl : ( Pressed ) ;
    public final void rule__KeyPressed__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1802:1: ( ( Pressed ) )
            // InternalKlangParser.g:1803:1: ( Pressed )
            {
            // InternalKlangParser.g:1803:1: ( Pressed )
            // InternalKlangParser.g:1804:2: Pressed
            {
             before(grammarAccess.getKeyPressedAccess().getPressedKeyword_4()); 
            match(input,Pressed,FOLLOW_2); 
             after(grammarAccess.getKeyPressedAccess().getPressedKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyPressed__Group__4__Impl"


    // $ANTLR start "rule__KeyPressed__Group__5"
    // InternalKlangParser.g:1813:1: rule__KeyPressed__Group__5 : rule__KeyPressed__Group__5__Impl rule__KeyPressed__Group__6 ;
    public final void rule__KeyPressed__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1817:1: ( rule__KeyPressed__Group__5__Impl rule__KeyPressed__Group__6 )
            // InternalKlangParser.g:1818:2: rule__KeyPressed__Group__5__Impl rule__KeyPressed__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__KeyPressed__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeyPressed__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyPressed__Group__5"


    // $ANTLR start "rule__KeyPressed__Group__5__Impl"
    // InternalKlangParser.g:1825:1: rule__KeyPressed__Group__5__Impl : ( RULE_BEGIN ) ;
    public final void rule__KeyPressed__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1829:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:1830:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:1830:1: ( RULE_BEGIN )
            // InternalKlangParser.g:1831:2: RULE_BEGIN
            {
             before(grammarAccess.getKeyPressedAccess().getBEGINTerminalRuleCall_5()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getKeyPressedAccess().getBEGINTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyPressed__Group__5__Impl"


    // $ANTLR start "rule__KeyPressed__Group__6"
    // InternalKlangParser.g:1840:1: rule__KeyPressed__Group__6 : rule__KeyPressed__Group__6__Impl rule__KeyPressed__Group__7 ;
    public final void rule__KeyPressed__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1844:1: ( rule__KeyPressed__Group__6__Impl rule__KeyPressed__Group__7 )
            // InternalKlangParser.g:1845:2: rule__KeyPressed__Group__6__Impl rule__KeyPressed__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__KeyPressed__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeyPressed__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyPressed__Group__6"


    // $ANTLR start "rule__KeyPressed__Group__6__Impl"
    // InternalKlangParser.g:1852:1: rule__KeyPressed__Group__6__Impl : ( ( rule__KeyPressed__StatementsAssignment_6 )* ) ;
    public final void rule__KeyPressed__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1856:1: ( ( ( rule__KeyPressed__StatementsAssignment_6 )* ) )
            // InternalKlangParser.g:1857:1: ( ( rule__KeyPressed__StatementsAssignment_6 )* )
            {
            // InternalKlangParser.g:1857:1: ( ( rule__KeyPressed__StatementsAssignment_6 )* )
            // InternalKlangParser.g:1858:2: ( rule__KeyPressed__StatementsAssignment_6 )*
            {
             before(grammarAccess.getKeyPressedAccess().getStatementsAssignment_6()); 
            // InternalKlangParser.g:1859:2: ( rule__KeyPressed__StatementsAssignment_6 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Forever||(LA14_0>=Sleep && LA14_0<=While)||LA14_0==If||LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalKlangParser.g:1859:3: rule__KeyPressed__StatementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__KeyPressed__StatementsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getKeyPressedAccess().getStatementsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyPressed__Group__6__Impl"


    // $ANTLR start "rule__KeyPressed__Group__7"
    // InternalKlangParser.g:1867:1: rule__KeyPressed__Group__7 : rule__KeyPressed__Group__7__Impl ;
    public final void rule__KeyPressed__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1871:1: ( rule__KeyPressed__Group__7__Impl )
            // InternalKlangParser.g:1872:2: rule__KeyPressed__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KeyPressed__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyPressed__Group__7"


    // $ANTLR start "rule__KeyPressed__Group__7__Impl"
    // InternalKlangParser.g:1878:1: rule__KeyPressed__Group__7__Impl : ( RULE_END ) ;
    public final void rule__KeyPressed__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1882:1: ( ( RULE_END ) )
            // InternalKlangParser.g:1883:1: ( RULE_END )
            {
            // InternalKlangParser.g:1883:1: ( RULE_END )
            // InternalKlangParser.g:1884:2: RULE_END
            {
             before(grammarAccess.getKeyPressedAccess().getENDTerminalRuleCall_7()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getKeyPressedAccess().getENDTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyPressed__Group__7__Impl"


    // $ANTLR start "rule__CollidesWith__Group__0"
    // InternalKlangParser.g:1894:1: rule__CollidesWith__Group__0 : rule__CollidesWith__Group__0__Impl rule__CollidesWith__Group__1 ;
    public final void rule__CollidesWith__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1898:1: ( rule__CollidesWith__Group__0__Impl rule__CollidesWith__Group__1 )
            // InternalKlangParser.g:1899:2: rule__CollidesWith__Group__0__Impl rule__CollidesWith__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__CollidesWith__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollidesWith__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollidesWith__Group__0"


    // $ANTLR start "rule__CollidesWith__Group__0__Impl"
    // InternalKlangParser.g:1906:1: rule__CollidesWith__Group__0__Impl : ( () ) ;
    public final void rule__CollidesWith__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1910:1: ( ( () ) )
            // InternalKlangParser.g:1911:1: ( () )
            {
            // InternalKlangParser.g:1911:1: ( () )
            // InternalKlangParser.g:1912:2: ()
            {
             before(grammarAccess.getCollidesWithAccess().getCollidesWithAction_0()); 
            // InternalKlangParser.g:1913:2: ()
            // InternalKlangParser.g:1913:3: 
            {
            }

             after(grammarAccess.getCollidesWithAccess().getCollidesWithAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollidesWith__Group__0__Impl"


    // $ANTLR start "rule__CollidesWith__Group__1"
    // InternalKlangParser.g:1921:1: rule__CollidesWith__Group__1 : rule__CollidesWith__Group__1__Impl rule__CollidesWith__Group__2 ;
    public final void rule__CollidesWith__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1925:1: ( rule__CollidesWith__Group__1__Impl rule__CollidesWith__Group__2 )
            // InternalKlangParser.g:1926:2: rule__CollidesWith__Group__1__Impl rule__CollidesWith__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__CollidesWith__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollidesWith__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollidesWith__Group__1"


    // $ANTLR start "rule__CollidesWith__Group__1__Impl"
    // InternalKlangParser.g:1933:1: rule__CollidesWith__Group__1__Impl : ( When ) ;
    public final void rule__CollidesWith__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1937:1: ( ( When ) )
            // InternalKlangParser.g:1938:1: ( When )
            {
            // InternalKlangParser.g:1938:1: ( When )
            // InternalKlangParser.g:1939:2: When
            {
             before(grammarAccess.getCollidesWithAccess().getWhenKeyword_1()); 
            match(input,When,FOLLOW_2); 
             after(grammarAccess.getCollidesWithAccess().getWhenKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollidesWith__Group__1__Impl"


    // $ANTLR start "rule__CollidesWith__Group__2"
    // InternalKlangParser.g:1948:1: rule__CollidesWith__Group__2 : rule__CollidesWith__Group__2__Impl rule__CollidesWith__Group__3 ;
    public final void rule__CollidesWith__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1952:1: ( rule__CollidesWith__Group__2__Impl rule__CollidesWith__Group__3 )
            // InternalKlangParser.g:1953:2: rule__CollidesWith__Group__2__Impl rule__CollidesWith__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__CollidesWith__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollidesWith__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollidesWith__Group__2"


    // $ANTLR start "rule__CollidesWith__Group__2__Impl"
    // InternalKlangParser.g:1960:1: rule__CollidesWith__Group__2__Impl : ( Collides ) ;
    public final void rule__CollidesWith__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1964:1: ( ( Collides ) )
            // InternalKlangParser.g:1965:1: ( Collides )
            {
            // InternalKlangParser.g:1965:1: ( Collides )
            // InternalKlangParser.g:1966:2: Collides
            {
             before(grammarAccess.getCollidesWithAccess().getCollidesKeyword_2()); 
            match(input,Collides,FOLLOW_2); 
             after(grammarAccess.getCollidesWithAccess().getCollidesKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollidesWith__Group__2__Impl"


    // $ANTLR start "rule__CollidesWith__Group__3"
    // InternalKlangParser.g:1975:1: rule__CollidesWith__Group__3 : rule__CollidesWith__Group__3__Impl rule__CollidesWith__Group__4 ;
    public final void rule__CollidesWith__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1979:1: ( rule__CollidesWith__Group__3__Impl rule__CollidesWith__Group__4 )
            // InternalKlangParser.g:1980:2: rule__CollidesWith__Group__3__Impl rule__CollidesWith__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__CollidesWith__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollidesWith__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollidesWith__Group__3"


    // $ANTLR start "rule__CollidesWith__Group__3__Impl"
    // InternalKlangParser.g:1987:1: rule__CollidesWith__Group__3__Impl : ( With ) ;
    public final void rule__CollidesWith__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1991:1: ( ( With ) )
            // InternalKlangParser.g:1992:1: ( With )
            {
            // InternalKlangParser.g:1992:1: ( With )
            // InternalKlangParser.g:1993:2: With
            {
             before(grammarAccess.getCollidesWithAccess().getWithKeyword_3()); 
            match(input,With,FOLLOW_2); 
             after(grammarAccess.getCollidesWithAccess().getWithKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollidesWith__Group__3__Impl"


    // $ANTLR start "rule__CollidesWith__Group__4"
    // InternalKlangParser.g:2002:1: rule__CollidesWith__Group__4 : rule__CollidesWith__Group__4__Impl rule__CollidesWith__Group__5 ;
    public final void rule__CollidesWith__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2006:1: ( rule__CollidesWith__Group__4__Impl rule__CollidesWith__Group__5 )
            // InternalKlangParser.g:2007:2: rule__CollidesWith__Group__4__Impl rule__CollidesWith__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__CollidesWith__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollidesWith__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollidesWith__Group__4"


    // $ANTLR start "rule__CollidesWith__Group__4__Impl"
    // InternalKlangParser.g:2014:1: rule__CollidesWith__Group__4__Impl : ( ( rule__CollidesWith__TargetAssignment_4 ) ) ;
    public final void rule__CollidesWith__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2018:1: ( ( ( rule__CollidesWith__TargetAssignment_4 ) ) )
            // InternalKlangParser.g:2019:1: ( ( rule__CollidesWith__TargetAssignment_4 ) )
            {
            // InternalKlangParser.g:2019:1: ( ( rule__CollidesWith__TargetAssignment_4 ) )
            // InternalKlangParser.g:2020:2: ( rule__CollidesWith__TargetAssignment_4 )
            {
             before(grammarAccess.getCollidesWithAccess().getTargetAssignment_4()); 
            // InternalKlangParser.g:2021:2: ( rule__CollidesWith__TargetAssignment_4 )
            // InternalKlangParser.g:2021:3: rule__CollidesWith__TargetAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CollidesWith__TargetAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCollidesWithAccess().getTargetAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollidesWith__Group__4__Impl"


    // $ANTLR start "rule__CollidesWith__Group__5"
    // InternalKlangParser.g:2029:1: rule__CollidesWith__Group__5 : rule__CollidesWith__Group__5__Impl rule__CollidesWith__Group__6 ;
    public final void rule__CollidesWith__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2033:1: ( rule__CollidesWith__Group__5__Impl rule__CollidesWith__Group__6 )
            // InternalKlangParser.g:2034:2: rule__CollidesWith__Group__5__Impl rule__CollidesWith__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__CollidesWith__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollidesWith__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollidesWith__Group__5"


    // $ANTLR start "rule__CollidesWith__Group__5__Impl"
    // InternalKlangParser.g:2041:1: rule__CollidesWith__Group__5__Impl : ( RULE_BEGIN ) ;
    public final void rule__CollidesWith__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2045:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:2046:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:2046:1: ( RULE_BEGIN )
            // InternalKlangParser.g:2047:2: RULE_BEGIN
            {
             before(grammarAccess.getCollidesWithAccess().getBEGINTerminalRuleCall_5()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getCollidesWithAccess().getBEGINTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollidesWith__Group__5__Impl"


    // $ANTLR start "rule__CollidesWith__Group__6"
    // InternalKlangParser.g:2056:1: rule__CollidesWith__Group__6 : rule__CollidesWith__Group__6__Impl rule__CollidesWith__Group__7 ;
    public final void rule__CollidesWith__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2060:1: ( rule__CollidesWith__Group__6__Impl rule__CollidesWith__Group__7 )
            // InternalKlangParser.g:2061:2: rule__CollidesWith__Group__6__Impl rule__CollidesWith__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__CollidesWith__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollidesWith__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollidesWith__Group__6"


    // $ANTLR start "rule__CollidesWith__Group__6__Impl"
    // InternalKlangParser.g:2068:1: rule__CollidesWith__Group__6__Impl : ( ( rule__CollidesWith__StatementsAssignment_6 )* ) ;
    public final void rule__CollidesWith__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2072:1: ( ( ( rule__CollidesWith__StatementsAssignment_6 )* ) )
            // InternalKlangParser.g:2073:1: ( ( rule__CollidesWith__StatementsAssignment_6 )* )
            {
            // InternalKlangParser.g:2073:1: ( ( rule__CollidesWith__StatementsAssignment_6 )* )
            // InternalKlangParser.g:2074:2: ( rule__CollidesWith__StatementsAssignment_6 )*
            {
             before(grammarAccess.getCollidesWithAccess().getStatementsAssignment_6()); 
            // InternalKlangParser.g:2075:2: ( rule__CollidesWith__StatementsAssignment_6 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Forever||(LA15_0>=Sleep && LA15_0<=While)||LA15_0==If||LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalKlangParser.g:2075:3: rule__CollidesWith__StatementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__CollidesWith__StatementsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getCollidesWithAccess().getStatementsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollidesWith__Group__6__Impl"


    // $ANTLR start "rule__CollidesWith__Group__7"
    // InternalKlangParser.g:2083:1: rule__CollidesWith__Group__7 : rule__CollidesWith__Group__7__Impl ;
    public final void rule__CollidesWith__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2087:1: ( rule__CollidesWith__Group__7__Impl )
            // InternalKlangParser.g:2088:2: rule__CollidesWith__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CollidesWith__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollidesWith__Group__7"


    // $ANTLR start "rule__CollidesWith__Group__7__Impl"
    // InternalKlangParser.g:2094:1: rule__CollidesWith__Group__7__Impl : ( RULE_END ) ;
    public final void rule__CollidesWith__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2098:1: ( ( RULE_END ) )
            // InternalKlangParser.g:2099:1: ( RULE_END )
            {
            // InternalKlangParser.g:2099:1: ( RULE_END )
            // InternalKlangParser.g:2100:2: RULE_END
            {
             before(grammarAccess.getCollidesWithAccess().getENDTerminalRuleCall_7()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getCollidesWithAccess().getENDTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollidesWith__Group__7__Impl"


    // $ANTLR start "rule__WhileLoop__Group__0"
    // InternalKlangParser.g:2110:1: rule__WhileLoop__Group__0 : rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 ;
    public final void rule__WhileLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2114:1: ( rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 )
            // InternalKlangParser.g:2115:2: rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__WhileLoop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__0"


    // $ANTLR start "rule__WhileLoop__Group__0__Impl"
    // InternalKlangParser.g:2122:1: rule__WhileLoop__Group__0__Impl : ( () ) ;
    public final void rule__WhileLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2126:1: ( ( () ) )
            // InternalKlangParser.g:2127:1: ( () )
            {
            // InternalKlangParser.g:2127:1: ( () )
            // InternalKlangParser.g:2128:2: ()
            {
             before(grammarAccess.getWhileLoopAccess().getWhileLoopAction_0()); 
            // InternalKlangParser.g:2129:2: ()
            // InternalKlangParser.g:2129:3: 
            {
            }

             after(grammarAccess.getWhileLoopAccess().getWhileLoopAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__0__Impl"


    // $ANTLR start "rule__WhileLoop__Group__1"
    // InternalKlangParser.g:2137:1: rule__WhileLoop__Group__1 : rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 ;
    public final void rule__WhileLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2141:1: ( rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 )
            // InternalKlangParser.g:2142:2: rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__WhileLoop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__1"


    // $ANTLR start "rule__WhileLoop__Group__1__Impl"
    // InternalKlangParser.g:2149:1: rule__WhileLoop__Group__1__Impl : ( While ) ;
    public final void rule__WhileLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2153:1: ( ( While ) )
            // InternalKlangParser.g:2154:1: ( While )
            {
            // InternalKlangParser.g:2154:1: ( While )
            // InternalKlangParser.g:2155:2: While
            {
             before(grammarAccess.getWhileLoopAccess().getWhileKeyword_1()); 
            match(input,While,FOLLOW_2); 
             after(grammarAccess.getWhileLoopAccess().getWhileKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__1__Impl"


    // $ANTLR start "rule__WhileLoop__Group__2"
    // InternalKlangParser.g:2164:1: rule__WhileLoop__Group__2 : rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 ;
    public final void rule__WhileLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2168:1: ( rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 )
            // InternalKlangParser.g:2169:2: rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__WhileLoop__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__2"


    // $ANTLR start "rule__WhileLoop__Group__2__Impl"
    // InternalKlangParser.g:2176:1: rule__WhileLoop__Group__2__Impl : ( ( rule__WhileLoop__PredicateAssignment_2 ) ) ;
    public final void rule__WhileLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2180:1: ( ( ( rule__WhileLoop__PredicateAssignment_2 ) ) )
            // InternalKlangParser.g:2181:1: ( ( rule__WhileLoop__PredicateAssignment_2 ) )
            {
            // InternalKlangParser.g:2181:1: ( ( rule__WhileLoop__PredicateAssignment_2 ) )
            // InternalKlangParser.g:2182:2: ( rule__WhileLoop__PredicateAssignment_2 )
            {
             before(grammarAccess.getWhileLoopAccess().getPredicateAssignment_2()); 
            // InternalKlangParser.g:2183:2: ( rule__WhileLoop__PredicateAssignment_2 )
            // InternalKlangParser.g:2183:3: rule__WhileLoop__PredicateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WhileLoop__PredicateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWhileLoopAccess().getPredicateAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__2__Impl"


    // $ANTLR start "rule__WhileLoop__Group__3"
    // InternalKlangParser.g:2191:1: rule__WhileLoop__Group__3 : rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 ;
    public final void rule__WhileLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2195:1: ( rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 )
            // InternalKlangParser.g:2196:2: rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__WhileLoop__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__3"


    // $ANTLR start "rule__WhileLoop__Group__3__Impl"
    // InternalKlangParser.g:2203:1: rule__WhileLoop__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__WhileLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2207:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:2208:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:2208:1: ( RULE_BEGIN )
            // InternalKlangParser.g:2209:2: RULE_BEGIN
            {
             before(grammarAccess.getWhileLoopAccess().getBEGINTerminalRuleCall_3()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getWhileLoopAccess().getBEGINTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__3__Impl"


    // $ANTLR start "rule__WhileLoop__Group__4"
    // InternalKlangParser.g:2218:1: rule__WhileLoop__Group__4 : rule__WhileLoop__Group__4__Impl rule__WhileLoop__Group__5 ;
    public final void rule__WhileLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2222:1: ( rule__WhileLoop__Group__4__Impl rule__WhileLoop__Group__5 )
            // InternalKlangParser.g:2223:2: rule__WhileLoop__Group__4__Impl rule__WhileLoop__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__WhileLoop__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__4"


    // $ANTLR start "rule__WhileLoop__Group__4__Impl"
    // InternalKlangParser.g:2230:1: rule__WhileLoop__Group__4__Impl : ( ( rule__WhileLoop__LoopBlockAssignment_4 )* ) ;
    public final void rule__WhileLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2234:1: ( ( ( rule__WhileLoop__LoopBlockAssignment_4 )* ) )
            // InternalKlangParser.g:2235:1: ( ( rule__WhileLoop__LoopBlockAssignment_4 )* )
            {
            // InternalKlangParser.g:2235:1: ( ( rule__WhileLoop__LoopBlockAssignment_4 )* )
            // InternalKlangParser.g:2236:2: ( rule__WhileLoop__LoopBlockAssignment_4 )*
            {
             before(grammarAccess.getWhileLoopAccess().getLoopBlockAssignment_4()); 
            // InternalKlangParser.g:2237:2: ( rule__WhileLoop__LoopBlockAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==Forever||(LA16_0>=Sleep && LA16_0<=While)||LA16_0==If||LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalKlangParser.g:2237:3: rule__WhileLoop__LoopBlockAssignment_4
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__WhileLoop__LoopBlockAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getWhileLoopAccess().getLoopBlockAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__4__Impl"


    // $ANTLR start "rule__WhileLoop__Group__5"
    // InternalKlangParser.g:2245:1: rule__WhileLoop__Group__5 : rule__WhileLoop__Group__5__Impl ;
    public final void rule__WhileLoop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2249:1: ( rule__WhileLoop__Group__5__Impl )
            // InternalKlangParser.g:2250:2: rule__WhileLoop__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__5"


    // $ANTLR start "rule__WhileLoop__Group__5__Impl"
    // InternalKlangParser.g:2256:1: rule__WhileLoop__Group__5__Impl : ( RULE_END ) ;
    public final void rule__WhileLoop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2260:1: ( ( RULE_END ) )
            // InternalKlangParser.g:2261:1: ( RULE_END )
            {
            // InternalKlangParser.g:2261:1: ( RULE_END )
            // InternalKlangParser.g:2262:2: RULE_END
            {
             before(grammarAccess.getWhileLoopAccess().getENDTerminalRuleCall_5()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getWhileLoopAccess().getENDTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__5__Impl"


    // $ANTLR start "rule__If__Group__0"
    // InternalKlangParser.g:2272:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2276:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalKlangParser.g:2277:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__If__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__0"


    // $ANTLR start "rule__If__Group__0__Impl"
    // InternalKlangParser.g:2284:1: rule__If__Group__0__Impl : ( () ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2288:1: ( ( () ) )
            // InternalKlangParser.g:2289:1: ( () )
            {
            // InternalKlangParser.g:2289:1: ( () )
            // InternalKlangParser.g:2290:2: ()
            {
             before(grammarAccess.getIfAccess().getIfAction_0()); 
            // InternalKlangParser.g:2291:2: ()
            // InternalKlangParser.g:2291:3: 
            {
            }

             after(grammarAccess.getIfAccess().getIfAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__0__Impl"


    // $ANTLR start "rule__If__Group__1"
    // InternalKlangParser.g:2299:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2303:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalKlangParser.g:2304:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__If__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__1"


    // $ANTLR start "rule__If__Group__1__Impl"
    // InternalKlangParser.g:2311:1: rule__If__Group__1__Impl : ( If ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2315:1: ( ( If ) )
            // InternalKlangParser.g:2316:1: ( If )
            {
            // InternalKlangParser.g:2316:1: ( If )
            // InternalKlangParser.g:2317:2: If
            {
             before(grammarAccess.getIfAccess().getIfKeyword_1()); 
            match(input,If,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getIfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__1__Impl"


    // $ANTLR start "rule__If__Group__2"
    // InternalKlangParser.g:2326:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2330:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // InternalKlangParser.g:2331:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__If__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__2"


    // $ANTLR start "rule__If__Group__2__Impl"
    // InternalKlangParser.g:2338:1: rule__If__Group__2__Impl : ( ( rule__If__PredicateAssignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2342:1: ( ( ( rule__If__PredicateAssignment_2 ) ) )
            // InternalKlangParser.g:2343:1: ( ( rule__If__PredicateAssignment_2 ) )
            {
            // InternalKlangParser.g:2343:1: ( ( rule__If__PredicateAssignment_2 ) )
            // InternalKlangParser.g:2344:2: ( rule__If__PredicateAssignment_2 )
            {
             before(grammarAccess.getIfAccess().getPredicateAssignment_2()); 
            // InternalKlangParser.g:2345:2: ( rule__If__PredicateAssignment_2 )
            // InternalKlangParser.g:2345:3: rule__If__PredicateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__If__PredicateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getPredicateAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__2__Impl"


    // $ANTLR start "rule__If__Group__3"
    // InternalKlangParser.g:2353:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2357:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // InternalKlangParser.g:2358:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__If__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__3"


    // $ANTLR start "rule__If__Group__3__Impl"
    // InternalKlangParser.g:2365:1: rule__If__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2369:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:2370:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:2370:1: ( RULE_BEGIN )
            // InternalKlangParser.g:2371:2: RULE_BEGIN
            {
             before(grammarAccess.getIfAccess().getBEGINTerminalRuleCall_3()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getBEGINTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__3__Impl"


    // $ANTLR start "rule__If__Group__4"
    // InternalKlangParser.g:2380:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2384:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // InternalKlangParser.g:2385:2: rule__If__Group__4__Impl rule__If__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__If__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__4"


    // $ANTLR start "rule__If__Group__4__Impl"
    // InternalKlangParser.g:2392:1: rule__If__Group__4__Impl : ( ( rule__If__IfBlockAssignment_4 )* ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2396:1: ( ( ( rule__If__IfBlockAssignment_4 )* ) )
            // InternalKlangParser.g:2397:1: ( ( rule__If__IfBlockAssignment_4 )* )
            {
            // InternalKlangParser.g:2397:1: ( ( rule__If__IfBlockAssignment_4 )* )
            // InternalKlangParser.g:2398:2: ( rule__If__IfBlockAssignment_4 )*
            {
             before(grammarAccess.getIfAccess().getIfBlockAssignment_4()); 
            // InternalKlangParser.g:2399:2: ( rule__If__IfBlockAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Forever||(LA17_0>=Sleep && LA17_0<=While)||LA17_0==If||LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalKlangParser.g:2399:3: rule__If__IfBlockAssignment_4
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__If__IfBlockAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getIfAccess().getIfBlockAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__4__Impl"


    // $ANTLR start "rule__If__Group__5"
    // InternalKlangParser.g:2407:1: rule__If__Group__5 : rule__If__Group__5__Impl rule__If__Group__6 ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2411:1: ( rule__If__Group__5__Impl rule__If__Group__6 )
            // InternalKlangParser.g:2412:2: rule__If__Group__5__Impl rule__If__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__If__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__5"


    // $ANTLR start "rule__If__Group__5__Impl"
    // InternalKlangParser.g:2419:1: rule__If__Group__5__Impl : ( RULE_END ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2423:1: ( ( RULE_END ) )
            // InternalKlangParser.g:2424:1: ( RULE_END )
            {
            // InternalKlangParser.g:2424:1: ( RULE_END )
            // InternalKlangParser.g:2425:2: RULE_END
            {
             before(grammarAccess.getIfAccess().getENDTerminalRuleCall_5()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getENDTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__5__Impl"


    // $ANTLR start "rule__If__Group__6"
    // InternalKlangParser.g:2434:1: rule__If__Group__6 : rule__If__Group__6__Impl ;
    public final void rule__If__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2438:1: ( rule__If__Group__6__Impl )
            // InternalKlangParser.g:2439:2: rule__If__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__6"


    // $ANTLR start "rule__If__Group__6__Impl"
    // InternalKlangParser.g:2445:1: rule__If__Group__6__Impl : ( ( rule__If__Group_6__0 )? ) ;
    public final void rule__If__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2449:1: ( ( ( rule__If__Group_6__0 )? ) )
            // InternalKlangParser.g:2450:1: ( ( rule__If__Group_6__0 )? )
            {
            // InternalKlangParser.g:2450:1: ( ( rule__If__Group_6__0 )? )
            // InternalKlangParser.g:2451:2: ( rule__If__Group_6__0 )?
            {
             before(grammarAccess.getIfAccess().getGroup_6()); 
            // InternalKlangParser.g:2452:2: ( rule__If__Group_6__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Else) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalKlangParser.g:2452:3: rule__If__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__If__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIfAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__6__Impl"


    // $ANTLR start "rule__If__Group_6__0"
    // InternalKlangParser.g:2461:1: rule__If__Group_6__0 : rule__If__Group_6__0__Impl rule__If__Group_6__1 ;
    public final void rule__If__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2465:1: ( rule__If__Group_6__0__Impl rule__If__Group_6__1 )
            // InternalKlangParser.g:2466:2: rule__If__Group_6__0__Impl rule__If__Group_6__1
            {
            pushFollow(FOLLOW_7);
            rule__If__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_6__0"


    // $ANTLR start "rule__If__Group_6__0__Impl"
    // InternalKlangParser.g:2473:1: rule__If__Group_6__0__Impl : ( Else ) ;
    public final void rule__If__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2477:1: ( ( Else ) )
            // InternalKlangParser.g:2478:1: ( Else )
            {
            // InternalKlangParser.g:2478:1: ( Else )
            // InternalKlangParser.g:2479:2: Else
            {
             before(grammarAccess.getIfAccess().getElseKeyword_6_0()); 
            match(input,Else,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getElseKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_6__0__Impl"


    // $ANTLR start "rule__If__Group_6__1"
    // InternalKlangParser.g:2488:1: rule__If__Group_6__1 : rule__If__Group_6__1__Impl rule__If__Group_6__2 ;
    public final void rule__If__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2492:1: ( rule__If__Group_6__1__Impl rule__If__Group_6__2 )
            // InternalKlangParser.g:2493:2: rule__If__Group_6__1__Impl rule__If__Group_6__2
            {
            pushFollow(FOLLOW_14);
            rule__If__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_6__1"


    // $ANTLR start "rule__If__Group_6__1__Impl"
    // InternalKlangParser.g:2500:1: rule__If__Group_6__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__If__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2504:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:2505:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:2505:1: ( RULE_BEGIN )
            // InternalKlangParser.g:2506:2: RULE_BEGIN
            {
             before(grammarAccess.getIfAccess().getBEGINTerminalRuleCall_6_1()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getBEGINTerminalRuleCall_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_6__1__Impl"


    // $ANTLR start "rule__If__Group_6__2"
    // InternalKlangParser.g:2515:1: rule__If__Group_6__2 : rule__If__Group_6__2__Impl rule__If__Group_6__3 ;
    public final void rule__If__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2519:1: ( rule__If__Group_6__2__Impl rule__If__Group_6__3 )
            // InternalKlangParser.g:2520:2: rule__If__Group_6__2__Impl rule__If__Group_6__3
            {
            pushFollow(FOLLOW_14);
            rule__If__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_6__2"


    // $ANTLR start "rule__If__Group_6__2__Impl"
    // InternalKlangParser.g:2527:1: rule__If__Group_6__2__Impl : ( ( rule__If__ElseBlockAssignment_6_2 )* ) ;
    public final void rule__If__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2531:1: ( ( ( rule__If__ElseBlockAssignment_6_2 )* ) )
            // InternalKlangParser.g:2532:1: ( ( rule__If__ElseBlockAssignment_6_2 )* )
            {
            // InternalKlangParser.g:2532:1: ( ( rule__If__ElseBlockAssignment_6_2 )* )
            // InternalKlangParser.g:2533:2: ( rule__If__ElseBlockAssignment_6_2 )*
            {
             before(grammarAccess.getIfAccess().getElseBlockAssignment_6_2()); 
            // InternalKlangParser.g:2534:2: ( rule__If__ElseBlockAssignment_6_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==Forever||(LA19_0>=Sleep && LA19_0<=While)||LA19_0==If||LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalKlangParser.g:2534:3: rule__If__ElseBlockAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__If__ElseBlockAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getIfAccess().getElseBlockAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_6__2__Impl"


    // $ANTLR start "rule__If__Group_6__3"
    // InternalKlangParser.g:2542:1: rule__If__Group_6__3 : rule__If__Group_6__3__Impl ;
    public final void rule__If__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2546:1: ( rule__If__Group_6__3__Impl )
            // InternalKlangParser.g:2547:2: rule__If__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_6__3"


    // $ANTLR start "rule__If__Group_6__3__Impl"
    // InternalKlangParser.g:2553:1: rule__If__Group_6__3__Impl : ( RULE_END ) ;
    public final void rule__If__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2557:1: ( ( RULE_END ) )
            // InternalKlangParser.g:2558:1: ( RULE_END )
            {
            // InternalKlangParser.g:2558:1: ( RULE_END )
            // InternalKlangParser.g:2559:2: RULE_END
            {
             before(grammarAccess.getIfAccess().getENDTerminalRuleCall_6_3()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getENDTerminalRuleCall_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_6__3__Impl"


    // $ANTLR start "rule__ForeverLoop__Group__0"
    // InternalKlangParser.g:2569:1: rule__ForeverLoop__Group__0 : rule__ForeverLoop__Group__0__Impl rule__ForeverLoop__Group__1 ;
    public final void rule__ForeverLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2573:1: ( rule__ForeverLoop__Group__0__Impl rule__ForeverLoop__Group__1 )
            // InternalKlangParser.g:2574:2: rule__ForeverLoop__Group__0__Impl rule__ForeverLoop__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__ForeverLoop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeverLoop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeverLoop__Group__0"


    // $ANTLR start "rule__ForeverLoop__Group__0__Impl"
    // InternalKlangParser.g:2581:1: rule__ForeverLoop__Group__0__Impl : ( () ) ;
    public final void rule__ForeverLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2585:1: ( ( () ) )
            // InternalKlangParser.g:2586:1: ( () )
            {
            // InternalKlangParser.g:2586:1: ( () )
            // InternalKlangParser.g:2587:2: ()
            {
             before(grammarAccess.getForeverLoopAccess().getForeverLoopAction_0()); 
            // InternalKlangParser.g:2588:2: ()
            // InternalKlangParser.g:2588:3: 
            {
            }

             after(grammarAccess.getForeverLoopAccess().getForeverLoopAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeverLoop__Group__0__Impl"


    // $ANTLR start "rule__ForeverLoop__Group__1"
    // InternalKlangParser.g:2596:1: rule__ForeverLoop__Group__1 : rule__ForeverLoop__Group__1__Impl rule__ForeverLoop__Group__2 ;
    public final void rule__ForeverLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2600:1: ( rule__ForeverLoop__Group__1__Impl rule__ForeverLoop__Group__2 )
            // InternalKlangParser.g:2601:2: rule__ForeverLoop__Group__1__Impl rule__ForeverLoop__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ForeverLoop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeverLoop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeverLoop__Group__1"


    // $ANTLR start "rule__ForeverLoop__Group__1__Impl"
    // InternalKlangParser.g:2608:1: rule__ForeverLoop__Group__1__Impl : ( Forever ) ;
    public final void rule__ForeverLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2612:1: ( ( Forever ) )
            // InternalKlangParser.g:2613:1: ( Forever )
            {
            // InternalKlangParser.g:2613:1: ( Forever )
            // InternalKlangParser.g:2614:2: Forever
            {
             before(grammarAccess.getForeverLoopAccess().getForeverKeyword_1()); 
            match(input,Forever,FOLLOW_2); 
             after(grammarAccess.getForeverLoopAccess().getForeverKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeverLoop__Group__1__Impl"


    // $ANTLR start "rule__ForeverLoop__Group__2"
    // InternalKlangParser.g:2623:1: rule__ForeverLoop__Group__2 : rule__ForeverLoop__Group__2__Impl rule__ForeverLoop__Group__3 ;
    public final void rule__ForeverLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2627:1: ( rule__ForeverLoop__Group__2__Impl rule__ForeverLoop__Group__3 )
            // InternalKlangParser.g:2628:2: rule__ForeverLoop__Group__2__Impl rule__ForeverLoop__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__ForeverLoop__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeverLoop__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeverLoop__Group__2"


    // $ANTLR start "rule__ForeverLoop__Group__2__Impl"
    // InternalKlangParser.g:2635:1: rule__ForeverLoop__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__ForeverLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2639:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:2640:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:2640:1: ( RULE_BEGIN )
            // InternalKlangParser.g:2641:2: RULE_BEGIN
            {
             before(grammarAccess.getForeverLoopAccess().getBEGINTerminalRuleCall_2()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getForeverLoopAccess().getBEGINTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeverLoop__Group__2__Impl"


    // $ANTLR start "rule__ForeverLoop__Group__3"
    // InternalKlangParser.g:2650:1: rule__ForeverLoop__Group__3 : rule__ForeverLoop__Group__3__Impl rule__ForeverLoop__Group__4 ;
    public final void rule__ForeverLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2654:1: ( rule__ForeverLoop__Group__3__Impl rule__ForeverLoop__Group__4 )
            // InternalKlangParser.g:2655:2: rule__ForeverLoop__Group__3__Impl rule__ForeverLoop__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__ForeverLoop__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeverLoop__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeverLoop__Group__3"


    // $ANTLR start "rule__ForeverLoop__Group__3__Impl"
    // InternalKlangParser.g:2662:1: rule__ForeverLoop__Group__3__Impl : ( ( rule__ForeverLoop__LoopStatementsAssignment_3 )* ) ;
    public final void rule__ForeverLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2666:1: ( ( ( rule__ForeverLoop__LoopStatementsAssignment_3 )* ) )
            // InternalKlangParser.g:2667:1: ( ( rule__ForeverLoop__LoopStatementsAssignment_3 )* )
            {
            // InternalKlangParser.g:2667:1: ( ( rule__ForeverLoop__LoopStatementsAssignment_3 )* )
            // InternalKlangParser.g:2668:2: ( rule__ForeverLoop__LoopStatementsAssignment_3 )*
            {
             before(grammarAccess.getForeverLoopAccess().getLoopStatementsAssignment_3()); 
            // InternalKlangParser.g:2669:2: ( rule__ForeverLoop__LoopStatementsAssignment_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==Forever||(LA20_0>=Sleep && LA20_0<=While)||LA20_0==If||LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalKlangParser.g:2669:3: rule__ForeverLoop__LoopStatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ForeverLoop__LoopStatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getForeverLoopAccess().getLoopStatementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeverLoop__Group__3__Impl"


    // $ANTLR start "rule__ForeverLoop__Group__4"
    // InternalKlangParser.g:2677:1: rule__ForeverLoop__Group__4 : rule__ForeverLoop__Group__4__Impl ;
    public final void rule__ForeverLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2681:1: ( rule__ForeverLoop__Group__4__Impl )
            // InternalKlangParser.g:2682:2: rule__ForeverLoop__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForeverLoop__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeverLoop__Group__4"


    // $ANTLR start "rule__ForeverLoop__Group__4__Impl"
    // InternalKlangParser.g:2688:1: rule__ForeverLoop__Group__4__Impl : ( RULE_END ) ;
    public final void rule__ForeverLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2692:1: ( ( RULE_END ) )
            // InternalKlangParser.g:2693:1: ( RULE_END )
            {
            // InternalKlangParser.g:2693:1: ( RULE_END )
            // InternalKlangParser.g:2694:2: RULE_END
            {
             before(grammarAccess.getForeverLoopAccess().getENDTerminalRuleCall_4()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getForeverLoopAccess().getENDTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeverLoop__Group__4__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalKlangParser.g:2704:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2708:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalKlangParser.g:2709:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalKlangParser.g:2716:1: rule__Variable__Group__0__Impl : ( Var ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2720:1: ( ( Var ) )
            // InternalKlangParser.g:2721:1: ( Var )
            {
            // InternalKlangParser.g:2721:1: ( Var )
            // InternalKlangParser.g:2722:2: Var
            {
             before(grammarAccess.getVariableAccess().getVarKeyword_0()); 
            match(input,Var,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalKlangParser.g:2731:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2735:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalKlangParser.g:2736:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalKlangParser.g:2743:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2747:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalKlangParser.g:2748:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalKlangParser.g:2748:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalKlangParser.g:2749:2: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalKlangParser.g:2750:2: ( rule__Variable__NameAssignment_1 )
            // InternalKlangParser.g:2750:3: rule__Variable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // InternalKlangParser.g:2758:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2762:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // InternalKlangParser.g:2763:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Variable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // InternalKlangParser.g:2770:1: rule__Variable__Group__2__Impl : ( EqualsSign ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2774:1: ( ( EqualsSign ) )
            // InternalKlangParser.g:2775:1: ( EqualsSign )
            {
            // InternalKlangParser.g:2775:1: ( EqualsSign )
            // InternalKlangParser.g:2776:2: EqualsSign
            {
             before(grammarAccess.getVariableAccess().getEqualsSignKeyword_2()); 
            match(input,EqualsSign,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group__3"
    // InternalKlangParser.g:2785:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2789:1: ( rule__Variable__Group__3__Impl )
            // InternalKlangParser.g:2790:2: rule__Variable__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3"


    // $ANTLR start "rule__Variable__Group__3__Impl"
    // InternalKlangParser.g:2796:1: rule__Variable__Group__3__Impl : ( ( rule__Variable__ExpressionAssignment_3 ) ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2800:1: ( ( ( rule__Variable__ExpressionAssignment_3 ) ) )
            // InternalKlangParser.g:2801:1: ( ( rule__Variable__ExpressionAssignment_3 ) )
            {
            // InternalKlangParser.g:2801:1: ( ( rule__Variable__ExpressionAssignment_3 ) )
            // InternalKlangParser.g:2802:2: ( rule__Variable__ExpressionAssignment_3 )
            {
             before(grammarAccess.getVariableAccess().getExpressionAssignment_3()); 
            // InternalKlangParser.g:2803:2: ( rule__Variable__ExpressionAssignment_3 )
            // InternalKlangParser.g:2803:3: rule__Variable__ExpressionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Variable__ExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getExpressionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3__Impl"


    // $ANTLR start "rule__VariableAssignment__Group__0"
    // InternalKlangParser.g:2812:1: rule__VariableAssignment__Group__0 : rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1 ;
    public final void rule__VariableAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2816:1: ( rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1 )
            // InternalKlangParser.g:2817:2: rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__VariableAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableAssignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignment__Group__0"


    // $ANTLR start "rule__VariableAssignment__Group__0__Impl"
    // InternalKlangParser.g:2824:1: rule__VariableAssignment__Group__0__Impl : ( ( rule__VariableAssignment__VariableNameAssignment_0 ) ) ;
    public final void rule__VariableAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2828:1: ( ( ( rule__VariableAssignment__VariableNameAssignment_0 ) ) )
            // InternalKlangParser.g:2829:1: ( ( rule__VariableAssignment__VariableNameAssignment_0 ) )
            {
            // InternalKlangParser.g:2829:1: ( ( rule__VariableAssignment__VariableNameAssignment_0 ) )
            // InternalKlangParser.g:2830:2: ( rule__VariableAssignment__VariableNameAssignment_0 )
            {
             before(grammarAccess.getVariableAssignmentAccess().getVariableNameAssignment_0()); 
            // InternalKlangParser.g:2831:2: ( rule__VariableAssignment__VariableNameAssignment_0 )
            // InternalKlangParser.g:2831:3: rule__VariableAssignment__VariableNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VariableAssignment__VariableNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAssignmentAccess().getVariableNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignment__Group__0__Impl"


    // $ANTLR start "rule__VariableAssignment__Group__1"
    // InternalKlangParser.g:2839:1: rule__VariableAssignment__Group__1 : rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2 ;
    public final void rule__VariableAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2843:1: ( rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2 )
            // InternalKlangParser.g:2844:2: rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__VariableAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableAssignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignment__Group__1"


    // $ANTLR start "rule__VariableAssignment__Group__1__Impl"
    // InternalKlangParser.g:2851:1: rule__VariableAssignment__Group__1__Impl : ( EqualsSign ) ;
    public final void rule__VariableAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2855:1: ( ( EqualsSign ) )
            // InternalKlangParser.g:2856:1: ( EqualsSign )
            {
            // InternalKlangParser.g:2856:1: ( EqualsSign )
            // InternalKlangParser.g:2857:2: EqualsSign
            {
             before(grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,EqualsSign,FOLLOW_2); 
             after(grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignment__Group__1__Impl"


    // $ANTLR start "rule__VariableAssignment__Group__2"
    // InternalKlangParser.g:2866:1: rule__VariableAssignment__Group__2 : rule__VariableAssignment__Group__2__Impl ;
    public final void rule__VariableAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2870:1: ( rule__VariableAssignment__Group__2__Impl )
            // InternalKlangParser.g:2871:2: rule__VariableAssignment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableAssignment__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignment__Group__2"


    // $ANTLR start "rule__VariableAssignment__Group__2__Impl"
    // InternalKlangParser.g:2877:1: rule__VariableAssignment__Group__2__Impl : ( ( rule__VariableAssignment__ExpressionAssignment_2 ) ) ;
    public final void rule__VariableAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2881:1: ( ( ( rule__VariableAssignment__ExpressionAssignment_2 ) ) )
            // InternalKlangParser.g:2882:1: ( ( rule__VariableAssignment__ExpressionAssignment_2 ) )
            {
            // InternalKlangParser.g:2882:1: ( ( rule__VariableAssignment__ExpressionAssignment_2 ) )
            // InternalKlangParser.g:2883:2: ( rule__VariableAssignment__ExpressionAssignment_2 )
            {
             before(grammarAccess.getVariableAssignmentAccess().getExpressionAssignment_2()); 
            // InternalKlangParser.g:2884:2: ( rule__VariableAssignment__ExpressionAssignment_2 )
            // InternalKlangParser.g:2884:3: rule__VariableAssignment__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VariableAssignment__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableAssignmentAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignment__Group__2__Impl"


    // $ANTLR start "rule__Sleep__Group__0"
    // InternalKlangParser.g:2893:1: rule__Sleep__Group__0 : rule__Sleep__Group__0__Impl rule__Sleep__Group__1 ;
    public final void rule__Sleep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2897:1: ( rule__Sleep__Group__0__Impl rule__Sleep__Group__1 )
            // InternalKlangParser.g:2898:2: rule__Sleep__Group__0__Impl rule__Sleep__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Sleep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sleep__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sleep__Group__0"


    // $ANTLR start "rule__Sleep__Group__0__Impl"
    // InternalKlangParser.g:2905:1: rule__Sleep__Group__0__Impl : ( () ) ;
    public final void rule__Sleep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2909:1: ( ( () ) )
            // InternalKlangParser.g:2910:1: ( () )
            {
            // InternalKlangParser.g:2910:1: ( () )
            // InternalKlangParser.g:2911:2: ()
            {
             before(grammarAccess.getSleepAccess().getSleepAction_0()); 
            // InternalKlangParser.g:2912:2: ()
            // InternalKlangParser.g:2912:3: 
            {
            }

             after(grammarAccess.getSleepAccess().getSleepAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sleep__Group__0__Impl"


    // $ANTLR start "rule__Sleep__Group__1"
    // InternalKlangParser.g:2920:1: rule__Sleep__Group__1 : rule__Sleep__Group__1__Impl rule__Sleep__Group__2 ;
    public final void rule__Sleep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2924:1: ( rule__Sleep__Group__1__Impl rule__Sleep__Group__2 )
            // InternalKlangParser.g:2925:2: rule__Sleep__Group__1__Impl rule__Sleep__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__Sleep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sleep__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sleep__Group__1"


    // $ANTLR start "rule__Sleep__Group__1__Impl"
    // InternalKlangParser.g:2932:1: rule__Sleep__Group__1__Impl : ( Sleep ) ;
    public final void rule__Sleep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2936:1: ( ( Sleep ) )
            // InternalKlangParser.g:2937:1: ( Sleep )
            {
            // InternalKlangParser.g:2937:1: ( Sleep )
            // InternalKlangParser.g:2938:2: Sleep
            {
             before(grammarAccess.getSleepAccess().getSleepKeyword_1()); 
            match(input,Sleep,FOLLOW_2); 
             after(grammarAccess.getSleepAccess().getSleepKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sleep__Group__1__Impl"


    // $ANTLR start "rule__Sleep__Group__2"
    // InternalKlangParser.g:2947:1: rule__Sleep__Group__2 : rule__Sleep__Group__2__Impl rule__Sleep__Group__3 ;
    public final void rule__Sleep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2951:1: ( rule__Sleep__Group__2__Impl rule__Sleep__Group__3 )
            // InternalKlangParser.g:2952:2: rule__Sleep__Group__2__Impl rule__Sleep__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Sleep__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sleep__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sleep__Group__2"


    // $ANTLR start "rule__Sleep__Group__2__Impl"
    // InternalKlangParser.g:2959:1: rule__Sleep__Group__2__Impl : ( LeftParenthesis ) ;
    public final void rule__Sleep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2963:1: ( ( LeftParenthesis ) )
            // InternalKlangParser.g:2964:1: ( LeftParenthesis )
            {
            // InternalKlangParser.g:2964:1: ( LeftParenthesis )
            // InternalKlangParser.g:2965:2: LeftParenthesis
            {
             before(grammarAccess.getSleepAccess().getLeftParenthesisKeyword_2()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getSleepAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sleep__Group__2__Impl"


    // $ANTLR start "rule__Sleep__Group__3"
    // InternalKlangParser.g:2974:1: rule__Sleep__Group__3 : rule__Sleep__Group__3__Impl rule__Sleep__Group__4 ;
    public final void rule__Sleep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2978:1: ( rule__Sleep__Group__3__Impl rule__Sleep__Group__4 )
            // InternalKlangParser.g:2979:2: rule__Sleep__Group__3__Impl rule__Sleep__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__Sleep__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sleep__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sleep__Group__3"


    // $ANTLR start "rule__Sleep__Group__3__Impl"
    // InternalKlangParser.g:2986:1: rule__Sleep__Group__3__Impl : ( ( rule__Sleep__DurationAssignment_3 ) ) ;
    public final void rule__Sleep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2990:1: ( ( ( rule__Sleep__DurationAssignment_3 ) ) )
            // InternalKlangParser.g:2991:1: ( ( rule__Sleep__DurationAssignment_3 ) )
            {
            // InternalKlangParser.g:2991:1: ( ( rule__Sleep__DurationAssignment_3 ) )
            // InternalKlangParser.g:2992:2: ( rule__Sleep__DurationAssignment_3 )
            {
             before(grammarAccess.getSleepAccess().getDurationAssignment_3()); 
            // InternalKlangParser.g:2993:2: ( rule__Sleep__DurationAssignment_3 )
            // InternalKlangParser.g:2993:3: rule__Sleep__DurationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Sleep__DurationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSleepAccess().getDurationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sleep__Group__3__Impl"


    // $ANTLR start "rule__Sleep__Group__4"
    // InternalKlangParser.g:3001:1: rule__Sleep__Group__4 : rule__Sleep__Group__4__Impl ;
    public final void rule__Sleep__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3005:1: ( rule__Sleep__Group__4__Impl )
            // InternalKlangParser.g:3006:2: rule__Sleep__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sleep__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sleep__Group__4"


    // $ANTLR start "rule__Sleep__Group__4__Impl"
    // InternalKlangParser.g:3012:1: rule__Sleep__Group__4__Impl : ( RightParenthesis ) ;
    public final void rule__Sleep__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3016:1: ( ( RightParenthesis ) )
            // InternalKlangParser.g:3017:1: ( RightParenthesis )
            {
            // InternalKlangParser.g:3017:1: ( RightParenthesis )
            // InternalKlangParser.g:3018:2: RightParenthesis
            {
             before(grammarAccess.getSleepAccess().getRightParenthesisKeyword_4()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getSleepAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sleep__Group__4__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // InternalKlangParser.g:3028:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3032:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalKlangParser.g:3033:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Or__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // InternalKlangParser.g:3040:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3044:1: ( ( ruleAnd ) )
            // InternalKlangParser.g:3045:1: ( ruleAnd )
            {
            // InternalKlangParser.g:3045:1: ( ruleAnd )
            // InternalKlangParser.g:3046:2: ruleAnd
            {
             before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // InternalKlangParser.g:3055:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3059:1: ( rule__Or__Group__1__Impl )
            // InternalKlangParser.g:3060:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // InternalKlangParser.g:3066:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3070:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalKlangParser.g:3071:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalKlangParser.g:3071:1: ( ( rule__Or__Group_1__0 )* )
            // InternalKlangParser.g:3072:2: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // InternalKlangParser.g:3073:2: ( rule__Or__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Or) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalKlangParser.g:3073:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Or__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getOrAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group_1__0"
    // InternalKlangParser.g:3082:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3086:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalKlangParser.g:3087:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_32);
            rule__Or__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0"


    // $ANTLR start "rule__Or__Group_1__0__Impl"
    // InternalKlangParser.g:3094:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3098:1: ( ( () ) )
            // InternalKlangParser.g:3099:1: ( () )
            {
            // InternalKlangParser.g:3099:1: ( () )
            // InternalKlangParser.g:3100:2: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // InternalKlangParser.g:3101:2: ()
            // InternalKlangParser.g:3101:3: 
            {
            }

             after(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0__Impl"


    // $ANTLR start "rule__Or__Group_1__1"
    // InternalKlangParser.g:3109:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3113:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalKlangParser.g:3114:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_23);
            rule__Or__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1"


    // $ANTLR start "rule__Or__Group_1__1__Impl"
    // InternalKlangParser.g:3121:1: rule__Or__Group_1__1__Impl : ( Or ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3125:1: ( ( Or ) )
            // InternalKlangParser.g:3126:1: ( Or )
            {
            // InternalKlangParser.g:3126:1: ( Or )
            // InternalKlangParser.g:3127:2: Or
            {
             before(grammarAccess.getOrAccess().getOrKeyword_1_1()); 
            match(input,Or,FOLLOW_2); 
             after(grammarAccess.getOrAccess().getOrKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1__Impl"


    // $ANTLR start "rule__Or__Group_1__2"
    // InternalKlangParser.g:3136:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3140:1: ( rule__Or__Group_1__2__Impl )
            // InternalKlangParser.g:3141:2: rule__Or__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2"


    // $ANTLR start "rule__Or__Group_1__2__Impl"
    // InternalKlangParser.g:3147:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3151:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:3152:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:3152:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalKlangParser.g:3153:2: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:3154:2: ( rule__Or__RightAssignment_1_2 )
            // InternalKlangParser.g:3154:3: rule__Or__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Or__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2__Impl"


    // $ANTLR start "rule__And__Group__0"
    // InternalKlangParser.g:3163:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3167:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalKlangParser.g:3168:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__And__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // InternalKlangParser.g:3175:1: rule__And__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3179:1: ( ( ruleComparison ) )
            // InternalKlangParser.g:3180:1: ( ruleComparison )
            {
            // InternalKlangParser.g:3180:1: ( ruleComparison )
            // InternalKlangParser.g:3181:2: ruleComparison
            {
             before(grammarAccess.getAndAccess().getComparisonParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getAndAccess().getComparisonParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // InternalKlangParser.g:3190:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3194:1: ( rule__And__Group__1__Impl )
            // InternalKlangParser.g:3195:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // InternalKlangParser.g:3201:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3205:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalKlangParser.g:3206:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalKlangParser.g:3206:1: ( ( rule__And__Group_1__0 )* )
            // InternalKlangParser.g:3207:2: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // InternalKlangParser.g:3208:2: ( rule__And__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==And) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalKlangParser.g:3208:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__And__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getAndAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group_1__0"
    // InternalKlangParser.g:3217:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3221:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalKlangParser.g:3222:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_34);
            rule__And__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0"


    // $ANTLR start "rule__And__Group_1__0__Impl"
    // InternalKlangParser.g:3229:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3233:1: ( ( () ) )
            // InternalKlangParser.g:3234:1: ( () )
            {
            // InternalKlangParser.g:3234:1: ( () )
            // InternalKlangParser.g:3235:2: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // InternalKlangParser.g:3236:2: ()
            // InternalKlangParser.g:3236:3: 
            {
            }

             after(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0__Impl"


    // $ANTLR start "rule__And__Group_1__1"
    // InternalKlangParser.g:3244:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3248:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalKlangParser.g:3249:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_23);
            rule__And__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1"


    // $ANTLR start "rule__And__Group_1__1__Impl"
    // InternalKlangParser.g:3256:1: rule__And__Group_1__1__Impl : ( And ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3260:1: ( ( And ) )
            // InternalKlangParser.g:3261:1: ( And )
            {
            // InternalKlangParser.g:3261:1: ( And )
            // InternalKlangParser.g:3262:2: And
            {
             before(grammarAccess.getAndAccess().getAndKeyword_1_1()); 
            match(input,And,FOLLOW_2); 
             after(grammarAccess.getAndAccess().getAndKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1__Impl"


    // $ANTLR start "rule__And__Group_1__2"
    // InternalKlangParser.g:3271:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3275:1: ( rule__And__Group_1__2__Impl )
            // InternalKlangParser.g:3276:2: rule__And__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2"


    // $ANTLR start "rule__And__Group_1__2__Impl"
    // InternalKlangParser.g:3282:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3286:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:3287:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:3287:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalKlangParser.g:3288:2: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:3289:2: ( rule__And__RightAssignment_1_2 )
            // InternalKlangParser.g:3289:3: rule__And__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__And__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2__Impl"


    // $ANTLR start "rule__Plus__Group__0"
    // InternalKlangParser.g:3298:1: rule__Plus__Group__0 : rule__Plus__Group__0__Impl rule__Plus__Group__1 ;
    public final void rule__Plus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3302:1: ( rule__Plus__Group__0__Impl rule__Plus__Group__1 )
            // InternalKlangParser.g:3303:2: rule__Plus__Group__0__Impl rule__Plus__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__Plus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plus__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plus__Group__0"


    // $ANTLR start "rule__Plus__Group__0__Impl"
    // InternalKlangParser.g:3310:1: rule__Plus__Group__0__Impl : ( ruleMinus ) ;
    public final void rule__Plus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3314:1: ( ( ruleMinus ) )
            // InternalKlangParser.g:3315:1: ( ruleMinus )
            {
            // InternalKlangParser.g:3315:1: ( ruleMinus )
            // InternalKlangParser.g:3316:2: ruleMinus
            {
             before(grammarAccess.getPlusAccess().getMinusParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMinus();

            state._fsp--;

             after(grammarAccess.getPlusAccess().getMinusParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plus__Group__0__Impl"


    // $ANTLR start "rule__Plus__Group__1"
    // InternalKlangParser.g:3325:1: rule__Plus__Group__1 : rule__Plus__Group__1__Impl ;
    public final void rule__Plus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3329:1: ( rule__Plus__Group__1__Impl )
            // InternalKlangParser.g:3330:2: rule__Plus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Plus__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plus__Group__1"


    // $ANTLR start "rule__Plus__Group__1__Impl"
    // InternalKlangParser.g:3336:1: rule__Plus__Group__1__Impl : ( ( rule__Plus__Group_1__0 )* ) ;
    public final void rule__Plus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3340:1: ( ( ( rule__Plus__Group_1__0 )* ) )
            // InternalKlangParser.g:3341:1: ( ( rule__Plus__Group_1__0 )* )
            {
            // InternalKlangParser.g:3341:1: ( ( rule__Plus__Group_1__0 )* )
            // InternalKlangParser.g:3342:2: ( rule__Plus__Group_1__0 )*
            {
             before(grammarAccess.getPlusAccess().getGroup_1()); 
            // InternalKlangParser.g:3343:2: ( rule__Plus__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==PlusSign) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalKlangParser.g:3343:3: rule__Plus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__Plus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getPlusAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plus__Group__1__Impl"


    // $ANTLR start "rule__Plus__Group_1__0"
    // InternalKlangParser.g:3352:1: rule__Plus__Group_1__0 : rule__Plus__Group_1__0__Impl rule__Plus__Group_1__1 ;
    public final void rule__Plus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3356:1: ( rule__Plus__Group_1__0__Impl rule__Plus__Group_1__1 )
            // InternalKlangParser.g:3357:2: rule__Plus__Group_1__0__Impl rule__Plus__Group_1__1
            {
            pushFollow(FOLLOW_36);
            rule__Plus__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plus__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plus__Group_1__0"


    // $ANTLR start "rule__Plus__Group_1__0__Impl"
    // InternalKlangParser.g:3364:1: rule__Plus__Group_1__0__Impl : ( () ) ;
    public final void rule__Plus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3368:1: ( ( () ) )
            // InternalKlangParser.g:3369:1: ( () )
            {
            // InternalKlangParser.g:3369:1: ( () )
            // InternalKlangParser.g:3370:2: ()
            {
             before(grammarAccess.getPlusAccess().getPlusLeftAction_1_0()); 
            // InternalKlangParser.g:3371:2: ()
            // InternalKlangParser.g:3371:3: 
            {
            }

             after(grammarAccess.getPlusAccess().getPlusLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plus__Group_1__0__Impl"


    // $ANTLR start "rule__Plus__Group_1__1"
    // InternalKlangParser.g:3379:1: rule__Plus__Group_1__1 : rule__Plus__Group_1__1__Impl rule__Plus__Group_1__2 ;
    public final void rule__Plus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3383:1: ( rule__Plus__Group_1__1__Impl rule__Plus__Group_1__2 )
            // InternalKlangParser.g:3384:2: rule__Plus__Group_1__1__Impl rule__Plus__Group_1__2
            {
            pushFollow(FOLLOW_23);
            rule__Plus__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plus__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plus__Group_1__1"


    // $ANTLR start "rule__Plus__Group_1__1__Impl"
    // InternalKlangParser.g:3391:1: rule__Plus__Group_1__1__Impl : ( PlusSign ) ;
    public final void rule__Plus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3395:1: ( ( PlusSign ) )
            // InternalKlangParser.g:3396:1: ( PlusSign )
            {
            // InternalKlangParser.g:3396:1: ( PlusSign )
            // InternalKlangParser.g:3397:2: PlusSign
            {
             before(grammarAccess.getPlusAccess().getPlusSignKeyword_1_1()); 
            match(input,PlusSign,FOLLOW_2); 
             after(grammarAccess.getPlusAccess().getPlusSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plus__Group_1__1__Impl"


    // $ANTLR start "rule__Plus__Group_1__2"
    // InternalKlangParser.g:3406:1: rule__Plus__Group_1__2 : rule__Plus__Group_1__2__Impl ;
    public final void rule__Plus__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3410:1: ( rule__Plus__Group_1__2__Impl )
            // InternalKlangParser.g:3411:2: rule__Plus__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Plus__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plus__Group_1__2"


    // $ANTLR start "rule__Plus__Group_1__2__Impl"
    // InternalKlangParser.g:3417:1: rule__Plus__Group_1__2__Impl : ( ( rule__Plus__RightAssignment_1_2 ) ) ;
    public final void rule__Plus__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3421:1: ( ( ( rule__Plus__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:3422:1: ( ( rule__Plus__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:3422:1: ( ( rule__Plus__RightAssignment_1_2 ) )
            // InternalKlangParser.g:3423:2: ( rule__Plus__RightAssignment_1_2 )
            {
             before(grammarAccess.getPlusAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:3424:2: ( rule__Plus__RightAssignment_1_2 )
            // InternalKlangParser.g:3424:3: rule__Plus__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Plus__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPlusAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plus__Group_1__2__Impl"


    // $ANTLR start "rule__Minus__Group__0"
    // InternalKlangParser.g:3433:1: rule__Minus__Group__0 : rule__Minus__Group__0__Impl rule__Minus__Group__1 ;
    public final void rule__Minus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3437:1: ( rule__Minus__Group__0__Impl rule__Minus__Group__1 )
            // InternalKlangParser.g:3438:2: rule__Minus__Group__0__Impl rule__Minus__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Minus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Minus__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Minus__Group__0"


    // $ANTLR start "rule__Minus__Group__0__Impl"
    // InternalKlangParser.g:3445:1: rule__Minus__Group__0__Impl : ( ruleMultiply ) ;
    public final void rule__Minus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3449:1: ( ( ruleMultiply ) )
            // InternalKlangParser.g:3450:1: ( ruleMultiply )
            {
            // InternalKlangParser.g:3450:1: ( ruleMultiply )
            // InternalKlangParser.g:3451:2: ruleMultiply
            {
             before(grammarAccess.getMinusAccess().getMultiplyParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiply();

            state._fsp--;

             after(grammarAccess.getMinusAccess().getMultiplyParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Minus__Group__0__Impl"


    // $ANTLR start "rule__Minus__Group__1"
    // InternalKlangParser.g:3460:1: rule__Minus__Group__1 : rule__Minus__Group__1__Impl ;
    public final void rule__Minus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3464:1: ( rule__Minus__Group__1__Impl )
            // InternalKlangParser.g:3465:2: rule__Minus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Minus__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Minus__Group__1"


    // $ANTLR start "rule__Minus__Group__1__Impl"
    // InternalKlangParser.g:3471:1: rule__Minus__Group__1__Impl : ( ( rule__Minus__Group_1__0 )* ) ;
    public final void rule__Minus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3475:1: ( ( ( rule__Minus__Group_1__0 )* ) )
            // InternalKlangParser.g:3476:1: ( ( rule__Minus__Group_1__0 )* )
            {
            // InternalKlangParser.g:3476:1: ( ( rule__Minus__Group_1__0 )* )
            // InternalKlangParser.g:3477:2: ( rule__Minus__Group_1__0 )*
            {
             before(grammarAccess.getMinusAccess().getGroup_1()); 
            // InternalKlangParser.g:3478:2: ( rule__Minus__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==HyphenMinus) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalKlangParser.g:3478:3: rule__Minus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__Minus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getMinusAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Minus__Group__1__Impl"


    // $ANTLR start "rule__Minus__Group_1__0"
    // InternalKlangParser.g:3487:1: rule__Minus__Group_1__0 : rule__Minus__Group_1__0__Impl rule__Minus__Group_1__1 ;
    public final void rule__Minus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3491:1: ( rule__Minus__Group_1__0__Impl rule__Minus__Group_1__1 )
            // InternalKlangParser.g:3492:2: rule__Minus__Group_1__0__Impl rule__Minus__Group_1__1
            {
            pushFollow(FOLLOW_38);
            rule__Minus__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Minus__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Minus__Group_1__0"


    // $ANTLR start "rule__Minus__Group_1__0__Impl"
    // InternalKlangParser.g:3499:1: rule__Minus__Group_1__0__Impl : ( () ) ;
    public final void rule__Minus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3503:1: ( ( () ) )
            // InternalKlangParser.g:3504:1: ( () )
            {
            // InternalKlangParser.g:3504:1: ( () )
            // InternalKlangParser.g:3505:2: ()
            {
             before(grammarAccess.getMinusAccess().getMinusLeftAction_1_0()); 
            // InternalKlangParser.g:3506:2: ()
            // InternalKlangParser.g:3506:3: 
            {
            }

             after(grammarAccess.getMinusAccess().getMinusLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Minus__Group_1__0__Impl"


    // $ANTLR start "rule__Minus__Group_1__1"
    // InternalKlangParser.g:3514:1: rule__Minus__Group_1__1 : rule__Minus__Group_1__1__Impl rule__Minus__Group_1__2 ;
    public final void rule__Minus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3518:1: ( rule__Minus__Group_1__1__Impl rule__Minus__Group_1__2 )
            // InternalKlangParser.g:3519:2: rule__Minus__Group_1__1__Impl rule__Minus__Group_1__2
            {
            pushFollow(FOLLOW_23);
            rule__Minus__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Minus__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Minus__Group_1__1"


    // $ANTLR start "rule__Minus__Group_1__1__Impl"
    // InternalKlangParser.g:3526:1: rule__Minus__Group_1__1__Impl : ( HyphenMinus ) ;
    public final void rule__Minus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3530:1: ( ( HyphenMinus ) )
            // InternalKlangParser.g:3531:1: ( HyphenMinus )
            {
            // InternalKlangParser.g:3531:1: ( HyphenMinus )
            // InternalKlangParser.g:3532:2: HyphenMinus
            {
             before(grammarAccess.getMinusAccess().getHyphenMinusKeyword_1_1()); 
            match(input,HyphenMinus,FOLLOW_2); 
             after(grammarAccess.getMinusAccess().getHyphenMinusKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Minus__Group_1__1__Impl"


    // $ANTLR start "rule__Minus__Group_1__2"
    // InternalKlangParser.g:3541:1: rule__Minus__Group_1__2 : rule__Minus__Group_1__2__Impl ;
    public final void rule__Minus__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3545:1: ( rule__Minus__Group_1__2__Impl )
            // InternalKlangParser.g:3546:2: rule__Minus__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Minus__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Minus__Group_1__2"


    // $ANTLR start "rule__Minus__Group_1__2__Impl"
    // InternalKlangParser.g:3552:1: rule__Minus__Group_1__2__Impl : ( ( rule__Minus__RightAssignment_1_2 ) ) ;
    public final void rule__Minus__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3556:1: ( ( ( rule__Minus__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:3557:1: ( ( rule__Minus__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:3557:1: ( ( rule__Minus__RightAssignment_1_2 ) )
            // InternalKlangParser.g:3558:2: ( rule__Minus__RightAssignment_1_2 )
            {
             before(grammarAccess.getMinusAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:3559:2: ( rule__Minus__RightAssignment_1_2 )
            // InternalKlangParser.g:3559:3: rule__Minus__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Minus__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMinusAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Minus__Group_1__2__Impl"


    // $ANTLR start "rule__Multiply__Group__0"
    // InternalKlangParser.g:3568:1: rule__Multiply__Group__0 : rule__Multiply__Group__0__Impl rule__Multiply__Group__1 ;
    public final void rule__Multiply__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3572:1: ( rule__Multiply__Group__0__Impl rule__Multiply__Group__1 )
            // InternalKlangParser.g:3573:2: rule__Multiply__Group__0__Impl rule__Multiply__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__Multiply__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiply__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group__0"


    // $ANTLR start "rule__Multiply__Group__0__Impl"
    // InternalKlangParser.g:3580:1: rule__Multiply__Group__0__Impl : ( ruleDivide ) ;
    public final void rule__Multiply__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3584:1: ( ( ruleDivide ) )
            // InternalKlangParser.g:3585:1: ( ruleDivide )
            {
            // InternalKlangParser.g:3585:1: ( ruleDivide )
            // InternalKlangParser.g:3586:2: ruleDivide
            {
             before(grammarAccess.getMultiplyAccess().getDivideParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDivide();

            state._fsp--;

             after(grammarAccess.getMultiplyAccess().getDivideParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group__0__Impl"


    // $ANTLR start "rule__Multiply__Group__1"
    // InternalKlangParser.g:3595:1: rule__Multiply__Group__1 : rule__Multiply__Group__1__Impl ;
    public final void rule__Multiply__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3599:1: ( rule__Multiply__Group__1__Impl )
            // InternalKlangParser.g:3600:2: rule__Multiply__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiply__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group__1"


    // $ANTLR start "rule__Multiply__Group__1__Impl"
    // InternalKlangParser.g:3606:1: rule__Multiply__Group__1__Impl : ( ( rule__Multiply__Group_1__0 )* ) ;
    public final void rule__Multiply__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3610:1: ( ( ( rule__Multiply__Group_1__0 )* ) )
            // InternalKlangParser.g:3611:1: ( ( rule__Multiply__Group_1__0 )* )
            {
            // InternalKlangParser.g:3611:1: ( ( rule__Multiply__Group_1__0 )* )
            // InternalKlangParser.g:3612:2: ( rule__Multiply__Group_1__0 )*
            {
             before(grammarAccess.getMultiplyAccess().getGroup_1()); 
            // InternalKlangParser.g:3613:2: ( rule__Multiply__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==Asterisk) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalKlangParser.g:3613:3: rule__Multiply__Group_1__0
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__Multiply__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getMultiplyAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group__1__Impl"


    // $ANTLR start "rule__Multiply__Group_1__0"
    // InternalKlangParser.g:3622:1: rule__Multiply__Group_1__0 : rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1 ;
    public final void rule__Multiply__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3626:1: ( rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1 )
            // InternalKlangParser.g:3627:2: rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1
            {
            pushFollow(FOLLOW_40);
            rule__Multiply__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiply__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group_1__0"


    // $ANTLR start "rule__Multiply__Group_1__0__Impl"
    // InternalKlangParser.g:3634:1: rule__Multiply__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiply__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3638:1: ( ( () ) )
            // InternalKlangParser.g:3639:1: ( () )
            {
            // InternalKlangParser.g:3639:1: ( () )
            // InternalKlangParser.g:3640:2: ()
            {
             before(grammarAccess.getMultiplyAccess().getMultiplyLeftAction_1_0()); 
            // InternalKlangParser.g:3641:2: ()
            // InternalKlangParser.g:3641:3: 
            {
            }

             after(grammarAccess.getMultiplyAccess().getMultiplyLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group_1__0__Impl"


    // $ANTLR start "rule__Multiply__Group_1__1"
    // InternalKlangParser.g:3649:1: rule__Multiply__Group_1__1 : rule__Multiply__Group_1__1__Impl rule__Multiply__Group_1__2 ;
    public final void rule__Multiply__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3653:1: ( rule__Multiply__Group_1__1__Impl rule__Multiply__Group_1__2 )
            // InternalKlangParser.g:3654:2: rule__Multiply__Group_1__1__Impl rule__Multiply__Group_1__2
            {
            pushFollow(FOLLOW_23);
            rule__Multiply__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiply__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group_1__1"


    // $ANTLR start "rule__Multiply__Group_1__1__Impl"
    // InternalKlangParser.g:3661:1: rule__Multiply__Group_1__1__Impl : ( Asterisk ) ;
    public final void rule__Multiply__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3665:1: ( ( Asterisk ) )
            // InternalKlangParser.g:3666:1: ( Asterisk )
            {
            // InternalKlangParser.g:3666:1: ( Asterisk )
            // InternalKlangParser.g:3667:2: Asterisk
            {
             before(grammarAccess.getMultiplyAccess().getAsteriskKeyword_1_1()); 
            match(input,Asterisk,FOLLOW_2); 
             after(grammarAccess.getMultiplyAccess().getAsteriskKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group_1__1__Impl"


    // $ANTLR start "rule__Multiply__Group_1__2"
    // InternalKlangParser.g:3676:1: rule__Multiply__Group_1__2 : rule__Multiply__Group_1__2__Impl ;
    public final void rule__Multiply__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3680:1: ( rule__Multiply__Group_1__2__Impl )
            // InternalKlangParser.g:3681:2: rule__Multiply__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiply__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group_1__2"


    // $ANTLR start "rule__Multiply__Group_1__2__Impl"
    // InternalKlangParser.g:3687:1: rule__Multiply__Group_1__2__Impl : ( ( rule__Multiply__RightAssignment_1_2 ) ) ;
    public final void rule__Multiply__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3691:1: ( ( ( rule__Multiply__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:3692:1: ( ( rule__Multiply__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:3692:1: ( ( rule__Multiply__RightAssignment_1_2 ) )
            // InternalKlangParser.g:3693:2: ( rule__Multiply__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplyAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:3694:2: ( rule__Multiply__RightAssignment_1_2 )
            // InternalKlangParser.g:3694:3: rule__Multiply__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Multiply__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplyAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group_1__2__Impl"


    // $ANTLR start "rule__Divide__Group__0"
    // InternalKlangParser.g:3703:1: rule__Divide__Group__0 : rule__Divide__Group__0__Impl rule__Divide__Group__1 ;
    public final void rule__Divide__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3707:1: ( rule__Divide__Group__0__Impl rule__Divide__Group__1 )
            // InternalKlangParser.g:3708:2: rule__Divide__Group__0__Impl rule__Divide__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__Divide__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Divide__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Divide__Group__0"


    // $ANTLR start "rule__Divide__Group__0__Impl"
    // InternalKlangParser.g:3715:1: rule__Divide__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__Divide__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3719:1: ( ( rulePrimaryExpression ) )
            // InternalKlangParser.g:3720:1: ( rulePrimaryExpression )
            {
            // InternalKlangParser.g:3720:1: ( rulePrimaryExpression )
            // InternalKlangParser.g:3721:2: rulePrimaryExpression
            {
             before(grammarAccess.getDivideAccess().getPrimaryExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getDivideAccess().getPrimaryExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Divide__Group__0__Impl"


    // $ANTLR start "rule__Divide__Group__1"
    // InternalKlangParser.g:3730:1: rule__Divide__Group__1 : rule__Divide__Group__1__Impl ;
    public final void rule__Divide__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3734:1: ( rule__Divide__Group__1__Impl )
            // InternalKlangParser.g:3735:2: rule__Divide__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Divide__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Divide__Group__1"


    // $ANTLR start "rule__Divide__Group__1__Impl"
    // InternalKlangParser.g:3741:1: rule__Divide__Group__1__Impl : ( ( rule__Divide__Group_1__0 )* ) ;
    public final void rule__Divide__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3745:1: ( ( ( rule__Divide__Group_1__0 )* ) )
            // InternalKlangParser.g:3746:1: ( ( rule__Divide__Group_1__0 )* )
            {
            // InternalKlangParser.g:3746:1: ( ( rule__Divide__Group_1__0 )* )
            // InternalKlangParser.g:3747:2: ( rule__Divide__Group_1__0 )*
            {
             before(grammarAccess.getDivideAccess().getGroup_1()); 
            // InternalKlangParser.g:3748:2: ( rule__Divide__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==Solidus) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalKlangParser.g:3748:3: rule__Divide__Group_1__0
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__Divide__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getDivideAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Divide__Group__1__Impl"


    // $ANTLR start "rule__Divide__Group_1__0"
    // InternalKlangParser.g:3757:1: rule__Divide__Group_1__0 : rule__Divide__Group_1__0__Impl rule__Divide__Group_1__1 ;
    public final void rule__Divide__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3761:1: ( rule__Divide__Group_1__0__Impl rule__Divide__Group_1__1 )
            // InternalKlangParser.g:3762:2: rule__Divide__Group_1__0__Impl rule__Divide__Group_1__1
            {
            pushFollow(FOLLOW_42);
            rule__Divide__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Divide__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Divide__Group_1__0"


    // $ANTLR start "rule__Divide__Group_1__0__Impl"
    // InternalKlangParser.g:3769:1: rule__Divide__Group_1__0__Impl : ( () ) ;
    public final void rule__Divide__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3773:1: ( ( () ) )
            // InternalKlangParser.g:3774:1: ( () )
            {
            // InternalKlangParser.g:3774:1: ( () )
            // InternalKlangParser.g:3775:2: ()
            {
             before(grammarAccess.getDivideAccess().getDivideLeftAction_1_0()); 
            // InternalKlangParser.g:3776:2: ()
            // InternalKlangParser.g:3776:3: 
            {
            }

             after(grammarAccess.getDivideAccess().getDivideLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Divide__Group_1__0__Impl"


    // $ANTLR start "rule__Divide__Group_1__1"
    // InternalKlangParser.g:3784:1: rule__Divide__Group_1__1 : rule__Divide__Group_1__1__Impl rule__Divide__Group_1__2 ;
    public final void rule__Divide__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3788:1: ( rule__Divide__Group_1__1__Impl rule__Divide__Group_1__2 )
            // InternalKlangParser.g:3789:2: rule__Divide__Group_1__1__Impl rule__Divide__Group_1__2
            {
            pushFollow(FOLLOW_23);
            rule__Divide__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Divide__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Divide__Group_1__1"


    // $ANTLR start "rule__Divide__Group_1__1__Impl"
    // InternalKlangParser.g:3796:1: rule__Divide__Group_1__1__Impl : ( Solidus ) ;
    public final void rule__Divide__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3800:1: ( ( Solidus ) )
            // InternalKlangParser.g:3801:1: ( Solidus )
            {
            // InternalKlangParser.g:3801:1: ( Solidus )
            // InternalKlangParser.g:3802:2: Solidus
            {
             before(grammarAccess.getDivideAccess().getSolidusKeyword_1_1()); 
            match(input,Solidus,FOLLOW_2); 
             after(grammarAccess.getDivideAccess().getSolidusKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Divide__Group_1__1__Impl"


    // $ANTLR start "rule__Divide__Group_1__2"
    // InternalKlangParser.g:3811:1: rule__Divide__Group_1__2 : rule__Divide__Group_1__2__Impl ;
    public final void rule__Divide__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3815:1: ( rule__Divide__Group_1__2__Impl )
            // InternalKlangParser.g:3816:2: rule__Divide__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Divide__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Divide__Group_1__2"


    // $ANTLR start "rule__Divide__Group_1__2__Impl"
    // InternalKlangParser.g:3822:1: rule__Divide__Group_1__2__Impl : ( ( rule__Divide__RightAssignment_1_2 ) ) ;
    public final void rule__Divide__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3826:1: ( ( ( rule__Divide__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:3827:1: ( ( rule__Divide__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:3827:1: ( ( rule__Divide__RightAssignment_1_2 ) )
            // InternalKlangParser.g:3828:2: ( rule__Divide__RightAssignment_1_2 )
            {
             before(grammarAccess.getDivideAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:3829:2: ( rule__Divide__RightAssignment_1_2 )
            // InternalKlangParser.g:3829:3: rule__Divide__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Divide__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDivideAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Divide__Group_1__2__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // InternalKlangParser.g:3838:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3842:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalKlangParser.g:3843:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // InternalKlangParser.g:3850:1: rule__Comparison__Group__0__Impl : ( rulePlus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3854:1: ( ( rulePlus ) )
            // InternalKlangParser.g:3855:1: ( rulePlus )
            {
            // InternalKlangParser.g:3855:1: ( rulePlus )
            // InternalKlangParser.g:3856:2: rulePlus
            {
             before(grammarAccess.getComparisonAccess().getPlusParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePlus();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getPlusParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // InternalKlangParser.g:3865:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3869:1: ( rule__Comparison__Group__1__Impl )
            // InternalKlangParser.g:3870:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // InternalKlangParser.g:3876:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3880:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalKlangParser.g:3881:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalKlangParser.g:3881:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalKlangParser.g:3882:2: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // InternalKlangParser.g:3883:2: ( rule__Comparison__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==EqualsSignEqualsSign||LA27_0==LessThanSign||LA27_0==GreaterThanSign) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalKlangParser.g:3883:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getComparisonAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__0"
    // InternalKlangParser.g:3892:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3896:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalKlangParser.g:3897:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0"


    // $ANTLR start "rule__Comparison__Group_1__0__Impl"
    // InternalKlangParser.g:3904:1: rule__Comparison__Group_1__0__Impl : ( ( rule__Comparison__Alternatives_1_0 ) ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3908:1: ( ( ( rule__Comparison__Alternatives_1_0 ) ) )
            // InternalKlangParser.g:3909:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            {
            // InternalKlangParser.g:3909:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            // InternalKlangParser.g:3910:2: ( rule__Comparison__Alternatives_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getAlternatives_1_0()); 
            // InternalKlangParser.g:3911:2: ( rule__Comparison__Alternatives_1_0 )
            // InternalKlangParser.g:3911:3: rule__Comparison__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1__1"
    // InternalKlangParser.g:3919:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3923:1: ( rule__Comparison__Group_1__1__Impl )
            // InternalKlangParser.g:3924:2: rule__Comparison__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__1"


    // $ANTLR start "rule__Comparison__Group_1__1__Impl"
    // InternalKlangParser.g:3930:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__RightAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3934:1: ( ( ( rule__Comparison__RightAssignment_1_1 ) ) )
            // InternalKlangParser.g:3935:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            {
            // InternalKlangParser.g:3935:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            // InternalKlangParser.g:3936:2: ( rule__Comparison__RightAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_1()); 
            // InternalKlangParser.g:3937:2: ( rule__Comparison__RightAssignment_1_1 )
            // InternalKlangParser.g:3937:3: rule__Comparison__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_0__0"
    // InternalKlangParser.g:3946:1: rule__Comparison__Group_1_0_0__0 : rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 ;
    public final void rule__Comparison__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3950:1: ( rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 )
            // InternalKlangParser.g:3951:2: rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1
            {
            pushFollow(FOLLOW_1);
            rule__Comparison__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_0__0"


    // $ANTLR start "rule__Comparison__Group_1_0_0__0__Impl"
    // InternalKlangParser.g:3958:1: rule__Comparison__Group_1_0_0__0__Impl : ( LessThanSign ) ;
    public final void rule__Comparison__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3962:1: ( ( LessThanSign ) )
            // InternalKlangParser.g:3963:1: ( LessThanSign )
            {
            // InternalKlangParser.g:3963:1: ( LessThanSign )
            // InternalKlangParser.g:3964:2: LessThanSign
            {
             before(grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_0_0()); 
            match(input,LessThanSign,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_0__1"
    // InternalKlangParser.g:3973:1: rule__Comparison__Group_1_0_0__1 : rule__Comparison__Group_1_0_0__1__Impl ;
    public final void rule__Comparison__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3977:1: ( rule__Comparison__Group_1_0_0__1__Impl )
            // InternalKlangParser.g:3978:2: rule__Comparison__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_0__1"


    // $ANTLR start "rule__Comparison__Group_1_0_0__1__Impl"
    // InternalKlangParser.g:3984:1: rule__Comparison__Group_1_0_0__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3988:1: ( ( () ) )
            // InternalKlangParser.g:3989:1: ( () )
            {
            // InternalKlangParser.g:3989:1: ( () )
            // InternalKlangParser.g:3990:2: ()
            {
             before(grammarAccess.getComparisonAccess().getLessThanLeftAction_1_0_0_1()); 
            // InternalKlangParser.g:3991:2: ()
            // InternalKlangParser.g:3991:3: 
            {
            }

             after(grammarAccess.getComparisonAccess().getLessThanLeftAction_1_0_0_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_1__0"
    // InternalKlangParser.g:4000:1: rule__Comparison__Group_1_0_1__0 : rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 ;
    public final void rule__Comparison__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4004:1: ( rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 )
            // InternalKlangParser.g:4005:2: rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1
            {
            pushFollow(FOLLOW_1);
            rule__Comparison__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_1__0"


    // $ANTLR start "rule__Comparison__Group_1_0_1__0__Impl"
    // InternalKlangParser.g:4012:1: rule__Comparison__Group_1_0_1__0__Impl : ( EqualsSignEqualsSign ) ;
    public final void rule__Comparison__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4016:1: ( ( EqualsSignEqualsSign ) )
            // InternalKlangParser.g:4017:1: ( EqualsSignEqualsSign )
            {
            // InternalKlangParser.g:4017:1: ( EqualsSignEqualsSign )
            // InternalKlangParser.g:4018:2: EqualsSignEqualsSign
            {
             before(grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_1_0_1_0()); 
            match(input,EqualsSignEqualsSign,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_1__1"
    // InternalKlangParser.g:4027:1: rule__Comparison__Group_1_0_1__1 : rule__Comparison__Group_1_0_1__1__Impl ;
    public final void rule__Comparison__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4031:1: ( rule__Comparison__Group_1_0_1__1__Impl )
            // InternalKlangParser.g:4032:2: rule__Comparison__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_1__1"


    // $ANTLR start "rule__Comparison__Group_1_0_1__1__Impl"
    // InternalKlangParser.g:4038:1: rule__Comparison__Group_1_0_1__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4042:1: ( ( () ) )
            // InternalKlangParser.g:4043:1: ( () )
            {
            // InternalKlangParser.g:4043:1: ( () )
            // InternalKlangParser.g:4044:2: ()
            {
             before(grammarAccess.getComparisonAccess().getEqualLeftAction_1_0_1_1()); 
            // InternalKlangParser.g:4045:2: ()
            // InternalKlangParser.g:4045:3: 
            {
            }

             after(grammarAccess.getComparisonAccess().getEqualLeftAction_1_0_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_2__0"
    // InternalKlangParser.g:4054:1: rule__Comparison__Group_1_0_2__0 : rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1 ;
    public final void rule__Comparison__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4058:1: ( rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1 )
            // InternalKlangParser.g:4059:2: rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1
            {
            pushFollow(FOLLOW_1);
            rule__Comparison__Group_1_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_2__0"


    // $ANTLR start "rule__Comparison__Group_1_0_2__0__Impl"
    // InternalKlangParser.g:4066:1: rule__Comparison__Group_1_0_2__0__Impl : ( GreaterThanSign ) ;
    public final void rule__Comparison__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4070:1: ( ( GreaterThanSign ) )
            // InternalKlangParser.g:4071:1: ( GreaterThanSign )
            {
            // InternalKlangParser.g:4071:1: ( GreaterThanSign )
            // InternalKlangParser.g:4072:2: GreaterThanSign
            {
             before(grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_2_0()); 
            match(input,GreaterThanSign,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_2__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_2__1"
    // InternalKlangParser.g:4081:1: rule__Comparison__Group_1_0_2__1 : rule__Comparison__Group_1_0_2__1__Impl ;
    public final void rule__Comparison__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4085:1: ( rule__Comparison__Group_1_0_2__1__Impl )
            // InternalKlangParser.g:4086:2: rule__Comparison__Group_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_2__1"


    // $ANTLR start "rule__Comparison__Group_1_0_2__1__Impl"
    // InternalKlangParser.g:4092:1: rule__Comparison__Group_1_0_2__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4096:1: ( ( () ) )
            // InternalKlangParser.g:4097:1: ( () )
            {
            // InternalKlangParser.g:4097:1: ( () )
            // InternalKlangParser.g:4098:2: ()
            {
             before(grammarAccess.getComparisonAccess().getGreaterThanLeftAction_1_0_2_1()); 
            // InternalKlangParser.g:4099:2: ()
            // InternalKlangParser.g:4099:3: 
            {
            }

             after(grammarAccess.getComparisonAccess().getGreaterThanLeftAction_1_0_2_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_2__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group__0"
    // InternalKlangParser.g:4108:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4112:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // InternalKlangParser.g:4113:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__FunctionCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__0"


    // $ANTLR start "rule__FunctionCall__Group__0__Impl"
    // InternalKlangParser.g:4120:1: rule__FunctionCall__Group__0__Impl : ( ( rule__FunctionCall__NameAssignment_0 ) ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4124:1: ( ( ( rule__FunctionCall__NameAssignment_0 ) ) )
            // InternalKlangParser.g:4125:1: ( ( rule__FunctionCall__NameAssignment_0 ) )
            {
            // InternalKlangParser.g:4125:1: ( ( rule__FunctionCall__NameAssignment_0 ) )
            // InternalKlangParser.g:4126:2: ( rule__FunctionCall__NameAssignment_0 )
            {
             before(grammarAccess.getFunctionCallAccess().getNameAssignment_0()); 
            // InternalKlangParser.g:4127:2: ( rule__FunctionCall__NameAssignment_0 )
            // InternalKlangParser.g:4127:3: rule__FunctionCall__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group__1"
    // InternalKlangParser.g:4135:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4139:1: ( rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 )
            // InternalKlangParser.g:4140:2: rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__FunctionCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__1"


    // $ANTLR start "rule__FunctionCall__Group__1__Impl"
    // InternalKlangParser.g:4147:1: rule__FunctionCall__Group__1__Impl : ( LeftParenthesis ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4151:1: ( ( LeftParenthesis ) )
            // InternalKlangParser.g:4152:1: ( LeftParenthesis )
            {
            // InternalKlangParser.g:4152:1: ( LeftParenthesis )
            // InternalKlangParser.g:4153:2: LeftParenthesis
            {
             before(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group__2"
    // InternalKlangParser.g:4162:1: rule__FunctionCall__Group__2 : rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 ;
    public final void rule__FunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4166:1: ( rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 )
            // InternalKlangParser.g:4167:2: rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3
            {
            pushFollow(FOLLOW_46);
            rule__FunctionCall__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__2"


    // $ANTLR start "rule__FunctionCall__Group__2__Impl"
    // InternalKlangParser.g:4174:1: rule__FunctionCall__Group__2__Impl : ( ( rule__FunctionCall__Group_2__0 )? ) ;
    public final void rule__FunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4178:1: ( ( ( rule__FunctionCall__Group_2__0 )? ) )
            // InternalKlangParser.g:4179:1: ( ( rule__FunctionCall__Group_2__0 )? )
            {
            // InternalKlangParser.g:4179:1: ( ( rule__FunctionCall__Group_2__0 )? )
            // InternalKlangParser.g:4180:2: ( rule__FunctionCall__Group_2__0 )?
            {
             before(grammarAccess.getFunctionCallAccess().getGroup_2()); 
            // InternalKlangParser.g:4181:2: ( rule__FunctionCall__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==False||LA28_0==True||LA28_0==Not||LA28_0==LeftParenthesis||(LA28_0>=RULE_DECIMAL && LA28_0<=RULE_STRING)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalKlangParser.g:4181:3: rule__FunctionCall__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionCall__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionCallAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__2__Impl"


    // $ANTLR start "rule__FunctionCall__Group__3"
    // InternalKlangParser.g:4189:1: rule__FunctionCall__Group__3 : rule__FunctionCall__Group__3__Impl ;
    public final void rule__FunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4193:1: ( rule__FunctionCall__Group__3__Impl )
            // InternalKlangParser.g:4194:2: rule__FunctionCall__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__3"


    // $ANTLR start "rule__FunctionCall__Group__3__Impl"
    // InternalKlangParser.g:4200:1: rule__FunctionCall__Group__3__Impl : ( RightParenthesis ) ;
    public final void rule__FunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4204:1: ( ( RightParenthesis ) )
            // InternalKlangParser.g:4205:1: ( RightParenthesis )
            {
            // InternalKlangParser.g:4205:1: ( RightParenthesis )
            // InternalKlangParser.g:4206:2: RightParenthesis
            {
             before(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__3__Impl"


    // $ANTLR start "rule__FunctionCall__Group_2__0"
    // InternalKlangParser.g:4216:1: rule__FunctionCall__Group_2__0 : rule__FunctionCall__Group_2__0__Impl rule__FunctionCall__Group_2__1 ;
    public final void rule__FunctionCall__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4220:1: ( rule__FunctionCall__Group_2__0__Impl rule__FunctionCall__Group_2__1 )
            // InternalKlangParser.g:4221:2: rule__FunctionCall__Group_2__0__Impl rule__FunctionCall__Group_2__1
            {
            pushFollow(FOLLOW_47);
            rule__FunctionCall__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2__0"


    // $ANTLR start "rule__FunctionCall__Group_2__0__Impl"
    // InternalKlangParser.g:4228:1: rule__FunctionCall__Group_2__0__Impl : ( ( rule__FunctionCall__ParametersAssignment_2_0 ) ) ;
    public final void rule__FunctionCall__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4232:1: ( ( ( rule__FunctionCall__ParametersAssignment_2_0 ) ) )
            // InternalKlangParser.g:4233:1: ( ( rule__FunctionCall__ParametersAssignment_2_0 ) )
            {
            // InternalKlangParser.g:4233:1: ( ( rule__FunctionCall__ParametersAssignment_2_0 ) )
            // InternalKlangParser.g:4234:2: ( rule__FunctionCall__ParametersAssignment_2_0 )
            {
             before(grammarAccess.getFunctionCallAccess().getParametersAssignment_2_0()); 
            // InternalKlangParser.g:4235:2: ( rule__FunctionCall__ParametersAssignment_2_0 )
            // InternalKlangParser.g:4235:3: rule__FunctionCall__ParametersAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__ParametersAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getParametersAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_2__1"
    // InternalKlangParser.g:4243:1: rule__FunctionCall__Group_2__1 : rule__FunctionCall__Group_2__1__Impl ;
    public final void rule__FunctionCall__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4247:1: ( rule__FunctionCall__Group_2__1__Impl )
            // InternalKlangParser.g:4248:2: rule__FunctionCall__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2__1"


    // $ANTLR start "rule__FunctionCall__Group_2__1__Impl"
    // InternalKlangParser.g:4254:1: rule__FunctionCall__Group_2__1__Impl : ( ( rule__FunctionCall__Group_2_1__0 )* ) ;
    public final void rule__FunctionCall__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4258:1: ( ( ( rule__FunctionCall__Group_2_1__0 )* ) )
            // InternalKlangParser.g:4259:1: ( ( rule__FunctionCall__Group_2_1__0 )* )
            {
            // InternalKlangParser.g:4259:1: ( ( rule__FunctionCall__Group_2_1__0 )* )
            // InternalKlangParser.g:4260:2: ( rule__FunctionCall__Group_2_1__0 )*
            {
             before(grammarAccess.getFunctionCallAccess().getGroup_2_1()); 
            // InternalKlangParser.g:4261:2: ( rule__FunctionCall__Group_2_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==Comma) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalKlangParser.g:4261:3: rule__FunctionCall__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__FunctionCall__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getFunctionCallAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group_2_1__0"
    // InternalKlangParser.g:4270:1: rule__FunctionCall__Group_2_1__0 : rule__FunctionCall__Group_2_1__0__Impl rule__FunctionCall__Group_2_1__1 ;
    public final void rule__FunctionCall__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4274:1: ( rule__FunctionCall__Group_2_1__0__Impl rule__FunctionCall__Group_2_1__1 )
            // InternalKlangParser.g:4275:2: rule__FunctionCall__Group_2_1__0__Impl rule__FunctionCall__Group_2_1__1
            {
            pushFollow(FOLLOW_23);
            rule__FunctionCall__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2_1__0"


    // $ANTLR start "rule__FunctionCall__Group_2_1__0__Impl"
    // InternalKlangParser.g:4282:1: rule__FunctionCall__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__FunctionCall__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4286:1: ( ( Comma ) )
            // InternalKlangParser.g:4287:1: ( Comma )
            {
            // InternalKlangParser.g:4287:1: ( Comma )
            // InternalKlangParser.g:4288:2: Comma
            {
             before(grammarAccess.getFunctionCallAccess().getCommaKeyword_2_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2_1__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_2_1__1"
    // InternalKlangParser.g:4297:1: rule__FunctionCall__Group_2_1__1 : rule__FunctionCall__Group_2_1__1__Impl ;
    public final void rule__FunctionCall__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4301:1: ( rule__FunctionCall__Group_2_1__1__Impl )
            // InternalKlangParser.g:4302:2: rule__FunctionCall__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2_1__1"


    // $ANTLR start "rule__FunctionCall__Group_2_1__1__Impl"
    // InternalKlangParser.g:4308:1: rule__FunctionCall__Group_2_1__1__Impl : ( ( rule__FunctionCall__ParametersAssignment_2_1_1 ) ) ;
    public final void rule__FunctionCall__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4312:1: ( ( ( rule__FunctionCall__ParametersAssignment_2_1_1 ) ) )
            // InternalKlangParser.g:4313:1: ( ( rule__FunctionCall__ParametersAssignment_2_1_1 ) )
            {
            // InternalKlangParser.g:4313:1: ( ( rule__FunctionCall__ParametersAssignment_2_1_1 ) )
            // InternalKlangParser.g:4314:2: ( rule__FunctionCall__ParametersAssignment_2_1_1 )
            {
             before(grammarAccess.getFunctionCallAccess().getParametersAssignment_2_1_1()); 
            // InternalKlangParser.g:4315:2: ( rule__FunctionCall__ParametersAssignment_2_1_1 )
            // InternalKlangParser.g:4315:3: rule__FunctionCall__ParametersAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__ParametersAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getParametersAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0"
    // InternalKlangParser.g:4324:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4328:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // InternalKlangParser.g:4329:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_23);
            rule__PrimaryExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__0"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0__Impl"
    // InternalKlangParser.g:4336:1: rule__PrimaryExpression__Group_0__0__Impl : ( LeftParenthesis ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4340:1: ( ( LeftParenthesis ) )
            // InternalKlangParser.g:4341:1: ( LeftParenthesis )
            {
            // InternalKlangParser.g:4341:1: ( LeftParenthesis )
            // InternalKlangParser.g:4342:2: LeftParenthesis
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1"
    // InternalKlangParser.g:4351:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4355:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // InternalKlangParser.g:4356:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_31);
            rule__PrimaryExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__1"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1__Impl"
    // InternalKlangParser.g:4363:1: rule__PrimaryExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4367:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:4368:1: ( ruleExpression )
            {
            // InternalKlangParser.g:4368:1: ( ruleExpression )
            // InternalKlangParser.g:4369:2: ruleExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2"
    // InternalKlangParser.g:4378:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4382:1: ( rule__PrimaryExpression__Group_0__2__Impl )
            // InternalKlangParser.g:4383:2: rule__PrimaryExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__2"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2__Impl"
    // InternalKlangParser.g:4389:1: rule__PrimaryExpression__Group_0__2__Impl : ( RightParenthesis ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4393:1: ( ( RightParenthesis ) )
            // InternalKlangParser.g:4394:1: ( RightParenthesis )
            {
            // InternalKlangParser.g:4394:1: ( RightParenthesis )
            // InternalKlangParser.g:4395:2: RightParenthesis
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0"
    // InternalKlangParser.g:4405:1: rule__PrimaryExpression__Group_1__0 : rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 ;
    public final void rule__PrimaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4409:1: ( rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 )
            // InternalKlangParser.g:4410:2: rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_49);
            rule__PrimaryExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__0"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0__Impl"
    // InternalKlangParser.g:4417:1: rule__PrimaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4421:1: ( ( () ) )
            // InternalKlangParser.g:4422:1: ( () )
            {
            // InternalKlangParser.g:4422:1: ( () )
            // InternalKlangParser.g:4423:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNotAction_1_0()); 
            // InternalKlangParser.g:4424:2: ()
            // InternalKlangParser.g:4424:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getNotAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1"
    // InternalKlangParser.g:4432:1: rule__PrimaryExpression__Group_1__1 : rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2 ;
    public final void rule__PrimaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4436:1: ( rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2 )
            // InternalKlangParser.g:4437:2: rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2
            {
            pushFollow(FOLLOW_23);
            rule__PrimaryExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__1"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1__Impl"
    // InternalKlangParser.g:4444:1: rule__PrimaryExpression__Group_1__1__Impl : ( Not ) ;
    public final void rule__PrimaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4448:1: ( ( Not ) )
            // InternalKlangParser.g:4449:1: ( Not )
            {
            // InternalKlangParser.g:4449:1: ( Not )
            // InternalKlangParser.g:4450:2: Not
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNotKeyword_1_1()); 
            match(input,Not,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getNotKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__2"
    // InternalKlangParser.g:4459:1: rule__PrimaryExpression__Group_1__2 : rule__PrimaryExpression__Group_1__2__Impl ;
    public final void rule__PrimaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4463:1: ( rule__PrimaryExpression__Group_1__2__Impl )
            // InternalKlangParser.g:4464:2: rule__PrimaryExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__2"


    // $ANTLR start "rule__PrimaryExpression__Group_1__2__Impl"
    // InternalKlangParser.g:4470:1: rule__PrimaryExpression__Group_1__2__Impl : ( ( rule__PrimaryExpression__ExpressionAssignment_1_2 ) ) ;
    public final void rule__PrimaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4474:1: ( ( ( rule__PrimaryExpression__ExpressionAssignment_1_2 ) ) )
            // InternalKlangParser.g:4475:1: ( ( rule__PrimaryExpression__ExpressionAssignment_1_2 ) )
            {
            // InternalKlangParser.g:4475:1: ( ( rule__PrimaryExpression__ExpressionAssignment_1_2 ) )
            // InternalKlangParser.g:4476:2: ( rule__PrimaryExpression__ExpressionAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionAssignment_1_2()); 
            // InternalKlangParser.g:4477:2: ( rule__PrimaryExpression__ExpressionAssignment_1_2 )
            // InternalKlangParser.g:4477:3: rule__PrimaryExpression__ExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__ExpressionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getExpressionAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AtomicExpression__Group_0__0"
    // InternalKlangParser.g:4486:1: rule__AtomicExpression__Group_0__0 : rule__AtomicExpression__Group_0__0__Impl rule__AtomicExpression__Group_0__1 ;
    public final void rule__AtomicExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4490:1: ( rule__AtomicExpression__Group_0__0__Impl rule__AtomicExpression__Group_0__1 )
            // InternalKlangParser.g:4491:2: rule__AtomicExpression__Group_0__0__Impl rule__AtomicExpression__Group_0__1
            {
            pushFollow(FOLLOW_50);
            rule__AtomicExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicExpression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Group_0__0"


    // $ANTLR start "rule__AtomicExpression__Group_0__0__Impl"
    // InternalKlangParser.g:4498:1: rule__AtomicExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__AtomicExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4502:1: ( ( () ) )
            // InternalKlangParser.g:4503:1: ( () )
            {
            // InternalKlangParser.g:4503:1: ( () )
            // InternalKlangParser.g:4504:2: ()
            {
             before(grammarAccess.getAtomicExpressionAccess().getBooleanLiteralAction_0_0()); 
            // InternalKlangParser.g:4505:2: ()
            // InternalKlangParser.g:4505:3: 
            {
            }

             after(grammarAccess.getAtomicExpressionAccess().getBooleanLiteralAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Group_0__0__Impl"


    // $ANTLR start "rule__AtomicExpression__Group_0__1"
    // InternalKlangParser.g:4513:1: rule__AtomicExpression__Group_0__1 : rule__AtomicExpression__Group_0__1__Impl ;
    public final void rule__AtomicExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4517:1: ( rule__AtomicExpression__Group_0__1__Impl )
            // InternalKlangParser.g:4518:2: rule__AtomicExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicExpression__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Group_0__1"


    // $ANTLR start "rule__AtomicExpression__Group_0__1__Impl"
    // InternalKlangParser.g:4524:1: rule__AtomicExpression__Group_0__1__Impl : ( ( rule__AtomicExpression__Alternatives_0_1 ) ) ;
    public final void rule__AtomicExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4528:1: ( ( ( rule__AtomicExpression__Alternatives_0_1 ) ) )
            // InternalKlangParser.g:4529:1: ( ( rule__AtomicExpression__Alternatives_0_1 ) )
            {
            // InternalKlangParser.g:4529:1: ( ( rule__AtomicExpression__Alternatives_0_1 ) )
            // InternalKlangParser.g:4530:2: ( rule__AtomicExpression__Alternatives_0_1 )
            {
             before(grammarAccess.getAtomicExpressionAccess().getAlternatives_0_1()); 
            // InternalKlangParser.g:4531:2: ( rule__AtomicExpression__Alternatives_0_1 )
            // InternalKlangParser.g:4531:3: rule__AtomicExpression__Alternatives_0_1
            {
            pushFollow(FOLLOW_2);
            rule__AtomicExpression__Alternatives_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicExpressionAccess().getAlternatives_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Group_0__1__Impl"


    // $ANTLR start "rule__AtomicExpression__Group_1__0"
    // InternalKlangParser.g:4540:1: rule__AtomicExpression__Group_1__0 : rule__AtomicExpression__Group_1__0__Impl rule__AtomicExpression__Group_1__1 ;
    public final void rule__AtomicExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4544:1: ( rule__AtomicExpression__Group_1__0__Impl rule__AtomicExpression__Group_1__1 )
            // InternalKlangParser.g:4545:2: rule__AtomicExpression__Group_1__0__Impl rule__AtomicExpression__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__AtomicExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Group_1__0"


    // $ANTLR start "rule__AtomicExpression__Group_1__0__Impl"
    // InternalKlangParser.g:4552:1: rule__AtomicExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AtomicExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4556:1: ( ( () ) )
            // InternalKlangParser.g:4557:1: ( () )
            {
            // InternalKlangParser.g:4557:1: ( () )
            // InternalKlangParser.g:4558:2: ()
            {
             before(grammarAccess.getAtomicExpressionAccess().getDoubleLiteralAction_1_0()); 
            // InternalKlangParser.g:4559:2: ()
            // InternalKlangParser.g:4559:3: 
            {
            }

             after(grammarAccess.getAtomicExpressionAccess().getDoubleLiteralAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AtomicExpression__Group_1__1"
    // InternalKlangParser.g:4567:1: rule__AtomicExpression__Group_1__1 : rule__AtomicExpression__Group_1__1__Impl ;
    public final void rule__AtomicExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4571:1: ( rule__AtomicExpression__Group_1__1__Impl )
            // InternalKlangParser.g:4572:2: rule__AtomicExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Group_1__1"


    // $ANTLR start "rule__AtomicExpression__Group_1__1__Impl"
    // InternalKlangParser.g:4578:1: rule__AtomicExpression__Group_1__1__Impl : ( ( rule__AtomicExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__AtomicExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4582:1: ( ( ( rule__AtomicExpression__ValueAssignment_1_1 ) ) )
            // InternalKlangParser.g:4583:1: ( ( rule__AtomicExpression__ValueAssignment_1_1 ) )
            {
            // InternalKlangParser.g:4583:1: ( ( rule__AtomicExpression__ValueAssignment_1_1 ) )
            // InternalKlangParser.g:4584:2: ( rule__AtomicExpression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicExpressionAccess().getValueAssignment_1_1()); 
            // InternalKlangParser.g:4585:2: ( rule__AtomicExpression__ValueAssignment_1_1 )
            // InternalKlangParser.g:4585:3: rule__AtomicExpression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AtomicExpression__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicExpressionAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AtomicExpression__Group_2__0"
    // InternalKlangParser.g:4594:1: rule__AtomicExpression__Group_2__0 : rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 ;
    public final void rule__AtomicExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4598:1: ( rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 )
            // InternalKlangParser.g:4599:2: rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1
            {
            pushFollow(FOLLOW_51);
            rule__AtomicExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicExpression__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Group_2__0"


    // $ANTLR start "rule__AtomicExpression__Group_2__0__Impl"
    // InternalKlangParser.g:4606:1: rule__AtomicExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__AtomicExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4610:1: ( ( () ) )
            // InternalKlangParser.g:4611:1: ( () )
            {
            // InternalKlangParser.g:4611:1: ( () )
            // InternalKlangParser.g:4612:2: ()
            {
             before(grammarAccess.getAtomicExpressionAccess().getStringLiteralAction_2_0()); 
            // InternalKlangParser.g:4613:2: ()
            // InternalKlangParser.g:4613:3: 
            {
            }

             after(grammarAccess.getAtomicExpressionAccess().getStringLiteralAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Group_2__0__Impl"


    // $ANTLR start "rule__AtomicExpression__Group_2__1"
    // InternalKlangParser.g:4621:1: rule__AtomicExpression__Group_2__1 : rule__AtomicExpression__Group_2__1__Impl ;
    public final void rule__AtomicExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4625:1: ( rule__AtomicExpression__Group_2__1__Impl )
            // InternalKlangParser.g:4626:2: rule__AtomicExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicExpression__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Group_2__1"


    // $ANTLR start "rule__AtomicExpression__Group_2__1__Impl"
    // InternalKlangParser.g:4632:1: rule__AtomicExpression__Group_2__1__Impl : ( ( rule__AtomicExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__AtomicExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4636:1: ( ( ( rule__AtomicExpression__ValueAssignment_2_1 ) ) )
            // InternalKlangParser.g:4637:1: ( ( rule__AtomicExpression__ValueAssignment_2_1 ) )
            {
            // InternalKlangParser.g:4637:1: ( ( rule__AtomicExpression__ValueAssignment_2_1 ) )
            // InternalKlangParser.g:4638:2: ( rule__AtomicExpression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicExpressionAccess().getValueAssignment_2_1()); 
            // InternalKlangParser.g:4639:2: ( rule__AtomicExpression__ValueAssignment_2_1 )
            // InternalKlangParser.g:4639:3: rule__AtomicExpression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AtomicExpression__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicExpressionAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Group_2__1__Impl"


    // $ANTLR start "rule__AtomicExpression__Group_3__0"
    // InternalKlangParser.g:4648:1: rule__AtomicExpression__Group_3__0 : rule__AtomicExpression__Group_3__0__Impl rule__AtomicExpression__Group_3__1 ;
    public final void rule__AtomicExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4652:1: ( rule__AtomicExpression__Group_3__0__Impl rule__AtomicExpression__Group_3__1 )
            // InternalKlangParser.g:4653:2: rule__AtomicExpression__Group_3__0__Impl rule__AtomicExpression__Group_3__1
            {
            pushFollow(FOLLOW_23);
            rule__AtomicExpression__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicExpression__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Group_3__0"


    // $ANTLR start "rule__AtomicExpression__Group_3__0__Impl"
    // InternalKlangParser.g:4660:1: rule__AtomicExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__AtomicExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4664:1: ( ( () ) )
            // InternalKlangParser.g:4665:1: ( () )
            {
            // InternalKlangParser.g:4665:1: ( () )
            // InternalKlangParser.g:4666:2: ()
            {
             before(grammarAccess.getAtomicExpressionAccess().getVariableRefAction_3_0()); 
            // InternalKlangParser.g:4667:2: ()
            // InternalKlangParser.g:4667:3: 
            {
            }

             after(grammarAccess.getAtomicExpressionAccess().getVariableRefAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Group_3__0__Impl"


    // $ANTLR start "rule__AtomicExpression__Group_3__1"
    // InternalKlangParser.g:4675:1: rule__AtomicExpression__Group_3__1 : rule__AtomicExpression__Group_3__1__Impl ;
    public final void rule__AtomicExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4679:1: ( rule__AtomicExpression__Group_3__1__Impl )
            // InternalKlangParser.g:4680:2: rule__AtomicExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicExpression__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Group_3__1"


    // $ANTLR start "rule__AtomicExpression__Group_3__1__Impl"
    // InternalKlangParser.g:4686:1: rule__AtomicExpression__Group_3__1__Impl : ( ( rule__AtomicExpression__VariableNameAssignment_3_1 ) ) ;
    public final void rule__AtomicExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4690:1: ( ( ( rule__AtomicExpression__VariableNameAssignment_3_1 ) ) )
            // InternalKlangParser.g:4691:1: ( ( rule__AtomicExpression__VariableNameAssignment_3_1 ) )
            {
            // InternalKlangParser.g:4691:1: ( ( rule__AtomicExpression__VariableNameAssignment_3_1 ) )
            // InternalKlangParser.g:4692:2: ( rule__AtomicExpression__VariableNameAssignment_3_1 )
            {
             before(grammarAccess.getAtomicExpressionAccess().getVariableNameAssignment_3_1()); 
            // InternalKlangParser.g:4693:2: ( rule__AtomicExpression__VariableNameAssignment_3_1 )
            // InternalKlangParser.g:4693:3: rule__AtomicExpression__VariableNameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AtomicExpression__VariableNameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicExpressionAccess().getVariableNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Group_3__1__Impl"


    // $ANTLR start "rule__Game__GlobalVariablesAssignment_1"
    // InternalKlangParser.g:4702:1: rule__Game__GlobalVariablesAssignment_1 : ( ruleVariable ) ;
    public final void rule__Game__GlobalVariablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4706:1: ( ( ruleVariable ) )
            // InternalKlangParser.g:4707:2: ( ruleVariable )
            {
            // InternalKlangParser.g:4707:2: ( ruleVariable )
            // InternalKlangParser.g:4708:3: ruleVariable
            {
             before(grammarAccess.getGameAccess().getGlobalVariablesVariableParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getGameAccess().getGlobalVariablesVariableParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__GlobalVariablesAssignment_1"


    // $ANTLR start "rule__Game__ActorsAssignment_2"
    // InternalKlangParser.g:4717:1: rule__Game__ActorsAssignment_2 : ( ruleActor ) ;
    public final void rule__Game__ActorsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4721:1: ( ( ruleActor ) )
            // InternalKlangParser.g:4722:2: ( ruleActor )
            {
            // InternalKlangParser.g:4722:2: ( ruleActor )
            // InternalKlangParser.g:4723:3: ruleActor
            {
             before(grammarAccess.getGameAccess().getActorsActorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getGameAccess().getActorsActorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__ActorsAssignment_2"


    // $ANTLR start "rule__Actor__EntityAssignment_1"
    // InternalKlangParser.g:4732:1: rule__Actor__EntityAssignment_1 : ( ruleEntity ) ;
    public final void rule__Actor__EntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4736:1: ( ( ruleEntity ) )
            // InternalKlangParser.g:4737:2: ( ruleEntity )
            {
            // InternalKlangParser.g:4737:2: ( ruleEntity )
            // InternalKlangParser.g:4738:3: ruleEntity
            {
             before(grammarAccess.getActorAccess().getEntityEntityParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getActorAccess().getEntityEntityParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__EntityAssignment_1"


    // $ANTLR start "rule__Actor__VariableDeclarationsAssignment_3"
    // InternalKlangParser.g:4747:1: rule__Actor__VariableDeclarationsAssignment_3 : ( ruleVariable ) ;
    public final void rule__Actor__VariableDeclarationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4751:1: ( ( ruleVariable ) )
            // InternalKlangParser.g:4752:2: ( ruleVariable )
            {
            // InternalKlangParser.g:4752:2: ( ruleVariable )
            // InternalKlangParser.g:4753:3: ruleVariable
            {
             before(grammarAccess.getActorAccess().getVariableDeclarationsVariableParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getActorAccess().getVariableDeclarationsVariableParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__VariableDeclarationsAssignment_3"


    // $ANTLR start "rule__Actor__EventHandlersAssignment_4"
    // InternalKlangParser.g:4762:1: rule__Actor__EventHandlersAssignment_4 : ( ruleEventHandler ) ;
    public final void rule__Actor__EventHandlersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4766:1: ( ( ruleEventHandler ) )
            // InternalKlangParser.g:4767:2: ( ruleEventHandler )
            {
            // InternalKlangParser.g:4767:2: ( ruleEventHandler )
            // InternalKlangParser.g:4768:3: ruleEventHandler
            {
             before(grammarAccess.getActorAccess().getEventHandlersEventHandlerParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEventHandler();

            state._fsp--;

             after(grammarAccess.getActorAccess().getEventHandlersEventHandlerParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__EventHandlersAssignment_4"


    // $ANTLR start "rule__Entity__NameAssignment_0_2"
    // InternalKlangParser.g:4777:1: rule__Entity__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4781:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:4782:2: ( RULE_ID )
            {
            // InternalKlangParser.g:4782:2: ( RULE_ID )
            // InternalKlangParser.g:4783:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_0_2"


    // $ANTLR start "rule__GameStart__StatementsAssignment_5"
    // InternalKlangParser.g:4792:1: rule__GameStart__StatementsAssignment_5 : ( ruleStatement ) ;
    public final void rule__GameStart__StatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4796:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:4797:2: ( ruleStatement )
            {
            // InternalKlangParser.g:4797:2: ( ruleStatement )
            // InternalKlangParser.g:4798:3: ruleStatement
            {
             before(grammarAccess.getGameStartAccess().getStatementsStatementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getGameStartAccess().getStatementsStatementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameStart__StatementsAssignment_5"


    // $ANTLR start "rule__SpriteClicked__StatementsAssignment_4"
    // InternalKlangParser.g:4807:1: rule__SpriteClicked__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__SpriteClicked__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4811:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:4812:2: ( ruleStatement )
            {
            // InternalKlangParser.g:4812:2: ( ruleStatement )
            // InternalKlangParser.g:4813:3: ruleStatement
            {
             before(grammarAccess.getSpriteClickedAccess().getStatementsStatementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getSpriteClickedAccess().getStatementsStatementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteClicked__StatementsAssignment_4"


    // $ANTLR start "rule__KeyPressed__KeyAssignment_2"
    // InternalKlangParser.g:4822:1: rule__KeyPressed__KeyAssignment_2 : ( RULE_UPPERCASE ) ;
    public final void rule__KeyPressed__KeyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4826:1: ( ( RULE_UPPERCASE ) )
            // InternalKlangParser.g:4827:2: ( RULE_UPPERCASE )
            {
            // InternalKlangParser.g:4827:2: ( RULE_UPPERCASE )
            // InternalKlangParser.g:4828:3: RULE_UPPERCASE
            {
             before(grammarAccess.getKeyPressedAccess().getKeyUPPERCASETerminalRuleCall_2_0()); 
            match(input,RULE_UPPERCASE,FOLLOW_2); 
             after(grammarAccess.getKeyPressedAccess().getKeyUPPERCASETerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyPressed__KeyAssignment_2"


    // $ANTLR start "rule__KeyPressed__StatementsAssignment_6"
    // InternalKlangParser.g:4837:1: rule__KeyPressed__StatementsAssignment_6 : ( ruleStatement ) ;
    public final void rule__KeyPressed__StatementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4841:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:4842:2: ( ruleStatement )
            {
            // InternalKlangParser.g:4842:2: ( ruleStatement )
            // InternalKlangParser.g:4843:3: ruleStatement
            {
             before(grammarAccess.getKeyPressedAccess().getStatementsStatementParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getKeyPressedAccess().getStatementsStatementParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyPressed__StatementsAssignment_6"


    // $ANTLR start "rule__CollidesWith__TargetAssignment_4"
    // InternalKlangParser.g:4852:1: rule__CollidesWith__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__CollidesWith__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4856:1: ( ( ( RULE_ID ) ) )
            // InternalKlangParser.g:4857:2: ( ( RULE_ID ) )
            {
            // InternalKlangParser.g:4857:2: ( ( RULE_ID ) )
            // InternalKlangParser.g:4858:3: ( RULE_ID )
            {
             before(grammarAccess.getCollidesWithAccess().getTargetSpriteEntityCrossReference_4_0()); 
            // InternalKlangParser.g:4859:3: ( RULE_ID )
            // InternalKlangParser.g:4860:4: RULE_ID
            {
             before(grammarAccess.getCollidesWithAccess().getTargetSpriteEntityIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCollidesWithAccess().getTargetSpriteEntityIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getCollidesWithAccess().getTargetSpriteEntityCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollidesWith__TargetAssignment_4"


    // $ANTLR start "rule__CollidesWith__StatementsAssignment_6"
    // InternalKlangParser.g:4871:1: rule__CollidesWith__StatementsAssignment_6 : ( ruleStatement ) ;
    public final void rule__CollidesWith__StatementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4875:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:4876:2: ( ruleStatement )
            {
            // InternalKlangParser.g:4876:2: ( ruleStatement )
            // InternalKlangParser.g:4877:3: ruleStatement
            {
             before(grammarAccess.getCollidesWithAccess().getStatementsStatementParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getCollidesWithAccess().getStatementsStatementParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollidesWith__StatementsAssignment_6"


    // $ANTLR start "rule__WhileLoop__PredicateAssignment_2"
    // InternalKlangParser.g:4886:1: rule__WhileLoop__PredicateAssignment_2 : ( ruleExpression ) ;
    public final void rule__WhileLoop__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4890:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:4891:2: ( ruleExpression )
            {
            // InternalKlangParser.g:4891:2: ( ruleExpression )
            // InternalKlangParser.g:4892:3: ruleExpression
            {
             before(grammarAccess.getWhileLoopAccess().getPredicateExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getWhileLoopAccess().getPredicateExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__PredicateAssignment_2"


    // $ANTLR start "rule__WhileLoop__LoopBlockAssignment_4"
    // InternalKlangParser.g:4901:1: rule__WhileLoop__LoopBlockAssignment_4 : ( ruleStatement ) ;
    public final void rule__WhileLoop__LoopBlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4905:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:4906:2: ( ruleStatement )
            {
            // InternalKlangParser.g:4906:2: ( ruleStatement )
            // InternalKlangParser.g:4907:3: ruleStatement
            {
             before(grammarAccess.getWhileLoopAccess().getLoopBlockStatementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getWhileLoopAccess().getLoopBlockStatementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__LoopBlockAssignment_4"


    // $ANTLR start "rule__If__PredicateAssignment_2"
    // InternalKlangParser.g:4916:1: rule__If__PredicateAssignment_2 : ( ruleExpression ) ;
    public final void rule__If__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4920:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:4921:2: ( ruleExpression )
            {
            // InternalKlangParser.g:4921:2: ( ruleExpression )
            // InternalKlangParser.g:4922:3: ruleExpression
            {
             before(grammarAccess.getIfAccess().getPredicateExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getIfAccess().getPredicateExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__PredicateAssignment_2"


    // $ANTLR start "rule__If__IfBlockAssignment_4"
    // InternalKlangParser.g:4931:1: rule__If__IfBlockAssignment_4 : ( ruleStatement ) ;
    public final void rule__If__IfBlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4935:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:4936:2: ( ruleStatement )
            {
            // InternalKlangParser.g:4936:2: ( ruleStatement )
            // InternalKlangParser.g:4937:3: ruleStatement
            {
             before(grammarAccess.getIfAccess().getIfBlockStatementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getIfAccess().getIfBlockStatementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__IfBlockAssignment_4"


    // $ANTLR start "rule__If__ElseBlockAssignment_6_2"
    // InternalKlangParser.g:4946:1: rule__If__ElseBlockAssignment_6_2 : ( ruleStatement ) ;
    public final void rule__If__ElseBlockAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4950:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:4951:2: ( ruleStatement )
            {
            // InternalKlangParser.g:4951:2: ( ruleStatement )
            // InternalKlangParser.g:4952:3: ruleStatement
            {
             before(grammarAccess.getIfAccess().getElseBlockStatementParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getIfAccess().getElseBlockStatementParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__ElseBlockAssignment_6_2"


    // $ANTLR start "rule__ForeverLoop__LoopStatementsAssignment_3"
    // InternalKlangParser.g:4961:1: rule__ForeverLoop__LoopStatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__ForeverLoop__LoopStatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4965:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:4966:2: ( ruleStatement )
            {
            // InternalKlangParser.g:4966:2: ( ruleStatement )
            // InternalKlangParser.g:4967:3: ruleStatement
            {
             before(grammarAccess.getForeverLoopAccess().getLoopStatementsStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getForeverLoopAccess().getLoopStatementsStatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeverLoop__LoopStatementsAssignment_3"


    // $ANTLR start "rule__Variable__NameAssignment_1"
    // InternalKlangParser.g:4976:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4980:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:4981:2: ( RULE_ID )
            {
            // InternalKlangParser.g:4981:2: ( RULE_ID )
            // InternalKlangParser.g:4982:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_1"


    // $ANTLR start "rule__Variable__ExpressionAssignment_3"
    // InternalKlangParser.g:4991:1: rule__Variable__ExpressionAssignment_3 : ( ruleExpression ) ;
    public final void rule__Variable__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4995:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:4996:2: ( ruleExpression )
            {
            // InternalKlangParser.g:4996:2: ( ruleExpression )
            // InternalKlangParser.g:4997:3: ruleExpression
            {
             before(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__ExpressionAssignment_3"


    // $ANTLR start "rule__VariableAssignment__VariableNameAssignment_0"
    // InternalKlangParser.g:5006:1: rule__VariableAssignment__VariableNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__VariableAssignment__VariableNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5010:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:5011:2: ( RULE_ID )
            {
            // InternalKlangParser.g:5011:2: ( RULE_ID )
            // InternalKlangParser.g:5012:3: RULE_ID
            {
             before(grammarAccess.getVariableAssignmentAccess().getVariableNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAssignmentAccess().getVariableNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignment__VariableNameAssignment_0"


    // $ANTLR start "rule__VariableAssignment__ExpressionAssignment_2"
    // InternalKlangParser.g:5021:1: rule__VariableAssignment__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__VariableAssignment__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5025:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:5026:2: ( ruleExpression )
            {
            // InternalKlangParser.g:5026:2: ( ruleExpression )
            // InternalKlangParser.g:5027:3: ruleExpression
            {
             before(grammarAccess.getVariableAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getVariableAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignment__ExpressionAssignment_2"


    // $ANTLR start "rule__Sleep__DurationAssignment_3"
    // InternalKlangParser.g:5036:1: rule__Sleep__DurationAssignment_3 : ( RULE_DECIMAL ) ;
    public final void rule__Sleep__DurationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5040:1: ( ( RULE_DECIMAL ) )
            // InternalKlangParser.g:5041:2: ( RULE_DECIMAL )
            {
            // InternalKlangParser.g:5041:2: ( RULE_DECIMAL )
            // InternalKlangParser.g:5042:3: RULE_DECIMAL
            {
             before(grammarAccess.getSleepAccess().getDurationDECIMALTerminalRuleCall_3_0()); 
            match(input,RULE_DECIMAL,FOLLOW_2); 
             after(grammarAccess.getSleepAccess().getDurationDECIMALTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sleep__DurationAssignment_3"


    // $ANTLR start "rule__Or__RightAssignment_1_2"
    // InternalKlangParser.g:5051:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5055:1: ( ( ruleAnd ) )
            // InternalKlangParser.g:5056:2: ( ruleAnd )
            {
            // InternalKlangParser.g:5056:2: ( ruleAnd )
            // InternalKlangParser.g:5057:3: ruleAnd
            {
             before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__RightAssignment_1_2"


    // $ANTLR start "rule__And__RightAssignment_1_2"
    // InternalKlangParser.g:5066:1: rule__And__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5070:1: ( ( ruleComparison ) )
            // InternalKlangParser.g:5071:2: ( ruleComparison )
            {
            // InternalKlangParser.g:5071:2: ( ruleComparison )
            // InternalKlangParser.g:5072:3: ruleComparison
            {
             before(grammarAccess.getAndAccess().getRightComparisonParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getAndAccess().getRightComparisonParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__RightAssignment_1_2"


    // $ANTLR start "rule__Plus__RightAssignment_1_2"
    // InternalKlangParser.g:5081:1: rule__Plus__RightAssignment_1_2 : ( ruleMinus ) ;
    public final void rule__Plus__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5085:1: ( ( ruleMinus ) )
            // InternalKlangParser.g:5086:2: ( ruleMinus )
            {
            // InternalKlangParser.g:5086:2: ( ruleMinus )
            // InternalKlangParser.g:5087:3: ruleMinus
            {
             before(grammarAccess.getPlusAccess().getRightMinusParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMinus();

            state._fsp--;

             after(grammarAccess.getPlusAccess().getRightMinusParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plus__RightAssignment_1_2"


    // $ANTLR start "rule__Minus__RightAssignment_1_2"
    // InternalKlangParser.g:5096:1: rule__Minus__RightAssignment_1_2 : ( ruleMultiply ) ;
    public final void rule__Minus__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5100:1: ( ( ruleMultiply ) )
            // InternalKlangParser.g:5101:2: ( ruleMultiply )
            {
            // InternalKlangParser.g:5101:2: ( ruleMultiply )
            // InternalKlangParser.g:5102:3: ruleMultiply
            {
             before(grammarAccess.getMinusAccess().getRightMultiplyParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiply();

            state._fsp--;

             after(grammarAccess.getMinusAccess().getRightMultiplyParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Minus__RightAssignment_1_2"


    // $ANTLR start "rule__Multiply__RightAssignment_1_2"
    // InternalKlangParser.g:5111:1: rule__Multiply__RightAssignment_1_2 : ( ruleDivide ) ;
    public final void rule__Multiply__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5115:1: ( ( ruleDivide ) )
            // InternalKlangParser.g:5116:2: ( ruleDivide )
            {
            // InternalKlangParser.g:5116:2: ( ruleDivide )
            // InternalKlangParser.g:5117:3: ruleDivide
            {
             before(grammarAccess.getMultiplyAccess().getRightDivideParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDivide();

            state._fsp--;

             after(grammarAccess.getMultiplyAccess().getRightDivideParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__RightAssignment_1_2"


    // $ANTLR start "rule__Divide__RightAssignment_1_2"
    // InternalKlangParser.g:5126:1: rule__Divide__RightAssignment_1_2 : ( rulePrimaryExpression ) ;
    public final void rule__Divide__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5130:1: ( ( rulePrimaryExpression ) )
            // InternalKlangParser.g:5131:2: ( rulePrimaryExpression )
            {
            // InternalKlangParser.g:5131:2: ( rulePrimaryExpression )
            // InternalKlangParser.g:5132:3: rulePrimaryExpression
            {
             before(grammarAccess.getDivideAccess().getRightPrimaryExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getDivideAccess().getRightPrimaryExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Divide__RightAssignment_1_2"


    // $ANTLR start "rule__Comparison__RightAssignment_1_1"
    // InternalKlangParser.g:5141:1: rule__Comparison__RightAssignment_1_1 : ( rulePlus ) ;
    public final void rule__Comparison__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5145:1: ( ( rulePlus ) )
            // InternalKlangParser.g:5146:2: ( rulePlus )
            {
            // InternalKlangParser.g:5146:2: ( rulePlus )
            // InternalKlangParser.g:5147:3: rulePlus
            {
             before(grammarAccess.getComparisonAccess().getRightPlusParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlus();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getRightPlusParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__RightAssignment_1_1"


    // $ANTLR start "rule__FunctionCall__NameAssignment_0"
    // InternalKlangParser.g:5156:1: rule__FunctionCall__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FunctionCall__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5160:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:5161:2: ( RULE_ID )
            {
            // InternalKlangParser.g:5161:2: ( RULE_ID )
            // InternalKlangParser.g:5162:3: RULE_ID
            {
             before(grammarAccess.getFunctionCallAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__NameAssignment_0"


    // $ANTLR start "rule__FunctionCall__ParametersAssignment_2_0"
    // InternalKlangParser.g:5171:1: rule__FunctionCall__ParametersAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__FunctionCall__ParametersAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5175:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:5176:2: ( ruleExpression )
            {
            // InternalKlangParser.g:5176:2: ( ruleExpression )
            // InternalKlangParser.g:5177:3: ruleExpression
            {
             before(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__ParametersAssignment_2_0"


    // $ANTLR start "rule__FunctionCall__ParametersAssignment_2_1_1"
    // InternalKlangParser.g:5186:1: rule__FunctionCall__ParametersAssignment_2_1_1 : ( ruleExpression ) ;
    public final void rule__FunctionCall__ParametersAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5190:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:5191:2: ( ruleExpression )
            {
            // InternalKlangParser.g:5191:2: ( ruleExpression )
            // InternalKlangParser.g:5192:3: ruleExpression
            {
             before(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__ParametersAssignment_2_1_1"


    // $ANTLR start "rule__PrimaryExpression__ExpressionAssignment_1_2"
    // InternalKlangParser.g:5201:1: rule__PrimaryExpression__ExpressionAssignment_1_2 : ( rulePrimaryExpression ) ;
    public final void rule__PrimaryExpression__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5205:1: ( ( rulePrimaryExpression ) )
            // InternalKlangParser.g:5206:2: ( rulePrimaryExpression )
            {
            // InternalKlangParser.g:5206:2: ( rulePrimaryExpression )
            // InternalKlangParser.g:5207:3: rulePrimaryExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__ExpressionAssignment_1_2"


    // $ANTLR start "rule__AtomicExpression__ValueAssignment_0_1_0"
    // InternalKlangParser.g:5216:1: rule__AtomicExpression__ValueAssignment_0_1_0 : ( ( True ) ) ;
    public final void rule__AtomicExpression__ValueAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5220:1: ( ( ( True ) ) )
            // InternalKlangParser.g:5221:2: ( ( True ) )
            {
            // InternalKlangParser.g:5221:2: ( ( True ) )
            // InternalKlangParser.g:5222:3: ( True )
            {
             before(grammarAccess.getAtomicExpressionAccess().getValueTrueKeyword_0_1_0_0()); 
            // InternalKlangParser.g:5223:3: ( True )
            // InternalKlangParser.g:5224:4: True
            {
             before(grammarAccess.getAtomicExpressionAccess().getValueTrueKeyword_0_1_0_0()); 
            match(input,True,FOLLOW_2); 
             after(grammarAccess.getAtomicExpressionAccess().getValueTrueKeyword_0_1_0_0()); 

            }

             after(grammarAccess.getAtomicExpressionAccess().getValueTrueKeyword_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__ValueAssignment_0_1_0"


    // $ANTLR start "rule__AtomicExpression__ValueAssignment_1_1"
    // InternalKlangParser.g:5235:1: rule__AtomicExpression__ValueAssignment_1_1 : ( RULE_DECIMAL ) ;
    public final void rule__AtomicExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5239:1: ( ( RULE_DECIMAL ) )
            // InternalKlangParser.g:5240:2: ( RULE_DECIMAL )
            {
            // InternalKlangParser.g:5240:2: ( RULE_DECIMAL )
            // InternalKlangParser.g:5241:3: RULE_DECIMAL
            {
             before(grammarAccess.getAtomicExpressionAccess().getValueDECIMALTerminalRuleCall_1_1_0()); 
            match(input,RULE_DECIMAL,FOLLOW_2); 
             after(grammarAccess.getAtomicExpressionAccess().getValueDECIMALTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__ValueAssignment_1_1"


    // $ANTLR start "rule__AtomicExpression__ValueAssignment_2_1"
    // InternalKlangParser.g:5250:1: rule__AtomicExpression__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__AtomicExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5254:1: ( ( RULE_STRING ) )
            // InternalKlangParser.g:5255:2: ( RULE_STRING )
            {
            // InternalKlangParser.g:5255:2: ( RULE_STRING )
            // InternalKlangParser.g:5256:3: RULE_STRING
            {
             before(grammarAccess.getAtomicExpressionAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAtomicExpressionAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__ValueAssignment_2_1"


    // $ANTLR start "rule__AtomicExpression__VariableNameAssignment_3_1"
    // InternalKlangParser.g:5265:1: rule__AtomicExpression__VariableNameAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__AtomicExpression__VariableNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5269:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:5270:2: ( RULE_ID )
            {
            // InternalKlangParser.g:5270:2: ( RULE_ID )
            // InternalKlangParser.g:5271:3: RULE_ID
            {
             before(grammarAccess.getAtomicExpressionAccess().getVariableNameIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtomicExpressionAccess().getVariableNameIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__VariableNameAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400900L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000902L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000002000420000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000022001003040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000020001003042L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000070004210400L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020001003040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000A00800000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000A00800002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x000007000C210400L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000010400L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000040000000000L});

}