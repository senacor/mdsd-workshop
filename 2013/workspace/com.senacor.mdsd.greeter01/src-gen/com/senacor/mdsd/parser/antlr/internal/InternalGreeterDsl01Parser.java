package com.senacor.mdsd.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.senacor.mdsd.services.GreeterDsl01GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGreeterDsl01Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'start'", "'!'", "'Hello'", "'Hallo'", "'Bon jour'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalGreeterDsl01Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGreeterDsl01Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGreeterDsl01Parser.tokenNames; }
    public String getGrammarFileName() { return "../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g"; }



     	private GreeterDsl01GrammarAccess grammarAccess;
     	
        public InternalGreeterDsl01Parser(TokenStream input, GreeterDsl01GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected GreeterDsl01GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:76:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'start' ( (lv_greetings_2_0= ruleGreeting ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_greetings_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:79:28: ( ( () otherlv_1= 'start' ( (lv_greetings_2_0= ruleGreeting ) )* ) )
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:80:1: ( () otherlv_1= 'start' ( (lv_greetings_2_0= ruleGreeting ) )* )
            {
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:80:1: ( () otherlv_1= 'start' ( (lv_greetings_2_0= ruleGreeting ) )* )
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:80:2: () otherlv_1= 'start' ( (lv_greetings_2_0= ruleGreeting ) )*
            {
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:80:2: ()
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleModel131); 

                	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getStartKeyword_1());
                
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:90:1: ( (lv_greetings_2_0= ruleGreeting ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=13 && LA1_0<=15)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:91:1: (lv_greetings_2_0= ruleGreeting )
            	    {
            	    // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:91:1: (lv_greetings_2_0= ruleGreeting )
            	    // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:92:3: lv_greetings_2_0= ruleGreeting
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGreeting_in_ruleModel152);
            	    lv_greetings_2_0=ruleGreeting();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"greetings",
            	            		lv_greetings_2_0, 
            	            		"Greeting");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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


    // $ANTLR start "entryRuleGreeting"
    // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:116:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:117:2: (iv_ruleGreeting= ruleGreeting EOF )
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:118:2: iv_ruleGreeting= ruleGreeting EOF
            {
             newCompositeNode(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting189);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;

             current =iv_ruleGreeting; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting199); 

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
    // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:125:1: ruleGreeting returns [EObject current=null] : ( (this_Greetword_0= ruleGreetword | this_Grusswort_1= ruleGrusswort | this_GW_2= ruleGW ) ( (lv_adressat_3_0= RULE_STRING ) ) otherlv_4= '!' ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token lv_adressat_3_0=null;
        Token otherlv_4=null;
        EObject this_Greetword_0 = null;

        EObject this_Grusswort_1 = null;

        EObject this_GW_2 = null;


         enterRule(); 
            
        try {
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:128:28: ( ( (this_Greetword_0= ruleGreetword | this_Grusswort_1= ruleGrusswort | this_GW_2= ruleGW ) ( (lv_adressat_3_0= RULE_STRING ) ) otherlv_4= '!' ) )
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:129:1: ( (this_Greetword_0= ruleGreetword | this_Grusswort_1= ruleGrusswort | this_GW_2= ruleGW ) ( (lv_adressat_3_0= RULE_STRING ) ) otherlv_4= '!' )
            {
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:129:1: ( (this_Greetword_0= ruleGreetword | this_Grusswort_1= ruleGrusswort | this_GW_2= ruleGW ) ( (lv_adressat_3_0= RULE_STRING ) ) otherlv_4= '!' )
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:129:2: (this_Greetword_0= ruleGreetword | this_Grusswort_1= ruleGrusswort | this_GW_2= ruleGW ) ( (lv_adressat_3_0= RULE_STRING ) ) otherlv_4= '!'
            {
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:129:2: (this_Greetword_0= ruleGreetword | this_Grusswort_1= ruleGrusswort | this_GW_2= ruleGW )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:130:5: this_Greetword_0= ruleGreetword
                    {
                     
                            newCompositeNode(grammarAccess.getGreetingAccess().getGreetwordParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleGreetword_in_ruleGreeting247);
                    this_Greetword_0=ruleGreetword();

                    state._fsp--;

                     
                            current = this_Greetword_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:140:5: this_Grusswort_1= ruleGrusswort
                    {
                     
                            newCompositeNode(grammarAccess.getGreetingAccess().getGrusswortParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleGrusswort_in_ruleGreeting274);
                    this_Grusswort_1=ruleGrusswort();

                    state._fsp--;

                     
                            current = this_Grusswort_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:150:5: this_GW_2= ruleGW
                    {
                     
                            newCompositeNode(grammarAccess.getGreetingAccess().getGWParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_ruleGW_in_ruleGreeting301);
                    this_GW_2=ruleGW();

                    state._fsp--;

                     
                            current = this_GW_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:158:2: ( (lv_adressat_3_0= RULE_STRING ) )
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:159:1: (lv_adressat_3_0= RULE_STRING )
            {
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:159:1: (lv_adressat_3_0= RULE_STRING )
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:160:3: lv_adressat_3_0= RULE_STRING
            {
            lv_adressat_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGreeting318); 

            			newLeafNode(lv_adressat_3_0, grammarAccess.getGreetingAccess().getAdressatSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGreetingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"adressat",
                    		lv_adressat_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleGreeting335); 

                	newLeafNode(otherlv_4, grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2());
                

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


    // $ANTLR start "entryRuleGreetword"
    // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:188:1: entryRuleGreetword returns [EObject current=null] : iv_ruleGreetword= ruleGreetword EOF ;
    public final EObject entryRuleGreetword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreetword = null;


        try {
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:189:2: (iv_ruleGreetword= ruleGreetword EOF )
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:190:2: iv_ruleGreetword= ruleGreetword EOF
            {
             newCompositeNode(grammarAccess.getGreetwordRule()); 
            pushFollow(FOLLOW_ruleGreetword_in_entryRuleGreetword371);
            iv_ruleGreetword=ruleGreetword();

            state._fsp--;

             current =iv_ruleGreetword; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreetword381); 

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
    // $ANTLR end "entryRuleGreetword"


    // $ANTLR start "ruleGreetword"
    // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:197:1: ruleGreetword returns [EObject current=null] : ( () otherlv_1= 'Hello' ) ;
    public final EObject ruleGreetword() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:200:28: ( ( () otherlv_1= 'Hello' ) )
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:201:1: ( () otherlv_1= 'Hello' )
            {
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:201:1: ( () otherlv_1= 'Hello' )
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:201:2: () otherlv_1= 'Hello'
            {
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:201:2: ()
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:202:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getGreetwordAccess().getFooAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleGreetword427); 

                	newLeafNode(otherlv_1, grammarAccess.getGreetwordAccess().getHelloKeyword_1());
                

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


    // $ANTLR start "entryRuleGrusswort"
    // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:219:1: entryRuleGrusswort returns [EObject current=null] : iv_ruleGrusswort= ruleGrusswort EOF ;
    public final EObject entryRuleGrusswort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrusswort = null;


        try {
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:220:2: (iv_ruleGrusswort= ruleGrusswort EOF )
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:221:2: iv_ruleGrusswort= ruleGrusswort EOF
            {
             newCompositeNode(grammarAccess.getGrusswortRule()); 
            pushFollow(FOLLOW_ruleGrusswort_in_entryRuleGrusswort463);
            iv_ruleGrusswort=ruleGrusswort();

            state._fsp--;

             current =iv_ruleGrusswort; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrusswort473); 

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
    // $ANTLR end "entryRuleGrusswort"


    // $ANTLR start "ruleGrusswort"
    // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:228:1: ruleGrusswort returns [EObject current=null] : ( () otherlv_1= 'Hallo' ) ;
    public final EObject ruleGrusswort() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:231:28: ( ( () otherlv_1= 'Hallo' ) )
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:232:1: ( () otherlv_1= 'Hallo' )
            {
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:232:1: ( () otherlv_1= 'Hallo' )
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:232:2: () otherlv_1= 'Hallo'
            {
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:232:2: ()
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:233:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getGrusswortAccess().getFooAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleGrusswort519); 

                	newLeafNode(otherlv_1, grammarAccess.getGrusswortAccess().getHalloKeyword_1());
                

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
    // $ANTLR end "ruleGrusswort"


    // $ANTLR start "entryRuleGW"
    // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:250:1: entryRuleGW returns [EObject current=null] : iv_ruleGW= ruleGW EOF ;
    public final EObject entryRuleGW() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGW = null;


        try {
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:251:2: (iv_ruleGW= ruleGW EOF )
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:252:2: iv_ruleGW= ruleGW EOF
            {
             newCompositeNode(grammarAccess.getGWRule()); 
            pushFollow(FOLLOW_ruleGW_in_entryRuleGW555);
            iv_ruleGW=ruleGW();

            state._fsp--;

             current =iv_ruleGW; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGW565); 

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
    // $ANTLR end "entryRuleGW"


    // $ANTLR start "ruleGW"
    // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:259:1: ruleGW returns [EObject current=null] : ( () otherlv_1= 'Bon jour' ) ;
    public final EObject ruleGW() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:262:28: ( ( () otherlv_1= 'Bon jour' ) )
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:263:1: ( () otherlv_1= 'Bon jour' )
            {
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:263:1: ( () otherlv_1= 'Bon jour' )
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:263:2: () otherlv_1= 'Bon jour'
            {
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:263:2: ()
            // ../com.senacor.mdsd.greeter01/src-gen/com/senacor/mdsd/parser/antlr/internal/InternalGreeterDsl01.g:264:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getGWAccess().getMyGreetwordAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleGW611); 

                	newLeafNode(otherlv_1, grammarAccess.getGWAccess().getBonJourKeyword_1());
                

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
    // $ANTLR end "ruleGW"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel131 = new BitSet(new long[]{0x000000000000E002L});
    public static final BitSet FOLLOW_ruleGreeting_in_ruleModel152 = new BitSet(new long[]{0x000000000000E002L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreetword_in_ruleGreeting247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGrusswort_in_ruleGreeting274 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGW_in_ruleGreeting301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGreeting318 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGreeting335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreetword_in_entryRuleGreetword371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreetword381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleGreetword427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrusswort_in_entryRuleGrusswort463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrusswort473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleGrusswort519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGW_in_entryRuleGW555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGW565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleGW611 = new BitSet(new long[]{0x0000000000000002L});

}