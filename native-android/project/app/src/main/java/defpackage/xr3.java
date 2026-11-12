package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xr3 extends h2 {
    public static final Parcelable.Creator<xr3> CREATOR = null;
    public final as3 n;
    public final cs3 o;
    public final byte[] p;
    public final List q;
    public final Double r;
    public final List s;
    public final nn t;
    public final Integer u;
    public final su4 v;
    public final hl w;
    public final gn x;
    public final String y;
    public final ResultReceiver z;

    static {
        CREATOR = new ch5(13);
    }

    public xr3(as3 r1, cs3 r2, byte[] r3, ArrayList r4, Double r5, ArrayList r6, nn r7, Integer r8, su4 r9, String r10, gn r11, String r12, ResultReceiver r13) {
        this.z = r13;
        if (r12 != null) goto L22;
        ji2.m(r1);
        this.n = r1;
        ji2.m(r2);
        this.o = r2;
        ji2.m(r3);
        this.p = r3;
        ji2.m(r4);
        this.q = r4;
        this.r = r5;
        this.s = r6;
        this.t = r7;
        this.u = r8;
        this.v = r9;
        if (r10 != null) goto L20;
        this.w = null;
    L18:
        this.x = r11;
        this.y = null;
        return;
    L20:
        this.w = hl.a(r10);     // Catch: AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException -> L14
    L14:
        e = move-exception;
        throw new IllegalArgumentException(e);
    L22:
        xr3 r14 = b(new JSONObject(r12));     // Catch: JSONException -> L7
        this.n = r14.n;
        this.o = r14.o;
        this.p = r14.p;
        this.q = r14.q;
        this.r = r14.r;
        this.s = r14.s;
        this.t = r14.t;
        this.u = r14.u;
        this.v = r14.v;
        this.w = r14.w;
        this.x = r14.x;
        this.y = r12;
        return;
    L7:
        e = move-exception;
        throw new IllegalArgumentException(e);
    }

    public static xr3 b(JSONObject r32) {
        JSONObject r1 = r32.getJSONObject("rp");
        String r2 = "id";
        String r3 = r1.getString("id");
        String r5 = r1.getString("name");
        if (r1.has("icon") == false) goto L5;
        String r4 = r1.optString("icon");
    L6:
        as3 r10 = new as3(r3, r5, r4);
        JSONObject r6 = r32.getJSONObject("user");
        byte[] r7 = ya4.k(r6.getString("id"));
        String r8 = r6.getString("name");
        String r9 = r6.optString("displayName");
        if (r6.has("icon") == false) goto L9;
        String r11 = r6.optString("icon");
    L10:
        cs3 r12 = new cs3(r8, r11, r9, r7);
        byte[] r13 = ya4.k(r32.getString("challenge"));
        ji2.m(r13);
        JSONArray r14 = r32.getJSONArray("pubKeyCredParams");
        ArrayList r15 = new ArrayList();
        int r16 = 0;
    L12:
        if (r16 >= r14.length()) goto L22;
        JSONObject r17 = r14.getJSONObject(r16);
        bb3 r18 = new th5(new zr3(r17.getInt("alg"), r17.getString("type")));     // Catch: IllegalArgumentException -> L16
    L18:
        if (r18.d() == false) goto L20;
        r15.add(r18.c());
    L20:
        r16 = r16 + 1;
    L16:
        r18 = oh5.n;
        goto L18
    L22:
        if (r32.has("timeout") == false) goto L24;
        Double r19 = Double.valueOf(r32.getDouble("timeout") / 1000.0d);
    L25:
        int r20 = 11;
        if (r32.has("excludeCredentials") == false) goto L52;
        JSONArray r21 = r32.getJSONArray("excludeCredentials");
        ArrayList r22 = new ArrayList();
        int r23 = 0;
    L29:
        if (r23 >= r21.length()) goto L51;
        JSONObject r24 = r21.getJSONObject(r23);
        Parcelable.Creator<yr3> r110 = yr3.CREATOR;
        String r111 = r24.getString("type");
        byte[] r25 = Base64.decode(r24.getString(r2), r20);
        if (r24.has("transports") == false) goto L49;
        JSONArray r26 = r24.getJSONArray("transports");
        if (r26 == null) goto L49;
        HashSet r27 = new HashSet(r26.length());
        int r28 = 0;
    L37:
        if (r28 >= r26.length()) goto L48;
        String r29 = r26.getString(r28);
        if (r29 != null) goto L41;
    L46:
        String r210 = r2;
    L47:
        r28 = r28 + 1;
        r2 = r210;
        goto L37
    L41:
        if (r29.isEmpty() == true) goto L46;
        r210 = r2;
        r27.add(Transport.a(r29));     // Catch: Transport.UnsupportedTransportException -> L45
    L45:
        Log.w("Transport", "Ignoring unrecognized transport ".concat(r29));
        goto L47
    L48:
        String r211 = r2;
        ArrayList r30 = new ArrayList(r27);
    L50:
        r22.add(new yr3(r111, r25, r30));
        r23 = r23 + 1;
        r21 = r21;
        r2 = r211;
        r20 = 11;
    L49:
        r211 = r2;
        r30 = null;
        goto L50
    L51:
        ArrayList r112 = r22;
    L54:
        if (r32.has("authenticatorSelection") == false) goto L72;
        JSONObject r31 = r32.getJSONObject("authenticatorSelection");
        if (r31.has("authenticatorAttachment") == false) goto L58;
        String r33 = r31.optString("authenticatorAttachment");
    L60:
        if (r31.has("residentKey") == false) goto L62;
        String r34 = r31.optString("residentKey");
    L64:
        if (r31.has("requireResidentKey") == false) goto L66;
        Boolean r35 = Boolean.valueOf(r31.optBoolean("requireResidentKey"));
    L68:
        if (r31.has("userVerification") == false) goto L70;
        String r36 = r31.optString("userVerification");
    L71:
        nn r37 = new nn(r33, r35, r36, r34);
    L74:
        if (r32.has("extensions") == false) goto L135;
        JSONObject r38 = r32.getJSONObject("extensions");
        if (r38.has("fidoAppIdExtension") == false) goto L78;
        s61 r39 = new s61(r38.getJSONObject("fidoAppIdExtension").getString("appid"));
    L80:
        if (r38.has("appid") == false) goto L82;
        r39 = new s61(r38.getString("appid"));
    L82:
        s61 r212 = r39;
        if (r38.has("prf") == true) goto L85;
        int r40 = 0;
        if (r38.has("prfAlreadyHashed") == false) goto L93;
        mh5 r41 = mh5.b(r38.getJSONObject("prfAlreadyHashed"), true);
    L87:
        mh5 r213 = r41;
    L95:
        if (r38.has("cableAuthenticationExtension") == false) goto L101;
        JSONArray r42 = r38.getJSONArray("cableAuthenticationExtension");
        ArrayList r43 = new ArrayList();
    L98:
        if (r40 >= r42.length()) goto L100;
        JSONObject r44 = r42.getJSONObject(r40);
        r43.add(new qk5(r44.getLong("version"), Base64.decode(r44.getString("clientEid"), 11), Base64.decode(r44.getString("authenticatorEid"), 11), Base64.decode(r44.getString("sessionPreKey"), 11)));
        r40 = r40 + 1;
        goto L98
    L100:
        rk5 r214 = new rk5(r43);
    L103:
        if (r38.has("userVerificationMethodExtension") == false) goto L105;
        y25 r215 = new y25(r38.getJSONObject("userVerificationMethodExtension").getBoolean("uvm"));
    L107:
        if (r38.has("google_multiAssertionExtension") == false) goto L109;
        wk5 r216 = new wk5(r38.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion"));
    L111:
        if (r38.has("google_sessionIdExtension") == false) goto L113;
        gh5 r217 = new gh5(r38.getJSONObject("google_sessionIdExtension").getInt("sessionId"));
    L115:
        if (r38.has("google_silentVerificationExtension") == false) goto L117;
        hh5 r218 = new hh5(r38.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification"));
    L119:
        if (r38.has("devicePublicKeyExtension") == false) goto L121;
        r38.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey");
        uk5 r219 = new uk5();
    L123:
        if (r38.has("google_tunnelServerIdExtension") == false) goto L125;
        kh5 r220 = new kh5(r38.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId"));
    L127:
        if (r38.has("google_thirdPartyPaymentExtension") == false) goto L129;
        pj1 r221 = new pj1(r38.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment"));
    L131:
        if (r38.has("txAuthSimple") == false) goto L133;
        nh5 r310 = new nh5(r38.getString("txAuthSimple"));
    L134:
        gn r222 = new gn(r212, r214, r215, r216, r217, r218, r219, r220, r221, r213, r310, null);
    L137:
        if (r32.has("attestation") == true) goto L151;
        hl r0 = null;
    L144:
        if (r0 != null) goto L146;
        String r113 = null;
    L148:
        return new xr3(r10, r12, r13, r15, r19, r112, r37, null, null, r113, r222, null, null);
    L146:
        r113 = r0.n;
        goto L148
    L151:
        r0 = hl.a(r32.getString("attestation"));     // Catch: AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException -> L140
    L140:
        e = move-exception;
        Log.w("PKCCreationOptions", "Invalid AttestationConveyancePreference", e);
        r0 = hl.o;
        goto L144
    L133:
        r310 = null;
        goto L134
    L129:
        r221 = null;
        goto L131
    L125:
        r220 = null;
        goto L127
    L121:
        r219 = null;
        goto L123
    L117:
        r218 = null;
        goto L119
    L113:
        r217 = null;
        goto L115
    L109:
        r216 = null;
        goto L111
    L105:
        r215 = null;
        goto L107
    L101:
        r214 = null;
        goto L103
    L93:
        r213 = null;
        goto L95
    L85:
        if (r38.has("prfAlreadyHashed") == true) goto L89;
        r40 = 0;
        r41 = mh5.b(r38.getJSONObject("prf"), false);
        goto L87
    L89:
        throw new JSONException("both prf and prfAlreadyHashed extensions found");
    L78:
        r39 = null;
        goto L80
    L135:
        r222 = null;
        goto L137
    L70:
        r36 = null;
        goto L71
    L66:
        r35 = null;
        goto L68
    L62:
        r34 = null;
        goto L64
    L58:
        r33 = null;
        goto L60
    L72:
        r37 = null;
        goto L74
    L52:
        r112 = null;
        goto L54
    L24:
        r19 = null;
        goto L25
    L9:
        r11 = null;
        goto L10
    L5:
        r4 = null;
        goto L6
    }

    public final boolean equals(Object r6) {
        if ((r6 instanceof xr3) == true) goto L5;
        return false;
    L5:
        xr3 r7 = (xr3) r6;
        List r0 = r7.q;
        List r2 = r7.s;
        if (au0.n(this.n, r7.n) == true) goto L8;
    L40:
        return false;
    L8:
        if (au0.n(this.o, r7.o) == false) goto L40;
        if (Arrays.equals(this.p, r7.p) == false) goto L40;
        if (au0.n(this.r, r7.r) == false) goto L40;
        List r3 = this.q;
        if (r3.containsAll(r0) == false) goto L40;
        if (r0.containsAll(r3) == false) goto L40;
        List r1 = this.s;
        if (r1 != null) goto L20;
        if (r2 != null) goto L20;
    L27:
        if (au0.n(this.t, r7.t) == false) goto L40;
        if (au0.n(this.u, r7.u) == false) goto L40;
        if (au0.n(this.v, r7.v) == false) goto L40;
        if (au0.n(this.w, r7.w) == false) goto L40;
        if (au0.n(this.x, r7.x) == false) goto L40;
        if (au0.n(this.y, r7.y) == false) goto L40;
        return true;
    L20:
        if (r1 == null) goto L40;
        if (r2 == null) goto L40;
        if (r1.containsAll(r2) == false) goto L40;
        if (r2.containsAll(r1) == false) goto L40;
        goto L40
    }

    public final int hashCode() {
        Integer r3 = Integer.valueOf(Arrays.hashCode(this.p));
        gn r11 = this.x;
        String r12 = this.y;
        return Arrays.hashCode(new Object[]{this.n, this.o, r3, this.q, this.r, this.s, this.t, this.u, this.v, this.w, r11, r12});
    }

    public final String toString() {
        String r0 = String.valueOf(this.n);
        String r1 = String.valueOf(this.o);
        String r2 = ya4.n(this.p);
        String r3 = String.valueOf(this.q);
        String r4 = String.valueOf(this.s);
        String r5 = String.valueOf(this.t);
        String r6 = String.valueOf(this.v);
        String r7 = String.valueOf(this.w);
        String r8 = String.valueOf(this.x);
        StringBuilder r9 = b11.u("PublicKeyCredentialCreationOptions{\n rp=", r0, ", \n user=", r1, ", \n challenge=");
        f34.n(r9, r2, ", \n parameters=", r3, ", \n timeoutSeconds=");
        r9.append(this.r);
        r9.append(", \n excludeList=");
        r9.append(r4);
        r9.append(", \n authenticatorSelection=");
        r9.append(r5);
        r9.append(", \n requestId=");
        r9.append(this.u);
        r9.append(", \n tokenBinding=");
        r9.append(r6);
        r9.append(", \n attestationConveyancePreference=");
        r9.append(r7);
        r9.append(", \n authenticationExtensions=");
        r9.append(r8);
        r9.append("}");
        return r9.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r6, int r7) {
        int r0 = ud3.R0(r6, 20293);
        ud3.M0(r6, 2, this.n, r7);
        ud3.M0(r6, 3, this.o, r7);
        ud3.L0(r6, 4, this.p);
        ud3.Q0(r6, 5, this.q);
        Double r3 = this.r;
        if (r3 == null) goto L6;
        ud3.T0(r6, 6, 8);
        r6.writeDouble(r3.doubleValue());
    L6:
        ud3.Q0(r6, 7, this.s);
        ud3.M0(r6, 8, this.t, r7);
        Integer r1 = this.u;
        if (r1 == null) goto L10;
        ud3.T0(r6, 9, 4);
        r6.writeInt(r1.intValue());
    L10:
        ud3.M0(r6, 10, this.v, r7);
        hl r2 = this.w;
        if (r2 != null) goto L13;
        String r4 = null;
    L14:
        ud3.O0(r6, 11, r4);
        ud3.M0(r6, 12, this.x, r7);
        ud3.O0(r6, 13, this.y);
        ud3.M0(r6, 14, this.z, r7);
        ud3.S0(r6, r0);
        return;
    L13:
        r4 = r2.n;
        goto L14
    }
}
