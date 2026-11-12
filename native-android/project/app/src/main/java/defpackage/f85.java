package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class f85 extends wr1 {
    public static boolean j = true;
    public static boolean k = true;
    public static boolean l = true;
    public static boolean m = true;

    public void V(View view, int i, int i2, int i3, int i4) {
        if (l) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                l = false;
            }
        }
    }

    public void W(View view, int i) {
        if (Build.VERSION.SDK_INT != 28) {
            if (m) {
                try {
                    view.setTransitionVisibility(i);
                    return;
                } catch (NoSuchMethodError unused) {
                    m = false;
                    return;
                }
            }
            return;
        }
        if (!wr1.h) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                wr1.g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            wr1.h = true;
        }
        Field field = wr1.g;
        if (field != null) {
            try {
                wr1.g.setInt(view, (field.getInt(view) & (-13)) | i);
            } catch (IllegalAccessException unused3) {
            }
        }
    }

    public void X(View view, Matrix matrix) {
        if (j) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                j = false;
            }
        }
    }

    public void Y(ViewGroup viewGroup, Matrix matrix) {
        if (k) {
            try {
                viewGroup.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                k = false;
            }
        }
    }
}
