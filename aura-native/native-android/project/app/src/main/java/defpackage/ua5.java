package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ua5 extends bb5 {
    public static Field g;
    public static boolean h;
    public static Constructor i;
    public static boolean j;
    public WindowInsets e;
    public vz1 f;

    public ua5() {
        this.e = j();
    }

    private static WindowInsets j() {
        if (!h) {
            try {
                g = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
            }
            h = true;
        }
        Field field = g;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
            }
        }
        if (!j) {
            try {
                i = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
            }
            j = true;
        }
        Constructor constructor = i;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
            }
        }
        return null;
    }

    @Override // defpackage.bb5
    public pb5 b() {
        a();
        pb5 pb5VarG = pb5.g(this.e, null);
        vz1[] vz1VarArr = this.b;
        mb5 mb5Var = pb5VarG.a;
        mb5Var.v(vz1VarArr);
        mb5Var.x(this.f);
        mb5Var.u(null);
        mb5Var.z(this.c);
        mb5Var.A(this.d);
        return pb5VarG;
    }

    @Override // defpackage.bb5
    public void f(vz1 vz1Var) {
        this.f = vz1Var;
    }

    @Override // defpackage.bb5
    public void h(vz1 vz1Var) {
        WindowInsets windowInsets = this.e;
        if (windowInsets != null) {
            this.e = windowInsets.replaceSystemWindowInsets(vz1Var.a, vz1Var.b, vz1Var.c, vz1Var.d);
        }
    }

    public ua5(pb5 pb5Var) {
        super(pb5Var);
        this.e = pb5Var.f();
    }
}
