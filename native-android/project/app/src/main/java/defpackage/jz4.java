package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import app.homemusic.R;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.SongListPageFragment;
import com.google.android.material.appbar.MaterialToolbar;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jz4 {
    public static final ca1 a = new ca1(17);
    public static final String[] b = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] c = {44100, 48000, 32000};
    public static final int[] d = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] f = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] g = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] h = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
    public static final StackTraceElement[] i = new StackTraceElement[0];

    public static boolean A(int i2, Object obj) {
        int arity;
        if (obj instanceof sf1) {
            if (obj instanceof gg1) {
                arity = ((gg1) obj).getArity();
            } else if (obj instanceof gf1) {
                arity = 0;
            } else if (obj instanceof if1) {
                arity = 1;
            } else if (obj instanceof wf1) {
                arity = 2;
            } else if (obj instanceof xf1) {
                arity = 3;
            } else if (obj instanceof yf1) {
                arity = 4;
            } else if (obj instanceof zf1) {
                arity = 5;
            } else if (obj instanceof ag1) {
                arity = 6;
            } else if (obj instanceof bg1) {
                arity = 7;
            } else if (obj instanceof cg1) {
                arity = 8;
            } else if (obj instanceof dg1) {
                arity = 9;
            } else if (obj instanceof hf1) {
                arity = 10;
            } else if (obj instanceof jf1) {
                arity = 11;
            } else if (obj instanceof lf1) {
                arity = 13;
            } else if (obj instanceof mf1) {
                arity = 14;
            } else if (obj instanceof nf1) {
                arity = 15;
            } else if (obj instanceof of1) {
                arity = 16;
            } else if (obj instanceof pf1) {
                arity = 17;
            } else if (obj instanceof qf1) {
                arity = 18;
            } else if (obj instanceof rf1) {
                arity = 19;
            } else if (obj instanceof tf1) {
                arity = 20;
            } else {
                arity = obj instanceof uf1 ? 21 : -1;
            }
            if (arity == i2) {
                return true;
            }
        }
        return false;
    }

    public static final boolean B(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static boolean C(Child child) {
        return n61.f(1, child.getId(), child.getStarred() != null);
    }

    public static boolean D(Context context, Child child) {
        if (ud3.o() != null) {
            return g51.e(child) != null;
        }
        eu0 eu0VarW = au0.w(context);
        String id = child.getId();
        eu0VarW.getClass();
        return eu0.d(id);
    }

    public static final void E(Context context) {
        Map map;
        context.getClass();
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        if (databasePath.exists()) {
            cx.f().b(nc5.a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            databasePath2.getClass();
            File noBackupFilesDir = context.getNoBackupFilesDir();
            noBackupFilesDir.getClass();
            File file = new File(noBackupFilesDir, "androidx.work.workdb");
            String[] strArr = nc5.b;
            int iW = lg2.W(strArr.length);
            if (iW < 16) {
                iW = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
            for (String str : strArr) {
                linkedHashMap.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
            }
            if (linkedHashMap.isEmpty()) {
                Map mapSingletonMap = Collections.singletonMap(databasePath2, file);
                mapSingletonMap.getClass();
                map = mapSingletonMap;
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(databasePath2, file);
                map = linkedHashMap2;
            }
            for (Map.Entry entry : map.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        cx.f().k(nc5.a, "Over-writing contents of " + file3);
                    }
                    cx.f().b(nc5.a, file2.renameTo(file3) ? "Migrated " + file2 + "to " + file3 : "Renaming " + file2 + " to " + file3 + " failed");
                }
            }
        }
    }

    public static String F(StringBuilder sb, int i2, int i3) {
        int i4;
        int iLastIndexOf;
        if (i2 >= i3) {
            return sb.toString();
        }
        if (sb.charAt(i2) == '/') {
            i2++;
        }
        int i5 = i2;
        int i6 = i5;
        while (i5 <= i3) {
            if (i5 == i3) {
                i4 = i5;
            } else if (sb.charAt(i5) == '/') {
                i4 = i5 + 1;
            } else {
                i5++;
            }
            int i7 = i6 + 1;
            if (i5 == i7 && sb.charAt(i6) == '.') {
                sb.delete(i6, i4);
                i3 -= i4 - i6;
            } else {
                if (i5 == i6 + 2 && sb.charAt(i6) == '.' && sb.charAt(i7) == '.') {
                    iLastIndexOf = sb.lastIndexOf("/", i6 - 2) + 1;
                    int i8 = iLastIndexOf > i2 ? iLastIndexOf : i2;
                    sb.delete(i8, i4);
                    i3 -= i4 - i8;
                } else {
                    iLastIndexOf = i5 + 1;
                }
                i6 = iLastIndexOf;
            }
            i5 = i6;
        }
        return sb.toString();
    }

    public static String G(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrX = x(str2);
        if (iArrX[0] != -1) {
            sb.append(str2);
            F(sb, iArrX[1], iArrX[2]);
            return sb.toString();
        }
        int[] iArrX2 = x(str);
        if (iArrX[3] == 0) {
            sb.append((CharSequence) str, 0, iArrX2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrX[2] == 0) {
            sb.append((CharSequence) str, 0, iArrX2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i2 = iArrX[1];
        if (i2 != 0) {
            int i3 = iArrX2[0] + 1;
            sb.append((CharSequence) str, 0, i3);
            sb.append(str2);
            return F(sb, iArrX[1] + i3, i3 + iArrX[2]);
        }
        if (str2.charAt(i2) == '/') {
            sb.append((CharSequence) str, 0, iArrX2[1]);
            sb.append(str2);
            int i4 = iArrX2[1];
            return F(sb, i4, iArrX[2] + i4);
        }
        int i5 = iArrX2[0] + 2;
        int i6 = iArrX2[1];
        if (i5 >= i6 || i6 != iArrX2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrX2[2] - 1);
            int i7 = iLastIndexOf == -1 ? iArrX2[1] : iLastIndexOf + 1;
            sb.append((CharSequence) str, 0, i7);
            sb.append(str2);
            return F(sb, iArrX2[1], i7 + iArrX[2]);
        }
        sb.append((CharSequence) str, 0, i6);
        sb.append('/');
        sb.append(str2);
        int i8 = iArrX2[1];
        return F(sb, i8, iArrX[2] + i8 + 1);
    }

    public static Uri H(String str, String str2) {
        return Uri.parse(G(str, str2));
    }

    public static int I(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static void J(Context context, List list, boolean z) {
        d34 d34Var = new d34(25);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Child child = (Child) it.next();
            Date date = null;
            if (ot1.c(child.getId())) {
                ConcurrentHashMap concurrentHashMap = ot1.a;
                ot1.g(context, child, z);
            } else if (hw.t()) {
                d34Var.J(child.getId(), null, z, null);
            } else {
                mf4 mf4Var = new mf4(d34Var, child, z);
                String id = child.getId();
                if (z) {
                    d34.I(id, null, null, mf4Var);
                } else {
                    d34.K(id, null, null, mf4Var);
                }
            }
            if (z) {
                date = new Date();
            }
            child.setStarred(date);
        }
        if (z && !hw.t() && ud3.X() && ud3.o() == null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                Child child2 = (Child) obj;
                if (!ot1.c(child2.getId()) && !D(context, child2)) {
                    arrayList.add(obj);
                }
            }
            p(context, arrayList);
        }
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
  (r0v0 int) from 0x0007: SWITCH (r0v0 int)
 case -1811142716: goto B:118:0x0130
 case -1811142715: goto B:113:0x0123
 case -1811142714: goto B:108:0x0116
 case -1811142713: goto B:103:0x0109
 case -1811142712: goto B:98:0x00fc
 case -1811142711: goto B:93:0x00ef
 case -1811142710: goto B:88:0x00e2
 case -1811142709: goto B:83:0x00d5
 case -1811142708: goto B:78:0x00c8
 case -1811142707: goto B:73:0x00bb
 default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:8)
  (r0v0 int) from 0x000a: SWITCH (r0v0 int)
 case -1811142685: goto B:68:0x00ae
 case -1811142684: goto B:63:0x00a1
 case -1811142683: goto B:58:0x0094
 default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:11)
  (r0v0 int) from 0x000d: SWITCH (r0v0 int)
 case 80123371: goto B:53:0x0087
 case 80123372: goto B:48:0x007a
 case 80123373: goto B:43:0x006d
 case 80123374: goto B:38:0x0060
 case 80123375: goto B:33:0x0053
 case 80123376: goto B:28:0x0046
 case 80123377: goto B:23:0x0039
 case 80123378: goto B:18:0x002c
 case 80123379: goto B:13:0x001f
 case 80123380: goto B:8:0x0012
 default: goto B:313:? A[RegionRef:SW:6] (LINE:14)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String K(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "Companion";
            case "java.lang.Integer":
                return "Int";
            case "java.lang.Cloneable":
                return "Cloneable";
            case "java.lang.annotation.Annotation":
                return "Annotation";
            case "java.lang.Comparable":
                return "Comparable";
            case "java.util.Map":
                return "Map";
            case "java.util.Set":
                return "Set";
            case "double":
                return "Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "Companion";
            case "java.lang.CharSequence":
                return "CharSequence";
            case "java.util.Collection":
                return "Collection";
            case "java.lang.Float":
                return "Float";
            case "java.lang.Short":
                return "Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "Companion";
            case "java.util.Map$Entry":
                return "Entry";
            case "int":
                return "Int";
            case "byte":
                return "Byte";
            case "char":
                return "Char";
            case "long":
                return "Long";
            case "boolean":
                return "Boolean";
            case "java.util.List":
                return "List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "Companion";
            case "float":
                return "Float";
            case "short":
                return "Short";
            case "java.lang.Character":
                return "Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "Companion";
            case "java.lang.Boolean":
                return "Boolean";
            case "java.lang.Byte":
                return "Byte";
            case "java.lang.Enum":
                return "Enum";
            case "java.lang.Long":
                return "Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "Companion";
            case "java.util.Iterator":
                return "Iterator";
            case "java.util.ListIterator":
                return "ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "Companion";
            case "java.lang.Double":
                return "Double";
            case "java.lang.Number":
                return "Number";
            case "java.lang.Object":
                return "Any";
            case "java.lang.String":
                return "String";
            case "java.lang.Iterable":
                return "Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "Companion";
            case "java.lang.Throwable":
                return "Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static final long L(wv3 wv3Var) {
        float f2 = wv3Var.c - wv3Var.a;
        return (((long) Float.floatToRawIntBits(wv3Var.d - wv3Var.b)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static void M(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(b11.o(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        h12.M(classCastException, jz4.class.getName());
        throw classCastException;
    }

    public static int[] N(Collection collection) {
        if (collection instanceof m12) {
            m12 m12Var = (m12) collection;
            return Arrays.copyOfRange(m12Var.n, m12Var.o, m12Var.p);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = array[i2];
            obj.getClass();
            iArr[i2] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    public static Integer O(String str) {
        byte b2;
        Long lValueOf;
        byte b3;
        str.getClass();
        if (!str.isEmpty()) {
            int i2 = str.charAt(0) == '-' ? 1 : 0;
            if (i2 != str.length()) {
                int i3 = i2 + 1;
                char cCharAt = str.charAt(i2);
                if (cCharAt < 128) {
                    b2 = ye2.a[cCharAt];
                } else {
                    byte[] bArr = ye2.a;
                    b2 = -1;
                }
                if (b2 >= 0 && b2 < 10) {
                    long j = -b2;
                    while (true) {
                        if (i3 >= str.length()) {
                            if (i2 == 0) {
                                if (j != Long.MIN_VALUE) {
                                    lValueOf = Long.valueOf(-j);
                                    break;
                                }
                                break;
                            }
                            lValueOf = Long.valueOf(j);
                            break;
                        }
                        int i4 = i3 + 1;
                        char cCharAt2 = str.charAt(i3);
                        if (cCharAt2 < 128) {
                            b3 = ye2.a[cCharAt2];
                        } else {
                            byte[] bArr2 = ye2.a;
                            b3 = -1;
                        }
                        if (b3 >= 0 && b3 < 10 && j >= -922337203685477580L) {
                            long j2 = j * 10;
                            long j3 = b3;
                            if (j2 >= Long.MIN_VALUE + j3) {
                                j = j2 - j3;
                                i3 = i4;
                            }
                        }
                        lValueOf = null;
                        break;
                    }
                }
                lValueOf = null;
                break;
            }
            lValueOf = null;
            break;
        }
        lValueOf = null;
        break;
        if (lValueOf == null || lValueOf.longValue() != lValueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(lValueOf.intValue());
    }

    public static void P(final SongListPageFragment songListPageFragment, final ni4 ni4Var, final List list, final boolean z, final si4 si4Var) {
        final Context contextZ = songListPageFragment.Z();
        List list2 = ni4Var.u;
        list2.getClass();
        final List listQ0 = q40.Q0(list2);
        J(contextZ, list, false);
        if (z) {
            ArrayList arrayList = new ArrayList(r40.k0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Child) it.next()).getId());
            }
            Set setT0 = q40.T0(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listQ0) {
                if (!setT0.contains(((Child) obj).getId())) {
                    arrayList2.add(obj);
                }
            }
            ni4Var.r(arrayList2);
            si4Var.run();
        }
        View view = songListPageFragment.T;
        if (view == null) {
            return;
        }
        nc1 nc1VarE = songListPageFragment.e();
        MainActivity mainActivity = nc1VarE instanceof MainActivity ? (MainActivity) nc1VarE : null;
        qg4 qg4VarH = qg4.h(view, contextZ.getResources().getQuantityString(R.plurals.homemusic_selection_unliked, list.size(), Integer.valueOf(list.size())), 0);
        qg4VarH.e(mainActivity != null ? mainActivity.u() : null);
        qg4VarH.i(R.string.homemusic_undo, new View.OnClickListener() { // from class: to1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                jz4.J(contextZ, list, true);
                if (!z || songListPageFragment.T == null) {
                    return;
                }
                ni4Var.r(listQ0);
                si4Var.run();
            }
        });
        qg4VarH.j();
    }

    public static final f15 Q(vd0 vd0Var, ne0 ne0Var, Object obj) {
        f15 f15Var = null;
        if ((vd0Var instanceof ye0) && ne0Var.K(iz.p) != null) {
            ye0 callerFrame = (ye0) vd0Var;
            while (!(callerFrame instanceof nr0) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof f15) {
                    f15Var = (f15) callerFrame;
                    break;
                }
            }
            if (f15Var != null) {
                f15Var.n0(ne0Var, obj);
            }
        }
        return f15Var;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00bb  */
    public static final void a(final String str, dx2 dx2Var, final zs4 zs4Var, int i2, boolean z, int i3, int i4, rg1 rg1Var, final int i5) {
        final dx2 dx2Var2;
        final int i6;
        final boolean z2;
        final int i7;
        final int i8;
        rg1Var.S(-1040751001);
        int i9 = i5 | (rg1Var.e(str) ? 4 : 2) | 48 | (rg1Var.e(zs4Var) ? 256 : 128) | 920349696;
        if (!rg1Var.K(i9 & 1, (306783379 & i9) != 306783378)) {
            rg1Var.N();
            dx2Var2 = dx2Var;
            i6 = i2;
            z2 = z;
            i7 = i3;
            i8 = i4;
        } else {
            if (rg1Var.i(c94.a) != null) {
                kf2.k();
                return;
            }
            rg1Var.R(357055103);
            rg1Var.o(false);
            ha1 ha1Var = (ha1) rg1Var.i(g90.k);
            Executor executor = (Executor) rg1Var.i(nr.a);
            if (executor != null) {
                int length = str.length();
                if (Build.VERSION.SDK_INT < 28 || length < 8 || length >= 1000) {
                    rg1Var.R(-1248455541);
                    rg1Var.o(false);
                } else {
                    if (nr.b == null) {
                        nr.b = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
                    }
                    Boolean bool = nr.b;
                    bool.getClass();
                    if (bool.booleanValue()) {
                        rg1Var.R(-1250263182);
                        try {
                            executor.execute(new mr(zs4Var, (r62) rg1Var.i(g90.n), str, (oo0) rg1Var.i(g90.h), ha1Var, 0));
                        } catch (RejectedExecutionException unused) {
                        }
                        rg1Var.o(false);
                    } else {
                        rg1Var.R(-1248455541);
                        rg1Var.o(false);
                    }
                }
            } else {
                rg1Var.R(-1248455541);
                rg1Var.o(false);
            }
            rg1Var.R(358076243);
            rg1Var.o(false);
            vs4 vs4Var = new vs4(str, zs4Var, ha1Var);
            w01 w01Var = w01.b;
            int iHashCode = Long.hashCode(rg1Var.T);
            dx2 dx2VarE = j51.E(rg1Var, vs4Var);
            mf3 mf3VarK = rg1Var.k();
            e80.e.getClass();
            rg1Var.U();
            if (rg1Var.S) {
                rg1Var.j();
            } else {
                rg1Var.e0();
            }
            l93.c0(fz0.I, rg1Var, w01Var);
            l93.c0(fz0.H, rg1Var, mf3VarK);
            l93.a0(rg1Var);
            l93.c0(fz0.G, rg1Var, dx2VarE);
            l93.c0(fz0.J, rg1Var, Integer.valueOf(iHashCode));
            rg1Var.o(true);
            i7 = Integer.MAX_VALUE;
            i6 = 1;
            z2 = true;
            i8 = 1;
            dx2Var2 = ax2.a;
        }
        lv3 lv3VarP = rg1Var.p();
        if (lv3VarP != null) {
            lv3VarP.d = new wf1(str, dx2Var2, zs4Var, i6, z2, i7, i8, i5) { // from class: lr
                public final /* synthetic */ String n;
                public final /* synthetic */ dx2 o;
                public final /* synthetic */ zs4 p;
                public final /* synthetic */ int q;
                public final /* synthetic */ boolean r;
                public final /* synthetic */ int s;
                public final /* synthetic */ int t;

                @Override // defpackage.wf1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iO = xl.O(1);
                    jz4.a(this.n, this.o, this.p, this.q, this.r, this.s, this.t, (rg1) obj, iO);
                    return j15.a;
                }
            };
        }
    }

    public static final void b(final Object obj, final int i2, final n82 n82Var, final r70 r70Var, rg1 rg1Var, final int i3) {
        int i4;
        rg1Var.S(872548579);
        if ((i3 & 6) == 0) {
            i4 = (rg1Var.g(obj) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= rg1Var.d(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= rg1Var.g(n82Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= rg1Var.g(r70Var) ? 2048 : 1024;
        }
        if (rg1Var.K(i4 & 1, (i4 & 1171) != 1170)) {
            boolean zE = rg1Var.e(obj) | rg1Var.e(n82Var);
            Object objH = rg1Var.H();
            Object obj2 = j80.a;
            if (zE || objH == obj2) {
                objH = new l82(obj, n82Var);
                rg1Var.b0(objH);
            }
            l82 l82Var = (l82) objH;
            l82Var.c = i2;
            zd3 zd3Var = l82Var.g;
            qr3 qr3Var = fg3.a;
            l82 l82Var2 = (l82) rg1Var.i(qr3Var);
            ch4 ch4VarT = ya4.t();
            if1 if1VarE = ch4VarT != null ? ch4VarT.e() : null;
            ch4 ch4VarZ = ya4.z(ch4VarT);
            try {
                if (l82Var2 != ((l82) zd3Var.getValue())) {
                    zd3Var.setValue(l82Var2);
                    if (l82Var.d > 0) {
                        l82 l82Var3 = l82Var.e;
                        if (l82Var3 != null) {
                            l82Var3.b();
                        }
                        if (l82Var2 != null) {
                            l82Var2.a();
                        } else {
                            l82Var2 = null;
                        }
                        l82Var.e = l82Var2;
                    }
                }
                ya4.H(ch4VarT, ch4VarZ, if1VarE);
                boolean zE2 = rg1Var.e(l82Var);
                Object objH2 = rg1Var.H();
                if (zE2 || objH2 == obj2) {
                    objH2 = new x(22, l82Var);
                    rg1Var.b0(objH2);
                }
                bu.b(l82Var, (if1) objH2, rg1Var);
                gi1.a(qr3Var.a(l82Var), r70Var, rg1Var, ((i4 >> 6) & 112) | 8);
            } catch (Throwable th) {
                ya4.H(ch4VarT, ch4VarZ, if1VarE);
                throw th;
            }
        } else {
            rg1Var.N();
        }
        lv3 lv3VarP = rg1Var.p();
        if (lv3VarP != null) {
            lv3VarP.d = new wf1() { // from class: m82
                @Override // defpackage.wf1
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    jz4.b(obj, i2, n82Var, r70Var, (rg1) obj3, xl.O(i3 | 1));
                    return j15.a;
                }
            };
        }
    }

    public static final boolean c(e94 e94Var) {
        p94 p94Var = n94.r;
        w03 w03Var = e94Var.n;
        Object objG = w03Var.g(p94Var);
        if (objG == null) {
            objG = null;
        }
        if (h12.c(objG, fz0.O)) {
            return false;
        }
        return w03Var.b(d94.g) || w03Var.b(d94.h);
    }

    public static final void d(String str) {
        str.getClass();
        if (str.equals("light")) {
            pf.o(1);
        } else if (str.equals("dark")) {
            pf.o(2);
        } else {
            pf.o(-1);
        }
    }

    public static List e(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new m12(0, iArr.length, iArr);
    }

    public static Map f(Object obj) {
        if ((obj instanceof x32) && !(obj instanceof a42)) {
            M(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e2) {
            h12.M(e2, jz4.class.getName());
            throw e2;
        }
    }

    public static final ArrayList g(rm3 rm3Var, ni4 ni4Var) {
        List list = ni4Var.v.f;
        list.getClass();
        List list2 = ni4Var.u;
        list2.getClass();
        ArrayList arrayListG0 = q40.G0(list, list2);
        ArrayList arrayList = new ArrayList();
        int size = arrayListG0.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayListG0.get(i3);
            i3++;
            if (((LinkedHashSet) rm3Var.n).contains(((Child) obj).getId())) {
                arrayList.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            if (hashSet.add(((Child) obj2).getId())) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public static final void h(rm3 rm3Var, MaterialToolbar materialToolbar, MaterialToolbar materialToolbar2, bd1 bd1Var, Context context, boolean z, ni4 ni4Var) {
        boolean z2;
        uo1 uo1Var;
        boolean z3;
        boolean z4;
        ArrayList arrayListG = g(rm3Var, ni4Var);
        boolean zIsEmpty = ((LinkedHashSet) rm3Var.n).isEmpty();
        boolean z5 = !zIsEmpty;
        materialToolbar.setVisibility(!zIsEmpty ? 0 : 8);
        materialToolbar2.setVisibility(zIsEmpty ? 0 : 8);
        bd1Var.c(z5);
        materialToolbar.setTitle(context.getString(R.string.homemusic_selection_count, Integer.valueOf(arrayListG.size())));
        ArrayList arrayList = new ArrayList();
        int size = arrayListG.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListG.get(i2);
            i2++;
            if (!ot1.c(((Child) obj).getId())) {
                arrayList.add(obj);
            }
        }
        if (arrayListG.isEmpty()) {
            z2 = false;
        } else {
            if (!arrayListG.isEmpty()) {
                int size2 = arrayListG.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size2) {
                        Object obj2 = arrayListG.get(i3);
                        i3++;
                        if (!C((Child) obj2)) {
                            z2 = false;
                        }
                    }
                }
            }
            z2 = true;
        }
        uo1.p.getClass();
        if (z2) {
            uo1Var = z ? uo1.DELETE : uo1.UNLIKE;
        } else {
            uo1Var = uo1.LIKE;
        }
        MenuItem menuItemFindItem = materialToolbar.getMenu().findItem(R.id.homemusic_selection_like);
        menuItemFindItem.setVisible(!arrayListG.isEmpty());
        menuItemFindItem.setTitle(uo1Var.n);
        menuItemFindItem.setIcon(uo1Var.o);
        MenuItem menuItemFindItem2 = materialToolbar.getMenu().findItem(R.id.homemusic_selection_download);
        if (!arrayList.isEmpty()) {
            int size3 = arrayList.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size3) {
                    z3 = false;
                    break;
                }
                Object obj3 = arrayList.get(i4);
                i4++;
                if (!D(context, (Child) obj3)) {
                    z3 = true;
                    break;
                }
            }
        } else {
            z3 = false;
            break;
        }
        menuItemFindItem2.setVisible(z3);
        MenuItem menuItemFindItem3 = materialToolbar.getMenu().findItem(R.id.homemusic_selection_remove);
        if (!arrayList.isEmpty()) {
            int size4 = arrayList.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size4) {
                    z4 = false;
                    break;
                }
                Object obj4 = arrayList.get(i5);
                i5++;
                if (D(context, (Child) obj4)) {
                    z4 = true;
                    break;
                }
            }
        } else {
            z4 = false;
            break;
        }
        menuItemFindItem3.setVisible(z4);
        materialToolbar.getMenu().findItem(R.id.homemusic_selection_playlist).setVisible(!arrayList.isEmpty());
        Iterator it = gb.P(Integer.valueOf(R.id.homemusic_selection_play), Integer.valueOf(R.id.homemusic_selection_play_next), Integer.valueOf(R.id.homemusic_selection_queue)).iterator();
        while (it.hasNext()) {
            materialToolbar.getMenu().findItem(((Number) it.next()).intValue()).setVisible(!arrayListG.isEmpty());
        }
        ni4Var.n.d(0, ni4Var.a(), "payload_homemusic_selection");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object i(rq3 rq3Var, gf1 gf1Var, wd0 wd0Var) {
        qq3 qq3Var;
        if (wd0Var instanceof qq3) {
            qq3Var = (qq3) wd0Var;
            int i2 = qq3Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qq3Var.p = i2 - Integer.MIN_VALUE;
            } else {
                qq3Var = new qq3(wd0Var);
            }
        } else {
            qq3Var = new qq3(wd0Var);
        }
        Object obj = qq3Var.o;
        int i3 = qq3Var.p;
        try {
            if (i3 == 0) {
                kb4.X(obj);
                if (qq3Var.getContext().K(fz0.h0) != rq3Var) {
                    kf2.o("awaitClose() can only be invoked from the producer context");
                    return null;
                }
                qq3Var.n = gf1Var;
                qq3Var.p = 1;
                cz czVar = new cz(1, ya4.x(qq3Var));
                czVar.u();
                rq3Var.s.z(new kv(2, czVar));
                Object objQ = czVar.q();
                xe0 xe0Var = xe0.n;
                if (objQ == xe0Var) {
                    return xe0Var;
                }
            } else {
                if (i3 != 1) {
                    kf2.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gf1Var = qq3Var.n;
                kb4.X(obj);
            }
            gf1Var.invoke();
            return j15.a;
        } catch (Throwable th) {
            gf1Var.invoke();
            throw th;
        }
    }

    public static void j(int i2, Object obj) {
        if (obj == null || A(i2, obj)) {
            return;
        }
        M(obj, "kotlin.jvm.functions.Function" + i2);
        throw null;
    }

    public static final void k(View view, ViewGroup viewGroup, rm3 rm3Var, Child child) {
        view.getClass();
        child.getClass();
        boolean z = false;
        View childAt = viewGroup.getChildAt(0);
        ImageView imageView = childAt instanceof ImageView ? (ImageView) childAt : null;
        if (imageView == null) {
            return;
        }
        boolean z2 = rm3Var != null && (((LinkedHashSet) rm3Var.n).isEmpty() ^ true);
        if (z2) {
            rm3Var.getClass();
            if (((LinkedHashSet) rm3Var.n).contains(child.getId())) {
                z = true;
            }
        }
        view.setForeground(z ? new ColorDrawable(v50.i(g12.s(view.getContext(), R.attr.colorPrimary, -7829368), 46)) : null);
        int iL = ji2.L((z2 ? 22 : 18) * view.getResources().getDisplayMetrics().density);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = iL;
        layoutParams.height = iL;
        imageView.setLayoutParams(layoutParams);
        if (z) {
            imageView.setBackgroundResource(R.drawable.ic_homemusic_check_circle);
            imageView.setBackgroundTintList(ColorStateList.valueOf(g12.s(view.getContext(), R.attr.colorPrimary, -7829368)));
        } else if (z2) {
            imageView.setBackgroundResource(R.drawable.ic_homemusic_circle_outline);
            imageView.setBackgroundTintList(ColorStateList.valueOf(g12.s(view.getContext(), R.attr.colorOnSurfaceVariant, -7829368)));
        } else {
            imageView.setBackgroundResource(R.drawable.ic_more_vert);
            imageView.setBackgroundTintList(null);
        }
        viewGroup.setContentDescription(view.getContext().getString(z2 ? R.string.homemusic_selection_toggle : R.string.homemusic_selection_more));
    }

    public static int m(long j) {
        int i2 = (int) j;
        rr2.m(((long) i2) == j, "Out of range: %s", j);
        return i2;
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
  (r0v0 int) from 0x0007: SWITCH (r0v0 int)
 case -1811142716: goto B:118:0x0130
 case -1811142715: goto B:113:0x0123
 case -1811142714: goto B:108:0x0116
 case -1811142713: goto B:103:0x0109
 case -1811142712: goto B:98:0x00fc
 case -1811142711: goto B:93:0x00ef
 case -1811142710: goto B:88:0x00e2
 case -1811142709: goto B:83:0x00d5
 case -1811142708: goto B:78:0x00c8
 case -1811142707: goto B:73:0x00bb
 default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:8)
  (r0v0 int) from 0x000a: SWITCH (r0v0 int)
 case -1811142685: goto B:68:0x00ae
 case -1811142684: goto B:63:0x00a1
 case -1811142683: goto B:58:0x0094
 default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:11)
  (r0v0 int) from 0x000d: SWITCH (r0v0 int)
 case 80123371: goto B:53:0x0087
 case 80123372: goto B:48:0x007a
 case 80123373: goto B:43:0x006d
 case 80123374: goto B:38:0x0060
 case 80123375: goto B:33:0x0053
 case 80123376: goto B:28:0x0046
 case 80123377: goto B:23:0x0039
 case 80123378: goto B:18:0x002c
 case 80123379: goto B:13:0x001f
 case 80123380: goto B:8:0x0012
 default: goto B:331:? A[RegionRef:SW:6] (LINE:14)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String n(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "kotlin.Double.Companion";
            case "java.lang.Integer":
                return "kotlin.Int";
            case "java.lang.Cloneable":
                return "kotlin.Cloneable";
            case "java.lang.annotation.Annotation":
                return "kotlin.Annotation";
            case "java.lang.Comparable":
                return "kotlin.Comparable";
            case "java.util.Map":
                return "kotlin.collections.Map";
            case "java.util.Set":
                return "kotlin.collections.Set";
            case "double":
                return "kotlin.Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "kotlin.Byte.Companion";
            case "java.lang.CharSequence":
                return "kotlin.CharSequence";
            case "java.util.Collection":
                return "kotlin.collections.Collection";
            case "java.lang.Float":
                return "kotlin.Float";
            case "java.lang.Short":
                return "kotlin.Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "kotlin.Char.Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "kotlin.Long.Companion";
            case "java.util.Map$Entry":
                return "kotlin.collections.Map.Entry";
            case "int":
                return "kotlin.Int";
            case "byte":
                return "kotlin.Byte";
            case "char":
                return "kotlin.Char";
            case "long":
                return "kotlin.Long";
            case "boolean":
                return "kotlin.Boolean";
            case "java.util.List":
                return "kotlin.collections.List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "kotlin.Short.Companion";
            case "float":
                return "kotlin.Float";
            case "short":
                return "kotlin.Short";
            case "java.lang.Character":
                return "kotlin.Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "kotlin.Enum.Companion";
            case "java.lang.Boolean":
                return "kotlin.Boolean";
            case "java.lang.Byte":
                return "kotlin.Byte";
            case "java.lang.Enum":
                return "kotlin.Enum";
            case "java.lang.Long":
                return "kotlin.Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "kotlin.Float.Companion";
            case "java.util.Iterator":
                return "kotlin.collections.Iterator";
            case "java.util.ListIterator":
                return "kotlin.collections.ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "kotlin.String.Companion";
            case "java.lang.Double":
                return "kotlin.Double";
            case "java.lang.Number":
                return "kotlin.Number";
            case "java.lang.Object":
                return "kotlin.Any";
            case "java.lang.String":
                return "kotlin.String";
            case "java.lang.Iterable":
                return "kotlin.collections.Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "kotlin.Boolean.Companion";
            case "java.lang.Throwable":
                return "kotlin.Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "kotlin.Int.Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static int o(int i2, int i3) {
        rr2.i(i3, 1073741823, "min (%s) must be less than or equal to max (%s)", i3 <= 1073741823);
        return Math.min(Math.max(i2, i3), 1073741823);
    }

    public static void p(Context context, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (ud3.o() != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                i51.b(context, (Child) obj, null, null, false);
            }
            return;
        }
        eu0 eu0VarW = au0.w(context);
        ArrayList arrayListH = gi1.H(arrayList);
        ArrayList arrayList2 = new ArrayList(r40.k0(arrayList, 10));
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            arrayList2.add(new Download((Child) obj2));
        }
        eu0VarW.a(arrayListH, arrayList2, false);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:27:0x0061  */
    /* JADX WARN: Code duplicated, block: B:30:0x006d A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:24:0x0050, B:28:0x0065, B:30:0x006d, B:20:0x0045, B:23:0x004c), top: B:47:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0084  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r1.b(r10, r0) == r5) goto L32;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x007f -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object q(q81 q81Var, y00 y00Var, boolean z, wd0 wd0Var) {
        t81 t81Var;
        xv it;
        xv xvVar;
        q81 q81Var2;
        Object objB;
        if (wd0Var instanceof t81) {
            t81Var = (t81) wd0Var;
            int i2 = t81Var.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t81Var.s = i2 - Integer.MIN_VALUE;
            } else {
                t81Var = new t81(wd0Var);
            }
        } else {
            t81Var = new t81(wd0Var);
        }
        Object obj = t81Var.r;
        int i3 = t81Var.s;
        xe0 xe0Var = xe0.n;
        try {
            if (i3 == 0) {
                kb4.X(obj);
                it = y00Var.iterator();
                t81Var.n = q81Var;
                t81Var.o = y00Var;
                t81Var.p = it;
                t81Var.q = z;
                t81Var.s = 1;
                objB = it.b(t81Var);
                if (objB == xe0Var) {
                    q81Var2 = q81Var;
                    xvVar = it;
                    obj = objB;
                    if (!((Boolean) obj).booleanValue()) {
                        if (z) {
                            y00Var.f(null);
                        }
                        return j15.a;
                    }
                    Object objC = xvVar.c();
                    t81Var.n = q81Var2;
                    t81Var.o = y00Var;
                    t81Var.p = xvVar;
                    t81Var.q = z;
                    t81Var.s = 2;
                }
                return xe0Var;
            }
            if (i3 == 1) {
                z = t81Var.q;
                xvVar = t81Var.p;
                y00Var = t81Var.o;
                q81Var2 = t81Var.n;
                kb4.X(obj);
                if (!((Boolean) obj).booleanValue()) {
                    if (z) {
                        y00Var.f(null);
                    }
                    return j15.a;
                }
                Object objC2 = xvVar.c();
                t81Var.n = q81Var2;
                t81Var.o = y00Var;
                t81Var.p = xvVar;
                t81Var.q = z;
                t81Var.s = 2;
            } else {
                if (i3 != 2) {
                    kf2.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = t81Var.q;
                xvVar = t81Var.p;
                y00Var = t81Var.o;
                q81Var2 = t81Var.n;
                kb4.X(obj);
            }
            it = xvVar;
            q81Var = q81Var2;
            t81Var.n = q81Var;
            t81Var.o = y00Var;
            t81Var.p = it;
            t81Var.q = z;
            t81Var.s = 1;
            objB = it.b(t81Var);
            if (objB == xe0Var) {
                q81Var2 = q81Var;
                xvVar = it;
                obj = objB;
                if (!((Boolean) obj).booleanValue()) {
                    if (z) {
                        y00Var.f(null);
                    }
                    return j15.a;
                }
                Object objC3 = xvVar.c();
                t81Var.n = q81Var2;
                t81Var.o = y00Var;
                t81Var.p = xvVar;
                t81Var.q = z;
                t81Var.s = 2;
            }
            return xe0Var;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (z) {
                    CancellationException cancellationException = th instanceof CancellationException ? th : null;
                    if (cancellationException == null) {
                        cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                        cancellationException.initCause(th);
                    }
                    y00Var.f(cancellationException);
                }
                throw th2;
            }
        }
    }

    public static final void r(df dfVar) {
        String strH = ud3.H();
        boolean z = ud3.Q() && (strH.equals("dark") || (strH.equals("default") && (dfVar.getResources().getConfiguration().uiMode & 48) == 32));
        String strM = ud3.m();
        if (ud3.S()) {
            ly0.a(dfVar, new qr2(new gp3(7)));
        } else if (xm4.k0(strM, "HEX:", false)) {
            try {
                int color = Color.parseColor(qm4.z0(strM, "HEX:"));
                gp3 gp3Var = new gp3(7);
                gp3Var.p = Integer.valueOf(color);
                gp3Var.o = new tb4(5);
                ly0.a(dfVar, new qr2(gp3Var));
            } catch (IllegalArgumentException e2) {
                Log.e("ThemeHelper", e2.toString());
                ly0.a(dfVar, new qr2(new gp3(7)));
            }
        }
        if (!z) {
            TypedValue typedValue = new TypedValue();
            dfVar.getTheme().resolveAttribute(R.attr.colorSurface, typedValue, true);
            dfVar.getWindow().setBackgroundDrawable(new ColorDrawable(typedValue.data));
            return;
        }
        ArrayList arrayListQ = gb.Q(Integer.valueOf(android.R.attr.colorBackground), Integer.valueOf(android.R.attr.statusBarColor), Integer.valueOf(android.R.attr.navigationBarColor), Integer.valueOf(R.attr.colorSurface), Integer.valueOf(R.attr.colorSurfaceVariant), Integer.valueOf(R.attr.colorSurfaceContainerLowest), Integer.valueOf(R.attr.colorSurfaceContainerLow), Integer.valueOf(R.attr.colorSurfaceContainer), Integer.valueOf(R.attr.colorSurfaceContainerHigh), Integer.valueOf(R.attr.colorSurfaceContainerHighest), Integer.valueOf(R.attr.colorOutline), Integer.valueOf(R.attr.colorOutlineVariant));
        if (Build.VERSION.SDK_INT >= 27) {
            arrayListQ.add(Integer.valueOf(android.R.attr.navigationBarDividerColor));
        }
        TypedArray typedArrayObtainStyledAttributes = dfVar.obtainStyledAttributes(q40.P0(arrayListQ));
        typedArrayObtainStyledAttributes.getClass();
        typedArrayObtainStyledAttributes.recycle();
        dfVar.getTheme().applyStyle(R.style.AppTheme_Amoled_SurfacesOnly, true);
        dfVar.getWindow().setBackgroundDrawable(new ColorDrawable(-16777216));
    }

    public static r23 s(t23 t23Var) {
        Iterator it = fa4.c0(k5.z, t23Var).iterator();
        if (!it.hasNext()) {
            kf2.m("Sequence is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return (r23) next;
    }

    public static final ne0 t(ne0 ne0Var, ne0 ne0Var2, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i2 = 10;
        byte b2 = 0;
        boolean zBooleanValue = ((Boolean) ne0Var.s(new d60(i2, b2), bool)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) ne0Var2.s(new d60(i2, b2), bool)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return ne0Var.J(ne0Var2);
        }
        d60 d60Var = new d60(11, b2);
        q01 q01Var = q01.n;
        ne0 ne0Var3 = (ne0) ne0Var.s(d60Var, q01Var);
        Object objS = ne0Var2;
        if (zBooleanValue2) {
            objS = ne0Var2.s(new d60(12, b2), q01Var);
        }
        return ne0Var3.J((ne0) objS);
    }

    public static int u(byte b2, byte b3, byte b4, byte b5) {
        return (b2 << 24) | ((b3 & 255) << 16) | ((b4 & 255) << 8) | (b5 & 255);
    }

    public static int v(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if ((i2 & (-2097152)) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i8 = c[i6];
        if (i3 == 2) {
            i8 /= 2;
        } else if (i3 == 0) {
            i8 /= 4;
        }
        int i9 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? d[i5 - 1] : e[i5 - 1]) * 12) / i8) + i9) * 4;
        }
        if (i3 == 3) {
            i7 = i4 == 2 ? f[i5 - 1] : g[i5 - 1];
        } else {
            i7 = h[i5 - 1];
        }
        if (i3 == 3) {
            return ((i7 * 144) / i8) + i9;
        }
        return (((i4 == 1 ? 72 : 144) * i7) / i8) + i9;
    }

    public static final Bundle w(String str, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        kf2.n(xa3.h("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
        return null;
    }

    public static int[] x(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i2 = iIndexOf5 + 2;
        if (i2 < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i2) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    public static int y(int[] iArr, int i2, int i3, int i4) {
        while (i3 < i4) {
            if (iArr[i3] == i2) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void z(rv0 rv0Var) {
        if (((cx2) rv0Var).n.A) {
            j51.M(rv0Var, 1).I0();
        }
    }

    public abstract void l();
}
