package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import com.google.android.gms.fido.common.Transport;
import defpackage.as;
import defpackage.as3;
import defpackage.bx;
import defpackage.c21;
import defpackage.cs3;
import defpackage.ej1;
import defpackage.fj1;
import defpackage.gl;
import defpackage.gn;
import defpackage.h;
import defpackage.hl;
import defpackage.hn;
import defpackage.ji2;
import defpackage.jn;
import defpackage.kd3;
import defpackage.kf2;
import defpackage.kn;
import defpackage.l04;
import defpackage.lg2;
import defpackage.ln;
import defpackage.mn;
import defpackage.nn;
import defpackage.of0;
import defpackage.ph1;
import defpackage.pj1;
import defpackage.qm4;
import defpackage.rj5;
import defpackage.s61;
import defpackage.td4;
import defpackage.vr3;
import defpackage.wr3;
import defpackage.xa3;
import defpackage.xj0;
import defpackage.xr3;
import defpackage.y25;
import defpackage.ya4;
import defpackage.yr3;
import defpackage.zo0;
import defpackage.zr;
import defpackage.zr3;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class PublicKeyCredentialControllerUtility {
    private static final long AUTH_MIN_VERSION_JSON_CREATE = 241217000;
    private static final int FLAGS = 11;
    private static final String TAG = "PublicKeyUtility";
    private static final LinkedHashMap<c21, h> orderedErrorCodeToExceptions;
    public static final Companion Companion = new Companion(null);
    private static final String JSON_KEY_CLIENT_DATA = "clientDataJSON";
    private static final String JSON_KEY_ATTESTATION_OBJ = "attestationObject";
    private static final String JSON_KEY_AUTH_DATA = "authenticatorData";
    private static final String JSON_KEY_SIGNATURE = "signature";
    private static final String JSON_KEY_USER_HANDLE = "userHandle";
    private static final String JSON_KEY_RESPONSE = "response";
    private static final String JSON_KEY_ID = "id";
    private static final String JSON_KEY_RAW_ID = "rawId";
    private static final String JSON_KEY_TYPE = "type";
    private static final String JSON_KEY_RPID = "rpId";
    private static final String JSON_KEY_CHALLENGE = "challenge";
    private static final String JSON_KEY_APPID = "appid";
    private static final String JSON_KEY_THIRD_PARTY_PAYMENT = "thirdPartyPayment";
    private static final String JSON_KEY_AUTH_SELECTION = "authenticatorSelection";
    private static final String JSON_KEY_REQUIRE_RES_KEY = "requireResidentKey";
    private static final String JSON_KEY_RES_KEY = "residentKey";
    private static final String JSON_KEY_AUTH_ATTACHMENT = "authenticatorAttachment";
    private static final String JSON_KEY_TIMEOUT = "timeout";
    private static final String JSON_KEY_EXCLUDE_CREDENTIALS = "excludeCredentials";
    private static final String JSON_KEY_TRANSPORTS = "transports";
    private static final String JSON_KEY_RP = "rp";
    private static final String JSON_KEY_NAME = "name";
    private static final String JSON_KEY_ICON = "icon";
    private static final String JSON_KEY_ALG = "alg";
    private static final String JSON_KEY_USER = "user";
    private static final String JSON_KEY_DISPLAY_NAME = "displayName";
    private static final String JSON_KEY_USER_VERIFICATION_METHOD = "userVerificationMethod";
    private static final String JSON_KEY_KEY_PROTECTION_TYPE = "keyProtectionType";
    private static final String JSON_KEY_MATCHER_PROTECTION_TYPE = "matcherProtectionType";
    private static final String JSON_KEY_EXTENSTIONS = "extensions";
    private static final String JSON_KEY_ATTESTATION = "attestation";
    private static final String JSON_KEY_PUB_KEY_CRED_PARAMS = "pubKeyCredParams";
    private static final String JSON_KEY_CLIENT_EXTENSION_RESULTS = "clientExtensionResults";
    private static final String JSON_KEY_RK = "rk";
    private static final String JSON_KEY_CRED_PROPS = "credProps";

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class GetGMSVersion {
        public static final GetGMSVersion INSTANCE = new GetGMSVersion();

        private GetGMSVersion() {
        }

        public static final long getVersionLong(PackageInfo packageInfo) {
            packageInfo.getClass();
            return packageInfo.getLongVersionCode();
        }
    }

    static {
        kd3[] kd3VarArr = {new kd3(c21.UNKNOWN_ERR, new h(26)), new kd3(c21.ABORT_ERR, new h(0)), new kd3(c21.ATTESTATION_NOT_PRIVATE_ERR, new h(16)), new kd3(c21.CONSTRAINT_ERR, new h(1)), new kd3(c21.DATA_ERR, new h(3)), new kd3(c21.INVALID_STATE_ERR, new h(10)), new kd3(c21.ENCODING_ERR, new h(4)), new kd3(c21.NETWORK_ERR, new h(12)), new kd3(c21.NOT_ALLOWED_ERR, new h(14)), new kd3(c21.NOT_SUPPORTED_ERR, new h(17)), new kd3(c21.SECURITY_ERR, new h(22)), new kd3(c21.TIMEOUT_ERR, new h(24))};
        LinkedHashMap<c21, h> linkedHashMap = new LinkedHashMap<>(lg2.W(12));
        lg2.Y(linkedHashMap, kd3VarArr);
        orderedErrorCodeToExceptions = linkedHashMap;
    }

    public static final xr3 convert(of0 of0Var, Context context) {
        return Companion.convert(of0Var, context);
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class Companion {
        public /* synthetic */ Companion(xj0 xj0Var) {
            this();
        }

        private final byte[] getChallenge(JSONObject jSONObject) throws JSONException {
            String strOptString = jSONObject.optString(getJSON_KEY_CHALLENGE$credentials_play_services_auth_release(), "");
            strOptString.getClass();
            if (strOptString.length() != 0) {
                return b64Decode(strOptString);
            }
            throw new JSONException("Challenge not found in request or is unexpectedly empty");
        }

        private final boolean isDeviceGMSVersionOlderThan(Context context, long j) throws PackageManager.NameNotFoundException {
            long versionLong;
            if (ej1.c.b(context, fj1.a) != 0) {
                return false;
            }
            PackageManager packageManager = context.getPackageManager();
            packageManager.getClass();
            if (Build.VERSION.SDK_INT >= 28) {
                PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 0);
                packageInfo.getClass();
                versionLong = GetGMSVersion.getVersionLong(packageInfo);
            } else {
                versionLong = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
            }
            return versionLong > j;
        }

        public final void addAuthenticatorAttestationResponse$credentials_play_services_auth_release(byte[] bArr, byte[] bArr2, String[] strArr, JSONObject jSONObject) throws JSONException {
            bArr.getClass();
            bArr2.getClass();
            strArr.getClass();
            jSONObject.getClass();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release(), b64Encode(bArr));
            jSONObject2.put(getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth_release(), b64Encode(bArr2));
            jSONObject2.put(getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release(), new JSONArray(strArr));
            jSONObject.put(getJSON_KEY_RESPONSE$credentials_play_services_auth_release(), jSONObject2);
        }

        public final byte[] b64Decode(String str) {
            str.getClass();
            byte[] bArrDecode = Base64.decode(str, PublicKeyCredentialControllerUtility.FLAGS);
            bArrDecode.getClass();
            return bArrDecode;
        }

        public final String b64Encode(byte[] bArr) {
            bArr.getClass();
            String strEncodeToString = Base64.encodeToString(bArr, PublicKeyCredentialControllerUtility.FLAGS);
            strEncodeToString.getClass();
            return strEncodeToString;
        }

        public final GetCredentialException beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release(c21 c21Var, String str) {
            c21Var.getClass();
            h hVar = getOrderedErrorCodeToExceptions$credentials_play_services_auth_release().get(c21Var);
            if (hVar == null) {
                return new GetPublicKeyCredentialDomException(new h(26), xa3.g("unknown fido gms exception - ", str));
            }
            return (c21Var == c21.NOT_ALLOWED_ERR && str != null && qm4.o0(str, "Unable to get sync account")) ? new GetCredentialCancellationException("Passkey retrieval was cancelled by the user.") : new GetPublicKeyCredentialDomException(hVar, str);
        }

        public final boolean checkAlgSupported(int i) {
            try {
                bx.a(i);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        public final xr3 convert(of0 of0Var, Context context) {
            throw null;
        }

        public final xr3 convertJSON$credentials_play_services_auth_release(JSONObject jSONObject) throws JSONException, CreatePublicKeyCredentialDomException {
            jSONObject.getClass();
            wr3 wr3Var = new wr3();
            parseRequiredChallengeAndUser$credentials_play_services_auth_release(jSONObject, wr3Var);
            parseRequiredRpAndParams$credentials_play_services_auth_release(jSONObject, wr3Var);
            parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release(jSONObject, wr3Var);
            parseOptionalTimeout$credentials_play_services_auth_release(jSONObject, wr3Var);
            parseOptionalAuthenticatorSelection$credentials_play_services_auth_release(jSONObject, wr3Var);
            parseOptionalExtensions$credentials_play_services_auth_release(jSONObject, wr3Var);
            as3 as3Var = wr3Var.a;
            cs3 cs3Var = wr3Var.b;
            byte[] bArr = wr3Var.c;
            ArrayList arrayList = wr3Var.d;
            Double d = wr3Var.e;
            ArrayList arrayList2 = wr3Var.f;
            nn nnVar = wr3Var.g;
            hl hlVar = wr3Var.h;
            return new xr3(as3Var, cs3Var, bArr, arrayList, d, arrayList2, nnVar, null, null, hlVar == null ? null : hlVar.n, wr3Var.i, null, null);
        }

        public final zr convertToPlayAuthPasskeyJsonRequest(ph1 ph1Var) {
            throw null;
        }

        @zo0
        public final as convertToPlayAuthPasskeyRequest(ph1 ph1Var) {
            throw null;
        }

        public final String getJSON_KEY_ALG$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ALG;
        }

        public final String getJSON_KEY_APPID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_APPID;
        }

        public final String getJSON_KEY_ATTESTATION$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION;
        }

        public final String getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION_OBJ;
        }

        public final String getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_ATTACHMENT;
        }

        public final String getJSON_KEY_AUTH_DATA$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA;
        }

        public final String getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_SELECTION;
        }

        public final String getJSON_KEY_CHALLENGE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE;
        }

        public final String getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA;
        }

        public final String getJSON_KEY_CLIENT_EXTENSION_RESULTS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_EXTENSION_RESULTS;
        }

        public final String getJSON_KEY_CRED_PROPS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CRED_PROPS;
        }

        public final String getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME;
        }

        public final String getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXCLUDE_CREDENTIALS;
        }

        public final String getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS;
        }

        public final String getJSON_KEY_ICON$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ICON;
        }

        public final String getJSON_KEY_ID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        }

        public final String getJSON_KEY_KEY_PROTECTION_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_KEY_PROTECTION_TYPE;
        }

        public final String getJSON_KEY_MATCHER_PROTECTION_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_MATCHER_PROTECTION_TYPE;
        }

        public final String getJSON_KEY_NAME$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        }

        public final String getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_PUB_KEY_CRED_PARAMS;
        }

        public final String getJSON_KEY_RAW_ID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RAW_ID;
        }

        public final String getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_REQUIRE_RES_KEY;
        }

        public final String getJSON_KEY_RESPONSE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
        }

        public final String getJSON_KEY_RES_KEY$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RES_KEY;
        }

        public final String getJSON_KEY_RK$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RK;
        }

        public final String getJSON_KEY_RP$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RP;
        }

        public final String getJSON_KEY_RPID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RPID;
        }

        public final String getJSON_KEY_SIGNATURE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE;
        }

        public final String getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_THIRD_PARTY_PAYMENT;
        }

        public final String getJSON_KEY_TIMEOUT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
        }

        public final String getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS;
        }

        public final String getJSON_KEY_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        }

        public final String getJSON_KEY_USER$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        }

        public final String getJSON_KEY_USER_HANDLE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_HANDLE;
        }

        public final String getJSON_KEY_USER_VERIFICATION_METHOD$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_VERIFICATION_METHOD;
        }

        public final LinkedHashMap<c21, h> getOrderedErrorCodeToExceptions$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions;
        }

        public final void parseOptionalAuthenticatorSelection$credentials_play_services_auth_release(JSONObject jSONObject, wr3 wr3Var) throws JSONException {
            jSONObject.getClass();
            wr3Var.getClass();
            if (jSONObject.has(getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release())) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release());
                boolean zOptBoolean = jSONObject2.optBoolean(getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth_release(), false);
                String strOptString = jSONObject2.optString(getJSON_KEY_RES_KEY$credentials_play_services_auth_release(), "");
                strOptString.getClass();
                l04 l04VarA = strOptString.length() > 0 ? l04.a(strOptString) : null;
                Boolean boolValueOf = Boolean.valueOf(zOptBoolean);
                String strOptString2 = jSONObject2.optString(getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth_release(), "");
                strOptString2.getClass();
                gl glVarA = strOptString2.length() > 0 ? gl.a(strOptString2) : null;
                wr3Var.g = new nn(glVarA == null ? null : glVarA.n, boolValueOf, null, l04VarA == null ? null : l04VarA.n);
            }
        }

        public final void parseOptionalExtensions$credentials_play_services_auth_release(JSONObject jSONObject, wr3 wr3Var) throws JSONException {
            jSONObject.getClass();
            wr3Var.getClass();
            if (jSONObject.has(getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release())) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release());
                String strOptString = jSONObject2.optString(getJSON_KEY_APPID$credentials_play_services_auth_release(), "");
                strOptString.getClass();
                wr3Var.i = new gn(strOptString.length() > 0 ? new s61(strOptString) : null, null, jSONObject2.optBoolean("uvm", false) ? new y25(true) : null, null, null, null, null, null, jSONObject2.optBoolean(getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth_release(), false) ? new pj1(true) : null, null, null, null);
            }
        }

        public final void parseOptionalTimeout$credentials_play_services_auth_release(JSONObject jSONObject, wr3 wr3Var) {
            jSONObject.getClass();
            wr3Var.getClass();
            if (jSONObject.has(getJSON_KEY_TIMEOUT$credentials_play_services_auth_release())) {
                wr3Var.e = Double.valueOf(jSONObject.getLong(getJSON_KEY_TIMEOUT$credentials_play_services_auth_release()) / 1000.0d);
            }
        }

        public final void parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release(JSONObject jSONObject, wr3 wr3Var) throws JSONException, CreatePublicKeyCredentialDomException {
            ArrayList arrayList;
            jSONObject.getClass();
            wr3Var.getClass();
            ArrayList arrayList2 = new ArrayList();
            if (jSONObject.has(getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release())) {
                JSONArray jSONArray = jSONObject.getJSONArray(getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release());
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    String string = jSONObject2.getString(getJSON_KEY_ID$credentials_play_services_auth_release());
                    string.getClass();
                    byte[] bArrB64Decode = b64Decode(string);
                    String string2 = jSONObject2.getString(getJSON_KEY_TYPE$credentials_play_services_auth_release());
                    string2.getClass();
                    if (string2.length() == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor type value is not found or unexpectedly empty");
                    }
                    if (bArrB64Decode.length == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor id value is not found or unexpectedly empty");
                    }
                    if (jSONObject2.has(getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release())) {
                        arrayList = new ArrayList();
                        JSONArray jSONArray2 = jSONObject2.getJSONArray(getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release());
                        int length2 = jSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            try {
                                arrayList.add(Transport.a(jSONArray2.getString(i2)));
                            } catch (Transport.UnsupportedTransportException e) {
                                throw new CreatePublicKeyCredentialDomException(new h(4), e.getMessage());
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    arrayList2.add(new yr3(string2, bArrB64Decode, arrayList));
                }
            }
            wr3Var.f = arrayList2;
            String strOptString = jSONObject.optString(getJSON_KEY_ATTESTATION$credentials_play_services_auth_release(), "none");
            strOptString.getClass();
            wr3Var.h = hl.a(strOptString.length() != 0 ? strOptString : "none");
        }

        public final void parseRequiredChallengeAndUser$credentials_play_services_auth_release(JSONObject jSONObject, wr3 wr3Var) throws JSONException {
            jSONObject.getClass();
            wr3Var.getClass();
            byte[] challenge = getChallenge(jSONObject);
            ji2.m(challenge);
            wr3Var.c = challenge;
            JSONObject jSONObject2 = jSONObject.getJSONObject(getJSON_KEY_USER$credentials_play_services_auth_release());
            String string = jSONObject2.getString(getJSON_KEY_ID$credentials_play_services_auth_release());
            string.getClass();
            byte[] bArrB64Decode = b64Decode(string);
            String string2 = jSONObject2.getString(getJSON_KEY_NAME$credentials_play_services_auth_release());
            String string3 = jSONObject2.getString(getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release());
            String strOptString = jSONObject2.optString(getJSON_KEY_ICON$credentials_play_services_auth_release(), "");
            string3.getClass();
            if (string3.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing displayName or they are unexpectedly empty");
            }
            if (bArrB64Decode.length == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user id or they are unexpectedly empty");
            }
            string2.getClass();
            if (string2.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user name or they are unexpectedly empty");
            }
            wr3Var.b = new cs3(string2, strOptString, string3, bArrB64Decode);
        }

        public final void parseRequiredRpAndParams$credentials_play_services_auth_release(JSONObject jSONObject, wr3 wr3Var) throws JSONException {
            jSONObject.getClass();
            wr3Var.getClass();
            JSONObject jSONObject2 = jSONObject.getJSONObject(getJSON_KEY_RP$credentials_play_services_auth_release());
            String string = jSONObject2.getString(getJSON_KEY_ID$credentials_play_services_auth_release());
            String strOptString = jSONObject2.optString(getJSON_KEY_NAME$credentials_play_services_auth_release(), "");
            String strOptString2 = jSONObject2.optString(getJSON_KEY_ICON$credentials_play_services_auth_release(), "");
            strOptString2.getClass();
            if (strOptString2.length() == 0) {
                strOptString2 = null;
            }
            strOptString.getClass();
            if (strOptString.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp name is missing or unexpectedly empty");
            }
            string.getClass();
            if (string.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp ID is missing or unexpectedly empty");
            }
            wr3Var.a = new as3(string, strOptString, strOptString2);
            JSONArray jSONArray = jSONObject.getJSONArray(getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth_release());
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                int i2 = (int) jSONObject3.getLong(getJSON_KEY_ALG$credentials_play_services_auth_release());
                String strOptString3 = jSONObject3.optString(getJSON_KEY_TYPE$credentials_play_services_auth_release(), "");
                strOptString3.getClass();
                if (strOptString3.length() == 0) {
                    throw new JSONException("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
                }
                if (checkAlgSupported(i2)) {
                    arrayList.add(new zr3(i2, strOptString3));
                }
            }
            wr3Var.d = arrayList;
        }

        public final CreateCredentialException publicKeyCredentialResponseContainsError(vr3 vr3Var) {
            vr3Var.getClass();
            mn mnVar = vr3Var.q;
            if (mnVar == null && (mnVar = vr3Var.r) == null && (mnVar = vr3Var.s) == null) {
                kf2.o("No response set.");
                return null;
            }
            if (!(mnVar instanceof ln)) {
                return null;
            }
            ln lnVar = (ln) mnVar;
            c21 c21Var = lnVar.n;
            c21Var.getClass();
            h hVar = getOrderedErrorCodeToExceptions$credentials_play_services_auth_release().get(c21Var);
            String str = lnVar.o;
            if (hVar == null) {
                return new CreatePublicKeyCredentialDomException(new h(26), xa3.g("unknown fido gms exception - ", str));
            }
            return (c21Var == c21.NOT_ALLOWED_ERR && str != null && qm4.o0(str, "Unable to get sync account")) ? new CreateCredentialCancellationException("Passkey registration was cancelled by the user.") : new CreatePublicKeyCredentialDomException(hVar, str);
        }

        public final String toAssertPasskeyResponse(td4 td4Var) throws GetCredentialException {
            Object obj;
            td4Var.getClass();
            JSONObject jSONObject = new JSONObject();
            vr3 vr3Var = td4Var.v;
            JSONObject jSONObject2 = null;
            if (vr3Var != null) {
                obj = vr3Var.q;
                if (obj == null && (obj = vr3Var.r) == null && (obj = vr3Var.s) == null) {
                    kf2.o("No response set.");
                    return null;
                }
            } else {
                obj = null;
            }
            obj.getClass();
            if (obj instanceof ln) {
                ln lnVar = (ln) obj;
                c21 c21Var = lnVar.n;
                c21Var.getClass();
                throw beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release(c21Var, lnVar.o);
            }
            if (!(obj instanceof jn)) {
                Log.e(PublicKeyCredentialControllerUtility.TAG, "AuthenticatorResponse expected assertion response but got: ".concat(obj.getClass().getName()));
                String string = jSONObject.toString();
                string.getClass();
                return string;
            }
            try {
                ln lnVar2 = vr3Var.s;
                rj5 rj5Var = vr3Var.p;
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    if (rj5Var != null && rj5Var.j().length > 0) {
                        jSONObject3.put("rawId", ya4.n(rj5Var.j()));
                    }
                    String str = vr3Var.u;
                    if (str != null) {
                        jSONObject3.put("authenticatorAttachment", str);
                    }
                    String str2 = vr3Var.o;
                    if (str2 != null && lnVar2 == null) {
                        jSONObject3.put("type", str2);
                    }
                    String str3 = vr3Var.n;
                    if (str3 != null) {
                        jSONObject3.put("id", str3);
                    }
                    String str4 = "response";
                    jn jnVar = vr3Var.r;
                    boolean z = true;
                    if (jnVar != null) {
                        jSONObject2 = jnVar.b();
                    } else {
                        kn knVar = vr3Var.q;
                        if (knVar != null) {
                            jSONObject2 = knVar.b();
                        } else {
                            z = false;
                            if (lnVar2 != null) {
                                try {
                                    jSONObject2 = new JSONObject();
                                    jSONObject2.put("code", lnVar2.n.n);
                                    String str5 = lnVar2.o;
                                    if (str5 != null) {
                                        jSONObject2.put("message", str5);
                                    }
                                    str4 = "error";
                                } catch (JSONException e) {
                                    throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e);
                                }
                            }
                        }
                    }
                    if (jSONObject2 != null) {
                        jSONObject3.put(str4, jSONObject2);
                    }
                    hn hnVar = vr3Var.t;
                    if (hnVar != null) {
                        jSONObject3.put("clientExtensionResults", hnVar.b());
                    } else if (z) {
                        jSONObject3.put("clientExtensionResults", new JSONObject());
                    }
                    String string2 = jSONObject3.toString();
                    string2.getClass();
                    return string2;
                } catch (JSONException e2) {
                    throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e2);
                }
            } catch (Throwable th) {
                throw new GetCredentialUnknownException("The PublicKeyCredential response json had an unexpected exception when parsing: " + th.getMessage());
            }
        }

        private Companion() {
        }
    }
}
