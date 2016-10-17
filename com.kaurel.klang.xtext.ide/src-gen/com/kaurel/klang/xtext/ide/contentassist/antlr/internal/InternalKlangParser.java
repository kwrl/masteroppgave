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
    		tokenNameToValue.put("LeftSquareBracket", "'['");
    		tokenNameToValue.put("RightSquareBracket", "']'");
    		tokenNameToValue.put("EqualsSignEqualsSign", "'=='");
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
    // InternalKlangParser.g:205:1: ruleEventHandler : ( ( rule__EventHandler__Alternatives ) ) ;
    public final void ruleEventHandler() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:209:2: ( ( ( rule__EventHandler__Alternatives ) ) )
            // InternalKlangParser.g:210:2: ( ( rule__EventHandler__Alternatives ) )
            {
            // InternalKlangParser.g:210:2: ( ( rule__EventHandler__Alternatives ) )
            // InternalKlangParser.g:211:3: ( rule__EventHandler__Alternatives )
            {
             before(grammarAccess.getEventHandlerAccess().getAlternatives()); 
            // InternalKlangParser.g:212:3: ( rule__EventHandler__Alternatives )
            // InternalKlangParser.g:212:4: rule__EventHandler__Alternatives
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


    // $ANTLR start "entryRuleMessageReceived"
    // InternalKlangParser.g:221:1: entryRuleMessageReceived : ruleMessageReceived EOF ;
    public final void entryRuleMessageReceived() throws RecognitionException {
        try {
            // InternalKlangParser.g:222:1: ( ruleMessageReceived EOF )
            // InternalKlangParser.g:223:1: ruleMessageReceived EOF
            {
             before(grammarAccess.getMessageReceivedRule()); 
            pushFollow(FOLLOW_1);
            ruleMessageReceived();

            state._fsp--;

             after(grammarAccess.getMessageReceivedRule()); 
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
    // $ANTLR end "entryRuleMessageReceived"


    // $ANTLR start "ruleMessageReceived"
    // InternalKlangParser.g:230:1: ruleMessageReceived : ( ( rule__MessageReceived__Group__0 ) ) ;
    public final void ruleMessageReceived() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:234:2: ( ( ( rule__MessageReceived__Group__0 ) ) )
            // InternalKlangParser.g:235:2: ( ( rule__MessageReceived__Group__0 ) )
            {
            // InternalKlangParser.g:235:2: ( ( rule__MessageReceived__Group__0 ) )
            // InternalKlangParser.g:236:3: ( rule__MessageReceived__Group__0 )
            {
             before(grammarAccess.getMessageReceivedAccess().getGroup()); 
            // InternalKlangParser.g:237:3: ( rule__MessageReceived__Group__0 )
            // InternalKlangParser.g:237:4: rule__MessageReceived__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MessageReceived__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageReceivedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageReceived"


    // $ANTLR start "entryRuleStatement"
    // InternalKlangParser.g:246:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalKlangParser.g:247:1: ( ruleStatement EOF )
            // InternalKlangParser.g:248:1: ruleStatement EOF
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
    // InternalKlangParser.g:255:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:259:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalKlangParser.g:260:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalKlangParser.g:260:2: ( ( rule__Statement__Alternatives ) )
            // InternalKlangParser.g:261:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalKlangParser.g:262:3: ( rule__Statement__Alternatives )
            // InternalKlangParser.g:262:4: rule__Statement__Alternatives
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
    // InternalKlangParser.g:271:1: entryRuleSendMessage : ruleSendMessage EOF ;
    public final void entryRuleSendMessage() throws RecognitionException {
        try {
            // InternalKlangParser.g:272:1: ( ruleSendMessage EOF )
            // InternalKlangParser.g:273:1: ruleSendMessage EOF
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
    // InternalKlangParser.g:280:1: ruleSendMessage : ( ( rule__SendMessage__Group__0 ) ) ;
    public final void ruleSendMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:284:2: ( ( ( rule__SendMessage__Group__0 ) ) )
            // InternalKlangParser.g:285:2: ( ( rule__SendMessage__Group__0 ) )
            {
            // InternalKlangParser.g:285:2: ( ( rule__SendMessage__Group__0 ) )
            // InternalKlangParser.g:286:3: ( rule__SendMessage__Group__0 )
            {
             before(grammarAccess.getSendMessageAccess().getGroup()); 
            // InternalKlangParser.g:287:3: ( rule__SendMessage__Group__0 )
            // InternalKlangParser.g:287:4: rule__SendMessage__Group__0
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


    // $ANTLR start "entryRuleGameStart"
    // InternalKlangParser.g:296:1: entryRuleGameStart : ruleGameStart EOF ;
    public final void entryRuleGameStart() throws RecognitionException {
        try {
            // InternalKlangParser.g:297:1: ( ruleGameStart EOF )
            // InternalKlangParser.g:298:1: ruleGameStart EOF
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
    // InternalKlangParser.g:305:1: ruleGameStart : ( ( rule__GameStart__Group__0 ) ) ;
    public final void ruleGameStart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:309:2: ( ( ( rule__GameStart__Group__0 ) ) )
            // InternalKlangParser.g:310:2: ( ( rule__GameStart__Group__0 ) )
            {
            // InternalKlangParser.g:310:2: ( ( rule__GameStart__Group__0 ) )
            // InternalKlangParser.g:311:3: ( rule__GameStart__Group__0 )
            {
             before(grammarAccess.getGameStartAccess().getGroup()); 
            // InternalKlangParser.g:312:3: ( rule__GameStart__Group__0 )
            // InternalKlangParser.g:312:4: rule__GameStart__Group__0
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
    // InternalKlangParser.g:321:1: entryRuleSpriteClicked : ruleSpriteClicked EOF ;
    public final void entryRuleSpriteClicked() throws RecognitionException {
        try {
            // InternalKlangParser.g:322:1: ( ruleSpriteClicked EOF )
            // InternalKlangParser.g:323:1: ruleSpriteClicked EOF
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
    // InternalKlangParser.g:330:1: ruleSpriteClicked : ( ( rule__SpriteClicked__Group__0 ) ) ;
    public final void ruleSpriteClicked() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:334:2: ( ( ( rule__SpriteClicked__Group__0 ) ) )
            // InternalKlangParser.g:335:2: ( ( rule__SpriteClicked__Group__0 ) )
            {
            // InternalKlangParser.g:335:2: ( ( rule__SpriteClicked__Group__0 ) )
            // InternalKlangParser.g:336:3: ( rule__SpriteClicked__Group__0 )
            {
             before(grammarAccess.getSpriteClickedAccess().getGroup()); 
            // InternalKlangParser.g:337:3: ( rule__SpriteClicked__Group__0 )
            // InternalKlangParser.g:337:4: rule__SpriteClicked__Group__0
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
    // InternalKlangParser.g:346:1: entryRuleKeyPressed : ruleKeyPressed EOF ;
    public final void entryRuleKeyPressed() throws RecognitionException {
        try {
            // InternalKlangParser.g:347:1: ( ruleKeyPressed EOF )
            // InternalKlangParser.g:348:1: ruleKeyPressed EOF
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
    // InternalKlangParser.g:355:1: ruleKeyPressed : ( ( rule__KeyPressed__Group__0 ) ) ;
    public final void ruleKeyPressed() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:359:2: ( ( ( rule__KeyPressed__Group__0 ) ) )
            // InternalKlangParser.g:360:2: ( ( rule__KeyPressed__Group__0 ) )
            {
            // InternalKlangParser.g:360:2: ( ( rule__KeyPressed__Group__0 ) )
            // InternalKlangParser.g:361:3: ( rule__KeyPressed__Group__0 )
            {
             before(grammarAccess.getKeyPressedAccess().getGroup()); 
            // InternalKlangParser.g:362:3: ( rule__KeyPressed__Group__0 )
            // InternalKlangParser.g:362:4: rule__KeyPressed__Group__0
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
    // InternalKlangParser.g:371:1: entryRuleCollidesWith : ruleCollidesWith EOF ;
    public final void entryRuleCollidesWith() throws RecognitionException {
        try {
            // InternalKlangParser.g:372:1: ( ruleCollidesWith EOF )
            // InternalKlangParser.g:373:1: ruleCollidesWith EOF
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
    // InternalKlangParser.g:380:1: ruleCollidesWith : ( ( rule__CollidesWith__Group__0 ) ) ;
    public final void ruleCollidesWith() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:384:2: ( ( ( rule__CollidesWith__Group__0 ) ) )
            // InternalKlangParser.g:385:2: ( ( rule__CollidesWith__Group__0 ) )
            {
            // InternalKlangParser.g:385:2: ( ( rule__CollidesWith__Group__0 ) )
            // InternalKlangParser.g:386:3: ( rule__CollidesWith__Group__0 )
            {
             before(grammarAccess.getCollidesWithAccess().getGroup()); 
            // InternalKlangParser.g:387:3: ( rule__CollidesWith__Group__0 )
            // InternalKlangParser.g:387:4: rule__CollidesWith__Group__0
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
    // InternalKlangParser.g:396:1: entryRuleWhileLoop : ruleWhileLoop EOF ;
    public final void entryRuleWhileLoop() throws RecognitionException {
        try {
            // InternalKlangParser.g:397:1: ( ruleWhileLoop EOF )
            // InternalKlangParser.g:398:1: ruleWhileLoop EOF
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
    // InternalKlangParser.g:405:1: ruleWhileLoop : ( ( rule__WhileLoop__Group__0 ) ) ;
    public final void ruleWhileLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:409:2: ( ( ( rule__WhileLoop__Group__0 ) ) )
            // InternalKlangParser.g:410:2: ( ( rule__WhileLoop__Group__0 ) )
            {
            // InternalKlangParser.g:410:2: ( ( rule__WhileLoop__Group__0 ) )
            // InternalKlangParser.g:411:3: ( rule__WhileLoop__Group__0 )
            {
             before(grammarAccess.getWhileLoopAccess().getGroup()); 
            // InternalKlangParser.g:412:3: ( rule__WhileLoop__Group__0 )
            // InternalKlangParser.g:412:4: rule__WhileLoop__Group__0
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
    // InternalKlangParser.g:421:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // InternalKlangParser.g:422:1: ( ruleIf EOF )
            // InternalKlangParser.g:423:1: ruleIf EOF
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
    // InternalKlangParser.g:430:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:434:2: ( ( ( rule__If__Group__0 ) ) )
            // InternalKlangParser.g:435:2: ( ( rule__If__Group__0 ) )
            {
            // InternalKlangParser.g:435:2: ( ( rule__If__Group__0 ) )
            // InternalKlangParser.g:436:3: ( rule__If__Group__0 )
            {
             before(grammarAccess.getIfAccess().getGroup()); 
            // InternalKlangParser.g:437:3: ( rule__If__Group__0 )
            // InternalKlangParser.g:437:4: rule__If__Group__0
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
    // InternalKlangParser.g:446:1: entryRuleForeverLoop : ruleForeverLoop EOF ;
    public final void entryRuleForeverLoop() throws RecognitionException {
        try {
            // InternalKlangParser.g:447:1: ( ruleForeverLoop EOF )
            // InternalKlangParser.g:448:1: ruleForeverLoop EOF
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
    // InternalKlangParser.g:455:1: ruleForeverLoop : ( ( rule__ForeverLoop__Group__0 ) ) ;
    public final void ruleForeverLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:459:2: ( ( ( rule__ForeverLoop__Group__0 ) ) )
            // InternalKlangParser.g:460:2: ( ( rule__ForeverLoop__Group__0 ) )
            {
            // InternalKlangParser.g:460:2: ( ( rule__ForeverLoop__Group__0 ) )
            // InternalKlangParser.g:461:3: ( rule__ForeverLoop__Group__0 )
            {
             before(grammarAccess.getForeverLoopAccess().getGroup()); 
            // InternalKlangParser.g:462:3: ( rule__ForeverLoop__Group__0 )
            // InternalKlangParser.g:462:4: rule__ForeverLoop__Group__0
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
    // InternalKlangParser.g:471:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // InternalKlangParser.g:472:1: ( ruleVariableDeclaration EOF )
            // InternalKlangParser.g:473:1: ruleVariableDeclaration EOF
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
    // InternalKlangParser.g:480:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:484:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // InternalKlangParser.g:485:2: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // InternalKlangParser.g:485:2: ( ( rule__VariableDeclaration__Group__0 ) )
            // InternalKlangParser.g:486:3: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // InternalKlangParser.g:487:3: ( rule__VariableDeclaration__Group__0 )
            // InternalKlangParser.g:487:4: rule__VariableDeclaration__Group__0
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
    // InternalKlangParser.g:496:1: entryRuleVariableAssignment : ruleVariableAssignment EOF ;
    public final void entryRuleVariableAssignment() throws RecognitionException {
        try {
            // InternalKlangParser.g:497:1: ( ruleVariableAssignment EOF )
            // InternalKlangParser.g:498:1: ruleVariableAssignment EOF
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
    // InternalKlangParser.g:505:1: ruleVariableAssignment : ( ( rule__VariableAssignment__Group__0 ) ) ;
    public final void ruleVariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:509:2: ( ( ( rule__VariableAssignment__Group__0 ) ) )
            // InternalKlangParser.g:510:2: ( ( rule__VariableAssignment__Group__0 ) )
            {
            // InternalKlangParser.g:510:2: ( ( rule__VariableAssignment__Group__0 ) )
            // InternalKlangParser.g:511:3: ( rule__VariableAssignment__Group__0 )
            {
             before(grammarAccess.getVariableAssignmentAccess().getGroup()); 
            // InternalKlangParser.g:512:3: ( rule__VariableAssignment__Group__0 )
            // InternalKlangParser.g:512:4: rule__VariableAssignment__Group__0
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
    // InternalKlangParser.g:521:1: entryRuleSleep : ruleSleep EOF ;
    public final void entryRuleSleep() throws RecognitionException {
        try {
            // InternalKlangParser.g:522:1: ( ruleSleep EOF )
            // InternalKlangParser.g:523:1: ruleSleep EOF
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
    // InternalKlangParser.g:530:1: ruleSleep : ( ( rule__Sleep__Group__0 ) ) ;
    public final void ruleSleep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:534:2: ( ( ( rule__Sleep__Group__0 ) ) )
            // InternalKlangParser.g:535:2: ( ( rule__Sleep__Group__0 ) )
            {
            // InternalKlangParser.g:535:2: ( ( rule__Sleep__Group__0 ) )
            // InternalKlangParser.g:536:3: ( rule__Sleep__Group__0 )
            {
             before(grammarAccess.getSleepAccess().getGroup()); 
            // InternalKlangParser.g:537:3: ( rule__Sleep__Group__0 )
            // InternalKlangParser.g:537:4: rule__Sleep__Group__0
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
    // InternalKlangParser.g:546:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalKlangParser.g:547:1: ( ruleExpression EOF )
            // InternalKlangParser.g:548:1: ruleExpression EOF
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
    // InternalKlangParser.g:555:1: ruleExpression : ( ruleOr ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:559:2: ( ( ruleOr ) )
            // InternalKlangParser.g:560:2: ( ruleOr )
            {
            // InternalKlangParser.g:560:2: ( ruleOr )
            // InternalKlangParser.g:561:3: ruleOr
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
    // InternalKlangParser.g:571:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalKlangParser.g:572:1: ( ruleOr EOF )
            // InternalKlangParser.g:573:1: ruleOr EOF
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
    // InternalKlangParser.g:580:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:584:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalKlangParser.g:585:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalKlangParser.g:585:2: ( ( rule__Or__Group__0 ) )
            // InternalKlangParser.g:586:3: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // InternalKlangParser.g:587:3: ( rule__Or__Group__0 )
            // InternalKlangParser.g:587:4: rule__Or__Group__0
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
    // InternalKlangParser.g:596:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalKlangParser.g:597:1: ( ruleAnd EOF )
            // InternalKlangParser.g:598:1: ruleAnd EOF
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
    // InternalKlangParser.g:605:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:609:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalKlangParser.g:610:2: ( ( rule__And__Group__0 ) )
            {
            // InternalKlangParser.g:610:2: ( ( rule__And__Group__0 ) )
            // InternalKlangParser.g:611:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalKlangParser.g:612:3: ( rule__And__Group__0 )
            // InternalKlangParser.g:612:4: rule__And__Group__0
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
    // InternalKlangParser.g:621:1: entryRulePlus : rulePlus EOF ;
    public final void entryRulePlus() throws RecognitionException {
        try {
            // InternalKlangParser.g:622:1: ( rulePlus EOF )
            // InternalKlangParser.g:623:1: rulePlus EOF
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
    // InternalKlangParser.g:630:1: rulePlus : ( ( rule__Plus__Group__0 ) ) ;
    public final void rulePlus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:634:2: ( ( ( rule__Plus__Group__0 ) ) )
            // InternalKlangParser.g:635:2: ( ( rule__Plus__Group__0 ) )
            {
            // InternalKlangParser.g:635:2: ( ( rule__Plus__Group__0 ) )
            // InternalKlangParser.g:636:3: ( rule__Plus__Group__0 )
            {
             before(grammarAccess.getPlusAccess().getGroup()); 
            // InternalKlangParser.g:637:3: ( rule__Plus__Group__0 )
            // InternalKlangParser.g:637:4: rule__Plus__Group__0
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
    // InternalKlangParser.g:646:1: entryRuleMinus : ruleMinus EOF ;
    public final void entryRuleMinus() throws RecognitionException {
        try {
            // InternalKlangParser.g:647:1: ( ruleMinus EOF )
            // InternalKlangParser.g:648:1: ruleMinus EOF
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
    // InternalKlangParser.g:655:1: ruleMinus : ( ( rule__Minus__Group__0 ) ) ;
    public final void ruleMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:659:2: ( ( ( rule__Minus__Group__0 ) ) )
            // InternalKlangParser.g:660:2: ( ( rule__Minus__Group__0 ) )
            {
            // InternalKlangParser.g:660:2: ( ( rule__Minus__Group__0 ) )
            // InternalKlangParser.g:661:3: ( rule__Minus__Group__0 )
            {
             before(grammarAccess.getMinusAccess().getGroup()); 
            // InternalKlangParser.g:662:3: ( rule__Minus__Group__0 )
            // InternalKlangParser.g:662:4: rule__Minus__Group__0
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
    // InternalKlangParser.g:671:1: entryRuleMultiply : ruleMultiply EOF ;
    public final void entryRuleMultiply() throws RecognitionException {
        try {
            // InternalKlangParser.g:672:1: ( ruleMultiply EOF )
            // InternalKlangParser.g:673:1: ruleMultiply EOF
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
    // InternalKlangParser.g:680:1: ruleMultiply : ( ( rule__Multiply__Group__0 ) ) ;
    public final void ruleMultiply() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:684:2: ( ( ( rule__Multiply__Group__0 ) ) )
            // InternalKlangParser.g:685:2: ( ( rule__Multiply__Group__0 ) )
            {
            // InternalKlangParser.g:685:2: ( ( rule__Multiply__Group__0 ) )
            // InternalKlangParser.g:686:3: ( rule__Multiply__Group__0 )
            {
             before(grammarAccess.getMultiplyAccess().getGroup()); 
            // InternalKlangParser.g:687:3: ( rule__Multiply__Group__0 )
            // InternalKlangParser.g:687:4: rule__Multiply__Group__0
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
    // InternalKlangParser.g:696:1: entryRuleDivide : ruleDivide EOF ;
    public final void entryRuleDivide() throws RecognitionException {
        try {
            // InternalKlangParser.g:697:1: ( ruleDivide EOF )
            // InternalKlangParser.g:698:1: ruleDivide EOF
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
    // InternalKlangParser.g:705:1: ruleDivide : ( ( rule__Divide__Group__0 ) ) ;
    public final void ruleDivide() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:709:2: ( ( ( rule__Divide__Group__0 ) ) )
            // InternalKlangParser.g:710:2: ( ( rule__Divide__Group__0 ) )
            {
            // InternalKlangParser.g:710:2: ( ( rule__Divide__Group__0 ) )
            // InternalKlangParser.g:711:3: ( rule__Divide__Group__0 )
            {
             before(grammarAccess.getDivideAccess().getGroup()); 
            // InternalKlangParser.g:712:3: ( rule__Divide__Group__0 )
            // InternalKlangParser.g:712:4: rule__Divide__Group__0
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
    // InternalKlangParser.g:721:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalKlangParser.g:722:1: ( ruleComparison EOF )
            // InternalKlangParser.g:723:1: ruleComparison EOF
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
    // InternalKlangParser.g:730:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:734:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalKlangParser.g:735:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalKlangParser.g:735:2: ( ( rule__Comparison__Group__0 ) )
            // InternalKlangParser.g:736:3: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // InternalKlangParser.g:737:3: ( rule__Comparison__Group__0 )
            // InternalKlangParser.g:737:4: rule__Comparison__Group__0
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
    // InternalKlangParser.g:746:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // InternalKlangParser.g:747:1: ( ruleFunctionCall EOF )
            // InternalKlangParser.g:748:1: ruleFunctionCall EOF
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
    // InternalKlangParser.g:755:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:759:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // InternalKlangParser.g:760:2: ( ( rule__FunctionCall__Group__0 ) )
            {
            // InternalKlangParser.g:760:2: ( ( rule__FunctionCall__Group__0 ) )
            // InternalKlangParser.g:761:3: ( rule__FunctionCall__Group__0 )
            {
             before(grammarAccess.getFunctionCallAccess().getGroup()); 
            // InternalKlangParser.g:762:3: ( rule__FunctionCall__Group__0 )
            // InternalKlangParser.g:762:4: rule__FunctionCall__Group__0
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
    // InternalKlangParser.g:771:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalKlangParser.g:772:1: ( rulePrimaryExpression EOF )
            // InternalKlangParser.g:773:1: rulePrimaryExpression EOF
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
    // InternalKlangParser.g:780:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:784:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalKlangParser.g:785:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalKlangParser.g:785:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalKlangParser.g:786:3: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // InternalKlangParser.g:787:3: ( rule__PrimaryExpression__Alternatives )
            // InternalKlangParser.g:787:4: rule__PrimaryExpression__Alternatives
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
    // InternalKlangParser.g:796:1: entryRuleAtomicExpression : ruleAtomicExpression EOF ;
    public final void entryRuleAtomicExpression() throws RecognitionException {
        try {
            // InternalKlangParser.g:797:1: ( ruleAtomicExpression EOF )
            // InternalKlangParser.g:798:1: ruleAtomicExpression EOF
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
    // InternalKlangParser.g:805:1: ruleAtomicExpression : ( ( rule__AtomicExpression__Alternatives ) ) ;
    public final void ruleAtomicExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:809:2: ( ( ( rule__AtomicExpression__Alternatives ) ) )
            // InternalKlangParser.g:810:2: ( ( rule__AtomicExpression__Alternatives ) )
            {
            // InternalKlangParser.g:810:2: ( ( rule__AtomicExpression__Alternatives ) )
            // InternalKlangParser.g:811:3: ( rule__AtomicExpression__Alternatives )
            {
             before(grammarAccess.getAtomicExpressionAccess().getAlternatives()); 
            // InternalKlangParser.g:812:3: ( rule__AtomicExpression__Alternatives )
            // InternalKlangParser.g:812:4: rule__AtomicExpression__Alternatives
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
    // InternalKlangParser.g:821:1: entryRuleDECIMAL : ruleDECIMAL EOF ;
    public final void entryRuleDECIMAL() throws RecognitionException {
        try {
            // InternalKlangParser.g:822:1: ( ruleDECIMAL EOF )
            // InternalKlangParser.g:823:1: ruleDECIMAL EOF
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
    // InternalKlangParser.g:830:1: ruleDECIMAL : ( ( rule__DECIMAL__Group__0 ) ) ;
    public final void ruleDECIMAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:834:2: ( ( ( rule__DECIMAL__Group__0 ) ) )
            // InternalKlangParser.g:835:2: ( ( rule__DECIMAL__Group__0 ) )
            {
            // InternalKlangParser.g:835:2: ( ( rule__DECIMAL__Group__0 ) )
            // InternalKlangParser.g:836:3: ( rule__DECIMAL__Group__0 )
            {
             before(grammarAccess.getDECIMALAccess().getGroup()); 
            // InternalKlangParser.g:837:3: ( rule__DECIMAL__Group__0 )
            // InternalKlangParser.g:837:4: rule__DECIMAL__Group__0
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
    // InternalKlangParser.g:846:1: ruleKeys : ( ( rule__Keys__Alternatives ) ) ;
    public final void ruleKeys() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:850:1: ( ( ( rule__Keys__Alternatives ) ) )
            // InternalKlangParser.g:851:2: ( ( rule__Keys__Alternatives ) )
            {
            // InternalKlangParser.g:851:2: ( ( rule__Keys__Alternatives ) )
            // InternalKlangParser.g:852:3: ( rule__Keys__Alternatives )
            {
             before(grammarAccess.getKeysAccess().getAlternatives()); 
            // InternalKlangParser.g:853:3: ( rule__Keys__Alternatives )
            // InternalKlangParser.g:853:4: rule__Keys__Alternatives
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


    // $ANTLR start "rule__EventHandler__Alternatives"
    // InternalKlangParser.g:861:1: rule__EventHandler__Alternatives : ( ( ruleGameStart ) | ( ruleSpriteClicked ) | ( ruleKeyPressed ) | ( ruleCollidesWith ) | ( ruleMessageReceived ) );
    public final void rule__EventHandler__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:865:1: ( ( ruleGameStart ) | ( ruleSpriteClicked ) | ( ruleKeyPressed ) | ( ruleCollidesWith ) | ( ruleMessageReceived ) )
            int alt1=5;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==When) ) {
                switch ( input.LA(2) ) {
                case Game:
                    {
                    alt1=1;
                    }
                    break;
                case LeftSquareBracket:
                    {
                    int LA1_3 = input.LA(3);

                    if ( ((LA1_3>=ENTER && LA1_3<=SPACE)||(LA1_3>=A && LA1_3<=Z)) ) {
                        alt1=3;
                    }
                    else if ( (LA1_3==RULE_STRING) ) {
                        alt1=5;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case Clicked:
                    {
                    alt1=2;
                    }
                    break;
                case Collides:
                    {
                    alt1=4;
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
                    // InternalKlangParser.g:866:2: ( ruleGameStart )
                    {
                    // InternalKlangParser.g:866:2: ( ruleGameStart )
                    // InternalKlangParser.g:867:3: ruleGameStart
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
                    // InternalKlangParser.g:872:2: ( ruleSpriteClicked )
                    {
                    // InternalKlangParser.g:872:2: ( ruleSpriteClicked )
                    // InternalKlangParser.g:873:3: ruleSpriteClicked
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
                    // InternalKlangParser.g:878:2: ( ruleKeyPressed )
                    {
                    // InternalKlangParser.g:878:2: ( ruleKeyPressed )
                    // InternalKlangParser.g:879:3: ruleKeyPressed
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
                    // InternalKlangParser.g:884:2: ( ruleCollidesWith )
                    {
                    // InternalKlangParser.g:884:2: ( ruleCollidesWith )
                    // InternalKlangParser.g:885:3: ruleCollidesWith
                    {
                     before(grammarAccess.getEventHandlerAccess().getCollidesWithParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCollidesWith();

                    state._fsp--;

                     after(grammarAccess.getEventHandlerAccess().getCollidesWithParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalKlangParser.g:890:2: ( ruleMessageReceived )
                    {
                    // InternalKlangParser.g:890:2: ( ruleMessageReceived )
                    // InternalKlangParser.g:891:3: ruleMessageReceived
                    {
                     before(grammarAccess.getEventHandlerAccess().getMessageReceivedParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleMessageReceived();

                    state._fsp--;

                     after(grammarAccess.getEventHandlerAccess().getMessageReceivedParserRuleCall_4()); 

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
    // InternalKlangParser.g:900:1: rule__Statement__Alternatives : ( ( ruleWhileLoop ) | ( ruleIf ) | ( ruleVariableAssignment ) | ( ruleForeverLoop ) | ( ruleFunctionCall ) | ( ruleSleep ) | ( ruleSendMessage ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:904:1: ( ( ruleWhileLoop ) | ( ruleIf ) | ( ruleVariableAssignment ) | ( ruleForeverLoop ) | ( ruleFunctionCall ) | ( ruleSleep ) | ( ruleSendMessage ) )
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

                if ( (LA2_3==EqualsSign) ) {
                    alt2=3;
                }
                else if ( (LA2_3==LeftParenthesis) ) {
                    alt2=5;
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
                    // InternalKlangParser.g:905:2: ( ruleWhileLoop )
                    {
                    // InternalKlangParser.g:905:2: ( ruleWhileLoop )
                    // InternalKlangParser.g:906:3: ruleWhileLoop
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
                    // InternalKlangParser.g:911:2: ( ruleIf )
                    {
                    // InternalKlangParser.g:911:2: ( ruleIf )
                    // InternalKlangParser.g:912:3: ruleIf
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
                    // InternalKlangParser.g:917:2: ( ruleVariableAssignment )
                    {
                    // InternalKlangParser.g:917:2: ( ruleVariableAssignment )
                    // InternalKlangParser.g:918:3: ruleVariableAssignment
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
                    // InternalKlangParser.g:923:2: ( ruleForeverLoop )
                    {
                    // InternalKlangParser.g:923:2: ( ruleForeverLoop )
                    // InternalKlangParser.g:924:3: ruleForeverLoop
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
                    // InternalKlangParser.g:929:2: ( ruleFunctionCall )
                    {
                    // InternalKlangParser.g:929:2: ( ruleFunctionCall )
                    // InternalKlangParser.g:930:3: ruleFunctionCall
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
                    // InternalKlangParser.g:935:2: ( ruleSleep )
                    {
                    // InternalKlangParser.g:935:2: ( ruleSleep )
                    // InternalKlangParser.g:936:3: ruleSleep
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
                    // InternalKlangParser.g:941:2: ( ruleSendMessage )
                    {
                    // InternalKlangParser.g:941:2: ( ruleSendMessage )
                    // InternalKlangParser.g:942:3: ruleSendMessage
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
    // InternalKlangParser.g:951:1: rule__Comparison__Alternatives_1_0 : ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) | ( ( rule__Comparison__Group_1_0_2__0 ) ) );
    public final void rule__Comparison__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:955:1: ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) | ( ( rule__Comparison__Group_1_0_2__0 ) ) )
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
                    // InternalKlangParser.g:956:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    {
                    // InternalKlangParser.g:956:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    // InternalKlangParser.g:957:3: ( rule__Comparison__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0_0()); 
                    // InternalKlangParser.g:958:3: ( rule__Comparison__Group_1_0_0__0 )
                    // InternalKlangParser.g:958:4: rule__Comparison__Group_1_0_0__0
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
                    // InternalKlangParser.g:962:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    {
                    // InternalKlangParser.g:962:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    // InternalKlangParser.g:963:3: ( rule__Comparison__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0_1()); 
                    // InternalKlangParser.g:964:3: ( rule__Comparison__Group_1_0_1__0 )
                    // InternalKlangParser.g:964:4: rule__Comparison__Group_1_0_1__0
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
                    // InternalKlangParser.g:968:2: ( ( rule__Comparison__Group_1_0_2__0 ) )
                    {
                    // InternalKlangParser.g:968:2: ( ( rule__Comparison__Group_1_0_2__0 ) )
                    // InternalKlangParser.g:969:3: ( rule__Comparison__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0_2()); 
                    // InternalKlangParser.g:970:3: ( rule__Comparison__Group_1_0_2__0 )
                    // InternalKlangParser.g:970:4: rule__Comparison__Group_1_0_2__0
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
    // InternalKlangParser.g:978:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) | ( ruleFunctionCall ) | ( ruleAtomicExpression ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:982:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) | ( ruleFunctionCall ) | ( ruleAtomicExpression ) )
            int alt4=7;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalKlangParser.g:983:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // InternalKlangParser.g:983:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // InternalKlangParser.g:984:3: ( rule__PrimaryExpression__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    // InternalKlangParser.g:985:3: ( rule__PrimaryExpression__Group_0__0 )
                    // InternalKlangParser.g:985:4: rule__PrimaryExpression__Group_0__0
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
                    // InternalKlangParser.g:989:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    {
                    // InternalKlangParser.g:989:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    // InternalKlangParser.g:990:3: ( rule__PrimaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
                    // InternalKlangParser.g:991:3: ( rule__PrimaryExpression__Group_1__0 )
                    // InternalKlangParser.g:991:4: rule__PrimaryExpression__Group_1__0
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
                    // InternalKlangParser.g:995:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    {
                    // InternalKlangParser.g:995:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    // InternalKlangParser.g:996:3: ( rule__PrimaryExpression__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    // InternalKlangParser.g:997:3: ( rule__PrimaryExpression__Group_2__0 )
                    // InternalKlangParser.g:997:4: rule__PrimaryExpression__Group_2__0
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
                    // InternalKlangParser.g:1001:2: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    {
                    // InternalKlangParser.g:1001:2: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    // InternalKlangParser.g:1002:3: ( rule__PrimaryExpression__Group_3__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_3()); 
                    // InternalKlangParser.g:1003:3: ( rule__PrimaryExpression__Group_3__0 )
                    // InternalKlangParser.g:1003:4: rule__PrimaryExpression__Group_3__0
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
                    // InternalKlangParser.g:1007:2: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    {
                    // InternalKlangParser.g:1007:2: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    // InternalKlangParser.g:1008:3: ( rule__PrimaryExpression__Group_4__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_4()); 
                    // InternalKlangParser.g:1009:3: ( rule__PrimaryExpression__Group_4__0 )
                    // InternalKlangParser.g:1009:4: rule__PrimaryExpression__Group_4__0
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
                    // InternalKlangParser.g:1013:2: ( ruleFunctionCall )
                    {
                    // InternalKlangParser.g:1013:2: ( ruleFunctionCall )
                    // InternalKlangParser.g:1014:3: ruleFunctionCall
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
                    // InternalKlangParser.g:1019:2: ( ruleAtomicExpression )
                    {
                    // InternalKlangParser.g:1019:2: ( ruleAtomicExpression )
                    // InternalKlangParser.g:1020:3: ruleAtomicExpression
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
    // InternalKlangParser.g:1029:1: rule__AtomicExpression__Alternatives : ( ( ( rule__AtomicExpression__Group_0__0 ) ) | ( ( rule__AtomicExpression__Group_1__0 ) ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) | ( ( rule__AtomicExpression__Group_4__0 ) ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1033:1: ( ( ( rule__AtomicExpression__Group_0__0 ) ) | ( ( rule__AtomicExpression__Group_1__0 ) ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) | ( ( rule__AtomicExpression__Group_4__0 ) ) )
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

                if ( (LA5_2==EOF||LA5_2==SendMessage||LA5_2==Forever||(LA5_2>=Sleep && LA5_2<=While)||LA5_2==When||LA5_2==And||(LA5_2>=Var && LA5_2<=Or)||(LA5_2>=RightParenthesis && LA5_2<=HyphenMinus)||(LA5_2>=Solidus && LA5_2<=LessThanSign)||LA5_2==GreaterThanSign||(LA5_2>=RULE_BEGIN && LA5_2<=RULE_ID)) ) {
                    alt5=3;
                }
                else if ( (LA5_2==FullStop) ) {
                    alt5=2;
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
                    // InternalKlangParser.g:1034:2: ( ( rule__AtomicExpression__Group_0__0 ) )
                    {
                    // InternalKlangParser.g:1034:2: ( ( rule__AtomicExpression__Group_0__0 ) )
                    // InternalKlangParser.g:1035:3: ( rule__AtomicExpression__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getGroup_0()); 
                    // InternalKlangParser.g:1036:3: ( rule__AtomicExpression__Group_0__0 )
                    // InternalKlangParser.g:1036:4: rule__AtomicExpression__Group_0__0
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
                    // InternalKlangParser.g:1040:2: ( ( rule__AtomicExpression__Group_1__0 ) )
                    {
                    // InternalKlangParser.g:1040:2: ( ( rule__AtomicExpression__Group_1__0 ) )
                    // InternalKlangParser.g:1041:3: ( rule__AtomicExpression__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getGroup_1()); 
                    // InternalKlangParser.g:1042:3: ( rule__AtomicExpression__Group_1__0 )
                    // InternalKlangParser.g:1042:4: rule__AtomicExpression__Group_1__0
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
                    // InternalKlangParser.g:1046:2: ( ( rule__AtomicExpression__Group_2__0 ) )
                    {
                    // InternalKlangParser.g:1046:2: ( ( rule__AtomicExpression__Group_2__0 ) )
                    // InternalKlangParser.g:1047:3: ( rule__AtomicExpression__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getGroup_2()); 
                    // InternalKlangParser.g:1048:3: ( rule__AtomicExpression__Group_2__0 )
                    // InternalKlangParser.g:1048:4: rule__AtomicExpression__Group_2__0
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
                    // InternalKlangParser.g:1052:2: ( ( rule__AtomicExpression__Group_3__0 ) )
                    {
                    // InternalKlangParser.g:1052:2: ( ( rule__AtomicExpression__Group_3__0 ) )
                    // InternalKlangParser.g:1053:3: ( rule__AtomicExpression__Group_3__0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getGroup_3()); 
                    // InternalKlangParser.g:1054:3: ( rule__AtomicExpression__Group_3__0 )
                    // InternalKlangParser.g:1054:4: rule__AtomicExpression__Group_3__0
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
                    // InternalKlangParser.g:1058:2: ( ( rule__AtomicExpression__Group_4__0 ) )
                    {
                    // InternalKlangParser.g:1058:2: ( ( rule__AtomicExpression__Group_4__0 ) )
                    // InternalKlangParser.g:1059:3: ( rule__AtomicExpression__Group_4__0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getGroup_4()); 
                    // InternalKlangParser.g:1060:3: ( rule__AtomicExpression__Group_4__0 )
                    // InternalKlangParser.g:1060:4: rule__AtomicExpression__Group_4__0
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
    // InternalKlangParser.g:1068:1: rule__AtomicExpression__Alternatives_0_1 : ( ( ( rule__AtomicExpression__ValueAssignment_0_1_0 ) ) | ( False ) );
    public final void rule__AtomicExpression__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1072:1: ( ( ( rule__AtomicExpression__ValueAssignment_0_1_0 ) ) | ( False ) )
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
                    // InternalKlangParser.g:1073:2: ( ( rule__AtomicExpression__ValueAssignment_0_1_0 ) )
                    {
                    // InternalKlangParser.g:1073:2: ( ( rule__AtomicExpression__ValueAssignment_0_1_0 ) )
                    // InternalKlangParser.g:1074:3: ( rule__AtomicExpression__ValueAssignment_0_1_0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getValueAssignment_0_1_0()); 
                    // InternalKlangParser.g:1075:3: ( rule__AtomicExpression__ValueAssignment_0_1_0 )
                    // InternalKlangParser.g:1075:4: rule__AtomicExpression__ValueAssignment_0_1_0
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
                    // InternalKlangParser.g:1079:2: ( False )
                    {
                    // InternalKlangParser.g:1079:2: ( False )
                    // InternalKlangParser.g:1080:3: False
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
    // InternalKlangParser.g:1089:1: rule__Keys__Alternatives : ( ( ( A ) ) | ( ( B ) ) | ( ( C ) ) | ( ( D ) ) | ( ( E ) ) | ( ( F ) ) | ( ( G ) ) | ( ( H ) ) | ( ( I ) ) | ( ( J ) ) | ( ( K ) ) | ( ( L ) ) | ( ( M ) ) | ( ( N ) ) | ( ( O ) ) | ( ( P ) ) | ( ( Q ) ) | ( ( R ) ) | ( ( S ) ) | ( ( T ) ) | ( ( U ) ) | ( ( V ) ) | ( ( W ) ) | ( ( X ) ) | ( ( Y ) ) | ( ( Z ) ) | ( ( SPACE ) ) | ( ( ENTER ) ) );
    public final void rule__Keys__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1093:1: ( ( ( A ) ) | ( ( B ) ) | ( ( C ) ) | ( ( D ) ) | ( ( E ) ) | ( ( F ) ) | ( ( G ) ) | ( ( H ) ) | ( ( I ) ) | ( ( J ) ) | ( ( K ) ) | ( ( L ) ) | ( ( M ) ) | ( ( N ) ) | ( ( O ) ) | ( ( P ) ) | ( ( Q ) ) | ( ( R ) ) | ( ( S ) ) | ( ( T ) ) | ( ( U ) ) | ( ( V ) ) | ( ( W ) ) | ( ( X ) ) | ( ( Y ) ) | ( ( Z ) ) | ( ( SPACE ) ) | ( ( ENTER ) ) )
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
                    // InternalKlangParser.g:1094:2: ( ( A ) )
                    {
                    // InternalKlangParser.g:1094:2: ( ( A ) )
                    // InternalKlangParser.g:1095:3: ( A )
                    {
                     before(grammarAccess.getKeysAccess().getAEnumLiteralDeclaration_0()); 
                    // InternalKlangParser.g:1096:3: ( A )
                    // InternalKlangParser.g:1096:4: A
                    {
                    match(input,A,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKlangParser.g:1100:2: ( ( B ) )
                    {
                    // InternalKlangParser.g:1100:2: ( ( B ) )
                    // InternalKlangParser.g:1101:3: ( B )
                    {
                     before(grammarAccess.getKeysAccess().getBEnumLiteralDeclaration_1()); 
                    // InternalKlangParser.g:1102:3: ( B )
                    // InternalKlangParser.g:1102:4: B
                    {
                    match(input,B,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getBEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKlangParser.g:1106:2: ( ( C ) )
                    {
                    // InternalKlangParser.g:1106:2: ( ( C ) )
                    // InternalKlangParser.g:1107:3: ( C )
                    {
                     before(grammarAccess.getKeysAccess().getCEnumLiteralDeclaration_2()); 
                    // InternalKlangParser.g:1108:3: ( C )
                    // InternalKlangParser.g:1108:4: C
                    {
                    match(input,C,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getCEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalKlangParser.g:1112:2: ( ( D ) )
                    {
                    // InternalKlangParser.g:1112:2: ( ( D ) )
                    // InternalKlangParser.g:1113:3: ( D )
                    {
                     before(grammarAccess.getKeysAccess().getDEnumLiteralDeclaration_3()); 
                    // InternalKlangParser.g:1114:3: ( D )
                    // InternalKlangParser.g:1114:4: D
                    {
                    match(input,D,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalKlangParser.g:1118:2: ( ( E ) )
                    {
                    // InternalKlangParser.g:1118:2: ( ( E ) )
                    // InternalKlangParser.g:1119:3: ( E )
                    {
                     before(grammarAccess.getKeysAccess().getEEnumLiteralDeclaration_4()); 
                    // InternalKlangParser.g:1120:3: ( E )
                    // InternalKlangParser.g:1120:4: E
                    {
                    match(input,E,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalKlangParser.g:1124:2: ( ( F ) )
                    {
                    // InternalKlangParser.g:1124:2: ( ( F ) )
                    // InternalKlangParser.g:1125:3: ( F )
                    {
                     before(grammarAccess.getKeysAccess().getFEnumLiteralDeclaration_5()); 
                    // InternalKlangParser.g:1126:3: ( F )
                    // InternalKlangParser.g:1126:4: F
                    {
                    match(input,F,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getFEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalKlangParser.g:1130:2: ( ( G ) )
                    {
                    // InternalKlangParser.g:1130:2: ( ( G ) )
                    // InternalKlangParser.g:1131:3: ( G )
                    {
                     before(grammarAccess.getKeysAccess().getGEnumLiteralDeclaration_6()); 
                    // InternalKlangParser.g:1132:3: ( G )
                    // InternalKlangParser.g:1132:4: G
                    {
                    match(input,G,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getGEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalKlangParser.g:1136:2: ( ( H ) )
                    {
                    // InternalKlangParser.g:1136:2: ( ( H ) )
                    // InternalKlangParser.g:1137:3: ( H )
                    {
                     before(grammarAccess.getKeysAccess().getHEnumLiteralDeclaration_7()); 
                    // InternalKlangParser.g:1138:3: ( H )
                    // InternalKlangParser.g:1138:4: H
                    {
                    match(input,H,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getHEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalKlangParser.g:1142:2: ( ( I ) )
                    {
                    // InternalKlangParser.g:1142:2: ( ( I ) )
                    // InternalKlangParser.g:1143:3: ( I )
                    {
                     before(grammarAccess.getKeysAccess().getIEnumLiteralDeclaration_8()); 
                    // InternalKlangParser.g:1144:3: ( I )
                    // InternalKlangParser.g:1144:4: I
                    {
                    match(input,I,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getIEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalKlangParser.g:1148:2: ( ( J ) )
                    {
                    // InternalKlangParser.g:1148:2: ( ( J ) )
                    // InternalKlangParser.g:1149:3: ( J )
                    {
                     before(grammarAccess.getKeysAccess().getJEnumLiteralDeclaration_9()); 
                    // InternalKlangParser.g:1150:3: ( J )
                    // InternalKlangParser.g:1150:4: J
                    {
                    match(input,J,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getJEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalKlangParser.g:1154:2: ( ( K ) )
                    {
                    // InternalKlangParser.g:1154:2: ( ( K ) )
                    // InternalKlangParser.g:1155:3: ( K )
                    {
                     before(grammarAccess.getKeysAccess().getKEnumLiteralDeclaration_10()); 
                    // InternalKlangParser.g:1156:3: ( K )
                    // InternalKlangParser.g:1156:4: K
                    {
                    match(input,K,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getKEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalKlangParser.g:1160:2: ( ( L ) )
                    {
                    // InternalKlangParser.g:1160:2: ( ( L ) )
                    // InternalKlangParser.g:1161:3: ( L )
                    {
                     before(grammarAccess.getKeysAccess().getLEnumLiteralDeclaration_11()); 
                    // InternalKlangParser.g:1162:3: ( L )
                    // InternalKlangParser.g:1162:4: L
                    {
                    match(input,L,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getLEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalKlangParser.g:1166:2: ( ( M ) )
                    {
                    // InternalKlangParser.g:1166:2: ( ( M ) )
                    // InternalKlangParser.g:1167:3: ( M )
                    {
                     before(grammarAccess.getKeysAccess().getMEnumLiteralDeclaration_12()); 
                    // InternalKlangParser.g:1168:3: ( M )
                    // InternalKlangParser.g:1168:4: M
                    {
                    match(input,M,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getMEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalKlangParser.g:1172:2: ( ( N ) )
                    {
                    // InternalKlangParser.g:1172:2: ( ( N ) )
                    // InternalKlangParser.g:1173:3: ( N )
                    {
                     before(grammarAccess.getKeysAccess().getNEnumLiteralDeclaration_13()); 
                    // InternalKlangParser.g:1174:3: ( N )
                    // InternalKlangParser.g:1174:4: N
                    {
                    match(input,N,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getNEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalKlangParser.g:1178:2: ( ( O ) )
                    {
                    // InternalKlangParser.g:1178:2: ( ( O ) )
                    // InternalKlangParser.g:1179:3: ( O )
                    {
                     before(grammarAccess.getKeysAccess().getOEnumLiteralDeclaration_14()); 
                    // InternalKlangParser.g:1180:3: ( O )
                    // InternalKlangParser.g:1180:4: O
                    {
                    match(input,O,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getOEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalKlangParser.g:1184:2: ( ( P ) )
                    {
                    // InternalKlangParser.g:1184:2: ( ( P ) )
                    // InternalKlangParser.g:1185:3: ( P )
                    {
                     before(grammarAccess.getKeysAccess().getPEnumLiteralDeclaration_15()); 
                    // InternalKlangParser.g:1186:3: ( P )
                    // InternalKlangParser.g:1186:4: P
                    {
                    match(input,P,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getPEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalKlangParser.g:1190:2: ( ( Q ) )
                    {
                    // InternalKlangParser.g:1190:2: ( ( Q ) )
                    // InternalKlangParser.g:1191:3: ( Q )
                    {
                     before(grammarAccess.getKeysAccess().getQEnumLiteralDeclaration_16()); 
                    // InternalKlangParser.g:1192:3: ( Q )
                    // InternalKlangParser.g:1192:4: Q
                    {
                    match(input,Q,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getQEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalKlangParser.g:1196:2: ( ( R ) )
                    {
                    // InternalKlangParser.g:1196:2: ( ( R ) )
                    // InternalKlangParser.g:1197:3: ( R )
                    {
                     before(grammarAccess.getKeysAccess().getREnumLiteralDeclaration_17()); 
                    // InternalKlangParser.g:1198:3: ( R )
                    // InternalKlangParser.g:1198:4: R
                    {
                    match(input,R,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getREnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalKlangParser.g:1202:2: ( ( S ) )
                    {
                    // InternalKlangParser.g:1202:2: ( ( S ) )
                    // InternalKlangParser.g:1203:3: ( S )
                    {
                     before(grammarAccess.getKeysAccess().getSEnumLiteralDeclaration_18()); 
                    // InternalKlangParser.g:1204:3: ( S )
                    // InternalKlangParser.g:1204:4: S
                    {
                    match(input,S,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getSEnumLiteralDeclaration_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalKlangParser.g:1208:2: ( ( T ) )
                    {
                    // InternalKlangParser.g:1208:2: ( ( T ) )
                    // InternalKlangParser.g:1209:3: ( T )
                    {
                     before(grammarAccess.getKeysAccess().getTEnumLiteralDeclaration_19()); 
                    // InternalKlangParser.g:1210:3: ( T )
                    // InternalKlangParser.g:1210:4: T
                    {
                    match(input,T,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getTEnumLiteralDeclaration_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalKlangParser.g:1214:2: ( ( U ) )
                    {
                    // InternalKlangParser.g:1214:2: ( ( U ) )
                    // InternalKlangParser.g:1215:3: ( U )
                    {
                     before(grammarAccess.getKeysAccess().getUEnumLiteralDeclaration_20()); 
                    // InternalKlangParser.g:1216:3: ( U )
                    // InternalKlangParser.g:1216:4: U
                    {
                    match(input,U,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getUEnumLiteralDeclaration_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalKlangParser.g:1220:2: ( ( V ) )
                    {
                    // InternalKlangParser.g:1220:2: ( ( V ) )
                    // InternalKlangParser.g:1221:3: ( V )
                    {
                     before(grammarAccess.getKeysAccess().getVEnumLiteralDeclaration_21()); 
                    // InternalKlangParser.g:1222:3: ( V )
                    // InternalKlangParser.g:1222:4: V
                    {
                    match(input,V,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getVEnumLiteralDeclaration_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalKlangParser.g:1226:2: ( ( W ) )
                    {
                    // InternalKlangParser.g:1226:2: ( ( W ) )
                    // InternalKlangParser.g:1227:3: ( W )
                    {
                     before(grammarAccess.getKeysAccess().getWEnumLiteralDeclaration_22()); 
                    // InternalKlangParser.g:1228:3: ( W )
                    // InternalKlangParser.g:1228:4: W
                    {
                    match(input,W,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getWEnumLiteralDeclaration_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalKlangParser.g:1232:2: ( ( X ) )
                    {
                    // InternalKlangParser.g:1232:2: ( ( X ) )
                    // InternalKlangParser.g:1233:3: ( X )
                    {
                     before(grammarAccess.getKeysAccess().getXEnumLiteralDeclaration_23()); 
                    // InternalKlangParser.g:1234:3: ( X )
                    // InternalKlangParser.g:1234:4: X
                    {
                    match(input,X,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getXEnumLiteralDeclaration_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalKlangParser.g:1238:2: ( ( Y ) )
                    {
                    // InternalKlangParser.g:1238:2: ( ( Y ) )
                    // InternalKlangParser.g:1239:3: ( Y )
                    {
                     before(grammarAccess.getKeysAccess().getYEnumLiteralDeclaration_24()); 
                    // InternalKlangParser.g:1240:3: ( Y )
                    // InternalKlangParser.g:1240:4: Y
                    {
                    match(input,Y,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getYEnumLiteralDeclaration_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalKlangParser.g:1244:2: ( ( Z ) )
                    {
                    // InternalKlangParser.g:1244:2: ( ( Z ) )
                    // InternalKlangParser.g:1245:3: ( Z )
                    {
                     before(grammarAccess.getKeysAccess().getZEnumLiteralDeclaration_25()); 
                    // InternalKlangParser.g:1246:3: ( Z )
                    // InternalKlangParser.g:1246:4: Z
                    {
                    match(input,Z,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getZEnumLiteralDeclaration_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalKlangParser.g:1250:2: ( ( SPACE ) )
                    {
                    // InternalKlangParser.g:1250:2: ( ( SPACE ) )
                    // InternalKlangParser.g:1251:3: ( SPACE )
                    {
                     before(grammarAccess.getKeysAccess().getSPACEEnumLiteralDeclaration_26()); 
                    // InternalKlangParser.g:1252:3: ( SPACE )
                    // InternalKlangParser.g:1252:4: SPACE
                    {
                    match(input,SPACE,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeysAccess().getSPACEEnumLiteralDeclaration_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalKlangParser.g:1256:2: ( ( ENTER ) )
                    {
                    // InternalKlangParser.g:1256:2: ( ( ENTER ) )
                    // InternalKlangParser.g:1257:3: ( ENTER )
                    {
                     before(grammarAccess.getKeysAccess().getENTEREnumLiteralDeclaration_27()); 
                    // InternalKlangParser.g:1258:3: ( ENTER )
                    // InternalKlangParser.g:1258:4: ENTER
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
    // InternalKlangParser.g:1266:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1270:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalKlangParser.g:1271:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalKlangParser.g:1278:1: rule__Program__Group__0__Impl : ( ( rule__Program__SceneActorAssignment_0 ) ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1282:1: ( ( ( rule__Program__SceneActorAssignment_0 ) ) )
            // InternalKlangParser.g:1283:1: ( ( rule__Program__SceneActorAssignment_0 ) )
            {
            // InternalKlangParser.g:1283:1: ( ( rule__Program__SceneActorAssignment_0 ) )
            // InternalKlangParser.g:1284:2: ( rule__Program__SceneActorAssignment_0 )
            {
             before(grammarAccess.getProgramAccess().getSceneActorAssignment_0()); 
            // InternalKlangParser.g:1285:2: ( rule__Program__SceneActorAssignment_0 )
            // InternalKlangParser.g:1285:3: rule__Program__SceneActorAssignment_0
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
    // InternalKlangParser.g:1293:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1297:1: ( rule__Program__Group__1__Impl )
            // InternalKlangParser.g:1298:2: rule__Program__Group__1__Impl
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
    // InternalKlangParser.g:1304:1: rule__Program__Group__1__Impl : ( ( rule__Program__SpriteActorsAssignment_1 )* ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1308:1: ( ( ( rule__Program__SpriteActorsAssignment_1 )* ) )
            // InternalKlangParser.g:1309:1: ( ( rule__Program__SpriteActorsAssignment_1 )* )
            {
            // InternalKlangParser.g:1309:1: ( ( rule__Program__SpriteActorsAssignment_1 )* )
            // InternalKlangParser.g:1310:2: ( rule__Program__SpriteActorsAssignment_1 )*
            {
             before(grammarAccess.getProgramAccess().getSpriteActorsAssignment_1()); 
            // InternalKlangParser.g:1311:2: ( rule__Program__SpriteActorsAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Sprite) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKlangParser.g:1311:3: rule__Program__SpriteActorsAssignment_1
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
    // InternalKlangParser.g:1320:1: rule__SceneActor__Group__0 : rule__SceneActor__Group__0__Impl rule__SceneActor__Group__1 ;
    public final void rule__SceneActor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1324:1: ( rule__SceneActor__Group__0__Impl rule__SceneActor__Group__1 )
            // InternalKlangParser.g:1325:2: rule__SceneActor__Group__0__Impl rule__SceneActor__Group__1
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
    // InternalKlangParser.g:1332:1: rule__SceneActor__Group__0__Impl : ( () ) ;
    public final void rule__SceneActor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1336:1: ( ( () ) )
            // InternalKlangParser.g:1337:1: ( () )
            {
            // InternalKlangParser.g:1337:1: ( () )
            // InternalKlangParser.g:1338:2: ()
            {
             before(grammarAccess.getSceneActorAccess().getSceneActorAction_0()); 
            // InternalKlangParser.g:1339:2: ()
            // InternalKlangParser.g:1339:3: 
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
    // InternalKlangParser.g:1347:1: rule__SceneActor__Group__1 : rule__SceneActor__Group__1__Impl rule__SceneActor__Group__2 ;
    public final void rule__SceneActor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1351:1: ( rule__SceneActor__Group__1__Impl rule__SceneActor__Group__2 )
            // InternalKlangParser.g:1352:2: rule__SceneActor__Group__1__Impl rule__SceneActor__Group__2
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
    // InternalKlangParser.g:1359:1: rule__SceneActor__Group__1__Impl : ( Scene ) ;
    public final void rule__SceneActor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1363:1: ( ( Scene ) )
            // InternalKlangParser.g:1364:1: ( Scene )
            {
            // InternalKlangParser.g:1364:1: ( Scene )
            // InternalKlangParser.g:1365:2: Scene
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
    // InternalKlangParser.g:1374:1: rule__SceneActor__Group__2 : rule__SceneActor__Group__2__Impl rule__SceneActor__Group__3 ;
    public final void rule__SceneActor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1378:1: ( rule__SceneActor__Group__2__Impl rule__SceneActor__Group__3 )
            // InternalKlangParser.g:1379:2: rule__SceneActor__Group__2__Impl rule__SceneActor__Group__3
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
    // InternalKlangParser.g:1386:1: rule__SceneActor__Group__2__Impl : ( ( rule__SceneActor__NameAssignment_2 ) ) ;
    public final void rule__SceneActor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1390:1: ( ( ( rule__SceneActor__NameAssignment_2 ) ) )
            // InternalKlangParser.g:1391:1: ( ( rule__SceneActor__NameAssignment_2 ) )
            {
            // InternalKlangParser.g:1391:1: ( ( rule__SceneActor__NameAssignment_2 ) )
            // InternalKlangParser.g:1392:2: ( rule__SceneActor__NameAssignment_2 )
            {
             before(grammarAccess.getSceneActorAccess().getNameAssignment_2()); 
            // InternalKlangParser.g:1393:2: ( rule__SceneActor__NameAssignment_2 )
            // InternalKlangParser.g:1393:3: rule__SceneActor__NameAssignment_2
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
    // InternalKlangParser.g:1401:1: rule__SceneActor__Group__3 : rule__SceneActor__Group__3__Impl ;
    public final void rule__SceneActor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1405:1: ( rule__SceneActor__Group__3__Impl )
            // InternalKlangParser.g:1406:2: rule__SceneActor__Group__3__Impl
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
    // InternalKlangParser.g:1412:1: rule__SceneActor__Group__3__Impl : ( ( rule__SceneActor__Group_3__0 )? ) ;
    public final void rule__SceneActor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1416:1: ( ( ( rule__SceneActor__Group_3__0 )? ) )
            // InternalKlangParser.g:1417:1: ( ( rule__SceneActor__Group_3__0 )? )
            {
            // InternalKlangParser.g:1417:1: ( ( rule__SceneActor__Group_3__0 )? )
            // InternalKlangParser.g:1418:2: ( rule__SceneActor__Group_3__0 )?
            {
             before(grammarAccess.getSceneActorAccess().getGroup_3()); 
            // InternalKlangParser.g:1419:2: ( rule__SceneActor__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_BEGIN) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalKlangParser.g:1419:3: rule__SceneActor__Group_3__0
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
    // InternalKlangParser.g:1428:1: rule__SceneActor__Group_3__0 : rule__SceneActor__Group_3__0__Impl rule__SceneActor__Group_3__1 ;
    public final void rule__SceneActor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1432:1: ( rule__SceneActor__Group_3__0__Impl rule__SceneActor__Group_3__1 )
            // InternalKlangParser.g:1433:2: rule__SceneActor__Group_3__0__Impl rule__SceneActor__Group_3__1
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
    // InternalKlangParser.g:1440:1: rule__SceneActor__Group_3__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__SceneActor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1444:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:1445:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:1445:1: ( RULE_BEGIN )
            // InternalKlangParser.g:1446:2: RULE_BEGIN
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
    // InternalKlangParser.g:1455:1: rule__SceneActor__Group_3__1 : rule__SceneActor__Group_3__1__Impl rule__SceneActor__Group_3__2 ;
    public final void rule__SceneActor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1459:1: ( rule__SceneActor__Group_3__1__Impl rule__SceneActor__Group_3__2 )
            // InternalKlangParser.g:1460:2: rule__SceneActor__Group_3__1__Impl rule__SceneActor__Group_3__2
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
    // InternalKlangParser.g:1467:1: rule__SceneActor__Group_3__1__Impl : ( ( rule__SceneActor__LocalVariablesAssignment_3_1 )* ) ;
    public final void rule__SceneActor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1471:1: ( ( ( rule__SceneActor__LocalVariablesAssignment_3_1 )* ) )
            // InternalKlangParser.g:1472:1: ( ( rule__SceneActor__LocalVariablesAssignment_3_1 )* )
            {
            // InternalKlangParser.g:1472:1: ( ( rule__SceneActor__LocalVariablesAssignment_3_1 )* )
            // InternalKlangParser.g:1473:2: ( rule__SceneActor__LocalVariablesAssignment_3_1 )*
            {
             before(grammarAccess.getSceneActorAccess().getLocalVariablesAssignment_3_1()); 
            // InternalKlangParser.g:1474:2: ( rule__SceneActor__LocalVariablesAssignment_3_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Var) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalKlangParser.g:1474:3: rule__SceneActor__LocalVariablesAssignment_3_1
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
    // InternalKlangParser.g:1482:1: rule__SceneActor__Group_3__2 : rule__SceneActor__Group_3__2__Impl rule__SceneActor__Group_3__3 ;
    public final void rule__SceneActor__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1486:1: ( rule__SceneActor__Group_3__2__Impl rule__SceneActor__Group_3__3 )
            // InternalKlangParser.g:1487:2: rule__SceneActor__Group_3__2__Impl rule__SceneActor__Group_3__3
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
    // InternalKlangParser.g:1494:1: rule__SceneActor__Group_3__2__Impl : ( ( rule__SceneActor__EventHandlersAssignment_3_2 )* ) ;
    public final void rule__SceneActor__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1498:1: ( ( ( rule__SceneActor__EventHandlersAssignment_3_2 )* ) )
            // InternalKlangParser.g:1499:1: ( ( rule__SceneActor__EventHandlersAssignment_3_2 )* )
            {
            // InternalKlangParser.g:1499:1: ( ( rule__SceneActor__EventHandlersAssignment_3_2 )* )
            // InternalKlangParser.g:1500:2: ( rule__SceneActor__EventHandlersAssignment_3_2 )*
            {
             before(grammarAccess.getSceneActorAccess().getEventHandlersAssignment_3_2()); 
            // InternalKlangParser.g:1501:2: ( rule__SceneActor__EventHandlersAssignment_3_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==When) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalKlangParser.g:1501:3: rule__SceneActor__EventHandlersAssignment_3_2
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
    // InternalKlangParser.g:1509:1: rule__SceneActor__Group_3__3 : rule__SceneActor__Group_3__3__Impl ;
    public final void rule__SceneActor__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1513:1: ( rule__SceneActor__Group_3__3__Impl )
            // InternalKlangParser.g:1514:2: rule__SceneActor__Group_3__3__Impl
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
    // InternalKlangParser.g:1520:1: rule__SceneActor__Group_3__3__Impl : ( RULE_END ) ;
    public final void rule__SceneActor__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1524:1: ( ( RULE_END ) )
            // InternalKlangParser.g:1525:1: ( RULE_END )
            {
            // InternalKlangParser.g:1525:1: ( RULE_END )
            // InternalKlangParser.g:1526:2: RULE_END
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
    // InternalKlangParser.g:1536:1: rule__SpriteActor__Group__0 : rule__SpriteActor__Group__0__Impl rule__SpriteActor__Group__1 ;
    public final void rule__SpriteActor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1540:1: ( rule__SpriteActor__Group__0__Impl rule__SpriteActor__Group__1 )
            // InternalKlangParser.g:1541:2: rule__SpriteActor__Group__0__Impl rule__SpriteActor__Group__1
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
    // InternalKlangParser.g:1548:1: rule__SpriteActor__Group__0__Impl : ( () ) ;
    public final void rule__SpriteActor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1552:1: ( ( () ) )
            // InternalKlangParser.g:1553:1: ( () )
            {
            // InternalKlangParser.g:1553:1: ( () )
            // InternalKlangParser.g:1554:2: ()
            {
             before(grammarAccess.getSpriteActorAccess().getSpriteActorAction_0()); 
            // InternalKlangParser.g:1555:2: ()
            // InternalKlangParser.g:1555:3: 
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
    // InternalKlangParser.g:1563:1: rule__SpriteActor__Group__1 : rule__SpriteActor__Group__1__Impl rule__SpriteActor__Group__2 ;
    public final void rule__SpriteActor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1567:1: ( rule__SpriteActor__Group__1__Impl rule__SpriteActor__Group__2 )
            // InternalKlangParser.g:1568:2: rule__SpriteActor__Group__1__Impl rule__SpriteActor__Group__2
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
    // InternalKlangParser.g:1575:1: rule__SpriteActor__Group__1__Impl : ( Sprite ) ;
    public final void rule__SpriteActor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1579:1: ( ( Sprite ) )
            // InternalKlangParser.g:1580:1: ( Sprite )
            {
            // InternalKlangParser.g:1580:1: ( Sprite )
            // InternalKlangParser.g:1581:2: Sprite
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
    // InternalKlangParser.g:1590:1: rule__SpriteActor__Group__2 : rule__SpriteActor__Group__2__Impl rule__SpriteActor__Group__3 ;
    public final void rule__SpriteActor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1594:1: ( rule__SpriteActor__Group__2__Impl rule__SpriteActor__Group__3 )
            // InternalKlangParser.g:1595:2: rule__SpriteActor__Group__2__Impl rule__SpriteActor__Group__3
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
    // InternalKlangParser.g:1602:1: rule__SpriteActor__Group__2__Impl : ( ( rule__SpriteActor__NameAssignment_2 ) ) ;
    public final void rule__SpriteActor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1606:1: ( ( ( rule__SpriteActor__NameAssignment_2 ) ) )
            // InternalKlangParser.g:1607:1: ( ( rule__SpriteActor__NameAssignment_2 ) )
            {
            // InternalKlangParser.g:1607:1: ( ( rule__SpriteActor__NameAssignment_2 ) )
            // InternalKlangParser.g:1608:2: ( rule__SpriteActor__NameAssignment_2 )
            {
             before(grammarAccess.getSpriteActorAccess().getNameAssignment_2()); 
            // InternalKlangParser.g:1609:2: ( rule__SpriteActor__NameAssignment_2 )
            // InternalKlangParser.g:1609:3: rule__SpriteActor__NameAssignment_2
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
    // InternalKlangParser.g:1617:1: rule__SpriteActor__Group__3 : rule__SpriteActor__Group__3__Impl ;
    public final void rule__SpriteActor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1621:1: ( rule__SpriteActor__Group__3__Impl )
            // InternalKlangParser.g:1622:2: rule__SpriteActor__Group__3__Impl
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
    // InternalKlangParser.g:1628:1: rule__SpriteActor__Group__3__Impl : ( ( rule__SpriteActor__Group_3__0 )? ) ;
    public final void rule__SpriteActor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1632:1: ( ( ( rule__SpriteActor__Group_3__0 )? ) )
            // InternalKlangParser.g:1633:1: ( ( rule__SpriteActor__Group_3__0 )? )
            {
            // InternalKlangParser.g:1633:1: ( ( rule__SpriteActor__Group_3__0 )? )
            // InternalKlangParser.g:1634:2: ( rule__SpriteActor__Group_3__0 )?
            {
             before(grammarAccess.getSpriteActorAccess().getGroup_3()); 
            // InternalKlangParser.g:1635:2: ( rule__SpriteActor__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_BEGIN) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalKlangParser.g:1635:3: rule__SpriteActor__Group_3__0
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
    // InternalKlangParser.g:1644:1: rule__SpriteActor__Group_3__0 : rule__SpriteActor__Group_3__0__Impl rule__SpriteActor__Group_3__1 ;
    public final void rule__SpriteActor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1648:1: ( rule__SpriteActor__Group_3__0__Impl rule__SpriteActor__Group_3__1 )
            // InternalKlangParser.g:1649:2: rule__SpriteActor__Group_3__0__Impl rule__SpriteActor__Group_3__1
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
    // InternalKlangParser.g:1656:1: rule__SpriteActor__Group_3__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__SpriteActor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1660:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:1661:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:1661:1: ( RULE_BEGIN )
            // InternalKlangParser.g:1662:2: RULE_BEGIN
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
    // InternalKlangParser.g:1671:1: rule__SpriteActor__Group_3__1 : rule__SpriteActor__Group_3__1__Impl rule__SpriteActor__Group_3__2 ;
    public final void rule__SpriteActor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1675:1: ( rule__SpriteActor__Group_3__1__Impl rule__SpriteActor__Group_3__2 )
            // InternalKlangParser.g:1676:2: rule__SpriteActor__Group_3__1__Impl rule__SpriteActor__Group_3__2
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
    // InternalKlangParser.g:1683:1: rule__SpriteActor__Group_3__1__Impl : ( ( rule__SpriteActor__LocalVariablesAssignment_3_1 )* ) ;
    public final void rule__SpriteActor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1687:1: ( ( ( rule__SpriteActor__LocalVariablesAssignment_3_1 )* ) )
            // InternalKlangParser.g:1688:1: ( ( rule__SpriteActor__LocalVariablesAssignment_3_1 )* )
            {
            // InternalKlangParser.g:1688:1: ( ( rule__SpriteActor__LocalVariablesAssignment_3_1 )* )
            // InternalKlangParser.g:1689:2: ( rule__SpriteActor__LocalVariablesAssignment_3_1 )*
            {
             before(grammarAccess.getSpriteActorAccess().getLocalVariablesAssignment_3_1()); 
            // InternalKlangParser.g:1690:2: ( rule__SpriteActor__LocalVariablesAssignment_3_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Var) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalKlangParser.g:1690:3: rule__SpriteActor__LocalVariablesAssignment_3_1
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
    // InternalKlangParser.g:1698:1: rule__SpriteActor__Group_3__2 : rule__SpriteActor__Group_3__2__Impl rule__SpriteActor__Group_3__3 ;
    public final void rule__SpriteActor__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1702:1: ( rule__SpriteActor__Group_3__2__Impl rule__SpriteActor__Group_3__3 )
            // InternalKlangParser.g:1703:2: rule__SpriteActor__Group_3__2__Impl rule__SpriteActor__Group_3__3
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
    // InternalKlangParser.g:1710:1: rule__SpriteActor__Group_3__2__Impl : ( ( rule__SpriteActor__EventHandlersAssignment_3_2 )* ) ;
    public final void rule__SpriteActor__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1714:1: ( ( ( rule__SpriteActor__EventHandlersAssignment_3_2 )* ) )
            // InternalKlangParser.g:1715:1: ( ( rule__SpriteActor__EventHandlersAssignment_3_2 )* )
            {
            // InternalKlangParser.g:1715:1: ( ( rule__SpriteActor__EventHandlersAssignment_3_2 )* )
            // InternalKlangParser.g:1716:2: ( rule__SpriteActor__EventHandlersAssignment_3_2 )*
            {
             before(grammarAccess.getSpriteActorAccess().getEventHandlersAssignment_3_2()); 
            // InternalKlangParser.g:1717:2: ( rule__SpriteActor__EventHandlersAssignment_3_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==When) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalKlangParser.g:1717:3: rule__SpriteActor__EventHandlersAssignment_3_2
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
    // InternalKlangParser.g:1725:1: rule__SpriteActor__Group_3__3 : rule__SpriteActor__Group_3__3__Impl ;
    public final void rule__SpriteActor__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1729:1: ( rule__SpriteActor__Group_3__3__Impl )
            // InternalKlangParser.g:1730:2: rule__SpriteActor__Group_3__3__Impl
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
    // InternalKlangParser.g:1736:1: rule__SpriteActor__Group_3__3__Impl : ( RULE_END ) ;
    public final void rule__SpriteActor__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1740:1: ( ( RULE_END ) )
            // InternalKlangParser.g:1741:1: ( RULE_END )
            {
            // InternalKlangParser.g:1741:1: ( RULE_END )
            // InternalKlangParser.g:1742:2: RULE_END
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


    // $ANTLR start "rule__MessageReceived__Group__0"
    // InternalKlangParser.g:1752:1: rule__MessageReceived__Group__0 : rule__MessageReceived__Group__0__Impl rule__MessageReceived__Group__1 ;
    public final void rule__MessageReceived__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1756:1: ( rule__MessageReceived__Group__0__Impl rule__MessageReceived__Group__1 )
            // InternalKlangParser.g:1757:2: rule__MessageReceived__Group__0__Impl rule__MessageReceived__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__MessageReceived__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageReceived__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageReceived__Group__0"


    // $ANTLR start "rule__MessageReceived__Group__0__Impl"
    // InternalKlangParser.g:1764:1: rule__MessageReceived__Group__0__Impl : ( () ) ;
    public final void rule__MessageReceived__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1768:1: ( ( () ) )
            // InternalKlangParser.g:1769:1: ( () )
            {
            // InternalKlangParser.g:1769:1: ( () )
            // InternalKlangParser.g:1770:2: ()
            {
             before(grammarAccess.getMessageReceivedAccess().getMessageReceivedAction_0()); 
            // InternalKlangParser.g:1771:2: ()
            // InternalKlangParser.g:1771:3: 
            {
            }

             after(grammarAccess.getMessageReceivedAccess().getMessageReceivedAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageReceived__Group__0__Impl"


    // $ANTLR start "rule__MessageReceived__Group__1"
    // InternalKlangParser.g:1779:1: rule__MessageReceived__Group__1 : rule__MessageReceived__Group__1__Impl rule__MessageReceived__Group__2 ;
    public final void rule__MessageReceived__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1783:1: ( rule__MessageReceived__Group__1__Impl rule__MessageReceived__Group__2 )
            // InternalKlangParser.g:1784:2: rule__MessageReceived__Group__1__Impl rule__MessageReceived__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__MessageReceived__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageReceived__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageReceived__Group__1"


    // $ANTLR start "rule__MessageReceived__Group__1__Impl"
    // InternalKlangParser.g:1791:1: rule__MessageReceived__Group__1__Impl : ( When ) ;
    public final void rule__MessageReceived__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1795:1: ( ( When ) )
            // InternalKlangParser.g:1796:1: ( When )
            {
            // InternalKlangParser.g:1796:1: ( When )
            // InternalKlangParser.g:1797:2: When
            {
             before(grammarAccess.getMessageReceivedAccess().getWhenKeyword_1()); 
            match(input,When,FOLLOW_2); 
             after(grammarAccess.getMessageReceivedAccess().getWhenKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageReceived__Group__1__Impl"


    // $ANTLR start "rule__MessageReceived__Group__2"
    // InternalKlangParser.g:1806:1: rule__MessageReceived__Group__2 : rule__MessageReceived__Group__2__Impl rule__MessageReceived__Group__3 ;
    public final void rule__MessageReceived__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1810:1: ( rule__MessageReceived__Group__2__Impl rule__MessageReceived__Group__3 )
            // InternalKlangParser.g:1811:2: rule__MessageReceived__Group__2__Impl rule__MessageReceived__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__MessageReceived__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageReceived__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageReceived__Group__2"


    // $ANTLR start "rule__MessageReceived__Group__2__Impl"
    // InternalKlangParser.g:1818:1: rule__MessageReceived__Group__2__Impl : ( LeftSquareBracket ) ;
    public final void rule__MessageReceived__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1822:1: ( ( LeftSquareBracket ) )
            // InternalKlangParser.g:1823:1: ( LeftSquareBracket )
            {
            // InternalKlangParser.g:1823:1: ( LeftSquareBracket )
            // InternalKlangParser.g:1824:2: LeftSquareBracket
            {
             before(grammarAccess.getMessageReceivedAccess().getLeftSquareBracketKeyword_2()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getMessageReceivedAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageReceived__Group__2__Impl"


    // $ANTLR start "rule__MessageReceived__Group__3"
    // InternalKlangParser.g:1833:1: rule__MessageReceived__Group__3 : rule__MessageReceived__Group__3__Impl rule__MessageReceived__Group__4 ;
    public final void rule__MessageReceived__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1837:1: ( rule__MessageReceived__Group__3__Impl rule__MessageReceived__Group__4 )
            // InternalKlangParser.g:1838:2: rule__MessageReceived__Group__3__Impl rule__MessageReceived__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__MessageReceived__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageReceived__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageReceived__Group__3"


    // $ANTLR start "rule__MessageReceived__Group__3__Impl"
    // InternalKlangParser.g:1845:1: rule__MessageReceived__Group__3__Impl : ( ( rule__MessageReceived__NameAssignment_3 ) ) ;
    public final void rule__MessageReceived__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1849:1: ( ( ( rule__MessageReceived__NameAssignment_3 ) ) )
            // InternalKlangParser.g:1850:1: ( ( rule__MessageReceived__NameAssignment_3 ) )
            {
            // InternalKlangParser.g:1850:1: ( ( rule__MessageReceived__NameAssignment_3 ) )
            // InternalKlangParser.g:1851:2: ( rule__MessageReceived__NameAssignment_3 )
            {
             before(grammarAccess.getMessageReceivedAccess().getNameAssignment_3()); 
            // InternalKlangParser.g:1852:2: ( rule__MessageReceived__NameAssignment_3 )
            // InternalKlangParser.g:1852:3: rule__MessageReceived__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MessageReceived__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMessageReceivedAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageReceived__Group__3__Impl"


    // $ANTLR start "rule__MessageReceived__Group__4"
    // InternalKlangParser.g:1860:1: rule__MessageReceived__Group__4 : rule__MessageReceived__Group__4__Impl rule__MessageReceived__Group__5 ;
    public final void rule__MessageReceived__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1864:1: ( rule__MessageReceived__Group__4__Impl rule__MessageReceived__Group__5 )
            // InternalKlangParser.g:1865:2: rule__MessageReceived__Group__4__Impl rule__MessageReceived__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__MessageReceived__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageReceived__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageReceived__Group__4"


    // $ANTLR start "rule__MessageReceived__Group__4__Impl"
    // InternalKlangParser.g:1872:1: rule__MessageReceived__Group__4__Impl : ( RightSquareBracket ) ;
    public final void rule__MessageReceived__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1876:1: ( ( RightSquareBracket ) )
            // InternalKlangParser.g:1877:1: ( RightSquareBracket )
            {
            // InternalKlangParser.g:1877:1: ( RightSquareBracket )
            // InternalKlangParser.g:1878:2: RightSquareBracket
            {
             before(grammarAccess.getMessageReceivedAccess().getRightSquareBracketKeyword_4()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getMessageReceivedAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageReceived__Group__4__Impl"


    // $ANTLR start "rule__MessageReceived__Group__5"
    // InternalKlangParser.g:1887:1: rule__MessageReceived__Group__5 : rule__MessageReceived__Group__5__Impl rule__MessageReceived__Group__6 ;
    public final void rule__MessageReceived__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1891:1: ( rule__MessageReceived__Group__5__Impl rule__MessageReceived__Group__6 )
            // InternalKlangParser.g:1892:2: rule__MessageReceived__Group__5__Impl rule__MessageReceived__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__MessageReceived__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageReceived__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageReceived__Group__5"


    // $ANTLR start "rule__MessageReceived__Group__5__Impl"
    // InternalKlangParser.g:1899:1: rule__MessageReceived__Group__5__Impl : ( Received ) ;
    public final void rule__MessageReceived__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1903:1: ( ( Received ) )
            // InternalKlangParser.g:1904:1: ( Received )
            {
            // InternalKlangParser.g:1904:1: ( Received )
            // InternalKlangParser.g:1905:2: Received
            {
             before(grammarAccess.getMessageReceivedAccess().getReceivedKeyword_5()); 
            match(input,Received,FOLLOW_2); 
             after(grammarAccess.getMessageReceivedAccess().getReceivedKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageReceived__Group__5__Impl"


    // $ANTLR start "rule__MessageReceived__Group__6"
    // InternalKlangParser.g:1914:1: rule__MessageReceived__Group__6 : rule__MessageReceived__Group__6__Impl rule__MessageReceived__Group__7 ;
    public final void rule__MessageReceived__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1918:1: ( rule__MessageReceived__Group__6__Impl rule__MessageReceived__Group__7 )
            // InternalKlangParser.g:1919:2: rule__MessageReceived__Group__6__Impl rule__MessageReceived__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__MessageReceived__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageReceived__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageReceived__Group__6"


    // $ANTLR start "rule__MessageReceived__Group__6__Impl"
    // InternalKlangParser.g:1926:1: rule__MessageReceived__Group__6__Impl : ( RULE_BEGIN ) ;
    public final void rule__MessageReceived__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1930:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:1931:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:1931:1: ( RULE_BEGIN )
            // InternalKlangParser.g:1932:2: RULE_BEGIN
            {
             before(grammarAccess.getMessageReceivedAccess().getBEGINTerminalRuleCall_6()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getMessageReceivedAccess().getBEGINTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageReceived__Group__6__Impl"


    // $ANTLR start "rule__MessageReceived__Group__7"
    // InternalKlangParser.g:1941:1: rule__MessageReceived__Group__7 : rule__MessageReceived__Group__7__Impl rule__MessageReceived__Group__8 ;
    public final void rule__MessageReceived__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1945:1: ( rule__MessageReceived__Group__7__Impl rule__MessageReceived__Group__8 )
            // InternalKlangParser.g:1946:2: rule__MessageReceived__Group__7__Impl rule__MessageReceived__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__MessageReceived__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageReceived__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageReceived__Group__7"


    // $ANTLR start "rule__MessageReceived__Group__7__Impl"
    // InternalKlangParser.g:1953:1: rule__MessageReceived__Group__7__Impl : ( ( rule__MessageReceived__StatementsAssignment_7 )* ) ;
    public final void rule__MessageReceived__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1957:1: ( ( ( rule__MessageReceived__StatementsAssignment_7 )* ) )
            // InternalKlangParser.g:1958:1: ( ( rule__MessageReceived__StatementsAssignment_7 )* )
            {
            // InternalKlangParser.g:1958:1: ( ( rule__MessageReceived__StatementsAssignment_7 )* )
            // InternalKlangParser.g:1959:2: ( rule__MessageReceived__StatementsAssignment_7 )*
            {
             before(grammarAccess.getMessageReceivedAccess().getStatementsAssignment_7()); 
            // InternalKlangParser.g:1960:2: ( rule__MessageReceived__StatementsAssignment_7 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==SendMessage||LA15_0==Forever||(LA15_0>=Sleep && LA15_0<=While)||LA15_0==If||LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalKlangParser.g:1960:3: rule__MessageReceived__StatementsAssignment_7
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__MessageReceived__StatementsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getMessageReceivedAccess().getStatementsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageReceived__Group__7__Impl"


    // $ANTLR start "rule__MessageReceived__Group__8"
    // InternalKlangParser.g:1968:1: rule__MessageReceived__Group__8 : rule__MessageReceived__Group__8__Impl ;
    public final void rule__MessageReceived__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1972:1: ( rule__MessageReceived__Group__8__Impl )
            // InternalKlangParser.g:1973:2: rule__MessageReceived__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageReceived__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageReceived__Group__8"


    // $ANTLR start "rule__MessageReceived__Group__8__Impl"
    // InternalKlangParser.g:1979:1: rule__MessageReceived__Group__8__Impl : ( RULE_END ) ;
    public final void rule__MessageReceived__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1983:1: ( ( RULE_END ) )
            // InternalKlangParser.g:1984:1: ( RULE_END )
            {
            // InternalKlangParser.g:1984:1: ( RULE_END )
            // InternalKlangParser.g:1985:2: RULE_END
            {
             before(grammarAccess.getMessageReceivedAccess().getENDTerminalRuleCall_8()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getMessageReceivedAccess().getENDTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageReceived__Group__8__Impl"


    // $ANTLR start "rule__SendMessage__Group__0"
    // InternalKlangParser.g:1995:1: rule__SendMessage__Group__0 : rule__SendMessage__Group__0__Impl rule__SendMessage__Group__1 ;
    public final void rule__SendMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:1999:1: ( rule__SendMessage__Group__0__Impl rule__SendMessage__Group__1 )
            // InternalKlangParser.g:2000:2: rule__SendMessage__Group__0__Impl rule__SendMessage__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalKlangParser.g:2007:1: rule__SendMessage__Group__0__Impl : ( () ) ;
    public final void rule__SendMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2011:1: ( ( () ) )
            // InternalKlangParser.g:2012:1: ( () )
            {
            // InternalKlangParser.g:2012:1: ( () )
            // InternalKlangParser.g:2013:2: ()
            {
             before(grammarAccess.getSendMessageAccess().getSendMessageAction_0()); 
            // InternalKlangParser.g:2014:2: ()
            // InternalKlangParser.g:2014:3: 
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
    // InternalKlangParser.g:2022:1: rule__SendMessage__Group__1 : rule__SendMessage__Group__1__Impl rule__SendMessage__Group__2 ;
    public final void rule__SendMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2026:1: ( rule__SendMessage__Group__1__Impl rule__SendMessage__Group__2 )
            // InternalKlangParser.g:2027:2: rule__SendMessage__Group__1__Impl rule__SendMessage__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalKlangParser.g:2034:1: rule__SendMessage__Group__1__Impl : ( SendMessage ) ;
    public final void rule__SendMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2038:1: ( ( SendMessage ) )
            // InternalKlangParser.g:2039:1: ( SendMessage )
            {
            // InternalKlangParser.g:2039:1: ( SendMessage )
            // InternalKlangParser.g:2040:2: SendMessage
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
    // InternalKlangParser.g:2049:1: rule__SendMessage__Group__2 : rule__SendMessage__Group__2__Impl rule__SendMessage__Group__3 ;
    public final void rule__SendMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2053:1: ( rule__SendMessage__Group__2__Impl rule__SendMessage__Group__3 )
            // InternalKlangParser.g:2054:2: rule__SendMessage__Group__2__Impl rule__SendMessage__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalKlangParser.g:2061:1: rule__SendMessage__Group__2__Impl : ( LeftParenthesis ) ;
    public final void rule__SendMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2065:1: ( ( LeftParenthesis ) )
            // InternalKlangParser.g:2066:1: ( LeftParenthesis )
            {
            // InternalKlangParser.g:2066:1: ( LeftParenthesis )
            // InternalKlangParser.g:2067:2: LeftParenthesis
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
    // InternalKlangParser.g:2076:1: rule__SendMessage__Group__3 : rule__SendMessage__Group__3__Impl rule__SendMessage__Group__4 ;
    public final void rule__SendMessage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2080:1: ( rule__SendMessage__Group__3__Impl rule__SendMessage__Group__4 )
            // InternalKlangParser.g:2081:2: rule__SendMessage__Group__3__Impl rule__SendMessage__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalKlangParser.g:2088:1: rule__SendMessage__Group__3__Impl : ( ( rule__SendMessage__NameAssignment_3 ) ) ;
    public final void rule__SendMessage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2092:1: ( ( ( rule__SendMessage__NameAssignment_3 ) ) )
            // InternalKlangParser.g:2093:1: ( ( rule__SendMessage__NameAssignment_3 ) )
            {
            // InternalKlangParser.g:2093:1: ( ( rule__SendMessage__NameAssignment_3 ) )
            // InternalKlangParser.g:2094:2: ( rule__SendMessage__NameAssignment_3 )
            {
             before(grammarAccess.getSendMessageAccess().getNameAssignment_3()); 
            // InternalKlangParser.g:2095:2: ( rule__SendMessage__NameAssignment_3 )
            // InternalKlangParser.g:2095:3: rule__SendMessage__NameAssignment_3
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
    // InternalKlangParser.g:2103:1: rule__SendMessage__Group__4 : rule__SendMessage__Group__4__Impl ;
    public final void rule__SendMessage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2107:1: ( rule__SendMessage__Group__4__Impl )
            // InternalKlangParser.g:2108:2: rule__SendMessage__Group__4__Impl
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
    // InternalKlangParser.g:2114:1: rule__SendMessage__Group__4__Impl : ( RightParenthesis ) ;
    public final void rule__SendMessage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2118:1: ( ( RightParenthesis ) )
            // InternalKlangParser.g:2119:1: ( RightParenthesis )
            {
            // InternalKlangParser.g:2119:1: ( RightParenthesis )
            // InternalKlangParser.g:2120:2: RightParenthesis
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


    // $ANTLR start "rule__GameStart__Group__0"
    // InternalKlangParser.g:2130:1: rule__GameStart__Group__0 : rule__GameStart__Group__0__Impl rule__GameStart__Group__1 ;
    public final void rule__GameStart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2134:1: ( rule__GameStart__Group__0__Impl rule__GameStart__Group__1 )
            // InternalKlangParser.g:2135:2: rule__GameStart__Group__0__Impl rule__GameStart__Group__1
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
    // InternalKlangParser.g:2142:1: rule__GameStart__Group__0__Impl : ( () ) ;
    public final void rule__GameStart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2146:1: ( ( () ) )
            // InternalKlangParser.g:2147:1: ( () )
            {
            // InternalKlangParser.g:2147:1: ( () )
            // InternalKlangParser.g:2148:2: ()
            {
             before(grammarAccess.getGameStartAccess().getGameStartAction_0()); 
            // InternalKlangParser.g:2149:2: ()
            // InternalKlangParser.g:2149:3: 
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
    // InternalKlangParser.g:2157:1: rule__GameStart__Group__1 : rule__GameStart__Group__1__Impl rule__GameStart__Group__2 ;
    public final void rule__GameStart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2161:1: ( rule__GameStart__Group__1__Impl rule__GameStart__Group__2 )
            // InternalKlangParser.g:2162:2: rule__GameStart__Group__1__Impl rule__GameStart__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalKlangParser.g:2169:1: rule__GameStart__Group__1__Impl : ( When ) ;
    public final void rule__GameStart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2173:1: ( ( When ) )
            // InternalKlangParser.g:2174:1: ( When )
            {
            // InternalKlangParser.g:2174:1: ( When )
            // InternalKlangParser.g:2175:2: When
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
    // InternalKlangParser.g:2184:1: rule__GameStart__Group__2 : rule__GameStart__Group__2__Impl rule__GameStart__Group__3 ;
    public final void rule__GameStart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2188:1: ( rule__GameStart__Group__2__Impl rule__GameStart__Group__3 )
            // InternalKlangParser.g:2189:2: rule__GameStart__Group__2__Impl rule__GameStart__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalKlangParser.g:2196:1: rule__GameStart__Group__2__Impl : ( Game ) ;
    public final void rule__GameStart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2200:1: ( ( Game ) )
            // InternalKlangParser.g:2201:1: ( Game )
            {
            // InternalKlangParser.g:2201:1: ( Game )
            // InternalKlangParser.g:2202:2: Game
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
    // InternalKlangParser.g:2211:1: rule__GameStart__Group__3 : rule__GameStart__Group__3__Impl rule__GameStart__Group__4 ;
    public final void rule__GameStart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2215:1: ( rule__GameStart__Group__3__Impl rule__GameStart__Group__4 )
            // InternalKlangParser.g:2216:2: rule__GameStart__Group__3__Impl rule__GameStart__Group__4
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
    // InternalKlangParser.g:2223:1: rule__GameStart__Group__3__Impl : ( Starts ) ;
    public final void rule__GameStart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2227:1: ( ( Starts ) )
            // InternalKlangParser.g:2228:1: ( Starts )
            {
            // InternalKlangParser.g:2228:1: ( Starts )
            // InternalKlangParser.g:2229:2: Starts
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
    // InternalKlangParser.g:2238:1: rule__GameStart__Group__4 : rule__GameStart__Group__4__Impl rule__GameStart__Group__5 ;
    public final void rule__GameStart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2242:1: ( rule__GameStart__Group__4__Impl rule__GameStart__Group__5 )
            // InternalKlangParser.g:2243:2: rule__GameStart__Group__4__Impl rule__GameStart__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalKlangParser.g:2250:1: rule__GameStart__Group__4__Impl : ( RULE_BEGIN ) ;
    public final void rule__GameStart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2254:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:2255:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:2255:1: ( RULE_BEGIN )
            // InternalKlangParser.g:2256:2: RULE_BEGIN
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
    // InternalKlangParser.g:2265:1: rule__GameStart__Group__5 : rule__GameStart__Group__5__Impl rule__GameStart__Group__6 ;
    public final void rule__GameStart__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2269:1: ( rule__GameStart__Group__5__Impl rule__GameStart__Group__6 )
            // InternalKlangParser.g:2270:2: rule__GameStart__Group__5__Impl rule__GameStart__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalKlangParser.g:2277:1: rule__GameStart__Group__5__Impl : ( ( rule__GameStart__StatementsAssignment_5 )* ) ;
    public final void rule__GameStart__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2281:1: ( ( ( rule__GameStart__StatementsAssignment_5 )* ) )
            // InternalKlangParser.g:2282:1: ( ( rule__GameStart__StatementsAssignment_5 )* )
            {
            // InternalKlangParser.g:2282:1: ( ( rule__GameStart__StatementsAssignment_5 )* )
            // InternalKlangParser.g:2283:2: ( rule__GameStart__StatementsAssignment_5 )*
            {
             before(grammarAccess.getGameStartAccess().getStatementsAssignment_5()); 
            // InternalKlangParser.g:2284:2: ( rule__GameStart__StatementsAssignment_5 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==SendMessage||LA16_0==Forever||(LA16_0>=Sleep && LA16_0<=While)||LA16_0==If||LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalKlangParser.g:2284:3: rule__GameStart__StatementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__GameStart__StatementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalKlangParser.g:2292:1: rule__GameStart__Group__6 : rule__GameStart__Group__6__Impl ;
    public final void rule__GameStart__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2296:1: ( rule__GameStart__Group__6__Impl )
            // InternalKlangParser.g:2297:2: rule__GameStart__Group__6__Impl
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
    // InternalKlangParser.g:2303:1: rule__GameStart__Group__6__Impl : ( RULE_END ) ;
    public final void rule__GameStart__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2307:1: ( ( RULE_END ) )
            // InternalKlangParser.g:2308:1: ( RULE_END )
            {
            // InternalKlangParser.g:2308:1: ( RULE_END )
            // InternalKlangParser.g:2309:2: RULE_END
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
    // InternalKlangParser.g:2319:1: rule__SpriteClicked__Group__0 : rule__SpriteClicked__Group__0__Impl rule__SpriteClicked__Group__1 ;
    public final void rule__SpriteClicked__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2323:1: ( rule__SpriteClicked__Group__0__Impl rule__SpriteClicked__Group__1 )
            // InternalKlangParser.g:2324:2: rule__SpriteClicked__Group__0__Impl rule__SpriteClicked__Group__1
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
    // InternalKlangParser.g:2331:1: rule__SpriteClicked__Group__0__Impl : ( () ) ;
    public final void rule__SpriteClicked__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2335:1: ( ( () ) )
            // InternalKlangParser.g:2336:1: ( () )
            {
            // InternalKlangParser.g:2336:1: ( () )
            // InternalKlangParser.g:2337:2: ()
            {
             before(grammarAccess.getSpriteClickedAccess().getSpriteClickedAction_0()); 
            // InternalKlangParser.g:2338:2: ()
            // InternalKlangParser.g:2338:3: 
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
    // InternalKlangParser.g:2346:1: rule__SpriteClicked__Group__1 : rule__SpriteClicked__Group__1__Impl rule__SpriteClicked__Group__2 ;
    public final void rule__SpriteClicked__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2350:1: ( rule__SpriteClicked__Group__1__Impl rule__SpriteClicked__Group__2 )
            // InternalKlangParser.g:2351:2: rule__SpriteClicked__Group__1__Impl rule__SpriteClicked__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalKlangParser.g:2358:1: rule__SpriteClicked__Group__1__Impl : ( When ) ;
    public final void rule__SpriteClicked__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2362:1: ( ( When ) )
            // InternalKlangParser.g:2363:1: ( When )
            {
            // InternalKlangParser.g:2363:1: ( When )
            // InternalKlangParser.g:2364:2: When
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
    // InternalKlangParser.g:2373:1: rule__SpriteClicked__Group__2 : rule__SpriteClicked__Group__2__Impl rule__SpriteClicked__Group__3 ;
    public final void rule__SpriteClicked__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2377:1: ( rule__SpriteClicked__Group__2__Impl rule__SpriteClicked__Group__3 )
            // InternalKlangParser.g:2378:2: rule__SpriteClicked__Group__2__Impl rule__SpriteClicked__Group__3
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
    // InternalKlangParser.g:2385:1: rule__SpriteClicked__Group__2__Impl : ( Clicked ) ;
    public final void rule__SpriteClicked__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2389:1: ( ( Clicked ) )
            // InternalKlangParser.g:2390:1: ( Clicked )
            {
            // InternalKlangParser.g:2390:1: ( Clicked )
            // InternalKlangParser.g:2391:2: Clicked
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
    // InternalKlangParser.g:2400:1: rule__SpriteClicked__Group__3 : rule__SpriteClicked__Group__3__Impl rule__SpriteClicked__Group__4 ;
    public final void rule__SpriteClicked__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2404:1: ( rule__SpriteClicked__Group__3__Impl rule__SpriteClicked__Group__4 )
            // InternalKlangParser.g:2405:2: rule__SpriteClicked__Group__3__Impl rule__SpriteClicked__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalKlangParser.g:2412:1: rule__SpriteClicked__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__SpriteClicked__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2416:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:2417:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:2417:1: ( RULE_BEGIN )
            // InternalKlangParser.g:2418:2: RULE_BEGIN
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
    // InternalKlangParser.g:2427:1: rule__SpriteClicked__Group__4 : rule__SpriteClicked__Group__4__Impl rule__SpriteClicked__Group__5 ;
    public final void rule__SpriteClicked__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2431:1: ( rule__SpriteClicked__Group__4__Impl rule__SpriteClicked__Group__5 )
            // InternalKlangParser.g:2432:2: rule__SpriteClicked__Group__4__Impl rule__SpriteClicked__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalKlangParser.g:2439:1: rule__SpriteClicked__Group__4__Impl : ( ( rule__SpriteClicked__StatementsAssignment_4 )* ) ;
    public final void rule__SpriteClicked__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2443:1: ( ( ( rule__SpriteClicked__StatementsAssignment_4 )* ) )
            // InternalKlangParser.g:2444:1: ( ( rule__SpriteClicked__StatementsAssignment_4 )* )
            {
            // InternalKlangParser.g:2444:1: ( ( rule__SpriteClicked__StatementsAssignment_4 )* )
            // InternalKlangParser.g:2445:2: ( rule__SpriteClicked__StatementsAssignment_4 )*
            {
             before(grammarAccess.getSpriteClickedAccess().getStatementsAssignment_4()); 
            // InternalKlangParser.g:2446:2: ( rule__SpriteClicked__StatementsAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==SendMessage||LA17_0==Forever||(LA17_0>=Sleep && LA17_0<=While)||LA17_0==If||LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalKlangParser.g:2446:3: rule__SpriteClicked__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__SpriteClicked__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalKlangParser.g:2454:1: rule__SpriteClicked__Group__5 : rule__SpriteClicked__Group__5__Impl ;
    public final void rule__SpriteClicked__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2458:1: ( rule__SpriteClicked__Group__5__Impl )
            // InternalKlangParser.g:2459:2: rule__SpriteClicked__Group__5__Impl
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
    // InternalKlangParser.g:2465:1: rule__SpriteClicked__Group__5__Impl : ( RULE_END ) ;
    public final void rule__SpriteClicked__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2469:1: ( ( RULE_END ) )
            // InternalKlangParser.g:2470:1: ( RULE_END )
            {
            // InternalKlangParser.g:2470:1: ( RULE_END )
            // InternalKlangParser.g:2471:2: RULE_END
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
    // InternalKlangParser.g:2481:1: rule__KeyPressed__Group__0 : rule__KeyPressed__Group__0__Impl rule__KeyPressed__Group__1 ;
    public final void rule__KeyPressed__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2485:1: ( rule__KeyPressed__Group__0__Impl rule__KeyPressed__Group__1 )
            // InternalKlangParser.g:2486:2: rule__KeyPressed__Group__0__Impl rule__KeyPressed__Group__1
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
    // InternalKlangParser.g:2493:1: rule__KeyPressed__Group__0__Impl : ( () ) ;
    public final void rule__KeyPressed__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2497:1: ( ( () ) )
            // InternalKlangParser.g:2498:1: ( () )
            {
            // InternalKlangParser.g:2498:1: ( () )
            // InternalKlangParser.g:2499:2: ()
            {
             before(grammarAccess.getKeyPressedAccess().getKeyPressedAction_0()); 
            // InternalKlangParser.g:2500:2: ()
            // InternalKlangParser.g:2500:3: 
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
    // InternalKlangParser.g:2508:1: rule__KeyPressed__Group__1 : rule__KeyPressed__Group__1__Impl rule__KeyPressed__Group__2 ;
    public final void rule__KeyPressed__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2512:1: ( rule__KeyPressed__Group__1__Impl rule__KeyPressed__Group__2 )
            // InternalKlangParser.g:2513:2: rule__KeyPressed__Group__1__Impl rule__KeyPressed__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalKlangParser.g:2520:1: rule__KeyPressed__Group__1__Impl : ( When ) ;
    public final void rule__KeyPressed__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2524:1: ( ( When ) )
            // InternalKlangParser.g:2525:1: ( When )
            {
            // InternalKlangParser.g:2525:1: ( When )
            // InternalKlangParser.g:2526:2: When
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
    // InternalKlangParser.g:2535:1: rule__KeyPressed__Group__2 : rule__KeyPressed__Group__2__Impl rule__KeyPressed__Group__3 ;
    public final void rule__KeyPressed__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2539:1: ( rule__KeyPressed__Group__2__Impl rule__KeyPressed__Group__3 )
            // InternalKlangParser.g:2540:2: rule__KeyPressed__Group__2__Impl rule__KeyPressed__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalKlangParser.g:2547:1: rule__KeyPressed__Group__2__Impl : ( LeftSquareBracket ) ;
    public final void rule__KeyPressed__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2551:1: ( ( LeftSquareBracket ) )
            // InternalKlangParser.g:2552:1: ( LeftSquareBracket )
            {
            // InternalKlangParser.g:2552:1: ( LeftSquareBracket )
            // InternalKlangParser.g:2553:2: LeftSquareBracket
            {
             before(grammarAccess.getKeyPressedAccess().getLeftSquareBracketKeyword_2()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getKeyPressedAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
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
    // InternalKlangParser.g:2562:1: rule__KeyPressed__Group__3 : rule__KeyPressed__Group__3__Impl rule__KeyPressed__Group__4 ;
    public final void rule__KeyPressed__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2566:1: ( rule__KeyPressed__Group__3__Impl rule__KeyPressed__Group__4 )
            // InternalKlangParser.g:2567:2: rule__KeyPressed__Group__3__Impl rule__KeyPressed__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalKlangParser.g:2574:1: rule__KeyPressed__Group__3__Impl : ( ( rule__KeyPressed__KeyAssignment_3 ) ) ;
    public final void rule__KeyPressed__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2578:1: ( ( ( rule__KeyPressed__KeyAssignment_3 ) ) )
            // InternalKlangParser.g:2579:1: ( ( rule__KeyPressed__KeyAssignment_3 ) )
            {
            // InternalKlangParser.g:2579:1: ( ( rule__KeyPressed__KeyAssignment_3 ) )
            // InternalKlangParser.g:2580:2: ( rule__KeyPressed__KeyAssignment_3 )
            {
             before(grammarAccess.getKeyPressedAccess().getKeyAssignment_3()); 
            // InternalKlangParser.g:2581:2: ( rule__KeyPressed__KeyAssignment_3 )
            // InternalKlangParser.g:2581:3: rule__KeyPressed__KeyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__KeyPressed__KeyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getKeyPressedAccess().getKeyAssignment_3()); 

            }


            }

        }
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
    // InternalKlangParser.g:2589:1: rule__KeyPressed__Group__4 : rule__KeyPressed__Group__4__Impl rule__KeyPressed__Group__5 ;
    public final void rule__KeyPressed__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2593:1: ( rule__KeyPressed__Group__4__Impl rule__KeyPressed__Group__5 )
            // InternalKlangParser.g:2594:2: rule__KeyPressed__Group__4__Impl rule__KeyPressed__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalKlangParser.g:2601:1: rule__KeyPressed__Group__4__Impl : ( RightSquareBracket ) ;
    public final void rule__KeyPressed__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2605:1: ( ( RightSquareBracket ) )
            // InternalKlangParser.g:2606:1: ( RightSquareBracket )
            {
            // InternalKlangParser.g:2606:1: ( RightSquareBracket )
            // InternalKlangParser.g:2607:2: RightSquareBracket
            {
             before(grammarAccess.getKeyPressedAccess().getRightSquareBracketKeyword_4()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getKeyPressedAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
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
    // InternalKlangParser.g:2616:1: rule__KeyPressed__Group__5 : rule__KeyPressed__Group__5__Impl rule__KeyPressed__Group__6 ;
    public final void rule__KeyPressed__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2620:1: ( rule__KeyPressed__Group__5__Impl rule__KeyPressed__Group__6 )
            // InternalKlangParser.g:2621:2: rule__KeyPressed__Group__5__Impl rule__KeyPressed__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalKlangParser.g:2628:1: rule__KeyPressed__Group__5__Impl : ( Pressed ) ;
    public final void rule__KeyPressed__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2632:1: ( ( Pressed ) )
            // InternalKlangParser.g:2633:1: ( Pressed )
            {
            // InternalKlangParser.g:2633:1: ( Pressed )
            // InternalKlangParser.g:2634:2: Pressed
            {
             before(grammarAccess.getKeyPressedAccess().getPressedKeyword_5()); 
            match(input,Pressed,FOLLOW_2); 
             after(grammarAccess.getKeyPressedAccess().getPressedKeyword_5()); 

            }


            }

        }
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
    // InternalKlangParser.g:2643:1: rule__KeyPressed__Group__6 : rule__KeyPressed__Group__6__Impl rule__KeyPressed__Group__7 ;
    public final void rule__KeyPressed__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2647:1: ( rule__KeyPressed__Group__6__Impl rule__KeyPressed__Group__7 )
            // InternalKlangParser.g:2648:2: rule__KeyPressed__Group__6__Impl rule__KeyPressed__Group__7
            {
            pushFollow(FOLLOW_16);
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
    // InternalKlangParser.g:2655:1: rule__KeyPressed__Group__6__Impl : ( RULE_BEGIN ) ;
    public final void rule__KeyPressed__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2659:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:2660:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:2660:1: ( RULE_BEGIN )
            // InternalKlangParser.g:2661:2: RULE_BEGIN
            {
             before(grammarAccess.getKeyPressedAccess().getBEGINTerminalRuleCall_6()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getKeyPressedAccess().getBEGINTerminalRuleCall_6()); 

            }


            }

        }
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
    // InternalKlangParser.g:2670:1: rule__KeyPressed__Group__7 : rule__KeyPressed__Group__7__Impl rule__KeyPressed__Group__8 ;
    public final void rule__KeyPressed__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2674:1: ( rule__KeyPressed__Group__7__Impl rule__KeyPressed__Group__8 )
            // InternalKlangParser.g:2675:2: rule__KeyPressed__Group__7__Impl rule__KeyPressed__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__KeyPressed__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeyPressed__Group__8();

            state._fsp--;


            }

        }
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
    // InternalKlangParser.g:2682:1: rule__KeyPressed__Group__7__Impl : ( ( rule__KeyPressed__StatementsAssignment_7 )* ) ;
    public final void rule__KeyPressed__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2686:1: ( ( ( rule__KeyPressed__StatementsAssignment_7 )* ) )
            // InternalKlangParser.g:2687:1: ( ( rule__KeyPressed__StatementsAssignment_7 )* )
            {
            // InternalKlangParser.g:2687:1: ( ( rule__KeyPressed__StatementsAssignment_7 )* )
            // InternalKlangParser.g:2688:2: ( rule__KeyPressed__StatementsAssignment_7 )*
            {
             before(grammarAccess.getKeyPressedAccess().getStatementsAssignment_7()); 
            // InternalKlangParser.g:2689:2: ( rule__KeyPressed__StatementsAssignment_7 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==SendMessage||LA18_0==Forever||(LA18_0>=Sleep && LA18_0<=While)||LA18_0==If||LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalKlangParser.g:2689:3: rule__KeyPressed__StatementsAssignment_7
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__KeyPressed__StatementsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getKeyPressedAccess().getStatementsAssignment_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__KeyPressed__Group__8"
    // InternalKlangParser.g:2697:1: rule__KeyPressed__Group__8 : rule__KeyPressed__Group__8__Impl ;
    public final void rule__KeyPressed__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2701:1: ( rule__KeyPressed__Group__8__Impl )
            // InternalKlangParser.g:2702:2: rule__KeyPressed__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KeyPressed__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyPressed__Group__8"


    // $ANTLR start "rule__KeyPressed__Group__8__Impl"
    // InternalKlangParser.g:2708:1: rule__KeyPressed__Group__8__Impl : ( RULE_END ) ;
    public final void rule__KeyPressed__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2712:1: ( ( RULE_END ) )
            // InternalKlangParser.g:2713:1: ( RULE_END )
            {
            // InternalKlangParser.g:2713:1: ( RULE_END )
            // InternalKlangParser.g:2714:2: RULE_END
            {
             before(grammarAccess.getKeyPressedAccess().getENDTerminalRuleCall_8()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getKeyPressedAccess().getENDTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyPressed__Group__8__Impl"


    // $ANTLR start "rule__CollidesWith__Group__0"
    // InternalKlangParser.g:2724:1: rule__CollidesWith__Group__0 : rule__CollidesWith__Group__0__Impl rule__CollidesWith__Group__1 ;
    public final void rule__CollidesWith__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2728:1: ( rule__CollidesWith__Group__0__Impl rule__CollidesWith__Group__1 )
            // InternalKlangParser.g:2729:2: rule__CollidesWith__Group__0__Impl rule__CollidesWith__Group__1
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
    // InternalKlangParser.g:2736:1: rule__CollidesWith__Group__0__Impl : ( () ) ;
    public final void rule__CollidesWith__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2740:1: ( ( () ) )
            // InternalKlangParser.g:2741:1: ( () )
            {
            // InternalKlangParser.g:2741:1: ( () )
            // InternalKlangParser.g:2742:2: ()
            {
             before(grammarAccess.getCollidesWithAccess().getCollidesWithAction_0()); 
            // InternalKlangParser.g:2743:2: ()
            // InternalKlangParser.g:2743:3: 
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
    // InternalKlangParser.g:2751:1: rule__CollidesWith__Group__1 : rule__CollidesWith__Group__1__Impl rule__CollidesWith__Group__2 ;
    public final void rule__CollidesWith__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2755:1: ( rule__CollidesWith__Group__1__Impl rule__CollidesWith__Group__2 )
            // InternalKlangParser.g:2756:2: rule__CollidesWith__Group__1__Impl rule__CollidesWith__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalKlangParser.g:2763:1: rule__CollidesWith__Group__1__Impl : ( When ) ;
    public final void rule__CollidesWith__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2767:1: ( ( When ) )
            // InternalKlangParser.g:2768:1: ( When )
            {
            // InternalKlangParser.g:2768:1: ( When )
            // InternalKlangParser.g:2769:2: When
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
    // InternalKlangParser.g:2778:1: rule__CollidesWith__Group__2 : rule__CollidesWith__Group__2__Impl rule__CollidesWith__Group__3 ;
    public final void rule__CollidesWith__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2782:1: ( rule__CollidesWith__Group__2__Impl rule__CollidesWith__Group__3 )
            // InternalKlangParser.g:2783:2: rule__CollidesWith__Group__2__Impl rule__CollidesWith__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalKlangParser.g:2790:1: rule__CollidesWith__Group__2__Impl : ( Collides ) ;
    public final void rule__CollidesWith__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2794:1: ( ( Collides ) )
            // InternalKlangParser.g:2795:1: ( Collides )
            {
            // InternalKlangParser.g:2795:1: ( Collides )
            // InternalKlangParser.g:2796:2: Collides
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
    // InternalKlangParser.g:2805:1: rule__CollidesWith__Group__3 : rule__CollidesWith__Group__3__Impl rule__CollidesWith__Group__4 ;
    public final void rule__CollidesWith__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2809:1: ( rule__CollidesWith__Group__3__Impl rule__CollidesWith__Group__4 )
            // InternalKlangParser.g:2810:2: rule__CollidesWith__Group__3__Impl rule__CollidesWith__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalKlangParser.g:2817:1: rule__CollidesWith__Group__3__Impl : ( With ) ;
    public final void rule__CollidesWith__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2821:1: ( ( With ) )
            // InternalKlangParser.g:2822:1: ( With )
            {
            // InternalKlangParser.g:2822:1: ( With )
            // InternalKlangParser.g:2823:2: With
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
    // InternalKlangParser.g:2832:1: rule__CollidesWith__Group__4 : rule__CollidesWith__Group__4__Impl rule__CollidesWith__Group__5 ;
    public final void rule__CollidesWith__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2836:1: ( rule__CollidesWith__Group__4__Impl rule__CollidesWith__Group__5 )
            // InternalKlangParser.g:2837:2: rule__CollidesWith__Group__4__Impl rule__CollidesWith__Group__5
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
    // InternalKlangParser.g:2844:1: rule__CollidesWith__Group__4__Impl : ( ( rule__CollidesWith__TargetAssignment_4 ) ) ;
    public final void rule__CollidesWith__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2848:1: ( ( ( rule__CollidesWith__TargetAssignment_4 ) ) )
            // InternalKlangParser.g:2849:1: ( ( rule__CollidesWith__TargetAssignment_4 ) )
            {
            // InternalKlangParser.g:2849:1: ( ( rule__CollidesWith__TargetAssignment_4 ) )
            // InternalKlangParser.g:2850:2: ( rule__CollidesWith__TargetAssignment_4 )
            {
             before(grammarAccess.getCollidesWithAccess().getTargetAssignment_4()); 
            // InternalKlangParser.g:2851:2: ( rule__CollidesWith__TargetAssignment_4 )
            // InternalKlangParser.g:2851:3: rule__CollidesWith__TargetAssignment_4
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
    // InternalKlangParser.g:2859:1: rule__CollidesWith__Group__5 : rule__CollidesWith__Group__5__Impl rule__CollidesWith__Group__6 ;
    public final void rule__CollidesWith__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2863:1: ( rule__CollidesWith__Group__5__Impl rule__CollidesWith__Group__6 )
            // InternalKlangParser.g:2864:2: rule__CollidesWith__Group__5__Impl rule__CollidesWith__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalKlangParser.g:2871:1: rule__CollidesWith__Group__5__Impl : ( RULE_BEGIN ) ;
    public final void rule__CollidesWith__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2875:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:2876:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:2876:1: ( RULE_BEGIN )
            // InternalKlangParser.g:2877:2: RULE_BEGIN
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
    // InternalKlangParser.g:2886:1: rule__CollidesWith__Group__6 : rule__CollidesWith__Group__6__Impl rule__CollidesWith__Group__7 ;
    public final void rule__CollidesWith__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2890:1: ( rule__CollidesWith__Group__6__Impl rule__CollidesWith__Group__7 )
            // InternalKlangParser.g:2891:2: rule__CollidesWith__Group__6__Impl rule__CollidesWith__Group__7
            {
            pushFollow(FOLLOW_16);
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
    // InternalKlangParser.g:2898:1: rule__CollidesWith__Group__6__Impl : ( ( rule__CollidesWith__StatementsAssignment_6 )* ) ;
    public final void rule__CollidesWith__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2902:1: ( ( ( rule__CollidesWith__StatementsAssignment_6 )* ) )
            // InternalKlangParser.g:2903:1: ( ( rule__CollidesWith__StatementsAssignment_6 )* )
            {
            // InternalKlangParser.g:2903:1: ( ( rule__CollidesWith__StatementsAssignment_6 )* )
            // InternalKlangParser.g:2904:2: ( rule__CollidesWith__StatementsAssignment_6 )*
            {
             before(grammarAccess.getCollidesWithAccess().getStatementsAssignment_6()); 
            // InternalKlangParser.g:2905:2: ( rule__CollidesWith__StatementsAssignment_6 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==SendMessage||LA19_0==Forever||(LA19_0>=Sleep && LA19_0<=While)||LA19_0==If||LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalKlangParser.g:2905:3: rule__CollidesWith__StatementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__CollidesWith__StatementsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalKlangParser.g:2913:1: rule__CollidesWith__Group__7 : rule__CollidesWith__Group__7__Impl ;
    public final void rule__CollidesWith__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2917:1: ( rule__CollidesWith__Group__7__Impl )
            // InternalKlangParser.g:2918:2: rule__CollidesWith__Group__7__Impl
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
    // InternalKlangParser.g:2924:1: rule__CollidesWith__Group__7__Impl : ( RULE_END ) ;
    public final void rule__CollidesWith__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2928:1: ( ( RULE_END ) )
            // InternalKlangParser.g:2929:1: ( RULE_END )
            {
            // InternalKlangParser.g:2929:1: ( RULE_END )
            // InternalKlangParser.g:2930:2: RULE_END
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
    // InternalKlangParser.g:2940:1: rule__WhileLoop__Group__0 : rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 ;
    public final void rule__WhileLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2944:1: ( rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 )
            // InternalKlangParser.g:2945:2: rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalKlangParser.g:2952:1: rule__WhileLoop__Group__0__Impl : ( () ) ;
    public final void rule__WhileLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2956:1: ( ( () ) )
            // InternalKlangParser.g:2957:1: ( () )
            {
            // InternalKlangParser.g:2957:1: ( () )
            // InternalKlangParser.g:2958:2: ()
            {
             before(grammarAccess.getWhileLoopAccess().getWhileLoopAction_0()); 
            // InternalKlangParser.g:2959:2: ()
            // InternalKlangParser.g:2959:3: 
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
    // InternalKlangParser.g:2967:1: rule__WhileLoop__Group__1 : rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 ;
    public final void rule__WhileLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2971:1: ( rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 )
            // InternalKlangParser.g:2972:2: rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalKlangParser.g:2979:1: rule__WhileLoop__Group__1__Impl : ( While ) ;
    public final void rule__WhileLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2983:1: ( ( While ) )
            // InternalKlangParser.g:2984:1: ( While )
            {
            // InternalKlangParser.g:2984:1: ( While )
            // InternalKlangParser.g:2985:2: While
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
    // InternalKlangParser.g:2994:1: rule__WhileLoop__Group__2 : rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 ;
    public final void rule__WhileLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:2998:1: ( rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 )
            // InternalKlangParser.g:2999:2: rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3
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
    // InternalKlangParser.g:3006:1: rule__WhileLoop__Group__2__Impl : ( ( rule__WhileLoop__PredicateAssignment_2 ) ) ;
    public final void rule__WhileLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3010:1: ( ( ( rule__WhileLoop__PredicateAssignment_2 ) ) )
            // InternalKlangParser.g:3011:1: ( ( rule__WhileLoop__PredicateAssignment_2 ) )
            {
            // InternalKlangParser.g:3011:1: ( ( rule__WhileLoop__PredicateAssignment_2 ) )
            // InternalKlangParser.g:3012:2: ( rule__WhileLoop__PredicateAssignment_2 )
            {
             before(grammarAccess.getWhileLoopAccess().getPredicateAssignment_2()); 
            // InternalKlangParser.g:3013:2: ( rule__WhileLoop__PredicateAssignment_2 )
            // InternalKlangParser.g:3013:3: rule__WhileLoop__PredicateAssignment_2
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
    // InternalKlangParser.g:3021:1: rule__WhileLoop__Group__3 : rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 ;
    public final void rule__WhileLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3025:1: ( rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 )
            // InternalKlangParser.g:3026:2: rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalKlangParser.g:3033:1: rule__WhileLoop__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__WhileLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3037:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:3038:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:3038:1: ( RULE_BEGIN )
            // InternalKlangParser.g:3039:2: RULE_BEGIN
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
    // InternalKlangParser.g:3048:1: rule__WhileLoop__Group__4 : rule__WhileLoop__Group__4__Impl rule__WhileLoop__Group__5 ;
    public final void rule__WhileLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3052:1: ( rule__WhileLoop__Group__4__Impl rule__WhileLoop__Group__5 )
            // InternalKlangParser.g:3053:2: rule__WhileLoop__Group__4__Impl rule__WhileLoop__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalKlangParser.g:3060:1: rule__WhileLoop__Group__4__Impl : ( ( rule__WhileLoop__StatementsAssignment_4 )* ) ;
    public final void rule__WhileLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3064:1: ( ( ( rule__WhileLoop__StatementsAssignment_4 )* ) )
            // InternalKlangParser.g:3065:1: ( ( rule__WhileLoop__StatementsAssignment_4 )* )
            {
            // InternalKlangParser.g:3065:1: ( ( rule__WhileLoop__StatementsAssignment_4 )* )
            // InternalKlangParser.g:3066:2: ( rule__WhileLoop__StatementsAssignment_4 )*
            {
             before(grammarAccess.getWhileLoopAccess().getStatementsAssignment_4()); 
            // InternalKlangParser.g:3067:2: ( rule__WhileLoop__StatementsAssignment_4 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==SendMessage||LA20_0==Forever||(LA20_0>=Sleep && LA20_0<=While)||LA20_0==If||LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalKlangParser.g:3067:3: rule__WhileLoop__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__WhileLoop__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalKlangParser.g:3075:1: rule__WhileLoop__Group__5 : rule__WhileLoop__Group__5__Impl ;
    public final void rule__WhileLoop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3079:1: ( rule__WhileLoop__Group__5__Impl )
            // InternalKlangParser.g:3080:2: rule__WhileLoop__Group__5__Impl
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
    // InternalKlangParser.g:3086:1: rule__WhileLoop__Group__5__Impl : ( RULE_END ) ;
    public final void rule__WhileLoop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3090:1: ( ( RULE_END ) )
            // InternalKlangParser.g:3091:1: ( RULE_END )
            {
            // InternalKlangParser.g:3091:1: ( RULE_END )
            // InternalKlangParser.g:3092:2: RULE_END
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
    // InternalKlangParser.g:3102:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3106:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalKlangParser.g:3107:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalKlangParser.g:3114:1: rule__If__Group__0__Impl : ( () ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3118:1: ( ( () ) )
            // InternalKlangParser.g:3119:1: ( () )
            {
            // InternalKlangParser.g:3119:1: ( () )
            // InternalKlangParser.g:3120:2: ()
            {
             before(grammarAccess.getIfAccess().getIfAction_0()); 
            // InternalKlangParser.g:3121:2: ()
            // InternalKlangParser.g:3121:3: 
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
    // InternalKlangParser.g:3129:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3133:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalKlangParser.g:3134:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalKlangParser.g:3141:1: rule__If__Group__1__Impl : ( If ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3145:1: ( ( If ) )
            // InternalKlangParser.g:3146:1: ( If )
            {
            // InternalKlangParser.g:3146:1: ( If )
            // InternalKlangParser.g:3147:2: If
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
    // InternalKlangParser.g:3156:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3160:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // InternalKlangParser.g:3161:2: rule__If__Group__2__Impl rule__If__Group__3
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
    // InternalKlangParser.g:3168:1: rule__If__Group__2__Impl : ( ( rule__If__PredicateAssignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3172:1: ( ( ( rule__If__PredicateAssignment_2 ) ) )
            // InternalKlangParser.g:3173:1: ( ( rule__If__PredicateAssignment_2 ) )
            {
            // InternalKlangParser.g:3173:1: ( ( rule__If__PredicateAssignment_2 ) )
            // InternalKlangParser.g:3174:2: ( rule__If__PredicateAssignment_2 )
            {
             before(grammarAccess.getIfAccess().getPredicateAssignment_2()); 
            // InternalKlangParser.g:3175:2: ( rule__If__PredicateAssignment_2 )
            // InternalKlangParser.g:3175:3: rule__If__PredicateAssignment_2
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
    // InternalKlangParser.g:3183:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3187:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // InternalKlangParser.g:3188:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalKlangParser.g:3195:1: rule__If__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3199:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:3200:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:3200:1: ( RULE_BEGIN )
            // InternalKlangParser.g:3201:2: RULE_BEGIN
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
    // InternalKlangParser.g:3210:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3214:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // InternalKlangParser.g:3215:2: rule__If__Group__4__Impl rule__If__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalKlangParser.g:3222:1: rule__If__Group__4__Impl : ( ( rule__If__IfBlockAssignment_4 )* ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3226:1: ( ( ( rule__If__IfBlockAssignment_4 )* ) )
            // InternalKlangParser.g:3227:1: ( ( rule__If__IfBlockAssignment_4 )* )
            {
            // InternalKlangParser.g:3227:1: ( ( rule__If__IfBlockAssignment_4 )* )
            // InternalKlangParser.g:3228:2: ( rule__If__IfBlockAssignment_4 )*
            {
             before(grammarAccess.getIfAccess().getIfBlockAssignment_4()); 
            // InternalKlangParser.g:3229:2: ( rule__If__IfBlockAssignment_4 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==SendMessage||LA21_0==Forever||(LA21_0>=Sleep && LA21_0<=While)||LA21_0==If||LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalKlangParser.g:3229:3: rule__If__IfBlockAssignment_4
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__If__IfBlockAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalKlangParser.g:3237:1: rule__If__Group__5 : rule__If__Group__5__Impl rule__If__Group__6 ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3241:1: ( rule__If__Group__5__Impl rule__If__Group__6 )
            // InternalKlangParser.g:3242:2: rule__If__Group__5__Impl rule__If__Group__6
            {
            pushFollow(FOLLOW_31);
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
    // InternalKlangParser.g:3249:1: rule__If__Group__5__Impl : ( RULE_END ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3253:1: ( ( RULE_END ) )
            // InternalKlangParser.g:3254:1: ( RULE_END )
            {
            // InternalKlangParser.g:3254:1: ( RULE_END )
            // InternalKlangParser.g:3255:2: RULE_END
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
    // InternalKlangParser.g:3264:1: rule__If__Group__6 : rule__If__Group__6__Impl ;
    public final void rule__If__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3268:1: ( rule__If__Group__6__Impl )
            // InternalKlangParser.g:3269:2: rule__If__Group__6__Impl
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
    // InternalKlangParser.g:3275:1: rule__If__Group__6__Impl : ( ( rule__If__Group_6__0 )? ) ;
    public final void rule__If__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3279:1: ( ( ( rule__If__Group_6__0 )? ) )
            // InternalKlangParser.g:3280:1: ( ( rule__If__Group_6__0 )? )
            {
            // InternalKlangParser.g:3280:1: ( ( rule__If__Group_6__0 )? )
            // InternalKlangParser.g:3281:2: ( rule__If__Group_6__0 )?
            {
             before(grammarAccess.getIfAccess().getGroup_6()); 
            // InternalKlangParser.g:3282:2: ( rule__If__Group_6__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Else) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalKlangParser.g:3282:3: rule__If__Group_6__0
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
    // InternalKlangParser.g:3291:1: rule__If__Group_6__0 : rule__If__Group_6__0__Impl rule__If__Group_6__1 ;
    public final void rule__If__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3295:1: ( rule__If__Group_6__0__Impl rule__If__Group_6__1 )
            // InternalKlangParser.g:3296:2: rule__If__Group_6__0__Impl rule__If__Group_6__1
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
    // InternalKlangParser.g:3303:1: rule__If__Group_6__0__Impl : ( Else ) ;
    public final void rule__If__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3307:1: ( ( Else ) )
            // InternalKlangParser.g:3308:1: ( Else )
            {
            // InternalKlangParser.g:3308:1: ( Else )
            // InternalKlangParser.g:3309:2: Else
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
    // InternalKlangParser.g:3318:1: rule__If__Group_6__1 : rule__If__Group_6__1__Impl rule__If__Group_6__2 ;
    public final void rule__If__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3322:1: ( rule__If__Group_6__1__Impl rule__If__Group_6__2 )
            // InternalKlangParser.g:3323:2: rule__If__Group_6__1__Impl rule__If__Group_6__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalKlangParser.g:3330:1: rule__If__Group_6__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__If__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3334:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:3335:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:3335:1: ( RULE_BEGIN )
            // InternalKlangParser.g:3336:2: RULE_BEGIN
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
    // InternalKlangParser.g:3345:1: rule__If__Group_6__2 : rule__If__Group_6__2__Impl rule__If__Group_6__3 ;
    public final void rule__If__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3349:1: ( rule__If__Group_6__2__Impl rule__If__Group_6__3 )
            // InternalKlangParser.g:3350:2: rule__If__Group_6__2__Impl rule__If__Group_6__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalKlangParser.g:3357:1: rule__If__Group_6__2__Impl : ( ( rule__If__ElseBlockAssignment_6_2 )* ) ;
    public final void rule__If__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3361:1: ( ( ( rule__If__ElseBlockAssignment_6_2 )* ) )
            // InternalKlangParser.g:3362:1: ( ( rule__If__ElseBlockAssignment_6_2 )* )
            {
            // InternalKlangParser.g:3362:1: ( ( rule__If__ElseBlockAssignment_6_2 )* )
            // InternalKlangParser.g:3363:2: ( rule__If__ElseBlockAssignment_6_2 )*
            {
             before(grammarAccess.getIfAccess().getElseBlockAssignment_6_2()); 
            // InternalKlangParser.g:3364:2: ( rule__If__ElseBlockAssignment_6_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==SendMessage||LA23_0==Forever||(LA23_0>=Sleep && LA23_0<=While)||LA23_0==If||LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalKlangParser.g:3364:3: rule__If__ElseBlockAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__If__ElseBlockAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalKlangParser.g:3372:1: rule__If__Group_6__3 : rule__If__Group_6__3__Impl ;
    public final void rule__If__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3376:1: ( rule__If__Group_6__3__Impl )
            // InternalKlangParser.g:3377:2: rule__If__Group_6__3__Impl
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
    // InternalKlangParser.g:3383:1: rule__If__Group_6__3__Impl : ( RULE_END ) ;
    public final void rule__If__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3387:1: ( ( RULE_END ) )
            // InternalKlangParser.g:3388:1: ( RULE_END )
            {
            // InternalKlangParser.g:3388:1: ( RULE_END )
            // InternalKlangParser.g:3389:2: RULE_END
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
    // InternalKlangParser.g:3399:1: rule__ForeverLoop__Group__0 : rule__ForeverLoop__Group__0__Impl rule__ForeverLoop__Group__1 ;
    public final void rule__ForeverLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3403:1: ( rule__ForeverLoop__Group__0__Impl rule__ForeverLoop__Group__1 )
            // InternalKlangParser.g:3404:2: rule__ForeverLoop__Group__0__Impl rule__ForeverLoop__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalKlangParser.g:3411:1: rule__ForeverLoop__Group__0__Impl : ( () ) ;
    public final void rule__ForeverLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3415:1: ( ( () ) )
            // InternalKlangParser.g:3416:1: ( () )
            {
            // InternalKlangParser.g:3416:1: ( () )
            // InternalKlangParser.g:3417:2: ()
            {
             before(grammarAccess.getForeverLoopAccess().getForeverLoopAction_0()); 
            // InternalKlangParser.g:3418:2: ()
            // InternalKlangParser.g:3418:3: 
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
    // InternalKlangParser.g:3426:1: rule__ForeverLoop__Group__1 : rule__ForeverLoop__Group__1__Impl rule__ForeverLoop__Group__2 ;
    public final void rule__ForeverLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3430:1: ( rule__ForeverLoop__Group__1__Impl rule__ForeverLoop__Group__2 )
            // InternalKlangParser.g:3431:2: rule__ForeverLoop__Group__1__Impl rule__ForeverLoop__Group__2
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
    // InternalKlangParser.g:3438:1: rule__ForeverLoop__Group__1__Impl : ( Forever ) ;
    public final void rule__ForeverLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3442:1: ( ( Forever ) )
            // InternalKlangParser.g:3443:1: ( Forever )
            {
            // InternalKlangParser.g:3443:1: ( Forever )
            // InternalKlangParser.g:3444:2: Forever
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
    // InternalKlangParser.g:3453:1: rule__ForeverLoop__Group__2 : rule__ForeverLoop__Group__2__Impl rule__ForeverLoop__Group__3 ;
    public final void rule__ForeverLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3457:1: ( rule__ForeverLoop__Group__2__Impl rule__ForeverLoop__Group__3 )
            // InternalKlangParser.g:3458:2: rule__ForeverLoop__Group__2__Impl rule__ForeverLoop__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalKlangParser.g:3465:1: rule__ForeverLoop__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__ForeverLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3469:1: ( ( RULE_BEGIN ) )
            // InternalKlangParser.g:3470:1: ( RULE_BEGIN )
            {
            // InternalKlangParser.g:3470:1: ( RULE_BEGIN )
            // InternalKlangParser.g:3471:2: RULE_BEGIN
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
    // InternalKlangParser.g:3480:1: rule__ForeverLoop__Group__3 : rule__ForeverLoop__Group__3__Impl rule__ForeverLoop__Group__4 ;
    public final void rule__ForeverLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3484:1: ( rule__ForeverLoop__Group__3__Impl rule__ForeverLoop__Group__4 )
            // InternalKlangParser.g:3485:2: rule__ForeverLoop__Group__3__Impl rule__ForeverLoop__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalKlangParser.g:3492:1: rule__ForeverLoop__Group__3__Impl : ( ( rule__ForeverLoop__StatementsAssignment_3 )* ) ;
    public final void rule__ForeverLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3496:1: ( ( ( rule__ForeverLoop__StatementsAssignment_3 )* ) )
            // InternalKlangParser.g:3497:1: ( ( rule__ForeverLoop__StatementsAssignment_3 )* )
            {
            // InternalKlangParser.g:3497:1: ( ( rule__ForeverLoop__StatementsAssignment_3 )* )
            // InternalKlangParser.g:3498:2: ( rule__ForeverLoop__StatementsAssignment_3 )*
            {
             before(grammarAccess.getForeverLoopAccess().getStatementsAssignment_3()); 
            // InternalKlangParser.g:3499:2: ( rule__ForeverLoop__StatementsAssignment_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==SendMessage||LA24_0==Forever||(LA24_0>=Sleep && LA24_0<=While)||LA24_0==If||LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalKlangParser.g:3499:3: rule__ForeverLoop__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ForeverLoop__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalKlangParser.g:3507:1: rule__ForeverLoop__Group__4 : rule__ForeverLoop__Group__4__Impl ;
    public final void rule__ForeverLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3511:1: ( rule__ForeverLoop__Group__4__Impl )
            // InternalKlangParser.g:3512:2: rule__ForeverLoop__Group__4__Impl
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
    // InternalKlangParser.g:3518:1: rule__ForeverLoop__Group__4__Impl : ( RULE_END ) ;
    public final void rule__ForeverLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3522:1: ( ( RULE_END ) )
            // InternalKlangParser.g:3523:1: ( RULE_END )
            {
            // InternalKlangParser.g:3523:1: ( RULE_END )
            // InternalKlangParser.g:3524:2: RULE_END
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
    // InternalKlangParser.g:3534:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3538:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalKlangParser.g:3539:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
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
    // InternalKlangParser.g:3546:1: rule__VariableDeclaration__Group__0__Impl : ( Var ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3550:1: ( ( Var ) )
            // InternalKlangParser.g:3551:1: ( Var )
            {
            // InternalKlangParser.g:3551:1: ( Var )
            // InternalKlangParser.g:3552:2: Var
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
    // InternalKlangParser.g:3561:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3565:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // InternalKlangParser.g:3566:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalKlangParser.g:3573:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3577:1: ( ( ( rule__VariableDeclaration__NameAssignment_1 ) ) )
            // InternalKlangParser.g:3578:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            {
            // InternalKlangParser.g:3578:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            // InternalKlangParser.g:3579:2: ( rule__VariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
            // InternalKlangParser.g:3580:2: ( rule__VariableDeclaration__NameAssignment_1 )
            // InternalKlangParser.g:3580:3: rule__VariableDeclaration__NameAssignment_1
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
    // InternalKlangParser.g:3588:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3592:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // InternalKlangParser.g:3593:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalKlangParser.g:3600:1: rule__VariableDeclaration__Group__2__Impl : ( EqualsSign ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3604:1: ( ( EqualsSign ) )
            // InternalKlangParser.g:3605:1: ( EqualsSign )
            {
            // InternalKlangParser.g:3605:1: ( EqualsSign )
            // InternalKlangParser.g:3606:2: EqualsSign
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
    // InternalKlangParser.g:3615:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3619:1: ( rule__VariableDeclaration__Group__3__Impl )
            // InternalKlangParser.g:3620:2: rule__VariableDeclaration__Group__3__Impl
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
    // InternalKlangParser.g:3626:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__ExpressionAssignment_3 ) ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3630:1: ( ( ( rule__VariableDeclaration__ExpressionAssignment_3 ) ) )
            // InternalKlangParser.g:3631:1: ( ( rule__VariableDeclaration__ExpressionAssignment_3 ) )
            {
            // InternalKlangParser.g:3631:1: ( ( rule__VariableDeclaration__ExpressionAssignment_3 ) )
            // InternalKlangParser.g:3632:2: ( rule__VariableDeclaration__ExpressionAssignment_3 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getExpressionAssignment_3()); 
            // InternalKlangParser.g:3633:2: ( rule__VariableDeclaration__ExpressionAssignment_3 )
            // InternalKlangParser.g:3633:3: rule__VariableDeclaration__ExpressionAssignment_3
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
    // InternalKlangParser.g:3642:1: rule__VariableAssignment__Group__0 : rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1 ;
    public final void rule__VariableAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3646:1: ( rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1 )
            // InternalKlangParser.g:3647:2: rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalKlangParser.g:3654:1: rule__VariableAssignment__Group__0__Impl : ( ( rule__VariableAssignment__VariableNameAssignment_0 ) ) ;
    public final void rule__VariableAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3658:1: ( ( ( rule__VariableAssignment__VariableNameAssignment_0 ) ) )
            // InternalKlangParser.g:3659:1: ( ( rule__VariableAssignment__VariableNameAssignment_0 ) )
            {
            // InternalKlangParser.g:3659:1: ( ( rule__VariableAssignment__VariableNameAssignment_0 ) )
            // InternalKlangParser.g:3660:2: ( rule__VariableAssignment__VariableNameAssignment_0 )
            {
             before(grammarAccess.getVariableAssignmentAccess().getVariableNameAssignment_0()); 
            // InternalKlangParser.g:3661:2: ( rule__VariableAssignment__VariableNameAssignment_0 )
            // InternalKlangParser.g:3661:3: rule__VariableAssignment__VariableNameAssignment_0
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
    // InternalKlangParser.g:3669:1: rule__VariableAssignment__Group__1 : rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2 ;
    public final void rule__VariableAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3673:1: ( rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2 )
            // InternalKlangParser.g:3674:2: rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalKlangParser.g:3681:1: rule__VariableAssignment__Group__1__Impl : ( EqualsSign ) ;
    public final void rule__VariableAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3685:1: ( ( EqualsSign ) )
            // InternalKlangParser.g:3686:1: ( EqualsSign )
            {
            // InternalKlangParser.g:3686:1: ( EqualsSign )
            // InternalKlangParser.g:3687:2: EqualsSign
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
    // InternalKlangParser.g:3696:1: rule__VariableAssignment__Group__2 : rule__VariableAssignment__Group__2__Impl ;
    public final void rule__VariableAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3700:1: ( rule__VariableAssignment__Group__2__Impl )
            // InternalKlangParser.g:3701:2: rule__VariableAssignment__Group__2__Impl
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
    // InternalKlangParser.g:3707:1: rule__VariableAssignment__Group__2__Impl : ( ( rule__VariableAssignment__ExpressionAssignment_2 ) ) ;
    public final void rule__VariableAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3711:1: ( ( ( rule__VariableAssignment__ExpressionAssignment_2 ) ) )
            // InternalKlangParser.g:3712:1: ( ( rule__VariableAssignment__ExpressionAssignment_2 ) )
            {
            // InternalKlangParser.g:3712:1: ( ( rule__VariableAssignment__ExpressionAssignment_2 ) )
            // InternalKlangParser.g:3713:2: ( rule__VariableAssignment__ExpressionAssignment_2 )
            {
             before(grammarAccess.getVariableAssignmentAccess().getExpressionAssignment_2()); 
            // InternalKlangParser.g:3714:2: ( rule__VariableAssignment__ExpressionAssignment_2 )
            // InternalKlangParser.g:3714:3: rule__VariableAssignment__ExpressionAssignment_2
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
    // InternalKlangParser.g:3723:1: rule__Sleep__Group__0 : rule__Sleep__Group__0__Impl rule__Sleep__Group__1 ;
    public final void rule__Sleep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3727:1: ( rule__Sleep__Group__0__Impl rule__Sleep__Group__1 )
            // InternalKlangParser.g:3728:2: rule__Sleep__Group__0__Impl rule__Sleep__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalKlangParser.g:3735:1: rule__Sleep__Group__0__Impl : ( () ) ;
    public final void rule__Sleep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3739:1: ( ( () ) )
            // InternalKlangParser.g:3740:1: ( () )
            {
            // InternalKlangParser.g:3740:1: ( () )
            // InternalKlangParser.g:3741:2: ()
            {
             before(grammarAccess.getSleepAccess().getSleepAction_0()); 
            // InternalKlangParser.g:3742:2: ()
            // InternalKlangParser.g:3742:3: 
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
    // InternalKlangParser.g:3750:1: rule__Sleep__Group__1 : rule__Sleep__Group__1__Impl rule__Sleep__Group__2 ;
    public final void rule__Sleep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3754:1: ( rule__Sleep__Group__1__Impl rule__Sleep__Group__2 )
            // InternalKlangParser.g:3755:2: rule__Sleep__Group__1__Impl rule__Sleep__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalKlangParser.g:3762:1: rule__Sleep__Group__1__Impl : ( Sleep ) ;
    public final void rule__Sleep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3766:1: ( ( Sleep ) )
            // InternalKlangParser.g:3767:1: ( Sleep )
            {
            // InternalKlangParser.g:3767:1: ( Sleep )
            // InternalKlangParser.g:3768:2: Sleep
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
    // InternalKlangParser.g:3777:1: rule__Sleep__Group__2 : rule__Sleep__Group__2__Impl rule__Sleep__Group__3 ;
    public final void rule__Sleep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3781:1: ( rule__Sleep__Group__2__Impl rule__Sleep__Group__3 )
            // InternalKlangParser.g:3782:2: rule__Sleep__Group__2__Impl rule__Sleep__Group__3
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
    // InternalKlangParser.g:3789:1: rule__Sleep__Group__2__Impl : ( LeftParenthesis ) ;
    public final void rule__Sleep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3793:1: ( ( LeftParenthesis ) )
            // InternalKlangParser.g:3794:1: ( LeftParenthesis )
            {
            // InternalKlangParser.g:3794:1: ( LeftParenthesis )
            // InternalKlangParser.g:3795:2: LeftParenthesis
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
    // InternalKlangParser.g:3804:1: rule__Sleep__Group__3 : rule__Sleep__Group__3__Impl rule__Sleep__Group__4 ;
    public final void rule__Sleep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3808:1: ( rule__Sleep__Group__3__Impl rule__Sleep__Group__4 )
            // InternalKlangParser.g:3809:2: rule__Sleep__Group__3__Impl rule__Sleep__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalKlangParser.g:3816:1: rule__Sleep__Group__3__Impl : ( ( rule__Sleep__DurationAssignment_3 ) ) ;
    public final void rule__Sleep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3820:1: ( ( ( rule__Sleep__DurationAssignment_3 ) ) )
            // InternalKlangParser.g:3821:1: ( ( rule__Sleep__DurationAssignment_3 ) )
            {
            // InternalKlangParser.g:3821:1: ( ( rule__Sleep__DurationAssignment_3 ) )
            // InternalKlangParser.g:3822:2: ( rule__Sleep__DurationAssignment_3 )
            {
             before(grammarAccess.getSleepAccess().getDurationAssignment_3()); 
            // InternalKlangParser.g:3823:2: ( rule__Sleep__DurationAssignment_3 )
            // InternalKlangParser.g:3823:3: rule__Sleep__DurationAssignment_3
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
    // InternalKlangParser.g:3831:1: rule__Sleep__Group__4 : rule__Sleep__Group__4__Impl ;
    public final void rule__Sleep__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3835:1: ( rule__Sleep__Group__4__Impl )
            // InternalKlangParser.g:3836:2: rule__Sleep__Group__4__Impl
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
    // InternalKlangParser.g:3842:1: rule__Sleep__Group__4__Impl : ( RightParenthesis ) ;
    public final void rule__Sleep__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3846:1: ( ( RightParenthesis ) )
            // InternalKlangParser.g:3847:1: ( RightParenthesis )
            {
            // InternalKlangParser.g:3847:1: ( RightParenthesis )
            // InternalKlangParser.g:3848:2: RightParenthesis
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
    // InternalKlangParser.g:3858:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3862:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalKlangParser.g:3863:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalKlangParser.g:3870:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3874:1: ( ( ruleAnd ) )
            // InternalKlangParser.g:3875:1: ( ruleAnd )
            {
            // InternalKlangParser.g:3875:1: ( ruleAnd )
            // InternalKlangParser.g:3876:2: ruleAnd
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
    // InternalKlangParser.g:3885:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3889:1: ( rule__Or__Group__1__Impl )
            // InternalKlangParser.g:3890:2: rule__Or__Group__1__Impl
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
    // InternalKlangParser.g:3896:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3900:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalKlangParser.g:3901:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalKlangParser.g:3901:1: ( ( rule__Or__Group_1__0 )* )
            // InternalKlangParser.g:3902:2: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // InternalKlangParser.g:3903:2: ( rule__Or__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==Or) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalKlangParser.g:3903:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Or__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalKlangParser.g:3912:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3916:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalKlangParser.g:3917:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalKlangParser.g:3924:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3928:1: ( ( () ) )
            // InternalKlangParser.g:3929:1: ( () )
            {
            // InternalKlangParser.g:3929:1: ( () )
            // InternalKlangParser.g:3930:2: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // InternalKlangParser.g:3931:2: ()
            // InternalKlangParser.g:3931:3: 
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
    // InternalKlangParser.g:3939:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3943:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalKlangParser.g:3944:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalKlangParser.g:3951:1: rule__Or__Group_1__1__Impl : ( Or ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3955:1: ( ( Or ) )
            // InternalKlangParser.g:3956:1: ( Or )
            {
            // InternalKlangParser.g:3956:1: ( Or )
            // InternalKlangParser.g:3957:2: Or
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
    // InternalKlangParser.g:3966:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3970:1: ( rule__Or__Group_1__2__Impl )
            // InternalKlangParser.g:3971:2: rule__Or__Group_1__2__Impl
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
    // InternalKlangParser.g:3977:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3981:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:3982:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:3982:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalKlangParser.g:3983:2: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:3984:2: ( rule__Or__RightAssignment_1_2 )
            // InternalKlangParser.g:3984:3: rule__Or__RightAssignment_1_2
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
    // InternalKlangParser.g:3993:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:3997:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalKlangParser.g:3998:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalKlangParser.g:4005:1: rule__And__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4009:1: ( ( ruleComparison ) )
            // InternalKlangParser.g:4010:1: ( ruleComparison )
            {
            // InternalKlangParser.g:4010:1: ( ruleComparison )
            // InternalKlangParser.g:4011:2: ruleComparison
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
    // InternalKlangParser.g:4020:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4024:1: ( rule__And__Group__1__Impl )
            // InternalKlangParser.g:4025:2: rule__And__Group__1__Impl
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
    // InternalKlangParser.g:4031:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4035:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalKlangParser.g:4036:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalKlangParser.g:4036:1: ( ( rule__And__Group_1__0 )* )
            // InternalKlangParser.g:4037:2: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // InternalKlangParser.g:4038:2: ( rule__And__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==And) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalKlangParser.g:4038:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__And__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalKlangParser.g:4047:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4051:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalKlangParser.g:4052:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalKlangParser.g:4059:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4063:1: ( ( () ) )
            // InternalKlangParser.g:4064:1: ( () )
            {
            // InternalKlangParser.g:4064:1: ( () )
            // InternalKlangParser.g:4065:2: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // InternalKlangParser.g:4066:2: ()
            // InternalKlangParser.g:4066:3: 
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
    // InternalKlangParser.g:4074:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4078:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalKlangParser.g:4079:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalKlangParser.g:4086:1: rule__And__Group_1__1__Impl : ( And ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4090:1: ( ( And ) )
            // InternalKlangParser.g:4091:1: ( And )
            {
            // InternalKlangParser.g:4091:1: ( And )
            // InternalKlangParser.g:4092:2: And
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
    // InternalKlangParser.g:4101:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4105:1: ( rule__And__Group_1__2__Impl )
            // InternalKlangParser.g:4106:2: rule__And__Group_1__2__Impl
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
    // InternalKlangParser.g:4112:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4116:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:4117:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:4117:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalKlangParser.g:4118:2: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:4119:2: ( rule__And__RightAssignment_1_2 )
            // InternalKlangParser.g:4119:3: rule__And__RightAssignment_1_2
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
    // InternalKlangParser.g:4128:1: rule__Plus__Group__0 : rule__Plus__Group__0__Impl rule__Plus__Group__1 ;
    public final void rule__Plus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4132:1: ( rule__Plus__Group__0__Impl rule__Plus__Group__1 )
            // InternalKlangParser.g:4133:2: rule__Plus__Group__0__Impl rule__Plus__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalKlangParser.g:4140:1: rule__Plus__Group__0__Impl : ( ruleMinus ) ;
    public final void rule__Plus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4144:1: ( ( ruleMinus ) )
            // InternalKlangParser.g:4145:1: ( ruleMinus )
            {
            // InternalKlangParser.g:4145:1: ( ruleMinus )
            // InternalKlangParser.g:4146:2: ruleMinus
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
    // InternalKlangParser.g:4155:1: rule__Plus__Group__1 : rule__Plus__Group__1__Impl ;
    public final void rule__Plus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4159:1: ( rule__Plus__Group__1__Impl )
            // InternalKlangParser.g:4160:2: rule__Plus__Group__1__Impl
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
    // InternalKlangParser.g:4166:1: rule__Plus__Group__1__Impl : ( ( rule__Plus__Group_1__0 )* ) ;
    public final void rule__Plus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4170:1: ( ( ( rule__Plus__Group_1__0 )* ) )
            // InternalKlangParser.g:4171:1: ( ( rule__Plus__Group_1__0 )* )
            {
            // InternalKlangParser.g:4171:1: ( ( rule__Plus__Group_1__0 )* )
            // InternalKlangParser.g:4172:2: ( rule__Plus__Group_1__0 )*
            {
             before(grammarAccess.getPlusAccess().getGroup_1()); 
            // InternalKlangParser.g:4173:2: ( rule__Plus__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==PlusSign) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalKlangParser.g:4173:3: rule__Plus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__Plus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalKlangParser.g:4182:1: rule__Plus__Group_1__0 : rule__Plus__Group_1__0__Impl rule__Plus__Group_1__1 ;
    public final void rule__Plus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4186:1: ( rule__Plus__Group_1__0__Impl rule__Plus__Group_1__1 )
            // InternalKlangParser.g:4187:2: rule__Plus__Group_1__0__Impl rule__Plus__Group_1__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalKlangParser.g:4194:1: rule__Plus__Group_1__0__Impl : ( () ) ;
    public final void rule__Plus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4198:1: ( ( () ) )
            // InternalKlangParser.g:4199:1: ( () )
            {
            // InternalKlangParser.g:4199:1: ( () )
            // InternalKlangParser.g:4200:2: ()
            {
             before(grammarAccess.getPlusAccess().getPlusLeftAction_1_0()); 
            // InternalKlangParser.g:4201:2: ()
            // InternalKlangParser.g:4201:3: 
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
    // InternalKlangParser.g:4209:1: rule__Plus__Group_1__1 : rule__Plus__Group_1__1__Impl rule__Plus__Group_1__2 ;
    public final void rule__Plus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4213:1: ( rule__Plus__Group_1__1__Impl rule__Plus__Group_1__2 )
            // InternalKlangParser.g:4214:2: rule__Plus__Group_1__1__Impl rule__Plus__Group_1__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalKlangParser.g:4221:1: rule__Plus__Group_1__1__Impl : ( PlusSign ) ;
    public final void rule__Plus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4225:1: ( ( PlusSign ) )
            // InternalKlangParser.g:4226:1: ( PlusSign )
            {
            // InternalKlangParser.g:4226:1: ( PlusSign )
            // InternalKlangParser.g:4227:2: PlusSign
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
    // InternalKlangParser.g:4236:1: rule__Plus__Group_1__2 : rule__Plus__Group_1__2__Impl ;
    public final void rule__Plus__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4240:1: ( rule__Plus__Group_1__2__Impl )
            // InternalKlangParser.g:4241:2: rule__Plus__Group_1__2__Impl
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
    // InternalKlangParser.g:4247:1: rule__Plus__Group_1__2__Impl : ( ( rule__Plus__RightAssignment_1_2 ) ) ;
    public final void rule__Plus__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4251:1: ( ( ( rule__Plus__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:4252:1: ( ( rule__Plus__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:4252:1: ( ( rule__Plus__RightAssignment_1_2 ) )
            // InternalKlangParser.g:4253:2: ( rule__Plus__RightAssignment_1_2 )
            {
             before(grammarAccess.getPlusAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:4254:2: ( rule__Plus__RightAssignment_1_2 )
            // InternalKlangParser.g:4254:3: rule__Plus__RightAssignment_1_2
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
    // InternalKlangParser.g:4263:1: rule__Minus__Group__0 : rule__Minus__Group__0__Impl rule__Minus__Group__1 ;
    public final void rule__Minus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4267:1: ( rule__Minus__Group__0__Impl rule__Minus__Group__1 )
            // InternalKlangParser.g:4268:2: rule__Minus__Group__0__Impl rule__Minus__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalKlangParser.g:4275:1: rule__Minus__Group__0__Impl : ( ruleMultiply ) ;
    public final void rule__Minus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4279:1: ( ( ruleMultiply ) )
            // InternalKlangParser.g:4280:1: ( ruleMultiply )
            {
            // InternalKlangParser.g:4280:1: ( ruleMultiply )
            // InternalKlangParser.g:4281:2: ruleMultiply
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
    // InternalKlangParser.g:4290:1: rule__Minus__Group__1 : rule__Minus__Group__1__Impl ;
    public final void rule__Minus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4294:1: ( rule__Minus__Group__1__Impl )
            // InternalKlangParser.g:4295:2: rule__Minus__Group__1__Impl
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
    // InternalKlangParser.g:4301:1: rule__Minus__Group__1__Impl : ( ( rule__Minus__Group_1__0 )* ) ;
    public final void rule__Minus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4305:1: ( ( ( rule__Minus__Group_1__0 )* ) )
            // InternalKlangParser.g:4306:1: ( ( rule__Minus__Group_1__0 )* )
            {
            // InternalKlangParser.g:4306:1: ( ( rule__Minus__Group_1__0 )* )
            // InternalKlangParser.g:4307:2: ( rule__Minus__Group_1__0 )*
            {
             before(grammarAccess.getMinusAccess().getGroup_1()); 
            // InternalKlangParser.g:4308:2: ( rule__Minus__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==HyphenMinus) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalKlangParser.g:4308:3: rule__Minus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__Minus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalKlangParser.g:4317:1: rule__Minus__Group_1__0 : rule__Minus__Group_1__0__Impl rule__Minus__Group_1__1 ;
    public final void rule__Minus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4321:1: ( rule__Minus__Group_1__0__Impl rule__Minus__Group_1__1 )
            // InternalKlangParser.g:4322:2: rule__Minus__Group_1__0__Impl rule__Minus__Group_1__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalKlangParser.g:4329:1: rule__Minus__Group_1__0__Impl : ( () ) ;
    public final void rule__Minus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4333:1: ( ( () ) )
            // InternalKlangParser.g:4334:1: ( () )
            {
            // InternalKlangParser.g:4334:1: ( () )
            // InternalKlangParser.g:4335:2: ()
            {
             before(grammarAccess.getMinusAccess().getMinusLeftAction_1_0()); 
            // InternalKlangParser.g:4336:2: ()
            // InternalKlangParser.g:4336:3: 
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
    // InternalKlangParser.g:4344:1: rule__Minus__Group_1__1 : rule__Minus__Group_1__1__Impl rule__Minus__Group_1__2 ;
    public final void rule__Minus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4348:1: ( rule__Minus__Group_1__1__Impl rule__Minus__Group_1__2 )
            // InternalKlangParser.g:4349:2: rule__Minus__Group_1__1__Impl rule__Minus__Group_1__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalKlangParser.g:4356:1: rule__Minus__Group_1__1__Impl : ( HyphenMinus ) ;
    public final void rule__Minus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4360:1: ( ( HyphenMinus ) )
            // InternalKlangParser.g:4361:1: ( HyphenMinus )
            {
            // InternalKlangParser.g:4361:1: ( HyphenMinus )
            // InternalKlangParser.g:4362:2: HyphenMinus
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
    // InternalKlangParser.g:4371:1: rule__Minus__Group_1__2 : rule__Minus__Group_1__2__Impl ;
    public final void rule__Minus__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4375:1: ( rule__Minus__Group_1__2__Impl )
            // InternalKlangParser.g:4376:2: rule__Minus__Group_1__2__Impl
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
    // InternalKlangParser.g:4382:1: rule__Minus__Group_1__2__Impl : ( ( rule__Minus__RightAssignment_1_2 ) ) ;
    public final void rule__Minus__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4386:1: ( ( ( rule__Minus__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:4387:1: ( ( rule__Minus__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:4387:1: ( ( rule__Minus__RightAssignment_1_2 ) )
            // InternalKlangParser.g:4388:2: ( rule__Minus__RightAssignment_1_2 )
            {
             before(grammarAccess.getMinusAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:4389:2: ( rule__Minus__RightAssignment_1_2 )
            // InternalKlangParser.g:4389:3: rule__Minus__RightAssignment_1_2
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
    // InternalKlangParser.g:4398:1: rule__Multiply__Group__0 : rule__Multiply__Group__0__Impl rule__Multiply__Group__1 ;
    public final void rule__Multiply__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4402:1: ( rule__Multiply__Group__0__Impl rule__Multiply__Group__1 )
            // InternalKlangParser.g:4403:2: rule__Multiply__Group__0__Impl rule__Multiply__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalKlangParser.g:4410:1: rule__Multiply__Group__0__Impl : ( ruleDivide ) ;
    public final void rule__Multiply__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4414:1: ( ( ruleDivide ) )
            // InternalKlangParser.g:4415:1: ( ruleDivide )
            {
            // InternalKlangParser.g:4415:1: ( ruleDivide )
            // InternalKlangParser.g:4416:2: ruleDivide
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
    // InternalKlangParser.g:4425:1: rule__Multiply__Group__1 : rule__Multiply__Group__1__Impl ;
    public final void rule__Multiply__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4429:1: ( rule__Multiply__Group__1__Impl )
            // InternalKlangParser.g:4430:2: rule__Multiply__Group__1__Impl
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
    // InternalKlangParser.g:4436:1: rule__Multiply__Group__1__Impl : ( ( rule__Multiply__Group_1__0 )* ) ;
    public final void rule__Multiply__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4440:1: ( ( ( rule__Multiply__Group_1__0 )* ) )
            // InternalKlangParser.g:4441:1: ( ( rule__Multiply__Group_1__0 )* )
            {
            // InternalKlangParser.g:4441:1: ( ( rule__Multiply__Group_1__0 )* )
            // InternalKlangParser.g:4442:2: ( rule__Multiply__Group_1__0 )*
            {
             before(grammarAccess.getMultiplyAccess().getGroup_1()); 
            // InternalKlangParser.g:4443:2: ( rule__Multiply__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==Asterisk) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalKlangParser.g:4443:3: rule__Multiply__Group_1__0
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__Multiply__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalKlangParser.g:4452:1: rule__Multiply__Group_1__0 : rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1 ;
    public final void rule__Multiply__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4456:1: ( rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1 )
            // InternalKlangParser.g:4457:2: rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalKlangParser.g:4464:1: rule__Multiply__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiply__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4468:1: ( ( () ) )
            // InternalKlangParser.g:4469:1: ( () )
            {
            // InternalKlangParser.g:4469:1: ( () )
            // InternalKlangParser.g:4470:2: ()
            {
             before(grammarAccess.getMultiplyAccess().getMultiplyLeftAction_1_0()); 
            // InternalKlangParser.g:4471:2: ()
            // InternalKlangParser.g:4471:3: 
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
    // InternalKlangParser.g:4479:1: rule__Multiply__Group_1__1 : rule__Multiply__Group_1__1__Impl rule__Multiply__Group_1__2 ;
    public final void rule__Multiply__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4483:1: ( rule__Multiply__Group_1__1__Impl rule__Multiply__Group_1__2 )
            // InternalKlangParser.g:4484:2: rule__Multiply__Group_1__1__Impl rule__Multiply__Group_1__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalKlangParser.g:4491:1: rule__Multiply__Group_1__1__Impl : ( Asterisk ) ;
    public final void rule__Multiply__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4495:1: ( ( Asterisk ) )
            // InternalKlangParser.g:4496:1: ( Asterisk )
            {
            // InternalKlangParser.g:4496:1: ( Asterisk )
            // InternalKlangParser.g:4497:2: Asterisk
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
    // InternalKlangParser.g:4506:1: rule__Multiply__Group_1__2 : rule__Multiply__Group_1__2__Impl ;
    public final void rule__Multiply__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4510:1: ( rule__Multiply__Group_1__2__Impl )
            // InternalKlangParser.g:4511:2: rule__Multiply__Group_1__2__Impl
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
    // InternalKlangParser.g:4517:1: rule__Multiply__Group_1__2__Impl : ( ( rule__Multiply__RightAssignment_1_2 ) ) ;
    public final void rule__Multiply__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4521:1: ( ( ( rule__Multiply__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:4522:1: ( ( rule__Multiply__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:4522:1: ( ( rule__Multiply__RightAssignment_1_2 ) )
            // InternalKlangParser.g:4523:2: ( rule__Multiply__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplyAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:4524:2: ( rule__Multiply__RightAssignment_1_2 )
            // InternalKlangParser.g:4524:3: rule__Multiply__RightAssignment_1_2
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
    // InternalKlangParser.g:4533:1: rule__Divide__Group__0 : rule__Divide__Group__0__Impl rule__Divide__Group__1 ;
    public final void rule__Divide__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4537:1: ( rule__Divide__Group__0__Impl rule__Divide__Group__1 )
            // InternalKlangParser.g:4538:2: rule__Divide__Group__0__Impl rule__Divide__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalKlangParser.g:4545:1: rule__Divide__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__Divide__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4549:1: ( ( rulePrimaryExpression ) )
            // InternalKlangParser.g:4550:1: ( rulePrimaryExpression )
            {
            // InternalKlangParser.g:4550:1: ( rulePrimaryExpression )
            // InternalKlangParser.g:4551:2: rulePrimaryExpression
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
    // InternalKlangParser.g:4560:1: rule__Divide__Group__1 : rule__Divide__Group__1__Impl ;
    public final void rule__Divide__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4564:1: ( rule__Divide__Group__1__Impl )
            // InternalKlangParser.g:4565:2: rule__Divide__Group__1__Impl
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
    // InternalKlangParser.g:4571:1: rule__Divide__Group__1__Impl : ( ( rule__Divide__Group_1__0 )* ) ;
    public final void rule__Divide__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4575:1: ( ( ( rule__Divide__Group_1__0 )* ) )
            // InternalKlangParser.g:4576:1: ( ( rule__Divide__Group_1__0 )* )
            {
            // InternalKlangParser.g:4576:1: ( ( rule__Divide__Group_1__0 )* )
            // InternalKlangParser.g:4577:2: ( rule__Divide__Group_1__0 )*
            {
             before(grammarAccess.getDivideAccess().getGroup_1()); 
            // InternalKlangParser.g:4578:2: ( rule__Divide__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==Solidus) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalKlangParser.g:4578:3: rule__Divide__Group_1__0
            	    {
            	    pushFollow(FOLLOW_46);
            	    rule__Divide__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalKlangParser.g:4587:1: rule__Divide__Group_1__0 : rule__Divide__Group_1__0__Impl rule__Divide__Group_1__1 ;
    public final void rule__Divide__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4591:1: ( rule__Divide__Group_1__0__Impl rule__Divide__Group_1__1 )
            // InternalKlangParser.g:4592:2: rule__Divide__Group_1__0__Impl rule__Divide__Group_1__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalKlangParser.g:4599:1: rule__Divide__Group_1__0__Impl : ( () ) ;
    public final void rule__Divide__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4603:1: ( ( () ) )
            // InternalKlangParser.g:4604:1: ( () )
            {
            // InternalKlangParser.g:4604:1: ( () )
            // InternalKlangParser.g:4605:2: ()
            {
             before(grammarAccess.getDivideAccess().getDivideLeftAction_1_0()); 
            // InternalKlangParser.g:4606:2: ()
            // InternalKlangParser.g:4606:3: 
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
    // InternalKlangParser.g:4614:1: rule__Divide__Group_1__1 : rule__Divide__Group_1__1__Impl rule__Divide__Group_1__2 ;
    public final void rule__Divide__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4618:1: ( rule__Divide__Group_1__1__Impl rule__Divide__Group_1__2 )
            // InternalKlangParser.g:4619:2: rule__Divide__Group_1__1__Impl rule__Divide__Group_1__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalKlangParser.g:4626:1: rule__Divide__Group_1__1__Impl : ( Solidus ) ;
    public final void rule__Divide__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4630:1: ( ( Solidus ) )
            // InternalKlangParser.g:4631:1: ( Solidus )
            {
            // InternalKlangParser.g:4631:1: ( Solidus )
            // InternalKlangParser.g:4632:2: Solidus
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
    // InternalKlangParser.g:4641:1: rule__Divide__Group_1__2 : rule__Divide__Group_1__2__Impl ;
    public final void rule__Divide__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4645:1: ( rule__Divide__Group_1__2__Impl )
            // InternalKlangParser.g:4646:2: rule__Divide__Group_1__2__Impl
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
    // InternalKlangParser.g:4652:1: rule__Divide__Group_1__2__Impl : ( ( rule__Divide__RightAssignment_1_2 ) ) ;
    public final void rule__Divide__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4656:1: ( ( ( rule__Divide__RightAssignment_1_2 ) ) )
            // InternalKlangParser.g:4657:1: ( ( rule__Divide__RightAssignment_1_2 ) )
            {
            // InternalKlangParser.g:4657:1: ( ( rule__Divide__RightAssignment_1_2 ) )
            // InternalKlangParser.g:4658:2: ( rule__Divide__RightAssignment_1_2 )
            {
             before(grammarAccess.getDivideAccess().getRightAssignment_1_2()); 
            // InternalKlangParser.g:4659:2: ( rule__Divide__RightAssignment_1_2 )
            // InternalKlangParser.g:4659:3: rule__Divide__RightAssignment_1_2
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
    // InternalKlangParser.g:4668:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4672:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalKlangParser.g:4673:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalKlangParser.g:4680:1: rule__Comparison__Group__0__Impl : ( rulePlus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4684:1: ( ( rulePlus ) )
            // InternalKlangParser.g:4685:1: ( rulePlus )
            {
            // InternalKlangParser.g:4685:1: ( rulePlus )
            // InternalKlangParser.g:4686:2: rulePlus
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
    // InternalKlangParser.g:4695:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4699:1: ( rule__Comparison__Group__1__Impl )
            // InternalKlangParser.g:4700:2: rule__Comparison__Group__1__Impl
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
    // InternalKlangParser.g:4706:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4710:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalKlangParser.g:4711:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalKlangParser.g:4711:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalKlangParser.g:4712:2: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // InternalKlangParser.g:4713:2: ( rule__Comparison__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==EqualsSignEqualsSign||LA31_0==LessThanSign||LA31_0==GreaterThanSign) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalKlangParser.g:4713:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalKlangParser.g:4722:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4726:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalKlangParser.g:4727:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalKlangParser.g:4734:1: rule__Comparison__Group_1__0__Impl : ( ( rule__Comparison__Alternatives_1_0 ) ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4738:1: ( ( ( rule__Comparison__Alternatives_1_0 ) ) )
            // InternalKlangParser.g:4739:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            {
            // InternalKlangParser.g:4739:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            // InternalKlangParser.g:4740:2: ( rule__Comparison__Alternatives_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getAlternatives_1_0()); 
            // InternalKlangParser.g:4741:2: ( rule__Comparison__Alternatives_1_0 )
            // InternalKlangParser.g:4741:3: rule__Comparison__Alternatives_1_0
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
    // InternalKlangParser.g:4749:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4753:1: ( rule__Comparison__Group_1__1__Impl )
            // InternalKlangParser.g:4754:2: rule__Comparison__Group_1__1__Impl
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
    // InternalKlangParser.g:4760:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__RightAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4764:1: ( ( ( rule__Comparison__RightAssignment_1_1 ) ) )
            // InternalKlangParser.g:4765:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            {
            // InternalKlangParser.g:4765:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            // InternalKlangParser.g:4766:2: ( rule__Comparison__RightAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_1()); 
            // InternalKlangParser.g:4767:2: ( rule__Comparison__RightAssignment_1_1 )
            // InternalKlangParser.g:4767:3: rule__Comparison__RightAssignment_1_1
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
    // InternalKlangParser.g:4776:1: rule__Comparison__Group_1_0_0__0 : rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 ;
    public final void rule__Comparison__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4780:1: ( rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 )
            // InternalKlangParser.g:4781:2: rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1
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
    // InternalKlangParser.g:4788:1: rule__Comparison__Group_1_0_0__0__Impl : ( LessThanSign ) ;
    public final void rule__Comparison__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4792:1: ( ( LessThanSign ) )
            // InternalKlangParser.g:4793:1: ( LessThanSign )
            {
            // InternalKlangParser.g:4793:1: ( LessThanSign )
            // InternalKlangParser.g:4794:2: LessThanSign
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
    // InternalKlangParser.g:4803:1: rule__Comparison__Group_1_0_0__1 : rule__Comparison__Group_1_0_0__1__Impl ;
    public final void rule__Comparison__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4807:1: ( rule__Comparison__Group_1_0_0__1__Impl )
            // InternalKlangParser.g:4808:2: rule__Comparison__Group_1_0_0__1__Impl
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
    // InternalKlangParser.g:4814:1: rule__Comparison__Group_1_0_0__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4818:1: ( ( () ) )
            // InternalKlangParser.g:4819:1: ( () )
            {
            // InternalKlangParser.g:4819:1: ( () )
            // InternalKlangParser.g:4820:2: ()
            {
             before(grammarAccess.getComparisonAccess().getLessThanLeftAction_1_0_0_1()); 
            // InternalKlangParser.g:4821:2: ()
            // InternalKlangParser.g:4821:3: 
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
    // InternalKlangParser.g:4830:1: rule__Comparison__Group_1_0_1__0 : rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 ;
    public final void rule__Comparison__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4834:1: ( rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 )
            // InternalKlangParser.g:4835:2: rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1
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
    // InternalKlangParser.g:4842:1: rule__Comparison__Group_1_0_1__0__Impl : ( EqualsSignEqualsSign ) ;
    public final void rule__Comparison__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4846:1: ( ( EqualsSignEqualsSign ) )
            // InternalKlangParser.g:4847:1: ( EqualsSignEqualsSign )
            {
            // InternalKlangParser.g:4847:1: ( EqualsSignEqualsSign )
            // InternalKlangParser.g:4848:2: EqualsSignEqualsSign
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
    // InternalKlangParser.g:4857:1: rule__Comparison__Group_1_0_1__1 : rule__Comparison__Group_1_0_1__1__Impl ;
    public final void rule__Comparison__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4861:1: ( rule__Comparison__Group_1_0_1__1__Impl )
            // InternalKlangParser.g:4862:2: rule__Comparison__Group_1_0_1__1__Impl
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
    // InternalKlangParser.g:4868:1: rule__Comparison__Group_1_0_1__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4872:1: ( ( () ) )
            // InternalKlangParser.g:4873:1: ( () )
            {
            // InternalKlangParser.g:4873:1: ( () )
            // InternalKlangParser.g:4874:2: ()
            {
             before(grammarAccess.getComparisonAccess().getEqualLeftAction_1_0_1_1()); 
            // InternalKlangParser.g:4875:2: ()
            // InternalKlangParser.g:4875:3: 
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
    // InternalKlangParser.g:4884:1: rule__Comparison__Group_1_0_2__0 : rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1 ;
    public final void rule__Comparison__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4888:1: ( rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1 )
            // InternalKlangParser.g:4889:2: rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1
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
    // InternalKlangParser.g:4896:1: rule__Comparison__Group_1_0_2__0__Impl : ( GreaterThanSign ) ;
    public final void rule__Comparison__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4900:1: ( ( GreaterThanSign ) )
            // InternalKlangParser.g:4901:1: ( GreaterThanSign )
            {
            // InternalKlangParser.g:4901:1: ( GreaterThanSign )
            // InternalKlangParser.g:4902:2: GreaterThanSign
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
    // InternalKlangParser.g:4911:1: rule__Comparison__Group_1_0_2__1 : rule__Comparison__Group_1_0_2__1__Impl ;
    public final void rule__Comparison__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4915:1: ( rule__Comparison__Group_1_0_2__1__Impl )
            // InternalKlangParser.g:4916:2: rule__Comparison__Group_1_0_2__1__Impl
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
    // InternalKlangParser.g:4922:1: rule__Comparison__Group_1_0_2__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4926:1: ( ( () ) )
            // InternalKlangParser.g:4927:1: ( () )
            {
            // InternalKlangParser.g:4927:1: ( () )
            // InternalKlangParser.g:4928:2: ()
            {
             before(grammarAccess.getComparisonAccess().getGreaterThanLeftAction_1_0_2_1()); 
            // InternalKlangParser.g:4929:2: ()
            // InternalKlangParser.g:4929:3: 
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
    // InternalKlangParser.g:4938:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4942:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // InternalKlangParser.g:4943:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalKlangParser.g:4950:1: rule__FunctionCall__Group__0__Impl : ( ( rule__FunctionCall__NameAssignment_0 ) ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4954:1: ( ( ( rule__FunctionCall__NameAssignment_0 ) ) )
            // InternalKlangParser.g:4955:1: ( ( rule__FunctionCall__NameAssignment_0 ) )
            {
            // InternalKlangParser.g:4955:1: ( ( rule__FunctionCall__NameAssignment_0 ) )
            // InternalKlangParser.g:4956:2: ( rule__FunctionCall__NameAssignment_0 )
            {
             before(grammarAccess.getFunctionCallAccess().getNameAssignment_0()); 
            // InternalKlangParser.g:4957:2: ( rule__FunctionCall__NameAssignment_0 )
            // InternalKlangParser.g:4957:3: rule__FunctionCall__NameAssignment_0
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
    // InternalKlangParser.g:4965:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4969:1: ( rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 )
            // InternalKlangParser.g:4970:2: rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2
            {
            pushFollow(FOLLOW_49);
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
    // InternalKlangParser.g:4977:1: rule__FunctionCall__Group__1__Impl : ( LeftParenthesis ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4981:1: ( ( LeftParenthesis ) )
            // InternalKlangParser.g:4982:1: ( LeftParenthesis )
            {
            // InternalKlangParser.g:4982:1: ( LeftParenthesis )
            // InternalKlangParser.g:4983:2: LeftParenthesis
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
    // InternalKlangParser.g:4992:1: rule__FunctionCall__Group__2 : rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 ;
    public final void rule__FunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:4996:1: ( rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 )
            // InternalKlangParser.g:4997:2: rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3
            {
            pushFollow(FOLLOW_49);
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
    // InternalKlangParser.g:5004:1: rule__FunctionCall__Group__2__Impl : ( ( rule__FunctionCall__Group_2__0 )? ) ;
    public final void rule__FunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5008:1: ( ( ( rule__FunctionCall__Group_2__0 )? ) )
            // InternalKlangParser.g:5009:1: ( ( rule__FunctionCall__Group_2__0 )? )
            {
            // InternalKlangParser.g:5009:1: ( ( rule__FunctionCall__Group_2__0 )? )
            // InternalKlangParser.g:5010:2: ( rule__FunctionCall__Group_2__0 )?
            {
             before(grammarAccess.getFunctionCallAccess().getGroup_2()); 
            // InternalKlangParser.g:5011:2: ( rule__FunctionCall__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==False||LA32_0==True||LA32_0==Not||LA32_0==LeftParenthesis||LA32_0==HyphenMinus||(LA32_0>=RULE_ID && LA32_0<=RULE_STRING)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalKlangParser.g:5011:3: rule__FunctionCall__Group_2__0
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
    // InternalKlangParser.g:5019:1: rule__FunctionCall__Group__3 : rule__FunctionCall__Group__3__Impl ;
    public final void rule__FunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5023:1: ( rule__FunctionCall__Group__3__Impl )
            // InternalKlangParser.g:5024:2: rule__FunctionCall__Group__3__Impl
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
    // InternalKlangParser.g:5030:1: rule__FunctionCall__Group__3__Impl : ( RightParenthesis ) ;
    public final void rule__FunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5034:1: ( ( RightParenthesis ) )
            // InternalKlangParser.g:5035:1: ( RightParenthesis )
            {
            // InternalKlangParser.g:5035:1: ( RightParenthesis )
            // InternalKlangParser.g:5036:2: RightParenthesis
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
    // InternalKlangParser.g:5046:1: rule__FunctionCall__Group_2__0 : rule__FunctionCall__Group_2__0__Impl rule__FunctionCall__Group_2__1 ;
    public final void rule__FunctionCall__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5050:1: ( rule__FunctionCall__Group_2__0__Impl rule__FunctionCall__Group_2__1 )
            // InternalKlangParser.g:5051:2: rule__FunctionCall__Group_2__0__Impl rule__FunctionCall__Group_2__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalKlangParser.g:5058:1: rule__FunctionCall__Group_2__0__Impl : ( ( rule__FunctionCall__ParametersAssignment_2_0 ) ) ;
    public final void rule__FunctionCall__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5062:1: ( ( ( rule__FunctionCall__ParametersAssignment_2_0 ) ) )
            // InternalKlangParser.g:5063:1: ( ( rule__FunctionCall__ParametersAssignment_2_0 ) )
            {
            // InternalKlangParser.g:5063:1: ( ( rule__FunctionCall__ParametersAssignment_2_0 ) )
            // InternalKlangParser.g:5064:2: ( rule__FunctionCall__ParametersAssignment_2_0 )
            {
             before(grammarAccess.getFunctionCallAccess().getParametersAssignment_2_0()); 
            // InternalKlangParser.g:5065:2: ( rule__FunctionCall__ParametersAssignment_2_0 )
            // InternalKlangParser.g:5065:3: rule__FunctionCall__ParametersAssignment_2_0
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
    // InternalKlangParser.g:5073:1: rule__FunctionCall__Group_2__1 : rule__FunctionCall__Group_2__1__Impl ;
    public final void rule__FunctionCall__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5077:1: ( rule__FunctionCall__Group_2__1__Impl )
            // InternalKlangParser.g:5078:2: rule__FunctionCall__Group_2__1__Impl
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
    // InternalKlangParser.g:5084:1: rule__FunctionCall__Group_2__1__Impl : ( ( rule__FunctionCall__Group_2_1__0 )* ) ;
    public final void rule__FunctionCall__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5088:1: ( ( ( rule__FunctionCall__Group_2_1__0 )* ) )
            // InternalKlangParser.g:5089:1: ( ( rule__FunctionCall__Group_2_1__0 )* )
            {
            // InternalKlangParser.g:5089:1: ( ( rule__FunctionCall__Group_2_1__0 )* )
            // InternalKlangParser.g:5090:2: ( rule__FunctionCall__Group_2_1__0 )*
            {
             before(grammarAccess.getFunctionCallAccess().getGroup_2_1()); 
            // InternalKlangParser.g:5091:2: ( rule__FunctionCall__Group_2_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==Comma) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalKlangParser.g:5091:3: rule__FunctionCall__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_51);
            	    rule__FunctionCall__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalKlangParser.g:5100:1: rule__FunctionCall__Group_2_1__0 : rule__FunctionCall__Group_2_1__0__Impl rule__FunctionCall__Group_2_1__1 ;
    public final void rule__FunctionCall__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5104:1: ( rule__FunctionCall__Group_2_1__0__Impl rule__FunctionCall__Group_2_1__1 )
            // InternalKlangParser.g:5105:2: rule__FunctionCall__Group_2_1__0__Impl rule__FunctionCall__Group_2_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalKlangParser.g:5112:1: rule__FunctionCall__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__FunctionCall__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5116:1: ( ( Comma ) )
            // InternalKlangParser.g:5117:1: ( Comma )
            {
            // InternalKlangParser.g:5117:1: ( Comma )
            // InternalKlangParser.g:5118:2: Comma
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
    // InternalKlangParser.g:5127:1: rule__FunctionCall__Group_2_1__1 : rule__FunctionCall__Group_2_1__1__Impl ;
    public final void rule__FunctionCall__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5131:1: ( rule__FunctionCall__Group_2_1__1__Impl )
            // InternalKlangParser.g:5132:2: rule__FunctionCall__Group_2_1__1__Impl
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
    // InternalKlangParser.g:5138:1: rule__FunctionCall__Group_2_1__1__Impl : ( ( rule__FunctionCall__ParametersAssignment_2_1_1 ) ) ;
    public final void rule__FunctionCall__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5142:1: ( ( ( rule__FunctionCall__ParametersAssignment_2_1_1 ) ) )
            // InternalKlangParser.g:5143:1: ( ( rule__FunctionCall__ParametersAssignment_2_1_1 ) )
            {
            // InternalKlangParser.g:5143:1: ( ( rule__FunctionCall__ParametersAssignment_2_1_1 ) )
            // InternalKlangParser.g:5144:2: ( rule__FunctionCall__ParametersAssignment_2_1_1 )
            {
             before(grammarAccess.getFunctionCallAccess().getParametersAssignment_2_1_1()); 
            // InternalKlangParser.g:5145:2: ( rule__FunctionCall__ParametersAssignment_2_1_1 )
            // InternalKlangParser.g:5145:3: rule__FunctionCall__ParametersAssignment_2_1_1
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
    // InternalKlangParser.g:5154:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5158:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // InternalKlangParser.g:5159:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalKlangParser.g:5166:1: rule__PrimaryExpression__Group_0__0__Impl : ( LeftParenthesis ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5170:1: ( ( LeftParenthesis ) )
            // InternalKlangParser.g:5171:1: ( LeftParenthesis )
            {
            // InternalKlangParser.g:5171:1: ( LeftParenthesis )
            // InternalKlangParser.g:5172:2: LeftParenthesis
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
    // InternalKlangParser.g:5181:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5185:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // InternalKlangParser.g:5186:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalKlangParser.g:5193:1: rule__PrimaryExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5197:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:5198:1: ( ruleExpression )
            {
            // InternalKlangParser.g:5198:1: ( ruleExpression )
            // InternalKlangParser.g:5199:2: ruleExpression
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
    // InternalKlangParser.g:5208:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5212:1: ( rule__PrimaryExpression__Group_0__2__Impl )
            // InternalKlangParser.g:5213:2: rule__PrimaryExpression__Group_0__2__Impl
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
    // InternalKlangParser.g:5219:1: rule__PrimaryExpression__Group_0__2__Impl : ( RightParenthesis ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5223:1: ( ( RightParenthesis ) )
            // InternalKlangParser.g:5224:1: ( RightParenthesis )
            {
            // InternalKlangParser.g:5224:1: ( RightParenthesis )
            // InternalKlangParser.g:5225:2: RightParenthesis
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
    // InternalKlangParser.g:5235:1: rule__PrimaryExpression__Group_1__0 : rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 ;
    public final void rule__PrimaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5239:1: ( rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 )
            // InternalKlangParser.g:5240:2: rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalKlangParser.g:5247:1: rule__PrimaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5251:1: ( ( () ) )
            // InternalKlangParser.g:5252:1: ( () )
            {
            // InternalKlangParser.g:5252:1: ( () )
            // InternalKlangParser.g:5253:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNotAction_1_0()); 
            // InternalKlangParser.g:5254:2: ()
            // InternalKlangParser.g:5254:3: 
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
    // InternalKlangParser.g:5262:1: rule__PrimaryExpression__Group_1__1 : rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2 ;
    public final void rule__PrimaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5266:1: ( rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2 )
            // InternalKlangParser.g:5267:2: rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalKlangParser.g:5274:1: rule__PrimaryExpression__Group_1__1__Impl : ( Not ) ;
    public final void rule__PrimaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5278:1: ( ( Not ) )
            // InternalKlangParser.g:5279:1: ( Not )
            {
            // InternalKlangParser.g:5279:1: ( Not )
            // InternalKlangParser.g:5280:2: Not
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
    // InternalKlangParser.g:5289:1: rule__PrimaryExpression__Group_1__2 : rule__PrimaryExpression__Group_1__2__Impl ;
    public final void rule__PrimaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5293:1: ( rule__PrimaryExpression__Group_1__2__Impl )
            // InternalKlangParser.g:5294:2: rule__PrimaryExpression__Group_1__2__Impl
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
    // InternalKlangParser.g:5300:1: rule__PrimaryExpression__Group_1__2__Impl : ( ( rule__PrimaryExpression__ExpressionAssignment_1_2 ) ) ;
    public final void rule__PrimaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5304:1: ( ( ( rule__PrimaryExpression__ExpressionAssignment_1_2 ) ) )
            // InternalKlangParser.g:5305:1: ( ( rule__PrimaryExpression__ExpressionAssignment_1_2 ) )
            {
            // InternalKlangParser.g:5305:1: ( ( rule__PrimaryExpression__ExpressionAssignment_1_2 ) )
            // InternalKlangParser.g:5306:2: ( rule__PrimaryExpression__ExpressionAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionAssignment_1_2()); 
            // InternalKlangParser.g:5307:2: ( rule__PrimaryExpression__ExpressionAssignment_1_2 )
            // InternalKlangParser.g:5307:3: rule__PrimaryExpression__ExpressionAssignment_1_2
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
    // InternalKlangParser.g:5316:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5320:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // InternalKlangParser.g:5321:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalKlangParser.g:5328:1: rule__PrimaryExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5332:1: ( ( () ) )
            // InternalKlangParser.g:5333:1: ( () )
            {
            // InternalKlangParser.g:5333:1: ( () )
            // InternalKlangParser.g:5334:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getUnaryMinusAction_2_0()); 
            // InternalKlangParser.g:5335:2: ()
            // InternalKlangParser.g:5335:3: 
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
    // InternalKlangParser.g:5343:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5347:1: ( rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 )
            // InternalKlangParser.g:5348:2: rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalKlangParser.g:5355:1: rule__PrimaryExpression__Group_2__1__Impl : ( HyphenMinus ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5359:1: ( ( HyphenMinus ) )
            // InternalKlangParser.g:5360:1: ( HyphenMinus )
            {
            // InternalKlangParser.g:5360:1: ( HyphenMinus )
            // InternalKlangParser.g:5361:2: HyphenMinus
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
    // InternalKlangParser.g:5370:1: rule__PrimaryExpression__Group_2__2 : rule__PrimaryExpression__Group_2__2__Impl ;
    public final void rule__PrimaryExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5374:1: ( rule__PrimaryExpression__Group_2__2__Impl )
            // InternalKlangParser.g:5375:2: rule__PrimaryExpression__Group_2__2__Impl
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
    // InternalKlangParser.g:5381:1: rule__PrimaryExpression__Group_2__2__Impl : ( ( rule__PrimaryExpression__ExpressionAssignment_2_2 ) ) ;
    public final void rule__PrimaryExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5385:1: ( ( ( rule__PrimaryExpression__ExpressionAssignment_2_2 ) ) )
            // InternalKlangParser.g:5386:1: ( ( rule__PrimaryExpression__ExpressionAssignment_2_2 ) )
            {
            // InternalKlangParser.g:5386:1: ( ( rule__PrimaryExpression__ExpressionAssignment_2_2 ) )
            // InternalKlangParser.g:5387:2: ( rule__PrimaryExpression__ExpressionAssignment_2_2 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionAssignment_2_2()); 
            // InternalKlangParser.g:5388:2: ( rule__PrimaryExpression__ExpressionAssignment_2_2 )
            // InternalKlangParser.g:5388:3: rule__PrimaryExpression__ExpressionAssignment_2_2
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
    // InternalKlangParser.g:5397:1: rule__PrimaryExpression__Group_3__0 : rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 ;
    public final void rule__PrimaryExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5401:1: ( rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 )
            // InternalKlangParser.g:5402:2: rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalKlangParser.g:5409:1: rule__PrimaryExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5413:1: ( ( () ) )
            // InternalKlangParser.g:5414:1: ( () )
            {
            // InternalKlangParser.g:5414:1: ( () )
            // InternalKlangParser.g:5415:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getToDoubleAction_3_0()); 
            // InternalKlangParser.g:5416:2: ()
            // InternalKlangParser.g:5416:3: 
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
    // InternalKlangParser.g:5424:1: rule__PrimaryExpression__Group_3__1 : rule__PrimaryExpression__Group_3__1__Impl rule__PrimaryExpression__Group_3__2 ;
    public final void rule__PrimaryExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5428:1: ( rule__PrimaryExpression__Group_3__1__Impl rule__PrimaryExpression__Group_3__2 )
            // InternalKlangParser.g:5429:2: rule__PrimaryExpression__Group_3__1__Impl rule__PrimaryExpression__Group_3__2
            {
            pushFollow(FOLLOW_53);
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
    // InternalKlangParser.g:5436:1: rule__PrimaryExpression__Group_3__1__Impl : ( LeftParenthesis ) ;
    public final void rule__PrimaryExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5440:1: ( ( LeftParenthesis ) )
            // InternalKlangParser.g:5441:1: ( LeftParenthesis )
            {
            // InternalKlangParser.g:5441:1: ( LeftParenthesis )
            // InternalKlangParser.g:5442:2: LeftParenthesis
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
    // InternalKlangParser.g:5451:1: rule__PrimaryExpression__Group_3__2 : rule__PrimaryExpression__Group_3__2__Impl rule__PrimaryExpression__Group_3__3 ;
    public final void rule__PrimaryExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5455:1: ( rule__PrimaryExpression__Group_3__2__Impl rule__PrimaryExpression__Group_3__3 )
            // InternalKlangParser.g:5456:2: rule__PrimaryExpression__Group_3__2__Impl rule__PrimaryExpression__Group_3__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalKlangParser.g:5463:1: rule__PrimaryExpression__Group_3__2__Impl : ( Double ) ;
    public final void rule__PrimaryExpression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5467:1: ( ( Double ) )
            // InternalKlangParser.g:5468:1: ( Double )
            {
            // InternalKlangParser.g:5468:1: ( Double )
            // InternalKlangParser.g:5469:2: Double
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
    // InternalKlangParser.g:5478:1: rule__PrimaryExpression__Group_3__3 : rule__PrimaryExpression__Group_3__3__Impl rule__PrimaryExpression__Group_3__4 ;
    public final void rule__PrimaryExpression__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5482:1: ( rule__PrimaryExpression__Group_3__3__Impl rule__PrimaryExpression__Group_3__4 )
            // InternalKlangParser.g:5483:2: rule__PrimaryExpression__Group_3__3__Impl rule__PrimaryExpression__Group_3__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalKlangParser.g:5490:1: rule__PrimaryExpression__Group_3__3__Impl : ( RightParenthesis ) ;
    public final void rule__PrimaryExpression__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5494:1: ( ( RightParenthesis ) )
            // InternalKlangParser.g:5495:1: ( RightParenthesis )
            {
            // InternalKlangParser.g:5495:1: ( RightParenthesis )
            // InternalKlangParser.g:5496:2: RightParenthesis
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
    // InternalKlangParser.g:5505:1: rule__PrimaryExpression__Group_3__4 : rule__PrimaryExpression__Group_3__4__Impl ;
    public final void rule__PrimaryExpression__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5509:1: ( rule__PrimaryExpression__Group_3__4__Impl )
            // InternalKlangParser.g:5510:2: rule__PrimaryExpression__Group_3__4__Impl
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
    // InternalKlangParser.g:5516:1: rule__PrimaryExpression__Group_3__4__Impl : ( ( rule__PrimaryExpression__ExpressionAssignment_3_4 ) ) ;
    public final void rule__PrimaryExpression__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5520:1: ( ( ( rule__PrimaryExpression__ExpressionAssignment_3_4 ) ) )
            // InternalKlangParser.g:5521:1: ( ( rule__PrimaryExpression__ExpressionAssignment_3_4 ) )
            {
            // InternalKlangParser.g:5521:1: ( ( rule__PrimaryExpression__ExpressionAssignment_3_4 ) )
            // InternalKlangParser.g:5522:2: ( rule__PrimaryExpression__ExpressionAssignment_3_4 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionAssignment_3_4()); 
            // InternalKlangParser.g:5523:2: ( rule__PrimaryExpression__ExpressionAssignment_3_4 )
            // InternalKlangParser.g:5523:3: rule__PrimaryExpression__ExpressionAssignment_3_4
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
    // InternalKlangParser.g:5532:1: rule__PrimaryExpression__Group_4__0 : rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 ;
    public final void rule__PrimaryExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5536:1: ( rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 )
            // InternalKlangParser.g:5537:2: rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalKlangParser.g:5544:1: rule__PrimaryExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5548:1: ( ( () ) )
            // InternalKlangParser.g:5549:1: ( () )
            {
            // InternalKlangParser.g:5549:1: ( () )
            // InternalKlangParser.g:5550:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getToIntAction_4_0()); 
            // InternalKlangParser.g:5551:2: ()
            // InternalKlangParser.g:5551:3: 
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
    // InternalKlangParser.g:5559:1: rule__PrimaryExpression__Group_4__1 : rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2 ;
    public final void rule__PrimaryExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5563:1: ( rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2 )
            // InternalKlangParser.g:5564:2: rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2
            {
            pushFollow(FOLLOW_54);
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
    // InternalKlangParser.g:5571:1: rule__PrimaryExpression__Group_4__1__Impl : ( LeftParenthesis ) ;
    public final void rule__PrimaryExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5575:1: ( ( LeftParenthesis ) )
            // InternalKlangParser.g:5576:1: ( LeftParenthesis )
            {
            // InternalKlangParser.g:5576:1: ( LeftParenthesis )
            // InternalKlangParser.g:5577:2: LeftParenthesis
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
    // InternalKlangParser.g:5586:1: rule__PrimaryExpression__Group_4__2 : rule__PrimaryExpression__Group_4__2__Impl rule__PrimaryExpression__Group_4__3 ;
    public final void rule__PrimaryExpression__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5590:1: ( rule__PrimaryExpression__Group_4__2__Impl rule__PrimaryExpression__Group_4__3 )
            // InternalKlangParser.g:5591:2: rule__PrimaryExpression__Group_4__2__Impl rule__PrimaryExpression__Group_4__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalKlangParser.g:5598:1: rule__PrimaryExpression__Group_4__2__Impl : ( Int ) ;
    public final void rule__PrimaryExpression__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5602:1: ( ( Int ) )
            // InternalKlangParser.g:5603:1: ( Int )
            {
            // InternalKlangParser.g:5603:1: ( Int )
            // InternalKlangParser.g:5604:2: Int
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
    // InternalKlangParser.g:5613:1: rule__PrimaryExpression__Group_4__3 : rule__PrimaryExpression__Group_4__3__Impl rule__PrimaryExpression__Group_4__4 ;
    public final void rule__PrimaryExpression__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5617:1: ( rule__PrimaryExpression__Group_4__3__Impl rule__PrimaryExpression__Group_4__4 )
            // InternalKlangParser.g:5618:2: rule__PrimaryExpression__Group_4__3__Impl rule__PrimaryExpression__Group_4__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalKlangParser.g:5625:1: rule__PrimaryExpression__Group_4__3__Impl : ( RightParenthesis ) ;
    public final void rule__PrimaryExpression__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5629:1: ( ( RightParenthesis ) )
            // InternalKlangParser.g:5630:1: ( RightParenthesis )
            {
            // InternalKlangParser.g:5630:1: ( RightParenthesis )
            // InternalKlangParser.g:5631:2: RightParenthesis
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
    // InternalKlangParser.g:5640:1: rule__PrimaryExpression__Group_4__4 : rule__PrimaryExpression__Group_4__4__Impl ;
    public final void rule__PrimaryExpression__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5644:1: ( rule__PrimaryExpression__Group_4__4__Impl )
            // InternalKlangParser.g:5645:2: rule__PrimaryExpression__Group_4__4__Impl
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
    // InternalKlangParser.g:5651:1: rule__PrimaryExpression__Group_4__4__Impl : ( ( rule__PrimaryExpression__ExpressionAssignment_4_4 ) ) ;
    public final void rule__PrimaryExpression__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5655:1: ( ( ( rule__PrimaryExpression__ExpressionAssignment_4_4 ) ) )
            // InternalKlangParser.g:5656:1: ( ( rule__PrimaryExpression__ExpressionAssignment_4_4 ) )
            {
            // InternalKlangParser.g:5656:1: ( ( rule__PrimaryExpression__ExpressionAssignment_4_4 ) )
            // InternalKlangParser.g:5657:2: ( rule__PrimaryExpression__ExpressionAssignment_4_4 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionAssignment_4_4()); 
            // InternalKlangParser.g:5658:2: ( rule__PrimaryExpression__ExpressionAssignment_4_4 )
            // InternalKlangParser.g:5658:3: rule__PrimaryExpression__ExpressionAssignment_4_4
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
    // InternalKlangParser.g:5667:1: rule__AtomicExpression__Group_0__0 : rule__AtomicExpression__Group_0__0__Impl rule__AtomicExpression__Group_0__1 ;
    public final void rule__AtomicExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5671:1: ( rule__AtomicExpression__Group_0__0__Impl rule__AtomicExpression__Group_0__1 )
            // InternalKlangParser.g:5672:2: rule__AtomicExpression__Group_0__0__Impl rule__AtomicExpression__Group_0__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalKlangParser.g:5679:1: rule__AtomicExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__AtomicExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5683:1: ( ( () ) )
            // InternalKlangParser.g:5684:1: ( () )
            {
            // InternalKlangParser.g:5684:1: ( () )
            // InternalKlangParser.g:5685:2: ()
            {
             before(grammarAccess.getAtomicExpressionAccess().getBooleanLiteralAction_0_0()); 
            // InternalKlangParser.g:5686:2: ()
            // InternalKlangParser.g:5686:3: 
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
    // InternalKlangParser.g:5694:1: rule__AtomicExpression__Group_0__1 : rule__AtomicExpression__Group_0__1__Impl ;
    public final void rule__AtomicExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5698:1: ( rule__AtomicExpression__Group_0__1__Impl )
            // InternalKlangParser.g:5699:2: rule__AtomicExpression__Group_0__1__Impl
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
    // InternalKlangParser.g:5705:1: rule__AtomicExpression__Group_0__1__Impl : ( ( rule__AtomicExpression__Alternatives_0_1 ) ) ;
    public final void rule__AtomicExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5709:1: ( ( ( rule__AtomicExpression__Alternatives_0_1 ) ) )
            // InternalKlangParser.g:5710:1: ( ( rule__AtomicExpression__Alternatives_0_1 ) )
            {
            // InternalKlangParser.g:5710:1: ( ( rule__AtomicExpression__Alternatives_0_1 ) )
            // InternalKlangParser.g:5711:2: ( rule__AtomicExpression__Alternatives_0_1 )
            {
             before(grammarAccess.getAtomicExpressionAccess().getAlternatives_0_1()); 
            // InternalKlangParser.g:5712:2: ( rule__AtomicExpression__Alternatives_0_1 )
            // InternalKlangParser.g:5712:3: rule__AtomicExpression__Alternatives_0_1
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
    // InternalKlangParser.g:5721:1: rule__AtomicExpression__Group_1__0 : rule__AtomicExpression__Group_1__0__Impl rule__AtomicExpression__Group_1__1 ;
    public final void rule__AtomicExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5725:1: ( rule__AtomicExpression__Group_1__0__Impl rule__AtomicExpression__Group_1__1 )
            // InternalKlangParser.g:5726:2: rule__AtomicExpression__Group_1__0__Impl rule__AtomicExpression__Group_1__1
            {
            pushFollow(FOLLOW_56);
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
    // InternalKlangParser.g:5733:1: rule__AtomicExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AtomicExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5737:1: ( ( () ) )
            // InternalKlangParser.g:5738:1: ( () )
            {
            // InternalKlangParser.g:5738:1: ( () )
            // InternalKlangParser.g:5739:2: ()
            {
             before(grammarAccess.getAtomicExpressionAccess().getDoubleLiteralAction_1_0()); 
            // InternalKlangParser.g:5740:2: ()
            // InternalKlangParser.g:5740:3: 
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
    // InternalKlangParser.g:5748:1: rule__AtomicExpression__Group_1__1 : rule__AtomicExpression__Group_1__1__Impl ;
    public final void rule__AtomicExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5752:1: ( rule__AtomicExpression__Group_1__1__Impl )
            // InternalKlangParser.g:5753:2: rule__AtomicExpression__Group_1__1__Impl
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
    // InternalKlangParser.g:5759:1: rule__AtomicExpression__Group_1__1__Impl : ( ( rule__AtomicExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__AtomicExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5763:1: ( ( ( rule__AtomicExpression__ValueAssignment_1_1 ) ) )
            // InternalKlangParser.g:5764:1: ( ( rule__AtomicExpression__ValueAssignment_1_1 ) )
            {
            // InternalKlangParser.g:5764:1: ( ( rule__AtomicExpression__ValueAssignment_1_1 ) )
            // InternalKlangParser.g:5765:2: ( rule__AtomicExpression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicExpressionAccess().getValueAssignment_1_1()); 
            // InternalKlangParser.g:5766:2: ( rule__AtomicExpression__ValueAssignment_1_1 )
            // InternalKlangParser.g:5766:3: rule__AtomicExpression__ValueAssignment_1_1
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
    // InternalKlangParser.g:5775:1: rule__AtomicExpression__Group_2__0 : rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 ;
    public final void rule__AtomicExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5779:1: ( rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 )
            // InternalKlangParser.g:5780:2: rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1
            {
            pushFollow(FOLLOW_56);
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
    // InternalKlangParser.g:5787:1: rule__AtomicExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__AtomicExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5791:1: ( ( () ) )
            // InternalKlangParser.g:5792:1: ( () )
            {
            // InternalKlangParser.g:5792:1: ( () )
            // InternalKlangParser.g:5793:2: ()
            {
             before(grammarAccess.getAtomicExpressionAccess().getIntegerLiteralAction_2_0()); 
            // InternalKlangParser.g:5794:2: ()
            // InternalKlangParser.g:5794:3: 
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
    // InternalKlangParser.g:5802:1: rule__AtomicExpression__Group_2__1 : rule__AtomicExpression__Group_2__1__Impl ;
    public final void rule__AtomicExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5806:1: ( rule__AtomicExpression__Group_2__1__Impl )
            // InternalKlangParser.g:5807:2: rule__AtomicExpression__Group_2__1__Impl
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
    // InternalKlangParser.g:5813:1: rule__AtomicExpression__Group_2__1__Impl : ( ( rule__AtomicExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__AtomicExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5817:1: ( ( ( rule__AtomicExpression__ValueAssignment_2_1 ) ) )
            // InternalKlangParser.g:5818:1: ( ( rule__AtomicExpression__ValueAssignment_2_1 ) )
            {
            // InternalKlangParser.g:5818:1: ( ( rule__AtomicExpression__ValueAssignment_2_1 ) )
            // InternalKlangParser.g:5819:2: ( rule__AtomicExpression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicExpressionAccess().getValueAssignment_2_1()); 
            // InternalKlangParser.g:5820:2: ( rule__AtomicExpression__ValueAssignment_2_1 )
            // InternalKlangParser.g:5820:3: rule__AtomicExpression__ValueAssignment_2_1
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
    // InternalKlangParser.g:5829:1: rule__AtomicExpression__Group_3__0 : rule__AtomicExpression__Group_3__0__Impl rule__AtomicExpression__Group_3__1 ;
    public final void rule__AtomicExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5833:1: ( rule__AtomicExpression__Group_3__0__Impl rule__AtomicExpression__Group_3__1 )
            // InternalKlangParser.g:5834:2: rule__AtomicExpression__Group_3__0__Impl rule__AtomicExpression__Group_3__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalKlangParser.g:5841:1: rule__AtomicExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__AtomicExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5845:1: ( ( () ) )
            // InternalKlangParser.g:5846:1: ( () )
            {
            // InternalKlangParser.g:5846:1: ( () )
            // InternalKlangParser.g:5847:2: ()
            {
             before(grammarAccess.getAtomicExpressionAccess().getStringLiteralAction_3_0()); 
            // InternalKlangParser.g:5848:2: ()
            // InternalKlangParser.g:5848:3: 
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
    // InternalKlangParser.g:5856:1: rule__AtomicExpression__Group_3__1 : rule__AtomicExpression__Group_3__1__Impl ;
    public final void rule__AtomicExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5860:1: ( rule__AtomicExpression__Group_3__1__Impl )
            // InternalKlangParser.g:5861:2: rule__AtomicExpression__Group_3__1__Impl
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
    // InternalKlangParser.g:5867:1: rule__AtomicExpression__Group_3__1__Impl : ( ( rule__AtomicExpression__ValueAssignment_3_1 ) ) ;
    public final void rule__AtomicExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5871:1: ( ( ( rule__AtomicExpression__ValueAssignment_3_1 ) ) )
            // InternalKlangParser.g:5872:1: ( ( rule__AtomicExpression__ValueAssignment_3_1 ) )
            {
            // InternalKlangParser.g:5872:1: ( ( rule__AtomicExpression__ValueAssignment_3_1 ) )
            // InternalKlangParser.g:5873:2: ( rule__AtomicExpression__ValueAssignment_3_1 )
            {
             before(grammarAccess.getAtomicExpressionAccess().getValueAssignment_3_1()); 
            // InternalKlangParser.g:5874:2: ( rule__AtomicExpression__ValueAssignment_3_1 )
            // InternalKlangParser.g:5874:3: rule__AtomicExpression__ValueAssignment_3_1
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
    // InternalKlangParser.g:5883:1: rule__AtomicExpression__Group_4__0 : rule__AtomicExpression__Group_4__0__Impl rule__AtomicExpression__Group_4__1 ;
    public final void rule__AtomicExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5887:1: ( rule__AtomicExpression__Group_4__0__Impl rule__AtomicExpression__Group_4__1 )
            // InternalKlangParser.g:5888:2: rule__AtomicExpression__Group_4__0__Impl rule__AtomicExpression__Group_4__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalKlangParser.g:5895:1: rule__AtomicExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__AtomicExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5899:1: ( ( () ) )
            // InternalKlangParser.g:5900:1: ( () )
            {
            // InternalKlangParser.g:5900:1: ( () )
            // InternalKlangParser.g:5901:2: ()
            {
             before(grammarAccess.getAtomicExpressionAccess().getVariableReferenceAction_4_0()); 
            // InternalKlangParser.g:5902:2: ()
            // InternalKlangParser.g:5902:3: 
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
    // InternalKlangParser.g:5910:1: rule__AtomicExpression__Group_4__1 : rule__AtomicExpression__Group_4__1__Impl ;
    public final void rule__AtomicExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5914:1: ( rule__AtomicExpression__Group_4__1__Impl )
            // InternalKlangParser.g:5915:2: rule__AtomicExpression__Group_4__1__Impl
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
    // InternalKlangParser.g:5921:1: rule__AtomicExpression__Group_4__1__Impl : ( ( rule__AtomicExpression__VariableNameAssignment_4_1 ) ) ;
    public final void rule__AtomicExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5925:1: ( ( ( rule__AtomicExpression__VariableNameAssignment_4_1 ) ) )
            // InternalKlangParser.g:5926:1: ( ( rule__AtomicExpression__VariableNameAssignment_4_1 ) )
            {
            // InternalKlangParser.g:5926:1: ( ( rule__AtomicExpression__VariableNameAssignment_4_1 ) )
            // InternalKlangParser.g:5927:2: ( rule__AtomicExpression__VariableNameAssignment_4_1 )
            {
             before(grammarAccess.getAtomicExpressionAccess().getVariableNameAssignment_4_1()); 
            // InternalKlangParser.g:5928:2: ( rule__AtomicExpression__VariableNameAssignment_4_1 )
            // InternalKlangParser.g:5928:3: rule__AtomicExpression__VariableNameAssignment_4_1
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
    // InternalKlangParser.g:5937:1: rule__DECIMAL__Group__0 : rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 ;
    public final void rule__DECIMAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5941:1: ( rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 )
            // InternalKlangParser.g:5942:2: rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1
            {
            pushFollow(FOLLOW_57);
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
    // InternalKlangParser.g:5949:1: rule__DECIMAL__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5953:1: ( ( RULE_INT ) )
            // InternalKlangParser.g:5954:1: ( RULE_INT )
            {
            // InternalKlangParser.g:5954:1: ( RULE_INT )
            // InternalKlangParser.g:5955:2: RULE_INT
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
    // InternalKlangParser.g:5964:1: rule__DECIMAL__Group__1 : rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 ;
    public final void rule__DECIMAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5968:1: ( rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 )
            // InternalKlangParser.g:5969:2: rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2
            {
            pushFollow(FOLLOW_56);
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
    // InternalKlangParser.g:5976:1: rule__DECIMAL__Group__1__Impl : ( FullStop ) ;
    public final void rule__DECIMAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5980:1: ( ( FullStop ) )
            // InternalKlangParser.g:5981:1: ( FullStop )
            {
            // InternalKlangParser.g:5981:1: ( FullStop )
            // InternalKlangParser.g:5982:2: FullStop
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
    // InternalKlangParser.g:5991:1: rule__DECIMAL__Group__2 : rule__DECIMAL__Group__2__Impl ;
    public final void rule__DECIMAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:5995:1: ( rule__DECIMAL__Group__2__Impl )
            // InternalKlangParser.g:5996:2: rule__DECIMAL__Group__2__Impl
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
    // InternalKlangParser.g:6002:1: rule__DECIMAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6006:1: ( ( RULE_INT ) )
            // InternalKlangParser.g:6007:1: ( RULE_INT )
            {
            // InternalKlangParser.g:6007:1: ( RULE_INT )
            // InternalKlangParser.g:6008:2: RULE_INT
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
    // InternalKlangParser.g:6018:1: rule__Program__SceneActorAssignment_0 : ( ruleSceneActor ) ;
    public final void rule__Program__SceneActorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6022:1: ( ( ruleSceneActor ) )
            // InternalKlangParser.g:6023:2: ( ruleSceneActor )
            {
            // InternalKlangParser.g:6023:2: ( ruleSceneActor )
            // InternalKlangParser.g:6024:3: ruleSceneActor
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
    // InternalKlangParser.g:6033:1: rule__Program__SpriteActorsAssignment_1 : ( ruleSpriteActor ) ;
    public final void rule__Program__SpriteActorsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6037:1: ( ( ruleSpriteActor ) )
            // InternalKlangParser.g:6038:2: ( ruleSpriteActor )
            {
            // InternalKlangParser.g:6038:2: ( ruleSpriteActor )
            // InternalKlangParser.g:6039:3: ruleSpriteActor
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
    // InternalKlangParser.g:6048:1: rule__SceneActor__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SceneActor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6052:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:6053:2: ( RULE_ID )
            {
            // InternalKlangParser.g:6053:2: ( RULE_ID )
            // InternalKlangParser.g:6054:3: RULE_ID
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
    // InternalKlangParser.g:6063:1: rule__SceneActor__LocalVariablesAssignment_3_1 : ( ruleVariableDeclaration ) ;
    public final void rule__SceneActor__LocalVariablesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6067:1: ( ( ruleVariableDeclaration ) )
            // InternalKlangParser.g:6068:2: ( ruleVariableDeclaration )
            {
            // InternalKlangParser.g:6068:2: ( ruleVariableDeclaration )
            // InternalKlangParser.g:6069:3: ruleVariableDeclaration
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
    // InternalKlangParser.g:6078:1: rule__SceneActor__EventHandlersAssignment_3_2 : ( ruleEventHandler ) ;
    public final void rule__SceneActor__EventHandlersAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6082:1: ( ( ruleEventHandler ) )
            // InternalKlangParser.g:6083:2: ( ruleEventHandler )
            {
            // InternalKlangParser.g:6083:2: ( ruleEventHandler )
            // InternalKlangParser.g:6084:3: ruleEventHandler
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
    // InternalKlangParser.g:6093:1: rule__SpriteActor__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SpriteActor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6097:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:6098:2: ( RULE_ID )
            {
            // InternalKlangParser.g:6098:2: ( RULE_ID )
            // InternalKlangParser.g:6099:3: RULE_ID
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
    // InternalKlangParser.g:6108:1: rule__SpriteActor__LocalVariablesAssignment_3_1 : ( ruleVariableDeclaration ) ;
    public final void rule__SpriteActor__LocalVariablesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6112:1: ( ( ruleVariableDeclaration ) )
            // InternalKlangParser.g:6113:2: ( ruleVariableDeclaration )
            {
            // InternalKlangParser.g:6113:2: ( ruleVariableDeclaration )
            // InternalKlangParser.g:6114:3: ruleVariableDeclaration
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
    // InternalKlangParser.g:6123:1: rule__SpriteActor__EventHandlersAssignment_3_2 : ( ruleEventHandler ) ;
    public final void rule__SpriteActor__EventHandlersAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6127:1: ( ( ruleEventHandler ) )
            // InternalKlangParser.g:6128:2: ( ruleEventHandler )
            {
            // InternalKlangParser.g:6128:2: ( ruleEventHandler )
            // InternalKlangParser.g:6129:3: ruleEventHandler
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


    // $ANTLR start "rule__MessageReceived__NameAssignment_3"
    // InternalKlangParser.g:6138:1: rule__MessageReceived__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__MessageReceived__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6142:1: ( ( RULE_STRING ) )
            // InternalKlangParser.g:6143:2: ( RULE_STRING )
            {
            // InternalKlangParser.g:6143:2: ( RULE_STRING )
            // InternalKlangParser.g:6144:3: RULE_STRING
            {
             before(grammarAccess.getMessageReceivedAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMessageReceivedAccess().getNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageReceived__NameAssignment_3"


    // $ANTLR start "rule__MessageReceived__StatementsAssignment_7"
    // InternalKlangParser.g:6153:1: rule__MessageReceived__StatementsAssignment_7 : ( ruleStatement ) ;
    public final void rule__MessageReceived__StatementsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6157:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:6158:2: ( ruleStatement )
            {
            // InternalKlangParser.g:6158:2: ( ruleStatement )
            // InternalKlangParser.g:6159:3: ruleStatement
            {
             before(grammarAccess.getMessageReceivedAccess().getStatementsStatementParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getMessageReceivedAccess().getStatementsStatementParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageReceived__StatementsAssignment_7"


    // $ANTLR start "rule__SendMessage__NameAssignment_3"
    // InternalKlangParser.g:6168:1: rule__SendMessage__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__SendMessage__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6172:1: ( ( RULE_STRING ) )
            // InternalKlangParser.g:6173:2: ( RULE_STRING )
            {
            // InternalKlangParser.g:6173:2: ( RULE_STRING )
            // InternalKlangParser.g:6174:3: RULE_STRING
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


    // $ANTLR start "rule__GameStart__StatementsAssignment_5"
    // InternalKlangParser.g:6183:1: rule__GameStart__StatementsAssignment_5 : ( ruleStatement ) ;
    public final void rule__GameStart__StatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6187:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:6188:2: ( ruleStatement )
            {
            // InternalKlangParser.g:6188:2: ( ruleStatement )
            // InternalKlangParser.g:6189:3: ruleStatement
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
    // InternalKlangParser.g:6198:1: rule__SpriteClicked__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__SpriteClicked__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6202:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:6203:2: ( ruleStatement )
            {
            // InternalKlangParser.g:6203:2: ( ruleStatement )
            // InternalKlangParser.g:6204:3: ruleStatement
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


    // $ANTLR start "rule__KeyPressed__KeyAssignment_3"
    // InternalKlangParser.g:6213:1: rule__KeyPressed__KeyAssignment_3 : ( ruleKeys ) ;
    public final void rule__KeyPressed__KeyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6217:1: ( ( ruleKeys ) )
            // InternalKlangParser.g:6218:2: ( ruleKeys )
            {
            // InternalKlangParser.g:6218:2: ( ruleKeys )
            // InternalKlangParser.g:6219:3: ruleKeys
            {
             before(grammarAccess.getKeyPressedAccess().getKeyKeysEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleKeys();

            state._fsp--;

             after(grammarAccess.getKeyPressedAccess().getKeyKeysEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyPressed__KeyAssignment_3"


    // $ANTLR start "rule__KeyPressed__StatementsAssignment_7"
    // InternalKlangParser.g:6228:1: rule__KeyPressed__StatementsAssignment_7 : ( ruleStatement ) ;
    public final void rule__KeyPressed__StatementsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6232:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:6233:2: ( ruleStatement )
            {
            // InternalKlangParser.g:6233:2: ( ruleStatement )
            // InternalKlangParser.g:6234:3: ruleStatement
            {
             before(grammarAccess.getKeyPressedAccess().getStatementsStatementParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getKeyPressedAccess().getStatementsStatementParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyPressed__StatementsAssignment_7"


    // $ANTLR start "rule__CollidesWith__TargetAssignment_4"
    // InternalKlangParser.g:6243:1: rule__CollidesWith__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__CollidesWith__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6247:1: ( ( ( RULE_ID ) ) )
            // InternalKlangParser.g:6248:2: ( ( RULE_ID ) )
            {
            // InternalKlangParser.g:6248:2: ( ( RULE_ID ) )
            // InternalKlangParser.g:6249:3: ( RULE_ID )
            {
             before(grammarAccess.getCollidesWithAccess().getTargetSpriteActorCrossReference_4_0()); 
            // InternalKlangParser.g:6250:3: ( RULE_ID )
            // InternalKlangParser.g:6251:4: RULE_ID
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
    // InternalKlangParser.g:6262:1: rule__CollidesWith__StatementsAssignment_6 : ( ruleStatement ) ;
    public final void rule__CollidesWith__StatementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6266:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:6267:2: ( ruleStatement )
            {
            // InternalKlangParser.g:6267:2: ( ruleStatement )
            // InternalKlangParser.g:6268:3: ruleStatement
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
    // InternalKlangParser.g:6277:1: rule__WhileLoop__PredicateAssignment_2 : ( ruleExpression ) ;
    public final void rule__WhileLoop__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6281:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:6282:2: ( ruleExpression )
            {
            // InternalKlangParser.g:6282:2: ( ruleExpression )
            // InternalKlangParser.g:6283:3: ruleExpression
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
    // InternalKlangParser.g:6292:1: rule__WhileLoop__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__WhileLoop__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6296:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:6297:2: ( ruleStatement )
            {
            // InternalKlangParser.g:6297:2: ( ruleStatement )
            // InternalKlangParser.g:6298:3: ruleStatement
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
    // InternalKlangParser.g:6307:1: rule__If__PredicateAssignment_2 : ( ruleExpression ) ;
    public final void rule__If__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6311:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:6312:2: ( ruleExpression )
            {
            // InternalKlangParser.g:6312:2: ( ruleExpression )
            // InternalKlangParser.g:6313:3: ruleExpression
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
    // InternalKlangParser.g:6322:1: rule__If__IfBlockAssignment_4 : ( ruleStatement ) ;
    public final void rule__If__IfBlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6326:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:6327:2: ( ruleStatement )
            {
            // InternalKlangParser.g:6327:2: ( ruleStatement )
            // InternalKlangParser.g:6328:3: ruleStatement
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
    // InternalKlangParser.g:6337:1: rule__If__ElseBlockAssignment_6_2 : ( ruleStatement ) ;
    public final void rule__If__ElseBlockAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6341:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:6342:2: ( ruleStatement )
            {
            // InternalKlangParser.g:6342:2: ( ruleStatement )
            // InternalKlangParser.g:6343:3: ruleStatement
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
    // InternalKlangParser.g:6352:1: rule__ForeverLoop__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__ForeverLoop__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6356:1: ( ( ruleStatement ) )
            // InternalKlangParser.g:6357:2: ( ruleStatement )
            {
            // InternalKlangParser.g:6357:2: ( ruleStatement )
            // InternalKlangParser.g:6358:3: ruleStatement
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
    // InternalKlangParser.g:6367:1: rule__VariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6371:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:6372:2: ( RULE_ID )
            {
            // InternalKlangParser.g:6372:2: ( RULE_ID )
            // InternalKlangParser.g:6373:3: RULE_ID
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
    // InternalKlangParser.g:6382:1: rule__VariableDeclaration__ExpressionAssignment_3 : ( ruleExpression ) ;
    public final void rule__VariableDeclaration__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6386:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:6387:2: ( ruleExpression )
            {
            // InternalKlangParser.g:6387:2: ( ruleExpression )
            // InternalKlangParser.g:6388:3: ruleExpression
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
    // InternalKlangParser.g:6397:1: rule__VariableAssignment__VariableNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__VariableAssignment__VariableNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6401:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:6402:2: ( RULE_ID )
            {
            // InternalKlangParser.g:6402:2: ( RULE_ID )
            // InternalKlangParser.g:6403:3: RULE_ID
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
    // InternalKlangParser.g:6412:1: rule__VariableAssignment__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__VariableAssignment__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6416:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:6417:2: ( ruleExpression )
            {
            // InternalKlangParser.g:6417:2: ( ruleExpression )
            // InternalKlangParser.g:6418:3: ruleExpression
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
    // InternalKlangParser.g:6427:1: rule__Sleep__DurationAssignment_3 : ( ruleExpression ) ;
    public final void rule__Sleep__DurationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6431:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:6432:2: ( ruleExpression )
            {
            // InternalKlangParser.g:6432:2: ( ruleExpression )
            // InternalKlangParser.g:6433:3: ruleExpression
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
    // InternalKlangParser.g:6442:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6446:1: ( ( ruleAnd ) )
            // InternalKlangParser.g:6447:2: ( ruleAnd )
            {
            // InternalKlangParser.g:6447:2: ( ruleAnd )
            // InternalKlangParser.g:6448:3: ruleAnd
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
    // InternalKlangParser.g:6457:1: rule__And__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6461:1: ( ( ruleComparison ) )
            // InternalKlangParser.g:6462:2: ( ruleComparison )
            {
            // InternalKlangParser.g:6462:2: ( ruleComparison )
            // InternalKlangParser.g:6463:3: ruleComparison
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
    // InternalKlangParser.g:6472:1: rule__Plus__RightAssignment_1_2 : ( ruleMinus ) ;
    public final void rule__Plus__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6476:1: ( ( ruleMinus ) )
            // InternalKlangParser.g:6477:2: ( ruleMinus )
            {
            // InternalKlangParser.g:6477:2: ( ruleMinus )
            // InternalKlangParser.g:6478:3: ruleMinus
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
    // InternalKlangParser.g:6487:1: rule__Minus__RightAssignment_1_2 : ( ruleMultiply ) ;
    public final void rule__Minus__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6491:1: ( ( ruleMultiply ) )
            // InternalKlangParser.g:6492:2: ( ruleMultiply )
            {
            // InternalKlangParser.g:6492:2: ( ruleMultiply )
            // InternalKlangParser.g:6493:3: ruleMultiply
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
    // InternalKlangParser.g:6502:1: rule__Multiply__RightAssignment_1_2 : ( ruleDivide ) ;
    public final void rule__Multiply__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6506:1: ( ( ruleDivide ) )
            // InternalKlangParser.g:6507:2: ( ruleDivide )
            {
            // InternalKlangParser.g:6507:2: ( ruleDivide )
            // InternalKlangParser.g:6508:3: ruleDivide
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
    // InternalKlangParser.g:6517:1: rule__Divide__RightAssignment_1_2 : ( rulePrimaryExpression ) ;
    public final void rule__Divide__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6521:1: ( ( rulePrimaryExpression ) )
            // InternalKlangParser.g:6522:2: ( rulePrimaryExpression )
            {
            // InternalKlangParser.g:6522:2: ( rulePrimaryExpression )
            // InternalKlangParser.g:6523:3: rulePrimaryExpression
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
    // InternalKlangParser.g:6532:1: rule__Comparison__RightAssignment_1_1 : ( rulePlus ) ;
    public final void rule__Comparison__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6536:1: ( ( rulePlus ) )
            // InternalKlangParser.g:6537:2: ( rulePlus )
            {
            // InternalKlangParser.g:6537:2: ( rulePlus )
            // InternalKlangParser.g:6538:3: rulePlus
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
    // InternalKlangParser.g:6547:1: rule__FunctionCall__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FunctionCall__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6551:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:6552:2: ( RULE_ID )
            {
            // InternalKlangParser.g:6552:2: ( RULE_ID )
            // InternalKlangParser.g:6553:3: RULE_ID
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
    // InternalKlangParser.g:6562:1: rule__FunctionCall__ParametersAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__FunctionCall__ParametersAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6566:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:6567:2: ( ruleExpression )
            {
            // InternalKlangParser.g:6567:2: ( ruleExpression )
            // InternalKlangParser.g:6568:3: ruleExpression
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
    // InternalKlangParser.g:6577:1: rule__FunctionCall__ParametersAssignment_2_1_1 : ( ruleExpression ) ;
    public final void rule__FunctionCall__ParametersAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6581:1: ( ( ruleExpression ) )
            // InternalKlangParser.g:6582:2: ( ruleExpression )
            {
            // InternalKlangParser.g:6582:2: ( ruleExpression )
            // InternalKlangParser.g:6583:3: ruleExpression
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
    // InternalKlangParser.g:6592:1: rule__PrimaryExpression__ExpressionAssignment_1_2 : ( rulePrimaryExpression ) ;
    public final void rule__PrimaryExpression__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6596:1: ( ( rulePrimaryExpression ) )
            // InternalKlangParser.g:6597:2: ( rulePrimaryExpression )
            {
            // InternalKlangParser.g:6597:2: ( rulePrimaryExpression )
            // InternalKlangParser.g:6598:3: rulePrimaryExpression
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
    // InternalKlangParser.g:6607:1: rule__PrimaryExpression__ExpressionAssignment_2_2 : ( rulePrimaryExpression ) ;
    public final void rule__PrimaryExpression__ExpressionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6611:1: ( ( rulePrimaryExpression ) )
            // InternalKlangParser.g:6612:2: ( rulePrimaryExpression )
            {
            // InternalKlangParser.g:6612:2: ( rulePrimaryExpression )
            // InternalKlangParser.g:6613:3: rulePrimaryExpression
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
    // InternalKlangParser.g:6622:1: rule__PrimaryExpression__ExpressionAssignment_3_4 : ( rulePrimaryExpression ) ;
    public final void rule__PrimaryExpression__ExpressionAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6626:1: ( ( rulePrimaryExpression ) )
            // InternalKlangParser.g:6627:2: ( rulePrimaryExpression )
            {
            // InternalKlangParser.g:6627:2: ( rulePrimaryExpression )
            // InternalKlangParser.g:6628:3: rulePrimaryExpression
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
    // InternalKlangParser.g:6637:1: rule__PrimaryExpression__ExpressionAssignment_4_4 : ( rulePrimaryExpression ) ;
    public final void rule__PrimaryExpression__ExpressionAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6641:1: ( ( rulePrimaryExpression ) )
            // InternalKlangParser.g:6642:2: ( rulePrimaryExpression )
            {
            // InternalKlangParser.g:6642:2: ( rulePrimaryExpression )
            // InternalKlangParser.g:6643:3: rulePrimaryExpression
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
    // InternalKlangParser.g:6652:1: rule__AtomicExpression__ValueAssignment_0_1_0 : ( ( True ) ) ;
    public final void rule__AtomicExpression__ValueAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6656:1: ( ( ( True ) ) )
            // InternalKlangParser.g:6657:2: ( ( True ) )
            {
            // InternalKlangParser.g:6657:2: ( ( True ) )
            // InternalKlangParser.g:6658:3: ( True )
            {
             before(grammarAccess.getAtomicExpressionAccess().getValueTrueKeyword_0_1_0_0()); 
            // InternalKlangParser.g:6659:3: ( True )
            // InternalKlangParser.g:6660:4: True
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
    // InternalKlangParser.g:6671:1: rule__AtomicExpression__ValueAssignment_1_1 : ( ruleDECIMAL ) ;
    public final void rule__AtomicExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6675:1: ( ( ruleDECIMAL ) )
            // InternalKlangParser.g:6676:2: ( ruleDECIMAL )
            {
            // InternalKlangParser.g:6676:2: ( ruleDECIMAL )
            // InternalKlangParser.g:6677:3: ruleDECIMAL
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
    // InternalKlangParser.g:6686:1: rule__AtomicExpression__ValueAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__AtomicExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6690:1: ( ( RULE_INT ) )
            // InternalKlangParser.g:6691:2: ( RULE_INT )
            {
            // InternalKlangParser.g:6691:2: ( RULE_INT )
            // InternalKlangParser.g:6692:3: RULE_INT
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
    // InternalKlangParser.g:6701:1: rule__AtomicExpression__ValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__AtomicExpression__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6705:1: ( ( RULE_STRING ) )
            // InternalKlangParser.g:6706:2: ( RULE_STRING )
            {
            // InternalKlangParser.g:6706:2: ( RULE_STRING )
            // InternalKlangParser.g:6707:3: RULE_STRING
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
    // InternalKlangParser.g:6716:1: rule__AtomicExpression__VariableNameAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__AtomicExpression__VariableNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKlangParser.g:6720:1: ( ( RULE_ID ) )
            // InternalKlangParser.g:6721:2: ( RULE_ID )
            {
            // InternalKlangParser.g:6721:2: ( RULE_ID )
            // InternalKlangParser.g:6722:3: RULE_ID
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
    static final String dfa_3s = "\1\17\1\12\2\uffff\1\4\5\uffff";
    static final String dfa_4s = "\2\112\2\uffff\1\110\5\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\uffff\1\7\1\5\1\4\1\1\1\6";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\5\5\uffff\1\5\4\uffff\1\2\4\uffff\1\1\4\uffff\1\3\43\uffff\1\4\2\5",
            "\1\7\4\uffff\1\10\5\uffff\1\10\3\uffff\1\6\1\10\4\uffff\1\10\4\uffff\1\10\43\uffff\3\10",
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
            return "978:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) | ( ruleFunctionCall ) | ( ruleAtomicExpression ) );";
        }
    }
 

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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020060110L,0x0000000000000180L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020060112L,0x0000000000000100L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020060110L,0x0000000000000100L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0xFFFFFC0000006000L,0x000000000000000FL});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001084208000L,0x0000000000000700L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000028010000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000028010000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000001184208000L,0x0000000000000700L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000002000000000L});

}