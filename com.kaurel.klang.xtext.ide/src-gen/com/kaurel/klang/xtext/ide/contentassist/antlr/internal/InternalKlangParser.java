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
    		tokenNameToValue.put("A", "'A'");
    		tokenNameToValue.put("B", "'B'");
    		tokenNameToValue.put("C", "'C'");
    		tokenNameToValue.put("D", "'D'");
    		tokenNameToValue.put("E", "'E'");
    		tokenNameToValue.put("F", "'F'");
    		tokenNameToValue.put("G", "'G'");
    		tokenNameToValue.put("H", "'H'");
    		tokenNameToValue.put("I", "'I'");
    		tokenNameToValue.put("J", "'J'");
    		tokenNameToValue.put("K", "'K'");
    		tokenNameToValue.put("L", "'L'");
    		tokenNameToValue.put("M", "'M'");
    		tokenNameToValue.put("N", "'N'");
    		tokenNameToValue.put("O", "'O'");
    		tokenNameToValue.put("P", "'P'");
    		tokenNameToValue.put("Q", "'Q'");
    		tokenNameToValue.put("R", "'R'");
    		tokenNameToValue.put("S", "'S'");
    		tokenNameToValue.put("T", "'T'");
    		tokenNameToValue.put("U", "'U'");
    		tokenNameToValue.put("V", "'V'");
    		tokenNameToValue.put("W", "'W'");
    		tokenNameToValue.put("X", "'X'");
    		tokenNameToValue.put("Y", "'Y'");
    		tokenNameToValue.put("Z", "'Z'");
    		tokenNameToValue.put("LessThanSignEqualsSign", "'<='");
    		tokenNameToValue.put("EqualsSignEqualsSign", "'=='");
    		tokenNameToValue.put("GreaterThanSignEqualsSign", "'>='");
    		tokenNameToValue.put("If", "'if'");
    		tokenNameToValue.put("Or", "'or'");
    		tokenNameToValue.put("And", "'and'");
    		tokenNameToValue.put("Int", "'int'");
    		tokenNameToValue.put("Not", "'not'");
    		tokenNameToValue.put("Var", "'var'");
    		tokenNameToValue.put("Else", "'else'");
    		tokenNameToValue.put("Game", "'game'");
    		tokenNameToValue.put("True", "'true'");
    		tokenNameToValue.put("When", "'when'");
    		tokenNameToValue.put("With", "'with'");
    		tokenNameToValue.put("ENTER", "'ENTER'");
    		tokenNameToValue.put("SPACE", "'SPACE'");
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
    		tokenNameToValue.put("Received", "'received'");
    		tokenNameToValue.put("SendMessage", "'sendMessage'");
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
    // InternalKlangParser.g:121:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalKlangParser.g:122:1: ( ruleProgram EOF )
            // InternalKlangParser.g:123:1: ruleProgram EOF
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
    // InternalKlangParser.g:130:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:134:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalKlangParser.g:135:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalKlangParser.g:135:2: ( ( rule__Program__Group__0 ) )
            // InternalKlangParser.g:136:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalKlangParser.g:137:3: ( rule__Program__Group__0 )
            // InternalKlangParser.g:137:4: rule__Program__Group__0
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
    // InternalKlangParser.g:146:1: entryRuleSceneActor : ruleSceneActor EOF ;
    public final void entryRuleSceneActor() throws RecognitionException {
        try {
            // InternalKlangParser.g:147:1: ( ruleSceneActor EOF )
            // InternalKlangParser.g:148:1: ruleSceneActor EOF
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
    // InternalKlangParser.g:155:1: ruleSceneActor : ( ( rule__SceneActor__Group__0 ) ) ;
    public final void ruleSceneActor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:159:2: ( ( ( rule__SceneActor__Group__0 ) ) )
            // InternalKlangParser.g:160:2: ( ( rule__SceneActor__Group__0 ) )
            {
            // InternalKlangParser.g:160:2: ( ( rule__SceneActor__Group__0 ) )
            // InternalKlangParser.g:161:3: ( rule__SceneActor__Group__0 )
            {
             before(grammarAccess.getSceneActorAccess().getGroup()); 
            // InternalKlangParser.g:162:3: ( rule__SceneActor__Group__0 )
            // InternalKlangParser.g:162:4: rule__SceneActor__Group__0
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
    // InternalKlangParser.g:171:1: entryRuleSpriteActor : ruleSpriteActor EOF ;
    public final void entryRuleSpriteActor() throws RecognitionException {
        try {
            // InternalKlangParser.g:172:1: ( ruleSpriteActor EOF )
            // InternalKlangParser.g:173:1: ruleSpriteActor EOF
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
    // InternalKlangParser.g:180:1: ruleSpriteActor : ( ( rule__SpriteActor__Group__0 ) ) ;
    public final void ruleSpriteActor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:184:2: ( ( ( rule__SpriteActor__Group__0 ) ) )
            // InternalKlangParser.g:185:2: ( ( rule__SpriteActor__Group__0 ) )
            {
            // InternalKlangParser.g:185:2: ( ( rule__SpriteActor__Group__0 ) )
            // InternalKlangParser.g:186:3: ( rule__SpriteActor__Group__0 )
            {
             before(grammarAccess.getSpriteActorAccess().getGroup()); 
            // InternalKlangParser.g:187:3: ( rule__SpriteActor__Group__0 )
            // InternalKlangParser.g:187:4: rule__SpriteActor__Group__0
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
    // InternalKlangParser.g:196:1: entryRuleEventHandler : ruleEventHandler EOF ;
    public final void entryRuleEventHandler() throws RecognitionException {
        try {
            // InternalKlangParser.g:197:1: ( ruleEventHandler EOF )
            // InternalKlangParser.g:198:1: ruleEventHandler EOF
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
    // InternalKlangParser.g:205:1: ruleEventHandler : ( ( rule__EventHandler__Group__0 ) ) ;
    public final void ruleEventHandler() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:209:2: ( ( ( rule__EventHandler__Group__0 ) ) )
            // InternalKlangParser.g:210:2: ( ( rule__EventHandler__Group__0 ) )
            {
            // InternalKlangParser.g:210:2: ( ( rule__EventHandler__Group__0 ) )
            // InternalKlangParser.g:211:3: ( rule__EventHandler__Group__0 )
            {
             before(grammarAccess.getEventHandlerAccess().getGroup()); 
            // InternalKlangParser.g:212:3: ( rule__EventHandler__Group__0 )
            // InternalKlangParser.g:212:4: rule__EventHandler__Group__0
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


    // $ANTLR start "entryRuleEvent"
    // InternalKlangParser.g:221:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalKlangParser.g:222:1: ( ruleEvent EOF )
            // InternalKlangParser.g:223:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalKlangParser.g:230:1: ruleEvent : ( ( rule__Event__Alternatives ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:234:2: ( ( ( rule__Event__Alternatives ) ) )
            // InternalKlangParser.g:235:2: ( ( rule__Event__Alternatives ) )
            {
            // InternalKlangParser.g:235:2: ( ( rule__Event__Alternatives ) )
            // InternalKlangParser.g:236:3: ( rule__Event__Alternatives )
            {
             before(grammarAccess.getEventAccess().getAlternatives()); 
            // InternalKlangParser.g:237:3: ( rule__Event__Alternatives )
            // InternalKlangParser.g:237:4: rule__Event__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Event__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleMessageReceivedEvent"
    // InternalKlangParser.g:246:1: entryRuleMessageReceivedEvent : ruleMessageReceivedEvent EOF ;
    public final void entryRuleMessageReceivedEvent() throws RecognitionException {
        try {
            // InternalKlangParser.g:247:1: ( ruleMessageReceivedEvent EOF )
            // InternalKlangParser.g:248:1: ruleMessageReceivedEvent EOF
            {
             before(grammarAccess.getMessageReceivedEventRule()); 
            pushFollow(FOLLOW_1);
            ruleMessageReceivedEvent();

            state._fsp--;

             after(grammarAccess.getMessageReceivedEventRule()); 
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
    // $ANTLR end "entryRuleMessageReceivedEvent"


    // $ANTLR start "ruleMessageReceivedEvent"
    // InternalKlangParser.g:255:1: ruleMessageReceivedEvent : ( ( rule__MessageReceivedEvent__Group__0 ) ) ;
    public final void ruleMessageReceivedEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:259:2: ( ( ( rule__MessageReceivedEvent__Group__0 ) ) )
            // InternalKlangParser.g:260:2: ( ( rule__MessageReceivedEvent__Group__0 ) )
            {
            // InternalKlangParser.g:260:2: ( ( rule__MessageReceivedEvent__Group__0 ) )
            // InternalKlangParser.g:261:3: ( rule__MessageReceivedEvent__Group__0 )
            {
             before(grammarAccess.getMessageReceivedEventAccess().getGroup()); 
            // InternalKlangParser.g:262:3: ( rule__MessageReceivedEvent__Group__0 )
            // InternalKlangParser.g:262:4: rule__MessageReceivedEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MessageReceivedEvent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageReceivedEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageReceivedEvent"


    // $ANTLR start "entryRuleGameStartEvent"
    // InternalKlangParser.g:271:1: entryRuleGameStartEvent : ruleGameStartEvent EOF ;
    public final void entryRuleGameStartEvent() throws RecognitionException {
        try {
            // InternalKlangParser.g:272:1: ( ruleGameStartEvent EOF )
            // InternalKlangParser.g:273:1: ruleGameStartEvent EOF
            {
             before(grammarAccess.getGameStartEventRule()); 
            pushFollow(FOLLOW_1);
            ruleGameStartEvent();

            state._fsp--;

             after(grammarAccess.getGameStartEventRule()); 
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
    // $ANTLR end "entryRuleGameStartEvent"


    // $ANTLR start "ruleGameStartEvent"
    // InternalKlangParser.g:280:1: ruleGameStartEvent : ( ( rule__GameStartEvent__Group__0 ) ) ;
    public final void ruleGameStartEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:284:2: ( ( ( rule__GameStartEvent__Group__0 ) ) )
            // InternalKlangParser.g:285:2: ( ( rule__GameStartEvent__Group__0 ) )
            {
            // InternalKlangParser.g:285:2: ( ( rule__GameStartEvent__Group__0 ) )
            // InternalKlangParser.g:286:3: ( rule__GameStartEvent__Group__0 )
            {
             before(grammarAccess.getGameStartEventAccess().getGroup()); 
            // InternalKlangParser.g:287:3: ( rule__GameStartEvent__Group__0 )
            // InternalKlangParser.g:287:4: rule__GameStartEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GameStartEvent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGameStartEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGameStartEvent"


    // $ANTLR start "entryRuleClickEvent"
    // InternalKlangParser.g:296:1: entryRuleClickEvent : ruleClickEvent EOF ;
    public final void entryRuleClickEvent() throws RecognitionException {
        try {
            // InternalKlangParser.g:297:1: ( ruleClickEvent EOF )
            // InternalKlangParser.g:298:1: ruleClickEvent EOF
            {
             before(grammarAccess.getClickEventRule()); 
            pushFollow(FOLLOW_1);
            ruleClickEvent();

            state._fsp--;

             after(grammarAccess.getClickEventRule()); 
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
    // $ANTLR end "entryRuleClickEvent"


    // $ANTLR start "ruleClickEvent"
    // InternalKlangParser.g:305:1: ruleClickEvent : ( ( rule__ClickEvent__Group__0 ) ) ;
    public final void ruleClickEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:309:2: ( ( ( rule__ClickEvent__Group__0 ) ) )
            // InternalKlangParser.g:310:2: ( ( rule__ClickEvent__Group__0 ) )
            {
            // InternalKlangParser.g:310:2: ( ( rule__ClickEvent__Group__0 ) )
            // InternalKlangParser.g:311:3: ( rule__ClickEvent__Group__0 )
            {
             before(grammarAccess.getClickEventAccess().getGroup()); 
            // InternalKlangParser.g:312:3: ( rule__ClickEvent__Group__0 )
            // InternalKlangParser.g:312:4: rule__ClickEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClickEvent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClickEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClickEvent"


    // $ANTLR start "entryRuleKeyPressedEvent"
    // InternalKlangParser.g:321:1: entryRuleKeyPressedEvent : ruleKeyPressedEvent EOF ;
    public final void entryRuleKeyPressedEvent() throws RecognitionException {
        try {
            // InternalKlangParser.g:322:1: ( ruleKeyPressedEvent EOF )
            // InternalKlangParser.g:323:1: ruleKeyPressedEvent EOF
            {
             before(grammarAccess.getKeyPressedEventRule()); 
            pushFollow(FOLLOW_1);
            ruleKeyPressedEvent();

            state._fsp--;

             after(grammarAccess.getKeyPressedEventRule()); 
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
    // $ANTLR end "entryRuleKeyPressedEvent"


    // $ANTLR start "ruleKeyPressedEvent"
    // InternalKlangParser.g:330:1: ruleKeyPressedEvent : ( ( rule__KeyPressedEvent__Group__0 ) ) ;
    public final void ruleKeyPressedEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:334:2: ( ( ( rule__KeyPressedEvent__Group__0 ) ) )
            // InternalKlangParser.g:335:2: ( ( rule__KeyPressedEvent__Group__0 ) )
            {
            // InternalKlangParser.g:335:2: ( ( rule__KeyPressedEvent__Group__0 ) )
            // InternalKlangParser.g:336:3: ( rule__KeyPressedEvent__Group__0 )
            {
             before(grammarAccess.getKeyPressedEventAccess().getGroup()); 
            // InternalKlangParser.g:337:3: ( rule__KeyPressedEvent__Group__0 )
            // InternalKlangParser.g:337:4: rule__KeyPressedEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KeyPressedEvent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKeyPressedEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeyPressedEvent"


    // $ANTLR start "entryRuleCollisionEvent"
    // InternalKlangParser.g:346:1: entryRuleCollisionEvent : ruleCollisionEvent EOF ;
    public final void entryRuleCollisionEvent() throws RecognitionException {
        try {
            // InternalKlangParser.g:347:1: ( ruleCollisionEvent EOF )
            // InternalKlangParser.g:348:1: ruleCollisionEvent EOF
            {
             before(grammarAccess.getCollisionEventRule()); 
            pushFollow(FOLLOW_1);
            ruleCollisionEvent();

            state._fsp--;

             after(grammarAccess.getCollisionEventRule()); 
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
    // $ANTLR end "entryRuleCollisionEvent"


    // $ANTLR start "ruleCollisionEvent"
    // InternalKlangParser.g:355:1: ruleCollisionEvent : ( ( rule__CollisionEvent__Group__0 ) ) ;
    public final void ruleCollisionEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:359:2: ( ( ( rule__CollisionEvent__Group__0 ) ) )
            // InternalKlangParser.g:360:2: ( ( rule__CollisionEvent__Group__0 ) )
            {
            // InternalKlangParser.g:360:2: ( ( rule__CollisionEvent__Group__0 ) )
            // InternalKlangParser.g:361:3: ( rule__CollisionEvent__Group__0 )
            {
             before(grammarAccess.getCollisionEventAccess().getGroup()); 
            // InternalKlangParser.g:362:3: ( rule__CollisionEvent__Group__0 )
            // InternalKlangParser.g:362:4: rule__CollisionEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CollisionEvent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCollisionEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCollisionEvent"


    // $ANTLR start "entryRuleStatement"
    // InternalKlangParser.g:371:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalKlangParser.g:372:1: ( ruleStatement EOF )
            // InternalKlangParser.g:373:1: ruleStatement EOF
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
    // InternalKlangParser.g:380:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:384:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalKlangParser.g:385:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalKlangParser.g:385:2: ( ( rule__Statement__Alternatives ) )
            // InternalKlangParser.g:386:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalKlangParser.g:387:3: ( rule__Statement__Alternatives )
            // InternalKlangParser.g:387:4: rule__Statement__Alternatives
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


    // $ANTLR start "entryRuleSendMessage"
    // InternalKlangParser.g:396:1: entryRuleSendMessage : ruleSendMessage EOF ;
    public final void entryRuleSendMessage() throws RecognitionException {
        try {
            // InternalKlangParser.g:397:1: ( ruleSendMessage EOF )
            // InternalKlangParser.g:398:1: ruleSendMessage EOF
            {
             before(grammarAccess.getSendMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleSendMessage();

            state._fsp--;

             after(grammarAccess.getSendMessageRule()); 
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
    // $ANTLR end "entryRuleSendMessage"


    // $ANTLR start "ruleSendMessage"
    // InternalKlangParser.g:405:1: ruleSendMessage : ( ( rule__SendMessage__Group__0 ) ) ;
    public final void ruleSendMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:409:2: ( ( ( rule__SendMessage__Group__0 ) ) )
            // InternalKlangParser.g:410:2: ( ( rule__SendMessage__Group__0 ) )
            {
            // InternalKlangParser.g:410:2: ( ( rule__SendMessage__Group__0 ) )
            // InternalKlangParser.g:411:3: ( rule__SendMessage__Group__0 )
            {
             before(grammarAccess.getSendMessageAccess().getGroup()); 
            // InternalKlangParser.g:412:3: ( rule__SendMessage__Group__0 )
            // InternalKlangParser.g:412:4: rule__SendMessage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SendMessage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSendMessageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSendMessage"


    // $ANTLR start "entryRuleWhileLoop"
    // InternalKlangParser.g:421:1: entryRuleWhileLoop : ruleWhileLoop EOF ;
    public final void entryRuleWhileLoop() throws RecognitionException {
        try {
            // InternalKlangParser.g:422:1: ( ruleWhileLoop EOF )
            // InternalKlangParser.g:423:1: ruleWhileLoop EOF
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
    // InternalKlangParser.g:430:1: ruleWhileLoop : ( ( rule__WhileLoop__Group__0 ) ) ;
    public final void ruleWhileLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:434:2: ( ( ( rule__WhileLoop__Group__0 ) ) )
            // InternalKlangParser.g:435:2: ( ( rule__WhileLoop__Group__0 ) )
            {
            // InternalKlangParser.g:435:2: ( ( rule__WhileLoop__Group__0 ) )
            // InternalKlangParser.g:436:3: ( rule__WhileLoop__Group__0 )
            {
             before(grammarAccess.getWhileLoopAccess().getGroup()); 
            // InternalKlangParser.g:437:3: ( rule__WhileLoop__Group__0 )
            // InternalKlangParser.g:437:4: rule__WhileLoop__Group__0
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
    // InternalKlangParser.g:446:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // InternalKlangParser.g:447:1: ( ruleIf EOF )
            // InternalKlangParser.g:448:1: ruleIf EOF
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
    // InternalKlangParser.g:455:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:459:2: ( ( ( rule__If__Group__0 ) ) )
            // InternalKlangParser.g:460:2: ( ( rule__If__Group__0 ) )
            {
            // InternalKlangParser.g:460:2: ( ( rule__If__Group__0 ) )
            // InternalKlangParser.g:461:3: ( rule__If__Group__0 )
            {
             before(grammarAccess.getIfAccess().getGroup()); 
            // InternalKlangParser.g:462:3: ( rule__If__Group__0 )
            // InternalKlangParser.g:462:4: rule__If__Group__0
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
    // InternalKlangParser.g:471:1: entryRuleForeverLoop : ruleForeverLoop EOF ;
    public final void entryRuleForeverLoop() throws RecognitionException {
        try {
            // InternalKlangParser.g:472:1: ( ruleForeverLoop EOF )
            // InternalKlangParser.g:473:1: ruleForeverLoop EOF
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
    // InternalKlangParser.g:480:1: ruleForeverLoop : ( ( rule__ForeverLoop__Group__0 ) ) ;
    public final void ruleForeverLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:484:2: ( ( ( rule__ForeverLoop__Group__0 ) ) )
            // InternalKlangParser.g:485:2: ( ( rule__ForeverLoop__Group__0 ) )
            {
            // InternalKlangParser.g:485:2: ( ( rule__ForeverLoop__Group__0 ) )
            // InternalKlangParser.g:486:3: ( rule__ForeverLoop__Group__0 )
            {
             before(grammarAccess.getForeverLoopAccess().getGroup()); 
            // InternalKlangParser.g:487:3: ( rule__ForeverLoop__Group__0 )
            // InternalKlangParser.g:487:4: rule__ForeverLoop__Group__0
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
    // InternalKlangParser.g:496:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // InternalKlangParser.g:497:1: ( ruleVariableDeclaration EOF )
            // InternalKlangParser.g:498:1: ruleVariableDeclaration EOF
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
    // InternalKlangParser.g:505:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:509:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // InternalKlangParser.g:510:2: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // InternalKlangParser.g:510:2: ( ( rule__VariableDeclaration__Group__0 ) )
            // InternalKlangParser.g:511:3: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // InternalKlangParser.g:512:3: ( rule__VariableDeclaration__Group__0 )
            // InternalKlangParser.g:512:4: rule__VariableDeclaration__Group__0
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
    // InternalKlangParser.g:521:1: entryRuleVariableAssignment : ruleVariableAssignment EOF ;
    public final void entryRuleVariableAssignment() throws RecognitionException {
        try {
            // InternalKlangParser.g:522:1: ( ruleVariableAssignment EOF )
            // InternalKlangParser.g:523:1: ruleVariableAssignment EOF
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
    // InternalKlangParser.g:530:1: ruleVariableAssignment : ( ( rule__VariableAssignment__Group__0 ) ) ;
    public final void ruleVariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:534:2: ( ( ( rule__VariableAssignment__Group__0 ) ) )
            // InternalKlangParser.g:535:2: ( ( rule__VariableAssignment__Group__0 ) )
            {
            // InternalKlangParser.g:535:2: ( ( rule__VariableAssignment__Group__0 ) )
            // InternalKlangParser.g:536:3: ( rule__VariableAssignment__Group__0 )
            {
             before(grammarAccess.getVariableAssignmentAccess().getGroup()); 
            // InternalKlangParser.g:537:3: ( rule__VariableAssignment__Group__0 )
            // InternalKlangParser.g:537:4: rule__VariableAssignment__Group__0
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
    // InternalKlangParser.g:546:1: entryRuleSleep : ruleSleep EOF ;
    public final void entryRuleSleep() throws RecognitionException {
        try {
            // InternalKlangParser.g:547:1: ( ruleSleep EOF )
            // InternalKlangParser.g:548:1: ruleSleep EOF
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
    // InternalKlangParser.g:555:1: ruleSleep : ( ( rule__Sleep__Group__0 ) ) ;
    public final void ruleSleep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:559:2: ( ( ( rule__Sleep__Group__0 ) ) )
            // InternalKlangParser.g:560:2: ( ( rule__Sleep__Group__0 ) )
            {
            // InternalKlangParser.g:560:2: ( ( rule__Sleep__Group__0 ) )
            // InternalKlangParser.g:561:3: ( rule__Sleep__Group__0 )
            {
             before(grammarAccess.getSleepAccess().getGroup()); 
            // InternalKlangParser.g:562:3: ( rule__Sleep__Group__0 )
            // InternalKlangParser.g:562:4: rule__Sleep__Group__0
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
    // InternalKlangParser.g:571:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalKlangParser.g:572:1: ( ruleExpression EOF )
            // InternalKlangParser.g:573:1: ruleExpression EOF
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
    // InternalKlangParser.g:580:1: ruleExpression : ( ruleOr ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:584:2: ( ( ruleOr ) )
            // InternalKlangParser.g:585:2: ( ruleOr )
            {
            // InternalKlangParser.g:585:2: ( ruleOr )
            // InternalKlangParser.g:586:3: ruleOr
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
    // InternalKlangParser.g:596:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalKlangParser.g:597:1: ( ruleOr EOF )
            // InternalKlangParser.g:598:1: ruleOr EOF
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
    // InternalKlangParser.g:605:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:609:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalKlangParser.g:610:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalKlangParser.g:610:2: ( ( rule__Or__Group__0 ) )
            // InternalKlangParser.g:611:3: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // InternalKlangParser.g:612:3: ( rule__Or__Group__0 )
            // InternalKlangParser.g:612:4: rule__Or__Group__0
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
    // InternalKlangParser.g:621:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalKlangParser.g:622:1: ( ruleAnd EOF )
            // InternalKlangParser.g:623:1: ruleAnd EOF
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
    // InternalKlangParser.g:630:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:634:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalKlangParser.g:635:2: ( ( rule__And__Group__0 ) )
            {
            // InternalKlangParser.g:635:2: ( ( rule__And__Group__0 ) )
            // InternalKlangParser.g:636:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalKlangParser.g:637:3: ( rule__And__Group__0 )
            // InternalKlangParser.g:637:4: rule__And__Group__0
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
    // InternalKlangParser.g:646:1: entryRulePlus : rulePlus EOF ;
    public final void entryRulePlus() throws RecognitionException {
        try {
            // InternalKlangParser.g:647:1: ( rulePlus EOF )
            // InternalKlangParser.g:648:1: rulePlus EOF
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
    // InternalKlangParser.g:655:1: rulePlus : ( ( rule__Plus__Group__0 ) ) ;
    public final void rulePlus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:659:2: ( ( ( rule__Plus__Group__0 ) ) )
            // InternalKlangParser.g:660:2: ( ( rule__Plus__Group__0 ) )
            {
            // InternalKlangParser.g:660:2: ( ( rule__Plus__Group__0 ) )
            // InternalKlangParser.g:661:3: ( rule__Plus__Group__0 )
            {
             before(grammarAccess.getPlusAccess().getGroup()); 
            // InternalKlangParser.g:662:3: ( rule__Plus__Group__0 )
            // InternalKlangParser.g:662:4: rule__Plus__Group__0
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
    // InternalKlangParser.g:671:1: entryRuleMinus : ruleMinus EOF ;
    public final void entryRuleMinus() throws RecognitionException {
        try {
            // InternalKlangParser.g:672:1: ( ruleMinus EOF )
            // InternalKlangParser.g:673:1: ruleMinus EOF
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
    // InternalKlangParser.g:680:1: ruleMinus : ( ( rule__Minus__Group__0 ) ) ;
    public final void ruleMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:684:2: ( ( ( rule__Minus__Group__0 ) ) )
            // InternalKlangParser.g:685:2: ( ( rule__Minus__Group__0 ) )
            {
            // InternalKlangParser.g:685:2: ( ( rule__Minus__Group__0 ) )
            // InternalKlangParser.g:686:3: ( rule__Minus__Group__0 )
            {
             before(grammarAccess.getMinusAccess().getGroup()); 
            // InternalKlangParser.g:687:3: ( rule__Minus__Group__0 )
            // InternalKlangParser.g:687:4: rule__Minus__Group__0
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
    // InternalKlangParser.g:696:1: entryRuleMultiply : ruleMultiply EOF ;
    public final void entryRuleMultiply() throws RecognitionException {
        try {
            // InternalKlangParser.g:697:1: ( ruleMultiply EOF )
            // InternalKlangParser.g:698:1: ruleMultiply EOF
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
    // InternalKlangParser.g:705:1: ruleMultiply : ( ( rule__Multiply__Group__0 ) ) ;
    public final void ruleMultiply() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:709:2: ( ( ( rule__Multiply__Group__0 ) ) )
            // InternalKlangParser.g:710:2: ( ( rule__Multiply__Group__0 ) )
            {
            // InternalKlangParser.g:710:2: ( ( rule__Multiply__Group__0 ) )
            // InternalKlangParser.g:711:3: ( rule__Multiply__Group__0 )
            {
             before(grammarAccess.getMultiplyAccess().getGroup()); 
            // InternalKlangParser.g:712:3: ( rule__Multiply__Group__0 )
            // InternalKlangParser.g:712:4: rule__Multiply__Group__0
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
    // InternalKlangParser.g:721:1: entryRuleDivide : ruleDivide EOF ;
    public final void entryRuleDivide() throws RecognitionException {
        try {
            // InternalKlangParser.g:722:1: ( ruleDivide EOF )
            // InternalKlangParser.g:723:1: ruleDivide EOF
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
    // InternalKlangParser.g:730:1: ruleDivide : ( ( rule__Divide__Group__0 ) ) ;
    public final void ruleDivide() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:734:2: ( ( ( rule__Divide__Group__0 ) ) )
            // InternalKlangParser.g:735:2: ( ( rule__Divide__Group__0 ) )
            {
            // InternalKlangParser.g:735:2: ( ( rule__Divide__Group__0 ) )
            // InternalKlangParser.g:736:3: ( rule__Divide__Group__0 )
            {
             before(grammarAccess.getDivideAccess().getGroup()); 
            // InternalKlangParser.g:737:3: ( rule__Divide__Group__0 )
            // InternalKlangParser.g:737:4: rule__Divide__Group__0
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
    // InternalKlangParser.g:746:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalKlangParser.g:747:1: ( ruleComparison EOF )
            // InternalKlangParser.g:748:1: ruleComparison EOF
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
    // InternalKlangParser.g:755:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:759:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalKlangParser.g:760:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalKlangParser.g:760:2: ( ( rule__Comparison__Group__0 ) )
            // InternalKlangParser.g:761:3: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // InternalKlangParser.g:762:3: ( rule__Comparison__Group__0 )
            // InternalKlangParser.g:762:4: rule__Comparison__Group__0
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
    // InternalKlangParser.g:771:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // InternalKlangParser.g:772:1: ( ruleFunctionCall EOF )
            // InternalKlangParser.g:773:1: ruleFunctionCall EOF
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
    // InternalKlangParser.g:780:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:784:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // InternalKlangParser.g:785:2: ( ( rule__FunctionCall__Group__0 ) )
            {
            // InternalKlangParser.g:785:2: ( ( rule__FunctionCall__Group__0 ) )
            // InternalKlangParser.g:786:3: ( rule__FunctionCall__Group__0 )
            {
             before(grammarAccess.getFunctionCallAccess().getGroup()); 
            // InternalKlangParser.g:787:3: ( rule__FunctionCall__Group__0 )
            // InternalKlangParser.g:787:4: rule__FunctionCall__Group__0
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
    // InternalKlangParser.g:796:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalKlangParser.g:797:1: ( rulePrimaryExpression EOF )
            // InternalKlangParser.g:798:1: rulePrimaryExpression EOF
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
    // InternalKlangParser.g:805:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:809:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalKlangParser.g:810:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalKlangParser.g:810:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalKlangParser.g:811:3: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // InternalKlangParser.g:812:3: ( rule__PrimaryExpression__Alternatives )
            // InternalKlangParser.g:812:4: rule__PrimaryExpression__Alternatives
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
    // InternalKlangParser.g:821:1: entryRuleAtomicExpression : ruleAtomicExpression EOF ;
    public final void entryRuleAtomicExpression() throws RecognitionException {
        try {
            // InternalKlangParser.g:822:1: ( ruleAtomicExpression EOF )
            // InternalKlangParser.g:823:1: ruleAtomicExpression EOF
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
    // InternalKlangParser.g:830:1: ruleAtomicExpression : ( ( rule__AtomicExpression__Alternatives ) ) ;
    public final void ruleAtomicExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:834:2: ( ( ( rule__AtomicExpression__Alternatives ) ) )
            // InternalKlangParser.g:835:2: ( ( rule__AtomicExpression__Alternatives ) )
            {
            // InternalKlangParser.g:835:2: ( ( rule__AtomicExpression__Alternatives ) )
            // InternalKlangParser.g:836:3: ( rule__AtomicExpression__Alternatives )
            {
             before(grammarAccess.getAtomicExpressionAccess().getAlternatives()); 
            // InternalKlangParser.g:837:3: ( rule__AtomicExpression__Alternatives )
            // InternalKlangParser.g:837:4: rule__AtomicExpression__Alternatives
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
    // InternalKlangParser.g:846:1: entryRuleDECIMAL : ruleDECIMAL EOF ;
    public final void entryRuleDECIMAL() throws RecognitionException {
        try {
            // InternalKlangParser.g:847:1: ( ruleDECIMAL EOF )
            // InternalKlangParser.g:848:1: ruleDECIMAL EOF
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
    // InternalKlangParser.g:855:1: ruleDECIMAL : ( ( rule__DECIMAL__Group__0 ) ) ;
    public final void ruleDECIMAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:859:2: ( ( ( rule__DECIMAL__Group__0 ) ) )
            // InternalKlangParser.g:860:2: ( ( rule__DECIMAL__Group__0 ) )
            {
            // InternalKlangParser.g:860:2: ( ( rule__DECIMAL__Group__0 ) )
            // InternalKlangParser.g:861:3: ( rule__DECIMAL__Group__0 )
            {
             before(grammarAccess.getDECIMALAccess().getGroup()); 
            // InternalKlangParser.g:862:3: ( rule__DECIMAL__Group__0 )
            // InternalKlangParser.g:862:4: rule__DECIMAL__Group__0
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


    // $ANTLR start "ruleKeys"
    // InternalKlangParser.g:871:1: ruleKeys : ( ( rule__Keys__Alternatives ) ) ;
    public final void ruleKeys() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:875:1: ( ( ( rule__Keys__Alternatives ) ) )
            // InternalKlangParser.g:876:2: ( ( rule__Keys__Alternatives ) )
            {
            // InternalKlangParser.g:876:2: ( ( rule__Keys__Alternatives ) )
            // InternalKlangParser.g:877:3: ( rule__Keys__Alternatives )
            {
             before(grammarAccess.getKeysAccess().getAlternatives()); 
            // InternalKlangParser.g:878:3: ( rule__Keys__Alternatives )
            // InternalKlangParser.g:878:4: rule__Keys__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Keys__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getKeysAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeys"


    // $ANTLR start "rule__Event__Alternatives"
    // InternalKlangParser.g:886:1: rule__Event__Alternatives : ( ( ruleCollisionEvent ) | ( ruleKeyPressedEvent ) | ( ruleMessageReceivedEvent ) | ( ruleGameStartEvent ) | ( ruleClickEvent ) );
    public final void rule__Event__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:890:1: ( ( ruleCollisionEvent ) | ( ruleKeyPressedEvent ) | ( ruleMessageReceivedEvent ) | ( ruleGameStartEvent ) | ( ruleClickEvent ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case Collides:
                {
                alt1=1;
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
                alt1=2;
                }
                break;
            case RULE_STRING:
                {
                alt1=3;
                }
                break;
            case Game:
                {
                alt1=4;
                }
                break;
            case Clicked:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalKlangParser.g:891:2: ( ruleCollisionEvent )
                    {
                    // InternalKlangParser.g:891:2: ( ruleCollisionEvent )
                    // InternalKlangParser.g:892:3: ruleCollisionEvent
                    {
                     before(grammarAccess.getEventAccess().getCollisionEventParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCollisionEvent();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getCollisionEventParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKlangParser.g:897:2: ( ruleKeyPressedEvent )
                    {
                    // InternalKlangParser.g:897:2: ( ruleKeyPressedEvent )
                    // InternalKlangParser.g:898:3: ruleKeyPressedEvent
                    {
                     before(grammarAccess.getEventAccess().getKeyPressedEventParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleKeyPressedEvent();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getKeyPressedEventParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKlangParser.g:903:2: ( ruleMessageReceivedEvent )
                    {
                    // InternalKlangParser.g:903:2: ( ruleMessageReceivedEvent )
                    // InternalKlangParser.g:904:3: ruleMessageReceivedEvent
                    {
                     before(grammarAccess.getEventAccess().getMessageReceivedEventParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMessageReceivedEvent();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getMessageReceivedEventParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalKlangParser.g:909:2: ( ruleGameStartEvent )
                    {
                    // InternalKlangParser.g:909:2: ( ruleGameStartEvent )
                    // InternalKlangParser.g:910:3: ruleGameStartEvent
                    {
                     before(grammarAccess.getEventAccess().getGameStartEventParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleGameStartEvent();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getGameStartEventParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalKlangParser.g:915:2: ( ruleClickEvent )
                    {
                    // InternalKlangParser.g:915:2: ( ruleClickEvent )
                    // InternalKlangParser.g:916:3: ruleClickEvent
                    {
                     before(grammarAccess.getEventAccess().getClickEventParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleClickEvent();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getClickEventParserRuleCall_4()); 

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
    // $ANTLR end "rule__Event__Alternatives"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalKlangParser.g:925:1: rule__Statement__Alternatives : ( ( ruleWhileLoop ) | ( ruleIf ) | ( ruleVariableAssignment ) | ( ruleForeverLoop ) | ( ruleFunctionCall ) | ( ruleSleep ) | ( ruleSendMessage ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:929:1: ( ( ruleWhileLoop ) | ( ruleIf ) | ( ruleVariableAssignment ) | ( ruleForeverLoop ) | ( ruleFunctionCall ) | ( ruleSleep ) | ( ruleSendMessage ) )
            int alt2=7;
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
            case SendMessage:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalKlangParser.g:930:2: ( ruleWhileLoop )
                    {
                    // InternalKlangParser.g:930:2: ( ruleWhileLoop )
                    // InternalKlangParser.g:931:3: ruleWhileLoop
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
                    // InternalKlangParser.g:936:2: ( ruleIf )
                    {
                    // InternalKlangParser.g:936:2: ( ruleIf )
                    // InternalKlangParser.g:937:3: ruleIf
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
                    // InternalKlangParser.g:942:2: ( ruleVariableAssignment )
                    {
                    // InternalKlangParser.g:942:2: ( ruleVariableAssignment )
                    // InternalKlangParser.g:943:3: ruleVariableAssignment
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
                    // InternalKlangParser.g:948:2: ( ruleForeverLoop )
                    {
                    // InternalKlangParser.g:948:2: ( ruleForeverLoop )
                    // InternalKlangParser.g:949:3: ruleForeverLoop
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
                    // InternalKlangParser.g:954:2: ( ruleFunctionCall )
                    {
                    // InternalKlangParser.g:954:2: ( ruleFunctionCall )
                    // InternalKlangParser.g:955:3: ruleFunctionCall
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
                    // InternalKlangParser.g:960:2: ( ruleSleep )
                    {
                    // InternalKlangParser.g:960:2: ( ruleSleep )
                    // InternalKlangParser.g:961:3: ruleSleep
                    {
                     before(grammarAccess.getStatementAccess().getSleepParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleSleep();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSleepParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalKlangParser.g:966:2: ( ruleSendMessage )
                    {
                    // InternalKlangParser.g:966:2: ( ruleSendMessage )
                    // InternalKlangParser.g:967:3: ruleSendMessage
                    {
                     before(grammarAccess.getStatementAccess().getSendMessageParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleSendMessage();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSendMessageParserRuleCall_6()); 

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
    // InternalKlangParser.g:976:1: rule__Comparison__Alternatives_1_0 : ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) | ( ( rule__Comparison__Group_1_0_2__0 ) ) | ( ( rule__Comparison__Group_1_0_3__0 ) ) | ( ( rule__Comparison__Group_1_0_4__0 ) ) );
    public final void rule__Comparison__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:980:1: ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) | ( ( rule__Comparison__Group_1_0_2__0 ) ) | ( ( rule__Comparison__Group_1_0_3__0 ) ) | ( ( rule__Comparison__Group_1_0_4__0 ) ) )
            int alt3=5;
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
            case LessThanSignEqualsSign:
                {
                alt3=4;
                }
                break;
            case GreaterThanSignEqualsSign:
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
                    // InternalKlangParser.g:981:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    {
                    // InternalKlangParser.g:981:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    // InternalKlangParser.g:982:3: ( rule__Comparison__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0_0()); 
                    // InternalKlangParser.g:983:3: ( rule__Comparison__Group_1_0_0__0 )
                    // InternalKlangParser.g:983:4: rule__Comparison__Group_1_0_0__0
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
                    // InternalKlangParser.g:987:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    {
                    // InternalKlangParser.g:987:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    // InternalKlangParser.g:988:3: ( rule__Comparison__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0_1()); 
                    // InternalKlangParser.g:989:3: ( rule__Comparison__Group_1_0_1__0 )
                    // InternalKlangParser.g:989:4: rule__Comparison__Group_1_0_1__0
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
                    // InternalKlangParser.g:993:2: ( ( rule__Comparison__Group_1_0_2__0 ) )
                    {
                    // InternalKlangParser.g:993:2: ( ( rule__Comparison__Group_1_0_2__0 ) )
                    // InternalKlangParser.g:994:3: ( rule__Comparison__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0_2()); 
                    // InternalKlangParser.g:995:3: ( rule__Comparison__Group_1_0_2__0 )
                    // InternalKlangParser.g:995:4: rule__Comparison__Group_1_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonAccess().getGroup_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalKlangParser.g:999:2: ( ( rule__Comparison__Group_1_0_3__0 ) )
                    {
                    // InternalKlangParser.g:999:2: ( ( rule__Comparison__Group_1_0_3__0 ) )
                    // InternalKlangParser.g:1000:3: ( rule__Comparison__Group_1_0_3__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0_3()); 
                    // InternalKlangParser.g:1001:3: ( rule__Comparison__Group_1_0_3__0 )
                    // InternalKlangParser.g:1001:4: rule__Comparison__Group_1_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1_0_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonAccess().getGroup_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalKlangParser.g:1005:2: ( ( rule__Comparison__Group_1_0_4__0 ) )
                    {
                    // InternalKlangParser.g:1005:2: ( ( rule__Comparison__Group_1_0_4__0 ) )
                    // InternalKlangParser.g:1006:3: ( rule__Comparison__Group_1_0_4__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0_4()); 
                    // InternalKlangParser.g:1007:3: ( rule__Comparison__Group_1_0_4__0 )
                    // InternalKlangParser.g:1007:4: rule__Comparison__Group_1_0_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1_0_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonAccess().getGroup_1_0_4()); 

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
    // InternalKlangParser.g:1015:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) | ( ruleFunctionCall ) | ( ruleAtomicExpression ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1019:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) | ( ruleFunctionCall ) | ( ruleAtomicExpression ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt4=1;
                }
                break;
            case Not:
                {
                alt4=2;
                }
                break;
            case HyphenMinus:
                {
                alt4=3;
                }
                break;
            case Double:
                {
                alt4=4;
                }
                break;
            case Int:
                {
                alt4=5;
                }
                break;
            case RULE_ID:
                {
                int LA4_6 = input.LA(2);

                if ( (LA4_6==EOF||LA4_6==SendMessage||LA4_6==Forever||(LA4_6>=Sleep && LA4_6<=While)||LA4_6==When||LA4_6==And||(LA4_6>=Var && LA4_6<=Or)||(LA4_6>=RightParenthesis && LA4_6<=HyphenMinus)||(LA4_6>=Solidus && LA4_6<=LessThanSign)||LA4_6==GreaterThanSign||(LA4_6>=RULE_BEGIN && LA4_6<=RULE_ID)) ) {
                    alt4=7;
                }
                else if ( (LA4_6==LeftParenthesis) ) {
                    alt4=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 6, input);

                    throw nvae;
                }
                }
                break;
            case False:
            case True:
            case RULE_INT:
            case RULE_STRING:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalKlangParser.g:1020:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // InternalKlangParser.g:1020:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // InternalKlangParser.g:1021:3: ( rule__PrimaryExpression__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    // InternalKlangParser.g:1022:3: ( rule__PrimaryExpression__Group_0__0 )
                    // InternalKlangParser.g:1022:4: rule__PrimaryExpression__Group_0__0
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
                    // InternalKlangParser.g:1026:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    {
                    // InternalKlangParser.g:1026:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    // InternalKlangParser.g:1027:3: ( rule__PrimaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
                    // InternalKlangParser.g:1028:3: ( rule__PrimaryExpression__Group_1__0 )
                    // InternalKlangParser.g:1028:4: rule__PrimaryExpression__Group_1__0
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
                    // InternalKlangParser.g:1032:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    {
                    // InternalKlangParser.g:1032:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    // InternalKlangParser.g:1033:3: ( rule__PrimaryExpression__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    // InternalKlangParser.g:1034:3: ( rule__PrimaryExpression__Group_2__0 )
                    // InternalKlangParser.g:1034:4: rule__PrimaryExpression__Group_2__0
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
                    // InternalKlangParser.g:1038:2: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    {
                    // InternalKlangParser.g:1038:2: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    // InternalKlangParser.g:1039:3: ( rule__PrimaryExpression__Group_3__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_3()); 
                    // InternalKlangParser.g:1040:3: ( rule__PrimaryExpression__Group_3__0 )
                    // InternalKlangParser.g:1040:4: rule__PrimaryExpression__Group_3__0
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
                    // InternalKlangParser.g:1044:2: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    {
                    // InternalKlangParser.g:1044:2: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    // InternalKlangParser.g:1045:3: ( rule__PrimaryExpression__Group_4__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_4()); 
                    // InternalKlangParser.g:1046:3: ( rule__PrimaryExpression__Group_4__0 )
                    // InternalKlangParser.g:1046:4: rule__PrimaryExpression__Group_4__0
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
                    // InternalKlangParser.g:1050:2: ( ruleFunctionCall )
                    {
                    // InternalKlangParser.g:1050:2: ( ruleFunctionCall )
                    // InternalKlangParser.g:1051:3: ruleFunctionCall
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
                    // InternalKlangParser.g:1056:2: ( ruleAtomicExpression )
                    {
                    // InternalKlangParser.g:1056:2: ( ruleAtomicExpression )
                    // InternalKlangParser.g:1057:3: ruleAtomicExpression
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
    // InternalKlangParser.g:1066:1: rule__AtomicExpression__Alternatives : ( ( ( rule__AtomicExpression__Group_0__0 ) ) | ( ( rule__AtomicExpression__Group_1__0 ) ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) | ( ( rule__AtomicExpression__Group_4__0 ) ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1070:1: ( ( ( rule__AtomicExpression__Group_0__0 ) ) | ( ( rule__AtomicExpression__Group_1__0 ) ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) | ( ( rule__AtomicExpression__Group_4__0 ) ) )
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
                else if ( (LA5_2==EOF||LA5_2==SendMessage||LA5_2==Forever||(LA5_2>=Sleep && LA5_2<=While)||LA5_2==When||LA5_2==And||(LA5_2>=Var && LA5_2<=Or)||(LA5_2>=RightParenthesis && LA5_2<=HyphenMinus)||(LA5_2>=Solidus && LA5_2<=LessThanSign)||LA5_2==GreaterThanSign||(LA5_2>=RULE_BEGIN && LA5_2<=RULE_ID)) ) {
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
                    // InternalKlangParser.g:1071:2: ( ( rule__AtomicExpression__Group_0__0 ) )
                    {
                    // InternalKlangParser.g:1071:2: ( ( rule__AtomicExpression__Group_0__0 ) )
                    // InternalKlangParser.g:1072:3: ( rule__AtomicExpression__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getGroup_0()); 
                    // InternalKlangParser.g:1073:3: ( rule__AtomicExpression__Group_0__0 )
                    // InternalKlangParser.g:1073:4: rule__AtomicExpression__Group_0__0
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
                    // InternalKlangParser.g:1077:2: ( ( rule__AtomicExpression__Group_1__0 ) )
                    {
                    // InternalKlangParser.g:1077:2: ( ( rule__AtomicExpression__Group_1__0 ) )
                    // InternalKlangParser.g:1078:3: ( rule__AtomicExpression__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getGroup_1()); 
                    // InternalKlangParser.g:1079:3: ( rule__AtomicExpression__Group_1__0 )
                    // InternalKlangParser.g:1079:4: rule__AtomicExpression__Group_1__0
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
                    // InternalKlangParser.g:1083:2: ( ( rule__AtomicExpression__Group_2__0 ) )
                    {
                    // InternalKlangParser.g:1083:2: ( ( rule__AtomicExpression__Group_2__0 ) )
                    // InternalKlangParser.g:1084:3: ( rule__AtomicExpression__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getGroup_2()); 
                    // InternalKlangParser.g:1085:3: ( rule__AtomicExpression__Group_2__0 )
                    // InternalKlangParser.g:1085:4: rule__AtomicExpression__Group_2__0
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
                    // InternalKlangParser.g:1089:2: ( ( rule__AtomicExpression__Group_3__0 ) )
                    {
                    // InternalKlangParser.g:1089:2: ( ( rule__AtomicExpression__Group_3__0 ) )
                    // InternalKlangParser.g:1090:3: ( rule__AtomicExpression__Group_3__0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getGroup_3()); 
                    // InternalKlangParser.g:1091:3: ( rule__AtomicExpression__Group_3__0 )
                    // InternalKlangParser.g:1091:4: rule__AtomicExpression__Group_3__0
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
                    // InternalKlangParser.g:1095:2: ( ( rule__AtomicExpression__Group_4__0 ) )
                    {
                    // InternalKlangParser.g:1095:2: ( ( rule__AtomicExpression__Group_4__0 ) )
                    // InternalKlangParser.g:1096:3: ( rule__AtomicExpression__Group_4__0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getGroup_4()); 
                    // InternalKlangParser.g:1097:3: ( rule__AtomicExpression__Group_4__0 )
                    // InternalKlangParser.g:1097:4: rule__AtomicExpression__Group_4__0
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
    // InternalKlangParser.g:1105:1: rule__AtomicExpression__Alternatives_0_1 : ( ( ( rule__AtomicExpression__ValueAssignment_0_1_0 ) ) | ( False ) );
    public final void rule__AtomicExpression__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1109:1: ( ( ( rule__AtomicExpression__ValueAssignment_0_1_0 ) ) | ( False ) )
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
                    // InternalKlangParser.g:1110:2: ( ( rule__AtomicExpression__ValueAssignment_0_1_0 ) )
                    {
                    // InternalKlangParser.g:1110:2: ( ( rule__AtomicExpression__ValueAssignment_0_1_0 ) )
                    // InternalKlangParser.g:1111:3: ( rule__AtomicExpression__ValueAssignment_0_1_0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getValueAssignment_0_1_0()); 
                    // InternalKlangParser.g:1112:3: ( rule__AtomicExpression__ValueAssignment_0_1_0 )
                    // InternalKlangParser.g:1112:4: rule__AtomicExpression__ValueAssignment_0_1_0
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
                    // InternalKlangParser.g:1116:2: ( False )
                    {
                    // InternalKlangParser.g:1116:2: ( False )
                    // InternalKlangParser.g:1117:3: False
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


    // $ANTLR start "rule__Keys__Alternatives"
    // InternalKlangParser.g:1126:1: rule__Keys__Alternatives : ( ( ( A ) ) | ( ( B ) ) | ( ( C ) ) | ( ( D ) ) | ( ( E ) ) | ( ( F ) ) | ( ( G ) ) | ( ( H ) ) | ( ( I ) ) | ( ( J ) ) | ( ( K ) ) | ( ( L ) ) | ( ( M ) ) | ( ( N ) ) | ( ( O ) ) | ( ( P ) ) | ( ( Q ) ) | ( ( R ) ) | ( ( S ) ) | ( ( T ) ) | ( ( U ) ) | ( ( V ) ) | ( ( W ) ) | ( ( X ) ) | ( ( Y ) ) | ( ( Z ) ) | ( ( SPACE ) ) | ( ( ENTER ) ) );
    public final void rule__Keys__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1130:1: ( ( ( A ) ) | ( ( B ) ) | ( ( C ) ) | ( ( D ) ) | ( ( E ) ) | ( ( F ) ) | ( ( G ) ) | ( ( H ) ) | ( ( I ) ) | ( ( J ) ) | ( ( K ) ) | ( ( L ) ) | ( ( M ) ) | ( ( N ) ) | ( ( O ) ) | ( ( P ) ) | ( ( Q ) ) | ( ( R ) ) | ( ( S ) ) | ( ( T ) ) | ( ( U ) ) | ( ( V ) ) | ( ( W ) ) | ( ( X ) ) | ( ( Y ) ) | ( ( Z ) ) | ( ( SPACE ) ) | ( ( ENTER ) ) )
            int alt7=28;
            switch ( input.LA(1) ) {
            case A:
                {
                alt7=1;
                }
                break;
            case B:
                {
                alt7=2;
                }
                break;
            case C:
                {
                alt7=3;
                }
                break;
            case D:
                {
                alt7=4;
                }
                break;
            case E:
                {
                alt7=5;
                }
                break;
            case F:
                {
                alt7=6;
                }
                break;
            case G:
                {
                alt7=7;
                }
                break;
            case H:
                {
                alt7=8;
                }
                break;
            case I:
                {
                alt7=9;
                }
                break;
            case J:
                {
                alt7=10;
                }
                break;
            case K:
                {
                alt7=11;
                }
                break;
            case L:
                {
                alt7=12;
                }
                break;
            case M:
                {
                alt7=13;
                }
                break;
            case N:
                {
                alt7=14;
                }
                break;
            case O:
                {
                alt7=15;
                }
                break;
            case P:
                {
                alt7=16;
                }
                break;
            case Q:
                {
                alt7=17;
                }
                break;
            case R:
                {
                alt7=18;
                }
                break;
            case S:
                {
                alt7=19;
                }
                break;
            case T:
                {
                alt7=20;
                }
                break;
            case U:
                {
                alt7=21;
                }
                break;
            case V:
                {
                alt7=22;
                }
                break;
            case W:
                {
                alt7=23;
                }
                break;
            case X:
                {
                alt7=24;
                }
                break;
            case Y:
                {
                alt7=25;
                }
                break;
            case Z:
                {
                alt7=26;
                }
                break;
            case SPACE:
                {
                alt7=27;
                }
                break;
            case ENTER:
                {
                alt7=28;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalKlangParser.g:1131:2: ( ( A ) )
                    {
                    // InternalKlangParser.g:1131:2: ( ( A ) )
                    // InternalKlangParser.g:1132:3: ( A )
                    {
                     before(grammarAccess.getKeysAccess().getAEnumLiteralDeclaration_0()); 
                    // InternalKlangParser.g:1133:3: ( A )
                    // InternalKlangParser.g:1133:4: A
                    {
                    match(input,A,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKlangParser.g:1137:2: ( ( B ) )
                    {
                    // InternalKlangParser.g:1137:2: ( ( B ) )
                    // InternalKlangParser.g:1138:3: ( B )
                    {
                     before(grammarAccess.getKeysAccess().getBEnumLiteralDeclaration_1()); 
                    // InternalKlangParser.g:1139:3: ( B )
                    // InternalKlangParser.g:1139:4: B
                    {
                    match(input,B,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getBEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKlangParser.g:1143:2: ( ( C ) )
                    {
                    // InternalKlangParser.g:1143:2: ( ( C ) )
                    // InternalKlangParser.g:1144:3: ( C )
                    {
                     before(grammarAccess.getKeysAccess().getCEnumLiteralDeclaration_2()); 
                    // InternalKlangParser.g:1145:3: ( C )
                    // InternalKlangParser.g:1145:4: C
                    {
                    match(input,C,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getCEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalKlangParser.g:1149:2: ( ( D ) )
                    {
                    // InternalKlangParser.g:1149:2: ( ( D ) )
                    // InternalKlangParser.g:1150:3: ( D )
                    {
                     before(grammarAccess.getKeysAccess().getDEnumLiteralDeclaration_3()); 
                    // InternalKlangParser.g:1151:3: ( D )
                    // InternalKlangParser.g:1151:4: D
                    {
                    match(input,D,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalKlangParser.g:1155:2: ( ( E ) )
                    {
                    // InternalKlangParser.g:1155:2: ( ( E ) )
                    // InternalKlangParser.g:1156:3: ( E )
                    {
                     before(grammarAccess.getKeysAccess().getEEnumLiteralDeclaration_4()); 
                    // InternalKlangParser.g:1157:3: ( E )
                    // InternalKlangParser.g:1157:4: E
                    {
                    match(input,E,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalKlangParser.g:1161:2: ( ( F ) )
                    {
                    // InternalKlangParser.g:1161:2: ( ( F ) )
                    // InternalKlangParser.g:1162:3: ( F )
                    {
                     before(grammarAccess.getKeysAccess().getFEnumLiteralDeclaration_5()); 
                    // InternalKlangParser.g:1163:3: ( F )
                    // InternalKlangParser.g:1163:4: F
                    {
                    match(input,F,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getFEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalKlangParser.g:1167:2: ( ( G ) )
                    {
                    // InternalKlangParser.g:1167:2: ( ( G ) )
                    // InternalKlangParser.g:1168:3: ( G )
                    {
                     before(grammarAccess.getKeysAccess().getGEnumLiteralDeclaration_6()); 
                    // InternalKlangParser.g:1169:3: ( G )
                    // InternalKlangParser.g:1169:4: G
                    {
                    match(input,G,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getGEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalKlangParser.g:1173:2: ( ( H ) )
                    {
                    // InternalKlangParser.g:1173:2: ( ( H ) )
                    // InternalKlangParser.g:1174:3: ( H )
                    {
                     before(grammarAccess.getKeysAccess().getHEnumLiteralDeclaration_7()); 
                    // InternalKlangParser.g:1175:3: ( H )
                    // InternalKlangParser.g:1175:4: H
                    {
                    match(input,H,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getHEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalKlangParser.g:1179:2: ( ( I ) )
                    {
                    // InternalKlangParser.g:1179:2: ( ( I ) )
                    // InternalKlangParser.g:1180:3: ( I )
                    {
                     before(grammarAccess.getKeysAccess().getIEnumLiteralDeclaration_8()); 
                    // InternalKlangParser.g:1181:3: ( I )
                    // InternalKlangParser.g:1181:4: I
                    {
                    match(input,I,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getIEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalKlangParser.g:1185:2: ( ( J ) )
                    {
                    // InternalKlangParser.g:1185:2: ( ( J ) )
                    // InternalKlangParser.g:1186:3: ( J )
                    {
                     before(grammarAccess.getKeysAccess().getJEnumLiteralDeclaration_9()); 
                    // InternalKlangParser.g:1187:3: ( J )
                    // InternalKlangParser.g:1187:4: J
                    {
                    match(input,J,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getJEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalKlangParser.g:1191:2: ( ( K ) )
                    {
                    // InternalKlangParser.g:1191:2: ( ( K ) )
                    // InternalKlangParser.g:1192:3: ( K )
                    {
                     before(grammarAccess.getKeysAccess().getKEnumLiteralDeclaration_10()); 
                    // InternalKlangParser.g:1193:3: ( K )
                    // InternalKlangParser.g:1193:4: K
                    {
                    match(input,K,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getKEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalKlangParser.g:1197:2: ( ( L ) )
                    {
                    // InternalKlangParser.g:1197:2: ( ( L ) )
                    // InternalKlangParser.g:1198:3: ( L )
                    {
                     before(grammarAccess.getKeysAccess().getLEnumLiteralDeclaration_11()); 
                    // InternalKlangParser.g:1199:3: ( L )
                    // InternalKlangParser.g:1199:4: L
                    {
                    match(input,L,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getLEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalKlangParser.g:1203:2: ( ( M ) )
                    {
                    // InternalKlangParser.g:1203:2: ( ( M ) )
                    // InternalKlangParser.g:1204:3: ( M )
                    {
                     before(grammarAccess.getKeysAccess().getMEnumLiteralDeclaration_12()); 
                    // InternalKlangParser.g:1205:3: ( M )
                    // InternalKlangParser.g:1205:4: M
                    {
                    match(input,M,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getMEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalKlangParser.g:1209:2: ( ( N ) )
                    {
                    // InternalKlangParser.g:1209:2: ( ( N ) )
                    // InternalKlangParser.g:1210:3: ( N )
                    {
                     before(grammarAccess.getKeysAccess().getNEnumLiteralDeclaration_13()); 
                    // InternalKlangParser.g:1211:3: ( N )
                    // InternalKlangParser.g:1211:4: N
                    {
                    match(input,N,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getNEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalKlangParser.g:1215:2: ( ( O ) )
                    {
                    // InternalKlangParser.g:1215:2: ( ( O ) )
                    // InternalKlangParser.g:1216:3: ( O )
                    {
                     before(grammarAccess.getKeysAccess().getOEnumLiteralDeclaration_14()); 
                    // InternalKlangParser.g:1217:3: ( O )
                    // InternalKlangParser.g:1217:4: O
                    {
                    match(input,O,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getOEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalKlangParser.g:1221:2: ( ( P ) )
                    {
                    // InternalKlangParser.g:1221:2: ( ( P ) )
                    // InternalKlangParser.g:1222:3: ( P )
                    {
                     before(grammarAccess.getKeysAccess().getPEnumLiteralDeclaration_15()); 
                    // InternalKlangParser.g:1223:3: ( P )
                    // InternalKlangParser.g:1223:4: P
                    {
                    match(input,P,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getPEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalKlangParser.g:1227:2: ( ( Q ) )
                    {
                    // InternalKlangParser.g:1227:2: ( ( Q ) )
                    // InternalKlangParser.g:1228:3: ( Q )
                    {
                     before(grammarAccess.getKeysAccess().getQEnumLiteralDeclaration_16()); 
                    // InternalKlangParser.g:1229:3: ( Q )
                    // InternalKlangParser.g:1229:4: Q
                    {
                    match(input,Q,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getQEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalKlangParser.g:1233:2: ( ( R ) )
                    {
                    // InternalKlangParser.g:1233:2: ( ( R ) )
                    // InternalKlangParser.g:1234:3: ( R )
                    {
                     before(grammarAccess.getKeysAccess().getREnumLiteralDeclaration_17()); 
                    // InternalKlangParser.g:1235:3: ( R )
                    // InternalKlangParser.g:1235:4: R
                    {
                    match(input,R,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getREnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalKlangParser.g:1239:2: ( ( S ) )
                    {
                    // InternalKlangParser.g:1239:2: ( ( S ) )
                    // InternalKlangParser.g:1240:3: ( S )
                    {
                     before(grammarAccess.getKeysAccess().getSEnumLiteralDeclaration_18()); 
                    // InternalKlangParser.g:1241:3: ( S )
                    // InternalKlangParser.g:1241:4: S
                    {
                    match(input,S,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getSEnumLiteralDeclaration_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalKlangParser.g:1245:2: ( ( T ) )
                    {
                    // InternalKlangParser.g:1245:2: ( ( T ) )
                    // InternalKlangParser.g:1246:3: ( T )
                    {
                     before(grammarAccess.getKeysAccess().getTEnumLiteralDeclaration_19()); 
                    // InternalKlangParser.g:1247:3: ( T )
                    // InternalKlangParser.g:1247:4: T
                    {
                    match(input,T,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getTEnumLiteralDeclaration_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalKlangParser.g:1251:2: ( ( U ) )
                    {
                    // InternalKlangParser.g:1251:2: ( ( U ) )
                    // InternalKlangParser.g:1252:3: ( U )
                    {
                     before(grammarAccess.getKeysAccess().getUEnumLiteralDeclaration_20()); 
                    // InternalKlangParser.g:1253:3: ( U )
                    // InternalKlangParser.g:1253:4: U
                    {
                    match(input,U,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getUEnumLiteralDeclaration_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalKlangParser.g:1257:2: ( ( V ) )
                    {
                    // InternalKlangParser.g:1257:2: ( ( V ) )
                    // InternalKlangParser.g:1258:3: ( V )
                    {
                     before(grammarAccess.getKeysAccess().getVEnumLiteralDeclaration_21()); 
                    // InternalKlangParser.g:1259:3: ( V )
                    // InternalKlangParser.g:1259:4: V
                    {
                    match(input,V,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getVEnumLiteralDeclaration_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalKlangParser.g:1263:2: ( ( W ) )
                    {
                    // InternalKlangParser.g:1263:2: ( ( W ) )
                    // InternalKlangParser.g:1264:3: ( W )
                    {
                     before(grammarAccess.getKeysAccess().getWEnumLiteralDeclaration_22()); 
                    // InternalKlangParser.g:1265:3: ( W )
                    // InternalKlangParser.g:1265:4: W
                    {
                    match(input,W,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getWEnumLiteralDeclaration_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalKlangParser.g:1269:2: ( ( X ) )
                    {
                    // InternalKlangParser.g:1269:2: ( ( X ) )
                    // InternalKlangParser.g:1270:3: ( X )
                    {
                     before(grammarAccess.getKeysAccess().getXEnumLiteralDeclaration_23()); 
                    // InternalKlangParser.g:1271:3: ( X )
                    // InternalKlangParser.g:1271:4: X
                    {
                    match(input,X,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getXEnumLiteralDeclaration_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalKlangParser.g:1275:2: ( ( Y ) )
                    {
                    // InternalKlangParser.g:1275:2: ( ( Y ) )
                    // InternalKlangParser.g:1276:3: ( Y )
                    {
                     before(grammarAccess.getKeysAccess().getYEnumLiteralDeclaration_24()); 
                    // InternalKlangParser.g:1277:3: ( Y )
                    // InternalKlangParser.g:1277:4: Y
                    {
                    match(input,Y,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getYEnumLiteralDeclaration_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalKlangParser.g:1281:2: ( ( Z ) )
                    {
                    // InternalKlangParser.g:1281:2: ( ( Z ) )
                    // InternalKlangParser.g:1282:3: ( Z )
                    {
                     before(grammarAccess.getKeysAccess().getZEnumLiteralDeclaration_25()); 
                    // InternalKlangParser.g:1283:3: ( Z )
                    // InternalKlangParser.g:1283:4: Z
                    {
                    match(input,Z,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getZEnumLiteralDeclaration_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalKlangParser.g:1287:2: ( ( SPACE ) )
                    {
                    // InternalKlangParser.g:1287:2: ( ( SPACE ) )
                    // InternalKlangParser.g:1288:3: ( SPACE )
                    {
                     before(grammarAccess.getKeysAccess().getSPACEEnumLiteralDeclaration_26()); 
                    // InternalKlangParser.g:1289:3: ( SPACE )
                    // InternalKlangParser.g:1289:4: SPACE
                    {
                    match(input,SPACE,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getSPACEEnumLiteralDeclaration_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalKlangParser.g:1293:2: ( ( ENTER ) )
                    {
                    // InternalKlangParser.g:1293:2: ( ( ENTER ) )
                    // InternalKlangParser.g:1294:3: ( ENTER )
                    {
                     before(grammarAccess.getKeysAccess().getENTEREnumLiteralDeclaration_27()); 
                    // InternalKlangParser.g:1295:3: ( ENTER )
                    // InternalKlangParser.g:1295:4: ENTER
                    {
                    match(input,ENTER,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getENTEREnumLiteralDeclaration_27()); 

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
    // $ANTLR end "rule__Keys__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // InternalKlangParser.g:1303:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1307:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalKlangParser.g:1308:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalKlangParser.g:1315:1: rule__Program__Group__0__Impl : ( ( rule__Program__SceneActorAssignment_0 ) ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1319:1: ( ( ( rule__Program__SceneActorAssignment_0 ) ) )
            // InternalKlangParser.g:1320:1: ( ( rule__Program__SceneActorAssignment_0 ) )
            {
            // InternalKlangParser.g:1320:1: ( ( rule__Program__SceneActorAssignment_0 ) )
            // InternalKlangParser.g:1321:2: ( rule__Program__SceneActorAssignment_0 )
            {
             before(grammarAccess.getProgramAccess().getSceneActorAssignment_0()); 
            // InternalKlangParser.g:1322:2: ( rule__Program__SceneActorAssignment_0 )
            // InternalKlangParser.g:1322:3: rule__Program__SceneActorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Program__SceneActorAssignment_0();

            state._fsp--;


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
    // InternalKlangParser.g:1330:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1334:1: ( rule__Program__Group__1__Impl )
            // InternalKlangParser.g:1335:2: rule__Program__Group__1__Impl
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
    // InternalKlangParser.g:1341:1: rule__Program__Group__1__Impl : ( ( rule__Program__SpriteActorsAssignment_1 )* ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1345:1: ( ( ( rule__Program__SpriteActorsAssignment_1 )* ) )
            // InternalKlangParser.g:1346:1: ( ( rule__Program__SpriteActorsAssignment_1 )* )
            {
            // InternalKlangParser.g:1346:1: ( ( rule__Program__SpriteActorsAssignment_1 )* )
            // InternalKlangParser.g:1347:2: ( rule__Program__SpriteActorsAssignment_1 )*
            {
             before(grammarAccess.getProgramAccess().getSpriteActorsAssignment_1()); 
            // InternalKlangParser.g:1348:2: ( rule__Program__SpriteActorsAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Sprite) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKlangParser.g:1348:3: rule__Program__SpriteActorsAssignment_1
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
    // InternalKlangParser.g:1357:1: rule__SceneActor__Group__0 : rule__SceneActor__Group__0__Impl rule__SceneActor__Group__1 ;
    public final void rule__SceneActor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1361:1: ( rule__SceneActor__Group__0__Impl rule__SceneActor__Group__1 )
            // InternalKlangParser.g:1362:2: rule__SceneActor__Group__0__Impl rule__SceneActor__Group__1
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
    // InternalKlangParser.g:1369:1: rule__SceneActor__Group__0__Impl : ( () ) ;
    public final void rule__SceneActor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1373:1: ( ( () ) )
            // InternalKlangParser.g:1374:1: ( () )
            {
            // InternalKlangParser.g:1374:1: ( () )
            // InternalKlangParser.g:1375:2: ()
            {
             before(grammarAccess.getSceneActorAccess().getSceneActorAction_0()); 
            // InternalKlangParser.g:1376:2: ()
            // InternalKlangParser.g:1376:3: 
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
    // InternalKlangParser.g:1384:1: rule__SceneActor__Group__1 : rule__SceneActor__Group__1__Impl rule__SceneActor__Group__2 ;
    public final void rule__SceneActor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1388:1: ( rule__SceneActor__Group__1__Impl rule__SceneActor__Group__2 )
            // InternalKlangParser.g:1389:2: rule__SceneActor__Group__1__Impl rule__SceneActor__Group__2
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
    // InternalKlangParser.g:1396:1: rule__SceneActor__Group__1__Impl : ( Scene ) ;
    public final void rule__SceneActor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1400:1: ( ( Scene ) )
            // InternalKlangParser.g:1401:1: ( Scene )
            {
            // InternalKlangParser.g:1401:1: ( Scene )
            // InternalKlangParser.g:1402:2: Scene
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
    // InternalKlangParser.g:1411:1: rule__SceneActor__Group__2 : rule__SceneActor__Group__2__Impl rule__SceneActor__Group__3 ;
    public final void rule__SceneActor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1415:1: ( rule__SceneActor__Group__2__Impl rule__SceneActor__Group__3 )
            // InternalKlangParser.g:1416:2: rule__SceneActor__Group__2__Impl rule__SceneActor__Group__3
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
    // InternalKlangParser.g:1423:1: rule__SceneActor__Group__2__Impl : ( ( rule__SceneActor__NameAssignment_2 ) ) ;
    public final void rule__SceneActor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1427:1: ( ( ( rule__SceneActor__NameAssignment_2 ) ) )
            // InternalKlangParser.g:1428:1: ( ( rule__SceneActor__NameAssignment_2 ) )
            {
            // InternalKlangParser.g:1428:1: ( ( rule__SceneActor__NameAssignment_2 ) )
            // InternalKlangParser.g:1429:2: ( rule__SceneActor__NameAssignment_2 )
            {
             before(grammarAccess.getSceneActorAccess().getNameAssignment_2()); 
            // InternalKlangParser.g:1430:2: ( rule__SceneActor__NameAssignment_2 )
            // InternalKlangParser.g:1430:3: rule__SceneActor__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SceneActor__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSceneActorAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalKlangParser.g:1438:1: rule__SceneActor__Group__3 : rule__SceneActor__Group__3__Impl ;
    public final void rule__SceneActor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1442:1: ( rule__SceneActor__Group__3__Impl )
            // InternalKlangParser.g:1443:2: rule__SceneActor__Group__3__Impl
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
    // InternalKlangParser.g:1449:1: rule__SceneActor__Group__3__Impl : ( ( rule__SceneActor__Group_3__0 )? ) ;
    public final void rule__SceneActor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1453:1: ( ( ( rule__SceneActor__Group_3__0 )? ) )
            // InternalKlangParser.g:1454:1: ( ( rule__SceneActor__Group_3__0 )? )
            {
            // InternalKlangParser.g:1454:1: ( ( rule__SceneActor__Group_3__0 )? )
            // InternalKlangParser.g:1455:2: ( rule__SceneActor__Group_3__0 )?
            {
             before(grammarAccess.getSceneActorAccess().getGroup_3()); 
            // InternalKlangParser.g:1456:2: ( rule__SceneActor__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_BEGIN) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalKlangParser.g:1456:3: rule__SceneActor__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SceneActor__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSceneActorAccess().getGroup_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__SceneActor__Group_3__0"
    // InternalKlangParser.g:1465:1: rule__SceneActor__Group_3__0 : rule__SceneActor__Group_3__0__Impl rule__SceneActor__Group_3__1 ;
    public final void rule__SceneActor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1469:1: ( rule__SceneActor__Group_3__0__Impl rule__SceneActor__Group_3__1 )
            // InternalKlangParser.g:1470:2: rule__SceneActor__Group_3__0__Impl rule__SceneActor__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__SceneActor__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SceneActor__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneActor__Group_3__0"


    // $ANTLR start "rule__SceneActor__Group_3__0__Impl"
    // InternalKlangParser.g:1477:1: rule__SceneActor__Group_3__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__SceneActor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1481:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:1482:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:1482:1: ( RULE_BEGIN )
            // InternalKlangParser.g:1483:2: RULE_BEGIN
            {
             before(grammarAccess.getSceneActorAccess().getBEGINTerminalRuleCall_3_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getSceneActorAccess().getBEGINTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneActor__Group_3__0__Impl"


    // $ANTLR start "rule__SceneActor__Group_3__1"
    // InternalKlangParser.g:1492:1: rule__SceneActor__Group_3__1 : rule__SceneActor__Group_3__1__Impl rule__SceneActor__Group_3__2 ;
    public final void rule__SceneActor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1496:1: ( rule__SceneActor__Group_3__1__Impl rule__SceneActor__Group_3__2 )
            // InternalKlangParser.g:1497:2: rule__SceneActor__Group_3__1__Impl rule__SceneActor__Group_3__2
            {
            pushFollow(FOLLOW_8);
            rule__SceneActor__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SceneActor__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneActor__Group_3__1"


    // $ANTLR start "rule__SceneActor__Group_3__1__Impl"
    // InternalKlangParser.g:1504:1: rule__SceneActor__Group_3__1__Impl : ( ( rule__SceneActor__LocalVariablesAssignment_3_1 )* ) ;
    public final void rule__SceneActor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1508:1: ( ( ( rule__SceneActor__LocalVariablesAssignment_3_1 )* ) )
            // InternalKlangParser.g:1509:1: ( ( rule__SceneActor__LocalVariablesAssignment_3_1 )* )
            {
            // InternalKlangParser.g:1509:1: ( ( rule__SceneActor__LocalVariablesAssignment_3_1 )* )
            // InternalKlangParser.g:1510:2: ( rule__SceneActor__LocalVariablesAssignment_3_1 )*
            {
             before(grammarAccess.getSceneActorAccess().getLocalVariablesAssignment_3_1()); 
            // InternalKlangParser.g:1511:2: ( rule__SceneActor__LocalVariablesAssignment_3_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Var) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalKlangParser.g:1511:3: rule__SceneActor__LocalVariablesAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SceneActor__LocalVariablesAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSceneActorAccess().getLocalVariablesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneActor__Group_3__1__Impl"


    // $ANTLR start "rule__SceneActor__Group_3__2"
    // InternalKlangParser.g:1519:1: rule__SceneActor__Group_3__2 : rule__SceneActor__Group_3__2__Impl rule__SceneActor__Group_3__3 ;
    public final void rule__SceneActor__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1523:1: ( rule__SceneActor__Group_3__2__Impl rule__SceneActor__Group_3__3 )
            // InternalKlangParser.g:1524:2: rule__SceneActor__Group_3__2__Impl rule__SceneActor__Group_3__3
            {
            pushFollow(FOLLOW_8);
            rule__SceneActor__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SceneActor__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneActor__Group_3__2"


    // $ANTLR start "rule__SceneActor__Group_3__2__Impl"
    // InternalKlangParser.g:1531:1: rule__SceneActor__Group_3__2__Impl : ( ( rule__SceneActor__EventHandlersAssignment_3_2 )* ) ;
    public final void rule__SceneActor__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1535:1: ( ( ( rule__SceneActor__EventHandlersAssignment_3_2 )* ) )
            // InternalKlangParser.g:1536:1: ( ( rule__SceneActor__EventHandlersAssignment_3_2 )* )
            {
            // InternalKlangParser.g:1536:1: ( ( rule__SceneActor__EventHandlersAssignment_3_2 )* )
            // InternalKlangParser.g:1537:2: ( rule__SceneActor__EventHandlersAssignment_3_2 )*
            {
             before(grammarAccess.getSceneActorAccess().getEventHandlersAssignment_3_2()); 
            // InternalKlangParser.g:1538:2: ( rule__SceneActor__EventHandlersAssignment_3_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==When) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalKlangParser.g:1538:3: rule__SceneActor__EventHandlersAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__SceneActor__EventHandlersAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getSceneActorAccess().getEventHandlersAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneActor__Group_3__2__Impl"


    // $ANTLR start "rule__SceneActor__Group_3__3"
    // InternalKlangParser.g:1546:1: rule__SceneActor__Group_3__3 : rule__SceneActor__Group_3__3__Impl ;
    public final void rule__SceneActor__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1550:1: ( rule__SceneActor__Group_3__3__Impl )
            // InternalKlangParser.g:1551:2: rule__SceneActor__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SceneActor__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneActor__Group_3__3"


    // $ANTLR start "rule__SceneActor__Group_3__3__Impl"
    // InternalKlangParser.g:1557:1: rule__SceneActor__Group_3__3__Impl : ( RULE_END ) ;
    public final void rule__SceneActor__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1561:1: ( ( RULE_END ) )
            // InternalKlangParser.g:1562:1: ( RULE_END )
            {
            // InternalKlangParser.g:1562:1: ( RULE_END )
            // InternalKlangParser.g:1563:2: RULE_END
            {
             before(grammarAccess.getSceneActorAccess().getENDTerminalRuleCall_3_3()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getSceneActorAccess().getENDTerminalRuleCall_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneActor__Group_3__3__Impl"


    // $ANTLR start "rule__SpriteActor__Group__0"
    // InternalKlangParser.g:1573:1: rule__SpriteActor__Group__0 : rule__SpriteActor__Group__0__Impl rule__SpriteActor__Group__1 ;
    public final void rule__SpriteActor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1577:1: ( rule__SpriteActor__Group__0__Impl rule__SpriteActor__Group__1 )
            // InternalKlangParser.g:1578:2: rule__SpriteActor__Group__0__Impl rule__SpriteActor__Group__1
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
    // InternalKlangParser.g:1585:1: rule__SpriteActor__Group__0__Impl : ( () ) ;
    public final void rule__SpriteActor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1589:1: ( ( () ) )
            // InternalKlangParser.g:1590:1: ( () )
            {
            // InternalKlangParser.g:1590:1: ( () )
            // InternalKlangParser.g:1591:2: ()
            {
             before(grammarAccess.getSpriteActorAccess().getSpriteActorAction_0()); 
            // InternalKlangParser.g:1592:2: ()
            // InternalKlangParser.g:1592:3: 
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
    // InternalKlangParser.g:1600:1: rule__SpriteActor__Group__1 : rule__SpriteActor__Group__1__Impl rule__SpriteActor__Group__2 ;
    public final void rule__SpriteActor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1604:1: ( rule__SpriteActor__Group__1__Impl rule__SpriteActor__Group__2 )
            // InternalKlangParser.g:1605:2: rule__SpriteActor__Group__1__Impl rule__SpriteActor__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalKlangParser.g:1612:1: rule__SpriteActor__Group__1__Impl : ( Sprite ) ;
    public final void rule__SpriteActor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1616:1: ( ( Sprite ) )
            // InternalKlangParser.g:1617:1: ( Sprite )
            {
            // InternalKlangParser.g:1617:1: ( Sprite )
            // InternalKlangParser.g:1618:2: Sprite
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
    // InternalKlangParser.g:1627:1: rule__SpriteActor__Group__2 : rule__SpriteActor__Group__2__Impl rule__SpriteActor__Group__3 ;
    public final void rule__SpriteActor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1631:1: ( rule__SpriteActor__Group__2__Impl rule__SpriteActor__Group__3 )
            // InternalKlangParser.g:1632:2: rule__SpriteActor__Group__2__Impl rule__SpriteActor__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalKlangParser.g:1639:1: rule__SpriteActor__Group__2__Impl : ( ( rule__SpriteActor__NameAssignment_2 ) ) ;
    public final void rule__SpriteActor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1643:1: ( ( ( rule__SpriteActor__NameAssignment_2 ) ) )
            // InternalKlangParser.g:1644:1: ( ( rule__SpriteActor__NameAssignment_2 ) )
            {
            // InternalKlangParser.g:1644:1: ( ( rule__SpriteActor__NameAssignment_2 ) )
            // InternalKlangParser.g:1645:2: ( rule__SpriteActor__NameAssignment_2 )
            {
             before(grammarAccess.getSpriteActorAccess().getNameAssignment_2()); 
            // InternalKlangParser.g:1646:2: ( rule__SpriteActor__NameAssignment_2 )
            // InternalKlangParser.g:1646:3: rule__SpriteActor__NameAssignment_2
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
    // InternalKlangParser.g:1654:1: rule__SpriteActor__Group__3 : rule__SpriteActor__Group__3__Impl ;
    public final void rule__SpriteActor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1658:1: ( rule__SpriteActor__Group__3__Impl )
            // InternalKlangParser.g:1659:2: rule__SpriteActor__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpriteActor__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalKlangParser.g:1665:1: rule__SpriteActor__Group__3__Impl : ( ( rule__SpriteActor__Group_3__0 )? ) ;
    public final void rule__SpriteActor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1669:1: ( ( ( rule__SpriteActor__Group_3__0 )? ) )
            // InternalKlangParser.g:1670:1: ( ( rule__SpriteActor__Group_3__0 )? )
            {
            // InternalKlangParser.g:1670:1: ( ( rule__SpriteActor__Group_3__0 )? )
            // InternalKlangParser.g:1671:2: ( rule__SpriteActor__Group_3__0 )?
            {
             before(grammarAccess.getSpriteActorAccess().getGroup_3()); 
            // InternalKlangParser.g:1672:2: ( rule__SpriteActor__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_BEGIN) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalKlangParser.g:1672:3: rule__SpriteActor__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SpriteActor__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSpriteActorAccess().getGroup_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__SpriteActor__Group_3__0"
    // InternalKlangParser.g:1681:1: rule__SpriteActor__Group_3__0 : rule__SpriteActor__Group_3__0__Impl rule__SpriteActor__Group_3__1 ;
    public final void rule__SpriteActor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1685:1: ( rule__SpriteActor__Group_3__0__Impl rule__SpriteActor__Group_3__1 )
            // InternalKlangParser.g:1686:2: rule__SpriteActor__Group_3__0__Impl rule__SpriteActor__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__SpriteActor__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpriteActor__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteActor__Group_3__0"


    // $ANTLR start "rule__SpriteActor__Group_3__0__Impl"
    // InternalKlangParser.g:1693:1: rule__SpriteActor__Group_3__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__SpriteActor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1697:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:1698:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:1698:1: ( RULE_BEGIN )
            // InternalKlangParser.g:1699:2: RULE_BEGIN
            {
             before(grammarAccess.getSpriteActorAccess().getBEGINTerminalRuleCall_3_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getSpriteActorAccess().getBEGINTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteActor__Group_3__0__Impl"


    // $ANTLR start "rule__SpriteActor__Group_3__1"
    // InternalKlangParser.g:1708:1: rule__SpriteActor__Group_3__1 : rule__SpriteActor__Group_3__1__Impl rule__SpriteActor__Group_3__2 ;
    public final void rule__SpriteActor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1712:1: ( rule__SpriteActor__Group_3__1__Impl rule__SpriteActor__Group_3__2 )
            // InternalKlangParser.g:1713:2: rule__SpriteActor__Group_3__1__Impl rule__SpriteActor__Group_3__2
            {
            pushFollow(FOLLOW_8);
            rule__SpriteActor__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpriteActor__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteActor__Group_3__1"


    // $ANTLR start "rule__SpriteActor__Group_3__1__Impl"
    // InternalKlangParser.g:1720:1: rule__SpriteActor__Group_3__1__Impl : ( ( rule__SpriteActor__LocalVariablesAssignment_3_1 )* ) ;
    public final void rule__SpriteActor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1724:1: ( ( ( rule__SpriteActor__LocalVariablesAssignment_3_1 )* ) )
            // InternalKlangParser.g:1725:1: ( ( rule__SpriteActor__LocalVariablesAssignment_3_1 )* )
            {
            // InternalKlangParser.g:1725:1: ( ( rule__SpriteActor__LocalVariablesAssignment_3_1 )* )
            // InternalKlangParser.g:1726:2: ( rule__SpriteActor__LocalVariablesAssignment_3_1 )*
            {
             before(grammarAccess.getSpriteActorAccess().getLocalVariablesAssignment_3_1()); 
            // InternalKlangParser.g:1727:2: ( rule__SpriteActor__LocalVariablesAssignment_3_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Var) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalKlangParser.g:1727:3: rule__SpriteActor__LocalVariablesAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SpriteActor__LocalVariablesAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getSpriteActorAccess().getLocalVariablesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteActor__Group_3__1__Impl"


    // $ANTLR start "rule__SpriteActor__Group_3__2"
    // InternalKlangParser.g:1735:1: rule__SpriteActor__Group_3__2 : rule__SpriteActor__Group_3__2__Impl rule__SpriteActor__Group_3__3 ;
    public final void rule__SpriteActor__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1739:1: ( rule__SpriteActor__Group_3__2__Impl rule__SpriteActor__Group_3__3 )
            // InternalKlangParser.g:1740:2: rule__SpriteActor__Group_3__2__Impl rule__SpriteActor__Group_3__3
            {
            pushFollow(FOLLOW_8);
            rule__SpriteActor__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpriteActor__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteActor__Group_3__2"


    // $ANTLR start "rule__SpriteActor__Group_3__2__Impl"
    // InternalKlangParser.g:1747:1: rule__SpriteActor__Group_3__2__Impl : ( ( rule__SpriteActor__EventHandlersAssignment_3_2 )* ) ;
    public final void rule__SpriteActor__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1751:1: ( ( ( rule__SpriteActor__EventHandlersAssignment_3_2 )* ) )
            // InternalKlangParser.g:1752:1: ( ( rule__SpriteActor__EventHandlersAssignment_3_2 )* )
            {
            // InternalKlangParser.g:1752:1: ( ( rule__SpriteActor__EventHandlersAssignment_3_2 )* )
            // InternalKlangParser.g:1753:2: ( rule__SpriteActor__EventHandlersAssignment_3_2 )*
            {
             before(grammarAccess.getSpriteActorAccess().getEventHandlersAssignment_3_2()); 
            // InternalKlangParser.g:1754:2: ( rule__SpriteActor__EventHandlersAssignment_3_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==When) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalKlangParser.g:1754:3: rule__SpriteActor__EventHandlersAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__SpriteActor__EventHandlersAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSpriteActorAccess().getEventHandlersAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteActor__Group_3__2__Impl"


    // $ANTLR start "rule__SpriteActor__Group_3__3"
    // InternalKlangParser.g:1762:1: rule__SpriteActor__Group_3__3 : rule__SpriteActor__Group_3__3__Impl ;
    public final void rule__SpriteActor__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1766:1: ( rule__SpriteActor__Group_3__3__Impl )
            // InternalKlangParser.g:1767:2: rule__SpriteActor__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpriteActor__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteActor__Group_3__3"


    // $ANTLR start "rule__SpriteActor__Group_3__3__Impl"
    // InternalKlangParser.g:1773:1: rule__SpriteActor__Group_3__3__Impl : ( RULE_END ) ;
    public final void rule__SpriteActor__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1777:1: ( ( RULE_END ) )
            // InternalKlangParser.g:1778:1: ( RULE_END )
            {
            // InternalKlangParser.g:1778:1: ( RULE_END )
            // InternalKlangParser.g:1779:2: RULE_END
            {
             before(grammarAccess.getSpriteActorAccess().getENDTerminalRuleCall_3_3()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getSpriteActorAccess().getENDTerminalRuleCall_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteActor__Group_3__3__Impl"


    // $ANTLR start "rule__EventHandler__Group__0"
    // InternalKlangParser.g:1789:1: rule__EventHandler__Group__0 : rule__EventHandler__Group__0__Impl rule__EventHandler__Group__1 ;
    public final void rule__EventHandler__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1793:1: ( rule__EventHandler__Group__0__Impl rule__EventHandler__Group__1 )
            // InternalKlangParser.g:1794:2: rule__EventHandler__Group__0__Impl rule__EventHandler__Group__1
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
    // InternalKlangParser.g:1801:1: rule__EventHandler__Group__0__Impl : ( When ) ;
    public final void rule__EventHandler__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1805:1: ( ( When ) )
            // InternalKlangParser.g:1806:1: ( When )
            {
            // InternalKlangParser.g:1806:1: ( When )
            // InternalKlangParser.g:1807:2: When
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
    // InternalKlangParser.g:1816:1: rule__EventHandler__Group__1 : rule__EventHandler__Group__1__Impl rule__EventHandler__Group__2 ;
    public final void rule__EventHandler__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1820:1: ( rule__EventHandler__Group__1__Impl rule__EventHandler__Group__2 )
            // InternalKlangParser.g:1821:2: rule__EventHandler__Group__1__Impl rule__EventHandler__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalKlangParser.g:1828:1: rule__EventHandler__Group__1__Impl : ( ( rule__EventHandler__ReferenceEventAssignment_1 ) ) ;
    public final void rule__EventHandler__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1832:1: ( ( ( rule__EventHandler__ReferenceEventAssignment_1 ) ) )
            // InternalKlangParser.g:1833:1: ( ( rule__EventHandler__ReferenceEventAssignment_1 ) )
            {
            // InternalKlangParser.g:1833:1: ( ( rule__EventHandler__ReferenceEventAssignment_1 ) )
            // InternalKlangParser.g:1834:2: ( rule__EventHandler__ReferenceEventAssignment_1 )
            {
             before(grammarAccess.getEventHandlerAccess().getReferenceEventAssignment_1()); 
            // InternalKlangParser.g:1835:2: ( rule__EventHandler__ReferenceEventAssignment_1 )
            // InternalKlangParser.g:1835:3: rule__EventHandler__ReferenceEventAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EventHandler__ReferenceEventAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEventHandlerAccess().getReferenceEventAssignment_1()); 

            }


            }

        }
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
    // InternalKlangParser.g:1843:1: rule__EventHandler__Group__2 : rule__EventHandler__Group__2__Impl rule__EventHandler__Group__3 ;
    public final void rule__EventHandler__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1847:1: ( rule__EventHandler__Group__2__Impl rule__EventHandler__Group__3 )
            // InternalKlangParser.g:1848:2: rule__EventHandler__Group__2__Impl rule__EventHandler__Group__3
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
    // InternalKlangParser.g:1855:1: rule__EventHandler__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__EventHandler__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1859:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:1860:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:1860:1: ( RULE_BEGIN )
            // InternalKlangParser.g:1861:2: RULE_BEGIN
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
    // InternalKlangParser.g:1870:1: rule__EventHandler__Group__3 : rule__EventHandler__Group__3__Impl rule__EventHandler__Group__4 ;
    public final void rule__EventHandler__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1874:1: ( rule__EventHandler__Group__3__Impl rule__EventHandler__Group__4 )
            // InternalKlangParser.g:1875:2: rule__EventHandler__Group__3__Impl rule__EventHandler__Group__4
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
    // InternalKlangParser.g:1882:1: rule__EventHandler__Group__3__Impl : ( ( rule__EventHandler__StatementsAssignment_3 )* ) ;
    public final void rule__EventHandler__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1886:1: ( ( ( rule__EventHandler__StatementsAssignment_3 )* ) )
            // InternalKlangParser.g:1887:1: ( ( rule__EventHandler__StatementsAssignment_3 )* )
            {
            // InternalKlangParser.g:1887:1: ( ( rule__EventHandler__StatementsAssignment_3 )* )
            // InternalKlangParser.g:1888:2: ( rule__EventHandler__StatementsAssignment_3 )*
            {
             before(grammarAccess.getEventHandlerAccess().getStatementsAssignment_3()); 
            // InternalKlangParser.g:1889:2: ( rule__EventHandler__StatementsAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==SendMessage||LA15_0==Forever||(LA15_0>=Sleep && LA15_0<=While)||LA15_0==If||LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalKlangParser.g:1889:3: rule__EventHandler__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__EventHandler__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalKlangParser.g:1897:1: rule__EventHandler__Group__4 : rule__EventHandler__Group__4__Impl ;
    public final void rule__EventHandler__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1901:1: ( rule__EventHandler__Group__4__Impl )
            // InternalKlangParser.g:1902:2: rule__EventHandler__Group__4__Impl
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
    // InternalKlangParser.g:1908:1: rule__EventHandler__Group__4__Impl : ( RULE_END ) ;
    public final void rule__EventHandler__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1912:1: ( ( RULE_END ) )
            // InternalKlangParser.g:1913:1: ( RULE_END )
            {
            // InternalKlangParser.g:1913:1: ( RULE_END )
            // InternalKlangParser.g:1914:2: RULE_END
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


    // $ANTLR start "rule__MessageReceivedEvent__Group__0"
    // InternalKlangParser.g:1924:1: rule__MessageReceivedEvent__Group__0 : rule__MessageReceivedEvent__Group__0__Impl rule__MessageReceivedEvent__Group__1 ;
    public final void rule__MessageReceivedEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1928:1: ( rule__MessageReceivedEvent__Group__0__Impl rule__MessageReceivedEvent__Group__1 )
            // InternalKlangParser.g:1929:2: rule__MessageReceivedEvent__Group__0__Impl rule__MessageReceivedEvent__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__MessageReceivedEvent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageReceivedEvent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageReceivedEvent__Group__0"


    // $ANTLR start "rule__MessageReceivedEvent__Group__0__Impl"
    // InternalKlangParser.g:1936:1: rule__MessageReceivedEvent__Group__0__Impl : ( () ) ;
    public final void rule__MessageReceivedEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1940:1: ( ( () ) )
            // InternalKlangParser.g:1941:1: ( () )
            {
            // InternalKlangParser.g:1941:1: ( () )
            // InternalKlangParser.g:1942:2: ()
            {
             before(grammarAccess.getMessageReceivedEventAccess().getMessageReceivedEventAction_0()); 
            // InternalKlangParser.g:1943:2: ()
            // InternalKlangParser.g:1943:3: 
            {
            }

             after(grammarAccess.getMessageReceivedEventAccess().getMessageReceivedEventAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageReceivedEvent__Group__0__Impl"


    // $ANTLR start "rule__MessageReceivedEvent__Group__1"
    // InternalKlangParser.g:1951:1: rule__MessageReceivedEvent__Group__1 : rule__MessageReceivedEvent__Group__1__Impl rule__MessageReceivedEvent__Group__2 ;
    public final void rule__MessageReceivedEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1955:1: ( rule__MessageReceivedEvent__Group__1__Impl rule__MessageReceivedEvent__Group__2 )
            // InternalKlangParser.g:1956:2: rule__MessageReceivedEvent__Group__1__Impl rule__MessageReceivedEvent__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__MessageReceivedEvent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageReceivedEvent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageReceivedEvent__Group__1"


    // $ANTLR start "rule__MessageReceivedEvent__Group__1__Impl"
    // InternalKlangParser.g:1963:1: rule__MessageReceivedEvent__Group__1__Impl : ( ( rule__MessageReceivedEvent__NameAssignment_1 ) ) ;
    public final void rule__MessageReceivedEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1967:1: ( ( ( rule__MessageReceivedEvent__NameAssignment_1 ) ) )
            // InternalKlangParser.g:1968:1: ( ( rule__MessageReceivedEvent__NameAssignment_1 ) )
            {
            // InternalKlangParser.g:1968:1: ( ( rule__MessageReceivedEvent__NameAssignment_1 ) )
            // InternalKlangParser.g:1969:2: ( rule__MessageReceivedEvent__NameAssignment_1 )
            {
             before(grammarAccess.getMessageReceivedEventAccess().getNameAssignment_1()); 
            // InternalKlangParser.g:1970:2: ( rule__MessageReceivedEvent__NameAssignment_1 )
            // InternalKlangParser.g:1970:3: rule__MessageReceivedEvent__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MessageReceivedEvent__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageReceivedEventAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageReceivedEvent__Group__1__Impl"


    // $ANTLR start "rule__MessageReceivedEvent__Group__2"
    // InternalKlangParser.g:1978:1: rule__MessageReceivedEvent__Group__2 : rule__MessageReceivedEvent__Group__2__Impl ;
    public final void rule__MessageReceivedEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1982:1: ( rule__MessageReceivedEvent__Group__2__Impl )
            // InternalKlangParser.g:1983:2: rule__MessageReceivedEvent__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageReceivedEvent__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageReceivedEvent__Group__2"


    // $ANTLR start "rule__MessageReceivedEvent__Group__2__Impl"
    // InternalKlangParser.g:1989:1: rule__MessageReceivedEvent__Group__2__Impl : ( Received ) ;
    public final void rule__MessageReceivedEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1993:1: ( ( Received ) )
            // InternalKlangParser.g:1994:1: ( Received )
            {
            // InternalKlangParser.g:1994:1: ( Received )
            // InternalKlangParser.g:1995:2: Received
            {
             before(grammarAccess.getMessageReceivedEventAccess().getReceivedKeyword_2()); 
            match(input,Received,FOLLOW_2); 
             after(grammarAccess.getMessageReceivedEventAccess().getReceivedKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageReceivedEvent__Group__2__Impl"


    // $ANTLR start "rule__GameStartEvent__Group__0"
    // InternalKlangParser.g:2005:1: rule__GameStartEvent__Group__0 : rule__GameStartEvent__Group__0__Impl rule__GameStartEvent__Group__1 ;
    public final void rule__GameStartEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2009:1: ( rule__GameStartEvent__Group__0__Impl rule__GameStartEvent__Group__1 )
            // InternalKlangParser.g:2010:2: rule__GameStartEvent__Group__0__Impl rule__GameStartEvent__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__GameStartEvent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameStartEvent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameStartEvent__Group__0"


    // $ANTLR start "rule__GameStartEvent__Group__0__Impl"
    // InternalKlangParser.g:2017:1: rule__GameStartEvent__Group__0__Impl : ( () ) ;
    public final void rule__GameStartEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2021:1: ( ( () ) )
            // InternalKlangParser.g:2022:1: ( () )
            {
            // InternalKlangParser.g:2022:1: ( () )
            // InternalKlangParser.g:2023:2: ()
            {
             before(grammarAccess.getGameStartEventAccess().getGameStartEventAction_0()); 
            // InternalKlangParser.g:2024:2: ()
            // InternalKlangParser.g:2024:3: 
            {
            }

             after(grammarAccess.getGameStartEventAccess().getGameStartEventAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameStartEvent__Group__0__Impl"


    // $ANTLR start "rule__GameStartEvent__Group__1"
    // InternalKlangParser.g:2032:1: rule__GameStartEvent__Group__1 : rule__GameStartEvent__Group__1__Impl rule__GameStartEvent__Group__2 ;
    public final void rule__GameStartEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2036:1: ( rule__GameStartEvent__Group__1__Impl rule__GameStartEvent__Group__2 )
            // InternalKlangParser.g:2037:2: rule__GameStartEvent__Group__1__Impl rule__GameStartEvent__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__GameStartEvent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameStartEvent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameStartEvent__Group__1"


    // $ANTLR start "rule__GameStartEvent__Group__1__Impl"
    // InternalKlangParser.g:2044:1: rule__GameStartEvent__Group__1__Impl : ( Game ) ;
    public final void rule__GameStartEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2048:1: ( ( Game ) )
            // InternalKlangParser.g:2049:1: ( Game )
            {
            // InternalKlangParser.g:2049:1: ( Game )
            // InternalKlangParser.g:2050:2: Game
            {
             before(grammarAccess.getGameStartEventAccess().getGameKeyword_1()); 
            match(input,Game,FOLLOW_2); 
             after(grammarAccess.getGameStartEventAccess().getGameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameStartEvent__Group__1__Impl"


    // $ANTLR start "rule__GameStartEvent__Group__2"
    // InternalKlangParser.g:2059:1: rule__GameStartEvent__Group__2 : rule__GameStartEvent__Group__2__Impl ;
    public final void rule__GameStartEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2063:1: ( rule__GameStartEvent__Group__2__Impl )
            // InternalKlangParser.g:2064:2: rule__GameStartEvent__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GameStartEvent__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameStartEvent__Group__2"


    // $ANTLR start "rule__GameStartEvent__Group__2__Impl"
    // InternalKlangParser.g:2070:1: rule__GameStartEvent__Group__2__Impl : ( Starts ) ;
    public final void rule__GameStartEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2074:1: ( ( Starts ) )
            // InternalKlangParser.g:2075:1: ( Starts )
            {
            // InternalKlangParser.g:2075:1: ( Starts )
            // InternalKlangParser.g:2076:2: Starts
            {
             before(grammarAccess.getGameStartEventAccess().getStartsKeyword_2()); 
            match(input,Starts,FOLLOW_2); 
             after(grammarAccess.getGameStartEventAccess().getStartsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameStartEvent__Group__2__Impl"


    // $ANTLR start "rule__ClickEvent__Group__0"
    // InternalKlangParser.g:2086:1: rule__ClickEvent__Group__0 : rule__ClickEvent__Group__0__Impl rule__ClickEvent__Group__1 ;
    public final void rule__ClickEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2090:1: ( rule__ClickEvent__Group__0__Impl rule__ClickEvent__Group__1 )
            // InternalKlangParser.g:2091:2: rule__ClickEvent__Group__0__Impl rule__ClickEvent__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ClickEvent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickEvent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickEvent__Group__0"


    // $ANTLR start "rule__ClickEvent__Group__0__Impl"
    // InternalKlangParser.g:2098:1: rule__ClickEvent__Group__0__Impl : ( () ) ;
    public final void rule__ClickEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2102:1: ( ( () ) )
            // InternalKlangParser.g:2103:1: ( () )
            {
            // InternalKlangParser.g:2103:1: ( () )
            // InternalKlangParser.g:2104:2: ()
            {
             before(grammarAccess.getClickEventAccess().getClickEventAction_0()); 
            // InternalKlangParser.g:2105:2: ()
            // InternalKlangParser.g:2105:3: 
            {
            }

             after(grammarAccess.getClickEventAccess().getClickEventAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickEvent__Group__0__Impl"


    // $ANTLR start "rule__ClickEvent__Group__1"
    // InternalKlangParser.g:2113:1: rule__ClickEvent__Group__1 : rule__ClickEvent__Group__1__Impl ;
    public final void rule__ClickEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2117:1: ( rule__ClickEvent__Group__1__Impl )
            // InternalKlangParser.g:2118:2: rule__ClickEvent__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClickEvent__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickEvent__Group__1"


    // $ANTLR start "rule__ClickEvent__Group__1__Impl"
    // InternalKlangParser.g:2124:1: rule__ClickEvent__Group__1__Impl : ( Clicked ) ;
    public final void rule__ClickEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2128:1: ( ( Clicked ) )
            // InternalKlangParser.g:2129:1: ( Clicked )
            {
            // InternalKlangParser.g:2129:1: ( Clicked )
            // InternalKlangParser.g:2130:2: Clicked
            {
             before(grammarAccess.getClickEventAccess().getClickedKeyword_1()); 
            match(input,Clicked,FOLLOW_2); 
             after(grammarAccess.getClickEventAccess().getClickedKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickEvent__Group__1__Impl"


    // $ANTLR start "rule__KeyPressedEvent__Group__0"
    // InternalKlangParser.g:2140:1: rule__KeyPressedEvent__Group__0 : rule__KeyPressedEvent__Group__0__Impl rule__KeyPressedEvent__Group__1 ;
    public final void rule__KeyPressedEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2144:1: ( rule__KeyPressedEvent__Group__0__Impl rule__KeyPressedEvent__Group__1 )
            // InternalKlangParser.g:2145:2: rule__KeyPressedEvent__Group__0__Impl rule__KeyPressedEvent__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__KeyPressedEvent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeyPressedEvent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyPressedEvent__Group__0"


    // $ANTLR start "rule__KeyPressedEvent__Group__0__Impl"
    // InternalKlangParser.g:2152:1: rule__KeyPressedEvent__Group__0__Impl : ( () ) ;
    public final void rule__KeyPressedEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2156:1: ( ( () ) )
            // InternalKlangParser.g:2157:1: ( () )
            {
            // InternalKlangParser.g:2157:1: ( () )
            // InternalKlangParser.g:2158:2: ()
            {
             before(grammarAccess.getKeyPressedEventAccess().getKeyPressEventAction_0()); 
            // InternalKlangParser.g:2159:2: ()
            // InternalKlangParser.g:2159:3: 
            {
            }

             after(grammarAccess.getKeyPressedEventAccess().getKeyPressEventAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyPressedEvent__Group__0__Impl"


    // $ANTLR start "rule__KeyPressedEvent__Group__1"
    // InternalKlangParser.g:2167:1: rule__KeyPressedEvent__Group__1 : rule__KeyPressedEvent__Group__1__Impl rule__KeyPressedEvent__Group__2 ;
    public final void rule__KeyPressedEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2171:1: ( rule__KeyPressedEvent__Group__1__Impl rule__KeyPressedEvent__Group__2 )
            // InternalKlangParser.g:2172:2: rule__KeyPressedEvent__Group__1__Impl rule__KeyPressedEvent__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__KeyPressedEvent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeyPressedEvent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyPressedEvent__Group__1"


    // $ANTLR start "rule__KeyPressedEvent__Group__1__Impl"
    // InternalKlangParser.g:2179:1: rule__KeyPressedEvent__Group__1__Impl : ( ( rule__KeyPressedEvent__KeyAssignment_1 ) ) ;
    public final void rule__KeyPressedEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2183:1: ( ( ( rule__KeyPressedEvent__KeyAssignment_1 ) ) )
            // InternalKlangParser.g:2184:1: ( ( rule__KeyPressedEvent__KeyAssignment_1 ) )
            {
            // InternalKlangParser.g:2184:1: ( ( rule__KeyPressedEvent__KeyAssignment_1 ) )
            // InternalKlangParser.g:2185:2: ( rule__KeyPressedEvent__KeyAssignment_1 )
            {
             before(grammarAccess.getKeyPressedEventAccess().getKeyAssignment_1()); 
            // InternalKlangParser.g:2186:2: ( rule__KeyPressedEvent__KeyAssignment_1 )
            // InternalKlangParser.g:2186:3: rule__KeyPressedEvent__KeyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__KeyPressedEvent__KeyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKeyPressedEventAccess().getKeyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyPressedEvent__Group__1__Impl"


    // $ANTLR start "rule__KeyPressedEvent__Group__2"
    // InternalKlangParser.g:2194:1: rule__KeyPressedEvent__Group__2 : rule__KeyPressedEvent__Group__2__Impl ;
    public final void rule__KeyPressedEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2198:1: ( rule__KeyPressedEvent__Group__2__Impl )
            // InternalKlangParser.g:2199:2: rule__KeyPressedEvent__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KeyPressedEvent__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyPressedEvent__Group__2"


    // $ANTLR start "rule__KeyPressedEvent__Group__2__Impl"
    // InternalKlangParser.g:2205:1: rule__KeyPressedEvent__Group__2__Impl : ( Pressed ) ;
    public final void rule__KeyPressedEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2209:1: ( ( Pressed ) )
            // InternalKlangParser.g:2210:1: ( Pressed )
            {
            // InternalKlangParser.g:2210:1: ( Pressed )
            // InternalKlangParser.g:2211:2: Pressed
            {
             before(grammarAccess.getKeyPressedEventAccess().getPressedKeyword_2()); 
            match(input,Pressed,FOLLOW_2); 
             after(grammarAccess.getKeyPressedEventAccess().getPressedKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyPressedEvent__Group__2__Impl"


    // $ANTLR start "rule__CollisionEvent__Group__0"
    // InternalKlangParser.g:2221:1: rule__CollisionEvent__Group__0 : rule__CollisionEvent__Group__0__Impl rule__CollisionEvent__Group__1 ;
    public final void rule__CollisionEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2225:1: ( rule__CollisionEvent__Group__0__Impl rule__CollisionEvent__Group__1 )
            // InternalKlangParser.g:2226:2: rule__CollisionEvent__Group__0__Impl rule__CollisionEvent__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__CollisionEvent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollisionEvent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollisionEvent__Group__0"


    // $ANTLR start "rule__CollisionEvent__Group__0__Impl"
    // InternalKlangParser.g:2233:1: rule__CollisionEvent__Group__0__Impl : ( () ) ;
    public final void rule__CollisionEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2237:1: ( ( () ) )
            // InternalKlangParser.g:2238:1: ( () )
            {
            // InternalKlangParser.g:2238:1: ( () )
            // InternalKlangParser.g:2239:2: ()
            {
             before(grammarAccess.getCollisionEventAccess().getCollisionEventAction_0()); 
            // InternalKlangParser.g:2240:2: ()
            // InternalKlangParser.g:2240:3: 
            {
            }

             after(grammarAccess.getCollisionEventAccess().getCollisionEventAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollisionEvent__Group__0__Impl"


    // $ANTLR start "rule__CollisionEvent__Group__1"
    // InternalKlangParser.g:2248:1: rule__CollisionEvent__Group__1 : rule__CollisionEvent__Group__1__Impl rule__CollisionEvent__Group__2 ;
    public final void rule__CollisionEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2252:1: ( rule__CollisionEvent__Group__1__Impl rule__CollisionEvent__Group__2 )
            // InternalKlangParser.g:2253:2: rule__CollisionEvent__Group__1__Impl rule__CollisionEvent__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__CollisionEvent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollisionEvent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollisionEvent__Group__1"


    // $ANTLR start "rule__CollisionEvent__Group__1__Impl"
    // InternalKlangParser.g:2260:1: rule__CollisionEvent__Group__1__Impl : ( Collides ) ;
    public final void rule__CollisionEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2264:1: ( ( Collides ) )
            // InternalKlangParser.g:2265:1: ( Collides )
            {
            // InternalKlangParser.g:2265:1: ( Collides )
            // InternalKlangParser.g:2266:2: Collides
            {
             before(grammarAccess.getCollisionEventAccess().getCollidesKeyword_1()); 
            match(input,Collides,FOLLOW_2); 
             after(grammarAccess.getCollisionEventAccess().getCollidesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollisionEvent__Group__1__Impl"


    // $ANTLR start "rule__CollisionEvent__Group__2"
    // InternalKlangParser.g:2275:1: rule__CollisionEvent__Group__2 : rule__CollisionEvent__Group__2__Impl rule__CollisionEvent__Group__3 ;
    public final void rule__CollisionEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2279:1: ( rule__CollisionEvent__Group__2__Impl rule__CollisionEvent__Group__3 )
            // InternalKlangParser.g:2280:2: rule__CollisionEvent__Group__2__Impl rule__CollisionEvent__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__CollisionEvent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollisionEvent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollisionEvent__Group__2"


    // $ANTLR start "rule__CollisionEvent__Group__2__Impl"
    // InternalKlangParser.g:2287:1: rule__CollisionEvent__Group__2__Impl : ( With ) ;
    public final void rule__CollisionEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2291:1: ( ( With ) )
            // InternalKlangParser.g:2292:1: ( With )
            {
            // InternalKlangParser.g:2292:1: ( With )
            // InternalKlangParser.g:2293:2: With
            {
             before(grammarAccess.getCollisionEventAccess().getWithKeyword_2()); 
            match(input,With,FOLLOW_2); 
             after(grammarAccess.getCollisionEventAccess().getWithKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollisionEvent__Group__2__Impl"


    // $ANTLR start "rule__CollisionEvent__Group__3"
    // InternalKlangParser.g:2302:1: rule__CollisionEvent__Group__3 : rule__CollisionEvent__Group__3__Impl ;
    public final void rule__CollisionEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2306:1: ( rule__CollisionEvent__Group__3__Impl )
            // InternalKlangParser.g:2307:2: rule__CollisionEvent__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CollisionEvent__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollisionEvent__Group__3"


    // $ANTLR start "rule__CollisionEvent__Group__3__Impl"
    // InternalKlangParser.g:2313:1: rule__CollisionEvent__Group__3__Impl : ( ( rule__CollisionEvent__TargetAssignment_3 ) ) ;
    public final void rule__CollisionEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2317:1: ( ( ( rule__CollisionEvent__TargetAssignment_3 ) ) )
            // InternalKlangParser.g:2318:1: ( ( rule__CollisionEvent__TargetAssignment_3 ) )
            {
            // InternalKlangParser.g:2318:1: ( ( rule__CollisionEvent__TargetAssignment_3 ) )
            // InternalKlangParser.g:2319:2: ( rule__CollisionEvent__TargetAssignment_3 )
            {
             before(grammarAccess.getCollisionEventAccess().getTargetAssignment_3()); 
            // InternalKlangParser.g:2320:2: ( rule__CollisionEvent__TargetAssignment_3 )
            // InternalKlangParser.g:2320:3: rule__CollisionEvent__TargetAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CollisionEvent__TargetAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCollisionEventAccess().getTargetAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollisionEvent__Group__3__Impl"


    // $ANTLR start "rule__SendMessage__Group__0"
    // InternalKlangParser.g:2329:1: rule__SendMessage__Group__0 : rule__SendMessage__Group__0__Impl rule__SendMessage__Group__1 ;
    public final void rule__SendMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2333:1: ( rule__SendMessage__Group__0__Impl rule__SendMessage__Group__1 )
            // InternalKlangParser.g:2334:2: rule__SendMessage__Group__0__Impl rule__SendMessage__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__SendMessage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SendMessage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendMessage__Group__0"


    // $ANTLR start "rule__SendMessage__Group__0__Impl"
    // InternalKlangParser.g:2341:1: rule__SendMessage__Group__0__Impl : ( () ) ;
    public final void rule__SendMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2345:1: ( ( () ) )
            // InternalKlangParser.g:2346:1: ( () )
            {
            // InternalKlangParser.g:2346:1: ( () )
            // InternalKlangParser.g:2347:2: ()
            {
             before(grammarAccess.getSendMessageAccess().getSendMessageAction_0()); 
            // InternalKlangParser.g:2348:2: ()
            // InternalKlangParser.g:2348:3: 
            {
            }

             after(grammarAccess.getSendMessageAccess().getSendMessageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendMessage__Group__0__Impl"


    // $ANTLR start "rule__SendMessage__Group__1"
    // InternalKlangParser.g:2356:1: rule__SendMessage__Group__1 : rule__SendMessage__Group__1__Impl rule__SendMessage__Group__2 ;
    public final void rule__SendMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2360:1: ( rule__SendMessage__Group__1__Impl rule__SendMessage__Group__2 )
            // InternalKlangParser.g:2361:2: rule__SendMessage__Group__1__Impl rule__SendMessage__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__SendMessage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SendMessage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendMessage__Group__1"


    // $ANTLR start "rule__SendMessage__Group__1__Impl"
    // InternalKlangParser.g:2368:1: rule__SendMessage__Group__1__Impl : ( SendMessage ) ;
    public final void rule__SendMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2372:1: ( ( SendMessage ) )
            // InternalKlangParser.g:2373:1: ( SendMessage )
            {
            // InternalKlangParser.g:2373:1: ( SendMessage )
            // InternalKlangParser.g:2374:2: SendMessage
            {
             before(grammarAccess.getSendMessageAccess().getSendMessageKeyword_1()); 
            match(input,SendMessage,FOLLOW_2); 
             after(grammarAccess.getSendMessageAccess().getSendMessageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendMessage__Group__1__Impl"


    // $ANTLR start "rule__SendMessage__Group__2"
    // InternalKlangParser.g:2383:1: rule__SendMessage__Group__2 : rule__SendMessage__Group__2__Impl rule__SendMessage__Group__3 ;
    public final void rule__SendMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2387:1: ( rule__SendMessage__Group__2__Impl rule__SendMessage__Group__3 )
            // InternalKlangParser.g:2388:2: rule__SendMessage__Group__2__Impl rule__SendMessage__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__SendMessage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SendMessage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendMessage__Group__2"


    // $ANTLR start "rule__SendMessage__Group__2__Impl"
    // InternalKlangParser.g:2395:1: rule__SendMessage__Group__2__Impl : ( LeftParenthesis ) ;
    public final void rule__SendMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2399:1: ( ( LeftParenthesis ) )
            // InternalKlangParser.g:2400:1: ( LeftParenthesis )
            {
            // InternalKlangParser.g:2400:1: ( LeftParenthesis )
            // InternalKlangParser.g:2401:2: LeftParenthesis
            {
             before(grammarAccess.getSendMessageAccess().getLeftParenthesisKeyword_2()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getSendMessageAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendMessage__Group__2__Impl"


    // $ANTLR start "rule__SendMessage__Group__3"
    // InternalKlangParser.g:2410:1: rule__SendMessage__Group__3 : rule__SendMessage__Group__3__Impl rule__SendMessage__Group__4 ;
    public final void rule__SendMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2414:1: ( rule__SendMessage__Group__3__Impl rule__SendMessage__Group__4 )
            // InternalKlangParser.g:2415:2: rule__SendMessage__Group__3__Impl rule__SendMessage__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__SendMessage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SendMessage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendMessage__Group__3"


    // $ANTLR start "rule__SendMessage__Group__3__Impl"
    // InternalKlangParser.g:2422:1: rule__SendMessage__Group__3__Impl : ( ( rule__SendMessage__NameAssignment_3 ) ) ;
    public final void rule__SendMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2426:1: ( ( ( rule__SendMessage__NameAssignment_3 ) ) )
            // InternalKlangParser.g:2427:1: ( ( rule__SendMessage__NameAssignment_3 ) )
            {
            // InternalKlangParser.g:2427:1: ( ( rule__SendMessage__NameAssignment_3 ) )
            // InternalKlangParser.g:2428:2: ( rule__SendMessage__NameAssignment_3 )
            {
             before(grammarAccess.getSendMessageAccess().getNameAssignment_3()); 
            // InternalKlangParser.g:2429:2: ( rule__SendMessage__NameAssignment_3 )
            // InternalKlangParser.g:2429:3: rule__SendMessage__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SendMessage__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSendMessageAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendMessage__Group__3__Impl"


    // $ANTLR start "rule__SendMessage__Group__4"
    // InternalKlangParser.g:2437:1: rule__SendMessage__Group__4 : rule__SendMessage__Group__4__Impl ;
    public final void rule__SendMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2441:1: ( rule__SendMessage__Group__4__Impl )
            // InternalKlangParser.g:2442:2: rule__SendMessage__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SendMessage__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendMessage__Group__4"


    // $ANTLR start "rule__SendMessage__Group__4__Impl"
    // InternalKlangParser.g:2448:1: rule__SendMessage__Group__4__Impl : ( RightParenthesis ) ;
    public final void rule__SendMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2452:1: ( ( RightParenthesis ) )
            // InternalKlangParser.g:2453:1: ( RightParenthesis )
            {
            // InternalKlangParser.g:2453:1: ( RightParenthesis )
            // InternalKlangParser.g:2454:2: RightParenthesis
            {
             before(grammarAccess.getSendMessageAccess().getRightParenthesisKeyword_4()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getSendMessageAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendMessage__Group__4__Impl"


    // $ANTLR start "rule__WhileLoop__Group__0"
    // InternalKlangParser.g:2464:1: rule__WhileLoop__Group__0 : rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 ;
    public final void rule__WhileLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2468:1: ( rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 )
            // InternalKlangParser.g:2469:2: rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalKlangParser.g:2476:1: rule__WhileLoop__Group__0__Impl : ( () ) ;
    public final void rule__WhileLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2480:1: ( ( () ) )
            // InternalKlangParser.g:2481:1: ( () )
            {
            // InternalKlangParser.g:2481:1: ( () )
            // InternalKlangParser.g:2482:2: ()
            {
             before(grammarAccess.getWhileLoopAccess().getWhileLoopAction_0()); 
            // InternalKlangParser.g:2483:2: ()
            // InternalKlangParser.g:2483:3: 
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
    // InternalKlangParser.g:2491:1: rule__WhileLoop__Group__1 : rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 ;
    public final void rule__WhileLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2495:1: ( rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 )
            // InternalKlangParser.g:2496:2: rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalKlangParser.g:2503:1: rule__WhileLoop__Group__1__Impl : ( While ) ;
    public final void rule__WhileLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2507:1: ( ( While ) )
            // InternalKlangParser.g:2508:1: ( While )
            {
            // InternalKlangParser.g:2508:1: ( While )
            // InternalKlangParser.g:2509:2: While
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
    // InternalKlangParser.g:2518:1: rule__WhileLoop__Group__2 : rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 ;
    public final void rule__WhileLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2522:1: ( rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 )
            // InternalKlangParser.g:2523:2: rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3
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
    // InternalKlangParser.g:2530:1: rule__WhileLoop__Group__2__Impl : ( ( rule__WhileLoop__PredicateAssignment_2 ) ) ;
    public final void rule__WhileLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2534:1: ( ( ( rule__WhileLoop__PredicateAssignment_2 ) ) )
            // InternalKlangParser.g:2535:1: ( ( rule__WhileLoop__PredicateAssignment_2 ) )
            {
            // InternalKlangParser.g:2535:1: ( ( rule__WhileLoop__PredicateAssignment_2 ) )
            // InternalKlangParser.g:2536:2: ( rule__WhileLoop__PredicateAssignment_2 )
            {
             before(grammarAccess.getWhileLoopAccess().getPredicateAssignment_2()); 
            // InternalKlangParser.g:2537:2: ( rule__WhileLoop__PredicateAssignment_2 )
            // InternalKlangParser.g:2537:3: rule__WhileLoop__PredicateAssignment_2
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
    // InternalKlangParser.g:2545:1: rule__WhileLoop__Group__3 : rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 ;
    public final void rule__WhileLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2549:1: ( rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 )
            // InternalKlangParser.g:2550:2: rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4
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
    // InternalKlangParser.g:2557:1: rule__WhileLoop__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__WhileLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2561:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:2562:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:2562:1: ( RULE_BEGIN )
            // InternalKlangParser.g:2563:2: RULE_BEGIN
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
    // InternalKlangParser.g:2572:1: rule__WhileLoop__Group__4 : rule__WhileLoop__Group__4__Impl rule__WhileLoop__Group__5 ;
    public final void rule__WhileLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2576:1: ( rule__WhileLoop__Group__4__Impl rule__WhileLoop__Group__5 )
            // InternalKlangParser.g:2577:2: rule__WhileLoop__Group__4__Impl rule__WhileLoop__Group__5
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
    // InternalKlangParser.g:2584:1: rule__WhileLoop__Group__4__Impl : ( ( rule__WhileLoop__StatementsAssignment_4 )* ) ;
    public final void rule__WhileLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2588:1: ( ( ( rule__WhileLoop__StatementsAssignment_4 )* ) )
            // InternalKlangParser.g:2589:1: ( ( rule__WhileLoop__StatementsAssignment_4 )* )
            {
            // InternalKlangParser.g:2589:1: ( ( rule__WhileLoop__StatementsAssignment_4 )* )
            // InternalKlangParser.g:2590:2: ( rule__WhileLoop__StatementsAssignment_4 )*
            {
             before(grammarAccess.getWhileLoopAccess().getStatementsAssignment_4()); 
            // InternalKlangParser.g:2591:2: ( rule__WhileLoop__StatementsAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==SendMessage||LA16_0==Forever||(LA16_0>=Sleep && LA16_0<=While)||LA16_0==If||LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalKlangParser.g:2591:3: rule__WhileLoop__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__WhileLoop__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getWhileLoopAccess().getStatementsAssignment_4()); 

            }


            }

        }
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
    // InternalKlangParser.g:2599:1: rule__WhileLoop__Group__5 : rule__WhileLoop__Group__5__Impl ;
    public final void rule__WhileLoop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2603:1: ( rule__WhileLoop__Group__5__Impl )
            // InternalKlangParser.g:2604:2: rule__WhileLoop__Group__5__Impl
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
    // InternalKlangParser.g:2610:1: rule__WhileLoop__Group__5__Impl : ( RULE_END ) ;
    public final void rule__WhileLoop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2614:1: ( ( RULE_END ) )
            // InternalKlangParser.g:2615:1: ( RULE_END )
            {
            // InternalKlangParser.g:2615:1: ( RULE_END )
            // InternalKlangParser.g:2616:2: RULE_END
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
    // InternalKlangParser.g:2626:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2630:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalKlangParser.g:2631:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalKlangParser.g:2638:1: rule__If__Group__0__Impl : ( () ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2642:1: ( ( () ) )
            // InternalKlangParser.g:2643:1: ( () )
            {
            // InternalKlangParser.g:2643:1: ( () )
            // InternalKlangParser.g:2644:2: ()
            {
             before(grammarAccess.getIfAccess().getIfAction_0()); 
            // InternalKlangParser.g:2645:2: ()
            // InternalKlangParser.g:2645:3: 
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
    // InternalKlangParser.g:2653:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2657:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalKlangParser.g:2658:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalKlangParser.g:2665:1: rule__If__Group__1__Impl : ( If ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2669:1: ( ( If ) )
            // InternalKlangParser.g:2670:1: ( If )
            {
            // InternalKlangParser.g:2670:1: ( If )
            // InternalKlangParser.g:2671:2: If
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
    // InternalKlangParser.g:2680:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2684:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // InternalKlangParser.g:2685:2: rule__If__Group__2__Impl rule__If__Group__3
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
    // InternalKlangParser.g:2692:1: rule__If__Group__2__Impl : ( ( rule__If__PredicateAssignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2696:1: ( ( ( rule__If__PredicateAssignment_2 ) ) )
            // InternalKlangParser.g:2697:1: ( ( rule__If__PredicateAssignment_2 ) )
            {
            // InternalKlangParser.g:2697:1: ( ( rule__If__PredicateAssignment_2 ) )
            // InternalKlangParser.g:2698:2: ( rule__If__PredicateAssignment_2 )
            {
             before(grammarAccess.getIfAccess().getPredicateAssignment_2()); 
            // InternalKlangParser.g:2699:2: ( rule__If__PredicateAssignment_2 )
            // InternalKlangParser.g:2699:3: rule__If__PredicateAssignment_2
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
    // InternalKlangParser.g:2707:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2711:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // InternalKlangParser.g:2712:2: rule__If__Group__3__Impl rule__If__Group__4
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
    // InternalKlangParser.g:2719:1: rule__If__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2723:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:2724:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:2724:1: ( RULE_BEGIN )
            // InternalKlangParser.g:2725:2: RULE_BEGIN
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
    // InternalKlangParser.g:2734:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2738:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // InternalKlangParser.g:2739:2: rule__If__Group__4__Impl rule__If__Group__5
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
    // InternalKlangParser.g:2746:1: rule__If__Group__4__Impl : ( ( rule__If__IfBlockAssignment_4 )* ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2750:1: ( ( ( rule__If__IfBlockAssignment_4 )* ) )
            // InternalKlangParser.g:2751:1: ( ( rule__If__IfBlockAssignment_4 )* )
            {
            // InternalKlangParser.g:2751:1: ( ( rule__If__IfBlockAssignment_4 )* )
            // InternalKlangParser.g:2752:2: ( rule__If__IfBlockAssignment_4 )*
            {
             before(grammarAccess.getIfAccess().getIfBlockAssignment_4()); 
            // InternalKlangParser.g:2753:2: ( rule__If__IfBlockAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==SendMessage||LA17_0==Forever||(LA17_0>=Sleep && LA17_0<=While)||LA17_0==If||LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalKlangParser.g:2753:3: rule__If__IfBlockAssignment_4
            	    {
            	    pushFollow(FOLLOW_13);
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
    // InternalKlangParser.g:2761:1: rule__If__Group__5 : rule__If__Group__5__Impl rule__If__Group__6 ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2765:1: ( rule__If__Group__5__Impl rule__If__Group__6 )
            // InternalKlangParser.g:2766:2: rule__If__Group__5__Impl rule__If__Group__6
            {
            pushFollow(FOLLOW_28);
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
    // InternalKlangParser.g:2773:1: rule__If__Group__5__Impl : ( RULE_END ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2777:1: ( ( RULE_END ) )
            // InternalKlangParser.g:2778:1: ( RULE_END )
            {
            // InternalKlangParser.g:2778:1: ( RULE_END )
            // InternalKlangParser.g:2779:2: RULE_END
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
    // InternalKlangParser.g:2788:1: rule__If__Group__6 : rule__If__Group__6__Impl ;
    public final void rule__If__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2792:1: ( rule__If__Group__6__Impl )
            // InternalKlangParser.g:2793:2: rule__If__Group__6__Impl
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
    // InternalKlangParser.g:2799:1: rule__If__Group__6__Impl : ( ( rule__If__Group_6__0 )? ) ;
    public final void rule__If__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2803:1: ( ( ( rule__If__Group_6__0 )? ) )
            // InternalKlangParser.g:2804:1: ( ( rule__If__Group_6__0 )? )
            {
            // InternalKlangParser.g:2804:1: ( ( rule__If__Group_6__0 )? )
            // InternalKlangParser.g:2805:2: ( rule__If__Group_6__0 )?
            {
             before(grammarAccess.getIfAccess().getGroup_6()); 
            // InternalKlangParser.g:2806:2: ( rule__If__Group_6__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Else) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalKlangParser.g:2806:3: rule__If__Group_6__0
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
    // InternalKlangParser.g:2815:1: rule__If__Group_6__0 : rule__If__Group_6__0__Impl rule__If__Group_6__1 ;
    public final void rule__If__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2819:1: ( rule__If__Group_6__0__Impl rule__If__Group_6__1 )
            // InternalKlangParser.g:2820:2: rule__If__Group_6__0__Impl rule__If__Group_6__1
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
    // InternalKlangParser.g:2827:1: rule__If__Group_6__0__Impl : ( Else ) ;
    public final void rule__If__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2831:1: ( ( Else ) )
            // InternalKlangParser.g:2832:1: ( Else )
            {
            // InternalKlangParser.g:2832:1: ( Else )
            // InternalKlangParser.g:2833:2: Else
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
    // InternalKlangParser.g:2842:1: rule__If__Group_6__1 : rule__If__Group_6__1__Impl rule__If__Group_6__2 ;
    public final void rule__If__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2846:1: ( rule__If__Group_6__1__Impl rule__If__Group_6__2 )
            // InternalKlangParser.g:2847:2: rule__If__Group_6__1__Impl rule__If__Group_6__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalKlangParser.g:2854:1: rule__If__Group_6__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__If__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2858:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:2859:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:2859:1: ( RULE_BEGIN )
            // InternalKlangParser.g:2860:2: RULE_BEGIN
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
    // InternalKlangParser.g:2869:1: rule__If__Group_6__2 : rule__If__Group_6__2__Impl rule__If__Group_6__3 ;
    public final void rule__If__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2873:1: ( rule__If__Group_6__2__Impl rule__If__Group_6__3 )
            // InternalKlangParser.g:2874:2: rule__If__Group_6__2__Impl rule__If__Group_6__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalKlangParser.g:2881:1: rule__If__Group_6__2__Impl : ( ( rule__If__ElseBlockAssignment_6_2 )* ) ;
    public final void rule__If__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2885:1: ( ( ( rule__If__ElseBlockAssignment_6_2 )* ) )
            // InternalKlangParser.g:2886:1: ( ( rule__If__ElseBlockAssignment_6_2 )* )
            {
            // InternalKlangParser.g:2886:1: ( ( rule__If__ElseBlockAssignment_6_2 )* )
            // InternalKlangParser.g:2887:2: ( rule__If__ElseBlockAssignment_6_2 )*
            {
             before(grammarAccess.getIfAccess().getElseBlockAssignment_6_2()); 
            // InternalKlangParser.g:2888:2: ( rule__If__ElseBlockAssignment_6_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==SendMessage||LA19_0==Forever||(LA19_0>=Sleep && LA19_0<=While)||LA19_0==If||LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalKlangParser.g:2888:3: rule__If__ElseBlockAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_13);
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
    // InternalKlangParser.g:2896:1: rule__If__Group_6__3 : rule__If__Group_6__3__Impl ;
    public final void rule__If__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2900:1: ( rule__If__Group_6__3__Impl )
            // InternalKlangParser.g:2901:2: rule__If__Group_6__3__Impl
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
    // InternalKlangParser.g:2907:1: rule__If__Group_6__3__Impl : ( RULE_END ) ;
    public final void rule__If__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2911:1: ( ( RULE_END ) )
            // InternalKlangParser.g:2912:1: ( RULE_END )
            {
            // InternalKlangParser.g:2912:1: ( RULE_END )
            // InternalKlangParser.g:2913:2: RULE_END
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
    // InternalKlangParser.g:2923:1: rule__ForeverLoop__Group__0 : rule__ForeverLoop__Group__0__Impl rule__ForeverLoop__Group__1 ;
    public final void rule__ForeverLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2927:1: ( rule__ForeverLoop__Group__0__Impl rule__ForeverLoop__Group__1 )
            // InternalKlangParser.g:2928:2: rule__ForeverLoop__Group__0__Impl rule__ForeverLoop__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalKlangParser.g:2935:1: rule__ForeverLoop__Group__0__Impl : ( () ) ;
    public final void rule__ForeverLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2939:1: ( ( () ) )
            // InternalKlangParser.g:2940:1: ( () )
            {
            // InternalKlangParser.g:2940:1: ( () )
            // InternalKlangParser.g:2941:2: ()
            {
             before(grammarAccess.getForeverLoopAccess().getForeverLoopAction_0()); 
            // InternalKlangParser.g:2942:2: ()
            // InternalKlangParser.g:2942:3: 
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
    // InternalKlangParser.g:2950:1: rule__ForeverLoop__Group__1 : rule__ForeverLoop__Group__1__Impl rule__ForeverLoop__Group__2 ;
    public final void rule__ForeverLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2954:1: ( rule__ForeverLoop__Group__1__Impl rule__ForeverLoop__Group__2 )
            // InternalKlangParser.g:2955:2: rule__ForeverLoop__Group__1__Impl rule__ForeverLoop__Group__2
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
    // InternalKlangParser.g:2962:1: rule__ForeverLoop__Group__1__Impl : ( Forever ) ;
    public final void rule__ForeverLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2966:1: ( ( Forever ) )
            // InternalKlangParser.g:2967:1: ( Forever )
            {
            // InternalKlangParser.g:2967:1: ( Forever )
            // InternalKlangParser.g:2968:2: Forever
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
    // InternalKlangParser.g:2977:1: rule__ForeverLoop__Group__2 : rule__ForeverLoop__Group__2__Impl rule__ForeverLoop__Group__3 ;
    public final void rule__ForeverLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2981:1: ( rule__ForeverLoop__Group__2__Impl rule__ForeverLoop__Group__3 )
            // InternalKlangParser.g:2982:2: rule__ForeverLoop__Group__2__Impl rule__ForeverLoop__Group__3
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
    // InternalKlangParser.g:2989:1: rule__ForeverLoop__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__ForeverLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2993:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:2994:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:2994:1: ( RULE_BEGIN )
            // InternalKlangParser.g:2995:2: RULE_BEGIN
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
    // InternalKlangParser.g:3004:1: rule__ForeverLoop__Group__3 : rule__ForeverLoop__Group__3__Impl rule__ForeverLoop__Group__4 ;
    public final void rule__ForeverLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3008:1: ( rule__ForeverLoop__Group__3__Impl rule__ForeverLoop__Group__4 )
            // InternalKlangParser.g:3009:2: rule__ForeverLoop__Group__3__Impl rule__ForeverLoop__Group__4
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
    // InternalKlangParser.g:3016:1: rule__ForeverLoop__Group__3__Impl : ( ( rule__ForeverLoop__StatementsAssignment_3 )* ) ;
    public final void rule__ForeverLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3020:1: ( ( ( rule__ForeverLoop__StatementsAssignment_3 )* ) )
            // InternalKlangParser.g:3021:1: ( ( rule__ForeverLoop__StatementsAssignment_3 )* )
            {
            // InternalKlangParser.g:3021:1: ( ( rule__ForeverLoop__StatementsAssignment_3 )* )
            // InternalKlangParser.g:3022:2: ( rule__ForeverLoop__StatementsAssignment_3 )*
            {
             before(grammarAccess.getForeverLoopAccess().getStatementsAssignment_3()); 
            // InternalKlangParser.g:3023:2: ( rule__ForeverLoop__StatementsAssignment_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==SendMessage||LA20_0==Forever||(LA20_0>=Sleep && LA20_0<=While)||LA20_0==If||LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalKlangParser.g:3023:3: rule__ForeverLoop__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ForeverLoop__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getForeverLoopAccess().getStatementsAssignment_3()); 

            }


            }

        }
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
    // InternalKlangParser.g:3031:1: rule__ForeverLoop__Group__4 : rule__ForeverLoop__Group__4__Impl ;
    public final void rule__ForeverLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3035:1: ( rule__ForeverLoop__Group__4__Impl )
            // InternalKlangParser.g:3036:2: rule__ForeverLoop__Group__4__Impl
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
    // InternalKlangParser.g:3042:1: rule__ForeverLoop__Group__4__Impl : ( RULE_END ) ;
    public final void rule__ForeverLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3046:1: ( ( RULE_END ) )
            // InternalKlangParser.g:3047:1: ( RULE_END )
            {
            // InternalKlangParser.g:3047:1: ( RULE_END )
            // InternalKlangParser.g:3048:2: RULE_END
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
    // InternalKlangParser.g:3058:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3062:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalKlangParser.g:3063:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalKlangParser.g:3070:1: rule__VariableDeclaration__Group__0__Impl : ( Var ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3074:1: ( ( Var ) )
            // InternalKlangParser.g:3075:1: ( Var )
            {
            // InternalKlangParser.g:3075:1: ( Var )
            // InternalKlangParser.g:3076:2: Var
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
    // InternalKlangParser.g:3085:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3089:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // InternalKlangParser.g:3090:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalKlangParser.g:3097:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3101:1: ( ( ( rule__VariableDeclaration__NameAssignment_1 ) ) )
            // InternalKlangParser.g:3102:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            {
            // InternalKlangParser.g:3102:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            // InternalKlangParser.g:3103:2: ( rule__VariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
            // InternalKlangParser.g:3104:2: ( rule__VariableDeclaration__NameAssignment_1 )
            // InternalKlangParser.g:3104:3: rule__VariableDeclaration__NameAssignment_1
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
    // InternalKlangParser.g:3112:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3116:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // InternalKlangParser.g:3117:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalKlangParser.g:3124:1: rule__VariableDeclaration__Group__2__Impl : ( EqualsSign ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3128:1: ( ( EqualsSign ) )
            // InternalKlangParser.g:3129:1: ( EqualsSign )
            {
            // InternalKlangParser.g:3129:1: ( EqualsSign )
            // InternalKlangParser.g:3130:2: EqualsSign
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
    // InternalKlangParser.g:3139:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3143:1: ( rule__VariableDeclaration__Group__3__Impl )
            // InternalKlangParser.g:3144:2: rule__VariableDeclaration__Group__3__Impl
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
    // InternalKlangParser.g:3150:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__ExpressionAssignment_3 ) ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3154:1: ( ( ( rule__VariableDeclaration__ExpressionAssignment_3 ) ) )
            // InternalKlangParser.g:3155:1: ( ( rule__VariableDeclaration__ExpressionAssignment_3 ) )
            {
            // InternalKlangParser.g:3155:1: ( ( rule__VariableDeclaration__ExpressionAssignment_3 ) )
            // InternalKlangParser.g:3156:2: ( rule__VariableDeclaration__ExpressionAssignment_3 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getExpressionAssignment_3()); 
            // InternalKlangParser.g:3157:2: ( rule__VariableDeclaration__ExpressionAssignment_3 )
            // InternalKlangParser.g:3157:3: rule__VariableDeclaration__ExpressionAssignment_3
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
    // InternalKlangParser.g:3166:1: rule__VariableAssignment__Group__0 : rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1 ;
    public final void rule__VariableAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3170:1: ( rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1 )
            // InternalKlangParser.g:3171:2: rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalKlangParser.g:3178:1: rule__VariableAssignment__Group__0__Impl : ( ( rule__VariableAssignment__VariableNameAssignment_0 ) ) ;
    public final void rule__VariableAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3182:1: ( ( ( rule__VariableAssignment__VariableNameAssignment_0 ) ) )
            // InternalKlangParser.g:3183:1: ( ( rule__VariableAssignment__VariableNameAssignment_0 ) )
            {
            // InternalKlangParser.g:3183:1: ( ( rule__VariableAssignment__VariableNameAssignment_0 ) )
            // InternalKlangParser.g:3184:2: ( rule__VariableAssignment__VariableNameAssignment_0 )
            {
             before(grammarAccess.getVariableAssignmentAccess().getVariableNameAssignment_0()); 
            // InternalKlangParser.g:3185:2: ( rule__VariableAssignment__VariableNameAssignment_0 )
            // InternalKlangParser.g:3185:3: rule__VariableAssignment__VariableNameAssignment_0
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
    // InternalKlangParser.g:3193:1: rule__VariableAssignment__Group__1 : rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2 ;
    public final void rule__VariableAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3197:1: ( rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2 )
            // InternalKlangParser.g:3198:2: rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalKlangParser.g:3205:1: rule__VariableAssignment__Group__1__Impl : ( EqualsSign ) ;
    public final void rule__VariableAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3209:1: ( ( EqualsSign ) )
            // InternalKlangParser.g:3210:1: ( EqualsSign )
            {
            // InternalKlangParser.g:3210:1: ( EqualsSign )
            // InternalKlangParser.g:3211:2: EqualsSign
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
    // InternalKlangParser.g:3220:1: rule__VariableAssignment__Group__2 : rule__VariableAssignment__Group__2__Impl ;
    public final void rule__VariableAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3224:1: ( rule__VariableAssignment__Group__2__Impl )
            // InternalKlangParser.g:3225:2: rule__VariableAssignment__Group__2__Impl
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
    // InternalKlangParser.g:3231:1: rule__VariableAssignment__Group__2__Impl : ( ( rule__VariableAssignment__ExpressionAssignment_2 ) ) ;
    public final void rule__VariableAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3235:1: ( ( ( rule__VariableAssignment__ExpressionAssignment_2 ) ) )
            // InternalKlangParser.g:3236:1: ( ( rule__VariableAssignment__ExpressionAssignment_2 ) )
            {
            // InternalKlangParser.g:3236:1: ( ( rule__VariableAssignment__ExpressionAssignment_2 ) )
            // InternalKlangParser.g:3237:2: ( rule__VariableAssignment__ExpressionAssignment_2 )
            {
             before(grammarAccess.getVariableAssignmentAccess().getExpressionAssignment_2()); 
            // InternalKlangParser.g:3238:2: ( rule__VariableAssignment__ExpressionAssignment_2 )
            // InternalKlangParser.g:3238:3: rule__VariableAssignment__ExpressionAssignment_2
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
    // InternalKlangParser.g:3247:1: rule__Sleep__Group__0 : rule__Sleep__Group__0__Impl rule__Sleep__Group__1 ;
    public final void rule__Sleep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3251:1: ( rule__Sleep__Group__0__Impl rule__Sleep__Group__1 )
            // InternalKlangParser.g:3252:2: rule__Sleep__Group__0__Impl rule__Sleep__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalKlangParser.g:3259:1: rule__Sleep__Group__0__Impl : ( () ) ;
    public final void rule__Sleep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3263:1: ( ( () ) )
            // InternalKlangParser.g:3264:1: ( () )
            {
            // InternalKlangParser.g:3264:1: ( () )
            // InternalKlangParser.g:3265:2: ()
            {
             before(grammarAccess.getSleepAccess().getSleepAction_0()); 
            // InternalKlangParser.g:3266:2: ()
            // InternalKlangParser.g:3266:3: 
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
    // InternalKlangParser.g:3274:1: rule__Sleep__Group__1 : rule__Sleep__Group__1__Impl rule__Sleep__Group__2 ;
    public final void rule__Sleep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3278:1: ( rule__Sleep__Group__1__Impl rule__Sleep__Group__2 )
            // InternalKlangParser.g:3279:2: rule__Sleep__Group__1__Impl rule__Sleep__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalKlangParser.g:3286:1: rule__Sleep__Group__1__Impl : ( Sleep ) ;
    public final void rule__Sleep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3290:1: ( ( Sleep ) )
            // InternalKlangParser.g:3291:1: ( Sleep )
            {
            // InternalKlangParser.g:3291:1: ( Sleep )
            // InternalKlangParser.g:3292:2: Sleep
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
    // InternalKlangParser.g:3301:1: rule__Sleep__Group__2 : rule__Sleep__Group__2__Impl rule__Sleep__Group__3 ;
    public final void rule__Sleep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3305:1: ( rule__Sleep__Group__2__Impl rule__Sleep__Group__3 )
            // InternalKlangParser.g:3306:2: rule__Sleep__Group__2__Impl rule__Sleep__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalKlangParser.g:3313:1: rule__Sleep__Group__2__Impl : ( LeftParenthesis ) ;
    public final void rule__Sleep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3317:1: ( ( LeftParenthesis ) )
            // InternalKlangParser.g:3318:1: ( LeftParenthesis )
            {
            // InternalKlangParser.g:3318:1: ( LeftParenthesis )
            // InternalKlangParser.g:3319:2: LeftParenthesis
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
    // InternalKlangParser.g:3328:1: rule__Sleep__Group__3 : rule__Sleep__Group__3__Impl rule__Sleep__Group__4 ;
    public final void rule__Sleep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3332:1: ( rule__Sleep__Group__3__Impl rule__Sleep__Group__4 )
            // InternalKlangParser.g:3333:2: rule__Sleep__Group__3__Impl rule__Sleep__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalKlangParser.g:3340:1: rule__Sleep__Group__3__Impl : ( ( rule__Sleep__DurationAssignment_3 ) ) ;
    public final void rule__Sleep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3344:1: ( ( ( rule__Sleep__DurationAssignment_3 ) ) )
            // InternalKlangParser.g:3345:1: ( ( rule__Sleep__DurationAssignment_3 ) )
            {
            // InternalKlangParser.g:3345:1: ( ( rule__Sleep__DurationAssignment_3 ) )
            // InternalKlangParser.g:3346:2: ( rule__Sleep__DurationAssignment_3 )
            {
             before(grammarAccess.getSleepAccess().getDurationAssignment_3()); 
            // InternalKlangParser.g:3347:2: ( rule__Sleep__DurationAssignment_3 )
            // InternalKlangParser.g:3347:3: rule__Sleep__DurationAssignment_3
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
    // InternalKlangParser.g:3355:1: rule__Sleep__Group__4 : rule__Sleep__Group__4__Impl ;
    public final void rule__Sleep__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3359:1: ( rule__Sleep__Group__4__Impl )
            // InternalKlangParser.g:3360:2: rule__Sleep__Group__4__Impl
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
    // InternalKlangParser.g:3366:1: rule__Sleep__Group__4__Impl : ( RightParenthesis ) ;
    public final void rule__Sleep__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3370:1: ( ( RightParenthesis ) )
            // InternalKlangParser.g:3371:1: ( RightParenthesis )
            {
            // InternalKlangParser.g:3371:1: ( RightParenthesis )
            // InternalKlangParser.g:3372:2: RightParenthesis
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
    // InternalKlangParser.g:3382:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3386:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalKlangParser.g:3387:2: rule__Or__Group__0__Impl rule__Or__Group__1
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
    // InternalKlangParser.g:3394:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3398:1: ( ( ruleAnd ) )
            // InternalKlangParser.g:3399:1: ( ruleAnd )
            {
            // InternalKlangParser.g:3399:1: ( ruleAnd )
            // InternalKlangParser.g:3400:2: ruleAnd
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
    // InternalKlangParser.g:3409:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3413:1: ( rule__Or__Group__1__Impl )
            // InternalKlangParser.g:3414:2: rule__Or__Group__1__Impl
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
    // InternalKlangParser.g:3420:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3424:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalKlangParser.g:3425:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalKlangParser.g:3425:1: ( ( rule__Or__Group_1__0 )* )
            // InternalKlangParser.g:3426:2: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // InternalKlangParser.g:3427:2: ( rule__Or__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Or) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalKlangParser.g:3427:3: rule__Or__Group_1__0
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
    // InternalKlangParser.g:3436:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3440:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalKlangParser.g:3441:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
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
    // InternalKlangParser.g:3448:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3452:1: ( ( () ) )
            // InternalKlangParser.g:3453:1: ( () )
            {
            // InternalKlangParser.g:3453:1: ( () )
            // InternalKlangParser.g:3454:2: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // InternalKlangParser.g:3455:2: ()
            // InternalKlangParser.g:3455:3: 
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
    // InternalKlangParser.g:3463:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3467:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalKlangParser.g:3468:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalKlangParser.g:3475:1: rule__Or__Group_1__1__Impl : ( Or ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3479:1: ( ( Or ) )
            // InternalKlangParser.g:3480:1: ( Or )
            {
            // InternalKlangParser.g:3480:1: ( Or )
            // InternalKlangParser.g:3481:2: Or
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
    // InternalKlangParser.g:3490:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3494:1: ( rule__Or__Group_1__2__Impl )
            // InternalKlangParser.g:3495:2: rule__Or__Group_1__2__Impl
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
    // InternalKlangParser.g:3501:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3505:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:3506:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:3506:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalKlangParser.g:3507:2: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:3508:2: ( rule__Or__RightAssignment_1_2 )
            // InternalKlangParser.g:3508:3: rule__Or__RightAssignment_1_2
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
    // InternalKlangParser.g:3517:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3521:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalKlangParser.g:3522:2: rule__And__Group__0__Impl rule__And__Group__1
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
    // InternalKlangParser.g:3529:1: rule__And__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3533:1: ( ( ruleComparison ) )
            // InternalKlangParser.g:3534:1: ( ruleComparison )
            {
            // InternalKlangParser.g:3534:1: ( ruleComparison )
            // InternalKlangParser.g:3535:2: ruleComparison
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
    // InternalKlangParser.g:3544:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3548:1: ( rule__And__Group__1__Impl )
            // InternalKlangParser.g:3549:2: rule__And__Group__1__Impl
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
    // InternalKlangParser.g:3555:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3559:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalKlangParser.g:3560:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalKlangParser.g:3560:1: ( ( rule__And__Group_1__0 )* )
            // InternalKlangParser.g:3561:2: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // InternalKlangParser.g:3562:2: ( rule__And__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==And) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalKlangParser.g:3562:3: rule__And__Group_1__0
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
    // InternalKlangParser.g:3571:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3575:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalKlangParser.g:3576:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
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
    // InternalKlangParser.g:3583:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3587:1: ( ( () ) )
            // InternalKlangParser.g:3588:1: ( () )
            {
            // InternalKlangParser.g:3588:1: ( () )
            // InternalKlangParser.g:3589:2: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // InternalKlangParser.g:3590:2: ()
            // InternalKlangParser.g:3590:3: 
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
    // InternalKlangParser.g:3598:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3602:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalKlangParser.g:3603:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalKlangParser.g:3610:1: rule__And__Group_1__1__Impl : ( And ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3614:1: ( ( And ) )
            // InternalKlangParser.g:3615:1: ( And )
            {
            // InternalKlangParser.g:3615:1: ( And )
            // InternalKlangParser.g:3616:2: And
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
    // InternalKlangParser.g:3625:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3629:1: ( rule__And__Group_1__2__Impl )
            // InternalKlangParser.g:3630:2: rule__And__Group_1__2__Impl
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
    // InternalKlangParser.g:3636:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3640:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:3641:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:3641:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalKlangParser.g:3642:2: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:3643:2: ( rule__And__RightAssignment_1_2 )
            // InternalKlangParser.g:3643:3: rule__And__RightAssignment_1_2
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
    // InternalKlangParser.g:3652:1: rule__Plus__Group__0 : rule__Plus__Group__0__Impl rule__Plus__Group__1 ;
    public final void rule__Plus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3656:1: ( rule__Plus__Group__0__Impl rule__Plus__Group__1 )
            // InternalKlangParser.g:3657:2: rule__Plus__Group__0__Impl rule__Plus__Group__1
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
    // InternalKlangParser.g:3664:1: rule__Plus__Group__0__Impl : ( ruleMinus ) ;
    public final void rule__Plus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3668:1: ( ( ruleMinus ) )
            // InternalKlangParser.g:3669:1: ( ruleMinus )
            {
            // InternalKlangParser.g:3669:1: ( ruleMinus )
            // InternalKlangParser.g:3670:2: ruleMinus
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
    // InternalKlangParser.g:3679:1: rule__Plus__Group__1 : rule__Plus__Group__1__Impl ;
    public final void rule__Plus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3683:1: ( rule__Plus__Group__1__Impl )
            // InternalKlangParser.g:3684:2: rule__Plus__Group__1__Impl
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
    // InternalKlangParser.g:3690:1: rule__Plus__Group__1__Impl : ( ( rule__Plus__Group_1__0 )* ) ;
    public final void rule__Plus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3694:1: ( ( ( rule__Plus__Group_1__0 )* ) )
            // InternalKlangParser.g:3695:1: ( ( rule__Plus__Group_1__0 )* )
            {
            // InternalKlangParser.g:3695:1: ( ( rule__Plus__Group_1__0 )* )
            // InternalKlangParser.g:3696:2: ( rule__Plus__Group_1__0 )*
            {
             before(grammarAccess.getPlusAccess().getGroup_1()); 
            // InternalKlangParser.g:3697:2: ( rule__Plus__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==PlusSign) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalKlangParser.g:3697:3: rule__Plus__Group_1__0
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
    // InternalKlangParser.g:3706:1: rule__Plus__Group_1__0 : rule__Plus__Group_1__0__Impl rule__Plus__Group_1__1 ;
    public final void rule__Plus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3710:1: ( rule__Plus__Group_1__0__Impl rule__Plus__Group_1__1 )
            // InternalKlangParser.g:3711:2: rule__Plus__Group_1__0__Impl rule__Plus__Group_1__1
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
    // InternalKlangParser.g:3718:1: rule__Plus__Group_1__0__Impl : ( () ) ;
    public final void rule__Plus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3722:1: ( ( () ) )
            // InternalKlangParser.g:3723:1: ( () )
            {
            // InternalKlangParser.g:3723:1: ( () )
            // InternalKlangParser.g:3724:2: ()
            {
             before(grammarAccess.getPlusAccess().getPlusLeftAction_1_0()); 
            // InternalKlangParser.g:3725:2: ()
            // InternalKlangParser.g:3725:3: 
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
    // InternalKlangParser.g:3733:1: rule__Plus__Group_1__1 : rule__Plus__Group_1__1__Impl rule__Plus__Group_1__2 ;
    public final void rule__Plus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3737:1: ( rule__Plus__Group_1__1__Impl rule__Plus__Group_1__2 )
            // InternalKlangParser.g:3738:2: rule__Plus__Group_1__1__Impl rule__Plus__Group_1__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalKlangParser.g:3745:1: rule__Plus__Group_1__1__Impl : ( PlusSign ) ;
    public final void rule__Plus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3749:1: ( ( PlusSign ) )
            // InternalKlangParser.g:3750:1: ( PlusSign )
            {
            // InternalKlangParser.g:3750:1: ( PlusSign )
            // InternalKlangParser.g:3751:2: PlusSign
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
    // InternalKlangParser.g:3760:1: rule__Plus__Group_1__2 : rule__Plus__Group_1__2__Impl ;
    public final void rule__Plus__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3764:1: ( rule__Plus__Group_1__2__Impl )
            // InternalKlangParser.g:3765:2: rule__Plus__Group_1__2__Impl
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
    // InternalKlangParser.g:3771:1: rule__Plus__Group_1__2__Impl : ( ( rule__Plus__RightAssignment_1_2 ) ) ;
    public final void rule__Plus__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3775:1: ( ( ( rule__Plus__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:3776:1: ( ( rule__Plus__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:3776:1: ( ( rule__Plus__RightAssignment_1_2 ) )
            // InternalKlangParser.g:3777:2: ( rule__Plus__RightAssignment_1_2 )
            {
             before(grammarAccess.getPlusAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:3778:2: ( rule__Plus__RightAssignment_1_2 )
            // InternalKlangParser.g:3778:3: rule__Plus__RightAssignment_1_2
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
    // InternalKlangParser.g:3787:1: rule__Minus__Group__0 : rule__Minus__Group__0__Impl rule__Minus__Group__1 ;
    public final void rule__Minus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3791:1: ( rule__Minus__Group__0__Impl rule__Minus__Group__1 )
            // InternalKlangParser.g:3792:2: rule__Minus__Group__0__Impl rule__Minus__Group__1
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
    // InternalKlangParser.g:3799:1: rule__Minus__Group__0__Impl : ( ruleMultiply ) ;
    public final void rule__Minus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3803:1: ( ( ruleMultiply ) )
            // InternalKlangParser.g:3804:1: ( ruleMultiply )
            {
            // InternalKlangParser.g:3804:1: ( ruleMultiply )
            // InternalKlangParser.g:3805:2: ruleMultiply
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
    // InternalKlangParser.g:3814:1: rule__Minus__Group__1 : rule__Minus__Group__1__Impl ;
    public final void rule__Minus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3818:1: ( rule__Minus__Group__1__Impl )
            // InternalKlangParser.g:3819:2: rule__Minus__Group__1__Impl
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
    // InternalKlangParser.g:3825:1: rule__Minus__Group__1__Impl : ( ( rule__Minus__Group_1__0 )* ) ;
    public final void rule__Minus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3829:1: ( ( ( rule__Minus__Group_1__0 )* ) )
            // InternalKlangParser.g:3830:1: ( ( rule__Minus__Group_1__0 )* )
            {
            // InternalKlangParser.g:3830:1: ( ( rule__Minus__Group_1__0 )* )
            // InternalKlangParser.g:3831:2: ( rule__Minus__Group_1__0 )*
            {
             before(grammarAccess.getMinusAccess().getGroup_1()); 
            // InternalKlangParser.g:3832:2: ( rule__Minus__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==HyphenMinus) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalKlangParser.g:3832:3: rule__Minus__Group_1__0
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
    // InternalKlangParser.g:3841:1: rule__Minus__Group_1__0 : rule__Minus__Group_1__0__Impl rule__Minus__Group_1__1 ;
    public final void rule__Minus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3845:1: ( rule__Minus__Group_1__0__Impl rule__Minus__Group_1__1 )
            // InternalKlangParser.g:3846:2: rule__Minus__Group_1__0__Impl rule__Minus__Group_1__1
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
    // InternalKlangParser.g:3853:1: rule__Minus__Group_1__0__Impl : ( () ) ;
    public final void rule__Minus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3857:1: ( ( () ) )
            // InternalKlangParser.g:3858:1: ( () )
            {
            // InternalKlangParser.g:3858:1: ( () )
            // InternalKlangParser.g:3859:2: ()
            {
             before(grammarAccess.getMinusAccess().getMinusLeftAction_1_0()); 
            // InternalKlangParser.g:3860:2: ()
            // InternalKlangParser.g:3860:3: 
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
    // InternalKlangParser.g:3868:1: rule__Minus__Group_1__1 : rule__Minus__Group_1__1__Impl rule__Minus__Group_1__2 ;
    public final void rule__Minus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3872:1: ( rule__Minus__Group_1__1__Impl rule__Minus__Group_1__2 )
            // InternalKlangParser.g:3873:2: rule__Minus__Group_1__1__Impl rule__Minus__Group_1__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalKlangParser.g:3880:1: rule__Minus__Group_1__1__Impl : ( HyphenMinus ) ;
    public final void rule__Minus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3884:1: ( ( HyphenMinus ) )
            // InternalKlangParser.g:3885:1: ( HyphenMinus )
            {
            // InternalKlangParser.g:3885:1: ( HyphenMinus )
            // InternalKlangParser.g:3886:2: HyphenMinus
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
    // InternalKlangParser.g:3895:1: rule__Minus__Group_1__2 : rule__Minus__Group_1__2__Impl ;
    public final void rule__Minus__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3899:1: ( rule__Minus__Group_1__2__Impl )
            // InternalKlangParser.g:3900:2: rule__Minus__Group_1__2__Impl
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
    // InternalKlangParser.g:3906:1: rule__Minus__Group_1__2__Impl : ( ( rule__Minus__RightAssignment_1_2 ) ) ;
    public final void rule__Minus__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3910:1: ( ( ( rule__Minus__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:3911:1: ( ( rule__Minus__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:3911:1: ( ( rule__Minus__RightAssignment_1_2 ) )
            // InternalKlangParser.g:3912:2: ( rule__Minus__RightAssignment_1_2 )
            {
             before(grammarAccess.getMinusAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:3913:2: ( rule__Minus__RightAssignment_1_2 )
            // InternalKlangParser.g:3913:3: rule__Minus__RightAssignment_1_2
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
    // InternalKlangParser.g:3922:1: rule__Multiply__Group__0 : rule__Multiply__Group__0__Impl rule__Multiply__Group__1 ;
    public final void rule__Multiply__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3926:1: ( rule__Multiply__Group__0__Impl rule__Multiply__Group__1 )
            // InternalKlangParser.g:3927:2: rule__Multiply__Group__0__Impl rule__Multiply__Group__1
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
    // InternalKlangParser.g:3934:1: rule__Multiply__Group__0__Impl : ( ruleDivide ) ;
    public final void rule__Multiply__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3938:1: ( ( ruleDivide ) )
            // InternalKlangParser.g:3939:1: ( ruleDivide )
            {
            // InternalKlangParser.g:3939:1: ( ruleDivide )
            // InternalKlangParser.g:3940:2: ruleDivide
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
    // InternalKlangParser.g:3949:1: rule__Multiply__Group__1 : rule__Multiply__Group__1__Impl ;
    public final void rule__Multiply__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3953:1: ( rule__Multiply__Group__1__Impl )
            // InternalKlangParser.g:3954:2: rule__Multiply__Group__1__Impl
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
    // InternalKlangParser.g:3960:1: rule__Multiply__Group__1__Impl : ( ( rule__Multiply__Group_1__0 )* ) ;
    public final void rule__Multiply__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3964:1: ( ( ( rule__Multiply__Group_1__0 )* ) )
            // InternalKlangParser.g:3965:1: ( ( rule__Multiply__Group_1__0 )* )
            {
            // InternalKlangParser.g:3965:1: ( ( rule__Multiply__Group_1__0 )* )
            // InternalKlangParser.g:3966:2: ( rule__Multiply__Group_1__0 )*
            {
             before(grammarAccess.getMultiplyAccess().getGroup_1()); 
            // InternalKlangParser.g:3967:2: ( rule__Multiply__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==Asterisk) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalKlangParser.g:3967:3: rule__Multiply__Group_1__0
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
    // InternalKlangParser.g:3976:1: rule__Multiply__Group_1__0 : rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1 ;
    public final void rule__Multiply__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3980:1: ( rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1 )
            // InternalKlangParser.g:3981:2: rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1
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
    // InternalKlangParser.g:3988:1: rule__Multiply__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiply__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3992:1: ( ( () ) )
            // InternalKlangParser.g:3993:1: ( () )
            {
            // InternalKlangParser.g:3993:1: ( () )
            // InternalKlangParser.g:3994:2: ()
            {
             before(grammarAccess.getMultiplyAccess().getMultiplyLeftAction_1_0()); 
            // InternalKlangParser.g:3995:2: ()
            // InternalKlangParser.g:3995:3: 
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
    // InternalKlangParser.g:4003:1: rule__Multiply__Group_1__1 : rule__Multiply__Group_1__1__Impl rule__Multiply__Group_1__2 ;
    public final void rule__Multiply__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4007:1: ( rule__Multiply__Group_1__1__Impl rule__Multiply__Group_1__2 )
            // InternalKlangParser.g:4008:2: rule__Multiply__Group_1__1__Impl rule__Multiply__Group_1__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalKlangParser.g:4015:1: rule__Multiply__Group_1__1__Impl : ( Asterisk ) ;
    public final void rule__Multiply__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4019:1: ( ( Asterisk ) )
            // InternalKlangParser.g:4020:1: ( Asterisk )
            {
            // InternalKlangParser.g:4020:1: ( Asterisk )
            // InternalKlangParser.g:4021:2: Asterisk
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
    // InternalKlangParser.g:4030:1: rule__Multiply__Group_1__2 : rule__Multiply__Group_1__2__Impl ;
    public final void rule__Multiply__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4034:1: ( rule__Multiply__Group_1__2__Impl )
            // InternalKlangParser.g:4035:2: rule__Multiply__Group_1__2__Impl
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
    // InternalKlangParser.g:4041:1: rule__Multiply__Group_1__2__Impl : ( ( rule__Multiply__RightAssignment_1_2 ) ) ;
    public final void rule__Multiply__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4045:1: ( ( ( rule__Multiply__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:4046:1: ( ( rule__Multiply__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:4046:1: ( ( rule__Multiply__RightAssignment_1_2 ) )
            // InternalKlangParser.g:4047:2: ( rule__Multiply__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplyAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:4048:2: ( rule__Multiply__RightAssignment_1_2 )
            // InternalKlangParser.g:4048:3: rule__Multiply__RightAssignment_1_2
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
    // InternalKlangParser.g:4057:1: rule__Divide__Group__0 : rule__Divide__Group__0__Impl rule__Divide__Group__1 ;
    public final void rule__Divide__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4061:1: ( rule__Divide__Group__0__Impl rule__Divide__Group__1 )
            // InternalKlangParser.g:4062:2: rule__Divide__Group__0__Impl rule__Divide__Group__1
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
    // InternalKlangParser.g:4069:1: rule__Divide__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__Divide__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4073:1: ( ( rulePrimaryExpression ) )
            // InternalKlangParser.g:4074:1: ( rulePrimaryExpression )
            {
            // InternalKlangParser.g:4074:1: ( rulePrimaryExpression )
            // InternalKlangParser.g:4075:2: rulePrimaryExpression
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
    // InternalKlangParser.g:4084:1: rule__Divide__Group__1 : rule__Divide__Group__1__Impl ;
    public final void rule__Divide__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4088:1: ( rule__Divide__Group__1__Impl )
            // InternalKlangParser.g:4089:2: rule__Divide__Group__1__Impl
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
    // InternalKlangParser.g:4095:1: rule__Divide__Group__1__Impl : ( ( rule__Divide__Group_1__0 )* ) ;
    public final void rule__Divide__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4099:1: ( ( ( rule__Divide__Group_1__0 )* ) )
            // InternalKlangParser.g:4100:1: ( ( rule__Divide__Group_1__0 )* )
            {
            // InternalKlangParser.g:4100:1: ( ( rule__Divide__Group_1__0 )* )
            // InternalKlangParser.g:4101:2: ( rule__Divide__Group_1__0 )*
            {
             before(grammarAccess.getDivideAccess().getGroup_1()); 
            // InternalKlangParser.g:4102:2: ( rule__Divide__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==Solidus) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalKlangParser.g:4102:3: rule__Divide__Group_1__0
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
    // InternalKlangParser.g:4111:1: rule__Divide__Group_1__0 : rule__Divide__Group_1__0__Impl rule__Divide__Group_1__1 ;
    public final void rule__Divide__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4115:1: ( rule__Divide__Group_1__0__Impl rule__Divide__Group_1__1 )
            // InternalKlangParser.g:4116:2: rule__Divide__Group_1__0__Impl rule__Divide__Group_1__1
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
    // InternalKlangParser.g:4123:1: rule__Divide__Group_1__0__Impl : ( () ) ;
    public final void rule__Divide__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4127:1: ( ( () ) )
            // InternalKlangParser.g:4128:1: ( () )
            {
            // InternalKlangParser.g:4128:1: ( () )
            // InternalKlangParser.g:4129:2: ()
            {
             before(grammarAccess.getDivideAccess().getDivideLeftAction_1_0()); 
            // InternalKlangParser.g:4130:2: ()
            // InternalKlangParser.g:4130:3: 
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
    // InternalKlangParser.g:4138:1: rule__Divide__Group_1__1 : rule__Divide__Group_1__1__Impl rule__Divide__Group_1__2 ;
    public final void rule__Divide__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4142:1: ( rule__Divide__Group_1__1__Impl rule__Divide__Group_1__2 )
            // InternalKlangParser.g:4143:2: rule__Divide__Group_1__1__Impl rule__Divide__Group_1__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalKlangParser.g:4150:1: rule__Divide__Group_1__1__Impl : ( Solidus ) ;
    public final void rule__Divide__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4154:1: ( ( Solidus ) )
            // InternalKlangParser.g:4155:1: ( Solidus )
            {
            // InternalKlangParser.g:4155:1: ( Solidus )
            // InternalKlangParser.g:4156:2: Solidus
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
    // InternalKlangParser.g:4165:1: rule__Divide__Group_1__2 : rule__Divide__Group_1__2__Impl ;
    public final void rule__Divide__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4169:1: ( rule__Divide__Group_1__2__Impl )
            // InternalKlangParser.g:4170:2: rule__Divide__Group_1__2__Impl
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
    // InternalKlangParser.g:4176:1: rule__Divide__Group_1__2__Impl : ( ( rule__Divide__RightAssignment_1_2 ) ) ;
    public final void rule__Divide__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4180:1: ( ( ( rule__Divide__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:4181:1: ( ( rule__Divide__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:4181:1: ( ( rule__Divide__RightAssignment_1_2 ) )
            // InternalKlangParser.g:4182:2: ( rule__Divide__RightAssignment_1_2 )
            {
             before(grammarAccess.getDivideAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:4183:2: ( rule__Divide__RightAssignment_1_2 )
            // InternalKlangParser.g:4183:3: rule__Divide__RightAssignment_1_2
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
    // InternalKlangParser.g:4192:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4196:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalKlangParser.g:4197:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
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
    // InternalKlangParser.g:4204:1: rule__Comparison__Group__0__Impl : ( rulePlus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4208:1: ( ( rulePlus ) )
            // InternalKlangParser.g:4209:1: ( rulePlus )
            {
            // InternalKlangParser.g:4209:1: ( rulePlus )
            // InternalKlangParser.g:4210:2: rulePlus
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
    // InternalKlangParser.g:4219:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4223:1: ( rule__Comparison__Group__1__Impl )
            // InternalKlangParser.g:4224:2: rule__Comparison__Group__1__Impl
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
    // InternalKlangParser.g:4230:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4234:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalKlangParser.g:4235:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalKlangParser.g:4235:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalKlangParser.g:4236:2: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // InternalKlangParser.g:4237:2: ( rule__Comparison__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=LessThanSignEqualsSign && LA27_0<=GreaterThanSignEqualsSign)||LA27_0==LessThanSign||LA27_0==GreaterThanSign) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalKlangParser.g:4237:3: rule__Comparison__Group_1__0
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
    // InternalKlangParser.g:4246:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4250:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalKlangParser.g:4251:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalKlangParser.g:4258:1: rule__Comparison__Group_1__0__Impl : ( ( rule__Comparison__Alternatives_1_0 ) ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4262:1: ( ( ( rule__Comparison__Alternatives_1_0 ) ) )
            // InternalKlangParser.g:4263:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            {
            // InternalKlangParser.g:4263:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            // InternalKlangParser.g:4264:2: ( rule__Comparison__Alternatives_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getAlternatives_1_0()); 
            // InternalKlangParser.g:4265:2: ( rule__Comparison__Alternatives_1_0 )
            // InternalKlangParser.g:4265:3: rule__Comparison__Alternatives_1_0
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
    // InternalKlangParser.g:4273:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4277:1: ( rule__Comparison__Group_1__1__Impl )
            // InternalKlangParser.g:4278:2: rule__Comparison__Group_1__1__Impl
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
    // InternalKlangParser.g:4284:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__RightAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4288:1: ( ( ( rule__Comparison__RightAssignment_1_1 ) ) )
            // InternalKlangParser.g:4289:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            {
            // InternalKlangParser.g:4289:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            // InternalKlangParser.g:4290:2: ( rule__Comparison__RightAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_1()); 
            // InternalKlangParser.g:4291:2: ( rule__Comparison__RightAssignment_1_1 )
            // InternalKlangParser.g:4291:3: rule__Comparison__RightAssignment_1_1
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
    // InternalKlangParser.g:4300:1: rule__Comparison__Group_1_0_0__0 : rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 ;
    public final void rule__Comparison__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4304:1: ( rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 )
            // InternalKlangParser.g:4305:2: rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1
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
    // InternalKlangParser.g:4312:1: rule__Comparison__Group_1_0_0__0__Impl : ( LessThanSign ) ;
    public final void rule__Comparison__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4316:1: ( ( LessThanSign ) )
            // InternalKlangParser.g:4317:1: ( LessThanSign )
            {
            // InternalKlangParser.g:4317:1: ( LessThanSign )
            // InternalKlangParser.g:4318:2: LessThanSign
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
    // InternalKlangParser.g:4327:1: rule__Comparison__Group_1_0_0__1 : rule__Comparison__Group_1_0_0__1__Impl ;
    public final void rule__Comparison__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4331:1: ( rule__Comparison__Group_1_0_0__1__Impl )
            // InternalKlangParser.g:4332:2: rule__Comparison__Group_1_0_0__1__Impl
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
    // InternalKlangParser.g:4338:1: rule__Comparison__Group_1_0_0__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4342:1: ( ( () ) )
            // InternalKlangParser.g:4343:1: ( () )
            {
            // InternalKlangParser.g:4343:1: ( () )
            // InternalKlangParser.g:4344:2: ()
            {
             before(grammarAccess.getComparisonAccess().getLessThanLeftAction_1_0_0_1()); 
            // InternalKlangParser.g:4345:2: ()
            // InternalKlangParser.g:4345:3: 
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
    // InternalKlangParser.g:4354:1: rule__Comparison__Group_1_0_1__0 : rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 ;
    public final void rule__Comparison__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4358:1: ( rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 )
            // InternalKlangParser.g:4359:2: rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1
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
    // InternalKlangParser.g:4366:1: rule__Comparison__Group_1_0_1__0__Impl : ( EqualsSignEqualsSign ) ;
    public final void rule__Comparison__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4370:1: ( ( EqualsSignEqualsSign ) )
            // InternalKlangParser.g:4371:1: ( EqualsSignEqualsSign )
            {
            // InternalKlangParser.g:4371:1: ( EqualsSignEqualsSign )
            // InternalKlangParser.g:4372:2: EqualsSignEqualsSign
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
    // InternalKlangParser.g:4381:1: rule__Comparison__Group_1_0_1__1 : rule__Comparison__Group_1_0_1__1__Impl ;
    public final void rule__Comparison__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4385:1: ( rule__Comparison__Group_1_0_1__1__Impl )
            // InternalKlangParser.g:4386:2: rule__Comparison__Group_1_0_1__1__Impl
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
    // InternalKlangParser.g:4392:1: rule__Comparison__Group_1_0_1__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4396:1: ( ( () ) )
            // InternalKlangParser.g:4397:1: ( () )
            {
            // InternalKlangParser.g:4397:1: ( () )
            // InternalKlangParser.g:4398:2: ()
            {
             before(grammarAccess.getComparisonAccess().getEqualLeftAction_1_0_1_1()); 
            // InternalKlangParser.g:4399:2: ()
            // InternalKlangParser.g:4399:3: 
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
    // InternalKlangParser.g:4408:1: rule__Comparison__Group_1_0_2__0 : rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1 ;
    public final void rule__Comparison__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4412:1: ( rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1 )
            // InternalKlangParser.g:4413:2: rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1
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
    // InternalKlangParser.g:4420:1: rule__Comparison__Group_1_0_2__0__Impl : ( GreaterThanSign ) ;
    public final void rule__Comparison__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4424:1: ( ( GreaterThanSign ) )
            // InternalKlangParser.g:4425:1: ( GreaterThanSign )
            {
            // InternalKlangParser.g:4425:1: ( GreaterThanSign )
            // InternalKlangParser.g:4426:2: GreaterThanSign
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
    // InternalKlangParser.g:4435:1: rule__Comparison__Group_1_0_2__1 : rule__Comparison__Group_1_0_2__1__Impl ;
    public final void rule__Comparison__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4439:1: ( rule__Comparison__Group_1_0_2__1__Impl )
            // InternalKlangParser.g:4440:2: rule__Comparison__Group_1_0_2__1__Impl
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
    // InternalKlangParser.g:4446:1: rule__Comparison__Group_1_0_2__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4450:1: ( ( () ) )
            // InternalKlangParser.g:4451:1: ( () )
            {
            // InternalKlangParser.g:4451:1: ( () )
            // InternalKlangParser.g:4452:2: ()
            {
             before(grammarAccess.getComparisonAccess().getGreaterThanLeftAction_1_0_2_1()); 
            // InternalKlangParser.g:4453:2: ()
            // InternalKlangParser.g:4453:3: 
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


    // $ANTLR start "rule__Comparison__Group_1_0_3__0"
    // InternalKlangParser.g:4462:1: rule__Comparison__Group_1_0_3__0 : rule__Comparison__Group_1_0_3__0__Impl rule__Comparison__Group_1_0_3__1 ;
    public final void rule__Comparison__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4466:1: ( rule__Comparison__Group_1_0_3__0__Impl rule__Comparison__Group_1_0_3__1 )
            // InternalKlangParser.g:4467:2: rule__Comparison__Group_1_0_3__0__Impl rule__Comparison__Group_1_0_3__1
            {
            pushFollow(FOLLOW_1);
            rule__Comparison__Group_1_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_3__0"


    // $ANTLR start "rule__Comparison__Group_1_0_3__0__Impl"
    // InternalKlangParser.g:4474:1: rule__Comparison__Group_1_0_3__0__Impl : ( LessThanSignEqualsSign ) ;
    public final void rule__Comparison__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4478:1: ( ( LessThanSignEqualsSign ) )
            // InternalKlangParser.g:4479:1: ( LessThanSignEqualsSign )
            {
            // InternalKlangParser.g:4479:1: ( LessThanSignEqualsSign )
            // InternalKlangParser.g:4480:2: LessThanSignEqualsSign
            {
             before(grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_3_0()); 
            match(input,LessThanSignEqualsSign,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_3__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_3__1"
    // InternalKlangParser.g:4489:1: rule__Comparison__Group_1_0_3__1 : rule__Comparison__Group_1_0_3__1__Impl ;
    public final void rule__Comparison__Group_1_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4493:1: ( rule__Comparison__Group_1_0_3__1__Impl )
            // InternalKlangParser.g:4494:2: rule__Comparison__Group_1_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_3__1"


    // $ANTLR start "rule__Comparison__Group_1_0_3__1__Impl"
    // InternalKlangParser.g:4500:1: rule__Comparison__Group_1_0_3__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4504:1: ( ( () ) )
            // InternalKlangParser.g:4505:1: ( () )
            {
            // InternalKlangParser.g:4505:1: ( () )
            // InternalKlangParser.g:4506:2: ()
            {
             before(grammarAccess.getComparisonAccess().getLessThanOrEqualLeftAction_1_0_3_1()); 
            // InternalKlangParser.g:4507:2: ()
            // InternalKlangParser.g:4507:3: 
            {
            }

             after(grammarAccess.getComparisonAccess().getLessThanOrEqualLeftAction_1_0_3_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_3__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_4__0"
    // InternalKlangParser.g:4516:1: rule__Comparison__Group_1_0_4__0 : rule__Comparison__Group_1_0_4__0__Impl rule__Comparison__Group_1_0_4__1 ;
    public final void rule__Comparison__Group_1_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4520:1: ( rule__Comparison__Group_1_0_4__0__Impl rule__Comparison__Group_1_0_4__1 )
            // InternalKlangParser.g:4521:2: rule__Comparison__Group_1_0_4__0__Impl rule__Comparison__Group_1_0_4__1
            {
            pushFollow(FOLLOW_1);
            rule__Comparison__Group_1_0_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_4__0"


    // $ANTLR start "rule__Comparison__Group_1_0_4__0__Impl"
    // InternalKlangParser.g:4528:1: rule__Comparison__Group_1_0_4__0__Impl : ( GreaterThanSignEqualsSign ) ;
    public final void rule__Comparison__Group_1_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4532:1: ( ( GreaterThanSignEqualsSign ) )
            // InternalKlangParser.g:4533:1: ( GreaterThanSignEqualsSign )
            {
            // InternalKlangParser.g:4533:1: ( GreaterThanSignEqualsSign )
            // InternalKlangParser.g:4534:2: GreaterThanSignEqualsSign
            {
             before(grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_0_4_0()); 
            match(input,GreaterThanSignEqualsSign,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_4__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_4__1"
    // InternalKlangParser.g:4543:1: rule__Comparison__Group_1_0_4__1 : rule__Comparison__Group_1_0_4__1__Impl ;
    public final void rule__Comparison__Group_1_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4547:1: ( rule__Comparison__Group_1_0_4__1__Impl )
            // InternalKlangParser.g:4548:2: rule__Comparison__Group_1_0_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_4__1"


    // $ANTLR start "rule__Comparison__Group_1_0_4__1__Impl"
    // InternalKlangParser.g:4554:1: rule__Comparison__Group_1_0_4__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4558:1: ( ( () ) )
            // InternalKlangParser.g:4559:1: ( () )
            {
            // InternalKlangParser.g:4559:1: ( () )
            // InternalKlangParser.g:4560:2: ()
            {
             before(grammarAccess.getComparisonAccess().getGreaterThanOrEqualLeftAction_1_0_4_1()); 
            // InternalKlangParser.g:4561:2: ()
            // InternalKlangParser.g:4561:3: 
            {
            }

             after(grammarAccess.getComparisonAccess().getGreaterThanOrEqualLeftAction_1_0_4_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_4__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group__0"
    // InternalKlangParser.g:4570:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4574:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // InternalKlangParser.g:4575:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalKlangParser.g:4582:1: rule__FunctionCall__Group__0__Impl : ( ( rule__FunctionCall__NameAssignment_0 ) ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4586:1: ( ( ( rule__FunctionCall__NameAssignment_0 ) ) )
            // InternalKlangParser.g:4587:1: ( ( rule__FunctionCall__NameAssignment_0 ) )
            {
            // InternalKlangParser.g:4587:1: ( ( rule__FunctionCall__NameAssignment_0 ) )
            // InternalKlangParser.g:4588:2: ( rule__FunctionCall__NameAssignment_0 )
            {
             before(grammarAccess.getFunctionCallAccess().getNameAssignment_0()); 
            // InternalKlangParser.g:4589:2: ( rule__FunctionCall__NameAssignment_0 )
            // InternalKlangParser.g:4589:3: rule__FunctionCall__NameAssignment_0
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
    // InternalKlangParser.g:4597:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4601:1: ( rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 )
            // InternalKlangParser.g:4602:2: rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2
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
    // InternalKlangParser.g:4609:1: rule__FunctionCall__Group__1__Impl : ( LeftParenthesis ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4613:1: ( ( LeftParenthesis ) )
            // InternalKlangParser.g:4614:1: ( LeftParenthesis )
            {
            // InternalKlangParser.g:4614:1: ( LeftParenthesis )
            // InternalKlangParser.g:4615:2: LeftParenthesis
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
    // InternalKlangParser.g:4624:1: rule__FunctionCall__Group__2 : rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 ;
    public final void rule__FunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4628:1: ( rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 )
            // InternalKlangParser.g:4629:2: rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3
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
    // InternalKlangParser.g:4636:1: rule__FunctionCall__Group__2__Impl : ( ( rule__FunctionCall__Group_2__0 )? ) ;
    public final void rule__FunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4640:1: ( ( ( rule__FunctionCall__Group_2__0 )? ) )
            // InternalKlangParser.g:4641:1: ( ( rule__FunctionCall__Group_2__0 )? )
            {
            // InternalKlangParser.g:4641:1: ( ( rule__FunctionCall__Group_2__0 )? )
            // InternalKlangParser.g:4642:2: ( rule__FunctionCall__Group_2__0 )?
            {
             before(grammarAccess.getFunctionCallAccess().getGroup_2()); 
            // InternalKlangParser.g:4643:2: ( rule__FunctionCall__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Double||LA28_0==False||LA28_0==True||(LA28_0>=Int && LA28_0<=Not)||LA28_0==LeftParenthesis||LA28_0==HyphenMinus||(LA28_0>=RULE_ID && LA28_0<=RULE_STRING)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalKlangParser.g:4643:3: rule__FunctionCall__Group_2__0
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
    // InternalKlangParser.g:4651:1: rule__FunctionCall__Group__3 : rule__FunctionCall__Group__3__Impl ;
    public final void rule__FunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4655:1: ( rule__FunctionCall__Group__3__Impl )
            // InternalKlangParser.g:4656:2: rule__FunctionCall__Group__3__Impl
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
    // InternalKlangParser.g:4662:1: rule__FunctionCall__Group__3__Impl : ( RightParenthesis ) ;
    public final void rule__FunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4666:1: ( ( RightParenthesis ) )
            // InternalKlangParser.g:4667:1: ( RightParenthesis )
            {
            // InternalKlangParser.g:4667:1: ( RightParenthesis )
            // InternalKlangParser.g:4668:2: RightParenthesis
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
    // InternalKlangParser.g:4678:1: rule__FunctionCall__Group_2__0 : rule__FunctionCall__Group_2__0__Impl rule__FunctionCall__Group_2__1 ;
    public final void rule__FunctionCall__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4682:1: ( rule__FunctionCall__Group_2__0__Impl rule__FunctionCall__Group_2__1 )
            // InternalKlangParser.g:4683:2: rule__FunctionCall__Group_2__0__Impl rule__FunctionCall__Group_2__1
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
    // InternalKlangParser.g:4690:1: rule__FunctionCall__Group_2__0__Impl : ( ( rule__FunctionCall__ParametersAssignment_2_0 ) ) ;
    public final void rule__FunctionCall__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4694:1: ( ( ( rule__FunctionCall__ParametersAssignment_2_0 ) ) )
            // InternalKlangParser.g:4695:1: ( ( rule__FunctionCall__ParametersAssignment_2_0 ) )
            {
            // InternalKlangParser.g:4695:1: ( ( rule__FunctionCall__ParametersAssignment_2_0 ) )
            // InternalKlangParser.g:4696:2: ( rule__FunctionCall__ParametersAssignment_2_0 )
            {
             before(grammarAccess.getFunctionCallAccess().getParametersAssignment_2_0()); 
            // InternalKlangParser.g:4697:2: ( rule__FunctionCall__ParametersAssignment_2_0 )
            // InternalKlangParser.g:4697:3: rule__FunctionCall__ParametersAssignment_2_0
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
    // InternalKlangParser.g:4705:1: rule__FunctionCall__Group_2__1 : rule__FunctionCall__Group_2__1__Impl ;
    public final void rule__FunctionCall__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4709:1: ( rule__FunctionCall__Group_2__1__Impl )
            // InternalKlangParser.g:4710:2: rule__FunctionCall__Group_2__1__Impl
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
    // InternalKlangParser.g:4716:1: rule__FunctionCall__Group_2__1__Impl : ( ( rule__FunctionCall__Group_2_1__0 )* ) ;
    public final void rule__FunctionCall__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4720:1: ( ( ( rule__FunctionCall__Group_2_1__0 )* ) )
            // InternalKlangParser.g:4721:1: ( ( rule__FunctionCall__Group_2_1__0 )* )
            {
            // InternalKlangParser.g:4721:1: ( ( rule__FunctionCall__Group_2_1__0 )* )
            // InternalKlangParser.g:4722:2: ( rule__FunctionCall__Group_2_1__0 )*
            {
             before(grammarAccess.getFunctionCallAccess().getGroup_2_1()); 
            // InternalKlangParser.g:4723:2: ( rule__FunctionCall__Group_2_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==Comma) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalKlangParser.g:4723:3: rule__FunctionCall__Group_2_1__0
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
    // InternalKlangParser.g:4732:1: rule__FunctionCall__Group_2_1__0 : rule__FunctionCall__Group_2_1__0__Impl rule__FunctionCall__Group_2_1__1 ;
    public final void rule__FunctionCall__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4736:1: ( rule__FunctionCall__Group_2_1__0__Impl rule__FunctionCall__Group_2_1__1 )
            // InternalKlangParser.g:4737:2: rule__FunctionCall__Group_2_1__0__Impl rule__FunctionCall__Group_2_1__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalKlangParser.g:4744:1: rule__FunctionCall__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__FunctionCall__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4748:1: ( ( Comma ) )
            // InternalKlangParser.g:4749:1: ( Comma )
            {
            // InternalKlangParser.g:4749:1: ( Comma )
            // InternalKlangParser.g:4750:2: Comma
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
    // InternalKlangParser.g:4759:1: rule__FunctionCall__Group_2_1__1 : rule__FunctionCall__Group_2_1__1__Impl ;
    public final void rule__FunctionCall__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4763:1: ( rule__FunctionCall__Group_2_1__1__Impl )
            // InternalKlangParser.g:4764:2: rule__FunctionCall__Group_2_1__1__Impl
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
    // InternalKlangParser.g:4770:1: rule__FunctionCall__Group_2_1__1__Impl : ( ( rule__FunctionCall__ParametersAssignment_2_1_1 ) ) ;
    public final void rule__FunctionCall__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4774:1: ( ( ( rule__FunctionCall__ParametersAssignment_2_1_1 ) ) )
            // InternalKlangParser.g:4775:1: ( ( rule__FunctionCall__ParametersAssignment_2_1_1 ) )
            {
            // InternalKlangParser.g:4775:1: ( ( rule__FunctionCall__ParametersAssignment_2_1_1 ) )
            // InternalKlangParser.g:4776:2: ( rule__FunctionCall__ParametersAssignment_2_1_1 )
            {
             before(grammarAccess.getFunctionCallAccess().getParametersAssignment_2_1_1()); 
            // InternalKlangParser.g:4777:2: ( rule__FunctionCall__ParametersAssignment_2_1_1 )
            // InternalKlangParser.g:4777:3: rule__FunctionCall__ParametersAssignment_2_1_1
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
    // InternalKlangParser.g:4786:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4790:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // InternalKlangParser.g:4791:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalKlangParser.g:4798:1: rule__PrimaryExpression__Group_0__0__Impl : ( LeftParenthesis ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4802:1: ( ( LeftParenthesis ) )
            // InternalKlangParser.g:4803:1: ( LeftParenthesis )
            {
            // InternalKlangParser.g:4803:1: ( LeftParenthesis )
            // InternalKlangParser.g:4804:2: LeftParenthesis
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
    // InternalKlangParser.g:4813:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4817:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // InternalKlangParser.g:4818:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalKlangParser.g:4825:1: rule__PrimaryExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4829:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:4830:1: ( ruleExpression )
            {
            // InternalKlangParser.g:4830:1: ( ruleExpression )
            // InternalKlangParser.g:4831:2: ruleExpression
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
    // InternalKlangParser.g:4840:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4844:1: ( rule__PrimaryExpression__Group_0__2__Impl )
            // InternalKlangParser.g:4845:2: rule__PrimaryExpression__Group_0__2__Impl
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
    // InternalKlangParser.g:4851:1: rule__PrimaryExpression__Group_0__2__Impl : ( RightParenthesis ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4855:1: ( ( RightParenthesis ) )
            // InternalKlangParser.g:4856:1: ( RightParenthesis )
            {
            // InternalKlangParser.g:4856:1: ( RightParenthesis )
            // InternalKlangParser.g:4857:2: RightParenthesis
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
    // InternalKlangParser.g:4867:1: rule__PrimaryExpression__Group_1__0 : rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 ;
    public final void rule__PrimaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4871:1: ( rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 )
            // InternalKlangParser.g:4872:2: rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1
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
    // InternalKlangParser.g:4879:1: rule__PrimaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4883:1: ( ( () ) )
            // InternalKlangParser.g:4884:1: ( () )
            {
            // InternalKlangParser.g:4884:1: ( () )
            // InternalKlangParser.g:4885:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNotAction_1_0()); 
            // InternalKlangParser.g:4886:2: ()
            // InternalKlangParser.g:4886:3: 
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
    // InternalKlangParser.g:4894:1: rule__PrimaryExpression__Group_1__1 : rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2 ;
    public final void rule__PrimaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4898:1: ( rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2 )
            // InternalKlangParser.g:4899:2: rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalKlangParser.g:4906:1: rule__PrimaryExpression__Group_1__1__Impl : ( Not ) ;
    public final void rule__PrimaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4910:1: ( ( Not ) )
            // InternalKlangParser.g:4911:1: ( Not )
            {
            // InternalKlangParser.g:4911:1: ( Not )
            // InternalKlangParser.g:4912:2: Not
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
    // InternalKlangParser.g:4921:1: rule__PrimaryExpression__Group_1__2 : rule__PrimaryExpression__Group_1__2__Impl ;
    public final void rule__PrimaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4925:1: ( rule__PrimaryExpression__Group_1__2__Impl )
            // InternalKlangParser.g:4926:2: rule__PrimaryExpression__Group_1__2__Impl
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
    // InternalKlangParser.g:4932:1: rule__PrimaryExpression__Group_1__2__Impl : ( ( rule__PrimaryExpression__ExpressionAssignment_1_2 ) ) ;
    public final void rule__PrimaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4936:1: ( ( ( rule__PrimaryExpression__ExpressionAssignment_1_2 ) ) )
            // InternalKlangParser.g:4937:1: ( ( rule__PrimaryExpression__ExpressionAssignment_1_2 ) )
            {
            // InternalKlangParser.g:4937:1: ( ( rule__PrimaryExpression__ExpressionAssignment_1_2 ) )
            // InternalKlangParser.g:4938:2: ( rule__PrimaryExpression__ExpressionAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionAssignment_1_2()); 
            // InternalKlangParser.g:4939:2: ( rule__PrimaryExpression__ExpressionAssignment_1_2 )
            // InternalKlangParser.g:4939:3: rule__PrimaryExpression__ExpressionAssignment_1_2
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
    // InternalKlangParser.g:4948:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4952:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // InternalKlangParser.g:4953:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalKlangParser.g:4960:1: rule__PrimaryExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4964:1: ( ( () ) )
            // InternalKlangParser.g:4965:1: ( () )
            {
            // InternalKlangParser.g:4965:1: ( () )
            // InternalKlangParser.g:4966:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getUnaryMinusAction_2_0()); 
            // InternalKlangParser.g:4967:2: ()
            // InternalKlangParser.g:4967:3: 
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
    // InternalKlangParser.g:4975:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4979:1: ( rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 )
            // InternalKlangParser.g:4980:2: rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalKlangParser.g:4987:1: rule__PrimaryExpression__Group_2__1__Impl : ( HyphenMinus ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4991:1: ( ( HyphenMinus ) )
            // InternalKlangParser.g:4992:1: ( HyphenMinus )
            {
            // InternalKlangParser.g:4992:1: ( HyphenMinus )
            // InternalKlangParser.g:4993:2: HyphenMinus
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
    // InternalKlangParser.g:5002:1: rule__PrimaryExpression__Group_2__2 : rule__PrimaryExpression__Group_2__2__Impl ;
    public final void rule__PrimaryExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5006:1: ( rule__PrimaryExpression__Group_2__2__Impl )
            // InternalKlangParser.g:5007:2: rule__PrimaryExpression__Group_2__2__Impl
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
    // InternalKlangParser.g:5013:1: rule__PrimaryExpression__Group_2__2__Impl : ( ( rule__PrimaryExpression__ExpressionAssignment_2_2 ) ) ;
    public final void rule__PrimaryExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5017:1: ( ( ( rule__PrimaryExpression__ExpressionAssignment_2_2 ) ) )
            // InternalKlangParser.g:5018:1: ( ( rule__PrimaryExpression__ExpressionAssignment_2_2 ) )
            {
            // InternalKlangParser.g:5018:1: ( ( rule__PrimaryExpression__ExpressionAssignment_2_2 ) )
            // InternalKlangParser.g:5019:2: ( rule__PrimaryExpression__ExpressionAssignment_2_2 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionAssignment_2_2()); 
            // InternalKlangParser.g:5020:2: ( rule__PrimaryExpression__ExpressionAssignment_2_2 )
            // InternalKlangParser.g:5020:3: rule__PrimaryExpression__ExpressionAssignment_2_2
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
    // InternalKlangParser.g:5029:1: rule__PrimaryExpression__Group_3__0 : rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 ;
    public final void rule__PrimaryExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5033:1: ( rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 )
            // InternalKlangParser.g:5034:2: rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalKlangParser.g:5041:1: rule__PrimaryExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5045:1: ( ( () ) )
            // InternalKlangParser.g:5046:1: ( () )
            {
            // InternalKlangParser.g:5046:1: ( () )
            // InternalKlangParser.g:5047:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getToDoubleAction_3_0()); 
            // InternalKlangParser.g:5048:2: ()
            // InternalKlangParser.g:5048:3: 
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
    // InternalKlangParser.g:5056:1: rule__PrimaryExpression__Group_3__1 : rule__PrimaryExpression__Group_3__1__Impl rule__PrimaryExpression__Group_3__2 ;
    public final void rule__PrimaryExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5060:1: ( rule__PrimaryExpression__Group_3__1__Impl rule__PrimaryExpression__Group_3__2 )
            // InternalKlangParser.g:5061:2: rule__PrimaryExpression__Group_3__1__Impl rule__PrimaryExpression__Group_3__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalKlangParser.g:5068:1: rule__PrimaryExpression__Group_3__1__Impl : ( Double ) ;
    public final void rule__PrimaryExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5072:1: ( ( Double ) )
            // InternalKlangParser.g:5073:1: ( Double )
            {
            // InternalKlangParser.g:5073:1: ( Double )
            // InternalKlangParser.g:5074:2: Double
            {
             before(grammarAccess.getPrimaryExpressionAccess().getDoubleKeyword_3_1()); 
            match(input,Double,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getDoubleKeyword_3_1()); 

            }


            }

        }
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
    // InternalKlangParser.g:5083:1: rule__PrimaryExpression__Group_3__2 : rule__PrimaryExpression__Group_3__2__Impl rule__PrimaryExpression__Group_3__3 ;
    public final void rule__PrimaryExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5087:1: ( rule__PrimaryExpression__Group_3__2__Impl rule__PrimaryExpression__Group_3__3 )
            // InternalKlangParser.g:5088:2: rule__PrimaryExpression__Group_3__2__Impl rule__PrimaryExpression__Group_3__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalKlangParser.g:5095:1: rule__PrimaryExpression__Group_3__2__Impl : ( LeftParenthesis ) ;
    public final void rule__PrimaryExpression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5099:1: ( ( LeftParenthesis ) )
            // InternalKlangParser.g:5100:1: ( LeftParenthesis )
            {
            // InternalKlangParser.g:5100:1: ( LeftParenthesis )
            // InternalKlangParser.g:5101:2: LeftParenthesis
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_3_2()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_3_2()); 

            }


            }

        }
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
    // InternalKlangParser.g:5110:1: rule__PrimaryExpression__Group_3__3 : rule__PrimaryExpression__Group_3__3__Impl rule__PrimaryExpression__Group_3__4 ;
    public final void rule__PrimaryExpression__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5114:1: ( rule__PrimaryExpression__Group_3__3__Impl rule__PrimaryExpression__Group_3__4 )
            // InternalKlangParser.g:5115:2: rule__PrimaryExpression__Group_3__3__Impl rule__PrimaryExpression__Group_3__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalKlangParser.g:5122:1: rule__PrimaryExpression__Group_3__3__Impl : ( ( rule__PrimaryExpression__ExpressionAssignment_3_3 ) ) ;
    public final void rule__PrimaryExpression__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5126:1: ( ( ( rule__PrimaryExpression__ExpressionAssignment_3_3 ) ) )
            // InternalKlangParser.g:5127:1: ( ( rule__PrimaryExpression__ExpressionAssignment_3_3 ) )
            {
            // InternalKlangParser.g:5127:1: ( ( rule__PrimaryExpression__ExpressionAssignment_3_3 ) )
            // InternalKlangParser.g:5128:2: ( rule__PrimaryExpression__ExpressionAssignment_3_3 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionAssignment_3_3()); 
            // InternalKlangParser.g:5129:2: ( rule__PrimaryExpression__ExpressionAssignment_3_3 )
            // InternalKlangParser.g:5129:3: rule__PrimaryExpression__ExpressionAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__ExpressionAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getExpressionAssignment_3_3()); 

            }


            }

        }
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
    // InternalKlangParser.g:5137:1: rule__PrimaryExpression__Group_3__4 : rule__PrimaryExpression__Group_3__4__Impl ;
    public final void rule__PrimaryExpression__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5141:1: ( rule__PrimaryExpression__Group_3__4__Impl )
            // InternalKlangParser.g:5142:2: rule__PrimaryExpression__Group_3__4__Impl
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
    // InternalKlangParser.g:5148:1: rule__PrimaryExpression__Group_3__4__Impl : ( RightParenthesis ) ;
    public final void rule__PrimaryExpression__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5152:1: ( ( RightParenthesis ) )
            // InternalKlangParser.g:5153:1: ( RightParenthesis )
            {
            // InternalKlangParser.g:5153:1: ( RightParenthesis )
            // InternalKlangParser.g:5154:2: RightParenthesis
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_3_4()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_3_4()); 

            }


            }

        }
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
    // InternalKlangParser.g:5164:1: rule__PrimaryExpression__Group_4__0 : rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 ;
    public final void rule__PrimaryExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5168:1: ( rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 )
            // InternalKlangParser.g:5169:2: rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalKlangParser.g:5176:1: rule__PrimaryExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5180:1: ( ( () ) )
            // InternalKlangParser.g:5181:1: ( () )
            {
            // InternalKlangParser.g:5181:1: ( () )
            // InternalKlangParser.g:5182:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getToIntAction_4_0()); 
            // InternalKlangParser.g:5183:2: ()
            // InternalKlangParser.g:5183:3: 
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
    // InternalKlangParser.g:5191:1: rule__PrimaryExpression__Group_4__1 : rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2 ;
    public final void rule__PrimaryExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5195:1: ( rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2 )
            // InternalKlangParser.g:5196:2: rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalKlangParser.g:5203:1: rule__PrimaryExpression__Group_4__1__Impl : ( Int ) ;
    public final void rule__PrimaryExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5207:1: ( ( Int ) )
            // InternalKlangParser.g:5208:1: ( Int )
            {
            // InternalKlangParser.g:5208:1: ( Int )
            // InternalKlangParser.g:5209:2: Int
            {
             before(grammarAccess.getPrimaryExpressionAccess().getIntKeyword_4_1()); 
            match(input,Int,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getIntKeyword_4_1()); 

            }


            }

        }
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
    // InternalKlangParser.g:5218:1: rule__PrimaryExpression__Group_4__2 : rule__PrimaryExpression__Group_4__2__Impl rule__PrimaryExpression__Group_4__3 ;
    public final void rule__PrimaryExpression__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5222:1: ( rule__PrimaryExpression__Group_4__2__Impl rule__PrimaryExpression__Group_4__3 )
            // InternalKlangParser.g:5223:2: rule__PrimaryExpression__Group_4__2__Impl rule__PrimaryExpression__Group_4__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalKlangParser.g:5230:1: rule__PrimaryExpression__Group_4__2__Impl : ( LeftParenthesis ) ;
    public final void rule__PrimaryExpression__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5234:1: ( ( LeftParenthesis ) )
            // InternalKlangParser.g:5235:1: ( LeftParenthesis )
            {
            // InternalKlangParser.g:5235:1: ( LeftParenthesis )
            // InternalKlangParser.g:5236:2: LeftParenthesis
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_2()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_2()); 

            }


            }

        }
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
    // InternalKlangParser.g:5245:1: rule__PrimaryExpression__Group_4__3 : rule__PrimaryExpression__Group_4__3__Impl rule__PrimaryExpression__Group_4__4 ;
    public final void rule__PrimaryExpression__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5249:1: ( rule__PrimaryExpression__Group_4__3__Impl rule__PrimaryExpression__Group_4__4 )
            // InternalKlangParser.g:5250:2: rule__PrimaryExpression__Group_4__3__Impl rule__PrimaryExpression__Group_4__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalKlangParser.g:5257:1: rule__PrimaryExpression__Group_4__3__Impl : ( ( rule__PrimaryExpression__ExpressionAssignment_4_3 ) ) ;
    public final void rule__PrimaryExpression__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5261:1: ( ( ( rule__PrimaryExpression__ExpressionAssignment_4_3 ) ) )
            // InternalKlangParser.g:5262:1: ( ( rule__PrimaryExpression__ExpressionAssignment_4_3 ) )
            {
            // InternalKlangParser.g:5262:1: ( ( rule__PrimaryExpression__ExpressionAssignment_4_3 ) )
            // InternalKlangParser.g:5263:2: ( rule__PrimaryExpression__ExpressionAssignment_4_3 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionAssignment_4_3()); 
            // InternalKlangParser.g:5264:2: ( rule__PrimaryExpression__ExpressionAssignment_4_3 )
            // InternalKlangParser.g:5264:3: rule__PrimaryExpression__ExpressionAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__ExpressionAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getExpressionAssignment_4_3()); 

            }


            }

        }
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
    // InternalKlangParser.g:5272:1: rule__PrimaryExpression__Group_4__4 : rule__PrimaryExpression__Group_4__4__Impl ;
    public final void rule__PrimaryExpression__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5276:1: ( rule__PrimaryExpression__Group_4__4__Impl )
            // InternalKlangParser.g:5277:2: rule__PrimaryExpression__Group_4__4__Impl
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
    // InternalKlangParser.g:5283:1: rule__PrimaryExpression__Group_4__4__Impl : ( RightParenthesis ) ;
    public final void rule__PrimaryExpression__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5287:1: ( ( RightParenthesis ) )
            // InternalKlangParser.g:5288:1: ( RightParenthesis )
            {
            // InternalKlangParser.g:5288:1: ( RightParenthesis )
            // InternalKlangParser.g:5289:2: RightParenthesis
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_4()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
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
    // InternalKlangParser.g:5299:1: rule__AtomicExpression__Group_0__0 : rule__AtomicExpression__Group_0__0__Impl rule__AtomicExpression__Group_0__1 ;
    public final void rule__AtomicExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5303:1: ( rule__AtomicExpression__Group_0__0__Impl rule__AtomicExpression__Group_0__1 )
            // InternalKlangParser.g:5304:2: rule__AtomicExpression__Group_0__0__Impl rule__AtomicExpression__Group_0__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalKlangParser.g:5311:1: rule__AtomicExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__AtomicExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5315:1: ( ( () ) )
            // InternalKlangParser.g:5316:1: ( () )
            {
            // InternalKlangParser.g:5316:1: ( () )
            // InternalKlangParser.g:5317:2: ()
            {
             before(grammarAccess.getAtomicExpressionAccess().getBooleanLiteralAction_0_0()); 
            // InternalKlangParser.g:5318:2: ()
            // InternalKlangParser.g:5318:3: 
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
    // InternalKlangParser.g:5326:1: rule__AtomicExpression__Group_0__1 : rule__AtomicExpression__Group_0__1__Impl ;
    public final void rule__AtomicExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5330:1: ( rule__AtomicExpression__Group_0__1__Impl )
            // InternalKlangParser.g:5331:2: rule__AtomicExpression__Group_0__1__Impl
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
    // InternalKlangParser.g:5337:1: rule__AtomicExpression__Group_0__1__Impl : ( ( rule__AtomicExpression__Alternatives_0_1 ) ) ;
    public final void rule__AtomicExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5341:1: ( ( ( rule__AtomicExpression__Alternatives_0_1 ) ) )
            // InternalKlangParser.g:5342:1: ( ( rule__AtomicExpression__Alternatives_0_1 ) )
            {
            // InternalKlangParser.g:5342:1: ( ( rule__AtomicExpression__Alternatives_0_1 ) )
            // InternalKlangParser.g:5343:2: ( rule__AtomicExpression__Alternatives_0_1 )
            {
             before(grammarAccess.getAtomicExpressionAccess().getAlternatives_0_1()); 
            // InternalKlangParser.g:5344:2: ( rule__AtomicExpression__Alternatives_0_1 )
            // InternalKlangParser.g:5344:3: rule__AtomicExpression__Alternatives_0_1
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
    // InternalKlangParser.g:5353:1: rule__AtomicExpression__Group_1__0 : rule__AtomicExpression__Group_1__0__Impl rule__AtomicExpression__Group_1__1 ;
    public final void rule__AtomicExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5357:1: ( rule__AtomicExpression__Group_1__0__Impl rule__AtomicExpression__Group_1__1 )
            // InternalKlangParser.g:5358:2: rule__AtomicExpression__Group_1__0__Impl rule__AtomicExpression__Group_1__1
            {
            pushFollow(FOLLOW_53);
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
    // InternalKlangParser.g:5365:1: rule__AtomicExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AtomicExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5369:1: ( ( () ) )
            // InternalKlangParser.g:5370:1: ( () )
            {
            // InternalKlangParser.g:5370:1: ( () )
            // InternalKlangParser.g:5371:2: ()
            {
             before(grammarAccess.getAtomicExpressionAccess().getDoubleLiteralAction_1_0()); 
            // InternalKlangParser.g:5372:2: ()
            // InternalKlangParser.g:5372:3: 
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
    // InternalKlangParser.g:5380:1: rule__AtomicExpression__Group_1__1 : rule__AtomicExpression__Group_1__1__Impl ;
    public final void rule__AtomicExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5384:1: ( rule__AtomicExpression__Group_1__1__Impl )
            // InternalKlangParser.g:5385:2: rule__AtomicExpression__Group_1__1__Impl
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
    // InternalKlangParser.g:5391:1: rule__AtomicExpression__Group_1__1__Impl : ( ( rule__AtomicExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__AtomicExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5395:1: ( ( ( rule__AtomicExpression__ValueAssignment_1_1 ) ) )
            // InternalKlangParser.g:5396:1: ( ( rule__AtomicExpression__ValueAssignment_1_1 ) )
            {
            // InternalKlangParser.g:5396:1: ( ( rule__AtomicExpression__ValueAssignment_1_1 ) )
            // InternalKlangParser.g:5397:2: ( rule__AtomicExpression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicExpressionAccess().getValueAssignment_1_1()); 
            // InternalKlangParser.g:5398:2: ( rule__AtomicExpression__ValueAssignment_1_1 )
            // InternalKlangParser.g:5398:3: rule__AtomicExpression__ValueAssignment_1_1
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
    // InternalKlangParser.g:5407:1: rule__AtomicExpression__Group_2__0 : rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 ;
    public final void rule__AtomicExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5411:1: ( rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 )
            // InternalKlangParser.g:5412:2: rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1
            {
            pushFollow(FOLLOW_53);
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
    // InternalKlangParser.g:5419:1: rule__AtomicExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__AtomicExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5423:1: ( ( () ) )
            // InternalKlangParser.g:5424:1: ( () )
            {
            // InternalKlangParser.g:5424:1: ( () )
            // InternalKlangParser.g:5425:2: ()
            {
             before(grammarAccess.getAtomicExpressionAccess().getIntegerLiteralAction_2_0()); 
            // InternalKlangParser.g:5426:2: ()
            // InternalKlangParser.g:5426:3: 
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
    // InternalKlangParser.g:5434:1: rule__AtomicExpression__Group_2__1 : rule__AtomicExpression__Group_2__1__Impl ;
    public final void rule__AtomicExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5438:1: ( rule__AtomicExpression__Group_2__1__Impl )
            // InternalKlangParser.g:5439:2: rule__AtomicExpression__Group_2__1__Impl
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
    // InternalKlangParser.g:5445:1: rule__AtomicExpression__Group_2__1__Impl : ( ( rule__AtomicExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__AtomicExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5449:1: ( ( ( rule__AtomicExpression__ValueAssignment_2_1 ) ) )
            // InternalKlangParser.g:5450:1: ( ( rule__AtomicExpression__ValueAssignment_2_1 ) )
            {
            // InternalKlangParser.g:5450:1: ( ( rule__AtomicExpression__ValueAssignment_2_1 ) )
            // InternalKlangParser.g:5451:2: ( rule__AtomicExpression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicExpressionAccess().getValueAssignment_2_1()); 
            // InternalKlangParser.g:5452:2: ( rule__AtomicExpression__ValueAssignment_2_1 )
            // InternalKlangParser.g:5452:3: rule__AtomicExpression__ValueAssignment_2_1
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
    // InternalKlangParser.g:5461:1: rule__AtomicExpression__Group_3__0 : rule__AtomicExpression__Group_3__0__Impl rule__AtomicExpression__Group_3__1 ;
    public final void rule__AtomicExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5465:1: ( rule__AtomicExpression__Group_3__0__Impl rule__AtomicExpression__Group_3__1 )
            // InternalKlangParser.g:5466:2: rule__AtomicExpression__Group_3__0__Impl rule__AtomicExpression__Group_3__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalKlangParser.g:5473:1: rule__AtomicExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__AtomicExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5477:1: ( ( () ) )
            // InternalKlangParser.g:5478:1: ( () )
            {
            // InternalKlangParser.g:5478:1: ( () )
            // InternalKlangParser.g:5479:2: ()
            {
             before(grammarAccess.getAtomicExpressionAccess().getStringLiteralAction_3_0()); 
            // InternalKlangParser.g:5480:2: ()
            // InternalKlangParser.g:5480:3: 
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
    // InternalKlangParser.g:5488:1: rule__AtomicExpression__Group_3__1 : rule__AtomicExpression__Group_3__1__Impl ;
    public final void rule__AtomicExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5492:1: ( rule__AtomicExpression__Group_3__1__Impl )
            // InternalKlangParser.g:5493:2: rule__AtomicExpression__Group_3__1__Impl
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
    // InternalKlangParser.g:5499:1: rule__AtomicExpression__Group_3__1__Impl : ( ( rule__AtomicExpression__ValueAssignment_3_1 ) ) ;
    public final void rule__AtomicExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5503:1: ( ( ( rule__AtomicExpression__ValueAssignment_3_1 ) ) )
            // InternalKlangParser.g:5504:1: ( ( rule__AtomicExpression__ValueAssignment_3_1 ) )
            {
            // InternalKlangParser.g:5504:1: ( ( rule__AtomicExpression__ValueAssignment_3_1 ) )
            // InternalKlangParser.g:5505:2: ( rule__AtomicExpression__ValueAssignment_3_1 )
            {
             before(grammarAccess.getAtomicExpressionAccess().getValueAssignment_3_1()); 
            // InternalKlangParser.g:5506:2: ( rule__AtomicExpression__ValueAssignment_3_1 )
            // InternalKlangParser.g:5506:3: rule__AtomicExpression__ValueAssignment_3_1
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
    // InternalKlangParser.g:5515:1: rule__AtomicExpression__Group_4__0 : rule__AtomicExpression__Group_4__0__Impl rule__AtomicExpression__Group_4__1 ;
    public final void rule__AtomicExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5519:1: ( rule__AtomicExpression__Group_4__0__Impl rule__AtomicExpression__Group_4__1 )
            // InternalKlangParser.g:5520:2: rule__AtomicExpression__Group_4__0__Impl rule__AtomicExpression__Group_4__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalKlangParser.g:5527:1: rule__AtomicExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__AtomicExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5531:1: ( ( () ) )
            // InternalKlangParser.g:5532:1: ( () )
            {
            // InternalKlangParser.g:5532:1: ( () )
            // InternalKlangParser.g:5533:2: ()
            {
             before(grammarAccess.getAtomicExpressionAccess().getVariableReferenceAction_4_0()); 
            // InternalKlangParser.g:5534:2: ()
            // InternalKlangParser.g:5534:3: 
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
    // InternalKlangParser.g:5542:1: rule__AtomicExpression__Group_4__1 : rule__AtomicExpression__Group_4__1__Impl ;
    public final void rule__AtomicExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5546:1: ( rule__AtomicExpression__Group_4__1__Impl )
            // InternalKlangParser.g:5547:2: rule__AtomicExpression__Group_4__1__Impl
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
    // InternalKlangParser.g:5553:1: rule__AtomicExpression__Group_4__1__Impl : ( ( rule__AtomicExpression__VariableNameAssignment_4_1 ) ) ;
    public final void rule__AtomicExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5557:1: ( ( ( rule__AtomicExpression__VariableNameAssignment_4_1 ) ) )
            // InternalKlangParser.g:5558:1: ( ( rule__AtomicExpression__VariableNameAssignment_4_1 ) )
            {
            // InternalKlangParser.g:5558:1: ( ( rule__AtomicExpression__VariableNameAssignment_4_1 ) )
            // InternalKlangParser.g:5559:2: ( rule__AtomicExpression__VariableNameAssignment_4_1 )
            {
             before(grammarAccess.getAtomicExpressionAccess().getVariableNameAssignment_4_1()); 
            // InternalKlangParser.g:5560:2: ( rule__AtomicExpression__VariableNameAssignment_4_1 )
            // InternalKlangParser.g:5560:3: rule__AtomicExpression__VariableNameAssignment_4_1
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
    // InternalKlangParser.g:5569:1: rule__DECIMAL__Group__0 : rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 ;
    public final void rule__DECIMAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5573:1: ( rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 )
            // InternalKlangParser.g:5574:2: rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1
            {
            pushFollow(FOLLOW_54);
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
    // InternalKlangParser.g:5581:1: rule__DECIMAL__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5585:1: ( ( RULE_INT ) )
            // InternalKlangParser.g:5586:1: ( RULE_INT )
            {
            // InternalKlangParser.g:5586:1: ( RULE_INT )
            // InternalKlangParser.g:5587:2: RULE_INT
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
    // InternalKlangParser.g:5596:1: rule__DECIMAL__Group__1 : rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 ;
    public final void rule__DECIMAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5600:1: ( rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 )
            // InternalKlangParser.g:5601:2: rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2
            {
            pushFollow(FOLLOW_53);
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
    // InternalKlangParser.g:5608:1: rule__DECIMAL__Group__1__Impl : ( FullStop ) ;
    public final void rule__DECIMAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5612:1: ( ( FullStop ) )
            // InternalKlangParser.g:5613:1: ( FullStop )
            {
            // InternalKlangParser.g:5613:1: ( FullStop )
            // InternalKlangParser.g:5614:2: FullStop
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
    // InternalKlangParser.g:5623:1: rule__DECIMAL__Group__2 : rule__DECIMAL__Group__2__Impl ;
    public final void rule__DECIMAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5627:1: ( rule__DECIMAL__Group__2__Impl )
            // InternalKlangParser.g:5628:2: rule__DECIMAL__Group__2__Impl
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
    // InternalKlangParser.g:5634:1: rule__DECIMAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5638:1: ( ( RULE_INT ) )
            // InternalKlangParser.g:5639:1: ( RULE_INT )
            {
            // InternalKlangParser.g:5639:1: ( RULE_INT )
            // InternalKlangParser.g:5640:2: RULE_INT
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
    // InternalKlangParser.g:5650:1: rule__Program__SceneActorAssignment_0 : ( ruleSceneActor ) ;
    public final void rule__Program__SceneActorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5654:1: ( ( ruleSceneActor ) )
            // InternalKlangParser.g:5655:2: ( ruleSceneActor )
            {
            // InternalKlangParser.g:5655:2: ( ruleSceneActor )
            // InternalKlangParser.g:5656:3: ruleSceneActor
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
    // InternalKlangParser.g:5665:1: rule__Program__SpriteActorsAssignment_1 : ( ruleSpriteActor ) ;
    public final void rule__Program__SpriteActorsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5669:1: ( ( ruleSpriteActor ) )
            // InternalKlangParser.g:5670:2: ( ruleSpriteActor )
            {
            // InternalKlangParser.g:5670:2: ( ruleSpriteActor )
            // InternalKlangParser.g:5671:3: ruleSpriteActor
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


    // $ANTLR start "rule__SceneActor__NameAssignment_2"
    // InternalKlangParser.g:5680:1: rule__SceneActor__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SceneActor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5684:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:5685:2: ( RULE_ID )
            {
            // InternalKlangParser.g:5685:2: ( RULE_ID )
            // InternalKlangParser.g:5686:3: RULE_ID
            {
             before(grammarAccess.getSceneActorAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSceneActorAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneActor__NameAssignment_2"


    // $ANTLR start "rule__SceneActor__LocalVariablesAssignment_3_1"
    // InternalKlangParser.g:5695:1: rule__SceneActor__LocalVariablesAssignment_3_1 : ( ruleVariableDeclaration ) ;
    public final void rule__SceneActor__LocalVariablesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5699:1: ( ( ruleVariableDeclaration ) )
            // InternalKlangParser.g:5700:2: ( ruleVariableDeclaration )
            {
            // InternalKlangParser.g:5700:2: ( ruleVariableDeclaration )
            // InternalKlangParser.g:5701:3: ruleVariableDeclaration
            {
             before(grammarAccess.getSceneActorAccess().getLocalVariablesVariableDeclarationParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getSceneActorAccess().getLocalVariablesVariableDeclarationParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneActor__LocalVariablesAssignment_3_1"


    // $ANTLR start "rule__SceneActor__EventHandlersAssignment_3_2"
    // InternalKlangParser.g:5710:1: rule__SceneActor__EventHandlersAssignment_3_2 : ( ruleEventHandler ) ;
    public final void rule__SceneActor__EventHandlersAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5714:1: ( ( ruleEventHandler ) )
            // InternalKlangParser.g:5715:2: ( ruleEventHandler )
            {
            // InternalKlangParser.g:5715:2: ( ruleEventHandler )
            // InternalKlangParser.g:5716:3: ruleEventHandler
            {
             before(grammarAccess.getSceneActorAccess().getEventHandlersEventHandlerParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEventHandler();

            state._fsp--;

             after(grammarAccess.getSceneActorAccess().getEventHandlersEventHandlerParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneActor__EventHandlersAssignment_3_2"


    // $ANTLR start "rule__SpriteActor__NameAssignment_2"
    // InternalKlangParser.g:5725:1: rule__SpriteActor__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SpriteActor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5729:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:5730:2: ( RULE_ID )
            {
            // InternalKlangParser.g:5730:2: ( RULE_ID )
            // InternalKlangParser.g:5731:3: RULE_ID
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


    // $ANTLR start "rule__SpriteActor__LocalVariablesAssignment_3_1"
    // InternalKlangParser.g:5740:1: rule__SpriteActor__LocalVariablesAssignment_3_1 : ( ruleVariableDeclaration ) ;
    public final void rule__SpriteActor__LocalVariablesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5744:1: ( ( ruleVariableDeclaration ) )
            // InternalKlangParser.g:5745:2: ( ruleVariableDeclaration )
            {
            // InternalKlangParser.g:5745:2: ( ruleVariableDeclaration )
            // InternalKlangParser.g:5746:3: ruleVariableDeclaration
            {
             before(grammarAccess.getSpriteActorAccess().getLocalVariablesVariableDeclarationParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getSpriteActorAccess().getLocalVariablesVariableDeclarationParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteActor__LocalVariablesAssignment_3_1"


    // $ANTLR start "rule__SpriteActor__EventHandlersAssignment_3_2"
    // InternalKlangParser.g:5755:1: rule__SpriteActor__EventHandlersAssignment_3_2 : ( ruleEventHandler ) ;
    public final void rule__SpriteActor__EventHandlersAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5759:1: ( ( ruleEventHandler ) )
            // InternalKlangParser.g:5760:2: ( ruleEventHandler )
            {
            // InternalKlangParser.g:5760:2: ( ruleEventHandler )
            // InternalKlangParser.g:5761:3: ruleEventHandler
            {
             before(grammarAccess.getSpriteActorAccess().getEventHandlersEventHandlerParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEventHandler();

            state._fsp--;

             after(grammarAccess.getSpriteActorAccess().getEventHandlersEventHandlerParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpriteActor__EventHandlersAssignment_3_2"


    // $ANTLR start "rule__EventHandler__ReferenceEventAssignment_1"
    // InternalKlangParser.g:5770:1: rule__EventHandler__ReferenceEventAssignment_1 : ( ruleEvent ) ;
    public final void rule__EventHandler__ReferenceEventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5774:1: ( ( ruleEvent ) )
            // InternalKlangParser.g:5775:2: ( ruleEvent )
            {
            // InternalKlangParser.g:5775:2: ( ruleEvent )
            // InternalKlangParser.g:5776:3: ruleEvent
            {
             before(grammarAccess.getEventHandlerAccess().getReferenceEventEventParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventHandlerAccess().getReferenceEventEventParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventHandler__ReferenceEventAssignment_1"


    // $ANTLR start "rule__EventHandler__StatementsAssignment_3"
    // InternalKlangParser.g:5785:1: rule__EventHandler__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__EventHandler__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5789:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:5790:2: ( ruleStatement )
            {
            // InternalKlangParser.g:5790:2: ( ruleStatement )
            // InternalKlangParser.g:5791:3: ruleStatement
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


    // $ANTLR start "rule__MessageReceivedEvent__NameAssignment_1"
    // InternalKlangParser.g:5800:1: rule__MessageReceivedEvent__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__MessageReceivedEvent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5804:1: ( ( RULE_STRING ) )
            // InternalKlangParser.g:5805:2: ( RULE_STRING )
            {
            // InternalKlangParser.g:5805:2: ( RULE_STRING )
            // InternalKlangParser.g:5806:3: RULE_STRING
            {
             before(grammarAccess.getMessageReceivedEventAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMessageReceivedEventAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageReceivedEvent__NameAssignment_1"


    // $ANTLR start "rule__KeyPressedEvent__KeyAssignment_1"
    // InternalKlangParser.g:5815:1: rule__KeyPressedEvent__KeyAssignment_1 : ( ruleKeys ) ;
    public final void rule__KeyPressedEvent__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5819:1: ( ( ruleKeys ) )
            // InternalKlangParser.g:5820:2: ( ruleKeys )
            {
            // InternalKlangParser.g:5820:2: ( ruleKeys )
            // InternalKlangParser.g:5821:3: ruleKeys
            {
             before(grammarAccess.getKeyPressedEventAccess().getKeyKeysEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleKeys();

            state._fsp--;

             after(grammarAccess.getKeyPressedEventAccess().getKeyKeysEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyPressedEvent__KeyAssignment_1"


    // $ANTLR start "rule__CollisionEvent__TargetAssignment_3"
    // InternalKlangParser.g:5830:1: rule__CollisionEvent__TargetAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__CollisionEvent__TargetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5834:1: ( ( ( RULE_ID ) ) )
            // InternalKlangParser.g:5835:2: ( ( RULE_ID ) )
            {
            // InternalKlangParser.g:5835:2: ( ( RULE_ID ) )
            // InternalKlangParser.g:5836:3: ( RULE_ID )
            {
             before(grammarAccess.getCollisionEventAccess().getTargetSpriteActorCrossReference_3_0()); 
            // InternalKlangParser.g:5837:3: ( RULE_ID )
            // InternalKlangParser.g:5838:4: RULE_ID
            {
             before(grammarAccess.getCollisionEventAccess().getTargetSpriteActorIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCollisionEventAccess().getTargetSpriteActorIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCollisionEventAccess().getTargetSpriteActorCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollisionEvent__TargetAssignment_3"


    // $ANTLR start "rule__SendMessage__NameAssignment_3"
    // InternalKlangParser.g:5849:1: rule__SendMessage__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__SendMessage__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5853:1: ( ( RULE_STRING ) )
            // InternalKlangParser.g:5854:2: ( RULE_STRING )
            {
            // InternalKlangParser.g:5854:2: ( RULE_STRING )
            // InternalKlangParser.g:5855:3: RULE_STRING
            {
             before(grammarAccess.getSendMessageAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSendMessageAccess().getNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendMessage__NameAssignment_3"


    // $ANTLR start "rule__WhileLoop__PredicateAssignment_2"
    // InternalKlangParser.g:5864:1: rule__WhileLoop__PredicateAssignment_2 : ( ruleExpression ) ;
    public final void rule__WhileLoop__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5868:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:5869:2: ( ruleExpression )
            {
            // InternalKlangParser.g:5869:2: ( ruleExpression )
            // InternalKlangParser.g:5870:3: ruleExpression
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


    // $ANTLR start "rule__WhileLoop__StatementsAssignment_4"
    // InternalKlangParser.g:5879:1: rule__WhileLoop__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__WhileLoop__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5883:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:5884:2: ( ruleStatement )
            {
            // InternalKlangParser.g:5884:2: ( ruleStatement )
            // InternalKlangParser.g:5885:3: ruleStatement
            {
             before(grammarAccess.getWhileLoopAccess().getStatementsStatementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getWhileLoopAccess().getStatementsStatementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__StatementsAssignment_4"


    // $ANTLR start "rule__If__PredicateAssignment_2"
    // InternalKlangParser.g:5894:1: rule__If__PredicateAssignment_2 : ( ruleExpression ) ;
    public final void rule__If__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5898:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:5899:2: ( ruleExpression )
            {
            // InternalKlangParser.g:5899:2: ( ruleExpression )
            // InternalKlangParser.g:5900:3: ruleExpression
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
    // InternalKlangParser.g:5909:1: rule__If__IfBlockAssignment_4 : ( ruleStatement ) ;
    public final void rule__If__IfBlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5913:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:5914:2: ( ruleStatement )
            {
            // InternalKlangParser.g:5914:2: ( ruleStatement )
            // InternalKlangParser.g:5915:3: ruleStatement
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
    // InternalKlangParser.g:5924:1: rule__If__ElseBlockAssignment_6_2 : ( ruleStatement ) ;
    public final void rule__If__ElseBlockAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5928:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:5929:2: ( ruleStatement )
            {
            // InternalKlangParser.g:5929:2: ( ruleStatement )
            // InternalKlangParser.g:5930:3: ruleStatement
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


    // $ANTLR start "rule__ForeverLoop__StatementsAssignment_3"
    // InternalKlangParser.g:5939:1: rule__ForeverLoop__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__ForeverLoop__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5943:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:5944:2: ( ruleStatement )
            {
            // InternalKlangParser.g:5944:2: ( ruleStatement )
            // InternalKlangParser.g:5945:3: ruleStatement
            {
             before(grammarAccess.getForeverLoopAccess().getStatementsStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getForeverLoopAccess().getStatementsStatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeverLoop__StatementsAssignment_3"


    // $ANTLR start "rule__VariableDeclaration__NameAssignment_1"
    // InternalKlangParser.g:5954:1: rule__VariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5958:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:5959:2: ( RULE_ID )
            {
            // InternalKlangParser.g:5959:2: ( RULE_ID )
            // InternalKlangParser.g:5960:3: RULE_ID
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
    // InternalKlangParser.g:5969:1: rule__VariableDeclaration__ExpressionAssignment_3 : ( ruleExpression ) ;
    public final void rule__VariableDeclaration__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5973:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:5974:2: ( ruleExpression )
            {
            // InternalKlangParser.g:5974:2: ( ruleExpression )
            // InternalKlangParser.g:5975:3: ruleExpression
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
    // InternalKlangParser.g:5984:1: rule__VariableAssignment__VariableNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__VariableAssignment__VariableNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5988:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:5989:2: ( RULE_ID )
            {
            // InternalKlangParser.g:5989:2: ( RULE_ID )
            // InternalKlangParser.g:5990:3: RULE_ID
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
    // InternalKlangParser.g:5999:1: rule__VariableAssignment__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__VariableAssignment__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6003:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:6004:2: ( ruleExpression )
            {
            // InternalKlangParser.g:6004:2: ( ruleExpression )
            // InternalKlangParser.g:6005:3: ruleExpression
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
    // InternalKlangParser.g:6014:1: rule__Sleep__DurationAssignment_3 : ( ruleExpression ) ;
    public final void rule__Sleep__DurationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6018:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:6019:2: ( ruleExpression )
            {
            // InternalKlangParser.g:6019:2: ( ruleExpression )
            // InternalKlangParser.g:6020:3: ruleExpression
            {
             before(grammarAccess.getSleepAccess().getDurationExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSleepAccess().getDurationExpressionParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalKlangParser.g:6029:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6033:1: ( ( ruleAnd ) )
            // InternalKlangParser.g:6034:2: ( ruleAnd )
            {
            // InternalKlangParser.g:6034:2: ( ruleAnd )
            // InternalKlangParser.g:6035:3: ruleAnd
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
    // InternalKlangParser.g:6044:1: rule__And__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6048:1: ( ( ruleComparison ) )
            // InternalKlangParser.g:6049:2: ( ruleComparison )
            {
            // InternalKlangParser.g:6049:2: ( ruleComparison )
            // InternalKlangParser.g:6050:3: ruleComparison
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
    // InternalKlangParser.g:6059:1: rule__Plus__RightAssignment_1_2 : ( ruleMinus ) ;
    public final void rule__Plus__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6063:1: ( ( ruleMinus ) )
            // InternalKlangParser.g:6064:2: ( ruleMinus )
            {
            // InternalKlangParser.g:6064:2: ( ruleMinus )
            // InternalKlangParser.g:6065:3: ruleMinus
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
    // InternalKlangParser.g:6074:1: rule__Minus__RightAssignment_1_2 : ( ruleMultiply ) ;
    public final void rule__Minus__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6078:1: ( ( ruleMultiply ) )
            // InternalKlangParser.g:6079:2: ( ruleMultiply )
            {
            // InternalKlangParser.g:6079:2: ( ruleMultiply )
            // InternalKlangParser.g:6080:3: ruleMultiply
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
    // InternalKlangParser.g:6089:1: rule__Multiply__RightAssignment_1_2 : ( ruleDivide ) ;
    public final void rule__Multiply__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6093:1: ( ( ruleDivide ) )
            // InternalKlangParser.g:6094:2: ( ruleDivide )
            {
            // InternalKlangParser.g:6094:2: ( ruleDivide )
            // InternalKlangParser.g:6095:3: ruleDivide
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
    // InternalKlangParser.g:6104:1: rule__Divide__RightAssignment_1_2 : ( rulePrimaryExpression ) ;
    public final void rule__Divide__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6108:1: ( ( rulePrimaryExpression ) )
            // InternalKlangParser.g:6109:2: ( rulePrimaryExpression )
            {
            // InternalKlangParser.g:6109:2: ( rulePrimaryExpression )
            // InternalKlangParser.g:6110:3: rulePrimaryExpression
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
    // InternalKlangParser.g:6119:1: rule__Comparison__RightAssignment_1_1 : ( rulePlus ) ;
    public final void rule__Comparison__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6123:1: ( ( rulePlus ) )
            // InternalKlangParser.g:6124:2: ( rulePlus )
            {
            // InternalKlangParser.g:6124:2: ( rulePlus )
            // InternalKlangParser.g:6125:3: rulePlus
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
    // InternalKlangParser.g:6134:1: rule__FunctionCall__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FunctionCall__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6138:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:6139:2: ( RULE_ID )
            {
            // InternalKlangParser.g:6139:2: ( RULE_ID )
            // InternalKlangParser.g:6140:3: RULE_ID
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
    // InternalKlangParser.g:6149:1: rule__FunctionCall__ParametersAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__FunctionCall__ParametersAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6153:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:6154:2: ( ruleExpression )
            {
            // InternalKlangParser.g:6154:2: ( ruleExpression )
            // InternalKlangParser.g:6155:3: ruleExpression
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
    // InternalKlangParser.g:6164:1: rule__FunctionCall__ParametersAssignment_2_1_1 : ( ruleExpression ) ;
    public final void rule__FunctionCall__ParametersAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6168:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:6169:2: ( ruleExpression )
            {
            // InternalKlangParser.g:6169:2: ( ruleExpression )
            // InternalKlangParser.g:6170:3: ruleExpression
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
    // InternalKlangParser.g:6179:1: rule__PrimaryExpression__ExpressionAssignment_1_2 : ( rulePrimaryExpression ) ;
    public final void rule__PrimaryExpression__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6183:1: ( ( rulePrimaryExpression ) )
            // InternalKlangParser.g:6184:2: ( rulePrimaryExpression )
            {
            // InternalKlangParser.g:6184:2: ( rulePrimaryExpression )
            // InternalKlangParser.g:6185:3: rulePrimaryExpression
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
    // InternalKlangParser.g:6194:1: rule__PrimaryExpression__ExpressionAssignment_2_2 : ( rulePrimaryExpression ) ;
    public final void rule__PrimaryExpression__ExpressionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6198:1: ( ( rulePrimaryExpression ) )
            // InternalKlangParser.g:6199:2: ( rulePrimaryExpression )
            {
            // InternalKlangParser.g:6199:2: ( rulePrimaryExpression )
            // InternalKlangParser.g:6200:3: rulePrimaryExpression
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


    // $ANTLR start "rule__PrimaryExpression__ExpressionAssignment_3_3"
    // InternalKlangParser.g:6209:1: rule__PrimaryExpression__ExpressionAssignment_3_3 : ( rulePrimaryExpression ) ;
    public final void rule__PrimaryExpression__ExpressionAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6213:1: ( ( rulePrimaryExpression ) )
            // InternalKlangParser.g:6214:2: ( rulePrimaryExpression )
            {
            // InternalKlangParser.g:6214:2: ( rulePrimaryExpression )
            // InternalKlangParser.g:6215:3: rulePrimaryExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__ExpressionAssignment_3_3"


    // $ANTLR start "rule__PrimaryExpression__ExpressionAssignment_4_3"
    // InternalKlangParser.g:6224:1: rule__PrimaryExpression__ExpressionAssignment_4_3 : ( rulePrimaryExpression ) ;
    public final void rule__PrimaryExpression__ExpressionAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6228:1: ( ( rulePrimaryExpression ) )
            // InternalKlangParser.g:6229:2: ( rulePrimaryExpression )
            {
            // InternalKlangParser.g:6229:2: ( rulePrimaryExpression )
            // InternalKlangParser.g:6230:3: rulePrimaryExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__ExpressionAssignment_4_3"


    // $ANTLR start "rule__AtomicExpression__ValueAssignment_0_1_0"
    // InternalKlangParser.g:6239:1: rule__AtomicExpression__ValueAssignment_0_1_0 : ( ( True ) ) ;
    public final void rule__AtomicExpression__ValueAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6243:1: ( ( ( True ) ) )
            // InternalKlangParser.g:6244:2: ( ( True ) )
            {
            // InternalKlangParser.g:6244:2: ( ( True ) )
            // InternalKlangParser.g:6245:3: ( True )
            {
             before(grammarAccess.getAtomicExpressionAccess().getValueTrueKeyword_0_1_0_0()); 
            // InternalKlangParser.g:6246:3: ( True )
            // InternalKlangParser.g:6247:4: True
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
    // InternalKlangParser.g:6258:1: rule__AtomicExpression__ValueAssignment_1_1 : ( ruleDECIMAL ) ;
    public final void rule__AtomicExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6262:1: ( ( ruleDECIMAL ) )
            // InternalKlangParser.g:6263:2: ( ruleDECIMAL )
            {
            // InternalKlangParser.g:6263:2: ( ruleDECIMAL )
            // InternalKlangParser.g:6264:3: ruleDECIMAL
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
    // InternalKlangParser.g:6273:1: rule__AtomicExpression__ValueAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__AtomicExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6277:1: ( ( RULE_INT ) )
            // InternalKlangParser.g:6278:2: ( RULE_INT )
            {
            // InternalKlangParser.g:6278:2: ( RULE_INT )
            // InternalKlangParser.g:6279:3: RULE_INT
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
    // InternalKlangParser.g:6288:1: rule__AtomicExpression__ValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__AtomicExpression__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6292:1: ( ( RULE_STRING ) )
            // InternalKlangParser.g:6293:2: ( RULE_STRING )
            {
            // InternalKlangParser.g:6293:2: ( RULE_STRING )
            // InternalKlangParser.g:6294:3: RULE_STRING
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
    // InternalKlangParser.g:6303:1: rule__AtomicExpression__VariableNameAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__AtomicExpression__VariableNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6307:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:6308:2: ( RULE_ID )
            {
            // InternalKlangParser.g:6308:2: ( RULE_ID )
            // InternalKlangParser.g:6309:3: RULE_ID
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008400000L,0x0000000000000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0xFFFFF000001060A0L,0x000000000000043FL});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080060110L,0x0000000000000180L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080060112L,0x0000000000000100L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0xFFFFF00000006000L,0x000000000000003FL});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080060110L,0x0000000000000100L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004206208400L,0x0000000000000700L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00000A0070000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00000A0070000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000004606208400L,0x0000000000000700L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000008000000000L});

}