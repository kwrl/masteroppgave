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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Collides", "Clicked", "Forever", "Pressed", "Sprite", "Starts", "False", "Scene", "While", "Yield", "Game", "This", "True", "When", "With", "And", "Key", "Not", "Var", "EqualsSignEqualsSign", "If", "Or", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "LessThanSign", "EqualsSign", "GreaterThanSign", "RULE_BEGIN", "RULE_END", "RULE_INT", "RULE_DECIMAL", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Or=25;
    public static final int RULE_BEGIN=37;
    public static final int Clicked=5;
    public static final int Var=22;
    public static final int True=16;
    public static final int False=10;
    public static final int LessThanSign=34;
    public static final int Forever=6;
    public static final int LeftParenthesis=26;
    public static final int This=15;
    public static final int GreaterThanSign=36;
    public static final int RULE_ID=41;
    public static final int Collides=4;
    public static final int RightParenthesis=27;
    public static final int Scene=11;
    public static final int RULE_DECIMAL=40;
    public static final int EqualsSignEqualsSign=23;
    public static final int Not=21;
    public static final int Game=14;
    public static final int And=19;
    public static final int PlusSign=29;
    public static final int RULE_INT=39;
    public static final int RULE_ML_COMMENT=43;
    public static final int If=24;
    public static final int Key=20;
    public static final int Pressed=7;
    public static final int RULE_END=38;
    public static final int Starts=9;
    public static final int RULE_STRING=42;
    public static final int With=18;
    public static final int RULE_SL_COMMENT=44;
    public static final int Comma=30;
    public static final int EqualsSign=35;
    public static final int HyphenMinus=31;
    public static final int Solidus=33;
    public static final int EOF=-1;
    public static final int Asterisk=28;
    public static final int FullStop=32;
    public static final int Sprite=8;
    public static final int RULE_WS=45;
    public static final int While=12;
    public static final int RULE_ANY_OTHER=46;
    public static final int When=17;
    public static final int Yield=13;

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
    		tokenNameToValue.put("FullStop", "'.'");
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
    		tokenNameToValue.put("Game", "'game'");
    		tokenNameToValue.put("This", "'this'");
    		tokenNameToValue.put("True", "'true'");
    		tokenNameToValue.put("When", "'when'");
    		tokenNameToValue.put("With", "'with'");
    		tokenNameToValue.put("False", "'false'");
    		tokenNameToValue.put("Scene", "'scene'");
    		tokenNameToValue.put("While", "'while'");
    		tokenNameToValue.put("Yield", "'yield'");
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
    // InternalKlangParser.g:88:1: entryRuleGame : ruleGame EOF ;
    public final void entryRuleGame() throws RecognitionException {
        try {
            // InternalKlangParser.g:89:1: ( ruleGame EOF )
            // InternalKlangParser.g:90:1: ruleGame EOF
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
    // InternalKlangParser.g:97:1: ruleGame : ( ( rule__Game__Group__0 ) ) ;
    public final void ruleGame() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:101:2: ( ( ( rule__Game__Group__0 ) ) )
            // InternalKlangParser.g:102:2: ( ( rule__Game__Group__0 ) )
            {
            // InternalKlangParser.g:102:2: ( ( rule__Game__Group__0 ) )
            // InternalKlangParser.g:103:3: ( rule__Game__Group__0 )
            {
             before(grammarAccess.getGameAccess().getGroup()); 
            // InternalKlangParser.g:104:3: ( rule__Game__Group__0 )
            // InternalKlangParser.g:104:4: rule__Game__Group__0
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
    // InternalKlangParser.g:113:1: entryRuleActor : ruleActor EOF ;
    public final void entryRuleActor() throws RecognitionException {
        try {
            // InternalKlangParser.g:114:1: ( ruleActor EOF )
            // InternalKlangParser.g:115:1: ruleActor EOF
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
    // InternalKlangParser.g:122:1: ruleActor : ( ( rule__Actor__Group__0 ) ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:126:2: ( ( ( rule__Actor__Group__0 ) ) )
            // InternalKlangParser.g:127:2: ( ( rule__Actor__Group__0 ) )
            {
            // InternalKlangParser.g:127:2: ( ( rule__Actor__Group__0 ) )
            // InternalKlangParser.g:128:3: ( rule__Actor__Group__0 )
            {
             before(grammarAccess.getActorAccess().getGroup()); 
            // InternalKlangParser.g:129:3: ( rule__Actor__Group__0 )
            // InternalKlangParser.g:129:4: rule__Actor__Group__0
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
    // InternalKlangParser.g:138:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalKlangParser.g:139:1: ( ruleEntity EOF )
            // InternalKlangParser.g:140:1: ruleEntity EOF
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
    // InternalKlangParser.g:147:1: ruleEntity : ( ( rule__Entity__Alternatives ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:151:2: ( ( ( rule__Entity__Alternatives ) ) )
            // InternalKlangParser.g:152:2: ( ( rule__Entity__Alternatives ) )
            {
            // InternalKlangParser.g:152:2: ( ( rule__Entity__Alternatives ) )
            // InternalKlangParser.g:153:3: ( rule__Entity__Alternatives )
            {
             before(grammarAccess.getEntityAccess().getAlternatives()); 
            // InternalKlangParser.g:154:3: ( rule__Entity__Alternatives )
            // InternalKlangParser.g:154:4: rule__Entity__Alternatives
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
    // InternalKlangParser.g:163:1: entryRuleEventHandler : ruleEventHandler EOF ;
    public final void entryRuleEventHandler() throws RecognitionException {
        try {
            // InternalKlangParser.g:164:1: ( ruleEventHandler EOF )
            // InternalKlangParser.g:165:1: ruleEventHandler EOF
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
    // InternalKlangParser.g:172:1: ruleEventHandler : ( ( rule__EventHandler__Alternatives ) ) ;
    public final void ruleEventHandler() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:176:2: ( ( ( rule__EventHandler__Alternatives ) ) )
            // InternalKlangParser.g:177:2: ( ( rule__EventHandler__Alternatives ) )
            {
            // InternalKlangParser.g:177:2: ( ( rule__EventHandler__Alternatives ) )
            // InternalKlangParser.g:178:3: ( rule__EventHandler__Alternatives )
            {
             before(grammarAccess.getEventHandlerAccess().getAlternatives()); 
            // InternalKlangParser.g:179:3: ( rule__EventHandler__Alternatives )
            // InternalKlangParser.g:179:4: rule__EventHandler__Alternatives
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
    // InternalKlangParser.g:188:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalKlangParser.g:189:1: ( ruleStatement EOF )
            // InternalKlangParser.g:190:1: ruleStatement EOF
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
    // InternalKlangParser.g:197:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:201:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalKlangParser.g:202:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalKlangParser.g:202:2: ( ( rule__Statement__Alternatives ) )
            // InternalKlangParser.g:203:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalKlangParser.g:204:3: ( rule__Statement__Alternatives )
            // InternalKlangParser.g:204:4: rule__Statement__Alternatives
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
    // InternalKlangParser.g:213:1: entryRuleGameStart : ruleGameStart EOF ;
    public final void entryRuleGameStart() throws RecognitionException {
        try {
            // InternalKlangParser.g:214:1: ( ruleGameStart EOF )
            // InternalKlangParser.g:215:1: ruleGameStart EOF
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
    // InternalKlangParser.g:222:1: ruleGameStart : ( ( rule__GameStart__Group__0 ) ) ;
    public final void ruleGameStart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:226:2: ( ( ( rule__GameStart__Group__0 ) ) )
            // InternalKlangParser.g:227:2: ( ( rule__GameStart__Group__0 ) )
            {
            // InternalKlangParser.g:227:2: ( ( rule__GameStart__Group__0 ) )
            // InternalKlangParser.g:228:3: ( rule__GameStart__Group__0 )
            {
             before(grammarAccess.getGameStartAccess().getGroup()); 
            // InternalKlangParser.g:229:3: ( rule__GameStart__Group__0 )
            // InternalKlangParser.g:229:4: rule__GameStart__Group__0
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
    // InternalKlangParser.g:238:1: entryRuleSpriteClicked : ruleSpriteClicked EOF ;
    public final void entryRuleSpriteClicked() throws RecognitionException {
        try {
            // InternalKlangParser.g:239:1: ( ruleSpriteClicked EOF )
            // InternalKlangParser.g:240:1: ruleSpriteClicked EOF
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
    // InternalKlangParser.g:247:1: ruleSpriteClicked : ( ( rule__SpriteClicked__Group__0 ) ) ;
    public final void ruleSpriteClicked() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:251:2: ( ( ( rule__SpriteClicked__Group__0 ) ) )
            // InternalKlangParser.g:252:2: ( ( rule__SpriteClicked__Group__0 ) )
            {
            // InternalKlangParser.g:252:2: ( ( rule__SpriteClicked__Group__0 ) )
            // InternalKlangParser.g:253:3: ( rule__SpriteClicked__Group__0 )
            {
             before(grammarAccess.getSpriteClickedAccess().getGroup()); 
            // InternalKlangParser.g:254:3: ( rule__SpriteClicked__Group__0 )
            // InternalKlangParser.g:254:4: rule__SpriteClicked__Group__0
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
    // InternalKlangParser.g:263:1: entryRuleKeyPressed : ruleKeyPressed EOF ;
    public final void entryRuleKeyPressed() throws RecognitionException {
        try {
            // InternalKlangParser.g:264:1: ( ruleKeyPressed EOF )
            // InternalKlangParser.g:265:1: ruleKeyPressed EOF
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
    // InternalKlangParser.g:272:1: ruleKeyPressed : ( ( rule__KeyPressed__Group__0 ) ) ;
    public final void ruleKeyPressed() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:276:2: ( ( ( rule__KeyPressed__Group__0 ) ) )
            // InternalKlangParser.g:277:2: ( ( rule__KeyPressed__Group__0 ) )
            {
            // InternalKlangParser.g:277:2: ( ( rule__KeyPressed__Group__0 ) )
            // InternalKlangParser.g:278:3: ( rule__KeyPressed__Group__0 )
            {
             before(grammarAccess.getKeyPressedAccess().getGroup()); 
            // InternalKlangParser.g:279:3: ( rule__KeyPressed__Group__0 )
            // InternalKlangParser.g:279:4: rule__KeyPressed__Group__0
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
    // InternalKlangParser.g:288:1: entryRuleCollidesWith : ruleCollidesWith EOF ;
    public final void entryRuleCollidesWith() throws RecognitionException {
        try {
            // InternalKlangParser.g:289:1: ( ruleCollidesWith EOF )
            // InternalKlangParser.g:290:1: ruleCollidesWith EOF
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
    // InternalKlangParser.g:297:1: ruleCollidesWith : ( ( rule__CollidesWith__Group__0 ) ) ;
    public final void ruleCollidesWith() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:301:2: ( ( ( rule__CollidesWith__Group__0 ) ) )
            // InternalKlangParser.g:302:2: ( ( rule__CollidesWith__Group__0 ) )
            {
            // InternalKlangParser.g:302:2: ( ( rule__CollidesWith__Group__0 ) )
            // InternalKlangParser.g:303:3: ( rule__CollidesWith__Group__0 )
            {
             before(grammarAccess.getCollidesWithAccess().getGroup()); 
            // InternalKlangParser.g:304:3: ( rule__CollidesWith__Group__0 )
            // InternalKlangParser.g:304:4: rule__CollidesWith__Group__0
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
    // InternalKlangParser.g:313:1: entryRuleWhileLoop : ruleWhileLoop EOF ;
    public final void entryRuleWhileLoop() throws RecognitionException {
        try {
            // InternalKlangParser.g:314:1: ( ruleWhileLoop EOF )
            // InternalKlangParser.g:315:1: ruleWhileLoop EOF
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
    // InternalKlangParser.g:322:1: ruleWhileLoop : ( ( rule__WhileLoop__Group__0 ) ) ;
    public final void ruleWhileLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:326:2: ( ( ( rule__WhileLoop__Group__0 ) ) )
            // InternalKlangParser.g:327:2: ( ( rule__WhileLoop__Group__0 ) )
            {
            // InternalKlangParser.g:327:2: ( ( rule__WhileLoop__Group__0 ) )
            // InternalKlangParser.g:328:3: ( rule__WhileLoop__Group__0 )
            {
             before(grammarAccess.getWhileLoopAccess().getGroup()); 
            // InternalKlangParser.g:329:3: ( rule__WhileLoop__Group__0 )
            // InternalKlangParser.g:329:4: rule__WhileLoop__Group__0
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
    // InternalKlangParser.g:338:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // InternalKlangParser.g:339:1: ( ruleIf EOF )
            // InternalKlangParser.g:340:1: ruleIf EOF
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
    // InternalKlangParser.g:347:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:351:2: ( ( ( rule__If__Group__0 ) ) )
            // InternalKlangParser.g:352:2: ( ( rule__If__Group__0 ) )
            {
            // InternalKlangParser.g:352:2: ( ( rule__If__Group__0 ) )
            // InternalKlangParser.g:353:3: ( rule__If__Group__0 )
            {
             before(grammarAccess.getIfAccess().getGroup()); 
            // InternalKlangParser.g:354:3: ( rule__If__Group__0 )
            // InternalKlangParser.g:354:4: rule__If__Group__0
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
    // InternalKlangParser.g:363:1: entryRuleForeverLoop : ruleForeverLoop EOF ;
    public final void entryRuleForeverLoop() throws RecognitionException {
        try {
            // InternalKlangParser.g:364:1: ( ruleForeverLoop EOF )
            // InternalKlangParser.g:365:1: ruleForeverLoop EOF
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
    // InternalKlangParser.g:372:1: ruleForeverLoop : ( ( rule__ForeverLoop__Group__0 ) ) ;
    public final void ruleForeverLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:376:2: ( ( ( rule__ForeverLoop__Group__0 ) ) )
            // InternalKlangParser.g:377:2: ( ( rule__ForeverLoop__Group__0 ) )
            {
            // InternalKlangParser.g:377:2: ( ( rule__ForeverLoop__Group__0 ) )
            // InternalKlangParser.g:378:3: ( rule__ForeverLoop__Group__0 )
            {
             before(grammarAccess.getForeverLoopAccess().getGroup()); 
            // InternalKlangParser.g:379:3: ( rule__ForeverLoop__Group__0 )
            // InternalKlangParser.g:379:4: rule__ForeverLoop__Group__0
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
    // InternalKlangParser.g:388:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalKlangParser.g:389:1: ( ruleVariable EOF )
            // InternalKlangParser.g:390:1: ruleVariable EOF
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
    // InternalKlangParser.g:397:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:401:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalKlangParser.g:402:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalKlangParser.g:402:2: ( ( rule__Variable__Group__0 ) )
            // InternalKlangParser.g:403:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalKlangParser.g:404:3: ( rule__Variable__Group__0 )
            // InternalKlangParser.g:404:4: rule__Variable__Group__0
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
    // InternalKlangParser.g:413:1: entryRuleVariableAssignment : ruleVariableAssignment EOF ;
    public final void entryRuleVariableAssignment() throws RecognitionException {
        try {
            // InternalKlangParser.g:414:1: ( ruleVariableAssignment EOF )
            // InternalKlangParser.g:415:1: ruleVariableAssignment EOF
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
    // InternalKlangParser.g:422:1: ruleVariableAssignment : ( ( rule__VariableAssignment__Group__0 ) ) ;
    public final void ruleVariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:426:2: ( ( ( rule__VariableAssignment__Group__0 ) ) )
            // InternalKlangParser.g:427:2: ( ( rule__VariableAssignment__Group__0 ) )
            {
            // InternalKlangParser.g:427:2: ( ( rule__VariableAssignment__Group__0 ) )
            // InternalKlangParser.g:428:3: ( rule__VariableAssignment__Group__0 )
            {
             before(grammarAccess.getVariableAssignmentAccess().getGroup()); 
            // InternalKlangParser.g:429:3: ( rule__VariableAssignment__Group__0 )
            // InternalKlangParser.g:429:4: rule__VariableAssignment__Group__0
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


    // $ANTLR start "entryRuleExpression"
    // InternalKlangParser.g:438:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalKlangParser.g:439:1: ( ruleExpression EOF )
            // InternalKlangParser.g:440:1: ruleExpression EOF
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
    // InternalKlangParser.g:447:1: ruleExpression : ( ruleOr ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:451:2: ( ( ruleOr ) )
            // InternalKlangParser.g:452:2: ( ruleOr )
            {
            // InternalKlangParser.g:452:2: ( ruleOr )
            // InternalKlangParser.g:453:3: ruleOr
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
    // InternalKlangParser.g:463:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalKlangParser.g:464:1: ( ruleOr EOF )
            // InternalKlangParser.g:465:1: ruleOr EOF
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
    // InternalKlangParser.g:472:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:476:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalKlangParser.g:477:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalKlangParser.g:477:2: ( ( rule__Or__Group__0 ) )
            // InternalKlangParser.g:478:3: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // InternalKlangParser.g:479:3: ( rule__Or__Group__0 )
            // InternalKlangParser.g:479:4: rule__Or__Group__0
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
    // InternalKlangParser.g:488:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalKlangParser.g:489:1: ( ruleAnd EOF )
            // InternalKlangParser.g:490:1: ruleAnd EOF
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
    // InternalKlangParser.g:497:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:501:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalKlangParser.g:502:2: ( ( rule__And__Group__0 ) )
            {
            // InternalKlangParser.g:502:2: ( ( rule__And__Group__0 ) )
            // InternalKlangParser.g:503:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalKlangParser.g:504:3: ( rule__And__Group__0 )
            // InternalKlangParser.g:504:4: rule__And__Group__0
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
    // InternalKlangParser.g:513:1: entryRulePlus : rulePlus EOF ;
    public final void entryRulePlus() throws RecognitionException {
        try {
            // InternalKlangParser.g:514:1: ( rulePlus EOF )
            // InternalKlangParser.g:515:1: rulePlus EOF
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
    // InternalKlangParser.g:522:1: rulePlus : ( ( rule__Plus__Group__0 ) ) ;
    public final void rulePlus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:526:2: ( ( ( rule__Plus__Group__0 ) ) )
            // InternalKlangParser.g:527:2: ( ( rule__Plus__Group__0 ) )
            {
            // InternalKlangParser.g:527:2: ( ( rule__Plus__Group__0 ) )
            // InternalKlangParser.g:528:3: ( rule__Plus__Group__0 )
            {
             before(grammarAccess.getPlusAccess().getGroup()); 
            // InternalKlangParser.g:529:3: ( rule__Plus__Group__0 )
            // InternalKlangParser.g:529:4: rule__Plus__Group__0
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
    // InternalKlangParser.g:538:1: entryRuleMinus : ruleMinus EOF ;
    public final void entryRuleMinus() throws RecognitionException {
        try {
            // InternalKlangParser.g:539:1: ( ruleMinus EOF )
            // InternalKlangParser.g:540:1: ruleMinus EOF
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
    // InternalKlangParser.g:547:1: ruleMinus : ( ( rule__Minus__Group__0 ) ) ;
    public final void ruleMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:551:2: ( ( ( rule__Minus__Group__0 ) ) )
            // InternalKlangParser.g:552:2: ( ( rule__Minus__Group__0 ) )
            {
            // InternalKlangParser.g:552:2: ( ( rule__Minus__Group__0 ) )
            // InternalKlangParser.g:553:3: ( rule__Minus__Group__0 )
            {
             before(grammarAccess.getMinusAccess().getGroup()); 
            // InternalKlangParser.g:554:3: ( rule__Minus__Group__0 )
            // InternalKlangParser.g:554:4: rule__Minus__Group__0
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
    // InternalKlangParser.g:563:1: entryRuleMultiply : ruleMultiply EOF ;
    public final void entryRuleMultiply() throws RecognitionException {
        try {
            // InternalKlangParser.g:564:1: ( ruleMultiply EOF )
            // InternalKlangParser.g:565:1: ruleMultiply EOF
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
    // InternalKlangParser.g:572:1: ruleMultiply : ( ( rule__Multiply__Group__0 ) ) ;
    public final void ruleMultiply() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:576:2: ( ( ( rule__Multiply__Group__0 ) ) )
            // InternalKlangParser.g:577:2: ( ( rule__Multiply__Group__0 ) )
            {
            // InternalKlangParser.g:577:2: ( ( rule__Multiply__Group__0 ) )
            // InternalKlangParser.g:578:3: ( rule__Multiply__Group__0 )
            {
             before(grammarAccess.getMultiplyAccess().getGroup()); 
            // InternalKlangParser.g:579:3: ( rule__Multiply__Group__0 )
            // InternalKlangParser.g:579:4: rule__Multiply__Group__0
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
    // InternalKlangParser.g:588:1: entryRuleDivide : ruleDivide EOF ;
    public final void entryRuleDivide() throws RecognitionException {
        try {
            // InternalKlangParser.g:589:1: ( ruleDivide EOF )
            // InternalKlangParser.g:590:1: ruleDivide EOF
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
    // InternalKlangParser.g:597:1: ruleDivide : ( ( rule__Divide__Group__0 ) ) ;
    public final void ruleDivide() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:601:2: ( ( ( rule__Divide__Group__0 ) ) )
            // InternalKlangParser.g:602:2: ( ( rule__Divide__Group__0 ) )
            {
            // InternalKlangParser.g:602:2: ( ( rule__Divide__Group__0 ) )
            // InternalKlangParser.g:603:3: ( rule__Divide__Group__0 )
            {
             before(grammarAccess.getDivideAccess().getGroup()); 
            // InternalKlangParser.g:604:3: ( rule__Divide__Group__0 )
            // InternalKlangParser.g:604:4: rule__Divide__Group__0
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
    // InternalKlangParser.g:613:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalKlangParser.g:614:1: ( ruleComparison EOF )
            // InternalKlangParser.g:615:1: ruleComparison EOF
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
    // InternalKlangParser.g:622:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:626:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalKlangParser.g:627:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalKlangParser.g:627:2: ( ( rule__Comparison__Group__0 ) )
            // InternalKlangParser.g:628:3: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // InternalKlangParser.g:629:3: ( rule__Comparison__Group__0 )
            // InternalKlangParser.g:629:4: rule__Comparison__Group__0
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
    // InternalKlangParser.g:638:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // InternalKlangParser.g:639:1: ( ruleFunctionCall EOF )
            // InternalKlangParser.g:640:1: ruleFunctionCall EOF
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
    // InternalKlangParser.g:647:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:651:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // InternalKlangParser.g:652:2: ( ( rule__FunctionCall__Group__0 ) )
            {
            // InternalKlangParser.g:652:2: ( ( rule__FunctionCall__Group__0 ) )
            // InternalKlangParser.g:653:3: ( rule__FunctionCall__Group__0 )
            {
             before(grammarAccess.getFunctionCallAccess().getGroup()); 
            // InternalKlangParser.g:654:3: ( rule__FunctionCall__Group__0 )
            // InternalKlangParser.g:654:4: rule__FunctionCall__Group__0
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
    // InternalKlangParser.g:663:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalKlangParser.g:664:1: ( rulePrimaryExpression EOF )
            // InternalKlangParser.g:665:1: rulePrimaryExpression EOF
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
    // InternalKlangParser.g:672:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:676:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalKlangParser.g:677:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalKlangParser.g:677:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalKlangParser.g:678:3: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // InternalKlangParser.g:679:3: ( rule__PrimaryExpression__Alternatives )
            // InternalKlangParser.g:679:4: rule__PrimaryExpression__Alternatives
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
    // InternalKlangParser.g:688:1: entryRuleAtomicExpression : ruleAtomicExpression EOF ;
    public final void entryRuleAtomicExpression() throws RecognitionException {
        try {
            // InternalKlangParser.g:689:1: ( ruleAtomicExpression EOF )
            // InternalKlangParser.g:690:1: ruleAtomicExpression EOF
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
    // InternalKlangParser.g:697:1: ruleAtomicExpression : ( ( rule__AtomicExpression__Alternatives ) ) ;
    public final void ruleAtomicExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:701:2: ( ( ( rule__AtomicExpression__Alternatives ) ) )
            // InternalKlangParser.g:702:2: ( ( rule__AtomicExpression__Alternatives ) )
            {
            // InternalKlangParser.g:702:2: ( ( rule__AtomicExpression__Alternatives ) )
            // InternalKlangParser.g:703:3: ( rule__AtomicExpression__Alternatives )
            {
             before(grammarAccess.getAtomicExpressionAccess().getAlternatives()); 
            // InternalKlangParser.g:704:3: ( rule__AtomicExpression__Alternatives )
            // InternalKlangParser.g:704:4: rule__AtomicExpression__Alternatives
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
    // InternalKlangParser.g:712:1: rule__Entity__Alternatives : ( ( ( rule__Entity__Group_0__0 ) ) | ( ( rule__Entity__Group_1__0 ) ) );
    public final void rule__Entity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:716:1: ( ( ( rule__Entity__Group_0__0 ) ) | ( ( rule__Entity__Group_1__0 ) ) )
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
                    // InternalKlangParser.g:717:2: ( ( rule__Entity__Group_0__0 ) )
                    {
                    // InternalKlangParser.g:717:2: ( ( rule__Entity__Group_0__0 ) )
                    // InternalKlangParser.g:718:3: ( rule__Entity__Group_0__0 )
                    {
                     before(grammarAccess.getEntityAccess().getGroup_0()); 
                    // InternalKlangParser.g:719:3: ( rule__Entity__Group_0__0 )
                    // InternalKlangParser.g:719:4: rule__Entity__Group_0__0
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
                    // InternalKlangParser.g:723:2: ( ( rule__Entity__Group_1__0 ) )
                    {
                    // InternalKlangParser.g:723:2: ( ( rule__Entity__Group_1__0 ) )
                    // InternalKlangParser.g:724:3: ( rule__Entity__Group_1__0 )
                    {
                     before(grammarAccess.getEntityAccess().getGroup_1()); 
                    // InternalKlangParser.g:725:3: ( rule__Entity__Group_1__0 )
                    // InternalKlangParser.g:725:4: rule__Entity__Group_1__0
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
    // InternalKlangParser.g:733:1: rule__EventHandler__Alternatives : ( ( ruleGameStart ) | ( ruleSpriteClicked ) | ( ruleKeyPressed ) | ( ruleCollidesWith ) );
    public final void rule__EventHandler__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:737:1: ( ( ruleGameStart ) | ( ruleSpriteClicked ) | ( ruleKeyPressed ) | ( ruleCollidesWith ) )
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
                case RULE_STRING:
                    {
                    alt2=3;
                    }
                    break;
                case This:
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
                    // InternalKlangParser.g:738:2: ( ruleGameStart )
                    {
                    // InternalKlangParser.g:738:2: ( ruleGameStart )
                    // InternalKlangParser.g:739:3: ruleGameStart
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
                    // InternalKlangParser.g:744:2: ( ruleSpriteClicked )
                    {
                    // InternalKlangParser.g:744:2: ( ruleSpriteClicked )
                    // InternalKlangParser.g:745:3: ruleSpriteClicked
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
                    // InternalKlangParser.g:750:2: ( ruleKeyPressed )
                    {
                    // InternalKlangParser.g:750:2: ( ruleKeyPressed )
                    // InternalKlangParser.g:751:3: ruleKeyPressed
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
                    // InternalKlangParser.g:756:2: ( ruleCollidesWith )
                    {
                    // InternalKlangParser.g:756:2: ( ruleCollidesWith )
                    // InternalKlangParser.g:757:3: ruleCollidesWith
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
    // InternalKlangParser.g:766:1: rule__Statement__Alternatives : ( ( ruleWhileLoop ) | ( ruleIf ) | ( ruleVariableAssignment ) | ( ruleForeverLoop ) | ( ruleFunctionCall ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:770:1: ( ( ruleWhileLoop ) | ( ruleIf ) | ( ruleVariableAssignment ) | ( ruleForeverLoop ) | ( ruleFunctionCall ) )
            int alt3=5;
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
                alt3=3;
                }
                break;
            case Forever:
                {
                alt3=4;
                }
                break;
            case FullStop:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalKlangParser.g:771:2: ( ruleWhileLoop )
                    {
                    // InternalKlangParser.g:771:2: ( ruleWhileLoop )
                    // InternalKlangParser.g:772:3: ruleWhileLoop
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
                    // InternalKlangParser.g:777:2: ( ruleIf )
                    {
                    // InternalKlangParser.g:777:2: ( ruleIf )
                    // InternalKlangParser.g:778:3: ruleIf
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
                    // InternalKlangParser.g:783:2: ( ruleVariableAssignment )
                    {
                    // InternalKlangParser.g:783:2: ( ruleVariableAssignment )
                    // InternalKlangParser.g:784:3: ruleVariableAssignment
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
                    // InternalKlangParser.g:789:2: ( ruleForeverLoop )
                    {
                    // InternalKlangParser.g:789:2: ( ruleForeverLoop )
                    // InternalKlangParser.g:790:3: ruleForeverLoop
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
                    // InternalKlangParser.g:795:2: ( ruleFunctionCall )
                    {
                    // InternalKlangParser.g:795:2: ( ruleFunctionCall )
                    // InternalKlangParser.g:796:3: ruleFunctionCall
                    {
                     before(grammarAccess.getStatementAccess().getFunctionCallParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleFunctionCall();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getFunctionCallParserRuleCall_4()); 

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
    // InternalKlangParser.g:805:1: rule__Comparison__Alternatives_1_0 : ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) | ( ( rule__Comparison__Group_1_0_2__0 ) ) );
    public final void rule__Comparison__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:809:1: ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) | ( ( rule__Comparison__Group_1_0_2__0 ) ) )
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
                    // InternalKlangParser.g:810:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    {
                    // InternalKlangParser.g:810:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    // InternalKlangParser.g:811:3: ( rule__Comparison__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0_0()); 
                    // InternalKlangParser.g:812:3: ( rule__Comparison__Group_1_0_0__0 )
                    // InternalKlangParser.g:812:4: rule__Comparison__Group_1_0_0__0
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
                    // InternalKlangParser.g:816:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    {
                    // InternalKlangParser.g:816:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    // InternalKlangParser.g:817:3: ( rule__Comparison__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0_1()); 
                    // InternalKlangParser.g:818:3: ( rule__Comparison__Group_1_0_1__0 )
                    // InternalKlangParser.g:818:4: rule__Comparison__Group_1_0_1__0
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
                    // InternalKlangParser.g:822:2: ( ( rule__Comparison__Group_1_0_2__0 ) )
                    {
                    // InternalKlangParser.g:822:2: ( ( rule__Comparison__Group_1_0_2__0 ) )
                    // InternalKlangParser.g:823:3: ( rule__Comparison__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0_2()); 
                    // InternalKlangParser.g:824:3: ( rule__Comparison__Group_1_0_2__0 )
                    // InternalKlangParser.g:824:4: rule__Comparison__Group_1_0_2__0
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
    // InternalKlangParser.g:832:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ruleFunctionCall ) | ( ruleAtomicExpression ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:836:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ruleFunctionCall ) | ( ruleAtomicExpression ) )
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
            case FullStop:
                {
                alt5=3;
                }
                break;
            case False:
            case True:
            case RULE_DECIMAL:
            case RULE_ID:
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
                    // InternalKlangParser.g:837:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // InternalKlangParser.g:837:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // InternalKlangParser.g:838:3: ( rule__PrimaryExpression__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    // InternalKlangParser.g:839:3: ( rule__PrimaryExpression__Group_0__0 )
                    // InternalKlangParser.g:839:4: rule__PrimaryExpression__Group_0__0
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
                    // InternalKlangParser.g:843:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    {
                    // InternalKlangParser.g:843:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    // InternalKlangParser.g:844:3: ( rule__PrimaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
                    // InternalKlangParser.g:845:3: ( rule__PrimaryExpression__Group_1__0 )
                    // InternalKlangParser.g:845:4: rule__PrimaryExpression__Group_1__0
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
                    // InternalKlangParser.g:849:2: ( ruleFunctionCall )
                    {
                    // InternalKlangParser.g:849:2: ( ruleFunctionCall )
                    // InternalKlangParser.g:850:3: ruleFunctionCall
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
                    // InternalKlangParser.g:855:2: ( ruleAtomicExpression )
                    {
                    // InternalKlangParser.g:855:2: ( ruleAtomicExpression )
                    // InternalKlangParser.g:856:3: ruleAtomicExpression
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
    // InternalKlangParser.g:865:1: rule__AtomicExpression__Alternatives : ( ( ( rule__AtomicExpression__Group_0__0 ) ) | ( ( rule__AtomicExpression__Group_1__0 ) ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:869:1: ( ( ( rule__AtomicExpression__Group_0__0 ) ) | ( ( rule__AtomicExpression__Group_1__0 ) ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) )
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
                    // InternalKlangParser.g:870:2: ( ( rule__AtomicExpression__Group_0__0 ) )
                    {
                    // InternalKlangParser.g:870:2: ( ( rule__AtomicExpression__Group_0__0 ) )
                    // InternalKlangParser.g:871:3: ( rule__AtomicExpression__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getGroup_0()); 
                    // InternalKlangParser.g:872:3: ( rule__AtomicExpression__Group_0__0 )
                    // InternalKlangParser.g:872:4: rule__AtomicExpression__Group_0__0
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
                    // InternalKlangParser.g:876:2: ( ( rule__AtomicExpression__Group_1__0 ) )
                    {
                    // InternalKlangParser.g:876:2: ( ( rule__AtomicExpression__Group_1__0 ) )
                    // InternalKlangParser.g:877:3: ( rule__AtomicExpression__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getGroup_1()); 
                    // InternalKlangParser.g:878:3: ( rule__AtomicExpression__Group_1__0 )
                    // InternalKlangParser.g:878:4: rule__AtomicExpression__Group_1__0
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
                    // InternalKlangParser.g:882:2: ( ( rule__AtomicExpression__Group_2__0 ) )
                    {
                    // InternalKlangParser.g:882:2: ( ( rule__AtomicExpression__Group_2__0 ) )
                    // InternalKlangParser.g:883:3: ( rule__AtomicExpression__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getGroup_2()); 
                    // InternalKlangParser.g:884:3: ( rule__AtomicExpression__Group_2__0 )
                    // InternalKlangParser.g:884:4: rule__AtomicExpression__Group_2__0
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
                    // InternalKlangParser.g:888:2: ( ( rule__AtomicExpression__Group_3__0 ) )
                    {
                    // InternalKlangParser.g:888:2: ( ( rule__AtomicExpression__Group_3__0 ) )
                    // InternalKlangParser.g:889:3: ( rule__AtomicExpression__Group_3__0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getGroup_3()); 
                    // InternalKlangParser.g:890:3: ( rule__AtomicExpression__Group_3__0 )
                    // InternalKlangParser.g:890:4: rule__AtomicExpression__Group_3__0
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
    // InternalKlangParser.g:898:1: rule__AtomicExpression__Alternatives_0_1 : ( ( ( rule__AtomicExpression__ValueAssignment_0_1_0 ) ) | ( False ) );
    public final void rule__AtomicExpression__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:902:1: ( ( ( rule__AtomicExpression__ValueAssignment_0_1_0 ) ) | ( False ) )
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
                    // InternalKlangParser.g:903:2: ( ( rule__AtomicExpression__ValueAssignment_0_1_0 ) )
                    {
                    // InternalKlangParser.g:903:2: ( ( rule__AtomicExpression__ValueAssignment_0_1_0 ) )
                    // InternalKlangParser.g:904:3: ( rule__AtomicExpression__ValueAssignment_0_1_0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getValueAssignment_0_1_0()); 
                    // InternalKlangParser.g:905:3: ( rule__AtomicExpression__ValueAssignment_0_1_0 )
                    // InternalKlangParser.g:905:4: rule__AtomicExpression__ValueAssignment_0_1_0
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
                    // InternalKlangParser.g:909:2: ( False )
                    {
                    // InternalKlangParser.g:909:2: ( False )
                    // InternalKlangParser.g:910:3: False
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
    // InternalKlangParser.g:919:1: rule__Game__Group__0 : rule__Game__Group__0__Impl rule__Game__Group__1 ;
    public final void rule__Game__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:923:1: ( rule__Game__Group__0__Impl rule__Game__Group__1 )
            // InternalKlangParser.g:924:2: rule__Game__Group__0__Impl rule__Game__Group__1
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
    // InternalKlangParser.g:931:1: rule__Game__Group__0__Impl : ( () ) ;
    public final void rule__Game__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:935:1: ( ( () ) )
            // InternalKlangParser.g:936:1: ( () )
            {
            // InternalKlangParser.g:936:1: ( () )
            // InternalKlangParser.g:937:2: ()
            {
             before(grammarAccess.getGameAccess().getGameAction_0()); 
            // InternalKlangParser.g:938:2: ()
            // InternalKlangParser.g:938:3: 
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
    // InternalKlangParser.g:946:1: rule__Game__Group__1 : rule__Game__Group__1__Impl rule__Game__Group__2 ;
    public final void rule__Game__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:950:1: ( rule__Game__Group__1__Impl rule__Game__Group__2 )
            // InternalKlangParser.g:951:2: rule__Game__Group__1__Impl rule__Game__Group__2
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
    // InternalKlangParser.g:958:1: rule__Game__Group__1__Impl : ( ( rule__Game__VariableDeclarationsAssignment_1 )* ) ;
    public final void rule__Game__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:962:1: ( ( ( rule__Game__VariableDeclarationsAssignment_1 )* ) )
            // InternalKlangParser.g:963:1: ( ( rule__Game__VariableDeclarationsAssignment_1 )* )
            {
            // InternalKlangParser.g:963:1: ( ( rule__Game__VariableDeclarationsAssignment_1 )* )
            // InternalKlangParser.g:964:2: ( rule__Game__VariableDeclarationsAssignment_1 )*
            {
             before(grammarAccess.getGameAccess().getVariableDeclarationsAssignment_1()); 
            // InternalKlangParser.g:965:2: ( rule__Game__VariableDeclarationsAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Var) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKlangParser.g:965:3: rule__Game__VariableDeclarationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Game__VariableDeclarationsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getGameAccess().getVariableDeclarationsAssignment_1()); 

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
    // InternalKlangParser.g:973:1: rule__Game__Group__2 : rule__Game__Group__2__Impl ;
    public final void rule__Game__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:977:1: ( rule__Game__Group__2__Impl )
            // InternalKlangParser.g:978:2: rule__Game__Group__2__Impl
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
    // InternalKlangParser.g:984:1: rule__Game__Group__2__Impl : ( ( rule__Game__ActorDefsAssignment_2 )* ) ;
    public final void rule__Game__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:988:1: ( ( ( rule__Game__ActorDefsAssignment_2 )* ) )
            // InternalKlangParser.g:989:1: ( ( rule__Game__ActorDefsAssignment_2 )* )
            {
            // InternalKlangParser.g:989:1: ( ( rule__Game__ActorDefsAssignment_2 )* )
            // InternalKlangParser.g:990:2: ( rule__Game__ActorDefsAssignment_2 )*
            {
             before(grammarAccess.getGameAccess().getActorDefsAssignment_2()); 
            // InternalKlangParser.g:991:2: ( rule__Game__ActorDefsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Sprite||LA9_0==Scene) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalKlangParser.g:991:3: rule__Game__ActorDefsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Game__ActorDefsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getGameAccess().getActorDefsAssignment_2()); 

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
    // InternalKlangParser.g:1000:1: rule__Actor__Group__0 : rule__Actor__Group__0__Impl rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1004:1: ( rule__Actor__Group__0__Impl rule__Actor__Group__1 )
            // InternalKlangParser.g:1005:2: rule__Actor__Group__0__Impl rule__Actor__Group__1
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
    // InternalKlangParser.g:1012:1: rule__Actor__Group__0__Impl : ( () ) ;
    public final void rule__Actor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1016:1: ( ( () ) )
            // InternalKlangParser.g:1017:1: ( () )
            {
            // InternalKlangParser.g:1017:1: ( () )
            // InternalKlangParser.g:1018:2: ()
            {
             before(grammarAccess.getActorAccess().getActorAction_0()); 
            // InternalKlangParser.g:1019:2: ()
            // InternalKlangParser.g:1019:3: 
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
    // InternalKlangParser.g:1027:1: rule__Actor__Group__1 : rule__Actor__Group__1__Impl rule__Actor__Group__2 ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1031:1: ( rule__Actor__Group__1__Impl rule__Actor__Group__2 )
            // InternalKlangParser.g:1032:2: rule__Actor__Group__1__Impl rule__Actor__Group__2
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
    // InternalKlangParser.g:1039:1: rule__Actor__Group__1__Impl : ( ( rule__Actor__EntityAssignment_1 ) ) ;
    public final void rule__Actor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1043:1: ( ( ( rule__Actor__EntityAssignment_1 ) ) )
            // InternalKlangParser.g:1044:1: ( ( rule__Actor__EntityAssignment_1 ) )
            {
            // InternalKlangParser.g:1044:1: ( ( rule__Actor__EntityAssignment_1 ) )
            // InternalKlangParser.g:1045:2: ( rule__Actor__EntityAssignment_1 )
            {
             before(grammarAccess.getActorAccess().getEntityAssignment_1()); 
            // InternalKlangParser.g:1046:2: ( rule__Actor__EntityAssignment_1 )
            // InternalKlangParser.g:1046:3: rule__Actor__EntityAssignment_1
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
    // InternalKlangParser.g:1054:1: rule__Actor__Group__2 : rule__Actor__Group__2__Impl rule__Actor__Group__3 ;
    public final void rule__Actor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1058:1: ( rule__Actor__Group__2__Impl rule__Actor__Group__3 )
            // InternalKlangParser.g:1059:2: rule__Actor__Group__2__Impl rule__Actor__Group__3
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
    // InternalKlangParser.g:1066:1: rule__Actor__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__Actor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1070:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:1071:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:1071:1: ( RULE_BEGIN )
            // InternalKlangParser.g:1072:2: RULE_BEGIN
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
    // InternalKlangParser.g:1081:1: rule__Actor__Group__3 : rule__Actor__Group__3__Impl rule__Actor__Group__4 ;
    public final void rule__Actor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1085:1: ( rule__Actor__Group__3__Impl rule__Actor__Group__4 )
            // InternalKlangParser.g:1086:2: rule__Actor__Group__3__Impl rule__Actor__Group__4
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
    // InternalKlangParser.g:1093:1: rule__Actor__Group__3__Impl : ( ( rule__Actor__VariableDeclarationsAssignment_3 )* ) ;
    public final void rule__Actor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1097:1: ( ( ( rule__Actor__VariableDeclarationsAssignment_3 )* ) )
            // InternalKlangParser.g:1098:1: ( ( rule__Actor__VariableDeclarationsAssignment_3 )* )
            {
            // InternalKlangParser.g:1098:1: ( ( rule__Actor__VariableDeclarationsAssignment_3 )* )
            // InternalKlangParser.g:1099:2: ( rule__Actor__VariableDeclarationsAssignment_3 )*
            {
             before(grammarAccess.getActorAccess().getVariableDeclarationsAssignment_3()); 
            // InternalKlangParser.g:1100:2: ( rule__Actor__VariableDeclarationsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Var) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalKlangParser.g:1100:3: rule__Actor__VariableDeclarationsAssignment_3
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
    // InternalKlangParser.g:1108:1: rule__Actor__Group__4 : rule__Actor__Group__4__Impl rule__Actor__Group__5 ;
    public final void rule__Actor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1112:1: ( rule__Actor__Group__4__Impl rule__Actor__Group__5 )
            // InternalKlangParser.g:1113:2: rule__Actor__Group__4__Impl rule__Actor__Group__5
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
    // InternalKlangParser.g:1120:1: rule__Actor__Group__4__Impl : ( ( rule__Actor__EventHandlersAssignment_4 )* ) ;
    public final void rule__Actor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1124:1: ( ( ( rule__Actor__EventHandlersAssignment_4 )* ) )
            // InternalKlangParser.g:1125:1: ( ( rule__Actor__EventHandlersAssignment_4 )* )
            {
            // InternalKlangParser.g:1125:1: ( ( rule__Actor__EventHandlersAssignment_4 )* )
            // InternalKlangParser.g:1126:2: ( rule__Actor__EventHandlersAssignment_4 )*
            {
             before(grammarAccess.getActorAccess().getEventHandlersAssignment_4()); 
            // InternalKlangParser.g:1127:2: ( rule__Actor__EventHandlersAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==When) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalKlangParser.g:1127:3: rule__Actor__EventHandlersAssignment_4
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
    // InternalKlangParser.g:1135:1: rule__Actor__Group__5 : rule__Actor__Group__5__Impl ;
    public final void rule__Actor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1139:1: ( rule__Actor__Group__5__Impl )
            // InternalKlangParser.g:1140:2: rule__Actor__Group__5__Impl
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
    // InternalKlangParser.g:1146:1: rule__Actor__Group__5__Impl : ( RULE_END ) ;
    public final void rule__Actor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1150:1: ( ( RULE_END ) )
            // InternalKlangParser.g:1151:1: ( RULE_END )
            {
            // InternalKlangParser.g:1151:1: ( RULE_END )
            // InternalKlangParser.g:1152:2: RULE_END
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
    // InternalKlangParser.g:1162:1: rule__Entity__Group_0__0 : rule__Entity__Group_0__0__Impl rule__Entity__Group_0__1 ;
    public final void rule__Entity__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1166:1: ( rule__Entity__Group_0__0__Impl rule__Entity__Group_0__1 )
            // InternalKlangParser.g:1167:2: rule__Entity__Group_0__0__Impl rule__Entity__Group_0__1
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
    // InternalKlangParser.g:1174:1: rule__Entity__Group_0__0__Impl : ( Sprite ) ;
    public final void rule__Entity__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1178:1: ( ( Sprite ) )
            // InternalKlangParser.g:1179:1: ( Sprite )
            {
            // InternalKlangParser.g:1179:1: ( Sprite )
            // InternalKlangParser.g:1180:2: Sprite
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
    // InternalKlangParser.g:1189:1: rule__Entity__Group_0__1 : rule__Entity__Group_0__1__Impl rule__Entity__Group_0__2 ;
    public final void rule__Entity__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1193:1: ( rule__Entity__Group_0__1__Impl rule__Entity__Group_0__2 )
            // InternalKlangParser.g:1194:2: rule__Entity__Group_0__1__Impl rule__Entity__Group_0__2
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
    // InternalKlangParser.g:1201:1: rule__Entity__Group_0__1__Impl : ( () ) ;
    public final void rule__Entity__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1205:1: ( ( () ) )
            // InternalKlangParser.g:1206:1: ( () )
            {
            // InternalKlangParser.g:1206:1: ( () )
            // InternalKlangParser.g:1207:2: ()
            {
             before(grammarAccess.getEntityAccess().getSpriteEntityAction_0_1()); 
            // InternalKlangParser.g:1208:2: ()
            // InternalKlangParser.g:1208:3: 
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
    // InternalKlangParser.g:1216:1: rule__Entity__Group_0__2 : rule__Entity__Group_0__2__Impl ;
    public final void rule__Entity__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1220:1: ( rule__Entity__Group_0__2__Impl )
            // InternalKlangParser.g:1221:2: rule__Entity__Group_0__2__Impl
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
    // InternalKlangParser.g:1227:1: rule__Entity__Group_0__2__Impl : ( ( rule__Entity__NameAssignment_0_2 ) ) ;
    public final void rule__Entity__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1231:1: ( ( ( rule__Entity__NameAssignment_0_2 ) ) )
            // InternalKlangParser.g:1232:1: ( ( rule__Entity__NameAssignment_0_2 ) )
            {
            // InternalKlangParser.g:1232:1: ( ( rule__Entity__NameAssignment_0_2 ) )
            // InternalKlangParser.g:1233:2: ( rule__Entity__NameAssignment_0_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_0_2()); 
            // InternalKlangParser.g:1234:2: ( rule__Entity__NameAssignment_0_2 )
            // InternalKlangParser.g:1234:3: rule__Entity__NameAssignment_0_2
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
    // InternalKlangParser.g:1243:1: rule__Entity__Group_1__0 : rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1 ;
    public final void rule__Entity__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1247:1: ( rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1 )
            // InternalKlangParser.g:1248:2: rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1
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
    // InternalKlangParser.g:1255:1: rule__Entity__Group_1__0__Impl : ( Scene ) ;
    public final void rule__Entity__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1259:1: ( ( Scene ) )
            // InternalKlangParser.g:1260:1: ( Scene )
            {
            // InternalKlangParser.g:1260:1: ( Scene )
            // InternalKlangParser.g:1261:2: Scene
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
    // InternalKlangParser.g:1270:1: rule__Entity__Group_1__1 : rule__Entity__Group_1__1__Impl ;
    public final void rule__Entity__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1274:1: ( rule__Entity__Group_1__1__Impl )
            // InternalKlangParser.g:1275:2: rule__Entity__Group_1__1__Impl
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
    // InternalKlangParser.g:1281:1: rule__Entity__Group_1__1__Impl : ( () ) ;
    public final void rule__Entity__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1285:1: ( ( () ) )
            // InternalKlangParser.g:1286:1: ( () )
            {
            // InternalKlangParser.g:1286:1: ( () )
            // InternalKlangParser.g:1287:2: ()
            {
             before(grammarAccess.getEntityAccess().getSceneEntityAction_1_1()); 
            // InternalKlangParser.g:1288:2: ()
            // InternalKlangParser.g:1288:3: 
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
    // InternalKlangParser.g:1297:1: rule__GameStart__Group__0 : rule__GameStart__Group__0__Impl rule__GameStart__Group__1 ;
    public final void rule__GameStart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1301:1: ( rule__GameStart__Group__0__Impl rule__GameStart__Group__1 )
            // InternalKlangParser.g:1302:2: rule__GameStart__Group__0__Impl rule__GameStart__Group__1
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
    // InternalKlangParser.g:1309:1: rule__GameStart__Group__0__Impl : ( () ) ;
    public final void rule__GameStart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1313:1: ( ( () ) )
            // InternalKlangParser.g:1314:1: ( () )
            {
            // InternalKlangParser.g:1314:1: ( () )
            // InternalKlangParser.g:1315:2: ()
            {
             before(grammarAccess.getGameStartAccess().getGameStartAction_0()); 
            // InternalKlangParser.g:1316:2: ()
            // InternalKlangParser.g:1316:3: 
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
    // InternalKlangParser.g:1324:1: rule__GameStart__Group__1 : rule__GameStart__Group__1__Impl rule__GameStart__Group__2 ;
    public final void rule__GameStart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1328:1: ( rule__GameStart__Group__1__Impl rule__GameStart__Group__2 )
            // InternalKlangParser.g:1329:2: rule__GameStart__Group__1__Impl rule__GameStart__Group__2
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
    // InternalKlangParser.g:1336:1: rule__GameStart__Group__1__Impl : ( When ) ;
    public final void rule__GameStart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1340:1: ( ( When ) )
            // InternalKlangParser.g:1341:1: ( When )
            {
            // InternalKlangParser.g:1341:1: ( When )
            // InternalKlangParser.g:1342:2: When
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
    // InternalKlangParser.g:1351:1: rule__GameStart__Group__2 : rule__GameStart__Group__2__Impl rule__GameStart__Group__3 ;
    public final void rule__GameStart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1355:1: ( rule__GameStart__Group__2__Impl rule__GameStart__Group__3 )
            // InternalKlangParser.g:1356:2: rule__GameStart__Group__2__Impl rule__GameStart__Group__3
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
    // InternalKlangParser.g:1363:1: rule__GameStart__Group__2__Impl : ( Game ) ;
    public final void rule__GameStart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1367:1: ( ( Game ) )
            // InternalKlangParser.g:1368:1: ( Game )
            {
            // InternalKlangParser.g:1368:1: ( Game )
            // InternalKlangParser.g:1369:2: Game
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
    // InternalKlangParser.g:1378:1: rule__GameStart__Group__3 : rule__GameStart__Group__3__Impl rule__GameStart__Group__4 ;
    public final void rule__GameStart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1382:1: ( rule__GameStart__Group__3__Impl rule__GameStart__Group__4 )
            // InternalKlangParser.g:1383:2: rule__GameStart__Group__3__Impl rule__GameStart__Group__4
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
    // InternalKlangParser.g:1390:1: rule__GameStart__Group__3__Impl : ( Starts ) ;
    public final void rule__GameStart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1394:1: ( ( Starts ) )
            // InternalKlangParser.g:1395:1: ( Starts )
            {
            // InternalKlangParser.g:1395:1: ( Starts )
            // InternalKlangParser.g:1396:2: Starts
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
    // InternalKlangParser.g:1405:1: rule__GameStart__Group__4 : rule__GameStart__Group__4__Impl rule__GameStart__Group__5 ;
    public final void rule__GameStart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1409:1: ( rule__GameStart__Group__4__Impl rule__GameStart__Group__5 )
            // InternalKlangParser.g:1410:2: rule__GameStart__Group__4__Impl rule__GameStart__Group__5
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
    // InternalKlangParser.g:1417:1: rule__GameStart__Group__4__Impl : ( RULE_BEGIN ) ;
    public final void rule__GameStart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1421:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:1422:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:1422:1: ( RULE_BEGIN )
            // InternalKlangParser.g:1423:2: RULE_BEGIN
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
    // InternalKlangParser.g:1432:1: rule__GameStart__Group__5 : rule__GameStart__Group__5__Impl rule__GameStart__Group__6 ;
    public final void rule__GameStart__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1436:1: ( rule__GameStart__Group__5__Impl rule__GameStart__Group__6 )
            // InternalKlangParser.g:1437:2: rule__GameStart__Group__5__Impl rule__GameStart__Group__6
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
    // InternalKlangParser.g:1444:1: rule__GameStart__Group__5__Impl : ( ( rule__GameStart__StatementsAssignment_5 )* ) ;
    public final void rule__GameStart__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1448:1: ( ( ( rule__GameStart__StatementsAssignment_5 )* ) )
            // InternalKlangParser.g:1449:1: ( ( rule__GameStart__StatementsAssignment_5 )* )
            {
            // InternalKlangParser.g:1449:1: ( ( rule__GameStart__StatementsAssignment_5 )* )
            // InternalKlangParser.g:1450:2: ( rule__GameStart__StatementsAssignment_5 )*
            {
             before(grammarAccess.getGameStartAccess().getStatementsAssignment_5()); 
            // InternalKlangParser.g:1451:2: ( rule__GameStart__StatementsAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Forever||LA12_0==While||LA12_0==If||LA12_0==FullStop||LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalKlangParser.g:1451:3: rule__GameStart__StatementsAssignment_5
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
    // InternalKlangParser.g:1459:1: rule__GameStart__Group__6 : rule__GameStart__Group__6__Impl ;
    public final void rule__GameStart__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1463:1: ( rule__GameStart__Group__6__Impl )
            // InternalKlangParser.g:1464:2: rule__GameStart__Group__6__Impl
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
    // InternalKlangParser.g:1470:1: rule__GameStart__Group__6__Impl : ( RULE_END ) ;
    public final void rule__GameStart__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1474:1: ( ( RULE_END ) )
            // InternalKlangParser.g:1475:1: ( RULE_END )
            {
            // InternalKlangParser.g:1475:1: ( RULE_END )
            // InternalKlangParser.g:1476:2: RULE_END
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
    // InternalKlangParser.g:1486:1: rule__SpriteClicked__Group__0 : rule__SpriteClicked__Group__0__Impl rule__SpriteClicked__Group__1 ;
    public final void rule__SpriteClicked__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1490:1: ( rule__SpriteClicked__Group__0__Impl rule__SpriteClicked__Group__1 )
            // InternalKlangParser.g:1491:2: rule__SpriteClicked__Group__0__Impl rule__SpriteClicked__Group__1
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
    // InternalKlangParser.g:1498:1: rule__SpriteClicked__Group__0__Impl : ( () ) ;
    public final void rule__SpriteClicked__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1502:1: ( ( () ) )
            // InternalKlangParser.g:1503:1: ( () )
            {
            // InternalKlangParser.g:1503:1: ( () )
            // InternalKlangParser.g:1504:2: ()
            {
             before(grammarAccess.getSpriteClickedAccess().getSpriteClickedAction_0()); 
            // InternalKlangParser.g:1505:2: ()
            // InternalKlangParser.g:1505:3: 
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
    // InternalKlangParser.g:1513:1: rule__SpriteClicked__Group__1 : rule__SpriteClicked__Group__1__Impl rule__SpriteClicked__Group__2 ;
    public final void rule__SpriteClicked__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1517:1: ( rule__SpriteClicked__Group__1__Impl rule__SpriteClicked__Group__2 )
            // InternalKlangParser.g:1518:2: rule__SpriteClicked__Group__1__Impl rule__SpriteClicked__Group__2
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
    // InternalKlangParser.g:1525:1: rule__SpriteClicked__Group__1__Impl : ( When ) ;
    public final void rule__SpriteClicked__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1529:1: ( ( When ) )
            // InternalKlangParser.g:1530:1: ( When )
            {
            // InternalKlangParser.g:1530:1: ( When )
            // InternalKlangParser.g:1531:2: When
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
    // InternalKlangParser.g:1540:1: rule__SpriteClicked__Group__2 : rule__SpriteClicked__Group__2__Impl rule__SpriteClicked__Group__3 ;
    public final void rule__SpriteClicked__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1544:1: ( rule__SpriteClicked__Group__2__Impl rule__SpriteClicked__Group__3 )
            // InternalKlangParser.g:1545:2: rule__SpriteClicked__Group__2__Impl rule__SpriteClicked__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalKlangParser.g:1552:1: rule__SpriteClicked__Group__2__Impl : ( This ) ;
    public final void rule__SpriteClicked__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1556:1: ( ( This ) )
            // InternalKlangParser.g:1557:1: ( This )
            {
            // InternalKlangParser.g:1557:1: ( This )
            // InternalKlangParser.g:1558:2: This
            {
             before(grammarAccess.getSpriteClickedAccess().getThisKeyword_2()); 
            match(input,This,FOLLOW_2); 
             after(grammarAccess.getSpriteClickedAccess().getThisKeyword_2()); 

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
    // InternalKlangParser.g:1567:1: rule__SpriteClicked__Group__3 : rule__SpriteClicked__Group__3__Impl rule__SpriteClicked__Group__4 ;
    public final void rule__SpriteClicked__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1571:1: ( rule__SpriteClicked__Group__3__Impl rule__SpriteClicked__Group__4 )
            // InternalKlangParser.g:1572:2: rule__SpriteClicked__Group__3__Impl rule__SpriteClicked__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalKlangParser.g:1579:1: rule__SpriteClicked__Group__3__Impl : ( Sprite ) ;
    public final void rule__SpriteClicked__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1583:1: ( ( Sprite ) )
            // InternalKlangParser.g:1584:1: ( Sprite )
            {
            // InternalKlangParser.g:1584:1: ( Sprite )
            // InternalKlangParser.g:1585:2: Sprite
            {
             before(grammarAccess.getSpriteClickedAccess().getSpriteKeyword_3()); 
            match(input,Sprite,FOLLOW_2); 
             after(grammarAccess.getSpriteClickedAccess().getSpriteKeyword_3()); 

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
    // InternalKlangParser.g:1594:1: rule__SpriteClicked__Group__4 : rule__SpriteClicked__Group__4__Impl rule__SpriteClicked__Group__5 ;
    public final void rule__SpriteClicked__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1598:1: ( rule__SpriteClicked__Group__4__Impl rule__SpriteClicked__Group__5 )
            // InternalKlangParser.g:1599:2: rule__SpriteClicked__Group__4__Impl rule__SpriteClicked__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalKlangParser.g:1606:1: rule__SpriteClicked__Group__4__Impl : ( Clicked ) ;
    public final void rule__SpriteClicked__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1610:1: ( ( Clicked ) )
            // InternalKlangParser.g:1611:1: ( Clicked )
            {
            // InternalKlangParser.g:1611:1: ( Clicked )
            // InternalKlangParser.g:1612:2: Clicked
            {
             before(grammarAccess.getSpriteClickedAccess().getClickedKeyword_4()); 
            match(input,Clicked,FOLLOW_2); 
             after(grammarAccess.getSpriteClickedAccess().getClickedKeyword_4()); 

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
    // InternalKlangParser.g:1621:1: rule__SpriteClicked__Group__5 : rule__SpriteClicked__Group__5__Impl rule__SpriteClicked__Group__6 ;
    public final void rule__SpriteClicked__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1625:1: ( rule__SpriteClicked__Group__5__Impl rule__SpriteClicked__Group__6 )
            // InternalKlangParser.g:1626:2: rule__SpriteClicked__Group__5__Impl rule__SpriteClicked__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__SpriteClicked__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpriteClicked__Group__6();

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
    // InternalKlangParser.g:1633:1: rule__SpriteClicked__Group__5__Impl : ( RULE_BEGIN ) ;
    public final void rule__SpriteClicked__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1637:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:1638:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:1638:1: ( RULE_BEGIN )
            // InternalKlangParser.g:1639:2: RULE_BEGIN
            {
             before(grammarAccess.getSpriteClickedAccess().getBEGINTerminalRuleCall_5()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getSpriteClickedAccess().getBEGINTerminalRuleCall_5()); 

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


    // $ANTLR start "rule__SpriteClicked__Group__6"
    // InternalKlangParser.g:1648:1: rule__SpriteClicked__Group__6 : rule__SpriteClicked__Group__6__Impl rule__SpriteClicked__Group__7 ;
    public final void rule__SpriteClicked__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1652:1: ( rule__SpriteClicked__Group__6__Impl rule__SpriteClicked__Group__7 )
            // InternalKlangParser.g:1653:2: rule__SpriteClicked__Group__6__Impl rule__SpriteClicked__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__SpriteClicked__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpriteClicked__Group__7();

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
    // $ANTLR end "rule__SpriteClicked__Group__6"


    // $ANTLR start "rule__SpriteClicked__Group__6__Impl"
    // InternalKlangParser.g:1660:1: rule__SpriteClicked__Group__6__Impl : ( ( rule__SpriteClicked__StatementsAssignment_6 )* ) ;
    public final void rule__SpriteClicked__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1664:1: ( ( ( rule__SpriteClicked__StatementsAssignment_6 )* ) )
            // InternalKlangParser.g:1665:1: ( ( rule__SpriteClicked__StatementsAssignment_6 )* )
            {
            // InternalKlangParser.g:1665:1: ( ( rule__SpriteClicked__StatementsAssignment_6 )* )
            // InternalKlangParser.g:1666:2: ( rule__SpriteClicked__StatementsAssignment_6 )*
            {
             before(grammarAccess.getSpriteClickedAccess().getStatementsAssignment_6()); 
            // InternalKlangParser.g:1667:2: ( rule__SpriteClicked__StatementsAssignment_6 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Forever||LA13_0==While||LA13_0==If||LA13_0==FullStop||LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalKlangParser.g:1667:3: rule__SpriteClicked__StatementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__SpriteClicked__StatementsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getSpriteClickedAccess().getStatementsAssignment_6()); 

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
    // $ANTLR end "rule__SpriteClicked__Group__6__Impl"


    // $ANTLR start "rule__SpriteClicked__Group__7"
    // InternalKlangParser.g:1675:1: rule__SpriteClicked__Group__7 : rule__SpriteClicked__Group__7__Impl ;
    public final void rule__SpriteClicked__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1679:1: ( rule__SpriteClicked__Group__7__Impl )
            // InternalKlangParser.g:1680:2: rule__SpriteClicked__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpriteClicked__Group__7__Impl();

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
    // $ANTLR end "rule__SpriteClicked__Group__7"


    // $ANTLR start "rule__SpriteClicked__Group__7__Impl"
    // InternalKlangParser.g:1686:1: rule__SpriteClicked__Group__7__Impl : ( RULE_END ) ;
    public final void rule__SpriteClicked__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1690:1: ( ( RULE_END ) )
            // InternalKlangParser.g:1691:1: ( RULE_END )
            {
            // InternalKlangParser.g:1691:1: ( RULE_END )
            // InternalKlangParser.g:1692:2: RULE_END
            {
             before(grammarAccess.getSpriteClickedAccess().getENDTerminalRuleCall_7()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getSpriteClickedAccess().getENDTerminalRuleCall_7()); 

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
    // $ANTLR end "rule__SpriteClicked__Group__7__Impl"


    // $ANTLR start "rule__KeyPressed__Group__0"
    // InternalKlangParser.g:1702:1: rule__KeyPressed__Group__0 : rule__KeyPressed__Group__0__Impl rule__KeyPressed__Group__1 ;
    public final void rule__KeyPressed__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1706:1: ( rule__KeyPressed__Group__0__Impl rule__KeyPressed__Group__1 )
            // InternalKlangParser.g:1707:2: rule__KeyPressed__Group__0__Impl rule__KeyPressed__Group__1
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
    // InternalKlangParser.g:1714:1: rule__KeyPressed__Group__0__Impl : ( () ) ;
    public final void rule__KeyPressed__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1718:1: ( ( () ) )
            // InternalKlangParser.g:1719:1: ( () )
            {
            // InternalKlangParser.g:1719:1: ( () )
            // InternalKlangParser.g:1720:2: ()
            {
             before(grammarAccess.getKeyPressedAccess().getKeyPressedAction_0()); 
            // InternalKlangParser.g:1721:2: ()
            // InternalKlangParser.g:1721:3: 
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
    // InternalKlangParser.g:1729:1: rule__KeyPressed__Group__1 : rule__KeyPressed__Group__1__Impl rule__KeyPressed__Group__2 ;
    public final void rule__KeyPressed__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1733:1: ( rule__KeyPressed__Group__1__Impl rule__KeyPressed__Group__2 )
            // InternalKlangParser.g:1734:2: rule__KeyPressed__Group__1__Impl rule__KeyPressed__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalKlangParser.g:1741:1: rule__KeyPressed__Group__1__Impl : ( When ) ;
    public final void rule__KeyPressed__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1745:1: ( ( When ) )
            // InternalKlangParser.g:1746:1: ( When )
            {
            // InternalKlangParser.g:1746:1: ( When )
            // InternalKlangParser.g:1747:2: When
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
    // InternalKlangParser.g:1756:1: rule__KeyPressed__Group__2 : rule__KeyPressed__Group__2__Impl rule__KeyPressed__Group__3 ;
    public final void rule__KeyPressed__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1760:1: ( rule__KeyPressed__Group__2__Impl rule__KeyPressed__Group__3 )
            // InternalKlangParser.g:1761:2: rule__KeyPressed__Group__2__Impl rule__KeyPressed__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalKlangParser.g:1768:1: rule__KeyPressed__Group__2__Impl : ( ( rule__KeyPressed__KeyAssignment_2 ) ) ;
    public final void rule__KeyPressed__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1772:1: ( ( ( rule__KeyPressed__KeyAssignment_2 ) ) )
            // InternalKlangParser.g:1773:1: ( ( rule__KeyPressed__KeyAssignment_2 ) )
            {
            // InternalKlangParser.g:1773:1: ( ( rule__KeyPressed__KeyAssignment_2 ) )
            // InternalKlangParser.g:1774:2: ( rule__KeyPressed__KeyAssignment_2 )
            {
             before(grammarAccess.getKeyPressedAccess().getKeyAssignment_2()); 
            // InternalKlangParser.g:1775:2: ( rule__KeyPressed__KeyAssignment_2 )
            // InternalKlangParser.g:1775:3: rule__KeyPressed__KeyAssignment_2
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
    // InternalKlangParser.g:1783:1: rule__KeyPressed__Group__3 : rule__KeyPressed__Group__3__Impl rule__KeyPressed__Group__4 ;
    public final void rule__KeyPressed__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1787:1: ( rule__KeyPressed__Group__3__Impl rule__KeyPressed__Group__4 )
            // InternalKlangParser.g:1788:2: rule__KeyPressed__Group__3__Impl rule__KeyPressed__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalKlangParser.g:1795:1: rule__KeyPressed__Group__3__Impl : ( Key ) ;
    public final void rule__KeyPressed__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1799:1: ( ( Key ) )
            // InternalKlangParser.g:1800:1: ( Key )
            {
            // InternalKlangParser.g:1800:1: ( Key )
            // InternalKlangParser.g:1801:2: Key
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
    // InternalKlangParser.g:1810:1: rule__KeyPressed__Group__4 : rule__KeyPressed__Group__4__Impl rule__KeyPressed__Group__5 ;
    public final void rule__KeyPressed__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1814:1: ( rule__KeyPressed__Group__4__Impl rule__KeyPressed__Group__5 )
            // InternalKlangParser.g:1815:2: rule__KeyPressed__Group__4__Impl rule__KeyPressed__Group__5
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
    // InternalKlangParser.g:1822:1: rule__KeyPressed__Group__4__Impl : ( Pressed ) ;
    public final void rule__KeyPressed__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1826:1: ( ( Pressed ) )
            // InternalKlangParser.g:1827:1: ( Pressed )
            {
            // InternalKlangParser.g:1827:1: ( Pressed )
            // InternalKlangParser.g:1828:2: Pressed
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
    // InternalKlangParser.g:1837:1: rule__KeyPressed__Group__5 : rule__KeyPressed__Group__5__Impl rule__KeyPressed__Group__6 ;
    public final void rule__KeyPressed__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1841:1: ( rule__KeyPressed__Group__5__Impl rule__KeyPressed__Group__6 )
            // InternalKlangParser.g:1842:2: rule__KeyPressed__Group__5__Impl rule__KeyPressed__Group__6
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
    // InternalKlangParser.g:1849:1: rule__KeyPressed__Group__5__Impl : ( RULE_BEGIN ) ;
    public final void rule__KeyPressed__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1853:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:1854:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:1854:1: ( RULE_BEGIN )
            // InternalKlangParser.g:1855:2: RULE_BEGIN
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
    // InternalKlangParser.g:1864:1: rule__KeyPressed__Group__6 : rule__KeyPressed__Group__6__Impl rule__KeyPressed__Group__7 ;
    public final void rule__KeyPressed__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1868:1: ( rule__KeyPressed__Group__6__Impl rule__KeyPressed__Group__7 )
            // InternalKlangParser.g:1869:2: rule__KeyPressed__Group__6__Impl rule__KeyPressed__Group__7
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
    // InternalKlangParser.g:1876:1: rule__KeyPressed__Group__6__Impl : ( ( rule__KeyPressed__StatementsAssignment_6 )* ) ;
    public final void rule__KeyPressed__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1880:1: ( ( ( rule__KeyPressed__StatementsAssignment_6 )* ) )
            // InternalKlangParser.g:1881:1: ( ( rule__KeyPressed__StatementsAssignment_6 )* )
            {
            // InternalKlangParser.g:1881:1: ( ( rule__KeyPressed__StatementsAssignment_6 )* )
            // InternalKlangParser.g:1882:2: ( rule__KeyPressed__StatementsAssignment_6 )*
            {
             before(grammarAccess.getKeyPressedAccess().getStatementsAssignment_6()); 
            // InternalKlangParser.g:1883:2: ( rule__KeyPressed__StatementsAssignment_6 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Forever||LA14_0==While||LA14_0==If||LA14_0==FullStop||LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalKlangParser.g:1883:3: rule__KeyPressed__StatementsAssignment_6
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
    // InternalKlangParser.g:1891:1: rule__KeyPressed__Group__7 : rule__KeyPressed__Group__7__Impl ;
    public final void rule__KeyPressed__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1895:1: ( rule__KeyPressed__Group__7__Impl )
            // InternalKlangParser.g:1896:2: rule__KeyPressed__Group__7__Impl
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
    // InternalKlangParser.g:1902:1: rule__KeyPressed__Group__7__Impl : ( RULE_END ) ;
    public final void rule__KeyPressed__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1906:1: ( ( RULE_END ) )
            // InternalKlangParser.g:1907:1: ( RULE_END )
            {
            // InternalKlangParser.g:1907:1: ( RULE_END )
            // InternalKlangParser.g:1908:2: RULE_END
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
    // InternalKlangParser.g:1918:1: rule__CollidesWith__Group__0 : rule__CollidesWith__Group__0__Impl rule__CollidesWith__Group__1 ;
    public final void rule__CollidesWith__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1922:1: ( rule__CollidesWith__Group__0__Impl rule__CollidesWith__Group__1 )
            // InternalKlangParser.g:1923:2: rule__CollidesWith__Group__0__Impl rule__CollidesWith__Group__1
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
    // InternalKlangParser.g:1930:1: rule__CollidesWith__Group__0__Impl : ( () ) ;
    public final void rule__CollidesWith__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1934:1: ( ( () ) )
            // InternalKlangParser.g:1935:1: ( () )
            {
            // InternalKlangParser.g:1935:1: ( () )
            // InternalKlangParser.g:1936:2: ()
            {
             before(grammarAccess.getCollidesWithAccess().getCollidesWithAction_0()); 
            // InternalKlangParser.g:1937:2: ()
            // InternalKlangParser.g:1937:3: 
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
    // InternalKlangParser.g:1945:1: rule__CollidesWith__Group__1 : rule__CollidesWith__Group__1__Impl rule__CollidesWith__Group__2 ;
    public final void rule__CollidesWith__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1949:1: ( rule__CollidesWith__Group__1__Impl rule__CollidesWith__Group__2 )
            // InternalKlangParser.g:1950:2: rule__CollidesWith__Group__1__Impl rule__CollidesWith__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalKlangParser.g:1957:1: rule__CollidesWith__Group__1__Impl : ( When ) ;
    public final void rule__CollidesWith__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1961:1: ( ( When ) )
            // InternalKlangParser.g:1962:1: ( When )
            {
            // InternalKlangParser.g:1962:1: ( When )
            // InternalKlangParser.g:1963:2: When
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
    // InternalKlangParser.g:1972:1: rule__CollidesWith__Group__2 : rule__CollidesWith__Group__2__Impl rule__CollidesWith__Group__3 ;
    public final void rule__CollidesWith__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1976:1: ( rule__CollidesWith__Group__2__Impl rule__CollidesWith__Group__3 )
            // InternalKlangParser.g:1977:2: rule__CollidesWith__Group__2__Impl rule__CollidesWith__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalKlangParser.g:1984:1: rule__CollidesWith__Group__2__Impl : ( Collides ) ;
    public final void rule__CollidesWith__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1988:1: ( ( Collides ) )
            // InternalKlangParser.g:1989:1: ( Collides )
            {
            // InternalKlangParser.g:1989:1: ( Collides )
            // InternalKlangParser.g:1990:2: Collides
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
    // InternalKlangParser.g:1999:1: rule__CollidesWith__Group__3 : rule__CollidesWith__Group__3__Impl rule__CollidesWith__Group__4 ;
    public final void rule__CollidesWith__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2003:1: ( rule__CollidesWith__Group__3__Impl rule__CollidesWith__Group__4 )
            // InternalKlangParser.g:2004:2: rule__CollidesWith__Group__3__Impl rule__CollidesWith__Group__4
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
    // InternalKlangParser.g:2011:1: rule__CollidesWith__Group__3__Impl : ( With ) ;
    public final void rule__CollidesWith__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2015:1: ( ( With ) )
            // InternalKlangParser.g:2016:1: ( With )
            {
            // InternalKlangParser.g:2016:1: ( With )
            // InternalKlangParser.g:2017:2: With
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
    // InternalKlangParser.g:2026:1: rule__CollidesWith__Group__4 : rule__CollidesWith__Group__4__Impl rule__CollidesWith__Group__5 ;
    public final void rule__CollidesWith__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2030:1: ( rule__CollidesWith__Group__4__Impl rule__CollidesWith__Group__5 )
            // InternalKlangParser.g:2031:2: rule__CollidesWith__Group__4__Impl rule__CollidesWith__Group__5
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
    // InternalKlangParser.g:2038:1: rule__CollidesWith__Group__4__Impl : ( ( rule__CollidesWith__TargetAssignment_4 ) ) ;
    public final void rule__CollidesWith__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2042:1: ( ( ( rule__CollidesWith__TargetAssignment_4 ) ) )
            // InternalKlangParser.g:2043:1: ( ( rule__CollidesWith__TargetAssignment_4 ) )
            {
            // InternalKlangParser.g:2043:1: ( ( rule__CollidesWith__TargetAssignment_4 ) )
            // InternalKlangParser.g:2044:2: ( rule__CollidesWith__TargetAssignment_4 )
            {
             before(grammarAccess.getCollidesWithAccess().getTargetAssignment_4()); 
            // InternalKlangParser.g:2045:2: ( rule__CollidesWith__TargetAssignment_4 )
            // InternalKlangParser.g:2045:3: rule__CollidesWith__TargetAssignment_4
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
    // InternalKlangParser.g:2053:1: rule__CollidesWith__Group__5 : rule__CollidesWith__Group__5__Impl rule__CollidesWith__Group__6 ;
    public final void rule__CollidesWith__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2057:1: ( rule__CollidesWith__Group__5__Impl rule__CollidesWith__Group__6 )
            // InternalKlangParser.g:2058:2: rule__CollidesWith__Group__5__Impl rule__CollidesWith__Group__6
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
    // InternalKlangParser.g:2065:1: rule__CollidesWith__Group__5__Impl : ( RULE_BEGIN ) ;
    public final void rule__CollidesWith__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2069:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:2070:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:2070:1: ( RULE_BEGIN )
            // InternalKlangParser.g:2071:2: RULE_BEGIN
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
    // InternalKlangParser.g:2080:1: rule__CollidesWith__Group__6 : rule__CollidesWith__Group__6__Impl rule__CollidesWith__Group__7 ;
    public final void rule__CollidesWith__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2084:1: ( rule__CollidesWith__Group__6__Impl rule__CollidesWith__Group__7 )
            // InternalKlangParser.g:2085:2: rule__CollidesWith__Group__6__Impl rule__CollidesWith__Group__7
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
    // InternalKlangParser.g:2092:1: rule__CollidesWith__Group__6__Impl : ( ( rule__CollidesWith__StatementsAssignment_6 )* ) ;
    public final void rule__CollidesWith__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2096:1: ( ( ( rule__CollidesWith__StatementsAssignment_6 )* ) )
            // InternalKlangParser.g:2097:1: ( ( rule__CollidesWith__StatementsAssignment_6 )* )
            {
            // InternalKlangParser.g:2097:1: ( ( rule__CollidesWith__StatementsAssignment_6 )* )
            // InternalKlangParser.g:2098:2: ( rule__CollidesWith__StatementsAssignment_6 )*
            {
             before(grammarAccess.getCollidesWithAccess().getStatementsAssignment_6()); 
            // InternalKlangParser.g:2099:2: ( rule__CollidesWith__StatementsAssignment_6 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Forever||LA15_0==While||LA15_0==If||LA15_0==FullStop||LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalKlangParser.g:2099:3: rule__CollidesWith__StatementsAssignment_6
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
    // InternalKlangParser.g:2107:1: rule__CollidesWith__Group__7 : rule__CollidesWith__Group__7__Impl ;
    public final void rule__CollidesWith__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2111:1: ( rule__CollidesWith__Group__7__Impl )
            // InternalKlangParser.g:2112:2: rule__CollidesWith__Group__7__Impl
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
    // InternalKlangParser.g:2118:1: rule__CollidesWith__Group__7__Impl : ( RULE_END ) ;
    public final void rule__CollidesWith__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2122:1: ( ( RULE_END ) )
            // InternalKlangParser.g:2123:1: ( RULE_END )
            {
            // InternalKlangParser.g:2123:1: ( RULE_END )
            // InternalKlangParser.g:2124:2: RULE_END
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
    // InternalKlangParser.g:2134:1: rule__WhileLoop__Group__0 : rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 ;
    public final void rule__WhileLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2138:1: ( rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 )
            // InternalKlangParser.g:2139:2: rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalKlangParser.g:2146:1: rule__WhileLoop__Group__0__Impl : ( () ) ;
    public final void rule__WhileLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2150:1: ( ( () ) )
            // InternalKlangParser.g:2151:1: ( () )
            {
            // InternalKlangParser.g:2151:1: ( () )
            // InternalKlangParser.g:2152:2: ()
            {
             before(grammarAccess.getWhileLoopAccess().getWhileLoopAction_0()); 
            // InternalKlangParser.g:2153:2: ()
            // InternalKlangParser.g:2153:3: 
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
    // InternalKlangParser.g:2161:1: rule__WhileLoop__Group__1 : rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 ;
    public final void rule__WhileLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2165:1: ( rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 )
            // InternalKlangParser.g:2166:2: rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalKlangParser.g:2173:1: rule__WhileLoop__Group__1__Impl : ( While ) ;
    public final void rule__WhileLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2177:1: ( ( While ) )
            // InternalKlangParser.g:2178:1: ( While )
            {
            // InternalKlangParser.g:2178:1: ( While )
            // InternalKlangParser.g:2179:2: While
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
    // InternalKlangParser.g:2188:1: rule__WhileLoop__Group__2 : rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 ;
    public final void rule__WhileLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2192:1: ( rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 )
            // InternalKlangParser.g:2193:2: rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3
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
    // InternalKlangParser.g:2200:1: rule__WhileLoop__Group__2__Impl : ( ( rule__WhileLoop__PredicateAssignment_2 ) ) ;
    public final void rule__WhileLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2204:1: ( ( ( rule__WhileLoop__PredicateAssignment_2 ) ) )
            // InternalKlangParser.g:2205:1: ( ( rule__WhileLoop__PredicateAssignment_2 ) )
            {
            // InternalKlangParser.g:2205:1: ( ( rule__WhileLoop__PredicateAssignment_2 ) )
            // InternalKlangParser.g:2206:2: ( rule__WhileLoop__PredicateAssignment_2 )
            {
             before(grammarAccess.getWhileLoopAccess().getPredicateAssignment_2()); 
            // InternalKlangParser.g:2207:2: ( rule__WhileLoop__PredicateAssignment_2 )
            // InternalKlangParser.g:2207:3: rule__WhileLoop__PredicateAssignment_2
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
    // InternalKlangParser.g:2215:1: rule__WhileLoop__Group__3 : rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 ;
    public final void rule__WhileLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2219:1: ( rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 )
            // InternalKlangParser.g:2220:2: rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4
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
    // InternalKlangParser.g:2227:1: rule__WhileLoop__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__WhileLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2231:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:2232:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:2232:1: ( RULE_BEGIN )
            // InternalKlangParser.g:2233:2: RULE_BEGIN
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
    // InternalKlangParser.g:2242:1: rule__WhileLoop__Group__4 : rule__WhileLoop__Group__4__Impl rule__WhileLoop__Group__5 ;
    public final void rule__WhileLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2246:1: ( rule__WhileLoop__Group__4__Impl rule__WhileLoop__Group__5 )
            // InternalKlangParser.g:2247:2: rule__WhileLoop__Group__4__Impl rule__WhileLoop__Group__5
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
    // InternalKlangParser.g:2254:1: rule__WhileLoop__Group__4__Impl : ( ( rule__WhileLoop__LoopBlockAssignment_4 )* ) ;
    public final void rule__WhileLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2258:1: ( ( ( rule__WhileLoop__LoopBlockAssignment_4 )* ) )
            // InternalKlangParser.g:2259:1: ( ( rule__WhileLoop__LoopBlockAssignment_4 )* )
            {
            // InternalKlangParser.g:2259:1: ( ( rule__WhileLoop__LoopBlockAssignment_4 )* )
            // InternalKlangParser.g:2260:2: ( rule__WhileLoop__LoopBlockAssignment_4 )*
            {
             before(grammarAccess.getWhileLoopAccess().getLoopBlockAssignment_4()); 
            // InternalKlangParser.g:2261:2: ( rule__WhileLoop__LoopBlockAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==Forever||LA16_0==While||LA16_0==If||LA16_0==FullStop||LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalKlangParser.g:2261:3: rule__WhileLoop__LoopBlockAssignment_4
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
    // InternalKlangParser.g:2269:1: rule__WhileLoop__Group__5 : rule__WhileLoop__Group__5__Impl ;
    public final void rule__WhileLoop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2273:1: ( rule__WhileLoop__Group__5__Impl )
            // InternalKlangParser.g:2274:2: rule__WhileLoop__Group__5__Impl
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
    // InternalKlangParser.g:2280:1: rule__WhileLoop__Group__5__Impl : ( RULE_END ) ;
    public final void rule__WhileLoop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2284:1: ( ( RULE_END ) )
            // InternalKlangParser.g:2285:1: ( RULE_END )
            {
            // InternalKlangParser.g:2285:1: ( RULE_END )
            // InternalKlangParser.g:2286:2: RULE_END
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
    // InternalKlangParser.g:2296:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2300:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalKlangParser.g:2301:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalKlangParser.g:2308:1: rule__If__Group__0__Impl : ( () ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2312:1: ( ( () ) )
            // InternalKlangParser.g:2313:1: ( () )
            {
            // InternalKlangParser.g:2313:1: ( () )
            // InternalKlangParser.g:2314:2: ()
            {
             before(grammarAccess.getIfAccess().getIfAction_0()); 
            // InternalKlangParser.g:2315:2: ()
            // InternalKlangParser.g:2315:3: 
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
    // InternalKlangParser.g:2323:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2327:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalKlangParser.g:2328:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalKlangParser.g:2335:1: rule__If__Group__1__Impl : ( If ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2339:1: ( ( If ) )
            // InternalKlangParser.g:2340:1: ( If )
            {
            // InternalKlangParser.g:2340:1: ( If )
            // InternalKlangParser.g:2341:2: If
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
    // InternalKlangParser.g:2350:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2354:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // InternalKlangParser.g:2355:2: rule__If__Group__2__Impl rule__If__Group__3
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
    // InternalKlangParser.g:2362:1: rule__If__Group__2__Impl : ( ( rule__If__PredicateAssignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2366:1: ( ( ( rule__If__PredicateAssignment_2 ) ) )
            // InternalKlangParser.g:2367:1: ( ( rule__If__PredicateAssignment_2 ) )
            {
            // InternalKlangParser.g:2367:1: ( ( rule__If__PredicateAssignment_2 ) )
            // InternalKlangParser.g:2368:2: ( rule__If__PredicateAssignment_2 )
            {
             before(grammarAccess.getIfAccess().getPredicateAssignment_2()); 
            // InternalKlangParser.g:2369:2: ( rule__If__PredicateAssignment_2 )
            // InternalKlangParser.g:2369:3: rule__If__PredicateAssignment_2
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
    // InternalKlangParser.g:2377:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2381:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // InternalKlangParser.g:2382:2: rule__If__Group__3__Impl rule__If__Group__4
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
    // InternalKlangParser.g:2389:1: rule__If__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2393:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:2394:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:2394:1: ( RULE_BEGIN )
            // InternalKlangParser.g:2395:2: RULE_BEGIN
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
    // InternalKlangParser.g:2404:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2408:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // InternalKlangParser.g:2409:2: rule__If__Group__4__Impl rule__If__Group__5
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
    // InternalKlangParser.g:2416:1: rule__If__Group__4__Impl : ( ( rule__If__IfBlockAssignment_4 )* ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2420:1: ( ( ( rule__If__IfBlockAssignment_4 )* ) )
            // InternalKlangParser.g:2421:1: ( ( rule__If__IfBlockAssignment_4 )* )
            {
            // InternalKlangParser.g:2421:1: ( ( rule__If__IfBlockAssignment_4 )* )
            // InternalKlangParser.g:2422:2: ( rule__If__IfBlockAssignment_4 )*
            {
             before(grammarAccess.getIfAccess().getIfBlockAssignment_4()); 
            // InternalKlangParser.g:2423:2: ( rule__If__IfBlockAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Forever||LA17_0==While||LA17_0==If||LA17_0==FullStop||LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalKlangParser.g:2423:3: rule__If__IfBlockAssignment_4
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
    // InternalKlangParser.g:2431:1: rule__If__Group__5 : rule__If__Group__5__Impl ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2435:1: ( rule__If__Group__5__Impl )
            // InternalKlangParser.g:2436:2: rule__If__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__5__Impl();

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
    // InternalKlangParser.g:2442:1: rule__If__Group__5__Impl : ( RULE_END ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2446:1: ( ( RULE_END ) )
            // InternalKlangParser.g:2447:1: ( RULE_END )
            {
            // InternalKlangParser.g:2447:1: ( RULE_END )
            // InternalKlangParser.g:2448:2: RULE_END
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


    // $ANTLR start "rule__ForeverLoop__Group__0"
    // InternalKlangParser.g:2458:1: rule__ForeverLoop__Group__0 : rule__ForeverLoop__Group__0__Impl rule__ForeverLoop__Group__1 ;
    public final void rule__ForeverLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2462:1: ( rule__ForeverLoop__Group__0__Impl rule__ForeverLoop__Group__1 )
            // InternalKlangParser.g:2463:2: rule__ForeverLoop__Group__0__Impl rule__ForeverLoop__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalKlangParser.g:2470:1: rule__ForeverLoop__Group__0__Impl : ( () ) ;
    public final void rule__ForeverLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2474:1: ( ( () ) )
            // InternalKlangParser.g:2475:1: ( () )
            {
            // InternalKlangParser.g:2475:1: ( () )
            // InternalKlangParser.g:2476:2: ()
            {
             before(grammarAccess.getForeverLoopAccess().getForeverLoopAction_0()); 
            // InternalKlangParser.g:2477:2: ()
            // InternalKlangParser.g:2477:3: 
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
    // InternalKlangParser.g:2485:1: rule__ForeverLoop__Group__1 : rule__ForeverLoop__Group__1__Impl rule__ForeverLoop__Group__2 ;
    public final void rule__ForeverLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2489:1: ( rule__ForeverLoop__Group__1__Impl rule__ForeverLoop__Group__2 )
            // InternalKlangParser.g:2490:2: rule__ForeverLoop__Group__1__Impl rule__ForeverLoop__Group__2
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
    // InternalKlangParser.g:2497:1: rule__ForeverLoop__Group__1__Impl : ( Forever ) ;
    public final void rule__ForeverLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2501:1: ( ( Forever ) )
            // InternalKlangParser.g:2502:1: ( Forever )
            {
            // InternalKlangParser.g:2502:1: ( Forever )
            // InternalKlangParser.g:2503:2: Forever
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
    // InternalKlangParser.g:2512:1: rule__ForeverLoop__Group__2 : rule__ForeverLoop__Group__2__Impl rule__ForeverLoop__Group__3 ;
    public final void rule__ForeverLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2516:1: ( rule__ForeverLoop__Group__2__Impl rule__ForeverLoop__Group__3 )
            // InternalKlangParser.g:2517:2: rule__ForeverLoop__Group__2__Impl rule__ForeverLoop__Group__3
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
    // InternalKlangParser.g:2524:1: rule__ForeverLoop__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__ForeverLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2528:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:2529:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:2529:1: ( RULE_BEGIN )
            // InternalKlangParser.g:2530:2: RULE_BEGIN
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
    // InternalKlangParser.g:2539:1: rule__ForeverLoop__Group__3 : rule__ForeverLoop__Group__3__Impl rule__ForeverLoop__Group__4 ;
    public final void rule__ForeverLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2543:1: ( rule__ForeverLoop__Group__3__Impl rule__ForeverLoop__Group__4 )
            // InternalKlangParser.g:2544:2: rule__ForeverLoop__Group__3__Impl rule__ForeverLoop__Group__4
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
    // InternalKlangParser.g:2551:1: rule__ForeverLoop__Group__3__Impl : ( ( rule__ForeverLoop__LoopStatementsAssignment_3 )* ) ;
    public final void rule__ForeverLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2555:1: ( ( ( rule__ForeverLoop__LoopStatementsAssignment_3 )* ) )
            // InternalKlangParser.g:2556:1: ( ( rule__ForeverLoop__LoopStatementsAssignment_3 )* )
            {
            // InternalKlangParser.g:2556:1: ( ( rule__ForeverLoop__LoopStatementsAssignment_3 )* )
            // InternalKlangParser.g:2557:2: ( rule__ForeverLoop__LoopStatementsAssignment_3 )*
            {
             before(grammarAccess.getForeverLoopAccess().getLoopStatementsAssignment_3()); 
            // InternalKlangParser.g:2558:2: ( rule__ForeverLoop__LoopStatementsAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==Forever||LA18_0==While||LA18_0==If||LA18_0==FullStop||LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalKlangParser.g:2558:3: rule__ForeverLoop__LoopStatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ForeverLoop__LoopStatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalKlangParser.g:2566:1: rule__ForeverLoop__Group__4 : rule__ForeverLoop__Group__4__Impl ;
    public final void rule__ForeverLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2570:1: ( rule__ForeverLoop__Group__4__Impl )
            // InternalKlangParser.g:2571:2: rule__ForeverLoop__Group__4__Impl
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
    // InternalKlangParser.g:2577:1: rule__ForeverLoop__Group__4__Impl : ( RULE_END ) ;
    public final void rule__ForeverLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2581:1: ( ( RULE_END ) )
            // InternalKlangParser.g:2582:1: ( RULE_END )
            {
            // InternalKlangParser.g:2582:1: ( RULE_END )
            // InternalKlangParser.g:2583:2: RULE_END
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
    // InternalKlangParser.g:2593:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2597:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalKlangParser.g:2598:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
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
    // InternalKlangParser.g:2605:1: rule__Variable__Group__0__Impl : ( Var ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2609:1: ( ( Var ) )
            // InternalKlangParser.g:2610:1: ( Var )
            {
            // InternalKlangParser.g:2610:1: ( Var )
            // InternalKlangParser.g:2611:2: Var
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
    // InternalKlangParser.g:2620:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2624:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalKlangParser.g:2625:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalKlangParser.g:2632:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2636:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalKlangParser.g:2637:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalKlangParser.g:2637:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalKlangParser.g:2638:2: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalKlangParser.g:2639:2: ( rule__Variable__NameAssignment_1 )
            // InternalKlangParser.g:2639:3: rule__Variable__NameAssignment_1
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
    // InternalKlangParser.g:2647:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2651:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // InternalKlangParser.g:2652:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalKlangParser.g:2659:1: rule__Variable__Group__2__Impl : ( EqualsSign ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2663:1: ( ( EqualsSign ) )
            // InternalKlangParser.g:2664:1: ( EqualsSign )
            {
            // InternalKlangParser.g:2664:1: ( EqualsSign )
            // InternalKlangParser.g:2665:2: EqualsSign
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
    // InternalKlangParser.g:2674:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2678:1: ( rule__Variable__Group__3__Impl )
            // InternalKlangParser.g:2679:2: rule__Variable__Group__3__Impl
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
    // InternalKlangParser.g:2685:1: rule__Variable__Group__3__Impl : ( ( rule__Variable__ExpressionAssignment_3 ) ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2689:1: ( ( ( rule__Variable__ExpressionAssignment_3 ) ) )
            // InternalKlangParser.g:2690:1: ( ( rule__Variable__ExpressionAssignment_3 ) )
            {
            // InternalKlangParser.g:2690:1: ( ( rule__Variable__ExpressionAssignment_3 ) )
            // InternalKlangParser.g:2691:2: ( rule__Variable__ExpressionAssignment_3 )
            {
             before(grammarAccess.getVariableAccess().getExpressionAssignment_3()); 
            // InternalKlangParser.g:2692:2: ( rule__Variable__ExpressionAssignment_3 )
            // InternalKlangParser.g:2692:3: rule__Variable__ExpressionAssignment_3
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
    // InternalKlangParser.g:2701:1: rule__VariableAssignment__Group__0 : rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1 ;
    public final void rule__VariableAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2705:1: ( rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1 )
            // InternalKlangParser.g:2706:2: rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalKlangParser.g:2713:1: rule__VariableAssignment__Group__0__Impl : ( ( rule__VariableAssignment__VariableNameAssignment_0 ) ) ;
    public final void rule__VariableAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2717:1: ( ( ( rule__VariableAssignment__VariableNameAssignment_0 ) ) )
            // InternalKlangParser.g:2718:1: ( ( rule__VariableAssignment__VariableNameAssignment_0 ) )
            {
            // InternalKlangParser.g:2718:1: ( ( rule__VariableAssignment__VariableNameAssignment_0 ) )
            // InternalKlangParser.g:2719:2: ( rule__VariableAssignment__VariableNameAssignment_0 )
            {
             before(grammarAccess.getVariableAssignmentAccess().getVariableNameAssignment_0()); 
            // InternalKlangParser.g:2720:2: ( rule__VariableAssignment__VariableNameAssignment_0 )
            // InternalKlangParser.g:2720:3: rule__VariableAssignment__VariableNameAssignment_0
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
    // InternalKlangParser.g:2728:1: rule__VariableAssignment__Group__1 : rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2 ;
    public final void rule__VariableAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2732:1: ( rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2 )
            // InternalKlangParser.g:2733:2: rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalKlangParser.g:2740:1: rule__VariableAssignment__Group__1__Impl : ( EqualsSign ) ;
    public final void rule__VariableAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2744:1: ( ( EqualsSign ) )
            // InternalKlangParser.g:2745:1: ( EqualsSign )
            {
            // InternalKlangParser.g:2745:1: ( EqualsSign )
            // InternalKlangParser.g:2746:2: EqualsSign
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
    // InternalKlangParser.g:2755:1: rule__VariableAssignment__Group__2 : rule__VariableAssignment__Group__2__Impl ;
    public final void rule__VariableAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2759:1: ( rule__VariableAssignment__Group__2__Impl )
            // InternalKlangParser.g:2760:2: rule__VariableAssignment__Group__2__Impl
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
    // InternalKlangParser.g:2766:1: rule__VariableAssignment__Group__2__Impl : ( ( rule__VariableAssignment__ExpressionAssignment_2 ) ) ;
    public final void rule__VariableAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2770:1: ( ( ( rule__VariableAssignment__ExpressionAssignment_2 ) ) )
            // InternalKlangParser.g:2771:1: ( ( rule__VariableAssignment__ExpressionAssignment_2 ) )
            {
            // InternalKlangParser.g:2771:1: ( ( rule__VariableAssignment__ExpressionAssignment_2 ) )
            // InternalKlangParser.g:2772:2: ( rule__VariableAssignment__ExpressionAssignment_2 )
            {
             before(grammarAccess.getVariableAssignmentAccess().getExpressionAssignment_2()); 
            // InternalKlangParser.g:2773:2: ( rule__VariableAssignment__ExpressionAssignment_2 )
            // InternalKlangParser.g:2773:3: rule__VariableAssignment__ExpressionAssignment_2
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


    // $ANTLR start "rule__Or__Group__0"
    // InternalKlangParser.g:2782:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2786:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalKlangParser.g:2787:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalKlangParser.g:2794:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2798:1: ( ( ruleAnd ) )
            // InternalKlangParser.g:2799:1: ( ruleAnd )
            {
            // InternalKlangParser.g:2799:1: ( ruleAnd )
            // InternalKlangParser.g:2800:2: ruleAnd
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
    // InternalKlangParser.g:2809:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2813:1: ( rule__Or__Group__1__Impl )
            // InternalKlangParser.g:2814:2: rule__Or__Group__1__Impl
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
    // InternalKlangParser.g:2820:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2824:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalKlangParser.g:2825:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalKlangParser.g:2825:1: ( ( rule__Or__Group_1__0 )* )
            // InternalKlangParser.g:2826:2: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // InternalKlangParser.g:2827:2: ( rule__Or__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==Or) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalKlangParser.g:2827:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Or__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalKlangParser.g:2836:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2840:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalKlangParser.g:2841:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalKlangParser.g:2848:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2852:1: ( ( () ) )
            // InternalKlangParser.g:2853:1: ( () )
            {
            // InternalKlangParser.g:2853:1: ( () )
            // InternalKlangParser.g:2854:2: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // InternalKlangParser.g:2855:2: ()
            // InternalKlangParser.g:2855:3: 
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
    // InternalKlangParser.g:2863:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2867:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalKlangParser.g:2868:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalKlangParser.g:2875:1: rule__Or__Group_1__1__Impl : ( Or ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2879:1: ( ( Or ) )
            // InternalKlangParser.g:2880:1: ( Or )
            {
            // InternalKlangParser.g:2880:1: ( Or )
            // InternalKlangParser.g:2881:2: Or
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
    // InternalKlangParser.g:2890:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2894:1: ( rule__Or__Group_1__2__Impl )
            // InternalKlangParser.g:2895:2: rule__Or__Group_1__2__Impl
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
    // InternalKlangParser.g:2901:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2905:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:2906:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:2906:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalKlangParser.g:2907:2: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:2908:2: ( rule__Or__RightAssignment_1_2 )
            // InternalKlangParser.g:2908:3: rule__Or__RightAssignment_1_2
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
    // InternalKlangParser.g:2917:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2921:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalKlangParser.g:2922:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalKlangParser.g:2929:1: rule__And__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2933:1: ( ( ruleComparison ) )
            // InternalKlangParser.g:2934:1: ( ruleComparison )
            {
            // InternalKlangParser.g:2934:1: ( ruleComparison )
            // InternalKlangParser.g:2935:2: ruleComparison
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
    // InternalKlangParser.g:2944:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2948:1: ( rule__And__Group__1__Impl )
            // InternalKlangParser.g:2949:2: rule__And__Group__1__Impl
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
    // InternalKlangParser.g:2955:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2959:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalKlangParser.g:2960:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalKlangParser.g:2960:1: ( ( rule__And__Group_1__0 )* )
            // InternalKlangParser.g:2961:2: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // InternalKlangParser.g:2962:2: ( rule__And__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==And) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalKlangParser.g:2962:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__And__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalKlangParser.g:2971:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2975:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalKlangParser.g:2976:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalKlangParser.g:2983:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2987:1: ( ( () ) )
            // InternalKlangParser.g:2988:1: ( () )
            {
            // InternalKlangParser.g:2988:1: ( () )
            // InternalKlangParser.g:2989:2: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // InternalKlangParser.g:2990:2: ()
            // InternalKlangParser.g:2990:3: 
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
    // InternalKlangParser.g:2998:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3002:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalKlangParser.g:3003:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalKlangParser.g:3010:1: rule__And__Group_1__1__Impl : ( And ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3014:1: ( ( And ) )
            // InternalKlangParser.g:3015:1: ( And )
            {
            // InternalKlangParser.g:3015:1: ( And )
            // InternalKlangParser.g:3016:2: And
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
    // InternalKlangParser.g:3025:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3029:1: ( rule__And__Group_1__2__Impl )
            // InternalKlangParser.g:3030:2: rule__And__Group_1__2__Impl
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
    // InternalKlangParser.g:3036:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3040:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:3041:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:3041:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalKlangParser.g:3042:2: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:3043:2: ( rule__And__RightAssignment_1_2 )
            // InternalKlangParser.g:3043:3: rule__And__RightAssignment_1_2
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
    // InternalKlangParser.g:3052:1: rule__Plus__Group__0 : rule__Plus__Group__0__Impl rule__Plus__Group__1 ;
    public final void rule__Plus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3056:1: ( rule__Plus__Group__0__Impl rule__Plus__Group__1 )
            // InternalKlangParser.g:3057:2: rule__Plus__Group__0__Impl rule__Plus__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalKlangParser.g:3064:1: rule__Plus__Group__0__Impl : ( ruleMinus ) ;
    public final void rule__Plus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3068:1: ( ( ruleMinus ) )
            // InternalKlangParser.g:3069:1: ( ruleMinus )
            {
            // InternalKlangParser.g:3069:1: ( ruleMinus )
            // InternalKlangParser.g:3070:2: ruleMinus
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
    // InternalKlangParser.g:3079:1: rule__Plus__Group__1 : rule__Plus__Group__1__Impl ;
    public final void rule__Plus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3083:1: ( rule__Plus__Group__1__Impl )
            // InternalKlangParser.g:3084:2: rule__Plus__Group__1__Impl
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
    // InternalKlangParser.g:3090:1: rule__Plus__Group__1__Impl : ( ( rule__Plus__Group_1__0 )* ) ;
    public final void rule__Plus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3094:1: ( ( ( rule__Plus__Group_1__0 )* ) )
            // InternalKlangParser.g:3095:1: ( ( rule__Plus__Group_1__0 )* )
            {
            // InternalKlangParser.g:3095:1: ( ( rule__Plus__Group_1__0 )* )
            // InternalKlangParser.g:3096:2: ( rule__Plus__Group_1__0 )*
            {
             before(grammarAccess.getPlusAccess().getGroup_1()); 
            // InternalKlangParser.g:3097:2: ( rule__Plus__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==PlusSign) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalKlangParser.g:3097:3: rule__Plus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Plus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalKlangParser.g:3106:1: rule__Plus__Group_1__0 : rule__Plus__Group_1__0__Impl rule__Plus__Group_1__1 ;
    public final void rule__Plus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3110:1: ( rule__Plus__Group_1__0__Impl rule__Plus__Group_1__1 )
            // InternalKlangParser.g:3111:2: rule__Plus__Group_1__0__Impl rule__Plus__Group_1__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalKlangParser.g:3118:1: rule__Plus__Group_1__0__Impl : ( () ) ;
    public final void rule__Plus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3122:1: ( ( () ) )
            // InternalKlangParser.g:3123:1: ( () )
            {
            // InternalKlangParser.g:3123:1: ( () )
            // InternalKlangParser.g:3124:2: ()
            {
             before(grammarAccess.getPlusAccess().getPlusLeftAction_1_0()); 
            // InternalKlangParser.g:3125:2: ()
            // InternalKlangParser.g:3125:3: 
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
    // InternalKlangParser.g:3133:1: rule__Plus__Group_1__1 : rule__Plus__Group_1__1__Impl rule__Plus__Group_1__2 ;
    public final void rule__Plus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3137:1: ( rule__Plus__Group_1__1__Impl rule__Plus__Group_1__2 )
            // InternalKlangParser.g:3138:2: rule__Plus__Group_1__1__Impl rule__Plus__Group_1__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalKlangParser.g:3145:1: rule__Plus__Group_1__1__Impl : ( PlusSign ) ;
    public final void rule__Plus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3149:1: ( ( PlusSign ) )
            // InternalKlangParser.g:3150:1: ( PlusSign )
            {
            // InternalKlangParser.g:3150:1: ( PlusSign )
            // InternalKlangParser.g:3151:2: PlusSign
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
    // InternalKlangParser.g:3160:1: rule__Plus__Group_1__2 : rule__Plus__Group_1__2__Impl ;
    public final void rule__Plus__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3164:1: ( rule__Plus__Group_1__2__Impl )
            // InternalKlangParser.g:3165:2: rule__Plus__Group_1__2__Impl
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
    // InternalKlangParser.g:3171:1: rule__Plus__Group_1__2__Impl : ( ( rule__Plus__RightAssignment_1_2 ) ) ;
    public final void rule__Plus__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3175:1: ( ( ( rule__Plus__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:3176:1: ( ( rule__Plus__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:3176:1: ( ( rule__Plus__RightAssignment_1_2 ) )
            // InternalKlangParser.g:3177:2: ( rule__Plus__RightAssignment_1_2 )
            {
             before(grammarAccess.getPlusAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:3178:2: ( rule__Plus__RightAssignment_1_2 )
            // InternalKlangParser.g:3178:3: rule__Plus__RightAssignment_1_2
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
    // InternalKlangParser.g:3187:1: rule__Minus__Group__0 : rule__Minus__Group__0__Impl rule__Minus__Group__1 ;
    public final void rule__Minus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3191:1: ( rule__Minus__Group__0__Impl rule__Minus__Group__1 )
            // InternalKlangParser.g:3192:2: rule__Minus__Group__0__Impl rule__Minus__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalKlangParser.g:3199:1: rule__Minus__Group__0__Impl : ( ruleMultiply ) ;
    public final void rule__Minus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3203:1: ( ( ruleMultiply ) )
            // InternalKlangParser.g:3204:1: ( ruleMultiply )
            {
            // InternalKlangParser.g:3204:1: ( ruleMultiply )
            // InternalKlangParser.g:3205:2: ruleMultiply
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
    // InternalKlangParser.g:3214:1: rule__Minus__Group__1 : rule__Minus__Group__1__Impl ;
    public final void rule__Minus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3218:1: ( rule__Minus__Group__1__Impl )
            // InternalKlangParser.g:3219:2: rule__Minus__Group__1__Impl
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
    // InternalKlangParser.g:3225:1: rule__Minus__Group__1__Impl : ( ( rule__Minus__Group_1__0 )* ) ;
    public final void rule__Minus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3229:1: ( ( ( rule__Minus__Group_1__0 )* ) )
            // InternalKlangParser.g:3230:1: ( ( rule__Minus__Group_1__0 )* )
            {
            // InternalKlangParser.g:3230:1: ( ( rule__Minus__Group_1__0 )* )
            // InternalKlangParser.g:3231:2: ( rule__Minus__Group_1__0 )*
            {
             before(grammarAccess.getMinusAccess().getGroup_1()); 
            // InternalKlangParser.g:3232:2: ( rule__Minus__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==HyphenMinus) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalKlangParser.g:3232:3: rule__Minus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Minus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalKlangParser.g:3241:1: rule__Minus__Group_1__0 : rule__Minus__Group_1__0__Impl rule__Minus__Group_1__1 ;
    public final void rule__Minus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3245:1: ( rule__Minus__Group_1__0__Impl rule__Minus__Group_1__1 )
            // InternalKlangParser.g:3246:2: rule__Minus__Group_1__0__Impl rule__Minus__Group_1__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalKlangParser.g:3253:1: rule__Minus__Group_1__0__Impl : ( () ) ;
    public final void rule__Minus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3257:1: ( ( () ) )
            // InternalKlangParser.g:3258:1: ( () )
            {
            // InternalKlangParser.g:3258:1: ( () )
            // InternalKlangParser.g:3259:2: ()
            {
             before(grammarAccess.getMinusAccess().getMinusLeftAction_1_0()); 
            // InternalKlangParser.g:3260:2: ()
            // InternalKlangParser.g:3260:3: 
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
    // InternalKlangParser.g:3268:1: rule__Minus__Group_1__1 : rule__Minus__Group_1__1__Impl rule__Minus__Group_1__2 ;
    public final void rule__Minus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3272:1: ( rule__Minus__Group_1__1__Impl rule__Minus__Group_1__2 )
            // InternalKlangParser.g:3273:2: rule__Minus__Group_1__1__Impl rule__Minus__Group_1__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalKlangParser.g:3280:1: rule__Minus__Group_1__1__Impl : ( HyphenMinus ) ;
    public final void rule__Minus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3284:1: ( ( HyphenMinus ) )
            // InternalKlangParser.g:3285:1: ( HyphenMinus )
            {
            // InternalKlangParser.g:3285:1: ( HyphenMinus )
            // InternalKlangParser.g:3286:2: HyphenMinus
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
    // InternalKlangParser.g:3295:1: rule__Minus__Group_1__2 : rule__Minus__Group_1__2__Impl ;
    public final void rule__Minus__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3299:1: ( rule__Minus__Group_1__2__Impl )
            // InternalKlangParser.g:3300:2: rule__Minus__Group_1__2__Impl
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
    // InternalKlangParser.g:3306:1: rule__Minus__Group_1__2__Impl : ( ( rule__Minus__RightAssignment_1_2 ) ) ;
    public final void rule__Minus__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3310:1: ( ( ( rule__Minus__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:3311:1: ( ( rule__Minus__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:3311:1: ( ( rule__Minus__RightAssignment_1_2 ) )
            // InternalKlangParser.g:3312:2: ( rule__Minus__RightAssignment_1_2 )
            {
             before(grammarAccess.getMinusAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:3313:2: ( rule__Minus__RightAssignment_1_2 )
            // InternalKlangParser.g:3313:3: rule__Minus__RightAssignment_1_2
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
    // InternalKlangParser.g:3322:1: rule__Multiply__Group__0 : rule__Multiply__Group__0__Impl rule__Multiply__Group__1 ;
    public final void rule__Multiply__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3326:1: ( rule__Multiply__Group__0__Impl rule__Multiply__Group__1 )
            // InternalKlangParser.g:3327:2: rule__Multiply__Group__0__Impl rule__Multiply__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalKlangParser.g:3334:1: rule__Multiply__Group__0__Impl : ( ruleDivide ) ;
    public final void rule__Multiply__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3338:1: ( ( ruleDivide ) )
            // InternalKlangParser.g:3339:1: ( ruleDivide )
            {
            // InternalKlangParser.g:3339:1: ( ruleDivide )
            // InternalKlangParser.g:3340:2: ruleDivide
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
    // InternalKlangParser.g:3349:1: rule__Multiply__Group__1 : rule__Multiply__Group__1__Impl ;
    public final void rule__Multiply__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3353:1: ( rule__Multiply__Group__1__Impl )
            // InternalKlangParser.g:3354:2: rule__Multiply__Group__1__Impl
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
    // InternalKlangParser.g:3360:1: rule__Multiply__Group__1__Impl : ( ( rule__Multiply__Group_1__0 )* ) ;
    public final void rule__Multiply__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3364:1: ( ( ( rule__Multiply__Group_1__0 )* ) )
            // InternalKlangParser.g:3365:1: ( ( rule__Multiply__Group_1__0 )* )
            {
            // InternalKlangParser.g:3365:1: ( ( rule__Multiply__Group_1__0 )* )
            // InternalKlangParser.g:3366:2: ( rule__Multiply__Group_1__0 )*
            {
             before(grammarAccess.getMultiplyAccess().getGroup_1()); 
            // InternalKlangParser.g:3367:2: ( rule__Multiply__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==Asterisk) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalKlangParser.g:3367:3: rule__Multiply__Group_1__0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__Multiply__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalKlangParser.g:3376:1: rule__Multiply__Group_1__0 : rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1 ;
    public final void rule__Multiply__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3380:1: ( rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1 )
            // InternalKlangParser.g:3381:2: rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalKlangParser.g:3388:1: rule__Multiply__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiply__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3392:1: ( ( () ) )
            // InternalKlangParser.g:3393:1: ( () )
            {
            // InternalKlangParser.g:3393:1: ( () )
            // InternalKlangParser.g:3394:2: ()
            {
             before(grammarAccess.getMultiplyAccess().getMultiplyLeftAction_1_0()); 
            // InternalKlangParser.g:3395:2: ()
            // InternalKlangParser.g:3395:3: 
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
    // InternalKlangParser.g:3403:1: rule__Multiply__Group_1__1 : rule__Multiply__Group_1__1__Impl rule__Multiply__Group_1__2 ;
    public final void rule__Multiply__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3407:1: ( rule__Multiply__Group_1__1__Impl rule__Multiply__Group_1__2 )
            // InternalKlangParser.g:3408:2: rule__Multiply__Group_1__1__Impl rule__Multiply__Group_1__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalKlangParser.g:3415:1: rule__Multiply__Group_1__1__Impl : ( Asterisk ) ;
    public final void rule__Multiply__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3419:1: ( ( Asterisk ) )
            // InternalKlangParser.g:3420:1: ( Asterisk )
            {
            // InternalKlangParser.g:3420:1: ( Asterisk )
            // InternalKlangParser.g:3421:2: Asterisk
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
    // InternalKlangParser.g:3430:1: rule__Multiply__Group_1__2 : rule__Multiply__Group_1__2__Impl ;
    public final void rule__Multiply__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3434:1: ( rule__Multiply__Group_1__2__Impl )
            // InternalKlangParser.g:3435:2: rule__Multiply__Group_1__2__Impl
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
    // InternalKlangParser.g:3441:1: rule__Multiply__Group_1__2__Impl : ( ( rule__Multiply__RightAssignment_1_2 ) ) ;
    public final void rule__Multiply__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3445:1: ( ( ( rule__Multiply__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:3446:1: ( ( rule__Multiply__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:3446:1: ( ( rule__Multiply__RightAssignment_1_2 ) )
            // InternalKlangParser.g:3447:2: ( rule__Multiply__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplyAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:3448:2: ( rule__Multiply__RightAssignment_1_2 )
            // InternalKlangParser.g:3448:3: rule__Multiply__RightAssignment_1_2
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
    // InternalKlangParser.g:3457:1: rule__Divide__Group__0 : rule__Divide__Group__0__Impl rule__Divide__Group__1 ;
    public final void rule__Divide__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3461:1: ( rule__Divide__Group__0__Impl rule__Divide__Group__1 )
            // InternalKlangParser.g:3462:2: rule__Divide__Group__0__Impl rule__Divide__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalKlangParser.g:3469:1: rule__Divide__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__Divide__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3473:1: ( ( rulePrimaryExpression ) )
            // InternalKlangParser.g:3474:1: ( rulePrimaryExpression )
            {
            // InternalKlangParser.g:3474:1: ( rulePrimaryExpression )
            // InternalKlangParser.g:3475:2: rulePrimaryExpression
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
    // InternalKlangParser.g:3484:1: rule__Divide__Group__1 : rule__Divide__Group__1__Impl ;
    public final void rule__Divide__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3488:1: ( rule__Divide__Group__1__Impl )
            // InternalKlangParser.g:3489:2: rule__Divide__Group__1__Impl
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
    // InternalKlangParser.g:3495:1: rule__Divide__Group__1__Impl : ( ( rule__Divide__Group_1__0 )* ) ;
    public final void rule__Divide__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3499:1: ( ( ( rule__Divide__Group_1__0 )* ) )
            // InternalKlangParser.g:3500:1: ( ( rule__Divide__Group_1__0 )* )
            {
            // InternalKlangParser.g:3500:1: ( ( rule__Divide__Group_1__0 )* )
            // InternalKlangParser.g:3501:2: ( rule__Divide__Group_1__0 )*
            {
             before(grammarAccess.getDivideAccess().getGroup_1()); 
            // InternalKlangParser.g:3502:2: ( rule__Divide__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==Solidus) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalKlangParser.g:3502:3: rule__Divide__Group_1__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__Divide__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalKlangParser.g:3511:1: rule__Divide__Group_1__0 : rule__Divide__Group_1__0__Impl rule__Divide__Group_1__1 ;
    public final void rule__Divide__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3515:1: ( rule__Divide__Group_1__0__Impl rule__Divide__Group_1__1 )
            // InternalKlangParser.g:3516:2: rule__Divide__Group_1__0__Impl rule__Divide__Group_1__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalKlangParser.g:3523:1: rule__Divide__Group_1__0__Impl : ( () ) ;
    public final void rule__Divide__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3527:1: ( ( () ) )
            // InternalKlangParser.g:3528:1: ( () )
            {
            // InternalKlangParser.g:3528:1: ( () )
            // InternalKlangParser.g:3529:2: ()
            {
             before(grammarAccess.getDivideAccess().getDivideLeftAction_1_0()); 
            // InternalKlangParser.g:3530:2: ()
            // InternalKlangParser.g:3530:3: 
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
    // InternalKlangParser.g:3538:1: rule__Divide__Group_1__1 : rule__Divide__Group_1__1__Impl rule__Divide__Group_1__2 ;
    public final void rule__Divide__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3542:1: ( rule__Divide__Group_1__1__Impl rule__Divide__Group_1__2 )
            // InternalKlangParser.g:3543:2: rule__Divide__Group_1__1__Impl rule__Divide__Group_1__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalKlangParser.g:3550:1: rule__Divide__Group_1__1__Impl : ( Solidus ) ;
    public final void rule__Divide__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3554:1: ( ( Solidus ) )
            // InternalKlangParser.g:3555:1: ( Solidus )
            {
            // InternalKlangParser.g:3555:1: ( Solidus )
            // InternalKlangParser.g:3556:2: Solidus
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
    // InternalKlangParser.g:3565:1: rule__Divide__Group_1__2 : rule__Divide__Group_1__2__Impl ;
    public final void rule__Divide__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3569:1: ( rule__Divide__Group_1__2__Impl )
            // InternalKlangParser.g:3570:2: rule__Divide__Group_1__2__Impl
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
    // InternalKlangParser.g:3576:1: rule__Divide__Group_1__2__Impl : ( ( rule__Divide__RightAssignment_1_2 ) ) ;
    public final void rule__Divide__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3580:1: ( ( ( rule__Divide__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:3581:1: ( ( rule__Divide__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:3581:1: ( ( rule__Divide__RightAssignment_1_2 ) )
            // InternalKlangParser.g:3582:2: ( rule__Divide__RightAssignment_1_2 )
            {
             before(grammarAccess.getDivideAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:3583:2: ( rule__Divide__RightAssignment_1_2 )
            // InternalKlangParser.g:3583:3: rule__Divide__RightAssignment_1_2
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
    // InternalKlangParser.g:3592:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3596:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalKlangParser.g:3597:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalKlangParser.g:3604:1: rule__Comparison__Group__0__Impl : ( rulePlus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3608:1: ( ( rulePlus ) )
            // InternalKlangParser.g:3609:1: ( rulePlus )
            {
            // InternalKlangParser.g:3609:1: ( rulePlus )
            // InternalKlangParser.g:3610:2: rulePlus
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
    // InternalKlangParser.g:3619:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3623:1: ( rule__Comparison__Group__1__Impl )
            // InternalKlangParser.g:3624:2: rule__Comparison__Group__1__Impl
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
    // InternalKlangParser.g:3630:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3634:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalKlangParser.g:3635:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalKlangParser.g:3635:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalKlangParser.g:3636:2: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // InternalKlangParser.g:3637:2: ( rule__Comparison__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==EqualsSignEqualsSign||LA25_0==LessThanSign||LA25_0==GreaterThanSign) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalKlangParser.g:3637:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalKlangParser.g:3646:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3650:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalKlangParser.g:3651:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalKlangParser.g:3658:1: rule__Comparison__Group_1__0__Impl : ( ( rule__Comparison__Alternatives_1_0 ) ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3662:1: ( ( ( rule__Comparison__Alternatives_1_0 ) ) )
            // InternalKlangParser.g:3663:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            {
            // InternalKlangParser.g:3663:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            // InternalKlangParser.g:3664:2: ( rule__Comparison__Alternatives_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getAlternatives_1_0()); 
            // InternalKlangParser.g:3665:2: ( rule__Comparison__Alternatives_1_0 )
            // InternalKlangParser.g:3665:3: rule__Comparison__Alternatives_1_0
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
    // InternalKlangParser.g:3673:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3677:1: ( rule__Comparison__Group_1__1__Impl )
            // InternalKlangParser.g:3678:2: rule__Comparison__Group_1__1__Impl
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
    // InternalKlangParser.g:3684:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__RightAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3688:1: ( ( ( rule__Comparison__RightAssignment_1_1 ) ) )
            // InternalKlangParser.g:3689:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            {
            // InternalKlangParser.g:3689:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            // InternalKlangParser.g:3690:2: ( rule__Comparison__RightAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_1()); 
            // InternalKlangParser.g:3691:2: ( rule__Comparison__RightAssignment_1_1 )
            // InternalKlangParser.g:3691:3: rule__Comparison__RightAssignment_1_1
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
    // InternalKlangParser.g:3700:1: rule__Comparison__Group_1_0_0__0 : rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 ;
    public final void rule__Comparison__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3704:1: ( rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 )
            // InternalKlangParser.g:3705:2: rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1
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
    // InternalKlangParser.g:3712:1: rule__Comparison__Group_1_0_0__0__Impl : ( LessThanSign ) ;
    public final void rule__Comparison__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3716:1: ( ( LessThanSign ) )
            // InternalKlangParser.g:3717:1: ( LessThanSign )
            {
            // InternalKlangParser.g:3717:1: ( LessThanSign )
            // InternalKlangParser.g:3718:2: LessThanSign
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
    // InternalKlangParser.g:3727:1: rule__Comparison__Group_1_0_0__1 : rule__Comparison__Group_1_0_0__1__Impl ;
    public final void rule__Comparison__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3731:1: ( rule__Comparison__Group_1_0_0__1__Impl )
            // InternalKlangParser.g:3732:2: rule__Comparison__Group_1_0_0__1__Impl
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
    // InternalKlangParser.g:3738:1: rule__Comparison__Group_1_0_0__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3742:1: ( ( () ) )
            // InternalKlangParser.g:3743:1: ( () )
            {
            // InternalKlangParser.g:3743:1: ( () )
            // InternalKlangParser.g:3744:2: ()
            {
             before(grammarAccess.getComparisonAccess().getLessThanLeftAction_1_0_0_1()); 
            // InternalKlangParser.g:3745:2: ()
            // InternalKlangParser.g:3745:3: 
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
    // InternalKlangParser.g:3754:1: rule__Comparison__Group_1_0_1__0 : rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 ;
    public final void rule__Comparison__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3758:1: ( rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 )
            // InternalKlangParser.g:3759:2: rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1
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
    // InternalKlangParser.g:3766:1: rule__Comparison__Group_1_0_1__0__Impl : ( EqualsSignEqualsSign ) ;
    public final void rule__Comparison__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3770:1: ( ( EqualsSignEqualsSign ) )
            // InternalKlangParser.g:3771:1: ( EqualsSignEqualsSign )
            {
            // InternalKlangParser.g:3771:1: ( EqualsSignEqualsSign )
            // InternalKlangParser.g:3772:2: EqualsSignEqualsSign
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
    // InternalKlangParser.g:3781:1: rule__Comparison__Group_1_0_1__1 : rule__Comparison__Group_1_0_1__1__Impl ;
    public final void rule__Comparison__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3785:1: ( rule__Comparison__Group_1_0_1__1__Impl )
            // InternalKlangParser.g:3786:2: rule__Comparison__Group_1_0_1__1__Impl
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
    // InternalKlangParser.g:3792:1: rule__Comparison__Group_1_0_1__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3796:1: ( ( () ) )
            // InternalKlangParser.g:3797:1: ( () )
            {
            // InternalKlangParser.g:3797:1: ( () )
            // InternalKlangParser.g:3798:2: ()
            {
             before(grammarAccess.getComparisonAccess().getEqualLeftAction_1_0_1_1()); 
            // InternalKlangParser.g:3799:2: ()
            // InternalKlangParser.g:3799:3: 
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
    // InternalKlangParser.g:3808:1: rule__Comparison__Group_1_0_2__0 : rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1 ;
    public final void rule__Comparison__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3812:1: ( rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1 )
            // InternalKlangParser.g:3813:2: rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1
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
    // InternalKlangParser.g:3820:1: rule__Comparison__Group_1_0_2__0__Impl : ( GreaterThanSign ) ;
    public final void rule__Comparison__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3824:1: ( ( GreaterThanSign ) )
            // InternalKlangParser.g:3825:1: ( GreaterThanSign )
            {
            // InternalKlangParser.g:3825:1: ( GreaterThanSign )
            // InternalKlangParser.g:3826:2: GreaterThanSign
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
    // InternalKlangParser.g:3835:1: rule__Comparison__Group_1_0_2__1 : rule__Comparison__Group_1_0_2__1__Impl ;
    public final void rule__Comparison__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3839:1: ( rule__Comparison__Group_1_0_2__1__Impl )
            // InternalKlangParser.g:3840:2: rule__Comparison__Group_1_0_2__1__Impl
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
    // InternalKlangParser.g:3846:1: rule__Comparison__Group_1_0_2__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3850:1: ( ( () ) )
            // InternalKlangParser.g:3851:1: ( () )
            {
            // InternalKlangParser.g:3851:1: ( () )
            // InternalKlangParser.g:3852:2: ()
            {
             before(grammarAccess.getComparisonAccess().getGreaterThanLeftAction_1_0_2_1()); 
            // InternalKlangParser.g:3853:2: ()
            // InternalKlangParser.g:3853:3: 
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
    // InternalKlangParser.g:3862:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3866:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // InternalKlangParser.g:3867:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalKlangParser.g:3874:1: rule__FunctionCall__Group__0__Impl : ( () ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3878:1: ( ( () ) )
            // InternalKlangParser.g:3879:1: ( () )
            {
            // InternalKlangParser.g:3879:1: ( () )
            // InternalKlangParser.g:3880:2: ()
            {
             before(grammarAccess.getFunctionCallAccess().getFunctionCallAction_0()); 
            // InternalKlangParser.g:3881:2: ()
            // InternalKlangParser.g:3881:3: 
            {
            }

             after(grammarAccess.getFunctionCallAccess().getFunctionCallAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group__1"
    // InternalKlangParser.g:3889:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3893:1: ( rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 )
            // InternalKlangParser.g:3894:2: rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalKlangParser.g:3901:1: rule__FunctionCall__Group__1__Impl : ( FullStop ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3905:1: ( ( FullStop ) )
            // InternalKlangParser.g:3906:1: ( FullStop )
            {
            // InternalKlangParser.g:3906:1: ( FullStop )
            // InternalKlangParser.g:3907:2: FullStop
            {
             before(grammarAccess.getFunctionCallAccess().getFullStopKeyword_1()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getFullStopKeyword_1()); 

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
    // InternalKlangParser.g:3916:1: rule__FunctionCall__Group__2 : rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 ;
    public final void rule__FunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3920:1: ( rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 )
            // InternalKlangParser.g:3921:2: rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3
            {
            pushFollow(FOLLOW_44);
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
    // InternalKlangParser.g:3928:1: rule__FunctionCall__Group__2__Impl : ( ( rule__FunctionCall__NameAssignment_2 ) ) ;
    public final void rule__FunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3932:1: ( ( ( rule__FunctionCall__NameAssignment_2 ) ) )
            // InternalKlangParser.g:3933:1: ( ( rule__FunctionCall__NameAssignment_2 ) )
            {
            // InternalKlangParser.g:3933:1: ( ( rule__FunctionCall__NameAssignment_2 ) )
            // InternalKlangParser.g:3934:2: ( rule__FunctionCall__NameAssignment_2 )
            {
             before(grammarAccess.getFunctionCallAccess().getNameAssignment_2()); 
            // InternalKlangParser.g:3935:2: ( rule__FunctionCall__NameAssignment_2 )
            // InternalKlangParser.g:3935:3: rule__FunctionCall__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getNameAssignment_2()); 

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
    // InternalKlangParser.g:3943:1: rule__FunctionCall__Group__3 : rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4 ;
    public final void rule__FunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3947:1: ( rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4 )
            // InternalKlangParser.g:3948:2: rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4
            {
            pushFollow(FOLLOW_45);
            rule__FunctionCall__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__4();

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
    // InternalKlangParser.g:3955:1: rule__FunctionCall__Group__3__Impl : ( LeftParenthesis ) ;
    public final void rule__FunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3959:1: ( ( LeftParenthesis ) )
            // InternalKlangParser.g:3960:1: ( LeftParenthesis )
            {
            // InternalKlangParser.g:3960:1: ( LeftParenthesis )
            // InternalKlangParser.g:3961:2: LeftParenthesis
            {
             before(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_3()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_3()); 

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


    // $ANTLR start "rule__FunctionCall__Group__4"
    // InternalKlangParser.g:3970:1: rule__FunctionCall__Group__4 : rule__FunctionCall__Group__4__Impl rule__FunctionCall__Group__5 ;
    public final void rule__FunctionCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3974:1: ( rule__FunctionCall__Group__4__Impl rule__FunctionCall__Group__5 )
            // InternalKlangParser.g:3975:2: rule__FunctionCall__Group__4__Impl rule__FunctionCall__Group__5
            {
            pushFollow(FOLLOW_45);
            rule__FunctionCall__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__5();

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
    // $ANTLR end "rule__FunctionCall__Group__4"


    // $ANTLR start "rule__FunctionCall__Group__4__Impl"
    // InternalKlangParser.g:3982:1: rule__FunctionCall__Group__4__Impl : ( ( rule__FunctionCall__Group_4__0 )? ) ;
    public final void rule__FunctionCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3986:1: ( ( ( rule__FunctionCall__Group_4__0 )? ) )
            // InternalKlangParser.g:3987:1: ( ( rule__FunctionCall__Group_4__0 )? )
            {
            // InternalKlangParser.g:3987:1: ( ( rule__FunctionCall__Group_4__0 )? )
            // InternalKlangParser.g:3988:2: ( rule__FunctionCall__Group_4__0 )?
            {
             before(grammarAccess.getFunctionCallAccess().getGroup_4()); 
            // InternalKlangParser.g:3989:2: ( rule__FunctionCall__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==False||LA26_0==True||LA26_0==Not||LA26_0==LeftParenthesis||LA26_0==FullStop||(LA26_0>=RULE_DECIMAL && LA26_0<=RULE_STRING)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalKlangParser.g:3989:3: rule__FunctionCall__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionCall__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionCallAccess().getGroup_4()); 

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
    // $ANTLR end "rule__FunctionCall__Group__4__Impl"


    // $ANTLR start "rule__FunctionCall__Group__5"
    // InternalKlangParser.g:3997:1: rule__FunctionCall__Group__5 : rule__FunctionCall__Group__5__Impl ;
    public final void rule__FunctionCall__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4001:1: ( rule__FunctionCall__Group__5__Impl )
            // InternalKlangParser.g:4002:2: rule__FunctionCall__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__5__Impl();

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
    // $ANTLR end "rule__FunctionCall__Group__5"


    // $ANTLR start "rule__FunctionCall__Group__5__Impl"
    // InternalKlangParser.g:4008:1: rule__FunctionCall__Group__5__Impl : ( RightParenthesis ) ;
    public final void rule__FunctionCall__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4012:1: ( ( RightParenthesis ) )
            // InternalKlangParser.g:4013:1: ( RightParenthesis )
            {
            // InternalKlangParser.g:4013:1: ( RightParenthesis )
            // InternalKlangParser.g:4014:2: RightParenthesis
            {
             before(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_5()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__FunctionCall__Group__5__Impl"


    // $ANTLR start "rule__FunctionCall__Group_4__0"
    // InternalKlangParser.g:4024:1: rule__FunctionCall__Group_4__0 : rule__FunctionCall__Group_4__0__Impl rule__FunctionCall__Group_4__1 ;
    public final void rule__FunctionCall__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4028:1: ( rule__FunctionCall__Group_4__0__Impl rule__FunctionCall__Group_4__1 )
            // InternalKlangParser.g:4029:2: rule__FunctionCall__Group_4__0__Impl rule__FunctionCall__Group_4__1
            {
            pushFollow(FOLLOW_46);
            rule__FunctionCall__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_4__1();

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
    // $ANTLR end "rule__FunctionCall__Group_4__0"


    // $ANTLR start "rule__FunctionCall__Group_4__0__Impl"
    // InternalKlangParser.g:4036:1: rule__FunctionCall__Group_4__0__Impl : ( ( rule__FunctionCall__ParametersAssignment_4_0 ) ) ;
    public final void rule__FunctionCall__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4040:1: ( ( ( rule__FunctionCall__ParametersAssignment_4_0 ) ) )
            // InternalKlangParser.g:4041:1: ( ( rule__FunctionCall__ParametersAssignment_4_0 ) )
            {
            // InternalKlangParser.g:4041:1: ( ( rule__FunctionCall__ParametersAssignment_4_0 ) )
            // InternalKlangParser.g:4042:2: ( rule__FunctionCall__ParametersAssignment_4_0 )
            {
             before(grammarAccess.getFunctionCallAccess().getParametersAssignment_4_0()); 
            // InternalKlangParser.g:4043:2: ( rule__FunctionCall__ParametersAssignment_4_0 )
            // InternalKlangParser.g:4043:3: rule__FunctionCall__ParametersAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__ParametersAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getParametersAssignment_4_0()); 

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
    // $ANTLR end "rule__FunctionCall__Group_4__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_4__1"
    // InternalKlangParser.g:4051:1: rule__FunctionCall__Group_4__1 : rule__FunctionCall__Group_4__1__Impl ;
    public final void rule__FunctionCall__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4055:1: ( rule__FunctionCall__Group_4__1__Impl )
            // InternalKlangParser.g:4056:2: rule__FunctionCall__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_4__1__Impl();

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
    // $ANTLR end "rule__FunctionCall__Group_4__1"


    // $ANTLR start "rule__FunctionCall__Group_4__1__Impl"
    // InternalKlangParser.g:4062:1: rule__FunctionCall__Group_4__1__Impl : ( ( rule__FunctionCall__Group_4_1__0 )* ) ;
    public final void rule__FunctionCall__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4066:1: ( ( ( rule__FunctionCall__Group_4_1__0 )* ) )
            // InternalKlangParser.g:4067:1: ( ( rule__FunctionCall__Group_4_1__0 )* )
            {
            // InternalKlangParser.g:4067:1: ( ( rule__FunctionCall__Group_4_1__0 )* )
            // InternalKlangParser.g:4068:2: ( rule__FunctionCall__Group_4_1__0 )*
            {
             before(grammarAccess.getFunctionCallAccess().getGroup_4_1()); 
            // InternalKlangParser.g:4069:2: ( rule__FunctionCall__Group_4_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==Comma) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalKlangParser.g:4069:3: rule__FunctionCall__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__FunctionCall__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getFunctionCallAccess().getGroup_4_1()); 

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
    // $ANTLR end "rule__FunctionCall__Group_4__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group_4_1__0"
    // InternalKlangParser.g:4078:1: rule__FunctionCall__Group_4_1__0 : rule__FunctionCall__Group_4_1__0__Impl rule__FunctionCall__Group_4_1__1 ;
    public final void rule__FunctionCall__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4082:1: ( rule__FunctionCall__Group_4_1__0__Impl rule__FunctionCall__Group_4_1__1 )
            // InternalKlangParser.g:4083:2: rule__FunctionCall__Group_4_1__0__Impl rule__FunctionCall__Group_4_1__1
            {
            pushFollow(FOLLOW_25);
            rule__FunctionCall__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_4_1__1();

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
    // $ANTLR end "rule__FunctionCall__Group_4_1__0"


    // $ANTLR start "rule__FunctionCall__Group_4_1__0__Impl"
    // InternalKlangParser.g:4090:1: rule__FunctionCall__Group_4_1__0__Impl : ( Comma ) ;
    public final void rule__FunctionCall__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4094:1: ( ( Comma ) )
            // InternalKlangParser.g:4095:1: ( Comma )
            {
            // InternalKlangParser.g:4095:1: ( Comma )
            // InternalKlangParser.g:4096:2: Comma
            {
             before(grammarAccess.getFunctionCallAccess().getCommaKeyword_4_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getCommaKeyword_4_1_0()); 

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
    // $ANTLR end "rule__FunctionCall__Group_4_1__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_4_1__1"
    // InternalKlangParser.g:4105:1: rule__FunctionCall__Group_4_1__1 : rule__FunctionCall__Group_4_1__1__Impl ;
    public final void rule__FunctionCall__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4109:1: ( rule__FunctionCall__Group_4_1__1__Impl )
            // InternalKlangParser.g:4110:2: rule__FunctionCall__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__FunctionCall__Group_4_1__1"


    // $ANTLR start "rule__FunctionCall__Group_4_1__1__Impl"
    // InternalKlangParser.g:4116:1: rule__FunctionCall__Group_4_1__1__Impl : ( ( rule__FunctionCall__ParametersAssignment_4_1_1 ) ) ;
    public final void rule__FunctionCall__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4120:1: ( ( ( rule__FunctionCall__ParametersAssignment_4_1_1 ) ) )
            // InternalKlangParser.g:4121:1: ( ( rule__FunctionCall__ParametersAssignment_4_1_1 ) )
            {
            // InternalKlangParser.g:4121:1: ( ( rule__FunctionCall__ParametersAssignment_4_1_1 ) )
            // InternalKlangParser.g:4122:2: ( rule__FunctionCall__ParametersAssignment_4_1_1 )
            {
             before(grammarAccess.getFunctionCallAccess().getParametersAssignment_4_1_1()); 
            // InternalKlangParser.g:4123:2: ( rule__FunctionCall__ParametersAssignment_4_1_1 )
            // InternalKlangParser.g:4123:3: rule__FunctionCall__ParametersAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__ParametersAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getParametersAssignment_4_1_1()); 

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
    // $ANTLR end "rule__FunctionCall__Group_4_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0"
    // InternalKlangParser.g:4132:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4136:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // InternalKlangParser.g:4137:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalKlangParser.g:4144:1: rule__PrimaryExpression__Group_0__0__Impl : ( LeftParenthesis ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4148:1: ( ( LeftParenthesis ) )
            // InternalKlangParser.g:4149:1: ( LeftParenthesis )
            {
            // InternalKlangParser.g:4149:1: ( LeftParenthesis )
            // InternalKlangParser.g:4150:2: LeftParenthesis
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
    // InternalKlangParser.g:4159:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4163:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // InternalKlangParser.g:4164:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_48);
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
    // InternalKlangParser.g:4171:1: rule__PrimaryExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4175:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:4176:1: ( ruleExpression )
            {
            // InternalKlangParser.g:4176:1: ( ruleExpression )
            // InternalKlangParser.g:4177:2: ruleExpression
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
    // InternalKlangParser.g:4186:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4190:1: ( rule__PrimaryExpression__Group_0__2__Impl )
            // InternalKlangParser.g:4191:2: rule__PrimaryExpression__Group_0__2__Impl
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
    // InternalKlangParser.g:4197:1: rule__PrimaryExpression__Group_0__2__Impl : ( RightParenthesis ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4201:1: ( ( RightParenthesis ) )
            // InternalKlangParser.g:4202:1: ( RightParenthesis )
            {
            // InternalKlangParser.g:4202:1: ( RightParenthesis )
            // InternalKlangParser.g:4203:2: RightParenthesis
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
    // InternalKlangParser.g:4213:1: rule__PrimaryExpression__Group_1__0 : rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 ;
    public final void rule__PrimaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4217:1: ( rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 )
            // InternalKlangParser.g:4218:2: rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1
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
    // InternalKlangParser.g:4225:1: rule__PrimaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4229:1: ( ( () ) )
            // InternalKlangParser.g:4230:1: ( () )
            {
            // InternalKlangParser.g:4230:1: ( () )
            // InternalKlangParser.g:4231:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNotAction_1_0()); 
            // InternalKlangParser.g:4232:2: ()
            // InternalKlangParser.g:4232:3: 
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
    // InternalKlangParser.g:4240:1: rule__PrimaryExpression__Group_1__1 : rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2 ;
    public final void rule__PrimaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4244:1: ( rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2 )
            // InternalKlangParser.g:4245:2: rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalKlangParser.g:4252:1: rule__PrimaryExpression__Group_1__1__Impl : ( Not ) ;
    public final void rule__PrimaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4256:1: ( ( Not ) )
            // InternalKlangParser.g:4257:1: ( Not )
            {
            // InternalKlangParser.g:4257:1: ( Not )
            // InternalKlangParser.g:4258:2: Not
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
    // InternalKlangParser.g:4267:1: rule__PrimaryExpression__Group_1__2 : rule__PrimaryExpression__Group_1__2__Impl ;
    public final void rule__PrimaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4271:1: ( rule__PrimaryExpression__Group_1__2__Impl )
            // InternalKlangParser.g:4272:2: rule__PrimaryExpression__Group_1__2__Impl
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
    // InternalKlangParser.g:4278:1: rule__PrimaryExpression__Group_1__2__Impl : ( ( rule__PrimaryExpression__ExpressionAssignment_1_2 ) ) ;
    public final void rule__PrimaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4282:1: ( ( ( rule__PrimaryExpression__ExpressionAssignment_1_2 ) ) )
            // InternalKlangParser.g:4283:1: ( ( rule__PrimaryExpression__ExpressionAssignment_1_2 ) )
            {
            // InternalKlangParser.g:4283:1: ( ( rule__PrimaryExpression__ExpressionAssignment_1_2 ) )
            // InternalKlangParser.g:4284:2: ( rule__PrimaryExpression__ExpressionAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionAssignment_1_2()); 
            // InternalKlangParser.g:4285:2: ( rule__PrimaryExpression__ExpressionAssignment_1_2 )
            // InternalKlangParser.g:4285:3: rule__PrimaryExpression__ExpressionAssignment_1_2
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
    // InternalKlangParser.g:4294:1: rule__AtomicExpression__Group_0__0 : rule__AtomicExpression__Group_0__0__Impl rule__AtomicExpression__Group_0__1 ;
    public final void rule__AtomicExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4298:1: ( rule__AtomicExpression__Group_0__0__Impl rule__AtomicExpression__Group_0__1 )
            // InternalKlangParser.g:4299:2: rule__AtomicExpression__Group_0__0__Impl rule__AtomicExpression__Group_0__1
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
    // InternalKlangParser.g:4306:1: rule__AtomicExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__AtomicExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4310:1: ( ( () ) )
            // InternalKlangParser.g:4311:1: ( () )
            {
            // InternalKlangParser.g:4311:1: ( () )
            // InternalKlangParser.g:4312:2: ()
            {
             before(grammarAccess.getAtomicExpressionAccess().getBooleanLiteralAction_0_0()); 
            // InternalKlangParser.g:4313:2: ()
            // InternalKlangParser.g:4313:3: 
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
    // InternalKlangParser.g:4321:1: rule__AtomicExpression__Group_0__1 : rule__AtomicExpression__Group_0__1__Impl ;
    public final void rule__AtomicExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4325:1: ( rule__AtomicExpression__Group_0__1__Impl )
            // InternalKlangParser.g:4326:2: rule__AtomicExpression__Group_0__1__Impl
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
    // InternalKlangParser.g:4332:1: rule__AtomicExpression__Group_0__1__Impl : ( ( rule__AtomicExpression__Alternatives_0_1 ) ) ;
    public final void rule__AtomicExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4336:1: ( ( ( rule__AtomicExpression__Alternatives_0_1 ) ) )
            // InternalKlangParser.g:4337:1: ( ( rule__AtomicExpression__Alternatives_0_1 ) )
            {
            // InternalKlangParser.g:4337:1: ( ( rule__AtomicExpression__Alternatives_0_1 ) )
            // InternalKlangParser.g:4338:2: ( rule__AtomicExpression__Alternatives_0_1 )
            {
             before(grammarAccess.getAtomicExpressionAccess().getAlternatives_0_1()); 
            // InternalKlangParser.g:4339:2: ( rule__AtomicExpression__Alternatives_0_1 )
            // InternalKlangParser.g:4339:3: rule__AtomicExpression__Alternatives_0_1
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
    // InternalKlangParser.g:4348:1: rule__AtomicExpression__Group_1__0 : rule__AtomicExpression__Group_1__0__Impl rule__AtomicExpression__Group_1__1 ;
    public final void rule__AtomicExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4352:1: ( rule__AtomicExpression__Group_1__0__Impl rule__AtomicExpression__Group_1__1 )
            // InternalKlangParser.g:4353:2: rule__AtomicExpression__Group_1__0__Impl rule__AtomicExpression__Group_1__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalKlangParser.g:4360:1: rule__AtomicExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AtomicExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4364:1: ( ( () ) )
            // InternalKlangParser.g:4365:1: ( () )
            {
            // InternalKlangParser.g:4365:1: ( () )
            // InternalKlangParser.g:4366:2: ()
            {
             before(grammarAccess.getAtomicExpressionAccess().getNumericLiteralAction_1_0()); 
            // InternalKlangParser.g:4367:2: ()
            // InternalKlangParser.g:4367:3: 
            {
            }

             after(grammarAccess.getAtomicExpressionAccess().getNumericLiteralAction_1_0()); 

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
    // InternalKlangParser.g:4375:1: rule__AtomicExpression__Group_1__1 : rule__AtomicExpression__Group_1__1__Impl ;
    public final void rule__AtomicExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4379:1: ( rule__AtomicExpression__Group_1__1__Impl )
            // InternalKlangParser.g:4380:2: rule__AtomicExpression__Group_1__1__Impl
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
    // InternalKlangParser.g:4386:1: rule__AtomicExpression__Group_1__1__Impl : ( ( rule__AtomicExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__AtomicExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4390:1: ( ( ( rule__AtomicExpression__ValueAssignment_1_1 ) ) )
            // InternalKlangParser.g:4391:1: ( ( rule__AtomicExpression__ValueAssignment_1_1 ) )
            {
            // InternalKlangParser.g:4391:1: ( ( rule__AtomicExpression__ValueAssignment_1_1 ) )
            // InternalKlangParser.g:4392:2: ( rule__AtomicExpression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicExpressionAccess().getValueAssignment_1_1()); 
            // InternalKlangParser.g:4393:2: ( rule__AtomicExpression__ValueAssignment_1_1 )
            // InternalKlangParser.g:4393:3: rule__AtomicExpression__ValueAssignment_1_1
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
    // InternalKlangParser.g:4402:1: rule__AtomicExpression__Group_2__0 : rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 ;
    public final void rule__AtomicExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4406:1: ( rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 )
            // InternalKlangParser.g:4407:2: rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalKlangParser.g:4414:1: rule__AtomicExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__AtomicExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4418:1: ( ( () ) )
            // InternalKlangParser.g:4419:1: ( () )
            {
            // InternalKlangParser.g:4419:1: ( () )
            // InternalKlangParser.g:4420:2: ()
            {
             before(grammarAccess.getAtomicExpressionAccess().getStringLiteralAction_2_0()); 
            // InternalKlangParser.g:4421:2: ()
            // InternalKlangParser.g:4421:3: 
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
    // InternalKlangParser.g:4429:1: rule__AtomicExpression__Group_2__1 : rule__AtomicExpression__Group_2__1__Impl ;
    public final void rule__AtomicExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4433:1: ( rule__AtomicExpression__Group_2__1__Impl )
            // InternalKlangParser.g:4434:2: rule__AtomicExpression__Group_2__1__Impl
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
    // InternalKlangParser.g:4440:1: rule__AtomicExpression__Group_2__1__Impl : ( ( rule__AtomicExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__AtomicExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4444:1: ( ( ( rule__AtomicExpression__ValueAssignment_2_1 ) ) )
            // InternalKlangParser.g:4445:1: ( ( rule__AtomicExpression__ValueAssignment_2_1 ) )
            {
            // InternalKlangParser.g:4445:1: ( ( rule__AtomicExpression__ValueAssignment_2_1 ) )
            // InternalKlangParser.g:4446:2: ( rule__AtomicExpression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicExpressionAccess().getValueAssignment_2_1()); 
            // InternalKlangParser.g:4447:2: ( rule__AtomicExpression__ValueAssignment_2_1 )
            // InternalKlangParser.g:4447:3: rule__AtomicExpression__ValueAssignment_2_1
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
    // InternalKlangParser.g:4456:1: rule__AtomicExpression__Group_3__0 : rule__AtomicExpression__Group_3__0__Impl rule__AtomicExpression__Group_3__1 ;
    public final void rule__AtomicExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4460:1: ( rule__AtomicExpression__Group_3__0__Impl rule__AtomicExpression__Group_3__1 )
            // InternalKlangParser.g:4461:2: rule__AtomicExpression__Group_3__0__Impl rule__AtomicExpression__Group_3__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalKlangParser.g:4468:1: rule__AtomicExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__AtomicExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4472:1: ( ( () ) )
            // InternalKlangParser.g:4473:1: ( () )
            {
            // InternalKlangParser.g:4473:1: ( () )
            // InternalKlangParser.g:4474:2: ()
            {
             before(grammarAccess.getAtomicExpressionAccess().getVariableRefAction_3_0()); 
            // InternalKlangParser.g:4475:2: ()
            // InternalKlangParser.g:4475:3: 
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
    // InternalKlangParser.g:4483:1: rule__AtomicExpression__Group_3__1 : rule__AtomicExpression__Group_3__1__Impl ;
    public final void rule__AtomicExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4487:1: ( rule__AtomicExpression__Group_3__1__Impl )
            // InternalKlangParser.g:4488:2: rule__AtomicExpression__Group_3__1__Impl
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
    // InternalKlangParser.g:4494:1: rule__AtomicExpression__Group_3__1__Impl : ( ( rule__AtomicExpression__VariableNameAssignment_3_1 ) ) ;
    public final void rule__AtomicExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4498:1: ( ( ( rule__AtomicExpression__VariableNameAssignment_3_1 ) ) )
            // InternalKlangParser.g:4499:1: ( ( rule__AtomicExpression__VariableNameAssignment_3_1 ) )
            {
            // InternalKlangParser.g:4499:1: ( ( rule__AtomicExpression__VariableNameAssignment_3_1 ) )
            // InternalKlangParser.g:4500:2: ( rule__AtomicExpression__VariableNameAssignment_3_1 )
            {
             before(grammarAccess.getAtomicExpressionAccess().getVariableNameAssignment_3_1()); 
            // InternalKlangParser.g:4501:2: ( rule__AtomicExpression__VariableNameAssignment_3_1 )
            // InternalKlangParser.g:4501:3: rule__AtomicExpression__VariableNameAssignment_3_1
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


    // $ANTLR start "rule__Game__VariableDeclarationsAssignment_1"
    // InternalKlangParser.g:4510:1: rule__Game__VariableDeclarationsAssignment_1 : ( ruleVariable ) ;
    public final void rule__Game__VariableDeclarationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4514:1: ( ( ruleVariable ) )
            // InternalKlangParser.g:4515:2: ( ruleVariable )
            {
            // InternalKlangParser.g:4515:2: ( ruleVariable )
            // InternalKlangParser.g:4516:3: ruleVariable
            {
             before(grammarAccess.getGameAccess().getVariableDeclarationsVariableParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getGameAccess().getVariableDeclarationsVariableParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Game__VariableDeclarationsAssignment_1"


    // $ANTLR start "rule__Game__ActorDefsAssignment_2"
    // InternalKlangParser.g:4525:1: rule__Game__ActorDefsAssignment_2 : ( ruleActor ) ;
    public final void rule__Game__ActorDefsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4529:1: ( ( ruleActor ) )
            // InternalKlangParser.g:4530:2: ( ruleActor )
            {
            // InternalKlangParser.g:4530:2: ( ruleActor )
            // InternalKlangParser.g:4531:3: ruleActor
            {
             before(grammarAccess.getGameAccess().getActorDefsActorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getGameAccess().getActorDefsActorParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Game__ActorDefsAssignment_2"


    // $ANTLR start "rule__Actor__EntityAssignment_1"
    // InternalKlangParser.g:4540:1: rule__Actor__EntityAssignment_1 : ( ruleEntity ) ;
    public final void rule__Actor__EntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4544:1: ( ( ruleEntity ) )
            // InternalKlangParser.g:4545:2: ( ruleEntity )
            {
            // InternalKlangParser.g:4545:2: ( ruleEntity )
            // InternalKlangParser.g:4546:3: ruleEntity
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
    // InternalKlangParser.g:4555:1: rule__Actor__VariableDeclarationsAssignment_3 : ( ruleVariable ) ;
    public final void rule__Actor__VariableDeclarationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4559:1: ( ( ruleVariable ) )
            // InternalKlangParser.g:4560:2: ( ruleVariable )
            {
            // InternalKlangParser.g:4560:2: ( ruleVariable )
            // InternalKlangParser.g:4561:3: ruleVariable
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
    // InternalKlangParser.g:4570:1: rule__Actor__EventHandlersAssignment_4 : ( ruleEventHandler ) ;
    public final void rule__Actor__EventHandlersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4574:1: ( ( ruleEventHandler ) )
            // InternalKlangParser.g:4575:2: ( ruleEventHandler )
            {
            // InternalKlangParser.g:4575:2: ( ruleEventHandler )
            // InternalKlangParser.g:4576:3: ruleEventHandler
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
    // InternalKlangParser.g:4585:1: rule__Entity__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4589:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:4590:2: ( RULE_ID )
            {
            // InternalKlangParser.g:4590:2: ( RULE_ID )
            // InternalKlangParser.g:4591:3: RULE_ID
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
    // InternalKlangParser.g:4600:1: rule__GameStart__StatementsAssignment_5 : ( ruleStatement ) ;
    public final void rule__GameStart__StatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4604:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:4605:2: ( ruleStatement )
            {
            // InternalKlangParser.g:4605:2: ( ruleStatement )
            // InternalKlangParser.g:4606:3: ruleStatement
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


    // $ANTLR start "rule__SpriteClicked__StatementsAssignment_6"
    // InternalKlangParser.g:4615:1: rule__SpriteClicked__StatementsAssignment_6 : ( ruleStatement ) ;
    public final void rule__SpriteClicked__StatementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4619:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:4620:2: ( ruleStatement )
            {
            // InternalKlangParser.g:4620:2: ( ruleStatement )
            // InternalKlangParser.g:4621:3: ruleStatement
            {
             before(grammarAccess.getSpriteClickedAccess().getStatementsStatementParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getSpriteClickedAccess().getStatementsStatementParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__SpriteClicked__StatementsAssignment_6"


    // $ANTLR start "rule__KeyPressed__KeyAssignment_2"
    // InternalKlangParser.g:4630:1: rule__KeyPressed__KeyAssignment_2 : ( RULE_STRING ) ;
    public final void rule__KeyPressed__KeyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4634:1: ( ( RULE_STRING ) )
            // InternalKlangParser.g:4635:2: ( RULE_STRING )
            {
            // InternalKlangParser.g:4635:2: ( RULE_STRING )
            // InternalKlangParser.g:4636:3: RULE_STRING
            {
             before(grammarAccess.getKeyPressedAccess().getKeySTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getKeyPressedAccess().getKeySTRINGTerminalRuleCall_2_0()); 

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
    // InternalKlangParser.g:4645:1: rule__KeyPressed__StatementsAssignment_6 : ( ruleStatement ) ;
    public final void rule__KeyPressed__StatementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4649:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:4650:2: ( ruleStatement )
            {
            // InternalKlangParser.g:4650:2: ( ruleStatement )
            // InternalKlangParser.g:4651:3: ruleStatement
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
    // InternalKlangParser.g:4660:1: rule__CollidesWith__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__CollidesWith__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4664:1: ( ( ( RULE_ID ) ) )
            // InternalKlangParser.g:4665:2: ( ( RULE_ID ) )
            {
            // InternalKlangParser.g:4665:2: ( ( RULE_ID ) )
            // InternalKlangParser.g:4666:3: ( RULE_ID )
            {
             before(grammarAccess.getCollidesWithAccess().getTargetSpriteEntityCrossReference_4_0()); 
            // InternalKlangParser.g:4667:3: ( RULE_ID )
            // InternalKlangParser.g:4668:4: RULE_ID
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
    // InternalKlangParser.g:4679:1: rule__CollidesWith__StatementsAssignment_6 : ( ruleStatement ) ;
    public final void rule__CollidesWith__StatementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4683:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:4684:2: ( ruleStatement )
            {
            // InternalKlangParser.g:4684:2: ( ruleStatement )
            // InternalKlangParser.g:4685:3: ruleStatement
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
    // InternalKlangParser.g:4694:1: rule__WhileLoop__PredicateAssignment_2 : ( ruleExpression ) ;
    public final void rule__WhileLoop__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4698:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:4699:2: ( ruleExpression )
            {
            // InternalKlangParser.g:4699:2: ( ruleExpression )
            // InternalKlangParser.g:4700:3: ruleExpression
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
    // InternalKlangParser.g:4709:1: rule__WhileLoop__LoopBlockAssignment_4 : ( ruleStatement ) ;
    public final void rule__WhileLoop__LoopBlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4713:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:4714:2: ( ruleStatement )
            {
            // InternalKlangParser.g:4714:2: ( ruleStatement )
            // InternalKlangParser.g:4715:3: ruleStatement
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
    // InternalKlangParser.g:4724:1: rule__If__PredicateAssignment_2 : ( ruleExpression ) ;
    public final void rule__If__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4728:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:4729:2: ( ruleExpression )
            {
            // InternalKlangParser.g:4729:2: ( ruleExpression )
            // InternalKlangParser.g:4730:3: ruleExpression
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
    // InternalKlangParser.g:4739:1: rule__If__IfBlockAssignment_4 : ( ruleStatement ) ;
    public final void rule__If__IfBlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4743:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:4744:2: ( ruleStatement )
            {
            // InternalKlangParser.g:4744:2: ( ruleStatement )
            // InternalKlangParser.g:4745:3: ruleStatement
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


    // $ANTLR start "rule__ForeverLoop__LoopStatementsAssignment_3"
    // InternalKlangParser.g:4754:1: rule__ForeverLoop__LoopStatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__ForeverLoop__LoopStatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4758:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:4759:2: ( ruleStatement )
            {
            // InternalKlangParser.g:4759:2: ( ruleStatement )
            // InternalKlangParser.g:4760:3: ruleStatement
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
    // InternalKlangParser.g:4769:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4773:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:4774:2: ( RULE_ID )
            {
            // InternalKlangParser.g:4774:2: ( RULE_ID )
            // InternalKlangParser.g:4775:3: RULE_ID
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
    // InternalKlangParser.g:4784:1: rule__Variable__ExpressionAssignment_3 : ( ruleExpression ) ;
    public final void rule__Variable__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4788:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:4789:2: ( ruleExpression )
            {
            // InternalKlangParser.g:4789:2: ( ruleExpression )
            // InternalKlangParser.g:4790:3: ruleExpression
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
    // InternalKlangParser.g:4799:1: rule__VariableAssignment__VariableNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__VariableAssignment__VariableNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4803:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:4804:2: ( RULE_ID )
            {
            // InternalKlangParser.g:4804:2: ( RULE_ID )
            // InternalKlangParser.g:4805:3: RULE_ID
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
    // InternalKlangParser.g:4814:1: rule__VariableAssignment__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__VariableAssignment__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4818:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:4819:2: ( ruleExpression )
            {
            // InternalKlangParser.g:4819:2: ( ruleExpression )
            // InternalKlangParser.g:4820:3: ruleExpression
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


    // $ANTLR start "rule__Or__RightAssignment_1_2"
    // InternalKlangParser.g:4829:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4833:1: ( ( ruleAnd ) )
            // InternalKlangParser.g:4834:2: ( ruleAnd )
            {
            // InternalKlangParser.g:4834:2: ( ruleAnd )
            // InternalKlangParser.g:4835:3: ruleAnd
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
    // InternalKlangParser.g:4844:1: rule__And__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4848:1: ( ( ruleComparison ) )
            // InternalKlangParser.g:4849:2: ( ruleComparison )
            {
            // InternalKlangParser.g:4849:2: ( ruleComparison )
            // InternalKlangParser.g:4850:3: ruleComparison
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
    // InternalKlangParser.g:4859:1: rule__Plus__RightAssignment_1_2 : ( ruleMinus ) ;
    public final void rule__Plus__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4863:1: ( ( ruleMinus ) )
            // InternalKlangParser.g:4864:2: ( ruleMinus )
            {
            // InternalKlangParser.g:4864:2: ( ruleMinus )
            // InternalKlangParser.g:4865:3: ruleMinus
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
    // InternalKlangParser.g:4874:1: rule__Minus__RightAssignment_1_2 : ( ruleMultiply ) ;
    public final void rule__Minus__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4878:1: ( ( ruleMultiply ) )
            // InternalKlangParser.g:4879:2: ( ruleMultiply )
            {
            // InternalKlangParser.g:4879:2: ( ruleMultiply )
            // InternalKlangParser.g:4880:3: ruleMultiply
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
    // InternalKlangParser.g:4889:1: rule__Multiply__RightAssignment_1_2 : ( ruleDivide ) ;
    public final void rule__Multiply__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4893:1: ( ( ruleDivide ) )
            // InternalKlangParser.g:4894:2: ( ruleDivide )
            {
            // InternalKlangParser.g:4894:2: ( ruleDivide )
            // InternalKlangParser.g:4895:3: ruleDivide
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
    // InternalKlangParser.g:4904:1: rule__Divide__RightAssignment_1_2 : ( rulePrimaryExpression ) ;
    public final void rule__Divide__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4908:1: ( ( rulePrimaryExpression ) )
            // InternalKlangParser.g:4909:2: ( rulePrimaryExpression )
            {
            // InternalKlangParser.g:4909:2: ( rulePrimaryExpression )
            // InternalKlangParser.g:4910:3: rulePrimaryExpression
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
    // InternalKlangParser.g:4919:1: rule__Comparison__RightAssignment_1_1 : ( rulePlus ) ;
    public final void rule__Comparison__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4923:1: ( ( rulePlus ) )
            // InternalKlangParser.g:4924:2: ( rulePlus )
            {
            // InternalKlangParser.g:4924:2: ( rulePlus )
            // InternalKlangParser.g:4925:3: rulePlus
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


    // $ANTLR start "rule__FunctionCall__NameAssignment_2"
    // InternalKlangParser.g:4934:1: rule__FunctionCall__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__FunctionCall__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4938:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:4939:2: ( RULE_ID )
            {
            // InternalKlangParser.g:4939:2: ( RULE_ID )
            // InternalKlangParser.g:4940:3: RULE_ID
            {
             before(grammarAccess.getFunctionCallAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__FunctionCall__NameAssignment_2"


    // $ANTLR start "rule__FunctionCall__ParametersAssignment_4_0"
    // InternalKlangParser.g:4949:1: rule__FunctionCall__ParametersAssignment_4_0 : ( ruleExpression ) ;
    public final void rule__FunctionCall__ParametersAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4953:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:4954:2: ( ruleExpression )
            {
            // InternalKlangParser.g:4954:2: ( ruleExpression )
            // InternalKlangParser.g:4955:3: ruleExpression
            {
             before(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__FunctionCall__ParametersAssignment_4_0"


    // $ANTLR start "rule__FunctionCall__ParametersAssignment_4_1_1"
    // InternalKlangParser.g:4964:1: rule__FunctionCall__ParametersAssignment_4_1_1 : ( ruleExpression ) ;
    public final void rule__FunctionCall__ParametersAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4968:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:4969:2: ( ruleExpression )
            {
            // InternalKlangParser.g:4969:2: ( ruleExpression )
            // InternalKlangParser.g:4970:3: ruleExpression
            {
             before(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_4_1_1_0()); 

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
    // $ANTLR end "rule__FunctionCall__ParametersAssignment_4_1_1"


    // $ANTLR start "rule__PrimaryExpression__ExpressionAssignment_1_2"
    // InternalKlangParser.g:4979:1: rule__PrimaryExpression__ExpressionAssignment_1_2 : ( rulePrimaryExpression ) ;
    public final void rule__PrimaryExpression__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4983:1: ( ( rulePrimaryExpression ) )
            // InternalKlangParser.g:4984:2: ( rulePrimaryExpression )
            {
            // InternalKlangParser.g:4984:2: ( rulePrimaryExpression )
            // InternalKlangParser.g:4985:3: rulePrimaryExpression
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
    // InternalKlangParser.g:4994:1: rule__AtomicExpression__ValueAssignment_0_1_0 : ( ( True ) ) ;
    public final void rule__AtomicExpression__ValueAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4998:1: ( ( ( True ) ) )
            // InternalKlangParser.g:4999:2: ( ( True ) )
            {
            // InternalKlangParser.g:4999:2: ( ( True ) )
            // InternalKlangParser.g:5000:3: ( True )
            {
             before(grammarAccess.getAtomicExpressionAccess().getValueTrueKeyword_0_1_0_0()); 
            // InternalKlangParser.g:5001:3: ( True )
            // InternalKlangParser.g:5002:4: True
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
    // InternalKlangParser.g:5013:1: rule__AtomicExpression__ValueAssignment_1_1 : ( RULE_DECIMAL ) ;
    public final void rule__AtomicExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5017:1: ( ( RULE_DECIMAL ) )
            // InternalKlangParser.g:5018:2: ( RULE_DECIMAL )
            {
            // InternalKlangParser.g:5018:2: ( RULE_DECIMAL )
            // InternalKlangParser.g:5019:3: RULE_DECIMAL
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
    // InternalKlangParser.g:5028:1: rule__AtomicExpression__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__AtomicExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5032:1: ( ( RULE_STRING ) )
            // InternalKlangParser.g:5033:2: ( RULE_STRING )
            {
            // InternalKlangParser.g:5033:2: ( RULE_STRING )
            // InternalKlangParser.g:5034:3: RULE_STRING
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
    // InternalKlangParser.g:5043:1: rule__AtomicExpression__VariableNameAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__AtomicExpression__VariableNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5047:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:5048:2: ( RULE_ID )
            {
            // InternalKlangParser.g:5048:2: ( RULE_ID )
            // InternalKlangParser.g:5049:3: RULE_ID
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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000004000420000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000024101001040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000020101001042L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000070105211440L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000001400800000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000001400800002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000020101001040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000007010D211440L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000010400L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000010000000000L});

}