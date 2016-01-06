package unihh.sample1.parser.antlr.internal;

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
import unihh.sample1.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Domains'", "'{'", "'}'", "'Bounded Contexts'", "'Aggregates'", "'desc'", "':'", "'String'", "'Int'"
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
    // InternalMyDsl.g:72:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'Domains' otherlv_2= '{' ( (lv_domains_3_0= ruleDomain ) )* otherlv_4= '}' otherlv_5= 'Bounded Contexts' otherlv_6= '{' ( (lv_contexts_7_0= ruleContext ) )* otherlv_8= '}' otherlv_9= 'Aggregates' otherlv_10= '{' ( (lv_aggregates_11_0= ruleAggregate ) )* otherlv_12= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_domains_3_0 = null;

        EObject lv_contexts_7_0 = null;

        EObject lv_aggregates_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( () otherlv_1= 'Domains' otherlv_2= '{' ( (lv_domains_3_0= ruleDomain ) )* otherlv_4= '}' otherlv_5= 'Bounded Contexts' otherlv_6= '{' ( (lv_contexts_7_0= ruleContext ) )* otherlv_8= '}' otherlv_9= 'Aggregates' otherlv_10= '{' ( (lv_aggregates_11_0= ruleAggregate ) )* otherlv_12= '}' ) )
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'Domains' otherlv_2= '{' ( (lv_domains_3_0= ruleDomain ) )* otherlv_4= '}' otherlv_5= 'Bounded Contexts' otherlv_6= '{' ( (lv_contexts_7_0= ruleContext ) )* otherlv_8= '}' otherlv_9= 'Aggregates' otherlv_10= '{' ( (lv_aggregates_11_0= ruleAggregate ) )* otherlv_12= '}' )
            {
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'Domains' otherlv_2= '{' ( (lv_domains_3_0= ruleDomain ) )* otherlv_4= '}' otherlv_5= 'Bounded Contexts' otherlv_6= '{' ( (lv_contexts_7_0= ruleContext ) )* otherlv_8= '}' otherlv_9= 'Aggregates' otherlv_10= '{' ( (lv_aggregates_11_0= ruleAggregate ) )* otherlv_12= '}' )
            // InternalMyDsl.g:80:3: () otherlv_1= 'Domains' otherlv_2= '{' ( (lv_domains_3_0= ruleDomain ) )* otherlv_4= '}' otherlv_5= 'Bounded Contexts' otherlv_6= '{' ( (lv_contexts_7_0= ruleContext ) )* otherlv_8= '}' otherlv_9= 'Aggregates' otherlv_10= '{' ( (lv_aggregates_11_0= ruleAggregate ) )* otherlv_12= '}'
            {
            // InternalMyDsl.g:80:3: ()
            // InternalMyDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getFooAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getDomainsKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:95:3: ( (lv_domains_3_0= ruleDomain ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:96:4: (lv_domains_3_0= ruleDomain )
            	    {
            	    // InternalMyDsl.g:96:4: (lv_domains_3_0= ruleDomain )
            	    // InternalMyDsl.g:97:5: lv_domains_3_0= ruleDomain
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getDomainsDomainParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_domains_3_0=ruleDomain();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"domains",
            	    						lv_domains_3_0,
            	    						"unihh.sample1.MyDsl.Domain");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getModelAccess().getBoundedContextsKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalMyDsl.g:126:3: ( (lv_contexts_7_0= ruleContext ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:127:4: (lv_contexts_7_0= ruleContext )
            	    {
            	    // InternalMyDsl.g:127:4: (lv_contexts_7_0= ruleContext )
            	    // InternalMyDsl.g:128:5: lv_contexts_7_0= ruleContext
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getContextsContextParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_contexts_7_0=ruleContext();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"contexts",
            	    						lv_contexts_7_0,
            	    						"unihh.sample1.MyDsl.Context");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getModelAccess().getAggregatesKeyword_9());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalMyDsl.g:157:3: ( (lv_aggregates_11_0= ruleAggregate ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:158:4: (lv_aggregates_11_0= ruleAggregate )
            	    {
            	    // InternalMyDsl.g:158:4: (lv_aggregates_11_0= ruleAggregate )
            	    // InternalMyDsl.g:159:5: lv_aggregates_11_0= ruleAggregate
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getAggregatesAggregateParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_aggregates_11_0=ruleAggregate();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"aggregates",
            	    						lv_aggregates_11_0,
            	    						"unihh.sample1.MyDsl.Aggregate");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_12=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_12());
            		

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


    // $ANTLR start "entryRuleDomain"
    // InternalMyDsl.g:184:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // InternalMyDsl.g:184:47: (iv_ruleDomain= ruleDomain EOF )
            // InternalMyDsl.g:185:2: iv_ruleDomain= ruleDomain EOF
            {
             newCompositeNode(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomain=ruleDomain();

            state._fsp--;

             current =iv_ruleDomain; 
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
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // InternalMyDsl.g:191:1: ruleDomain returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'desc' ( (lv_description_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:197:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'desc' ( (lv_description_2_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:198:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'desc' ( (lv_description_2_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:198:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'desc' ( (lv_description_2_0= RULE_STRING ) ) )
            // InternalMyDsl.g:199:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'desc' ( (lv_description_2_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:199:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:200:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:200:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:201:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDomainAccess().getDescKeyword_1());
            		
            // InternalMyDsl.g:221:3: ( (lv_description_2_0= RULE_STRING ) )
            // InternalMyDsl.g:222:4: (lv_description_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:222:4: (lv_description_2_0= RULE_STRING )
            // InternalMyDsl.g:223:5: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_description_2_0, grammarAccess.getDomainAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleContext"
    // InternalMyDsl.g:243:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // InternalMyDsl.g:243:48: (iv_ruleContext= ruleContext EOF )
            // InternalMyDsl.g:244:2: iv_ruleContext= ruleContext EOF
            {
             newCompositeNode(grammarAccess.getContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContext=ruleContext();

            state._fsp--;

             current =iv_ruleContext; 
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
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // InternalMyDsl.g:250:1: ruleContext returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (otherlv_2= RULE_ID ) )* otherlv_3= '}' ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:256:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (otherlv_2= RULE_ID ) )* otherlv_3= '}' ) )
            // InternalMyDsl.g:257:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (otherlv_2= RULE_ID ) )* otherlv_3= '}' )
            {
            // InternalMyDsl.g:257:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (otherlv_2= RULE_ID ) )* otherlv_3= '}' )
            // InternalMyDsl.g:258:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (otherlv_2= RULE_ID ) )* otherlv_3= '}'
            {
            // InternalMyDsl.g:258:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:259:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:259:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:260:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getContextAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:280:3: ( (otherlv_2= RULE_ID ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:281:4: (otherlv_2= RULE_ID )
            	    {
            	    // InternalMyDsl.g:281:4: (otherlv_2= RULE_ID )
            	    // InternalMyDsl.g:282:5: otherlv_2= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getContextRule());
            	    					}
            	    				
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_4); 

            	    					newLeafNode(otherlv_2, grammarAccess.getContextAccess().getAggregatesAggregateCrossReference_2_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getContextAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleAggregate"
    // InternalMyDsl.g:301:1: entryRuleAggregate returns [EObject current=null] : iv_ruleAggregate= ruleAggregate EOF ;
    public final EObject entryRuleAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregate = null;


        try {
            // InternalMyDsl.g:301:50: (iv_ruleAggregate= ruleAggregate EOF )
            // InternalMyDsl.g:302:2: iv_ruleAggregate= ruleAggregate EOF
            {
             newCompositeNode(grammarAccess.getAggregateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAggregate=ruleAggregate();

            state._fsp--;

             current =iv_ruleAggregate; 
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
    // $ANTLR end "entryRuleAggregate"


    // $ANTLR start "ruleAggregate"
    // InternalMyDsl.g:308:1: ruleAggregate returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_attributes_2_0= ruleAttribute ) )* otherlv_3= '}' ) ;
    public final EObject ruleAggregate() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_attributes_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:314:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_attributes_2_0= ruleAttribute ) )* otherlv_3= '}' ) )
            // InternalMyDsl.g:315:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_attributes_2_0= ruleAttribute ) )* otherlv_3= '}' )
            {
            // InternalMyDsl.g:315:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_attributes_2_0= ruleAttribute ) )* otherlv_3= '}' )
            // InternalMyDsl.g:316:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_attributes_2_0= ruleAttribute ) )* otherlv_3= '}'
            {
            // InternalMyDsl.g:316:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:317:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:317:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:318:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAggregateAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAggregateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAggregateAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:338:3: ( (lv_attributes_2_0= ruleAttribute ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:339:4: (lv_attributes_2_0= ruleAttribute )
            	    {
            	    // InternalMyDsl.g:339:4: (lv_attributes_2_0= ruleAttribute )
            	    // InternalMyDsl.g:340:5: lv_attributes_2_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getAggregateAccess().getAttributesAttributeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_attributes_2_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAggregateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_2_0,
            	    						"unihh.sample1.MyDsl.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAggregateAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleAggregate"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDsl.g:365:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMyDsl.g:365:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMyDsl.g:366:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDsl.g:372:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:378:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) )
            // InternalMyDsl.g:379:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            {
            // InternalMyDsl.g:379:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            // InternalMyDsl.g:380:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) )
            {
            // InternalMyDsl.g:380:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:381:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:381:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:382:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:402:3: ( (lv_type_2_0= ruleType ) )
            // InternalMyDsl.g:403:4: (lv_type_2_0= ruleType )
            {
            // InternalMyDsl.g:403:4: (lv_type_2_0= ruleType )
            // InternalMyDsl.g:404:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"unihh.sample1.MyDsl.Type");
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:425:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:431:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) ) )
            // InternalMyDsl.g:432:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) )
            {
            // InternalMyDsl.g:432:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:433:3: (enumLiteral_0= 'String' )
                    {
                    // InternalMyDsl.g:433:3: (enumLiteral_0= 'String' )
                    // InternalMyDsl.g:434:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getT_STRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getT_STRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:441:3: (enumLiteral_1= 'Int' )
                    {
                    // InternalMyDsl.g:441:3: (enumLiteral_1= 'Int' )
                    // InternalMyDsl.g:442:4: enumLiteral_1= 'Int'
                    {
                    enumLiteral_1=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getT_INTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getT_INTEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0000L});

}