package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s35 extends v35 {
    public ue1 d;
    public float e;
    public ue1 f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public Paint.Cap l;
    public Paint.Join m;
    public float n;

    @Override // defpackage.u35
    public final boolean a() {
        if (this.f.n() == false) goto L5;
        return true;
    L5:
        if (this.d.n() == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // defpackage.u35
    public final boolean b(int[] r6) {
        ue1 r0 = this.f;
        boolean r2 = true;
        if (r0.n() == false) goto L7;
        ColorStateList r1 = (ColorStateList) r0.q;
        int r3 = r1.getColorForState(r6, r1.getDefaultColor());
        if (r3 == r0.o) goto L7;
        r0.o = r3;
        boolean r4 = true;
    L8:
        ue1 r5 = this.d;
        if (r5.n() == false) goto L13;
        ColorStateList r7 = (ColorStateList) r5.q;
        int r8 = r7.getColorForState(r6, r7.getDefaultColor());
        if (r8 == r5.o) goto L13;
        r5.o = r8;
    L15:
        return r4 | r2;
    L13:
        r2 = false;
    L7:
        r4 = false;
        goto L8
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f.o;
    }

    public float getStrokeAlpha() {
        return this.g;
    }

    public int getStrokeColor() {
        return this.d.o;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.j;
    }

    public float getTrimPathOffset() {
        return this.k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float r1) {
        this.h = r1;
    }

    public void setFillColor(int r1) {
        this.f.o = r1;
    }

    public void setStrokeAlpha(float r1) {
        this.g = r1;
    }

    public void setStrokeColor(int r1) {
        this.d.o = r1;
    }

    public void setStrokeWidth(float r1) {
        this.e = r1;
    }

    public void setTrimPathEnd(float r1) {
        this.j = r1;
    }

    public void setTrimPathOffset(float r1) {
        this.k = r1;
    }

    public void setTrimPathStart(float r1) {
        this.i = r1;
    }
}
