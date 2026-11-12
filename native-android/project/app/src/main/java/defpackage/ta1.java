package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ta1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ta1(String r1, Context r2, Object r3, int r4, int r5) {
        this.a = r5;
        this.b = r1;
        this.c = r2;
        this.e = r3;
        this.d = r4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int r0 = this.a;
        int r1 = this.d;
        Object r2 = this.e;
        Context r3 = this.c;
        String r5 = this.b;
        switch(r0) {
            case 0: goto L8;
            default: goto L10;
        };
    L8:
        Object[] r4 = {(pa1) r2};
        ArrayList r6 = new ArrayList(1);
        Object r7 = r4[0];
        Objects.requireNonNull(r7);
        r6.add(r7);
        return wa1.b(r5, r3, Collections.unmodifiableList(r6), r1);
    L10:
        return wa1.b(r5, r3, (ArrayList) r2, r1);
    L7:
        return new va1(-3);
    }
}
