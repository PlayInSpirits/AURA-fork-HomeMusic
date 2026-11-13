package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class mc5 {
    public static final String i = cx.i("WorkContinuationImpl");
    public final sc5 a;
    public final String b;
    public final int c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f = new ArrayList();
    public boolean g;
    public rv2 h;

    public mc5(sc5 sc5Var, String str, int i2, List list, int i3) {
        this.a = sc5Var;
        this.b = str;
        this.c = i2;
        this.d = list;
        this.e = new ArrayList(list.size());
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (i2 == 1 && ((bd5) list.get(i4)).b.u != Long.MAX_VALUE) {
                kf2.n("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
                throw null;
            }
            String uuid = ((bd5) list.get(i4)).a.toString();
            uuid.getClass();
            this.e.add(uuid);
            this.f.add(uuid);
        }
    }

    public static HashSet b(mc5 mc5Var) {
        HashSet hashSet = new HashSet();
        mc5Var.getClass();
        return hashSet;
    }

    public final rv2 a() {
        String str;
        if (this.g) {
            cx.f().k(i, "Already enqueued work ids (" + TextUtils.join(", ", this.e) + ")");
        } else {
            sc5 sc5Var = this.a;
            i80 i80Var = sc5Var.b.m;
            int i2 = 3;
            int i3 = this.c;
            if (i3 == 1) {
                str = "REPLACE";
            } else if (i3 == 2) {
                str = "KEEP";
            } else if (i3 == 3) {
                str = "APPEND";
            } else {
                if (i3 != 4) {
                    throw null;
                }
                str = "APPEND_OR_REPLACE";
            }
            this.h = h12.D(i80Var, "EnqueueRunnable_".concat(str), (ia4) sc5Var.d.n, new e25(i2, this));
        }
        return this.h;
    }
}
