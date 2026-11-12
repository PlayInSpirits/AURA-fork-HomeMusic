package defpackage;

import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dq0 extends b3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq0(String str, int i, Bundle bundle) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle);
        switch (i) {
            case 2:
                super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle);
                if (str.length() != 0) {
                    try {
                        new JSONObject(str);
                        return;
                    } catch (Exception unused) {
                    }
                }
                kf2.n("authenticationResponseJson must not be empty, and must be a valid JSON");
                throw null;
            default:
                if (str.length() > 0) {
                    return;
                }
                kf2.n("password should not be empty");
                throw null;
        }
    }
}
