/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.os.Build;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.m81;
import java.util.ArrayList;

public final class o81
extends m81 {
    public o81(com.google.android.material.floatingactionbutton.FloatingActionButton a0, defpackage.zh0 a1) {
        super(a0, a1);
    }

    public StateListAnimator I;

    @Override
    public final void e(float f16, float f17, float f18) {
        FloatingActionButton floatingActionButton = this.r;
        if (floatingActionButton.getStateListAnimator() == this.I) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(m81.C, this.i(f16, f18));
            stateListAnimator.addState(m81.D, this.i(f16, f17));
            stateListAnimator.addState(m81.E, this.i(f16, f17));
            stateListAnimator.addState(m81.F, this.i(f16, f17));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList<ObjectAnimator> arrayList = new ArrayList<ObjectAnimator>();
            arrayList.add(ObjectAnimator.ofFloat((Object)floatingActionButton, "elevation", f16).setDuration(0L));
            if (Build.VERSION.SDK_INT <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially(arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(m81.x);
            stateListAnimator.addState(m81.G, animatorSet);
            stateListAnimator.addState(m81.H, this.i(0.0f, 0.0f));
            this.I = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (!(((FloatingActionButton)this.s.o).x || this.f && floatingActionButton.getSizeDimension() < this.k)) {
            return;
        }
        this.h();
    }

    public final AnimatorSet i(float f16, float f17) {
        AnimatorSet animatorSet = new AnimatorSet();
        FloatingActionButton floatingActionButton = this.r;
        animatorSet.play(ObjectAnimator.ofFloat((Object)floatingActionButton, "elevation", f16).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, f17).setDuration(100L));
        animatorSet.setInterpolator(m81.x);
        return animatorSet;
    }
}

