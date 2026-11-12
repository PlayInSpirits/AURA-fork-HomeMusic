package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zx2 {
    public final yd4 a;
    public final yd4 b;

    public zx2() {
        this.a = new yd4(0);
        this.b = new yd4(0);
    }

    public static zx2 a(Context r1, TypedArray r2, int r3) {
        if (r2.hasValue(r3) == false) goto L8;
        int r4 = r2.getResourceId(r3, 0);
        if (r4 != 0) goto L7;
        return null;
    L7:
        return b(r1, r4);
    L8:
        return null;
    }

    public static zx2 b(Context r3, int r4) {
        Animator r5 = AnimatorInflater.loadAnimator(r3, r4);     // Catch: Exception -> L7
        if ((r5 instanceof AnimatorSet) == true) goto L6;
        if (r5 == null) goto L12;
        ArrayList r1 = new ArrayList();     // Catch: Exception -> L7
        r1.add(r5);     // Catch: Exception -> L7
        return c(r1);
    L12:
        return null;
    L6:
        return c(((AnimatorSet) r5).getChildAnimations());
    L7:
        e = move-exception;
        Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(r4), e);
        return null;
    }

    public static zx2 c(ArrayList r13) {
        zx2 r0 = new zx2();
        int r1 = r13.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L20;
        Animator r4 = (Animator) r13.get(r3);
        if ((r4 instanceof ObjectAnimator) == false) goto L18;
        ObjectAnimator r5 = (ObjectAnimator) r4;
        r0.h(r5.getPropertyName(), r5.getValues());
        String r6 = r5.getPropertyName();
        long r7 = r5.getStartDelay();
        long r9 = r5.getDuration();
        TimeInterpolator r11 = r5.getInterpolator();
        if ((r11 instanceof AccelerateDecelerateInterpolator) == true) goto L16;
        if (r11 == null) goto L16;
        if ((r11 instanceof AccelerateInterpolator) == false) goto L14;
        r11 = yd.c;
    L17:
        ay2 r8 = new ay2();
        r8.d = 0;
        r8.e = 1;
        r8.a = r7;
        r8.b = r9;
        r8.c = r11;
        r8.d = r5.getRepeatCount();
        r8.e = r5.getRepeatMode();
        r0.a.put(r6, r8);
        r3 = r3 + 1;
        goto L3
    L14:
        if ((r11 instanceof DecelerateInterpolator) == false) goto L17;
        r11 = yd.d;
    L16:
        r11 = yd.b;
        goto L17
    L18:
        mj0.l(r4, "Animator must be an ObjectAnimator: ");
        return null;
    L20:
        return r0;
    }

    public final ObjectAnimator d(String r2, Object r3, Property r4) {
        ObjectAnimator r5 = ObjectAnimator.ofPropertyValuesHolder(r3, e(r2));
        r5.setProperty(r4);
        f(r2).a(r5);
        return r5;
    }

    public final PropertyValuesHolder[] e(String r3) {
        if (g(r3) == false) goto L9;
        PropertyValuesHolder[] r2 = (PropertyValuesHolder[]) this.b.get(r3);
        PropertyValuesHolder[] r4 = new PropertyValuesHolder[r2.length];
        int r0 = 0;
    L6:
        if (r0 >= r2.length) goto L8;
        r4[r0] = r2[r0].clone();
        r0 = r0 + 1;
        goto L6
    L8:
        return r4;
    L9:
        nz2.c();
        return null;
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof zx2) == true) goto L10;
        return false;
    L10:
        return this.a.equals(((zx2) r2).a);
    }

    public final ay2 f(String r2) {
        yd4 r1 = this.a;
        if (r1.get(r2) != null) goto L5;
        nz2.c();
        return null;
    L5:
        return (ay2) r1.get(r2);
    }

    public final boolean g(String r1) {
        if (this.b.get(r1) == null) goto L6;
        return true;
    L6:
        return false;
    }

    public final void h(String r1, PropertyValuesHolder[] r2) {
        this.b.put(r1, r2);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "\n" + zx2.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
