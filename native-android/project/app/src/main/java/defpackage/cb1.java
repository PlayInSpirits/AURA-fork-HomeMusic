package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cb1 {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile mj4 b = new mj4(0);
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.d(115, new db1(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.d(130, new db1(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.d(150, new db1(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.d(180, new db1(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.d(200, new db1(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((b.c(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        ez1.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static bb1 a(float f) {
        float fC;
        bb1 db1Var;
        float[] fArr = a;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        bb1 bb1Var = (bb1) b.b(i);
        if (bb1Var != null) {
            return bb1Var;
        }
        mj4 mj4Var = b;
        if (mj4Var.n) {
            su3.f(mj4Var);
        }
        int iH = su3.h(mj4Var.q, i, mj4Var.o);
        if (iH >= 0) {
            return (bb1) b.f(iH);
        }
        int i2 = -(iH + 1);
        int i3 = i2 - 1;
        if (i2 >= b.e()) {
            db1 db1Var2 = new db1(new float[]{1.0f}, new float[]{f});
            b(f, db1Var2);
            return db1Var2;
        }
        if (i3 < 0) {
            db1Var = new db1(fArr, fArr);
            fC = 1.0f;
        } else {
            fC = b.c(i3) / 100.0f;
            db1Var = (bb1) b.f(i3);
        }
        float fC2 = b.c(i2) / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, fC == fC2 ? 0.0f : (f - fC) / (fC2 - fC))) * 1.0f) + 0.0f;
        bb1 bb1Var2 = (bb1) b.f(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f2 = fArr[i4];
            float fB = db1Var.b(f2);
            fArr2[i4] = ((bb1Var2.b(f2) - fB) * fMax) + fB;
        }
        db1 db1Var3 = new db1(fArr, fArr2);
        b(f, db1Var3);
        return db1Var3;
    }

    public static void b(float f, db1 db1Var) {
        synchronized (c) {
            mj4 mj4VarClone = b.clone();
            mj4VarClone.d((int) (f * 100.0f), db1Var);
            b = mj4VarClone;
        }
    }
}
