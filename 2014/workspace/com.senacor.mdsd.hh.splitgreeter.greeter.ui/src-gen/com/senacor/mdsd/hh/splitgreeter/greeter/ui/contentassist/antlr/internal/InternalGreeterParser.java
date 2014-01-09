package com.senacor.mdsd.hh.splitgreeter.greeter.ui.contentassist.antlr.internal; 

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
import com.senacor.mdsd.hh.splitgreeter.greeter.services.GreeterGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGreeterParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hallo'", "'Huhu'", "'Hello'", "'Bonjour'", "'!'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalGreeterParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGreeterParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGreeterParser.tokenNames; }
    public String getGrammarFileName() { return "../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g"; }


     
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
    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:61:1: ( ruleModel EOF )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:62:1: ruleModel EOF
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
    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:69:1: ruleModel : ( ( rule__Model__GreetingsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:73:2: ( ( ( rule__Model__GreetingsAssignment )* ) )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:74:1: ( ( rule__Model__GreetingsAssignment )* )
            {
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:74:1: ( ( rule__Model__GreetingsAssignment )* )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:75:1: ( rule__Model__GreetingsAssignment )*
            {
             before(grammarAccess.getModelAccess().getGreetingsAssignment()); 
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:76:1: ( rule__Model__GreetingsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=14)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:76:2: rule__Model__GreetingsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__GreetingsAssignment_in_ruleModel94);
            	    rule__Model__GreetingsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGreetingsAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleGreeting"
    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:88:1: entryRuleGreeting : ruleGreeting EOF ;
    public final void entryRuleGreeting() throws RecognitionException {
        try {
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:89:1: ( ruleGreeting EOF )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:90:1: ruleGreeting EOF
            {
             before(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting122);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getGreetingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting129); 

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
    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:97:1: ruleGreeting : ( ( rule__Greeting__Group__0 ) ) ;
    public final void ruleGreeting() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:101:2: ( ( ( rule__Greeting__Group__0 ) ) )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:102:1: ( ( rule__Greeting__Group__0 ) )
            {
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:102:1: ( ( rule__Greeting__Group__0 ) )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:103:1: ( rule__Greeting__Group__0 )
            {
             before(grammarAccess.getGreetingAccess().getGroup()); 
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:104:1: ( rule__Greeting__Group__0 )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:104:2: rule__Greeting__Group__0
            {
            pushFollow(FOLLOW_rule__Greeting__Group__0_in_ruleGreeting155);
            rule__Greeting__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getGroup()); 

            }


            }

        }
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
    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:117:1: ruleGreetword : ( ( rule__Greetword__Alternatives ) ) ;
    public final void ruleGreetword() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:121:1: ( ( ( rule__Greetword__Alternatives ) ) )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:122:1: ( ( rule__Greetword__Alternatives ) )
            {
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:122:1: ( ( rule__Greetword__Alternatives ) )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:123:1: ( rule__Greetword__Alternatives )
            {
             before(grammarAccess.getGreetwordAccess().getAlternatives()); 
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:124:1: ( rule__Greetword__Alternatives )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:124:2: rule__Greetword__Alternatives
            {
            pushFollow(FOLLOW_rule__Greetword__Alternatives_in_ruleGreetword192);
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


    // $ANTLR start "rule__Greetword__Alternatives"
    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:135:1: rule__Greetword__Alternatives : ( ( ( 'Hallo' ) ) | ( ( 'Huhu' ) ) | ( ( 'Hello' ) ) | ( ( 'Bonjour' ) ) );
    public final void rule__Greetword__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:139:1: ( ( ( 'Hallo' ) ) | ( ( 'Huhu' ) ) | ( ( 'Hello' ) ) | ( ( 'Bonjour' ) ) )
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
                    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:140:1: ( ( 'Hallo' ) )
                    {
                    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:140:1: ( ( 'Hallo' ) )
                    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:141:1: ( 'Hallo' )
                    {
                     before(grammarAccess.getGreetwordAccess().getDEEnumLiteralDeclaration_0()); 
                    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:142:1: ( 'Hallo' )
                    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:142:3: 'Hallo'
                    {
                    match(input,11,FOLLOW_11_in_rule__Greetword__Alternatives228); 

                    }

                     after(grammarAccess.getGreetwordAccess().getDEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:147:6: ( ( 'Huhu' ) )
                    {
                    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:147:6: ( ( 'Huhu' ) )
                    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:148:1: ( 'Huhu' )
                    {
                     before(grammarAccess.getGreetwordAccess().getDEEnumLiteralDeclaration_1()); 
                    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:149:1: ( 'Huhu' )
                    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:149:3: 'Huhu'
                    {
                    match(input,12,FOLLOW_12_in_rule__Greetword__Alternatives249); 

                    }

                     after(grammarAccess.getGreetwordAccess().getDEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:154:6: ( ( 'Hello' ) )
                    {
                    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:154:6: ( ( 'Hello' ) )
                    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:155:1: ( 'Hello' )
                    {
                     before(grammarAccess.getGreetwordAccess().getENEnumLiteralDeclaration_2()); 
                    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:156:1: ( 'Hello' )
                    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:156:3: 'Hello'
                    {
                    match(input,13,FOLLOW_13_in_rule__Greetword__Alternatives270); 

                    }

                     after(grammarAccess.getGreetwordAccess().getENEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:161:6: ( ( 'Bonjour' ) )
                    {
                    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:161:6: ( ( 'Bonjour' ) )
                    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:162:1: ( 'Bonjour' )
                    {
                     before(grammarAccess.getGreetwordAccess().getFREnumLiteralDeclaration_3()); 
                    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:163:1: ( 'Bonjour' )
                    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:163:3: 'Bonjour'
                    {
                    match(input,14,FOLLOW_14_in_rule__Greetword__Alternatives291); 

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


    // $ANTLR start "rule__Greeting__Group__0"
    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:175:1: rule__Greeting__Group__0 : rule__Greeting__Group__0__Impl rule__Greeting__Group__1 ;
    public final void rule__Greeting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:179:1: ( rule__Greeting__Group__0__Impl rule__Greeting__Group__1 )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:180:2: rule__Greeting__Group__0__Impl rule__Greeting__Group__1
            {
            pushFollow(FOLLOW_rule__Greeting__Group__0__Impl_in_rule__Greeting__Group__0324);
            rule__Greeting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__1_in_rule__Greeting__Group__0327);
            rule__Greeting__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__0"


    // $ANTLR start "rule__Greeting__Group__0__Impl"
    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:187:1: rule__Greeting__Group__0__Impl : ( ( rule__Greeting__GreetwordAssignment_0 ) ) ;
    public final void rule__Greeting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:191:1: ( ( ( rule__Greeting__GreetwordAssignment_0 ) ) )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:192:1: ( ( rule__Greeting__GreetwordAssignment_0 ) )
            {
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:192:1: ( ( rule__Greeting__GreetwordAssignment_0 ) )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:193:1: ( rule__Greeting__GreetwordAssignment_0 )
            {
             before(grammarAccess.getGreetingAccess().getGreetwordAssignment_0()); 
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:194:1: ( rule__Greeting__GreetwordAssignment_0 )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:194:2: rule__Greeting__GreetwordAssignment_0
            {
            pushFollow(FOLLOW_rule__Greeting__GreetwordAssignment_0_in_rule__Greeting__Group__0__Impl354);
            rule__Greeting__GreetwordAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getGreetwordAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__0__Impl"


    // $ANTLR start "rule__Greeting__Group__1"
    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:204:1: rule__Greeting__Group__1 : rule__Greeting__Group__1__Impl rule__Greeting__Group__2 ;
    public final void rule__Greeting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:208:1: ( rule__Greeting__Group__1__Impl rule__Greeting__Group__2 )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:209:2: rule__Greeting__Group__1__Impl rule__Greeting__Group__2
            {
            pushFollow(FOLLOW_rule__Greeting__Group__1__Impl_in_rule__Greeting__Group__1384);
            rule__Greeting__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__2_in_rule__Greeting__Group__1387);
            rule__Greeting__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__1"


    // $ANTLR start "rule__Greeting__Group__1__Impl"
    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:216:1: rule__Greeting__Group__1__Impl : ( ( rule__Greeting__PersonAssignment_1 ) ) ;
    public final void rule__Greeting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:220:1: ( ( ( rule__Greeting__PersonAssignment_1 ) ) )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:221:1: ( ( rule__Greeting__PersonAssignment_1 ) )
            {
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:221:1: ( ( rule__Greeting__PersonAssignment_1 ) )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:222:1: ( rule__Greeting__PersonAssignment_1 )
            {
             before(grammarAccess.getGreetingAccess().getPersonAssignment_1()); 
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:223:1: ( rule__Greeting__PersonAssignment_1 )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:223:2: rule__Greeting__PersonAssignment_1
            {
            pushFollow(FOLLOW_rule__Greeting__PersonAssignment_1_in_rule__Greeting__Group__1__Impl414);
            rule__Greeting__PersonAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getPersonAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__1__Impl"


    // $ANTLR start "rule__Greeting__Group__2"
    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:233:1: rule__Greeting__Group__2 : rule__Greeting__Group__2__Impl ;
    public final void rule__Greeting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:237:1: ( rule__Greeting__Group__2__Impl )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:238:2: rule__Greeting__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Greeting__Group__2__Impl_in_rule__Greeting__Group__2444);
            rule__Greeting__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__2"


    // $ANTLR start "rule__Greeting__Group__2__Impl"
    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:244:1: rule__Greeting__Group__2__Impl : ( '!' ) ;
    public final void rule__Greeting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:248:1: ( ( '!' ) )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:249:1: ( '!' )
            {
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:249:1: ( '!' )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:250:1: '!'
            {
             before(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Greeting__Group__2__Impl472); 
             after(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__2__Impl"


    // $ANTLR start "rule__Model__GreetingsAssignment"
    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:270:1: rule__Model__GreetingsAssignment : ( ruleGreeting ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:274:1: ( ( ruleGreeting ) )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:275:1: ( ruleGreeting )
            {
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:275:1: ( ruleGreeting )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:276:1: ruleGreeting
            {
             before(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleGreeting_in_rule__Model__GreetingsAssignment514);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__GreetingsAssignment"


    // $ANTLR start "rule__Greeting__GreetwordAssignment_0"
    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:285:1: rule__Greeting__GreetwordAssignment_0 : ( ruleGreetword ) ;
    public final void rule__Greeting__GreetwordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:289:1: ( ( ruleGreetword ) )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:290:1: ( ruleGreetword )
            {
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:290:1: ( ruleGreetword )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:291:1: ruleGreetword
            {
             before(grammarAccess.getGreetingAccess().getGreetwordGreetwordEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleGreetword_in_rule__Greeting__GreetwordAssignment_0545);
            ruleGreetword();

            state._fsp--;

             after(grammarAccess.getGreetingAccess().getGreetwordGreetwordEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__GreetwordAssignment_0"


    // $ANTLR start "rule__Greeting__PersonAssignment_1"
    // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:300:1: rule__Greeting__PersonAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Greeting__PersonAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:304:1: ( ( ( RULE_ID ) ) )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:305:1: ( ( RULE_ID ) )
            {
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:305:1: ( ( RULE_ID ) )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:306:1: ( RULE_ID )
            {
             before(grammarAccess.getGreetingAccess().getPersonPersonCrossReference_1_0()); 
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:307:1: ( RULE_ID )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter.ui/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/ui/contentassist/antlr/internal/InternalGreeter.g:308:1: RULE_ID
            {
             before(grammarAccess.getGreetingAccess().getPersonPersonIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Greeting__PersonAssignment_1580); 
             after(grammarAccess.getGreetingAccess().getPersonPersonIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getGreetingAccess().getPersonPersonCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__PersonAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__GreetingsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000007802L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__0_in_ruleGreeting155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greetword__Alternatives_in_ruleGreetword192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Greetword__Alternatives228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Greetword__Alternatives249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Greetword__Alternatives270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Greetword__Alternatives291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__0__Impl_in_rule__Greeting__Group__0324 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Greeting__Group__1_in_rule__Greeting__Group__0327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__GreetwordAssignment_0_in_rule__Greeting__Group__0__Impl354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__1__Impl_in_rule__Greeting__Group__1384 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Greeting__Group__2_in_rule__Greeting__Group__1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__PersonAssignment_1_in_rule__Greeting__Group__1__Impl414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__2__Impl_in_rule__Greeting__Group__2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Greeting__Group__2__Impl472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_rule__Model__GreetingsAssignment514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreetword_in_rule__Greeting__GreetwordAssignment_0545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Greeting__PersonAssignment_1580 = new BitSet(new long[]{0x0000000000000002L});

}