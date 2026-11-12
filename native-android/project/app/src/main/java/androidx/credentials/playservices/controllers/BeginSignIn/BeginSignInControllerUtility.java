package androidx.credentials.playservices.controllers.BeginSignIn;

import android.content.Context;
import android.content.pm.PackageManager;
import defpackage.as;
import defpackage.bs;
import defpackage.cs;
import defpackage.kh1;
import defpackage.oh1;
import defpackage.xf0;
import defpackage.xj0;
import defpackage.yr;
import defpackage.zr;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class BeginSignInControllerUtility {
    private static final long AUTH_MIN_VERSION_JSON_PARSING = 231815000;
    private static final long AUTH_MIN_VERSION_PREFER_IMME_CRED = 241217000;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "BeginSignInUtility";

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class Companion {
        public /* synthetic */ Companion(xj0 xj0Var) {
            this();
        }

        private final yr convertToGoogleIdTokenOption(oh1 oh1Var) {
            throw null;
        }

        private final long determineDeviceGMSVersionCode(Context context) {
            PackageManager packageManager = context.getPackageManager();
            packageManager.getClass();
            return packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        }

        private final boolean needsBackwardsCompatibleRequest(long j) {
            return j < BeginSignInControllerUtility.AUTH_MIN_VERSION_JSON_PARSING;
        }

        public final cs constructBeginSignInRequest$credentials_play_services_auth_release(kh1 kh1Var, Context context) {
            kh1Var.getClass();
            context.getClass();
            bs bsVar = new bs(false);
            yr yrVar = new yr(false, null, null, true, null, null, false);
            as asVar = new as(false, null, null);
            zr zrVar = new zr(false, null);
            determineDeviceGMSVersionCode(context);
            for (xf0 xf0Var : kh1Var.a) {
            }
            return new cs(bsVar, yrVar, null, false, 0, asVar, zrVar, false);
        }

        private Companion() {
        }
    }
}
