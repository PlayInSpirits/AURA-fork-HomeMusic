package defpackage;

import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dq0 extends b3 {
    public dq0(String r2, int r3, Bundle r4) {
        switch(r3) {
            case 2: goto L9;
            default: goto L4;
        };
    L4:
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", r4);
        if (r2.length() <= 0) goto L7;
        return;
    L7:
        kf2.n("password should not be empty");
        throw null;
    L9:
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", r4);
        if (r2.length() != 0) goto L16;
    L13:
        kf2.n("authenticationResponseJson must not be empty, and must be a valid JSON");
        throw null;
    L16:
        new JSONObject(r2);     // Catch: Exception -> L15
    }
}
