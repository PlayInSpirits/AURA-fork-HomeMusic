package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u02 extends vr1 {
    public final /* synthetic */ int c;

    public /* synthetic */ u02(int i) {
        this.c = i;
    }

    @Override // defpackage.vr1
    public me a(Context context, Looper looper, ml3 ml3Var, Object obj, gj1 gj1Var, hj1 hj1Var) {
        switch (this.c) {
            case 2:
                ml3Var.getClass();
                Integer num = (Integer) ml3Var.f;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new sd4(context, looper, ml3Var, bundle, gj1Var, hj1Var);
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                obj.getClass();
                throw new ClassCastException();
            case 4:
            case 6:
            case 7:
            default:
                return super.a(context, looper, ml3Var, obj, gj1Var, hj1Var);
            case 5:
                return new rg5(context, looper, ml3Var, (qg5) obj, (gf5) gj1Var, (gf5) hj1Var);
            case 8:
                return new sg5(context, looper, ml3Var, (GoogleSignInOptions) obj, (gf5) gj1Var, (gf5) hj1Var);
            case 9:
                return new ok5(context, looper, 148, ml3Var, gj1Var, hj1Var, 0);
        }
    }

    @Override // defpackage.vr1
    public me b(Context context, Looper looper, ml3 ml3Var, Object obj, gf5 gf5Var, gf5 gf5Var2) {
        switch (this.c) {
            case 0:
                context.getClass();
                looper.getClass();
                ((ke) obj).getClass();
                return new sv1(context, looper, 352, ml3Var, gf5Var, gf5Var2, 0);
            case 1:
                context.getClass();
                looper.getClass();
                ((ke) obj).getClass();
                return new p14(context, looper, 381, ml3Var, gf5Var, gf5Var2, 0);
            case 2:
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
            case 5:
            default:
                return super.b(context, looper, ml3Var, obj, gf5Var, gf5Var2);
            case 4:
                return new fg5(context, looper, ml3Var, (lr4) obj, gf5Var, gf5Var2);
            case 6:
                return new vg5(context, looper, ml3Var, gf5Var, gf5Var2);
            case 7:
                return new lg5(context, looper, ml3Var, gf5Var, gf5Var2);
        }
    }
}
