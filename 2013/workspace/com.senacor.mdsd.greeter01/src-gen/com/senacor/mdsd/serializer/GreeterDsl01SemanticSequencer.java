package com.senacor.mdsd.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.senacor.mdsd.greeterDsl01.Foo;
import com.senacor.mdsd.greeterDsl01.GreeterDsl01Package;
import com.senacor.mdsd.greeterDsl01.Model;
import com.senacor.mdsd.greeterDsl01.MyGreetword;
import com.senacor.mdsd.services.GreeterDsl01GrammarAccess;
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
public class GreeterDsl01SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GreeterDsl01GrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == GreeterDsl01Package.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case GreeterDsl01Package.FOO:
				if(context == grammarAccess.getGreetingRule()) {
					sequence_Greeting(context, (Foo) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getGreetwordRule() ||
				   context == grammarAccess.getGrusswortRule()) {
					sequence_Greetword_Grusswort(context, (Foo) semanticObject); 
					return; 
				}
				else break;
			case GreeterDsl01Package.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case GreeterDsl01Package.MY_GREETWORD:
				if(context == grammarAccess.getGWRule()) {
					sequence_GW(context, (MyGreetword) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getGreetingRule()) {
					sequence_Greeting(context, (MyGreetword) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     {MyGreetword}
	 */
	protected void sequence_GW(EObject context, MyGreetword semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     adressat=STRING
	 */
	protected void sequence_Greeting(EObject context, Foo semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GreeterDsl01Package.Literals.GW__ADRESSAT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreeterDsl01Package.Literals.GW__ADRESSAT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGreetingAccess().getAdressatSTRINGTerminalRuleCall_1_0(), semanticObject.getAdressat());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     adressat=STRING
	 */
	protected void sequence_Greeting(EObject context, MyGreetword semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GreeterDsl01Package.Literals.GW__ADRESSAT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreeterDsl01Package.Literals.GW__ADRESSAT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGreetingAccess().getAdressatSTRINGTerminalRuleCall_1_0(), semanticObject.getAdressat());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {Foo}
	 */
	protected void sequence_Greetword_Grusswort(EObject context, Foo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (greetings+=Greeting*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
