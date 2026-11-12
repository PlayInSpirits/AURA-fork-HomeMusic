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

    public t35(t35 t35Var, oi oiVar) {
        v35 r35Var;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.k = null;
        this.c = t35Var.c;
        this.d = t35Var.d;
        this.e = t35Var.e;
        this.f = t35Var.f;
        this.g = t35Var.g;
        this.h = t35Var.h;
        this.i = t35Var.i;
        String str = t35Var.k;
        this.k = str;
        if (str != null) {
            oiVar.put(str, this);
        }
        matrix.set(t35Var.j);
        ArrayList arrayList = t35Var.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof t35) {
                this.b.add(new t35((t35) obj, oiVar));
            } else {
                if (obj instanceof s35) {
                    s35 s35Var = (s35) obj;
                    s35 s35Var2 = new s35(s35Var);
                    s35Var2.e = 0.0f;
                    s35Var2.g = 1.0f;
                    s35Var2.h = 1.0f;
                    s35Var2.i = 0.0f;
                    s35Var2.j = 1.0f;
                    s35Var2.k = 0.0f;
                    s35Var2.l = Paint.Cap.BUTT;
                    s35Var2.m = Paint.Join.MITER;
                    s35Var2.n = 4.0f;
                    s35Var2.d = s35Var.d;
                    s35Var2.e = s35Var.e;
                    s35Var2.g = s35Var.g;
                    s35Var2.f = s35Var.f;
                    s35Var2.c = s35Var.c;
                    s35Var2.h = s35Var.h;
                    s35Var2.i = s35Var.i;
                    s35Var2.j = s35Var.j;
                    s35Var2.k = s35Var.k;
                    s35Var2.l = s35Var.l;
                    s35Var2.m = s35Var.m;
                    s35Var2.n = s35Var.n;
                    r35Var = s35Var2;
                } else {
                    if (!(obj instanceof r35)) {
                        kf2.o("Unknown object in the tree!");
                        throw null;
                    }
                    r35Var = new r35((r35) obj);
                }
                this.b.add(r35Var);
                Object obj2 = r35Var.b;
                if (obj2 != null) {
                    oiVar.put(obj2, r35Var);
                }
            }
        }
    }

    @Override // defpackage.u35
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((u35) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.u35
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return zB;
            }
            zB |= ((u35) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
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

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            c();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            c();
        }
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
