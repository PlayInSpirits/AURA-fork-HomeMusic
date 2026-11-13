/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.content.Context;
import com.eddyizm.tempus.homemusic.SmartOut;
import com.eddyizm.tempus.homemusic.a;
import java.util.ArrayList;
import java.util.List;

public final class ys1
implements Runnable {
    public final Context n;
    public final String o;
    public final ArrayList p;
    public final SmartOut q;
    public final List r;
    public final String s;
    public final int t;

    public ys1(Context context, String string, ArrayList arrayList, SmartOut smartOut, List list, String string2, int n16) {
        this.n = context;
        this.o = string;
        this.p = arrayList;
        this.q = smartOut;
        this.r = list;
        this.s = string2;
        this.t = n16;
    }

    @Override
    public final void run() {
        int n16 = this.t;
        a.k(this.n, this.o, this.p, this.q, this.r, this.s, n16 + 1);
    }
}

