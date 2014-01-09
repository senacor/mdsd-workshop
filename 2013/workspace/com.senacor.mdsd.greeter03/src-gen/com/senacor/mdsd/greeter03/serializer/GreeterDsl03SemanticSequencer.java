package com.senacor.mdsd.greeter03.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.senacor.mdsd.greeter03.greeterDsl03.GreeterDsl03Package;
import com.senacor.mdsd.greeter03.greeterDsl03.Greeting;
import com.senacor.mdsd.greeter03.greeterDsl03.Model;
import com.senacor.mdsd.greeter03.services.GreeterDsl03GrammarAccess;
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
public class GreeterDsl03SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GreeterDsl03GrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == GreeterDsl03Package.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case GreeterDsl03Package.GREETING:
				if(context == grammarAccess.getGreetingRule()) {
					sequence_Greeting(context, (Greeting) semanticObject); 
					return; 
				}
				else break;
			case GreeterDsl03Package.MODEL:
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
	 *     name=STRING
	 */
	protected void sequence_Greeting(EObject context, Greeting semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GreeterDsl03Package.Literals.GREETING__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreeterDsl03Package.Literals.GREETING__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGreetingAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
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
