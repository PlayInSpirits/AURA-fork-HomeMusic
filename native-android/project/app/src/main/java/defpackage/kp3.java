package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kp3 extends kc1 {
    public final jp3 l0;
    public pp3 m0;
    public RecyclerView n0;
    public boolean o0;
    public boolean p0;
    public int q0;
    public final zk r0;
    public final g5 s0;

    public kp3() {
        this.l0 = new jp3(this);
        this.q0 = R.layout.preference_list_fragment;
        this.r0 = new zk(this, Looper.getMainLooper(), 11);
        this.s0 = new g5(23, this);
    }

    @Override // defpackage.kc1
    public void F(Bundle r4) {
        super.F(r4);
        TypedValue r5 = new TypedValue();
        Z().getTheme().resolveAttribute(R.attr.preferenceTheme, r5, true);
        int r6 = r5.resourceId;
        if (r6 != 0) goto L5;
        r6 = R.style.PreferenceThemeOverlay;
    L5:
        Z().getTheme().applyStyle(r6, false);
        pp3 r7 = new pp3(Z());
        this.m0 = r7;
        r7.j = this;
        Bundle r8 = this.s;
        if (r8 == null) goto L8;
        String r9 = r8.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
    L9:
        i0(r9);
        return;
    L8:
        r9 = null;
        goto L9
    }

    @Override // defpackage.kc1
    public View H(LayoutInflater r9, ViewGroup r10, Bundle r11) {
        TypedArray r12 = Z().obtainStyledAttributes(null, bt3.h, R.attr.preferenceFragmentCompatStyle, 0);
        this.q0 = r12.getResourceId(0, this.q0);
        Drawable r2 = r12.getDrawable(1);
        int r4 = r12.getDimensionPixelSize(2, -1);
        boolean r6 = r12.getBoolean(3, true);
        r12.recycle();
        LayoutInflater r13 = r9.cloneInContext(Z());
        View r14 = r13.inflate(this.q0, r10, false);
        View r15 = r14.findViewById(android.R.id.list_container);
        if ((r15 instanceof ViewGroup) == false) goto L34;
        ViewGroup r16 = (ViewGroup) r15;
        if (Z().getPackageManager().hasSystemFeature("android.hardware.type.automotive") == false) goto L9;
        RecyclerView r0 = (RecyclerView) r16.findViewById(R.id.recycler_view);
        if (r0 == null) goto L9;
    L10:
        this.n0 = r0;
        jp3 r17 = this.l0;
        r0.i(r17);
        if (r2 == null) goto L13;
        r17.getClass();
        r17.b = r2.getIntrinsicHeight();
    L14:
        r17.a = r2;
        kp3 r1 = r17.d;
        RecyclerView r3 = r1.n0;
        if (r3.C.size() == 0) goto L21;
        mw3 r5 = r3.A;
        if (r5 == null) goto L20;
        r5.c("Cannot invalidate item decorations during a scroll or layout");
    L20:
        r3.T();
        r3.requestLayout();
    L21:
        if (r4 == (-1)) goto L29;
        r17.b = r4;
        RecyclerView r7 = r1.n0;
        if (r7.C.size() == 0) goto L29;
        mw3 r8 = r7.A;
        if (r8 == null) goto L28;
        r8.c("Cannot invalidate item decorations during a scroll or layout");
    L28:
        r7.T();
        r7.requestLayout();
    L29:
        r17.c = r6;
        if (this.n0.getParent() != null) goto L32;
        r16.addView(this.n0);
    L32:
        this.r0.post(this.s0);
        return r14;
    L13:
        r17.b = 0;
    L9:
        r0 = (RecyclerView) r13.inflate(R.layout.preference_recyclerview, r16, false);
        Z();
        r0.setLayoutManager(new LinearLayoutManager(1));
        r0.setAccessibilityDelegateCompat(new qp3(r0));
        goto L10
    L34:
        kf2.o("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        return null;
    }

    @Override // defpackage.kc1
    public void J() {
        g5 r0 = this.s0;
        zk r1 = this.r0;
        r1.removeCallbacks(r0);
        r1.removeMessages(1);
        if (this.o0 == false) goto L7;
        this.n0.setAdapter(null);
        PreferenceScreen r2 = (PreferenceScreen) this.m0.g;
        if (r2 == null) goto L7;
        r2.n();
    L7:
        this.n0 = null;
        this.R = true;
    }

    @Override // defpackage.kc1
    public final void Q(Bundle r2) {
        PreferenceScreen r1 = (PreferenceScreen) this.m0.g;
        if (r1 == null) goto L6;
        Bundle r0 = new Bundle();
        r1.c(r0);
        r2.putBundle("android:preferences", r0);
        return;
    }

    @Override // defpackage.kc1
    public void R() {
        this.R = true;
        pp3 r0 = this.m0;
        r0.h = this;
        r0.i = this;
    }

    @Override // defpackage.kc1
    public void S() {
        this.R = true;
        pp3 r1 = this.m0;
        r1.h = null;
        r1.i = null;
    }

    @Override // defpackage.kc1
    public void T(View r2, Bundle r3) {
        if (r3 == null) goto L9;
        Bundle r4 = r3.getBundle("android:preferences");
        if (r4 == null) goto L9;
        PreferenceScreen r5 = (PreferenceScreen) this.m0.g;
        if (r5 == null) goto L9;
        r5.b(r4);
    L9:
        if (this.o0 == false) goto L13;
        PreferenceScreen r6 = (PreferenceScreen) this.m0.g;
        if (r6 == null) goto L13;
        this.n0.setAdapter(new np3(r6));
        r6.j();
    L13:
        this.p0 = true;
    }

    public final Preference h0(String r2) {
        pp3 r1 = this.m0;
        if (r1 != null) goto L5;
        return null;
    L5:
        PreferenceScreen r3 = (PreferenceScreen) r1.g;
        if (r3 != null) goto L9;
        return null;
    L9:
        return r3.F(r2);
    }

    public abstract void i0(String r1);

    public final void j0(int r5, String r6) {
        pp3 r0 = this.m0;
        if (r0 == null) goto L30;
        Context r1 = Z();
        r0.a = true;
        op3 r3 = new op3(r1, r0);
        XmlResourceParser r7 = r1.getResources().getXml(r5);
        PreferenceGroup r2 = r3.c(r7);     // Catch: Throwable -> L27
        r7.close();
        PreferenceScreen r4 = (PreferenceScreen) r2;
        r4.k(r0);
        SharedPreferences.Editor r8 = (SharedPreferences.Editor) r0.e;
        if (r8 == null) goto L9;
        r8.apply();
    L9:
        r0.a = false;
        PreferenceScreen r9 = r4;
        if (r6 == null) goto L16;
        Preference r10 = r4.F(r6);
        boolean r11 = r10 instanceof PreferenceScreen;
        r9 = r10;
        if (r11 == true) goto L16;
        kf2.n(xa3.h("Preference object with key ", r6, " is not a PreferenceScreen"));
        return;
    L16:
        PreferenceScreen r12 = r9;
        pp3 r13 = this.m0;
        PreferenceScreen r14 = (PreferenceScreen) r13.g;
        if (r12 == r14) goto L34;
        if (r14 == null) goto L20;
        r14.n();
    L20:
        r13.g = r12;
        this.o0 = true;
        if (this.p0 == false) goto L35;
        zk r15 = this.r0;
        if (r15.hasMessages(1) == true) goto L36;
        r15.obtainMessage(1).sendToTarget();
        return;
    L36:
        return;
    L35:
        return;
    L34:
        return;
    L27:
        th = move-exception;
        r7.close();
        throw th;
    L30:
        tb4.e("This should be called after super.onCreate.");
    }
}
