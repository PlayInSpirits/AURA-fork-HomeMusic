package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class lt4 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(lt4.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public j21[] a;

    public final void a(j21 j21Var) {
        j21Var.d((k21) this);
        j21[] j21VarArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (j21VarArr == null) {
            j21VarArr = new j21[4];
            this.a = j21VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= j21VarArr.length) {
            j21VarArr = (j21[]) Arrays.copyOf(j21VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.a = j21VarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        j21VarArr[i] = j21Var;
        j21Var.o = i;
        c(i);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[LOOP:0: B:9:0x003a->B:21:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x007a A[EDGE_INSN: B:24:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a A[EDGE_INSN: B:25:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    public final j21 b(int i) {
        int i2;
        int i3;
        Object[] objArr;
        int i4;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.a;
        objArr2.getClass();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            d(i, atomicIntegerFieldUpdater.get(this));
            int i5 = (i - 1) / 2;
            if (i > 0) {
                j21 j21Var = objArr2[i];
                j21Var.getClass();
                Object obj2 = objArr2[i5];
                obj2.getClass();
                if (j21Var.compareTo(obj2) < 0) {
                    d(i, i5);
                    c(i5);
                } else {
                    while (true) {
                        i2 = i * 2;
                        i3 = i2 + 1;
                        if (i3 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        objArr = this.a;
                        objArr.getClass();
                        i4 = i2 + 2;
                        if (i4 < atomicIntegerFieldUpdater.get(this)) {
                            comparable3 = objArr[i4];
                            comparable3.getClass();
                            obj = objArr[i3];
                            obj.getClass();
                            if (comparable3.compareTo(obj) >= 0) {
                                i4 = i3;
                            }
                        } else {
                            i4 = i3;
                        }
                        comparable = objArr[i];
                        comparable.getClass();
                        comparable2 = objArr[i4];
                        comparable2.getClass();
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        d(i, i4);
                        i = i4;
                    }
                }
            } else {
                while (true) {
                    i2 = i * 2;
                    i3 = i2 + 1;
                    if (i3 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                        break;
                    }
                    objArr = this.a;
                    objArr.getClass();
                    i4 = i2 + 2;
                    if (i4 < atomicIntegerFieldUpdater.get(this)) {
                        comparable3 = objArr[i4];
                        comparable3.getClass();
                        obj = objArr[i3];
                        obj.getClass();
                        if (comparable3.compareTo(obj) >= 0) {
                            i4 = i3;
                        }
                    } else {
                        i4 = i3;
                    }
                    comparable = objArr[i];
                    comparable.getClass();
                    comparable2 = objArr[i4];
                    comparable2.getClass();
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    d(i, i4);
                    i = i4;
                }
            }
        }
        j21 j21Var2 = objArr2[atomicIntegerFieldUpdater.get(this)];
        j21Var2.getClass();
        j21Var2.d(null);
        j21Var2.o = -1;
        objArr2[atomicIntegerFieldUpdater.get(this)] = null;
        return j21Var2;
    }

    public final void c(int i) {
        while (i > 0) {
            j21[] j21VarArr = this.a;
            j21VarArr.getClass();
            int i2 = (i - 1) / 2;
            j21 j21Var = j21VarArr[i2];
            j21Var.getClass();
            j21 j21Var2 = j21VarArr[i];
            j21Var2.getClass();
            if (j21Var.compareTo(j21Var2) <= 0) {
                return;
            }
            d(i, i2);
            i = i2;
        }
    }

    public final void d(int i, int i2) {
        j21[] j21VarArr = this.a;
        j21VarArr.getClass();
        j21 j21Var = j21VarArr[i2];
        j21Var.getClass();
        j21 j21Var2 = j21VarArr[i];
        j21Var2.getClass();
        j21VarArr[i] = j21Var;
        j21VarArr[i2] = j21Var2;
        j21Var.o = i;
        j21Var2.o = i2;
    }
}
