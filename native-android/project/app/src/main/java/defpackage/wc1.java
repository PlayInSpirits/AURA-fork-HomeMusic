package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wc1 implements LayoutInflater.Factory2 {
    public final ld1 n;

    public wc1(ld1 r1) {
        this.n = r1;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View r11, String r12, Context r13, AttributeSet r14) {
        boolean r0 = FragmentContainerView.class.getName().equals(r12);
        ld1 r1 = this.n;
        if (r0 == false) goto L7;
        return new FragmentContainerView(r13, r14, r1);
    L7:
        if ("fragment".equals(r12) == false) goto L64;
        String r15 = r14.getAttributeValue(null, "class");
        TypedArray r2 = r13.obtainStyledAttributes(r14, ot3.a);
        int r3 = 0;
        if (r15 != null) goto L12;
        r15 = r2.getString(0);
    L12:
        int r6 = r2.getResourceId(1, -1);
        String r8 = r2.getString(2);
        r2.recycle();
        if (r15 == null) goto L64;
        boolean r4 = kc1.class.isAssignableFrom(dd1.b(r13.getClassLoader(), r15));     // Catch: ClassNotFoundException -> L17
    L18:
        if (r4 == false) goto L64;
        if (r11 == null) goto L22;
        r3 = r11.getId();
    L22:
        if (r3 != (-1)) goto L28;
        if (r6 != (-1)) goto L28;
        if (r8 != null) goto L28;
        throw new IllegalArgumentException(r14.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + r15);
    L28:
        if (r6 == (-1)) goto L30;
        kc1 r5 = r1.C(r6);
    L31:
        if (r5 != null) goto L34;
        if (r8 == null) goto L34;
        r5 = r1.D(r8);
    L34:
        if (r5 != null) goto L38;
        if (r3 == (-1)) goto L38;
        r5 = r1.C(r3);
    L38:
        if (r5 != null) goto L47;
        dd1 r7 = r1.F();
        r13.getClassLoader();
        r5 = r7.a(r15);
        r5.A = true;
        if (r6 == 0) goto L42;
        int r16 = r6;
    L43:
        r5.J = r16;
        r5.K = r3;
        r5.L = r8;
        r5.B = true;
        r5.F = r1;
        mc1 r17 = r1.v;
        r5.G = r17;
        r5.M(r17.B, r14, r5.o);
        fe1 r18 = r1.a(r5);
        if (ld1.I(2) == false) goto L51;
        Log.v("FragmentManager", "Fragment " + r5 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(r6));
    L51:
        ViewGroup r19 = (ViewGroup) r11;
        ge1 r110 = he1.a;
        he1.b(new FragmentTagUsageViolation(r5, "Attempting to use <fragment> tag to add fragment " + r5 + " to container " + r19));
        he1.a(r5).getClass();
        r5.S = r19;
        r18.k();
        r18.j();
        View r111 = r5.T;
        if (r111 == null) goto L60;
        if (r6 == 0) goto L56;
        r111.setId(r6);
    L56:
        if (r5.T.getTag() != null) goto L58;
        r5.T.setTag(r8);
    L58:
        r5.T.addOnAttachStateChangeListener(new vc1(this, r18));
        return r5.T;
    L60:
        kf2.o(xa3.h("Fragment ", r15, " did not create a view."));
        return null;
    L42:
        r16 = r3;
        goto L43
    L47:
        if (r5.B == true) goto L63;
        r5.B = true;
        r5.F = r1;
        mc1 r112 = r1.v;
        r5.G = r112;
        r5.M(r112.B, r14, r5.o);
        r18 = r1.f(r5);
        if (ld1.I(2) == false) goto L51;
        Log.v("FragmentManager", "Retained Fragment " + r5 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(r6));
        goto L51
    L63:
        throw new IllegalArgumentException(r14.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(r6) + ", tag " + r8 + ", or parent id 0x" + Integer.toHexString(r3) + " with another fragment for " + r15);
    L30:
        r5 = null;
    L17:
        r4 = false;
    L64:
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String r2, Context r3, AttributeSet r4) {
        return onCreateView(null, r2, r3, r4);
    }
}
