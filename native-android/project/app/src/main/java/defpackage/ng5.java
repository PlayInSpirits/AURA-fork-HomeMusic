package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ng5 implements Runnable {
    public static final ge2 p = null;
    public final String n;
    public final zl4 o;

    static {
        p = new ge2("RevokeAccessOperation", new String[0]);
    }

    public ng5(String r2) {
        ji2.k(r2);
        this.n = r2;
        this.o = new zl4(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ge2 r0 = p;
        Status r3 = Status.t;
        HttpURLConnection r2 = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.n).openConnection();     // Catch: Exception -> L11 IOException -> L13
        r2.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");     // Catch: Exception -> L11 IOException -> L13
        int r4 = r2.getResponseCode();     // Catch: Exception -> L11 IOException -> L13
        if (r4 != 200) goto L6;
        r3 = Status.r;     // Catch: Exception -> L11 IOException -> L13
    L7:
        String r1 = "Response Code: " + r4;     // Catch: Exception -> L11 IOException -> L13
        if (r0.c > 3) goto L17;
        Log.d(r0.a, r0.b.concat(r1));     // Catch: Exception -> L11 IOException -> L13
    L17:
        this.o.e(r3);
        return;
    L6:
        Log.e(r0.a, r0.b.concat("Unable to revoke access!"));     // Catch: Exception -> L11 IOException -> L13
    L13:
        e = move-exception;
        Log.e(r0.a, r0.b.concat("IOException when revoking access: ".concat(String.valueOf(e.toString()))));
    L11:
        e = move-exception;
        Log.e(r0.a, r0.b.concat("Exception when revoking access: ".concat(String.valueOf(e.toString()))));
        goto L17
    }
}
