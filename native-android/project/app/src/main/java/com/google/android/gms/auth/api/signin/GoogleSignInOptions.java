package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.h2;
import defpackage.j84;
import defpackage.jb2;
import defpackage.le;
import defpackage.nj1;
import defpackage.ud3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInOptions extends h2 implements le, ReflectedParcelable {
    public static final Scope A = null;
    public static final jb2 B = null;
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = null;
    public static final GoogleSignInOptions x = null;
    public static final Scope y = null;
    public static final Scope z = null;
    public final int n;
    public final ArrayList o;
    public final Account p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final String t;
    public final String u;
    public final ArrayList v;
    public final String w;

    static {
        Scope r0 = new Scope(1, "profile");
        new Scope(1, "email");
        Scope r2 = new Scope(1, "openid");
        y = r2;
        Scope r3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        z = r3;
        A = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet r1 = new HashSet();
        HashMap r13 = new HashMap();
        r1.add(r2);
        r1.add(r0);
        if (r1.contains(A) == false) goto L7;
        Scope r4 = z;
        if (r1.contains(r4) == false) goto L7;
        r1.remove(r4);
    L7:
        x = new GoogleSignInOptions(3, new ArrayList(r1), null, false, false, false, null, null, r13, null);
        HashSet r5 = new HashSet();
        HashMap r14 = new HashMap();
        r5.add(r3);
        r5.addAll(Arrays.asList(new Scope[0]));
        if (r5.contains(A) == false) goto L12;
        Scope r6 = z;
        if (r5.contains(r6) == false) goto L12;
        r5.remove(r6);
    L12:
        new GoogleSignInOptions(3, new ArrayList(r5), null, false, false, false, null, null, r14, null);
        CREATOR = new j84(14);
        B = new jb2(10);
    }

    public GoogleSignInOptions(int r1, ArrayList r2, Account r3, boolean r4, boolean r5, boolean r6, String r7, String r8, HashMap r9, String r10) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
        this.s = r6;
        this.t = r7;
        this.u = r8;
        this.v = new ArrayList(r9.values());
        this.w = r10;
    }

    public static GoogleSignInOptions b(String r17) {
        String r1 = null;
        if (TextUtils.isEmpty(r17) == false) goto L5;
        return null;
    L5:
        JSONObject r0 = new JSONObject(r17);
        HashSet r2 = new HashSet();
        JSONArray r3 = r0.getJSONArray("scopes");
        int r4 = r3.length();
        int r5 = 0;
    L6:
        if (r5 >= r4) goto L9;
        r2.add(new Scope(1, r3.getString(r5)));
        r5 = r5 + 1;
        goto L6
    L9:
        if (r0.has("accountName") == false) goto L11;
        String r6 = r0.optString("accountName");
    L13:
        if (TextUtils.isEmpty(r6) == true) goto L15;
        Account r9 = new Account(r6, "com.google");
    L16:
        ArrayList r8 = new ArrayList(r2);
        boolean r10 = r0.getBoolean("idTokenRequested");
        boolean r11 = r0.getBoolean("serverAuthRequested");
        boolean r12 = r0.getBoolean("forceCodeForRefreshToken");
        if (r0.has("serverClientId") == false) goto L19;
        String r13 = r0.optString("serverClientId");
    L21:
        if (r0.has("hostedDomain") == false) goto L24;
        r1 = r0.optString("hostedDomain");
    L24:
        return new GoogleSignInOptions(3, r8, r9, r10, r11, r12, r13, r1, new HashMap(), null);
    L19:
        r13 = null;
        goto L21
    L15:
        r9 = null;
        goto L16
    L11:
        r6 = null;
        goto L13
    }

    public static HashMap c(ArrayList r5) {
        HashMap r0 = new HashMap();
        if (r5 == null) goto L8;
        int r1 = r5.size();
        int r2 = 0;
    L6:
        if (r2 >= r1) goto L8;
        Object r3 = r5.get(r2);
        r2 = r2 + 1;
        nj1 r4 = (nj1) r3;
        r0.put(Integer.valueOf(r4.o), r4);
    L8:
        return r0;
    }

    public final boolean equals(Object r7) {
        String r0 = this.t;
        ArrayList r1 = this.o;
        if (r7 == null) goto L56;
        GoogleSignInOptions r8 = (GoogleSignInOptions) r7;     // Catch: ClassCastException -> L42
        ArrayList r2 = r8.o;     // Catch: ClassCastException -> L42
        String r3 = r8.t;     // Catch: ClassCastException -> L42
        if (this.v.isEmpty() == true) goto L8;
        return false;
    L8:
        if (r8.v.isEmpty() == true) goto L11;
        return false;
    L11:
        if (r1.size() == new ArrayList(r2).size()) goto L13;
        return false;
    L13:
        if (r1.containsAll(new ArrayList(r2)) == false) goto L47;
        Account r4 = this.p;     // Catch: ClassCastException -> L42
        Account r5 = r8.p;
        if (r4 != null) goto L21;
        if (r5 == null) goto L23;
        return false;
    L23:
        if (TextUtils.isEmpty(r0) == false) goto L28;
        if (TextUtils.isEmpty(r3) == true) goto L31;
        return false;
    L31:
        if (this.s == r8.s) goto L33;
        return false;
    L33:
        if (this.q == r8.q) goto L35;
        return false;
    L35:
        if (this.r != r8.r) goto L54;
        if (TextUtils.equals(this.w, r8.w) == false) goto L55;
        return true;
    L55:
        return false;
    L54:
        return false;
    L28:
        if (r0.equals(r3) == true) goto L31;
        return false;
    L21:
        if (r4.equals(r5) == true) goto L23;
        return false;
    L47:
        return false;
    L57:
        return false;
    L56:
        return false;
    }

    public final int hashCode() {
        ArrayList r0 = new ArrayList();
        ArrayList r1 = this.o;
        int r2 = r1.size();
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r4 >= r2) goto L5;
        r0.add(((Scope) r1.get(r4)).o);
        r4 = r4 + 1;
        goto L3
    L5:
        Collections.sort(r0);
        int r5 = (r0.hashCode() + (1 * 31)) * 31;
        Account r6 = this.p;
        if (r6 != null) goto L8;
        int r7 = 0;
    L9:
        int r8 = (r5 + r7) * 31;
        String r9 = this.t;
        if (r9 != null) goto L12;
        int r10 = 0;
    L13:
        int r11 = (((((((r8 + r10) * 31) + (this.s ? 1 : 0)) * 31) + (this.q ? 1 : 0)) * 31) + (this.r ? 1 : 0)) * 31;
        String r12 = this.w;
        if (r12 == null) goto L18;
        r3 = r12.hashCode();
    L18:
        return r11 + r3;
    L12:
        r10 = r9.hashCode();
        goto L13
    L8:
        r7 = r6.hashCode();
        goto L9
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r5, int r6) {
        int r0 = ud3.R0(r5, 20293);
        ud3.T0(r5, 1, 4);
        r5.writeInt(this.n);
        ud3.Q0(r5, 2, new ArrayList(this.o));
        ud3.M0(r5, 3, this.p, r6);
        ud3.T0(r5, 4, 4);
        r5.writeInt(this.q ? 1 : 0);
        ud3.T0(r5, 5, 4);
        r5.writeInt(this.r ? 1 : 0);
        ud3.T0(r5, 6, 4);
        r5.writeInt(this.s ? 1 : 0);
        ud3.O0(r5, 7, this.t);
        ud3.O0(r5, 8, this.u);
        ud3.Q0(r5, 9, this.v);
        ud3.O0(r5, 10, this.w);
        ud3.S0(r5, r0);
    }
}
