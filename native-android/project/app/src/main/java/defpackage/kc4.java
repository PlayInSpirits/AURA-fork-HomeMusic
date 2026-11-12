package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kc4 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public final ArrayList g;
    public final ArrayList h;

    public kc4() {
        this.g = new ArrayList();
        this.h = new ArrayList();
        d(0.0f, 0.0f, 270.0f, 0.0f);
    }

    public final void a(float r5) {
        float r0 = this.e;
        if (r0 == r5) goto L10;
        float r1 = ((r5 - r0) + 360.0f) % 360.0f;
        if (r1 <= 180.0f) goto L8;
        return;
    L8:
        float r2 = this.c;
        float r3 = this.d;
        gc4 r4 = new gc4(r2, r3, r2, r3);
        r4.f = this.e;
        r4.g = r1;
        ec4 r6 = new ec4(r4);
        this.h.add(r6);
        this.e = r5;
        return;
    }

    public final void b(Matrix r4, Path r5) {
        ArrayList r3 = this.g;
        int r0 = r3.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        ((ic4) r3.get(r1)).a(r4, r5);
        r1 = r1 + 1;
        goto L3
    }

    public final void c(float r5, float r6) {
        hc4 r0 = new hc4();
        r0.b = r5;
        r0.c = r6;
        this.g.add(r0);
        fc4 r1 = new fc4(r0, this.c, this.d);
        float r2 = r1.b() + 270.0f;
        float r3 = r1.b() + 270.0f;
        a(r2);
        this.h.add(r1);
        this.e = r3;
        this.c = r5;
        this.d = r6;
    }

    public final void d(float r1, float r2, float r3, float r4) {
        this.a = r1;
        this.b = r2;
        this.c = r1;
        this.d = r2;
        this.e = r3;
        this.f = (r3 + r4) % 360.0f;
        this.g.clear();
        this.h.clear();
    }
}
