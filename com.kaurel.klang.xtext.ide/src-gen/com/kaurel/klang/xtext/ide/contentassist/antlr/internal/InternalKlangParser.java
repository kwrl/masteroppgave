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
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("ExclamationMark", "'!'");
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
    		tokenNameToValue.put("If", "'if'");
    		tokenNameToValue.put("Or", "'or'");
    		tokenNameToValue.put("And", "'and'");
    		tokenNameToValue.put("Not", "'not'");
    		tokenNameToValue.put("Var", "'var'");
    		tokenNameToValue.put("True", "'true'");
    		tokenNameToValue.put("When", "'when'");
    		tokenNameToValue.put("False", "'false'");
    		tokenNameToValue.put("While", "'while'");
    		tokenNameToValue.put("Yield", "'yield'");
    		tokenNameToValue.put("Sprite", "'sprite'");
    		tokenNameToValue.put("Forever", "'forever'");
    		tokenNameToValue.put("GAME_STARTED", "'GAME_STARTED'");
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
    // InternalKlangParser.g:79:1: entryRuleGame : ruleGame EOF ;
    public final void entryRuleGame() throws RecognitionException {
        try {
            // InternalKlangParser.g:80:1: ( ruleGame EOF )
            // InternalKlangParser.g:81:1: ruleGame EOF
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
    // InternalKlangParser.g:88:1: ruleGame : ( ( rule__Game__Group__0 ) ) ;
    public final void ruleGame() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:92:2: ( ( ( rule__Game__Group__0 ) ) )
            // InternalKlangParser.g:93:2: ( ( rule__Game__Group__0 ) )
            {
            // InternalKlangParser.g:93:2: ( ( rule__Game__Group__0 ) )
            // InternalKlangParser.g:94:3: ( rule__Game__Group__0 )
            {
             before(grammarAccess.getGameAccess().getGroup()); 
            // InternalKlangParser.g:95:3: ( rule__Game__Group__0 )
            // InternalKlangParser.g:95:4: rule__Game__Group__0
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


    // $ANTLR start "entryRuleSprite"
    // InternalKlangParser.g:104:1: entryRuleSprite : ruleSprite EOF ;
    public final void entryRuleSprite() throws RecognitionException {
        try {
            // InternalKlangParser.g:105:1: ( ruleSprite EOF )
            // InternalKlangParser.g:106:1: ruleSprite EOF
            {
             before(grammarAccess.getSpriteRule()); 
            pushFollow(FOLLOW_1);
            ruleSprite();

            state._fsp--;

             after(grammarAccess.getSpriteRule()); 
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
    // $ANTLR end "entryRuleSprite"


    // $ANTLR start "ruleSprite"
    // InternalKlangParser.g:113:1: ruleSprite : ( ( rule__Sprite__Group__0 ) ) ;
    public final void ruleSprite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:117:2: ( ( ( rule__Sprite__Group__0 ) ) )
            // InternalKlangParser.g:118:2: ( ( rule__Sprite__Group__0 ) )
            {
            // InternalKlangParser.g:118:2: ( ( rule__Sprite__Group__0 ) )
            // InternalKlangParser.g:119:3: ( rule__Sprite__Group__0 )
            {
             before(grammarAccess.getSpriteAccess().getGroup()); 
            // InternalKlangParser.g:120:3: ( rule__Sprite__Group__0 )
            // InternalKlangParser.g:120:4: rule__Sprite__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sprite__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpriteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSprite"


    // $ANTLR start "entryRuleEventHandler"
    // InternalKlangParser.g:129:1: entryRuleEventHandler : ruleEventHandler EOF ;
    public final void entryRuleEventHandler() throws RecognitionException {
        try {
            // InternalKlangParser.g:130:1: ( ruleEventHandler EOF )
            // InternalKlangParser.g:131:1: ruleEventHandler EOF
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
    // InternalKlangParser.g:138:1: ruleEventHandler : ( ( rule__EventHandler__Group__0 ) ) ;
    public final void ruleEventHandler() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:142:2: ( ( ( rule__EventHandler__Group__0 ) ) )
            // InternalKlangParser.g:143:2: ( ( rule__EventHandler__Group__0 ) )
            {
            // InternalKlangParser.g:143:2: ( ( rule__EventHandler__Group__0 ) )
            // InternalKlangParser.g:144:3: ( rule__EventHandler__Group__0 )
            {
             before(grammarAccess.getEventHandlerAccess().getGroup()); 
            // InternalKlangParser.g:145:3: ( rule__EventHandler__Group__0 )
            // InternalKlangParser.g:145:4: rule__EventHandler__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EventHandler__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventHandlerAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleWhileLoop"
    // InternalKlangParser.g:154:1: entryRuleWhileLoop : ruleWhileLoop EOF ;
    public final void entryRuleWhileLoop() throws RecognitionException {
        try {
            // InternalKlangParser.g:155:1: ( ruleWhileLoop EOF )
            // InternalKlangParser.g:156:1: ruleWhileLoop EOF
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
    // InternalKlangParser.g:163:1: ruleWhileLoop : ( ( rule__WhileLoop__Group__0 ) ) ;
    public final void ruleWhileLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:167:2: ( ( ( rule__WhileLoop__Group__0 ) ) )
            // InternalKlangParser.g:168:2: ( ( rule__WhileLoop__Group__0 ) )
            {
            // InternalKlangParser.g:168:2: ( ( rule__WhileLoop__Group__0 ) )
            // InternalKlangParser.g:169:3: ( rule__WhileLoop__Group__0 )
            {
             before(grammarAccess.getWhileLoopAccess().getGroup()); 
            // InternalKlangParser.g:170:3: ( rule__WhileLoop__Group__0 )
            // InternalKlangParser.g:170:4: rule__WhileLoop__Group__0
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
    // InternalKlangParser.g:179:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // InternalKlangParser.g:180:1: ( ruleIf EOF )
            // InternalKlangParser.g:181:1: ruleIf EOF
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
    // InternalKlangParser.g:188:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:192:2: ( ( ( rule__If__Group__0 ) ) )
            // InternalKlangParser.g:193:2: ( ( rule__If__Group__0 ) )
            {
            // InternalKlangParser.g:193:2: ( ( rule__If__Group__0 ) )
            // InternalKlangParser.g:194:3: ( rule__If__Group__0 )
            {
             before(grammarAccess.getIfAccess().getGroup()); 
            // InternalKlangParser.g:195:3: ( rule__If__Group__0 )
            // InternalKlangParser.g:195:4: rule__If__Group__0
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
    // InternalKlangParser.g:204:1: entryRuleForeverLoop : ruleForeverLoop EOF ;
    public final void entryRuleForeverLoop() throws RecognitionException {
        try {
            // InternalKlangParser.g:205:1: ( ruleForeverLoop EOF )
            // InternalKlangParser.g:206:1: ruleForeverLoop EOF
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
    // InternalKlangParser.g:213:1: ruleForeverLoop : ( ( rule__ForeverLoop__Group__0 ) ) ;
    public final void ruleForeverLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:217:2: ( ( ( rule__ForeverLoop__Group__0 ) ) )
            // InternalKlangParser.g:218:2: ( ( rule__ForeverLoop__Group__0 ) )
            {
            // InternalKlangParser.g:218:2: ( ( rule__ForeverLoop__Group__0 ) )
            // InternalKlangParser.g:219:3: ( rule__ForeverLoop__Group__0 )
            {
             before(grammarAccess.getForeverLoopAccess().getGroup()); 
            // InternalKlangParser.g:220:3: ( rule__ForeverLoop__Group__0 )
            // InternalKlangParser.g:220:4: rule__ForeverLoop__Group__0
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


    // $ANTLR start "entryRuleStatement"
    // InternalKlangParser.g:229:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalKlangParser.g:230:1: ( ruleStatement EOF )
            // InternalKlangParser.g:231:1: ruleStatement EOF
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
    // InternalKlangParser.g:238:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:242:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalKlangParser.g:243:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalKlangParser.g:243:2: ( ( rule__Statement__Alternatives ) )
            // InternalKlangParser.g:244:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalKlangParser.g:245:3: ( rule__Statement__Alternatives )
            // InternalKlangParser.g:245:4: rule__Statement__Alternatives
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


    // $ANTLR start "entryRuleSubroutineCall"
    // InternalKlangParser.g:254:1: entryRuleSubroutineCall : ruleSubroutineCall EOF ;
    public final void entryRuleSubroutineCall() throws RecognitionException {
        try {
            // InternalKlangParser.g:255:1: ( ruleSubroutineCall EOF )
            // InternalKlangParser.g:256:1: ruleSubroutineCall EOF
            {
             before(grammarAccess.getSubroutineCallRule()); 
            pushFollow(FOLLOW_1);
            ruleSubroutineCall();

            state._fsp--;

             after(grammarAccess.getSubroutineCallRule()); 
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
    // $ANTLR end "entryRuleSubroutineCall"


    // $ANTLR start "ruleSubroutineCall"
    // InternalKlangParser.g:263:1: ruleSubroutineCall : ( ( rule__SubroutineCall__Group__0 ) ) ;
    public final void ruleSubroutineCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:267:2: ( ( ( rule__SubroutineCall__Group__0 ) ) )
            // InternalKlangParser.g:268:2: ( ( rule__SubroutineCall__Group__0 ) )
            {
            // InternalKlangParser.g:268:2: ( ( rule__SubroutineCall__Group__0 ) )
            // InternalKlangParser.g:269:3: ( rule__SubroutineCall__Group__0 )
            {
             before(grammarAccess.getSubroutineCallAccess().getGroup()); 
            // InternalKlangParser.g:270:3: ( rule__SubroutineCall__Group__0 )
            // InternalKlangParser.g:270:4: rule__SubroutineCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubroutineCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubroutineCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubroutineCall"


    // $ANTLR start "entryRuleControlStatement"
    // InternalKlangParser.g:279:1: entryRuleControlStatement : ruleControlStatement EOF ;
    public final void entryRuleControlStatement() throws RecognitionException {
        try {
            // InternalKlangParser.g:280:1: ( ruleControlStatement EOF )
            // InternalKlangParser.g:281:1: ruleControlStatement EOF
            {
             before(grammarAccess.getControlStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleControlStatement();

            state._fsp--;

             after(grammarAccess.getControlStatementRule()); 
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
    // $ANTLR end "entryRuleControlStatement"


    // $ANTLR start "ruleControlStatement"
    // InternalKlangParser.g:288:1: ruleControlStatement : ( ( rule__ControlStatement__Alternatives ) ) ;
    public final void ruleControlStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:292:2: ( ( ( rule__ControlStatement__Alternatives ) ) )
            // InternalKlangParser.g:293:2: ( ( rule__ControlStatement__Alternatives ) )
            {
            // InternalKlangParser.g:293:2: ( ( rule__ControlStatement__Alternatives ) )
            // InternalKlangParser.g:294:3: ( rule__ControlStatement__Alternatives )
            {
             before(grammarAccess.getControlStatementAccess().getAlternatives()); 
            // InternalKlangParser.g:295:3: ( rule__ControlStatement__Alternatives )
            // InternalKlangParser.g:295:4: rule__ControlStatement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ControlStatement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getControlStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleControlStatement"


    // $ANTLR start "entryRuleYield"
    // InternalKlangParser.g:304:1: entryRuleYield : ruleYield EOF ;
    public final void entryRuleYield() throws RecognitionException {
        try {
            // InternalKlangParser.g:305:1: ( ruleYield EOF )
            // InternalKlangParser.g:306:1: ruleYield EOF
            {
             before(grammarAccess.getYieldRule()); 
            pushFollow(FOLLOW_1);
            ruleYield();

            state._fsp--;

             after(grammarAccess.getYieldRule()); 
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
    // $ANTLR end "entryRuleYield"


    // $ANTLR start "ruleYield"
    // InternalKlangParser.g:313:1: ruleYield : ( ( rule__Yield__Group__0 ) ) ;
    public final void ruleYield() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:317:2: ( ( ( rule__Yield__Group__0 ) ) )
            // InternalKlangParser.g:318:2: ( ( rule__Yield__Group__0 ) )
            {
            // InternalKlangParser.g:318:2: ( ( rule__Yield__Group__0 ) )
            // InternalKlangParser.g:319:3: ( rule__Yield__Group__0 )
            {
             before(grammarAccess.getYieldAccess().getGroup()); 
            // InternalKlangParser.g:320:3: ( rule__Yield__Group__0 )
            // InternalKlangParser.g:320:4: rule__Yield__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Yield__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getYieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleYield"


    // $ANTLR start "entryRuleVariable"
    // InternalKlangParser.g:329:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalKlangParser.g:330:1: ( ruleVariable EOF )
            // InternalKlangParser.g:331:1: ruleVariable EOF
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
    // InternalKlangParser.g:338:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:342:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalKlangParser.g:343:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalKlangParser.g:343:2: ( ( rule__Variable__Group__0 ) )
            // InternalKlangParser.g:344:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalKlangParser.g:345:3: ( rule__Variable__Group__0 )
            // InternalKlangParser.g:345:4: rule__Variable__Group__0
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


    // $ANTLR start "entryRuleAssignment"
    // InternalKlangParser.g:354:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalKlangParser.g:355:1: ( ruleAssignment EOF )
            // InternalKlangParser.g:356:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalKlangParser.g:363:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:367:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalKlangParser.g:368:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalKlangParser.g:368:2: ( ( rule__Assignment__Group__0 ) )
            // InternalKlangParser.g:369:3: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalKlangParser.g:370:3: ( rule__Assignment__Group__0 )
            // InternalKlangParser.g:370:4: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleExpression"
    // InternalKlangParser.g:379:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalKlangParser.g:380:1: ( ruleExpression EOF )
            // InternalKlangParser.g:381:1: ruleExpression EOF
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
    // InternalKlangParser.g:388:1: ruleExpression : ( ruleOr ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:392:2: ( ( ruleOr ) )
            // InternalKlangParser.g:393:2: ( ruleOr )
            {
            // InternalKlangParser.g:393:2: ( ruleOr )
            // InternalKlangParser.g:394:3: ruleOr
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
    // InternalKlangParser.g:404:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalKlangParser.g:405:1: ( ruleOr EOF )
            // InternalKlangParser.g:406:1: ruleOr EOF
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
    // InternalKlangParser.g:413:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:417:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalKlangParser.g:418:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalKlangParser.g:418:2: ( ( rule__Or__Group__0 ) )
            // InternalKlangParser.g:419:3: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // InternalKlangParser.g:420:3: ( rule__Or__Group__0 )
            // InternalKlangParser.g:420:4: rule__Or__Group__0
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
    // InternalKlangParser.g:429:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalKlangParser.g:430:1: ( ruleAnd EOF )
            // InternalKlangParser.g:431:1: ruleAnd EOF
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
    // InternalKlangParser.g:438:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:442:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalKlangParser.g:443:2: ( ( rule__And__Group__0 ) )
            {
            // InternalKlangParser.g:443:2: ( ( rule__And__Group__0 ) )
            // InternalKlangParser.g:444:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalKlangParser.g:445:3: ( rule__And__Group__0 )
            // InternalKlangParser.g:445:4: rule__And__Group__0
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
    // InternalKlangParser.g:454:1: entryRulePlus : rulePlus EOF ;
    public final void entryRulePlus() throws RecognitionException {
        try {
            // InternalKlangParser.g:455:1: ( rulePlus EOF )
            // InternalKlangParser.g:456:1: rulePlus EOF
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
    // InternalKlangParser.g:463:1: rulePlus : ( ( rule__Plus__Group__0 ) ) ;
    public final void rulePlus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:467:2: ( ( ( rule__Plus__Group__0 ) ) )
            // InternalKlangParser.g:468:2: ( ( rule__Plus__Group__0 ) )
            {
            // InternalKlangParser.g:468:2: ( ( rule__Plus__Group__0 ) )
            // InternalKlangParser.g:469:3: ( rule__Plus__Group__0 )
            {
             before(grammarAccess.getPlusAccess().getGroup()); 
            // InternalKlangParser.g:470:3: ( rule__Plus__Group__0 )
            // InternalKlangParser.g:470:4: rule__Plus__Group__0
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
    // InternalKlangParser.g:479:1: entryRuleMinus : ruleMinus EOF ;
    public final void entryRuleMinus() throws RecognitionException {
        try {
            // InternalKlangParser.g:480:1: ( ruleMinus EOF )
            // InternalKlangParser.g:481:1: ruleMinus EOF
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
    // InternalKlangParser.g:488:1: ruleMinus : ( ( rule__Minus__Group__0 ) ) ;
    public final void ruleMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:492:2: ( ( ( rule__Minus__Group__0 ) ) )
            // InternalKlangParser.g:493:2: ( ( rule__Minus__Group__0 ) )
            {
            // InternalKlangParser.g:493:2: ( ( rule__Minus__Group__0 ) )
            // InternalKlangParser.g:494:3: ( rule__Minus__Group__0 )
            {
             before(grammarAccess.getMinusAccess().getGroup()); 
            // InternalKlangParser.g:495:3: ( rule__Minus__Group__0 )
            // InternalKlangParser.g:495:4: rule__Minus__Group__0
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
    // InternalKlangParser.g:504:1: entryRuleMultiply : ruleMultiply EOF ;
    public final void entryRuleMultiply() throws RecognitionException {
        try {
            // InternalKlangParser.g:505:1: ( ruleMultiply EOF )
            // InternalKlangParser.g:506:1: ruleMultiply EOF
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
    // InternalKlangParser.g:513:1: ruleMultiply : ( ( rule__Multiply__Group__0 ) ) ;
    public final void ruleMultiply() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:517:2: ( ( ( rule__Multiply__Group__0 ) ) )
            // InternalKlangParser.g:518:2: ( ( rule__Multiply__Group__0 ) )
            {
            // InternalKlangParser.g:518:2: ( ( rule__Multiply__Group__0 ) )
            // InternalKlangParser.g:519:3: ( rule__Multiply__Group__0 )
            {
             before(grammarAccess.getMultiplyAccess().getGroup()); 
            // InternalKlangParser.g:520:3: ( rule__Multiply__Group__0 )
            // InternalKlangParser.g:520:4: rule__Multiply__Group__0
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
    // InternalKlangParser.g:529:1: entryRuleDivide : ruleDivide EOF ;
    public final void entryRuleDivide() throws RecognitionException {
        try {
            // InternalKlangParser.g:530:1: ( ruleDivide EOF )
            // InternalKlangParser.g:531:1: ruleDivide EOF
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
    // InternalKlangParser.g:538:1: ruleDivide : ( ( rule__Divide__Group__0 ) ) ;
    public final void ruleDivide() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:542:2: ( ( ( rule__Divide__Group__0 ) ) )
            // InternalKlangParser.g:543:2: ( ( rule__Divide__Group__0 ) )
            {
            // InternalKlangParser.g:543:2: ( ( rule__Divide__Group__0 ) )
            // InternalKlangParser.g:544:3: ( rule__Divide__Group__0 )
            {
             before(grammarAccess.getDivideAccess().getGroup()); 
            // InternalKlangParser.g:545:3: ( rule__Divide__Group__0 )
            // InternalKlangParser.g:545:4: rule__Divide__Group__0
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
    // InternalKlangParser.g:554:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalKlangParser.g:555:1: ( ruleComparison EOF )
            // InternalKlangParser.g:556:1: ruleComparison EOF
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
    // InternalKlangParser.g:563:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:567:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalKlangParser.g:568:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalKlangParser.g:568:2: ( ( rule__Comparison__Group__0 ) )
            // InternalKlangParser.g:569:3: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // InternalKlangParser.g:570:3: ( rule__Comparison__Group__0 )
            // InternalKlangParser.g:570:4: rule__Comparison__Group__0
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


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalKlangParser.g:579:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalKlangParser.g:580:1: ( rulePrimaryExpression EOF )
            // InternalKlangParser.g:581:1: rulePrimaryExpression EOF
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
    // InternalKlangParser.g:588:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:592:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalKlangParser.g:593:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalKlangParser.g:593:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalKlangParser.g:594:3: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // InternalKlangParser.g:595:3: ( rule__PrimaryExpression__Alternatives )
            // InternalKlangParser.g:595:4: rule__PrimaryExpression__Alternatives
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


    // $ANTLR start "entryRuleNotOp"
    // InternalKlangParser.g:604:1: entryRuleNotOp : ruleNotOp EOF ;
    public final void entryRuleNotOp() throws RecognitionException {
        try {
            // InternalKlangParser.g:605:1: ( ruleNotOp EOF )
            // InternalKlangParser.g:606:1: ruleNotOp EOF
            {
             before(grammarAccess.getNotOpRule()); 
            pushFollow(FOLLOW_1);
            ruleNotOp();

            state._fsp--;

             after(grammarAccess.getNotOpRule()); 
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
    // $ANTLR end "entryRuleNotOp"


    // $ANTLR start "ruleNotOp"
    // InternalKlangParser.g:613:1: ruleNotOp : ( ( rule__NotOp__Alternatives ) ) ;
    public final void ruleNotOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:617:2: ( ( ( rule__NotOp__Alternatives ) ) )
            // InternalKlangParser.g:618:2: ( ( rule__NotOp__Alternatives ) )
            {
            // InternalKlangParser.g:618:2: ( ( rule__NotOp__Alternatives ) )
            // InternalKlangParser.g:619:3: ( rule__NotOp__Alternatives )
            {
             before(grammarAccess.getNotOpAccess().getAlternatives()); 
            // InternalKlangParser.g:620:3: ( rule__NotOp__Alternatives )
            // InternalKlangParser.g:620:4: rule__NotOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NotOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNotOpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNotOp"


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalKlangParser.g:629:1: entryRuleAtomicExpression : ruleAtomicExpression EOF ;
    public final void entryRuleAtomicExpression() throws RecognitionException {
        try {
            // InternalKlangParser.g:630:1: ( ruleAtomicExpression EOF )
            // InternalKlangParser.g:631:1: ruleAtomicExpression EOF
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
    // InternalKlangParser.g:638:1: ruleAtomicExpression : ( ( rule__AtomicExpression__Alternatives ) ) ;
    public final void ruleAtomicExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:642:2: ( ( ( rule__AtomicExpression__Alternatives ) ) )
            // InternalKlangParser.g:643:2: ( ( rule__AtomicExpression__Alternatives ) )
            {
            // InternalKlangParser.g:643:2: ( ( rule__AtomicExpression__Alternatives ) )
            // InternalKlangParser.g:644:3: ( rule__AtomicExpression__Alternatives )
            {
             before(grammarAccess.getAtomicExpressionAccess().getAlternatives()); 
            // InternalKlangParser.g:645:3: ( rule__AtomicExpression__Alternatives )
            // InternalKlangParser.g:645:4: rule__AtomicExpression__Alternatives
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


    // $ANTLR start "ruleEventType"
    // InternalKlangParser.g:654:1: ruleEventType : ( ( GAME_STARTED ) ) ;
    public final void ruleEventType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:658:1: ( ( ( GAME_STARTED ) ) )
            // InternalKlangParser.g:659:2: ( ( GAME_STARTED ) )
            {
            // InternalKlangParser.g:659:2: ( ( GAME_STARTED ) )
            // InternalKlangParser.g:660:3: ( GAME_STARTED )
            {
             before(grammarAccess.getEventTypeAccess().getGAME_STARTEDEnumLiteralDeclaration()); 
            // InternalKlangParser.g:661:3: ( GAME_STARTED )
            // InternalKlangParser.g:661:4: GAME_STARTED
            {
            match(input,GAME_STARTED,FOLLOW_2); 

            }

             after(grammarAccess.getEventTypeAccess().getGAME_STARTEDEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventType"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalKlangParser.g:669:1: rule__Statement__Alternatives : ( ( ruleControlStatement ) | ( ruleVariable ) | ( ruleAssignment ) | ( ruleSubroutineCall ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:673:1: ( ( ruleControlStatement ) | ( ruleVariable ) | ( ruleAssignment ) | ( ruleSubroutineCall ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case Forever:
            case While:
            case Yield:
            case If:
                {
                alt1=1;
                }
                break;
            case Var:
                {
                alt1=2;
                }
                break;
            case RULE_ID:
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3==LeftParenthesis) ) {
                    alt1=4;
                }
                else if ( (LA1_3==EqualsSign) ) {
                    alt1=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalKlangParser.g:674:2: ( ruleControlStatement )
                    {
                    // InternalKlangParser.g:674:2: ( ruleControlStatement )
                    // InternalKlangParser.g:675:3: ruleControlStatement
                    {
                     before(grammarAccess.getStatementAccess().getControlStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleControlStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getControlStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKlangParser.g:680:2: ( ruleVariable )
                    {
                    // InternalKlangParser.g:680:2: ( ruleVariable )
                    // InternalKlangParser.g:681:3: ruleVariable
                    {
                     before(grammarAccess.getStatementAccess().getVariableParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getVariableParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKlangParser.g:686:2: ( ruleAssignment )
                    {
                    // InternalKlangParser.g:686:2: ( ruleAssignment )
                    // InternalKlangParser.g:687:3: ruleAssignment
                    {
                     before(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAssignment();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalKlangParser.g:692:2: ( ruleSubroutineCall )
                    {
                    // InternalKlangParser.g:692:2: ( ruleSubroutineCall )
                    // InternalKlangParser.g:693:3: ruleSubroutineCall
                    {
                     before(grammarAccess.getStatementAccess().getSubroutineCallParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSubroutineCall();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSubroutineCallParserRuleCall_3()); 

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


    // $ANTLR start "rule__ControlStatement__Alternatives"
    // InternalKlangParser.g:702:1: rule__ControlStatement__Alternatives : ( ( ruleForeverLoop ) | ( ruleWhileLoop ) | ( ruleYield ) | ( ruleIf ) );
    public final void rule__ControlStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:706:1: ( ( ruleForeverLoop ) | ( ruleWhileLoop ) | ( ruleYield ) | ( ruleIf ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case Forever:
                {
                alt2=1;
                }
                break;
            case While:
                {
                alt2=2;
                }
                break;
            case Yield:
                {
                alt2=3;
                }
                break;
            case If:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalKlangParser.g:707:2: ( ruleForeverLoop )
                    {
                    // InternalKlangParser.g:707:2: ( ruleForeverLoop )
                    // InternalKlangParser.g:708:3: ruleForeverLoop
                    {
                     before(grammarAccess.getControlStatementAccess().getForeverLoopParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleForeverLoop();

                    state._fsp--;

                     after(grammarAccess.getControlStatementAccess().getForeverLoopParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKlangParser.g:713:2: ( ruleWhileLoop )
                    {
                    // InternalKlangParser.g:713:2: ( ruleWhileLoop )
                    // InternalKlangParser.g:714:3: ruleWhileLoop
                    {
                     before(grammarAccess.getControlStatementAccess().getWhileLoopParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWhileLoop();

                    state._fsp--;

                     after(grammarAccess.getControlStatementAccess().getWhileLoopParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKlangParser.g:719:2: ( ruleYield )
                    {
                    // InternalKlangParser.g:719:2: ( ruleYield )
                    // InternalKlangParser.g:720:3: ruleYield
                    {
                     before(grammarAccess.getControlStatementAccess().getYieldParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleYield();

                    state._fsp--;

                     after(grammarAccess.getControlStatementAccess().getYieldParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalKlangParser.g:725:2: ( ruleIf )
                    {
                    // InternalKlangParser.g:725:2: ( ruleIf )
                    // InternalKlangParser.g:726:3: ruleIf
                    {
                     before(grammarAccess.getControlStatementAccess().getIfParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleIf();

                    state._fsp--;

                     after(grammarAccess.getControlStatementAccess().getIfParserRuleCall_3()); 

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
    // $ANTLR end "rule__ControlStatement__Alternatives"


    // $ANTLR start "rule__Comparison__Alternatives_1_0"
    // InternalKlangParser.g:735:1: rule__Comparison__Alternatives_1_0 : ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) | ( ( rule__Comparison__Group_1_0_2__0 ) ) );
    public final void rule__Comparison__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:739:1: ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) | ( ( rule__Comparison__Group_1_0_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case LessThanSign:
                {
                alt3=1;
                }
                break;
            case EqualsSign:
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
                    // InternalKlangParser.g:740:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    {
                    // InternalKlangParser.g:740:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    // InternalKlangParser.g:741:3: ( rule__Comparison__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0_0()); 
                    // InternalKlangParser.g:742:3: ( rule__Comparison__Group_1_0_0__0 )
                    // InternalKlangParser.g:742:4: rule__Comparison__Group_1_0_0__0
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
                    // InternalKlangParser.g:746:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    {
                    // InternalKlangParser.g:746:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    // InternalKlangParser.g:747:3: ( rule__Comparison__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0_1()); 
                    // InternalKlangParser.g:748:3: ( rule__Comparison__Group_1_0_1__0 )
                    // InternalKlangParser.g:748:4: rule__Comparison__Group_1_0_1__0
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
                    // InternalKlangParser.g:752:2: ( ( rule__Comparison__Group_1_0_2__0 ) )
                    {
                    // InternalKlangParser.g:752:2: ( ( rule__Comparison__Group_1_0_2__0 ) )
                    // InternalKlangParser.g:753:3: ( rule__Comparison__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0_2()); 
                    // InternalKlangParser.g:754:3: ( rule__Comparison__Group_1_0_2__0 )
                    // InternalKlangParser.g:754:4: rule__Comparison__Group_1_0_2__0
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
    // InternalKlangParser.g:762:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ruleAtomicExpression ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:766:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ruleAtomicExpression ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt4=1;
                }
                break;
            case Not:
            case ExclamationMark:
                {
                alt4=2;
                }
                break;
            case False:
            case True:
            case RULE_NUMERIC:
            case RULE_ID:
            case RULE_STRING:
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
                    // InternalKlangParser.g:767:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // InternalKlangParser.g:767:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // InternalKlangParser.g:768:3: ( rule__PrimaryExpression__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    // InternalKlangParser.g:769:3: ( rule__PrimaryExpression__Group_0__0 )
                    // InternalKlangParser.g:769:4: rule__PrimaryExpression__Group_0__0
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
                    // InternalKlangParser.g:773:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    {
                    // InternalKlangParser.g:773:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    // InternalKlangParser.g:774:3: ( rule__PrimaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
                    // InternalKlangParser.g:775:3: ( rule__PrimaryExpression__Group_1__0 )
                    // InternalKlangParser.g:775:4: rule__PrimaryExpression__Group_1__0
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
                    // InternalKlangParser.g:779:2: ( ruleAtomicExpression )
                    {
                    // InternalKlangParser.g:779:2: ( ruleAtomicExpression )
                    // InternalKlangParser.g:780:3: ruleAtomicExpression
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getAtomicExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAtomicExpression();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getAtomicExpressionParserRuleCall_2()); 

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


    // $ANTLR start "rule__NotOp__Alternatives"
    // InternalKlangParser.g:789:1: rule__NotOp__Alternatives : ( ( ExclamationMark ) | ( Not ) );
    public final void rule__NotOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:793:1: ( ( ExclamationMark ) | ( Not ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ExclamationMark) ) {
                alt5=1;
            }
            else if ( (LA5_0==Not) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalKlangParser.g:794:2: ( ExclamationMark )
                    {
                    // InternalKlangParser.g:794:2: ( ExclamationMark )
                    // InternalKlangParser.g:795:3: ExclamationMark
                    {
                     before(grammarAccess.getNotOpAccess().getExclamationMarkKeyword_0()); 
                    match(input,ExclamationMark,FOLLOW_2); 
                     after(grammarAccess.getNotOpAccess().getExclamationMarkKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKlangParser.g:800:2: ( Not )
                    {
                    // InternalKlangParser.g:800:2: ( Not )
                    // InternalKlangParser.g:801:3: Not
                    {
                     before(grammarAccess.getNotOpAccess().getNotKeyword_1()); 
                    match(input,Not,FOLLOW_2); 
                     after(grammarAccess.getNotOpAccess().getNotKeyword_1()); 

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
    // $ANTLR end "rule__NotOp__Alternatives"


    // $ANTLR start "rule__AtomicExpression__Alternatives"
    // InternalKlangParser.g:810:1: rule__AtomicExpression__Alternatives : ( ( ( rule__AtomicExpression__Group_0__0 ) ) | ( ( rule__AtomicExpression__Group_1__0 ) ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:814:1: ( ( ( rule__AtomicExpression__Group_0__0 ) ) | ( ( rule__AtomicExpression__Group_1__0 ) ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case False:
            case True:
                {
                alt6=1;
                }
                break;
            case RULE_NUMERIC:
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
                    // InternalKlangParser.g:815:2: ( ( rule__AtomicExpression__Group_0__0 ) )
                    {
                    // InternalKlangParser.g:815:2: ( ( rule__AtomicExpression__Group_0__0 ) )
                    // InternalKlangParser.g:816:3: ( rule__AtomicExpression__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getGroup_0()); 
                    // InternalKlangParser.g:817:3: ( rule__AtomicExpression__Group_0__0 )
                    // InternalKlangParser.g:817:4: rule__AtomicExpression__Group_0__0
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
                    // InternalKlangParser.g:821:2: ( ( rule__AtomicExpression__Group_1__0 ) )
                    {
                    // InternalKlangParser.g:821:2: ( ( rule__AtomicExpression__Group_1__0 ) )
                    // InternalKlangParser.g:822:3: ( rule__AtomicExpression__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getGroup_1()); 
                    // InternalKlangParser.g:823:3: ( rule__AtomicExpression__Group_1__0 )
                    // InternalKlangParser.g:823:4: rule__AtomicExpression__Group_1__0
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
                    // InternalKlangParser.g:827:2: ( ( rule__AtomicExpression__Group_2__0 ) )
                    {
                    // InternalKlangParser.g:827:2: ( ( rule__AtomicExpression__Group_2__0 ) )
                    // InternalKlangParser.g:828:3: ( rule__AtomicExpression__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getGroup_2()); 
                    // InternalKlangParser.g:829:3: ( rule__AtomicExpression__Group_2__0 )
                    // InternalKlangParser.g:829:4: rule__AtomicExpression__Group_2__0
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
                    // InternalKlangParser.g:833:2: ( ( rule__AtomicExpression__Group_3__0 ) )
                    {
                    // InternalKlangParser.g:833:2: ( ( rule__AtomicExpression__Group_3__0 ) )
                    // InternalKlangParser.g:834:3: ( rule__AtomicExpression__Group_3__0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getGroup_3()); 
                    // InternalKlangParser.g:835:3: ( rule__AtomicExpression__Group_3__0 )
                    // InternalKlangParser.g:835:4: rule__AtomicExpression__Group_3__0
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
    // InternalKlangParser.g:843:1: rule__AtomicExpression__Alternatives_0_1 : ( ( ( rule__AtomicExpression__ValueAssignment_0_1_0 ) ) | ( False ) );
    public final void rule__AtomicExpression__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:847:1: ( ( ( rule__AtomicExpression__ValueAssignment_0_1_0 ) ) | ( False ) )
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
                    // InternalKlangParser.g:848:2: ( ( rule__AtomicExpression__ValueAssignment_0_1_0 ) )
                    {
                    // InternalKlangParser.g:848:2: ( ( rule__AtomicExpression__ValueAssignment_0_1_0 ) )
                    // InternalKlangParser.g:849:3: ( rule__AtomicExpression__ValueAssignment_0_1_0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getValueAssignment_0_1_0()); 
                    // InternalKlangParser.g:850:3: ( rule__AtomicExpression__ValueAssignment_0_1_0 )
                    // InternalKlangParser.g:850:4: rule__AtomicExpression__ValueAssignment_0_1_0
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
                    // InternalKlangParser.g:854:2: ( False )
                    {
                    // InternalKlangParser.g:854:2: ( False )
                    // InternalKlangParser.g:855:3: False
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
    // InternalKlangParser.g:864:1: rule__Game__Group__0 : rule__Game__Group__0__Impl rule__Game__Group__1 ;
    public final void rule__Game__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:868:1: ( rule__Game__Group__0__Impl rule__Game__Group__1 )
            // InternalKlangParser.g:869:2: rule__Game__Group__0__Impl rule__Game__Group__1
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
    // InternalKlangParser.g:876:1: rule__Game__Group__0__Impl : ( () ) ;
    public final void rule__Game__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:880:1: ( ( () ) )
            // InternalKlangParser.g:881:1: ( () )
            {
            // InternalKlangParser.g:881:1: ( () )
            // InternalKlangParser.g:882:2: ()
            {
             before(grammarAccess.getGameAccess().getGameAction_0()); 
            // InternalKlangParser.g:883:2: ()
            // InternalKlangParser.g:883:3: 
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
    // InternalKlangParser.g:891:1: rule__Game__Group__1 : rule__Game__Group__1__Impl rule__Game__Group__2 ;
    public final void rule__Game__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:895:1: ( rule__Game__Group__1__Impl rule__Game__Group__2 )
            // InternalKlangParser.g:896:2: rule__Game__Group__1__Impl rule__Game__Group__2
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
    // InternalKlangParser.g:903:1: rule__Game__Group__1__Impl : ( ( rule__Game__VariablesAssignment_1 )* ) ;
    public final void rule__Game__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:907:1: ( ( ( rule__Game__VariablesAssignment_1 )* ) )
            // InternalKlangParser.g:908:1: ( ( rule__Game__VariablesAssignment_1 )* )
            {
            // InternalKlangParser.g:908:1: ( ( rule__Game__VariablesAssignment_1 )* )
            // InternalKlangParser.g:909:2: ( rule__Game__VariablesAssignment_1 )*
            {
             before(grammarAccess.getGameAccess().getVariablesAssignment_1()); 
            // InternalKlangParser.g:910:2: ( rule__Game__VariablesAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Var) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKlangParser.g:910:3: rule__Game__VariablesAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Game__VariablesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getGameAccess().getVariablesAssignment_1()); 

            }


            }

        }
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
    // InternalKlangParser.g:918:1: rule__Game__Group__2 : rule__Game__Group__2__Impl ;
    public final void rule__Game__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:922:1: ( rule__Game__Group__2__Impl )
            // InternalKlangParser.g:923:2: rule__Game__Group__2__Impl
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
    // InternalKlangParser.g:929:1: rule__Game__Group__2__Impl : ( ( rule__Game__ActorDefsAssignment_2 )* ) ;
    public final void rule__Game__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:933:1: ( ( ( rule__Game__ActorDefsAssignment_2 )* ) )
            // InternalKlangParser.g:934:1: ( ( rule__Game__ActorDefsAssignment_2 )* )
            {
            // InternalKlangParser.g:934:1: ( ( rule__Game__ActorDefsAssignment_2 )* )
            // InternalKlangParser.g:935:2: ( rule__Game__ActorDefsAssignment_2 )*
            {
             before(grammarAccess.getGameAccess().getActorDefsAssignment_2()); 
            // InternalKlangParser.g:936:2: ( rule__Game__ActorDefsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Sprite) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalKlangParser.g:936:3: rule__Game__ActorDefsAssignment_2
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


    // $ANTLR start "rule__Sprite__Group__0"
    // InternalKlangParser.g:945:1: rule__Sprite__Group__0 : rule__Sprite__Group__0__Impl rule__Sprite__Group__1 ;
    public final void rule__Sprite__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:949:1: ( rule__Sprite__Group__0__Impl rule__Sprite__Group__1 )
            // InternalKlangParser.g:950:2: rule__Sprite__Group__0__Impl rule__Sprite__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Sprite__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sprite__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sprite__Group__0"


    // $ANTLR start "rule__Sprite__Group__0__Impl"
    // InternalKlangParser.g:957:1: rule__Sprite__Group__0__Impl : ( () ) ;
    public final void rule__Sprite__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:961:1: ( ( () ) )
            // InternalKlangParser.g:962:1: ( () )
            {
            // InternalKlangParser.g:962:1: ( () )
            // InternalKlangParser.g:963:2: ()
            {
             before(grammarAccess.getSpriteAccess().getSpriteAction_0()); 
            // InternalKlangParser.g:964:2: ()
            // InternalKlangParser.g:964:3: 
            {
            }

             after(grammarAccess.getSpriteAccess().getSpriteAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sprite__Group__0__Impl"


    // $ANTLR start "rule__Sprite__Group__1"
    // InternalKlangParser.g:972:1: rule__Sprite__Group__1 : rule__Sprite__Group__1__Impl rule__Sprite__Group__2 ;
    public final void rule__Sprite__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:976:1: ( rule__Sprite__Group__1__Impl rule__Sprite__Group__2 )
            // InternalKlangParser.g:977:2: rule__Sprite__Group__1__Impl rule__Sprite__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Sprite__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sprite__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sprite__Group__1"


    // $ANTLR start "rule__Sprite__Group__1__Impl"
    // InternalKlangParser.g:984:1: rule__Sprite__Group__1__Impl : ( Sprite ) ;
    public final void rule__Sprite__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:988:1: ( ( Sprite ) )
            // InternalKlangParser.g:989:1: ( Sprite )
            {
            // InternalKlangParser.g:989:1: ( Sprite )
            // InternalKlangParser.g:990:2: Sprite
            {
             before(grammarAccess.getSpriteAccess().getSpriteKeyword_1()); 
            match(input,Sprite,FOLLOW_2); 
             after(grammarAccess.getSpriteAccess().getSpriteKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sprite__Group__1__Impl"


    // $ANTLR start "rule__Sprite__Group__2"
    // InternalKlangParser.g:999:1: rule__Sprite__Group__2 : rule__Sprite__Group__2__Impl rule__Sprite__Group__3 ;
    public final void rule__Sprite__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1003:1: ( rule__Sprite__Group__2__Impl rule__Sprite__Group__3 )
            // InternalKlangParser.g:1004:2: rule__Sprite__Group__2__Impl rule__Sprite__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Sprite__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sprite__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sprite__Group__2"


    // $ANTLR start "rule__Sprite__Group__2__Impl"
    // InternalKlangParser.g:1011:1: rule__Sprite__Group__2__Impl : ( ( rule__Sprite__NameAssignment_2 ) ) ;
    public final void rule__Sprite__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1015:1: ( ( ( rule__Sprite__NameAssignment_2 ) ) )
            // InternalKlangParser.g:1016:1: ( ( rule__Sprite__NameAssignment_2 ) )
            {
            // InternalKlangParser.g:1016:1: ( ( rule__Sprite__NameAssignment_2 ) )
            // InternalKlangParser.g:1017:2: ( rule__Sprite__NameAssignment_2 )
            {
             before(grammarAccess.getSpriteAccess().getNameAssignment_2()); 
            // InternalKlangParser.g:1018:2: ( rule__Sprite__NameAssignment_2 )
            // InternalKlangParser.g:1018:3: rule__Sprite__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Sprite__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSpriteAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sprite__Group__2__Impl"


    // $ANTLR start "rule__Sprite__Group__3"
    // InternalKlangParser.g:1026:1: rule__Sprite__Group__3 : rule__Sprite__Group__3__Impl rule__Sprite__Group__4 ;
    public final void rule__Sprite__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1030:1: ( rule__Sprite__Group__3__Impl rule__Sprite__Group__4 )
            // InternalKlangParser.g:1031:2: rule__Sprite__Group__3__Impl rule__Sprite__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Sprite__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sprite__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sprite__Group__3"


    // $ANTLR start "rule__Sprite__Group__3__Impl"
    // InternalKlangParser.g:1038:1: rule__Sprite__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__Sprite__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1042:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:1043:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:1043:1: ( RULE_BEGIN )
            // InternalKlangParser.g:1044:2: RULE_BEGIN
            {
             before(grammarAccess.getSpriteAccess().getBEGINTerminalRuleCall_3()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getSpriteAccess().getBEGINTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sprite__Group__3__Impl"


    // $ANTLR start "rule__Sprite__Group__4"
    // InternalKlangParser.g:1053:1: rule__Sprite__Group__4 : rule__Sprite__Group__4__Impl rule__Sprite__Group__5 ;
    public final void rule__Sprite__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1057:1: ( rule__Sprite__Group__4__Impl rule__Sprite__Group__5 )
            // InternalKlangParser.g:1058:2: rule__Sprite__Group__4__Impl rule__Sprite__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Sprite__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sprite__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sprite__Group__4"


    // $ANTLR start "rule__Sprite__Group__4__Impl"
    // InternalKlangParser.g:1065:1: rule__Sprite__Group__4__Impl : ( ( rule__Sprite__VariablesAssignment_4 )* ) ;
    public final void rule__Sprite__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1069:1: ( ( ( rule__Sprite__VariablesAssignment_4 )* ) )
            // InternalKlangParser.g:1070:1: ( ( rule__Sprite__VariablesAssignment_4 )* )
            {
            // InternalKlangParser.g:1070:1: ( ( rule__Sprite__VariablesAssignment_4 )* )
            // InternalKlangParser.g:1071:2: ( rule__Sprite__VariablesAssignment_4 )*
            {
             before(grammarAccess.getSpriteAccess().getVariablesAssignment_4()); 
            // InternalKlangParser.g:1072:2: ( rule__Sprite__VariablesAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Var) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalKlangParser.g:1072:3: rule__Sprite__VariablesAssignment_4
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Sprite__VariablesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSpriteAccess().getVariablesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sprite__Group__4__Impl"


    // $ANTLR start "rule__Sprite__Group__5"
    // InternalKlangParser.g:1080:1: rule__Sprite__Group__5 : rule__Sprite__Group__5__Impl rule__Sprite__Group__6 ;
    public final void rule__Sprite__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1084:1: ( rule__Sprite__Group__5__Impl rule__Sprite__Group__6 )
            // InternalKlangParser.g:1085:2: rule__Sprite__Group__5__Impl rule__Sprite__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Sprite__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sprite__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sprite__Group__5"


    // $ANTLR start "rule__Sprite__Group__5__Impl"
    // InternalKlangParser.g:1092:1: rule__Sprite__Group__5__Impl : ( ( rule__Sprite__EventHandlersAssignment_5 )* ) ;
    public final void rule__Sprite__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1096:1: ( ( ( rule__Sprite__EventHandlersAssignment_5 )* ) )
            // InternalKlangParser.g:1097:1: ( ( rule__Sprite__EventHandlersAssignment_5 )* )
            {
            // InternalKlangParser.g:1097:1: ( ( rule__Sprite__EventHandlersAssignment_5 )* )
            // InternalKlangParser.g:1098:2: ( rule__Sprite__EventHandlersAssignment_5 )*
            {
             before(grammarAccess.getSpriteAccess().getEventHandlersAssignment_5()); 
            // InternalKlangParser.g:1099:2: ( rule__Sprite__EventHandlersAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==When) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalKlangParser.g:1099:3: rule__Sprite__EventHandlersAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Sprite__EventHandlersAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getSpriteAccess().getEventHandlersAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sprite__Group__5__Impl"


    // $ANTLR start "rule__Sprite__Group__6"
    // InternalKlangParser.g:1107:1: rule__Sprite__Group__6 : rule__Sprite__Group__6__Impl ;
    public final void rule__Sprite__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1111:1: ( rule__Sprite__Group__6__Impl )
            // InternalKlangParser.g:1112:2: rule__Sprite__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sprite__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sprite__Group__6"


    // $ANTLR start "rule__Sprite__Group__6__Impl"
    // InternalKlangParser.g:1118:1: rule__Sprite__Group__6__Impl : ( RULE_END ) ;
    public final void rule__Sprite__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1122:1: ( ( RULE_END ) )
            // InternalKlangParser.g:1123:1: ( RULE_END )
            {
            // InternalKlangParser.g:1123:1: ( RULE_END )
            // InternalKlangParser.g:1124:2: RULE_END
            {
             before(grammarAccess.getSpriteAccess().getENDTerminalRuleCall_6()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getSpriteAccess().getENDTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sprite__Group__6__Impl"


    // $ANTLR start "rule__EventHandler__Group__0"
    // InternalKlangParser.g:1134:1: rule__EventHandler__Group__0 : rule__EventHandler__Group__0__Impl rule__EventHandler__Group__1 ;
    public final void rule__EventHandler__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1138:1: ( rule__EventHandler__Group__0__Impl rule__EventHandler__Group__1 )
            // InternalKlangParser.g:1139:2: rule__EventHandler__Group__0__Impl rule__EventHandler__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__EventHandler__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventHandler__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventHandler__Group__0"


    // $ANTLR start "rule__EventHandler__Group__0__Impl"
    // InternalKlangParser.g:1146:1: rule__EventHandler__Group__0__Impl : ( When ) ;
    public final void rule__EventHandler__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1150:1: ( ( When ) )
            // InternalKlangParser.g:1151:1: ( When )
            {
            // InternalKlangParser.g:1151:1: ( When )
            // InternalKlangParser.g:1152:2: When
            {
             before(grammarAccess.getEventHandlerAccess().getWhenKeyword_0()); 
            match(input,When,FOLLOW_2); 
             after(grammarAccess.getEventHandlerAccess().getWhenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventHandler__Group__0__Impl"


    // $ANTLR start "rule__EventHandler__Group__1"
    // InternalKlangParser.g:1161:1: rule__EventHandler__Group__1 : rule__EventHandler__Group__1__Impl rule__EventHandler__Group__2 ;
    public final void rule__EventHandler__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1165:1: ( rule__EventHandler__Group__1__Impl rule__EventHandler__Group__2 )
            // InternalKlangParser.g:1166:2: rule__EventHandler__Group__1__Impl rule__EventHandler__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__EventHandler__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventHandler__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventHandler__Group__1"


    // $ANTLR start "rule__EventHandler__Group__1__Impl"
    // InternalKlangParser.g:1173:1: rule__EventHandler__Group__1__Impl : ( ( rule__EventHandler__EventTypeAssignment_1 ) ) ;
    public final void rule__EventHandler__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1177:1: ( ( ( rule__EventHandler__EventTypeAssignment_1 ) ) )
            // InternalKlangParser.g:1178:1: ( ( rule__EventHandler__EventTypeAssignment_1 ) )
            {
            // InternalKlangParser.g:1178:1: ( ( rule__EventHandler__EventTypeAssignment_1 ) )
            // InternalKlangParser.g:1179:2: ( rule__EventHandler__EventTypeAssignment_1 )
            {
             before(grammarAccess.getEventHandlerAccess().getEventTypeAssignment_1()); 
            // InternalKlangParser.g:1180:2: ( rule__EventHandler__EventTypeAssignment_1 )
            // InternalKlangParser.g:1180:3: rule__EventHandler__EventTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EventHandler__EventTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEventHandlerAccess().getEventTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventHandler__Group__1__Impl"


    // $ANTLR start "rule__EventHandler__Group__2"
    // InternalKlangParser.g:1188:1: rule__EventHandler__Group__2 : rule__EventHandler__Group__2__Impl rule__EventHandler__Group__3 ;
    public final void rule__EventHandler__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1192:1: ( rule__EventHandler__Group__2__Impl rule__EventHandler__Group__3 )
            // InternalKlangParser.g:1193:2: rule__EventHandler__Group__2__Impl rule__EventHandler__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__EventHandler__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventHandler__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventHandler__Group__2"


    // $ANTLR start "rule__EventHandler__Group__2__Impl"
    // InternalKlangParser.g:1200:1: rule__EventHandler__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__EventHandler__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1204:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:1205:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:1205:1: ( RULE_BEGIN )
            // InternalKlangParser.g:1206:2: RULE_BEGIN
            {
             before(grammarAccess.getEventHandlerAccess().getBEGINTerminalRuleCall_2()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getEventHandlerAccess().getBEGINTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventHandler__Group__2__Impl"


    // $ANTLR start "rule__EventHandler__Group__3"
    // InternalKlangParser.g:1215:1: rule__EventHandler__Group__3 : rule__EventHandler__Group__3__Impl rule__EventHandler__Group__4 ;
    public final void rule__EventHandler__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1219:1: ( rule__EventHandler__Group__3__Impl rule__EventHandler__Group__4 )
            // InternalKlangParser.g:1220:2: rule__EventHandler__Group__3__Impl rule__EventHandler__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__EventHandler__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventHandler__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventHandler__Group__3"


    // $ANTLR start "rule__EventHandler__Group__3__Impl"
    // InternalKlangParser.g:1227:1: rule__EventHandler__Group__3__Impl : ( ( rule__EventHandler__StatementsAssignment_3 )* ) ;
    public final void rule__EventHandler__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1231:1: ( ( ( rule__EventHandler__StatementsAssignment_3 )* ) )
            // InternalKlangParser.g:1232:1: ( ( rule__EventHandler__StatementsAssignment_3 )* )
            {
            // InternalKlangParser.g:1232:1: ( ( rule__EventHandler__StatementsAssignment_3 )* )
            // InternalKlangParser.g:1233:2: ( rule__EventHandler__StatementsAssignment_3 )*
            {
             before(grammarAccess.getEventHandlerAccess().getStatementsAssignment_3()); 
            // InternalKlangParser.g:1234:2: ( rule__EventHandler__StatementsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Forever||(LA12_0>=While && LA12_0<=Yield)||(LA12_0>=Var && LA12_0<=If)||LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalKlangParser.g:1234:3: rule__EventHandler__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__EventHandler__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getEventHandlerAccess().getStatementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventHandler__Group__3__Impl"


    // $ANTLR start "rule__EventHandler__Group__4"
    // InternalKlangParser.g:1242:1: rule__EventHandler__Group__4 : rule__EventHandler__Group__4__Impl ;
    public final void rule__EventHandler__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1246:1: ( rule__EventHandler__Group__4__Impl )
            // InternalKlangParser.g:1247:2: rule__EventHandler__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventHandler__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventHandler__Group__4"


    // $ANTLR start "rule__EventHandler__Group__4__Impl"
    // InternalKlangParser.g:1253:1: rule__EventHandler__Group__4__Impl : ( RULE_END ) ;
    public final void rule__EventHandler__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1257:1: ( ( RULE_END ) )
            // InternalKlangParser.g:1258:1: ( RULE_END )
            {
            // InternalKlangParser.g:1258:1: ( RULE_END )
            // InternalKlangParser.g:1259:2: RULE_END
            {
             before(grammarAccess.getEventHandlerAccess().getENDTerminalRuleCall_4()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getEventHandlerAccess().getENDTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventHandler__Group__4__Impl"


    // $ANTLR start "rule__WhileLoop__Group__0"
    // InternalKlangParser.g:1269:1: rule__WhileLoop__Group__0 : rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 ;
    public final void rule__WhileLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1273:1: ( rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 )
            // InternalKlangParser.g:1274:2: rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalKlangParser.g:1281:1: rule__WhileLoop__Group__0__Impl : ( () ) ;
    public final void rule__WhileLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1285:1: ( ( () ) )
            // InternalKlangParser.g:1286:1: ( () )
            {
            // InternalKlangParser.g:1286:1: ( () )
            // InternalKlangParser.g:1287:2: ()
            {
             before(grammarAccess.getWhileLoopAccess().getWhileLoopAction_0()); 
            // InternalKlangParser.g:1288:2: ()
            // InternalKlangParser.g:1288:3: 
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
    // InternalKlangParser.g:1296:1: rule__WhileLoop__Group__1 : rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 ;
    public final void rule__WhileLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1300:1: ( rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 )
            // InternalKlangParser.g:1301:2: rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalKlangParser.g:1308:1: rule__WhileLoop__Group__1__Impl : ( While ) ;
    public final void rule__WhileLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1312:1: ( ( While ) )
            // InternalKlangParser.g:1313:1: ( While )
            {
            // InternalKlangParser.g:1313:1: ( While )
            // InternalKlangParser.g:1314:2: While
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
    // InternalKlangParser.g:1323:1: rule__WhileLoop__Group__2 : rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 ;
    public final void rule__WhileLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1327:1: ( rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 )
            // InternalKlangParser.g:1328:2: rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalKlangParser.g:1335:1: rule__WhileLoop__Group__2__Impl : ( ( rule__WhileLoop__PredicateAssignment_2 ) ) ;
    public final void rule__WhileLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1339:1: ( ( ( rule__WhileLoop__PredicateAssignment_2 ) ) )
            // InternalKlangParser.g:1340:1: ( ( rule__WhileLoop__PredicateAssignment_2 ) )
            {
            // InternalKlangParser.g:1340:1: ( ( rule__WhileLoop__PredicateAssignment_2 ) )
            // InternalKlangParser.g:1341:2: ( rule__WhileLoop__PredicateAssignment_2 )
            {
             before(grammarAccess.getWhileLoopAccess().getPredicateAssignment_2()); 
            // InternalKlangParser.g:1342:2: ( rule__WhileLoop__PredicateAssignment_2 )
            // InternalKlangParser.g:1342:3: rule__WhileLoop__PredicateAssignment_2
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
    // InternalKlangParser.g:1350:1: rule__WhileLoop__Group__3 : rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 ;
    public final void rule__WhileLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1354:1: ( rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 )
            // InternalKlangParser.g:1355:2: rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalKlangParser.g:1362:1: rule__WhileLoop__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__WhileLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1366:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:1367:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:1367:1: ( RULE_BEGIN )
            // InternalKlangParser.g:1368:2: RULE_BEGIN
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
    // InternalKlangParser.g:1377:1: rule__WhileLoop__Group__4 : rule__WhileLoop__Group__4__Impl rule__WhileLoop__Group__5 ;
    public final void rule__WhileLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1381:1: ( rule__WhileLoop__Group__4__Impl rule__WhileLoop__Group__5 )
            // InternalKlangParser.g:1382:2: rule__WhileLoop__Group__4__Impl rule__WhileLoop__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalKlangParser.g:1389:1: rule__WhileLoop__Group__4__Impl : ( ( rule__WhileLoop__LoopBlockAssignment_4 )* ) ;
    public final void rule__WhileLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1393:1: ( ( ( rule__WhileLoop__LoopBlockAssignment_4 )* ) )
            // InternalKlangParser.g:1394:1: ( ( rule__WhileLoop__LoopBlockAssignment_4 )* )
            {
            // InternalKlangParser.g:1394:1: ( ( rule__WhileLoop__LoopBlockAssignment_4 )* )
            // InternalKlangParser.g:1395:2: ( rule__WhileLoop__LoopBlockAssignment_4 )*
            {
             before(grammarAccess.getWhileLoopAccess().getLoopBlockAssignment_4()); 
            // InternalKlangParser.g:1396:2: ( rule__WhileLoop__LoopBlockAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Forever||(LA13_0>=While && LA13_0<=Yield)||(LA13_0>=Var && LA13_0<=If)||LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalKlangParser.g:1396:3: rule__WhileLoop__LoopBlockAssignment_4
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__WhileLoop__LoopBlockAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalKlangParser.g:1404:1: rule__WhileLoop__Group__5 : rule__WhileLoop__Group__5__Impl ;
    public final void rule__WhileLoop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1408:1: ( rule__WhileLoop__Group__5__Impl )
            // InternalKlangParser.g:1409:2: rule__WhileLoop__Group__5__Impl
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
    // InternalKlangParser.g:1415:1: rule__WhileLoop__Group__5__Impl : ( RULE_END ) ;
    public final void rule__WhileLoop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1419:1: ( ( RULE_END ) )
            // InternalKlangParser.g:1420:1: ( RULE_END )
            {
            // InternalKlangParser.g:1420:1: ( RULE_END )
            // InternalKlangParser.g:1421:2: RULE_END
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
    // InternalKlangParser.g:1431:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1435:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalKlangParser.g:1436:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalKlangParser.g:1443:1: rule__If__Group__0__Impl : ( () ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1447:1: ( ( () ) )
            // InternalKlangParser.g:1448:1: ( () )
            {
            // InternalKlangParser.g:1448:1: ( () )
            // InternalKlangParser.g:1449:2: ()
            {
             before(grammarAccess.getIfAccess().getIfAction_0()); 
            // InternalKlangParser.g:1450:2: ()
            // InternalKlangParser.g:1450:3: 
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
    // InternalKlangParser.g:1458:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1462:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalKlangParser.g:1463:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalKlangParser.g:1470:1: rule__If__Group__1__Impl : ( If ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1474:1: ( ( If ) )
            // InternalKlangParser.g:1475:1: ( If )
            {
            // InternalKlangParser.g:1475:1: ( If )
            // InternalKlangParser.g:1476:2: If
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
    // InternalKlangParser.g:1485:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1489:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // InternalKlangParser.g:1490:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalKlangParser.g:1497:1: rule__If__Group__2__Impl : ( ( rule__If__PredicateAssignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1501:1: ( ( ( rule__If__PredicateAssignment_2 ) ) )
            // InternalKlangParser.g:1502:1: ( ( rule__If__PredicateAssignment_2 ) )
            {
            // InternalKlangParser.g:1502:1: ( ( rule__If__PredicateAssignment_2 ) )
            // InternalKlangParser.g:1503:2: ( rule__If__PredicateAssignment_2 )
            {
             before(grammarAccess.getIfAccess().getPredicateAssignment_2()); 
            // InternalKlangParser.g:1504:2: ( rule__If__PredicateAssignment_2 )
            // InternalKlangParser.g:1504:3: rule__If__PredicateAssignment_2
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
    // InternalKlangParser.g:1512:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1516:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // InternalKlangParser.g:1517:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalKlangParser.g:1524:1: rule__If__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1528:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:1529:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:1529:1: ( RULE_BEGIN )
            // InternalKlangParser.g:1530:2: RULE_BEGIN
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
    // InternalKlangParser.g:1539:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1543:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // InternalKlangParser.g:1544:2: rule__If__Group__4__Impl rule__If__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalKlangParser.g:1551:1: rule__If__Group__4__Impl : ( ( rule__If__IfBlockAssignment_4 )* ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1555:1: ( ( ( rule__If__IfBlockAssignment_4 )* ) )
            // InternalKlangParser.g:1556:1: ( ( rule__If__IfBlockAssignment_4 )* )
            {
            // InternalKlangParser.g:1556:1: ( ( rule__If__IfBlockAssignment_4 )* )
            // InternalKlangParser.g:1557:2: ( rule__If__IfBlockAssignment_4 )*
            {
             before(grammarAccess.getIfAccess().getIfBlockAssignment_4()); 
            // InternalKlangParser.g:1558:2: ( rule__If__IfBlockAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Forever||(LA14_0>=While && LA14_0<=Yield)||(LA14_0>=Var && LA14_0<=If)||LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalKlangParser.g:1558:3: rule__If__IfBlockAssignment_4
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__If__IfBlockAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalKlangParser.g:1566:1: rule__If__Group__5 : rule__If__Group__5__Impl ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1570:1: ( rule__If__Group__5__Impl )
            // InternalKlangParser.g:1571:2: rule__If__Group__5__Impl
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
    // InternalKlangParser.g:1577:1: rule__If__Group__5__Impl : ( RULE_END ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1581:1: ( ( RULE_END ) )
            // InternalKlangParser.g:1582:1: ( RULE_END )
            {
            // InternalKlangParser.g:1582:1: ( RULE_END )
            // InternalKlangParser.g:1583:2: RULE_END
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
    // InternalKlangParser.g:1593:1: rule__ForeverLoop__Group__0 : rule__ForeverLoop__Group__0__Impl rule__ForeverLoop__Group__1 ;
    public final void rule__ForeverLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1597:1: ( rule__ForeverLoop__Group__0__Impl rule__ForeverLoop__Group__1 )
            // InternalKlangParser.g:1598:2: rule__ForeverLoop__Group__0__Impl rule__ForeverLoop__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalKlangParser.g:1605:1: rule__ForeverLoop__Group__0__Impl : ( () ) ;
    public final void rule__ForeverLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1609:1: ( ( () ) )
            // InternalKlangParser.g:1610:1: ( () )
            {
            // InternalKlangParser.g:1610:1: ( () )
            // InternalKlangParser.g:1611:2: ()
            {
             before(grammarAccess.getForeverLoopAccess().getForeverLoopAction_0()); 
            // InternalKlangParser.g:1612:2: ()
            // InternalKlangParser.g:1612:3: 
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
    // InternalKlangParser.g:1620:1: rule__ForeverLoop__Group__1 : rule__ForeverLoop__Group__1__Impl rule__ForeverLoop__Group__2 ;
    public final void rule__ForeverLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1624:1: ( rule__ForeverLoop__Group__1__Impl rule__ForeverLoop__Group__2 )
            // InternalKlangParser.g:1625:2: rule__ForeverLoop__Group__1__Impl rule__ForeverLoop__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalKlangParser.g:1632:1: rule__ForeverLoop__Group__1__Impl : ( Forever ) ;
    public final void rule__ForeverLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1636:1: ( ( Forever ) )
            // InternalKlangParser.g:1637:1: ( Forever )
            {
            // InternalKlangParser.g:1637:1: ( Forever )
            // InternalKlangParser.g:1638:2: Forever
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
    // InternalKlangParser.g:1647:1: rule__ForeverLoop__Group__2 : rule__ForeverLoop__Group__2__Impl rule__ForeverLoop__Group__3 ;
    public final void rule__ForeverLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1651:1: ( rule__ForeverLoop__Group__2__Impl rule__ForeverLoop__Group__3 )
            // InternalKlangParser.g:1652:2: rule__ForeverLoop__Group__2__Impl rule__ForeverLoop__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalKlangParser.g:1659:1: rule__ForeverLoop__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__ForeverLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1663:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:1664:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:1664:1: ( RULE_BEGIN )
            // InternalKlangParser.g:1665:2: RULE_BEGIN
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
    // InternalKlangParser.g:1674:1: rule__ForeverLoop__Group__3 : rule__ForeverLoop__Group__3__Impl rule__ForeverLoop__Group__4 ;
    public final void rule__ForeverLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1678:1: ( rule__ForeverLoop__Group__3__Impl rule__ForeverLoop__Group__4 )
            // InternalKlangParser.g:1679:2: rule__ForeverLoop__Group__3__Impl rule__ForeverLoop__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalKlangParser.g:1686:1: rule__ForeverLoop__Group__3__Impl : ( ( rule__ForeverLoop__LoopStatementsAssignment_3 )* ) ;
    public final void rule__ForeverLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1690:1: ( ( ( rule__ForeverLoop__LoopStatementsAssignment_3 )* ) )
            // InternalKlangParser.g:1691:1: ( ( rule__ForeverLoop__LoopStatementsAssignment_3 )* )
            {
            // InternalKlangParser.g:1691:1: ( ( rule__ForeverLoop__LoopStatementsAssignment_3 )* )
            // InternalKlangParser.g:1692:2: ( rule__ForeverLoop__LoopStatementsAssignment_3 )*
            {
             before(grammarAccess.getForeverLoopAccess().getLoopStatementsAssignment_3()); 
            // InternalKlangParser.g:1693:2: ( rule__ForeverLoop__LoopStatementsAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Forever||(LA15_0>=While && LA15_0<=Yield)||(LA15_0>=Var && LA15_0<=If)||LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalKlangParser.g:1693:3: rule__ForeverLoop__LoopStatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ForeverLoop__LoopStatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalKlangParser.g:1701:1: rule__ForeverLoop__Group__4 : rule__ForeverLoop__Group__4__Impl ;
    public final void rule__ForeverLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1705:1: ( rule__ForeverLoop__Group__4__Impl )
            // InternalKlangParser.g:1706:2: rule__ForeverLoop__Group__4__Impl
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
    // InternalKlangParser.g:1712:1: rule__ForeverLoop__Group__4__Impl : ( RULE_END ) ;
    public final void rule__ForeverLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1716:1: ( ( RULE_END ) )
            // InternalKlangParser.g:1717:1: ( RULE_END )
            {
            // InternalKlangParser.g:1717:1: ( RULE_END )
            // InternalKlangParser.g:1718:2: RULE_END
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


    // $ANTLR start "rule__SubroutineCall__Group__0"
    // InternalKlangParser.g:1728:1: rule__SubroutineCall__Group__0 : rule__SubroutineCall__Group__0__Impl rule__SubroutineCall__Group__1 ;
    public final void rule__SubroutineCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1732:1: ( rule__SubroutineCall__Group__0__Impl rule__SubroutineCall__Group__1 )
            // InternalKlangParser.g:1733:2: rule__SubroutineCall__Group__0__Impl rule__SubroutineCall__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__SubroutineCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubroutineCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubroutineCall__Group__0"


    // $ANTLR start "rule__SubroutineCall__Group__0__Impl"
    // InternalKlangParser.g:1740:1: rule__SubroutineCall__Group__0__Impl : ( ( rule__SubroutineCall__NameAssignment_0 ) ) ;
    public final void rule__SubroutineCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1744:1: ( ( ( rule__SubroutineCall__NameAssignment_0 ) ) )
            // InternalKlangParser.g:1745:1: ( ( rule__SubroutineCall__NameAssignment_0 ) )
            {
            // InternalKlangParser.g:1745:1: ( ( rule__SubroutineCall__NameAssignment_0 ) )
            // InternalKlangParser.g:1746:2: ( rule__SubroutineCall__NameAssignment_0 )
            {
             before(grammarAccess.getSubroutineCallAccess().getNameAssignment_0()); 
            // InternalKlangParser.g:1747:2: ( rule__SubroutineCall__NameAssignment_0 )
            // InternalKlangParser.g:1747:3: rule__SubroutineCall__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SubroutineCall__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSubroutineCallAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubroutineCall__Group__0__Impl"


    // $ANTLR start "rule__SubroutineCall__Group__1"
    // InternalKlangParser.g:1755:1: rule__SubroutineCall__Group__1 : rule__SubroutineCall__Group__1__Impl rule__SubroutineCall__Group__2 ;
    public final void rule__SubroutineCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1759:1: ( rule__SubroutineCall__Group__1__Impl rule__SubroutineCall__Group__2 )
            // InternalKlangParser.g:1760:2: rule__SubroutineCall__Group__1__Impl rule__SubroutineCall__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__SubroutineCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubroutineCall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubroutineCall__Group__1"


    // $ANTLR start "rule__SubroutineCall__Group__1__Impl"
    // InternalKlangParser.g:1767:1: rule__SubroutineCall__Group__1__Impl : ( LeftParenthesis ) ;
    public final void rule__SubroutineCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1771:1: ( ( LeftParenthesis ) )
            // InternalKlangParser.g:1772:1: ( LeftParenthesis )
            {
            // InternalKlangParser.g:1772:1: ( LeftParenthesis )
            // InternalKlangParser.g:1773:2: LeftParenthesis
            {
             before(grammarAccess.getSubroutineCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getSubroutineCallAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubroutineCall__Group__1__Impl"


    // $ANTLR start "rule__SubroutineCall__Group__2"
    // InternalKlangParser.g:1782:1: rule__SubroutineCall__Group__2 : rule__SubroutineCall__Group__2__Impl rule__SubroutineCall__Group__3 ;
    public final void rule__SubroutineCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1786:1: ( rule__SubroutineCall__Group__2__Impl rule__SubroutineCall__Group__3 )
            // InternalKlangParser.g:1787:2: rule__SubroutineCall__Group__2__Impl rule__SubroutineCall__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__SubroutineCall__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubroutineCall__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubroutineCall__Group__2"


    // $ANTLR start "rule__SubroutineCall__Group__2__Impl"
    // InternalKlangParser.g:1794:1: rule__SubroutineCall__Group__2__Impl : ( ( rule__SubroutineCall__ParametersAssignment_2 )? ) ;
    public final void rule__SubroutineCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1798:1: ( ( ( rule__SubroutineCall__ParametersAssignment_2 )? ) )
            // InternalKlangParser.g:1799:1: ( ( rule__SubroutineCall__ParametersAssignment_2 )? )
            {
            // InternalKlangParser.g:1799:1: ( ( rule__SubroutineCall__ParametersAssignment_2 )? )
            // InternalKlangParser.g:1800:2: ( rule__SubroutineCall__ParametersAssignment_2 )?
            {
             before(grammarAccess.getSubroutineCallAccess().getParametersAssignment_2()); 
            // InternalKlangParser.g:1801:2: ( rule__SubroutineCall__ParametersAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==False||LA16_0==True||LA16_0==Not||(LA16_0>=ExclamationMark && LA16_0<=LeftParenthesis)||(LA16_0>=RULE_NUMERIC && LA16_0<=RULE_ID)||LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalKlangParser.g:1801:3: rule__SubroutineCall__ParametersAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubroutineCall__ParametersAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubroutineCallAccess().getParametersAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubroutineCall__Group__2__Impl"


    // $ANTLR start "rule__SubroutineCall__Group__3"
    // InternalKlangParser.g:1809:1: rule__SubroutineCall__Group__3 : rule__SubroutineCall__Group__3__Impl rule__SubroutineCall__Group__4 ;
    public final void rule__SubroutineCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1813:1: ( rule__SubroutineCall__Group__3__Impl rule__SubroutineCall__Group__4 )
            // InternalKlangParser.g:1814:2: rule__SubroutineCall__Group__3__Impl rule__SubroutineCall__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__SubroutineCall__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubroutineCall__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubroutineCall__Group__3"


    // $ANTLR start "rule__SubroutineCall__Group__3__Impl"
    // InternalKlangParser.g:1821:1: rule__SubroutineCall__Group__3__Impl : ( ( rule__SubroutineCall__Group_3__0 )* ) ;
    public final void rule__SubroutineCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1825:1: ( ( ( rule__SubroutineCall__Group_3__0 )* ) )
            // InternalKlangParser.g:1826:1: ( ( rule__SubroutineCall__Group_3__0 )* )
            {
            // InternalKlangParser.g:1826:1: ( ( rule__SubroutineCall__Group_3__0 )* )
            // InternalKlangParser.g:1827:2: ( rule__SubroutineCall__Group_3__0 )*
            {
             before(grammarAccess.getSubroutineCallAccess().getGroup_3()); 
            // InternalKlangParser.g:1828:2: ( rule__SubroutineCall__Group_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Comma) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalKlangParser.g:1828:3: rule__SubroutineCall__Group_3__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__SubroutineCall__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getSubroutineCallAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubroutineCall__Group__3__Impl"


    // $ANTLR start "rule__SubroutineCall__Group__4"
    // InternalKlangParser.g:1836:1: rule__SubroutineCall__Group__4 : rule__SubroutineCall__Group__4__Impl ;
    public final void rule__SubroutineCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1840:1: ( rule__SubroutineCall__Group__4__Impl )
            // InternalKlangParser.g:1841:2: rule__SubroutineCall__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubroutineCall__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubroutineCall__Group__4"


    // $ANTLR start "rule__SubroutineCall__Group__4__Impl"
    // InternalKlangParser.g:1847:1: rule__SubroutineCall__Group__4__Impl : ( RightParenthesis ) ;
    public final void rule__SubroutineCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1851:1: ( ( RightParenthesis ) )
            // InternalKlangParser.g:1852:1: ( RightParenthesis )
            {
            // InternalKlangParser.g:1852:1: ( RightParenthesis )
            // InternalKlangParser.g:1853:2: RightParenthesis
            {
             before(grammarAccess.getSubroutineCallAccess().getRightParenthesisKeyword_4()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getSubroutineCallAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubroutineCall__Group__4__Impl"


    // $ANTLR start "rule__SubroutineCall__Group_3__0"
    // InternalKlangParser.g:1863:1: rule__SubroutineCall__Group_3__0 : rule__SubroutineCall__Group_3__0__Impl rule__SubroutineCall__Group_3__1 ;
    public final void rule__SubroutineCall__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1867:1: ( rule__SubroutineCall__Group_3__0__Impl rule__SubroutineCall__Group_3__1 )
            // InternalKlangParser.g:1868:2: rule__SubroutineCall__Group_3__0__Impl rule__SubroutineCall__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__SubroutineCall__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubroutineCall__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubroutineCall__Group_3__0"


    // $ANTLR start "rule__SubroutineCall__Group_3__0__Impl"
    // InternalKlangParser.g:1875:1: rule__SubroutineCall__Group_3__0__Impl : ( Comma ) ;
    public final void rule__SubroutineCall__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1879:1: ( ( Comma ) )
            // InternalKlangParser.g:1880:1: ( Comma )
            {
            // InternalKlangParser.g:1880:1: ( Comma )
            // InternalKlangParser.g:1881:2: Comma
            {
             before(grammarAccess.getSubroutineCallAccess().getCommaKeyword_3_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getSubroutineCallAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubroutineCall__Group_3__0__Impl"


    // $ANTLR start "rule__SubroutineCall__Group_3__1"
    // InternalKlangParser.g:1890:1: rule__SubroutineCall__Group_3__1 : rule__SubroutineCall__Group_3__1__Impl ;
    public final void rule__SubroutineCall__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1894:1: ( rule__SubroutineCall__Group_3__1__Impl )
            // InternalKlangParser.g:1895:2: rule__SubroutineCall__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubroutineCall__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubroutineCall__Group_3__1"


    // $ANTLR start "rule__SubroutineCall__Group_3__1__Impl"
    // InternalKlangParser.g:1901:1: rule__SubroutineCall__Group_3__1__Impl : ( ( rule__SubroutineCall__ParametersAssignment_3_1 ) ) ;
    public final void rule__SubroutineCall__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1905:1: ( ( ( rule__SubroutineCall__ParametersAssignment_3_1 ) ) )
            // InternalKlangParser.g:1906:1: ( ( rule__SubroutineCall__ParametersAssignment_3_1 ) )
            {
            // InternalKlangParser.g:1906:1: ( ( rule__SubroutineCall__ParametersAssignment_3_1 ) )
            // InternalKlangParser.g:1907:2: ( rule__SubroutineCall__ParametersAssignment_3_1 )
            {
             before(grammarAccess.getSubroutineCallAccess().getParametersAssignment_3_1()); 
            // InternalKlangParser.g:1908:2: ( rule__SubroutineCall__ParametersAssignment_3_1 )
            // InternalKlangParser.g:1908:3: rule__SubroutineCall__ParametersAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SubroutineCall__ParametersAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSubroutineCallAccess().getParametersAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubroutineCall__Group_3__1__Impl"


    // $ANTLR start "rule__Yield__Group__0"
    // InternalKlangParser.g:1917:1: rule__Yield__Group__0 : rule__Yield__Group__0__Impl rule__Yield__Group__1 ;
    public final void rule__Yield__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1921:1: ( rule__Yield__Group__0__Impl rule__Yield__Group__1 )
            // InternalKlangParser.g:1922:2: rule__Yield__Group__0__Impl rule__Yield__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Yield__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Yield__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Yield__Group__0"


    // $ANTLR start "rule__Yield__Group__0__Impl"
    // InternalKlangParser.g:1929:1: rule__Yield__Group__0__Impl : ( () ) ;
    public final void rule__Yield__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1933:1: ( ( () ) )
            // InternalKlangParser.g:1934:1: ( () )
            {
            // InternalKlangParser.g:1934:1: ( () )
            // InternalKlangParser.g:1935:2: ()
            {
             before(grammarAccess.getYieldAccess().getYieldAction_0()); 
            // InternalKlangParser.g:1936:2: ()
            // InternalKlangParser.g:1936:3: 
            {
            }

             after(grammarAccess.getYieldAccess().getYieldAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Yield__Group__0__Impl"


    // $ANTLR start "rule__Yield__Group__1"
    // InternalKlangParser.g:1944:1: rule__Yield__Group__1 : rule__Yield__Group__1__Impl ;
    public final void rule__Yield__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1948:1: ( rule__Yield__Group__1__Impl )
            // InternalKlangParser.g:1949:2: rule__Yield__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Yield__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Yield__Group__1"


    // $ANTLR start "rule__Yield__Group__1__Impl"
    // InternalKlangParser.g:1955:1: rule__Yield__Group__1__Impl : ( Yield ) ;
    public final void rule__Yield__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1959:1: ( ( Yield ) )
            // InternalKlangParser.g:1960:1: ( Yield )
            {
            // InternalKlangParser.g:1960:1: ( Yield )
            // InternalKlangParser.g:1961:2: Yield
            {
             before(grammarAccess.getYieldAccess().getYieldKeyword_1()); 
            match(input,Yield,FOLLOW_2); 
             after(grammarAccess.getYieldAccess().getYieldKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Yield__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalKlangParser.g:1971:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1975:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalKlangParser.g:1976:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalKlangParser.g:1983:1: rule__Variable__Group__0__Impl : ( Var ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1987:1: ( ( Var ) )
            // InternalKlangParser.g:1988:1: ( Var )
            {
            // InternalKlangParser.g:1988:1: ( Var )
            // InternalKlangParser.g:1989:2: Var
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
    // InternalKlangParser.g:1998:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2002:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalKlangParser.g:2003:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalKlangParser.g:2010:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2014:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalKlangParser.g:2015:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalKlangParser.g:2015:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalKlangParser.g:2016:2: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalKlangParser.g:2017:2: ( rule__Variable__NameAssignment_1 )
            // InternalKlangParser.g:2017:3: rule__Variable__NameAssignment_1
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
    // InternalKlangParser.g:2025:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2029:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // InternalKlangParser.g:2030:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalKlangParser.g:2037:1: rule__Variable__Group__2__Impl : ( EqualsSign ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2041:1: ( ( EqualsSign ) )
            // InternalKlangParser.g:2042:1: ( EqualsSign )
            {
            // InternalKlangParser.g:2042:1: ( EqualsSign )
            // InternalKlangParser.g:2043:2: EqualsSign
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
    // InternalKlangParser.g:2052:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2056:1: ( rule__Variable__Group__3__Impl )
            // InternalKlangParser.g:2057:2: rule__Variable__Group__3__Impl
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
    // InternalKlangParser.g:2063:1: rule__Variable__Group__3__Impl : ( ( rule__Variable__ExpressionAssignment_3 ) ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2067:1: ( ( ( rule__Variable__ExpressionAssignment_3 ) ) )
            // InternalKlangParser.g:2068:1: ( ( rule__Variable__ExpressionAssignment_3 ) )
            {
            // InternalKlangParser.g:2068:1: ( ( rule__Variable__ExpressionAssignment_3 ) )
            // InternalKlangParser.g:2069:2: ( rule__Variable__ExpressionAssignment_3 )
            {
             before(grammarAccess.getVariableAccess().getExpressionAssignment_3()); 
            // InternalKlangParser.g:2070:2: ( rule__Variable__ExpressionAssignment_3 )
            // InternalKlangParser.g:2070:3: rule__Variable__ExpressionAssignment_3
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


    // $ANTLR start "rule__Assignment__Group__0"
    // InternalKlangParser.g:2079:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2083:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalKlangParser.g:2084:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // InternalKlangParser.g:2091:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__VariableAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2095:1: ( ( ( rule__Assignment__VariableAssignment_0 ) ) )
            // InternalKlangParser.g:2096:1: ( ( rule__Assignment__VariableAssignment_0 ) )
            {
            // InternalKlangParser.g:2096:1: ( ( rule__Assignment__VariableAssignment_0 ) )
            // InternalKlangParser.g:2097:2: ( rule__Assignment__VariableAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getVariableAssignment_0()); 
            // InternalKlangParser.g:2098:2: ( rule__Assignment__VariableAssignment_0 )
            // InternalKlangParser.g:2098:3: rule__Assignment__VariableAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__VariableAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getVariableAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // InternalKlangParser.g:2106:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2110:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalKlangParser.g:2111:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Assignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // InternalKlangParser.g:2118:1: rule__Assignment__Group__1__Impl : ( EqualsSign ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2122:1: ( ( EqualsSign ) )
            // InternalKlangParser.g:2123:1: ( EqualsSign )
            {
            // InternalKlangParser.g:2123:1: ( EqualsSign )
            // InternalKlangParser.g:2124:2: EqualsSign
            {
             before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,EqualsSign,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // InternalKlangParser.g:2133:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2137:1: ( rule__Assignment__Group__2__Impl )
            // InternalKlangParser.g:2138:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // InternalKlangParser.g:2144:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ExpressionAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2148:1: ( ( ( rule__Assignment__ExpressionAssignment_2 ) ) )
            // InternalKlangParser.g:2149:1: ( ( rule__Assignment__ExpressionAssignment_2 ) )
            {
            // InternalKlangParser.g:2149:1: ( ( rule__Assignment__ExpressionAssignment_2 ) )
            // InternalKlangParser.g:2150:2: ( rule__Assignment__ExpressionAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getExpressionAssignment_2()); 
            // InternalKlangParser.g:2151:2: ( rule__Assignment__ExpressionAssignment_2 )
            // InternalKlangParser.g:2151:3: rule__Assignment__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // InternalKlangParser.g:2160:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2164:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalKlangParser.g:2165:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalKlangParser.g:2172:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2176:1: ( ( ruleAnd ) )
            // InternalKlangParser.g:2177:1: ( ruleAnd )
            {
            // InternalKlangParser.g:2177:1: ( ruleAnd )
            // InternalKlangParser.g:2178:2: ruleAnd
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
    // InternalKlangParser.g:2187:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2191:1: ( rule__Or__Group__1__Impl )
            // InternalKlangParser.g:2192:2: rule__Or__Group__1__Impl
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
    // InternalKlangParser.g:2198:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2202:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalKlangParser.g:2203:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalKlangParser.g:2203:1: ( ( rule__Or__Group_1__0 )* )
            // InternalKlangParser.g:2204:2: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // InternalKlangParser.g:2205:2: ( rule__Or__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==Or) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalKlangParser.g:2205:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Or__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalKlangParser.g:2214:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2218:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalKlangParser.g:2219:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalKlangParser.g:2226:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2230:1: ( ( () ) )
            // InternalKlangParser.g:2231:1: ( () )
            {
            // InternalKlangParser.g:2231:1: ( () )
            // InternalKlangParser.g:2232:2: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // InternalKlangParser.g:2233:2: ()
            // InternalKlangParser.g:2233:3: 
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
    // InternalKlangParser.g:2241:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2245:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalKlangParser.g:2246:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalKlangParser.g:2253:1: rule__Or__Group_1__1__Impl : ( Or ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2257:1: ( ( Or ) )
            // InternalKlangParser.g:2258:1: ( Or )
            {
            // InternalKlangParser.g:2258:1: ( Or )
            // InternalKlangParser.g:2259:2: Or
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
    // InternalKlangParser.g:2268:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2272:1: ( rule__Or__Group_1__2__Impl )
            // InternalKlangParser.g:2273:2: rule__Or__Group_1__2__Impl
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
    // InternalKlangParser.g:2279:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2283:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:2284:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:2284:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalKlangParser.g:2285:2: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:2286:2: ( rule__Or__RightAssignment_1_2 )
            // InternalKlangParser.g:2286:3: rule__Or__RightAssignment_1_2
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
    // InternalKlangParser.g:2295:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2299:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalKlangParser.g:2300:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalKlangParser.g:2307:1: rule__And__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2311:1: ( ( ruleComparison ) )
            // InternalKlangParser.g:2312:1: ( ruleComparison )
            {
            // InternalKlangParser.g:2312:1: ( ruleComparison )
            // InternalKlangParser.g:2313:2: ruleComparison
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
    // InternalKlangParser.g:2322:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2326:1: ( rule__And__Group__1__Impl )
            // InternalKlangParser.g:2327:2: rule__And__Group__1__Impl
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
    // InternalKlangParser.g:2333:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2337:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalKlangParser.g:2338:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalKlangParser.g:2338:1: ( ( rule__And__Group_1__0 )* )
            // InternalKlangParser.g:2339:2: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // InternalKlangParser.g:2340:2: ( rule__And__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==And) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalKlangParser.g:2340:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__And__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalKlangParser.g:2349:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2353:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalKlangParser.g:2354:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalKlangParser.g:2361:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2365:1: ( ( () ) )
            // InternalKlangParser.g:2366:1: ( () )
            {
            // InternalKlangParser.g:2366:1: ( () )
            // InternalKlangParser.g:2367:2: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // InternalKlangParser.g:2368:2: ()
            // InternalKlangParser.g:2368:3: 
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
    // InternalKlangParser.g:2376:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2380:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalKlangParser.g:2381:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalKlangParser.g:2388:1: rule__And__Group_1__1__Impl : ( And ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2392:1: ( ( And ) )
            // InternalKlangParser.g:2393:1: ( And )
            {
            // InternalKlangParser.g:2393:1: ( And )
            // InternalKlangParser.g:2394:2: And
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
    // InternalKlangParser.g:2403:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2407:1: ( rule__And__Group_1__2__Impl )
            // InternalKlangParser.g:2408:2: rule__And__Group_1__2__Impl
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
    // InternalKlangParser.g:2414:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2418:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:2419:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:2419:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalKlangParser.g:2420:2: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:2421:2: ( rule__And__RightAssignment_1_2 )
            // InternalKlangParser.g:2421:3: rule__And__RightAssignment_1_2
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
    // InternalKlangParser.g:2430:1: rule__Plus__Group__0 : rule__Plus__Group__0__Impl rule__Plus__Group__1 ;
    public final void rule__Plus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2434:1: ( rule__Plus__Group__0__Impl rule__Plus__Group__1 )
            // InternalKlangParser.g:2435:2: rule__Plus__Group__0__Impl rule__Plus__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalKlangParser.g:2442:1: rule__Plus__Group__0__Impl : ( ruleMinus ) ;
    public final void rule__Plus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2446:1: ( ( ruleMinus ) )
            // InternalKlangParser.g:2447:1: ( ruleMinus )
            {
            // InternalKlangParser.g:2447:1: ( ruleMinus )
            // InternalKlangParser.g:2448:2: ruleMinus
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
    // InternalKlangParser.g:2457:1: rule__Plus__Group__1 : rule__Plus__Group__1__Impl ;
    public final void rule__Plus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2461:1: ( rule__Plus__Group__1__Impl )
            // InternalKlangParser.g:2462:2: rule__Plus__Group__1__Impl
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
    // InternalKlangParser.g:2468:1: rule__Plus__Group__1__Impl : ( ( rule__Plus__Group_1__0 )* ) ;
    public final void rule__Plus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2472:1: ( ( ( rule__Plus__Group_1__0 )* ) )
            // InternalKlangParser.g:2473:1: ( ( rule__Plus__Group_1__0 )* )
            {
            // InternalKlangParser.g:2473:1: ( ( rule__Plus__Group_1__0 )* )
            // InternalKlangParser.g:2474:2: ( rule__Plus__Group_1__0 )*
            {
             before(grammarAccess.getPlusAccess().getGroup_1()); 
            // InternalKlangParser.g:2475:2: ( rule__Plus__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==PlusSign) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalKlangParser.g:2475:3: rule__Plus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Plus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalKlangParser.g:2484:1: rule__Plus__Group_1__0 : rule__Plus__Group_1__0__Impl rule__Plus__Group_1__1 ;
    public final void rule__Plus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2488:1: ( rule__Plus__Group_1__0__Impl rule__Plus__Group_1__1 )
            // InternalKlangParser.g:2489:2: rule__Plus__Group_1__0__Impl rule__Plus__Group_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalKlangParser.g:2496:1: rule__Plus__Group_1__0__Impl : ( () ) ;
    public final void rule__Plus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2500:1: ( ( () ) )
            // InternalKlangParser.g:2501:1: ( () )
            {
            // InternalKlangParser.g:2501:1: ( () )
            // InternalKlangParser.g:2502:2: ()
            {
             before(grammarAccess.getPlusAccess().getPlusLeftAction_1_0()); 
            // InternalKlangParser.g:2503:2: ()
            // InternalKlangParser.g:2503:3: 
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
    // InternalKlangParser.g:2511:1: rule__Plus__Group_1__1 : rule__Plus__Group_1__1__Impl rule__Plus__Group_1__2 ;
    public final void rule__Plus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2515:1: ( rule__Plus__Group_1__1__Impl rule__Plus__Group_1__2 )
            // InternalKlangParser.g:2516:2: rule__Plus__Group_1__1__Impl rule__Plus__Group_1__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalKlangParser.g:2523:1: rule__Plus__Group_1__1__Impl : ( PlusSign ) ;
    public final void rule__Plus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2527:1: ( ( PlusSign ) )
            // InternalKlangParser.g:2528:1: ( PlusSign )
            {
            // InternalKlangParser.g:2528:1: ( PlusSign )
            // InternalKlangParser.g:2529:2: PlusSign
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
    // InternalKlangParser.g:2538:1: rule__Plus__Group_1__2 : rule__Plus__Group_1__2__Impl ;
    public final void rule__Plus__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2542:1: ( rule__Plus__Group_1__2__Impl )
            // InternalKlangParser.g:2543:2: rule__Plus__Group_1__2__Impl
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
    // InternalKlangParser.g:2549:1: rule__Plus__Group_1__2__Impl : ( ( rule__Plus__RightAssignment_1_2 ) ) ;
    public final void rule__Plus__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2553:1: ( ( ( rule__Plus__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:2554:1: ( ( rule__Plus__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:2554:1: ( ( rule__Plus__RightAssignment_1_2 ) )
            // InternalKlangParser.g:2555:2: ( rule__Plus__RightAssignment_1_2 )
            {
             before(grammarAccess.getPlusAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:2556:2: ( rule__Plus__RightAssignment_1_2 )
            // InternalKlangParser.g:2556:3: rule__Plus__RightAssignment_1_2
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
    // InternalKlangParser.g:2565:1: rule__Minus__Group__0 : rule__Minus__Group__0__Impl rule__Minus__Group__1 ;
    public final void rule__Minus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2569:1: ( rule__Minus__Group__0__Impl rule__Minus__Group__1 )
            // InternalKlangParser.g:2570:2: rule__Minus__Group__0__Impl rule__Minus__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalKlangParser.g:2577:1: rule__Minus__Group__0__Impl : ( ruleMultiply ) ;
    public final void rule__Minus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2581:1: ( ( ruleMultiply ) )
            // InternalKlangParser.g:2582:1: ( ruleMultiply )
            {
            // InternalKlangParser.g:2582:1: ( ruleMultiply )
            // InternalKlangParser.g:2583:2: ruleMultiply
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
    // InternalKlangParser.g:2592:1: rule__Minus__Group__1 : rule__Minus__Group__1__Impl ;
    public final void rule__Minus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2596:1: ( rule__Minus__Group__1__Impl )
            // InternalKlangParser.g:2597:2: rule__Minus__Group__1__Impl
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
    // InternalKlangParser.g:2603:1: rule__Minus__Group__1__Impl : ( ( rule__Minus__Group_1__0 )* ) ;
    public final void rule__Minus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2607:1: ( ( ( rule__Minus__Group_1__0 )* ) )
            // InternalKlangParser.g:2608:1: ( ( rule__Minus__Group_1__0 )* )
            {
            // InternalKlangParser.g:2608:1: ( ( rule__Minus__Group_1__0 )* )
            // InternalKlangParser.g:2609:2: ( rule__Minus__Group_1__0 )*
            {
             before(grammarAccess.getMinusAccess().getGroup_1()); 
            // InternalKlangParser.g:2610:2: ( rule__Minus__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==HyphenMinus) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalKlangParser.g:2610:3: rule__Minus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Minus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalKlangParser.g:2619:1: rule__Minus__Group_1__0 : rule__Minus__Group_1__0__Impl rule__Minus__Group_1__1 ;
    public final void rule__Minus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2623:1: ( rule__Minus__Group_1__0__Impl rule__Minus__Group_1__1 )
            // InternalKlangParser.g:2624:2: rule__Minus__Group_1__0__Impl rule__Minus__Group_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalKlangParser.g:2631:1: rule__Minus__Group_1__0__Impl : ( () ) ;
    public final void rule__Minus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2635:1: ( ( () ) )
            // InternalKlangParser.g:2636:1: ( () )
            {
            // InternalKlangParser.g:2636:1: ( () )
            // InternalKlangParser.g:2637:2: ()
            {
             before(grammarAccess.getMinusAccess().getMinusLeftAction_1_0()); 
            // InternalKlangParser.g:2638:2: ()
            // InternalKlangParser.g:2638:3: 
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
    // InternalKlangParser.g:2646:1: rule__Minus__Group_1__1 : rule__Minus__Group_1__1__Impl rule__Minus__Group_1__2 ;
    public final void rule__Minus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2650:1: ( rule__Minus__Group_1__1__Impl rule__Minus__Group_1__2 )
            // InternalKlangParser.g:2651:2: rule__Minus__Group_1__1__Impl rule__Minus__Group_1__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalKlangParser.g:2658:1: rule__Minus__Group_1__1__Impl : ( HyphenMinus ) ;
    public final void rule__Minus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2662:1: ( ( HyphenMinus ) )
            // InternalKlangParser.g:2663:1: ( HyphenMinus )
            {
            // InternalKlangParser.g:2663:1: ( HyphenMinus )
            // InternalKlangParser.g:2664:2: HyphenMinus
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
    // InternalKlangParser.g:2673:1: rule__Minus__Group_1__2 : rule__Minus__Group_1__2__Impl ;
    public final void rule__Minus__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2677:1: ( rule__Minus__Group_1__2__Impl )
            // InternalKlangParser.g:2678:2: rule__Minus__Group_1__2__Impl
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
    // InternalKlangParser.g:2684:1: rule__Minus__Group_1__2__Impl : ( ( rule__Minus__RightAssignment_1_2 ) ) ;
    public final void rule__Minus__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2688:1: ( ( ( rule__Minus__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:2689:1: ( ( rule__Minus__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:2689:1: ( ( rule__Minus__RightAssignment_1_2 ) )
            // InternalKlangParser.g:2690:2: ( rule__Minus__RightAssignment_1_2 )
            {
             before(grammarAccess.getMinusAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:2691:2: ( rule__Minus__RightAssignment_1_2 )
            // InternalKlangParser.g:2691:3: rule__Minus__RightAssignment_1_2
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
    // InternalKlangParser.g:2700:1: rule__Multiply__Group__0 : rule__Multiply__Group__0__Impl rule__Multiply__Group__1 ;
    public final void rule__Multiply__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2704:1: ( rule__Multiply__Group__0__Impl rule__Multiply__Group__1 )
            // InternalKlangParser.g:2705:2: rule__Multiply__Group__0__Impl rule__Multiply__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalKlangParser.g:2712:1: rule__Multiply__Group__0__Impl : ( ruleDivide ) ;
    public final void rule__Multiply__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2716:1: ( ( ruleDivide ) )
            // InternalKlangParser.g:2717:1: ( ruleDivide )
            {
            // InternalKlangParser.g:2717:1: ( ruleDivide )
            // InternalKlangParser.g:2718:2: ruleDivide
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
    // InternalKlangParser.g:2727:1: rule__Multiply__Group__1 : rule__Multiply__Group__1__Impl ;
    public final void rule__Multiply__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2731:1: ( rule__Multiply__Group__1__Impl )
            // InternalKlangParser.g:2732:2: rule__Multiply__Group__1__Impl
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
    // InternalKlangParser.g:2738:1: rule__Multiply__Group__1__Impl : ( ( rule__Multiply__Group_1__0 )* ) ;
    public final void rule__Multiply__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2742:1: ( ( ( rule__Multiply__Group_1__0 )* ) )
            // InternalKlangParser.g:2743:1: ( ( rule__Multiply__Group_1__0 )* )
            {
            // InternalKlangParser.g:2743:1: ( ( rule__Multiply__Group_1__0 )* )
            // InternalKlangParser.g:2744:2: ( rule__Multiply__Group_1__0 )*
            {
             before(grammarAccess.getMultiplyAccess().getGroup_1()); 
            // InternalKlangParser.g:2745:2: ( rule__Multiply__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==Asterisk) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalKlangParser.g:2745:3: rule__Multiply__Group_1__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Multiply__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalKlangParser.g:2754:1: rule__Multiply__Group_1__0 : rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1 ;
    public final void rule__Multiply__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2758:1: ( rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1 )
            // InternalKlangParser.g:2759:2: rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalKlangParser.g:2766:1: rule__Multiply__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiply__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2770:1: ( ( () ) )
            // InternalKlangParser.g:2771:1: ( () )
            {
            // InternalKlangParser.g:2771:1: ( () )
            // InternalKlangParser.g:2772:2: ()
            {
             before(grammarAccess.getMultiplyAccess().getMultiplyLeftAction_1_0()); 
            // InternalKlangParser.g:2773:2: ()
            // InternalKlangParser.g:2773:3: 
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
    // InternalKlangParser.g:2781:1: rule__Multiply__Group_1__1 : rule__Multiply__Group_1__1__Impl rule__Multiply__Group_1__2 ;
    public final void rule__Multiply__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2785:1: ( rule__Multiply__Group_1__1__Impl rule__Multiply__Group_1__2 )
            // InternalKlangParser.g:2786:2: rule__Multiply__Group_1__1__Impl rule__Multiply__Group_1__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalKlangParser.g:2793:1: rule__Multiply__Group_1__1__Impl : ( Asterisk ) ;
    public final void rule__Multiply__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2797:1: ( ( Asterisk ) )
            // InternalKlangParser.g:2798:1: ( Asterisk )
            {
            // InternalKlangParser.g:2798:1: ( Asterisk )
            // InternalKlangParser.g:2799:2: Asterisk
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
    // InternalKlangParser.g:2808:1: rule__Multiply__Group_1__2 : rule__Multiply__Group_1__2__Impl ;
    public final void rule__Multiply__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2812:1: ( rule__Multiply__Group_1__2__Impl )
            // InternalKlangParser.g:2813:2: rule__Multiply__Group_1__2__Impl
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
    // InternalKlangParser.g:2819:1: rule__Multiply__Group_1__2__Impl : ( ( rule__Multiply__RightAssignment_1_2 ) ) ;
    public final void rule__Multiply__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2823:1: ( ( ( rule__Multiply__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:2824:1: ( ( rule__Multiply__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:2824:1: ( ( rule__Multiply__RightAssignment_1_2 ) )
            // InternalKlangParser.g:2825:2: ( rule__Multiply__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplyAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:2826:2: ( rule__Multiply__RightAssignment_1_2 )
            // InternalKlangParser.g:2826:3: rule__Multiply__RightAssignment_1_2
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
    // InternalKlangParser.g:2835:1: rule__Divide__Group__0 : rule__Divide__Group__0__Impl rule__Divide__Group__1 ;
    public final void rule__Divide__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2839:1: ( rule__Divide__Group__0__Impl rule__Divide__Group__1 )
            // InternalKlangParser.g:2840:2: rule__Divide__Group__0__Impl rule__Divide__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalKlangParser.g:2847:1: rule__Divide__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__Divide__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2851:1: ( ( rulePrimaryExpression ) )
            // InternalKlangParser.g:2852:1: ( rulePrimaryExpression )
            {
            // InternalKlangParser.g:2852:1: ( rulePrimaryExpression )
            // InternalKlangParser.g:2853:2: rulePrimaryExpression
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
    // InternalKlangParser.g:2862:1: rule__Divide__Group__1 : rule__Divide__Group__1__Impl ;
    public final void rule__Divide__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2866:1: ( rule__Divide__Group__1__Impl )
            // InternalKlangParser.g:2867:2: rule__Divide__Group__1__Impl
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
    // InternalKlangParser.g:2873:1: rule__Divide__Group__1__Impl : ( ( rule__Divide__Group_1__0 )* ) ;
    public final void rule__Divide__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2877:1: ( ( ( rule__Divide__Group_1__0 )* ) )
            // InternalKlangParser.g:2878:1: ( ( rule__Divide__Group_1__0 )* )
            {
            // InternalKlangParser.g:2878:1: ( ( rule__Divide__Group_1__0 )* )
            // InternalKlangParser.g:2879:2: ( rule__Divide__Group_1__0 )*
            {
             before(grammarAccess.getDivideAccess().getGroup_1()); 
            // InternalKlangParser.g:2880:2: ( rule__Divide__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==Solidus) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalKlangParser.g:2880:3: rule__Divide__Group_1__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Divide__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalKlangParser.g:2889:1: rule__Divide__Group_1__0 : rule__Divide__Group_1__0__Impl rule__Divide__Group_1__1 ;
    public final void rule__Divide__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2893:1: ( rule__Divide__Group_1__0__Impl rule__Divide__Group_1__1 )
            // InternalKlangParser.g:2894:2: rule__Divide__Group_1__0__Impl rule__Divide__Group_1__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalKlangParser.g:2901:1: rule__Divide__Group_1__0__Impl : ( () ) ;
    public final void rule__Divide__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2905:1: ( ( () ) )
            // InternalKlangParser.g:2906:1: ( () )
            {
            // InternalKlangParser.g:2906:1: ( () )
            // InternalKlangParser.g:2907:2: ()
            {
             before(grammarAccess.getDivideAccess().getDivideLeftAction_1_0()); 
            // InternalKlangParser.g:2908:2: ()
            // InternalKlangParser.g:2908:3: 
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
    // InternalKlangParser.g:2916:1: rule__Divide__Group_1__1 : rule__Divide__Group_1__1__Impl rule__Divide__Group_1__2 ;
    public final void rule__Divide__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2920:1: ( rule__Divide__Group_1__1__Impl rule__Divide__Group_1__2 )
            // InternalKlangParser.g:2921:2: rule__Divide__Group_1__1__Impl rule__Divide__Group_1__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalKlangParser.g:2928:1: rule__Divide__Group_1__1__Impl : ( Solidus ) ;
    public final void rule__Divide__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2932:1: ( ( Solidus ) )
            // InternalKlangParser.g:2933:1: ( Solidus )
            {
            // InternalKlangParser.g:2933:1: ( Solidus )
            // InternalKlangParser.g:2934:2: Solidus
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
    // InternalKlangParser.g:2943:1: rule__Divide__Group_1__2 : rule__Divide__Group_1__2__Impl ;
    public final void rule__Divide__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2947:1: ( rule__Divide__Group_1__2__Impl )
            // InternalKlangParser.g:2948:2: rule__Divide__Group_1__2__Impl
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
    // InternalKlangParser.g:2954:1: rule__Divide__Group_1__2__Impl : ( ( rule__Divide__RightAssignment_1_2 ) ) ;
    public final void rule__Divide__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2958:1: ( ( ( rule__Divide__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:2959:1: ( ( rule__Divide__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:2959:1: ( ( rule__Divide__RightAssignment_1_2 ) )
            // InternalKlangParser.g:2960:2: ( rule__Divide__RightAssignment_1_2 )
            {
             before(grammarAccess.getDivideAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:2961:2: ( rule__Divide__RightAssignment_1_2 )
            // InternalKlangParser.g:2961:3: rule__Divide__RightAssignment_1_2
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
    // InternalKlangParser.g:2970:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2974:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalKlangParser.g:2975:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalKlangParser.g:2982:1: rule__Comparison__Group__0__Impl : ( rulePlus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2986:1: ( ( rulePlus ) )
            // InternalKlangParser.g:2987:1: ( rulePlus )
            {
            // InternalKlangParser.g:2987:1: ( rulePlus )
            // InternalKlangParser.g:2988:2: rulePlus
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
    // InternalKlangParser.g:2997:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3001:1: ( rule__Comparison__Group__1__Impl )
            // InternalKlangParser.g:3002:2: rule__Comparison__Group__1__Impl
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
    // InternalKlangParser.g:3008:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3012:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalKlangParser.g:3013:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalKlangParser.g:3013:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalKlangParser.g:3014:2: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // InternalKlangParser.g:3015:2: ( rule__Comparison__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=LessThanSign && LA24_0<=GreaterThanSign)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalKlangParser.g:3015:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalKlangParser.g:3024:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3028:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalKlangParser.g:3029:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalKlangParser.g:3036:1: rule__Comparison__Group_1__0__Impl : ( ( rule__Comparison__Alternatives_1_0 ) ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3040:1: ( ( ( rule__Comparison__Alternatives_1_0 ) ) )
            // InternalKlangParser.g:3041:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            {
            // InternalKlangParser.g:3041:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            // InternalKlangParser.g:3042:2: ( rule__Comparison__Alternatives_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getAlternatives_1_0()); 
            // InternalKlangParser.g:3043:2: ( rule__Comparison__Alternatives_1_0 )
            // InternalKlangParser.g:3043:3: rule__Comparison__Alternatives_1_0
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
    // InternalKlangParser.g:3051:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3055:1: ( rule__Comparison__Group_1__1__Impl )
            // InternalKlangParser.g:3056:2: rule__Comparison__Group_1__1__Impl
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
    // InternalKlangParser.g:3062:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__RightAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3066:1: ( ( ( rule__Comparison__RightAssignment_1_1 ) ) )
            // InternalKlangParser.g:3067:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            {
            // InternalKlangParser.g:3067:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            // InternalKlangParser.g:3068:2: ( rule__Comparison__RightAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_1()); 
            // InternalKlangParser.g:3069:2: ( rule__Comparison__RightAssignment_1_1 )
            // InternalKlangParser.g:3069:3: rule__Comparison__RightAssignment_1_1
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
    // InternalKlangParser.g:3078:1: rule__Comparison__Group_1_0_0__0 : rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 ;
    public final void rule__Comparison__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3082:1: ( rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 )
            // InternalKlangParser.g:3083:2: rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1
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
    // InternalKlangParser.g:3090:1: rule__Comparison__Group_1_0_0__0__Impl : ( LessThanSign ) ;
    public final void rule__Comparison__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3094:1: ( ( LessThanSign ) )
            // InternalKlangParser.g:3095:1: ( LessThanSign )
            {
            // InternalKlangParser.g:3095:1: ( LessThanSign )
            // InternalKlangParser.g:3096:2: LessThanSign
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
    // InternalKlangParser.g:3105:1: rule__Comparison__Group_1_0_0__1 : rule__Comparison__Group_1_0_0__1__Impl ;
    public final void rule__Comparison__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3109:1: ( rule__Comparison__Group_1_0_0__1__Impl )
            // InternalKlangParser.g:3110:2: rule__Comparison__Group_1_0_0__1__Impl
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
    // InternalKlangParser.g:3116:1: rule__Comparison__Group_1_0_0__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3120:1: ( ( () ) )
            // InternalKlangParser.g:3121:1: ( () )
            {
            // InternalKlangParser.g:3121:1: ( () )
            // InternalKlangParser.g:3122:2: ()
            {
             before(grammarAccess.getComparisonAccess().getLessThanLeftAction_1_0_0_1()); 
            // InternalKlangParser.g:3123:2: ()
            // InternalKlangParser.g:3123:3: 
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
    // InternalKlangParser.g:3132:1: rule__Comparison__Group_1_0_1__0 : rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 ;
    public final void rule__Comparison__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3136:1: ( rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 )
            // InternalKlangParser.g:3137:2: rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1
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
    // InternalKlangParser.g:3144:1: rule__Comparison__Group_1_0_1__0__Impl : ( EqualsSign ) ;
    public final void rule__Comparison__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3148:1: ( ( EqualsSign ) )
            // InternalKlangParser.g:3149:1: ( EqualsSign )
            {
            // InternalKlangParser.g:3149:1: ( EqualsSign )
            // InternalKlangParser.g:3150:2: EqualsSign
            {
             before(grammarAccess.getComparisonAccess().getEqualsSignKeyword_1_0_1_0()); 
            match(input,EqualsSign,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getEqualsSignKeyword_1_0_1_0()); 

            }


            }

        }
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
    // InternalKlangParser.g:3159:1: rule__Comparison__Group_1_0_1__1 : rule__Comparison__Group_1_0_1__1__Impl ;
    public final void rule__Comparison__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3163:1: ( rule__Comparison__Group_1_0_1__1__Impl )
            // InternalKlangParser.g:3164:2: rule__Comparison__Group_1_0_1__1__Impl
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
    // InternalKlangParser.g:3170:1: rule__Comparison__Group_1_0_1__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3174:1: ( ( () ) )
            // InternalKlangParser.g:3175:1: ( () )
            {
            // InternalKlangParser.g:3175:1: ( () )
            // InternalKlangParser.g:3176:2: ()
            {
             before(grammarAccess.getComparisonAccess().getEqualLeftAction_1_0_1_1()); 
            // InternalKlangParser.g:3177:2: ()
            // InternalKlangParser.g:3177:3: 
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
    // InternalKlangParser.g:3186:1: rule__Comparison__Group_1_0_2__0 : rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1 ;
    public final void rule__Comparison__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3190:1: ( rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1 )
            // InternalKlangParser.g:3191:2: rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1
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
    // InternalKlangParser.g:3198:1: rule__Comparison__Group_1_0_2__0__Impl : ( GreaterThanSign ) ;
    public final void rule__Comparison__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3202:1: ( ( GreaterThanSign ) )
            // InternalKlangParser.g:3203:1: ( GreaterThanSign )
            {
            // InternalKlangParser.g:3203:1: ( GreaterThanSign )
            // InternalKlangParser.g:3204:2: GreaterThanSign
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
    // InternalKlangParser.g:3213:1: rule__Comparison__Group_1_0_2__1 : rule__Comparison__Group_1_0_2__1__Impl ;
    public final void rule__Comparison__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3217:1: ( rule__Comparison__Group_1_0_2__1__Impl )
            // InternalKlangParser.g:3218:2: rule__Comparison__Group_1_0_2__1__Impl
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
    // InternalKlangParser.g:3224:1: rule__Comparison__Group_1_0_2__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3228:1: ( ( () ) )
            // InternalKlangParser.g:3229:1: ( () )
            {
            // InternalKlangParser.g:3229:1: ( () )
            // InternalKlangParser.g:3230:2: ()
            {
             before(grammarAccess.getComparisonAccess().getGreaterThanLeftAction_1_0_2_1()); 
            // InternalKlangParser.g:3231:2: ()
            // InternalKlangParser.g:3231:3: 
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


    // $ANTLR start "rule__PrimaryExpression__Group_0__0"
    // InternalKlangParser.g:3240:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3244:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // InternalKlangParser.g:3245:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalKlangParser.g:3252:1: rule__PrimaryExpression__Group_0__0__Impl : ( LeftParenthesis ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3256:1: ( ( LeftParenthesis ) )
            // InternalKlangParser.g:3257:1: ( LeftParenthesis )
            {
            // InternalKlangParser.g:3257:1: ( LeftParenthesis )
            // InternalKlangParser.g:3258:2: LeftParenthesis
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
    // InternalKlangParser.g:3267:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3271:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // InternalKlangParser.g:3272:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalKlangParser.g:3279:1: rule__PrimaryExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3283:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:3284:1: ( ruleExpression )
            {
            // InternalKlangParser.g:3284:1: ( ruleExpression )
            // InternalKlangParser.g:3285:2: ruleExpression
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
    // InternalKlangParser.g:3294:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3298:1: ( rule__PrimaryExpression__Group_0__2__Impl )
            // InternalKlangParser.g:3299:2: rule__PrimaryExpression__Group_0__2__Impl
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
    // InternalKlangParser.g:3305:1: rule__PrimaryExpression__Group_0__2__Impl : ( RightParenthesis ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3309:1: ( ( RightParenthesis ) )
            // InternalKlangParser.g:3310:1: ( RightParenthesis )
            {
            // InternalKlangParser.g:3310:1: ( RightParenthesis )
            // InternalKlangParser.g:3311:2: RightParenthesis
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
    // InternalKlangParser.g:3321:1: rule__PrimaryExpression__Group_1__0 : rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 ;
    public final void rule__PrimaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3325:1: ( rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 )
            // InternalKlangParser.g:3326:2: rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalKlangParser.g:3333:1: rule__PrimaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3337:1: ( ( () ) )
            // InternalKlangParser.g:3338:1: ( () )
            {
            // InternalKlangParser.g:3338:1: ( () )
            // InternalKlangParser.g:3339:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNotAction_1_0()); 
            // InternalKlangParser.g:3340:2: ()
            // InternalKlangParser.g:3340:3: 
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
    // InternalKlangParser.g:3348:1: rule__PrimaryExpression__Group_1__1 : rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2 ;
    public final void rule__PrimaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3352:1: ( rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2 )
            // InternalKlangParser.g:3353:2: rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalKlangParser.g:3360:1: rule__PrimaryExpression__Group_1__1__Impl : ( ruleNotOp ) ;
    public final void rule__PrimaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3364:1: ( ( ruleNotOp ) )
            // InternalKlangParser.g:3365:1: ( ruleNotOp )
            {
            // InternalKlangParser.g:3365:1: ( ruleNotOp )
            // InternalKlangParser.g:3366:2: ruleNotOp
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNotOpParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleNotOp();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getNotOpParserRuleCall_1_1()); 

            }


            }

        }
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
    // InternalKlangParser.g:3375:1: rule__PrimaryExpression__Group_1__2 : rule__PrimaryExpression__Group_1__2__Impl ;
    public final void rule__PrimaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3379:1: ( rule__PrimaryExpression__Group_1__2__Impl )
            // InternalKlangParser.g:3380:2: rule__PrimaryExpression__Group_1__2__Impl
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
    // InternalKlangParser.g:3386:1: rule__PrimaryExpression__Group_1__2__Impl : ( ( rule__PrimaryExpression__ExpressionAssignment_1_2 ) ) ;
    public final void rule__PrimaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3390:1: ( ( ( rule__PrimaryExpression__ExpressionAssignment_1_2 ) ) )
            // InternalKlangParser.g:3391:1: ( ( rule__PrimaryExpression__ExpressionAssignment_1_2 ) )
            {
            // InternalKlangParser.g:3391:1: ( ( rule__PrimaryExpression__ExpressionAssignment_1_2 ) )
            // InternalKlangParser.g:3392:2: ( rule__PrimaryExpression__ExpressionAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionAssignment_1_2()); 
            // InternalKlangParser.g:3393:2: ( rule__PrimaryExpression__ExpressionAssignment_1_2 )
            // InternalKlangParser.g:3393:3: rule__PrimaryExpression__ExpressionAssignment_1_2
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
    // InternalKlangParser.g:3402:1: rule__AtomicExpression__Group_0__0 : rule__AtomicExpression__Group_0__0__Impl rule__AtomicExpression__Group_0__1 ;
    public final void rule__AtomicExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3406:1: ( rule__AtomicExpression__Group_0__0__Impl rule__AtomicExpression__Group_0__1 )
            // InternalKlangParser.g:3407:2: rule__AtomicExpression__Group_0__0__Impl rule__AtomicExpression__Group_0__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalKlangParser.g:3414:1: rule__AtomicExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__AtomicExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3418:1: ( ( () ) )
            // InternalKlangParser.g:3419:1: ( () )
            {
            // InternalKlangParser.g:3419:1: ( () )
            // InternalKlangParser.g:3420:2: ()
            {
             before(grammarAccess.getAtomicExpressionAccess().getBooleanLiteralAction_0_0()); 
            // InternalKlangParser.g:3421:2: ()
            // InternalKlangParser.g:3421:3: 
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
    // InternalKlangParser.g:3429:1: rule__AtomicExpression__Group_0__1 : rule__AtomicExpression__Group_0__1__Impl ;
    public final void rule__AtomicExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3433:1: ( rule__AtomicExpression__Group_0__1__Impl )
            // InternalKlangParser.g:3434:2: rule__AtomicExpression__Group_0__1__Impl
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
    // InternalKlangParser.g:3440:1: rule__AtomicExpression__Group_0__1__Impl : ( ( rule__AtomicExpression__Alternatives_0_1 ) ) ;
    public final void rule__AtomicExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3444:1: ( ( ( rule__AtomicExpression__Alternatives_0_1 ) ) )
            // InternalKlangParser.g:3445:1: ( ( rule__AtomicExpression__Alternatives_0_1 ) )
            {
            // InternalKlangParser.g:3445:1: ( ( rule__AtomicExpression__Alternatives_0_1 ) )
            // InternalKlangParser.g:3446:2: ( rule__AtomicExpression__Alternatives_0_1 )
            {
             before(grammarAccess.getAtomicExpressionAccess().getAlternatives_0_1()); 
            // InternalKlangParser.g:3447:2: ( rule__AtomicExpression__Alternatives_0_1 )
            // InternalKlangParser.g:3447:3: rule__AtomicExpression__Alternatives_0_1
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
    // InternalKlangParser.g:3456:1: rule__AtomicExpression__Group_1__0 : rule__AtomicExpression__Group_1__0__Impl rule__AtomicExpression__Group_1__1 ;
    public final void rule__AtomicExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3460:1: ( rule__AtomicExpression__Group_1__0__Impl rule__AtomicExpression__Group_1__1 )
            // InternalKlangParser.g:3461:2: rule__AtomicExpression__Group_1__0__Impl rule__AtomicExpression__Group_1__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalKlangParser.g:3468:1: rule__AtomicExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AtomicExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3472:1: ( ( () ) )
            // InternalKlangParser.g:3473:1: ( () )
            {
            // InternalKlangParser.g:3473:1: ( () )
            // InternalKlangParser.g:3474:2: ()
            {
             before(grammarAccess.getAtomicExpressionAccess().getNumericLiteralAction_1_0()); 
            // InternalKlangParser.g:3475:2: ()
            // InternalKlangParser.g:3475:3: 
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
    // InternalKlangParser.g:3483:1: rule__AtomicExpression__Group_1__1 : rule__AtomicExpression__Group_1__1__Impl ;
    public final void rule__AtomicExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3487:1: ( rule__AtomicExpression__Group_1__1__Impl )
            // InternalKlangParser.g:3488:2: rule__AtomicExpression__Group_1__1__Impl
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
    // InternalKlangParser.g:3494:1: rule__AtomicExpression__Group_1__1__Impl : ( ( rule__AtomicExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__AtomicExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3498:1: ( ( ( rule__AtomicExpression__ValueAssignment_1_1 ) ) )
            // InternalKlangParser.g:3499:1: ( ( rule__AtomicExpression__ValueAssignment_1_1 ) )
            {
            // InternalKlangParser.g:3499:1: ( ( rule__AtomicExpression__ValueAssignment_1_1 ) )
            // InternalKlangParser.g:3500:2: ( rule__AtomicExpression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicExpressionAccess().getValueAssignment_1_1()); 
            // InternalKlangParser.g:3501:2: ( rule__AtomicExpression__ValueAssignment_1_1 )
            // InternalKlangParser.g:3501:3: rule__AtomicExpression__ValueAssignment_1_1
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
    // InternalKlangParser.g:3510:1: rule__AtomicExpression__Group_2__0 : rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 ;
    public final void rule__AtomicExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3514:1: ( rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 )
            // InternalKlangParser.g:3515:2: rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalKlangParser.g:3522:1: rule__AtomicExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__AtomicExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3526:1: ( ( () ) )
            // InternalKlangParser.g:3527:1: ( () )
            {
            // InternalKlangParser.g:3527:1: ( () )
            // InternalKlangParser.g:3528:2: ()
            {
             before(grammarAccess.getAtomicExpressionAccess().getStringLiteralAction_2_0()); 
            // InternalKlangParser.g:3529:2: ()
            // InternalKlangParser.g:3529:3: 
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
    // InternalKlangParser.g:3537:1: rule__AtomicExpression__Group_2__1 : rule__AtomicExpression__Group_2__1__Impl ;
    public final void rule__AtomicExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3541:1: ( rule__AtomicExpression__Group_2__1__Impl )
            // InternalKlangParser.g:3542:2: rule__AtomicExpression__Group_2__1__Impl
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
    // InternalKlangParser.g:3548:1: rule__AtomicExpression__Group_2__1__Impl : ( ( rule__AtomicExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__AtomicExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3552:1: ( ( ( rule__AtomicExpression__ValueAssignment_2_1 ) ) )
            // InternalKlangParser.g:3553:1: ( ( rule__AtomicExpression__ValueAssignment_2_1 ) )
            {
            // InternalKlangParser.g:3553:1: ( ( rule__AtomicExpression__ValueAssignment_2_1 ) )
            // InternalKlangParser.g:3554:2: ( rule__AtomicExpression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicExpressionAccess().getValueAssignment_2_1()); 
            // InternalKlangParser.g:3555:2: ( rule__AtomicExpression__ValueAssignment_2_1 )
            // InternalKlangParser.g:3555:3: rule__AtomicExpression__ValueAssignment_2_1
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
    // InternalKlangParser.g:3564:1: rule__AtomicExpression__Group_3__0 : rule__AtomicExpression__Group_3__0__Impl rule__AtomicExpression__Group_3__1 ;
    public final void rule__AtomicExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3568:1: ( rule__AtomicExpression__Group_3__0__Impl rule__AtomicExpression__Group_3__1 )
            // InternalKlangParser.g:3569:2: rule__AtomicExpression__Group_3__0__Impl rule__AtomicExpression__Group_3__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalKlangParser.g:3576:1: rule__AtomicExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__AtomicExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3580:1: ( ( () ) )
            // InternalKlangParser.g:3581:1: ( () )
            {
            // InternalKlangParser.g:3581:1: ( () )
            // InternalKlangParser.g:3582:2: ()
            {
             before(grammarAccess.getAtomicExpressionAccess().getVariableRefAction_3_0()); 
            // InternalKlangParser.g:3583:2: ()
            // InternalKlangParser.g:3583:3: 
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
    // InternalKlangParser.g:3591:1: rule__AtomicExpression__Group_3__1 : rule__AtomicExpression__Group_3__1__Impl ;
    public final void rule__AtomicExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3595:1: ( rule__AtomicExpression__Group_3__1__Impl )
            // InternalKlangParser.g:3596:2: rule__AtomicExpression__Group_3__1__Impl
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
    // InternalKlangParser.g:3602:1: rule__AtomicExpression__Group_3__1__Impl : ( ( rule__AtomicExpression__VariableNameAssignment_3_1 ) ) ;
    public final void rule__AtomicExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3606:1: ( ( ( rule__AtomicExpression__VariableNameAssignment_3_1 ) ) )
            // InternalKlangParser.g:3607:1: ( ( rule__AtomicExpression__VariableNameAssignment_3_1 ) )
            {
            // InternalKlangParser.g:3607:1: ( ( rule__AtomicExpression__VariableNameAssignment_3_1 ) )
            // InternalKlangParser.g:3608:2: ( rule__AtomicExpression__VariableNameAssignment_3_1 )
            {
             before(grammarAccess.getAtomicExpressionAccess().getVariableNameAssignment_3_1()); 
            // InternalKlangParser.g:3609:2: ( rule__AtomicExpression__VariableNameAssignment_3_1 )
            // InternalKlangParser.g:3609:3: rule__AtomicExpression__VariableNameAssignment_3_1
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


    // $ANTLR start "rule__Game__VariablesAssignment_1"
    // InternalKlangParser.g:3618:1: rule__Game__VariablesAssignment_1 : ( ruleVariable ) ;
    public final void rule__Game__VariablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3622:1: ( ( ruleVariable ) )
            // InternalKlangParser.g:3623:2: ( ruleVariable )
            {
            // InternalKlangParser.g:3623:2: ( ruleVariable )
            // InternalKlangParser.g:3624:3: ruleVariable
            {
             before(grammarAccess.getGameAccess().getVariablesVariableParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getGameAccess().getVariablesVariableParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__VariablesAssignment_1"


    // $ANTLR start "rule__Game__ActorDefsAssignment_2"
    // InternalKlangParser.g:3633:1: rule__Game__ActorDefsAssignment_2 : ( ruleSprite ) ;
    public final void rule__Game__ActorDefsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3637:1: ( ( ruleSprite ) )
            // InternalKlangParser.g:3638:2: ( ruleSprite )
            {
            // InternalKlangParser.g:3638:2: ( ruleSprite )
            // InternalKlangParser.g:3639:3: ruleSprite
            {
             before(grammarAccess.getGameAccess().getActorDefsSpriteParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSprite();

            state._fsp--;

             after(grammarAccess.getGameAccess().getActorDefsSpriteParserRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Sprite__NameAssignment_2"
    // InternalKlangParser.g:3648:1: rule__Sprite__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Sprite__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3652:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:3653:2: ( RULE_ID )
            {
            // InternalKlangParser.g:3653:2: ( RULE_ID )
            // InternalKlangParser.g:3654:3: RULE_ID
            {
             before(grammarAccess.getSpriteAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSpriteAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sprite__NameAssignment_2"


    // $ANTLR start "rule__Sprite__VariablesAssignment_4"
    // InternalKlangParser.g:3663:1: rule__Sprite__VariablesAssignment_4 : ( ruleVariable ) ;
    public final void rule__Sprite__VariablesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3667:1: ( ( ruleVariable ) )
            // InternalKlangParser.g:3668:2: ( ruleVariable )
            {
            // InternalKlangParser.g:3668:2: ( ruleVariable )
            // InternalKlangParser.g:3669:3: ruleVariable
            {
             before(grammarAccess.getSpriteAccess().getVariablesVariableParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getSpriteAccess().getVariablesVariableParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sprite__VariablesAssignment_4"


    // $ANTLR start "rule__Sprite__EventHandlersAssignment_5"
    // InternalKlangParser.g:3678:1: rule__Sprite__EventHandlersAssignment_5 : ( ruleEventHandler ) ;
    public final void rule__Sprite__EventHandlersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3682:1: ( ( ruleEventHandler ) )
            // InternalKlangParser.g:3683:2: ( ruleEventHandler )
            {
            // InternalKlangParser.g:3683:2: ( ruleEventHandler )
            // InternalKlangParser.g:3684:3: ruleEventHandler
            {
             before(grammarAccess.getSpriteAccess().getEventHandlersEventHandlerParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEventHandler();

            state._fsp--;

             after(grammarAccess.getSpriteAccess().getEventHandlersEventHandlerParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sprite__EventHandlersAssignment_5"


    // $ANTLR start "rule__EventHandler__EventTypeAssignment_1"
    // InternalKlangParser.g:3693:1: rule__EventHandler__EventTypeAssignment_1 : ( ruleEventType ) ;
    public final void rule__EventHandler__EventTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3697:1: ( ( ruleEventType ) )
            // InternalKlangParser.g:3698:2: ( ruleEventType )
            {
            // InternalKlangParser.g:3698:2: ( ruleEventType )
            // InternalKlangParser.g:3699:3: ruleEventType
            {
             before(grammarAccess.getEventHandlerAccess().getEventTypeEventTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEventType();

            state._fsp--;

             after(grammarAccess.getEventHandlerAccess().getEventTypeEventTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventHandler__EventTypeAssignment_1"


    // $ANTLR start "rule__EventHandler__StatementsAssignment_3"
    // InternalKlangParser.g:3708:1: rule__EventHandler__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__EventHandler__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3712:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:3713:2: ( ruleStatement )
            {
            // InternalKlangParser.g:3713:2: ( ruleStatement )
            // InternalKlangParser.g:3714:3: ruleStatement
            {
             before(grammarAccess.getEventHandlerAccess().getStatementsStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getEventHandlerAccess().getStatementsStatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventHandler__StatementsAssignment_3"


    // $ANTLR start "rule__WhileLoop__PredicateAssignment_2"
    // InternalKlangParser.g:3723:1: rule__WhileLoop__PredicateAssignment_2 : ( ruleExpression ) ;
    public final void rule__WhileLoop__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3727:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:3728:2: ( ruleExpression )
            {
            // InternalKlangParser.g:3728:2: ( ruleExpression )
            // InternalKlangParser.g:3729:3: ruleExpression
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
    // InternalKlangParser.g:3738:1: rule__WhileLoop__LoopBlockAssignment_4 : ( ruleStatement ) ;
    public final void rule__WhileLoop__LoopBlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3742:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:3743:2: ( ruleStatement )
            {
            // InternalKlangParser.g:3743:2: ( ruleStatement )
            // InternalKlangParser.g:3744:3: ruleStatement
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
    // InternalKlangParser.g:3753:1: rule__If__PredicateAssignment_2 : ( ruleExpression ) ;
    public final void rule__If__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3757:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:3758:2: ( ruleExpression )
            {
            // InternalKlangParser.g:3758:2: ( ruleExpression )
            // InternalKlangParser.g:3759:3: ruleExpression
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
    // InternalKlangParser.g:3768:1: rule__If__IfBlockAssignment_4 : ( ruleStatement ) ;
    public final void rule__If__IfBlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3772:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:3773:2: ( ruleStatement )
            {
            // InternalKlangParser.g:3773:2: ( ruleStatement )
            // InternalKlangParser.g:3774:3: ruleStatement
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
    // InternalKlangParser.g:3783:1: rule__ForeverLoop__LoopStatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__ForeverLoop__LoopStatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3787:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:3788:2: ( ruleStatement )
            {
            // InternalKlangParser.g:3788:2: ( ruleStatement )
            // InternalKlangParser.g:3789:3: ruleStatement
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


    // $ANTLR start "rule__SubroutineCall__NameAssignment_0"
    // InternalKlangParser.g:3798:1: rule__SubroutineCall__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SubroutineCall__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3802:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:3803:2: ( RULE_ID )
            {
            // InternalKlangParser.g:3803:2: ( RULE_ID )
            // InternalKlangParser.g:3804:3: RULE_ID
            {
             before(grammarAccess.getSubroutineCallAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSubroutineCallAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubroutineCall__NameAssignment_0"


    // $ANTLR start "rule__SubroutineCall__ParametersAssignment_2"
    // InternalKlangParser.g:3813:1: rule__SubroutineCall__ParametersAssignment_2 : ( ruleExpression ) ;
    public final void rule__SubroutineCall__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3817:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:3818:2: ( ruleExpression )
            {
            // InternalKlangParser.g:3818:2: ( ruleExpression )
            // InternalKlangParser.g:3819:3: ruleExpression
            {
             before(grammarAccess.getSubroutineCallAccess().getParametersExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSubroutineCallAccess().getParametersExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubroutineCall__ParametersAssignment_2"


    // $ANTLR start "rule__SubroutineCall__ParametersAssignment_3_1"
    // InternalKlangParser.g:3828:1: rule__SubroutineCall__ParametersAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__SubroutineCall__ParametersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3832:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:3833:2: ( ruleExpression )
            {
            // InternalKlangParser.g:3833:2: ( ruleExpression )
            // InternalKlangParser.g:3834:3: ruleExpression
            {
             before(grammarAccess.getSubroutineCallAccess().getParametersExpressionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSubroutineCallAccess().getParametersExpressionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubroutineCall__ParametersAssignment_3_1"


    // $ANTLR start "rule__Variable__NameAssignment_1"
    // InternalKlangParser.g:3843:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3847:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:3848:2: ( RULE_ID )
            {
            // InternalKlangParser.g:3848:2: ( RULE_ID )
            // InternalKlangParser.g:3849:3: RULE_ID
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
    // InternalKlangParser.g:3858:1: rule__Variable__ExpressionAssignment_3 : ( ruleExpression ) ;
    public final void rule__Variable__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3862:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:3863:2: ( ruleExpression )
            {
            // InternalKlangParser.g:3863:2: ( ruleExpression )
            // InternalKlangParser.g:3864:3: ruleExpression
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


    // $ANTLR start "rule__Assignment__VariableAssignment_0"
    // InternalKlangParser.g:3873:1: rule__Assignment__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3877:1: ( ( ( RULE_ID ) ) )
            // InternalKlangParser.g:3878:2: ( ( RULE_ID ) )
            {
            // InternalKlangParser.g:3878:2: ( ( RULE_ID ) )
            // InternalKlangParser.g:3879:3: ( RULE_ID )
            {
             before(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_0_0()); 
            // InternalKlangParser.g:3880:3: ( RULE_ID )
            // InternalKlangParser.g:3881:4: RULE_ID
            {
             before(grammarAccess.getAssignmentAccess().getVariableVariableIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getVariableVariableIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__VariableAssignment_0"


    // $ANTLR start "rule__Assignment__ExpressionAssignment_2"
    // InternalKlangParser.g:3892:1: rule__Assignment__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Assignment__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3896:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:3897:2: ( ruleExpression )
            {
            // InternalKlangParser.g:3897:2: ( ruleExpression )
            // InternalKlangParser.g:3898:3: ruleExpression
            {
             before(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ExpressionAssignment_2"


    // $ANTLR start "rule__Or__RightAssignment_1_2"
    // InternalKlangParser.g:3907:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3911:1: ( ( ruleAnd ) )
            // InternalKlangParser.g:3912:2: ( ruleAnd )
            {
            // InternalKlangParser.g:3912:2: ( ruleAnd )
            // InternalKlangParser.g:3913:3: ruleAnd
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
    // InternalKlangParser.g:3922:1: rule__And__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3926:1: ( ( ruleComparison ) )
            // InternalKlangParser.g:3927:2: ( ruleComparison )
            {
            // InternalKlangParser.g:3927:2: ( ruleComparison )
            // InternalKlangParser.g:3928:3: ruleComparison
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
    // InternalKlangParser.g:3937:1: rule__Plus__RightAssignment_1_2 : ( ruleMinus ) ;
    public final void rule__Plus__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3941:1: ( ( ruleMinus ) )
            // InternalKlangParser.g:3942:2: ( ruleMinus )
            {
            // InternalKlangParser.g:3942:2: ( ruleMinus )
            // InternalKlangParser.g:3943:3: ruleMinus
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
    // InternalKlangParser.g:3952:1: rule__Minus__RightAssignment_1_2 : ( ruleMultiply ) ;
    public final void rule__Minus__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3956:1: ( ( ruleMultiply ) )
            // InternalKlangParser.g:3957:2: ( ruleMultiply )
            {
            // InternalKlangParser.g:3957:2: ( ruleMultiply )
            // InternalKlangParser.g:3958:3: ruleMultiply
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
    // InternalKlangParser.g:3967:1: rule__Multiply__RightAssignment_1_2 : ( ruleDivide ) ;
    public final void rule__Multiply__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3971:1: ( ( ruleDivide ) )
            // InternalKlangParser.g:3972:2: ( ruleDivide )
            {
            // InternalKlangParser.g:3972:2: ( ruleDivide )
            // InternalKlangParser.g:3973:3: ruleDivide
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
    // InternalKlangParser.g:3982:1: rule__Divide__RightAssignment_1_2 : ( rulePrimaryExpression ) ;
    public final void rule__Divide__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3986:1: ( ( rulePrimaryExpression ) )
            // InternalKlangParser.g:3987:2: ( rulePrimaryExpression )
            {
            // InternalKlangParser.g:3987:2: ( rulePrimaryExpression )
            // InternalKlangParser.g:3988:3: rulePrimaryExpression
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
    // InternalKlangParser.g:3997:1: rule__Comparison__RightAssignment_1_1 : ( rulePlus ) ;
    public final void rule__Comparison__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4001:1: ( ( rulePlus ) )
            // InternalKlangParser.g:4002:2: ( rulePlus )
            {
            // InternalKlangParser.g:4002:2: ( rulePlus )
            // InternalKlangParser.g:4003:3: rulePlus
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


    // $ANTLR start "rule__PrimaryExpression__ExpressionAssignment_1_2"
    // InternalKlangParser.g:4012:1: rule__PrimaryExpression__ExpressionAssignment_1_2 : ( rulePrimaryExpression ) ;
    public final void rule__PrimaryExpression__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4016:1: ( ( rulePrimaryExpression ) )
            // InternalKlangParser.g:4017:2: ( rulePrimaryExpression )
            {
            // InternalKlangParser.g:4017:2: ( rulePrimaryExpression )
            // InternalKlangParser.g:4018:3: rulePrimaryExpression
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
    // InternalKlangParser.g:4027:1: rule__AtomicExpression__ValueAssignment_0_1_0 : ( ( True ) ) ;
    public final void rule__AtomicExpression__ValueAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4031:1: ( ( ( True ) ) )
            // InternalKlangParser.g:4032:2: ( ( True ) )
            {
            // InternalKlangParser.g:4032:2: ( ( True ) )
            // InternalKlangParser.g:4033:3: ( True )
            {
             before(grammarAccess.getAtomicExpressionAccess().getValueTrueKeyword_0_1_0_0()); 
            // InternalKlangParser.g:4034:3: ( True )
            // InternalKlangParser.g:4035:4: True
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
    // InternalKlangParser.g:4046:1: rule__AtomicExpression__ValueAssignment_1_1 : ( RULE_NUMERIC ) ;
    public final void rule__AtomicExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4050:1: ( ( RULE_NUMERIC ) )
            // InternalKlangParser.g:4051:2: ( RULE_NUMERIC )
            {
            // InternalKlangParser.g:4051:2: ( RULE_NUMERIC )
            // InternalKlangParser.g:4052:3: RULE_NUMERIC
            {
             before(grammarAccess.getAtomicExpressionAccess().getValueNUMERICTerminalRuleCall_1_1_0()); 
            match(input,RULE_NUMERIC,FOLLOW_2); 
             after(grammarAccess.getAtomicExpressionAccess().getValueNUMERICTerminalRuleCall_1_1_0()); 

            }


            }

        }
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
    // InternalKlangParser.g:4061:1: rule__AtomicExpression__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__AtomicExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4065:1: ( ( RULE_STRING ) )
            // InternalKlangParser.g:4066:2: ( RULE_STRING )
            {
            // InternalKlangParser.g:4066:2: ( RULE_STRING )
            // InternalKlangParser.g:4067:3: RULE_STRING
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
    // InternalKlangParser.g:4076:1: rule__AtomicExpression__VariableNameAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__AtomicExpression__VariableNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4080:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:4081:2: ( RULE_ID )
            {
            // InternalKlangParser.g:4081:2: ( RULE_ID )
            // InternalKlangParser.g:4082:3: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020004800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000A000C320L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000008000C322L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000002C0062480L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008320L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000002C04E2480L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000200000000L});

}