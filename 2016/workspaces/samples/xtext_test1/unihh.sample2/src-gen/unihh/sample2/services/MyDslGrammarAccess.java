/*
 * generated by Xtext 2.9.0
 */
package unihh.sample2.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "unihh.sample2.MyDsl.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPersonsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cPersonsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cPersonsPersonParserRuleCall_2_0 = (RuleCall)cPersonsAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cGreetingsKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cLeftCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cGreetingsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cGreetingsGreetingParserRuleCall_6_0 = (RuleCall)cGreetingsAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Model:
		//	'Persons' '{'
		//	persons+=Person*
		//	'}'
		//	'Greetings' '{'
		//	greetings+=Greeting*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Persons' '{' persons+=Person* '}' 'Greetings' '{' greetings+=Greeting* '}'
		public Group getGroup() { return cGroup; }
		
		//'Persons'
		public Keyword getPersonsKeyword_0() { return cPersonsKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//persons+=Person*
		public Assignment getPersonsAssignment_2() { return cPersonsAssignment_2; }
		
		//Person
		public RuleCall getPersonsPersonParserRuleCall_2_0() { return cPersonsPersonParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
		
		//'Greetings'
		public Keyword getGreetingsKeyword_4() { return cGreetingsKeyword_4; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_5() { return cLeftCurlyBracketKeyword_5; }
		
		//greetings+=Greeting*
		public Assignment getGreetingsAssignment_6() { return cGreetingsAssignment_6; }
		
		//Greeting
		public RuleCall getGreetingsGreetingParserRuleCall_6_0() { return cGreetingsGreetingParserRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class PersonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "unihh.sample2.MyDsl.Person");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cFirstnameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cFirstnameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cFirstnameIDTerminalRuleCall_2_0 = (RuleCall)cFirstnameAssignment_2.eContents().get(0);
		private final Keyword cLastnameKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cLastnameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cLastnameIDTerminalRuleCall_4_0 = (RuleCall)cLastnameAssignment_4.eContents().get(0);
		
		//Person:
		//	name=ID 'firstname' firstname=ID 'lastname' lastname=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID 'firstname' firstname=ID 'lastname' lastname=ID
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//'firstname'
		public Keyword getFirstnameKeyword_1() { return cFirstnameKeyword_1; }
		
		//firstname=ID
		public Assignment getFirstnameAssignment_2() { return cFirstnameAssignment_2; }
		
		//ID
		public RuleCall getFirstnameIDTerminalRuleCall_2_0() { return cFirstnameIDTerminalRuleCall_2_0; }
		
		//'lastname'
		public Keyword getLastnameKeyword_3() { return cLastnameKeyword_3; }
		
		//lastname=ID
		public Assignment getLastnameAssignment_4() { return cLastnameAssignment_4; }
		
		//ID
		public RuleCall getLastnameIDTerminalRuleCall_4_0() { return cLastnameIDTerminalRuleCall_4_0; }
	}
	public class GreetingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "unihh.sample2.MyDsl.Greeting");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cWordAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cWordGreetwordEnumRuleCall_0_0 = (RuleCall)cWordAssignment_0.eContents().get(0);
		private final Assignment cPersonAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPersonPersonCrossReference_1_0 = (CrossReference)cPersonAssignment_1.eContents().get(0);
		private final RuleCall cPersonPersonIDTerminalRuleCall_1_0_1 = (RuleCall)cPersonPersonCrossReference_1_0.eContents().get(1);
		private final Keyword cExclamationMarkKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Greeting:
		//	word=Greetword person=[Person] '!';
		@Override public ParserRule getRule() { return rule; }
		
		//word=Greetword person=[Person] '!'
		public Group getGroup() { return cGroup; }
		
		//word=Greetword
		public Assignment getWordAssignment_0() { return cWordAssignment_0; }
		
		//Greetword
		public RuleCall getWordGreetwordEnumRuleCall_0_0() { return cWordGreetwordEnumRuleCall_0_0; }
		
		//person=[Person]
		public Assignment getPersonAssignment_1() { return cPersonAssignment_1; }
		
		//[Person]
		public CrossReference getPersonPersonCrossReference_1_0() { return cPersonPersonCrossReference_1_0; }
		
		//ID
		public RuleCall getPersonPersonIDTerminalRuleCall_1_0_1() { return cPersonPersonIDTerminalRuleCall_1_0_1; }
		
		//'!'
		public Keyword getExclamationMarkKeyword_2() { return cExclamationMarkKeyword_2; }
	}
	
	public class GreetwordElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "unihh.sample2.MyDsl.Greetword");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cDEEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cDEHalloKeyword_0_0 = (Keyword)cDEEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cENEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cENHelloKeyword_1_0 = (Keyword)cENEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cFREnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cFRBonjourKeyword_2_0 = (Keyword)cFREnumLiteralDeclaration_2.eContents().get(0);
		
		//enum Greetword:
		//	DE='Hallo' | EN='Hello' | FR='Bonjour';
		public EnumRule getRule() { return rule; }
		
		//DE='Hallo' | EN='Hello' | FR='Bonjour'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DE='Hallo'
		public EnumLiteralDeclaration getDEEnumLiteralDeclaration_0() { return cDEEnumLiteralDeclaration_0; }
		
		//'Hallo'
		public Keyword getDEHalloKeyword_0_0() { return cDEHalloKeyword_0_0; }
		
		//EN='Hello'
		public EnumLiteralDeclaration getENEnumLiteralDeclaration_1() { return cENEnumLiteralDeclaration_1; }
		
		//'Hello'
		public Keyword getENHelloKeyword_1_0() { return cENHelloKeyword_1_0; }
		
		//FR='Bonjour'
		public EnumLiteralDeclaration getFREnumLiteralDeclaration_2() { return cFREnumLiteralDeclaration_2; }
		
		//'Bonjour'
		public Keyword getFRBonjourKeyword_2_0() { return cFRBonjourKeyword_2_0; }
	}
	
	private final ModelElements pModel;
	private final PersonElements pPerson;
	private final GreetingElements pGreeting;
	private final GreetwordElements eGreetword;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pPerson = new PersonElements();
		this.pGreeting = new GreetingElements();
		this.eGreetword = new GreetwordElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("unihh.sample2.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	'Persons' '{'
	//	persons+=Person*
	//	'}'
	//	'Greetings' '{'
	//	greetings+=Greeting*
	//	'}';
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Person:
	//	name=ID 'firstname' firstname=ID 'lastname' lastname=ID;
	public PersonElements getPersonAccess() {
		return pPerson;
	}
	
	public ParserRule getPersonRule() {
		return getPersonAccess().getRule();
	}
	
	//Greeting:
	//	word=Greetword person=[Person] '!';
	public GreetingElements getGreetingAccess() {
		return pGreeting;
	}
	
	public ParserRule getGreetingRule() {
		return getGreetingAccess().getRule();
	}
	
	//enum Greetword:
	//	DE='Hallo' | EN='Hello' | FR='Bonjour';
	public GreetwordElements getGreetwordAccess() {
		return eGreetword;
	}
	
	public EnumRule getGreetwordRule() {
		return getGreetwordAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
