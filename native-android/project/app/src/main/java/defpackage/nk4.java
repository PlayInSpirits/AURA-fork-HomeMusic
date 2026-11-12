package defpackage;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nk4 {
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int[] f;
    public final /* synthetic */ StaggeredGridLayoutManager g;

    public nk4(StaggeredGridLayoutManager r1) {
        this.g = r1;
        a();
    }

    public final void a() {
        this.a = -1;
        this.b = Integer.MIN_VALUE;
        this.c = false;
        this.d = false;
        this.e = false;
        int[] r2 = this.f;
        if (r2 == null) goto L6;
        Arrays.fill(r2, -1);
        return;
    }
}
