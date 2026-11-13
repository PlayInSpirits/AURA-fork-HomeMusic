package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class qc1 extends AnimationSet implements Runnable {
    public final ViewGroup n;
    public final View o;
    public boolean p;
    public boolean q;
    public boolean r;

    public qc1(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.r = true;
        this.n = viewGroup;
        this.o = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.r = true;
        if (this.p) {
            return !this.q;
        }
        if (!super.getTransformation(j, transformation)) {
            this.p = true;
            h93.a(this.n, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.p;
        ViewGroup viewGroup = this.n;
        if (z || !this.r) {
            viewGroup.endViewTransition(this.o);
            this.q = true;
        } else {
            this.r = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.r = true;
        if (this.p) {
            return !this.q;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.p = true;
            h93.a(this.n, this);
        }
        return true;
    }
}
