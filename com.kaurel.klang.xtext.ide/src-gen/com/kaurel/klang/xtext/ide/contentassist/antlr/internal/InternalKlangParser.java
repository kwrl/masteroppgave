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
    		tokenNameToValue.put("Scene", "'scene'");
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



    // $ANTLR start "entryRuleProgram"
    // InternalKlangParser.g:90:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalKlangParser.g:91:1: ( ruleProgram EOF )
            // InternalKlangParser.g:92:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalKlangParser.g:99:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:103:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalKlangParser.g:104:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalKlangParser.g:104:2: ( ( rule__Program__Group__0 ) )
            // InternalKlangParser.g:105:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalKlangParser.g:106:3: ( rule__Program__Group__0 )
            // InternalKlangParser.g:106:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleSceneActor"
    // InternalKlangParser.g:115:1: entryRuleSceneActor : ruleSceneActor EOF ;
    public final void entryRuleSceneActor() throws RecognitionException {
        try {
            // InternalKlangParser.g:116:1: ( ruleSceneActor EOF )
            // InternalKlangParser.g:117:1: ruleSceneActor EOF
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
    // InternalKlangParser.g:124:1: ruleSceneActor : ( ( rule__SceneActor__Group__0 ) ) ;
    public final void ruleSceneActor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:128:2: ( ( ( rule__SceneActor__Group__0 ) ) )
            // InternalKlangParser.g:129:2: ( ( rule__SceneActor__Group__0 ) )
            {
            // InternalKlangParser.g:129:2: ( ( rule__SceneActor__Group__0 ) )
            // InternalKlangParser.g:130:3: ( rule__SceneActor__Group__0 )
            {
             before(grammarAccess.getSceneActorAccess().getGroup()); 
            // InternalKlangParser.g:131:3: ( rule__SceneActor__Group__0 )
            // InternalKlangParser.g:131:4: rule__SceneActor__Group__0
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
    // InternalKlangParser.g:140:1: entryRuleSpriteActor : ruleSpriteActor EOF ;
    public final void entryRuleSpriteActor() throws RecognitionException {
        try {
            // InternalKlangParser.g:141:1: ( ruleSpriteActor EOF )
            // InternalKlangParser.g:142:1: ruleSpriteActor EOF
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
    // InternalKlangParser.g:149:1: ruleSpriteActor : ( ( rule__SpriteActor__Group__0 ) ) ;
    public final void ruleSpriteActor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:153:2: ( ( ( rule__SpriteActor__Group__0 ) ) )
            // InternalKlangParser.g:154:2: ( ( rule__SpriteActor__Group__0 ) )
            {
            // InternalKlangParser.g:154:2: ( ( rule__SpriteActor__Group__0 ) )
            // InternalKlangParser.g:155:3: ( rule__SpriteActor__Group__0 )
            {
             before(grammarAccess.getSpriteActorAccess().getGroup()); 
            // InternalKlangParser.g:156:3: ( rule__SpriteActor__Group__0 )
            // InternalKlangParser.g:156:4: rule__SpriteActor__Group__0
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
    // InternalKlangParser.g:165:1: entryRuleEventHandler : ruleEventHandler EOF ;
    public final void entryRuleEventHandler() throws RecognitionException {
        try {
            // InternalKlangParser.g:166:1: ( ruleEventHandler EOF )
            // InternalKlangParser.g:167:1: ruleEventHandler EOF
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
    // InternalKlangParser.g:174:1: ruleEventHandler : ( ( rule__EventHandler__Alternatives ) ) ;
    public final void ruleEventHandler() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:178:2: ( ( ( rule__EventHandler__Alternatives ) ) )
            // InternalKlangParser.g:179:2: ( ( rule__EventHandler__Alternatives ) )
            {
            // InternalKlangParser.g:179:2: ( ( rule__EventHandler__Alternatives ) )
            // InternalKlangParser.g:180:3: ( rule__EventHandler__Alternatives )
            {
             before(grammarAccess.getEventHandlerAccess().getAlternatives()); 
            // InternalKlangParser.g:181:3: ( rule__EventHandler__Alternatives )
            // InternalKlangParser.g:181:4: rule__EventHandler__Alternatives
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
    // InternalKlangParser.g:190:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalKlangParser.g:191:1: ( ruleStatement EOF )
            // InternalKlangParser.g:192:1: ruleStatement EOF
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
    // InternalKlangParser.g:199:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:203:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalKlangParser.g:204:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalKlangParser.g:204:2: ( ( rule__Statement__Alternatives ) )
            // InternalKlangParser.g:205:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalKlangParser.g:206:3: ( rule__Statement__Alternatives )
            // InternalKlangParser.g:206:4: rule__Statement__Alternatives
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
    // InternalKlangParser.g:215:1: entryRuleGameStart : ruleGameStart EOF ;
    public final void entryRuleGameStart() throws RecognitionException {
        try {
            // InternalKlangParser.g:216:1: ( ruleGameStart EOF )
            // InternalKlangParser.g:217:1: ruleGameStart EOF
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
    // InternalKlangParser.g:224:1: ruleGameStart : ( ( rule__GameStart__Group__0 ) ) ;
    public final void ruleGameStart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:228:2: ( ( ( rule__GameStart__Group__0 ) ) )
            // InternalKlangParser.g:229:2: ( ( rule__GameStart__Group__0 ) )
            {
            // InternalKlangParser.g:229:2: ( ( rule__GameStart__Group__0 ) )
            // InternalKlangParser.g:230:3: ( rule__GameStart__Group__0 )
            {
             before(grammarAccess.getGameStartAccess().getGroup()); 
            // InternalKlangParser.g:231:3: ( rule__GameStart__Group__0 )
            // InternalKlangParser.g:231:4: rule__GameStart__Group__0
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
    // InternalKlangParser.g:240:1: entryRuleSpriteClicked : ruleSpriteClicked EOF ;
    public final void entryRuleSpriteClicked() throws RecognitionException {
        try {
            // InternalKlangParser.g:241:1: ( ruleSpriteClicked EOF )
            // InternalKlangParser.g:242:1: ruleSpriteClicked EOF
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
    // InternalKlangParser.g:249:1: ruleSpriteClicked : ( ( rule__SpriteClicked__Group__0 ) ) ;
    public final void ruleSpriteClicked() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:253:2: ( ( ( rule__SpriteClicked__Group__0 ) ) )
            // InternalKlangParser.g:254:2: ( ( rule__SpriteClicked__Group__0 ) )
            {
            // InternalKlangParser.g:254:2: ( ( rule__SpriteClicked__Group__0 ) )
            // InternalKlangParser.g:255:3: ( rule__SpriteClicked__Group__0 )
            {
             before(grammarAccess.getSpriteClickedAccess().getGroup()); 
            // InternalKlangParser.g:256:3: ( rule__SpriteClicked__Group__0 )
            // InternalKlangParser.g:256:4: rule__SpriteClicked__Group__0
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
    // InternalKlangParser.g:265:1: entryRuleKeyPressed : ruleKeyPressed EOF ;
    public final void entryRuleKeyPressed() throws RecognitionException {
        try {
            // InternalKlangParser.g:266:1: ( ruleKeyPressed EOF )
            // InternalKlangParser.g:267:1: ruleKeyPressed EOF
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
    // InternalKlangParser.g:274:1: ruleKeyPressed : ( ( rule__KeyPressed__Group__0 ) ) ;
    public final void ruleKeyPressed() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:278:2: ( ( ( rule__KeyPressed__Group__0 ) ) )
            // InternalKlangParser.g:279:2: ( ( rule__KeyPressed__Group__0 ) )
            {
            // InternalKlangParser.g:279:2: ( ( rule__KeyPressed__Group__0 ) )
            // InternalKlangParser.g:280:3: ( rule__KeyPressed__Group__0 )
            {
             before(grammarAccess.getKeyPressedAccess().getGroup()); 
            // InternalKlangParser.g:281:3: ( rule__KeyPressed__Group__0 )
            // InternalKlangParser.g:281:4: rule__KeyPressed__Group__0
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
    // InternalKlangParser.g:290:1: entryRuleCollidesWith : ruleCollidesWith EOF ;
    public final void entryRuleCollidesWith() throws RecognitionException {
        try {
            // InternalKlangParser.g:291:1: ( ruleCollidesWith EOF )
            // InternalKlangParser.g:292:1: ruleCollidesWith EOF
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
    // InternalKlangParser.g:299:1: ruleCollidesWith : ( ( rule__CollidesWith__Group__0 ) ) ;
    public final void ruleCollidesWith() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:303:2: ( ( ( rule__CollidesWith__Group__0 ) ) )
            // InternalKlangParser.g:304:2: ( ( rule__CollidesWith__Group__0 ) )
            {
            // InternalKlangParser.g:304:2: ( ( rule__CollidesWith__Group__0 ) )
            // InternalKlangParser.g:305:3: ( rule__CollidesWith__Group__0 )
            {
             before(grammarAccess.getCollidesWithAccess().getGroup()); 
            // InternalKlangParser.g:306:3: ( rule__CollidesWith__Group__0 )
            // InternalKlangParser.g:306:4: rule__CollidesWith__Group__0
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
    // InternalKlangParser.g:315:1: entryRuleWhileLoop : ruleWhileLoop EOF ;
    public final void entryRuleWhileLoop() throws RecognitionException {
        try {
            // InternalKlangParser.g:316:1: ( ruleWhileLoop EOF )
            // InternalKlangParser.g:317:1: ruleWhileLoop EOF
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
    // InternalKlangParser.g:324:1: ruleWhileLoop : ( ( rule__WhileLoop__Group__0 ) ) ;
    public final void ruleWhileLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:328:2: ( ( ( rule__WhileLoop__Group__0 ) ) )
            // InternalKlangParser.g:329:2: ( ( rule__WhileLoop__Group__0 ) )
            {
            // InternalKlangParser.g:329:2: ( ( rule__WhileLoop__Group__0 ) )
            // InternalKlangParser.g:330:3: ( rule__WhileLoop__Group__0 )
            {
             before(grammarAccess.getWhileLoopAccess().getGroup()); 
            // InternalKlangParser.g:331:3: ( rule__WhileLoop__Group__0 )
            // InternalKlangParser.g:331:4: rule__WhileLoop__Group__0
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
    // InternalKlangParser.g:340:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // InternalKlangParser.g:341:1: ( ruleIf EOF )
            // InternalKlangParser.g:342:1: ruleIf EOF
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
    // InternalKlangParser.g:349:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:353:2: ( ( ( rule__If__Group__0 ) ) )
            // InternalKlangParser.g:354:2: ( ( rule__If__Group__0 ) )
            {
            // InternalKlangParser.g:354:2: ( ( rule__If__Group__0 ) )
            // InternalKlangParser.g:355:3: ( rule__If__Group__0 )
            {
             before(grammarAccess.getIfAccess().getGroup()); 
            // InternalKlangParser.g:356:3: ( rule__If__Group__0 )
            // InternalKlangParser.g:356:4: rule__If__Group__0
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
    // InternalKlangParser.g:365:1: entryRuleForeverLoop : ruleForeverLoop EOF ;
    public final void entryRuleForeverLoop() throws RecognitionException {
        try {
            // InternalKlangParser.g:366:1: ( ruleForeverLoop EOF )
            // InternalKlangParser.g:367:1: ruleForeverLoop EOF
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
    // InternalKlangParser.g:374:1: ruleForeverLoop : ( ( rule__ForeverLoop__Group__0 ) ) ;
    public final void ruleForeverLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:378:2: ( ( ( rule__ForeverLoop__Group__0 ) ) )
            // InternalKlangParser.g:379:2: ( ( rule__ForeverLoop__Group__0 ) )
            {
            // InternalKlangParser.g:379:2: ( ( rule__ForeverLoop__Group__0 ) )
            // InternalKlangParser.g:380:3: ( rule__ForeverLoop__Group__0 )
            {
             before(grammarAccess.getForeverLoopAccess().getGroup()); 
            // InternalKlangParser.g:381:3: ( rule__ForeverLoop__Group__0 )
            // InternalKlangParser.g:381:4: rule__ForeverLoop__Group__0
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
    // InternalKlangParser.g:390:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // InternalKlangParser.g:391:1: ( ruleVariableDeclaration EOF )
            // InternalKlangParser.g:392:1: ruleVariableDeclaration EOF
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
    // InternalKlangParser.g:399:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:403:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // InternalKlangParser.g:404:2: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // InternalKlangParser.g:404:2: ( ( rule__VariableDeclaration__Group__0 ) )
            // InternalKlangParser.g:405:3: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // InternalKlangParser.g:406:3: ( rule__VariableDeclaration__Group__0 )
            // InternalKlangParser.g:406:4: rule__VariableDeclaration__Group__0
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
    // InternalKlangParser.g:415:1: entryRuleVariableAssignment : ruleVariableAssignment EOF ;
    public final void entryRuleVariableAssignment() throws RecognitionException {
        try {
            // InternalKlangParser.g:416:1: ( ruleVariableAssignment EOF )
            // InternalKlangParser.g:417:1: ruleVariableAssignment EOF
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
    // InternalKlangParser.g:424:1: ruleVariableAssignment : ( ( rule__VariableAssignment__Group__0 ) ) ;
    public final void ruleVariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:428:2: ( ( ( rule__VariableAssignment__Group__0 ) ) )
            // InternalKlangParser.g:429:2: ( ( rule__VariableAssignment__Group__0 ) )
            {
            // InternalKlangParser.g:429:2: ( ( rule__VariableAssignment__Group__0 ) )
            // InternalKlangParser.g:430:3: ( rule__VariableAssignment__Group__0 )
            {
             before(grammarAccess.getVariableAssignmentAccess().getGroup()); 
            // InternalKlangParser.g:431:3: ( rule__VariableAssignment__Group__0 )
            // InternalKlangParser.g:431:4: rule__VariableAssignment__Group__0
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
    // InternalKlangParser.g:440:1: entryRuleSleep : ruleSleep EOF ;
    public final void entryRuleSleep() throws RecognitionException {
        try {
            // InternalKlangParser.g:441:1: ( ruleSleep EOF )
            // InternalKlangParser.g:442:1: ruleSleep EOF
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
    // InternalKlangParser.g:449:1: ruleSleep : ( ( rule__Sleep__Group__0 ) ) ;
    public final void ruleSleep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:453:2: ( ( ( rule__Sleep__Group__0 ) ) )
            // InternalKlangParser.g:454:2: ( ( rule__Sleep__Group__0 ) )
            {
            // InternalKlangParser.g:454:2: ( ( rule__Sleep__Group__0 ) )
            // InternalKlangParser.g:455:3: ( rule__Sleep__Group__0 )
            {
             before(grammarAccess.getSleepAccess().getGroup()); 
            // InternalKlangParser.g:456:3: ( rule__Sleep__Group__0 )
            // InternalKlangParser.g:456:4: rule__Sleep__Group__0
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
    // InternalKlangParser.g:465:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalKlangParser.g:466:1: ( ruleExpression EOF )
            // InternalKlangParser.g:467:1: ruleExpression EOF
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
    // InternalKlangParser.g:474:1: ruleExpression : ( ruleOr ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:478:2: ( ( ruleOr ) )
            // InternalKlangParser.g:479:2: ( ruleOr )
            {
            // InternalKlangParser.g:479:2: ( ruleOr )
            // InternalKlangParser.g:480:3: ruleOr
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
    // InternalKlangParser.g:490:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalKlangParser.g:491:1: ( ruleOr EOF )
            // InternalKlangParser.g:492:1: ruleOr EOF
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
    // InternalKlangParser.g:499:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:503:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalKlangParser.g:504:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalKlangParser.g:504:2: ( ( rule__Or__Group__0 ) )
            // InternalKlangParser.g:505:3: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // InternalKlangParser.g:506:3: ( rule__Or__Group__0 )
            // InternalKlangParser.g:506:4: rule__Or__Group__0
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
    // InternalKlangParser.g:515:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalKlangParser.g:516:1: ( ruleAnd EOF )
            // InternalKlangParser.g:517:1: ruleAnd EOF
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
    // InternalKlangParser.g:524:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:528:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalKlangParser.g:529:2: ( ( rule__And__Group__0 ) )
            {
            // InternalKlangParser.g:529:2: ( ( rule__And__Group__0 ) )
            // InternalKlangParser.g:530:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalKlangParser.g:531:3: ( rule__And__Group__0 )
            // InternalKlangParser.g:531:4: rule__And__Group__0
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
    // InternalKlangParser.g:540:1: entryRulePlus : rulePlus EOF ;
    public final void entryRulePlus() throws RecognitionException {
        try {
            // InternalKlangParser.g:541:1: ( rulePlus EOF )
            // InternalKlangParser.g:542:1: rulePlus EOF
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
    // InternalKlangParser.g:549:1: rulePlus : ( ( rule__Plus__Group__0 ) ) ;
    public final void rulePlus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:553:2: ( ( ( rule__Plus__Group__0 ) ) )
            // InternalKlangParser.g:554:2: ( ( rule__Plus__Group__0 ) )
            {
            // InternalKlangParser.g:554:2: ( ( rule__Plus__Group__0 ) )
            // InternalKlangParser.g:555:3: ( rule__Plus__Group__0 )
            {
             before(grammarAccess.getPlusAccess().getGroup()); 
            // InternalKlangParser.g:556:3: ( rule__Plus__Group__0 )
            // InternalKlangParser.g:556:4: rule__Plus__Group__0
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
    // InternalKlangParser.g:565:1: entryRuleMinus : ruleMinus EOF ;
    public final void entryRuleMinus() throws RecognitionException {
        try {
            // InternalKlangParser.g:566:1: ( ruleMinus EOF )
            // InternalKlangParser.g:567:1: ruleMinus EOF
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
    // InternalKlangParser.g:574:1: ruleMinus : ( ( rule__Minus__Group__0 ) ) ;
    public final void ruleMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:578:2: ( ( ( rule__Minus__Group__0 ) ) )
            // InternalKlangParser.g:579:2: ( ( rule__Minus__Group__0 ) )
            {
            // InternalKlangParser.g:579:2: ( ( rule__Minus__Group__0 ) )
            // InternalKlangParser.g:580:3: ( rule__Minus__Group__0 )
            {
             before(grammarAccess.getMinusAccess().getGroup()); 
            // InternalKlangParser.g:581:3: ( rule__Minus__Group__0 )
            // InternalKlangParser.g:581:4: rule__Minus__Group__0
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
    // InternalKlangParser.g:590:1: entryRuleMultiply : ruleMultiply EOF ;
    public final void entryRuleMultiply() throws RecognitionException {
        try {
            // InternalKlangParser.g:591:1: ( ruleMultiply EOF )
            // InternalKlangParser.g:592:1: ruleMultiply EOF
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
    // InternalKlangParser.g:599:1: ruleMultiply : ( ( rule__Multiply__Group__0 ) ) ;
    public final void ruleMultiply() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:603:2: ( ( ( rule__Multiply__Group__0 ) ) )
            // InternalKlangParser.g:604:2: ( ( rule__Multiply__Group__0 ) )
            {
            // InternalKlangParser.g:604:2: ( ( rule__Multiply__Group__0 ) )
            // InternalKlangParser.g:605:3: ( rule__Multiply__Group__0 )
            {
             before(grammarAccess.getMultiplyAccess().getGroup()); 
            // InternalKlangParser.g:606:3: ( rule__Multiply__Group__0 )
            // InternalKlangParser.g:606:4: rule__Multiply__Group__0
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
    // InternalKlangParser.g:615:1: entryRuleDivide : ruleDivide EOF ;
    public final void entryRuleDivide() throws RecognitionException {
        try {
            // InternalKlangParser.g:616:1: ( ruleDivide EOF )
            // InternalKlangParser.g:617:1: ruleDivide EOF
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
    // InternalKlangParser.g:624:1: ruleDivide : ( ( rule__Divide__Group__0 ) ) ;
    public final void ruleDivide() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:628:2: ( ( ( rule__Divide__Group__0 ) ) )
            // InternalKlangParser.g:629:2: ( ( rule__Divide__Group__0 ) )
            {
            // InternalKlangParser.g:629:2: ( ( rule__Divide__Group__0 ) )
            // InternalKlangParser.g:630:3: ( rule__Divide__Group__0 )
            {
             before(grammarAccess.getDivideAccess().getGroup()); 
            // InternalKlangParser.g:631:3: ( rule__Divide__Group__0 )
            // InternalKlangParser.g:631:4: rule__Divide__Group__0
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
    // InternalKlangParser.g:640:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalKlangParser.g:641:1: ( ruleComparison EOF )
            // InternalKlangParser.g:642:1: ruleComparison EOF
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
    // InternalKlangParser.g:649:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:653:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalKlangParser.g:654:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalKlangParser.g:654:2: ( ( rule__Comparison__Group__0 ) )
            // InternalKlangParser.g:655:3: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // InternalKlangParser.g:656:3: ( rule__Comparison__Group__0 )
            // InternalKlangParser.g:656:4: rule__Comparison__Group__0
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
    // InternalKlangParser.g:665:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // InternalKlangParser.g:666:1: ( ruleFunctionCall EOF )
            // InternalKlangParser.g:667:1: ruleFunctionCall EOF
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
    // InternalKlangParser.g:674:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:678:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // InternalKlangParser.g:679:2: ( ( rule__FunctionCall__Group__0 ) )
            {
            // InternalKlangParser.g:679:2: ( ( rule__FunctionCall__Group__0 ) )
            // InternalKlangParser.g:680:3: ( rule__FunctionCall__Group__0 )
            {
             before(grammarAccess.getFunctionCallAccess().getGroup()); 
            // InternalKlangParser.g:681:3: ( rule__FunctionCall__Group__0 )
            // InternalKlangParser.g:681:4: rule__FunctionCall__Group__0
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
    // InternalKlangParser.g:690:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalKlangParser.g:691:1: ( rulePrimaryExpression EOF )
            // InternalKlangParser.g:692:1: rulePrimaryExpression EOF
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
    // InternalKlangParser.g:699:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:703:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalKlangParser.g:704:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalKlangParser.g:704:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalKlangParser.g:705:3: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // InternalKlangParser.g:706:3: ( rule__PrimaryExpression__Alternatives )
            // InternalKlangParser.g:706:4: rule__PrimaryExpression__Alternatives
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
    // InternalKlangParser.g:715:1: entryRuleAtomicExpression : ruleAtomicExpression EOF ;
    public final void entryRuleAtomicExpression() throws RecognitionException {
        try {
            // InternalKlangParser.g:716:1: ( ruleAtomicExpression EOF )
            // InternalKlangParser.g:717:1: ruleAtomicExpression EOF
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
    // InternalKlangParser.g:724:1: ruleAtomicExpression : ( ( rule__AtomicExpression__Alternatives ) ) ;
    public final void ruleAtomicExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:728:2: ( ( ( rule__AtomicExpression__Alternatives ) ) )
            // InternalKlangParser.g:729:2: ( ( rule__AtomicExpression__Alternatives ) )
            {
            // InternalKlangParser.g:729:2: ( ( rule__AtomicExpression__Alternatives ) )
            // InternalKlangParser.g:730:3: ( rule__AtomicExpression__Alternatives )
            {
             before(grammarAccess.getAtomicExpressionAccess().getAlternatives()); 
            // InternalKlangParser.g:731:3: ( rule__AtomicExpression__Alternatives )
            // InternalKlangParser.g:731:4: rule__AtomicExpression__Alternatives
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
    // InternalKlangParser.g:740:1: entryRuleDECIMAL : ruleDECIMAL EOF ;
    public final void entryRuleDECIMAL() throws RecognitionException {
        try {
            // InternalKlangParser.g:741:1: ( ruleDECIMAL EOF )
            // InternalKlangParser.g:742:1: ruleDECIMAL EOF
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
    // InternalKlangParser.g:749:1: ruleDECIMAL : ( ( rule__DECIMAL__Group__0 ) ) ;
    public final void ruleDECIMAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:753:2: ( ( ( rule__DECIMAL__Group__0 ) ) )
            // InternalKlangParser.g:754:2: ( ( rule__DECIMAL__Group__0 ) )
            {
            // InternalKlangParser.g:754:2: ( ( rule__DECIMAL__Group__0 ) )
            // InternalKlangParser.g:755:3: ( rule__DECIMAL__Group__0 )
            {
             before(grammarAccess.getDECIMALAccess().getGroup()); 
            // InternalKlangParser.g:756:3: ( rule__DECIMAL__Group__0 )
            // InternalKlangParser.g:756:4: rule__DECIMAL__Group__0
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
    // InternalKlangParser.g:764:1: rule__EventHandler__Alternatives : ( ( ruleGameStart ) | ( ruleSpriteClicked ) | ( ruleKeyPressed ) | ( ruleCollidesWith ) );
    public final void rule__EventHandler__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:768:1: ( ( ruleGameStart ) | ( ruleSpriteClicked ) | ( ruleKeyPressed ) | ( ruleCollidesWith ) )
            int alt1=4;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==When) ) {
                switch ( input.LA(2) ) {
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
                case Game:
                    {
                    alt1=1;
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
                    // InternalKlangParser.g:769:2: ( ruleGameStart )
                    {
                    // InternalKlangParser.g:769:2: ( ruleGameStart )
                    // InternalKlangParser.g:770:3: ruleGameStart
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
                    // InternalKlangParser.g:775:2: ( ruleSpriteClicked )
                    {
                    // InternalKlangParser.g:775:2: ( ruleSpriteClicked )
                    // InternalKlangParser.g:776:3: ruleSpriteClicked
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
                    // InternalKlangParser.g:781:2: ( ruleKeyPressed )
                    {
                    // InternalKlangParser.g:781:2: ( ruleKeyPressed )
                    // InternalKlangParser.g:782:3: ruleKeyPressed
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
                    // InternalKlangParser.g:787:2: ( ruleCollidesWith )
                    {
                    // InternalKlangParser.g:787:2: ( ruleCollidesWith )
                    // InternalKlangParser.g:788:3: ruleCollidesWith
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
    // InternalKlangParser.g:797:1: rule__Statement__Alternatives : ( ( ruleWhileLoop ) | ( ruleIf ) | ( ruleVariableAssignment ) | ( ruleForeverLoop ) | ( ruleFunctionCall ) | ( ruleSleep ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:801:1: ( ( ruleWhileLoop ) | ( ruleIf ) | ( ruleVariableAssignment ) | ( ruleForeverLoop ) | ( ruleFunctionCall ) | ( ruleSleep ) )
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
                    // InternalKlangParser.g:802:2: ( ruleWhileLoop )
                    {
                    // InternalKlangParser.g:802:2: ( ruleWhileLoop )
                    // InternalKlangParser.g:803:3: ruleWhileLoop
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
                    // InternalKlangParser.g:808:2: ( ruleIf )
                    {
                    // InternalKlangParser.g:808:2: ( ruleIf )
                    // InternalKlangParser.g:809:3: ruleIf
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
                    // InternalKlangParser.g:814:2: ( ruleVariableAssignment )
                    {
                    // InternalKlangParser.g:814:2: ( ruleVariableAssignment )
                    // InternalKlangParser.g:815:3: ruleVariableAssignment
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
                    // InternalKlangParser.g:820:2: ( ruleForeverLoop )
                    {
                    // InternalKlangParser.g:820:2: ( ruleForeverLoop )
                    // InternalKlangParser.g:821:3: ruleForeverLoop
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
                    // InternalKlangParser.g:826:2: ( ruleFunctionCall )
                    {
                    // InternalKlangParser.g:826:2: ( ruleFunctionCall )
                    // InternalKlangParser.g:827:3: ruleFunctionCall
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
                    // InternalKlangParser.g:832:2: ( ruleSleep )
                    {
                    // InternalKlangParser.g:832:2: ( ruleSleep )
                    // InternalKlangParser.g:833:3: ruleSleep
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
    // InternalKlangParser.g:842:1: rule__Comparison__Alternatives_1_0 : ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) | ( ( rule__Comparison__Group_1_0_2__0 ) ) );
    public final void rule__Comparison__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:846:1: ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) | ( ( rule__Comparison__Group_1_0_2__0 ) ) )
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
                    // InternalKlangParser.g:847:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    {
                    // InternalKlangParser.g:847:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    // InternalKlangParser.g:848:3: ( rule__Comparison__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0_0()); 
                    // InternalKlangParser.g:849:3: ( rule__Comparison__Group_1_0_0__0 )
                    // InternalKlangParser.g:849:4: rule__Comparison__Group_1_0_0__0
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
                    // InternalKlangParser.g:853:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    {
                    // InternalKlangParser.g:853:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    // InternalKlangParser.g:854:3: ( rule__Comparison__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0_1()); 
                    // InternalKlangParser.g:855:3: ( rule__Comparison__Group_1_0_1__0 )
                    // InternalKlangParser.g:855:4: rule__Comparison__Group_1_0_1__0
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
                    // InternalKlangParser.g:859:2: ( ( rule__Comparison__Group_1_0_2__0 ) )
                    {
                    // InternalKlangParser.g:859:2: ( ( rule__Comparison__Group_1_0_2__0 ) )
                    // InternalKlangParser.g:860:3: ( rule__Comparison__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0_2()); 
                    // InternalKlangParser.g:861:3: ( rule__Comparison__Group_1_0_2__0 )
                    // InternalKlangParser.g:861:4: rule__Comparison__Group_1_0_2__0
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
    // InternalKlangParser.g:869:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) | ( ruleFunctionCall ) | ( ruleAtomicExpression ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:873:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) | ( ruleFunctionCall ) | ( ruleAtomicExpression ) )
            int alt4=7;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalKlangParser.g:874:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // InternalKlangParser.g:874:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // InternalKlangParser.g:875:3: ( rule__PrimaryExpression__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    // InternalKlangParser.g:876:3: ( rule__PrimaryExpression__Group_0__0 )
                    // InternalKlangParser.g:876:4: rule__PrimaryExpression__Group_0__0
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
                    // InternalKlangParser.g:880:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    {
                    // InternalKlangParser.g:880:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    // InternalKlangParser.g:881:3: ( rule__PrimaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
                    // InternalKlangParser.g:882:3: ( rule__PrimaryExpression__Group_1__0 )
                    // InternalKlangParser.g:882:4: rule__PrimaryExpression__Group_1__0
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
                    // InternalKlangParser.g:886:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    {
                    // InternalKlangParser.g:886:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    // InternalKlangParser.g:887:3: ( rule__PrimaryExpression__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    // InternalKlangParser.g:888:3: ( rule__PrimaryExpression__Group_2__0 )
                    // InternalKlangParser.g:888:4: rule__PrimaryExpression__Group_2__0
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
                    // InternalKlangParser.g:892:2: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    {
                    // InternalKlangParser.g:892:2: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    // InternalKlangParser.g:893:3: ( rule__PrimaryExpression__Group_3__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_3()); 
                    // InternalKlangParser.g:894:3: ( rule__PrimaryExpression__Group_3__0 )
                    // InternalKlangParser.g:894:4: rule__PrimaryExpression__Group_3__0
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
                    // InternalKlangParser.g:898:2: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    {
                    // InternalKlangParser.g:898:2: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    // InternalKlangParser.g:899:3: ( rule__PrimaryExpression__Group_4__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_4()); 
                    // InternalKlangParser.g:900:3: ( rule__PrimaryExpression__Group_4__0 )
                    // InternalKlangParser.g:900:4: rule__PrimaryExpression__Group_4__0
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
                    // InternalKlangParser.g:904:2: ( ruleFunctionCall )
                    {
                    // InternalKlangParser.g:904:2: ( ruleFunctionCall )
                    // InternalKlangParser.g:905:3: ruleFunctionCall
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
                    // InternalKlangParser.g:910:2: ( ruleAtomicExpression )
                    {
                    // InternalKlangParser.g:910:2: ( ruleAtomicExpression )
                    // InternalKlangParser.g:911:3: ruleAtomicExpression
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
    // InternalKlangParser.g:920:1: rule__AtomicExpression__Alternatives : ( ( ( rule__AtomicExpression__Group_0__0 ) ) | ( ( rule__AtomicExpression__Group_1__0 ) ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) | ( ( rule__AtomicExpression__Group_4__0 ) ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:924:1: ( ( ( rule__AtomicExpression__Group_0__0 ) ) | ( ( rule__AtomicExpression__Group_1__0 ) ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) | ( ( rule__AtomicExpression__Group_4__0 ) ) )
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
                else if ( (LA5_2==EOF||LA5_2==Forever||(LA5_2>=Sleep && LA5_2<=While)||LA5_2==When||LA5_2==And||(LA5_2>=Var && LA5_2<=Or)||(LA5_2>=RightParenthesis && LA5_2<=HyphenMinus)||(LA5_2>=Solidus && LA5_2<=LessThanSign)||(LA5_2>=GreaterThanSign && LA5_2<=RULE_ID)) ) {
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
                    // InternalKlangParser.g:925:2: ( ( rule__AtomicExpression__Group_0__0 ) )
                    {
                    // InternalKlangParser.g:925:2: ( ( rule__AtomicExpression__Group_0__0 ) )
                    // InternalKlangParser.g:926:3: ( rule__AtomicExpression__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getGroup_0()); 
                    // InternalKlangParser.g:927:3: ( rule__AtomicExpression__Group_0__0 )
                    // InternalKlangParser.g:927:4: rule__AtomicExpression__Group_0__0
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
                    // InternalKlangParser.g:931:2: ( ( rule__AtomicExpression__Group_1__0 ) )
                    {
                    // InternalKlangParser.g:931:2: ( ( rule__AtomicExpression__Group_1__0 ) )
                    // InternalKlangParser.g:932:3: ( rule__AtomicExpression__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getGroup_1()); 
                    // InternalKlangParser.g:933:3: ( rule__AtomicExpression__Group_1__0 )
                    // InternalKlangParser.g:933:4: rule__AtomicExpression__Group_1__0
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
                    // InternalKlangParser.g:937:2: ( ( rule__AtomicExpression__Group_2__0 ) )
                    {
                    // InternalKlangParser.g:937:2: ( ( rule__AtomicExpression__Group_2__0 ) )
                    // InternalKlangParser.g:938:3: ( rule__AtomicExpression__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getGroup_2()); 
                    // InternalKlangParser.g:939:3: ( rule__AtomicExpression__Group_2__0 )
                    // InternalKlangParser.g:939:4: rule__AtomicExpression__Group_2__0
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
                    // InternalKlangParser.g:943:2: ( ( rule__AtomicExpression__Group_3__0 ) )
                    {
                    // InternalKlangParser.g:943:2: ( ( rule__AtomicExpression__Group_3__0 ) )
                    // InternalKlangParser.g:944:3: ( rule__AtomicExpression__Group_3__0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getGroup_3()); 
                    // InternalKlangParser.g:945:3: ( rule__AtomicExpression__Group_3__0 )
                    // InternalKlangParser.g:945:4: rule__AtomicExpression__Group_3__0
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
                    // InternalKlangParser.g:949:2: ( ( rule__AtomicExpression__Group_4__0 ) )
                    {
                    // InternalKlangParser.g:949:2: ( ( rule__AtomicExpression__Group_4__0 ) )
                    // InternalKlangParser.g:950:3: ( rule__AtomicExpression__Group_4__0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getGroup_4()); 
                    // InternalKlangParser.g:951:3: ( rule__AtomicExpression__Group_4__0 )
                    // InternalKlangParser.g:951:4: rule__AtomicExpression__Group_4__0
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
    // InternalKlangParser.g:959:1: rule__AtomicExpression__Alternatives_0_1 : ( ( ( rule__AtomicExpression__ValueAssignment_0_1_0 ) ) | ( False ) );
    public final void rule__AtomicExpression__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:963:1: ( ( ( rule__AtomicExpression__ValueAssignment_0_1_0 ) ) | ( False ) )
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
                    // InternalKlangParser.g:964:2: ( ( rule__AtomicExpression__ValueAssignment_0_1_0 ) )
                    {
                    // InternalKlangParser.g:964:2: ( ( rule__AtomicExpression__ValueAssignment_0_1_0 ) )
                    // InternalKlangParser.g:965:3: ( rule__AtomicExpression__ValueAssignment_0_1_0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getValueAssignment_0_1_0()); 
                    // InternalKlangParser.g:966:3: ( rule__AtomicExpression__ValueAssignment_0_1_0 )
                    // InternalKlangParser.g:966:4: rule__AtomicExpression__ValueAssignment_0_1_0
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
                    // InternalKlangParser.g:970:2: ( False )
                    {
                    // InternalKlangParser.g:970:2: ( False )
                    // InternalKlangParser.g:971:3: False
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


    // $ANTLR start "rule__Program__Group__0"
    // InternalKlangParser.g:980:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:984:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalKlangParser.g:985:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalKlangParser.g:992:1: rule__Program__Group__0__Impl : ( ( rule__Program__SceneActorAssignment_0 )? ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:996:1: ( ( ( rule__Program__SceneActorAssignment_0 )? ) )
            // InternalKlangParser.g:997:1: ( ( rule__Program__SceneActorAssignment_0 )? )
            {
            // InternalKlangParser.g:997:1: ( ( rule__Program__SceneActorAssignment_0 )? )
            // InternalKlangParser.g:998:2: ( rule__Program__SceneActorAssignment_0 )?
            {
             before(grammarAccess.getProgramAccess().getSceneActorAssignment_0()); 
            // InternalKlangParser.g:999:2: ( rule__Program__SceneActorAssignment_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Scene) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalKlangParser.g:999:3: rule__Program__SceneActorAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Program__SceneActorAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProgramAccess().getSceneActorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalKlangParser.g:1007:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1011:1: ( rule__Program__Group__1__Impl )
            // InternalKlangParser.g:1012:2: rule__Program__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalKlangParser.g:1018:1: rule__Program__Group__1__Impl : ( ( rule__Program__SpriteActorsAssignment_1 )* ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1022:1: ( ( ( rule__Program__SpriteActorsAssignment_1 )* ) )
            // InternalKlangParser.g:1023:1: ( ( rule__Program__SpriteActorsAssignment_1 )* )
            {
            // InternalKlangParser.g:1023:1: ( ( rule__Program__SpriteActorsAssignment_1 )* )
            // InternalKlangParser.g:1024:2: ( rule__Program__SpriteActorsAssignment_1 )*
            {
             before(grammarAccess.getProgramAccess().getSpriteActorsAssignment_1()); 
            // InternalKlangParser.g:1025:2: ( rule__Program__SpriteActorsAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Sprite) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKlangParser.g:1025:3: rule__Program__SpriteActorsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Program__SpriteActorsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getSpriteActorsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__SceneActor__Group__0"
    // InternalKlangParser.g:1034:1: rule__SceneActor__Group__0 : rule__SceneActor__Group__0__Impl rule__SceneActor__Group__1 ;
    public final void rule__SceneActor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1038:1: ( rule__SceneActor__Group__0__Impl rule__SceneActor__Group__1 )
            // InternalKlangParser.g:1039:2: rule__SceneActor__Group__0__Impl rule__SceneActor__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalKlangParser.g:1046:1: rule__SceneActor__Group__0__Impl : ( () ) ;
    public final void rule__SceneActor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1050:1: ( ( () ) )
            // InternalKlangParser.g:1051:1: ( () )
            {
            // InternalKlangParser.g:1051:1: ( () )
            // InternalKlangParser.g:1052:2: ()
            {
             before(grammarAccess.getSceneActorAccess().getSceneActorAction_0()); 
            // InternalKlangParser.g:1053:2: ()
            // InternalKlangParser.g:1053:3: 
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
    // InternalKlangParser.g:1061:1: rule__SceneActor__Group__1 : rule__SceneActor__Group__1__Impl rule__SceneActor__Group__2 ;
    public final void rule__SceneActor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1065:1: ( rule__SceneActor__Group__1__Impl rule__SceneActor__Group__2 )
            // InternalKlangParser.g:1066:2: rule__SceneActor__Group__1__Impl rule__SceneActor__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalKlangParser.g:1073:1: rule__SceneActor__Group__1__Impl : ( Scene ) ;
    public final void rule__SceneActor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1077:1: ( ( Scene ) )
            // InternalKlangParser.g:1078:1: ( Scene )
            {
            // InternalKlangParser.g:1078:1: ( Scene )
            // InternalKlangParser.g:1079:2: Scene
            {
             before(grammarAccess.getSceneActorAccess().getSceneKeyword_1()); 
            match(input,Scene,FOLLOW_2); 
             after(grammarAccess.getSceneActorAccess().getSceneKeyword_1()); 

            }


            }

        }
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
    // InternalKlangParser.g:1088:1: rule__SceneActor__Group__2 : rule__SceneActor__Group__2__Impl rule__SceneActor__Group__3 ;
    public final void rule__SceneActor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1092:1: ( rule__SceneActor__Group__2__Impl rule__SceneActor__Group__3 )
            // InternalKlangParser.g:1093:2: rule__SceneActor__Group__2__Impl rule__SceneActor__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalKlangParser.g:1100:1: rule__SceneActor__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__SceneActor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1104:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:1105:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:1105:1: ( RULE_BEGIN )
            // InternalKlangParser.g:1106:2: RULE_BEGIN
            {
             before(grammarAccess.getSceneActorAccess().getBEGINTerminalRuleCall_2()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getSceneActorAccess().getBEGINTerminalRuleCall_2()); 

            }


            }

        }
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
    // InternalKlangParser.g:1115:1: rule__SceneActor__Group__3 : rule__SceneActor__Group__3__Impl rule__SceneActor__Group__4 ;
    public final void rule__SceneActor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1119:1: ( rule__SceneActor__Group__3__Impl rule__SceneActor__Group__4 )
            // InternalKlangParser.g:1120:2: rule__SceneActor__Group__3__Impl rule__SceneActor__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__SceneActor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SceneActor__Group__4();

            state._fsp--;


            }

        }
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
    // InternalKlangParser.g:1127:1: rule__SceneActor__Group__3__Impl : ( ( rule__SceneActor__LocalVariablesAssignment_3 )* ) ;
    public final void rule__SceneActor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1131:1: ( ( ( rule__SceneActor__LocalVariablesAssignment_3 )* ) )
            // InternalKlangParser.g:1132:1: ( ( rule__SceneActor__LocalVariablesAssignment_3 )* )
            {
            // InternalKlangParser.g:1132:1: ( ( rule__SceneActor__LocalVariablesAssignment_3 )* )
            // InternalKlangParser.g:1133:2: ( rule__SceneActor__LocalVariablesAssignment_3 )*
            {
             before(grammarAccess.getSceneActorAccess().getLocalVariablesAssignment_3()); 
            // InternalKlangParser.g:1134:2: ( rule__SceneActor__LocalVariablesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Var) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalKlangParser.g:1134:3: rule__SceneActor__LocalVariablesAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__SceneActor__LocalVariablesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSceneActorAccess().getLocalVariablesAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__SceneActor__Group__4"
    // InternalKlangParser.g:1142:1: rule__SceneActor__Group__4 : rule__SceneActor__Group__4__Impl rule__SceneActor__Group__5 ;
    public final void rule__SceneActor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1146:1: ( rule__SceneActor__Group__4__Impl rule__SceneActor__Group__5 )
            // InternalKlangParser.g:1147:2: rule__SceneActor__Group__4__Impl rule__SceneActor__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__SceneActor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SceneActor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneActor__Group__4"


    // $ANTLR start "rule__SceneActor__Group__4__Impl"
    // InternalKlangParser.g:1154:1: rule__SceneActor__Group__4__Impl : ( ( rule__SceneActor__EventHandlersAssignment_4 )* ) ;
    public final void rule__SceneActor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1158:1: ( ( ( rule__SceneActor__EventHandlersAssignment_4 )* ) )
            // InternalKlangParser.g:1159:1: ( ( rule__SceneActor__EventHandlersAssignment_4 )* )
            {
            // InternalKlangParser.g:1159:1: ( ( rule__SceneActor__EventHandlersAssignment_4 )* )
            // InternalKlangParser.g:1160:2: ( rule__SceneActor__EventHandlersAssignment_4 )*
            {
             before(grammarAccess.getSceneActorAccess().getEventHandlersAssignment_4()); 
            // InternalKlangParser.g:1161:2: ( rule__SceneActor__EventHandlersAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==When) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalKlangParser.g:1161:3: rule__SceneActor__EventHandlersAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SceneActor__EventHandlersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSceneActorAccess().getEventHandlersAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneActor__Group__4__Impl"


    // $ANTLR start "rule__SceneActor__Group__5"
    // InternalKlangParser.g:1169:1: rule__SceneActor__Group__5 : rule__SceneActor__Group__5__Impl ;
    public final void rule__SceneActor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1173:1: ( rule__SceneActor__Group__5__Impl )
            // InternalKlangParser.g:1174:2: rule__SceneActor__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SceneActor__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneActor__Group__5"


    // $ANTLR start "rule__SceneActor__Group__5__Impl"
    // InternalKlangParser.g:1180:1: rule__SceneActor__Group__5__Impl : ( RULE_END ) ;
    public final void rule__SceneActor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1184:1: ( ( RULE_END ) )
            // InternalKlangParser.g:1185:1: ( RULE_END )
            {
            // InternalKlangParser.g:1185:1: ( RULE_END )
            // InternalKlangParser.g:1186:2: RULE_END
            {
             before(grammarAccess.getSceneActorAccess().getENDTerminalRuleCall_5()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getSceneActorAccess().getENDTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneActor__Group__5__Impl"


    // $ANTLR start "rule__SpriteActor__Group__0"
    // InternalKlangParser.g:1196:1: rule__SpriteActor__Group__0 : rule__SpriteActor__Group__0__Impl rule__SpriteActor__Group__1 ;
    public final void rule__SpriteActor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1200:1: ( rule__SpriteActor__Group__0__Impl rule__SpriteActor__Group__1 )
            // InternalKlangParser.g:1201:2: rule__SpriteActor__Group__0__Impl rule__SpriteActor__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalKlangParser.g:1208:1: rule__SpriteActor__Group__0__Impl : ( () ) ;
    public final void rule__SpriteActor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1212:1: ( ( () ) )
            // InternalKlangParser.g:1213:1: ( () )
            {
            // InternalKlangParser.g:1213:1: ( () )
            // InternalKlangParser.g:1214:2: ()
            {
             before(grammarAccess.getSpriteActorAccess().getSpriteActorAction_0()); 
            // InternalKlangParser.g:1215:2: ()
            // InternalKlangParser.g:1215:3: 
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
    // InternalKlangParser.g:1223:1: rule__SpriteActor__Group__1 : rule__SpriteActor__Group__1__Impl rule__SpriteActor__Group__2 ;
    public final void rule__SpriteActor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1227:1: ( rule__SpriteActor__Group__1__Impl rule__SpriteActor__Group__2 )
            // InternalKlangParser.g:1228:2: rule__SpriteActor__Group__1__Impl rule__SpriteActor__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalKlangParser.g:1235:1: rule__SpriteActor__Group__1__Impl : ( Sprite ) ;
    public final void rule__SpriteActor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1239:1: ( ( Sprite ) )
            // InternalKlangParser.g:1240:1: ( Sprite )
            {
            // InternalKlangParser.g:1240:1: ( Sprite )
            // InternalKlangParser.g:1241:2: Sprite
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
    // InternalKlangParser.g:1250:1: rule__SpriteActor__Group__2 : rule__SpriteActor__Group__2__Impl rule__SpriteActor__Group__3 ;
    public final void rule__SpriteActor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1254:1: ( rule__SpriteActor__Group__2__Impl rule__SpriteActor__Group__3 )
            // InternalKlangParser.g:1255:2: rule__SpriteActor__Group__2__Impl rule__SpriteActor__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalKlangParser.g:1262:1: rule__SpriteActor__Group__2__Impl : ( ( rule__SpriteActor__NameAssignment_2 ) ) ;
    public final void rule__SpriteActor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1266:1: ( ( ( rule__SpriteActor__NameAssignment_2 ) ) )
            // InternalKlangParser.g:1267:1: ( ( rule__SpriteActor__NameAssignment_2 ) )
            {
            // InternalKlangParser.g:1267:1: ( ( rule__SpriteActor__NameAssignment_2 ) )
            // InternalKlangParser.g:1268:2: ( rule__SpriteActor__NameAssignment_2 )
            {
             before(grammarAccess.getSpriteActorAccess().getNameAssignment_2()); 
            // InternalKlangParser.g:1269:2: ( rule__SpriteActor__NameAssignment_2 )
            // InternalKlangParser.g:1269:3: rule__SpriteActor__NameAssignment_2
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
    // InternalKlangParser.g:1277:1: rule__SpriteActor__Group__3 : rule__SpriteActor__Group__3__Impl rule__SpriteActor__Group__4 ;
    public final void rule__SpriteActor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1281:1: ( rule__SpriteActor__Group__3__Impl rule__SpriteActor__Group__4 )
            // InternalKlangParser.g:1282:2: rule__SpriteActor__Group__3__Impl rule__SpriteActor__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalKlangParser.g:1289:1: rule__SpriteActor__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__SpriteActor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1293:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:1294:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:1294:1: ( RULE_BEGIN )
            // InternalKlangParser.g:1295:2: RULE_BEGIN
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
    // InternalKlangParser.g:1304:1: rule__SpriteActor__Group__4 : rule__SpriteActor__Group__4__Impl rule__SpriteActor__Group__5 ;
    public final void rule__SpriteActor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1308:1: ( rule__SpriteActor__Group__4__Impl rule__SpriteActor__Group__5 )
            // InternalKlangParser.g:1309:2: rule__SpriteActor__Group__4__Impl rule__SpriteActor__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalKlangParser.g:1316:1: rule__SpriteActor__Group__4__Impl : ( ( rule__SpriteActor__LocalVariablesAssignment_4 )* ) ;
    public final void rule__SpriteActor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1320:1: ( ( ( rule__SpriteActor__LocalVariablesAssignment_4 )* ) )
            // InternalKlangParser.g:1321:1: ( ( rule__SpriteActor__LocalVariablesAssignment_4 )* )
            {
            // InternalKlangParser.g:1321:1: ( ( rule__SpriteActor__LocalVariablesAssignment_4 )* )
            // InternalKlangParser.g:1322:2: ( rule__SpriteActor__LocalVariablesAssignment_4 )*
            {
             before(grammarAccess.getSpriteActorAccess().getLocalVariablesAssignment_4()); 
            // InternalKlangParser.g:1323:2: ( rule__SpriteActor__LocalVariablesAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==Var) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalKlangParser.g:1323:3: rule__SpriteActor__LocalVariablesAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__SpriteActor__LocalVariablesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalKlangParser.g:1331:1: rule__SpriteActor__Group__5 : rule__SpriteActor__Group__5__Impl rule__SpriteActor__Group__6 ;
    public final void rule__SpriteActor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1335:1: ( rule__SpriteActor__Group__5__Impl rule__SpriteActor__Group__6 )
            // InternalKlangParser.g:1336:2: rule__SpriteActor__Group__5__Impl rule__SpriteActor__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalKlangParser.g:1343:1: rule__SpriteActor__Group__5__Impl : ( ( rule__SpriteActor__EventHandlersAssignment_5 )* ) ;
    public final void rule__SpriteActor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1347:1: ( ( ( rule__SpriteActor__EventHandlersAssignment_5 )* ) )
            // InternalKlangParser.g:1348:1: ( ( rule__SpriteActor__EventHandlersAssignment_5 )* )
            {
            // InternalKlangParser.g:1348:1: ( ( rule__SpriteActor__EventHandlersAssignment_5 )* )
            // InternalKlangParser.g:1349:2: ( rule__SpriteActor__EventHandlersAssignment_5 )*
            {
             before(grammarAccess.getSpriteActorAccess().getEventHandlersAssignment_5()); 
            // InternalKlangParser.g:1350:2: ( rule__SpriteActor__EventHandlersAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==When) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalKlangParser.g:1350:3: rule__SpriteActor__EventHandlersAssignment_5
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SpriteActor__EventHandlersAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalKlangParser.g:1358:1: rule__SpriteActor__Group__6 : rule__SpriteActor__Group__6__Impl ;
    public final void rule__SpriteActor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1362:1: ( rule__SpriteActor__Group__6__Impl )
            // InternalKlangParser.g:1363:2: rule__SpriteActor__Group__6__Impl
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
    // InternalKlangParser.g:1369:1: rule__SpriteActor__Group__6__Impl : ( RULE_END ) ;
    public final void rule__SpriteActor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1373:1: ( ( RULE_END ) )
            // InternalKlangParser.g:1374:1: ( RULE_END )
            {
            // InternalKlangParser.g:1374:1: ( RULE_END )
            // InternalKlangParser.g:1375:2: RULE_END
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
    // InternalKlangParser.g:1385:1: rule__GameStart__Group__0 : rule__GameStart__Group__0__Impl rule__GameStart__Group__1 ;
    public final void rule__GameStart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1389:1: ( rule__GameStart__Group__0__Impl rule__GameStart__Group__1 )
            // InternalKlangParser.g:1390:2: rule__GameStart__Group__0__Impl rule__GameStart__Group__1
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
    // InternalKlangParser.g:1397:1: rule__GameStart__Group__0__Impl : ( () ) ;
    public final void rule__GameStart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1401:1: ( ( () ) )
            // InternalKlangParser.g:1402:1: ( () )
            {
            // InternalKlangParser.g:1402:1: ( () )
            // InternalKlangParser.g:1403:2: ()
            {
             before(grammarAccess.getGameStartAccess().getGameStartAction_0()); 
            // InternalKlangParser.g:1404:2: ()
            // InternalKlangParser.g:1404:3: 
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
    // InternalKlangParser.g:1412:1: rule__GameStart__Group__1 : rule__GameStart__Group__1__Impl rule__GameStart__Group__2 ;
    public final void rule__GameStart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1416:1: ( rule__GameStart__Group__1__Impl rule__GameStart__Group__2 )
            // InternalKlangParser.g:1417:2: rule__GameStart__Group__1__Impl rule__GameStart__Group__2
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
    // InternalKlangParser.g:1424:1: rule__GameStart__Group__1__Impl : ( When ) ;
    public final void rule__GameStart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1428:1: ( ( When ) )
            // InternalKlangParser.g:1429:1: ( When )
            {
            // InternalKlangParser.g:1429:1: ( When )
            // InternalKlangParser.g:1430:2: When
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
    // InternalKlangParser.g:1439:1: rule__GameStart__Group__2 : rule__GameStart__Group__2__Impl rule__GameStart__Group__3 ;
    public final void rule__GameStart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1443:1: ( rule__GameStart__Group__2__Impl rule__GameStart__Group__3 )
            // InternalKlangParser.g:1444:2: rule__GameStart__Group__2__Impl rule__GameStart__Group__3
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
    // InternalKlangParser.g:1451:1: rule__GameStart__Group__2__Impl : ( Game ) ;
    public final void rule__GameStart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1455:1: ( ( Game ) )
            // InternalKlangParser.g:1456:1: ( Game )
            {
            // InternalKlangParser.g:1456:1: ( Game )
            // InternalKlangParser.g:1457:2: Game
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
    // InternalKlangParser.g:1466:1: rule__GameStart__Group__3 : rule__GameStart__Group__3__Impl rule__GameStart__Group__4 ;
    public final void rule__GameStart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1470:1: ( rule__GameStart__Group__3__Impl rule__GameStart__Group__4 )
            // InternalKlangParser.g:1471:2: rule__GameStart__Group__3__Impl rule__GameStart__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalKlangParser.g:1478:1: rule__GameStart__Group__3__Impl : ( Starts ) ;
    public final void rule__GameStart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1482:1: ( ( Starts ) )
            // InternalKlangParser.g:1483:1: ( Starts )
            {
            // InternalKlangParser.g:1483:1: ( Starts )
            // InternalKlangParser.g:1484:2: Starts
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
    // InternalKlangParser.g:1493:1: rule__GameStart__Group__4 : rule__GameStart__Group__4__Impl rule__GameStart__Group__5 ;
    public final void rule__GameStart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1497:1: ( rule__GameStart__Group__4__Impl rule__GameStart__Group__5 )
            // InternalKlangParser.g:1498:2: rule__GameStart__Group__4__Impl rule__GameStart__Group__5
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
    // InternalKlangParser.g:1505:1: rule__GameStart__Group__4__Impl : ( RULE_BEGIN ) ;
    public final void rule__GameStart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1509:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:1510:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:1510:1: ( RULE_BEGIN )
            // InternalKlangParser.g:1511:2: RULE_BEGIN
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
    // InternalKlangParser.g:1520:1: rule__GameStart__Group__5 : rule__GameStart__Group__5__Impl rule__GameStart__Group__6 ;
    public final void rule__GameStart__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1524:1: ( rule__GameStart__Group__5__Impl rule__GameStart__Group__6 )
            // InternalKlangParser.g:1525:2: rule__GameStart__Group__5__Impl rule__GameStart__Group__6
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
    // InternalKlangParser.g:1532:1: rule__GameStart__Group__5__Impl : ( ( rule__GameStart__StatementsAssignment_5 )* ) ;
    public final void rule__GameStart__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1536:1: ( ( ( rule__GameStart__StatementsAssignment_5 )* ) )
            // InternalKlangParser.g:1537:1: ( ( rule__GameStart__StatementsAssignment_5 )* )
            {
            // InternalKlangParser.g:1537:1: ( ( rule__GameStart__StatementsAssignment_5 )* )
            // InternalKlangParser.g:1538:2: ( rule__GameStart__StatementsAssignment_5 )*
            {
             before(grammarAccess.getGameStartAccess().getStatementsAssignment_5()); 
            // InternalKlangParser.g:1539:2: ( rule__GameStart__StatementsAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Forever||(LA13_0>=Sleep && LA13_0<=While)||LA13_0==If||LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalKlangParser.g:1539:3: rule__GameStart__StatementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__GameStart__StatementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalKlangParser.g:1547:1: rule__GameStart__Group__6 : rule__GameStart__Group__6__Impl ;
    public final void rule__GameStart__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1551:1: ( rule__GameStart__Group__6__Impl )
            // InternalKlangParser.g:1552:2: rule__GameStart__Group__6__Impl
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
    // InternalKlangParser.g:1558:1: rule__GameStart__Group__6__Impl : ( RULE_END ) ;
    public final void rule__GameStart__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1562:1: ( ( RULE_END ) )
            // InternalKlangParser.g:1563:1: ( RULE_END )
            {
            // InternalKlangParser.g:1563:1: ( RULE_END )
            // InternalKlangParser.g:1564:2: RULE_END
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
    // InternalKlangParser.g:1574:1: rule__SpriteClicked__Group__0 : rule__SpriteClicked__Group__0__Impl rule__SpriteClicked__Group__1 ;
    public final void rule__SpriteClicked__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1578:1: ( rule__SpriteClicked__Group__0__Impl rule__SpriteClicked__Group__1 )
            // InternalKlangParser.g:1579:2: rule__SpriteClicked__Group__0__Impl rule__SpriteClicked__Group__1
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
    // InternalKlangParser.g:1586:1: rule__SpriteClicked__Group__0__Impl : ( () ) ;
    public final void rule__SpriteClicked__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1590:1: ( ( () ) )
            // InternalKlangParser.g:1591:1: ( () )
            {
            // InternalKlangParser.g:1591:1: ( () )
            // InternalKlangParser.g:1592:2: ()
            {
             before(grammarAccess.getSpriteClickedAccess().getSpriteClickedAction_0()); 
            // InternalKlangParser.g:1593:2: ()
            // InternalKlangParser.g:1593:3: 
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
    // InternalKlangParser.g:1601:1: rule__SpriteClicked__Group__1 : rule__SpriteClicked__Group__1__Impl rule__SpriteClicked__Group__2 ;
    public final void rule__SpriteClicked__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1605:1: ( rule__SpriteClicked__Group__1__Impl rule__SpriteClicked__Group__2 )
            // InternalKlangParser.g:1606:2: rule__SpriteClicked__Group__1__Impl rule__SpriteClicked__Group__2
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
    // InternalKlangParser.g:1613:1: rule__SpriteClicked__Group__1__Impl : ( When ) ;
    public final void rule__SpriteClicked__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1617:1: ( ( When ) )
            // InternalKlangParser.g:1618:1: ( When )
            {
            // InternalKlangParser.g:1618:1: ( When )
            // InternalKlangParser.g:1619:2: When
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
    // InternalKlangParser.g:1628:1: rule__SpriteClicked__Group__2 : rule__SpriteClicked__Group__2__Impl rule__SpriteClicked__Group__3 ;
    public final void rule__SpriteClicked__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1632:1: ( rule__SpriteClicked__Group__2__Impl rule__SpriteClicked__Group__3 )
            // InternalKlangParser.g:1633:2: rule__SpriteClicked__Group__2__Impl rule__SpriteClicked__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalKlangParser.g:1640:1: rule__SpriteClicked__Group__2__Impl : ( Clicked ) ;
    public final void rule__SpriteClicked__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1644:1: ( ( Clicked ) )
            // InternalKlangParser.g:1645:1: ( Clicked )
            {
            // InternalKlangParser.g:1645:1: ( Clicked )
            // InternalKlangParser.g:1646:2: Clicked
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
    // InternalKlangParser.g:1655:1: rule__SpriteClicked__Group__3 : rule__SpriteClicked__Group__3__Impl rule__SpriteClicked__Group__4 ;
    public final void rule__SpriteClicked__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1659:1: ( rule__SpriteClicked__Group__3__Impl rule__SpriteClicked__Group__4 )
            // InternalKlangParser.g:1660:2: rule__SpriteClicked__Group__3__Impl rule__SpriteClicked__Group__4
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
    // InternalKlangParser.g:1667:1: rule__SpriteClicked__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__SpriteClicked__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1671:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:1672:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:1672:1: ( RULE_BEGIN )
            // InternalKlangParser.g:1673:2: RULE_BEGIN
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
    // InternalKlangParser.g:1682:1: rule__SpriteClicked__Group__4 : rule__SpriteClicked__Group__4__Impl rule__SpriteClicked__Group__5 ;
    public final void rule__SpriteClicked__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1686:1: ( rule__SpriteClicked__Group__4__Impl rule__SpriteClicked__Group__5 )
            // InternalKlangParser.g:1687:2: rule__SpriteClicked__Group__4__Impl rule__SpriteClicked__Group__5
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
    // InternalKlangParser.g:1694:1: rule__SpriteClicked__Group__4__Impl : ( ( rule__SpriteClicked__StatementsAssignment_4 )* ) ;
    public final void rule__SpriteClicked__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1698:1: ( ( ( rule__SpriteClicked__StatementsAssignment_4 )* ) )
            // InternalKlangParser.g:1699:1: ( ( rule__SpriteClicked__StatementsAssignment_4 )* )
            {
            // InternalKlangParser.g:1699:1: ( ( rule__SpriteClicked__StatementsAssignment_4 )* )
            // InternalKlangParser.g:1700:2: ( rule__SpriteClicked__StatementsAssignment_4 )*
            {
             before(grammarAccess.getSpriteClickedAccess().getStatementsAssignment_4()); 
            // InternalKlangParser.g:1701:2: ( rule__SpriteClicked__StatementsAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Forever||(LA14_0>=Sleep && LA14_0<=While)||LA14_0==If||LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalKlangParser.g:1701:3: rule__SpriteClicked__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__SpriteClicked__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalKlangParser.g:1709:1: rule__SpriteClicked__Group__5 : rule__SpriteClicked__Group__5__Impl ;
    public final void rule__SpriteClicked__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1713:1: ( rule__SpriteClicked__Group__5__Impl )
            // InternalKlangParser.g:1714:2: rule__SpriteClicked__Group__5__Impl
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
    // InternalKlangParser.g:1720:1: rule__SpriteClicked__Group__5__Impl : ( RULE_END ) ;
    public final void rule__SpriteClicked__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1724:1: ( ( RULE_END ) )
            // InternalKlangParser.g:1725:1: ( RULE_END )
            {
            // InternalKlangParser.g:1725:1: ( RULE_END )
            // InternalKlangParser.g:1726:2: RULE_END
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
    // InternalKlangParser.g:1736:1: rule__KeyPressed__Group__0 : rule__KeyPressed__Group__0__Impl rule__KeyPressed__Group__1 ;
    public final void rule__KeyPressed__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1740:1: ( rule__KeyPressed__Group__0__Impl rule__KeyPressed__Group__1 )
            // InternalKlangParser.g:1741:2: rule__KeyPressed__Group__0__Impl rule__KeyPressed__Group__1
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
    // InternalKlangParser.g:1748:1: rule__KeyPressed__Group__0__Impl : ( () ) ;
    public final void rule__KeyPressed__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1752:1: ( ( () ) )
            // InternalKlangParser.g:1753:1: ( () )
            {
            // InternalKlangParser.g:1753:1: ( () )
            // InternalKlangParser.g:1754:2: ()
            {
             before(grammarAccess.getKeyPressedAccess().getKeyPressedAction_0()); 
            // InternalKlangParser.g:1755:2: ()
            // InternalKlangParser.g:1755:3: 
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
    // InternalKlangParser.g:1763:1: rule__KeyPressed__Group__1 : rule__KeyPressed__Group__1__Impl rule__KeyPressed__Group__2 ;
    public final void rule__KeyPressed__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1767:1: ( rule__KeyPressed__Group__1__Impl rule__KeyPressed__Group__2 )
            // InternalKlangParser.g:1768:2: rule__KeyPressed__Group__1__Impl rule__KeyPressed__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalKlangParser.g:1775:1: rule__KeyPressed__Group__1__Impl : ( When ) ;
    public final void rule__KeyPressed__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1779:1: ( ( When ) )
            // InternalKlangParser.g:1780:1: ( When )
            {
            // InternalKlangParser.g:1780:1: ( When )
            // InternalKlangParser.g:1781:2: When
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
    // InternalKlangParser.g:1790:1: rule__KeyPressed__Group__2 : rule__KeyPressed__Group__2__Impl rule__KeyPressed__Group__3 ;
    public final void rule__KeyPressed__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1794:1: ( rule__KeyPressed__Group__2__Impl rule__KeyPressed__Group__3 )
            // InternalKlangParser.g:1795:2: rule__KeyPressed__Group__2__Impl rule__KeyPressed__Group__3
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
    // InternalKlangParser.g:1802:1: rule__KeyPressed__Group__2__Impl : ( ( rule__KeyPressed__KeyAssignment_2 ) ) ;
    public final void rule__KeyPressed__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1806:1: ( ( ( rule__KeyPressed__KeyAssignment_2 ) ) )
            // InternalKlangParser.g:1807:1: ( ( rule__KeyPressed__KeyAssignment_2 ) )
            {
            // InternalKlangParser.g:1807:1: ( ( rule__KeyPressed__KeyAssignment_2 ) )
            // InternalKlangParser.g:1808:2: ( rule__KeyPressed__KeyAssignment_2 )
            {
             before(grammarAccess.getKeyPressedAccess().getKeyAssignment_2()); 
            // InternalKlangParser.g:1809:2: ( rule__KeyPressed__KeyAssignment_2 )
            // InternalKlangParser.g:1809:3: rule__KeyPressed__KeyAssignment_2
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
    // InternalKlangParser.g:1817:1: rule__KeyPressed__Group__3 : rule__KeyPressed__Group__3__Impl rule__KeyPressed__Group__4 ;
    public final void rule__KeyPressed__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1821:1: ( rule__KeyPressed__Group__3__Impl rule__KeyPressed__Group__4 )
            // InternalKlangParser.g:1822:2: rule__KeyPressed__Group__3__Impl rule__KeyPressed__Group__4
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
    // InternalKlangParser.g:1829:1: rule__KeyPressed__Group__3__Impl : ( Key ) ;
    public final void rule__KeyPressed__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1833:1: ( ( Key ) )
            // InternalKlangParser.g:1834:1: ( Key )
            {
            // InternalKlangParser.g:1834:1: ( Key )
            // InternalKlangParser.g:1835:2: Key
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
    // InternalKlangParser.g:1844:1: rule__KeyPressed__Group__4 : rule__KeyPressed__Group__4__Impl rule__KeyPressed__Group__5 ;
    public final void rule__KeyPressed__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1848:1: ( rule__KeyPressed__Group__4__Impl rule__KeyPressed__Group__5 )
            // InternalKlangParser.g:1849:2: rule__KeyPressed__Group__4__Impl rule__KeyPressed__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalKlangParser.g:1856:1: rule__KeyPressed__Group__4__Impl : ( Pressed ) ;
    public final void rule__KeyPressed__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1860:1: ( ( Pressed ) )
            // InternalKlangParser.g:1861:1: ( Pressed )
            {
            // InternalKlangParser.g:1861:1: ( Pressed )
            // InternalKlangParser.g:1862:2: Pressed
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
    // InternalKlangParser.g:1871:1: rule__KeyPressed__Group__5 : rule__KeyPressed__Group__5__Impl rule__KeyPressed__Group__6 ;
    public final void rule__KeyPressed__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1875:1: ( rule__KeyPressed__Group__5__Impl rule__KeyPressed__Group__6 )
            // InternalKlangParser.g:1876:2: rule__KeyPressed__Group__5__Impl rule__KeyPressed__Group__6
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
    // InternalKlangParser.g:1883:1: rule__KeyPressed__Group__5__Impl : ( RULE_BEGIN ) ;
    public final void rule__KeyPressed__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1887:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:1888:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:1888:1: ( RULE_BEGIN )
            // InternalKlangParser.g:1889:2: RULE_BEGIN
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
    // InternalKlangParser.g:1898:1: rule__KeyPressed__Group__6 : rule__KeyPressed__Group__6__Impl rule__KeyPressed__Group__7 ;
    public final void rule__KeyPressed__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1902:1: ( rule__KeyPressed__Group__6__Impl rule__KeyPressed__Group__7 )
            // InternalKlangParser.g:1903:2: rule__KeyPressed__Group__6__Impl rule__KeyPressed__Group__7
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
    // InternalKlangParser.g:1910:1: rule__KeyPressed__Group__6__Impl : ( ( rule__KeyPressed__StatementsAssignment_6 )* ) ;
    public final void rule__KeyPressed__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1914:1: ( ( ( rule__KeyPressed__StatementsAssignment_6 )* ) )
            // InternalKlangParser.g:1915:1: ( ( rule__KeyPressed__StatementsAssignment_6 )* )
            {
            // InternalKlangParser.g:1915:1: ( ( rule__KeyPressed__StatementsAssignment_6 )* )
            // InternalKlangParser.g:1916:2: ( rule__KeyPressed__StatementsAssignment_6 )*
            {
             before(grammarAccess.getKeyPressedAccess().getStatementsAssignment_6()); 
            // InternalKlangParser.g:1917:2: ( rule__KeyPressed__StatementsAssignment_6 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Forever||(LA15_0>=Sleep && LA15_0<=While)||LA15_0==If||LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalKlangParser.g:1917:3: rule__KeyPressed__StatementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__KeyPressed__StatementsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalKlangParser.g:1925:1: rule__KeyPressed__Group__7 : rule__KeyPressed__Group__7__Impl ;
    public final void rule__KeyPressed__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1929:1: ( rule__KeyPressed__Group__7__Impl )
            // InternalKlangParser.g:1930:2: rule__KeyPressed__Group__7__Impl
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
    // InternalKlangParser.g:1936:1: rule__KeyPressed__Group__7__Impl : ( RULE_END ) ;
    public final void rule__KeyPressed__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1940:1: ( ( RULE_END ) )
            // InternalKlangParser.g:1941:1: ( RULE_END )
            {
            // InternalKlangParser.g:1941:1: ( RULE_END )
            // InternalKlangParser.g:1942:2: RULE_END
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
    // InternalKlangParser.g:1952:1: rule__CollidesWith__Group__0 : rule__CollidesWith__Group__0__Impl rule__CollidesWith__Group__1 ;
    public final void rule__CollidesWith__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1956:1: ( rule__CollidesWith__Group__0__Impl rule__CollidesWith__Group__1 )
            // InternalKlangParser.g:1957:2: rule__CollidesWith__Group__0__Impl rule__CollidesWith__Group__1
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
    // InternalKlangParser.g:1964:1: rule__CollidesWith__Group__0__Impl : ( () ) ;
    public final void rule__CollidesWith__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1968:1: ( ( () ) )
            // InternalKlangParser.g:1969:1: ( () )
            {
            // InternalKlangParser.g:1969:1: ( () )
            // InternalKlangParser.g:1970:2: ()
            {
             before(grammarAccess.getCollidesWithAccess().getCollidesWithAction_0()); 
            // InternalKlangParser.g:1971:2: ()
            // InternalKlangParser.g:1971:3: 
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
    // InternalKlangParser.g:1979:1: rule__CollidesWith__Group__1 : rule__CollidesWith__Group__1__Impl rule__CollidesWith__Group__2 ;
    public final void rule__CollidesWith__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1983:1: ( rule__CollidesWith__Group__1__Impl rule__CollidesWith__Group__2 )
            // InternalKlangParser.g:1984:2: rule__CollidesWith__Group__1__Impl rule__CollidesWith__Group__2
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
    // InternalKlangParser.g:1991:1: rule__CollidesWith__Group__1__Impl : ( When ) ;
    public final void rule__CollidesWith__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1995:1: ( ( When ) )
            // InternalKlangParser.g:1996:1: ( When )
            {
            // InternalKlangParser.g:1996:1: ( When )
            // InternalKlangParser.g:1997:2: When
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
    // InternalKlangParser.g:2006:1: rule__CollidesWith__Group__2 : rule__CollidesWith__Group__2__Impl rule__CollidesWith__Group__3 ;
    public final void rule__CollidesWith__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2010:1: ( rule__CollidesWith__Group__2__Impl rule__CollidesWith__Group__3 )
            // InternalKlangParser.g:2011:2: rule__CollidesWith__Group__2__Impl rule__CollidesWith__Group__3
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
    // InternalKlangParser.g:2018:1: rule__CollidesWith__Group__2__Impl : ( Collides ) ;
    public final void rule__CollidesWith__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2022:1: ( ( Collides ) )
            // InternalKlangParser.g:2023:1: ( Collides )
            {
            // InternalKlangParser.g:2023:1: ( Collides )
            // InternalKlangParser.g:2024:2: Collides
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
    // InternalKlangParser.g:2033:1: rule__CollidesWith__Group__3 : rule__CollidesWith__Group__3__Impl rule__CollidesWith__Group__4 ;
    public final void rule__CollidesWith__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2037:1: ( rule__CollidesWith__Group__3__Impl rule__CollidesWith__Group__4 )
            // InternalKlangParser.g:2038:2: rule__CollidesWith__Group__3__Impl rule__CollidesWith__Group__4
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
    // InternalKlangParser.g:2045:1: rule__CollidesWith__Group__3__Impl : ( With ) ;
    public final void rule__CollidesWith__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2049:1: ( ( With ) )
            // InternalKlangParser.g:2050:1: ( With )
            {
            // InternalKlangParser.g:2050:1: ( With )
            // InternalKlangParser.g:2051:2: With
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
    // InternalKlangParser.g:2060:1: rule__CollidesWith__Group__4 : rule__CollidesWith__Group__4__Impl rule__CollidesWith__Group__5 ;
    public final void rule__CollidesWith__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2064:1: ( rule__CollidesWith__Group__4__Impl rule__CollidesWith__Group__5 )
            // InternalKlangParser.g:2065:2: rule__CollidesWith__Group__4__Impl rule__CollidesWith__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalKlangParser.g:2072:1: rule__CollidesWith__Group__4__Impl : ( ( rule__CollidesWith__TargetAssignment_4 ) ) ;
    public final void rule__CollidesWith__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2076:1: ( ( ( rule__CollidesWith__TargetAssignment_4 ) ) )
            // InternalKlangParser.g:2077:1: ( ( rule__CollidesWith__TargetAssignment_4 ) )
            {
            // InternalKlangParser.g:2077:1: ( ( rule__CollidesWith__TargetAssignment_4 ) )
            // InternalKlangParser.g:2078:2: ( rule__CollidesWith__TargetAssignment_4 )
            {
             before(grammarAccess.getCollidesWithAccess().getTargetAssignment_4()); 
            // InternalKlangParser.g:2079:2: ( rule__CollidesWith__TargetAssignment_4 )
            // InternalKlangParser.g:2079:3: rule__CollidesWith__TargetAssignment_4
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
    // InternalKlangParser.g:2087:1: rule__CollidesWith__Group__5 : rule__CollidesWith__Group__5__Impl rule__CollidesWith__Group__6 ;
    public final void rule__CollidesWith__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2091:1: ( rule__CollidesWith__Group__5__Impl rule__CollidesWith__Group__6 )
            // InternalKlangParser.g:2092:2: rule__CollidesWith__Group__5__Impl rule__CollidesWith__Group__6
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
    // InternalKlangParser.g:2099:1: rule__CollidesWith__Group__5__Impl : ( RULE_BEGIN ) ;
    public final void rule__CollidesWith__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2103:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:2104:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:2104:1: ( RULE_BEGIN )
            // InternalKlangParser.g:2105:2: RULE_BEGIN
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
    // InternalKlangParser.g:2114:1: rule__CollidesWith__Group__6 : rule__CollidesWith__Group__6__Impl rule__CollidesWith__Group__7 ;
    public final void rule__CollidesWith__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2118:1: ( rule__CollidesWith__Group__6__Impl rule__CollidesWith__Group__7 )
            // InternalKlangParser.g:2119:2: rule__CollidesWith__Group__6__Impl rule__CollidesWith__Group__7
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
    // InternalKlangParser.g:2126:1: rule__CollidesWith__Group__6__Impl : ( ( rule__CollidesWith__StatementsAssignment_6 )* ) ;
    public final void rule__CollidesWith__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2130:1: ( ( ( rule__CollidesWith__StatementsAssignment_6 )* ) )
            // InternalKlangParser.g:2131:1: ( ( rule__CollidesWith__StatementsAssignment_6 )* )
            {
            // InternalKlangParser.g:2131:1: ( ( rule__CollidesWith__StatementsAssignment_6 )* )
            // InternalKlangParser.g:2132:2: ( rule__CollidesWith__StatementsAssignment_6 )*
            {
             before(grammarAccess.getCollidesWithAccess().getStatementsAssignment_6()); 
            // InternalKlangParser.g:2133:2: ( rule__CollidesWith__StatementsAssignment_6 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==Forever||(LA16_0>=Sleep && LA16_0<=While)||LA16_0==If||LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalKlangParser.g:2133:3: rule__CollidesWith__StatementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__CollidesWith__StatementsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalKlangParser.g:2141:1: rule__CollidesWith__Group__7 : rule__CollidesWith__Group__7__Impl ;
    public final void rule__CollidesWith__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2145:1: ( rule__CollidesWith__Group__7__Impl )
            // InternalKlangParser.g:2146:2: rule__CollidesWith__Group__7__Impl
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
    // InternalKlangParser.g:2152:1: rule__CollidesWith__Group__7__Impl : ( RULE_END ) ;
    public final void rule__CollidesWith__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2156:1: ( ( RULE_END ) )
            // InternalKlangParser.g:2157:1: ( RULE_END )
            {
            // InternalKlangParser.g:2157:1: ( RULE_END )
            // InternalKlangParser.g:2158:2: RULE_END
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
    // InternalKlangParser.g:2168:1: rule__WhileLoop__Group__0 : rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 ;
    public final void rule__WhileLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2172:1: ( rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 )
            // InternalKlangParser.g:2173:2: rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1
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
    // InternalKlangParser.g:2180:1: rule__WhileLoop__Group__0__Impl : ( () ) ;
    public final void rule__WhileLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2184:1: ( ( () ) )
            // InternalKlangParser.g:2185:1: ( () )
            {
            // InternalKlangParser.g:2185:1: ( () )
            // InternalKlangParser.g:2186:2: ()
            {
             before(grammarAccess.getWhileLoopAccess().getWhileLoopAction_0()); 
            // InternalKlangParser.g:2187:2: ()
            // InternalKlangParser.g:2187:3: 
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
    // InternalKlangParser.g:2195:1: rule__WhileLoop__Group__1 : rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 ;
    public final void rule__WhileLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2199:1: ( rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 )
            // InternalKlangParser.g:2200:2: rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2
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
    // InternalKlangParser.g:2207:1: rule__WhileLoop__Group__1__Impl : ( While ) ;
    public final void rule__WhileLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2211:1: ( ( While ) )
            // InternalKlangParser.g:2212:1: ( While )
            {
            // InternalKlangParser.g:2212:1: ( While )
            // InternalKlangParser.g:2213:2: While
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
    // InternalKlangParser.g:2222:1: rule__WhileLoop__Group__2 : rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 ;
    public final void rule__WhileLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2226:1: ( rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 )
            // InternalKlangParser.g:2227:2: rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalKlangParser.g:2234:1: rule__WhileLoop__Group__2__Impl : ( ( rule__WhileLoop__PredicateAssignment_2 ) ) ;
    public final void rule__WhileLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2238:1: ( ( ( rule__WhileLoop__PredicateAssignment_2 ) ) )
            // InternalKlangParser.g:2239:1: ( ( rule__WhileLoop__PredicateAssignment_2 ) )
            {
            // InternalKlangParser.g:2239:1: ( ( rule__WhileLoop__PredicateAssignment_2 ) )
            // InternalKlangParser.g:2240:2: ( rule__WhileLoop__PredicateAssignment_2 )
            {
             before(grammarAccess.getWhileLoopAccess().getPredicateAssignment_2()); 
            // InternalKlangParser.g:2241:2: ( rule__WhileLoop__PredicateAssignment_2 )
            // InternalKlangParser.g:2241:3: rule__WhileLoop__PredicateAssignment_2
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
    // InternalKlangParser.g:2249:1: rule__WhileLoop__Group__3 : rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 ;
    public final void rule__WhileLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2253:1: ( rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 )
            // InternalKlangParser.g:2254:2: rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4
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
    // InternalKlangParser.g:2261:1: rule__WhileLoop__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__WhileLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2265:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:2266:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:2266:1: ( RULE_BEGIN )
            // InternalKlangParser.g:2267:2: RULE_BEGIN
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
    // InternalKlangParser.g:2276:1: rule__WhileLoop__Group__4 : rule__WhileLoop__Group__4__Impl rule__WhileLoop__Group__5 ;
    public final void rule__WhileLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2280:1: ( rule__WhileLoop__Group__4__Impl rule__WhileLoop__Group__5 )
            // InternalKlangParser.g:2281:2: rule__WhileLoop__Group__4__Impl rule__WhileLoop__Group__5
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
    // InternalKlangParser.g:2288:1: rule__WhileLoop__Group__4__Impl : ( ( rule__WhileLoop__LoopBlockAssignment_4 )* ) ;
    public final void rule__WhileLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2292:1: ( ( ( rule__WhileLoop__LoopBlockAssignment_4 )* ) )
            // InternalKlangParser.g:2293:1: ( ( rule__WhileLoop__LoopBlockAssignment_4 )* )
            {
            // InternalKlangParser.g:2293:1: ( ( rule__WhileLoop__LoopBlockAssignment_4 )* )
            // InternalKlangParser.g:2294:2: ( rule__WhileLoop__LoopBlockAssignment_4 )*
            {
             before(grammarAccess.getWhileLoopAccess().getLoopBlockAssignment_4()); 
            // InternalKlangParser.g:2295:2: ( rule__WhileLoop__LoopBlockAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Forever||(LA17_0>=Sleep && LA17_0<=While)||LA17_0==If||LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalKlangParser.g:2295:3: rule__WhileLoop__LoopBlockAssignment_4
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__WhileLoop__LoopBlockAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalKlangParser.g:2303:1: rule__WhileLoop__Group__5 : rule__WhileLoop__Group__5__Impl ;
    public final void rule__WhileLoop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2307:1: ( rule__WhileLoop__Group__5__Impl )
            // InternalKlangParser.g:2308:2: rule__WhileLoop__Group__5__Impl
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
    // InternalKlangParser.g:2314:1: rule__WhileLoop__Group__5__Impl : ( RULE_END ) ;
    public final void rule__WhileLoop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2318:1: ( ( RULE_END ) )
            // InternalKlangParser.g:2319:1: ( RULE_END )
            {
            // InternalKlangParser.g:2319:1: ( RULE_END )
            // InternalKlangParser.g:2320:2: RULE_END
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
    // InternalKlangParser.g:2330:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2334:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalKlangParser.g:2335:2: rule__If__Group__0__Impl rule__If__Group__1
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
    // InternalKlangParser.g:2342:1: rule__If__Group__0__Impl : ( () ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2346:1: ( ( () ) )
            // InternalKlangParser.g:2347:1: ( () )
            {
            // InternalKlangParser.g:2347:1: ( () )
            // InternalKlangParser.g:2348:2: ()
            {
             before(grammarAccess.getIfAccess().getIfAction_0()); 
            // InternalKlangParser.g:2349:2: ()
            // InternalKlangParser.g:2349:3: 
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
    // InternalKlangParser.g:2357:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2361:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalKlangParser.g:2362:2: rule__If__Group__1__Impl rule__If__Group__2
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
    // InternalKlangParser.g:2369:1: rule__If__Group__1__Impl : ( If ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2373:1: ( ( If ) )
            // InternalKlangParser.g:2374:1: ( If )
            {
            // InternalKlangParser.g:2374:1: ( If )
            // InternalKlangParser.g:2375:2: If
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
    // InternalKlangParser.g:2384:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2388:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // InternalKlangParser.g:2389:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalKlangParser.g:2396:1: rule__If__Group__2__Impl : ( ( rule__If__PredicateAssignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2400:1: ( ( ( rule__If__PredicateAssignment_2 ) ) )
            // InternalKlangParser.g:2401:1: ( ( rule__If__PredicateAssignment_2 ) )
            {
            // InternalKlangParser.g:2401:1: ( ( rule__If__PredicateAssignment_2 ) )
            // InternalKlangParser.g:2402:2: ( rule__If__PredicateAssignment_2 )
            {
             before(grammarAccess.getIfAccess().getPredicateAssignment_2()); 
            // InternalKlangParser.g:2403:2: ( rule__If__PredicateAssignment_2 )
            // InternalKlangParser.g:2403:3: rule__If__PredicateAssignment_2
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
    // InternalKlangParser.g:2411:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2415:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // InternalKlangParser.g:2416:2: rule__If__Group__3__Impl rule__If__Group__4
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
    // InternalKlangParser.g:2423:1: rule__If__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2427:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:2428:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:2428:1: ( RULE_BEGIN )
            // InternalKlangParser.g:2429:2: RULE_BEGIN
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
    // InternalKlangParser.g:2438:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2442:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // InternalKlangParser.g:2443:2: rule__If__Group__4__Impl rule__If__Group__5
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
    // InternalKlangParser.g:2450:1: rule__If__Group__4__Impl : ( ( rule__If__IfBlockAssignment_4 )* ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2454:1: ( ( ( rule__If__IfBlockAssignment_4 )* ) )
            // InternalKlangParser.g:2455:1: ( ( rule__If__IfBlockAssignment_4 )* )
            {
            // InternalKlangParser.g:2455:1: ( ( rule__If__IfBlockAssignment_4 )* )
            // InternalKlangParser.g:2456:2: ( rule__If__IfBlockAssignment_4 )*
            {
             before(grammarAccess.getIfAccess().getIfBlockAssignment_4()); 
            // InternalKlangParser.g:2457:2: ( rule__If__IfBlockAssignment_4 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==Forever||(LA18_0>=Sleep && LA18_0<=While)||LA18_0==If||LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalKlangParser.g:2457:3: rule__If__IfBlockAssignment_4
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__If__IfBlockAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalKlangParser.g:2465:1: rule__If__Group__5 : rule__If__Group__5__Impl rule__If__Group__6 ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2469:1: ( rule__If__Group__5__Impl rule__If__Group__6 )
            // InternalKlangParser.g:2470:2: rule__If__Group__5__Impl rule__If__Group__6
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
    // InternalKlangParser.g:2477:1: rule__If__Group__5__Impl : ( RULE_END ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2481:1: ( ( RULE_END ) )
            // InternalKlangParser.g:2482:1: ( RULE_END )
            {
            // InternalKlangParser.g:2482:1: ( RULE_END )
            // InternalKlangParser.g:2483:2: RULE_END
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
    // InternalKlangParser.g:2492:1: rule__If__Group__6 : rule__If__Group__6__Impl ;
    public final void rule__If__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2496:1: ( rule__If__Group__6__Impl )
            // InternalKlangParser.g:2497:2: rule__If__Group__6__Impl
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
    // InternalKlangParser.g:2503:1: rule__If__Group__6__Impl : ( ( rule__If__Group_6__0 )? ) ;
    public final void rule__If__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2507:1: ( ( ( rule__If__Group_6__0 )? ) )
            // InternalKlangParser.g:2508:1: ( ( rule__If__Group_6__0 )? )
            {
            // InternalKlangParser.g:2508:1: ( ( rule__If__Group_6__0 )? )
            // InternalKlangParser.g:2509:2: ( rule__If__Group_6__0 )?
            {
             before(grammarAccess.getIfAccess().getGroup_6()); 
            // InternalKlangParser.g:2510:2: ( rule__If__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Else) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalKlangParser.g:2510:3: rule__If__Group_6__0
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
    // InternalKlangParser.g:2519:1: rule__If__Group_6__0 : rule__If__Group_6__0__Impl rule__If__Group_6__1 ;
    public final void rule__If__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2523:1: ( rule__If__Group_6__0__Impl rule__If__Group_6__1 )
            // InternalKlangParser.g:2524:2: rule__If__Group_6__0__Impl rule__If__Group_6__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalKlangParser.g:2531:1: rule__If__Group_6__0__Impl : ( Else ) ;
    public final void rule__If__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2535:1: ( ( Else ) )
            // InternalKlangParser.g:2536:1: ( Else )
            {
            // InternalKlangParser.g:2536:1: ( Else )
            // InternalKlangParser.g:2537:2: Else
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
    // InternalKlangParser.g:2546:1: rule__If__Group_6__1 : rule__If__Group_6__1__Impl rule__If__Group_6__2 ;
    public final void rule__If__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2550:1: ( rule__If__Group_6__1__Impl rule__If__Group_6__2 )
            // InternalKlangParser.g:2551:2: rule__If__Group_6__1__Impl rule__If__Group_6__2
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
    // InternalKlangParser.g:2558:1: rule__If__Group_6__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__If__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2562:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:2563:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:2563:1: ( RULE_BEGIN )
            // InternalKlangParser.g:2564:2: RULE_BEGIN
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
    // InternalKlangParser.g:2573:1: rule__If__Group_6__2 : rule__If__Group_6__2__Impl rule__If__Group_6__3 ;
    public final void rule__If__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2577:1: ( rule__If__Group_6__2__Impl rule__If__Group_6__3 )
            // InternalKlangParser.g:2578:2: rule__If__Group_6__2__Impl rule__If__Group_6__3
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
    // InternalKlangParser.g:2585:1: rule__If__Group_6__2__Impl : ( ( rule__If__ElseBlockAssignment_6_2 )* ) ;
    public final void rule__If__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2589:1: ( ( ( rule__If__ElseBlockAssignment_6_2 )* ) )
            // InternalKlangParser.g:2590:1: ( ( rule__If__ElseBlockAssignment_6_2 )* )
            {
            // InternalKlangParser.g:2590:1: ( ( rule__If__ElseBlockAssignment_6_2 )* )
            // InternalKlangParser.g:2591:2: ( rule__If__ElseBlockAssignment_6_2 )*
            {
             before(grammarAccess.getIfAccess().getElseBlockAssignment_6_2()); 
            // InternalKlangParser.g:2592:2: ( rule__If__ElseBlockAssignment_6_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==Forever||(LA20_0>=Sleep && LA20_0<=While)||LA20_0==If||LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalKlangParser.g:2592:3: rule__If__ElseBlockAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__If__ElseBlockAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalKlangParser.g:2600:1: rule__If__Group_6__3 : rule__If__Group_6__3__Impl ;
    public final void rule__If__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2604:1: ( rule__If__Group_6__3__Impl )
            // InternalKlangParser.g:2605:2: rule__If__Group_6__3__Impl
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
    // InternalKlangParser.g:2611:1: rule__If__Group_6__3__Impl : ( RULE_END ) ;
    public final void rule__If__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2615:1: ( ( RULE_END ) )
            // InternalKlangParser.g:2616:1: ( RULE_END )
            {
            // InternalKlangParser.g:2616:1: ( RULE_END )
            // InternalKlangParser.g:2617:2: RULE_END
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
    // InternalKlangParser.g:2627:1: rule__ForeverLoop__Group__0 : rule__ForeverLoop__Group__0__Impl rule__ForeverLoop__Group__1 ;
    public final void rule__ForeverLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2631:1: ( rule__ForeverLoop__Group__0__Impl rule__ForeverLoop__Group__1 )
            // InternalKlangParser.g:2632:2: rule__ForeverLoop__Group__0__Impl rule__ForeverLoop__Group__1
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
    // InternalKlangParser.g:2639:1: rule__ForeverLoop__Group__0__Impl : ( () ) ;
    public final void rule__ForeverLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2643:1: ( ( () ) )
            // InternalKlangParser.g:2644:1: ( () )
            {
            // InternalKlangParser.g:2644:1: ( () )
            // InternalKlangParser.g:2645:2: ()
            {
             before(grammarAccess.getForeverLoopAccess().getForeverLoopAction_0()); 
            // InternalKlangParser.g:2646:2: ()
            // InternalKlangParser.g:2646:3: 
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
    // InternalKlangParser.g:2654:1: rule__ForeverLoop__Group__1 : rule__ForeverLoop__Group__1__Impl rule__ForeverLoop__Group__2 ;
    public final void rule__ForeverLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2658:1: ( rule__ForeverLoop__Group__1__Impl rule__ForeverLoop__Group__2 )
            // InternalKlangParser.g:2659:2: rule__ForeverLoop__Group__1__Impl rule__ForeverLoop__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalKlangParser.g:2666:1: rule__ForeverLoop__Group__1__Impl : ( Forever ) ;
    public final void rule__ForeverLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2670:1: ( ( Forever ) )
            // InternalKlangParser.g:2671:1: ( Forever )
            {
            // InternalKlangParser.g:2671:1: ( Forever )
            // InternalKlangParser.g:2672:2: Forever
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
    // InternalKlangParser.g:2681:1: rule__ForeverLoop__Group__2 : rule__ForeverLoop__Group__2__Impl rule__ForeverLoop__Group__3 ;
    public final void rule__ForeverLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2685:1: ( rule__ForeverLoop__Group__2__Impl rule__ForeverLoop__Group__3 )
            // InternalKlangParser.g:2686:2: rule__ForeverLoop__Group__2__Impl rule__ForeverLoop__Group__3
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
    // InternalKlangParser.g:2693:1: rule__ForeverLoop__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__ForeverLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2697:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:2698:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:2698:1: ( RULE_BEGIN )
            // InternalKlangParser.g:2699:2: RULE_BEGIN
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
    // InternalKlangParser.g:2708:1: rule__ForeverLoop__Group__3 : rule__ForeverLoop__Group__3__Impl rule__ForeverLoop__Group__4 ;
    public final void rule__ForeverLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2712:1: ( rule__ForeverLoop__Group__3__Impl rule__ForeverLoop__Group__4 )
            // InternalKlangParser.g:2713:2: rule__ForeverLoop__Group__3__Impl rule__ForeverLoop__Group__4
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
    // InternalKlangParser.g:2720:1: rule__ForeverLoop__Group__3__Impl : ( ( rule__ForeverLoop__LoopStatementsAssignment_3 )* ) ;
    public final void rule__ForeverLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2724:1: ( ( ( rule__ForeverLoop__LoopStatementsAssignment_3 )* ) )
            // InternalKlangParser.g:2725:1: ( ( rule__ForeverLoop__LoopStatementsAssignment_3 )* )
            {
            // InternalKlangParser.g:2725:1: ( ( rule__ForeverLoop__LoopStatementsAssignment_3 )* )
            // InternalKlangParser.g:2726:2: ( rule__ForeverLoop__LoopStatementsAssignment_3 )*
            {
             before(grammarAccess.getForeverLoopAccess().getLoopStatementsAssignment_3()); 
            // InternalKlangParser.g:2727:2: ( rule__ForeverLoop__LoopStatementsAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Forever||(LA21_0>=Sleep && LA21_0<=While)||LA21_0==If||LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalKlangParser.g:2727:3: rule__ForeverLoop__LoopStatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ForeverLoop__LoopStatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalKlangParser.g:2735:1: rule__ForeverLoop__Group__4 : rule__ForeverLoop__Group__4__Impl ;
    public final void rule__ForeverLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2739:1: ( rule__ForeverLoop__Group__4__Impl )
            // InternalKlangParser.g:2740:2: rule__ForeverLoop__Group__4__Impl
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
    // InternalKlangParser.g:2746:1: rule__ForeverLoop__Group__4__Impl : ( RULE_END ) ;
    public final void rule__ForeverLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2750:1: ( ( RULE_END ) )
            // InternalKlangParser.g:2751:1: ( RULE_END )
            {
            // InternalKlangParser.g:2751:1: ( RULE_END )
            // InternalKlangParser.g:2752:2: RULE_END
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
    // InternalKlangParser.g:2762:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2766:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalKlangParser.g:2767:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalKlangParser.g:2774:1: rule__VariableDeclaration__Group__0__Impl : ( Var ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2778:1: ( ( Var ) )
            // InternalKlangParser.g:2779:1: ( Var )
            {
            // InternalKlangParser.g:2779:1: ( Var )
            // InternalKlangParser.g:2780:2: Var
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
    // InternalKlangParser.g:2789:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2793:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // InternalKlangParser.g:2794:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
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
    // InternalKlangParser.g:2801:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2805:1: ( ( ( rule__VariableDeclaration__NameAssignment_1 ) ) )
            // InternalKlangParser.g:2806:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            {
            // InternalKlangParser.g:2806:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            // InternalKlangParser.g:2807:2: ( rule__VariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
            // InternalKlangParser.g:2808:2: ( rule__VariableDeclaration__NameAssignment_1 )
            // InternalKlangParser.g:2808:3: rule__VariableDeclaration__NameAssignment_1
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
    // InternalKlangParser.g:2816:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2820:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // InternalKlangParser.g:2821:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
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
    // InternalKlangParser.g:2828:1: rule__VariableDeclaration__Group__2__Impl : ( EqualsSign ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2832:1: ( ( EqualsSign ) )
            // InternalKlangParser.g:2833:1: ( EqualsSign )
            {
            // InternalKlangParser.g:2833:1: ( EqualsSign )
            // InternalKlangParser.g:2834:2: EqualsSign
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
    // InternalKlangParser.g:2843:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2847:1: ( rule__VariableDeclaration__Group__3__Impl )
            // InternalKlangParser.g:2848:2: rule__VariableDeclaration__Group__3__Impl
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
    // InternalKlangParser.g:2854:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__ExpressionAssignment_3 ) ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2858:1: ( ( ( rule__VariableDeclaration__ExpressionAssignment_3 ) ) )
            // InternalKlangParser.g:2859:1: ( ( rule__VariableDeclaration__ExpressionAssignment_3 ) )
            {
            // InternalKlangParser.g:2859:1: ( ( rule__VariableDeclaration__ExpressionAssignment_3 ) )
            // InternalKlangParser.g:2860:2: ( rule__VariableDeclaration__ExpressionAssignment_3 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getExpressionAssignment_3()); 
            // InternalKlangParser.g:2861:2: ( rule__VariableDeclaration__ExpressionAssignment_3 )
            // InternalKlangParser.g:2861:3: rule__VariableDeclaration__ExpressionAssignment_3
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
    // InternalKlangParser.g:2870:1: rule__VariableAssignment__Group__0 : rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1 ;
    public final void rule__VariableAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2874:1: ( rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1 )
            // InternalKlangParser.g:2875:2: rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1
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
    // InternalKlangParser.g:2882:1: rule__VariableAssignment__Group__0__Impl : ( ( rule__VariableAssignment__VariableNameAssignment_0 ) ) ;
    public final void rule__VariableAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2886:1: ( ( ( rule__VariableAssignment__VariableNameAssignment_0 ) ) )
            // InternalKlangParser.g:2887:1: ( ( rule__VariableAssignment__VariableNameAssignment_0 ) )
            {
            // InternalKlangParser.g:2887:1: ( ( rule__VariableAssignment__VariableNameAssignment_0 ) )
            // InternalKlangParser.g:2888:2: ( rule__VariableAssignment__VariableNameAssignment_0 )
            {
             before(grammarAccess.getVariableAssignmentAccess().getVariableNameAssignment_0()); 
            // InternalKlangParser.g:2889:2: ( rule__VariableAssignment__VariableNameAssignment_0 )
            // InternalKlangParser.g:2889:3: rule__VariableAssignment__VariableNameAssignment_0
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
    // InternalKlangParser.g:2897:1: rule__VariableAssignment__Group__1 : rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2 ;
    public final void rule__VariableAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2901:1: ( rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2 )
            // InternalKlangParser.g:2902:2: rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2
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
    // InternalKlangParser.g:2909:1: rule__VariableAssignment__Group__1__Impl : ( EqualsSign ) ;
    public final void rule__VariableAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2913:1: ( ( EqualsSign ) )
            // InternalKlangParser.g:2914:1: ( EqualsSign )
            {
            // InternalKlangParser.g:2914:1: ( EqualsSign )
            // InternalKlangParser.g:2915:2: EqualsSign
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
    // InternalKlangParser.g:2924:1: rule__VariableAssignment__Group__2 : rule__VariableAssignment__Group__2__Impl ;
    public final void rule__VariableAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2928:1: ( rule__VariableAssignment__Group__2__Impl )
            // InternalKlangParser.g:2929:2: rule__VariableAssignment__Group__2__Impl
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
    // InternalKlangParser.g:2935:1: rule__VariableAssignment__Group__2__Impl : ( ( rule__VariableAssignment__ExpressionAssignment_2 ) ) ;
    public final void rule__VariableAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2939:1: ( ( ( rule__VariableAssignment__ExpressionAssignment_2 ) ) )
            // InternalKlangParser.g:2940:1: ( ( rule__VariableAssignment__ExpressionAssignment_2 ) )
            {
            // InternalKlangParser.g:2940:1: ( ( rule__VariableAssignment__ExpressionAssignment_2 ) )
            // InternalKlangParser.g:2941:2: ( rule__VariableAssignment__ExpressionAssignment_2 )
            {
             before(grammarAccess.getVariableAssignmentAccess().getExpressionAssignment_2()); 
            // InternalKlangParser.g:2942:2: ( rule__VariableAssignment__ExpressionAssignment_2 )
            // InternalKlangParser.g:2942:3: rule__VariableAssignment__ExpressionAssignment_2
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
    // InternalKlangParser.g:2951:1: rule__Sleep__Group__0 : rule__Sleep__Group__0__Impl rule__Sleep__Group__1 ;
    public final void rule__Sleep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2955:1: ( rule__Sleep__Group__0__Impl rule__Sleep__Group__1 )
            // InternalKlangParser.g:2956:2: rule__Sleep__Group__0__Impl rule__Sleep__Group__1
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
    // InternalKlangParser.g:2963:1: rule__Sleep__Group__0__Impl : ( () ) ;
    public final void rule__Sleep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2967:1: ( ( () ) )
            // InternalKlangParser.g:2968:1: ( () )
            {
            // InternalKlangParser.g:2968:1: ( () )
            // InternalKlangParser.g:2969:2: ()
            {
             before(grammarAccess.getSleepAccess().getSleepAction_0()); 
            // InternalKlangParser.g:2970:2: ()
            // InternalKlangParser.g:2970:3: 
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
    // InternalKlangParser.g:2978:1: rule__Sleep__Group__1 : rule__Sleep__Group__1__Impl rule__Sleep__Group__2 ;
    public final void rule__Sleep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2982:1: ( rule__Sleep__Group__1__Impl rule__Sleep__Group__2 )
            // InternalKlangParser.g:2983:2: rule__Sleep__Group__1__Impl rule__Sleep__Group__2
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
    // InternalKlangParser.g:2990:1: rule__Sleep__Group__1__Impl : ( Sleep ) ;
    public final void rule__Sleep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2994:1: ( ( Sleep ) )
            // InternalKlangParser.g:2995:1: ( Sleep )
            {
            // InternalKlangParser.g:2995:1: ( Sleep )
            // InternalKlangParser.g:2996:2: Sleep
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
    // InternalKlangParser.g:3005:1: rule__Sleep__Group__2 : rule__Sleep__Group__2__Impl rule__Sleep__Group__3 ;
    public final void rule__Sleep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3009:1: ( rule__Sleep__Group__2__Impl rule__Sleep__Group__3 )
            // InternalKlangParser.g:3010:2: rule__Sleep__Group__2__Impl rule__Sleep__Group__3
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
    // InternalKlangParser.g:3017:1: rule__Sleep__Group__2__Impl : ( LeftParenthesis ) ;
    public final void rule__Sleep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3021:1: ( ( LeftParenthesis ) )
            // InternalKlangParser.g:3022:1: ( LeftParenthesis )
            {
            // InternalKlangParser.g:3022:1: ( LeftParenthesis )
            // InternalKlangParser.g:3023:2: LeftParenthesis
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
    // InternalKlangParser.g:3032:1: rule__Sleep__Group__3 : rule__Sleep__Group__3__Impl rule__Sleep__Group__4 ;
    public final void rule__Sleep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3036:1: ( rule__Sleep__Group__3__Impl rule__Sleep__Group__4 )
            // InternalKlangParser.g:3037:2: rule__Sleep__Group__3__Impl rule__Sleep__Group__4
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
    // InternalKlangParser.g:3044:1: rule__Sleep__Group__3__Impl : ( ( rule__Sleep__DurationAssignment_3 ) ) ;
    public final void rule__Sleep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3048:1: ( ( ( rule__Sleep__DurationAssignment_3 ) ) )
            // InternalKlangParser.g:3049:1: ( ( rule__Sleep__DurationAssignment_3 ) )
            {
            // InternalKlangParser.g:3049:1: ( ( rule__Sleep__DurationAssignment_3 ) )
            // InternalKlangParser.g:3050:2: ( rule__Sleep__DurationAssignment_3 )
            {
             before(grammarAccess.getSleepAccess().getDurationAssignment_3()); 
            // InternalKlangParser.g:3051:2: ( rule__Sleep__DurationAssignment_3 )
            // InternalKlangParser.g:3051:3: rule__Sleep__DurationAssignment_3
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
    // InternalKlangParser.g:3059:1: rule__Sleep__Group__4 : rule__Sleep__Group__4__Impl ;
    public final void rule__Sleep__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3063:1: ( rule__Sleep__Group__4__Impl )
            // InternalKlangParser.g:3064:2: rule__Sleep__Group__4__Impl
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
    // InternalKlangParser.g:3070:1: rule__Sleep__Group__4__Impl : ( RightParenthesis ) ;
    public final void rule__Sleep__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3074:1: ( ( RightParenthesis ) )
            // InternalKlangParser.g:3075:1: ( RightParenthesis )
            {
            // InternalKlangParser.g:3075:1: ( RightParenthesis )
            // InternalKlangParser.g:3076:2: RightParenthesis
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
    // InternalKlangParser.g:3086:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3090:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalKlangParser.g:3091:2: rule__Or__Group__0__Impl rule__Or__Group__1
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
    // InternalKlangParser.g:3098:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3102:1: ( ( ruleAnd ) )
            // InternalKlangParser.g:3103:1: ( ruleAnd )
            {
            // InternalKlangParser.g:3103:1: ( ruleAnd )
            // InternalKlangParser.g:3104:2: ruleAnd
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
    // InternalKlangParser.g:3113:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3117:1: ( rule__Or__Group__1__Impl )
            // InternalKlangParser.g:3118:2: rule__Or__Group__1__Impl
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
    // InternalKlangParser.g:3124:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3128:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalKlangParser.g:3129:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalKlangParser.g:3129:1: ( ( rule__Or__Group_1__0 )* )
            // InternalKlangParser.g:3130:2: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // InternalKlangParser.g:3131:2: ( rule__Or__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==Or) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalKlangParser.g:3131:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Or__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalKlangParser.g:3140:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3144:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalKlangParser.g:3145:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
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
    // InternalKlangParser.g:3152:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3156:1: ( ( () ) )
            // InternalKlangParser.g:3157:1: ( () )
            {
            // InternalKlangParser.g:3157:1: ( () )
            // InternalKlangParser.g:3158:2: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // InternalKlangParser.g:3159:2: ()
            // InternalKlangParser.g:3159:3: 
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
    // InternalKlangParser.g:3167:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3171:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalKlangParser.g:3172:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
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
    // InternalKlangParser.g:3179:1: rule__Or__Group_1__1__Impl : ( Or ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3183:1: ( ( Or ) )
            // InternalKlangParser.g:3184:1: ( Or )
            {
            // InternalKlangParser.g:3184:1: ( Or )
            // InternalKlangParser.g:3185:2: Or
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
    // InternalKlangParser.g:3194:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3198:1: ( rule__Or__Group_1__2__Impl )
            // InternalKlangParser.g:3199:2: rule__Or__Group_1__2__Impl
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
    // InternalKlangParser.g:3205:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3209:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:3210:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:3210:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalKlangParser.g:3211:2: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:3212:2: ( rule__Or__RightAssignment_1_2 )
            // InternalKlangParser.g:3212:3: rule__Or__RightAssignment_1_2
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
    // InternalKlangParser.g:3221:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3225:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalKlangParser.g:3226:2: rule__And__Group__0__Impl rule__And__Group__1
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
    // InternalKlangParser.g:3233:1: rule__And__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3237:1: ( ( ruleComparison ) )
            // InternalKlangParser.g:3238:1: ( ruleComparison )
            {
            // InternalKlangParser.g:3238:1: ( ruleComparison )
            // InternalKlangParser.g:3239:2: ruleComparison
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
    // InternalKlangParser.g:3248:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3252:1: ( rule__And__Group__1__Impl )
            // InternalKlangParser.g:3253:2: rule__And__Group__1__Impl
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
    // InternalKlangParser.g:3259:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3263:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalKlangParser.g:3264:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalKlangParser.g:3264:1: ( ( rule__And__Group_1__0 )* )
            // InternalKlangParser.g:3265:2: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // InternalKlangParser.g:3266:2: ( rule__And__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==And) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalKlangParser.g:3266:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__And__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalKlangParser.g:3275:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3279:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalKlangParser.g:3280:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
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
    // InternalKlangParser.g:3287:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3291:1: ( ( () ) )
            // InternalKlangParser.g:3292:1: ( () )
            {
            // InternalKlangParser.g:3292:1: ( () )
            // InternalKlangParser.g:3293:2: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // InternalKlangParser.g:3294:2: ()
            // InternalKlangParser.g:3294:3: 
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
    // InternalKlangParser.g:3302:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3306:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalKlangParser.g:3307:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
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
    // InternalKlangParser.g:3314:1: rule__And__Group_1__1__Impl : ( And ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3318:1: ( ( And ) )
            // InternalKlangParser.g:3319:1: ( And )
            {
            // InternalKlangParser.g:3319:1: ( And )
            // InternalKlangParser.g:3320:2: And
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
    // InternalKlangParser.g:3329:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3333:1: ( rule__And__Group_1__2__Impl )
            // InternalKlangParser.g:3334:2: rule__And__Group_1__2__Impl
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
    // InternalKlangParser.g:3340:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3344:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:3345:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:3345:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalKlangParser.g:3346:2: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:3347:2: ( rule__And__RightAssignment_1_2 )
            // InternalKlangParser.g:3347:3: rule__And__RightAssignment_1_2
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
    // InternalKlangParser.g:3356:1: rule__Plus__Group__0 : rule__Plus__Group__0__Impl rule__Plus__Group__1 ;
    public final void rule__Plus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3360:1: ( rule__Plus__Group__0__Impl rule__Plus__Group__1 )
            // InternalKlangParser.g:3361:2: rule__Plus__Group__0__Impl rule__Plus__Group__1
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
    // InternalKlangParser.g:3368:1: rule__Plus__Group__0__Impl : ( ruleMinus ) ;
    public final void rule__Plus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3372:1: ( ( ruleMinus ) )
            // InternalKlangParser.g:3373:1: ( ruleMinus )
            {
            // InternalKlangParser.g:3373:1: ( ruleMinus )
            // InternalKlangParser.g:3374:2: ruleMinus
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
    // InternalKlangParser.g:3383:1: rule__Plus__Group__1 : rule__Plus__Group__1__Impl ;
    public final void rule__Plus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3387:1: ( rule__Plus__Group__1__Impl )
            // InternalKlangParser.g:3388:2: rule__Plus__Group__1__Impl
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
    // InternalKlangParser.g:3394:1: rule__Plus__Group__1__Impl : ( ( rule__Plus__Group_1__0 )* ) ;
    public final void rule__Plus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3398:1: ( ( ( rule__Plus__Group_1__0 )* ) )
            // InternalKlangParser.g:3399:1: ( ( rule__Plus__Group_1__0 )* )
            {
            // InternalKlangParser.g:3399:1: ( ( rule__Plus__Group_1__0 )* )
            // InternalKlangParser.g:3400:2: ( rule__Plus__Group_1__0 )*
            {
             before(grammarAccess.getPlusAccess().getGroup_1()); 
            // InternalKlangParser.g:3401:2: ( rule__Plus__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==PlusSign) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalKlangParser.g:3401:3: rule__Plus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Plus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalKlangParser.g:3410:1: rule__Plus__Group_1__0 : rule__Plus__Group_1__0__Impl rule__Plus__Group_1__1 ;
    public final void rule__Plus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3414:1: ( rule__Plus__Group_1__0__Impl rule__Plus__Group_1__1 )
            // InternalKlangParser.g:3415:2: rule__Plus__Group_1__0__Impl rule__Plus__Group_1__1
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
    // InternalKlangParser.g:3422:1: rule__Plus__Group_1__0__Impl : ( () ) ;
    public final void rule__Plus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3426:1: ( ( () ) )
            // InternalKlangParser.g:3427:1: ( () )
            {
            // InternalKlangParser.g:3427:1: ( () )
            // InternalKlangParser.g:3428:2: ()
            {
             before(grammarAccess.getPlusAccess().getPlusLeftAction_1_0()); 
            // InternalKlangParser.g:3429:2: ()
            // InternalKlangParser.g:3429:3: 
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
    // InternalKlangParser.g:3437:1: rule__Plus__Group_1__1 : rule__Plus__Group_1__1__Impl rule__Plus__Group_1__2 ;
    public final void rule__Plus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3441:1: ( rule__Plus__Group_1__1__Impl rule__Plus__Group_1__2 )
            // InternalKlangParser.g:3442:2: rule__Plus__Group_1__1__Impl rule__Plus__Group_1__2
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
    // InternalKlangParser.g:3449:1: rule__Plus__Group_1__1__Impl : ( PlusSign ) ;
    public final void rule__Plus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3453:1: ( ( PlusSign ) )
            // InternalKlangParser.g:3454:1: ( PlusSign )
            {
            // InternalKlangParser.g:3454:1: ( PlusSign )
            // InternalKlangParser.g:3455:2: PlusSign
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
    // InternalKlangParser.g:3464:1: rule__Plus__Group_1__2 : rule__Plus__Group_1__2__Impl ;
    public final void rule__Plus__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3468:1: ( rule__Plus__Group_1__2__Impl )
            // InternalKlangParser.g:3469:2: rule__Plus__Group_1__2__Impl
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
    // InternalKlangParser.g:3475:1: rule__Plus__Group_1__2__Impl : ( ( rule__Plus__RightAssignment_1_2 ) ) ;
    public final void rule__Plus__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3479:1: ( ( ( rule__Plus__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:3480:1: ( ( rule__Plus__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:3480:1: ( ( rule__Plus__RightAssignment_1_2 ) )
            // InternalKlangParser.g:3481:2: ( rule__Plus__RightAssignment_1_2 )
            {
             before(grammarAccess.getPlusAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:3482:2: ( rule__Plus__RightAssignment_1_2 )
            // InternalKlangParser.g:3482:3: rule__Plus__RightAssignment_1_2
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
    // InternalKlangParser.g:3491:1: rule__Minus__Group__0 : rule__Minus__Group__0__Impl rule__Minus__Group__1 ;
    public final void rule__Minus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3495:1: ( rule__Minus__Group__0__Impl rule__Minus__Group__1 )
            // InternalKlangParser.g:3496:2: rule__Minus__Group__0__Impl rule__Minus__Group__1
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
    // InternalKlangParser.g:3503:1: rule__Minus__Group__0__Impl : ( ruleMultiply ) ;
    public final void rule__Minus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3507:1: ( ( ruleMultiply ) )
            // InternalKlangParser.g:3508:1: ( ruleMultiply )
            {
            // InternalKlangParser.g:3508:1: ( ruleMultiply )
            // InternalKlangParser.g:3509:2: ruleMultiply
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
    // InternalKlangParser.g:3518:1: rule__Minus__Group__1 : rule__Minus__Group__1__Impl ;
    public final void rule__Minus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3522:1: ( rule__Minus__Group__1__Impl )
            // InternalKlangParser.g:3523:2: rule__Minus__Group__1__Impl
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
    // InternalKlangParser.g:3529:1: rule__Minus__Group__1__Impl : ( ( rule__Minus__Group_1__0 )* ) ;
    public final void rule__Minus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3533:1: ( ( ( rule__Minus__Group_1__0 )* ) )
            // InternalKlangParser.g:3534:1: ( ( rule__Minus__Group_1__0 )* )
            {
            // InternalKlangParser.g:3534:1: ( ( rule__Minus__Group_1__0 )* )
            // InternalKlangParser.g:3535:2: ( rule__Minus__Group_1__0 )*
            {
             before(grammarAccess.getMinusAccess().getGroup_1()); 
            // InternalKlangParser.g:3536:2: ( rule__Minus__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==HyphenMinus) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalKlangParser.g:3536:3: rule__Minus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__Minus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalKlangParser.g:3545:1: rule__Minus__Group_1__0 : rule__Minus__Group_1__0__Impl rule__Minus__Group_1__1 ;
    public final void rule__Minus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3549:1: ( rule__Minus__Group_1__0__Impl rule__Minus__Group_1__1 )
            // InternalKlangParser.g:3550:2: rule__Minus__Group_1__0__Impl rule__Minus__Group_1__1
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
    // InternalKlangParser.g:3557:1: rule__Minus__Group_1__0__Impl : ( () ) ;
    public final void rule__Minus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3561:1: ( ( () ) )
            // InternalKlangParser.g:3562:1: ( () )
            {
            // InternalKlangParser.g:3562:1: ( () )
            // InternalKlangParser.g:3563:2: ()
            {
             before(grammarAccess.getMinusAccess().getMinusLeftAction_1_0()); 
            // InternalKlangParser.g:3564:2: ()
            // InternalKlangParser.g:3564:3: 
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
    // InternalKlangParser.g:3572:1: rule__Minus__Group_1__1 : rule__Minus__Group_1__1__Impl rule__Minus__Group_1__2 ;
    public final void rule__Minus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3576:1: ( rule__Minus__Group_1__1__Impl rule__Minus__Group_1__2 )
            // InternalKlangParser.g:3577:2: rule__Minus__Group_1__1__Impl rule__Minus__Group_1__2
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
    // InternalKlangParser.g:3584:1: rule__Minus__Group_1__1__Impl : ( HyphenMinus ) ;
    public final void rule__Minus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3588:1: ( ( HyphenMinus ) )
            // InternalKlangParser.g:3589:1: ( HyphenMinus )
            {
            // InternalKlangParser.g:3589:1: ( HyphenMinus )
            // InternalKlangParser.g:3590:2: HyphenMinus
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
    // InternalKlangParser.g:3599:1: rule__Minus__Group_1__2 : rule__Minus__Group_1__2__Impl ;
    public final void rule__Minus__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3603:1: ( rule__Minus__Group_1__2__Impl )
            // InternalKlangParser.g:3604:2: rule__Minus__Group_1__2__Impl
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
    // InternalKlangParser.g:3610:1: rule__Minus__Group_1__2__Impl : ( ( rule__Minus__RightAssignment_1_2 ) ) ;
    public final void rule__Minus__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3614:1: ( ( ( rule__Minus__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:3615:1: ( ( rule__Minus__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:3615:1: ( ( rule__Minus__RightAssignment_1_2 ) )
            // InternalKlangParser.g:3616:2: ( rule__Minus__RightAssignment_1_2 )
            {
             before(grammarAccess.getMinusAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:3617:2: ( rule__Minus__RightAssignment_1_2 )
            // InternalKlangParser.g:3617:3: rule__Minus__RightAssignment_1_2
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
    // InternalKlangParser.g:3626:1: rule__Multiply__Group__0 : rule__Multiply__Group__0__Impl rule__Multiply__Group__1 ;
    public final void rule__Multiply__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3630:1: ( rule__Multiply__Group__0__Impl rule__Multiply__Group__1 )
            // InternalKlangParser.g:3631:2: rule__Multiply__Group__0__Impl rule__Multiply__Group__1
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
    // InternalKlangParser.g:3638:1: rule__Multiply__Group__0__Impl : ( ruleDivide ) ;
    public final void rule__Multiply__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3642:1: ( ( ruleDivide ) )
            // InternalKlangParser.g:3643:1: ( ruleDivide )
            {
            // InternalKlangParser.g:3643:1: ( ruleDivide )
            // InternalKlangParser.g:3644:2: ruleDivide
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
    // InternalKlangParser.g:3653:1: rule__Multiply__Group__1 : rule__Multiply__Group__1__Impl ;
    public final void rule__Multiply__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3657:1: ( rule__Multiply__Group__1__Impl )
            // InternalKlangParser.g:3658:2: rule__Multiply__Group__1__Impl
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
    // InternalKlangParser.g:3664:1: rule__Multiply__Group__1__Impl : ( ( rule__Multiply__Group_1__0 )* ) ;
    public final void rule__Multiply__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3668:1: ( ( ( rule__Multiply__Group_1__0 )* ) )
            // InternalKlangParser.g:3669:1: ( ( rule__Multiply__Group_1__0 )* )
            {
            // InternalKlangParser.g:3669:1: ( ( rule__Multiply__Group_1__0 )* )
            // InternalKlangParser.g:3670:2: ( rule__Multiply__Group_1__0 )*
            {
             before(grammarAccess.getMultiplyAccess().getGroup_1()); 
            // InternalKlangParser.g:3671:2: ( rule__Multiply__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==Asterisk) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalKlangParser.g:3671:3: rule__Multiply__Group_1__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__Multiply__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalKlangParser.g:3680:1: rule__Multiply__Group_1__0 : rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1 ;
    public final void rule__Multiply__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3684:1: ( rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1 )
            // InternalKlangParser.g:3685:2: rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1
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
    // InternalKlangParser.g:3692:1: rule__Multiply__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiply__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3696:1: ( ( () ) )
            // InternalKlangParser.g:3697:1: ( () )
            {
            // InternalKlangParser.g:3697:1: ( () )
            // InternalKlangParser.g:3698:2: ()
            {
             before(grammarAccess.getMultiplyAccess().getMultiplyLeftAction_1_0()); 
            // InternalKlangParser.g:3699:2: ()
            // InternalKlangParser.g:3699:3: 
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
    // InternalKlangParser.g:3707:1: rule__Multiply__Group_1__1 : rule__Multiply__Group_1__1__Impl rule__Multiply__Group_1__2 ;
    public final void rule__Multiply__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3711:1: ( rule__Multiply__Group_1__1__Impl rule__Multiply__Group_1__2 )
            // InternalKlangParser.g:3712:2: rule__Multiply__Group_1__1__Impl rule__Multiply__Group_1__2
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
    // InternalKlangParser.g:3719:1: rule__Multiply__Group_1__1__Impl : ( Asterisk ) ;
    public final void rule__Multiply__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3723:1: ( ( Asterisk ) )
            // InternalKlangParser.g:3724:1: ( Asterisk )
            {
            // InternalKlangParser.g:3724:1: ( Asterisk )
            // InternalKlangParser.g:3725:2: Asterisk
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
    // InternalKlangParser.g:3734:1: rule__Multiply__Group_1__2 : rule__Multiply__Group_1__2__Impl ;
    public final void rule__Multiply__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3738:1: ( rule__Multiply__Group_1__2__Impl )
            // InternalKlangParser.g:3739:2: rule__Multiply__Group_1__2__Impl
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
    // InternalKlangParser.g:3745:1: rule__Multiply__Group_1__2__Impl : ( ( rule__Multiply__RightAssignment_1_2 ) ) ;
    public final void rule__Multiply__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3749:1: ( ( ( rule__Multiply__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:3750:1: ( ( rule__Multiply__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:3750:1: ( ( rule__Multiply__RightAssignment_1_2 ) )
            // InternalKlangParser.g:3751:2: ( rule__Multiply__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplyAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:3752:2: ( rule__Multiply__RightAssignment_1_2 )
            // InternalKlangParser.g:3752:3: rule__Multiply__RightAssignment_1_2
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
    // InternalKlangParser.g:3761:1: rule__Divide__Group__0 : rule__Divide__Group__0__Impl rule__Divide__Group__1 ;
    public final void rule__Divide__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3765:1: ( rule__Divide__Group__0__Impl rule__Divide__Group__1 )
            // InternalKlangParser.g:3766:2: rule__Divide__Group__0__Impl rule__Divide__Group__1
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
    // InternalKlangParser.g:3773:1: rule__Divide__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__Divide__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3777:1: ( ( rulePrimaryExpression ) )
            // InternalKlangParser.g:3778:1: ( rulePrimaryExpression )
            {
            // InternalKlangParser.g:3778:1: ( rulePrimaryExpression )
            // InternalKlangParser.g:3779:2: rulePrimaryExpression
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
    // InternalKlangParser.g:3788:1: rule__Divide__Group__1 : rule__Divide__Group__1__Impl ;
    public final void rule__Divide__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3792:1: ( rule__Divide__Group__1__Impl )
            // InternalKlangParser.g:3793:2: rule__Divide__Group__1__Impl
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
    // InternalKlangParser.g:3799:1: rule__Divide__Group__1__Impl : ( ( rule__Divide__Group_1__0 )* ) ;
    public final void rule__Divide__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3803:1: ( ( ( rule__Divide__Group_1__0 )* ) )
            // InternalKlangParser.g:3804:1: ( ( rule__Divide__Group_1__0 )* )
            {
            // InternalKlangParser.g:3804:1: ( ( rule__Divide__Group_1__0 )* )
            // InternalKlangParser.g:3805:2: ( rule__Divide__Group_1__0 )*
            {
             before(grammarAccess.getDivideAccess().getGroup_1()); 
            // InternalKlangParser.g:3806:2: ( rule__Divide__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==Solidus) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalKlangParser.g:3806:3: rule__Divide__Group_1__0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__Divide__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalKlangParser.g:3815:1: rule__Divide__Group_1__0 : rule__Divide__Group_1__0__Impl rule__Divide__Group_1__1 ;
    public final void rule__Divide__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3819:1: ( rule__Divide__Group_1__0__Impl rule__Divide__Group_1__1 )
            // InternalKlangParser.g:3820:2: rule__Divide__Group_1__0__Impl rule__Divide__Group_1__1
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
    // InternalKlangParser.g:3827:1: rule__Divide__Group_1__0__Impl : ( () ) ;
    public final void rule__Divide__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3831:1: ( ( () ) )
            // InternalKlangParser.g:3832:1: ( () )
            {
            // InternalKlangParser.g:3832:1: ( () )
            // InternalKlangParser.g:3833:2: ()
            {
             before(grammarAccess.getDivideAccess().getDivideLeftAction_1_0()); 
            // InternalKlangParser.g:3834:2: ()
            // InternalKlangParser.g:3834:3: 
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
    // InternalKlangParser.g:3842:1: rule__Divide__Group_1__1 : rule__Divide__Group_1__1__Impl rule__Divide__Group_1__2 ;
    public final void rule__Divide__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3846:1: ( rule__Divide__Group_1__1__Impl rule__Divide__Group_1__2 )
            // InternalKlangParser.g:3847:2: rule__Divide__Group_1__1__Impl rule__Divide__Group_1__2
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
    // InternalKlangParser.g:3854:1: rule__Divide__Group_1__1__Impl : ( Solidus ) ;
    public final void rule__Divide__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3858:1: ( ( Solidus ) )
            // InternalKlangParser.g:3859:1: ( Solidus )
            {
            // InternalKlangParser.g:3859:1: ( Solidus )
            // InternalKlangParser.g:3860:2: Solidus
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
    // InternalKlangParser.g:3869:1: rule__Divide__Group_1__2 : rule__Divide__Group_1__2__Impl ;
    public final void rule__Divide__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3873:1: ( rule__Divide__Group_1__2__Impl )
            // InternalKlangParser.g:3874:2: rule__Divide__Group_1__2__Impl
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
    // InternalKlangParser.g:3880:1: rule__Divide__Group_1__2__Impl : ( ( rule__Divide__RightAssignment_1_2 ) ) ;
    public final void rule__Divide__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3884:1: ( ( ( rule__Divide__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:3885:1: ( ( rule__Divide__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:3885:1: ( ( rule__Divide__RightAssignment_1_2 ) )
            // InternalKlangParser.g:3886:2: ( rule__Divide__RightAssignment_1_2 )
            {
             before(grammarAccess.getDivideAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:3887:2: ( rule__Divide__RightAssignment_1_2 )
            // InternalKlangParser.g:3887:3: rule__Divide__RightAssignment_1_2
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
    // InternalKlangParser.g:3896:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3900:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalKlangParser.g:3901:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
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
    // InternalKlangParser.g:3908:1: rule__Comparison__Group__0__Impl : ( rulePlus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3912:1: ( ( rulePlus ) )
            // InternalKlangParser.g:3913:1: ( rulePlus )
            {
            // InternalKlangParser.g:3913:1: ( rulePlus )
            // InternalKlangParser.g:3914:2: rulePlus
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
    // InternalKlangParser.g:3923:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3927:1: ( rule__Comparison__Group__1__Impl )
            // InternalKlangParser.g:3928:2: rule__Comparison__Group__1__Impl
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
    // InternalKlangParser.g:3934:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3938:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalKlangParser.g:3939:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalKlangParser.g:3939:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalKlangParser.g:3940:2: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // InternalKlangParser.g:3941:2: ( rule__Comparison__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==EqualsSignEqualsSign||LA28_0==LessThanSign||LA28_0==GreaterThanSign) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalKlangParser.g:3941:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalKlangParser.g:3950:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3954:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalKlangParser.g:3955:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
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
    // InternalKlangParser.g:3962:1: rule__Comparison__Group_1__0__Impl : ( ( rule__Comparison__Alternatives_1_0 ) ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3966:1: ( ( ( rule__Comparison__Alternatives_1_0 ) ) )
            // InternalKlangParser.g:3967:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            {
            // InternalKlangParser.g:3967:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            // InternalKlangParser.g:3968:2: ( rule__Comparison__Alternatives_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getAlternatives_1_0()); 
            // InternalKlangParser.g:3969:2: ( rule__Comparison__Alternatives_1_0 )
            // InternalKlangParser.g:3969:3: rule__Comparison__Alternatives_1_0
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
    // InternalKlangParser.g:3977:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3981:1: ( rule__Comparison__Group_1__1__Impl )
            // InternalKlangParser.g:3982:2: rule__Comparison__Group_1__1__Impl
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
    // InternalKlangParser.g:3988:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__RightAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3992:1: ( ( ( rule__Comparison__RightAssignment_1_1 ) ) )
            // InternalKlangParser.g:3993:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            {
            // InternalKlangParser.g:3993:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            // InternalKlangParser.g:3994:2: ( rule__Comparison__RightAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_1()); 
            // InternalKlangParser.g:3995:2: ( rule__Comparison__RightAssignment_1_1 )
            // InternalKlangParser.g:3995:3: rule__Comparison__RightAssignment_1_1
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
    // InternalKlangParser.g:4004:1: rule__Comparison__Group_1_0_0__0 : rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 ;
    public final void rule__Comparison__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4008:1: ( rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 )
            // InternalKlangParser.g:4009:2: rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1
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
    // InternalKlangParser.g:4016:1: rule__Comparison__Group_1_0_0__0__Impl : ( LessThanSign ) ;
    public final void rule__Comparison__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4020:1: ( ( LessThanSign ) )
            // InternalKlangParser.g:4021:1: ( LessThanSign )
            {
            // InternalKlangParser.g:4021:1: ( LessThanSign )
            // InternalKlangParser.g:4022:2: LessThanSign
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
    // InternalKlangParser.g:4031:1: rule__Comparison__Group_1_0_0__1 : rule__Comparison__Group_1_0_0__1__Impl ;
    public final void rule__Comparison__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4035:1: ( rule__Comparison__Group_1_0_0__1__Impl )
            // InternalKlangParser.g:4036:2: rule__Comparison__Group_1_0_0__1__Impl
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
    // InternalKlangParser.g:4042:1: rule__Comparison__Group_1_0_0__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4046:1: ( ( () ) )
            // InternalKlangParser.g:4047:1: ( () )
            {
            // InternalKlangParser.g:4047:1: ( () )
            // InternalKlangParser.g:4048:2: ()
            {
             before(grammarAccess.getComparisonAccess().getLessThanLeftAction_1_0_0_1()); 
            // InternalKlangParser.g:4049:2: ()
            // InternalKlangParser.g:4049:3: 
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
    // InternalKlangParser.g:4058:1: rule__Comparison__Group_1_0_1__0 : rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 ;
    public final void rule__Comparison__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4062:1: ( rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 )
            // InternalKlangParser.g:4063:2: rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1
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
    // InternalKlangParser.g:4070:1: rule__Comparison__Group_1_0_1__0__Impl : ( EqualsSignEqualsSign ) ;
    public final void rule__Comparison__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4074:1: ( ( EqualsSignEqualsSign ) )
            // InternalKlangParser.g:4075:1: ( EqualsSignEqualsSign )
            {
            // InternalKlangParser.g:4075:1: ( EqualsSignEqualsSign )
            // InternalKlangParser.g:4076:2: EqualsSignEqualsSign
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
    // InternalKlangParser.g:4085:1: rule__Comparison__Group_1_0_1__1 : rule__Comparison__Group_1_0_1__1__Impl ;
    public final void rule__Comparison__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4089:1: ( rule__Comparison__Group_1_0_1__1__Impl )
            // InternalKlangParser.g:4090:2: rule__Comparison__Group_1_0_1__1__Impl
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
    // InternalKlangParser.g:4096:1: rule__Comparison__Group_1_0_1__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4100:1: ( ( () ) )
            // InternalKlangParser.g:4101:1: ( () )
            {
            // InternalKlangParser.g:4101:1: ( () )
            // InternalKlangParser.g:4102:2: ()
            {
             before(grammarAccess.getComparisonAccess().getEqualLeftAction_1_0_1_1()); 
            // InternalKlangParser.g:4103:2: ()
            // InternalKlangParser.g:4103:3: 
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
    // InternalKlangParser.g:4112:1: rule__Comparison__Group_1_0_2__0 : rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1 ;
    public final void rule__Comparison__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4116:1: ( rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1 )
            // InternalKlangParser.g:4117:2: rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1
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
    // InternalKlangParser.g:4124:1: rule__Comparison__Group_1_0_2__0__Impl : ( GreaterThanSign ) ;
    public final void rule__Comparison__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4128:1: ( ( GreaterThanSign ) )
            // InternalKlangParser.g:4129:1: ( GreaterThanSign )
            {
            // InternalKlangParser.g:4129:1: ( GreaterThanSign )
            // InternalKlangParser.g:4130:2: GreaterThanSign
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
    // InternalKlangParser.g:4139:1: rule__Comparison__Group_1_0_2__1 : rule__Comparison__Group_1_0_2__1__Impl ;
    public final void rule__Comparison__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4143:1: ( rule__Comparison__Group_1_0_2__1__Impl )
            // InternalKlangParser.g:4144:2: rule__Comparison__Group_1_0_2__1__Impl
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
    // InternalKlangParser.g:4150:1: rule__Comparison__Group_1_0_2__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4154:1: ( ( () ) )
            // InternalKlangParser.g:4155:1: ( () )
            {
            // InternalKlangParser.g:4155:1: ( () )
            // InternalKlangParser.g:4156:2: ()
            {
             before(grammarAccess.getComparisonAccess().getGreaterThanLeftAction_1_0_2_1()); 
            // InternalKlangParser.g:4157:2: ()
            // InternalKlangParser.g:4157:3: 
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
    // InternalKlangParser.g:4166:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4170:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // InternalKlangParser.g:4171:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
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
    // InternalKlangParser.g:4178:1: rule__FunctionCall__Group__0__Impl : ( ( rule__FunctionCall__NameAssignment_0 ) ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4182:1: ( ( ( rule__FunctionCall__NameAssignment_0 ) ) )
            // InternalKlangParser.g:4183:1: ( ( rule__FunctionCall__NameAssignment_0 ) )
            {
            // InternalKlangParser.g:4183:1: ( ( rule__FunctionCall__NameAssignment_0 ) )
            // InternalKlangParser.g:4184:2: ( rule__FunctionCall__NameAssignment_0 )
            {
             before(grammarAccess.getFunctionCallAccess().getNameAssignment_0()); 
            // InternalKlangParser.g:4185:2: ( rule__FunctionCall__NameAssignment_0 )
            // InternalKlangParser.g:4185:3: rule__FunctionCall__NameAssignment_0
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
    // InternalKlangParser.g:4193:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4197:1: ( rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 )
            // InternalKlangParser.g:4198:2: rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2
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
    // InternalKlangParser.g:4205:1: rule__FunctionCall__Group__1__Impl : ( LeftParenthesis ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4209:1: ( ( LeftParenthesis ) )
            // InternalKlangParser.g:4210:1: ( LeftParenthesis )
            {
            // InternalKlangParser.g:4210:1: ( LeftParenthesis )
            // InternalKlangParser.g:4211:2: LeftParenthesis
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
    // InternalKlangParser.g:4220:1: rule__FunctionCall__Group__2 : rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 ;
    public final void rule__FunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4224:1: ( rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 )
            // InternalKlangParser.g:4225:2: rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3
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
    // InternalKlangParser.g:4232:1: rule__FunctionCall__Group__2__Impl : ( ( rule__FunctionCall__Group_2__0 )? ) ;
    public final void rule__FunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4236:1: ( ( ( rule__FunctionCall__Group_2__0 )? ) )
            // InternalKlangParser.g:4237:1: ( ( rule__FunctionCall__Group_2__0 )? )
            {
            // InternalKlangParser.g:4237:1: ( ( rule__FunctionCall__Group_2__0 )? )
            // InternalKlangParser.g:4238:2: ( rule__FunctionCall__Group_2__0 )?
            {
             before(grammarAccess.getFunctionCallAccess().getGroup_2()); 
            // InternalKlangParser.g:4239:2: ( rule__FunctionCall__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==False||LA29_0==True||LA29_0==Not||LA29_0==LeftParenthesis||LA29_0==HyphenMinus||(LA29_0>=RULE_ID && LA29_0<=RULE_STRING)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalKlangParser.g:4239:3: rule__FunctionCall__Group_2__0
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
    // InternalKlangParser.g:4247:1: rule__FunctionCall__Group__3 : rule__FunctionCall__Group__3__Impl ;
    public final void rule__FunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4251:1: ( rule__FunctionCall__Group__3__Impl )
            // InternalKlangParser.g:4252:2: rule__FunctionCall__Group__3__Impl
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
    // InternalKlangParser.g:4258:1: rule__FunctionCall__Group__3__Impl : ( RightParenthesis ) ;
    public final void rule__FunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4262:1: ( ( RightParenthesis ) )
            // InternalKlangParser.g:4263:1: ( RightParenthesis )
            {
            // InternalKlangParser.g:4263:1: ( RightParenthesis )
            // InternalKlangParser.g:4264:2: RightParenthesis
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
    // InternalKlangParser.g:4274:1: rule__FunctionCall__Group_2__0 : rule__FunctionCall__Group_2__0__Impl rule__FunctionCall__Group_2__1 ;
    public final void rule__FunctionCall__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4278:1: ( rule__FunctionCall__Group_2__0__Impl rule__FunctionCall__Group_2__1 )
            // InternalKlangParser.g:4279:2: rule__FunctionCall__Group_2__0__Impl rule__FunctionCall__Group_2__1
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
    // InternalKlangParser.g:4286:1: rule__FunctionCall__Group_2__0__Impl : ( ( rule__FunctionCall__ParametersAssignment_2_0 ) ) ;
    public final void rule__FunctionCall__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4290:1: ( ( ( rule__FunctionCall__ParametersAssignment_2_0 ) ) )
            // InternalKlangParser.g:4291:1: ( ( rule__FunctionCall__ParametersAssignment_2_0 ) )
            {
            // InternalKlangParser.g:4291:1: ( ( rule__FunctionCall__ParametersAssignment_2_0 ) )
            // InternalKlangParser.g:4292:2: ( rule__FunctionCall__ParametersAssignment_2_0 )
            {
             before(grammarAccess.getFunctionCallAccess().getParametersAssignment_2_0()); 
            // InternalKlangParser.g:4293:2: ( rule__FunctionCall__ParametersAssignment_2_0 )
            // InternalKlangParser.g:4293:3: rule__FunctionCall__ParametersAssignment_2_0
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
    // InternalKlangParser.g:4301:1: rule__FunctionCall__Group_2__1 : rule__FunctionCall__Group_2__1__Impl ;
    public final void rule__FunctionCall__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4305:1: ( rule__FunctionCall__Group_2__1__Impl )
            // InternalKlangParser.g:4306:2: rule__FunctionCall__Group_2__1__Impl
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
    // InternalKlangParser.g:4312:1: rule__FunctionCall__Group_2__1__Impl : ( ( rule__FunctionCall__Group_2_1__0 )* ) ;
    public final void rule__FunctionCall__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4316:1: ( ( ( rule__FunctionCall__Group_2_1__0 )* ) )
            // InternalKlangParser.g:4317:1: ( ( rule__FunctionCall__Group_2_1__0 )* )
            {
            // InternalKlangParser.g:4317:1: ( ( rule__FunctionCall__Group_2_1__0 )* )
            // InternalKlangParser.g:4318:2: ( rule__FunctionCall__Group_2_1__0 )*
            {
             before(grammarAccess.getFunctionCallAccess().getGroup_2_1()); 
            // InternalKlangParser.g:4319:2: ( rule__FunctionCall__Group_2_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==Comma) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalKlangParser.g:4319:3: rule__FunctionCall__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__FunctionCall__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalKlangParser.g:4328:1: rule__FunctionCall__Group_2_1__0 : rule__FunctionCall__Group_2_1__0__Impl rule__FunctionCall__Group_2_1__1 ;
    public final void rule__FunctionCall__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4332:1: ( rule__FunctionCall__Group_2_1__0__Impl rule__FunctionCall__Group_2_1__1 )
            // InternalKlangParser.g:4333:2: rule__FunctionCall__Group_2_1__0__Impl rule__FunctionCall__Group_2_1__1
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
    // InternalKlangParser.g:4340:1: rule__FunctionCall__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__FunctionCall__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4344:1: ( ( Comma ) )
            // InternalKlangParser.g:4345:1: ( Comma )
            {
            // InternalKlangParser.g:4345:1: ( Comma )
            // InternalKlangParser.g:4346:2: Comma
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
    // InternalKlangParser.g:4355:1: rule__FunctionCall__Group_2_1__1 : rule__FunctionCall__Group_2_1__1__Impl ;
    public final void rule__FunctionCall__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4359:1: ( rule__FunctionCall__Group_2_1__1__Impl )
            // InternalKlangParser.g:4360:2: rule__FunctionCall__Group_2_1__1__Impl
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
    // InternalKlangParser.g:4366:1: rule__FunctionCall__Group_2_1__1__Impl : ( ( rule__FunctionCall__ParametersAssignment_2_1_1 ) ) ;
    public final void rule__FunctionCall__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4370:1: ( ( ( rule__FunctionCall__ParametersAssignment_2_1_1 ) ) )
            // InternalKlangParser.g:4371:1: ( ( rule__FunctionCall__ParametersAssignment_2_1_1 ) )
            {
            // InternalKlangParser.g:4371:1: ( ( rule__FunctionCall__ParametersAssignment_2_1_1 ) )
            // InternalKlangParser.g:4372:2: ( rule__FunctionCall__ParametersAssignment_2_1_1 )
            {
             before(grammarAccess.getFunctionCallAccess().getParametersAssignment_2_1_1()); 
            // InternalKlangParser.g:4373:2: ( rule__FunctionCall__ParametersAssignment_2_1_1 )
            // InternalKlangParser.g:4373:3: rule__FunctionCall__ParametersAssignment_2_1_1
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
    // InternalKlangParser.g:4382:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4386:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // InternalKlangParser.g:4387:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
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
    // InternalKlangParser.g:4394:1: rule__PrimaryExpression__Group_0__0__Impl : ( LeftParenthesis ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4398:1: ( ( LeftParenthesis ) )
            // InternalKlangParser.g:4399:1: ( LeftParenthesis )
            {
            // InternalKlangParser.g:4399:1: ( LeftParenthesis )
            // InternalKlangParser.g:4400:2: LeftParenthesis
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
    // InternalKlangParser.g:4409:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4413:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // InternalKlangParser.g:4414:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
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
    // InternalKlangParser.g:4421:1: rule__PrimaryExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4425:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:4426:1: ( ruleExpression )
            {
            // InternalKlangParser.g:4426:1: ( ruleExpression )
            // InternalKlangParser.g:4427:2: ruleExpression
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
    // InternalKlangParser.g:4436:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4440:1: ( rule__PrimaryExpression__Group_0__2__Impl )
            // InternalKlangParser.g:4441:2: rule__PrimaryExpression__Group_0__2__Impl
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
    // InternalKlangParser.g:4447:1: rule__PrimaryExpression__Group_0__2__Impl : ( RightParenthesis ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4451:1: ( ( RightParenthesis ) )
            // InternalKlangParser.g:4452:1: ( RightParenthesis )
            {
            // InternalKlangParser.g:4452:1: ( RightParenthesis )
            // InternalKlangParser.g:4453:2: RightParenthesis
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
    // InternalKlangParser.g:4463:1: rule__PrimaryExpression__Group_1__0 : rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 ;
    public final void rule__PrimaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4467:1: ( rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 )
            // InternalKlangParser.g:4468:2: rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1
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
    // InternalKlangParser.g:4475:1: rule__PrimaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4479:1: ( ( () ) )
            // InternalKlangParser.g:4480:1: ( () )
            {
            // InternalKlangParser.g:4480:1: ( () )
            // InternalKlangParser.g:4481:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNotAction_1_0()); 
            // InternalKlangParser.g:4482:2: ()
            // InternalKlangParser.g:4482:3: 
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
    // InternalKlangParser.g:4490:1: rule__PrimaryExpression__Group_1__1 : rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2 ;
    public final void rule__PrimaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4494:1: ( rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2 )
            // InternalKlangParser.g:4495:2: rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2
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
    // InternalKlangParser.g:4502:1: rule__PrimaryExpression__Group_1__1__Impl : ( Not ) ;
    public final void rule__PrimaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4506:1: ( ( Not ) )
            // InternalKlangParser.g:4507:1: ( Not )
            {
            // InternalKlangParser.g:4507:1: ( Not )
            // InternalKlangParser.g:4508:2: Not
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
    // InternalKlangParser.g:4517:1: rule__PrimaryExpression__Group_1__2 : rule__PrimaryExpression__Group_1__2__Impl ;
    public final void rule__PrimaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4521:1: ( rule__PrimaryExpression__Group_1__2__Impl )
            // InternalKlangParser.g:4522:2: rule__PrimaryExpression__Group_1__2__Impl
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
    // InternalKlangParser.g:4528:1: rule__PrimaryExpression__Group_1__2__Impl : ( ( rule__PrimaryExpression__ExpressionAssignment_1_2 ) ) ;
    public final void rule__PrimaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4532:1: ( ( ( rule__PrimaryExpression__ExpressionAssignment_1_2 ) ) )
            // InternalKlangParser.g:4533:1: ( ( rule__PrimaryExpression__ExpressionAssignment_1_2 ) )
            {
            // InternalKlangParser.g:4533:1: ( ( rule__PrimaryExpression__ExpressionAssignment_1_2 ) )
            // InternalKlangParser.g:4534:2: ( rule__PrimaryExpression__ExpressionAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionAssignment_1_2()); 
            // InternalKlangParser.g:4535:2: ( rule__PrimaryExpression__ExpressionAssignment_1_2 )
            // InternalKlangParser.g:4535:3: rule__PrimaryExpression__ExpressionAssignment_1_2
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
    // InternalKlangParser.g:4544:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4548:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // InternalKlangParser.g:4549:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
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
    // InternalKlangParser.g:4556:1: rule__PrimaryExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4560:1: ( ( () ) )
            // InternalKlangParser.g:4561:1: ( () )
            {
            // InternalKlangParser.g:4561:1: ( () )
            // InternalKlangParser.g:4562:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getUnaryMinusAction_2_0()); 
            // InternalKlangParser.g:4563:2: ()
            // InternalKlangParser.g:4563:3: 
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
    // InternalKlangParser.g:4571:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4575:1: ( rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 )
            // InternalKlangParser.g:4576:2: rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2
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
    // InternalKlangParser.g:4583:1: rule__PrimaryExpression__Group_2__1__Impl : ( HyphenMinus ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4587:1: ( ( HyphenMinus ) )
            // InternalKlangParser.g:4588:1: ( HyphenMinus )
            {
            // InternalKlangParser.g:4588:1: ( HyphenMinus )
            // InternalKlangParser.g:4589:2: HyphenMinus
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
    // InternalKlangParser.g:4598:1: rule__PrimaryExpression__Group_2__2 : rule__PrimaryExpression__Group_2__2__Impl ;
    public final void rule__PrimaryExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4602:1: ( rule__PrimaryExpression__Group_2__2__Impl )
            // InternalKlangParser.g:4603:2: rule__PrimaryExpression__Group_2__2__Impl
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
    // InternalKlangParser.g:4609:1: rule__PrimaryExpression__Group_2__2__Impl : ( ( rule__PrimaryExpression__ExpressionAssignment_2_2 ) ) ;
    public final void rule__PrimaryExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4613:1: ( ( ( rule__PrimaryExpression__ExpressionAssignment_2_2 ) ) )
            // InternalKlangParser.g:4614:1: ( ( rule__PrimaryExpression__ExpressionAssignment_2_2 ) )
            {
            // InternalKlangParser.g:4614:1: ( ( rule__PrimaryExpression__ExpressionAssignment_2_2 ) )
            // InternalKlangParser.g:4615:2: ( rule__PrimaryExpression__ExpressionAssignment_2_2 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionAssignment_2_2()); 
            // InternalKlangParser.g:4616:2: ( rule__PrimaryExpression__ExpressionAssignment_2_2 )
            // InternalKlangParser.g:4616:3: rule__PrimaryExpression__ExpressionAssignment_2_2
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
    // InternalKlangParser.g:4625:1: rule__PrimaryExpression__Group_3__0 : rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 ;
    public final void rule__PrimaryExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4629:1: ( rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 )
            // InternalKlangParser.g:4630:2: rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1
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
    // InternalKlangParser.g:4637:1: rule__PrimaryExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4641:1: ( ( () ) )
            // InternalKlangParser.g:4642:1: ( () )
            {
            // InternalKlangParser.g:4642:1: ( () )
            // InternalKlangParser.g:4643:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getToDoubleAction_3_0()); 
            // InternalKlangParser.g:4644:2: ()
            // InternalKlangParser.g:4644:3: 
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
    // InternalKlangParser.g:4652:1: rule__PrimaryExpression__Group_3__1 : rule__PrimaryExpression__Group_3__1__Impl rule__PrimaryExpression__Group_3__2 ;
    public final void rule__PrimaryExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4656:1: ( rule__PrimaryExpression__Group_3__1__Impl rule__PrimaryExpression__Group_3__2 )
            // InternalKlangParser.g:4657:2: rule__PrimaryExpression__Group_3__1__Impl rule__PrimaryExpression__Group_3__2
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
    // InternalKlangParser.g:4664:1: rule__PrimaryExpression__Group_3__1__Impl : ( LeftParenthesis ) ;
    public final void rule__PrimaryExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4668:1: ( ( LeftParenthesis ) )
            // InternalKlangParser.g:4669:1: ( LeftParenthesis )
            {
            // InternalKlangParser.g:4669:1: ( LeftParenthesis )
            // InternalKlangParser.g:4670:2: LeftParenthesis
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
    // InternalKlangParser.g:4679:1: rule__PrimaryExpression__Group_3__2 : rule__PrimaryExpression__Group_3__2__Impl rule__PrimaryExpression__Group_3__3 ;
    public final void rule__PrimaryExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4683:1: ( rule__PrimaryExpression__Group_3__2__Impl rule__PrimaryExpression__Group_3__3 )
            // InternalKlangParser.g:4684:2: rule__PrimaryExpression__Group_3__2__Impl rule__PrimaryExpression__Group_3__3
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
    // InternalKlangParser.g:4691:1: rule__PrimaryExpression__Group_3__2__Impl : ( Double ) ;
    public final void rule__PrimaryExpression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4695:1: ( ( Double ) )
            // InternalKlangParser.g:4696:1: ( Double )
            {
            // InternalKlangParser.g:4696:1: ( Double )
            // InternalKlangParser.g:4697:2: Double
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
    // InternalKlangParser.g:4706:1: rule__PrimaryExpression__Group_3__3 : rule__PrimaryExpression__Group_3__3__Impl rule__PrimaryExpression__Group_3__4 ;
    public final void rule__PrimaryExpression__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4710:1: ( rule__PrimaryExpression__Group_3__3__Impl rule__PrimaryExpression__Group_3__4 )
            // InternalKlangParser.g:4711:2: rule__PrimaryExpression__Group_3__3__Impl rule__PrimaryExpression__Group_3__4
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
    // InternalKlangParser.g:4718:1: rule__PrimaryExpression__Group_3__3__Impl : ( RightParenthesis ) ;
    public final void rule__PrimaryExpression__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4722:1: ( ( RightParenthesis ) )
            // InternalKlangParser.g:4723:1: ( RightParenthesis )
            {
            // InternalKlangParser.g:4723:1: ( RightParenthesis )
            // InternalKlangParser.g:4724:2: RightParenthesis
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
    // InternalKlangParser.g:4733:1: rule__PrimaryExpression__Group_3__4 : rule__PrimaryExpression__Group_3__4__Impl ;
    public final void rule__PrimaryExpression__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4737:1: ( rule__PrimaryExpression__Group_3__4__Impl )
            // InternalKlangParser.g:4738:2: rule__PrimaryExpression__Group_3__4__Impl
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
    // InternalKlangParser.g:4744:1: rule__PrimaryExpression__Group_3__4__Impl : ( ( rule__PrimaryExpression__ExpressionAssignment_3_4 ) ) ;
    public final void rule__PrimaryExpression__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4748:1: ( ( ( rule__PrimaryExpression__ExpressionAssignment_3_4 ) ) )
            // InternalKlangParser.g:4749:1: ( ( rule__PrimaryExpression__ExpressionAssignment_3_4 ) )
            {
            // InternalKlangParser.g:4749:1: ( ( rule__PrimaryExpression__ExpressionAssignment_3_4 ) )
            // InternalKlangParser.g:4750:2: ( rule__PrimaryExpression__ExpressionAssignment_3_4 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionAssignment_3_4()); 
            // InternalKlangParser.g:4751:2: ( rule__PrimaryExpression__ExpressionAssignment_3_4 )
            // InternalKlangParser.g:4751:3: rule__PrimaryExpression__ExpressionAssignment_3_4
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
    // InternalKlangParser.g:4760:1: rule__PrimaryExpression__Group_4__0 : rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 ;
    public final void rule__PrimaryExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4764:1: ( rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 )
            // InternalKlangParser.g:4765:2: rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1
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
    // InternalKlangParser.g:4772:1: rule__PrimaryExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4776:1: ( ( () ) )
            // InternalKlangParser.g:4777:1: ( () )
            {
            // InternalKlangParser.g:4777:1: ( () )
            // InternalKlangParser.g:4778:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getToIntAction_4_0()); 
            // InternalKlangParser.g:4779:2: ()
            // InternalKlangParser.g:4779:3: 
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
    // InternalKlangParser.g:4787:1: rule__PrimaryExpression__Group_4__1 : rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2 ;
    public final void rule__PrimaryExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4791:1: ( rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2 )
            // InternalKlangParser.g:4792:2: rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2
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
    // InternalKlangParser.g:4799:1: rule__PrimaryExpression__Group_4__1__Impl : ( LeftParenthesis ) ;
    public final void rule__PrimaryExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4803:1: ( ( LeftParenthesis ) )
            // InternalKlangParser.g:4804:1: ( LeftParenthesis )
            {
            // InternalKlangParser.g:4804:1: ( LeftParenthesis )
            // InternalKlangParser.g:4805:2: LeftParenthesis
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
    // InternalKlangParser.g:4814:1: rule__PrimaryExpression__Group_4__2 : rule__PrimaryExpression__Group_4__2__Impl rule__PrimaryExpression__Group_4__3 ;
    public final void rule__PrimaryExpression__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4818:1: ( rule__PrimaryExpression__Group_4__2__Impl rule__PrimaryExpression__Group_4__3 )
            // InternalKlangParser.g:4819:2: rule__PrimaryExpression__Group_4__2__Impl rule__PrimaryExpression__Group_4__3
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
    // InternalKlangParser.g:4826:1: rule__PrimaryExpression__Group_4__2__Impl : ( Int ) ;
    public final void rule__PrimaryExpression__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4830:1: ( ( Int ) )
            // InternalKlangParser.g:4831:1: ( Int )
            {
            // InternalKlangParser.g:4831:1: ( Int )
            // InternalKlangParser.g:4832:2: Int
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
    // InternalKlangParser.g:4841:1: rule__PrimaryExpression__Group_4__3 : rule__PrimaryExpression__Group_4__3__Impl rule__PrimaryExpression__Group_4__4 ;
    public final void rule__PrimaryExpression__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4845:1: ( rule__PrimaryExpression__Group_4__3__Impl rule__PrimaryExpression__Group_4__4 )
            // InternalKlangParser.g:4846:2: rule__PrimaryExpression__Group_4__3__Impl rule__PrimaryExpression__Group_4__4
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
    // InternalKlangParser.g:4853:1: rule__PrimaryExpression__Group_4__3__Impl : ( RightParenthesis ) ;
    public final void rule__PrimaryExpression__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4857:1: ( ( RightParenthesis ) )
            // InternalKlangParser.g:4858:1: ( RightParenthesis )
            {
            // InternalKlangParser.g:4858:1: ( RightParenthesis )
            // InternalKlangParser.g:4859:2: RightParenthesis
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
    // InternalKlangParser.g:4868:1: rule__PrimaryExpression__Group_4__4 : rule__PrimaryExpression__Group_4__4__Impl ;
    public final void rule__PrimaryExpression__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4872:1: ( rule__PrimaryExpression__Group_4__4__Impl )
            // InternalKlangParser.g:4873:2: rule__PrimaryExpression__Group_4__4__Impl
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
    // InternalKlangParser.g:4879:1: rule__PrimaryExpression__Group_4__4__Impl : ( ( rule__PrimaryExpression__ExpressionAssignment_4_4 ) ) ;
    public final void rule__PrimaryExpression__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4883:1: ( ( ( rule__PrimaryExpression__ExpressionAssignment_4_4 ) ) )
            // InternalKlangParser.g:4884:1: ( ( rule__PrimaryExpression__ExpressionAssignment_4_4 ) )
            {
            // InternalKlangParser.g:4884:1: ( ( rule__PrimaryExpression__ExpressionAssignment_4_4 ) )
            // InternalKlangParser.g:4885:2: ( rule__PrimaryExpression__ExpressionAssignment_4_4 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionAssignment_4_4()); 
            // InternalKlangParser.g:4886:2: ( rule__PrimaryExpression__ExpressionAssignment_4_4 )
            // InternalKlangParser.g:4886:3: rule__PrimaryExpression__ExpressionAssignment_4_4
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
    // InternalKlangParser.g:4895:1: rule__AtomicExpression__Group_0__0 : rule__AtomicExpression__Group_0__0__Impl rule__AtomicExpression__Group_0__1 ;
    public final void rule__AtomicExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4899:1: ( rule__AtomicExpression__Group_0__0__Impl rule__AtomicExpression__Group_0__1 )
            // InternalKlangParser.g:4900:2: rule__AtomicExpression__Group_0__0__Impl rule__AtomicExpression__Group_0__1
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
    // InternalKlangParser.g:4907:1: rule__AtomicExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__AtomicExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4911:1: ( ( () ) )
            // InternalKlangParser.g:4912:1: ( () )
            {
            // InternalKlangParser.g:4912:1: ( () )
            // InternalKlangParser.g:4913:2: ()
            {
             before(grammarAccess.getAtomicExpressionAccess().getBooleanLiteralAction_0_0()); 
            // InternalKlangParser.g:4914:2: ()
            // InternalKlangParser.g:4914:3: 
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
    // InternalKlangParser.g:4922:1: rule__AtomicExpression__Group_0__1 : rule__AtomicExpression__Group_0__1__Impl ;
    public final void rule__AtomicExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4926:1: ( rule__AtomicExpression__Group_0__1__Impl )
            // InternalKlangParser.g:4927:2: rule__AtomicExpression__Group_0__1__Impl
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
    // InternalKlangParser.g:4933:1: rule__AtomicExpression__Group_0__1__Impl : ( ( rule__AtomicExpression__Alternatives_0_1 ) ) ;
    public final void rule__AtomicExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4937:1: ( ( ( rule__AtomicExpression__Alternatives_0_1 ) ) )
            // InternalKlangParser.g:4938:1: ( ( rule__AtomicExpression__Alternatives_0_1 ) )
            {
            // InternalKlangParser.g:4938:1: ( ( rule__AtomicExpression__Alternatives_0_1 ) )
            // InternalKlangParser.g:4939:2: ( rule__AtomicExpression__Alternatives_0_1 )
            {
             before(grammarAccess.getAtomicExpressionAccess().getAlternatives_0_1()); 
            // InternalKlangParser.g:4940:2: ( rule__AtomicExpression__Alternatives_0_1 )
            // InternalKlangParser.g:4940:3: rule__AtomicExpression__Alternatives_0_1
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
    // InternalKlangParser.g:4949:1: rule__AtomicExpression__Group_1__0 : rule__AtomicExpression__Group_1__0__Impl rule__AtomicExpression__Group_1__1 ;
    public final void rule__AtomicExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4953:1: ( rule__AtomicExpression__Group_1__0__Impl rule__AtomicExpression__Group_1__1 )
            // InternalKlangParser.g:4954:2: rule__AtomicExpression__Group_1__0__Impl rule__AtomicExpression__Group_1__1
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
    // InternalKlangParser.g:4961:1: rule__AtomicExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AtomicExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4965:1: ( ( () ) )
            // InternalKlangParser.g:4966:1: ( () )
            {
            // InternalKlangParser.g:4966:1: ( () )
            // InternalKlangParser.g:4967:2: ()
            {
             before(grammarAccess.getAtomicExpressionAccess().getDoubleLiteralAction_1_0()); 
            // InternalKlangParser.g:4968:2: ()
            // InternalKlangParser.g:4968:3: 
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
    // InternalKlangParser.g:4976:1: rule__AtomicExpression__Group_1__1 : rule__AtomicExpression__Group_1__1__Impl ;
    public final void rule__AtomicExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4980:1: ( rule__AtomicExpression__Group_1__1__Impl )
            // InternalKlangParser.g:4981:2: rule__AtomicExpression__Group_1__1__Impl
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
    // InternalKlangParser.g:4987:1: rule__AtomicExpression__Group_1__1__Impl : ( ( rule__AtomicExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__AtomicExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4991:1: ( ( ( rule__AtomicExpression__ValueAssignment_1_1 ) ) )
            // InternalKlangParser.g:4992:1: ( ( rule__AtomicExpression__ValueAssignment_1_1 ) )
            {
            // InternalKlangParser.g:4992:1: ( ( rule__AtomicExpression__ValueAssignment_1_1 ) )
            // InternalKlangParser.g:4993:2: ( rule__AtomicExpression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicExpressionAccess().getValueAssignment_1_1()); 
            // InternalKlangParser.g:4994:2: ( rule__AtomicExpression__ValueAssignment_1_1 )
            // InternalKlangParser.g:4994:3: rule__AtomicExpression__ValueAssignment_1_1
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
    // InternalKlangParser.g:5003:1: rule__AtomicExpression__Group_2__0 : rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 ;
    public final void rule__AtomicExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5007:1: ( rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 )
            // InternalKlangParser.g:5008:2: rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1
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
    // InternalKlangParser.g:5015:1: rule__AtomicExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__AtomicExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5019:1: ( ( () ) )
            // InternalKlangParser.g:5020:1: ( () )
            {
            // InternalKlangParser.g:5020:1: ( () )
            // InternalKlangParser.g:5021:2: ()
            {
             before(grammarAccess.getAtomicExpressionAccess().getIntegerLiteralAction_2_0()); 
            // InternalKlangParser.g:5022:2: ()
            // InternalKlangParser.g:5022:3: 
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
    // InternalKlangParser.g:5030:1: rule__AtomicExpression__Group_2__1 : rule__AtomicExpression__Group_2__1__Impl ;
    public final void rule__AtomicExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5034:1: ( rule__AtomicExpression__Group_2__1__Impl )
            // InternalKlangParser.g:5035:2: rule__AtomicExpression__Group_2__1__Impl
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
    // InternalKlangParser.g:5041:1: rule__AtomicExpression__Group_2__1__Impl : ( ( rule__AtomicExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__AtomicExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5045:1: ( ( ( rule__AtomicExpression__ValueAssignment_2_1 ) ) )
            // InternalKlangParser.g:5046:1: ( ( rule__AtomicExpression__ValueAssignment_2_1 ) )
            {
            // InternalKlangParser.g:5046:1: ( ( rule__AtomicExpression__ValueAssignment_2_1 ) )
            // InternalKlangParser.g:5047:2: ( rule__AtomicExpression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicExpressionAccess().getValueAssignment_2_1()); 
            // InternalKlangParser.g:5048:2: ( rule__AtomicExpression__ValueAssignment_2_1 )
            // InternalKlangParser.g:5048:3: rule__AtomicExpression__ValueAssignment_2_1
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
    // InternalKlangParser.g:5057:1: rule__AtomicExpression__Group_3__0 : rule__AtomicExpression__Group_3__0__Impl rule__AtomicExpression__Group_3__1 ;
    public final void rule__AtomicExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5061:1: ( rule__AtomicExpression__Group_3__0__Impl rule__AtomicExpression__Group_3__1 )
            // InternalKlangParser.g:5062:2: rule__AtomicExpression__Group_3__0__Impl rule__AtomicExpression__Group_3__1
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
    // InternalKlangParser.g:5069:1: rule__AtomicExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__AtomicExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5073:1: ( ( () ) )
            // InternalKlangParser.g:5074:1: ( () )
            {
            // InternalKlangParser.g:5074:1: ( () )
            // InternalKlangParser.g:5075:2: ()
            {
             before(grammarAccess.getAtomicExpressionAccess().getStringLiteralAction_3_0()); 
            // InternalKlangParser.g:5076:2: ()
            // InternalKlangParser.g:5076:3: 
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
    // InternalKlangParser.g:5084:1: rule__AtomicExpression__Group_3__1 : rule__AtomicExpression__Group_3__1__Impl ;
    public final void rule__AtomicExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5088:1: ( rule__AtomicExpression__Group_3__1__Impl )
            // InternalKlangParser.g:5089:2: rule__AtomicExpression__Group_3__1__Impl
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
    // InternalKlangParser.g:5095:1: rule__AtomicExpression__Group_3__1__Impl : ( ( rule__AtomicExpression__ValueAssignment_3_1 ) ) ;
    public final void rule__AtomicExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5099:1: ( ( ( rule__AtomicExpression__ValueAssignment_3_1 ) ) )
            // InternalKlangParser.g:5100:1: ( ( rule__AtomicExpression__ValueAssignment_3_1 ) )
            {
            // InternalKlangParser.g:5100:1: ( ( rule__AtomicExpression__ValueAssignment_3_1 ) )
            // InternalKlangParser.g:5101:2: ( rule__AtomicExpression__ValueAssignment_3_1 )
            {
             before(grammarAccess.getAtomicExpressionAccess().getValueAssignment_3_1()); 
            // InternalKlangParser.g:5102:2: ( rule__AtomicExpression__ValueAssignment_3_1 )
            // InternalKlangParser.g:5102:3: rule__AtomicExpression__ValueAssignment_3_1
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
    // InternalKlangParser.g:5111:1: rule__AtomicExpression__Group_4__0 : rule__AtomicExpression__Group_4__0__Impl rule__AtomicExpression__Group_4__1 ;
    public final void rule__AtomicExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5115:1: ( rule__AtomicExpression__Group_4__0__Impl rule__AtomicExpression__Group_4__1 )
            // InternalKlangParser.g:5116:2: rule__AtomicExpression__Group_4__0__Impl rule__AtomicExpression__Group_4__1
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
    // InternalKlangParser.g:5123:1: rule__AtomicExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__AtomicExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5127:1: ( ( () ) )
            // InternalKlangParser.g:5128:1: ( () )
            {
            // InternalKlangParser.g:5128:1: ( () )
            // InternalKlangParser.g:5129:2: ()
            {
             before(grammarAccess.getAtomicExpressionAccess().getVariableReferenceAction_4_0()); 
            // InternalKlangParser.g:5130:2: ()
            // InternalKlangParser.g:5130:3: 
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
    // InternalKlangParser.g:5138:1: rule__AtomicExpression__Group_4__1 : rule__AtomicExpression__Group_4__1__Impl ;
    public final void rule__AtomicExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5142:1: ( rule__AtomicExpression__Group_4__1__Impl )
            // InternalKlangParser.g:5143:2: rule__AtomicExpression__Group_4__1__Impl
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
    // InternalKlangParser.g:5149:1: rule__AtomicExpression__Group_4__1__Impl : ( ( rule__AtomicExpression__VariableNameAssignment_4_1 ) ) ;
    public final void rule__AtomicExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5153:1: ( ( ( rule__AtomicExpression__VariableNameAssignment_4_1 ) ) )
            // InternalKlangParser.g:5154:1: ( ( rule__AtomicExpression__VariableNameAssignment_4_1 ) )
            {
            // InternalKlangParser.g:5154:1: ( ( rule__AtomicExpression__VariableNameAssignment_4_1 ) )
            // InternalKlangParser.g:5155:2: ( rule__AtomicExpression__VariableNameAssignment_4_1 )
            {
             before(grammarAccess.getAtomicExpressionAccess().getVariableNameAssignment_4_1()); 
            // InternalKlangParser.g:5156:2: ( rule__AtomicExpression__VariableNameAssignment_4_1 )
            // InternalKlangParser.g:5156:3: rule__AtomicExpression__VariableNameAssignment_4_1
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
    // InternalKlangParser.g:5165:1: rule__DECIMAL__Group__0 : rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 ;
    public final void rule__DECIMAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5169:1: ( rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 )
            // InternalKlangParser.g:5170:2: rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1
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
    // InternalKlangParser.g:5177:1: rule__DECIMAL__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5181:1: ( ( RULE_INT ) )
            // InternalKlangParser.g:5182:1: ( RULE_INT )
            {
            // InternalKlangParser.g:5182:1: ( RULE_INT )
            // InternalKlangParser.g:5183:2: RULE_INT
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
    // InternalKlangParser.g:5192:1: rule__DECIMAL__Group__1 : rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 ;
    public final void rule__DECIMAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5196:1: ( rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 )
            // InternalKlangParser.g:5197:2: rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2
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
    // InternalKlangParser.g:5204:1: rule__DECIMAL__Group__1__Impl : ( FullStop ) ;
    public final void rule__DECIMAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5208:1: ( ( FullStop ) )
            // InternalKlangParser.g:5209:1: ( FullStop )
            {
            // InternalKlangParser.g:5209:1: ( FullStop )
            // InternalKlangParser.g:5210:2: FullStop
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
    // InternalKlangParser.g:5219:1: rule__DECIMAL__Group__2 : rule__DECIMAL__Group__2__Impl ;
    public final void rule__DECIMAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5223:1: ( rule__DECIMAL__Group__2__Impl )
            // InternalKlangParser.g:5224:2: rule__DECIMAL__Group__2__Impl
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
    // InternalKlangParser.g:5230:1: rule__DECIMAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5234:1: ( ( RULE_INT ) )
            // InternalKlangParser.g:5235:1: ( RULE_INT )
            {
            // InternalKlangParser.g:5235:1: ( RULE_INT )
            // InternalKlangParser.g:5236:2: RULE_INT
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


    // $ANTLR start "rule__Program__SceneActorAssignment_0"
    // InternalKlangParser.g:5246:1: rule__Program__SceneActorAssignment_0 : ( ruleSceneActor ) ;
    public final void rule__Program__SceneActorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5250:1: ( ( ruleSceneActor ) )
            // InternalKlangParser.g:5251:2: ( ruleSceneActor )
            {
            // InternalKlangParser.g:5251:2: ( ruleSceneActor )
            // InternalKlangParser.g:5252:3: ruleSceneActor
            {
             before(grammarAccess.getProgramAccess().getSceneActorSceneActorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSceneActor();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getSceneActorSceneActorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__SceneActorAssignment_0"


    // $ANTLR start "rule__Program__SpriteActorsAssignment_1"
    // InternalKlangParser.g:5261:1: rule__Program__SpriteActorsAssignment_1 : ( ruleSpriteActor ) ;
    public final void rule__Program__SpriteActorsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5265:1: ( ( ruleSpriteActor ) )
            // InternalKlangParser.g:5266:2: ( ruleSpriteActor )
            {
            // InternalKlangParser.g:5266:2: ( ruleSpriteActor )
            // InternalKlangParser.g:5267:3: ruleSpriteActor
            {
             before(grammarAccess.getProgramAccess().getSpriteActorsSpriteActorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSpriteActor();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getSpriteActorsSpriteActorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__SpriteActorsAssignment_1"


    // $ANTLR start "rule__SceneActor__LocalVariablesAssignment_3"
    // InternalKlangParser.g:5276:1: rule__SceneActor__LocalVariablesAssignment_3 : ( ruleVariableDeclaration ) ;
    public final void rule__SceneActor__LocalVariablesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5280:1: ( ( ruleVariableDeclaration ) )
            // InternalKlangParser.g:5281:2: ( ruleVariableDeclaration )
            {
            // InternalKlangParser.g:5281:2: ( ruleVariableDeclaration )
            // InternalKlangParser.g:5282:3: ruleVariableDeclaration
            {
             before(grammarAccess.getSceneActorAccess().getLocalVariablesVariableDeclarationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getSceneActorAccess().getLocalVariablesVariableDeclarationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneActor__LocalVariablesAssignment_3"


    // $ANTLR start "rule__SceneActor__EventHandlersAssignment_4"
    // InternalKlangParser.g:5291:1: rule__SceneActor__EventHandlersAssignment_4 : ( ruleEventHandler ) ;
    public final void rule__SceneActor__EventHandlersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5295:1: ( ( ruleEventHandler ) )
            // InternalKlangParser.g:5296:2: ( ruleEventHandler )
            {
            // InternalKlangParser.g:5296:2: ( ruleEventHandler )
            // InternalKlangParser.g:5297:3: ruleEventHandler
            {
             before(grammarAccess.getSceneActorAccess().getEventHandlersEventHandlerParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEventHandler();

            state._fsp--;

             after(grammarAccess.getSceneActorAccess().getEventHandlersEventHandlerParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneActor__EventHandlersAssignment_4"


    // $ANTLR start "rule__SpriteActor__NameAssignment_2"
    // InternalKlangParser.g:5306:1: rule__SpriteActor__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SpriteActor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5310:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:5311:2: ( RULE_ID )
            {
            // InternalKlangParser.g:5311:2: ( RULE_ID )
            // InternalKlangParser.g:5312:3: RULE_ID
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
    // InternalKlangParser.g:5321:1: rule__SpriteActor__LocalVariablesAssignment_4 : ( ruleVariableDeclaration ) ;
    public final void rule__SpriteActor__LocalVariablesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5325:1: ( ( ruleVariableDeclaration ) )
            // InternalKlangParser.g:5326:2: ( ruleVariableDeclaration )
            {
            // InternalKlangParser.g:5326:2: ( ruleVariableDeclaration )
            // InternalKlangParser.g:5327:3: ruleVariableDeclaration
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
    // InternalKlangParser.g:5336:1: rule__SpriteActor__EventHandlersAssignment_5 : ( ruleEventHandler ) ;
    public final void rule__SpriteActor__EventHandlersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5340:1: ( ( ruleEventHandler ) )
            // InternalKlangParser.g:5341:2: ( ruleEventHandler )
            {
            // InternalKlangParser.g:5341:2: ( ruleEventHandler )
            // InternalKlangParser.g:5342:3: ruleEventHandler
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
    // InternalKlangParser.g:5351:1: rule__GameStart__StatementsAssignment_5 : ( ruleStatement ) ;
    public final void rule__GameStart__StatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5355:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:5356:2: ( ruleStatement )
            {
            // InternalKlangParser.g:5356:2: ( ruleStatement )
            // InternalKlangParser.g:5357:3: ruleStatement
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
    // InternalKlangParser.g:5366:1: rule__SpriteClicked__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__SpriteClicked__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5370:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:5371:2: ( ruleStatement )
            {
            // InternalKlangParser.g:5371:2: ( ruleStatement )
            // InternalKlangParser.g:5372:3: ruleStatement
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
    // InternalKlangParser.g:5381:1: rule__KeyPressed__KeyAssignment_2 : ( RULE_ID ) ;
    public final void rule__KeyPressed__KeyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5385:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:5386:2: ( RULE_ID )
            {
            // InternalKlangParser.g:5386:2: ( RULE_ID )
            // InternalKlangParser.g:5387:3: RULE_ID
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
    // InternalKlangParser.g:5396:1: rule__KeyPressed__StatementsAssignment_6 : ( ruleStatement ) ;
    public final void rule__KeyPressed__StatementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5400:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:5401:2: ( ruleStatement )
            {
            // InternalKlangParser.g:5401:2: ( ruleStatement )
            // InternalKlangParser.g:5402:3: ruleStatement
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
    // InternalKlangParser.g:5411:1: rule__CollidesWith__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__CollidesWith__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5415:1: ( ( ( RULE_ID ) ) )
            // InternalKlangParser.g:5416:2: ( ( RULE_ID ) )
            {
            // InternalKlangParser.g:5416:2: ( ( RULE_ID ) )
            // InternalKlangParser.g:5417:3: ( RULE_ID )
            {
             before(grammarAccess.getCollidesWithAccess().getTargetSpriteActorCrossReference_4_0()); 
            // InternalKlangParser.g:5418:3: ( RULE_ID )
            // InternalKlangParser.g:5419:4: RULE_ID
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
    // InternalKlangParser.g:5430:1: rule__CollidesWith__StatementsAssignment_6 : ( ruleStatement ) ;
    public final void rule__CollidesWith__StatementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5434:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:5435:2: ( ruleStatement )
            {
            // InternalKlangParser.g:5435:2: ( ruleStatement )
            // InternalKlangParser.g:5436:3: ruleStatement
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
    // InternalKlangParser.g:5445:1: rule__WhileLoop__PredicateAssignment_2 : ( ruleExpression ) ;
    public final void rule__WhileLoop__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5449:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:5450:2: ( ruleExpression )
            {
            // InternalKlangParser.g:5450:2: ( ruleExpression )
            // InternalKlangParser.g:5451:3: ruleExpression
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
    // InternalKlangParser.g:5460:1: rule__WhileLoop__LoopBlockAssignment_4 : ( ruleStatement ) ;
    public final void rule__WhileLoop__LoopBlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5464:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:5465:2: ( ruleStatement )
            {
            // InternalKlangParser.g:5465:2: ( ruleStatement )
            // InternalKlangParser.g:5466:3: ruleStatement
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
    // InternalKlangParser.g:5475:1: rule__If__PredicateAssignment_2 : ( ruleExpression ) ;
    public final void rule__If__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5479:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:5480:2: ( ruleExpression )
            {
            // InternalKlangParser.g:5480:2: ( ruleExpression )
            // InternalKlangParser.g:5481:3: ruleExpression
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
    // InternalKlangParser.g:5490:1: rule__If__IfBlockAssignment_4 : ( ruleStatement ) ;
    public final void rule__If__IfBlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5494:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:5495:2: ( ruleStatement )
            {
            // InternalKlangParser.g:5495:2: ( ruleStatement )
            // InternalKlangParser.g:5496:3: ruleStatement
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
    // InternalKlangParser.g:5505:1: rule__If__ElseBlockAssignment_6_2 : ( ruleStatement ) ;
    public final void rule__If__ElseBlockAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5509:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:5510:2: ( ruleStatement )
            {
            // InternalKlangParser.g:5510:2: ( ruleStatement )
            // InternalKlangParser.g:5511:3: ruleStatement
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
    // InternalKlangParser.g:5520:1: rule__ForeverLoop__LoopStatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__ForeverLoop__LoopStatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5524:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:5525:2: ( ruleStatement )
            {
            // InternalKlangParser.g:5525:2: ( ruleStatement )
            // InternalKlangParser.g:5526:3: ruleStatement
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
    // InternalKlangParser.g:5535:1: rule__VariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5539:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:5540:2: ( RULE_ID )
            {
            // InternalKlangParser.g:5540:2: ( RULE_ID )
            // InternalKlangParser.g:5541:3: RULE_ID
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
    // InternalKlangParser.g:5550:1: rule__VariableDeclaration__ExpressionAssignment_3 : ( ruleExpression ) ;
    public final void rule__VariableDeclaration__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5554:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:5555:2: ( ruleExpression )
            {
            // InternalKlangParser.g:5555:2: ( ruleExpression )
            // InternalKlangParser.g:5556:3: ruleExpression
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
    // InternalKlangParser.g:5565:1: rule__VariableAssignment__VariableNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__VariableAssignment__VariableNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5569:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:5570:2: ( RULE_ID )
            {
            // InternalKlangParser.g:5570:2: ( RULE_ID )
            // InternalKlangParser.g:5571:3: RULE_ID
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
    // InternalKlangParser.g:5580:1: rule__VariableAssignment__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__VariableAssignment__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5584:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:5585:2: ( ruleExpression )
            {
            // InternalKlangParser.g:5585:2: ( ruleExpression )
            // InternalKlangParser.g:5586:3: ruleExpression
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
    // InternalKlangParser.g:5595:1: rule__Sleep__DurationAssignment_3 : ( ruleDECIMAL ) ;
    public final void rule__Sleep__DurationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5599:1: ( ( ruleDECIMAL ) )
            // InternalKlangParser.g:5600:2: ( ruleDECIMAL )
            {
            // InternalKlangParser.g:5600:2: ( ruleDECIMAL )
            // InternalKlangParser.g:5601:3: ruleDECIMAL
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
    // InternalKlangParser.g:5610:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5614:1: ( ( ruleAnd ) )
            // InternalKlangParser.g:5615:2: ( ruleAnd )
            {
            // InternalKlangParser.g:5615:2: ( ruleAnd )
            // InternalKlangParser.g:5616:3: ruleAnd
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
    // InternalKlangParser.g:5625:1: rule__And__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5629:1: ( ( ruleComparison ) )
            // InternalKlangParser.g:5630:2: ( ruleComparison )
            {
            // InternalKlangParser.g:5630:2: ( ruleComparison )
            // InternalKlangParser.g:5631:3: ruleComparison
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
    // InternalKlangParser.g:5640:1: rule__Plus__RightAssignment_1_2 : ( ruleMinus ) ;
    public final void rule__Plus__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5644:1: ( ( ruleMinus ) )
            // InternalKlangParser.g:5645:2: ( ruleMinus )
            {
            // InternalKlangParser.g:5645:2: ( ruleMinus )
            // InternalKlangParser.g:5646:3: ruleMinus
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
    // InternalKlangParser.g:5655:1: rule__Minus__RightAssignment_1_2 : ( ruleMultiply ) ;
    public final void rule__Minus__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5659:1: ( ( ruleMultiply ) )
            // InternalKlangParser.g:5660:2: ( ruleMultiply )
            {
            // InternalKlangParser.g:5660:2: ( ruleMultiply )
            // InternalKlangParser.g:5661:3: ruleMultiply
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
    // InternalKlangParser.g:5670:1: rule__Multiply__RightAssignment_1_2 : ( ruleDivide ) ;
    public final void rule__Multiply__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5674:1: ( ( ruleDivide ) )
            // InternalKlangParser.g:5675:2: ( ruleDivide )
            {
            // InternalKlangParser.g:5675:2: ( ruleDivide )
            // InternalKlangParser.g:5676:3: ruleDivide
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
    // InternalKlangParser.g:5685:1: rule__Divide__RightAssignment_1_2 : ( rulePrimaryExpression ) ;
    public final void rule__Divide__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5689:1: ( ( rulePrimaryExpression ) )
            // InternalKlangParser.g:5690:2: ( rulePrimaryExpression )
            {
            // InternalKlangParser.g:5690:2: ( rulePrimaryExpression )
            // InternalKlangParser.g:5691:3: rulePrimaryExpression
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
    // InternalKlangParser.g:5700:1: rule__Comparison__RightAssignment_1_1 : ( rulePlus ) ;
    public final void rule__Comparison__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5704:1: ( ( rulePlus ) )
            // InternalKlangParser.g:5705:2: ( rulePlus )
            {
            // InternalKlangParser.g:5705:2: ( rulePlus )
            // InternalKlangParser.g:5706:3: rulePlus
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
    // InternalKlangParser.g:5715:1: rule__FunctionCall__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FunctionCall__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5719:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:5720:2: ( RULE_ID )
            {
            // InternalKlangParser.g:5720:2: ( RULE_ID )
            // InternalKlangParser.g:5721:3: RULE_ID
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
    // InternalKlangParser.g:5730:1: rule__FunctionCall__ParametersAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__FunctionCall__ParametersAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5734:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:5735:2: ( ruleExpression )
            {
            // InternalKlangParser.g:5735:2: ( ruleExpression )
            // InternalKlangParser.g:5736:3: ruleExpression
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
    // InternalKlangParser.g:5745:1: rule__FunctionCall__ParametersAssignment_2_1_1 : ( ruleExpression ) ;
    public final void rule__FunctionCall__ParametersAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5749:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:5750:2: ( ruleExpression )
            {
            // InternalKlangParser.g:5750:2: ( ruleExpression )
            // InternalKlangParser.g:5751:3: ruleExpression
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
    // InternalKlangParser.g:5760:1: rule__PrimaryExpression__ExpressionAssignment_1_2 : ( rulePrimaryExpression ) ;
    public final void rule__PrimaryExpression__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5764:1: ( ( rulePrimaryExpression ) )
            // InternalKlangParser.g:5765:2: ( rulePrimaryExpression )
            {
            // InternalKlangParser.g:5765:2: ( rulePrimaryExpression )
            // InternalKlangParser.g:5766:3: rulePrimaryExpression
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
    // InternalKlangParser.g:5775:1: rule__PrimaryExpression__ExpressionAssignment_2_2 : ( rulePrimaryExpression ) ;
    public final void rule__PrimaryExpression__ExpressionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5779:1: ( ( rulePrimaryExpression ) )
            // InternalKlangParser.g:5780:2: ( rulePrimaryExpression )
            {
            // InternalKlangParser.g:5780:2: ( rulePrimaryExpression )
            // InternalKlangParser.g:5781:3: rulePrimaryExpression
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
    // InternalKlangParser.g:5790:1: rule__PrimaryExpression__ExpressionAssignment_3_4 : ( rulePrimaryExpression ) ;
    public final void rule__PrimaryExpression__ExpressionAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5794:1: ( ( rulePrimaryExpression ) )
            // InternalKlangParser.g:5795:2: ( rulePrimaryExpression )
            {
            // InternalKlangParser.g:5795:2: ( rulePrimaryExpression )
            // InternalKlangParser.g:5796:3: rulePrimaryExpression
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
    // InternalKlangParser.g:5805:1: rule__PrimaryExpression__ExpressionAssignment_4_4 : ( rulePrimaryExpression ) ;
    public final void rule__PrimaryExpression__ExpressionAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5809:1: ( ( rulePrimaryExpression ) )
            // InternalKlangParser.g:5810:2: ( rulePrimaryExpression )
            {
            // InternalKlangParser.g:5810:2: ( rulePrimaryExpression )
            // InternalKlangParser.g:5811:3: rulePrimaryExpression
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
    // InternalKlangParser.g:5820:1: rule__AtomicExpression__ValueAssignment_0_1_0 : ( ( True ) ) ;
    public final void rule__AtomicExpression__ValueAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5824:1: ( ( ( True ) ) )
            // InternalKlangParser.g:5825:2: ( ( True ) )
            {
            // InternalKlangParser.g:5825:2: ( ( True ) )
            // InternalKlangParser.g:5826:3: ( True )
            {
             before(grammarAccess.getAtomicExpressionAccess().getValueTrueKeyword_0_1_0_0()); 
            // InternalKlangParser.g:5827:3: ( True )
            // InternalKlangParser.g:5828:4: True
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
    // InternalKlangParser.g:5839:1: rule__AtomicExpression__ValueAssignment_1_1 : ( ruleDECIMAL ) ;
    public final void rule__AtomicExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5843:1: ( ( ruleDECIMAL ) )
            // InternalKlangParser.g:5844:2: ( ruleDECIMAL )
            {
            // InternalKlangParser.g:5844:2: ( ruleDECIMAL )
            // InternalKlangParser.g:5845:3: ruleDECIMAL
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
    // InternalKlangParser.g:5854:1: rule__AtomicExpression__ValueAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__AtomicExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5858:1: ( ( RULE_INT ) )
            // InternalKlangParser.g:5859:2: ( RULE_INT )
            {
            // InternalKlangParser.g:5859:2: ( RULE_INT )
            // InternalKlangParser.g:5860:3: RULE_INT
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
    // InternalKlangParser.g:5869:1: rule__AtomicExpression__ValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__AtomicExpression__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5873:1: ( ( RULE_STRING ) )
            // InternalKlangParser.g:5874:2: ( RULE_STRING )
            {
            // InternalKlangParser.g:5874:2: ( RULE_STRING )
            // InternalKlangParser.g:5875:3: RULE_STRING
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
    // InternalKlangParser.g:5884:1: rule__AtomicExpression__VariableNameAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__AtomicExpression__VariableNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5888:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:5889:2: ( RULE_ID )
            {
            // InternalKlangParser.g:5889:2: ( RULE_ID )
            // InternalKlangParser.g:5890:3: RULE_ID
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
            return "869:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) | ( ruleFunctionCall ) | ( ruleAtomicExpression ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000010001040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000030004006040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000020004006042L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000E0210820800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000020004006040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000005002000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000005002000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00000E0230820800L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000020800L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000400000000L});

}