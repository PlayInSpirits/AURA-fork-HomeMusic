package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qd extends q35 implements Animatable {
    public final od o;
    public final Context p;
    public l4 q;
    public ArrayList r;
    public final nd s;

    public qd(Context r2) {
        this.q = null;
        this.r = null;
        this.s = new nd(this);
        this.p = r2;
        this.o = new od();
    }

    @Override // defpackage.q35, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme r1) {
        Drawable r0 = this.n;
        if (r0 == null) goto L6;
        r0.applyTheme(r1);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable r0 = this.n;
        if (r0 != null) goto L5;
        return false;
    L5:
        return r0.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas r3) {
        Drawable r0 = this.n;
        if (r0 == null) goto L6;
        r0.draw(r3);
        return;
    L6:
        od r1 = this.o;
        r1.a.draw(r3);
        if (r1.b.isStarted() == false) goto L10;
        invalidateSelf();
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable r0 = this.n;
        if (r0 == null) goto L7;
        return r0.getAlpha();
    L7:
        return this.o.a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable r0 = this.n;
        if (r0 != null) goto L5;
        int r1 = super.getChangingConfigurations();
        this.o.getClass();
        return r1;
    L5:
        return r0.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable r0 = this.n;
        if (r0 == null) goto L7;
        return r0.getColorFilter();
    L7:
        return this.o.a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.n == null) goto L6;
        int r1 = 0;
        return new pd(r1, this.n.getConstantState());
    L6:
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable r0 = this.n;
        if (r0 == null) goto L7;
        return r0.getIntrinsicHeight();
    L7:
        return this.o.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable r0 = this.n;
        if (r0 == null) goto L7;
        return r0.getIntrinsicWidth();
    L7:
        return this.o.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable r0 = this.n;
        if (r0 == null) goto L7;
        return r0.getOpacity();
    L7:
        return this.o.a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources r9, XmlPullParser r10, AttributeSet r11, Resources.Theme r12) {
        Drawable r0 = this.n;
        if (r0 == null) goto L6;
        r0.inflate(r9, r10, r11, r12);
        return;
    L6:
        int r1 = r10.getEventType();
        int r2 = r10.getDepth() + 1;
    L7:
        od r3 = this.o;
        if (r1 == 1) goto L39;
        if (r10.getDepth() >= r2) goto L14;
        if (r1 == 3) goto L39;
    L14:
        if (r1 != 2) goto L37;
        String r4 = r10.getName();
        if ("animated-vector".equals(r4) == false) goto L25;
        TypedArray r5 = gi1.O(r9, r12, r11, fh0.e);
        int r6 = r5.getResourceId(0, 0);
        if (r6 == 0) goto L23;
        z35 r7 = new z35();
        ThreadLocal r8 = g14.a;
        r7.n = r9.getDrawable(r6, r12);
        new y35(r7.n.getConstantState());
        r7.s = false;
        r7.setCallback(this.s);
        z35 r13 = r3.a;
        if (r13 == null) goto L22;
        r13.setCallback(null);
    L22:
        r3.a = r7;
    L23:
        r5.recycle();
        goto L37
    L25:
        if ("target".equals(r4) == false) goto L37;
        TypedArray r14 = r9.obtainAttributes(r11, fh0.f);
        String r15 = r14.getString(0);
        int r16 = r14.getResourceId(1, 0);
        if (r16 == 0) goto L36;
        Context r17 = this.p;
        if (r17 == null) goto L34;
        Animator r18 = AnimatorInflater.loadAnimator(r17, r16);
        r18.setTarget(r3.a.o.b.o.get(r15));
        if (r3.c != null) goto L33;
        r3.c = new ArrayList();
        r3.d = new oi(0);
    L33:
        r3.c.add(r18);
        r3.d.put(r18, r15);
        goto L36
    L34:
        r14.recycle();
        kf2.o("Context can't be null when inflating animators");
        return;
    L36:
        r14.recycle();
    L37:
        r1 = r10.next();
    L39:
        if (r3.b != null) goto L41;
        r3.b = new AnimatorSet();
    L41:
        r3.b.playTogether(r3.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable r0 = this.n;
        if (r0 == null) goto L7;
        return r0.isAutoMirrored();
    L7:
        return this.o.a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable r0 = this.n;
        if (r0 == null) goto L7;
        return ((AnimatedVectorDrawable) r0).isRunning();
    L7:
        return this.o.b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable r0 = this.n;
        if (r0 == null) goto L7;
        return r0.isStateful();
    L7:
        return this.o.a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable r0 = this.n;
        if (r0 == null) goto L5;
        r0.mutate();
    L5:
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect r2) {
        Drawable r0 = this.n;
        if (r0 == null) goto L6;
        r0.setBounds(r2);
        return;
    L6:
        this.o.a.setBounds(r2);
    }

    @Override // defpackage.q35, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int r2) {
        Drawable r0 = this.n;
        if (r0 == null) goto L7;
        return r0.setLevel(r2);
    L7:
        return this.o.a.setLevel(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] r2) {
        Drawable r0 = this.n;
        if (r0 == null) goto L7;
        return r0.setState(r2);
    L7:
        return this.o.a.setState(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
        Drawable r0 = this.n;
        if (r0 == null) goto L6;
        r0.setAlpha(r2);
        return;
    L6:
        this.o.a.setAlpha(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean r2) {
        Drawable r0 = this.n;
        if (r0 == null) goto L6;
        r0.setAutoMirrored(r2);
        return;
    L6:
        this.o.a.setAutoMirrored(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter r2) {
        Drawable r0 = this.n;
        if (r0 == null) goto L6;
        r0.setColorFilter(r2);
        return;
    L6:
        this.o.a.setColorFilter(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int r2) {
        Drawable r0 = this.n;
        if (r0 == null) goto L6;
        r0.setTint(r2);
        return;
    L6:
        this.o.a.setTint(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList r2) {
        Drawable r0 = this.n;
        if (r0 == null) goto L6;
        r0.setTintList(r2);
        return;
    L6:
        this.o.a.setTintList(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode r2) {
        Drawable r0 = this.n;
        if (r0 == null) goto L6;
        r0.setTintMode(r2);
        return;
    L6:
        this.o.a.setTintMode(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean r2, boolean r3) {
        Drawable r0 = this.n;
        if (r0 != null) goto L5;
        this.o.a.setVisible(r2, r3);
        return super.setVisible(r2, r3);
    L5:
        return r0.setVisible(r2, r3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable r0 = this.n;
        if (r0 == null) goto L6;
        ((AnimatedVectorDrawable) r0).start();
        return;
    L6:
        od r1 = this.o;
        if (r1.b.isStarted() == false) goto L9;
        return;
    L9:
        r1.b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable r0 = this.n;
        if (r0 == null) goto L6;
        ((AnimatedVectorDrawable) r0).stop();
        return;
    L6:
        this.o.b.end();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources r2, XmlPullParser r3, AttributeSet r4) {
        inflate(r2, r3, r4, null);
    }
}
