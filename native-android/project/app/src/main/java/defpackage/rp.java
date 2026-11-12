package defpackage;

import android.content.res.TypedArray;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rp {
    public Object a;

    public rp(int i) {
        switch (i) {
            case 1:
                this.a = new ArrayList();
                break;
            case 2:
            case 5:
            default:
                this.a = new ArrayDeque(20);
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                this.a = new kd4();
                break;
            case 4:
                this.a = new Object();
                break;
            case 6:
                this.a = new HashSet();
                break;
        }
    }

    public boolean a(int i, tg1 tg1Var, Object obj) {
        ArrayList arrayList = tg1Var.a;
        if (arrayList == null) {
            b(i, tg1Var, null);
            return true;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = arrayList.get(i2);
            if (!(obj2 instanceof mg1)) {
                if (!(obj2 instanceof tg1)) {
                    mj0.g(obj2, "Unexpected child source info ");
                    break;
                }
                if (a(i, (tg1) obj2, obj)) {
                    b(0, tg1Var, obj2);
                    return true;
                }
            } else if (obj2 == obj) {
                b(0, tg1Var, obj2);
                return true;
            }
        }
        return false;
    }

    public void b(int i, tg1 tg1Var, Object obj) {
        ((ArrayList) this.a).add(new d80(i, null, null));
    }

    public abstract void c(gc gcVar);

    public kd4 d() {
        kd4 kd4Var = (kd4) this.a;
        int i = kd4Var.f;
        int[] iArr = kd4Var.b;
        if (i != 1) {
            int i2 = kd4Var.e;
            iArr[0] = i2;
            int i3 = kd4Var.d;
            iArr[1] = i3;
            iArr[2] = i3;
            iArr[3] = i2;
        } else {
            int i4 = kd4Var.d;
            iArr[0] = i4;
            iArr[1] = i4;
            int i5 = kd4Var.e;
            iArr[2] = i5;
            iArr[3] = i5;
        }
        float[] fArr = kd4Var.a;
        if (i != 1) {
            fArr[0] = Math.max(((1.0f - kd4Var.k) - kd4Var.l) / 2.0f, 0.0f);
            fArr[1] = Math.max(((1.0f - kd4Var.k) - 0.001f) / 2.0f, 0.0f);
            fArr[2] = Math.min(((kd4Var.k + 1.0f) + 0.001f) / 2.0f, 1.0f);
            fArr[3] = Math.min(((kd4Var.k + 1.0f) + kd4Var.l) / 2.0f, 1.0f);
            return kd4Var;
        }
        fArr[0] = 0.0f;
        fArr[1] = Math.min(kd4Var.k, 1.0f);
        fArr[2] = Math.min(kd4Var.k + kd4Var.l, 1.0f);
        fArr[3] = 1.0f;
        return kd4Var;
    }

    public abstract void e(y94 y94Var);

    public abstract void f();

    public rp g(TypedArray typedArray) {
        kd4 kd4Var = (kd4) this.a;
        if (typedArray.hasValue(3)) {
            kd4Var.n = typedArray.getBoolean(3, kd4Var.n);
        }
        if (typedArray.hasValue(0)) {
            kd4Var.o = typedArray.getBoolean(0, kd4Var.o);
        }
        if (typedArray.hasValue(1)) {
            kd4Var.e = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(1, 0.3f))) * 255.0f)) << 24) | (kd4Var.e & 16777215);
        }
        if (typedArray.hasValue(11)) {
            kd4Var.d = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(11, 1.0f))) * 255.0f)) << 24) | (16777215 & kd4Var.d);
        }
        if (typedArray.hasValue(7)) {
            long j = typedArray.getInt(7, (int) kd4Var.s);
            if (j < 0) {
                kf2.n(b11.k("Given a negative duration: ", j));
                return null;
            }
            kd4Var.s = j;
        }
        if (typedArray.hasValue(14)) {
            kd4Var.q = typedArray.getInt(14, kd4Var.q);
        }
        if (typedArray.hasValue(15)) {
            long j2 = typedArray.getInt(15, (int) kd4Var.t);
            if (j2 < 0) {
                kf2.n(b11.k("Given a negative repeat delay: ", j2));
                return null;
            }
            kd4Var.t = j2;
        }
        if (typedArray.hasValue(16)) {
            kd4Var.r = typedArray.getInt(16, kd4Var.r);
        }
        if (typedArray.hasValue(5)) {
            int i = typedArray.getInt(5, kd4Var.c);
            if (i == 1) {
                kd4Var.c = 1;
            } else if (i == 2) {
                kd4Var.c = 2;
            } else if (i != 3) {
                kd4Var.c = 0;
            } else {
                kd4Var.c = 3;
            }
        }
        if (typedArray.hasValue(17)) {
            if (typedArray.getInt(17, kd4Var.f) != 1) {
                kd4Var.f = 0;
            } else {
                kd4Var.f = 1;
            }
        }
        if (typedArray.hasValue(6)) {
            float f = typedArray.getFloat(6, kd4Var.l);
            if (f < 0.0f) {
                tb4.f("Given invalid dropoff value: ", f);
                return null;
            }
            kd4Var.l = f;
        }
        if (typedArray.hasValue(9)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(9, kd4Var.g);
            if (dimensionPixelSize < 0) {
                kf2.n(f34.f(dimensionPixelSize, "Given invalid width: "));
                return null;
            }
            kd4Var.g = dimensionPixelSize;
        }
        if (typedArray.hasValue(8)) {
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, kd4Var.h);
            if (dimensionPixelSize2 < 0) {
                kf2.n(f34.f(dimensionPixelSize2, "Given invalid height: "));
                return null;
            }
            kd4Var.h = dimensionPixelSize2;
        }
        if (typedArray.hasValue(13)) {
            float f2 = typedArray.getFloat(13, kd4Var.k);
            if (f2 < 0.0f) {
                tb4.f("Given invalid intensity value: ", f2);
                return null;
            }
            kd4Var.k = f2;
        }
        if (typedArray.hasValue(19)) {
            float f3 = typedArray.getFloat(19, kd4Var.i);
            if (f3 < 0.0f) {
                tb4.f("Given invalid width ratio: ", f3);
                return null;
            }
            kd4Var.i = f3;
        }
        if (typedArray.hasValue(10)) {
            float f4 = typedArray.getFloat(10, kd4Var.j);
            if (f4 < 0.0f) {
                tb4.f("Given invalid height ratio: ", f4);
                return null;
            }
            kd4Var.j = f4;
        }
        if (typedArray.hasValue(18)) {
            kd4Var.m = typedArray.getFloat(18, kd4Var.m);
        }
        return j();
    }

    public abstract void h();

    public String i() {
        return null;
    }

    public abstract rp j();

    public void k(xn3 xn3Var) {
        ArrayDeque arrayDeque = (ArrayDeque) this.a;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(xn3Var);
        }
    }

    public void l(int i, Object obj, tg1 tg1Var, Object obj2) {
        if (h12.c(obj, j80.a)) {
            b(i, tg1Var, null);
        }
    }

    public abstract if1 m(y94 y94Var);

    public abstract void n(y00 y00Var);

    public void o(Type... typeArr) {
        HashSet hashSet = (HashSet) this.a;
        for (Type type : typeArr) {
            if (type != null && hashSet.add(type)) {
                try {
                    if (type instanceof TypeVariable) {
                        s((TypeVariable) type);
                    } else if (type instanceof WildcardType) {
                        t((WildcardType) type);
                    } else if (type instanceof ParameterizedType) {
                        r((ParameterizedType) type);
                    } else if (type instanceof Class) {
                        p((Class) type);
                    } else {
                        if (!(type instanceof GenericArrayType)) {
                            throw new AssertionError("Unknown type: " + type);
                        }
                        q((GenericArrayType) type);
                    }
                } catch (Throwable th) {
                    hashSet.remove(type);
                    throw th;
                }
            }
        }
    }

    public void p(Class cls) {
    }

    public void q(GenericArrayType genericArrayType) {
    }

    public void r(ParameterizedType parameterizedType) {
    }

    public abstract void s(TypeVariable typeVariable);

    public abstract void t(WildcardType wildcardType);

    public rp(wv4 wv4Var) {
        this.a = wv4Var;
    }
}
