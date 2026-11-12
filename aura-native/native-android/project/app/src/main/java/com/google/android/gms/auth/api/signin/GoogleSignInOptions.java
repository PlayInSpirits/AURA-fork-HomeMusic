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
    public static final Scope A;
    public static final jb2 B;
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    public static final GoogleSignInOptions x;
    public static final Scope y;
    public static final Scope z;
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
        Scope scope = new Scope(1, "profile");
        new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        y = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        z = scope3;
        A = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(A)) {
            Scope scope4 = z;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        x = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, map, null);
        HashSet hashSet2 = new HashSet();
        HashMap map2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(A)) {
            Scope scope5 = z;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, map2, null);
        CREATOR = new j84(14);
        B = new jb2(10);
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z2, boolean z3, boolean z4, String str, String str2, HashMap map, String str3) {
        this.n = i;
        this.o = arrayList;
        this.p = account;
        this.q = z2;
        this.r = z3;
        this.s = z4;
        this.t = str;
        this.u = str2;
        this.v = new ArrayList(map.values());
        this.w = str3;
    }

    public static GoogleSignInOptions b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    public static HashMap c(ArrayList arrayList) {
        HashMap map = new HashMap();
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                nj1 nj1Var = (nj1) obj;
                map.put(Integer.valueOf(nj1Var.o), nj1Var);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        String str = this.t;
        ArrayList arrayList = this.o;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            ArrayList arrayList2 = googleSignInOptions.o;
            String str2 = googleSignInOptions.t;
            if (this.v.isEmpty() && googleSignInOptions.v.isEmpty() && arrayList.size() == new ArrayList(arrayList2).size() && arrayList.containsAll(new ArrayList(arrayList2))) {
                Account account = this.p;
                Account account2 = googleSignInOptions.p;
                if (account == null) {
                    if (account2 != null) {
                        return false;
                    }
                } else if (!account.equals(account2)) {
                    return false;
                }
                if (TextUtils.isEmpty(str)) {
                    if (!TextUtils.isEmpty(str2)) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                return this.s == googleSignInOptions.s && this.q == googleSignInOptions.q && this.r == googleSignInOptions.r && TextUtils.equals(this.w, googleSignInOptions.w);
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.o;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Scope) arrayList2.get(i)).o);
        }
        Collections.sort(arrayList);
        int iHashCode = (arrayList.hashCode() + (1 * 31)) * 31;
        Account account = this.p;
        int iHashCode2 = (iHashCode + (account == null ? 0 : account.hashCode())) * 31;
        String str = this.t;
        int iHashCode3 = (((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + (this.s ? 1 : 0)) * 31) + (this.q ? 1 : 0)) * 31) + (this.r ? 1 : 0)) * 31;
        String str2 = this.w;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR0 = ud3.R0(parcel, 20293);
        ud3.T0(parcel, 1, 4);
        parcel.writeInt(this.n);
        ud3.Q0(parcel, 2, new ArrayList(this.o));
        ud3.M0(parcel, 3, this.p, i);
        ud3.T0(parcel, 4, 4);
        parcel.writeInt(this.q ? 1 : 0);
        ud3.T0(parcel, 5, 4);
        parcel.writeInt(this.r ? 1 : 0);
        ud3.T0(parcel, 6, 4);
        parcel.writeInt(this.s ? 1 : 0);
        ud3.O0(parcel, 7, this.t);
        ud3.O0(parcel, 8, this.u);
        ud3.Q0(parcel, 9, this.v);
        ud3.O0(parcel, 10, this.w);
        ud3.S0(parcel, iR0);
    }
}
