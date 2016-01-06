package unihh.sample2.parser.antlr.internal;

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
import unihh.sample2.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Persons'", "'{'", "'}'", "'Greetings'", "'firstname'", "'lastname'", "'!'", "'Hallo'", "'Hello'", "'Bonjour'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMyDsl.g:72:1: ruleModel returns [EObject current=null] : (otherlv_0= 'Persons' otherlv_1= '{' ( (lv_persons_2_0= rulePerson ) )* otherlv_3= '}' otherlv_4= 'Greetings' otherlv_5= '{' ( (lv_greetings_6_0= ruleGreeting ) )* otherlv_7= '}' ) ;
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
            // InternalMyDsl.g:78:2: ( (otherlv_0= 'Persons' otherlv_1= '{' ( (lv_persons_2_0= rulePerson ) )* otherlv_3= '}' otherlv_4= 'Greetings' otherlv_5= '{' ( (lv_greetings_6_0= ruleGreeting ) )* otherlv_7= '}' ) )
            // InternalMyDsl.g:79:2: (otherlv_0= 'Persons' otherlv_1= '{' ( (lv_persons_2_0= rulePerson ) )* otherlv_3= '}' otherlv_4= 'Greetings' otherlv_5= '{' ( (lv_greetings_6_0= ruleGreeting ) )* otherlv_7= '}' )
            {
            // InternalMyDsl.g:79:2: (otherlv_0= 'Persons' otherlv_1= '{' ( (lv_persons_2_0= rulePerson ) )* otherlv_3= '}' otherlv_4= 'Greetings' otherlv_5= '{' ( (lv_greetings_6_0= ruleGreeting ) )* otherlv_7= '}' )
            // InternalMyDsl.g:80:3: otherlv_0= 'Persons' otherlv_1= '{' ( (lv_persons_2_0= rulePerson ) )* otherlv_3= '}' otherlv_4= 'Greetings' otherlv_5= '{' ( (lv_greetings_6_0= ruleGreeting ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPersonsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:88:3: ( (lv_persons_2_0= rulePerson ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:89:4: (lv_persons_2_0= rulePerson )
            	    {
            	    // InternalMyDsl.g:89:4: (lv_persons_2_0= rulePerson )
            	    // InternalMyDsl.g:90:5: lv_persons_2_0= rulePerson
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getPersonsPersonParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_persons_2_0=rulePerson();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"persons",
            	    						lv_persons_2_0,
            	    						"unihh.sample2.MyDsl.Person");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getGreetingsKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:119:3: ( (lv_greetings_6_0= ruleGreeting ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=18 && LA2_0<=20)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:120:4: (lv_greetings_6_0= ruleGreeting )
            	    {
            	    // InternalMyDsl.g:120:4: (lv_greetings_6_0= ruleGreeting )
            	    // InternalMyDsl.g:121:5: lv_greetings_6_0= ruleGreeting
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_greetings_6_0=ruleGreeting();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"greetings",
            	    						lv_greetings_6_0,
            	    						"unihh.sample2.MyDsl.Greeting");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

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
    // InternalMyDsl.g:146:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalMyDsl.g:146:47: (iv_rulePerson= rulePerson EOF )
            // InternalMyDsl.g:147:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMyDsl.g:153:1: rulePerson returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'firstname' ( (lv_firstname_2_0= RULE_ID ) ) otherlv_3= 'lastname' ( (lv_lastname_4_0= RULE_ID ) ) ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_firstname_2_0=null;
        Token otherlv_3=null;
        Token lv_lastname_4_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:159:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'firstname' ( (lv_firstname_2_0= RULE_ID ) ) otherlv_3= 'lastname' ( (lv_lastname_4_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:160:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'firstname' ( (lv_firstname_2_0= RULE_ID ) ) otherlv_3= 'lastname' ( (lv_lastname_4_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:160:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'firstname' ( (lv_firstname_2_0= RULE_ID ) ) otherlv_3= 'lastname' ( (lv_lastname_4_0= RULE_ID ) ) )
            // InternalMyDsl.g:161:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'firstname' ( (lv_firstname_2_0= RULE_ID ) ) otherlv_3= 'lastname' ( (lv_lastname_4_0= RULE_ID ) )
            {
            // InternalMyDsl.g:161:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:162:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:162:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:163:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonAccess().getFirstnameKeyword_1());
            		
            // InternalMyDsl.g:183:3: ( (lv_firstname_2_0= RULE_ID ) )
            // InternalMyDsl.g:184:4: (lv_firstname_2_0= RULE_ID )
            {
            // InternalMyDsl.g:184:4: (lv_firstname_2_0= RULE_ID )
            // InternalMyDsl.g:185:5: lv_firstname_2_0= RULE_ID
            {
            lv_firstname_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_firstname_2_0, grammarAccess.getPersonAccess().getFirstnameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"firstname",
            						lv_firstname_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getPersonAccess().getLastnameKeyword_3());
            		
            // InternalMyDsl.g:205:3: ( (lv_lastname_4_0= RULE_ID ) )
            // InternalMyDsl.g:206:4: (lv_lastname_4_0= RULE_ID )
            {
            // InternalMyDsl.g:206:4: (lv_lastname_4_0= RULE_ID )
            // InternalMyDsl.g:207:5: lv_lastname_4_0= RULE_ID
            {
            lv_lastname_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_lastname_4_0, grammarAccess.getPersonAccess().getLastnameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lastname",
            						lv_lastname_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // InternalMyDsl.g:227:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // InternalMyDsl.g:227:49: (iv_ruleGreeting= ruleGreeting EOF )
            // InternalMyDsl.g:228:2: iv_ruleGreeting= ruleGreeting EOF
            {
             newCompositeNode(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;

             current =iv_ruleGreeting; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMyDsl.g:234:1: ruleGreeting returns [EObject current=null] : ( ( (lv_word_0_0= ruleGreetword ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_word_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:240:2: ( ( ( (lv_word_0_0= ruleGreetword ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ) )
            // InternalMyDsl.g:241:2: ( ( (lv_word_0_0= ruleGreetword ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' )
            {
            // InternalMyDsl.g:241:2: ( ( (lv_word_0_0= ruleGreetword ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' )
            // InternalMyDsl.g:242:3: ( (lv_word_0_0= ruleGreetword ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= '!'
            {
            // InternalMyDsl.g:242:3: ( (lv_word_0_0= ruleGreetword ) )
            // InternalMyDsl.g:243:4: (lv_word_0_0= ruleGreetword )
            {
            // InternalMyDsl.g:243:4: (lv_word_0_0= ruleGreetword )
            // InternalMyDsl.g:244:5: lv_word_0_0= ruleGreetword
            {

            					newCompositeNode(grammarAccess.getGreetingAccess().getWordGreetwordEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_word_0_0=ruleGreetword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGreetingRule());
            					}
            					set(
            						current,
            						"word",
            						lv_word_0_0,
            						"unihh.sample2.MyDsl.Greetword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:261:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:262:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:262:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:263:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGreetingRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_1, grammarAccess.getGreetingAccess().getPersonPersonCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_2); 

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
    // InternalMyDsl.g:282:1: ruleGreetword returns [Enumerator current=null] : ( (enumLiteral_0= 'Hallo' ) | (enumLiteral_1= 'Hello' ) | (enumLiteral_2= 'Bonjour' ) ) ;
    public final Enumerator ruleGreetword() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:288:2: ( ( (enumLiteral_0= 'Hallo' ) | (enumLiteral_1= 'Hello' ) | (enumLiteral_2= 'Bonjour' ) ) )
            // InternalMyDsl.g:289:2: ( (enumLiteral_0= 'Hallo' ) | (enumLiteral_1= 'Hello' ) | (enumLiteral_2= 'Bonjour' ) )
            {
            // InternalMyDsl.g:289:2: ( (enumLiteral_0= 'Hallo' ) | (enumLiteral_1= 'Hello' ) | (enumLiteral_2= 'Bonjour' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 20:
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
                    // InternalMyDsl.g:290:3: (enumLiteral_0= 'Hallo' )
                    {
                    // InternalMyDsl.g:290:3: (enumLiteral_0= 'Hallo' )
                    // InternalMyDsl.g:291:4: enumLiteral_0= 'Hallo'
                    {
                    enumLiteral_0=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getGreetwordAccess().getDEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getGreetwordAccess().getDEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:298:3: (enumLiteral_1= 'Hello' )
                    {
                    // InternalMyDsl.g:298:3: (enumLiteral_1= 'Hello' )
                    // InternalMyDsl.g:299:4: enumLiteral_1= 'Hello'
                    {
                    enumLiteral_1=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getGreetwordAccess().getENEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getGreetwordAccess().getENEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:306:3: (enumLiteral_2= 'Bonjour' )
                    {
                    // InternalMyDsl.g:306:3: (enumLiteral_2= 'Bonjour' )
                    // InternalMyDsl.g:307:4: enumLiteral_2= 'Bonjour'
                    {
                    enumLiteral_2=(Token)match(input,20,FOLLOW_2); 

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001C2000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});

}