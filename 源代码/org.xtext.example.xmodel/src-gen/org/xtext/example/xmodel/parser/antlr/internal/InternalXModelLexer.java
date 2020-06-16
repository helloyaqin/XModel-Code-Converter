package org.xtext.example.xmodel.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXModelLexer extends Lexer {
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

    public InternalXModelLexer() {;} 
    public InternalXModelLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalXModelLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalXModel.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:11:7: ( 'Package' )
            // InternalXModel.g:11:9: 'Package'
            {
            match("Package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:12:7: ( '{' )
            // InternalXModel.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:13:7: ( 'class' )
            // InternalXModel.g:13:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:14:7: ( ',' )
            // InternalXModel.g:14:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:15:7: ( '}' )
            // InternalXModel.g:15:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:16:7: ( 'isAbstract' )
            // InternalXModel.g:16:9: 'isAbstract'
            {
            match("isAbstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:17:7: ( 'XClass' )
            // InternalXModel.g:17:9: 'XClass'
            {
            match("XClass"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:18:7: ( 'description' )
            // InternalXModel.g:18:9: 'description'
            {
            match("description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:19:7: ( 'extend' )
            // InternalXModel.g:19:9: 'extend'
            {
            match("extend"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:20:7: ( 'property' )
            // InternalXModel.g:20:9: 'property'
            {
            match("property"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:21:7: ( 'operation' )
            // InternalXModel.g:21:9: 'operation'
            {
            match("operation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:22:7: ( 'Property' )
            // InternalXModel.g:22:9: 'Property'
            {
            match("Property"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:23:7: ( 'visibility' )
            // InternalXModel.g:23:9: 'visibility'
            {
            match("visibility"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:24:7: ( 'xtype' )
            // InternalXModel.g:24:9: 'xtype'
            {
            match("xtype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:25:7: ( 'Operation' )
            // InternalXModel.g:25:9: 'Operation'
            {
            match("Operation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:26:7: ( 'parameter' )
            // InternalXModel.g:26:9: 'parameter'
            {
            match("parameter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:27:7: ( 'Parameter' )
            // InternalXModel.g:27:9: 'Parameter'
            {
            match("Parameter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:28:7: ( 'public' )
            // InternalXModel.g:28:9: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:29:7: ( 'protected' )
            // InternalXModel.g:29:9: 'protected'
            {
            match("protected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:30:7: ( 'private' )
            // InternalXModel.g:30:9: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:31:7: ( 'String' )
            // InternalXModel.g:31:9: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:32:7: ( 'Integer' )
            // InternalXModel.g:32:9: 'Integer'
            {
            match("Integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:33:7: ( 'Short' )
            // InternalXModel.g:33:9: 'Short'
            {
            match("Short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:34:7: ( 'Byte' )
            // InternalXModel.g:34:9: 'Byte'
            {
            match("Byte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:35:7: ( 'Long' )
            // InternalXModel.g:35:9: 'Long'
            {
            match("Long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:36:7: ( 'Float' )
            // InternalXModel.g:36:9: 'Float'
            {
            match("Float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:37:7: ( 'Double' )
            // InternalXModel.g:37:9: 'Double'
            {
            match("Double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:38:7: ( 'Character' )
            // InternalXModel.g:38:9: 'Character'
            {
            match("Character"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:39:7: ( 'Boolean' )
            // InternalXModel.g:39:9: 'Boolean'
            {
            match("Boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:972:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalXModel.g:972:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalXModel.g:972:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalXModel.g:972:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalXModel.g:972:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalXModel.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:974:10: ( ( '0' .. '9' )+ )
            // InternalXModel.g:974:12: ( '0' .. '9' )+
            {
            // InternalXModel.g:974:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalXModel.g:974:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:976:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalXModel.g:976:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalXModel.g:976:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalXModel.g:976:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalXModel.g:976:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalXModel.g:976:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalXModel.g:976:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalXModel.g:976:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalXModel.g:976:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalXModel.g:976:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalXModel.g:976:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:978:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalXModel.g:978:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalXModel.g:978:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalXModel.g:978:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:980:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalXModel.g:980:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalXModel.g:980:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalXModel.g:980:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalXModel.g:980:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalXModel.g:980:41: ( '\\r' )? '\\n'
                    {
                    // InternalXModel.g:980:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalXModel.g:980:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:982:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalXModel.g:982:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalXModel.g:982:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalXModel.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXModel.g:984:16: ( . )
            // InternalXModel.g:984:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalXModel.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=36;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalXModel.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalXModel.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalXModel.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalXModel.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalXModel.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalXModel.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalXModel.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalXModel.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalXModel.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalXModel.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalXModel.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalXModel.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalXModel.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalXModel.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalXModel.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalXModel.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalXModel.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalXModel.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalXModel.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalXModel.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalXModel.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalXModel.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalXModel.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalXModel.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalXModel.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalXModel.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalXModel.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalXModel.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalXModel.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalXModel.g:1:184: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 31 :
                // InternalXModel.g:1:192: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 32 :
                // InternalXModel.g:1:201: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 33 :
                // InternalXModel.g:1:213: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 34 :
                // InternalXModel.g:1:229: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 35 :
                // InternalXModel.g:1:245: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 36 :
                // InternalXModel.g:1:253: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\40\1\uffff\1\40\2\uffff\20\40\1\35\2\uffff\3\35\2\uffff\2\40\2\uffff\1\40\2\uffff\24\40\5\uffff\55\40\1\u0085\1\40\1\u0087\6\40\1\u008e\13\40\1\u009a\2\40\1\u009d\1\40\1\uffff\1\40\1\uffff\1\u00a0\5\40\1\uffff\1\40\1\u00a7\1\40\1\u00a9\4\40\1\u00ae\2\40\1\uffff\1\40\1\u00b2\1\uffff\2\40\1\uffff\1\u00b5\1\40\1\u00b7\3\40\1\uffff\1\40\1\uffff\2\40\1\u00be\1\40\1\uffff\3\40\1\uffff\1\u00c3\1\u00c4\1\uffff\1\40\1\uffff\1\40\1\u00c7\2\40\1\u00ca\1\40\1\uffff\4\40\2\uffff\1\40\1\u00d1\1\uffff\2\40\1\uffff\1\u00d4\1\u00d5\1\u00d6\1\40\1\u00d8\1\u00d9\1\uffff\1\u00da\1\40\3\uffff\1\u00dc\3\uffff\1\u00dd\2\uffff";
    static final String DFA12_eofS =
        "\u00de\uffff";
    static final String DFA12_minS =
        "\1\0\1\141\1\uffff\1\154\2\uffff\1\163\1\103\1\145\1\170\1\141\1\160\1\151\1\164\1\160\1\150\1\156\2\157\1\154\1\157\1\150\1\101\2\uffff\2\0\1\52\2\uffff\1\143\1\157\2\uffff\1\141\2\uffff\1\101\1\154\1\163\1\164\1\151\1\162\1\142\1\145\1\163\1\171\1\145\1\162\1\157\2\164\1\157\1\156\1\157\1\165\1\141\5\uffff\1\153\1\141\1\160\1\163\1\142\1\141\1\143\1\145\1\160\1\166\1\141\1\154\1\162\1\151\1\160\1\162\1\151\1\162\2\145\1\154\1\147\1\141\1\142\1\162\1\141\1\155\1\145\3\163\1\162\1\156\2\145\1\141\1\155\1\151\1\141\1\142\1\145\1\141\1\156\1\164\1\147\1\60\1\145\1\60\1\164\1\154\1\141\1\147\1\145\1\162\1\60\1\164\1\163\1\151\1\144\1\162\1\143\1\164\1\145\1\143\1\164\1\151\1\60\1\164\1\147\1\60\1\145\1\uffff\1\141\1\uffff\1\60\1\145\1\143\1\145\2\164\1\uffff\1\162\1\60\1\160\1\60\2\164\1\145\1\164\1\60\1\151\1\154\1\uffff\1\151\1\60\1\uffff\1\162\1\156\1\uffff\1\60\1\164\1\60\1\145\1\171\1\141\1\uffff\1\164\1\uffff\1\171\1\145\1\60\1\145\1\uffff\1\157\1\151\1\157\1\uffff\2\60\1\uffff\1\145\1\uffff\1\162\1\60\1\143\1\151\1\60\1\144\1\uffff\1\162\1\156\1\164\1\156\2\uffff\1\162\1\60\1\uffff\1\164\1\157\1\uffff\3\60\1\171\2\60\1\uffff\1\60\1\156\3\uffff\1\60\3\uffff\1\60\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\162\1\uffff\1\154\2\uffff\1\163\1\103\1\145\1\170\1\165\1\160\1\151\1\164\1\160\1\164\1\156\1\171\1\157\1\154\1\157\1\150\1\172\2\uffff\2\uffff\1\57\2\uffff\1\162\1\157\2\uffff\1\141\2\uffff\1\101\1\154\1\163\1\164\1\157\1\162\1\142\1\145\1\163\1\171\1\145\1\162\1\157\2\164\1\157\1\156\1\157\1\165\1\141\5\uffff\1\153\1\141\1\160\1\163\1\142\1\141\1\143\1\145\1\164\1\166\1\141\1\154\1\162\1\151\1\160\1\162\1\151\1\162\2\145\1\154\1\147\1\141\1\142\1\162\1\141\1\155\1\145\3\163\1\162\1\156\2\145\1\141\1\155\1\151\1\141\1\142\1\145\1\141\1\156\1\164\1\147\1\172\1\145\1\172\1\164\1\154\1\141\1\147\1\145\1\162\1\172\1\164\1\163\1\151\1\144\1\162\1\143\1\164\1\145\1\143\1\164\1\151\1\172\1\164\1\147\1\172\1\145\1\uffff\1\141\1\uffff\1\172\1\145\1\143\1\145\2\164\1\uffff\1\162\1\172\1\160\1\172\2\164\1\145\1\164\1\172\1\151\1\154\1\uffff\1\151\1\172\1\uffff\1\162\1\156\1\uffff\1\172\1\164\1\172\1\145\1\171\1\141\1\uffff\1\164\1\uffff\1\171\1\145\1\172\1\145\1\uffff\1\157\1\151\1\157\1\uffff\2\172\1\uffff\1\145\1\uffff\1\162\1\172\1\143\1\151\1\172\1\144\1\uffff\1\162\1\156\1\164\1\156\2\uffff\1\162\1\172\1\uffff\1\164\1\157\1\uffff\3\172\1\171\2\172\1\uffff\1\172\1\156\3\uffff\1\172\3\uffff\1\172\2\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\5\21\uffff\1\36\1\37\3\uffff\1\43\1\44\2\uffff\1\36\1\2\1\uffff\1\4\1\5\24\uffff\1\37\1\40\1\41\1\42\1\43\107\uffff\1\30\1\uffff\1\31\6\uffff\1\3\13\uffff\1\16\2\uffff\1\27\2\uffff\1\32\6\uffff\1\7\1\uffff\1\11\4\uffff\1\22\3\uffff\1\25\2\uffff\1\33\1\uffff\1\1\6\uffff\1\24\4\uffff\1\26\1\35\2\uffff\1\14\2\uffff\1\12\6\uffff\1\21\2\uffff\1\23\1\20\1\13\1\uffff\1\17\1\34\1\6\1\uffff\1\15\1\10";
    static final String DFA12_specialS =
        "\1\1\30\uffff\1\0\1\2\u00c3\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\35\2\34\2\35\1\34\22\35\1\34\1\35\1\31\4\35\1\32\4\35\1\4\2\35\1\33\12\30\7\35\1\27\1\21\1\25\1\24\1\27\1\23\2\27\1\20\2\27\1\22\2\27\1\16\1\1\2\27\1\17\4\27\1\7\2\27\3\35\1\26\1\27\1\35\2\27\1\3\1\10\1\11\3\27\1\6\5\27\1\13\1\12\5\27\1\14\1\27\1\15\2\27\1\2\1\35\1\5\uff82\35",
            "\1\36\20\uffff\1\37",
            "",
            "\1\42",
            "",
            "",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\52\20\uffff\1\51\2\uffff\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\61\13\uffff\1\60",
            "\1\62",
            "\1\64\11\uffff\1\63",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "\0\72",
            "\0\72",
            "\1\73\4\uffff\1\74",
            "",
            "",
            "\1\76\16\uffff\1\77",
            "\1\100",
            "",
            "",
            "\1\101",
            "",
            "",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\107\5\uffff\1\106",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "",
            "",
            "",
            "",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137\3\uffff\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0086",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u009b",
            "\1\u009c",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u009e",
            "",
            "\1\u009f",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "",
            "\1\u00a6",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00a8",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00af",
            "\1\u00b0",
            "",
            "\1\u00b1",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\u00b3",
            "\1\u00b4",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00b6",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "",
            "\1\u00bb",
            "",
            "\1\u00bc",
            "\1\u00bd",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00bf",
            "",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\u00c5",
            "",
            "\1\u00c6",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00c8",
            "\1\u00c9",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00cb",
            "",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "",
            "",
            "\1\u00d0",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00d7",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00db",
            "",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_25 = input.LA(1);

                        s = -1;
                        if ( ((LA12_25>='\u0000' && LA12_25<='\uFFFF')) ) {s = 58;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='P') ) {s = 1;}

                        else if ( (LA12_0=='{') ) {s = 2;}

                        else if ( (LA12_0=='c') ) {s = 3;}

                        else if ( (LA12_0==',') ) {s = 4;}

                        else if ( (LA12_0=='}') ) {s = 5;}

                        else if ( (LA12_0=='i') ) {s = 6;}

                        else if ( (LA12_0=='X') ) {s = 7;}

                        else if ( (LA12_0=='d') ) {s = 8;}

                        else if ( (LA12_0=='e') ) {s = 9;}

                        else if ( (LA12_0=='p') ) {s = 10;}

                        else if ( (LA12_0=='o') ) {s = 11;}

                        else if ( (LA12_0=='v') ) {s = 12;}

                        else if ( (LA12_0=='x') ) {s = 13;}

                        else if ( (LA12_0=='O') ) {s = 14;}

                        else if ( (LA12_0=='S') ) {s = 15;}

                        else if ( (LA12_0=='I') ) {s = 16;}

                        else if ( (LA12_0=='B') ) {s = 17;}

                        else if ( (LA12_0=='L') ) {s = 18;}

                        else if ( (LA12_0=='F') ) {s = 19;}

                        else if ( (LA12_0=='D') ) {s = 20;}

                        else if ( (LA12_0=='C') ) {s = 21;}

                        else if ( (LA12_0=='^') ) {s = 22;}

                        else if ( (LA12_0=='A'||LA12_0=='E'||(LA12_0>='G' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='K')||(LA12_0>='M' && LA12_0<='N')||(LA12_0>='Q' && LA12_0<='R')||(LA12_0>='T' && LA12_0<='W')||(LA12_0>='Y' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='b')||(LA12_0>='f' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='n')||(LA12_0>='q' && LA12_0<='u')||LA12_0=='w'||(LA12_0>='y' && LA12_0<='z')) ) {s = 23;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 24;}

                        else if ( (LA12_0=='\"') ) {s = 25;}

                        else if ( (LA12_0=='\'') ) {s = 26;}

                        else if ( (LA12_0=='/') ) {s = 27;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 28;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_26 = input.LA(1);

                        s = -1;
                        if ( ((LA12_26>='\u0000' && LA12_26<='\uFFFF')) ) {s = 58;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}