package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mo0 implements aa4 {
    public final CharSequence a;
    public final int b;
    public final wf1 c;

    public mo0(CharSequence r1, int r2, wf1 r3) {
        r1.getClass();
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    @Override // defpackage.aa4
    public final Iterator iterator() {
        return new lo0(this);
    }
}
