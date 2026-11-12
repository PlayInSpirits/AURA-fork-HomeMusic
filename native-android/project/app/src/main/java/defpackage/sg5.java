package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sg5 extends a {
    public final GoogleSignInOptions L;

    public sg5(Context r15, Looper r16, ml3 r17, GoogleSignInOptions r18, gf5 r19, gf5 r20) {
        super(r15, r16, 91, r17, r19, r20, 0);
        Set r110 = (Set) r17.b;
        if (r18 == null) goto L5;
        mj1 r2 = new mj1();
        r2.a = new HashSet();
        r2.h = new HashMap();
        r2.a = new HashSet(r18.o);
        r2.b = r18.r;
        r2.c = r18.s;
        r2.d = r18.q;
        r2.e = r18.t;
        r2.f = r18.p;
        r2.g = r18.u;
        r2.h = GoogleSignInOptions.c(r18.v);
        r2.i = r18.w;
    L6:
        r2.i = mg5.a();
        if (r110.isEmpty() == true) goto L12;
        Iterator r111 = r110.iterator();
    L10:
        if (r111.hasNext() == false) goto L12;
        Scope r0 = (Scope) r111.next();
        HashSet r4 = r2.a;
        r4.add(r0);
        r4.addAll(Arrays.asList(new Scope[0]));
    L12:
        HashSet r112 = r2.a;
        if (r112.contains(GoogleSignInOptions.A) == false) goto L18;
        Scope r1 = GoogleSignInOptions.z;
        if (r112.contains(r1) == false) goto L18;
        r112.remove(r1);
    L18:
        if (r2.d == true) goto L20;
    L24:
        this.L = new GoogleSignInOptions(3, new ArrayList(r112), r2.f, r2.d, r2.b, r2.c, r2.e, r2.g, r2.h, r2.i);
        return;
    L20:
        if (r2.f != null) goto L22;
    L23:
        r112.add(GoogleSignInOptions.y);
        goto L24
    L22:
        if (r112.isEmpty() == true) goto L24;
    L5:
        r2 = new mj1();
        r2.a = new HashSet();
        r2.h = new HashMap();
        goto L6
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface a(IBinder r3) {
        if (r3 != null) goto L5;
        return null;
    L5:
        IInterface r0 = r3.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if ((r0 instanceof bh5) == false) goto L10;
        return (bh5) r0;
    L10:
        return new bh5(r3, "com.google.android.gms.auth.api.signin.internal.ISignInService", 1);
    }

    @Override // com.google.android.gms.common.internal.a
    public final String f() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // defpackage.me
    public final int f0() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String g() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
