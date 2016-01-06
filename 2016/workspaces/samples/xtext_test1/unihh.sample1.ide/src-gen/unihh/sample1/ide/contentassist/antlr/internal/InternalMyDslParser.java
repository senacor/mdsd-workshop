package unihh.sample1.ide.contentassist.antlr.internal;

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
import unihh.sample1.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'Int'", "'Domains'", "'{'", "'}'", "'Bounded Contexts'", "'Aggregates'", "'desc'", "':'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Model__Group__0 )
            // InternalMyDsl.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleDomain"
    // InternalMyDsl.g:78:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleDomain EOF )
            // InternalMyDsl.g:80:1: ruleDomain EOF
            {
             before(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_1);
            ruleDomain();

            state._fsp--;

             after(grammarAccess.getDomainRule()); 
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
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // InternalMyDsl.g:87:1: ruleDomain : ( ( rule__Domain__Group__0 ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Domain__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Domain__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Domain__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Domain__Group__0 )
            {
             before(grammarAccess.getDomainAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Domain__Group__0 )
            // InternalMyDsl.g:94:4: rule__Domain__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Domain__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleContext"
    // InternalMyDsl.g:103:1: entryRuleContext : ruleContext EOF ;
    public final void entryRuleContext() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleContext EOF )
            // InternalMyDsl.g:105:1: ruleContext EOF
            {
             before(grammarAccess.getContextRule()); 
            pushFollow(FOLLOW_1);
            ruleContext();

            state._fsp--;

             after(grammarAccess.getContextRule()); 
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
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // InternalMyDsl.g:112:1: ruleContext : ( ( rule__Context__Group__0 ) ) ;
    public final void ruleContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Context__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Context__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Context__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Context__Group__0 )
            {
             before(grammarAccess.getContextAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Context__Group__0 )
            // InternalMyDsl.g:119:4: rule__Context__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Context__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleAggregate"
    // InternalMyDsl.g:128:1: entryRuleAggregate : ruleAggregate EOF ;
    public final void entryRuleAggregate() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleAggregate EOF )
            // InternalMyDsl.g:130:1: ruleAggregate EOF
            {
             before(grammarAccess.getAggregateRule()); 
            pushFollow(FOLLOW_1);
            ruleAggregate();

            state._fsp--;

             after(grammarAccess.getAggregateRule()); 
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
    // $ANTLR end "entryRuleAggregate"


    // $ANTLR start "ruleAggregate"
    // InternalMyDsl.g:137:1: ruleAggregate : ( ( rule__Aggregate__Group__0 ) ) ;
    public final void ruleAggregate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Aggregate__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Aggregate__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Aggregate__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Aggregate__Group__0 )
            {
             before(grammarAccess.getAggregateAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Aggregate__Group__0 )
            // InternalMyDsl.g:144:4: rule__Aggregate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Aggregate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAggregateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAggregate"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDsl.g:153:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleAttribute EOF )
            // InternalMyDsl.g:155:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDsl.g:162:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Attribute__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Attribute__Group__0 )
            // InternalMyDsl.g:169:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:178:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:182:1: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMyDsl.g:183:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMyDsl.g:183:2: ( ( rule__Type__Alternatives ) )
            // InternalMyDsl.g:184:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:185:3: ( rule__Type__Alternatives )
            // InternalMyDsl.g:185:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalMyDsl.g:193:1: rule__Type__Alternatives : ( ( ( 'String' ) ) | ( ( 'Int' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:197:1: ( ( ( 'String' ) ) | ( ( 'Int' ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:198:2: ( ( 'String' ) )
                    {
                    // InternalMyDsl.g:198:2: ( ( 'String' ) )
                    // InternalMyDsl.g:199:3: ( 'String' )
                    {
                     before(grammarAccess.getTypeAccess().getT_STRINGEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:200:3: ( 'String' )
                    // InternalMyDsl.g:200:4: 'String'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getT_STRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:204:2: ( ( 'Int' ) )
                    {
                    // InternalMyDsl.g:204:2: ( ( 'Int' ) )
                    // InternalMyDsl.g:205:3: ( 'Int' )
                    {
                     before(grammarAccess.getTypeAccess().getT_INTEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:206:3: ( 'Int' )
                    // InternalMyDsl.g:206:4: 'Int'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getT_INTEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalMyDsl.g:214:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:218:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMyDsl.g:219:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalMyDsl.g:226:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:230:1: ( ( () ) )
            // InternalMyDsl.g:231:1: ( () )
            {
            // InternalMyDsl.g:231:1: ( () )
            // InternalMyDsl.g:232:2: ()
            {
             before(grammarAccess.getModelAccess().getFooAction_0()); 
            // InternalMyDsl.g:233:2: ()
            // InternalMyDsl.g:233:3: 
            {
            }

             after(grammarAccess.getModelAccess().getFooAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalMyDsl.g:241:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:245:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalMyDsl.g:246:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:253:1: rule__Model__Group__1__Impl : ( 'Domains' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:257:1: ( ( 'Domains' ) )
            // InternalMyDsl.g:258:1: ( 'Domains' )
            {
            // InternalMyDsl.g:258:1: ( 'Domains' )
            // InternalMyDsl.g:259:2: 'Domains'
            {
             before(grammarAccess.getModelAccess().getDomainsKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getDomainsKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Model__Group__2"
    // InternalMyDsl.g:268:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:272:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalMyDsl.g:273:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalMyDsl.g:280:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:284:1: ( ( '{' ) )
            // InternalMyDsl.g:285:1: ( '{' )
            {
            // InternalMyDsl.g:285:1: ( '{' )
            // InternalMyDsl.g:286:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalMyDsl.g:295:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:299:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalMyDsl.g:300:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalMyDsl.g:307:1: rule__Model__Group__3__Impl : ( ( rule__Model__DomainsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:311:1: ( ( ( rule__Model__DomainsAssignment_3 )* ) )
            // InternalMyDsl.g:312:1: ( ( rule__Model__DomainsAssignment_3 )* )
            {
            // InternalMyDsl.g:312:1: ( ( rule__Model__DomainsAssignment_3 )* )
            // InternalMyDsl.g:313:2: ( rule__Model__DomainsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getDomainsAssignment_3()); 
            // InternalMyDsl.g:314:2: ( rule__Model__DomainsAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:314:3: rule__Model__DomainsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__DomainsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDomainsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalMyDsl.g:322:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:326:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalMyDsl.g:327:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalMyDsl.g:334:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:338:1: ( ( '}' ) )
            // InternalMyDsl.g:339:1: ( '}' )
            {
            // InternalMyDsl.g:339:1: ( '}' )
            // InternalMyDsl.g:340:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalMyDsl.g:349:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:353:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalMyDsl.g:354:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalMyDsl.g:361:1: rule__Model__Group__5__Impl : ( 'Bounded Contexts' ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:365:1: ( ( 'Bounded Contexts' ) )
            // InternalMyDsl.g:366:1: ( 'Bounded Contexts' )
            {
            // InternalMyDsl.g:366:1: ( 'Bounded Contexts' )
            // InternalMyDsl.g:367:2: 'Bounded Contexts'
            {
             before(grammarAccess.getModelAccess().getBoundedContextsKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getBoundedContextsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // InternalMyDsl.g:376:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:380:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // InternalMyDsl.g:381:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // InternalMyDsl.g:388:1: rule__Model__Group__6__Impl : ( '{' ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:392:1: ( ( '{' ) )
            // InternalMyDsl.g:393:1: ( '{' )
            {
            // InternalMyDsl.g:393:1: ( '{' )
            // InternalMyDsl.g:394:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Model__Group__7"
    // InternalMyDsl.g:403:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:407:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // InternalMyDsl.g:408:2: rule__Model__Group__7__Impl rule__Model__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7"


    // $ANTLR start "rule__Model__Group__7__Impl"
    // InternalMyDsl.g:415:1: rule__Model__Group__7__Impl : ( ( rule__Model__ContextsAssignment_7 )* ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:419:1: ( ( ( rule__Model__ContextsAssignment_7 )* ) )
            // InternalMyDsl.g:420:1: ( ( rule__Model__ContextsAssignment_7 )* )
            {
            // InternalMyDsl.g:420:1: ( ( rule__Model__ContextsAssignment_7 )* )
            // InternalMyDsl.g:421:2: ( rule__Model__ContextsAssignment_7 )*
            {
             before(grammarAccess.getModelAccess().getContextsAssignment_7()); 
            // InternalMyDsl.g:422:2: ( rule__Model__ContextsAssignment_7 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:422:3: rule__Model__ContextsAssignment_7
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__ContextsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getContextsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7__Impl"


    // $ANTLR start "rule__Model__Group__8"
    // InternalMyDsl.g:430:1: rule__Model__Group__8 : rule__Model__Group__8__Impl rule__Model__Group__9 ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:434:1: ( rule__Model__Group__8__Impl rule__Model__Group__9 )
            // InternalMyDsl.g:435:2: rule__Model__Group__8__Impl rule__Model__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__8"


    // $ANTLR start "rule__Model__Group__8__Impl"
    // InternalMyDsl.g:442:1: rule__Model__Group__8__Impl : ( '}' ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:446:1: ( ( '}' ) )
            // InternalMyDsl.g:447:1: ( '}' )
            {
            // InternalMyDsl.g:447:1: ( '}' )
            // InternalMyDsl.g:448:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_8()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__8__Impl"


    // $ANTLR start "rule__Model__Group__9"
    // InternalMyDsl.g:457:1: rule__Model__Group__9 : rule__Model__Group__9__Impl rule__Model__Group__10 ;
    public final void rule__Model__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:461:1: ( rule__Model__Group__9__Impl rule__Model__Group__10 )
            // InternalMyDsl.g:462:2: rule__Model__Group__9__Impl rule__Model__Group__10
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__9"


    // $ANTLR start "rule__Model__Group__9__Impl"
    // InternalMyDsl.g:469:1: rule__Model__Group__9__Impl : ( 'Aggregates' ) ;
    public final void rule__Model__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:473:1: ( ( 'Aggregates' ) )
            // InternalMyDsl.g:474:1: ( 'Aggregates' )
            {
            // InternalMyDsl.g:474:1: ( 'Aggregates' )
            // InternalMyDsl.g:475:2: 'Aggregates'
            {
             before(grammarAccess.getModelAccess().getAggregatesKeyword_9()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getAggregatesKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__9__Impl"


    // $ANTLR start "rule__Model__Group__10"
    // InternalMyDsl.g:484:1: rule__Model__Group__10 : rule__Model__Group__10__Impl rule__Model__Group__11 ;
    public final void rule__Model__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:488:1: ( rule__Model__Group__10__Impl rule__Model__Group__11 )
            // InternalMyDsl.g:489:2: rule__Model__Group__10__Impl rule__Model__Group__11
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__10"


    // $ANTLR start "rule__Model__Group__10__Impl"
    // InternalMyDsl.g:496:1: rule__Model__Group__10__Impl : ( '{' ) ;
    public final void rule__Model__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:500:1: ( ( '{' ) )
            // InternalMyDsl.g:501:1: ( '{' )
            {
            // InternalMyDsl.g:501:1: ( '{' )
            // InternalMyDsl.g:502:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_10()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__10__Impl"


    // $ANTLR start "rule__Model__Group__11"
    // InternalMyDsl.g:511:1: rule__Model__Group__11 : rule__Model__Group__11__Impl rule__Model__Group__12 ;
    public final void rule__Model__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:515:1: ( rule__Model__Group__11__Impl rule__Model__Group__12 )
            // InternalMyDsl.g:516:2: rule__Model__Group__11__Impl rule__Model__Group__12
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__11"


    // $ANTLR start "rule__Model__Group__11__Impl"
    // InternalMyDsl.g:523:1: rule__Model__Group__11__Impl : ( ( rule__Model__AggregatesAssignment_11 )* ) ;
    public final void rule__Model__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:527:1: ( ( ( rule__Model__AggregatesAssignment_11 )* ) )
            // InternalMyDsl.g:528:1: ( ( rule__Model__AggregatesAssignment_11 )* )
            {
            // InternalMyDsl.g:528:1: ( ( rule__Model__AggregatesAssignment_11 )* )
            // InternalMyDsl.g:529:2: ( rule__Model__AggregatesAssignment_11 )*
            {
             before(grammarAccess.getModelAccess().getAggregatesAssignment_11()); 
            // InternalMyDsl.g:530:2: ( rule__Model__AggregatesAssignment_11 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:530:3: rule__Model__AggregatesAssignment_11
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__AggregatesAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAggregatesAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__11__Impl"


    // $ANTLR start "rule__Model__Group__12"
    // InternalMyDsl.g:538:1: rule__Model__Group__12 : rule__Model__Group__12__Impl ;
    public final void rule__Model__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:542:1: ( rule__Model__Group__12__Impl )
            // InternalMyDsl.g:543:2: rule__Model__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__12"


    // $ANTLR start "rule__Model__Group__12__Impl"
    // InternalMyDsl.g:549:1: rule__Model__Group__12__Impl : ( '}' ) ;
    public final void rule__Model__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:553:1: ( ( '}' ) )
            // InternalMyDsl.g:554:1: ( '}' )
            {
            // InternalMyDsl.g:554:1: ( '}' )
            // InternalMyDsl.g:555:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_12()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__12__Impl"


    // $ANTLR start "rule__Domain__Group__0"
    // InternalMyDsl.g:565:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:569:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalMyDsl.g:570:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Domain__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__0"


    // $ANTLR start "rule__Domain__Group__0__Impl"
    // InternalMyDsl.g:577:1: rule__Domain__Group__0__Impl : ( ( rule__Domain__NameAssignment_0 ) ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:581:1: ( ( ( rule__Domain__NameAssignment_0 ) ) )
            // InternalMyDsl.g:582:1: ( ( rule__Domain__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:582:1: ( ( rule__Domain__NameAssignment_0 ) )
            // InternalMyDsl.g:583:2: ( rule__Domain__NameAssignment_0 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:584:2: ( rule__Domain__NameAssignment_0 )
            // InternalMyDsl.g:584:3: rule__Domain__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Domain__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__0__Impl"


    // $ANTLR start "rule__Domain__Group__1"
    // InternalMyDsl.g:592:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:596:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // InternalMyDsl.g:597:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Domain__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__1"


    // $ANTLR start "rule__Domain__Group__1__Impl"
    // InternalMyDsl.g:604:1: rule__Domain__Group__1__Impl : ( 'desc' ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:608:1: ( ( 'desc' ) )
            // InternalMyDsl.g:609:1: ( 'desc' )
            {
            // InternalMyDsl.g:609:1: ( 'desc' )
            // InternalMyDsl.g:610:2: 'desc'
            {
             before(grammarAccess.getDomainAccess().getDescKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getDescKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__1__Impl"


    // $ANTLR start "rule__Domain__Group__2"
    // InternalMyDsl.g:619:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:623:1: ( rule__Domain__Group__2__Impl )
            // InternalMyDsl.g:624:2: rule__Domain__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Domain__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__2"


    // $ANTLR start "rule__Domain__Group__2__Impl"
    // InternalMyDsl.g:630:1: rule__Domain__Group__2__Impl : ( ( rule__Domain__DescriptionAssignment_2 ) ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:634:1: ( ( ( rule__Domain__DescriptionAssignment_2 ) ) )
            // InternalMyDsl.g:635:1: ( ( rule__Domain__DescriptionAssignment_2 ) )
            {
            // InternalMyDsl.g:635:1: ( ( rule__Domain__DescriptionAssignment_2 ) )
            // InternalMyDsl.g:636:2: ( rule__Domain__DescriptionAssignment_2 )
            {
             before(grammarAccess.getDomainAccess().getDescriptionAssignment_2()); 
            // InternalMyDsl.g:637:2: ( rule__Domain__DescriptionAssignment_2 )
            // InternalMyDsl.g:637:3: rule__Domain__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Domain__DescriptionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getDescriptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__2__Impl"


    // $ANTLR start "rule__Context__Group__0"
    // InternalMyDsl.g:646:1: rule__Context__Group__0 : rule__Context__Group__0__Impl rule__Context__Group__1 ;
    public final void rule__Context__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:650:1: ( rule__Context__Group__0__Impl rule__Context__Group__1 )
            // InternalMyDsl.g:651:2: rule__Context__Group__0__Impl rule__Context__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Context__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__0"


    // $ANTLR start "rule__Context__Group__0__Impl"
    // InternalMyDsl.g:658:1: rule__Context__Group__0__Impl : ( ( rule__Context__NameAssignment_0 ) ) ;
    public final void rule__Context__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:662:1: ( ( ( rule__Context__NameAssignment_0 ) ) )
            // InternalMyDsl.g:663:1: ( ( rule__Context__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:663:1: ( ( rule__Context__NameAssignment_0 ) )
            // InternalMyDsl.g:664:2: ( rule__Context__NameAssignment_0 )
            {
             before(grammarAccess.getContextAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:665:2: ( rule__Context__NameAssignment_0 )
            // InternalMyDsl.g:665:3: rule__Context__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Context__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__0__Impl"


    // $ANTLR start "rule__Context__Group__1"
    // InternalMyDsl.g:673:1: rule__Context__Group__1 : rule__Context__Group__1__Impl rule__Context__Group__2 ;
    public final void rule__Context__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:677:1: ( rule__Context__Group__1__Impl rule__Context__Group__2 )
            // InternalMyDsl.g:678:2: rule__Context__Group__1__Impl rule__Context__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Context__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__1"


    // $ANTLR start "rule__Context__Group__1__Impl"
    // InternalMyDsl.g:685:1: rule__Context__Group__1__Impl : ( '{' ) ;
    public final void rule__Context__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:689:1: ( ( '{' ) )
            // InternalMyDsl.g:690:1: ( '{' )
            {
            // InternalMyDsl.g:690:1: ( '{' )
            // InternalMyDsl.g:691:2: '{'
            {
             before(grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__1__Impl"


    // $ANTLR start "rule__Context__Group__2"
    // InternalMyDsl.g:700:1: rule__Context__Group__2 : rule__Context__Group__2__Impl rule__Context__Group__3 ;
    public final void rule__Context__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:704:1: ( rule__Context__Group__2__Impl rule__Context__Group__3 )
            // InternalMyDsl.g:705:2: rule__Context__Group__2__Impl rule__Context__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Context__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__2"


    // $ANTLR start "rule__Context__Group__2__Impl"
    // InternalMyDsl.g:712:1: rule__Context__Group__2__Impl : ( ( rule__Context__AggregatesAssignment_2 )* ) ;
    public final void rule__Context__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:716:1: ( ( ( rule__Context__AggregatesAssignment_2 )* ) )
            // InternalMyDsl.g:717:1: ( ( rule__Context__AggregatesAssignment_2 )* )
            {
            // InternalMyDsl.g:717:1: ( ( rule__Context__AggregatesAssignment_2 )* )
            // InternalMyDsl.g:718:2: ( rule__Context__AggregatesAssignment_2 )*
            {
             before(grammarAccess.getContextAccess().getAggregatesAssignment_2()); 
            // InternalMyDsl.g:719:2: ( rule__Context__AggregatesAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:719:3: rule__Context__AggregatesAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Context__AggregatesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getContextAccess().getAggregatesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__2__Impl"


    // $ANTLR start "rule__Context__Group__3"
    // InternalMyDsl.g:727:1: rule__Context__Group__3 : rule__Context__Group__3__Impl ;
    public final void rule__Context__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:731:1: ( rule__Context__Group__3__Impl )
            // InternalMyDsl.g:732:2: rule__Context__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Context__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__3"


    // $ANTLR start "rule__Context__Group__3__Impl"
    // InternalMyDsl.g:738:1: rule__Context__Group__3__Impl : ( '}' ) ;
    public final void rule__Context__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:742:1: ( ( '}' ) )
            // InternalMyDsl.g:743:1: ( '}' )
            {
            // InternalMyDsl.g:743:1: ( '}' )
            // InternalMyDsl.g:744:2: '}'
            {
             before(grammarAccess.getContextAccess().getRightCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__3__Impl"


    // $ANTLR start "rule__Aggregate__Group__0"
    // InternalMyDsl.g:754:1: rule__Aggregate__Group__0 : rule__Aggregate__Group__0__Impl rule__Aggregate__Group__1 ;
    public final void rule__Aggregate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:758:1: ( rule__Aggregate__Group__0__Impl rule__Aggregate__Group__1 )
            // InternalMyDsl.g:759:2: rule__Aggregate__Group__0__Impl rule__Aggregate__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Aggregate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aggregate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregate__Group__0"


    // $ANTLR start "rule__Aggregate__Group__0__Impl"
    // InternalMyDsl.g:766:1: rule__Aggregate__Group__0__Impl : ( ( rule__Aggregate__NameAssignment_0 ) ) ;
    public final void rule__Aggregate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:770:1: ( ( ( rule__Aggregate__NameAssignment_0 ) ) )
            // InternalMyDsl.g:771:1: ( ( rule__Aggregate__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:771:1: ( ( rule__Aggregate__NameAssignment_0 ) )
            // InternalMyDsl.g:772:2: ( rule__Aggregate__NameAssignment_0 )
            {
             before(grammarAccess.getAggregateAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:773:2: ( rule__Aggregate__NameAssignment_0 )
            // InternalMyDsl.g:773:3: rule__Aggregate__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Aggregate__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAggregateAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregate__Group__0__Impl"


    // $ANTLR start "rule__Aggregate__Group__1"
    // InternalMyDsl.g:781:1: rule__Aggregate__Group__1 : rule__Aggregate__Group__1__Impl rule__Aggregate__Group__2 ;
    public final void rule__Aggregate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:785:1: ( rule__Aggregate__Group__1__Impl rule__Aggregate__Group__2 )
            // InternalMyDsl.g:786:2: rule__Aggregate__Group__1__Impl rule__Aggregate__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Aggregate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aggregate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregate__Group__1"


    // $ANTLR start "rule__Aggregate__Group__1__Impl"
    // InternalMyDsl.g:793:1: rule__Aggregate__Group__1__Impl : ( '{' ) ;
    public final void rule__Aggregate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:797:1: ( ( '{' ) )
            // InternalMyDsl.g:798:1: ( '{' )
            {
            // InternalMyDsl.g:798:1: ( '{' )
            // InternalMyDsl.g:799:2: '{'
            {
             before(grammarAccess.getAggregateAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAggregateAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregate__Group__1__Impl"


    // $ANTLR start "rule__Aggregate__Group__2"
    // InternalMyDsl.g:808:1: rule__Aggregate__Group__2 : rule__Aggregate__Group__2__Impl rule__Aggregate__Group__3 ;
    public final void rule__Aggregate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:812:1: ( rule__Aggregate__Group__2__Impl rule__Aggregate__Group__3 )
            // InternalMyDsl.g:813:2: rule__Aggregate__Group__2__Impl rule__Aggregate__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Aggregate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aggregate__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregate__Group__2"


    // $ANTLR start "rule__Aggregate__Group__2__Impl"
    // InternalMyDsl.g:820:1: rule__Aggregate__Group__2__Impl : ( ( rule__Aggregate__AttributesAssignment_2 )* ) ;
    public final void rule__Aggregate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:824:1: ( ( ( rule__Aggregate__AttributesAssignment_2 )* ) )
            // InternalMyDsl.g:825:1: ( ( rule__Aggregate__AttributesAssignment_2 )* )
            {
            // InternalMyDsl.g:825:1: ( ( rule__Aggregate__AttributesAssignment_2 )* )
            // InternalMyDsl.g:826:2: ( rule__Aggregate__AttributesAssignment_2 )*
            {
             before(grammarAccess.getAggregateAccess().getAttributesAssignment_2()); 
            // InternalMyDsl.g:827:2: ( rule__Aggregate__AttributesAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:827:3: rule__Aggregate__AttributesAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Aggregate__AttributesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getAggregateAccess().getAttributesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregate__Group__2__Impl"


    // $ANTLR start "rule__Aggregate__Group__3"
    // InternalMyDsl.g:835:1: rule__Aggregate__Group__3 : rule__Aggregate__Group__3__Impl ;
    public final void rule__Aggregate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:839:1: ( rule__Aggregate__Group__3__Impl )
            // InternalMyDsl.g:840:2: rule__Aggregate__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Aggregate__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregate__Group__3"


    // $ANTLR start "rule__Aggregate__Group__3__Impl"
    // InternalMyDsl.g:846:1: rule__Aggregate__Group__3__Impl : ( '}' ) ;
    public final void rule__Aggregate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:850:1: ( ( '}' ) )
            // InternalMyDsl.g:851:1: ( '}' )
            {
            // InternalMyDsl.g:851:1: ( '}' )
            // InternalMyDsl.g:852:2: '}'
            {
             before(grammarAccess.getAggregateAccess().getRightCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAggregateAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregate__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalMyDsl.g:862:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:866:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalMyDsl.g:867:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalMyDsl.g:874:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:878:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalMyDsl.g:879:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:879:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalMyDsl.g:880:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:881:2: ( rule__Attribute__NameAssignment_0 )
            // InternalMyDsl.g:881:3: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalMyDsl.g:889:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:893:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalMyDsl.g:894:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalMyDsl.g:901:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:905:1: ( ( ':' ) )
            // InternalMyDsl.g:906:1: ( ':' )
            {
            // InternalMyDsl.g:906:1: ( ':' )
            // InternalMyDsl.g:907:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalMyDsl.g:916:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:920:1: ( rule__Attribute__Group__2__Impl )
            // InternalMyDsl.g:921:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalMyDsl.g:927:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:931:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // InternalMyDsl.g:932:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // InternalMyDsl.g:932:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // InternalMyDsl.g:933:2: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // InternalMyDsl.g:934:2: ( rule__Attribute__TypeAssignment_2 )
            // InternalMyDsl.g:934:3: rule__Attribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Model__DomainsAssignment_3"
    // InternalMyDsl.g:943:1: rule__Model__DomainsAssignment_3 : ( ruleDomain ) ;
    public final void rule__Model__DomainsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:947:1: ( ( ruleDomain ) )
            // InternalMyDsl.g:948:2: ( ruleDomain )
            {
            // InternalMyDsl.g:948:2: ( ruleDomain )
            // InternalMyDsl.g:949:3: ruleDomain
            {
             before(grammarAccess.getModelAccess().getDomainsDomainParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDomain();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDomainsDomainParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DomainsAssignment_3"


    // $ANTLR start "rule__Model__ContextsAssignment_7"
    // InternalMyDsl.g:958:1: rule__Model__ContextsAssignment_7 : ( ruleContext ) ;
    public final void rule__Model__ContextsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:962:1: ( ( ruleContext ) )
            // InternalMyDsl.g:963:2: ( ruleContext )
            {
            // InternalMyDsl.g:963:2: ( ruleContext )
            // InternalMyDsl.g:964:3: ruleContext
            {
             before(grammarAccess.getModelAccess().getContextsContextParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleContext();

            state._fsp--;

             after(grammarAccess.getModelAccess().getContextsContextParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ContextsAssignment_7"


    // $ANTLR start "rule__Model__AggregatesAssignment_11"
    // InternalMyDsl.g:973:1: rule__Model__AggregatesAssignment_11 : ( ruleAggregate ) ;
    public final void rule__Model__AggregatesAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:977:1: ( ( ruleAggregate ) )
            // InternalMyDsl.g:978:2: ( ruleAggregate )
            {
            // InternalMyDsl.g:978:2: ( ruleAggregate )
            // InternalMyDsl.g:979:3: ruleAggregate
            {
             before(grammarAccess.getModelAccess().getAggregatesAggregateParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleAggregate();

            state._fsp--;

             after(grammarAccess.getModelAccess().getAggregatesAggregateParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__AggregatesAssignment_11"


    // $ANTLR start "rule__Domain__NameAssignment_0"
    // InternalMyDsl.g:988:1: rule__Domain__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:992:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:993:2: ( RULE_ID )
            {
            // InternalMyDsl.g:993:2: ( RULE_ID )
            // InternalMyDsl.g:994:3: RULE_ID
            {
             before(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__NameAssignment_0"


    // $ANTLR start "rule__Domain__DescriptionAssignment_2"
    // InternalMyDsl.g:1003:1: rule__Domain__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Domain__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1007:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1008:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1008:2: ( RULE_STRING )
            // InternalMyDsl.g:1009:3: RULE_STRING
            {
             before(grammarAccess.getDomainAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__DescriptionAssignment_2"


    // $ANTLR start "rule__Context__NameAssignment_0"
    // InternalMyDsl.g:1018:1: rule__Context__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Context__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1022:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1023:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1023:2: ( RULE_ID )
            // InternalMyDsl.g:1024:3: RULE_ID
            {
             before(grammarAccess.getContextAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__NameAssignment_0"


    // $ANTLR start "rule__Context__AggregatesAssignment_2"
    // InternalMyDsl.g:1033:1: rule__Context__AggregatesAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Context__AggregatesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1037:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1038:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1038:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1039:3: ( RULE_ID )
            {
             before(grammarAccess.getContextAccess().getAggregatesAggregateCrossReference_2_0()); 
            // InternalMyDsl.g:1040:3: ( RULE_ID )
            // InternalMyDsl.g:1041:4: RULE_ID
            {
             before(grammarAccess.getContextAccess().getAggregatesAggregateIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getAggregatesAggregateIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getContextAccess().getAggregatesAggregateCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__AggregatesAssignment_2"


    // $ANTLR start "rule__Aggregate__NameAssignment_0"
    // InternalMyDsl.g:1052:1: rule__Aggregate__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Aggregate__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1056:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1057:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1057:2: ( RULE_ID )
            // InternalMyDsl.g:1058:3: RULE_ID
            {
             before(grammarAccess.getAggregateAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAggregateAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregate__NameAssignment_0"


    // $ANTLR start "rule__Aggregate__AttributesAssignment_2"
    // InternalMyDsl.g:1067:1: rule__Aggregate__AttributesAssignment_2 : ( ruleAttribute ) ;
    public final void rule__Aggregate__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1071:1: ( ( ruleAttribute ) )
            // InternalMyDsl.g:1072:2: ( ruleAttribute )
            {
            // InternalMyDsl.g:1072:2: ( ruleAttribute )
            // InternalMyDsl.g:1073:3: ruleAttribute
            {
             before(grammarAccess.getAggregateAccess().getAttributesAttributeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAggregateAccess().getAttributesAttributeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregate__AttributesAssignment_2"


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // InternalMyDsl.g:1082:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1086:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1087:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1087:2: ( RULE_ID )
            // InternalMyDsl.g:1088:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_0"


    // $ANTLR start "rule__Attribute__TypeAssignment_2"
    // InternalMyDsl.g:1097:1: rule__Attribute__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1101:1: ( ( ruleType ) )
            // InternalMyDsl.g:1102:2: ( ruleType )
            {
            // InternalMyDsl.g:1102:2: ( ruleType )
            // InternalMyDsl.g:1103:3: ruleType
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001800L});

}