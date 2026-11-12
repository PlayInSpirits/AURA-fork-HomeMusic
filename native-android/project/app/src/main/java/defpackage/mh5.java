package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mh5 extends h2 {
    public static final Parcelable.Creator<mh5> CREATOR = null;
    public static final byte[] o = null;
    public final byte[][] n;

    static {
        CREATOR = new ch5(12);
        o = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);
    }

    public mh5(byte[][] r6) {
        if (r6 == null) goto L5;
        boolean r2 = true;
    L6:
        ji2.i(r2);
        if (1 == ((r6.length & 1) ^ 1)) goto L9;
        boolean r3 = false;
    L10:
        ji2.i(r3);
        int r4 = 0;
    L12:
        if (r4 >= r6.length) goto L29;
        if (r4 != 0) goto L15;
    L16:
        boolean r5 = true;
    L18:
        ji2.i(r5);
        int r7 = r4 + 1;
        if (r6[r7] == null) goto L21;
        boolean r8 = true;
    L22:
        ji2.i(r8);
        int r9 = r6[r7].length;
        if (r9 != 32) goto L25;
    L26:
        boolean r10 = true;
    L28:
        ji2.i(r10);
        r4 = r4 + 2;
        goto L12
    L25:
        if (r9 == 64) goto L26;
        r10 = false;
        goto L28
    L21:
        r8 = false;
        goto L22
    L15:
        if (r6[r4] != null) goto L16;
        r5 = false;
        goto L18
    L29:
        this.n = r6;
        return;
    L9:
        r3 = true;
        goto L10
    L5:
        r2 = false;
        goto L6
    }

    public static mh5 b(JSONObject r4, boolean r5) {
        ArrayList r2 = new ArrayList();
        if (r4.has("eval") == false) goto L10;
        r2.add(null);     // Catch: IllegalArgumentException -> L21
        if (r5 == false) goto L8;
        r2.add(e(r4.getJSONObject("eval")));     // Catch: IllegalArgumentException -> L21
        goto L10
    L8:
        r2.add(f(r4.getJSONObject("eval")));     // Catch: IllegalArgumentException -> L21
    L10:
        if (r4.has("evalByCredential") == false) goto L20;
        JSONObject r6 = r4.getJSONObject("evalByCredential");     // Catch: IllegalArgumentException -> L21
        Iterator<String> r0 = r6.keys();     // Catch: IllegalArgumentException -> L21
    L12:
        if (r0.hasNext() == false) goto L20;
        String r1 = r0.next();     // Catch: IllegalArgumentException -> L21
        r2.add(ya4.k(r1));     // Catch: IllegalArgumentException -> L21
        if (r5 == true) goto L16;
        r2.add(f(r6.getJSONObject(r1)));     // Catch: IllegalArgumentException -> L21
        goto L12
    L16:
        r2.add(e(r6.getJSONObject(r1)));     // Catch: IllegalArgumentException -> L21
    L20:
        return new mh5((byte[][]) r2.toArray(new byte[0][]));
    L22:
        throw new JSONException("invalid base64url value");
    }

    public static JSONObject c(byte[] r5) {
        JSONObject r0 = new JSONObject();
        if (r5.length != 32) goto L6;
        r0.put("first", Base64.encodeToString(r5, 11));
        return r0;
    L6:
        r0.put("first", Base64.encodeToString(r5, 0, 32, 11));
        r0.put("second", Base64.encodeToString(r5, 32, 32, 11));
        return r0;
    }

    public static byte[] d(byte[] r7) {
        int r0 = ej5.a;
        gj5 r1 = dj5.a;
        int r2 = r1.H;
        MessageDigest r3 = r1.G;
        if (r1.I == false) goto L31;
        i r4 = new i((MessageDigest) r3.clone(), r2);     // Catch: CloneNotSupportedException -> L30
    L9:
        MessageDigest r5 = (MessageDigest) r4.c;
        byte[] r6 = o;
        r6.getClass();
        int r8 = r6.length;
        if (r4.b == true) goto L25;
        r5.update(r6, 0, r8);
        r7.getClass();
        int r9 = r7.length;
        if (r4.b == true) goto L23;
        r5.update(r7, 0, r9);
        if (r4.b == true) goto L21;
        r4.b = true;
        int r10 = r4.a;
        if (r10 != r5.getDigestLength()) goto L18;
        bj5 r11 = new bj5(r5.digest());
    L20:
        return (byte[]) r11.o.clone();
    L18:
        r11 = new bj5(Arrays.copyOf(r5.digest(), r10));
        goto L20
    L21:
        kf2.o("Cannot re-use a Hasher after calling hash() on it");
        return null;
    L23:
        kf2.o("Cannot re-use a Hasher after calling hash() on it");
        return null;
    L25:
        kf2.o("Cannot re-use a Hasher after calling hash() on it");
        return null;
    L31:
        r4 = new i(MessageDigest.getInstance(r3.getAlgorithm()), r2);
    L27:
        e = move-exception;
        throw new AssertionError(e);
    }

    public static byte[] e(JSONObject r5) {
        byte[] r0 = ya4.k(r5.getString("first"));
        if (r0.length != 32) goto L14;
        if (r5.has("second") == true) goto L7;
        return r0;
    L7:
        byte[] r6 = ya4.k(r5.getString("second"));
        if (r6.length != 32) goto L12;
        return kb4.c0(new byte[][]{r0, r6});
    L12:
        throw new JSONException("hashed PRF value with wrong length");
    L14:
        throw new JSONException("hashed PRF value with wrong length");
    }

    public static byte[] f(JSONObject r3) {
        byte[] r0 = d(ya4.k(r3.getString("first")));
        if (r3.has("second") == true) goto L6;
        return r0;
    L6:
        return kb4.c0(new byte[][]{r0, d(ya4.k(r3.getString("second")))});
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof mh5) == true) goto L7;
        return false;
    L7:
        return Arrays.deepEquals(this.n, ((mh5) r2).n);
    }

    public final int hashCode() {
        byte[][] r4 = this.n;
        int r0 = r4.length;
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r0) goto L8;
        byte[] r3 = r4[r1];
        if (r3 == null) goto L7;
        r2 = r2 ^ Arrays.hashCode(new Object[]{r3});
    L7:
        r1 = r1 + 1;
        goto L3
    L8:
        return r2;
    }

    public final String toString() {
        byte[][] r6 = this.n;
        JSONObject r1 = new JSONObject();     // Catch: JSONException -> L9
        int r2 = 0;
        JSONObject r3 = null;
    L5:
        if (r2 >= r6.length) goto L15;
        if (r6[r2] != null) goto L11;
        r1.put("eval", c(r6[r2 + 1]));     // Catch: JSONException -> L9
    L14:
        r2 = r2 + 2;     // Catch: JSONException -> L9
        goto L5
    L11:
        if (r3 != null) goto L13;
        r3 = new JSONObject();     // Catch: JSONException -> L9
        r1.put("evalByCredential", r3);     // Catch: JSONException -> L9
    L13:
        r3.put(ya4.n(r6[r2]), c(r6[r2 + 1]));     // Catch: JSONException -> L9
        goto L14
    L15:
        return "PrfExtension{" + r1.toString() + "}";
    L9:
        e = move-exception;
        return xa3.h("PrfExtension{Exception:", e.getMessage(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r5, int r6) {
        int r7 = ud3.R0(r5, 20293);
        byte[][] r4 = this.n;
        if (r4 == null) goto L9;
        int r0 = ud3.R0(r5, 1);
        int r1 = r4.length;
        r5.writeInt(r1);
        int r2 = 0;
    L6:
        if (r2 >= r1) goto L8;
        r5.writeByteArray(r4[r2]);
        r2 = r2 + 1;
        goto L6
    L8:
        ud3.S0(r5, r0);
    L9:
        ud3.S0(r5, r7);
    }
}
