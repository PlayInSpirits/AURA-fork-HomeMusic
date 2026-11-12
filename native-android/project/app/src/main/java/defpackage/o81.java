package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.os.Build;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o81 extends m81 {
    public StateListAnimator I;

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
    @Override // defpackage.m81
    public final void e(float r9, float r10, float r11) {
        FloatingActionButton r0 = this.r;
        if (r0.getStateListAnimator() != this.I) goto L9;
        StateListAnimator r1 = new StateListAnimator();
        r1.addState(m81.C, i(r9, r11));
        r1.addState(m81.D, i(r9, r10));
        r1.addState(m81.E, i(r9, r10));
        r1.addState(m81.F, i(r9, r10));
        AnimatorSet r12 = new AnimatorSet();
        ArrayList r13 = new ArrayList();
        r13.add(ObjectAnimator.ofFloat(r0, "elevation", new float[]{r9}).setDuration(0));
        if (Build.VERSION.SDK_INT > 24) goto L7;
        r13.add(ObjectAnimator.ofFloat(r0, View.TRANSLATION_Z, new float[]{r0.getTranslationZ()}).setDuration(100));
    L7:
        r13.add(ObjectAnimator.ofFloat(r0, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
        r12.playSequentially((Animator[]) r13.toArray(new Animator[0]));
        r12.setInterpolator(m81.x);
        r1.addState(m81.G, r12);
        r1.addState(m81.H, i(0.0f, 0.0f));
        this.I = r1;
        r0.setStateListAnimator(r1);
    L9:
        if (((FloatingActionButton) this.s.o).x == false) goto L11;
    L15:
        h();
        return;
    L11:
        if (this.f == true) goto L13;
        return;
    L13:
        if (r0.getSizeDimension() < this.k) goto L15;
    }

    public final AnimatorSet i(float r7, float r8) {
        AnimatorSet r0 = new AnimatorSet();
        FloatingActionButton r6 = this.r;
        r0.play(ObjectAnimator.ofFloat(r6, "elevation", new float[]{r7}).setDuration(0)).with(ObjectAnimator.ofFloat(r6, View.TRANSLATION_Z, new float[]{r8}).setDuration(100));
        r0.setInterpolator(m81.x);
        return r0;
    }
}
