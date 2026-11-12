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
    public static final Parcelable.Creator<xr3> CREATOR = new ch5(13);
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

    public xr3(as3 as3Var, cs3 cs3Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, nn nnVar, Integer num, su4 su4Var, String str, gn gnVar, String str2, ResultReceiver resultReceiver) {
        this.z = resultReceiver;
        if (str2 != null) {
            try {
                xr3 xr3VarB = b(new JSONObject(str2));
                this.n = xr3VarB.n;
                this.o = xr3VarB.o;
                this.p = xr3VarB.p;
                this.q = xr3VarB.q;
                this.r = xr3VarB.r;
                this.s = xr3VarB.s;
                this.t = xr3VarB.t;
                this.u = xr3VarB.u;
                this.v = xr3VarB.v;
                this.w = xr3VarB.w;
                this.x = xr3VarB.x;
                this.y = str2;
                return;
            } catch (JSONException e) {
                throw new IllegalArgumentException(e);
            }
        }
        ji2.m(as3Var);
        this.n = as3Var;
        ji2.m(cs3Var);
        this.o = cs3Var;
        ji2.m(bArr);
        this.p = bArr;
        ji2.m(arrayList);
        this.q = arrayList;
        this.r = d;
        this.s = arrayList2;
        this.t = nnVar;
        this.u = num;
        this.v = su4Var;
        if (str != null) {
            try {
                this.w = hl.a(str);
            } catch (AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException e2) {
                throw new IllegalArgumentException(e2);
            }
        } else {
            this.w = null;
        }
        this.x = gnVar;
        this.y = null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x025e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0268  */
    /* JADX WARN: Code duplicated, block: B:105:0x027a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0284  */
    /* JADX WARN: Code duplicated, block: B:109:0x0296  */
    /* JADX WARN: Code duplicated, block: B:112:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:113:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:116:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:117:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:120:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:121:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:124:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:125:0x0306  */
    /* JADX WARN: Code duplicated, block: B:128:0x0310  */
    /* JADX WARN: Code duplicated, block: B:129:0x0322  */
    /* JADX WARN: Code duplicated, block: B:132:0x032c  */
    /* JADX WARN: Code duplicated, block: B:133:0x0338  */
    /* JADX WARN: Code duplicated, block: B:96:0x0210  */
    /* JADX WARN: Code duplicated, block: B:99:0x021f A[LOOP:3: B:97:0x0219->B:99:0x021f, LOOP_END] */
    public static xr3 b(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList;
        nn nnVar;
        gn gnVar;
        hl hlVarA;
        int i;
        mh5 mh5Var;
        mh5 mh5VarB;
        rk5 rk5Var;
        y25 y25Var;
        wk5 wk5Var;
        gh5 gh5Var;
        hh5 hh5Var;
        uk5 uk5Var;
        kh5 kh5Var;
        pj1 pj1Var;
        nh5 nh5Var;
        JSONArray jSONArray;
        ArrayList arrayList2;
        String str;
        ArrayList arrayList3;
        JSONArray jSONArray2;
        String str2;
        bb3 th5Var;
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        String str3 = "id";
        as3 as3Var = new as3(jSONObject2.getString("id"), jSONObject2.getString("name"), jSONObject2.has("icon") ? jSONObject2.optString("icon") : null);
        JSONObject jSONObject3 = jSONObject.getJSONObject("user");
        cs3 cs3Var = new cs3(jSONObject3.getString("name"), jSONObject3.has("icon") ? jSONObject3.optString("icon") : null, jSONObject3.optString("displayName"), ya4.k(jSONObject3.getString("id")));
        byte[] bArrK = ya4.k(jSONObject.getString("challenge"));
        ji2.m(bArrK);
        JSONArray jSONArray3 = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList4 = new ArrayList();
        for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
            JSONObject jSONObject4 = jSONArray3.getJSONObject(i2);
            try {
                th5Var = new th5(new zr3(jSONObject4.getInt("alg"), jSONObject4.getString("type")));
            } catch (IllegalArgumentException unused) {
                th5Var = oh5.n;
            }
            if (th5Var.d()) {
                arrayList4.add(th5Var.c());
            }
        }
        Double dValueOf = jSONObject.has("timeout") ? Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d) : null;
        int i3 = 11;
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray4 = jSONObject.getJSONArray("excludeCredentials");
            ArrayList arrayList5 = new ArrayList();
            int i4 = 0;
            while (i4 < jSONArray4.length()) {
                JSONObject jSONObject5 = jSONArray4.getJSONObject(i4);
                Parcelable.Creator<yr3> creator = yr3.CREATOR;
                String string = jSONObject5.getString("type");
                byte[] bArrDecode = Base64.decode(jSONObject5.getString(str3), i3);
                if (!jSONObject5.has("transports") || (jSONArray2 = jSONObject5.getJSONArray("transports")) == null) {
                    str = str3;
                    arrayList3 = null;
                } else {
                    HashSet hashSet = new HashSet(jSONArray2.length());
                    int i5 = 0;
                    while (i5 < jSONArray2.length()) {
                        String string2 = jSONArray2.getString(i5);
                        if (string2 == null || string2.isEmpty()) {
                            str2 = str3;
                        } else {
                            str2 = str3;
                            try {
                                hashSet.add(Transport.a(string2));
                            } catch (Transport.UnsupportedTransportException unused2) {
                                Log.w("Transport", "Ignoring unrecognized transport ".concat(string2));
                            }
                        }
                        i5++;
                        str3 = str2;
                    }
                    str = str3;
                    arrayList3 = new ArrayList(hashSet);
                }
                arrayList5.add(new yr3(string, bArrDecode, arrayList3));
                i4++;
                jSONArray4 = jSONArray4;
                str3 = str;
                i3 = 11;
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        if (jSONObject.has("authenticatorSelection")) {
            JSONObject jSONObject6 = jSONObject.getJSONObject("authenticatorSelection");
            nnVar = new nn(jSONObject6.has("authenticatorAttachment") ? jSONObject6.optString("authenticatorAttachment") : null, jSONObject6.has("requireResidentKey") ? Boolean.valueOf(jSONObject6.optBoolean("requireResidentKey")) : null, jSONObject6.has("userVerification") ? jSONObject6.optString("userVerification") : null, jSONObject6.has("residentKey") ? jSONObject6.optString("residentKey") : null);
        } else {
            nnVar = null;
        }
        if (jSONObject.has("extensions")) {
            JSONObject jSONObject7 = jSONObject.getJSONObject("extensions");
            s61 s61Var = jSONObject7.has("fidoAppIdExtension") ? new s61(jSONObject7.getJSONObject("fidoAppIdExtension").getString("appid")) : null;
            if (jSONObject7.has("appid")) {
                s61Var = new s61(jSONObject7.getString("appid"));
            }
            s61 s61Var2 = s61Var;
            if (!jSONObject7.has("prf")) {
                i = 0;
                if (jSONObject7.has("prfAlreadyHashed")) {
                    mh5VarB = mh5.b(jSONObject7.getJSONObject("prfAlreadyHashed"), true);
                } else {
                    mh5Var = null;
                }
                if (jSONObject7.has("cableAuthenticationExtension")) {
                    jSONArray = jSONObject7.getJSONArray("cableAuthenticationExtension");
                    arrayList2 = new ArrayList();
                    while (i < jSONArray.length()) {
                        JSONObject jSONObject8 = jSONArray.getJSONObject(i);
                        arrayList2.add(new qk5(jSONObject8.getLong("version"), Base64.decode(jSONObject8.getString("clientEid"), 11), Base64.decode(jSONObject8.getString("authenticatorEid"), 11), Base64.decode(jSONObject8.getString("sessionPreKey"), 11)));
                        i++;
                    }
                    rk5Var = new rk5(arrayList2);
                } else {
                    rk5Var = null;
                }
                if (jSONObject7.has("userVerificationMethodExtension")) {
                    y25Var = new y25(jSONObject7.getJSONObject("userVerificationMethodExtension").getBoolean("uvm"));
                } else {
                    y25Var = null;
                }
                if (jSONObject7.has("google_multiAssertionExtension")) {
                    wk5Var = new wk5(jSONObject7.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion"));
                } else {
                    wk5Var = null;
                }
                if (jSONObject7.has("google_sessionIdExtension")) {
                    gh5Var = new gh5(jSONObject7.getJSONObject("google_sessionIdExtension").getInt("sessionId"));
                } else {
                    gh5Var = null;
                }
                if (jSONObject7.has("google_silentVerificationExtension")) {
                    hh5Var = new hh5(jSONObject7.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification"));
                } else {
                    hh5Var = null;
                }
                if (jSONObject7.has("devicePublicKeyExtension")) {
                    jSONObject7.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey");
                    uk5Var = new uk5();
                } else {
                    uk5Var = null;
                }
                if (jSONObject7.has("google_tunnelServerIdExtension")) {
                    kh5Var = new kh5(jSONObject7.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId"));
                } else {
                    kh5Var = null;
                }
                if (jSONObject7.has("google_thirdPartyPaymentExtension")) {
                    pj1Var = new pj1(jSONObject7.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment"));
                } else {
                    pj1Var = null;
                }
                if (jSONObject7.has("txAuthSimple")) {
                    nh5Var = new nh5(jSONObject7.getString("txAuthSimple"));
                } else {
                    nh5Var = null;
                }
                gnVar = new gn(s61Var2, rk5Var, y25Var, wk5Var, gh5Var, hh5Var, uk5Var, kh5Var, pj1Var, mh5Var, nh5Var, null);
            } else {
                if (jSONObject7.has("prfAlreadyHashed")) {
                    throw new JSONException("both prf and prfAlreadyHashed extensions found");
                }
                i = 0;
                mh5VarB = mh5.b(jSONObject7.getJSONObject("prf"), false);
            }
            mh5Var = mh5VarB;
            if (jSONObject7.has("cableAuthenticationExtension")) {
                jSONArray = jSONObject7.getJSONArray("cableAuthenticationExtension");
                arrayList2 = new ArrayList();
                while (i < jSONArray.length()) {
                    JSONObject jSONObject9 = jSONArray.getJSONObject(i);
                    arrayList2.add(new qk5(jSONObject9.getLong("version"), Base64.decode(jSONObject9.getString("clientEid"), 11), Base64.decode(jSONObject9.getString("authenticatorEid"), 11), Base64.decode(jSONObject9.getString("sessionPreKey"), 11)));
                    i++;
                }
                rk5Var = new rk5(arrayList2);
            } else {
                rk5Var = null;
            }
            if (jSONObject7.has("userVerificationMethodExtension")) {
                y25Var = new y25(jSONObject7.getJSONObject("userVerificationMethodExtension").getBoolean("uvm"));
            } else {
                y25Var = null;
            }
            if (jSONObject7.has("google_multiAssertionExtension")) {
                wk5Var = new wk5(jSONObject7.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion"));
            } else {
                wk5Var = null;
            }
            if (jSONObject7.has("google_sessionIdExtension")) {
                gh5Var = new gh5(jSONObject7.getJSONObject("google_sessionIdExtension").getInt("sessionId"));
            } else {
                gh5Var = null;
            }
            if (jSONObject7.has("google_silentVerificationExtension")) {
                hh5Var = new hh5(jSONObject7.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification"));
            } else {
                hh5Var = null;
            }
            if (jSONObject7.has("devicePublicKeyExtension")) {
                jSONObject7.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey");
                uk5Var = new uk5();
            } else {
                uk5Var = null;
            }
            if (jSONObject7.has("google_tunnelServerIdExtension")) {
                kh5Var = new kh5(jSONObject7.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId"));
            } else {
                kh5Var = null;
            }
            if (jSONObject7.has("google_thirdPartyPaymentExtension")) {
                pj1Var = new pj1(jSONObject7.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment"));
            } else {
                pj1Var = null;
            }
            if (jSONObject7.has("txAuthSimple")) {
                nh5Var = new nh5(jSONObject7.getString("txAuthSimple"));
            } else {
                nh5Var = null;
            }
            gnVar = new gn(s61Var2, rk5Var, y25Var, wk5Var, gh5Var, hh5Var, uk5Var, kh5Var, pj1Var, mh5Var, nh5Var, null);
        } else {
            gnVar = null;
        }
        if (jSONObject.has("attestation")) {
            try {
                hlVarA = hl.a(jSONObject.getString("attestation"));
            } catch (AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException e) {
                Log.w("PKCCreationOptions", "Invalid AttestationConveyancePreference", e);
                hlVarA = hl.o;
            }
        } else {
            hlVarA = null;
        }
        return new xr3(as3Var, cs3Var, bArrK, arrayList4, dValueOf, arrayList, nnVar, null, null, hlVarA == null ? null : hlVarA.n, gnVar, null, null);
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof xr3)) {
            return false;
        }
        xr3 xr3Var = (xr3) obj;
        List list2 = xr3Var.q;
        List list3 = xr3Var.s;
        if (au0.n(this.n, xr3Var.n) && au0.n(this.o, xr3Var.o) && Arrays.equals(this.p, xr3Var.p) && au0.n(this.r, xr3Var.r)) {
            List list4 = this.q;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.s) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && au0.n(this.t, xr3Var.t) && au0.n(this.u, xr3Var.u) && au0.n(this.v, xr3Var.v) && au0.n(this.w, xr3Var.w) && au0.n(this.x, xr3Var.x) && au0.n(this.y, xr3Var.y))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.n, this.o, Integer.valueOf(Arrays.hashCode(this.p)), this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.n);
        String strValueOf2 = String.valueOf(this.o);
        String strN = ya4.n(this.p);
        String strValueOf3 = String.valueOf(this.q);
        String strValueOf4 = String.valueOf(this.s);
        String strValueOf5 = String.valueOf(this.t);
        String strValueOf6 = String.valueOf(this.v);
        String strValueOf7 = String.valueOf(this.w);
        String strValueOf8 = String.valueOf(this.x);
        StringBuilder sbU = b11.u("PublicKeyCredentialCreationOptions{\n rp=", strValueOf, ", \n user=", strValueOf2, ", \n challenge=");
        f34.n(sbU, strN, ", \n parameters=", strValueOf3, ", \n timeoutSeconds=");
        sbU.append(this.r);
        sbU.append(", \n excludeList=");
        sbU.append(strValueOf4);
        sbU.append(", \n authenticatorSelection=");
        sbU.append(strValueOf5);
        sbU.append(", \n requestId=");
        sbU.append(this.u);
        sbU.append(", \n tokenBinding=");
        sbU.append(strValueOf6);
        sbU.append(", \n attestationConveyancePreference=");
        sbU.append(strValueOf7);
        sbU.append(", \n authenticationExtensions=");
        sbU.append(strValueOf8);
        sbU.append("}");
        return sbU.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR0 = ud3.R0(parcel, 20293);
        ud3.M0(parcel, 2, this.n, i);
        ud3.M0(parcel, 3, this.o, i);
        ud3.L0(parcel, 4, this.p);
        ud3.Q0(parcel, 5, this.q);
        Double d = this.r;
        if (d != null) {
            ud3.T0(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        ud3.Q0(parcel, 7, this.s);
        ud3.M0(parcel, 8, this.t, i);
        Integer num = this.u;
        if (num != null) {
            ud3.T0(parcel, 9, 4);
            parcel.writeInt(num.intValue());
        }
        ud3.M0(parcel, 10, this.v, i);
        hl hlVar = this.w;
        ud3.O0(parcel, 11, hlVar == null ? null : hlVar.n);
        ud3.M0(parcel, 12, this.x, i);
        ud3.O0(parcel, 13, this.y);
        ud3.M0(parcel, 14, this.z, i);
        ud3.S0(parcel, iR0);
    }
}
