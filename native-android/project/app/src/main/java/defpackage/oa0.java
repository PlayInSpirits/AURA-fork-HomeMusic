package defpackage;

import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oa0 {
    public static final String A = null;
    public static final String B = null;
    public static final String C = null;
    public static final String o = null;
    public static final String p = null;
    public static final String q = null;
    public static final String r = null;
    public static final String s = null;
    public static final String t = null;
    public static final String u = null;
    public static final String v = null;
    public static final String w = null;
    public static final String x = null;
    public static final String y = null;
    public static final String z = null;
    public final int a;
    public final int b;
    public final pu1 c;
    public final PendingIntent d;
    public final wa4 e;
    public final mi3 f;
    public final mi3 g;
    public final Bundle h;
    public final Bundle i;
    public final lk3 j;
    public final yw1 k;
    public final yw1 l;
    public final MediaSession.Token m;
    public final yw1 n;

    static {
        String r0 = f35.a;
        o = Integer.toString(0, 36);
        p = Integer.toString(1, 36);
        q = Integer.toString(2, 36);
        r = Integer.toString(9, 36);
        s = Integer.toString(14, 36);
        t = Integer.toString(13, 36);
        u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        w = Integer.toString(5, 36);
        x = Integer.toString(6, 36);
        y = Integer.toString(11, 36);
        z = Integer.toString(7, 36);
        A = Integer.toString(8, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(12, 36);
    }

    public oa0(int r1, int r2, pu1 r3, PendingIntent r4, yw1 r5, yw1 r6, yw1 r7, wa4 r8, mi3 r9, mi3 r10, Bundle r11, Bundle r12, lk3 r13, MediaSession.Token r14) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.k = r5;
        this.l = r6;
        this.n = r7;
        this.e = r8;
        this.f = r9;
        this.g = r10;
        this.h = r11;
        this.i = r12;
        this.j = r13;
        this.m = r14;
    }

    public static oa0 a(Bundle r18) {
        IBinder r1 = r18.getBinder(B);
        if ((r1 instanceof na0) == true) goto L5;
        int r2 = 0;
        int r4 = r18.getInt(o, 0);
        int r5 = r18.getInt(A, 0);
        IBinder r3 = r18.getBinder(p);
        r3.getClass();
        IBinder r6 = r3;
        PendingIntent r7 = (PendingIntent) r18.getParcelable(q);
        ArrayList r8 = r18.getParcelableArrayList(r);
        if (r8 == null) goto L14;
        uw1 r9 = yw1.j();
        int r10 = 0;
    L10:
        if (r10 >= r8.size()) goto L12;
        Bundle r11 = (Bundle) r8.get(r10);
        r11.getClass();
        r9.c(j60.i(r5, r11));
        r10 = r10 + 1;
        goto L10
    L12:
        gy3 r12 = r9.f();
    L13:
        gy3 r13 = r12;
        ArrayList r14 = r18.getParcelableArrayList(s);
        if (r14 == null) goto L23;
        uw1 r15 = yw1.j();
        int r16 = 0;
    L19:
        if (r16 >= r14.size()) goto L21;
        Bundle r17 = (Bundle) r14.get(r16);
        r17.getClass();
        r15.c(j60.i(r5, r17));
        r16 = r16 + 1;
        goto L19
    L21:
        gy3 r19 = r15.f();
    L22:
        gy3 r20 = r19;
        ArrayList r21 = r18.getParcelableArrayList(t);
        if (r21 == null) goto L32;
        uw1 r22 = yw1.j();
    L28:
        if (r2 >= r21.size()) goto L30;
        Bundle r110 = (Bundle) r21.get(r2);
        r110.getClass();
        r22.c(j60.i(r5, r110));
        r2 = r2 + 1;
        goto L28
    L30:
        gy3 r23 = r22.f();
    L31:
        gy3 r111 = r23;
        Bundle r24 = r18.getBundle(u);
        if (r24 != null) goto L37;
        wa4 r25 = wa4.b;
    L36:
        wa4 r112 = r25;
        Bundle r26 = r18.getBundle(w);
        if (r26 != null) goto L42;
        mi3 r27 = mi3.b;
    L41:
        mi3 r113 = r27;
        Bundle r28 = r18.getBundle(v);
        if (r28 != null) goto L47;
        mi3 r29 = mi3.b;
    L46:
        mi3 r114 = r29;
        Bundle r30 = f35.n(r18.getBundle(x));
        Bundle r31 = f35.n(r18.getBundle(y));
        Bundle r32 = r18.getBundle(z);
        if (r32 != null) goto L52;
        lk3 r33 = lk3.H;
    L51:
        lk3 r115 = r33;
        MediaSession.Token r116 = (MediaSession.Token) r18.getParcelable(C);
        Bundle r0 = r31;
        int r34 = kt2.k;
        IInterface r35 = r6.queryLocalInterface("androidx.media3.session.IMediaSession");
        if (r35 != null) goto L56;
    L58:
        nu1 r36 = new nu1();
        r36.e = r6;
        pu1 r37 = r36;
    L59:
        if (r30 != null) goto L61;
        r30 = Bundle.EMPTY;
    L61:
        Bundle r117 = r30;
        if (r0 != null) goto L65;
        r0 = Bundle.EMPTY;
    L65:
        return new oa0(r4, r5, r37, r7, r13, r20, r111, r112, r114, r113, r117, r0, r115, r116);
    L56:
        if ((r35 instanceof pu1) == false) goto L58;
        r37 = (pu1) r35;
        goto L59
    L52:
        r33 = lk3.r(r5, r32);
        goto L51
    L47:
        r29 = mi3.b(r28);
        goto L46
    L42:
        r27 = mi3.b(r26);
        goto L41
    L37:
        r25 = wa4.a(r24);
        goto L36
    L32:
        vw1 r38 = yw1.o;
        r23 = gy3.r;
        goto L31
    L23:
        vw1 r39 = yw1.o;
        r19 = gy3.r;
        goto L22
    L14:
        vw1 r40 = yw1.o;
        r12 = gy3.r;
        goto L13
    L5:
        return ((na0) r1).e;
    }

    public final Bundle b(int r9) {
        Bundle r0 = new Bundle();
        r0.putInt(o, this.a);
        r0.putBinder(p, this.c.asBinder());
        r0.putParcelable(q, this.d);
        yw1 r1 = this.k;
        boolean r2 = r1.isEmpty();
        String r4 = r;
        if (r2 == true) goto L8;
        ArrayList<? extends Parcelable> r3 = new ArrayList(r1.size());
        int r5 = r1.size();
        int r6 = 0;
    L5:
        if (r6 >= r5) goto L7;
        Object r7 = r1.get(r6);
        r6 = r6 + 1;
        r3.add(((j60) r7).o());
        goto L5
    L7:
        r0.putParcelableArrayList(r4, r3);
    L8:
        yw1 r8 = this.l;
        if (r8.isEmpty() == false) goto L11;
    L21:
        yw1 r10 = this.n;
        if (r10.isEmpty() == true) goto L27;
        ArrayList<? extends Parcelable> r11 = new ArrayList(r10.size());
        int r12 = r10.size();
        int r13 = 0;
    L24:
        if (r13 >= r12) goto L26;
        Object r14 = r10.get(r13);
        r13 = r13 + 1;
        r11.add(((j60) r14).o());
        goto L24
    L26:
        r0.putParcelableArrayList(t, r11);
    L27:
        wa4 r15 = this.e;
        r15.getClass();
        Bundle r16 = new Bundle();
        ArrayList<? extends Parcelable> r17 = new ArrayList();
        o15 r18 = r15.a.h();
    L29:
        if (r18.hasNext() == false) goto L31;
        r17.add(((va4) r18.next()).b());
        goto L29
    L31:
        r16.putParcelableArrayList(wa4.c, r17);
        r0.putBundle(u, r16);
        String r19 = v;
        mi3 r20 = this.f;
        r0.putBundle(r19, r20.c());
        String r21 = w;
        mi3 r22 = this.g;
        r0.putBundle(r21, r22.c());
        r0.putBundle(x, this.h);
        r0.putBundle(y, this.i);
        r0.putBundle(z, this.j.q(ju2.d(r20, r22), false, false).t(r9));
        r0.putInt(A, this.b);
        MediaSession.Token r23 = this.m;
        if (r23 == null) goto L34;
        r0.putParcelable(C, r23);
    L34:
        return r0;
    L11:
        if (r9 < 7) goto L16;
        ArrayList<? extends Parcelable> r24 = new ArrayList(r8.size());
        int r25 = r8.size();
        int r26 = 0;
    L13:
        if (r26 >= r25) goto L15;
        Object r27 = r8.get(r26);
        r26 = r26 + 1;
        r24.add(((j60) r27).o());
        goto L13
    L15:
        r0.putParcelableArrayList(s, r24);
        goto L21
    L16:
        gy3 r28 = j60.j(r8, true, true);
        ArrayList<? extends Parcelable> r29 = new ArrayList(r28.q);
        vw1 r30 = r28.m(0);
    L18:
        if (r30.hasNext() == false) goto L20;
        r29.add(((j60) r30.next()).o());
        goto L18
    L20:
        r0.putParcelableArrayList(r4, r29);
        goto L21
    }
}
