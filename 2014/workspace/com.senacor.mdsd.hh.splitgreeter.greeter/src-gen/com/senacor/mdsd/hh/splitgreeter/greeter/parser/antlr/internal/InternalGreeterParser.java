package com.senacor.mdsd.hh.splitgreeter.greeter.parser.antlr.internal; 

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
import com.senacor.mdsd.hh.splitgreeter.greeter.services.GreeterGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGreeterParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'!'", "'Hallo'", "'Huhu'", "'Hello'", "'Bonjour'"
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
    public String getGrammarFileName() { return "../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g"; }



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
    // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:70:2: iv_ruleModel= ruleModel EOF
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
    // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:77:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleGreeting ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_greetings_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:80:28: ( ( (lv_greetings_0_0= ruleGreeting ) )* )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:81:1: ( (lv_greetings_0_0= ruleGreeting ) )*
            {
            // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:81:1: ( (lv_greetings_0_0= ruleGreeting ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=15)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:82:1: (lv_greetings_0_0= ruleGreeting )
            	    {
            	    // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:82:1: (lv_greetings_0_0= ruleGreeting )
            	    // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:83:3: lv_greetings_0_0= ruleGreeting
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGreeting_in_ruleModel130);
            	    lv_greetings_0_0=ruleGreeting();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"greetings",
            	            		lv_greetings_0_0, 
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
    // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:107:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:108:2: (iv_ruleGreeting= ruleGreeting EOF )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:109:2: iv_ruleGreeting= ruleGreeting EOF
            {
             newCompositeNode(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting166);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;

             current =iv_ruleGreeting; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting176); 

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
    // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:116:1: ruleGreeting returns [EObject current=null] : ( ( (lv_greetword_0_0= ruleGreetword ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_greetword_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:119:28: ( ( ( (lv_greetword_0_0= ruleGreetword ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ) )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:120:1: ( ( (lv_greetword_0_0= ruleGreetword ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' )
            {
            // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:120:1: ( ( (lv_greetword_0_0= ruleGreetword ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:120:2: ( (lv_greetword_0_0= ruleGreetword ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '!'
            {
            // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:120:2: ( (lv_greetword_0_0= ruleGreetword ) )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:121:1: (lv_greetword_0_0= ruleGreetword )
            {
            // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:121:1: (lv_greetword_0_0= ruleGreetword )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:122:3: lv_greetword_0_0= ruleGreetword
            {
             
            	        newCompositeNode(grammarAccess.getGreetingAccess().getGreetwordGreetwordEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleGreetword_in_ruleGreeting222);
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

            // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:138:2: ( (otherlv_1= RULE_ID ) )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:139:1: (otherlv_1= RULE_ID )
            {
            // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:139:1: (otherlv_1= RULE_ID )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:140:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGreetingRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGreeting242); 

            		newLeafNode(otherlv_1, grammarAccess.getGreetingAccess().getPersonPersonCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleGreeting254); 

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
    // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:163:1: ruleGreetword returns [Enumerator current=null] : ( (enumLiteral_0= 'Hallo' ) | (enumLiteral_1= 'Huhu' ) | (enumLiteral_2= 'Hello' ) | (enumLiteral_3= 'Bonjour' ) ) ;
    public final Enumerator ruleGreetword() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:165:28: ( ( (enumLiteral_0= 'Hallo' ) | (enumLiteral_1= 'Huhu' ) | (enumLiteral_2= 'Hello' ) | (enumLiteral_3= 'Bonjour' ) ) )
            // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:166:1: ( (enumLiteral_0= 'Hallo' ) | (enumLiteral_1= 'Huhu' ) | (enumLiteral_2= 'Hello' ) | (enumLiteral_3= 'Bonjour' ) )
            {
            // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:166:1: ( (enumLiteral_0= 'Hallo' ) | (enumLiteral_1= 'Huhu' ) | (enumLiteral_2= 'Hello' ) | (enumLiteral_3= 'Bonjour' ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 15:
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
                    // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:166:2: (enumLiteral_0= 'Hallo' )
                    {
                    // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:166:2: (enumLiteral_0= 'Hallo' )
                    // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:166:4: enumLiteral_0= 'Hallo'
                    {
                    enumLiteral_0=(Token)match(input,12,FOLLOW_12_in_ruleGreetword304); 

                            current = grammarAccess.getGreetwordAccess().getDEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getGreetwordAccess().getDEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:172:6: (enumLiteral_1= 'Huhu' )
                    {
                    // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:172:6: (enumLiteral_1= 'Huhu' )
                    // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:172:8: enumLiteral_1= 'Huhu'
                    {
                    enumLiteral_1=(Token)match(input,13,FOLLOW_13_in_ruleGreetword321); 

                            current = grammarAccess.getGreetwordAccess().getDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getGreetwordAccess().getDEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:178:6: (enumLiteral_2= 'Hello' )
                    {
                    // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:178:6: (enumLiteral_2= 'Hello' )
                    // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:178:8: enumLiteral_2= 'Hello'
                    {
                    enumLiteral_2=(Token)match(input,14,FOLLOW_14_in_ruleGreetword338); 

                            current = grammarAccess.getGreetwordAccess().getENEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getGreetwordAccess().getENEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:184:6: (enumLiteral_3= 'Bonjour' )
                    {
                    // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:184:6: (enumLiteral_3= 'Bonjour' )
                    // ../com.senacor.mdsd.hh.splitgreeter.greeter/src-gen/com/senacor/mdsd/hh/splitgreeter/greeter/parser/antlr/internal/InternalGreeter.g:184:8: enumLiteral_3= 'Bonjour'
                    {
                    enumLiteral_3=(Token)match(input,15,FOLLOW_15_in_ruleGreetword355); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_ruleModel130 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreetword_in_ruleGreeting222 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGreeting242 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleGreeting254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleGreetword304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleGreetword321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleGreetword338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleGreetword355 = new BitSet(new long[]{0x0000000000000002L});

}