package org.xtext.example.xmodel.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.xmodel.services.XModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXModelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'public'", "'protected'", "'private'", "'String'", "'Integer'", "'Short'", "'Byte'", "'Long'", "'Float'", "'Double'", "'Character'", "'Boolean'", "'Package'", "'{'", "'}'", "'class'", "','", "'XClass'", "'description'", "'extend'", "'property'", "'operation'", "'Property'", "'visibility'", "'xtype'", "'Operation'", "'parameter'", "'Parameter'", "'isAbstract'"
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

    	public void setGrammarAccess(XModelGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRulePackage"
    // InternalXModel.g:53:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // InternalXModel.g:54:1: ( rulePackage EOF )
            // InternalXModel.g:55:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalXModel.g:62:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:66:2: ( ( ( rule__Package__Group__0 ) ) )
            // InternalXModel.g:67:2: ( ( rule__Package__Group__0 ) )
            {
            // InternalXModel.g:67:2: ( ( rule__Package__Group__0 ) )
            // InternalXModel.g:68:3: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // InternalXModel.g:69:3: ( rule__Package__Group__0 )
            // InternalXModel.g:69:4: rule__Package__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleXClass"
    // InternalXModel.g:78:1: entryRuleXClass : ruleXClass EOF ;
    public final void entryRuleXClass() throws RecognitionException {
        try {
            // InternalXModel.g:79:1: ( ruleXClass EOF )
            // InternalXModel.g:80:1: ruleXClass EOF
            {
             before(grammarAccess.getXClassRule()); 
            pushFollow(FOLLOW_1);
            ruleXClass();

            state._fsp--;

             after(grammarAccess.getXClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXClass"


    // $ANTLR start "ruleXClass"
    // InternalXModel.g:87:1: ruleXClass : ( ( rule__XClass__Group__0 ) ) ;
    public final void ruleXClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:91:2: ( ( ( rule__XClass__Group__0 ) ) )
            // InternalXModel.g:92:2: ( ( rule__XClass__Group__0 ) )
            {
            // InternalXModel.g:92:2: ( ( rule__XClass__Group__0 ) )
            // InternalXModel.g:93:3: ( rule__XClass__Group__0 )
            {
             before(grammarAccess.getXClassAccess().getGroup()); 
            // InternalXModel.g:94:3: ( rule__XClass__Group__0 )
            // InternalXModel.g:94:4: rule__XClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXClass"


    // $ANTLR start "entryRuleEString"
    // InternalXModel.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalXModel.g:104:1: ( ruleEString EOF )
            // InternalXModel.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalXModel.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalXModel.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalXModel.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalXModel.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalXModel.g:119:3: ( rule__EString__Alternatives )
            // InternalXModel.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleProperty"
    // InternalXModel.g:128:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalXModel.g:129:1: ( ruleProperty EOF )
            // InternalXModel.g:130:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalXModel.g:137:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:141:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalXModel.g:142:2: ( ( rule__Property__Group__0 ) )
            {
            // InternalXModel.g:142:2: ( ( rule__Property__Group__0 ) )
            // InternalXModel.g:143:3: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // InternalXModel.g:144:3: ( rule__Property__Group__0 )
            // InternalXModel.g:144:4: rule__Property__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleOperation"
    // InternalXModel.g:153:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalXModel.g:154:1: ( ruleOperation EOF )
            // InternalXModel.g:155:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalXModel.g:162:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:166:2: ( ( ( rule__Operation__Group__0 ) ) )
            // InternalXModel.g:167:2: ( ( rule__Operation__Group__0 ) )
            {
            // InternalXModel.g:167:2: ( ( rule__Operation__Group__0 ) )
            // InternalXModel.g:168:3: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // InternalXModel.g:169:3: ( rule__Operation__Group__0 )
            // InternalXModel.g:169:4: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleParameter"
    // InternalXModel.g:178:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalXModel.g:179:1: ( ruleParameter EOF )
            // InternalXModel.g:180:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalXModel.g:187:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:191:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalXModel.g:192:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalXModel.g:192:2: ( ( rule__Parameter__Group__0 ) )
            // InternalXModel.g:193:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalXModel.g:194:3: ( rule__Parameter__Group__0 )
            // InternalXModel.g:194:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "ruleVisibility"
    // InternalXModel.g:203:1: ruleVisibility : ( ( rule__Visibility__Alternatives ) ) ;
    public final void ruleVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:207:1: ( ( ( rule__Visibility__Alternatives ) ) )
            // InternalXModel.g:208:2: ( ( rule__Visibility__Alternatives ) )
            {
            // InternalXModel.g:208:2: ( ( rule__Visibility__Alternatives ) )
            // InternalXModel.g:209:3: ( rule__Visibility__Alternatives )
            {
             before(grammarAccess.getVisibilityAccess().getAlternatives()); 
            // InternalXModel.g:210:3: ( rule__Visibility__Alternatives )
            // InternalXModel.g:210:4: rule__Visibility__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Visibility__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVisibilityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVisibility"


    // $ANTLR start "ruleXType"
    // InternalXModel.g:219:1: ruleXType : ( ( rule__XType__Alternatives ) ) ;
    public final void ruleXType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:223:1: ( ( ( rule__XType__Alternatives ) ) )
            // InternalXModel.g:224:2: ( ( rule__XType__Alternatives ) )
            {
            // InternalXModel.g:224:2: ( ( rule__XType__Alternatives ) )
            // InternalXModel.g:225:3: ( rule__XType__Alternatives )
            {
             before(grammarAccess.getXTypeAccess().getAlternatives()); 
            // InternalXModel.g:226:3: ( rule__XType__Alternatives )
            // InternalXModel.g:226:4: rule__XType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__XType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXType"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalXModel.g:234:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:238:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalXModel.g:239:2: ( RULE_STRING )
                    {
                    // InternalXModel.g:239:2: ( RULE_STRING )
                    // InternalXModel.g:240:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXModel.g:245:2: ( RULE_ID )
                    {
                    // InternalXModel.g:245:2: ( RULE_ID )
                    // InternalXModel.g:246:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Visibility__Alternatives"
    // InternalXModel.g:255:1: rule__Visibility__Alternatives : ( ( ( 'public' ) ) | ( ( 'protected' ) ) | ( ( 'private' ) ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:259:1: ( ( ( 'public' ) ) | ( ( 'protected' ) ) | ( ( 'private' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalXModel.g:260:2: ( ( 'public' ) )
                    {
                    // InternalXModel.g:260:2: ( ( 'public' ) )
                    // InternalXModel.g:261:3: ( 'public' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0()); 
                    // InternalXModel.g:262:3: ( 'public' )
                    // InternalXModel.g:262:4: 'public'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXModel.g:266:2: ( ( 'protected' ) )
                    {
                    // InternalXModel.g:266:2: ( ( 'protected' ) )
                    // InternalXModel.g:267:3: ( 'protected' )
                    {
                     before(grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_1()); 
                    // InternalXModel.g:268:3: ( 'protected' )
                    // InternalXModel.g:268:4: 'protected'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXModel.g:272:2: ( ( 'private' ) )
                    {
                    // InternalXModel.g:272:2: ( ( 'private' ) )
                    // InternalXModel.g:273:3: ( 'private' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_2()); 
                    // InternalXModel.g:274:3: ( 'private' )
                    // InternalXModel.g:274:4: 'private'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visibility__Alternatives"


    // $ANTLR start "rule__XType__Alternatives"
    // InternalXModel.g:282:1: rule__XType__Alternatives : ( ( ( 'String' ) ) | ( ( 'Integer' ) ) | ( ( 'Short' ) ) | ( ( 'Byte' ) ) | ( ( 'Long' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) | ( ( 'Character' ) ) | ( ( 'Boolean' ) ) );
    public final void rule__XType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:286:1: ( ( ( 'String' ) ) | ( ( 'Integer' ) ) | ( ( 'Short' ) ) | ( ( 'Byte' ) ) | ( ( 'Long' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) | ( ( 'Character' ) ) | ( ( 'Boolean' ) ) )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            case 18:
                {
                alt3=5;
                }
                break;
            case 19:
                {
                alt3=6;
                }
                break;
            case 20:
                {
                alt3=7;
                }
                break;
            case 21:
                {
                alt3=8;
                }
                break;
            case 22:
                {
                alt3=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalXModel.g:287:2: ( ( 'String' ) )
                    {
                    // InternalXModel.g:287:2: ( ( 'String' ) )
                    // InternalXModel.g:288:3: ( 'String' )
                    {
                     before(grammarAccess.getXTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalXModel.g:289:3: ( 'String' )
                    // InternalXModel.g:289:4: 'String'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getXTypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXModel.g:293:2: ( ( 'Integer' ) )
                    {
                    // InternalXModel.g:293:2: ( ( 'Integer' ) )
                    // InternalXModel.g:294:3: ( 'Integer' )
                    {
                     before(grammarAccess.getXTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                    // InternalXModel.g:295:3: ( 'Integer' )
                    // InternalXModel.g:295:4: 'Integer'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getXTypeAccess().getIntegerEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXModel.g:299:2: ( ( 'Short' ) )
                    {
                    // InternalXModel.g:299:2: ( ( 'Short' ) )
                    // InternalXModel.g:300:3: ( 'Short' )
                    {
                     before(grammarAccess.getXTypeAccess().getShortEnumLiteralDeclaration_2()); 
                    // InternalXModel.g:301:3: ( 'Short' )
                    // InternalXModel.g:301:4: 'Short'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getXTypeAccess().getShortEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXModel.g:305:2: ( ( 'Byte' ) )
                    {
                    // InternalXModel.g:305:2: ( ( 'Byte' ) )
                    // InternalXModel.g:306:3: ( 'Byte' )
                    {
                     before(grammarAccess.getXTypeAccess().getByteEnumLiteralDeclaration_3()); 
                    // InternalXModel.g:307:3: ( 'Byte' )
                    // InternalXModel.g:307:4: 'Byte'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getXTypeAccess().getByteEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXModel.g:311:2: ( ( 'Long' ) )
                    {
                    // InternalXModel.g:311:2: ( ( 'Long' ) )
                    // InternalXModel.g:312:3: ( 'Long' )
                    {
                     before(grammarAccess.getXTypeAccess().getLongEnumLiteralDeclaration_4()); 
                    // InternalXModel.g:313:3: ( 'Long' )
                    // InternalXModel.g:313:4: 'Long'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getXTypeAccess().getLongEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXModel.g:317:2: ( ( 'Float' ) )
                    {
                    // InternalXModel.g:317:2: ( ( 'Float' ) )
                    // InternalXModel.g:318:3: ( 'Float' )
                    {
                     before(grammarAccess.getXTypeAccess().getFloatEnumLiteralDeclaration_5()); 
                    // InternalXModel.g:319:3: ( 'Float' )
                    // InternalXModel.g:319:4: 'Float'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getXTypeAccess().getFloatEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalXModel.g:323:2: ( ( 'Double' ) )
                    {
                    // InternalXModel.g:323:2: ( ( 'Double' ) )
                    // InternalXModel.g:324:3: ( 'Double' )
                    {
                     before(grammarAccess.getXTypeAccess().getDoubleEnumLiteralDeclaration_6()); 
                    // InternalXModel.g:325:3: ( 'Double' )
                    // InternalXModel.g:325:4: 'Double'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getXTypeAccess().getDoubleEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalXModel.g:329:2: ( ( 'Character' ) )
                    {
                    // InternalXModel.g:329:2: ( ( 'Character' ) )
                    // InternalXModel.g:330:3: ( 'Character' )
                    {
                     before(grammarAccess.getXTypeAccess().getCharacterEnumLiteralDeclaration_7()); 
                    // InternalXModel.g:331:3: ( 'Character' )
                    // InternalXModel.g:331:4: 'Character'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getXTypeAccess().getCharacterEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalXModel.g:335:2: ( ( 'Boolean' ) )
                    {
                    // InternalXModel.g:335:2: ( ( 'Boolean' ) )
                    // InternalXModel.g:336:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getXTypeAccess().getBooleanEnumLiteralDeclaration_8()); 
                    // InternalXModel.g:337:3: ( 'Boolean' )
                    // InternalXModel.g:337:4: 'Boolean'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getXTypeAccess().getBooleanEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XType__Alternatives"


    // $ANTLR start "rule__Package__Group__0"
    // InternalXModel.g:345:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:349:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalXModel.g:350:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // InternalXModel.g:357:1: rule__Package__Group__0__Impl : ( () ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:361:1: ( ( () ) )
            // InternalXModel.g:362:1: ( () )
            {
            // InternalXModel.g:362:1: ( () )
            // InternalXModel.g:363:2: ()
            {
             before(grammarAccess.getPackageAccess().getPackageAction_0()); 
            // InternalXModel.g:364:2: ()
            // InternalXModel.g:364:3: 
            {
            }

             after(grammarAccess.getPackageAccess().getPackageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // InternalXModel.g:372:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:376:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalXModel.g:377:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // InternalXModel.g:384:1: rule__Package__Group__1__Impl : ( 'Package' ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:388:1: ( ( 'Package' ) )
            // InternalXModel.g:389:1: ( 'Package' )
            {
            // InternalXModel.g:389:1: ( 'Package' )
            // InternalXModel.g:390:2: 'Package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getPackageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__2"
    // InternalXModel.g:399:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:403:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // InternalXModel.g:404:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2"


    // $ANTLR start "rule__Package__Group__2__Impl"
    // InternalXModel.g:411:1: rule__Package__Group__2__Impl : ( ( rule__Package__NameAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:415:1: ( ( ( rule__Package__NameAssignment_2 ) ) )
            // InternalXModel.g:416:1: ( ( rule__Package__NameAssignment_2 ) )
            {
            // InternalXModel.g:416:1: ( ( rule__Package__NameAssignment_2 ) )
            // InternalXModel.g:417:2: ( rule__Package__NameAssignment_2 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_2()); 
            // InternalXModel.g:418:2: ( rule__Package__NameAssignment_2 )
            // InternalXModel.g:418:3: rule__Package__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Package__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2__Impl"


    // $ANTLR start "rule__Package__Group__3"
    // InternalXModel.g:426:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:430:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // InternalXModel.g:431:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3"


    // $ANTLR start "rule__Package__Group__3__Impl"
    // InternalXModel.g:438:1: rule__Package__Group__3__Impl : ( '{' ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:442:1: ( ( '{' ) )
            // InternalXModel.g:443:1: ( '{' )
            {
            // InternalXModel.g:443:1: ( '{' )
            // InternalXModel.g:444:2: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3__Impl"


    // $ANTLR start "rule__Package__Group__4"
    // InternalXModel.g:453:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:457:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // InternalXModel.g:458:2: rule__Package__Group__4__Impl rule__Package__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Package__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4"


    // $ANTLR start "rule__Package__Group__4__Impl"
    // InternalXModel.g:465:1: rule__Package__Group__4__Impl : ( ( rule__Package__Group_4__0 )? ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:469:1: ( ( ( rule__Package__Group_4__0 )? ) )
            // InternalXModel.g:470:1: ( ( rule__Package__Group_4__0 )? )
            {
            // InternalXModel.g:470:1: ( ( rule__Package__Group_4__0 )? )
            // InternalXModel.g:471:2: ( rule__Package__Group_4__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_4()); 
            // InternalXModel.g:472:2: ( rule__Package__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalXModel.g:472:3: rule__Package__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Package__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4__Impl"


    // $ANTLR start "rule__Package__Group__5"
    // InternalXModel.g:480:1: rule__Package__Group__5 : rule__Package__Group__5__Impl ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:484:1: ( rule__Package__Group__5__Impl )
            // InternalXModel.g:485:2: rule__Package__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__5"


    // $ANTLR start "rule__Package__Group__5__Impl"
    // InternalXModel.g:491:1: rule__Package__Group__5__Impl : ( '}' ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:495:1: ( ( '}' ) )
            // InternalXModel.g:496:1: ( '}' )
            {
            // InternalXModel.g:496:1: ( '}' )
            // InternalXModel.g:497:2: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__5__Impl"


    // $ANTLR start "rule__Package__Group_4__0"
    // InternalXModel.g:507:1: rule__Package__Group_4__0 : rule__Package__Group_4__0__Impl rule__Package__Group_4__1 ;
    public final void rule__Package__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:511:1: ( rule__Package__Group_4__0__Impl rule__Package__Group_4__1 )
            // InternalXModel.g:512:2: rule__Package__Group_4__0__Impl rule__Package__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Package__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__0"


    // $ANTLR start "rule__Package__Group_4__0__Impl"
    // InternalXModel.g:519:1: rule__Package__Group_4__0__Impl : ( 'class' ) ;
    public final void rule__Package__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:523:1: ( ( 'class' ) )
            // InternalXModel.g:524:1: ( 'class' )
            {
            // InternalXModel.g:524:1: ( 'class' )
            // InternalXModel.g:525:2: 'class'
            {
             before(grammarAccess.getPackageAccess().getClassKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getClassKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__0__Impl"


    // $ANTLR start "rule__Package__Group_4__1"
    // InternalXModel.g:534:1: rule__Package__Group_4__1 : rule__Package__Group_4__1__Impl rule__Package__Group_4__2 ;
    public final void rule__Package__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:538:1: ( rule__Package__Group_4__1__Impl rule__Package__Group_4__2 )
            // InternalXModel.g:539:2: rule__Package__Group_4__1__Impl rule__Package__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__Package__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__1"


    // $ANTLR start "rule__Package__Group_4__1__Impl"
    // InternalXModel.g:546:1: rule__Package__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Package__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:550:1: ( ( '{' ) )
            // InternalXModel.g:551:1: ( '{' )
            {
            // InternalXModel.g:551:1: ( '{' )
            // InternalXModel.g:552:2: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__1__Impl"


    // $ANTLR start "rule__Package__Group_4__2"
    // InternalXModel.g:561:1: rule__Package__Group_4__2 : rule__Package__Group_4__2__Impl rule__Package__Group_4__3 ;
    public final void rule__Package__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:565:1: ( rule__Package__Group_4__2__Impl rule__Package__Group_4__3 )
            // InternalXModel.g:566:2: rule__Package__Group_4__2__Impl rule__Package__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__Package__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__2"


    // $ANTLR start "rule__Package__Group_4__2__Impl"
    // InternalXModel.g:573:1: rule__Package__Group_4__2__Impl : ( ( rule__Package__ClassAssignment_4_2 ) ) ;
    public final void rule__Package__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:577:1: ( ( ( rule__Package__ClassAssignment_4_2 ) ) )
            // InternalXModel.g:578:1: ( ( rule__Package__ClassAssignment_4_2 ) )
            {
            // InternalXModel.g:578:1: ( ( rule__Package__ClassAssignment_4_2 ) )
            // InternalXModel.g:579:2: ( rule__Package__ClassAssignment_4_2 )
            {
             before(grammarAccess.getPackageAccess().getClassAssignment_4_2()); 
            // InternalXModel.g:580:2: ( rule__Package__ClassAssignment_4_2 )
            // InternalXModel.g:580:3: rule__Package__ClassAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Package__ClassAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getClassAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__2__Impl"


    // $ANTLR start "rule__Package__Group_4__3"
    // InternalXModel.g:588:1: rule__Package__Group_4__3 : rule__Package__Group_4__3__Impl rule__Package__Group_4__4 ;
    public final void rule__Package__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:592:1: ( rule__Package__Group_4__3__Impl rule__Package__Group_4__4 )
            // InternalXModel.g:593:2: rule__Package__Group_4__3__Impl rule__Package__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__Package__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__3"


    // $ANTLR start "rule__Package__Group_4__3__Impl"
    // InternalXModel.g:600:1: rule__Package__Group_4__3__Impl : ( ( rule__Package__Group_4_3__0 )* ) ;
    public final void rule__Package__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:604:1: ( ( ( rule__Package__Group_4_3__0 )* ) )
            // InternalXModel.g:605:1: ( ( rule__Package__Group_4_3__0 )* )
            {
            // InternalXModel.g:605:1: ( ( rule__Package__Group_4_3__0 )* )
            // InternalXModel.g:606:2: ( rule__Package__Group_4_3__0 )*
            {
             before(grammarAccess.getPackageAccess().getGroup_4_3()); 
            // InternalXModel.g:607:2: ( rule__Package__Group_4_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalXModel.g:607:3: rule__Package__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Package__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__3__Impl"


    // $ANTLR start "rule__Package__Group_4__4"
    // InternalXModel.g:615:1: rule__Package__Group_4__4 : rule__Package__Group_4__4__Impl ;
    public final void rule__Package__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:619:1: ( rule__Package__Group_4__4__Impl )
            // InternalXModel.g:620:2: rule__Package__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__4"


    // $ANTLR start "rule__Package__Group_4__4__Impl"
    // InternalXModel.g:626:1: rule__Package__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Package__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:630:1: ( ( '}' ) )
            // InternalXModel.g:631:1: ( '}' )
            {
            // InternalXModel.g:631:1: ( '}' )
            // InternalXModel.g:632:2: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__4__Impl"


    // $ANTLR start "rule__Package__Group_4_3__0"
    // InternalXModel.g:642:1: rule__Package__Group_4_3__0 : rule__Package__Group_4_3__0__Impl rule__Package__Group_4_3__1 ;
    public final void rule__Package__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:646:1: ( rule__Package__Group_4_3__0__Impl rule__Package__Group_4_3__1 )
            // InternalXModel.g:647:2: rule__Package__Group_4_3__0__Impl rule__Package__Group_4_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Package__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4_3__0"


    // $ANTLR start "rule__Package__Group_4_3__0__Impl"
    // InternalXModel.g:654:1: rule__Package__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Package__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:658:1: ( ( ',' ) )
            // InternalXModel.g:659:1: ( ',' )
            {
            // InternalXModel.g:659:1: ( ',' )
            // InternalXModel.g:660:2: ','
            {
             before(grammarAccess.getPackageAccess().getCommaKeyword_4_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4_3__0__Impl"


    // $ANTLR start "rule__Package__Group_4_3__1"
    // InternalXModel.g:669:1: rule__Package__Group_4_3__1 : rule__Package__Group_4_3__1__Impl ;
    public final void rule__Package__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:673:1: ( rule__Package__Group_4_3__1__Impl )
            // InternalXModel.g:674:2: rule__Package__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4_3__1"


    // $ANTLR start "rule__Package__Group_4_3__1__Impl"
    // InternalXModel.g:680:1: rule__Package__Group_4_3__1__Impl : ( ( rule__Package__ClassAssignment_4_3_1 ) ) ;
    public final void rule__Package__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:684:1: ( ( ( rule__Package__ClassAssignment_4_3_1 ) ) )
            // InternalXModel.g:685:1: ( ( rule__Package__ClassAssignment_4_3_1 ) )
            {
            // InternalXModel.g:685:1: ( ( rule__Package__ClassAssignment_4_3_1 ) )
            // InternalXModel.g:686:2: ( rule__Package__ClassAssignment_4_3_1 )
            {
             before(grammarAccess.getPackageAccess().getClassAssignment_4_3_1()); 
            // InternalXModel.g:687:2: ( rule__Package__ClassAssignment_4_3_1 )
            // InternalXModel.g:687:3: rule__Package__ClassAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Package__ClassAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getClassAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4_3__1__Impl"


    // $ANTLR start "rule__XClass__Group__0"
    // InternalXModel.g:696:1: rule__XClass__Group__0 : rule__XClass__Group__0__Impl rule__XClass__Group__1 ;
    public final void rule__XClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:700:1: ( rule__XClass__Group__0__Impl rule__XClass__Group__1 )
            // InternalXModel.g:701:2: rule__XClass__Group__0__Impl rule__XClass__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__XClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group__0"


    // $ANTLR start "rule__XClass__Group__0__Impl"
    // InternalXModel.g:708:1: rule__XClass__Group__0__Impl : ( () ) ;
    public final void rule__XClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:712:1: ( ( () ) )
            // InternalXModel.g:713:1: ( () )
            {
            // InternalXModel.g:713:1: ( () )
            // InternalXModel.g:714:2: ()
            {
             before(grammarAccess.getXClassAccess().getXClassAction_0()); 
            // InternalXModel.g:715:2: ()
            // InternalXModel.g:715:3: 
            {
            }

             after(grammarAccess.getXClassAccess().getXClassAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group__0__Impl"


    // $ANTLR start "rule__XClass__Group__1"
    // InternalXModel.g:723:1: rule__XClass__Group__1 : rule__XClass__Group__1__Impl rule__XClass__Group__2 ;
    public final void rule__XClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:727:1: ( rule__XClass__Group__1__Impl rule__XClass__Group__2 )
            // InternalXModel.g:728:2: rule__XClass__Group__1__Impl rule__XClass__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__XClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group__1"


    // $ANTLR start "rule__XClass__Group__1__Impl"
    // InternalXModel.g:735:1: rule__XClass__Group__1__Impl : ( ( rule__XClass__IsAbstractAssignment_1 )? ) ;
    public final void rule__XClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:739:1: ( ( ( rule__XClass__IsAbstractAssignment_1 )? ) )
            // InternalXModel.g:740:1: ( ( rule__XClass__IsAbstractAssignment_1 )? )
            {
            // InternalXModel.g:740:1: ( ( rule__XClass__IsAbstractAssignment_1 )? )
            // InternalXModel.g:741:2: ( rule__XClass__IsAbstractAssignment_1 )?
            {
             before(grammarAccess.getXClassAccess().getIsAbstractAssignment_1()); 
            // InternalXModel.g:742:2: ( rule__XClass__IsAbstractAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==39) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalXModel.g:742:3: rule__XClass__IsAbstractAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XClass__IsAbstractAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXClassAccess().getIsAbstractAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group__1__Impl"


    // $ANTLR start "rule__XClass__Group__2"
    // InternalXModel.g:750:1: rule__XClass__Group__2 : rule__XClass__Group__2__Impl rule__XClass__Group__3 ;
    public final void rule__XClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:754:1: ( rule__XClass__Group__2__Impl rule__XClass__Group__3 )
            // InternalXModel.g:755:2: rule__XClass__Group__2__Impl rule__XClass__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__XClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XClass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group__2"


    // $ANTLR start "rule__XClass__Group__2__Impl"
    // InternalXModel.g:762:1: rule__XClass__Group__2__Impl : ( 'XClass' ) ;
    public final void rule__XClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:766:1: ( ( 'XClass' ) )
            // InternalXModel.g:767:1: ( 'XClass' )
            {
            // InternalXModel.g:767:1: ( 'XClass' )
            // InternalXModel.g:768:2: 'XClass'
            {
             before(grammarAccess.getXClassAccess().getXClassKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getXClassAccess().getXClassKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group__2__Impl"


    // $ANTLR start "rule__XClass__Group__3"
    // InternalXModel.g:777:1: rule__XClass__Group__3 : rule__XClass__Group__3__Impl rule__XClass__Group__4 ;
    public final void rule__XClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:781:1: ( rule__XClass__Group__3__Impl rule__XClass__Group__4 )
            // InternalXModel.g:782:2: rule__XClass__Group__3__Impl rule__XClass__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__XClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XClass__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group__3"


    // $ANTLR start "rule__XClass__Group__3__Impl"
    // InternalXModel.g:789:1: rule__XClass__Group__3__Impl : ( ( rule__XClass__NameAssignment_3 ) ) ;
    public final void rule__XClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:793:1: ( ( ( rule__XClass__NameAssignment_3 ) ) )
            // InternalXModel.g:794:1: ( ( rule__XClass__NameAssignment_3 ) )
            {
            // InternalXModel.g:794:1: ( ( rule__XClass__NameAssignment_3 ) )
            // InternalXModel.g:795:2: ( rule__XClass__NameAssignment_3 )
            {
             before(grammarAccess.getXClassAccess().getNameAssignment_3()); 
            // InternalXModel.g:796:2: ( rule__XClass__NameAssignment_3 )
            // InternalXModel.g:796:3: rule__XClass__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XClass__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXClassAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group__3__Impl"


    // $ANTLR start "rule__XClass__Group__4"
    // InternalXModel.g:804:1: rule__XClass__Group__4 : rule__XClass__Group__4__Impl rule__XClass__Group__5 ;
    public final void rule__XClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:808:1: ( rule__XClass__Group__4__Impl rule__XClass__Group__5 )
            // InternalXModel.g:809:2: rule__XClass__Group__4__Impl rule__XClass__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__XClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XClass__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group__4"


    // $ANTLR start "rule__XClass__Group__4__Impl"
    // InternalXModel.g:816:1: rule__XClass__Group__4__Impl : ( '{' ) ;
    public final void rule__XClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:820:1: ( ( '{' ) )
            // InternalXModel.g:821:1: ( '{' )
            {
            // InternalXModel.g:821:1: ( '{' )
            // InternalXModel.g:822:2: '{'
            {
             before(grammarAccess.getXClassAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getXClassAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group__4__Impl"


    // $ANTLR start "rule__XClass__Group__5"
    // InternalXModel.g:831:1: rule__XClass__Group__5 : rule__XClass__Group__5__Impl rule__XClass__Group__6 ;
    public final void rule__XClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:835:1: ( rule__XClass__Group__5__Impl rule__XClass__Group__6 )
            // InternalXModel.g:836:2: rule__XClass__Group__5__Impl rule__XClass__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__XClass__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XClass__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group__5"


    // $ANTLR start "rule__XClass__Group__5__Impl"
    // InternalXModel.g:843:1: rule__XClass__Group__5__Impl : ( ( rule__XClass__Group_5__0 )? ) ;
    public final void rule__XClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:847:1: ( ( ( rule__XClass__Group_5__0 )? ) )
            // InternalXModel.g:848:1: ( ( rule__XClass__Group_5__0 )? )
            {
            // InternalXModel.g:848:1: ( ( rule__XClass__Group_5__0 )? )
            // InternalXModel.g:849:2: ( rule__XClass__Group_5__0 )?
            {
             before(grammarAccess.getXClassAccess().getGroup_5()); 
            // InternalXModel.g:850:2: ( rule__XClass__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalXModel.g:850:3: rule__XClass__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XClass__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXClassAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group__5__Impl"


    // $ANTLR start "rule__XClass__Group__6"
    // InternalXModel.g:858:1: rule__XClass__Group__6 : rule__XClass__Group__6__Impl rule__XClass__Group__7 ;
    public final void rule__XClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:862:1: ( rule__XClass__Group__6__Impl rule__XClass__Group__7 )
            // InternalXModel.g:863:2: rule__XClass__Group__6__Impl rule__XClass__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__XClass__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XClass__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group__6"


    // $ANTLR start "rule__XClass__Group__6__Impl"
    // InternalXModel.g:870:1: rule__XClass__Group__6__Impl : ( ( rule__XClass__Group_6__0 )? ) ;
    public final void rule__XClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:874:1: ( ( ( rule__XClass__Group_6__0 )? ) )
            // InternalXModel.g:875:1: ( ( rule__XClass__Group_6__0 )? )
            {
            // InternalXModel.g:875:1: ( ( rule__XClass__Group_6__0 )? )
            // InternalXModel.g:876:2: ( rule__XClass__Group_6__0 )?
            {
             before(grammarAccess.getXClassAccess().getGroup_6()); 
            // InternalXModel.g:877:2: ( rule__XClass__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalXModel.g:877:3: rule__XClass__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XClass__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXClassAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group__6__Impl"


    // $ANTLR start "rule__XClass__Group__7"
    // InternalXModel.g:885:1: rule__XClass__Group__7 : rule__XClass__Group__7__Impl rule__XClass__Group__8 ;
    public final void rule__XClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:889:1: ( rule__XClass__Group__7__Impl rule__XClass__Group__8 )
            // InternalXModel.g:890:2: rule__XClass__Group__7__Impl rule__XClass__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__XClass__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XClass__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group__7"


    // $ANTLR start "rule__XClass__Group__7__Impl"
    // InternalXModel.g:897:1: rule__XClass__Group__7__Impl : ( ( rule__XClass__Group_7__0 )? ) ;
    public final void rule__XClass__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:901:1: ( ( ( rule__XClass__Group_7__0 )? ) )
            // InternalXModel.g:902:1: ( ( rule__XClass__Group_7__0 )? )
            {
            // InternalXModel.g:902:1: ( ( rule__XClass__Group_7__0 )? )
            // InternalXModel.g:903:2: ( rule__XClass__Group_7__0 )?
            {
             before(grammarAccess.getXClassAccess().getGroup_7()); 
            // InternalXModel.g:904:2: ( rule__XClass__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalXModel.g:904:3: rule__XClass__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XClass__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXClassAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group__7__Impl"


    // $ANTLR start "rule__XClass__Group__8"
    // InternalXModel.g:912:1: rule__XClass__Group__8 : rule__XClass__Group__8__Impl rule__XClass__Group__9 ;
    public final void rule__XClass__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:916:1: ( rule__XClass__Group__8__Impl rule__XClass__Group__9 )
            // InternalXModel.g:917:2: rule__XClass__Group__8__Impl rule__XClass__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__XClass__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XClass__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group__8"


    // $ANTLR start "rule__XClass__Group__8__Impl"
    // InternalXModel.g:924:1: rule__XClass__Group__8__Impl : ( ( rule__XClass__Group_8__0 )? ) ;
    public final void rule__XClass__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:928:1: ( ( ( rule__XClass__Group_8__0 )? ) )
            // InternalXModel.g:929:1: ( ( rule__XClass__Group_8__0 )? )
            {
            // InternalXModel.g:929:1: ( ( rule__XClass__Group_8__0 )? )
            // InternalXModel.g:930:2: ( rule__XClass__Group_8__0 )?
            {
             before(grammarAccess.getXClassAccess().getGroup_8()); 
            // InternalXModel.g:931:2: ( rule__XClass__Group_8__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalXModel.g:931:3: rule__XClass__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XClass__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXClassAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group__8__Impl"


    // $ANTLR start "rule__XClass__Group__9"
    // InternalXModel.g:939:1: rule__XClass__Group__9 : rule__XClass__Group__9__Impl ;
    public final void rule__XClass__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:943:1: ( rule__XClass__Group__9__Impl )
            // InternalXModel.g:944:2: rule__XClass__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XClass__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group__9"


    // $ANTLR start "rule__XClass__Group__9__Impl"
    // InternalXModel.g:950:1: rule__XClass__Group__9__Impl : ( '}' ) ;
    public final void rule__XClass__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:954:1: ( ( '}' ) )
            // InternalXModel.g:955:1: ( '}' )
            {
            // InternalXModel.g:955:1: ( '}' )
            // InternalXModel.g:956:2: '}'
            {
             before(grammarAccess.getXClassAccess().getRightCurlyBracketKeyword_9()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getXClassAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group__9__Impl"


    // $ANTLR start "rule__XClass__Group_5__0"
    // InternalXModel.g:966:1: rule__XClass__Group_5__0 : rule__XClass__Group_5__0__Impl rule__XClass__Group_5__1 ;
    public final void rule__XClass__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:970:1: ( rule__XClass__Group_5__0__Impl rule__XClass__Group_5__1 )
            // InternalXModel.g:971:2: rule__XClass__Group_5__0__Impl rule__XClass__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__XClass__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XClass__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_5__0"


    // $ANTLR start "rule__XClass__Group_5__0__Impl"
    // InternalXModel.g:978:1: rule__XClass__Group_5__0__Impl : ( 'description' ) ;
    public final void rule__XClass__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:982:1: ( ( 'description' ) )
            // InternalXModel.g:983:1: ( 'description' )
            {
            // InternalXModel.g:983:1: ( 'description' )
            // InternalXModel.g:984:2: 'description'
            {
             before(grammarAccess.getXClassAccess().getDescriptionKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getXClassAccess().getDescriptionKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_5__0__Impl"


    // $ANTLR start "rule__XClass__Group_5__1"
    // InternalXModel.g:993:1: rule__XClass__Group_5__1 : rule__XClass__Group_5__1__Impl ;
    public final void rule__XClass__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:997:1: ( rule__XClass__Group_5__1__Impl )
            // InternalXModel.g:998:2: rule__XClass__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XClass__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_5__1"


    // $ANTLR start "rule__XClass__Group_5__1__Impl"
    // InternalXModel.g:1004:1: rule__XClass__Group_5__1__Impl : ( ( rule__XClass__DescriptionAssignment_5_1 ) ) ;
    public final void rule__XClass__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1008:1: ( ( ( rule__XClass__DescriptionAssignment_5_1 ) ) )
            // InternalXModel.g:1009:1: ( ( rule__XClass__DescriptionAssignment_5_1 ) )
            {
            // InternalXModel.g:1009:1: ( ( rule__XClass__DescriptionAssignment_5_1 ) )
            // InternalXModel.g:1010:2: ( rule__XClass__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getXClassAccess().getDescriptionAssignment_5_1()); 
            // InternalXModel.g:1011:2: ( rule__XClass__DescriptionAssignment_5_1 )
            // InternalXModel.g:1011:3: rule__XClass__DescriptionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__XClass__DescriptionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getXClassAccess().getDescriptionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_5__1__Impl"


    // $ANTLR start "rule__XClass__Group_6__0"
    // InternalXModel.g:1020:1: rule__XClass__Group_6__0 : rule__XClass__Group_6__0__Impl rule__XClass__Group_6__1 ;
    public final void rule__XClass__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1024:1: ( rule__XClass__Group_6__0__Impl rule__XClass__Group_6__1 )
            // InternalXModel.g:1025:2: rule__XClass__Group_6__0__Impl rule__XClass__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__XClass__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XClass__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_6__0"


    // $ANTLR start "rule__XClass__Group_6__0__Impl"
    // InternalXModel.g:1032:1: rule__XClass__Group_6__0__Impl : ( 'extend' ) ;
    public final void rule__XClass__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1036:1: ( ( 'extend' ) )
            // InternalXModel.g:1037:1: ( 'extend' )
            {
            // InternalXModel.g:1037:1: ( 'extend' )
            // InternalXModel.g:1038:2: 'extend'
            {
             before(grammarAccess.getXClassAccess().getExtendKeyword_6_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getXClassAccess().getExtendKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_6__0__Impl"


    // $ANTLR start "rule__XClass__Group_6__1"
    // InternalXModel.g:1047:1: rule__XClass__Group_6__1 : rule__XClass__Group_6__1__Impl ;
    public final void rule__XClass__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1051:1: ( rule__XClass__Group_6__1__Impl )
            // InternalXModel.g:1052:2: rule__XClass__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XClass__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_6__1"


    // $ANTLR start "rule__XClass__Group_6__1__Impl"
    // InternalXModel.g:1058:1: rule__XClass__Group_6__1__Impl : ( ( rule__XClass__ExtendAssignment_6_1 ) ) ;
    public final void rule__XClass__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1062:1: ( ( ( rule__XClass__ExtendAssignment_6_1 ) ) )
            // InternalXModel.g:1063:1: ( ( rule__XClass__ExtendAssignment_6_1 ) )
            {
            // InternalXModel.g:1063:1: ( ( rule__XClass__ExtendAssignment_6_1 ) )
            // InternalXModel.g:1064:2: ( rule__XClass__ExtendAssignment_6_1 )
            {
             before(grammarAccess.getXClassAccess().getExtendAssignment_6_1()); 
            // InternalXModel.g:1065:2: ( rule__XClass__ExtendAssignment_6_1 )
            // InternalXModel.g:1065:3: rule__XClass__ExtendAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__XClass__ExtendAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getXClassAccess().getExtendAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_6__1__Impl"


    // $ANTLR start "rule__XClass__Group_7__0"
    // InternalXModel.g:1074:1: rule__XClass__Group_7__0 : rule__XClass__Group_7__0__Impl rule__XClass__Group_7__1 ;
    public final void rule__XClass__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1078:1: ( rule__XClass__Group_7__0__Impl rule__XClass__Group_7__1 )
            // InternalXModel.g:1079:2: rule__XClass__Group_7__0__Impl rule__XClass__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__XClass__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XClass__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_7__0"


    // $ANTLR start "rule__XClass__Group_7__0__Impl"
    // InternalXModel.g:1086:1: rule__XClass__Group_7__0__Impl : ( 'property' ) ;
    public final void rule__XClass__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1090:1: ( ( 'property' ) )
            // InternalXModel.g:1091:1: ( 'property' )
            {
            // InternalXModel.g:1091:1: ( 'property' )
            // InternalXModel.g:1092:2: 'property'
            {
             before(grammarAccess.getXClassAccess().getPropertyKeyword_7_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getXClassAccess().getPropertyKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_7__0__Impl"


    // $ANTLR start "rule__XClass__Group_7__1"
    // InternalXModel.g:1101:1: rule__XClass__Group_7__1 : rule__XClass__Group_7__1__Impl rule__XClass__Group_7__2 ;
    public final void rule__XClass__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1105:1: ( rule__XClass__Group_7__1__Impl rule__XClass__Group_7__2 )
            // InternalXModel.g:1106:2: rule__XClass__Group_7__1__Impl rule__XClass__Group_7__2
            {
            pushFollow(FOLLOW_11);
            rule__XClass__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XClass__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_7__1"


    // $ANTLR start "rule__XClass__Group_7__1__Impl"
    // InternalXModel.g:1113:1: rule__XClass__Group_7__1__Impl : ( '{' ) ;
    public final void rule__XClass__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1117:1: ( ( '{' ) )
            // InternalXModel.g:1118:1: ( '{' )
            {
            // InternalXModel.g:1118:1: ( '{' )
            // InternalXModel.g:1119:2: '{'
            {
             before(grammarAccess.getXClassAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getXClassAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_7__1__Impl"


    // $ANTLR start "rule__XClass__Group_7__2"
    // InternalXModel.g:1128:1: rule__XClass__Group_7__2 : rule__XClass__Group_7__2__Impl rule__XClass__Group_7__3 ;
    public final void rule__XClass__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1132:1: ( rule__XClass__Group_7__2__Impl rule__XClass__Group_7__3 )
            // InternalXModel.g:1133:2: rule__XClass__Group_7__2__Impl rule__XClass__Group_7__3
            {
            pushFollow(FOLLOW_8);
            rule__XClass__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XClass__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_7__2"


    // $ANTLR start "rule__XClass__Group_7__2__Impl"
    // InternalXModel.g:1140:1: rule__XClass__Group_7__2__Impl : ( ( rule__XClass__PropertyAssignment_7_2 ) ) ;
    public final void rule__XClass__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1144:1: ( ( ( rule__XClass__PropertyAssignment_7_2 ) ) )
            // InternalXModel.g:1145:1: ( ( rule__XClass__PropertyAssignment_7_2 ) )
            {
            // InternalXModel.g:1145:1: ( ( rule__XClass__PropertyAssignment_7_2 ) )
            // InternalXModel.g:1146:2: ( rule__XClass__PropertyAssignment_7_2 )
            {
             before(grammarAccess.getXClassAccess().getPropertyAssignment_7_2()); 
            // InternalXModel.g:1147:2: ( rule__XClass__PropertyAssignment_7_2 )
            // InternalXModel.g:1147:3: rule__XClass__PropertyAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__XClass__PropertyAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getXClassAccess().getPropertyAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_7__2__Impl"


    // $ANTLR start "rule__XClass__Group_7__3"
    // InternalXModel.g:1155:1: rule__XClass__Group_7__3 : rule__XClass__Group_7__3__Impl rule__XClass__Group_7__4 ;
    public final void rule__XClass__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1159:1: ( rule__XClass__Group_7__3__Impl rule__XClass__Group_7__4 )
            // InternalXModel.g:1160:2: rule__XClass__Group_7__3__Impl rule__XClass__Group_7__4
            {
            pushFollow(FOLLOW_8);
            rule__XClass__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XClass__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_7__3"


    // $ANTLR start "rule__XClass__Group_7__3__Impl"
    // InternalXModel.g:1167:1: rule__XClass__Group_7__3__Impl : ( ( rule__XClass__Group_7_3__0 )* ) ;
    public final void rule__XClass__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1171:1: ( ( ( rule__XClass__Group_7_3__0 )* ) )
            // InternalXModel.g:1172:1: ( ( rule__XClass__Group_7_3__0 )* )
            {
            // InternalXModel.g:1172:1: ( ( rule__XClass__Group_7_3__0 )* )
            // InternalXModel.g:1173:2: ( rule__XClass__Group_7_3__0 )*
            {
             before(grammarAccess.getXClassAccess().getGroup_7_3()); 
            // InternalXModel.g:1174:2: ( rule__XClass__Group_7_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalXModel.g:1174:3: rule__XClass__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__XClass__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getXClassAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_7__3__Impl"


    // $ANTLR start "rule__XClass__Group_7__4"
    // InternalXModel.g:1182:1: rule__XClass__Group_7__4 : rule__XClass__Group_7__4__Impl ;
    public final void rule__XClass__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1186:1: ( rule__XClass__Group_7__4__Impl )
            // InternalXModel.g:1187:2: rule__XClass__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XClass__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_7__4"


    // $ANTLR start "rule__XClass__Group_7__4__Impl"
    // InternalXModel.g:1193:1: rule__XClass__Group_7__4__Impl : ( '}' ) ;
    public final void rule__XClass__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1197:1: ( ( '}' ) )
            // InternalXModel.g:1198:1: ( '}' )
            {
            // InternalXModel.g:1198:1: ( '}' )
            // InternalXModel.g:1199:2: '}'
            {
             before(grammarAccess.getXClassAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getXClassAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_7__4__Impl"


    // $ANTLR start "rule__XClass__Group_7_3__0"
    // InternalXModel.g:1209:1: rule__XClass__Group_7_3__0 : rule__XClass__Group_7_3__0__Impl rule__XClass__Group_7_3__1 ;
    public final void rule__XClass__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1213:1: ( rule__XClass__Group_7_3__0__Impl rule__XClass__Group_7_3__1 )
            // InternalXModel.g:1214:2: rule__XClass__Group_7_3__0__Impl rule__XClass__Group_7_3__1
            {
            pushFollow(FOLLOW_11);
            rule__XClass__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XClass__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_7_3__0"


    // $ANTLR start "rule__XClass__Group_7_3__0__Impl"
    // InternalXModel.g:1221:1: rule__XClass__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__XClass__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1225:1: ( ( ',' ) )
            // InternalXModel.g:1226:1: ( ',' )
            {
            // InternalXModel.g:1226:1: ( ',' )
            // InternalXModel.g:1227:2: ','
            {
             before(grammarAccess.getXClassAccess().getCommaKeyword_7_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getXClassAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_7_3__0__Impl"


    // $ANTLR start "rule__XClass__Group_7_3__1"
    // InternalXModel.g:1236:1: rule__XClass__Group_7_3__1 : rule__XClass__Group_7_3__1__Impl ;
    public final void rule__XClass__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1240:1: ( rule__XClass__Group_7_3__1__Impl )
            // InternalXModel.g:1241:2: rule__XClass__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XClass__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_7_3__1"


    // $ANTLR start "rule__XClass__Group_7_3__1__Impl"
    // InternalXModel.g:1247:1: rule__XClass__Group_7_3__1__Impl : ( ( rule__XClass__PropertyAssignment_7_3_1 ) ) ;
    public final void rule__XClass__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1251:1: ( ( ( rule__XClass__PropertyAssignment_7_3_1 ) ) )
            // InternalXModel.g:1252:1: ( ( rule__XClass__PropertyAssignment_7_3_1 ) )
            {
            // InternalXModel.g:1252:1: ( ( rule__XClass__PropertyAssignment_7_3_1 ) )
            // InternalXModel.g:1253:2: ( rule__XClass__PropertyAssignment_7_3_1 )
            {
             before(grammarAccess.getXClassAccess().getPropertyAssignment_7_3_1()); 
            // InternalXModel.g:1254:2: ( rule__XClass__PropertyAssignment_7_3_1 )
            // InternalXModel.g:1254:3: rule__XClass__PropertyAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__XClass__PropertyAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getXClassAccess().getPropertyAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_7_3__1__Impl"


    // $ANTLR start "rule__XClass__Group_8__0"
    // InternalXModel.g:1263:1: rule__XClass__Group_8__0 : rule__XClass__Group_8__0__Impl rule__XClass__Group_8__1 ;
    public final void rule__XClass__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1267:1: ( rule__XClass__Group_8__0__Impl rule__XClass__Group_8__1 )
            // InternalXModel.g:1268:2: rule__XClass__Group_8__0__Impl rule__XClass__Group_8__1
            {
            pushFollow(FOLLOW_5);
            rule__XClass__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XClass__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_8__0"


    // $ANTLR start "rule__XClass__Group_8__0__Impl"
    // InternalXModel.g:1275:1: rule__XClass__Group_8__0__Impl : ( 'operation' ) ;
    public final void rule__XClass__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1279:1: ( ( 'operation' ) )
            // InternalXModel.g:1280:1: ( 'operation' )
            {
            // InternalXModel.g:1280:1: ( 'operation' )
            // InternalXModel.g:1281:2: 'operation'
            {
             before(grammarAccess.getXClassAccess().getOperationKeyword_8_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getXClassAccess().getOperationKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_8__0__Impl"


    // $ANTLR start "rule__XClass__Group_8__1"
    // InternalXModel.g:1290:1: rule__XClass__Group_8__1 : rule__XClass__Group_8__1__Impl rule__XClass__Group_8__2 ;
    public final void rule__XClass__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1294:1: ( rule__XClass__Group_8__1__Impl rule__XClass__Group_8__2 )
            // InternalXModel.g:1295:2: rule__XClass__Group_8__1__Impl rule__XClass__Group_8__2
            {
            pushFollow(FOLLOW_12);
            rule__XClass__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XClass__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_8__1"


    // $ANTLR start "rule__XClass__Group_8__1__Impl"
    // InternalXModel.g:1302:1: rule__XClass__Group_8__1__Impl : ( '{' ) ;
    public final void rule__XClass__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1306:1: ( ( '{' ) )
            // InternalXModel.g:1307:1: ( '{' )
            {
            // InternalXModel.g:1307:1: ( '{' )
            // InternalXModel.g:1308:2: '{'
            {
             before(grammarAccess.getXClassAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getXClassAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_8__1__Impl"


    // $ANTLR start "rule__XClass__Group_8__2"
    // InternalXModel.g:1317:1: rule__XClass__Group_8__2 : rule__XClass__Group_8__2__Impl rule__XClass__Group_8__3 ;
    public final void rule__XClass__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1321:1: ( rule__XClass__Group_8__2__Impl rule__XClass__Group_8__3 )
            // InternalXModel.g:1322:2: rule__XClass__Group_8__2__Impl rule__XClass__Group_8__3
            {
            pushFollow(FOLLOW_8);
            rule__XClass__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XClass__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_8__2"


    // $ANTLR start "rule__XClass__Group_8__2__Impl"
    // InternalXModel.g:1329:1: rule__XClass__Group_8__2__Impl : ( ( rule__XClass__OperationAssignment_8_2 ) ) ;
    public final void rule__XClass__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1333:1: ( ( ( rule__XClass__OperationAssignment_8_2 ) ) )
            // InternalXModel.g:1334:1: ( ( rule__XClass__OperationAssignment_8_2 ) )
            {
            // InternalXModel.g:1334:1: ( ( rule__XClass__OperationAssignment_8_2 ) )
            // InternalXModel.g:1335:2: ( rule__XClass__OperationAssignment_8_2 )
            {
             before(grammarAccess.getXClassAccess().getOperationAssignment_8_2()); 
            // InternalXModel.g:1336:2: ( rule__XClass__OperationAssignment_8_2 )
            // InternalXModel.g:1336:3: rule__XClass__OperationAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__XClass__OperationAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getXClassAccess().getOperationAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_8__2__Impl"


    // $ANTLR start "rule__XClass__Group_8__3"
    // InternalXModel.g:1344:1: rule__XClass__Group_8__3 : rule__XClass__Group_8__3__Impl rule__XClass__Group_8__4 ;
    public final void rule__XClass__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1348:1: ( rule__XClass__Group_8__3__Impl rule__XClass__Group_8__4 )
            // InternalXModel.g:1349:2: rule__XClass__Group_8__3__Impl rule__XClass__Group_8__4
            {
            pushFollow(FOLLOW_8);
            rule__XClass__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XClass__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_8__3"


    // $ANTLR start "rule__XClass__Group_8__3__Impl"
    // InternalXModel.g:1356:1: rule__XClass__Group_8__3__Impl : ( ( rule__XClass__Group_8_3__0 )* ) ;
    public final void rule__XClass__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1360:1: ( ( ( rule__XClass__Group_8_3__0 )* ) )
            // InternalXModel.g:1361:1: ( ( rule__XClass__Group_8_3__0 )* )
            {
            // InternalXModel.g:1361:1: ( ( rule__XClass__Group_8_3__0 )* )
            // InternalXModel.g:1362:2: ( rule__XClass__Group_8_3__0 )*
            {
             before(grammarAccess.getXClassAccess().getGroup_8_3()); 
            // InternalXModel.g:1363:2: ( rule__XClass__Group_8_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalXModel.g:1363:3: rule__XClass__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__XClass__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getXClassAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_8__3__Impl"


    // $ANTLR start "rule__XClass__Group_8__4"
    // InternalXModel.g:1371:1: rule__XClass__Group_8__4 : rule__XClass__Group_8__4__Impl ;
    public final void rule__XClass__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1375:1: ( rule__XClass__Group_8__4__Impl )
            // InternalXModel.g:1376:2: rule__XClass__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XClass__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_8__4"


    // $ANTLR start "rule__XClass__Group_8__4__Impl"
    // InternalXModel.g:1382:1: rule__XClass__Group_8__4__Impl : ( '}' ) ;
    public final void rule__XClass__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1386:1: ( ( '}' ) )
            // InternalXModel.g:1387:1: ( '}' )
            {
            // InternalXModel.g:1387:1: ( '}' )
            // InternalXModel.g:1388:2: '}'
            {
             before(grammarAccess.getXClassAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getXClassAccess().getRightCurlyBracketKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_8__4__Impl"


    // $ANTLR start "rule__XClass__Group_8_3__0"
    // InternalXModel.g:1398:1: rule__XClass__Group_8_3__0 : rule__XClass__Group_8_3__0__Impl rule__XClass__Group_8_3__1 ;
    public final void rule__XClass__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1402:1: ( rule__XClass__Group_8_3__0__Impl rule__XClass__Group_8_3__1 )
            // InternalXModel.g:1403:2: rule__XClass__Group_8_3__0__Impl rule__XClass__Group_8_3__1
            {
            pushFollow(FOLLOW_12);
            rule__XClass__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XClass__Group_8_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_8_3__0"


    // $ANTLR start "rule__XClass__Group_8_3__0__Impl"
    // InternalXModel.g:1410:1: rule__XClass__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__XClass__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1414:1: ( ( ',' ) )
            // InternalXModel.g:1415:1: ( ',' )
            {
            // InternalXModel.g:1415:1: ( ',' )
            // InternalXModel.g:1416:2: ','
            {
             before(grammarAccess.getXClassAccess().getCommaKeyword_8_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getXClassAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_8_3__0__Impl"


    // $ANTLR start "rule__XClass__Group_8_3__1"
    // InternalXModel.g:1425:1: rule__XClass__Group_8_3__1 : rule__XClass__Group_8_3__1__Impl ;
    public final void rule__XClass__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1429:1: ( rule__XClass__Group_8_3__1__Impl )
            // InternalXModel.g:1430:2: rule__XClass__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XClass__Group_8_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_8_3__1"


    // $ANTLR start "rule__XClass__Group_8_3__1__Impl"
    // InternalXModel.g:1436:1: rule__XClass__Group_8_3__1__Impl : ( ( rule__XClass__OperationAssignment_8_3_1 ) ) ;
    public final void rule__XClass__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1440:1: ( ( ( rule__XClass__OperationAssignment_8_3_1 ) ) )
            // InternalXModel.g:1441:1: ( ( rule__XClass__OperationAssignment_8_3_1 ) )
            {
            // InternalXModel.g:1441:1: ( ( rule__XClass__OperationAssignment_8_3_1 ) )
            // InternalXModel.g:1442:2: ( rule__XClass__OperationAssignment_8_3_1 )
            {
             before(grammarAccess.getXClassAccess().getOperationAssignment_8_3_1()); 
            // InternalXModel.g:1443:2: ( rule__XClass__OperationAssignment_8_3_1 )
            // InternalXModel.g:1443:3: rule__XClass__OperationAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__XClass__OperationAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getXClassAccess().getOperationAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__Group_8_3__1__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // InternalXModel.g:1452:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1456:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalXModel.g:1457:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // InternalXModel.g:1464:1: rule__Property__Group__0__Impl : ( () ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1468:1: ( ( () ) )
            // InternalXModel.g:1469:1: ( () )
            {
            // InternalXModel.g:1469:1: ( () )
            // InternalXModel.g:1470:2: ()
            {
             before(grammarAccess.getPropertyAccess().getPropertyAction_0()); 
            // InternalXModel.g:1471:2: ()
            // InternalXModel.g:1471:3: 
            {
            }

             after(grammarAccess.getPropertyAccess().getPropertyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // InternalXModel.g:1479:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1483:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // InternalXModel.g:1484:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // InternalXModel.g:1491:1: rule__Property__Group__1__Impl : ( 'Property' ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1495:1: ( ( 'Property' ) )
            // InternalXModel.g:1496:1: ( 'Property' )
            {
            // InternalXModel.g:1496:1: ( 'Property' )
            // InternalXModel.g:1497:2: 'Property'
            {
             before(grammarAccess.getPropertyAccess().getPropertyKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getPropertyKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // InternalXModel.g:1506:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1510:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // InternalXModel.g:1511:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Property__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // InternalXModel.g:1518:1: rule__Property__Group__2__Impl : ( ( rule__Property__NameAssignment_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1522:1: ( ( ( rule__Property__NameAssignment_2 ) ) )
            // InternalXModel.g:1523:1: ( ( rule__Property__NameAssignment_2 ) )
            {
            // InternalXModel.g:1523:1: ( ( rule__Property__NameAssignment_2 ) )
            // InternalXModel.g:1524:2: ( rule__Property__NameAssignment_2 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_2()); 
            // InternalXModel.g:1525:2: ( rule__Property__NameAssignment_2 )
            // InternalXModel.g:1525:3: rule__Property__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Property__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__Property__Group__3"
    // InternalXModel.g:1533:1: rule__Property__Group__3 : rule__Property__Group__3__Impl rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1537:1: ( rule__Property__Group__3__Impl rule__Property__Group__4 )
            // InternalXModel.g:1538:2: rule__Property__Group__3__Impl rule__Property__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Property__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3"


    // $ANTLR start "rule__Property__Group__3__Impl"
    // InternalXModel.g:1545:1: rule__Property__Group__3__Impl : ( '{' ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1549:1: ( ( '{' ) )
            // InternalXModel.g:1550:1: ( '{' )
            {
            // InternalXModel.g:1550:1: ( '{' )
            // InternalXModel.g:1551:2: '{'
            {
             before(grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3__Impl"


    // $ANTLR start "rule__Property__Group__4"
    // InternalXModel.g:1560:1: rule__Property__Group__4 : rule__Property__Group__4__Impl rule__Property__Group__5 ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1564:1: ( rule__Property__Group__4__Impl rule__Property__Group__5 )
            // InternalXModel.g:1565:2: rule__Property__Group__4__Impl rule__Property__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Property__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__4"


    // $ANTLR start "rule__Property__Group__4__Impl"
    // InternalXModel.g:1572:1: rule__Property__Group__4__Impl : ( ( rule__Property__Group_4__0 )? ) ;
    public final void rule__Property__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1576:1: ( ( ( rule__Property__Group_4__0 )? ) )
            // InternalXModel.g:1577:1: ( ( rule__Property__Group_4__0 )? )
            {
            // InternalXModel.g:1577:1: ( ( rule__Property__Group_4__0 )? )
            // InternalXModel.g:1578:2: ( rule__Property__Group_4__0 )?
            {
             before(grammarAccess.getPropertyAccess().getGroup_4()); 
            // InternalXModel.g:1579:2: ( rule__Property__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalXModel.g:1579:3: rule__Property__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Property__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__4__Impl"


    // $ANTLR start "rule__Property__Group__5"
    // InternalXModel.g:1587:1: rule__Property__Group__5 : rule__Property__Group__5__Impl rule__Property__Group__6 ;
    public final void rule__Property__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1591:1: ( rule__Property__Group__5__Impl rule__Property__Group__6 )
            // InternalXModel.g:1592:2: rule__Property__Group__5__Impl rule__Property__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Property__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__5"


    // $ANTLR start "rule__Property__Group__5__Impl"
    // InternalXModel.g:1599:1: rule__Property__Group__5__Impl : ( ( rule__Property__Group_5__0 )? ) ;
    public final void rule__Property__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1603:1: ( ( ( rule__Property__Group_5__0 )? ) )
            // InternalXModel.g:1604:1: ( ( rule__Property__Group_5__0 )? )
            {
            // InternalXModel.g:1604:1: ( ( rule__Property__Group_5__0 )? )
            // InternalXModel.g:1605:2: ( rule__Property__Group_5__0 )?
            {
             before(grammarAccess.getPropertyAccess().getGroup_5()); 
            // InternalXModel.g:1606:2: ( rule__Property__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalXModel.g:1606:3: rule__Property__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Property__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__5__Impl"


    // $ANTLR start "rule__Property__Group__6"
    // InternalXModel.g:1614:1: rule__Property__Group__6 : rule__Property__Group__6__Impl rule__Property__Group__7 ;
    public final void rule__Property__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1618:1: ( rule__Property__Group__6__Impl rule__Property__Group__7 )
            // InternalXModel.g:1619:2: rule__Property__Group__6__Impl rule__Property__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__Property__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__6"


    // $ANTLR start "rule__Property__Group__6__Impl"
    // InternalXModel.g:1626:1: rule__Property__Group__6__Impl : ( ( rule__Property__Group_6__0 )? ) ;
    public final void rule__Property__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1630:1: ( ( ( rule__Property__Group_6__0 )? ) )
            // InternalXModel.g:1631:1: ( ( rule__Property__Group_6__0 )? )
            {
            // InternalXModel.g:1631:1: ( ( rule__Property__Group_6__0 )? )
            // InternalXModel.g:1632:2: ( rule__Property__Group_6__0 )?
            {
             before(grammarAccess.getPropertyAccess().getGroup_6()); 
            // InternalXModel.g:1633:2: ( rule__Property__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalXModel.g:1633:3: rule__Property__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Property__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__6__Impl"


    // $ANTLR start "rule__Property__Group__7"
    // InternalXModel.g:1641:1: rule__Property__Group__7 : rule__Property__Group__7__Impl ;
    public final void rule__Property__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1645:1: ( rule__Property__Group__7__Impl )
            // InternalXModel.g:1646:2: rule__Property__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__7"


    // $ANTLR start "rule__Property__Group__7__Impl"
    // InternalXModel.g:1652:1: rule__Property__Group__7__Impl : ( '}' ) ;
    public final void rule__Property__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1656:1: ( ( '}' ) )
            // InternalXModel.g:1657:1: ( '}' )
            {
            // InternalXModel.g:1657:1: ( '}' )
            // InternalXModel.g:1658:2: '}'
            {
             before(grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__7__Impl"


    // $ANTLR start "rule__Property__Group_4__0"
    // InternalXModel.g:1668:1: rule__Property__Group_4__0 : rule__Property__Group_4__0__Impl rule__Property__Group_4__1 ;
    public final void rule__Property__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1672:1: ( rule__Property__Group_4__0__Impl rule__Property__Group_4__1 )
            // InternalXModel.g:1673:2: rule__Property__Group_4__0__Impl rule__Property__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Property__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4__0"


    // $ANTLR start "rule__Property__Group_4__0__Impl"
    // InternalXModel.g:1680:1: rule__Property__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__Property__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1684:1: ( ( 'description' ) )
            // InternalXModel.g:1685:1: ( 'description' )
            {
            // InternalXModel.g:1685:1: ( 'description' )
            // InternalXModel.g:1686:2: 'description'
            {
             before(grammarAccess.getPropertyAccess().getDescriptionKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getDescriptionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4__0__Impl"


    // $ANTLR start "rule__Property__Group_4__1"
    // InternalXModel.g:1695:1: rule__Property__Group_4__1 : rule__Property__Group_4__1__Impl ;
    public final void rule__Property__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1699:1: ( rule__Property__Group_4__1__Impl )
            // InternalXModel.g:1700:2: rule__Property__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4__1"


    // $ANTLR start "rule__Property__Group_4__1__Impl"
    // InternalXModel.g:1706:1: rule__Property__Group_4__1__Impl : ( ( rule__Property__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Property__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1710:1: ( ( ( rule__Property__DescriptionAssignment_4_1 ) ) )
            // InternalXModel.g:1711:1: ( ( rule__Property__DescriptionAssignment_4_1 ) )
            {
            // InternalXModel.g:1711:1: ( ( rule__Property__DescriptionAssignment_4_1 ) )
            // InternalXModel.g:1712:2: ( rule__Property__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getPropertyAccess().getDescriptionAssignment_4_1()); 
            // InternalXModel.g:1713:2: ( rule__Property__DescriptionAssignment_4_1 )
            // InternalXModel.g:1713:3: rule__Property__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Property__DescriptionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getDescriptionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4__1__Impl"


    // $ANTLR start "rule__Property__Group_5__0"
    // InternalXModel.g:1722:1: rule__Property__Group_5__0 : rule__Property__Group_5__0__Impl rule__Property__Group_5__1 ;
    public final void rule__Property__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1726:1: ( rule__Property__Group_5__0__Impl rule__Property__Group_5__1 )
            // InternalXModel.g:1727:2: rule__Property__Group_5__0__Impl rule__Property__Group_5__1
            {
            pushFollow(FOLLOW_14);
            rule__Property__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_5__0"


    // $ANTLR start "rule__Property__Group_5__0__Impl"
    // InternalXModel.g:1734:1: rule__Property__Group_5__0__Impl : ( 'visibility' ) ;
    public final void rule__Property__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1738:1: ( ( 'visibility' ) )
            // InternalXModel.g:1739:1: ( 'visibility' )
            {
            // InternalXModel.g:1739:1: ( 'visibility' )
            // InternalXModel.g:1740:2: 'visibility'
            {
             before(grammarAccess.getPropertyAccess().getVisibilityKeyword_5_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getVisibilityKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_5__0__Impl"


    // $ANTLR start "rule__Property__Group_5__1"
    // InternalXModel.g:1749:1: rule__Property__Group_5__1 : rule__Property__Group_5__1__Impl ;
    public final void rule__Property__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1753:1: ( rule__Property__Group_5__1__Impl )
            // InternalXModel.g:1754:2: rule__Property__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_5__1"


    // $ANTLR start "rule__Property__Group_5__1__Impl"
    // InternalXModel.g:1760:1: rule__Property__Group_5__1__Impl : ( ( rule__Property__VisibilityAssignment_5_1 ) ) ;
    public final void rule__Property__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1764:1: ( ( ( rule__Property__VisibilityAssignment_5_1 ) ) )
            // InternalXModel.g:1765:1: ( ( rule__Property__VisibilityAssignment_5_1 ) )
            {
            // InternalXModel.g:1765:1: ( ( rule__Property__VisibilityAssignment_5_1 ) )
            // InternalXModel.g:1766:2: ( rule__Property__VisibilityAssignment_5_1 )
            {
             before(grammarAccess.getPropertyAccess().getVisibilityAssignment_5_1()); 
            // InternalXModel.g:1767:2: ( rule__Property__VisibilityAssignment_5_1 )
            // InternalXModel.g:1767:3: rule__Property__VisibilityAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Property__VisibilityAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getVisibilityAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_5__1__Impl"


    // $ANTLR start "rule__Property__Group_6__0"
    // InternalXModel.g:1776:1: rule__Property__Group_6__0 : rule__Property__Group_6__0__Impl rule__Property__Group_6__1 ;
    public final void rule__Property__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1780:1: ( rule__Property__Group_6__0__Impl rule__Property__Group_6__1 )
            // InternalXModel.g:1781:2: rule__Property__Group_6__0__Impl rule__Property__Group_6__1
            {
            pushFollow(FOLLOW_15);
            rule__Property__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_6__0"


    // $ANTLR start "rule__Property__Group_6__0__Impl"
    // InternalXModel.g:1788:1: rule__Property__Group_6__0__Impl : ( 'xtype' ) ;
    public final void rule__Property__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1792:1: ( ( 'xtype' ) )
            // InternalXModel.g:1793:1: ( 'xtype' )
            {
            // InternalXModel.g:1793:1: ( 'xtype' )
            // InternalXModel.g:1794:2: 'xtype'
            {
             before(grammarAccess.getPropertyAccess().getXtypeKeyword_6_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getXtypeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_6__0__Impl"


    // $ANTLR start "rule__Property__Group_6__1"
    // InternalXModel.g:1803:1: rule__Property__Group_6__1 : rule__Property__Group_6__1__Impl ;
    public final void rule__Property__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1807:1: ( rule__Property__Group_6__1__Impl )
            // InternalXModel.g:1808:2: rule__Property__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_6__1"


    // $ANTLR start "rule__Property__Group_6__1__Impl"
    // InternalXModel.g:1814:1: rule__Property__Group_6__1__Impl : ( ( rule__Property__XtypeAssignment_6_1 ) ) ;
    public final void rule__Property__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1818:1: ( ( ( rule__Property__XtypeAssignment_6_1 ) ) )
            // InternalXModel.g:1819:1: ( ( rule__Property__XtypeAssignment_6_1 ) )
            {
            // InternalXModel.g:1819:1: ( ( rule__Property__XtypeAssignment_6_1 ) )
            // InternalXModel.g:1820:2: ( rule__Property__XtypeAssignment_6_1 )
            {
             before(grammarAccess.getPropertyAccess().getXtypeAssignment_6_1()); 
            // InternalXModel.g:1821:2: ( rule__Property__XtypeAssignment_6_1 )
            // InternalXModel.g:1821:3: rule__Property__XtypeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Property__XtypeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getXtypeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_6__1__Impl"


    // $ANTLR start "rule__Operation__Group__0"
    // InternalXModel.g:1830:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1834:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // InternalXModel.g:1835:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0"


    // $ANTLR start "rule__Operation__Group__0__Impl"
    // InternalXModel.g:1842:1: rule__Operation__Group__0__Impl : ( () ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1846:1: ( ( () ) )
            // InternalXModel.g:1847:1: ( () )
            {
            // InternalXModel.g:1847:1: ( () )
            // InternalXModel.g:1848:2: ()
            {
             before(grammarAccess.getOperationAccess().getOperationAction_0()); 
            // InternalXModel.g:1849:2: ()
            // InternalXModel.g:1849:3: 
            {
            }

             after(grammarAccess.getOperationAccess().getOperationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0__Impl"


    // $ANTLR start "rule__Operation__Group__1"
    // InternalXModel.g:1857:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1861:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // InternalXModel.g:1862:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1"


    // $ANTLR start "rule__Operation__Group__1__Impl"
    // InternalXModel.g:1869:1: rule__Operation__Group__1__Impl : ( 'Operation' ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1873:1: ( ( 'Operation' ) )
            // InternalXModel.g:1874:1: ( 'Operation' )
            {
            // InternalXModel.g:1874:1: ( 'Operation' )
            // InternalXModel.g:1875:2: 'Operation'
            {
             before(grammarAccess.getOperationAccess().getOperationKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getOperationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group__2"
    // InternalXModel.g:1884:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1888:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // InternalXModel.g:1889:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Operation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2"


    // $ANTLR start "rule__Operation__Group__2__Impl"
    // InternalXModel.g:1896:1: rule__Operation__Group__2__Impl : ( ( rule__Operation__NameAssignment_2 ) ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1900:1: ( ( ( rule__Operation__NameAssignment_2 ) ) )
            // InternalXModel.g:1901:1: ( ( rule__Operation__NameAssignment_2 ) )
            {
            // InternalXModel.g:1901:1: ( ( rule__Operation__NameAssignment_2 ) )
            // InternalXModel.g:1902:2: ( rule__Operation__NameAssignment_2 )
            {
             before(grammarAccess.getOperationAccess().getNameAssignment_2()); 
            // InternalXModel.g:1903:2: ( rule__Operation__NameAssignment_2 )
            // InternalXModel.g:1903:3: rule__Operation__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Operation__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2__Impl"


    // $ANTLR start "rule__Operation__Group__3"
    // InternalXModel.g:1911:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1915:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // InternalXModel.g:1916:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Operation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3"


    // $ANTLR start "rule__Operation__Group__3__Impl"
    // InternalXModel.g:1923:1: rule__Operation__Group__3__Impl : ( '{' ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1927:1: ( ( '{' ) )
            // InternalXModel.g:1928:1: ( '{' )
            {
            // InternalXModel.g:1928:1: ( '{' )
            // InternalXModel.g:1929:2: '{'
            {
             before(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3__Impl"


    // $ANTLR start "rule__Operation__Group__4"
    // InternalXModel.g:1938:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1942:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // InternalXModel.g:1943:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Operation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4"


    // $ANTLR start "rule__Operation__Group__4__Impl"
    // InternalXModel.g:1950:1: rule__Operation__Group__4__Impl : ( ( rule__Operation__Group_4__0 )? ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1954:1: ( ( ( rule__Operation__Group_4__0 )? ) )
            // InternalXModel.g:1955:1: ( ( rule__Operation__Group_4__0 )? )
            {
            // InternalXModel.g:1955:1: ( ( rule__Operation__Group_4__0 )? )
            // InternalXModel.g:1956:2: ( rule__Operation__Group_4__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_4()); 
            // InternalXModel.g:1957:2: ( rule__Operation__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXModel.g:1957:3: rule__Operation__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4__Impl"


    // $ANTLR start "rule__Operation__Group__5"
    // InternalXModel.g:1965:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl rule__Operation__Group__6 ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1969:1: ( rule__Operation__Group__5__Impl rule__Operation__Group__6 )
            // InternalXModel.g:1970:2: rule__Operation__Group__5__Impl rule__Operation__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Operation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__5"


    // $ANTLR start "rule__Operation__Group__5__Impl"
    // InternalXModel.g:1977:1: rule__Operation__Group__5__Impl : ( ( rule__Operation__Group_5__0 )? ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1981:1: ( ( ( rule__Operation__Group_5__0 )? ) )
            // InternalXModel.g:1982:1: ( ( rule__Operation__Group_5__0 )? )
            {
            // InternalXModel.g:1982:1: ( ( rule__Operation__Group_5__0 )? )
            // InternalXModel.g:1983:2: ( rule__Operation__Group_5__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_5()); 
            // InternalXModel.g:1984:2: ( rule__Operation__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXModel.g:1984:3: rule__Operation__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__5__Impl"


    // $ANTLR start "rule__Operation__Group__6"
    // InternalXModel.g:1992:1: rule__Operation__Group__6 : rule__Operation__Group__6__Impl rule__Operation__Group__7 ;
    public final void rule__Operation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:1996:1: ( rule__Operation__Group__6__Impl rule__Operation__Group__7 )
            // InternalXModel.g:1997:2: rule__Operation__Group__6__Impl rule__Operation__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Operation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__6"


    // $ANTLR start "rule__Operation__Group__6__Impl"
    // InternalXModel.g:2004:1: rule__Operation__Group__6__Impl : ( ( rule__Operation__Group_6__0 )? ) ;
    public final void rule__Operation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2008:1: ( ( ( rule__Operation__Group_6__0 )? ) )
            // InternalXModel.g:2009:1: ( ( rule__Operation__Group_6__0 )? )
            {
            // InternalXModel.g:2009:1: ( ( rule__Operation__Group_6__0 )? )
            // InternalXModel.g:2010:2: ( rule__Operation__Group_6__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_6()); 
            // InternalXModel.g:2011:2: ( rule__Operation__Group_6__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalXModel.g:2011:3: rule__Operation__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__6__Impl"


    // $ANTLR start "rule__Operation__Group__7"
    // InternalXModel.g:2019:1: rule__Operation__Group__7 : rule__Operation__Group__7__Impl rule__Operation__Group__8 ;
    public final void rule__Operation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2023:1: ( rule__Operation__Group__7__Impl rule__Operation__Group__8 )
            // InternalXModel.g:2024:2: rule__Operation__Group__7__Impl rule__Operation__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__Operation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__7"


    // $ANTLR start "rule__Operation__Group__7__Impl"
    // InternalXModel.g:2031:1: rule__Operation__Group__7__Impl : ( ( rule__Operation__Group_7__0 )? ) ;
    public final void rule__Operation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2035:1: ( ( ( rule__Operation__Group_7__0 )? ) )
            // InternalXModel.g:2036:1: ( ( rule__Operation__Group_7__0 )? )
            {
            // InternalXModel.g:2036:1: ( ( rule__Operation__Group_7__0 )? )
            // InternalXModel.g:2037:2: ( rule__Operation__Group_7__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_7()); 
            // InternalXModel.g:2038:2: ( rule__Operation__Group_7__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalXModel.g:2038:3: rule__Operation__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__7__Impl"


    // $ANTLR start "rule__Operation__Group__8"
    // InternalXModel.g:2046:1: rule__Operation__Group__8 : rule__Operation__Group__8__Impl ;
    public final void rule__Operation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2050:1: ( rule__Operation__Group__8__Impl )
            // InternalXModel.g:2051:2: rule__Operation__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__8"


    // $ANTLR start "rule__Operation__Group__8__Impl"
    // InternalXModel.g:2057:1: rule__Operation__Group__8__Impl : ( '}' ) ;
    public final void rule__Operation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2061:1: ( ( '}' ) )
            // InternalXModel.g:2062:1: ( '}' )
            {
            // InternalXModel.g:2062:1: ( '}' )
            // InternalXModel.g:2063:2: '}'
            {
             before(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__8__Impl"


    // $ANTLR start "rule__Operation__Group_4__0"
    // InternalXModel.g:2073:1: rule__Operation__Group_4__0 : rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 ;
    public final void rule__Operation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2077:1: ( rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 )
            // InternalXModel.g:2078:2: rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Operation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__0"


    // $ANTLR start "rule__Operation__Group_4__0__Impl"
    // InternalXModel.g:2085:1: rule__Operation__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__Operation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2089:1: ( ( 'description' ) )
            // InternalXModel.g:2090:1: ( 'description' )
            {
            // InternalXModel.g:2090:1: ( 'description' )
            // InternalXModel.g:2091:2: 'description'
            {
             before(grammarAccess.getOperationAccess().getDescriptionKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getDescriptionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__0__Impl"


    // $ANTLR start "rule__Operation__Group_4__1"
    // InternalXModel.g:2100:1: rule__Operation__Group_4__1 : rule__Operation__Group_4__1__Impl ;
    public final void rule__Operation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2104:1: ( rule__Operation__Group_4__1__Impl )
            // InternalXModel.g:2105:2: rule__Operation__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__1"


    // $ANTLR start "rule__Operation__Group_4__1__Impl"
    // InternalXModel.g:2111:1: rule__Operation__Group_4__1__Impl : ( ( rule__Operation__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Operation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2115:1: ( ( ( rule__Operation__DescriptionAssignment_4_1 ) ) )
            // InternalXModel.g:2116:1: ( ( rule__Operation__DescriptionAssignment_4_1 ) )
            {
            // InternalXModel.g:2116:1: ( ( rule__Operation__DescriptionAssignment_4_1 ) )
            // InternalXModel.g:2117:2: ( rule__Operation__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getOperationAccess().getDescriptionAssignment_4_1()); 
            // InternalXModel.g:2118:2: ( rule__Operation__DescriptionAssignment_4_1 )
            // InternalXModel.g:2118:3: rule__Operation__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Operation__DescriptionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getDescriptionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__1__Impl"


    // $ANTLR start "rule__Operation__Group_5__0"
    // InternalXModel.g:2127:1: rule__Operation__Group_5__0 : rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1 ;
    public final void rule__Operation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2131:1: ( rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1 )
            // InternalXModel.g:2132:2: rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1
            {
            pushFollow(FOLLOW_14);
            rule__Operation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_5__0"


    // $ANTLR start "rule__Operation__Group_5__0__Impl"
    // InternalXModel.g:2139:1: rule__Operation__Group_5__0__Impl : ( 'visibility' ) ;
    public final void rule__Operation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2143:1: ( ( 'visibility' ) )
            // InternalXModel.g:2144:1: ( 'visibility' )
            {
            // InternalXModel.g:2144:1: ( 'visibility' )
            // InternalXModel.g:2145:2: 'visibility'
            {
             before(grammarAccess.getOperationAccess().getVisibilityKeyword_5_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getVisibilityKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_5__0__Impl"


    // $ANTLR start "rule__Operation__Group_5__1"
    // InternalXModel.g:2154:1: rule__Operation__Group_5__1 : rule__Operation__Group_5__1__Impl ;
    public final void rule__Operation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2158:1: ( rule__Operation__Group_5__1__Impl )
            // InternalXModel.g:2159:2: rule__Operation__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_5__1"


    // $ANTLR start "rule__Operation__Group_5__1__Impl"
    // InternalXModel.g:2165:1: rule__Operation__Group_5__1__Impl : ( ( rule__Operation__VisibilityAssignment_5_1 ) ) ;
    public final void rule__Operation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2169:1: ( ( ( rule__Operation__VisibilityAssignment_5_1 ) ) )
            // InternalXModel.g:2170:1: ( ( rule__Operation__VisibilityAssignment_5_1 ) )
            {
            // InternalXModel.g:2170:1: ( ( rule__Operation__VisibilityAssignment_5_1 ) )
            // InternalXModel.g:2171:2: ( rule__Operation__VisibilityAssignment_5_1 )
            {
             before(grammarAccess.getOperationAccess().getVisibilityAssignment_5_1()); 
            // InternalXModel.g:2172:2: ( rule__Operation__VisibilityAssignment_5_1 )
            // InternalXModel.g:2172:3: rule__Operation__VisibilityAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Operation__VisibilityAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getVisibilityAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_5__1__Impl"


    // $ANTLR start "rule__Operation__Group_6__0"
    // InternalXModel.g:2181:1: rule__Operation__Group_6__0 : rule__Operation__Group_6__0__Impl rule__Operation__Group_6__1 ;
    public final void rule__Operation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2185:1: ( rule__Operation__Group_6__0__Impl rule__Operation__Group_6__1 )
            // InternalXModel.g:2186:2: rule__Operation__Group_6__0__Impl rule__Operation__Group_6__1
            {
            pushFollow(FOLLOW_15);
            rule__Operation__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_6__0"


    // $ANTLR start "rule__Operation__Group_6__0__Impl"
    // InternalXModel.g:2193:1: rule__Operation__Group_6__0__Impl : ( 'xtype' ) ;
    public final void rule__Operation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2197:1: ( ( 'xtype' ) )
            // InternalXModel.g:2198:1: ( 'xtype' )
            {
            // InternalXModel.g:2198:1: ( 'xtype' )
            // InternalXModel.g:2199:2: 'xtype'
            {
             before(grammarAccess.getOperationAccess().getXtypeKeyword_6_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getXtypeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_6__0__Impl"


    // $ANTLR start "rule__Operation__Group_6__1"
    // InternalXModel.g:2208:1: rule__Operation__Group_6__1 : rule__Operation__Group_6__1__Impl ;
    public final void rule__Operation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2212:1: ( rule__Operation__Group_6__1__Impl )
            // InternalXModel.g:2213:2: rule__Operation__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_6__1"


    // $ANTLR start "rule__Operation__Group_6__1__Impl"
    // InternalXModel.g:2219:1: rule__Operation__Group_6__1__Impl : ( ( rule__Operation__XtypeAssignment_6_1 ) ) ;
    public final void rule__Operation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2223:1: ( ( ( rule__Operation__XtypeAssignment_6_1 ) ) )
            // InternalXModel.g:2224:1: ( ( rule__Operation__XtypeAssignment_6_1 ) )
            {
            // InternalXModel.g:2224:1: ( ( rule__Operation__XtypeAssignment_6_1 ) )
            // InternalXModel.g:2225:2: ( rule__Operation__XtypeAssignment_6_1 )
            {
             before(grammarAccess.getOperationAccess().getXtypeAssignment_6_1()); 
            // InternalXModel.g:2226:2: ( rule__Operation__XtypeAssignment_6_1 )
            // InternalXModel.g:2226:3: rule__Operation__XtypeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Operation__XtypeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getXtypeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_6__1__Impl"


    // $ANTLR start "rule__Operation__Group_7__0"
    // InternalXModel.g:2235:1: rule__Operation__Group_7__0 : rule__Operation__Group_7__0__Impl rule__Operation__Group_7__1 ;
    public final void rule__Operation__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2239:1: ( rule__Operation__Group_7__0__Impl rule__Operation__Group_7__1 )
            // InternalXModel.g:2240:2: rule__Operation__Group_7__0__Impl rule__Operation__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__Operation__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_7__0"


    // $ANTLR start "rule__Operation__Group_7__0__Impl"
    // InternalXModel.g:2247:1: rule__Operation__Group_7__0__Impl : ( 'parameter' ) ;
    public final void rule__Operation__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2251:1: ( ( 'parameter' ) )
            // InternalXModel.g:2252:1: ( 'parameter' )
            {
            // InternalXModel.g:2252:1: ( 'parameter' )
            // InternalXModel.g:2253:2: 'parameter'
            {
             before(grammarAccess.getOperationAccess().getParameterKeyword_7_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getParameterKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_7__0__Impl"


    // $ANTLR start "rule__Operation__Group_7__1"
    // InternalXModel.g:2262:1: rule__Operation__Group_7__1 : rule__Operation__Group_7__1__Impl rule__Operation__Group_7__2 ;
    public final void rule__Operation__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2266:1: ( rule__Operation__Group_7__1__Impl rule__Operation__Group_7__2 )
            // InternalXModel.g:2267:2: rule__Operation__Group_7__1__Impl rule__Operation__Group_7__2
            {
            pushFollow(FOLLOW_17);
            rule__Operation__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_7__1"


    // $ANTLR start "rule__Operation__Group_7__1__Impl"
    // InternalXModel.g:2274:1: rule__Operation__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Operation__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2278:1: ( ( '{' ) )
            // InternalXModel.g:2279:1: ( '{' )
            {
            // InternalXModel.g:2279:1: ( '{' )
            // InternalXModel.g:2280:2: '{'
            {
             before(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_7__1__Impl"


    // $ANTLR start "rule__Operation__Group_7__2"
    // InternalXModel.g:2289:1: rule__Operation__Group_7__2 : rule__Operation__Group_7__2__Impl rule__Operation__Group_7__3 ;
    public final void rule__Operation__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2293:1: ( rule__Operation__Group_7__2__Impl rule__Operation__Group_7__3 )
            // InternalXModel.g:2294:2: rule__Operation__Group_7__2__Impl rule__Operation__Group_7__3
            {
            pushFollow(FOLLOW_8);
            rule__Operation__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_7__2"


    // $ANTLR start "rule__Operation__Group_7__2__Impl"
    // InternalXModel.g:2301:1: rule__Operation__Group_7__2__Impl : ( ( rule__Operation__ParameterAssignment_7_2 ) ) ;
    public final void rule__Operation__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2305:1: ( ( ( rule__Operation__ParameterAssignment_7_2 ) ) )
            // InternalXModel.g:2306:1: ( ( rule__Operation__ParameterAssignment_7_2 ) )
            {
            // InternalXModel.g:2306:1: ( ( rule__Operation__ParameterAssignment_7_2 ) )
            // InternalXModel.g:2307:2: ( rule__Operation__ParameterAssignment_7_2 )
            {
             before(grammarAccess.getOperationAccess().getParameterAssignment_7_2()); 
            // InternalXModel.g:2308:2: ( rule__Operation__ParameterAssignment_7_2 )
            // InternalXModel.g:2308:3: rule__Operation__ParameterAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Operation__ParameterAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getParameterAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_7__2__Impl"


    // $ANTLR start "rule__Operation__Group_7__3"
    // InternalXModel.g:2316:1: rule__Operation__Group_7__3 : rule__Operation__Group_7__3__Impl rule__Operation__Group_7__4 ;
    public final void rule__Operation__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2320:1: ( rule__Operation__Group_7__3__Impl rule__Operation__Group_7__4 )
            // InternalXModel.g:2321:2: rule__Operation__Group_7__3__Impl rule__Operation__Group_7__4
            {
            pushFollow(FOLLOW_8);
            rule__Operation__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_7__3"


    // $ANTLR start "rule__Operation__Group_7__3__Impl"
    // InternalXModel.g:2328:1: rule__Operation__Group_7__3__Impl : ( ( rule__Operation__Group_7_3__0 )* ) ;
    public final void rule__Operation__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2332:1: ( ( ( rule__Operation__Group_7_3__0 )* ) )
            // InternalXModel.g:2333:1: ( ( rule__Operation__Group_7_3__0 )* )
            {
            // InternalXModel.g:2333:1: ( ( rule__Operation__Group_7_3__0 )* )
            // InternalXModel.g:2334:2: ( rule__Operation__Group_7_3__0 )*
            {
             before(grammarAccess.getOperationAccess().getGroup_7_3()); 
            // InternalXModel.g:2335:2: ( rule__Operation__Group_7_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==27) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalXModel.g:2335:3: rule__Operation__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Operation__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getOperationAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_7__3__Impl"


    // $ANTLR start "rule__Operation__Group_7__4"
    // InternalXModel.g:2343:1: rule__Operation__Group_7__4 : rule__Operation__Group_7__4__Impl ;
    public final void rule__Operation__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2347:1: ( rule__Operation__Group_7__4__Impl )
            // InternalXModel.g:2348:2: rule__Operation__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_7__4"


    // $ANTLR start "rule__Operation__Group_7__4__Impl"
    // InternalXModel.g:2354:1: rule__Operation__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Operation__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2358:1: ( ( '}' ) )
            // InternalXModel.g:2359:1: ( '}' )
            {
            // InternalXModel.g:2359:1: ( '}' )
            // InternalXModel.g:2360:2: '}'
            {
             before(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_7__4__Impl"


    // $ANTLR start "rule__Operation__Group_7_3__0"
    // InternalXModel.g:2370:1: rule__Operation__Group_7_3__0 : rule__Operation__Group_7_3__0__Impl rule__Operation__Group_7_3__1 ;
    public final void rule__Operation__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2374:1: ( rule__Operation__Group_7_3__0__Impl rule__Operation__Group_7_3__1 )
            // InternalXModel.g:2375:2: rule__Operation__Group_7_3__0__Impl rule__Operation__Group_7_3__1
            {
            pushFollow(FOLLOW_17);
            rule__Operation__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_7_3__0"


    // $ANTLR start "rule__Operation__Group_7_3__0__Impl"
    // InternalXModel.g:2382:1: rule__Operation__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Operation__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2386:1: ( ( ',' ) )
            // InternalXModel.g:2387:1: ( ',' )
            {
            // InternalXModel.g:2387:1: ( ',' )
            // InternalXModel.g:2388:2: ','
            {
             before(grammarAccess.getOperationAccess().getCommaKeyword_7_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_7_3__0__Impl"


    // $ANTLR start "rule__Operation__Group_7_3__1"
    // InternalXModel.g:2397:1: rule__Operation__Group_7_3__1 : rule__Operation__Group_7_3__1__Impl ;
    public final void rule__Operation__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2401:1: ( rule__Operation__Group_7_3__1__Impl )
            // InternalXModel.g:2402:2: rule__Operation__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_7_3__1"


    // $ANTLR start "rule__Operation__Group_7_3__1__Impl"
    // InternalXModel.g:2408:1: rule__Operation__Group_7_3__1__Impl : ( ( rule__Operation__ParameterAssignment_7_3_1 ) ) ;
    public final void rule__Operation__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2412:1: ( ( ( rule__Operation__ParameterAssignment_7_3_1 ) ) )
            // InternalXModel.g:2413:1: ( ( rule__Operation__ParameterAssignment_7_3_1 ) )
            {
            // InternalXModel.g:2413:1: ( ( rule__Operation__ParameterAssignment_7_3_1 ) )
            // InternalXModel.g:2414:2: ( rule__Operation__ParameterAssignment_7_3_1 )
            {
             before(grammarAccess.getOperationAccess().getParameterAssignment_7_3_1()); 
            // InternalXModel.g:2415:2: ( rule__Operation__ParameterAssignment_7_3_1 )
            // InternalXModel.g:2415:3: rule__Operation__ParameterAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Operation__ParameterAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getParameterAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_7_3__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalXModel.g:2424:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2428:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalXModel.g:2429:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalXModel.g:2436:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2440:1: ( ( () ) )
            // InternalXModel.g:2441:1: ( () )
            {
            // InternalXModel.g:2441:1: ( () )
            // InternalXModel.g:2442:2: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // InternalXModel.g:2443:2: ()
            // InternalXModel.g:2443:3: 
            {
            }

             after(grammarAccess.getParameterAccess().getParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalXModel.g:2451:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2455:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalXModel.g:2456:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalXModel.g:2463:1: rule__Parameter__Group__1__Impl : ( 'Parameter' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2467:1: ( ( 'Parameter' ) )
            // InternalXModel.g:2468:1: ( 'Parameter' )
            {
            // InternalXModel.g:2468:1: ( 'Parameter' )
            // InternalXModel.g:2469:2: 'Parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getParameterKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalXModel.g:2478:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2482:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalXModel.g:2483:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalXModel.g:2490:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__NameAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2494:1: ( ( ( rule__Parameter__NameAssignment_2 ) ) )
            // InternalXModel.g:2495:1: ( ( rule__Parameter__NameAssignment_2 ) )
            {
            // InternalXModel.g:2495:1: ( ( rule__Parameter__NameAssignment_2 ) )
            // InternalXModel.g:2496:2: ( rule__Parameter__NameAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_2()); 
            // InternalXModel.g:2497:2: ( rule__Parameter__NameAssignment_2 )
            // InternalXModel.g:2497:3: rule__Parameter__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // InternalXModel.g:2505:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2509:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // InternalXModel.g:2510:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Parameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // InternalXModel.g:2517:1: rule__Parameter__Group__3__Impl : ( '{' ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2521:1: ( ( '{' ) )
            // InternalXModel.g:2522:1: ( '{' )
            {
            // InternalXModel.g:2522:1: ( '{' )
            // InternalXModel.g:2523:2: '{'
            {
             before(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Parameter__Group__4"
    // InternalXModel.g:2532:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl rule__Parameter__Group__5 ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2536:1: ( rule__Parameter__Group__4__Impl rule__Parameter__Group__5 )
            // InternalXModel.g:2537:2: rule__Parameter__Group__4__Impl rule__Parameter__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Parameter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__4"


    // $ANTLR start "rule__Parameter__Group__4__Impl"
    // InternalXModel.g:2544:1: rule__Parameter__Group__4__Impl : ( ( rule__Parameter__Group_4__0 )? ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2548:1: ( ( ( rule__Parameter__Group_4__0 )? ) )
            // InternalXModel.g:2549:1: ( ( rule__Parameter__Group_4__0 )? )
            {
            // InternalXModel.g:2549:1: ( ( rule__Parameter__Group_4__0 )? )
            // InternalXModel.g:2550:2: ( rule__Parameter__Group_4__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_4()); 
            // InternalXModel.g:2551:2: ( rule__Parameter__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalXModel.g:2551:3: rule__Parameter__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__4__Impl"


    // $ANTLR start "rule__Parameter__Group__5"
    // InternalXModel.g:2559:1: rule__Parameter__Group__5 : rule__Parameter__Group__5__Impl ;
    public final void rule__Parameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2563:1: ( rule__Parameter__Group__5__Impl )
            // InternalXModel.g:2564:2: rule__Parameter__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__5"


    // $ANTLR start "rule__Parameter__Group__5__Impl"
    // InternalXModel.g:2570:1: rule__Parameter__Group__5__Impl : ( '}' ) ;
    public final void rule__Parameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2574:1: ( ( '}' ) )
            // InternalXModel.g:2575:1: ( '}' )
            {
            // InternalXModel.g:2575:1: ( '}' )
            // InternalXModel.g:2576:2: '}'
            {
             before(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__5__Impl"


    // $ANTLR start "rule__Parameter__Group_4__0"
    // InternalXModel.g:2586:1: rule__Parameter__Group_4__0 : rule__Parameter__Group_4__0__Impl rule__Parameter__Group_4__1 ;
    public final void rule__Parameter__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2590:1: ( rule__Parameter__Group_4__0__Impl rule__Parameter__Group_4__1 )
            // InternalXModel.g:2591:2: rule__Parameter__Group_4__0__Impl rule__Parameter__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__Parameter__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_4__0"


    // $ANTLR start "rule__Parameter__Group_4__0__Impl"
    // InternalXModel.g:2598:1: rule__Parameter__Group_4__0__Impl : ( 'xtype' ) ;
    public final void rule__Parameter__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2602:1: ( ( 'xtype' ) )
            // InternalXModel.g:2603:1: ( 'xtype' )
            {
            // InternalXModel.g:2603:1: ( 'xtype' )
            // InternalXModel.g:2604:2: 'xtype'
            {
             before(grammarAccess.getParameterAccess().getXtypeKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getXtypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_4__0__Impl"


    // $ANTLR start "rule__Parameter__Group_4__1"
    // InternalXModel.g:2613:1: rule__Parameter__Group_4__1 : rule__Parameter__Group_4__1__Impl ;
    public final void rule__Parameter__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2617:1: ( rule__Parameter__Group_4__1__Impl )
            // InternalXModel.g:2618:2: rule__Parameter__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_4__1"


    // $ANTLR start "rule__Parameter__Group_4__1__Impl"
    // InternalXModel.g:2624:1: rule__Parameter__Group_4__1__Impl : ( ( rule__Parameter__XtypeAssignment_4_1 ) ) ;
    public final void rule__Parameter__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2628:1: ( ( ( rule__Parameter__XtypeAssignment_4_1 ) ) )
            // InternalXModel.g:2629:1: ( ( rule__Parameter__XtypeAssignment_4_1 ) )
            {
            // InternalXModel.g:2629:1: ( ( rule__Parameter__XtypeAssignment_4_1 ) )
            // InternalXModel.g:2630:2: ( rule__Parameter__XtypeAssignment_4_1 )
            {
             before(grammarAccess.getParameterAccess().getXtypeAssignment_4_1()); 
            // InternalXModel.g:2631:2: ( rule__Parameter__XtypeAssignment_4_1 )
            // InternalXModel.g:2631:3: rule__Parameter__XtypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__XtypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getXtypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_4__1__Impl"


    // $ANTLR start "rule__Package__NameAssignment_2"
    // InternalXModel.g:2640:1: rule__Package__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Package__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2644:1: ( ( ruleEString ) )
            // InternalXModel.g:2645:2: ( ruleEString )
            {
            // InternalXModel.g:2645:2: ( ruleEString )
            // InternalXModel.g:2646:3: ruleEString
            {
             before(grammarAccess.getPackageAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__NameAssignment_2"


    // $ANTLR start "rule__Package__ClassAssignment_4_2"
    // InternalXModel.g:2655:1: rule__Package__ClassAssignment_4_2 : ( ruleXClass ) ;
    public final void rule__Package__ClassAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2659:1: ( ( ruleXClass ) )
            // InternalXModel.g:2660:2: ( ruleXClass )
            {
            // InternalXModel.g:2660:2: ( ruleXClass )
            // InternalXModel.g:2661:3: ruleXClass
            {
             before(grammarAccess.getPackageAccess().getClassXClassParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXClass();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getClassXClassParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__ClassAssignment_4_2"


    // $ANTLR start "rule__Package__ClassAssignment_4_3_1"
    // InternalXModel.g:2670:1: rule__Package__ClassAssignment_4_3_1 : ( ruleXClass ) ;
    public final void rule__Package__ClassAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2674:1: ( ( ruleXClass ) )
            // InternalXModel.g:2675:2: ( ruleXClass )
            {
            // InternalXModel.g:2675:2: ( ruleXClass )
            // InternalXModel.g:2676:3: ruleXClass
            {
             before(grammarAccess.getPackageAccess().getClassXClassParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXClass();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getClassXClassParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__ClassAssignment_4_3_1"


    // $ANTLR start "rule__XClass__IsAbstractAssignment_1"
    // InternalXModel.g:2685:1: rule__XClass__IsAbstractAssignment_1 : ( ( 'isAbstract' ) ) ;
    public final void rule__XClass__IsAbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2689:1: ( ( ( 'isAbstract' ) ) )
            // InternalXModel.g:2690:2: ( ( 'isAbstract' ) )
            {
            // InternalXModel.g:2690:2: ( ( 'isAbstract' ) )
            // InternalXModel.g:2691:3: ( 'isAbstract' )
            {
             before(grammarAccess.getXClassAccess().getIsAbstractIsAbstractKeyword_1_0()); 
            // InternalXModel.g:2692:3: ( 'isAbstract' )
            // InternalXModel.g:2693:4: 'isAbstract'
            {
             before(grammarAccess.getXClassAccess().getIsAbstractIsAbstractKeyword_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getXClassAccess().getIsAbstractIsAbstractKeyword_1_0()); 

            }

             after(grammarAccess.getXClassAccess().getIsAbstractIsAbstractKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__IsAbstractAssignment_1"


    // $ANTLR start "rule__XClass__NameAssignment_3"
    // InternalXModel.g:2704:1: rule__XClass__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__XClass__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2708:1: ( ( ruleEString ) )
            // InternalXModel.g:2709:2: ( ruleEString )
            {
            // InternalXModel.g:2709:2: ( ruleEString )
            // InternalXModel.g:2710:3: ruleEString
            {
             before(grammarAccess.getXClassAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getXClassAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__NameAssignment_3"


    // $ANTLR start "rule__XClass__DescriptionAssignment_5_1"
    // InternalXModel.g:2719:1: rule__XClass__DescriptionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__XClass__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2723:1: ( ( ruleEString ) )
            // InternalXModel.g:2724:2: ( ruleEString )
            {
            // InternalXModel.g:2724:2: ( ruleEString )
            // InternalXModel.g:2725:3: ruleEString
            {
             before(grammarAccess.getXClassAccess().getDescriptionEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getXClassAccess().getDescriptionEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__DescriptionAssignment_5_1"


    // $ANTLR start "rule__XClass__ExtendAssignment_6_1"
    // InternalXModel.g:2734:1: rule__XClass__ExtendAssignment_6_1 : ( ruleEString ) ;
    public final void rule__XClass__ExtendAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2738:1: ( ( ruleEString ) )
            // InternalXModel.g:2739:2: ( ruleEString )
            {
            // InternalXModel.g:2739:2: ( ruleEString )
            // InternalXModel.g:2740:3: ruleEString
            {
             before(grammarAccess.getXClassAccess().getExtendEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getXClassAccess().getExtendEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__ExtendAssignment_6_1"


    // $ANTLR start "rule__XClass__PropertyAssignment_7_2"
    // InternalXModel.g:2749:1: rule__XClass__PropertyAssignment_7_2 : ( ruleProperty ) ;
    public final void rule__XClass__PropertyAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2753:1: ( ( ruleProperty ) )
            // InternalXModel.g:2754:2: ( ruleProperty )
            {
            // InternalXModel.g:2754:2: ( ruleProperty )
            // InternalXModel.g:2755:3: ruleProperty
            {
             before(grammarAccess.getXClassAccess().getPropertyPropertyParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getXClassAccess().getPropertyPropertyParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__PropertyAssignment_7_2"


    // $ANTLR start "rule__XClass__PropertyAssignment_7_3_1"
    // InternalXModel.g:2764:1: rule__XClass__PropertyAssignment_7_3_1 : ( ruleProperty ) ;
    public final void rule__XClass__PropertyAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2768:1: ( ( ruleProperty ) )
            // InternalXModel.g:2769:2: ( ruleProperty )
            {
            // InternalXModel.g:2769:2: ( ruleProperty )
            // InternalXModel.g:2770:3: ruleProperty
            {
             before(grammarAccess.getXClassAccess().getPropertyPropertyParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getXClassAccess().getPropertyPropertyParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__PropertyAssignment_7_3_1"


    // $ANTLR start "rule__XClass__OperationAssignment_8_2"
    // InternalXModel.g:2779:1: rule__XClass__OperationAssignment_8_2 : ( ruleOperation ) ;
    public final void rule__XClass__OperationAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2783:1: ( ( ruleOperation ) )
            // InternalXModel.g:2784:2: ( ruleOperation )
            {
            // InternalXModel.g:2784:2: ( ruleOperation )
            // InternalXModel.g:2785:3: ruleOperation
            {
             before(grammarAccess.getXClassAccess().getOperationOperationParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getXClassAccess().getOperationOperationParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__OperationAssignment_8_2"


    // $ANTLR start "rule__XClass__OperationAssignment_8_3_1"
    // InternalXModel.g:2794:1: rule__XClass__OperationAssignment_8_3_1 : ( ruleOperation ) ;
    public final void rule__XClass__OperationAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2798:1: ( ( ruleOperation ) )
            // InternalXModel.g:2799:2: ( ruleOperation )
            {
            // InternalXModel.g:2799:2: ( ruleOperation )
            // InternalXModel.g:2800:3: ruleOperation
            {
             before(grammarAccess.getXClassAccess().getOperationOperationParserRuleCall_8_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getXClassAccess().getOperationOperationParserRuleCall_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XClass__OperationAssignment_8_3_1"


    // $ANTLR start "rule__Property__NameAssignment_2"
    // InternalXModel.g:2809:1: rule__Property__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Property__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2813:1: ( ( ruleEString ) )
            // InternalXModel.g:2814:2: ( ruleEString )
            {
            // InternalXModel.g:2814:2: ( ruleEString )
            // InternalXModel.g:2815:3: ruleEString
            {
             before(grammarAccess.getPropertyAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__NameAssignment_2"


    // $ANTLR start "rule__Property__DescriptionAssignment_4_1"
    // InternalXModel.g:2824:1: rule__Property__DescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Property__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2828:1: ( ( ruleEString ) )
            // InternalXModel.g:2829:2: ( ruleEString )
            {
            // InternalXModel.g:2829:2: ( ruleEString )
            // InternalXModel.g:2830:3: ruleEString
            {
             before(grammarAccess.getPropertyAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getDescriptionEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__DescriptionAssignment_4_1"


    // $ANTLR start "rule__Property__VisibilityAssignment_5_1"
    // InternalXModel.g:2839:1: rule__Property__VisibilityAssignment_5_1 : ( ruleVisibility ) ;
    public final void rule__Property__VisibilityAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2843:1: ( ( ruleVisibility ) )
            // InternalXModel.g:2844:2: ( ruleVisibility )
            {
            // InternalXModel.g:2844:2: ( ruleVisibility )
            // InternalXModel.g:2845:3: ruleVisibility
            {
             before(grammarAccess.getPropertyAccess().getVisibilityVisibilityEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibility();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getVisibilityVisibilityEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__VisibilityAssignment_5_1"


    // $ANTLR start "rule__Property__XtypeAssignment_6_1"
    // InternalXModel.g:2854:1: rule__Property__XtypeAssignment_6_1 : ( ruleXType ) ;
    public final void rule__Property__XtypeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2858:1: ( ( ruleXType ) )
            // InternalXModel.g:2859:2: ( ruleXType )
            {
            // InternalXModel.g:2859:2: ( ruleXType )
            // InternalXModel.g:2860:3: ruleXType
            {
             before(grammarAccess.getPropertyAccess().getXtypeXTypeEnumRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXType();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getXtypeXTypeEnumRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__XtypeAssignment_6_1"


    // $ANTLR start "rule__Operation__NameAssignment_2"
    // InternalXModel.g:2869:1: rule__Operation__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Operation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2873:1: ( ( ruleEString ) )
            // InternalXModel.g:2874:2: ( ruleEString )
            {
            // InternalXModel.g:2874:2: ( ruleEString )
            // InternalXModel.g:2875:3: ruleEString
            {
             before(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__NameAssignment_2"


    // $ANTLR start "rule__Operation__DescriptionAssignment_4_1"
    // InternalXModel.g:2884:1: rule__Operation__DescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Operation__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2888:1: ( ( ruleEString ) )
            // InternalXModel.g:2889:2: ( ruleEString )
            {
            // InternalXModel.g:2889:2: ( ruleEString )
            // InternalXModel.g:2890:3: ruleEString
            {
             before(grammarAccess.getOperationAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getDescriptionEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__DescriptionAssignment_4_1"


    // $ANTLR start "rule__Operation__VisibilityAssignment_5_1"
    // InternalXModel.g:2899:1: rule__Operation__VisibilityAssignment_5_1 : ( ruleVisibility ) ;
    public final void rule__Operation__VisibilityAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2903:1: ( ( ruleVisibility ) )
            // InternalXModel.g:2904:2: ( ruleVisibility )
            {
            // InternalXModel.g:2904:2: ( ruleVisibility )
            // InternalXModel.g:2905:3: ruleVisibility
            {
             before(grammarAccess.getOperationAccess().getVisibilityVisibilityEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibility();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getVisibilityVisibilityEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__VisibilityAssignment_5_1"


    // $ANTLR start "rule__Operation__XtypeAssignment_6_1"
    // InternalXModel.g:2914:1: rule__Operation__XtypeAssignment_6_1 : ( ruleXType ) ;
    public final void rule__Operation__XtypeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2918:1: ( ( ruleXType ) )
            // InternalXModel.g:2919:2: ( ruleXType )
            {
            // InternalXModel.g:2919:2: ( ruleXType )
            // InternalXModel.g:2920:3: ruleXType
            {
             before(grammarAccess.getOperationAccess().getXtypeXTypeEnumRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXType();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getXtypeXTypeEnumRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__XtypeAssignment_6_1"


    // $ANTLR start "rule__Operation__ParameterAssignment_7_2"
    // InternalXModel.g:2929:1: rule__Operation__ParameterAssignment_7_2 : ( ruleParameter ) ;
    public final void rule__Operation__ParameterAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2933:1: ( ( ruleParameter ) )
            // InternalXModel.g:2934:2: ( ruleParameter )
            {
            // InternalXModel.g:2934:2: ( ruleParameter )
            // InternalXModel.g:2935:3: ruleParameter
            {
             before(grammarAccess.getOperationAccess().getParameterParameterParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getParameterParameterParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ParameterAssignment_7_2"


    // $ANTLR start "rule__Operation__ParameterAssignment_7_3_1"
    // InternalXModel.g:2944:1: rule__Operation__ParameterAssignment_7_3_1 : ( ruleParameter ) ;
    public final void rule__Operation__ParameterAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2948:1: ( ( ruleParameter ) )
            // InternalXModel.g:2949:2: ( ruleParameter )
            {
            // InternalXModel.g:2949:2: ( ruleParameter )
            // InternalXModel.g:2950:3: ruleParameter
            {
             before(grammarAccess.getOperationAccess().getParameterParameterParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getParameterParameterParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ParameterAssignment_7_3_1"


    // $ANTLR start "rule__Parameter__NameAssignment_2"
    // InternalXModel.g:2959:1: rule__Parameter__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2963:1: ( ( ruleEString ) )
            // InternalXModel.g:2964:2: ( ruleEString )
            {
            // InternalXModel.g:2964:2: ( ruleEString )
            // InternalXModel.g:2965:3: ruleEString
            {
             before(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_2"


    // $ANTLR start "rule__Parameter__XtypeAssignment_4_1"
    // InternalXModel.g:2974:1: rule__Parameter__XtypeAssignment_4_1 : ( ruleXType ) ;
    public final void rule__Parameter__XtypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXModel.g:2978:1: ( ( ruleXType ) )
            // InternalXModel.g:2979:2: ( ruleXType )
            {
            // InternalXModel.g:2979:2: ( ruleXType )
            // InternalXModel.g:2980:3: ruleXType
            {
             before(grammarAccess.getParameterAccess().getXtypeXTypeEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXType();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getXtypeXTypeEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__XtypeAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000008010000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000001E2000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000C22000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000007FC000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002C22000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000802000000L});

}