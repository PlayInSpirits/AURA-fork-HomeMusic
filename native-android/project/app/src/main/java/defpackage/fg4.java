package defpackage;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class fg4 {
    public static final n7 h = null;
    public static final n7 i = null;
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final Object f;
    public final Object g;

    static {
        h = new n7(20);
        i = new n7(21);
    }

    public fg4(int r2) {
        this.a = 1;
        this.b = r2;
        if (r2 <= 0) goto L6;
        this.f = new si1(5);
        this.g = new tv1();
        return;
    L6:
        kf2.n("maxSize <= 0");
        throw null;
    }

    public void a(int r6, float r7) {
        eg4[] r0 = (eg4[]) this.g;
        ArrayList r1 = (ArrayList) this.f;
        if (this.b == 1) goto L5;
        Collections.sort(r1, h);
        this.b = 1;
    L5:
        int r2 = this.e;
        if (r2 <= 0) goto L8;
        int r3 = r2 - 1;
        this.e = r3;
        eg4 r4 = r0[r3];
    L9:
        int r5 = this.c;
        this.c = r5 + 1;
        r4.a = r5;
        r4.b = r6;
        r4.c = r7;
        r1.add(r4);
        this.d += r6;
    L10:
        int r8 = this.d;
        if (r8 <= 2000) goto L18;
        int r9 = r8 - 2000;
        eg4 r10 = (eg4) r1.get(0);
        int r11 = r10.b;
        if (r11 <= r9) goto L14;
        r10.b = r11 - r9;
        this.d -= r9;
        goto L10
    L14:
        this.d -= r11;
        r1.remove(0);
        int r12 = this.e;
        if (r12 >= 5) goto L10;
        this.e = r12 + 1;
        r0[r12] = r10;
        goto L10
    L18:
        return;
    L8:
        r4 = new eg4();
        goto L9
    }

    public void b() {
        ArrayList r0 = (ArrayList) this.f;
        View r1 = (View) r0.get(r0.size() - 1);
        ok4 r2 = (ok4) r1.getLayoutParams();
        this.c = ((StaggeredGridLayoutManager) this.g).r.d(r1);
        r2.getClass();
    }

    public void c() {
        ((ArrayList) this.f).clear();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public int d() {
        boolean r0 = ((StaggeredGridLayoutManager) this.g).w;
        ArrayList r1 = (ArrayList) this.f;
        if (r0 == false) goto L7;
        return f(r1.size() - 1, -1);
    L7:
        return f(0, r1.size());
    }

    public int e() {
        boolean r0 = ((StaggeredGridLayoutManager) this.g).w;
        ArrayList r1 = (ArrayList) this.f;
        if (r0 == false) goto L7;
        return f(0, r1.size());
    L7:
        return f(r1.size() - 1, -1);
    }

    public int f(int r12, int r13) {
        StaggeredGridLayoutManager r0 = (StaggeredGridLayoutManager) this.g;
        int r1 = r0.r.m();
        int r2 = r0.r.i();
        if (r13 <= r12) goto L5;
        int r5 = 1;
    L6:
        if (r12 == r13) goto L20;
        View r6 = (View) ((ArrayList) this.f).get(r12);
        int r7 = r0.r.g(r6);
        int r8 = r0.r.d(r6);
        boolean r9 = false;
        if (r7 > r2) goto L10;
        boolean r10 = true;
    L11:
        if (r8 < r1) goto L13;
        r9 = true;
    L13:
        if (r10 == false) goto L19;
        if (r9 == false) goto L19;
        if (r7 < r1) goto L18;
        if (r8 <= r2) goto L19;
    L18:
        return mw3.I(r6);
    L19:
        r12 = r12 + r5;
        goto L6
    L10:
        r10 = false;
        goto L11
    L20:
        return -1;
    L5:
        r5 = -1;
        goto L6
    }

    public Object g(Object r3) {
        tv1 r0 = (tv1) this.g;
        monitor-enter(r0);
        si1 r1 = (si1) this.f;     // Catch: Throwable -> L9
        r1.getClass();     // Catch: Throwable -> L9
        Object r4 = ((LinkedHashMap) r1.o).get(r3);     // Catch: Throwable -> L9
        if (r4 == null) goto L11;
        this.d++;     // Catch: Throwable -> L9
        monitor-exit(r0);
        return r4;
    L11:
        this.e++;     // Catch: Throwable -> L9
        monitor-exit(r0);
        return null;
    L9:
        th = move-exception;
        throw th;
    }

    public int h(int r3) {
        int r0 = this.c;
        if (r0 == Integer.MIN_VALUE) goto L6;
        return r0;
    L6:
        if (((ArrayList) this.f).size() != 0) goto L8;
        return r3;
    L8:
        b();
        return this.c;
    }

    public View i(int r6, int r7) {
        StaggeredGridLayoutManager r0 = (StaggeredGridLayoutManager) this.g;
        ArrayList r5 = (ArrayList) this.f;
        View r1 = null;
        if (r7 != (-1)) goto L19;
        int r8 = r5.size();
        int r2 = 0;
    L5:
        if (r2 >= r8) goto L18;
        View r3 = (View) r5.get(r2);
        if (r0.w == false) goto L11;
        if (mw3.I(r3) <= r6) goto L18;
    L11:
        if (r0.w == true) goto L16;
        if (mw3.I(r3) >= r6) goto L18;
    L16:
        if (r3.hasFocusable() == false) goto L18;
        r2 = r2 + 1;
        r1 = r3;
    L18:
        return r1;
    L19:
        int r9 = r5.size() - 1;
    L20:
        if (r9 < 0) goto L33;
        View r4 = (View) r5.get(r9);
        if (r0.w == false) goto L26;
        if (mw3.I(r4) >= r6) goto L33;
    L26:
        if (r0.w == true) goto L31;
        if (mw3.I(r4) <= r6) goto L33;
    L31:
        if (r4.hasFocusable() == false) goto L33;
        r9 = r9 - 1;
        r1 = r4;
    L33:
        return r1;
    }

    public float j() {
        ArrayList r0 = (ArrayList) this.f;
        int r2 = 0;
        if (this.b == 0) goto L5;
        Collections.sort(r0, i);
        this.b = 0;
    L5:
        float r1 = 0.5f * this.d;
        int r5 = 0;
    L7:
        if (r2 >= r0.size()) goto L14;
        eg4 r3 = (eg4) r0.get(r2);
        r5 = r5 + r3.b;
        if (r5 >= r1) goto L11;
        r2 = r2 + 1;
        goto L7
    L11:
        return r3.c;
    L14:
        if (r0.isEmpty() == false) goto L18;
        return Float.NaN;
    L18:
        return ((eg4) r0.get(r0.size() - 1)).c;
    }

    public int k(int r4) {
        ArrayList r0 = (ArrayList) this.f;
        int r1 = this.b;
        if (r1 == Integer.MIN_VALUE) goto L6;
        return r1;
    L6:
        if (r0.size() != 0) goto L8;
        return r4;
    L8:
        View r5 = (View) r0.get(0);
        ok4 r2 = (ok4) r5.getLayoutParams();
        this.b = ((StaggeredGridLayoutManager) this.g).r.g(r5);
        r2.getClass();
        return this.b;
    }

    public Object l(Object r5, Object r6) {
        r5.getClass();
        tv1 r0 = (tv1) this.g;
        monitor-enter(r0);
        this.c++;     // Catch: Throwable -> L8
        si1 r1 = (si1) this.f;     // Catch: Throwable -> L8
        r1.getClass();     // Catch: Throwable -> L8
        Object r7 = ((LinkedHashMap) r1.o).put(r5, r6);     // Catch: Throwable -> L8
        if (r7 == null) goto L10;
        this.c--;     // Catch: Throwable -> L8
    L10:
        monitor-exit(r0);
        int r8 = this.b;
    L12:
        tv1 r2 = (tv1) this.g;
        monitor-enter(r2);
    L21:
        th = move-exception;
        throw th;
    L15:
        if (this.c < 0) goto L48;
        if (((LinkedHashMap) ((si1) this.f).o).isEmpty() == false) goto L24;
        if (this.c != 0) goto L48;
    L24:
        if (this.c <= r8) goto L45;
        if (((LinkedHashMap) ((si1) this.f).o).isEmpty() == true) goto L45;
        Set r3 = ((LinkedHashMap) ((si1) this.f).o).entrySet();     // Catch: Throwable -> L21
        r3.getClass();     // Catch: Throwable -> L21
        Set r4 = r3;     // Catch: Throwable -> L21
        Object r9 = null;
        if ((r4 instanceof List) == false) goto L34;
        List r10 = (List) r4;     // Catch: Throwable -> L21
        if (r10.isEmpty() == true) goto L38;
        r9 = r10.get(0);     // Catch: Throwable -> L21
    L38:
        Map.Entry r11 = (Map.Entry) r9;     // Catch: Throwable -> L21
        if (r11 == null) goto L40;
        Object r12 = r11.getKey();     // Catch: Throwable -> L21
        Object r13 = r11.getValue();     // Catch: Throwable -> L21
        si1 r14 = (si1) this.f;     // Catch: Throwable -> L21
        r14.getClass();     // Catch: Throwable -> L21
        r12.getClass();     // Catch: Throwable -> L21
        ((LinkedHashMap) r14.o).remove(r12);     // Catch: Throwable -> L21
        int r15 = this.c;     // Catch: Throwable -> L21
        r13.getClass();     // Catch: Throwable -> L21
        this.c = r15 - 1;     // Catch: Throwable -> L21
        monitor-exit(r2);
        goto L12
    L40:
        monitor-exit(r2);
        return r7;
    L34:
        Iterator r16 = r4.iterator();     // Catch: Throwable -> L21
        if (r16.hasNext() == false) goto L38;
        r9 = r16.next();     // Catch: Throwable -> L21
    L45:
        monitor-exit(r2);
        return r7;
    L48:
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");     // Catch: Throwable -> L21
    L8:
        th = move-exception;
        throw th;
    }

    public String toString() {
        switch(this.a) {
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        tv1 r1 = (tv1) this.g;
        monitor-enter(r1);
        int r2 = this.d;     // Catch: Throwable -> L11
        int r3 = this.e + r2;     // Catch: Throwable -> L11
        if (r3 == 0) goto L13;
        int r4 = (r2 * 100) / r3;     // Catch: Throwable -> L11
    L14:
        String r5 = "LruCache[maxSize=" + this.b + ",hits=" + this.d + ",misses=" + this.e + ",hitRate=" + r4 + "%]";     // Catch: Throwable -> L11
        monitor-exit(r1);
        return r5;
    L13:
        r4 = 0;
    L11:
        th = move-exception;
        throw th;
    L5:
        return super.toString();
    }

    public fg4() {
        this.a = 0;
        this.g = new eg4[5];
        this.f = new ArrayList();
        this.b = -1;
    }

    public fg4(int r2, il r3, int r4, int r5, int r6, String r7) {
        this.a = 2;
        this.b = r2;
        this.f = r3;
        this.c = r4;
        this.d = r5;
        this.e = r6;
        this.g = r7;
    }

    public fg4(StaggeredGridLayoutManager r2, int r3) {
        this.a = 3;
        this.g = r2;
        this.f = new ArrayList();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
        this.e = r3;
    }
}
