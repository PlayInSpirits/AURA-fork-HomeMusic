package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import android.widget.ProgressBar;
import androidx.credentials.playservices.HiddenActivity;
import androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetDigitalCredentialController;
import androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetRestoreCredentialController;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qf5 implements Runnable {
    public final /* synthetic */ int n;
    public final Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ qf5(int r1, Object r2, Object r3) {
        this.n = r1;
        this.p = r2;
        this.o = r3;
    }

    private final void a() {
        Object r0 = ((hk5) this.p).c;
        monitor-enter(r0);
        e93 r1 = (e93) ((hk5) this.p).d;     // Catch: Throwable -> L11
        jw r3 = (jw) this.o;     // Catch: Throwable -> L11
        Object r2 = r3.o;     // Catch: Throwable -> L11
        monitor-enter(r2);     // Catch: Throwable -> L11
        Exception r4 = (Exception) r3.r;     // Catch: Throwable -> L13
        monitor-exit(r2);     // Catch: Throwable -> L13
        ji2.m(r4);     // Catch: Throwable -> L11
        r1.a(r4);     // Catch: Throwable -> L11
        monitor-exit(r0);     // Catch: Throwable -> L11
        return;
    L13:
        th = move-exception;
        throw th;     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int r3 = 2;
        eu1 r4 = null;
        Bundle r5 = null;
        Bundle r6 = null;
        switch(this.n) {
            case 0: goto L103;
            case 1: goto L62;
            case 2: goto L45;
            case 3: goto L29;
            case 4: goto L21;
            case 5: goto L19;
            default: goto L4;
        };
    L4:
        Object r0 = ((hk5) this.p).c;
        monitor-enter(r0);
        cg0 r1 = (cg0) ((hk5) this.p).d;     // Catch: Throwable -> L16
        Object r10 = ((jw) this.o).n();     // Catch: Throwable -> L16
        switch(r1.a) {
            case 0: goto L13;
            case 1: goto L12;
            case 2: goto L11;
            case 3: goto L10;
            case 4: goto L9;
            default: goto L8;
        };     // Catch: Throwable -> L16
    L8:
        HiddenActivity.$r8$lambda$xk6z1pBgwfylIivjcQlijI8e3RM(r1.b, r10);     // Catch: Throwable -> L16
    L14:
        monitor-exit(r0);     // Catch: Throwable -> L16
        return;
    L9:
        HiddenActivity.$r8$lambda$XnByCOhdw6M3NUVrPdK9IYFdcaQ(r1.b, r10);     // Catch: Throwable -> L16
        goto L14
    L10:
        HiddenActivity.$r8$lambda$8029HvfIkyuQLdhX5BYT4HccZOc(r1.b, r10);     // Catch: Throwable -> L16
        goto L14
    L11:
        HiddenActivity.$r8$lambda$bAsCQGcUULbIQqCqmx80zDQYFhE(r1.b, r10);     // Catch: Throwable -> L16
        goto L14
    L12:
        CredentialProviderGetRestoreCredentialController.$r8$lambda$mTHDsjfGVNXe6TNGFFFHHPUMjGE(r1.b, r10);     // Catch: Throwable -> L16
        goto L14
    L13:
        CredentialProviderGetDigitalCredentialController.m44$r8$lambda$_IbKyRaIxxXTX1LNwiahBSJsqc(r1.b, r10);     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        throw th;
    L19:
        a();
        return;
    L21:
        Object r2 = ((hk5) this.p).c;
        monitor-enter(r2);
        ((b93) ((hk5) this.p).d).a((jw) this.o);     // Catch: Throwable -> L26
        monitor-exit(r2);     // Catch: Throwable -> L26
        return;
    L26:
        th = move-exception;
        throw th;
    L29:
        df5 r7 = (df5) this.o;
        vi5 r11 = (vi5) this.p;
        if (r11.m0 <= 0) goto L36;
        Bundle r8 = r11.n0;
        if (r8 == null) goto L34;
        r5 = r8.getBundle("ConnectionlessLifecycleHelper");
    L34:
        r7.c(r5);
    L36:
        if (r11.m0 < 2) goto L39;
        r7.f();
    L39:
        if (r11.m0 < 3) goto L42;
        r7.d();
    L42:
        if (r11.m0 < 4) goto L132;
        r7.g();
        return;
    L132:
        return;
    L45:
        df5 r9 = (df5) this.o;
        ph5 r12 = (ph5) this.p;
        if (r12.o <= 0) goto L52;
        Bundle r13 = r12.p;
        if (r13 == null) goto L50;
        r6 = r13.getBundle("ConnectionlessLifecycleHelper");
    L50:
        r9.c(r6);
    L52:
        if (r12.o < 2) goto L55;
        r9.f();
    L55:
        if (r12.o < 3) goto L58;
        r9.d();
    L58:
        if (r12.o < 4) goto L133;
        r9.g();
        return;
    L133:
        return;
    L103:
        rf5 r14 = (rf5) this.p;
        dg5 r15 = (dg5) this.o;
        ka0 r16 = r15.o;
        if (r16.o != 0) goto L123;
        ig5 r17 = r15.p;
        ji2.m(r17);
        ka0 r18 = r17.p;
        if (r18.o != 0) goto L122;
        nq r19 = r14.l;
        IBinder r110 = r17.o;
        if (r110 == null) goto L114;
        int r20 = g4.f;
        IInterface r21 = r110.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        if ((r21 instanceof eu1) == false) goto L113;
        r4 = (eu1) r21;
        goto L114
    L113:
        r4 = new vk5(r110);
    L114:
        Set r111 = r14.i;
        r19.getClass();
        if (r4 == null) goto L121;
        if (r111 == null) goto L121;
        r19.q = r4;
        r19.r = r111;
        if (r19.n == false) goto L124;
        ((me) r19.o).j0(r4, r111);
    L124:
        r14.k.b();
        return;
    L121:
        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
        r19.a(new ka0(4));
        goto L124
    L122:
        String r112 = String.valueOf(r18);
        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(r112), new Exception());
        r14.l.a(r18);
        r14.k.b();
        return;
    L123:
        r14.l.a(r16);
        goto L124
    L62:
        if (((df5) this.p).o == false) goto L137;
        ka0 r22 = ((eg5) this.o).b;
        if (r22.o != 0) goto L67;
    L69:
        Object[] r23 = false;
    L70:
        df5 r24 = (df5) this.p;
        if (r23 == false) goto L73;
        x92 r25 = r24.n;
        Activity r26 = r24.a();
        PendingIntent r27 = r22.p;
        ji2.m(r27);
        int r113 = ((eg5) this.o).a;
        int r28 = GoogleApiActivity.o;
        Intent r29 = new Intent(r26, GoogleApiActivity.class);
        r29.putExtra("pending_intent", r27);
        r29.putExtra("failing_client_id", r113);
        r29.putExtra("notify_manager", false);
        r25.startActivityForResult(r29, 1);
        return;
    L73:
        Activity r30 = r24.a();
        if (r24.r.a(r22.o, r30, null) == null) goto L76;
        df5 r31 = (df5) this.p;
        r31.r.g(r31.a(), r31.n, r22.o, (df5) this.p);
        return;
    L76:
        int r32 = r22.o;
        df5 r33 = (df5) this.p;
        if (r32 != 18) goto L101;
        ej1 r34 = r33.r;
        Activity r35 = r33.a();
        r34.getClass();
        ProgressBar r36 = new ProgressBar(r35, null, R.attr.progressBarStyleLarge);
        r36.setIndeterminate(true);
        r36.setVisibility(0);
        AlertDialog.Builder r37 = new AlertDialog.Builder(r35);
        r37.setView(r36);
        r37.setMessage(lf5.b(r35, 18));
        r37.setPositiveButton("", null);
        AlertDialog r38 = r37.create();
        ej1.e(r35, r38, "GooglePlayServicesUpdatingDialog", r33);
        df5 r39 = (df5) this.p;
        Context r40 = r39.a().getApplicationContext();
        wo0 r41 = new wo0();
        r41.o = this;
        r41.n = r38;
        r39.r.getClass();
        IntentFilter r42 = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        r42.addDataScheme("package");
        jf5 r43 = new jf5(r41);
        int r44 = Build.VERSION.SDK_INT;
        if (r44 < 33) goto L84;
        if (r44 >= 33) goto L83;
        r3 = 0;
    L83:
        rg3.b(r40, r43, r42, r3);
    L85:
        r43.a = r40;
        if (lj1.a(r40) == true) goto L136;
        df5 r114 = (df5) this.p;
        r114.p.set(null);
        zw2 r115 = r114.t.A;
        r115.sendMessage(r115.obtainMessage(3));
        if (r38.isShowing() == false) goto L90;
        r38.dismiss();
    L90:
        monitor-enter(r43);
        Context r116 = r43.a;     // Catch: Throwable -> L94
        if (r116 == null) goto L96;
        r116.unregisterReceiver(r43);     // Catch: Throwable -> L94
    L96:
        r43.a = null;     // Catch: Throwable -> L94
        monitor-exit(r43);
        return;
    L94:
        th = move-exception;
        throw th;
    L136:
        return;
    L84:
        r40.registerReceiver(r43, r42);
        goto L85
    L101:
        int r117 = ((eg5) this.o).a;
        r33.p.set(null);
        r33.t.g(r22, r117);
        return;
    L67:
        if (r22.p == null) goto L69;
        r23 = true;
        goto L70
    }
}
