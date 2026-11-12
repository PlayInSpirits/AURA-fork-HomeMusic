package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u02 extends vr1 {
    public final /* synthetic */ int c;

    public /* synthetic */ u02(int r1) {
        this.c = r1;
    }

    @Override // defpackage.vr1
    public me a(Context r9, Looper r10, ml3 r11, Object r12, gj1 r13, hj1 r14) {
        switch(this.c) {
            case 2: goto L14;
            case 3: goto L12;
            case 4: goto L5;
            case 5: goto L11;
            case 6: goto L5;
            case 7: goto L5;
            case 8: goto L9;
            case 9: goto L6;
            default: goto L5;
        };
    L6:
        ke r15 = (ke) r12;
        return new ok5(r9, r10, 148, r11, r13, r14, 0);
    L12:
        r12.getClass();
        throw new ClassCastException();
    L14:
        ud4 r16 = (ud4) r12;
        r11.getClass();
        Integer r8 = (Integer) r11.f;
        Bundle r4 = new Bundle();
        r4.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
        if (r8 == null) goto L17;
        r4.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", r8.intValue());
    L17:
        r4.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        r4.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        r4.putString("com.google.android.gms.signin.internal.serverClientId", null);
        r4.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        r4.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        r4.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        r4.putString("com.google.android.gms.signin.internal.logSessionId", null);
        r4.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return new sd4(r9, r10, r11, r4, r13, r14);
    L5:
        return super.a(r9, r10, r11, r12, r13, r14);
    L9:
        return new sg5(r9, r10, r11, (GoogleSignInOptions) r12, (gf5) r13, (gf5) r14);
    L11:
        return new rg5(r9, r10, r11, (qg5) r12, (gf5) r13, (gf5) r14);
    }

    @Override // defpackage.vr1
    public me b(Context r9, Looper r10, ml3 r11, Object r12, gf5 r13, gf5 r14) {
        switch(this.c) {
            case 0: goto L14;
            case 1: goto L12;
            case 2: goto L5;
            case 3: goto L5;
            case 4: goto L11;
            case 5: goto L5;
            case 6: goto L8;
            case 7: goto L6;
            default: goto L5;
        };
    L6:
        dh5 r8 = (dh5) r12;
        return new lg5(r9, r10, r11, r13, r14);
    L8:
        xg5 r15 = (xg5) r12;
        return new vg5(r9, r10, r11, r13, r14);
    L12:
        r9.getClass();
        r10.getClass();
        ((ke) r12).getClass();
        return new p14(r9, r10, 381, r11, r13, r14, 0);
    L14:
        r9.getClass();
        r10.getClass();
        ((ke) r12).getClass();
        return new sv1(r9, r10, 352, r11, r13, r14, 0);
    L5:
        return super.b(r9, r10, r11, r12, r13, r14);
    L11:
        return new fg5(r9, r10, r11, (lr4) r12, r13, r14);
    }
}
