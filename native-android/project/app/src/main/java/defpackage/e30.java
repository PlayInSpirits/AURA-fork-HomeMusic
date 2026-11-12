package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e30 {
    public final RectF a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int[] i;
    public int j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public Path o;
    public float p;
    public float q;
    public int r;
    public int s;
    public int t;
    public int u;

    public e30() {
        this.a = new RectF();
        Paint r0 = new Paint();
        this.b = r0;
        Paint r1 = new Paint();
        this.c = r1;
        Paint r2 = new Paint();
        this.d = r2;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 5.0f;
        this.p = 1.0f;
        this.t = 255;
        r0.setStrokeCap(Paint.Cap.SQUARE);
        r0.setAntiAlias(true);
        r0.setStyle(Paint.Style.STROKE);
        r1.setStyle(Paint.Style.FILL);
        r1.setAntiAlias(true);
        r2.setColor(0);
    }

    public final void a(int r2) {
        this.j = r2;
        this.u = this.i[r2];
    }
}
