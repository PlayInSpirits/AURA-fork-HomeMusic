package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ng5 implements Runnable {
    public static final ge2 p = new ge2("RevokeAccessOperation", new String[0]);
    public final String n;
    public final zl4 o;

    public ng5(String str) {
        ji2.k(str);
        this.n = str;
        this.o = new zl4(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ge2 ge2Var = p;
        Status status = Status.t;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.n).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.r;
            } else {
                Log.e(ge2Var.a, ge2Var.b.concat("Unable to revoke access!"));
            }
            String str = "Response Code: " + responseCode;
            if (ge2Var.c <= 3) {
                Log.d(ge2Var.a, ge2Var.b.concat(str));
            }
        } catch (IOException e) {
            Log.e(ge2Var.a, ge2Var.b.concat("IOException when revoking access: ".concat(String.valueOf(e.toString()))));
        } catch (Exception e2) {
            Log.e(ge2Var.a, ge2Var.b.concat("Exception when revoking access: ".concat(String.valueOf(e2.toString()))));
        }
        this.o.e(status);
    }
}
