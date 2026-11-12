package defpackage;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.eddyizm.tempus.service.MediaService;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y10 {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public final Object d;
    public final Object e;
    public Object f;

    public y10(MediaService r3, Looper r4, vp4 r5, int r6) {
        this.a = r6;
        switch(r6) {
            case 4: goto L6;
            default: goto L4;
        };
    L4:
        int r1 = 22;
        this.d = new xc5(r1, r3.getApplicationContext());
        this.e = r5.a(r4, null);
        this.f = r5.a(Looper.getMainLooper(), null);
        return;
    L6:
        this.d = new rf2(r3.getApplicationContext());
        this.e = r5.a(r4, null);
        this.f = r5.a(Looper.getMainLooper(), null);
    }

    public IOException a(boolean r2, boolean r3, IOException r4) {
        bv3 r0 = (bv3) this.d;
        if (r4 == null) goto L6;
        l(r4);
    L6:
        return r0.f(this, r3, r2, r4);
    }

    public boolean b(Chip r6) {
        int r0 = r6.getId();
        HashSet r1 = (HashSet) this.e;
        if (r1.contains(Integer.valueOf(r0)) == false) goto L5;
        return false;
    L5:
        Chip r2 = (Chip) ((HashMap) this.d).get(Integer.valueOf(f()));
        if (r2 == null) goto L8;
        m(r2, false);
    L8:
        boolean r5 = r1.add(Integer.valueOf(r0));
        if (r6.isChecked() == true) goto L11;
        r6.setChecked(true);
    L11:
        return r5;
    }

    public o21 c(oz3 r3, boolean r4) {
        r3.getClass();
        this.b = r4;
        tz3 r5 = r3.d;
        r5.getClass();
        long r0 = r5.contentLength();
        return new o21(this, ((r21) this.f).e(r3, r0), r0);
    }

    public ArrayList d(ViewGroup r5) {
        HashSet r0 = new HashSet((HashSet) this.e);
        ArrayList r4 = new ArrayList();
        int r1 = 0;
    L4:
        if (r1 >= r5.getChildCount()) goto L11;
        View r2 = r5.getChildAt(r1);
        if ((r2 instanceof Chip) == false) goto L10;
        if (r0.contains(Integer.valueOf(r2.getId())) == false) goto L10;
        r4.add(Integer.valueOf(r2.getId()));
    L10:
        r1 = r1 + 1;
        goto L4
    L11:
        return r4;
    }

    public cv3 e() {
        q21 r2 = ((r21) this.f).h();
        if ((r2 instanceof cv3) == false) goto L5;
        cv3 r3 = (cv3) r2;
    L6:
        if (r3 == null) goto L8;
        return r3;
    L8:
        kf2.o("no connection for CONNECT tunnels");
        return null;
    L5:
        r3 = null;
        goto L6
    }

    public int f() {
        HashSet r0 = (HashSet) this.e;
        if (this.b == true) goto L5;
        return -1;
    L5:
        if (r0.isEmpty() == false) goto L7;
        return -1;
    L7:
        return ((Integer) r0.iterator().next()).intValue();
    }

    public void g() {
        zg5 r0 = (zg5) this.f;
        if (r0 == null) goto L11;
        new HashSet((HashSet) this.e);
        ChipGroup r2 = (ChipGroup) r0.n;
        n20 r1 = r2.t;
        if (r1 == null) goto L12;
        r2.u.d(r2);
        ChipGroup r3 = (ChipGroup) ((d34) r1).o;
        if (r3.u.b == false) goto L13;
        r3.getCheckedChipId();
        throw null;
    L13:
        return;
    L12:
        return;
    }

    public void h(boolean r10, boolean r11) {
        yp4 r0 = (yp4) this.e;
        int r1 = 0;
        if (r10 == false) goto L7;
        if (r11 == false) goto L7;
        r0.d(new v85(this, r10, r11, r1));
        return;
    L7:
        AtomicBoolean r5 = new AtomicBoolean(true);
        yp4 r2 = (yp4) this.f;
        w85 r3 = new w85(r1, this, r5);
        r2.a.postDelayed(r3, 1000);
        r0.d(new x85(this, r5, r10, r11, 0));
    }

    public void i(boolean r10, boolean r11) {
        yp4 r0 = (yp4) this.e;
        int r1 = 1;
        if (r10 == false) goto L7;
        if (r11 == false) goto L7;
        r0.d(new v85(this, r10, r11, r1));
        return;
    L7:
        AtomicBoolean r5 = new AtomicBoolean(true);
        yp4 r2 = (yp4) this.f;
        w85 r3 = new w85(3, this, r5);
        r2.a.postDelayed(r3, 1000);
        r0.d(new x85(this, r5, r10, r11, 1));
    }

    public j14 j(boolean r3) {
        j14 r4 = ((r21) this.f).f(r3);     // Catch: IOException -> L6
        if (r4 == null) goto L5;
        r4.m = this;     // Catch: IOException -> L6
        r4.n = new zf0(7, this);     // Catch: IOException -> L6
    L5:
        return r4;
    L6:
        e = move-exception;
        l(e);
        throw e;
    }

    public void k(boolean r2) {
        switch(this.a) {
            case 3: goto L12;
            default: goto L5;
        };
    L5:
        if (this.c == r2) goto L19;
        this.c = r2;
        if (this.b == false) goto L18;
        i(true, r2);
        return;
    L18:
        return;
    L19:
        return;
    L12:
        if (this.c == r2) goto L21;
        this.c = r2;
        if (this.b == false) goto L20;
        h(true, r2);
        return;
    L20:
        return;
    }

    public void l(IOException r2) {
        this.c = true;
        ((r21) this.f).h().b((bv3) this.d, r2);
    }

    public boolean m(Chip r4, boolean r5) {
        int r0 = r4.getId();
        HashSet r3 = (HashSet) this.e;
        if (r3.contains(Integer.valueOf(r0)) == true) goto L5;
        return false;
    L5:
        if (r5 == true) goto L7;
    L12:
        boolean r6 = r3.remove(Integer.valueOf(r0));
        if (r4.isChecked() == false) goto L15;
        r4.setChecked(false);
    L15:
        return r6;
    L7:
        if (r3.size() != 1) goto L12;
        if (r3.contains(Integer.valueOf(r0)) == false) goto L12;
        r4.setChecked(true);
        return false;
    }

    public y10() {
        this.a = 0;
        this.d = new HashMap();
        this.e = new HashSet();
    }

    public y10(bv3 r2, s21 r3, r21 r4) {
        this.a = 1;
        r3.getClass();
        this.d = r2;
        this.e = r3;
        this.f = r4;
    }

    public y10(Context r2, String r3, uv r4, boolean r5, boolean r6) {
        this.a = 2;
        r2.getClass();
        r4.getClass();
        this.d = r2;
        this.e = r3;
        this.f = r4;
        this.b = r5;
        this.c = r6;
    }
}
