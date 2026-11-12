package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;
import defpackage.bm4;
import defpackage.bq4;
import defpackage.e75;
import defpackage.h95;
import defpackage.i30;
import defpackage.if5;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.ld2;
import defpackage.md2;
import defpackage.mj4;
import defpackage.nc1;
import defpackage.nd2;
import defpackage.og5;
import defpackage.sf0;
import defpackage.un0;
import defpackage.zg5;
import java.lang.reflect.Modifier;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class SignInHubActivity extends nc1 {
    public static boolean R;
    public boolean M;
    public SignInConfiguration N;
    public boolean O;
    public int P;
    public Intent Q;

    public SignInHubActivity() {
        this.M = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent r1) {
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void m() {
        e75 r0 = d();
        un0 r1 = nd2.d;
        r0.getClass();
        sf0 r2 = sf0.b;
        r2.getClass();
        bq4 r3 = new bq4(r0, r1, r2);
        i30 r4 = kx3.a(nd2.class);
        String r5 = r4.b();
        if (r5 == null) goto L43;
        nd2 r6 = (nd2) r3.l(r4, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r5));
        h95 r7 = new h95(this);
        boolean r8 = r6.c;
        mj4 r9 = r6.b;
        if (r8 == false) goto L7;
        kf2.o("Called while creating a loader");
        return;
    L7:
        if (Looper.getMainLooper() != Looper.myLooper()) goto L39;
        ld2 r10 = (ld2) r9.b(0);
        if (r10 == null) goto L45;
        md2 r11 = new md2(r10.l, r7);
        r10.e(this, r11);
        md2 r12 = r10.n;
        if (r12 == null) goto L36;
        r10.j(r12);
    L36:
        r10.m = this;
        r10.n = r11;
    L37:
        R = false;
        return;
    L45:
        r6.c = true;     // Catch: Throwable -> L21
        Set r13 = if5.b;     // Catch: Throwable -> L21
        monitor-enter(r13);     // Catch: Throwable -> L21
        monitor-exit(r13);     // Catch: Throwable -> L28
        og5 r14 = new og5(this, r13);     // Catch: Throwable -> L21
        if (og5.class.isMemberClass() == true) goto L17;
    L23:
        ld2 r15 = new ld2(r14);     // Catch: Throwable -> L21
        r9.d(0, r15);     // Catch: Throwable -> L21
        r6.c = false;
        md2 r16 = new md2(r15.l, r7);
        r15.e(this, r16);
        md2 r17 = r15.n;
        if (r17 == null) goto L27;
        r15.j(r17);
    L27:
        r15.m = this;
        r15.n = r16;
        goto L37
    L17:
        if (Modifier.isStatic(og5.class.getModifiers()) == true) goto L23;
        throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + r14);     // Catch: Throwable -> L21
    L28:
        th = move-exception;
        throw th;     // Catch: Throwable -> L21
    L21:
        th = move-exception;
        r6.c = false;
        throw th;
    L39:
        kf2.o("initLoader must be called on the main thread");
        return;
    L43:
        kf2.n("Local and anonymous classes can not be ViewModels");
    }

    public final void n(int r3) {
        Status r0 = new Status(r3, null, null, null);
        Intent r4 = new Intent();
        r4.putExtra("googleSignInStatus", r0);
        setResult(0, r4);
        finish();
        R = false;
    }

    @Override // defpackage.nc1, defpackage.l70, android.app.Activity
    public final void onActivityResult(int r4, int r5, Intent r6) {
        if (this.M == true) goto L34;
        setResult(0);
        if (r4 == 40962) goto L9;
        return;
    L9:
        if (r6 == null) goto L30;
        SignInAccount r0 = (SignInAccount) r6.getParcelableExtra("signInAccount");
        if (r0 == null) goto L24;
        GoogleSignInAccount r1 = r0.o;
        if (r1 == null) goto L24;
        zg5 r2 = zg5.E(this);
        GoogleSignInOptions r7 = this.N.o;
        monitor-enter(r2);
        ((bm4) r2.n).c(r1, r7);     // Catch: Throwable -> L20
        monitor-exit(r2);
        r6.removeExtra("signInAccount");
        r6.putExtra("googleSignInAccount", r1);
        this.O = true;
        this.P = r5;
        this.Q = r6;
        m();
        return;
    L20:
        th = move-exception;
        throw th;
    L24:
        if (r6.hasExtra("errorCode") == false) goto L30;
        int r8 = r6.getIntExtra("errorCode", 8);
        if (r8 != 13) goto L28;
        r8 = 12501;
    L28:
        n(r8);
        return;
    L30:
        n(8);
        return;
    }

    @Override // defpackage.nc1, defpackage.l70, defpackage.k70, android.app.Activity
    public final void onCreate(Bundle r7) {
        super.onCreate(r7);
        Intent r0 = getIntent();
        String r1 = r0.getAction();
        if (r1 != null) goto L7;
        Log.e("AuthSignInClient", "Null action");
        n(12500);
        return;
    L7:
        if (r1.equals("com.google.android.gms.auth.NO_IMPL") == false) goto L11;
        Log.e("AuthSignInClient", "Action not implemented");
        n(12500);
        return;
    L11:
        if (r1.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") == false) goto L13;
    L17:
        Bundle r2 = r0.getBundleExtra("config");
        if (r2 != null) goto L21;
        Log.e("AuthSignInClient", "Activity started with no configuration.");
        setResult(0);
        finish();
        return;
    L21:
        SignInConfiguration r3 = (SignInConfiguration) r2.getParcelable("config");
        if (r3 != null) goto L25;
        Log.e("AuthSignInClient", "Activity started with invalid configuration.");
        setResult(0);
        finish();
        return;
    L25:
        this.N = r3;
        if (r7 == null) goto L28;
        boolean r4 = r7.getBoolean("signingInGoogleApiClients");
        this.O = r4;
        if (r4 == false) goto L50;
        this.P = r7.getInt("signInResultCode");
        Intent r8 = (Intent) r7.getParcelable("signInResultData");
        if (r8 != null) goto L46;
        Log.e("AuthSignInClient", "Sign in result data cannot be null");
        setResult(0);
        finish();
        return;
    L46:
        this.Q = r8;
        m();
        return;
    L50:
        return;
    L28:
        if (R == false) goto L31;
        setResult(0);
        n(12502);
        return;
    L31:
        R = true;
        Intent r5 = new Intent(r1);
        if (r1.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") == false) goto L34;
        r5.setPackage("com.google.android.gms");
    L35:
        r5.putExtra("config", this.N);
        startActivityForResult(r5, 40962);     // Catch: ActivityNotFoundException -> L38
        return;
    L38:
        this.M = true;
        Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
        n(17);
        return;
    L34:
        r5.setPackage(getPackageName());
        goto L35
    L13:
        if (r1.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN") == true) goto L17;
        Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(r0.getAction())));
        finish();
    }

    @Override // defpackage.nc1, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        R = false;
    }

    @Override // defpackage.l70, defpackage.k70, android.app.Activity
    public final void onSaveInstanceState(Bundle r3) {
        super.onSaveInstanceState(r3);
        r3.putBoolean("signingInGoogleApiClients", this.O);
        if (this.O == false) goto L6;
        r3.putInt("signInResultCode", this.P);
        r3.putParcelable("signInResultData", this.Q);
        return;
    }
}
