package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputResetException;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ip4 extends cx2 implements sn3, oo0, rn3 {
    public Object B;
    public Object C;
    public PointerInputEventHandler D;
    public sk4 E;
    public kn3 F = gp4.a;
    public final f13 G;
    public final f13 H;
    public final f13 I;
    public kn3 J;

    public ip4(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.B = obj;
        this.C = obj2;
        this.D = pointerInputEventHandler;
        f13 f13Var = new f13(new hp4[16]);
        this.G = f13Var;
        this.H = f13Var;
        this.I = new f13(new hp4[16]);
    }

    @Override // defpackage.oo0
    public final float J() {
        return j51.O(this).J.J();
    }

    @Override // defpackage.rn3
    public final void Z() {
        r0();
    }

    @Override // defpackage.eo0, defpackage.rn3
    public final void b() {
        r0();
    }

    @Override // defpackage.oo0
    public final float g() {
        return j51.O(this).J.g();
    }

    @Override // defpackage.cx2
    public final void j0() {
        r0();
    }

    @Override // defpackage.rn3
    public final void n(kn3 kn3Var, ln3 ln3Var, long j) {
        if (ln3Var == ln3.n) {
            this.F = kn3Var;
        }
        vd0 vd0Var = null;
        if (this.E == null) {
            this.E = fu.G(e0(), null, ze0.q, new ac0(this, vd0Var, 7), 1);
        }
        q0(kn3Var, ln3Var);
        List list = kn3Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!gi1.i((on3) list.get(i))) {
                this.J = kn3Var;
            }
        }
        kn3Var = null;
        this.J = kn3Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004c A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0020, B:17:0x0023, B:20:0x002f, B:22:0x0037, B:24:0x003b, B:25:0x0040, B:26:0x0043, B:28:0x004c, B:30:0x0054, B:32:0x0058), top: B:41:0x000d }] */
    public final void q0(kn3 kn3Var, ln3 ln3Var) {
        Object[] objArr;
        int i;
        int i2;
        hp4 hp4Var;
        cz czVar;
        cz czVar2;
        synchronized (this.H) {
            f13 f13Var = this.I;
            f13Var.c(f13Var.p, this.G);
        }
        try {
            int iOrdinal = ln3Var.ordinal();
            if (iOrdinal == 0) {
                f13 f13Var2 = this.I;
                objArr = f13Var2.n;
                i = f13Var2.p;
                for (i2 = 0; i2 < i; i2++) {
                    hp4Var = (hp4) objArr[i2];
                    if (ln3Var != hp4Var.q && (czVar = hp4Var.p) != null) {
                        hp4Var.p = null;
                        czVar.resumeWith(kn3Var);
                    }
                }
            } else if (iOrdinal == 1) {
                f13 f13Var3 = this.I;
                int i3 = f13Var3.p - 1;
                Object[] objArr2 = f13Var3.n;
                if (i3 < objArr2.length) {
                    while (i3 >= 0) {
                        hp4 hp4Var2 = (hp4) objArr2[i3];
                        if (ln3Var == hp4Var2.q && (czVar2 = hp4Var2.p) != null) {
                            hp4Var2.p = null;
                            czVar2.resumeWith(kn3Var);
                        }
                        i3--;
                    }
                }
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f13 f13Var4 = this.I;
                objArr = f13Var4.n;
                i = f13Var4.p;
                while (i2 < i) {
                    hp4Var = (hp4) objArr[i2];
                    if (ln3Var != hp4Var.q) {
                    }
                }
            }
            this.I.g();
        } catch (Throwable th) {
            this.I.g();
            throw th;
        }
    }

    public final void r0() {
        sk4 sk4Var = this.E;
        if (sk4Var != null) {
            sk4Var.p(new PointerInputResetException());
            this.E = null;
        }
    }

    @Override // defpackage.rn3
    public final void t() {
        kn3 kn3Var = this.J;
        if (kn3Var == null) {
            return;
        }
        List list = kn3Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((on3) list.get(i)).d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    on3 on3Var = (on3) list.get(i2);
                    long j = on3Var.a;
                    long j2 = on3Var.c;
                    long j3 = on3Var.b;
                    float f = on3Var.e;
                    boolean z = on3Var.d;
                    arrayList.add(new on3(j, j3, j2, false, f, j3, j2, z, z, on3Var.i, 0L, 1.0f, 0L));
                }
                kn3 kn3Var2 = new kn3(arrayList, null);
                this.F = kn3Var2;
                q0(kn3Var2, ln3.n);
                q0(kn3Var2, ln3.o);
                q0(kn3Var2, ln3.p);
                this.J = null;
                return;
            }
        }
    }
}
