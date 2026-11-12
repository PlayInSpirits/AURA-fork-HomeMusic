package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.common.internal.a;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dj1 {
    public final Context a;
    public final String b;
    public final rf2 c;
    public final le d;
    public final ve e;
    public final Looper f;
    public final int g;
    public final if5 h;
    public final pa i;
    public final ij1 j;

    public dj1(Context r5, HiddenActivity r6, rf2 r7, le r8, cj1 r9) {
        ji2.n(r5, "Null context is not permitted.");
        ji2.n(r7, "Api must not be null.");
        ji2.n(r9, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context r0 = r5.getApplicationContext();
        ji2.n(r0, "The provided context did not have an application context.");
        this.a = r0;
        if (Build.VERSION.SDK_INT < 30) goto L5;
        String r10 = l3.o(r5);
    L6:
        this.b = r10;
        this.c = r7;
        this.d = r8;
        this.f = r9.b;
        ve r1 = new ve(r7, r8, r10);
        this.e = r1;
        this.h = new if5(this);
        ij1 r11 = ij1.f(r0);
        this.j = r11;
        this.g = r11.u.getAndIncrement();
        this.i = r9.a;
        if (r6 != null) goto L9;
    L27:
        zw2 r12 = r11.A;
        r12.sendMessage(r12.obtainMessage(7, this));
        return;
    L9:
        if (Looper.myLooper() != Looper.getMainLooper()) goto L27;
        WeakHashMap r13 = ph5.q;
        WeakReference r14 = (WeakReference) r13.get(r6);
        if (r14 == null) goto L29;
        ph5 r15 = (ph5) r14.get();
        if (r15 == null) goto L29;
    L20:
        df5 r16 = (df5) r15.c();
        if (r16 != null) goto L23;
        Object r17 = ej1.b;
        r16 = new df5(r15, r11);
    L23:
        r16.s.add(r1);
        r11.a(r16);
    L29:
        r15 = (ph5) r6.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");     // Catch: ClassCastException -> L24
        if (r15 != null) goto L17;
    L18:
        r15 = new ph5();
        r6.getFragmentManager().beginTransaction().add(r15, "LifecycleFragmentImpl").commitAllowingStateLoss();
    L19:
        r13.put(r6, new WeakReference(r15));
        goto L20
    L17:
        if (r15.isRemoving() == false) goto L19;
    L24:
        e = move-exception;
        mj0.j("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        throw null;
    L5:
        r10 = null;
        goto L6
    }

    public final c12 a() {
        c12 r0 = new c12(3);
        Set r1 = Collections.EMPTY_SET;
        if (((qi) r0.o) != null) goto L5;
        r0.o = new qi(0);
    L5:
        ((qi) r0.o).addAll(r1);
        Context r4 = this.a;
        r0.q = r4.getClass().getName();
        r0.p = r4.getPackageName();
        return r0;
    }

    public final jw b(int r17, bk r18) {
        cr4 r2 = new cr4();
        jw r3 = r2.a;
        pa r4 = this.i;
        ij1 r6 = this.j;
        zw2 r13 = r6.A;
        int r7 = r18.o;
        if (r7 == 0) goto L33;
        ve r8 = this.e;
        if (r6.b() == false) goto L23;
        e34 r5 = (e34) d34.E().o;
        boolean r9 = true;
        if (r5 != null) goto L10;
    L24:
        long r10 = 0;
        if (r9 == false) goto L27;
        long r14 = System.currentTimeMillis();
    L28:
        if (r9 == false) goto L30;
        r10 = SystemClock.elapsedRealtime();
    L30:
        nf5 r11 = new nf5(r6, r7, r8, r14, r10);
    L31:
        if (r11 == null) goto L33;
        r13.getClass();
        ok r12 = new ok(r13, 3);
        r3.getClass();
        ((mf4) r3.p).i(new hk5(r12, r11));
        r3.v();
        goto L33
    L27:
        r14 = 0;
        goto L28
    L10:
        if (r5.o == false) goto L23;
        boolean r15 = r5.p;
        gf5 r16 = (gf5) r6.w.get(r8);
        if (r16 == null) goto L22;
        me r19 = r16.f;
        if ((r19 instanceof a) == false) goto L23;
        a r110 = (a) r19;
        if (r110.H == null) goto L22;
        if (r110.c0() == true) goto L22;
        pa0 r20 = nf5.b(r16, r110, r7);
        if (r20 == null) goto L23;
        r16.p++;
        r9 = r20.p;
    L22:
        r9 = r15;
    L23:
        r11 = null;
    L33:
        r13.sendMessage(r13.obtainMessage(4, new pf5(new xf5(r17, r18, r2, r4), r6.v.get(), this)));
        return r3;
    }
}
