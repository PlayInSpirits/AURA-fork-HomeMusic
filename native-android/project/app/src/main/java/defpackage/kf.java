package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kf {
    public ColorStateList a;
    public PorterDuff.Mode b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final TextView f;

    public /* synthetic */ kf(TextView r2) {
        this.a = null;
        this.b = null;
        this.c = false;
        this.d = false;
        this.f = r2;
    }

    public void a() {
        CompoundButton r0 = (CompoundButton) this.f;
        Drawable r1 = r0.getButtonDrawable();
        if (r1 != null) goto L5;
        return;
    L5:
        if (this.c == false) goto L7;
    L8:
        Drawable r2 = r1.mutate();
        if (this.c == false) goto L12;
        r2.setTintList(this.a);
    L12:
        if (this.d == false) goto L15;
        r2.setTintMode(this.b);
    L15:
        if (r2.isStateful() == false) goto L17;
        r2.setState(r0.getDrawableState());
    L17:
        r0.setButtonDrawable(r2);
        return;
    L7:
        if (this.d == true) goto L8;
    }

    public void b() {
        jf r0 = (jf) this.f;
        Drawable r1 = r0.getCheckMarkDrawable();
        if (r1 != null) goto L5;
        return;
    L5:
        if (this.c == false) goto L7;
    L8:
        Drawable r2 = r1.mutate();
        if (this.c == false) goto L12;
        r2.setTintList(this.a);
    L12:
        if (this.d == false) goto L15;
        r2.setTintMode(this.b);
    L15:
        if (r2.isStateful() == false) goto L17;
        r2.setState(r0.getDrawableState());
    L17:
        r0.setCheckMarkDrawable(r2);
        return;
    L7:
        if (this.d == true) goto L8;
    }

    public void c(AttributeSet r9, int r10) {
        CompoundButton r0 = (CompoundButton) this.f;
        Context r8 = r0.getContext();
        int[] r2 = st3.m;
        jv3 r11 = jv3.f(r8, r9, r2, r10);
        TypedArray r7 = (TypedArray) r11.o;
        j65.n(r0, r0.getContext(), r2, r9, (TypedArray) r11.o, r10, 0);
    L9:
        th = move-exception;
        r11.g();
        throw th;
    L4:
        if (r7.hasValue(1) == false) goto L12;
        int r12 = r7.getResourceId(1, 0);     // Catch: Throwable -> L9
        if (r12 == 0) goto L12;
        r0.setButtonDrawable(zz1.r(r0.getContext(), r12));     // Catch: Throwable -> L9 Resources.NotFoundException -> L26
    L17:
        if (r7.hasValue(2) == false) goto L20;
        r0.setButtonTintList(r11.b(2));     // Catch: Throwable -> L9
    L20:
        if (r7.hasValue(3) == false) goto L22;
        r0.setButtonTintMode(aw0.c(r7.getInt(3, -1), null));     // Catch: Throwable -> L9
    L22:
        r11.g();
        return;
    L12:
        if (r7.hasValue(0) == false) goto L17;
        int r13 = r7.getResourceId(0, 0);     // Catch: Throwable -> L9
        if (r13 == 0) goto L17;
        r0.setButtonDrawable(zz1.r(r0.getContext(), r13));     // Catch: Throwable -> L9
        goto L17
    }
}
