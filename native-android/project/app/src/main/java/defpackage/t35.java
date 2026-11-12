package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t35 extends u35 {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public String k;

    public t35(t35 r8, oi r9) {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix r2 = new Matrix();
        this.j = r2;
        this.k = null;
        this.c = r8.c;
        this.d = r8.d;
        this.e = r8.e;
        this.f = r8.f;
        this.g = r8.g;
        this.h = r8.h;
        this.i = r8.i;
        String r4 = r8.k;
        this.k = r4;
        if (r4 == null) goto L5;
        r9.put(r4, this);
    L5:
        r2.set(r8.j);
        ArrayList r10 = r8.b;
        int r3 = 0;
    L7:
        if (r3 >= r10.size()) goto L23;
        Object r5 = r10.get(r3);
        if ((r5 instanceof t35) == false) goto L12;
        this.b.add(new t35((t35) r5, r9));
    L20:
        r3 = r3 + 1;
        goto L7
    L12:
        if ((r5 instanceof s35) == false) goto L15;
        s35 r6 = (s35) r5;
        s35 r7 = new s35(r6);
        r7.e = 0.0f;
        r7.g = 1.0f;
        r7.h = 1.0f;
        r7.i = 0.0f;
        r7.j = 1.0f;
        r7.k = 0.0f;
        r7.l = Paint.Cap.BUTT;
        r7.m = Paint.Join.MITER;
        r7.n = 4.0f;
        r7.d = r6.d;
        r7.e = r6.e;
        r7.g = r6.g;
        r7.f = r6.f;
        r7.c = r6.c;
        r7.h = r6.h;
        r7.i = r6.i;
        r7.j = r6.j;
        r7.k = r6.k;
        r7.l = r6.l;
        r7.m = r6.m;
        r7.n = r6.n;
        v35 r11 = r7;
    L17:
        this.b.add(r11);
        Object r12 = r11.b;
        if (r12 == null) goto L20;
        r9.put(r12, r11);
        goto L20
    L15:
        if ((r5 instanceof r35) == false) goto L21;
        r11 = new r35((r35) r5);
        goto L17
    L21:
        kf2.o("Unknown object in the tree!");
        throw null;
    }

    @Override // defpackage.u35
    public final boolean a() {
        int r1 = 0;
    L3:
        ArrayList r2 = this.b;
        if (r1 >= r2.size()) goto L10;
        if (((u35) r2.get(r1)).a() == true) goto L7;
        r1 = r1 + 1;
        goto L3
    L7:
        return true;
    L10:
        return false;
    }

    @Override // defpackage.u35
    public final boolean b(int[] r5) {
        int r0 = 0;
        boolean r1 = false;
    L3:
        ArrayList r2 = this.b;
        if (r0 >= r2.size()) goto L6;
        r1 = r1 | ((u35) r2.get(r0)).b(r5);
        r0 = r0 + 1;
        goto L3
    L6:
        return r1;
    }

    public final void c() {
        Matrix r0 = this.j;
        r0.reset();
        r0.postTranslate(-this.d, -this.e);
        r0.postScale(this.f, this.g);
        r0.postRotate(this.c, 0.0f, 0.0f);
        r0.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float r2) {
        if (r2 == this.d) goto L6;
        this.d = r2;
        c();
        return;
    }

    public void setPivotY(float r2) {
        if (r2 == this.e) goto L6;
        this.e = r2;
        c();
        return;
    }

    public void setRotation(float r2) {
        if (r2 == this.c) goto L6;
        this.c = r2;
        c();
        return;
    }

    public void setScaleX(float r2) {
        if (r2 == this.f) goto L6;
        this.f = r2;
        c();
        return;
    }

    public void setScaleY(float r2) {
        if (r2 == this.g) goto L6;
        this.g = r2;
        c();
        return;
    }

    public void setTranslateX(float r2) {
        if (r2 == this.h) goto L6;
        this.h = r2;
        c();
        return;
    }

    public void setTranslateY(float r2) {
        if (r2 == this.i) goto L6;
        this.i = r2;
        c();
        return;
    }

    public t35() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.k = null;
    }
}
