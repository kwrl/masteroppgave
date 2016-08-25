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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Collides", "Clicked", "Forever", "Pressed", "Double", "Sprite", "Starts", "False", "Sleep", "While", "Else", "Game", "True", "When", "With", "And", "Int", "Key", "Not", "Var", "EqualsSignEqualsSign", "If", "Or", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "LessThanSign", "EqualsSign", "GreaterThanSign", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Or=26;
    public static final int RULE_BEGIN=38;
    public static final int Clicked=5;
    public static final int Var=23;
    public static final int True=16;
    public static final int False=11;
    public static final int LessThanSign=35;
    public static final int Forever=6;
    public static final int LeftParenthesis=27;
    public static final int GreaterThanSign=37;
    public static final int RULE_ID=40;
    public static final int Collides=4;
    public static final int RightParenthesis=28;
    public static final int Double=8;
    public static final int EqualsSignEqualsSign=24;
    public static final int Not=22;
    public static final int Game=15;
    public static final int And=19;
    public static final int PlusSign=30;
    public static final int RULE_INT=41;
    public static final int RULE_ML_COMMENT=43;
    public static final int If=25;
    public static final int Key=21;
    public static final int Pressed=7;
    public static final int RULE_END=39;
    public static final int Starts=10;
    public static final int RULE_STRING=42;
    public static final int Int=20;
    public static final int With=18;
    public static final int RULE_SL_COMMENT=44;
    public static final int Comma=31;
    public static final int EqualsSign=36;
    public static final int HyphenMinus=32;
    public static final int Solidus=34;
    public static final int EOF=-1;
    public static final int Asterisk=29;
    public static final int FullStop=33;
    public static final int Sprite=9;
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
    		tokenNameToValue.put("FullStop", "'.'");
    		tokenNameToValue.put("Solidus", "'/'");
    		tokenNameToValue.put("LessThanSign", "'<'");
    		tokenNameToValue.put("EqualsSign", "'='");
    		tokenNameToValue.put("GreaterThanSign", "'>'");
    		tokenNameToValue.put("EqualsSignEqualsSign", "'=='");
    		tokenNameToValue.put("If", "'if'");
    		tokenNameToValue.put("Or", "'or'");
    		tokenNameToValue.put("And", "'and'");
    		tokenNameToValue.put("Int", "'int'");
    		tokenNameToValue.put("Key", "'key'");
    		tokenNameToValue.put("Not", "'not'");
    		tokenNameToValue.put("Var", "'var'");
    		tokenNameToValue.put("Else", "'else'");
    		tokenNameToValue.put("Game", "'game'");
    		tokenNameToValue.put("True", "'true'");
    		tokenNameToValue.put("When", "'when'");
    		tokenNameToValue.put("With", "'with'");
    		tokenNameToValue.put("False", "'false'");
    		tokenNameToValue.put("Sleep", "'sleep'");
    		tokenNameToValue.put("While", "'while'");
    		tokenNameToValue.put("Double", "'double'");
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



    // $ANTLR start "entryRuleSceneActor"
    // InternalKlangParser.g:89:1: entryRuleSceneActor : ruleSceneActor EOF ;
    public final void entryRuleSceneActor() throws RecognitionException {
        try {
            // InternalKlangParser.g:90:1: ( ruleSceneActor EOF )
            // InternalKlangParser.g:91:1: ruleSceneActor EOF
            {
             before(grammarAccess.getSceneActorRule()); 
            pushFollow(FOLLOW_1);
            ruleSceneActor();

            state._fsp--;

             after(grammarAccess.getSceneActorRule()); 
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
    // $ANTLR end "entryRuleSceneActor"


    // $ANTLR start "ruleSceneActor"
    // InternalKlangParser.g:98:1: ruleSceneActor : ( ( rule__SceneActor__Group__0 ) ) ;
    public final void ruleSceneActor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:102:2: ( ( ( rule__SceneActor__Group__0 ) ) )
            // InternalKlangParser.g:103:2: ( ( rule__SceneActor__Group__0 ) )
            {
            // InternalKlangParser.g:103:2: ( ( rule__SceneActor__Group__0 ) )
            // InternalKlangParser.g:104:3: ( rule__SceneActor__Group__0 )
            {
             before(grammarAccess.getSceneActorAccess().getGroup()); 
            // InternalKlangParser.g:105:3: ( rule__SceneActor__Group__0 )
            // InternalKlangParser.g:105:4: rule__SceneActor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SceneActor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSceneActorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSceneActor"


    // $ANTLR start "entryRuleSpriteActor"
    // InternalKlangParser.g:114:1: entryRuleSpriteActor : ruleSpriteActor EOF ;
    public final void entryRuleSpriteActor() throws RecognitionException {
        try {
            // InternalKlangParser.g:115:1: ( ruleSpriteActor EOF )
            // InternalKlangParser.g:116:1: ruleSpriteActor EOF
            {
             before(grammarAccess.getSpriteActorRule()); 
            pushFollow(FOLLOW_1);
            ruleSpriteActor();

            state._fsp--;

             after(grammarAccess.getSpriteActorRule()); 
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
    // $ANTLR end "entryRuleSpriteActor"


    // $ANTLR start "ruleSpriteActor"
    // InternalKlangParser.g:123:1: ruleSpriteActor : ( ( rule__SpriteActor__Group__0 ) ) ;
    public final void ruleSpriteActor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:127:2: ( ( ( rule__SpriteActor__Group__0 ) ) )
            // InternalKlangParser.g:128:2: ( ( rule__SpriteActor__Group__0 ) )
            {
            // InternalKlangParser.g:128:2: ( ( rule__SpriteActor__Group__0 ) )
            // InternalKlangParser.g:129:3: ( rule__SpriteActor__Group__0 )
            {
             before(grammarAccess.getSpriteActorAccess().getGroup()); 
            // InternalKlangParser.g:130:3: ( rule__SpriteActor__Group__0 )
            // InternalKlangParser.g:130:4: rule__SpriteActor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SpriteActor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpriteActorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpriteActor"


    // $ANTLR start "entryRuleEventHandler"
    // InternalKlangParser.g:139:1: entryRuleEventHandler : ruleEventHandler EOF ;
    public final void entryRuleEventHandler() throws RecognitionException {
        try {
            // InternalKlangParser.g:140:1: ( ruleEventHandler EOF )
            // InternalKlangParser.g:141:1: ruleEventHandler EOF
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
    // InternalKlangParser.g:148:1: ruleEventHandler : ( ( rule__EventHandler__Alternatives ) ) ;
    public final void ruleEventHandler() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:152:2: ( ( ( rule__EventHandler__Alternatives ) ) )
            // InternalKlangParser.g:153:2: ( ( rule__EventHandler__Alternatives ) )
            {
            // InternalKlangParser.g:153:2: ( ( rule__EventHandler__Alternatives ) )
            // InternalKlangParser.g:154:3: ( rule__EventHandler__Alternatives )
            {
             before(grammarAccess.getEventHandlerAccess().getAlternatives()); 
            // InternalKlangParser.g:155:3: ( rule__EventHandler__Alternatives )
            // InternalKlangParser.g:155:4: rule__EventHandler__Alternatives
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
    // InternalKlangParser.g:164:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalKlangParser.g:165:1: ( ruleStatement EOF )
            // InternalKlangParser.g:166:1: ruleStatement EOF
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
    // InternalKlangParser.g:173:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:177:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalKlangParser.g:178:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalKlangParser.g:178:2: ( ( rule__Statement__Alternatives ) )
            // InternalKlangParser.g:179:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalKlangParser.g:180:3: ( rule__Statement__Alternatives )
            // InternalKlangParser.g:180:4: rule__Statement__Alternatives
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
    // InternalKlangParser.g:189:1: entryRuleGameStart : ruleGameStart EOF ;
    public final void entryRuleGameStart() throws RecognitionException {
        try {
            // InternalKlangParser.g:190:1: ( ruleGameStart EOF )
            // InternalKlangParser.g:191:1: ruleGameStart EOF
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
    // InternalKlangParser.g:198:1: ruleGameStart : ( ( rule__GameStart__Group__0 ) ) ;
    public final void ruleGameStart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:202:2: ( ( ( rule__GameStart__Group__0 ) ) )
            // InternalKlangParser.g:203:2: ( ( rule__GameStart__Group__0 ) )
            {
            // InternalKlangParser.g:203:2: ( ( rule__GameStart__Group__0 ) )
            // InternalKlangParser.g:204:3: ( rule__GameStart__Group__0 )
            {
             before(grammarAccess.getGameStartAccess().getGroup()); 
            // InternalKlangParser.g:205:3: ( rule__GameStart__Group__0 )
            // InternalKlangParser.g:205:4: rule__GameStart__Group__0
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
    // InternalKlangParser.g:214:1: entryRuleSpriteClicked : ruleSpriteClicked EOF ;
    public final void entryRuleSpriteClicked() throws RecognitionException {
        try {
            // InternalKlangParser.g:215:1: ( ruleSpriteClicked EOF )
            // InternalKlangParser.g:216:1: ruleSpriteClicked EOF
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
    // InternalKlangParser.g:223:1: ruleSpriteClicked : ( ( rule__SpriteClicked__Group__0 ) ) ;
    public final void ruleSpriteClicked() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:227:2: ( ( ( rule__SpriteClicked__Group__0 ) ) )
            // InternalKlangParser.g:228:2: ( ( rule__SpriteClicked__Group__0 ) )
            {
            // InternalKlangParser.g:228:2: ( ( rule__SpriteClicked__Group__0 ) )
            // InternalKlangParser.g:229:3: ( rule__SpriteClicked__Group__0 )
            {
             before(grammarAccess.getSpriteClickedAccess().getGroup()); 
            // InternalKlangParser.g:230:3: ( rule__SpriteClicked__Group__0 )
            // InternalKlangParser.g:230:4: rule__SpriteClicked__Group__0
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
    // InternalKlangParser.g:239:1: entryRuleKeyPressed : ruleKeyPressed EOF ;
    public final void entryRuleKeyPressed() throws RecognitionException {
        try {
            // InternalKlangParser.g:240:1: ( ruleKeyPressed EOF )
            // InternalKlangParser.g:241:1: ruleKeyPressed EOF
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
    // InternalKlangParser.g:248:1: ruleKeyPressed : ( ( rule__KeyPressed__Group__0 ) ) ;
    public final void ruleKeyPressed() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:252:2: ( ( ( rule__KeyPressed__Group__0 ) ) )
            // InternalKlangParser.g:253:2: ( ( rule__KeyPressed__Group__0 ) )
            {
            // InternalKlangParser.g:253:2: ( ( rule__KeyPressed__Group__0 ) )
            // InternalKlangParser.g:254:3: ( rule__KeyPressed__Group__0 )
            {
             before(grammarAccess.getKeyPressedAccess().getGroup()); 
            // InternalKlangParser.g:255:3: ( rule__KeyPressed__Group__0 )
            // InternalKlangParser.g:255:4: rule__KeyPressed__Group__0
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
    // InternalKlangParser.g:264:1: entryRuleCollidesWith : ruleCollidesWith EOF ;
    public final void entryRuleCollidesWith() throws RecognitionException {
        try {
            // InternalKlangParser.g:265:1: ( ruleCollidesWith EOF )
            // InternalKlangParser.g:266:1: ruleCollidesWith EOF
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
    // InternalKlangParser.g:273:1: ruleCollidesWith : ( ( rule__CollidesWith__Group__0 ) ) ;
    public final void ruleCollidesWith() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:277:2: ( ( ( rule__CollidesWith__Group__0 ) ) )
            // InternalKlangParser.g:278:2: ( ( rule__CollidesWith__Group__0 ) )
            {
            // InternalKlangParser.g:278:2: ( ( rule__CollidesWith__Group__0 ) )
            // InternalKlangParser.g:279:3: ( rule__CollidesWith__Group__0 )
            {
             before(grammarAccess.getCollidesWithAccess().getGroup()); 
            // InternalKlangParser.g:280:3: ( rule__CollidesWith__Group__0 )
            // InternalKlangParser.g:280:4: rule__CollidesWith__Group__0
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
    // InternalKlangParser.g:289:1: entryRuleWhileLoop : ruleWhileLoop EOF ;
    public final void entryRuleWhileLoop() throws RecognitionException {
        try {
            // InternalKlangParser.g:290:1: ( ruleWhileLoop EOF )
            // InternalKlangParser.g:291:1: ruleWhileLoop EOF
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
    // InternalKlangParser.g:298:1: ruleWhileLoop : ( ( rule__WhileLoop__Group__0 ) ) ;
    public final void ruleWhileLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:302:2: ( ( ( rule__WhileLoop__Group__0 ) ) )
            // InternalKlangParser.g:303:2: ( ( rule__WhileLoop__Group__0 ) )
            {
            // InternalKlangParser.g:303:2: ( ( rule__WhileLoop__Group__0 ) )
            // InternalKlangParser.g:304:3: ( rule__WhileLoop__Group__0 )
            {
             before(grammarAccess.getWhileLoopAccess().getGroup()); 
            // InternalKlangParser.g:305:3: ( rule__WhileLoop__Group__0 )
            // InternalKlangParser.g:305:4: rule__WhileLoop__Group__0
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
    // InternalKlangParser.g:314:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // InternalKlangParser.g:315:1: ( ruleIf EOF )
            // InternalKlangParser.g:316:1: ruleIf EOF
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
    // InternalKlangParser.g:323:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:327:2: ( ( ( rule__If__Group__0 ) ) )
            // InternalKlangParser.g:328:2: ( ( rule__If__Group__0 ) )
            {
            // InternalKlangParser.g:328:2: ( ( rule__If__Group__0 ) )
            // InternalKlangParser.g:329:3: ( rule__If__Group__0 )
            {
             before(grammarAccess.getIfAccess().getGroup()); 
            // InternalKlangParser.g:330:3: ( rule__If__Group__0 )
            // InternalKlangParser.g:330:4: rule__If__Group__0
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
    // InternalKlangParser.g:339:1: entryRuleForeverLoop : ruleForeverLoop EOF ;
    public final void entryRuleForeverLoop() throws RecognitionException {
        try {
            // InternalKlangParser.g:340:1: ( ruleForeverLoop EOF )
            // InternalKlangParser.g:341:1: ruleForeverLoop EOF
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
    // InternalKlangParser.g:348:1: ruleForeverLoop : ( ( rule__ForeverLoop__Group__0 ) ) ;
    public final void ruleForeverLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:352:2: ( ( ( rule__ForeverLoop__Group__0 ) ) )
            // InternalKlangParser.g:353:2: ( ( rule__ForeverLoop__Group__0 ) )
            {
            // InternalKlangParser.g:353:2: ( ( rule__ForeverLoop__Group__0 ) )
            // InternalKlangParser.g:354:3: ( rule__ForeverLoop__Group__0 )
            {
             before(grammarAccess.getForeverLoopAccess().getGroup()); 
            // InternalKlangParser.g:355:3: ( rule__ForeverLoop__Group__0 )
            // InternalKlangParser.g:355:4: rule__ForeverLoop__Group__0
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


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalKlangParser.g:364:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // InternalKlangParser.g:365:1: ( ruleVariableDeclaration EOF )
            // InternalKlangParser.g:366:1: ruleVariableDeclaration EOF
            {
             before(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationRule()); 
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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalKlangParser.g:373:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:377:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // InternalKlangParser.g:378:2: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // InternalKlangParser.g:378:2: ( ( rule__VariableDeclaration__Group__0 ) )
            // InternalKlangParser.g:379:3: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // InternalKlangParser.g:380:3: ( rule__VariableDeclaration__Group__0 )
            // InternalKlangParser.g:380:4: rule__VariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleVariableAssignment"
    // InternalKlangParser.g:389:1: entryRuleVariableAssignment : ruleVariableAssignment EOF ;
    public final void entryRuleVariableAssignment() throws RecognitionException {
        try {
            // InternalKlangParser.g:390:1: ( ruleVariableAssignment EOF )
            // InternalKlangParser.g:391:1: ruleVariableAssignment EOF
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
    // InternalKlangParser.g:398:1: ruleVariableAssignment : ( ( rule__VariableAssignment__Group__0 ) ) ;
    public final void ruleVariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:402:2: ( ( ( rule__VariableAssignment__Group__0 ) ) )
            // InternalKlangParser.g:403:2: ( ( rule__VariableAssignment__Group__0 ) )
            {
            // InternalKlangParser.g:403:2: ( ( rule__VariableAssignment__Group__0 ) )
            // InternalKlangParser.g:404:3: ( rule__VariableAssignment__Group__0 )
            {
             before(grammarAccess.getVariableAssignmentAccess().getGroup()); 
            // InternalKlangParser.g:405:3: ( rule__VariableAssignment__Group__0 )
            // InternalKlangParser.g:405:4: rule__VariableAssignment__Group__0
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
    // InternalKlangParser.g:414:1: entryRuleSleep : ruleSleep EOF ;
    public final void entryRuleSleep() throws RecognitionException {
        try {
            // InternalKlangParser.g:415:1: ( ruleSleep EOF )
            // InternalKlangParser.g:416:1: ruleSleep EOF
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
    // InternalKlangParser.g:423:1: ruleSleep : ( ( rule__Sleep__Group__0 ) ) ;
    public final void ruleSleep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:427:2: ( ( ( rule__Sleep__Group__0 ) ) )
            // InternalKlangParser.g:428:2: ( ( rule__Sleep__Group__0 ) )
            {
            // InternalKlangParser.g:428:2: ( ( rule__Sleep__Group__0 ) )
            // InternalKlangParser.g:429:3: ( rule__Sleep__Group__0 )
            {
             before(grammarAccess.getSleepAccess().getGroup()); 
            // InternalKlangParser.g:430:3: ( rule__Sleep__Group__0 )
            // InternalKlangParser.g:430:4: rule__Sleep__Group__0
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
    // InternalKlangParser.g:439:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalKlangParser.g:440:1: ( ruleExpression EOF )
            // InternalKlangParser.g:441:1: ruleExpression EOF
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
    // InternalKlangParser.g:448:1: ruleExpression : ( ruleOr ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:452:2: ( ( ruleOr ) )
            // InternalKlangParser.g:453:2: ( ruleOr )
            {
            // InternalKlangParser.g:453:2: ( ruleOr )
            // InternalKlangParser.g:454:3: ruleOr
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
    // InternalKlangParser.g:464:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalKlangParser.g:465:1: ( ruleOr EOF )
            // InternalKlangParser.g:466:1: ruleOr EOF
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
    // InternalKlangParser.g:473:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:477:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalKlangParser.g:478:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalKlangParser.g:478:2: ( ( rule__Or__Group__0 ) )
            // InternalKlangParser.g:479:3: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // InternalKlangParser.g:480:3: ( rule__Or__Group__0 )
            // InternalKlangParser.g:480:4: rule__Or__Group__0
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
    // InternalKlangParser.g:489:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalKlangParser.g:490:1: ( ruleAnd EOF )
            // InternalKlangParser.g:491:1: ruleAnd EOF
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
    // InternalKlangParser.g:498:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:502:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalKlangParser.g:503:2: ( ( rule__And__Group__0 ) )
            {
            // InternalKlangParser.g:503:2: ( ( rule__And__Group__0 ) )
            // InternalKlangParser.g:504:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalKlangParser.g:505:3: ( rule__And__Group__0 )
            // InternalKlangParser.g:505:4: rule__And__Group__0
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
    // InternalKlangParser.g:514:1: entryRulePlus : rulePlus EOF ;
    public final void entryRulePlus() throws RecognitionException {
        try {
            // InternalKlangParser.g:515:1: ( rulePlus EOF )
            // InternalKlangParser.g:516:1: rulePlus EOF
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
    // InternalKlangParser.g:523:1: rulePlus : ( ( rule__Plus__Group__0 ) ) ;
    public final void rulePlus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:527:2: ( ( ( rule__Plus__Group__0 ) ) )
            // InternalKlangParser.g:528:2: ( ( rule__Plus__Group__0 ) )
            {
            // InternalKlangParser.g:528:2: ( ( rule__Plus__Group__0 ) )
            // InternalKlangParser.g:529:3: ( rule__Plus__Group__0 )
            {
             before(grammarAccess.getPlusAccess().getGroup()); 
            // InternalKlangParser.g:530:3: ( rule__Plus__Group__0 )
            // InternalKlangParser.g:530:4: rule__Plus__Group__0
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
    // InternalKlangParser.g:539:1: entryRuleMinus : ruleMinus EOF ;
    public final void entryRuleMinus() throws RecognitionException {
        try {
            // InternalKlangParser.g:540:1: ( ruleMinus EOF )
            // InternalKlangParser.g:541:1: ruleMinus EOF
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
    // InternalKlangParser.g:548:1: ruleMinus : ( ( rule__Minus__Group__0 ) ) ;
    public final void ruleMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:552:2: ( ( ( rule__Minus__Group__0 ) ) )
            // InternalKlangParser.g:553:2: ( ( rule__Minus__Group__0 ) )
            {
            // InternalKlangParser.g:553:2: ( ( rule__Minus__Group__0 ) )
            // InternalKlangParser.g:554:3: ( rule__Minus__Group__0 )
            {
             before(grammarAccess.getMinusAccess().getGroup()); 
            // InternalKlangParser.g:555:3: ( rule__Minus__Group__0 )
            // InternalKlangParser.g:555:4: rule__Minus__Group__0
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
    // InternalKlangParser.g:564:1: entryRuleMultiply : ruleMultiply EOF ;
    public final void entryRuleMultiply() throws RecognitionException {
        try {
            // InternalKlangParser.g:565:1: ( ruleMultiply EOF )
            // InternalKlangParser.g:566:1: ruleMultiply EOF
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
    // InternalKlangParser.g:573:1: ruleMultiply : ( ( rule__Multiply__Group__0 ) ) ;
    public final void ruleMultiply() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:577:2: ( ( ( rule__Multiply__Group__0 ) ) )
            // InternalKlangParser.g:578:2: ( ( rule__Multiply__Group__0 ) )
            {
            // InternalKlangParser.g:578:2: ( ( rule__Multiply__Group__0 ) )
            // InternalKlangParser.g:579:3: ( rule__Multiply__Group__0 )
            {
             before(grammarAccess.getMultiplyAccess().getGroup()); 
            // InternalKlangParser.g:580:3: ( rule__Multiply__Group__0 )
            // InternalKlangParser.g:580:4: rule__Multiply__Group__0
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
    // InternalKlangParser.g:589:1: entryRuleDivide : ruleDivide EOF ;
    public final void entryRuleDivide() throws RecognitionException {
        try {
            // InternalKlangParser.g:590:1: ( ruleDivide EOF )
            // InternalKlangParser.g:591:1: ruleDivide EOF
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
    // InternalKlangParser.g:598:1: ruleDivide : ( ( rule__Divide__Group__0 ) ) ;
    public final void ruleDivide() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:602:2: ( ( ( rule__Divide__Group__0 ) ) )
            // InternalKlangParser.g:603:2: ( ( rule__Divide__Group__0 ) )
            {
            // InternalKlangParser.g:603:2: ( ( rule__Divide__Group__0 ) )
            // InternalKlangParser.g:604:3: ( rule__Divide__Group__0 )
            {
             before(grammarAccess.getDivideAccess().getGroup()); 
            // InternalKlangParser.g:605:3: ( rule__Divide__Group__0 )
            // InternalKlangParser.g:605:4: rule__Divide__Group__0
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
    // InternalKlangParser.g:614:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalKlangParser.g:615:1: ( ruleComparison EOF )
            // InternalKlangParser.g:616:1: ruleComparison EOF
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
    // InternalKlangParser.g:623:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:627:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalKlangParser.g:628:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalKlangParser.g:628:2: ( ( rule__Comparison__Group__0 ) )
            // InternalKlangParser.g:629:3: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // InternalKlangParser.g:630:3: ( rule__Comparison__Group__0 )
            // InternalKlangParser.g:630:4: rule__Comparison__Group__0
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
    // InternalKlangParser.g:639:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // InternalKlangParser.g:640:1: ( ruleFunctionCall EOF )
            // InternalKlangParser.g:641:1: ruleFunctionCall EOF
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
    // InternalKlangParser.g:648:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:652:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // InternalKlangParser.g:653:2: ( ( rule__FunctionCall__Group__0 ) )
            {
            // InternalKlangParser.g:653:2: ( ( rule__FunctionCall__Group__0 ) )
            // InternalKlangParser.g:654:3: ( rule__FunctionCall__Group__0 )
            {
             before(grammarAccess.getFunctionCallAccess().getGroup()); 
            // InternalKlangParser.g:655:3: ( rule__FunctionCall__Group__0 )
            // InternalKlangParser.g:655:4: rule__FunctionCall__Group__0
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
    // InternalKlangParser.g:664:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalKlangParser.g:665:1: ( rulePrimaryExpression EOF )
            // InternalKlangParser.g:666:1: rulePrimaryExpression EOF
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
    // InternalKlangParser.g:673:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:677:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalKlangParser.g:678:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalKlangParser.g:678:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalKlangParser.g:679:3: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // InternalKlangParser.g:680:3: ( rule__PrimaryExpression__Alternatives )
            // InternalKlangParser.g:680:4: rule__PrimaryExpression__Alternatives
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
    // InternalKlangParser.g:689:1: entryRuleAtomicExpression : ruleAtomicExpression EOF ;
    public final void entryRuleAtomicExpression() throws RecognitionException {
        try {
            // InternalKlangParser.g:690:1: ( ruleAtomicExpression EOF )
            // InternalKlangParser.g:691:1: ruleAtomicExpression EOF
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
    // InternalKlangParser.g:698:1: ruleAtomicExpression : ( ( rule__AtomicExpression__Alternatives ) ) ;
    public final void ruleAtomicExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:702:2: ( ( ( rule__AtomicExpression__Alternatives ) ) )
            // InternalKlangParser.g:703:2: ( ( rule__AtomicExpression__Alternatives ) )
            {
            // InternalKlangParser.g:703:2: ( ( rule__AtomicExpression__Alternatives ) )
            // InternalKlangParser.g:704:3: ( rule__AtomicExpression__Alternatives )
            {
             before(grammarAccess.getAtomicExpressionAccess().getAlternatives()); 
            // InternalKlangParser.g:705:3: ( rule__AtomicExpression__Alternatives )
            // InternalKlangParser.g:705:4: rule__AtomicExpression__Alternatives
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


    // $ANTLR start "entryRuleDECIMAL"
    // InternalKlangParser.g:714:1: entryRuleDECIMAL : ruleDECIMAL EOF ;
    public final void entryRuleDECIMAL() throws RecognitionException {
        try {
            // InternalKlangParser.g:715:1: ( ruleDECIMAL EOF )
            // InternalKlangParser.g:716:1: ruleDECIMAL EOF
            {
             before(grammarAccess.getDECIMALRule()); 
            pushFollow(FOLLOW_1);
            ruleDECIMAL();

            state._fsp--;

             after(grammarAccess.getDECIMALRule()); 
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
    // $ANTLR end "entryRuleDECIMAL"


    // $ANTLR start "ruleDECIMAL"
    // InternalKlangParser.g:723:1: ruleDECIMAL : ( ( rule__DECIMAL__Group__0 ) ) ;
    public final void ruleDECIMAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:727:2: ( ( ( rule__DECIMAL__Group__0 ) ) )
            // InternalKlangParser.g:728:2: ( ( rule__DECIMAL__Group__0 ) )
            {
            // InternalKlangParser.g:728:2: ( ( rule__DECIMAL__Group__0 ) )
            // InternalKlangParser.g:729:3: ( rule__DECIMAL__Group__0 )
            {
             before(grammarAccess.getDECIMALAccess().getGroup()); 
            // InternalKlangParser.g:730:3: ( rule__DECIMAL__Group__0 )
            // InternalKlangParser.g:730:4: rule__DECIMAL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDECIMALAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDECIMAL"


    // $ANTLR start "rule__EventHandler__Alternatives"
    // InternalKlangParser.g:738:1: rule__EventHandler__Alternatives : ( ( ruleGameStart ) | ( ruleSpriteClicked ) | ( ruleKeyPressed ) | ( ruleCollidesWith ) );
    public final void rule__EventHandler__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:742:1: ( ( ruleGameStart ) | ( ruleSpriteClicked ) | ( ruleKeyPressed ) | ( ruleCollidesWith ) )
            int alt1=4;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==When) ) {
                switch ( input.LA(2) ) {
                case Game:
                    {
                    alt1=1;
                    }
                    break;
                case Collides:
                    {
                    alt1=4;
                    }
                    break;
                case RULE_ID:
                    {
                    alt1=3;
                    }
                    break;
                case Clicked:
                    {
                    alt1=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalKlangParser.g:743:2: ( ruleGameStart )
                    {
                    // InternalKlangParser.g:743:2: ( ruleGameStart )
                    // InternalKlangParser.g:744:3: ruleGameStart
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
                    // InternalKlangParser.g:749:2: ( ruleSpriteClicked )
                    {
                    // InternalKlangParser.g:749:2: ( ruleSpriteClicked )
                    // InternalKlangParser.g:750:3: ruleSpriteClicked
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
                    // InternalKlangParser.g:755:2: ( ruleKeyPressed )
                    {
                    // InternalKlangParser.g:755:2: ( ruleKeyPressed )
                    // InternalKlangParser.g:756:3: ruleKeyPressed
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
                    // InternalKlangParser.g:761:2: ( ruleCollidesWith )
                    {
                    // InternalKlangParser.g:761:2: ( ruleCollidesWith )
                    // InternalKlangParser.g:762:3: ruleCollidesWith
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
    // InternalKlangParser.g:771:1: rule__Statement__Alternatives : ( ( ruleWhileLoop ) | ( ruleIf ) | ( ruleVariableAssignment ) | ( ruleForeverLoop ) | ( ruleFunctionCall ) | ( ruleSleep ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:775:1: ( ( ruleWhileLoop ) | ( ruleIf ) | ( ruleVariableAssignment ) | ( ruleForeverLoop ) | ( ruleFunctionCall ) | ( ruleSleep ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case While:
                {
                alt2=1;
                }
                break;
            case If:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==LeftParenthesis) ) {
                    alt2=5;
                }
                else if ( (LA2_3==EqualsSign) ) {
                    alt2=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            case Forever:
                {
                alt2=4;
                }
                break;
            case Sleep:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalKlangParser.g:776:2: ( ruleWhileLoop )
                    {
                    // InternalKlangParser.g:776:2: ( ruleWhileLoop )
                    // InternalKlangParser.g:777:3: ruleWhileLoop
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
                    // InternalKlangParser.g:782:2: ( ruleIf )
                    {
                    // InternalKlangParser.g:782:2: ( ruleIf )
                    // InternalKlangParser.g:783:3: ruleIf
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
                    // InternalKlangParser.g:788:2: ( ruleVariableAssignment )
                    {
                    // InternalKlangParser.g:788:2: ( ruleVariableAssignment )
                    // InternalKlangParser.g:789:3: ruleVariableAssignment
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
                    // InternalKlangParser.g:794:2: ( ruleForeverLoop )
                    {
                    // InternalKlangParser.g:794:2: ( ruleForeverLoop )
                    // InternalKlangParser.g:795:3: ruleForeverLoop
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
                    // InternalKlangParser.g:800:2: ( ruleFunctionCall )
                    {
                    // InternalKlangParser.g:800:2: ( ruleFunctionCall )
                    // InternalKlangParser.g:801:3: ruleFunctionCall
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
                    // InternalKlangParser.g:806:2: ( ruleSleep )
                    {
                    // InternalKlangParser.g:806:2: ( ruleSleep )
                    // InternalKlangParser.g:807:3: ruleSleep
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
    // InternalKlangParser.g:816:1: rule__Comparison__Alternatives_1_0 : ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) | ( ( rule__Comparison__Group_1_0_2__0 ) ) );
    public final void rule__Comparison__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:820:1: ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) | ( ( rule__Comparison__Group_1_0_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case LessThanSign:
                {
                alt3=1;
                }
                break;
            case EqualsSignEqualsSign:
                {
                alt3=2;
                }
                break;
            case GreaterThanSign:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalKlangParser.g:821:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    {
                    // InternalKlangParser.g:821:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    // InternalKlangParser.g:822:3: ( rule__Comparison__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0_0()); 
                    // InternalKlangParser.g:823:3: ( rule__Comparison__Group_1_0_0__0 )
                    // InternalKlangParser.g:823:4: rule__Comparison__Group_1_0_0__0
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
                    // InternalKlangParser.g:827:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    {
                    // InternalKlangParser.g:827:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    // InternalKlangParser.g:828:3: ( rule__Comparison__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0_1()); 
                    // InternalKlangParser.g:829:3: ( rule__Comparison__Group_1_0_1__0 )
                    // InternalKlangParser.g:829:4: rule__Comparison__Group_1_0_1__0
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
                    // InternalKlangParser.g:833:2: ( ( rule__Comparison__Group_1_0_2__0 ) )
                    {
                    // InternalKlangParser.g:833:2: ( ( rule__Comparison__Group_1_0_2__0 ) )
                    // InternalKlangParser.g:834:3: ( rule__Comparison__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0_2()); 
                    // InternalKlangParser.g:835:3: ( rule__Comparison__Group_1_0_2__0 )
                    // InternalKlangParser.g:835:4: rule__Comparison__Group_1_0_2__0
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
    // InternalKlangParser.g:843:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) | ( ruleFunctionCall ) | ( ruleAtomicExpression ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:847:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) | ( ruleFunctionCall ) | ( ruleAtomicExpression ) )
            int alt4=7;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalKlangParser.g:848:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // InternalKlangParser.g:848:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // InternalKlangParser.g:849:3: ( rule__PrimaryExpression__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    // InternalKlangParser.g:850:3: ( rule__PrimaryExpression__Group_0__0 )
                    // InternalKlangParser.g:850:4: rule__PrimaryExpression__Group_0__0
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
                    // InternalKlangParser.g:854:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    {
                    // InternalKlangParser.g:854:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    // InternalKlangParser.g:855:3: ( rule__PrimaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
                    // InternalKlangParser.g:856:3: ( rule__PrimaryExpression__Group_1__0 )
                    // InternalKlangParser.g:856:4: rule__PrimaryExpression__Group_1__0
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
                    // InternalKlangParser.g:860:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    {
                    // InternalKlangParser.g:860:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    // InternalKlangParser.g:861:3: ( rule__PrimaryExpression__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    // InternalKlangParser.g:862:3: ( rule__PrimaryExpression__Group_2__0 )
                    // InternalKlangParser.g:862:4: rule__PrimaryExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalKlangParser.g:866:2: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    {
                    // InternalKlangParser.g:866:2: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    // InternalKlangParser.g:867:3: ( rule__PrimaryExpression__Group_3__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_3()); 
                    // InternalKlangParser.g:868:3: ( rule__PrimaryExpression__Group_3__0 )
                    // InternalKlangParser.g:868:4: rule__PrimaryExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalKlangParser.g:872:2: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    {
                    // InternalKlangParser.g:872:2: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    // InternalKlangParser.g:873:3: ( rule__PrimaryExpression__Group_4__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_4()); 
                    // InternalKlangParser.g:874:3: ( rule__PrimaryExpression__Group_4__0 )
                    // InternalKlangParser.g:874:4: rule__PrimaryExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalKlangParser.g:878:2: ( ruleFunctionCall )
                    {
                    // InternalKlangParser.g:878:2: ( ruleFunctionCall )
                    // InternalKlangParser.g:879:3: ruleFunctionCall
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getFunctionCallParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleFunctionCall();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getFunctionCallParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalKlangParser.g:884:2: ( ruleAtomicExpression )
                    {
                    // InternalKlangParser.g:884:2: ( ruleAtomicExpression )
                    // InternalKlangParser.g:885:3: ruleAtomicExpression
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getAtomicExpressionParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleAtomicExpression();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getAtomicExpressionParserRuleCall_6()); 

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
    // InternalKlangParser.g:894:1: rule__AtomicExpression__Alternatives : ( ( ( rule__AtomicExpression__Group_0__0 ) ) | ( ( rule__AtomicExpression__Group_1__0 ) ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) | ( ( rule__AtomicExpression__Group_4__0 ) ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:898:1: ( ( ( rule__AtomicExpression__Group_0__0 ) ) | ( ( rule__AtomicExpression__Group_1__0 ) ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) | ( ( rule__AtomicExpression__Group_4__0 ) ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case False:
            case True:
                {
                alt5=1;
                }
                break;
            case RULE_INT:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==FullStop) ) {
                    alt5=2;
                }
                else if ( (LA5_2==EOF||LA5_2==Forever||LA5_2==Sprite||(LA5_2>=Sleep && LA5_2<=While)||LA5_2==When||LA5_2==And||(LA5_2>=Var && LA5_2<=Or)||(LA5_2>=RightParenthesis && LA5_2<=HyphenMinus)||(LA5_2>=Solidus && LA5_2<=LessThanSign)||(LA5_2>=GreaterThanSign && LA5_2<=RULE_ID)) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt5=4;
                }
                break;
            case RULE_ID:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalKlangParser.g:899:2: ( ( rule__AtomicExpression__Group_0__0 ) )
                    {
                    // InternalKlangParser.g:899:2: ( ( rule__AtomicExpression__Group_0__0 ) )
                    // InternalKlangParser.g:900:3: ( rule__AtomicExpression__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getGroup_0()); 
                    // InternalKlangParser.g:901:3: ( rule__AtomicExpression__Group_0__0 )
                    // InternalKlangParser.g:901:4: rule__AtomicExpression__Group_0__0
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
                    // InternalKlangParser.g:905:2: ( ( rule__AtomicExpression__Group_1__0 ) )
                    {
                    // InternalKlangParser.g:905:2: ( ( rule__AtomicExpression__Group_1__0 ) )
                    // InternalKlangParser.g:906:3: ( rule__AtomicExpression__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getGroup_1()); 
                    // InternalKlangParser.g:907:3: ( rule__AtomicExpression__Group_1__0 )
                    // InternalKlangParser.g:907:4: rule__AtomicExpression__Group_1__0
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
                    // InternalKlangParser.g:911:2: ( ( rule__AtomicExpression__Group_2__0 ) )
                    {
                    // InternalKlangParser.g:911:2: ( ( rule__AtomicExpression__Group_2__0 ) )
                    // InternalKlangParser.g:912:3: ( rule__AtomicExpression__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getGroup_2()); 
                    // InternalKlangParser.g:913:3: ( rule__AtomicExpression__Group_2__0 )
                    // InternalKlangParser.g:913:4: rule__AtomicExpression__Group_2__0
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
                    // InternalKlangParser.g:917:2: ( ( rule__AtomicExpression__Group_3__0 ) )
                    {
                    // InternalKlangParser.g:917:2: ( ( rule__AtomicExpression__Group_3__0 ) )
                    // InternalKlangParser.g:918:3: ( rule__AtomicExpression__Group_3__0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getGroup_3()); 
                    // InternalKlangParser.g:919:3: ( rule__AtomicExpression__Group_3__0 )
                    // InternalKlangParser.g:919:4: rule__AtomicExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicExpression__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicExpressionAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalKlangParser.g:923:2: ( ( rule__AtomicExpression__Group_4__0 ) )
                    {
                    // InternalKlangParser.g:923:2: ( ( rule__AtomicExpression__Group_4__0 ) )
                    // InternalKlangParser.g:924:3: ( rule__AtomicExpression__Group_4__0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getGroup_4()); 
                    // InternalKlangParser.g:925:3: ( rule__AtomicExpression__Group_4__0 )
                    // InternalKlangParser.g:925:4: rule__AtomicExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicExpression__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicExpressionAccess().getGroup_4()); 

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
    // InternalKlangParser.g:933:1: rule__AtomicExpression__Alternatives_0_1 : ( ( ( rule__AtomicExpression__ValueAssignment_0_1_0 ) ) | ( False ) );
    public final void rule__AtomicExpression__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:937:1: ( ( ( rule__AtomicExpression__ValueAssignment_0_1_0 ) ) | ( False ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==True) ) {
                alt6=1;
            }
            else if ( (LA6_0==False) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalKlangParser.g:938:2: ( ( rule__AtomicExpression__ValueAssignment_0_1_0 ) )
                    {
                    // InternalKlangParser.g:938:2: ( ( rule__AtomicExpression__ValueAssignment_0_1_0 ) )
                    // InternalKlangParser.g:939:3: ( rule__AtomicExpression__ValueAssignment_0_1_0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getValueAssignment_0_1_0()); 
                    // InternalKlangParser.g:940:3: ( rule__AtomicExpression__ValueAssignment_0_1_0 )
                    // InternalKlangParser.g:940:4: rule__AtomicExpression__ValueAssignment_0_1_0
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
                    // InternalKlangParser.g:944:2: ( False )
                    {
                    // InternalKlangParser.g:944:2: ( False )
                    // InternalKlangParser.g:945:3: False
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


    // $ANTLR start "rule__SceneActor__Group__0"
    // InternalKlangParser.g:954:1: rule__SceneActor__Group__0 : rule__SceneActor__Group__0__Impl rule__SceneActor__Group__1 ;
    public final void rule__SceneActor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:958:1: ( rule__SceneActor__Group__0__Impl rule__SceneActor__Group__1 )
            // InternalKlangParser.g:959:2: rule__SceneActor__Group__0__Impl rule__SceneActor__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SceneActor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SceneActor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneActor__Group__0"


    // $ANTLR start "rule__SceneActor__Group__0__Impl"
    // InternalKlangParser.g:966:1: rule__SceneActor__Group__0__Impl : ( () ) ;
    public final void rule__SceneActor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:970:1: ( ( () ) )
            // InternalKlangParser.g:971:1: ( () )
            {
            // InternalKlangParser.g:971:1: ( () )
            // InternalKlangParser.g:972:2: ()
            {
             before(grammarAccess.getSceneActorAccess().getSceneActorAction_0()); 
            // InternalKlangParser.g:973:2: ()
            // InternalKlangParser.g:973:3: 
            {
            }

             after(grammarAccess.getSceneActorAccess().getSceneActorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneActor__Group__0__Impl"


    // $ANTLR start "rule__SceneActor__Group__1"
    // InternalKlangParser.g:981:1: rule__SceneActor__Group__1 : rule__SceneActor__Group__1__Impl rule__SceneActor__Group__2 ;
    public final void rule__SceneActor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:985:1: ( rule__SceneActor__Group__1__Impl rule__SceneActor__Group__2 )
            // InternalKlangParser.g:986:2: rule__SceneActor__Group__1__Impl rule__SceneActor__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__SceneActor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SceneActor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneActor__Group__1"


    // $ANTLR start "rule__SceneActor__Group__1__Impl"
    // InternalKlangParser.g:993:1: rule__SceneActor__Group__1__Impl : ( ( rule__SceneActor__LocalVariablesAssignment_1 )* ) ;
    public final void rule__SceneActor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:997:1: ( ( ( rule__SceneActor__LocalVariablesAssignment_1 )* ) )
            // InternalKlangParser.g:998:1: ( ( rule__SceneActor__LocalVariablesAssignment_1 )* )
            {
            // InternalKlangParser.g:998:1: ( ( rule__SceneActor__LocalVariablesAssignment_1 )* )
            // InternalKlangParser.g:999:2: ( rule__SceneActor__LocalVariablesAssignment_1 )*
            {
             before(grammarAccess.getSceneActorAccess().getLocalVariablesAssignment_1()); 
            // InternalKlangParser.g:1000:2: ( rule__SceneActor__LocalVariablesAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Var) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalKlangParser.g:1000:3: rule__SceneActor__LocalVariablesAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__SceneActor__LocalVariablesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSceneActorAccess().getLocalVariablesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneActor__Group__1__Impl"


    // $ANTLR start "rule__SceneActor__Group__2"
    // InternalKlangParser.g:1008:1: rule__SceneActor__Group__2 : rule__SceneActor__Group__2__Impl rule__SceneActor__Group__3 ;
    public final void rule__SceneActor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1012:1: ( rule__SceneActor__Group__2__Impl rule__SceneActor__Group__3 )
            // InternalKlangParser.g:1013:2: rule__SceneActor__Group__2__Impl rule__SceneActor__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__SceneActor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SceneActor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneActor__Group__2"


    // $ANTLR start "rule__SceneActor__Group__2__Impl"
    // InternalKlangParser.g:1020:1: rule__SceneActor__Group__2__Impl : ( ( rule__SceneActor__EventHandlersAssignment_2 )* ) ;
    public final void rule__SceneActor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1024:1: ( ( ( rule__SceneActor__EventHandlersAssignment_2 )* ) )
            // InternalKlangParser.g:1025:1: ( ( rule__SceneActor__EventHandlersAssignment_2 )* )
            {
            // InternalKlangParser.g:1025:1: ( ( rule__SceneActor__EventHandlersAssignment_2 )* )
            // InternalKlangParser.g:1026:2: ( rule__SceneActor__EventHandlersAssignment_2 )*
            {
             before(grammarAccess.getSceneActorAccess().getEventHandlersAssignment_2()); 
            // InternalKlangParser.g:1027:2: ( rule__SceneActor__EventHandlersAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==When) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKlangParser.g:1027:3: rule__SceneActor__EventHandlersAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__SceneActor__EventHandlersAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSceneActorAccess().getEventHandlersAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneActor__Group__2__Impl"


    // $ANTLR start "rule__SceneActor__Group__3"
    // InternalKlangParser.g:1035:1: rule__SceneActor__Group__3 : rule__SceneActor__Group__3__Impl ;
    public final void rule__SceneActor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1039:1: ( rule__SceneActor__Group__3__Impl )
            // InternalKlangParser.g:1040:2: rule__SceneActor__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SceneActor__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneActor__Group__3"


    // $ANTLR start "rule__SceneActor__Group__3__Impl"
    // InternalKlangParser.g:1046:1: rule__SceneActor__Group__3__Impl : ( ( rule__SceneActor__ChildrenAssignment_3 )* ) ;
    public final void rule__SceneActor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1050:1: ( ( ( rule__SceneActor__ChildrenAssignment_3 )* ) )
            // InternalKlangParser.g:1051:1: ( ( rule__SceneActor__ChildrenAssignment_3 )* )
            {
            // InternalKlangParser.g:1051:1: ( ( rule__SceneActor__ChildrenAssignment_3 )* )
            // InternalKlangParser.g:1052:2: ( rule__SceneActor__ChildrenAssignment_3 )*
            {
             before(grammarAccess.getSceneActorAccess().getChildrenAssignment_3()); 
            // InternalKlangParser.g:1053:2: ( rule__SceneActor__ChildrenAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Sprite) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalKlangParser.g:1053:3: rule__SceneActor__ChildrenAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__SceneActor__ChildrenAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSceneActorAccess().getChildrenAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneActor__Group__3__Impl"


    // $ANTLR start "rule__SpriteActor__Group__0"
    // InternalKlangParser.g:1062:1: rule__SpriteActor__Group__0 : rule__SpriteActor__Group__0__Impl rule__SpriteActor__Group__1 ;
    public final void rule__SpriteActor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1066:1: ( rule__SpriteActor__Group__0__Impl rule__SpriteActor__Group__1 )
            // InternalKlangParser.g:1067:2: rule__SpriteActor__Group__0__Impl rule__SpriteActor__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__SpriteActor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpriteActor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteActor__Group__0"


    // $ANTLR start "rule__SpriteActor__Group__0__Impl"
    // InternalKlangParser.g:1074:1: rule__SpriteActor__Group__0__Impl : ( () ) ;
    public final void rule__SpriteActor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1078:1: ( ( () ) )
            // InternalKlangParser.g:1079:1: ( () )
            {
            // InternalKlangParser.g:1079:1: ( () )
            // InternalKlangParser.g:1080:2: ()
            {
             before(grammarAccess.getSpriteActorAccess().getSpriteActorAction_0()); 
            // InternalKlangParser.g:1081:2: ()
            // InternalKlangParser.g:1081:3: 
            {
            }

             after(grammarAccess.getSpriteActorAccess().getSpriteActorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteActor__Group__0__Impl"


    // $ANTLR start "rule__SpriteActor__Group__1"
    // InternalKlangParser.g:1089:1: rule__SpriteActor__Group__1 : rule__SpriteActor__Group__1__Impl rule__SpriteActor__Group__2 ;
    public final void rule__SpriteActor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1093:1: ( rule__SpriteActor__Group__1__Impl rule__SpriteActor__Group__2 )
            // InternalKlangParser.g:1094:2: rule__SpriteActor__Group__1__Impl rule__SpriteActor__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__SpriteActor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpriteActor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteActor__Group__1"


    // $ANTLR start "rule__SpriteActor__Group__1__Impl"
    // InternalKlangParser.g:1101:1: rule__SpriteActor__Group__1__Impl : ( Sprite ) ;
    public final void rule__SpriteActor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1105:1: ( ( Sprite ) )
            // InternalKlangParser.g:1106:1: ( Sprite )
            {
            // InternalKlangParser.g:1106:1: ( Sprite )
            // InternalKlangParser.g:1107:2: Sprite
            {
             before(grammarAccess.getSpriteActorAccess().getSpriteKeyword_1()); 
            match(input,Sprite,FOLLOW_2); 
             after(grammarAccess.getSpriteActorAccess().getSpriteKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteActor__Group__1__Impl"


    // $ANTLR start "rule__SpriteActor__Group__2"
    // InternalKlangParser.g:1116:1: rule__SpriteActor__Group__2 : rule__SpriteActor__Group__2__Impl rule__SpriteActor__Group__3 ;
    public final void rule__SpriteActor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1120:1: ( rule__SpriteActor__Group__2__Impl rule__SpriteActor__Group__3 )
            // InternalKlangParser.g:1121:2: rule__SpriteActor__Group__2__Impl rule__SpriteActor__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__SpriteActor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpriteActor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteActor__Group__2"


    // $ANTLR start "rule__SpriteActor__Group__2__Impl"
    // InternalKlangParser.g:1128:1: rule__SpriteActor__Group__2__Impl : ( ( rule__SpriteActor__NameAssignment_2 ) ) ;
    public final void rule__SpriteActor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1132:1: ( ( ( rule__SpriteActor__NameAssignment_2 ) ) )
            // InternalKlangParser.g:1133:1: ( ( rule__SpriteActor__NameAssignment_2 ) )
            {
            // InternalKlangParser.g:1133:1: ( ( rule__SpriteActor__NameAssignment_2 ) )
            // InternalKlangParser.g:1134:2: ( rule__SpriteActor__NameAssignment_2 )
            {
             before(grammarAccess.getSpriteActorAccess().getNameAssignment_2()); 
            // InternalKlangParser.g:1135:2: ( rule__SpriteActor__NameAssignment_2 )
            // InternalKlangParser.g:1135:3: rule__SpriteActor__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SpriteActor__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSpriteActorAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteActor__Group__2__Impl"


    // $ANTLR start "rule__SpriteActor__Group__3"
    // InternalKlangParser.g:1143:1: rule__SpriteActor__Group__3 : rule__SpriteActor__Group__3__Impl rule__SpriteActor__Group__4 ;
    public final void rule__SpriteActor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1147:1: ( rule__SpriteActor__Group__3__Impl rule__SpriteActor__Group__4 )
            // InternalKlangParser.g:1148:2: rule__SpriteActor__Group__3__Impl rule__SpriteActor__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__SpriteActor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpriteActor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteActor__Group__3"


    // $ANTLR start "rule__SpriteActor__Group__3__Impl"
    // InternalKlangParser.g:1155:1: rule__SpriteActor__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__SpriteActor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1159:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:1160:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:1160:1: ( RULE_BEGIN )
            // InternalKlangParser.g:1161:2: RULE_BEGIN
            {
             before(grammarAccess.getSpriteActorAccess().getBEGINTerminalRuleCall_3()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getSpriteActorAccess().getBEGINTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteActor__Group__3__Impl"


    // $ANTLR start "rule__SpriteActor__Group__4"
    // InternalKlangParser.g:1170:1: rule__SpriteActor__Group__4 : rule__SpriteActor__Group__4__Impl rule__SpriteActor__Group__5 ;
    public final void rule__SpriteActor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1174:1: ( rule__SpriteActor__Group__4__Impl rule__SpriteActor__Group__5 )
            // InternalKlangParser.g:1175:2: rule__SpriteActor__Group__4__Impl rule__SpriteActor__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__SpriteActor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpriteActor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteActor__Group__4"


    // $ANTLR start "rule__SpriteActor__Group__4__Impl"
    // InternalKlangParser.g:1182:1: rule__SpriteActor__Group__4__Impl : ( ( rule__SpriteActor__LocalVariablesAssignment_4 )* ) ;
    public final void rule__SpriteActor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1186:1: ( ( ( rule__SpriteActor__LocalVariablesAssignment_4 )* ) )
            // InternalKlangParser.g:1187:1: ( ( rule__SpriteActor__LocalVariablesAssignment_4 )* )
            {
            // InternalKlangParser.g:1187:1: ( ( rule__SpriteActor__LocalVariablesAssignment_4 )* )
            // InternalKlangParser.g:1188:2: ( rule__SpriteActor__LocalVariablesAssignment_4 )*
            {
             before(grammarAccess.getSpriteActorAccess().getLocalVariablesAssignment_4()); 
            // InternalKlangParser.g:1189:2: ( rule__SpriteActor__LocalVariablesAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Var) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalKlangParser.g:1189:3: rule__SpriteActor__LocalVariablesAssignment_4
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__SpriteActor__LocalVariablesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSpriteActorAccess().getLocalVariablesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteActor__Group__4__Impl"


    // $ANTLR start "rule__SpriteActor__Group__5"
    // InternalKlangParser.g:1197:1: rule__SpriteActor__Group__5 : rule__SpriteActor__Group__5__Impl rule__SpriteActor__Group__6 ;
    public final void rule__SpriteActor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1201:1: ( rule__SpriteActor__Group__5__Impl rule__SpriteActor__Group__6 )
            // InternalKlangParser.g:1202:2: rule__SpriteActor__Group__5__Impl rule__SpriteActor__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__SpriteActor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpriteActor__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteActor__Group__5"


    // $ANTLR start "rule__SpriteActor__Group__5__Impl"
    // InternalKlangParser.g:1209:1: rule__SpriteActor__Group__5__Impl : ( ( rule__SpriteActor__EventHandlersAssignment_5 )* ) ;
    public final void rule__SpriteActor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1213:1: ( ( ( rule__SpriteActor__EventHandlersAssignment_5 )* ) )
            // InternalKlangParser.g:1214:1: ( ( rule__SpriteActor__EventHandlersAssignment_5 )* )
            {
            // InternalKlangParser.g:1214:1: ( ( rule__SpriteActor__EventHandlersAssignment_5 )* )
            // InternalKlangParser.g:1215:2: ( rule__SpriteActor__EventHandlersAssignment_5 )*
            {
             before(grammarAccess.getSpriteActorAccess().getEventHandlersAssignment_5()); 
            // InternalKlangParser.g:1216:2: ( rule__SpriteActor__EventHandlersAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==When) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalKlangParser.g:1216:3: rule__SpriteActor__EventHandlersAssignment_5
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__SpriteActor__EventHandlersAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getSpriteActorAccess().getEventHandlersAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteActor__Group__5__Impl"


    // $ANTLR start "rule__SpriteActor__Group__6"
    // InternalKlangParser.g:1224:1: rule__SpriteActor__Group__6 : rule__SpriteActor__Group__6__Impl ;
    public final void rule__SpriteActor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1228:1: ( rule__SpriteActor__Group__6__Impl )
            // InternalKlangParser.g:1229:2: rule__SpriteActor__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpriteActor__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteActor__Group__6"


    // $ANTLR start "rule__SpriteActor__Group__6__Impl"
    // InternalKlangParser.g:1235:1: rule__SpriteActor__Group__6__Impl : ( RULE_END ) ;
    public final void rule__SpriteActor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1239:1: ( ( RULE_END ) )
            // InternalKlangParser.g:1240:1: ( RULE_END )
            {
            // InternalKlangParser.g:1240:1: ( RULE_END )
            // InternalKlangParser.g:1241:2: RULE_END
            {
             before(grammarAccess.getSpriteActorAccess().getENDTerminalRuleCall_6()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getSpriteActorAccess().getENDTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteActor__Group__6__Impl"


    // $ANTLR start "rule__GameStart__Group__0"
    // InternalKlangParser.g:1251:1: rule__GameStart__Group__0 : rule__GameStart__Group__0__Impl rule__GameStart__Group__1 ;
    public final void rule__GameStart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1255:1: ( rule__GameStart__Group__0__Impl rule__GameStart__Group__1 )
            // InternalKlangParser.g:1256:2: rule__GameStart__Group__0__Impl rule__GameStart__Group__1
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
    // InternalKlangParser.g:1263:1: rule__GameStart__Group__0__Impl : ( () ) ;
    public final void rule__GameStart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1267:1: ( ( () ) )
            // InternalKlangParser.g:1268:1: ( () )
            {
            // InternalKlangParser.g:1268:1: ( () )
            // InternalKlangParser.g:1269:2: ()
            {
             before(grammarAccess.getGameStartAccess().getGameStartAction_0()); 
            // InternalKlangParser.g:1270:2: ()
            // InternalKlangParser.g:1270:3: 
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
    // InternalKlangParser.g:1278:1: rule__GameStart__Group__1 : rule__GameStart__Group__1__Impl rule__GameStart__Group__2 ;
    public final void rule__GameStart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1282:1: ( rule__GameStart__Group__1__Impl rule__GameStart__Group__2 )
            // InternalKlangParser.g:1283:2: rule__GameStart__Group__1__Impl rule__GameStart__Group__2
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
    // InternalKlangParser.g:1290:1: rule__GameStart__Group__1__Impl : ( When ) ;
    public final void rule__GameStart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1294:1: ( ( When ) )
            // InternalKlangParser.g:1295:1: ( When )
            {
            // InternalKlangParser.g:1295:1: ( When )
            // InternalKlangParser.g:1296:2: When
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
    // InternalKlangParser.g:1305:1: rule__GameStart__Group__2 : rule__GameStart__Group__2__Impl rule__GameStart__Group__3 ;
    public final void rule__GameStart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1309:1: ( rule__GameStart__Group__2__Impl rule__GameStart__Group__3 )
            // InternalKlangParser.g:1310:2: rule__GameStart__Group__2__Impl rule__GameStart__Group__3
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
    // InternalKlangParser.g:1317:1: rule__GameStart__Group__2__Impl : ( Game ) ;
    public final void rule__GameStart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1321:1: ( ( Game ) )
            // InternalKlangParser.g:1322:1: ( Game )
            {
            // InternalKlangParser.g:1322:1: ( Game )
            // InternalKlangParser.g:1323:2: Game
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
    // InternalKlangParser.g:1332:1: rule__GameStart__Group__3 : rule__GameStart__Group__3__Impl rule__GameStart__Group__4 ;
    public final void rule__GameStart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1336:1: ( rule__GameStart__Group__3__Impl rule__GameStart__Group__4 )
            // InternalKlangParser.g:1337:2: rule__GameStart__Group__3__Impl rule__GameStart__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalKlangParser.g:1344:1: rule__GameStart__Group__3__Impl : ( Starts ) ;
    public final void rule__GameStart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1348:1: ( ( Starts ) )
            // InternalKlangParser.g:1349:1: ( Starts )
            {
            // InternalKlangParser.g:1349:1: ( Starts )
            // InternalKlangParser.g:1350:2: Starts
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
    // InternalKlangParser.g:1359:1: rule__GameStart__Group__4 : rule__GameStart__Group__4__Impl rule__GameStart__Group__5 ;
    public final void rule__GameStart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1363:1: ( rule__GameStart__Group__4__Impl rule__GameStart__Group__5 )
            // InternalKlangParser.g:1364:2: rule__GameStart__Group__4__Impl rule__GameStart__Group__5
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
    // InternalKlangParser.g:1371:1: rule__GameStart__Group__4__Impl : ( RULE_BEGIN ) ;
    public final void rule__GameStart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1375:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:1376:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:1376:1: ( RULE_BEGIN )
            // InternalKlangParser.g:1377:2: RULE_BEGIN
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
    // InternalKlangParser.g:1386:1: rule__GameStart__Group__5 : rule__GameStart__Group__5__Impl rule__GameStart__Group__6 ;
    public final void rule__GameStart__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1390:1: ( rule__GameStart__Group__5__Impl rule__GameStart__Group__6 )
            // InternalKlangParser.g:1391:2: rule__GameStart__Group__5__Impl rule__GameStart__Group__6
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
    // InternalKlangParser.g:1398:1: rule__GameStart__Group__5__Impl : ( ( rule__GameStart__StatementsAssignment_5 )* ) ;
    public final void rule__GameStart__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1402:1: ( ( ( rule__GameStart__StatementsAssignment_5 )* ) )
            // InternalKlangParser.g:1403:1: ( ( rule__GameStart__StatementsAssignment_5 )* )
            {
            // InternalKlangParser.g:1403:1: ( ( rule__GameStart__StatementsAssignment_5 )* )
            // InternalKlangParser.g:1404:2: ( rule__GameStart__StatementsAssignment_5 )*
            {
             before(grammarAccess.getGameStartAccess().getStatementsAssignment_5()); 
            // InternalKlangParser.g:1405:2: ( rule__GameStart__StatementsAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Forever||(LA12_0>=Sleep && LA12_0<=While)||LA12_0==If||LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalKlangParser.g:1405:3: rule__GameStart__StatementsAssignment_5
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
    // InternalKlangParser.g:1413:1: rule__GameStart__Group__6 : rule__GameStart__Group__6__Impl ;
    public final void rule__GameStart__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1417:1: ( rule__GameStart__Group__6__Impl )
            // InternalKlangParser.g:1418:2: rule__GameStart__Group__6__Impl
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
    // InternalKlangParser.g:1424:1: rule__GameStart__Group__6__Impl : ( RULE_END ) ;
    public final void rule__GameStart__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1428:1: ( ( RULE_END ) )
            // InternalKlangParser.g:1429:1: ( RULE_END )
            {
            // InternalKlangParser.g:1429:1: ( RULE_END )
            // InternalKlangParser.g:1430:2: RULE_END
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
    // InternalKlangParser.g:1440:1: rule__SpriteClicked__Group__0 : rule__SpriteClicked__Group__0__Impl rule__SpriteClicked__Group__1 ;
    public final void rule__SpriteClicked__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1444:1: ( rule__SpriteClicked__Group__0__Impl rule__SpriteClicked__Group__1 )
            // InternalKlangParser.g:1445:2: rule__SpriteClicked__Group__0__Impl rule__SpriteClicked__Group__1
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
    // InternalKlangParser.g:1452:1: rule__SpriteClicked__Group__0__Impl : ( () ) ;
    public final void rule__SpriteClicked__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1456:1: ( ( () ) )
            // InternalKlangParser.g:1457:1: ( () )
            {
            // InternalKlangParser.g:1457:1: ( () )
            // InternalKlangParser.g:1458:2: ()
            {
             before(grammarAccess.getSpriteClickedAccess().getSpriteClickedAction_0()); 
            // InternalKlangParser.g:1459:2: ()
            // InternalKlangParser.g:1459:3: 
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
    // InternalKlangParser.g:1467:1: rule__SpriteClicked__Group__1 : rule__SpriteClicked__Group__1__Impl rule__SpriteClicked__Group__2 ;
    public final void rule__SpriteClicked__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1471:1: ( rule__SpriteClicked__Group__1__Impl rule__SpriteClicked__Group__2 )
            // InternalKlangParser.g:1472:2: rule__SpriteClicked__Group__1__Impl rule__SpriteClicked__Group__2
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
    // InternalKlangParser.g:1479:1: rule__SpriteClicked__Group__1__Impl : ( When ) ;
    public final void rule__SpriteClicked__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1483:1: ( ( When ) )
            // InternalKlangParser.g:1484:1: ( When )
            {
            // InternalKlangParser.g:1484:1: ( When )
            // InternalKlangParser.g:1485:2: When
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
    // InternalKlangParser.g:1494:1: rule__SpriteClicked__Group__2 : rule__SpriteClicked__Group__2__Impl rule__SpriteClicked__Group__3 ;
    public final void rule__SpriteClicked__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1498:1: ( rule__SpriteClicked__Group__2__Impl rule__SpriteClicked__Group__3 )
            // InternalKlangParser.g:1499:2: rule__SpriteClicked__Group__2__Impl rule__SpriteClicked__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalKlangParser.g:1506:1: rule__SpriteClicked__Group__2__Impl : ( Clicked ) ;
    public final void rule__SpriteClicked__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1510:1: ( ( Clicked ) )
            // InternalKlangParser.g:1511:1: ( Clicked )
            {
            // InternalKlangParser.g:1511:1: ( Clicked )
            // InternalKlangParser.g:1512:2: Clicked
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
    // InternalKlangParser.g:1521:1: rule__SpriteClicked__Group__3 : rule__SpriteClicked__Group__3__Impl rule__SpriteClicked__Group__4 ;
    public final void rule__SpriteClicked__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1525:1: ( rule__SpriteClicked__Group__3__Impl rule__SpriteClicked__Group__4 )
            // InternalKlangParser.g:1526:2: rule__SpriteClicked__Group__3__Impl rule__SpriteClicked__Group__4
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
    // InternalKlangParser.g:1533:1: rule__SpriteClicked__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__SpriteClicked__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1537:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:1538:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:1538:1: ( RULE_BEGIN )
            // InternalKlangParser.g:1539:2: RULE_BEGIN
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
    // InternalKlangParser.g:1548:1: rule__SpriteClicked__Group__4 : rule__SpriteClicked__Group__4__Impl rule__SpriteClicked__Group__5 ;
    public final void rule__SpriteClicked__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1552:1: ( rule__SpriteClicked__Group__4__Impl rule__SpriteClicked__Group__5 )
            // InternalKlangParser.g:1553:2: rule__SpriteClicked__Group__4__Impl rule__SpriteClicked__Group__5
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
    // InternalKlangParser.g:1560:1: rule__SpriteClicked__Group__4__Impl : ( ( rule__SpriteClicked__StatementsAssignment_4 )* ) ;
    public final void rule__SpriteClicked__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1564:1: ( ( ( rule__SpriteClicked__StatementsAssignment_4 )* ) )
            // InternalKlangParser.g:1565:1: ( ( rule__SpriteClicked__StatementsAssignment_4 )* )
            {
            // InternalKlangParser.g:1565:1: ( ( rule__SpriteClicked__StatementsAssignment_4 )* )
            // InternalKlangParser.g:1566:2: ( rule__SpriteClicked__StatementsAssignment_4 )*
            {
             before(grammarAccess.getSpriteClickedAccess().getStatementsAssignment_4()); 
            // InternalKlangParser.g:1567:2: ( rule__SpriteClicked__StatementsAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Forever||(LA13_0>=Sleep && LA13_0<=While)||LA13_0==If||LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalKlangParser.g:1567:3: rule__SpriteClicked__StatementsAssignment_4
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
    // InternalKlangParser.g:1575:1: rule__SpriteClicked__Group__5 : rule__SpriteClicked__Group__5__Impl ;
    public final void rule__SpriteClicked__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1579:1: ( rule__SpriteClicked__Group__5__Impl )
            // InternalKlangParser.g:1580:2: rule__SpriteClicked__Group__5__Impl
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
    // InternalKlangParser.g:1586:1: rule__SpriteClicked__Group__5__Impl : ( RULE_END ) ;
    public final void rule__SpriteClicked__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1590:1: ( ( RULE_END ) )
            // InternalKlangParser.g:1591:1: ( RULE_END )
            {
            // InternalKlangParser.g:1591:1: ( RULE_END )
            // InternalKlangParser.g:1592:2: RULE_END
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
    // InternalKlangParser.g:1602:1: rule__KeyPressed__Group__0 : rule__KeyPressed__Group__0__Impl rule__KeyPressed__Group__1 ;
    public final void rule__KeyPressed__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1606:1: ( rule__KeyPressed__Group__0__Impl rule__KeyPressed__Group__1 )
            // InternalKlangParser.g:1607:2: rule__KeyPressed__Group__0__Impl rule__KeyPressed__Group__1
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
    // InternalKlangParser.g:1614:1: rule__KeyPressed__Group__0__Impl : ( () ) ;
    public final void rule__KeyPressed__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1618:1: ( ( () ) )
            // InternalKlangParser.g:1619:1: ( () )
            {
            // InternalKlangParser.g:1619:1: ( () )
            // InternalKlangParser.g:1620:2: ()
            {
             before(grammarAccess.getKeyPressedAccess().getKeyPressedAction_0()); 
            // InternalKlangParser.g:1621:2: ()
            // InternalKlangParser.g:1621:3: 
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
    // InternalKlangParser.g:1629:1: rule__KeyPressed__Group__1 : rule__KeyPressed__Group__1__Impl rule__KeyPressed__Group__2 ;
    public final void rule__KeyPressed__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1633:1: ( rule__KeyPressed__Group__1__Impl rule__KeyPressed__Group__2 )
            // InternalKlangParser.g:1634:2: rule__KeyPressed__Group__1__Impl rule__KeyPressed__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalKlangParser.g:1641:1: rule__KeyPressed__Group__1__Impl : ( When ) ;
    public final void rule__KeyPressed__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1645:1: ( ( When ) )
            // InternalKlangParser.g:1646:1: ( When )
            {
            // InternalKlangParser.g:1646:1: ( When )
            // InternalKlangParser.g:1647:2: When
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
    // InternalKlangParser.g:1656:1: rule__KeyPressed__Group__2 : rule__KeyPressed__Group__2__Impl rule__KeyPressed__Group__3 ;
    public final void rule__KeyPressed__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1660:1: ( rule__KeyPressed__Group__2__Impl rule__KeyPressed__Group__3 )
            // InternalKlangParser.g:1661:2: rule__KeyPressed__Group__2__Impl rule__KeyPressed__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalKlangParser.g:1668:1: rule__KeyPressed__Group__2__Impl : ( ( rule__KeyPressed__KeyAssignment_2 ) ) ;
    public final void rule__KeyPressed__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1672:1: ( ( ( rule__KeyPressed__KeyAssignment_2 ) ) )
            // InternalKlangParser.g:1673:1: ( ( rule__KeyPressed__KeyAssignment_2 ) )
            {
            // InternalKlangParser.g:1673:1: ( ( rule__KeyPressed__KeyAssignment_2 ) )
            // InternalKlangParser.g:1674:2: ( rule__KeyPressed__KeyAssignment_2 )
            {
             before(grammarAccess.getKeyPressedAccess().getKeyAssignment_2()); 
            // InternalKlangParser.g:1675:2: ( rule__KeyPressed__KeyAssignment_2 )
            // InternalKlangParser.g:1675:3: rule__KeyPressed__KeyAssignment_2
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
    // InternalKlangParser.g:1683:1: rule__KeyPressed__Group__3 : rule__KeyPressed__Group__3__Impl rule__KeyPressed__Group__4 ;
    public final void rule__KeyPressed__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1687:1: ( rule__KeyPressed__Group__3__Impl rule__KeyPressed__Group__4 )
            // InternalKlangParser.g:1688:2: rule__KeyPressed__Group__3__Impl rule__KeyPressed__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalKlangParser.g:1695:1: rule__KeyPressed__Group__3__Impl : ( Key ) ;
    public final void rule__KeyPressed__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1699:1: ( ( Key ) )
            // InternalKlangParser.g:1700:1: ( Key )
            {
            // InternalKlangParser.g:1700:1: ( Key )
            // InternalKlangParser.g:1701:2: Key
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
    // InternalKlangParser.g:1710:1: rule__KeyPressed__Group__4 : rule__KeyPressed__Group__4__Impl rule__KeyPressed__Group__5 ;
    public final void rule__KeyPressed__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1714:1: ( rule__KeyPressed__Group__4__Impl rule__KeyPressed__Group__5 )
            // InternalKlangParser.g:1715:2: rule__KeyPressed__Group__4__Impl rule__KeyPressed__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalKlangParser.g:1722:1: rule__KeyPressed__Group__4__Impl : ( Pressed ) ;
    public final void rule__KeyPressed__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1726:1: ( ( Pressed ) )
            // InternalKlangParser.g:1727:1: ( Pressed )
            {
            // InternalKlangParser.g:1727:1: ( Pressed )
            // InternalKlangParser.g:1728:2: Pressed
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
    // InternalKlangParser.g:1737:1: rule__KeyPressed__Group__5 : rule__KeyPressed__Group__5__Impl rule__KeyPressed__Group__6 ;
    public final void rule__KeyPressed__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1741:1: ( rule__KeyPressed__Group__5__Impl rule__KeyPressed__Group__6 )
            // InternalKlangParser.g:1742:2: rule__KeyPressed__Group__5__Impl rule__KeyPressed__Group__6
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
    // InternalKlangParser.g:1749:1: rule__KeyPressed__Group__5__Impl : ( RULE_BEGIN ) ;
    public final void rule__KeyPressed__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1753:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:1754:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:1754:1: ( RULE_BEGIN )
            // InternalKlangParser.g:1755:2: RULE_BEGIN
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
    // InternalKlangParser.g:1764:1: rule__KeyPressed__Group__6 : rule__KeyPressed__Group__6__Impl rule__KeyPressed__Group__7 ;
    public final void rule__KeyPressed__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1768:1: ( rule__KeyPressed__Group__6__Impl rule__KeyPressed__Group__7 )
            // InternalKlangParser.g:1769:2: rule__KeyPressed__Group__6__Impl rule__KeyPressed__Group__7
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
    // InternalKlangParser.g:1776:1: rule__KeyPressed__Group__6__Impl : ( ( rule__KeyPressed__StatementsAssignment_6 )* ) ;
    public final void rule__KeyPressed__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1780:1: ( ( ( rule__KeyPressed__StatementsAssignment_6 )* ) )
            // InternalKlangParser.g:1781:1: ( ( rule__KeyPressed__StatementsAssignment_6 )* )
            {
            // InternalKlangParser.g:1781:1: ( ( rule__KeyPressed__StatementsAssignment_6 )* )
            // InternalKlangParser.g:1782:2: ( rule__KeyPressed__StatementsAssignment_6 )*
            {
             before(grammarAccess.getKeyPressedAccess().getStatementsAssignment_6()); 
            // InternalKlangParser.g:1783:2: ( rule__KeyPressed__StatementsAssignment_6 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Forever||(LA14_0>=Sleep && LA14_0<=While)||LA14_0==If||LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalKlangParser.g:1783:3: rule__KeyPressed__StatementsAssignment_6
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
    // InternalKlangParser.g:1791:1: rule__KeyPressed__Group__7 : rule__KeyPressed__Group__7__Impl ;
    public final void rule__KeyPressed__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1795:1: ( rule__KeyPressed__Group__7__Impl )
            // InternalKlangParser.g:1796:2: rule__KeyPressed__Group__7__Impl
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
    // InternalKlangParser.g:1802:1: rule__KeyPressed__Group__7__Impl : ( RULE_END ) ;
    public final void rule__KeyPressed__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1806:1: ( ( RULE_END ) )
            // InternalKlangParser.g:1807:1: ( RULE_END )
            {
            // InternalKlangParser.g:1807:1: ( RULE_END )
            // InternalKlangParser.g:1808:2: RULE_END
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
    // InternalKlangParser.g:1818:1: rule__CollidesWith__Group__0 : rule__CollidesWith__Group__0__Impl rule__CollidesWith__Group__1 ;
    public final void rule__CollidesWith__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1822:1: ( rule__CollidesWith__Group__0__Impl rule__CollidesWith__Group__1 )
            // InternalKlangParser.g:1823:2: rule__CollidesWith__Group__0__Impl rule__CollidesWith__Group__1
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
    // InternalKlangParser.g:1830:1: rule__CollidesWith__Group__0__Impl : ( () ) ;
    public final void rule__CollidesWith__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1834:1: ( ( () ) )
            // InternalKlangParser.g:1835:1: ( () )
            {
            // InternalKlangParser.g:1835:1: ( () )
            // InternalKlangParser.g:1836:2: ()
            {
             before(grammarAccess.getCollidesWithAccess().getCollidesWithAction_0()); 
            // InternalKlangParser.g:1837:2: ()
            // InternalKlangParser.g:1837:3: 
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
    // InternalKlangParser.g:1845:1: rule__CollidesWith__Group__1 : rule__CollidesWith__Group__1__Impl rule__CollidesWith__Group__2 ;
    public final void rule__CollidesWith__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1849:1: ( rule__CollidesWith__Group__1__Impl rule__CollidesWith__Group__2 )
            // InternalKlangParser.g:1850:2: rule__CollidesWith__Group__1__Impl rule__CollidesWith__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalKlangParser.g:1857:1: rule__CollidesWith__Group__1__Impl : ( When ) ;
    public final void rule__CollidesWith__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1861:1: ( ( When ) )
            // InternalKlangParser.g:1862:1: ( When )
            {
            // InternalKlangParser.g:1862:1: ( When )
            // InternalKlangParser.g:1863:2: When
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
    // InternalKlangParser.g:1872:1: rule__CollidesWith__Group__2 : rule__CollidesWith__Group__2__Impl rule__CollidesWith__Group__3 ;
    public final void rule__CollidesWith__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1876:1: ( rule__CollidesWith__Group__2__Impl rule__CollidesWith__Group__3 )
            // InternalKlangParser.g:1877:2: rule__CollidesWith__Group__2__Impl rule__CollidesWith__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalKlangParser.g:1884:1: rule__CollidesWith__Group__2__Impl : ( Collides ) ;
    public final void rule__CollidesWith__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1888:1: ( ( Collides ) )
            // InternalKlangParser.g:1889:1: ( Collides )
            {
            // InternalKlangParser.g:1889:1: ( Collides )
            // InternalKlangParser.g:1890:2: Collides
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
    // InternalKlangParser.g:1899:1: rule__CollidesWith__Group__3 : rule__CollidesWith__Group__3__Impl rule__CollidesWith__Group__4 ;
    public final void rule__CollidesWith__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1903:1: ( rule__CollidesWith__Group__3__Impl rule__CollidesWith__Group__4 )
            // InternalKlangParser.g:1904:2: rule__CollidesWith__Group__3__Impl rule__CollidesWith__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalKlangParser.g:1911:1: rule__CollidesWith__Group__3__Impl : ( With ) ;
    public final void rule__CollidesWith__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1915:1: ( ( With ) )
            // InternalKlangParser.g:1916:1: ( With )
            {
            // InternalKlangParser.g:1916:1: ( With )
            // InternalKlangParser.g:1917:2: With
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
    // InternalKlangParser.g:1926:1: rule__CollidesWith__Group__4 : rule__CollidesWith__Group__4__Impl rule__CollidesWith__Group__5 ;
    public final void rule__CollidesWith__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1930:1: ( rule__CollidesWith__Group__4__Impl rule__CollidesWith__Group__5 )
            // InternalKlangParser.g:1931:2: rule__CollidesWith__Group__4__Impl rule__CollidesWith__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalKlangParser.g:1938:1: rule__CollidesWith__Group__4__Impl : ( ( rule__CollidesWith__TargetAssignment_4 ) ) ;
    public final void rule__CollidesWith__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1942:1: ( ( ( rule__CollidesWith__TargetAssignment_4 ) ) )
            // InternalKlangParser.g:1943:1: ( ( rule__CollidesWith__TargetAssignment_4 ) )
            {
            // InternalKlangParser.g:1943:1: ( ( rule__CollidesWith__TargetAssignment_4 ) )
            // InternalKlangParser.g:1944:2: ( rule__CollidesWith__TargetAssignment_4 )
            {
             before(grammarAccess.getCollidesWithAccess().getTargetAssignment_4()); 
            // InternalKlangParser.g:1945:2: ( rule__CollidesWith__TargetAssignment_4 )
            // InternalKlangParser.g:1945:3: rule__CollidesWith__TargetAssignment_4
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
    // InternalKlangParser.g:1953:1: rule__CollidesWith__Group__5 : rule__CollidesWith__Group__5__Impl rule__CollidesWith__Group__6 ;
    public final void rule__CollidesWith__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1957:1: ( rule__CollidesWith__Group__5__Impl rule__CollidesWith__Group__6 )
            // InternalKlangParser.g:1958:2: rule__CollidesWith__Group__5__Impl rule__CollidesWith__Group__6
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
    // InternalKlangParser.g:1965:1: rule__CollidesWith__Group__5__Impl : ( RULE_BEGIN ) ;
    public final void rule__CollidesWith__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1969:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:1970:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:1970:1: ( RULE_BEGIN )
            // InternalKlangParser.g:1971:2: RULE_BEGIN
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
    // InternalKlangParser.g:1980:1: rule__CollidesWith__Group__6 : rule__CollidesWith__Group__6__Impl rule__CollidesWith__Group__7 ;
    public final void rule__CollidesWith__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1984:1: ( rule__CollidesWith__Group__6__Impl rule__CollidesWith__Group__7 )
            // InternalKlangParser.g:1985:2: rule__CollidesWith__Group__6__Impl rule__CollidesWith__Group__7
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
    // InternalKlangParser.g:1992:1: rule__CollidesWith__Group__6__Impl : ( ( rule__CollidesWith__StatementsAssignment_6 )* ) ;
    public final void rule__CollidesWith__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1996:1: ( ( ( rule__CollidesWith__StatementsAssignment_6 )* ) )
            // InternalKlangParser.g:1997:1: ( ( rule__CollidesWith__StatementsAssignment_6 )* )
            {
            // InternalKlangParser.g:1997:1: ( ( rule__CollidesWith__StatementsAssignment_6 )* )
            // InternalKlangParser.g:1998:2: ( rule__CollidesWith__StatementsAssignment_6 )*
            {
             before(grammarAccess.getCollidesWithAccess().getStatementsAssignment_6()); 
            // InternalKlangParser.g:1999:2: ( rule__CollidesWith__StatementsAssignment_6 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Forever||(LA15_0>=Sleep && LA15_0<=While)||LA15_0==If||LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalKlangParser.g:1999:3: rule__CollidesWith__StatementsAssignment_6
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
    // InternalKlangParser.g:2007:1: rule__CollidesWith__Group__7 : rule__CollidesWith__Group__7__Impl ;
    public final void rule__CollidesWith__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2011:1: ( rule__CollidesWith__Group__7__Impl )
            // InternalKlangParser.g:2012:2: rule__CollidesWith__Group__7__Impl
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
    // InternalKlangParser.g:2018:1: rule__CollidesWith__Group__7__Impl : ( RULE_END ) ;
    public final void rule__CollidesWith__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2022:1: ( ( RULE_END ) )
            // InternalKlangParser.g:2023:1: ( RULE_END )
            {
            // InternalKlangParser.g:2023:1: ( RULE_END )
            // InternalKlangParser.g:2024:2: RULE_END
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
    // InternalKlangParser.g:2034:1: rule__WhileLoop__Group__0 : rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 ;
    public final void rule__WhileLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2038:1: ( rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 )
            // InternalKlangParser.g:2039:2: rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalKlangParser.g:2046:1: rule__WhileLoop__Group__0__Impl : ( () ) ;
    public final void rule__WhileLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2050:1: ( ( () ) )
            // InternalKlangParser.g:2051:1: ( () )
            {
            // InternalKlangParser.g:2051:1: ( () )
            // InternalKlangParser.g:2052:2: ()
            {
             before(grammarAccess.getWhileLoopAccess().getWhileLoopAction_0()); 
            // InternalKlangParser.g:2053:2: ()
            // InternalKlangParser.g:2053:3: 
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
    // InternalKlangParser.g:2061:1: rule__WhileLoop__Group__1 : rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 ;
    public final void rule__WhileLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2065:1: ( rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 )
            // InternalKlangParser.g:2066:2: rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalKlangParser.g:2073:1: rule__WhileLoop__Group__1__Impl : ( While ) ;
    public final void rule__WhileLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2077:1: ( ( While ) )
            // InternalKlangParser.g:2078:1: ( While )
            {
            // InternalKlangParser.g:2078:1: ( While )
            // InternalKlangParser.g:2079:2: While
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
    // InternalKlangParser.g:2088:1: rule__WhileLoop__Group__2 : rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 ;
    public final void rule__WhileLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2092:1: ( rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 )
            // InternalKlangParser.g:2093:2: rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalKlangParser.g:2100:1: rule__WhileLoop__Group__2__Impl : ( ( rule__WhileLoop__PredicateAssignment_2 ) ) ;
    public final void rule__WhileLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2104:1: ( ( ( rule__WhileLoop__PredicateAssignment_2 ) ) )
            // InternalKlangParser.g:2105:1: ( ( rule__WhileLoop__PredicateAssignment_2 ) )
            {
            // InternalKlangParser.g:2105:1: ( ( rule__WhileLoop__PredicateAssignment_2 ) )
            // InternalKlangParser.g:2106:2: ( rule__WhileLoop__PredicateAssignment_2 )
            {
             before(grammarAccess.getWhileLoopAccess().getPredicateAssignment_2()); 
            // InternalKlangParser.g:2107:2: ( rule__WhileLoop__PredicateAssignment_2 )
            // InternalKlangParser.g:2107:3: rule__WhileLoop__PredicateAssignment_2
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
    // InternalKlangParser.g:2115:1: rule__WhileLoop__Group__3 : rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 ;
    public final void rule__WhileLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2119:1: ( rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 )
            // InternalKlangParser.g:2120:2: rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4
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
    // InternalKlangParser.g:2127:1: rule__WhileLoop__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__WhileLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2131:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:2132:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:2132:1: ( RULE_BEGIN )
            // InternalKlangParser.g:2133:2: RULE_BEGIN
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
    // InternalKlangParser.g:2142:1: rule__WhileLoop__Group__4 : rule__WhileLoop__Group__4__Impl rule__WhileLoop__Group__5 ;
    public final void rule__WhileLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2146:1: ( rule__WhileLoop__Group__4__Impl rule__WhileLoop__Group__5 )
            // InternalKlangParser.g:2147:2: rule__WhileLoop__Group__4__Impl rule__WhileLoop__Group__5
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
    // InternalKlangParser.g:2154:1: rule__WhileLoop__Group__4__Impl : ( ( rule__WhileLoop__LoopBlockAssignment_4 )* ) ;
    public final void rule__WhileLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2158:1: ( ( ( rule__WhileLoop__LoopBlockAssignment_4 )* ) )
            // InternalKlangParser.g:2159:1: ( ( rule__WhileLoop__LoopBlockAssignment_4 )* )
            {
            // InternalKlangParser.g:2159:1: ( ( rule__WhileLoop__LoopBlockAssignment_4 )* )
            // InternalKlangParser.g:2160:2: ( rule__WhileLoop__LoopBlockAssignment_4 )*
            {
             before(grammarAccess.getWhileLoopAccess().getLoopBlockAssignment_4()); 
            // InternalKlangParser.g:2161:2: ( rule__WhileLoop__LoopBlockAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==Forever||(LA16_0>=Sleep && LA16_0<=While)||LA16_0==If||LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalKlangParser.g:2161:3: rule__WhileLoop__LoopBlockAssignment_4
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
    // InternalKlangParser.g:2169:1: rule__WhileLoop__Group__5 : rule__WhileLoop__Group__5__Impl ;
    public final void rule__WhileLoop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2173:1: ( rule__WhileLoop__Group__5__Impl )
            // InternalKlangParser.g:2174:2: rule__WhileLoop__Group__5__Impl
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
    // InternalKlangParser.g:2180:1: rule__WhileLoop__Group__5__Impl : ( RULE_END ) ;
    public final void rule__WhileLoop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2184:1: ( ( RULE_END ) )
            // InternalKlangParser.g:2185:1: ( RULE_END )
            {
            // InternalKlangParser.g:2185:1: ( RULE_END )
            // InternalKlangParser.g:2186:2: RULE_END
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
    // InternalKlangParser.g:2196:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2200:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalKlangParser.g:2201:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalKlangParser.g:2208:1: rule__If__Group__0__Impl : ( () ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2212:1: ( ( () ) )
            // InternalKlangParser.g:2213:1: ( () )
            {
            // InternalKlangParser.g:2213:1: ( () )
            // InternalKlangParser.g:2214:2: ()
            {
             before(grammarAccess.getIfAccess().getIfAction_0()); 
            // InternalKlangParser.g:2215:2: ()
            // InternalKlangParser.g:2215:3: 
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
    // InternalKlangParser.g:2223:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2227:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalKlangParser.g:2228:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalKlangParser.g:2235:1: rule__If__Group__1__Impl : ( If ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2239:1: ( ( If ) )
            // InternalKlangParser.g:2240:1: ( If )
            {
            // InternalKlangParser.g:2240:1: ( If )
            // InternalKlangParser.g:2241:2: If
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
    // InternalKlangParser.g:2250:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2254:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // InternalKlangParser.g:2255:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalKlangParser.g:2262:1: rule__If__Group__2__Impl : ( ( rule__If__PredicateAssignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2266:1: ( ( ( rule__If__PredicateAssignment_2 ) ) )
            // InternalKlangParser.g:2267:1: ( ( rule__If__PredicateAssignment_2 ) )
            {
            // InternalKlangParser.g:2267:1: ( ( rule__If__PredicateAssignment_2 ) )
            // InternalKlangParser.g:2268:2: ( rule__If__PredicateAssignment_2 )
            {
             before(grammarAccess.getIfAccess().getPredicateAssignment_2()); 
            // InternalKlangParser.g:2269:2: ( rule__If__PredicateAssignment_2 )
            // InternalKlangParser.g:2269:3: rule__If__PredicateAssignment_2
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
    // InternalKlangParser.g:2277:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2281:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // InternalKlangParser.g:2282:2: rule__If__Group__3__Impl rule__If__Group__4
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
    // InternalKlangParser.g:2289:1: rule__If__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2293:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:2294:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:2294:1: ( RULE_BEGIN )
            // InternalKlangParser.g:2295:2: RULE_BEGIN
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
    // InternalKlangParser.g:2304:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2308:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // InternalKlangParser.g:2309:2: rule__If__Group__4__Impl rule__If__Group__5
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
    // InternalKlangParser.g:2316:1: rule__If__Group__4__Impl : ( ( rule__If__IfBlockAssignment_4 )* ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2320:1: ( ( ( rule__If__IfBlockAssignment_4 )* ) )
            // InternalKlangParser.g:2321:1: ( ( rule__If__IfBlockAssignment_4 )* )
            {
            // InternalKlangParser.g:2321:1: ( ( rule__If__IfBlockAssignment_4 )* )
            // InternalKlangParser.g:2322:2: ( rule__If__IfBlockAssignment_4 )*
            {
             before(grammarAccess.getIfAccess().getIfBlockAssignment_4()); 
            // InternalKlangParser.g:2323:2: ( rule__If__IfBlockAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Forever||(LA17_0>=Sleep && LA17_0<=While)||LA17_0==If||LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalKlangParser.g:2323:3: rule__If__IfBlockAssignment_4
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
    // InternalKlangParser.g:2331:1: rule__If__Group__5 : rule__If__Group__5__Impl rule__If__Group__6 ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2335:1: ( rule__If__Group__5__Impl rule__If__Group__6 )
            // InternalKlangParser.g:2336:2: rule__If__Group__5__Impl rule__If__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalKlangParser.g:2343:1: rule__If__Group__5__Impl : ( RULE_END ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2347:1: ( ( RULE_END ) )
            // InternalKlangParser.g:2348:1: ( RULE_END )
            {
            // InternalKlangParser.g:2348:1: ( RULE_END )
            // InternalKlangParser.g:2349:2: RULE_END
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
    // InternalKlangParser.g:2358:1: rule__If__Group__6 : rule__If__Group__6__Impl ;
    public final void rule__If__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2362:1: ( rule__If__Group__6__Impl )
            // InternalKlangParser.g:2363:2: rule__If__Group__6__Impl
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
    // InternalKlangParser.g:2369:1: rule__If__Group__6__Impl : ( ( rule__If__Group_6__0 )? ) ;
    public final void rule__If__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2373:1: ( ( ( rule__If__Group_6__0 )? ) )
            // InternalKlangParser.g:2374:1: ( ( rule__If__Group_6__0 )? )
            {
            // InternalKlangParser.g:2374:1: ( ( rule__If__Group_6__0 )? )
            // InternalKlangParser.g:2375:2: ( rule__If__Group_6__0 )?
            {
             before(grammarAccess.getIfAccess().getGroup_6()); 
            // InternalKlangParser.g:2376:2: ( rule__If__Group_6__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Else) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalKlangParser.g:2376:3: rule__If__Group_6__0
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
    // InternalKlangParser.g:2385:1: rule__If__Group_6__0 : rule__If__Group_6__0__Impl rule__If__Group_6__1 ;
    public final void rule__If__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2389:1: ( rule__If__Group_6__0__Impl rule__If__Group_6__1 )
            // InternalKlangParser.g:2390:2: rule__If__Group_6__0__Impl rule__If__Group_6__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalKlangParser.g:2397:1: rule__If__Group_6__0__Impl : ( Else ) ;
    public final void rule__If__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2401:1: ( ( Else ) )
            // InternalKlangParser.g:2402:1: ( Else )
            {
            // InternalKlangParser.g:2402:1: ( Else )
            // InternalKlangParser.g:2403:2: Else
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
    // InternalKlangParser.g:2412:1: rule__If__Group_6__1 : rule__If__Group_6__1__Impl rule__If__Group_6__2 ;
    public final void rule__If__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2416:1: ( rule__If__Group_6__1__Impl rule__If__Group_6__2 )
            // InternalKlangParser.g:2417:2: rule__If__Group_6__1__Impl rule__If__Group_6__2
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
    // InternalKlangParser.g:2424:1: rule__If__Group_6__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__If__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2428:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:2429:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:2429:1: ( RULE_BEGIN )
            // InternalKlangParser.g:2430:2: RULE_BEGIN
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
    // InternalKlangParser.g:2439:1: rule__If__Group_6__2 : rule__If__Group_6__2__Impl rule__If__Group_6__3 ;
    public final void rule__If__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2443:1: ( rule__If__Group_6__2__Impl rule__If__Group_6__3 )
            // InternalKlangParser.g:2444:2: rule__If__Group_6__2__Impl rule__If__Group_6__3
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
    // InternalKlangParser.g:2451:1: rule__If__Group_6__2__Impl : ( ( rule__If__ElseBlockAssignment_6_2 )* ) ;
    public final void rule__If__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2455:1: ( ( ( rule__If__ElseBlockAssignment_6_2 )* ) )
            // InternalKlangParser.g:2456:1: ( ( rule__If__ElseBlockAssignment_6_2 )* )
            {
            // InternalKlangParser.g:2456:1: ( ( rule__If__ElseBlockAssignment_6_2 )* )
            // InternalKlangParser.g:2457:2: ( rule__If__ElseBlockAssignment_6_2 )*
            {
             before(grammarAccess.getIfAccess().getElseBlockAssignment_6_2()); 
            // InternalKlangParser.g:2458:2: ( rule__If__ElseBlockAssignment_6_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==Forever||(LA19_0>=Sleep && LA19_0<=While)||LA19_0==If||LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalKlangParser.g:2458:3: rule__If__ElseBlockAssignment_6_2
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
    // InternalKlangParser.g:2466:1: rule__If__Group_6__3 : rule__If__Group_6__3__Impl ;
    public final void rule__If__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2470:1: ( rule__If__Group_6__3__Impl )
            // InternalKlangParser.g:2471:2: rule__If__Group_6__3__Impl
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
    // InternalKlangParser.g:2477:1: rule__If__Group_6__3__Impl : ( RULE_END ) ;
    public final void rule__If__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2481:1: ( ( RULE_END ) )
            // InternalKlangParser.g:2482:1: ( RULE_END )
            {
            // InternalKlangParser.g:2482:1: ( RULE_END )
            // InternalKlangParser.g:2483:2: RULE_END
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
    // InternalKlangParser.g:2493:1: rule__ForeverLoop__Group__0 : rule__ForeverLoop__Group__0__Impl rule__ForeverLoop__Group__1 ;
    public final void rule__ForeverLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2497:1: ( rule__ForeverLoop__Group__0__Impl rule__ForeverLoop__Group__1 )
            // InternalKlangParser.g:2498:2: rule__ForeverLoop__Group__0__Impl rule__ForeverLoop__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalKlangParser.g:2505:1: rule__ForeverLoop__Group__0__Impl : ( () ) ;
    public final void rule__ForeverLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2509:1: ( ( () ) )
            // InternalKlangParser.g:2510:1: ( () )
            {
            // InternalKlangParser.g:2510:1: ( () )
            // InternalKlangParser.g:2511:2: ()
            {
             before(grammarAccess.getForeverLoopAccess().getForeverLoopAction_0()); 
            // InternalKlangParser.g:2512:2: ()
            // InternalKlangParser.g:2512:3: 
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
    // InternalKlangParser.g:2520:1: rule__ForeverLoop__Group__1 : rule__ForeverLoop__Group__1__Impl rule__ForeverLoop__Group__2 ;
    public final void rule__ForeverLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2524:1: ( rule__ForeverLoop__Group__1__Impl rule__ForeverLoop__Group__2 )
            // InternalKlangParser.g:2525:2: rule__ForeverLoop__Group__1__Impl rule__ForeverLoop__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalKlangParser.g:2532:1: rule__ForeverLoop__Group__1__Impl : ( Forever ) ;
    public final void rule__ForeverLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2536:1: ( ( Forever ) )
            // InternalKlangParser.g:2537:1: ( Forever )
            {
            // InternalKlangParser.g:2537:1: ( Forever )
            // InternalKlangParser.g:2538:2: Forever
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
    // InternalKlangParser.g:2547:1: rule__ForeverLoop__Group__2 : rule__ForeverLoop__Group__2__Impl rule__ForeverLoop__Group__3 ;
    public final void rule__ForeverLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2551:1: ( rule__ForeverLoop__Group__2__Impl rule__ForeverLoop__Group__3 )
            // InternalKlangParser.g:2552:2: rule__ForeverLoop__Group__2__Impl rule__ForeverLoop__Group__3
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
    // InternalKlangParser.g:2559:1: rule__ForeverLoop__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__ForeverLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2563:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:2564:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:2564:1: ( RULE_BEGIN )
            // InternalKlangParser.g:2565:2: RULE_BEGIN
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
    // InternalKlangParser.g:2574:1: rule__ForeverLoop__Group__3 : rule__ForeverLoop__Group__3__Impl rule__ForeverLoop__Group__4 ;
    public final void rule__ForeverLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2578:1: ( rule__ForeverLoop__Group__3__Impl rule__ForeverLoop__Group__4 )
            // InternalKlangParser.g:2579:2: rule__ForeverLoop__Group__3__Impl rule__ForeverLoop__Group__4
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
    // InternalKlangParser.g:2586:1: rule__ForeverLoop__Group__3__Impl : ( ( rule__ForeverLoop__LoopStatementsAssignment_3 )* ) ;
    public final void rule__ForeverLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2590:1: ( ( ( rule__ForeverLoop__LoopStatementsAssignment_3 )* ) )
            // InternalKlangParser.g:2591:1: ( ( rule__ForeverLoop__LoopStatementsAssignment_3 )* )
            {
            // InternalKlangParser.g:2591:1: ( ( rule__ForeverLoop__LoopStatementsAssignment_3 )* )
            // InternalKlangParser.g:2592:2: ( rule__ForeverLoop__LoopStatementsAssignment_3 )*
            {
             before(grammarAccess.getForeverLoopAccess().getLoopStatementsAssignment_3()); 
            // InternalKlangParser.g:2593:2: ( rule__ForeverLoop__LoopStatementsAssignment_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==Forever||(LA20_0>=Sleep && LA20_0<=While)||LA20_0==If||LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalKlangParser.g:2593:3: rule__ForeverLoop__LoopStatementsAssignment_3
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
    // InternalKlangParser.g:2601:1: rule__ForeverLoop__Group__4 : rule__ForeverLoop__Group__4__Impl ;
    public final void rule__ForeverLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2605:1: ( rule__ForeverLoop__Group__4__Impl )
            // InternalKlangParser.g:2606:2: rule__ForeverLoop__Group__4__Impl
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
    // InternalKlangParser.g:2612:1: rule__ForeverLoop__Group__4__Impl : ( RULE_END ) ;
    public final void rule__ForeverLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2616:1: ( ( RULE_END ) )
            // InternalKlangParser.g:2617:1: ( RULE_END )
            {
            // InternalKlangParser.g:2617:1: ( RULE_END )
            // InternalKlangParser.g:2618:2: RULE_END
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


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // InternalKlangParser.g:2628:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2632:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalKlangParser.g:2633:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0"


    // $ANTLR start "rule__VariableDeclaration__Group__0__Impl"
    // InternalKlangParser.g:2640:1: rule__VariableDeclaration__Group__0__Impl : ( Var ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2644:1: ( ( Var ) )
            // InternalKlangParser.g:2645:1: ( Var )
            {
            // InternalKlangParser.g:2645:1: ( Var )
            // InternalKlangParser.g:2646:2: Var
            {
             before(grammarAccess.getVariableDeclarationAccess().getVarKeyword_0()); 
            match(input,Var,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__1"
    // InternalKlangParser.g:2655:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2659:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // InternalKlangParser.g:2660:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1"


    // $ANTLR start "rule__VariableDeclaration__Group__1__Impl"
    // InternalKlangParser.g:2667:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2671:1: ( ( ( rule__VariableDeclaration__NameAssignment_1 ) ) )
            // InternalKlangParser.g:2672:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            {
            // InternalKlangParser.g:2672:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            // InternalKlangParser.g:2673:2: ( rule__VariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
            // InternalKlangParser.g:2674:2: ( rule__VariableDeclaration__NameAssignment_1 )
            // InternalKlangParser.g:2674:3: rule__VariableDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__2"
    // InternalKlangParser.g:2682:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2686:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // InternalKlangParser.g:2687:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__VariableDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__2"


    // $ANTLR start "rule__VariableDeclaration__Group__2__Impl"
    // InternalKlangParser.g:2694:1: rule__VariableDeclaration__Group__2__Impl : ( EqualsSign ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2698:1: ( ( EqualsSign ) )
            // InternalKlangParser.g:2699:1: ( EqualsSign )
            {
            // InternalKlangParser.g:2699:1: ( EqualsSign )
            // InternalKlangParser.g:2700:2: EqualsSign
            {
             before(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2()); 
            match(input,EqualsSign,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__3"
    // InternalKlangParser.g:2709:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2713:1: ( rule__VariableDeclaration__Group__3__Impl )
            // InternalKlangParser.g:2714:2: rule__VariableDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__3"


    // $ANTLR start "rule__VariableDeclaration__Group__3__Impl"
    // InternalKlangParser.g:2720:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__ExpressionAssignment_3 ) ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2724:1: ( ( ( rule__VariableDeclaration__ExpressionAssignment_3 ) ) )
            // InternalKlangParser.g:2725:1: ( ( rule__VariableDeclaration__ExpressionAssignment_3 ) )
            {
            // InternalKlangParser.g:2725:1: ( ( rule__VariableDeclaration__ExpressionAssignment_3 ) )
            // InternalKlangParser.g:2726:2: ( rule__VariableDeclaration__ExpressionAssignment_3 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getExpressionAssignment_3()); 
            // InternalKlangParser.g:2727:2: ( rule__VariableDeclaration__ExpressionAssignment_3 )
            // InternalKlangParser.g:2727:3: rule__VariableDeclaration__ExpressionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__ExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getExpressionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__3__Impl"


    // $ANTLR start "rule__VariableAssignment__Group__0"
    // InternalKlangParser.g:2736:1: rule__VariableAssignment__Group__0 : rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1 ;
    public final void rule__VariableAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2740:1: ( rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1 )
            // InternalKlangParser.g:2741:2: rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalKlangParser.g:2748:1: rule__VariableAssignment__Group__0__Impl : ( ( rule__VariableAssignment__VariableNameAssignment_0 ) ) ;
    public final void rule__VariableAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2752:1: ( ( ( rule__VariableAssignment__VariableNameAssignment_0 ) ) )
            // InternalKlangParser.g:2753:1: ( ( rule__VariableAssignment__VariableNameAssignment_0 ) )
            {
            // InternalKlangParser.g:2753:1: ( ( rule__VariableAssignment__VariableNameAssignment_0 ) )
            // InternalKlangParser.g:2754:2: ( rule__VariableAssignment__VariableNameAssignment_0 )
            {
             before(grammarAccess.getVariableAssignmentAccess().getVariableNameAssignment_0()); 
            // InternalKlangParser.g:2755:2: ( rule__VariableAssignment__VariableNameAssignment_0 )
            // InternalKlangParser.g:2755:3: rule__VariableAssignment__VariableNameAssignment_0
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
    // InternalKlangParser.g:2763:1: rule__VariableAssignment__Group__1 : rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2 ;
    public final void rule__VariableAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2767:1: ( rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2 )
            // InternalKlangParser.g:2768:2: rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalKlangParser.g:2775:1: rule__VariableAssignment__Group__1__Impl : ( EqualsSign ) ;
    public final void rule__VariableAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2779:1: ( ( EqualsSign ) )
            // InternalKlangParser.g:2780:1: ( EqualsSign )
            {
            // InternalKlangParser.g:2780:1: ( EqualsSign )
            // InternalKlangParser.g:2781:2: EqualsSign
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
    // InternalKlangParser.g:2790:1: rule__VariableAssignment__Group__2 : rule__VariableAssignment__Group__2__Impl ;
    public final void rule__VariableAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2794:1: ( rule__VariableAssignment__Group__2__Impl )
            // InternalKlangParser.g:2795:2: rule__VariableAssignment__Group__2__Impl
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
    // InternalKlangParser.g:2801:1: rule__VariableAssignment__Group__2__Impl : ( ( rule__VariableAssignment__ExpressionAssignment_2 ) ) ;
    public final void rule__VariableAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2805:1: ( ( ( rule__VariableAssignment__ExpressionAssignment_2 ) ) )
            // InternalKlangParser.g:2806:1: ( ( rule__VariableAssignment__ExpressionAssignment_2 ) )
            {
            // InternalKlangParser.g:2806:1: ( ( rule__VariableAssignment__ExpressionAssignment_2 ) )
            // InternalKlangParser.g:2807:2: ( rule__VariableAssignment__ExpressionAssignment_2 )
            {
             before(grammarAccess.getVariableAssignmentAccess().getExpressionAssignment_2()); 
            // InternalKlangParser.g:2808:2: ( rule__VariableAssignment__ExpressionAssignment_2 )
            // InternalKlangParser.g:2808:3: rule__VariableAssignment__ExpressionAssignment_2
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
    // InternalKlangParser.g:2817:1: rule__Sleep__Group__0 : rule__Sleep__Group__0__Impl rule__Sleep__Group__1 ;
    public final void rule__Sleep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2821:1: ( rule__Sleep__Group__0__Impl rule__Sleep__Group__1 )
            // InternalKlangParser.g:2822:2: rule__Sleep__Group__0__Impl rule__Sleep__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalKlangParser.g:2829:1: rule__Sleep__Group__0__Impl : ( () ) ;
    public final void rule__Sleep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2833:1: ( ( () ) )
            // InternalKlangParser.g:2834:1: ( () )
            {
            // InternalKlangParser.g:2834:1: ( () )
            // InternalKlangParser.g:2835:2: ()
            {
             before(grammarAccess.getSleepAccess().getSleepAction_0()); 
            // InternalKlangParser.g:2836:2: ()
            // InternalKlangParser.g:2836:3: 
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
    // InternalKlangParser.g:2844:1: rule__Sleep__Group__1 : rule__Sleep__Group__1__Impl rule__Sleep__Group__2 ;
    public final void rule__Sleep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2848:1: ( rule__Sleep__Group__1__Impl rule__Sleep__Group__2 )
            // InternalKlangParser.g:2849:2: rule__Sleep__Group__1__Impl rule__Sleep__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalKlangParser.g:2856:1: rule__Sleep__Group__1__Impl : ( Sleep ) ;
    public final void rule__Sleep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2860:1: ( ( Sleep ) )
            // InternalKlangParser.g:2861:1: ( Sleep )
            {
            // InternalKlangParser.g:2861:1: ( Sleep )
            // InternalKlangParser.g:2862:2: Sleep
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
    // InternalKlangParser.g:2871:1: rule__Sleep__Group__2 : rule__Sleep__Group__2__Impl rule__Sleep__Group__3 ;
    public final void rule__Sleep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2875:1: ( rule__Sleep__Group__2__Impl rule__Sleep__Group__3 )
            // InternalKlangParser.g:2876:2: rule__Sleep__Group__2__Impl rule__Sleep__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalKlangParser.g:2883:1: rule__Sleep__Group__2__Impl : ( LeftParenthesis ) ;
    public final void rule__Sleep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2887:1: ( ( LeftParenthesis ) )
            // InternalKlangParser.g:2888:1: ( LeftParenthesis )
            {
            // InternalKlangParser.g:2888:1: ( LeftParenthesis )
            // InternalKlangParser.g:2889:2: LeftParenthesis
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
    // InternalKlangParser.g:2898:1: rule__Sleep__Group__3 : rule__Sleep__Group__3__Impl rule__Sleep__Group__4 ;
    public final void rule__Sleep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2902:1: ( rule__Sleep__Group__3__Impl rule__Sleep__Group__4 )
            // InternalKlangParser.g:2903:2: rule__Sleep__Group__3__Impl rule__Sleep__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalKlangParser.g:2910:1: rule__Sleep__Group__3__Impl : ( ( rule__Sleep__DurationAssignment_3 ) ) ;
    public final void rule__Sleep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2914:1: ( ( ( rule__Sleep__DurationAssignment_3 ) ) )
            // InternalKlangParser.g:2915:1: ( ( rule__Sleep__DurationAssignment_3 ) )
            {
            // InternalKlangParser.g:2915:1: ( ( rule__Sleep__DurationAssignment_3 ) )
            // InternalKlangParser.g:2916:2: ( rule__Sleep__DurationAssignment_3 )
            {
             before(grammarAccess.getSleepAccess().getDurationAssignment_3()); 
            // InternalKlangParser.g:2917:2: ( rule__Sleep__DurationAssignment_3 )
            // InternalKlangParser.g:2917:3: rule__Sleep__DurationAssignment_3
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
    // InternalKlangParser.g:2925:1: rule__Sleep__Group__4 : rule__Sleep__Group__4__Impl ;
    public final void rule__Sleep__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2929:1: ( rule__Sleep__Group__4__Impl )
            // InternalKlangParser.g:2930:2: rule__Sleep__Group__4__Impl
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
    // InternalKlangParser.g:2936:1: rule__Sleep__Group__4__Impl : ( RightParenthesis ) ;
    public final void rule__Sleep__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2940:1: ( ( RightParenthesis ) )
            // InternalKlangParser.g:2941:1: ( RightParenthesis )
            {
            // InternalKlangParser.g:2941:1: ( RightParenthesis )
            // InternalKlangParser.g:2942:2: RightParenthesis
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
    // InternalKlangParser.g:2952:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2956:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalKlangParser.g:2957:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalKlangParser.g:2964:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2968:1: ( ( ruleAnd ) )
            // InternalKlangParser.g:2969:1: ( ruleAnd )
            {
            // InternalKlangParser.g:2969:1: ( ruleAnd )
            // InternalKlangParser.g:2970:2: ruleAnd
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
    // InternalKlangParser.g:2979:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2983:1: ( rule__Or__Group__1__Impl )
            // InternalKlangParser.g:2984:2: rule__Or__Group__1__Impl
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
    // InternalKlangParser.g:2990:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2994:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalKlangParser.g:2995:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalKlangParser.g:2995:1: ( ( rule__Or__Group_1__0 )* )
            // InternalKlangParser.g:2996:2: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // InternalKlangParser.g:2997:2: ( rule__Or__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Or) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalKlangParser.g:2997:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_32);
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
    // InternalKlangParser.g:3006:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3010:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalKlangParser.g:3011:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalKlangParser.g:3018:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3022:1: ( ( () ) )
            // InternalKlangParser.g:3023:1: ( () )
            {
            // InternalKlangParser.g:3023:1: ( () )
            // InternalKlangParser.g:3024:2: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // InternalKlangParser.g:3025:2: ()
            // InternalKlangParser.g:3025:3: 
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
    // InternalKlangParser.g:3033:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3037:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalKlangParser.g:3038:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalKlangParser.g:3045:1: rule__Or__Group_1__1__Impl : ( Or ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3049:1: ( ( Or ) )
            // InternalKlangParser.g:3050:1: ( Or )
            {
            // InternalKlangParser.g:3050:1: ( Or )
            // InternalKlangParser.g:3051:2: Or
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
    // InternalKlangParser.g:3060:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3064:1: ( rule__Or__Group_1__2__Impl )
            // InternalKlangParser.g:3065:2: rule__Or__Group_1__2__Impl
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
    // InternalKlangParser.g:3071:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3075:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:3076:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:3076:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalKlangParser.g:3077:2: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:3078:2: ( rule__Or__RightAssignment_1_2 )
            // InternalKlangParser.g:3078:3: rule__Or__RightAssignment_1_2
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
    // InternalKlangParser.g:3087:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3091:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalKlangParser.g:3092:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalKlangParser.g:3099:1: rule__And__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3103:1: ( ( ruleComparison ) )
            // InternalKlangParser.g:3104:1: ( ruleComparison )
            {
            // InternalKlangParser.g:3104:1: ( ruleComparison )
            // InternalKlangParser.g:3105:2: ruleComparison
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
    // InternalKlangParser.g:3114:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3118:1: ( rule__And__Group__1__Impl )
            // InternalKlangParser.g:3119:2: rule__And__Group__1__Impl
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
    // InternalKlangParser.g:3125:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3129:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalKlangParser.g:3130:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalKlangParser.g:3130:1: ( ( rule__And__Group_1__0 )* )
            // InternalKlangParser.g:3131:2: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // InternalKlangParser.g:3132:2: ( rule__And__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==And) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalKlangParser.g:3132:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_34);
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
    // InternalKlangParser.g:3141:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3145:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalKlangParser.g:3146:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalKlangParser.g:3153:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3157:1: ( ( () ) )
            // InternalKlangParser.g:3158:1: ( () )
            {
            // InternalKlangParser.g:3158:1: ( () )
            // InternalKlangParser.g:3159:2: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // InternalKlangParser.g:3160:2: ()
            // InternalKlangParser.g:3160:3: 
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
    // InternalKlangParser.g:3168:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3172:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalKlangParser.g:3173:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalKlangParser.g:3180:1: rule__And__Group_1__1__Impl : ( And ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3184:1: ( ( And ) )
            // InternalKlangParser.g:3185:1: ( And )
            {
            // InternalKlangParser.g:3185:1: ( And )
            // InternalKlangParser.g:3186:2: And
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
    // InternalKlangParser.g:3195:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3199:1: ( rule__And__Group_1__2__Impl )
            // InternalKlangParser.g:3200:2: rule__And__Group_1__2__Impl
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
    // InternalKlangParser.g:3206:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3210:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:3211:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:3211:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalKlangParser.g:3212:2: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:3213:2: ( rule__And__RightAssignment_1_2 )
            // InternalKlangParser.g:3213:3: rule__And__RightAssignment_1_2
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
    // InternalKlangParser.g:3222:1: rule__Plus__Group__0 : rule__Plus__Group__0__Impl rule__Plus__Group__1 ;
    public final void rule__Plus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3226:1: ( rule__Plus__Group__0__Impl rule__Plus__Group__1 )
            // InternalKlangParser.g:3227:2: rule__Plus__Group__0__Impl rule__Plus__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalKlangParser.g:3234:1: rule__Plus__Group__0__Impl : ( ruleMinus ) ;
    public final void rule__Plus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3238:1: ( ( ruleMinus ) )
            // InternalKlangParser.g:3239:1: ( ruleMinus )
            {
            // InternalKlangParser.g:3239:1: ( ruleMinus )
            // InternalKlangParser.g:3240:2: ruleMinus
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
    // InternalKlangParser.g:3249:1: rule__Plus__Group__1 : rule__Plus__Group__1__Impl ;
    public final void rule__Plus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3253:1: ( rule__Plus__Group__1__Impl )
            // InternalKlangParser.g:3254:2: rule__Plus__Group__1__Impl
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
    // InternalKlangParser.g:3260:1: rule__Plus__Group__1__Impl : ( ( rule__Plus__Group_1__0 )* ) ;
    public final void rule__Plus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3264:1: ( ( ( rule__Plus__Group_1__0 )* ) )
            // InternalKlangParser.g:3265:1: ( ( rule__Plus__Group_1__0 )* )
            {
            // InternalKlangParser.g:3265:1: ( ( rule__Plus__Group_1__0 )* )
            // InternalKlangParser.g:3266:2: ( rule__Plus__Group_1__0 )*
            {
             before(grammarAccess.getPlusAccess().getGroup_1()); 
            // InternalKlangParser.g:3267:2: ( rule__Plus__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==PlusSign) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalKlangParser.g:3267:3: rule__Plus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_36);
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
    // InternalKlangParser.g:3276:1: rule__Plus__Group_1__0 : rule__Plus__Group_1__0__Impl rule__Plus__Group_1__1 ;
    public final void rule__Plus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3280:1: ( rule__Plus__Group_1__0__Impl rule__Plus__Group_1__1 )
            // InternalKlangParser.g:3281:2: rule__Plus__Group_1__0__Impl rule__Plus__Group_1__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalKlangParser.g:3288:1: rule__Plus__Group_1__0__Impl : ( () ) ;
    public final void rule__Plus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3292:1: ( ( () ) )
            // InternalKlangParser.g:3293:1: ( () )
            {
            // InternalKlangParser.g:3293:1: ( () )
            // InternalKlangParser.g:3294:2: ()
            {
             before(grammarAccess.getPlusAccess().getPlusLeftAction_1_0()); 
            // InternalKlangParser.g:3295:2: ()
            // InternalKlangParser.g:3295:3: 
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
    // InternalKlangParser.g:3303:1: rule__Plus__Group_1__1 : rule__Plus__Group_1__1__Impl rule__Plus__Group_1__2 ;
    public final void rule__Plus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3307:1: ( rule__Plus__Group_1__1__Impl rule__Plus__Group_1__2 )
            // InternalKlangParser.g:3308:2: rule__Plus__Group_1__1__Impl rule__Plus__Group_1__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalKlangParser.g:3315:1: rule__Plus__Group_1__1__Impl : ( PlusSign ) ;
    public final void rule__Plus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3319:1: ( ( PlusSign ) )
            // InternalKlangParser.g:3320:1: ( PlusSign )
            {
            // InternalKlangParser.g:3320:1: ( PlusSign )
            // InternalKlangParser.g:3321:2: PlusSign
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
    // InternalKlangParser.g:3330:1: rule__Plus__Group_1__2 : rule__Plus__Group_1__2__Impl ;
    public final void rule__Plus__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3334:1: ( rule__Plus__Group_1__2__Impl )
            // InternalKlangParser.g:3335:2: rule__Plus__Group_1__2__Impl
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
    // InternalKlangParser.g:3341:1: rule__Plus__Group_1__2__Impl : ( ( rule__Plus__RightAssignment_1_2 ) ) ;
    public final void rule__Plus__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3345:1: ( ( ( rule__Plus__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:3346:1: ( ( rule__Plus__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:3346:1: ( ( rule__Plus__RightAssignment_1_2 ) )
            // InternalKlangParser.g:3347:2: ( rule__Plus__RightAssignment_1_2 )
            {
             before(grammarAccess.getPlusAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:3348:2: ( rule__Plus__RightAssignment_1_2 )
            // InternalKlangParser.g:3348:3: rule__Plus__RightAssignment_1_2
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
    // InternalKlangParser.g:3357:1: rule__Minus__Group__0 : rule__Minus__Group__0__Impl rule__Minus__Group__1 ;
    public final void rule__Minus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3361:1: ( rule__Minus__Group__0__Impl rule__Minus__Group__1 )
            // InternalKlangParser.g:3362:2: rule__Minus__Group__0__Impl rule__Minus__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalKlangParser.g:3369:1: rule__Minus__Group__0__Impl : ( ruleMultiply ) ;
    public final void rule__Minus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3373:1: ( ( ruleMultiply ) )
            // InternalKlangParser.g:3374:1: ( ruleMultiply )
            {
            // InternalKlangParser.g:3374:1: ( ruleMultiply )
            // InternalKlangParser.g:3375:2: ruleMultiply
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
    // InternalKlangParser.g:3384:1: rule__Minus__Group__1 : rule__Minus__Group__1__Impl ;
    public final void rule__Minus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3388:1: ( rule__Minus__Group__1__Impl )
            // InternalKlangParser.g:3389:2: rule__Minus__Group__1__Impl
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
    // InternalKlangParser.g:3395:1: rule__Minus__Group__1__Impl : ( ( rule__Minus__Group_1__0 )* ) ;
    public final void rule__Minus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3399:1: ( ( ( rule__Minus__Group_1__0 )* ) )
            // InternalKlangParser.g:3400:1: ( ( rule__Minus__Group_1__0 )* )
            {
            // InternalKlangParser.g:3400:1: ( ( rule__Minus__Group_1__0 )* )
            // InternalKlangParser.g:3401:2: ( rule__Minus__Group_1__0 )*
            {
             before(grammarAccess.getMinusAccess().getGroup_1()); 
            // InternalKlangParser.g:3402:2: ( rule__Minus__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==HyphenMinus) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalKlangParser.g:3402:3: rule__Minus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_38);
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
    // InternalKlangParser.g:3411:1: rule__Minus__Group_1__0 : rule__Minus__Group_1__0__Impl rule__Minus__Group_1__1 ;
    public final void rule__Minus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3415:1: ( rule__Minus__Group_1__0__Impl rule__Minus__Group_1__1 )
            // InternalKlangParser.g:3416:2: rule__Minus__Group_1__0__Impl rule__Minus__Group_1__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalKlangParser.g:3423:1: rule__Minus__Group_1__0__Impl : ( () ) ;
    public final void rule__Minus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3427:1: ( ( () ) )
            // InternalKlangParser.g:3428:1: ( () )
            {
            // InternalKlangParser.g:3428:1: ( () )
            // InternalKlangParser.g:3429:2: ()
            {
             before(grammarAccess.getMinusAccess().getMinusLeftAction_1_0()); 
            // InternalKlangParser.g:3430:2: ()
            // InternalKlangParser.g:3430:3: 
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
    // InternalKlangParser.g:3438:1: rule__Minus__Group_1__1 : rule__Minus__Group_1__1__Impl rule__Minus__Group_1__2 ;
    public final void rule__Minus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3442:1: ( rule__Minus__Group_1__1__Impl rule__Minus__Group_1__2 )
            // InternalKlangParser.g:3443:2: rule__Minus__Group_1__1__Impl rule__Minus__Group_1__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalKlangParser.g:3450:1: rule__Minus__Group_1__1__Impl : ( HyphenMinus ) ;
    public final void rule__Minus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3454:1: ( ( HyphenMinus ) )
            // InternalKlangParser.g:3455:1: ( HyphenMinus )
            {
            // InternalKlangParser.g:3455:1: ( HyphenMinus )
            // InternalKlangParser.g:3456:2: HyphenMinus
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
    // InternalKlangParser.g:3465:1: rule__Minus__Group_1__2 : rule__Minus__Group_1__2__Impl ;
    public final void rule__Minus__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3469:1: ( rule__Minus__Group_1__2__Impl )
            // InternalKlangParser.g:3470:2: rule__Minus__Group_1__2__Impl
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
    // InternalKlangParser.g:3476:1: rule__Minus__Group_1__2__Impl : ( ( rule__Minus__RightAssignment_1_2 ) ) ;
    public final void rule__Minus__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3480:1: ( ( ( rule__Minus__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:3481:1: ( ( rule__Minus__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:3481:1: ( ( rule__Minus__RightAssignment_1_2 ) )
            // InternalKlangParser.g:3482:2: ( rule__Minus__RightAssignment_1_2 )
            {
             before(grammarAccess.getMinusAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:3483:2: ( rule__Minus__RightAssignment_1_2 )
            // InternalKlangParser.g:3483:3: rule__Minus__RightAssignment_1_2
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
    // InternalKlangParser.g:3492:1: rule__Multiply__Group__0 : rule__Multiply__Group__0__Impl rule__Multiply__Group__1 ;
    public final void rule__Multiply__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3496:1: ( rule__Multiply__Group__0__Impl rule__Multiply__Group__1 )
            // InternalKlangParser.g:3497:2: rule__Multiply__Group__0__Impl rule__Multiply__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalKlangParser.g:3504:1: rule__Multiply__Group__0__Impl : ( ruleDivide ) ;
    public final void rule__Multiply__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3508:1: ( ( ruleDivide ) )
            // InternalKlangParser.g:3509:1: ( ruleDivide )
            {
            // InternalKlangParser.g:3509:1: ( ruleDivide )
            // InternalKlangParser.g:3510:2: ruleDivide
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
    // InternalKlangParser.g:3519:1: rule__Multiply__Group__1 : rule__Multiply__Group__1__Impl ;
    public final void rule__Multiply__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3523:1: ( rule__Multiply__Group__1__Impl )
            // InternalKlangParser.g:3524:2: rule__Multiply__Group__1__Impl
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
    // InternalKlangParser.g:3530:1: rule__Multiply__Group__1__Impl : ( ( rule__Multiply__Group_1__0 )* ) ;
    public final void rule__Multiply__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3534:1: ( ( ( rule__Multiply__Group_1__0 )* ) )
            // InternalKlangParser.g:3535:1: ( ( rule__Multiply__Group_1__0 )* )
            {
            // InternalKlangParser.g:3535:1: ( ( rule__Multiply__Group_1__0 )* )
            // InternalKlangParser.g:3536:2: ( rule__Multiply__Group_1__0 )*
            {
             before(grammarAccess.getMultiplyAccess().getGroup_1()); 
            // InternalKlangParser.g:3537:2: ( rule__Multiply__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==Asterisk) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalKlangParser.g:3537:3: rule__Multiply__Group_1__0
            	    {
            	    pushFollow(FOLLOW_40);
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
    // InternalKlangParser.g:3546:1: rule__Multiply__Group_1__0 : rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1 ;
    public final void rule__Multiply__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3550:1: ( rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1 )
            // InternalKlangParser.g:3551:2: rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalKlangParser.g:3558:1: rule__Multiply__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiply__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3562:1: ( ( () ) )
            // InternalKlangParser.g:3563:1: ( () )
            {
            // InternalKlangParser.g:3563:1: ( () )
            // InternalKlangParser.g:3564:2: ()
            {
             before(grammarAccess.getMultiplyAccess().getMultiplyLeftAction_1_0()); 
            // InternalKlangParser.g:3565:2: ()
            // InternalKlangParser.g:3565:3: 
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
    // InternalKlangParser.g:3573:1: rule__Multiply__Group_1__1 : rule__Multiply__Group_1__1__Impl rule__Multiply__Group_1__2 ;
    public final void rule__Multiply__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3577:1: ( rule__Multiply__Group_1__1__Impl rule__Multiply__Group_1__2 )
            // InternalKlangParser.g:3578:2: rule__Multiply__Group_1__1__Impl rule__Multiply__Group_1__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalKlangParser.g:3585:1: rule__Multiply__Group_1__1__Impl : ( Asterisk ) ;
    public final void rule__Multiply__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3589:1: ( ( Asterisk ) )
            // InternalKlangParser.g:3590:1: ( Asterisk )
            {
            // InternalKlangParser.g:3590:1: ( Asterisk )
            // InternalKlangParser.g:3591:2: Asterisk
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
    // InternalKlangParser.g:3600:1: rule__Multiply__Group_1__2 : rule__Multiply__Group_1__2__Impl ;
    public final void rule__Multiply__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3604:1: ( rule__Multiply__Group_1__2__Impl )
            // InternalKlangParser.g:3605:2: rule__Multiply__Group_1__2__Impl
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
    // InternalKlangParser.g:3611:1: rule__Multiply__Group_1__2__Impl : ( ( rule__Multiply__RightAssignment_1_2 ) ) ;
    public final void rule__Multiply__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3615:1: ( ( ( rule__Multiply__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:3616:1: ( ( rule__Multiply__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:3616:1: ( ( rule__Multiply__RightAssignment_1_2 ) )
            // InternalKlangParser.g:3617:2: ( rule__Multiply__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplyAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:3618:2: ( rule__Multiply__RightAssignment_1_2 )
            // InternalKlangParser.g:3618:3: rule__Multiply__RightAssignment_1_2
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
    // InternalKlangParser.g:3627:1: rule__Divide__Group__0 : rule__Divide__Group__0__Impl rule__Divide__Group__1 ;
    public final void rule__Divide__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3631:1: ( rule__Divide__Group__0__Impl rule__Divide__Group__1 )
            // InternalKlangParser.g:3632:2: rule__Divide__Group__0__Impl rule__Divide__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalKlangParser.g:3639:1: rule__Divide__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__Divide__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3643:1: ( ( rulePrimaryExpression ) )
            // InternalKlangParser.g:3644:1: ( rulePrimaryExpression )
            {
            // InternalKlangParser.g:3644:1: ( rulePrimaryExpression )
            // InternalKlangParser.g:3645:2: rulePrimaryExpression
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
    // InternalKlangParser.g:3654:1: rule__Divide__Group__1 : rule__Divide__Group__1__Impl ;
    public final void rule__Divide__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3658:1: ( rule__Divide__Group__1__Impl )
            // InternalKlangParser.g:3659:2: rule__Divide__Group__1__Impl
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
    // InternalKlangParser.g:3665:1: rule__Divide__Group__1__Impl : ( ( rule__Divide__Group_1__0 )* ) ;
    public final void rule__Divide__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3669:1: ( ( ( rule__Divide__Group_1__0 )* ) )
            // InternalKlangParser.g:3670:1: ( ( rule__Divide__Group_1__0 )* )
            {
            // InternalKlangParser.g:3670:1: ( ( rule__Divide__Group_1__0 )* )
            // InternalKlangParser.g:3671:2: ( rule__Divide__Group_1__0 )*
            {
             before(grammarAccess.getDivideAccess().getGroup_1()); 
            // InternalKlangParser.g:3672:2: ( rule__Divide__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==Solidus) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalKlangParser.g:3672:3: rule__Divide__Group_1__0
            	    {
            	    pushFollow(FOLLOW_42);
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
    // InternalKlangParser.g:3681:1: rule__Divide__Group_1__0 : rule__Divide__Group_1__0__Impl rule__Divide__Group_1__1 ;
    public final void rule__Divide__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3685:1: ( rule__Divide__Group_1__0__Impl rule__Divide__Group_1__1 )
            // InternalKlangParser.g:3686:2: rule__Divide__Group_1__0__Impl rule__Divide__Group_1__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalKlangParser.g:3693:1: rule__Divide__Group_1__0__Impl : ( () ) ;
    public final void rule__Divide__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3697:1: ( ( () ) )
            // InternalKlangParser.g:3698:1: ( () )
            {
            // InternalKlangParser.g:3698:1: ( () )
            // InternalKlangParser.g:3699:2: ()
            {
             before(grammarAccess.getDivideAccess().getDivideLeftAction_1_0()); 
            // InternalKlangParser.g:3700:2: ()
            // InternalKlangParser.g:3700:3: 
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
    // InternalKlangParser.g:3708:1: rule__Divide__Group_1__1 : rule__Divide__Group_1__1__Impl rule__Divide__Group_1__2 ;
    public final void rule__Divide__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3712:1: ( rule__Divide__Group_1__1__Impl rule__Divide__Group_1__2 )
            // InternalKlangParser.g:3713:2: rule__Divide__Group_1__1__Impl rule__Divide__Group_1__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalKlangParser.g:3720:1: rule__Divide__Group_1__1__Impl : ( Solidus ) ;
    public final void rule__Divide__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3724:1: ( ( Solidus ) )
            // InternalKlangParser.g:3725:1: ( Solidus )
            {
            // InternalKlangParser.g:3725:1: ( Solidus )
            // InternalKlangParser.g:3726:2: Solidus
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
    // InternalKlangParser.g:3735:1: rule__Divide__Group_1__2 : rule__Divide__Group_1__2__Impl ;
    public final void rule__Divide__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3739:1: ( rule__Divide__Group_1__2__Impl )
            // InternalKlangParser.g:3740:2: rule__Divide__Group_1__2__Impl
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
    // InternalKlangParser.g:3746:1: rule__Divide__Group_1__2__Impl : ( ( rule__Divide__RightAssignment_1_2 ) ) ;
    public final void rule__Divide__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3750:1: ( ( ( rule__Divide__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:3751:1: ( ( rule__Divide__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:3751:1: ( ( rule__Divide__RightAssignment_1_2 ) )
            // InternalKlangParser.g:3752:2: ( rule__Divide__RightAssignment_1_2 )
            {
             before(grammarAccess.getDivideAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:3753:2: ( rule__Divide__RightAssignment_1_2 )
            // InternalKlangParser.g:3753:3: rule__Divide__RightAssignment_1_2
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
    // InternalKlangParser.g:3762:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3766:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalKlangParser.g:3767:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalKlangParser.g:3774:1: rule__Comparison__Group__0__Impl : ( rulePlus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3778:1: ( ( rulePlus ) )
            // InternalKlangParser.g:3779:1: ( rulePlus )
            {
            // InternalKlangParser.g:3779:1: ( rulePlus )
            // InternalKlangParser.g:3780:2: rulePlus
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
    // InternalKlangParser.g:3789:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3793:1: ( rule__Comparison__Group__1__Impl )
            // InternalKlangParser.g:3794:2: rule__Comparison__Group__1__Impl
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
    // InternalKlangParser.g:3800:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3804:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalKlangParser.g:3805:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalKlangParser.g:3805:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalKlangParser.g:3806:2: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // InternalKlangParser.g:3807:2: ( rule__Comparison__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==EqualsSignEqualsSign||LA27_0==LessThanSign||LA27_0==GreaterThanSign) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalKlangParser.g:3807:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_44);
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
    // InternalKlangParser.g:3816:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3820:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalKlangParser.g:3821:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalKlangParser.g:3828:1: rule__Comparison__Group_1__0__Impl : ( ( rule__Comparison__Alternatives_1_0 ) ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3832:1: ( ( ( rule__Comparison__Alternatives_1_0 ) ) )
            // InternalKlangParser.g:3833:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            {
            // InternalKlangParser.g:3833:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            // InternalKlangParser.g:3834:2: ( rule__Comparison__Alternatives_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getAlternatives_1_0()); 
            // InternalKlangParser.g:3835:2: ( rule__Comparison__Alternatives_1_0 )
            // InternalKlangParser.g:3835:3: rule__Comparison__Alternatives_1_0
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
    // InternalKlangParser.g:3843:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3847:1: ( rule__Comparison__Group_1__1__Impl )
            // InternalKlangParser.g:3848:2: rule__Comparison__Group_1__1__Impl
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
    // InternalKlangParser.g:3854:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__RightAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3858:1: ( ( ( rule__Comparison__RightAssignment_1_1 ) ) )
            // InternalKlangParser.g:3859:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            {
            // InternalKlangParser.g:3859:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            // InternalKlangParser.g:3860:2: ( rule__Comparison__RightAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_1()); 
            // InternalKlangParser.g:3861:2: ( rule__Comparison__RightAssignment_1_1 )
            // InternalKlangParser.g:3861:3: rule__Comparison__RightAssignment_1_1
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
    // InternalKlangParser.g:3870:1: rule__Comparison__Group_1_0_0__0 : rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 ;
    public final void rule__Comparison__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3874:1: ( rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 )
            // InternalKlangParser.g:3875:2: rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1
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
    // InternalKlangParser.g:3882:1: rule__Comparison__Group_1_0_0__0__Impl : ( LessThanSign ) ;
    public final void rule__Comparison__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3886:1: ( ( LessThanSign ) )
            // InternalKlangParser.g:3887:1: ( LessThanSign )
            {
            // InternalKlangParser.g:3887:1: ( LessThanSign )
            // InternalKlangParser.g:3888:2: LessThanSign
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
    // InternalKlangParser.g:3897:1: rule__Comparison__Group_1_0_0__1 : rule__Comparison__Group_1_0_0__1__Impl ;
    public final void rule__Comparison__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3901:1: ( rule__Comparison__Group_1_0_0__1__Impl )
            // InternalKlangParser.g:3902:2: rule__Comparison__Group_1_0_0__1__Impl
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
    // InternalKlangParser.g:3908:1: rule__Comparison__Group_1_0_0__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3912:1: ( ( () ) )
            // InternalKlangParser.g:3913:1: ( () )
            {
            // InternalKlangParser.g:3913:1: ( () )
            // InternalKlangParser.g:3914:2: ()
            {
             before(grammarAccess.getComparisonAccess().getLessThanLeftAction_1_0_0_1()); 
            // InternalKlangParser.g:3915:2: ()
            // InternalKlangParser.g:3915:3: 
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
    // InternalKlangParser.g:3924:1: rule__Comparison__Group_1_0_1__0 : rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 ;
    public final void rule__Comparison__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3928:1: ( rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 )
            // InternalKlangParser.g:3929:2: rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1
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
    // InternalKlangParser.g:3936:1: rule__Comparison__Group_1_0_1__0__Impl : ( EqualsSignEqualsSign ) ;
    public final void rule__Comparison__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3940:1: ( ( EqualsSignEqualsSign ) )
            // InternalKlangParser.g:3941:1: ( EqualsSignEqualsSign )
            {
            // InternalKlangParser.g:3941:1: ( EqualsSignEqualsSign )
            // InternalKlangParser.g:3942:2: EqualsSignEqualsSign
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
    // InternalKlangParser.g:3951:1: rule__Comparison__Group_1_0_1__1 : rule__Comparison__Group_1_0_1__1__Impl ;
    public final void rule__Comparison__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3955:1: ( rule__Comparison__Group_1_0_1__1__Impl )
            // InternalKlangParser.g:3956:2: rule__Comparison__Group_1_0_1__1__Impl
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
    // InternalKlangParser.g:3962:1: rule__Comparison__Group_1_0_1__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3966:1: ( ( () ) )
            // InternalKlangParser.g:3967:1: ( () )
            {
            // InternalKlangParser.g:3967:1: ( () )
            // InternalKlangParser.g:3968:2: ()
            {
             before(grammarAccess.getComparisonAccess().getEqualLeftAction_1_0_1_1()); 
            // InternalKlangParser.g:3969:2: ()
            // InternalKlangParser.g:3969:3: 
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
    // InternalKlangParser.g:3978:1: rule__Comparison__Group_1_0_2__0 : rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1 ;
    public final void rule__Comparison__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3982:1: ( rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1 )
            // InternalKlangParser.g:3983:2: rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1
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
    // InternalKlangParser.g:3990:1: rule__Comparison__Group_1_0_2__0__Impl : ( GreaterThanSign ) ;
    public final void rule__Comparison__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3994:1: ( ( GreaterThanSign ) )
            // InternalKlangParser.g:3995:1: ( GreaterThanSign )
            {
            // InternalKlangParser.g:3995:1: ( GreaterThanSign )
            // InternalKlangParser.g:3996:2: GreaterThanSign
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
    // InternalKlangParser.g:4005:1: rule__Comparison__Group_1_0_2__1 : rule__Comparison__Group_1_0_2__1__Impl ;
    public final void rule__Comparison__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4009:1: ( rule__Comparison__Group_1_0_2__1__Impl )
            // InternalKlangParser.g:4010:2: rule__Comparison__Group_1_0_2__1__Impl
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
    // InternalKlangParser.g:4016:1: rule__Comparison__Group_1_0_2__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4020:1: ( ( () ) )
            // InternalKlangParser.g:4021:1: ( () )
            {
            // InternalKlangParser.g:4021:1: ( () )
            // InternalKlangParser.g:4022:2: ()
            {
             before(grammarAccess.getComparisonAccess().getGreaterThanLeftAction_1_0_2_1()); 
            // InternalKlangParser.g:4023:2: ()
            // InternalKlangParser.g:4023:3: 
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
    // InternalKlangParser.g:4032:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4036:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // InternalKlangParser.g:4037:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalKlangParser.g:4044:1: rule__FunctionCall__Group__0__Impl : ( ( rule__FunctionCall__NameAssignment_0 ) ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4048:1: ( ( ( rule__FunctionCall__NameAssignment_0 ) ) )
            // InternalKlangParser.g:4049:1: ( ( rule__FunctionCall__NameAssignment_0 ) )
            {
            // InternalKlangParser.g:4049:1: ( ( rule__FunctionCall__NameAssignment_0 ) )
            // InternalKlangParser.g:4050:2: ( rule__FunctionCall__NameAssignment_0 )
            {
             before(grammarAccess.getFunctionCallAccess().getNameAssignment_0()); 
            // InternalKlangParser.g:4051:2: ( rule__FunctionCall__NameAssignment_0 )
            // InternalKlangParser.g:4051:3: rule__FunctionCall__NameAssignment_0
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
    // InternalKlangParser.g:4059:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4063:1: ( rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 )
            // InternalKlangParser.g:4064:2: rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalKlangParser.g:4071:1: rule__FunctionCall__Group__1__Impl : ( LeftParenthesis ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4075:1: ( ( LeftParenthesis ) )
            // InternalKlangParser.g:4076:1: ( LeftParenthesis )
            {
            // InternalKlangParser.g:4076:1: ( LeftParenthesis )
            // InternalKlangParser.g:4077:2: LeftParenthesis
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
    // InternalKlangParser.g:4086:1: rule__FunctionCall__Group__2 : rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 ;
    public final void rule__FunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4090:1: ( rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 )
            // InternalKlangParser.g:4091:2: rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalKlangParser.g:4098:1: rule__FunctionCall__Group__2__Impl : ( ( rule__FunctionCall__Group_2__0 )? ) ;
    public final void rule__FunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4102:1: ( ( ( rule__FunctionCall__Group_2__0 )? ) )
            // InternalKlangParser.g:4103:1: ( ( rule__FunctionCall__Group_2__0 )? )
            {
            // InternalKlangParser.g:4103:1: ( ( rule__FunctionCall__Group_2__0 )? )
            // InternalKlangParser.g:4104:2: ( rule__FunctionCall__Group_2__0 )?
            {
             before(grammarAccess.getFunctionCallAccess().getGroup_2()); 
            // InternalKlangParser.g:4105:2: ( rule__FunctionCall__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==False||LA28_0==True||LA28_0==Not||LA28_0==LeftParenthesis||LA28_0==HyphenMinus||(LA28_0>=RULE_ID && LA28_0<=RULE_STRING)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalKlangParser.g:4105:3: rule__FunctionCall__Group_2__0
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
    // InternalKlangParser.g:4113:1: rule__FunctionCall__Group__3 : rule__FunctionCall__Group__3__Impl ;
    public final void rule__FunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4117:1: ( rule__FunctionCall__Group__3__Impl )
            // InternalKlangParser.g:4118:2: rule__FunctionCall__Group__3__Impl
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
    // InternalKlangParser.g:4124:1: rule__FunctionCall__Group__3__Impl : ( RightParenthesis ) ;
    public final void rule__FunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4128:1: ( ( RightParenthesis ) )
            // InternalKlangParser.g:4129:1: ( RightParenthesis )
            {
            // InternalKlangParser.g:4129:1: ( RightParenthesis )
            // InternalKlangParser.g:4130:2: RightParenthesis
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
    // InternalKlangParser.g:4140:1: rule__FunctionCall__Group_2__0 : rule__FunctionCall__Group_2__0__Impl rule__FunctionCall__Group_2__1 ;
    public final void rule__FunctionCall__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4144:1: ( rule__FunctionCall__Group_2__0__Impl rule__FunctionCall__Group_2__1 )
            // InternalKlangParser.g:4145:2: rule__FunctionCall__Group_2__0__Impl rule__FunctionCall__Group_2__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalKlangParser.g:4152:1: rule__FunctionCall__Group_2__0__Impl : ( ( rule__FunctionCall__ParametersAssignment_2_0 ) ) ;
    public final void rule__FunctionCall__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4156:1: ( ( ( rule__FunctionCall__ParametersAssignment_2_0 ) ) )
            // InternalKlangParser.g:4157:1: ( ( rule__FunctionCall__ParametersAssignment_2_0 ) )
            {
            // InternalKlangParser.g:4157:1: ( ( rule__FunctionCall__ParametersAssignment_2_0 ) )
            // InternalKlangParser.g:4158:2: ( rule__FunctionCall__ParametersAssignment_2_0 )
            {
             before(grammarAccess.getFunctionCallAccess().getParametersAssignment_2_0()); 
            // InternalKlangParser.g:4159:2: ( rule__FunctionCall__ParametersAssignment_2_0 )
            // InternalKlangParser.g:4159:3: rule__FunctionCall__ParametersAssignment_2_0
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
    // InternalKlangParser.g:4167:1: rule__FunctionCall__Group_2__1 : rule__FunctionCall__Group_2__1__Impl ;
    public final void rule__FunctionCall__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4171:1: ( rule__FunctionCall__Group_2__1__Impl )
            // InternalKlangParser.g:4172:2: rule__FunctionCall__Group_2__1__Impl
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
    // InternalKlangParser.g:4178:1: rule__FunctionCall__Group_2__1__Impl : ( ( rule__FunctionCall__Group_2_1__0 )* ) ;
    public final void rule__FunctionCall__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4182:1: ( ( ( rule__FunctionCall__Group_2_1__0 )* ) )
            // InternalKlangParser.g:4183:1: ( ( rule__FunctionCall__Group_2_1__0 )* )
            {
            // InternalKlangParser.g:4183:1: ( ( rule__FunctionCall__Group_2_1__0 )* )
            // InternalKlangParser.g:4184:2: ( rule__FunctionCall__Group_2_1__0 )*
            {
             before(grammarAccess.getFunctionCallAccess().getGroup_2_1()); 
            // InternalKlangParser.g:4185:2: ( rule__FunctionCall__Group_2_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==Comma) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalKlangParser.g:4185:3: rule__FunctionCall__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_47);
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
    // InternalKlangParser.g:4194:1: rule__FunctionCall__Group_2_1__0 : rule__FunctionCall__Group_2_1__0__Impl rule__FunctionCall__Group_2_1__1 ;
    public final void rule__FunctionCall__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4198:1: ( rule__FunctionCall__Group_2_1__0__Impl rule__FunctionCall__Group_2_1__1 )
            // InternalKlangParser.g:4199:2: rule__FunctionCall__Group_2_1__0__Impl rule__FunctionCall__Group_2_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalKlangParser.g:4206:1: rule__FunctionCall__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__FunctionCall__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4210:1: ( ( Comma ) )
            // InternalKlangParser.g:4211:1: ( Comma )
            {
            // InternalKlangParser.g:4211:1: ( Comma )
            // InternalKlangParser.g:4212:2: Comma
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
    // InternalKlangParser.g:4221:1: rule__FunctionCall__Group_2_1__1 : rule__FunctionCall__Group_2_1__1__Impl ;
    public final void rule__FunctionCall__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4225:1: ( rule__FunctionCall__Group_2_1__1__Impl )
            // InternalKlangParser.g:4226:2: rule__FunctionCall__Group_2_1__1__Impl
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
    // InternalKlangParser.g:4232:1: rule__FunctionCall__Group_2_1__1__Impl : ( ( rule__FunctionCall__ParametersAssignment_2_1_1 ) ) ;
    public final void rule__FunctionCall__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4236:1: ( ( ( rule__FunctionCall__ParametersAssignment_2_1_1 ) ) )
            // InternalKlangParser.g:4237:1: ( ( rule__FunctionCall__ParametersAssignment_2_1_1 ) )
            {
            // InternalKlangParser.g:4237:1: ( ( rule__FunctionCall__ParametersAssignment_2_1_1 ) )
            // InternalKlangParser.g:4238:2: ( rule__FunctionCall__ParametersAssignment_2_1_1 )
            {
             before(grammarAccess.getFunctionCallAccess().getParametersAssignment_2_1_1()); 
            // InternalKlangParser.g:4239:2: ( rule__FunctionCall__ParametersAssignment_2_1_1 )
            // InternalKlangParser.g:4239:3: rule__FunctionCall__ParametersAssignment_2_1_1
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
    // InternalKlangParser.g:4248:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4252:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // InternalKlangParser.g:4253:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalKlangParser.g:4260:1: rule__PrimaryExpression__Group_0__0__Impl : ( LeftParenthesis ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4264:1: ( ( LeftParenthesis ) )
            // InternalKlangParser.g:4265:1: ( LeftParenthesis )
            {
            // InternalKlangParser.g:4265:1: ( LeftParenthesis )
            // InternalKlangParser.g:4266:2: LeftParenthesis
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
    // InternalKlangParser.g:4275:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4279:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // InternalKlangParser.g:4280:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalKlangParser.g:4287:1: rule__PrimaryExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4291:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:4292:1: ( ruleExpression )
            {
            // InternalKlangParser.g:4292:1: ( ruleExpression )
            // InternalKlangParser.g:4293:2: ruleExpression
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
    // InternalKlangParser.g:4302:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4306:1: ( rule__PrimaryExpression__Group_0__2__Impl )
            // InternalKlangParser.g:4307:2: rule__PrimaryExpression__Group_0__2__Impl
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
    // InternalKlangParser.g:4313:1: rule__PrimaryExpression__Group_0__2__Impl : ( RightParenthesis ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4317:1: ( ( RightParenthesis ) )
            // InternalKlangParser.g:4318:1: ( RightParenthesis )
            {
            // InternalKlangParser.g:4318:1: ( RightParenthesis )
            // InternalKlangParser.g:4319:2: RightParenthesis
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
    // InternalKlangParser.g:4329:1: rule__PrimaryExpression__Group_1__0 : rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 ;
    public final void rule__PrimaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4333:1: ( rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 )
            // InternalKlangParser.g:4334:2: rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalKlangParser.g:4341:1: rule__PrimaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4345:1: ( ( () ) )
            // InternalKlangParser.g:4346:1: ( () )
            {
            // InternalKlangParser.g:4346:1: ( () )
            // InternalKlangParser.g:4347:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNotAction_1_0()); 
            // InternalKlangParser.g:4348:2: ()
            // InternalKlangParser.g:4348:3: 
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
    // InternalKlangParser.g:4356:1: rule__PrimaryExpression__Group_1__1 : rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2 ;
    public final void rule__PrimaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4360:1: ( rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2 )
            // InternalKlangParser.g:4361:2: rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalKlangParser.g:4368:1: rule__PrimaryExpression__Group_1__1__Impl : ( Not ) ;
    public final void rule__PrimaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4372:1: ( ( Not ) )
            // InternalKlangParser.g:4373:1: ( Not )
            {
            // InternalKlangParser.g:4373:1: ( Not )
            // InternalKlangParser.g:4374:2: Not
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
    // InternalKlangParser.g:4383:1: rule__PrimaryExpression__Group_1__2 : rule__PrimaryExpression__Group_1__2__Impl ;
    public final void rule__PrimaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4387:1: ( rule__PrimaryExpression__Group_1__2__Impl )
            // InternalKlangParser.g:4388:2: rule__PrimaryExpression__Group_1__2__Impl
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
    // InternalKlangParser.g:4394:1: rule__PrimaryExpression__Group_1__2__Impl : ( ( rule__PrimaryExpression__ExpressionAssignment_1_2 ) ) ;
    public final void rule__PrimaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4398:1: ( ( ( rule__PrimaryExpression__ExpressionAssignment_1_2 ) ) )
            // InternalKlangParser.g:4399:1: ( ( rule__PrimaryExpression__ExpressionAssignment_1_2 ) )
            {
            // InternalKlangParser.g:4399:1: ( ( rule__PrimaryExpression__ExpressionAssignment_1_2 ) )
            // InternalKlangParser.g:4400:2: ( rule__PrimaryExpression__ExpressionAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionAssignment_1_2()); 
            // InternalKlangParser.g:4401:2: ( rule__PrimaryExpression__ExpressionAssignment_1_2 )
            // InternalKlangParser.g:4401:3: rule__PrimaryExpression__ExpressionAssignment_1_2
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


    // $ANTLR start "rule__PrimaryExpression__Group_2__0"
    // InternalKlangParser.g:4410:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4414:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // InternalKlangParser.g:4415:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_37);
            rule__PrimaryExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__0"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0__Impl"
    // InternalKlangParser.g:4422:1: rule__PrimaryExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4426:1: ( ( () ) )
            // InternalKlangParser.g:4427:1: ( () )
            {
            // InternalKlangParser.g:4427:1: ( () )
            // InternalKlangParser.g:4428:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getUnaryMinusAction_2_0()); 
            // InternalKlangParser.g:4429:2: ()
            // InternalKlangParser.g:4429:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getUnaryMinusAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1"
    // InternalKlangParser.g:4437:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4441:1: ( rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 )
            // InternalKlangParser.g:4442:2: rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2
            {
            pushFollow(FOLLOW_22);
            rule__PrimaryExpression__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__1"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1__Impl"
    // InternalKlangParser.g:4449:1: rule__PrimaryExpression__Group_2__1__Impl : ( HyphenMinus ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4453:1: ( ( HyphenMinus ) )
            // InternalKlangParser.g:4454:1: ( HyphenMinus )
            {
            // InternalKlangParser.g:4454:1: ( HyphenMinus )
            // InternalKlangParser.g:4455:2: HyphenMinus
            {
             before(grammarAccess.getPrimaryExpressionAccess().getHyphenMinusKeyword_2_1()); 
            match(input,HyphenMinus,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getHyphenMinusKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__2"
    // InternalKlangParser.g:4464:1: rule__PrimaryExpression__Group_2__2 : rule__PrimaryExpression__Group_2__2__Impl ;
    public final void rule__PrimaryExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4468:1: ( rule__PrimaryExpression__Group_2__2__Impl )
            // InternalKlangParser.g:4469:2: rule__PrimaryExpression__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__2"


    // $ANTLR start "rule__PrimaryExpression__Group_2__2__Impl"
    // InternalKlangParser.g:4475:1: rule__PrimaryExpression__Group_2__2__Impl : ( ( rule__PrimaryExpression__ExpressionAssignment_2_2 ) ) ;
    public final void rule__PrimaryExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4479:1: ( ( ( rule__PrimaryExpression__ExpressionAssignment_2_2 ) ) )
            // InternalKlangParser.g:4480:1: ( ( rule__PrimaryExpression__ExpressionAssignment_2_2 ) )
            {
            // InternalKlangParser.g:4480:1: ( ( rule__PrimaryExpression__ExpressionAssignment_2_2 ) )
            // InternalKlangParser.g:4481:2: ( rule__PrimaryExpression__ExpressionAssignment_2_2 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionAssignment_2_2()); 
            // InternalKlangParser.g:4482:2: ( rule__PrimaryExpression__ExpressionAssignment_2_2 )
            // InternalKlangParser.g:4482:3: rule__PrimaryExpression__ExpressionAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__ExpressionAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getExpressionAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_3__0"
    // InternalKlangParser.g:4491:1: rule__PrimaryExpression__Group_3__0 : rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 ;
    public final void rule__PrimaryExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4495:1: ( rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 )
            // InternalKlangParser.g:4496:2: rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1
            {
            pushFollow(FOLLOW_28);
            rule__PrimaryExpression__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__0"


    // $ANTLR start "rule__PrimaryExpression__Group_3__0__Impl"
    // InternalKlangParser.g:4503:1: rule__PrimaryExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4507:1: ( ( () ) )
            // InternalKlangParser.g:4508:1: ( () )
            {
            // InternalKlangParser.g:4508:1: ( () )
            // InternalKlangParser.g:4509:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getToDoubleAction_3_0()); 
            // InternalKlangParser.g:4510:2: ()
            // InternalKlangParser.g:4510:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getToDoubleAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_3__1"
    // InternalKlangParser.g:4518:1: rule__PrimaryExpression__Group_3__1 : rule__PrimaryExpression__Group_3__1__Impl rule__PrimaryExpression__Group_3__2 ;
    public final void rule__PrimaryExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4522:1: ( rule__PrimaryExpression__Group_3__1__Impl rule__PrimaryExpression__Group_3__2 )
            // InternalKlangParser.g:4523:2: rule__PrimaryExpression__Group_3__1__Impl rule__PrimaryExpression__Group_3__2
            {
            pushFollow(FOLLOW_49);
            rule__PrimaryExpression__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__1"


    // $ANTLR start "rule__PrimaryExpression__Group_3__1__Impl"
    // InternalKlangParser.g:4530:1: rule__PrimaryExpression__Group_3__1__Impl : ( LeftParenthesis ) ;
    public final void rule__PrimaryExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4534:1: ( ( LeftParenthesis ) )
            // InternalKlangParser.g:4535:1: ( LeftParenthesis )
            {
            // InternalKlangParser.g:4535:1: ( LeftParenthesis )
            // InternalKlangParser.g:4536:2: LeftParenthesis
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_3__2"
    // InternalKlangParser.g:4545:1: rule__PrimaryExpression__Group_3__2 : rule__PrimaryExpression__Group_3__2__Impl rule__PrimaryExpression__Group_3__3 ;
    public final void rule__PrimaryExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4549:1: ( rule__PrimaryExpression__Group_3__2__Impl rule__PrimaryExpression__Group_3__3 )
            // InternalKlangParser.g:4550:2: rule__PrimaryExpression__Group_3__2__Impl rule__PrimaryExpression__Group_3__3
            {
            pushFollow(FOLLOW_30);
            rule__PrimaryExpression__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__2"


    // $ANTLR start "rule__PrimaryExpression__Group_3__2__Impl"
    // InternalKlangParser.g:4557:1: rule__PrimaryExpression__Group_3__2__Impl : ( Double ) ;
    public final void rule__PrimaryExpression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4561:1: ( ( Double ) )
            // InternalKlangParser.g:4562:1: ( Double )
            {
            // InternalKlangParser.g:4562:1: ( Double )
            // InternalKlangParser.g:4563:2: Double
            {
             before(grammarAccess.getPrimaryExpressionAccess().getDoubleKeyword_3_2()); 
            match(input,Double,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getDoubleKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_3__3"
    // InternalKlangParser.g:4572:1: rule__PrimaryExpression__Group_3__3 : rule__PrimaryExpression__Group_3__3__Impl rule__PrimaryExpression__Group_3__4 ;
    public final void rule__PrimaryExpression__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4576:1: ( rule__PrimaryExpression__Group_3__3__Impl rule__PrimaryExpression__Group_3__4 )
            // InternalKlangParser.g:4577:2: rule__PrimaryExpression__Group_3__3__Impl rule__PrimaryExpression__Group_3__4
            {
            pushFollow(FOLLOW_22);
            rule__PrimaryExpression__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__3"


    // $ANTLR start "rule__PrimaryExpression__Group_3__3__Impl"
    // InternalKlangParser.g:4584:1: rule__PrimaryExpression__Group_3__3__Impl : ( RightParenthesis ) ;
    public final void rule__PrimaryExpression__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4588:1: ( ( RightParenthesis ) )
            // InternalKlangParser.g:4589:1: ( RightParenthesis )
            {
            // InternalKlangParser.g:4589:1: ( RightParenthesis )
            // InternalKlangParser.g:4590:2: RightParenthesis
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_3_3()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__3__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_3__4"
    // InternalKlangParser.g:4599:1: rule__PrimaryExpression__Group_3__4 : rule__PrimaryExpression__Group_3__4__Impl ;
    public final void rule__PrimaryExpression__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4603:1: ( rule__PrimaryExpression__Group_3__4__Impl )
            // InternalKlangParser.g:4604:2: rule__PrimaryExpression__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__4"


    // $ANTLR start "rule__PrimaryExpression__Group_3__4__Impl"
    // InternalKlangParser.g:4610:1: rule__PrimaryExpression__Group_3__4__Impl : ( ( rule__PrimaryExpression__ExpressionAssignment_3_4 ) ) ;
    public final void rule__PrimaryExpression__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4614:1: ( ( ( rule__PrimaryExpression__ExpressionAssignment_3_4 ) ) )
            // InternalKlangParser.g:4615:1: ( ( rule__PrimaryExpression__ExpressionAssignment_3_4 ) )
            {
            // InternalKlangParser.g:4615:1: ( ( rule__PrimaryExpression__ExpressionAssignment_3_4 ) )
            // InternalKlangParser.g:4616:2: ( rule__PrimaryExpression__ExpressionAssignment_3_4 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionAssignment_3_4()); 
            // InternalKlangParser.g:4617:2: ( rule__PrimaryExpression__ExpressionAssignment_3_4 )
            // InternalKlangParser.g:4617:3: rule__PrimaryExpression__ExpressionAssignment_3_4
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__ExpressionAssignment_3_4();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getExpressionAssignment_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__4__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_4__0"
    // InternalKlangParser.g:4626:1: rule__PrimaryExpression__Group_4__0 : rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 ;
    public final void rule__PrimaryExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4630:1: ( rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 )
            // InternalKlangParser.g:4631:2: rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1
            {
            pushFollow(FOLLOW_28);
            rule__PrimaryExpression__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_4__0"


    // $ANTLR start "rule__PrimaryExpression__Group_4__0__Impl"
    // InternalKlangParser.g:4638:1: rule__PrimaryExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4642:1: ( ( () ) )
            // InternalKlangParser.g:4643:1: ( () )
            {
            // InternalKlangParser.g:4643:1: ( () )
            // InternalKlangParser.g:4644:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getToIntAction_4_0()); 
            // InternalKlangParser.g:4645:2: ()
            // InternalKlangParser.g:4645:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getToIntAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_4__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_4__1"
    // InternalKlangParser.g:4653:1: rule__PrimaryExpression__Group_4__1 : rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2 ;
    public final void rule__PrimaryExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4657:1: ( rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2 )
            // InternalKlangParser.g:4658:2: rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2
            {
            pushFollow(FOLLOW_50);
            rule__PrimaryExpression__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_4__1"


    // $ANTLR start "rule__PrimaryExpression__Group_4__1__Impl"
    // InternalKlangParser.g:4665:1: rule__PrimaryExpression__Group_4__1__Impl : ( LeftParenthesis ) ;
    public final void rule__PrimaryExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4669:1: ( ( LeftParenthesis ) )
            // InternalKlangParser.g:4670:1: ( LeftParenthesis )
            {
            // InternalKlangParser.g:4670:1: ( LeftParenthesis )
            // InternalKlangParser.g:4671:2: LeftParenthesis
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_4__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_4__2"
    // InternalKlangParser.g:4680:1: rule__PrimaryExpression__Group_4__2 : rule__PrimaryExpression__Group_4__2__Impl rule__PrimaryExpression__Group_4__3 ;
    public final void rule__PrimaryExpression__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4684:1: ( rule__PrimaryExpression__Group_4__2__Impl rule__PrimaryExpression__Group_4__3 )
            // InternalKlangParser.g:4685:2: rule__PrimaryExpression__Group_4__2__Impl rule__PrimaryExpression__Group_4__3
            {
            pushFollow(FOLLOW_30);
            rule__PrimaryExpression__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_4__2"


    // $ANTLR start "rule__PrimaryExpression__Group_4__2__Impl"
    // InternalKlangParser.g:4692:1: rule__PrimaryExpression__Group_4__2__Impl : ( Int ) ;
    public final void rule__PrimaryExpression__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4696:1: ( ( Int ) )
            // InternalKlangParser.g:4697:1: ( Int )
            {
            // InternalKlangParser.g:4697:1: ( Int )
            // InternalKlangParser.g:4698:2: Int
            {
             before(grammarAccess.getPrimaryExpressionAccess().getIntKeyword_4_2()); 
            match(input,Int,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getIntKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_4__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_4__3"
    // InternalKlangParser.g:4707:1: rule__PrimaryExpression__Group_4__3 : rule__PrimaryExpression__Group_4__3__Impl rule__PrimaryExpression__Group_4__4 ;
    public final void rule__PrimaryExpression__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4711:1: ( rule__PrimaryExpression__Group_4__3__Impl rule__PrimaryExpression__Group_4__4 )
            // InternalKlangParser.g:4712:2: rule__PrimaryExpression__Group_4__3__Impl rule__PrimaryExpression__Group_4__4
            {
            pushFollow(FOLLOW_22);
            rule__PrimaryExpression__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_4__3"


    // $ANTLR start "rule__PrimaryExpression__Group_4__3__Impl"
    // InternalKlangParser.g:4719:1: rule__PrimaryExpression__Group_4__3__Impl : ( RightParenthesis ) ;
    public final void rule__PrimaryExpression__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4723:1: ( ( RightParenthesis ) )
            // InternalKlangParser.g:4724:1: ( RightParenthesis )
            {
            // InternalKlangParser.g:4724:1: ( RightParenthesis )
            // InternalKlangParser.g:4725:2: RightParenthesis
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_3()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_4__3__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_4__4"
    // InternalKlangParser.g:4734:1: rule__PrimaryExpression__Group_4__4 : rule__PrimaryExpression__Group_4__4__Impl ;
    public final void rule__PrimaryExpression__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4738:1: ( rule__PrimaryExpression__Group_4__4__Impl )
            // InternalKlangParser.g:4739:2: rule__PrimaryExpression__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_4__4"


    // $ANTLR start "rule__PrimaryExpression__Group_4__4__Impl"
    // InternalKlangParser.g:4745:1: rule__PrimaryExpression__Group_4__4__Impl : ( ( rule__PrimaryExpression__ExpressionAssignment_4_4 ) ) ;
    public final void rule__PrimaryExpression__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4749:1: ( ( ( rule__PrimaryExpression__ExpressionAssignment_4_4 ) ) )
            // InternalKlangParser.g:4750:1: ( ( rule__PrimaryExpression__ExpressionAssignment_4_4 ) )
            {
            // InternalKlangParser.g:4750:1: ( ( rule__PrimaryExpression__ExpressionAssignment_4_4 ) )
            // InternalKlangParser.g:4751:2: ( rule__PrimaryExpression__ExpressionAssignment_4_4 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionAssignment_4_4()); 
            // InternalKlangParser.g:4752:2: ( rule__PrimaryExpression__ExpressionAssignment_4_4 )
            // InternalKlangParser.g:4752:3: rule__PrimaryExpression__ExpressionAssignment_4_4
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__ExpressionAssignment_4_4();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getExpressionAssignment_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_4__4__Impl"


    // $ANTLR start "rule__AtomicExpression__Group_0__0"
    // InternalKlangParser.g:4761:1: rule__AtomicExpression__Group_0__0 : rule__AtomicExpression__Group_0__0__Impl rule__AtomicExpression__Group_0__1 ;
    public final void rule__AtomicExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4765:1: ( rule__AtomicExpression__Group_0__0__Impl rule__AtomicExpression__Group_0__1 )
            // InternalKlangParser.g:4766:2: rule__AtomicExpression__Group_0__0__Impl rule__AtomicExpression__Group_0__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalKlangParser.g:4773:1: rule__AtomicExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__AtomicExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4777:1: ( ( () ) )
            // InternalKlangParser.g:4778:1: ( () )
            {
            // InternalKlangParser.g:4778:1: ( () )
            // InternalKlangParser.g:4779:2: ()
            {
             before(grammarAccess.getAtomicExpressionAccess().getBooleanLiteralAction_0_0()); 
            // InternalKlangParser.g:4780:2: ()
            // InternalKlangParser.g:4780:3: 
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
    // InternalKlangParser.g:4788:1: rule__AtomicExpression__Group_0__1 : rule__AtomicExpression__Group_0__1__Impl ;
    public final void rule__AtomicExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4792:1: ( rule__AtomicExpression__Group_0__1__Impl )
            // InternalKlangParser.g:4793:2: rule__AtomicExpression__Group_0__1__Impl
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
    // InternalKlangParser.g:4799:1: rule__AtomicExpression__Group_0__1__Impl : ( ( rule__AtomicExpression__Alternatives_0_1 ) ) ;
    public final void rule__AtomicExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4803:1: ( ( ( rule__AtomicExpression__Alternatives_0_1 ) ) )
            // InternalKlangParser.g:4804:1: ( ( rule__AtomicExpression__Alternatives_0_1 ) )
            {
            // InternalKlangParser.g:4804:1: ( ( rule__AtomicExpression__Alternatives_0_1 ) )
            // InternalKlangParser.g:4805:2: ( rule__AtomicExpression__Alternatives_0_1 )
            {
             before(grammarAccess.getAtomicExpressionAccess().getAlternatives_0_1()); 
            // InternalKlangParser.g:4806:2: ( rule__AtomicExpression__Alternatives_0_1 )
            // InternalKlangParser.g:4806:3: rule__AtomicExpression__Alternatives_0_1
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
    // InternalKlangParser.g:4815:1: rule__AtomicExpression__Group_1__0 : rule__AtomicExpression__Group_1__0__Impl rule__AtomicExpression__Group_1__1 ;
    public final void rule__AtomicExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4819:1: ( rule__AtomicExpression__Group_1__0__Impl rule__AtomicExpression__Group_1__1 )
            // InternalKlangParser.g:4820:2: rule__AtomicExpression__Group_1__0__Impl rule__AtomicExpression__Group_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalKlangParser.g:4827:1: rule__AtomicExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AtomicExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4831:1: ( ( () ) )
            // InternalKlangParser.g:4832:1: ( () )
            {
            // InternalKlangParser.g:4832:1: ( () )
            // InternalKlangParser.g:4833:2: ()
            {
             before(grammarAccess.getAtomicExpressionAccess().getDoubleLiteralAction_1_0()); 
            // InternalKlangParser.g:4834:2: ()
            // InternalKlangParser.g:4834:3: 
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
    // InternalKlangParser.g:4842:1: rule__AtomicExpression__Group_1__1 : rule__AtomicExpression__Group_1__1__Impl ;
    public final void rule__AtomicExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4846:1: ( rule__AtomicExpression__Group_1__1__Impl )
            // InternalKlangParser.g:4847:2: rule__AtomicExpression__Group_1__1__Impl
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
    // InternalKlangParser.g:4853:1: rule__AtomicExpression__Group_1__1__Impl : ( ( rule__AtomicExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__AtomicExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4857:1: ( ( ( rule__AtomicExpression__ValueAssignment_1_1 ) ) )
            // InternalKlangParser.g:4858:1: ( ( rule__AtomicExpression__ValueAssignment_1_1 ) )
            {
            // InternalKlangParser.g:4858:1: ( ( rule__AtomicExpression__ValueAssignment_1_1 ) )
            // InternalKlangParser.g:4859:2: ( rule__AtomicExpression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicExpressionAccess().getValueAssignment_1_1()); 
            // InternalKlangParser.g:4860:2: ( rule__AtomicExpression__ValueAssignment_1_1 )
            // InternalKlangParser.g:4860:3: rule__AtomicExpression__ValueAssignment_1_1
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
    // InternalKlangParser.g:4869:1: rule__AtomicExpression__Group_2__0 : rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 ;
    public final void rule__AtomicExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4873:1: ( rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 )
            // InternalKlangParser.g:4874:2: rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalKlangParser.g:4881:1: rule__AtomicExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__AtomicExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4885:1: ( ( () ) )
            // InternalKlangParser.g:4886:1: ( () )
            {
            // InternalKlangParser.g:4886:1: ( () )
            // InternalKlangParser.g:4887:2: ()
            {
             before(grammarAccess.getAtomicExpressionAccess().getIntegerLiteralAction_2_0()); 
            // InternalKlangParser.g:4888:2: ()
            // InternalKlangParser.g:4888:3: 
            {
            }

             after(grammarAccess.getAtomicExpressionAccess().getIntegerLiteralAction_2_0()); 

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
    // InternalKlangParser.g:4896:1: rule__AtomicExpression__Group_2__1 : rule__AtomicExpression__Group_2__1__Impl ;
    public final void rule__AtomicExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4900:1: ( rule__AtomicExpression__Group_2__1__Impl )
            // InternalKlangParser.g:4901:2: rule__AtomicExpression__Group_2__1__Impl
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
    // InternalKlangParser.g:4907:1: rule__AtomicExpression__Group_2__1__Impl : ( ( rule__AtomicExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__AtomicExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4911:1: ( ( ( rule__AtomicExpression__ValueAssignment_2_1 ) ) )
            // InternalKlangParser.g:4912:1: ( ( rule__AtomicExpression__ValueAssignment_2_1 ) )
            {
            // InternalKlangParser.g:4912:1: ( ( rule__AtomicExpression__ValueAssignment_2_1 ) )
            // InternalKlangParser.g:4913:2: ( rule__AtomicExpression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicExpressionAccess().getValueAssignment_2_1()); 
            // InternalKlangParser.g:4914:2: ( rule__AtomicExpression__ValueAssignment_2_1 )
            // InternalKlangParser.g:4914:3: rule__AtomicExpression__ValueAssignment_2_1
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
    // InternalKlangParser.g:4923:1: rule__AtomicExpression__Group_3__0 : rule__AtomicExpression__Group_3__0__Impl rule__AtomicExpression__Group_3__1 ;
    public final void rule__AtomicExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4927:1: ( rule__AtomicExpression__Group_3__0__Impl rule__AtomicExpression__Group_3__1 )
            // InternalKlangParser.g:4928:2: rule__AtomicExpression__Group_3__0__Impl rule__AtomicExpression__Group_3__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalKlangParser.g:4935:1: rule__AtomicExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__AtomicExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4939:1: ( ( () ) )
            // InternalKlangParser.g:4940:1: ( () )
            {
            // InternalKlangParser.g:4940:1: ( () )
            // InternalKlangParser.g:4941:2: ()
            {
             before(grammarAccess.getAtomicExpressionAccess().getStringLiteralAction_3_0()); 
            // InternalKlangParser.g:4942:2: ()
            // InternalKlangParser.g:4942:3: 
            {
            }

             after(grammarAccess.getAtomicExpressionAccess().getStringLiteralAction_3_0()); 

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
    // InternalKlangParser.g:4950:1: rule__AtomicExpression__Group_3__1 : rule__AtomicExpression__Group_3__1__Impl ;
    public final void rule__AtomicExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4954:1: ( rule__AtomicExpression__Group_3__1__Impl )
            // InternalKlangParser.g:4955:2: rule__AtomicExpression__Group_3__1__Impl
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
    // InternalKlangParser.g:4961:1: rule__AtomicExpression__Group_3__1__Impl : ( ( rule__AtomicExpression__ValueAssignment_3_1 ) ) ;
    public final void rule__AtomicExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4965:1: ( ( ( rule__AtomicExpression__ValueAssignment_3_1 ) ) )
            // InternalKlangParser.g:4966:1: ( ( rule__AtomicExpression__ValueAssignment_3_1 ) )
            {
            // InternalKlangParser.g:4966:1: ( ( rule__AtomicExpression__ValueAssignment_3_1 ) )
            // InternalKlangParser.g:4967:2: ( rule__AtomicExpression__ValueAssignment_3_1 )
            {
             before(grammarAccess.getAtomicExpressionAccess().getValueAssignment_3_1()); 
            // InternalKlangParser.g:4968:2: ( rule__AtomicExpression__ValueAssignment_3_1 )
            // InternalKlangParser.g:4968:3: rule__AtomicExpression__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AtomicExpression__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicExpressionAccess().getValueAssignment_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__AtomicExpression__Group_4__0"
    // InternalKlangParser.g:4977:1: rule__AtomicExpression__Group_4__0 : rule__AtomicExpression__Group_4__0__Impl rule__AtomicExpression__Group_4__1 ;
    public final void rule__AtomicExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4981:1: ( rule__AtomicExpression__Group_4__0__Impl rule__AtomicExpression__Group_4__1 )
            // InternalKlangParser.g:4982:2: rule__AtomicExpression__Group_4__0__Impl rule__AtomicExpression__Group_4__1
            {
            pushFollow(FOLLOW_22);
            rule__AtomicExpression__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicExpression__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Group_4__0"


    // $ANTLR start "rule__AtomicExpression__Group_4__0__Impl"
    // InternalKlangParser.g:4989:1: rule__AtomicExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__AtomicExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4993:1: ( ( () ) )
            // InternalKlangParser.g:4994:1: ( () )
            {
            // InternalKlangParser.g:4994:1: ( () )
            // InternalKlangParser.g:4995:2: ()
            {
             before(grammarAccess.getAtomicExpressionAccess().getVariableReferenceAction_4_0()); 
            // InternalKlangParser.g:4996:2: ()
            // InternalKlangParser.g:4996:3: 
            {
            }

             after(grammarAccess.getAtomicExpressionAccess().getVariableReferenceAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Group_4__0__Impl"


    // $ANTLR start "rule__AtomicExpression__Group_4__1"
    // InternalKlangParser.g:5004:1: rule__AtomicExpression__Group_4__1 : rule__AtomicExpression__Group_4__1__Impl ;
    public final void rule__AtomicExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5008:1: ( rule__AtomicExpression__Group_4__1__Impl )
            // InternalKlangParser.g:5009:2: rule__AtomicExpression__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicExpression__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Group_4__1"


    // $ANTLR start "rule__AtomicExpression__Group_4__1__Impl"
    // InternalKlangParser.g:5015:1: rule__AtomicExpression__Group_4__1__Impl : ( ( rule__AtomicExpression__VariableNameAssignment_4_1 ) ) ;
    public final void rule__AtomicExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5019:1: ( ( ( rule__AtomicExpression__VariableNameAssignment_4_1 ) ) )
            // InternalKlangParser.g:5020:1: ( ( rule__AtomicExpression__VariableNameAssignment_4_1 ) )
            {
            // InternalKlangParser.g:5020:1: ( ( rule__AtomicExpression__VariableNameAssignment_4_1 ) )
            // InternalKlangParser.g:5021:2: ( rule__AtomicExpression__VariableNameAssignment_4_1 )
            {
             before(grammarAccess.getAtomicExpressionAccess().getVariableNameAssignment_4_1()); 
            // InternalKlangParser.g:5022:2: ( rule__AtomicExpression__VariableNameAssignment_4_1 )
            // InternalKlangParser.g:5022:3: rule__AtomicExpression__VariableNameAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__AtomicExpression__VariableNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicExpressionAccess().getVariableNameAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Group_4__1__Impl"


    // $ANTLR start "rule__DECIMAL__Group__0"
    // InternalKlangParser.g:5031:1: rule__DECIMAL__Group__0 : rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 ;
    public final void rule__DECIMAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5035:1: ( rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 )
            // InternalKlangParser.g:5036:2: rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1
            {
            pushFollow(FOLLOW_53);
            rule__DECIMAL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__0"


    // $ANTLR start "rule__DECIMAL__Group__0__Impl"
    // InternalKlangParser.g:5043:1: rule__DECIMAL__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5047:1: ( ( RULE_INT ) )
            // InternalKlangParser.g:5048:1: ( RULE_INT )
            {
            // InternalKlangParser.g:5048:1: ( RULE_INT )
            // InternalKlangParser.g:5049:2: RULE_INT
            {
             before(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__0__Impl"


    // $ANTLR start "rule__DECIMAL__Group__1"
    // InternalKlangParser.g:5058:1: rule__DECIMAL__Group__1 : rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 ;
    public final void rule__DECIMAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5062:1: ( rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 )
            // InternalKlangParser.g:5063:2: rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__DECIMAL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__1"


    // $ANTLR start "rule__DECIMAL__Group__1__Impl"
    // InternalKlangParser.g:5070:1: rule__DECIMAL__Group__1__Impl : ( FullStop ) ;
    public final void rule__DECIMAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5074:1: ( ( FullStop ) )
            // InternalKlangParser.g:5075:1: ( FullStop )
            {
            // InternalKlangParser.g:5075:1: ( FullStop )
            // InternalKlangParser.g:5076:2: FullStop
            {
             before(grammarAccess.getDECIMALAccess().getFullStopKeyword_1()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getDECIMALAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__1__Impl"


    // $ANTLR start "rule__DECIMAL__Group__2"
    // InternalKlangParser.g:5085:1: rule__DECIMAL__Group__2 : rule__DECIMAL__Group__2__Impl ;
    public final void rule__DECIMAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5089:1: ( rule__DECIMAL__Group__2__Impl )
            // InternalKlangParser.g:5090:2: rule__DECIMAL__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__2"


    // $ANTLR start "rule__DECIMAL__Group__2__Impl"
    // InternalKlangParser.g:5096:1: rule__DECIMAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5100:1: ( ( RULE_INT ) )
            // InternalKlangParser.g:5101:1: ( RULE_INT )
            {
            // InternalKlangParser.g:5101:1: ( RULE_INT )
            // InternalKlangParser.g:5102:2: RULE_INT
            {
             before(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__2__Impl"


    // $ANTLR start "rule__SceneActor__LocalVariablesAssignment_1"
    // InternalKlangParser.g:5112:1: rule__SceneActor__LocalVariablesAssignment_1 : ( ruleVariableDeclaration ) ;
    public final void rule__SceneActor__LocalVariablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5116:1: ( ( ruleVariableDeclaration ) )
            // InternalKlangParser.g:5117:2: ( ruleVariableDeclaration )
            {
            // InternalKlangParser.g:5117:2: ( ruleVariableDeclaration )
            // InternalKlangParser.g:5118:3: ruleVariableDeclaration
            {
             before(grammarAccess.getSceneActorAccess().getLocalVariablesVariableDeclarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getSceneActorAccess().getLocalVariablesVariableDeclarationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneActor__LocalVariablesAssignment_1"


    // $ANTLR start "rule__SceneActor__EventHandlersAssignment_2"
    // InternalKlangParser.g:5127:1: rule__SceneActor__EventHandlersAssignment_2 : ( ruleEventHandler ) ;
    public final void rule__SceneActor__EventHandlersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5131:1: ( ( ruleEventHandler ) )
            // InternalKlangParser.g:5132:2: ( ruleEventHandler )
            {
            // InternalKlangParser.g:5132:2: ( ruleEventHandler )
            // InternalKlangParser.g:5133:3: ruleEventHandler
            {
             before(grammarAccess.getSceneActorAccess().getEventHandlersEventHandlerParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEventHandler();

            state._fsp--;

             after(grammarAccess.getSceneActorAccess().getEventHandlersEventHandlerParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneActor__EventHandlersAssignment_2"


    // $ANTLR start "rule__SceneActor__ChildrenAssignment_3"
    // InternalKlangParser.g:5142:1: rule__SceneActor__ChildrenAssignment_3 : ( ruleSpriteActor ) ;
    public final void rule__SceneActor__ChildrenAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5146:1: ( ( ruleSpriteActor ) )
            // InternalKlangParser.g:5147:2: ( ruleSpriteActor )
            {
            // InternalKlangParser.g:5147:2: ( ruleSpriteActor )
            // InternalKlangParser.g:5148:3: ruleSpriteActor
            {
             before(grammarAccess.getSceneActorAccess().getChildrenSpriteActorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSpriteActor();

            state._fsp--;

             after(grammarAccess.getSceneActorAccess().getChildrenSpriteActorParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneActor__ChildrenAssignment_3"


    // $ANTLR start "rule__SpriteActor__NameAssignment_2"
    // InternalKlangParser.g:5157:1: rule__SpriteActor__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SpriteActor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5161:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:5162:2: ( RULE_ID )
            {
            // InternalKlangParser.g:5162:2: ( RULE_ID )
            // InternalKlangParser.g:5163:3: RULE_ID
            {
             before(grammarAccess.getSpriteActorAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSpriteActorAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteActor__NameAssignment_2"


    // $ANTLR start "rule__SpriteActor__LocalVariablesAssignment_4"
    // InternalKlangParser.g:5172:1: rule__SpriteActor__LocalVariablesAssignment_4 : ( ruleVariableDeclaration ) ;
    public final void rule__SpriteActor__LocalVariablesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5176:1: ( ( ruleVariableDeclaration ) )
            // InternalKlangParser.g:5177:2: ( ruleVariableDeclaration )
            {
            // InternalKlangParser.g:5177:2: ( ruleVariableDeclaration )
            // InternalKlangParser.g:5178:3: ruleVariableDeclaration
            {
             before(grammarAccess.getSpriteActorAccess().getLocalVariablesVariableDeclarationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getSpriteActorAccess().getLocalVariablesVariableDeclarationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteActor__LocalVariablesAssignment_4"


    // $ANTLR start "rule__SpriteActor__EventHandlersAssignment_5"
    // InternalKlangParser.g:5187:1: rule__SpriteActor__EventHandlersAssignment_5 : ( ruleEventHandler ) ;
    public final void rule__SpriteActor__EventHandlersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5191:1: ( ( ruleEventHandler ) )
            // InternalKlangParser.g:5192:2: ( ruleEventHandler )
            {
            // InternalKlangParser.g:5192:2: ( ruleEventHandler )
            // InternalKlangParser.g:5193:3: ruleEventHandler
            {
             before(grammarAccess.getSpriteActorAccess().getEventHandlersEventHandlerParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEventHandler();

            state._fsp--;

             after(grammarAccess.getSpriteActorAccess().getEventHandlersEventHandlerParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteActor__EventHandlersAssignment_5"


    // $ANTLR start "rule__GameStart__StatementsAssignment_5"
    // InternalKlangParser.g:5202:1: rule__GameStart__StatementsAssignment_5 : ( ruleStatement ) ;
    public final void rule__GameStart__StatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5206:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:5207:2: ( ruleStatement )
            {
            // InternalKlangParser.g:5207:2: ( ruleStatement )
            // InternalKlangParser.g:5208:3: ruleStatement
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
    // InternalKlangParser.g:5217:1: rule__SpriteClicked__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__SpriteClicked__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5221:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:5222:2: ( ruleStatement )
            {
            // InternalKlangParser.g:5222:2: ( ruleStatement )
            // InternalKlangParser.g:5223:3: ruleStatement
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
    // InternalKlangParser.g:5232:1: rule__KeyPressed__KeyAssignment_2 : ( RULE_ID ) ;
    public final void rule__KeyPressed__KeyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5236:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:5237:2: ( RULE_ID )
            {
            // InternalKlangParser.g:5237:2: ( RULE_ID )
            // InternalKlangParser.g:5238:3: RULE_ID
            {
             before(grammarAccess.getKeyPressedAccess().getKeyIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getKeyPressedAccess().getKeyIDTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // InternalKlangParser.g:5247:1: rule__KeyPressed__StatementsAssignment_6 : ( ruleStatement ) ;
    public final void rule__KeyPressed__StatementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5251:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:5252:2: ( ruleStatement )
            {
            // InternalKlangParser.g:5252:2: ( ruleStatement )
            // InternalKlangParser.g:5253:3: ruleStatement
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
    // InternalKlangParser.g:5262:1: rule__CollidesWith__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__CollidesWith__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5266:1: ( ( ( RULE_ID ) ) )
            // InternalKlangParser.g:5267:2: ( ( RULE_ID ) )
            {
            // InternalKlangParser.g:5267:2: ( ( RULE_ID ) )
            // InternalKlangParser.g:5268:3: ( RULE_ID )
            {
             before(grammarAccess.getCollidesWithAccess().getTargetSpriteActorCrossReference_4_0()); 
            // InternalKlangParser.g:5269:3: ( RULE_ID )
            // InternalKlangParser.g:5270:4: RULE_ID
            {
             before(grammarAccess.getCollidesWithAccess().getTargetSpriteActorIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCollidesWithAccess().getTargetSpriteActorIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getCollidesWithAccess().getTargetSpriteActorCrossReference_4_0()); 

            }


            }

        }
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
    // InternalKlangParser.g:5281:1: rule__CollidesWith__StatementsAssignment_6 : ( ruleStatement ) ;
    public final void rule__CollidesWith__StatementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5285:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:5286:2: ( ruleStatement )
            {
            // InternalKlangParser.g:5286:2: ( ruleStatement )
            // InternalKlangParser.g:5287:3: ruleStatement
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
    // InternalKlangParser.g:5296:1: rule__WhileLoop__PredicateAssignment_2 : ( ruleExpression ) ;
    public final void rule__WhileLoop__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5300:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:5301:2: ( ruleExpression )
            {
            // InternalKlangParser.g:5301:2: ( ruleExpression )
            // InternalKlangParser.g:5302:3: ruleExpression
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
    // InternalKlangParser.g:5311:1: rule__WhileLoop__LoopBlockAssignment_4 : ( ruleStatement ) ;
    public final void rule__WhileLoop__LoopBlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5315:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:5316:2: ( ruleStatement )
            {
            // InternalKlangParser.g:5316:2: ( ruleStatement )
            // InternalKlangParser.g:5317:3: ruleStatement
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
    // InternalKlangParser.g:5326:1: rule__If__PredicateAssignment_2 : ( ruleExpression ) ;
    public final void rule__If__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5330:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:5331:2: ( ruleExpression )
            {
            // InternalKlangParser.g:5331:2: ( ruleExpression )
            // InternalKlangParser.g:5332:3: ruleExpression
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
    // InternalKlangParser.g:5341:1: rule__If__IfBlockAssignment_4 : ( ruleStatement ) ;
    public final void rule__If__IfBlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5345:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:5346:2: ( ruleStatement )
            {
            // InternalKlangParser.g:5346:2: ( ruleStatement )
            // InternalKlangParser.g:5347:3: ruleStatement
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
    // InternalKlangParser.g:5356:1: rule__If__ElseBlockAssignment_6_2 : ( ruleStatement ) ;
    public final void rule__If__ElseBlockAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5360:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:5361:2: ( ruleStatement )
            {
            // InternalKlangParser.g:5361:2: ( ruleStatement )
            // InternalKlangParser.g:5362:3: ruleStatement
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
    // InternalKlangParser.g:5371:1: rule__ForeverLoop__LoopStatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__ForeverLoop__LoopStatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5375:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:5376:2: ( ruleStatement )
            {
            // InternalKlangParser.g:5376:2: ( ruleStatement )
            // InternalKlangParser.g:5377:3: ruleStatement
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


    // $ANTLR start "rule__VariableDeclaration__NameAssignment_1"
    // InternalKlangParser.g:5386:1: rule__VariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5390:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:5391:2: ( RULE_ID )
            {
            // InternalKlangParser.g:5391:2: ( RULE_ID )
            // InternalKlangParser.g:5392:3: RULE_ID
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__NameAssignment_1"


    // $ANTLR start "rule__VariableDeclaration__ExpressionAssignment_3"
    // InternalKlangParser.g:5401:1: rule__VariableDeclaration__ExpressionAssignment_3 : ( ruleExpression ) ;
    public final void rule__VariableDeclaration__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5405:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:5406:2: ( ruleExpression )
            {
            // InternalKlangParser.g:5406:2: ( ruleExpression )
            // InternalKlangParser.g:5407:3: ruleExpression
            {
             before(grammarAccess.getVariableDeclarationAccess().getExpressionExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationAccess().getExpressionExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__ExpressionAssignment_3"


    // $ANTLR start "rule__VariableAssignment__VariableNameAssignment_0"
    // InternalKlangParser.g:5416:1: rule__VariableAssignment__VariableNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__VariableAssignment__VariableNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5420:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:5421:2: ( RULE_ID )
            {
            // InternalKlangParser.g:5421:2: ( RULE_ID )
            // InternalKlangParser.g:5422:3: RULE_ID
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
    // InternalKlangParser.g:5431:1: rule__VariableAssignment__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__VariableAssignment__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5435:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:5436:2: ( ruleExpression )
            {
            // InternalKlangParser.g:5436:2: ( ruleExpression )
            // InternalKlangParser.g:5437:3: ruleExpression
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
    // InternalKlangParser.g:5446:1: rule__Sleep__DurationAssignment_3 : ( ruleDECIMAL ) ;
    public final void rule__Sleep__DurationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5450:1: ( ( ruleDECIMAL ) )
            // InternalKlangParser.g:5451:2: ( ruleDECIMAL )
            {
            // InternalKlangParser.g:5451:2: ( ruleDECIMAL )
            // InternalKlangParser.g:5452:3: ruleDECIMAL
            {
             before(grammarAccess.getSleepAccess().getDurationDECIMALParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDECIMAL();

            state._fsp--;

             after(grammarAccess.getSleepAccess().getDurationDECIMALParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalKlangParser.g:5461:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5465:1: ( ( ruleAnd ) )
            // InternalKlangParser.g:5466:2: ( ruleAnd )
            {
            // InternalKlangParser.g:5466:2: ( ruleAnd )
            // InternalKlangParser.g:5467:3: ruleAnd
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
    // InternalKlangParser.g:5476:1: rule__And__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5480:1: ( ( ruleComparison ) )
            // InternalKlangParser.g:5481:2: ( ruleComparison )
            {
            // InternalKlangParser.g:5481:2: ( ruleComparison )
            // InternalKlangParser.g:5482:3: ruleComparison
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
    // InternalKlangParser.g:5491:1: rule__Plus__RightAssignment_1_2 : ( ruleMinus ) ;
    public final void rule__Plus__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5495:1: ( ( ruleMinus ) )
            // InternalKlangParser.g:5496:2: ( ruleMinus )
            {
            // InternalKlangParser.g:5496:2: ( ruleMinus )
            // InternalKlangParser.g:5497:3: ruleMinus
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
    // InternalKlangParser.g:5506:1: rule__Minus__RightAssignment_1_2 : ( ruleMultiply ) ;
    public final void rule__Minus__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5510:1: ( ( ruleMultiply ) )
            // InternalKlangParser.g:5511:2: ( ruleMultiply )
            {
            // InternalKlangParser.g:5511:2: ( ruleMultiply )
            // InternalKlangParser.g:5512:3: ruleMultiply
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
    // InternalKlangParser.g:5521:1: rule__Multiply__RightAssignment_1_2 : ( ruleDivide ) ;
    public final void rule__Multiply__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5525:1: ( ( ruleDivide ) )
            // InternalKlangParser.g:5526:2: ( ruleDivide )
            {
            // InternalKlangParser.g:5526:2: ( ruleDivide )
            // InternalKlangParser.g:5527:3: ruleDivide
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
    // InternalKlangParser.g:5536:1: rule__Divide__RightAssignment_1_2 : ( rulePrimaryExpression ) ;
    public final void rule__Divide__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5540:1: ( ( rulePrimaryExpression ) )
            // InternalKlangParser.g:5541:2: ( rulePrimaryExpression )
            {
            // InternalKlangParser.g:5541:2: ( rulePrimaryExpression )
            // InternalKlangParser.g:5542:3: rulePrimaryExpression
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
    // InternalKlangParser.g:5551:1: rule__Comparison__RightAssignment_1_1 : ( rulePlus ) ;
    public final void rule__Comparison__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5555:1: ( ( rulePlus ) )
            // InternalKlangParser.g:5556:2: ( rulePlus )
            {
            // InternalKlangParser.g:5556:2: ( rulePlus )
            // InternalKlangParser.g:5557:3: rulePlus
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
    // InternalKlangParser.g:5566:1: rule__FunctionCall__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FunctionCall__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5570:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:5571:2: ( RULE_ID )
            {
            // InternalKlangParser.g:5571:2: ( RULE_ID )
            // InternalKlangParser.g:5572:3: RULE_ID
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
    // InternalKlangParser.g:5581:1: rule__FunctionCall__ParametersAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__FunctionCall__ParametersAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5585:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:5586:2: ( ruleExpression )
            {
            // InternalKlangParser.g:5586:2: ( ruleExpression )
            // InternalKlangParser.g:5587:3: ruleExpression
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
    // InternalKlangParser.g:5596:1: rule__FunctionCall__ParametersAssignment_2_1_1 : ( ruleExpression ) ;
    public final void rule__FunctionCall__ParametersAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5600:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:5601:2: ( ruleExpression )
            {
            // InternalKlangParser.g:5601:2: ( ruleExpression )
            // InternalKlangParser.g:5602:3: ruleExpression
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
    // InternalKlangParser.g:5611:1: rule__PrimaryExpression__ExpressionAssignment_1_2 : ( rulePrimaryExpression ) ;
    public final void rule__PrimaryExpression__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5615:1: ( ( rulePrimaryExpression ) )
            // InternalKlangParser.g:5616:2: ( rulePrimaryExpression )
            {
            // InternalKlangParser.g:5616:2: ( rulePrimaryExpression )
            // InternalKlangParser.g:5617:3: rulePrimaryExpression
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


    // $ANTLR start "rule__PrimaryExpression__ExpressionAssignment_2_2"
    // InternalKlangParser.g:5626:1: rule__PrimaryExpression__ExpressionAssignment_2_2 : ( rulePrimaryExpression ) ;
    public final void rule__PrimaryExpression__ExpressionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5630:1: ( ( rulePrimaryExpression ) )
            // InternalKlangParser.g:5631:2: ( rulePrimaryExpression )
            {
            // InternalKlangParser.g:5631:2: ( rulePrimaryExpression )
            // InternalKlangParser.g:5632:3: rulePrimaryExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__ExpressionAssignment_2_2"


    // $ANTLR start "rule__PrimaryExpression__ExpressionAssignment_3_4"
    // InternalKlangParser.g:5641:1: rule__PrimaryExpression__ExpressionAssignment_3_4 : ( rulePrimaryExpression ) ;
    public final void rule__PrimaryExpression__ExpressionAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5645:1: ( ( rulePrimaryExpression ) )
            // InternalKlangParser.g:5646:2: ( rulePrimaryExpression )
            {
            // InternalKlangParser.g:5646:2: ( rulePrimaryExpression )
            // InternalKlangParser.g:5647:3: rulePrimaryExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_3_4_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__ExpressionAssignment_3_4"


    // $ANTLR start "rule__PrimaryExpression__ExpressionAssignment_4_4"
    // InternalKlangParser.g:5656:1: rule__PrimaryExpression__ExpressionAssignment_4_4 : ( rulePrimaryExpression ) ;
    public final void rule__PrimaryExpression__ExpressionAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5660:1: ( ( rulePrimaryExpression ) )
            // InternalKlangParser.g:5661:2: ( rulePrimaryExpression )
            {
            // InternalKlangParser.g:5661:2: ( rulePrimaryExpression )
            // InternalKlangParser.g:5662:3: rulePrimaryExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_4_4_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_4_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__ExpressionAssignment_4_4"


    // $ANTLR start "rule__AtomicExpression__ValueAssignment_0_1_0"
    // InternalKlangParser.g:5671:1: rule__AtomicExpression__ValueAssignment_0_1_0 : ( ( True ) ) ;
    public final void rule__AtomicExpression__ValueAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5675:1: ( ( ( True ) ) )
            // InternalKlangParser.g:5676:2: ( ( True ) )
            {
            // InternalKlangParser.g:5676:2: ( ( True ) )
            // InternalKlangParser.g:5677:3: ( True )
            {
             before(grammarAccess.getAtomicExpressionAccess().getValueTrueKeyword_0_1_0_0()); 
            // InternalKlangParser.g:5678:3: ( True )
            // InternalKlangParser.g:5679:4: True
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
    // InternalKlangParser.g:5690:1: rule__AtomicExpression__ValueAssignment_1_1 : ( ruleDECIMAL ) ;
    public final void rule__AtomicExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5694:1: ( ( ruleDECIMAL ) )
            // InternalKlangParser.g:5695:2: ( ruleDECIMAL )
            {
            // InternalKlangParser.g:5695:2: ( ruleDECIMAL )
            // InternalKlangParser.g:5696:3: ruleDECIMAL
            {
             before(grammarAccess.getAtomicExpressionAccess().getValueDECIMALParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDECIMAL();

            state._fsp--;

             after(grammarAccess.getAtomicExpressionAccess().getValueDECIMALParserRuleCall_1_1_0()); 

            }


            }

        }
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
    // InternalKlangParser.g:5705:1: rule__AtomicExpression__ValueAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__AtomicExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5709:1: ( ( RULE_INT ) )
            // InternalKlangParser.g:5710:2: ( RULE_INT )
            {
            // InternalKlangParser.g:5710:2: ( RULE_INT )
            // InternalKlangParser.g:5711:3: RULE_INT
            {
             before(grammarAccess.getAtomicExpressionAccess().getValueINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAtomicExpressionAccess().getValueINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__AtomicExpression__ValueAssignment_3_1"
    // InternalKlangParser.g:5720:1: rule__AtomicExpression__ValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__AtomicExpression__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5724:1: ( ( RULE_STRING ) )
            // InternalKlangParser.g:5725:2: ( RULE_STRING )
            {
            // InternalKlangParser.g:5725:2: ( RULE_STRING )
            // InternalKlangParser.g:5726:3: RULE_STRING
            {
             before(grammarAccess.getAtomicExpressionAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAtomicExpressionAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__ValueAssignment_3_1"


    // $ANTLR start "rule__AtomicExpression__VariableNameAssignment_4_1"
    // InternalKlangParser.g:5735:1: rule__AtomicExpression__VariableNameAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__AtomicExpression__VariableNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5739:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:5740:2: ( RULE_ID )
            {
            // InternalKlangParser.g:5740:2: ( RULE_ID )
            // InternalKlangParser.g:5741:3: RULE_ID
            {
             before(grammarAccess.getAtomicExpressionAccess().getVariableNameIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtomicExpressionAccess().getVariableNameIDTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__VariableNameAssignment_4_1"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\4\uffff\1\5\5\uffff";
    static final String dfa_3s = "\1\13\1\10\2\uffff\1\6\5\uffff";
    static final String dfa_4s = "\2\52\2\uffff\1\50\5\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\uffff\1\7\1\1\1\5\1\4\1\6";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\5\4\uffff\1\5\5\uffff\1\2\4\uffff\1\1\4\uffff\1\3\7\uffff\1\4\2\5",
            "\1\10\2\uffff\1\6\4\uffff\1\6\3\uffff\1\7\1\uffff\1\6\4\uffff\1\6\4\uffff\1\6\7\uffff\3\6",
            "",
            "",
            "\1\5\2\uffff\1\5\2\uffff\2\5\3\uffff\1\5\1\uffff\1\5\3\uffff\4\5\1\11\5\5\1\uffff\2\5\1\uffff\4\5",
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "843:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) | ( ruleFunctionCall ) | ( ruleAtomicExpression ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000820200L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000008000820000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000018002003040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000010002003042L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000070108410800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010002003040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000002801000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000002801000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000070118410800L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000200000000L});

}