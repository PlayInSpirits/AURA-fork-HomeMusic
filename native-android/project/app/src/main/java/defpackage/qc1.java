package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qc1 extends AnimationSet implements Runnable {
    public final ViewGroup n;
    public final View o;
    public boolean p;
    public boolean q;
    public boolean r;

    public qc1(Animation r2, ViewGroup r3, View r4) {
        super(false);
        this.r = true;
        this.n = r3;
        this.o = r4;
        addAnimation(r2);
        r3.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long r3, Transformation r5) {
        this.r = true;
        if (this.p == false) goto L7;
        return !this.q;
    L7:
        if (super.getTransformation(r3, r5) == true) goto L9;
        this.p = true;
        h93.a(this.n, this);
    L9:
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean r0 = this.p;
        ViewGroup r1 = this.n;
        if (r0 == false) goto L5;
    L8:
        r1.endViewTransition(this.o);
        this.q = true;
        return;
    L5:
        if (this.r == false) goto L8;
        this.r = false;
        r1.post(this);
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long r3, Transformation r5, float r6) {
        this.r = true;
        if (this.p == false) goto L7;
        return !this.q;
    L7:
        if (super.getTransformation(r3, r5, r6) == true) goto L9;
        this.p = true;
        h93.a(this.n, this);
    L9:
        return true;
    }
}
