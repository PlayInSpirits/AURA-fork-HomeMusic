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
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInAccount extends h2 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new j84(13);
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
    public final HashSet z = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.n = i;
        this.o = str;
        this.p = str2;
        this.q = str3;
        this.r = str4;
        this.s = uri;
        this.t = str5;
        this.u = j;
        this.v = str6;
        this.w = arrayList;
        this.x = str7;
        this.y = str8;
    }

    public static GoogleSignInAccount b(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        ji2.k(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.t = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.v.equals(this.v)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.w);
        hashSet.addAll(googleSignInAccount.z);
        HashSet hashSet2 = new HashSet(this.w);
        hashSet2.addAll(this.z);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.v.hashCode() + 527;
        HashSet hashSet = new HashSet(this.w);
        hashSet.addAll(this.z);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR0 = ud3.R0(parcel, 20293);
        ud3.T0(parcel, 1, 4);
        parcel.writeInt(this.n);
        ud3.O0(parcel, 2, this.o);
        ud3.O0(parcel, 3, this.p);
        ud3.O0(parcel, 4, this.q);
        ud3.O0(parcel, 5, this.r);
        ud3.M0(parcel, 6, this.s, i);
        ud3.O0(parcel, 7, this.t);
        ud3.T0(parcel, 8, 8);
        parcel.writeLong(this.u);
        ud3.O0(parcel, 9, this.v);
        ud3.Q0(parcel, 10, this.w);
        ud3.O0(parcel, 11, this.x);
        ud3.O0(parcel, 12, this.y);
        ud3.S0(parcel, iR0);
    }
}
