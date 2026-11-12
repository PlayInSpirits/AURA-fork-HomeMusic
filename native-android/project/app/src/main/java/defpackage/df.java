package defpackage;

import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class df extends nc1 implements gf {
    public bg M;

    public df() {
        ((rm3) this.q.p).L("androidx:appcompat", new bf(this));
        g(new cf(this));
    }

    @Override // defpackage.l70, android.app.Activity
    public final void addContentView(View r3, ViewGroup.LayoutParams r4) {
        j();
        bg r2 = (bg) m();
        r2.B();
        ((ViewGroup) r2.N.findViewById(R.id.content)).addView(r3, r4);
        r2.z.a(r2.y.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context r10) {
        bg r0 = (bg) m();
        r0.b0 = true;
        int r2 = r0.f0;
        if (r2 != (-100)) goto L6;
        r2 = pf.o;
    L6:
        int r1 = r0.I(r10, r2);
        if (pf.e(r10) == false) goto L9;
        pf.q(r10);
    L9:
        wd2 r3 = bg.t(r10);
        if ((r10 instanceof ContextThemeWrapper) == false) goto L15;
        ((ContextThemeWrapper) r10).applyOverrideConfiguration(bg.x(r10, r1, r3, null, false));     // Catch: IllegalStateException -> L125
    L123:
        super.attachBaseContext(r10);
        return;
    L15:
        if ((r10 instanceof ud0) == false) goto L20;
        ((ud0) r10).a(bg.x(r10, r1, r3, null, false));     // Catch: IllegalStateException -> L126
    L20:
        if (bg.w0 == false) goto L123;
        Configuration r4 = new Configuration();
        r4.uiMode = -1;
        r4.fontScale = 0.0f;
        Configuration r5 = r10.createConfigurationContext(r4).getResources().getConfiguration();
        Configuration r6 = r10.getResources().getConfiguration();
        r5.uiMode = r6.uiMode;
        if (r5.equals(r6) == true) goto L92;
        Configuration r7 = new Configuration();
        r7.fontScale = 0.0f;
        if (r5.diff(r6) == 0) goto L93;
        float r8 = r5.fontScale;
        float r9 = r6.fontScale;
        if (r8 == r9) goto L30;
        r7.fontScale = r9;
    L30:
        int r11 = r5.mcc;
        int r12 = r6.mcc;
        if (r11 == r12) goto L33;
        r7.mcc = r12;
    L33:
        int r13 = r5.mnc;
        int r14 = r6.mnc;
        if (r13 == r14) goto L36;
        r7.mnc = r14;
    L36:
        uf.a(r5, r6, r7);
        int r15 = r5.touchscreen;
        int r16 = r6.touchscreen;
        if (r15 == r16) goto L39;
        r7.touchscreen = r16;
    L39:
        int r17 = r5.keyboard;
        int r18 = r6.keyboard;
        if (r17 == r18) goto L42;
        r7.keyboard = r18;
    L42:
        int r19 = r5.keyboardHidden;
        int r20 = r6.keyboardHidden;
        if (r19 == r20) goto L45;
        r7.keyboardHidden = r20;
    L45:
        int r21 = r5.navigation;
        int r22 = r6.navigation;
        if (r21 == r22) goto L48;
        r7.navigation = r22;
    L48:
        int r23 = r5.navigationHidden;
        int r24 = r6.navigationHidden;
        if (r23 == r24) goto L51;
        r7.navigationHidden = r24;
    L51:
        int r25 = r5.orientation;
        int r26 = r6.orientation;
        if (r25 == r26) goto L54;
        r7.orientation = r26;
    L54:
        int r27 = r5.screenLayout & 15;
        int r28 = r6.screenLayout & 15;
        if (r27 == r28) goto L57;
        r7.screenLayout |= r28;
    L57:
        int r29 = r5.screenLayout & 192;
        int r30 = r6.screenLayout & 192;
        if (r29 == r30) goto L60;
        r7.screenLayout |= r30;
    L60:
        int r31 = r5.screenLayout & 48;
        int r32 = r6.screenLayout & 48;
        if (r31 == r32) goto L63;
        r7.screenLayout |= r32;
    L63:
        int r33 = r5.screenLayout & 768;
        int r34 = r6.screenLayout & 768;
        if (r33 == r34) goto L67;
        r7.screenLayout |= r34;
    L67:
        if (Build.VERSION.SDK_INT >= 26) goto L69;
    L74:
        int r35 = r5.uiMode & 15;
        int r36 = r6.uiMode & 15;
        if (r35 == r36) goto L77;
        r7.uiMode |= r36;
    L77:
        int r37 = r5.uiMode & 48;
        int r38 = r6.uiMode & 48;
        if (r37 == r38) goto L80;
        r7.uiMode |= r38;
    L80:
        int r39 = r5.screenWidthDp;
        int r40 = r6.screenWidthDp;
        if (r39 == r40) goto L83;
        r7.screenWidthDp = r40;
    L83:
        int r41 = r5.screenHeightDp;
        int r42 = r6.screenHeightDp;
        if (r41 == r42) goto L86;
        r7.screenHeightDp = r42;
    L86:
        int r43 = r5.smallestScreenWidthDp;
        int r44 = r6.smallestScreenWidthDp;
        if (r43 == r44) goto L89;
        r7.smallestScreenWidthDp = r44;
    L89:
        int r45 = r5.densityDpi;
        int r46 = r6.densityDpi;
        if (r45 == r46) goto L93;
        r7.densityDpi = r46;
        goto L93
    L69:
        if ((j3.a(r5) & 3) == (j3.a(r6) & 3)) goto L72;
        j3.q(r7, j3.a(r7) | (j3.a(r6) & 3));
    L72:
        if ((j3.a(r5) & 12) == (j3.a(r6) & 12)) goto L74;
        j3.q(r7, j3.a(r7) | (j3.a(r6) & 12));
    L93:
        Configuration r47 = bg.x(r10, r1, r3, r7, true);
        ud0 r48 = new ud0(r10, app.homemusic.R.style.Theme_AppCompat_Empty);
        r48.a(r47);
        if (r10.getTheme() == null) goto L122;
        Resources.Theme r110 = r48.getTheme();
        if (Build.VERSION.SDK_INT < 29) goto L99;
        yh.k(r110);
        goto L122
    L99:
        Object r49 = gi1.f;
        monitor-enter(r49);
    L105:
        th = move-exception;
        throw th;
    L102:
        if (gi1.h == false) goto L136;
    L110:
        Method r50 = gi1.g;     // Catch: Throwable -> L105
        if (r50 != null) goto L138;
    L118:
        monitor-exit(r49);     // Catch: Throwable -> L105
        goto L122
    L138:
        r50.invoke(r110, null);     // Catch: Throwable -> L105 Throwable -> L114 IllegalAccessException -> L116
    L114:
        e = move-exception;
        Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e);     // Catch: Throwable -> L105
        gi1.g = null;     // Catch: Throwable -> L105
        goto L118
    L136:
        Method r51 = Resources.Theme.class.getDeclaredMethod("rebase", null);     // Catch: Throwable -> L105 NoSuchMethodException -> L107
        gi1.g = r51;     // Catch: Throwable -> L105 NoSuchMethodException -> L107
        r51.setAccessible(true);     // Catch: Throwable -> L105 NoSuchMethodException -> L107
    L109:
        gi1.h = true;     // Catch: Throwable -> L105
        goto L110
    L107:
        e = move-exception;
        Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);     // Catch: Throwable -> L105
    L122:
        r10 = r48;
        goto L123
    L92:
        r7 = null;
        goto L93
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        l93 r0 = n();
        if (getWindow().hasFeature(0) == false) goto L9;
        if (r0 != null) goto L6;
    L7:
        super.closeOptionsMenu();
        return;
    L6:
        if (r0.q() == false) goto L7;
        return;
    }

    @Override // defpackage.k70, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent r4) {
        int r0 = r4.getKeyCode();
        l93 r1 = n();
        if (r0 != 82) goto L10;
        if (r1 == null) goto L10;
        if (r1.Q(r4) == false) goto L10;
        return true;
    L10:
        return super.dispatchKeyEvent(r4);
    }

    @Override // android.app.Activity
    public final View findViewById(int r1) {
        bg r0 = (bg) m();
        r0.B();
        return r0.y.findViewById(r1);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        bg r2 = (bg) m();
        if (r2.B != null) goto L10;
        r2.G();
        l93 r1 = r2.A;
        if (r1 == null) goto L7;
        Context r3 = r1.J();
    L8:
        r2.B = new no4(r3);
        goto L10
    L7:
        r3 = r2.x;
    L10:
        return r2.B;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int r0 = a45.a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        m().d();
    }

    public final pf m() {
        if (this.M != null) goto L6;
        ia4 r0 = pf.n;
        this.M = new bg(this, null, this, this);
    L6:
        return this.M;
    }

    public final l93 n() {
        bg r0 = (bg) m();
        r0.G();
        return r0.A;
    }

    public final void o(Toolbar r4) {
        bg r3 = (bg) m();
        if ((r3.w instanceof Activity) == true) goto L5;
        return;
    L5:
        r3.G();
        l93 r0 = r3.A;
        if ((r0 instanceof ia5) == true) goto L20;
        r3.B = null;
        if (r0 == null) goto L10;
        r0.O();
    L10:
        r3.A = null;
        if (r4 == null) goto L17;
        Object r1 = r3.w;
        if ((r1 instanceof Activity) == false) goto L15;
        CharSequence r2 = ((Activity) r1).getTitle();
    L16:
        cv4 r5 = new cv4(r4, r2, r3.z);
        r3.A = r5;
        xf r6 = r3.z;
        r6.o = r5.f;
        r4.setBackInvokedCallbackEnabled(true);
    L18:
        r3.d();
        return;
    L15:
        r2 = r3.C;
        goto L16
    L17:
        r3.z.o = null;
        goto L18
    L20:
        kf2.o("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    }

    @Override // defpackage.l70, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration r4) {
        super.onConfigurationChanged(r4);
        bg r3 = (bg) m();
        if (r3.S == true) goto L5;
    L9:
        fg r5 = fg.a();
        Context r0 = r3.x;
        monitor-enter(r5);
        c14 r1 = r5.a;     // Catch: Throwable -> L25
        monitor-enter(r1);     // Catch: Throwable -> L25
        xe2 r2 = (xe2) r1.b.get(r0);     // Catch: Throwable -> L17
        if (r2 == null) goto L19;
        r2.a();     // Catch: Throwable -> L17
    L19:
        monitor-exit(r1);     // Catch: Throwable -> L25
        monitor-exit(r5);
        r3.e0 = new Configuration(r3.x.getResources().getConfiguration());
        r3.r(false, false);
        return;
    L17:
        th = move-exception;
        throw th;     // Catch: Throwable -> L25
    L25:
        th = move-exception;
        throw th;
    L5:
        if (r3.M == false) goto L9;
        r3.G();
        l93 r6 = r3.A;
        if (r6 == null) goto L9;
        r6.N();
        goto L9
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // defpackage.nc1, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m().g();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int r3, KeyEvent r4) {
        if (Build.VERSION.SDK_INT >= 26) goto L21;
        if (r4.isCtrlPressed() == true) goto L21;
        if (KeyEvent.metaStateHasNoModifiers(r4.getMetaState()) == true) goto L21;
        if (r4.getRepeatCount() != 0) goto L21;
        if (KeyEvent.isModifierKey(r4.getKeyCode()) == true) goto L21;
        Window r0 = getWindow();
        if (r0 == null) goto L21;
        if (r0.getDecorView() == null) goto L21;
        if (r0.getDecorView().dispatchKeyShortcutEvent(r4) == false) goto L21;
        return true;
    L21:
        return super.onKeyDown(r3, r4);
    }

    @Override // defpackage.nc1, defpackage.l70, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int r3, MenuItem r4) {
        if (super.onMenuItemSelected(r3, r4) == true) goto L26;
        l93 r5 = n();
        if (r4.getItemId() != 16908332) goto L29;
        if (r5 != null) goto L9;
        return false;
    L9:
        if ((r5.I() & 4) == 0) goto L34;
        Intent r6 = te5.y(this);
        if (r6 != null) goto L13;
        return false;
    L13:
        if (shouldUpRecreateTask(r6) == false) goto L27;
        hr4 r7 = new hr4(this);
        Intent r8 = te5.y(this);
        if (r8 != null) goto L17;
        r8 = te5.y(this);
    L17:
        if (r8 == null) goto L22;
        ComponentName r1 = r8.getComponent();
        if (r1 != null) goto L21;
        r1 = r8.resolveActivity(r7.o.getPackageManager());
    L21:
        r7.a(r1);
        r7.n.add(r8);
    L22:
        r7.b();
        finishAffinity();     // Catch: IllegalStateException -> L25
    L25:
        finish();
        goto L26
    L27:
        navigateUpTo(r6);
        return true;
    L34:
        return false;
    L29:
        return false;
    L26:
        return true;
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle r1) {
        super.onPostCreate(r1);
        ((bg) m()).B();
    }

    @Override // defpackage.nc1, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        bg r1 = (bg) m();
        r1.G();
        l93 r2 = r1.A;
        if (r2 == null) goto L6;
        r2.j0(true);
        return;
    }

    @Override // defpackage.nc1, android.app.Activity
    public void onStart() {
        super.onStart();
        ((bg) m()).r(true, false);
    }

    @Override // defpackage.nc1, android.app.Activity
    public void onStop() {
        super.onStop();
        bg r1 = (bg) m();
        r1.G();
        l93 r2 = r1.A;
        if (r2 == null) goto L6;
        r2.j0(false);
        return;
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence r1, int r2) {
        super.onTitleChanged(r1, r2);
        m().p(r1);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        l93 r0 = n();
        if (getWindow().hasFeature(0) == false) goto L9;
        if (r0 != null) goto L6;
    L7:
        super.openOptionsMenu();
        return;
    L6:
        if (r0.R() == false) goto L7;
        return;
    }

    @Override // defpackage.l70, android.app.Activity
    public final void setContentView(int r1) {
        j();
        m().k(r1);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int r1) {
        super.setTheme(r1);
        ((bg) m()).g0 = r1;
    }

    @Override // defpackage.l70, android.app.Activity
    public void setContentView(View r1) {
        j();
        m().l(r1);
    }

    @Override // defpackage.l70, android.app.Activity
    public final void setContentView(View r1, ViewGroup.LayoutParams r2) {
        j();
        m().n(r1, r2);
    }
}
