package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nk5 {
    public static final Uri d = null;
    public final String a;
    public final String b;
    public final boolean c;

    static {
        d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    }

    public nk5(String r1, boolean r2) {
        ji2.k(r1);
        this.a = r1;
        ji2.k("com.google.android.gms");
        this.b = "com.google.android.gms";
        this.c = r2;
    }

    public final Intent a(Context r7) {
        Intent r1 = null;
        String r2 = this.a;
        if (r2 == null) goto L21;
        if (this.c == false) goto L16;
        Bundle r3 = new Bundle();
        r3.putString("serviceActionBundleKey", r2);
        Bundle r8 = r7.getContentResolver().call(d, "serviceIntentCall", null, r3);     // Catch: IllegalArgumentException -> L9
    L11:
        if (r8 == null) goto L14;
        r1 = (Intent) r8.getParcelable("serviceResponseIntentKey");
    L14:
        if (r1 != null) goto L16;
        Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(r2)));
    L9:
        e = move-exception;
        Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
        r8 = null;
    L16:
        if (r1 == null) goto L18;
        return r1;
    L18:
        return new Intent(r2).setPackage(this.b);
    L21:
        return new Intent().setComponent(null);
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof nk5) == true) goto L8;
        return false;
    L8:
        nk5 r6 = (nk5) r5;
        if (au0.n(this.a, r6.a) == true) goto L11;
    L17:
        return false;
    L11:
        if (au0.n(this.b, r6.b) == false) goto L17;
        if (au0.n(null, null) == false) goto L17;
        if (this.c != r6.c) goto L17;
        return true;
    }

    public final int hashCode() {
        Boolean r1 = Boolean.valueOf(this.c);
        return Arrays.hashCode(new Object[]{this.a, this.b, null, 4225, r1});
    }

    public final String toString() {
        String r0 = this.a;
        if (r0 == null) goto L5;
        return r0;
    L5:
        ji2.m(null);
        throw null;
    }
}
