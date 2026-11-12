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
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
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
        String str = f35.a;
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

    public oa0(int i, int i2, pu1 pu1Var, PendingIntent pendingIntent, yw1 yw1Var, yw1 yw1Var2, yw1 yw1Var3, wa4 wa4Var, mi3 mi3Var, mi3 mi3Var2, Bundle bundle, Bundle bundle2, lk3 lk3Var, MediaSession.Token token) {
        this.a = i;
        this.b = i2;
        this.c = pu1Var;
        this.d = pendingIntent;
        this.k = yw1Var;
        this.l = yw1Var2;
        this.n = yw1Var3;
        this.e = wa4Var;
        this.f = mi3Var;
        this.g = mi3Var2;
        this.h = bundle;
        this.i = bundle2;
        this.j = lk3Var;
        this.m = token;
    }

    public static oa0 a(Bundle bundle) {
        gy3 gy3VarF;
        gy3 gy3VarF2;
        gy3 gy3VarF3;
        pu1 pu1Var;
        pu1 pu1Var2;
        IBinder binder = bundle.getBinder(B);
        if (binder instanceof na0) {
            return ((na0) binder).e;
        }
        int i = bundle.getInt(o, 0);
        int i2 = bundle.getInt(A, 0);
        IBinder binder2 = bundle.getBinder(p);
        binder2.getClass();
        IBinder iBinder = binder2;
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(q);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(r);
        if (parcelableArrayList != null) {
            uw1 uw1VarJ = yw1.j();
            for (int i3 = 0; i3 < parcelableArrayList.size(); i3++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i3);
                bundle2.getClass();
                uw1VarJ.c(j60.i(i2, bundle2));
            }
            gy3VarF = uw1VarJ.f();
        } else {
            vw1 vw1Var = yw1.o;
            gy3VarF = gy3.r;
        }
        gy3 gy3Var = gy3VarF;
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(s);
        if (parcelableArrayList2 != null) {
            uw1 uw1VarJ2 = yw1.j();
            for (int i4 = 0; i4 < parcelableArrayList2.size(); i4++) {
                Bundle bundle3 = (Bundle) parcelableArrayList2.get(i4);
                bundle3.getClass();
                uw1VarJ2.c(j60.i(i2, bundle3));
            }
            gy3VarF2 = uw1VarJ2.f();
        } else {
            vw1 vw1Var2 = yw1.o;
            gy3VarF2 = gy3.r;
        }
        gy3 gy3Var2 = gy3VarF2;
        ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(t);
        if (parcelableArrayList3 != null) {
            uw1 uw1VarJ3 = yw1.j();
            for (int i5 = 0; i5 < parcelableArrayList3.size(); i5++) {
                Bundle bundle4 = (Bundle) parcelableArrayList3.get(i5);
                bundle4.getClass();
                uw1VarJ3.c(j60.i(i2, bundle4));
            }
            gy3VarF3 = uw1VarJ3.f();
        } else {
            vw1 vw1Var3 = yw1.o;
            gy3VarF3 = gy3.r;
        }
        gy3 gy3Var3 = gy3VarF3;
        Bundle bundle5 = bundle.getBundle(u);
        wa4 wa4VarA = bundle5 == null ? wa4.b : wa4.a(bundle5);
        Bundle bundle6 = bundle.getBundle(w);
        mi3 mi3VarB = bundle6 == null ? mi3.b : mi3.b(bundle6);
        Bundle bundle7 = bundle.getBundle(v);
        mi3 mi3VarB2 = bundle7 == null ? mi3.b : mi3.b(bundle7);
        Bundle bundleN = f35.n(bundle.getBundle(x));
        Bundle bundleN2 = f35.n(bundle.getBundle(y));
        Bundle bundle8 = bundle.getBundle(z);
        lk3 lk3VarR = bundle8 == null ? lk3.H : lk3.r(i2, bundle8);
        MediaSession.Token token = (MediaSession.Token) bundle.getParcelable(C);
        Bundle bundle9 = bundleN2;
        int i6 = kt2.k;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof pu1)) {
            nu1 nu1Var = new nu1();
            nu1Var.e = iBinder;
            pu1Var = nu1Var;
        } else {
            pu1Var2 = (pu1) iInterfaceQueryLocalInterface;
        }
        if (bundleN == null) {
            pu1Var = pu1Var2;
            bundleN = Bundle.EMPTY;
        }
        pu1Var = pu1Var2;
        Bundle bundle10 = bundleN;
        if (bundle9 == null) {
            bundle9 = Bundle.EMPTY;
        }
        return new oa0(i, i2, pu1Var, pendingIntent, gy3Var, gy3Var2, gy3Var3, wa4VarA, mi3VarB2, mi3VarB, bundle10, bundle9, lk3VarR, token);
    }

    public final Bundle b(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(o, this.a);
        bundle.putBinder(p, this.c.asBinder());
        bundle.putParcelable(q, this.d);
        yw1 yw1Var = this.k;
        boolean zIsEmpty = yw1Var.isEmpty();
        String str = r;
        if (!zIsEmpty) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(yw1Var.size());
            int size = yw1Var.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = yw1Var.get(i2);
                i2++;
                arrayList.add(((j60) obj).o());
            }
            bundle.putParcelableArrayList(str, arrayList);
        }
        yw1 yw1Var2 = this.l;
        if (!yw1Var2.isEmpty()) {
            if (i >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(yw1Var2.size());
                int size2 = yw1Var2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = yw1Var2.get(i3);
                    i3++;
                    arrayList2.add(((j60) obj2).o());
                }
                bundle.putParcelableArrayList(s, arrayList2);
            } else {
                gy3 gy3VarJ = j60.j(yw1Var2, true, true);
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>(gy3VarJ.q);
                vw1 vw1VarListIterator = gy3VarJ.listIterator(0);
                while (vw1VarListIterator.hasNext()) {
                    arrayList3.add(((j60) vw1VarListIterator.next()).o());
                }
                bundle.putParcelableArrayList(str, arrayList3);
            }
        }
        yw1 yw1Var3 = this.n;
        if (!yw1Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(yw1Var3.size());
            int size3 = yw1Var3.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj3 = yw1Var3.get(i4);
                i4++;
                arrayList4.add(((j60) obj3).o());
            }
            bundle.putParcelableArrayList(t, arrayList4);
        }
        wa4 wa4Var = this.e;
        wa4Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        o15 it = wa4Var.a.iterator();
        while (it.hasNext()) {
            arrayList5.add(((va4) it.next()).b());
        }
        bundle2.putParcelableArrayList(wa4.c, arrayList5);
        bundle.putBundle(u, bundle2);
        String str2 = v;
        mi3 mi3Var = this.f;
        bundle.putBundle(str2, mi3Var.c());
        String str3 = w;
        mi3 mi3Var2 = this.g;
        bundle.putBundle(str3, mi3Var2.c());
        bundle.putBundle(x, this.h);
        bundle.putBundle(y, this.i);
        bundle.putBundle(z, this.j.q(ju2.d(mi3Var, mi3Var2), false, false).t(i));
        bundle.putInt(A, this.b);
        MediaSession.Token token = this.m;
        if (token != null) {
            bundle.putParcelable(C, token);
        }
        return bundle;
    }
}
