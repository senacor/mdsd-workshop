package com.senacor.mdsd.hh.splitgreeter.greeter.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.senacor.mdsd.hh.splitgreeter.greeter.greeter.GreeterPackage;
import com.senacor.mdsd.hh.splitgreeter.greeter.greeter.Greeting;
import com.senacor.mdsd.hh.splitgreeter.greeter.greeter.Model;
import com.senacor.mdsd.hh.splitgreeter.greeter.services.GreeterGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class GreeterSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GreeterGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == GreeterPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case GreeterPackage.GREETING:
				if(context == grammarAccess.getGreetingRule()) {
					sequence_Greeting(context, (Greeting) semanticObject); 
					return; 
				}
				else break;
			case GreeterPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (greetword=Greetword person=[Person|ID])
	 */
	protected void sequence_Greeting(EObject context, Greeting semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GreeterPackage.Literals.GREETING__GREETWORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreeterPackage.Literals.GREETING__GREETWORD));
			if(transientValues.isValueTransient(semanticObject, GreeterPackage.Literals.GREETING__PERSON) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreeterPackage.Literals.GREETING__PERSON));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGreetingAccess().getGreetwordGreetwordEnumRuleCall_0_0(), semanticObject.getGreetword());
		feeder.accept(grammarAccess.getGreetingAccess().getPersonPersonIDTerminalRuleCall_1_0_1(), semanticObject.getPerson());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     greetings+=Greeting*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
