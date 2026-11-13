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

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class SignInHubActivity extends nc1 {
    public static boolean R = false;
    public boolean M = false;
    public SignInConfiguration N;
    public boolean O;
    public int P;
    public Intent Q;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public final void m() {
        e75 d = d();
        un0 un0Var = nd2.d;
        d.getClass();
        sf0 sf0Var = sf0.b;
        sf0Var.getClass();
        bq4 bq4Var = new bq4(d, un0Var, sf0Var);
        i30 a = kx3.a(nd2.class);
        String b = a.b();
        if (b == null) {
            kf2.n("Local and anonymous classes can not be ViewModels");
            return;
        }
        nd2 nd2Var = (nd2) bq4Var.l(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        h95 h95Var = new h95((Object) this);
        boolean z = nd2Var.c;
        mj4 mj4Var = nd2Var.b;
        if (z) {
            kf2.o("Called while creating a loader");
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            kf2.o("initLoader must be called on the main thread");
            return;
        }
        ld2 ld2Var = (ld2) mj4Var.b(0);
        if (ld2Var == null) {
            try {
                nd2Var.c = true;
                Set set = if5.b;
                synchronized (set) {
                }
                og5 og5Var = new og5(this, set);
                if (og5.class.isMemberClass() && !Modifier.isStatic(og5.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + og5Var);
                }
                ld2 ld2Var2 = new ld2(og5Var);
                mj4Var.d(0, ld2Var2);
                nd2Var.c = false;
                md2 md2Var = new md2(ld2Var2.l, h95Var);
                ld2Var2.e(this, md2Var);
                md2 md2Var2 = ld2Var2.n;
                if (md2Var2 != null) {
                    ld2Var2.j(md2Var2);
                }
                ld2Var2.m = this;
                ld2Var2.n = md2Var;
            } catch (Throwable th) {
                nd2Var.c = false;
                throw th;
            }
        } else {
            md2 md2Var3 = new md2(ld2Var.l, h95Var);
            ld2Var.e(this, md2Var3);
            md2 md2Var4 = ld2Var.n;
            if (md2Var4 != null) {
                ld2Var.j(md2Var4);
            }
            ld2Var.m = this;
            ld2Var.n = md2Var3;
        }
        R = false;
    }

    public final void n(int i) {
        Status status = new Status(i, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        R = false;
    }

    @Override // defpackage.nc1, defpackage.l70, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.M) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.o) != null) {
                zg5 E = zg5.E(this);
                GoogleSignInOptions googleSignInOptions = this.N.o;
                synchronized (E) {
                    ((bm4) E.n).c(googleSignInAccount, googleSignInOptions);
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.O = true;
                this.P = i2;
                this.Q = intent;
                m();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                n(intExtra);
                return;
            }
        }
        n(8);
    }

    @Override // defpackage.nc1, defpackage.l70, defpackage.k70, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            n(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            n(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            Log.e("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.N = signInConfiguration;
        if (bundle != null) {
            boolean z = bundle.getBoolean("signingInGoogleApiClients");
            this.O = z;
            if (z) {
                this.P = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                if (intent2 != null) {
                    this.Q = intent2;
                    m();
                    return;
                } else {
                    Log.e("AuthSignInClient", "Sign in result data cannot be null");
                    setResult(0);
                    finish();
                    return;
                }
            }
            return;
        }
        if (R) {
            setResult(0);
            n(12502);
            return;
        }
        R = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.N);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.M = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            n(17);
        }
    }

    @Override // defpackage.nc1, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        R = false;
    }

    @Override // defpackage.l70, defpackage.k70, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.O);
        if (this.O) {
            bundle.putInt("signInResultCode", this.P);
            bundle.putParcelable("signInResultData", this.Q);
        }
    }
}
