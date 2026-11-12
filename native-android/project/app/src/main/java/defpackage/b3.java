package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b3 {
    public Object a;
    public Object b;

    public b3(String r1, Bundle r2) {
        r2.getClass();
        this.a = r1;
        this.b = r2;
    }

    public void c() {
        v9 r0 = (v9) this.a;
        if (r0 == null) goto L10;
        ((bg) this.b).x.unregisterReceiver(r0);     // Catch: IllegalArgumentException -> L7
    L5:
        this.a = null;
        return;
    }

    public void d() {
        pj4 r0 = (pj4) this.a;
        gz r2 = (gz) this.b;
        LinkedHashSet r1 = r0.e;
        if (r1.remove(r2) == true) goto L5;
        return;
    L5:
        if (r1.isEmpty() == false) goto L9;
        r0.b();
        return;
    }

    public abstract IntentFilter e();

    public abstract int[] f(int r1);

    public abstract int g();

    public MenuItem h(MenuItem r3) {
        if ((r3 instanceof oo4) == false) goto L11;
        oo4 r4 = (oo4) r3;
        if (((yd4) this.b) != null) goto L7;
        this.b = new yd4(0);
    L7:
        MenuItem r0 = (MenuItem) ((yd4) this.b).get(r4);
        if (r0 != null) goto L12;
        xu2 r1 = new xu2((Context) this.a, r4);
        ((yd4) this.b).put(r4, r1);
        return r1;
    L12:
        return r0;
    L11:
        return r3;
    }

    public int[] i(int r2, int r3) {
        if (r2 < 0) goto L8;
        if (r3 < 0) goto L10;
        if (r2 == r3) goto L11;
        int[] r1 = (int[]) this.b;
        r1[0] = r2;
        r1[1] = r3;
        return r1;
    L11:
        return null;
    L10:
        return null;
    L8:
        return null;
    }

    public String j() {
        String r0 = (String) this.a;
        if (r0 == null) goto L5;
        return r0;
    L5:
        h12.Q("text");
        throw null;
    }

    public boolean k() {
        pj4 r5 = (pj4) this.a;
        View r0 = r5.c.T;
        r0.getClass();
        int r4 = 4;
        if (r0.getAlpha() == 0.0f) goto L5;
    L7:
        int r1 = r0.getVisibility();
        if (r1 == 0) goto L15;
        if (r1 != 4) goto L11;
    L16:
        int r6 = r5.a;
        if (r4 == r6) goto L22;
        if (r4 == 2) goto L21;
        if (r6 == 2) goto L21;
        return true;
    L21:
        return false;
    L22:
        return true;
    L11:
        if (r1 != 8) goto L13;
        r4 = 3;
        goto L16
    L13:
        kf2.n(f34.f(r1, "Unknown visibility "));
        return false;
    L15:
        r4 = 2;
        goto L16
    L5:
        if (r0.getVisibility() != 0) goto L7;
        goto L7
    }

    public abstract void l();

    public abstract int[] m(int r1);

    public void n() {
        c();
        IntentFilter r0 = e();
        if (r0.countActions() != 0) goto L6;
        return;
    L6:
        if (((v9) this.a) != null) goto L8;
        this.a = new v9(1, this);
    L8:
        ((bg) this.b).x.registerReceiver((v9) this.a, r0);
    }

    public b3(Context r1) {
        this.a = r1;
    }

    public b3() {
        this.b = new int[2];
    }

    public b3(pj4 r1, gz r2) {
        this.a = r1;
        this.b = r2;
    }

    public b3(bg r1) {
        this.b = r1;
    }
}
