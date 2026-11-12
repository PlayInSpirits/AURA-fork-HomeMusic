package defpackage;

import android.app.UiModeManager;
import android.content.res.TypedArray;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.util.Log;
import app.homemusic.R;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ly0 {
    public static final int[] a = {R.attr.dynamicColorThemeOverlay};
    public static final Map b;
    public static final Map c;

    static {
        hy0 hy0Var = new hy0();
        iy0 iy0Var = new iy0();
        HashMap map = new HashMap();
        map.put("fcnt", hy0Var);
        map.put("google", hy0Var);
        map.put("hmd global", hy0Var);
        map.put("infinix", hy0Var);
        map.put("infinix mobility limited", hy0Var);
        map.put("itel", hy0Var);
        map.put("kyocera", hy0Var);
        map.put("lenovo", hy0Var);
        map.put("lge", hy0Var);
        map.put("motorola", hy0Var);
        map.put("nothing", hy0Var);
        map.put("oneplus", hy0Var);
        map.put("oppo", hy0Var);
        map.put("realme", hy0Var);
        map.put("robolectric", hy0Var);
        map.put("samsung", iy0Var);
        map.put("sharp", hy0Var);
        map.put("sony", hy0Var);
        map.put("tcl", hy0Var);
        map.put("tecno", hy0Var);
        map.put("tecno mobile limited", hy0Var);
        map.put("vivo", hy0Var);
        map.put("wingtech", hy0Var);
        map.put("xiaomi", hy0Var);
        b = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("asus", hy0Var);
        map2.put("jio", hy0Var);
        c = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x020f A[Catch: Exception -> 0x01c6, TRY_ENTER, TryCatch #4 {Exception -> 0x01c6, blocks: (B:80:0x019c, B:87:0x01c2, B:102:0x01f0, B:120:0x020f, B:121:0x0212), top: B:134:0x019c }] */
    /* JADX WARN: Code duplicated, block: B:145:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    public static void a(df dfVar, qr2 qr2Var) {
        int resourceId;
        FileDescriptor fileDescriptorMemfd_create;
        Locale locale;
        jy0 jy0Var;
        Integer num = (Integer) qr2Var.p;
        Integer num2 = 0;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            return;
        }
        int i2 = gw.a;
        ResourcesLoader resourcesLoader = null;
        if (i < 33) {
            if (i < 32) {
                String str = Build.MANUFACTURER;
                locale = Locale.ROOT;
                jy0Var = (jy0) b.get(str.toLowerCase(locale));
                if (jy0Var == null) {
                    jy0Var = (jy0) c.get(Build.BRAND.toLowerCase(locale));
                }
                if (jy0Var != null) {
                    return;
                } else {
                    return;
                }
            }
            String str2 = Build.VERSION.CODENAME;
            str2.getClass();
            if ("REL".equals(str2)) {
                String str3 = Build.MANUFACTURER;
                locale = Locale.ROOT;
                jy0Var = (jy0) b.get(str3.toLowerCase(locale));
                if (jy0Var == null) {
                    jy0Var = (jy0) c.get(Build.BRAND.toLowerCase(locale));
                }
                if (jy0Var != null || !jy0Var.a()) {
                    return;
                }
            } else {
                Locale locale2 = Locale.ROOT;
                String upperCase = str2.toUpperCase(locale2);
                upperCase.getClass();
                Integer num3 = upperCase.equals("BAKLAVA") ? num2 : null;
                String upperCase2 = "Tiramisu".toUpperCase(locale2);
                upperCase2.getClass();
                num2 = upperCase2.equals("BAKLAVA") ? 0 : null;
                if (num3 == null || num2 == null) {
                    if (num3 == null && num2 == null) {
                        String upperCase3 = str2.toUpperCase(locale2);
                        upperCase3.getClass();
                        String upperCase4 = "Tiramisu".toUpperCase(locale2);
                        upperCase4.getClass();
                        if (upperCase3.compareTo(upperCase4) < 0) {
                            String str4 = Build.MANUFACTURER;
                            locale = Locale.ROOT;
                            jy0Var = (jy0) b.get(str4.toLowerCase(locale));
                            if (jy0Var == null) {
                                jy0Var = (jy0) c.get(Build.BRAND.toLowerCase(locale));
                            }
                            if (jy0Var != null) {
                                return;
                            } else {
                                return;
                            }
                        }
                    } else if (num3 == null) {
                        String str5 = Build.MANUFACTURER;
                        locale = Locale.ROOT;
                        jy0Var = (jy0) b.get(str5.toLowerCase(locale));
                        if (jy0Var == null) {
                            jy0Var = (jy0) c.get(Build.BRAND.toLowerCase(locale));
                        }
                        if (jy0Var != null) {
                            return;
                        } else {
                            return;
                        }
                    }
                } else if (num3.intValue() < num2.intValue()) {
                    String str6 = Build.MANUFACTURER;
                    locale = Locale.ROOT;
                    jy0Var = (jy0) b.get(str6.toLowerCase(locale));
                    if (jy0Var == null) {
                        jy0Var = (jy0) c.get(Build.BRAND.toLowerCase(locale));
                    }
                    if (jy0Var != null) {
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (num == null) {
            TypedArray typedArrayObtainStyledAttributes = dfVar.obtainStyledAttributes(a);
            resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            resourceId = 0;
        }
        ((ky0) qr2Var.o).G(dfVar);
        if (num == null) {
            q05.c(dfVar, resourceId);
            return;
        }
        ol1 ol1Var = new ol1(num.intValue());
        boolean z = !zz1.E(dfVar, R.attr.isLightTheme, true);
        UiModeManager uiModeManager = (UiModeManager) dfVar.getSystemService("uimode");
        d64 d64Var = new d64(ol1Var, z, (uiModeManager == null || i < 34) ? 0.0f : uiModeManager.getContrast());
        hh3 hh3Var = h14.a;
        if ((30 > i || i > 33) && i < 34) {
            hh3Var = null;
        }
        if (hh3Var == null) {
            return;
        }
        Map map = uh2.a;
        HashMap map2 = new HashMap();
        for (Map.Entry entry : uh2.a.entrySet()) {
            Integer num4 = (Integer) entry.getKey();
            gy0 gy0Var = (gy0) entry.getValue();
            HashMap map3 = gy0Var.i;
            ol1 ol1VarA = (ol1) map3.get(d64Var);
            if (ol1VarA == null) {
                ol1VarA = ol1.a(((Double) gy0Var.a.apply(d64Var)).doubleValue(), ((Double) gy0Var.b.apply(d64Var)).doubleValue(), gy0Var.d(d64Var));
                if (map3.size() > 4) {
                    map3.clear();
                }
                map3.put(d64Var, ol1VarA);
            }
            int i3 = ol1VarA.d;
            Function function = gy0Var.d;
            if (function != null) {
                int iRound = (int) Math.round(((Double) function.apply(d64Var)).doubleValue() * 255.0d);
                if (iRound < 0) {
                    iRound = 0;
                } else if (iRound > 255) {
                    iRound = 255;
                }
                i3 = (i3 & 16777215) | (iRound << 24);
            }
            map2.put(num4, Integer.valueOf(i3));
        }
        try {
            byte[] bArrM = g12.m(dfVar, Collections.unmodifiableMap(map2));
            Log.i("ColorResLoaderCreator", "Table created, length: " + bArrM.length);
            if (bArrM.length != 0) {
                try {
                    fileDescriptorMemfd_create = Os.memfd_create("temp.arsc", 0);
                    try {
                        if (fileDescriptorMemfd_create == null) {
                            Log.w("ColorResLoaderCreator", "Cannot create memory file descriptor.");
                            if (fileDescriptorMemfd_create != null) {
                                Os.close(fileDescriptorMemfd_create);
                            }
                        } else {
                            FileOutputStream fileOutputStream = new FileOutputStream(fileDescriptorMemfd_create);
                            try {
                                fileOutputStream.write(bArrM);
                                ParcelFileDescriptor parcelFileDescriptorDup = ParcelFileDescriptor.dup(fileDescriptorMemfd_create);
                                try {
                                    l3.s();
                                    ResourcesLoader resourcesLoaderE = l3.e();
                                    resourcesLoaderE.addProvider(ResourcesProvider.loadFromTable(parcelFileDescriptorDup, null));
                                    if (parcelFileDescriptorDup != null) {
                                        parcelFileDescriptorDup.close();
                                    }
                                    fileOutputStream.close();
                                    Os.close(fileDescriptorMemfd_create);
                                    resourcesLoader = resourcesLoaderE;
                                } catch (Throwable th) {
                                    if (parcelFileDescriptorDup == null) {
                                        throw th;
                                    }
                                    try {
                                        parcelFileDescriptorDup.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                    th = th;
                                    if (fileDescriptorMemfd_create != null) {
                                        Os.close(fileDescriptorMemfd_create);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                try {
                                    fileOutputStream.close();
                                    throw th3;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        if (fileDescriptorMemfd_create != null) {
                            Os.close(fileDescriptorMemfd_create);
                        }
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    fileDescriptorMemfd_create = null;
                }
            }
        } catch (Exception e) {
            Log.e("ColorResLoaderCreator", "Failed to create the ColorResourcesTableCreator.", e);
        }
        if (resourcesLoader != null) {
            dfVar.getResources().addLoaders(resourcesLoader);
            q05.c(dfVar, R.style.ThemeOverlay_Material3_PersonalizedColors);
        }
    }
}
