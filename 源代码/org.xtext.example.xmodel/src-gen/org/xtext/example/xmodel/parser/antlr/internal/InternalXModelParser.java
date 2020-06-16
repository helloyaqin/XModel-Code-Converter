package org.xtext.example.xmodel.parser.antlr.internal;

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
import org.xtext.example.xmodel.services.XModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXModelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Package'", "'{'", "'class'", "','", "'}'", "'isAbstract'", "'XClass'", "'description'", "'extend'", "'property'", "'operation'", "'Property'", "'visibility'", "'xtype'", "'Operation'", "'parameter'", "'Parameter'", "'public'", "'protected'", "'private'", "'String'", "'Integer'", "'Short'", "'Byte'", "'Long'", "'Float'", "'Double'", "'Character'", "'Boolean'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalXModelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXModelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXModelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalXModel.g"; }



     	private XModelGrammarAccess grammarAccess;

        public InternalXModelParser(TokenStream input, XModelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Package";
       	}

       	@Override
       	protected XModelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePackage"
    // InternalXModel.g:65:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalXModel.g:65:48: (iv_rulePackage= rulePackage EOF )
            // InternalXModel.g:66:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalXModel.g:72:1: rulePackage returns [EObject current=null] : ( () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'class' otherlv_5= '{' ( (lv_class_6_0= ruleXClass ) ) (otherlv_7= ',' ( (lv_class_8_0= ruleXClass ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_class_6_0 = null;

        EObject lv_class_8_0 = null;



        	enterRule();

        try {
            // InternalXModel.g:78:2: ( ( () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'class' otherlv_5= '{' ( (lv_class_6_0= ruleXClass ) ) (otherlv_7= ',' ( (lv_class_8_0= ruleXClass ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalXModel.g:79:2: ( () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'class' otherlv_5= '{' ( (lv_class_6_0= ruleXClass ) ) (otherlv_7= ',' ( (lv_class_8_0= ruleXClass ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalXModel.g:79:2: ( () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'class' otherlv_5= '{' ( (lv_class_6_0= ruleXClass ) ) (otherlv_7= ',' ( (lv_class_8_0= ruleXClass ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalXModel.g:80:3: () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'class' otherlv_5= '{' ( (lv_class_6_0= ruleXClass ) ) (otherlv_7= ',' ( (lv_class_8_0= ruleXClass ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalXModel.g:80:3: ()
            // InternalXModel.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPackageAccess().getPackageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getPackageKeyword_1());
            		
            // InternalXModel.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXModel.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalXModel.g:92:4: (lv_name_2_0= ruleEString )
            // InternalXModel.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPackageAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.xmodel.XModel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXModel.g:114:3: (otherlv_4= 'class' otherlv_5= '{' ( (lv_class_6_0= ruleXClass ) ) (otherlv_7= ',' ( (lv_class_8_0= ruleXClass ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalXModel.g:115:4: otherlv_4= 'class' otherlv_5= '{' ( (lv_class_6_0= ruleXClass ) ) (otherlv_7= ',' ( (lv_class_8_0= ruleXClass ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getPackageAccess().getClassKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalXModel.g:123:4: ( (lv_class_6_0= ruleXClass ) )
                    // InternalXModel.g:124:5: (lv_class_6_0= ruleXClass )
                    {
                    // InternalXModel.g:124:5: (lv_class_6_0= ruleXClass )
                    // InternalXModel.g:125:6: lv_class_6_0= ruleXClass
                    {

                    						newCompositeNode(grammarAccess.getPackageAccess().getClassXClassParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_class_6_0=ruleXClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPackageRule());
                    						}
                    						add(
                    							current,
                    							"class",
                    							lv_class_6_0,
                    							"org.xtext.example.xmodel.XModel.XClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXModel.g:142:4: (otherlv_7= ',' ( (lv_class_8_0= ruleXClass ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalXModel.g:143:5: otherlv_7= ',' ( (lv_class_8_0= ruleXClass ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getPackageAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalXModel.g:147:5: ( (lv_class_8_0= ruleXClass ) )
                    	    // InternalXModel.g:148:6: (lv_class_8_0= ruleXClass )
                    	    {
                    	    // InternalXModel.g:148:6: (lv_class_8_0= ruleXClass )
                    	    // InternalXModel.g:149:7: lv_class_8_0= ruleXClass
                    	    {

                    	    							newCompositeNode(grammarAccess.getPackageAccess().getClassXClassParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_class_8_0=ruleXClass();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPackageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"class",
                    	    								lv_class_8_0,
                    	    								"org.xtext.example.xmodel.XModel.XClass");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleXClass"
    // InternalXModel.g:180:1: entryRuleXClass returns [EObject current=null] : iv_ruleXClass= ruleXClass EOF ;
    public final EObject entryRuleXClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClass = null;


        try {
            // InternalXModel.g:180:47: (iv_ruleXClass= ruleXClass EOF )
            // InternalXModel.g:181:2: iv_ruleXClass= ruleXClass EOF
            {
             newCompositeNode(grammarAccess.getXClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXClass=ruleXClass();

            state._fsp--;

             current =iv_ruleXClass; 
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
    // $ANTLR end "entryRuleXClass"


    // $ANTLR start "ruleXClass"
    // InternalXModel.g:187:1: ruleXClass returns [EObject current=null] : ( () ( (lv_isAbstract_1_0= 'isAbstract' ) )? otherlv_2= 'XClass' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'extend' ( (lv_extend_8_0= ruleEString ) ) )? (otherlv_9= 'property' otherlv_10= '{' ( (lv_property_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_property_13_0= ruleProperty ) ) )* otherlv_14= '}' )? (otherlv_15= 'operation' otherlv_16= '{' ( (lv_operation_17_0= ruleOperation ) ) (otherlv_18= ',' ( (lv_operation_19_0= ruleOperation ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleXClass() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_extend_8_0 = null;

        EObject lv_property_11_0 = null;

        EObject lv_property_13_0 = null;

        EObject lv_operation_17_0 = null;

        EObject lv_operation_19_0 = null;



        	enterRule();

        try {
            // InternalXModel.g:193:2: ( ( () ( (lv_isAbstract_1_0= 'isAbstract' ) )? otherlv_2= 'XClass' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'extend' ( (lv_extend_8_0= ruleEString ) ) )? (otherlv_9= 'property' otherlv_10= '{' ( (lv_property_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_property_13_0= ruleProperty ) ) )* otherlv_14= '}' )? (otherlv_15= 'operation' otherlv_16= '{' ( (lv_operation_17_0= ruleOperation ) ) (otherlv_18= ',' ( (lv_operation_19_0= ruleOperation ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalXModel.g:194:2: ( () ( (lv_isAbstract_1_0= 'isAbstract' ) )? otherlv_2= 'XClass' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'extend' ( (lv_extend_8_0= ruleEString ) ) )? (otherlv_9= 'property' otherlv_10= '{' ( (lv_property_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_property_13_0= ruleProperty ) ) )* otherlv_14= '}' )? (otherlv_15= 'operation' otherlv_16= '{' ( (lv_operation_17_0= ruleOperation ) ) (otherlv_18= ',' ( (lv_operation_19_0= ruleOperation ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalXModel.g:194:2: ( () ( (lv_isAbstract_1_0= 'isAbstract' ) )? otherlv_2= 'XClass' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'extend' ( (lv_extend_8_0= ruleEString ) ) )? (otherlv_9= 'property' otherlv_10= '{' ( (lv_property_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_property_13_0= ruleProperty ) ) )* otherlv_14= '}' )? (otherlv_15= 'operation' otherlv_16= '{' ( (lv_operation_17_0= ruleOperation ) ) (otherlv_18= ',' ( (lv_operation_19_0= ruleOperation ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // InternalXModel.g:195:3: () ( (lv_isAbstract_1_0= 'isAbstract' ) )? otherlv_2= 'XClass' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'extend' ( (lv_extend_8_0= ruleEString ) ) )? (otherlv_9= 'property' otherlv_10= '{' ( (lv_property_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_property_13_0= ruleProperty ) ) )* otherlv_14= '}' )? (otherlv_15= 'operation' otherlv_16= '{' ( (lv_operation_17_0= ruleOperation ) ) (otherlv_18= ',' ( (lv_operation_19_0= ruleOperation ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // InternalXModel.g:195:3: ()
            // InternalXModel.g:196:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXClassAccess().getXClassAction_0(),
            					current);
            			

            }

            // InternalXModel.g:202:3: ( (lv_isAbstract_1_0= 'isAbstract' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalXModel.g:203:4: (lv_isAbstract_1_0= 'isAbstract' )
                    {
                    // InternalXModel.g:203:4: (lv_isAbstract_1_0= 'isAbstract' )
                    // InternalXModel.g:204:5: lv_isAbstract_1_0= 'isAbstract'
                    {
                    lv_isAbstract_1_0=(Token)match(input,16,FOLLOW_9); 

                    					newLeafNode(lv_isAbstract_1_0, grammarAccess.getXClassAccess().getIsAbstractIsAbstractKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getXClassRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "isAbstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getXClassAccess().getXClassKeyword_2());
            		
            // InternalXModel.g:220:3: ( (lv_name_3_0= ruleEString ) )
            // InternalXModel.g:221:4: (lv_name_3_0= ruleEString )
            {
            // InternalXModel.g:221:4: (lv_name_3_0= ruleEString )
            // InternalXModel.g:222:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getXClassAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.xmodel.XModel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getXClassAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalXModel.g:243:3: (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalXModel.g:244:4: otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getXClassAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalXModel.g:248:4: ( (lv_description_6_0= ruleEString ) )
                    // InternalXModel.g:249:5: (lv_description_6_0= ruleEString )
                    {
                    // InternalXModel.g:249:5: (lv_description_6_0= ruleEString )
                    // InternalXModel.g:250:6: lv_description_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getXClassAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXClassRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_6_0,
                    							"org.xtext.example.xmodel.XModel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXModel.g:268:3: (otherlv_7= 'extend' ( (lv_extend_8_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalXModel.g:269:4: otherlv_7= 'extend' ( (lv_extend_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getXClassAccess().getExtendKeyword_6_0());
                    			
                    // InternalXModel.g:273:4: ( (lv_extend_8_0= ruleEString ) )
                    // InternalXModel.g:274:5: (lv_extend_8_0= ruleEString )
                    {
                    // InternalXModel.g:274:5: (lv_extend_8_0= ruleEString )
                    // InternalXModel.g:275:6: lv_extend_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getXClassAccess().getExtendEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_extend_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXClassRule());
                    						}
                    						set(
                    							current,
                    							"extend",
                    							lv_extend_8_0,
                    							"org.xtext.example.xmodel.XModel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXModel.g:293:3: (otherlv_9= 'property' otherlv_10= '{' ( (lv_property_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_property_13_0= ruleProperty ) ) )* otherlv_14= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalXModel.g:294:4: otherlv_9= 'property' otherlv_10= '{' ( (lv_property_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_property_13_0= ruleProperty ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getXClassAccess().getPropertyKeyword_7_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_10, grammarAccess.getXClassAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalXModel.g:302:4: ( (lv_property_11_0= ruleProperty ) )
                    // InternalXModel.g:303:5: (lv_property_11_0= ruleProperty )
                    {
                    // InternalXModel.g:303:5: (lv_property_11_0= ruleProperty )
                    // InternalXModel.g:304:6: lv_property_11_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getXClassAccess().getPropertyPropertyParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_property_11_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXClassRule());
                    						}
                    						add(
                    							current,
                    							"property",
                    							lv_property_11_0,
                    							"org.xtext.example.xmodel.XModel.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXModel.g:321:4: (otherlv_12= ',' ( (lv_property_13_0= ruleProperty ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalXModel.g:322:5: otherlv_12= ',' ( (lv_property_13_0= ruleProperty ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getXClassAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalXModel.g:326:5: ( (lv_property_13_0= ruleProperty ) )
                    	    // InternalXModel.g:327:6: (lv_property_13_0= ruleProperty )
                    	    {
                    	    // InternalXModel.g:327:6: (lv_property_13_0= ruleProperty )
                    	    // InternalXModel.g:328:7: lv_property_13_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getXClassAccess().getPropertyPropertyParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_property_13_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"property",
                    	    								lv_property_13_0,
                    	    								"org.xtext.example.xmodel.XModel.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_14, grammarAccess.getXClassAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalXModel.g:351:3: (otherlv_15= 'operation' otherlv_16= '{' ( (lv_operation_17_0= ruleOperation ) ) (otherlv_18= ',' ( (lv_operation_19_0= ruleOperation ) ) )* otherlv_20= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalXModel.g:352:4: otherlv_15= 'operation' otherlv_16= '{' ( (lv_operation_17_0= ruleOperation ) ) (otherlv_18= ',' ( (lv_operation_19_0= ruleOperation ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_15, grammarAccess.getXClassAccess().getOperationKeyword_8_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_16, grammarAccess.getXClassAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalXModel.g:360:4: ( (lv_operation_17_0= ruleOperation ) )
                    // InternalXModel.g:361:5: (lv_operation_17_0= ruleOperation )
                    {
                    // InternalXModel.g:361:5: (lv_operation_17_0= ruleOperation )
                    // InternalXModel.g:362:6: lv_operation_17_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getXClassAccess().getOperationOperationParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_operation_17_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXClassRule());
                    						}
                    						add(
                    							current,
                    							"operation",
                    							lv_operation_17_0,
                    							"org.xtext.example.xmodel.XModel.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXModel.g:379:4: (otherlv_18= ',' ( (lv_operation_19_0= ruleOperation ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalXModel.g:380:5: otherlv_18= ',' ( (lv_operation_19_0= ruleOperation ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_15); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getXClassAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalXModel.g:384:5: ( (lv_operation_19_0= ruleOperation ) )
                    	    // InternalXModel.g:385:6: (lv_operation_19_0= ruleOperation )
                    	    {
                    	    // InternalXModel.g:385:6: (lv_operation_19_0= ruleOperation )
                    	    // InternalXModel.g:386:7: lv_operation_19_0= ruleOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getXClassAccess().getOperationOperationParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_operation_19_0=ruleOperation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"operation",
                    	    								lv_operation_19_0,
                    	    								"org.xtext.example.xmodel.XModel.Operation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_20, grammarAccess.getXClassAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getXClassAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleXClass"


    // $ANTLR start "entryRuleEString"
    // InternalXModel.g:417:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalXModel.g:417:47: (iv_ruleEString= ruleEString EOF )
            // InternalXModel.g:418:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalXModel.g:424:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalXModel.g:430:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalXModel.g:431:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalXModel.g:431:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalXModel.g:432:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXModel.g:440:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleProperty"
    // InternalXModel.g:451:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalXModel.g:451:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalXModel.g:452:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalXModel.g:458:1: ruleProperty returns [EObject current=null] : ( () otherlv_1= 'Property' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'visibility' ( (lv_visibility_7_0= ruleVisibility ) ) )? (otherlv_8= 'xtype' ( (lv_xtype_9_0= ruleXType ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        Enumerator lv_visibility_7_0 = null;

        Enumerator lv_xtype_9_0 = null;



        	enterRule();

        try {
            // InternalXModel.g:464:2: ( ( () otherlv_1= 'Property' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'visibility' ( (lv_visibility_7_0= ruleVisibility ) ) )? (otherlv_8= 'xtype' ( (lv_xtype_9_0= ruleXType ) ) )? otherlv_10= '}' ) )
            // InternalXModel.g:465:2: ( () otherlv_1= 'Property' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'visibility' ( (lv_visibility_7_0= ruleVisibility ) ) )? (otherlv_8= 'xtype' ( (lv_xtype_9_0= ruleXType ) ) )? otherlv_10= '}' )
            {
            // InternalXModel.g:465:2: ( () otherlv_1= 'Property' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'visibility' ( (lv_visibility_7_0= ruleVisibility ) ) )? (otherlv_8= 'xtype' ( (lv_xtype_9_0= ruleXType ) ) )? otherlv_10= '}' )
            // InternalXModel.g:466:3: () otherlv_1= 'Property' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'visibility' ( (lv_visibility_7_0= ruleVisibility ) ) )? (otherlv_8= 'xtype' ( (lv_xtype_9_0= ruleXType ) ) )? otherlv_10= '}'
            {
            // InternalXModel.g:466:3: ()
            // InternalXModel.g:467:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertyAccess().getPropertyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getPropertyKeyword_1());
            		
            // InternalXModel.g:477:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXModel.g:478:4: (lv_name_2_0= ruleEString )
            {
            // InternalXModel.g:478:4: (lv_name_2_0= ruleEString )
            // InternalXModel.g:479:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPropertyAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.xmodel.XModel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXModel.g:500:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalXModel.g:501:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalXModel.g:505:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalXModel.g:506:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalXModel.g:506:5: (lv_description_5_0= ruleEString )
                    // InternalXModel.g:507:6: lv_description_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPropertyAccess().getDescriptionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"org.xtext.example.xmodel.XModel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXModel.g:525:3: (otherlv_6= 'visibility' ( (lv_visibility_7_0= ruleVisibility ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalXModel.g:526:4: otherlv_6= 'visibility' ( (lv_visibility_7_0= ruleVisibility ) )
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getPropertyAccess().getVisibilityKeyword_5_0());
                    			
                    // InternalXModel.g:530:4: ( (lv_visibility_7_0= ruleVisibility ) )
                    // InternalXModel.g:531:5: (lv_visibility_7_0= ruleVisibility )
                    {
                    // InternalXModel.g:531:5: (lv_visibility_7_0= ruleVisibility )
                    // InternalXModel.g:532:6: lv_visibility_7_0= ruleVisibility
                    {

                    						newCompositeNode(grammarAccess.getPropertyAccess().getVisibilityVisibilityEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_visibility_7_0=ruleVisibility();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRule());
                    						}
                    						set(
                    							current,
                    							"visibility",
                    							lv_visibility_7_0,
                    							"org.xtext.example.xmodel.XModel.Visibility");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXModel.g:550:3: (otherlv_8= 'xtype' ( (lv_xtype_9_0= ruleXType ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalXModel.g:551:4: otherlv_8= 'xtype' ( (lv_xtype_9_0= ruleXType ) )
                    {
                    otherlv_8=(Token)match(input,24,FOLLOW_20); 

                    				newLeafNode(otherlv_8, grammarAccess.getPropertyAccess().getXtypeKeyword_6_0());
                    			
                    // InternalXModel.g:555:4: ( (lv_xtype_9_0= ruleXType ) )
                    // InternalXModel.g:556:5: (lv_xtype_9_0= ruleXType )
                    {
                    // InternalXModel.g:556:5: (lv_xtype_9_0= ruleXType )
                    // InternalXModel.g:557:6: lv_xtype_9_0= ruleXType
                    {

                    						newCompositeNode(grammarAccess.getPropertyAccess().getXtypeXTypeEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_xtype_9_0=ruleXType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRule());
                    						}
                    						set(
                    							current,
                    							"xtype",
                    							lv_xtype_9_0,
                    							"org.xtext.example.xmodel.XModel.XType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleOperation"
    // InternalXModel.g:583:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalXModel.g:583:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalXModel.g:584:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalXModel.g:590:1: ruleOperation returns [EObject current=null] : ( () otherlv_1= 'Operation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'visibility' ( (lv_visibility_7_0= ruleVisibility ) ) )? (otherlv_8= 'xtype' ( (lv_xtype_9_0= ruleXType ) ) )? (otherlv_10= 'parameter' otherlv_11= '{' ( (lv_parameter_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameter_14_0= ruleParameter ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        Enumerator lv_visibility_7_0 = null;

        Enumerator lv_xtype_9_0 = null;

        EObject lv_parameter_12_0 = null;

        EObject lv_parameter_14_0 = null;



        	enterRule();

        try {
            // InternalXModel.g:596:2: ( ( () otherlv_1= 'Operation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'visibility' ( (lv_visibility_7_0= ruleVisibility ) ) )? (otherlv_8= 'xtype' ( (lv_xtype_9_0= ruleXType ) ) )? (otherlv_10= 'parameter' otherlv_11= '{' ( (lv_parameter_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameter_14_0= ruleParameter ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalXModel.g:597:2: ( () otherlv_1= 'Operation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'visibility' ( (lv_visibility_7_0= ruleVisibility ) ) )? (otherlv_8= 'xtype' ( (lv_xtype_9_0= ruleXType ) ) )? (otherlv_10= 'parameter' otherlv_11= '{' ( (lv_parameter_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameter_14_0= ruleParameter ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalXModel.g:597:2: ( () otherlv_1= 'Operation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'visibility' ( (lv_visibility_7_0= ruleVisibility ) ) )? (otherlv_8= 'xtype' ( (lv_xtype_9_0= ruleXType ) ) )? (otherlv_10= 'parameter' otherlv_11= '{' ( (lv_parameter_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameter_14_0= ruleParameter ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalXModel.g:598:3: () otherlv_1= 'Operation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'visibility' ( (lv_visibility_7_0= ruleVisibility ) ) )? (otherlv_8= 'xtype' ( (lv_xtype_9_0= ruleXType ) ) )? (otherlv_10= 'parameter' otherlv_11= '{' ( (lv_parameter_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameter_14_0= ruleParameter ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalXModel.g:598:3: ()
            // InternalXModel.g:599:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOperationAccess().getOperationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getOperationKeyword_1());
            		
            // InternalXModel.g:609:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXModel.g:610:4: (lv_name_2_0= ruleEString )
            {
            // InternalXModel.g:610:4: (lv_name_2_0= ruleEString )
            // InternalXModel.g:611:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.xmodel.XModel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXModel.g:632:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalXModel.g:633:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalXModel.g:637:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalXModel.g:638:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalXModel.g:638:5: (lv_description_5_0= ruleEString )
                    // InternalXModel.g:639:6: lv_description_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOperationAccess().getDescriptionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"org.xtext.example.xmodel.XModel.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXModel.g:657:3: (otherlv_6= 'visibility' ( (lv_visibility_7_0= ruleVisibility ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalXModel.g:658:4: otherlv_6= 'visibility' ( (lv_visibility_7_0= ruleVisibility ) )
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getVisibilityKeyword_5_0());
                    			
                    // InternalXModel.g:662:4: ( (lv_visibility_7_0= ruleVisibility ) )
                    // InternalXModel.g:663:5: (lv_visibility_7_0= ruleVisibility )
                    {
                    // InternalXModel.g:663:5: (lv_visibility_7_0= ruleVisibility )
                    // InternalXModel.g:664:6: lv_visibility_7_0= ruleVisibility
                    {

                    						newCompositeNode(grammarAccess.getOperationAccess().getVisibilityVisibilityEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_visibility_7_0=ruleVisibility();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationRule());
                    						}
                    						set(
                    							current,
                    							"visibility",
                    							lv_visibility_7_0,
                    							"org.xtext.example.xmodel.XModel.Visibility");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXModel.g:682:3: (otherlv_8= 'xtype' ( (lv_xtype_9_0= ruleXType ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXModel.g:683:4: otherlv_8= 'xtype' ( (lv_xtype_9_0= ruleXType ) )
                    {
                    otherlv_8=(Token)match(input,24,FOLLOW_20); 

                    				newLeafNode(otherlv_8, grammarAccess.getOperationAccess().getXtypeKeyword_6_0());
                    			
                    // InternalXModel.g:687:4: ( (lv_xtype_9_0= ruleXType ) )
                    // InternalXModel.g:688:5: (lv_xtype_9_0= ruleXType )
                    {
                    // InternalXModel.g:688:5: (lv_xtype_9_0= ruleXType )
                    // InternalXModel.g:689:6: lv_xtype_9_0= ruleXType
                    {

                    						newCompositeNode(grammarAccess.getOperationAccess().getXtypeXTypeEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_xtype_9_0=ruleXType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationRule());
                    						}
                    						set(
                    							current,
                    							"xtype",
                    							lv_xtype_9_0,
                    							"org.xtext.example.xmodel.XModel.XType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXModel.g:707:3: (otherlv_10= 'parameter' otherlv_11= '{' ( (lv_parameter_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameter_14_0= ruleParameter ) ) )* otherlv_15= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalXModel.g:708:4: otherlv_10= 'parameter' otherlv_11= '{' ( (lv_parameter_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameter_14_0= ruleParameter ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getOperationAccess().getParameterKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_25); 

                    				newLeafNode(otherlv_11, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalXModel.g:716:4: ( (lv_parameter_12_0= ruleParameter ) )
                    // InternalXModel.g:717:5: (lv_parameter_12_0= ruleParameter )
                    {
                    // InternalXModel.g:717:5: (lv_parameter_12_0= ruleParameter )
                    // InternalXModel.g:718:6: lv_parameter_12_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getOperationAccess().getParameterParameterParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_parameter_12_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationRule());
                    						}
                    						add(
                    							current,
                    							"parameter",
                    							lv_parameter_12_0,
                    							"org.xtext.example.xmodel.XModel.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXModel.g:735:4: (otherlv_13= ',' ( (lv_parameter_14_0= ruleParameter ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==14) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalXModel.g:736:5: otherlv_13= ',' ( (lv_parameter_14_0= ruleParameter ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_25); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getOperationAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalXModel.g:740:5: ( (lv_parameter_14_0= ruleParameter ) )
                    	    // InternalXModel.g:741:6: (lv_parameter_14_0= ruleParameter )
                    	    {
                    	    // InternalXModel.g:741:6: (lv_parameter_14_0= ruleParameter )
                    	    // InternalXModel.g:742:7: lv_parameter_14_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getOperationAccess().getParameterParameterParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_parameter_14_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOperationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameter",
                    	    								lv_parameter_14_0,
                    	    								"org.xtext.example.xmodel.XModel.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleParameter"
    // InternalXModel.g:773:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalXModel.g:773:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalXModel.g:774:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalXModel.g:780:1: ruleParameter returns [EObject current=null] : ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'xtype' ( (lv_xtype_5_0= ruleXType ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_xtype_5_0 = null;



        	enterRule();

        try {
            // InternalXModel.g:786:2: ( ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'xtype' ( (lv_xtype_5_0= ruleXType ) ) )? otherlv_6= '}' ) )
            // InternalXModel.g:787:2: ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'xtype' ( (lv_xtype_5_0= ruleXType ) ) )? otherlv_6= '}' )
            {
            // InternalXModel.g:787:2: ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'xtype' ( (lv_xtype_5_0= ruleXType ) ) )? otherlv_6= '}' )
            // InternalXModel.g:788:3: () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'xtype' ( (lv_xtype_5_0= ruleXType ) ) )? otherlv_6= '}'
            {
            // InternalXModel.g:788:3: ()
            // InternalXModel.g:789:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getParameterKeyword_1());
            		
            // InternalXModel.g:799:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXModel.g:800:4: (lv_name_2_0= ruleEString )
            {
            // InternalXModel.g:800:4: (lv_name_2_0= ruleEString )
            // InternalXModel.g:801:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.xmodel.XModel.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXModel.g:822:3: (otherlv_4= 'xtype' ( (lv_xtype_5_0= ruleXType ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalXModel.g:823:4: otherlv_4= 'xtype' ( (lv_xtype_5_0= ruleXType ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getXtypeKeyword_4_0());
                    			
                    // InternalXModel.g:827:4: ( (lv_xtype_5_0= ruleXType ) )
                    // InternalXModel.g:828:5: (lv_xtype_5_0= ruleXType )
                    {
                    // InternalXModel.g:828:5: (lv_xtype_5_0= ruleXType )
                    // InternalXModel.g:829:6: lv_xtype_5_0= ruleXType
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getXtypeXTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_xtype_5_0=ruleXType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"xtype",
                    							lv_xtype_5_0,
                    							"org.xtext.example.xmodel.XModel.XType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "ruleVisibility"
    // InternalXModel.g:855:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'private' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalXModel.g:861:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'private' ) ) )
            // InternalXModel.g:862:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'private' ) )
            {
            // InternalXModel.g:862:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'private' ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt20=1;
                }
                break;
            case 29:
                {
                alt20=2;
                }
                break;
            case 30:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalXModel.g:863:3: (enumLiteral_0= 'public' )
                    {
                    // InternalXModel.g:863:3: (enumLiteral_0= 'public' )
                    // InternalXModel.g:864:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXModel.g:871:3: (enumLiteral_1= 'protected' )
                    {
                    // InternalXModel.g:871:3: (enumLiteral_1= 'protected' )
                    // InternalXModel.g:872:4: enumLiteral_1= 'protected'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXModel.g:879:3: (enumLiteral_2= 'private' )
                    {
                    // InternalXModel.g:879:3: (enumLiteral_2= 'private' )
                    // InternalXModel.g:880:4: enumLiteral_2= 'private'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleVisibility"


    // $ANTLR start "ruleXType"
    // InternalXModel.g:890:1: ruleXType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Short' ) | (enumLiteral_3= 'Byte' ) | (enumLiteral_4= 'Long' ) | (enumLiteral_5= 'Float' ) | (enumLiteral_6= 'Double' ) | (enumLiteral_7= 'Character' ) | (enumLiteral_8= 'Boolean' ) ) ;
    public final Enumerator ruleXType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;


        	enterRule();

        try {
            // InternalXModel.g:896:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Short' ) | (enumLiteral_3= 'Byte' ) | (enumLiteral_4= 'Long' ) | (enumLiteral_5= 'Float' ) | (enumLiteral_6= 'Double' ) | (enumLiteral_7= 'Character' ) | (enumLiteral_8= 'Boolean' ) ) )
            // InternalXModel.g:897:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Short' ) | (enumLiteral_3= 'Byte' ) | (enumLiteral_4= 'Long' ) | (enumLiteral_5= 'Float' ) | (enumLiteral_6= 'Double' ) | (enumLiteral_7= 'Character' ) | (enumLiteral_8= 'Boolean' ) )
            {
            // InternalXModel.g:897:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Short' ) | (enumLiteral_3= 'Byte' ) | (enumLiteral_4= 'Long' ) | (enumLiteral_5= 'Float' ) | (enumLiteral_6= 'Double' ) | (enumLiteral_7= 'Character' ) | (enumLiteral_8= 'Boolean' ) )
            int alt21=9;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt21=1;
                }
                break;
            case 32:
                {
                alt21=2;
                }
                break;
            case 33:
                {
                alt21=3;
                }
                break;
            case 34:
                {
                alt21=4;
                }
                break;
            case 35:
                {
                alt21=5;
                }
                break;
            case 36:
                {
                alt21=6;
                }
                break;
            case 37:
                {
                alt21=7;
                }
                break;
            case 38:
                {
                alt21=8;
                }
                break;
            case 39:
                {
                alt21=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalXModel.g:898:3: (enumLiteral_0= 'String' )
                    {
                    // InternalXModel.g:898:3: (enumLiteral_0= 'String' )
                    // InternalXModel.g:899:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getXTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getXTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXModel.g:906:3: (enumLiteral_1= 'Integer' )
                    {
                    // InternalXModel.g:906:3: (enumLiteral_1= 'Integer' )
                    // InternalXModel.g:907:4: enumLiteral_1= 'Integer'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getXTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getXTypeAccess().getIntegerEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXModel.g:914:3: (enumLiteral_2= 'Short' )
                    {
                    // InternalXModel.g:914:3: (enumLiteral_2= 'Short' )
                    // InternalXModel.g:915:4: enumLiteral_2= 'Short'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getXTypeAccess().getShortEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getXTypeAccess().getShortEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalXModel.g:922:3: (enumLiteral_3= 'Byte' )
                    {
                    // InternalXModel.g:922:3: (enumLiteral_3= 'Byte' )
                    // InternalXModel.g:923:4: enumLiteral_3= 'Byte'
                    {
                    enumLiteral_3=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getXTypeAccess().getByteEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getXTypeAccess().getByteEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalXModel.g:930:3: (enumLiteral_4= 'Long' )
                    {
                    // InternalXModel.g:930:3: (enumLiteral_4= 'Long' )
                    // InternalXModel.g:931:4: enumLiteral_4= 'Long'
                    {
                    enumLiteral_4=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getXTypeAccess().getLongEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getXTypeAccess().getLongEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalXModel.g:938:3: (enumLiteral_5= 'Float' )
                    {
                    // InternalXModel.g:938:3: (enumLiteral_5= 'Float' )
                    // InternalXModel.g:939:4: enumLiteral_5= 'Float'
                    {
                    enumLiteral_5=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getXTypeAccess().getFloatEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getXTypeAccess().getFloatEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalXModel.g:946:3: (enumLiteral_6= 'Double' )
                    {
                    // InternalXModel.g:946:3: (enumLiteral_6= 'Double' )
                    // InternalXModel.g:947:4: enumLiteral_6= 'Double'
                    {
                    enumLiteral_6=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getXTypeAccess().getDoubleEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getXTypeAccess().getDoubleEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalXModel.g:954:3: (enumLiteral_7= 'Character' )
                    {
                    // InternalXModel.g:954:3: (enumLiteral_7= 'Character' )
                    // InternalXModel.g:955:4: enumLiteral_7= 'Character'
                    {
                    enumLiteral_7=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getXTypeAccess().getCharacterEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getXTypeAccess().getCharacterEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalXModel.g:962:3: (enumLiteral_8= 'Boolean' )
                    {
                    // InternalXModel.g:962:3: (enumLiteral_8= 'Boolean' )
                    // InternalXModel.g:963:4: enumLiteral_8= 'Boolean'
                    {
                    enumLiteral_8=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getXTypeAccess().getBooleanEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getXTypeAccess().getBooleanEnumLiteralDeclaration_8());
                    			

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
    // $ANTLR end "ruleXType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000003C8000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000388000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000308000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001848000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001808000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000FF80000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000005848000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000005808000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000005008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});

}