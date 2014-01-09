package com.senacor.mdsd.hh.editortweaks.greeter.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.senacor.mdsd.hh.editortweaks.greeter.services.GreeterGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGreeterParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Person'", "'firstname'", "'lastname'", "'spricht'", "'!'", "'Zu'", "'sage'", "'ich'", "'Hallo'", "'Huhu'", "'Hello'", "'Bonjour'", "'deutsch'", "'englisch'", "'franz\\u00F6sisch'"
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
    public String getGrammarFileName() { return "../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g"; }



     	private GreeterGrammarAccess grammarAccess;
     	
        public InternalGreeterParser(TokenStream input, GreeterGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected GreeterGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:77:1: ruleModel returns [EObject current=null] : ( ( (lv_persons_0_0= rulePerson ) )* ( (lv_greetings_1_0= ruleGreeting ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_persons_0_0 = null;

        EObject lv_greetings_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:80:28: ( ( ( (lv_persons_0_0= rulePerson ) )* ( (lv_greetings_1_0= ruleGreeting ) )* ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:81:1: ( ( (lv_persons_0_0= rulePerson ) )* ( (lv_greetings_1_0= ruleGreeting ) )* )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:81:1: ( ( (lv_persons_0_0= rulePerson ) )* ( (lv_greetings_1_0= ruleGreeting ) )* )
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:81:2: ( (lv_persons_0_0= rulePerson ) )* ( (lv_greetings_1_0= ruleGreeting ) )*
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:81:2: ( (lv_persons_0_0= rulePerson ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:82:1: (lv_persons_0_0= rulePerson )
            	    {
            	    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:82:1: (lv_persons_0_0= rulePerson )
            	    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:83:3: lv_persons_0_0= rulePerson
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getPersonsPersonParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePerson_in_ruleModel131);
            	    lv_persons_0_0=rulePerson();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"persons",
            	            		lv_persons_0_0, 
            	            		"Person");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:99:3: ( (lv_greetings_1_0= ruleGreeting ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16||(LA2_0>=19 && LA2_0<=22)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:100:1: (lv_greetings_1_0= ruleGreeting )
            	    {
            	    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:100:1: (lv_greetings_1_0= ruleGreeting )
            	    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:101:3: lv_greetings_1_0= ruleGreeting
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGreeting_in_ruleModel153);
            	    lv_greetings_1_0=ruleGreeting();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"greetings",
            	            		lv_greetings_1_0, 
            	            		"Greeting");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePerson"
    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:125:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:126:2: (iv_rulePerson= rulePerson EOF )
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:127:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_rulePerson_in_entryRulePerson190);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePerson200); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:134:1: rulePerson returns [EObject current=null] : (otherlv_0= 'Person' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'firstname' ( (lv_fn_3_0= RULE_STRING ) ) otherlv_4= 'lastname' ( (lv_ln_5_0= RULE_STRING ) ) otherlv_6= 'spricht' ( (lv_lang_7_0= ruleLanguage ) ) ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_fn_3_0=null;
        Token otherlv_4=null;
        Token lv_ln_5_0=null;
        Token otherlv_6=null;
        Enumerator lv_lang_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:137:28: ( (otherlv_0= 'Person' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'firstname' ( (lv_fn_3_0= RULE_STRING ) ) otherlv_4= 'lastname' ( (lv_ln_5_0= RULE_STRING ) ) otherlv_6= 'spricht' ( (lv_lang_7_0= ruleLanguage ) ) ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:138:1: (otherlv_0= 'Person' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'firstname' ( (lv_fn_3_0= RULE_STRING ) ) otherlv_4= 'lastname' ( (lv_ln_5_0= RULE_STRING ) ) otherlv_6= 'spricht' ( (lv_lang_7_0= ruleLanguage ) ) )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:138:1: (otherlv_0= 'Person' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'firstname' ( (lv_fn_3_0= RULE_STRING ) ) otherlv_4= 'lastname' ( (lv_ln_5_0= RULE_STRING ) ) otherlv_6= 'spricht' ( (lv_lang_7_0= ruleLanguage ) ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:138:3: otherlv_0= 'Person' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'firstname' ( (lv_fn_3_0= RULE_STRING ) ) otherlv_4= 'lastname' ( (lv_ln_5_0= RULE_STRING ) ) otherlv_6= 'spricht' ( (lv_lang_7_0= ruleLanguage ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePerson237); 

                	newLeafNode(otherlv_0, grammarAccess.getPersonAccess().getPersonKeyword_0());
                
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:142:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:143:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:143:1: (lv_name_1_0= RULE_ID )
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:144:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePerson254); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPersonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePerson271); 

                	newLeafNode(otherlv_2, grammarAccess.getPersonAccess().getFirstnameKeyword_2());
                
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:164:1: ( (lv_fn_3_0= RULE_STRING ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:165:1: (lv_fn_3_0= RULE_STRING )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:165:1: (lv_fn_3_0= RULE_STRING )
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:166:3: lv_fn_3_0= RULE_STRING
            {
            lv_fn_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePerson288); 

            			newLeafNode(lv_fn_3_0, grammarAccess.getPersonAccess().getFnSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPersonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"fn",
                    		lv_fn_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_rulePerson305); 

                	newLeafNode(otherlv_4, grammarAccess.getPersonAccess().getLastnameKeyword_4());
                
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:186:1: ( (lv_ln_5_0= RULE_STRING ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:187:1: (lv_ln_5_0= RULE_STRING )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:187:1: (lv_ln_5_0= RULE_STRING )
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:188:3: lv_ln_5_0= RULE_STRING
            {
            lv_ln_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePerson322); 

            			newLeafNode(lv_ln_5_0, grammarAccess.getPersonAccess().getLnSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPersonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ln",
                    		lv_ln_5_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_rulePerson339); 

                	newLeafNode(otherlv_6, grammarAccess.getPersonAccess().getSprichtKeyword_6());
                
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:208:1: ( (lv_lang_7_0= ruleLanguage ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:209:1: (lv_lang_7_0= ruleLanguage )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:209:1: (lv_lang_7_0= ruleLanguage )
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:210:3: lv_lang_7_0= ruleLanguage
            {
             
            	        newCompositeNode(grammarAccess.getPersonAccess().getLangLanguageEnumRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleLanguage_in_rulePerson360);
            lv_lang_7_0=ruleLanguage();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPersonRule());
            	        }
                   		set(
                   			current, 
                   			"lang",
                    		lv_lang_7_0, 
                    		"Language");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleGreeting"
    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:234:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:235:2: (iv_ruleGreeting= ruleGreeting EOF )
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:236:2: iv_ruleGreeting= ruleGreeting EOF
            {
             newCompositeNode(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting396);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;

             current =iv_ruleGreeting; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting406); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:243:1: ruleGreeting returns [EObject current=null] : ( ( ( (lv_greetword_0_0= ruleGreetword ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ) | (otherlv_3= 'Zu' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'sage' otherlv_6= 'ich' ( (lv_greetword_7_0= ruleGreetword ) ) ) ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Enumerator lv_greetword_0_0 = null;

        Enumerator lv_greetword_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:246:28: ( ( ( ( (lv_greetword_0_0= ruleGreetword ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ) | (otherlv_3= 'Zu' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'sage' otherlv_6= 'ich' ( (lv_greetword_7_0= ruleGreetword ) ) ) ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:247:1: ( ( ( (lv_greetword_0_0= ruleGreetword ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ) | (otherlv_3= 'Zu' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'sage' otherlv_6= 'ich' ( (lv_greetword_7_0= ruleGreetword ) ) ) )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:247:1: ( ( ( (lv_greetword_0_0= ruleGreetword ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ) | (otherlv_3= 'Zu' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'sage' otherlv_6= 'ich' ( (lv_greetword_7_0= ruleGreetword ) ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=19 && LA3_0<=22)) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:247:2: ( ( (lv_greetword_0_0= ruleGreetword ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' )
                    {
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:247:2: ( ( (lv_greetword_0_0= ruleGreetword ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' )
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:247:3: ( (lv_greetword_0_0= ruleGreetword ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '!'
                    {
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:247:3: ( (lv_greetword_0_0= ruleGreetword ) )
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:248:1: (lv_greetword_0_0= ruleGreetword )
                    {
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:248:1: (lv_greetword_0_0= ruleGreetword )
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:249:3: lv_greetword_0_0= ruleGreetword
                    {
                     
                    	        newCompositeNode(grammarAccess.getGreetingAccess().getGreetwordGreetwordEnumRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGreetword_in_ruleGreeting453);
                    lv_greetword_0_0=ruleGreetword();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGreetingRule());
                    	        }
                           		set(
                           			current, 
                           			"greetword",
                            		lv_greetword_0_0, 
                            		"Greetword");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:265:2: ( (otherlv_1= RULE_ID ) )
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:266:1: (otherlv_1= RULE_ID )
                    {
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:266:1: (otherlv_1= RULE_ID )
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:267:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getGreetingRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGreeting473); 

                    		newLeafNode(otherlv_1, grammarAccess.getGreetingAccess().getPersonPersonCrossReference_0_1_0()); 
                    	

                    }


                    }

                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleGreeting485); 

                        	newLeafNode(otherlv_2, grammarAccess.getGreetingAccess().getExclamationMarkKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:283:6: (otherlv_3= 'Zu' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'sage' otherlv_6= 'ich' ( (lv_greetword_7_0= ruleGreetword ) ) )
                    {
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:283:6: (otherlv_3= 'Zu' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'sage' otherlv_6= 'ich' ( (lv_greetword_7_0= ruleGreetword ) ) )
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:283:8: otherlv_3= 'Zu' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'sage' otherlv_6= 'ich' ( (lv_greetword_7_0= ruleGreetword ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleGreeting505); 

                        	newLeafNode(otherlv_3, grammarAccess.getGreetingAccess().getZuKeyword_1_0());
                        
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:287:1: ( (otherlv_4= RULE_ID ) )
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:288:1: (otherlv_4= RULE_ID )
                    {
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:288:1: (otherlv_4= RULE_ID )
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:289:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getGreetingRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGreeting525); 

                    		newLeafNode(otherlv_4, grammarAccess.getGreetingAccess().getPersonPersonCrossReference_1_1_0()); 
                    	

                    }


                    }

                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleGreeting537); 

                        	newLeafNode(otherlv_5, grammarAccess.getGreetingAccess().getSageKeyword_1_2());
                        
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleGreeting549); 

                        	newLeafNode(otherlv_6, grammarAccess.getGreetingAccess().getIchKeyword_1_3());
                        
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:308:1: ( (lv_greetword_7_0= ruleGreetword ) )
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:309:1: (lv_greetword_7_0= ruleGreetword )
                    {
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:309:1: (lv_greetword_7_0= ruleGreetword )
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:310:3: lv_greetword_7_0= ruleGreetword
                    {
                     
                    	        newCompositeNode(grammarAccess.getGreetingAccess().getGreetwordGreetwordEnumRuleCall_1_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGreetword_in_ruleGreeting570);
                    lv_greetword_7_0=ruleGreetword();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGreetingRule());
                    	        }
                           		set(
                           			current, 
                           			"greetword",
                            		lv_greetword_7_0, 
                            		"Greetword");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "ruleGreetword"
    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:334:1: ruleGreetword returns [Enumerator current=null] : ( (enumLiteral_0= 'Hallo' ) | (enumLiteral_1= 'Huhu' ) | (enumLiteral_2= 'Hello' ) | (enumLiteral_3= 'Bonjour' ) ) ;
    public final Enumerator ruleGreetword() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:336:28: ( ( (enumLiteral_0= 'Hallo' ) | (enumLiteral_1= 'Huhu' ) | (enumLiteral_2= 'Hello' ) | (enumLiteral_3= 'Bonjour' ) ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:337:1: ( (enumLiteral_0= 'Hallo' ) | (enumLiteral_1= 'Huhu' ) | (enumLiteral_2= 'Hello' ) | (enumLiteral_3= 'Bonjour' ) )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:337:1: ( (enumLiteral_0= 'Hallo' ) | (enumLiteral_1= 'Huhu' ) | (enumLiteral_2= 'Hello' ) | (enumLiteral_3= 'Bonjour' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt4=1;
                }
                break;
            case 20:
                {
                alt4=2;
                }
                break;
            case 21:
                {
                alt4=3;
                }
                break;
            case 22:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:337:2: (enumLiteral_0= 'Hallo' )
                    {
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:337:2: (enumLiteral_0= 'Hallo' )
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:337:4: enumLiteral_0= 'Hallo'
                    {
                    enumLiteral_0=(Token)match(input,19,FOLLOW_19_in_ruleGreetword621); 

                            current = grammarAccess.getGreetwordAccess().getDEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getGreetwordAccess().getDEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:343:6: (enumLiteral_1= 'Huhu' )
                    {
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:343:6: (enumLiteral_1= 'Huhu' )
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:343:8: enumLiteral_1= 'Huhu'
                    {
                    enumLiteral_1=(Token)match(input,20,FOLLOW_20_in_ruleGreetword638); 

                            current = grammarAccess.getGreetwordAccess().getDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getGreetwordAccess().getDEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:349:6: (enumLiteral_2= 'Hello' )
                    {
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:349:6: (enumLiteral_2= 'Hello' )
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:349:8: enumLiteral_2= 'Hello'
                    {
                    enumLiteral_2=(Token)match(input,21,FOLLOW_21_in_ruleGreetword655); 

                            current = grammarAccess.getGreetwordAccess().getENEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getGreetwordAccess().getENEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:355:6: (enumLiteral_3= 'Bonjour' )
                    {
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:355:6: (enumLiteral_3= 'Bonjour' )
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:355:8: enumLiteral_3= 'Bonjour'
                    {
                    enumLiteral_3=(Token)match(input,22,FOLLOW_22_in_ruleGreetword672); 

                            current = grammarAccess.getGreetwordAccess().getFREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getGreetwordAccess().getFREnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGreetword"


    // $ANTLR start "ruleLanguage"
    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:365:1: ruleLanguage returns [Enumerator current=null] : ( (enumLiteral_0= 'deutsch' ) | (enumLiteral_1= 'englisch' ) | (enumLiteral_2= 'franz\\u00F6sisch' ) ) ;
    public final Enumerator ruleLanguage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:367:28: ( ( (enumLiteral_0= 'deutsch' ) | (enumLiteral_1= 'englisch' ) | (enumLiteral_2= 'franz\\u00F6sisch' ) ) )
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:368:1: ( (enumLiteral_0= 'deutsch' ) | (enumLiteral_1= 'englisch' ) | (enumLiteral_2= 'franz\\u00F6sisch' ) )
            {
            // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:368:1: ( (enumLiteral_0= 'deutsch' ) | (enumLiteral_1= 'englisch' ) | (enumLiteral_2= 'franz\\u00F6sisch' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt5=1;
                }
                break;
            case 24:
                {
                alt5=2;
                }
                break;
            case 25:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:368:2: (enumLiteral_0= 'deutsch' )
                    {
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:368:2: (enumLiteral_0= 'deutsch' )
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:368:4: enumLiteral_0= 'deutsch'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_23_in_ruleLanguage717); 

                            current = grammarAccess.getLanguageAccess().getDEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLanguageAccess().getDEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:374:6: (enumLiteral_1= 'englisch' )
                    {
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:374:6: (enumLiteral_1= 'englisch' )
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:374:8: enumLiteral_1= 'englisch'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_24_in_ruleLanguage734); 

                            current = grammarAccess.getLanguageAccess().getENEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLanguageAccess().getENEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:380:6: (enumLiteral_2= 'franz\\u00F6sisch' )
                    {
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:380:6: (enumLiteral_2= 'franz\\u00F6sisch' )
                    // ../com.senacor.mdsd.hh.editortweaks.greeter/src-gen/com/senacor/mdsd/hh/editortweaks/greeter/parser/antlr/internal/InternalGreeter.g:380:8: enumLiteral_2= 'franz\\u00F6sisch'
                    {
                    enumLiteral_2=(Token)match(input,25,FOLLOW_25_in_ruleLanguage751); 

                            current = grammarAccess.getLanguageAccess().getFREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLanguageAccess().getFREnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLanguage"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePerson_in_ruleModel131 = new BitSet(new long[]{0x0000000000790802L});
    public static final BitSet FOLLOW_ruleGreeting_in_ruleModel153 = new BitSet(new long[]{0x0000000000790002L});
    public static final BitSet FOLLOW_rulePerson_in_entryRulePerson190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePerson200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePerson237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePerson254 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePerson271 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePerson288 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePerson305 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePerson322 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePerson339 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_ruleLanguage_in_rulePerson360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreetword_in_ruleGreeting453 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGreeting473 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleGreeting485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleGreeting505 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGreeting525 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleGreeting537 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGreeting549 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_ruleGreetword_in_ruleGreeting570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleGreetword621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleGreetword638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleGreetword655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleGreetword672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleLanguage717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleLanguage734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleLanguage751 = new BitSet(new long[]{0x0000000000000002L});

}