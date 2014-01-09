package com.senacor.mdsd.greeter02.parser.antlr.internal; 

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
import com.senacor.mdsd.greeter02.services.GreeterDsl02GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGreeterDsl02Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Persons'", "'{'", "'}'", "'Greetings'", "'firstname'", "'lastname'", "'w'", "'m'", "'!'", "'Hallo'", "'Hello'", "'Bonjour'"
    };
    public static final int RULE_ID=4;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalGreeterDsl02Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGreeterDsl02Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGreeterDsl02Parser.tokenNames; }
    public String getGrammarFileName() { return "../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g"; }



     	private GreeterDsl02GrammarAccess grammarAccess;
     	
        public InternalGreeterDsl02Parser(TokenStream input, GreeterDsl02GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected GreeterDsl02GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:70:2: iv_ruleModel= ruleModel EOF
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
    // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:77:1: ruleModel returns [EObject current=null] : (otherlv_0= 'Persons' otherlv_1= '{' ( (lv_persons_2_0= rulePerson ) )* otherlv_3= '}' otherlv_4= 'Greetings' otherlv_5= '{' ( (lv_greetings_6_0= ruleGreeting ) )* otherlv_7= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_persons_2_0 = null;

        EObject lv_greetings_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:80:28: ( (otherlv_0= 'Persons' otherlv_1= '{' ( (lv_persons_2_0= rulePerson ) )* otherlv_3= '}' otherlv_4= 'Greetings' otherlv_5= '{' ( (lv_greetings_6_0= ruleGreeting ) )* otherlv_7= '}' ) )
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:81:1: (otherlv_0= 'Persons' otherlv_1= '{' ( (lv_persons_2_0= rulePerson ) )* otherlv_3= '}' otherlv_4= 'Greetings' otherlv_5= '{' ( (lv_greetings_6_0= ruleGreeting ) )* otherlv_7= '}' )
            {
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:81:1: (otherlv_0= 'Persons' otherlv_1= '{' ( (lv_persons_2_0= rulePerson ) )* otherlv_3= '}' otherlv_4= 'Greetings' otherlv_5= '{' ( (lv_greetings_6_0= ruleGreeting ) )* otherlv_7= '}' )
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:81:3: otherlv_0= 'Persons' otherlv_1= '{' ( (lv_persons_2_0= rulePerson ) )* otherlv_3= '}' otherlv_4= 'Greetings' otherlv_5= '{' ( (lv_greetings_6_0= ruleGreeting ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPersonsKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleModel134); 

                	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:89:1: ( (lv_persons_2_0= rulePerson ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:90:1: (lv_persons_2_0= rulePerson )
            	    {
            	    // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:90:1: (lv_persons_2_0= rulePerson )
            	    // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:91:3: lv_persons_2_0= rulePerson
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getPersonsPersonParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePerson_in_ruleModel155);
            	    lv_persons_2_0=rulePerson();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"persons",
            	            		lv_persons_2_0, 
            	            		"Person");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleModel168); 

                	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleModel180); 

                	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getGreetingsKeyword_4());
                
            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleModel192); 

                	newLeafNode(otherlv_5, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_5());
                
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:119:1: ( (lv_greetings_6_0= ruleGreeting ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=20 && LA2_0<=22)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:120:1: (lv_greetings_6_0= ruleGreeting )
            	    {
            	    // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:120:1: (lv_greetings_6_0= ruleGreeting )
            	    // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:121:3: lv_greetings_6_0= ruleGreeting
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGreeting_in_ruleModel213);
            	    lv_greetings_6_0=ruleGreeting();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"greetings",
            	            		lv_greetings_6_0, 
            	            		"Greeting");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleModel226); 

                	newLeafNode(otherlv_7, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_7());
                

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
    // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:149:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:150:2: (iv_rulePerson= rulePerson EOF )
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:151:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_rulePerson_in_entryRulePerson262);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePerson272); 

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
    // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:158:1: rulePerson returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'firstname' ( (lv_firstname_2_0= RULE_ID ) ) otherlv_3= 'lastname' ( (lv_lastname_4_0= RULE_ID ) ) ( ( (lv_gender_5_1= 'w' | lv_gender_5_2= 'm' ) ) ) ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_firstname_2_0=null;
        Token otherlv_3=null;
        Token lv_lastname_4_0=null;
        Token lv_gender_5_1=null;
        Token lv_gender_5_2=null;

         enterRule(); 
            
        try {
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:161:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'firstname' ( (lv_firstname_2_0= RULE_ID ) ) otherlv_3= 'lastname' ( (lv_lastname_4_0= RULE_ID ) ) ( ( (lv_gender_5_1= 'w' | lv_gender_5_2= 'm' ) ) ) ) )
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:162:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'firstname' ( (lv_firstname_2_0= RULE_ID ) ) otherlv_3= 'lastname' ( (lv_lastname_4_0= RULE_ID ) ) ( ( (lv_gender_5_1= 'w' | lv_gender_5_2= 'm' ) ) ) )
            {
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:162:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'firstname' ( (lv_firstname_2_0= RULE_ID ) ) otherlv_3= 'lastname' ( (lv_lastname_4_0= RULE_ID ) ) ( ( (lv_gender_5_1= 'w' | lv_gender_5_2= 'm' ) ) ) )
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:162:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'firstname' ( (lv_firstname_2_0= RULE_ID ) ) otherlv_3= 'lastname' ( (lv_lastname_4_0= RULE_ID ) ) ( ( (lv_gender_5_1= 'w' | lv_gender_5_2= 'm' ) ) )
            {
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:162:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:163:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:163:1: (lv_name_0_0= RULE_ID )
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:164:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePerson314); 

            			newLeafNode(lv_name_0_0, grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPersonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_rulePerson331); 

                	newLeafNode(otherlv_1, grammarAccess.getPersonAccess().getFirstnameKeyword_1());
                
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:184:1: ( (lv_firstname_2_0= RULE_ID ) )
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:185:1: (lv_firstname_2_0= RULE_ID )
            {
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:185:1: (lv_firstname_2_0= RULE_ID )
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:186:3: lv_firstname_2_0= RULE_ID
            {
            lv_firstname_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePerson348); 

            			newLeafNode(lv_firstname_2_0, grammarAccess.getPersonAccess().getFirstnameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPersonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"firstname",
                    		lv_firstname_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_rulePerson365); 

                	newLeafNode(otherlv_3, grammarAccess.getPersonAccess().getLastnameKeyword_3());
                
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:206:1: ( (lv_lastname_4_0= RULE_ID ) )
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:207:1: (lv_lastname_4_0= RULE_ID )
            {
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:207:1: (lv_lastname_4_0= RULE_ID )
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:208:3: lv_lastname_4_0= RULE_ID
            {
            lv_lastname_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePerson382); 

            			newLeafNode(lv_lastname_4_0, grammarAccess.getPersonAccess().getLastnameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPersonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"lastname",
                    		lv_lastname_4_0, 
                    		"ID");
            	    

            }


            }

            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:224:2: ( ( (lv_gender_5_1= 'w' | lv_gender_5_2= 'm' ) ) )
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:225:1: ( (lv_gender_5_1= 'w' | lv_gender_5_2= 'm' ) )
            {
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:225:1: ( (lv_gender_5_1= 'w' | lv_gender_5_2= 'm' ) )
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:226:1: (lv_gender_5_1= 'w' | lv_gender_5_2= 'm' )
            {
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:226:1: (lv_gender_5_1= 'w' | lv_gender_5_2= 'm' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:227:3: lv_gender_5_1= 'w'
                    {
                    lv_gender_5_1=(Token)match(input,17,FOLLOW_17_in_rulePerson407); 

                            newLeafNode(lv_gender_5_1, grammarAccess.getPersonAccess().getGenderWKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPersonRule());
                    	        }
                           		setWithLastConsumed(current, "gender", lv_gender_5_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:239:8: lv_gender_5_2= 'm'
                    {
                    lv_gender_5_2=(Token)match(input,18,FOLLOW_18_in_rulePerson436); 

                            newLeafNode(lv_gender_5_2, grammarAccess.getPersonAccess().getGenderMKeyword_5_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPersonRule());
                    	        }
                           		setWithLastConsumed(current, "gender", lv_gender_5_2, null);
                    	    

                    }
                    break;

            }


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
    // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:262:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:263:2: (iv_ruleGreeting= ruleGreeting EOF )
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:264:2: iv_ruleGreeting= ruleGreeting EOF
            {
             newCompositeNode(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting488);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;

             current =iv_ruleGreeting; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting498); 

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
    // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:271:1: ruleGreeting returns [EObject current=null] : ( ( (lv_word_0_0= ruleGreetword ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_word_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:274:28: ( ( ( (lv_word_0_0= ruleGreetword ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ) )
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:275:1: ( ( (lv_word_0_0= ruleGreetword ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' )
            {
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:275:1: ( ( (lv_word_0_0= ruleGreetword ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' )
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:275:2: ( (lv_word_0_0= ruleGreetword ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '!'
            {
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:275:2: ( (lv_word_0_0= ruleGreetword ) )
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:276:1: (lv_word_0_0= ruleGreetword )
            {
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:276:1: (lv_word_0_0= ruleGreetword )
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:277:3: lv_word_0_0= ruleGreetword
            {
             
            	        newCompositeNode(grammarAccess.getGreetingAccess().getWordGreetwordEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleGreetword_in_ruleGreeting544);
            lv_word_0_0=ruleGreetword();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGreetingRule());
            	        }
                   		set(
                   			current, 
                   			"word",
                    		lv_word_0_0, 
                    		"Greetword");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:293:2: ( (otherlv_1= RULE_ID ) )
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:294:1: (otherlv_1= RULE_ID )
            {
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:294:1: (otherlv_1= RULE_ID )
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:295:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGreetingRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGreeting564); 

            		newLeafNode(otherlv_1, grammarAccess.getGreetingAccess().getPersonPersonCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleGreeting576); 

                	newLeafNode(otherlv_2, grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2());
                

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
    // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:318:1: ruleGreetword returns [Enumerator current=null] : ( (enumLiteral_0= 'Hallo' ) | (enumLiteral_1= 'Hello' ) | (enumLiteral_2= 'Bonjour' ) ) ;
    public final Enumerator ruleGreetword() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:320:28: ( ( (enumLiteral_0= 'Hallo' ) | (enumLiteral_1= 'Hello' ) | (enumLiteral_2= 'Bonjour' ) ) )
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:321:1: ( (enumLiteral_0= 'Hallo' ) | (enumLiteral_1= 'Hello' ) | (enumLiteral_2= 'Bonjour' ) )
            {
            // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:321:1: ( (enumLiteral_0= 'Hallo' ) | (enumLiteral_1= 'Hello' ) | (enumLiteral_2= 'Bonjour' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt4=1;
                }
                break;
            case 21:
                {
                alt4=2;
                }
                break;
            case 22:
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
                    // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:321:2: (enumLiteral_0= 'Hallo' )
                    {
                    // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:321:2: (enumLiteral_0= 'Hallo' )
                    // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:321:4: enumLiteral_0= 'Hallo'
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_20_in_ruleGreetword626); 

                            current = grammarAccess.getGreetwordAccess().getDEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getGreetwordAccess().getDEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:327:6: (enumLiteral_1= 'Hello' )
                    {
                    // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:327:6: (enumLiteral_1= 'Hello' )
                    // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:327:8: enumLiteral_1= 'Hello'
                    {
                    enumLiteral_1=(Token)match(input,21,FOLLOW_21_in_ruleGreetword643); 

                            current = grammarAccess.getGreetwordAccess().getENEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getGreetwordAccess().getENEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:333:6: (enumLiteral_2= 'Bonjour' )
                    {
                    // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:333:6: (enumLiteral_2= 'Bonjour' )
                    // ../com.senacor.mdsd.greeter02/src-gen/com/senacor/mdsd/greeter02/parser/antlr/internal/InternalGreeterDsl02.g:333:8: enumLiteral_2= 'Bonjour'
                    {
                    enumLiteral_2=(Token)match(input,22,FOLLOW_22_in_ruleGreetword660); 

                            current = grammarAccess.getGreetwordAccess().getFREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getGreetwordAccess().getFREnumLiteralDeclaration_2()); 
                        

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModel134 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rulePerson_in_ruleModel155 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleModel168 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleModel180 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModel192 = new BitSet(new long[]{0x0000000000702000L});
    public static final BitSet FOLLOW_ruleGreeting_in_ruleModel213 = new BitSet(new long[]{0x0000000000702000L});
    public static final BitSet FOLLOW_13_in_ruleModel226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePerson_in_entryRulePerson262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePerson272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePerson314 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePerson331 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePerson348 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePerson365 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePerson382 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_rulePerson407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulePerson436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreetword_in_ruleGreeting544 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGreeting564 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGreeting576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleGreetword626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleGreetword643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleGreetword660 = new BitSet(new long[]{0x0000000000000002L});

}