package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.h2;
import defpackage.j84;
import defpackage.ji2;
import defpackage.ud3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInAccount extends h2 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = null;
    public final int n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final Uri s;
    public String t;
    public final long u;
    public final String v;
    public final List w;
    public final String x;
    public final String y;
    public final HashSet z;

    static {
        CREATOR = new j84(13);
    }

    public GoogleSignInAccount(int r2, String r3, String r4, String r5, String r6, Uri r7, String r8, long r9, String r11, ArrayList r12, String r13, String r14) {
        this.z = new HashSet();
        this.n = r2;
        this.o = r3;
        this.p = r4;
        this.q = r5;
        this.r = r6;
        this.s = r7;
        this.t = r8;
        this.u = r9;
        this.v = r11;
        this.w = r12;
        this.x = r13;
        this.y = r14;
    }

    public static GoogleSignInAccount b(String r17) {
        String r1 = null;
        if (TextUtils.isEmpty(r17) == false) goto L5;
        return null;
    L5:
        JSONObject r0 = new JSONObject(r17);
        String r2 = r0.optString("photoUrl");
        if (TextUtils.isEmpty(r2) == true) goto L8;
        Uri r9 = Uri.parse(r2);
    L9:
        long r11 = Long.parseLong(r0.getString("expirationTime"));
        HashSet r3 = new HashSet();
        JSONArray r4 = r0.getJSONArray("grantedScopes");
        int r5 = r4.length();
        int r6 = 0;
    L10:
        if (r6 >= r5) goto L12;
        r3.add(new Scope(1, r4.getString(r6)));
        r6 = r6 + 1;
        goto L10
    L12:
        String r7 = r0.optString("id");
        if (r0.has("tokenId") == false) goto L15;
        String r8 = r0.optString("tokenId");
    L17:
        if (r0.has("email") == false) goto L19;
        String r10 = r0.optString("email");
    L21:
        if (r0.has("displayName") == false) goto L23;
        String r12 = r0.optString("displayName");
    L25:
        if (r0.has("givenName") == false) goto L27;
        String r15 = r0.optString("givenName");
    L29:
        if (r0.has("familyName") == false) goto L31;
        String r16 = r0.optString("familyName");
    L32:
        String r13 = r0.getString("obfuscatedIdentifier");
        ji2.k(r13);
        GoogleSignInAccount r14 = new GoogleSignInAccount(3, r7, r8, r10, r12, r9, null, r11, r13, new ArrayList(r3), r15, r16);
        if (r0.has("serverAuthCode") == false) goto L35;
        r1 = r0.optString("serverAuthCode");
    L35:
        r14.t = r1;
        return r14;
    L31:
        r16 = null;
        goto L32
    L27:
        r15 = null;
        goto L29
    L23:
        r12 = null;
        goto L25
    L19:
        r10 = null;
        goto L21
    L15:
        r8 = null;
        goto L17
    L8:
        r9 = null;
        goto L9
    }

    public final boolean equals(Object r3) {
        if (r3 == null) goto L19;
        if (r3 != this) goto L7;
        return true;
    L7:
        if ((r3 instanceof GoogleSignInAccount) == false) goto L20;
        GoogleSignInAccount r4 = (GoogleSignInAccount) r3;
        if (r4.v.equals(this.v) == false) goto L15;
        HashSet r0 = new HashSet(r4.w);
        r0.addAll(r4.z);
        HashSet r5 = new HashSet(this.w);
        r5.addAll(this.z);
        if (r0.equals(r5) == false) goto L18;
        return true;
    L18:
        return false;
    L15:
        return false;
    L20:
        return false;
    L19:
        return false;
    }

    public final int hashCode() {
        int r0 = this.v.hashCode() + 527;
        HashSet r1 = new HashSet(this.w);
        r1.addAll(this.z);
        int r2 = r0 * 31;
        return r2 + r1.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r5, int r6) {
        int r0 = ud3.R0(r5, 20293);
        ud3.T0(r5, 1, 4);
        r5.writeInt(this.n);
        ud3.O0(r5, 2, this.o);
        ud3.O0(r5, 3, this.p);
        ud3.O0(r5, 4, this.q);
        ud3.O0(r5, 5, this.r);
        ud3.M0(r5, 6, this.s, r6);
        ud3.O0(r5, 7, this.t);
        ud3.T0(r5, 8, 8);
        r5.writeLong(this.u);
        ud3.O0(r5, 9, this.v);
        ud3.Q0(r5, 10, this.w);
        ud3.O0(r5, 11, this.x);
        ud3.O0(r5, 12, this.y);
        ud3.S0(r5, r0);
    }
}
