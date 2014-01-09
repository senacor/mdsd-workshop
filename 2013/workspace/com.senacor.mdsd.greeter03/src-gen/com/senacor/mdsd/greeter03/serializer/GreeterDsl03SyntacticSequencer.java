package com.senacor.mdsd.greeter03.serializer;

import com.google.inject.Inject;
import com.senacor.mdsd.greeter03.services.GreeterDsl03GrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class GreeterDsl03SyntacticSequencer extends AbstractSyntacticSequencer {

	protected GreeterDsl03GrammarAccess grammarAccess;
	protected AbstractElementAlias match_Greeting_HalloKeyword_0_1_or_HelloKeyword_0_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (GreeterDsl03GrammarAccess) access;
		match_Greeting_HalloKeyword_0_1_or_HelloKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getGreetingAccess().getHalloKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getGreetingAccess().getHelloKeyword_0_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Greeting_HalloKeyword_0_1_or_HelloKeyword_0_0.equals(syntax))
				emit_Greeting_HalloKeyword_0_1_or_HelloKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'Hallo' | 'Hello'
	 */
	protected void emit_Greeting_HalloKeyword_0_1_or_HelloKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
