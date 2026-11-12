package defpackage;

import android.graphics.Color;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nd3 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public float[] i;

    public nd3(int r2, int r3) {
        this.a = Color.red(r2);
        this.b = Color.green(r2);
        this.c = Color.blue(r2);
        this.d = r2;
        this.e = r3;
    }

    public final void a() {
        if (this.f == true) goto L23;
        int r2 = this.d;
        int r3 = v50.f(-1, 4.5f, r2);
        int r5 = v50.f(-1, 3.0f, r2);
        if (r3 == (-1)) goto L9;
        if (r5 == (-1)) goto L9;
        this.h = v50.i(-1, r3);
        this.g = v50.i(-1, r5);
        this.f = true;
        return;
    L9:
        int r1 = v50.f(-16777216, 4.5f, r2);
        int r4 = v50.f(-16777216, 3.0f, r2);
        if (r1 == (-1)) goto L14;
        if (r4 == (-1)) goto L14;
        this.h = v50.i(-16777216, r1);
        this.g = v50.i(-16777216, r4);
        this.f = true;
        return;
    L14:
        if (r3 == (-1)) goto L16;
        int r6 = v50.i(-1, r3);
    L17:
        this.h = r6;
        if (r5 == (-1)) goto L20;
        int r0 = v50.i(-1, r5);
    L21:
        this.g = r0;
        this.f = true;
        return;
    L20:
        r0 = v50.i(-16777216, r4);
        goto L21
    L16:
        r6 = v50.i(-16777216, r1);
        goto L17
    }

    public final float[] b() {
        if (this.i != null) goto L5;
        this.i = new float[3];
    L5:
        int r0 = this.c;
        float[] r1 = this.i;
        v50.a(this.a, this.b, r0, r1);
        return this.i;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L15:
        return false;
    L8:
        if (nd3.class != r5.getClass()) goto L15;
        nd3 r6 = (nd3) r5;
        if (this.e != r6.e) goto L15;
        if (this.d != r6.d) goto L15;
        return true;
    }

    public final int hashCode() {
        return (this.d * 31) + this.e;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder(nd3.class.getSimpleName());
        r0.append(" [RGB: #");
        r0.append(Integer.toHexString(this.d));
        r0.append("] [HSL: ");
        r0.append(Arrays.toString(b()));
        r0.append("] [Population: ");
        r0.append(this.e);
        r0.append("] [Title Text: #");
        a();
        r0.append(Integer.toHexString(this.g));
        r0.append("] [Body Text: #");
        a();
        r0.append(Integer.toHexString(this.h));
        r0.append(']');
        return r0.toString();
    }
}
