package defpackage;

import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z1 extends ku3 {
    @Override // defpackage.ku3
    public final int a(int i) {
        return b().nextInt(i);
    }

    public abstract Random b();
}
