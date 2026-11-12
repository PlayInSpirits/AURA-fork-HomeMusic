package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mh5 extends h2 {
    public static final Parcelable.Creator<mh5> CREATOR = new ch5(12);
    public static final byte[] o = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);
    public final byte[][] n;

    public mh5(byte[][] bArr) {
        ji2.i(bArr != null);
        ji2.i(1 == ((bArr.length & 1) ^ 1));
        int i = 0;
        while (i < bArr.length) {
            ji2.i(i == 0 || bArr[i] != null);
            int i2 = i + 1;
            ji2.i(bArr[i2] != null);
            int length = bArr[i2].length;
            ji2.i(length == 32 || length == 64);
            i += 2;
        }
        this.n = bArr;
    }

    public static mh5 b(JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z) {
                    arrayList.add(e(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(f(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    arrayList.add(ya4.k(next));
                    if (z) {
                        arrayList.add(e(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(f(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new mh5((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    public static JSONObject c(byte[] bArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", Base64.encodeToString(bArr, 11));
            return jSONObject;
        }
        jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return jSONObject;
    }

    public static byte[] d(byte[] bArr) {
        i iVar;
        int i = ej5.a;
        gj5 gj5Var = dj5.a;
        int i2 = gj5Var.H;
        MessageDigest messageDigest = gj5Var.G;
        if (gj5Var.I) {
            try {
                iVar = new i((MessageDigest) messageDigest.clone(), i2);
            } catch (CloneNotSupportedException unused) {
                try {
                    iVar = new i(MessageDigest.getInstance(messageDigest.getAlgorithm()), i2);
                } catch (NoSuchAlgorithmException e) {
                    throw new AssertionError(e);
                }
            }
        } else {
            iVar = new i(MessageDigest.getInstance(messageDigest.getAlgorithm()), i2);
        }
        MessageDigest messageDigest2 = (MessageDigest) iVar.c;
        byte[] bArr2 = o;
        bArr2.getClass();
        int length = bArr2.length;
        if (iVar.b) {
            kf2.o("Cannot re-use a Hasher after calling hash() on it");
            return null;
        }
        messageDigest2.update(bArr2, 0, length);
        bArr.getClass();
        int length2 = bArr.length;
        if (iVar.b) {
            kf2.o("Cannot re-use a Hasher after calling hash() on it");
            return null;
        }
        messageDigest2.update(bArr, 0, length2);
        if (iVar.b) {
            kf2.o("Cannot re-use a Hasher after calling hash() on it");
            return null;
        }
        iVar.b = true;
        int i3 = iVar.a;
        return (byte[]) (i3 == messageDigest2.getDigestLength() ? new bj5(messageDigest2.digest()) : new bj5(Arrays.copyOf(messageDigest2.digest(), i3))).o.clone();
    }

    public static byte[] e(JSONObject jSONObject) throws JSONException {
        byte[] bArrK = ya4.k(jSONObject.getString("first"));
        if (bArrK.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return bArrK;
        }
        byte[] bArrK2 = ya4.k(jSONObject.getString("second"));
        if (bArrK2.length == 32) {
            return kb4.c0(bArrK, bArrK2);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    public static byte[] f(JSONObject jSONObject) {
        byte[] bArrD = d(ya4.k(jSONObject.getString("first")));
        return !jSONObject.has("second") ? bArrD : kb4.c0(bArrD, d(ya4.k(jSONObject.getString("second"))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mh5) {
            return Arrays.deepEquals(this.n, ((mh5) obj).n);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (byte[] bArr : this.n) {
            if (bArr != null) {
                iHashCode ^= Arrays.hashCode(new Object[]{bArr});
            }
        }
        return iHashCode;
    }

    public final String toString() {
        byte[][] bArr = this.n;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = null;
            for (int i = 0; i < bArr.length; i += 2) {
                if (bArr[i] == null) {
                    jSONObject.put("eval", c(bArr[i + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(ya4.n(bArr[i]), c(bArr[i + 1]));
                }
            }
            return "PrfExtension{" + jSONObject.toString() + "}";
        } catch (JSONException e) {
            return xa3.h("PrfExtension{Exception:", e.getMessage(), "}");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR0 = ud3.R0(parcel, 20293);
        byte[][] bArr = this.n;
        if (bArr != null) {
            int iR1 = ud3.R0(parcel, 1);
            parcel.writeInt(bArr.length);
            for (byte[] bArr2 : bArr) {
                parcel.writeByteArray(bArr2);
            }
            ud3.S0(parcel, iR1);
        }
        ud3.S0(parcel, iR0);
    }
}
