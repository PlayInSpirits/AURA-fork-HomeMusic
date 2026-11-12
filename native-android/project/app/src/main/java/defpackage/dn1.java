package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dn1 {
    public final String a;
    public final List b;
    public final boolean c;

    public dn1(String r1, List r2, boolean r3) {
        this.a = r1;
        this.b = Collections.unmodifiableList(r2);
        this.c = r3;
    }

    public abstract Object a(List r1);
}
