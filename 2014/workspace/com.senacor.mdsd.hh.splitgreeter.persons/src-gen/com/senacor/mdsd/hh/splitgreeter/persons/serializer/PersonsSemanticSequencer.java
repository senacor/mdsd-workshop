package com.senacor.mdsd.hh.splitgreeter.persons.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.senacor.mdsd.hh.splitgreeter.persons.persons.Model;
import com.senacor.mdsd.hh.splitgreeter.persons.persons.Person;
import com.senacor.mdsd.hh.splitgreeter.persons.persons.PersonsPackage;
import com.senacor.mdsd.hh.splitgreeter.persons.services.PersonsGrammarAccess;
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
public class PersonsSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PersonsGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PersonsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PersonsPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case PersonsPackage.PERSON:
				if(context == grammarAccess.getPersonRule()) {
					sequence_Person(context, (Person) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     persons+=Person*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID fn=STRING ln=STRING)
	 */
	protected void sequence_Person(EObject context, Person semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PersonsPackage.Literals.PERSON__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PersonsPackage.Literals.PERSON__NAME));
			if(transientValues.isValueTransient(semanticObject, PersonsPackage.Literals.PERSON__FN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PersonsPackage.Literals.PERSON__FN));
			if(transientValues.isValueTransient(semanticObject, PersonsPackage.Literals.PERSON__LN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PersonsPackage.Literals.PERSON__LN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPersonAccess().getFnSTRINGTerminalRuleCall_3_0(), semanticObject.getFn());
		feeder.accept(grammarAccess.getPersonAccess().getLnSTRINGTerminalRuleCall_5_0(), semanticObject.getLn());
		feeder.finish();
	}
}
