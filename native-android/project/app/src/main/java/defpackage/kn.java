package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.internal.fido.zzhj;
import com.google.android.gms.internal.fido.zzho;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kn extends mn {
    public static final Parcelable.Creator<kn> CREATOR = null;
    public final rj5 n;
    public final rj5 o;
    public final rj5 p;
    public final String[] q;

    static {
        CREATOR = new rh5(8);
    }

    public kn(byte[] r2, byte[] r3, byte[] r4, String[] r5) {
        ji2.m(r2);
        rj5 r6 = rj5.i(r2.length, r2);
        ji2.m(r3);
        rj5 r7 = rj5.i(r3.length, r3);
        ji2.m(r4);
        rj5 r8 = rj5.i(r4.length, r4);
        this.n = r6;
        this.o = r7;
        this.p = r8;
        ji2.m(r5);
        this.q = r5;
    }

    public final JSONObject b() {
        String[] r4 = this.q;
        JSONObject r6 = new JSONObject();     // Catch: JSONException -> L7
        rj5 r7 = this.o;     // Catch: JSONException -> L7
        if (r7 == null) goto L9;
        r6.put("clientDataJSON", ya4.n(r7.j()));     // Catch: JSONException -> L7
    L9:
        rj5 r0 = this.p;
        if (r0 == null) goto L12;
        r6.put("attestationObject", ya4.n(r0.j()));     // Catch: JSONException -> L7
    L12:
        JSONArray r8 = new JSONArray();     // Catch: JSONException -> L7
        int r9 = 0;
    L14:
        if (r9 < r4.length) goto L16;
        r6.put("transports", r8);     // Catch: JSONException -> L7
        ak5 r1 = (ak5) ((yj5) ak5.e(r0.j()).c(yj5.class)).o.get(new zj5("authData"));     // Catch: JSONException -> L7 zzho -> L122
        if (r1 == null) goto L158;
        rj5 r2 = ((wj5) r1.c(wj5.class)).n;     // Catch: JSONException -> L7 zzho -> L122
        byte[] r5 = r2.o;     // Catch: JSONException -> L7
        ByteBuffer r10 = ByteBuffer.wrap(r5, 0, r2.e()).asReadOnlyBuffer();     // Catch: JSONException -> L7
        r10.position(r10.position() + 32);     // Catch: JSONException -> L7 IllegalArgumentException -> L114
        if ((r10.get() & 64) == 0) goto L160;
        r10.position(r10.position() + 4);     // Catch: JSONException -> L7 IllegalArgumentException -> L114
        r10.position(r10.position() + 16);     // Catch: JSONException -> L7 IllegalArgumentException -> L114
        r10.position(r10.position() + r10.getShort());     // Catch: JSONException -> L7 IllegalArgumentException -> L114
        int r11 = r10.position();     // Catch: JSONException -> L7 zzhj -> L108 zzho -> L110
        int r12 = rj5.h(r11, r5.length, r2.e());     // Catch: JSONException -> L7 zzhj -> L108 zzho -> L110
        if (r12 != 0) goto L32;
        rj5 r13 = rj5.p;     // Catch: JSONException -> L7 zzhj -> L108 zzho -> L110
    L33:
        ck5 r14 = new ck5(r13.g());     // Catch: JSONException -> L7 zzhj -> L108 zzho -> L110
        ak5 r15 = vr1.J(r14);     // Catch: Throwable -> L99
        r14.close();     // Catch: JSONException -> L7 IOException -> L138 zzho -> L110
    L36:
        ji5 r3 = ((yj5) r15.c(yj5.class)).o;     // Catch: JSONException -> L7
        ak5 r16 = (ak5) r3.get(new xj5(3));     // Catch: JSONException -> L7
        ak5 r17 = (ak5) r3.get(new xj5(1));     // Catch: JSONException -> L7
        if (r16 == null) goto L98;
        if (r17 == null) goto L98;
        long r18 = ((xj5) r16.c(xj5.class)).n;     // Catch: JSONException -> L7 zzho -> L93
        long r19 = ((xj5) r17.c(xj5.class)).n;     // Catch: JSONException -> L7 zzho -> L93
        if (r19 != 1) goto L44;
    L47:
        JSONObject r20 = r6;
        ak5 r21 = (ak5) r3.get(new xj5(-1));     // Catch: JSONException -> L64 zzho -> L66
        if (r21 == null) goto L92;
        long r22 = ((xj5) r21.c(xj5.class)).n;     // Catch: JSONException -> L64 zzho -> L66
        if (r19 != 2) goto L73;
        if (r22 != 1) goto L73;
        ak5 r23 = (ak5) r3.get(new xj5(-2));     // Catch: JSONException -> L64 zzho -> L66
        ak5 r24 = (ak5) r3.get(new xj5(-3));     // Catch: JSONException -> L64 zzho -> L66
        if (r23 == null) goto L71;
        if (r24 == null) goto L71;
        rj5 r25 = ((wj5) r23.c(wj5.class)).n;     // Catch: JSONException -> L64 zzho -> L66
        rj5 r26 = ((wj5) r24.c(wj5.class)).n;     // Catch: JSONException -> L64 zzho -> L66
        if (r25.o.length != 32) goto L69;
        if (r26.o.length != 32) goto L69;
        byte[] r27 = kb4.c0(new byte[][]{Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), r25.j(), r26.j()});     // Catch: JSONException -> L64 zzho -> L66
    L86:
        JSONObject r28 = r20;
        r28.put("authenticatorData", ya4.n(r2.j()));     // Catch: JSONException -> L64
        r28.put("publicKeyAlgorithm", r18);     // Catch: JSONException -> L64
        if (r27 == null) goto L89;
        r28.put("publicKey", Base64.encodeToString(r27, 11));     // Catch: JSONException -> L64
    L89:
        return r28;
    L69:
        throw new IllegalArgumentException("COSE coordinates are the wrong size");     // Catch: JSONException -> L64 zzho -> L66
    L71:
        throw new IllegalArgumentException("COSE key missing required fields");     // Catch: JSONException -> L64 zzho -> L66
    L73:
        if (r19 == 1) goto L75;
    L85:
        r27 = null;
        goto L86
    L75:
        if (r22 != 6) goto L85;
        ak5 r29 = (ak5) r3.get(new xj5(-2));     // Catch: JSONException -> L64 zzho -> L66
        if (r29 == null) goto L84;
        rj5 r30 = ((wj5) r29.c(wj5.class)).n;     // Catch: JSONException -> L64 zzho -> L66
        if (r30.o.length != 32) goto L82;
        r27 = kb4.c0(new byte[][]{Base64.decode("MCowBQYDK2VwAyEA", 0), r30.j()});     // Catch: JSONException -> L64 zzho -> L66
        goto L86
    L82:
        throw new IllegalArgumentException("COSE coordinates are the wrong size");     // Catch: JSONException -> L64 zzho -> L66
    L84:
        throw new IllegalArgumentException("COSE key missing required fields");     // Catch: JSONException -> L64 zzho -> L66
    L92:
        throw new IllegalArgumentException("COSE key missing required fields");     // Catch: JSONException -> L64 zzho -> L66
    L66:
        e = e;
    L96:
        throw new IllegalArgumentException("COSE key ill-formed", e);     // Catch: JSONException -> L64
    L44:
        if (r19 != 2) goto L46;
        r19 = 2;
        goto L47
    L46:
        r20 = r6;
        r27 = null;
    L93:
        e = e;
    L98:
        throw new IllegalArgumentException("COSE key missing required fields");     // Catch: JSONException -> L64
    L99:
        th = move-exception;
        r14.close();     // Catch: JSONException -> L64 zzho -> L103 IOException -> L139
    L103:
        e = e;
    L113:
        throw new IllegalArgumentException("failed to parse COSE key", e);     // Catch: JSONException -> L64
    L145:
        throw th;     // Catch: JSONException -> L64 zzho -> L103 zzhj -> L106
    L106:
        e = e;
        goto L113
    L32:
        r13 = new qj5(r5, r11, r12);     // Catch: JSONException -> L7 zzhj -> L108 zzho -> L110
    L110:
        e = e;
    L108:
        e = e;
        goto L113
    L160:
    L119:
        e = e;
    L121:
        throw new IllegalArgumentException("ill-formed authenticator data", e);     // Catch: JSONException -> L64
    L118:
        throw new IllegalArgumentException("authData does not include credential data");     // Catch: JSONException -> L64 IllegalArgumentException -> L119
    L114:
        e = e;
        goto L121
    L158:
    L127:
        e = e;
    L129:
        throw new IllegalArgumentException("authData value has wrong type", e);     // Catch: JSONException -> L64
    L126:
        throw new IllegalArgumentException("attestation object missing authData");     // Catch: JSONException -> L64 zzho -> L127
    L122:
        e = e;
        goto L129
    L130:
        e = e;
    L135:
        throw new IllegalArgumentException("failed to parse attestation object", e);     // Catch: JSONException -> L64
    L132:
        e = e;
    L64:
        e = e;
    L136:
        nz2.s("Error encoding AuthenticatorAttestationResponse to JSON object", e);
        return null;
    L16:
        if (r4[r9].equals("cable") == false) goto L18;
        r8.put(r9, "hybrid");     // Catch: JSONException -> L7
    L19:
        r9 = r9 + 1;     // Catch: JSONException -> L7
        goto L14
    L18:
        r8.put(r9, r4[r9]);     // Catch: JSONException -> L7
    L7:
        e = e;
        goto L136
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof kn) == false) goto L17;
        kn r4 = (kn) r3;
        if (au0.n(this.n, r4.n) == true) goto L8;
        return false;
    L8:
        if (au0.n(this.o, r4.o) == true) goto L10;
        return false;
    L10:
        if (au0.n(this.p, r4.p) == false) goto L16;
        return true;
    L16:
        return false;
    L17:
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.n})), Integer.valueOf(Arrays.hashCode(new Object[]{this.o})), Integer.valueOf(Arrays.hashCode(new Object[]{this.p}))});
    }

    public final String toString() {
        ns3 r1 = new ns3(getClass().getSimpleName());
        ij5 r0 = kj5.d;
        byte[] r2 = this.n.j();
        r1.h(r0.c(r2.length, r2), "keyHandle");
        byte[] r3 = this.o.j();
        r1.h(r0.c(r3.length, r3), "clientDataJSON");
        byte[] r4 = this.p.j();
        r1.h(r0.c(r4.length, r4), "attestationObject");
        r1.h(Arrays.toString(this.q), "transports");
        return r1.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        int r5 = ud3.R0(r3, 20293);
        ud3.L0(r3, 2, this.n.j());
        ud3.L0(r3, 3, this.o.j());
        ud3.L0(r3, 4, this.p.j());
        String[] r2 = this.q;
        if (r2 == null) goto L6;
        int r0 = ud3.R0(r3, 5);
        r3.writeStringArray(r2);
        ud3.S0(r3, r0);
    L6:
        ud3.S0(r3, r5);
    }
}
