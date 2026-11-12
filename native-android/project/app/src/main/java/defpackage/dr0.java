package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dr0 {
    public final String a;
    public final long[] b;
    public final ArrayList c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public ll g;
    public int h;
    public long i;
    public final /* synthetic */ jr0 j;

    public dr0(jr0 jr0Var, String str) {
        str.getClass();
        this.j = jr0Var;
        this.a = str;
        jr0Var.getClass();
        this.b = new long[2];
        this.c = new ArrayList();
        this.d = new ArrayList();
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.c.add(this.j.n.d(sb.toString()));
            sb.append(".tmp");
            this.d.add(this.j.n.d(sb.toString()));
            sb.setLength(length);
        }
    }

    public final fr0 a() {
        tl1 tl1Var = ze5.a;
        if (!this.e) {
            return null;
        }
        jr0 jr0Var = this.j;
        if (!jr0Var.y && (this.g != null || this.f)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long[] jArr = (long[]) this.b.clone();
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                ej4 ej4VarK = jr0Var.o.k((ge3) this.c.get(i2));
                if (!jr0Var.y) {
                    this.h++;
                    ej4VarK = new cr0(ej4VarK, jr0Var, this);
                }
                arrayList.add(ej4VarK);
            } catch (FileNotFoundException unused) {
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    xe5.b((ej4) obj);
                }
                try {
                    jr0Var.K(this);
                    return null;
                } catch (IOException unused2) {
                    return null;
                }
            }
        }
        return new fr0(this.j, this.a, this.i, arrayList, jArr);
    }
}
