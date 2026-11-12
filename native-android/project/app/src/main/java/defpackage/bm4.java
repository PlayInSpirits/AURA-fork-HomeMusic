package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bm4 {
    public static final ReentrantLock c = null;
    public static bm4 d;
    public final ReentrantLock a;
    public final SharedPreferences b;

    static {
        c = new ReentrantLock();
    }

    public bm4(Context r3) {
        this.a = new ReentrantLock();
        this.b = r3.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static bm4 a(Context r2) {
        ji2.m(r2);
        ReentrantLock r0 = c;
        r0.lock();
    L6:
        th = move-exception;
        r0.unlock();
        throw th;
    L4:
        if (d != null) goto L8;
        d = new bm4(r2.getApplicationContext());     // Catch: Throwable -> L6
    L8:
        bm4 r3 = d;     // Catch: Throwable -> L6
        r0.unlock();
        return r3;
    }

    public static final String f(String r1, String r2) {
        return b11.o(r1, ":", r2);
    }

    public final GoogleSignInAccount b() {
        String r0 = d("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(r0) == true) goto L9;
        String r3 = d(f("googleSignInAccount", r0));
        if (r3 == null) goto L9;
        return GoogleSignInAccount.b(r3);
    L9:
        return null;
    }

    public final void c(GoogleSignInAccount r10, GoogleSignInOptions r11) {
        ji2.m(r10);
        ji2.m(r11);
        String r0 = r10.v;
        e("defaultGoogleSignInAccount", r0);
        String r1 = f("googleSignInAccount", r0);
        JSONObject r2 = new JSONObject();
        String r3 = r10.o;     // Catch: JSONException -> L50
        if (r3 == null) goto L6;
        r2.put("id", r3);     // Catch: JSONException -> L50
    L6:
        String r4 = r10.p;     // Catch: JSONException -> L50
        if (r4 == null) goto L9;
        r2.put("tokenId", r4);     // Catch: JSONException -> L50
    L9:
        String r5 = r10.q;     // Catch: JSONException -> L50
        if (r5 == null) goto L12;
        r2.put("email", r5);     // Catch: JSONException -> L50
    L12:
        String r6 = r10.r;     // Catch: JSONException -> L50
        if (r6 == null) goto L15;
        r2.put("displayName", r6);     // Catch: JSONException -> L50
    L15:
        String r7 = r10.x;     // Catch: JSONException -> L50
        if (r7 == null) goto L18;
        r2.put("givenName", r7);     // Catch: JSONException -> L50
    L18:
        String r8 = r10.y;     // Catch: JSONException -> L50
        if (r8 == null) goto L21;
        r2.put("familyName", r8);     // Catch: JSONException -> L50
    L21:
        Uri r9 = r10.s;     // Catch: JSONException -> L50
        if (r9 == null) goto L24;
        r2.put("photoUrl", r9.toString());     // Catch: JSONException -> L50
    L24:
        String r12 = r10.t;     // Catch: JSONException -> L50
        if (r12 == null) goto L28;
        r2.put("serverAuthCode", r12);     // Catch: JSONException -> L50
    L28:
        r2.put("expirationTime", r10.u);     // Catch: JSONException -> L50
        r2.put("obfuscatedIdentifier", r0);     // Catch: JSONException -> L50
        JSONArray r13 = new JSONArray();     // Catch: JSONException -> L50
        List r14 = r10.w;     // Catch: JSONException -> L50
        Scope[] r15 = (Scope[]) r14.toArray(new Scope[r14.size()]);     // Catch: JSONException -> L50
        Arrays.sort(r15, ca1.w);     // Catch: JSONException -> L50
        int r16 = r15.length;     // Catch: JSONException -> L50
        int r17 = 0;
        int r18 = 0;
    L29:
        if (r18 >= r16) goto L31;
        r13.put(r15[r18].o);     // Catch: JSONException -> L50
        r18 = r18 + 1;     // Catch: JSONException -> L50
        goto L29
    L31:
        r2.put("grantedScopes", r13);     // Catch: JSONException -> L50
        r2.remove("serverAuthCode");
        e(r1, r2.toString());
        String r19 = f("googleSignInOptions", r0);
        String r20 = r11.u;
        String r21 = r11.t;
        ArrayList r22 = r11.o;
        JSONObject r23 = new JSONObject();
        JSONArray r24 = new JSONArray();     // Catch: JSONException -> L47
        Collections.sort(r22, GoogleSignInOptions.B);     // Catch: JSONException -> L47
        int r25 = r22.size();     // Catch: JSONException -> L47
    L34:
        if (r17 >= r25) goto L36;
        Object r26 = r22.get(r17);     // Catch: JSONException -> L47
        r17 = r17 + 1;     // Catch: JSONException -> L47
        r24.put(((Scope) r26).o);     // Catch: JSONException -> L47
        goto L34
    L36:
        r23.put("scopes", r24);     // Catch: JSONException -> L47
        Account r27 = r11.p;     // Catch: JSONException -> L47
        if (r27 == null) goto L39;
        r23.put("accountName", r27.name);     // Catch: JSONException -> L47
    L39:
        r23.put("idTokenRequested", r11.q);     // Catch: JSONException -> L47
        r23.put("forceCodeForRefreshToken", r11.s);     // Catch: JSONException -> L47
        r23.put("serverAuthRequested", r11.r);     // Catch: JSONException -> L47
        if (TextUtils.isEmpty(r21) == true) goto L43;
        r23.put("serverClientId", r21);     // Catch: JSONException -> L47
    L43:
        if (TextUtils.isEmpty(r20) == true) goto L45;
        r23.put("hostedDomain", r20);     // Catch: JSONException -> L47
    L45:
        e(r19, r23.toString());
        return;
    L47:
        e = move-exception;
        er1.m(e);
        return;
    L50:
        e = move-exception;
        er1.m(e);
    }

    public final String d(String r3) {
        ReentrantLock r0 = this.a;
        r0.lock();
        String r2 = this.b.getString(r3, null);     // Catch: Throwable -> L6
        r0.unlock();
        return r2;
    L6:
        th = move-exception;
        r0.unlock();
        throw th;
    }

    public final void e(String r2, String r3) {
        ReentrantLock r0 = this.a;
        r0.lock();
        this.b.edit().putString(r2, r3).apply();     // Catch: Throwable -> L6
        r0.unlock();
        return;
    L6:
        th = move-exception;
        r0.unlock();
        throw th;
    }
}
