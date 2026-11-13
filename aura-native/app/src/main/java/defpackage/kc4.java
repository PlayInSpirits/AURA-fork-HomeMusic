package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class kc4 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public kc4() {
        d(0.0f, 0.0f, 270.0f, 0.0f);
    }

    public final void a(float f) {
        float f2 = this.e;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.c;
        float f5 = this.d;
        gc4 gc4Var = new gc4(f4, f5, f4, f5);
        gc4Var.f = this.e;
        gc4Var.g = f3;
        this.h.add(new ec4(gc4Var));
        this.e = f;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ic4) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f, float f2) {
        hc4 hc4Var = new hc4();
        hc4Var.b = f;
        hc4Var.c = f2;
        this.g.add(hc4Var);
        fc4 fc4Var = new fc4(hc4Var, this.c, this.d);
        float b = fc4Var.b() + 270.0f;
        float b2 = fc4Var.b() + 270.0f;
        a(b);
        this.h.add(fc4Var);
        this.e = b2;
        this.c = f;
        this.d = f2;
    }

    public final void d(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = (f3 + f4) % 360.0f;
        this.g.clear();
        this.h.clear();
    }
}
