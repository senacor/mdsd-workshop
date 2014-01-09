package com.senacor.mdsd.hh.splitgreeter.persons.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.senacor.mdsd.hh.splitgreeter.persons.services.PersonsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPersonsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Person'", "'firstname'", "'lastname'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalPersonsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPersonsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPersonsParser.tokenNames; }
    public String getGrammarFileName() { return "../com.senacor.mdsd.hh.splitgreeter.persons/src-gen/com/senacor/mdsd/hh/splitgreeter/persons/parser/antlr/internal/InternalPersons.g"; }



     	private PersonsGrammarAccess grammarAccess;
     	
        public InternalPersonsParser(TokenStream input, PersonsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected PersonsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../com.senacor.mdsd.hh.splitgreeter.persons/src-gen/com/senacor/mdsd/hh/splitgreeter/persons/parser/antlr/internal/InternalPersons.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.senacor.mdsd.hh.splitgreeter.persons/src-gen/com/senacor/mdsd/hh/splitgreeter/persons/parser/antlr/internal/InternalPersons.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../com.senacor.mdsd.hh.splitgreeter.persons/src-gen/com/senacor/mdsd/hh/splitgreeter/persons/parser/antlr/internal/InternalPersons.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../com.senacor.mdsd.hh.splitgreeter.persons/src-gen/com/senacor/mdsd/hh/splitgreeter/persons/parser/antlr/internal/InternalPersons.g:76:1: ruleModel returns [EObject current=null] : ( (lv_persons_0_0= rulePerson ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_persons_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.senacor.mdsd.hh.splitgreeter.persons/src-gen/com/senacor/mdsd/hh/splitgreeter/persons/parser/antlr/internal/InternalPersons.g:79:28: ( ( (lv_persons_0_0= rulePerson ) )* )
            // ../com.senacor.mdsd.hh.splitgreeter.persons/src-gen/com/senacor/mdsd/hh/splitgreeter/persons/parser/antlr/internal/InternalPersons.g:80:1: ( (lv_persons_0_0= rulePerson ) )*
            {
            // ../com.senacor.mdsd.hh.splitgreeter.persons/src-gen/com/senacor/mdsd/hh/splitgreeter/persons/parser/antlr/internal/InternalPersons.g:80:1: ( (lv_persons_0_0= rulePerson ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.senacor.mdsd.hh.splitgreeter.persons/src-gen/com/senacor/mdsd/hh/splitgreeter/persons/parser/antlr/internal/InternalPersons.g:81:1: (lv_persons_0_0= rulePerson )
            	    {
            	    // ../com.senacor.mdsd.hh.splitgreeter.persons/src-gen/com/senacor/mdsd/hh/splitgreeter/persons/parser/antlr/internal/InternalPersons.g:81:1: (lv_persons_0_0= rulePerson )
            	    // ../com.senacor.mdsd.hh.splitgreeter.persons/src-gen/com/senacor/mdsd/hh/splitgreeter/persons/parser/antlr/internal/InternalPersons.g:82:3: lv_persons_0_0= rulePerson
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getPersonsPersonParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePerson_in_ruleModel130);
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
    // ../com.senacor.mdsd.hh.splitgreeter.persons/src-gen/com/senacor/mdsd/hh/splitgreeter/persons/parser/antlr/internal/InternalPersons.g:106:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // ../com.senacor.mdsd.hh.splitgreeter.persons/src-gen/com/senacor/mdsd/hh/splitgreeter/persons/parser/antlr/internal/InternalPersons.g:107:2: (iv_rulePerson= rulePerson EOF )
            // ../com.senacor.mdsd.hh.splitgreeter.persons/src-gen/com/senacor/mdsd/hh/splitgreeter/persons/parser/antlr/internal/InternalPersons.g:108:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_rulePerson_in_entryRulePerson166);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePerson176); 

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
    // ../com.senacor.mdsd.hh.splitgreeter.persons/src-gen/com/senacor/mdsd/hh/splitgreeter/persons/parser/antlr/internal/InternalPersons.g:115:1: rulePerson returns [EObject current=null] : (otherlv_0= 'Person' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'firstname' ( (lv_fn_3_0= RULE_STRING ) ) otherlv_4= 'lastname' ( (lv_ln_5_0= RULE_STRING ) ) ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_fn_3_0=null;
        Token otherlv_4=null;
        Token lv_ln_5_0=null;

         enterRule(); 
            
        try {
            // ../com.senacor.mdsd.hh.splitgreeter.persons/src-gen/com/senacor/mdsd/hh/splitgreeter/persons/parser/antlr/internal/InternalPersons.g:118:28: ( (otherlv_0= 'Person' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'firstname' ( (lv_fn_3_0= RULE_STRING ) ) otherlv_4= 'lastname' ( (lv_ln_5_0= RULE_STRING ) ) ) )
            // ../com.senacor.mdsd.hh.splitgreeter.persons/src-gen/com/senacor/mdsd/hh/splitgreeter/persons/parser/antlr/internal/InternalPersons.g:119:1: (otherlv_0= 'Person' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'firstname' ( (lv_fn_3_0= RULE_STRING ) ) otherlv_4= 'lastname' ( (lv_ln_5_0= RULE_STRING ) ) )
            {
            // ../com.senacor.mdsd.hh.splitgreeter.persons/src-gen/com/senacor/mdsd/hh/splitgreeter/persons/parser/antlr/internal/InternalPersons.g:119:1: (otherlv_0= 'Person' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'firstname' ( (lv_fn_3_0= RULE_STRING ) ) otherlv_4= 'lastname' ( (lv_ln_5_0= RULE_STRING ) ) )
            // ../com.senacor.mdsd.hh.splitgreeter.persons/src-gen/com/senacor/mdsd/hh/splitgreeter/persons/parser/antlr/internal/InternalPersons.g:119:3: otherlv_0= 'Person' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'firstname' ( (lv_fn_3_0= RULE_STRING ) ) otherlv_4= 'lastname' ( (lv_ln_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePerson213); 

                	newLeafNode(otherlv_0, grammarAccess.getPersonAccess().getPersonKeyword_0());
                
            // ../com.senacor.mdsd.hh.splitgreeter.persons/src-gen/com/senacor/mdsd/hh/splitgreeter/persons/parser/antlr/internal/InternalPersons.g:123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.senacor.mdsd.hh.splitgreeter.persons/src-gen/com/senacor/mdsd/hh/splitgreeter/persons/parser/antlr/internal/InternalPersons.g:124:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.senacor.mdsd.hh.splitgreeter.persons/src-gen/com/senacor/mdsd/hh/splitgreeter/persons/parser/antlr/internal/InternalPersons.g:124:1: (lv_name_1_0= RULE_ID )
            // ../com.senacor.mdsd.hh.splitgreeter.persons/src-gen/com/senacor/mdsd/hh/splitgreeter/persons/parser/antlr/internal/InternalPersons.g:125:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePerson230); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePerson247); 

                	newLeafNode(otherlv_2, grammarAccess.getPersonAccess().getFirstnameKeyword_2());
                
            // ../com.senacor.mdsd.hh.splitgreeter.persons/src-gen/com/senacor/mdsd/hh/splitgreeter/persons/parser/antlr/internal/InternalPersons.g:145:1: ( (lv_fn_3_0= RULE_STRING ) )
            // ../com.senacor.mdsd.hh.splitgreeter.persons/src-gen/com/senacor/mdsd/hh/splitgreeter/persons/parser/antlr/internal/InternalPersons.g:146:1: (lv_fn_3_0= RULE_STRING )
            {
            // ../com.senacor.mdsd.hh.splitgreeter.persons/src-gen/com/senacor/mdsd/hh/splitgreeter/persons/parser/antlr/internal/InternalPersons.g:146:1: (lv_fn_3_0= RULE_STRING )
            // ../com.senacor.mdsd.hh.splitgreeter.persons/src-gen/com/senacor/mdsd/hh/splitgreeter/persons/parser/antlr/internal/InternalPersons.g:147:3: lv_fn_3_0= RULE_STRING
            {
            lv_fn_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePerson264); 

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

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_rulePerson281); 

                	newLeafNode(otherlv_4, grammarAccess.getPersonAccess().getLastnameKeyword_4());
                
            // ../com.senacor.mdsd.hh.splitgreeter.persons/src-gen/com/senacor/mdsd/hh/splitgreeter/persons/parser/antlr/internal/InternalPersons.g:167:1: ( (lv_ln_5_0= RULE_STRING ) )
            // ../com.senacor.mdsd.hh.splitgreeter.persons/src-gen/com/senacor/mdsd/hh/splitgreeter/persons/parser/antlr/internal/InternalPersons.g:168:1: (lv_ln_5_0= RULE_STRING )
            {
            // ../com.senacor.mdsd.hh.splitgreeter.persons/src-gen/com/senacor/mdsd/hh/splitgreeter/persons/parser/antlr/internal/InternalPersons.g:168:1: (lv_ln_5_0= RULE_STRING )
            // ../com.senacor.mdsd.hh.splitgreeter.persons/src-gen/com/senacor/mdsd/hh/splitgreeter/persons/parser/antlr/internal/InternalPersons.g:169:3: lv_ln_5_0= RULE_STRING
            {
            lv_ln_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePerson298); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePerson_in_ruleModel130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rulePerson_in_entryRulePerson166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePerson176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePerson213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePerson230 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePerson247 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePerson264 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePerson281 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePerson298 = new BitSet(new long[]{0x0000000000000002L});

}