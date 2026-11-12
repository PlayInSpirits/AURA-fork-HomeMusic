package defpackage;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zj4 {
    public static final xx0 n = new xx0();
    public static final xx0 o = new xx0();
    public static final xx0 p = new xx0();
    public static final xx0 q = new xx0();
    public static final xx0 r = new xx0();
    public static final xx0 s = new xx0();
    public float a;
    public float b;
    public boolean c;
    public final gp0 d;
    public final fp0 e;
    public boolean f;
    public long g;
    public final float h;
    public final ArrayList i;
    public final ArrayList j;
    public ak4 k;
    public float l;
    public boolean m;

    public zj4(gp0 gp0Var) {
        fp0 fp0Var = gp0.D;
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = 0L;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.d = gp0Var;
        this.e = fp0Var;
        if (fp0Var == p || fp0Var == q || fp0Var == r) {
            this.h = 0.1f;
        } else if (fp0Var == s || fp0Var == n || fp0Var == o) {
            this.h = 0.00390625f;
        } else {
            this.h = 1.0f;
        }
        this.k = null;
        this.l = Float.MAX_VALUE;
        this.m = false;
    }

    public final void a(float f) {
        this.e.getClass();
        gp0 gp0Var = this.d;
        gp0Var.B = f / 10000.0f;
        gp0Var.invalidateSelf();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.j;
            if (i >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i) != null) {
                arrayList.get(i).getClass();
                kf2.k();
                return;
            }
            i++;
        }
    }

    public final void b() {
        if (this.k.b <= 0.0d) {
            er1.l("Spring animations can only come to an end when there is damping");
        } else {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new AndroidRuntimeException("Animations may only be started on the main thread");
            }
            if (this.f) {
                this.m = true;
            }
        }
    }
}
