package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.eddyizm.tempus.homemusic.PlayEvent;
import com.eddyizm.tempus.homemusic.WaveRetry;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wb0 {
    public static final int[] d = {0, 4, 8};
    public static final SparseIntArray e;
    public static final SparseIntArray f;
    public final HashMap a = new HashMap();
    public final boolean b = true;
    public final HashMap c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] d(dp dpVar, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = dpVar.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = ys3.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && dpVar.isInEditMode() && (dpVar.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) dpVar.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.z;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.z.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    public static rb0 e(Context context, AttributeSet attributeSet, boolean z) {
        int i;
        int i2;
        rb0 rb0Var = new rb0();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? kt3.c : kt3.a);
        String[] strArr = xl.d;
        ub0 ub0Var = rb0Var.b;
        vb0 vb0Var = rb0Var.e;
        tb0 tb0Var = rb0Var.c;
        sb0 sb0Var = rb0Var.d;
        int[] iArr = d;
        SparseIntArray sparseIntArray = e;
        if (z) {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            qb0 qb0Var = new qb0();
            qb0Var.a = new int[10];
            qb0Var.b = new int[10];
            qb0Var.c = 0;
            qb0Var.d = new int[10];
            qb0Var.e = new float[10];
            qb0Var.f = 0;
            qb0Var.g = new int[5];
            qb0Var.h = new String[5];
            qb0Var.i = 0;
            qb0Var.j = new int[4];
            qb0Var.k = new boolean[4];
            qb0Var.l = 0;
            tb0Var.getClass();
            sb0Var.getClass();
            vb0Var.getClass();
            int i3 = 0;
            while (i3 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                int i4 = indexCount;
                switch (f.get(index)) {
                    case 2:
                        i2 = i3;
                        qb0Var.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, sb0Var.I));
                        continue;
                        i3 = i2 + 1;
                        indexCount = i4;
                        break;
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i2 = i3;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        i2 = i3;
                        qb0Var.c(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i3 = i2 + 1;
                        indexCount = i4;
                        break;
                    case 6:
                        i2 = i3;
                        qb0Var.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, sb0Var.C));
                        break;
                    case 7:
                        i2 = i3;
                        qb0Var.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, sb0Var.D));
                        break;
                    case 8:
                        i2 = i3;
                        qb0Var.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, sb0Var.J));
                        break;
                    case 11:
                        i2 = i3;
                        qb0Var.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, sb0Var.P));
                        break;
                    case 12:
                        i2 = i3;
                        qb0Var.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, sb0Var.Q));
                        break;
                    case 13:
                        i2 = i3;
                        qb0Var.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, sb0Var.M));
                        break;
                    case 14:
                        i2 = i3;
                        qb0Var.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, sb0Var.O));
                        break;
                    case 15:
                        i2 = i3;
                        qb0Var.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, sb0Var.R));
                        break;
                    case WaveRetry.MAX_FAILURES /* 16 */:
                        i2 = i3;
                        qb0Var.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, sb0Var.N));
                        break;
                    case 17:
                        i2 = i3;
                        qb0Var.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, sb0Var.d));
                        break;
                    case 18:
                        i2 = i3;
                        qb0Var.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, sb0Var.e));
                        break;
                    case 19:
                        i2 = i3;
                        qb0Var.a(19, typedArrayObtainStyledAttributes.getFloat(index, sb0Var.f));
                        break;
                    case 20:
                        i2 = i3;
                        qb0Var.a(20, typedArrayObtainStyledAttributes.getFloat(index, sb0Var.w));
                        break;
                    case 21:
                        i2 = i3;
                        qb0Var.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, sb0Var.c));
                        break;
                    case 22:
                        i2 = i3;
                        qb0Var.b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, ub0Var.a)]);
                        break;
                    case 23:
                        i2 = i3;
                        qb0Var.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, sb0Var.b));
                        break;
                    case 24:
                        i2 = i3;
                        qb0Var.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, sb0Var.F));
                        break;
                    case 27:
                        i2 = i3;
                        qb0Var.b(27, typedArrayObtainStyledAttributes.getInt(index, sb0Var.E));
                        break;
                    case 28:
                        i2 = i3;
                        qb0Var.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, sb0Var.G));
                        break;
                    case 31:
                        i2 = i3;
                        qb0Var.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, sb0Var.K));
                        break;
                    case 34:
                        i2 = i3;
                        qb0Var.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, sb0Var.H));
                        break;
                    case 37:
                        i2 = i3;
                        qb0Var.a(37, typedArrayObtainStyledAttributes.getFloat(index, sb0Var.x));
                        break;
                    case 38:
                        i2 = i3;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, rb0Var.a);
                        rb0Var.a = resourceId;
                        qb0Var.b(38, resourceId);
                        break;
                    case 39:
                        i2 = i3;
                        qb0Var.a(39, typedArrayObtainStyledAttributes.getFloat(index, sb0Var.U));
                        break;
                    case 40:
                        i2 = i3;
                        qb0Var.a(40, typedArrayObtainStyledAttributes.getFloat(index, sb0Var.T));
                        break;
                    case 41:
                        i2 = i3;
                        qb0Var.b(41, typedArrayObtainStyledAttributes.getInt(index, sb0Var.V));
                        break;
                    case 42:
                        i2 = i3;
                        qb0Var.b(42, typedArrayObtainStyledAttributes.getInt(index, sb0Var.W));
                        break;
                    case 43:
                        i2 = i3;
                        qb0Var.a(43, typedArrayObtainStyledAttributes.getFloat(index, ub0Var.c));
                        break;
                    case 44:
                        i2 = i3;
                        qb0Var.d(44, true);
                        qb0Var.a(44, typedArrayObtainStyledAttributes.getDimension(index, vb0Var.m));
                        break;
                    case 45:
                        i2 = i3;
                        qb0Var.a(45, typedArrayObtainStyledAttributes.getFloat(index, vb0Var.b));
                        break;
                    case 46:
                        i2 = i3;
                        qb0Var.a(46, typedArrayObtainStyledAttributes.getFloat(index, vb0Var.c));
                        break;
                    case 47:
                        i2 = i3;
                        qb0Var.a(47, typedArrayObtainStyledAttributes.getFloat(index, vb0Var.d));
                        break;
                    case 48:
                        i2 = i3;
                        qb0Var.a(48, typedArrayObtainStyledAttributes.getFloat(index, vb0Var.e));
                        break;
                    case 49:
                        i2 = i3;
                        qb0Var.a(49, typedArrayObtainStyledAttributes.getDimension(index, vb0Var.f));
                        break;
                    case 50:
                        i2 = i3;
                        qb0Var.a(50, typedArrayObtainStyledAttributes.getDimension(index, vb0Var.g));
                        break;
                    case 51:
                        i2 = i3;
                        qb0Var.a(51, typedArrayObtainStyledAttributes.getDimension(index, vb0Var.i));
                        break;
                    case 52:
                        i2 = i3;
                        qb0Var.a(52, typedArrayObtainStyledAttributes.getDimension(index, vb0Var.j));
                        break;
                    case 53:
                        i2 = i3;
                        qb0Var.a(53, typedArrayObtainStyledAttributes.getDimension(index, vb0Var.k));
                        break;
                    case 54:
                        i2 = i3;
                        qb0Var.b(54, typedArrayObtainStyledAttributes.getInt(index, sb0Var.X));
                        break;
                    case 55:
                        i2 = i3;
                        qb0Var.b(55, typedArrayObtainStyledAttributes.getInt(index, sb0Var.Y));
                        break;
                    case 56:
                        i2 = i3;
                        qb0Var.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, sb0Var.Z));
                        break;
                    case 57:
                        i2 = i3;
                        qb0Var.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, sb0Var.a0));
                        break;
                    case 58:
                        i2 = i3;
                        qb0Var.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, sb0Var.b0));
                        break;
                    case 59:
                        i2 = i3;
                        qb0Var.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, sb0Var.c0));
                        break;
                    case 60:
                        i2 = i3;
                        qb0Var.a(60, typedArrayObtainStyledAttributes.getFloat(index, vb0Var.a));
                        break;
                    case 62:
                        i2 = i3;
                        qb0Var.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, sb0Var.A));
                        break;
                    case 63:
                        i2 = i3;
                        qb0Var.a(63, typedArrayObtainStyledAttributes.getFloat(index, sb0Var.B));
                        break;
                    case 64:
                        i2 = i3;
                        qb0Var.b(64, g(typedArrayObtainStyledAttributes, index, tb0Var.a));
                        break;
                    case 65:
                        i2 = i3;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            qb0Var.c(65, typedArrayObtainStyledAttributes.getString(index));
                        } else {
                            qb0Var.c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        break;
                    case 66:
                        i2 = i3;
                        qb0Var.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i2 = i3;
                        qb0Var.a(67, typedArrayObtainStyledAttributes.getFloat(index, tb0Var.e));
                        break;
                    case 68:
                        i2 = i3;
                        qb0Var.a(68, typedArrayObtainStyledAttributes.getFloat(index, ub0Var.d));
                        break;
                    case 69:
                        i2 = i3;
                        qb0Var.a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i2 = i3;
                        qb0Var.a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i2 = i3;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i2 = i3;
                        qb0Var.b(72, typedArrayObtainStyledAttributes.getInt(index, sb0Var.f0));
                        break;
                    case 73:
                        i2 = i3;
                        qb0Var.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, sb0Var.g0));
                        break;
                    case 74:
                        i2 = i3;
                        qb0Var.c(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i2 = i3;
                        qb0Var.d(75, typedArrayObtainStyledAttributes.getBoolean(index, sb0Var.n0));
                        break;
                    case 76:
                        i2 = i3;
                        qb0Var.b(76, typedArrayObtainStyledAttributes.getInt(index, tb0Var.c));
                        break;
                    case 77:
                        i2 = i3;
                        qb0Var.c(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i2 = i3;
                        qb0Var.b(78, typedArrayObtainStyledAttributes.getInt(index, ub0Var.b));
                        break;
                    case 79:
                        i2 = i3;
                        qb0Var.a(79, typedArrayObtainStyledAttributes.getFloat(index, tb0Var.d));
                        break;
                    case 80:
                        i2 = i3;
                        qb0Var.d(80, typedArrayObtainStyledAttributes.getBoolean(index, sb0Var.l0));
                        break;
                    case 81:
                        i2 = i3;
                        qb0Var.d(81, typedArrayObtainStyledAttributes.getBoolean(index, sb0Var.m0));
                        break;
                    case 82:
                        i2 = i3;
                        qb0Var.b(82, typedArrayObtainStyledAttributes.getInteger(index, tb0Var.b));
                        break;
                    case 83:
                        i2 = i3;
                        qb0Var.b(83, g(typedArrayObtainStyledAttributes, index, vb0Var.h));
                        break;
                    case 84:
                        i2 = i3;
                        qb0Var.b(84, typedArrayObtainStyledAttributes.getInteger(index, tb0Var.g));
                        break;
                    case 85:
                        i2 = i3;
                        qb0Var.a(85, typedArrayObtainStyledAttributes.getFloat(index, tb0Var.f));
                        break;
                    case 86:
                        i2 = i3;
                        int i5 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i5 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            tb0Var.i = resourceId2;
                            qb0Var.b(89, resourceId2);
                            if (tb0Var.i != -1) {
                                qb0Var.b(88, -2);
                            }
                        } else if (i5 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            tb0Var.h = string;
                            qb0Var.c(90, string);
                            if (tb0Var.h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                tb0Var.i = resourceId3;
                                qb0Var.b(89, resourceId3);
                                qb0Var.b(88, -2);
                            } else {
                                qb0Var.b(88, -1);
                            }
                        } else {
                            qb0Var.b(88, typedArrayObtainStyledAttributes.getInteger(index, tb0Var.i));
                        }
                        break;
                    case 87:
                        i2 = i3;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i2 = i3;
                        qb0Var.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, sb0Var.L));
                        break;
                    case 94:
                        i2 = i3;
                        qb0Var.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, sb0Var.S));
                        break;
                    case 95:
                        i2 = i3;
                        h(qb0Var, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i2 = i3;
                        h(qb0Var, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i2 = i3;
                        qb0Var.b(97, typedArrayObtainStyledAttributes.getInt(index, sb0Var.o0));
                        break;
                    case 98:
                        i2 = i3;
                        int i6 = vx2.D;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            rb0Var.a = typedArrayObtainStyledAttributes.getResourceId(index, rb0Var.a);
                        }
                        break;
                    case 99:
                        i2 = i3;
                        qb0Var.d(99, typedArrayObtainStyledAttributes.getBoolean(index, sb0Var.g));
                        break;
                }
                i3 = i2 + 1;
                indexCount = i4;
            }
        } else {
            int i7 = 0;
            for (int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount(); i7 < indexCount2; indexCount2 = i) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        tb0Var.getClass();
                        sb0Var.getClass();
                        vb0Var.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        sb0Var.p = g(typedArrayObtainStyledAttributes, index2, sb0Var.p);
                        continue;
                        i7++;
                        break;
                    case 2:
                        i = indexCount2;
                        sb0Var.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, sb0Var.I);
                        continue;
                        i7++;
                        break;
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                        i = indexCount2;
                        sb0Var.o = g(typedArrayObtainStyledAttributes, index2, sb0Var.o);
                        continue;
                        i7++;
                        break;
                    case 4:
                        i = indexCount2;
                        sb0Var.n = g(typedArrayObtainStyledAttributes, index2, sb0Var.n);
                        continue;
                        i7++;
                        break;
                    case 5:
                        i = indexCount2;
                        sb0Var.y = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i7++;
                        break;
                    case 6:
                        i = indexCount2;
                        sb0Var.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, sb0Var.C);
                        continue;
                        i7++;
                        break;
                    case 7:
                        i = indexCount2;
                        sb0Var.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, sb0Var.D);
                        continue;
                        i7++;
                        break;
                    case 8:
                        i = indexCount2;
                        sb0Var.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, sb0Var.J);
                        continue;
                        i7++;
                        break;
                    case 9:
                        i = indexCount2;
                        sb0Var.v = g(typedArrayObtainStyledAttributes, index2, sb0Var.v);
                        continue;
                        i7++;
                        break;
                    case 10:
                        i = indexCount2;
                        sb0Var.u = g(typedArrayObtainStyledAttributes, index2, sb0Var.u);
                        continue;
                        i7++;
                        break;
                    case 11:
                        i = indexCount2;
                        sb0Var.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, sb0Var.P);
                        continue;
                        i7++;
                        break;
                    case 12:
                        i = indexCount2;
                        sb0Var.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, sb0Var.Q);
                        continue;
                        i7++;
                        break;
                    case 13:
                        i = indexCount2;
                        sb0Var.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, sb0Var.M);
                        continue;
                        i7++;
                        break;
                    case 14:
                        i = indexCount2;
                        sb0Var.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, sb0Var.O);
                        continue;
                        i7++;
                        break;
                    case 15:
                        i = indexCount2;
                        sb0Var.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, sb0Var.R);
                        continue;
                        i7++;
                        break;
                    case WaveRetry.MAX_FAILURES /* 16 */:
                        i = indexCount2;
                        sb0Var.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, sb0Var.N);
                        continue;
                        i7++;
                        break;
                    case 17:
                        i = indexCount2;
                        sb0Var.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, sb0Var.d);
                        continue;
                        i7++;
                        break;
                    case 18:
                        i = indexCount2;
                        sb0Var.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, sb0Var.e);
                        continue;
                        i7++;
                        break;
                    case 19:
                        i = indexCount2;
                        sb0Var.f = typedArrayObtainStyledAttributes.getFloat(index2, sb0Var.f);
                        continue;
                        i7++;
                        break;
                    case 20:
                        i = indexCount2;
                        sb0Var.w = typedArrayObtainStyledAttributes.getFloat(index2, sb0Var.w);
                        continue;
                        i7++;
                        break;
                    case 21:
                        i = indexCount2;
                        sb0Var.c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, sb0Var.c);
                        continue;
                        i7++;
                        break;
                    case 22:
                        i = indexCount2;
                        int i8 = typedArrayObtainStyledAttributes.getInt(index2, ub0Var.a);
                        ub0Var.a = i8;
                        ub0Var.a = iArr[i8];
                        continue;
                        i7++;
                        break;
                    case 23:
                        i = indexCount2;
                        sb0Var.b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, sb0Var.b);
                        continue;
                        i7++;
                        break;
                    case 24:
                        i = indexCount2;
                        sb0Var.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, sb0Var.F);
                        continue;
                        i7++;
                        break;
                    case 25:
                        i = indexCount2;
                        sb0Var.h = g(typedArrayObtainStyledAttributes, index2, sb0Var.h);
                        continue;
                        i7++;
                        break;
                    case 26:
                        i = indexCount2;
                        sb0Var.i = g(typedArrayObtainStyledAttributes, index2, sb0Var.i);
                        continue;
                        i7++;
                        break;
                    case 27:
                        i = indexCount2;
                        sb0Var.E = typedArrayObtainStyledAttributes.getInt(index2, sb0Var.E);
                        continue;
                        i7++;
                        break;
                    case 28:
                        i = indexCount2;
                        sb0Var.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, sb0Var.G);
                        continue;
                        i7++;
                        break;
                    case 29:
                        i = indexCount2;
                        sb0Var.j = g(typedArrayObtainStyledAttributes, index2, sb0Var.j);
                        continue;
                        i7++;
                        break;
                    case 30:
                        i = indexCount2;
                        sb0Var.k = g(typedArrayObtainStyledAttributes, index2, sb0Var.k);
                        continue;
                        i7++;
                        break;
                    case 31:
                        i = indexCount2;
                        sb0Var.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, sb0Var.K);
                        continue;
                        i7++;
                        break;
                    case 32:
                        i = indexCount2;
                        sb0Var.s = g(typedArrayObtainStyledAttributes, index2, sb0Var.s);
                        continue;
                        i7++;
                        break;
                    case 33:
                        i = indexCount2;
                        sb0Var.t = g(typedArrayObtainStyledAttributes, index2, sb0Var.t);
                        continue;
                        i7++;
                        break;
                    case 34:
                        i = indexCount2;
                        sb0Var.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, sb0Var.H);
                        continue;
                        i7++;
                        break;
                    case 35:
                        i = indexCount2;
                        sb0Var.m = g(typedArrayObtainStyledAttributes, index2, sb0Var.m);
                        continue;
                        i7++;
                        break;
                    case 36:
                        i = indexCount2;
                        sb0Var.l = g(typedArrayObtainStyledAttributes, index2, sb0Var.l);
                        continue;
                        i7++;
                        break;
                    case 37:
                        i = indexCount2;
                        sb0Var.x = typedArrayObtainStyledAttributes.getFloat(index2, sb0Var.x);
                        continue;
                        i7++;
                        break;
                    case 38:
                        i = indexCount2;
                        rb0Var.a = typedArrayObtainStyledAttributes.getResourceId(index2, rb0Var.a);
                        continue;
                        i7++;
                        break;
                    case 39:
                        i = indexCount2;
                        sb0Var.U = typedArrayObtainStyledAttributes.getFloat(index2, sb0Var.U);
                        continue;
                        i7++;
                        break;
                    case 40:
                        i = indexCount2;
                        sb0Var.T = typedArrayObtainStyledAttributes.getFloat(index2, sb0Var.T);
                        continue;
                        i7++;
                        break;
                    case 41:
                        i = indexCount2;
                        sb0Var.V = typedArrayObtainStyledAttributes.getInt(index2, sb0Var.V);
                        continue;
                        i7++;
                        break;
                    case 42:
                        i = indexCount2;
                        sb0Var.W = typedArrayObtainStyledAttributes.getInt(index2, sb0Var.W);
                        continue;
                        i7++;
                        break;
                    case 43:
                        i = indexCount2;
                        ub0Var.c = typedArrayObtainStyledAttributes.getFloat(index2, ub0Var.c);
                        continue;
                        i7++;
                        break;
                    case 44:
                        i = indexCount2;
                        vb0Var.l = true;
                        vb0Var.m = typedArrayObtainStyledAttributes.getDimension(index2, vb0Var.m);
                        continue;
                        i7++;
                        break;
                    case 45:
                        i = indexCount2;
                        vb0Var.b = typedArrayObtainStyledAttributes.getFloat(index2, vb0Var.b);
                        continue;
                        i7++;
                        break;
                    case 46:
                        i = indexCount2;
                        vb0Var.c = typedArrayObtainStyledAttributes.getFloat(index2, vb0Var.c);
                        continue;
                        i7++;
                        break;
                    case 47:
                        i = indexCount2;
                        vb0Var.d = typedArrayObtainStyledAttributes.getFloat(index2, vb0Var.d);
                        continue;
                        i7++;
                        break;
                    case 48:
                        i = indexCount2;
                        vb0Var.e = typedArrayObtainStyledAttributes.getFloat(index2, vb0Var.e);
                        continue;
                        i7++;
                        break;
                    case 49:
                        i = indexCount2;
                        vb0Var.f = typedArrayObtainStyledAttributes.getDimension(index2, vb0Var.f);
                        continue;
                        i7++;
                        break;
                    case 50:
                        i = indexCount2;
                        vb0Var.g = typedArrayObtainStyledAttributes.getDimension(index2, vb0Var.g);
                        continue;
                        i7++;
                        break;
                    case 51:
                        i = indexCount2;
                        vb0Var.i = typedArrayObtainStyledAttributes.getDimension(index2, vb0Var.i);
                        continue;
                        i7++;
                        break;
                    case 52:
                        i = indexCount2;
                        vb0Var.j = typedArrayObtainStyledAttributes.getDimension(index2, vb0Var.j);
                        continue;
                        i7++;
                        break;
                    case 53:
                        i = indexCount2;
                        vb0Var.k = typedArrayObtainStyledAttributes.getDimension(index2, vb0Var.k);
                        continue;
                        i7++;
                        break;
                    case 54:
                        i = indexCount2;
                        sb0Var.X = typedArrayObtainStyledAttributes.getInt(index2, sb0Var.X);
                        continue;
                        i7++;
                        break;
                    case 55:
                        i = indexCount2;
                        sb0Var.Y = typedArrayObtainStyledAttributes.getInt(index2, sb0Var.Y);
                        continue;
                        i7++;
                        break;
                    case 56:
                        i = indexCount2;
                        sb0Var.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, sb0Var.Z);
                        continue;
                        i7++;
                        break;
                    case 57:
                        i = indexCount2;
                        sb0Var.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, sb0Var.a0);
                        continue;
                        i7++;
                        break;
                    case 58:
                        i = indexCount2;
                        sb0Var.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, sb0Var.b0);
                        continue;
                        i7++;
                        break;
                    case 59:
                        i = indexCount2;
                        sb0Var.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, sb0Var.c0);
                        continue;
                        i7++;
                        break;
                    case 60:
                        i = indexCount2;
                        vb0Var.a = typedArrayObtainStyledAttributes.getFloat(index2, vb0Var.a);
                        continue;
                        i7++;
                        break;
                    case 61:
                        i = indexCount2;
                        sb0Var.z = g(typedArrayObtainStyledAttributes, index2, sb0Var.z);
                        continue;
                        i7++;
                        break;
                    case 62:
                        i = indexCount2;
                        sb0Var.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, sb0Var.A);
                        continue;
                        i7++;
                        break;
                    case 63:
                        i = indexCount2;
                        sb0Var.B = typedArrayObtainStyledAttributes.getFloat(index2, sb0Var.B);
                        continue;
                        i7++;
                        break;
                    case 64:
                        i = indexCount2;
                        tb0Var.a = g(typedArrayObtainStyledAttributes, index2, tb0Var.a);
                        continue;
                        i7++;
                        break;
                    case 65:
                        i = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            tb0Var.getClass();
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            tb0Var.getClass();
                        }
                        i7++;
                        break;
                    case 66:
                        i = indexCount2;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        tb0Var.getClass();
                        continue;
                        i7++;
                        break;
                    case 67:
                        i = indexCount2;
                        tb0Var.e = typedArrayObtainStyledAttributes.getFloat(index2, tb0Var.e);
                        break;
                    case 68:
                        i = indexCount2;
                        ub0Var.d = typedArrayObtainStyledAttributes.getFloat(index2, ub0Var.d);
                        break;
                    case 69:
                        i = indexCount2;
                        sb0Var.d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        sb0Var.e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        sb0Var.f0 = typedArrayObtainStyledAttributes.getInt(index2, sb0Var.f0);
                        break;
                    case 73:
                        i = indexCount2;
                        sb0Var.g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, sb0Var.g0);
                        break;
                    case 74:
                        i = indexCount2;
                        sb0Var.j0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        sb0Var.n0 = typedArrayObtainStyledAttributes.getBoolean(index2, sb0Var.n0);
                        break;
                    case 76:
                        i = indexCount2;
                        tb0Var.c = typedArrayObtainStyledAttributes.getInt(index2, tb0Var.c);
                        break;
                    case 77:
                        i = indexCount2;
                        sb0Var.k0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        ub0Var.b = typedArrayObtainStyledAttributes.getInt(index2, ub0Var.b);
                        break;
                    case 79:
                        i = indexCount2;
                        tb0Var.d = typedArrayObtainStyledAttributes.getFloat(index2, tb0Var.d);
                        break;
                    case 80:
                        i = indexCount2;
                        sb0Var.l0 = typedArrayObtainStyledAttributes.getBoolean(index2, sb0Var.l0);
                        break;
                    case 81:
                        i = indexCount2;
                        sb0Var.m0 = typedArrayObtainStyledAttributes.getBoolean(index2, sb0Var.m0);
                        break;
                    case 82:
                        i = indexCount2;
                        tb0Var.b = typedArrayObtainStyledAttributes.getInteger(index2, tb0Var.b);
                        break;
                    case 83:
                        i = indexCount2;
                        vb0Var.h = g(typedArrayObtainStyledAttributes, index2, vb0Var.h);
                        break;
                    case 84:
                        i = indexCount2;
                        tb0Var.g = typedArrayObtainStyledAttributes.getInteger(index2, tb0Var.g);
                        break;
                    case 85:
                        i = indexCount2;
                        tb0Var.f = typedArrayObtainStyledAttributes.getFloat(index2, tb0Var.f);
                        break;
                    case 86:
                        i = indexCount2;
                        int i9 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i9 == 1) {
                            tb0Var.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i9 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            tb0Var.h = string2;
                            if (string2.indexOf("/") > 0) {
                                tb0Var.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, tb0Var.i);
                        }
                        break;
                    case 87:
                        i = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 91:
                        i = indexCount2;
                        sb0Var.q = g(typedArrayObtainStyledAttributes, index2, sb0Var.q);
                        break;
                    case 92:
                        i = indexCount2;
                        sb0Var.r = g(typedArrayObtainStyledAttributes, index2, sb0Var.r);
                        break;
                    case 93:
                        i = indexCount2;
                        sb0Var.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, sb0Var.L);
                        break;
                    case 94:
                        i = indexCount2;
                        sb0Var.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, sb0Var.S);
                        break;
                    case 95:
                        i = indexCount2;
                        h(sb0Var, typedArrayObtainStyledAttributes, index2, 0);
                        continue;
                        i7++;
                        break;
                    case 96:
                        i = indexCount2;
                        h(sb0Var, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        sb0Var.o0 = typedArrayObtainStyledAttributes.getInt(index2, sb0Var.o0);
                        break;
                }
                i7++;
            }
            if (sb0Var.j0 != null) {
                sb0Var.i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return rb0Var;
    }

    public static int g(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x003f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x005e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    public static void h(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        qb0 qb0Var;
        sb0 sb0Var;
        mb0 mb0Var;
        if (obj == null) {
            return;
        }
        int i3 = typedArray.peekValue(i).type;
        boolean z = true;
        int i4 = 0;
        if (i3 != 3) {
            if (i3 != 5) {
                dimensionPixelSize = typedArray.getInt(i, 0);
                if (dimensionPixelSize == -4) {
                    i4 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z = false;
                }
                if (obj instanceof mb0) {
                    mb0Var = (mb0) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) mb0Var).width = i4;
                        mb0Var.W = z;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) mb0Var).height = i4;
                        mb0Var.X = z;
                        return;
                    }
                }
                if (obj instanceof sb0) {
                    sb0Var = (sb0) obj;
                    if (i2 == 0) {
                        sb0Var.b = i4;
                        sb0Var.l0 = z;
                        return;
                    } else {
                        sb0Var.c = i4;
                        sb0Var.m0 = z;
                        return;
                    }
                }
                if (obj instanceof qb0) {
                    qb0Var = (qb0) obj;
                    if (i2 == 0) {
                        qb0Var.b(23, i4);
                        qb0Var.d(80, z);
                        return;
                    } else {
                        qb0Var.b(21, i4);
                        qb0Var.d(81, z);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
            z = false;
            i4 = dimensionPixelSize;
            if (obj instanceof mb0) {
                mb0Var = (mb0) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) mb0Var).width = i4;
                    mb0Var.W = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) mb0Var).height = i4;
                    mb0Var.X = z;
                    return;
                }
            }
            if (obj instanceof sb0) {
                sb0Var = (sb0) obj;
                if (i2 == 0) {
                    sb0Var.b = i4;
                    sb0Var.l0 = z;
                    return;
                } else {
                    sb0Var.c = i4;
                    sb0Var.m0 = z;
                    return;
                }
            }
            if (obj instanceof qb0) {
                qb0Var = (qb0) obj;
                if (i2 == 0) {
                    qb0Var.b(23, i4);
                    qb0Var.d(80, z);
                    return;
                } else {
                    qb0Var.b(21, i4);
                    qb0Var.d(81, z);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof mb0) {
                    mb0 mb0Var2 = (mb0) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) mb0Var2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) mb0Var2).height = 0;
                    }
                    i(mb0Var2, strTrim2);
                    return;
                }
                if (obj instanceof sb0) {
                    ((sb0) obj).y = strTrim2;
                    return;
                } else {
                    if (obj instanceof qb0) {
                        ((qb0) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f2 = Float.parseFloat(strTrim2);
                    if (obj instanceof mb0) {
                        mb0 mb0Var3 = (mb0) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) mb0Var3).width = 0;
                            mb0Var3.H = f2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) mb0Var3).height = 0;
                            mb0Var3.I = f2;
                            return;
                        }
                    }
                    if (obj instanceof sb0) {
                        sb0 sb0Var2 = (sb0) obj;
                        if (i2 == 0) {
                            sb0Var2.b = 0;
                            sb0Var2.U = f2;
                            return;
                        } else {
                            sb0Var2.c = 0;
                            sb0Var2.T = f2;
                            return;
                        }
                    }
                    if (obj instanceof qb0) {
                        qb0 qb0Var2 = (qb0) obj;
                        if (i2 == 0) {
                            qb0Var2.b(23, 0);
                            qb0Var2.a(39, f2);
                            return;
                        } else {
                            qb0Var2.b(21, 0);
                            qb0Var2.a(40, f2);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof mb0) {
                        mb0 mb0Var4 = (mb0) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) mb0Var4).width = 0;
                            mb0Var4.R = fMax;
                            mb0Var4.L = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) mb0Var4).height = 0;
                            mb0Var4.S = fMax;
                            mb0Var4.M = 2;
                            return;
                        }
                    }
                    if (obj instanceof sb0) {
                        sb0 sb0Var3 = (sb0) obj;
                        if (i2 == 0) {
                            sb0Var3.b = 0;
                            sb0Var3.d0 = fMax;
                            sb0Var3.X = 2;
                            return;
                        } else {
                            sb0Var3.c = 0;
                            sb0Var3.e0 = fMax;
                            sb0Var3.Y = 2;
                            return;
                        }
                    }
                    if (obj instanceof qb0) {
                        qb0 qb0Var3 = (qb0) obj;
                        if (i2 == 0) {
                            qb0Var3.b(23, 0);
                            qb0Var3.b(54, 2);
                        } else {
                            qb0Var3.b(21, 0);
                            qb0Var3.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void i(mb0 mb0Var, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i = 0;
            int i2 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i2 = i;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f2 = Float.parseFloat(strSubstring3);
                        float f3 = Float.parseFloat(strSubstring4);
                        if (f2 > 0.0f && f3 > 0.0f) {
                            if (i2 == 1) {
                                Math.abs(f3 / f2);
                            } else {
                                Math.abs(f2 / f3);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        mb0Var.G = str;
    }

    public static String j(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return PlayEvent.START;
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i;
        HashMap map;
        String resourceEntryName;
        wb0 wb0Var = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = wb0Var.c;
        HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!map2.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb.append(resourceEntryName);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (wb0Var.b && id == -1) {
                    tb4.e("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (id != -1) {
                    if (map2.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        rb0 rb0Var = (rb0) map2.get(Integer.valueOf(id));
                        if (rb0Var != null) {
                            ub0 ub0Var = rb0Var.b;
                            sb0 sb0Var = rb0Var.d;
                            vb0 vb0Var = rb0Var.e;
                            if (childAt instanceof dp) {
                                sb0Var.h0 = 1;
                                dp dpVar = (dp) childAt;
                                dpVar.setId(id);
                                dpVar.setType(sb0Var.f0);
                                dpVar.setMargin(sb0Var.g0);
                                dpVar.setAllowsGoneWidget(sb0Var.n0);
                                int[] iArr = sb0Var.i0;
                                if (iArr != null) {
                                    dpVar.setReferencedIds(iArr);
                                } else {
                                    String str = sb0Var.j0;
                                    if (str != null) {
                                        int[] iArrD = d(dpVar, str);
                                        sb0Var.i0 = iArrD;
                                        dpVar.setReferencedIds(iArrD);
                                    }
                                }
                            }
                            mb0 mb0Var = (mb0) childAt.getLayoutParams();
                            mb0Var.a();
                            rb0Var.a(mb0Var);
                            HashMap map3 = rb0Var.f;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map3.keySet()) {
                                ib0 ib0Var = (ib0) map3.get(str2);
                                HashSet hashSet3 = hashSet2;
                                String strG = !ib0Var.a ? xa3.g("set", str2) : str2;
                                int i3 = i2;
                                try {
                                    int iW = xa3.w(ib0Var.b);
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (iW) {
                                        case 0:
                                            map = map3;
                                            cls.getMethod(strG, cls3).invoke(childAt, Integer.valueOf(ib0Var.c));
                                            break;
                                        case 1:
                                            map = map3;
                                            cls.getMethod(strG, cls2).invoke(childAt, Float.valueOf(ib0Var.d));
                                            break;
                                        case 2:
                                            map = map3;
                                            cls.getMethod(strG, cls3).invoke(childAt, Integer.valueOf(ib0Var.g));
                                            break;
                                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                            Method method = cls.getMethod(strG, Drawable.class);
                                            map = map3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(ib0Var.g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e2) {
                                                e = e2;
                                                StringBuilder sbJ = xa3.j(" Custom Attribute \"", str2, "\" not found on ");
                                                sbJ.append(cls.getName());
                                                Log.e("TransitionLayout", sbJ.toString(), e);
                                            } catch (NoSuchMethodException e3) {
                                                e = e3;
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + strG, e);
                                            } catch (InvocationTargetException e4) {
                                                e = e4;
                                                StringBuilder sbJ2 = xa3.j(" Custom Attribute \"", str2, "\" not found on ");
                                                sbJ2.append(cls.getName());
                                                Log.e("TransitionLayout", sbJ2.toString(), e);
                                            }
                                            break;
                                        case 4:
                                            cls.getMethod(strG, CharSequence.class).invoke(childAt, ib0Var.e);
                                            map = map3;
                                            break;
                                        case 5:
                                            cls.getMethod(strG, Boolean.TYPE).invoke(childAt, Boolean.valueOf(ib0Var.f));
                                            map = map3;
                                            break;
                                        case 6:
                                            cls.getMethod(strG, cls2).invoke(childAt, Float.valueOf(ib0Var.d));
                                            map = map3;
                                            break;
                                        case 7:
                                            cls.getMethod(strG, cls3).invoke(childAt, Integer.valueOf(ib0Var.c));
                                            map = map3;
                                            break;
                                        default:
                                            map = map3;
                                            break;
                                    }
                                } catch (IllegalAccessException e5) {
                                    e = e5;
                                    map = map3;
                                } catch (NoSuchMethodException e6) {
                                    e = e6;
                                    map = map3;
                                } catch (InvocationTargetException e7) {
                                    e = e7;
                                    map = map3;
                                }
                                hashSet2 = hashSet3;
                                i2 = i3;
                                map3 = map;
                            }
                            hashSet = hashSet2;
                            i = i2;
                            childAt.setLayoutParams(mb0Var);
                            if (ub0Var.b == 0) {
                                childAt.setVisibility(ub0Var.a);
                            }
                            childAt.setAlpha(ub0Var.c);
                            childAt.setRotation(vb0Var.a);
                            childAt.setRotationX(vb0Var.b);
                            childAt.setRotationY(vb0Var.c);
                            childAt.setScaleX(vb0Var.d);
                            childAt.setScaleY(vb0Var.e);
                            if (vb0Var.h != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(vb0Var.h);
                                if (viewFindViewById != null) {
                                    float bottom = (viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f;
                                    float right = (viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float left = right - childAt.getLeft();
                                        float top = bottom - childAt.getTop();
                                        childAt.setPivotX(left);
                                        childAt.setPivotY(top);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(vb0Var.f)) {
                                    childAt.setPivotX(vb0Var.f);
                                }
                                if (!Float.isNaN(vb0Var.g)) {
                                    childAt.setPivotY(vb0Var.g);
                                }
                            }
                            childAt.setTranslationX(vb0Var.i);
                            childAt.setTranslationY(vb0Var.j);
                            childAt.setTranslationZ(vb0Var.k);
                            if (vb0Var.l) {
                                childAt.setElevation(vb0Var.m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i = i2;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
                i2 = i + 1;
                wb0Var = this;
                hashSet2 = hashSet;
            }
            hashSet = hashSet2;
            i = i2;
            i2 = i + 1;
            wb0Var = this;
            hashSet2 = hashSet;
        }
        for (Integer num : hashSet2) {
            rb0 rb0Var2 = (rb0) map2.get(num);
            if (rb0Var2 != null) {
                sb0 sb0Var2 = rb0Var2.d;
                if (sb0Var2.h0 == 1) {
                    Context context = constraintLayout.getContext();
                    dp dpVar2 = new dp(context);
                    dpVar2.n = new int[32];
                    dpVar2.t = new HashMap();
                    dpVar2.p = context;
                    ep epVar = new ep();
                    epVar.p0 = new jc0[4];
                    epVar.q0 = 0;
                    epVar.r0 = 0;
                    epVar.s0 = true;
                    epVar.t0 = 0;
                    epVar.u0 = false;
                    dpVar2.w = epVar;
                    dpVar2.q = epVar;
                    dpVar2.e();
                    dpVar2.setVisibility(8);
                    dpVar2.setId(num.intValue());
                    int[] iArr2 = sb0Var2.i0;
                    if (iArr2 != null) {
                        dpVar2.setReferencedIds(iArr2);
                    } else {
                        String str3 = sb0Var2.j0;
                        if (str3 != null) {
                            int[] iArrD2 = d(dpVar2, str3);
                            sb0Var2.i0 = iArrD2;
                            dpVar2.setReferencedIds(iArrD2);
                        }
                    }
                    dpVar2.setType(sb0Var2.f0);
                    dpVar2.setMargin(sb0Var2.g0);
                    fd4 fd4Var = ConstraintLayout.C;
                    mb0 mb0Var2 = new mb0(-2, -2);
                    dpVar2.e();
                    rb0Var2.a(mb0Var2);
                    constraintLayout.addView(dpVar2, mb0Var2);
                }
                if (sb0Var2.a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    fd4 fd4Var2 = ConstraintLayout.C;
                    mb0 mb0Var3 = new mb0(-2, -2);
                    rb0Var2.a(mb0Var3);
                    constraintLayout.addView(guideline, mb0Var3);
                }
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            constraintLayout.getChildAt(i4);
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i;
        HashMap map;
        int i2;
        wb0 wb0Var = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = wb0Var.c;
        map2.clear();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            mb0 mb0Var = (mb0) childAt.getLayoutParams();
            int id = childAt.getId();
            if (wb0Var.b && id == -1) {
                tb4.e("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            }
            if (!map2.containsKey(Integer.valueOf(id))) {
                map2.put(Integer.valueOf(id), new rb0());
            }
            rb0 rb0Var = (rb0) map2.get(Integer.valueOf(id));
            if (rb0Var == null) {
                i = childCount;
                map = map2;
                i2 = i3;
            } else {
                ub0 ub0Var = rb0Var.b;
                sb0 sb0Var = rb0Var.d;
                vb0 vb0Var = rb0Var.e;
                i = childCount;
                HashMap map3 = new HashMap();
                map = map2;
                Class<?> cls = childAt.getClass();
                i2 = i3;
                HashMap map4 = wb0Var.a;
                for (String str : map4.keySet()) {
                    ib0 ib0Var = (ib0) map4.get(str);
                    HashMap map5 = map4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new ib0(ib0Var, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            map3.put(str, new ib0(ib0Var, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e2) {
                        StringBuilder sbJ = xa3.j(" Custom Attribute \"", str, "\" not found on ");
                        sbJ.append(cls.getName());
                        Log.e("TransitionLayout", sbJ.toString(), e2);
                    } catch (NoSuchMethodException e3) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e3);
                    } catch (InvocationTargetException e4) {
                        StringBuilder sbJ2 = xa3.j(" Custom Attribute \"", str, "\" not found on ");
                        sbJ2.append(cls.getName());
                        Log.e("TransitionLayout", sbJ2.toString(), e4);
                    }
                    map4 = map5;
                }
                rb0Var.f = map3;
                rb0Var.a = id;
                sb0Var.h = mb0Var.e;
                sb0Var.i = mb0Var.f;
                sb0Var.j = mb0Var.g;
                sb0Var.k = mb0Var.h;
                sb0Var.l = mb0Var.i;
                sb0Var.m = mb0Var.j;
                sb0Var.n = mb0Var.k;
                sb0Var.o = mb0Var.l;
                sb0Var.p = mb0Var.m;
                sb0Var.q = mb0Var.n;
                sb0Var.r = mb0Var.o;
                sb0Var.s = mb0Var.s;
                sb0Var.t = mb0Var.t;
                sb0Var.u = mb0Var.u;
                sb0Var.v = mb0Var.v;
                sb0Var.w = mb0Var.E;
                sb0Var.x = mb0Var.F;
                sb0Var.y = mb0Var.G;
                sb0Var.z = mb0Var.p;
                sb0Var.A = mb0Var.q;
                sb0Var.B = mb0Var.r;
                sb0Var.C = mb0Var.T;
                sb0Var.D = mb0Var.U;
                sb0Var.E = mb0Var.V;
                sb0Var.f = mb0Var.c;
                sb0Var.d = mb0Var.a;
                sb0Var.e = mb0Var.b;
                sb0Var.b = ((ViewGroup.MarginLayoutParams) mb0Var).width;
                sb0Var.c = ((ViewGroup.MarginLayoutParams) mb0Var).height;
                sb0Var.F = ((ViewGroup.MarginLayoutParams) mb0Var).leftMargin;
                sb0Var.G = ((ViewGroup.MarginLayoutParams) mb0Var).rightMargin;
                sb0Var.H = ((ViewGroup.MarginLayoutParams) mb0Var).topMargin;
                sb0Var.I = ((ViewGroup.MarginLayoutParams) mb0Var).bottomMargin;
                sb0Var.L = mb0Var.D;
                sb0Var.T = mb0Var.I;
                sb0Var.U = mb0Var.H;
                sb0Var.W = mb0Var.K;
                sb0Var.V = mb0Var.J;
                sb0Var.l0 = mb0Var.W;
                sb0Var.m0 = mb0Var.X;
                sb0Var.X = mb0Var.L;
                sb0Var.Y = mb0Var.M;
                sb0Var.Z = mb0Var.P;
                sb0Var.a0 = mb0Var.Q;
                sb0Var.b0 = mb0Var.N;
                sb0Var.c0 = mb0Var.O;
                sb0Var.d0 = mb0Var.R;
                sb0Var.e0 = mb0Var.S;
                sb0Var.k0 = mb0Var.Y;
                sb0Var.N = mb0Var.x;
                sb0Var.P = mb0Var.z;
                sb0Var.M = mb0Var.w;
                sb0Var.O = mb0Var.y;
                sb0Var.R = mb0Var.A;
                sb0Var.Q = mb0Var.B;
                sb0Var.S = mb0Var.C;
                sb0Var.o0 = mb0Var.Z;
                sb0Var.J = mb0Var.getMarginEnd();
                sb0Var.K = mb0Var.getMarginStart();
                ub0Var.a = childAt.getVisibility();
                ub0Var.c = childAt.getAlpha();
                vb0Var.a = childAt.getRotation();
                vb0Var.b = childAt.getRotationX();
                vb0Var.c = childAt.getRotationY();
                vb0Var.d = childAt.getScaleX();
                vb0Var.e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    vb0Var.f = pivotX;
                    vb0Var.g = pivotY;
                }
                vb0Var.i = childAt.getTranslationX();
                vb0Var.j = childAt.getTranslationY();
                vb0Var.k = childAt.getTranslationZ();
                if (vb0Var.l) {
                    vb0Var.m = childAt.getElevation();
                }
                if (childAt instanceof dp) {
                    dp dpVar = (dp) childAt;
                    sb0Var.n0 = dpVar.getAllowsGoneWidget();
                    sb0Var.i0 = dpVar.getReferencedIds();
                    sb0Var.f0 = dpVar.getType();
                    sb0Var.g0 = dpVar.getMargin();
                }
            }
            i3 = i2 + 1;
            wb0Var = this;
            childCount = i;
            map2 = map;
        }
    }

    public final void c(int i, int i2, int i3, int i4) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.c;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i), new rb0());
        }
        rb0 rb0Var = (rb0) map.get(Integer.valueOf(i));
        if (rb0Var == null) {
            return;
        }
        sb0 sb0Var = rb0Var.d;
        switch (i2) {
            case 1:
                if (i3 == 1) {
                    sb0Var.h = 0;
                    sb0Var.i = -1;
                } else if (i3 != 2) {
                    nz2.t(j(i3), " undefined", "Left to ");
                    return;
                } else {
                    sb0Var.i = 0;
                    sb0Var.h = -1;
                }
                sb0Var.F = i4;
                return;
            case 2:
                if (i3 == 1) {
                    sb0Var.j = 0;
                    sb0Var.k = -1;
                } else if (i3 != 2) {
                    nz2.t(j(i3), " undefined", "right to ");
                    return;
                } else {
                    sb0Var.k = 0;
                    sb0Var.j = -1;
                }
                sb0Var.G = i4;
                return;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                if (i3 == 3) {
                    sb0Var.l = 0;
                    sb0Var.m = -1;
                    sb0Var.p = -1;
                    sb0Var.q = -1;
                    sb0Var.r = -1;
                } else {
                    if (i3 != 4) {
                        nz2.t(j(i3), " undefined", "right to ");
                        return;
                    }
                    sb0Var.m = 0;
                    sb0Var.l = -1;
                    sb0Var.p = -1;
                    sb0Var.q = -1;
                    sb0Var.r = -1;
                }
                sb0Var.H = i4;
                return;
            case 4:
                if (i3 == 4) {
                    sb0Var.o = 0;
                    sb0Var.n = -1;
                    sb0Var.p = -1;
                    sb0Var.q = -1;
                    sb0Var.r = -1;
                } else {
                    if (i3 != 3) {
                        nz2.t(j(i3), " undefined", "right to ");
                        return;
                    }
                    sb0Var.n = 0;
                    sb0Var.o = -1;
                    sb0Var.p = -1;
                    sb0Var.q = -1;
                    sb0Var.r = -1;
                }
                sb0Var.I = i4;
                return;
            case 5:
                if (i3 == 5) {
                    sb0Var.p = 0;
                    sb0Var.o = -1;
                    sb0Var.n = -1;
                    sb0Var.l = -1;
                    sb0Var.m = -1;
                    return;
                }
                if (i3 == 3) {
                    sb0Var.q = 0;
                    sb0Var.o = -1;
                    sb0Var.n = -1;
                    sb0Var.l = -1;
                    sb0Var.m = -1;
                    return;
                }
                if (i3 != 4) {
                    nz2.t(j(i3), " undefined", "right to ");
                    return;
                }
                sb0Var.r = 0;
                sb0Var.o = -1;
                sb0Var.n = -1;
                sb0Var.l = -1;
                sb0Var.m = -1;
                return;
            case 6:
                if (i3 == 6) {
                    sb0Var.t = 0;
                    sb0Var.s = -1;
                } else if (i3 != 7) {
                    nz2.t(j(i3), " undefined", "right to ");
                    return;
                } else {
                    sb0Var.s = 0;
                    sb0Var.t = -1;
                }
                sb0Var.K = i4;
                return;
            case 7:
                if (i3 == 7) {
                    sb0Var.v = 0;
                    sb0Var.u = -1;
                } else if (i3 != 6) {
                    nz2.t(j(i3), " undefined", "right to ");
                    return;
                } else {
                    sb0Var.u = 0;
                    sb0Var.v = -1;
                }
                sb0Var.J = i4;
                return;
            default:
                throw new IllegalArgumentException(j(i2) + " to " + j(i3) + " unknown");
        }
    }

    public final void f(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    rb0 rb0VarE = e(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        rb0VarE.d.a = true;
                    }
                    this.c.put(Integer.valueOf(rb0VarE.a), rb0VarE);
                }
            }
        } catch (IOException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e2);
        } catch (XmlPullParserException e3) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e3);
        }
    }
}
