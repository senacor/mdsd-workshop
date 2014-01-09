package com.senacor.mdsd.hh.editortweaks.greeter.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.senacor.mdsd.hh.editortweaks.greeter.services.GreeterGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGreeterParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hallo'", "'Huhu'", "'Hello'", "'Bonjour'", "'deutsch'", "'englisch'", "'franz\\u00F6sisch'", "'Person'", "'firstname'", "'lastname'", "'spricht'", "'!'", "'Zu'", "'sage'", "'ich'"
    };
    public static final int RULE_ID=4;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalGreeterParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGreeterParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGreeterParser.tokenNames; }
    public String getGrammarFileName() { return "../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g"; }


     
     	private GreeterGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(GreeterGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:61:1: ( ruleModel EOF )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:76:1: ( rule__Model__Group__0 )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePerson"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:88:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:89:1: ( rulePerson EOF )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:90:1: rulePerson EOF
            {
             before(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_rulePerson_in_entryRulePerson121);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPersonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePerson128); 

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
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:97:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:101:2: ( ( ( rule__Person__Group__0 ) ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:102:1: ( ( rule__Person__Group__0 ) )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:102:1: ( ( rule__Person__Group__0 ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:103:1: ( rule__Person__Group__0 )
            {
             before(grammarAccess.getPersonAccess().getGroup()); 
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:104:1: ( rule__Person__Group__0 )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:104:2: rule__Person__Group__0
            {
            pushFollow(FOLLOW_rule__Person__Group__0_in_rulePerson154);
            rule__Person__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleGreeting"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:116:1: entryRuleGreeting : ruleGreeting EOF ;
    public final void entryRuleGreeting() throws RecognitionException {
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:117:1: ( ruleGreeting EOF )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:118:1: ruleGreeting EOF
            {
             before(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting181);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getGreetingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting188); 

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
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:125:1: ruleGreeting : ( ( rule__Greeting__Alternatives ) ) ;
    public final void ruleGreeting() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:129:2: ( ( ( rule__Greeting__Alternatives ) ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:130:1: ( ( rule__Greeting__Alternatives ) )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:130:1: ( ( rule__Greeting__Alternatives ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:131:1: ( rule__Greeting__Alternatives )
            {
             before(grammarAccess.getGreetingAccess().getAlternatives()); 
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:132:1: ( rule__Greeting__Alternatives )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:132:2: rule__Greeting__Alternatives
            {
            pushFollow(FOLLOW_rule__Greeting__Alternatives_in_ruleGreeting214);
            rule__Greeting__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "ruleGreetword"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:145:1: ruleGreetword : ( ( rule__Greetword__Alternatives ) ) ;
    public final void ruleGreetword() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:149:1: ( ( ( rule__Greetword__Alternatives ) ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:150:1: ( ( rule__Greetword__Alternatives ) )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:150:1: ( ( rule__Greetword__Alternatives ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:151:1: ( rule__Greetword__Alternatives )
            {
             before(grammarAccess.getGreetwordAccess().getAlternatives()); 
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:152:1: ( rule__Greetword__Alternatives )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:152:2: rule__Greetword__Alternatives
            {
            pushFollow(FOLLOW_rule__Greetword__Alternatives_in_ruleGreetword251);
            rule__Greetword__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGreetwordAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGreetword"


    // $ANTLR start "ruleLanguage"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:164:1: ruleLanguage : ( ( rule__Language__Alternatives ) ) ;
    public final void ruleLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:168:1: ( ( ( rule__Language__Alternatives ) ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:169:1: ( ( rule__Language__Alternatives ) )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:169:1: ( ( rule__Language__Alternatives ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:170:1: ( rule__Language__Alternatives )
            {
             before(grammarAccess.getLanguageAccess().getAlternatives()); 
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:171:1: ( rule__Language__Alternatives )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:171:2: rule__Language__Alternatives
            {
            pushFollow(FOLLOW_rule__Language__Alternatives_in_ruleLanguage287);
            rule__Language__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLanguageAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLanguage"


    // $ANTLR start "rule__Greeting__Alternatives"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:182:1: rule__Greeting__Alternatives : ( ( ( rule__Greeting__Group_0__0 ) ) | ( ( rule__Greeting__Group_1__0 ) ) );
    public final void rule__Greeting__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:186:1: ( ( ( rule__Greeting__Group_0__0 ) ) | ( ( rule__Greeting__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=11 && LA1_0<=14)) ) {
                alt1=1;
            }
            else if ( (LA1_0==23) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:187:1: ( ( rule__Greeting__Group_0__0 ) )
                    {
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:187:1: ( ( rule__Greeting__Group_0__0 ) )
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:188:1: ( rule__Greeting__Group_0__0 )
                    {
                     before(grammarAccess.getGreetingAccess().getGroup_0()); 
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:189:1: ( rule__Greeting__Group_0__0 )
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:189:2: rule__Greeting__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Greeting__Group_0__0_in_rule__Greeting__Alternatives322);
                    rule__Greeting__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGreetingAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:193:6: ( ( rule__Greeting__Group_1__0 ) )
                    {
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:193:6: ( ( rule__Greeting__Group_1__0 ) )
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:194:1: ( rule__Greeting__Group_1__0 )
                    {
                     before(grammarAccess.getGreetingAccess().getGroup_1()); 
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:195:1: ( rule__Greeting__Group_1__0 )
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:195:2: rule__Greeting__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Greeting__Group_1__0_in_rule__Greeting__Alternatives340);
                    rule__Greeting__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGreetingAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Greeting__Alternatives"


    // $ANTLR start "rule__Greetword__Alternatives"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:204:1: rule__Greetword__Alternatives : ( ( ( 'Hallo' ) ) | ( ( 'Huhu' ) ) | ( ( 'Hello' ) ) | ( ( 'Bonjour' ) ) );
    public final void rule__Greetword__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:208:1: ( ( ( 'Hallo' ) ) | ( ( 'Huhu' ) ) | ( ( 'Hello' ) ) | ( ( 'Bonjour' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
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
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:209:1: ( ( 'Hallo' ) )
                    {
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:209:1: ( ( 'Hallo' ) )
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:210:1: ( 'Hallo' )
                    {
                     before(grammarAccess.getGreetwordAccess().getDEEnumLiteralDeclaration_0()); 
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:211:1: ( 'Hallo' )
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:211:3: 'Hallo'
                    {
                    match(input,11,FOLLOW_11_in_rule__Greetword__Alternatives374); 

                    }

                     after(grammarAccess.getGreetwordAccess().getDEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:216:6: ( ( 'Huhu' ) )
                    {
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:216:6: ( ( 'Huhu' ) )
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:217:1: ( 'Huhu' )
                    {
                     before(grammarAccess.getGreetwordAccess().getDEEnumLiteralDeclaration_1()); 
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:218:1: ( 'Huhu' )
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:218:3: 'Huhu'
                    {
                    match(input,12,FOLLOW_12_in_rule__Greetword__Alternatives395); 

                    }

                     after(grammarAccess.getGreetwordAccess().getDEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:223:6: ( ( 'Hello' ) )
                    {
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:223:6: ( ( 'Hello' ) )
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:224:1: ( 'Hello' )
                    {
                     before(grammarAccess.getGreetwordAccess().getENEnumLiteralDeclaration_2()); 
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:225:1: ( 'Hello' )
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:225:3: 'Hello'
                    {
                    match(input,13,FOLLOW_13_in_rule__Greetword__Alternatives416); 

                    }

                     after(grammarAccess.getGreetwordAccess().getENEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:230:6: ( ( 'Bonjour' ) )
                    {
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:230:6: ( ( 'Bonjour' ) )
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:231:1: ( 'Bonjour' )
                    {
                     before(grammarAccess.getGreetwordAccess().getFREnumLiteralDeclaration_3()); 
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:232:1: ( 'Bonjour' )
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:232:3: 'Bonjour'
                    {
                    match(input,14,FOLLOW_14_in_rule__Greetword__Alternatives437); 

                    }

                     after(grammarAccess.getGreetwordAccess().getFREnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__Greetword__Alternatives"


    // $ANTLR start "rule__Language__Alternatives"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:242:1: rule__Language__Alternatives : ( ( ( 'deutsch' ) ) | ( ( 'englisch' ) ) | ( ( 'franz\\u00F6sisch' ) ) );
    public final void rule__Language__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:246:1: ( ( ( 'deutsch' ) ) | ( ( 'englisch' ) ) | ( ( 'franz\\u00F6sisch' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
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
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:247:1: ( ( 'deutsch' ) )
                    {
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:247:1: ( ( 'deutsch' ) )
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:248:1: ( 'deutsch' )
                    {
                     before(grammarAccess.getLanguageAccess().getDEEnumLiteralDeclaration_0()); 
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:249:1: ( 'deutsch' )
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:249:3: 'deutsch'
                    {
                    match(input,15,FOLLOW_15_in_rule__Language__Alternatives473); 

                    }

                     after(grammarAccess.getLanguageAccess().getDEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:254:6: ( ( 'englisch' ) )
                    {
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:254:6: ( ( 'englisch' ) )
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:255:1: ( 'englisch' )
                    {
                     before(grammarAccess.getLanguageAccess().getENEnumLiteralDeclaration_1()); 
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:256:1: ( 'englisch' )
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:256:3: 'englisch'
                    {
                    match(input,16,FOLLOW_16_in_rule__Language__Alternatives494); 

                    }

                     after(grammarAccess.getLanguageAccess().getENEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:261:6: ( ( 'franz\\u00F6sisch' ) )
                    {
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:261:6: ( ( 'franz\\u00F6sisch' ) )
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:262:1: ( 'franz\\u00F6sisch' )
                    {
                     before(grammarAccess.getLanguageAccess().getFREnumLiteralDeclaration_2()); 
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:263:1: ( 'franz\\u00F6sisch' )
                    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:263:3: 'franz\\u00F6sisch'
                    {
                    match(input,17,FOLLOW_17_in_rule__Language__Alternatives515); 

                    }

                     after(grammarAccess.getLanguageAccess().getFREnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Language__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:275:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:279:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:280:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0548);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0551);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:287:1: rule__Model__Group__0__Impl : ( ( rule__Model__PersonsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:291:1: ( ( ( rule__Model__PersonsAssignment_0 )* ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:292:1: ( ( rule__Model__PersonsAssignment_0 )* )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:292:1: ( ( rule__Model__PersonsAssignment_0 )* )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:293:1: ( rule__Model__PersonsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getPersonsAssignment_0()); 
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:294:1: ( rule__Model__PersonsAssignment_0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:294:2: rule__Model__PersonsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__PersonsAssignment_0_in_rule__Model__Group__0__Impl578);
            	    rule__Model__PersonsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getPersonsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:304:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:308:1: ( rule__Model__Group__1__Impl )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:309:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1609);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:315:1: rule__Model__Group__1__Impl : ( ( rule__Model__GreetingsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:319:1: ( ( ( rule__Model__GreetingsAssignment_1 )* ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:320:1: ( ( rule__Model__GreetingsAssignment_1 )* )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:320:1: ( ( rule__Model__GreetingsAssignment_1 )* )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:321:1: ( rule__Model__GreetingsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getGreetingsAssignment_1()); 
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:322:1: ( rule__Model__GreetingsAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=11 && LA5_0<=14)||LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:322:2: rule__Model__GreetingsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__GreetingsAssignment_1_in_rule__Model__Group__1__Impl636);
            	    rule__Model__GreetingsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGreetingsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Person__Group__0"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:336:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:340:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:341:2: rule__Person__Group__0__Impl rule__Person__Group__1
            {
            pushFollow(FOLLOW_rule__Person__Group__0__Impl_in_rule__Person__Group__0671);
            rule__Person__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Person__Group__1_in_rule__Person__Group__0674);
            rule__Person__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__0"


    // $ANTLR start "rule__Person__Group__0__Impl"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:348:1: rule__Person__Group__0__Impl : ( 'Person' ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:352:1: ( ( 'Person' ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:353:1: ( 'Person' )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:353:1: ( 'Person' )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:354:1: 'Person'
            {
             before(grammarAccess.getPersonAccess().getPersonKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Person__Group__0__Impl702); 
             after(grammarAccess.getPersonAccess().getPersonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__0__Impl"


    // $ANTLR start "rule__Person__Group__1"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:367:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:371:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:372:2: rule__Person__Group__1__Impl rule__Person__Group__2
            {
            pushFollow(FOLLOW_rule__Person__Group__1__Impl_in_rule__Person__Group__1733);
            rule__Person__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Person__Group__2_in_rule__Person__Group__1736);
            rule__Person__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__1"


    // $ANTLR start "rule__Person__Group__1__Impl"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:379:1: rule__Person__Group__1__Impl : ( ( rule__Person__NameAssignment_1 ) ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:383:1: ( ( ( rule__Person__NameAssignment_1 ) ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:384:1: ( ( rule__Person__NameAssignment_1 ) )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:384:1: ( ( rule__Person__NameAssignment_1 ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:385:1: ( rule__Person__NameAssignment_1 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_1()); 
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:386:1: ( rule__Person__NameAssignment_1 )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:386:2: rule__Person__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Person__NameAssignment_1_in_rule__Person__Group__1__Impl763);
            rule__Person__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__1__Impl"


    // $ANTLR start "rule__Person__Group__2"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:396:1: rule__Person__Group__2 : rule__Person__Group__2__Impl rule__Person__Group__3 ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:400:1: ( rule__Person__Group__2__Impl rule__Person__Group__3 )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:401:2: rule__Person__Group__2__Impl rule__Person__Group__3
            {
            pushFollow(FOLLOW_rule__Person__Group__2__Impl_in_rule__Person__Group__2793);
            rule__Person__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Person__Group__3_in_rule__Person__Group__2796);
            rule__Person__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__2"


    // $ANTLR start "rule__Person__Group__2__Impl"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:408:1: rule__Person__Group__2__Impl : ( 'firstname' ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:412:1: ( ( 'firstname' ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:413:1: ( 'firstname' )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:413:1: ( 'firstname' )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:414:1: 'firstname'
            {
             before(grammarAccess.getPersonAccess().getFirstnameKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__Person__Group__2__Impl824); 
             after(grammarAccess.getPersonAccess().getFirstnameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__2__Impl"


    // $ANTLR start "rule__Person__Group__3"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:427:1: rule__Person__Group__3 : rule__Person__Group__3__Impl rule__Person__Group__4 ;
    public final void rule__Person__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:431:1: ( rule__Person__Group__3__Impl rule__Person__Group__4 )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:432:2: rule__Person__Group__3__Impl rule__Person__Group__4
            {
            pushFollow(FOLLOW_rule__Person__Group__3__Impl_in_rule__Person__Group__3855);
            rule__Person__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Person__Group__4_in_rule__Person__Group__3858);
            rule__Person__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__3"


    // $ANTLR start "rule__Person__Group__3__Impl"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:439:1: rule__Person__Group__3__Impl : ( ( rule__Person__FnAssignment_3 ) ) ;
    public final void rule__Person__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:443:1: ( ( ( rule__Person__FnAssignment_3 ) ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:444:1: ( ( rule__Person__FnAssignment_3 ) )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:444:1: ( ( rule__Person__FnAssignment_3 ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:445:1: ( rule__Person__FnAssignment_3 )
            {
             before(grammarAccess.getPersonAccess().getFnAssignment_3()); 
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:446:1: ( rule__Person__FnAssignment_3 )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:446:2: rule__Person__FnAssignment_3
            {
            pushFollow(FOLLOW_rule__Person__FnAssignment_3_in_rule__Person__Group__3__Impl885);
            rule__Person__FnAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getFnAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__3__Impl"


    // $ANTLR start "rule__Person__Group__4"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:456:1: rule__Person__Group__4 : rule__Person__Group__4__Impl rule__Person__Group__5 ;
    public final void rule__Person__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:460:1: ( rule__Person__Group__4__Impl rule__Person__Group__5 )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:461:2: rule__Person__Group__4__Impl rule__Person__Group__5
            {
            pushFollow(FOLLOW_rule__Person__Group__4__Impl_in_rule__Person__Group__4915);
            rule__Person__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Person__Group__5_in_rule__Person__Group__4918);
            rule__Person__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__4"


    // $ANTLR start "rule__Person__Group__4__Impl"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:468:1: rule__Person__Group__4__Impl : ( 'lastname' ) ;
    public final void rule__Person__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:472:1: ( ( 'lastname' ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:473:1: ( 'lastname' )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:473:1: ( 'lastname' )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:474:1: 'lastname'
            {
             before(grammarAccess.getPersonAccess().getLastnameKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__Person__Group__4__Impl946); 
             after(grammarAccess.getPersonAccess().getLastnameKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__4__Impl"


    // $ANTLR start "rule__Person__Group__5"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:487:1: rule__Person__Group__5 : rule__Person__Group__5__Impl rule__Person__Group__6 ;
    public final void rule__Person__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:491:1: ( rule__Person__Group__5__Impl rule__Person__Group__6 )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:492:2: rule__Person__Group__5__Impl rule__Person__Group__6
            {
            pushFollow(FOLLOW_rule__Person__Group__5__Impl_in_rule__Person__Group__5977);
            rule__Person__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Person__Group__6_in_rule__Person__Group__5980);
            rule__Person__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__5"


    // $ANTLR start "rule__Person__Group__5__Impl"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:499:1: rule__Person__Group__5__Impl : ( ( rule__Person__LnAssignment_5 ) ) ;
    public final void rule__Person__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:503:1: ( ( ( rule__Person__LnAssignment_5 ) ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:504:1: ( ( rule__Person__LnAssignment_5 ) )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:504:1: ( ( rule__Person__LnAssignment_5 ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:505:1: ( rule__Person__LnAssignment_5 )
            {
             before(grammarAccess.getPersonAccess().getLnAssignment_5()); 
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:506:1: ( rule__Person__LnAssignment_5 )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:506:2: rule__Person__LnAssignment_5
            {
            pushFollow(FOLLOW_rule__Person__LnAssignment_5_in_rule__Person__Group__5__Impl1007);
            rule__Person__LnAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getLnAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__5__Impl"


    // $ANTLR start "rule__Person__Group__6"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:516:1: rule__Person__Group__6 : rule__Person__Group__6__Impl rule__Person__Group__7 ;
    public final void rule__Person__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:520:1: ( rule__Person__Group__6__Impl rule__Person__Group__7 )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:521:2: rule__Person__Group__6__Impl rule__Person__Group__7
            {
            pushFollow(FOLLOW_rule__Person__Group__6__Impl_in_rule__Person__Group__61037);
            rule__Person__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Person__Group__7_in_rule__Person__Group__61040);
            rule__Person__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__6"


    // $ANTLR start "rule__Person__Group__6__Impl"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:528:1: rule__Person__Group__6__Impl : ( 'spricht' ) ;
    public final void rule__Person__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:532:1: ( ( 'spricht' ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:533:1: ( 'spricht' )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:533:1: ( 'spricht' )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:534:1: 'spricht'
            {
             before(grammarAccess.getPersonAccess().getSprichtKeyword_6()); 
            match(input,21,FOLLOW_21_in_rule__Person__Group__6__Impl1068); 
             after(grammarAccess.getPersonAccess().getSprichtKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__6__Impl"


    // $ANTLR start "rule__Person__Group__7"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:547:1: rule__Person__Group__7 : rule__Person__Group__7__Impl ;
    public final void rule__Person__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:551:1: ( rule__Person__Group__7__Impl )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:552:2: rule__Person__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Person__Group__7__Impl_in_rule__Person__Group__71099);
            rule__Person__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__7"


    // $ANTLR start "rule__Person__Group__7__Impl"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:558:1: rule__Person__Group__7__Impl : ( ( rule__Person__LangAssignment_7 ) ) ;
    public final void rule__Person__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:562:1: ( ( ( rule__Person__LangAssignment_7 ) ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:563:1: ( ( rule__Person__LangAssignment_7 ) )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:563:1: ( ( rule__Person__LangAssignment_7 ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:564:1: ( rule__Person__LangAssignment_7 )
            {
             before(grammarAccess.getPersonAccess().getLangAssignment_7()); 
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:565:1: ( rule__Person__LangAssignment_7 )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:565:2: rule__Person__LangAssignment_7
            {
            pushFollow(FOLLOW_rule__Person__LangAssignment_7_in_rule__Person__Group__7__Impl1126);
            rule__Person__LangAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getLangAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__7__Impl"


    // $ANTLR start "rule__Greeting__Group_0__0"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:591:1: rule__Greeting__Group_0__0 : rule__Greeting__Group_0__0__Impl rule__Greeting__Group_0__1 ;
    public final void rule__Greeting__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:595:1: ( rule__Greeting__Group_0__0__Impl rule__Greeting__Group_0__1 )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:596:2: rule__Greeting__Group_0__0__Impl rule__Greeting__Group_0__1
            {
            pushFollow(FOLLOW_rule__Greeting__Group_0__0__Impl_in_rule__Greeting__Group_0__01172);
            rule__Greeting__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group_0__1_in_rule__Greeting__Group_0__01175);
            rule__Greeting__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group_0__0"


    // $ANTLR start "rule__Greeting__Group_0__0__Impl"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:603:1: rule__Greeting__Group_0__0__Impl : ( ( rule__Greeting__GreetwordAssignment_0_0 ) ) ;
    public final void rule__Greeting__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:607:1: ( ( ( rule__Greeting__GreetwordAssignment_0_0 ) ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:608:1: ( ( rule__Greeting__GreetwordAssignment_0_0 ) )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:608:1: ( ( rule__Greeting__GreetwordAssignment_0_0 ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:609:1: ( rule__Greeting__GreetwordAssignment_0_0 )
            {
             before(grammarAccess.getGreetingAccess().getGreetwordAssignment_0_0()); 
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:610:1: ( rule__Greeting__GreetwordAssignment_0_0 )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:610:2: rule__Greeting__GreetwordAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Greeting__GreetwordAssignment_0_0_in_rule__Greeting__Group_0__0__Impl1202);
            rule__Greeting__GreetwordAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getGreetwordAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group_0__0__Impl"


    // $ANTLR start "rule__Greeting__Group_0__1"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:620:1: rule__Greeting__Group_0__1 : rule__Greeting__Group_0__1__Impl rule__Greeting__Group_0__2 ;
    public final void rule__Greeting__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:624:1: ( rule__Greeting__Group_0__1__Impl rule__Greeting__Group_0__2 )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:625:2: rule__Greeting__Group_0__1__Impl rule__Greeting__Group_0__2
            {
            pushFollow(FOLLOW_rule__Greeting__Group_0__1__Impl_in_rule__Greeting__Group_0__11232);
            rule__Greeting__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group_0__2_in_rule__Greeting__Group_0__11235);
            rule__Greeting__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group_0__1"


    // $ANTLR start "rule__Greeting__Group_0__1__Impl"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:632:1: rule__Greeting__Group_0__1__Impl : ( ( rule__Greeting__PersonAssignment_0_1 ) ) ;
    public final void rule__Greeting__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:636:1: ( ( ( rule__Greeting__PersonAssignment_0_1 ) ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:637:1: ( ( rule__Greeting__PersonAssignment_0_1 ) )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:637:1: ( ( rule__Greeting__PersonAssignment_0_1 ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:638:1: ( rule__Greeting__PersonAssignment_0_1 )
            {
             before(grammarAccess.getGreetingAccess().getPersonAssignment_0_1()); 
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:639:1: ( rule__Greeting__PersonAssignment_0_1 )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:639:2: rule__Greeting__PersonAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Greeting__PersonAssignment_0_1_in_rule__Greeting__Group_0__1__Impl1262);
            rule__Greeting__PersonAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getPersonAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group_0__1__Impl"


    // $ANTLR start "rule__Greeting__Group_0__2"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:649:1: rule__Greeting__Group_0__2 : rule__Greeting__Group_0__2__Impl ;
    public final void rule__Greeting__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:653:1: ( rule__Greeting__Group_0__2__Impl )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:654:2: rule__Greeting__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Greeting__Group_0__2__Impl_in_rule__Greeting__Group_0__21292);
            rule__Greeting__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group_0__2"


    // $ANTLR start "rule__Greeting__Group_0__2__Impl"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:660:1: rule__Greeting__Group_0__2__Impl : ( '!' ) ;
    public final void rule__Greeting__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:664:1: ( ( '!' ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:665:1: ( '!' )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:665:1: ( '!' )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:666:1: '!'
            {
             before(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_0_2()); 
            match(input,22,FOLLOW_22_in_rule__Greeting__Group_0__2__Impl1320); 
             after(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group_0__2__Impl"


    // $ANTLR start "rule__Greeting__Group_1__0"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:685:1: rule__Greeting__Group_1__0 : rule__Greeting__Group_1__0__Impl rule__Greeting__Group_1__1 ;
    public final void rule__Greeting__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:689:1: ( rule__Greeting__Group_1__0__Impl rule__Greeting__Group_1__1 )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:690:2: rule__Greeting__Group_1__0__Impl rule__Greeting__Group_1__1
            {
            pushFollow(FOLLOW_rule__Greeting__Group_1__0__Impl_in_rule__Greeting__Group_1__01357);
            rule__Greeting__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group_1__1_in_rule__Greeting__Group_1__01360);
            rule__Greeting__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group_1__0"


    // $ANTLR start "rule__Greeting__Group_1__0__Impl"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:697:1: rule__Greeting__Group_1__0__Impl : ( 'Zu' ) ;
    public final void rule__Greeting__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:701:1: ( ( 'Zu' ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:702:1: ( 'Zu' )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:702:1: ( 'Zu' )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:703:1: 'Zu'
            {
             before(grammarAccess.getGreetingAccess().getZuKeyword_1_0()); 
            match(input,23,FOLLOW_23_in_rule__Greeting__Group_1__0__Impl1388); 
             after(grammarAccess.getGreetingAccess().getZuKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group_1__0__Impl"


    // $ANTLR start "rule__Greeting__Group_1__1"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:716:1: rule__Greeting__Group_1__1 : rule__Greeting__Group_1__1__Impl rule__Greeting__Group_1__2 ;
    public final void rule__Greeting__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:720:1: ( rule__Greeting__Group_1__1__Impl rule__Greeting__Group_1__2 )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:721:2: rule__Greeting__Group_1__1__Impl rule__Greeting__Group_1__2
            {
            pushFollow(FOLLOW_rule__Greeting__Group_1__1__Impl_in_rule__Greeting__Group_1__11419);
            rule__Greeting__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group_1__2_in_rule__Greeting__Group_1__11422);
            rule__Greeting__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group_1__1"


    // $ANTLR start "rule__Greeting__Group_1__1__Impl"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:728:1: rule__Greeting__Group_1__1__Impl : ( ( rule__Greeting__PersonAssignment_1_1 ) ) ;
    public final void rule__Greeting__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:732:1: ( ( ( rule__Greeting__PersonAssignment_1_1 ) ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:733:1: ( ( rule__Greeting__PersonAssignment_1_1 ) )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:733:1: ( ( rule__Greeting__PersonAssignment_1_1 ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:734:1: ( rule__Greeting__PersonAssignment_1_1 )
            {
             before(grammarAccess.getGreetingAccess().getPersonAssignment_1_1()); 
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:735:1: ( rule__Greeting__PersonAssignment_1_1 )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:735:2: rule__Greeting__PersonAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Greeting__PersonAssignment_1_1_in_rule__Greeting__Group_1__1__Impl1449);
            rule__Greeting__PersonAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getPersonAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group_1__1__Impl"


    // $ANTLR start "rule__Greeting__Group_1__2"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:745:1: rule__Greeting__Group_1__2 : rule__Greeting__Group_1__2__Impl rule__Greeting__Group_1__3 ;
    public final void rule__Greeting__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:749:1: ( rule__Greeting__Group_1__2__Impl rule__Greeting__Group_1__3 )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:750:2: rule__Greeting__Group_1__2__Impl rule__Greeting__Group_1__3
            {
            pushFollow(FOLLOW_rule__Greeting__Group_1__2__Impl_in_rule__Greeting__Group_1__21479);
            rule__Greeting__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group_1__3_in_rule__Greeting__Group_1__21482);
            rule__Greeting__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group_1__2"


    // $ANTLR start "rule__Greeting__Group_1__2__Impl"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:757:1: rule__Greeting__Group_1__2__Impl : ( 'sage' ) ;
    public final void rule__Greeting__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:761:1: ( ( 'sage' ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:762:1: ( 'sage' )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:762:1: ( 'sage' )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:763:1: 'sage'
            {
             before(grammarAccess.getGreetingAccess().getSageKeyword_1_2()); 
            match(input,24,FOLLOW_24_in_rule__Greeting__Group_1__2__Impl1510); 
             after(grammarAccess.getGreetingAccess().getSageKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group_1__2__Impl"


    // $ANTLR start "rule__Greeting__Group_1__3"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:776:1: rule__Greeting__Group_1__3 : rule__Greeting__Group_1__3__Impl rule__Greeting__Group_1__4 ;
    public final void rule__Greeting__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:780:1: ( rule__Greeting__Group_1__3__Impl rule__Greeting__Group_1__4 )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:781:2: rule__Greeting__Group_1__3__Impl rule__Greeting__Group_1__4
            {
            pushFollow(FOLLOW_rule__Greeting__Group_1__3__Impl_in_rule__Greeting__Group_1__31541);
            rule__Greeting__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group_1__4_in_rule__Greeting__Group_1__31544);
            rule__Greeting__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group_1__3"


    // $ANTLR start "rule__Greeting__Group_1__3__Impl"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:788:1: rule__Greeting__Group_1__3__Impl : ( 'ich' ) ;
    public final void rule__Greeting__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:792:1: ( ( 'ich' ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:793:1: ( 'ich' )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:793:1: ( 'ich' )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:794:1: 'ich'
            {
             before(grammarAccess.getGreetingAccess().getIchKeyword_1_3()); 
            match(input,25,FOLLOW_25_in_rule__Greeting__Group_1__3__Impl1572); 
             after(grammarAccess.getGreetingAccess().getIchKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group_1__3__Impl"


    // $ANTLR start "rule__Greeting__Group_1__4"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:807:1: rule__Greeting__Group_1__4 : rule__Greeting__Group_1__4__Impl ;
    public final void rule__Greeting__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:811:1: ( rule__Greeting__Group_1__4__Impl )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:812:2: rule__Greeting__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__Greeting__Group_1__4__Impl_in_rule__Greeting__Group_1__41603);
            rule__Greeting__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group_1__4"


    // $ANTLR start "rule__Greeting__Group_1__4__Impl"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:818:1: rule__Greeting__Group_1__4__Impl : ( ( rule__Greeting__GreetwordAssignment_1_4 ) ) ;
    public final void rule__Greeting__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:822:1: ( ( ( rule__Greeting__GreetwordAssignment_1_4 ) ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:823:1: ( ( rule__Greeting__GreetwordAssignment_1_4 ) )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:823:1: ( ( rule__Greeting__GreetwordAssignment_1_4 ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:824:1: ( rule__Greeting__GreetwordAssignment_1_4 )
            {
             before(grammarAccess.getGreetingAccess().getGreetwordAssignment_1_4()); 
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:825:1: ( rule__Greeting__GreetwordAssignment_1_4 )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:825:2: rule__Greeting__GreetwordAssignment_1_4
            {
            pushFollow(FOLLOW_rule__Greeting__GreetwordAssignment_1_4_in_rule__Greeting__Group_1__4__Impl1630);
            rule__Greeting__GreetwordAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getGreetwordAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group_1__4__Impl"


    // $ANTLR start "rule__Model__PersonsAssignment_0"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:846:1: rule__Model__PersonsAssignment_0 : ( rulePerson ) ;
    public final void rule__Model__PersonsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:850:1: ( ( rulePerson ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:851:1: ( rulePerson )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:851:1: ( rulePerson )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:852:1: rulePerson
            {
             before(grammarAccess.getModelAccess().getPersonsPersonParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePerson_in_rule__Model__PersonsAssignment_01675);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPersonsPersonParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PersonsAssignment_0"


    // $ANTLR start "rule__Model__GreetingsAssignment_1"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:861:1: rule__Model__GreetingsAssignment_1 : ( ruleGreeting ) ;
    public final void rule__Model__GreetingsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:865:1: ( ( ruleGreeting ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:866:1: ( ruleGreeting )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:866:1: ( ruleGreeting )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:867:1: ruleGreeting
            {
             before(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleGreeting_in_rule__Model__GreetingsAssignment_11706);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__GreetingsAssignment_1"


    // $ANTLR start "rule__Person__NameAssignment_1"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:876:1: rule__Person__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Person__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:880:1: ( ( RULE_ID ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:881:1: ( RULE_ID )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:881:1: ( RULE_ID )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:882:1: RULE_ID
            {
             before(grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Person__NameAssignment_11737); 
             after(grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__NameAssignment_1"


    // $ANTLR start "rule__Person__FnAssignment_3"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:891:1: rule__Person__FnAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Person__FnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:895:1: ( ( RULE_STRING ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:896:1: ( RULE_STRING )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:896:1: ( RULE_STRING )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:897:1: RULE_STRING
            {
             before(grammarAccess.getPersonAccess().getFnSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Person__FnAssignment_31768); 
             after(grammarAccess.getPersonAccess().getFnSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__FnAssignment_3"


    // $ANTLR start "rule__Person__LnAssignment_5"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:906:1: rule__Person__LnAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Person__LnAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:910:1: ( ( RULE_STRING ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:911:1: ( RULE_STRING )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:911:1: ( RULE_STRING )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:912:1: RULE_STRING
            {
             before(grammarAccess.getPersonAccess().getLnSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Person__LnAssignment_51799); 
             after(grammarAccess.getPersonAccess().getLnSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__LnAssignment_5"


    // $ANTLR start "rule__Person__LangAssignment_7"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:921:1: rule__Person__LangAssignment_7 : ( ruleLanguage ) ;
    public final void rule__Person__LangAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:925:1: ( ( ruleLanguage ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:926:1: ( ruleLanguage )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:926:1: ( ruleLanguage )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:927:1: ruleLanguage
            {
             before(grammarAccess.getPersonAccess().getLangLanguageEnumRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleLanguage_in_rule__Person__LangAssignment_71830);
            ruleLanguage();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getLangLanguageEnumRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__LangAssignment_7"


    // $ANTLR start "rule__Greeting__GreetwordAssignment_0_0"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:936:1: rule__Greeting__GreetwordAssignment_0_0 : ( ruleGreetword ) ;
    public final void rule__Greeting__GreetwordAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:940:1: ( ( ruleGreetword ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:941:1: ( ruleGreetword )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:941:1: ( ruleGreetword )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:942:1: ruleGreetword
            {
             before(grammarAccess.getGreetingAccess().getGreetwordGreetwordEnumRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleGreetword_in_rule__Greeting__GreetwordAssignment_0_01861);
            ruleGreetword();

            state._fsp--;

             after(grammarAccess.getGreetingAccess().getGreetwordGreetwordEnumRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__GreetwordAssignment_0_0"


    // $ANTLR start "rule__Greeting__PersonAssignment_0_1"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:951:1: rule__Greeting__PersonAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Greeting__PersonAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:955:1: ( ( ( RULE_ID ) ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:956:1: ( ( RULE_ID ) )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:956:1: ( ( RULE_ID ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:957:1: ( RULE_ID )
            {
             before(grammarAccess.getGreetingAccess().getPersonPersonCrossReference_0_1_0()); 
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:958:1: ( RULE_ID )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:959:1: RULE_ID
            {
             before(grammarAccess.getGreetingAccess().getPersonPersonIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Greeting__PersonAssignment_0_11896); 
             after(grammarAccess.getGreetingAccess().getPersonPersonIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getGreetingAccess().getPersonPersonCrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__PersonAssignment_0_1"


    // $ANTLR start "rule__Greeting__PersonAssignment_1_1"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:970:1: rule__Greeting__PersonAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Greeting__PersonAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:974:1: ( ( ( RULE_ID ) ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:975:1: ( ( RULE_ID ) )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:975:1: ( ( RULE_ID ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:976:1: ( RULE_ID )
            {
             before(grammarAccess.getGreetingAccess().getPersonPersonCrossReference_1_1_0()); 
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:977:1: ( RULE_ID )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:978:1: RULE_ID
            {
             before(grammarAccess.getGreetingAccess().getPersonPersonIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Greeting__PersonAssignment_1_11935); 
             after(grammarAccess.getGreetingAccess().getPersonPersonIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getGreetingAccess().getPersonPersonCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__PersonAssignment_1_1"


    // $ANTLR start "rule__Greeting__GreetwordAssignment_1_4"
    // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:989:1: rule__Greeting__GreetwordAssignment_1_4 : ( ruleGreetword ) ;
    public final void rule__Greeting__GreetwordAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:993:1: ( ( ruleGreetword ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:994:1: ( ruleGreetword )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:994:1: ( ruleGreetword )
            // ../com.senacor.mdsd.hh.editortweaks.greeter.ui/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:995:1: ruleGreetword
            {
             before(grammarAccess.getGreetingAccess().getGreetwordGreetwordEnumRuleCall_1_4_0()); 
            pushFollow(FOLLOW_ruleGreetword_in_rule__Greeting__GreetwordAssignment_1_41970);
            ruleGreetword();

            state._fsp--;

             after(grammarAccess.getGreetingAccess().getGreetwordGreetwordEnumRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__GreetwordAssignment_1_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePerson_in_entryRulePerson121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePerson128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Person__Group__0_in_rulePerson154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Alternatives_in_ruleGreeting214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greetword__Alternatives_in_ruleGreetword251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Alternatives_in_ruleLanguage287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group_0__0_in_rule__Greeting__Alternatives322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group_1__0_in_rule__Greeting__Alternatives340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Greetword__Alternatives374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Greetword__Alternatives395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Greetword__Alternatives416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Greetword__Alternatives437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Language__Alternatives473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Language__Alternatives494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Language__Alternatives515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0548 = new BitSet(new long[]{0x0000000000807800L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PersonsAssignment_0_in_rule__Model__Group__0__Impl578 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__GreetingsAssignment_1_in_rule__Model__Group__1__Impl636 = new BitSet(new long[]{0x0000000000807802L});
    public static final BitSet FOLLOW_rule__Person__Group__0__Impl_in_rule__Person__Group__0671 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Person__Group__1_in_rule__Person__Group__0674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Person__Group__0__Impl702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Person__Group__1__Impl_in_rule__Person__Group__1733 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Person__Group__2_in_rule__Person__Group__1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Person__NameAssignment_1_in_rule__Person__Group__1__Impl763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Person__Group__2__Impl_in_rule__Person__Group__2793 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Person__Group__3_in_rule__Person__Group__2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Person__Group__2__Impl824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Person__Group__3__Impl_in_rule__Person__Group__3855 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Person__Group__4_in_rule__Person__Group__3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Person__FnAssignment_3_in_rule__Person__Group__3__Impl885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Person__Group__4__Impl_in_rule__Person__Group__4915 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Person__Group__5_in_rule__Person__Group__4918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Person__Group__4__Impl946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Person__Group__5__Impl_in_rule__Person__Group__5977 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Person__Group__6_in_rule__Person__Group__5980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Person__LnAssignment_5_in_rule__Person__Group__5__Impl1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Person__Group__6__Impl_in_rule__Person__Group__61037 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_rule__Person__Group__7_in_rule__Person__Group__61040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Person__Group__6__Impl1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Person__Group__7__Impl_in_rule__Person__Group__71099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Person__LangAssignment_7_in_rule__Person__Group__7__Impl1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group_0__0__Impl_in_rule__Greeting__Group_0__01172 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Greeting__Group_0__1_in_rule__Greeting__Group_0__01175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__GreetwordAssignment_0_0_in_rule__Greeting__Group_0__0__Impl1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group_0__1__Impl_in_rule__Greeting__Group_0__11232 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Greeting__Group_0__2_in_rule__Greeting__Group_0__11235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__PersonAssignment_0_1_in_rule__Greeting__Group_0__1__Impl1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group_0__2__Impl_in_rule__Greeting__Group_0__21292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Greeting__Group_0__2__Impl1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group_1__0__Impl_in_rule__Greeting__Group_1__01357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Greeting__Group_1__1_in_rule__Greeting__Group_1__01360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Greeting__Group_1__0__Impl1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group_1__1__Impl_in_rule__Greeting__Group_1__11419 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Greeting__Group_1__2_in_rule__Greeting__Group_1__11422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__PersonAssignment_1_1_in_rule__Greeting__Group_1__1__Impl1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group_1__2__Impl_in_rule__Greeting__Group_1__21479 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Greeting__Group_1__3_in_rule__Greeting__Group_1__21482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Greeting__Group_1__2__Impl1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group_1__3__Impl_in_rule__Greeting__Group_1__31541 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__Greeting__Group_1__4_in_rule__Greeting__Group_1__31544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Greeting__Group_1__3__Impl1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group_1__4__Impl_in_rule__Greeting__Group_1__41603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__GreetwordAssignment_1_4_in_rule__Greeting__Group_1__4__Impl1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePerson_in_rule__Model__PersonsAssignment_01675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_rule__Model__GreetingsAssignment_11706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Person__NameAssignment_11737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Person__FnAssignment_31768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Person__LnAssignment_51799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLanguage_in_rule__Person__LangAssignment_71830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreetword_in_rule__Greeting__GreetwordAssignment_0_01861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Greeting__PersonAssignment_0_11896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Greeting__PersonAssignment_1_11935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreetword_in_rule__Greeting__GreetwordAssignment_1_41970 = new BitSet(new long[]{0x0000000000000002L});

}